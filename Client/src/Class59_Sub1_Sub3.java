/* Class59_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub1_Sub3 extends Class59_Sub1 implements Class_f {
	static int anInt6328;
	static int anInt6329;
	static int anInt6330;
	static int anInt6331;
	static int anInt6332;
	static int anInt6333;
	static int anInt6334;
	private byte aByte6335;
	private boolean aBool6336;
	static int anInt6337;
	static int anInt6338;
	private boolean aBool6339;
	static int anInt6340;
	private Class246_Sub1_Sub4 aClass246_Sub1_Sub4_6341;
	static int anInt6342;
	static int anInt6343;
	private byte aByte6344;
	static int anInt6345;
	private boolean aBool6346;
	static byte[][] aByteArrayArray6347;
	private short aShort6348;
	static int anInt6349;
	private boolean aBool6350;
	static int anInt6351;
	static int anInt6352;
	static int anInt6353;
	static int anInt6354;
	private Class_t aClass_t6355;

	static final boolean method2640(int i, int i_0_, boolean bool) {
		try {
			anInt6353++;
			if (bool != true)
				method2644((byte) -99);
			if ((0x580 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jp.K(" + i + ',' + i_0_ + ',' + bool + ')'));
		}
	}

	private final Class_t method2641(Class260 class260, boolean bool, int i) {
		try {
			anInt6333++;
			if (aClass_t6355 != null && class260.method1710(aClass_t6355.P(), i) == 0)
				return aClass_t6355;
			if (bool != true)
				return null;
			Class133 class133 = method2643(i, false, -1, class260);
			if (class133 != null)
				return ((Class133) class133).aClass_t1837;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jp.R(" + (class260 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	static final boolean method2642(Class205 class205, byte i) {
		try {
			anInt6338++;
			if (i >= -26)
				return true;
			if (client.f_fb != class205 && class205 != Class130_Sub4.aClass205_4740 && class205 != Class238.aClass205_3351 && class205 != Class124.aClass205_1735)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.T(" + (class205 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final int method18(byte i) {
		try {
			anInt6340++;
			if (i != -70)
				aClass246_Sub1_Sub4_6341 = null;
			return aByte6344;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.M(" + i + ')');
		}
	}

	private final Class133 method2643(int i, boolean bool, int i_1_, Class260 class260) {
		try {
			anInt6342++;
			if (i_1_ != -1)
				aBool6336 = true;
			Class185 class185 = Class143.aClass251_2067.method1610(0xffff & aShort6348, 0);
			Class210 class210;
			Class210 class210_2_;
			if (!aBool6350) {
				if (aByte6335 < 3)
					class210 = (Class246_Sub28_Sub3.aClass210Array5899[aByte6335 + 1]);
				else
					class210 = null;
				class210_2_ = Class246_Sub28_Sub3.aClass210Array5899[aByte6335];
			} else {
				class210 = Class246_Sub28_Sub3.aClass210Array5899[0];
				class210_2_ = Class154.aClass210Array2215[aByte6335];
			}
			return class185.method1210(class260, ((Class59_Sub1) this).anInt4515, 3, i, ((Class59_Sub1) this).anInt4518, bool, aByte6344, class210, ((Class59_Sub1) this).anInt4517, 22, class210_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jp.S(" + i + ',' + bool + ',' + i_1_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method405(int i, int i_3_, Class59 class59, byte i_4_, boolean bool, Class260 class260, int i_5_) {
		do {
			try {
				anInt6330++;
				if (i_4_ != -99)
					method2642(null, (byte) -50);
				if (!(class59 instanceof Class59_Sub1_Sub3))
					break;
				Class59_Sub1_Sub3 class59_sub1_sub3_6_ = (Class59_Sub1_Sub3) class59;
				if (aClass_t6355 == null || class59_sub1_sub3_6_.aClass_t6355 == null)
					break;
				aClass_t6355.method682(class59_sub1_sub3_6_.aClass_t6355, i_3_, i_5_, i, bool);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jp.L(" + i + ',' + i_3_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt6334++;
				if (i >= 53)
					break;
				aByte6344 = (byte) 21;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jp.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final Class_t method23(Class260 class260, int i, int i_7_) {
		try {
			anInt6349++;
			int i_8_ = 38 / ((i_7_ - 54) / 56);
			return method2641(class260, true, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jp.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ')'));
		}
	}

	public final void method9(int i) {
		do {
			try {
				anInt6329++;
				if (i > -18)
					method21(true);
				if (aClass_t6355 == null)
					break;
				aClass_t6355.method677();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jp.I(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method19(Class260 class260, int i) {
		do {
			try {
				anInt6354++;
				Object object = null;
				if (i != -12694)
					aBool6339 = true;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6341 != null || !aBool6346) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6341;
					aClass246_Sub1_Sub4_6341 = null;
				} else {
					Class133 class133 = method2643(262144, true, i + 12693, class260);
					class246_sub1_sub4 = (class133 == null ? null : ((Class133) class133).aClass246_Sub1_Sub4_1835);
				}
				if (class246_sub1_sub4 == null)
					break;
				Class29.method230(class246_sub1_sub4, aByte6335, ((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4517, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jp.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final boolean method22(int i) {
		try {
			if (i != 10869)
				method2641(null, true, 43);
			anInt6332++;
			return aBool6346;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.V(" + i + ')');
		}
	}

	public final int method21(boolean bool) {
		try {
			anInt6328++;
			if (bool != true)
				aBool6336 = true;
			return 0xffff & aShort6348;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.F(" + bool + ')');
		}
	}

	Class59_Sub1_Sub3(Class260 class260, Class185 class185, int i, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_, boolean bool_13_) {
		super(i_9_, i_10_, i_11_, ((Class185) class185).aBool2584, ((Class185) class185).aBool2601);
		do {
			try {
				aBool6336 = bool_13_;
				aShort6348 = (short) ((Class185) class185).anInt2607;
				aByte6344 = (byte) i_12_;
				aBool6339 = ((Class185) class185).anInt2590 != 0 && !bool;
				aByte6335 = (byte) i;
				aBool6350 = bool;
				((Class59_Sub1) this).anInt4515 = i_9_;
				((Class59_Sub1) this).anInt4517 = i_11_;
				aBool6346 = (class260.method1683() && ((Class185) class185).aBool2583 && !aBool6350 && (Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) ^ 0xffffffff) != -1);
				int i_14_ = 2048;
				if (aBool6336)
					i_14_ |= 0x10000;
				Class133 class133 = method2643(i_14_, aBool6346, -1, class260);
				if (class133 == null)
					break;
				aClass_t6355 = ((Class133) class133).aClass_t1837;
				aClass246_Sub1_Sub4_6341 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
				if (!aBool6336)
					break;
				aClass_t6355 = aClass_t6355.method678((byte) 0, i_14_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jp.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + bool + ',' + i_12_ + ',' + bool_13_ + ')'));
			}
			break;
		} while (false);
	}

	final void method401(int i) {
		do {
			try {
				anInt6352++;
				aBool6336 = false;
				int i_15_ = -99 % ((i - 57) / 44);
				if (aClass_t6355 == null)
					break;
				aClass_t6355.UA(aClass_t6355.P() & ~0x10000);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jp.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method409(int i, int i_16_, Class260 class260, int i_17_) {
		try {
			anInt6331++;
			if (i_16_ != 0)
				method22(-27);
			Class_t class_t = method2641(class260, true, 131072);
			if (class_t != null) {
				Class_c class_c = class260.method1730();
				class_c.j(((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4518, ((Class59_Sub1) this).anInt4517);
				return class_t.method685(i_17_, i, class_c, false);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jp.A(" + i + ',' + i_16_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	public final int method24(int i) {
		try {
			anInt6337++;
			int i_18_ = -110 / ((i - 39) / 41);
			return 22;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.G(" + i + ')');
		}
	}

	public static void method2644(byte i) {
		do {
			try {
				aByteArrayArray6347 = null;
				if (i < -78)
					break;
				aByteArrayArray6347 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jp.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6345++;
			if (aClass_t6355 == null)
				return null;
			if (i > -87)
				method22(-9);
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4518, ((Class59_Sub1) this).anInt4517);
			Class130_Sub3 class130_sub3 = null;
			if (aBool6339)
				class130_sub3 = Class18.method177(1, (byte) -95);
			aClass_t6355.method680(class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			anInt6351++;
			if (i < 104)
				return true;
			return aBool6336;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jp.E(" + i + ')');
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		do {
			try {
				anInt6343++;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6341 != null || !aBool6346) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6341;
					aClass246_Sub1_Sub4_6341 = null;
				} else {
					Class133 class133 = method2643(262144, true, -1, class260);
					class246_sub1_sub4 = (class133 == null ? null : ((Class133) class133).aClass246_Sub1_Sub4_1835);
				}
				if (class246_sub1_sub4 != null)
					Class246_Sub12.method1980(class246_sub1_sub4, aByte6335, ((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4517, null);
				if (bool == true)
					break;
				aBool6350 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jp.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		new Class67(null, "geschickt werden.", null, null);
	}
}
