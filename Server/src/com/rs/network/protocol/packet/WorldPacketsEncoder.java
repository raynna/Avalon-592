package com.rs.network.protocol.packet;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.DynamicRegion;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.item.ItemsContainerNew;
import com.rs.game.npc.NPC;
import com.rs.game.player.*;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.io.OutputStream;
import com.rs.utils.MapArchiveKeys;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

import java.util.concurrent.ConcurrentHashMap;

public class WorldPacketsEncoder {

	private Player player;

	public WorldPacketsEncoder(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	private int packetsCount;

	// CONVERTED TO 592

	/*
	 * normal map region
	 */
	public void sendGameScene(boolean sendLswp) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 13);
		if (sendLswp) {
			player.getLocalPlayerUpdate().init(stream);
		}
		stream.write128Byte(player.getMapSize());
		stream.writeShort128(player.getChunkX());
		stream.writeShortLE128(player.getChunkY());
		stream.writeByte128(player.isForceNextMapLoadRefresh() ? 1 : 0);

		for (int regionId : player.getMapRegionsIds()) {
			int[] xteas = MapArchiveKeys.getMapKeys(regionId);
			if (xteas == null) {
				xteas = new int[4];
			}
			for (int index = 0; index < 4; index++) {
				stream.writeInt(xteas[index]);
			}

		}
		stream.endPacketVarShort();
		player.write(stream);

	}

	/*
	 * sets the pane interface
	 */
	public void sendRootInterface(int id, int type) {
		player.getInterfaceManager().setWindowsPane(id);
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 102);
		stream.writeByte(type);
		stream.writeShortLE(packetsCount++);
		stream.writeShortLE(id);
		player.write(stream);
	}

	public void sendInterface(boolean clickThrought, int parentUID, int interfaceId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 22);
		stream.write128Byte(clickThrought ? 1 : 0);
		stream.writeShort128(packetsCount++);
		stream.writeInt(parentUID);
		stream.writeShortLE(interfaceId);
		player.write(stream);
	}

	private final ConcurrentHashMap<Integer, int[]> openedinterfaces = new ConcurrentHashMap<Integer, int[]>();

	public boolean addInterface(int windowId, int tabId, int childId) {
		if (openedinterfaces.containsKey(tabId))
			player.getPackets().closeInterface(tabId);
		openedinterfaces.put(tabId, new int[] { childId, windowId });
		return openedinterfaces.get(tabId)[0] == childId;
	}

	private int windowsPane;

	public void setWindowsPane(int windowsPane) {
		this.windowsPane = windowsPane;
	}

	public boolean containsInterface(int tabId, int childId) {
		if (childId == windowsPane)
			return true;
		if (!openedinterfaces.containsKey(tabId))
			return false;
		return openedinterfaces.get(tabId)[0] == childId;
	}

	public void sendMusic(int id) {
		sendMusic(id, 100, 255);
	}

	public void sendMusic(int id, int delay, int volume) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 63);
		stream.writeByte128(volume);
		stream.writeByte(delay);
		stream.writeShort128(id);
		player.write(stream);
	}

	public void sendLogout() {
		// Highscores.highscores(player, null);
		OutputStream stream = new OutputStream();
		stream.writePacket(player, 33);
		player.write(stream);

		if (!player.hasFinished())
			player.getSession().close();
	}

	public void sendRunEnergy() {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 18);
		stream.writeByte(player.getRunEnergy());
		player.write(stream);
	}

	public void sendSkillLevel(int skill) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 9);
		stream.writeIntLE((int) player.getSkills().getXp(skill));
		stream.writeByte128(skill);
		stream.write128Byte((byte) player.getSkills().getLevel(skill));
		player.write(stream);
	}

	public void closeInterface(int parentUID) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 44);
		stream.writeShort(packetsCount++);
		stream.writeInt(parentUID);
		player.write(stream);

	}


	public void sendMessage(int type, String text, Player p) {
		int maskData = 0;
		if (p != null) {
			maskData |= 0x1;
			if (p.hasDisplayName())
				maskData |= 0x2;
		}
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 26);
		stream.writeSmart(type);
		stream.writeInt(player.getTileHash()); // junk, not used by client
		stream.writeByte(maskData);
		if ((maskData & 0x1) != 0) {
			stream.writeString(Utils.formatPlayerNameForDisplay(p.getUsername()));
			if (p.hasDisplayName())
				stream.writeString(p.getDisplayName());
		}
		stream.writeString(text);
		stream.endPacketVarByte();
		player.write(stream);
	}

	public void sendMinimapFlag(int x, int y) {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 84);
		stream.writeByte(x);
		stream.writeByteC(y);
		player.write(stream);
	}

	public void sendResetMinimapFlag() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 84);
		stream.writeByte(255);
		stream.writeByteC(255);
		player.write(stream);
	}

	public void sendIComponentText(int interfaceId, int componentId, String text) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 1);
		stream.writeString(text);
		stream.writeShort(packetsCount++);
		stream.writeIntV2(interfaceId << 16 | componentId);
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendHideIComponent(int interfaceId, int componentId, boolean hidden) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 41);
		stream.writeByte128(hidden ? 1 : 0);
		stream.writeIntV2(interfaceId << 16 | componentId);
		stream.writeShort128(packetsCount++);
		player.write(stream);

	}

	@Deprecated
	public void sendVar(int id, int value) {
		if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE)
			sendVar2(id, value);
		else
			sendVar1(id, value);
	}

	@Deprecated
	public void sendVarBit(int id, int value) {
		if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE)
			sendVarBit2(id, value);
		else
			sendVarBit1(id, value);
	}

	public void sendVar1(int id, int value) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 40);
		stream.writeShort(id);
		stream.writeByteC(value);
		player.write(stream);
	}

	public void sendVar2(int id, int value) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 79);
		stream.writeIntV1(value);
		stream.writeShortLE(id);
		player.write(stream);
	}

	public void sendVarBit1(int id, int value) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 14);
		stream.writeShort(id);
		stream.writeByte(value);
		player.write(stream);
	}

	public void sendVarBit2(int id, int value) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 85);
		stream.writeShortLE128(id);
		stream.writeIntLE(value);
		player.write(stream);
	}

	public void sendInterFlashScript(int interfaceId, int componentId, int width, int height, int slot) {
		Object[] parameters = new Object[4];
		int index = 0;
		parameters[index++] = slot;
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		sendRunScript(143, parameters);
	}

	public void sendInterSetItemsOptionsScript(int interfaceId, int componentId, int key, int width, int height, String... options) {
		sendInterSetItemsOptionsScript(interfaceId, componentId, key, false, width, height, options);
	}

	public void sendInterSetItemsOptionsScript(int interfaceId, int componentId, int key, boolean negativeKey, int width, int height, String... options) {
		Object[] parameters = new Object[6 + options.length];
		int index = 0;
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		parameters[index++] = -1; // dunno but always this
		parameters[index++] = 0;// dunno but always this, maybe startslot?
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = key;
		parameters[index++] = interfaceId << 16 | componentId;
		sendRunScript(negativeKey ? 695 : 150, parameters); // scriptid 150 does
		// that the method
		// name says*/
	}

	public void sendPouchInfusionOptionsScript(int interfaceId, int componentId, int slotLength, int width, int height, String... options) {
		Object[] parameters = new Object[5 + options.length];
		int index = 0;
		parameters[index++] = slotLength;
		parameters[index++] = 1; // dunno
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		sendRunScript(757, parameters);
	}

	public void sendScrollInfusionOptionsScript(int interfaceId, int componentId, int slotLength, int width, int height, String... options) {
		Object[] parameters = new Object[5 + options.length];
		int index = 0;
		parameters[index++] = slotLength;
		parameters[index++] = 1; // dunno are u sure it contains this 1? yeah
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		sendRunScript(763, parameters);
	}

	public void sendInputNameScript(String message) {
		sendRunScript(109, new Object[] { message });
	}

	public void sendInputIntegerScript(String message) {
		sendRunScript(108, new Object[] { message });
	}

	public void sendInputLongTextScript(String message) {
		sendRunScript(110, new Object[] { message });
	}

	public void sendRunScriptBlank(int scriptId) {
		sendRunScript(scriptId, new Object[] {});
	}

	public void sendRunScript(int scriptId, Object... params) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 27);
		stream.writeShort(packetsCount++);
		String parameterTypes = "";
		if (params != null) {
			for (int count = params.length - 1; count >= 0; count--) {
				if (params[count] instanceof String)
					parameterTypes += "s"; // string
				else
					parameterTypes += "i"; // integer
			}
		}
		stream.writeString(parameterTypes);
		if (params != null) {
			int index = 0;
			for (int count = parameterTypes.length() - 1; count >= 0; count--) {
				if (parameterTypes.charAt(count) == 's')
					stream.writeString((String) params[index++]);
				else
					stream.writeInt((Integer) params[index++]);
			}
		}
		stream.writeInt(scriptId);
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendUpdateItems(int key, ItemsContainer<Item> items, int... slots) {
		sendUpdateItems(key, items.getItems(), slots);
	}

	public void sendUpdateItems(int key, Item[] items, int... slots) {
		sendUpdateItems(key, key < 0, items, slots);
	}

	public void sendUpdateItems(int key, boolean negativeKey, Item[] items, int... slots) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 32);
		stream.writeShort(key);
		stream.writeByte(negativeKey ? 1 : 0);
		for (int slotId : slots) {
			if (slotId >= items.length)
				continue;
			stream.writeSmart(slotId);
			int id = -1;
			int amount = 0;
			Item item = items[slotId];
			if (item != null) {
				id = item.getId();
				amount = item.getAmount();
			}
			stream.writeShort(id + 1);
			if (id != -1) {
				stream.writeByte(amount >= 255 ? 255 : amount);
				if (amount >= 255)
					stream.writeInt(amount);
			}
		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendItemsContainer(int key, ItemsContainerNew container) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 11);
		stream.writeShort(key);
		stream.writeByte(key < 0 ? 1 : 0);
		stream.writeShort(container.getSize());
		for (int i = 0; i < container.getSize(); i++) {
			int id = -1;
			int amount = 0;
			Item item = container.get(i);
			if (item != null) {
				id = item.getId();
				amount = item.getAmount();
			}

			stream.write128Byte(amount >= 255 ? 255 : amount);
			if (amount >= 255)
				stream.writeIntLE(amount);
			stream.writeShort(id + 1);
		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendItems(int key, ItemsContainer<Item> items) {
		sendItems(key, key < 0, items);
	}

	public void sendItems(int key, boolean negativeKey, ItemsContainer<Item> items) {
		sendItems(key, negativeKey, items.getItems());
	}

	public void sendItems(int key, Item[] items) {
		sendItems(key, key < 0, items);
	}

	public void sendItems(int key, boolean negativeKey, Item[] items) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 11);
		stream.writeShort(key); // negativeKey ? -key : key
		stream.writeByte(negativeKey ? 1 : 0);
		stream.writeShort(items.length);
		for (int index = 0; index < items.length; index++) {
			Item item = items[index];
			int id = -1;
			int amount = 0;
			if (item != null) {
				id = item.getId();
				amount = item.getAmount();
			}
			stream.write128Byte(amount >= 255 ? 255 : amount);
			if (amount >= 255)
				stream.writeIntLE(amount);
			stream.writeShort(id + 1);

		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendMusicEffect(int id) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 21);
		stream.write24BitInteger(0);
		stream.writeShortLE128(id);
		stream.writeByte(255);
		player.write(stream);
	}

	// effect type 1 or 2(index4 or index14 format, index15 format unusused by
	// jagex for now)
	public void sendSound(int id, int delay, int effectType) {
		if (effectType == 1)
			sendIndex14Sound(id, delay);
		else if (effectType == 2)
			sendIndex15Sound(id, delay);
	}

	public void sendIndex15Sound(int soundId, int delay) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 100);
		stream.writeShort(soundId);
		stream.writeByte(1);
		stream.writeShort(delay);
		stream.writeByte(255);
		player.write(stream);

	}

	public void sendIndex14Sound(int id, int delay) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 19);
		stream.writeShort(id);
		stream.writeByte(1);
		stream.writeShort(delay);
		stream.writeByte(255);
		player.write(stream);
	}

	public void sendIComponentSettings(int interfaceId, int componentId, int fromSlot, int toSlot, int settingsHash) {
		OutputStream stream = new OutputStream();
		stream.writePacket(player, 75);
		stream.writeShortLE128(fromSlot);
		stream.writeIntV2(settingsHash);
		stream.writeShort(packetsCount++);
		stream.writeInt(interfaceId << 16 | componentId);
		stream.writeShortLE(toSlot);
		player.write(stream);
	}

	public void sendUnlockIComponentOptionSlots(int interfaceId, int componentId, int fromSlot, int toSlot, int... optionsSlots) {
		int settingsHash = 0;
		for (int slot : optionsSlots)
			settingsHash |= 2 << slot;
		sendIComponentSettings(interfaceId, componentId, fromSlot, toSlot, settingsHash);
	}

	public void sendUnlockIComponentOptionSlots(int interfaceId, int componentId, int fromSlot, int toSlot, boolean unlockEvent, int... optionsSlots) {
		int settingsHash = unlockEvent ? 1 : 0;
		for (int slot : optionsSlots)
			settingsHash |= 2 << slot;
		sendIComponentSettings(interfaceId, componentId, fromSlot, toSlot, settingsHash);
	}

	public void sendGlobalConfig(int id, int value) {
		if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE)
			sendGlobalConfig2(id, value);
		else
			sendGlobalConfig1(id, value);
	}

	public void sendGlobalConfig1(int id, int value) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 12);
		stream.writeShortLE128(packetsCount++);
		stream.writeShort(id);
		stream.write128Byte(value);
		player.write(stream);
	}

	public void sendGlobalConfig2(int id, int value) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 52);
		stream.writeShort128(packetsCount++);
		stream.writeShortLE(id);
		stream.writeIntLE(value);
		player.write(stream);
	}

	/*
	 * sends local players update
	 */
	public void sendLocalPlayersUpdate() {
		player.write(player.getLocalPlayerUpdate().createPacketAndProcess());
	}

	// ****************************************************************

	/*
	 * sends local npcs update
	 */
	public void sendLocalNPCsUpdate() {
		player.write(player.getLocalNPCUpdate().createPacketAndProcess());

	}

	public OutputStream createWorldTileStream(WorldTile tile) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 28);
		stream.write128Byte(tile.getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize()) >> 3);
		stream.writeByte(tile.getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize()) >> 3);
		stream.writeByteC(tile.getPlane());
		return stream;
	}

	public void sendGroundItem(FloorItem item) {
		OutputStream stream = createWorldTileStream(item.getTile());
		int localX = item.getTile().getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int localY = item.getTile().getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int offsetX = localX - ((localX >> 3) << 3);
		int offsetY = localY - ((localY >> 3) << 3);
		stream.writePacket(player, 68);
		stream.writeShortLE(item.getAmount());
		stream.writeShort128(item.getId());
		stream.writeByte((offsetX << 4) | offsetY);
		player.write(stream);
	}

	public void sendRemoveGroundItem(FloorItem item) {
		OutputStream stream = createWorldTileStream(item.getTile());
		int localX = item.getTile().getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int localY = item.getTile().getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int offsetX = localX - ((localX >> 3) << 3);
		int offsetY = localY - ((localY >> 3) << 3);
		stream.writePacket(player, 43);
		stream.writeShortLE128(item.getId());
		stream.writeByteC((offsetX << 4) | offsetY);
		player.write(stream);
	}

	public void sendGraphics(Graphics graphics, Object target) {
		OutputStream stream = new OutputStream(13);
		int hash = 0;
		if (target instanceof Player) {
			Player p = (Player) target;
			hash = p.getIndex() & 0xffff | 1 << 28;
		} else if (target instanceof NPC) {
			NPC n = (NPC) target;
			hash = n.getIndex() & 0xffff | 1 << 29;
		} else {
			WorldTile tile = (WorldTile) target;
			hash = tile.getPlane() << 28 | tile.getX() << 14 | tile.getY() & 0x3fff | 1 << 30;
		}
		stream.writePacket(player, 61);
		stream.writeShort(graphics.getId());
		stream.writeShort(graphics.getSpeed());
		stream.writeShort(graphics.getHeight());
		stream.writeByte(graphics.getSettings2Hash());
		stream.writeIntV1(hash);
		// //player.write(stream);
	}

	@Deprecated
	public void sendProjectile(Entity receiver, WorldTile startTile, WorldTile endTile, int gfxId, int startHeight, int endHeight, int speed, int delay, int curve, int startDistanceOffset, int creatorSize) {
		/*
		 * fuck the idiot who made this refactoring OutputStream stream = createWorldTileStream(startTile);
		 * stream.writePacket(player, 20); int localX = startTile.getLocalX(player.getLastLoadedMapRegionTile(),
		 * player.getMapSize()); int localY = startTile.getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize()); int
		 * offsetX = localX - ((localX >> 3) << 3); int offsetY = localY - ((localY >> 3) << 3); stream.writeByte((offsetX << 3) |
		 * offsetY); stream.writeByte(endTile.getX() - startTile.getX()); stream.writeByte(endTile.getY() - startTile.getY());
		 * stream.writeShort(receiver == null ? 0 : (receiver instanceof Player ? -(receiver.getIndex() + 1) : receiver.getIndex() +
		 * 1)); stream.writeShort(gfxId); stream.writeByte(startHeight); stream.writeByte(endHeight); stream.writeShort(delay); int
		 * duration = (Utils.getDistance(startTile.getX(), startTile.getY(), endTile.getX(), endTile.getY()) * 30 / ((speed / 10) < 1
		 * ? 1 : (speed / 10))) + delay; stream.writeShort(duration); stream.writeByte(curve); stream.writeShort(creatorSize * 64 +
		 * startDistanceOffset * 64); ////////player.write(stream);
		 */

		sendProjectileProper(startTile, creatorSize, creatorSize, endTile, receiver != null ? receiver.getSize() : 1, receiver != null ? receiver.getSize() : 1, receiver, gfxId, startHeight, endHeight, delay, (Utils.getDistance(startTile.getX(), startTile.getY(), endTile.getX(), endTile.getY()) * 30 / ((speed / 10) < 1 ? 1 : (speed / 10))), startDistanceOffset, curve);

	}

	public void sendProjectileProper(WorldTile from, int fromSizeX, int fromSizeY, WorldTile to, int toSizeX, int toSizeY, Entity lockOn, int gfxId, int startHeight, int endHeight, int delay, int speed, int slope, int angle) {
		WorldTile src = new WorldTile(((from.getX() << 1) + fromSizeX) >> 1, ((from.getY() << 1) + fromSizeY) >> 1, from.getPlane());
		WorldTile dst = new WorldTile(((to.getX() << 1) + toSizeX) >> 1, ((to.getY() << 1) + toSizeY) >> 1, to.getPlane());
		OutputStream stream = createWorldTileStream(src);
		stream.writePacket(player, 57);
		stream.writeByte(((src.getX() & 0x7) << 3) | (src.getY() & 0x7));
		stream.writeByte(dst.getX() - src.getX());
		stream.writeByte(dst.getY() - src.getY());
		stream.writeShort(lockOn == null ? 0 : (lockOn instanceof Player ? -(lockOn.getIndex() + 1) : lockOn.getIndex() + 1));
		stream.writeShort(gfxId);
		stream.writeByte(startHeight);
		stream.writeByte(endHeight);
		stream.writeShort(delay);
		stream.writeShort(delay + speed);
		stream.writeByte(angle);
		stream.writeByte(angle);
		player.write(stream);
	}

	public void sendSpawnedObject(WorldObject object) {
		OutputStream stream = createWorldTileStream(object);
		int localX = object.getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int localY = object.getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int offsetX = localX - ((localX >> 3) << 3);
		int offsetY = localY - ((localY >> 3) << 3);
		stream.writePacket(player, 70);
		stream.write128Byte((object.getType() << 2) + (object.getRotation() & 0x3));
		stream.writeShort128(object.getId());
		stream.writeByte128((offsetX << 4) | offsetY);
		player.write(stream);
	}

	public void sendDestroyObject(WorldObject object) {
		OutputStream stream = createWorldTileStream(object);
		int localX = object.getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int localY = object.getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int offsetX = localX - ((localX >> 3) << 3);
		int offsetY = localY - ((localY >> 3) << 3);
		stream.writePacket(player, 45);
		stream.writeByte128((object.getType() << 2) + (object.getRotation() & 0x3));
		stream.write128Byte((offsetX << 4) | offsetY);
		player.write(stream);
	}

	public void sendPlayerOnIComponent(int interfaceId, int componentId) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 24);
		stream.writeIntV2(interfaceId << 16 | componentId);
		stream.writeShort(packetsCount++);
		player.write(stream);
	}

	public void sendNPCOnIComponent(int interfaceId, int componentId, int npcId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 39);
		stream.writeIntLE(interfaceId << 16 | componentId);
		stream.writeShort(packetsCount++);
		stream.writeShort128(npcId);
		player.write(stream);
	}

	public void sendEntityOnIComponent(boolean isPlayer, int entityId, int interfaceId, int componentId) {
		if (isPlayer)
			sendPlayerOnIComponent(interfaceId, componentId);
		else
			sendNPCOnIComponent(interfaceId, componentId, entityId);
	}

	public void sendIComponentAnimation(int emoteId, int interfaceId, int componentId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 86);
		stream.writeShort128(packetsCount++);
		stream.writeShort128(emoteId);
		stream.writeIntV2(interfaceId << 16 | componentId);
		player.write(stream);
	}

	public void sendItemOnIComponent(int interfaceid, int componentId, int id, int amount) {
		OutputStream stream = new OutputStream();
		stream.writePacket(player, 10);
		stream.writeShortLE(packetsCount++);
		stream.writeShort128(id);
		stream.writeInt(amount);
		stream.writeIntV1(interfaceid << 16 | componentId);
		player.write(stream);
	}

	public void sendGlobalString(int id, String string) {
		OutputStream stream = new OutputStream();
		if (string.length() >= 253) {
			stream.writePacketVarByte(player, 54);
			stream.writeShort128(packetsCount++);
			stream.writeString(string);
			stream.writeShort(id);
			stream.endPacketVarByte();
		} else {
			stream.writePacketVarByte(player, 53);
			stream.writeShort128(packetsCount++);
			stream.writeString(string);
			stream.writeShort128(id);
			stream.endPacketVarByte();
		}
		player.write(stream);
	}

	/*
	 * public void sendSpecialString(String string, int childId) { OutputStream out = new OutputStream();
	 * out.writePacketVarByte(0); out.writeShortLE(frameIndex++); out.writeString(string); out.writeShort(childId);
	 * out.endPacketVarByte(); player.getConnectionHandler().write(out); }
	 */

	public void sendCutscene(int id) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 70);
		stream.writeShort(id);
		stream.writeShort(20); // xteas count
		for (int count = 0; count < 20; count++)
			// xteas
			for (int i = 0; i < 4; i++)
				stream.writeInt(0);
		byte[] appearence = player.getAppearence().getAppeareanceData();
		stream.writeByte(appearence.length);
		stream.addBytes128(appearence, 0, appearence.length);
		stream.endPacketVarShort();
		// ////player.write(stream);
	}

	public void sendPlayerOption(String option, int slot, boolean top) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 74);
		stream.write128Byte(slot);
		stream.writeByteC(top ? 1 : 0);
		stream.writeShort128(slot == 1 && top ? 42 : 65535);
		stream.writeString(option);
		stream.endPacketVarByte();
		player.write(stream);
	}

	// CUTSCENE PACKETS START

	/**
	 * This will blackout specified area.
	 * 
	 * @param area which will be blackout (0 = unblackout; 1 = blackout orb; 2 = blackout map; 5 = blackout orb and map)
	 */
	public void sendBlackOut(int area) {
		OutputStream out = new OutputStream(2);
		out.writePacket(player, 38);
		out.writeByte(area);
		player.write(out);
	}

	public void sendPlayerUnderNPCPriority(boolean priority) {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 6);
		stream.writeByteC(priority ? 1 : 0);
		// //////player.write(stream);
	}

	public void sendHintIcon(HintIcon icon) {
		OutputStream stream = new OutputStream(15);
		stream.writePacket(player, 79);
		stream.writeByte((icon.getTargetType() & 0x1f) | (icon.getIndex() << 5));
		if (icon.getTargetType() == 0)
			stream.skip(13);
		else {
			stream.writeByte(icon.getArrowType());
			if (icon.getTargetType() == 1 || icon.getTargetType() == 10) {
				stream.writeShort(icon.getTargetIndex());
				stream.writeShort(2500); // how often the arrow flashes, 2500
				// ideal, 0 never
				stream.skip(4);
			} else if ((icon.getTargetType() >= 2 && icon.getTargetType() <= 6)) { // directions
				stream.writeByte(icon.getPlane()); // unknown
				stream.writeShort(icon.getCoordX());
				stream.writeShort(icon.getCoordY());
				stream.writeByte(icon.getDistanceFromFloor() * 4 >> 2);
				stream.writeShort(-1); // distance to start showing on minimap,
				// 0 doesnt show, -1 infinite
			}
			stream.writeInt(icon.getModelId());
		}
		// //////player.write(stream);

	}

	public void sendCameraShake(int slotId, int a, int b, int c, int d, int e) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 93);
		stream.writeShort(0);
		stream.writeByte(slotId);
		stream.writeByte(a);
		stream.writeByte(b);
		stream.writeByte(c);
		stream.writeShort(d);
		player.write(stream);
	}

	public void sendStopCameraShake() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 93);
		player.write(stream);
	}

	public void sendGrandExchangeOffer(Offer offer) {
		OutputStream stream = new OutputStream(21);
		stream.writePacket(player, 47);
		stream.writeByte(offer.getSlot());
		stream.writeByte(offer.getStage());
		if (offer.forceRemove())
			stream.skip(18);
		else {
			stream.writeShort(offer.getId());
			stream.writeInt(offer.getPrice());
			stream.writeInt(offer.getAmount());
			stream.writeInt(offer.getTotalAmmountSoFar());
			stream.writeInt(offer.getTotalPriceSoFar());
		}
		player.write(stream);
	}

	public void sendObjectAnimation(WorldObject object, Animation animation) {
		OutputStream stream = new OutputStream(10);
		stream.writePacket(player, 76);
		stream.writeInt(animation.getIds()[0]);
		stream.writeByteC((object.getType() << 2) + (object.getRotation() & 0x3));
		stream.writeIntLE(object.getTileHash());
		// //////player.write(stream);
	}

	public void sendTileMessage(String message, WorldTile tile, int color) {
		sendTileMessage(message, tile, 5000, 255, color);
	}

	public void sendTileMessage(String message, WorldTile tile, int delay, int height, int color) {
		OutputStream stream = createWorldTileStream(tile);
		stream.writePacketVarByte(player, 107);
		stream.skip(1);
		int localX = tile.getLocalX(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int localY = tile.getLocalY(player.getLastLoadedMapRegionTile(), player.getMapSize());
		int offsetX = localX - ((localX >> 3) << 3);
		int offsetY = localY - ((localY >> 3) << 3);
		stream.writeByte((offsetX << 4) | offsetY);
		stream.writeShort(delay / 30);
		stream.writeByte(height);
		stream.write24BitInteger(color);
		stream.writeString(message);
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void sendRandomOnIComponent(int interfaceId, int componentId, int id) {
		/*
		 * OutputStream stream = new OutputStream(); stream.writePacket(player, 235); stream.writeShort(id);
		 * stream.writeIntV1(interfaceId << 16 | componentId); stream.writeShort(interPacketsCount++); ////////player.write(stream);
		 */
	}

	public void sendFaceOnIComponent(int interfaceId, int componentId, int look1, int look2, int look3) {
		/*
		 * OutputStream stream = new OutputStream(); stream.writePacket(player, 192); stream.writeIntV2(interfaceId << 16 |
		 * componentId); stream.writeShortLE128(interPacketsCount++); stream.writeShortLE128(look1); stream.writeShortLE128(look2);
		 * stream.writeShort128(look2); ////////player.write(stream);
		 */
	}

	public void sendFriendsChatChannel() {
		FriendChatsManager manager = player.getCurrentFriendChat();
		OutputStream stream = new OutputStream(manager == null ? 3 : manager.getDataBlock().length + 3);
		stream.writePacketVarShort(player, 81);
		if (manager != null)
			stream.writeBytes(manager.getDataBlock());
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendFriends() {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 2);
		for (String username : player.getFriendsIgnores().getFriends()) {
			String displayName;
			Player p2 = World.getPlayerByDisplayName(username);
			if (p2 != null)
				displayName = p2.getDisplayName();
			else
				displayName = Utils.formatPlayerNameForDisplay(username);
			player.getPackets().sendFriend(Utils.formatPlayerNameForDisplay(username), displayName, 1, p2 != null && player.getFriendsIgnores().isOnline(p2), false, stream);
		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendFriend(String username, String displayName, int world, boolean putOnline, boolean warnMessage) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 2);
		sendFriend(username, displayName, world, putOnline, warnMessage, stream);
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendFriend(String username, String displayName, int world, boolean putOnline, boolean warnMessage, OutputStream stream) {
		stream.writeByte(warnMessage ? 0 : 1);
		stream.writeString(displayName);
		stream.writeString(displayName.equals(username) ? "" : username);
		stream.writeShort(putOnline ? world : 0);
		stream.writeByte(player.getFriendsIgnores().getRank(Utils.formatPlayerNameForProtocol(username)));
		if (putOnline) {
			stream.writeString(Settings.SERVER_NAME);
			stream.writeByte(0);
		}
	}

	public void sendIgnores() {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 35);
		stream.writeByte(player.getFriendsIgnores().getIgnores().size());
		for (String username : player.getFriendsIgnores().getIgnores()) {
			String display;
			Player p2 = World.getPlayerByDisplayName(username);
			if (p2 != null)
				display = p2.getDisplayName();
			else
				display = Utils.formatPlayerNameForDisplay(username);
			String name = Utils.formatPlayerNameForDisplay(username);
			stream.writeString(display.equals(name) ? name : display);
			stream.writeString("");
			stream.writeString(display.equals(name) ? "" : name);
			stream.writeString("");
		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendIgnore(String name, String display, boolean updateName) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 25);
		stream.writeByte(0x2);
		stream.writeString(display.equals(name) ? name : display);
		stream.writeString("");
		stream.writeString(display.equals(name) ? "" : name);
		stream.writeString("");
		stream.endPacketVarByte();
		player.write(stream);
	}

	public void sendPrivateMessage(String username, ChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 3);
		stream.writeString(username);
		Huffman.sendEncryptMessage(stream, message.getMessage(player.isFilteringProfanity()));
		stream.endPacketVarByte();
		player.write(stream);
	}

	public void sendGameBarStages() {
		player.getVarsManager().sendVar(1054, player.getClanStatus());
		player.getVarsManager().sendVar(1055, player.getAssistStatus());
		player.getVarsManager().sendVarBit(6161, player.isFilterGame() ? 1 : 0);
		player.getVarsManager().sendVar(2159, player.getFriendsIgnores().getFriendsChatStatus());
		sendOtherGameBarStages();
		sendPrivateGameBarStage();
	}

	public void sendOtherGameBarStages() {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 89);
		stream.write128Byte(player.getTradeStatus());
		stream.writeByte(player.getPublicStatus());
		// //////player.write(stream);
	}

	public void sendPrivateGameBarStage() {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 75);
		stream.writeByte(player.getFriendsIgnores().getPrivateStatus());
		// //////player.write(stream);
	}

	public void receivePrivateMessage(String name, String display, int rights, ChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 46);
		stream.writeByte(name.equals(display) ? 0 : 1);
		stream.writeString(display);
		if (!name.equals(display))
			stream.writeString(name);
		int hash = player.getFriendsIgnores().getNextIgnoredMessageCount();
		int firstHashPart = hash >> 32;
		stream.writeShort(firstHashPart);
		stream.write24BitInteger(hash - (firstHashPart << 32));
		stream.writeByte(rights);
		Huffman.sendEncryptMessage(stream, message.getMessage(player.isFilteringProfanity()));
		stream.endPacketVarByte();
		player.write(stream);
	}

	// 131 clan chat quick message

	public void receivePrivateChatQuickMessage(String name, String display, int rights, QuickChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 104);
		stream.writeByte(name.equals(display) ? 0 : 1);
		stream.writeString(display);
		if (!name.equals(display))
			stream.writeString(name);
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.getRandom(255));
		stream.writeByte(rights);
		stream.writeShort(message.getFileId());
		if (message.getMessage(false) != null)
			stream.writeBytes(message.getMessage(false).getBytes());
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void sendPrivateQuickMessageMessage(String username, QuickChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 30);
		stream.writeString(username);
		stream.writeShort(message.getFileId());
		if (message.getMessage(false) != null)
			stream.writeBytes(message.getMessage(false).getBytes());
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void receiveClanChatMessage(boolean myClan, String display, int rights, ChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 3);
		stream.writeByte(myClan ? 1 : 0);
		stream.writeString(display);
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.getRandom(255));
		stream.writeByte(rights);
		Huffman.sendEncryptMessage(stream, message.getMessage(player.isFilteringProfanity()));
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void receiveClanChatQuickMessage(boolean myClan, String display, int rights, QuickChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 1);
		stream.writeByte(myClan ? 1 : 0);
		stream.writeString(display);
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.getRandom(255));
		stream.writeByte(rights);
		stream.writeShort(message.getFileId());
		if (message.getMessage(false) != null)
			stream.writeBytes(message.getMessage(false).getBytes());
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void receiveFriendChatMessage(String name, String display, int rights, String chatName, ChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 107);
		stream.writeByte(name.equals(display) ? 0 : 1);
		stream.writeString(display);
		if (!name.equals(display))
			stream.writeString(name);
		stream.writeLong(Utils.stringToLong(chatName));
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.getRandom(255));
		stream.writeByte(rights);
		Huffman.sendEncryptMessage(stream, message.getMessage(player.isFilteringProfanity()));
		stream.endPacketVarByte();
		player.write(stream);
	}

	public void receiveFriendChatQuickMessage(String name, String display, int rights, String chatName, QuickChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 32);
		stream.writeByte(name.equals(display) ? 0 : 1);
		stream.writeString(display);
		if (!name.equals(display))
			stream.writeString(name);
		stream.writeLong(Utils.stringToLong(chatName));
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.getRandom(255));
		stream.writeByte(rights);
		stream.writeShort(message.getFileId());
		if (message.getMessage(false) != null)
			stream.writeBytes(message.getMessage(false).getBytes());
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	/*
	 * dynamic map region
	 */
	public void sendDynamicGameScene(boolean sendLswp) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 59);
