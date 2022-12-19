/* Stream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Stream_Sub1 extends BufferStream {
	static int anInt5851;
	static int anInt5852;
	private ISAAC aClass42_5853;
	static int anInt5854;
	static int anInt5855 = 0;
	static int anInt5856;
	static int anInt5857;
	static int anInt5858;
	static int anInt5859;
	static int anInt5860;
	static int anInt5861;
	static Class110 aClass110_5862;
	static int anInt5863;
	private int anInt5864;
	static int anInt5865;

	final void method2473(int i, int i_0_, int i_1_, byte[] is) {
		try {
			int i_2_ = 36 % ((i + 41) / 58);
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_3_++)
				is[i_1_ + i_3_] = (byte) ((((BufferStream) this).buffer[((BufferStream) this).position++]) + -aClass42_5853.method291((byte) -85));
			anInt5856++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cw.CC(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2474(int i, int i_4_) {
		do {
			try {
				anInt5865++;
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i + aClass42_5853.method291((byte) -127));
				if (i_4_ == 13127)
					break;
				method2477(-86);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cw.FC(" + i + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	static final void method2475(int i) {
		try {
			Class246_Sub28_Sub24.method2740((byte) 46, (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt581));
			anInt5859++;
			int i_5_ = ((Class39_Sub1.anInt4670 >> 3) + (Class246_Sub16.aInt92 >> 10));
			int i_6_ = (Class47.anInt686 >> 3) + (Class259_Sub1.anInt4509 >> 10);
			Class246_Sub28_Sub24.anInt6681 = ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053 = (byte) 0;
			Class_a.aClass_r_Sub1_1180.method2913(8, i ^ i, 8);
			int i_7_ = 18;
			Class246_Sub5.aByteArrayArray3885 = new byte[i_7_][];
			Class121.anIntArray1673 = new int[i_7_];
			Class189.anIntArray2674 = new int[i_7_];
			Class59_Sub1_Sub3.aByteArrayArray6347 = new byte[i_7_][];
			Class247.aByteArrayArray3478 = new byte[i_7_][];
			Class211_Sub1.aByteArrayArray5353 = new byte[i_7_][];
			Class_t.anIntArrayArray1441 = new int[i_7_][4];
			Class95.anIntArray1251 = new int[i_7_];
			Class246_Sub1_Sub7.anIntArray6032 = new int[i_7_];
			Class168.anIntArray2398 = new int[i_7_];
			Class101.anIntArray1317 = new int[i_7_];
			Class134.aByteArrayArray1853 = new byte[i_7_][];
			i_7_ = 0;
			for (int i_8_ = (-(Class38_Sub1_Sub1.anInt6770 >> 4) + i_5_) / 8; ((i_8_ ^ 0xffffffff) >= ((i_5_ + (Class38_Sub1_Sub1.anInt6770 >> 4)) / 8 ^ 0xffffffff)); i_8_++) {
				for (int i_9_ = (-(Class152.anInt2205 >> 4) + i_6_) / 8; ((((Class152.anInt2205 >> 4) + i_6_) / 8 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)); i_9_++) {
					int i_10_ = i_9_ + (i_8_ << 8);
					Class168.anIntArray2398[i_7_] = i_10_;
					Class121.anIntArray1673[i_7_] = Class246_Sub7.index5.method86("m" + i_8_ + "_" + i_9_, (byte) 107);
					Class189.anIntArray2674[i_7_] = Class246_Sub7.index5.method86("l" + i_8_ + "_" + i_9_, (byte) -112);
					Class95.anIntArray1251[i_7_] = Class246_Sub7.index5.method86("n" + i_8_ + "_" + i_9_, (byte) -110);
					Class246_Sub1_Sub7.anIntArray6032[i_7_] = Class246_Sub7.index5.method86("um" + i_8_ + "_" + i_9_, (byte) 53);
					Class101.anIntArray1317[i_7_] = Class246_Sub7.index5.method86("ul" + i_8_ + "_" + i_9_, (byte) 123);
					if ((Class95.anIntArray1251[i_7_] ^ 0xffffffff) == 0) {
						Class121.anIntArray1673[i_7_] = -1;
						Class189.anIntArray2674[i_7_] = -1;
						Class246_Sub1_Sub7.anIntArray6032[i_7_] = -1;
						Class101.anIntArray1317[i_7_] = -1;
					}
					i_7_++;
				}
			}
			for (int i_11_ = i_7_; ((i_11_ ^ 0xffffffff) > (Class95.anIntArray1251.length ^ 0xffffffff)); i_11_++) {
				Class95.anIntArray1251[i_11_] = -1;
				Class121.anIntArray1673[i_11_] = -1;
				Class189.anIntArray2674[i_11_] = -1;
				Class246_Sub1_Sub7.anIntArray6032[i_11_] = -1;
				Class101.anIntArray1317[i_11_] = -1;
			}
			Class170.method1125(true, (byte) 104, i_6_, i_5_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.EC(" + i + ')');
		}
	}

	Stream_Sub1(int i) {
		super(i);
	}

	final void method2476(byte i) {
		try {
			int i_12_ = 14 % ((-17 - i) / 47);
			anInt5861++;
			((BufferStream) this).position = (anInt5864 + 7) / 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.BC(" + i + ')');
		}
	}

	final void method2477(int i) {
		try {
			anInt5858++;
			if (i != -934)
				anInt5864 = 78;
			anInt5864 = ((BufferStream) this).position * 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.DC(" + i + ')');
		}
	}

	final int method2478(int i, int i_13_) {
		try {
			if (i != 8)
				return -43;
			anInt5863++;
			return i_13_ * 8 - anInt5864;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.VB(" + i + ',' + i_13_ + ')');
		}
	}

	public static void method2479(boolean bool) {
		try {
			if (bool != false)
				method2483(null, (byte) 43);
			aClass110_5862 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.SB(" + bool + ')');
		}
	}

	final void method2480(int[] is, int i) {
		try {
			anInt5851++;
			if (i != -938442011)
				aClass110_5862 = null;
			aClass42_5853 = new ISAAC(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.WB(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method2481(int i) {
		try {
			anInt5857++;
			int i_14_ = (((BufferStream) this).buffer[((BufferStream) this).position++] - aClass42_5853.method291((byte) -102)) & 0xff;
			if (i != 1941438248)
				return 47;
			if ((i_14_ ^ 0xffffffff) > -129)
				return i_14_;
			return (((((BufferStream) this).buffer[((BufferStream) this).position++] - aClass42_5853.method291((byte) -107)) & 0xff) + (-128 + i_14_ << 8));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.AC(" + i + ')');
		}
	}

	final boolean method2482(int i) {
		try {
			anInt5852++;
			if (i != -6742)
				anInt5855 = -30;
			int i_15_ = ((((BufferStream) this).buffer[((BufferStream) this).position] - aClass42_5853.method293(i + 855265080)) & 0xff);
			if ((i_15_ ^ 0xffffffff) > -129)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.TB(" + i + ')');
		}
	}

	static final void method2483(Class235 class235, byte i) {
		do {
			try {
				if (i != -109)
					method2483(null, (byte) 67);
				anInt5860++;
				if (((Class235) class235).f_bb != Class130_Sub6.anInt4841)
					break;
				Class246_Sub39.aBoolArray5488[((Class235) class235).anInt3297] = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("cw.RB(" + (class235 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int readBits(int i, int i_16_) {
		try {
			anInt5854++;
			int i_17_ = anInt5864 >> 3;
			int i_18_ = 8 + -(anInt5864 & 0x7);
			int i_19_ = 0;
			anInt5864 += i_16_;
			if (i >= -46)
				aClass110_5862 = null;
			for (/**/; i_18_ < i_16_; i_18_ = 8) {
				i_19_ += (((BufferStream) this).buffer[i_17_++] & Class9.anIntArray107[i_18_]) << -i_18_ + i_16_;
				i_16_ -= i_18_;
			}
			if ((i_16_ ^ 0xffffffff) == (i_18_ ^ 0xffffffff))
				i_19_ += (((BufferStream) this).buffer[i_17_] & Class9.anIntArray107[i_18_]);
			else
				i_19_ += (((BufferStream) this).buffer[i_17_] >> -i_16_ + i_18_ & Class9.anIntArray107[i_16_]);
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cw.UB(" + i + ',' + i_16_ + ')');
		}
	}
}
