/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class64 {
	static int[] anIntArray858 = new int[4096];
	static int anInt859;
	static int anInt860;
	static int anInt861 = 0;

	abstract void method422(int i, float f, int i_0_, int i_1_, float f_2_, int i_3_, float f_4_, float f_5_, int i_6_, int i_7_, float[] fs);

	public static void method423(boolean bool) {
		do {
			try {
				anIntArray858 = null;
				if (bool == false)
					break;
				anInt861 = 55;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ge.C(" + bool + ')');
			}
			break;
		} while (false);
	}

	public Class64() {
		/* empty */
	}

	static final String method424(String string, byte i) {
		try {
			anInt860++;
			if (string == null)
				return null;
			if (i >= -41)
				anIntArray858 = null;
			int i_8_ = 0;
			int i_9_;
			for (i_9_ = string.length(); (i_9_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
				if (!Class127.method870(string.charAt(i_8_), 101))
					break;
			}
			for (/**/; (i_9_ > i_8_ && Class127.method870(string.charAt(i_9_ - 1), 46)); i_9_--) {
				/* empty */
			}
			int i_10_ = i_9_ + -i_8_;
			if ((i_10_ ^ 0xffffffff) > -2 || (i_10_ ^ 0xffffffff) < -13)
				return null;
			StringBuffer stringbuffer = new StringBuffer(i_10_);
			for (int i_11_ = i_8_; i_11_ < i_9_; i_11_++) {
				char c = string.charAt(i_11_);
				if (Class112.method771(c, false)) {
					char c_12_ = Class246_Sub1_Sub9.method2587(234, c);
					if ((c_12_ ^ 0xffffffff) != -1)
						stringbuffer.append(c_12_);
				}
			}
			if ((stringbuffer.length() ^ 0xffffffff) == -1)
				return null;
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ge.A(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		anInt859 = 0;
	}
}
