package com.rs.network.protocol;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public enum ClientMessage {

	SUCCESSFUL(0), SUCCESSFUL_LOGIN(2), INVALID_DETAILS(3), PERM_BANNED(4), ONLINE(5), OUT_OF_DATE(6), FULL(7), TOO_MANY_LOGINS(9), UPDATING(14), ERROR_LOADING_PLAYER(20), BANNED(26);

	private final int id;

	private ClientMessage(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
