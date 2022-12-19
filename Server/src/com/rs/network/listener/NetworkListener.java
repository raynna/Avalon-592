package com.rs.network.listener;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public abstract class NetworkListener {

	/**
	 * The current network listener key.
	 */
	protected final AttributeKey<NetworkListener> key;

	/**
	 * Constructs a new class instance.
	 * @param key The current network listener key.
	 */
	public NetworkListener(AttributeKey<NetworkListener> key) {
		this.key = key;
	}

	/**
	 * What happens when the listener is used for channel data to be read.
	 * @param ctx The channel handler.
	 * @param msg The class object being passed into the channel to be read with the cooresponding listener.
	 */
	public abstract void channelRead(ChannelHandlerContext ctx, Object msg);

}
