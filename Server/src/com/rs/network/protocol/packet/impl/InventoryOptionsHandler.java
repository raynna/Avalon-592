package com.rs.network.protocol.packet.impl;

import java.util.List;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
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
		if (itemId == 15262)
			ItemSets.openSkillPack(player, itemId, 12183, 5000, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15362)
			ItemSets.openSkillPack(player, itemId, 230, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15363)
			ItemSets.openSkillPack(player, itemId, 228, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15364)
			ItemSets.openSkillPack(player, itemId, 222, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 15365)
			ItemSets.openSkillPack(player, itemId, 9979, 50, player.getInventory().getAmountOf(itemId));
		else if (itemId == 1225) {
			// player.getPackets().sendInputIntegerScript("What would you like to do when you grow up?");
			// player.getTemporaryAttributtes().put("xformring", Boolean.TRUE);
		} else if (itemId >= 15086 && itemId <= 15100) {
			Dicing.handleRoll(player, itemId, true);
			return;
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

	public static void dig(final Player player) {
		player.resetWalkSteps();
		player.setNextAnimation(new Animation(830));
		player.lock();
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.unlock();
				if (player.getX() == 3005 && player.getY() == 3376 || player.getX() == 2999 && player.getY() == 3375 || player.getX() == 2996 && player.getY() == 3377 || player.getX() == 2989 && player.getY() == 3378 || player.getX() == 2987 && player.getY() == 3387 || player.getX() == 2984 && player.getY() == 3387) {
					// mole
					player.setNextWorldTile(new WorldTile(1752, 5137, 0));
					player.getSocialManager().sendGameMessage("You seem to have dropped down into a network of mole tunnels.");
					return;
				} else if (player.withinDistance(new WorldTile(2748, 3734, 0), 2)) {
					player.lock();
					player.setNextGraphics(new Graphics(80, 5, 60));
					FadingScreen.fade(player, 1000, new Runnable() {

						@Override
						public void run() {
							player.unlock();
							player.setNextWorldTile(new WorldTile(2696, 10121, 0));
						}
					});
					player.getSocialManager().sendGameMessage("You fall through the ground into a network of tunnels.");
					return;
				}
				player.getSocialManager().sendGameMessage("You find nothing.");
			}

		});
	}

	public static void handleItemOption1(final Player player, final int slotId, final int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
		int leatherIndex = LeatherCraftingD.getIndex(item.getId());
		if (leatherIndex != -1) {
			player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex);
			return;
		} else if (Foods.eat(player, item, slotId)) {
			return;
		} else if (Pots.pot(player, item, slotId))
			return;
		else if (itemId == 952) {// spade
			dig(player);
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
		else if (itemId == 4251)
			Magic.useEctoPhial(player, item);
		else if (itemId == 15262)
			ItemSets.openSkillPack(player, itemId, 12183, 5000, 1);
		else if (itemId == 15362)
			ItemSets.openSkillPack(player, itemId, 230, 50, 1);
		else if (itemId == 15363)
			ItemSets.openSkillPack(player, itemId, 228, 50, 1);
		else if (itemId == 15364)
			ItemSets.openSkillPack(player, itemId, 222, 50, 1);
		else if (itemId == 15365)
			ItemSets.openSkillPack(player, itemId, 9979, 50, 1);
		else if (itemId == 22445)
			player.getDialogueManager().startDialogue("NeemDrupeSqueeze");
		else if (itemId == 550)
			player.getInterfaceManager().sendInterface(270);
		if (itemId == AncientEffigies.SATED_ANCIENT_EFFIGY || itemId == AncientEffigies.GORGED_ANCIENT_EFFIGY || itemId == AncientEffigies.NOURISHED_ANCIENT_EFFIGY || itemId == AncientEffigies.STARVED_ANCIENT_EFFIGY)
			player.getDialogueManager().startDialogue("AncientEffigiesD", itemId);
		/*
		 * else if (itemId == 299) { if (player.isCanPvp()) { player.getPackets()
		 * .sendGameMessage("You cant plant a seed while doing this action."); return; } else if (World.getObjectWithSlot(player,
		 * Region.OBJECT_SLOT_STANDART) != null) { player.getSocialManager().sendGameMessage ("You can't plant a flower here."); return; }
		 * player.setNextAnimation(new Animation(827)); World.spawnObjectTemporary(new WorldObject(2980 + Utils.random(8), 10, 0,
		 * player.getX(), player.getY(), player.getPlane()), 25000); player.getInventory().deleteItem(299, 1);
		 * WorldTasksManager.schedule(new WorldTask() {
		 * 
		 * @Override public void run() { if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1)) if
		 * (!player.addWalkSteps(player.getX() + 1, player.getY(), 1)) if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
		 * if (!player.addWalkSteps(player.getX(), player.getY() - 1, 1)) return; } }, 2);
		 */
		else if (itemId == 6)
			DwarfMultiCannon.setUp(player);
		else if (Nest.isNest(itemId))
			Nest.searchNest(player, slotId);
		else if (itemId == 14057) // broomstick
			player.setNextAnimation(new Animation(10532));
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
			else if (contains(22498, 554, itemUsed, usedWith) || contains(22498, 22448, itemUsed, usedWith)) {
				if (player.getSkills().getLevel(Skills.FARMING) < 80) {
					player.getSocialManager().sendGameMessage("You need a Farming level of 80 in order to make a polypore staff.");
					return;
				} else if (!player.getInventory().containsItem(22448, 3000)) {
					player.getSocialManager().sendGameMessage("You need 3,000 polypore spores in order to make a polypore staff.");
					return;
				} else if (!player.getInventory().containsItem(554, 15000)) {
					player.getSocialManager().sendGameMessage("You need 15,000 fire runes in order to make a polypore staff.");
					return;
				}
				player.setNextAnimation(new Animation(15434));
				player.lock(2);
				player.getInventory().deleteItem(554, 15000);
				player.getInventory().deleteItem(22448, 3000);
				player.getInventory().deleteItem(22498, 1);
				player.getInventory().addItem(22494, 1);
				player.getSocialManager().sendGameMessage("You attach the polypore spores and infuse the fire runes to the stick in order to create a staff.");
			} else if (contains(22496, 22448, itemUsed, usedWith)) {
				if (player.getSkills().getLevel(Skills.FARMING) < 80) {
					player.getSocialManager().sendGameMessage("You need a Farming level of 80 in order to recharge polypore staff.");
					return;
				}
				int charges = 3000 - player.getCharges().getCharges(22496);
				if (!player.getInventory().containsItem(22448, charges)) {
					player.getSocialManager().sendGameMessage("You need " + charges + " polypore spores in order to recharge polypore staff.");
					return;
				}
				player.setNextAnimation(new Animation(15434));
				player.lock(2);
				player.getInventory().deleteItem(22448, charges);
				player.getInventory().deleteItem(22496, 1);
				player.getCharges().resetCharges(22496);
				player.getInventory().addItem(22494, 1);
				player.getSocialManager().sendGameMessage("You attach the polypore spores to the staff.");
			}
			else if (contains(4151, 21369, itemUsed, usedWith)) {
				if (!player.getSkills().hasRequiriments(Skills.ATTACK, 75, Skills.SLAYER, 80)) {
					player.getSocialManager().sendGameMessage("You need an attack level of 75 and slayer level of 80 in order to attach the whip vine to the whip.");
					return;
				}
				player.getInventory().replaceItem(21371, 1, toSlot);
				player.getInventory().deleteItem(fromSlot, itemUsed);
				player.getSocialManager().sendGameMessage("You attach the whip vine to the abbysal whip.");
			} else if (contains(985, 987, itemUsed, usedWith)) { // crystal key
				// make
				player.getInventory().deleteItem(toSlot, usedWith);
				itemUsed.setId(989);
				player.getInventory().refresh(fromSlot);
				player.getSocialManager().sendGameMessage("You join the two halves of the key together.");
			} else
				player.getSocialManager().sendGameMessage("Nothing interesting happens.");
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
		if (LightSource.lightSource(player, slotId))
			return;
		else if (itemId == 24437 || itemId == 24439 || itemId == 24440 || itemId == 24441)
			player.getDialogueManager().startDialogue("FlamingSkull", item, slotId);
		else if (itemId == 22444)
			player.getCharges().checkCharges("There is " + ChargesManager.REPLACE + " doses of neem oil remaining.", itemId);
		else if ((itemId >= 24450 && itemId <= 24454) || (itemId >= 22358 && itemId <= 22369))
			player.getCharges().checkPercentage("The gloves are " + ChargesManager.REPLACE + "% degraded.", itemId, true);
		else if (itemId >= 22458 && itemId <= 22497)
			player.getCharges().checkPercentage(item.getName() + ": " + ChargesManager.REPLACE + "% remaining.", itemId, false);
		else if (itemId == 20171 || itemId == 20173)
			player.getCharges().checkPercentage(item.getName() + ": has " + player.getCharges().getCharges(item.getId()) + " shots left.", itemId, false);
		else if (itemId == 21371) {
			player.getInventory().replaceItem(4151, 1, slotId);
			player.getInventory().addItem(21369, 1);
			player.getSocialManager().sendGameMessage("You split the whip vine from the abbysal whip.");
		} else if (itemId == 4155) {
			player.getInterfaceManager().sendInterface(1309);
			player.getPackets().sendIComponentText(1309, 37, "List Co-Op Partner");
		}
		else if (itemId == 23044 || itemId == 23045 || itemId == 23046 || itemId == 23047)
			player.getDialogueManager().startDialogue("MindSpikeD", itemId, slotId);
		else if (item.getDefinitions().containsOption("Teleport") && ItemTransportation.transportationDialogue(player, item))
			return;
	}

	public static void handleItemOption4(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 4");
	}

	public static void handleItemOption5(Player player, int slotId, int itemId, Item item) {
		if (Settings.DEBUG)
			System.out.println("Option 5");
	}

	public static void handleItemOption6(Player player, int slotId, int itemId, Item item) {
		if (player.isLocked() || player.getEmotesManager().isDoingEmote())
			return;
		player.stopAll(false);
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
		if (item.getDefinitions().isDestroyItem()) {
			player.getDialogueManager().startDialogue("DestroyItemOption", slotId, item);
			return;
		}
		if (player.getPetManager().spawnPet(itemId, true))
			return;
		if (player.isStarter()) {
			player.getSocialManager().sendGameMessage("You can't drop for the first half hour after creating account.");
			return;
		}
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
