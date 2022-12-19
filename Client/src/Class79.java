/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class79 {
	static Class246_Sub1_Sub5 aClass246_Sub1_Sub5_1020;
	private static Class85 aClass85_1021 = new Class85(16);
	static Class165 aClass165_1022;
	static Class_fs aClass_fs1023;
	static Class254 aClass254_1024;
	static Interface11 anInterface11_1025;
	private static Class175 aClass175_1026;
	private static Class105 aClass105_1027;
	static Class251 aClass251_1028;
	static int anInt1029 = (int) (Math.random() * 11.0) - 5;
	static int anInt1030;
	static Class178 aClass178_1031;
	static byte[][][] aByteArrayArrayArray1032;
	static float aFloat1033;
	static Class166 aClass166_1034;
	private static short[] aShortArray1035 = new short[1];
	static float aFloat1036;
	private static byte[] aByteArray1037;
	static int anInt1038 = (int) (Math.random() * 17.0) - 8;
	static int anInt1039;
	static int anInt1040;
	static int anInt1041;
	private static short[] aShortArray1042;
	private static int[] anIntArray1043;
	private static byte[] aByteArray1044;
	private static byte[] aByteArray1045;
	private static Class85 aClass85_1046;
	static int anInt1047;
	static int anInt1048;
	static int anInt1049;
	private static byte[] aByteArray1050;
	private static byte[] aByteArray1051;
	static int anInt1052;
	private static byte[] aByteArray1053;
	static int anInt1054;
	static int anInt1055;
	static int anInt1056;
	static int anInt1057;
	static int anInt1058;
	private static short[] aShortArray1059;
	private static Class68[][][] aClass68ArrayArrayArray1060;

	static final void method496(int i) {
		aClass246_Sub1_Sub5_1020 = (Class246_Sub1_Sub5) aClass85_1021.method544((long) i, 127);
	}

	private static final void method497(Class260 class260, int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = anInt1052 - anInt1048;
		int i_4_ = anInt1039 - anInt1047;
		if (anInt1052 < anInt1054)
			i_3_++;
		if (anInt1039 < anInt1058)
			i_4_++;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			int i_6_ = (i_1_ + i * i_5_ >> 16) + anInt1040;
			int i_7_ = (i_1_ + i * (i_5_ + 1) >> 16) + anInt1040;
			int i_8_ = i_7_ - i_6_;
			if (i_8_ > 0) {
				int i_9_ = anInt1048 + i_5_;
				if (i_9_ < 0 || i_9_ >= anInt1054) {
					for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
						int i_11_ = anInt1055 - (i_2_ + i_0_ * (i_10_ + 1) >> 16);
						int i_12_ = anInt1055 - (i_2_ + i_0_ * i_10_ >> 16);
						int i_13_ = i_12_ - i_11_;
						int i_14_;
						if ((((Class246_Sub1_Sub5) aClass246_Sub1_Sub5_1020).anInt5841) != -1)
							i_14_ = ~0xffffff | (((Class246_Sub1_Sub5) aClass246_Sub1_Sub5_1020).anInt5841);
						else if ((i_5_ + anInt1048 & 0x4) != (i_10_ + anInt1039 & 0x4))
							i_14_ = -11840664;
						else
							i_14_ = anIntArray1043[(((Class105) aClass105_1027).anInt1467) + 1];
						if (i_14_ == 0)
							i_14_ = -16777216;
						class260.O(i_6_, i_11_, i_8_, i_13_, i_14_, 0);
					}
				} else {
					for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
						int i_16_ = anInt1055 - (i_2_ + i_0_ * (i_15_ + 1) >> 16);
						int i_17_ = anInt1055 - (i_2_ + i_0_ * i_15_ >> 16);
						int i_18_ = i_17_ - i_16_;
						if (i_18_ > 0) {
							int i_19_ = i_15_ + anInt1047;
							int i_20_ = i_9_ + i_19_ * anInt1054;
							int i_21_ = 0;
							int i_22_ = 0;
							int i_23_ = 0;
							if (i_19_ >= 0 && i_19_ < anInt1058) {
								i_21_ = ((aByteArray1051[i_20_] & 0xff) << 16 | aShortArray1059[i_20_] & 0xffff);
								if (i_21_ != 0)
									i_21_ |= ~0xffffff;
								i_22_ = aByteArray1045[i_20_] & 0xff;
								i_23_ = aShortArray1042[i_20_] & 0xffff;
							}
							if (i_21_ == 0 && i_22_ == 0 && i_23_ == 0) {
								if (((Class246_Sub1_Sub5) aClass246_Sub1_Sub5_1020).anInt5841 != -1)
									i_21_ = (~0xffffff | (((Class246_Sub1_Sub5) aClass246_Sub1_Sub5_1020).anInt5841));
								else if ((i_5_ + anInt1048 & 0x4) != (i_15_ + anInt1039 & 0x4))
									i_21_ = -11840664;
								else
									i_21_ = (anIntArray1043[(((Class105) aClass105_1027).anInt1467) + 1]);
								if (i_21_ == 0)
									i_21_ = -16777216;
								class260.O(i_6_, i_16_, i_8_, i_18_, i_21_, 0);
							} else if (i_23_ > 0) {
								if (i_23_ == 65535) {
									Class246_Sub21 class246_sub21 = ((Class246_Sub21) (aClass85_1046.method544((long) (i_9_ << 16 | i_19_), 124)));
									if (class246_sub21 != null)
										method501(class260, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray1050[i_20_], (((Class246_Sub21) class246_sub21).aShortArray4747), (((Class246_Sub21) class246_sub21).aByteArray4746), true);
								} else {
									aShortArray1035[0] = (short) (i_23_ - 1);
									aByteArray1037[0] = aByteArray1053[i_20_];
									method501(class260, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray1050[i_20_], aShortArray1035, aByteArray1037, true);
								}
							} else
								method501(class260, i_6_, i_16_, i_8_, i_18_, i_21_, i_22_, aByteArray1050[i_20_], null, null, true);
						}
					}
				}
			}
		}
		for (int i_24_ = -16; i_24_ < i_3_ + 16; i_24_++) {
			int i_25_ = (i_1_ + i * i_24_ >> 16) + anInt1040;
			int i_26_ = (i_1_ + i * (i_24_ + 1) >> 16) + anInt1040;
			int i_27_ = i_26_ - i_25_;
			if (i_27_ > 0) {
				int i_28_ = i_24_ + anInt1048;
				if (i_28_ >= 0 && i_28_ < anInt1054) {
					for (int i_29_ = -16; i_29_ < i_4_ + 16; i_29_++) {
						int i_30_ = anInt1055 - (i_2_ + i_0_ * (i_29_ + 1) >> 16);
						int i_31_ = anInt1055 - (i_2_ + i_0_ * i_29_ >> 16);
						int i_32_ = i_31_ - i_30_;
						if (i_32_ > 0) {
							int i_33_ = i_29_ + anInt1047;
							if (i_33_ >= 0 && i_33_ < anInt1058) {
								int i_34_ = ((aShortArray1042[i_28_ + i_33_ * anInt1054]) & 0xffff);
								if (i_34_ > 0) {
									if (i_34_ == 65535) {
										Class246_Sub21 class246_sub21 = ((Class246_Sub21) (aClass85_1046.method544((long) (i_28_ << 16 | i_33_), 125)));
										if (class246_sub21 != null)
											method508(class260, i_25_, i_30_, i_27_, i_32_, (((Class246_Sub21) class246_sub21).aShortArray4747), (((Class246_Sub21) class246_sub21).aByteArray4746));
									} else {
										aShortArray1035[0] = (short) (i_34_ - 1);
										aByteArray1037[0] = (aByteArray1053[i_28_ + i_33_ * anInt1054]);
										method508(class260, i_25_, i_30_, i_27_, i_32_, aShortArray1035, aByteArray1037);
									}
								} else
									method508(class260, i_25_, i_30_, i_27_, i_32_, null, null);
							}
						}
					}
				}
			}
		}
		int i_35_ = anInt1048 >> 6;
		int i_36_ = anInt1047 >> 6;
		if (i_35_ < 0)
			i_35_ = 0;
		if (i_36_ < 0)
			i_36_ = 0;
		int i_37_ = anInt1052 >> 6;
		int i_38_ = anInt1039 >> 6;
		if (i_37_ >= aClass68ArrayArrayArray1060[0].length)
			i_37_ = aClass68ArrayArrayArray1060[0].length - 1;
		if (i_38_ >= aClass68ArrayArrayArray1060[0][0].length)
			i_38_ = aClass68ArrayArrayArray1060[0][0].length - 1;
		for (int i_39_ = 0; i_39_ < 3; i_39_++) {
			for (int i_40_ = i_35_; i_40_ <= i_37_; i_40_++) {
				for (int i_41_ = i_36_; i_41_ <= i_38_; i_41_++) {
					Class68 class68 = aClass68ArrayArrayArray1060[i_39_][i_40_][i_41_];
					if (class68 != null) {
						int i_42_ = (i_40_ + (anInt1057 >> 6)) * 64;
						int i_43_ = (i_41_ + (anInt1041 >> 6)) * 64;
						for (Class130_Sub7 class130_sub7 = (Class130_Sub7) class68.method445(62); class130_sub7 != null; class130_sub7 = ((Class130_Sub7) class68.method442((byte) -66))) {
							int i_44_ = (i_42_ + ((Class130_Sub7) class130_sub7).aByte5409 - anInt1057 - anInt1048);
							int i_45_ = (i_43_ + ((Class130_Sub7) class130_sub7).aByte5408 - anInt1041 - anInt1047);
							int i_46_ = (i_1_ + i * i_44_ >> 16) + anInt1040;
							int i_47_ = (i_1_ + i * (i_44_ + 1) >> 16) + anInt1040;
							int i_48_ = (anInt1055 - (i_2_ + i_0_ * (i_45_ + 1) >> 16));
							int i_49_ = anInt1055 - (i_2_ + i_0_ * i_45_ >> 16);
							method501(class260, i_46_, i_48_, i_47_ - i_46_, i_49_ - i_48_, (((Class130_Sub7) class130_sub7).anInt5414), (((Class130_Sub7) class130_sub7).aByte5410) & 0xff, (((Class130_Sub7) class130_sub7).aByte5412), (((Class130_Sub7) class130_sub7).aShortArray5411), (((Class130_Sub7) class130_sub7).aByteArray5413), false);
						}
					}
				}
			}
			for (int i_50_ = i_35_; i_50_ <= i_37_; i_50_++) {
				for (int i_51_ = i_36_; i_51_ <= i_38_; i_51_++) {
					Class68 class68 = aClass68ArrayArrayArray1060[i_39_][i_50_][i_51_];
					if (class68 != null) {
						int i_52_ = (i_50_ + (anInt1057 >> 6)) * 64;
						int i_53_ = (i_51_ + (anInt1041 >> 6)) * 64;
						for (Class130_Sub7 class130_sub7 = (Class130_Sub7) class68.method445(62); class130_sub7 != null; class130_sub7 = ((Class130_Sub7) class68.method442((byte) -69))) {
							int i_54_ = (i_52_ + ((Class130_Sub7) class130_sub7).aByte5409 - anInt1057 - anInt1048);
							int i_55_ = (i_53_ + ((Class130_Sub7) class130_sub7).aByte5408 - anInt1041 - anInt1047);
							int i_56_ = (i_1_ + i * i_54_ >> 16) + anInt1040;
							int i_57_ = (i_1_ + i * (i_54_ + 1) >> 16) + anInt1040;
							int i_58_ = (anInt1055 - (i_2_ + i_0_ * (i_55_ + 1) >> 16));
							int i_59_ = anInt1055 - (i_2_ + i_0_ * i_55_ >> 16);
							method508(class260, i_56_, i_58_, i_57_ - i_56_, i_59_ - i_58_, (((Class130_Sub7) class130_sub7).aShortArray5411), (((Class130_Sub7) class130_sub7).aByteArray5413));
						}
					}
				}
			}
		}
	}

	static final Class246_Sub1_Sub5 method498(int i, int i_60_) {
		for (Class246_Sub1_Sub5 class246_sub1_sub5 = (Class246_Sub1_Sub5) aClass85_1021.first((byte) -23); class246_sub1_sub5 != null; class246_sub1_sub5 = (Class246_Sub1_Sub5) aClass85_1021.next((byte) -20)) {
			if (((Class246_Sub1_Sub5) class246_sub1_sub5).aBool5830 && class246_sub1_sub5.method2468(-92, i_60_, i))
				return class246_sub1_sub5;
		}
		return null;
	}

	private static final void method499(byte[] is, byte[] is_61_, short[] is_62_, int i, int i_63_) {
		int[] is_64_ = new int[anInt1058];
		int[] is_65_ = new int[anInt1058];
		int[] is_66_ = new int[anInt1058];
		int[] is_67_ = new int[anInt1058];
		int[] is_68_ = new int[anInt1058];
		for (int i_69_ = -5; i_69_ < anInt1054; i_69_++) {
			int i_70_ = i_69_ + 5;
			int i_71_ = i_69_ - 5;
			for (int i_72_ = 0; i_72_ < anInt1058; i_72_++) {
				if (i_70_ < anInt1054) {
					int i_73_ = is[i_70_ + i_72_ * anInt1054] & 0xff;
					if (i_73_ > 0) {
						Class207 class207 = aClass175_1026.method1151(-18411, i_73_ - 1);
						is_64_[i_72_] += ((Class207) class207).anInt2917;
						is_65_[i_72_] += ((Class207) class207).anInt2909;
						is_66_[i_72_] += ((Class207) class207).anInt2911;
						is_67_[i_72_] += ((Class207) class207).anInt2910;
						is_68_[i_72_]++;
					}
				}
				if (i_71_ >= 0) {
					int i_74_ = is[i_71_ + i_72_ * anInt1054] & 0xff;
					if (i_74_ > 0) {
						Class207 class207 = aClass175_1026.method1151(-18411, i_74_ - 1);
						is_64_[i_72_] -= ((Class207) class207).anInt2917;
						is_65_[i_72_] -= ((Class207) class207).anInt2909;
						is_66_[i_72_] -= ((Class207) class207).anInt2911;
						is_67_[i_72_] -= ((Class207) class207).anInt2910;
						is_68_[i_72_]--;
					}
				}
			}
			if (i_69_ >= 0) {
				int i_75_ = 0;
				int i_76_ = 0;
				int i_77_ = 0;
				int i_78_ = 0;
				int i_79_ = 0;
				for (int i_80_ = -5; i_80_ < anInt1058; i_80_++) {
					int i_81_ = i_80_ + 5;
					if (i_81_ < anInt1058) {
						i_75_ += is_64_[i_81_];
						i_76_ += is_65_[i_81_];
						i_77_ += is_66_[i_81_];
						i_78_ += is_67_[i_81_];
						i_79_ += is_68_[i_81_];
					}
					int i_82_ = i_80_ - 5;
					if (i_82_ >= 0) {
						i_75_ -= is_64_[i_82_];
						i_76_ -= is_65_[i_82_];
						i_77_ -= is_66_[i_82_];
						i_78_ -= is_67_[i_82_];
						i_79_ -= is_68_[i_82_];
					}
					if (i_80_ >= 0 && i_79_ > 0) {
						if ((is[i_69_ + i_80_ * anInt1054] & 0xff) == 0) {
							int i_83_ = i_69_ + i_80_ * anInt1054;
							is_61_[i_83_] = (byte) 0;
							is_62_[i_83_] = (short) 0;
						} else {
							int i_84_ = (i_78_ == 0 ? 0 : Class40_Sub4.method1877(i_76_ / i_79_, (i_75_ * 256 / i_78_), 2, i_77_ / i_79_));
							int i_85_ = (i_84_ & 0x7f) + i_63_;
							if (i_85_ < 0)
								i_85_ = 0;
							else if (i_85_ > 127)
								i_85_ = 127;
							int i_86_ = ((i_84_ + i & 0xfc00) + (i_84_ & 0x380) + i_85_);
							int i_87_ = i_69_ + i_80_ * anInt1054;
							int i_88_ = (Actor.f_eb[((Class_e.method594(127, Class221.method1431(i_86_, 96, -1669))) & 0xffff)]);
							is_61_[i_87_] = (byte) (i_88_ >> 16 & 0xff);
							is_62_[i_87_] = (short) (i_88_ & 0xffff);
						}
					}
				}
			}
		}
	}

	public static void method500() {
		aClass105_1027 = null;
		aClass175_1026 = null;
		aClass251_1028 = null;
		aClass165_1022 = null;
		aClass254_1024 = null;
		anInterface11_1025 = null;
		aClass246_Sub1_Sub5_1020 = null;
		aClass_fs1023 = null;
		aClass85_1021 = null;
		aByteArrayArrayArray1032 = null;
		aShortArray1035 = null;
		aByteArray1037 = null;
		aClass178_1031 = null;
		aClass166_1034 = null;
		anIntArray1043 = null;
		aByteArray1044 = null;
		aByteArray1051 = null;
		aShortArray1059 = null;
		aByteArray1045 = null;
		aByteArray1050 = null;
		aShortArray1042 = null;
		aByteArray1053 = null;
		aClass85_1046 = null;
		aClass68ArrayArrayArray1060 = null;
	}

	private static final void method501(Class260 class260, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, short[] is, byte[] is_95_, boolean bool) {
		if (bool || i_92_ != 0 || i_93_ > 0) {
			if (i_93_ == 0)
				class260.O(i, i_89_, i_90_, i_91_, i_92_, 0);
			else {
				int i_96_ = i_94_ & 0x3f;
				if (i_96_ == 0 || i_90_ <= 1 || i_91_ <= 1) {
					int i_97_ = anIntArray1043[i_93_];
					if (bool || i_97_ != 0)
						class260.O(i, i_89_, i_90_, i_91_, i_97_, 0);
				} else {
					int i_98_ = bool ? 0 : 1;
					Class251.method1613(i_94_ >> 6 & 0x3, anInt1030, class260, 6, i_92_, i_90_, i_91_, i_98_, i, i_89_, i_96_, anIntArray1043[i_93_], aByteArrayArrayArray1032);
				}
			}
		}
		if (is != null) {
			int i_99_;
			if (i_90_ == 1)
				i_99_ = i;
			else
				i_99_ = i + i_90_ - 1;
			int i_100_;
			if (i_91_ == 1)
				i_100_ = i_89_;
			else
				i_100_ = i_89_ + i_91_ - 1;
			for (int i_101_ = 0; i_101_ < is.length; i_101_++) {
				int i_102_ = is_95_[i_101_] & 0x3f;
				if (i_102_ == 0 || i_102_ == 2 || i_102_ == 3 || i_102_ == 9) {
					Class185 class185 = aClass251_1028.method1610(is[i_101_] & 0xffff, 0);
					if (((Class185) class185).anInt2572 == -1) {
						int i_103_ = -3355444;
						if (((Class185) class185).anInt2590 == 1)
							i_103_ = -3407872;
						int i_104_ = is_95_[i_101_] >> 6 & 0x3;
						if (i_102_ == 0) {
							if (i_104_ == 0)
								class260.TA(i, i_89_, i_91_, i_103_, 0);
							else if (i_104_ == 1)
								class260.b(i, i_89_, i_90_, i_103_, 0);
							else if (i_104_ == 2)
								class260.TA(i_99_, i_89_, i_91_, i_103_, 0);
							else
								class260.b(i, i_100_, i_90_, i_103_, 0);
						} else if (i_102_ == 2) {
							if (i_104_ == 0) {
								class260.TA(i, i_89_, i_91_, -1, 0);
								class260.b(i, i_89_, i_90_, i_103_, 0);
							} else if (i_104_ == 1) {
								class260.TA(i_99_, i_89_, i_91_, -1, 0);
								class260.b(i, i_89_, i_90_, i_103_, 0);
							} else if (i_104_ == 2) {
								class260.TA(i_99_, i_89_, i_91_, -1, 0);
								class260.b(i, i_100_, i_90_, i_103_, 0);
							} else {
								class260.TA(i, i_89_, i_91_, -1, 0);
								class260.b(i, i_100_, i_90_, i_103_, 0);
							}
						} else if (i_102_ == 3) {
							if (i_104_ == 0)
								class260.b(i, i_89_, 1, i_103_, 0);
							else if (i_104_ == 1)
								class260.b(i_99_, i_89_, 1, i_103_, 0);
							else if (i_104_ == 2)
								class260.b(i_99_, i_100_, 1, i_103_, 0);
							else
								class260.b(i, i_100_, 1, i_103_, 0);
						} else if (i_102_ == 9) {
							if (i_104_ == 0 || i_104_ == 2) {
								for (int i_105_ = 0; i_105_ < i_91_; i_105_++)
									class260.b(i + i_105_, i_100_ - i_105_, 1, i_103_, 0);
							} else {
								for (int i_106_ = 0; i_106_ < i_91_; i_106_++)
									class260.b(i + i_106_, i_89_ + i_106_, 1, i_103_, 0);
							}
						}
					}
				}
			}
		}
	}

	static final void method502(Class260 class260, int i, int i_107_) {
		BufferStream stream = new BufferStream(aClass_fs1023.method96((((Class246_Sub1_Sub5) aClass246_Sub1_Sub5_1020).aString5846), false, "area"));
		int i_108_ = stream.readUnsignedByte(255);
		int[] is = new int[i_108_];
		for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
			is[i_109_] = stream.readUnsignedByte(255);
		int i_110_ = stream.readUnsignedByte(255);
		int[] is_111_ = new int[i_110_];
		for (int i_112_ = 0; i_112_ < i_110_; i_112_++)
			is_111_[i_112_] = stream.readUnsignedByte(255);
		while (((BufferStream) stream).position < ((BufferStream) stream).buffer.length) {
			if (stream.readUnsignedByte(255) == 0) {
				int i_113_ = stream.readUnsignedByte(255);
				int i_114_ = stream.readUnsignedByte(255);
				for (int i_115_ = 0; i_115_ < 64; i_115_++) {
					for (int i_116_ = 0; i_116_ < 64; i_116_++) {
						int i_117_ = i_113_ * 64 + i_115_ - anInt1057;
						int i_118_ = i_114_ * 64 + i_116_ - anInt1041;
						method504(class260, stream, i_113_, i_114_, i_117_, i_118_, is, is_111_);
					}
				}
			} else {
				int i_119_ = stream.readUnsignedByte(255);
				int i_120_ = stream.readUnsignedByte(255);
				int i_121_ = stream.readUnsignedByte(255);
				int i_122_ = stream.readUnsignedByte(255);
				for (int i_123_ = 0; i_123_ < 8; i_123_++) {
					for (int i_124_ = 0; i_124_ < 8; i_124_++) {
						int i_125_ = i_119_ * 64 + i_121_ * 8 + i_123_ - anInt1057;
						int i_126_ = i_120_ * 64 + i_122_ * 8 + i_124_ - anInt1041;
						method504(class260, stream, i_119_, i_120_, i_125_, i_126_, is, is_111_);
					}
				}
			}
		}
		Object object = null;
		aByteArray1051 = new byte[anInt1054 * anInt1058];
		aShortArray1059 = new short[anInt1054 * anInt1058];
		for (int i_127_ = 0; i_127_ < 3; i_127_++) {
			byte[] is_128_ = new byte[anInt1054 * anInt1058];
			for (int i_129_ = 0; i_129_ < aClass68ArrayArrayArray1060[i_127_].length; i_129_++) {
				for (int i_130_ = 0; i_130_ < aClass68ArrayArrayArray1060[i_127_][0].length; i_130_++) {
					Class68 class68 = aClass68ArrayArrayArray1060[i_127_][i_129_][i_130_];
					if (class68 != null) {
						for (Class130_Sub7 class130_sub7 = (Class130_Sub7) class68.method445(62); class130_sub7 != null; class130_sub7 = ((Class130_Sub7) class68.method442((byte) -64)))
							is_128_[(i_129_ * 64 + (((Class130_Sub7) class130_sub7).aByte5409) + (i_130_ * 64 + (((Class130_Sub7) class130_sub7).aByte5408)) * anInt1054)] = (byte) (((Class130_Sub7) class130_sub7).anInt5414);
					}
				}
			}
			method499(is_128_, aByteArray1051, aShortArray1059, i, i_107_);
			for (int i_131_ = 0; i_131_ < aClass68ArrayArrayArray1060[i_127_].length; i_131_++) {
				for (int i_132_ = 0; i_132_ < aClass68ArrayArrayArray1060[i_127_][0].length; i_132_++) {
					Class68 class68 = aClass68ArrayArrayArray1060[i_127_][i_131_][i_132_];
					if (class68 != null) {
						for (Class130_Sub7 class130_sub7 = (Class130_Sub7) class68.method445(62); class130_sub7 != null; class130_sub7 = ((Class130_Sub7) class68.method442((byte) -64))) {
							int i_133_ = (i_131_ * 64 + ((Class130_Sub7) class130_sub7).aByte5409 + (i_132_ * 64 + (((Class130_Sub7) class130_sub7).aByte5408)) * anInt1054);
							((Class130_Sub7) class130_sub7).anInt5414 = ((aByteArray1051[i_133_] & 0xff) << 16 | aShortArray1059[i_133_] & 0xffff);
							if (((Class130_Sub7) class130_sub7).anInt5414 != 0)
								((Class130_Sub7) class130_sub7).anInt5414 |= ~0xffffff;
						}
					}
				}
			}
		}
		method499(aByteArray1044, aByteArray1051, aShortArray1059, i, i_107_);
		aByteArray1044 = null;
		method509();
	}

	private static final void method503(Class260 class260, Class246_Sub2 class246_sub2, int i, int i_134_, int i_135_, int i_136_) {
		((Class246_Sub2) class246_sub2).anInt3810 = (anInt1040 + (i_135_ + i * (((Class246_Sub2) class246_sub2).anInt3807 - anInt1048) >> 16));
		((Class246_Sub2) class246_sub2).anInt3805 = (anInt1055 - (i_136_ + i_134_ * (((Class246_Sub2) class246_sub2).anInt3801 - anInt1047) >> 16));
	}

	private static final void method504(Class260 class260, BufferStream stream, int i, int i_137_, int i_138_, int i_139_, int[] is, int[] is_140_) {
		int i_141_ = stream.readUnsignedByte(255);
		if ((i_141_ & 0x1) == 0) {
			boolean bool = (i_141_ & 0x2) == 0;
			int i_142_ = i_141_ >> 2 & 0x3f;
			if (i_142_ != 62) {
				if (i_142_ == 63)
					i_142_ = stream.readUnsignedByte(255);
				else if (bool)
					i_142_ = is[i_142_];
				else
					i_142_ = is_140_[i_142_];
				if (bool) {
					aByteArray1044[i_138_ + i_139_ * anInt1054] = (byte) i_142_;
					aByteArray1045[i_138_ + i_139_ * anInt1054] = (byte) 0;
				} else {
					aByteArray1045[i_138_ + i_139_ * anInt1054] = (byte) i_142_;
					aByteArray1050[i_138_ + i_139_ * anInt1054] = (byte) 0;
					aByteArray1044[i_138_ + i_139_ * anInt1054] = stream.readByte(false);
				}
			}
		} else {
			int i_143_ = (i_141_ >> 1 & 0x3) + 1;
			boolean bool = (i_141_ & 0x8) != 0;
			boolean bool_144_ = (i_141_ & 0x10) != 0;
			for (int i_145_ = 0; i_145_ < i_143_; i_145_++) {
				int i_146_ = stream.readUnsignedByte(255);
				int i_147_ = 0;
				int i_148_ = 0;
				if (bool) {
					i_147_ = stream.readUnsignedByte(255);
					i_148_ = stream.readUnsignedByte(255);
				}
				int i_149_ = 0;
				if (bool_144_)
					i_149_ = stream.readUnsignedByte(255);
				if (i_145_ == 0) {
					aByteArray1044[i_138_ + i_139_ * anInt1054] = (byte) i_146_;
					aByteArray1045[i_138_ + i_139_ * anInt1054] = (byte) i_147_;
					aByteArray1050[i_138_ + i_139_ * anInt1054] = (byte) i_148_;
					if (i_149_ == 1) {
						aShortArray1042[i_138_ + i_139_ * anInt1054] = (short) (stream.readUnsignedShort((byte) 107) + 1);
						aByteArray1053[i_138_ + i_139_ * anInt1054] = stream.readByte(false);
					} else if (i_149_ > 1) {
						aShortArray1042[i_138_ + i_139_ * anInt1054] = (short) -1;
						short[] is_150_ = new short[i_149_];
						byte[] is_151_ = new byte[i_149_];
						for (int i_152_ = 0; i_152_ < i_149_; i_152_++) {
							is_150_[i_152_] = (short) stream.readUnsignedShort((byte) -106);
							is_151_[i_152_] = stream.readByte(false);
						}
						aClass85_1046.method547((long) (i_138_ << 16 | i_139_), -2301, new Class246_Sub21(is_150_, is_151_));
					}
				} else {
					short[] is_153_ = null;
					byte[] is_154_ = null;
					if (i_149_ > 0) {
						is_153_ = new short[i_149_];
						is_154_ = new byte[i_149_];
						for (int i_155_ = 0; i_155_ < i_149_; i_155_++) {
							is_153_[i_155_] = (short) stream.readUnsignedShort((byte) 107);
							is_154_[i_155_] = stream.readByte(false);
						}
					}
					if ((aClass68ArrayArrayArray1060[i_145_ - 1][i - (anInt1057 >> 6)][i_137_ - (anInt1041 >> 6)]) == null)
						aClass68ArrayArrayArray1060[i_145_ - 1][i - (anInt1057 >> 6)][i_137_ - (anInt1041 >> 6)] = new Class68();
					Class130_Sub7 class130_sub7 = new Class130_Sub7(i_138_ & 0x3f, i_139_ & 0x3f, i_146_, i_147_, i_148_, is_153_, is_154_);
					aClass68ArrayArrayArray1060[i_145_ - 1][i - (anInt1057 >> 6)][i_137_ - (anInt1041 >> 6)].method438(51, class130_sub7);
				}
			}
		}
	}

	static final Class166 method505(Class260 class260) {
		int i = anInt1052 - anInt1048;
		int i_156_ = anInt1039 - anInt1047;
		int i_157_ = (anInt1056 - anInt1040 << 16) / i;
		int i_158_ = (anInt1055 - anInt1049 << 16) / i_156_;
		return method511(class260, i_157_, i_158_, 0, 0);
	}

	static final void method506() {
		aByteArray1044 = new byte[anInt1054 * anInt1058];
		aByteArray1045 = new byte[anInt1054 * anInt1058];
		aByteArray1050 = new byte[anInt1054 * anInt1058];
		aShortArray1042 = new short[anInt1054 * anInt1058];
		aByteArray1053 = new byte[anInt1054 * anInt1058];
		aClass85_1046 = new Class85(1024);
		aClass68ArrayArrayArray1060 = new Class68[3][anInt1054 >> 6][anInt1058 >> 6];
		anIntArray1043 = new int[((Class105) aClass105_1027).anInt1461 + 1];
	}

	static final void method507() {
		int[] is = new int[3];
		for (int i = 0; i < ((Class178) aClass178_1031).anInt2504; i++) {
			boolean bool = (aClass246_Sub1_Sub5_1020.method2471(false, is, ((Class178) aClass178_1031).anIntArray2505[i] >> 28 & 0x3, ((Class178) aClass178_1031).anIntArray2505[i] & 0x3fff, (((Class178) aClass178_1031).anIntArray2505[i] >> 14 & 0x3fff)));
			if (bool) {
				Class246_Sub2 class246_sub2 = new Class246_Sub2(((Class178) aClass178_1031).anIntArray2499[i]);
				((Class246_Sub2) class246_sub2).anInt3807 = is[1] - anInt1057;
				((Class246_Sub2) class246_sub2).anInt3801 = is[2] - anInt1041;
				aClass166_1034.method1101(false, class246_sub2);
			}
		}
	}

	private static final void method508(Class260 class260, int i, int i_159_, int i_160_, int i_161_, short[] is, byte[] is_162_) {
		if (is != null) {
			for (int i_163_ = 0; i_163_ < is.length; i_163_++) {
				Class185 class185 = aClass251_1028.method1610(is[i_163_] & 0xffff, 0);
				int i_164_ = ((Class185) class185).anInt2572;
				if (i_164_ != -1) {
					Class32 class32 = aClass254_1024.method1638(1409, i_164_);
					Class_l class_l = class32.method240((((Class185) class185).aBool2604 ? ((Class185) class185).f_fb : false), class260, (((Class185) class185).aBool2619 ? is_162_[i_163_] >> 6 & 0x3 : 0), 16306);
					if (class_l != null) {
						int i_165_ = i_160_ * class_l.j() >> 2;
						int i_166_ = i_161_ * class_l.T() >> 2;
						if (((Class32) class32).aBool440) {
							int i_167_ = ((Class185) class185).anInt2596;
							int i_168_ = ((Class185) class185).anInt2570;
							if ((is_162_[i_163_] >> 6 & 0x1) == 1) {
								int i_169_ = i_167_;
								i_167_ = i_168_;
								i_168_ = i_169_;
							}
							i_165_ = i_167_ * i_160_;
							i_166_ = i_168_ * i_161_;
						}
						if (i_165_ != 0 && i_166_ != 0) {
							if (((Class32) class32).anInt437 != 0)
								class_l.s(i, i_159_ - i_166_ + i_161_, i_165_, i_166_, 0, (~0xffffff | ((Class32) class32).anInt437), 1);
							else
								class_l.method732(i, i_159_ - i_166_ + i_161_, i_165_, i_166_);
						}
					}
				}
			}
		}
	}

	private static final void method509() {
		for (int i = 0; i < anInt1054; i++) {
			for (int i_170_ = 0; i_170_ < anInt1058; i_170_++) {
				int i_171_ = aShortArray1042[i + i_170_ * anInt1054] & 0xffff;
				if (i_171_ != 0) {
					if (i_171_ == 65535) {
						Class246_Sub21 class246_sub21 = ((Class246_Sub21) aClass85_1046.method544((long) (i << 16 | i_170_), 125));
						if (class246_sub21 != null) {
							for (int i_172_ = 0; i_172_ < (((Class246_Sub21) class246_sub21).aShortArray4747).length; i_172_++) {
								Class185 class185 = (aClass251_1028.method1610((((Class246_Sub21) class246_sub21).aShortArray4747[i_172_]) & 0xffff, 0));
								int i_173_ = ((Class185) class185).anInt2579;
								if (((Class185) class185).f_bb != null) {
									class185 = (class185.method1205(anInterface11_1025, (byte) -84));
									if (class185 != null)
										i_173_ = ((Class185) class185).anInt2579;
								}
								if (i_173_ != -1) {
									Class246_Sub2 class246_sub2 = new Class246_Sub2(i_173_);
									((Class246_Sub2) class246_sub2).anInt3807 = i;
									((Class246_Sub2) class246_sub2).anInt3801 = i_170_;
									aClass166_1034.method1101(false, class246_sub2);
								}
							}
						}
					} else {
						Class185 class185 = aClass251_1028.method1610(i_171_ - 1, 0);
						int i_174_ = ((Class185) class185).anInt2579;
						if (((Class185) class185).f_bb != null) {
							class185 = class185.method1205(anInterface11_1025, (byte) 97);
							if (class185 != null)
								i_174_ = ((Class185) class185).anInt2579;
						}
						if (i_174_ != -1) {
							Class246_Sub2 class246_sub2 = new Class246_Sub2(i_174_);
							((Class246_Sub2) class246_sub2).anInt3807 = i;
							((Class246_Sub2) class246_sub2).anInt3801 = i_170_;
							aClass166_1034.method1101(false, class246_sub2);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_175_ = 0; i_175_ < aClass68ArrayArrayArray1060[0].length; i_175_++) {
				for (int i_176_ = 0; i_176_ < aClass68ArrayArrayArray1060[0][0].length; i_176_++) {
					Class68 class68 = aClass68ArrayArrayArray1060[i][i_175_][i_176_];
					if (class68 != null) {
						for (Class130_Sub7 class130_sub7 = (Class130_Sub7) class68.method445(62); class130_sub7 != null; class130_sub7 = ((Class130_Sub7) class68.method442((byte) -121))) {
							if (((Class130_Sub7) class130_sub7).aShortArray5411 != null) {
								for (int i_177_ = 0; i_177_ < (((Class130_Sub7) class130_sub7).aShortArray5411).length; i_177_++) {
									Class185 class185 = (aClass251_1028.method1610(((((Class130_Sub7) class130_sub7).aShortArray5411[i_177_]) & 0xffff), 0));
									int i_178_ = ((Class185) class185).anInt2579;
									if (((Class185) class185).f_bb != null) {
										class185 = (class185.method1205(anInterface11_1025, (byte) -10));
										if (class185 != null)
											i_178_ = (((Class185) class185).anInt2579);
									}
									if (i_178_ != -1) {
										Class246_Sub2 class246_sub2 = new Class246_Sub2(i_178_);
										((Class246_Sub2) class246_sub2).anInt3807 = ((i_175_ + (anInt1057 >> 6)) * 64 + ((Class130_Sub7) class130_sub7).aByte5409 - anInt1057);
										((Class246_Sub2) class246_sub2).anInt3801 = ((i_176_ + (anInt1041 >> 6)) * 64 + ((Class130_Sub7) class130_sub7).aByte5408 - anInt1041);
										aClass166_1034.method1101(false, class246_sub2);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final Class217 method510(int i, int i_179_) {
		Class217 class217 = new Class217();
		for (Class246_Sub1_Sub5 class246_sub1_sub5 = (Class246_Sub1_Sub5) aClass85_1021.first((byte) -23); class246_sub1_sub5 != null; class246_sub1_sub5 = (Class246_Sub1_Sub5) aClass85_1021.next((byte) -20)) {
			if (((Class246_Sub1_Sub5) class246_sub1_sub5).aBool5830 && class246_sub1_sub5.method2468(-85, i_179_, i))
				class217.method1407(-126, class246_sub1_sub5);
		}
		return class217;
	}

	private static final Class166 method511(Class260 class260, int i, int i_180_, int i_181_, int i_182_) {
		for (Class246_Sub2 class246_sub2 = (Class246_Sub2) aClass166_1034.method1104(97); class246_sub2 != null; class246_sub2 = (Class246_Sub2) aClass166_1034.method1108((byte) -112))
			method503(class260, class246_sub2, i, i_180_, i_181_, i_182_);
		return aClass166_1034;
	}

	static final void method512(Class260 class260) {
		int i = anInt1052 - anInt1048;
		int i_183_ = anInt1039 - anInt1047;
		int i_184_ = (anInt1056 - anInt1040 << 16) / i;
		int i_185_ = (anInt1055 - anInt1049 << 16) / i_183_;
		method497(class260, i_184_, i_185_, 0, 0);
	}

	private static final int method513(Interface6 interface6, int i, int i_186_, int i_187_) {
		PacketsDecoder class_is = aClass105_1027.method703(4, i);
		if (class_is == null)
			return 0;
		int i_188_ = ((PacketsDecoder) class_is).anInt279;
		if (i_188_ >= 0 && ((Class238) interface6.method17(-31305, i_188_)).aBool3339)
			i_188_ = -1;
		int i_189_;
		if (((PacketsDecoder) class_is).anInt271 >= 0) {
			int i_190_ = ((PacketsDecoder) class_is).anInt271;
			int i_191_ = (i_190_ & 0x7f) + i_187_;
			if (i_191_ < 0)
				i_191_ = 0;
			else if (i_191_ > 127)
				i_191_ = 127;
			int i_192_ = (i_190_ + i_186_ & 0xfc00) + (i_190_ & 0x380) + i_191_;
			i_189_ = ~0xffffff | (Actor.f_eb[Class_e.method594(127, (Class246_Sub1_Sub2.method2426(96, (byte) 66, i_192_))) & 0xffff]);
		} else if (i_188_ >= 0)
			i_189_ = (~0xffffff | (Actor.f_eb[Class_e.method594(125, (Class246_Sub1_Sub2.method2426(96, (byte) 66, (((Class238) interface6.method17(-31305, i_188_)).aShort3354)))) & 0xffff]));
		else if (((PacketsDecoder) class_is).anInt284 == -1)
			i_189_ = 0;
		else {
			int i_193_ = ((PacketsDecoder) class_is).anInt284;
			int i_194_ = (i_193_ & 0x7f) + i_187_;
			if (i_194_ < 0)
				i_194_ = 0;
			else if (i_194_ > 127)
				i_194_ = 127;
			int i_195_ = (i_193_ + i_186_ & 0xfc00) + (i_193_ & 0x380) + i_194_;
			i_189_ = ~0xffffff | (Actor.f_eb[Class_e.method594(-52, (Class246_Sub1_Sub2.method2426(96, (byte) 66, i_195_))) & 0xffff]);
		}
		return i_189_;
	}

	static final void method514() {
		aByteArray1044 = null;
		aByteArray1051 = null;
		aShortArray1059 = null;
		aByteArray1045 = null;
		aByteArray1050 = null;
		aShortArray1042 = null;
		aByteArray1053 = null;
		aClass85_1046 = null;
		aClass68ArrayArrayArray1060 = null;
		anIntArray1043 = null;
	}

	static final Class246_Sub1_Sub5 method515(int i) {
		return (Class246_Sub1_Sub5) aClass85_1021.method544((long) i, 124);
	}

	static final void method516(Interface6 interface6, int i, int i_196_) {
		for (int i_197_ = 0; i_197_ < ((Class105) aClass105_1027).anInt1461; i_197_++)
			anIntArray1043[i_197_ + 1] = method513(interface6, i_197_, i, i_196_);
	}

	static final void method517(int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_) {
		anInt1048 = i - anInt1057;
		anInt1039 = i_198_ - anInt1041;
		anInt1052 = i_199_ - anInt1057;
		anInt1047 = i_200_ - anInt1041;
		anInt1040 = i_201_;
		anInt1049 = i_202_;
		anInt1056 = i_203_;
		anInt1055 = i_204_;
	}

	static final void method518(Class_fs class_fs, Class105 class105, Class175 class175, Class251 class251, Class165 class165, Class254 class254, Interface11 interface11) {
		aClass_fs1023 = class_fs;
		aClass105_1027 = class105;
		aClass175_1026 = class175;
		aClass251_1028 = class251;
		aClass165_1022 = class165;
		aClass254_1024 = class254;
		anInterface11_1025 = interface11;
		aClass85_1021.method543(0);
		int i = aClass_fs1023.method86("details", (byte) 40);
		int[] is = aClass_fs1023.method111(16947, i);
		for (int i_205_ = 0; i_205_ < is.length; i_205_++) {
			Class246_Sub1_Sub5 class246_sub1_sub5 = Class50.method331(i, is[i_205_], aClass_fs1023, 0);
			aClass85_1021.method547((long) ((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5836, -2301, class246_sub1_sub5);
		}
		Class190.method1244(true, false, false);
	}

	static {
		aByteArray1037 = new byte[1];
		aClass166_1034 = new Class166();
	}
}
