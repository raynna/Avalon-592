package com.rs.network.listener.impl;

import com.rs.Settings;
import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;
import com.rs.network.protocol.codec.handshake.HandshakeRequest;
import com.rs.network.protocol.codec.handshake.HandshakeResponse;
import com.rs.network.protocol.codec.handshake.HandshakeType;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class HandshakeListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 */
	public HandshakeListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof HandshakeRequest))
			return;

		HandshakeRequest request = (HandshakeRequest) msg;
		ClientMessage response = ClientMessage.OUT_OF_DATE;

		if (request.getVersion() == Settings.CLIENT_BUILD)
			response = ClientMessage.SUCCESSFUL;

		ctx.channel().writeAndFlush(new HandshakeResponse(key, HandshakeType.UPDATE_CONNECTION, response));
	}

}
