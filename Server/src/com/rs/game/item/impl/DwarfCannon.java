package com.rs.game.item.impl;

import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.content.DwarfMultiCannon;

public class DwarfCannon extends ItemScripts {

	@Override
	public Object[] getKeys() {
		return new Object[] { 4251 };
	}

	@Override
	public boolean processItem(Player player, Item item) {
		DwarfMultiCannon.setUp(player);
		return true;
	}
}
