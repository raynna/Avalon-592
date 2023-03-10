package com.rs.cache;

import java.io.IOException;

import com.alex.store.Store;
import com.rs.Settings;

public final class Cache {

	public static Store STORE;

	private static byte[] UKEYS;

	private Cache() {

	}

	public static void init() throws IOException {
		STORE = new Store(Settings.CACHE_PATH);
	}

	public static final byte[] generateUkeysFile() {
		return STORE.generateIndex255Archive255Outdated();
	}
	
	public static byte[] getUKEYS() {
		if (UKEYS == null)
			UKEYS = generateUkeysFile();
		
		return UKEYS;
	}

}
