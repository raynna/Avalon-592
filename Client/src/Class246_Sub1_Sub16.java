/* Class246_Sub1_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub16 extends Class246_Sub1 {
	static int anInt6683;
	int[] anIntArray6684;
	static int anInt6685;
	static int anInt6686;
	static int anInt6687;
	char[] aCharArray6688;
	static int anInt6689;
	static int anInt6690;
	static int anInt6691;
	static Class67 aClass67_6692 = new Class67("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ");
	String aString6693;
	static long[] aLongArray6694 = new long[100];
	static int anInt6695;
	char[] aCharArray6696;
	static int anInt6697;
	int[] anIntArray6698;
	/* synthetic */ static Class aClass6699;

	static final void method2741(byte i) {
		try {
			BufferStream.anIntArray5630 = null;
			int i_0_ = -53 % ((34 - i) / 40);
			Class137.anIntArray1961 = null;
			Class168.aBool2394 = false;
			anInt6686++;
			Class254.anIntArray3623 = null;
			Class_j.anIntArray1487 = null;
			Class187_Sub1.anIntArray4869 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "np.D(" + i + ')');
		}
	}

	final int method2742(char c, byte i) {
		try {
			anInt6687++;
			if (((Class246_Sub1_Sub16) this).anIntArray6684 == null)
				return -1;
			for (int i_1_ = 0; i_1_ < ((Class246_Sub1_Sub16) this).anIntArray6684.length; i_1_++) {
				if (((Class246_Sub1_Sub16) this).aCharArray6696[i_1_] == c)
					return ((Class246_Sub1_Sub16) this).anIntArray6684[i_1_];
			}
			if (i >= -30)
				method2746(-88, 41, 67, -107, 117, 70, (byte) 87, -59, 114);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "np.B(" + c + ',' + i + ')');
		}
	}

	static final boolean method2743(int i, int i_2_, Class260 class260) {
		try {
			anInt6683++;
			int i_3_ = (Class38_Sub1_Sub1.anInt6770 - 104) / 2;
			int i_4_ = (-104 + Class152.anInt2205) / 2;
			boolean bool = true;
			for (int i_5_ = i_3_; (i_5_ ^ 0xffffffff) > (104 + i_3_ ^ 0xffffffff); i_5_++) {
				for (int i_6_ = i_4_; (i_4_ + 104 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
					for (int i_7_ = i_2_; (i_7_ ^ 0xffffffff) >= -4; i_7_++) {
						if (IntegerNode.method2179(i_5_, i_2_, (byte) 56, i_7_, i_6_)) {
							int i_8_ = i_7_;
							if (Class211.method1389(i_5_, i - 29788, i_6_))
								i_8_--;
							if (i_8_ >= 0)
								bool &= (Class246_Sub28_Sub19.method2691((byte) -93, i_6_, i_8_, i_5_));
						}
					}
				}
			}
			if (!bool)
				return false;
			int[] is = new int[262144];
			for (int i_9_ = 0; is.length > i_9_; i_9_++)
				is[i_9_] = -16777216;
			Class123.aClass_l1710 = class260.method1706(is, 0, 512, 512, 512);
			Class165.method1087(i ^ 0x60);
			int i_10_ = ((((int) (Math.random() * 20.0) + 238 - 10 << 16) - -(-10 + ((int) (Math.random() * 20.0) + 238) << 8) - (-238 - (int) (Math.random() * 20.0) + 10)) | ~0xffffff);
			int i_11_ = (~0xffffff | -10 + (238 - -(int) (Math.random() * 20.0)) << 16);
			int i_12_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (8.0 * Math.random()));
			boolean[][] bools = new boolean[Class81.anInt1067][Class81.anInt1067];
			for (int i_13_ = i_3_; (i_13_ ^ 0xffffffff) > (104 + i_3_ ^ 0xffffffff); i_13_ += Class81.anInt1067) {
				for (int i_14_ = i_4_; (i_14_ ^ 0xffffffff) > (104 + i_4_ ^ 0xffffffff); i_14_ += Class81.anInt1067) {
					class260.OA(0, 0, Class81.anInt1067 * 4, Class81.anInt1067 * 4);
					class260.p(-16777216);
					for (int i_15_ = i_2_; (i_15_ ^ 0xffffffff) >= -4; i_15_++) {
						for (int i_16_ = 0; ((Class81.anInt1067 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
							for (int i_17_ = 0; Class81.anInt1067 > i_17_; i_17_++)
								bools[i_16_][i_17_] = IntegerNode.method2179(i_13_ - -i_16_, i_2_, (byte) 56, i_15_, i_14_ + i_17_);
						}
						Class246_Sub28_Sub3.aClass210Array5899[i_15_].method1380(0, 0, 1024, i_13_, i_14_, i_13_ - -Class81.anInt1067, i_14_ - -Class81.anInt1067, bools);
						if (!Class134.aBool1869) {
							for (int i_18_ = -4; ((Class81.anInt1067 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++) {
								for (int i_19_ = -4; i_19_ < Class81.anInt1067; i_19_++) {
									int i_20_ = i_13_ + i_18_;
									int i_21_ = i_14_ - -i_19_;
									if (i_20_ >= i_3_ && ((i_4_ ^ 0xffffffff) >= (i_21_ ^ 0xffffffff)) && IntegerNode.method2179(i_20_, i_2_, (byte) 56, i_15_, i_21_)) {
										int i_22_ = i_15_;
										if (Class211.method1389(i_20_, -29792, i_21_))
											i_22_--;
										if ((i_22_ ^ 0xffffffff) <= -1)
											Class47.method318(i_22_, i_10_, i_21_, -4 + 4 * (Class81.anInt1067 - i_19_), class260, i_20_, i_18_ * 4, 17805, i_11_);
									}
								}
							}
						}
					}
					if (Class134.aBool1869) {
						Class199 class199 = Class95.aClass199Array1235[i_2_];
						for (int i_23_ = 0; Class81.anInt1067 > i_23_; i_23_++) {
							for (int i_24_ = 0; ((Class81.anInt1067 ^ 0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++) {
								int i_25_ = i_13_ - -i_23_;
								int i_26_ = i_14_ - -i_24_;
								int i_27_ = (((Class199) class199).anIntArrayArray2829[(-((Class199) class199).anInt2836 + i_25_)][i_26_ + -(((Class199) class199).anInt2841)]);
								if ((i_27_ & 0x40240000) != 0)
									class260.method1734(i_23_ * 4, 4, -4 + (-i_24_ + Class81.anInt1067) * 4, (byte) 58, -1713569622, 4);
								else if ((i_27_ & 0x800000 ^ 0xffffffff) == -1) {
									if ((0x2000000 & i_27_ ^ 0xffffffff) != -1)
										class260.method1681(i ^ ~0x3, -4 + 4 * (-i_24_ + Class81.anInt1067), 4, i_23_ * 4 + 3, -1713569622);
									else if ((0x8000000 & i_27_) != 0)
										class260.method1697(4, -125, -4 + ((-i_24_ + Class81.anInt1067) * 4) + 3, 4 * i_23_, -1713569622);
									else if ((i_27_ & 0x20000000 ^ 0xffffffff) != -1)
										class260.method1681(0, 4 * ((Class81.anInt1067) + -i_24_) - 4, 4, i_23_ * 4, -1713569622);
								} else
									class260.method1697(4, -126, (Class81.anInt1067 - i_24_) * 4 - 4, i_23_ * 4, -1713569622);
							}
						}
					}
					class260.O(0, 0, Class81.anInt1067 * 4, 4 * Class81.anInt1067, i_12_, 2);
					Class123.aClass_l1710.t(48 + 4 * (i_13_ + -i_3_), (-(4 * Class81.anInt1067) + -(4 * (i_14_ + -i_4_)) + 464), Class81.anInt1067 * 4, Class81.anInt1067 * 4, 0, 0);
				}
			}
			class260.e();
			class260.p(-16777215);
			Class205.method1341(-11712);
			if (i != -4)
				method2741((byte) -91);
			Class39_Sub1.f_eb = 0;
			Class97.aClass166_1260.method1102(i ^ 0x4b);
			if (!Class134.aBool1869) {
				for (int i_28_ = i_3_; (i_3_ + 104 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
					for (int i_29_ = i_4_; i_4_ + 104 > i_29_; i_29_++) {
						for (int i_30_ = i_2_; ((i_30_ ^ 0xffffffff) >= (i_2_ + 1 ^ 0xffffffff) && (i_30_ ^ 0xffffffff) >= -4); i_30_++) {
							if (IntegerNode.method2179(i_28_, i_2_, (byte) 56, i_30_, i_29_)) {
								Class_f class_f = ((Class_f) Class246_Sub14.method1997(i_30_, i_28_, i_29_));
								if (class_f == null)
									class_f = (Class_f) (Class17.method168(i_30_, i_28_, i_29_, (aClass6699 != null ? aClass6699 : (aClass6699 = (getClassByName("Class_f"))))));
								if (class_f == null)
									class_f = ((Class_f) Class246_Sub22.method2082(i_30_, i_28_, i_29_));
								if (class_f == null)
									class_f = (Class_f) Class31.method236(i_30_, i_28_, i_29_);
								if (class_f != null) {
									Class185 class185 = (Class143.aClass251_2067.method1610(class_f.method21(true), 0));
									if (!((Class185) class185).aBool2618 || Class246_Sub34.aBool5140) {
										int i_31_ = ((Class185) class185).anInt2579;
										if (((Class185) class185).f_bb != null) {
											for (int i_32_ = 0; (((((Class185) class185).f_bb).length ^ 0xffffffff) < (i_32_ ^ 0xffffffff)); i_32_++) {
												if ((((Class185) class185).f_bb[i_32_]) != -1) {
													Class185 class185_33_ = (Class143.aClass251_2067.method1610((((Class185) class185).f_bb[i_32_]), 0));
													if ((((Class185) class185_33_).anInt2579) >= 0)
														i_31_ = (((Class185) class185_33_).anInt2579);
												}
											}
										}
										if (i_31_ >= 0) {
											boolean bool_34_ = false;
											if ((i_31_ ^ 0xffffffff) <= -1) {
												Class140 class140 = (Class246_Sub28_Sub30.aClass165_6873.method1088(i_31_, (byte) -41));
												if (class140 != null && (((Class140) class140).aBool2037))
													bool_34_ = true;
											}
											int i_35_ = i_28_;
											int i_36_ = i_29_;
											if (bool_34_) {
												int[][] is_37_ = (((Class199) (Class95.aClass199Array1235[i_30_])).anIntArrayArray2829);
												int i_38_ = (((Class199) (Class95.aClass199Array1235[i_30_])).anInt2836);
												int i_39_ = (((Class199) (Class95.aClass199Array1235[i_30_])).anInt2841);
												for (int i_40_ = 0; i_40_ < 10; i_40_++) {
													int i_41_ = (int) (4.0 * (Math.random()));
													if (((i_41_ ^ 0xffffffff) == -1) && i_3_ < i_35_ && ((i_28_ - 3 ^ 0xffffffff) > (i_35_ ^ 0xffffffff)) && ((0x2c0108 & (is_37_[(-i_38_ + (i_35_ - 1))][(-i_39_ + i_36_)])) == 0))
														i_35_--;
													if (((i_41_ ^ 0xffffffff) == -2) && (i_35_ < i_3_ + 104 - 1) && ((3 + i_28_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff)) && ((0x2c0180 & (is_37_[(i_35_ + (1 + -i_38_))][(-i_39_ + i_36_)])) == 0))
														i_35_++;
													if (((i_41_ ^ 0xffffffff) == -3) && ((i_36_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) && ((i_36_ ^ 0xffffffff) < (i_29_ - 3 ^ 0xffffffff)) && ((0x2c0102 & (is_37_[(i_35_ + -i_38_)][(i_36_ - 1 + -i_39_)])) == 0))
														i_36_--;
													if (i_41_ == 3 && i_36_ < i_4_ + 103 && i_29_ + 3 > i_36_ && ((((is_37_[i_35_ + -i_38_][(i_36_ - (-1 + i_39_))]) & 0x2c0120) ^ 0xffffffff) == -1))
														i_36_++;
												}
											}
											Class256.anIntArray3673[Class39_Sub1.f_eb] = (((Class185) class185).anInt2607);
											Class246_Sub28_Sub6.anIntArray6043[Class39_Sub1.f_eb] = i_35_;
											Class59_Sub1_Sub1.anIntArray5991[Class39_Sub1.f_eb] = i_36_;
											Class39_Sub1.f_eb++;
										}
									}
								}
							}
						}
					}
				}
				if (Class246_Sub29.aClass178_4966 != null) {
					((Class_fs) ISAAC.index2).anInt126 = 1;
					Class246_Sub28_Sub30.aClass165_6873.method1095(64, false, 1024);
					for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > ((((Class178) Class246_Sub29.aClass178_4966).anInt2504) ^ 0xffffffff)); i_42_++) {
						int i_43_ = (((Class178) Class246_Sub29.aClass178_4966).anIntArray2505[i_42_]);
						if ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) == i_43_ >> 28) {
							int i_44_ = ((0x3fff & i_43_ >> 14) + -Class39_Sub1.anInt4670);
							int i_45_ = (i_43_ & 0x3fff) + -Class47.anInt686;
							if ((i_44_ ^ 0xffffffff) > -1 || i_44_ >= Class38_Sub1_Sub1.anInt6770 || (i_45_ ^ 0xffffffff) > -1 || (i_45_ ^ 0xffffffff) <= (Class152.anInt2205 ^ 0xffffffff)) {
								Class140 class140 = (Class246_Sub28_Sub30.aClass165_6873.method1088((((Class178) Class246_Sub29.aClass178_4966).anIntArray2499[i_42_]), (byte) -41));
								if ((((Class140) class140).anIntArray2027 != null) && (((Class140) class140).anInt2032 + i_44_ >= 0) && (Class38_Sub1_Sub1.anInt6770 > (((Class140) class140).anInt2038 + i_44_)) && (((Class140) class140).anInt2021 + i_45_ ^ 0xffffffff) <= -1 && ((Class152.anInt2205 ^ 0xffffffff) < ((((Class140) class140).anInt2008 + i_45_) ^ 0xffffffff)))
									Class97.aClass166_1260.method1101(false, new IntegerNode(i_42_));
							} else
								Class97.aClass166_1260.method1101(false, new IntegerNode(i_42_));
						}
					}
					Class246_Sub28_Sub30.aClass165_6873.method1095(64, false, 128);
					((Class_fs) ISAAC.index2).anInt126 = 2;
					ISAAC.index2.method105(0);
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("np.A(" + i + ',' + i_2_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2744(char c, byte i) {
		try {
			anInt6685++;
			if (i != -112)
				((Class246_Sub1_Sub16) this).aCharArray6696 = null;
			if (((Class246_Sub1_Sub16) this).anIntArray6698 == null)
				return -1;
			for (int i_46_ = 0; ((((Class246_Sub1_Sub16) this).anIntArray6698.length ^ 0xffffffff) < (i_46_ ^ 0xffffffff)); i_46_++) {
				if (((Class246_Sub1_Sub16) this).aCharArray6688[i_46_] == c)
					return ((Class246_Sub1_Sub16) this).anIntArray6698[i_46_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "np.I(" + c + ',' + i + ')');
		}
	}

	final void method2745(byte i) {
		do {
			try {
				if (i < 49)
					anInt6697 = -91;
				anInt6691++;
				if (((Class246_Sub1_Sub16) this).anIntArray6684 != null) {
					for (int i_47_ = 0; (((Class246_Sub1_Sub16) this).anIntArray6684.length > i_47_); i_47_++)
						((Class246_Sub1_Sub16) this).anIntArray6684[i_47_] = Class236.method1523((((Class246_Sub1_Sub16) this).anIntArray6684[i_47_]), 32768);
				}
				if (((Class246_Sub1_Sub16) this).anIntArray6698 == null)
					break;
				for (int i_48_ = 0; ((((Class246_Sub1_Sub16) this).anIntArray6698.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff)); i_48_++)
					((Class246_Sub1_Sub16) this).anIntArray6698[i_48_] = Class236.method1523((((Class246_Sub1_Sub16) this).anIntArray6698[i_48_]), 32768);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "np.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2746(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, byte i_54_, int i_55_, int i_56_) {
		try {
			anInt6695++;
			if (i_54_ == 41)
				Class211.method1386(i, i_49_, i_50_, i_56_, 0, i_55_, i_52_, i_54_ ^ 0x1de, i_51_, i_53_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("np.G(" + i + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ',' + i_56_ + ')'));
		}
	}

	private final void method2747(BufferStream stream, int i, int i_57_) {
		try {
			if (i_57_ != 1) {
				if ((i_57_ ^ 0xffffffff) == -3) {
					int i_58_ = stream.readUnsignedByte(255);
					((Class246_Sub1_Sub16) this).aCharArray6688 = new char[i_58_];
					((Class246_Sub1_Sub16) this).anIntArray6698 = new int[i_58_];
					for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
						((Class246_Sub1_Sub16) this).anIntArray6698[i_59_] = stream.readUnsignedShort((byte) 87);
						byte i_60_ = stream.readByte(false);
						((Class246_Sub1_Sub16) this).aCharArray6688[i_59_] = (i_60_ == 0 ? '\0' : Class246_Sub1_Sub8_Sub1.method2923(32404, i_60_));
					}
				} else if (i_57_ == 3) {
					int i_61_ = stream.readUnsignedByte(255);
					((Class246_Sub1_Sub16) this).aCharArray6696 = new char[i_61_];
					((Class246_Sub1_Sub16) this).anIntArray6684 = new int[i_61_];
					for (int i_62_ = 0; (i_61_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
						((Class246_Sub1_Sub16) this).anIntArray6684[i_62_] = stream.readUnsignedShort((byte) 83);
						byte i_63_ = stream.readByte(false);
						((Class246_Sub1_Sub16) this).aCharArray6696[i_62_] = (i_63_ == 0 ? '\0' : Class246_Sub1_Sub8_Sub1.method2923(32404, i_63_));
					}
				}
			} else
				((Class246_Sub1_Sub16) this).aString6693 = stream.readString((byte) -40);
			int i_64_ = -31 / ((i + 59) / 63);
			anInt6689++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("np.F(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_57_ + ')'));
		}
	}

	final void method2748(BufferStream stream, int i) {
		try {
			for (;;) {
				int i_65_ = stream.readUnsignedByte(255);
				if (i_65_ == 0)
					break;
				method2747(stream, 37, i_65_);
			}
			if (i > -15)
				((Class246_Sub1_Sub16) this).aString6693 = null;
			anInt6690++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "np.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2749(boolean bool) {
		try {
			if (bool != true)
				method2741((byte) 73);
			aLongArray6694 = null;
			aClass67_6692 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "np.E(" + bool + ')');
		}
	}

	public Class246_Sub1_Sub16() {
		/* empty */
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
