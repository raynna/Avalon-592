package com.rs.network.listener.impl;

import com.rs.game.player.Player;
import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.codec.game.GamePacketRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class GamePacketListener extends NetworkListener {

	/**
	 * Represents the player using game packets.
	 */
	private final Player player;

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 * @param player The player.
	 */
	public GamePacketListener(AttributeKey<NetworkListener> key, Player player) {
		super(key);
		this.player = player;
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof GamePacketRequest))
			return;
		
		GamePacketRequest request = (GamePacketRequest) msg;
		if (request.getStream().getRemaining() > 0 && player.getSession().isRegistered() && !player.hasFinished()) {
			synchronized (ctx.channel()) {
				player.getPacketsDecoder().processPackets(request.getPacketId(), request.getStream(), request.getSize());
			}
		}
	}

	/**
	 * Gets the player.
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

}
