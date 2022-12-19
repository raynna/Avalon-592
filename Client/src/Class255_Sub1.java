/* Class255_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255_Sub1 extends Class255 {
	static int anInt5571;
	static int anInt5572;
	static int anInt5573 = 0;
	static int anInt5574;
	static float aFloat5575;
	static int anInt5576;
	static int anInt5577;
	int anInt5578 = 99;
	static int anInt5579;
	static int anInt5580;
	static int anInt5581;
	/* synthetic */ static Class aClass5582;

	final void method2336(int i, int[] is, int i_0_, Class260 class260, int i_1_, BufferStream stream) {
		do {
			try {
				anInt5571++;
				if (!((Class255) this).aBool3658) {
					boolean bool = false;
					if (is != null)
						is[0] = -1;
					Class138 class138 = null;
					while (((BufferStream) stream).position < ((BufferStream) stream).buffer.length) {
						int i_2_ = stream.readUnsignedByte(255);
						if ((i_2_ ^ 0xffffffff) == -1)
							class138 = new Class138(stream);
						else if ((i_2_ ^ 0xffffffff) != -2) {
							if ((i_2_ ^ 0xffffffff) == -3) {
								if (class138 == null)
									class138 = new Class138();
								class138.method933((byte) -31, stream);
							} else if (i_2_ != 128) {
								if (i_2_ != 129)
									throw new IllegalStateException("");
								if (((Class255) this).aByteArrayArrayArray3649 == null)
									((Class255) this).aByteArrayArrayArray3649 = new byte[4][][];
								bool = true;
								for (int i_3_ = 0; i_3_ < 4; i_3_++) {
									byte i_4_ = stream.readByte(false);
									if (i_4_ == 0 && (((Class255) this).aByteArrayArrayArray3649[i_3_]) != null) {
										int i_5_ = i_1_;
										int i_6_ = 64 + i_1_;
										int i_7_ = i_0_;
										if ((i_7_ ^ 0xffffffff) > -1)
											i_7_ = 0;
										else if ((((Class255) this).anInt3643 ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
											i_7_ = ((Class255) this).anInt3643;
										if (i_5_ >= 0) {
											if (((Class255) this).anInt3661 <= i_5_)
												i_5_ = (((Class255) this).anInt3661);
										} else
											i_5_ = 0;
										if (i_6_ < 0)
											i_6_ = 0;
										else if ((((Class255) this).anInt3661 ^ 0xffffffff) >= (i_6_ ^ 0xffffffff))
											i_6_ = ((Class255) this).anInt3661;
										int i_8_ = 64 + i_0_;
										if ((i_8_ ^ 0xffffffff) > -1)
											i_8_ = 0;
										else if (i_8_ >= (((Class255) this).anInt3643))
											i_8_ = ((Class255) this).anInt3643;
										for (/**/; i_6_ > i_5_; i_5_++) {
											for (/**/; i_8_ > i_7_; i_7_++)
												((Class255) this).aByteArrayArrayArray3649[i_3_][i_5_][i_7_] = (byte) 0;
										}
									} else if (i_4_ != 1) {
										if ((i_4_ ^ 0xffffffff) == -3) {
											if ((((Class255) this).aByteArrayArrayArray3649[i_3_]) == null)
												((Class255) this).aByteArrayArrayArray3649[i_3_] = (new byte[1 + (((Class255) this).anInt3661)][1 + (((Class255) this).anInt3643)]);
											if (i_3_ > 0) {
												int i_9_ = i_1_;
												int i_10_ = i_1_ + 64;
												int i_11_ = i_0_;
												if (i_10_ < 0)
													i_10_ = 0;
												else if ((((Class255) this).anInt3661) <= i_10_)
													i_10_ = (((Class255) this).anInt3661);
												if ((i_11_ ^ 0xffffffff) <= -1) {
													if ((i_11_ ^ 0xffffffff) <= ((((Class255) this).anInt3643) ^ 0xffffffff))
														i_11_ = ((Class255) this).anInt3643;
												} else
													i_11_ = 0;
												int i_12_ = i_0_ + 64;
												if ((i_9_ ^ 0xffffffff) > -1)
													i_9_ = 0;
												else if (((((Class255) this).anInt3661) ^ 0xffffffff) >= (i_9_ ^ 0xffffffff))
													i_9_ = (((Class255) this).anInt3661);
												if ((i_12_ ^ 0xffffffff) <= -1) {
													if ((i_12_ ^ 0xffffffff) <= ((((Class255) this).anInt3643) ^ 0xffffffff))
														i_12_ = ((Class255) this).anInt3643;
												} else
													i_12_ = 0;
												for (/**/; ((i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)); i_9_++) {
													for (/**/; i_12_ > i_11_; i_11_++)
														((Class255) this).aByteArrayArrayArray3649[i_3_][i_9_][i_11_] = (((Class255) this).aByteArrayArrayArray3649[i_3_ - 1][i_9_][i_11_]);
												}
											}
										}
									} else {
										if ((((Class255) this).aByteArrayArrayArray3649[i_3_]) == null)
											((Class255) this).aByteArrayArrayArray3649[i_3_] = (new byte[1 + (((Class255) this).anInt3661)][(((Class255) this).anInt3643) + 1]);
										for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65; i_13_ += 4) {
											for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_ += 4) {
												byte i_15_ = stream.readByte(false);
												for (int i_16_ = i_13_ - -i_1_; (i_16_ < 4 + (i_1_ + i_13_)); i_16_++) {
													for (int i_17_ = i_0_ + i_14_; ((i_14_ - -i_0_ + 4 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
														if (i_16_ >= 0 && ((((Class255) this).anInt3661) > i_16_) && i_17_ >= 0 && (i_17_ < (((Class255) this).anInt3643)))
															((Class255) this).aByteArrayArrayArray3649[i_3_][i_16_][i_17_] = i_15_;
													}
												}
											}
										}
									}
								}
							} else if (is == null)
								((BufferStream) stream).position += 10;
							else {
								is[0] = stream.readUnsignedShort((byte) -72);
								is[1] = stream.method2375((byte) 1);
								is[2] = stream.method2375((byte) 1);
								is[3] = stream.method2375((byte) 1);
								is[4] = stream.readUnsignedShort((byte) 88);
							}
						} else {
							int i_18_ = stream.readUnsignedByte(255);
							if (i_18_ > 0) {
								for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff)); i_19_++) {
									Class174 class174 = new Class174(class260, stream, 0);
									if ((((Class174) class174).anInt2450 ^ 0xffffffff) == -32) {
										Class173 class173 = (Class228.aClass189_3132.method1243(stream.readUnsignedShort((byte) -125), 70));
										class174.method1145(((Class173) class173).anInt2440, ((Class173) class173).anInt2445, ((Class173) class173).anInt2443, ((Class173) class173).anInt2437, (byte) -101);
									}
									if (class260.method1701() > 0) {
										Class246_Sub41 class246_sub41 = (((Class174) class174).aClass246_Sub41_2452);
										int i_20_ = ((i_1_ << 7) + class246_sub41.method2317(false));
										int i_21_ = (class246_sub41.method2321((byte) -56) - -(i_0_ << 7));
										int i_22_ = i_20_ >> 7;
										int i_23_ = i_21_ >> 7;
										if ((i_22_ ^ 0xffffffff) <= -1 && i_23_ >= 0 && (((Class255) this).anInt3661 > i_22_) && (((Class255) this).anInt3643 > i_23_)) {
											class246_sub41.method2320(i_20_, ((((Class255) this).anIntArrayArrayArray3664[(((Class174) class174).anInt2461)][i_22_][i_23_]) - (class246_sub41.method2318((byte) 27))), i_21_, (byte) 21);
											if (class260.method1701() > 0)
												Class246_Sub28_Sub17.method2659(class174);
										}
									}
								}
							}
						}
					}
					if (class138 != null) {
						for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -9; i_24_++) {
							for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -9; i_25_++) {
								int i_26_ = (i_1_ >> 3) + i_24_;
								int i_27_ = i_25_ + (i_0_ >> 3);
								if (i_26_ >= 0 && i_26_ < ((Class255) this).anInt3661 >> 3 && (i_27_ ^ 0xffffffff) <= -1 && (i_27_ < ((Class255) this).anInt3643 >> 3))
									Class60.method411(class138, false, i_26_, i_27_);
							}
						}
					}
					if (i == 0) {
						if (bool || (((Class255) this).aByteArrayArrayArray3649 == null))
							break;
						for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -5; i_28_++) {
							if ((((Class255) this).aByteArrayArrayArray3649[i_28_]) != null) {
								for (int i_29_ = 0; i_29_ < 16; i_29_++) {
									for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -17; i_30_++) {
										int i_31_ = i_29_ + (i_1_ >> 2);
										int i_32_ = i_30_ + (i_0_ >> 2);
										if (i_31_ >= 0 && (i_31_ ^ 0xffffffff) > -27 && i_32_ >= 0 && i_32_ < 26)
											((Class255) this).aByteArrayArrayArray3649[i_28_][i_31_][i_32_] = (byte) 0;
									}
								}
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wn.R(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_1_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2337(Class260 class260, int i, Class199 class199, int i_33_, int i_34_, int i_35_, int i_36_) {
		while_150_: do {
			do {
				try {
					anInt5577++;
					Class_f class_f = null;
					if (i_33_ == 0)
						class_f = (Class_f) Class246_Sub22.method2082(i_34_, i_36_, i_35_);
					if ((i_33_ ^ 0xffffffff) == -2)
						class_f = (Class_f) Class31.method236(i_34_, i_36_, i_35_);
					if ((i_33_ ^ 0xffffffff) == -3)
						class_f = (Class_f) (Class17.method168(i_34_, i_36_, i_35_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f")))));
					if (i == (i_33_ ^ 0xffffffff))
						class_f = (Class_f) Class246_Sub14.method1997(i_34_, i_36_, i_35_);
					if (class_f == null)
						break while_150_;
					Class185 class185 = Class143.aClass251_2067.method1610(class_f.method21(true), 0);
					int i_37_ = class_f.method24(-45);
					int i_38_ = class_f.method18((byte) -70);
					if (class185.method1203(0))
						Class246_Sub1_Sub12.method2620(i_35_, i_36_, 36161, i_34_, class185);
					if (class_f.method22(10869))
						class_f.method20(true, class260);
					if (i_33_ == 0) {
						Class59_Sub4 class59_sub4 = Class246_Sub22.method2082(i_34_, i_36_, i_35_);
						if (!(class59_sub4 instanceof Class59_Sub4_Sub1))
							Class197.method1285(i_34_, i_36_, i_35_);
						else
							((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4).aClass59_Sub4_6317 = null;
						if (((Class185) class185).anInt2634 != 0) {
							class199.method1321(i ^ 0x56, i_38_, i_37_, i_35_, i_36_, (((Class185) class185).aBool2620), !(((Class185) class185).aBool2577));
							break;
						}
					} else {
						if (i_33_ != 1) {
							if ((i_33_ ^ 0xffffffff) == -3) {
								Class59_Sub3 class59_sub3 = (Class17.method168(i_34_, i_36_, i_35_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f")))));
								if (class59_sub3 instanceof Class59_Sub3_Sub1 && ((i_36_ ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3).aShort5057) ^ 0xffffffff)) && i_35_ == (((Class59_Sub3) class59_sub3).aShort5064))
									((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3).aClass59_Sub3_5732 = null;
								else
									Class103.method653(i_34_, i_36_, i_35_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f"))));
								if (((Class185) class185).anInt2634 != 0 && (((Class255) this).anInt3661 > (((Class185) class185).anInt2596 + i_36_)) && ((((Class255) this).anInt3643 ^ 0xffffffff) < ((i_35_ + ((Class185) class185).anInt2596) ^ 0xffffffff)) && (((Class255) this).anInt3661 > (i_36_ - -((Class185) class185).anInt2570)) && ((((Class255) this).anInt3643 ^ 0xffffffff) < ((i_35_ + ((Class185) class185).anInt2570) ^ 0xffffffff)))
									class199.method1310(i_35_, i_38_, ((Class185) class185).aBool2620, i ^ ~0x5981, ((Class185) class185).anInt2596, i_36_, !((Class185) class185).aBool2577, ((Class185) class185).anInt2570);
							} else {
								if ((i_33_ ^ 0xffffffff) != -4)
									break;
								Class59_Sub1 class59_sub1 = Class246_Sub14.method1997(i_34_, i_36_, i_35_);
								if (class59_sub1 instanceof Class59_Sub1_Sub1)
									((Class59_Sub1_Sub1) (Class59_Sub1_Sub1) class59_sub1).aClass59_Sub1_5982 = null;
								else
									Class232.method1490(i_34_, i_36_, i_35_);
								if ((((Class185) class185).anInt2634 ^ 0xffffffff) != -2)
									break;
								class199.method1320(i_36_, i_35_, false);
							}
							break;
						}
						Class59_Sub2 class59_sub2 = Class31.method236(i_34_, i_36_, i_35_);
						if (!(class59_sub2 instanceof Class59_Sub2_Sub2)) {
							Class40_Sub9.method2308(i_34_, i_36_, i_35_);
							break;
						}
						((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2).aClass59_Sub2_6009 = null;
					}
				} catch (RuntimeException runtimeexception) {
					throw Class193.method1272(runtimeexception, ("wn.P(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + (class199 != null ? "{...}" : "null") + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	final void method2338(Class199[] class199s, int i, byte[] is, int i_39_, int i_40_, Class260 class260) {
		try {
			anInt5580++;
			if (i_40_ == 1) {
				BufferStream stream = new BufferStream(is);
				int i_41_ = -1;
				for (;;) {
					int i_42_ = stream.method2362(44);
					if (i_42_ == 0)
						break;
					i_41_ += i_42_;
					int i_43_ = 0;
					for (;;) {
						int i_44_ = stream.readSmart((byte) 79);
						if (i_44_ == 0)
							break;
						i_43_ += i_44_ - 1;
						int i_45_ = i_43_ & 0x3f;
						int i_46_ = i_43_ >> 6 & 0x3f;
						int i_47_ = i_43_ >> 12;
						int i_48_ = stream.readUnsignedByte(255);
						int i_49_ = i_48_ >> 2;
						int i_50_ = 0x3 & i_48_;
						int i_51_ = i_46_ + i_39_;
						int i_52_ = i + i_45_;
						if ((i_51_ ^ 0xffffffff) < -1 && (i_52_ ^ 0xffffffff) < -1 && ((Class255) this).anInt3661 - 1 > i_51_ && ((i_52_ ^ 0xffffffff) > (((Class255) this).anInt3643 - 1 ^ 0xffffffff))) {
							Class199 class199 = null;
							if (!((Class255) this).aBool3658) {
								int i_53_ = i_47_;
								if ((0x2 & (Class45.aByteArrayArrayArray648[1][i_51_][i_52_]) ^ 0xffffffff) == -3)
									i_53_--;
								if ((i_53_ ^ 0xffffffff) <= -1)
									class199 = class199s[i_53_];
							}
							method2341(i_51_, i_47_, i_50_, -1, i_41_, class260, i_49_, i_52_, i_47_, (byte) 26, class199);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wn.S(" + (class199s != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_39_ + ',' + i_40_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2339(int i, int i_54_, BufferStream stream, int[] is, Class260 class260, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		do {
			try {
				anInt5574++;
				if (!((Class255) this).aBool3658) {
					boolean bool = false;
					Class138 class138 = null;
					if (is != null)
						is[0] = -1;
					int i_61_ = (i_56_ & 0x7) * 8;
					int i_62_ = i_58_ * (0x7 & i_55_);
					while (((BufferStream) stream).position < ((BufferStream) stream).buffer.length) {
						int i_63_ = stream.readUnsignedByte(i_58_ ^ 0xf7);
						if ((i_63_ ^ 0xffffffff) != -1) {
							if ((i_63_ ^ 0xffffffff) != -2) {
								if (i_63_ != 2) {
									if (i_63_ != 128) {
										if ((i_63_ ^ 0xffffffff) != -130)
											throw new IllegalStateException("");
										if ((((Class255) this).aByteArrayArrayArray3649) == null)
											((Class255) this).aByteArrayArrayArray3649 = new byte[4][][];
										for (int i_64_ = 0; i_64_ < 4; i_64_++) {
											byte i_65_ = stream.readByte(false);
											if (i_65_ != 0 || (((Class255) this).aByteArrayArrayArray3649[i]) == null) {
												if (i_65_ == 1) {
													if ((((Class255) this).aByteArrayArrayArray3649[i]) == null)
														((Class255) this).aByteArrayArrayArray3649[i] = (new byte[((((Class255) this).anInt3661) + 1)][((((Class255) this).anInt3643) + 1)]);
													for (int i_66_ = 0; ((i_66_ ^ 0xffffffff) > -65); i_66_ += 4) {
														for (int i_67_ = 0; i_67_ < 64; i_67_ += 4) {
															byte i_68_ = (stream.readByte(false));
															if (i_64_ <= i_59_) {
																for (int i_69_ = i_66_; (4 + i_66_ > i_69_); i_69_++) {
																	for (int i_70_ = i_67_; (i_70_ < 4 + i_67_); i_70_++) {
																		if ((i_69_ >= i_61_) && 8 + i_61_ > i_69_ && (i_70_ ^ 0xffffffff) <= (i_62_ ^ 0xffffffff) && i_62_ + 8 > i_62_) {
																			int i_71_ = i_60_ - -Class230.method1475(i_70_ & 0x7, i_57_, 64, 0x7 & i_69_);
																			int i_72_ = Class135.method914(i_57_, (byte) -115, 0x7 & i_69_, i_70_ & 0x7) + i_54_;
																			if (i_71_ >= 0 && (((Class255) this).anInt3661 ^ 0xffffffff) < (i_71_ ^ 0xffffffff) && (i_72_ ^ 0xffffffff) <= -1 && (i_72_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff))
																				((Class255) this).aByteArrayArrayArray3649[i][i_71_][i_72_] = i_68_;
																		}
																	}
																}
															}
														}
													}
												}
											} else if (i_64_ <= i_59_) {
												int i_73_ = i_60_;
												int i_74_ = i_60_ + 7;
												int i_75_ = i_54_;
												if ((i_75_ ^ 0xffffffff) <= -1) {
													if (((((Class255) this).anInt3643) ^ 0xffffffff) >= (i_75_ ^ 0xffffffff))
														i_75_ = ((Class255) this).anInt3643;
												} else
													i_75_ = 0;
												if (i_74_ < 0)
													i_74_ = 0;
												else if (i_74_ >= (((Class255) this).anInt3661))
													i_74_ = (((Class255) this).anInt3661);
												int i_76_ = i_54_ + 7;
												if ((i_73_ ^ 0xffffffff) <= -1) {
													if ((((Class255) this).anInt3661) <= i_73_)
														i_73_ = ((Class255) this).anInt3661;
												} else
													i_73_ = 0;
												if (i_76_ < 0)
													i_76_ = 0;
												else if (((((Class255) this).anInt3643) ^ 0xffffffff) >= (i_76_ ^ 0xffffffff))
													i_76_ = (((Class255) this).anInt3643);
												for (/**/; ((i_73_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff)); i_73_++) {
													for (/**/; ((i_76_ ^ 0xffffffff) < (i_75_ ^ 0xffffffff)); i_75_++)
														((Class255) this).aByteArrayArrayArray3649[i][i_73_][i_75_] = (byte) 0;
												}
											}
										}
									} else if (is == null)
										((BufferStream) stream).position += 10;
									else {
										is[0] = stream.readUnsignedShort((byte) 84);
										is[1] = stream.method2375((byte) 1);
										is[2] = stream.method2375((byte) 1);
										is[3] = stream.method2375((byte) 1);
										is[4] = stream.readUnsignedShort((byte) 109);
									}
								} else {
									if (class138 == null)
										class138 = new Class138();
									class138.method933((byte) -31, stream);
								}
							} else {
								int i_77_ = stream.readUnsignedByte(255);
								if (i_77_ > 0) {
									for (int i_78_ = 0; ((i_78_ ^ 0xffffffff) > (i_77_ ^ 0xffffffff)); i_78_++) {
										Class174 class174 = new Class174(class260, stream, 0);
										if ((((Class174) class174).anInt2450 ^ 0xffffffff) == -32) {
											Class173 class173 = (Class228.aClass189_3132.method1243(stream.readUnsignedShort((byte) 93), 96));
											class174.method1145((((Class173) class173).anInt2440), (((Class173) class173).anInt2445), (((Class173) class173).anInt2443), (((Class173) class173).anInt2437), (byte) 124);
										}
										if ((class260.method1701() ^ 0xffffffff) < -1) {
											Class246_Sub41 class246_sub41 = (((Class174) class174).aClass246_Sub41_2452);
											int i_79_ = (class246_sub41.method2317(false) >> 7);
											int i_80_ = (class246_sub41.method2321((byte) -124) >> 7);
											if ((((Class174) class174).anInt2461) == i_59_ && ((i_79_ ^ 0xffffffff) <= (i_61_ ^ 0xffffffff)) && i_79_ < i_61_ + 8 && ((i_80_ ^ 0xffffffff) <= (i_62_ ^ 0xffffffff)) && ((8 + i_62_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff))) {
												int i_81_ = ((i_60_ << 7) - -(Class187_Sub2.method2287(i_57_, ((class246_sub41.method2321((byte) -52)) & 0x3ff), -32457, (0x3ff & (class246_sub41.method2317(false))))));
												int i_82_ = ((i_54_ << 7) - -(Class53.method366((0x3ff & (class246_sub41.method2321((byte) -74))), (0x3ff & (class246_sub41.method2317(false))), false, i_57_)));
												i_79_ = i_81_ >> 7;
												i_80_ = i_82_ >> 7;
												if ((i_79_ ^ 0xffffffff) <= -1 && ((i_80_ ^ 0xffffffff) <= -1) && (((Class255) this).anInt3661) > i_79_ && (((Class255) this).anInt3643) > i_80_) {
													class246_sub41.method2320(i_81_, ((((Class255) this).anIntArrayArrayArray3664[i_59_][i_79_][i_80_]) - (class246_sub41.method2318((byte) 27))), i_82_, (byte) 21);
													if ((class260.method1701() ^ 0xffffffff) < -1)
														Class246_Sub28_Sub17.method2659(class174);
												}
											}
										}
									}
								}
							}
						} else
							class138 = new Class138(stream);
					}
					if (class138 != null)
						Class60.method411(class138, false, i_60_ >> 3, i_54_ >> 3);
					if (bool || ((Class255) this).aByteArrayArrayArray3649 == null || (((Class255) this).aByteArrayArrayArray3649[i] == null))
						break;
					int i_83_ = 7 + i_60_;
					int i_84_ = i_54_ + 7;
					for (int i_85_ = i_60_; (i_85_ ^ 0xffffffff) > (i_83_ ^ 0xffffffff); i_85_++) {
						for (int i_86_ = i_54_; (i_86_ ^ 0xffffffff) > (i_84_ ^ 0xffffffff); i_86_++)
							((Class255) this).aByteArrayArrayArray3649[i][i_85_][i_86_] = (byte) 0;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wn.V(" + i + ',' + i_54_ + ',' + (stream != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2340(byte[] is, int i, int i_87_, int i_88_, int i_89_, int i_90_, Class260 class260, int i_91_, Class199[] class199s, int i_92_, byte i_93_) {
		try {
			anInt5579++;
			BufferStream stream = new BufferStream(is);
			if (i_93_ == 103) {
				int i_94_ = -1;
				for (;;) {
					int i_95_ = stream.method2362(41);
					if ((i_95_ ^ 0xffffffff) == -1)
						break;
					i_94_ += i_95_;
					int i_96_ = 0;
					for (;;) {
						int i_97_ = stream.readSmart((byte) 99);
						if (i_97_ == 0)
							break;
						i_96_ += -1 + i_97_;
						int i_98_ = i_96_ & 0x3f;
						int i_99_ = (0xff4 & i_96_) >> 6;
						int i_100_ = i_96_ >> 12;
						int i_101_ = stream.readUnsignedByte(255);
						int i_102_ = i_101_ >> 2;
						int i_103_ = 0x3 & i_101_;
						if (i_100_ == i_92_ && i_87_ <= i_99_ && (8 + i_87_ ^ 0xffffffff) < (i_99_ ^ 0xffffffff) && i_98_ >= i_91_ && i_98_ < i_91_ + 8) {
							Class185 class185 = Class143.aClass251_2067.method1610(i_94_, 0);
							int i_104_ = Class99.method628(0x7 & i_99_, i_88_, (((Class185) class185).anInt2570), i_98_ & 0x7, 15993, i_103_, (((Class185) class185).anInt2596)) + i;
							int i_105_ = i_89_ + (Class246_Sub2.method1786(((Class185) class185).anInt2596, i_103_, i_88_, (byte) 108, ((Class185) class185).anInt2570, i_98_ & 0x7, 0x7 & i_99_));
							if ((i_104_ ^ 0xffffffff) < -1 && (i_105_ ^ 0xffffffff) < -1 && ((Class255) this).anInt3661 - 1 > i_104_ && i_105_ < ((Class255) this).anInt3643 - 1) {
								Class199 class199 = null;
								if (!((Class255) this).aBool3658) {
									int i_106_ = i_90_;
									if ((0x2 & (Class45.aByteArrayArrayArray648[1][i_104_][i_105_]) ^ 0xffffffff) == -3)
										i_106_--;
									if ((i_106_ ^ 0xffffffff) <= -1)
										class199 = class199s[i_106_];
								}
								method2341(i_104_, i_90_, i_88_ + i_103_ & 0x3, -1, i_94_, class260, i_102_, i_105_, i_90_, (byte) 45, class199);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wn.Q(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_87_ + ',' + i_88_ + ',' + i_89_ + ',' + i_90_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_91_ + ',' + (class199s != null ? "{...}" : "null") + ',' + i_92_ + ',' + i_93_ + ')'));
		}
	}

	final void method2341(int i, int i_107_, int i_108_, int i_109_, int i_110_, Class260 class260, int i_111_, int i_112_, int i_113_, byte i_114_, Class199 class199) {
		try {
			anInt5581++;
			if (Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 127) || IntegerNode.method2179(i, Class40_Sub6.anInt5103, (byte) 56, i_113_, i_112_)) {
				if (((Class255_Sub1) this).anInt5578 > i_107_)
					((Class255_Sub1) this).anInt5578 = i_107_;
				Class185 class185 = Class143.aClass251_2067.method1610(i_110_, 0);
				if (!class260.method1692() || !(((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609) || !((Class185) class185).aBool2611) {
					int i_115_;
					int i_116_;
					if (i_108_ != 1 && i_108_ != 3) {
						i_115_ = ((Class185) class185).anInt2596;
						i_116_ = ((Class185) class185).anInt2570;
					} else {
						i_115_ = ((Class185) class185).anInt2570;
						i_116_ = ((Class185) class185).anInt2596;
					}
					int i_117_;
					int i_118_;
					if (((Class255) this).anInt3661 >= i + i_115_) {
						i_117_ = i + (i_115_ >> 1);
						i_118_ = (1 + i_115_ >> 1) + i;
					} else {
						i_117_ = i;
						i_118_ = i + 1;
					}
					if (i_114_ < 18)
						method2341(-74, 32, 17, -72, 23, null, 4, 37, 72, (byte) -46, null);
					int i_119_;
					int i_120_;
					if ((i_112_ - -i_116_ ^ 0xffffffff) < (((Class255) this).anInt3643 ^ 0xffffffff)) {
						i_119_ = i_112_ + 1;
						i_120_ = i_112_;
					} else {
						i_119_ = (1 + i_116_ >> 1) + i_112_;
						i_120_ = (i_116_ >> 1) + i_112_;
					}
					Class210 class210 = Class59_Sub3_Sub4.aClass210Array6993[i_113_];
					int i_121_ = ((class210.l(i_117_, i_120_) + (class210.l(i_118_, i_120_) + class210.l(i_117_, i_119_) - -class210.l(i_118_, i_119_))) >> 2);
					int i_122_ = (i << 7) - -(i_115_ << 6);
					int i_123_ = (i_112_ << 7) - -(i_116_ << 6);
					boolean bool = (Class168.aBool2394 && !((Class255) this).aBool3658 && ((Class185) class185).aBool2594);
					if (class185.method1203(0))
						Class66.method434(i, -1, null, null, i_112_, i_108_, i_107_, class185);
					boolean bool_124_ = (i_109_ == -1 && (((Class185) class185).f_pb ^ 0xffffffff) == 0 && ((Class185) class185).anIntArray2586 == null && ((Class185) class185).f_bb == null && !((Class185) class185).f_qb);
					if (!Class238.aBool3361 || ((!HashMap.method370(i_111_, (byte) -38) || ((Class185) class185).anInt2616 == 1) && (!Class130_Sub6.method2104(85, i_111_) || ((Class185) class185).anInt2616 != 0))) {
						if (i_111_ == 22) {
							if (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool607 || ((Class185) class185).anInt2590 != 0 || (((Class185) class185).anInt2634 ^ 0xffffffff) == -2 || ((Class185) class185).aBool2627) {
								Class59_Sub1 class59_sub1;
								if (bool_124_) {
									Class59_Sub1_Sub3 class59_sub1_sub3 = (new Class59_Sub1_Sub3(class260, class185, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, bool));
									if (class59_sub1_sub3.method22(10869))
										class59_sub1_sub3.method19(class260, -12694);
									class59_sub1 = class59_sub1_sub3;
								} else
									class59_sub1 = (new Class59_Sub1_Sub2(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, i_109_));
								Class59_Sub1 class59_sub1_125_ = Class246_Sub14.method1997(i_107_, i, i_112_);
								if (!(class59_sub1_125_ instanceof Class59_Sub1_Sub1))
									Class213.method1393(i_107_, i, i_112_, class59_sub1);
								else
									((Class59_Sub1_Sub1) (Class59_Sub1_Sub1) class59_sub1_125_).aClass59_Sub1_5982 = class59_sub1;
								if ((((Class185) class185).anInt2634 ^ 0xffffffff) == -2 && class199 != null)
									class199.method1308(-1, i_112_, i);
							}
						} else if ((i_111_ ^ 0xffffffff) == -11 || (i_111_ ^ 0xffffffff) == -12) {
							Class59_Sub3_Sub4 class59_sub3_sub4 = null;
							Class59_Sub3 class59_sub3;
							int i_126_;
							if (bool_124_) {
								Class59_Sub3_Sub4 class59_sub3_sub4_127_ = (new Class59_Sub3_Sub4(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, -1 + i_115_ + i, i_112_, -1 + (i_112_ + i_116_), i_111_, i_108_, bool));
								class59_sub3 = class59_sub3_sub4_127_;
								class59_sub3_sub4 = class59_sub3_sub4_127_;
								i_126_ = class59_sub3_sub4_127_.method2866(20922);
							} else {
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, -1 + (i + i_115_), i_112_, -1 + (i_112_ + i_116_), i_111_, i_108_, i_109_));
								i_126_ = 15;
							}
							Class59_Sub3 class59_sub3_128_ = (Class17.method168(i_107_, i, i_112_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f")))));
							boolean bool_129_ = false;
							if (class59_sub3_128_ instanceof Class59_Sub3_Sub1 && ((i ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_128_).aShort5057) ^ 0xffffffff)) && ((i_112_ ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_128_).aShort5064) ^ 0xffffffff))) {
								bool_129_ = true;
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_128_).aClass59_Sub3_5732 = class59_sub3;
							}
							if (bool_129_ || Class176.method1156(class59_sub3, false)) {
								if (class59_sub3_sub4 != null && class59_sub3_sub4.method22(10869))
									class59_sub3_sub4.method19(class260, -12694);
								if (((Class185) class185).f_vb && Class168.aBool2394) {
									if ((i_126_ ^ 0xffffffff) < -31)
										i_126_ = 30;
									for (int i_130_ = 0; ((i_115_ ^ 0xffffffff) <= (i_130_ ^ 0xffffffff)); i_130_++) {
										for (int i_131_ = 0; ((i_116_ ^ 0xffffffff) <= (i_131_ ^ 0xffffffff)); i_131_++)
											class210.i(i - -i_130_, i_112_ - -i_131_, i_126_);
									}
								}
							}
							if (((Class185) class185).anInt2634 != 0 && class199 != null)
								class199.method1314(i_115_, (((Class185) class185).aBool2620), 16624, i_116_, !(((Class185) class185).aBool2577), i, i_112_);
						} else if (((i_111_ ^ 0xffffffff) <= -13 && (i_111_ ^ 0xffffffff) >= -18) || ((i_111_ ^ 0xffffffff) <= -19 && (i_111_ ^ 0xffffffff) >= -22)) {
							Class59_Sub3 class59_sub3;
							if (bool_124_) {
								Class59_Sub3_Sub4 class59_sub3_sub4 = (new Class59_Sub3_Sub4(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, -1 + i + i_115_, i_112_, i_112_ + (i_116_ - 1), i_111_, i_108_, bool));
								class59_sub3 = class59_sub3_sub4;
								if (class59_sub3_sub4.method22(10869))
									class59_sub3_sub4.method19(class260, -12694);
							} else
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, -1 + (i_115_ + i), i_112_, -1 + (i_112_ + i_116_), i_111_, i_108_, i_109_));
							Class59_Sub3 class59_sub3_132_ = (Class17.method168(i_107_, i, i_112_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f")))));
							if (class59_sub3_132_ instanceof Class59_Sub3_Sub1 && ((((Class59_Sub3) class59_sub3_132_).aShort5057) ^ 0xffffffff) == (i ^ 0xffffffff) && ((i_112_ ^ 0xffffffff) == ((((Class59_Sub3) class59_sub3_132_).aShort5064) ^ 0xffffffff)))
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_132_).aClass59_Sub3_5732 = class59_sub3;
							else
								Class176.method1156(class59_sub3, false);
							if (Class168.aBool2394 && !((Class255) this).aBool3658 && i_111_ >= 12 && (i_111_ ^ 0xffffffff) >= -18 && (i_111_ ^ 0xffffffff) != -14 && i_107_ > 0 && (((Class185) class185).anInt2616 ^ 0xffffffff) != -1)
								((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 4));
							if (((((Class185) class185).anInt2634 ^ 0xffffffff) != -1) && class199 != null)
								class199.method1314(i_115_, (((Class185) class185).aBool2620), 16624, i_116_, !(((Class185) class185).aBool2577), i, i_112_);
						} else if (i_111_ == 0) {
							int i_133_ = ((Class185) class185).anInt2616;
							if (Class93.aBool1224 && (((Class185) class185).anInt2616 ^ 0xffffffff) == 0)
								i_133_ = 1;
							Class59_Sub4 class59_sub4;
							if (!bool_124_)
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, i_109_);
							else {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, bool);
								class59_sub4 = class59_sub4_sub2;
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
							}
							Class59_Sub4 class59_sub4_134_ = Class246_Sub22.method2082(i_107_, i, i_112_);
							if (!(class59_sub4_134_ instanceof Class59_Sub4_Sub1))
								Class246_Sub2.method1785(i_107_, i, i_112_, class59_sub4, null);
							else
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_134_).aClass59_Sub4_6317 = class59_sub4;
							if (Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if ((i_108_ ^ 0xffffffff) == -3) {
											if (((Class185) class185).f_vb) {
												class210.i(i + 1, i_112_, 50);
												class210.i(1 + i, i_112_ + 1, 50);
											}
											if ((i_133_ ^ 0xffffffff) == -2 && !(((Class255) this).aBool3658))
												((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_]), 1));
										} else if (i_108_ == 3) {
											if (((Class185) class185).f_vb) {
												class210.i(i, i_112_, 50);
												class210.i(i + 1, i_112_, 50);
											}
											if (i_133_ == 1 && !(((Class255) this).aBool3658))
												((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 2));
										}
									} else {
										if (((Class185) class185).f_vb) {
											class210.i(i, i_112_ + 1, 50);
											class210.i(1 + i, i_112_ + 1, 50);
										}
										if (i_133_ == 1 && !((Class255) this).aBool3658)
											((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_ + 1] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_ + 1]), 2));
									}
								} else {
									if (((Class185) class185).f_vb) {
										class210.i(i, i_112_, 50);
										class210.i(i, 1 + i_112_, 50);
									}
									if ((i_133_ ^ 0xffffffff) == -2 && !((Class255) this).aBool3658)
										((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 1));
								}
							}
							if (((((Class185) class185).anInt2634 ^ 0xffffffff) != -1) && class199 != null)
								class199.method1318(i_112_, ((Class185) class185).aBool2620, i, 268435456, i_108_, !((Class185) class185).aBool2577, i_111_);
							if (((Class185) class185).anInt2593 != 16)
								Class175.method1152(i_107_, i, i_112_, (((Class185) class185).anInt2593));
						} else if (i_111_ == 1) {
							Class59_Sub4 class59_sub4;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4 = class59_sub4_sub2;
							} else
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, i_109_);
							Class59_Sub4 class59_sub4_135_ = Class246_Sub22.method2082(i_107_, i, i_112_);
							if (!(class59_sub4_135_ instanceof Class59_Sub4_Sub1))
								Class246_Sub2.method1785(i_107_, i, i_112_, class59_sub4, null);
							else
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_135_).aClass59_Sub4_6317 = class59_sub4;
							if (((Class185) class185).f_vb && Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if ((i_108_ ^ 0xffffffff) != -3) {
											if (i_108_ == 3)
												class210.i(i, i_112_, 50);
										} else
											class210.i(1 + i, i_112_, 50);
									} else
										class210.i(1 + i, 1 + i_112_, 50);
								} else
									class210.i(i, i_112_ + 1, 50);
							}
							if (((Class185) class185).anInt2634 != 0 && class199 != null)
								class199.method1318(i_112_, ((Class185) class185).aBool2620, i, 268435456, i_108_, !((Class185) class185).aBool2577, i_111_);
						} else if ((i_111_ ^ 0xffffffff) == -3) {
							int i_136_ = i_108_ + 1 & 0x3;
							Class59_Sub4 class59_sub4;
							Class59_Sub4 class59_sub4_137_;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_ + 4, bool);
								Class59_Sub4_Sub2 class59_sub4_sub2_138_ = new Class59_Sub4_Sub2(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_136_, bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4_137_ = class59_sub4_sub2_138_;
								class59_sub4 = class59_sub4_sub2;
								if (class59_sub4_sub2_138_.method22(10869))
									class59_sub4_sub2_138_.method19(class260, -12694);
							} else {
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_ + 4, i_109_);
								class59_sub4_137_ = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_136_, i_109_);
							}
							Class246_Sub2.method1785(i_107_, i, i_112_, class59_sub4, class59_sub4_137_);
							if (((((Class185) class185).anInt2616 ^ 0xffffffff) == -2) && Class168.aBool2394 && !((Class255) this).aBool3658) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if ((i_108_ ^ 0xffffffff) != -2) {
										if (i_108_ == 2) {
											((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_]), 1));
											((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 2));
										} else if ((i_108_ ^ 0xffffffff) == -4) {
											((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 2));
											((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 1));
										}
									} else {
										((Class255) this).aByteArrayArrayArray3641[i_107_][i][1 + i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][1 + i_112_]), 2));
										((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][1 + i][i_112_]), 1));
									}
								} else {
									((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_]), 1));
									((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_ + 1] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_107_][i][i_112_ + 1]), 2));
								}
							}
							if (((Class185) class185).anInt2634 != 0 && class199 != null)
								class199.method1318(i_112_, ((Class185) class185).aBool2620, i, 268435456, i_108_, !((Class185) class185).aBool2577, i_111_);
							if (((Class185) class185).anInt2593 != 16)
								Class175.method1152(i_107_, i, i_112_, (((Class185) class185).anInt2593));
						} else if ((i_111_ ^ 0xffffffff) == -4) {
							Class59_Sub4 class59_sub4;
							if (bool_124_) {
								Class59_Sub4_Sub2 class59_sub4_sub2 = new Class59_Sub4_Sub2(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, bool);
								if (class59_sub4_sub2.method22(10869))
									class59_sub4_sub2.method19(class260, -12694);
								class59_sub4 = class59_sub4_sub2;
							} else
								class59_sub4 = new Class59_Sub4_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_111_, i_108_, i_109_);
							Class59_Sub4 class59_sub4_139_ = Class246_Sub22.method2082(i_107_, i, i_112_);
							if (class59_sub4_139_ instanceof Class59_Sub4_Sub1)
								((Class59_Sub4_Sub1) (Class59_Sub4_Sub1) class59_sub4_139_).aClass59_Sub4_6317 = class59_sub4;
							else
								Class246_Sub2.method1785(i_107_, i, i_112_, class59_sub4, null);
							if (((Class185) class185).f_vb && Class168.aBool2394) {
								if ((i_108_ ^ 0xffffffff) != -1) {
									if (i_108_ != 1) {
										if (i_108_ != 2) {
											if (i_108_ == 3)
												class210.i(i, i_112_, 50);
										} else
											class210.i(1 + i, i_112_, 50);
									} else
										class210.i(i + 1, 1 + i_112_, 50);
								} else
									class210.i(i, 1 + i_112_, 50);
							}
							if (((((Class185) class185).anInt2634 ^ 0xffffffff) != -1) && class199 != null)
								class199.method1318(i_112_, ((Class185) class185).aBool2620, i, 268435456, i_108_, !((Class185) class185).aBool2577, i_111_);
						} else if (i_111_ == 9) {
							Class59_Sub3 class59_sub3;
							if (!bool_124_)
								class59_sub3 = (new Class59_Sub3_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, i + (i_115_ - 1), i_112_, -1 + (i_112_ + i_116_), i_111_, i_108_, i_109_));
							else {
								Class59_Sub3_Sub4 class59_sub3_sub4 = (new Class59_Sub3_Sub4(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i, i, i_112_, i_112_, i_111_, i_108_, bool));
								class59_sub3 = class59_sub3_sub4;
								if (class59_sub3_sub4.method22(10869))
									class59_sub3_sub4.method19(class260, -12694);
							}
							Class59_Sub3 class59_sub3_140_ = (Class17.method168(i_107_, i, i_112_, (aClass5582 != null ? aClass5582 : (aClass5582 = getClassByName("Class_f")))));
							if (class59_sub3_140_ instanceof Class59_Sub3_Sub1 && ((((Class59_Sub3) class59_sub3_140_).aShort5057) ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class59_Sub3) class59_sub3_140_).aShort5064) ^ 0xffffffff) == (i_112_ ^ 0xffffffff))
								((Class59_Sub3_Sub1) (Class59_Sub3_Sub1) class59_sub3_140_).aClass59_Sub3_5732 = class59_sub3;
							else
								Class176.method1156(class59_sub3, false);
							if (((((Class185) class185).anInt2634 ^ 0xffffffff) != -1) && class199 != null)
								class199.method1314(i_115_, (((Class185) class185).aBool2620), 16624, i_116_, !(((Class185) class185).aBool2577), i, i_112_);
							if ((((Class185) class185).anInt2593 ^ 0xffffffff) != -17)
								Class175.method1152(i_107_, i, i_112_, (((Class185) class185).anInt2593));
						} else if (i_111_ == 4) {
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), 0, 0, 0, i_111_, i_108_);
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1;
							} else
								class59_sub2 = new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), 0, 0, 0, i_111_, i_108_, i_109_);
							Class59_Sub2 class59_sub2_141_ = Class31.method236(i_107_, i, i_112_);
							if (!(class59_sub2_141_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, i, i_112_, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_141_).aClass59_Sub2_6009 = class59_sub2;
						} else if (i_111_ == 5) {
							int i_142_ = 17;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, i, i_112_));
							if (class_f != null)
								i_142_ = ((Class185) (Class143.aClass251_2067.method1610(class_f.method21(true), 0))).anInt2593 + 1;
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, 0, (Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_142_, (i_142_ * Class189.anIntArray2673[i_108_]), i_111_, i_108_));
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1;
							} else
								class59_sub2 = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, 0, (Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_142_, (i_142_ * Class189.anIntArray2673[i_108_]), i_111_, i_108_, i_109_));
							Class59_Sub2 class59_sub2_143_ = Class31.method236(i_107_, i, i_112_);
							if (!(class59_sub2_143_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, i, i_112_, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_143_).aClass59_Sub2_6009 = class59_sub2;
						} else if (i_111_ == 6) {
							int i_144_ = 9;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, i, i_112_));
							if (class_f != null)
								i_144_ = 1 + ((Class185) (Class143.aClass251_2067.method1610(class_f.method21(true), 0))).anInt2593 / 2;
							Class59_Sub2 class59_sub2;
							if (bool_124_) {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, (Class59_Sub3_Sub2.anIntArray5878[i_108_]) * i_144_, (Class189.anIntArray2673[i_108_] * i_144_), i_111_, 4 + i_108_));
								class59_sub2 = class59_sub2_sub1;
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
							} else
								class59_sub2 = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, i_144_ * (Class246_Sub37_Sub1.anIntArray5936[i_108_]), i_144_ * Class59.anIntArray822[i_108_], i_111_, i_108_ + 4, i_109_));
							Class59_Sub2 class59_sub2_145_ = Class31.method236(i_107_, i, i_112_);
							if (class59_sub2_145_ instanceof Class59_Sub2_Sub2)
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_145_).aClass59_Sub2_6009 = class59_sub2;
							else
								Class41.method285(i_107_, i, i_112_, class59_sub2, null);
						} else if ((i_111_ ^ 0xffffffff) == -8) {
							int i_146_ = 0x3 & 2 + i_108_;
							Class59_Sub2 class59_sub2;
							if (!bool_124_)
								class59_sub2 = new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_146_, 0, 0, i_111_, 4 + i_146_, i_109_);
							else {
								Class59_Sub2_Sub1 class59_sub2_sub1 = new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_146_, 0, 0, i_111_, i_146_ + 4);
								class59_sub2 = class59_sub2_sub1;
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
							}
							Class59_Sub2 class59_sub2_147_ = Class31.method236(i_107_, i, i_112_);
							if (!(class59_sub2_147_ instanceof Class59_Sub2_Sub2))
								Class41.method285(i_107_, i, i_112_, class59_sub2, null);
							else
								((Class59_Sub2_Sub2) (Class59_Sub2_Sub2) class59_sub2_147_).aClass59_Sub2_6009 = class59_sub2;
						} else if (i_111_ == 8) {
							int i_148_ = i_108_ + 2 & 0x3;
							int i_149_ = 9;
							Class_f class_f = ((Class_f) Class246_Sub22.method2082(i_107_, i, i_112_));
							if (class_f != null)
								i_149_ = ((Class185) (Class143.aClass251_2067.method1610(class_f.method21(true), 0))).anInt2593 / 2 + 1;
							Class59_Sub2 class59_sub2;
							Class59_Sub2 class59_sub2_150_;
							if (!bool_124_) {
								Class59_Sub2_Sub3 class59_sub2_sub3 = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, (Class246_Sub37_Sub1.anIntArray5936[i_108_]) * i_149_, Class59.anIntArray822[i_108_] * i_149_, i_111_, i_108_ + 4, i_109_));
								Class59_Sub2_Sub3 class59_sub2_sub3_151_ = (new Class59_Sub2_Sub3(class260, class185, i_107_, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, 0, 0, i_111_, i_148_ + 4, i_109_));
								class59_sub2_150_ = class59_sub2_sub3;
								class59_sub2 = class59_sub2_sub3_151_;
							} else {
								Class59_Sub2_Sub1 class59_sub2_sub1 = (new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, ((Class255) this).aBool3658, i_108_, i_149_ * (Class246_Sub37_Sub1.anIntArray5936[i_108_]), Class59.anIntArray822[i_108_] * i_149_, i_111_, i_108_ + 4));
								Class59_Sub2_Sub1 class59_sub2_sub1_152_ = new Class59_Sub2_Sub1(class260, class185, i_113_, i_122_, i_121_, i_123_, (((Class255) this).aBool3658), i_108_, 0, 0, i_111_, i_148_ + 4);
								if (class59_sub2_sub1.method22(10869))
									class59_sub2_sub1.method19(class260, -12694);
								class59_sub2 = class59_sub2_sub1_152_;
								if (class59_sub2_sub1_152_.method22(10869))
									class59_sub2_sub1_152_.method19(class260, -12694);
								class59_sub2_150_ = class59_sub2_sub1;
							}
							Class41.method285(i_107_, i, i_112_, class59_sub2_150_, class59_sub2);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wn.U(" + i + ',' + i_107_ + ',' + i_108_ + ',' + i_109_ + ',' + i_110_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_111_ + ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ',' + (class199 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class12[] method2342(boolean bool) {
		try {
			anInt5572++;
			if (bool != true)
				anInt5573 = -81;
			return (new Class12[] { Class246_Sub30.SEND_PROJECTILE, Class233.aClass12_3185, Class81.aClass12_1066, Class57.aClass12_809, Class96.aClass12_1256, SubIncomingPacket.SOME_PACKET, Class16.aClass12_238, Class169.SOME_PACKET_3, Class238.REMOVE_GROUND_ITEM, Class228.DESTROY_WORLD_OBJECT, Class71.SEND_GROUND_ITEM, Class18.aClass12_259, Class78.SEND_WORLD_OBJECT, Class247.aClass12_3482, SubIncomingPacket.aClass12_7094 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wn.T(" + bool + ')');
		}
	}

	Class255_Sub1(int i, int i_153_, int i_154_, boolean bool) {
		super(i, i_153_, i_154_, bool, Class82.aClass105_1072, Class246_Sub28_Sub21.aClass175_6587);
	}

	final void method2343(int i, Class260 class260) {
		try {
			anInt5576++;
			Class21_Sub4.method2132(class260);
			if ((((Class255) this).anInt3670 ^ 0xffffffff) < -2) {
				for (int i_155_ = 0; ((((Class255) this).anInt3661 ^ 0xffffffff) < (i_155_ ^ 0xffffffff)); i_155_++) {
					for (int i_156_ = 0; ((((Class255) this).anInt3643 ^ 0xffffffff) < (i_156_ ^ 0xffffffff)); i_156_++) {
						if ((0x2 & (Class45.aByteArrayArrayArray648[1][i_155_][i_156_])) == 2)
							Class228.method1457(i_155_, i_156_);
					}
				}
			}
			int i_157_ = -115 / ((42 - i) / 46);
			for (int i_158_ = 0; ((i_158_ ^ 0xffffffff) > (((Class255) this).anInt3670 ^ 0xffffffff)); i_158_++) {
				for (int i_159_ = 0; i_159_ <= ((Class255) this).anInt3643; i_159_++) {
					for (int i_160_ = 0; ((((Class255) this).anInt3661 ^ 0xffffffff) <= (i_160_ ^ 0xffffffff)); i_160_++) {
						if ((0x1 & (((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][i_159_]) ^ 0xffffffff) != -1) {
							int i_161_ = i_159_;
							int i_162_ = i_159_;
							int i_163_ = i_158_;
							for (/**/; ((((Class255) this).anInt3643 ^ 0xffffffff) < (i_162_ ^ 0xffffffff)); i_162_++) {
								if ((0x1 & (((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][i_162_ + 1])) == 0)
									break;
							}
							for (/**/; ((i_161_ ^ 0xffffffff) < -1 && ((((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][-1 + i_161_]) & 0x1) != 0); i_161_--) {
								/* empty */
							}
							int i_164_ = i_158_;
							while_151_: for (/**/; (i_163_ ^ 0xffffffff) < -1; i_163_--) {
								for (int i_165_ = i_161_; i_162_ >= i_165_; i_165_++) {
									if (((((Class255) this).aByteArrayArrayArray3641[-1 + i_163_][i_160_][i_165_]) & 0x1) == 0)
										break while_151_;
								}
							}
							while_152_: for (/**/; i_164_ < 3; i_164_++) {
								for (int i_166_ = i_161_; i_162_ >= i_166_; i_166_++) {
									if ((0x1 & (((Class255) this).aByteArrayArrayArray3641[i_164_ + 1][i_160_][i_166_])) == 0)
										break while_152_;
								}
							}
							int i_167_ = ((1 + i_162_ - i_161_) * (-i_163_ + (1 + i_164_)));
							if ((i_167_ ^ 0xffffffff) <= -3) {
								int i_168_ = 240;
								int i_169_ = ((((Class255) this).anIntArrayArrayArray3664[i_164_][i_160_][i_161_]) - i_168_);
								int i_170_ = (((Class255) this).anIntArrayArrayArray3664[i_163_][i_160_][i_161_]);
								Class24.method206(1, i_160_ << 7, i_160_ << 7, i_161_ << 7, (i_162_ << 7) + 128, i_169_, i_170_);
								for (int i_171_ = i_163_; ((i_164_ ^ 0xffffffff) <= (i_171_ ^ 0xffffffff)); i_171_++) {
									for (int i_172_ = i_161_; i_172_ <= i_162_; i_172_++)
										((Class255) this).aByteArrayArrayArray3641[i_171_][i_160_][i_172_] = (byte) (PacketsDecoder.method184((((Class255) this).aByteArrayArrayArray3641[i_171_][i_160_][i_172_]), -2));
								}
							}
						}
						if (((((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][i_159_]) & 0x2) != 0) {
							int i_173_ = i_160_;
							int i_174_ = i_160_;
							int i_175_ = i_158_;
							for (/**/; i_174_ < ((Class255) this).anInt3661; i_174_++) {
								if (((((Class255) this).aByteArrayArrayArray3641[i_158_][1 + i_174_][i_159_]) & 0x2 ^ 0xffffffff) == -1)
									break;
							}
							for (/**/; ((i_173_ ^ 0xffffffff) < -1 && ((((Class255) this).aByteArrayArrayArray3641[i_158_][-1 + i_173_][i_159_]) & 0x2 ^ 0xffffffff) != -1); i_173_--) {
								/* empty */
							}
							int i_176_ = i_158_;
							while_153_: for (/**/; i_175_ > 0; i_175_--) {
								for (int i_177_ = i_173_; i_177_ <= i_174_; i_177_++) {
									if ((0x2 & (((Class255) this).aByteArrayArrayArray3641[i_175_ - 1][i_177_][i_159_]) ^ 0xffffffff) == -1)
										break while_153_;
								}
							}
							while_154_: for (/**/; (i_176_ ^ 0xffffffff) > -4; i_176_++) {
								for (int i_178_ = i_173_; ((i_178_ ^ 0xffffffff) >= (i_174_ ^ 0xffffffff)); i_178_++) {
									if (((((Class255) this).aByteArrayArrayArray3641[i_176_ + 1][i_178_][i_159_]) & 0x2) == 0)
										break while_154_;
								}
							}
							int i_179_ = ((-i_175_ + (1 + i_176_)) * (-i_173_ + i_174_ + 1));
							if ((i_179_ ^ 0xffffffff) <= -3) {
								int i_180_ = 240;
								int i_181_ = ((((Class255) this).anIntArrayArrayArray3664[i_176_][i_173_][i_159_]) - i_180_);
								int i_182_ = (((Class255) this).anIntArrayArrayArray3664[i_175_][i_173_][i_159_]);
								Class24.method206(2, i_173_ << 7, (i_174_ << 7) + 128, i_159_ << 7, i_159_ << 7, i_181_, i_182_);
								for (int i_183_ = i_175_; i_176_ >= i_183_; i_183_++) {
									for (int i_184_ = i_173_; i_174_ >= i_184_; i_184_++)
										((Class255) this).aByteArrayArrayArray3641[i_183_][i_184_][i_159_] = (byte) (PacketsDecoder.method184((((Class255) this).aByteArrayArrayArray3641[i_183_][i_184_][i_159_]), -3));
								}
							}
						}
						if ((0x4 & (((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][i_159_])) != 0) {
							int i_185_ = i_160_;
							int i_186_ = i_160_;
							int i_187_;
							for (i_187_ = i_159_; ((i_187_ ^ 0xffffffff) < -1 && ((((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][-1 + i_187_]) & 0x4) != 0); i_187_--) {
								/* empty */
							}
							int i_188_;
							for (i_188_ = i_159_; ((i_188_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)); i_188_++) {
								if ((0x4 & (((Class255) this).aByteArrayArrayArray3641[i_158_][i_160_][1 + i_188_])) == 0)
									break;
							}
							while_155_: for (/**/; i_185_ > 0; i_185_--) {
								for (int i_189_ = i_187_; i_188_ >= i_189_; i_189_++) {
									if (((((Class255) this).aByteArrayArrayArray3641[i_158_][i_185_ - 1][i_189_]) & 0x4 ^ 0xffffffff) == -1)
										break while_155_;
								}
							}
							while_156_: for (/**/; ((i_186_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)); i_186_++) {
								for (int i_190_ = i_187_; i_188_ >= i_190_; i_190_++) {
									if (((((Class255) this).aByteArrayArrayArray3641[i_158_][i_186_ + 1][i_190_]) & 0x4) == 0)
										break while_156_;
								}
							}
							if (((i_188_ - i_187_ + 1) * (-i_185_ + (i_186_ + 1)) ^ 0xffffffff) <= -5) {
								int i_191_ = (((Class255) this).anIntArrayArrayArray3664[i_158_][i_185_][i_187_]);
								Class24.method206(4, i_185_ << 7, 128 + (i_186_ << 7), i_187_ << 7, 128 + (i_188_ << 7), i_191_, i_191_);
								for (int i_192_ = i_185_; ((i_186_ ^ 0xffffffff) <= (i_192_ ^ 0xffffffff)); i_192_++) {
									for (int i_193_ = i_187_; i_193_ <= i_188_; i_193_++)
										((Class255) this).aByteArrayArrayArray3641[i_158_][i_192_][i_193_] = (byte) (PacketsDecoder.method184((((Class255) this).aByteArrayArrayArray3641[i_158_][i_192_][i_193_]), -5));
								}
							}
						}
					}
				}
			}
			((Class255) this).aByteArrayArrayArray3641 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wn.O(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
