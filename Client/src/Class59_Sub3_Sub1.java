/* Class59_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub3_Sub1 extends Class59_Sub3 implements Class_f {
	static int anInt5722;
	static int anInt5723;
	static int anInt5724;
	static int anInt5725;
	static int anInt5726;
	static int anInt5727;
	static Class67 aClass67_5728;
	static int anInt5729;
	static int anInt5730;
	static int anInt5731;
	Class59_Sub3 aClass59_Sub3_5732;
	static int anInt5733;
	static int anInt5734;
	static int anInt5735;
	static int anInt5736;
	static int anInt5737;
	static int anInt5738;
	static boolean[] aBoolArray5739;
	static int anInt5740;
	static int anInt5741;
	static int anInt5742;
	static long aLong5743 = 0L;
	static int anInt5744;
	static int anInt5745;
	static boolean aBool5746;
	static Class116 aClass116_5747;

	public final boolean method22(int i) {
		try {
			anInt5724++;
			if (i != 10869)
				method405(50, -29, null, (byte) 35, false, null, 104);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.V(" + i + ')');
		}
	}

	public final void method19(Class260 class260, int i) {
		do {
			try {
				anInt5745++;
				if (i == -12694)
					break;
				method24(59);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("av.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method409(int i, int i_0_, Class260 class260, int i_1_) {
		try {
			anInt5723++;
			if (i_0_ != 0)
				method18((byte) 91);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("av.A(" + i + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final void method405(int i, int i_2_, Class59 class59, byte i_3_, boolean bool, Class260 class260, int i_4_) {
		try {
			if (i_3_ != -99)
				aClass67_5728 = null;
			anInt5740++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("av.L(" + i + ',' + i_2_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_3_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_4_ + ')'));
		}
	}

	static final void method2439(byte i) {
		try {
			anInt5731++;
			if (Class40_Sub3.anIntArray4064 == null) {
				Class40_Sub3.anIntArray4064 = new int[65536];
				double d = 0.7 + (Math.random() * 0.03 - 0.015);
				int i_5_ = -26 % ((i - 46) / 48);
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -65537; i_6_++) {
					double d_7_ = 0.0078125 + (double) (i_6_ >> 10 & 0x3f) / 64.0;
					double d_8_ = (double) (0x7 & i_6_ >> 7) / 8.0 + 0.0625;
					double d_9_ = (double) (0x7f & i_6_) / 128.0;
					double d_10_ = d_9_;
					double d_11_ = d_9_;
					double d_12_ = d_9_;
					if (d_8_ != 0.0) {
						double d_13_;
						if (d_9_ < 0.5)
							d_13_ = d_9_ * (1.0 + d_8_);
						else
							d_13_ = -(d_9_ * d_8_) + (d_8_ + d_9_);
						double d_14_ = 2.0 * d_9_ - d_13_;
						double d_15_ = 0.3333333333333333 + d_7_;
						if (d_15_ > 1.0)
							d_15_--;
						double d_16_ = d_7_;
						double d_17_ = d_7_ - 0.3333333333333333;
						if (d_17_ < 0.0)
							d_17_++;
						if (d_16_ * 6.0 < 1.0)
							d_11_ = d_16_ * (6.0 * (-d_14_ + d_13_)) + d_14_;
						else if (d_16_ * 2.0 < 1.0)
							d_11_ = d_13_;
						else if (!(d_16_ * 3.0 < 2.0))
							d_11_ = d_14_;
						else
							d_11_ = d_14_ + 6.0 * ((-d_14_ + d_13_) * (0.6666666666666666 - d_16_));
						if (6.0 * d_15_ < 1.0)
							d_10_ = d_14_ + d_15_ * ((-d_14_ + d_13_) * 6.0);
						else if (!(2.0 * d_15_ < 1.0)) {
							if (!(3.0 * d_15_ < 2.0))
								d_10_ = d_14_;
							else
								d_10_ = d_14_ + ((d_13_ - d_14_) * (-d_15_ + 0.6666666666666666) * 6.0);
						} else
							d_10_ = d_13_;
						if (d_17_ * 6.0 < 1.0)
							d_12_ = (d_13_ - d_14_) * 6.0 * d_17_ + d_14_;
						else if (!(2.0 * d_17_ < 1.0)) {
							if (!(3.0 * d_17_ < 2.0))
								d_12_ = d_14_;
							else
								d_12_ = d_14_ + 6.0 * ((-d_17_ + 0.6666666666666666) * (-d_14_ + d_13_));
						} else
							d_12_ = d_13_;
					}
					d_10_ = Math.pow(d_10_, d);
					d_11_ = Math.pow(d_11_, d);
					d_12_ = Math.pow(d_12_, d);
					int i_18_ = (int) (d_10_ * 256.0);
					int i_19_ = (int) (d_11_ * 256.0);
					int i_20_ = (int) (256.0 * d_12_);
					int i_21_ = i_20_ + ((i_18_ << 16) - -(i_19_ << 8));
					Class40_Sub3.anIntArray4064[i_6_] = i_21_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.C(" + i + ')');
		}
	}

	static final void method2440(int i, int i_22_, Class260 class260, int i_23_, Class235 class235, int i_24_, Class128 class128, int i_25_, int i_26_) {
		do {
			try {
				anInt5742++;
				Class140 class140 = Class246_Sub28_Sub30.aClass165_6873.method1088(i_23_, (byte) -41);
				if (i_22_ == -14698) {
					if (class140 == null || !((Class140) class140).aBool2028 || !class140.method942(-11247, (Class246_Sub28_Sub23.aClass95_6658)))
						break;
					if (((Class140) class140).anIntArray2027 != null) {
						int[] is = (new int[((Class140) class140).anIntArray2027.length]);
						for (int i_27_ = 0; is.length / 2 > i_27_; i_27_++) {
							int i_28_;
							if (Class130_Sub3.anInt4417 == 4)
								i_28_ = 0x3fff & (int) Class204.aFloat2881;
							else
								i_28_ = ((int) Class204.aFloat2881 - -Class95.anInt1253) & 0x3fff;
							int i_29_ = Class39_Sub1.f_fb[i_28_];
							int i_30_ = Class39_Sub1.anIntArray4672[i_28_];
							if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -5) {
								i_30_ = i_30_ * 256 / (Class246_Sub12.anInt4405 + 256);
								i_29_ = (256 * i_29_ / (256 + Class246_Sub12.anInt4405));
							}
							is[i_27_ * 2] = (((Class235) class235).f_fc / 2 + i_25_ + ((((i + 4 * (((Class140) class140).anIntArray2027[i_27_ * 2])) * i_30_) + i_29_ * (4 * (((Class140) class140).anIntArray2027[i_27_ * 2 + 1]) + i_24_)) >> 15));
							is[2 * i_27_ + 1] = (i_26_ - (-(((Class235) class235).f_sb / 2) + (((i_24_ - -(4 * (((Class140) class140).anIntArray2027[i_27_ * 2 + 1]))) * i_30_ - (i + 4 * (((Class140) class140).anIntArray2027[2 * i_27_])) * i_29_) >> 15)));
						}
						Class77.method487(class260, is, ((Class140) class140).anInt2023, ((Class235) class235).f_ld, ((Class235) class235).f_hc);
						for (int i_31_ = 0; is.length / 2 - 1 > i_31_; i_31_++)
							class260.method1728(is[i_31_ * 2], is[2 * i_31_ + 1], is[2 * i_31_ + 2], is[(1 + i_31_) * 2 + 1], (((Class140) class140).anInt2000), 1, class128, i_25_, i_26_);
						class260.method1728(is[-2 + is.length], is[-1 + is.length], is[0], is[1], ((Class140) class140).anInt2000, 1, class128, i_25_, i_26_);
					}
					Class_l class_l = null;
					if ((((Class140) class140).anInt2026 ^ 0xffffffff) != 0) {
						class_l = class140.method949(class260, false, (byte) 119);
						if (class_l != null)
							Class253.method1635(i_25_, true, class_l, class235, class128, i_24_, i, i_26_);
					}
					if (((Class140) class140).aString1998 == null)
						break;
					int i_32_ = 0;
					if (class_l != null)
						i_32_ = class_l.ma();
					Class116 class116 = Class_c.aClass116_1196;
					Class73 class73 = Class217.aClass73_3022;
					if (((Class140) class140).anInt1994 == 1) {
						class116 = Class109.aClass116_1554;
						class73 = Class246_Sub5.aClass73_3892;
					}
					if ((((Class140) class140).anInt1994 ^ 0xffffffff) == -3) {
						class116 = Class79_Sub1.aClass116_5162;
						class73 = Class_fs.aClass73_148;
					}
					Class148.method1002(i_25_, ((Class140) class140).aString1998, 3, i, i_32_, class116, i_26_, class235, i_24_, ((Class140) class140).anInt2022, class73, class128);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("av.T(" + i + ',' + i_22_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_23_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_24_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i_25_ + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	public final int method18(byte i) {
		try {
			anInt5735++;
			if (i != -70)
				method23(null, -77, -46);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.M(" + i + ')');
		}
	}

	public static void method2441(int i) {
		try {
			aClass67_5728 = null;
			if (i != 0)
				method2442(31, 20);
			aClass116_5747 = null;
			aBoolArray5739 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.AA(" + i + ')');
		}
	}

	Class59_Sub3_Sub1(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, Class59_Sub3 class59_sub3) {
		super(i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, i_40_, i_41_, false, Class246_Sub1_Sub6.method2532((byte) 120, i_33_, i));
		try {
			((Class59_Sub3_Sub1) this).aClass59_Sub3_5732 = class59_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("av.<init>(" + i + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + (class59_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method406(byte i) {
		try {
			if (i <= 104)
				return false;
			anInt5738++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.E(" + i + ')');
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		try {
			if (bool != true)
				method401(-9);
			anInt5737++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("av.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			anInt5727++;
			if (bool != true)
				aBoolArray5739 = null;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.F(" + bool + ')');
		}
	}

	final int method2168(int i) {
		try {
			if (i != -25430)
				return 119;
			anInt5730++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.K(" + i + ')');
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			if (i >= -87)
				return null;
			anInt5726++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final void method9(int i) {
		do {
			try {
				anInt5725++;
				if (i <= -18)
					break;
				aBool5746 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "av.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2442(int i, int i_42_) {
		try {
			if (i != 0)
				aClass116_5747 = null;
			Class191.anInt2689 = i_42_;
			anInt5734++;
			Class93.aClass54_1229.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.R(" + i + ',' + i_42_ + ')');
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_43_) {
		try {
			anInt5741++;
			int i_44_ = 81 / ((54 - i_43_) / 56);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("av.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_43_ + ')'));
		}
	}

	final void method401(int i) {
		try {
			int i_45_ = 74 / ((i - 57) / 44);
			anInt5729++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.J(" + i + ')');
		}
	}

	final void method403(Class260 class260, int i) {
		try {
			if (i <= 53)
				method21(true);
			anInt5736++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final String method2443(String string, byte i) {
		try {
			anInt5722++;
			int i_46_ = string.length();
			int i_47_ = 0;
			if (i <= 63)
				method2441(108);
			for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
				int i_49_ = string.charAt(i_48_);
				if ((i_49_ ^ 0xffffffff) == -61 || (i_49_ ^ 0xffffffff) == -63)
					i_47_ += 3;
			}
			StringBuffer stringbuffer = new StringBuffer(i_47_ + i_46_);
			for (int i_50_ = 0; i_50_ < i_46_; i_50_++) {
				char c = string.charAt(i_50_);
				if ((c ^ 0xffffffff) != -61) {
					if (c != 62)
						stringbuffer.append(c);
					else
						stringbuffer.append("<gt>");
				} else
					stringbuffer.append("<lt>");
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.CA(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final String method2444(int i) {
		try {
			anInt5733++;
			if (i != 256)
				return null;
			String string = "www";
			if (client.f_fb != Class260_Sub2.aClass205_4297) {
				if (Class130_Sub4.aClass205_4740 == Class260_Sub2.aClass205_4297)
					string = "www-wtqa";
				else if (Class260_Sub2.aClass205_4297 == Class238.aClass205_3351)
					string = "www-wtwip";
			} else
				string = "www-wtrc";
			String string_51_ = "";
			if (Class246_Sub5.aString3891 != null)
				string_51_ = "/p=" + Class246_Sub5.aString3891;
			return ("http://" + string + "." + ((Class101) Class59_Sub4_Sub3.aClass101_6943).aString1315 + ".com/l=" + Class_j.anInt1485 + "/a=" + Class109_Sub4.anInt4573 + string_51_ + "/");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.BA(" + i + ')');
		}
	}

	public final int method24(int i) {
		try {
			anInt5744++;
			int i_52_ = 53 / ((i - 39) / 41);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "av.G(" + i + ')');
		}
	}

	static {
		aClass67_5728 = new Class67("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
		aBool5746 = false;
	}
}
