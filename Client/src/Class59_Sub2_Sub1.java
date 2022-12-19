/* Class59_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub2_Sub1 extends Class59_Sub2 implements Class_f {
	static int anInt5768;
	private boolean aBool5769;
	static int anInt5770;
	static int anInt5771;
	private boolean aBool5772;
	private Class246_Sub1_Sub4 aClass246_Sub1_Sub4_5773;
	private byte aByte5774;
	private byte aByte5775;
	static int anInt5776;
	static int anInt5777;
	static int anInt5778;
	static int anInt5779;
	private byte aByte5780;
	static int anInt5781;
	private boolean aBool5782;
	static int anInt5783;
	static int[] anIntArray5784;
	static int anInt5785;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	private short f_db;
	private Class_t f_eb;
	static int f_fb;
	static int f_gb;

	public final void method20(boolean bool, Class260 class260) {
		do {
			try {
				anInt5778++;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_5773 != null || !aBool5769) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_5773;
					aClass246_Sub1_Sub4_5773 = null;
				} else {
					Class133 class133 = method2449(262144, true, 1590, class260);
					class246_sub1_sub4 = (class133 != null ? ((Class133) class133).aClass246_Sub1_Sub4_1835 : null);
				}
				if (bool == true) {
					if (class246_sub1_sub4 == null)
						break;
					Class246_Sub12.method1980(class246_sub1_sub4, aByte5780, ((Class59_Sub2) this).anInt4563, ((Class59_Sub2) this).anInt4542, null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bh.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final Class133 method2449(int i, boolean bool, int i_0_, Class260 class260) {
		try {
			anInt5776++;
			if (i_0_ != 1590)
				return null;
			Class185 class185 = Class143.aClass251_2067.method1610(f_db & 0xffff, 0);
			Class210 class210;
			Class210 class210_1_;
			if (aBool5782) {
				class210_1_ = Class154.aClass210Array2215[aByte5780];
				class210 = Class246_Sub28_Sub3.aClass210Array5899[0];
			} else {
				if (aByte5780 >= 3)
					class210 = null;
				else
					class210 = (Class246_Sub28_Sub3.aClass210Array5899[1 + aByte5780]);
				class210_1_ = Class246_Sub28_Sub3.aClass210Array5899[aByte5780];
			}
			return class185.method1210(class260, ((Class59_Sub2) this).anInt4563, 3, i, ((Class59_Sub2) this).anInt4552, bool, aByte5774, class210, ((Class59_Sub2) this).anInt4542, aByte5775, class210_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bh.R(" + i + ',' + bool + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method403(Class260 class260, int i) {
		try {
			if (i > 53)
				anInt5779++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_2_) {
		try {
			int i_3_ = -108 / ((i_2_ - 54) / 56);
			f_cb++;
			return method2451(i, class260, (byte) -128);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bh.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
		}
	}

	public final void method9(int i) {
		do {
			try {
				if (f_eb != null)
					f_eb.method677();
				anInt5777++;
				if (i <= -18)
					break;
				method19(null, -83);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bh.I(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int method24(int i) {
		try {
			int i_4_ = 112 % ((i - 39) / 41);
			f_fb++;
			return aByte5775;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.G(" + i + ')');
		}
	}

	static final int method2450(int i, String string) {
		try {
			anInt5768++;
			if (i != -30749)
				anIntArray5784 = null;
			if (string == null)
				return -1;
			for (int i_5_ = 0; (Class246_Sub7.anInt3969 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				if (string.equalsIgnoreCase(Class103.f_gb[i_5_]))
					return i_5_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bh.C(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method19(Class260 class260, int i) {
		do {
			try {
				f_ab++;
				if (i != -12694)
					aBool5772 = true;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_5773 != null || !aBool5769) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_5773;
					aClass246_Sub1_Sub4_5773 = null;
				} else {
					Class133 class133 = method2449(262144, true, 1590, class260);
					class246_sub1_sub4 = (class133 == null ? null : ((Class133) class133).aClass246_Sub1_Sub4_1835);
				}
				if (class246_sub1_sub4 == null)
					break;
				Class29.method230(class246_sub1_sub4, aByte5780, ((Class59_Sub2) this).anInt4563, ((Class59_Sub2) this).anInt4542, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bh.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final int method18(byte i) {
		try {
			anInt5770++;
			if (i != -70)
				method21(false);
			return aByte5774;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.M(" + i + ')');
		}
	}

	Class59_Sub2_Sub1(Class260 class260, Class185 class185, int i, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		super(i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, Class246_Sub28_Sub30.method2832(i_12_, i_13_, (byte) 111));
		do {
			try {
				aByte5774 = (byte) i_13_;
				f_db = (short) ((Class185) class185).anInt2607;
				((Class59_Sub2) this).anInt4542 = i_8_;
				aBool5782 = bool;
				((Class59_Sub2) this).anInt4563 = i_6_;
				aByte5775 = (byte) i_12_;
				aBool5772 = ((Class185) class185).anInt2590 != 0 && !bool;
				aByte5780 = (byte) i;
				aBool5769 = (class260.method1683() && ((Class185) class185).aBool2583 && !aBool5782 && (Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) ^ 0xffffffff) != -1);
				Class133 class133 = method2449(2048, aBool5769, 1590, class260);
				if (class133 == null)
					break;
				f_eb = ((Class133) class133).aClass_t1837;
				aClass246_Sub1_Sub4_5773 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bh.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method409(int i, int i_14_, Class260 class260, int i_15_) {
		try {
			anInt5785++;
			if (i_14_ != 0)
				return true;
			Class_t class_t = method2451(131072, class260, (byte) -125);
			if (class_t != null) {
				Class_c class_c = class260.method1730();
				class_c.j(((Class59_Sub2) this).anInt4563, ((Class59_Sub2) this).anInt4552, ((Class59_Sub2) this).anInt4542);
				return class_t.method685(i_15_, i, class_c, false);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bh.A(" + i + ',' + i_14_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			anInt5771++;
			if (bool != true)
				aClass246_Sub1_Sub4_5773 = null;
			return f_db & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.F(" + bool + ')');
		}
	}

	final int method2023(boolean bool) {
		try {
			anInt5783++;
			if (bool != false)
				method2451(-108, null, (byte) 83);
			if (f_eb != null)
				return f_eb.MA();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.T(" + bool + ')');
		}
	}

	public final boolean method22(int i) {
		try {
			f_bb++;
			if (i != 10869)
				f_db = (short) 12;
			return aBool5769;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.V(" + i + ')');
		}
	}

	private final Class_t method2451(int i, Class260 class260, byte i_16_) {
		try {
			anInt5781++;
			if (f_eb != null && (class260.method1710(f_eb.P(), i) ^ 0xffffffff) == -1)
				return f_eb;
			if (i_16_ >= -29)
				method21(true);
			Class133 class133 = method2449(i, false, 1590, class260);
			if (class133 != null)
				return ((Class133) class133).aClass_t1837;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bh.S(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_16_ + ')'));
		}
	}

	public static void method2452(int i) {
		do {
			try {
				anIntArray5784 = null;
				if (i == 0)
					break;
				anIntArray5784 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bh.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			f_gb++;
			if (f_eb == null)
				return null;
			if (i > -87)
				return null;
			Class_c class_c = class260.method1730();
			class_c.j((((Class59_Sub2) this).anInt4563 + ((Class59_Sub2) this).anInt4540), ((Class59_Sub2) this).anInt4552, (((Class59_Sub2) this).anInt4541 + ((Class59_Sub2) this).anInt4542));
			Class130_Sub3 class130_sub3 = null;
			if (aBool5772)
				class130_sub3 = Class18.method177(1, (byte) -95);
			f_eb.method680(class_c, (class130_sub3 != null ? (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0]) : null), 0);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bh.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
