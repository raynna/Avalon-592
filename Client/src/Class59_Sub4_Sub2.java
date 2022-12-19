/* Class59_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub4_Sub2 extends Class59_Sub4 implements Class_f {
	private boolean aBool6821;
	private byte aByte6822;
	static int anInt6823;
	static int anInt6824;
	private byte aByte6825;
	private boolean aBool6826;
	static int anInt6827;
	static int anInt6828;
	static int anInt6829;
	static int anInt6830;
	static int anInt6831;
	static int[] anIntArray6832;
	static int anInt6833;
	Class_t aClass_t6834;
	static int anInt6835;
	static int anInt6836;
	static int anInt6837;
	private boolean aBool6838;
	static int anInt6839;
	static int anInt6840;
	static int anInt6841;
	private short aShort6842;
	static int anInt6843;
	static boolean aBool6844 = false;
	static float aFloat6845;
	private Class246_Sub1_Sub4 aClass246_Sub1_Sub4_6846;
	static int anInt6847;
	static int anInt6848;
	static int anInt6849;
	private boolean aBool6850;
	static int anInt6851;
	private byte aByte6852;
	static int anInt6853;

	public final void method19(Class260 class260, int i) {
		do {
			try {
				anInt6827++;
				if (i != -12694)
					method18((byte) 34);
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6846 != null || !aBool6838) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6846;
					aClass246_Sub1_Sub4_6846 = null;
				} else {
					Class133 class133 = method2821(i + 12585, 262144, class260, true);
					class246_sub1_sub4 = (class133 != null ? ((Class133) class133).aClass246_Sub1_Sub4_1835 : null);
				}
				if (class246_sub1_sub4 == null)
					break;
				Class29.method230(class246_sub1_sub4, aByte6852, ((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5186, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rj.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final Class133 method2821(int i, int i_0_, Class260 class260, boolean bool) {
		try {
			anInt6836++;
			Class185 class185 = Class143.aClass251_2067.method1610(0xffff & aShort6842, 0);
			if (i > -103)
				aShort6842 = (short) -58;
			Class210 class210;
			Class210 class210_1_;
			if (!aBool6826) {
				if ((aByte6852 ^ 0xffffffff) <= -4)
					class210 = null;
				else
					class210 = (Class246_Sub28_Sub3.aClass210Array5899[aByte6852 + 1]);
				class210_1_ = Class246_Sub28_Sub3.aClass210Array5899[aByte6852];
			} else {
				class210 = Class246_Sub28_Sub3.aClass210Array5899[0];
				class210_1_ = Class154.aClass210Array2215[aByte6852];
			}
			return class185.method1210(class260, ((Class59_Sub4) this).anInt5184, 3, i_0_, ((Class59_Sub4) this).anInt5188, bool, aByte6822, class210, ((Class59_Sub4) this).anInt5186, aByte6825, class210_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.C(" + i + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final boolean method406(byte i) {
		try {
			if (i < 104)
				return false;
			anInt6848++;
			return aBool6821;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.E(" + i + ')');
		}
	}

	public static void method2822(int i) {
		try {
			if (i != 65535)
				aFloat6845 = -1.1378508F;
			anIntArray6832 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.S(" + i + ')');
		}
	}

	static final void method2823(byte i, Class255_Sub1 class255_sub1, byte[][] is) {
		try {
			if (i > -2)
				method2826(-81, -50, 16);
			anInt6831++;
			int i_2_ = Class211_Sub1.aByteArrayArray5353.length;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_3_++) {
				byte[] is_4_ = is[i_3_];
				if (is_4_ != null) {
					int i_5_ = (64 * (Class168.anIntArray2398[i_3_] >> 8) - Class39_Sub1.anInt4670);
					int i_6_ = (-Class47.anInt686 + 64 * (0xff & Class168.anIntArray2398[i_3_]));
					Class85.method545((byte) -109);
					class255_sub1.method2338(Class95.aClass199Array1235, i_6_, is_4_, i_5_, 1, Class246_Sub15.aClass260_4445);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.R(" + i + ',' + (class255_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method18(byte i) {
		try {
			if (i != -70)
				aByte6822 = (byte) -93;
			anInt6837++;
			return aByte6822;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.M(" + i + ')');
		}
	}

	final void method403(Class260 class260, int i) {
		try {
			if (i < 53)
				method2825((byte) 43, -75, null);
			anInt6853++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_7_) {
		try {
			int i_8_ = -112 % ((i_7_ - 54) / 56);
			anInt6833++;
			return method2825((byte) 32, i, class260);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ')'));
		}
	}

	final void method401(int i) {
		try {
			anInt6824++;
			aBool6821 = false;
			if (((Class59_Sub4_Sub2) this).aClass_t6834 != null)
				((Class59_Sub4_Sub2) this).aClass_t6834.UA(~0x10000 & ((Class59_Sub4_Sub2) this).aClass_t6834.P());
			int i_9_ = -2 % ((i - 57) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.J(" + i + ')');
		}
	}

	final void method405(int i, int i_10_, Class59 class59, byte i_11_, boolean bool, Class260 class260, int i_12_) {
		try {
			do {
				if (class59 instanceof Class59_Sub4_Sub2) {
					Class59_Sub4_Sub2 class59_sub4_sub2_13_ = (Class59_Sub4_Sub2) class59;
					if (((Class59_Sub4_Sub2) this).aClass_t6834 == null || (((Class59_Sub4_Sub2) class59_sub4_sub2_13_).aClass_t6834) == null)
						break;
					((Class59_Sub4_Sub2) this).aClass_t6834.method682((((Class59_Sub4_Sub2) class59_sub4_sub2_13_).aClass_t6834), i_10_, i_12_, i, bool);
					if (!client.f_ob)
						break;
				}
				if (class59 instanceof Class59_Sub3_Sub4) {
					Class59_Sub3_Sub4 class59_sub3_sub4 = (Class59_Sub3_Sub4) class59;
					if (((Class59_Sub4_Sub2) this).aClass_t6834 != null && (((Class59_Sub3_Sub4) class59_sub3_sub4).aClass_t6973) != null)
						((Class59_Sub4_Sub2) this).aClass_t6834.method682((((Class59_Sub3_Sub4) class59_sub3_sub4).aClass_t6973), i_10_, i_12_, i, bool);
				}
			} while (false);
			if (i_11_ != -99)
				method2821(79, -28, null, true);
			anInt6849++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.L(" + i + ',' + i_10_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_11_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_12_ + ')'));
		}
	}

	Class59_Sub4_Sub2(Class260 class260, Class185 class185, int i, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_, int i_18_, boolean bool_19_) {
		super(i_14_, i_15_, i_16_, Class246_Sub1_Sub15.method2717(i_17_, i_18_, 31654));
		do {
			try {
				aShort6842 = (short) ((Class185) class185).anInt2607;
				((Class59_Sub4) this).anInt5184 = i_14_;
				aBool6850 = ((Class185) class185).anInt2590 != 0 && !bool;
				aByte6852 = (byte) i;
				aBool6821 = bool_19_;
				aByte6822 = (byte) i_18_;
				((Class59_Sub4) this).anInt5186 = i_16_;
				aBool6826 = bool;
				aByte6825 = (byte) i_17_;
				aBool6838 = (class260.method1683() && ((Class185) class185).aBool2583 && !aBool6826 && Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) != 0);
				int i_20_ = 2048;
				if (aBool6821)
					i_20_ |= 0x10000;
				Class133 class133 = method2821(-104, i_20_, class260, aBool6838);
				if (class133 == null)
					break;
				aClass246_Sub1_Sub4_6846 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
				((Class59_Sub4_Sub2) this).aClass_t6834 = ((Class133) class133).aClass_t1837;
				if (!aBool6821)
					break;
				((Class59_Sub4_Sub2) this).aClass_t6834 = ((Class59_Sub4_Sub2) this).aClass_t6834.method678((byte) 0, i_20_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rj.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + bool + ',' + i_17_ + ',' + i_18_ + ',' + bool_19_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method2824(int i, int i_21_, int i_22_) {
		try {
			int i_23_ = 77 % ((i_21_ - 80) / 43);
			anInt6840++;
			if (!((i_22_ & 0x70000 ^ 0xffffffff) != -1 | Class46.method310((byte) 101, i_22_, i)) && !Class147.method996(i, -1, i_22_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.T(" + i + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				method406((byte) 1);
			anInt6841++;
			return aShort6842 & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.F(" + bool + ')');
		}
	}

	private final Class_t method2825(byte i, int i_24_, Class260 class260) {
		try {
			anInt6847++;
			if (((Class59_Sub4_Sub2) this).aClass_t6834 != null && (class260.method1710(((Class59_Sub4_Sub2) this).aClass_t6834.P(), i_24_) ^ 0xffffffff) == -1)
				return ((Class59_Sub4_Sub2) this).aClass_t6834;
			if (i != 32)
				return null;
			Class133 class133 = method2821(i - 143, i_24_, class260, false);
			if (class133 == null)
				return null;
			return ((Class133) class133).aClass_t1837;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.AA(" + i + ',' + i_24_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6823++;
			if (((Class59_Sub4_Sub2) this).aClass_t6834 == null)
				return null;
			Class_c class_c = class260.method1730();
			if (i > -87)
				return null;
			class_c.j(((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5188, ((Class59_Sub4) this).anInt5186);
			Class130_Sub3 class130_sub3 = null;
			if (aBool6850)
				class130_sub3 = Class18.method177(1, (byte) -95);
			((Class59_Sub4_Sub2) this).aClass_t6834.method680(class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final int method24(int i) {
		try {
			int i_25_ = -108 % ((39 - i) / 41);
			anInt6839++;
			return aByte6825;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.G(" + i + ')');
		}
	}

	public final void method9(int i) {
		do {
			try {
				anInt6828++;
				if (((Class59_Sub4_Sub2) this).aClass_t6834 != null)
					((Class59_Sub4_Sub2) this).aClass_t6834.method677();
				if (i <= -18)
					break;
				method2826(-95, 42, 22);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rj.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method409(int i, int i_26_, Class260 class260, int i_27_) {
		try {
			if (i_26_ != 0)
				aBool6844 = true;
			anInt6835++;
			Class_t class_t = method2825((byte) 32, 131072, class260);
			if (class_t != null) {
				Class_c class_c = class260.method1730();
				class_c.j(((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5188, ((Class59_Sub4) this).anInt5186);
				return class_t.method685(i_27_, i, class_c, false);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.A(" + i + ',' + i_26_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_27_ + ')'));
		}
	}

	public final boolean method22(int i) {
		try {
			anInt6843++;
			if (i != 10869)
				method407(null, -97);
			return aBool6838;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rj.V(" + i + ')');
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		do {
			try {
				anInt6851++;
				Object object = null;
				Class246_Sub1_Sub4 class246_sub1_sub4;
				if (aClass246_Sub1_Sub4_6846 != null || !aBool6838) {
					class246_sub1_sub4 = aClass246_Sub1_Sub4_6846;
					aClass246_Sub1_Sub4_6846 = null;
				} else {
					Class133 class133 = method2821(-122, 262144, class260, true);
					class246_sub1_sub4 = (class133 == null ? null : ((Class133) class133).aClass246_Sub1_Sub4_1835);
				}
				if (class246_sub1_sub4 != null)
					Class246_Sub12.method1980(class246_sub1_sub4, aByte6852, ((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5186, null);
				if (bool == true)
					break;
				((Class59_Sub4_Sub2) this).aClass_t6834 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rj.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2826(int i, int i_28_, int i_29_) {
		try {
			anInt6829++;
			int i_30_ = (Class_fs.aClass73_148.method459(-1, Class219.aClass67_3039.method436(true, Class_j.anInt1485)));
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(119)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
				int i_31_ = Class112.method770(class246_sub35, 3);
				if ((i_30_ ^ 0xffffffff) > (i_31_ ^ 0xffffffff))
					i_30_ = i_31_;
			}
			i_30_ += 8;
			int i_32_ = 21 + 16 * Class230.anInt3147;
			int i_33_ = -(i_30_ / 2) + i_29_;
			if (Class246_Sub41_Sub1.anInt6171 < i_30_ + i_33_)
				i_33_ = -i_30_ + Class246_Sub41_Sub1.anInt6171;
			if ((i_33_ ^ 0xffffffff) > -1)
				i_33_ = 0;
			int i_34_ = i_28_;
			if ((Class162.anInt2300 ^ 0xffffffff) > (i_34_ + i_32_ ^ 0xffffffff))
				i_34_ = Class162.anInt2300 + -i_32_;
			IntegerNode.anInt5082 = i_33_;
			if (i_34_ < 0)
				i_34_ = 0;
			if (i >= -53)
				method2824(49, -22, -7);
			Class246_Sub28_Sub21.aBool6580 = true;
			Class93.anInt1226 = i_34_;
			Class94.anInt1233 = i_30_;
			Class246_Sub13.anInt4419 = (!Class160.aBool2263 ? 22 : 26) + Class230.anInt3147 * 16;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rj.K(" + i + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	static {
		anIntArray6832 = new int[3];
		anInt6830 = 0;
	}
}
