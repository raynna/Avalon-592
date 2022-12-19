
/* Class246_Sub28_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class246_Sub28_Sub4 extends Class246_Sub28 {
	static int anInt5966;
	static int anInt5967;
	private int[] anIntArray5968 = new int[257];
	static int anInt5969;
	static OutgoingPacket aClass201_5970 = new OutgoingPacket(0, -1);
	static int anInt5971;
	private int[][] anIntArrayArray5972;
	static int anInt5973;
	static BigInteger RSA_EXPONENT = new BigInteger("65537");
	static int anInt5975;
	static int anInt5976 = 0;
	static int anInt5977 = 0;
	static int[] anIntArray5978;

	final void method2134(boolean bool) {
		try {
			if (bool != false)
				aClass201_5970 = null;
			if (anIntArrayArray5972 == null)
				method2538(1, (byte) -68);
			anInt5971++;
			method2536(-10610);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ed.F(" + bool + ')');
		}
	}

	private final void method2536(int i) {
		do {
			try {
				if (i == -10610) {
					anInt5966++;
					int i_0_ = anIntArrayArray5972.length;
					if ((i_0_ ^ 0xffffffff) >= -1)
						break;
					for (int i_1_ = 0; i_1_ < 257; i_1_++) {
						int i_2_ = 0;
						int i_3_ = i_1_ << 4;
						for (int i_4_ = 0; (i_0_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
							if ((anIntArrayArray5972[i_4_][0] ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
								break;
							i_2_++;
						}
						int i_5_;
						int i_6_;
						int i_7_;
						if (i_0_ <= i_2_) {
							int[] is = anIntArrayArray5972[-1 + i_0_];
							i_5_ = is[2];
							i_6_ = is[3];
							i_7_ = is[1];
						} else {
							int[] is = anIntArrayArray5972[i_2_];
							if (i_2_ <= 0) {
								i_5_ = is[2];
								i_6_ = is[3];
								i_7_ = is[1];
							} else {
								int[] is_8_ = anIntArrayArray5972[i_2_ - 1];
								int i_9_ = ((-is_8_[0] + i_3_ << 12) / (-is_8_[0] + is[0]));
								int i_10_ = 4096 - i_9_;
								i_7_ = i_9_ * is[1] + i_10_ * is_8_[1] >> 12;
								i_5_ = i_9_ * is[2] + is_8_[2] * i_10_ >> 12;
								i_6_ = i_10_ * is_8_[3] + i_9_ * is[3] >> 12;
							}
						}
						i_6_ >>= 4;
						i_7_ >>= 4;
						i_5_ >>= 4;
						if ((i_6_ ^ 0xffffffff) > -1)
							i_6_ = 0;
						else if (i_6_ > 255)
							i_6_ = 255;
						if (i_7_ < 0)
							i_7_ = 0;
						else if ((i_7_ ^ 0xffffffff) < -256)
							i_7_ = 255;
						if ((i_5_ ^ 0xffffffff) <= -1) {
							if (i_5_ > 255)
								i_5_ = 255;
						} else
							i_5_ = 0;
						anIntArray5968[i_1_] = (Class236.method1523(i_6_, Class236.method1523(i_5_ << 8, i_7_ << 16)));
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ed.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2143(int i, int i_11_, BufferStream stream) {
		try {
			if (i_11_ == 0) {
				int i_12_ = stream.readUnsignedByte(i ^ 0xfb);
				if ((i_12_ ^ 0xffffffff) == -1) {
					anIntArrayArray5972 = new int[stream.readUnsignedByte(255)][4];
					for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (anIntArrayArray5972.length ^ 0xffffffff)); i_13_++) {
						anIntArrayArray5972[i_13_][0] = stream.readUnsignedShort((byte) -89);
						anIntArrayArray5972[i_13_][1] = stream.readUnsignedByte(255) << 4;
						anIntArrayArray5972[i_13_][2] = stream.readUnsignedByte(255) << 4;
						anIntArrayArray5972[i_13_][3] = stream.readUnsignedByte(255) << 4;
					}
				} else
					method2538(i_12_, (byte) -96);
			}
			if (i != 4)
				anIntArray5968 = null;
			anInt5969++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ed.G(" + i + ',' + i_11_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2537() {
		if (Class115.aClass147ArrayArrayArray1605 != null) {
			for (int i = 0; i < Class115.aClass147ArrayArrayArray1605.length; i++) {
				for (int i_14_ = 0; i_14_ < Class240.anInt3377; i_14_++) {
					for (int i_15_ = 0; i_15_ < Class_t_Sub1.f_sc; i_15_++) {
						if ((Class115.aClass147ArrayArrayArray1605[i][i_14_][i_15_]) != null)
							Class115.aClass147ArrayArrayArray1605[i][i_14_][i_15_].method997((byte) 0);
						Class115.aClass147ArrayArrayArray1605[i][i_14_][i_15_] = null;
					}
				}
			}
		}
		Class115.aClass147ArrayArrayArray1605 = null;
		Class246_Sub28_Sub3.aClass210Array5899 = null;
		if (Class1.aClass147ArrayArrayArray4 != null) {
			for (int i = 0; i < Class1.aClass147ArrayArrayArray4.length; i++) {
				for (int i_16_ = 0; i_16_ < Class240.anInt3377; i_16_++) {
					for (int i_17_ = 0; i_17_ < Class_t_Sub1.f_sc; i_17_++) {
						if (Class1.aClass147ArrayArrayArray4[i][i_16_][i_17_] != null)
							Class1.aClass147ArrayArrayArray4[i][i_16_][i_17_].method997((byte) 0);
						Class1.aClass147ArrayArrayArray4[i][i_16_][i_17_] = null;
					}
				}
			}
		}
		Class1.aClass147ArrayArrayArray4 = null;
		Class154.aClass210Array2215 = null;
		Class106.aClass147ArrayArrayArray1494 = null;
		Class59_Sub3_Sub4.aClass210Array6993 = null;
		Class59_Sub2_Sub2.anInt6015 = 0;
		if (Class246_Sub28_Sub5.aClass121Array5996 != null) {
			for (int i = 0; i < Class59_Sub2_Sub2.anInt6015; i++)
				Class246_Sub28_Sub5.aClass121Array5996[i] = null;
		}
		if (Class246_Sub28_Sub36.aClass59_Sub3Array7018 != null) {
			for (int i = 0; i < Class_a.anInt1181; i++)
				Class246_Sub28_Sub36.aClass59_Sub3Array7018[i] = null;
			Class_a.anInt1181 = 0;
		}
		if (Class57.aClass174Array811 != null) {
			for (int i = 0; i < Class_c.anInt1195; i++)
				Class57.aClass174Array811[i] = null;
			for (int i = 0; i < Class154_Sub1.anInt4803; i++) {
				for (int i_18_ = 0; i_18_ < Class240.anInt3377; i_18_++) {
					for (int i_19_ = 0; i_19_ < Class_t_Sub1.f_sc; i_19_++)
						Class255.aLongArrayArrayArray3648[i][i_18_][i_19_] = 0L;
				}
			}
			Class_c.anInt1195 = 0;
		}
		Class88.anIntArrayArrayArray1150 = null;
		Class173.method1137(false);
		Class246_Sub2.aClass68_3814.method443(79);
		Class187.aByteArrayArray2649 = null;
		Class128_Sub2.anIntArrayArray5565 = null;
		Class189.aByteArrayArray2669 = null;
		Class245.aClass106_3462 = null;
		Class140.aClass_c2007 = null;
		Class259_Sub3.aClass260_5357 = null;
	}

	public Class246_Sub28_Sub4() {
		super(1, false);
	}

	private final void method2538(int i, byte i_20_) {
		try {
			if (i_20_ >= -64)
				anIntArray5968 = null;
			anInt5973++;
			if ((i ^ 0xffffffff) != -1) {
				int i_21_ = i;
				while_73_: do {
					while_72_: do {
						while_71_: do {
							while_70_: do {
								while_69_: do {
									do {
										if (i_21_ != 1) {
											if ((i_21_ ^ 0xffffffff) == -3)
												break;
											if ((i_21_ ^ 0xffffffff) == -4)
												break while_69_;
											if (i_21_ == 4)
												break while_70_;
											if (i_21_ == 5)
												break while_71_;
											if (i_21_ != 6)
												break while_73_;
											if (!client.f_ob)
												break while_72_;
										}
										anIntArrayArray5972 = new int[2][4];
										anIntArrayArray5972[0][3] = 0;
										anIntArrayArray5972[0][1] = 0;
										anIntArrayArray5972[0][0] = 0;
										anIntArrayArray5972[0][2] = 0;
										anIntArrayArray5972[1][1] = 4096;
										anIntArrayArray5972[1][3] = 4096;
										anIntArrayArray5972[1][2] = 4096;
										anIntArrayArray5972[1][0] = 4096;
										return;
									} while (false);
									anIntArrayArray5972 = new int[8][4];
									anIntArrayArray5972[0][3] = 2361;
									anIntArrayArray5972[0][0] = 0;
									anIntArrayArray5972[0][1] = 2650;
									anIntArrayArray5972[0][2] = 2602;
									anIntArrayArray5972[1][3] = 1558;
									anIntArrayArray5972[1][1] = 2313;
									anIntArrayArray5972[1][2] = 1799;
									anIntArrayArray5972[1][0] = 2867;
									anIntArrayArray5972[2][3] = 1413;
									anIntArrayArray5972[2][1] = 2618;
									anIntArrayArray5972[2][0] = 3072;
									anIntArrayArray5972[2][2] = 1734;
									anIntArrayArray5972[3][0] = 3276;
									anIntArrayArray5972[3][3] = 947;
									anIntArrayArray5972[3][1] = 2296;
									anIntArrayArray5972[3][2] = 1220;
									anIntArrayArray5972[4][3] = 722;
									anIntArrayArray5972[4][2] = 963;
									anIntArrayArray5972[4][0] = 3481;
									anIntArrayArray5972[4][1] = 2072;
									anIntArrayArray5972[5][3] = 1766;
									anIntArrayArray5972[5][0] = 3686;
									anIntArrayArray5972[5][1] = 2730;
									anIntArrayArray5972[5][2] = 2152;
									anIntArrayArray5972[6][1] = 2232;
									anIntArrayArray5972[6][0] = 3891;
									anIntArrayArray5972[6][3] = 915;
									anIntArrayArray5972[6][2] = 1060;
									anIntArrayArray5972[7][0] = 4096;
									anIntArrayArray5972[7][1] = 1686;
									anIntArrayArray5972[7][2] = 1413;
									anIntArrayArray5972[7][3] = 1140;
									return;
								} while (false);
								anIntArrayArray5972 = new int[7][4];
								anIntArrayArray5972[0][0] = 0;
								anIntArrayArray5972[0][1] = 0;
								anIntArrayArray5972[0][3] = 4096;
								anIntArrayArray5972[0][2] = 0;
								anIntArrayArray5972[1][1] = 0;
								anIntArrayArray5972[1][2] = 4096;
								anIntArrayArray5972[1][0] = 663;
								anIntArrayArray5972[1][3] = 4096;
								anIntArrayArray5972[2][2] = 4096;
								anIntArrayArray5972[2][1] = 0;
								anIntArrayArray5972[2][3] = 0;
								anIntArrayArray5972[2][0] = 1363;
								anIntArrayArray5972[3][2] = 4096;
								anIntArrayArray5972[3][0] = 2048;
								anIntArrayArray5972[3][3] = 0;
								anIntArrayArray5972[3][1] = 4096;
								anIntArrayArray5972[4][2] = 0;
								anIntArrayArray5972[4][1] = 4096;
								anIntArrayArray5972[4][0] = 2727;
								anIntArrayArray5972[4][3] = 0;
								anIntArrayArray5972[5][3] = 4096;
								anIntArrayArray5972[5][1] = 4096;
								anIntArrayArray5972[5][2] = 0;
								anIntArrayArray5972[5][0] = 3411;
								anIntArrayArray5972[6][0] = 4096;
								anIntArrayArray5972[6][3] = 4096;
								anIntArrayArray5972[6][1] = 0;
								anIntArrayArray5972[6][2] = 0;
								return;
							} while (false);
							anIntArrayArray5972 = new int[6][4];
							anIntArrayArray5972[0][0] = 0;
							anIntArrayArray5972[0][1] = 0;
							anIntArrayArray5972[0][3] = 0;
							anIntArrayArray5972[0][2] = 0;
							anIntArrayArray5972[1][0] = 1843;
							anIntArrayArray5972[1][2] = 0;
							anIntArrayArray5972[1][1] = 0;
							anIntArrayArray5972[1][3] = 1493;
							anIntArrayArray5972[2][1] = 0;
							anIntArrayArray5972[2][2] = 0;
							anIntArrayArray5972[2][0] = 2457;
							anIntArrayArray5972[2][3] = 2939;
							anIntArrayArray5972[3][1] = 0;
							anIntArrayArray5972[3][3] = 3565;
							anIntArrayArray5972[3][0] = 2781;
							anIntArrayArray5972[3][2] = 1124;
							anIntArrayArray5972[4][0] = 3481;
							anIntArrayArray5972[4][3] = 4031;
							anIntArrayArray5972[4][2] = 3084;
							anIntArrayArray5972[4][1] = 546;
							anIntArrayArray5972[5][0] = 4096;
							anIntArrayArray5972[5][3] = 4096;
							anIntArrayArray5972[5][1] = 4096;
							anIntArrayArray5972[5][2] = 4096;
							return;
						} while (false);
						anIntArrayArray5972 = new int[16][4];
						anIntArrayArray5972[0][0] = 0;
						anIntArrayArray5972[0][2] = 192;
						anIntArrayArray5972[0][1] = 80;
						anIntArrayArray5972[0][3] = 321;
						anIntArrayArray5972[1][2] = 449;
						anIntArrayArray5972[1][3] = 562;
						anIntArrayArray5972[1][1] = 321;
						anIntArrayArray5972[1][0] = 155;
						anIntArrayArray5972[2][3] = 803;
						anIntArrayArray5972[2][1] = 578;
						anIntArrayArray5972[2][2] = 690;
						anIntArrayArray5972[2][0] = 389;
						anIntArrayArray5972[3][2] = 995;
						anIntArrayArray5972[3][1] = 947;
						anIntArrayArray5972[3][3] = 1140;
						anIntArrayArray5972[3][0] = 671;
						anIntArrayArray5972[4][2] = 1397;
						anIntArrayArray5972[4][1] = 1285;
						anIntArrayArray5972[4][3] = 1509;
						anIntArrayArray5972[4][0] = 897;
						anIntArrayArray5972[5][0] = 1175;
						anIntArrayArray5972[5][3] = 1413;
						anIntArrayArray5972[5][1] = 1525;
						anIntArrayArray5972[5][2] = 1429;
						anIntArrayArray5972[6][1] = 1734;
						anIntArrayArray5972[6][0] = 1368;
						anIntArrayArray5972[6][2] = 1461;
						anIntArrayArray5972[6][3] = 1333;
						anIntArrayArray5972[7][2] = 1525;
						anIntArrayArray5972[7][3] = 1702;
						anIntArrayArray5972[7][1] = 1413;
						anIntArrayArray5972[7][0] = 1507;
						anIntArrayArray5972[8][3] = 2056;
						anIntArrayArray5972[8][1] = 1108;
						anIntArrayArray5972[8][2] = 1590;
						anIntArrayArray5972[8][0] = 1736;
						anIntArrayArray5972[9][3] = 2666;
						anIntArrayArray5972[9][2] = 2056;
						anIntArrayArray5972[9][1] = 1766;
						anIntArrayArray5972[9][0] = 2088;
						anIntArrayArray5972[10][2] = 2586;
						anIntArrayArray5972[10][1] = 2409;
						anIntArrayArray5972[10][0] = 2355;
						anIntArrayArray5972[10][3] = 3276;
						anIntArrayArray5972[11][2] = 3148;
						anIntArrayArray5972[11][0] = 2691;
						anIntArrayArray5972[11][1] = 3116;
						anIntArrayArray5972[11][3] = 3228;
						anIntArrayArray5972[12][0] = 3031;
						anIntArrayArray5972[12][3] = 3196;
						anIntArrayArray5972[12][1] = 3806;
						anIntArrayArray5972[12][2] = 3710;
						anIntArrayArray5972[13][2] = 3421;
						anIntArrayArray5972[13][3] = 3019;
						anIntArrayArray5972[13][0] = 3522;
						anIntArrayArray5972[13][1] = 3437;
						anIntArrayArray5972[14][2] = 3148;
						anIntArrayArray5972[14][0] = 3727;
						anIntArrayArray5972[14][3] = 3228;
						anIntArrayArray5972[14][1] = 3116;
						anIntArrayArray5972[15][2] = 2505;
						anIntArrayArray5972[15][0] = 4096;
						anIntArrayArray5972[15][3] = 2746;
						anIntArrayArray5972[15][1] = 2377;
						return;
					} while (false);
					anIntArrayArray5972 = new int[4][4];
					anIntArrayArray5972[0][3] = 0;
					anIntArrayArray5972[0][1] = 0;
					anIntArrayArray5972[0][2] = 4096;
					anIntArrayArray5972[0][0] = 2048;
					anIntArrayArray5972[1][0] = 2867;
					anIntArrayArray5972[1][1] = 4096;
					anIntArrayArray5972[1][2] = 4096;
					anIntArrayArray5972[1][3] = 0;
					anIntArrayArray5972[2][0] = 3276;
					anIntArrayArray5972[2][1] = 4096;
					anIntArrayArray5972[2][2] = 4096;
					anIntArrayArray5972[2][3] = 0;
					anIntArrayArray5972[3][2] = 0;
					anIntArrayArray5972[3][3] = 0;
					anIntArrayArray5972[3][0] = 4096;
					anIntArrayArray5972[3][1] = 4096;
					return;
				} while (false);
				throw new RuntimeException("Invalid gradient preset");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ed.B(" + i + ',' + i_20_ + ')');
		}
	}

	final int[][] method2139(byte i, int i_22_) {
		try {
			anInt5967++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -118, i_22_);
			if (i <= 33)
				method2538(-46, (byte) 89);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[] is_23_ = this.method2133(i_22_, 0, 0);
				int[] is_24_ = is[0];
				int[] is_25_ = is[1];
				int[] is_26_ = is[2];
				for (int i_27_ = 0; ((i_27_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_27_++) {
					int i_28_ = is_23_[i_27_] >> 4;
					if (i_28_ < 0)
						i_28_ = 0;
					if ((i_28_ ^ 0xffffffff) < -257)
						i_28_ = 256;
					i_28_ = anIntArray5968[i_28_];
					is_24_[i_27_] = PacketsDecoder.method184(4080, i_28_ >> 12);
					is_25_[i_27_] = PacketsDecoder.method184(i_28_, 65280) >> 4;
					is_26_[i_27_] = PacketsDecoder.method184(4080, i_28_ << 4);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ed.J(" + i + ',' + i_22_ + ')');
		}
	}

	public static void method2539(int i) {
		do {
			try {
				aClass201_5970 = null;
				anIntArray5978 = null;
				RSA_EXPONENT = null;
				if (i == 10)
					break;
				method2539(94);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ed.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		anInt5975 = -1;
	}
}
