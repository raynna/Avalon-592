/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53 {
	static int anInt753;
	static Class67 aClass67_754 = new Class67("wave2:", "welle2:", "ondulation2:", "onda2:");
	static int[] anIntArray755 = new int[2048];
	static int anInt756;
	static Class217 aClass217_757 = new Class217();

	static final int method366(int i, int i_0_, boolean bool, int i_1_) {
		try {
			i_1_ &= 0x3;
			anInt756++;
			if (i_1_ == 0)
				return i;
			if ((i_1_ ^ 0xffffffff) == -2)
				return 1023 + -i_0_;
			if (bool != false)
				return -91;
			if (i_1_ == 2)
				return 1023 + -i;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eu.B(" + i + ',' + i_0_ + ',' + bool + ',' + i_1_ + ')'));
		}
	}

	public static void method367(byte i) {
		try {
			int i_2_ = -24 % ((i + 65) / 55);
			anIntArray755 = null;
			aClass67_754 = null;
			aClass217_757 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eu.C(" + i + ')');
		}
	}

	static final int method368(int i, int i_3_, int i_4_) {
		try {
			int i_5_ = -51 % ((23 - i) / 37);
			anInt753++;
			int i_6_ = (Class246_Sub28_Sub24.method2738((byte) 126, i_4_ - 1, -1 + i_3_) - -Class246_Sub28_Sub24.method2738((byte) 119, -1 + i_4_, 1 + i_3_) - -Class246_Sub28_Sub24.method2738((byte) 123, i_4_ + 1, i_3_ - 1) - -Class246_Sub28_Sub24.method2738((byte) 124, i_4_ + 1, 1 + i_3_));
			int i_7_ = (Class246_Sub28_Sub24.method2738((byte) 124, i_4_, i_3_ - 1) + Class246_Sub28_Sub24.method2738((byte) 122, i_4_, i_3_ + 1) + (Class246_Sub28_Sub24.method2738((byte) 127, i_4_ - 1, i_3_) - -Class246_Sub28_Sub24.method2738((byte) 120, 1 + i_4_, i_3_)));
			int i_8_ = Class246_Sub28_Sub24.method2738((byte) 119, i_4_, i_3_);
			return i_6_ / 16 - (-(i_7_ / 8) - i_8_ / 4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eu.A(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}
}
