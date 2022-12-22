package com.rs.game.object;

import com.rs.Settings;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.Logger;

public abstract class ObjectScript {
	
	public abstract Object[] getKeys();

	public boolean processObject(Player player, WorldObject object) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ObjectClick 1 - ObjectId: " + object.getId());
		return true;
	}
	
	public boolean processObject2(Player player, WorldObject object) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ObjectClick 2 - ObjectId: " + object.getId());
		return true;
	}
	
	public boolean processObject3(Player player, WorldObject object) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ObjectClick 3 - ObjectId: " + object.getId());
		return true;
	}
	
	public boolean processObject4(Player player, WorldObject object) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ObjectClick 4 - ObjectId: " + object.getId());
		return true;
	}
	
	public boolean processObject5(Player player, WorldObject object) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ObjectClick 5 - ObjectId: " + object.getId());
		return true;
	}
	
	public boolean processItemOnObject(Player player, WorldObject object, Item item) {
		if (Settings.DEBUG)
			Logger.log("ObjectScripts", this.getClass().getSimpleName()
					+ ", ItemOnObject - ObjectId: " + object.getId() + ", ItemId: " + item.getId());
		return true;
	}
	

	public int getDistance() {
		return 0;
	}

}
