
/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class162 {
	int anInt2289;
	int anInt2290;
	Class_c aClass_c2291;
	int anInt2292;
	static int anInt2293;
	int anInt2294;
	static int anInt2295;
	Class162 aClass162_2296;
	static IncomingPacket OPEN_INTERFACE_IN = new IncomingPacket(22, 9);
	static int anInt2298;
	static int anInt2299;
	static int anInt2300;
	int anInt2301;
	static IncomingPacket aClass13_2302 = new IncomingPacket(10, 12);
	static int anInt2303;

	public static void method1072(byte i) {
		try {
			aClass13_2302 = null;
			if (i >= -78)
				OPEN_INTERFACE_IN = null;
			OPEN_INTERFACE_IN = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pf.E(" + i + ')');
		}
	}

	static final void method1073(Class100 class100, Class147 class147) {
		if (((Class147) class147).aBool2171) {
			int i = ((Class147) class147).aShort2161;
			int i_0_ = ((Class147) class147).aShort2157;
			byte i_1_ = ((Class147) class147).aByte2175;
			byte i_2_ = ((Class147) class147).aByte2174;
			int i_3_ = (i << Class126.anInt1781) + Class40_Sub7.anInt5174;
			int i_4_ = (i_0_ << Class126.anInt1781) + Class40_Sub7.anInt5174;
			Class147[][] class147s = Class106.aClass147ArrayArrayArray1494[i_1_];
			float f;
			if (Class154.aClass210Array2215 == Class59_Sub3_Sub4.aClass210Array6993) {
				Class259_Sub3.aClass260_5357.GA(Class246_Sub28_Sub3.aClass210Array5899[0].a(i_3_, i_4_), Actor.method2672(i, i_0_), Class133.method899(i, i_0_), Class59_Sub4_Sub1.method2638(i, i_0_));
				f = 251.5F;
			} else
				f = 201.5F - 50.0F * (float) (i_2_ + 1);
			Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
			if (((Class147) class147).aBool2166) {
				if (Class81.aBool1068) {
					if (i_1_ > 0) {
						Class147 class147_5_ = (Class106.aClass147ArrayArrayArray1494[i_1_ - 1][i][i_0_]);
						if (class147_5_ != null && ((Class147) class147_5_).aBool2171)
							return;
					}
					if (i <= Class244.anInt3454 && i > Class56.anInt796) {
						Class147 class147_6_ = class147s[i - 1][i_0_];
						if (class147_6_ != null && ((Class147) class147_6_).aBool2171 && (((Class147) class147_6_).aBool2166 || ((((Class147) class147).aByte2168 & 0x1) == 0)))
							return;
					}
					if (i >= Class244.anInt3454 && i < Class188.anInt2662 - 1) {
						Class147 class147_7_ = class147s[i + 1][i_0_];
						if (class147_7_ != null && ((Class147) class147_7_).aBool2171 && (((Class147) class147_7_).aBool2166 || ((((Class147) class147).aByte2168 & 0x4) == 0)))
							return;
					}
					if (i_0_ <= Class59_Sub2_Sub2.anInt6025 && i_0_ > Class133.anInt1834) {
						Class147 class147_8_ = class147s[i][i_0_ - 1];
						if (class147_8_ != null && ((Class147) class147_8_).aBool2171 && (((Class147) class147_8_).aBool2166 || ((((Class147) class147).aByte2168 & 0x8) == 0)))
							return;
					}
					if (i_0_ >= Class59_Sub2_Sub2.anInt6025 && i_0_ < Class246_Sub1_Sub10.f_db - 1) {
						Class147 class147_9_ = class147s[i][i_0_ + 1];
						if (class147_9_ != null && ((Class147) class147_9_).aBool2171 && (((Class147) class147_9_).aBool2166 || ((((Class147) class147).aByte2168 & 0x2) == 0)))
							return;
					}
				} else
					Class81.aBool1068 = true;
				((Class147) class147).aBool2166 = false;
				if (((Class147) class147).aClass147_2165 != null) {
					Class147 class147_10_ = ((Class147) class147).aClass147_2165;
					Class259_Sub3.aClass260_5357.g(3000.0F, (201.5F - 50.0F * (float) ((((Class147) class147_10_).aByte2174) + 1)) * 1.5F);
					if (!Class246_Sub13.method1988((((Class147) class147_10_).aByte2174), i, i_0_))
						Class59_Sub3_Sub4.aClass210Array6993[((Class147) class147_10_).aByte2174].method1383(i, i_0_);
					Class59_Sub4 class59_sub4 = ((Class147) class147_10_).aClass59_Sub4_2172;
					if (class59_sub4 != null) {
						if (Class246_Sub28_Sub25.aBool6705) {
							if ((((Class59_Sub4) class59_sub4).anInt5185 & ((Class147) class147).aShort2164) != 0)
								Class163.method1079(class100, ((Class59_Sub4) class59_sub4).anInt5185, i_2_, i, i_0_);
							else
								Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						class59_sub4.method407(Class259_Sub3.aClass260_5357, -103);
					}
					for (Class3 class3 = ((Class147) class147_10_).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
						Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
						if (class59_sub3 != null) {
							if (Class246_Sub28_Sub25.aBool6705) {
								Class246_Sub22.method2081(class100, i_1_, i, i_0_);
								Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
							}
							class59_sub3.method407(Class259_Sub3.aClass260_5357, -97);
						}
					}
					Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
				}
				boolean bool = !Class246_Sub13.method1988(i_2_, i, i_0_);
				if (bool) {
					Class59_Sub3_Sub4.aClass210Array6993[i_2_].method1383(i, i_0_);
					Class59_Sub1 class59_sub1 = ((Class147) class147).aClass59_Sub1_2156;
					if (class59_sub1 != null && ((Class59_Sub1) class59_sub1).aBool4512) {
						if (((Class59_Sub1) class59_sub1).aBool4516)
							Class259_Sub3.aClass260_5357.g(3000.0F, (f + 50.0F - 1.5F) * 1.5F);
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub1.method407((Class259_Sub3.aClass260_5357), -114);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub1;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(76, class130_sub3);
						}
						if (((Class59_Sub1) class59_sub1).aBool4516)
							Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
					}
				}
				int i_11_ = 0;
				int i_12_ = 0;
				Class59_Sub4 class59_sub4 = ((Class147) class147).aClass59_Sub4_2172;
				Class59_Sub2 class59_sub2 = ((Class147) class147).aClass59_Sub2_2153;
				if (class59_sub4 != null || class59_sub2 != null) {
					if (Class244.anInt3454 == i)
						i_11_++;
					else if (Class244.anInt3454 < i)
						i_11_ += 2;
					if (Class59_Sub2_Sub2.anInt6025 == i_0_)
						i_11_ += 3;
					else if (Class59_Sub2_Sub2.anInt6025 > i_0_)
						i_11_ += 6;
					i_12_ = Class246_Sub29.anIntArray4982[i_11_];
					((Class147) class147).aShort2164 = Class246_Sub1_Sub8_Sub1.aShortArray7164[i_11_];
				}
				if (class59_sub4 != null) {
					if ((((Class59_Sub4) class59_sub4).anInt5185 & Class246_Sub15.anIntArray4443[i_11_]) != 0) {
						if (((Class59_Sub4) class59_sub4).anInt5185 == 16) {
							((Class147) class147).aByte2162 = (byte) 3;
							((Class147) class147).aByte2170 = Class193.aByteArray2714[i_11_];
							((Class147) class147).aByte2169 = (byte) (3 - ((Class147) class147).aByte2170);
						} else if (((Class59_Sub4) class59_sub4).anInt5185 == 32) {
							((Class147) class147).aByte2162 = (byte) 6;
							((Class147) class147).aByte2170 = Class40_Sub9.aByteArray5494[i_11_];
							((Class147) class147).aByte2169 = (byte) (6 - ((Class147) class147).aByte2170);
						} else if (((Class59_Sub4) class59_sub4).anInt5185 == 64) {
							((Class147) class147).aByte2162 = (byte) 12;
							((Class147) class147).aByte2170 = Class40_Sub3.aByteArray4070[i_11_];
							((Class147) class147).aByte2169 = (byte) (12 - ((Class147) class147).aByte2170);
						} else {
							((Class147) class147).aByte2162 = (byte) 9;
							((Class147) class147).aByte2170 = Class247.aByteArray3476[i_11_];
							((Class147) class147).aByte2169 = (byte) (9 - ((Class147) class147).aByte2170);
						}
					} else
						((Class147) class147).aByte2162 = (byte) 0;
					if ((((Class59_Sub4) class59_sub4).anInt5185 & i_12_) != 0 && !Class102_Sub1.method2004(i_2_, i, i_0_, (((Class59_Sub4) class59_sub4).anInt5185))) {
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub4.method407((Class259_Sub3.aClass260_5357), -128);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub4;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(65, class130_sub3);
						}
					}
					Class59_Sub4 class59_sub4_13_ = ((Class147) class147).aClass59_Sub4_2152;
					if (class59_sub4_13_ != null && (((Class59_Sub4) class59_sub4_13_).anInt5185 & i_12_) != 0 && !Class102_Sub1.method2004(i_2_, i, i_0_, (((Class59_Sub4) class59_sub4_13_).anInt5185))) {
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub4_13_.method407((Class259_Sub3.aClass260_5357), -99);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub4_13_;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(-128, class130_sub3);
						}
					}
				}
				if (class59_sub2 != null && !(Class246_Sub28_Sub29.method2818(i_2_, i, i_0_, class59_sub2.method2023(false)))) {
					Class59_Sub2 class59_sub2_14_ = ((Class147) class147).aClass59_Sub2_2159;
					Class259_Sub3.aClass260_5357.g(3000.0F, (f - 0.5F) * 1.5F);
					if ((((Class59_Sub2) class59_sub2).anInt4549 & i_12_) != 0) {
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub2.method407((Class259_Sub3.aClass260_5357), -117);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(117, class130_sub3);
						}
					} else if (((Class59_Sub2) class59_sub2).anInt4549 == 256) {
						int i_15_ = (((Class59_Sub2) class59_sub2).anInt4563 - Class246_Sub1_Sub10.anInt6199);
						int i_16_ = (((Class59_Sub2) class59_sub2).anInt4542 - Class111.anInt1576);
						int i_17_ = ((Class59_Sub2) class59_sub2).anInt4556;
						int i_18_;
						if (i_17_ == 1 || i_17_ == 2)
							i_18_ = -i_15_;
						else
							i_18_ = i_15_;
						int i_19_;
						if (i_17_ == 2 || i_17_ == 3)
							i_19_ = -i_16_;
						else
							i_19_ = i_16_;
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						if (i_19_ < i_18_) {
							Class130_Sub3 class130_sub3 = class59_sub2.method407((Class259_Sub3.aClass260_5357), -118);
							if (class130_sub3 != null) {
								((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2;
								((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
								((Class130_Sub3) class130_sub3).anInt4411 = i;
								((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
								Class246_Sub2.aClass68_3814.method438(-114, class130_sub3);
							}
						} else if (class59_sub2_14_ != null) {
							Class130_Sub3 class130_sub3 = class59_sub2_14_.method407((Class259_Sub3.aClass260_5357), -118);
							if (class130_sub3 != null) {
								((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2_14_;
								((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
								((Class130_Sub3) class130_sub3).anInt4411 = i;
								((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
								Class246_Sub2.aClass68_3814.method438(36, class130_sub3);
							}
						}
					}
					Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
				}
				if (bool) {
					Class59_Sub1 class59_sub1 = ((Class147) class147).aClass59_Sub1_2156;
					if (class59_sub1 != null && !((Class59_Sub1) class59_sub1).aBool4512) {
						if (((Class59_Sub1) class59_sub1).aBool4516)
							Class259_Sub3.aClass260_5357.g(3000.0F, (f + 50.0F - 1.5F) * 1.5F);
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub1.method407((Class259_Sub3.aClass260_5357), -113);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub1;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(-117, class130_sub3);
						}
						if (((Class59_Sub1) class59_sub1).aBool4516)
							Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
					}
					Class59_Sub5 class59_sub5 = ((Class147) class147).aClass59_Sub5_2158;
					if (class59_sub5 != null && !((Class59_Sub5) class59_sub5).aBool5404) {
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub5.method407((Class259_Sub3.aClass260_5357), -127);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub5;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(-120, class130_sub3);
						}
					}
				}
				byte i_20_ = ((Class147) class147).aByte2168;
				if (i_20_ != 0) {
					if (i < Class244.anInt3454 && (i_20_ & 0x4) != 0) {
						Class147 class147_21_ = class147s[i + 1][i_0_];
						if (class147_21_ != null && ((Class147) class147_21_).aBool2171)
							Class245.aClass106_3462.method727(class147_21_, 0);
					}
					if (i_0_ < Class59_Sub2_Sub2.anInt6025 && (i_20_ & 0x2) != 0) {
						Class147 class147_22_ = class147s[i][i_0_ + 1];
						if (class147_22_ != null && ((Class147) class147_22_).aBool2171)
							Class245.aClass106_3462.method727(class147_22_, 0);
					}
					if (i > Class244.anInt3454 && (i_20_ & 0x1) != 0) {
						Class147 class147_23_ = class147s[i - 1][i_0_];
						if (class147_23_ != null && ((Class147) class147_23_).aBool2171)
							Class245.aClass106_3462.method727(class147_23_, 0);
					}
					if (i_0_ > Class59_Sub2_Sub2.anInt6025 && (i_20_ & 0x8) != 0) {
						Class147 class147_24_ = class147s[i][i_0_ - 1];
						if (class147_24_ != null && ((Class147) class147_24_).aBool2171)
							Class245.aClass106_3462.method727(class147_24_, 0);
					}
				}
			}
			if (((Class147) class147).aByte2162 != 0) {
				boolean bool = true;
				for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
					if ((((Class59_Sub3) ((Class3) class3).aClass59_Sub3_24).anInt5056) != Class76.anInt997 && ((((Class3) class3).anInt31 & ((Class147) class147).aByte2162) == ((Class147) class147).aByte2170)) {
						bool = false;
						break;
					}
				}
				if (bool) {
					Class59_Sub4 class59_sub4 = ((Class147) class147).aClass59_Sub4_2172;
					if (!Class102_Sub1.method2004(i_2_, i, i_0_, ((Class59_Sub4) class59_sub4).anInt5185)) {
						if (Class246_Sub28_Sub25.aBool6705) {
							do {
								if (((Class59_Sub4) class59_sub4).anInt5185 >= 16) {
									int i_25_ = i - Class244.anInt3454;
									int i_26_ = i_0_ - Class59_Sub2_Sub2.anInt6025;
									if (((Class59_Sub4) class59_sub4).anInt5185 == 16) {
										i_25_ -= Class40_Sub7.anInt5174;
										i_26_ += Class40_Sub7.anInt5174;
										if (i_26_ < i_25_ && i > 0 && i_0_ <= Class_t_Sub1.f_sc) {
											Class246_Sub22.method2081(class100, i_1_, i - 1, (i_0_ + 1));
											break;
										}
									} else if ((((Class59_Sub4) class59_sub4).anInt5185) == 32) {
										i_25_ += Class40_Sub7.anInt5174;
										i_26_ += Class40_Sub7.anInt5174;
										if (i_26_ < -i_25_ && i < Class240.anInt3377 && i_0_ < Class_t_Sub1.f_sc) {
											Class246_Sub22.method2081(class100, i_1_, i + 1, (i_0_ + 1));
											break;
										}
									} else if ((((Class59_Sub4) class59_sub4).anInt5185) == 64) {
										i_25_ += Class40_Sub7.anInt5174;
										i_26_ -= Class40_Sub7.anInt5174;
										if (i_26_ > i_25_ && i < Class240.anInt3377 && i_0_ > 0) {
											Class246_Sub22.method2081(class100, i_1_, i + 1, (i_0_ - 1));
											break;
										}
									} else if ((((Class59_Sub4) class59_sub4).anInt5185) == 128) {
										i_25_ -= Class40_Sub7.anInt5174;
										i_26_ -= Class40_Sub7.anInt5174;
										if (i_26_ > -i_25_ && i > 0 && i_0_ > 0) {
											Class246_Sub22.method2081(class100, i_1_, i - 1, (i_0_ - 1));
											break;
										}
									}
								}
								Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							} while (false);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub4.method407((Class259_Sub3.aClass260_5357), -91);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub4;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(-124, class130_sub3);
						}
					}
					((Class147) class147).aByte2162 = (byte) 0;
				}
			}
			if (((Class147) class147).aBool2167) {
				try {
					((Class147) class147).aBool2167 = false;
					int i_27_ = 0;
					while_174_: for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
						Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
						if (((Class59_Sub3) class59_sub3).anInt5056 != Class76.anInt997) {
							for (int i_28_ = (((Class59_Sub3) class59_sub3).aShort5057); (i_28_ <= ((Class59_Sub3) class59_sub3).aShort5065); i_28_++) {
								for (int i_29_ = (((Class59_Sub3) class59_sub3).aShort5064); i_29_ <= (((Class59_Sub3) class59_sub3).aShort5062); i_29_++) {
									Class147 class147_30_ = class147s[i_28_][i_29_];
									if (((Class147) class147_30_).aBool2166) {
										((Class147) class147).aBool2167 = true;
										continue while_174_;
									}
									if (((Class147) class147_30_).aByte2162 != 0) {
										int i_31_ = 0;
										if (i_28_ > (((Class59_Sub3) class59_sub3).aShort5057))
											i_31_++;
										if (i_28_ < (((Class59_Sub3) class59_sub3).aShort5065))
											i_31_ += 4;
										if (i_29_ > (((Class59_Sub3) class59_sub3).aShort5064))
											i_31_ += 8;
										if (i_29_ < (((Class59_Sub3) class59_sub3).aShort5062))
											i_31_ += 2;
										if ((i_31_ & (((Class147) class147_30_).aByte2162)) == (((Class147) class147).aByte2169)) {
											((Class147) class147).aBool2167 = true;
											continue while_174_;
										}
									}
								}
							}
							int i_32_ = (Class244.anInt3454 - ((Class59_Sub3) class59_sub3).aShort5057);
							int i_33_ = (((Class59_Sub3) class59_sub3).aShort5065 - Class244.anInt3454);
							if (i_33_ > i_32_)
								i_32_ = i_33_;
							int i_34_ = (Class59_Sub2_Sub2.anInt6025 - ((Class59_Sub3) class59_sub3).aShort5064);
							int i_35_ = (((Class59_Sub3) class59_sub3).aShort5062 - Class59_Sub2_Sub2.anInt6025);
							if (i_35_ > i_34_)
								i_34_ = i_35_;
							((Class100) class100).aClass59_Sub3Array1295[i_27_] = class59_sub3;
							((Class100) class100).anIntArray1299[i_27_++] = i_32_ + i_34_;
						}
					}
					while (i_27_ > 0) {
						int i_36_ = -50;
						int i_37_ = -1;
						for (int i_38_ = 0; i_38_ < i_27_; i_38_++) {
							Class59_Sub3 class59_sub3 = (((Class100) class100).aClass59_Sub3Array1295[i_38_]);
							if (((Class59_Sub3) class59_sub3).anInt5056 != Class76.anInt997) {
								int i_39_ = (((Class100) class100).anIntArray1299[i_38_]);
								if (i_39_ > i_36_) {
									i_36_ = i_39_;
									i_37_ = i_38_;
								} else if (i_39_ == i_36_) {
									int i_40_ = ((((Class59_Sub3) class59_sub3).anInt5060) - Class246_Sub1_Sub10.anInt6199);
									int i_41_ = ((((Class59_Sub3) class59_sub3).anInt5059) - Class111.anInt1576);
									int i_42_ = ((((Class59_Sub3) (((Class100) class100).aClass59_Sub3Array1295[i_37_])).anInt5060) - Class246_Sub1_Sub10.anInt6199);
									int i_43_ = (((Class59_Sub3) (((Class100) class100).aClass59_Sub3Array1295[i_37_])).anInt5059 - Class111.anInt1576);
									if (i_40_ * i_40_ + i_41_ * i_41_ > i_42_ * i_42_ + i_43_ * i_43_)
										i_37_ = i_38_;
								}
							}
						}
						if (i_37_ == -1)
							break;
						Class59_Sub3 class59_sub3 = (((Class100) class100).aClass59_Sub3Array1295[i_37_]);
						((Class59_Sub3) class59_sub3).anInt5056 = Class76.anInt997;
						if (!Class_u_Sub1.method2419(i_2_, ((Class59_Sub3) class59_sub3).aShort5057, ((Class59_Sub3) class59_sub3).aShort5065, ((Class59_Sub3) class59_sub3).aShort5064, ((Class59_Sub3) class59_sub3).aShort5062, class59_sub3.method2168(-25430))) {
							if (Class246_Sub28_Sub25.aBool6705) {
								if (((Class59_Sub3) class59_sub3).aByte5055 != 0) {
									Class246_Sub22.method2081(class100, i_1_, i, i_0_);
									int i_44_ = i - Class244.anInt3454;
									int i_45_ = i_0_ - Class59_Sub2_Sub2.anInt6025;
									if (((Class59_Sub3) class59_sub3).aByte5055 == 2) {
										if (i_45_ > -i_44_)
											Class193.method1268(class100, i_1_, i, i_0_ - 1, i - 1, i_0_);
										else
											Class193.method1268(class100, i_1_, i, i_0_ + 1, i + 1, i_0_);
									} else if (i_45_ > i_44_)
										Class193.method1268(class100, i_1_, i, i_0_ - 1, i + 1, i_0_);
									else
										Class193.method1268(class100, i_1_, i, i_0_ + 1, i - 1, i_0_);
								} else
									Class246_Sub32.method2165(class100, i_1_, (((Class59_Sub3) class59_sub3).aShort5057), (((Class59_Sub3) class59_sub3).aShort5064), (((Class59_Sub3) class59_sub3).aShort5065), (((Class59_Sub3) class59_sub3).aShort5062));
								Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
							}
							Class130_Sub3 class130_sub3 = class59_sub3.method407((Class259_Sub3.aClass260_5357), -128);
							if (class130_sub3 != null) {
								((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub3;
								((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
								((Class130_Sub3) class130_sub3).anInt4411 = ((Class59_Sub3) class59_sub3).aShort5057;
								((Class130_Sub3) class130_sub3).anInt4410 = ((Class59_Sub3) class59_sub3).aShort5064;
								Class246_Sub2.aClass68_3814.method438(-128, class130_sub3);
							}
						}
						for (int i_46_ = ((Class59_Sub3) class59_sub3).aShort5057; i_46_ <= ((Class59_Sub3) class59_sub3).aShort5065; i_46_++) {
							for (int i_47_ = (((Class59_Sub3) class59_sub3).aShort5064); (i_47_ <= ((Class59_Sub3) class59_sub3).aShort5062); i_47_++) {
								Class147 class147_48_ = class147s[i_46_][i_47_];
								if (((Class147) class147_48_).aByte2162 != 0)
									Class245.aClass106_3462.method727(class147_48_, 0);
								else if ((i_46_ != i || i_47_ != i_0_) && (((Class147) class147_48_).aBool2171))
									Class245.aClass106_3462.method727(class147_48_, 0);
							}
						}
					}
					if (((Class147) class147).aBool2167)
						return;
				} catch (Exception exception) {
					((Class147) class147).aBool2167 = false;
				}
			}
			if (((Class147) class147).aClass129_2173 != null && (((Class147) class147).aByte2154 == (byte) (Class38_Sub1_Sub1.anInt6768 & 0xff))) {
				Class129 class129 = ((Class147) class147).aClass129_2173;
				int i_49_ = Class59_Sub3_Sub4.aClass210Array6993[i_1_].l(i, i_0_);
				int i_50_;
				if (i_1_ < Class154_Sub1.anInt4803 - 1)
					i_50_ = (Class59_Sub3_Sub4.aClass210Array6993[i_1_].l(i, i_0_) - Class59_Sub3_Sub4.aClass210Array6993[i_1_ + 1].l(i, i_0_));
				else
					i_50_ = 8 << Class126.anInt1781;
				Class140.aClass_c2007.method585(i_3_, i_49_, i_4_, (((Class100) class100).anIntArray1304));
				int i_51_ = ((Class100) class100).anIntArray1304[2];
				Class140.aClass_c2007.method585(i_3_, i_49_ - i_50_, i_4_, (((Class100) class100).anIntArray1304));
				int i_52_ = ((Class100) class100).anIntArray1304[2];
				int i_53_ = i_51_;
				int i_54_ = i_52_;
				if (i_51_ > i_52_) {
					i_53_ = i_52_;
					i_54_ = i_51_;
				}
				i_53_ -= Class59_Sub2_Sub2.anInt6010;
				i_54_ += Class59_Sub2_Sub2.anInt6010;
				((Class129) class129).anInt1810 = i_53_;
				((Class129) class129).anInt1804 = i_54_;
				((Class129) class129).aBool1812 = true;
				Class259_Sub3.aClass260_5357.method1718(class129);
			}
			if (((Class147) class147).aBool2171) {
				if (((Class147) class147).aByte2162 == 0) {
					if (i <= Class244.anInt3454 && i > Class56.anInt796) {
						Class147 class147_55_ = class147s[i - 1][i_0_];
						if (class147_55_ != null && ((Class147) class147_55_).aBool2171)
							return;
					}
					if (i >= Class244.anInt3454 && i < Class188.anInt2662 - 1) {
						Class147 class147_56_ = class147s[i + 1][i_0_];
						if (class147_56_ != null && ((Class147) class147_56_).aBool2171)
							return;
					}
					if (i_0_ <= Class59_Sub2_Sub2.anInt6025 && i_0_ > Class133.anInt1834) {
						Class147 class147_57_ = class147s[i][i_0_ - 1];
						if (class147_57_ != null && ((Class147) class147_57_).aBool2171)
							return;
					}
					if (i_0_ >= Class59_Sub2_Sub2.anInt6025 && i_0_ < Class246_Sub1_Sub10.f_db - 1) {
						Class147 class147_58_ = class147s[i][i_0_ + 1];
						if (class147_58_ != null && ((Class147) class147_58_).aBool2171)
							return;
					}
					((Class147) class147).aBool2171 = false;
					Class109_Sub1_Sub1.anInt6733--;
					Class59_Sub5 class59_sub5 = ((Class147) class147).aClass59_Sub5_2158;
					if (class59_sub5 != null && ((Class59_Sub5) class59_sub5).aBool5404) {
						if (Class246_Sub28_Sub25.aBool6705) {
							Class246_Sub22.method2081(class100, i_1_, i, i_0_);
							Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
						}
						Class130_Sub3 class130_sub3 = class59_sub5.method407((Class259_Sub3.aClass260_5357), -125);
						if (class130_sub3 != null) {
							((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub5;
							((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
							((Class130_Sub3) class130_sub3).anInt4411 = i;
							((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
							Class246_Sub2.aClass68_3814.method438(-121, class130_sub3);
						}
					}
					if (((Class147) class147).aShort2164 != 0) {
						Class59_Sub2 class59_sub2 = ((Class147) class147).aClass59_Sub2_2153;
						if (class59_sub2 != null && !(Class246_Sub28_Sub29.method2818(i_2_, i, i_0_, class59_sub2.method2023(false)))) {
							if ((((Class59_Sub2) class59_sub2).anInt4549 & ((Class147) class147).aShort2164) != 0) {
								if (Class246_Sub28_Sub25.aBool6705) {
									Class246_Sub22.method2081(class100, i_1_, i, i_0_);
									Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
								}
								Class130_Sub3 class130_sub3 = class59_sub2.method407((Class259_Sub3.aClass260_5357), -123);
								if (class130_sub3 != null) {
									((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2;
									((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
									((Class130_Sub3) class130_sub3).anInt4411 = i;
									((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
									Class246_Sub2.aClass68_3814.method438(-6, class130_sub3);
								}
							} else if (((Class59_Sub2) class59_sub2).anInt4549 == 256) {
								int i_59_ = (((Class59_Sub2) class59_sub2).anInt4563 - Class246_Sub1_Sub10.anInt6199);
								int i_60_ = (((Class59_Sub2) class59_sub2).anInt4542 - Class111.anInt1576);
								int i_61_ = ((Class59_Sub2) class59_sub2).anInt4556;
								int i_62_;
								if (i_61_ == 1 || i_61_ == 2)
									i_62_ = -i_59_;
								else
									i_62_ = i_59_;
								int i_63_;
								if (i_61_ == 2 || i_61_ == 3)
									i_63_ = -i_60_;
								else
									i_63_ = i_60_;
								if (Class246_Sub28_Sub25.aBool6705) {
									Class246_Sub22.method2081(class100, i_1_, i, i_0_);
									Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
								}
								Class59_Sub2 class59_sub2_64_ = ((Class147) class147).aClass59_Sub2_2159;
								if (i_63_ > i_62_) {
									Class130_Sub3 class130_sub3 = (class59_sub2.method407(Class259_Sub3.aClass260_5357, -119));
									if (class130_sub3 != null) {
										((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2;
										((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
										((Class130_Sub3) class130_sub3).anInt4411 = i;
										((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
										Class246_Sub2.aClass68_3814.method438(-126, class130_sub3);
									}
								} else if (class59_sub2_64_ != null) {
									Class130_Sub3 class130_sub3 = (class59_sub2_64_.method407(Class259_Sub3.aClass260_5357, -88));
									if (class130_sub3 != null) {
										((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub2_64_;
										((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
										((Class130_Sub3) class130_sub3).anInt4411 = i;
										((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
										Class246_Sub2.aClass68_3814.method438(18, class130_sub3);
									}
								}
							}
						}
						Class59_Sub4 class59_sub4 = ((Class147) class147).aClass59_Sub4_2172;
						Class59_Sub4 class59_sub4_65_ = ((Class147) class147).aClass59_Sub4_2152;
						if (class59_sub4_65_ != null && (((Class59_Sub4) class59_sub4_65_).anInt5185 & ((Class147) class147).aShort2164) != 0 && !Class102_Sub1.method2004(i_2_, i, i_0_, (((Class59_Sub4) class59_sub4_65_).anInt5185))) {
							if (Class246_Sub28_Sub25.aBool6705) {
								Class163.method1079(class100, (((Class59_Sub4) class59_sub4_65_).anInt5185), i_1_, i, i_0_);
								Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
							}
							Class130_Sub3 class130_sub3 = class59_sub4_65_.method407((Class259_Sub3.aClass260_5357), -105);
							if (class130_sub3 != null) {
								((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub4_65_;
								((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
								((Class130_Sub3) class130_sub3).anInt4411 = i;
								((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
								Class246_Sub2.aClass68_3814.method438(29, class130_sub3);
							}
						}
						if (class59_sub4 != null && (((Class59_Sub4) class59_sub4).anInt5185 & ((Class147) class147).aShort2164) != 0 && !Class102_Sub1.method2004(i_2_, i, i_0_, (((Class59_Sub4) class59_sub4).anInt5185))) {
							if (Class246_Sub28_Sub25.aBool6705) {
								Class163.method1079(class100, ((Class59_Sub4) class59_sub4).anInt5185, i_1_, i, i_0_);
								Class259_Sub3.aClass260_5357.method1679(((Class100) class100).anInt1298, (((Class100) class100).aClass246_Sub41Array1301));
							}
							Class130_Sub3 class130_sub3 = class59_sub4.method407((Class259_Sub3.aClass260_5357), -123);
							if (class130_sub3 != null) {
								((Class130_Sub3) class130_sub3).aClass59_4414 = class59_sub4;
								((Class130_Sub3) class130_sub3).anInt4408 = i_1_;
								((Class130_Sub3) class130_sub3).anInt4411 = i;
								((Class130_Sub3) class130_sub3).anInt4410 = i_0_;
								Class246_Sub2.aClass68_3814.method438(-128, class130_sub3);
							}
						}
					}
					if (i_1_ < Class154_Sub1.anInt4803 - 1) {
						Class147 class147_66_ = (Class106.aClass147ArrayArrayArray1494[i_1_ + 1][i][i_0_]);
						if (class147_66_ != null && ((Class147) class147_66_).aBool2171)
							Class245.aClass106_3462.method725((byte) -73, class147_66_);
					}
					if (i < Class244.anInt3454) {
						Class147 class147_67_ = class147s[i + 1][i_0_];
						if (class147_67_ != null && ((Class147) class147_67_).aBool2171)
							Class245.aClass106_3462.method727(class147_67_, 0);
					}
					if (i_0_ < Class59_Sub2_Sub2.anInt6025) {
						Class147 class147_68_ = class147s[i][i_0_ + 1];
						if (class147_68_ != null && ((Class147) class147_68_).aBool2171)
							Class245.aClass106_3462.method727(class147_68_, 0);
					}
					if (i > Class244.anInt3454) {
						Class147 class147_69_ = class147s[i - 1][i_0_];
						if (class147_69_ != null && ((Class147) class147_69_).aBool2171)
							Class245.aClass106_3462.method727(class147_69_, 0);
					}
					if (i_0_ > Class59_Sub2_Sub2.anInt6025) {
						Class147 class147_70_ = class147s[i][i_0_ - 1];
						if (class147_70_ != null && ((Class147) class147_70_).aBool2171)
							Class245.aClass106_3462.method727(class147_70_, 0);
					}
				}
			}
		}
	}

	static final void method1074(Class140 class140, Class246_Sub2 class246_sub2, byte i, Class260 class260) {
		try {
			anInt2295++;
			Class_l class_l = class140.method944(105, class260);
			if (class_l != null) {
				int i_71_ = class_l.la();
				if (i_71_ < class_l.ma())
					i_71_ = class_l.ma();
				int i_72_ = 10;
				int i_73_ = ((Class246_Sub2) class246_sub2).anInt3810;
				int i_74_ = ((Class246_Sub2) class246_sub2).anInt3805;
				int i_75_ = 0;
				int i_76_ = 0;
				int i_77_ = 0;
				if (((Class140) class140).aString1998 != null) {
					i_75_ = (Class217.aClass73_3022.method458(null, null, (byte) -71, Class214.aStringArray2986, ((Class140) class140).aString1998));
					for (int i_78_ = 0; (i_75_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff); i_78_++) {
						String string = Class214.aStringArray2986[i_78_];
						if (i_75_ - 1 > i_78_)
							string = string.substring(0, string.length() - 4);
						int i_79_ = Class129.aClass198_1806.method1305(string);
						if (i_76_ < i_79_)
							i_76_ = i_79_;
					}
					i_77_ = (i_75_ * Class129.aClass198_1806.method1303() + Class129.aClass198_1806.method1306() / 2);
				}
				int i_80_ = ((Class246_Sub2) class246_sub2).anInt3810 + i_71_ / 2;
				int i_81_ = ((Class246_Sub2) class246_sub2).anInt3805;
				if (i == 55) {
					if (i_71_ + Class79.anInt1040 > i_73_) {
						i_80_ = (5 + i_72_ + (Class79.anInt1040 + i_71_ / 2) - -(i_76_ / 2));
						i_73_ = Class79.anInt1040;
					} else if ((-i_71_ + Class79.anInt1056 ^ 0xffffffff) > (i_73_ ^ 0xffffffff)) {
						i_80_ = -5 + (-(i_71_ / 2) + (Class79.anInt1056 + -i_72_) - i_76_ / 2);
						i_73_ = -i_71_ + Class79.anInt1056;
					}
					if (i_71_ + Class79.anInt1049 > i_74_) {
						i_74_ = Class79.anInt1049;
						i_81_ = i_71_ / 2 + (Class79.anInt1049 + i_72_);
					} else if ((i_74_ ^ 0xffffffff) < (-i_71_ + Class79.anInt1055 ^ 0xffffffff)) {
						i_81_ = (-i_77_ + (-(i_71_ / 2) + Class79.anInt1055) - i_72_);
						i_74_ = -i_71_ + Class79.anInt1055;
					}
					int i_82_ = ((int) (32767.0 * (Math.atan2((double) (-(((Class246_Sub2) class246_sub2).anInt3810) + i_73_), (double) (i_74_ + -(((Class246_Sub2) class246_sub2).anInt3805))) / 3.141592653589793)) & 0xffff);
					class_l.method736((float) i_73_ + (float) i_71_ / 2.0F, (float) i_71_ / 2.0F + (float) i_74_, 4096, i_82_);
					int i_83_ = -2;
					int i_84_ = -2;
					int i_85_ = -2;
					int i_86_ = -2;
					if (((Class140) class140).aString1998 != null) {
						i_83_ = -5 + (-(i_76_ / 2) + i_80_);
						i_84_ = i_81_;
						i_86_ = (3 + i_84_ + Class129.aClass198_1806.method1303() * i_75_);
						i_85_ = i_76_ + (i_83_ + 10);
						if (((Class140) class140).anInt2013 != 0)
							class260.method1734(i_83_, -i_83_ + i_85_, i_84_, (byte) 58, (((Class140) class140).anInt2013), i_86_ - i_84_);
						if (((Class140) class140).anInt1997 != 0)
							class260.method1736(i_83_, (((Class140) class140).anInt1997), i_86_ - i_84_, 8, -i_83_ + i_85_, i_84_);
						for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > (i_75_ ^ 0xffffffff); i_87_++) {
							String string = Class214.aStringArray2986[i_87_];
							if ((i_87_ ^ 0xffffffff) > (i_75_ - 1 ^ 0xffffffff))
								string = string.substring(0, -4 + string.length());
							Class129.aClass198_1806.method1304(class260, string, i_80_, i_81_, ((Class140) class140).anInt2022, true);
							i_81_ += Class129.aClass198_1806.method1303();
						}
					}
					if (((Class140) class140).anInt2026 != -1 || ((Class140) class140).aString1998 != null) {
						Class246_Sub10 class246_sub10 = new Class246_Sub10(class246_sub2);
						i_71_ >>= 1;
						((Class246_Sub10) class246_sub10).anInt4073 = i_73_ - -i_71_;
						((Class246_Sub10) class246_sub10).anInt4078 = -i_71_ + i_74_;
						((Class246_Sub10) class246_sub10).anInt4074 = i_86_;
						((Class246_Sub10) class246_sub10).anInt4082 = i_85_;
						((Class246_Sub10) class246_sub10).anInt4072 = -i_71_ + i_73_;
						((Class246_Sub10) class246_sub10).anInt4076 = i_74_ - -i_71_;
						((Class246_Sub10) class246_sub10).anInt4075 = i_83_;
						((Class246_Sub10) class246_sub10).anInt4077 = i_84_;
						Class211.aClass166_2963.method1101(false, class246_sub10);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pf.G(" + (class140 != null ? "{...}" : "null") + ',' + (class246_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1075(int i, boolean bool, int i_88_, int i_89_, int i_90_) {
		try {
			int i_91_ = 0;
			if (bool == true) {
				for (/**/; (i_91_ ^ 0xffffffff) > (Class124.anInt1738 ^ 0xffffffff); i_91_++) {
					Rectangle rectangle = Class246_Sub28_Sub22.aRectangleArray6629[i_91_];
					if ((i ^ 0xffffffff) > (rectangle.width + rectangle.x ^ 0xffffffff) && (rectangle.x ^ 0xffffffff) > (i_89_ + i ^ 0xffffffff) && i_90_ < rectangle.height + rectangle.y && rectangle.y < i_88_ + i_90_)
						Class246_Sub39.aBoolArray5488[i_91_] = true;
				}
				anInt2299++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pf.B(" + i + ',' + bool + ',' + i_88_ + ',' + i_89_ + ',' + i_90_ + ')'));
		}
	}

	final Class162 method1076(int i, boolean bool) {
		try {
			if (bool != false)
				return null;
			anInt2298++;
			return new Class162(((Class162) this).anInt2290, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pf.D(" + i + ',' + bool + ')');
		}
	}

	static final boolean method1077(int i) {
		try {
			if (i != 8271)
				return true;
			anInt2293++;
			if (Class106_Sub2.aBool5333) {
				try {
					if (((Boolean) Class80.method521(Class108.aClass52_1535.anApplet733, "showingVideoAd", 112)).booleanValue())
						return false;
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pf.C(" + i + ')');
		}
	}

	final Class4 method1078(byte i) {
		try {
			if (i <= 2)
				return null;
			anInt2303++;
			return Class59_Sub1_Sub1.method2541(0, ((Class162) this).anInt2290);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pf.A(" + i + ')');
		}
	}

	Class162(int i, int i_92_) {
		try {
			((Class162) this).anInt2289 = i_92_;
			((Class162) this).anInt2290 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pf.<init>(" + i + ',' + i_92_ + ')');
		}
	}

	Class162(Class162 class162_93_, int i) {
		try {
			((Class162) this).aClass162_2296 = class162_93_;
			((Class162) this).anInt2290 = ((Class162) ((Class162) this).aClass162_2296).anInt2290;
			((Class162) this).aClass_c2291 = ((Class162) ((Class162) this).aClass162_2296).aClass_c2291;
			((Class162) this).anInt2289 = ((Class162) ((Class162) this).aClass162_2296).anInt2289 - -i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pf.<init>(" + (class162_93_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
