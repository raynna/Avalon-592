package com.rs.network.protocol.packet.impl;

import java.util.List;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.item.ItemScriptsHandler;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.object.ObjectScript;
import com.rs.game.object.ObjectScriptsHandler;
import com.rs.game.player.ChargesManager;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.content.AncientEffigies;
import com.rs.game.player.content.Burying.Bone;
import com.rs.game.player.content.Dicing;
import com.rs.game.player.content.DwarfMultiCannon;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.Foods;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.ItemTransportation;
import com.rs.game.player.content.Lamps;
import com.rs.game.player.content.LightSource;
import com.rs.game.player.content.Nest;
import com.rs.game.player.content.Pots;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.content.TreeSaplings;
import com.rs.game.player.content.WeaponPoison;
import com.rs.game.player.dialogues.impl.AmuletAttaching;
import com.rs.game.player.dialogues.impl.CombinationsD.Combinations;
import com.rs.game.player.dialogues.impl.LeatherCraftingD;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.utils.Logger;

public class InventoryOptionsHandler {

	public static void handleItemOption2(final Player player, final int slotId, final int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem2(player, item);
			return;
		}
		if (itemId >= 15086 && itemId <= 15100) {
			Integer interID = (Integer) player.getTemporaryAttributtes().get("PREVIOUS_INTERFACE");
			if (interID == null)
				interID = 1;
			interID++;
			player.getInterfaceManager().sendInterface(interID.intValue());
			player.getSocialManager().sendGameMessage("Sent interface: " + interID.intValue());
			player.getTemporaryAttributtes().put("PREVIOUS_INTERFACE", interID);
		} else if (item.getDefinitions().containsOption(1, "Extinguish")) {
			if (LightSource.extinguishSource(player, slotId, false))
				return;
		} else {
			if (player.isEquipDisabled())
				return;
			if (player.getSwitchItemCache().isEmpty()) {
				player.getSwitchItemCache().add(slotId);
				CoresManager.fastExecutor.schedule(new TimerTask() {
					@Override
					public void run() {
						try {
							WorldTasksManager.schedule(new WorldTask() {

								@Override
								public void run() {
									List<Integer> slots = player.getSwitchItemCache();
									int[] slot = new int[slots.size()];
									for (int i = 0; i < slot.length; i++)
										slot[i] = slots.get(i);
									player.getSwitchItemCache().clear();
									ButtonHandler.sendWear(player, slot);
									player.stopAll(false, true, false);
								}
							}, 0);
						} catch (Throwable e) {
							Logger.handle(e);
						}
					}
				}, 300);
			} else if (!player.getSwitchItemCache().contains(slotId)) {
				player.getSwitchItemCache().add(slotId);
			}
		}
	}

	public static void handleItemOption1(final Player player, final int slotId, final int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem(player, item);
			return;
		}
		if (itemId == 15086) {//temporary to check interfaces quick
			//591 target interface
			//620 shop interface
			Integer interID = (Integer) player.getTemporaryAttributtes().get("PREVIOUS_INTERFACE");
			if (interID == null)
				interID = 1;
			interID++;
			player.getInterfaceManager().sendInterface(interID.intValue());
			player.getSocialManager().sendGameMessage("Sent interface: " + interID.intValue());
		 	System.out.println("Sent interface: " + interID.intValue());
			player.getTemporaryAttributtes().put("PREVIOUS_INTERFACE", interID);
		}
		int leatherIndex = LeatherCraftingD.getIndex(item.getId());
		if (leatherIndex != -1) {
			player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex);
			return;
		} else if (Foods.eat(player, item, slotId)) {
			return;
		} else if (Pots.pot(player, item, slotId)) {
			return;
		} else if (Bone.forId(itemId) != null) {
			Bone.bury(player, slotId);
			return;
		} else if (Magic.useTabTeleport(player, itemId))
			return;
		else if (ItemTransportation.transportationDialogue(player, item))
			return;
		else if (Lamps.isSelectable(itemId) || Lamps.isSkillLamp(itemId) || Lamps.isOtherLamp(itemId))
			Lamps.processLampClick(player, slotId, itemId);
		else if (LightSource.lightSource(player, slotId))
			return;
		else if (LightSource.extinguishSource(player, slotId, false))
			return;
		else if (Nest.isNest(itemId))
			Nest.searchNest(player, slotId);
		else if (item.getDefinitions().getName().startsWith("Burnt"))
			player.getDialogueManager().startDialogue("SimplePlayerMessage", "Ugh, this is inedible.");
		if (Settings.DEBUG)
			Logger.log("ItemHandler", "Item Select:" + itemId + ", Slot Id:" + slotId);
	}

	/*
	 * returns the other
	 */
	public static Item contains(int id1, Item item1, Item item2) {
		if (item1.getId() == id1)
			return item2;
		if (item2.getId() == id1)
			return item1;
		return null;
	}

	public static boolean contains(int id1, int id2, Item... items) {
		boolean containsId1 = false;
		boolean containsId2 = false;
		for (Item item : items) {
			if (item.getId() == id1)
				containsId1 = true;
			else if (item.getId() == id2)
				containsId2 = true;
		}
		return containsId1 && containsId2;
	}

	public static void handleInterfaceOnInterface(final Player player, InputStream stream) {
		int interfaceId = stream.readUnsignedShort();
		int interfaceComponent = stream.readUnsignedShort();
		int fromSlot = stream.readUnsignedShortLE();
		int toSlot = stream.readUnsignedShort();
		int interfaceId2 = stream.readInt() >> 16;
		int usedWithId = stream.readUnsignedShortLE();
		int itemUsedId = stream.readUnsignedShort();
		System.out.println(interfaceId + ", " + fromSlot + ", " + toSlot + ", " + interfaceId2 + ", " + usedWithId + ", " + itemUsedId);
		if ((interfaceId == 747 || interfaceId == 662) && interfaceId2 == Inventory.INVENTORY_INTERFACE) {
			if (player.getFamiliar() != null) {
				player.getFamiliar().setSpecial(true);
				if (player.getFamiliar().getSpecialAttack() == SpecialAttack.ITEM) {
					if (player.getFamiliar().hasSpecialOn())
						player.getFamiliar().submitSpecial(toSlot);
				}
			}
			return;
		}
		if (interfaceId == Inventory.INVENTORY_INTERFACE && interfaceId == interfaceId2 && !player.getInterfaceManager().containsInventoryInter()) {
			if (toSlot >= 28 || fromSlot >= 28 || toSlot == fromSlot)
				return;
			Item usedWith = player.getInventory().getItem(toSlot);
			Item itemUsed = player.getInventory().getItem(fromSlot);
			if (itemUsed == null || usedWith == null || itemUsed.getId() != itemUsedId || usedWith.getId() != usedWithId)
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote())
				return;
			player.stopAll();
			if (!player.getControlerManager().canUseItemOnItem(itemUsed, usedWith))
				return;
			Combinations combination = Combinations.isCombining(itemUsedId, usedWithId);
			if (combination != null) {
				player.getDialogueManager().startDialogue("CombinationsD", combination);
				return;
			} else if (AmuletAttaching.isAttaching(itemUsedId, usedWithId))
				player.getDialogueManager().startDialogue("AmuletAttaching");
			else if (TreeSaplings.hasSaplingRequest(player, itemUsedId, usedWithId)) {
				if (itemUsedId == 5354)
					TreeSaplings.plantSeed(player, usedWithId, fromSlot);
				else
					TreeSaplings.plantSeed(player, itemUsedId, toSlot);
			} else if (Pots.mixPot(player, itemUsed, usedWith, fromSlot, toSlot))
				return;
			else if (WeaponPoison.poison(player, itemUsed, usedWith))
				return;
			if (Settings.DEBUG)
				Logger.log("ItemHandler", "Used:" + itemUsed.getId() + ", With:" + usedWith.getId());
		} else if (interfaceId == 192 && interfaceId2 == Inventory.INVENTORY_INTERFACE && !player.getInterfaceManager().containsInventoryInter()) {
			if (toSlot >= 28)
				return;
			Item item = player.getInventory().getItem(toSlot);
			if (item == null || item.getId() != usedWithId)
				return;
			if (player.isLocked() || player.getEmotesManager().isDoingEmote())
				return;
			Magic.processNormalSpell(player, interfaceComponent, (byte) toSlot);
		}
		if (Settings.DEBUG)
			Logger.log("ItemHandler", "ItemOnItem " + usedWithId + ", " + toSlot + ", " + interfaceId + ", " + interfaceComponent + ", " + fromSlot + ", " + itemUsedId);
	}

	public static void handleItemOption3(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem3(player, item);
			return;
		}
		if (LightSource.lightSource(player, slotId))
			return;
		else if (item.getDefinitions().containsOption("Teleport") && ItemTransportation.transportationDialogue(player, item))
			return;
	}

	public static void handleItemOption4(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 4");
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem4(player, item);
			return;
		}
	}

	public static void handleItemOption5(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 5");
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem5(player, item);
			return;
		}
	}

	public static void handleItemOption6(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem6(player, item);
			return;
		}
		Pouch pouch = Pouch.forId(itemId);
		if (pouch != null)
			Summoning.spawnFamiliar(player, pouch);
		else if ((item.getDefinitions().containsOption("Rub") || item.getDefinitions().containsOption("Cabbage-port")) && ItemTransportation.transportationDialogue(player, item))
			return;
		else if (Pots.emptyPot(player, item, slotId))
			return;
	}

	public static void handleItemOption7(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		if (!player.getControlerManager().canDropItem(item))
			return;
		player.stopAll(false);
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(item.getId());
		ItemScripts script = ItemScriptsHandler.cachedItemScripts.getOrDefault(item.getId(),
				ItemScriptsHandler.cachedItemScripts.get(itemDef.name));
		if (script != null) {
			script.processItem7(player, item);
			return;
		}
		if (item.getDefinitions().isDestroyItem()) {
			player.getDialogueManager().startDialogue("DestroyItemOption", slotId, item);
			return;
		}
		if (player.getPetManager().spawnPet(itemId, true))
			return;
		player.getInventory().deleteItem(slotId, item);
		if (player.getCharges().degradeCompletly(item))
			return;
		World.addGroundItem(item, new WorldTile(player), player, true, 60);
		Logger.globalLog(player.getUsername(), player.getIP(), new String(" has dropped item [ id: " + item.getId() + ", amount: " + item.getAmount() + " ]."));
		player.getPackets().sendSound(2739, 0, 1);
	}

	public static void handleItemOption8(Player player, int slotId, int itemId, Item item) {
		if (itemId >= 15084 && itemId <= 15100)
			Dicing.handleRoll(player, itemId, true);
		player.getInventory().sendExamine(slotId);
	}
}
