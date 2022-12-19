package com.rs.network.protocol.codec.handshake;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public enum HandshakeType {

	LOGIN_CONNECTION(14), UPDATE_CONNECTION(15), REGISTER_INFO_CONNECTION(20), REGISTER_USERNAME_CONNECTION(21), CREATE_ACCOUNT_CONNECTION(22), WORLD_LIST_CONNECTION(23);

	/**
	 * The client id of each handshake type.
	 */
	private final int id;

	/**
	 * Constructs a new class instance.
	 * @param id The client id.
	 */
	private HandshakeType(int id) {
		this.id = id;
	}

	/**
	 * Gets the handshake type based on the id used.
	 * @param id The id.
	 * @return The handshake type.
	 */
	public static Optional<HandshakeType> getType(int id) {
		return Arrays.stream(HandshakeType.values()).filter(a -> a.id == id).findAny();
	}

	/**
	 * Gets the id of each handshake type.
	 * @return The client id.
	 */
	public int getId() {
		return id;
	}

}
