/* Class246_Sub28_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub29 extends Class246_Sub28 {
	static int anInt6813;
	static int anInt6814;
	static int[] anIntArray6815;
	static int anInt6816;
	static boolean[] aBoolArray6817 = new boolean[5];
	static int anInt6818;
	static int anInt6819;
	static Class_l[] aClass_lArray6820;

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				if ((i_0_ ^ 0xffffffff) == -1)
					((Class246_Sub28) this).aBool4947 = stream.readUnsignedByte(255) == 1;
				anInt6818++;
				if (i == 4)
					break;
				aBoolArray6817 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rh.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method2818(int i, int i_1_, int i_2_, int i_3_) {
		if (!Class246_Sub13.method1988(i, i_1_, i_2_))
			return false;
		int i_4_ = i_1_ << Class126.anInt1781;
		int i_5_ = i_2_ << Class126.anInt1781;
		if (Class160.method1060(i_4_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_1_, i_2_) + i_3_, i_5_ + 1) && Class160.method1060(i_4_ + Class246_Sub1.anInt3744 - 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_1_ + 1, i_2_) + i_3_, i_5_ + 1) && Class160.method1060(i_4_ + Class246_Sub1.anInt3744 - 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_1_ + 1, i_2_ + 1) + i_3_, i_5_ + Class246_Sub1.anInt3744 - 1) && Class160.method1060(i_4_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_1_, i_2_ + 1) + i_3_, i_5_ + Class246_Sub1.anInt3744 - 1))
			return true;
		return false;
	}

	public Class246_Sub28_Sub29() {
		super(3, false);
	}

	public static void method2819(int i) {
		do {
			try {
				anIntArray6815 = null;
				aClass_lArray6820 = null;
				aBoolArray6817 = null;
				if (i <= -83)
					break;
				aBoolArray6817 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rh.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_6_) {
		try {
			int i_7_ = 70 / ((i - 67) / 50);
			anInt6819++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_6_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_8_ = this.method2133(i_6_, 0, 0);
				int[] is_9_ = this.method2133(i_6_, 1, 0);
				int[] is_10_ = this.method2133(i_6_, 2, 0);
				for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_11_++) {
					int i_12_ = is_10_[i_11_];
					if ((i_12_ ^ 0xffffffff) != -4097) {
						if ((i_12_ ^ 0xffffffff) == -1)
							is[i_11_] = is_9_[i_11_];
						else
							is[i_11_] = (i_12_ * is_8_[i_11_] + is_9_[i_11_] * (4096 - i_12_)) >> 12;
					} else
						is[i_11_] = is_8_[i_11_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rh.E(" + i + ',' + i_6_ + ')');
		}
	}

	static final int method2820(boolean bool, int i, int i_13_, int i_14_) {
		try {
			if (bool != true)
				return 29;
			anInt6813++;
			i = (i_13_ * (i & 0xff00) & 0xff0000 | ~0xff00ff & (i & 0xff00ff) * i_13_) >>> 8;
			int i_15_ = -i_13_ + 255;
			return (((0xff0000 & i_15_ * (i_14_ & 0xff00) | i_15_ * (0xff00ff & i_14_) & ~0xff00ff) >>> 8) - -i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rh.C(" + bool + ',' + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int[][] method2139(byte i, int i_16_) {
		try {
			if (i < 33)
				return null;
			anInt6816++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 79, i_16_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[] is_17_ = this.method2133(i_16_, 2, 0);
				int[][] is_18_ = this.method2141(3, 0, i_16_);
				int[][] is_19_ = this.method2141(3, 1, i_16_);
				int[] is_20_ = is[0];
				int[] is_21_ = is[1];
				int[] is_22_ = is[2];
				int[] is_23_ = is_18_[0];
				int[] is_24_ = is_18_[1];
				int[] is_25_ = is_18_[2];
				int[] is_26_ = is_19_[0];
				int[] is_27_ = is_19_[1];
				int[] is_28_ = is_19_[2];
				for (int i_29_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
					int i_30_ = is_17_[i_29_];
					if ((i_30_ ^ 0xffffffff) != -4097) {
						if (i_30_ == 0) {
							is_20_[i_29_] = is_26_[i_29_];
							is_21_[i_29_] = is_27_[i_29_];
							is_22_[i_29_] = is_28_[i_29_];
						} else {
							int i_31_ = 4096 + -i_30_;
							is_20_[i_29_] = (i_31_ * is_26_[i_29_] + i_30_ * is_23_[i_29_]) >> 12;
							is_21_[i_29_] = (is_24_[i_29_] * i_30_ - -(i_31_ * is_27_[i_29_])) >> 12;
							is_22_[i_29_] = (i_31_ * is_28_[i_29_] + is_25_[i_29_] * i_30_) >> 12;
						}
					} else {
						is_20_[i_29_] = is_23_[i_29_];
						is_21_[i_29_] = is_24_[i_29_];
						is_22_[i_29_] = is_25_[i_29_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rh.J(" + i + ',' + i_16_ + ')');
		}
	}

	static {
		anInt6814 = 1407;
		anIntArray6815 = new int[1024];
	}
}
