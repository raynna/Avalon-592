package com.rs.network.protocol.codec.worldlist;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.utils.BufferUtils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class WorldListEncoder extends MessageToByteEncoder<WorldListResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, WorldListResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;

		boolean update = response.isUpdate();
		ByteBuf buffer = Unpooled.buffer();

		buffer.writeByte(1);
		buffer.writeByte(update ? 1 : 0);
		if (update) {
			BufferUtils.writeSmart(buffer, 1);
			BufferUtils.writeSmart(buffer, 0);
			BufferUtils.writeJagString(buffer, "Main World");
			BufferUtils.writeSmart(buffer, 0);
			BufferUtils.writeSmart(buffer, 2);
			BufferUtils.writeSmart(buffer, 1);
			BufferUtils.writeSmart(buffer, 1);
			buffer.writeByte(0);
			buffer.writeInt(0x1 | 0x8);
			BufferUtils.writeJagString(buffer, "");
			BufferUtils.writeJagString(buffer, Settings.HOST);
			buffer.writeInt(0x94DA4A87);
		}
		BufferUtils.writeSmart(buffer, 1);
		buffer.writeShort(World.getPlayers().size());

		out.writeByte(0);
		out.writeShort(buffer.writerIndex());
		out.writeBytes(buffer);
	}

}
