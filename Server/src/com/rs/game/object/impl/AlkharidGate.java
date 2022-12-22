package com.rs.game.object.impl;

import com.rs.game.WorldObject;
import com.rs.game.object.ObjectScript;
import com.rs.game.player.Player;

public class AlkharidGate extends ObjectScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 35551, 35549, null };
	}

	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (player.getX() == 3267 && player.getY() >= 3227 && player.getY() <= 3228)
			player.getDialogueManager().startDialogue("BorderGuard", 925, object);
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		if (player.getInventory().getNumberOf(995) < 10) {
			player.getSocialManager().sendGameMessage("You must pay a toll of 10 gold coins to pass.");
			return false;
		}
		if (player.getX() >= 3268) {
			player.getSocialManager().sendGameMessage("You can't use that option from this side of the gate.");
			return false;
		}
			player.getInventory().deleteItem(995, 10);
		return true;
	}
}
