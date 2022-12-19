package com.rs.network.protocol.codec.register;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterUsernameRequest {

	/**
	 * Represents the username send from the account registration form.
	 */
	private final String username;

	/**
	 * Constructs a new class instance.
	 * @param username The username.
	 */
	public RegisterUsernameRequest(String username) {
		this.username = username;
	}

	/**
	 * Gets the username.
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

}
