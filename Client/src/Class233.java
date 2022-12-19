/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class233 {
	static int anInt3180;
	static Class_fs aClass_fs3181;
	static int anInt3182;
	static int anInt3183 = -1;
	static int anInt3184 = 0;
	static Class12 aClass12_3185 = new Class12(1, 7);
	static int anInt3186;
	static int anInt3187;
	static Class_l[] aClass_lArray3188;

	public static void method1491(byte i) {
		try {
			aClass_lArray3188 = null;
			int i_0_ = -91 / ((i + 47) / 62);
			aClass_fs3181 = null;
			aClass12_3185 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uq.B(" + i + ')');
		}
	}

	static final void method1492(int i, byte i_1_, Class246_Sub2 class246_sub2, int i_2_, int i_3_, Class198 class198, Class140 class140, Class260 class260) {
		try {
			anInt3180++;
			int i_4_ = (-(i_2_ / 2) + (((Class246_Sub2) class246_sub2).anInt3810 - 5));
			int i_5_ = i_3_ + 2;
			if (((Class140) class140).anInt2013 != 0)
				class260.method1734(i_4_, i_2_ + 10, i_5_, (byte) 58, ((Class140) class140).anInt2013, (class198.method1303() * i + i_3_ - i_5_ + 1));
			if (((Class140) class140).anInt1997 != 0)
				class260.method1736(i_4_, ((Class140) class140).anInt1997, 1 + (i * class198.method1303() + (i_3_ - i_5_)), 8, 10 + i_2_, i_5_);
			int i_6_ = ((Class140) class140).anInt2022;
			int i_7_ = -124 % ((i_1_ - 63) / 61);
			if (((Class246_Sub2) class246_sub2).aBool3802 && ((Class140) class140).anInt1999 != -1)
				i_6_ = ((Class140) class140).anInt1999;
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i ^ 0xffffffff); i_8_++) {
				String string = Class214.aStringArray2986[i_8_];
				if (i_8_ < -1 + i)
					string = string.substring(0, -4 + string.length());
				class198.method1304(class260, string, ((Class246_Sub2) class246_sub2).anInt3810, i_3_, i_6_, true);
				i_3_ += class198.method1303();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uq.A(" + i + ',' + i_1_ + ',' + (class246_sub2 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + (class198 != null ? "{...}" : "null") + ',' + (class140 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1493(int[] is, long[] ls, int i) {
		do {
			try {
				Class218.method1417(0, (byte) 38, -1 + ls.length, is, ls);
				anInt3186++;
				if (i == 29621)
					break;
				aClass_fs3181 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uq.D(" + (is != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method1494(int i, int i_9_) {
		try {
			anInt3187++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_9_, (byte) 118, 6);
			if (i >= 61)
				class246_sub1_sub10.method2604((byte) -102);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uq.C(" + i + ',' + i_9_ + ')');
		}
	}
}
