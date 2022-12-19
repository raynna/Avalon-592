package com.rs.network.listener.impl;

import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.codec.worldlist.WorldListRequest;
import com.rs.network.protocol.codec.worldlist.WorldListResponse;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class WorldListListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 */
	public WorldListListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof WorldListRequest))
			return;

		WorldListRequest request = (WorldListRequest) msg;
		ctx.channel().writeAndFlush(new WorldListResponse(request.isUpdate()));
	}

}
