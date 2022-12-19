package com.rs.network.protocol.codec.update;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public enum UpdateType {

	LOW_PRIORITY_UPDATE(0), HIGH_PRIORITY_UPDATE(1), XOR_ENCRYPTION_UPDATE(4);

	private final int id;

	private UpdateType(int id) {
		this.id = id;
	}

	public static Optional<UpdateType> getType(int id) {
		return Arrays.stream(UpdateType.values()).filter(a -> a.id == id).findAny();
	}

	public int getId() {
		return id;
	}

}
