
/* Class246_Sub28_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class246_Sub28_Sub32 extends Class246_Sub28 {
	private int anInt6922;
	private short[] aShortArray6923;
	private int anInt6924 = 5;
	static int anInt6925;
	private int anInt6926;
	private byte[] aByteArray6927;
	static Class_l aClass_l6928;
	private int anInt6929;
	private int anInt6930;
	private int anInt6931;
	static int anInt6932 = 0;
	static int anInt6933;
	static int anInt6934;
	static int anInt6935;
	static int anInt6936;
	static int anInt6937;

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6933++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			int i_1_ = -72 / ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_2_ = (2048 + anInt6931 * Class246_Sub1_Sub11.anIntArray6245[i_0_]);
				int i_3_ = i_2_ >> 12;
				int i_4_ = 1 + i_3_;
				int i_5_ = 0;
				while_62_: for (/**/; i_5_ < Class246_Sub37_Sub1.f_gb; i_5_++) {
					Class241.anInt3404 = Class218.anInt3029 = Class130_Sub1.anInt3735 = Class55.anInt787 = 2147483647;
					int i_6_ = Class187.anIntArray2654[i_5_] * anInt6924 + 2048;
					int i_7_ = i_6_ >> 12;
					int i_8_ = i_7_ + 1;
					for (int i_9_ = -1 + i_3_; (i_9_ ^ 0xffffffff) >= (i_4_ ^ 0xffffffff); i_9_++) {
						int i_10_ = ((aByteArray6927[0xff & ((i_9_ ^ 0xffffffff) <= (anInt6931 ^ 0xffffffff) ? -anInt6931 + i_9_ : i_9_)]) & 0xff);
						for (int i_11_ = -1 + i_7_; i_8_ >= i_11_; i_11_++) {
							int i_12_ = 2 * (0xff & (aByteArray6927[((((i_11_ ^ 0xffffffff) <= (anInt6924 ^ 0xffffffff)) ? i_11_ - anInt6924 : i_11_) + i_10_) & 0xff]));
							int i_13_ = (i_6_ - (i_11_ << 12) - aShortArray6923[i_12_++]);
							int i_14_ = i_2_ + (-(i_9_ << 12) + -aShortArray6923[i_12_]);
							int i_15_ = anInt6930;
							int i_16_;
							while_58_: do {
								while_57_: do {
									while_56_: do {
										while_55_: do {
											do {
												if ((i_15_ ^ 0xffffffff) != -2) {
													if (i_15_ != 3) {
														if ((i_15_ ^ 0xffffffff) != -5) {
															if (i_15_ != 5) {
																if (i_15_ == 2)
																	break while_56_;
																break while_57_;
															}
														} else
															break;
														break while_55_;
													}
												} else {
													i_16_ = ((i_13_ * i_13_ - -(i_14_ * i_14_)) >> 12);
													break while_58_;
												}
												i_14_ = (i_14_ >= 0 ? i_14_ : -i_14_);
												i_13_ = (i_13_ < 0 ? -i_13_ : i_13_);
												i_16_ = (i_14_ >= i_13_ ? i_14_ : i_13_);
												break while_58_;
											} while (false);
											i_13_ = (int) ((Math.sqrt((double) ((float) ((i_13_ ^ 0xffffffff) > -1 ? -i_13_ : i_13_) / 4096.0F))) * 4096.0);
											i_14_ = (int) (4096.0 * (Math.sqrt((double) ((float) (i_14_ >= 0 ? i_14_ : -i_14_) / 4096.0F))));
											i_16_ = i_14_ + i_13_;
											i_16_ = i_16_ * i_16_ >> 12;
											break while_58_;
										} while (false);
										i_14_ *= i_14_;
										i_13_ *= i_13_;
										i_16_ = (int) ((Math.sqrt(Math.sqrt((double) ((float) (i_14_ + i_13_) / 1.6777216E7F)))) * 4096.0);
										break while_58_;
									} while (false);
									i_16_ = ((i_13_ >= 0 ? i_13_ : -i_13_) + ((i_14_ ^ 0xffffffff) <= -1 ? i_14_ : -i_14_));
									break while_58_;
								} while (false);
								i_16_ = (int) (4096.0 * (Math.sqrt((double) ((float) ((i_14_ * i_14_) + (i_13_ * i_13_)) / 1.6777216E7F))));
							} while (false);
							if (i_16_ < Class241.anInt3404) {
								Class55.anInt787 = Class130_Sub1.anInt3735;
								Class130_Sub1.anInt3735 = Class218.anInt3029;
								Class218.anInt3029 = Class241.anInt3404;
								Class241.anInt3404 = i_16_;
							} else if (Class218.anInt3029 > i_16_) {
								Class55.anInt787 = Class130_Sub1.anInt3735;
								Class130_Sub1.anInt3735 = Class218.anInt3029;
								Class218.anInt3029 = i_16_;
							} else if ((Class130_Sub1.anInt3735 ^ 0xffffffff) >= (i_16_ ^ 0xffffffff)) {
								if (i_16_ < Class55.anInt787)
									Class55.anInt787 = i_16_;
							} else {
								Class55.anInt787 = Class130_Sub1.anInt3735;
								Class130_Sub1.anInt3735 = i_16_;
							}
						}
					}
					int i_17_ = anInt6929;
					while_60_: do {
						while_59_: do {
							do {
								if ((i_17_ ^ 0xffffffff) != -1) {
									if ((i_17_ ^ 0xffffffff) != -2) {
										if (i_17_ != 3) {
											if (i_17_ != 4) {
												if (i_17_ == 2)
													break while_60_;
												continue while_62_;
											}
										} else
											break;
										break while_59_;
									}
								} else {
									is[i_5_] = Class241.anInt3404;
									continue while_62_;
								}
								is[i_5_] = Class218.anInt3029;
								continue while_62_;
							} while (false);
							is[i_5_] = Class130_Sub1.anInt3735;
							continue while_62_;
						} while (false);
						is[i_5_] = Class55.anInt787;
						continue while_62_;
					} while (false);
					is[i_5_] = -Class241.anInt3404 + Class218.anInt3029;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tp.E(" + i + ',' + i_0_ + ')');
		}
	}

	private final void method2855(int i) {
		do {
			try {
				anInt6937++;
				if (i >= -5)
					aShortArray6923 = null;
				Random random = new Random((long) anInt6922);
				aShortArray6923 = new short[512];
				if (anInt6926 <= 0)
					break;
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -513; i_18_++)
					aShortArray6923[i_18_] = (short) Class122.method826((byte) 94, random, anInt6926);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tp.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2134(boolean bool) {
		try {
			aByteArray6927 = Class17.method163(-29, anInt6922);
			anInt6936++;
			if (bool != false)
				method2135(-116, -19);
			method2855(-75);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tp.F(" + bool + ')');
		}
	}

	static final void method2856(int i, long l) {
		try {
			if (i > 14) {
				anInt6935++;
				try {
					Thread.sleep(l);
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tp.C(" + i + ',' + l + ')');
		}
	}

	final void method2143(int i, int i_19_, BufferStream stream) {
		try {
			if (i != 4)
				method2855(7);
			int i_20_ = i_19_;
			while_67_: do {
				while_66_: do {
					while_65_: do {
						while_64_: do {
							while_63_: do {
								do {
									if (i_20_ != 0) {
										if ((i_20_ ^ 0xffffffff) != -2) {
											if (i_20_ != 2) {
												if (i_20_ != 3) {
													if ((i_20_ ^ 0xffffffff) != -5) {
														if (i_20_ != 5) {
															if ((i_20_ ^ 0xffffffff) == -7)
																break while_66_;
															break while_67_;
														}
													} else
														break while_64_;
													break while_65_;
												}
											} else
												break;
											break while_63_;
										}
									} else {
										anInt6924 = anInt6931 = stream.readUnsignedByte(i + 251);
										break while_67_;
									}
									anInt6922 = stream.readUnsignedByte(i ^ 0xfb);
									break while_67_;
								} while (false);
								anInt6926 = stream.readUnsignedShort((byte) 108);
								break while_67_;
							} while (false);
							anInt6929 = stream.readUnsignedByte(255);
							break while_67_;
						} while (false);
						anInt6930 = stream.readUnsignedByte(255);
						break while_67_;
					} while (false);
					anInt6924 = stream.readUnsignedByte(255);
					break while_67_;
				} while (false);
				anInt6931 = stream.readUnsignedByte(i + 251);
			} while (false);
			anInt6934++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tp.G(" + i + ',' + i_19_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub28_Sub32() {
		super(0, true);
		aShortArray6923 = new short[512];
		aByteArray6927 = new byte[512];
		anInt6926 = 2048;
		anInt6929 = 2;
		anInt6930 = 1;
		anInt6931 = 5;
		anInt6922 = 0;
	}

	public static void method2857(byte i) {
		try {
			int i_21_ = 118 % ((i - 23) / 33);
			aClass_l6928 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tp.B(" + i + ')');
		}
	}
}
