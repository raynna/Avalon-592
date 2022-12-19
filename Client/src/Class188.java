/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class188 {
	static int anInt2655;
	static int anInt2656;
	static int anInt2657;
	static int anInt2658;
	static int anInt2659;
	static int anInt2660;
	static int anInt2661;
	static int anInt2662;

	abstract boolean method1228(boolean bool);

	abstract long method1229(int i);

	public Class188() {
		/* empty */
	}

	static final void method1230(byte i) {
		try {
			anInt2660++;
			if (!Class105.aBool1468) {
				if (i < 82)
					anInt2658 = -73;
				Class37.method257(Class115.aClass147ArrayArrayArray1605, -75);
				if (Class1.aClass147ArrayArrayArray4 != null)
					Class37.method257(Class1.aClass147ArrayArrayArray4, -110);
				Class105.aBool1468 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ri.J(" + i + ')');
		}
	}

	static final void method1231(byte i) {
		try {
			anInt2655++;
			if (i <= 51)
				anInt2658 = 97;
			if (Class260_Sub2.aClass205_4297 != Class155.aClass205_2228) {
				try {
					Class80.method521(CS2Script.aclient5668, "tbrefresh", 122);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ri.K(" + i + ')');
		}
	}

	abstract int method1232(int i);

	abstract int method1233(byte i);

	static final void method1234(int[][] is, byte i) {
		try {
			anInt2659++;
			if (i == 85)
				Class246_Sub28_Sub6.anIntArrayArray6042 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ri.H(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final String method1235(boolean bool, long l, int i, int i_0_, int i_1_) {
		try {
			anInt2661++;
			char c = ',';
			char c_2_ = '.';
			if ((i_1_ ^ 0xffffffff) == -1) {
				c = '.';
				c_2_ = ',';
			}
			int i_3_ = -90 % ((i_0_ + 34) / 62);
			if (i_1_ == 2)
				c_2_ = '\u00a0';
			boolean bool_4_ = false;
			if ((l ^ 0xffffffffffffffffL) > -1L) {
				bool_4_ = true;
				l = -l;
			}
			StringBuffer stringbuffer = new StringBuffer(26);
			if (i > 0) {
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff); i_5_++) {
					int i_6_ = (int) l;
					l /= 10L;
					stringbuffer.append((char) (i_6_ + (48 - 10 * (int) l)));
				}
				stringbuffer.append(c);
			}
			int i_7_ = 0;
			for (;;) {
				int i_8_ = (int) l;
				l /= 10L;
				stringbuffer.append((char) (-(10 * (int) l) + (i_8_ + 48)));
				if ((l ^ 0xffffffffffffffffL) == -1L)
					break;
				if (bool && (++i_7_ % 3 ^ 0xffffffff) == -1)
					stringbuffer.append(c_2_);
			}
			if (bool_4_)
				stringbuffer.append('-');
			return stringbuffer.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ri.G(" + bool + ',' + l + ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	abstract char method1236(int i);

	static final void method1237(int i, int i_9_) {
		try {
			anInt2656++;
			if (i <= 94)
				anInt2662 = 48;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_9_, (byte) 119, 9);
			class246_sub1_sub10.method2604((byte) -60);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ri.I(" + i + ',' + i_9_ + ')');
		}
	}

	static {
		new Class67("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
		anInt2657 = -1;
		anInt2658 = -1;
	}
}
