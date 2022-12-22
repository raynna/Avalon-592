package com.rs.game.object.impl;

import com.rs.game.*;
import com.rs.game.object.ObjectScript;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class ChaosTunnelExit extends ObjectScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 28782 };
	}

	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (player.getX() == 3183 && player.getY() == 5470)
			player.useStairs(828, new WorldTile(3057, 3551, 0), 1, 2);
		else if (player.getX() == 3248 && player.getY() == 5490)
			player.useStairs(828, new WorldTile(3119, 3570, 0), 1, 2);
		else if (player.getX() == 3234 && player.getY() == 5559)
			player.useStairs(828, new WorldTile(3130, 3586, 0), 1, 2);
		else if (player.getX() == 3291 && player.getY() == 5538)
			player.useStairs(828, new WorldTile(3177, 3585, 0), 1, 2);
		else if (player.getX() == 3292 && player.getY() == 5479)
			player.useStairs(828, new WorldTile(3165, 3562, 0), 1, 2);
		player.getControlerManager().startControler("Wilderness");
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		return true;
	}
}
