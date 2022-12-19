/* Class21_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21_Sub2 extends Class21 {
	static int anInt4493;
	static int anInt4494 = -1;
	private int anInt4495;
	private int anInt4496;
	private int anInt4497;
	static int anInt4498;
	static int anInt4499;
	private int anInt4500;
	static int anInt4501;
	static int anInt4502;
	static int[][][] anIntArrayArrayArray4503 = new int[2][][];

	static final int method2012(int i, int i_0_, int i_1_) {
		try {
			if (i != 11369)
				return 21;
			anInt4493++;
			if (i_1_ == 1 || i_1_ == 3)
				return Class_ss.anIntArray7058[i_0_ & 0x3];
			return Class179.anIntArray2519[0x3 & i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gu.G(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class21_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		super(-1, i_5_, i_6_);
		try {
			anInt4496 = i_2_;
			anInt4495 = i_3_;
			anInt4500 = i_4_;
			anInt4497 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gu.<init>(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method199(int i, int i_7_, int i_8_) {
		do {
			try {
				anInt4498++;
				if (i_7_ == 4)
					break;
				anInt4497 = 65;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gu.B(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2013(byte i) {
		do {
			try {
				anIntArrayArrayArray4503 = null;
				if (i < -20)
					break;
				anInt4494 = -14;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "gu.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2014(int i) {
		try {
			anInt4499++;
			for (Class130_Sub4 class130_sub4 = ((Class130_Sub4) HashMap.aClass68_762.method439((byte) 93)); class130_sub4 != null; class130_sub4 = ((Class130_Sub4) HashMap.aClass68_762.method439((byte) 98)))
				Class_c_Sub1.method2275((byte) -69, class130_sub4);
			int i_9_;
			int i_10_;
			if (Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 126)) {
				i_9_ = 0;
				i_10_ = 3;
			} else
				i_9_ = i_10_ = Class40_Sub6.anInt5103;
			client.method2982();
			int i_11_ = i_9_;
			if (i != -11841)
				method2012(-115, 23, 59);
			for (/**/; (i_11_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff); i_11_++) {
				client.method2980();
				client.method2973(i_11_);
				client.method2967(i_11_);
			}
			client.method2978();
			client.method2975();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gu.F(" + i + ')');
		}
	}

	final void method196(int i, int i_12_, int i_13_) {
		do {
			try {
				anInt4501++;
				if (i <= -78)
					break;
				method196(-34, -20, -83);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gu.D(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	final void method195(int i, int i_14_, int i_15_) {
		try {
			anInt4502++;
			int i_16_ = anInt4497 * i_15_ >> 12;
			int i_17_ = anInt4495 * i_15_ >> 12;
			if (i != 24245)
				anIntArrayArrayArray4503 = null;
			int i_18_ = i_14_ * anInt4496 >> 12;
			int i_19_ = anInt4500 * i_14_ >> 12;
			Class246_Sub41_Sub2.method2679(((Class21) this).anInt317, false, i_19_, i_18_, i_17_, i_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gu.E(" + i + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}
}
