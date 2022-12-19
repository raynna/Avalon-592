package com.rs.network;

import com.rs.game.player.Player;
import com.rs.network.listener.NetworkListener;
import com.rs.network.listener.impl.GamePacketListener;
import com.rs.network.listener.impl.HandshakeListener;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class NetworkHandler extends ChannelInboundHandlerAdapter {

	/**
	 * The current handler for the individual network handler.
	 */
	public final AttributeKey<NetworkListener> listenerKey;

	/**
	 * Constructs a new class instance.
	 * @param ch
	 */
	public NetworkHandler(AttributeKey<NetworkListener> listenerKey, SocketChannel channel) {
		this.listenerKey = listenerKey;

		// i hate this just as much as u do ;(
		channel.attr(listenerKey).set(new HandshakeListener(listenerKey));
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		NetworkListener listener = ctx.channel().attr(listenerKey).get();
		if (listener == null)
			return;

		listener.channelRead(ctx, msg);
	}

	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		Network.getChannels().add(ctx.channel());
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		Network.getChannels().remove(ctx.channel());
		NetworkListener listener = ctx.channel().attr(listenerKey).get();
		if (listener == null)
			return;

		if (listener instanceof GamePacketListener) {
			GamePacketListener game = (GamePacketListener) listener;
			Player player = game.getPlayer();

			if (player != null && !player.hasFinished())
				player.finish();
		}
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.channel().flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		if (cause.getMessage().equals("An established connection was aborted by the software in your host machine"))
			return;

		if (cause.getMessage().equals("An existing connection was forcibly closed by the remote host"))
			return;

		super.exceptionCaught(ctx, cause);
	}

}
