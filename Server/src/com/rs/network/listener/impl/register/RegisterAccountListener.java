package com.rs.network.listener.impl.register;

import com.rs.network.listener.NetworkListener;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterAccountListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key
	 */
	public RegisterAccountListener(AttributeKey<NetworkListener> key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		// TODO Auto-generated method stub

	}

}
