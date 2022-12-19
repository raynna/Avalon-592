/* Class246_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub40 extends Node {
	static int anInt5514;
	static IncomingPacket aClass13_5515 = new IncomingPacket(73, 12);
	static int anInt5516;
	int anInt5517;
	static int anInt5518;
	int anInt5519;
	static boolean[] aBoolArray5520 = new boolean[200];
	static Class_fs index16;
	static Class123 aClass123_5522;

	static final int method2310(Signlink class52, int i, int i_0_) {
		try {
			anInt5516++;
			int i_1_ = -1;
			int i_2_ = -70 % ((-5 - i_0_) / 37);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vj.A(" + (class52 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	public static void method2311(int i) {
		try {
			if (i != 200)
				method2311(-42);
			aClass13_5515 = null;
			index16 = null;
			aClass123_5522 = null;
			aBoolArray5520 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vj.C(" + i + ')');
		}
	}

	static final void method2312(boolean bool) {
		try {
			anInt5518++;
			Class246_Sub28_Sub4.method2537();
			for (int i = 0; i < 4; i++)
				Class95.aClass199Array1235[i].method1324(-81);
			if (bool != false)
				aClass123_5522 = null;
			Class149.method1004(-121);
			Class232.method1484((byte) 92);
			System.gc();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vj.D(" + bool + ')');
		}
	}

	static final boolean method2313(int i, int i_3_) {
		try {
			anInt5514++;
			if (i != 200)
				aBoolArray5520 = null;
			if ((i_3_ ^ 0xffffffff) != (i_3_ & -i_3_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vj.B(" + i + ',' + i_3_ + ')');
		}
	}

	public Class246_Sub40() {
		/* empty */
	}
}
