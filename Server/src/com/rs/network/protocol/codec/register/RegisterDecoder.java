package com.rs.network.protocol.codec.register;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable())
			return;

		ChannelPipeline pipeline = ctx.channel().pipeline();

		if (pipeline.get("username.decoder") != null) {
			pipeline.replace("username.decoder", "username.decoder", new RegisterUsernameDecoder());
		} else if (pipeline.get("info.decoder") != null) {
			pipeline.replace("info.decoder", "info.decoder", new RegisterInfoDecoder());
		} else if (pipeline.get("account.decoder") != null) {
			decodeAccountCreation(ctx, in, out);
		}
	}

	/**
	 * Decodes the final account creation.
	 */
	private void decodeAccountCreation(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
		// TODO find out why acc creation doesnt work.
	}

}
