package com.rs.game.player.actions.combat.lunarspells;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class SuperGlassMake {

	public static boolean cast(Player player, double xp) {
		if ((Long) player.getTemporaryAttributtes().get("LAST_SPELL") != null
				&& (Long) player.getTemporaryAttributtes().get("LAST_SPELL") + 1800 > Utils.currentTimeMillis()) {
			return false;
		}
		if (!player.getInventory().containsItem(1783, 1) || !player.getInventory().containsItem(401, 1)) {
			player.sm("You don't have any "
					+ (player.getInventory().containsItem(1783, 1) ? "seaweed." : "bucket of sand."));
			return false;
		}
		int seaweed = player.getInventory().getNumberOf(401);
		int sand = player.getInventory().getNumberOf(1783);
		int amount = 0;
		if (seaweed > sand)
			amount = sand;
		else
			amount = seaweed;
		player.getInventory().deleteItem(401, amount);
		player.getInventory().deleteItem(1783, amount);
		player.getInventory().addItem(1775, amount);
		player.getSkills().addXp(Skills.MAGIC, xp);
		player.sm("You create " + amount + " molten glass with your spell.");
		player.getTemporaryAttributtes().put("LAST_SPELL", Utils.currentTimeMillis());
		return true;
	}

}
