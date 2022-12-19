/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241 implements Runnable {
	static int anInt3390;
	static int anInt3391;
	static int anInt3392;
	static int anInt3393;
	static int anInt3394;
	static int anInt3395;
	private Class217 aClass217_3396 = new Class217();
	static int anInt3397;
	static Class193 aClass193_3398;
	static int anInt3399;
	static int anInt3400;
	static int anInt3401;
	static int anInt3402;
	private Thread aThread3403;
	static int anInt3404;
	private boolean aBool3405;
	int anInt3406 = 0;
	static byte[] aByteArray3407 = new byte[16384];

	final Class246_Sub1_Sub6_Sub2 method1538(int i, Class208 class208, int i_0_) {
		try {
			anInt3393++;
			Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2 = new Class246_Sub1_Sub6_Sub2();
			((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5964 = false;
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aClass208_7107 = class208;
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).anInt7110 = 3;
			((Class246_Sub1) class246_sub1_sub6_sub2).aLong3739 = (long) i_0_;
			method1541(i, class246_sub1_sub6_sub2);
			return class246_sub1_sub6_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.G(" + i + ',' + (class208 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final Class246_Sub1_Sub6_Sub2 method1539(Class208 class208, int i, int i_1_) {
		try {
			anInt3390++;
			Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2 = new Class246_Sub1_Sub6_Sub2();
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).anInt7110 = 1;
			synchronized (aClass217_3396) {
				for (Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2_2_ = ((Class246_Sub1_Sub6_Sub2) aClass217_3396.method1408((byte) 87)); class246_sub1_sub6_sub2_2_ != null; class246_sub1_sub6_sub2_2_ = ((Class246_Sub1_Sub6_Sub2) aClass217_3396.method1411(true))) {
					if ((((long) i_1_ ^ 0xffffffffffffffffL) == ((((Class246_Sub1) class246_sub1_sub6_sub2_2_).aLong3739) ^ 0xffffffffffffffffL)) && (((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2_2_).aClass208_7107 == class208) && (((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2_2_).anInt7110 ^ 0xffffffff) == -3) {
						((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5960 = false;
						((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108 = ((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2_2_).aByteArray7108;
						return class246_sub1_sub6_sub2;
					}
				}
			}
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108 = class208.method1366(407064624, i_1_);
			((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5964 = true;
			((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5960 = false;
			if (i != -20214)
				aBool3405 = false;
			return class246_sub1_sub6_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.D(" + (class208 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
		}
	}

	final void method1540(int i) {
		try {
			anInt3391++;
			aBool3405 = true;
			synchronized (aClass217_3396) {
				aClass217_3396.notifyAll();
			}
			try {
				aThread3403.join();
				if (i != -1)
					method1543(-66);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread3403 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vl.F(" + i + ')');
		}
	}

	public final void run() {
		try {
			anInt3395++;
			while (!aBool3405) {
				Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2;
				synchronized (aClass217_3396) {
					class246_sub1_sub6_sub2 = ((Class246_Sub1_Sub6_Sub2) aClass217_3396.method1410((byte) 93));
					if (class246_sub1_sub6_sub2 == null) {
						try {
							aClass217_3396.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
					((Class241) this).anInt3406--;
				}
				try {
					if ((((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).anInt7110) != 2) {
						if (((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).anInt7110 == 3)
							((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108 = (((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aClass208_7107.method1366(407064624, (int) (((Class246_Sub1) class246_sub1_sub6_sub2).aLong3739)));
					} else
						((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aClass208_7107.method1367(((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108, false, (int) (((Class246_Sub1) class246_sub1_sub6_sub2).aLong3739), ((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108.length);
				} catch (Exception exception) {
					Class194_Sub1.method1883(exception, null, 82);
				}
				((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5960 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vl.run(" + ')');
		}
	}

	private final void method1541(int i, Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2) {
		try {
			synchronized (aClass217_3396) {
				aClass217_3396.method1407(-122, class246_sub1_sub6_sub2);
				((Class241) this).anInt3406++;
				aClass217_3396.notifyAll();
				if (i != -1)
					run();
			}
			anInt3397++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.H(" + i + ',' + (class246_sub1_sub6_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class246_Sub1_Sub6_Sub2 method1542(int i, int i_3_, byte[] is, Class208 class208) {
		try {
			if (i != 5)
				method1546(75, 35);
			anInt3399++;
			Class246_Sub1_Sub6_Sub2 class246_sub1_sub6_sub2 = new Class246_Sub1_Sub6_Sub2();
			((Class246_Sub1) class246_sub1_sub6_sub2).aLong3739 = (long) i_3_;
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).anInt7110 = 2;
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aByteArray7108 = is;
			((Class246_Sub1_Sub6_Sub2) class246_sub1_sub6_sub2).aClass208_7107 = class208;
			((Class246_Sub1_Sub6) class246_sub1_sub6_sub2).aBool5964 = false;
			method1541(-1, class246_sub1_sub6_sub2);
			return class246_sub1_sub6_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.E(" + i + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + (class208 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1543(int i) {
		try {
			int i_4_ = -123 % ((i + 77) / 44);
			aClass193_3398 = null;
			aByteArray3407 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vl.A(" + i + ')');
		}
	}

	static final boolean method1544(int i, byte i_5_, int i_6_) {
		try {
			if (i_5_ <= 120)
				anInt3400 = 53;
			anInt3401++;
			if ((i_6_ & 0x800 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.I(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method1545(byte i, int i_7_, String string, String string_8_, String string_9_, int i_10_, String string_11_, int i_12_) {
		try {
			anInt3392++;
			for (int i_13_ = 99; (i_13_ ^ 0xffffffff) < -1; i_13_--) {
				Class186.anIntArray2639[i_13_] = Class186.anIntArray2639[-1 + i_13_];
				Class130_Sub1.anIntArray3730[i_13_] = Class130_Sub1.anIntArray3730[i_13_ - 1];
				Class196.aStringArray2750[i_13_] = Class196.aStringArray2750[-1 + i_13_];
				Class246_Sub15.aStringArray4446[i_13_] = Class246_Sub15.aStringArray4446[-1 + i_13_];
				Class246_Sub1_Sub2.aStringArray5688[i_13_] = Class246_Sub1_Sub2.aStringArray5688[i_13_ - 1];
				Class246_Sub41_Sub2.aStringArray6478[i_13_] = Class246_Sub41_Sub2.aStringArray6478[-1 + i_13_];
				Class246_Sub22.anIntArray4773[i_13_] = Class246_Sub22.anIntArray4773[i_13_ - 1];
			}
			Class186.anIntArray2639[0] = i_12_;
			Class196.aStringArray2750[0] = string_11_;
			Class130_Sub1.anIntArray3730[0] = i_10_;
			Class246_Sub15.aStringArray4446[0] = string;
			Class246_Sub1_Sub2.aStringArray5688[0] = string_8_;
			Class224.anInt3092++;
			if (i >= 68) {
				Class246_Sub31.anInt5037 = Class246_Sub34.anInt5146;
				Class246_Sub41_Sub2.aStringArray6478[0] = string_9_;
				Class246_Sub22.anIntArray4773[0] = i_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vl.B(" + i + ',' + i_7_ + ',' + (string != null ? "{...}" : "null") + ',' + (string_8_ != null ? "{...}" : "null") + ',' + (string_9_ != null ? "{...}" : "null") + ',' + i_10_ + ',' + (string_11_ != null ? "{...}" : "null") + ',' + i_12_ + ')'));
		}
	}

	static final void method1546(int i, int i_14_) {
		do {
			try {
				anInt3394++;
				if (Class246_Sub13.method1992(-88, i)) {
					Class235[] class235s = Class246_Sub32.aClass235ArrayArray5049[i];
					for (int i_15_ = 0; ((class235s.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++) {
						Class235 class235 = class235s[i_15_];
						if (class235 != null) {
							((Class235) class235).anInt3221 = 1;
							((Class235) class235).anInt3275 = 0;
							((Class235) class235).anInt3256 = 0;
						}
					}
					if (i_14_ == 2652)
						break;
					aByteArray3407 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vl.J(" + i + ',' + i_14_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1547(int i) {
		try {
			if (i > -47)
				method1544(-70, (byte) 57, -8);
			anInt3402++;
			return Class39.aBool572;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vl.C(" + i + ')');
		}
	}

	Class241(Signlink class52) {
		aBool3405 = false;
		try {
			Class182 class182 = class52.method354(-90, 5, this);
			while ((class182.anInt2539 ^ 0xffffffff) == -1)
				Class247.method1580(10L, -5184);
			if ((class182.anInt2539 ^ 0xffffffff) == -3)
				throw new RuntimeException();
			aThread3403 = (Thread) class182.anObject2535;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vl.<init>(" + (class52 != null ? "{...}" : "null") + ')');
		}
	}
}
