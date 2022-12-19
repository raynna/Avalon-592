
/* Class82_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class82_Sub1 extends Class82 {
	private ByteBuffer aByteBuffer3945;

	final byte[] method523(int i, int i_0_, int i_1_) {
		byte[] is;
		try {
			if (i_1_ != 13)
				aByteBuffer3945 = null;
			aByteBuffer3945.position(i);
			byte[] is_2_ = new byte[i_0_];
			aByteBuffer3945.get(is_2_, 0, i_0_);
			is = is_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final byte[] method524(byte i) {
		byte[] is;
		try {
			int i_3_ = 126 / ((i - 66) / 55);
			byte[] is_4_ = new byte[aByteBuffer3945.capacity()];
			aByteBuffer3945.position(0);
			aByteBuffer3945.get(is_4_);
			is = is_4_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final void method525(int i, byte[] is) {
		try {
			aByteBuffer3945 = ByteBuffer.allocateDirect(is.length);
			aByteBuffer3945.position(0);
			if (i == 2)
				aByteBuffer3945.put(is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
