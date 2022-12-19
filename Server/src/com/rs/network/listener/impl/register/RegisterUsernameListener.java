package com.rs.network.listener.impl.register;

import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;
import com.rs.network.protocol.codec.register.RegisterResponse;
import com.rs.network.protocol.codec.register.RegisterUsernameRequest;
import com.rs.utils.SerializableFilesManager;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterUsernameListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key The network key.
	 */
	public RegisterUsernameListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof RegisterUsernameRequest))
			return;
		
		RegisterUsernameRequest request = (RegisterUsernameRequest) msg;
		ClientMessage response = ClientMessage.SUCCESSFUL_LOGIN;
		
		if (SerializableFilesManager.containsPlayer(request.getUsername()))
			response = ClientMessage.ERROR_LOADING_PLAYER;
		
		ctx.writeAndFlush(new RegisterResponse(response));
	}

}
