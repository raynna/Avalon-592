package com.rs.network.protocol.codec.update;

import io.netty.buffer.ByteBuf;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class UpdateResponse {

	/**
	 * Represents the data buffer wrapped in {@link ByteBuf}.
	 */
	private final ByteBuf buffer;

	/**
	 * Constructs a new class instance.
	 * @param buffer The buffer.
	 */
	public UpdateResponse(ByteBuf buffer) {
		this.buffer = buffer;
	}

	/**
	 * Gets the buffer.
	 * @return the buffer
	 */
	public ByteBuf getBuffer() {
		return buffer;
	}

}
