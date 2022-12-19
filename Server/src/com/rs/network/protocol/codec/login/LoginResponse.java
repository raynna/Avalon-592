package com.rs.network.protocol.codec.login;

import com.rs.game.player.Player;
import com.rs.network.protocol.ClientMessage;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class LoginResponse {

	/**
	 * Represents the player logging into the game.
	 */
	private final Player player;

	/**
	 * Represents the {@link LoginRequest} wrapper used by the player during login.
	 */
	private final LoginRequest request;

	/**
	 * Represents the client message response used to tell the client if the login was successful or not.
	 */
	private final ClientMessage response;

	/**
	 * Constructs a new class instance.
	 * @param response The client message response used when we quick respond.
	 */
	public LoginResponse(ClientMessage response) {
		this(null, null, response);
	}

	/**
	 * Constructs a new class instance.
	 * @param request The login request.
	 * @param response The client message response.
	 */
	public LoginResponse(Player player, LoginRequest request, ClientMessage response) {
		this.player = player;
		this.request = request;
		this.response = response;
	}

	/**
	 * Gets the player.
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Gets the login request.
	 * @return the request
	 */
	public LoginRequest getRequest() {
		return request;
	}

	/**
	 * Gets the client message response.
	 * @return the response
	 */
	public ClientMessage getResponse() {
		return response;
	}

}
