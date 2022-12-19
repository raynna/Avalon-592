/* Class210_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class210_Sub1 extends Class210 {
	private Class260_Sub1 aClass260_Sub1_4141;
	private int anInt4142;
	private int anInt4143;
	private int anInt4144;
	private int anInt4145;
	private Class226[][] aClass226ArrayArray4146;
	private int anInt4147;
	private Class212[][] aClass212ArrayArray4148;
	private Class30[][] aClass30ArrayArray4149;
	private int anInt4150;
	private int anInt4151;
	private int anInt4152;
	private Class164[][] aClass164ArrayArray4153;
	private int anInt4154;
	private byte[][] aByteArrayArray4155;
	int[][] anIntArrayArray4156;
	private int anInt4157;
	private int anInt4158;
	private int anInt4159;
	private int anInt4160 = -1;
	private int anInt4161;
	private byte[][] aByteArrayArray4162;

	final void b(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		/* empty */
	}

	final void p(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		/* empty */
	}

	final void B(int i, int i_6_, int[] is, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
		if (aClass164ArrayArray4153 == null) {
			aClass164ArrayArray4153 = (new Class164[((Class210) this).anInt2956][((Class210) this).anInt2952]);
			aClass212ArrayArray4148 = (new Class212[((Class210) this).anInt2956][((Class210) this).anInt2952]);
		} else if (aClass226ArrayArray4146 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_17_ = 0; i_17_ < is_10_.length; i_17_++) {
				if (is_10_[i_17_] == -1)
					is_10_[i_17_] = 0;
				else
					is_10_[i_17_] = Actor.f_eb[(Class_e.method594(-94, is_10_[i_17_]) & 0xffff)] << 8 | 0xff;
			}
			if (is_11_ != null) {
				for (int i_18_ = 0; i_18_ < is_11_.length; i_18_++) {
					if (is_11_[i_18_] == -1)
						is_11_[i_18_] = 0;
					else
						is_11_[i_18_] = Actor.f_eb[(Class_e.method594(127, is_11_[i_18_]) & 0xffff)] << 8 | 0xff;
				}
			}
			boolean bool_19_ = true;
			int i_20_ = -1;
			int i_21_ = -1;
			int i_22_ = -1;
			int i_23_ = -1;
			if (is.length == 6) {
				for (int i_24_ = 0; i_24_ < 6; i_24_++) {
					if (is[i_24_] == 0 && is_8_[i_24_] == 0) {
						if (i_20_ != -1 && is_10_[i_20_] != is_10_[i_24_]) {
							bool_19_ = false;
							break;
						}
						i_20_ = i_24_;
					} else if (is[i_24_] == ((Class210) this).anInt2955 && is_8_[i_24_] == 0) {
						if (i_21_ != -1 && is_10_[i_21_] != is_10_[i_24_]) {
							bool_19_ = false;
							break;
						}
						i_21_ = i_24_;
					} else if (is[i_24_] == ((Class210) this).anInt2955 && (is_8_[i_24_] == ((Class210) this).anInt2955)) {
						if (i_22_ != -1 && is_10_[i_22_] != is_10_[i_24_]) {
							bool_19_ = false;
							break;
						}
						i_22_ = i_24_;
					} else if (is[i_24_] == 0 && (is_8_[i_24_] == ((Class210) this).anInt2955)) {
						if (i_23_ != -1 && is_10_[i_23_] != is_10_[i_24_]) {
							bool_19_ = false;
							break;
						}
						i_23_ = i_24_;
					}
				}
				if (i_20_ == -1 || i_21_ == -1 || i_22_ == -1 || i_23_ == -1)
					bool_19_ = false;
				if (bool_19_) {
					if (is_7_ != null) {
						for (int i_25_ = 0; i_25_ < 4; i_25_++) {
							if (is_7_[i_25_] != 0) {
								bool_19_ = false;
								break;
							}
						}
					}
					if (bool_19_) {
						for (int i_26_ = 1; i_26_ < 4; i_26_++) {
							if (is[i_26_] != is[0] && (is[i_26_] != is[0] + ((Class210) this).anInt2955) && (is[i_26_] != is[0] - ((Class210) this).anInt2955)) {
								bool_19_ = false;
								break;
							}
							if (is_8_[i_26_] != is_8_[0] && (is_8_[i_26_] != is_8_[0] + ((Class210) this).anInt2955) && (is_8_[i_26_] != (is_8_[0] - ((Class210) this).anInt2955))) {
								bool_19_ = false;
								break;
							}
						}
					}
				}
			} else
				bool_19_ = false;
			if (bool_19_) {
				Class164 class164 = new Class164();
				int i_27_ = is_10_[0];
				int i_28_ = is_12_[0];
				if (is_11_ != null) {
					((Class164) class164).anInt2321 = is_11_[0] >> 8;
					if (i_27_ == 0)
						((Class164) class164).aByte2325 |= 0x2;
				} else if (i_27_ == 0)
					return;
				if ((((Class210_Sub1) this).anIntArrayArray4156[i][i_6_] == (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_6_])) && (((Class210_Sub1) this).anIntArrayArray4156[i][i_6_] == (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_6_ + 1])) && (((Class210_Sub1) this).anIntArrayArray4156[i][i_6_] == (((Class210_Sub1) this).anIntArrayArray4156[i][i_6_ + 1])))
					((Class164) class164).aByte2325 |= 0x1;
				if (i_28_ != -1 && (((Class164) class164).aByte2325 & 0x2) == 0 && !((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_28_)).aBool3339) {
					((Class164) class164).anInt2318 = (aByteArrayArray4162[i][i_6_] - aByteArrayArray4155[i][i_6_]);
					((Class164) class164).anInt2320 = (aByteArrayArray4162[i + 1][i_6_] - aByteArrayArray4155[i + 1][i_6_]);
					((Class164) class164).anInt2315 = (aByteArrayArray4162[i + 1][i_6_ + 1] - aByteArrayArray4155[i + 1][i_6_ + 1]);
					((Class164) class164).anInt2323 = (aByteArrayArray4162[i][i_6_ + 1] - aByteArrayArray4155[i][i_6_ + 1]);
					((Class164) class164).aShort2316 = (short) i_28_;
				} else {
					int i_29_;
					if (is_9_ != null && i_15_ != 0) {
						i_29_ = 255 * is_9_[i_20_] / i_15_;
						if (i_29_ < 0)
							i_29_ = 0;
						else if (i_29_ > 255)
							i_29_ = 255;
					} else
						i_29_ = 0;
					((Class164) class164).anInt2318 = (Class246_Sub28_Sub29.method2820(true, i_14_, i_29_, method1885(is_10_[i_20_] >> 8, (aByteArrayArray4162[i][i_6_] - aByteArrayArray4155[i][i_6_]))));
					if (((Class164) class164).anInt2321 != 0)
						((Class164) class164).anInt2318 |= 255 - (aByteArrayArray4162[i][i_6_] - aByteArrayArray4155[i][i_6_]) << 25;
					if (is_9_ != null && i_15_ != 0) {
						i_29_ = 255 * is_9_[i_21_] / i_15_;
						if (i_29_ < 0)
							i_29_ = 0;
						else if (i_29_ > 255)
							i_29_ = 255;
					} else
						i_29_ = 0;
					((Class164) class164).anInt2320 = (Class246_Sub28_Sub29.method2820(true, i_14_, i_29_, method1885(is_10_[i_21_] >> 8, (aByteArrayArray4162[i + 1][i_6_] - aByteArrayArray4155[i + 1][i_6_]))));
					if (((Class164) class164).anInt2321 != 0)
						((Class164) class164).anInt2320 |= (255 - (aByteArrayArray4162[i + 1][i_6_] - aByteArrayArray4155[i + 1][i_6_]) << 25);
					if (is_9_ != null && i_15_ != 0) {
						i_29_ = 255 * is_9_[i_22_] / i_15_;
						if (i_29_ < 0)
							i_29_ = 0;
						else if (i_29_ > 255)
							i_29_ = 255;
					} else
						i_29_ = 0;
					((Class164) class164).anInt2315 = (Class246_Sub28_Sub29.method2820(true, i_14_, i_29_, method1885(is_10_[i_22_] >> 8, (aByteArrayArray4162[i + 1][i_6_ + 1] - (aByteArrayArray4155[i + 1][i_6_ + 1])))));
					if (((Class164) class164).anInt2321 != 0)
						((Class164) class164).anInt2315 |= (255 - (aByteArrayArray4162[i + 1][i_6_ + 1] - aByteArrayArray4155[i + 1][i_6_ + 1]) << 25);
					if (is_9_ != null && i_15_ != 0) {
						i_29_ = 255 * is_9_[i_23_] / i_15_;
						if (i_29_ < 0)
							i_29_ = 0;
						else if (i_29_ > 255)
							i_29_ = 255;
					} else
						i_29_ = 0;
					((Class164) class164).anInt2323 = (Class246_Sub28_Sub29.method2820(true, i_14_, i_29_, method1885(is_10_[i_23_] >> 8, (aByteArrayArray4162[i][i_6_ + 1] - aByteArrayArray4155[i][i_6_ + 1]))));
					if (((Class164) class164).anInt2321 != 0)
						((Class164) class164).anInt2323 |= (255 - (aByteArrayArray4162[i][i_6_ + 1] - aByteArrayArray4155[i][i_6_ + 1]) << 25);
					((Class164) class164).aShort2316 = (short) -1;
				}
				if (is_9_ != null) {
					((Class164) class164).aShort2319 = (short) is_9_[i_22_];
					((Class164) class164).aShort2322 = (short) is_9_[i_23_];
					((Class164) class164).aShort2324 = (short) is_9_[i_21_];
					((Class164) class164).aShort2317 = (short) is_9_[i_20_];
				}
				aClass164ArrayArray4153[i][i_6_] = class164;
			} else {
				Class212 class212 = new Class212();
				((Class212) class212).aShort2975 = (short) is.length;
				((Class212) class212).aShort2967 = (short) (is.length / 3);
				((Class212) class212).aShortArray2974 = new short[((Class212) class212).aShort2975];
				((Class212) class212).aShortArray2973 = new short[((Class212) class212).aShort2975];
				((Class212) class212).aShortArray2966 = new short[((Class212) class212).aShort2975];
				((Class212) class212).anIntArray2972 = new int[((Class212) class212).aShort2975];
				if (is_9_ != null)
					((Class212) class212).aShortArray2968 = new short[((Class212) class212).aShort2975];
				for (int i_30_ = 0; i_30_ < ((Class212) class212).aShort2975; i_30_++) {
					int i_31_ = is[i_30_];
					int i_32_ = is_8_[i_30_];
					boolean bool_33_ = false;
					int i_34_;
					if (i_31_ == 0 && i_32_ == 0)
						i_34_ = (aByteArrayArray4162[i][i_6_] - aByteArrayArray4155[i][i_6_]);
					else if (i_31_ == 0 && i_32_ == ((Class210) this).anInt2955)
						i_34_ = (aByteArrayArray4162[i][i_6_ + 1] - aByteArrayArray4155[i][i_6_ + 1]);
					else if (i_31_ == ((Class210) this).anInt2955 && i_32_ == ((Class210) this).anInt2955)
						i_34_ = (aByteArrayArray4162[i + 1][i_6_ + 1] - aByteArrayArray4155[i + 1][i_6_ + 1]);
					else if (i_31_ == ((Class210) this).anInt2955 && i_32_ == 0)
						i_34_ = (aByteArrayArray4162[i + 1][i_6_] - aByteArrayArray4155[i + 1][i_6_]);
					else {
						int i_35_ = (((aByteArrayArray4162[i][i_6_] - aByteArrayArray4155[i][i_6_]) * (((Class210) this).anInt2955 - i_31_)) + (aByteArrayArray4162[i + 1][i_6_] - aByteArrayArray4155[i + 1][i_6_]) * i_31_);
						int i_36_ = (((aByteArrayArray4162[i][i_6_ + 1] - aByteArrayArray4155[i][i_6_ + 1]) * (((Class210) this).anInt2955 - i_31_)) + ((aByteArrayArray4162[i + 1][i_6_ + 1] - aByteArrayArray4155[i + 1][i_6_ + 1]) * i_31_));
						i_34_ = ((i_35_ * (((Class210) this).anInt2955 - i_32_) + i_36_ * i_32_) >> 2 * ((Class210) this).anInt2950);
					}
					int i_37_ = (i << ((Class210) this).anInt2950) + i_31_;
					int i_38_ = (i_6_ << ((Class210) this).anInt2950) + i_32_;
					((Class212) class212).aShortArray2974[i_30_] = (short) i_31_;
					((Class212) class212).aShortArray2966[i_30_] = (short) i_32_;
					((Class212) class212).aShortArray2973[i_30_] = (short) (a(i_37_, i_38_) + (is_7_ != null ? is_7_[i_30_] : 0));
					if (i_34_ < 0)
						i_34_ = 0;
					if (is_12_[i_30_] == -1 || (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, is_12_[i_30_])).aBool3339)) {
						if (is_10_[i_30_] == 0) {
							if (is_11_ != null)
								((Class212) class212).anIntArray2972[i_30_] = i_34_ << 25;
							else
								((Class212) class212).anIntArray2972[i_30_] = 0;
						} else {
							int i_39_ = 0;
							if (is_9_ != null) {
								int i_40_ = (((Class212) class212).aShortArray2968[i_30_] = (short) is_9_[i_30_]);
								if (i_15_ != 0) {
									i_39_ = 255 * i_40_ / i_15_;
									if (i_39_ < 0)
										i_39_ = 0;
									else if (i_39_ > 255)
										i_39_ = 255;
								}
							}
							((Class212) class212).anIntArray2972[i_30_] = (Class246_Sub28_Sub29.method2820(true, i_14_, i_39_, method1885(is_10_[i_30_] >> 8, i_34_)));
							if (is_11_ != null)
								((Class212) class212).anIntArray2972[i_30_] |= i_34_ << 25;
						}
					} else
						((Class212) class212).anIntArray2972[i_30_] = i_34_;
				}
				boolean bool_41_ = false;
				for (int i_42_ = 0; i_42_ < ((Class212) class212).aShort2967; i_42_++) {
					if (is_12_[i_42_ * 3] != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, is_12_[i_42_ * 3])).aBool3339))
						bool_41_ = true;
				}
				if (is_11_ != null)
					((Class212) class212).anIntArray2970 = new int[((Class212) class212).aShort2967];
				if (bool_41_) {
					((Class212) class212).aShortArray2969 = new short[((Class212) class212).aShort2967];
					((Class212) class212).aShortArray2971 = new short[((Class212) class212).aShort2967];
				}
				for (int i_43_ = 0; i_43_ < ((Class212) class212).aShort2967; i_43_++) {
					int i_44_ = i_43_ * 3;
					if (is_11_ != null && is_11_[i_44_] != 0)
						((Class212) class212).anIntArray2970[i_43_] = is_11_[i_44_] >> 8;
					if (bool_41_) {
						int i_45_ = i_44_ + 1;
						int i_46_ = i_45_ + 1;
						boolean bool_47_ = false;
						boolean bool_48_ = true;
						int i_49_ = is_12_[i_44_];
						if (i_49_ == -1 || (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
							bool_48_ = false;
						else
							bool_47_ = true;
						i_49_ = is_12_[i_45_];
						if (i_49_ == -1 || (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
							bool_48_ = false;
						else
							bool_47_ = true;
						i_49_ = is_12_[i_46_];
						if (i_49_ == -1 || (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
							bool_48_ = false;
						else
							bool_47_ = true;
						if (bool_48_) {
							((Class212) class212).aShortArray2969[i_43_] = (short) i_49_;
							((Class212) class212).aShortArray2971[i_43_] = (short) is_13_[i_44_];
						} else {
							if (bool_47_) {
								i_49_ = is_12_[i_44_];
								if (i_49_ != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
									((Class212) class212).anIntArray2972[i_44_] = (Actor.f_eb[((Class_e.method594(126, (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aShort3354) & 0xffff)) & 0xffff)]);
								i_49_ = is_12_[i_45_];
								if (i_49_ != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
									((Class212) class212).anIntArray2972[i_45_] = (Actor.f_eb[((Class_e.method594(-48, (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aShort3354) & 0xffff)) & 0xffff)]);
								i_49_ = is_12_[i_46_];
								if (i_49_ != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aBool3339))
									((Class212) class212).anIntArray2972[i_46_] = (Actor.f_eb[((Class_e.method594(-29, (((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_49_)).aShort3354) & 0xffff)) & 0xffff)]);
							}
							((Class212) class212).aShortArray2969[i_43_] = (short) -1;
						}
					}
				}
				aClass212ArrayArray4148[i][i_6_] = class212;
			}
		}
	}

	private final void method1884(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, boolean[][] bools, Class184 class184, int[] is, int[] is_56_) {
		int i_57_ = (i_55_ - i_53_) * i_51_ / 256;
		int i_58_ = i_51_ >> 8;
		((Class184) class184).aBool2559 = false;
		int i_59_ = i;
		int i_60_ = i_50_ + i_57_;
		for (int i_61_ = i_52_; i_61_ < i_54_; i_61_++) {
			for (int i_62_ = i_53_; i_62_ < i_55_; i_62_++) {
				if (bools[i_61_ - i_52_][i_62_ - i_53_]) {
					if (aClass164ArrayArray4153[i_61_][i_62_] != null) {
						Class164 class164 = aClass164ArrayArray4153[i_61_][i_62_];
						if (((Class164) class164).aShort2316 != -1 && (((Class164) class164).aByte2325 & 0x2) == 0 && ((Class164) class164).anInt2321 == 0) {
							int i_63_ = aClass260_Sub1_4141.method1794(((Class164) class164).aShort2316);
							class184.method1194(i_60_ - i_58_, i_60_ - i_58_, i_60_, i_59_ + i_58_, i_59_, i_59_ + i_58_, Class109_Sub3.method1825(114, i_63_, (((Class164) class164).anInt2315)), Class109_Sub3.method1825(127, i_63_, (((Class164) class164).anInt2323)), Class109_Sub3.method1825(114, i_63_, (((Class164) class164).anInt2320)));
							class184.method1194(i_60_, i_60_, i_60_ - i_58_, i_59_, i_59_ + i_58_, i_59_, Class109_Sub3.method1825(100, i_63_, (((Class164) class164).anInt2318)), Class109_Sub3.method1825(102, i_63_, (((Class164) class164).anInt2320)), Class109_Sub3.method1825(109, i_63_, (((Class164) class164).anInt2323)));
						} else if (((Class164) class164).anInt2321 == 0) {
							class184.method1195(i_60_ - i_58_, i_60_ - i_58_, i_60_, i_59_ + i_58_, i_59_, i_59_ + i_58_, ((Class164) class164).anInt2315, ((Class164) class164).anInt2323, ((Class164) class164).anInt2320);
							class184.method1195(i_60_, i_60_, i_60_ - i_58_, i_59_, i_59_ + i_58_, i_59_, ((Class164) class164).anInt2318, ((Class164) class164).anInt2320, ((Class164) class164).anInt2323);
						} else {
							int i_64_ = ((Class164) class164).anInt2321;
							class184.method1195(i_60_ - i_58_, i_60_ - i_58_, i_60_, i_59_ + i_58_, i_59_, i_59_ + i_58_, BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2315) & ~0xffffff), BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2323) & ~0xffffff), BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2320) & ~0xffffff));
							class184.method1195(i_60_, i_60_, i_60_ - i_58_, i_59_, i_59_ + i_58_, i_59_, BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2318) & ~0xffffff), BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2320) & ~0xffffff), BufferStream.method2402((byte) 70, i_64_, (((Class164) class164).anInt2323) & ~0xffffff));
						}
					} else if (aClass212ArrayArray4148[i_61_][i_62_] != null) {
						Class212 class212 = aClass212ArrayArray4148[i_61_][i_62_];
						for (int i_65_ = 0; i_65_ < ((Class212) class212).aShort2975; i_65_++) {
							is[i_65_] = i_59_ + ((((Class212) class212).aShortArray2974[i_65_]) * i_58_ / ((Class210) this).anInt2955);
							is_56_[i_65_] = i_60_ - ((((Class212) class212).aShortArray2966[i_65_]) * i_58_ / ((Class210) this).anInt2955);
						}
						for (int i_66_ = 0; i_66_ < ((Class212) class212).aShort2967; i_66_++) {
							int i_67_ = i_66_ * 3;
							int i_68_ = i_67_ + 1;
							int i_69_ = i_68_ + 1;
							int i_70_ = is[i_67_];
							int i_71_ = is[i_68_];
							int i_72_ = is[i_69_];
							int i_73_ = is_56_[i_67_];
							int i_74_ = is_56_[i_68_];
							int i_75_ = is_56_[i_69_];
							if (((Class212) class212).anIntArray2970 != null && (((Class212) class212).anIntArray2970[i_66_] != 0) && ((((Class212) class212).aShortArray2969 == null) || ((((Class212) class212).aShortArray2969 != null) && (((Class212) class212).aShortArray2969[i_66_]) == -1))) {
								int i_76_ = (((Class212) class212).anIntArray2970[i_66_]);
								class184.method1195(i_73_, i_74_, i_75_, i_70_, i_71_, i_72_, BufferStream.method2402((byte) 70, i_76_, (-16777216 - ((((Class212) class212).anIntArray2972[i_67_]) & ~0xffffff))), BufferStream.method2402((byte) 70, i_76_, (-16777216 - ((((Class212) class212).anIntArray2972[i_68_]) & ~0xffffff))), BufferStream.method2402((byte) 70, i_76_, (-16777216 - ((((Class212) class212).anIntArray2972[i_69_]) & ~0xffffff))));
							} else if ((((Class212) class212).aShortArray2969 != null) && (((Class212) class212).aShortArray2969[i_66_]) != -1) {
								int i_77_ = (aClass260_Sub1_4141.method1794(((Class212) class212).aShortArray2969[i_66_]));
								class184.method1194(i_73_, i_74_, i_75_, i_70_, i_71_, i_72_, i_77_, i_77_, i_77_);
							} else
								class184.method1195(i_73_, i_74_, i_75_, i_70_, i_71_, i_72_, (((Class212) class212).anIntArray2972[i_67_]), (((Class212) class212).anIntArray2972[i_68_]), (((Class212) class212).anIntArray2972[i_69_]));
						}
					}
				}
				i_60_ -= i_58_;
			}
			i_60_ = i_50_ + i_57_;
			i_59_ += i_58_;
		}
		((Class184) class184).aBool2559 = true;
	}

	private static final int method1885(int i, int i_78_) {
		int i_79_ = (i & 0xff0000) * i_78_ >> 23;
		if (i_79_ < 2)
			i_79_ = 2;
		else if (i_79_ > 253)
			i_79_ = 253;
		int i_80_ = (i & 0xff00) * i_78_ >> 15;
		if (i_80_ < 2)
			i_80_ = 2;
		else if (i_80_ > 253)
			i_80_ = 253;
		int i_81_ = (i & 0xff) * i_78_ >> 7;
		if (i_81_ < 2)
			i_81_ = 2;
		else if (i_81_ > 253)
			i_81_ = 253;
		return i_79_ << 16 | i_80_ << 8 | i_81_;
	}

	final int l(int i, int i_82_) {
		return ((Class210_Sub1) this).anIntArrayArray4156[i][i_82_];
	}

	final void method1378(int i, int i_83_, int[] is, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int[] is_88_, int[] is_89_, int[] is_90_, int[] is_91_, int[] is_92_, int[] is_93_, int i_94_, int i_95_, int i_96_, boolean bool) {
		if (aClass226ArrayArray4146 == null) {
			aClass226ArrayArray4146 = (new Class226[((Class210) this).anInt2956][((Class210) this).anInt2952]);
			aClass30ArrayArray4149 = (new Class30[((Class210) this).anInt2956][((Class210) this).anInt2952]);
		} else if (aClass164ArrayArray4153 != null)
			throw new IllegalStateException();
		boolean bool_97_ = false;
		if (is_90_.length == 2 && is_87_.length == 2 && (is_90_[0] == is_90_[1] || is_92_[0] != -1 && is_92_[0] == is_92_[1])) {
			bool_97_ = true;
			for (int i_98_ = 1; i_98_ < 2; i_98_++) {
				int i_99_ = is[is_87_[i_98_]];
				int i_100_ = is_85_[is_87_[i_98_]];
				if (i_99_ != 0 && i_99_ != ((Class210) this).anInt2955 || i_100_ != 0 && i_100_ != ((Class210) this).anInt2955) {
					bool_97_ = false;
					break;
				}
			}
		}
		if (!bool_97_) {
			Class30 class30 = new Class30();
			short i_101_ = (short) is.length;
			int i_102_ = (short) is_90_.length;
			((Class30) class30).aShort398 = i_101_;
			((Class30) class30).aShortArray400 = new short[i_101_];
			((Class30) class30).aShortArray406 = new short[i_101_];
			((Class30) class30).aShortArray407 = new short[i_101_];
			((Class30) class30).aShortArray405 = new short[i_101_];
			for (int i_103_ = 0; i_103_ < i_101_; i_103_++) {
				int i_104_ = is[i_103_];
				int i_105_ = is_85_[i_103_];
				if (i_104_ == 0 && i_105_ == 0)
					((Class30) class30).aShortArray400[i_103_] = (short) (aByteArrayArray4162[i][i_83_] - aByteArrayArray4155[i][i_83_]);
				else if (i_104_ == 0 && i_105_ == ((Class210) this).anInt2955)
					((Class30) class30).aShortArray400[i_103_] = (short) (aByteArrayArray4162[i][i_83_ + 1] - aByteArrayArray4155[i][i_83_ + 1]);
				else if (i_104_ == ((Class210) this).anInt2955 && i_105_ == ((Class210) this).anInt2955)
					((Class30) class30).aShortArray400[i_103_] = (short) (aByteArrayArray4162[i + 1][i_83_ + 1] - aByteArrayArray4155[i + 1][i_83_ + 1]);
				else if (i_104_ == ((Class210) this).anInt2955 && i_105_ == 0)
					((Class30) class30).aShortArray400[i_103_] = (short) (aByteArrayArray4162[i + 1][i_83_] - aByteArrayArray4155[i + 1][i_83_]);
				else {
					int i_106_ = (((aByteArrayArray4162[i][i_83_] - aByteArrayArray4155[i][i_83_]) * (((Class210) this).anInt2955 - i_104_)) + (aByteArrayArray4162[i + 1][i_83_] - aByteArrayArray4155[i + 1][i_83_]) * i_104_);
					int i_107_ = (((aByteArrayArray4162[i][i_83_ + 1] - aByteArrayArray4155[i][i_83_ + 1]) * (((Class210) this).anInt2955 - i_104_)) + ((aByteArrayArray4162[i + 1][i_83_ + 1] - aByteArrayArray4155[i + 1][i_83_ + 1]) * i_104_));
					((Class30) class30).aShortArray400[i_103_] = (short) (i_106_ * (((Class210) this).anInt2955 - i_105_) + i_107_ * i_105_ >> 2 * ((Class210) this).anInt2950);
				}
				int i_108_ = (i << ((Class210) this).anInt2950) + i_104_;
				int i_109_ = (i_83_ << ((Class210) this).anInt2950) + i_105_;
				((Class30) class30).aShortArray406[i_103_] = (short) i_104_;
				((Class30) class30).aShortArray405[i_103_] = (short) i_105_;
				((Class30) class30).aShortArray407[i_103_] = (short) (a(i_108_, i_109_) + (is_84_ != null ? is_84_[i_103_] : 0));
				if (((Class30) class30).aShortArray400[i_103_] < 2)
					((Class30) class30).aShortArray400[i_103_] = (short) 2;
			}
			boolean bool_110_ = false;
			int i_111_ = 0;
			for (int i_112_ = 0; i_112_ < i_102_; i_112_++) {
				if (is_90_[i_112_] >= 0 || is_91_ != null && is_91_[i_112_] >= 0)
					i_111_++;
				if (is_92_[i_112_] != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, is_92_[i_112_])).aBool3339))
					bool_110_ = true;
			}
			((Class30) class30).anIntArray404 = new int[i_111_];
			if (is_91_ != null)
				((Class30) class30).anIntArray402 = new int[i_111_];
			((Class30) class30).aShortArray401 = new short[i_111_];
			((Class30) class30).aShortArray399 = new short[i_111_];
			((Class30) class30).aShortArray403 = new short[i_111_];
			if (bool_110_) {
				((Class30) class30).aShortArray408 = new short[i_111_];
				((Class30) class30).aShortArray397 = new short[i_111_];
			}
			for (int i_113_ = 0; i_113_ < i_102_; i_113_++) {
				if (is_90_[i_113_] >= 0 || is_91_ != null && is_91_[i_113_] >= 0) {
					if (is_90_[i_113_] >= 0)
						((Class30) class30).anIntArray404[(((Class30) class30).aShort409)] = Class_e.method594(-62, is_90_[i_113_]);
					else
						((Class30) class30).anIntArray404[(((Class30) class30).aShort409)] = -1;
					if (is_91_ != null) {
						if (is_91_[i_113_] != -1)
							((Class30) class30).anIntArray402[((Class30) class30).aShort409] = Class_e.method594(125, is_91_[i_113_]);
						else
							((Class30) class30).anIntArray402[((Class30) class30).aShort409] = -1;
					}
					((Class30) class30).aShortArray401[(((Class30) class30).aShort409)] = (short) is_87_[i_113_];
					((Class30) class30).aShortArray399[(((Class30) class30).aShort409)] = (short) is_88_[i_113_];
					((Class30) class30).aShortArray403[(((Class30) class30).aShort409)] = (short) is_89_[i_113_];
					if (bool_110_) {
						if (is_92_[i_113_] != -1 && !(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, is_92_[i_113_])).aBool3339)) {
							((Class30) class30).aShortArray408[((Class30) class30).aShort409] = (short) is_92_[i_113_];
							((Class30) class30).aShortArray397[((Class30) class30).aShort409] = (short) is_93_[i_113_];
						} else
							((Class30) class30).aShortArray408[((Class30) class30).aShort409] = (short) -1;
					}
					((Class30) class30).aShort409++;
				}
			}
			aClass30ArrayArray4149[i][i_83_] = class30;
		} else if (is_90_[0] >= 0 || is_91_ != null && is_91_[0] >= 0) {
			Class226 class226 = new Class226();
			int i_114_ = is_90_[0];
			int i_115_ = is_92_[0];
			if (is_91_ != null) {
				((Class226) class226).anInt3115 = Class109_Sub3.method1825(101, Class_e.method594(-118, is_91_[0]), (aByteArrayArray4162[i][i_83_] - (aByteArrayArray4155[i][i_83_])));
				if (i_114_ == -1)
					((Class226) class226).aByte3114 |= 0x2;
			}
			if ((((Class210_Sub1) this).anIntArrayArray4156[i][i_83_] == ((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_83_]) && (((Class210_Sub1) this).anIntArrayArray4156[i][i_83_] == (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_83_ + 1])) && (((Class210_Sub1) this).anIntArrayArray4156[i][i_83_] == (((Class210_Sub1) this).anIntArrayArray4156[i][i_83_ + 1])))
				((Class226) class226).aByte3114 |= 0x1;
			if (i_115_ != -1 && (((Class226) class226).aByte3114 & 0x2) == 0 && !((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_115_)).aBool3339) {
				((Class226) class226).aShort3118 = (short) (aByteArrayArray4162[i][i_83_] - aByteArrayArray4155[i][i_83_]);
				((Class226) class226).aShort3119 = (short) (aByteArrayArray4162[i + 1][i_83_] - aByteArrayArray4155[i + 1][i_83_]);
				((Class226) class226).aShort3113 = (short) (aByteArrayArray4162[i + 1][i_83_ + 1] - aByteArrayArray4155[i + 1][i_83_ + 1]);
				((Class226) class226).aShort3116 = (short) (aByteArrayArray4162[i][i_83_ + 1] - aByteArrayArray4155[i][i_83_ + 1]);
				((Class226) class226).aShort3117 = (short) i_115_;
			} else {
				short i_116_ = Class_e.method594(-102, i_114_);
				((Class226) class226).aShort3118 = (short) Class109_Sub3.method1825(127, i_116_, ((aByteArrayArray4162[i][i_83_]) - (aByteArrayArray4155[i][i_83_])));
				((Class226) class226).aShort3119 = (short) Class109_Sub3.method1825(115, i_116_, ((aByteArrayArray4162[i + 1][i_83_]) - (aByteArrayArray4155[i + 1][i_83_])));
				((Class226) class226).aShort3113 = (short) Class109_Sub3.method1825(102, i_116_, ((aByteArrayArray4162[i + 1][i_83_ + 1]) - (aByteArrayArray4155[i + 1][i_83_ + 1])));
				((Class226) class226).aShort3116 = (short) Class109_Sub3.method1825(118, i_116_, ((aByteArrayArray4162[i][i_83_ + 1]) - (aByteArrayArray4155[i][i_83_ + 1])));
				((Class226) class226).aShort3117 = (short) -1;
			}
			aClass226ArrayArray4146[i][i_83_] = class226;
		}
	}

	private final boolean method1886(int i) {
		if ((anInt4152 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	final void ca() {
		aByteArrayArray4162 = null;
		aByteArrayArray4155 = null;
	}

	Class210_Sub1(Class260_Sub1 class260_sub1, int i, int i_117_, int i_118_, int i_119_, int[][] is, int[][] is_120_, int i_121_) {
		super(i_118_, i_119_, i_121_);
		aClass260_Sub1_4141 = class260_sub1;
		anInt4152 = i_117_;
		((Class210_Sub1) this).anIntArrayArray4156 = is;
		aByteArrayArray4162 = new byte[i_118_ + 1][i_119_ + 1];
		int i_122_ = ((Class260_Sub1) aClass260_Sub1_4141).anInt3836 >> 9;
		for (int i_123_ = 1; i_123_ < i_119_; i_123_++) {
			for (int i_124_ = 1; i_124_ < i_118_; i_124_++) {
				int i_125_ = i_122_;
				int i_126_ = (is_120_[i_124_ + 1][i_123_] - is_120_[i_124_ - 1][i_123_]);
				int i_127_ = (is_120_[i_124_][i_123_ + 1] - is_120_[i_124_][i_123_ - 1]);
				int i_128_ = (int) Math.sqrt((double) (i_126_ * i_126_ + 512 * i_121_ + i_127_ * i_127_));
				int i_129_ = (i_126_ << 8) / i_128_;
				int i_130_ = -512 * i_121_ / i_128_;
				int i_131_ = (i_127_ << 8) / i_128_;
				i_125_ += ((((Class260_Sub1) aClass260_Sub1_4141).anInt3831 * i_129_) + (((Class260_Sub1) aClass260_Sub1_4141).anInt3847 * i_130_) + (((Class260_Sub1) aClass260_Sub1_4141).anInt3854 * i_131_)) >> 17;
				i_125_ >>= 1;
				if (i_125_ < 2)
					i_125_ = 2;
				else if (i_125_ > 126)
					i_125_ = 126;
				aByteArrayArray4162[i_124_][i_123_] = (byte) i_125_;
			}
		}
		aByteArrayArray4155 = new byte[i_118_ + 1][i_119_ + 1];
	}

	final Class246_Sub1_Sub4 k(int i, int i_132_, Class246_Sub1_Sub4 class246_sub1_sub4) {
		return null;
	}

	final void method1379(Class246_Sub41 class246_sub41, int[] is) {
		/* empty */
	}

	private final void method1887(int i, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, boolean[][] bools, Class184 class184, int[] is, int[] is_139_) {
		int i_140_ = (i_138_ - i_136_) * i_134_ / 256;
		int i_141_ = i_134_ >> 8;
		((Class184) class184).aBool2559 = false;
		int i_142_ = i;
		int i_143_ = i_133_ + i_140_;
		for (int i_144_ = i_135_; i_144_ < i_137_; i_144_++) {
			for (int i_145_ = i_136_; i_145_ < i_138_; i_145_++) {
				if (bools[i_144_ - i_135_][i_145_ - i_136_]) {
					if (aClass226ArrayArray4146[i_144_][i_145_] != null) {
						Class226 class226 = aClass226ArrayArray4146[i_144_][i_145_];
						if (((Class226) class226).aShort3117 != -1 && (((Class226) class226).aByte3114 & 0x2) == 0 && ((Class226) class226).anInt3115 == -1) {
							int i_146_ = aClass260_Sub1_4141.method1794(((Class226) class226).aShort3117);
							class184.method1194(i_143_ - i_141_, i_143_ - i_141_, i_143_, i_142_ + i_141_, i_142_, i_142_ + i_141_, Class109_Sub3.method1825(122, i_146_, ((((Class226) class226).aShort3113) & 0xffff)), Class109_Sub3.method1825(103, i_146_, ((((Class226) class226).aShort3116) & 0xffff)), Class109_Sub3.method1825(115, i_146_, ((((Class226) class226).aShort3119) & 0xffff)));
							class184.method1194(i_143_, i_143_, i_143_ - i_141_, i_142_, i_142_ + i_141_, i_142_, Class109_Sub3.method1825(123, i_146_, ((((Class226) class226).aShort3118) & 0xffff)), Class109_Sub3.method1825(112, i_146_, ((((Class226) class226).aShort3119) & 0xffff)), Class109_Sub3.method1825(126, i_146_, ((((Class226) class226).aShort3116) & 0xffff)));
						} else if (((Class226) class226).anInt3115 == -1) {
							class184.method1194(i_143_ - i_141_, i_143_ - i_141_, i_143_, i_142_ + i_141_, i_142_, i_142_ + i_141_, ((Class226) class226).aShort3113 & 0xffff, ((Class226) class226).aShort3116 & 0xffff, ((Class226) class226).aShort3119 & 0xffff);
							class184.method1194(i_143_, i_143_, i_143_ - i_141_, i_142_, i_142_ + i_141_, i_142_, ((Class226) class226).aShort3118 & 0xffff, ((Class226) class226).aShort3119 & 0xffff, ((Class226) class226).aShort3116 & 0xffff);
						} else {
							int i_147_ = ((Class226) class226).anInt3115;
							class184.method1194(i_143_ - i_141_, i_143_ - i_141_, i_143_, i_142_ + i_141_, i_142_, i_142_ + i_141_, i_147_, i_147_, i_147_);
							class184.method1194(i_143_, i_143_, i_143_ - i_141_, i_142_, i_142_ + i_141_, i_142_, i_147_, i_147_, i_147_);
						}
					} else if (aClass30ArrayArray4149[i_144_][i_145_] != null) {
						Class30 class30 = aClass30ArrayArray4149[i_144_][i_145_];
						for (int i_148_ = 0; i_148_ < ((Class30) class30).aShort398; i_148_++) {
							is[i_148_] = i_142_ + ((((Class30) class30).aShortArray406[i_148_]) * i_141_ / ((Class210) this).anInt2955);
							is_139_[i_148_] = i_143_ - ((((Class30) class30).aShortArray405[i_148_]) * i_141_ / ((Class210) this).anInt2955);
						}
						for (int i_149_ = 0; i_149_ < ((Class30) class30).aShort409; i_149_++) {
							short i_150_ = ((Class30) class30).aShortArray401[i_149_];
							short i_151_ = ((Class30) class30).aShortArray399[i_149_];
							short i_152_ = ((Class30) class30).aShortArray403[i_149_];
							int i_153_ = is[i_150_];
							int i_154_ = is[i_151_];
							int i_155_ = is[i_152_];
							int i_156_ = is_139_[i_150_];
							int i_157_ = is_139_[i_151_];
							int i_158_ = is_139_[i_152_];
							if (((Class30) class30).anIntArray402 != null && (((Class30) class30).anIntArray402[i_149_] != -1)) {
								int i_159_ = (((Class30) class30).anIntArray402[i_149_]);
								class184.method1194(i_156_, i_157_, i_158_, i_153_, i_154_, i_155_, Class109_Sub3.method1825(123, i_159_, (((Class30) class30).aShortArray400[i_150_])), Class109_Sub3.method1825(101, i_159_, (((Class30) class30).aShortArray400[i_151_])), Class109_Sub3.method1825(112, i_159_, (((Class30) class30).aShortArray400[i_152_])));
							} else if ((((Class30) class30).aShortArray408 != null) && (((Class30) class30).aShortArray408[i_149_]) != -1) {
								int i_160_ = (aClass260_Sub1_4141.method1794(((Class30) class30).aShortArray408[i_149_]));
								class184.method1194(i_156_, i_157_, i_158_, i_153_, i_154_, i_155_, Class109_Sub3.method1825(121, i_160_, (((Class30) class30).aShortArray400[i_150_])), Class109_Sub3.method1825(100, i_160_, (((Class30) class30).aShortArray400[i_151_])), Class109_Sub3.method1825(102, i_160_, (((Class30) class30).aShortArray400[i_152_])));
							} else {
								int i_161_ = (((Class30) class30).anIntArray404[i_149_]);
								class184.method1194(i_156_, i_157_, i_158_, i_153_, i_154_, i_155_, Class109_Sub3.method1825(113, i_161_, (((Class30) class30).aShortArray400[i_150_])), Class109_Sub3.method1825(126, i_161_, (((Class30) class30).aShortArray400[i_151_])), Class109_Sub3.method1825(100, i_161_, (((Class30) class30).aShortArray400[i_152_])));
							}
						}
					}
				}
				i_143_ -= i_141_;
			}
			i_143_ = i_133_ + i_140_;
			i_142_ += i_141_;
		}
		((Class184) class184).aBool2559 = true;
	}

	private final void method1888(int i, int i_162_, Class184 class184, int[] is, int[] is_163_, int[] is_164_) {
		Class226 class226 = aClass226ArrayArray4146[i][i_162_];
		if (class226 != null) {
			if ((((Class226) class226).aByte3114 & 0x2) == 0) {
				int i_165_ = i * ((Class210) this).anInt2955;
				int i_166_ = i_165_ + ((Class210) this).anInt2955;
				int i_167_ = i_162_ * ((Class210) this).anInt2955;
				int i_168_ = i_167_ + ((Class210) this).anInt2955;
				int i_169_;
				int i_170_;
				int i_171_;
				int i_172_;
				int i_173_;
				int i_174_;
				int i_175_;
				int i_176_;
				int i_177_;
				int i_178_;
				int i_179_;
				int i_180_;
				int i_181_;
				int i_182_;
				int i_183_;
				int i_184_;
				int i_185_;
				if ((((Class226) class226).aByte3114 & 0x1) != 0) {
					int i_186_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_162_]);
					int i_187_;
					if (anInt4160 == -1) {
						int i_188_ = anInt4158 * i_186_;
						i_169_ = anInt4159 + ((anInt4142 * i_165_ + i_188_ + anInt4147 * i_167_) >> 15);
						if (i_169_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_170_ = anInt4159 + ((anInt4142 * i_166_ + i_188_ + anInt4147 * i_167_) >> 15);
						if (i_170_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_187_ = anInt4159 + ((anInt4142 * i_166_ + i_188_ + anInt4147 * i_168_) >> 15);
						if (i_187_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_171_ = anInt4159 + ((anInt4142 * i_165_ + i_188_ + anInt4147 * i_168_) >> 15);
						if (i_171_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
					} else
						i_169_ = i_170_ = i_187_ = i_171_ = anInt4160;
					int i_189_ = anInt4154 * i_186_;
					int i_190_ = anInt4143 * i_186_;
					i_172_ = anInt4144 + ((anInt4151 * i_165_ + i_189_ + anInt4145 * i_167_) >> 15);
					i_173_ = (((Class184) class184).anInt2562 + i_172_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_169_);
					i_174_ = anInt4150 + ((anInt4161 * i_165_ + i_190_ + anInt4157 * i_167_) >> 15);
					i_175_ = (((Class184) class184).anInt2568 + i_174_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_169_);
					i_176_ = anInt4144 + ((anInt4151 * i_166_ + i_189_ + anInt4145 * i_167_) >> 15);
					i_177_ = (((Class184) class184).anInt2562 + i_176_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_170_);
					i_178_ = anInt4150 + ((anInt4161 * i_166_ + i_190_ + anInt4157 * i_167_) >> 15);
					i_179_ = (((Class184) class184).anInt2568 + i_178_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_170_);
					int i_191_ = (anInt4144 + (anInt4151 * i_166_ + i_189_ + anInt4145 * i_168_ >> 15));
					i_180_ = (((Class184) class184).anInt2562 + i_191_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_187_);
					int i_192_ = (anInt4150 + (anInt4161 * i_166_ + i_190_ + anInt4157 * i_168_ >> 15));
					i_181_ = (((Class184) class184).anInt2568 + i_192_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_187_);
					i_182_ = anInt4144 + ((anInt4151 * i_165_ + i_189_ + anInt4145 * i_168_) >> 15);
					i_183_ = (((Class184) class184).anInt2562 + i_182_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_171_);
					i_184_ = anInt4150 + ((anInt4161 * i_165_ + i_190_ + anInt4157 * i_168_) >> 15);
					i_185_ = (((Class184) class184).anInt2568 + i_184_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_171_);
				} else {
					int i_193_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_162_]);
					int i_194_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_162_]);
					int i_195_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_162_ + 1]);
					int i_196_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_162_ + 1]);
					int i_197_;
					if (anInt4160 == -1) {
						i_169_ = anInt4159 + ((anInt4142 * i_165_ + anInt4158 * i_193_ + anInt4147 * i_167_) >> 15);
						if (i_169_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_170_ = anInt4159 + ((anInt4142 * i_166_ + anInt4158 * i_194_ + anInt4147 * i_167_) >> 15);
						if (i_170_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_197_ = anInt4159 + ((anInt4142 * i_166_ + anInt4158 * i_195_ + anInt4147 * i_168_) >> 15);
						if (i_197_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_171_ = anInt4159 + ((anInt4142 * i_165_ + anInt4158 * i_196_ + anInt4147 * i_168_) >> 15);
						if (i_171_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
					} else
						i_169_ = i_170_ = i_197_ = i_171_ = anInt4160;
					i_172_ = anInt4144 + ((anInt4151 * i_165_ + anInt4154 * i_193_ + anInt4145 * i_167_) >> 15);
					i_173_ = (((Class184) class184).anInt2562 + i_172_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_169_);
					i_174_ = anInt4150 + ((anInt4161 * i_165_ + anInt4143 * i_193_ + anInt4157 * i_167_) >> 15);
					i_175_ = (((Class184) class184).anInt2568 + i_174_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_169_);
					i_176_ = anInt4144 + ((anInt4151 * i_166_ + anInt4154 * i_194_ + anInt4145 * i_167_) >> 15);
					i_177_ = (((Class184) class184).anInt2562 + i_176_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_170_);
					i_178_ = anInt4150 + ((anInt4161 * i_166_ + anInt4143 * i_194_ + anInt4157 * i_167_) >> 15);
					i_179_ = (((Class184) class184).anInt2568 + i_178_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_170_);
					int i_198_ = anInt4144 + ((anInt4151 * i_166_ + anInt4154 * i_195_ + anInt4145 * i_168_) >> 15);
					i_180_ = (((Class184) class184).anInt2562 + i_198_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_197_);
					int i_199_ = anInt4150 + ((anInt4161 * i_166_ + anInt4143 * i_195_ + anInt4157 * i_168_) >> 15);
					i_181_ = (((Class184) class184).anInt2568 + i_199_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_197_);
					i_182_ = anInt4144 + ((anInt4151 * i_165_ + anInt4154 * i_196_ + anInt4145 * i_168_) >> 15);
					i_183_ = (((Class184) class184).anInt2562 + i_182_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_171_);
					i_184_ = anInt4150 + ((anInt4161 * i_165_ + anInt4143 * i_196_ + anInt4157 * i_168_) >> 15);
					i_185_ = (((Class184) class184).anInt2568 + i_184_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_171_);
				}
				if (((i_180_ - i_183_) * (i_179_ - i_185_) - (i_181_ - i_185_) * (i_177_ - i_183_)) > 0) {
					((Class184) class184).aBool2560 = (i_180_ < 0 || i_183_ < 0 || i_177_ < 0 || i_180_ > ((Class184) class184).anInt2557 || i_183_ > ((Class184) class184).anInt2557 || i_177_ > ((Class184) class184).anInt2557);
					if (((Class226) class226).aShort3117 >= 0) {
						if (method1886(((Class238) (((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, ((Class226) class226).aShort3117))).aByte3343))
							((Class184) class184).anInt2565 = 100;
						class184.method1192(i_181_, i_185_, i_179_, i_180_, i_183_, i_177_, ((Class226) class226).aShort3113 & 0xffff, ((Class226) class226).aShort3116 & 0xffff, ((Class226) class226).aShort3119 & 0xffff, i_172_, i_176_, i_182_, i_174_, i_178_, i_184_, i_169_, i_170_, i_171_, ((Class226) class226).aShort3117);
						((Class184) class184).anInt2565 = 0;
					} else
						class184.method1194(i_181_, i_185_, i_179_, i_180_, i_183_, i_177_, ((Class226) class226).aShort3113 & 0xffff, ((Class226) class226).aShort3116 & 0xffff, ((Class226) class226).aShort3119 & 0xffff);
				}
				if (((i_173_ - i_177_) * (i_185_ - i_179_) - (i_175_ - i_179_) * (i_183_ - i_177_)) > 0) {
					((Class184) class184).aBool2560 = (i_173_ < 0 || i_177_ < 0 || i_183_ < 0 || i_173_ > ((Class184) class184).anInt2557 || i_177_ > ((Class184) class184).anInt2557 || i_183_ > ((Class184) class184).anInt2557);
					if (((Class226) class226).aShort3117 >= 0) {
						if (method1886(((Class238) (((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, ((Class226) class226).aShort3117))).aByte3343))
							((Class184) class184).anInt2565 = 100;
						class184.method1192(i_175_, i_179_, i_185_, i_173_, i_177_, i_183_, ((Class226) class226).aShort3118 & 0xffff, ((Class226) class226).aShort3119 & 0xffff, ((Class226) class226).aShort3116 & 0xffff, i_172_, i_176_, i_182_, i_174_, i_178_, i_184_, i_169_, i_170_, i_171_, ((Class226) class226).aShort3117);
						((Class184) class184).anInt2565 = 0;
					} else
						class184.method1194(i_175_, i_179_, i_185_, i_173_, i_177_, i_183_, ((Class226) class226).aShort3118 & 0xffff, ((Class226) class226).aShort3119 & 0xffff, ((Class226) class226).aShort3116 & 0xffff);
				}
			}
		} else {
			Class30 class30 = aClass30ArrayArray4149[i][i_162_];
			if (class30 != null) {
				if (anInt4160 == -1) {
					for (int i_200_ = 0; i_200_ < ((Class30) class30).aShort398; i_200_++) {
						int i_201_ = (((Class30) class30).aShortArray406[i_200_] + (i << ((Class210) this).anInt2950));
						int i_202_ = ((Class30) class30).aShortArray407[i_200_];
						int i_203_ = (((Class30) class30).aShortArray405[i_200_] + (i_162_ << ((Class210) this).anInt2950));
						int i_204_ = anInt4159 + ((anInt4142 * i_201_ + anInt4158 * i_202_ + anInt4147 * i_203_) >> 15);
						if (i_204_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						int i_205_ = anInt4144 + ((anInt4151 * i_201_ + anInt4154 * i_202_ + anInt4145 * i_203_) >> 15);
						int i_206_ = anInt4150 + ((anInt4161 * i_201_ + anInt4143 * i_202_ + anInt4157 * i_203_) >> 15);
						is[i_200_] = (((Class184) class184).anInt2562 + i_205_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_204_);
						is_163_[i_200_] = (((Class184) class184).anInt2568 + i_206_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_204_);
					}
				} else {
					for (int i_207_ = 0; i_207_ < ((Class30) class30).aShort398; i_207_++) {
						int i_208_ = (((Class30) class30).aShortArray406[i_207_] + (i << ((Class210) this).anInt2950));
						int i_209_ = ((Class30) class30).aShortArray407[i_207_];
						int i_210_ = (((Class30) class30).aShortArray405[i_207_] + (i_162_ << ((Class210) this).anInt2950));
						int i_211_ = anInt4144 + ((anInt4151 * i_208_ + anInt4154 * i_209_ + anInt4145 * i_210_) >> 15);
						int i_212_ = anInt4150 + ((anInt4161 * i_208_ + anInt4143 * i_209_ + anInt4157 * i_210_) >> 15);
						is[i_207_] = (((Class184) class184).anInt2562 + i_211_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / anInt4160);
						is_163_[i_207_] = (((Class184) class184).anInt2568 + (i_212_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / anInt4160));
					}
				}
				if (((Class30) class30).aShortArray408 != null) {
					int i_213_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_162_]);
					int i_214_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_162_]);
					int i_215_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_162_ + 1]);
					int i_216_ = i * ((Class210) this).anInt2955;
					int i_217_ = i_216_ + ((Class210) this).anInt2955;
					int i_218_ = i_162_ * ((Class210) this).anInt2955;
					int i_219_ = i_218_ + ((Class210) this).anInt2955;
					int i_220_ = anInt4144 + ((anInt4151 * i_216_ + anInt4154 * i_213_ + anInt4145 * i_218_) >> 15);
					int i_221_ = anInt4150 + ((anInt4161 * i_216_ + anInt4143 * i_213_ + anInt4157 * i_218_) >> 15);
					int i_222_ = anInt4159 + ((anInt4142 * i_216_ + anInt4158 * i_213_ + anInt4147 * i_218_) >> 15);
					int i_223_ = anInt4144 + ((anInt4151 * i_217_ + anInt4154 * i_214_ + anInt4145 * i_218_) >> 15);
					int i_224_ = anInt4150 + ((anInt4161 * i_217_ + anInt4143 * i_214_ + anInt4157 * i_218_) >> 15);
					int i_225_ = anInt4159 + ((anInt4142 * i_217_ + anInt4158 * i_214_ + anInt4147 * i_218_) >> 15);
					int i_226_ = anInt4144 + ((anInt4151 * i_216_ + anInt4154 * i_215_ + anInt4145 * i_219_) >> 15);
					int i_227_ = anInt4150 + ((anInt4161 * i_216_ + anInt4143 * i_215_ + anInt4157 * i_219_) >> 15);
					int i_228_ = anInt4159 + ((anInt4142 * i_216_ + anInt4158 * i_215_ + anInt4147 * i_219_) >> 15);
					for (int i_229_ = 0; i_229_ < ((Class30) class30).aShort409; i_229_++) {
						short i_230_ = ((Class30) class30).aShortArray401[i_229_];
						short i_231_ = ((Class30) class30).aShortArray399[i_229_];
						short i_232_ = ((Class30) class30).aShortArray403[i_229_];
						int i_233_ = is[i_230_];
						int i_234_ = is[i_231_];
						int i_235_ = is[i_232_];
						int i_236_ = is_163_[i_230_];
						int i_237_ = is_163_[i_231_];
						int i_238_ = is_163_[i_232_];
						if (((i_233_ - i_234_) * (i_238_ - i_237_) - (i_236_ - i_237_) * (i_235_ - i_234_)) > 0) {
							((Class184) class184).aBool2560 = (i_233_ < 0 || i_234_ < 0 || i_235_ < 0 || i_233_ > ((Class184) class184).anInt2557 || i_234_ > ((Class184) class184).anInt2557 || (i_235_ > ((Class184) class184).anInt2557));
							short i_239_ = ((Class30) class30).aShortArray408[i_229_];
							if (i_239_ != -1) {
								if (method1886(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_239_)).aByte3343))
									((Class184) class184).anInt2565 = 100;
								class184.method1192(i_236_, i_237_, i_238_, i_233_, i_234_, i_235_, (((Class30) class30).aShortArray400[i_230_]), (((Class30) class30).aShortArray400[i_231_]), (((Class30) class30).aShortArray400[i_232_]), i_220_, i_223_, i_226_, i_221_, i_224_, i_227_, i_222_, i_225_, i_228_, i_239_);
								((Class184) class184).anInt2565 = 0;
							} else {
								int i_240_ = (((Class30) class30).anIntArray404[i_229_]);
								if (i_240_ != -1)
									class184.method1194(i_236_, i_237_, i_238_, i_233_, i_234_, i_235_, (Class109_Sub3.method1825(126, i_240_, (((Class30) class30).aShortArray400[i_230_]))), (Class109_Sub3.method1825(99, i_240_, (((Class30) class30).aShortArray400[i_231_]))), (Class109_Sub3.method1825(114, i_240_, (((Class30) class30).aShortArray400[i_232_]))));
							}
						}
					}
				} else {
					for (int i_241_ = 0; i_241_ < ((Class30) class30).aShort409; i_241_++) {
						short i_242_ = ((Class30) class30).aShortArray401[i_241_];
						short i_243_ = ((Class30) class30).aShortArray399[i_241_];
						short i_244_ = ((Class30) class30).aShortArray403[i_241_];
						int i_245_ = is[i_242_];
						int i_246_ = is[i_243_];
						int i_247_ = is[i_244_];
						int i_248_ = is_163_[i_242_];
						int i_249_ = is_163_[i_243_];
						int i_250_ = is_163_[i_244_];
						if (((i_245_ - i_246_) * (i_250_ - i_249_) - (i_248_ - i_249_) * (i_247_ - i_246_)) > 0) {
							int i_251_ = ((Class30) class30).anIntArray404[i_241_];
							if (i_251_ != -1) {
								((Class184) class184).aBool2560 = (i_245_ < 0 || i_246_ < 0 || i_247_ < 0 || (i_245_ > ((Class184) class184).anInt2557) || (i_246_ > ((Class184) class184).anInt2557) || (i_247_ > ((Class184) class184).anInt2557));
								class184.method1194(i_248_, i_249_, i_250_, i_245_, i_246_, i_247_, Class109_Sub3.method1825(109, i_251_, (((Class30) class30).aShortArray400[i_242_])), Class109_Sub3.method1825(120, i_251_, (((Class30) class30).aShortArray400[i_243_])), Class109_Sub3.method1825(123, i_251_, (((Class30) class30).aShortArray400[i_244_])));
							}
						}
					}
				}
			}
		}
	}

	final void method1384(int i, int i_252_, int i_253_, boolean[][] bools, boolean bool) {
		Class_c_Sub2 class_c_sub2 = ((Class260_Sub1) aClass260_Sub1_4141).aClass_c_Sub2_3857;
		anInt4160 = -1;
		anInt4151 = ((Class_c_Sub2) class_c_sub2).anInt5594;
		anInt4154 = ((Class_c_Sub2) class_c_sub2).anInt5588;
		anInt4145 = ((Class_c_Sub2) class_c_sub2).anInt5592;
		anInt4144 = ((Class_c_Sub2) class_c_sub2).anInt5589;
		anInt4161 = ((Class_c_Sub2) class_c_sub2).anInt5591;
		anInt4143 = ((Class_c_Sub2) class_c_sub2).anInt5586;
		anInt4157 = ((Class_c_Sub2) class_c_sub2).anInt5587;
		anInt4150 = ((Class_c_Sub2) class_c_sub2).anInt5584;
		anInt4142 = ((Class_c_Sub2) class_c_sub2).anInt5583;
		anInt4158 = ((Class_c_Sub2) class_c_sub2).anInt5590;
		anInt4147 = ((Class_c_Sub2) class_c_sub2).anInt5585;
		anInt4159 = ((Class_c_Sub2) class_c_sub2).anInt5593;
	}

	private final void method1889(int i, int i_254_, boolean bool, Class184 class184, int[] is, int[] is_255_, int[] is_256_) {
		Class164 class164 = aClass164ArrayArray4153[i][i_254_];
		if (class164 != null) {
			if ((((Class164) class164).aByte2325 & 0x2) == 0) {
				int i_257_ = i * ((Class210) this).anInt2955;
				int i_258_ = i_257_ + ((Class210) this).anInt2955;
				int i_259_ = i_254_ * ((Class210) this).anInt2955;
				int i_260_ = i_259_ + ((Class210) this).anInt2955;
				int i_261_ = 0;
				int i_262_ = 0;
				int i_263_ = 0;
				int i_264_ = 0;
				int i_265_;
				int i_266_;
				int i_267_;
				int i_268_;
				int i_269_;
				int i_270_;
				int i_271_;
				int i_272_;
				int i_273_;
				int i_274_;
				int i_275_;
				int i_276_;
				int i_277_;
				int i_278_;
				int i_279_;
				int i_280_;
				int i_281_;
				int i_282_;
				int i_283_;
				int i_284_;
				if ((((Class164) class164).aByte2325 & 0x1) != 0 && !bool) {
					int i_285_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_254_]);
					if (anInt4160 == -1) {
						int i_286_ = anInt4158 * i_285_;
						i_265_ = anInt4159 + ((anInt4142 * i_257_ + i_286_ + anInt4147 * i_259_) >> 15);
						if (i_265_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_266_ = anInt4159 + ((anInt4142 * i_258_ + i_286_ + anInt4147 * i_259_) >> 15);
						if (i_266_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_267_ = anInt4159 + ((anInt4142 * i_258_ + i_286_ + anInt4147 * i_260_) >> 15);
						if (i_267_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_268_ = anInt4159 + ((anInt4142 * i_257_ + i_286_ + anInt4147 * i_260_) >> 15);
						if (i_268_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
					} else
						i_265_ = i_266_ = i_267_ = i_268_ = anInt4160;
					if (((Class260_Sub1) aClass260_Sub1_4141).f_db) {
						int i_287_ = i_265_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_287_ > 0) {
							i_261_ = i_287_;
							if (i_261_ > 255)
								i_261_ = 255;
						}
						i_287_ = i_266_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_287_ > 0) {
							i_262_ = i_287_;
							if (i_262_ > 255)
								i_262_ = 255;
						}
						i_287_ = i_267_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_287_ > 0) {
							i_263_ = i_287_;
							if (i_263_ > 255)
								i_263_ = 255;
						}
						i_287_ = i_268_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_287_ > 0) {
							i_264_ = i_287_;
							if (i_264_ > 255)
								i_264_ = 255;
						}
					}
					int i_288_ = anInt4154 * i_285_;
					int i_289_ = anInt4143 * i_285_;
					i_269_ = anInt4144 + ((anInt4151 * i_257_ + i_288_ + anInt4145 * i_259_) >> 15);
					i_270_ = (((Class184) class184).anInt2562 + i_269_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_265_);
					i_271_ = anInt4150 + ((anInt4161 * i_257_ + i_289_ + anInt4157 * i_259_) >> 15);
					i_272_ = (((Class184) class184).anInt2568 + i_271_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_265_);
					i_273_ = anInt4144 + ((anInt4151 * i_258_ + i_288_ + anInt4145 * i_259_) >> 15);
					i_274_ = (((Class184) class184).anInt2562 + i_273_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_266_);
					i_275_ = anInt4150 + ((anInt4161 * i_258_ + i_289_ + anInt4157 * i_259_) >> 15);
					i_276_ = (((Class184) class184).anInt2568 + i_275_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_266_);
					i_277_ = anInt4144 + ((anInt4151 * i_258_ + i_288_ + anInt4145 * i_260_) >> 15);
					i_278_ = (((Class184) class184).anInt2562 + i_277_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_267_);
					i_279_ = anInt4150 + ((anInt4161 * i_258_ + i_289_ + anInt4157 * i_260_) >> 15);
					i_280_ = (((Class184) class184).anInt2568 + i_279_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_267_);
					i_281_ = anInt4144 + ((anInt4151 * i_257_ + i_288_ + anInt4145 * i_260_) >> 15);
					i_282_ = (((Class184) class184).anInt2562 + i_281_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_268_);
					i_283_ = anInt4150 + ((anInt4161 * i_257_ + i_289_ + anInt4157 * i_260_) >> 15);
					i_284_ = (((Class184) class184).anInt2568 + i_283_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_268_);
				} else {
					int i_290_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_254_]);
					int i_291_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_254_]);
					int i_292_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_254_ + 1]);
					int i_293_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_254_ + 1]);
					if (anInt4160 == -1) {
						i_265_ = anInt4159 + ((anInt4142 * i_257_ + anInt4158 * i_290_ + anInt4147 * i_259_) >> 15);
						if (i_265_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_266_ = anInt4159 + ((anInt4142 * i_258_ + anInt4158 * i_291_ + anInt4147 * i_259_) >> 15);
						if (i_266_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_267_ = anInt4159 + ((anInt4142 * i_258_ + anInt4158 * i_292_ + anInt4147 * i_260_) >> 15);
						if (i_267_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						i_268_ = anInt4159 + ((anInt4142 * i_257_ + anInt4158 * i_293_ + anInt4147 * i_260_) >> 15);
						if (i_268_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
					} else
						i_265_ = i_266_ = i_267_ = i_268_ = anInt4160;
					if (bool) {
						int i_294_ = i_265_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_294_ > 255)
							i_294_ = 255;
						if (i_294_ > 0) {
							i_261_ = i_294_;
							int i_295_ = (((Class164) class164).aShort2317 * i_294_ / 255);
							if (i_295_ > 0)
								i_290_ -= i_295_;
						}
						i_294_ = i_266_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_294_ > 255)
							i_294_ = 255;
						if (i_294_ > 0) {
							i_262_ = i_294_;
							int i_296_ = (((Class164) class164).aShort2324 * i_294_ / 255);
							if (i_296_ > 0)
								i_291_ -= i_296_;
						}
						i_294_ = i_267_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_294_ > 255)
							i_294_ = 255;
						if (i_294_ > 0) {
							i_263_ = i_294_;
							int i_297_ = (((Class164) class164).aShort2319 * i_294_ / 255);
							if (i_297_ > 0)
								i_292_ -= i_297_;
						}
						i_294_ = i_268_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_294_ > 255)
							i_294_ = 255;
						if (i_294_ > 0) {
							i_264_ = i_294_;
							int i_298_ = (((Class164) class164).aShort2322 * i_294_ / 255);
							if (i_298_ > 0)
								i_293_ -= i_298_;
						}
					} else if (((Class260_Sub1) aClass260_Sub1_4141).f_db) {
						int i_299_ = i_265_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_299_ > 0) {
							i_261_ = i_299_;
							if (i_261_ > 255)
								i_261_ = 255;
						}
						i_299_ = i_266_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_299_ > 0) {
							i_262_ = i_299_;
							if (i_262_ > 255)
								i_262_ = 255;
						}
						i_299_ = i_267_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_299_ > 0) {
							i_263_ = i_299_;
							if (i_263_ > 255)
								i_263_ = 255;
						}
						i_299_ = i_268_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846);
						if (i_299_ > 0) {
							i_264_ = i_299_;
							if (i_264_ > 255)
								i_264_ = 255;
						}
					}
					i_269_ = anInt4144 + ((anInt4151 * i_257_ + anInt4154 * i_290_ + anInt4145 * i_259_) >> 15);
					i_270_ = (((Class184) class184).anInt2562 + i_269_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_265_);
					i_271_ = anInt4150 + ((anInt4161 * i_257_ + anInt4143 * i_290_ + anInt4157 * i_259_) >> 15);
					i_272_ = (((Class184) class184).anInt2568 + i_271_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_265_);
					i_273_ = anInt4144 + ((anInt4151 * i_258_ + anInt4154 * i_291_ + anInt4145 * i_259_) >> 15);
					i_274_ = (((Class184) class184).anInt2562 + i_273_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_266_);
					i_275_ = anInt4150 + ((anInt4161 * i_258_ + anInt4143 * i_291_ + anInt4157 * i_259_) >> 15);
					i_276_ = (((Class184) class184).anInt2568 + i_275_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_266_);
					i_277_ = anInt4144 + ((anInt4151 * i_258_ + anInt4154 * i_292_ + anInt4145 * i_260_) >> 15);
					i_278_ = (((Class184) class184).anInt2562 + i_277_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_267_);
					i_279_ = anInt4150 + ((anInt4161 * i_258_ + anInt4143 * i_292_ + anInt4157 * i_260_) >> 15);
					i_280_ = (((Class184) class184).anInt2568 + i_279_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_267_);
					i_281_ = anInt4144 + ((anInt4151 * i_257_ + anInt4154 * i_293_ + anInt4145 * i_260_) >> 15);
					i_282_ = (((Class184) class184).anInt2562 + i_281_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_268_);
					i_283_ = anInt4150 + ((anInt4161 * i_257_ + anInt4143 * i_293_ + anInt4157 * i_260_) >> 15);
					i_284_ = (((Class184) class184).anInt2568 + i_283_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_268_);
				}
				boolean bool_300_ = (((Class164) class164).aShort2316 != -1 && method1886(((Class238) (((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, ((Class164) class164).aShort2316))).aByte3343));
				int i_301_ = i_262_ + i_263_ + i_264_;
				if (((i_278_ - i_282_) * (i_276_ - i_284_) - (i_280_ - i_284_) * (i_274_ - i_282_)) > 0) {
					((Class184) class184).aBool2560 = (i_278_ < 0 || i_282_ < 0 || i_274_ < 0 || i_278_ > ((Class184) class184).anInt2557 || i_282_ > ((Class184) class184).anInt2557 || i_274_ > ((Class184) class184).anInt2557);
					if (i_301_ < 765) {
						if (bool_300_)
							((Class184) class184).anInt2565 = 100;
						if (i_301_ > 0) {
							if (((Class164) class164).aShort2316 >= 0)
								class184.method1189(i_280_, i_284_, i_276_, i_278_, i_282_, i_274_, (((Class260_Sub1) aClass260_Sub1_4141).anInt3843), i_263_, i_264_, i_262_, ((Class164) class164).anInt2315, ((Class164) class164).anInt2323, ((Class164) class164).anInt2320, i_277_, i_281_, i_273_, i_279_, i_283_, i_275_, i_267_, i_268_, i_266_, ((Class164) class164).aShort2316);
							else
								class184.method1195(i_280_, i_284_, i_276_, i_278_, i_282_, i_274_, (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2315, i_263_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))), (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2323, i_264_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))), (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2320, i_262_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))));
						} else if (((Class164) class164).aShort2316 >= 0)
							class184.method1192(i_280_, i_284_, i_276_, i_278_, i_282_, i_274_, ((Class164) class164).anInt2315, ((Class164) class164).anInt2323, ((Class164) class164).anInt2320, i_277_, i_281_, i_273_, i_279_, i_283_, i_275_, i_267_, i_268_, i_266_, ((Class164) class164).aShort2316);
						else
							class184.method1195(i_280_, i_284_, i_276_, i_278_, i_282_, i_274_, ((Class164) class164).anInt2315, ((Class164) class164).anInt2323, ((Class164) class164).anInt2320);
						((Class184) class184).anInt2565 = 0;
					} else
						class184.method1199(i_280_, i_284_, i_276_, i_278_, i_282_, i_274_, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843);
				}
				i_301_ = i_261_ + i_262_ + i_264_;
				if (((i_270_ - i_274_) * (i_284_ - i_276_) - (i_272_ - i_276_) * (i_282_ - i_274_)) > 0) {
					((Class184) class184).aBool2560 = (i_270_ < 0 || i_274_ < 0 || i_282_ < 0 || i_270_ > ((Class184) class184).anInt2557 || i_274_ > ((Class184) class184).anInt2557 || i_282_ > ((Class184) class184).anInt2557);
					if (i_301_ < 765) {
						if (bool_300_)
							((Class184) class184).anInt2565 = 100;
						if (i_301_ > 0) {
							if (((Class164) class164).aShort2316 >= 0)
								class184.method1189(i_272_, i_276_, i_284_, i_270_, i_274_, i_282_, (((Class260_Sub1) aClass260_Sub1_4141).anInt3843), i_261_, i_262_, i_264_, ((Class164) class164).anInt2318, ((Class164) class164).anInt2320, ((Class164) class164).anInt2323, i_269_, i_273_, i_281_, i_271_, i_275_, i_283_, i_265_, i_266_, i_268_, ((Class164) class164).aShort2316);
							else
								class184.method1195(i_272_, i_276_, i_284_, i_270_, i_274_, i_282_, (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2318, i_261_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))), (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2320, i_262_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))), (BufferStream.method2402((byte) 70, ((Class164) class164).anInt2323, i_264_ << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843))));
						} else if (((Class164) class164).aShort2316 >= 0)
							class184.method1192(i_272_, i_276_, i_284_, i_270_, i_274_, i_282_, ((Class164) class164).anInt2318, ((Class164) class164).anInt2320, ((Class164) class164).anInt2323, i_269_, i_273_, i_281_, i_271_, i_275_, i_283_, i_265_, i_266_, i_268_, ((Class164) class164).aShort2316);
						else
							class184.method1195(i_272_, i_276_, i_284_, i_270_, i_274_, i_282_, ((Class164) class164).anInt2318, ((Class164) class164).anInt2320, ((Class164) class164).anInt2323);
						((Class184) class184).anInt2565 = 0;
					} else
						class184.method1199(i_272_, i_276_, i_284_, i_270_, i_274_, i_282_, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843);
				}
			}
		} else {
			Class212 class212 = aClass212ArrayArray4148[i][i_254_];
			if (class212 != null) {
				if (anInt4160 == -1) {
					for (int i_302_ = 0; i_302_ < ((Class212) class212).aShort2975; i_302_++) {
						int i_303_ = (((Class212) class212).aShortArray2974[i_302_] + (i << ((Class210) this).anInt2950));
						int i_304_ = ((Class212) class212).aShortArray2973[i_302_];
						int i_305_ = (((Class212) class212).aShortArray2966[i_302_] + (i_254_ << ((Class210) this).anInt2950));
						int i_306_ = anInt4159 + ((anInt4142 * i_303_ + anInt4158 * i_304_ + anInt4147 * i_305_) >> 15);
						if (i_306_ <= ((Class260_Sub1) aClass260_Sub1_4141).anInt3839)
							return;
						is_256_[i_302_] = 0;
						if (bool) {
							int i_307_ = (i_306_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846));
							if (i_307_ > 255)
								i_307_ = 255;
							if (i_307_ > 0) {
								is_256_[i_302_] = i_307_;
								int i_308_ = ((((Class212) class212).aShortArray2968[i_302_]) * i_307_ / 255);
								if (i_308_ > 0)
									i_304_ -= i_308_;
							}
						} else if (((Class260_Sub1) aClass260_Sub1_4141).f_db) {
							int i_309_ = (i_306_ - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846));
							if (i_309_ > 0) {
								is_256_[i_302_] = i_309_;
								if (is_256_[i_302_] > 255)
									is_256_[i_302_] = 255;
							}
						}
						int i_310_ = anInt4144 + ((anInt4151 * i_303_ + anInt4154 * i_304_ + anInt4145 * i_305_) >> 15);
						int i_311_ = anInt4150 + ((anInt4161 * i_303_ + anInt4143 * i_304_ + anInt4157 * i_305_) >> 15);
						is[i_302_] = (((Class184) class184).anInt2562 + i_310_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / i_306_);
						is_255_[i_302_] = (((Class184) class184).anInt2568 + i_311_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / i_306_);
					}
				} else {
					for (int i_312_ = 0; i_312_ < ((Class212) class212).aShort2975; i_312_++) {
						int i_313_ = (((Class212) class212).aShortArray2974[i_312_] + (i << ((Class210) this).anInt2950));
						int i_314_ = ((Class212) class212).aShortArray2973[i_312_];
						int i_315_ = (((Class212) class212).aShortArray2966[i_312_] + (i_254_ << ((Class210) this).anInt2950));
						is_256_[i_312_] = 0;
						if (bool) {
							int i_316_ = (anInt4160 - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846));
							if (i_316_ > 255)
								i_316_ = 255;
							if (i_316_ > 0) {
								is_256_[i_312_] = i_316_;
								int i_317_ = ((((Class212) class212).aShortArray2968[i_312_]) * i_316_ / 255);
								if (i_317_ > 0)
									i_314_ -= i_317_;
							}
						} else if (((Class260_Sub1) aClass260_Sub1_4141).f_db) {
							int i_318_ = (anInt4160 - (((Class260_Sub1) aClass260_Sub1_4141).anInt3846));
							if (i_318_ > 0) {
								is_256_[i_312_] = i_318_;
								if (is_256_[i_312_] > 255)
									is_256_[i_312_] = 255;
							}
						}
						int i_319_ = anInt4144 + ((anInt4151 * i_313_ + anInt4154 * i_314_ + anInt4145 * i_315_) >> 15);
						int i_320_ = anInt4150 + ((anInt4161 * i_313_ + anInt4143 * i_314_ + anInt4157 * i_315_) >> 15);
						is[i_312_] = (((Class184) class184).anInt2562 + i_319_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3851) / anInt4160);
						is_255_[i_312_] = (((Class184) class184).anInt2568 + (i_320_ * (((Class260_Sub1) aClass260_Sub1_4141).anInt3852) / anInt4160));
					}
				}
				if (((Class212) class212).aShortArray2969 != null) {
					int i_321_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_254_]);
					int i_322_ = (((Class210_Sub1) this).anIntArrayArray4156[i + 1][i_254_]);
					int i_323_ = (((Class210_Sub1) this).anIntArrayArray4156[i][i_254_ + 1]);
					int i_324_ = i * ((Class210) this).anInt2955;
					int i_325_ = i_324_ + ((Class210) this).anInt2955;
					int i_326_ = i_254_ * ((Class210) this).anInt2955;
					int i_327_ = i_326_ + ((Class210) this).anInt2955;
					int i_328_ = anInt4144 + ((anInt4151 * i_324_ + anInt4154 * i_321_ + anInt4145 * i_326_) >> 15);
					int i_329_ = anInt4150 + ((anInt4161 * i_324_ + anInt4143 * i_321_ + anInt4157 * i_326_) >> 15);
					int i_330_ = anInt4159 + ((anInt4142 * i_324_ + anInt4158 * i_321_ + anInt4147 * i_326_) >> 15);
					int i_331_ = anInt4144 + ((anInt4151 * i_325_ + anInt4154 * i_322_ + anInt4145 * i_326_) >> 15);
					int i_332_ = anInt4150 + ((anInt4161 * i_325_ + anInt4143 * i_322_ + anInt4157 * i_326_) >> 15);
					int i_333_ = anInt4159 + ((anInt4142 * i_325_ + anInt4158 * i_322_ + anInt4147 * i_326_) >> 15);
					int i_334_ = anInt4144 + ((anInt4151 * i_324_ + anInt4154 * i_323_ + anInt4145 * i_327_) >> 15);
					int i_335_ = anInt4150 + ((anInt4161 * i_324_ + anInt4143 * i_323_ + anInt4157 * i_327_) >> 15);
					int i_336_ = anInt4159 + ((anInt4142 * i_324_ + anInt4158 * i_323_ + anInt4147 * i_327_) >> 15);
					for (int i_337_ = 0; i_337_ < ((Class212) class212).aShort2967; i_337_++) {
						int i_338_ = i_337_ * 3;
						int i_339_ = i_338_ + 1;
						int i_340_ = i_339_ + 1;
						int i_341_ = is[i_338_];
						int i_342_ = is[i_339_];
						int i_343_ = is[i_340_];
						int i_344_ = is_255_[i_338_];
						int i_345_ = is_255_[i_339_];
						int i_346_ = is_255_[i_340_];
						int i_347_ = (is_256_[i_338_] + is_256_[i_339_] + is_256_[i_340_]);
						if (((i_341_ - i_342_) * (i_346_ - i_345_) - (i_344_ - i_345_) * (i_343_ - i_342_)) > 0) {
							((Class184) class184).aBool2560 = (i_341_ < 0 || i_342_ < 0 || i_343_ < 0 || i_341_ > ((Class184) class184).anInt2557 || i_342_ > ((Class184) class184).anInt2557 || (i_343_ > ((Class184) class184).anInt2557));
							short i_348_ = (((Class212) class212).aShortArray2969[i_337_]);
							if (i_347_ < 765) {
								if (i_348_ != -1 && (method1886(((Class238) ((Class260) aClass260_Sub1_4141).anInterface6_3714.method17(-31305, i_348_)).aByte3343)))
									((Class184) class184).anInt2565 = 100;
								if (i_347_ > 0) {
									if (i_348_ != -1)
										class184.method1189(i_344_, i_345_, i_346_, i_341_, i_342_, i_343_, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843, is_256_[i_338_], is_256_[i_339_], is_256_[i_340_], (((Class212) class212).anIntArray2972[i_338_]), (((Class212) class212).anIntArray2972[i_339_]), (((Class212) class212).anIntArray2972[i_340_]), i_328_, i_331_, i_334_, i_329_, i_332_, i_335_, i_330_, i_333_, i_336_, i_348_);
									else if (((((Class212) class212).anIntArray2972[i_338_]) & 0xffffff) != 0)
										class184.method1195(i_344_, i_345_, i_346_, i_341_, i_342_, i_343_, (BufferStream.method2402((byte) 70, (((Class212) class212).anIntArray2972[i_338_]), (is_256_[i_338_] << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843)))), (BufferStream.method2402((byte) 70, (((Class212) class212).anIntArray2972[i_339_]), (is_256_[i_339_] << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843)))), (BufferStream.method2402((byte) 70, (((Class212) class212).anIntArray2972[i_340_]), (is_256_[i_340_] << 24 | (((Class260_Sub1) aClass260_Sub1_4141).anInt3843)))));
								} else if (i_348_ != -1)
									class184.method1192(i_344_, i_345_, i_346_, i_341_, i_342_, i_343_, (((Class212) class212).anIntArray2972[i_338_]), (((Class212) class212).anIntArray2972[i_339_]), (((Class212) class212).anIntArray2972[i_340_]), i_328_, i_331_, i_334_, i_329_, i_332_, i_335_, i_330_, i_333_, i_336_, i_348_);
								else if (((((Class212) class212).anIntArray2972[i_338_]) & 0xffffff) != 0)
									class184.method1195(i_344_, i_345_, i_346_, i_341_, i_342_, i_343_, (((Class212) class212).anIntArray2972[i_338_]), (((Class212) class212).anIntArray2972[i_339_]), (((Class212) class212).anIntArray2972[i_340_]));
								((Class184) class184).anInt2565 = 0;
							} else
								class184.method1199(i_344_, i_345_, i_346_, i_341_, i_342_, i_343_, (((Class260_Sub1) aClass260_Sub1_4141).anInt3843));
						}
					}
				} else {
					for (int i_349_ = 0; i_349_ < ((Class212) class212).aShort2967; i_349_++) {
						int i_350_ = i_349_ * 3;
						int i_351_ = i_350_ + 1;
						int i_352_ = i_351_ + 1;
						int i_353_ = is[i_350_];
						int i_354_ = is[i_351_];
						int i_355_ = is[i_352_];
						int i_356_ = is_255_[i_350_];
						int i_357_ = is_255_[i_351_];
						int i_358_ = is_255_[i_352_];
						int i_359_ = (is_256_[i_350_] + is_256_[i_351_] + is_256_[i_352_]);
						if (((i_353_ - i_354_) * (i_358_ - i_357_) - (i_356_ - i_357_) * (i_355_ - i_354_)) > 0) {
							((Class184) class184).aBool2560 = (i_353_ < 0 || i_354_ < 0 || i_355_ < 0 || i_353_ > ((Class184) class184).anInt2557 || i_354_ > ((Class184) class184).anInt2557 || (i_355_ > ((Class184) class184).anInt2557));
							if (i_359_ < 765) {
								if (i_359_ > 0) {
									if (((((Class212) class212).anIntArray2972[i_350_]) & 0xffffff) != 0)
										class184.method1195(i_356_, i_357_, i_358_, i_353_, i_354_, i_355_, (Class246_Sub28_Sub29.method2820(true, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843, is_256_[i_350_], (((Class212) class212).anIntArray2972[i_350_]))), (Class246_Sub28_Sub29.method2820(true, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843, is_256_[i_351_], (((Class212) class212).anIntArray2972[i_351_]))), (Class246_Sub28_Sub29.method2820(true, ((Class260_Sub1) aClass260_Sub1_4141).anInt3843, is_256_[i_352_], (((Class212) class212).anIntArray2972[i_352_]))));
								} else if (((((Class212) class212).anIntArray2972[i_350_]) & 0xffffff) != 0)
									class184.method1195(i_356_, i_357_, i_358_, i_353_, i_354_, i_355_, (((Class212) class212).anIntArray2972[i_350_]), (((Class212) class212).anIntArray2972[i_351_]), (((Class212) class212).anIntArray2972[i_352_]));
							} else
								class184.method1199(i_356_, i_357_, i_358_, i_353_, i_354_, i_355_, (((Class260_Sub1) aClass260_Sub1_4141).anInt3843));
						}
					}
				}
			}
		}
	}

	final void method1383(int i, int i_360_) {
		Class36 class36 = aClass260_Sub1_4141.method1798(Thread.currentThread());
		((Class184) ((Class36) class36).aClass184_494).anInt2565 = 0;
		if (aClass164ArrayArray4153 != null)
			method1889(i, i_360_, ((Class260_Sub1) aClass260_Sub1_4141).aBool3840, ((Class36) class36).aClass184_494, ((Class36) class36).anIntArray516, ((Class36) class36).anIntArray541, ((Class36) class36).anIntArray506);
		else if (aClass226ArrayArray4146 != null)
			method1888(i, i_360_, ((Class36) class36).aClass184_494, ((Class36) class36).anIntArray516, ((Class36) class36).anIntArray541, ((Class36) class36).anIntArray506);
	}

	final boolean method1377(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_361_, int i_362_, int i_363_, boolean bool) {
		return false;
	}

	final int a(int i, int i_364_) {
		int i_365_ = i >> ((Class210) this).anInt2950;
		int i_366_ = i_364_ >> ((Class210) this).anInt2950;
		if (i_365_ < 0 || i_366_ < 0 || i_365_ > ((Class210) this).anInt2956 - 1 || i_366_ > ((Class210) this).anInt2952 - 1)
			return 0;
		int i_367_ = i & ((Class210) this).anInt2955 - 1;
		int i_368_ = i_364_ & ((Class210) this).anInt2955 - 1;
		int i_369_ = (((((Class210_Sub1) this).anIntArrayArray4156[i_365_][i_366_] * (((Class210) this).anInt2955 - i_367_)) + (((Class210_Sub1) this).anIntArrayArray4156[i_365_ + 1][i_366_]) * i_367_) >> ((Class210) this).anInt2950);
		int i_370_ = (((((Class210_Sub1) this).anIntArrayArray4156[i_365_][i_366_ + 1] * (((Class210) this).anInt2955 - i_367_)) + (((Class210_Sub1) this).anIntArrayArray4156[i_365_ + 1][i_366_ + 1]) * i_367_) >> ((Class210) this).anInt2950);
		return ((i_369_ * (((Class210) this).anInt2955 - i_368_) + i_370_ * i_368_) >> ((Class210) this).anInt2950);
	}

	final void i(int i, int i_371_, int i_372_) {
		if (aByteArrayArray4155[i][i_371_] < i_372_)
			aByteArrayArray4155[i][i_371_] = (byte) i_372_;
	}

	final void method1380(int i, int i_373_, int i_374_, int i_375_, int i_376_, int i_377_, int i_378_, boolean[][] bools) {
		Class36 class36 = aClass260_Sub1_4141.method1798(Thread.currentThread());
		Class184 class184 = ((Class36) class36).aClass184_494;
		((Class184) class184).anInt2565 = 0;
		((Class184) class184).aBool2560 = false;
		if (aClass164ArrayArray4153 != null)
			method1884(i, i_373_, i_374_, i_375_, i_376_, i_377_, i_378_, bools, class184, ((Class36) class36).anIntArray516, ((Class36) class36).anIntArray541);
		else if (aClass226ArrayArray4146 != null)
			method1887(i, i_373_, i_374_, i_375_, i_376_, i_377_, i_378_, bools, class184, ((Class36) class36).anIntArray516, ((Class36) class36).anIntArray541);
	}
}
