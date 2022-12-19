package com.rs.utils;

import java.io.*;
import java.util.HashMap;

public class ItemBonuses {

	private static HashMap<Integer, int[]> itemBonuses;

	public static final void init() {
		if (new File("data/items/bonuses.ib").exists())
			loadItemBonuses();
		else
			throw new RuntimeException("Missing item bonuses.");
	}

	public static final int[] getItemBonuses(int itemId) {
		return itemBonuses.get(itemId);
	}

	private static final void loadItemBonuses() {
		try {
			@SuppressWarnings("resource")
			DataInputStream in = new DataInputStream(new FileInputStream("data/items/bonuses.ib"));
			itemBonuses = new HashMap<Integer, int[]>(in.available() / 38);
			while (in.available() != 0) {
				int itemId = in.readUnsignedShort();
				int[] bonuses = new int[18];
				for (int index = 0; index < bonuses.length; index++)
					bonuses[index] = in.readShort();
				itemBonuses.put(itemId, bonuses);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private ItemBonuses() {

	}

}
