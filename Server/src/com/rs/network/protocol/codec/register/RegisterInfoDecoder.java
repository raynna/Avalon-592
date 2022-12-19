package com.rs.network.protocol.codec.register;

import java.util.GregorianCalendar;
import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterInfoDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable() || in.readableBytes() < 6)
			return;

		int day = in.readByte();
		int month = in.readByte();
		int year = in.readShort();
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		int country = in.readShort();

		// theres no real reason to use this information.
		out.add(new RegisterInfoRequest(day, month, year, calendar, country));
		
		ctx.pipeline().remove(this);
	}

}
