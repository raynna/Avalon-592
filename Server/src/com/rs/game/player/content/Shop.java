package com.rs.game.player.content;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.CombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSetsKeyGenerator;

public class Shop {

	private static final int MAIN_STOCK_ITEMS_KEY = ItemSetsKeyGenerator.generateKey();

	private static final int MAX_SHOP_ITEMS = 40;
	public static final int COINS = 995, TOKKUL = 6529;

	private String name;
	private Item[] mainStock;
	private int[] defaultQuantity;
	private Item[] generalStock;
	private int money;
	private CopyOnWriteArrayList<Player> viewingPlayers;

	public Shop(String name, int money, Item[] mainStock, boolean isGeneralStore) {
		viewingPlayers = new CopyOnWriteArrayList<Player>();
		this.name = name;
		this.money = money;
		this.mainStock = mainStock;
		defaultQuantity = new int[mainStock.length];
		for (int i = 0; i < defaultQuantity.length; i++)
			defaultQuantity[i] = mainStock[i].getAmount();
		if (isGeneralStore && mainStock.length < MAX_SHOP_ITEMS)
			generalStock = new Item[MAX_SHOP_ITEMS - mainStock.length];
	}

	public boolean isGeneralStore() {
		return generalStock != null;
	}

	public void addPlayer(final Player player) {
		viewingPlayers.add(player);
		player.getTemporaryAttributtes().put("Shop", this);
		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				viewingPlayers.remove(player);
				player.getTemporaryAttributtes().remove("Shop");
				player.getTemporaryAttributtes().remove("shop_transaction");
				player.getTemporaryAttributtes().remove("isShopBuying");
				player.getTemporaryAttributtes().remove("ShopSelectedSlot");
				player.getTemporaryAttributtes().remove("ShopSelectedInventory");
			}
		});
		// player.refreshVerboseShopDisplayMode();
		player.getVarsManager().sendVar(118, generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY);
		player.getVarsManager().sendVar(1496, -1); // sets samples items set
		player.getVarsManager().sendVar(532, money);
		sendStore(player);
		player.getPackets().sendGlobalConfig(199, -1);// unknown
		player.getInterfaceManager().sendInterface(620); // opens shop
		for (int i = 0; i < MAX_SHOP_ITEMS; i++)
			player.getPackets().sendGlobalConfig(946 + i, i < defaultQuantity.length ? defaultQuantity[i] : generalStock != null ? 0 : -1);// prices
		// player.getPackets().sendGlobalConfig(1241, 16750848);// unknown
		// player.getPackets().sendGlobalConfig(1242, 15439903);// unknown
		player.getPackets().sendGlobalConfig(741, -1);// unknown
		player.getPackets().sendGlobalConfig(743, -1);// unknown
		player.getPackets().sendGlobalConfig(744, 0);// unknown
		if (generalStock != null)
			player.getPackets().sendHideIComponent(620, 19, false); // unlocks
																	// general
																	// store
																	// icon
		player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150); // unlocks stock slots
		sendInventory(player);
		player.getPackets().sendIComponentText(620, 20, name);
	}

	public void resetTransaction(Player player) {
		setTransaction(player, 1);
	}

	public void increaseTransaction(Player player, int amount) {
		setTransaction(player, getTransaction(player) + amount);
	}

	public int getTransaction(Player player) {
		Integer transaction = (Integer) player.getTemporaryAttributtes().get("shop_transaction");
		return transaction == null ? 1 : transaction;
	}

	public void pay(Player player) {
		Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
		Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
		if (selectedSlot == null || inventory == null)
			return;
		int amount = getTransaction(player);
		if (inventory)
			sell(player, selectedSlot, amount);
		else
			buy(player, selectedSlot, amount);
	}

	public int getSelectedMaxAmount(Player player) {
		Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
		Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
		if (selectedSlot == null || inventory == null)
			return 1;
		if (inventory) {
			Item item = player.getInventory().getItem(selectedSlot);
			if (item == null)
				return 1;
			return player.getInventory().getAmountOf(item.getId());
		} else {
			if (selectedSlot >= getStoreSize())
				return 1;
			Item item = selectedSlot >= mainStock.length ? generalStock[selectedSlot - mainStock.length] : mainStock[selectedSlot];
			if (item == null)
				return 1;
			return item.getAmount();
		}
	}

	public void setTransaction(Player player, int amount) {
		int max = getSelectedMaxAmount(player);
		if (amount > max)
			amount = max;
		else if (amount < 1)
			amount = 1;
		player.getTemporaryAttributtes().put("shop_transaction", amount);
		player.getVarsManager().sendVar(2564, amount);
	}

	public static void setBuying(Player player, boolean buying) {
		player.getTemporaryAttributtes().put("isShopBuying", buying);
		player.getVarsManager().sendVar(2565, buying ? 0 : 1);
	}

	public static boolean isBuying(Player player) {
		Boolean isBuying = (Boolean) player.getTemporaryAttributtes().get("isShopBuying");
		return isBuying != null && isBuying;
	}

	public void sendInventory(Player player) {
		player.getInterfaceManager().sendInventoryInterface(621);
		player.getPackets().sendItems(93, player.getInventory().getItems());
		player.getPackets().sendUnlockIComponentOptionSlots(621, 0, 0, 27, 0, 1, 2, 3, 4, 5);
		player.getPackets().sendInterSetItemsOptionsScript(621, 0, 93, 4, 7, "Value", "Sell 1", "Sell 5", "Sell 10", "Sell 50", "Examine");
	}

	public void buyAll(Player player, int slotId) {
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		buy(player, slotId, item.getAmount());
	}

	public void buy(Player player, int clickSlot, int quantity) {
		int slotId = getSlotId(clickSlot);
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null)
			return;
		if (item.getAmount() == 0) {
			player.getSocialManager().sendGameMessage("There is no stock of that item at the moment.");
			return;
		}
		int dq = slotId >= mainStock.length ? 0 : defaultQuantity[slotId];
		int price = getBuyPrice(item, dq);
		int amountCoins = money == COINS ? player.getInventory().getCoinsAmount() : player.getInventory().getItems().getNumberOf(money);
		int maxQuantity = amountCoins / price;
		int buyQ = item.getAmount() > quantity ? quantity : item.getAmount();

		boolean enoughCoins = maxQuantity >= buyQ;
		if (!enoughCoins) {
			player.getSocialManager().sendGameMessage("You don't have enough " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + ".");
			buyQ = maxQuantity;
		} else if (quantity > buyQ)
			player.getSocialManager().sendGameMessage("The shop has run out of stock.");
		if (item.getDefinitions().isStackable()) {
			if (player.getInventory().getFreeSlots() < 1) {
				player.getSocialManager().sendGameMessage("Not enough space in your inventory.");
				return;
			}
		} else {
			int freeSlots = player.getInventory().getFreeSlots();
			if (buyQ > freeSlots) {
				buyQ = freeSlots;
				player.getSocialManager().sendGameMessage("Not enough space in your inventory.");
			}
		}
		if (buyQ != 0) {
			int totalPrice = price * buyQ;
			player.getInventory().deleteItem(money, totalPrice);
			player.getInventory().addItem(item.getId(), buyQ);
			item.setAmount(item.getAmount() - buyQ);
			if (item.getAmount() <= 0 && slotId >= mainStock.length)
				generalStock[slotId - mainStock.length] = null;
			refreshShop();
			resetSelected(player);

		}
	}

	public void restoreItems() {
		boolean needRefresh = false;
		for (int i = 0; i < mainStock.length; i++) {
			if (mainStock[i].getAmount() < defaultQuantity[i]) {
				mainStock[i].setAmount(mainStock[i].getAmount() + 1);
				needRefresh = true;
			} else if (mainStock[i].getAmount() > defaultQuantity[i]) {
				mainStock[i].setAmount(mainStock[i].getAmount() + -1);
				needRefresh = true;
			}
		}
		if (generalStock != null) {
			for (int i = 0; i < generalStock.length; i++) {
				Item item = generalStock[i];
				if (item == null)
					continue;
				item.setAmount(item.getAmount() - 1);
				if (item.getAmount() <= 0)
					generalStock[i] = null;
				needRefresh = true;
			}
		}
		if (needRefresh)
			refreshShop();
	}

	private boolean addItem(int itemId, int quantity) {
		for (Item item : mainStock) {
			if (item.getId() == itemId) {
				item.setAmount(item.getAmount() + quantity);
				refreshShop();
				return true;
			}
		}
		if (generalStock != null) {
			for (Item item : generalStock) {
				if (item == null)
					continue;
				if (item.getId() == itemId) {
					item.setAmount(item.getAmount() + quantity);
					refreshShop();
					return true;
				}
			}
			for (int i = 0; i < generalStock.length; i++) {
				if (generalStock[i] == null) {
					generalStock[i] = new Item(itemId, quantity);
					refreshShop();
					return true;
				}
			}
		}
		return false;
	}

	public void sell(Player player, int slotId, int quantity) {
		if (player.getInventory().getItemsContainerSize() < slotId)
			return;
		Item item = player.getInventory().getItem(slotId);
		if (item == null)
			return;
		int originalId = item.getId();
		if (item.getDefinitions().isNoted() && item.getDefinitions().getCertId() != -1)
			item = new Item(item.getDefinitions().getCertId(), item.getAmount());
		if (!ItemConstants.isTradeable(item) || item.getId() == money) {
			player.getSocialManager().sendGameMessage("You can't sell this item.");
			return;
		}
		int dq = getDefaultQuantity(item.getId());
		if (dq == -1 && generalStock == null) {
			player.getSocialManager().sendGameMessage("You can't sell this item to this shop.");
			return;
		}
		int price = getSellPrice(item, dq);
		int numberOff = player.getInventory().getItems().getNumberOf(originalId);
		if (quantity > numberOff)
			quantity = numberOff;
		if (!addItem(item.getId(), quantity)) {
			player.getSocialManager().sendGameMessage("Shop is currently full.");
			return;
		}
		player.getInventory().deleteItem(originalId, quantity);
		refreshShop();
		resetSelected(player);
		if (price == 0)
			return;
		player.getInventory().addItem(new Item(money, price * quantity));
	}

	public void sendValue(Player player, int slotId) {
		if (player.getInventory().getItemsContainerSize() < slotId)
			return;
		Item item = player.getInventory().getItem(slotId);
		if (item == null)
			return;
		if (item.getDefinitions().isNoted())
			item = new Item(item.getDefinitions().getCertId(), item.getAmount());
		if (!ItemConstants.isTradeable(item) || item.getId() == money) {
			player.getSocialManager().sendGameMessage("You can't sell this item.");
			return;
		}
		int dq = getDefaultQuantity(item.getId());
		if (dq == -1 && generalStock == null) {
			player.getSocialManager().sendGameMessage("You can't sell this item to this shop.");
			return;
		}
		int price = getSellPrice(item, dq);
		player.getSocialManager().sendGameMessage(item.getDefinitions().getName() + ": shop will buy for: " + price + " " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + ". Right-click the item to sell.");
	}

	public int getDefaultQuantity(int itemId) {
		for (int i = 0; i < mainStock.length; i++)
			if (mainStock[i].getId() == itemId)
				return defaultQuantity[i];
		return -1;
	}

	public void resetSelected(Player player) {
		player.getTemporaryAttributtes().remove("ShopSelectedSlot");
		player.getVarsManager().sendVar(2563, -1);
	}

	public int getSlotId(int clickSlotId) {
		return clickSlotId / 6;
	}

	public void sendInfo(Player player, int clickSlot, boolean inventory) {
		int slotId = getSlotId(clickSlot);
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null)
			return;
		player.getTemporaryAttributtes().put("ShopSelectedSlot", clickSlot);
		int dq = slotId >= mainStock.length ? 0 : defaultQuantity[slotId];
		int price = getBuyPrice(item, dq);
		if (price < 1)
			player.getSocialManager().sendGameMessage(item.getDefinitions().getName() + " is free of charge.");
		else
			player.getSocialManager().sendGameMessage(item.getDefinitions().getName() + ": Currently costs " + price + " " + (price == 1 ? "coin." : ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + "."));

		player.getInterfaceManager().sendInventoryInterface(449);
		player.getPackets().sendGlobalConfig(741, item.getId());
		player.getPackets().sendGlobalString(25, ItemExamines.getExamine(item));
		player.getPackets().sendGlobalString(34, ""); // quest id for some items
		player.getVarsManager().sendVar(2564, price);
		int[] bonuses = new int[18];
		ItemDefinitions defs = item.getDefinitions();
		bonuses[CombatDefinitions.STAB_ATTACK] += defs.getStabAttack();
		bonuses[CombatDefinitions.SLASH_ATTACK] += defs.getSlashAttack();
		bonuses[CombatDefinitions.CRUSH_ATTACK] += defs.getCrushAttack();
		bonuses[CombatDefinitions.MAGIC_ATTACK] += defs.getMagicAttack();
		bonuses[CombatDefinitions.RANGE_ATTACK] += defs.getRangeAttack();
		bonuses[CombatDefinitions.STAB_DEF] += defs.getStabDef();
		bonuses[CombatDefinitions.SLASH_DEF] += defs.getSlashDef();
		bonuses[CombatDefinitions.CRUSH_DEF] += defs.getCrushDef();
		bonuses[CombatDefinitions.MAGIC_DEF] += defs.getMagicDef();
		bonuses[CombatDefinitions.RANGE_DEF] += defs.getRangeDef();
		bonuses[CombatDefinitions.SUMMONING_DEF] += defs.getSummoningDef();
		bonuses[CombatDefinitions.STRENGTH_BONUS] += defs.getStrengthBonus();
		bonuses[CombatDefinitions.RANGED_STR_BONUS] += defs.getRangedStrBonus();
		bonuses[CombatDefinitions.PRAYER_BONUS] += defs.getPrayerBonus();
		bonuses[CombatDefinitions.MAGIC_DAMAGE] += defs.getMagicDamage();
		boolean hasBonus = false;
		for (int bonus : bonuses)
			if (bonus != 0) {
				hasBonus = true;
				break;
			}
		if (hasBonus) {
			HashMap<Integer, Integer> requiriments = item.getDefinitions().getWearingSkillRequiriments();
			if (requiriments != null && !requiriments.isEmpty()) {
				String reqsText = "";
				for (int skillId : requiriments.keySet()) {
					if (skillId > 24 || skillId < 0)
						continue;
					int level = requiriments.get(skillId);
					if (level < 0 || level > 120)
						continue;
					boolean hasReq = player.getSkills().getLevelForXp(skillId) >= level;
					reqsText += "<br>" + (hasReq ? "<col=00ff00>" : "<col=ff0000>") + "Level " + level + " " + Skills.SKILL_NAME[skillId];
				}
				player.getPackets().sendGlobalString(26, "<br>Worn on yourself, requiring: " + reqsText);
			} else
				player.getPackets().sendGlobalString(26, "<br>Worn on yourself");
			player.getPackets().sendGlobalString(35, "<br>Attack<br><col=ffff00>+" + bonuses[CombatDefinitions.STAB_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SLASH_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.CRUSH_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.MAGIC_ATTACK] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.RANGE_ATTACK] + "<br><col=ffff00>---" + "<br>Strength" + "<br>Ranged Strength" + "<br>Magic Damage" + "<br>Absorve Melee" + "<br>Absorve Magic" + "<br>Absorve Ranged" + "<br>Prayer Bonus");
			player.getPackets().sendGlobalString(36, "<br><br>Stab<br>Slash<br>Crush<br>Magic<br>Ranged<br>Summoning");
			player.getPackets().sendGlobalString(52, "<<br>Defence<br><col=ffff00>+" + bonuses[CombatDefinitions.STAB_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SLASH_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.CRUSH_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.MAGIC_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.RANGE_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.SUMMONING_DEF] + "<br><col=ffff00>+" + bonuses[CombatDefinitions.STRENGTH_BONUS] + "<br><col=ffff00>" + bonuses[CombatDefinitions.RANGED_STR_BONUS] + "<br><col=ffff00>" + bonuses[CombatDefinitions.MAGIC_DAMAGE] + "%<br><col=ffff00>" + bonuses[CombatDefinitions.PRAYER_BONUS]);
		} else {
			player.getPackets().sendGlobalString(26, "");
			player.getPackets().sendGlobalString(35, "");
			player.getPackets().sendGlobalString(36, "");
			player.getPackets().sendGlobalString(52, "");
		}

	}

	/*
	 * [clientscript] int get_buy_price(int arg0) { int ivar1; if (arg0 == -1) { return 0; } arg0 = getRealItem(arg0); ivar1 =
	 * getDataByKey('o', 'i', 731, arg0); if (standart_config_532 == 6529 && ivar1 != -1 && ivar1 > 0) { return ivar1; } ivar1 =
	 * getDataByKey('o', 'i', 733, arg0); if (ivar1 != -1 && ivar1 > 0) { return ivar1; } if (getItemAttribute(arg0, 258) == 1 ||
	 * getItemAttribute(arg0, 259) == 1) { return 99000; } ivar1 = getItemValue(arg0); if (standart_config_532 == 6529) { ivar1 =
	 * multiplyDivide(3, 2, ivar1); } return max(ivar1, 1); }
	 */

	public int getBuyPrice(Item item, int dq) {
		switch (money) {
		case 24444: // TROHPY
			if (item.getId() >= 24450 && item.getId() <= 24454)
				return 30 + (item.getId() - 24450) * 5;
			if (item.getId() >= 24455 && item.getId() <= 24457)
				return 1500;
			break;
		default:
			int price = ClientScriptMap.getMap(731).getIntValue(item.getId());
			if (money == TOKKUL && price > 0)
				return price;
			price = ClientScriptMap.getMap(733).getIntValue(item.getId());
			if (price > 0)
				return price;
			if (item.getDefinitions().hasShopPriceAttributes())
				return 99000;
			price = item.getDefinitions().getValue();
			if (money == TOKKUL)
				price = (price * 3) / 2;
			return Math.max(price, 1);

		}
		return 1;
	}

	/*
	 * [clientscript] int get_sell_price(int arg0) { int ivar1; if (arg0 == -1) { return 0; } arg0 = getRealItem(arg0); ivar1 =
	 * getDataByKey('o', 'i', 732, arg0); if (standart_config_532 == 6529 && ivar1 != -1) { return ivar1; } ivar1 =
	 * getDataByKey('o', 'i', 1441, arg0); if (ivar1 != -1 && ivar1 > 0) { return ivar1; } ivar1 = max(1,
	 * multiplyDivide(getItemValue(arg0), 100, 30)); return ivar1; }
	 */

	public int getSellPrice(Item item, int dq) {
		int price = ClientScriptMap.getMap(732).getIntValue(item.getId());
		if (money == TOKKUL && price > 0)
			return price;
		price = ClientScriptMap.getMap(1441).getIntValue(item.getId());
		if (price > 0)
			return price;
		return Math.max(1, (item.getDefinitions().getValue() * 30) / 100);

	}

	public void sendExamine(Player player, int slotId) {
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null)
			return;
		player.getSocialManager().sendGameMessage(ItemExamines.getExamine(item));
	}

	public void refreshShop() {
		for (Player player : viewingPlayers) {
			sendStore(player);
			player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150);
		}
	}

	public int getStoreSize() {
		return mainStock.length + (generalStock != null ? generalStock.length : 0);
	}

	public void sendStore(Player player) {
		Item[] stock = new Item[mainStock.length + (generalStock != null ? generalStock.length : 0)];
		System.arraycopy(mainStock, 0, stock, 0, mainStock.length);
		if (generalStock != null)
			System.arraycopy(generalStock, 0, stock, mainStock.length, generalStock.length);
		player.getPackets().sendItems(generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY, stock);
	}

}