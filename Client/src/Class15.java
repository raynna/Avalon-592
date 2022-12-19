/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
	static int anInt229;
	static int anInt230;
	static boolean aBool231 = false;
	static int anInt232;
	static int anInt233;

	static final void method158(int i, int i_0_, int i_1_, Class_fs class_fs, int i_2_, boolean bool) {
		try {
			if (i_2_ != -15727)
				aBool231 = true;
			Class109_Sub2.aBool3818 = bool;
			anInt230++;
			Class12.anInt182 = 1;
			Class108.anInt1534 = i;
			Class22.anInt327 = 10000;
			Class59_Sub5.anInt5400 = i_1_;
			Class7.anInt96 = i_0_;
			Class_m.aClass_fs1545 = class_fs;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bl.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_2_ + ',' + bool + ')'));
		}
	}

	static final void method159(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			int i_8_ = 8 % ((i_4_ - 1) / 63);
			anInt232++;
			int i_9_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i, Class_t.anInt1442);
			int i_10_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_7_, Class_t.anInt1442);
			int i_11_ = Class180.method1176(Class110.anInt1573, -24309, i_6_, Class197.anInt2818);
			int i_12_ = Class180.method1176(Class110.anInt1573, -24309, i_5_, Class197.anInt2818);
			for (int i_13_ = i_9_; (i_10_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff); i_13_++)
				Class135.method918(i_11_, -8, i_3_, i_12_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_13_]));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bl.B(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}
}
