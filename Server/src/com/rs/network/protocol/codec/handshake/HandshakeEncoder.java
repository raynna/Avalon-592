package com.rs.network.protocol.codec.handshake;

import com.rs.network.listener.NetworkListener;
import com.rs.network.listener.impl.LoginListener;
import com.rs.network.listener.impl.UpdateListener;
import com.rs.network.listener.impl.WorldListListener;
import com.rs.network.listener.impl.register.RegisterAccountListener;
import com.rs.network.listener.impl.register.RegisterInfoListener;
import com.rs.network.listener.impl.register.RegisterUsernameListener;
import com.rs.network.protocol.ClientMessage;
import com.rs.network.protocol.codec.login.LoginDecoder;
import com.rs.network.protocol.codec.login.LoginEncoder;
import com.rs.network.protocol.codec.register.RegisterDecoder;
import com.rs.network.protocol.codec.register.RegisterEncoder;
import com.rs.network.protocol.codec.update.UpdateDecoder;
import com.rs.network.protocol.codec.update.UpdateEncoder;
import com.rs.network.protocol.codec.worldlist.WorldListDecoder;
import com.rs.network.protocol.codec.worldlist.WorldListEncoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class HandshakeEncoder extends MessageToByteEncoder<HandshakeResponse> {

	@Override
	protected void encode(ChannelHandlerContext ctx, HandshakeResponse response, ByteBuf out) throws Exception {
		if (!out.isWritable())
			return;

		ClientMessage message = response.getResponse();
		ChannelPipeline pipeline = ctx.channel().pipeline();
		AttributeKey<NetworkListener> key = response.getKey();

		if (response.getType() != HandshakeType.WORLD_LIST_CONNECTION && response.getType() != HandshakeType.REGISTER_USERNAME_CONNECTION && response.getType() != HandshakeType.REGISTER_INFO_CONNECTION && response.getType() != HandshakeType.CREATE_ACCOUNT_CONNECTION)
			out.writeByte(message.getId());

		if (message == ClientMessage.SUCCESSFUL) {
			switch (response.getType()) {
			case UPDATE_CONNECTION:
				ctx.channel().attr(key).set(new UpdateListener(key));
				pipeline.addAfter("decoder", "update.encoder", new UpdateEncoder());
				pipeline.replace("decoder", "update.decoder", new UpdateDecoder());
				break;
			case LOGIN_CONNECTION:
				out.writeLong(((long) (Math.random() * 99999999D) << 32) + (long) (Math.random() * 99999999D));
				ctx.channel().attr(key).set(new LoginListener(key));
				pipeline.addAfter("decoder", "login.encoder", new LoginEncoder());
				pipeline.replace("decoder", "login.decoder", new LoginDecoder());
				break;
			case WORLD_LIST_CONNECTION:
				ctx.channel().attr(key).set(new WorldListListener(key));
				pipeline.addAfter("decoder", "list.encoder", new WorldListEncoder());
				pipeline.replace("decoder", "list.decoder", new WorldListDecoder());
				break;
			case REGISTER_USERNAME_CONNECTION:
				ctx.channel().attr(key).set(new RegisterUsernameListener(key));
				pipeline.addAfter("decoder", "username.encoder", new RegisterEncoder());
				pipeline.replace("decoder", "username.decoder", new RegisterDecoder());
				break;
			case REGISTER_INFO_CONNECTION:
				ctx.channel().attr(key).set(new RegisterInfoListener(key));
				pipeline.addAfter("decoder", "info.encoder", new RegisterEncoder());
				pipeline.replace("decoder", "info.decoder", new RegisterDecoder());
				break;
			case CREATE_ACCOUNT_CONNECTION:
				ctx.channel().attr(key).set(new RegisterAccountListener(key));
				pipeline.addAfter("decoder", "account.encoder", new RegisterEncoder());
				pipeline.replace("decoder", "account.decoder", new RegisterDecoder());
				break;
			}
		}
		
		pipeline.remove(this);
	}

}
