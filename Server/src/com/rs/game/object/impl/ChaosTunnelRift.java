package com.rs.game.object.impl;

import com.rs.game.*;
import com.rs.game.object.ObjectScript;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class ChaosTunnelRift extends ObjectScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 28891 };
	}

	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		final boolean isSouth = player.getY() > 9553;
		player.getSocialManager().sendGameMessage("You leap across with a mighty leap!");
		WorldTasksManager.schedule(new WorldTask() {
			int ticks = 0;

			@Override
			public void run() {
				ticks++;
				int direction = isSouth ? NewForceMovement.SOUTH : NewForceMovement.NORTH;
				WorldTile tile = new WorldTile(3221, isSouth ? 9552 : 9556, 0);
				if (ticks == 1) {
					player.setNextForceMovement(new ForceMovement(player, 1, object, 2, direction));
					player.setNextAnimation(new Animation(769));
				} else if (ticks == 2) {
					player.useStairs(769, object, 0, 1);
				} else if (ticks == 3) {
					player.setNextAnimation(new Animation(769));
					player.setNextForceMovement(new ForceMovement(player, 1, tile, 2, direction));
				} else if (ticks == 4) {
					player.useStairs(-1, tile, 0, 1);
					stop();
					return;
				}
			}
		}, 0, 1);
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		return true;
	}
}
