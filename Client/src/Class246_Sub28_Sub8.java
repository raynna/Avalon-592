
/* Class246_Sub28_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class246_Sub28_Sub8 extends Class246_Sub28 {
	private int anInt6056;
	private int anInt6057;
	private int anInt6058;
	static int anInt6059;
	static volatile boolean aBool6060;
	private int anInt6061;
	private int anInt6062 = 1024;
	private int anInt6063;
	static int anInt6064;
	static OutgoingPacket OBJECT_CLICK_1_PACKET;
	static int anInt6066;
	static int anInt6067;
	private int anInt6068;
	private int anInt6069;
	static int anInt6070;
	private int anInt6071;
	static int anInt6072 = 0;
	private int anInt6073;
	static boolean[] aBoolArray6074;
	static int anInt6075;
	static int anInt6076;
	static int anInt6077;

	static final void method2558(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt6066++;
				Class240.anInt3381 = i;
				Class101.anInt1309 = i_0_;
				Class246_Sub1_Sub14.anInt6592 = i_3_;
				Class40.anInt616 = i_2_;
				if (i_1_ == 118)
					break;
				method2561(-100);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ev.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2559(boolean bool) {
		try {
			for (int i = 0; i < 5; i++)
				Class246_Sub28_Sub29.aBoolArray6817[i] = false;
			anInt6075++;
			Class56.anInt788 = anInt6077;
			if (bool != true)
				method2559(false);
			Class102_Sub1.anInt4450 = Class246_Sub16.aInt92;
			Class_cs.anInt7145 = Class259_Sub1.anInt4509;
			Class118.anInt1636 = 0;
			Class74.anInt967 = -1;
			Class246_Sub30.anInt5031 = Class246_Sub1_Sub4.anInt5752;
			Class130_Sub3.anInt4417 = 5;
			Class214.anInt2988 = 0;
			Class21_Sub2.anInt4494 = -1;
			Class21_Sub3.anInt4727 = Class244.anInt3456;
			Class96.anInt1259 = Class73.anInt961;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ev.C(" + bool + ')');
		}
	}

	static final void method2560(Class260 class260, Class59 class59, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		boolean bool = true;
		int i_8_ = i_4_;
		int i_9_ = i_4_ + i_6_;
		int i_10_ = i_5_ - 1;
		int i_11_ = i_5_ + i_7_;
		for (int i_12_ = i; i_12_ <= i + 1; i_12_++) {
			if (i_12_ != Class154_Sub1.anInt4803) {
				for (int i_13_ = i_8_; i_13_ <= i_9_; i_13_++) {
					if (i_13_ >= 0 && i_13_ < Class240.anInt3377) {
						for (int i_14_ = i_10_; i_14_ <= i_11_; i_14_++) {
							if (i_14_ >= 0 && i_14_ < Class_t_Sub1.f_sc && (!bool || i_13_ >= i_9_ || i_14_ >= i_11_ || i_14_ < i_5_ && i_13_ != i_4_)) {
								Class147 class147 = (Class106.aClass147ArrayArrayArray1494[i_12_][i_13_][i_14_]);
								if (class147 != null) {
									int i_15_ = ((Class59_Sub3_Sub4.aClass210Array6993[i_12_].l(i_13_, i_14_) + Class59_Sub3_Sub4.aClass210Array6993[i_12_].l(i_13_ + 1, i_14_) + Class59_Sub3_Sub4.aClass210Array6993[i_12_].l(i_13_, i_14_ + 1) + Class59_Sub3_Sub4.aClass210Array6993[i_12_].l(i_13_ + 1, i_14_ + 1)) / 4 - ((Class59_Sub3_Sub4.aClass210Array6993[i].l(i_4_, i_5_) + Class59_Sub3_Sub4.aClass210Array6993[i].l(i_4_ + 1, i_5_) + Class59_Sub3_Sub4.aClass210Array6993[i].l(i_4_, i_5_ + 1) + Class59_Sub3_Sub4.aClass210Array6993[i].l(i_4_ + 1, i_5_ + 1)) / 4));
									Class59_Sub4 class59_sub4 = (((Class147) class147).aClass59_Sub4_2172);
									Class59_Sub4 class59_sub4_16_ = (((Class147) class147).aClass59_Sub4_2152);
									if (class59_sub4 != null && class59_sub4.method406((byte) 127))
										class59.method405((((i_14_ - i_5_) * Class246_Sub1.anInt3744) + ((1 - i_7_) * Class40_Sub7.anInt5174)), (((i_13_ - i_4_) * Class246_Sub1.anInt3744) + ((1 - i_6_) * Class40_Sub7.anInt5174)), class59_sub4, (byte) -99, bool, class260, i_15_);
									if (class59_sub4_16_ != null && class59_sub4_16_.method406((byte) 119))
										class59.method405((((i_14_ - i_5_) * Class246_Sub1.anInt3744) + ((1 - i_7_) * Class40_Sub7.anInt5174)), (((i_13_ - i_4_) * Class246_Sub1.anInt3744) + ((1 - i_6_) * Class40_Sub7.anInt5174)), class59_sub4_16_, (byte) -99, bool, class260, i_15_);
									for (Class3 class3 = (((Class147) class147).aClass3_2160); class3 != null; class3 = ((Class3) class3).aClass3_28) {
										Class59_Sub3 class59_sub3 = (((Class3) class3).aClass59_Sub3_24);
										if (class59_sub3 != null && class59_sub3.method406((byte) 116) && (i_13_ == (((Class59_Sub3) class59_sub3).aShort5057) || i_13_ == i_8_) && (i_14_ == (((Class59_Sub3) class59_sub3).aShort5064) || i_14_ == i_10_)) {
											int i_17_ = (((Class59_Sub3) class59_sub3).aShort5065 - ((Class59_Sub3) class59_sub3).aShort5057 + 1);
											int i_18_ = (((Class59_Sub3) class59_sub3).aShort5062 - ((Class59_Sub3) class59_sub3).aShort5064 + 1);
											class59.method405((((((Class59_Sub3) class59_sub3).aShort5064 - i_5_) * Class246_Sub1.anInt3744) + ((i_18_ - i_7_) * (Class40_Sub7.anInt5174))), (((((Class59_Sub3) class59_sub3).aShort5057 - i_4_) * Class246_Sub1.anInt3744) + ((i_17_ - i_6_) * (Class40_Sub7.anInt5174))), class59_sub3, (byte) -99, bool, class260, i_15_);
										}
									}
								}
							}
						}
					}
				}
				i_8_--;
				bool = false;
			}
		}
	}

	public static void method2561(int i) {
		try {
			if (i != -1)
				method2558(-119, -87, (byte) -111, 65, 24);
			OBJECT_CLICK_1_PACKET = null;
			aBoolArray6074 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ev.D(" + i + ')');
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool == false)
				anInt6067++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ev.F(" + bool + ')');
		}
	}

	final int[] method2135(int i, int i_19_) {
		try {
			anInt6059++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_19_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[][] is_20_ = ((Class246_Sub28) this).aClass66_4938.method433(10);
				int i_21_ = 0;
				int i_22_ = 0;
				int i_23_ = 0;
				int i_24_ = 0;
				int i_25_ = 0;
				boolean bool = true;
				boolean bool_26_ = true;
				int i_27_ = 0;
				int i_28_ = 0;
				int i_29_ = anInt6071 * Class246_Sub37_Sub1.f_gb >> 12;
				int i_30_ = anInt6061 * Class246_Sub37_Sub1.f_gb >> 12;
				int i_31_ = Class141.anInt2044 * anInt6063 >> 12;
				int i_32_ = anInt6069 * Class141.anInt2044 >> 12;
				if ((i_32_ ^ 0xffffffff) >= -2)
					return is_20_[i_19_];
				anInt6056 = Class246_Sub37_Sub1.f_gb / 8 * anInt6062 >> 12;
				int i_33_ = 1 + Class246_Sub37_Sub1.f_gb / i_29_;
				int[][] is_34_ = new int[i_33_][3];
				int[][] is_35_ = new int[i_33_][3];
				Random random = new Random((long) anInt6073);
				for (;;) {
					int i_36_ = i_29_ + Class122.method826((byte) 94, random, -i_29_ + i_30_);
					int i_37_ = (Class122.method826((byte) 94, random, i_32_ - i_31_) + i_31_);
					int i_38_ = i_36_ + i_24_;
					if ((i_38_ ^ 0xffffffff) < (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)) {
						i_38_ = Class246_Sub37_Sub1.f_gb;
						i_36_ = Class246_Sub37_Sub1.f_gb - i_24_;
					}
					int i_39_;
					if (bool_26_)
						i_39_ = 0;
					else {
						int i_40_ = i_25_;
						int[] is_41_ = is_35_[i_25_];
						int i_42_ = 0;
						int i_43_ = i_38_ - -i_21_;
						if ((i_43_ ^ 0xffffffff) > -1)
							i_43_ += Class246_Sub37_Sub1.f_gb;
						if (Class246_Sub37_Sub1.f_gb < i_43_)
							i_43_ -= Class246_Sub37_Sub1.f_gb;
						i_39_ = is_41_[2];
						for (;;) {
							int[] is_44_ = is_35_[i_40_];
							if (i_43_ >= is_44_[0] && (i_43_ ^ 0xffffffff) >= (is_44_[1] ^ 0xffffffff))
								break;
							if (i_27_ <= ++i_40_)
								i_40_ = 0;
							i_42_++;
						}
						if ((i_40_ ^ 0xffffffff) != (i_25_ ^ 0xffffffff)) {
							int i_45_ = i_24_ + i_21_;
							if ((i_45_ ^ 0xffffffff) > -1)
								i_45_ += Class246_Sub37_Sub1.f_gb;
							if (i_45_ > Class246_Sub37_Sub1.f_gb)
								i_45_ -= Class246_Sub37_Sub1.f_gb;
							for (int i_46_ = 1; (i_46_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff); i_46_++) {
								int[] is_47_ = is_35_[(i_25_ - -i_46_) % i_27_];
								i_39_ = Math.max(i_39_, is_47_[2]);
							}
							for (int i_48_ = 0; i_48_ <= i_42_; i_48_++) {
								int[] is_49_ = is_35_[(i_48_ + i_25_) % i_27_];
								int i_50_ = is_49_[2];
								if (i_50_ != i_39_) {
									int i_51_ = is_49_[0];
									int i_52_ = is_49_[1];
									int i_53_;
									int i_54_;
									if (i_43_ <= i_45_) {
										if ((i_51_ ^ 0xffffffff) != -1) {
											i_53_ = Math.max(i_45_, i_51_);
											i_54_ = Class246_Sub37_Sub1.f_gb;
										} else {
											i_54_ = Math.min(i_43_, i_52_);
											i_53_ = 0;
										}
									} else {
										i_53_ = Math.max(i_45_, i_51_);
										i_54_ = Math.min(i_43_, i_52_);
									}
									method2562(i_50_, 0, -i_50_ + i_39_, -i_53_ + i_54_, is_20_, i_23_ + i_53_, random);
								}
							}
						}
						i_25_ = i_40_;
					}
					if (i_37_ + i_39_ <= Class141.anInt2044)
						bool = false;
					else
						i_37_ = Class141.anInt2044 + -i_39_;
					if (Class246_Sub37_Sub1.f_gb == i_38_) {
						method2562(i_39_, 0, i_37_, i_36_, is_20_, i_24_ + i_22_, random);
						if (bool)
							break;
						bool = true;
						int[] is_55_ = is_34_[i_28_++];
						is_55_[1] = i_38_;
						is_55_[0] = i_24_;
						is_55_[2] = i_37_ + i_39_;
						int[][] is_56_ = is_35_;
						is_35_ = is_34_;
						i_27_ = i_28_;
						is_34_ = is_56_;
						i_23_ = i_22_;
						i_28_ = 0;
						i_22_ = Class122.method826((byte) 94, random, Class246_Sub37_Sub1.f_gb);
						i_21_ = -i_23_ + i_22_;
						i_24_ = 0;
						int i_57_ = i_21_;
						if (i_57_ < 0)
							i_57_ += Class246_Sub37_Sub1.f_gb;
						if ((i_57_ ^ 0xffffffff) < (Class246_Sub37_Sub1.f_gb ^ 0xffffffff))
							i_57_ -= Class246_Sub37_Sub1.f_gb;
						i_25_ = 0;
						for (;;) {
							int[] is_58_ = is_35_[i_25_];
							if (is_58_[0] <= i_57_ && i_57_ <= is_58_[1])
								break;
							if (++i_25_ >= i_27_)
								i_25_ = 0;
						}
						bool_26_ = false;
					} else {
						int[] is_59_ = is_34_[i_28_++];
						is_59_[2] = i_37_ + i_39_;
						is_59_[0] = i_24_;
						is_59_[1] = i_38_;
						method2562(i_39_, 0, i_37_, i_36_, is_20_, i_24_ + i_22_, random);
						i_24_ = i_38_;
					}
				}
			}
			int i_60_ = -126 % ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ev.E(" + i + ',' + i_19_ + ')');
		}
	}

	public Class246_Sub28_Sub8() {
		super(0, true);
		anInt6058 = 1024;
		anInt6061 = 2048;
		anInt6071 = 1024;
		anInt6068 = 0;
		anInt6069 = 819;
		anInt6057 = 1024;
		anInt6063 = 409;
		anInt6073 = 0;
	}

	private final void method2562(int i, int i_61_, int i_62_, int i_63_, int[][] is, int i_64_, Random random) {
		try {
			anInt6070++;
			int i_65_ = ((anInt6058 ^ 0xffffffff) >= -1 ? 4096 : 4096 + -Class122.method826((byte) 94, random, anInt6058));
			int i_66_ = anInt6057 * anInt6056 >> 12;
			int i_67_ = (anInt6056 - ((i_66_ ^ 0xffffffff) < -1 ? Class122.method826((byte) 94, random, i_66_) : 0));
			if (Class246_Sub37_Sub1.f_gb <= i_64_)
				i_64_ -= Class246_Sub37_Sub1.f_gb;
			if (i_67_ > i_61_) {
				if ((i_62_ ^ 0xffffffff) < -1 && i_63_ > 0) {
					int i_68_ = i_63_ / 2;
					int i_69_ = i_62_ / 2;
					int i_70_ = i_68_ < i_67_ ? i_68_ : i_67_;
					int i_71_ = i_67_ > i_69_ ? i_69_ : i_67_;
					int i_72_ = i_64_ + i_70_;
					int i_73_ = i_63_ + -(2 * i_70_);
					for (int i_74_ = 0; i_74_ < i_62_; i_74_++) {
						int[] is_75_ = is[i_74_ - -i];
						if (i_71_ > i_74_) {
							int i_76_ = i_65_ * i_74_ / i_71_;
							if (anInt6068 != 0) {
								for (int i_77_ = 0; i_77_ < i_70_; i_77_++) {
									int i_78_ = i_65_ * i_77_ / i_70_;
									is_75_[PacketsDecoder.method184(i_64_ - -i_77_, (Class63_Sub1.anInt4719))] = is_75_[(PacketsDecoder.method184((-1 + (-i_77_ + i_63_) + i_64_), Class63_Sub1.anInt4719))] = i_76_ > i_78_ ? i_78_ : i_76_;
								}
							} else {
								for (int i_79_ = 0; i_70_ > i_79_; i_79_++) {
									int i_80_ = i_79_ * i_65_ / i_70_;
									is_75_[PacketsDecoder.method184(i_79_ + i_64_, (Class63_Sub1.anInt4719))] = is_75_[(PacketsDecoder.method184(Class63_Sub1.anInt4719, -1 + (i_63_ + i_64_ - i_79_)))] = i_80_ * i_76_ >> 12;
								}
							}
							if (i_72_ + i_73_ > Class246_Sub37_Sub1.f_gb) {
								int i_81_ = -i_72_ + Class246_Sub37_Sub1.f_gb;
								Class117.method802(is_75_, i_72_, i_81_, i_76_);
								Class117.method802(is_75_, 0, i_73_ - i_81_, i_76_);
							} else
								Class117.method802(is_75_, i_72_, i_73_, i_76_);
						} else {
							int i_82_ = -i_74_ + i_62_ - 1;
							if ((i_71_ ^ 0xffffffff) < (i_82_ ^ 0xffffffff)) {
								int i_83_ = i_65_ * i_82_ / i_71_;
								if (anInt6068 == 0) {
									for (int i_84_ = 0; i_70_ > i_84_; i_84_++) {
										int i_85_ = i_65_ * i_84_ / i_70_;
										is_75_[PacketsDecoder.method184(i_84_ + i_64_, (Class63_Sub1.anInt4719))] = is_75_[(PacketsDecoder.method184(Class63_Sub1.anInt4719, (i_64_ + i_63_ + -i_84_ - 1)))] = i_85_ * i_83_ >> 12;
									}
								} else {
									for (int i_86_ = 0; ((i_70_ ^ 0xffffffff) < (i_86_ ^ 0xffffffff)); i_86_++) {
										int i_87_ = i_65_ * i_86_ / i_70_;
										is_75_[PacketsDecoder.method184(i_86_ + i_64_, (Class63_Sub1.anInt4719))] = is_75_[(PacketsDecoder.method184(Class63_Sub1.anInt4719, (-i_86_ + i_63_ + (i_64_ - 1))))] = i_87_ >= i_83_ ? i_83_ : i_87_;
									}
								}
								if (Class246_Sub37_Sub1.f_gb < i_73_ + i_72_) {
									int i_88_ = -i_72_ + Class246_Sub37_Sub1.f_gb;
									Class117.method802(is_75_, i_72_, i_88_, i_83_);
									Class117.method802(is_75_, 0, i_73_ - i_88_, i_83_);
								} else
									Class117.method802(is_75_, i_72_, i_73_, i_83_);
							} else {
								for (int i_89_ = 0; ((i_70_ ^ 0xffffffff) < (i_89_ ^ 0xffffffff)); i_89_++)
									is_75_[PacketsDecoder.method184(i_89_ + i_64_, (Class63_Sub1.anInt4719))] = is_75_[(PacketsDecoder.method184(Class63_Sub1.anInt4719, i_63_ + i_64_ + (-i_89_ - 1)))] = i_89_ * i_65_ / i_70_;
								if (i_72_ + i_73_ <= Class246_Sub37_Sub1.f_gb)
									Class117.method802(is_75_, i_72_, i_73_, i_65_);
								else {
									int i_90_ = -i_72_ + Class246_Sub37_Sub1.f_gb;
									Class117.method802(is_75_, i_72_, i_90_, i_65_);
									Class117.method802(is_75_, 0, -i_90_ + i_73_, i_65_);
								}
							}
						}
					}
				}
			} else if (i_64_ + i_63_ <= Class246_Sub37_Sub1.f_gb) {
				for (int i_91_ = 0; i_91_ < i_62_; i_91_++)
					Class117.method802(is[i - -i_91_], i_64_, i_63_, i_65_);
			} else {
				int i_92_ = -i_64_ + Class246_Sub37_Sub1.f_gb;
				for (int i_93_ = 0; i_62_ > i_93_; i_93_++) {
					int[] is_94_ = is[i + i_93_];
					Class117.method802(is_94_, i_64_, i_92_, i_65_);
					Class117.method802(is_94_, 0, i_63_ - i_92_, i_65_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ev.H(" + i + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + (is != null ? "{...}" : "null") + ',' + i_64_ + ',' + (random != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2143(int i, int i_95_, BufferStream stream) {
		try {
			int i_96_ = i_95_;
			while_83_: do {
				while_82_: do {
					while_81_: do {
						while_80_: do {
							while_79_: do {
								while_78_: do {
									while_77_: do {
										do {
											if ((i_96_ ^ 0xffffffff) != -1) {
												if (i_96_ != 1) {
													if ((i_96_ ^ 0xffffffff) != -3) {
														if ((i_96_ ^ 0xffffffff) != -4) {
															if ((i_96_ ^ 0xffffffff) != -5) {
																if ((i_96_ ^ 0xffffffff) != -6) {
																	if ((i_96_ ^ 0xffffffff) != -7) {
																		if (i_96_ != 7) {
																			if (i_96_ == 8)
																				break while_82_;
																			break while_83_;
																		}
																	} else
																		break while_80_;
																	break while_81_;
																}
															} else
																break while_78_;
															break while_79_;
														}
													} else
														break;
													break while_77_;
												}
											} else {
												anInt6073 = stream.readUnsignedByte(255);
												break while_83_;
											}
											anInt6071 = stream.readUnsignedShort((byte) -58);
											break while_83_;
										} while (false);
										anInt6061 = stream.readUnsignedShort((byte) 110);
										break while_83_;
									} while (false);
									anInt6063 = stream.readUnsignedShort((byte) 101);
									break while_83_;
								} while (false);
								anInt6069 = stream.readUnsignedShort((byte) 88);
								break while_83_;
							} while (false);
							anInt6062 = stream.readUnsignedShort((byte) 116);
							break while_83_;
						} while (false);
						anInt6068 = stream.readUnsignedByte(255);
						break while_83_;
					} while (false);
					anInt6057 = stream.readUnsignedShort((byte) 84);
					break while_83_;
				} while (false);
				anInt6058 = stream.readUnsignedShort((byte) -98);
			} while (false);
			if (i != 4)
				OBJECT_CLICK_1_PACKET = null;
			anInt6064++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ev.G(" + i + ',' + i_95_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBool6060 = true;
		aBoolArray6074 = new boolean[8];
		OBJECT_CLICK_1_PACKET = new OutgoingPacket(77, 7);
	}
}