//		if (sendLswp) // exists on newer protocol, sends all player encoded
//			// region ids, afterwards new pupdate protocol is
//			// regionbased
//			player.getLocalPlayerUpdate().init(stream);
		int middleChunkX = player.getChunkX();
		int middleChunkY = player.getChunkY();
		stream.writeByte(2); // exists on newer protocol, triggers a
		// gamescene supporting npcs
		stream.writeShortLE128(middleChunkY);
		stream.write128Byte(player.isForceNextMapLoadRefresh() ? 1 : 0);
		stream.writeShort128(middleChunkX);
		stream.write128Byte(player.getMapSize());
		stream.initBitAccess();
		/*
		 * cene length in chunks. scene tiles length / 16, 8 is a chunk size, 16 because the code behind its signed and goes from
		 * middle-length to middle+length
		 */
		int sceneLength = Settings.MAP_SIZES[player.getMapSize()] >> 4;
		// the regionids(maps files) that will be used to load this scene
		int[] regionIds = new int[4 * sceneLength * sceneLength];
		int newRegionIdsCount = 0;
		for (int plane = 0; plane < 4; plane++) {
			for (int realChunkX = (middleChunkX - sceneLength); realChunkX <= ((middleChunkX + sceneLength)); realChunkX++) {
				int regionX = realChunkX / 8;
				y: for (int realChunkY = (middleChunkY - sceneLength); realChunkY <= ((middleChunkY + sceneLength)); realChunkY++) {
					int regionY = realChunkY / 8;
					// rcx / 8 = rx, rcy / 8 = ry, regionid is encoded region x
					// and y
					int regionId = (regionX << 8) + regionY;
					Region region = World.getRegions().get(regionId);
					int newChunkX;
					int newChunkY;
					int newPlane;
					int rotation;
					if (region instanceof DynamicRegion) { // generated map
						DynamicRegion dynamicRegion = (DynamicRegion) region;
						int[] pallete = dynamicRegion.getRegionCoords()[plane][realChunkX - (regionX * 8)][realChunkY - (regionY * 8)];
						newChunkX = pallete[0];
						newChunkY = pallete[1];
						newPlane = pallete[2];
						rotation = pallete[3];
					} else { // real map
						newChunkX = realChunkX;
						newChunkY = realChunkY;
						newPlane = plane;
						rotation = 0;// no rotation
					}
					// invalid chunk, not built chunk
					if (newChunkX == 0 || newChunkY == 0)
						stream.writeBits(1, 0);
					else {
						stream.writeBits(1, 1);
						// chunk encoding = (x << 14) | (y << 3) | (plane <<
						// 24), theres addition of two more bits for rotation
						stream.writeBits(26, (rotation << 1) | (newPlane << 24) | (newChunkX << 14) | (newChunkY << 3));
						int newRegionId = (((newChunkX / 8) << 8) + (newChunkY / 8));
						for (int index = 0; index < newRegionIdsCount; index++)
							if (regionIds[index] == newRegionId)
								continue y;
						regionIds[newRegionIdsCount++] = newRegionId;
					}

				}
			}
		}
		stream.finishBitAccess();
		for (int index = 0; index < newRegionIdsCount; index++) {
			int[] xteas = MapArchiveKeys.getMapKeys(regionIds[index]);
			if (xteas == null)
				xteas = new int[4];
			for (int keyIndex = 0; keyIndex < 4; keyIndex++)
				stream.writeInt(xteas[keyIndex]);
		}
		stream.endPacketVarShort();
		player.write(stream);
	}

	public void sendDelayedGraphics(Graphics graphics, int delay, WorldTile tile) {

	}

	public void sendNPCInterface(NPC npc, boolean nocliped, int windowId, int windowComponentId, int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(26);
		stream.writePacket(player, 57);
		stream.writeIntV2(xteas[0]);
		stream.writeShortLE128(npc.getIndex());
		stream.writeByte128(nocliped ? 1 : 0);
		stream.writeInt(xteas[3]);
		stream.writeShortLE128(interfaceId);
		stream.writeIntLE(xteas[2]);
		stream.writeIntV2(xteas[1]);
		stream.writeIntV1(windowId << 16 | windowComponentId);
		// //////player.write(stream);
	}

	public void sendObjectInterface(WorldObject object, boolean nocliped, int windowId, int windowComponentId, int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(33);
		stream.writePacket(player, 143);
		stream.writeIntV2(xteas[1]);
		stream.writeByte(nocliped ? 1 : 0);
		stream.writeIntLE(xteas[2]);
		stream.writeIntV1(object.getId());
		stream.writeByte128((object.getType() << 2) | (object.getRotation() & 0x3));
		stream.writeInt((object.getPlane() << 28) | (object.getX() << 14) | object.getY()); // the
		// hash
		// for
		// coords,
		stream.writeIntV2((windowId << 16) | windowComponentId);
		stream.writeShort(interfaceId);
		stream.writeInt(xteas[3]);
		stream.writeInt(xteas[0]);
		// //////player.write(stream);
	}

	public void sendSystemUpdate(int delay) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 141);
		stream.writeShort((int) (delay * 1.6));
		// //////player.write(stream);
	}

	public void sendInventoryMessage(int border, int slotId, String message) {
		player.getSocialManager().sendGameMessage(message);
		sendRunScript(948, border, slotId, message);
	}

	public void sendNPCMessage(int border, int color, NPC npc, String message) {
		player.getSocialManager().sendGameMessage(message);
		sendGlobalString(306, message);
		sendGlobalConfig(1699, color);
		sendGlobalConfig(1700, border);
		sendGlobalConfig(1695, 1);
		sendNPCInterface(npc, true, 746, 0, 1177);
	}

	public void sendObjectMessage(int border, int color, WorldObject object, String message) {
		player.getSocialManager().sendGameMessage(message);
		sendGlobalString(306, message);
		sendGlobalConfig(1699, color);
		sendGlobalConfig(1700, border);
		sendGlobalConfig(1695, 1);
		sendObjectInterface(object, true, 746, 0, 1177);
	}

	// instant
	public void sendCameraLook(int viewLocalX, int viewLocalY, int viewZ) {
		sendCameraLook(viewLocalX, viewLocalY, viewZ, -1, -1);
	}

	public void sendCameraLook(int viewLocalX, int viewLocalY, int viewZ, int speed1, int speed2) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 116);
		stream.writeByte128(viewLocalY);
		stream.writeByte(speed1);
		stream.writeByteC(viewLocalX);
		stream.writeByte(speed2);
		stream.writeShort128(viewZ >> 2);
		// //////player.write(stream);
	}

	public void sendResetCamera() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 88);
		player.write(stream);
	}

	public void sendCameraRotation(int unknown1, int unknown2) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 123);
		stream.writeShort(unknown1);
		stream.writeShortLE(unknown1);
		// //////player.write(stream);
	}

	public void sendCameraPos(int moveLocalX, int moveLocalY, int moveZ) {
		sendCameraPos(moveLocalX, moveLocalY, moveZ, -1, -1);
	}

	public void sendClientConsoleCommand(String command) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 61);
		stream.writeString(command);
		stream.endPacketVarByte();
	}

	public void sendOpenURL(String url) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 16);
//		stream.writeByte(0);
		stream.writeString(url);
		stream.endPacketVarByte();
		//player.write(stream);
	}

	public void sendSetMouse(String walkHereReplace, int cursor) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 10);
		stream.writeString(walkHereReplace);
		stream.writeShort(cursor);
		stream.endPacketVarByte();
		// //////player.write(stream);
	}

	public void sendCameraPos(int moveLocalX, int moveLocalY, int moveZ, int speed1, int speed2) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 74);
		stream.writeByte128(speed2);
		stream.writeByte128(speed1);
		stream.writeByte(moveLocalY);
		stream.writeShort(moveZ >> 2);
		stream.writeByte(moveLocalX);
		// //////player.write(stream);
	}

}
