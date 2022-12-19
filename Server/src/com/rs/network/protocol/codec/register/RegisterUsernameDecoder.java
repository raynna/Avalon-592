package com.rs.network.protocol.codec.register;

import java.util.List;

import com.rs.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterUsernameDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable() || in.readableBytes() < 8)
            return;
		
		String username = Utils.longToString(in.readLong()).trim();
		out.add(new RegisterUsernameRequest(username));
		
		ctx.pipeline().remove(this);
	}

}
