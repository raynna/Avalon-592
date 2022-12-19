package com.rs.network.protocol.packet.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cores.CoresManager;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.duel.DuelControler;
import com.rs.game.minigames.pest.CommendationExchange;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.player.EmotesManager;
import com.rs.game.player.Equipment;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.FightPitsViewingOrb;
import com.rs.game.player.actions.HomeTeleport;
import com.rs.game.player.actions.Rest;
import com.rs.game.player.actions.Smithing.ForgingInterface;
import com.rs.game.player.content.Canoes;
import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.Enchanting;
import com.rs.game.player.content.FairyRings;
import com.rs.game.player.content.GnomeGlider;
import com.rs.game.player.content.GraveStoneSelection;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.ItemTransportation;
import com.rs.game.player.content.JewllerySmithing;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.content.Runecrafting;
import com.rs.game.player.content.Shop;
import com.rs.game.player.content.SpiritTree;
import com.rs.game.player.content.StealingCreationShop;
import com.rs.game.player.content.Summoning;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.diary.AchievementDiary;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controllers.SorceressGarden;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.dialogues.impl.LevelUp;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.network.protocol.packet.WorldPacketsDecoder;
import com.rs.utils.ItemExamines;
import com.rs.utils.Logger;
import com.rs.utils.ReportAbuse;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class ButtonHandler {

	public static void handleButtons(final Player player, InputStream stream, final int packetId) {
		int interfaceHash = stream.readInt();
		int interfaceId = interfaceHash >> 16;
		if (Utils.getInterfaceDefinitionsSize() <= interfaceId) {
			// hack, or server error or client error
			// player.getSession().getChannel().close();
			if (Settings.DEBUG) {
				System.out.println("BLOCK 1 " + packetId + "," + interfaceId + "," + (interfaceHash & 0xFFFF));
			}
			return;
		}
		// cant use inter while locked, temporarly
		if (player.isDead() || player.isLocked() || !player.getInterfaceManager().containsInterface(interfaceId)) {
			if (Settings.DEBUG) {

				System.out.println("BLOCK 2 " + packetId + "," + interfaceId + "," + (interfaceHash & 0xFFFF));
			}
			return;
		}
		final int componentId = interfaceHash - (interfaceId << 16);
		if (componentId != 65535 && Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId) {
			// hack, or server error or client error
			// player.getSession().getChannel().close();
			if (Settings.DEBUG) {
				System.out.println("BLOCK 3 " + packetId + "," + interfaceId + "," + componentId);
			}
			return;
		}
		final int slotId = stream.readUnsignedShortLE();
		final int slotId2 = stream.readUnsignedShortLE();
		if (Settings.DEBUG) {
			System.out.println(packetId + "," + interfaceId + "," + componentId + "," + slotId + "," + slotId2);
		}

		if (!player.getControlerManager().processButtonClick(interfaceId, componentId, slotId, slotId2, packetId))
			return;

		if (interfaceId == 548 || interfaceId == 746) {

			if ((interfaceId == 548 && componentId == 130) || (interfaceId == 746 && componentId == 174)) {
				if (player.getInterfaceManager().containsScreenInter() || player.getInterfaceManager().containsInventoryInter()) {
					// TODO cant open sound
					player.getSocialManager().sendGameMessage("Please finish what you're doing before opening the world map.");
					return;
				}
				// world map open
				player.getPackets().sendRootInterface(755, 0);
				player.getPackets().sendGlobalConfig(622, player.getTileHash()); // center
				player.getPackets().sendGlobalConfig(674, player.getTileHash()); // player
				// position
			}

		} else if (interfaceId == 375) {
			player.getActionManager().forceStop();
		} else if (interfaceId == 759) {
			player.getBank().checkPinInput(true, componentId);
		} else if (interfaceId == 1312) {
			player.getDialogueManager().continueDialogue(interfaceId, componentId);
		} else if (interfaceId == 34) {// notes interface
			switch (componentId) {
			case 35:
			case 37:
			case 39:
			case 41:
				player.getNotes().colour((componentId - 35) / 2);
				player.getPackets().sendHideIComponent(34, 16, true);
				break;
			case 3:
				player.getPackets().sendInputLongTextScript("Add note:");
				player.getTemporaryAttributtes().put("entering_note", Boolean.TRUE);
				break;
			case 9:
				switch (packetId) {
				case WorldPacketsDecoder.ACTION_BUTTON1_PACKET:
					if (player.getNotes().getCurrentNote() == slotId)
						player.getNotes().removeCurrentNote();
					else
						player.getNotes().setCurrentNote(slotId);
					break;
				case WorldPacketsDecoder.ACTION_BUTTON2_PACKET:
					player.getPackets().sendInputLongTextScript("Edit note:");
					player.getNotes().setCurrentNote(slotId);
					player.getTemporaryAttributtes().put("editing_note", Boolean.TRUE);
					break;
				case WorldPacketsDecoder.ACTION_BUTTON3_PACKET:
					player.getNotes().setCurrentNote(slotId);
					player.getPackets().sendHideIComponent(34, 16, false);
					break;
				case WorldPacketsDecoder.ACTION_BUTTON4_PACKET:
					player.getNotes().delete(slotId);
					break;
				}
				break;
			case 8:
				switch (packetId) {
				case WorldPacketsDecoder.ACTION_BUTTON1_PACKET:
					player.getNotes().delete();
					break;
				case WorldPacketsDecoder.ACTION_BUTTON2_PACKET:
					player.getNotes().deleteAll();
					break;
				}
				break;
			}
		} else if (interfaceId == 675) {
			JewllerySmithing.handleButtonClick(player, componentId, packetId == 14 ? 1 : packetId == 67 ? 5 : 10);
		} else if (interfaceId == 432) {
			//TODO final int index = Enchanting.getComponentIndex(componentId);
			//fif (index == -1)
			//f	return;
			//fEnchanting.processBoltEnchantSpell(player, index, packetId == 14 ? 1 : packetId == 67 ? 5 : 10);
		} else if (interfaceId == 182) {
			if (player.getInterfaceManager().containsInventoryInter())
				return;
			if (componentId == 6 || componentId == 9)
				player.logout(false);
		} else if (interfaceId == 164 || interfaceId == 161 || interfaceId == 378) {
			player.getSlayerManager().handleRewardButtons(interfaceId, componentId);
		} else if (interfaceId == 1310) {
			if (componentId == 0) {
				player.getSlayerManager().createSocialGroup(true);
				player.setCloseInterfacesEvent(null);
			}
			player.closeInterfaces();
		} else if (interfaceId == 1011) {
			CommendationExchange.handleButtonOptions(player, componentId);
		} else if (interfaceId == 1309) {
			if (componentId == 20)
				player.getSocialManager().sendGameMessage("Use your enchanted stone ring onto the player that you would like to invite.", true);
			else if (componentId == 22) {
				Player p2 = player.getSlayerManager().getSocialPlayer();
				if (p2 == null)
					player.getSocialManager().sendGameMessage("You have no slayer group, invite a player to start one.");
				else
					player.getSocialManager().sendGameMessage("Your current slayer group consists of you and " + p2.getDisplayName() + ".");
			} else if (componentId == 24)
				player.getSlayerManager().resetSocialGroup(true);
			player.closeInterfaces();
		} else if (interfaceId == 1165) {
			// if (componentId == 22)
			// Summoning.closeDreadnipInterface(player);
		} else if (interfaceId == 1128) {
			int index = -1;
			if (componentId == 98 || componentId == 4)
				index = 0;
			else if (componentId == 128 || componentId == 106)
				index = 1;
			else if (componentId == 144 || componentId == 166)
				index = 2;
			else if (componentId == 203 || componentId == 181)
				index = 3;
			else if (componentId == 240 || componentId == 218)
				index = 4;
			else if (componentId == 277 || componentId == 255)
				index = 5;
			else if (componentId == 292 || componentId == 314)
				index = 6;
			if (index != -1)
				StealingCreationShop.select(player, index);
			else if (componentId == 45)
				StealingCreationShop.purchase(player);

		} else if (interfaceId == 382) {
			if (componentId == 18)
				player.getDialogueManager().continueDialogue(interfaceId, componentId);
		} else if (interfaceId == 1263) {
			player.getDialogueManager().continueDialogue(interfaceId, componentId);
		} else if (interfaceId == 102) {
			player.closeInterfaces();
		} else if (interfaceId == 880) {
			if (componentId >= 7 && componentId <= 19)
				Familiar.setLeftclickOption(player, (componentId - 7) / 2);
			else if (componentId == 21)
				Familiar.confirmLeftOption(player);
			else if (componentId == 25)
				Familiar.setLeftclickOption(player, 7);
		} else if (interfaceId == 662) {
			if (player.getFamiliar() == null) {
				if (player.getPet() == null) {
					return;
				}
				if (componentId == 49)
					player.getPet().call();
				else if (componentId == 51)
					player.getDialogueManager().startDialogue("DismissD");
				return;
			}
			if (componentId == 49)
				player.getFamiliar().call();
			else if (componentId == 51)
				player.getDialogueManager().startDialogue("DismissD");
			else if (componentId == 67)
				player.getFamiliar().takeBob();
			else if (componentId == 69)
				player.getFamiliar().renewFamiliar();
			else if (componentId == 74) {
				if (player.getFamiliar().getSpecialAttack() == SpecialAttack.CLICK)
					player.getFamiliar().setSpecial(true);
				if (player.getFamiliar().hasSpecialOn())
					player.getFamiliar().submitSpecial(player);
			}
		} else if (interfaceId == 60)
			CastleWars.handleInterfaces(player, interfaceId, componentId, packetId);
		else if (interfaceId == 652) {
			if (componentId == 31)
				GraveStoneSelection.handleSelectionInterface(player, slotId / 6);
			else if (componentId == 34)
				GraveStoneSelection.confirmSelection(player);
		} else if (interfaceId == 864) {
			SpiritTree.handleSpiritTree(player, slotId);
		} else if (interfaceId == 747) {
			if (componentId == 7) {
				Familiar.selectLeftOption(player);
			} else if (player.getPet() != null) {
				if (componentId == 10 || componentId == 19) {
					player.getPet().call();
				} else if (componentId == 11 || componentId == 20) {
					player.getDialogueManager().startDialogue("DismissD");
				} else if (componentId == 9 || componentId == 0) {
					player.getPet().sendFollowerDetails();
				}
			} else if (player.getFamiliar() != null) {
				if (componentId == 10 || componentId == 19)
					player.getFamiliar().call();
				else if (componentId == 11 || componentId == 20)
					player.getDialogueManager().startDialogue("DismissD");
				else if (componentId == 12 || componentId == 21)
					player.getFamiliar().takeBob();
				else if (componentId == 13 || componentId == 22)
					player.getFamiliar().renewFamiliar();
				else if (componentId == 9 || componentId == 0)
					player.getFamiliar().sendFollowerDetails();
				else if (componentId == 17) {
					if (player.getFamiliar().getSpecialAttack() == SpecialAttack.CLICK)
						player.getFamiliar().setSpecial(true);
					if (player.getFamiliar().hasSpecialOn())
						player.getFamiliar().submitSpecial(player);
				}
			}
		} else if (interfaceId == 540) {
			if (componentId == 69)
				PuroPuro.confirmPuroSelection(player);
			else if (componentId == 71)
				ShopsHandler.openShop(player, 54);
			else
				PuroPuro.handlePuroInterface(player, componentId);
		} else if (interfaceId == 138) {
			int selectedComponent = componentId - 23;
			if (selectedComponent == 0 || player.getTemporaryAttributtes().get("using_carrier") != null)
				return;
			if (componentId == 22)
				selectedComponent = 4;
			else if (componentId == 27)
				selectedComponent = 5;
			GnomeGlider.sendGlider(player, selectedComponent, false);
		} else if (interfaceId == 734) {
			if (componentId == 21)
				FairyRings.confirmRingHash(player);
			else
				FairyRings.handleDialButtons(player, componentId);
		} else if (interfaceId == 728)
			PlayerLook.handleYrsaShoes(player, componentId, slotId);
		else if (interfaceId == 52) {
			if (componentId >= 30 && componentId <= 34) {
				player.getTemporaryAttributtes().put("selected_canoe", componentId - 30);
				Canoes.createShapedCanoe(player);
			}
		} else if (interfaceId == 53) {
			int selectedArea = -1;
			if (componentId == 47)
				selectedArea = 0;
			else if (componentId == 48)
				selectedArea = 1;
			else if (componentId == 3)
				selectedArea = 2;
			else if (componentId == 6)
				selectedArea = 3;
			else if (componentId == 49)
				selectedArea = 4;
			if (selectedArea != -1)
				Canoes.deportCanoeStation(player, selectedArea);
		} else if (interfaceId == 735) {
			if (componentId >= 14 && componentId <= 14 + 64)
				FairyRings.sendRingTeleport(player, componentId - 14);
		} else if (interfaceId == 95) {
			if (componentId >= 23 && componentId <= 33)
				CarrierTravel.handleCharterOptions(player, componentId);
		} else if (interfaceId == 309)
			PlayerLook.handleHairdresserSalonButtons(player, componentId, slotId);
		else if (interfaceId == 729)
			PlayerLook.handleThessaliasMakeOverButtons(player, componentId, slotId);
		else if (interfaceId == 187) {
			if (componentId == 1) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getMusicsManager().playAnotherMusicByIndex(slotId / 2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getMusicsManager().addToPlayList(slotId / 2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getMusicsManager().removeFromPlayList(slotId / 2);
			} else if (componentId == 4)
				player.getMusicsManager().addPlayingMusicToPlayList();
			else if (componentId == 9) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getMusicsManager().playAnotherMusicFromPlayListByIndex(slotId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getMusicsManager().removeFromPlayListByIndex(slotId);

			} else if (componentId == 10)
				player.getMusicsManager().switchPlayListOn();
			else if (componentId == 11)
				player.getMusicsManager().clearPlayList();
			else if (componentId == 13)
				player.getMusicsManager().switchShuffleOn();
		} else if (interfaceId == 275) {
			if (componentId == 8) {
				player.closeInterfaces();
			} else if (componentId == 14) {
				player.getPackets().sendOpenURL("www.google.com");
			}
		} else if ((interfaceId == 590 && componentId == 8) || interfaceId == 464) {
			player.getEmotesManager().useBookEmote(interfaceId == 464 ? componentId : EmotesManager.getId(slotId, packetId));
		} else if (interfaceId == 192) {
			if (componentId == 2)
				player.getCombatDefinitions().switchDefensiveCasting();
			else if (componentId == 7)
				player.getCombatDefinitions().switchShowCombatSpells();
			else if (componentId == 9)
				player.getCombatDefinitions().switchShowTeleportSkillSpells();
			else if (componentId == 11)
				player.getCombatDefinitions().switchShowMiscallaneousSpells();
			else if (componentId == 13)
				player.getCombatDefinitions().switchShowSkillSpells();
			else if (componentId >= 15 & componentId <= 17)
				player.getCombatDefinitions().setSortSpellBook(componentId - 15);
			else
				Magic.processNormalSpell(player, componentId, packetId);
		} else if (interfaceId == 645) {
			if (componentId == 16) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ItemSets.sendComponents(player, slotId2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					ItemSets.exchangeSet(player, slotId2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					ItemSets.examineSet(player, slotId2);
			}
		} else if (interfaceId == 644) {
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ItemSets.sendComponentsBySlot(player, slotId, slotId2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					ItemSets.exchangeSet(player, slotId, slotId2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == 334) {
			if (componentId == 8)
				player.closeInterfaces();
			else if (componentId == 20)
				player.getTrade().accept(false);
		} else if (interfaceId == 335) {
			if (componentId == 16)
				player.getTrade().accept(true);
			else if (componentId == 12)
				player.closeInterfaces();
			else if (componentId == 32) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getTrade().removeItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getTrade().removeItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getTrade().removeItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getTrade().removeItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("trade_item_X_Slot", slotId);
					player.getTemporaryAttributtes().put("trade_isRemove", Boolean.TRUE);
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getTrade().sendValue(slotId, false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getTrade().sendExamine(slotId, false);
			} else if (componentId == 35) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getTrade().sendValue(slotId, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getTrade().sendExamine(slotId, true);
			}
		} else if (interfaceId == 336) {
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getTrade().addItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getTrade().addItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getTrade().addItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getTrade().addItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("trade_item_X_Slot", slotId);
					player.getTemporaryAttributtes().remove("trade_isRemove");
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getTrade().sendValue(slotId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == 300) {
			ForgingInterface.handleIComponents(player, componentId);
		} else if (interfaceId == 206) {
			if (componentId == 18) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getPriceCheckManager().removeItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getPriceCheckManager().removeItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getPriceCheckManager().removeItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getPriceCheckManager().removeItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("pc_item_X_Slot", slotId);
					player.getTemporaryAttributtes().put("pc_isRemove", Boolean.TRUE);
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				}
			} else if (componentId == 16) {
				player.closeInterfaces();
			}
		} else if (interfaceId == 672) {
			if (componentId == 16) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					Summoning.handlePouchInfusion(player, slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 28);// x
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON6_PACKET) {
					Summoning.sendItemList(player, (boolean) player.getTemporaryAttributtes().get("infusing_scroll"), 1, slotId);
				}
			} else if (componentId == 19) {
				Summoning.switchInfusionOption(player);
			}
		} else if (interfaceId == 666) {
			if (componentId == 16) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					Summoning.handlePouchInfusion(player, slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
					Summoning.handlePouchInfusion(player, slotId, 28);// x
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET) {
					// player.getSocialManager().sendGameMessage("You currently need "
					// +
					// ItemDefinitions.getItemDefinitions(slotId2).getCreateItemRequirements());
				}
			} else if (componentId == 18)
				Summoning.switchInfusionOption(player);
		} else if (interfaceId == 207) {
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getPriceCheckManager().addItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getPriceCheckManager().addItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getPriceCheckManager().addItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getPriceCheckManager().addItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("pc_item_X_Slot", slotId);
					player.getTemporaryAttributtes().remove("pc_isRemove");
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == 665) {
			if (player.getFamiliar() == null || player.getFamiliar().getBob() == null)
				return;
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getFamiliar().getBob().addItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getFamiliar().getBob().addItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getFamiliar().getBob().addItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getFamiliar().getBob().addItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("bob_item_X_Slot", slotId);
					player.getTemporaryAttributtes().remove("bob_isRemove");
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == 671) {
			if (player.getFamiliar() == null || player.getFamiliar().getBob() == null)
				return;
			if (componentId == 27) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getFamiliar().getBob().removeItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getFamiliar().getBob().removeItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getFamiliar().getBob().removeItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getFamiliar().getBob().removeItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("bob_item_X_Slot", slotId);
					player.getTemporaryAttributtes().put("bob_isRemove", Boolean.TRUE);
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				}
			} else if (componentId == 29)
				player.getFamiliar().takeBob();
			// } else if (interfaceId == 513) {
			// SkillsDialogue.handleSetQuantityButtons(player, componentId);
		} else if (interfaceId == 193) {
			if (componentId == 5)
				player.getCombatDefinitions().switchShowCombatSpells();
			else if (componentId == 7)
				player.getCombatDefinitions().switchShowTeleportSkillSpells();
			else if (componentId >= 9 && componentId <= 11)
				player.getCombatDefinitions().setSortSpellBook(componentId - 9);
			else if (componentId == 18)
				player.getCombatDefinitions().switchDefensiveCasting();
			else
				Magic.processAncientSpell(player, componentId, packetId);
		} else if (interfaceId == 430) {
			if (componentId == 5)
				player.getCombatDefinitions().switchShowCombatSpells();
			else if (componentId == 7)
				player.getCombatDefinitions().switchShowTeleportSkillSpells();
			else if (componentId == 9)
				player.getCombatDefinitions().switchShowMiscallaneousSpells();
			else if (componentId >= 11 & componentId <= 13)
				player.getCombatDefinitions().setSortSpellBook(componentId - 11);
			else if (componentId == 20)
				player.getCombatDefinitions().switchDefensiveCasting();
			else
				Magic.processLunarSpell(player, componentId, packetId);
		} else if (interfaceId == 750) { // Running orb
			if (componentId == 1) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.toogleRun(true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getActionManager().setAction(new Rest(false));
			}
		} else if (interfaceId == 261) {
			if (player.getInterfaceManager().containsInventoryInter())
				return;
			if (componentId == 16) {
				if (player.getInterfaceManager().containsScreenInter()) {
					player.getSocialManager().sendGameMessage("Please close the interface you have open before setting your graphic options.");
					return;
				}
				player.stopAll();
				player.getInterfaceManager().sendInterface(742);
			} else if (componentId == 3) // run
				player.toogleRun(true);
			else if (componentId == 4)
				player.switchAllowChatEffects();
			else if (componentId == 5) // chat setup
				player.setPrivateChatSetup(player.getPrivateChatSetup() == 0 ? 1 : 0);
			else if (componentId == 8) // house options
				player.getInterfaceManager().sendSettings(398);
			else if (componentId == 6)
				player.switchMouseButtons();
			else if (componentId == 7)
				player.switchAcceptAid();
			else if (componentId == 18) // audio options
				player.getInterfaceManager().sendInterface(743);
		} else if (interfaceId == 429) {
			if (componentId == 18)
				player.getInterfaceManager().sendSettings();
		} else if (interfaceId == 398) {
			if (componentId == 19)
				player.getInterfaceManager().sendSettings();
			else if (componentId == 15 || componentId == 1)
				player.getHouse().setBuildMode(componentId == 15);
			else if (componentId == 25 || componentId == 26)
				player.getHouse().setArriveInPortal(componentId == 25);
			else if (componentId == 27)
				player.getHouse().expelGuests();
			else if (componentId == 29)
				House.leaveHouse(player);
		} else if (interfaceId == 402) {
			if (componentId >= 93 && componentId <= 115)
				player.getHouse().createRoom(componentId - 93);
		} else if (interfaceId == 394 || interfaceId == 396) {
			if (componentId == 11)
				player.getHouse().build(slotId);
		} else if (interfaceId == 982) {
			if (componentId == 5)
				player.getInterfaceManager().sendSettings();
			else if (componentId == 41)
				player.setPrivateChatSetup(player.getPrivateChatSetup() == 0 ? 1 : 0);
			else if (componentId >= 17 && componentId <= 36)
				player.setClanChatSetup(componentId - 17);
			else if (componentId >= 49 && componentId <= 66)
				player.setPrivateChatSetup(componentId - 48);
			else if (componentId >= 72 && componentId <= 91)
				player.setFriendChatSetup(componentId - 72);
			else if (componentId >= 97 && componentId <= 116)
				player.setGuestChatSetup(componentId - 97);
		} else if (interfaceId == 271) {
			CoresManager.fastExecutor.schedule(new TimerTask() {
				@Override
				public void run() {
					try {
						WorldTasksManager.schedule(new WorldTask() {

							@Override
							public void run() {
								if (player.isDead())
									return;
								if (componentId == 8 || componentId == 42) {
									player.getPrayer().switchPrayer(slotId);
								} else if (componentId == 43 && player.getPrayer().isUsingQuickPrayer())
									player.getPrayer().switchSettingQuickPrayer();
							}
						});
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 300);

		} else if (interfaceId == 320) {
			player.stopAll();
			int lvlupSkill = -1;
			int skillMenu = -1;
			switch (componentId) {
			case 123: // Attack
				skillMenu = 1;
				if (player.getTemporaryAttributtes().remove("leveledUp[0]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 1);
				} else {
					lvlupSkill = 0;
					player.getVarsManager().sendVar(1230, 10);
				}
				break;
			case 124: // Strength
				skillMenu = 2;
				if (player.getTemporaryAttributtes().remove("leveledUp[2]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 2);
				} else {
					lvlupSkill = 2;
					player.getVarsManager().sendVar(1230, 20);
				}
				break;
			case 125: // Defence
				skillMenu = 5;
				if (player.getTemporaryAttributtes().remove("leveledUp[1]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 5);
				} else {
					lvlupSkill = 1;
					player.getVarsManager().sendVar(1230, 40);
				}
				break;
			case 126: // Ranged
				skillMenu = 3;
				if (player.getTemporaryAttributtes().remove("leveledUp[4]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 3);
				} else {
					lvlupSkill = 4;
					player.getVarsManager().sendVar(1230, 30);
				}
				break;
			case 127: // Prayer
				if (player.getTemporaryAttributtes().remove("leveledUp[5]") != Boolean.TRUE) {
					skillMenu = 7;
					player.getVarsManager().sendVar(965, 7);
				} else {
					lvlupSkill = 5;
					player.getVarsManager().sendVar(1230, 60);
				}
				break;
			case 128: // Magic
				if (player.getTemporaryAttributtes().remove("leveledUp[6]") != Boolean.TRUE) {
					skillMenu = 4;
					player.getVarsManager().sendVar(965, 4);
				} else {
					lvlupSkill = 6;
					player.getVarsManager().sendVar(1230, 33);
				}
				break;
			case 129: // Runecrafting
				if (player.getTemporaryAttributtes().remove("leveledUp[20]") != Boolean.TRUE) {
					skillMenu = 12;
					player.getVarsManager().sendVar(965, 12);
				} else {
					lvlupSkill = 20;
					player.getVarsManager().sendVar(1230, 100);
				}
				break;
			case 130: // Construction
				skillMenu = 22;
				if (player.getTemporaryAttributtes().remove("leveledUp[21]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 22);
				} else {
					lvlupSkill = 21;
					player.getVarsManager().sendVar(1230, 698);
				}
				break;
			case 131: // Hitpoints
				skillMenu = 6;
				if (player.getTemporaryAttributtes().remove("leveledUp[3]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 6);
				} else {
					lvlupSkill = 3;
					player.getVarsManager().sendVar(1230, 50);
				}
				break;
			case 132: // Agility
				skillMenu = 8;
				if (player.getTemporaryAttributtes().remove("leveledUp[16]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 8);
				} else {
					lvlupSkill = 16;
					player.getVarsManager().sendVar(1230, 65);
				}
				break;
			case 133: // Herblore
				skillMenu = 9;
				if (player.getTemporaryAttributtes().remove("leveledUp[15]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 9);
				} else {
					lvlupSkill = 15;
					player.getVarsManager().sendVar(1230, 75);
				}
				break;
			case 134: // Thieving
				skillMenu = 10;
				if (player.getTemporaryAttributtes().remove("leveledUp[17]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 10);
				} else {
					lvlupSkill = 17;
					player.getVarsManager().sendVar(1230, 80);
				}
				break;
			case 135: // Crafting
				skillMenu = 11;
				if (player.getTemporaryAttributtes().remove("leveledUp[12]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 11);
				} else {
					lvlupSkill = 12;
					player.getVarsManager().sendVar(1230, 90);
				}
				break;
			case 136: // Fletching
				skillMenu = 19;
				if (player.getTemporaryAttributtes().remove("leveledUp[9]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 19);
				} else {
					lvlupSkill = 9;
					player.getVarsManager().sendVar(1230, 665);
				}
				break;
			case 137: // Slayer
				skillMenu = 20;
				if (player.getTemporaryAttributtes().remove("leveledUp[18]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 20);
				} else {
					lvlupSkill = 18;
					player.getVarsManager().sendVar(1230, 673);
				}
				break;
			case 138: // Hunter
				skillMenu = 23;
				if (player.getTemporaryAttributtes().remove("leveledUp[22]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 23);
				} else {
					lvlupSkill = 22;
					player.getVarsManager().sendVar(1230, 689);
				}
				break;
			case 139: // Mining
				skillMenu = 13;
				if (player.getTemporaryAttributtes().remove("leveledUp[14]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 13);
				} else {
					lvlupSkill = 14;
					player.getVarsManager().sendVar(1230, 110);
				}
				break;
			case 140: // Smithing
				skillMenu = 14;
				if (player.getTemporaryAttributtes().remove("leveledUp[13]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 14);
				} else {
					lvlupSkill = 13;
					player.getVarsManager().sendVar(1230, 115);
				}
				break;
			case 141: // Fishing
				skillMenu = 15;
				if (player.getTemporaryAttributtes().remove("leveledUp[10]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 15);
				} else {
					lvlupSkill = 10;
					player.getVarsManager().sendVar(1230, 120);
				}
				break;
			case 142: // Cooking
				skillMenu = 16;
				if (player.getTemporaryAttributtes().remove("leveledUp[7]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 16);
				} else {
					lvlupSkill = 7;
					player.getVarsManager().sendVar(1230, 641);
				}
				break;
			case 143: // Firemaking
				skillMenu = 17;
				if (player.getTemporaryAttributtes().remove("leveledUp[11]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 17);
				} else {
					lvlupSkill = 11;
					player.getVarsManager().sendVar(1230, 649);
				}
				break;
			case 144: // Woodcutting
				skillMenu = 18;
				if (player.getTemporaryAttributtes().remove("leveledUp[8]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 18);
				} else {
					lvlupSkill = 8;
					player.getVarsManager().sendVar(1230, 660);
				}
				break;
			case 145: // Farming
				skillMenu = 21;
				if (player.getTemporaryAttributtes().remove("leveledUp[19]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 21);
				} else {
					lvlupSkill = 19;
					player.getVarsManager().sendVar(1230, 681);
				}
				break;
			case 146: // Summoning
				skillMenu = 24;
				if (player.getTemporaryAttributtes().remove("leveledUp[23]") != Boolean.TRUE) {
					player.getVarsManager().sendVar(965, 24);
				} else {
					lvlupSkill = 23;
					player.getVarsManager().sendVar(1230, 705);
				}
				break;
			}

			player.getInterfaceManager().sendInterface(lvlupSkill != -1 ? 741 : 499);

			// openSkillGuide(player);
			if (lvlupSkill != -1)
				LevelUp.switchFlash(player, lvlupSkill, false);
			if (skillMenu != -1)
				player.getTemporaryAttributtes().put("skillMenu", skillMenu);
		} else if (interfaceId == 1218) {
			if ((componentId >= 33 && componentId <= 55) || componentId == 120 || componentId == 151 || componentId == 189)
				player.getInterfaceManager().setInterface(false, 1218, 1, 1217); // seems
			// to
			// fix
		} else if (interfaceId == 499) {
			int skillMenu = -1;
			if (player.getTemporaryAttributtes().get("skillMenu") != null)
				skillMenu = (Integer) player.getTemporaryAttributtes().get("skillMenu");
			if (componentId >= 10 && componentId <= 25)
				player.getVarsManager().sendVar(965, ((componentId - 10) * 1024) + skillMenu);
			else if (componentId == 29)
				// close inter
				player.stopAll();

		} else if (interfaceId == 387) {
			if (player.getInterfaceManager().containsInventoryInter())
				return;
			if (componentId == 8) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_HAT);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_HAT);
			} else if (componentId == 11) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_CAPE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_CAPE);
			} else if (componentId == 14) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET) {
					ItemTransportation.sendTeleport(player, player.getEquipment().getItem(Equipment.getItemSlot(slotId2)), 0, true);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET) {
					ItemTransportation.sendTeleport(player, player.getEquipment().getItem(Equipment.getItemSlot(slotId2)), 1, true);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET) {
					ItemTransportation.sendTeleport(player, player.getEquipment().getItem(Equipment.getItemSlot(slotId2)), 2, true);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					ItemTransportation.sendTeleport(player, player.getEquipment().getItem(Equipment.getItemSlot(slotId2)), 3, true);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_AMULET);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_AMULET);
			} else if (componentId == 17) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET) {
					int weaponId = player.getEquipment().getWeaponId();
					if (weaponId == 20171 || weaponId == 20173) { // zaryte
																	// bow
						player.getCharges().checkCharges(player.getEquipment().getItem(3).getName() + ": has ## shots remaining.", weaponId);
					} else if (weaponId == 15484)
						player.getInterfaceManager().gazeOrbOfOculus();
					else if (weaponId == 14057) // broomstick
						SorceressGarden.teleportToSocreressGarden(player, true);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_WEAPON);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_WEAPON);
			} else if (componentId == 20) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_CHEST);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_CHEST);
			} else if (componentId == 23) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_SHIELD);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_SHIELD);

			} else if (componentId == 26) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_LEGS);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_LEGS);
			} else if (componentId == 29) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_HANDS);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_HANDS);
			} else if (componentId == 32) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_FEET);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_FEET);
			} else if (componentId == 35) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_RING);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_RING);
			} else if (componentId == 38) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					ButtonHandler.sendRemove(player, Equipment.SLOT_ARROWS);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getEquipment().sendExamine(Equipment.SLOT_ARROWS);

			} else if (componentId == 45) {
				player.stopAll();
				openItemsKeptOnDeath(player);
			} else if (componentId == 42) {
				if (player.getInterfaceManager().containsScreenInter() || player.isLocked()) {
					player.getSocialManager().sendGameMessage("Please finish what you're doing before opening the price checker.");
					return;
				}
				player.stopAll();
				player.getPriceCheckManager().openPriceCheck();
			} else if (componentId == 39) {
				openEquipmentBonuses(player);
			}
		} else if (interfaceId == 103) {
			if (componentId == 13) {
				player.closeInterfaces();
			}
		} else if (interfaceId == 17) {
			if (componentId == 28)
				sendItemsKeptOnDeath(player, player.getVarsManager().getBitValue(9226) == 0);
		} else if (interfaceId == 620) {
			if (componentId == 25) {// 2518
				Shop shop = (Shop) player.getTemporaryAttributtes().get("Shop");
				if (shop == null)
					return;
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					shop.sendInfo(player, slotId, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					shop.buy(player, slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					shop.buy(player, slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					shop.buy(player, slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
					shop.buy(player, slotId, 50);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON6_PACKET)
					shop.buy(player, slotId, 500);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON7_PACKET)
					shop.sendExamine(player, slotId);
			} else if (componentId == 18) {
				player.closeInterfaces();
			}
		} else if (interfaceId == 621) {
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getInventory().sendExamine(slotId);
				else {
					Shop shop = (Shop) player.getTemporaryAttributtes().get("Shop");
					if (shop == null)
						return;
					if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
						shop.sendValue(player, slotId);
					else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
						shop.sell(player, slotId, 1);
					else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
						shop.sell(player, slotId, 5);
					else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
						shop.sell(player, slotId, 10);
					else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
						shop.sell(player, slotId, 50);
				}
			}
		} else if (interfaceId == 640) {
			if (componentId == 18 || componentId == 22) {
				player.getTemporaryAttributtes().put("WillDuelFriendly", true);
				player.getVarsManager().sendVar(283, 67108864);
			} else if (componentId == 19 || componentId == 21) {
				if (player.isStarter()) {
					player.getSocialManager().sendGameMessage("You can't stake for the first half hour after creating account.");
					return;
				}
				player.getTemporaryAttributtes().put("WillDuelFriendly", false);
				player.getVarsManager().sendVar(283, 134217728);
			} else if (componentId == 20) {
				DuelControler.challenge(player);
			}
		} else if (interfaceId == 650) {
			if (componentId == 15) {
				player.stopAll();
				player.setNextWorldTile(new WorldTile(2974, 4384, player.getPlane()));
				player.getControlerManager().startControler("CorpBeastControler");
			} else if (componentId == 16)
				player.closeInterfaces();
		} else if (interfaceId == 667) {
			if (componentId == 14) {
				if (slotId >= 14)
					return;
				Item item = player.getEquipment().getItem(slotId);
				if (item == null)
					return;
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getSocialManager().sendGameMessage(ItemExamines.getExamine(item));
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET) {
					sendRemove(player, slotId);
					ButtonHandler.refreshEquipBonuses(player);
				}
			} else if (componentId == 11) {
				player.closeInterfaces();
			}
		} else if (interfaceId == 670) {
			if (componentId == 0) {
				if (slotId >= player.getInventory().getItemsContainerSize())
					return;
				Item item = player.getInventory().getItem(slotId);
				if (item == null)
					return;
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET) {
					if (sendWear(player, slotId, item.getId()))
						ButtonHandler.refreshEquipBonuses(player);
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == Inventory.INVENTORY_INTERFACE) { // inventory
			if (componentId == 0) {
				if (slotId > 27 || player.getInterfaceManager().containsInventoryInter())
					return;
				Item item = player.getInventory().getItem(slotId);
				if (item == null || item.getId() != slotId2)
					return;
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					InventoryOptionsHandler.handleItemOption1(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					InventoryOptionsHandler.handleItemOption2(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					InventoryOptionsHandler.handleItemOption3(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					InventoryOptionsHandler.handleItemOption4(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
					InventoryOptionsHandler.handleItemOption5(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON6_PACKET)
					InventoryOptionsHandler.handleItemOption6(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON7_PACKET)
					InventoryOptionsHandler.handleItemOption7(player, slotId, slotId2, item);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					InventoryOptionsHandler.handleItemOption8(player, slotId, slotId2, item);
			}
		} else if (interfaceId == 749) {
			if (componentId == 1) {

				CoresManager.fastExecutor.schedule(new TimerTask() {
					@Override
					public void run() {
						try {
							WorldTasksManager.schedule(new WorldTask() {

								@Override
								public void run() {
									if (player.isDead())
										return;
									if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET) // activate
										player.getPrayer().switchQuickPrayers();
									else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET) // switch
										player.getPrayer().switchSettingQuickPrayer();
								}
							});
						} catch (Throwable e) {
							Logger.handle(e);
						}
					}
				}, 300);
			}

		} else if (interfaceId == 11) {
			if (componentId == 17) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getBank().depositItem(slotId, 1, false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getBank().depositItem(slotId, 5, false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getBank().depositItem(slotId, 10, false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getBank().depositItem(slotId, Integer.MAX_VALUE, false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("bank_item_X_Slot", slotId);
					player.getTemporaryAttributtes().remove("bank_isWithdraw");
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getInventory().sendExamine(slotId);
			} else if (componentId == 18)
				player.getBank().depositAllInventory(false);
			else if (componentId == 22)
				player.getBank().depositAllEquipment(false);
			else if (componentId == 24)
				player.getBank().depositAllBob(false);
		} else if (interfaceId == 762) {
			if (componentId == 15)
				player.getBank().switchInsertItems();
			else if (componentId == 19)
				player.getBank().switchWithdrawNotes();
			else if (componentId == 27)
				player.getBank().depositAllInventory(true);
			else if (componentId == 29)
				player.getBank().depositAllEquipment(true);
			else if (componentId == 37) {
				player.closeInterfaces();
			} else if (componentId == 17) {
				player.getPackets().sendGlobalConfig(11, -1);
				player.getPackets().sendGlobalConfig(190, 1); // searchable again
			} else if (componentId == 38) {
				player.closeInterfaces();
				player.getInterfaceManager().sendInterface(767);
				player.setCloseInterfacesEvent(new Runnable() {
					@Override
					public void run() {
						player.getBank().openBank();
					}
				});
				// 40, 56
			} else if (componentId >= 40 && componentId <= 56) {
				int tabId = 8 - ((componentId - 40) / 2);
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getBank().setCurrentTab(tabId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getBank().collapse(tabId);
			} else if (componentId == 87) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getBank().withdrawItem(slotId, 1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getBank().withdrawItem(slotId, 5);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getBank().withdrawItem(slotId, 10);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getBank().withdrawLastAmount(slotId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("bank_item_X_Slot", slotId);
					player.getTemporaryAttributtes().put("bank_isWithdraw", Boolean.TRUE);
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getBank().withdrawItem(slotId, Integer.MAX_VALUE);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON6_PACKET)
					player.getBank().withdrawItemButOne(slotId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getBank().sendExamine(slotId);

			} else if (componentId == 119) {
				openEquipmentBonuses(player);
			}
		} else if (interfaceId == 763) {
			if (componentId == 0) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
					player.getBank().depositItem(slotId, 1, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getBank().depositItem(slotId, 5, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getBank().depositItem(slotId, 10, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getBank().depositLastAmount(slotId);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET) {
					player.getTemporaryAttributtes().put("bank_item_X_Slot", slotId);
					player.getTemporaryAttributtes().remove("bank_isWithdraw");
					player.getPackets().sendRunScript(108, new Object[] { "Enter Amount:" });
				} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET)
					player.getBank().depositItem(slotId, Integer.MAX_VALUE, true);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON8_PACKET)
					player.getInventory().sendExamine(slotId);
			}
		} else if (interfaceId == 767) {
			if (componentId == 10)
				player.getBank().openBank();
		} else if (interfaceId == 884) {
			if (componentId == 4) {
				int weaponId = player.getEquipment().getWeaponId();
				if (player.hasInstantSpecial(weaponId)) {
					player.performInstantSpecial(weaponId);
					return;
				}
				submitSpecialRequest(player);
			} else if (componentId >= 11 && componentId <= 14)
				player.getCombatDefinitions().setAttackStyle(componentId - 11);
			else if (componentId == 15)
				player.getCombatDefinitions().switchAutoRelatie();
		} else if (interfaceId == 755) {
			if (componentId == 47)
				player.getPackets().sendRootInterface(player.getInterfaceManager().hasRezizableScreen() ? 746 : 548, 2);
			else if (componentId == 46) {
				player.getHintIconsManager().removeAll();// TODO find
															// hintIcon
				// index
				player.getVarsManager().sendVar(1159, 1);
			}
		} else if (interfaceId == 1056) {
			if (componentId == 173)
				player.getInterfaceManager().sendInterface(917);
		} else if (interfaceId == 751) {
			if (componentId == 28)
				ReportAbuse.report(player);
			else if (componentId == 13) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.getFriendsIgnores().setPrivateStatus(0);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.getFriendsIgnores().setPrivateStatus(1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.getFriendsIgnores().setPrivateStatus(2);
			} else if (componentId == 5) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.setFilterGame(false);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.setFilterGame(true);
			} else if (componentId == 9) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.setPublicStatus(0);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.setPublicStatus(1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.setPublicStatus(2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON5_PACKET)
					player.setPublicStatus(3);
			} /*
				 * else if (componentId == 0) { if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
				 * player.getFriendsIgnores().setFriendsChatStatus(0); else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
				 * player.getFriendsIgnores().setFriendsChatStatus(1); else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
				 * player.getFriendsIgnores().setFriendsChatStatus(2); }
				 */ else if (componentId == 17) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.setClanStatus(0);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.setClanStatus(1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.setClanStatus(2);
			} else if (componentId == 21) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.setTradeStatus(0);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.setTradeStatus(1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.setTradeStatus(2);
			} else if (componentId == 25) {
				if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
					player.setAssistStatus(0);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET)
					player.setAssistStatus(1);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
					player.setAssistStatus(2);
				else if (packetId == WorldPacketsDecoder.ACTION_BUTTON9_PACKET) {
					// ASSIST XP Earned/Time
				}
			}
		} else if (interfaceId == 205)
			PlayerLook.handleMageMakeOverButtons(player, componentId);
		else if (interfaceId == 900)
			PlayerLook.handleCharacterCustomizingButtons(player, componentId, slotId);
		else if (interfaceId == 589 || interfaceId == 590) {
			player.getFriendsIgnores().handleFriendChatButtons(interfaceId, componentId, packetId);
		} else if (interfaceId == 1079)
			player.closeInterfaces();
		else if (interfaceId == 374) {
			if (componentId >= 5 && componentId <= 9)
				player.setNextWorldTile(new WorldTile(FightPitsViewingOrb.ORB_TELEPORTS[componentId - 5]));
			else if (componentId == 15)
				player.stopAll();
		} else if (interfaceId == 105 || interfaceId == 107 || interfaceId == 109 || interfaceId == 449)
			player.getGeManager().handleButtons(interfaceId, componentId, slotId, packetId);
		else if (interfaceId == 1092) {
			player.stopAll();
			WorldTile destTile = null;
			switch (componentId) {
			case 47:
				destTile = HomeTeleport.LUMBRIDGE_LODE_STONE;
				break;
			case 42:
				destTile = HomeTeleport.BURTHORPE_LODE_STONE;
				break;
			case 39:
				destTile = HomeTeleport.LUNAR_ISLE_LODE_STONE;
				break;
			case 7:
				destTile = HomeTeleport.BANDIT_CAMP_LODE_STONE;
				break;
			case 50:
				destTile = HomeTeleport.TAVERLY_LODE_STONE;
				break;
			case 40:
				destTile = HomeTeleport.ALKARID_LODE_STONE;
				break;
			case 51:
				destTile = HomeTeleport.VARROCK_LODE_STONE;
				break;
			case 45:
				destTile = HomeTeleport.EDGEVILLE_LODE_STONE;
				break;
			case 46:
				destTile = HomeTeleport.FALADOR_LODE_STONE;
				break;
			case 48:
				destTile = HomeTeleport.PORT_SARIM_LODE_STONE;
				break;
			case 44:
				destTile = HomeTeleport.DRAYNOR_VILLAGE_LODE_STONE;
				break;
			case 41:
				destTile = HomeTeleport.ARDOUGNE_LODE_STONE;
				break;
			case 43:
				destTile = HomeTeleport.CATHERBAY_LODE_STONE;
				break;
			case 52:
				destTile = HomeTeleport.YANILLE_LODE_STONE;
				break;
			case 49:
				destTile = HomeTeleport.SEERS_VILLAGE_LODE_STONE;
				break;
			}
			if (destTile != null)
				player.getActionManager().setAction(new HomeTeleport(destTile));
		} else if (interfaceId == 594) {
			if (componentId == 48) {
				player.closeInterfaces();
			}
		} else if (interfaceId == 259) {
			AchievementDiary.handleButtons(player, interfaceId, componentId, slotId, slotId2, packetId);
		} else if (interfaceId == 742) {
			player.closeInterfaces();
		}
		if (Settings.DEBUG)
			Logger.log("ButtonHandler", "InterfaceId " + interfaceId + ", componentId " + componentId + ", slotId " + slotId + ", slotId2 " + slotId2 + ", PacketId: " + packetId);
	}

	public static void sendRemove(Player player, int slotId) {
		if (slotId >= 15)
			return;
		player.stopAll(false, false);
		Item item = player.getEquipment().getItem(slotId);
		if (item == null || !player.getInventory().addItem(item.getId(), item.getAmount()))
			return;
		player.getEquipment().getItems().set(slotId, null);
		player.getEquipment().refresh(slotId);
		player.getAppearence().generateAppearenceData();
		if (Runecrafting.isTiara(item.getId()))
			player.getVarsManager().sendVar(491, 0);
		if (slotId == 3)
			player.getCombatDefinitions().desecreaseSpecialAttack(0);
	}

	public static boolean sendWear(Player player, int slotId, int itemId) {
		player.stopAll(false, false);
		Item item = player.getInventory().getItem(slotId);
		if (item == null || item.getId() != itemId)
			return false;
		if (item.getDefinitions().isNoted() || !item.getDefinitions().isWearItem(player.getAppearence().isMale())) {
			player.getSocialManager().sendGameMessage("You can't wear that.");
			return true;
		}
		int targetSlot = Equipment.getItemSlot(itemId);
		if (targetSlot == -1) {
			player.getSocialManager().sendGameMessage("You can't wear that.");
			return true;
		}
		if (!ItemConstants.canWear(item, player))
			return true;
		boolean isTwoHandedWeapon = targetSlot == 3 && Equipment.isTwoHandedWeapon(item);
		if (isTwoHandedWeapon && !player.getInventory().hasFreeSlots() && player.getEquipment().hasShield()) {
			player.getSocialManager().sendGameMessage("Not enough free space in your inventory.");
			return true;
		}
		HashMap<Integer, Integer> requiriments = item.getDefinitions().getWearingSkillRequiriments();
		boolean hasRequiriments = true;
		if (requiriments != null) {
			for (int skillId : requiriments.keySet()) {
				if (skillId > 24 || skillId < 0)
					continue;
				int level = requiriments.get(skillId);
				if (level < 0 || level > 120)
					continue;
				if (player.getSkills().getLevelForXp(skillId) < level) {
					if (hasRequiriments) {
						player.getSocialManager().sendGameMessage("You are not high enough level to use this item.");
					}
					hasRequiriments = false;
					String name = Skills.SKILL_NAME[skillId].toLowerCase();
					player.getSocialManager().sendGameMessage("You need to have a" + (name.startsWith("a") ? "n" : "") + " " + name + " level of " + level + ".");
				}

			}
		}
		if (!hasRequiriments)
			return true;
		if (!player.getControlerManager().canEquip(targetSlot, itemId))
			return false;
		player.stopAll(false, false);
		player.getInventory().deleteItem(slotId, item);
		if (targetSlot == 3) {
			if (isTwoHandedWeapon && player.getEquipment().getItem(5) != null) {
				if (!player.getInventory().addItem(player.getEquipment().getItem(5).getId(), player.getEquipment().getItem(5).getAmount())) {
					player.getInventory().getItems().set(slotId, item);
					player.getInventory().refresh(slotId);
					return true;
				}
				player.getEquipment().getItems().set(5, null);
			}
		} else if (targetSlot == 5) {
			if (player.getEquipment().getItem(3) != null && Equipment.isTwoHandedWeapon(player.getEquipment().getItem(3))) {
				if (!player.getInventory().addItem(player.getEquipment().getItem(3).getId(), player.getEquipment().getItem(3).getAmount())) {
					player.getInventory().getItems().set(slotId, item);
					player.getInventory().refresh(slotId);
					return true;
				}
				player.getEquipment().getItems().set(3, null);
			}

		}
		if (player.getEquipment().getItem(targetSlot) != null && (itemId != player.getEquipment().getItem(targetSlot).getId() || !item.getDefinitions().isStackable())) {
			if (player.getInventory().getItems().get(slotId) == null) {
				player.getInventory().getItems().set(slotId, new Item(player.getEquipment().getItem(targetSlot).getId(), player.getEquipment().getItem(targetSlot).getAmount()));
				player.getInventory().refresh(slotId);
			} else
				player.getInventory().addItem(new Item(player.getEquipment().getItem(targetSlot).getId(), player.getEquipment().getItem(targetSlot).getAmount()));
			player.getEquipment().getItems().set(targetSlot, null);
		}
		int oldAmt = 0;
		if (player.getEquipment().getItem(targetSlot) != null) {
			oldAmt = player.getEquipment().getItem(targetSlot).getAmount();
		}
		Item item2 = new Item(itemId, oldAmt + item.getAmount());
		player.getEquipment().getItems().set(targetSlot, item2);
		player.getEquipment().refresh(targetSlot, targetSlot == 3 ? 5 : targetSlot == 3 ? 0 : 3);
		player.getAppearence().generateAppearenceData();
		player.getPackets().sendSound(2240, 0, 1);
		if (targetSlot == 3)
			player.getCombatDefinitions().desecreaseSpecialAttack(0);
		player.getCharges().wear(targetSlot);
		return true;
	}

	public static boolean sendWear2(Player player, int slotId, int itemId) {
		System.out.println(slotId + ", " + itemId);
		if (player.hasFinished() || player.isDead())
			return false;
		player.stopAll(false, false);
		Item item = player.getInventory().getItem(slotId);
		if (item == null || item.getId() != itemId)
			return false;
		if (item.getDefinitions().isNoted() || !item.getDefinitions().isWearItem(player.getAppearence().isMale()) && itemId != 4084) {
			player.getSocialManager().sendGameMessage("You can't wear that.");
			return false;
		}
		int targetSlot = Equipment.getItemSlot(itemId);
		if (itemId == 4084)
			targetSlot = 3;
		if (targetSlot == -1) {
			player.getSocialManager().sendGameMessage("You can't wear that.");
			return false;
		}
		if (!ItemConstants.canWear(item, player))
			return false;
		boolean isTwoHandedWeapon = targetSlot == 3 && Equipment.isTwoHandedWeapon(item);
		if (isTwoHandedWeapon && !player.getInventory().hasFreeSlots() && player.getEquipment().hasShield()) {
			player.getSocialManager().sendGameMessage("Not enough free space in your inventory.");
			return false;
		}
		HashMap<Integer, Integer> requiriments = item.getDefinitions().getWearingSkillRequiriments();
		boolean hasRequiriments = true;
		if (requiriments != null) {
			for (int skillId : requiriments.keySet()) {
				if (skillId > 24 || skillId < 0)
					continue;
				int level = requiriments.get(skillId);
				if (level < 0 || level > 120)
					continue;
				if (player.getSkills().getLevelForXp(skillId) < level) {
					if (hasRequiriments)
						player.getSocialManager().sendGameMessage("You are not high enough level to use this item.");
					hasRequiriments = false;
					String name = Skills.SKILL_NAME[skillId].toLowerCase();
					player.getSocialManager().sendGameMessage("You need to have a" + (name.startsWith("a") ? "n" : "") + " " + name + " level of " + level + ".");
				}

			}
		}
		if (!hasRequiriments)
			return false;
		if (!player.getControlerManager().canEquip(targetSlot, itemId))
			return false;
		player.getInventory().getItems().remove(slotId, item);
		if (targetSlot == 3) {
			if (isTwoHandedWeapon && player.getEquipment().getItem(5) != null) {
				if (!player.getInventory().getItems().add(player.getEquipment().getItem(5))) {
					player.getInventory().getItems().set(slotId, item);
					return false;
				}
				player.getEquipment().getItems().set(5, null);
			}
		} else if (targetSlot == 5) {
			if (player.getEquipment().getItem(3) != null && Equipment.isTwoHandedWeapon(player.getEquipment().getItem(3))) {
				if (!player.getInventory().getItems().add(player.getEquipment().getItem(3))) {
					player.getInventory().getItems().set(slotId, item);
					return false;
				}
				player.getEquipment().getItems().set(3, null);
			}

		}
		if (player.getEquipment().getItem(targetSlot) != null && (itemId != player.getEquipment().getItem(targetSlot).getId() || !item.getDefinitions().isStackable())) {
			if (player.getInventory().getItems().get(slotId) == null) {
				player.getInventory().getItems().set(slotId, new Item(player.getEquipment().getItem(targetSlot).getId(), player.getEquipment().getItem(targetSlot).getAmount()));
			} else
				player.getInventory().getItems().add(new Item(player.getEquipment().getItem(targetSlot).getId(), player.getEquipment().getItem(targetSlot).getAmount()));
			player.getEquipment().getItems().set(targetSlot, null);
		}
		int oldAmt = 0;
		if (player.getEquipment().getItem(targetSlot) != null) {
			oldAmt = player.getEquipment().getItem(targetSlot).getAmount();
		}
		Item item2 = new Item(itemId, oldAmt + item.getAmount());
		player.getEquipment().getItems().set(targetSlot, item2);
		player.getEquipment().refresh(targetSlot, targetSlot == 3 ? 5 : targetSlot == 3 ? 0 : 3);
		if (targetSlot == 3)
			player.getCombatDefinitions().desecreaseSpecialAttack(0);
		player.getCharges().wear(targetSlot);
		return true;
	}

	public static void submitSpecialRequest(final Player player) {
		CoresManager.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							if (player.isDead())
								return;
							player.getCombatDefinitions().switchUsingSpecialAttack();
						}
					}, 0);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 300);
	}

	public static void sendWear(Player player, int[] slotIds) {
		if (player.hasFinished() || player.isDead()) {
			System.out.println("THIS");
			return;
		}
		boolean worn = false;
		Item[] copy = player.getInventory().getItems().getItemsCopy();
		for (int slotId : slotIds) {
			Item item = player.getInventory().getItem(slotId);
			if (item == null)
				continue;
			if (sendWear2(player, slotId, item.getId()))
				worn = true;
		}
		player.getInventory().refreshItems(copy);
		if (worn) {
			player.getAppearence().generateAppearenceData();
			player.getPackets().sendSound(2240, 0, 1);
		}
	}

	public static void openItemsKeptOnDeath(Player player) {
		player.getInterfaceManager().sendInterface(102);
		sendItemsKeptOnDeath(player, Wilderness.isAtWild(player));
	}

	public static void sendItemsKeptOnDeath(Player player, boolean wilderness) {
		boolean skulled = player.hasSkull();
		Integer[][] slots = GraveStone.getItemSlotsKeptOnDeath(player, wilderness, skulled, player.getPrayer().isProtectingItem());
		Item[][] items = GraveStone.getItemsKeptOnDeath(player, slots);
		long riskedWealth = 0;
		long carriedWealth = 0;
		for (Item item : items[1])
			carriedWealth = riskedWealth += GrandExchange.getPrice(item.getId()) * item.getAmount();
		for (Item item : items[0])
			carriedWealth += GrandExchange.getPrice(item.getId()) * item.getAmount();

		player.getPackets().sendIComponentSettings(211, 4, 0, 2, 6684690);
		player.getPackets().sendIComponentSettings(211, 42, 0, 2, 6684693);
		
		int[] itemIds = new int[4];
		Arrays.fill(itemIds, -1);
		for (int i = 0; i <= items.length; i++) {
			itemIds[i] = items[0][i].getId();
		}
		Object[] params = { 11510, 12749, "", 0, itemIds[3], itemIds[2], itemIds[1], itemIds[0], items.length, 0 };
		player.getPackets().sendRunScript(118, params);
		
		StringBuffer text = new StringBuffer();
		text.append("The number of items kept").append("<br>").append("on death is normally 3.").append("<br>").append("<br>").append("<br>");
		if (wilderness) {
			text.append("Your gravestone will not").append("<br>").append("appear.");
		} else {
			int time = GraveStone.getMaximumTicks(player.getGraveStone());
			int seconds = (int) (time * 0.6);
			int minutes = seconds / 60;
			seconds -= minutes * 60;

			text.append("Gravestone:").append("<br>").append(ClientScriptMap.getMap(1099).getStringValue(player.getGraveStone())).append("<br>").append("<br>").append("Initial duration:").append("<br>").append(minutes + ":" + (seconds < 10 ? "0" : "") + seconds).append("<br>");
		}
		if (wilderness)
			text.append("Your hub will be set to:").append("<br>").append("Edgeville.");
		player.getPackets().sendIComponentText(102, 29, text.toString());

		StringBuffer carried = new StringBuffer().append("Carried wealth:").append("<br>").append(carriedWealth > Integer.MAX_VALUE ? "Too high!" : "Too high!"/* Utils.getFormattedNumber((int) carriedWealth) */);
		player.getPackets().sendIComponentText(102, 31, carried.toString());

		StringBuffer risked = new StringBuffer().append("Risked wealth:").append("<br>").append(riskedWealth > Integer.MAX_VALUE ? "Too high!" : "Too high!"/* Utils.getFormattedNumber((int) carriedWealth) */);
		player.getPackets().sendIComponentText(102, 32, risked.toString());

		if (wilderness) {
			StringBuffer hub = new StringBuffer().append("Your hub will be set to:").append("<br>").append("Edgeville.");
			player.getPackets().sendIComponentText(102, 30, hub.toString());
		} else
			player.getPackets().sendIComponentText(102, 30, "");
	}

	public static void openEquipmentBonuses(final Player player) {
		player.stopAll();
		player.getInterfaceManager().sendInventoryInterface(670);
		player.getInterfaceManager().sendInterface(667);
		player.getPackets().sendRunScript(787, 1);
		player.getPackets().sendItems(93, player.getInventory().getItems());
		player.getPackets().sendInterSetItemsOptionsScript(670, 0, 93, 4, 7, "Wear", "Examine");
		player.getPackets().sendUnlockIComponentOptionSlots(670, 0, 0, 27, 0, 1, 2, 3);
		player.getPackets().sendIComponentSettings(667, 14, 0, 13, 1538);
		refreshEquipBonuses(player);
	}

	private static String equipmentBonusText(Player player, String msg, int bonusId) {
		int bonus = player.getCombatDefinitions().getBonuses()[bonusId];
		if (bonus < 0)
			return msg.replace("+", "") + "" + bonus;
		return msg + "" + bonus; // only use if it requires it to be negative.

	}

	public static void refreshEquipBonuses(Player player) {
		// max = 51
		int start = 36;

		player.getPackets().sendIComponentText(667, start, equipmentBonusText(player, "Stab +", 0));
		player.getPackets().sendIComponentText(667, start + 1, equipmentBonusText(player, "Slash: +", 1));
		player.getPackets().sendIComponentText(667, start + 2, equipmentBonusText(player, "Crush: +", 2));
		player.getPackets().sendIComponentText(667, start + 3, equipmentBonusText(player, "Magic: +", 3));
		player.getPackets().sendIComponentText(667, start + 4, equipmentBonusText(player, "Ranged: +", 4));
		player.getPackets().sendIComponentText(667, start + 5, equipmentBonusText(player, "Stab: +", 5));
		player.getPackets().sendIComponentText(667, start + 6, equipmentBonusText(player, "Slash: +", 6));
		player.getPackets().sendIComponentText(667, start + 7, equipmentBonusText(player, "Crush: +", 7));
		player.getPackets().sendIComponentText(667, start + 8, equipmentBonusText(player, "Magic: +", 8));
		player.getPackets().sendIComponentText(667, start + 9, equipmentBonusText(player, "Range: +", 9));
		player.getPackets().sendIComponentText(667, start + 10, equipmentBonusText(player, "Summoning: +", 10));

		player.getPackets().sendIComponentText(667, start + 12, "Strength: +" + player.getCombatDefinitions().getBonuses()[14]);
		player.getPackets().sendIComponentText(667, start + 13, "Ranged Strength: +" + player.getCombatDefinitions().getBonuses()[15]);
		player.getPackets().sendIComponentText(667, start + 14, equipmentBonusText(player, "Prayer: +", 16));
		player.getPackets().sendIComponentText(667, start + 15, "Magic Damage: +" + player.getCombatDefinitions().getBonuses()[17] + "%");
		player.getPackets().sendIComponentText(667, 32, "0 kg");
	}

	public static void openSkillGuide(Player player) {
		player.getInterfaceManager().setScreenInterface(317, 1218);
		player.getInterfaceManager().setInterface(false, 1218, 1, 1217); // seems
		// to
		// fix
	}
}
