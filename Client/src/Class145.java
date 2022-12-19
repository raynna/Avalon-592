/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
	static int anInt2097;
	int anInt2098;
	static int anInt2099;
	int anInt2100;
	int anInt2101;
	int anInt2102 = 128;
	int anInt2103;
	static int anInt2104;
	int anInt2105;
	int anInt2106;
	static int anInt2107;
	static int anInt2108;
	int anInt2109;
	static int anInt2110;
	int anInt2111;
	static int anInt2112;
	int anInt2113;

	static final int method973(int i, byte i_0_) {
		try {
			if (i_0_ != -56)
				method978(null, (byte) -60);
			anInt2097++;
			return i & 0x3ff;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "no.A(" + i + ',' + i_0_ + ')');
		}
	}

	final Class145 method974(int i) {
		try {
			if (i != -21447)
				return null;
			anInt2099++;
			return new Class145(((Class145) this).anInt2106, ((Class145) this).anInt2098, ((Class145) this).anInt2102, ((Class145) this).anInt2109, ((Class145) this).anInt2101, ((Class145) this).anInt2113);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "no.B(" + i + ')');
		}
	}

	static final void method975(String string, byte i) {
		try {
			anInt2104++;
			if (Class_o.aClass9Array7224 != null && i == 67) {
				Class243.writePacket(-114, Class249.aClass201_3521);
				Class246_Sub28_Sub22.anInt6627++;
				Class130_Sub1.stream.writeByte(i ^ 0xbc, method978(string, (byte) -92));
				Class130_Sub1.stream.writeString(i ^ 0x3d, string);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "no.G(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method976(boolean bool, String string) {
		try {
			anInt2112++;
			int i = string.length();
			int i_1_ = 0;
			for (int i_2_ = 0; i > i_2_; i_2_++)
				i_1_ = (Class246_Sub1_Sub10.method2601(bool, string.charAt(i_2_)) + (-i_1_ + (i_1_ << 5)));
			if (bool != true)
				method978(null, (byte) -6);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("no.C(" + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method977(int i) {
		do {
			try {
				anInt2108++;
				if (Class59_Sub2.aFloat4553 < 1024.0F)
					Class59_Sub2.aFloat4553 = 1024.0F;
				for (/**/; Class204.aFloat2881 >= 16384.0F; Class204.aFloat2881 -= 16384.0F) {
					/* empty */
				}
				if (Class59_Sub2.aFloat4553 > 3072.0F)
					Class59_Sub2.aFloat4553 = 3072.0F;
				for (/**/; Class204.aFloat2881 < 0.0F; Class204.aFloat2881 += 16384.0F) {
					/* empty */
				}
				int i_3_ = 101 % ((i + 3) / 37);
				int i_4_ = Class_c_Sub1.anInt5366 >> 7;
				int i_5_ = Class246_Sub34.anInt5135 >> 7;
				int i_6_ = Class6.getAverageHeight(Class_c_Sub1.anInt5366, -77, Class246_Sub28_Sub24.anInt6681, Class246_Sub34.anInt5135);
				int i_7_ = 0;
				if (i_4_ > 3 && (i_5_ ^ 0xffffffff) < -4 && (i_4_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 - 4 ^ 0xffffffff) && i_5_ < Class152.anInt2205 - 4) {
					for (int i_8_ = i_4_ - 4; 4 + i_4_ >= i_8_; i_8_++) {
						for (int i_9_ = -4 + i_5_; (i_5_ + 4 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff); i_9_++) {
							int i_10_ = Class246_Sub28_Sub24.anInt6681;
							if ((i_10_ ^ 0xffffffff) > -4 && Class211.method1389(i_8_, -29792, i_9_))
								i_10_++;
							int i_11_ = 0;
							if ((((Class255) Class246_Sub28_Sub3.aClass255_Sub1_5900).aByteArrayArrayArray3649) != null && (((Class255) Class246_Sub28_Sub3.aClass255_Sub1_5900).aByteArrayArrayArray3649[i_10_]) != null)
								i_11_ = (0xff & (((Class255) (Class246_Sub28_Sub3.aClass255_Sub1_5900)).aByteArrayArrayArray3649[i_10_][i_8_][i_9_])) * 8;
							int i_12_ = (-Class59_Sub3_Sub4.aClass210Array6993[i_10_].l(i_8_, i_9_) + i_11_ + i_6_);
							if (i_7_ < i_12_)
								i_7_ = i_12_;
						}
					}
				}
				int i_13_ = 1536 * (i_7_ >> 0);
				if ((i_13_ ^ 0xffffffff) < -786433)
					i_13_ = 786432;
				if (i_13_ < 262144)
					i_13_ = 262144;
				if (i_13_ > Stream_Sub2.anInt6188)
					Stream_Sub2.anInt6188 += (i_13_ - Stream_Sub2.anInt6188) / 24;
				else {
					if (Stream_Sub2.anInt6188 <= i_13_)
						break;
					Stream_Sub2.anInt6188 += (-Stream_Sub2.anInt6188 + i_13_) / 80;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "no.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method978(String string, byte i) {
		try {
			anInt2107++;
			if (i >= -73)
				return 80;
			return 1 + string.length();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "no.D(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method979(int i, Class145 class145_14_) {
		do {
			try {
				((Class145) this).anInt2106 = ((Class145) class145_14_).anInt2106;
				((Class145) this).anInt2098 = ((Class145) class145_14_).anInt2098;
				((Class145) this).anInt2102 = ((Class145) class145_14_).anInt2102;
				((Class145) this).anInt2113 = ((Class145) class145_14_).anInt2113;
				((Class145) this).anInt2101 = ((Class145) class145_14_).anInt2101;
				((Class145) this).anInt2109 = ((Class145) class145_14_).anInt2109;
				anInt2110++;
				if (i == 262144)
					break;
				method978(null, (byte) -110);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("no.F(" + i + ',' + (class145_14_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class145(int i) {
		((Class145) this).anInt2098 = 128;
		try {
			((Class145) this).anInt2106 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "no.<init>(" + i + ')');
		}
	}

	private Class145(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		((Class145) this).anInt2098 = 128;
		try {
			((Class145) this).anInt2101 = i_18_;
			((Class145) this).anInt2106 = i;
			((Class145) this).anInt2098 = i_15_;
			((Class145) this).anInt2109 = i_17_;
			((Class145) this).anInt2102 = i_16_;
			((Class145) this).anInt2113 = i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("no.<init>(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}
}
