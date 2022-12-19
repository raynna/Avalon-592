/* Class59_Sub3_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub3_Sub4 extends Class59_Sub3 implements Class_f {
	static int anInt6971;
	static int anInt6972;
	Class_t aClass_t6973;
	private byte aByte6974;
	static int anInt6975;
	private boolean aBool6976;
	static int anInt6977;
	static int anInt6978;
	private boolean aBool6979;
	static int anInt6980;
	static int anInt6981;
	static int anInt6982;
	static int anInt6983;
	static int anInt6984;
	private byte aByte6985;
	static int anInt6986;
	static int anInt6987;
	private boolean aBool6988;
	private boolean aBool6989;
	static int anInt6990;
	static int anInt6991;
	private byte aByte6992;
	static Class210[] aClass210Array6993;
	private Class246_Sub1_Sub4 aClass246_Sub1_Sub4_6994;
	static int anInt6995;
	static int anInt6996;
	static int anInt6997;
	private short aShort6998;
	static int anInt6999;
	static int anInt7000;
	static Class_fs index27;
	static int f_bb;
	static int f_cb;

	public final Class_t method23(Class260 class260, int i, int i_0_) {
		try {
			int i_1_ = -4 / ((i_0_ - 54) / 56);
			anInt6987++;
			return method2865(class260, 1, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	static final void method2863(int i, Class_fs class_fs, byte i_2_, int i_3_, boolean bool, int i_4_, int i_5_) {
		do {
			try {
				Class108.anInt1534 = i;
				if (i_2_ == -89) {
					Class12.anInt182 = 1;
					anInt6978++;
					Class59_Sub5.anInt5400 = i_4_;
					Class7.anInt96 = i_5_;
					Class_m.aClass_fs1545 = class_fs;
					Class109_Sub2.aBool3818 = bool;
					Class22.anInt327 = (Class32.aClass246_Sub37_Sub1_433.method2512(0) / i_3_);
					if (Class22.anInt327 >= 1)
						break;
					Class22.anInt327 = 1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.CA(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final void method401(int i) {
		do {
			try {
				aBool6988 = false;
				int i_6_ = 108 / ((57 - i) / 44);
				anInt6999++;
				if (((Class59_Sub3_Sub4) this).aClass_t6973 == null)
					break;
				((Class59_Sub3_Sub4) this).aClass_t6973.UA(((Class59_Sub3_Sub4) this).aClass_t6973.P() & ~0x10000);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vb.J(" + i + ')');
			}
			break;
		} while (false);
	}

	public final boolean method22(int i) {
		try {
			f_cb++;
			if (i != 10869)
				aByte6985 = (byte) -44;
			return aBool6989;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.V(" + i + ')');
		}
	}

	Class59_Sub3_Sub4(Class260 class260, Class185 class185, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool_17_) {
		super(i, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, ((Class185) class185).anInt2598 == 1, Class65.method427(true, i_16_, i_15_));
		do {
			try {
				aBool6979 = ((((Class185) class185).anInt2590 ^ 0xffffffff) != -1 && !bool);
				aByte6974 = (byte) i_16_;
				aByte6985 = (byte) i_7_;
				aShort6998 = (short) ((Class185) class185).anInt2607;
				aBool6988 = bool_17_;
				aBool6976 = bool;
				aByte6992 = (byte) i_15_;
				aBool6989 = (class260.method1683() && ((Class185) class185).aBool2583 && !aBool6976 && (Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) ^ 0xffffffff) != -1);
				int i_18_ = 2048;
				if (aBool6988)
					i_18_ |= 0x10000;
				Class133 class133 = method2869((byte) 10, i_18_, class260, aBool6989);
				if (class133 == null)
					break;
				((Class59_Sub3_Sub4) this).aClass_t6973 = ((Class133) class133).aClass_t1837;
				aClass246_Sub1_Sub4_6994 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
				if (!aBool6988)
					break;
				((Class59_Sub3_Sub4) this).aClass_t6973 = ((Class59_Sub3_Sub4) this).aClass_t6973.method678((byte) 0, i_18_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + bool_17_ + ')'));
			}
			break;
		} while (false);
	}

	static final int[] method2864(int i, boolean bool, int i_19_, int i_20_, int i_21_, float f, int i_22_, int i_23_) {
		try {
			anInt6977++;
			if (i_20_ > -15)
				index27 = null;
			int[] is = new int[i_22_];
			Class246_Sub28_Sub9 class246_sub28_sub9 = new Class246_Sub28_Sub9();
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6149 = i_21_;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6151 = i_19_;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6136 = i_23_;
			((Class246_Sub28_Sub9) class246_sub28_sub9).aBool6150 = bool;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6137 = i;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6144 = (int) (4096.0F * f);
			class246_sub28_sub9.method2134(false);
			Class155.method1028(1, 9188, i_22_);
			class246_sub28_sub9.method2573(is, (byte) 116, 0);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.R(" + i + ',' + bool + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + f + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method405(int i, int i_24_, Class59 class59, byte i_25_, boolean bool, Class260 class260, int i_26_) {
		do {
			try {
				anInt6990++;
				if (i_25_ == -99) {
					if (class59 instanceof Class59_Sub4_Sub2) {
						Class59_Sub4_Sub2 class59_sub4_sub2 = (Class59_Sub4_Sub2) class59;
						if (((Class59_Sub3_Sub4) this).aClass_t6973 != null && (((Class59_Sub4_Sub2) class59_sub4_sub2).aClass_t6834) != null)
							((Class59_Sub3_Sub4) this).aClass_t6973.method682((((Class59_Sub4_Sub2) class59_sub4_sub2).aClass_t6834), i_24_, i_26_, i, bool);
					} else {
						if (!(class59 instanceof Class59_Sub3_Sub4))
							break;
						Class59_Sub3_Sub4 class59_sub3_sub4_27_ = (Class59_Sub3_Sub4) class59;
						if (((Class59_Sub3_Sub4) this).aClass_t6973 == null || (((Class59_Sub3_Sub4) class59_sub3_sub4_27_).aClass_t6973) == null)
							break;
						((Class59_Sub3_Sub4) this).aClass_t6973.method682((((Class59_Sub3_Sub4) class59_sub3_sub4_27_).aClass_t6973), i_24_, i_26_, i, bool);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.L(" + i + ',' + i_24_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_25_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2168(int i) {
		try {
			if (i != -25430)
				method9(-12);
			anInt6981++;
			if (((Class59_Sub3_Sub4) this).aClass_t6973 == null)
				return 0;
			return ((Class59_Sub3_Sub4) this).aClass_t6973.MA();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.K(" + i + ')');
		}
	}

	final boolean method409(int i, int i_28_, Class260 class260, int i_29_) {
		try {
			anInt6984++;
			Class_t class_t = method2865(class260, 1, 131072);
			if (i_28_ != 0)
				aShort6998 = (short) -96;
			if (class_t != null) {
				Class_c class_c = class260.method1730();
				class_c.j(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
				return class_t.method685(i_29_, i, class_c, false);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.A(" + i + ',' + i_28_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_29_ + ')'));
		}
	}

	public final void method9(int i) {
		try {
			if (((Class59_Sub3_Sub4) this).aClass_t6973 != null)
				((Class59_Sub3_Sub4) this).aClass_t6973.method677();
			if (i < -18)
				anInt6980++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.I(" + i + ')');
		}
	}

	private final Class_t method2865(Class260 class260, int i, int i_30_) {
		try {
			anInt7000++;
			if (((Class59_Sub3_Sub4) this).aClass_t6973 != null && (class260.method1710(((Class59_Sub3_Sub4) this).aClass_t6973.P(), i_30_) ^ 0xffffffff) == -1)
				return ((Class59_Sub3_Sub4) this).aClass_t6973;
			Class133 class133 = method2869((byte) 10, i_30_, class260, false);
			if (i != 1)
				aBool6979 = false;
			if (class133 == null)
				return null;
			return ((Class133) class133).aClass_t1837;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_30_ + ')'));
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6996++;
			if (((Class59_Sub3_Sub4) this).aClass_t6973 == null)
				return null;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			Class130_Sub3 class130_sub3 = null;
			if (aBool6979)
				class130_sub3 = Class18.method177(1, (byte) -95);
			((Class59_Sub3_Sub4) this).aClass_t6973.method680(class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
			if (i > -87)
				aBool6988 = true;
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt6991++;
				if (i >= 53)
					break;
				index27 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int method2866(int i) {
		try {
			if (i != 20922)
				return -29;
			anInt6975++;
			if (((Class59_Sub3_Sub4) this).aClass_t6973 == null)
				return 15;
			return ((Class59_Sub3_Sub4) this).aClass_t6973.U() / 4;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.BA(" + i + ')');
		}
	}

	public final int method18(byte i) {
		try {
			if (i != -70)
				index27 = null;
			anInt6982++;
			return aByte6974;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.M(" + i + ')');
		}
	}

	public final int method24(int i) {
		try {
			anInt6997++;
			int i_31_ = -85 / ((i - 39) / 41);
			return aByte6992;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.G(" + i + ')');
		}
	}

	public final void method19(Class260 class260, int i) {
		do {
			try {
				anInt6986++;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6994 != null || !aBool6989) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6994;
					aClass246_Sub1_Sub4_6994 = null;
				} else {
					Class133 class133 = method2869((byte) 10, 262144, class260, true);
					class246_sub1_sub4 = (class133 != null ? ((Class133) class133).aClass246_Sub1_Sub4_1835 : null);
				}
				if (class246_sub1_sub4 != null)
					Class29.method230(class246_sub1_sub4, aByte6985, ((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5059, null);
				if (i == -12694)
					break;
				method9(62);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method406(byte i) {
		try {
			if (i <= 104)
				return false;
			anInt6983++;
			return aBool6988;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.E(" + i + ')');
		}
	}

	static final int method2867(String string, int i, BufferStream stream) {
		try {
			f_bb++;
			int i_32_ = ((BufferStream) stream).position;
			byte[] is = Class153.method1014(string, i ^ 0x4620);
			stream.method2406((byte) -8, is.length);
			((BufferStream) stream).position += (Class246_Sub19_Sub2.aClass99_6812.method625(is, ((BufferStream) stream).position, (byte) 40, i, ((BufferStream) stream).buffer, is.length));
			return -i_32_ + ((BufferStream) stream).position;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.AA(" + (string != null ? "{...}" : "null") + ',' + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		do {
			try {
				anInt6995++;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6994 != null || !aBool6989) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6994;
					aClass246_Sub1_Sub4_6994 = null;
				} else {
					Class133 class133 = method2869((byte) 10, 262144, class260, true);
					class246_sub1_sub4 = (class133 == null ? null : ((Class133) class133).aClass246_Sub1_Sub4_1835);
				}
				if (class246_sub1_sub4 != null)
					Class246_Sub12.method1980(class246_sub1_sub4, aByte6985, ((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5059, null);
				if (bool == true)
					break;
				method2868(-128);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vb.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2868(int i) {
		try {
			if (i < -73) {
				index27 = null;
				aClass210Array6993 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.T(" + i + ')');
		}
	}

	private final Class133 method2869(byte i, int i_33_, Class260 class260, boolean bool) {
		try {
			anInt6972++;
			if (i != 10)
				return null;
			Class185 class185 = Class143.aClass251_2067.method1610(aShort6998 & 0xffff, 0);
			Class210 class210;
			Class210 class210_34_;
			if (!aBool6976) {
				if ((aByte6985 ^ 0xffffffff) <= -4)
					class210 = null;
				else
					class210 = (Class246_Sub28_Sub3.aClass210Array5899[1 + aByte6985]);
				class210_34_ = Class246_Sub28_Sub3.aClass210Array5899[aByte6985];
			} else {
				class210 = Class246_Sub28_Sub3.aClass210Array5899[0];
				class210_34_ = Class154.aClass210Array2215[aByte6985];
			}
			return class185.method1210(class260, ((Class59_Sub3) this).anInt5060, i - 7, i_33_, ((Class59_Sub3) this).anInt5052, bool, ((aByte6992 ^ 0xffffffff) != -12 ? (int) aByte6974 : aByte6974 + 4), class210, ((Class59_Sub3) this).anInt5059, ((aByte6992 ^ 0xffffffff) != -12 ? aByte6992 : 10), class210_34_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vb.DA(" + i + ',' + i_33_ + ',' + (class260 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				method20(true, null);
			anInt6971++;
			return 0xffff & aShort6998;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vb.F(" + bool + ')');
		}
	}
}
