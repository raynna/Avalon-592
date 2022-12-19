/* Class246_Sub28_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub12 extends Class246_Sub28 {
	private int anInt6191 = 0;
	static Class_l[] aClass_lArray6192;
	private int anInt6193 = 4096;
	static int anInt6194;
	static Class_fs aClass_fs6195;
	static int anInt6196;
	static int anInt6197;
	static int anInt6198;

	public static void method2598(int i) {
		try {
			aClass_fs6195 = null;
			if (i != 2)
				method2598(-36);
			aClass_lArray6192 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hm.A(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6196++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			int i_1_ = -99 % ((67 - i) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_2_ = this.method2133(i_0_, 0, 0);
				for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_3_++) {
					int i_4_ = is_2_[i_3_];
					if ((anInt6191 ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)) {
						if ((anInt6193 ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
							is[i_3_] = anInt6193;
						else
							is[i_3_] = i_4_;
					} else
						is[i_3_] = anInt6191;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hm.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2143(int i, int i_5_, BufferStream stream) {
		try {
			if (i != 4)
				method2139((byte) -72, 20);
			int i_6_ = i_5_;
			while_118_: do {
				do {
					if ((i_6_ ^ 0xffffffff) != -1) {
						if (i_6_ != 1) {
							if (i_6_ == 2)
								break;
							break while_118_;
						}
					} else {
						anInt6191 = stream.readUnsignedShort((byte) 93);
						break while_118_;
					}
					anInt6193 = stream.readUnsignedShort((byte) 114);
					break while_118_;
				} while (false);
				((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(i ^ 0xfb) ^ 0xffffffff) == -2;
			} while (false);
			anInt6198++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hm.G(" + i + ',' + i_5_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub28_Sub12() {
		super(1, false);
	}

	final int[][] method2139(byte i, int i_7_) {
		try {
			anInt6194++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 69, i_7_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_8_ = this.method2141(3, 0, i_7_);
				int[] is_9_ = is_8_[0];
				int[] is_10_ = is_8_[1];
				int[] is_11_ = is_8_[2];
				int[] is_12_ = is[0];
				int[] is_13_ = is[1];
				int[] is_14_ = is[2];
				for (int i_15_ = 0; Class246_Sub37_Sub1.f_gb > i_15_; i_15_++) {
					int i_16_ = is_9_[i_15_];
					int i_17_ = is_10_[i_15_];
					int i_18_ = is_11_[i_15_];
					if (anInt6191 <= i_16_) {
						if (i_16_ > anInt6193)
							is_12_[i_15_] = anInt6193;
						else
							is_12_[i_15_] = i_16_;
					} else
						is_12_[i_15_] = anInt6191;
					if (i_17_ < anInt6191)
						is_13_[i_15_] = anInt6191;
					else if ((anInt6193 ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
						is_13_[i_15_] = anInt6193;
					else
						is_13_[i_15_] = i_17_;
					if ((i_18_ ^ 0xffffffff) <= (anInt6191 ^ 0xffffffff)) {
						if (anInt6193 < i_18_)
							is_14_[i_15_] = anInt6193;
						else
							is_14_[i_15_] = i_18_;
					} else
						is_14_[i_15_] = anInt6191;
				}
			}
			if (i <= 33)
				aClass_fs6195 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hm.J(" + i + ',' + i_7_ + ')');
		}
	}
}
