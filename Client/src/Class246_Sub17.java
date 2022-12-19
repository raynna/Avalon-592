/* Class246_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub17 extends Node {
	private Interface10 anInterface10_4642;
	private float[][] aFloatArrayArray4643;
	static int anInt4644;
	static int anInt4645;
	private int anInt4646;
	static int anInt4647;
	private BufferStream aStream4648;
	private float[][] aFloatArrayArray4649;
	private int anInt4650;
	private Interface1 anInterface1_4651;
	private float[][] aFloatArrayArray4652;
	private int anInt4653;
	private int anInt4654;
	private Class260_Sub2 aClass260_Sub2_4655;
	static int anInt4656;
	private int anInt4657;
	static int anInt4658;
	private Stream_Sub2 aStream_Sub2_4659;
	private Class160 aClass160_4660;
	private Class85 aClass85_4661;
	private Class160 aClass160_4662;
	static int anInt4663 = 0;
	private int anInt4664;
	private Class210_Sub2 aClass210_Sub2_4665;
	private Class246_Sub41 aClass246_Sub41_4666;

	private final void method2043(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			anInt4658++;
			long l = -1L;
			if (i_2_ != -26291)
				anInt4650 = -98;
			int i_6_ = (i_5_ << ((Class210) aClass210_Sub2_4665).anInt2950) + i;
			int i_7_ = (i_4_ << ((Class210) aClass210_Sub2_4665).anInt2950) + i_0_;
			int i_8_ = aClass210_Sub2_4665.a(i_6_, i_7_);
			if ((0x7f & i ^ 0xffffffff) == -1 || (0x7f & i_0_) == 0) {
				l = 0xffffL & (long) i_6_ | (long) i_7_ << 16 & 65535L << 16;
				Node class246 = aClass85_4661.method544(l, 126);
				if (class246 != null) {
					method2044((byte) 21, (((Class246_Sub25) (Class246_Sub25) class246).aShort4879));
					return;
				}
			}
			short i_9_ = (short) anInt4654++;
			if ((l ^ 0xffffffffffffffffL) != 0L)
				aClass85_4661.method547(l, -2301, new Class246_Sub25(i_9_));
			float f;
			float f_10_;
			float f_11_;
			if (i != 0 || (i_0_ ^ 0xffffffff) != -1) {
				if (i != ((Class210) aClass210_Sub2_4665).anInt2955 || i_0_ != 0) {
					if (i != ((Class210) aClass210_Sub2_4665).anInt2955 || (((Class210) aClass210_Sub2_4665).anInt2955 != i_0_)) {
						if ((i ^ 0xffffffff) != -1 || (((Class210) aClass210_Sub2_4665).anInt2955 != i_0_)) {
							float f_12_ = ((float) i / (float) (((Class210) aClass210_Sub2_4665).anInt2955));
							float f_13_ = ((float) i_0_ / (float) (((Class210) aClass210_Sub2_4665).anInt2955));
							float f_14_ = aFloatArrayArray4643[i_3_][i_1_];
							float f_15_ = aFloatArrayArray4649[i_3_][i_1_];
							float f_16_ = aFloatArrayArray4652[i_3_][i_1_];
							float f_17_ = aFloatArrayArray4643[i_3_ + 1][i_1_];
							float f_18_ = aFloatArrayArray4649[1 + i_3_][i_1_];
							f_18_ += (-f_18_ + (aFloatArrayArray4649[1 + i_3_][i_1_ + 1])) * f_12_;
							f_16_ += (aFloatArrayArray4652[i_3_][i_1_ + 1] - f_16_) * f_12_;
							float f_19_ = aFloatArrayArray4652[i_3_ + 1][i_1_];
							f_17_ += (-f_17_ + (aFloatArrayArray4643[i_3_ + 1][i_1_ + 1])) * f_12_;
							f_14_ += (aFloatArrayArray4643[i_3_][i_1_ + 1] - f_14_) * f_12_;
							f_15_ += ((-f_15_ + aFloatArrayArray4649[i_3_][1 + i_1_]) * f_12_);
							f_10_ = f_13_ * (f_18_ - f_15_) + f_15_;
							f_19_ += (-f_19_ + (aFloatArrayArray4652[1 + i_3_][i_1_ + 1])) * f_12_;
							f = f_13_ * (f_17_ - f_14_) + f_14_;
							f_11_ = f_16_ + f_13_ * (-f_16_ + f_19_);
						} else {
							f = aFloatArrayArray4643[i_3_][1 + i_1_];
							f_10_ = aFloatArrayArray4649[i_3_][1 + i_1_];
							f_11_ = aFloatArrayArray4652[i_3_][1 + i_1_];
						}
					} else {
						f_11_ = aFloatArrayArray4652[i_3_ + 1][i_1_ + 1];
						f_10_ = aFloatArrayArray4649[i_3_ + 1][i_1_ + 1];
						f = aFloatArrayArray4643[1 + i_3_][i_1_ + 1];
					}
				} else {
					f_11_ = aFloatArrayArray4652[1 + i_3_][i_1_];
					f_10_ = aFloatArrayArray4649[i_3_ + 1][i_1_];
					f = aFloatArrayArray4643[i_3_ + 1][i_1_];
				}
			} else {
				f = aFloatArrayArray4643[i_3_][i_1_];
				f_10_ = aFloatArrayArray4649[i_3_][i_1_];
				f_11_ = aFloatArrayArray4652[i_3_][i_1_];
			}
			float f_20_ = (float) (aClass246_Sub41_4666.method2317(false) + -i_6_);
			float f_21_ = (float) (-i_8_ + aClass246_Sub41_4666.method2318((byte) 27));
			float f_22_ = (float) (-i_7_ + aClass246_Sub41_4666.method2321((byte) -119));
			float f_23_ = (float) Math.sqrt((double) (f_22_ * f_22_ + (f_21_ * f_21_ + f_20_ * f_20_)));
			float f_24_ = 1.0F / f_23_;
			f_22_ *= f_24_;
			f_21_ *= f_24_;
			f_20_ *= f_24_;
			float f_25_ = (f_23_ / (float) aClass246_Sub41_4666.method2322(i_2_ + 26413));
			float f_26_ = -(f_25_ * f_25_) + 1.0F;
			if (f_26_ < 0.0F)
				f_26_ = 0.0F;
			float f_27_ = f * f_20_ + f_10_ * f_21_ + f_22_ * f_11_;
			if (f_27_ < 0.0F)
				f_27_ = 0.0F;
			float f_28_ = f_27_ * f_26_ * 2.0F;
			if (f_28_ > 1.0F)
				f_28_ = 1.0F;
			int i_29_ = aClass246_Sub41_4666.method2319((byte) -113);
			int i_30_ = (int) (f_28_ * (float) ((i_29_ & 0xff6200) >> 16));
			if ((i_30_ ^ 0xffffffff) < -256)
				i_30_ = 255;
			int i_31_ = (int) ((float) (0xff & i_29_ >> 8) * f_28_);
			if (i_31_ > 255)
				i_31_ = 255;
			int i_32_ = (int) (f_28_ * (float) (i_29_ & 0xff));
			if (((Class260_Sub2) aClass260_Sub2_4655).aBool4392) {
				aStream_Sub2_4659.method2595((float) i_6_, (byte) 98);
				aStream_Sub2_4659.method2595((float) i_8_, (byte) 98);
				aStream_Sub2_4659.method2595((float) i_7_, (byte) 98);
			} else {
				aStream_Sub2_4659.method2591((float) i_6_, i_2_ + 1739693795);
				aStream_Sub2_4659.method2591((float) i_8_, 1739667504);
				aStream_Sub2_4659.method2591((float) i_7_, 1739667504);
			}
			if ((i_32_ ^ 0xffffffff) < -256)
				i_32_ = 255;
			aStream_Sub2_4659.writeByte(255, i_30_);
			aStream_Sub2_4659.writeByte(255, i_31_);
			aStream_Sub2_4659.writeByte(255, i_32_);
			aStream_Sub2_4659.writeByte(255, 255);
			method2044((byte) 19, i_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iu.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	private final void method2044(byte i, short i_33_) {
		try {
			anInt4647++;
			do {
				if (!((Class260_Sub2) aClass260_Sub2_4655).aBool4392) {
					aStream4648.method2404((byte) -92, i_33_);
					if (!client.f_ob)
						break;
				}
				aStream4648.writeShort((byte) 67, i_33_);
			} while (false);
			int i_34_ = -77 % ((i + 40) / 40);
			anInt4650++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iu.A(" + i + ',' + i_33_ + ')');
		}
	}

	static final void method2045(int i, Class246_Sub35 class246_sub35) {
		try {
			if (i != 21944)
				anInt4663 = 88;
			anInt4645++;
			if (!Class246_Sub28_Sub21.aBool6580) {
				class246_sub35.unlink((byte) 81);
				Class230.anInt3147--;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iu.D(" + i + ',' + (class246_sub35 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2046(int i, int i_35_, int i_36_, int i_37_, boolean[][] bools) {
		try {
			anInt4644++;
			if (anInterface1_4651 != null && (i + i_36_ ^ 0xffffffff) <= (anInt4646 ^ 0xffffffff) && i_36_ - i <= anInt4657 && i_35_ > 19 && (anInt4664 ^ 0xffffffff) >= (i_37_ + i ^ 0xffffffff) && -i + i_37_ <= anInt4653) {
				for (int i_38_ = anInt4664; (anInt4653 ^ 0xffffffff) <= (i_38_ ^ 0xffffffff); i_38_++) {
					for (int i_39_ = anInt4646; (i_39_ ^ 0xffffffff) >= (anInt4657 ^ 0xffffffff); i_39_++) {
						int i_40_ = -i_36_ + i_39_;
						int i_41_ = i_38_ - i_37_;
						if ((i_40_ ^ 0xffffffff) < (-i ^ 0xffffffff) && i > i_40_ && i_41_ > -i && (i ^ 0xffffffff) < (i_41_ ^ 0xffffffff) && bools[i + i_40_][i_41_ + i]) {
							aClass260_Sub2_4655.method1901((byte) -100, (int) (aClass246_Sub41_4666.method2316(false) * 255.0F) << 24);
							aClass260_Sub2_4655.method1934(aClass160_4660, 127, null, null, aClass160_4662);
							aClass260_Sub2_4655.method1967(0, anInt4650, 4, anInterface1_4651, (byte) -95);
							return;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iu.C(" + i + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + (bools != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub17(Class260_Sub2 class260_sub2, Class210_Sub2 class210_sub2, Class246_Sub41 class246_sub41, int[] is) {
		try {
			aClass260_Sub2_4655 = class260_sub2;
			aClass210_Sub2_4665 = class210_sub2;
			aClass246_Sub41_4666 = class246_sub41;
			int i = (aClass246_Sub41_4666.method2322(115) - (((Class210) class210_sub2).anInt2955 >> 1));
			anInt4646 = (-i + aClass246_Sub41_4666.method2317(false) >> ((Class210) class210_sub2).anInt2950);
			anInt4657 = (aClass246_Sub41_4666.method2317(false) - -i >> ((Class210) class210_sub2).anInt2950);
			anInt4664 = (-i + aClass246_Sub41_4666.method2321((byte) -109) >> ((Class210) class210_sub2).anInt2950);
			anInt4653 = (aClass246_Sub41_4666.method2321((byte) -67) + i >> ((Class210) class210_sub2).anInt2950);
			int i_42_ = 1 + -anInt4646 + anInt4657;
			int i_43_ = anInt4653 + (-anInt4664 + 1);
			aFloatArrayArray4649 = new float[i_42_ + 1][i_43_ + 1];
			aFloatArrayArray4652 = new float[i_42_ + 1][1 + i_43_];
			aFloatArrayArray4643 = new float[1 + i_42_][i_43_ + 1];
			for (int i_44_ = 0; i_44_ <= i_43_; i_44_++) {
				int i_45_ = anInt4664 + i_44_;
				if ((i_45_ ^ 0xffffffff) < -1 && (-1 + ((Class210) aClass210_Sub2_4665).anInt2952 ^ 0xffffffff) < (i_45_ ^ 0xffffffff)) {
					for (int i_46_ = 0; i_42_ >= i_46_; i_46_++) {
						int i_47_ = anInt4646 + i_46_;
						if ((i_47_ ^ 0xffffffff) < -1 && ((i_47_ ^ 0xffffffff) > (-1 + (((Class210) aClass210_Sub2_4665).anInt2956) ^ 0xffffffff))) {
							int i_48_ = (class210_sub2.l(i_47_ + 1, i_45_) - class210_sub2.l(-1 + i_47_, i_45_));
							int i_49_ = (class210_sub2.l(i_47_, i_45_ + 1) + -class210_sub2.l(i_47_, i_45_ - 1));
							float f = (float) (1.0 / (Math.sqrt((double) (65536 + i_48_ * i_48_ + i_49_ * i_49_))));
							aFloatArrayArray4643[i_46_][i_44_] = f * (float) i_48_;
							aFloatArrayArray4649[i_46_][i_44_] = -256.0F * f;
							aFloatArrayArray4652[i_46_][i_44_] = (float) i_49_ * f;
						}
					}
				}
			}
			int i_50_ = 0;
			int i_51_ = 0;
			for (int i_52_ = anInt4664; (anInt4653 ^ 0xffffffff) <= (i_52_ ^ 0xffffffff); i_52_++) {
				if ((i_52_ ^ 0xffffffff) <= -1 && ((((Class210) class210_sub2).anInt2952 ^ 0xffffffff) < (i_52_ ^ 0xffffffff))) {
					for (int i_53_ = anInt4646; (anInt4657 ^ 0xffffffff) <= (i_53_ ^ 0xffffffff); i_53_++) {
						if (i_53_ >= 0 && ((i_53_ ^ 0xffffffff) > (((Class210) class210_sub2).anInt2956 ^ 0xffffffff))) {
							int i_54_ = is[i_51_];
							int[] is_55_ = (((Class210_Sub2) class210_sub2).anIntArrayArrayArray4990[i_53_][i_52_]);
							if (is_55_ != null && (i_54_ ^ 0xffffffff) != -1) {
								if ((i_54_ ^ 0xffffffff) == -2)
									i_50_ += is_55_.length;
								else
									i_50_ += 3;
							}
						}
						i_51_++;
					}
				} else
					i_51_ += anInt4657 + -anInt4646;
			}
			if ((i_50_ ^ 0xffffffff) < -1) {
				aStream4648 = new BufferStream(i_50_ * 2);
				aStream_Sub2_4659 = new Stream_Sub2(i_50_ * 16);
				aClass85_4661 = new Class85(Class206.method1350(i_50_, 269173057));
				int i_56_ = 0;
				i_51_ = 0;
				for (int i_57_ = anInt4664; (i_57_ ^ 0xffffffff) >= (anInt4653 ^ 0xffffffff); i_57_++) {
					if ((i_57_ ^ 0xffffffff) > -1 || i_57_ >= ((Class210) class210_sub2).anInt2952)
						i_51_ += anInt4657 - anInt4646;
					else {
						int i_58_ = 0;
						for (int i_59_ = anInt4646; i_59_ <= anInt4657; i_59_++) {
							if (i_59_ >= 0 && (((Class210) class210_sub2).anInt2956 ^ 0xffffffff) < (i_59_ ^ 0xffffffff)) {
								int i_60_ = is[i_51_];
								int[] is_61_ = (((Class210_Sub2) class210_sub2).anIntArrayArrayArray4990[i_59_][i_57_]);
								int[] is_62_ = (((Class210_Sub2) class210_sub2).anIntArrayArrayArray4991[i_59_][i_57_]);
								if (is_61_ != null && (i_60_ ^ 0xffffffff) != -1) {
									if (i_60_ != 1) {
										if ((i_60_ ^ 0xffffffff) == -4) {
											method2043(0, 0, i_56_, -26291, i_58_, i_57_, i_59_);
											method2043((((Class210) class210_sub2).anInt2955), 0, i_56_, -26291, i_58_, i_57_, i_59_);
											method2043(0, (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
										} else if (i_60_ != 2) {
											if (i_60_ != 5) {
												if ((i_60_ ^ 0xffffffff) == -5) {
													method2043(0, (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
													method2043(0, 0, i_56_, -26291, i_58_, i_57_, i_59_);
													method2043((((Class210) class210_sub2).anInt2955), (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
												}
											} else {
												method2043((((Class210) class210_sub2).anInt2955), (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
												method2043(0, (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
												method2043((((Class210) class210_sub2).anInt2955), 0, i_56_, -26291, i_58_, i_57_, i_59_);
											}
										} else {
											method2043((((Class210) class210_sub2).anInt2955), 0, i_56_, -26291, i_58_, i_57_, i_59_);
											method2043((((Class210) class210_sub2).anInt2955), (((Class210) class210_sub2).anInt2955), i_56_, -26291, i_58_, i_57_, i_59_);
											method2043(0, 0, i_56_, -26291, i_58_, i_57_, i_59_);
										}
									} else {
										for (int i_63_ = 0; i_63_ < is_61_.length; i_63_++)
											method2043(is_61_[i_63_], is_62_[i_63_], i_56_, -26291, i_58_, i_57_, i_59_);
									}
								}
							}
							i_51_++;
							i_58_++;
						}
					}
					i_56_++;
				}
				anInterface1_4651 = (aClass260_Sub2_4655.method1955(125, ((BufferStream) aStream4648).position, false, ((BufferStream) aStream4648).buffer, 5123));
				anInterface10_4642 = (aClass260_Sub2_4655.method1960(0, ((BufferStream) aStream_Sub2_4659).position, ((BufferStream) aStream_Sub2_4659).buffer, false, 16));
				aClass160_4662 = new Class160(anInterface10_4642, 5126, 3, 0);
				aClass160_4660 = new Class160(anInterface10_4642, 5121, 4, 12);
			} else {
				aClass160_4660 = null;
				anInterface10_4642 = null;
				anInterface1_4651 = null;
				aClass160_4662 = null;
			}
			aClass85_4661 = null;
			aFloatArrayArray4643 = aFloatArrayArray4649 = aFloatArrayArray4652 = null;
			aStream4648 = null;
			aStream_Sub2_4659 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iu.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class210_sub2 != null ? "{...}" : "null") + ',' + (class246_sub41 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67(" days.", " Tage.", " jours.", " dias.");
	}
}
