package com.rs.game.item.impl;

import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;

public class Ectophial extends ItemScripts {

	@Override
	public Object[] getKeys() {
		return new Object[] { 4251 };
	}

	@Override
	public boolean processItem(Player player, Item item) {
		Magic.useEctoPhial(player, item);
		return true;
	}
}
