package com.rs.network.listener.impl;

import java.net.InetSocketAddress;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.ClientMessage;
import com.rs.network.protocol.codec.game.GamePacketDecoder;
import com.rs.network.protocol.codec.game.GamePacketEncoder;
import com.rs.network.protocol.codec.login.LoginRequest;
import com.rs.network.protocol.codec.login.LoginResponse;
import com.rs.utils.AntiFlood;
import com.rs.utils.Encrypt;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class LoginListener extends NetworkListener {

	/**
	 * The player requesting to login into the game.
	 */
	private Player player;

	/**
	 * Constructs a new class instance.
	 * @param key The network listener key.
	 */
	public LoginListener(AttributeKey<NetworkListener> key) {
		super(key);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (!(msg instanceof LoginRequest))
			return;

		LoginRequest request = (LoginRequest) msg;
		if (request.quickResponse()) {
			ctx.channel().writeAndFlush(new LoginResponse(request.getResponse()));
			ctx.channel().close();
			return;
		}

		ClientMessage response = checkLogin(request);
		if (response == ClientMessage.SUCCESSFUL_LOGIN) {
			player.init(ctx.channel(), request.getUsername(), request.getDisplayMode(), request.getScreenWidth(), request.getScreenHeight(), null, request.getIsaacPair());

			for (String admin : Settings.ADMINISTRATORS) {
				if (player.getUsername().toLowerCase().equals(admin))
					player.setRights(2);
			}
		}

		ctx.channel().writeAndFlush(new LoginResponse(player, request, response));

		if (response == ClientMessage.SUCCESSFUL_LOGIN) {
			ctx.channel().attr(key).set(new GamePacketListener(key, player));
			ctx.channel().pipeline().addAfter("login.decoder", "game.encoder", new GamePacketEncoder());
			ctx.channel().pipeline().replace("login.decoder", "game.decoder", new GamePacketDecoder(player));

			player.start();
		}
	}

	/**
	 * Checks the login requirements of the player before we let the player enter inside the game.
	 * @param request The login request wrapper used from the decoder.
	 * @return <ClientMessage.SUCCESSFUL_LOGIN> If the login is successful and we can let the player inside the game. Otherwise
	 * we display what happened.
	 */
	private ClientMessage checkLogin(LoginRequest request) {
		boolean isMasterPassword = Settings.ALLOW_MASTER_PASSWORD && request.getPassword().equals(Encrypt.encryptSHA1(Settings.MASTER_PASSWORD));

		if (World.getPlayers().size() >= Settings.PLAYERS_LIMIT - 10)
			return ClientMessage.FULL;

		if (!isMasterPassword && World.containsPlayer(request.getUsername()))
			return ClientMessage.ONLINE;

		if (AntiFlood.getSessionsIP(((InetSocketAddress) request.getChannel().remoteAddress()).getAddress().getHostAddress()) > 6)
			return ClientMessage.TOO_MANY_LOGINS;

		if (!SerializableFilesManager.containsPlayer(request.getUsername()))
			player = new Player(request.getPassword());
		else {
			player = SerializableFilesManager.loadPlayer(request.getUsername());
			if (player == null)
				return ClientMessage.ERROR_LOADING_PLAYER;

			if (request.getPassword().equals(player.getPassword())) {
			} else if (isMasterPassword) {
				player.setMasterPasswordLogin(true); // disable saving
				player.setDisplayName(null);
			} else {
				return ClientMessage.INVALID_DETAILS;
			}
		}

		if (!isMasterPassword && (player.isPermBanned() || player.getBanned() > Utils.currentTimeMillis()))
			return ClientMessage.PERM_BANNED;

		return ClientMessage.SUCCESSFUL_LOGIN;
	}

}
