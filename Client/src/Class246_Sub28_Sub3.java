/* Class246_Sub28_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub3 extends Class246_Sub28 {
	private int anInt5894 = 585;
	static int anInt5895;
	static int anInt5896;
	static int anInt5897;
	static int anInt5898;
	static Class210[] aClass210Array5899;
	static Class255_Sub1 aClass255_Sub1_5900;
	static Class_fs index4;
	static int anInt5902;
	static int anInt5903;
	static int anInt5904;
	static int anInt5905;

	static final void method2491(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
		try {
			anInt5896++;
			if (i_1_ < 28)
				method2495(21, null, null);
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_2_, (byte) 117, 10);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_0_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206 = i_3_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dg.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method2492(int i) {
		do {
			try {
				aClass210Array5899 = null;
				aClass255_Sub1_5900 = null;
				index4 = null;
				if (i == 0)
					break;
				method2492(1);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dg.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2143(int i, int i_4_, BufferStream stream) {
		try {
			if (i != 4)
				method2494(-5);
			int i_5_ = i_4_;
			if ((i_5_ ^ 0xffffffff) == -1)
				anInt5894 = stream.readUnsignedShort((byte) 118);
			anInt5902++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dg.G(" + i + ',' + i_4_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2493(int i) {
		try {
			if (i != -22855)
				aClass255_Sub1_5900 = null;
			anInt5904++;
			if (!Class168.aBool2400) {
				do {
					if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) {
						Class204.aFloat2881 = (float) (~0x7f & 191 + (int) Class204.aFloat2881);
						if (!client.f_ob)
							break;
					}
					Class259_Sub2_Sub1.aFloat6906 += (24.0F - Class259_Sub2_Sub1.aFloat6906) / 2.0F;
				} while (false);
				Class135.aBool1929 = true;
				Class168.aBool2400 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dg.C(" + i + ')');
		}
	}

	public Class246_Sub28_Sub3() {
		super(0, true);
	}

	static final void method2494(int i) {
		do {
			try {
				Class246_Sub4.method1809(4095, false);
				if (i == 2048) {
					anInt5897++;
					if (Class38_Sub1.anInt5116 < 0 || Class38_Sub1.anInt5116 == 0)
						break;
					Class129.method883(Class38_Sub1.anInt5116, (byte) 52);
					Class38_Sub1.anInt5116 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dg.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2495(int i, String[] strings, short[] is) {
		try {
			anInt5898++;
			Class_ds.method2755(118, is, strings, i, -1 + strings.length);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dg.A(" + i + ',' + (strings != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method2135(int i, int i_6_) {
		try {
			anInt5903++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_6_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_7_ = Class246_Sub1_Sub11.anIntArray6245[i_6_];
				for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_8_++) {
					int i_9_ = Class187.anIntArray2654[i_8_];
					if ((i_9_ ^ 0xffffffff) < (anInt5894 ^ 0xffffffff) && -anInt5894 + 4096 > i_9_ && (2048 - anInt5894 ^ 0xffffffff) > (i_7_ ^ 0xffffffff) && (2048 - -anInt5894 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
						int i_10_ = -i_9_ + 2048;
						i_10_ = (i_10_ ^ 0xffffffff) <= -1 ? i_10_ : -i_10_;
						i_10_ <<= 12;
						i_10_ /= 2048 + -anInt5894;
						is[i_8_] = -i_10_ + 4096;
					} else if ((i_9_ ^ 0xffffffff) < (2048 + -anInt5894 ^ 0xffffffff) && ((2048 - -anInt5894 ^ 0xffffffff) < (i_9_ ^ 0xffffffff))) {
						int i_11_ = i_7_ - 2048;
						i_11_ = i_11_ >= 0 ? i_11_ : -i_11_;
						i_11_ -= anInt5894;
						i_11_ <<= 12;
						is[i_8_] = i_11_ / (-anInt5894 + 2048);
					} else if (i_7_ < anInt5894 || (i_7_ ^ 0xffffffff) < (-anInt5894 + 4096 ^ 0xffffffff)) {
						int i_12_ = i_9_ - 2048;
						i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
						i_12_ -= anInt5894;
						i_12_ <<= 12;
						is[i_8_] = i_12_ / (2048 - anInt5894);
					} else if ((i_9_ ^ 0xffffffff) > (anInt5894 ^ 0xffffffff) || -anInt5894 + 4096 < i_9_) {
						int i_13_ = -i_7_ + 2048;
						i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
						i_13_ <<= 12;
						i_13_ /= 2048 + -anInt5894;
						is[i_8_] = 4096 - i_13_;
					} else
						is[i_8_] = 0;
				}
			}
			int i_14_ = 109 % ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dg.E(" + i + ',' + i_6_ + ')');
		}
	}

	static {
		new Class67(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}
}
