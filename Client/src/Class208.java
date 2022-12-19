/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class208 {
	private Class125 aClass125_2925;
	private Class125 aClass125_2926 = null;
	static int anInt2927;
	static int anInt2928;
	static int anInt2929;
	static Class205 aClass205_2930 = new Class205("LIVE", 0);
	private int anInt2931;
	static int anInt2932;
	static int anInt2933;
	static Class198 aClass198_2934;
	private int anInt2935;
	static Class67 aClass67_2936 = new Class67("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static int anInt2937 = -1;

	public final String toString() {
		try {
			anInt2929++;
			return "Cache:" + anInt2935;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "st.toString(" + ')');
		}
	}

	public static void method1364(int i) {
		try {
			aClass198_2934 = null;
			if (i == 3) {
				aClass205_2930 = null;
				aClass67_2936 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "st.E(" + i + ')');
		}
	}

	static final char method1365(char c, int i) {
		try {
			anInt2932++;
			if ((c ^ 0xffffffff) == -199)
				return 'E';
			if (c == 230)
				return 'e';
			if (c == 223)
				return 's';
			if (i != 520)
				method1364(16);
			if ((c ^ 0xffffffff) == -339)
				return 'E';
			if ((c ^ 0xffffffff) == -340)
				return 'e';
			return '\0';
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "st.C(" + c + ',' + i + ')');
		}
	}

	final byte[] method1366(int i, int i_0_) {
		try {
			anInt2927++;
			synchronized (aClass125_2925) {
				try {
					if ((aClass125_2926.method853(true) ^ 0xffffffffffffffffL) > ((long) (6 + 6 * i_0_) ^ 0xffffffffffffffffL))
						return null;
					aClass125_2926.method856(0, (long) (6 * i_0_));
					aClass125_2926.method861(6, (byte) 110, Class90.aByteArray1167, 0);
					int i_1_ = ((Class90.aByteArray1167[2] & 0xff) + (((0xff & Class90.aByteArray1167[0]) << 16) - -((Class90.aByteArray1167[1] & 0xff) << 8)));
					int i_2_ = (((Class90.aByteArray1167[3] & 0xff) << 16) + ((Class90.aByteArray1167[4] & 0xff) << 8) - -(0xff & Class90.aByteArray1167[5]));
					if ((i_1_ ^ 0xffffffff) > -1 || (anInt2931 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
						return null;
					if (i_2_ <= 0 || (((long) i_2_ ^ 0xffffffffffffffffL) < (aClass125_2925.method853(true) / 520L ^ 0xffffffffffffffffL)))
						return null;
					byte[] is = new byte[i_1_];
					int i_3_ = 0;
					if (i != 407064624)
						aClass125_2925 = null;
					int i_4_ = 0;
					while ((i_3_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
						if (i_2_ == 0)
							return null;
						aClass125_2925.method856(0, (long) (i_2_ * 520));
						int i_5_ = -i_3_ + i_1_;
						if ((i_5_ ^ 0xffffffff) < -513)
							i_5_ = 512;
						aClass125_2925.method861(8 + i_5_, (byte) 110, Class90.aByteArray1167, 0);
						int i_6_ = ((Class90.aByteArray1167[0] << 8 & 0xff00) - -(0xff & Class90.aByteArray1167[1]));
						int i_7_ = ((Class90.aByteArray1167[3] & 0xff) + (Class90.aByteArray1167[2] << 8 & 0xff00));
						int i_8_ = ((Class90.aByteArray1167[5] << 8 & 0xff00) + ((0xff & Class90.aByteArray1167[4]) << 16) + (Class90.aByteArray1167[6] & 0xff));
						int i_9_ = 0xff & Class90.aByteArray1167[7];
						if (i_0_ != i_6_ || (i_4_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff) || (anInt2935 ^ 0xffffffff) != (i_9_ ^ 0xffffffff))
							return null;
						if ((i_8_ ^ 0xffffffff) > -1 || ((long) i_8_ > aClass125_2925.method853(true) / 520L))
							return null;
						for (int i_10_ = 0; i_5_ > i_10_; i_10_++)
							is[i_3_++] = Class90.aByteArray1167[8 + i_10_];
						i_4_++;
						i_2_ = i_8_;
					}
					return is;
				} catch (java.io.IOException ioexception) {
					return null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "st.D(" + i + ',' + i_0_ + ')');
		}
	}

	final boolean method1367(byte[] is, boolean bool, int i, int i_11_) {
		try {
			if (bool != false)
				anInt2935 = 118;
			anInt2933++;
			synchronized (aClass125_2925) {
				if ((i_11_ ^ 0xffffffff) > -1 || anInt2931 < i_11_)
					throw new IllegalArgumentException();
				boolean bool_12_ = method1368(i, 255, is, i_11_, true);
				if (!bool_12_)
					bool_12_ = method1368(i, 255, is, i_11_, false);
				return bool_12_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("st.B(" + (is != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_11_ + ')'));
		}
	}

	private final boolean method1368(int i, int i_13_, byte[] is, int i_14_, boolean bool) {
		try {
			anInt2928++;
			synchronized (aClass125_2925) {
				try {
					int i_15_;
					if (bool) {
						if ((long) (6 + 6 * i) > aClass125_2926.method853(true))
							return false;
						aClass125_2926.method856(0, (long) (i * 6));
						aClass125_2926.method861(6, (byte) 110, Class90.aByteArray1167, 0);
						i_15_ = ((Class90.aByteArray1167[4] << 8 & 0xff00) + ((0xff0000 & Class90.aByteArray1167[3] << 16) + (0xff & Class90.aByteArray1167[5])));
						if ((i_15_ ^ 0xffffffff) >= -1 || (aClass125_2925.method853(true) / 520L < (long) i_15_))
							return false;
					} else {
						i_15_ = (int) ((519L + aClass125_2925.method853(true)) / 520L);
						if (i_15_ == 0)
							i_15_ = 1;
					}
					Class90.aByteArray1167[3] = (byte) (i_15_ >> 16);
					Class90.aByteArray1167[5] = (byte) i_15_;
					if (i_13_ != 255)
						anInt2935 = 2;
					Class90.aByteArray1167[2] = (byte) i_14_;
					Class90.aByteArray1167[0] = (byte) (i_14_ >> 16);
					Class90.aByteArray1167[4] = (byte) (i_15_ >> 8);
					Class90.aByteArray1167[1] = (byte) (i_14_ >> 8);
					aClass125_2926.method856(0, (long) (6 * i));
					aClass125_2926.method854(0, (byte) 126, Class90.aByteArray1167, 6);
					int i_16_ = 0;
					int i_17_ = 0;
					while ((i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
						int i_18_ = 0;
						if (bool) {
							aClass125_2925.method856(0, (long) (520 * i_15_));
							try {
								aClass125_2925.method861(8, (byte) 110, (Class90.aByteArray1167), 0);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							int i_19_ = ((Class90.aByteArray1167[1] & 0xff) + ((Class90.aByteArray1167[0] & 0xff) << 8));
							i_18_ = ((0xff0000 & Class90.aByteArray1167[4] << 16) - -((0xff & Class90.aByteArray1167[5]) << 8) - -(Class90.aByteArray1167[6] & 0xff));
							int i_20_ = (((Class90.aByteArray1167[2] & 0xff) << 8) + (Class90.aByteArray1167[3] & 0xff));
							int i_21_ = Class90.aByteArray1167[7] & 0xff;
							if ((i ^ 0xffffffff) != (i_19_ ^ 0xffffffff) || i_20_ != i_17_ || (anInt2935 ^ 0xffffffff) != (i_21_ ^ 0xffffffff))
								return false;
							if ((i_18_ ^ 0xffffffff) > -1 || (((long) i_18_ ^ 0xffffffffffffffffL) < (aClass125_2925.method853(true) / 520L ^ 0xffffffffffffffffL)))
								return false;
						}
						if ((i_18_ ^ 0xffffffff) == -1) {
							bool = false;
							i_18_ = (int) ((519L + aClass125_2925.method853(true)) / 520L);
							if (i_18_ == 0)
								i_18_++;
							if (i_15_ == i_18_)
								i_18_++;
						}
						Class90.aByteArray1167[1] = (byte) i;
						Class90.aByteArray1167[2] = (byte) (i_17_ >> 8);
						Class90.aByteArray1167[0] = (byte) (i >> 8);
						Class90.aByteArray1167[3] = (byte) i_17_;
						if (-i_16_ + i_14_ <= 512)
							i_18_ = 0;
						Class90.aByteArray1167[7] = (byte) anInt2935;
						Class90.aByteArray1167[5] = (byte) (i_18_ >> 8);
						Class90.aByteArray1167[4] = (byte) (i_18_ >> 16);
						Class90.aByteArray1167[6] = (byte) i_18_;
						aClass125_2925.method856(0, (long) (i_15_ * 520));
						aClass125_2925.method854(0, (byte) 126, Class90.aByteArray1167, 8);
						int i_22_ = i_14_ - i_16_;
						if ((i_22_ ^ 0xffffffff) < -513)
							i_22_ = 512;
						aClass125_2925.method854(i_16_, (byte) 127, is, i_22_);
						i_17_++;
						i_16_ += i_22_;
						i_15_ = i_18_;
					}
					return true;
				} catch (java.io.IOException ioexception) {
					return false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("st.A(" + i + ',' + i_13_ + ',' + (is != null ? "{...}" : "null") + ',' + i_14_ + ',' + bool + ')'));
		}
	}

	Class208(int i, Class125 class125, Class125 class125_23_, int i_24_) {
		aClass125_2925 = null;
		anInt2931 = 65000;
		try {
			aClass125_2926 = class125_23_;
			aClass125_2925 = class125;
			anInt2935 = i;
			anInt2931 = i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("st.<init>(" + i + ',' + (class125 != null ? "{...}" : "null") + ',' + (class125_23_ != null ? "{...}" : "null") + ',' + i_24_ + ')'));
		}
	}
}
