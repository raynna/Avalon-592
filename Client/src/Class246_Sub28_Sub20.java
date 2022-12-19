/* Class246_Sub28_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub20 extends Class246_Sub28 {
	static int anInt6569;
	static int anInt6570;
	static Class81 aClass81_6571 = new Class81(15, 0, 1, 0);
	static int anInt6572 = -1;
	static int anInt6573;
	private int anInt6574 = 4096;

	final void method2143(int i, int i_0_, BufferStream stream) {
		try {
			anInt6570++;
			if (i != 4)
				method2135(3, 83);
			int i_1_ = i_0_;
			if ((i_1_ ^ 0xffffffff) == -1)
				anInt6574 = (stream.readUnsignedByte(255) << 12) / 255;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lc.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub28_Sub20(int i) {
		super(0, true);
		try {
			anInt6574 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lc.<init>(" + i + ')');
		}
	}

	public static void method2705(byte i) {
		do {
			try {
				aClass81_6571 = null;
				if (i == -9)
					break;
				anInt6573 = -89;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lc.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_2_) {
		try {
			anInt6569++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_2_);
			int i_3_ = -80 / ((67 - i) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887)
				Class117.method802(is, 0, Class246_Sub37_Sub1.f_gb, anInt6574);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lc.E(" + i + ',' + i_2_ + ')');
		}
	}

	public Class246_Sub28_Sub20() {
		this(4096);
	}
}
