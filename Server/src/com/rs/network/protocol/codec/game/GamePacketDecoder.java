package com.rs.network.protocol.codec.game;

import java.util.List;

import com.rs.game.player.Player;
import com.rs.io.InputStream;
import com.rs.network.protocol.packet.WorldPacketsDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class GamePacketDecoder extends ByteToMessageDecoder {

	/**
	 * Represents the player connected to the client.
	 */
	private final Player player;
	
	/**
	 * Represents the current state of the player's packet decoder.
	 */
	private State state = State.READ_ID;
	private boolean variable;

	/**
	 * Represents the packet id and size.
	 */
	private int packetId, size;

	/**
	 * Constructs a new class instance.
	 * @param player The player using this for decoding packets.
	 */
	public GamePacketDecoder(Player player) {
		this.player = player;
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if (!in.isReadable())
			return;

		if (state == State.READ_ID) {
			if (!in.isReadable()) {
				return;
			}

			packetId = getPacketId(in);
			if (packetId >= WorldPacketsDecoder.PACKET_SIZES.length)
				return;
			/* - decoder.nextInt() & 0xff */;
			size = WorldPacketsDecoder.PACKET_SIZES[packetId];

			if (size == -3) {
				System.out.println("Illegal opcode " + packetId + ".");
			}

			variable = size == -1;
			state = variable ? State.READ_SIZE : State.READ_PAYLOAD;
		}

		if (state == State.READ_SIZE) {
			if (!in.isReadable()) {
				return;
			}

			size = in.readUnsignedByte();
			state = State.READ_PAYLOAD;
		}

		if (state == State.READ_PAYLOAD) {
			if (in.readableBytes() < size) {
				return;
			}
			
			if (in.readableBytes() >= size) {
				if (size < 0)
					return;
				
				byte[] bytes = new byte[size];
				in.readBytes(bytes, 0, size);
				InputStream payload = new InputStream(bytes);
				state = State.READ_ID;

				out.add(new GamePacketRequest(packetId, size, payload));
			}
		}
	}

	/**
	 * Gets the packet id from the client using the {@link ByteBuf}.
	 * @param in The buffer used for reading the data.
	 * @return The packet id from the buffer.
	 */
	private int getPacketId(ByteBuf in) {
		int packetId = 0xff & in.readUnsignedByte();
		if (packetId < 128)
			return packetId;
		return (packetId - 128 << 8) + (in.readUnsignedByte());
	}

	/**
	 * Gets the player.
	 * @return the player.
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * 
	 * @author _jordan <jordan.abraham1997@gmail.com>
	 *
	 * Created on Apr 30, 2018.
	 */
	private enum State {
		READ_ID, READ_SIZE, READ_PAYLOAD
	}

}
