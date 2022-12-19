package com.rs.game.player.content;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

public final class SkillsDialogue {

	public static final int MAKE = 0, MAKE_SETS = 1, COOK = 2, ROAST = 3, OFFER = 4, SELL = 5, BAKE = 6, CUT = 7, DEPOSIT = 8, MAKE_NO_ALL_NO_CUSTOM = 9, TELEPORT = 10, SELECT = 11, TAKE = 13;

	public static interface ItemNameFilter {

		public String rename(String name);
	}

	public static void sendSkillsDialogue(Player player, int option, String explanation, int maxQuantity, int[] items, ItemNameFilter filter) {
		sendSkillsDialogue(player, option, explanation, maxQuantity, items, filter, true);
	}

	public static void sendSkillsDialogue(Player player, int option, String explanation, int maxQuantity, int[] items, ItemNameFilter filter, boolean sendQuantitySelector) {
		player.getPackets().sendGlobalConfig(754, items.length);
		player.getPackets().sendHideIComponent(513, 21, false);
		player.getPackets().sendIComponentText(513, 2, explanation);
		for (int i = 0; i < items.length; i++) {
			Item item = new Item(items[i], 1);
			player.getPackets().sendGlobalConfig(755 + i, items[i]);
			player.getPackets().sendIComponentText(513, 15 + i, item.getName());
		}
		player.getInterfaceManager().sendChatBoxInterface(513);
		setMaxQuantity(player, maxQuantity);
		setQuantity(player, maxQuantity);
	}

	public static void handleSetQuantityButtons(Player player, int componentId) {
		if (componentId >= 39 && componentId <= 44)
			setQuantity(player, 1, false);
		else if (componentId >= 33 && componentId <= 38)
			setQuantity(player, 5, false);
		else if (componentId >= 27 && componentId <= 32)
			setQuantity(player, 10, false);
		else if (componentId >= 21 && componentId <= 26)
			setQuantity(player, getMaxQuantity(player), false);
//		else if (componentId == 24)
//			setQuantity(player, getQuantity(player) + 1, false);
//		else if (componentId == 25)
//			setQuantity(player, getQuantity(player) - 1, false);
	}

	public static void setMaxQuantity(Player player, int maxQuantity) {
		player.getTemporaryAttributtes().put("SkillsDialogueMaxQuantity", maxQuantity);
		player.getVarsManager().sendVarBit(8094, maxQuantity);
	}

	public static void setQuantity(Player player, int quantity) {
		setQuantity(player, quantity, true);
	}

	public static void setQuantity(Player player, int quantity, boolean refresh) {
		int maxQuantity = getMaxQuantity(player);
		if (quantity > maxQuantity)
			quantity = maxQuantity;
		else if (quantity < 0)
			quantity = 0;
		player.getTemporaryAttributtes().put("SkillsDialogueQuantity", quantity);
		if (refresh)
			player.getVarsManager().sendVarBit(8095, quantity);
	}

	public static int getMaxQuantity(Player player) {
		Integer maxQuantity = (Integer) player.getTemporaryAttributtes().get("SkillsDialogueMaxQuantity");
		if (maxQuantity == null)
			return 0;
		return maxQuantity;
	}

	public static int getQuantity(Player player) {
		Integer quantity = (Integer) player.getTemporaryAttributtes().get("SkillsDialogueQuantity");
		if (quantity == null)
			return 0;
		return quantity;
	}

	public static int getItemSlot(int componentId) {
		if (componentId < 39)
			return 0;
		return componentId - 39;
	}

	private SkillsDialogue() {

	}
}
