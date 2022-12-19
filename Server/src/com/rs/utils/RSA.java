package com.rs.utils;

import java.math.BigInteger;

import com.rs.Settings;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class RSA {

	/**
	 * Encrypts a buffer using the RSA encryption algorithm.
	 *
	 * @param in The byte buf.
	 * @return The encrypted buffer.
	 */
	public static ByteBuf encryptUsingRSA(ByteBuf in) {
		byte[] data = new byte[in.readUnsignedByte()];
		in.readBytes(data);
		return Unpooled.wrappedBuffer(new BigInteger(data).modPow(Settings.PRIVATE_EXPONENT, Settings.MODULUS).toByteArray());
	}

}
