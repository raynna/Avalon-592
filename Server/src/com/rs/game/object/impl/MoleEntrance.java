package com.rs.game.object.impl;

import com.rs.game.WorldObject;
import com.rs.game.item.impl.Spade;
import com.rs.game.object.ObjectScript;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class MoleEntrance extends ObjectScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 12202 };
	}

	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (!player.getInventory().containsOneItem(952)) {
			player.getSocialManager().sendGameMessage("You need a spade to dig this.");
			return false;
		}
		if (player.getX() != object.getX() || player.getY() != object.getY()) {
			player.lock();
			player.addWalkSteps(object.getX(), object.getY());
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					Spade.dig(player);
				}

			}, 1);
		} else
			Spade.dig(player);
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		return true;
	}
}
