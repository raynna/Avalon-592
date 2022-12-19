/* Class_g - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_g extends Class59_Sub3 {
	static int anInt6482 = 0;
	private double aDouble6483;
	static int anInt6484;
	private int anInt6485;
	static int anInt6486;
	static int anInt6487;
	private Class130_Sub2 aClass130_Sub2_6488;
	private boolean aBool6489 = false;
	private int anInt6490 = -1;
	private int anInt6491;
	int anInt6492;
	static int anInt6493;
	private double aDouble6494;
	private double aDouble6495;
	static int anInt6496;
	private boolean aBool6497;
	private double aDouble6498;
	static int anInt6499;
	private double aDouble6500;
	static int anInt6501;
	int anInt6502;
	int anInt6503;
	static int anInt6504;
	private int anInt6505;
	static int anInt6506;
	private Class124 aClass124_6507;
	private int anInt6508;
	private int anInt6509;
	private double aDouble6510;
	private int f_ab;
	static int f_bb;
	static int f_cb;
	private double f_db;
	private int f_eb;
	static int f_fb;
	private int f_gb;
	int f_hb;
	static int f_ib = 0;
	private double f_jb;
	static int f_kb;
	static int f_lb;
	private int f_mb;

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6487++;
			Class_t class_t = method2685(2048, class260, -126);
			if (class_t == null)
				return null;
			Class_c class_c = class260.method1730();
			class_c.N(anInt6491);
			class_c.ja(anInt6509);
			class_c.o((int) aDouble6483, (int) aDouble6495, (int) aDouble6510);
			do {
				if (aClass130_Sub2_6488 == null) {
					class_t.method680(class_c, null, 0);
					if (!client.f_ob)
						break;
				}
				Class129 class129 = aClass130_Sub2_6488.method1779();
				class260.method1703(class_t, class129, class_c, null, 0);
			} while (false);
			f_gb = class_t.MA();
			method2684(0, class_t, class260);
			if (i >= -87)
				aDouble6500 = -1.8573298928985096;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			anInt6501++;
			if (i < 104)
				method407(null, 112);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.E(" + i + ')');
		}
	}

	final void method2683(byte i) {
		do {
			try {
				anInt6506++;
				if (aClass130_Sub2_6488 != null)
					aClass130_Sub2_6488.method1774();
				if (i <= -93)
					break;
				method407(null, -123);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "g.T(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method403(Class260 class260, int i) {
		try {
			anInt6484++;
			Class_t class_t = method2685(0, class260, -127);
			if (class_t != null) {
				Class_c class_c = class260.method1730();
				class_c.N(anInt6491);
				if (i <= 53)
					anInt6491 = 58;
				class_c.ja(anInt6509);
				class_c.o((int) aDouble6483, (int) aDouble6495, (int) aDouble6510);
				f_gb = class_t.MA();
				method2684(0, class_t, class260);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	protected final void finalize() {
		try {
			if (aClass130_Sub2_6488 != null)
				aClass130_Sub2_6488.method1774();
			anInt6486++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.finalize(" + ')');
		}
	}

	final void method2172(int i) {
		try {
			if (i != 11264)
				method406((byte) 69);
			((Class59_Sub3) this).aShort5057 = ((Class59_Sub3) this).aShort5065 = (short) (int) (aDouble6483 / 128.0);
			((Class59_Sub3) this).aShort5064 = ((Class59_Sub3) this).aShort5062 = (short) (int) (aDouble6510 / 128.0);
			anInt6493++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.S(" + i + ')');
		}
	}

	private final void method2684(int i, Class_t class_t, Class260 class260) {
		do {
			try {
				anInt6496++;
				if (i != 0)
					method2683((byte) 127);
				Class19[] class19s = class_t.method672();
				Class162[] class162s = class_t.method676();
				if ((aClass130_Sub2_6488 == null || ((Class130_Sub2) aClass130_Sub2_6488).aBool3789) && (class19s != null || class162s != null))
					aClass130_Sub2_6488 = new Class130_Sub2(Class246_Sub1_Sub4.anInt5752);
				if (aClass130_Sub2_6488 == null)
					break;
				aClass130_Sub2_6488.method1777(class260, (long) (Class246_Sub1_Sub4.anInt5752), class19s, class162s, false);
				aClass130_Sub2_6488.method1782(((Class59_Sub3) this).aByte5053, ((Class59_Sub3) this).aShort5057, ((Class59_Sub3) this).aShort5065, ((Class59_Sub3) this).aShort5064, ((Class59_Sub3) this).aShort5062);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("g.V(" + i + ',' + (class_t != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final Class_t method2685(int i, Class260 class260, int i_0_) {
		try {
			anInt6504++;
			if (i_0_ > -125)
				method401(-41);
			Class144 class144 = Class195.aClass177_2745.method1164(-137, anInt6508);
			return class144.method965(anInt6485, f_eb, Class59_Sub3_Sub3.aClass45_6275, (byte) -117, anInt6490, i, class260);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("g.R(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final boolean method409(int i, int i_1_, Class260 class260, int i_2_) {
		try {
			f_lb++;
			if (i_1_ != 0)
				method2686(-123, 118, -11, 15, -46);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("g.A(" + i + ',' + i_1_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	final void method405(int i, int i_3_, Class59 class59, byte i_4_, boolean bool, Class260 class260, int i_5_) {
		try {
			f_kb++;
			if (i_4_ != -99)
				aBool6497 = true;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("g.L(" + i + ',' + i_3_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	final void method2686(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			anInt6499++;
			do {
				if (!aBool6489) {
					double d = (double) (-((Class59_Sub3) this).anInt5060 + i_6_);
					double d_10_ = (double) (-((Class59_Sub3) this).anInt5059 + i_8_);
					double d_11_ = Math.sqrt(d * d + d_10_ * d_10_);
					aDouble6510 = (d_10_ * (double) f_ab / d_11_ + (double) ((Class59_Sub3) this).anInt5059);
					aDouble6483 = (d * (double) f_ab / d_11_ + (double) ((Class59_Sub3) this).anInt5060);
					if (!aBool6497) {
						aDouble6495 = (double) ((Class59_Sub3) this).anInt5052;
						if (!client.f_ob)
							break;
					}
					aDouble6495 = (double) (Class6.getAverageHeight((int) aDouble6483, -43, (((Class59_Sub3) this).aByte5053), (int) aDouble6510) - f_mb);
				}
			} while (false);
			double d = (double) (((Class_g) this).anInt6492 - (-1 + i));
			aDouble6498 = (-aDouble6483 + (double) i_6_) / d;
			if (i_9_ < 1)
				method2686(-49, -105, 54, -34, 124);
			f_db = (-aDouble6510 + (double) i_8_) / d;
			aDouble6500 = Math.sqrt(f_db * f_db + aDouble6498 * aDouble6498);
			if ((anInt6505 ^ 0xffffffff) == 0)
				f_jb = (-aDouble6495 + (double) i_7_) / d;
			else {
				if (!aBool6489)
					f_jb = (-aDouble6500 * Math.tan((double) anInt6505 * 0.02454369));
				aDouble6494 = ((double) i_7_ - aDouble6495 - d * f_jb) * 2.0 / (d * d);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("g.W(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method401(int i) {
		try {
			f_cb++;
			int i_12_ = -88 / ((57 - i) / 44);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.J(" + i + ')');
		}
	}

	final void method2687(byte i, int i_13_) {
		do {
			try {
				aDouble6510 += (double) i_13_ * f_db;
				aBool6489 = true;
				f_bb++;
				aDouble6483 += aDouble6498 * (double) i_13_;
				int i_14_ = -73 / ((31 - i) / 63);
				if (aBool6497)
					aDouble6495 = (double) (Class6.getAverageHeight((int) aDouble6483, -106, (((Class59_Sub3) this).aByte5053), (int) aDouble6510) + -f_mb);
				else if ((anInt6505 ^ 0xffffffff) != 0) {
					aDouble6495 += ((double) i_13_ * ((double) i_13_ * (aDouble6494 * 0.5)) + f_jb * (double) i_13_);
					f_jb += aDouble6494 * (double) i_13_;
				} else
					aDouble6495 += f_jb * (double) i_13_;
				anInt6509 = 0x3fff & 8192 + (int) (2607.5945876176133 * Math.atan2(aDouble6498, f_db));
				anInt6491 = (int) (2607.5945876176133 * Math.atan2(f_jb, aDouble6500)) & 0x3fff;
				if (aClass124_6507 == null)
					break;
				f_eb += i_13_;
				while ((((Class124) aClass124_6507).anIntArray1745[anInt6485] ^ 0xffffffff) > (f_eb ^ 0xffffffff)) {
					f_eb -= (((Class124) aClass124_6507).anIntArray1745[anInt6485]);
					anInt6485++;
					if ((anInt6485 ^ 0xffffffff) <= (((Class124) aClass124_6507).anIntArray1724.length ^ 0xffffffff)) {
						anInt6485 -= ((Class124) aClass124_6507).anInt1731;
						if ((anInt6485 ^ 0xffffffff) > -1 || ((((Class124) aClass124_6507).anIntArray1724).length ^ 0xffffffff) >= (anInt6485 ^ 0xffffffff))
							anInt6485 = 0;
					}
					anInt6490 = 1 + anInt6485;
					if (anInt6490 >= ((Class124) aClass124_6507).anIntArray1724.length) {
						anInt6490 -= ((Class124) aClass124_6507).anInt1731;
						if (anInt6490 < 0 || anInt6490 >= (((Class124) aClass124_6507).anIntArray1724).length)
							anInt6490 = -1;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "g.U(" + i + ',' + i_13_ + ')');
			}
			break;
		} while (false);
	}

	Class_g(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool) {
		super(i_15_, i_16_, Class6.getAverageHeight(i_16_, -103, i_15_, i_17_) + -i_18_, i_17_, i_16_ >> 7, i_16_ >> 7, i_17_ >> 7, i_17_ >> 7, false, (byte) 0);
		anInt6485 = 0;
		f_gb = -32768;
		f_eb = 0;
		try {
			((Class_g) this).anInt6492 = i_20_;
			f_mb = i_18_;
			aBool6489 = false;
			aBool6497 = bool;
			anInt6505 = i_21_;
			((Class_g) this).anInt6503 = i_23_;
			anInt6508 = i;
			f_ab = i_22_;
			((Class_g) this).f_hb = i_19_;
			((Class_g) this).anInt6502 = i_24_;
			int i_25_ = (((Class144) Class195.aClass177_2745.method1164(-137, anInt6508)).anInt2092);
			if (i_25_ != -1)
				aClass124_6507 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i_25_);
			else
				aClass124_6507 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("g.<init>(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + bool + ')'));
		}
	}

	final int method2168(int i) {
		try {
			if (i != -25430)
				return -89;
			f_fb++;
			return f_gb;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "g.K(" + i + ')');
		}
	}
}
