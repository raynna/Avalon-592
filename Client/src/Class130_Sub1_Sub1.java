/* Class130_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class130_Sub1_Sub1 extends Class130_Sub1 {
	int anInt7037;
	int anInt7038;
	static int anInt7039;
	boolean aBool7040;
	byte aByte7041 = 5;
	static int anInt7042;
	int anInt7043;
	int anInt7044;
	static int anInt7045;
	static int anInt7046 = 0;
	static Class67 aClass67_7047 = new Class67("flash1:", "blinken1:", "clignotant1:", "flash1:");
	int anInt7048;
	int anInt7049;

	static final int method2880(int i, int i_0_, int i_1_, byte i_2_, int i_3_, int i_4_) {
		try {
			anInt7039++;
			if (Class59_Sub3_Sub4.aClass210Array6993 == null)
				return 0;
			if (i_2_ != 80)
				return -54;
			if ((i_4_ ^ 0xffffffff) > -4) {
				int i_5_ = i_0_ >> 7;
				int i_6_ = i_3_ >> 7;
				if ((i ^ 0xffffffff) > -1 || (i_1_ ^ 0xffffffff) > -1 || ((-1 + Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) > (i ^ 0xffffffff)) || (Class152.anInt2205 - 1 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
					return 0;
				if ((i_5_ ^ 0xffffffff) > -2 || i_6_ < 1 || (i_5_ ^ 0xffffffff) < (Class38_Sub1_Sub1.anInt6770 - 1 ^ 0xffffffff) || (-1 + Class152.anInt2205 ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
					return 0;
				boolean bool = (((Class45.aByteArrayArrayArray648[1][i_0_ >> 7][i_3_ >> 7]) & 0x2 ^ 0xffffffff) != -1);
				if ((i_0_ & 0x7f ^ 0xffffffff) == -1) {
					boolean bool_7_ = (((Class45.aByteArrayArrayArray648[1][i_5_ - 1][i_3_ >> 7]) & 0x2) != 0);
					boolean bool_8_ = ((0x2 & (Class45.aByteArrayArrayArray648[1][i_5_][i_3_ >> 7]) ^ 0xffffffff) != -1);
					if (!bool_8_ == bool_7_)
						bool = ((0x2 & Class45.aByteArrayArrayArray648[1][i][i_1_]) != 0);
				}
				if ((0x7f & i_3_) == 0) {
					boolean bool_9_ = ((0x2 & (Class45.aByteArrayArrayArray648[1][i_0_ >> 7][i_6_ - 1])) != 0);
					boolean bool_10_ = ((Class45.aByteArrayArrayArray648[1][i_0_ >> 7][i_6_] & 0x2) != 0);
					if (!bool_9_ == bool_10_)
						bool = ((Class45.aByteArrayArrayArray648[1][i][i_1_] & 0x2) ^ 0xffffffff) != -1;
				}
				if (bool)
					i_4_++;
			}
			return Class59_Sub3_Sub4.aClass210Array6993[i_4_].a(i_0_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wv.M(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method2881(int i) {
		try {
			int i_11_ = -87 / ((38 - i) / 43);
			aClass67_7047 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wv.L(" + i + ')');
		}
	}

	static final int method2882(int i) {
		try {
			anInt7042++;
			if (i <= 31)
				return 68;
			return 6;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wv.N(" + i + ')');
		}
	}

	public Class130_Sub1_Sub1() {
		/* empty */
	}
}
