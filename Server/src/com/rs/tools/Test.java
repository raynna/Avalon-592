package com.rs.tools;

import java.io.IOException;

import com.rs.cache.Cache;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Cache.init();

		System.out.println(Cache.STORE.getIndexes()[2].getLastFileId(1));

	}
}