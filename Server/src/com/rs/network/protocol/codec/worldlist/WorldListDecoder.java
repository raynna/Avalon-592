package com.rs.network.protocol.codec.worldlist;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class WorldListDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable() || in.readableBytes() < 1)
			return;
		
		boolean update = in.readUnsignedByte() == 0;
		out.add(new WorldListRequest(update));
	}

}
