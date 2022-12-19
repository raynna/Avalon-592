/* Class246_Sub28_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub10 extends Class246_Sub28 {
	static int anInt6153;
	static int anInt6154;
	static int anInt6155;
	static int anInt6156;
	static IncomingPacket aClass13_6157 = new IncomingPacket(24, 6);
	static int anInt6158;
	static boolean aBool6159 = false;

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6156++;
			int i_1_ = -98 / ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				for (int i_2_ = 0; Class246_Sub37_Sub1.f_gb > i_2_; i_2_++) {
					method2581(i_2_, i_0_, (byte) -17);
					int[] is_3_ = this.method2133(Class246_Sub28_Sub28.anInt6787, 0, 0);
					is[i_2_] = is_3_[Class234.anInt3190];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gs.E(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method2579(int i, int i_4_) {
		try {
			anInt6155++;
			Class246_Sub28_Sub33.anInt6968 = i_4_;
			Class246_Sub28_Sub4.anInt5975 = -1;
			Class74.anInt966 = 3;
			if (i < 116)
				method2579(25, -79);
			Class40_Sub5.anInt4918 = 100;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gs.A(" + i + ',' + i_4_ + ')');
		}
	}

	public Class246_Sub28_Sub10() {
		super(1, false);
	}

	public static void method2580(int i) {
		try {
			aClass13_6157 = null;
			int i_5_ = -1 % ((i + 53) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gs.B(" + i + ')');
		}
	}

	final int[][] method2139(byte i, int i_6_) {
		try {
			anInt6154++;
			if (i < 33)
				aBool6159 = true;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -122, i_6_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				for (int i_10_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
					method2581(i_10_, i_6_, (byte) -17);
					int[][] is_11_ = this.method2141(3, 0, Class246_Sub28_Sub28.anInt6787);
					is_7_[i_10_] = is_11_[0][Class234.anInt3190];
					is_8_[i_10_] = is_11_[1][Class234.anInt3190];
					is_9_[i_10_] = is_11_[2][Class234.anInt3190];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gs.J(" + i + ',' + i_6_ + ')');
		}
	}

	final void method2143(int i, int i_12_, BufferStream stream) {
		try {
			if (i == 4) {
				if (i_12_ == 0)
					((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
				anInt6158++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gs.G(" + i + ',' + i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2581(int i, int i_13_, byte i_14_) {
		try {
			anInt6153++;
			int i_15_ = Class187.anIntArray2654[i];
			int i_16_ = Class246_Sub1_Sub11.anIntArray6245[i_13_];
			if (i_14_ == -17) {
				float f = (float) Math.atan2((double) (-2048 + i_15_), (double) (-2048 + i_16_));
				if (!((double) f >= -3.141592653589793) || !((double) f <= -2.356194490192345)) {
					if (!((double) f <= -1.5707963267948966) || !((double) f >= -2.356194490192345)) {
						if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966) {
							Class234.anInt3190 = Class246_Sub37_Sub1.f_gb + -i_13_;
							Class246_Sub28_Sub28.anInt6787 = i;
						} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
							Class246_Sub28_Sub28.anInt6787 = Class141.anInt2044 + -i_13_;
							Class234.anInt3190 = i;
						} else if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
							if (!((double) f >= 0.7853981633974483) || !((double) f <= 1.5707963267948966)) {
								if (!((double) f >= 1.5707963267948966) || !((double) f <= 2.356194490192345)) {
									if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
										Class246_Sub28_Sub28.anInt6787 = i_13_;
										Class234.anInt3190 = -i + Class246_Sub37_Sub1.f_gb;
									}
								} else {
									Class234.anInt3190 = i_13_;
									Class246_Sub28_Sub28.anInt6787 = -i + Class141.anInt2044;
								}
							} else {
								Class234.anInt3190 = Class246_Sub37_Sub1.f_gb - i_13_;
								Class246_Sub28_Sub28.anInt6787 = -i + Class141.anInt2044;
							}
						} else {
							Class246_Sub28_Sub28.anInt6787 = -i_13_ + Class141.anInt2044;
							Class234.anInt3190 = -i + Class246_Sub37_Sub1.f_gb;
						}
					} else {
						Class246_Sub28_Sub28.anInt6787 = i;
						Class234.anInt3190 = i_13_;
					}
				} else {
					Class234.anInt3190 = i;
					Class246_Sub28_Sub28.anInt6787 = i_13_;
				}
				Class234.anInt3190 &= Class63_Sub1.anInt4719;
				Class246_Sub28_Sub28.anInt6787 &= Class113.anInt1594;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gs.C(" + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}
}
