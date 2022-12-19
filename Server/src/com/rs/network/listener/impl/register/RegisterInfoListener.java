package com.rs.network.listener.impl.register;

import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;
import com.rs.network.protocol.codec.register.RegisterInfoRequest;
import com.rs.network.protocol.codec.register.RegisterResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterInfoListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key The network key.
	 */
	public RegisterInfoListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof RegisterInfoRequest))
			return;

		ctx.writeAndFlush(new RegisterResponse(ClientMessage.SUCCESSFUL_LOGIN));
	}

}
