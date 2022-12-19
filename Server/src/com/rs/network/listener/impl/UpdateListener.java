package com.rs.network.listener.impl;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.codec.update.UpdateRequest;
import com.rs.network.protocol.codec.update.UpdateResponse;
import com.rs.utils.Logger;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class UpdateListener extends NetworkListener {

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 */
	public UpdateListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof UpdateRequest))
			return;

		UpdateRequest request = (UpdateRequest) msg;
		int index = request.getIndex();
		int archive = request.getArchive();

		if (archive < 0) {
			if (Settings.DEBUG)
				Logger.log(this, "Fake request: " + index + ", " + archive);
			return;
		}
		if (index != 255) {
			if (Cache.STORE.getIndexes().length <= index || Cache.STORE.getIndexes()[index] == null || !Cache.STORE.getIndexes()[index].archiveExists(archive)) {
				if (Settings.DEBUG)
					Logger.log(this, "Fake request: " + index + ", " + archive);
				return;
			}
		} else if (archive != 255) {
			if (Cache.STORE.getIndexes().length <= archive || Cache.STORE.getIndexes()[archive] == null) {
				if (Settings.DEBUG)
					Logger.log(this, "Fake request: " + index + ", " + archive);
				return;
			}
		}

		if (index == 255 && archive == 255)
			ctx.channel().writeAndFlush(new UpdateResponse(getContainerPacketData()));
		else
			ctx.channel().writeAndFlush(new UpdateResponse(getArchivePacketData(index, archive, request.isPriority())));
	}

	/**
	 * Gets and returns the data if the client requested (255, 255).
	 * @return The data wrapped in a {@link ByteBuf}.
	 */
	private ByteBuf getContainerPacketData() {
		byte[] archive = Cache.getUKEYS();
		ByteBuf buffer = Unpooled.buffer(archive.length + 4);
		buffer.writeByte(255);
		buffer.writeShort(255);
		buffer.writeByte(0);
		buffer.writeInt(archive.length);
		for (int index = 0; index < archive.length; index++) {
			if (buffer.writerIndex() % 512 == 0) {
				buffer.writeByte(255);
			}
			buffer.writeByte(archive[index]);
		}
		return buffer;
	}

	/**
	 * Gets the archive data for each requested index and archive.
	 * @param indexId The requested index id.
	 * @param archiveId The requested archive id.
	 * @param priority The priority type of the file request.
	 * @return The data wrapped in a {@link ByteBuf}.
	 */
	private ByteBuf getArchivePacketData(int indexId, int archiveId, boolean priority) {
		byte[] archive = (indexId == 255 ? Cache.STORE.getIndex255() : Cache.STORE.getIndexes()[indexId].getMainFile()).getArchiveData(archiveId);
		if (archive == null)
			return null;

		int compression = archive[0] & 0xff;
		int length = ((archive[1] & 0xff) << 24) + ((archive[2] & 0xff) << 16) + ((archive[3] & 0xff) << 8) + (archive[4] & 0xff);
		int settings = compression;
		if (!priority)
			settings |= 0x80;
		ByteBuf buffer = Unpooled.buffer();
		buffer.writeByte(indexId);
		buffer.writeShort(archiveId);
		buffer.writeByte(settings);
		buffer.writeInt(length);
		int realLength = compression != 0 ? length + 4 : length;
		for (int index = 5; index < realLength + 5; index++) {
			if (buffer.writerIndex() % 512 == 0) {
				buffer.writeByte(255);
			}
			buffer.writeByte(archive[index]);
		}
		return buffer;
	}

}
