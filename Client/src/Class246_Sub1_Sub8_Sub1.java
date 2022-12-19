/* Class246_Sub1_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub8_Sub1 extends Class246_Sub1_Sub8 {
	static int anInt7155;
	static int anInt7156;
	static int anInt7157 = -1;
	static int[][] anIntArrayArray7158;
	static int anInt7159;
	static int anInt7160;
	static int anInt7161;
	static int anInt7162;
	private Object anObject7163;
	static short[] aShortArray7164 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	static final char method2923(int i, byte i_0_) {
		try {
			anInt7162++;
			int i_1_ = 0xff & i_0_;
			if ((i_1_ ^ 0xffffffff) == -1)
				throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i_1_, 16) + " provided");
			if ((i_1_ ^ 0xffffffff) <= -129 && i_1_ < 160) {
				int i_2_ = Class40_Sub9.aCharArray5496[-128 + i_1_];
				if ((i_2_ ^ 0xffffffff) == -1)
					i_2_ = 63;
				i_1_ = i_2_;
			}
			if (i != 32404)
				method2923(127, (byte) 14);
			return (char) i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.E(" + i + ',' + i_0_ + ')');
		}
	}

	final boolean method2566(byte i) {
		try {
			if (i <= 57)
				return false;
			anInt7160++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.A(" + i + ')');
		}
	}

	static final void method2924(int i) {
		try {
			for (Class130_Sub2 class130_sub2 = ((Class130_Sub2) Class216.aClass68_3008.method445(i + 60)); class130_sub2 != null; class130_sub2 = (Class130_Sub2) Class216.aClass68_3008.method442((byte) -45))
				class130_sub2.method1778();
			if (i != 2)
				anInt7159 = 29;
			anInt7161++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.D(" + i + ')');
		}
	}

	static final void method2925(int i, byte i_3_, boolean bool, int i_4_, int i_5_, Class116 class116, Class260 class260) {
		try {
			if (bool) {
				Class187_Sub2.aClass_l5428.method729((Class246_Sub41_Sub1.anInt6171 + -Class187_Sub2.aClass_l5428.j()) / 2, ((Class162.anInt2300 + -Class187_Sub2.aClass_l5428.T()) / 2));
				Class46.aClass_l666.method729((Class246_Sub41_Sub1.anInt6171 + -Class46.aClass_l666.j()) / 2, 18);
			}
			anInt7156++;
			if (i_3_ != 91)
				anInt7157 = -79;
			class116.method792(Class246_Sub41_Sub1.anInt6171 / 2, i_5_, 0, Class162.anInt2300 / 2 - 26, -1, ((Class246_Sub28_Sub16.aClass101_6394 != Class59_Sub4_Sub3.aClass101_6943) ? Class259_Sub3_Sub1.aClass67_6902 : Class144.aClass67_2088).method436(true, Class_j.anInt1485));
			int i_6_ = -18 + Class162.anInt2300 / 2;
			class260.method1753(-152 + Class246_Sub41_Sub1.anInt6171 / 2, i_6_, 304, 34, i, 0);
			class260.method1753(-151 + Class246_Sub41_Sub1.anInt6171 / 2, i_6_ + 1, 302, 32, 0, 0);
			class260.O(-150 + Class246_Sub41_Sub1.anInt6171 / 2, i_6_ + 2, 3 * Class134.loadingPercentage, 30, i_4_, 0);
			class260.O((Class246_Sub41_Sub1.anInt6171 / 2 - 150 + 3 * Class134.loadingPercentage), 2 + i_6_, -(3 * Class134.loadingPercentage) + 300, 30, 0, 0);
			class116.method792(Class246_Sub41_Sub1.anInt6171 / 2, i_5_, 0, Class162.anInt2300 / 2 + 4, -1, Class246_Sub1_Sub4.aString5748);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ne.F(" + i + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + (class116 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2926(boolean bool) {
		try {
			anIntArrayArray7158 = null;
			if (bool != true)
				method2923(-91, (byte) 15);
			aShortArray7164 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.G(" + bool + ')');
		}
	}

	Class246_Sub1_Sub8_Sub1(Object object, int i) {
		super(i);
		try {
			anObject7163 = object;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ne.<init>(" + (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Object method2568(int i) {
		try {
			anInt7155++;
			if (i != 250)
				aShortArray7164 = null;
			return anObject7163;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ne.B(" + i + ')');
		}
	}

	static {
		anIntArrayArray7158 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	}
}
