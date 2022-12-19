package com.rs.network.protocol.codec.handshake;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class HandshakeRequest {

	/**
	 * Represents the version of the connecting client.
	 */
	private final int version;

	/**
	 * Constructs a new class instance.
	 * @param version The client version.
	 */
	public HandshakeRequest(int version) {
		this.version = version;
	}

	/**
	 * Gets the client version of the connecting client.
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

}
