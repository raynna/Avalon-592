package com.rs.game.item;

import com.rs.Settings;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.utils.Logger;

public abstract class ItemScripts {
	
	public abstract Object[] getKeys();

	public boolean processItem(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 1 - ItemId: " + item.getId());
		return true;
	}
	
	public boolean processItem2(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 2 - ItemId: " + item.getId());
		return true;
	}
	
	public boolean processItem3(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 3 - ItemId: " + item.getId());
		return true;
	}
	
	public boolean processItem4(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 4 - ItemId: " + item.getId());
		return true;
	}
	
	public boolean processItem5(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 5 - ItemId: " + item.getId());
		return true;
	}
	public boolean processItem6(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 6 - ItemId: " + item.getId());
		return true;
	}
	public boolean processItem7(Player player, Item item) {
		if (Settings.DEBUG)
			Logger.log("ItemScript", this.getClass().getSimpleName()
					+ ", ItemClick 7 - ItemId: " + item.getId());
		return true;
	}
}
