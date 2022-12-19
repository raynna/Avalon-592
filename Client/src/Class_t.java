
/* Class_t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class Class_t {
	static int anInt1428;
	static int anInt1429;
	static int anInt1430;
	static boolean aBool1431 = false;
	static int anInt1432;
	static int anInt1433;
	static int anInt1434;
	static int anInt1435;
	static int anInt1436;
	static int anInt1437;
	static int anInt1438;
	static int anInt1439;
	static IncomingPacket SEND_SKILLS_IN;
	static int[][] anIntArrayArray1441;
	static int anInt1442;

	abstract void method671(Class_c class_c, Class130_Sub5 class130_sub5, int i, int i_0_);

	abstract void Z(int i);

	abstract Class19[] method672();

	static final Class102 method673(int i, boolean bool, Component component) {
		try {
			anInt1432++;
			int i_1_ = 65 % ((11 - i) / 58);
			return new Class102_Sub1(component, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.DA(" + i + ',' + bool + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	abstract int MA();

	final void method674(int i, int i_2_, boolean bool, int i_3_, int i_4_, Class246_Sub1_Sub17 class246_sub1_sub17, Class246_Sub1_Sub17 class246_sub1_sub17_5_, int i_6_, int i_7_) {
		try {
			anInt1428++;
			if (i_3_ != -1 && w()) {
				Class72 class72 = (((Class246_Sub1_Sub17) class246_sub1_sub17).aClass72Array6741[i_3_]);
				Class246_Sub26 class246_sub26 = ((Class72) class72).aClass246_Sub26_932;
				Class72 class72_8_ = null;
				if (class246_sub1_sub17_5_ != null) {
					class72_8_ = (((Class246_Sub1_Sub17) class246_sub1_sub17_5_).aClass72Array6741[i_4_]);
					if (((Class72) class72_8_).aClass246_Sub26_932 != class246_sub26)
						class72_8_ = null;
				}
				method687(class72_8_, null, class246_sub26, i_6_, bool, i, -1707, class72, false, i_2_, 65535, null);
				if (i_7_ != 0)
					anInt1442 = -119;
				j();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.KA(" + i + ',' + i_2_ + ',' + bool + ',' + i_3_ + ',' + i_4_ + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ',' + (class246_sub1_sub17_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method675(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class210 class210, int i_13_, int i_14_, int i_15_) {
		do {
			try {
				anInt1434++;
				boolean bool = false;
				boolean bool_16_ = false;
				boolean bool_17_ = false;
				if (i != 16384)
					anInt1429 = 101;
				int i_18_ = -i_13_ / 2;
				int i_19_ = -i_11_ / 2;
				int i_20_ = class210.a(i_18_ + i_9_, i_19_ + i_10_);
				int i_21_ = i_13_ / 2;
				int i_22_ = -i_11_ / 2;
				int i_23_ = class210.a(i_21_ + i_9_, i_22_ + i_10_);
				int i_24_ = -i_13_ / 2;
				int i_25_ = i_11_ / 2;
				int i_26_ = class210.a(i_24_ + i_9_, i_10_ + i_25_);
				int i_27_ = i_13_ / 2;
				int i_28_ = i_11_ / 2;
				int i_29_ = class210.a(i_9_ - -i_27_, i_28_ + i_10_);
				int i_30_ = ((i_23_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff) ? i_20_ : i_23_);
				int i_31_ = i_26_ >= i_29_ ? i_29_ : i_26_;
				int i_32_ = i_23_ >= i_29_ ? i_29_ : i_23_;
				int i_33_ = i_26_ > i_20_ ? i_20_ : i_26_;
				if (i_11_ != 0) {
					int i_34_ = (0x3fff & (int) (2607.5945876176133 * Math.atan2((double) (i_30_ + -i_31_), (double) i_11_)));
					if (i_34_ != 0) {
						if (i_12_ != 0) {
							if (i_34_ > 8192) {
								int i_35_ = 16384 - i_12_;
								if (i_35_ > i_34_)
									i_34_ = i_35_;
							} else if ((i_34_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff))
								i_34_ = i_12_;
						}
						Z(i_34_);
					}
				}
				int i_36_ = i_20_ + i_29_;
				if ((i_13_ ^ 0xffffffff) != -1) {
					int i_37_ = 0x3fff & (int) (Math.atan2((double) (-i_32_ + i_33_), (double) i_13_) * 2607.5945876176133);
					if (i_37_ != 0) {
						if ((i_14_ ^ 0xffffffff) != -1) {
							if (i_37_ <= 8192) {
								if (i_37_ > i_14_)
									i_37_ = i_14_;
							} else {
								int i_38_ = -i_14_ + 16384;
								if ((i_37_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff))
									i_37_ = i_38_;
							}
						}
						R(i_37_);
					}
				}
				if ((i_36_ ^ 0xffffffff) < (i_23_ + i_26_ ^ 0xffffffff))
					i_36_ = i_23_ + i_26_;
				i_36_ = -i_15_ + (i_36_ >> 1);
				if (i_36_ == 0)
					break;
				JA(0, i_36_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.FA(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + (class210 != null ? "{...}" : "null") + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	abstract int PA();

	abstract void JA(int i, int i_39_, int i_40_);

	abstract void E(int i);

	abstract Class162[] method676();

	abstract void method677();

	abstract void IA();

	abstract Class_t method678(byte i, int i_41_, boolean bool);

	private final void method679(int i, int[] is, int i_42_, int i_43_, int i_44_, boolean bool, int i_45_, int[] is_46_, int i_47_, int i_48_) {
		try {
			if (i_45_ != 3)
				UA(-15);
			anInt1438++;
			if ((i_44_ ^ 0xffffffff) != -2) {
				if ((i_44_ ^ 0xffffffff) == -3) {
					if ((i ^ 0xffffffff) == -1 || (i ^ 0xffffffff) == -2) {
						i_42_ = -i_42_;
						i_48_ = -i_48_;
					} else if ((i ^ 0xffffffff) == -3) {
						i_42_ = -i_42_ & 0x3fff;
						i_48_ = 0x3fff & -i_48_;
					}
				} else if ((i_44_ ^ 0xffffffff) == -4) {
					if (i != 0 && i != 1) {
						if (i == 3) {
							int i_49_ = i_48_;
							i_48_ = i_42_;
							i_42_ = i_49_;
						} else if (i == 2) {
							int i_50_ = i_48_;
							i_48_ = 0x3fff & i_42_;
							i_42_ = 0x3fff & -i_50_;
						}
					} else {
						int i_51_ = i_48_;
						i_48_ = -i_42_;
						i_42_ = i_51_;
					}
				}
			} else if ((i ^ 0xffffffff) == -1 || i == 1) {
				int i_52_ = -i_48_;
				i_48_ = i_42_;
				i_42_ = i_52_;
			} else if ((i ^ 0xffffffff) != -4) {
				if (i == 2) {
					int i_53_ = i_48_;
					i_48_ = -i_42_ & 0x3fff;
					i_42_ = i_53_ & 0x3fff;
				}
			} else {
				int i_54_ = i_48_;
				i_48_ = i_42_;
				i_42_ = i_54_;
			}
			if (i_43_ != 65535)
				M(i, is_46_, i_48_, i_47_, i_42_, bool, i_43_, is);
			else
				XA(i, is_46_, i_48_, i_47_, i_42_, i_44_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.W(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + bool + ',' + i_45_ + ',' + (is_46_ != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	abstract void method680(Class_c class_c, Class130_Sub5 class130_sub5, int i);

	abstract void XA(int i, int[] is, int i_55_, int i_56_, int i_57_, int i_58_, boolean bool);

	abstract int l();

	abstract void M(int i, int[] is, int i_59_, int i_60_, int i_61_, boolean bool, int i_62_, int[] is_63_);

	abstract Class246_Sub1_Sub4 fa(Class246_Sub1_Sub4 class246_sub1_sub4);

	abstract int P();

	abstract boolean method681();

	abstract int HA();

	abstract void method682(Class_t class_t_64_, int i, int i_65_, int i_66_, boolean bool);

	abstract int NA();

	abstract int m();

	abstract void BA(short i, short i_67_);

	abstract void R(int i);

	final void method683(int i, int i_68_, Class246_Sub1_Sub17 class246_sub1_sub17) {
		do {
			try {
				anInt1436++;
				if (i_68_ != -1 && w()) {
					Class72 class72 = (((Class246_Sub1_Sub17) class246_sub1_sub17).aClass72Array6741[i_68_]);
					Class246_Sub26 class246_sub26 = ((Class72) class72).aClass246_Sub26_932;
					for (int i_69_ = 0; ((Class72) class72).anInt940 > i_69_; i_69_++) {
						short i_70_ = ((Class72) class72).aShortArray936[i_69_];
						if (((Class246_Sub26) class246_sub26).aBoolArray4884[i_70_]) {
							if (((Class72) class72).aShortArray935[i_69_] != -1)
								N(0, 0, 0, 0);
							N((((Class246_Sub26) class246_sub26).anIntArray4882[i_70_]), ((Class72) class72).aShortArray930[i_69_], ((Class72) class72).aShortArray934[i_69_], ((Class72) class72).aShortArray943[i_69_]);
						}
					}
					j();
					if (i == -5561)
						break;
					method687(null, null, null, 91, true, 12, 122, null, false, 73, -73, null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.V(" + i + ',' + i_68_ + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	abstract void method684(int i, int i_71_, int i_72_, int i_73_);

	abstract void c(int i);

	abstract void h(int i, int i_74_, Class210 class210, Class210 class210_75_, int i_76_, int i_77_, int i_78_);

	abstract void aa(int i);

	abstract boolean method685(int i, int i_79_, Class_c class_c, boolean bool);

	static final void method686(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		do {
			try {
				do {
					if (i_85_ < Class197.anInt2818 || i_85_ > Class110.anInt1573 || (Class197.anInt2818 ^ 0xffffffff) < (i_83_ ^ 0xffffffff) || Class110.anInt1573 < i_83_ || (Class197.anInt2818 ^ 0xffffffff) < (i_80_ ^ 0xffffffff) || (Class110.anInt1573 ^ 0xffffffff) > (i_80_ ^ 0xffffffff) || (Class197.anInt2818 ^ 0xffffffff) < (i ^ 0xffffffff) || (Class110.anInt1573 ^ 0xffffffff) > (i ^ 0xffffffff) || anInt1442 > i_87_ || i_87_ > Class109_Sub4.anInt4570 || (i_81_ ^ 0xffffffff) > (anInt1442 ^ 0xffffffff) || ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i_81_ ^ 0xffffffff)) || (anInt1442 ^ 0xffffffff) < (i_84_ ^ 0xffffffff) || (i_84_ ^ 0xffffffff) < (Class109_Sub4.anInt4570 ^ 0xffffffff) || (i_82_ ^ 0xffffffff) > (anInt1442 ^ 0xffffffff) || Class109_Sub4.anInt4570 < i_82_) {
						Class59_Sub2.method2019(i, i_86_, i_83_, i_84_, i_85_, i_81_, (byte) 72, i_82_, i_80_, i_87_);
						if (!client.f_ob)
							break;
					}
					Class_e.method592(i_87_, i_86_, i_82_, i_88_ ^ 0x1d, i_81_, i_84_, i, i_83_, i_85_, i_80_);
				} while (false);
				anInt1433++;
				if (i_88_ == -1)
					break;
				anInt1439 = 67;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("t.LA(" + i + ',' + i_80_ + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ',' + i_84_ + ',' + i_85_ + ',' + i_86_ + ',' + i_87_ + ',' + i_88_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void UA(int i);

	abstract void H(int i, int i_89_, int i_90_);

	public Class_t() {
		/* empty */
	}

	abstract void Q(int i);

	private final void method687(Class72 class72, boolean[] bools, Class246_Sub26 class246_sub26, int i, boolean bool, int i_91_, int i_92_, Class72 class72_93_, boolean bool_94_, int i_95_, int i_96_, int[] is) {
		try {
			anInt1435++;
			if (class72 == null || i == 0) {
				for (int i_97_ = 0; i_97_ < ((Class72) class72_93_).anInt940; i_97_++) {
					short i_98_ = ((Class72) class72_93_).aShortArray936[i_97_];
					if (bools == null || !bools[i_98_] == !bool_94_ || (((Class246_Sub26) class246_sub26).anIntArray4882[i_98_]) == 0) {
						short i_99_ = ((Class72) class72_93_).aShortArray935[i_97_];
						if (i_99_ != -1)
							method679(0, is, 0, (((Class246_Sub26) class246_sub26).anIntArray4886[i_99_]) & i_96_, i_91_, bool, 3, (((Class246_Sub26) class246_sub26).anIntArrayArray4888[i_99_]), 0, 0);
						method679((((Class246_Sub26) class246_sub26).anIntArray4882[i_98_]), is, ((Class72) class72_93_).aShortArray943[i_97_], i_96_ & (((Class246_Sub26) class246_sub26).anIntArray4886[i_98_]), i_91_, bool, i_92_ ^ ~0x6a9, (((Class246_Sub26) class246_sub26).anIntArrayArray4888[i_98_]), ((Class72) class72_93_).aShortArray934[i_97_], ((Class72) class72_93_).aShortArray930[i_97_]);
					}
				}
			} else {
				int i_100_ = 0;
				if (i_92_ != -1707)
					anInt1439 = -4;
				int i_101_ = 0;
				for (int i_102_ = 0; ((((Class246_Sub26) class246_sub26).anInt4880 ^ 0xffffffff) < (i_102_ ^ 0xffffffff)); i_102_++) {
					boolean bool_103_ = false;
					if (((i_100_ ^ 0xffffffff) > (((Class72) class72_93_).anInt940 ^ 0xffffffff)) && (i_102_ == ((Class72) class72_93_).aShortArray936[i_100_]))
						bool_103_ = true;
					boolean bool_104_ = false;
					if (((((Class72) class72).anInt940 ^ 0xffffffff) < (i_101_ ^ 0xffffffff)) && (((Class72) class72).aShortArray936[i_101_] == i_102_))
						bool_104_ = true;
					if (bool_103_ || bool_104_) {
						if (bools != null && bools[i_102_] != bool_94_ && (((Class246_Sub26) class246_sub26).anIntArray4882[i_102_]) != 0) {
							if (bool_104_)
								i_101_++;
							if (bool_103_)
								i_100_++;
						} else {
							int i_105_ = 0;
							int i_106_ = (((Class246_Sub26) class246_sub26).anIntArray4882[i_102_]);
							if (i_106_ == 3 || (i_106_ ^ 0xffffffff) == -11)
								i_105_ = 128;
							byte i_107_;
							int i_108_;
							int i_109_;
							short i_110_;
							int i_111_;
							if (bool_103_) {
								i_111_ = (((Class72) class72_93_).aShortArray934[i_100_]);
								i_107_ = (((Class72) class72_93_).aByteArray941[i_100_]);
								i_109_ = (((Class72) class72_93_).aShortArray943[i_100_]);
								i_110_ = (((Class72) class72_93_).aShortArray935[i_100_]);
								i_108_ = (((Class72) class72_93_).aShortArray930[i_100_]);
								i_100_++;
							} else {
								i_107_ = (byte) 0;
								i_108_ = i_105_;
								i_109_ = i_105_;
								i_110_ = (short) -1;
								i_111_ = i_105_;
							}
							short i_112_;
							int i_113_;
							int i_114_;
							int i_115_;
							byte i_116_;
							if (!bool_104_) {
								i_116_ = (byte) 0;
								i_114_ = i_105_;
								i_112_ = (short) -1;
								i_115_ = i_105_;
								i_113_ = i_105_;
							} else {
								i_112_ = (((Class72) class72).aShortArray935[i_101_]);
								i_113_ = (((Class72) class72).aShortArray943[i_101_]);
								i_114_ = (((Class72) class72).aShortArray934[i_101_]);
								i_115_ = (((Class72) class72).aShortArray930[i_101_]);
								i_116_ = (((Class72) class72).aByteArray941[i_101_]);
								i_101_++;
							}
							if (i_110_ == -1) {
								if (i_112_ != -1)
									method679(0, is, 0, i_96_ & (((Class246_Sub26) class246_sub26).anIntArray4886[i_112_]), i_91_, bool, 3, (((Class246_Sub26) class246_sub26).anIntArrayArray4888[i_112_]), 0, 0);
							} else
								method679(0, is, 0, (((Class246_Sub26) class246_sub26).anIntArray4886[i_110_]) & i_96_, i_91_, bool, i_92_ ^ ~0x6a9, (((Class246_Sub26) class246_sub26).anIntArrayArray4888[i_110_]), 0, 0);
							int i_117_;
							int i_118_;
							int i_119_;
							if ((i_107_ & 0x2 ^ 0xffffffff) == -1 && (i_116_ & 0x1 ^ 0xffffffff) == -1) {
								if ((i_106_ ^ 0xffffffff) == -3) {
									int i_120_ = 0x3fff & i_115_ + -i_108_;
									int i_121_ = 0x3fff & i_114_ + -i_111_;
									if ((i_120_ ^ 0xffffffff) <= -8193)
										i_120_ -= 16384;
									int i_122_ = 0x3fff & -i_109_ + i_113_;
									if (i_121_ >= 8192)
										i_121_ -= 16384;
									i_118_ = i_108_ + i_120_ * i / i_95_ & 0x3fff;
									if ((i_122_ ^ 0xffffffff) <= -8193)
										i_122_ -= 16384;
									i_117_ = 0x3fff & i_111_ + i * i_121_ / i_95_;
									i_119_ = i_109_ + i_122_ * i / i_95_ & 0x3fff;
								} else if ((i_106_ ^ 0xffffffff) == -10) {
									int i_123_ = 0x3fff & i_115_ + -i_108_;
									if ((i_123_ ^ 0xffffffff) <= -8193)
										i_123_ -= 16384;
									i_117_ = i_119_ = 0;
									i_118_ = 0x3fff & i_123_ * i / i_95_ + i_108_;
								} else if ((i_106_ ^ 0xffffffff) == -8) {
									int i_124_ = 0x3f & -i_108_ + i_115_;
									if (i_124_ >= 32)
										i_124_ -= 64;
									i_117_ = i_111_ + (i * (-i_111_ + i_114_) / i_95_);
									i_119_ = (i * (i_113_ - i_109_) / i_95_ + i_109_);
									i_118_ = 0x3f & i_124_ * i / i_95_ + i_108_;
								} else {
									i_119_ = i_109_ + (i * (-i_109_ + i_113_) / i_95_);
									i_117_ = i_111_ - -((-i_111_ + i_114_) * i / i_95_);
									i_118_ = i_108_ - -((-i_108_ + i_115_) * i / i_95_);
								}
							} else {
								i_117_ = i_111_;
								i_118_ = i_108_;
								i_119_ = i_109_;
							}
							method679(i_106_, is, i_119_, (((Class246_Sub26) class246_sub26).anIntArray4886[i_102_]) & i_96_, i_91_, bool, 3, (((Class246_Sub26) class246_sub26).anIntArrayArray4888[i_102_]), i_117_, i_118_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.AA(" + (class72 != null ? "{...}" : "null") + ',' + (bools != null ? "{...}" : "null") + ',' + (class246_sub26 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_91_ + ',' + i_92_ + ',' + (class72_93_ != null ? "{...}" : "null") + ',' + bool_94_ + ',' + i_95_ + ',' + i_96_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void I(short i, short i_125_);

	final void method688(int i, Class246_Sub1_Sub17 class246_sub1_sub17, int[] is, boolean bool, int i_126_, int i_127_, int i_128_, int i_129_, Class246_Sub1_Sub17 class246_sub1_sub17_130_, int i_131_, int i_132_) {
		try {
			anInt1430++;
			if ((i_127_ ^ 0xffffffff) != 0 && w()) {
				Class72 class72 = (((Class246_Sub1_Sub17) class246_sub1_sub17_130_).aClass72Array6741[i_127_]);
				Class246_Sub26 class246_sub26 = ((Class72) class72).aClass246_Sub26_932;
				int i_133_ = 10 % ((83 - i_128_) / 43);
				Class72 class72_134_ = null;
				if (class246_sub1_sub17 != null) {
					class72_134_ = (((Class246_Sub1_Sub17) class246_sub1_sub17).aClass72Array6741[i]);
					if (((Class72) class72_134_).aClass246_Sub26_932 != class246_sub26)
						class72_134_ = null;
				}
				method687(class72_134_, null, class246_sub26, i_131_, bool, i_126_, -1707, class72, false, i_129_, i_132_, is);
				j();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.CA(" + i + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_126_ + ',' + i_127_ + ',' + i_128_ + ',' + i_129_ + ',' + (class246_sub1_sub17_130_ != null ? "{...}" : "null") + ',' + i_131_ + ',' + i_132_ + ')'));
		}
	}

	abstract int WA();

	abstract int D();

	abstract boolean w();

	abstract void j();

	abstract int U();

	public static void method689(byte i) {
		try {
			anIntArrayArray1441 = null;
			if (i != 55)
				method689((byte) -2);
			SEND_SKILLS_IN = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "t.OA(" + i + ')');
		}
	}

	abstract void N(int i, int i_135_, int i_136_, int i_137_);

	final void method690(int i, int i_138_, Class246_Sub1_Sub17 class246_sub1_sub17, boolean bool, int i_139_, int i_140_, int i_141_, Class246_Sub1_Sub17 class246_sub1_sub17_142_, Class246_Sub1_Sub17 class246_sub1_sub17_143_, int i_144_, boolean[] bools, Class246_Sub1_Sub17 class246_sub1_sub17_145_, int i_146_, int i_147_, int i_148_) {
		try {
			anInt1437++;
			if (i != -1) {
				if (i_148_ > -60)
					anIntArrayArray1441 = null;
				if (bools == null || i_141_ == -1)
					method674(0, i_138_, bool, i, i_147_, class246_sub1_sub17_143_, class246_sub1_sub17_145_, i_146_, 0);
				else if (w()) {
					Class72 class72 = (((Class246_Sub1_Sub17) class246_sub1_sub17_143_).aClass72Array6741[i]);
					Class246_Sub26 class246_sub26 = ((Class72) class72).aClass246_Sub26_932;
					Class72 class72_149_ = null;
					if (class246_sub1_sub17_145_ != null) {
						class72_149_ = (((Class246_Sub1_Sub17) class246_sub1_sub17_145_).aClass72Array6741[i_147_]);
						if (((Class72) class72_149_).aClass246_Sub26_932 != class246_sub26)
							class72_149_ = null;
					}
					method687(class72_149_, bools, class246_sub26, i_146_, bool, 0, -1707, class72, false, i_138_, 65535, null);
					Class72 class72_150_ = (((Class246_Sub1_Sub17) class246_sub1_sub17_142_).aClass72Array6741[i_141_]);
					Class72 class72_151_ = null;
					if (class246_sub1_sub17 != null) {
						class72_151_ = (((Class246_Sub1_Sub17) class246_sub1_sub17).aClass72Array6741[i_144_]);
						if (class246_sub26 != ((Class72) class72_151_).aClass246_Sub26_932)
							class72_151_ = null;
					}
					XA(0, new int[0], 0, 0, 0, 0, bool);
					method687(class72_151_, bools, ((Class72) class72_150_).aClass246_Sub26_932, i_140_, bool, 0, -1707, class72_150_, true, i_139_, 65535, null);
					j();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("t.GA(" + i + ',' + i_138_ + ',' + (class246_sub1_sub17 != null ? "{...}" : "null") + ',' + bool + ',' + i_139_ + ',' + i_140_ + ',' + i_141_ + ',' + (class246_sub1_sub17_142_ != null ? "{...}" : "null") + ',' + (class246_sub1_sub17_143_ != null ? "{...}" : "null") + ',' + i_144_ + ',' + (bools != null ? "{...}" : "null") + ',' + (class246_sub1_sub17_145_ != null ? "{...}" : "null") + ',' + i_146_ + ',' + i_147_ + ',' + i_148_ + ')'));
		}
	}

	static {
		anInt1429 = 0;
		new Class67("You will be un-muted within 24 hours.", "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.", "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.", "O veto ser\u00e1 retirado dentro de 24 horas.");
		SEND_SKILLS_IN = new IncomingPacket(9, 6);
		anInt1442 = 0;
	}
}
