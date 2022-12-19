/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class205 {
	int anInt2882;
	static int anInt2883;
	static IncomingPacket aClass13_2884 = new IncomingPacket(66, 0);
	static Class_l aClass_l2885;
	static int anInt2886;
	static int anInt2887;
	static int anInt2888;
	static int[][] anIntArrayArray2889 = { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	static final void method1340(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, Actor class_r) {
		try {
			Class211.method1386(i_3_, ((Class59_Sub3) class_r).anInt5060, ((Class59_Sub3) class_r).anInt5059, i_2_, i_0_, i, i_4_, 503, ((Class59_Sub3) class_r).aByte5053, i_1_);
			anInt2886++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sp.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class_r != null ? "{...}" : "null") + ')'));
		}
	}

	public final String toString() {
		try {
			anInt2887++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sp.toString(" + ')');
		}
	}

	Class205(String string, int i) {
		try {
			((Class205) this).anInt2882 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sp.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method1341(int i) {
		try {
			anInt2883++;
			if (i == -11712) {
				for (int i_5_ = 0; i_5_ < 100; i_5_++)
					Class246_Sub39.aBoolArray5488[i_5_] = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sp.D(" + i + ')');
		}
	}

	public static void method1342(int i) {
		do {
			try {
				aClass_l2885 = null;
				anIntArrayArray2889 = null;
				aClass13_2884 = null;
				if (i >= 116)
					break;
				aClass_l2885 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sp.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1343(byte i, int i_6_) {
		try {
			anInt2888++;
			if (i <= 123)
				method1342(95);
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_6_, (byte) 123, 8);
			class246_sub1_sub10.method2604((byte) -91);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sp.B(" + i + ',' + i_6_ + ')');
		}
	}
}
