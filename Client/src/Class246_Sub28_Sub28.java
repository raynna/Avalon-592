/* Class246_Sub28_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub28 extends Class246_Sub28 {
	static int anInt6786;
	static int anInt6787 = 0;
	private int anInt6788 = 1;
	static int anInt6789;
	static int anInt6790;
	static int anInt6791;
	static int anInt6792;
	private int anInt6793 = 1;

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6786++;
				int i_1_ = i_0_;
				while_117_: do {
					do {
						if ((i_1_ ^ 0xffffffff) != -1) {
							if ((i_1_ ^ 0xffffffff) != -2) {
								if (i_1_ == 2)
									break;
								break while_117_;
							}
						} else {
							anInt6793 = stream.readUnsignedByte(255);
							break while_117_;
						}
						anInt6788 = stream.readUnsignedByte(i ^ 0xfb);
						break while_117_;
					} while (false);
					((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(i + 251) ^ 0xffffffff) == -2;
				} while (false);
				if (i == 4)
					break;
				anInt6788 = 84;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rc.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class246_Sub28_Sub28() {
		super(1, false);
	}

	static final boolean method2812(int i, Class235 class235) {
		try {
			anInt6790++;
			int i_2_ = -105 / ((i - 71) / 50);
			if ((((Class235) class235).anInt3280 ^ 0xffffffff) == (Class141.anInt2046 ^ 0xffffffff)) {
				Class246_Sub1_Sub7.anInt6030 = 250;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rc.B(" + i + ',' + (class235 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method2139(byte i, int i_3_) {
		try {
			anInt6791++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 19, i_3_);
			if (i <= 33)
				anInt6793 = 103;
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int i_4_ = 1 + (anInt6788 + anInt6788);
				int i_5_ = 65536 / i_4_;
				int i_6_ = anInt6793 + anInt6793 + 1;
				int i_7_ = 65536 / i_6_;
				int[][][] is_8_ = new int[i_4_][][];
				for (int i_9_ = i_3_ - anInt6788; (i_9_ ^ 0xffffffff) >= (i_3_ + anInt6788 ^ 0xffffffff); i_9_++) {
					int[][] is_10_ = this.method2141(3, 0, Class113.anInt1594 & i_9_);
					int[][] is_11_ = new int[3][Class246_Sub37_Sub1.f_gb];
					int i_12_ = 0;
					int i_13_ = 0;
					int i_14_ = 0;
					int[] is_15_ = is_10_[0];
					int[] is_16_ = is_10_[1];
					int[] is_17_ = is_10_[2];
					for (int i_18_ = -anInt6793; (anInt6793 ^ 0xffffffff) <= (i_18_ ^ 0xffffffff); i_18_++) {
						int i_19_ = i_18_ & Class63_Sub1.anInt4719;
						i_12_ += is_15_[i_19_];
						i_13_ += is_16_[i_19_];
						i_14_ += is_17_[i_19_];
					}
					int[] is_20_ = is_11_[0];
					int[] is_21_ = is_11_[1];
					int[] is_22_ = is_11_[2];
					int i_23_ = 0;
					while ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_23_ ^ 0xffffffff)) {
						is_20_[i_23_] = i_12_ * i_7_ >> 16;
						is_21_[i_23_] = i_7_ * i_13_ >> 16;
						is_22_[i_23_] = i_7_ * i_14_ >> 16;
						int i_24_ = Class63_Sub1.anInt4719 & i_23_ + -anInt6793;
						i_13_ -= is_16_[i_24_];
						i_12_ -= is_15_[i_24_];
						i_23_++;
						i_14_ -= is_17_[i_24_];
						i_24_ = Class63_Sub1.anInt4719 & i_23_ + anInt6793;
						i_12_ += is_15_[i_24_];
						i_14_ += is_17_[i_24_];
						i_13_ += is_16_[i_24_];
					}
					is_8_[i_9_ + (anInt6788 - i_3_)] = is_11_;
				}
				int[] is_25_ = is[0];
				int[] is_26_ = is[1];
				int[] is_27_ = is[2];
				for (int i_28_ = 0; ((i_28_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_28_++) {
					int i_29_ = 0;
					int i_30_ = 0;
					int i_31_ = 0;
					for (int i_32_ = 0; (i_4_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
						int[][] is_33_ = is_8_[i_32_];
						i_30_ += is_33_[1][i_28_];
						i_31_ += is_33_[2][i_28_];
						i_29_ += is_33_[0][i_28_];
					}
					is_25_[i_28_] = i_29_ * i_5_ >> 16;
					is_26_[i_28_] = i_30_ * i_5_ >> 16;
					is_27_[i_28_] = i_31_ * i_5_ >> 16;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rc.J(" + i + ',' + i_3_ + ')');
		}
	}

	static final Class110 method2813(int i) {
		try {
			anInt6789++;
			if (i >= -28)
				method2812(-117, null);
			try {
				return new Class110_Sub3();
			} catch (Throwable throwable) {
				try {
					return (Class110) Class.forName("Class110_Sub1").newInstance();
				} catch (Throwable throwable_34_) {
					return new Class110_Sub2();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rc.A(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_35_) {
		try {
			anInt6792++;
			int i_36_ = 55 % ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_35_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_37_ = 1 + (anInt6788 + anInt6788);
				int i_38_ = 65536 / i_37_;
				int i_39_ = anInt6793 + (anInt6793 + 1);
				int i_40_ = 65536 / i_39_;
				int[][] is_41_ = new int[i_37_][];
				for (int i_42_ = -anInt6788 + i_35_; (i_35_ - -anInt6788 ^ 0xffffffff) <= (i_42_ ^ 0xffffffff); i_42_++) {
					int[] is_43_ = this.method2133(Class113.anInt1594 & i_42_, 0, 0);
					int[] is_44_ = new int[Class246_Sub37_Sub1.f_gb];
					int i_45_ = 0;
					for (int i_46_ = -anInt6793; anInt6793 >= i_46_; i_46_++)
						i_45_ += is_43_[i_46_ & Class63_Sub1.anInt4719];
					int i_47_ = 0;
					while (i_47_ < Class246_Sub37_Sub1.f_gb) {
						is_44_[i_47_] = i_45_ * i_40_ >> 16;
						i_45_ -= is_43_[(-anInt6793 + i_47_ & Class63_Sub1.anInt4719)];
						i_47_++;
						i_45_ += is_43_[(Class63_Sub1.anInt4719 & anInt6793 + i_47_)];
					}
					is_41_[i_42_ + anInt6788 - i_35_] = is_44_;
				}
				for (int i_48_ = 0; ((i_48_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_48_++) {
					int i_49_ = 0;
					for (int i_50_ = 0; i_50_ < i_37_; i_50_++)
						i_49_ += is_41_[i_50_][i_48_];
					is[i_48_] = i_38_ * i_49_ >> 16;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rc.E(" + i + ',' + i_35_ + ')');
		}
	}
}
