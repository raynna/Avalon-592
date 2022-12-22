package com.rs.game.item;

import java.util.HashMap;

import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class ItemScriptsHandler
{

	public static final HashMap<Object, ItemScripts> cachedItemScripts = new HashMap<Object, ItemScripts>();

	@SuppressWarnings("rawtypes")
	public static final void init() {
		try {
			Class[] classes = Utils.getClasses("com.rs.game.item.impl");
			for (Class c : classes) {
				if (c.isAnonymousClass())
					continue;
				Object o = c.newInstance();
				if (!(o instanceof ItemScripts))
					continue;
				ItemScripts script = (ItemScripts) o;
				for (Object key : script.getKeys())
					cachedItemScripts.put(key, script);
			}
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}
}
