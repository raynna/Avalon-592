package com.rs.game.item.impl;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;

public class Broomstick extends ItemScripts {

	@Override
	public Object[] getKeys() {
		return new Object[] { 14057 };
	}

	@Override
	public boolean processItem(Player player, Item item) {
		player.setNextAnimation(new Animation(10532));
		return true;
	}
}
