/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
	static int anInt781 = 0;
	static int anInt782;
	static float aFloat783;
	static String[] aStringArray784 = new String[100];
	static int anInt785;
	static String[] aStringArray786;
	static int anInt787;

	public static void method385(byte i) {
		try {
			aStringArray784 = null;
			if (i == -122)
				aStringArray786 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fb.A(" + i + ')');
		}
	}

	static final void method386(int i, int i_0_, int i_1_) {
		try {
			anInt782++;
			int i_2_ = 121 / ((i - 3) / 46);
			do {
				if (Class103.anInt1365 == 1) {
					Class134.method909(i_1_, Class235.f_tc, i_0_, true);
					if (!client.f_ob)
						break;
				}
				if (Class103.anInt1365 == 2)
					Class59_Sub4_Sub2.method2826(-104, i_1_, i_0_);
			} while (false);
			Class103.anInt1365 = 0;
			Class235.f_tc = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fb.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}
}
