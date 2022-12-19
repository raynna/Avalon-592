package com.rs.network;

import java.net.InetSocketAddress;

import com.rs.Settings;
import com.rs.network.listener.NetworkListener;
import com.rs.network.protocol.codec.handshake.HandshakeDecoder;
import com.rs.network.protocol.codec.handshake.HandshakeEncoder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GlobalEventExecutor;


/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class Network {

	/**
	 * Represents the channels inside the network.
	 */
	private static final ChannelGroup CHANNELS = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

	/**
	 * Represents the network bootstrap.
	 */
	private static final ServerBootstrap BOOTSTRAP = new ServerBootstrap();

	/**
	 * Loads and starts the network.
	 */
	public static void load() {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		EventLoopGroup boss = new NioEventLoopGroup(1);
		EventLoopGroup worker = new NioEventLoopGroup(availableProcessors >= 6 ? availableProcessors - (availableProcessors >= 12 ? 6 : 4) : 2);

		BOOTSTRAP.group(boss, worker);
		BOOTSTRAP.channel(NioServerSocketChannel.class);
		BOOTSTRAP.childHandler(new ChannelInitializer<SocketChannel>() {

			@Override
			protected void initChannel(SocketChannel ch) throws Exception {
				ChannelPipeline pipeline = ch.pipeline();
				AttributeKey<NetworkListener> key = AttributeKey.valueOf(ch.remoteAddress().getAddress().getHostAddress());

				pipeline.addLast("decoder", new HandshakeDecoder(key));
				pipeline.addLast("encoder", new HandshakeEncoder());
				pipeline.addLast("adapter", new NetworkHandler(key, ch));
			}

		});

		BOOTSTRAP.childOption(ChannelOption.SO_REUSEADDR, true);
		BOOTSTRAP.childOption(ChannelOption.TCP_NODELAY, true);
		BOOTSTRAP.childOption(ChannelOption.CONNECT_TIMEOUT_MILLIS, Settings.CONNECTION_TIMEOUT);

		try {
			BOOTSTRAP.bind(new InetSocketAddress(Settings.HOST, Settings.PORT_ID)).sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shuts down the network.
	 */
	public static void shutdown() {
		CHANNELS.close().awaitUninterruptibly();
	}

	/**
	 * @return the channels
	 */
	public static ChannelGroup getChannels() {
		return CHANNELS;
	}

}
