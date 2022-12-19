package com.rs.utils;

import java.nio.ByteBuffer;

import io.netty.buffer.ByteBuf;

/**
 * This is for streaming or whatever
 *
 * @author 'Mystic Flow
 */
public class BufferUtils {

	public static void writeRS2String(ByteBuffer buffer, String string) {
		buffer.put(string.getBytes());
		buffer.put((byte) 0);
	}

	public static String readRS2String(ByteBuffer buffer) {
		StringBuilder sb = new StringBuilder();
		byte b;
		while (buffer.remaining() > 0 && (b = buffer.get()) != 0) {
			sb.append((char) b);
		}
		return sb.toString();
	}

	public static int readSmart(ByteBuffer buf) {
		int peek = buf.get(buf.position()) & 0xFF;
		if (peek < 128) {
			return buf.get();
		} else {
			return (buf.getShort() & 0xFFFF) - 32768;
		}
	}

	public static int getMediumInt(ByteBuffer buffer) {
		return ((buffer.get() & 0xFF) << 16) | ((buffer.get() & 0xFF) << 8) | (buffer.get() & 0xFF);
	}

	public static int readSmart2(ByteBuffer buffer) {
		int i_26_ = 0;
		int i_27_;
		for (i_27_ = readSmart(buffer); i_27_ == 32767; i_27_ = readSmart(buffer)) {
			i_26_ += 32767;
		}
		i_26_ += i_27_;
		return i_26_;
	}

	public static void writeInt(int val, int index, byte[] buffer) {
		buffer[index++] = (byte) (val >> 24);
		buffer[index++] = (byte) (val >> 16);
		buffer[index++] = (byte) (val >> 8);
		buffer[index++] = (byte) val;
	}

	public static int readInt(int index, byte[] buffer) {
		return ((buffer[index++] & 0xff) << 24) | ((buffer[index++] & 0xff) << 16) | ((buffer[index++] & 0xff) << 8) | (buffer[index++] & 0xff);
	}

	public static void writeSmart(ByteBuf out, int value) {
		if (value >= 128) {
			out.writeShort(value + 32768);
		} else {
			out.writeByte(value);
		}
	}

	public static void writeJagString(ByteBuf out, String str) {
		out.writeByte(0);
		out.writeBytes(str.getBytes());
		out.writeByte(0);
	}
	
	public static String readString(ByteBuf buffer) {
		StringBuilder bldr = new StringBuilder();
		byte b;
		while (buffer.isReadable() && (b = buffer.readByte()) != 0) {
			bldr.append((char) b);
		}
		return bldr.toString();
	}

}
