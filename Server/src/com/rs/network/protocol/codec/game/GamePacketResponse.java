package com.rs.network.protocol.codec.game;

import com.rs.io.OutputStream;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class GamePacketResponse {

	private final OutputStream stream;

	/**
	 * Constructs a new class instance.
	 * @param stream
	 */
	public GamePacketResponse(OutputStream stream) {
		this.stream = stream;
	}

	/**
	 * @return the stream
	 */
	public OutputStream getStream() {
		return stream;
	}

}
