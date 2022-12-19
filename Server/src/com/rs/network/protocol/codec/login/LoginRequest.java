package com.rs.network.protocol.codec.login;

import com.rs.network.protocol.ClientMessage;
import com.rs.utils.IsaacKeyPair;

import io.netty.channel.Channel;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class LoginRequest {

	private final Channel channel;

	private final String username;

	private final String password;

	private final int displayMode;

	private final int screenWidth;

	private final int screenHeight;

	private final IsaacKeyPair isaacPair;

	private final ClientMessage response;

	/**
	 * Constructs a new class instance.
	 * @param response
	 */
	public LoginRequest(ClientMessage response) {
		this(null, null, null, -1, -1, -1, null, response);
	}

	/**
	 * Constructs a new class instance.
	 * @param channel
	 * @param username
	 * @param password
	 * @param displayMode
	 * @param screenWidth
	 * @param screenHeight
	 * @param isaacPair
	 * @param response
	 */
	public LoginRequest(Channel channel, String username, String password, int displayMode, int screenWidth, int screenHeight, IsaacKeyPair isaacPair, ClientMessage response) {
		this.channel = channel;
		this.username = username;
		this.password = password;
		this.displayMode = displayMode;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.isaacPair = isaacPair;
		this.response = response;
	}

	/**
	 * Checks if we are just quick responding to the client without going through the login process.
	 * @return <true> If we are just doing a quick response to the client.
	 */
	public boolean quickResponse() {
		return (channel == null && username == null && password == null && displayMode == -1 && screenWidth == -1 && screenHeight == -1 && response != null);
	}

	/**
	 * @return the channel
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * @return the displayMode
	 */
	public int getDisplayMode() {
		return displayMode;
	}

	/**
	 * @return the screenWidth
	 */
	public int getScreenWidth() {
		return screenWidth;
	}

	/**
	 * @return the screenHeight
	 */
	public int getScreenHeight() {
		return screenHeight;
	}

	/**
	 * @return the isaacPair
	 */
	public IsaacKeyPair getIsaacPair() {
		return isaacPair;
	}

	/**
	 * @return the response
	 */
	public ClientMessage getResponse() {
		return response;
	}

}
