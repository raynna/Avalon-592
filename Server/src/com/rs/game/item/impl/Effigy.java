package com.rs.game.item.impl;

import com.rs.game.item.Item;
import com.rs.game.item.ItemScripts;
import com.rs.game.player.Player;
import com.rs.game.player.content.AncientEffigies;
import com.rs.game.player.content.DwarfMultiCannon;

public class Effigy extends ItemScripts {

	@Override
	public Object[] getKeys() {
		return new Object[] {AncientEffigies.GORGED_ANCIENT_EFFIGY, AncientEffigies.NOURISHED_ANCIENT_EFFIGY, AncientEffigies.STARVED_ANCIENT_EFFIGY, AncientEffigies.SATED_ANCIENT_EFFIGY };
	}

	@Override
	public boolean processItem(Player player, Item item) {
		player.getDialogueManager().startDialogue("AncientEffigiesD", item.getId());
		return true;
	}
}
