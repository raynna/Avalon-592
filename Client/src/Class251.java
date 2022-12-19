
/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class251 {
	static int anInt3536;
	static int anInt3537;
	static int anInt3538;
	boolean aBool3539;
	static int anInt3540;
	static int anInt3541;
	static int anInt3542;
	static int anInt3543;
	static int anInt3544;
	static int anInt3545;
	static String[] aStringArray3546;
	boolean aBool3547 = false;
	static int anInt3548;
	private HashMap aClass54_3549 = new HashMap(64);
	Class_fs aClass_fs3550;
	static Class85 aClass85_3551;
	static int[] anIntArray3552 = new int[250];
	private Class_fs aClass_fs3553;
	HashMap aClass54_3554 = new HashMap(500);
	static int[][] anIntArrayArray3555 = { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
	static boolean[][] aBoolArrayArray3556;
	HashMap aClass54_3557 = new HashMap(30);
	HashMap aClass54_3558 = new HashMap(50);
	int anInt3559;

	final void method1605(byte i) {
		try {
			anInt3544++;
			synchronized (aClass54_3549) {
				if (i != -24)
					method1608(25, true);
				aClass54_3549.method369(false);
			}
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method369(false);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method369(false);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.I(" + i + ')');
		}
	}

	final void method1606(int i, int i_0_) {
		try {
			synchronized (aClass54_3549) {
				aClass54_3549.method380(i, -50);
			}
			anInt3538++;
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method380(i, -50);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method380(i, i_0_ - 56);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method380(i, -50);
				if (i_0_ != 6)
					method1605((byte) 34);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.D(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1607(byte i) {
		try {
			anInt3548++;
			synchronized (aClass54_3549) {
				aClass54_3549.method383(82);
			}
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method383(102);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method383(90);
				int i_1_ = 59 % ((i - 12) / 54);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method383(87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.A(" + i + ')');
		}
	}

	final void method1608(int i, boolean bool) {
		try {
			anInt3536++;
			((Class251) this).anInt3559 = i;
			synchronized (((Class251) this).aClass54_3554) {
				((Class251) this).aClass54_3554.method369(bool);
			}
			synchronized (((Class251) this).aClass54_3557) {
				((Class251) this).aClass54_3557.method369(bool);
			}
			synchronized (((Class251) this).aClass54_3558) {
				((Class251) this).aClass54_3558.method369(bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.K(" + i + ',' + bool + ')');
		}
	}

	public static void method1609(boolean bool) {
		try {
			anIntArray3552 = null;
			if (bool != false)
				aClass85_3551 = null;
			aClass85_3551 = null;
			anIntArrayArray3555 = null;
			aBoolArrayArray3556 = null;
			aStringArray3546 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.E(" + bool + ')');
		}
	}

	final Class185 method1610(int i, int i_2_) {
		try {
			anInt3537++;
			if (i_2_ != 0)
				aBoolArrayArray3556 = null;
			Class185 class185;
			synchronized (aClass54_3549) {
				class185 = (Class185) aClass54_3549.method379((long) i, (byte) 58);
			}
			if (class185 != null)
				return class185;
			byte[] is = aClass_fs3553.method91(Class12.method138(i, (byte) -98), Class166.method1106(i, false), 89);
			class185 = new Class185();
			((Class185) class185).aClass251_2610 = this;
			((Class185) class185).anInt2607 = i;
			if (is != null)
				class185.method1217(new BufferStream(is), 95);
			class185.method1202((byte) -73);
			if (!((Class251) this).aBool3539 && ((Class185) class185).aBool2618) {
				((Class185) class185).aStringArray2595 = null;
				((Class185) class185).f_nb = null;
			}
			if (((Class185) class185).aBool2577) {
				((Class185) class185).anInt2634 = 0;
				((Class185) class185).aBool2620 = false;
			}
			synchronized (aClass54_3549) {
				aClass54_3549.method371(1, (long) i, class185);
			}
			return class185;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.F(" + i + ',' + i_2_ + ')');
		}
	}

	static final void method1611(int i, boolean bool, int i_3_) {
		try {
			if (i_3_ != 0) {
				if (bool) {
					Class246_Sub15.aClass260_4445 = Class260.method1682((Class246_Sub37_Sub1.anInterface6_5910), 0, Class147.aCanvas2155, 0, (byte) 90, Class108.aClass52_1535);
					Class246_Sub15.aClass260_4445.p(0);
					Class73 class73 = Class129.method878(6, 0, Class36.f_ib, Class111.index13);
					Class116 class116 = (Class246_Sub15.aClass260_4445.method1716(class73, Class10.method129(Class210_Sub2.index8, Class36.f_ib, 0), true));
					Class_w.method2650(true, Class250.aClass67_3531.method436(true, Class_j.anInt1485), class116, 13);
					Class246_Sub15.aClass260_4445.method1688();
					Class246_Sub28_Sub30.method2834((byte) 118);
					Class246_Sub15.aClass260_4445.method1708(true);
				}
				try {
					Class246_Sub15.aClass260_4445 = Class260.method1682((Class246_Sub37_Sub1.anInterface6_5910), (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt588 * 2), Class147.aCanvas2155, i_3_, (byte) -30, Class108.aClass52_1535);
					if (Class246_Sub15.aClass260_4445.method1741()) {
						boolean bool_4_ = true;
						try {
							bool_4_ = (jagmisc.getTotalPhysicalMemory() > 268435456L);
						} catch (Throwable throwable) {
							/* empty */
						}
						Class_u class_u;
						if (bool_4_)
							class_u = Class246_Sub15.aClass260_4445.method1725(146800640);
						else
							class_u = Class246_Sub15.aClass260_4445.method1725(104857600);
						Class246_Sub15.aClass260_4445.method1685(class_u);
					}
				} catch (Throwable throwable) {
					Class246_Sub15.aClass260_4445 = Class260.method1682((Class246_Sub37_Sub1.anInterface6_5910), 0, Class147.aCanvas2155, 0, (byte) 109, Class108.aClass52_1535);
					i_3_ = 0;
				}
			} else
				Class246_Sub15.aClass260_4445 = Class260.method1682((Class246_Sub37_Sub1.anInterface6_5910), 2 * ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt588, Class147.aCanvas2155, i_3_, (byte) 62, Class108.aClass52_1535);
			anInt3540++;
			if (i != -27345)
				anIntArrayArray3555 = null;
			BufferStream.anInt5656 = i_3_;
			Class106_Sub1.method1890((byte) 3);
			if (!Class246_Sub15.aClass260_4445.method1705())
				Class246_Sub1_Sub13.anInt6562 = 1;
			Class246_Sub15.aClass260_4445.method1724(Class246_Sub1_Sub13.anInt6562);
			Class246_Sub15.aClass260_4445.method1714(0);
			Class246_Sub15.aClass260_4445.MA(8);
			Class130_Sub3.aClass_c4413 = Class246_Sub15.aClass260_4445.method1715();
			Class134.aClass_c1879 = Class246_Sub15.aClass260_4445.method1715();
			Class246_Sub19.method2070(17569);
			Class246_Sub15.aClass260_4445.method1678(!((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool586);
			if (Class246_Sub15.aClass260_4445.method1693())
				Class196.method1280(-14734, (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool596));
			Class136.method925(Class152.anInt2205 >> 3, Class246_Sub15.aClass260_4445, Class38_Sub1_Sub1.anInt6770 >> 3, 92);
			Class118.method815((byte) -36);
			RuntimeException_Sub2.aBool7148 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wf.H(" + i + ',' + bool + ',' + i_3_ + ')'));
		}
	}

	final void method1612(byte i, boolean bool) {
		do {
			try {
				anInt3541++;
				if (!bool == ((Class251) this).aBool3547) {
					((Class251) this).aBool3547 = bool;
					method1605((byte) -24);
					if (i == 114)
						break;
					anIntArrayArray3555 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wf.B(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method1613(int i, int i_5_, Class260 class260, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte[][][] is) {
		try {
			anInt3542++;
			if ((i_13_ ^ 0xffffffff) != -1 && i_5_ != 0) {
				if (i_6_ != 6)
					method1613(-11, -30, null, 82, -115, 83, -89, -83, -21, 111, 95, -96, null);
				if (i_13_ == 9) {
					i = i + 1 & 0x3;
					i_13_ = 1;
				}
				if ((i_13_ ^ 0xffffffff) == -11) {
					i = i + 3 & 0x3;
					i_13_ = 1;
				}
				if (i_13_ == 11) {
					i_13_ = 8;
					i = 3 + i & 0x3;
				}
				class260.DA(i_11_, i_12_, i_8_, i_9_, i_7_, i_14_, is[-1 + i_13_][i], i_5_, i_10_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wf.J(" + i + ',' + i_5_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1614(boolean bool, byte i) {
		try {
			anInt3545++;
			if (i > 119 && !bool == ((Class251) this).aBool3539) {
				((Class251) this).aBool3539 = bool;
				method1605((byte) -24);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.G(" + bool + ',' + i + ')');
		}
	}

	final void method1615(int i, int i_15_) {
		try {
			anInt3543++;
			if (i != -27578)
				((Class251) this).aBool3539 = true;
			aClass54_3549 = new HashMap(i_15_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wf.C(" + i + ',' + i_15_ + ')');
		}
	}

	Class251(Class101 class101, int i, boolean bool, Class_fs class_fs, Class_fs class_fs_16_) {
		do {
			try {
				aClass_fs3553 = class_fs;
				((Class251) this).aBool3539 = bool;
				((Class251) this).aClass_fs3550 = class_fs_16_;
				if (aClass_fs3553 == null)
					break;
				int i_17_ = aClass_fs3553.method87((byte) 39) - 1;
				aClass_fs3553.method95(i_17_, 28724);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wf.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_16_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass85_3551 = new Class85(64);
	}
}
