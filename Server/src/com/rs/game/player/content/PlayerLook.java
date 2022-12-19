package com.rs.game.player.content;

import java.util.TimerTask;

import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.GeneralRequirementMap;
import com.rs.cores.CoresManager;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;

public final class PlayerLook {

	public static void openCharacterCustomizing(Player player) {
		showBooth(player);
		player.getPackets().sendRootInterface(900, 0);
//		player.getPackets().sendIComponentSettings(900, 73, 0, ClientScriptMap.getMap(2348).getSize() * 2, 0);
//		player.getPackets().sendIComponentSettings(900, 66, 0, 130, 0);

	}

	public static void handleCharacterCustomizingButtons(Player player, int buttonId, int slotId) {
		boolean male = player.getAppearence().isMale();
		final int SKIN = 0;
		final int HAIR = 1;
		final int BEARD = 2;
		final int TOP = 3;
		final int SLEEVES = 4;
		final int HANDS = 5;
		final int LEGS = 6;
		final int BOOTS = 7;

		if (buttonId == 81) { // confirm
			player.getPackets().sendRootInterface(player.getInterfaceManager().hasRezizableScreen() ? 746 : 548, 0);
			player.getTemporaryAttributtes().remove("design_option");
			player.getAppearence().generateAppearenceData();
			hideBooth(player);

		} else if (buttonId == 27) {
			setDesign(player, 0, buttonId - 103);

		} else if (buttonId == 15 || buttonId == 20) {
			setGender(player, buttonId == 15);
			CoresManager.fastExecutor.schedule(new TimerTask() {
				@Override
				public void run() {
					try {
						WorldTasksManager.schedule(new WorldTask() {

							@Override
							public void run() {
								if (player.isDead())
									return;
								player.getPackets().sendRunScriptBlank(2731);
							}
						});
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 600);

		} else if (buttonId >= 33 && buttonId <= 61) {
			int option = (buttonId - 33) / 4;
			player.getTemporaryAttributtes().put("design_option", option);
		} else if (buttonId == 73) { // color
			int colourIndex = (slotId - 1) / 2;
			Integer designIndex = (Integer) player.getTemporaryAttributtes().get("design_option");
			if (designIndex == SKIN || designIndex == null) {
				setSkin(player, colourIndex);
			} else if (designIndex == HAIR) {
				player.getAppearence().setHairColor(ClientScriptMap.getMap(2345).getIntValue(colourIndex));

			} else if (designIndex == TOP) {
				player.getAppearence().setTopColor(ClientScriptMap.getMap(2349).getIntValue(colourIndex));
			} else if (designIndex == LEGS) {
				player.getAppearence().setLegsColor(ClientScriptMap.getMap(2351).getIntValue(colourIndex));
			} else if (designIndex == BOOTS) {
				player.getAppearence().setBootsColor(ClientScriptMap.getMap(1589).getIntValue(colourIndex) - 3680);
			}
		} else if (buttonId == 66) { // styles
			int styleIndex = (slotId - 2) / 3;
			Integer designIndex = (Integer) player.getTemporaryAttributtes().get("design_option");

			if (designIndex == HAIR || designIndex == null) {
				// 2341 female hair styles
				int hairId = GeneralRequirementMap.getMap(ClientScriptMap.getMap(!male ? 2341 : 2338).getIntValue(styleIndex)).getIntValue(791);
				player.getAppearence().setHairStyle(hairId);

			} else if (designIndex == BEARD && male) {
				int beardId = ClientScriptMap.getMap(703).getIntValue(styleIndex);
				player.getAppearence().setBeardStyle(beardId);
			} else if (designIndex == TOP) {
				int topId = ClientScriptMap.getMap(male ? 690 : 1591).getIntValue(styleIndex);
				player.getAppearence().setTopStyle(topId);
			} else if (designIndex == SLEEVES) {
				int sleeves = ClientScriptMap.getMap(male ? 711 : 693).getIntValue(styleIndex);
				player.getAppearence().setArmsStyle(sleeves);
			} else if (designIndex == HANDS) {
				int wristId = ClientScriptMap.getMap(male ? 749 : 751).getIntValue(styleIndex);
				player.getAppearence().setWristsStyle(wristId);
			} else if (designIndex == LEGS) {
				int legsId = ClientScriptMap.getMap(male ? 1586 : 1607).getIntValue(styleIndex);
				player.getAppearence().setLegsStyle(legsId);
			} else if (designIndex == BOOTS) {
				int bootsIndex = ClientScriptMap.getMap(male ? 1136 : 1137).getIntValue(styleIndex);
				player.getAppearence().setBootsStyle(bootsIndex);
			}

		}

	}

	public static void setGender(Player player, boolean male) {
		if (player.getAppearence().isMale() == male)
			return;

		if (!male)
			player.getAppearence().female();
		else
			player.getAppearence().male();
		player.getAppearence().generateAppearenceData();
	}

	public static void setSkin(Player player, int index) {
		player.getAppearence().setSkinColor(ClientScriptMap.getMap(748).getIntValue(index));
	}

	public static void setDesign(Player player, int index1, int index2) {
		int map1 = ClientScriptMap.getMap(3278).getIntValue(index1);
		if (map1 == 0)
			return;
		boolean male = player.getAppearence().isMale();
		int map2Id = GeneralRequirementMap.getMap(map1).getIntValue((male ? 1169 : 1175) + index2);
		if (map2Id == 0)
			return;
		GeneralRequirementMap map = GeneralRequirementMap.getMap(map2Id);
		for (int i = 1182; i <= 1186; i++) {
			int value = map.getIntValue(i);
			if (value == -1)
				continue;
			player.getAppearence().setLook(i - 1180, value);
		}
		for (int i = 1187; i <= 1190; i++) {
			int value = map.getIntValue(i);
			if (value == -1)
				continue;
			player.getAppearence().setColor(i - 1186, value);
		}
		if (!player.getAppearence().isMale())
			player.getAppearence().setBeardStyle(player.getAppearence().getHairStyle());

	}

	public static void handleMageMakeOverButtons(Player player, int buttonId) {
		if (buttonId == 14 || buttonId == 16 || buttonId == 15 || buttonId == 17)
			player.getTemporaryAttributtes().put("MageMakeOverGender", buttonId == 14 || buttonId == 16);
		else if (buttonId >= 20 && buttonId <= 27) {

			int skin;

			if (buttonId == 20)
				skin = 7;
			else
				skin = buttonId - 21;

			player.getTemporaryAttributtes().put("MageMakeOverSkin", skin);
		} else if (buttonId == 36) {
			Boolean male = (Boolean) player.getTemporaryAttributtes().remove("MageMakeOverGender");
			Integer skin = (Integer) player.getTemporaryAttributtes().remove("MageMakeOverSkin");
			player.closeInterfaces();
			if (male == null || skin == null)
				return;
			if (male == player.getAppearence().isMale() && skin == player.getAppearence().getSkinColor())
				player.getDialogueManager().startDialogue("MakeOverMage", 2676, 1);
			else {
				player.getDialogueManager().startDialogue("MakeOverMage", 2676, 2);
				if (player.getAppearence().isMale() != male) {
					if (player.getEquipment().wearingArmour()) {
						player.getDialogueManager().startDialogue("SimpleMessage", "You cannot have armour on while " + "changing your gender!");
						return;
					}
					if (male)
						player.getAppearence().resetAppearence();
					else
						player.getAppearence().female();
				}
				player.getAppearence().setSkinColor(skin);
				player.getAppearence().generateAppearenceData();
			}
		}
	}

	public static void handleHairdresserSalonButtons(Player player, int buttonId, int slotId) {// Hair
		// and
		// color
		// match
		// button
		// count
		// so
		// just
		// loop
		// and
		// do ++, but cant find button ids
		if (buttonId == 6)
			player.getTemporaryAttributtes().put("hairSaloon", true);
		else if (buttonId == 7)
			player.getTemporaryAttributtes().put("hairSaloon", false);
		else if (buttonId == 18) {
			player.closeInterfaces();
		} else if (buttonId == 10) {
			Boolean hairSalon = (Boolean) player.getTemporaryAttributtes().get("hairSaloon");
			if (hairSalon != null && hairSalon) {
				int value = (int) ClientScriptMap.getMap(player.getAppearence().isMale() ? 2339 : 2342).getKeyForValue(slotId / 2);
				if (value == -1)
					return;
				player.getAppearence().setHairStyle(value);
			} else if (player.getAppearence().isMale()) {
				int value = ClientScriptMap.getMap(703).getIntValue(slotId / 2);
				if (value == -1)
					return;
				player.getAppearence().setBeardStyle(value);
			}
		} else if (buttonId == 16) {
			int value = ClientScriptMap.getMap(2345).getIntValue(slotId / 2);
			if (value == -1)
				return;
			player.getAppearence().setHairColor(value);
		}
	}

	// interface 900 is char customize

	public static void openMageMakeOver(Player player) {
		player.getInterfaceManager().sendInterface(205);
		player.getPackets().sendIComponentText(205, 36, "CONFIRM(0 GOLD)");
		player.getVarsManager().sendVarBit(6098, player.getAppearence().isMale() ? 0 : 1);
		player.getVarsManager().sendVarBit(6099, player.getAppearence().getSkinColor());
		player.getTemporaryAttributtes().put("MageMakeOverGender", player.getAppearence().isMale());
		player.getTemporaryAttributtes().put("MageMakeOverSkin", player.getAppearence().getSkinColor());
	}

	public static void handleThessaliasMakeOverButtons(Player player, int buttonId, int slotId) {

		if (buttonId == 91)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		else if (buttonId == 92) {
			// if (ClientScriptMap.getMap(
			// player.getAppearence().isMale() ? 690 : 1591)
			// .getKeyForValue(player.getAppearence().getTopStyle()) >= 32) {
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 1);
			// } else
			// player.getSocialManager().sendGameMessage(
			// "You can't select different arms to go with that top.");
		} else if (buttonId == 93)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 3);
		else if (buttonId == 87) { // confirm
			player.getTemporaryAttributtes().put("makeover_confirm", Boolean.TRUE);
			player.closeInterfaces();
		} else if (buttonId >= 81 && buttonId <= 85) { // set part
			Integer stage = (Integer) player.getTemporaryAttributtes().get("ThessaliasMakeOver");
			if (stage == null || stage == 0) {
				int offset = player.getAppearence().isMale() ? 14 : 11;

				player.getAppearence().setTopStyle((int) ClientScriptMap.getMap(player.getAppearence().isMale() ? 690 : 1591).getIntValue(slotId >= offset ? (slotId - offset) : slotId));
				player.getAppearence().setArmsStyle(player.getAppearence().isMale() ? 26 : 65); // default
				player.getAppearence().setWristsStyle(player.getAppearence().isMale() ? 34 : 68); // default
			} else if (stage == 1) { // arms
				int offset = player.getAppearence().isMale() ? 12 : 11;
				player.getAppearence().setArmsStyle((int) ClientScriptMap.getMap(player.getAppearence().isMale() ? 711 : 693).getIntValue(slotId >= offset ? (slotId - offset) : slotId));
			} else {
				int offset = player.getAppearence().isMale() ? 11 : 16;
				player.getAppearence().setLegsStyle((int) ClientScriptMap.getMap(player.getAppearence().isMale() ? 1586 : 1607).getIntValue(slotId >= offset ? slotId - offset : slotId));
			}
			player.getAppearence().generateAppearenceData();

		} else if (buttonId == 79) {// color
			Integer stage = (Integer) player.getTemporaryAttributtes().get("ThessaliasMakeOver");
			if (stage == null || stage == 0 || stage == 1)
				player.getAppearence().setTopColor(ClientScriptMap.getMap(2349).getIntValue(slotId - 29));
			else if (stage == 3)
				player.getAppearence().setLegsColor(ClientScriptMap.getMap(2349).getIntValue(slotId - 29));
		}
		player.getAppearence().generateAppearenceData();
	}

	public static void openThessaliasMakeOver(final Player player) {
		if (player.getEquipment().wearingArmour()) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 548, "You're not able to try on my clothes with all that armour. Take it off and then speak to me again.");
			return;
		}
		player.getInterfaceManager().sendInterface(729);
		showBooth(player);
		int[] oldLooks = new int[player.getAppearence().getLooks().length];
		byte[] oldColours = new byte[player.getAppearence().getColours().length];
		System.arraycopy(player.getAppearence().getLooks(), 0, oldLooks, 0, player.getAppearence().getLooks().length);
		System.arraycopy(player.getAppearence().getColours(), 0, oldColours, 0, player.getAppearence().getColours().length);

