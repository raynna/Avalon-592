package com.rs.network.protocol.codec.handshake;

import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;

import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class HandshakeResponse {

	/**
	 * Represents the current network listener key.
	 */
	private final AttributeKey<NetworkListener> key;

	/**
	 * Represents the handshake type.
	 */
	private final HandshakeType type;

	/**
	 * Represents the client message response.
	 */
	private final ClientMessage response;

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 * @param type The handshake type.
	 * @param response The client message response.
	 */
	public HandshakeResponse(AttributeKey<NetworkListener> key, HandshakeType type, ClientMessage response) {
		this.key = key;
		this.type = type;
		this.response = response;
	}

	/**
	 * Gets the network listener key.
	 * @return the key
	 */
	public AttributeKey<NetworkListener> getKey() {
		return key;
	}

	/**
	 * Gets the handshake type.
	 * @return the type
	 */
	public HandshakeType getType() {
		return type;
	}

	/**
	 * Gets the client message response.
	 * @return the response
	 */
	public ClientMessage getResponse() {
		return response;
	}

}
