package com.rs.game.player;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.rs.Settings;
import com.rs.game.ColorChange;
import com.rs.game.SecondaryBar;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.io.OutputStream;
import com.rs.utils.Utils;

public final class LocalNPCUpdate {

	private Player player;
	private LinkedList<NPC> localNPCs;

	public void reset() {
		localNPCs.clear();
	}

	public LocalNPCUpdate(Player player) {
		this.player = player;
		localNPCs = new LinkedList<NPC>();
	}

	public OutputStream createPacketAndProcess() {
		boolean largeSceneView = player.hasLargeSceneView();
		OutputStream stream = new OutputStream();
		OutputStream updateBlockData = new OutputStream();
		stream.writePacketVarShort(player, largeSceneView ? 95 : 77);
		processLocalNPCsInform(stream, updateBlockData, largeSceneView);
		stream.writeBytes(updateBlockData.getBuffer(), 0, updateBlockData.getOffset());
		stream.endPacketVarShort();
		return stream;
	}

	private void processLocalNPCsInform(OutputStream stream, OutputStream updateBlockData, boolean largeSceneView) {
		stream.initBitAccess();
		processInScreenNPCs(stream, updateBlockData, largeSceneView);
		addInScreenNPCs(stream, updateBlockData, largeSceneView);
		if (updateBlockData.getOffset() > 0)
			stream.writeBits(15, 32767);
		stream.finishBitAccess();
	}

	private void processInScreenNPCs(OutputStream stream, OutputStream updateBlockData, boolean largeSceneView) {
		stream.writeBits(8, localNPCs.size());
		// for (NPC n : localNPCs.toArray(new NPC[localNPCs.size()])) {
		for (Iterator<NPC> it = localNPCs.iterator(); it.hasNext();) {
			NPC n = it.next();
			if (n.hasFinished() || !n.withinDistance(player, largeSceneView ? 126 : 14) || n.hasTeleported()) {
				stream.writeBits(1, 1);
				stream.writeBits(2, 3);
				it.remove();
				continue;
			}
			boolean needUpdate = n.needMasksUpdate();
			boolean walkUpdate = n.getNextWalkDirection() != -1;
			stream.writeBits(1, (needUpdate || walkUpdate) ? 1 : 0);
			if (walkUpdate) {
				stream.writeBits(2, n.getNextRunDirection() == -1 ? 1 : 2);
				if (n.getNextRunDirection() != -1)
					stream.writeBits(1, 1);
				stream.writeBits(3, Utils.getNpcMoveDirection(n.getNextWalkDirection()));
				if (n.getNextRunDirection() != -1)
					stream.writeBits(3, Utils.getNpcMoveDirection(n.getNextRunDirection()));
				stream.writeBits(1, needUpdate ? 1 : 0);
			} else if (needUpdate)
				stream.writeBits(2, 0);
			if (needUpdate)
				appendUpdateBlock(n, updateBlockData, false);
		}
	}

	private void addInScreenNPCs(OutputStream stream, OutputStream updateBlockData, boolean largeSceneView) {
		for (int regionId : player.getMapRegionsIds()) {
			List<Integer> indexes = World.getRegion(regionId).getNPCsIndexes();
			if (indexes == null)
				continue;
			for (int npcIndex : indexes) {
				if (localNPCs.size() == Settings.LOCAL_NPCS_LIMIT)
					break;
				NPC n = World.getNPCs().get(npcIndex);
				if (n == null || n.hasFinished() || localNPCs.contains(n) || !n.withinDistance(player, largeSceneView ? 126 : 14) || n.isDead())
					continue;
				stream.writeBits(15, n.getIndex());
				boolean needUpdate = n.needMasksUpdate() || n.getLastFaceEntity() != -1 || n.getCustomCombatLevel() >= 0 || n.getCustomName() != null;
				int x = n.getX() - player.getX();
				int y = n.getY() - player.getY();
				if (largeSceneView) {
					if (x < 127)
						x += 256;
					if (y < 127)
						y += 256;
				} else {
					if (x < 15)
						x += 32;
					if (y < 15)
						y += 32;
				}
				stream.writeBits(1, n.hasTeleported() ? 1 : 0);
				stream.writeBits(2, n.getPlane());
				stream.writeBits(1, needUpdate ? 1 : 0);
				stream.writeBits(largeSceneView ? 8 : 5, y);
				stream.writeBits(largeSceneView ? 8 : 5, x);
				stream.writeBits(3, (n.getDirection() >> 11) - 4);
				stream.writeBits(14, n.getId());

				localNPCs.add(n);
				if (needUpdate)
					appendUpdateBlock(n, updateBlockData, true);
			}
		}
	}

