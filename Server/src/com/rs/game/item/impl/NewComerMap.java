package com.rs.game.item.impl;

import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;

public class NewComerMap extends ItemScripts {

	@Override
	public Object[] getKeys() {
		return new Object[] { 550 };
	}

	@Override
	public boolean processItem(Player player, Item item) {
		player.getInterfaceManager().sendInterface(270);
		return true;
	}
}
