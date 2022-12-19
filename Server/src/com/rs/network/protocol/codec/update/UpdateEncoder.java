package com.rs.network.protocol.codec.update;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class UpdateEncoder extends MessageToByteEncoder<UpdateResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, UpdateResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;
		
		out.writeBytes(response.getBuffer());
	}

}
