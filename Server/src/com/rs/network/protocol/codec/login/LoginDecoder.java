package com.rs.network.protocol.codec.login;

import java.net.InetSocketAddress;
import java.util.List;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.World;
import com.rs.network.protocol.ClientMessage;
import com.rs.utils.BufferUtils;
import com.rs.utils.Encrypt;
import com.rs.utils.IPBanL;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.RSA;
import com.rs.utils.Utils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class LoginDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable())
			return;
		
		if (IPBanL.isBanned(((InetSocketAddress) ctx.channel().remoteAddress()).getAddress().getHostAddress())) {
			out.add(new LoginRequest(ClientMessage.BANNED));
			return;
		}
		
		if (World.exiting_start != 0) {
			out.add(new LoginRequest(ClientMessage.UPDATING));
			return;
		}
		
		int id = in.readUnsignedByte();
		int size = in.readUnsignedShort();
		
		if (size != in.readableBytes())
			return;
		
		int version = in.readInt();
		if (version != Settings.CLIENT_BUILD) {
			out.add(new LoginRequest(ClientMessage.OUT_OF_DATE));
			return;
		}
		
		if (id == 16 || id == 18) {
			in.readUnsignedByte();
			int displayMode = in.readUnsignedByte();
			int screenWidth = in.readUnsignedShort();
			int screenHeight = in.readUnsignedShort();
			in.readUnsignedByte();
			in.skipBytes(24);
			String settings = BufferUtils.readString(in);
			if (!settings.equals(Settings.GRAB_SERVER_TOKEN)) {
				out.add(new LoginRequest(ClientMessage.OUT_OF_DATE));
				return;
			}
			in.readInt();
			in.skipBytes(in.readUnsignedByte());
			in.readUnsignedShort();
			for (int index = 0; index < Cache.STORE.getIndexes().length; index++) {
				int crc = Cache.STORE.getIndexes()[index] == null ? -1011863738 : Cache.STORE.getIndexes()[index].getCRC();
				int receivedCRC = in.readInt();

				if (crc != receivedCRC) {
					Logger.log(this, "Invalid CRC at index: " + index + ", " + receivedCRC + ", " + crc);
					out.add(new LoginRequest(ClientMessage.OUT_OF_DATE));
					return;
				}
			}
			ByteBuf buffer = RSA.encryptUsingRSA(in);
	        int ratio = buffer.readUnsignedByte();
	        if (ratio != 10) {
	        	out.add(new LoginRequest(ClientMessage.OUT_OF_DATE));
	        	return;
	        }
	        int[] isaacKeys = new int[4];
			for (int i = 0; i < isaacKeys.length; i++) {
				isaacKeys[i] = buffer.readInt();
			}
			long usernameLong = buffer.readLong();
			String password = BufferUtils.readString(buffer);
			if (password.length() > 30 || password.length() < 3) {
				out.add(new LoginRequest(ClientMessage.INVALID_DETAILS));
				return;
			}
			password = Encrypt.encryptSHA1(password);
			String username = Utils.formatPlayerNameForProtocol(Utils.longToString(usernameLong));
			out.add(new LoginRequest(ctx.channel(), username, password, displayMode, screenWidth, screenHeight, new IsaacKeyPair(isaacKeys), ClientMessage.SUCCESSFUL_LOGIN));
		}
	}

}
