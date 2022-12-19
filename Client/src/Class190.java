/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class190 {
	static long[] aLongArray2675 = new long[32];
	static int anInt2676;
	static int anInt2677;

	static final void method1244(boolean bool, boolean bool_0_, boolean bool_1_) {
		do {
			try {
				anInt2677++;
				if (bool_0_ != false)
					aLongArray2675 = null;
				if (bool) {
					Class246_Sub18.anInt4681++;
					Class246_Sub1_Sub14.method2711((byte) -24);
				}
				if (!bool_1_)
					break;
				Class24.anInt337++;
				Class59_Sub3_Sub1.method2439((byte) 94);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rm.B(" + bool + ',' + bool_0_ + ',' + bool_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1245(byte i) {
		try {
			if (i != -116)
				aLongArray2675 = null;
			aLongArray2675 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rm.A(" + i + ')');
		}
	}

	static final String method1246(boolean bool, String string) {
		try {
			anInt2676++;
			if (bool != true)
				method1244(false, true, false);
			String string_2_ = Class20.method194(Class246_Sub28_Sub6.method2554(1, string), -81);
			if (string_2_ == null)
				string_2_ = "";
			return string_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rm.C(" + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}
}
