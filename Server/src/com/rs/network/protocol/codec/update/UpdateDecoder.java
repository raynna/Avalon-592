package com.rs.network.protocol.codec.update;

import java.util.List;
import java.util.Optional;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class UpdateDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable() || in.readableBytes() < 4)
			return;

		Optional<UpdateType> type = UpdateType.getType(in.readUnsignedByte());
		if (type.isPresent()) {
			switch (type.get()) {
			case HIGH_PRIORITY_UPDATE:
			case LOW_PRIORITY_UPDATE:
				int index = in.readUnsignedByte();
				int archive = in.readUnsignedShort();

				out.add(new UpdateRequest(index, archive, type.get() == UpdateType.HIGH_PRIORITY_UPDATE));
				break;
			case XOR_ENCRYPTION_UPDATE:
				in.skipBytes(3);// TODO
				break;
			}
		} else
			in.skipBytes(3);
	}

}