		player.getTemporaryAttributtes().put("old_styles", oldLooks);
		player.getTemporaryAttributtes().put("old_colours", oldColours);

		player.getPackets().sendRunScriptBlank(333); // scroll bars
		player.getPackets().sendIComponentText(729, 88, "Free!");
		player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		for (int i = 0; i < 80; i++) {
			player.getPackets().sendHideIComponent(729, i, false);
		}
		// unlock tops
		player.getPackets().sendIComponentSettings(729, 81, 0, ClientScriptMap.getMap(689).getSize() * 2, 0);
		// unlock wrists
		player.getPackets().sendIComponentSettings(729, 83, 0, ClientScriptMap.getMap(702).getSize() * 2, 0);
		// unlock legs
		player.getPackets().sendIComponentSettings(729, 85, 0, (ClientScriptMap.getMap(1585).getSize() * 2) + 9, 0);
		// unlock colors
		player.getPackets().sendIComponentSettings(729, 79, 0, ClientScriptMap.getMap(2348).getSize() * 2, 0);

		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				int[] oldStyles = (int[]) player.getTemporaryAttributtes().remove("old_styles");
				byte[] oldColours = (byte[]) player.getTemporaryAttributtes().remove("old_colours");

				if (player.getTemporaryAttributtes().containsKey("makeover_confirm")) {
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 548, "A marvellous choice. You look splendid!");
					player.getTemporaryAttributtes().remove("ThessaliasMakeOver");
					player.getTemporaryAttributtes().remove("makeover_confirm");
				} else {
					for (int i = 0; i < oldStyles.length; i++) {
						player.getAppearence().setLook(i, oldStyles[i]);
					}

					for (int j = 0; j < oldColours.length; j++) {
						player.getAppearence().setColor(j, oldColours[j]);
					}

					player.getAppearence().generateAppearenceData();

				}
				hideBooth(player);
			}

		});
	}

	public static void openHairdresserSalon(final Player player) {
		if (player.getEquipment().getHatId() != -1) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "I'm afraid I can't see your head at the moment. Please remove your headgear first.");
			return;
		}
		if (player.getEquipment().getWeaponId() != -1 || player.getEquipment().getShieldId() != -1) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "I don't feel comfortable cutting hair when you are wielding something. Please remove what you are holding first.");
			return;
		}

		showBooth(player);
		player.getInterfaceManager().sendInterface(309);
		player.getPackets().sendIComponentSettings(309, 10, 0, ClientScriptMap.getMap(player.getAppearence().isMale() ? 2339 : 2342).getSize() * 2, 0);
		player.getPackets().sendIComponentSettings(309, 16, 0, ClientScriptMap.getMap(2345).getSize() * 2, 0);
		player.getPackets().sendIComponentText(309, 20, "Free!");
		player.getTemporaryAttributtes().put("hairSaloon", true);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "An excellent choise, " + (player.getAppearence().isMale() ? "sir" : "lady") + ".");
				player.setNextAnimation(new Animation(-1));
				player.getAppearence().getAppeareanceData();
				player.getTemporaryAttributtes().remove("hairSaloon");
				hideBooth(player);
			}

		});
	}

	public static void openYrsaShop(final Player player) {
		if (player.getEquipment().getBootsId() != -1) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 1301, "I don't feel comfortable helping you try on new boots when you are wearing some already.", "Please remove your boots first.");
			return;
		}
		player.getInterfaceManager().sendInterface(728);
		player.getPackets().sendIComponentText(728, 87, "No Cost");
		player.getTemporaryAttributtes().put("YrsaBoot", 0);
		player.getTemporaryAttributtes().put("old_shoe_colour", player.getAppearence().getBootColor());
		player.getPackets().sendIComponentSettings(728, 84, 0, 11, 0);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				int oldShoeColour = (int) player.getTemporaryAttributtes().remove("old_shoe_colour");

				if (player.getTemporaryAttributtes().containsKey("yrsashoes_confirm")) {
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 548, "Hey, They look great!");
					player.getTemporaryAttributtes().remove("YrsaBoot");
					player.getTemporaryAttributtes().remove("yrsashoes_confirm");

				} else {
					player.getAppearence().setBootsColor(oldShoeColour);
					player.getAppearence().generateAppearenceData();
				}

			}
		});
	}

	public static void handleYrsaShoes(Player player, int componentId, int slotId) {
		if (componentId == 86) {
			player.getTemporaryAttributtes().put("yrsashoes_confirm", Boolean.TRUE);
			player.closeInterfaces();
		} else if (componentId == 84) {// setting the colors.
			player.getAppearence().setBootsColor(slotId >= 6 ? slotId - 6 : slotId);
			player.getAppearence().generateAppearenceData();
		}
	}

	public static void showBooth(Player player) {
		player.getTemporaryAttributtes().put("showing_booth", true);
		player.setNextAnimation(new Animation(11623));
		player.setNextGraphics(new Graphics(1181));
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if (player.hasFinished() || player.isDead() || !player.getTemporaryAttributtes().containsKey("showing_booth")) {
					stop();
					return;
				}
				player.setNextGraphics(new Graphics(1182));
			}
		}, 1, 0);

	}

	public static void hideBooth(Player player) {
		player.getTemporaryAttributtes().remove("showing_booth");
		player.setNextAnimation(new Animation(-1));
		player.setNextGraphics(new Graphics(1183));
	}

	private PlayerLook() {

	}

}