	private void appendUpdateBlock(NPC n, OutputStream data, boolean added) {
		int maskData = 0;

		// ordinal 1 ??? another animation mask?

		if (n.getNextTransformation() != null) { // ordinal 2
			maskData |= 0x10;
		}

		if (n.getNextHit2() != null) { // ordinal 3
			maskData |= 0x2;
		}

		if (n.getNextFaceWorldTile() != null && n.getNextRunDirection() == -1 && n.getNextWalkDirection() == -1) { // ordinal 4
			maskData |= 0x400;
		}

		// force movement ordinal 5

		if (n.getNextGraphics2() != null) { // ordinal 6
			maskData |= 0x800;
		}

		if (n.getNextAnimation() != null) { // ordinal 7
			maskData |= 0x4;
		}

		if (n.getNextColorChange() != null) { // ordinal 8
			maskData |= 0x2000;
		}

		if (n.getNextGraphics1() != null) { // ordinal 9
			maskData |= 0x1;
		}

		if (n.getNextSecondaryBar() != null) { // ordinal 10
			maskData |= 0x200;
		}

		if (n.getNextFaceEntity() != -2 || (added && n.getLastFaceEntity() != -1)) { // ordinal 11
			maskData |= 0x8;
		}

		if (n.getNextForceTalk() != null) { // ordinal 12
			maskData |= 0x80;
		}

		if (n.getNextHit1() != null) { // 13 last
			maskData |= 0x20;
		}

		if (maskData > 128)
			maskData |= 0x40;
		data.writeByte(maskData);
		if (maskData > 128)
			data.writeByte(maskData >> 8);

		if (n.getNextTransformation() != null) {
			applyTransformationMask(n, data);
		}

		if (n.getNextHit2() != null) {
			applyHitMask(n, data, true);
		}

		if (n.getNextFaceWorldTile() != null && n.getNextRunDirection() == -1 && n.getNextWalkDirection() == -1) {
			applyFaceWorldTileMask(n, data);
		}

		if (n.getNextGraphics2() != null) {
			applyGraphicsMask2(n, data);
		}

		if (n.getNextAnimation() != null) {
			applyAnimationMask(n, data);
		}

		if (n.getNextColorChange() != null) {
			applyColorChangeMask(n, data);
		}

		if (n.getNextGraphics1() != null) {
			applyGraphicsMask1(n, data);
		}

		if (n.getNextSecondaryBar() != null) {
			applySecondaryBar(n, data);
		}

		if (n.getNextFaceEntity() != -2 || (added && n.getLastFaceEntity() != -1)) {
			applyFaceEntityMask(n, data);
		}

		if (n.getNextForceTalk() != null) {
			applyForceTalkMask(n, data);
		}

		if (n.getNextHit1() != null) {
			applyHitMask(n, data, false);
		}

		/*
		 * // ordinal 1: 0x1
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // ordinal 4: 0x100
		 * 
		 * 
		 * TODO forcemovement npc if (n.getNextForceMovement() != null) { // ordinal 6 maskData |= 0x1000; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // ordinal 1: 0x1
		 * 
		 * 
		 * 
		 * // ordinal 4: 0x100
		 * 
		 * 
		 * 
		 * if (n.getNextForceMovement() != null) { // ordinal 6 applyForceMovementMask(n, data); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * /
		 */

	}

