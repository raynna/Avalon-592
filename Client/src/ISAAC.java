/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ISAAC {
	private int anInt620;
	static int anInt621;
	private int anInt622;
	static int anInt623;
	static IncomingPacket SEND_IGNORES_LIST_PACKET = new IncomingPacket(35, -2);
	static Class81 aClass81_625;
	static int anInt626;
	static int anInt627;
	static int anInt628 = 0;
	private int[] anIntArray629;
	private int anInt630;
	private int anInt631;
	private int[] anIntArray632;
	static int anInt633;
	static Class_fs index2;

	public static void method288(int i) {
		try {
			if (i != 1049069386)
				SEND_IGNORES_LIST_PACKET = null;
			SEND_IGNORES_LIST_PACKET = null;
			aClass81_625 = null;
			index2 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.F(" + i + ')');
		}
	}

	private final void method289(byte i) {
		try {
			anInt621++;
			if (i < -31) {
				int i_1_;
				int i_2_;
				int i_3_;
				int i_4_;
				int i_5_;
				int i_6_;
				int i_7_;
				int i_0_ = (i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = -1640531527);
				for (int i_8_ = 0; i_8_ < 4; i_8_++) {
					i_0_ ^= i_1_ << 11;
					i_3_ += i_0_;
					i_1_ += i_2_;
					i_1_ ^= i_2_ >>> 2;
					i_2_ += i_3_;
					i_4_ += i_1_;
					i_2_ ^= i_3_ << 8;
					i_5_ += i_2_;
					i_3_ += i_4_;
					i_3_ ^= i_4_ >>> 16;
					i_6_ += i_3_;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 10;
					i_5_ += i_6_;
					i_7_ += i_4_;
					i_5_ ^= i_6_ >>> 4;
					i_6_ += i_7_;
					i_0_ += i_5_;
					i_6_ ^= i_7_ << 8;
					i_7_ += i_0_;
					i_1_ += i_6_;
					i_7_ ^= i_0_ >>> 9;
					i_0_ += i_1_;
					i_2_ += i_7_;
				}
				for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
					i_2_ += anIntArray632[2 + i_9_];
					i_7_ += anIntArray632[7 + i_9_];
					i_5_ += anIntArray632[i_9_ + 5];
					i_4_ += anIntArray632[4 + i_9_];
					i_6_ += anIntArray632[6 + i_9_];
					i_3_ += anIntArray632[3 + i_9_];
					i_0_ += anIntArray632[i_9_];
					i_1_ += anIntArray632[i_9_ + 1];
					i_0_ ^= i_1_ << 11;
					i_3_ += i_0_;
					i_1_ += i_2_;
					i_1_ ^= i_2_ >>> 2;
					i_2_ += i_3_;
					i_4_ += i_1_;
					i_2_ ^= i_3_ << 8;
					i_3_ += i_4_;
					i_5_ += i_2_;
					i_3_ ^= i_4_ >>> 16;
					i_6_ += i_3_;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 10;
					i_5_ += i_6_;
					i_7_ += i_4_;
					i_5_ ^= i_6_ >>> 4;
					i_0_ += i_5_;
					i_6_ += i_7_;
					i_6_ ^= i_7_ << 8;
					i_7_ += i_0_;
					i_1_ += i_6_;
					i_7_ ^= i_0_ >>> 9;
					i_2_ += i_7_;
					i_0_ += i_1_;
					anIntArray629[i_9_] = i_0_;
					anIntArray629[1 + i_9_] = i_1_;
					anIntArray629[i_9_ + 2] = i_2_;
					anIntArray629[i_9_ + 3] = i_3_;
					anIntArray629[4 + i_9_] = i_4_;
					anIntArray629[5 + i_9_] = i_5_;
					anIntArray629[6 + i_9_] = i_6_;
					anIntArray629[7 + i_9_] = i_7_;
				}
				for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
					i_4_ += anIntArray629[i_10_ + 4];
					i_3_ += anIntArray629[3 + i_10_];
					i_1_ += anIntArray629[1 + i_10_];
					i_2_ += anIntArray629[i_10_ + 2];
					i_6_ += anIntArray629[6 + i_10_];
					i_0_ += anIntArray629[i_10_];
					i_7_ += anIntArray629[i_10_ + 7];
					i_5_ += anIntArray629[5 + i_10_];
					i_0_ ^= i_1_ << 11;
					i_1_ += i_2_;
					i_3_ += i_0_;
					i_1_ ^= i_2_ >>> 2;
					i_2_ += i_3_;
					i_4_ += i_1_;
					i_2_ ^= i_3_ << 8;
					i_5_ += i_2_;
					i_3_ += i_4_;
					i_3_ ^= i_4_ >>> 16;
					i_6_ += i_3_;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 10;
					i_7_ += i_4_;
					i_5_ += i_6_;
					i_5_ ^= i_6_ >>> 4;
					i_0_ += i_5_;
					i_6_ += i_7_;
					i_6_ ^= i_7_ << 8;
					i_1_ += i_6_;
					i_7_ += i_0_;
					i_7_ ^= i_0_ >>> 9;
					i_2_ += i_7_;
					i_0_ += i_1_;
					anIntArray629[i_10_] = i_0_;
					anIntArray629[1 + i_10_] = i_1_;
					anIntArray629[2 + i_10_] = i_2_;
					anIntArray629[3 + i_10_] = i_3_;
					anIntArray629[4 + i_10_] = i_4_;
					anIntArray629[5 + i_10_] = i_5_;
					anIntArray629[6 + i_10_] = i_6_;
					anIntArray629[i_10_ + 7] = i_7_;
				}
				method292(115);
				anInt631 = 256;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.A(" + i + ')');
		}
	}

	static final int method290(byte i, int i_11_, int i_12_, int i_13_) {
		try {
			anInt627++;
			if (i_12_ == i_13_)
				return i_12_;
			if (i != 86)
				return 6;
			int i_14_ = -i_11_ + 128;
			int i_15_ = i_11_ * (i_13_ & 0x7f) + i_14_ * (i_12_ & 0x7f) >> 7;
			int i_16_ = i_11_ * (i_13_ & 0x380) + i_14_ * (i_12_ & 0x380) >> 7;
			int i_17_ = i_14_ * (0xfc00 & i_12_) + (i_13_ & 0xfc00) * i_11_ >> 7;
			return i_17_ & 0xfc00 | 0x380 & i_16_ | i_15_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dp.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	final int method291(byte i) {
		try {
			anInt633++;
			if ((anInt631 ^ 0xffffffff) == -1) {
				method292(117);
				anInt631 = 256;
			}
			if (i > -77)
				return 65;
			return ClientLoader.USE_ISAAC ? anIntArray632[--anInt631] : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.D(" + i + ')');
		}
	}

	private final void method292(int i) {
		try {
			if (i <= 94)
				anInt622 = 7;
			anInt626++;
			anInt620 += ++anInt630;
			for (int i_18_ = 0; i_18_ < 256; i_18_++) {
				int i_19_ = anIntArray629[i_18_];
				if ((i_18_ & 0x2 ^ 0xffffffff) == -1) {
					if ((0x1 & i_18_ ^ 0xffffffff) != -1)
						anInt622 ^= anInt622 >>> 6;
					else
						anInt622 ^= anInt622 << 13;
				} else if ((0x1 & i_18_) != 0)
					anInt622 ^= anInt622 >>> 16;
				else
					anInt622 ^= anInt622 << 2;
				anInt622 += anIntArray629[128 + i_18_ & 0xff];
				int i_20_;
				anIntArray629[i_18_] = i_20_ = (anInt620 + anIntArray629[PacketsDecoder.method184(255, i_19_ >> 2)] - -anInt622);
				anIntArray632[i_18_] = anInt620 = i_19_ + (anIntArray629[PacketsDecoder.method184(1020, i_20_ >> 8) >> 2]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.E(" + i + ')');
		}
	}

	final int method293(int i) {
		try {
			anInt623++;
			if ((anInt631 ^ 0xffffffff) == -1) {
				method292(122);
				anInt631 = 256;
			}
			if (i != 855258338)
				anInt630 = -67;
			return ClientLoader.USE_ISAAC ? anIntArray632[-1 + anInt631] : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.C(" + i + ')');
		}
	}

	private ISAAC() {
		/* empty */
	}

	ISAAC(int[] is) {
		try {
			anIntArray632 = new int[256];
			anIntArray629 = new int[256];
			for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				anIntArray632[i] = is[i];
			method289((byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dp.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass81_625 = new Class81(8, 0, 4, 1);
	}
}
