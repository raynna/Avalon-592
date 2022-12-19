/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
	static Class_fs aClass_fs383;
	int anInt384;
	int anInt385;
	int anInt386;
	static HashMap aClass54_387 = new HashMap(8);
	int anInt388 = -1;
	int anInt389;
	static int anInt390;
	int anInt391;
	int anInt392;
	static int anInt393;
	int anInt394;
	static int[] anIntArray395 = new int[2];
	int anInt396;

	static final byte[] method227(byte[] is, int i) {
		try {
			anInt393++;
			if (is == null)
				return null;
			byte[] is_0_ = new byte[is.length];
			Class117.method805(is, 0, is_0_, i, is.length);
			return is_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ck.A(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method228(int i, boolean bool) {
		try {
			anInt390++;
			if (bool != true)
				anIntArray395 = null;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 116, 7);
			class246_sub1_sub10.method2604((byte) -106);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ck.D(" + i + ',' + bool + ')');
		}
	}

	public static void method229(int i) {
		do {
			try {
				aClass_fs383 = null;
				anIntArray395 = null;
				aClass54_387 = null;
				if (i == 14958)
					break;
				method228(87, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ck.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class29() {
		/* empty */
	}

	static final boolean method230(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_1_, int i_2_, boolean[] bools) {
		boolean bool = false;
		if (Class59_Sub3_Sub4.aClass210Array6993 != Class154.aClass210Array2215) {
			int i_3_ = Class246_Sub28_Sub3.aClass210Array5899[i].a(i_1_, i_2_);
			int i_4_ = 0;
			for (/**/; i_4_ <= i; i_4_++) {
				Class210 class210 = Class246_Sub28_Sub3.aClass210Array5899[i_4_];
				if (class210 != null) {
					int i_5_ = i_3_ - class210.a(i_1_, i_2_);
					if (bools != null) {
						bools[i_4_] = class210.method1377(class246_sub1_sub4, i_1_, i_5_, i_2_, 0, false);
						if (!bools[i_4_])
							continue;
					}
					class210.b(class246_sub1_sub4, i_1_, i_5_, i_2_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}
}
