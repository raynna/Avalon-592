/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class236 {
	static Class121[] aClass121Array3306;
	static int anInt3307;
	static Class_fs aClass_fs3308;
	private Class109 aClass109_3309;
	private int anInt3310;
	private Class40[] aClass40Array3311;
	static int anInt3312;
	private int anInt3313 = 0;
	static int anInt3314;
	static int[] anIntArray3315 = new int[500];
	private Class260_Sub2 aClass260_Sub2_3316;
	Class40_Sub9 aClass40_Sub9_3317;
	private int anInt3318;
	static boolean[] aBoolArray3319 = new boolean[100];
	static int anInt3320;
	private Class_m aClass_m3321;
	static int anInt3322;

	final boolean method1518(byte i, Class109 class109, int i_0_) {
		try {
			if (i >= -76)
				return true;
			anInt3322++;
			if ((anInt3313 ^ 0xffffffff) == -1)
				return false;
			if (class109 != aClass109_3309) {
				aClass40Array3311[anInt3313 & 0x7fffffff].method283(i_0_, class109, true);
				aClass109_3309 = class109;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uv.A(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final boolean method1519(int i, byte i_1_) {
		try {
			anInt3312++;
			int i_2_ = -33 % ((i_1_ + 58) / 34);
			return aClass40Array3311[i].method282(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uv.D(" + i + ',' + i_1_ + ')');
		}
	}

	final void method1520(int i, boolean bool, boolean bool_3_, int i_4_) {
		try {
			anInt3314++;
			bool &= aClass260_Sub2_3316.method1702();
			if (!bool && (i_4_ == 4 || i_4_ == 8))
				i_4_ = 2;
			if ((i_4_ ^ 0xffffffff) != -1 && bool_3_)
				i_4_ |= ~0x7fffffff;
			if (i > -69)
				aClass40Array3311 = null;
			if ((i_4_ ^ 0xffffffff) == (anInt3313 ^ 0xffffffff)) {
				if ((anInt3313 ^ 0xffffffff) != -1)
					aClass40Array3311[0x7fffffff & anInt3313].method284(bool_3_, (byte) 117);
			} else {
				if (anInt3313 != 0)
					aClass40Array3311[0x7fffffff & anInt3313].method280(0);
				if (i_4_ != 0) {
					aClass40Array3311[i_4_ & 0x7fffffff].method278(0, bool_3_);
					aClass40Array3311[0x7fffffff & i_4_].method284(bool_3_, (byte) 121);
				}
				anInt3313 = i_4_;
				anInt3310 = -2147483648;
				aClass109_3309 = null;
				anInt3318 = -2147483648;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uv.C(" + i + ',' + bool + ',' + bool_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method1521(int i, int i_5_, boolean bool) {
		do {
			try {
				if (((anInt3310 ^ 0xffffffff) != (i ^ 0xffffffff) | i_5_ != anInt3318) & (anInt3313 ^ 0xffffffff) != -1) {
					aClass40Array3311[0x7fffffff & anInt3313].method277(i_5_, 83, i);
					anInt3310 = i;
					anInt3318 = i_5_;
				}
				anInt3320++;
				if (bool == false)
					break;
				aClass121Array3306 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uv.F(" + i + ',' + i_5_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public static void method1522(int i) {
		do {
			try {
				aClass121Array3306 = null;
				anIntArray3315 = null;
				aBoolArray3319 = null;
				aClass_fs3308 = null;
				if (i == 9)
					break;
				method1522(-31);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uv.E(" + i + ')');
			}
			break;
		} while (false);
	}

	Class236(Class260_Sub2 class260_sub2) {
		anInt3310 = 0;
		aClass109_3309 = null;
		anInt3318 = 0;
		do {
			try {
				aClass260_Sub2_3316 = class260_sub2;
				aClass_m3321 = new Class_m(class260_sub2);
				aClass40Array3311 = new Class40[10];
				aClass40Array3311[1] = new Class40_Sub6(class260_sub2);
				aClass40Array3311[2] = new Class40_Sub4(class260_sub2, aClass_m3321);
				aClass40Array3311[4] = new Class40_Sub3(class260_sub2, aClass_m3321);
				aClass40Array3311[5] = new Class40_Sub5(class260_sub2, aClass_m3321);
				aClass40Array3311[6] = new Class40_Sub8(class260_sub2);
				aClass40Array3311[7] = new Class40_Sub7(class260_sub2);
				aClass40Array3311[3] = ((Class236) this).aClass40_Sub9_3317 = new Class40_Sub9(class260_sub2);
				aClass40Array3311[8] = new Class40_Sub1(class260_sub2, aClass_m3321);
				aClass40Array3311[9] = new Class40_Sub2(class260_sub2, aClass_m3321);
				if (!aClass40Array3311[8].method282(true))
					aClass40Array3311[8] = aClass40Array3311[4];
				if (aClass40Array3311[9].method282(true))
					break;
				aClass40Array3311[9] = aClass40Array3311[8];
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uv.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static int method1523(int i, int i_6_) {
		try {
			return i | i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uv.B(" + i + ',' + i_6_ + ')');
		}
	}
}
