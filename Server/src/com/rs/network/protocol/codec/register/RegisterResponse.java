package com.rs.network.protocol.codec.register;

import com.rs.network.protocol.ClientMessage;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterResponse {

	/**
	 * Represents the client message response.
	 */
	private final ClientMessage response;

	/**
	 * Constructs a new class instance.
	 * @param response The response.
	 */
	public RegisterResponse(ClientMessage response) {
		this.response = response;
	}

	/**
	 * Gets the response.
	 * @return the response
	 */
	public ClientMessage getResponse() {
		return response;
	}

}
