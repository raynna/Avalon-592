/* Class246_Sub37_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub37_Sub1 extends Class246_Sub37 {
	private int[] anIntArray5906;
	static int anInt5907;
	static int anInt5908;
	static int anInt5909;
	static Interface6 anInterface6_5910;
	static int anInt5911;
	static int anInt5912;
	private int[] anIntArray5913;
	private int[] anIntArray5914;
	private int[] anIntArray5915 = new int[16];
	static int anInt5916;
	static int anInt5917;
	static int anInt5918;
	private int anInt5919 = 1000000;
	static int anInt5920;
	static int anInt5921;
	private int[] anIntArray5922;
	private Class158 aClass158_5923;
	int[] anIntArray5924 = new int[16];
	static int anInt5925;
	private Class85 aClass85_5926;
	private int[] anIntArray5927;
	static int anInt5928;
	static int anInt5929;
	private int anInt5930;
	static int anInt5931;
	static int anInt5932;
	private int[] anIntArray5933;
	static int anInt5934;
	static int anInt5935;
	static int[] anIntArray5936 = { 1, -1, -1, 1 };
	static int anInt5937;
	static int anInt5938;
	static int anInt5939;
	private int[] anIntArray5940;
	static int anInt5941;
	private Class246_Sub22[][] aClass246_Sub22ArrayArray5942;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	int[] f_eb;
	static int f_fb;
	static int f_gb;
	private int[] f_hb;
	static int f_ib;
	static int f_jb;
	private int[] f_kb;
	static int f_lb;
	private int[] f_mb;
	static int f_nb;
	static int f_ob = -1;
	static int f_pb;
	static int f_qb;
	static int f_rb;
	static int f_sb;
	static int f_tb;
	private Class246_Sub22[][] f_ub;
	static int f_vb;
	static int f_wb;
	static Class_l aClass_l5943;
	static int anInt5944;
	int[] anIntArray5945;
	private int[] anIntArray5946;
	static int anInt5947;
	static int anInt5948;
	private int[] anIntArray5949;
	private int anInt5950;
	private boolean aBool5951;
	private long aLong5952;
	private int anInt5953;
	private Class246_Sub37_Sub4 aClass246_Sub37_Sub4_5954;
	private long aLong5955;
	private Class246_Sub24 aClass246_Sub24_5956;
	private boolean aBool5957;
	private int anInt5958;

	private final void method2496(int i, int i_0_) {
		try {
			for (Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1104(46)); class246_sub22 != null; class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1108((byte) -112))) {
				if (i_0_ < 0 || ((i_0_ ^ 0xffffffff) == (((Class246_Sub22) class246_sub22).anInt4754 ^ 0xffffffff))) {
					if ((((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756) != null) {
						((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2810(Class140.anInt2024 / 100);
						if (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2807())
							((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass246_Sub37_Sub2_6884.method2626(((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756);
						class246_sub22.method2086(i ^ 0xffffffff);
					}
					if ((((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) > -1)
						aClass246_Sub22ArrayArray5942[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4752] = null;
					class246_sub22.unlink((byte) -33);
				}
			}
			if (i != -1)
				anIntArray5914 = null;
			anInt5938++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.S(" + i + ',' + i_0_ + ')');
		}
	}

	private final void method2497(int i, int i_1_) {
		try {
			anInt5939++;
			int i_2_ = i_1_ & 0xf0;
			if (i_2_ == 128) {
				int i_3_ = i_1_ & 0xf;
				int i_4_ = i_1_ >> 8 & 0x7f;
				int i_5_ = (0x7f3214 & i_1_) >> 16;
				method2527(false, i_3_, i_5_, i_4_);
			} else if (i_2_ == 144) {
				int i_6_ = 0xf & i_1_;
				int i_7_ = i_1_ >> 8 & 0x7f;
				int i_8_ = 0x7f & i_1_ >> 16;
				if (i_8_ > 0)
					method2499(i_6_, i_7_, i_8_, -121);
				else
					method2527(false, i_6_, 64, i_7_);
			} else if (i_2_ == 160) {
				int i_9_ = 0xf & i_1_;
				int i_10_ = (i_1_ & 0x7f9a) >> 8;
				int i_11_ = i_1_ >> 16 & 0x7f;
				method2500(i_10_, i_11_, (byte) 119, i_9_);
			} else {
				int i_12_ = 122 / ((i - 62) / 60);
				if ((i_2_ ^ 0xffffffff) == -177) {
					int i_13_ = i_1_ & 0xf;
					int i_14_ = (0x7fd6 & i_1_) >> 8;
					int i_15_ = 0x7f & i_1_ >> 16;
					if ((i_14_ ^ 0xffffffff) == -1)
						f_mb[i_13_] = (i_15_ << 14) + PacketsDecoder.method184(-2080769, f_mb[i_13_]);
					if ((i_14_ ^ 0xffffffff) == -33)
						f_mb[i_13_] = (PacketsDecoder.method184(f_mb[i_13_], -16257) - -(i_15_ << 7));
					if ((i_14_ ^ 0xffffffff) == -2)
						anIntArray5940[i_13_] = PacketsDecoder.method184(anIntArray5940[i_13_], -16257) - -(i_15_ << 7);
					if ((i_14_ ^ 0xffffffff) == -34)
						anIntArray5940[i_13_] = i_15_ + PacketsDecoder.method184(-128, (anIntArray5940[i_13_]));
					if ((i_14_ ^ 0xffffffff) == -6)
						anIntArray5922[i_13_] = PacketsDecoder.method184(anIntArray5922[i_13_], -16257) + (i_15_ << 7);
					if (i_14_ == 37)
						anIntArray5922[i_13_] = i_15_ + PacketsDecoder.method184(anIntArray5922[i_13_], -128);
					if ((i_14_ ^ 0xffffffff) == -8)
						anIntArray5913[i_13_] = PacketsDecoder.method184(anIntArray5913[i_13_], -16257) - -(i_15_ << 7);
					if ((i_14_ ^ 0xffffffff) == -40)
						anIntArray5913[i_13_] = i_15_ + PacketsDecoder.method184(-128, (anIntArray5913[i_13_]));
					if (i_14_ == 10)
						f_kb[i_13_] = PacketsDecoder.method184(f_kb[i_13_], -16257) + (i_15_ << 7);
					if ((i_14_ ^ 0xffffffff) == -43)
						f_kb[i_13_] = PacketsDecoder.method184(-128, f_kb[i_13_]) - -i_15_;
					if ((i_14_ ^ 0xffffffff) == -12)
						anIntArray5946[i_13_] = ((i_15_ << 7) + PacketsDecoder.method184(-16257, anIntArray5946[i_13_]));
					if ((i_14_ ^ 0xffffffff) == -44)
						anIntArray5946[i_13_] = (PacketsDecoder.method184(anIntArray5946[i_13_], -128) + i_15_);
					if ((i_14_ ^ 0xffffffff) == -65) {
						if ((i_15_ ^ 0xffffffff) > -65)
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = PacketsDecoder.method184((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), -2);
						else
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = Class236.method1523((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), 1);
					}
					if (i_14_ == 65) {
						if ((i_15_ ^ 0xffffffff) <= -65)
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = Class236.method1523((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), 2);
						else {
							method2526((byte) 119, i_13_);
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = PacketsDecoder.method184((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), -3);
						}
					}
					if ((i_14_ ^ 0xffffffff) == -100)
						anIntArray5914[i_13_] = ((i_15_ << 7) + PacketsDecoder.method184(anIntArray5914[i_13_], 127));
					if ((i_14_ ^ 0xffffffff) == -99)
						anIntArray5914[i_13_] = (PacketsDecoder.method184(16256, anIntArray5914[i_13_]) + i_15_);
					if ((i_14_ ^ 0xffffffff) == -102)
						anIntArray5914[i_13_] = ((i_15_ << 7) + (PacketsDecoder.method184(127, anIntArray5914[i_13_]) + 16384));
					if (i_14_ == 100)
						anIntArray5914[i_13_] = (PacketsDecoder.method184(anIntArray5914[i_13_], 16256) + (16384 + i_15_));
					if (i_14_ == 120)
						method2496(-1, i_13_);
					if ((i_14_ ^ 0xffffffff) == -122)
						method2519(false, i_13_);
					if ((i_14_ ^ 0xffffffff) == -124)
						method2504(true, i_13_);
					if (i_14_ == 6) {
						int i_16_ = anIntArray5914[i_13_];
						if (i_16_ == 16384)
							anIntArray5949[i_13_] = ((i_15_ << 7) + PacketsDecoder.method184(anIntArray5949[i_13_], -16257));
					}
					if ((i_14_ ^ 0xffffffff) == -39) {
						int i_17_ = anIntArray5914[i_13_];
						if (i_17_ == 16384)
							anIntArray5949[i_13_] = i_15_ + PacketsDecoder.method184(-128, (anIntArray5949[i_13_]));
					}
					if ((i_14_ ^ 0xffffffff) == -17)
						((Class246_Sub37_Sub1) this).anIntArray5924[i_13_] = ((i_15_ << 7) + PacketsDecoder.method184((((Class246_Sub37_Sub1) this).anIntArray5924[i_13_]), -16257));
					if ((i_14_ ^ 0xffffffff) == -49)
						((Class246_Sub37_Sub1) this).anIntArray5924[i_13_] = (i_15_ + PacketsDecoder.method184(-128, (((Class246_Sub37_Sub1) this).anIntArray5924[i_13_])));
					if ((i_14_ ^ 0xffffffff) == -82) {
						if ((i_15_ ^ 0xffffffff) <= -65)
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = Class236.method1523((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), 4);
						else {
							method2521((byte) -10, i_13_);
							((Class246_Sub37_Sub1) this).anIntArray5945[i_13_] = PacketsDecoder.method184((((Class246_Sub37_Sub1) this).anIntArray5945[i_13_]), -5);
						}
					}
					if (i_14_ == 17)
						method2498(-44, i_13_, (~0x3f80 & f_hb[i_13_]) + (i_15_ << 7));
					if (i_14_ == 49)
						method2498(-44, i_13_, (~0x7f & f_hb[i_13_]) - -i_15_);
				} else if (i_2_ == 192) {
					int i_18_ = i_1_ & 0xf;
					int i_19_ = (i_1_ & 0x7f45) >> 8;
					method2523(i_18_, (byte) 102, i_19_ + f_mb[i_18_]);
				} else if ((i_2_ ^ 0xffffffff) == -209) {
					int i_20_ = i_1_ & 0xf;
					int i_21_ = (i_1_ & 0x7f7f) >> 8;
					method2530(i_20_, (byte) 12, i_21_);
				} else if ((i_2_ ^ 0xffffffff) == -225) {
					int i_22_ = i_1_ & 0xf;
					int i_23_ = ((i_1_ & 0x7f0052) >> 9) + (0x7f & i_1_ >> 8);
					method2506((byte) 126, i_23_, i_22_);
				} else {
					i_2_ = i_1_ & 0xff;
					if ((i_2_ ^ 0xffffffff) == -256)
						method2520(114, true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.M(" + i + ',' + i_1_ + ')');
		}
	}

	private final void method2498(int i, int i_24_, int i_25_) {
		try {
			f_vb++;
			if (i != -44)
				f_mb = null;
			f_hb[i_24_] = i_25_;
			((Class246_Sub37_Sub1) this).f_eb[i_24_] = (int) (2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double) i_25_) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.Q(" + i + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	private final void method2499(int i, int i_26_, int i_27_, int i_28_) {
		try {
			method2527(false, i, 64, i_26_);
			anInt5944++;
			if ((((Class246_Sub37_Sub1) this).anIntArray5945[i] & 0x2 ^ 0xffffffff) != -1) {
				for (Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1103(-99)); class246_sub22 != null; class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1109((byte) 32))) {
					if (((i ^ 0xffffffff) == (((Class246_Sub22) class246_sub22).anInt4754 ^ 0xffffffff)) && (((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) > -1) {
						aClass246_Sub22ArrayArray5942[i][((Class246_Sub22) class246_sub22).anInt4752] = null;
						aClass246_Sub22ArrayArray5942[i][i_26_] = class246_sub22;
						int i_29_ = (((Class246_Sub22) class246_sub22).anInt4774 - -((((Class246_Sub22) class246_sub22).anInt4759 * (((Class246_Sub22) class246_sub22).anInt4770)) >> 12));
						((Class246_Sub22) class246_sub22).anInt4774 += i_26_ - (((Class246_Sub22) class246_sub22).anInt4752) << 8;
						((Class246_Sub22) class246_sub22).anInt4752 = i_26_;
						((Class246_Sub22) class246_sub22).anInt4759 = (i_29_ - ((Class246_Sub22) class246_sub22).anInt4774);
						((Class246_Sub22) class246_sub22).anInt4770 = 4096;
						return;
					}
				}
			}
			Class246_Sub34 class246_sub34 = ((Class246_Sub34) aClass85_5926.method544((long) anIntArray5915[i], 125));
			if (class246_sub34 != null) {
				Class246_Sub3_Sub1 class246_sub3_sub1 = (((Class246_Sub34) class246_sub34).aClass246_Sub3_Sub1Array5133[i_26_]);
				if (class246_sub3_sub1 != null) {
					Class246_Sub22 class246_sub22 = new Class246_Sub22();
					((Class246_Sub22) class246_sub22).aClass246_Sub34_4765 = class246_sub34;
					((Class246_Sub22) class246_sub22).anInt4754 = i;
					((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764 = class246_sub3_sub1;
					((Class246_Sub22) class246_sub22).aClass239_4760 = (((Class246_Sub34) class246_sub34).aClass239Array5138[i_26_]);
					((Class246_Sub22) class246_sub22).anInt4753 = (((Class246_Sub34) class246_sub34).aByteArray5131[i_26_]);
					((Class246_Sub22) class246_sub22).anInt4752 = i_26_;
					((Class246_Sub22) class246_sub22).anInt4757 = 1024 + (((Class246_Sub34) class246_sub34).anInt5136 * i_27_ * (i_27_ * (((Class246_Sub34) class246_sub34).aByteArray5126[i_26_]))) >> 11;
					((Class246_Sub22) class246_sub22).anInt4762 = 0xff & (((Class246_Sub34) class246_sub34).aByteArray5130[i_26_]);
					((Class246_Sub22) class246_sub22).anInt4774 = -(0x7fff & (((Class246_Sub34) class246_sub34).aShortArray5137[i_26_])) + (i_26_ << 8);
					if (i_28_ <= -110) {
						((Class246_Sub22) class246_sub22).anInt4766 = -1;
						((Class246_Sub22) class246_sub22).anInt4768 = 0;
						((Class246_Sub22) class246_sub22).anInt4750 = 0;
						((Class246_Sub22) class246_sub22).anInt4767 = 0;
						((Class246_Sub22) class246_sub22).anInt4763 = 0;
						if (((Class246_Sub37_Sub1) this).anIntArray5924[i] != 0) {
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806(class246_sub3_sub1, method2529(true, class246_sub22), 0, method2514(class246_sub22, 16384)));
							method2511(((((Class246_Sub34) class246_sub34).aShortArray5137[i_26_]) ^ 0xffffffff) > -1, -1, class246_sub22);
						} else
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806(class246_sub3_sub1, method2529(true, class246_sub22), method2510(class246_sub22, (byte) -97), method2514(class246_sub22, 16384)));
						if (((((Class246_Sub34) class246_sub34).aShortArray5137[i_26_]) ^ 0xffffffff) > -1)
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2781(-1);
						if ((((Class246_Sub22) class246_sub22).anInt4753 ^ 0xffffffff) <= -1) {
							Class246_Sub22 class246_sub22_30_ = f_ub[i][(((Class246_Sub22) class246_sub22).anInt4753)];
							if (class246_sub22_30_ != null && ((((Class246_Sub22) class246_sub22_30_).anInt4766) ^ 0xffffffff) > -1) {
								aClass246_Sub22ArrayArray5942[i][(((Class246_Sub22) class246_sub22_30_).anInt4752)] = null;
								((Class246_Sub22) class246_sub22_30_).anInt4766 = 0;
							}
							f_ub[i][(((Class246_Sub22) class246_sub22).anInt4753)] = class246_sub22;
						}
						((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1101(false, class246_sub22);
						aClass246_Sub22ArrayArray5942[i][i_26_] = class246_sub22;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.IA(" + i + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	private final void method2500(int i, int i_31_, byte i_32_, int i_33_) {
		do {
			try {
				anInt5925++;
				if (i_32_ >= 13)
					break;
				anInt5953 = 102;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dv.L(" + i + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ')'));
			}
			break;
		} while (false);
	}

	private final synchronized void method2501(Class246_Sub24 class246_sub24, boolean bool, int i, boolean bool_34_) {
		try {
			f_ab++;
			method2518(bool, true);
			aClass158_5923.method1048(((Class246_Sub24) class246_sub24).aByteArray4875);
			if (i != -18431)
				method2506((byte) -52, -89, -114);
			aLong5952 = 0L;
			aBool5951 = bool_34_;
			int i_35_ = aClass158_5923.method1054();
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				aClass158_5923.method1050(i_36_);
				aClass158_5923.method1044(i_36_);
				aClass158_5923.method1041(i_36_);
			}
			anInt5950 = aClass158_5923.method1049();
			anInt5953 = ((Class158) aClass158_5923).anIntArray2252[anInt5950];
			aLong5955 = aClass158_5923.method1042(anInt5953);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.N(" + (class246_sub24 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + bool_34_ + ')'));
		}
	}

	private final void method2502(int i, int i_37_, byte i_38_) {
		do {
			try {
				anInt5908++;
				anIntArray5906[i_37_] = i;
				f_mb[i_37_] = PacketsDecoder.method184(-128, i);
				method2523(i_37_, (byte) 126, i);
				if (i_38_ == -57)
					break;
				method2496(-8, 90);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dv.D(" + i + ',' + i_37_ + ',' + i_38_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized void method2503(boolean bool, int i) {
		try {
			if (bool == true) {
				anInt5930 = i;
				anInt5920++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.R(" + bool + ',' + i + ')');
		}
	}

	final synchronized Class246_Sub37 method2259() {
		try {
			anInt5941++;
			return aClass246_Sub37_Sub4_5954;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.OA(" + ')');
		}
	}

	private final void method2504(boolean bool, int i) {
		try {
			f_lb++;
			if (bool != true)
				method2520(9, true);
			for (Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1104(124)); class246_sub22 != null; class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1108((byte) -112))) {
				if (((i ^ 0xffffffff) > -1 || (((Class246_Sub22) class246_sub22).anInt4754 ^ 0xffffffff) == (i ^ 0xffffffff)) && ((Class246_Sub22) class246_sub22).anInt4766 < 0) {
					aClass246_Sub22ArrayArray5942[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4752] = null;
					((Class246_Sub22) class246_sub22).anInt4766 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.QA(" + bool + ',' + i + ')');
		}
	}

	final boolean method2505(byte i, Class246_Sub22 class246_sub22) {
		try {
			f_nb++;
			if (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 == null) {
				if ((((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) <= -1) {
					class246_sub22.unlink((byte) 125);
					if ((((Class246_Sub22) class246_sub22).anInt4753 ^ 0xffffffff) < -1 && ((f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753]) == class246_sub22))
						f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753] = null;
				}
				return true;
			}
			int i_39_ = -107 / ((i - 38) / 43);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.MA(" + i + ',' + (class246_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2506(byte i, int i_40_, int i_41_) {
		try {
			f_tb++;
			if (i >= 115)
				anIntArray5933[i_41_] = i_40_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.W(" + i + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	final synchronized void method2260(int i) {
		try {
			if (aClass158_5923.method1051()) {
				int i_42_ = (((Class158) aClass158_5923).anInt2253 * anInt5919 / Class140.anInt2024);
				do {
					long l = (long) i * (long) i_42_ + aLong5952;
					if (aLong5955 - l >= 0L) {
						aLong5952 = l;
						break;
					}
					int i_43_ = (int) ((-aLong5952 + aLong5955 + ((long) i_42_ - 1L)) / (long) i_42_);
					aLong5952 += (long) i_42_ * (long) i_43_;
					i -= i_43_;
					aClass246_Sub37_Sub4_5954.method2260(i_43_);
					method2507((byte) -87);
				} while (aClass158_5923.method1051());
			}
			anInt5921++;
			aClass246_Sub37_Sub4_5954.method2260(i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.E(" + i + ')');
		}
	}

	private final void method2507(byte i) {
		do {
			try {
				anInt5929++;
				int i_44_ = anInt5950;
				int i_45_ = anInt5953;
				long l = aLong5955;
				if (aClass246_Sub24_5956 != null && (anInt5958 ^ 0xffffffff) == (i_45_ ^ 0xffffffff)) {
					method2501(aClass246_Sub24_5956, aBool5957, -18431, aBool5951);
					method2507((byte) -87);
				} else {
					while ((i_45_ ^ 0xffffffff) == (anInt5953 ^ 0xffffffff)) {
						while (((((Class158) aClass158_5923).anIntArray2252[i_44_]) ^ 0xffffffff) == (i_45_ ^ 0xffffffff)) {
							aClass158_5923.method1050(i_44_);
							int i_46_ = aClass158_5923.method1052(i_44_);
							if (i_46_ == 1) {
								aClass158_5923.method1039();
								aClass158_5923.method1041(i_44_);
								if (aClass158_5923.method1046()) {
									if (aClass246_Sub24_5956 != null) {
										method2525(aBool5951, (byte) -87, aClass246_Sub24_5956);
										method2507((byte) -87);
										return;
									}
									if (aBool5951 && i_45_ != 0)
										aClass158_5923.method1047(l);
									else {
										method2520(102, true);
										aClass158_5923.method1043();
										return;
									}
								}
								break;
							}
							if ((i_46_ & 0x80 ^ 0xffffffff) != -1)
								method2497(-62, i_46_);
							aClass158_5923.method1044(i_44_);
							aClass158_5923.method1041(i_44_);
						}
						i_44_ = aClass158_5923.method1049();
						i_45_ = (((Class158) aClass158_5923).anIntArray2252[i_44_]);
						l = aClass158_5923.method1042(i_45_);
					}
					anInt5953 = i_45_;
					anInt5950 = i_44_;
					if (i != -87)
						f_kb = null;
					aLong5955 = l;
					if (aClass246_Sub24_5956 == null || (anInt5958 ^ 0xffffffff) <= (i_45_ ^ 0xffffffff))
						break;
					anInt5950 = -1;
					anInt5953 = anInt5958;
					aLong5955 = aClass158_5923.method1042(anInt5953);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dv.P(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2508(int i) {
		try {
			f_rb++;
			if (i == 127) {
				for (Class246_Sub6 class246_sub6 = ((Class246_Sub6) Class61.aClass166_846.method1104(i ^ 0x37)); class246_sub6 != null; class246_sub6 = ((Class246_Sub6) Class61.aClass166_846.method1108((byte) -112))) {
					if ((((Class246_Sub6) class246_sub6).anInt3931 ^ 0xffffffff) < -1)
						((Class246_Sub6) class246_sub6).anInt3931--;
					if (((Class246_Sub6) class246_sub6).anInt3931 != 0) {
						if (((Class246_Sub6) class246_sub6).anInt3934 > 0)
							((Class246_Sub6) class246_sub6).anInt3934--;
						if ((((Class246_Sub6) class246_sub6).anInt3934 ^ 0xffffffff) == -1 && (((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff) <= -2 && ((Class246_Sub6) class246_sub6).anInt3925 >= 1 && ((-2 + Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) <= (((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff)) && ((((Class246_Sub6) class246_sub6).anInt3925 ^ 0xffffffff) >= (Class152.anInt2205 - 2 ^ 0xffffffff)) && ((((Class246_Sub6) class246_sub6).anInt3929 ^ 0xffffffff) > -1 || Class66.method430((byte) -108, ((Class246_Sub6) class246_sub6).anInt3929, (((Class246_Sub6) class246_sub6).anInt3937)))) {
							Class12.method139(((Class246_Sub6) class246_sub6).anInt3936, ((Class246_Sub6) class246_sub6).anInt3928, ((Class246_Sub6) class246_sub6).anInt3937, 255, -1, ((Class246_Sub6) class246_sub6).anInt3941, ((Class246_Sub6) class246_sub6).anInt3929, ((Class246_Sub6) class246_sub6).anInt3925, ((Class246_Sub6) class246_sub6).anInt3927);
							((Class246_Sub6) class246_sub6).anInt3934 = -1;
							if ((((Class246_Sub6) class246_sub6).anInt3932 == ((Class246_Sub6) class246_sub6).anInt3929) && (((Class246_Sub6) class246_sub6).anInt3932 == -1))
								class246_sub6.unlink((byte) -92);
							else if ((((((Class246_Sub6) class246_sub6).anInt3932) ^ 0xffffffff) == ((((Class246_Sub6) class246_sub6).anInt3929) ^ 0xffffffff)) && (((((Class246_Sub6) class246_sub6).anInt3941) ^ 0xffffffff) == ((((Class246_Sub6) class246_sub6).anInt3939) ^ 0xffffffff)) && (((((Class246_Sub6) class246_sub6).anInt3937) ^ 0xffffffff) == ((((Class246_Sub6) class246_sub6).anInt3938) ^ 0xffffffff)))
								class246_sub6.unlink((byte) 90);
						}
					} else if (((Class246_Sub6) class246_sub6).anInt3932 < 0 || Class66.method430((byte) -102, ((Class246_Sub6) class246_sub6).anInt3932, (((Class246_Sub6) class246_sub6).anInt3938))) {
						Class12.method139(((Class246_Sub6) class246_sub6).anInt3936, ((Class246_Sub6) class246_sub6).anInt3928, ((Class246_Sub6) class246_sub6).anInt3938, 255, -1, ((Class246_Sub6) class246_sub6).anInt3939, ((Class246_Sub6) class246_sub6).anInt3932, ((Class246_Sub6) class246_sub6).anInt3925, ((Class246_Sub6) class246_sub6).anInt3927);
						class246_sub6.unlink((byte) -30);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.RA(" + i + ')');
		}
	}

	final synchronized boolean method2509(byte i) {
		try {
			f_wb++;
			int i_47_ = -38 / ((i + 58) / 37);
			return aClass158_5923.method1051();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.CA(" + i + ')');
		}
	}

	private final int method2510(Class246_Sub22 class246_sub22, byte i) {
		try {
			anInt5932++;
			if (anIntArray5927[((Class246_Sub22) class246_sub22).anInt4754] == 0)
				return 0;
			Class239 class239 = ((Class246_Sub22) class246_sub22).aClass239_4760;
			int i_48_ = ((anIntArray5913[((Class246_Sub22) class246_sub22).anInt4754] * (anIntArray5946[((Class246_Sub22) class246_sub22).anInt4754])) + 4096 >> 13);
			i_48_ = 16384 + i_48_ * i_48_ >> 15;
			i_48_ = (i_48_ * ((Class246_Sub22) class246_sub22).anInt4757 + 16384 >> 15);
			i_48_ = i_48_ * anInt5930 + 128 >> 8;
			i_48_ = 128 + anIntArray5927[(((Class246_Sub22) class246_sub22).anInt4754)] * i_48_ >> 8;
			int i_49_ = -16 / ((-5 - i) / 47);
			if (((Class239) class239).anInt3362 > 0)
				i_48_ = (int) (Math.pow(0.5, ((double) ((Class239) class239).anInt3362 * ((double) ((Class246_Sub22) class246_sub22).anInt4768 * 1.953125E-5))) * (double) i_48_ + 0.5);
			if (((Class239) class239).aByteArray3363 != null) {
				int i_50_ = ((Class246_Sub22) class246_sub22).anInt4763;
				int i_51_ = (((Class239) class239).aByteArray3363[((Class246_Sub22) class246_sub22).anInt4767 + 1]);
				if ((((Class246_Sub22) class246_sub22).anInt4767 ^ 0xffffffff) > (((Class239) class239).aByteArray3363.length - 2 ^ 0xffffffff)) {
					int i_52_ = ((((Class239) class239).aByteArray3363[((Class246_Sub22) class246_sub22).anInt4767]) << 8 & 0xff00);
					int i_53_ = ((0xff & (((Class239) class239).aByteArray3363[2 + (((Class246_Sub22) class246_sub22).anInt4767)])) << 8);
					i_51_ += ((i_50_ - i_52_) * ((((Class239) class239).aByteArray3363[(((Class246_Sub22) class246_sub22).anInt4767 + 3)]) - i_51_) / (i_53_ - i_52_));
				}
				i_48_ = i_48_ * i_51_ + 32 >> 6;
			}
			if ((((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) < -1 && ((Class239) class239).aByteArray3366 != null) {
				int i_54_ = ((Class246_Sub22) class246_sub22).anInt4766;
				int i_55_ = (((Class239) class239).aByteArray3366[((Class246_Sub22) class246_sub22).anInt4750 + 1]);
				if (((Class239) class239).aByteArray3366.length - 2 > ((Class246_Sub22) class246_sub22).anInt4750) {
					int i_56_ = (((((Class239) class239).aByteArray3366[((Class246_Sub22) class246_sub22).anInt4750]) & 0xff) << 8);
					int i_57_ = ((0xff & (((Class239) class239).aByteArray3366[2 + (((Class246_Sub22) class246_sub22).anInt4750)])) << 8);
					i_55_ += ((((Class239) class239).aByteArray3366[((Class246_Sub22) class246_sub22).anInt4750 + 3]) - i_55_) * (-i_56_ + i_54_) / (i_57_ + -i_56_);
				}
				i_48_ = 32 + i_48_ * i_55_ >> 6;
			}
			return i_48_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.GA(" + (class246_sub22 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2511(boolean bool, int i, Class246_Sub22 class246_sub22) {
		try {
			anInt5947++;
			if (i != -1)
				method2501(null, false, 110, true);
			int i_58_ = (((Class246_Sub3_Sub1) ((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764).aByteArray6391).length;
			int i_59_;
			do {
				if (!bool || !((Class246_Sub3_Sub1) (((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764)).aBool6392) {
					i_59_ = (int) (((long) i_58_ * (long) (((Class246_Sub37_Sub1) this).anIntArray5924[(((Class246_Sub22) class246_sub22).anInt4754)])) >> 6);
					if (!client.f_ob)
						break;
				}
				int i_60_ = (-((Class246_Sub3_Sub1) (((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764)).anInt6390 + (i_58_ + i_58_));
				i_59_ = (int) (((long) i_60_ * (long) (((Class246_Sub37_Sub1) this).anIntArray5924[(((Class246_Sub22) class246_sub22).anInt4754)])) >> 6);
				i_58_ <<= 8;
				if (i_59_ >= i_58_) {
					i_59_ = -i_59_ - 1 + (i_58_ + i_58_);
					((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2774(true);
				}
			} while (false);
			((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2793(i_59_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.JA(" + bool + ',' + i + ',' + (class246_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2512(int i) {
		try {
			if (i != 0)
				method2254(null, -96, -80);
			anInt5916++;
			return anInt5930;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.BA(" + i + ')');
		}
	}

	final synchronized void method2513(byte i) {
		try {
			int i_61_ = 15 % ((52 - i) / 58);
			for (Class246_Sub34 class246_sub34 = (Class246_Sub34) aClass85_5926.first((byte) -23); class246_sub34 != null; class246_sub34 = (Class246_Sub34) aClass85_5926.next((byte) -20))
				class246_sub34.method2197(0);
			f_db++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.EA(" + i + ')');
		}
	}

	private final int method2514(Class246_Sub22 class246_sub22, int i) {
		try {
			f_bb++;
			if (i != 16384)
				method2524(null, null, -44, false, -16);
			int i_62_ = f_kb[((Class246_Sub22) class246_sub22).anInt4754];
			if ((i_62_ ^ 0xffffffff) <= -8193)
				return (16384 - (32 + (-i_62_ + 16384) * (-((Class246_Sub22) class246_sub22).anInt4762 + 128) >> 6));
			return (32 + i_62_ * ((Class246_Sub22) class246_sub22).anInt4762 >> 6);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.F(" + (class246_sub22 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final synchronized void method2515(int i) {
		try {
			if (i == 2) {
				f_fb++;
				method2518(true, true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.H(" + i + ')');
		}
	}

	final synchronized void method2516(byte i) {
		try {
			int i_63_ = 72 % ((-55 - i) / 57);
			for (Class246_Sub34 class246_sub34 = (Class246_Sub34) aClass85_5926.first((byte) -23); class246_sub34 != null; class246_sub34 = (Class246_Sub34) aClass85_5926.next((byte) -20))
				class246_sub34.unlink((byte) -67);
			f_cb++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.LA(" + i + ')');
		}
	}

	public static void method2517(int i) {
		try {
			aClass_l5943 = null;
			anIntArray5936 = null;
			if (i != -34)
				method2517(-85);
			anInterface6_5910 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.I(" + i + ')');
		}
	}

	private final synchronized void method2518(boolean bool, boolean bool_64_) {
		try {
			if (bool_64_ == true) {
				aClass158_5923.method1043();
				anInt5907++;
				aClass246_Sub24_5956 = null;
				method2520(87, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.T(" + bool + ',' + bool_64_ + ')');
		}
	}

	private final void method2519(boolean bool, int i) {
		try {
			anInt5912++;
			if (i < 0) {
				for (i = 0; i < 16; i++)
					method2519(bool, i);
			} else {
				anIntArray5913[i] = 12800;
				f_kb[i] = 8192;
				anIntArray5946[i] = 16383;
				anIntArray5933[i] = 8192;
				anIntArray5940[i] = 0;
				anIntArray5922[i] = 8192;
				method2526((byte) 77, i);
				method2521((byte) -10, i);
				((Class246_Sub37_Sub1) this).anIntArray5945[i] = 0;
				anIntArray5914[i] = 32767;
				anIntArray5949[i] = 256;
				((Class246_Sub37_Sub1) this).anIntArray5924[i] = 0;
				if (bool != false)
					method2502(-13, 34, (byte) 5);
				method2498(-44, i, 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.A(" + bool + ',' + i + ')');
		}
	}

	private final void method2520(int i, boolean bool) {
		try {
			if (!bool)
				method2504(true, -1);
			else
				method2496(-1, -1);
			anInt5928++;
			method2519(false, -1);
			if (i <= 77)
				aClass85_5926 = null;
			for (int i_65_ = 0; i_65_ < 16; i_65_++)
				anIntArray5915[i_65_] = anIntArray5906[i_65_];
			for (int i_66_ = 0; i_66_ < 16; i_66_++)
				f_mb[i_66_] = PacketsDecoder.method184(anIntArray5906[i_66_], -128);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.K(" + i + ',' + bool + ')');
		}
	}

	private final void method2521(byte i, int i_67_) {
		try {
			if (i != -10)
				method2498(34, -128, -108);
			if ((((Class246_Sub37_Sub1) this).anIntArray5945[i_67_] & 0x4 ^ 0xffffffff) != -1) {
				for (Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1104(124)); class246_sub22 != null; class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1108((byte) -112))) {
					if (((Class246_Sub22) class246_sub22).anInt4754 == i_67_)
						((Class246_Sub22) class246_sub22).anInt4761 = 0;
				}
			}
			anInt5917++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.V(" + i + ',' + i_67_ + ')');
		}
	}

	private final synchronized void method2522(int i, int i_68_, int i_69_) {
		do {
			try {
				anInt5918++;
				if (i_69_ >= 0)
					anIntArray5927[i_69_] = i;
				else {
					for (int i_70_ = 0; i_70_ < 16; i_70_++)
						anIntArray5927[i_70_] = i;
				}
				if (i_68_ <= -31)
					break;
				method2525(false, (byte) -70, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dv.PA(" + i + ',' + i_68_ + ',' + i_69_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized int method2258() {
		try {
			f_ib++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.C(" + ')');
		}
	}

	private final void method2523(int i, byte i_71_, int i_72_) {
		do {
			try {
				if ((anIntArray5915[i] ^ 0xffffffff) != (i_72_ ^ 0xffffffff)) {
					anIntArray5915[i] = i_72_;
					for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > -129; i_73_++)
						f_ub[i][i_73_] = null;
				}
				f_sb++;
				if (i_71_ > 36)
					break;
				anIntArray5913 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dv.NA(" + i + ',' + i_71_ + ',' + i_72_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized Class246_Sub37 method2256() {
		try {
			anInt5909++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.SA(" + ')');
		}
	}

	final boolean method2524(Class246_Sub22 class246_sub22, int[] is, int i, boolean bool, int i_74_) {
		try {
			anInt5934++;
			((Class246_Sub22) class246_sub22).anInt4748 = Class140.anInt2024 / 100;
			if (((Class246_Sub22) class246_sub22).anInt4766 >= 0 && ((((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756) == null || ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2782())) {
				class246_sub22.method2086(0);
				class246_sub22.unlink((byte) 123);
				if (((((Class246_Sub22) class246_sub22).anInt4753 ^ 0xffffffff) < -1) && ((f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753]) == class246_sub22))
					f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753] = null;
				return true;
			}
			int i_75_ = ((Class246_Sub22) class246_sub22).anInt4770;
			if (i_75_ > 0) {
				i_75_ -= (int) (16.0 * Math.pow(2.0, (4.921259842519685E-4 * (double) (anIntArray5922[(((Class246_Sub22) class246_sub22).anInt4754)]))) + 0.5);
				if ((i_75_ ^ 0xffffffff) > -1)
					i_75_ = 0;
				((Class246_Sub22) class246_sub22).anInt4770 = i_75_;
			}
			((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2787(method2529(bool, class246_sub22));
			Class239 class239 = ((Class246_Sub22) class246_sub22).aClass239_4760;
			((Class246_Sub22) class246_sub22).anInt4769++;
			((Class246_Sub22) class246_sub22).anInt4758 += ((Class239) class239).anInt3367;
			if (bool != true)
				method2500(89, -35, (byte) 93, -92);
			boolean bool_76_ = false;
			double d = ((double) (((((Class246_Sub22) class246_sub22).anInt4759 * ((Class246_Sub22) class246_sub22).anInt4770) >> 12) + ((-60 + ((Class246_Sub22) class246_sub22).anInt4752) << 8)) * 5.086263020833333E-6);
			if (((Class239) class239).anInt3362 > 0) {
				if ((((Class239) class239).anInt3364 ^ 0xffffffff) >= -1)
					((Class246_Sub22) class246_sub22).anInt4768 += 128;
				else
					((Class246_Sub22) class246_sub22).anInt4768 += (int) (Math.pow(2.0, (double) (((Class239) class239).anInt3364) * d) * 128.0 + 0.5);
				if ((((Class246_Sub22) class246_sub22).anInt4768 * ((Class239) class239).anInt3362) >= 819200)
					bool_76_ = true;
			}
			if (((Class239) class239).aByteArray3363 != null) {
				if (((Class239) class239).anInt3373 <= 0)
					((Class246_Sub22) class246_sub22).anInt4763 += 128;
				else
					((Class246_Sub22) class246_sub22).anInt4763 += (int) (0.5 + (Math.pow(2.0, (double) (((Class239) class239).anInt3373) * d) * 128.0));
				for (/**/; ((((Class246_Sub22) class246_sub22).anInt4767 < ((Class239) class239).aByteArray3363.length - 2) && (((Class246_Sub22) class246_sub22).anInt4763 > (0xff & (((Class239) class239).aByteArray3363[2 + (((Class246_Sub22) class246_sub22).anInt4767)])) << 8)); ((Class246_Sub22) class246_sub22).anInt4767 += 2) {
					/* empty */
				}
				if ((((Class239) class239).aByteArray3363.length - 2 == ((Class246_Sub22) class246_sub22).anInt4767) && ((((Class239) class239).aByteArray3363[1 + ((Class246_Sub22) class246_sub22).anInt4767]) == 0))
					bool_76_ = true;
			}
			if (((Class246_Sub22) class246_sub22).anInt4766 >= 0 && ((Class239) class239).aByteArray3366 != null && ((((Class246_Sub37_Sub1) this).anIntArray5945[((Class246_Sub22) class246_sub22).anInt4754]) & 0x1 ^ 0xffffffff) == -1 && (((((Class246_Sub22) class246_sub22).anInt4753 ^ 0xffffffff) > -1) || ((f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753]) != class246_sub22))) {
				if ((((Class239) class239).anInt3369 ^ 0xffffffff) < -1)
					((Class246_Sub22) class246_sub22).anInt4766 += (int) (0.5 + (128.0 * Math.pow(2.0, (double) (((Class239) class239).anInt3369) * d)));
				else
					((Class246_Sub22) class246_sub22).anInt4766 += 128;
				for (/**/; (((((Class239) class239).aByteArray3366.length - 2 ^ 0xffffffff) < (((Class246_Sub22) class246_sub22).anInt4750 ^ 0xffffffff)) && (((Class246_Sub22) class246_sub22).anInt4766 > (0xff & (((Class239) class239).aByteArray3366[2 + (((Class246_Sub22) class246_sub22).anInt4750)])) << 8)); ((Class246_Sub22) class246_sub22).anInt4750 += 2) {
					/* empty */
				}
				if ((((Class246_Sub22) class246_sub22).anInt4750 ^ 0xffffffff) == (-2 + ((Class239) class239).aByteArray3366.length ^ 0xffffffff))
					bool_76_ = true;
			}
			if (bool_76_) {
				((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2810(((Class246_Sub22) class246_sub22).anInt4748);
				if (is == null)
					((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2260(i);
				else
					((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2254(is, i_74_, i);
				if (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2807())
					((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass246_Sub37_Sub2_6884.method2626(((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756);
				class246_sub22.method2086(0);
				if ((((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) <= -1) {
					class246_sub22.unlink((byte) 96);
					if ((((Class246_Sub22) class246_sub22).anInt4753 ^ 0xffffffff) < -1 && (class246_sub22 == (f_ub[((Class246_Sub22) class246_sub22).anInt4754][(((Class246_Sub22) class246_sub22).anInt4753)])))
						f_ub[((Class246_Sub22) class246_sub22).anInt4754][((Class246_Sub22) class246_sub22).anInt4753] = null;
				}
				return true;
			}
			((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2800(((Class246_Sub22) class246_sub22).anInt4748, method2510(class246_sub22, (byte) -57), method2514(class246_sub22, 16384));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.FA(" + (class246_sub22 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_74_ + ')'));
		}
	}

	final synchronized void method2525(boolean bool, byte i, Class246_Sub24 class246_sub24) {
		do {
			try {
				method2501(class246_sub24, true, -18431, bool);
				f_qb++;
				if (i < -67)
					break;
				anInt5953 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dv.AA(" + bool + ',' + i + ',' + (class246_sub24 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method2526(byte i, int i_77_) {
		do {
			try {
				if ((0x2 & ((Class246_Sub37_Sub1) this).anIntArray5945[i_77_] ^ 0xffffffff) != -1) {
					for (Class246_Sub22 class246_sub22 = (Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1104(60); class246_sub22 != null; class246_sub22 = (Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1108((byte) -112)) {
						if ((((Class246_Sub22) class246_sub22).anInt4754 ^ 0xffffffff) == (i_77_ ^ 0xffffffff) && ((aClass246_Sub22ArrayArray5942[i_77_][((Class246_Sub22) class246_sub22).anInt4752]) == null) && ((Class246_Sub22) class246_sub22).anInt4766 < 0)
							((Class246_Sub22) class246_sub22).anInt4766 = 0;
					}
				}
				anInt5935++;
				if (i >= 51)
					break;
				method2516((byte) -47);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dv.J(" + i + ',' + i_77_ + ')');
			}
			break;
		} while (false);
	}

	final synchronized void method2254(int[] is, int i, int i_78_) {
		try {
			if (aClass158_5923.method1051()) {
				int i_79_ = (anInt5919 * ((Class158) aClass158_5923).anInt2253 / Class140.anInt2024);
				do {
					long l = (long) i_79_ * (long) i_78_ + aLong5952;
					if ((-l + aLong5955 ^ 0xffffffffffffffffL) <= -1L) {
						aLong5952 = l;
						break;
					}
					int i_80_ = (int) ((-1L + (aLong5955 + -aLong5952 + (long) i_79_)) / (long) i_79_);
					aLong5952 += (long) i_79_ * (long) i_80_;
					aClass246_Sub37_Sub4_5954.method2254(is, i, i_80_);
					i_78_ -= i_80_;
					i += i_80_;
					method2507((byte) -87);
				} while (aClass158_5923.method1051());
			}
			f_pb++;
			aClass246_Sub37_Sub4_5954.method2254(is, i, i_78_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.DA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_78_ + ')'));
		}
	}

	private final void method2527(boolean bool, int i, int i_81_, int i_82_) {
		try {
			anInt5937++;
			Class246_Sub22 class246_sub22 = aClass246_Sub22ArrayArray5942[i][i_82_];
			if (bool != false)
				anIntArray5949 = null;
			if (class246_sub22 != null) {
				aClass246_Sub22ArrayArray5942[i][i_82_] = null;
				if ((0x2 & ((Class246_Sub37_Sub1) this).anIntArray5945[i] ^ 0xffffffff) == -1)
					((Class246_Sub22) class246_sub22).anInt4766 = 0;
				else {
					for (Class246_Sub22 class246_sub22_83_ = (Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1104(42); class246_sub22_83_ != null; class246_sub22_83_ = (Class246_Sub22) ((Class246_Sub37_Sub4) aClass246_Sub37_Sub4_5954).aClass166_6882.method1108((byte) -112)) {
						if ((((Class246_Sub22) class246_sub22).anInt4754 == (((Class246_Sub22) class246_sub22_83_).anInt4754)) && (((Class246_Sub22) class246_sub22_83_).anInt4766 < 0) && class246_sub22_83_ != class246_sub22) {
							((Class246_Sub22) class246_sub22).anInt4766 = 0;
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.HA(" + bool + ',' + i + ',' + i_81_ + ',' + i_82_ + ')'));
		}
	}

	final synchronized void method2528(int i, int i_84_, int i_85_) {
		try {
			method2502(i_84_, i_85_, (byte) -57);
			if (i == -25296)
				f_jb++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.O(" + i + ',' + i_84_ + ',' + i_85_ + ')'));
		}
	}

	private final int method2529(boolean bool, Class246_Sub22 class246_sub22) {
		try {
			anInt5911++;
			int i = (((((Class246_Sub22) class246_sub22).anInt4770 * ((Class246_Sub22) class246_sub22).anInt4759) >> 12) + ((Class246_Sub22) class246_sub22).anInt4774);
			if (bool != true)
				method2260(38);
			i += ((-8192 + (anIntArray5933[((Class246_Sub22) class246_sub22).anInt4754])) * (anIntArray5949[((Class246_Sub22) class246_sub22).anInt4754])) >> 12;
			Class239 class239 = ((Class246_Sub22) class246_sub22).aClass239_4760;
			if (((Class239) class239).anInt3367 > 0 && ((((Class239) class239).anInt3368 ^ 0xffffffff) < -1 || ((anIntArray5940[((Class246_Sub22) class246_sub22).anInt4754]) ^ 0xffffffff) < -1)) {
				int i_86_ = ((Class239) class239).anInt3368 << 2;
				int i_87_ = ((Class239) class239).anInt3374 << 1;
				if (i_87_ > ((Class246_Sub22) class246_sub22).anInt4769)
					i_86_ = (((Class246_Sub22) class246_sub22).anInt4769 * i_86_ / i_87_);
				i_86_ += (anIntArray5940[((Class246_Sub22) class246_sub22).anInt4754]) >> 7;
				double d = Math.sin((double) (0x1ff & (((Class246_Sub22) class246_sub22).anInt4758)) * 0.01227184630308513);
				i += (int) (d * (double) i_86_);
			}
			int i_88_ = (int) (0.5 + ((double) (((Class246_Sub3_Sub1) (((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764)).anInt6393 * 256) * Math.pow(2.0, 3.255208333333333E-4 * (double) i) / (double) Class140.anInt2024));
			if (i_88_ < 1)
				return 1;
			return i_88_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.KA(" + bool + ',' + (class246_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2530(int i, byte i_89_, int i_90_) {
		try {
			if (i_89_ != 12)
				anIntArray5913 = null;
			anInt5931++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.G(" + i + ',' + i_89_ + ',' + i_90_ + ')'));
		}
	}

	final synchronized boolean method2531(int i, Class155 class155, boolean bool, Class_fs class_fs, Class246_Sub24 class246_sub24) {
		try {
			class246_sub24.method2113();
			anInt5948++;
			boolean bool_91_ = bool;
			int[] is = null;
			if (i > 0)
				is = new int[] { i };
			for (Class246_Sub14 class246_sub14 = (Class246_Sub14) ((Class246_Sub24) class246_sub24).aClass85_4876.first((byte) -23); class246_sub14 != null; class246_sub14 = (Class246_Sub14) ((Class246_Sub24) class246_sub24).aClass85_4876.next((byte) -20)) {
				int i_92_ = (int) ((Node) class246_sub14).hash;
				Class246_Sub34 class246_sub34 = ((Class246_Sub34) aClass85_5926.method544((long) i_92_, 123));
				if (class246_sub34 == null) {
					class246_sub34 = Class14.method146(i_92_, class_fs, 0);
					if (class246_sub34 == null) {
						bool_91_ = false;
						continue;
					}
					aClass85_5926.method547((long) i_92_, -2301, class246_sub34);
				}
				if (!class246_sub34.method2202(class155, 18621, ((Class246_Sub14) class246_sub14).aByteArray4436, is))
					bool_91_ = false;
			}
			if (bool_91_)
				class246_sub24.method2112();
			return bool_91_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dv.B(" + i + ',' + (class155 != null ? "{...}" : "null") + ',' + bool + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class246_sub24 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub37_Sub1() {
		anIntArray5913 = new int[16];
		anIntArray5906 = new int[16];
		anInt5930 = 256;
		((Class246_Sub37_Sub1) this).f_eb = new int[16];
		f_hb = new int[16];
		anIntArray5940 = new int[16];
		aClass246_Sub22ArrayArray5942 = new Class246_Sub22[16][128];
		anIntArray5914 = new int[16];
		f_kb = new int[16];
		anIntArray5927 = new int[16];
		f_mb = new int[16];
		anIntArray5933 = new int[16];
		f_ub = new Class246_Sub22[16][128];
		anIntArray5922 = new int[16];
		anIntArray5946 = new int[16];
		anIntArray5949 = new int[16];
		((Class246_Sub37_Sub1) this).anIntArray5945 = new int[16];
		aClass158_5923 = new Class158();
		aClass246_Sub37_Sub4_5954 = new Class246_Sub37_Sub4(this);
		try {
			aClass85_5926 = new Class85(128);
			method2522(256, -41, -1);
			method2520(114, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dv.<init>(" + ')');
		}
	}
}
