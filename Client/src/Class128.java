/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class128 {
	static Class166 aClass166_1796 = new Class166();
	static int anInt1797;
	static int anInt1798;
	static int anInt1799;

	static final void method874(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		do {
			try {
				anInt1798++;
				if ((i_4_ ^ 0xffffffff) == (i_6_ ^ 0xffffffff))
					Class106_Sub1.method1892(i_1_, i_4_, i_2_, i_3_, i, i_0_, true);
				else {
					do {
						if ((Class197.anInt2818 ^ 0xffffffff) < (i_1_ - i_4_ ^ 0xffffffff) || i_4_ + i_1_ > Class110.anInt1573 || -i_6_ + i_3_ < Class_t.anInt1442 || Class109_Sub4.anInt4570 < i_6_ + i_3_) {
							Class129.method880(i_1_, i, i_4_, i_2_, i_6_, i_3_, i_0_, (byte) -112);
							if (!client.f_ob)
								break;
						}
						Class133.method894(i_3_, i_6_, i_4_, i, -124, i_0_, i_1_, i_2_);
					} while (false);
					if (i_5_ == 19173)
						break;
					method877((byte) -18, null, -99);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ma.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	public Class128() {
		/* empty */
	}

	public static void method875(int i) {
		try {
			if (i > -48)
				aClass166_1796 = null;
			aClass166_1796 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ma.C(" + i + ')');
		}
	}

	static final long method876(int i, String string) {
		try {
			anInt1799++;
			int i_7_ = string.length();
			long l = (long) i;
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				l = (long) string.charAt(i_8_) + -l + (l << 5);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ma.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final byte[] method877(byte i, byte[] is, int i_9_) {
		try {
			if (i != 106)
				method875(-123);
			anInt1797++;
			byte[] is_10_ = new byte[i_9_];
			Class117.method805(is, 0, is_10_, 0, i_9_);
			return is_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ma.A(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_9_ + ')'));
		}
	}
}
