/* Class246_Sub1_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub9 extends Class246_Sub1 {
	Class59_Sub3_Sub2 aClass59_Sub3_Sub2_6173;
	static int anInt6174;
	static int anInt6175;
	static int anInt6176;
	static Class67 aClass67_6177 = new Class67("flash3:", "blinken3:", "clignotant3:", "brilho3:");
	static Class67 aClass67_6178;
	static int anInt6179;
	static boolean aBool6180 = true;

	static final boolean method2586(int i, String string) {
		try {
			anInt6175++;
			if (string == null)
				return false;
			for (int i_0_ = 0; (Class246_Sub7.anInt3969 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				if (string.equalsIgnoreCase(Class103.f_gb[i_0_]))
					return true;
			}
			if (i <= 109)
				return false;
			if (string.equalsIgnoreCase(((Player) Class_a.aClass_r_Sub1_1180).aString7140))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hi.D(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final char method2587(int i, char c) {
		try {
			if (i != 234)
				aClass67_6177 = null;
			anInt6179++;
			int i_1_ = c;
			while_13_: do {
				while_12_: do {
					while_11_: do {
						while_10_: do {
							while_9_: do {
								while_8_: do {
									while_7_: do {
										while_6_: do {
											while_5_: do {
												while_4_: do {
													do {
														if (i_1_ != 32 && i_1_ != 160 && ((i_1_ ^ 0xffffffff) != -96) && i_1_ != 45) {
															if (((i_1_ ^ 0xffffffff) == -92) || i_1_ == 93 || i_1_ == 35)
																break;
															if (i_1_ == 224 || i_1_ == 225 || i_1_ == 226 || ((i_1_ ^ 0xffffffff) == -229) || ((i_1_ ^ 0xffffffff) == -228) || ((i_1_ ^ 0xffffffff) == -193) || i_1_ == 193 || i_1_ == 194 || i_1_ == 196 || ((i_1_ ^ 0xffffffff) == -196))
																break while_4_;
															if (i_1_ == 232 || ((i_1_ ^ 0xffffffff) == -234) || i_1_ == 234 || i_1_ == 235 || i_1_ == 200 || ((i_1_ ^ 0xffffffff) == -202) || ((i_1_ ^ 0xffffffff) == -203) || i_1_ == 203)
																break while_5_;
															if (i_1_ == 237 || i_1_ == 238 || i_1_ == 239 || ((i_1_ ^ 0xffffffff) == -206) || ((i_1_ ^ 0xffffffff) == -207) || i_1_ == 207)
																break while_6_;
															if (((i_1_ ^ 0xffffffff) == -243) || ((i_1_ ^ 0xffffffff) == -244) || ((i_1_ ^ 0xffffffff) == -245) || ((i_1_ ^ 0xffffffff) == -247) || i_1_ == 245 || i_1_ == 210 || i_1_ == 211 || ((i_1_ ^ 0xffffffff) == -213) || i_1_ == 214 || ((i_1_ ^ 0xffffffff) == -214))
																break while_7_;
															if (((i_1_ ^ 0xffffffff) == -250) || i_1_ == 250 || i_1_ == 251 || ((i_1_ ^ 0xffffffff) == -253) || ((i_1_ ^ 0xffffffff) == -218) || ((i_1_ ^ 0xffffffff) == -219) || i_1_ == 219 || i_1_ == 220)
																break while_8_;
															if (i_1_ == 231 || ((i_1_ ^ 0xffffffff) == -200))
																break while_9_;
															if (((i_1_ ^ 0xffffffff) == -256) || ((i_1_ ^ 0xffffffff) == -377))
																break while_10_;
															if (((i_1_ ^ 0xffffffff) == -242) || ((i_1_ ^ 0xffffffff) == -210))
																break while_11_;
															if (i_1_ != 223)
																break while_13_;
															if (!client.f_ob)
																break while_12_;
														}
														return '_';
													} while (false);
													return c;
												} while (false);
												return 'a';
											} while (false);
											return 'e';
										} while (false);
										return 'i';
									} while (false);
									return 'o';
								} while (false);
								return 'u';
							} while (false);
							return 'c';
						} while (false);
						return 'y';
					} while (false);
					return 'n';
				} while (false);
				return 'b';
			} while (false);
			return Character.toLowerCase(c);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.E(" + i + ',' + c + ')');
		}
	}

	Class246_Sub1_Sub9(Class59_Sub3_Sub2 class59_sub3_sub2) {
		try {
			((Class246_Sub1_Sub9) this).aClass59_Sub3_Sub2_6173 = class59_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.<init>(" + (class59_sub3_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2588(int i, int i_2_, int i_3_, int i_4_, Class235[] class235s, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
			if (i_9_ == -1268043624) {
				anInt6174++;
				int i_10_ = 0;
				for (/**/; class235s.length > i_10_; i_10_++) {
					Class235 class235 = class235s[i_10_];
					if (class235 != null && (((i_6_ ^ 0xffffffff) == (((Class235) class235).anInt3293 ^ 0xffffffff)) || (i_6_ == -1412584499 && class235 == Class150.aClass235_2196))) {
						int i_11_;
						if (i_4_ != -1)
							i_11_ = i_4_;
						else {
							Class246_Sub28_Sub22.aRectangleArray6629[Class124.anInt1738].setBounds(i_8_ + ((Class235) class235).f_mc, ((Class235) class235).f_hd + i_3_, ((Class235) class235).f_fc, ((Class235) class235).f_sb);
							i_11_ = Class124.anInt1738++;
						}
						((Class235) class235).f_bb = Class246_Sub1_Sub4.anInt5752;
						((Class235) class235).anInt3297 = i_11_;
						if (!client.method2966(class235)) {
							if (((Class235) class235).anInt3280 != 0)
								Class246_Sub28_Sub6.method2551(class235, 18804);
							int i_12_ = ((Class235) class235).f_mc + i_8_;
							int i_13_ = i_3_ + ((Class235) class235).f_hd;
							int i_14_ = ((Class235) class235).anInt3295;
							if (Class_v.aBool1452 && ((((Class246_Sub27) client.method2971(class235)).anInt4893 != 0) || ((Class235) class235).f_vc == 0) && (i_14_ ^ 0xffffffff) < -128)
								i_14_ = 127;
							if (class235 == Class150.aClass235_2196) {
								if (i_6_ != -1412584499 && ((Class214.anInt2993 == ((Class235) class235).anInt3205) || ((((Class235) class235).anInt3205 ^ 0xffffffff) == (Class246_Sub27.anInt4894 ^ 0xffffffff)))) {
									Class90.aClass235Array1168 = class235s;
									Class139.anInt1987 = i_3_;
									Class246_Sub28_Sub12.anInt6197 = i_8_;
									continue;
								}
								if (Class246_Sub1_Sub2.aBool5698 && Class259_Sub3.aBool5355) {
									int i_15_ = Class238.aClass102_3360.method640((byte) 58);
									int i_16_ = Class238.aClass102_3360.method636(i_9_ ^ ~0x4b94c482);
									i_15_ -= Class99.anInt1292;
									i_16_ -= Class246_Sub43.anInt5605;
									if (i_15_ < Class260.anInt3722)
										i_15_ = Class260.anInt3722;
									if (((Class235) class235).f_fc + i_15_ > (Class260.anInt3722 + ((Class235) Class33.aClass235_445).f_fc))
										i_15_ = (-((Class235) class235).f_fc + ((Class235) Class33.aClass235_445).f_fc + Class260.anInt3722);
									if (Class208.anInt2937 > i_16_)
										i_16_ = Class208.anInt2937;
									i_12_ = i_15_;
									if (((((Class235) Class33.aClass235_445).f_sb) + Class208.anInt2937 ^ 0xffffffff) > (i_16_ - -((Class235) class235).f_sb ^ 0xffffffff))
										i_16_ = (((Class235) Class33.aClass235_445).f_sb + (Class208.anInt2937 - (((Class235) class235).f_sb)));
									i_13_ = i_16_;
								}
								if (Class246_Sub27.anInt4894 == ((Class235) class235).anInt3205)
									i_14_ = 128;
							}
							int i_17_;
							int i_18_;
							int i_19_;
							int i_20_;
							if ((((Class235) class235).f_vc ^ 0xffffffff) == -3) {
								i_18_ = i;
								i_20_ = i_7_;
								i_19_ = i_2_;
								i_17_ = i_5_;
							} else {
								int i_21_ = i_12_ - -((Class235) class235).f_fc;
								int i_22_ = ((Class235) class235).f_sb + i_13_;
								if (((Class235) class235).f_vc == 9) {
									i_22_++;
									i_21_++;
								}
								i_17_ = ((i_12_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) ? i_5_ : i_12_);
								i_18_ = ((i_13_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i : i_13_);
								i_19_ = i_2_ > i_21_ ? i_21_ : i_2_;
								i_20_ = i_7_ <= i_22_ ? i_7_ : i_22_;
							}
							if (i_19_ > i_17_ && i_18_ < i_20_) {
								if ((((Class235) class235).anInt3280 ^ 0xffffffff) != -1) {
									if (((Class246_Sub1_Sub3.anInt5719 ^ 0xffffffff) == (((Class235) class235).anInt3280 ^ 0xffffffff)) || (Class18.anInt268 == (((Class235) class235).anInt3280))) {
										Class230.method1470(i_12_, (byte) 86, ((Class235) class235).f_fc, (Class18.anInt268 == (((Class235) class235).anInt3280)), i_13_, ((Class235) class235).f_sb);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (Class59_Sub1.anInt4514 == ((Class235) class235).anInt3280) {
										if ((class235.method1514(0, Class246_Sub15.aClass260_4445)) != null) {
											Class85.method545((byte) -109);
											Class258.method1670(class235, i_12_, -36, i_13_, (Class246_Sub15.aClass260_4445));
											Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
											Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										}
										continue;
									}
									if ((((Class235) class235).anInt3280 ^ 0xffffffff) == (Class152.anInt2202 ^ 0xffffffff)) {
										if ((class235.method1514(0, Class246_Sub15.aClass260_4445)) != null) {
											Class79_Sub1.method2204((byte) -125, i_12_, i_13_, class235);
											Class246_Sub28_Sub24.aBoolArray6673[i_11_] = true;
											Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										}
										continue;
									}
									if ((Class179.anInt2516 ^ 0xffffffff) == (((Class235) class235).anInt3280 ^ 0xffffffff)) {
										Class246_Sub1_Sub17.method2758(i_12_, ((Class235) class235).f_fc, (Class246_Sub37_Sub1.anInterface6_5910), Class246_Sub15.aClass260_4445, ((Class235) class235).f_sb, (byte) -125, i_13_);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (Class246_Sub18.anInt4676 == ((Class235) class235).anInt3280) {
										Class38.method262(((Class235) class235).f_fc, -117, Class246_Sub15.aClass260_4445, i_12_, i_13_, ((Class235) class235).f_sb);
										Class246_Sub39.aBoolArray5488[i_11_] = true;
										Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										continue;
									}
									if (Class150.anInt2198 == ((Class235) class235).anInt3280) {
										if (Class246_Sub34.aBool5145 || Class248.aBool3487) {
											int i_23_ = (i_12_ - -(((Class235) class235).f_fc));
											int i_24_ = i_13_ + 15;
											if (Class246_Sub34.aBool5145) {
												Class109.aClass116_1554.method795(-1, false, ("Fps:" + (Class246_Sub28_Sub18.anInt6517)), i_24_, -256, i_23_);
												i_24_ += 15;
												Runtime runtime = Runtime.getRuntime();
												int i_25_ = (int) (((runtime.totalMemory()) + -(runtime.freeMemory())) / 1024L);
												int i_26_ = -256;
												if (i_25_ > 65536)
													i_26_ = -65536;
												Class109.aClass116_1554.method795(-1, false, "Mem:" + i_25_ + "k", i_24_, i_26_, i_23_);
												i_24_ += 15;
												Class109.aClass116_1554.method795(-1, false, ("In:" + (Class246_Sub1_Sub5.anInt5847) + "B/s Out:" + Class257.anInt3686 + "B/s"), i_24_, -256, i_23_);
												i_24_ += 15;
												int i_27_ = (Class246_Sub15.aClass260_4445.IA() / 1024);
												Class109.aClass116_1554.method795(-1, false, "Offheap:" + i_27_ + "k", i_24_, (((i_27_ ^ 0xffffffff) >= -65537) ? -256 : -65536), i_23_);
												i_24_ += 15;
												int i_28_ = 0;
												int i_29_ = 0;
												int i_30_ = 0;
												for (int i_31_ = 0; ((i_31_ ^ 0xffffffff) > -31); i_31_++) {
													i_28_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_].method2087((byte) -8));
													i_29_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_].method2097(-104));
													i_30_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_31_].method2091(false));
												}
												int i_32_ = 100 * i_30_ / i_28_;
												int i_33_ = i_29_ * 10000 / i_28_;
												String string = ("Cache:" + (Class188.method1235(true, (long) i_33_, 2, -113, 0)) + "% (" + i_32_ + "%)");
												Class_c.aClass116_1196.method795(-1, false, string, i_24_, -256, i_23_);
												i_24_ += 12;
											}
											if ((Class247.anInt3480 ^ 0xffffffff) < -1)
												Class_c.aClass116_1196.method795(-1, false, ("Particles: " + Class148.anInt2176 + " / " + Class247.anInt3480), i_24_, -256, i_23_);
											i_24_ += 12;
											if (Class248.aBool3487) {
												Class_c.aClass116_1196.method795(-1, false, ("Polys: " + Class246_Sub15.aClass260_4445.ZA() + " Models: " + Class246_Sub15.aClass260_4445.w()), i_24_, -256, i_23_);
												i_24_ += 12;
												Class_c.aClass116_1196.method795(-1, false, ("Ls: " + Class_m.anInt1546 + " La: " + Class168.anInt2392 + " NPC: " + Class_l_Sub2.anInt5481 + " Pl: " + IncomingPacket.anInt185), i_24_, -256, i_23_);
												i_24_ += 12;
												Class22.method201(-77);
											}
											Class246_Sub39.aBoolArray5488[i_11_] = true;
										}
										continue;
									}
								}
								if (((Class235) class235).f_vc == 0) {
									if (((((Class235) class235).anInt3280 ^ 0xffffffff) == (Class246_Sub28_Sub29.anInt6814 ^ 0xffffffff)) && Class246_Sub15.aClass260_4445.method1742())
										Class246_Sub15.aClass260_4445.method1735(i_12_, i_13_, ((Class235) class235).f_fc, ((Class235) class235).f_sb);
									method2588(i_18_, i_19_, -(((Class235) class235).anInt3292) + i_13_, i_11_, class235s, i_17_, ((Class235) class235).anInt3248, i_20_, -(((Class235) class235).anInt3270) + i_12_, -1268043624);
									if (((Class235) class235).f_ad != null)
										method2588(i_18_, i_19_, i_13_ + -(((Class235) class235).anInt3292), i_11_, ((Class235) class235).f_ad, i_17_, ((Class235) class235).anInt3248, i_20_, i_12_ - (((Class235) class235).anInt3270), -1268043624);
									Class246_Sub40 class246_sub40 = ((Class246_Sub40) (Class246_Sub34.aClass85_5143.method544((long) (((Class235) class235).anInt3248), 126)));
									if (class246_sub40 != null)
										Class40_Sub1.method1771(i_17_, i_11_, i_18_, i_19_, (((Class246_Sub40) class246_sub40).anInt5517), i_20_, i_12_, (byte) 27, i_13_);
									if (((Class246_Sub28_Sub29.anInt6814 ^ 0xffffffff) == (((Class235) class235).anInt3280 ^ 0xffffffff)) && Class246_Sub15.aClass260_4445.method1742()) {
										Class246_Sub15.aClass260_4445.method1719();
										Class224.aBool3095 = true;
									}
									Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
								}
								if (Class37.aBoolArray546[i_11_] || ((Class210_Sub2.anInt5022 ^ 0xffffffff) < -2)) {
									if ((((Class235) class235).f_vc ^ 0xffffffff) == -4) {
										if ((i_14_ ^ 0xffffffff) == -1) {
											if (!((Class235) class235).f_uc)
												Class246_Sub15.aClass260_4445.method1753(i_12_, i_13_, (((Class235) class235).f_fc), (((Class235) class235).f_sb), (((Class235) class235).anInt3197), 0);
											else
												Class246_Sub15.aClass260_4445.O(i_12_, i_13_, (((Class235) class235).f_fc), (((Class235) class235).f_sb), (((Class235) class235).anInt3197), 0);
										} else if (!((Class235) class235).f_uc)
											Class246_Sub15.aClass260_4445.method1753(i_12_, i_13_, ((Class235) class235).f_fc, ((Class235) class235).f_sb, (-(0xff & i_14_) + 255 << 24 | (0xffffff & (((Class235) class235).anInt3197))), 1);
										else
											Class246_Sub15.aClass260_4445.O(i_12_, i_13_, ((Class235) class235).f_fc, ((Class235) class235).f_sb, ((0xffffff & (((Class235) class235).anInt3197)) | (-(0xff & i_14_) + 255 << 24)), 1);
									} else if ((((Class235) class235).f_vc ^ 0xffffffff) == -5) {
										Class116 class116 = (class235.method1512(Class246_Sub15.aClass260_4445, -1));
										if (class116 == null) {
											if (Class_u_Sub1.aBool5687)
												Stream_Sub1.method2483(class235, (byte) -109);
										} else {
											int i_34_ = (((Class235) class235).anInt3197);
											String string = (((Class235) class235).aString3247);
											if (((((Class235) class235).anInt3210) ^ 0xffffffff) != 0) {
												Class197 class197 = (Class255.aClass191_3663.method1251(22883, (((Class235) class235).anInt3210)));
												string = (((Class197) class197).aString2778);
												if (string == null)
													string = "null";
												if (((((Class197) class197).f_eb) == 1 || ((((Class235) class235).f_ec) ^ 0xffffffff) != -2) && (((Class235) class235).f_ec) != -1)
													string = ("<col=ff9040>" + string + "</col> x" + (Class239.method1536(92, (((Class235) class235).f_ec))));
											}
											if (Class163.aClass235_2312 == class235) {
												string = (Class82.aClass67_1073.method436(true, Class_j.anInt1485));
												i_34_ = (((Class235) class235).anInt3197);
											}
											if (Class257.aBool3683)
												Class246_Sub15.aClass260_4445.fa(i_12_, i_13_, i_12_ + ((Class235) class235).f_fc, (((Class235) class235).f_sb) + i_13_);
											class116.method784(i_12_, ((Class235) class235).f_sb, (255 + -(i_14_ & 0xff) << 24 | i_34_), Class243.aClass_lArray3448, null, false, (!((Class235) class235).f_cc ? -1 : (-(0xff & i_14_) + 255 << 24)), (((Class235) class235).anInt3300), 0, 0, ((Class235) class235).f_pb, string, i_13_, (((Class235) class235).anInt3259), null, ((Class235) class235).f_oc, ((Class235) class235).f_fc);
											if (Class257.aBool3683)
												Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
										}
									} else if ((((Class235) class235).f_vc ^ 0xffffffff) == -6) {
										if (((Class235) class235).anInt3213 < 0) {
											Class_l class_l;
											if (((Class235) class235).anInt3210 != -1) {
												Class27 class27 = ((((Class235) class235).f_db) ? (((Player) (Class_a.aClass_r_Sub1_1180)).aClass27_7131) : null);
												class_l = (Class255.aClass191_3663.method1248((Class246_Sub15.aClass260_4445), (((Class235) class235).anInt3210), -113, class27, (((Class235) class235).anInt3274), (((Class235) class235).f_ec), (((Class235) class235).f_dc), ((((Class235) class235).anInt3209) | ~0xffffff)));
											} else
												class_l = (class235.method1502((Class246_Sub15.aClass260_4445), (byte) 1));
											if (class_l != null) {
												int i_35_ = class_l.j();
												int i_36_ = class_l.T();
												int i_37_ = ((((((Class235) class235).anInt3197) ^ 0xffffffff) != -1 ? (((Class235) class235).anInt3197 & 0xffffff) : 16777215) | (255 + -(0xff & i_14_) << 24));
												if (((Class235) class235).aBool3286) {
													Class246_Sub15.aClass260_4445.fa(i_12_, i_13_, (((Class235) class235).f_fc) + i_12_, i_13_ + (((Class235) class235).f_sb));
													if ((((Class235) class235).anInt3260) != 0) {
														int i_38_ = ((-1 + i_35_ + (((Class235) class235).f_fc)) / i_35_);
														int i_39_ = ((-1 + i_36_ + (((Class235) class235).f_sb)) / i_36_);
														for (int i_40_ = 0; ((i_38_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff)); i_40_++) {
															for (int i_41_ = 0; ((i_41_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff)); i_41_++) {
																if ((((Class235) class235).anInt3197) == 0)
																	class_l.method736((((float) i_35_ / 2.0F) + (float) (i_35_ * i_40_ + i_12_)), (((float) i_36_ / 2.0F) + (float) (i_13_ - -(i_41_ * i_36_))), 4096, (((Class235) class235).anInt3260));
																else
																	class_l.method731(((float) (i_12_ - -(i_40_ * i_35_)) + ((float) i_35_ / 2.0F)), (((float) i_36_ / 2.0F) + (float) (i_36_ * i_41_ + i_13_)), 4096, (((Class235) class235).anInt3260), 0, i_37_, 1);
															}
														}
													} else if (((((Class235) class235).anInt3197) == 0) && ((i_14_ ^ 0xffffffff) == -1))
														class_l.method734(i_12_, i_13_, ((Class235) class235).f_fc, ((Class235) class235).f_sb);
													else
														class_l.JA(i_12_, i_13_, (((Class235) class235).f_fc), (((Class235) class235).f_sb), 0, i_37_, 1);
													Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
												} else if (((((Class235) class235).anInt3197) ^ 0xffffffff) != -1 || i_14_ != 0) {
													if ((((Class235) class235).anInt3260) != 0)
														class_l.method731(((float) i_12_ + ((float) (((Class235) class235).f_fc) / 2.0F)), (((float) (((Class235) class235).f_sb) / 2.0F) + (float) i_13_), (((Class235) class235).f_fc * 4096 / i_35_), (((Class235) class235).anInt3260), 0, i_37_, 1);
													else if (((((Class235) class235).f_fc ^ 0xffffffff) != (i_35_ ^ 0xffffffff)) || ((i_36_ ^ 0xffffffff) != ((((Class235) class235).f_sb) ^ 0xffffffff)))
														class_l.s(i_12_, i_13_, (((Class235) class235).f_fc), (((Class235) class235).f_sb), 0, i_37_, 1);
													else
														class_l.r(i_12_, i_13_, 0, i_37_, 1);
												} else if (((((Class235) class235).anInt3260) ^ 0xffffffff) == -1) {
													if (i_35_ == (((Class235) class235).f_fc) && ((((Class235) class235).f_sb ^ 0xffffffff) == (i_36_ ^ 0xffffffff)))
														class_l.method729(i_12_, i_13_);
													else
														class_l.method732(i_12_, i_13_, ((Class235) class235).f_fc, ((Class235) class235).f_sb);
												} else
													class_l.method736((((float) (((Class235) class235).f_fc) / 2.0F) + (float) i_12_), (((float) (((Class235) class235).f_sb) / 2.0F) + (float) i_13_), (4096 * ((Class235) class235).f_fc / i_35_), (((Class235) class235).anInt3260));
											} else if (Class_u_Sub1.aBool5687)
												Stream_Sub1.method2483(class235, (byte) -109);
										} else
											class235.method1513(i_9_ ^ 0x4b94cf1a, (Class246_Sub1_Sub14.aClass214_6597), Class246_Sub31.aClass203_5038).method1478(0, i_12_, i_13_, (((Class235) class235).f_id << 3), (((Class235) class235).anInt3253) << 3, Class246_Sub15.aClass260_4445, i_9_ ^ ~0x4b94f098, ((Class235) class235).f_fc, 0, ((Class235) class235).f_sb);
									} else if ((((Class235) class235).f_vc ^ 0xffffffff) == -7) {
										Class165.method1087(-109);
										Class_t class_t = null;
										int i_42_ = 0;
										if (((Class235) class235).anInt3210 == -1) {
											if (((Class235) class235).anInt3244 != 5) {
												if ((((Class235) class235).anInt3244) != 8 && ((((Class235) class235).anInt3244) ^ 0xffffffff) != -10) {
													if ((((Class235) class235).anInt3232) == -1) {
														class_t = (class235.method1509((Class255.aClass191_3663), (Class246_Sub15.aClass260_4445), (Class179.aClass228_2518), (((Player) (Class_a.aClass_r_Sub1_1180)).aClass27_7131), (Class59_Sub3_Sub3.aClass45_6275), 2048, (byte) 102, null, -1, (Class238.aClass92_3358), -1, (Class246_Sub28_Sub23.aClass95_6658), 0, (Class118.aClass_v1641)));
														if (class_t == null && (Class_u_Sub1.aBool5687))
															Stream_Sub1.method2483(class235, (byte) -109);
													} else {
														Class124 class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, (((Class235) class235).anInt3232)));
														class_t = (class235.method1509((Class255.aClass191_3663), (Class246_Sub15.aClass260_4445), (Class179.aClass228_2518), (((Player) (Class_a.aClass_r_Sub1_1180)).aClass27_7131), (Class59_Sub3_Sub3.aClass45_6275), 2048, (byte) 102, class124, (((Class235) class235).anInt3256), (Class238.aClass92_3358), (((Class235) class235).anInt3221), (Class246_Sub28_Sub23.aClass95_6658), (((Class235) class235).anInt3275), (Class118.aClass_v1641)));
														if (class_t == null && (Class_u_Sub1.aBool5687))
															Stream_Sub1.method2483(class235, (byte) -109);
													}
												} else {
													Class246_Sub18 class246_sub18 = (Class95.method610(i_9_ ^ ~0x4b94cf0c, false, (((Class235) class235).anInt3215)));
													Class124 class124 = ((((Class235) class235).anInt3232) != -1 ? (Class59_Sub3_Sub3.aClass45_6275.method304(3, (((Class235) class235).anInt3232))) : null);
													if (class246_sub18 != null) {
														Class27 class27 = (!((Class235) class235).f_db ? null : (((Player) (Class_a.aClass_r_Sub1_1180)).aClass27_7131));
														class_t = (class246_sub18.method2056(2048, ((((Class235) class235).anInt3244) == 9), (byte) 117, (((Class235) class235).anInt3221), class124, (((Class235) class235).anInt3275), (((Class235) class235).anInt3289), class27, (((Class235) class235).anInt3256), (Class246_Sub15.aClass260_4445)));
													}
												}
											} else {
												int i_43_ = (((Class235) class235).anInt3215);
												if (i_43_ >= 0 && ((i_43_ ^ 0xffffffff) > -2049)) {
													Player class_r_sub1 = (Class143.aClass_r_Sub1Array2069[i_43_]);
													Class124 class124 = (((((Class235) class235).anInt3232) ^ 0xffffffff) != 0 ? (Class59_Sub3_Sub3.aClass45_6275.method304(3, (((Class235) class235).anInt3232))) : null);
													if (class_r_sub1 != null && ((i_43_ == (Class109.anInt1567)) || ((Class246_Sub1_Sub4_Sub1.method2893((byte) -33, (((Player) class_r_sub1).aString7140))) == (((Class235) class235).anInt3289))))
														class_t = (((Player) class_r_sub1).aClass27_7131.method215((Class118.aClass_v1641), (Class238.aClass92_3358), null, 2048, null, (Class179.aClass228_2518), (((Class235) class235).anInt3221), (((Class235) class235).anInt3256), class124, (byte) 119, (Class59_Sub3_Sub3.aClass45_6275), -1, 0, (Class246_Sub15.aClass260_4445), (Class255.aClass191_3663), 0, (Class246_Sub28_Sub23.aClass95_6658), (((Class235) class235).anInt3275), true));
												}
											}
										} else {
											Class197 class197 = (Class255.aClass191_3663.method1251(i_9_ + 1268066507, (((Class235) class235).anInt3210)));
											if (class197 != null) {
												class197 = (class197.method1296((((Class235) class235).f_ec), 4223));
												Class124 class124 = ((((Class235) class235).anInt3232) != -1 ? (Class59_Sub3_Sub3.aClass45_6275.method304(3, (((Class235) class235).anInt3232))) : null);
												Class27 class27 = (!(((Class235) class235).f_db) ? null : (((Player) (Class_a.aClass_r_Sub1_1180)).aClass27_7131));
												class_t = (class197.method1281((((Class235) class235).anInt3275), 1, class124, 2048, (((Class235) class235).anInt3221), class27, (((Class235) class235).anInt3256), -124, (Class246_Sub15.aClass260_4445)));
												if (class_t == null)
													Stream_Sub1.method2483(class235, (byte) -109);
												else
													i_42_ = -class_t.MA() >> 1;
											}
										}
										if (class_t != null) {
											int i_44_;
											if (((Class235) class235).anInt3265 <= 0)
												i_44_ = 512;
											else
												i_44_ = (((((Class235) class235).f_fc) << 9) / (((Class235) class235).anInt3265));
											int i_45_;
											if (((Class235) class235).anInt3237 > 0)
												i_45_ = (((((Class235) class235).f_sb) << 9) / (((Class235) class235).anInt3237));
											else
												i_45_ = 512;
											int i_46_ = ((((Class235) class235).f_fc / 2) + i_12_ - -((((Class235) class235).anInt3287) * i_44_ >> 9));
											int i_47_ = ((((Class235) class235).f_sb / 2) + (i_13_ + (i_45_ * (((Class235) class235).anInt3238) >> 9)));
											Class130_Sub3.aClass_c4413.xa();
											Class246_Sub15.aClass260_4445.ea(Class130_Sub3.aClass_c4413);
											Class246_Sub15.aClass260_4445.H(i_46_, i_47_, i_44_, i_45_);
											Class246_Sub15.aClass260_4445.g((float) (((Class235) class235).anInt3217 << 0), (!(((Class235) class235).aBool3285) ? (float) (((Class235) class235).f_md << 0) * 1.5F : (float) (((Class235) class235).f_md << 0)));
											if (((i_6_ ^ 0xffffffff) == 1412584498) || Class224.aBool3095) {
												Class246_Sub15.aClass260_4445.e();
												Class246_Sub15.aClass260_4445.method1707();
												Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
												Class224.aBool3095 = false;
											}
											if (((Class235) class235).aBool3277)
												Class246_Sub15.aClass260_4445.method1750(false);
											int i_48_ = (((((Class235) class235).f_dd << 0) * (Class39_Sub1.f_fb[(((Class235) class235).anInt3283) << 3])) >> 15);
											int i_49_ = (((((Class235) class235).f_dd << 0) * (Class39_Sub1.anIntArray4672[(((Class235) class235).anInt3283) << 3])) >> 15);
											Class134.aClass_c1879.O(-(((Class235) class235).anInt3281) << 3);
											Class134.aClass_c1879.ja(((Class235) class235).f_gd << 3);
											Class134.aClass_c1879.o((((Class235) class235).anInt3255) << 0, (i_42_ + (i_48_ - -((((Class235) class235).anInt3271) << 0))), i_49_ - -(((Class235) class235).anInt3271 << 0));
											Class134.aClass_c1879.ka((((Class235) class235).anInt3283) << 3);
											if (Class257.aBool3683)
												Class246_Sub15.aClass260_4445.fa(i_12_, i_13_, (((Class235) class235).f_fc) + i_12_, (((Class235) class235).f_sb) + i_13_);
											if (!((Class235) class235).aBool3285)
												class_t.method680(Class134.aClass_c1879, null, 1);
											else
												class_t.method671(Class134.aClass_c1879, null, (((Class235) class235).f_dd) << 0, 1);
											if (Class257.aBool3683)
												Class246_Sub15.aClass260_4445.OA(i_5_, i, i_2_, i_7_);
											if (((Class235) class235).aBool3277)
												Class246_Sub15.aClass260_4445.method1750(true);
											Class246_Sub15.aClass260_4445.g(0.0F, 0.0F);
										}
									} else if ((((Class235) class235).f_vc ^ 0xffffffff) == -10) {
										int i_50_;
										int i_51_;
										int i_52_;
										int i_53_;
										if (((Class235) class235).aBool3207) {
											i_50_ = i_12_;
											i_52_ = (((Class235) class235).f_fc + i_12_);
											i_51_ = i_13_;
											i_53_ = (((Class235) class235).f_sb + i_13_);
										} else {
											i_50_ = i_12_;
											i_51_ = (((Class235) class235).f_sb + i_13_);
											i_52_ = i_12_ - -((Class235) class235).f_fc;
											i_53_ = i_13_;
										}
										if ((((Class235) class235).anInt3239 ^ 0xffffffff) == -2)
											Class246_Sub15.aClass260_4445.method1743(i_50_, i_53_, i_52_, i_51_, (((Class235) class235).anInt3197), 0);
										else
											Class246_Sub15.aClass260_4445.method1694(i_50_, i_53_, i_52_, i_51_, (((Class235) class235).anInt3197), (((Class235) class235).anInt3239), 0);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hi.A(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class235s != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public static void method2589(int i) {
		try {
			aClass67_6178 = null;
			if (i != 19293)
				aBool6180 = false;
			aClass67_6177 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.B(" + i + ')');
		}
	}

	static final void method2590(boolean bool) {
		try {
			if (bool == true) {
				anInt6176++;
				Class59.anInt819 = 0;
				Class47.aClass258Array684 = new Class258[50];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hi.C(" + bool + ')');
		}
	}

	static {
		aClass67_6178 = new Class67("Take", "Nehmen", "Prendre", "Pegar");
	}
}
