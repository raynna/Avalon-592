package com.rs.network.protocol.codec.handshake;

import java.util.List;
import java.util.Optional;

import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class HandshakeDecoder extends ByteToMessageDecoder {
	
	 private final AttributeKey<NetworkListener> key;

	/**
	 * Constructs a new class instance.
	 * @param key
	 */
	public HandshakeDecoder(AttributeKey<NetworkListener> key) {
		this.key = key;
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable())
			return;

		Optional<HandshakeType> type = HandshakeType.getType(in.readUnsignedByte());
		if (type.isPresent()) {
			switch (type.get()) {
			case UPDATE_CONNECTION:
				if (in.readableBytes() != 4)
					return;
				
				int version = in.readInt();
				out.add(new HandshakeRequest(version));
				break;
			case LOGIN_CONNECTION:
				in.readByte();
				ctx.channel().writeAndFlush(new HandshakeResponse(key, type.get(), ClientMessage.SUCCESSFUL));
				break;
			case WORLD_LIST_CONNECTION:
			case REGISTER_INFO_CONNECTION:
			case REGISTER_USERNAME_CONNECTION:
				ctx.channel().writeAndFlush(new HandshakeResponse(key, type.get(), ClientMessage.SUCCESSFUL));
				break;
			case CREATE_ACCOUNT_CONNECTION:
				ctx.channel().writeAndFlush(new HandshakeResponse(key, type.get(), ClientMessage.SUCCESSFUL));
				break;
			}
		} else
			ctx.channel().close();
	}

}
