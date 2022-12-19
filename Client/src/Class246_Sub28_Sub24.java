/* Class246_Sub28_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub24 extends Class246_Sub28 {
	static int anInt6672;
	static boolean[] aBoolArray6673 = new boolean[100];
	static int anInt6674;
	static int anInt6675;
	static boolean aBool6676 = false;
	static int anInt6677;
	static int anInt6678;
	static int anInt6679;
	static int anInt6680;
	static int anInt6681;

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6674++;
				if (i != 4)
					anInt6681 = -33;
				if (i_0_ != 0)
					break;
				((Class246_Sub28) this).aBool4947 = (stream.readUnsignedByte(i + 251) ^ 0xffffffff) == -2;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nh.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2736(byte i) {
		try {
			if (i != -32)
				anInt6681 = -122;
			aBoolArray6673 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nh.A(" + i + ')');
		}
	}

	public Class246_Sub28_Sub24() {
		super(1, false);
	}

	static final void method2737(int i) {
		try {
			if (Class246_Sub28_Sub34.method2872(true)) {
				if (Class55.aStringArray786 == null)
					Class109_Sub2.method1790(-115);
				Class39.aBool572 = true;
				Class_q_Sub1.anInt6670 = 0;
				try {
					Class246_Sub28_Sub30.aClipboard6876 = CS2Script.aclient5668.getToolkit().getSystemClipboard();
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (i >= -59)
				method2737(-10);
			anInt6679++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nh.H(" + i + ')');
		}
	}

	static final int method2738(byte i, int i_1_, int i_2_) {
		try {
			anInt6677++;
			int i_3_ = 57 * i_1_ + i_2_;
			if (i < 117)
				anInt6681 = 7;
			i_3_ = i_3_ << 13 ^ i_3_;
			int i_4_ = ((789221 + i_3_ * (i_3_ * 15731)) * i_3_ - -1376312589 & 0x7fffffff);
			return (0x7ff8532 & i_4_) >> 19;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nh.B(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int[][] method2139(byte i, int i_5_) {
		try {
			anInt6680++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -124, i_5_);
			if (i <= 33)
				method2737(111);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_6_ = this.method2141(3, 0, i_5_);
				int[] is_7_ = is_6_[0];
				int[] is_8_ = is_6_[1];
				int[] is_9_ = is_6_[2];
				int[] is_10_ = is[0];
				int[] is_11_ = is[1];
				int[] is_12_ = is[2];
				for (int i_13_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
					is_10_[i_13_] = 4096 + -is_7_[i_13_];
					is_11_[i_13_] = -is_8_[i_13_] + 4096;
					is_12_[i_13_] = -is_9_[i_13_] + 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nh.J(" + i + ',' + i_5_ + ')');
		}
	}

	static final void method2739(int i, Class210 class210) {
		Class59_Sub3_Sub4.aClass210Array6993[i] = class210;
	}

	final int[] method2135(int i, int i_14_) {
		try {
			int i_15_ = 106 % ((67 - i) / 50);
			anInt6672++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_14_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_16_ = this.method2133(i_14_, 0, 0);
				for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_17_++)
					is[i_17_] = 4096 - is_16_[i_17_];
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nh.E(" + i + ',' + i_14_ + ')');
		}
	}

	static final void method2740(byte i, int i_18_) {
		try {
			anInt6678++;
			if ((i_18_ ^ 0xffffffff) != (Class74.anInt980 ^ 0xffffffff)) {
				Class38_Sub1_Sub1.anInt6770 = Class152.anInt2205 = Class39_Sub1.f_gb[i_18_];
				Class246_Sub19.method2070(17569);
				Class172.anIntArrayArrayArray2431 = (new int[4][Class38_Sub1_Sub1.anInt6770 >> 3][Class152.anInt2205 >> 3]);
				Class24.anIntArrayArray348 = new int[Class38_Sub1_Sub1.anInt6770][Class152.anInt2205];
				Class246_Sub6.anIntArrayArray3944 = new int[Class38_Sub1_Sub1.anInt6770][Class152.anInt2205];
				for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -5; i_19_++)
					Class95.aClass199Array1235[i_19_] = Class256.method1664((byte) -118, Class152.anInt2205, Class38_Sub1_Sub1.anInt6770);
				Class5.aByteArrayArrayArray56 = (new byte[4][Class38_Sub1_Sub1.anInt6770][Class152.anInt2205]);
				Class_ss.method2883(0, Class152.anInt2205, Class38_Sub1_Sub1.anInt6770, 4);
				Class136.method925(Class152.anInt2205 >> 3, Class246_Sub15.aClass260_4445, Class38_Sub1_Sub1.anInt6770 >> 3, 125);
				int i_20_ = 121 % ((i + 14) / 51);
				Class74.anInt980 = i_18_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nh.D(" + i + ',' + i_18_ + ')');
		}
	}
}
