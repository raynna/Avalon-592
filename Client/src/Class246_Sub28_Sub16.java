/* Class246_Sub28_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub16 extends Class246_Sub28 {
	static Class101 aClass101_6394 = new Class101("runescape", 0);
	static int anInt6395;
	static int anInt6396;
	static int anInt6397;
	static int anInt6398;
	private int anInt6399;
	private int anInt6400;
	static Class_fs index9;
	static int anInt6402;
	private int anInt6403 = -1;
	private int[] anIntArray6404;

	public Class246_Sub28_Sub16() {
		super(0, false);
	}

	public static void method2656(int i) {
		try {
			aClass101_6394 = null;
			int i_0_ = -119 % ((i + 66) / 38);
			index9 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jt.A(" + i + ')');
		}
	}

	final void method2142(int i) {
		try {
			super.method2142(127);
			if (i <= 120)
				anInt6399 = -42;
			anInt6395++;
			anIntArray6404 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jt.O(" + i + ')');
		}
	}

	final void method2143(int i, int i_1_, BufferStream stream) {
		try {
			if (i == 4) {
				if ((i_1_ ^ 0xffffffff) == -1)
					anInt6403 = stream.readUnsignedShort((byte) -122);
				anInt6396++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jt.G(" + i + ',' + i_1_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2137(int i) {
		try {
			if (i != 3)
				method2142(89);
			anInt6398++;
			return anInt6403;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jt.P(" + i + ')');
		}
	}

	final void method2138(int i, byte i_2_, int i_3_) {
		do {
			try {
				super.method2138(i, i_2_, i_3_);
				anInt6402++;
				if ((anInt6403 ^ 0xffffffff) > -1 || Class79_Sub1.anInterface6_5163 == null)
					break;
				int i_4_ = (((Class238) Class79_Sub1.anInterface6_5163.method17(-31305, anInt6403)).aBool3335 ? 64 : 128);
				anIntArray6404 = Class79_Sub1.anInterface6_5163.method14(false, 5754, anInt6403, 1.0F, i_4_, i_4_);
				anInt6400 = i_4_;
				anInt6399 = i_4_;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jt.R(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method2139(byte i, int i_5_) {
		try {
			anInt6397++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 117, i_5_);
			if (i <= 33)
				anInt6400 = -43;
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int i_6_ = (((Class141.anInt2044 ^ 0xffffffff) == (anInt6400 ^ 0xffffffff) ? i_5_ : i_5_ * anInt6400 / Class141.anInt2044) * anInt6399);
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				if ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) == (anInt6399 ^ 0xffffffff)) {
					for (int i_10_ = 0; Class246_Sub37_Sub1.f_gb > i_10_; i_10_++) {
						int i_11_ = anIntArray6404[i_6_++];
						is_9_[i_10_] = PacketsDecoder.method184(i_11_ << 4, 4080);
						is_8_[i_10_] = PacketsDecoder.method184(65280, i_11_) >> 4;
						is_7_[i_10_] = PacketsDecoder.method184(i_11_ >> 12, 4080);
					}
				} else {
					for (int i_12_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						int i_13_ = i_12_ * anInt6399 / Class246_Sub37_Sub1.f_gb;
						int i_14_ = anIntArray6404[i_13_ + i_6_];
						is_9_[i_12_] = PacketsDecoder.method184(i_14_ << 4, 4080);
						is_8_[i_12_] = PacketsDecoder.method184(i_14_ >> 4, 4080);
						is_7_[i_12_] = PacketsDecoder.method184(i_14_ >> 12, 4080);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jt.J(" + i + ',' + i_5_ + ')');
		}
	}
}
