/* Class246_Sub28_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub33 extends Class246_Sub28 {
	static Class243 aClass243_6959 = new Class243();
	static int anInt6960;
	private int anInt6961 = 409;
	static int anInt6962;
	static int anInt6963;
	static int anInt6964;
	private int anInt6965;
	private int[] anIntArray6966 = new int[3];
	static Interface6 anInterface6_6967;
	static int anInt6968 = -1;
	private int anInt6969;
	private int anInt6970;

	public static void method2860(int i) {
		try {
			anInterface6_6967 = null;
			if (i == 3)
				aClass243_6959 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ug.B(" + i + ')');
		}
	}

	public Class246_Sub28_Sub33() {
		super(1, false);
		anInt6965 = 4096;
		anInt6969 = 4096;
		anInt6970 = 4096;
	}

	static final int method2861(boolean bool, int i, boolean bool_0_) {
		try {
			anInt6964++;
			if (bool)
				return 0;
			Class246_Sub18 class246_sub18 = Class95.method610(63, bool, i);
			if (class246_sub18 == null)
				return (((Class246_Sub1_Sub2) HashMap.aClass61_774.method416(5, i)).anInt5697);
			int i_1_ = 0;
			for (int i_2_ = 0; ((((Class246_Sub18) class246_sub18).anIntArray4682.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
				if ((((Class246_Sub18) class246_sub18).anIntArray4682[i_2_] ^ 0xffffffff) == 0)
					i_1_++;
			}
			if (bool_0_ != true)
				aClass243_6959 = null;
			i_1_ += ((((Class246_Sub1_Sub2) HashMap.aClass61_774.method416(5, i)).anInt5697) + -(((Class246_Sub18) class246_sub18).anIntArray4682).length);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ug.A(" + bool + ',' + i + ',' + bool_0_ + ')'));
		}
	}

	final int[][] method2139(byte i, int i_3_) {
		try {
			anInt6962++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -105, i_3_);
			if (i <= 33)
				aClass243_6959 = null;
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_4_ = this.method2141(3, 0, i_3_);
				int[] is_5_ = is_4_[0];
				int[] is_6_ = is_4_[1];
				int[] is_7_ = is_4_[2];
				int[] is_8_ = is[0];
				int[] is_9_ = is[1];
				int[] is_10_ = is[2];
				for (int i_11_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
					int i_12_ = is_5_[i_11_];
					int i_13_ = i_12_ - anIntArray6966[0];
					if ((i_13_ ^ 0xffffffff) > -1)
						i_13_ = -i_13_;
					if (anInt6961 < i_13_) {
						is_8_[i_11_] = i_12_;
						is_9_[i_11_] = is_6_[i_11_];
						is_10_[i_11_] = is_7_[i_11_];
					} else {
						int i_14_ = is_6_[i_11_];
						i_13_ = i_14_ + -anIntArray6966[1];
						if ((i_13_ ^ 0xffffffff) > -1)
							i_13_ = -i_13_;
						if (anInt6961 < i_13_) {
							is_8_[i_11_] = i_12_;
							is_9_[i_11_] = i_14_;
							is_10_[i_11_] = is_7_[i_11_];
						} else {
							int i_15_ = is_7_[i_11_];
							i_13_ = i_15_ + -anIntArray6966[2];
							if ((i_13_ ^ 0xffffffff) > -1)
								i_13_ = -i_13_;
							if ((anInt6961 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
								is_8_[i_11_] = i_12_;
								is_9_[i_11_] = i_14_;
								is_10_[i_11_] = i_15_;
							} else {
								is_8_[i_11_] = anInt6965 * i_12_ >> 12;
								is_9_[i_11_] = i_14_ * anInt6969 >> 12;
								is_10_[i_11_] = anInt6970 * i_15_ >> 12;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ug.J(" + i + ',' + i_3_ + ')');
		}
	}

	static final void method2862(int i, int i_16_, byte[] is, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, byte[] is_22_) {
		try {
			anInt6963++;
			int i_23_ = -(i_17_ >> 2);
			i_17_ = -(0x3 & i_17_);
			if (i_20_ != -1)
				anInterface6_6967 = null;
			for (int i_24_ = -i; (i_24_ ^ 0xffffffff) > -1; i_24_++) {
				for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
					is[i_16_++] += is_22_[i_18_++];
					is[i_16_++] += is_22_[i_18_++];
					is[i_16_++] += is_22_[i_18_++];
					is[i_16_++] += is_22_[i_18_++];
				}
				for (int i_26_ = i_17_; i_26_ < 0; i_26_++)
					is[i_16_++] += is_22_[i_18_++];
				i_16_ += i_21_;
				i_18_ += i_19_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ug.C(" + i + ',' + i_16_ + ',' + (is != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + (is_22_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2143(int i, int i_27_, BufferStream stream) {
		while_47_: do {
			try {
				if (i == 4) {
					anInt6960++;
					int i_28_ = i_27_;
					while_46_: do {
						while_45_: do {
							while_44_: do {
								do {
									if (i_28_ != 0) {
										if ((i_28_ ^ 0xffffffff) == -2)
											break;
										if (i_28_ == 2)
											break while_44_;
										if (i_28_ == 3)
											break while_45_;
										if (i_28_ != 4)
											break while_47_;
										if (!client.f_ob)
											break while_46_;
									}
									anInt6961 = stream.readUnsignedShort((byte) -96);
									return;
								} while (false);
								anInt6970 = stream.readUnsignedShort((byte) -122);
								return;
							} while (false);
							anInt6969 = stream.readUnsignedShort((byte) -62);
							return;
						} while (false);
						anInt6965 = stream.readUnsignedShort((byte) 101);
						return;
					} while (false);
					int i_29_ = stream.read24BitInteger((byte) 29);
					anIntArray6966[1] = PacketsDecoder.method184(65280, i_29_) >> 4;
					anIntArray6966[0] = PacketsDecoder.method184(i_29_, 16711680) << 4;
					anIntArray6966[2] = PacketsDecoder.method184(i_29_, 255) >> 12;
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ug.G(" + i + ',' + i_27_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}
}
