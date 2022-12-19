/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 {
	static int anInt2255;
	static int anInt2256;
	static int anInt2257;
	static Class166 aClass166_2258 = new Class166();
	static Class67 aClass67_2259 = new Class67("slide:", "gleiten:", "glissement:", "deslizamento:");
	static short aShort2260 = 256;

	static final boolean method1055(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt2256++;
			for (int i_5_ = i_4_; i_1_ >= i_5_; i_5_++) {
				for (int i_6_ = i_0_; i >= i_6_; i_6_++) {
					if (((Class24.anIntArrayArray348[i_5_][i_6_] ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) && (Class246_Sub6.anIntArrayArray3944[i_5_][i_6_] ^ 0xffffffff) >= -2)
						return true;
				}
			}
			if (i_3_ != -2)
				method1055(93, 112, 36, -33, -100, -71);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pb.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method1056(byte i) {
		try {
			aClass166_2258 = null;
			if (i >= 101)
				aClass67_2259 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pb.C(" + i + ')');
		}
	}

	static final void method1057(boolean bool) {
		try {
			Class40_Sub2.method1858((long) Class246_Sub1_Sub4.anInt5752, Class246_Sub15.aClass260_4445, 114);
			anInt2257++;
			if (bool != false)
				method1056((byte) 118);
			if ((Class183.anInt2549 ^ 0xffffffff) != 0)
				Class78.method489((byte) -16, Class183.anInt2549);
			for (int i = 0; (Class124.anInt1738 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (Class246_Sub39.aBoolArray5488[i])
					Class246_Sub28_Sub24.aBoolArray6673[i] = true;
				Class37.aBoolArray546[i] = Class246_Sub39.aBoolArray5488[i];
				Class246_Sub39.aBoolArray5488[i] = false;
			}
			Class130_Sub6.anInt4841 = Class246_Sub1_Sub4.anInt5752;
			if (Class246_Sub15.aClass260_4445.method1684())
				Class224.aBool3095 = true;
			if ((Class183.anInt2549 ^ 0xffffffff) != 0) {
				Class124.anInt1738 = 0;
				Class128_Sub1.method2329(-9410);
			}
			Class246_Sub15.aClass260_4445.e();
			Class204.method1339(Class188.anInt2657, (byte) 125);
			Class246_Sub17.anInt4663 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pb.D(" + bool + ')');
		}
	}

	static final void method1058(boolean bool) {
		try {
			Class246_Sub28_Sub29.aClass_lArray6820 = null;
			Class246_Sub28_Sub12.aClass_lArray6192 = null;
			Class169.aClass_lArray2410 = null;
			if (bool != false)
				aShort2260 = (short) 107;
			Class233.aClass_lArray3188 = null;
			Class109.aClass116_1554 = null;
			Class_c.aClass116_1196 = null;
			Class246_Sub28_Sub32.aClass_l6928 = null;
			Class58.aClass_lArray814 = null;
			Class40_Sub7.aClass_lArray5179 = null;
			Class_cs.aClass_lArray7146 = null;
			Class260.aClass_lArray3726 = null;
			Class66.aClass_lArray882 = null;
			Class243.aClass_lArray3448 = null;
			Class98.aClass_lArray1279 = null;
			Class_ds.aClass_lArray6718 = null;
			Class79_Sub1.aClass116_5162 = null;
			Class246_Sub16.aClass_l4521 = null;
			Class191.aClass_lArray2694 = null;
			anInt2255++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pb.A(" + bool + ')');
		}
	}
}
