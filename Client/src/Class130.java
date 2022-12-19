/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class130 {
	static short[] aShortArray1813 = { 960, 957, -21568, -21571, 22464 };
	static Class67 aClass67_1814 = new Class67("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
	Class130 aClass130_1815;
	Class130 aClass130_1816;
	static Class6 aClass6_1817;
	static int anInt1818;
	static int anInt1819;
	static int anInt1820;
	static int anInt1821;

	public static void method884(boolean bool) {
		try {
			aShortArray1813 = null;
			if (bool != true)
				aClass6_1817 = null;
			aClass67_1814 = null;
			aClass6_1817 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "md.I(" + bool + ')');
		}
	}

	static final Class86[] method885(boolean bool) {
		try {
			anInt1821++;
			if (bool != true)
				return null;
			if (Class156.aClass86Array2236 == null) {
				Class86[] class86s = Class21_Sub3.method2076(Class108.aClass52_1535, 1034647426);
				Class86[] class86s_0_ = new Class86[class86s.length];
				int i = 0;
				while_32_: for (int i_1_ = 0; i_1_ < class86s.length; i_1_++) {
					Class86 class86 = class86s[i_1_];
					if ((((Class86) class86).anInt1141 <= 0 || ((Class86) class86).anInt1141 >= 24) && ((Class86) class86).anInt1137 >= 800 && ((Class86) class86).anInt1138 >= 600 && (Class40_Sub2.anInt4047 >= 96 || BufferStream.anInt5656 != 0 || (((Class86) class86).anInt1137 <= 1024 && (((Class86) class86).anInt1138 ^ 0xffffffff) >= -769))) {
						for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
							Class86 class86_3_ = class86s_0_[i_2_];
							if ((((Class86) class86).anInt1137 == ((Class86) class86_3_).anInt1137) && ((((Class86) class86_3_).anInt1138 ^ 0xffffffff) == (((Class86) class86).anInt1138 ^ 0xffffffff))) {
								if (((Class86) class86).anInt1141 > ((Class86) class86_3_).anInt1141)
									class86s_0_[i_2_] = class86;
								continue while_32_;
							}
						}
						class86s_0_[i] = class86;
						i++;
					}
				}
				Class156.aClass86Array2236 = new Class86[i];
				Class117.method807(class86s_0_, 0, Class156.aClass86Array2236, 0, i);
				int[] is = new int[Class156.aClass86Array2236.length];
				for (int i_4_ = 0; i_4_ < Class156.aClass86Array2236.length; i_4_++) {
					Class86 class86 = Class156.aClass86Array2236[i_4_];
					is[i_4_] = (((Class86) class86).anInt1137 * ((Class86) class86).anInt1138);
				}
				Class78.method495(Class156.aClass86Array2236, is, false);
			}
			return Class156.aClass86Array2236;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "md.H(" + bool + ')');
		}
	}

	final void method886(int i) {
		try {
			anInt1820++;
			if (i != 1024)
				method885(false);
			if (((Class130) this).aClass130_1816 != null) {
				((Class130) ((Class130) this).aClass130_1816).aClass130_1815 = ((Class130) this).aClass130_1815;
				((Class130) ((Class130) this).aClass130_1815).aClass130_1816 = ((Class130) this).aClass130_1816;
				((Class130) this).aClass130_1816 = null;
				((Class130) this).aClass130_1815 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "md.K(" + i + ')');
		}
	}

	public Class130() {
		/* empty */
	}

	static final void method887(int i) {
		do {
			try {
				anInt1818++;
				if ((Class246_Sub28_Sub27.aClass39_Sub1_6759.method2049(BufferStream.anInt5656, -79) ^ 0xffffffff) == -3) {
					if (i != -11572)
						method885(false);
					byte i_5_ = (byte) (0xff & -4 + Class64_Sub1.anInt5236);
					int i_6_ = Class64_Sub1.anInt5236 % Class38_Sub1_Sub1.anInt6770;
					for (int i_7_ = 0; i_7_ < 4; i_7_++) {
						for (int i_8_ = 0; ((Class152.anInt2205 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++)
							Class5.aByteArrayArrayArray56[i_7_][i_6_][i_8_] = i_5_;
					}
					if (Class246_Sub28_Sub24.anInt6681 != 3) {
						for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -3; i_9_++) {
							Class166.anIntArray2354[i_9_] = -1000000;
							Class246_Sub1_Sub3.anIntArray5715[i_9_] = 1000000;
							Class254.anIntArray3625[i_9_] = 0;
							Class29.anIntArray395[i_9_] = 1000000;
							Class173.anIntArray2442[i_9_] = 0;
						}
						if (Class130_Sub3.anInt4417 == 1) {
							if (((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060) >> 7][(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059) >> 7]) & 0x4 ^ 0xffffffff) != -1)
								Class166.method1099((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 >> 7), false, 32582, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 >> 7), 0, Class106.aClass147ArrayArrayArray1494);
							if (Class244.anInt3456 < 2560) {
								int i_10_ = Class246_Sub16.aInt92 >> 7;
								int i_11_ = Class259_Sub1.anInt4509 >> 7;
								int i_12_ = (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 >> 7);
								int i_13_ = (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 >> 7);
								int i_14_;
								if (i_12_ <= i_10_)
									i_14_ = i_10_ + -i_12_;
								else
									i_14_ = i_12_ + -i_10_;
								int i_15_;
								if ((i_13_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
									i_15_ = i_11_ - i_13_;
								else
									i_15_ = -i_11_ + i_13_;
								if (i_14_ == 0 && i_15_ == 0 || i_14_ <= -Class38_Sub1_Sub1.anInt6770 || (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) >= (i_14_ ^ 0xffffffff) || ((-Class152.anInt2205 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) || Class152.anInt2205 <= i_15_)
									Class194_Sub1.method1883(null, ("RC: " + i_10_ + "," + i_11_ + " " + i_12_ + "," + i_13_ + " " + Class39_Sub1.anInt4670 + "," + Class47.anInt686), -101);
								else if (i_14_ <= i_15_) {
									int i_16_ = 65536 * i_14_ / i_15_;
									int i_17_ = 32768;
									while ((i_11_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) {
										if ((i_13_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
											if ((i_11_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
												i_11_--;
										} else
											i_11_++;
										if ((0x4 & (Class45.aByteArrayArrayArray648[(Class246_Sub28_Sub24.anInt6681)][i_10_][i_11_])) != 0) {
											Class166.method1099(i_10_, false, 32582, i_11_, 1, (Class106.aClass147ArrayArrayArray1494));
											break;
										}
										i_17_ += i_16_;
										if ((i_17_ ^ 0xffffffff) <= -65537) {
											if (i_10_ < i_12_)
												i_10_++;
											else if (i_10_ > i_12_)
												i_10_--;
											i_17_ -= 65536;
											if (((Class45.aByteArrayArrayArray648[(Class246_Sub28_Sub24.anInt6681)][i_10_][i_11_]) & 0x4 ^ 0xffffffff) != -1) {
												Class166.method1099(i_10_, false, 32582, i_11_, 1, (Class106.aClass147ArrayArrayArray1494));
												break;
											}
										}
									}
								} else {
									int i_18_ = i_15_ * 65536 / i_14_;
									int i_19_ = 32768;
									while ((i_10_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff)) {
										if (i_12_ > i_10_)
											i_10_++;
										else if ((i_12_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff))
											i_10_--;
										if (((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_10_][i_11_]) & 0x4 ^ 0xffffffff) != -1) {
											Class166.method1099(i_10_, false, i ^ ~0x5275, i_11_, 1, (Class106.aClass147ArrayArrayArray1494));
											break;
										}
										i_19_ += i_18_;
										if (i_19_ >= 65536) {
											i_19_ -= 65536;
											if (i_13_ <= i_11_) {
												if (i_11_ > i_13_)
													i_11_--;
											} else
												i_11_++;
											if (((0x4 & (Class45.aByteArrayArrayArray648[(Class246_Sub28_Sub24.anInt6681)][i_10_][i_11_])) ^ 0xffffffff) != -1) {
												Class166.method1099(i_10_, false, i ^ ~0x5275, i_11_, 1, (Class106.aClass147ArrayArrayArray1494));
												break;
											}
										}
									}
								}
							}
						} else {
							int i_20_ = Class6.getAverageHeight(Class246_Sub16.aInt92, i + 11474, (Class246_Sub28_Sub24.anInt6681), Class259_Sub1.anInt4509);
							if ((i_20_ + -Class246_Sub28_Sub8.anInt6077 ^ 0xffffffff) <= -801 || ((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][Class246_Sub16.aInt92 >> 7][Class259_Sub1.anInt4509 >> 7]) & 0x4 ^ 0xffffffff) == -1)
								break;
							Class166.method1099(Class246_Sub16.aInt92 >> 7, false, i + 44154, Class259_Sub1.anInt4509 >> 7, 1, Class106.aClass147ArrayArrayArray1494);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "md.J(" + i + ')');
			}
			break;
		} while (false);
	}
}
