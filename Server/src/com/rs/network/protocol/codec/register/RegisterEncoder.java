package com.rs.network.protocol.codec.register;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterEncoder extends MessageToByteEncoder<RegisterResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, RegisterResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;

		out.writeByte(response.getResponse().getId());
	}

}
