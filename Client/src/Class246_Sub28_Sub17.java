
/* Class246_Sub28_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class246_Sub28_Sub17 extends Class246_Sub28 {
	static int anInt6405;
	static int anInt6406;
	static int anInt6407;
	static int anInt6408;
	static Class246_Sub1_Sub5 aClass246_Sub1_Sub5_6409;
	static OutgoingPacket aClass201_6410 = new OutgoingPacket(32, -1);
	private int anInt6411 = 6;
	static Class_fs index12;

	public static void method2657(int i) {
		do {
			try {
				index12 = null;
				aClass246_Sub1_Sub5_6409 = null;
				aClass201_6410 = null;
				if (i == 31444)
					break;
				method2657(-52);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ju.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[][] method2139(byte i, int i_0_) {
		try {
			anInt6407++;
			if (i <= 33)
				return null;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -103, i_0_);
			while_137_: do {
				if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
					int[][] is_1_ = this.method2141(3, 0, i_0_);
					int[][] is_2_ = this.method2141(3, 1, i_0_);
					int[] is_3_ = is[0];
					int[] is_4_ = is[1];
					int[] is_5_ = is[2];
					int[] is_6_ = is_1_[0];
					int[] is_7_ = is_1_[1];
					int[] is_8_ = is_1_[2];
					int[] is_9_ = is_2_[0];
					int[] is_10_ = is_2_[1];
					int[] is_11_ = is_2_[2];
					int i_12_ = anInt6411;
					while_136_: do {
						while_135_: do {
							while_134_: do {
								while_133_: do {
									while_132_: do {
										while_131_: do {
											while_130_: do {
												while_129_: do {
													while_128_: do {
														do {
															if (i_12_ != 1) {
																if (i_12_ != 2) {
																	if ((i_12_ ^ 0xffffffff) != -4) {
																		if (i_12_ != 4) {
																			if ((i_12_ ^ 0xffffffff) != -6) {
																				if (i_12_ != 6) {
																					if (i_12_ != 7) {
																						if ((i_12_ ^ 0xffffffff) != -9) {
																							if (i_12_ != 9) {
																								if ((i_12_ ^ 0xffffffff) != -11) {
																									if ((i_12_ ^ 0xffffffff) != -12) {
																										if (i_12_ != 12)
																											break while_137_;
																									} else
																										break while_135_;
																									break while_136_;
																								}
																							} else
																								break while_133_;
																							break while_134_;
																						}
																					} else
																						break while_131_;
																					break while_132_;
																				}
																			} else
																				break while_129_;
																			break while_130_;
																		}
																	} else
																		break;
																	break while_128_;
																}
															} else {
																for (i_12_ = 0; (((Class246_Sub37_Sub1.f_gb) ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
																	is_3_[i_12_] = ((is_6_[i_12_]) - -is_9_[i_12_]);
																	is_4_[i_12_] = ((is_10_[i_12_]) + is_7_[i_12_]);
																	is_5_[i_12_] = ((is_8_[i_12_]) - -is_11_[i_12_]);
																}
																break while_137_;
															}
															for (i_12_ = 0; ((Class246_Sub37_Sub1.f_gb) > i_12_); i_12_++) {
																is_3_[i_12_] = (-(is_9_[i_12_]) + (is_6_[i_12_]));
																is_4_[i_12_] = (-(is_10_[i_12_]) + (is_7_[i_12_]));
																is_5_[i_12_] = ((is_8_[i_12_]) - (is_11_[i_12_]));
															}
															break while_137_;
														} while (false);
														for (i_12_ = 0; (i_12_ < (Class246_Sub37_Sub1.f_gb)); i_12_++) {
															is_3_[i_12_] = (((is_6_[i_12_]) * (is_9_[i_12_])) >> 12);
															is_4_[i_12_] = (((is_10_[i_12_]) * (is_7_[i_12_])) >> 12);
															is_5_[i_12_] = (((is_8_[i_12_]) * (is_11_[i_12_])) >> 12);
														}
														break while_137_;
													} while (false);
													for (i_12_ = 0; (i_12_ < (Class246_Sub37_Sub1.f_gb)); i_12_++) {
														int i_13_ = is_9_[i_12_];
														int i_14_ = is_10_[i_12_];
														int i_15_ = is_11_[i_12_];
														is_3_[i_12_] = (((i_13_ ^ 0xffffffff) != -1) ? ((is_6_[i_12_] << 12) / i_13_) : 4096);
														is_4_[i_12_] = (((i_14_ ^ 0xffffffff) != -1) ? ((is_7_[i_12_] << 12) / i_14_) : 4096);
														is_5_[i_12_] = (i_15_ != 0 ? ((is_8_[i_12_] << 12) / i_15_) : 4096);
													}
													break while_137_;
												} while (false);
												for (i_12_ = 0; (Class246_Sub37_Sub1.f_gb > i_12_); i_12_++) {
													is_3_[i_12_] = -(((-is_6_[i_12_] + 4096) * (4096 + -(is_9_[i_12_]))) >> 12) + 4096;
													is_4_[i_12_] = -(((4096 - is_7_[i_12_]) * (4096 - (is_10_[i_12_]))) >> 12) + 4096;
													is_5_[i_12_] = -(((4096 + -is_11_[i_12_]) * (-is_8_[i_12_] + 4096)) >> 12) + 4096;
												}
												break while_137_;
											} while (false);
											for (i_12_ = 0; (Class246_Sub37_Sub1.f_gb > i_12_); i_12_++) {
												int i_16_ = is_10_[i_12_];
												int i_17_ = is_9_[i_12_];
												int i_18_ = is_11_[i_12_];
												is_3_[i_12_] = (i_17_ < 2048 ? (is_6_[i_12_] * i_17_ >> 11) : (4096 + -(((4096 + -(is_6_[i_12_])) * (-i_17_ + 4096)) >> 11)));
												is_4_[i_12_] = (i_16_ >= 2048 ? (4096 + -(((4096 + -(is_7_[i_12_])) * (-i_16_ + 4096)) >> 11)) : (is_7_[i_12_] * i_16_ >> 11));
												is_5_[i_12_] = (i_18_ < 2048 ? (is_8_[i_12_] * i_18_ >> 11) : -(((4096 - is_8_[i_12_]) * (-i_18_ + 4096)) >> 11) + 4096);
											}
											break while_137_;
										} while (false);
										for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_12_++) {
											int i_19_ = is_7_[i_12_];
											int i_20_ = is_6_[i_12_];
											int i_21_ = is_8_[i_12_];
											is_3_[i_12_] = (((i_20_ ^ 0xffffffff) == -4097) ? 4096 : ((is_9_[i_12_] << 12) / (4096 + -i_20_)));
											is_4_[i_12_] = (i_19_ == 4096 ? 4096 : ((is_10_[i_12_] << 12) / (4096 - i_19_)));
											is_5_[i_12_] = (i_21_ == 4096 ? 4096 : ((is_11_[i_12_] << 12) / (4096 - i_21_)));
										}
										break while_137_;
									} while (false);
									for (i_12_ = 0; Class246_Sub37_Sub1.f_gb > i_12_; i_12_++) {
										int i_22_ = is_6_[i_12_];
										int i_23_ = is_7_[i_12_];
										int i_24_ = is_8_[i_12_];
										is_3_[i_12_] = (i_22_ != 0 ? -((-is_9_[i_12_] + 4096 << 12) / i_22_) + 4096 : 0);
										is_4_[i_12_] = (i_23_ == 0 ? 0 : 4096 - (4096 - is_10_[i_12_] << 12) / i_23_);
										is_5_[i_12_] = (i_24_ == 0 ? 0 : 4096 + -((4096 - is_11_[i_12_] << 12) / i_24_));
									}
									break while_137_;
								} while (false);
								for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_12_++) {
									int i_25_ = is_10_[i_12_];
									int i_26_ = is_8_[i_12_];
									int i_27_ = is_6_[i_12_];
									int i_28_ = is_9_[i_12_];
									int i_29_ = is_11_[i_12_];
									int i_30_ = is_7_[i_12_];
									is_3_[i_12_] = i_27_ >= i_28_ ? i_28_ : i_27_;
									is_4_[i_12_] = i_30_ < i_25_ ? i_30_ : i_25_;
									is_5_[i_12_] = i_26_ < i_29_ ? i_26_ : i_29_;
								}
								break while_137_;
							} while (false);
							for (i_12_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
								int i_31_ = is_10_[i_12_];
								int i_32_ = is_9_[i_12_];
								int i_33_ = is_8_[i_12_];
								int i_34_ = is_11_[i_12_];
								int i_35_ = is_6_[i_12_];
								int i_36_ = is_7_[i_12_];
								is_3_[i_12_] = ((i_32_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff) ? i_35_ : i_32_);
								is_4_[i_12_] = ((i_36_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff) ? i_36_ : i_31_);
								is_5_[i_12_] = ((i_33_ ^ 0xffffffff) >= (i_34_ ^ 0xffffffff) ? i_34_ : i_33_);
							}
							break while_137_;
						} while (false);
						for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_12_++) {
							int i_37_ = is_11_[i_12_];
							int i_38_ = is_6_[i_12_];
							int i_39_ = is_9_[i_12_];
							int i_40_ = is_10_[i_12_];
							int i_41_ = is_8_[i_12_];
							int i_42_ = is_7_[i_12_];
							is_3_[i_12_] = (i_39_ < i_38_ ? -i_39_ + i_38_ : -i_38_ + i_39_);
							is_4_[i_12_] = ((i_40_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff) ? -i_40_ + i_42_ : i_40_ - i_42_);
							is_5_[i_12_] = (i_37_ >= i_41_ ? -i_41_ + i_37_ : i_41_ - i_37_);
						}
						break while_137_;
					} while (false);
					for (i_12_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						int i_43_ = is_10_[i_12_];
						int i_44_ = is_7_[i_12_];
						int i_45_ = is_6_[i_12_];
						int i_46_ = is_9_[i_12_];
						int i_47_ = is_8_[i_12_];
						int i_48_ = is_11_[i_12_];
						is_3_[i_12_] = -(i_45_ * i_46_ >> 11) + i_45_ - -i_46_;
						is_4_[i_12_] = i_44_ + i_43_ - (i_44_ * i_43_ >> 11);
						is_5_[i_12_] = -(i_47_ * i_48_ >> 11) + (i_48_ + i_47_);
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ju.J(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2143(int i, int i_49_, BufferStream stream) {
		while_138_: do {
			try {
				anInt6408++;
				if (i != 4)
					method2657(3);
				int i_50_ = i_49_;
				do {
					if ((i_50_ ^ 0xffffffff) != -1) {
						if (i_50_ != 1)
							break while_138_;
						if (!client.f_ob)
							break;
					}
					anInt6411 = stream.readUnsignedByte(255);
					return;
				} while (false);
				((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ju.G(" + i + ',' + i_49_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	final int[] method2135(int i, int i_51_) {
		try {
			int i_52_ = -84 % ((i - 67) / 50);
			anInt6405++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_51_);
			while_148_: do {
				if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
					int[] is_53_ = this.method2133(i_51_, 0, 0);
					int[] is_54_ = this.method2133(i_51_, 1, 0);
					int i_55_ = anInt6411;
					while_147_: do {
						while_146_: do {
							while_145_: do {
								while_144_: do {
									while_143_: do {
										while_142_: do {
											while_141_: do {
												while_140_: do {
													while_139_: do {
														do {
															if (i_55_ != 1) {
																if (i_55_ != 2) {
																	if (i_55_ != 3) {
																		if (i_55_ != 4) {
																			if (i_55_ != 5) {
																				if ((i_55_ ^ 0xffffffff) != -7) {
																					if ((i_55_ ^ 0xffffffff) != -8) {
																						if (i_55_ != 8) {
																							if (i_55_ != 9) {
																								if (i_55_ != 10) {
																									if (i_55_ != 11) {
																										if ((i_55_ ^ 0xffffffff) != -13)
																											break while_148_;
																									} else
																										break while_146_;
																									break while_147_;
																								}
																							} else
																								break while_144_;
																							break while_145_;
																						}
																					} else
																						break while_142_;
																					break while_143_;
																				}
																			} else
																				break while_140_;
																			break while_141_;
																		}
																	} else
																		break;
																	break while_139_;
																}
															} else {
																for (i_55_ = 0; ((i_55_ ^ 0xffffffff) > ((Class246_Sub37_Sub1.f_gb) ^ 0xffffffff)); i_55_++)
																	is[i_55_] = ((is_54_[i_55_]) + is_53_[i_55_]);
																break while_148_;
															}
															for (i_55_ = 0; ((Class246_Sub37_Sub1.f_gb) > i_55_); i_55_++)
																is[i_55_] = (-(is_54_[i_55_]) + (is_53_[i_55_]));
															break while_148_;
														} while (false);
														for (i_55_ = 0; (Class246_Sub37_Sub1.f_gb) > i_55_; i_55_++)
															is[i_55_] = (((is_54_[i_55_]) * (is_53_[i_55_])) >> 12);
														break while_148_;
													} while (false);
													for (i_55_ = 0; (((Class246_Sub37_Sub1.f_gb) ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++) {
														int i_56_ = is_54_[i_55_];
														is[i_55_] = (i_56_ != 0 ? (((is_53_[i_55_]) << 12) / i_56_) : 4096);
													}
													break while_148_;
												} while (false);
												for (i_55_ = 0; (Class246_Sub37_Sub1.f_gb > i_55_); i_55_++)
													is[i_55_] = (4096 + -(((-is_53_[i_55_] + 4096) * (4096 + -(is_54_[i_55_]))) >> 12));
												break while_148_;
											} while (false);
											for (i_55_ = 0; (i_55_ < Class246_Sub37_Sub1.f_gb); i_55_++) {
												int i_57_ = is_54_[i_55_];
												is[i_55_] = (i_57_ >= 2048 ? -(((-i_57_ + 4096) * (-is_53_[i_55_] + 4096)) >> 11) + 4096 : (i_57_ * is_53_[i_55_] >> 11));
											}
											break while_148_;
										} while (false);
										for (i_55_ = 0; i_55_ < Class246_Sub37_Sub1.f_gb; i_55_++) {
											int i_58_ = is_53_[i_55_];
											is[i_55_] = (((i_58_ ^ 0xffffffff) == -4097) ? 4096 : ((is_54_[i_55_] << 12) / (4096 + -i_58_)));
										}
										break while_148_;
									} while (false);
									for (i_55_ = 0; Class246_Sub37_Sub1.f_gb > i_55_; i_55_++) {
										int i_59_ = is_53_[i_55_];
										is[i_55_] = ((i_59_ ^ 0xffffffff) != -1 ? 4096 - (4096 - is_54_[i_55_] << 12) / i_59_ : 0);
									}
									break while_148_;
								} while (false);
								for (i_55_ = 0; i_55_ < Class246_Sub37_Sub1.f_gb; i_55_++) {
									int i_60_ = is_54_[i_55_];
									int i_61_ = is_53_[i_55_];
									is[i_55_] = i_60_ <= i_61_ ? i_60_ : i_61_;
								}
								break while_148_;
							} while (false);
							for (i_55_ = 0; i_55_ < Class246_Sub37_Sub1.f_gb; i_55_++) {
								int i_62_ = is_53_[i_55_];
								int i_63_ = is_54_[i_55_];
								is[i_55_] = ((i_62_ ^ 0xffffffff) >= (i_63_ ^ 0xffffffff) ? i_63_ : i_62_);
							}
							break while_148_;
						} while (false);
						for (i_55_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++) {
							int i_64_ = is_53_[i_55_];
							int i_65_ = is_54_[i_55_];
							is[i_55_] = ((i_65_ ^ 0xffffffff) > (i_64_ ^ 0xffffffff) ? -i_65_ + i_64_ : -i_64_ + i_65_);
						}
						break while_148_;
					} while (false);
					for (i_55_ = 0; ((i_55_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_55_++) {
						int i_66_ = is_53_[i_55_];
						int i_67_ = is_54_[i_55_];
						is[i_55_] = -(i_66_ * i_67_ >> 11) + i_66_ - -i_67_;
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ju.E(" + i + ',' + i_51_ + ')');
		}
	}

	static final Class182 method2658(Signlink class52, int i, String string, int i_68_) {
		try {
			anInt6406++;
			if ((i ^ 0xffffffff) == -1)
				return class52.method348(string, 14);
			if (i_68_ <= 116)
				index12 = null;
			if (i == 1) {
				try {
					Class80.method519((byte) 17, class52.anApplet733, "openjs", new Object[] { new URL(class52.anApplet733.getCodeBase(), string).toString() });
					Class182 class182 = new Class182();
					class182.anInt2539 = 1;
					return class182;
				} catch (Throwable throwable) {
					Class182 class182 = new Class182();
					class182.anInt2539 = 2;
					return class182;
				}
			}
			if ((i ^ 0xffffffff) == -3) {
				try {
					class52.anApplet733.getAppletContext().showDocument(new URL(class52.anApplet733.getCodeBase(), string), "_blank");
					Class182 class182 = new Class182();
					class182.anInt2539 = 1;
					return class182;
				} catch (Exception exception) {
					Class182 class182 = new Class182();
					class182.anInt2539 = 2;
					return class182;
				}
			}
			if (i == 3) {
				try {
					Class80.method521(class52.anApplet733, "loggedout", 90);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					class52.anApplet733.getAppletContext().showDocument(new URL(class52.anApplet733.getCodeBase(), string), "_top");
					Class182 class182 = new Class182();
					class182.anInt2539 = 1;
					return class182;
				} catch (Exception exception) {
					Class182 class182 = new Class182();
					class182.anInt2539 = 2;
					return class182;
				}
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ju.A(" + (class52 != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + i_68_ + ')'));
		}
	}

	static final void method2659(Class174 class174) {
		if (Class_c.anInt1195 < 65535) {
			Class246_Sub41 class246_sub41 = ((Class174) class174).aClass246_Sub41_2452;
			Class57.aClass174Array811[Class_c.anInt1195] = class174;
			Class102_Sub1.aBoolArray4449[Class_c.anInt1195] = false;
			Class_c.anInt1195++;
			int i = ((Class174) class174).anInt2461;
			if (((Class174) class174).aBool2467)
				i = 0;
			int i_69_ = ((Class174) class174).anInt2461;
			if (((Class174) class174).aBool2466)
				i_69_ = Class154_Sub1.anInt4803 - 1;
			for (int i_70_ = i; i_70_ <= i_69_; i_70_++) {
				int i_71_ = 0;
				int i_72_ = ((class246_sub41.method2321((byte) -77) - class246_sub41.method2322(79) + Class40_Sub7.anInt5174) >> Class126.anInt1781);
				if (i_72_ < 0) {
					i_71_ -= i_72_;
					i_72_ = 0;
				}
				int i_73_ = ((class246_sub41.method2321((byte) -38) + class246_sub41.method2322(80) - Class40_Sub7.anInt5174) >> Class126.anInt1781);
				if (i_73_ >= Class_t_Sub1.f_sc)
					i_73_ = Class_t_Sub1.f_sc - 1;
				for (int i_74_ = i_72_; i_74_ <= i_73_; i_74_++) {
					int i_75_ = ((Class174) class174).aShortArray2447[i_71_++];
					int i_76_ = (((class246_sub41.method2317(false) - class246_sub41.method2322(104) + Class40_Sub7.anInt5174) >> Class126.anInt1781) + (i_75_ >>> 8));
					int i_77_ = i_76_ + (i_75_ & 0xff) - 1;
					if (i_76_ < 0)
						i_76_ = 0;
					if (i_77_ >= Class240.anInt3377)
						i_77_ = Class240.anInt3377 - 1;
					for (int i_78_ = i_76_; i_78_ <= i_77_; i_78_++) {
						long l = (Class255.aLongArrayArrayArray3648[i_70_][i_78_][i_74_]);
						if ((l & 0xffffL) == 0L)
							Class255.aLongArrayArrayArray3648[i_70_][i_78_][i_74_] = l | (long) Class_c.anInt1195;
						else if ((l & 0xffff0000L) == 0L)
							Class255.aLongArrayArrayArray3648[i_70_][i_78_][i_74_] = l | (long) Class_c.anInt1195 << 16;
						else if ((l & 0xffff00000000L) == 0L)
							Class255.aLongArrayArrayArray3648[i_70_][i_78_][i_74_] = l | (long) Class_c.anInt1195 << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							Class255.aLongArrayArrayArray3648[i_70_][i_78_][i_74_] = l | (long) Class_c.anInt1195 << 48;
					}
				}
			}
		}
	}

	public Class246_Sub28_Sub17() {
		super(2, false);
	}
}