	private void applyColorChangeMask(NPC n, OutputStream data) {
		ColorChange color = n.getNextColorChange();
		data.writeByte128(color.getChangedColors()[1]);
		data.writeByte128(color.getChangedColors()[2]);
		data.writeByte128(color.getChangedColors()[3]);
		data.writeByteC(color.getChangedColors()[0]);
		data.writeShortLE128(color.getColorDelay());
		data.writeShort(color.getColorDelay() + color.getColorDuration());
	}

	private void applySecondaryBar(NPC n, OutputStream data) {
		SecondaryBar bar = n.getNextSecondaryBar();
		boolean permanant = bar.isPermenant();
		int unknownV = bar.getTotalUnits();
		data.writeShortLE128((permanant ? 8000 : 0) | (unknownV & 0x7fff));
		data.writeByte128(bar.getBeginningOffset());
		data.writeByte(bar.getIncrementalUnits());
	}

	private void applyTransformationMask(NPC n, OutputStream data) {
		data.writeShort(n.getNextTransformation().getToNPCId());
	}

	private void applyForceTalkMask(NPC n, OutputStream data) {
		data.writeString(n.getNextForceTalk().getText());
	}

	@SuppressWarnings("unused")
	private void applyForceMovementMask(NPC n, OutputStream data) {
		data.writeByteC(n.getNextForceMovement().getToFirstTile().getX() - n.getX());
		data.write128Byte(n.getNextForceMovement().getToFirstTile().getY() - n.getY());
		data.writeByte(n.getNextForceMovement().getToSecondTile() == null ? 0 : n.getNextForceMovement().getToSecondTile().getX() - n.getX());
		data.writeByteC(n.getNextForceMovement().getToSecondTile() == null ? 0 : n.getNextForceMovement().getToSecondTile().getY() - n.getY());
		data.writeShort((n.getNextForceMovement().getFirstTileTicketDelay() * 600) / 20);
		data.writeShort128(n.getNextForceMovement().getToSecondTile() == null ? 0 : ((n.getNextForceMovement().getSecondTileTicketDelay() * 600) / 20));
		data.writeByteC(n.getNextForceMovement().getDirection());
	}

	private void applyFaceWorldTileMask(NPC n, OutputStream data) {
		data.writeShort128((n.getNextFaceWorldTile().getX() * 2) + n.getNextFaceWorldTile().getSizeX());
		data.writeShortLE((n.getNextFaceWorldTile().getY() * 2) + n.getNextFaceWorldTile().getSizeY());
	}

	private void applyHitMask(NPC n, OutputStream data, boolean secondary) {
		if (secondary) {
			data.writeSmart(n.getNextHit2().getDamage());
			data.writeByte128(n.getNextHit2().getMark());
		} else {
			data.writeSmart(n.getNextHit1().getDamage());
			data.writeByte128(n.getNextHit1().getMark());
			int amtHP = n.getHitpoints();
			int maxHP = n.getMaxHitpoints();
			if (amtHP > maxHP)
				amtHP = maxHP;
			data.writeByte128(amtHP * 255 / maxHP);
		}
	}

	private void applyFaceEntityMask(NPC n, OutputStream data) {
		data.writeShort128(n.getNextFaceEntity() == -2 ? n.getLastFaceEntity() : n.getNextFaceEntity());
	}

	private void applyAnimationMask(NPC n, OutputStream data) {
		data.writeShortLE(n.getNextAnimation().getIds()[0]);
		data.write128Byte(n.getNextAnimation().getSpeed());
	}

	private void applyGraphicsMask2(NPC n, OutputStream data) {
		data.writeShort(n.getNextGraphics2().getId());
		data.writeIntV1(n.getNextGraphics2().getSettingsHash());
		data.write128Byte(n.getNextGraphics2().getSettings2Hash());
	}

	private void applyGraphicsMask1(NPC n, OutputStream data) {
		data.writeShort128(n.getNextGraphics1().getId());
		data.writeIntV2(n.getNextGraphics1().getSettingsHash());
		data.write128Byte(n.getNextGraphics1().getSettings2Hash());
	}

}
