package com.rs.network.protocol.codec.game;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class GamePacketEncoder extends MessageToByteEncoder<GamePacketResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, GamePacketResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;
		
		//this is exactly how matrix does it with netty 3 basically.
		ByteBuf buffer = Unpooled.copiedBuffer(response.getStream().getBuffer(), 0, response.getStream().getOffset());
		if (buffer != null) {
			synchronized (ctx.channel()) {
				out.writeBytes(buffer);
			}
		}
	}

}
