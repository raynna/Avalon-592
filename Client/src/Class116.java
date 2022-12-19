
/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class116 {
	static int anInt1607;
	private Class73 aClass73_1608;
	static Class169 aClass169_1609;
	static int anInt1610;
	static int anInt1611;
	static int anInt1612;
	static int anInt1613;
	static int anInt1614;
	static int anInt1615;
	static int anInt1616;
	static int anInt1617 = 0;
	static int anInt1618;
	static int anInt1619;
	static boolean aBool1620 = false;
	static int anInt1621;
	static int anInt1622;
	static int anInt1623;
	static int anInt1624;
	static int anInt1625;
	static int anInt1626;
	private Class260 aClass260_1627;
	static int anInt1628;

	final void method782(int i, int i_0_, int i_1_, String string, int i_2_, int i_3_, int i_4_) {
		try {
			anInt1621++;
			if (string != null) {
				method790(i_0_, (byte) 35, i_3_);
				int i_5_ = string.length();
				if (i_4_ > -124)
					aClass169_1609 = null;
				int[] is = new int[i_5_];
				int[] is_6_ = new int[i_5_];
				for (int i_7_ = 0; i_5_ > i_7_; i_7_++) {
					is[i_7_] = (int) (5.0 * Math.sin((double) i_2_ / 5.0 + (double) i_7_ / 5.0));
					is_6_[i_7_] = (int) (5.0 * Math.sin((double) i_2_ / 5.0 + (double) i_7_ / 3.0));
				}
				method788(null, i, -16777216, i_1_ - aClass73_1608.method459(-1, string) / 2, string, is, null, is_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.P(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (string != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final int method783(int i, int i_8_, int i_9_, int[] is, Class_l[] class_ls, int i_10_, Random random, String string, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int[] is_16_, int i_17_) {
		try {
			anInt1626++;
			if (string == null)
				return 0;
			random.setSeed((long) i_9_);
			int i_18_ = (random.nextInt() & 0x1f) + 192;
			method790(0xffffff & i_13_ | i_18_ << 24, (byte) -109, i_18_ << 24 | i_11_ & 0xffffff);
			int i_19_ = string.length();
			int[] is_20_ = new int[i_19_];
			int i_21_ = 0;
			if (i_15_ != -23980)
				return 123;
			for (int i_22_ = 0; i_19_ > i_22_; i_22_++) {
				is_20_[i_22_] = i_21_;
				if ((random.nextInt() & 0x3 ^ 0xffffffff) == -1)
					i_21_++;
			}
			int i_23_ = i_10_;
			int i_24_ = i_17_ - -((Class73) aClass73_1608).anInt951;
			int i_25_ = -1;
			if (i_14_ != 1) {
				if ((i_14_ ^ 0xffffffff) == -3)
					i_24_ = i_17_ - -i_8_ + -((Class73) aClass73_1608).anInt946;
			} else
				i_24_ += (-((Class73) aClass73_1608).anInt946 + i_8_ + -((Class73) aClass73_1608).anInt951) / 2;
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3) {
					i_25_ = (aClass73_1608.method459(i_15_ ^ 0x5dab, string) + i_21_);
					i_23_ += -i_25_ + i_12_;
				}
			} else {
				i_25_ = i_21_ + aClass73_1608.method459(i_15_ ^ 0x5dab, string);
				i_23_ += (i_12_ - i_25_) / 2;
			}
			method788(is, i_24_, -16777216, i_23_, string, is_20_, class_ls, null);
			if (is_16_ != null) {
				if (i_25_ == -1)
					i_25_ = (aClass73_1608.method459(i_15_ ^ 0x5dab, string) + i_21_);
				is_16_[1] = i_24_ - ((Class73) aClass73_1608).anInt951;
				is_16_[3] = (((Class73) aClass73_1608).anInt951 - -((Class73) aClass73_1608).anInt946);
				is_16_[2] = i_25_;
				is_16_[0] = i_23_;
			}
			return i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.F(" + i + ',' + i_8_ + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_10_ + ',' + (random != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + (is_16_ != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	final int method784(int i, int i_26_, int i_27_, Class_l[] class_ls, int[] is, boolean bool, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, String string, int i_33_, int i_34_, Class128 class128, int i_35_, int i_36_) {
		try {
			anInt1611++;
			if (string == null)
				return 0;
			method790(i_28_, (byte) -107, i_27_);
			if (i_29_ == 0)
				i_29_ = ((Class73) aClass73_1608).anInt955;
			int[] is_37_;
			if (i_26_ >= (((Class73) aClass73_1608).anInt946 + (((Class73) aClass73_1608).anInt951 - -i_29_)) || i_26_ >= i_29_ + i_29_)
				is_37_ = new int[] { i_36_ };
			else
				is_37_ = null;
			int i_38_ = aClass73_1608.method458(class_ls, is_37_, (byte) -96, Class246_Sub22.aStringArray4775, string);
			if (i_34_ == -1) {
				i_34_ = i_26_ / i_29_;
				if (i_34_ <= 0)
					i_34_ = 1;
			}
			if (i_34_ > 0 && i_34_ <= i_38_) {
				Class246_Sub22.aStringArray4775[i_34_ - 1] = aClass73_1608.method465(8364, class_ls, (Class246_Sub22.aStringArray4775[-1 + i_34_]), i_36_);
				i_38_ = i_34_;
			}
			if ((i_32_ ^ 0xffffffff) == -4 && (i_38_ ^ 0xffffffff) == -2)
				i_32_ = 1;
			int i_39_;
			if (i_32_ == 0)
				i_39_ = ((Class73) aClass73_1608).anInt951 + i_33_;
			else if ((i_32_ ^ 0xffffffff) == -2)
				i_39_ = ((-(i_29_ * (i_38_ - 1)) + (-((Class73) aClass73_1608).anInt946 + i_26_) + -((Class73) aClass73_1608).anInt951) / 2 + ((Class73) aClass73_1608).anInt951 + i_33_);
			else if (i_32_ != 2) {
				int i_40_ = ((-(i_29_ * (-1 + i_38_)) + (-((Class73) aClass73_1608).anInt951 + (i_26_ + -((Class73) aClass73_1608).anInt946))) / (i_38_ + 1));
				if (i_40_ < 0)
					i_40_ = 0;
				i_39_ = i_33_ - -((Class73) aClass73_1608).anInt951 + i_40_;
				i_29_ += i_40_;
			} else
				i_39_ = (-((i_38_ - 1) * i_29_) + -((Class73) aClass73_1608).anInt946 + i_26_ + i_33_);
			if (bool != false)
				aClass73_1608 = null;
			for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
				if (i_35_ != 0) {
					if ((i_35_ ^ 0xffffffff) != -2) {
						if ((i_35_ ^ 0xffffffff) != -3) {
							if (i_41_ != i_38_ - 1) {
								method796((Class246_Sub22.aStringArray4775[i_41_]), i_36_, (byte) -73);
								method798((Class246_Sub22.aStringArray4775[i_41_]), i_31_, is, i_30_, class_ls, i_39_, false, class128, i);
								Class59_Sub3_Sub3.anInt6284 = 0;
							} else
								method798((Class246_Sub22.aStringArray4775[i_41_]), i_31_, is, i_30_, class_ls, i_39_, false, class128, i);
						} else
							method798(Class246_Sub22.aStringArray4775[i_41_], i_31_, is, i_30_, class_ls, i_39_, bool, class128, i_36_ + i - (aClass73_1608.method459(-1, (Class246_Sub22.aStringArray4775[i_41_]))));
					} else
						method798(Class246_Sub22.aStringArray4775[i_41_], i_31_, is, i_30_, class_ls, i_39_, bool, class128, i + (-aClass73_1608.method459(-1, (Class246_Sub22.aStringArray4775[i_41_])) + i_36_) / 2);
				} else
					method798(Class246_Sub22.aStringArray4775[i_41_], i_31_, is, i_30_, class_ls, i_39_, false, class128, i);
				i_39_ += i_29_;
			}
			return i_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.L(" + i + ',' + i_26_ + ',' + i_27_ + ',' + (class_ls != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (string != null ? "{...}" : "null") + ',' + i_33_ + ',' + i_34_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	public static void method785(int i) {
		do {
			try {
				aClass169_1609 = null;
				if (i == 1)
					break;
				anInt1617 = -62;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "la.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method786(int i, String string, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		do {
			try {
				anInt1613++;
				if (string != null) {
					method790(i_46_, (byte) 105, i);
					int i_47_ = string.length();
					int[] is = new int[i_47_];
					for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff); i_48_++)
						is[i_48_] = (int) (5.0 * Math.sin((double) i_48_ / 2.0 + (double) i_45_ / 5.0));
					method788(null, i_43_, -16777216, i_44_ - aClass73_1608.method459(-1, string) / 2, string, null, null, is);
					if (i_42_ <= -12)
						break;
					aClass73_1608 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("la.Q(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void method787(char c, int i, int i_49_, int i_50_, boolean bool, Class128 class128, int i_51_, int i_52_);

	private final void method788(int[] is, int i, int i_53_, int i_54_, String string, int[] is_55_, Class_l[] class_ls, int[] is_56_) {
		try {
			i -= ((Class73) aClass73_1608).anInt955;
			anInt1615++;
			int i_57_ = -1;
			int i_58_ = -1;
			int i_59_ = 0;
			int i_60_ = string.length();
			if (i_53_ != -16777216)
				aClass260_1627 = null;
			int i_61_ = 0;
			for (/**/; i_60_ > i_61_; i_61_++) {
				char c = (char) (0xff & Class246_Sub1_Sub10.method2601(true, string.charAt(i_61_)));
				if ((c ^ 0xffffffff) == -61)
					i_57_ = i_61_;
				else {
					if ((c ^ 0xffffffff) == -63 && i_57_ != -1) {
						String string_62_ = string.substring(1 + i_57_, i_61_);
						i_57_ = -1;
						if (!string_62_.equals("lt")) {
							if (string_62_.equals("gt"))
								c = '>';
							else if (string_62_.equals("nbsp"))
								c = '\u00a0';
							else if (string_62_.equals("shy"))
								c = '\u00ad';
							else if (string_62_.equals("times"))
								c = '\u00d7';
							else if (string_62_.equals("euro"))
								c = '\u20ac';
							else if (!string_62_.equals("copy")) {
								if (string_62_.equals("reg"))
									c = '\u00ae';
								else {
									if (string_62_.startsWith("img=")) {
										try {
											int i_63_;
											if (is_55_ != null)
												i_63_ = is_55_[i_59_];
											else
												i_63_ = 0;
											int i_64_;
											if (is_56_ != null)
												i_64_ = is_56_[i_59_];
											else
												i_64_ = 0;
											i_59_++;
											int i_65_ = (Class104.method665(string_62_.substring(4), 10));
											Class_l class_l = class_ls[i_65_];
											int i_66_ = (is == null ? class_l.T() : is[i_65_]);
											class_l.r(i_63_ + i_54_, (-i_66_ + (((Class73) aClass73_1608).anInt955) + i - -i_64_), 1, 0, 1);
											i_58_ = -1;
											i_54_ += class_ls[i_65_].j();
										} catch (Exception exception) {
											/* empty */
										}
									} else
										method791(124, string_62_);
									continue;
								}
							} else
								c = '\u00a9';
						} else
							c = '<';
					}
					if ((i_57_ ^ 0xffffffff) == 0) {
						if (i_58_ != -1)
							i_54_ += aClass73_1608.method460((byte) -81, i_58_, c);
						int i_67_;
						if (is_55_ != null)
							i_67_ = is_55_[i_59_];
						else
							i_67_ = 0;
						int i_68_;
						if (is_56_ != null)
							i_68_ = is_56_[i_59_];
						else
							i_68_ = 0;
						if (c != 32) {
							if ((~0xffffff & Class246_Sub28_Sub31.anInt6919 ^ 0xffffffff) != -1)
								OA(c, i_67_ + i_54_ + 1, 1 + (i - -i_68_), Class246_Sub28_Sub31.anInt6919, true);
							OA(c, i_67_ + i_54_, i - -i_68_, Class99.anInt1294, false);
						} else if ((Class59_Sub3_Sub3.anInt6284 ^ 0xffffffff) < -1) {
							Class59_Sub4_Sub2.anInt6830 += Class59_Sub3_Sub3.anInt6284;
							i_54_ += Class59_Sub4_Sub2.anInt6830 >> 8;
							Class59_Sub4_Sub2.anInt6830 &= 0xff;
						}
						i_59_++;
						int i_69_ = aClass73_1608.method462(22148, c);
						if (Class165.anInt2340 != -1)
							aClass260_1627.method1697(i_69_, -127, i - -(int) (0.7 * (double) (((Class73) aClass73_1608).anInt955)), i_54_, Class165.anInt2340);
						if ((Class246_Sub11.anInt4091 ^ 0xffffffff) != 0)
							aClass260_1627.method1697(i_69_, i_53_ ^ 0xffff83, i + ((Class73) aClass73_1608).anInt955, i_54_, Class246_Sub11.anInt4091);
						i_54_ += i_69_;
						i_58_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.O(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_53_ + ',' + i_54_ + ',' + (string != null ? "{...}" : "null") + ',' + (is_55_ != null ? "{...}" : "null") + ',' + (class_ls != null ? "{...}" : "null") + ',' + (is_56_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int method789(Random random, Class_l[] class_ls, int i, int[] is, int i_70_, String string, int i_71_, int i_72_, int i_73_, int i_74_) {
		try {
			anInt1607++;
			if (string == null)
				return 0;
			random.setSeed((long) i_70_);
			int i_75_ = 192 - -(random.nextInt() & 0x1f);
			method790(i & 0xffffff | i_75_ << 24, (byte) 11, i_75_ << 24 | 0xffffff & i_72_);
			int i_76_ = string.length();
			int[] is_77_ = new int[i_76_];
			int i_78_ = 0;
			for (int i_79_ = i_71_; i_76_ > i_79_; i_79_++) {
				is_77_[i_79_] = i_78_;
				if ((0x3 & random.nextInt()) == 0)
					i_78_++;
			}
			method788(is, i_74_, -16777216, i_73_, string, is_77_, class_ls, null);
			return i_78_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.D(" + (random != null ? "{...}" : "null") + ',' + (class_ls != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_70_ + ',' + (string != null ? "{...}" : "null") + ',' + i_71_ + ',' + i_72_ + ',' + i_73_ + ',' + i_74_ + ')'));
		}
	}

	private final void method790(int i, byte i_80_, int i_81_) {
		try {
			Class59_Sub3_Sub3.anInt6284 = 0;
			Class246_Sub11.anInt4091 = -1;
			Class59_Sub4_Sub2.anInt6830 = 0;
			Class165.anInt2340 = -1;
			Class99.anInt1294 = Class64.anInt859 = i_81_;
			if (i == -1)
				i = 0;
			int i_82_ = 121 % ((i_80_ + 48) / 36);
			anInt1622++;
			Class246_Sub28_Sub31.anInt6919 = Class_fs.anInt143 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.J(" + i + ',' + i_80_ + ',' + i_81_ + ')'));
		}
	}

	private final void method791(int i, String string) {
		try {
			try {
				int i_83_ = -48 / ((65 - i) / 46);
				if (!string.startsWith("col=")) {
					if (string.equals("/col"))
						Class99.anInt1294 = (Class64.anInt859 & 0xffffff | Class99.anInt1294 & ~0xffffff);
				} else
					Class99.anInt1294 = (~0xffffff & Class99.anInt1294 | (0xffffff & Class207.method1363(16, -46, string.substring(4))));
				if (string.startsWith("argb="))
					Class99.anInt1294 = Class207.method1363(16, -56, string.substring(5));
				else if (string.equals("/argb"))
					Class99.anInt1294 = Class64.anInt859;
				else if (!string.startsWith("str=")) {
					if (string.equals("str"))
						Class165.anInt2340 = -8388608;
					else if (string.equals("/str"))
						Class165.anInt2340 = -1;
					else if (!string.startsWith("u=")) {
						if (string.equals("u"))
							Class246_Sub11.anInt4091 = -16777216;
						else if (string.equals("/u"))
							Class246_Sub11.anInt4091 = -1;
						else if (!string.equalsIgnoreCase("shad=-1")) {
							if (string.startsWith("shad="))
								Class246_Sub28_Sub31.anInt6919 = (Class207.method1363(16, -29, string.substring(5)) | ~0xffffff);
							else if (!string.equals("shad")) {
								if (string.equals("/shad"))
									Class246_Sub28_Sub31.anInt6919 = Class_fs.anInt143;
								else if (string.equals("br"))
									method790(Class_fs.anInt143, (byte) 72, Class64.anInt859);
							} else
								Class246_Sub28_Sub31.anInt6919 = -16777216;
						} else
							Class246_Sub28_Sub31.anInt6919 = 0;
					} else
						Class246_Sub11.anInt4091 = (Class207.method1363(16, -18, string.substring(2)) | ~0xffffff);
				} else
					Class165.anInt2340 = ~0xffffff | Class207.method1363(16, -54, string.substring(4));
			} catch (Exception exception) {
				/* empty */
			}
			anInt1628++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.K(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method792(int i, int i_84_, int i_85_, int i_86_, int i_87_, String string) {
		try {
			anInt1614++;
			if (string != null) {
				method790(i_87_, (byte) -87, i_84_);
				method798(string, i_85_, null, 0, null, i_86_, false, null, i - aClass73_1608.method459(-1, string) / 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.T(" + i + ',' + i_84_ + ',' + i_85_ + ',' + i_86_ + ',' + i_87_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method793(byte i, int[] is, int i_88_, Class_l[] class_ls, int i_89_, String string, int i_90_, int i_91_) {
		do {
			try {
				anInt1618++;
				if (string != null) {
					method790(i_88_, (byte) -109, i_89_);
					method798(string, 0, is, 0, class_ls, i_91_, false, null, i_90_);
					if (i < -97)
						break;
					aClass169_1609 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("la.H(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_88_ + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_89_ + ',' + (string != null ? "{...}" : "null") + ',' + i_90_ + ',' + i_91_ + ')'));
			}
			break;
		} while (false);
	}

	final void method794(int i, int i_92_, String string, int i_93_, int i_94_, int i_95_) {
		try {
			anInt1623++;
			if (string != null) {
				method790(i, (byte) 115, i_92_);
				method798(string, i_95_, null, 0, null, i_93_, false, null, i_94_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.I(" + i + ',' + i_92_ + ',' + (string != null ? "{...}" : "null") + ',' + i_93_ + ',' + i_94_ + ',' + i_95_ + ')'));
		}
	}

	final void method795(int i, boolean bool, String string, int i_96_, int i_97_, int i_98_) {
		try {
			anInt1610++;
			if (string != null) {
				method790(i, (byte) -95, i_97_);
				method798(string, 0, null, 0, null, i_96_, bool, null, i_98_ + -aClass73_1608.method459(-1, string));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.N(" + i + ',' + bool + ',' + (string != null ? "{...}" : "null") + ',' + i_96_ + ',' + i_97_ + ',' + i_98_ + ')'));
		}
	}

	private final void method796(String string, int i, byte i_99_) {
		do {
			try {
				anInt1616++;
				int i_100_ = 0;
				if (i_99_ >= -15)
					aBool1620 = true;
				boolean bool = false;
				for (int i_101_ = 0; (i_101_ ^ 0xffffffff) > (string.length() ^ 0xffffffff); i_101_++) {
					int i_102_ = string.charAt(i_101_);
					if ((i_102_ ^ 0xffffffff) != -61) {
						if (i_102_ != 62) {
							if (!bool && i_102_ == 32)
								i_100_++;
						} else
							bool = false;
					} else
						bool = true;
				}
				if ((i_100_ ^ 0xffffffff) >= -1)
					break;
				Class59_Sub3_Sub3.anInt6284 = (-aClass73_1608.method459(-1, string) + i << 8) / i_100_;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("la.S(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_99_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method797(int i, int i_103_) {
		try {
			anInt1612++;
			int i_104_ = 60 / ((i - 51) / 52);
			if (i_103_ == 16711935)
				return -1;
			return Class246_Sub26.method2115(0, i_103_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "la.R(" + i + ',' + i_103_ + ')');
		}
	}

	private final void method798(String string, int i, int[] is, int i_105_, Class_l[] class_ls, int i_106_, boolean bool, Class128 class128, int i_107_) {
		try {
			i_106_ -= ((Class73) aClass73_1608).anInt955;
			anInt1624++;
			int i_108_ = -1;
			int i_109_ = -1;
			int i_110_ = string.length();
			if (bool != false)
				method796(null, -122, (byte) -82);
			int i_111_ = 0;
			for (/**/; i_111_ < i_110_; i_111_++) {
				char c = (char) (Class246_Sub1_Sub10.method2601(true, string.charAt(i_111_)) & 0xff);
				if ((c ^ 0xffffffff) == -61)
					i_108_ = i_111_;
				else {
					if (c == 62 && i_108_ != -1) {
						String string_112_ = string.substring(i_108_ + 1, i_111_);
						i_108_ = -1;
						if (!string_112_.equals("lt")) {
							if (string_112_.equals("gt"))
								c = '>';
							else if (!string_112_.equals("nbsp")) {
								if (string_112_.equals("shy"))
									c = '\u00ad';
								else if (!string_112_.equals("times")) {
									if (!string_112_.equals("euro")) {
										if (string_112_.equals("copy"))
											c = '\u00a9';
										else if (string_112_.equals("reg"))
											c = '\u00ae';
										else {
											if (!string_112_.startsWith("img="))
												method791(115, string_112_);
											else {
												try {
													int i_113_ = (Class104.method665(string_112_.substring(4), 10));
													Class_l class_l = class_ls[i_113_];
													int i_114_ = (is == null ? class_l.T() : is[i_113_]);
													if ((~0xffffff & Class99.anInt1294) == -16777216)
														class_l.r(i_107_, (i_106_ - -(((Class73) aClass73_1608).anInt955) - i_114_), 1, 0, 1);
													else
														class_l.r(i_107_, (-i_114_ + (((Class73) aClass73_1608).anInt955) + i_106_), 0, (((Class99.anInt1294) & ~0xffffff) | 0xffffff), 1);
													i_109_ = -1;
													i_107_ += class_ls[i_113_].j();
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
									} else
										c = '\u20ac';
								} else
									c = '\u00d7';
							} else
								c = '\u00a0';
						} else
							c = '<';
					}
					if (i_108_ == -1) {
						if (i_109_ != -1)
							i_107_ += aClass73_1608.method460((byte) -61, i_109_, c);
						if (c != 32) {
							if (class128 != null) {
								if ((~0xffffff & Class246_Sub28_Sub31.anInt6919 ^ 0xffffffff) != -1)
									method787(c, 1 + i_107_, i_106_ + 1, Class246_Sub28_Sub31.anInt6919, true, class128, i, i_105_);
								method787(c, i_107_, i_106_, Class99.anInt1294, false, class128, i, i_105_);
							} else {
								if ((~0xffffff & Class246_Sub28_Sub31.anInt6919 ^ 0xffffffff) != -1)
									OA(c, 1 + i_107_, i_106_ + 1, Class246_Sub28_Sub31.anInt6919, true);
								OA(c, i_107_, i_106_, Class99.anInt1294, false);
							}
						} else if (Class59_Sub3_Sub3.anInt6284 > 0) {
							Class59_Sub4_Sub2.anInt6830 += Class59_Sub3_Sub3.anInt6284;
							i_107_ += Class59_Sub4_Sub2.anInt6830 >> 8;
							Class59_Sub4_Sub2.anInt6830 &= 0xff;
						}
						int i_115_ = aClass73_1608.method462(22148, c);
						if (Class165.anInt2340 != -1)
							aClass260_1627.method1697(i_115_, -127, (int) (0.7 * (double) (((Class73) aClass73_1608).anInt955)) + i_106_, i_107_, Class165.anInt2340);
						if ((Class246_Sub11.anInt4091 ^ 0xffffffff) != 0)
							aClass260_1627.method1697(i_115_, -127, (1 + ((Class73) aClass73_1608).anInt955 + i_106_), i_107_, Class246_Sub11.anInt4091);
						i_107_ += i_115_;
						i_109_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.E(" + (string != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_105_ + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_106_ + ',' + bool + ',' + (class128 != null ? "{...}" : "null") + ',' + i_107_ + ')'));
		}
	}

	final int method799(int i, int i_116_, Class_l[] class_ls, int i_117_, int i_118_, Class128 class128, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, String string, int[] is) {
		try {
			if (i_122_ != 0)
				return -89;
			anInt1625++;
			return method784(i_120_, i_123_, i_125_, class_ls, is, false, i, i_121_, i_116_, i_117_, i_126_, string, i_119_, 0, class128, i_118_, i_124_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.G(" + i + ',' + i_116_ + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_117_ + ',' + i_118_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i_119_ + ',' + i_120_ + ',' + i_121_ + ',' + i_122_ + ',' + i_123_ + ',' + i_124_ + ',' + i_125_ + ',' + i_126_ + ',' + (string != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void OA(char c, int i, int i_127_, int i_128_, boolean bool);

	Class116(Class260 class260, Class73 class73) {
		try {
			aClass73_1608 = class73;
			aClass260_1627 = class260;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class73 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method800(int i, int i_129_, int i_130_, String string, int i_131_, int i_132_, int i_133_, int i_134_) {
		try {
			anInt1619++;
			if (string != null) {
				method790(i, (byte) 102, i_129_);
				double d = -((double) i_134_ / 8.0) + 7.0;
				if (d < 0.0)
					d = 0.0;
				int i_135_ = string.length();
				int[] is = new int[i_135_];
				for (int i_136_ = 0; (i_135_ ^ 0xffffffff) < (i_136_ ^ 0xffffffff); i_136_++)
					is[i_136_] = (int) (Math.sin((double) i_136_ / 1.5 + (double) i_133_) * d);
				int i_137_ = -128 / ((i_131_ - 51) / 62);
				method788(null, i_130_, -16777216, i_132_ - aClass73_1608.method459(-1, string) / 2, string, null, null, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("la.M(" + i + ',' + i_129_ + ',' + i_130_ + ',' + (string != null ? "{...}" : "null") + ',' + i_131_ + ',' + i_132_ + ',' + i_133_ + ',' + i_134_ + ')'));
		}
	}

	static {
		aClass169_1609 = new Class169("", 16);
	}
}
