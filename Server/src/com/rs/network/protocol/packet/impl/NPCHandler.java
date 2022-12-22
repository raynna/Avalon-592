package com.rs.network.protocol.packet.impl;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.pest.CommendationExchange;
import com.rs.game.npc.NPC;
import com.rs.game.npc.NpcScript;
import com.rs.game.npc.NpcScriptHandler;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Pyrelord;
import com.rs.game.npc.others.FireSpirit;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.Pet;
import com.rs.game.npc.others.Strykewyrm;
import com.rs.game.object.ObjectScript;
import com.rs.game.object.ObjectScriptsHandler;
import com.rs.game.player.Player;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.actions.Rest;
import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.content.EconomyManager;
import com.rs.game.player.content.GnomeGlider;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.content.SheepShearing;
import com.rs.game.player.content.StealingCreationShop;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.dialogues.impl.BoatingDialouge;
import com.rs.game.player.dialogues.impl.FremennikShipmaster;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.NPCExamines;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class NPCHandler {

	public static void handleExamine(final Player player, InputStream stream) {
		int npcId = stream.readUnsignedShort();
		player.getSocialManager().sendGameMessage(NPCExamines.getExamine(npcId));
		if (Settings.DEBUG)
			Logger.log("NPCHandler", "examined npc: " + npcId);
	}

	public static void handleOption1(final Player player, final InputStream stream) {
		boolean forceRun = stream.read128Byte() == 1;
		int npcIndex = stream.readUnsignedShort();
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		NPCDefinitions npcDef = NPCDefinitions.getNPCDefinitions(npc.getId());
		NpcScript script = NpcScriptHandler.cachedNpcScripts.getOrDefault(npc.getId(),
				NpcScriptHandler.cachedNpcScripts.get(npcDef.name));
		if (script != null) {
			if (!script.processNpc(player, npc)) {
				player.getSocialManager().sendGameMessage("Nothing interesting happens.");
				return;
			}
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (!player.getControlerManager().processNPCClick1(npc))
					return;
				else {
					switch (npc.getDefinitions().name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						if (Settings.DEBUG)
							System.out.println("cliked 1 at npc[" + npc.getIndex() + "] id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
						break;
					}
				}
			}
		}));
	}

	public static void handleOption2(final Player player, InputStream stream) {
		boolean forceRun = stream.read128Byte() == 1;
		int npcIndex = stream.readUnsignedShortLE();
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		NPCDefinitions npcDef = NPCDefinitions.getNPCDefinitions(npc.getId());
		NpcScript script = NpcScriptHandler.cachedNpcScripts.getOrDefault(npc.getId(),
				NpcScriptHandler.cachedNpcScripts.get(npcDef.name));
		if (script != null) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceEntity(npc);
					if (!script.processNpc2(player, npc)) {
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						return;
					}
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
			if (Settings.DEBUG)
				System.out.println("cliked 2 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
			}
		}));
	}

	public static void handleOption3(final Player player, InputStream stream) {
		int npcIndex = stream.readShortLE128();
		boolean forceRun = stream.read128Byte() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll(false);
		if (forceRun)
			player.setRun(forceRun);
		NPCDefinitions npcDef = NPCDefinitions.getNPCDefinitions(npc.getId());
		NpcScript script = NpcScriptHandler.cachedNpcScripts.getOrDefault(npc.getId(),
				NpcScriptHandler.cachedNpcScripts.get(npcDef.name));
		if (script != null) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceEntity(npc);
					if (!script.processNpc3(player, npc)) {
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						return;
					}
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (Settings.DEBUG)
					System.out.println("cliked 3 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
			}
		}));}

	public static void handleOption4(final Player player, InputStream stream) {
		boolean forceRun = stream.readByte128() == 1;
		int npcIndex = stream.readUnsignedShort();
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll(false);
		if (forceRun)
			player.setRun(forceRun);
		NPCDefinitions npcDef = NPCDefinitions.getNPCDefinitions(npc.getId());
		NpcScript script = NpcScriptHandler.cachedNpcScripts.getOrDefault(npc.getId(),
				NpcScriptHandler.cachedNpcScripts.get(npcDef.name));
		if (script != null) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceEntity(npc);
					if (!script.processNpc4(player, npc)) {
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						return;
					}
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (Settings.DEBUG)
					System.out.println("cliked 4 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
			}
		}));
	}

	public static void handleItemOnNPC(final Player player, final NPC npc, final Item item) {
		if (item == null)
			return;
		NPCDefinitions npcDef = NPCDefinitions.getNPCDefinitions(npc.getId());
		NpcScript script = NpcScriptHandler.cachedNpcScripts.getOrDefault(npc.getId(),
				NpcScriptHandler.cachedNpcScripts.get(npcDef.name));
		if (script != null) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceEntity(npc);
					if (!script.processItemOnNpc(player, npc, item)) {
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						return;
					}
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (Settings.DEBUG)
					System.out.println("ItemOnNpc at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
			}
		}));
	}
}
