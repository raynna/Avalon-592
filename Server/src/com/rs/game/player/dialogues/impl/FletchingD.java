package com.rs.game.player.dialogues.impl;

import com.rs.game.player.actions.Fletching;
import com.rs.game.player.actions.Fletching.Fletch;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.ItemNameFilter;
import com.rs.game.player.dialogues.Dialogue;

public class FletchingD extends Dialogue {

	private Fletch items;

	// componentId, amount, option

	@Override
	public void start() {
		items = (Fletch) parameters[0];
		boolean maxQuantityTen = Fletching.maxMakeQuantityTen(items);
		SkillsDialogue.sendSkillsDialogue(player, maxQuantityTen ? SkillsDialogue.MAKE_NO_ALL_NO_CUSTOM : SkillsDialogue.MAKE, "How many do you wish to make?", maxQuantityTen ? 10 : 28, items.getProduct(), maxQuantityTen ? null : new ItemNameFilter() {
			@Override
			public String rename(String name) {
				return name.replace(" (u)", "");
			}
		});
	}

	@Override
	public void run(int interfaceId, int componentId) {
		int option = SkillsDialogue.getItemSlot(componentId);
		System.out.println(option);
		if (option > items.getProduct().length) {
			end();
			return;
		}
		int quantity = SkillsDialogue.getQuantity(player);
		System.out.println(quantity);
		int invQuantity = player.getInventory().getItems().getNumberOf(items.getId());
		if (quantity > invQuantity)
			quantity = invQuantity;
		player.getActionManager().setAction(new Fletching(items, option, quantity));
		end();
	}

	@Override
	public void finish() {
	}

}
