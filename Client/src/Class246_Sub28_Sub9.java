/* Class246_Sub28_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub9 extends Class246_Sub28 {
	static int anInt6134;
	static int anInt6135;
	int anInt6136 = 4;
	int anInt6137;
	private short[] aShortArray6138;
	static String aString6139 = null;
	private short[] aShortArray6140;
	static int anInt6141;
	static int anInt6142;
	private byte[] aByteArray6143;
	int anInt6144 = 1638;
	static int anInt6145;
	static int anInt6146;
	static int anInt6147;
	static int[] anIntArray6148 = new int[4096];
	int anInt6149;
	boolean aBool6150;
	int anInt6151;
	static int anInt6152;

	final void method2573(int[] is, byte i, int i_0_) {
		try {
			anInt6134++;
			int i_1_ = (Class246_Sub1_Sub11.anIntArray6245[i_0_] * ((Class246_Sub28_Sub9) this).anInt6149);
			if (i <= 114)
				method2134(false);
			if (((Class246_Sub28_Sub9) this).anInt6136 != 1) {
				int i_2_ = aShortArray6138[0];
				if ((i_2_ ^ 0xffffffff) < -9 || (i_2_ ^ 0xffffffff) > 7) {
					int i_3_ = aShortArray6140[0] << 12;
					int i_4_ = i_3_ * i_1_ >> 12;
					int i_5_ = ((Class246_Sub28_Sub9) this).anInt6149 * i_3_ >> 12;
					int i_6_ = i_3_ * ((Class246_Sub28_Sub9) this).anInt6137 >> 12;
					int i_7_ = i_4_ >> 12;
					int i_8_ = 1 + i_7_;
					if (i_8_ >= i_5_)
						i_8_ = 0;
					i_4_ &= 0xfff;
					int i_9_ = 0xff & aByteArray6143[0xff & i_7_];
					int i_10_ = Class61.anIntArray839[i_4_];
					int i_11_ = aByteArray6143[i_8_ & 0xff] & 0xff;
					for (int i_12_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						int i_13_ = (Class187.anIntArray2654[i_12_] * ((Class246_Sub28_Sub9) this).anInt6137);
						int i_14_ = method2574(i_10_, i_9_, i_11_, i_6_, 3, i_13_ * i_3_ >> 12, i_4_);
						is[i_12_] = i_2_ * i_14_ >> 12;
					}
				}
				for (int i_15_ = 1; ((Class246_Sub28_Sub9) this).anInt6136 > i_15_; i_15_++) {
					i_2_ = aShortArray6138[i_15_];
					if (i_2_ > 8 || (i_2_ ^ 0xffffffff) > 7) {
						int i_16_ = aShortArray6140[i_15_] << 12;
						int i_17_ = (((Class246_Sub28_Sub9) this).anInt6137 * i_16_ >> 12);
						int i_18_ = i_16_ * i_1_ >> 12;
						int i_19_ = (((Class246_Sub28_Sub9) this).anInt6149 * i_16_ >> 12);
						int i_20_ = i_18_ >> 12;
						int i_21_ = 1 + i_20_;
						if (i_19_ <= i_21_)
							i_21_ = 0;
						i_18_ &= 0xfff;
						int i_22_ = Class61.anIntArray839[i_18_];
						int i_23_ = 0xff & aByteArray6143[0xff & i_21_];
						int i_24_ = aByteArray6143[0xff & i_20_] & 0xff;
						if (((Class246_Sub28_Sub9) this).aBool6150 && (((Class246_Sub28_Sub9) this).anInt6136 - 1 ^ 0xffffffff) == (i_15_ ^ 0xffffffff)) {
							for (int i_25_ = 0; Class246_Sub37_Sub1.f_gb > i_25_; i_25_++) {
								int i_26_ = (Class187.anIntArray2654[i_25_] * (((Class246_Sub28_Sub9) this).anInt6137));
								int i_27_ = method2574(i_22_, i_24_, i_23_, i_17_, 3, i_16_ * i_26_ >> 12, i_18_);
								i_27_ = is[i_25_] + (i_27_ * i_2_ >> 12);
								is[i_25_] = 2048 + (i_27_ >> 1);
							}
						} else {
							for (int i_28_ = 0; Class246_Sub37_Sub1.f_gb > i_28_; i_28_++) {
								int i_29_ = (((Class246_Sub28_Sub9) this).anInt6137 * Class187.anIntArray2654[i_28_]);
								int i_30_ = method2574(i_22_, i_24_, i_23_, i_17_, 3, i_16_ * i_29_ >> 12, i_18_);
								is[i_28_] += i_30_ * i_2_ >> 12;
							}
						}
					}
				}
			} else {
				int i_31_ = aShortArray6140[0] << 12;
				int i_32_ = aShortArray6138[0];
				int i_33_ = i_31_ * i_1_ >> 12;
				int i_34_ = ((Class246_Sub28_Sub9) this).anInt6149 * i_31_ >> 12;
				int i_35_ = ((Class246_Sub28_Sub9) this).anInt6137 * i_31_ >> 12;
				int i_36_ = i_33_ >> 12;
				int i_37_ = 1 + i_36_;
				i_33_ &= 0xfff;
				if (i_37_ >= i_34_)
					i_37_ = 0;
				int i_38_ = Class61.anIntArray839[i_33_];
				int i_39_ = aByteArray6143[0xff & i_37_] & 0xff;
				int i_40_ = aByteArray6143[0xff & i_36_] & 0xff;
				if (!((Class246_Sub28_Sub9) this).aBool6150) {
					for (int i_41_ = 0; i_41_ < Class246_Sub37_Sub1.f_gb; i_41_++) {
						int i_42_ = (((Class246_Sub28_Sub9) this).anInt6137 * Class187.anIntArray2654[i_41_]);
						int i_43_ = method2574(i_38_, i_40_, i_39_, i_35_, 3, i_42_ * i_31_ >> 12, i_33_);
						is[i_41_] = i_32_ * i_43_ >> 12;
					}
				} else {
					for (int i_44_ = 0; i_44_ < Class246_Sub37_Sub1.f_gb; i_44_++) {
						int i_45_ = (Class187.anIntArray2654[i_44_] * ((Class246_Sub28_Sub9) this).anInt6137);
						int i_46_ = method2574(i_38_, i_40_, i_39_, i_35_, 3, i_45_ * i_31_ >> 12, i_33_);
						i_46_ = i_46_ * i_32_ >> 12;
						is[i_44_] = (i_46_ >> 1) + 2048;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gl.I(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	private final int method2574(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		try {
			anInt6146++;
			int i_53_ = i_51_ >> 12;
			int i_54_ = i_53_ + 1;
			i_51_ &= 0xfff;
			i_53_ &= 0xff;
			if ((i_54_ ^ 0xffffffff) <= (i_49_ ^ 0xffffffff))
				i_54_ = 0;
			i_54_ &= 0xff;
			int i_55_ = i_52_ - 4096;
			int i_56_ = i_51_ - 4096;
			int i_57_ = Class61.anIntArray839[i_51_];
			int i_58_ = aByteArray6143[i_47_ + i_53_] & 0x3;
			int i_59_;
			if ((i_58_ ^ 0xffffffff) >= -2)
				i_59_ = i_58_ != 0 ? -i_51_ + i_52_ : i_51_ + i_52_;
			else
				i_59_ = ((i_58_ ^ 0xffffffff) != -3 ? -i_51_ + -i_52_ : -i_52_ + i_51_);
			i_58_ = 0x3 & aByteArray6143[i_47_ + i_54_];
			int i_60_;
			if (i_58_ <= 1)
				i_60_ = ((i_58_ ^ 0xffffffff) != -1 ? i_52_ - i_56_ : i_52_ + i_56_);
			else
				i_60_ = i_58_ == 2 ? -i_52_ + i_56_ : -i_56_ - i_52_;
			i_58_ = aByteArray6143[i_53_ - -i_48_] & 0x3;
			int i_61_ = ((i_60_ - i_59_) * i_57_ >> 12) + i_59_;
			if (i_58_ <= 1)
				i_59_ = ((i_58_ ^ 0xffffffff) == -1 ? i_55_ + i_51_ : -i_51_ + i_55_);
			else
				i_59_ = ((i_58_ ^ 0xffffffff) != -3 ? -i_55_ + -i_51_ : i_51_ + -i_55_);
			i_58_ = aByteArray6143[i_48_ + i_54_] & i_50_;
			if (i_58_ > 1)
				i_60_ = i_58_ == 2 ? -i_55_ + i_56_ : -i_56_ + -i_55_;
			else
				i_60_ = i_58_ != 0 ? -i_56_ + i_55_ : i_56_ + i_55_;
			int i_62_ = i_59_ - -((i_60_ - i_59_) * i_57_ >> 12);
			return ((-i_61_ + i_62_) * i >> 12) + i_61_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gl.A(" + i + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ')'));
		}
	}

	public Class246_Sub28_Sub9() {
		super(0, true);
		aByteArray6143 = new byte[512];
		((Class246_Sub28_Sub9) this).anInt6137 = 4;
		((Class246_Sub28_Sub9) this).anInt6149 = 4;
		((Class246_Sub28_Sub9) this).anInt6151 = 0;
		((Class246_Sub28_Sub9) this).aBool6150 = true;
	}

	static final byte[] method2575(int i, byte i_63_, Object object, int i_64_) {
		try {
			anInt6147++;
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				return Class218.method1416(0, i_64_, i, is);
			}
			if (object instanceof Class82) {
				Class82 class82 = (Class82) object;
				return class82.method523(i_64_, i, 13);
			}
			if (i_63_ <= 36)
				return null;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gl.H(" + i + ',' + i_63_ + ',' + (object != null ? "{...}" : "null") + ',' + i_64_ + ')'));
		}
	}

	final void method2143(int i, int i_65_, BufferStream stream) {
		try {
			int i_66_ = i_65_;
			while_88_: do {
				while_87_: do {
					while_86_: do {
						while_85_: do {
							while_84_: do {
								do {
									if ((i_66_ ^ 0xffffffff) != -1) {
										if (i_66_ != 1) {
											if ((i_66_ ^ 0xffffffff) != -3) {
												if ((i_66_ ^ 0xffffffff) != -4) {
													if (i_66_ != 4) {
														if (i_66_ != 5) {
															if ((i_66_ ^ 0xffffffff) == -7)
																break while_87_;
															break while_88_;
														}
													} else
														break while_85_;
													break while_86_;
												}
											} else
												break;
											break while_84_;
										}
									} else {
										((Class246_Sub28_Sub9) this).aBool6150 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
										break while_88_;
									}
									((Class246_Sub28_Sub9) this).anInt6136 = stream.readUnsignedByte(255);
									break while_88_;
								} while (false);
								((Class246_Sub28_Sub9) this).anInt6144 = stream.method2375((byte) 1);
								if ((((Class246_Sub28_Sub9) this).anInt6144 ^ 0xffffffff) > -1) {
									aShortArray6138 = new short[((Class246_Sub28_Sub9) this).anInt6136];
									for (i_66_ = 0; (((((Class246_Sub28_Sub9) this).anInt6136) ^ 0xffffffff) < (i_66_ ^ 0xffffffff)); i_66_++)
										aShortArray6138[i_66_] = (short) (stream.method2375((byte) 1));
								}
								break while_88_;
							} while (false);
							((Class246_Sub28_Sub9) this).anInt6137 = ((Class246_Sub28_Sub9) this).anInt6149 = stream.readUnsignedByte(i ^ 0xfb);
							break while_88_;
						} while (false);
						((Class246_Sub28_Sub9) this).anInt6151 = stream.readUnsignedByte(255);
						break while_88_;
					} while (false);
					((Class246_Sub28_Sub9) this).anInt6137 = stream.readUnsignedByte(i + 251);
					break while_88_;
				} while (false);
				((Class246_Sub28_Sub9) this).anInt6149 = stream.readUnsignedByte(255);
			} while (false);
			if (i != 4)
				method2574(-27, -50, -68, 25, -51, 5, -102);
			anInt6142++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gl.G(" + i + ',' + i_65_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2576(int i) {
		do {
			try {
				if (((Class246_Sub28_Sub9) this).anInt6144 > 0) {
					aShortArray6138 = new short[((Class246_Sub28_Sub9) this).anInt6136];
					aShortArray6140 = new short[((Class246_Sub28_Sub9) this).anInt6136];
					for (int i_67_ = 0; ((i_67_ ^ 0xffffffff) > (((Class246_Sub28_Sub9) this).anInt6136 ^ 0xffffffff)); i_67_++) {
						aShortArray6138[i_67_] = (short) (int) (4096.0 * (Math.pow((double) ((float) (((Class246_Sub28_Sub9) this).anInt6144) / 4096.0F), (double) i_67_)));
						aShortArray6140[i_67_] = (short) (int) Math.pow(2.0, (double) i_67_);
					}
				} else if (aShortArray6138 != null && (aShortArray6138.length == ((Class246_Sub28_Sub9) this).anInt6136)) {
					aShortArray6140 = new short[((Class246_Sub28_Sub9) this).anInt6136];
					for (int i_68_ = 0; ((((Class246_Sub28_Sub9) this).anInt6136 ^ 0xffffffff) < (i_68_ ^ 0xffffffff)); i_68_++)
						aShortArray6140[i_68_] = (short) (int) Math.pow(2.0, (double) i_68_);
				}
				anInt6135++;
				if (i < -124)
					break;
				((Class246_Sub28_Sub9) this).aBool6150 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "gl.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2134(boolean bool) {
		while_89_: do {
			try {
				aByteArray6143 = Class17.method163(61, (((Class246_Sub28_Sub9) this).anInt6151));
				anInt6141++;
				method2576(-127);
				if (bool == false) {
					for (int i = ((Class246_Sub28_Sub9) this).anInt6136 - 1; i >= 1; i--) {
						short i_69_ = aShortArray6138[i];
						if ((i_69_ ^ 0xffffffff) < -9)
							break while_89_;
						if (i_69_ < -8)
							break;
						((Class246_Sub28_Sub9) this).anInt6136--;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "gl.F(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method2577(byte i) {
		try {
			anIntArray6148 = null;
			if (i == 26)
				aString6139 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gl.D(" + i + ')');
		}
	}

	static final void method2578(byte i) {
		try {
			if (i < -32) {
				if (Signlink.anInt740 != 3)
					Class32.anInt438 = -1;
				anInt6145++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gl.B(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_70_) {
		try {
			anInt6152++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_70_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887)
				method2573(is, (byte) 124, i_70_);
			int i_71_ = -80 / ((i - 67) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gl.E(" + i + ',' + i_70_ + ')');
		}
	}
}
