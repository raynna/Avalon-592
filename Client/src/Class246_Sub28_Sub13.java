/* Class246_Sub28_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub13 extends Class246_Sub28 {
	private boolean aBool6286 = true;
	private boolean aBool6287 = true;
	static int anInt6288;
	static int anInt6289;
	static int anInt6290;
	static int anInt6291;
	static IncomingPacket aClass13_6292 = new IncomingPacket(90, 12);
	static int anInt6293 = 0;
	static float[] aFloatArray6294 = new float[4];

	static final void method2623(int i, Class260 class260, int i_0_, int i_1_) {
		try {
			anInt6288++;
			if ((i_0_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) <= -1 && (Class240.anInt3381 ^ 0xffffffff) != -1 && Class246_Sub1_Sub14.anInt6592 != 0) {
				class260.H(Class101.anInt1309, Class40.anInt616, Class240.anInt3381, Class246_Sub1_Sub14.anInt6592);
				class260.OA(Class259_Sub2.anInt4960, Class246_Sub1_Sub8_Sub1.anInt7157, Class240.anInt3381, Class246_Sub1_Sub14.anInt6592);
				if (i != -1)
					anInt6293 = 66;
				Class_c class_c = class260.method1715();
				class_c.s(Class_c.anInt1192, Class112.anInt1588, Class246_Sub1_Sub7.anInt6029, Class98.anInt1267, Class12.anInt181, Class_q_Sub1.anInt6668);
				class260.ea(class_c);
				if (Class246_Sub28_Sub3.aClass210Array5899 != null) {
					int i_2_ = -1;
					int i_3_ = -1;
					int i_4_ = class260.a();
					int i_5_ = (i_4_ * (-Class101.anInt1309 + i_0_) / Class240.anInt3381);
					int i_6_ = (i_4_ * (-Class40.anInt616 + i_1_) / Class246_Sub1_Sub14.anInt6592);
					int i_7_ = class260.YA();
					int i_8_ = (i_7_ * (-Class101.anInt1309 + i_0_) / Class240.anInt3381);
					int i_9_ = (i_7_ * (i_1_ - Class40.anInt616) / Class246_Sub1_Sub14.anInt6592);
					int[] is = { i_5_, i_6_, i_4_ };
					class_c.m(is);
					int[] is_10_ = { i_8_, i_9_, i_7_ };
					class_c.m(is_10_);
					float f = 0.0F;
					int i_11_ = is_10_[0] - is[0];
					int i_12_ = is_10_[1] + -is[1];
					int i_13_ = is_10_[2] + -is[2];
					for (/**/; f < 1.0F; f += 0.01) {
						int i_14_ = (int) ((float) is[0] + f * (float) i_11_);
						int i_15_ = i_14_ >> 7;
						int i_16_ = (int) (f * (float) i_13_ + (float) is[2]);
						int i_17_ = i_16_ >> 7;
						if (i_15_ > 0 && (i_17_ ^ 0xffffffff) < -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) && ((Class152.anInt2205 ^ 0xffffffff) < (i_17_ ^ 0xffffffff))) {
							int i_18_ = (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053);
							if ((i_18_ ^ 0xffffffff) > -4 && ((Class45.aByteArrayArrayArray648[1][i_15_][i_17_]) & 0x2 ^ 0xffffffff) != -1)
								i_18_++;
							if ((float) Class246_Sub28_Sub3.aClass210Array5899[i_18_].a(i_14_, i_16_) < f * (float) i_12_ + (float) is[1]) {
								i_2_ = (-1 + Class_a.aClass_r_Sub1_1180.method2670((byte) 127) << 6) + i_14_ >> 7;
								i_3_ = (Class_a.aClass_r_Sub1_1180.method2670((byte) 127) - 1 << 6) + i_16_ >> 7;
								break;
							}
						}
					}
					if ((i_2_ ^ 0xffffffff) != 0 && i_3_ != -1) {
						if (!Class187.aBool2653 || (0x40 & Node.anInt3469) == 0) {
							if (Class59_Sub4_Sub3.aClass101_6943 == Class40_Sub6.aClass101_5092)
								Class259_Sub2_Sub1.method2846(59, (byte) -55, false, 0L, i_2_, "", true, Class246_Sub1_Sub13.aClass67_6567.method436(true, Class_j.anInt1485), i_3_, -1, -1);
							Class18.anInt263++;
							Class259_Sub2_Sub1.method2846(44, (byte) -55, false, 0L, i_2_, "", true, Class91.aString1187, i_3_, -1, (Class246_Sub28_Sub20.anInt6572));
						} else {
							Class235 class235 = Class211.method1390(Class231.anInt3168, Class_b.anInt1161, (byte) 126);
							if (class235 == null)
								Class59_Sub4.method2209((byte) -44);
							else
								Class259_Sub2_Sub1.method2846(19, (byte) -55, false, 0L, i_2_, " ->", true, Class218.aString3026, i_3_, -1, Class147.anInt2148);
						}
					}
				}
				Class68 class68 = Class246_Sub2.aClass68_3814;
				Class130_Sub3 class130_sub3 = (Class130_Sub3) class68.method445(62);
				for (/**/; class130_sub3 != null; class130_sub3 = (Class130_Sub3) class68.method442((byte) -83)) {
					if (((((Class130_Sub3) class130_sub3).anInt4408 ^ 0xffffffff) == ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) ^ 0xffffffff)) && class130_sub3.method1985(i_0_, 0, i_1_, class260)) {
						if (((Class130_Sub3) class130_sub3).aClass59_4414 instanceof Player) {
							Player class_r_sub1 = ((Player) (((Class130_Sub3) class130_sub3).aClass59_4414));
							int i_19_ = class_r_sub1.method2670((byte) 127);
							if (((0x1 & i_19_ ^ 0xffffffff) == -1 && (((Class59_Sub3) class_r_sub1).anInt5060 & 0x7f) == 0 && ((((Class59_Sub3) class_r_sub1).anInt5059 & 0x7f) ^ 0xffffffff) == -1) || ((0x1 & i_19_ ^ 0xffffffff) == -2 && ((((Class59_Sub3) class_r_sub1).anInt5060) & 0x7f ^ 0xffffffff) == -65 && (0x7f & (((Class59_Sub3) class_r_sub1).anInt5059) ^ 0xffffffff) == -65)) {
								int i_20_ = (((Class59_Sub3) class_r_sub1).anInt5060 + -((class_r_sub1.method2670((byte) 127) - 1) << 6));
								int i_21_ = (((Class59_Sub3) class_r_sub1).anInt5059 + -(-1 + class_r_sub1.method2670((byte) 127) << 6));
								for (int i_22_ = 0; Class5.anInt55 > i_22_; i_22_++) {
									Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[(Class246_Sub28_Sub29.anIntArray6815[i_22_])]);
									if (class_r_sub2 != null && (Class246_Sub1_Sub4.anInt5752 != ((Actor) class_r_sub2).f_sb) && (((Actor) class_r_sub2).aBool6441)) {
										int i_23_ = (-(-1 + (((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574) << 6) + (((Class59_Sub3) class_r_sub2).anInt5060));
										int i_24_ = (-((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 - 1) << 6) + (((Class59_Sub3) class_r_sub2).anInt5059));
										if (i_23_ >= i_20_ && (((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 <= (-(i_23_ + -i_20_ >> 7) + (class_r_sub1.method2670((byte) 127)))) && i_24_ >= i_21_ && ((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 ^ 0xffffffff) >= ((-(-i_21_ + i_24_ >> 7) + (class_r_sub1.method2670((byte) 127))) ^ 0xffffffff))) {
											Class246_Sub34.method2200((((Class130_Sub3) class130_sub3).anInt4408 != (((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053)), class_r_sub2, false);
											((Actor) class_r_sub2).f_sb = Class246_Sub1_Sub4.anInt5752;
										}
									}
								}
								int i_25_ = Class246_Sub4.anInt3869;
								int[] is = Class53.anIntArray755;
								for (int i_26_ = 0; ((i_26_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)); i_26_++) {
									Player class_r_sub1_27_ = (Class143.aClass_r_Sub1Array2069[is[i_26_]]);
									if (class_r_sub1_27_ != null && (Class246_Sub1_Sub4.anInt5752 != (((Actor) class_r_sub1_27_).f_sb)) && class_r_sub1_27_ != class_r_sub1 && (((Actor) class_r_sub1_27_).aBool6441)) {
										int i_28_ = (((Class59_Sub3) class_r_sub1_27_).anInt5060 - (-1 + (class_r_sub1_27_.method2670((byte) 127)) << 6));
										int i_29_ = (((Class59_Sub3) class_r_sub1_27_).anInt5059 - (-1 + (class_r_sub1_27_.method2670((byte) 127)) << 6));
										if (((i_28_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff)) && ((class_r_sub1_27_.method2670((byte) 127) ^ 0xffffffff) >= ((-(i_28_ - i_20_ >> 7) + (class_r_sub1.method2670((byte) 127))) ^ 0xffffffff)) && ((i_21_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)) && ((class_r_sub1_27_.method2670((byte) 127) ^ 0xffffffff) >= (((class_r_sub1.method2670((byte) 127)) - (i_29_ + -i_21_ >> 7)) ^ 0xffffffff))) {
											Class210.method1381(-91, (((Class130_Sub3) class130_sub3).anInt4408 != (((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053)), class_r_sub1_27_);
											((Actor) class_r_sub1_27_).f_sb = Class246_Sub1_Sub4.anInt5752;
										}
									}
								}
							}
							if (Class246_Sub1_Sub4.anInt5752 == ((Actor) class_r_sub1).f_sb)
								continue;
							Class210.method1381(-109, (((Class130_Sub3) class130_sub3).anInt4408 != ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053), class_r_sub1);
							((Actor) class_r_sub1).f_sb = Class246_Sub1_Sub4.anInt5752;
						}
						if (((Class130_Sub3) class130_sub3).aClass59_4414 instanceof Npc) {
							Npc class_r_sub2 = ((Npc) (((Class130_Sub3) class130_sub3).aClass59_4414));
							if (((Npc) class_r_sub2).aClass253_7184 != null) {
								if (((0x1 & ((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574) == 0 && (0x7f & (((Class59_Sub3) class_r_sub2).anInt5060)) == 0 && (0x7f & (((Class59_Sub3) class_r_sub2).anInt5059) ^ 0xffffffff) == -1) || ((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 & 0x1 ^ 0xffffffff) == -2 && ((((Class59_Sub3) class_r_sub2).anInt5060) & 0x7f) == 64 && ((((Class59_Sub3) class_r_sub2).anInt5059) & 0x7f) == 64)) {
									int i_30_ = (-(((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 - 1 << 6) + (((Class59_Sub3) class_r_sub2).anInt5060));
									int i_31_ = (-(((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574 - 1 << 6) + (((Class59_Sub3) class_r_sub2).anInt5059));
									for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (Class5.anInt55 ^ 0xffffffff)); i_32_++) {
										Npc class_r_sub2_33_ = (Class76.aClass_r_Sub2Array1002[(Class246_Sub28_Sub29.anIntArray6815[i_32_])]);
										if (class_r_sub2_33_ != null && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) != (((Actor) class_r_sub2_33_).f_sb ^ 0xffffffff)) && class_r_sub2_33_ != class_r_sub2 && (((Actor) class_r_sub2_33_).aBool6441)) {
											int i_34_ = (-((((Class253) (((Npc) class_r_sub2_33_).aClass253_7184)).anInt3574) - 1 << 6) + (((Class59_Sub3) class_r_sub2_33_).anInt5060));
											int i_35_ = (-(-1 + (((Class253) (((Npc) class_r_sub2_33_).aClass253_7184)).anInt3574) << 6) + (((Class59_Sub3) class_r_sub2_33_).anInt5059));
											if (((i_34_ ^ 0xffffffff) <= (i_30_ ^ 0xffffffff)) && ((((Class253) (((Npc) class_r_sub2_33_).aClass253_7184)).anInt3574) <= ((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574) + -(i_34_ + -i_30_ >> 7))) && ((i_31_ ^ 0xffffffff) >= (i_35_ ^ 0xffffffff)) && ((((Class253) (((Npc) class_r_sub2_33_).aClass253_7184)).anInt3574) <= ((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574) + -(i_35_ + -i_31_ >> 7)))) {
												Class246_Sub34.method2200((((((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053) ^ 0xffffffff) != ((((Class130_Sub3) class130_sub3).anInt4408) ^ 0xffffffff)), class_r_sub2_33_, false);
												((Actor) class_r_sub2_33_).f_sb = (Class246_Sub1_Sub4.anInt5752);
											}
										}
									}
									int i_36_ = Class246_Sub4.anInt3869;
									int[] is = Class53.anIntArray755;
									for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
										Player class_r_sub1 = (Class143.aClass_r_Sub1Array2069[is[i_37_]]);
										if (class_r_sub1 != null && (((Actor) class_r_sub1).f_sb != (Class246_Sub1_Sub4.anInt5752)) && (((Actor) class_r_sub1).aBool6441)) {
											int i_38_ = (((Class59_Sub3) class_r_sub1).anInt5060 - ((class_r_sub1.method2670((byte) 127)) - 1 << 6));
											int i_39_ = (((Class59_Sub3) class_r_sub1).anInt5059 + -(-1 + (class_r_sub1.method2670((byte) 127)) << 6));
											if (((i_38_ ^ 0xffffffff) <= (i_30_ ^ 0xffffffff)) && (class_r_sub1.method2670((byte) 127) <= (-(i_38_ - i_30_ >> 7) + (((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574))) && ((i_31_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff)) && (class_r_sub1.method2670((byte) 127) <= ((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574) - (i_39_ - i_31_ >> 7)))) {
												Class210.method1381(i + 80, (((((Class130_Sub3) class130_sub3).anInt4408) ^ 0xffffffff) != ((((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053) ^ 0xffffffff)), class_r_sub1);
												((Actor) class_r_sub1).f_sb = (Class246_Sub1_Sub4.anInt5752);
											}
										}
									}
								}
								if (((Actor) class_r_sub2).f_sb == Class246_Sub1_Sub4.anInt5752)
									continue;
								Class246_Sub34.method2200((((Class130_Sub3) class130_sub3).anInt4408 != (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053)), class_r_sub2, false);
								((Actor) class_r_sub2).f_sb = Class246_Sub1_Sub4.anInt5752;
							}
						}
						if (((Class130_Sub3) class130_sub3).aClass59_4414 instanceof Class59_Sub5_Sub1) {
							Class246_Sub13 class246_sub13 = ((Class246_Sub13) (Class251.aClass85_3551.method544((long) ((((Class130_Sub3) class130_sub3).anInt4411) | (((Class130_Sub3) class130_sub3).anInt4408 << 28 | (((Class130_Sub3) class130_sub3).anInt4410 << 14))), 125)));
							if (class246_sub13 != null) {
								for (Class246_Sub43 class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1103(-62)); class246_sub43 != null; class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1109((byte) 32))) {
									Class197 class197 = (Class255.aClass191_3663.method1251(i ^ ~0x5963, (((Class246_Sub43) class246_sub43).anInt5596)));
									if (Class187.aBool2653) {
										if ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) == (((Class130_Sub3) class130_sub3).anInt4408)) {
											Class118 class118 = ((Class109_Sub1.anInt3754 != -1) ? (Class246_Sub1_Sub10.f_eb.method1085((byte) -40, (Class109_Sub1.anInt3754))) : null);
											if ((Node.anInt3469 & 0x1) != 0 && (class118 == null || ((class197.method1289((Class109_Sub1.anInt3754), -114, (((Class118) class118).anInt1634))) != (((Class118) class118).anInt1634)))) {
												Class259_Sub2_Sub1.method2846(6, (byte) -55, false, (long) (((Class246_Sub43) class246_sub43).anInt5596), ((Class130_Sub3) class130_sub3).anInt4411, (Class246_Sub7.aString3964 + " -> <col=ff9040>" + (((Class197) class197).aString2778)), true, Class218.aString3026, ((Class130_Sub3) class130_sub3).anInt4410, -1, Class147.anInt2148);
												Class195.anInt2740++;
											}
										}
									} else {
										if ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) == (((Class130_Sub3) class130_sub3).anInt4408)) {
											String[] strings = (((Class197) class197).aStringArray2796);
											for (int i_40_ = 4; i_40_ >= 0; i_40_--) {
												if (strings != null && (strings[i_40_] != null)) {
													int i_41_ = 0;
													int i_42_ = Class109.anInt1568;
													if ((i_40_ ^ 0xffffffff) == -1)
														i_41_ = 49;
													if ((i_40_ ^ 0xffffffff) == -2)
														i_41_ = 51;
													if (i_40_ == 2)
														i_41_ = 16;
													if (i_40_ == 3)
														i_41_ = 4;
													if ((((Class197) class197).anInt2762) == i_40_)
														i_42_ = (((Class197) class197).anInt2805);
													if ((i_40_ ^ 0xffffffff) == -5)
														i_41_ = 2;
													if ((((Class197) class197).anInt2803) == i_40_)
														i_42_ = (((Class197) class197).anInt2766);
													Class259_Sub2_Sub1.method2846(i_41_, (byte) -55, false, (long) (((Class246_Sub43) class246_sub43).anInt5596), (((Class130_Sub3) class130_sub3).anInt4411), ("<col=ff9040>" + (((Class197) class197).aString2778)), true, strings[i_40_], (((Class130_Sub3) class130_sub3).anInt4410), -1, i_42_);
													Class174.anInt2465++;
												}
											}
										}
										Class259_Sub2_Sub1.method2846(1009, (byte) -55, ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) != ((Class130_Sub3) class130_sub3).anInt4408), (long) ((Class246_Sub43) class246_sub43).anInt5596, (((Class130_Sub3) class130_sub3).anInt4411), ("<col=ff9040>" + (((Class197) class197).aString2778)), true, (Class246_Sub1_Sub3.aClass67_5721.method436(true, Class_j.anInt1485)), (((Class130_Sub3) class130_sub3).anInt4410), -1, Class106_Sub1.anInt4174);
										Class252.anInt3562++;
									}
								}
							}
						}
						if (((Class130_Sub3) class130_sub3).aClass59_4414 instanceof Class_f) {
							Class_f class_f = (Class_f) (((Class130_Sub3) class130_sub3).aClass59_4414);
							Class185 class185 = Class143.aClass251_2067.method1610(class_f.method21(true), 0);
							if (((Class185) class185).f_bb != null)
								class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) -120);
							if (class185 != null) {
								if (!Class187.aBool2653) {
									if (((((Class130_Sub3) class130_sub3).anInt4408) ^ 0xffffffff) == ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) ^ 0xffffffff)) {
										String[] strings = (((Class185) class185).aStringArray2595);
										if (strings != null) {
											for (int i_43_ = 4; i_43_ >= 0; i_43_--) {
												if (strings[i_43_] != null) {
													int i_44_ = 0;
													int i_45_ = Class109.anInt1568;
													if ((i_43_ ^ 0xffffffff) == -1)
														i_44_ = 18;
													if (i_43_ == 1)
														i_44_ = 45;
													if ((i_43_ ^ 0xffffffff) == -3)
														i_44_ = 23;
													if (i_43_ == 3)
														i_44_ = 25;
													if ((i_43_ ^ 0xffffffff) == -5)
														i_44_ = 1007;
													if ((((Class185) class185).anInt2600) == i_43_)
														i_45_ = (((Class185) class185).anInt2609);
													if ((i_43_ ^ 0xffffffff) == (((Class185) class185).f_kb ^ 0xffffffff))
														i_45_ = ((Class185) class185).f_ub;
													Class259_Sub2_Sub1.method2846(i_44_, (byte) -55, false, (Class189.method1241((byte) 101, (((Class130_Sub3) class130_sub3).anInt4411), class_f, (((Class130_Sub3) class130_sub3).anInt4410))), (((Class130_Sub3) class130_sub3).anInt4411), ("<col=00ffff>" + ((Class185) class185).f_wb), true, strings[i_43_], (((Class130_Sub3) class130_sub3).anInt4410), -1, i_45_);
													Class21_Sub1.anInt3903++;
												}
											}
										}
									}
									Class115.anInt1601++;
									Class259_Sub2_Sub1.method2846(1010, (byte) -55, (((((Class130_Sub3) class130_sub3).anInt4408) ^ 0xffffffff) != ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) ^ 0xffffffff)), (long) (((Class185) class185).anInt2607), (((Class130_Sub3) class130_sub3).anInt4411), ("<col=00ffff>" + ((Class185) class185).f_wb), true, (Class246_Sub1_Sub3.aClass67_5721.method436(true, Class_j.anInt1485)), (((Class130_Sub3) class130_sub3).anInt4410), -1, Class106_Sub1.anInt4174);
								} else if ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) == (((Class130_Sub3) class130_sub3).anInt4408)) {
									Class118 class118 = (Class109_Sub1.anInt3754 != -1 ? (Class246_Sub1_Sub10.f_eb.method1085((byte) 104, Class109_Sub1.anInt3754)) : null);
									if ((0x4 & Node.anInt3469) != 0 && (class118 == null || (((class185.method1206(Class109_Sub1.anInt3754, (byte) 101, (((Class118) class118).anInt1634))) ^ 0xffffffff) != ((((Class118) class118).anInt1634) ^ 0xffffffff)))) {
										Player.anInt7130++;
										Class259_Sub2_Sub1.method2846(30, (byte) -55, false, (Class189.method1241((byte) 68, (((Class130_Sub3) class130_sub3).anInt4411), class_f, (((Class130_Sub3) class130_sub3).anInt4410))), (((Class130_Sub3) class130_sub3).anInt4411), (Class246_Sub7.aString3964 + " -> <col=00ffff>" + ((Class185) class185).f_wb), true, Class218.aString3026, (((Class130_Sub3) class130_sub3).anInt4410), -1, Class147.anInt2148);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jf.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public Class246_Sub28_Sub13() {
		super(1, false);
	}

	public static void method2624(boolean bool) {
		do {
			try {
				aClass13_6292 = null;
				aFloatArray6294 = null;
				if (bool == true)
					break;
				aFloatArray6294 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jf.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_46_) {
		try {
			int i_47_ = 60 / ((i - 67) / 50);
			anInt6290++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_46_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_48_ = this.method2133((aBool6286 ? -i_46_ + Class113.anInt1594 : i_46_), 0, 0);
				if (aBool6287) {
					for (int i_49_ = 0; Class246_Sub37_Sub1.f_gb > i_49_; i_49_++)
						is[i_49_] = is_48_[-i_49_ + Class63_Sub1.anInt4719];
				} else
					Class117.method806(is_48_, 0, is, 0, Class246_Sub37_Sub1.f_gb);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jf.E(" + i + ',' + i_46_ + ')');
		}
	}

	final int[][] method2139(byte i, int i_50_) {
		try {
			if (i < 33)
				aClass13_6292 = null;
			anInt6289++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 67, i_50_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_51_ = this.method2141(3, 0, (aBool6286 ? -i_50_ + Class113.anInt1594 : i_50_));
				int[] is_52_ = is_51_[0];
				int[] is_53_ = is_51_[1];
				int[] is_54_ = is_51_[2];
				int[] is_55_ = is[0];
				int[] is_56_ = is[1];
				int[] is_57_ = is[2];
				if (!aBool6287) {
					for (int i_58_ = 0; ((i_58_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_58_++) {
						is_55_[i_58_] = is_52_[i_58_];
						is_56_[i_58_] = is_53_[i_58_];
						is_57_[i_58_] = is_54_[i_58_];
					}
				} else {
					for (int i_59_ = 0; Class246_Sub37_Sub1.f_gb > i_59_; i_59_++) {
						is_55_[i_59_] = is_52_[Class63_Sub1.anInt4719 + -i_59_];
						is_56_[i_59_] = is_53_[-i_59_ + Class63_Sub1.anInt4719];
						is_57_[i_59_] = is_54_[-i_59_ + Class63_Sub1.anInt4719];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jf.J(" + i + ',' + i_50_ + ')');
		}
	}

	final void method2143(int i, int i_60_, BufferStream stream) {
		do {
			try {
				anInt6291++;
				int i_61_ = i_60_;
				while_119_: do {
					do {
						if ((i_61_ ^ 0xffffffff) != -1) {
							if ((i_61_ ^ 0xffffffff) != -2) {
								if (i_61_ == 2)
									break;
								break while_119_;
							}
						} else {
							aBool6287 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
							break while_119_;
						}
						aBool6286 = stream.readUnsignedByte(255) == 1;
						break while_119_;
					} while (false);
					((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(i ^ 0xfb) ^ 0xffffffff) == -2;
				} while (false);
				if (i == 4)
					break;
				aFloatArray6294 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jf.G(" + i + ',' + i_60_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
