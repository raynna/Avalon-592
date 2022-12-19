
/* Class59_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class59_Sub3_Sub2 extends Class59_Sub3 {
	static int anInt5866;
	static int anInt5867;
	int anInt5868;
	static OutgoingPacket aClass201_5869;
	private int anInt5870;
	private int anInt5871 = -1;
	private Class124 aClass124_5872;
	private int anInt5873;
	private int anInt5874;
	static int anInt5875;
	static int anInt5876;
	static int anInt5877;
	static int[] anIntArray5878;
	static int anInt5879;
	static int anInt5880;
	static Class_fs index22;
	static int anInt5882;
	private int anInt5883;
	private int anInt5884;
	static int[] anIntArray5885;
	boolean aBool5886;
	static int anInt5887;
	static int anInt5888;
	static int anInt5889 = 0;
	static int anInt5890;
	private Class130_Sub2 aClass130_Sub2_5891;
	static int anInt5892;
	static int anInt5893;
	private int f_ab;
	static int f_bb;
	static Color[] f_cb;
	static int f_db;

	private final Class_t method2485(int i, int i_0_, Class260 class260, byte i_1_) {
		try {
			anInt5888++;
			if (i_1_ < 50)
				return null;
			Class144 class144 = Class195.aClass177_2745.method1164(-137, i);
			Class210 class210 = (Class246_Sub28_Sub3.aClass210Array5899[((Class59_Sub3) this).aByte5053]);
			Class210 class210_2_ = (anInt5873 >= 3 ? null : Class246_Sub28_Sub3.aClass210Array5899[1 + anInt5873]);
			if (((Class59_Sub3_Sub2) this).aBool5886)
				return class144.method968(class210_2_, true, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5060, class260, ((Class59_Sub3) this).anInt5059, -1, class210, -1, true, Class59_Sub3_Sub3.aClass45_6275, i_0_, 0);
			return class144.method968(class210_2_, true, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5060, class260, ((Class59_Sub3) this).anInt5059, anInt5884, class210, anInt5871, true, Class59_Sub3_Sub3.aClass45_6275, i_0_, anInt5874);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dd.D(" + i + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	Class59_Sub3_Sub2(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(i_5_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, false, (byte) 0);
		anInt5870 = 0;
		anInt5884 = 0;
		((Class59_Sub3_Sub2) this).aBool5886 = false;
		anInt5874 = 0;
		anInt5883 = -32768;
		do {
			try {
				((Class59_Sub3_Sub2) this).anInt5868 = i_4_ + i_3_;
				f_ab = i;
				anInt5870 = i_14_;
				anInt5873 = i_6_;
				Class144 class144 = Class195.aClass177_2745.method1164(-137, f_ab);
				int i_15_ = ((Class144) class144).anInt2092;
				do {
					if ((i_15_ ^ 0xffffffff) == 0) {
						((Class59_Sub3_Sub2) this).aBool5886 = true;
						if (!client.f_ob)
							break;
					}
					aClass124_5872 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i_15_);
					((Class59_Sub3_Sub2) this).aBool5886 = false;
				} while (false);
				if (((Class59_Sub3_Sub2) this).anInt5868 != i_4_)
					break;
				Class246_Sub1_Sub2.method2424(((Class59_Sub3) this).anInt5060, anInt5884, ((Class59_Sub3) this).aByte5053, ((Class59_Sub3) this).anInt5059, true, aClass124_5872, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dd.<init>(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	protected final void finalize() {
		do {
			try {
				anInt5876++;
				if (aClass130_Sub2_5891 == null)
					break;
				aClass130_Sub2_5891.method1774();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dd.finalize(" + ')');
			}
			break;
		} while (false);
	}

	static final void method2486(int i) {
		do {
			try {
				if (i == 527) {
					if (Class246_Sub40.aClass123_5522 != null)
						Class246_Sub40.aClass123_5522.method840(i ^ 0x203);
					anInt5877++;
					if (Class246_Sub28_Sub26.aClass123_6716 == null)
						break;
					Class246_Sub28_Sub26.aClass123_6716.method840(i ^ 0x203);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dd.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt5879++;
				if (i < 53)
					aClass201_5869 = null;
				Class_t class_t = method2485(f_ab, 0, class260, (byte) 56);
				if (class_t == null)
					break;
				method2490(class_t, class260, -1);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dd.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method2487(int i) {
		try {
			anIntArray5878 = null;
			index22 = null;
			f_cb = null;
			aClass201_5869 = null;
			if (i != -12582)
				method2486(68);
			anIntArray5885 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.I(" + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			anInt5875++;
			if (i < 104)
				anInt5883 = -59;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.E(" + i + ')');
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt5882++;
			if (i >= -87)
				finalize();
			Class_t class_t = method2485(f_ab, ((anInt5870 ^ 0xffffffff) == -1 ? 0 : 5) | 0x800, class260, (byte) 74);
			if (class_t == null)
				return null;
			if (anInt5870 != 0)
				class_t.Q(2048 * anInt5870);
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			do {
				if (aClass130_Sub2_5891 != null) {
					Class129 class129 = aClass130_Sub2_5891.method1779();
					class260.method1703(class_t, class129, class_c, null, 0);
					if (!client.f_ob)
						break;
				}
				class_t.method680(class_c, null, 0);
			} while (false);
			anInt5883 = class_t.MA();
			method2490(class_t, class260, -1);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2488(int i, boolean bool) {
		do {
			try {
				anInt5887++;
				if (!((Class59_Sub3_Sub2) this).aBool5886) {
					anInt5874 += i;
					while ((anInt5874 ^ 0xffffffff) < ((((Class124) aClass124_5872).anIntArray1745[anInt5884]) ^ 0xffffffff)) {
						anInt5874 -= (((Class124) aClass124_5872).anIntArray1745[anInt5884]);
						anInt5884++;
						if (anInt5884 >= (((Class124) aClass124_5872).anIntArray1724).length) {
							((Class59_Sub3_Sub2) this).aBool5886 = true;
							break;
						}
					}
					if (!((Class59_Sub3_Sub2) this).aBool5886)
						Class246_Sub1_Sub2.method2424(((Class59_Sub3) this).anInt5060, anInt5884, ((Class59_Sub3) this).aByte5053, ((Class59_Sub3) this).anInt5059, bool, aClass124_5872, false);
					if (bool == true)
						break;
					method2485(112, -23, null, (byte) -113);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dd.G(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method2489(boolean bool) {
		try {
			if (aClass130_Sub2_5891 != null)
				aClass130_Sub2_5891.method1774();
			if (bool != true)
				f_db = 58;
			anInt5880++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.M(" + bool + ')');
		}
	}

	final void method401(int i) {
		try {
			int i_16_ = -23 % ((57 - i) / 44);
			anInt5890++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.J(" + i + ')');
		}
	}

	final boolean method409(int i, int i_17_, Class260 class260, int i_18_) {
		try {
			anInt5867++;
			if (i_17_ != 0)
				method406((byte) 33);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dd.A(" + i + ',' + i_17_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	final int method2168(int i) {
		try {
			anInt5892++;
			if (i != -25430)
				anInt5873 = 54;
			return anInt5883;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dd.K(" + i + ')');
		}
	}

	final void method405(int i, int i_19_, Class59 class59, byte i_20_, boolean bool, Class260 class260, int i_21_) {
		try {
			if (i_20_ != -99)
				method2168(-42);
			anInt5866++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dd.L(" + i + ',' + i_19_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_20_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_21_ + ')'));
		}
	}

	private final void method2490(Class_t class_t, Class260 class260, int i) {
		do {
			try {
				anInt5893++;
				Class19[] class19s = class_t.method672();
				if (i != -1)
					f_cb = null;
				Class162[] class162s = class_t.method676();
				if ((aClass130_Sub2_5891 == null || ((Class130_Sub2) aClass130_Sub2_5891).aBool3789) && (class19s != null || class162s != null))
					aClass130_Sub2_5891 = new Class130_Sub2(Class246_Sub1_Sub4.anInt5752);
				if (aClass130_Sub2_5891 == null)
					break;
				aClass130_Sub2_5891.method1777(class260, (long) (Class246_Sub1_Sub4.anInt5752), class19s, class162s, false);
				aClass130_Sub2_5891.method1782(((Class59_Sub3) this).aByte5053, ((Class59_Sub3) this).aShort5057, ((Class59_Sub3) this).aShort5065, ((Class59_Sub3) this).aShort5064, ((Class59_Sub3) this).aShort5062);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dd.C(" + (class_t != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static {
		anIntArray5878 = new int[] { 1, 0, -1, 0 };
		aClass201_5869 = new OutgoingPacket(60, 3);
		f_bb = 0;
		f_db = 0;
		f_cb = new Color[] { new Color(9179409), new Color(3289650) };
	}
}
