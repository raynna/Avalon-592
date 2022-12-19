package com.rs.network.protocol.codec.login;

import com.rs.game.player.Player;
import com.rs.network.protocol.ClientMessage;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class LoginEncoder extends MessageToByteEncoder<LoginResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, LoginResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;

		ClientMessage message = response.getResponse();
		out.writeByte(message.getId());

		if (message != ClientMessage.SUCCESSFUL_LOGIN)
			return;

		Player player = response.getPlayer();
		out.writeByte(player.getRights());
		out.writeByte(0);
		out.writeByte(0);
		out.writeByte(0);
		out.writeByte(0);
		out.writeByte(0);
		out.writeShort(player.getIndex());
		out.writeByte(1);
		out.writeByte(1);
	}

}
