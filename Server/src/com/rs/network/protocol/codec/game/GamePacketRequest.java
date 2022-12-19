package com.rs.network.protocol.codec.game;

import com.rs.io.InputStream;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class GamePacketRequest {
	
	private final int packetId;
	
	private final int size;

	private final InputStream stream;

	/**
	 * Constructs a new class instance.
	 * @param size 
	 * @param packetId 
	 * @param inputStream
	 */
	public GamePacketRequest(int packetId, int size, InputStream stream) {
		this.packetId = packetId;
		this.size = size;
		this.stream = stream;
	}

	/**
	 * @return the packetId
	 */
	public int getPacketId() {
		return packetId;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the stream
	 */
	public InputStream getStream() {
		return stream;
	}

}
