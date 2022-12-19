/* Class38_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub1_Sub1 extends Class38_Sub1 {
	static int anInt6760;
	static int anInt6761;
	static String[] aStringArray6762 = new String[100];
	private byte[] aByteArray6763;
	static int anInt6764;
	static boolean aBool6765;
	static OutgoingPacket aClass201_6766 = new OutgoingPacket(11, 7);
	static int anInt6767;
	static int anInt6768;
	static int[] anIntArray6769 = new int[13];
	static int anInt6770 = 104;

	final void method2187(byte i, byte i_0_, int i_1_) {
		try {
			anInt6764++;
			if (i != -81)
				method2187((byte) -13, (byte) 97, 42);
			i_0_ = (byte) (127 + ((0xff & i_0_) >> 1));
			int i_2_ = i_1_ * 2;
			aByteArray6763[i_2_++] = i_0_;
			aByteArray6763[i_2_] = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qi.I(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final byte[] method2768(byte i, int i_3_, int i_4_, int i_5_) {
		try {
			aByteArray6763 = new byte[i_5_ * i_3_ * (i_4_ * 2)];
			if (i != -49)
				method2769(null, true, -0.06928216F, -2.737134F, -66, -1.5090047F, 30, -104, 73, -62, 0, 17, -14);
			anInt6767++;
			this.method263((byte) -120, i_3_, i_5_, i_4_);
			return aByteArray6763;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qi.B(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	public Class38_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	static final void method2769(float[] fs, boolean bool, float f, float f_6_, int i, float f_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			i_14_ -= i_9_;
			if (bool != true)
				method2771(68, -115);
			i -= i_12_;
			anInt6761++;
			i_8_ -= i_13_;
			float f_15_ = ((float) i_14_ * fs[2] + ((float) i_8_ * fs[1] + (float) i * fs[0]));
			float f_16_ = ((float) i_8_ * fs[4] + fs[3] * (float) i + fs[5] * (float) i_14_);
			float f_17_ = ((float) i * fs[6] + (float) i_8_ * fs[7] + (float) i_14_ * fs[8]);
			float f_18_;
			float f_19_;
			if (i_10_ == 0) {
				f_19_ = 0.5F + (-f_17_ + f_7_);
				f_18_ = 0.5F + (f_15_ + f_6_);
			} else if (i_10_ != 1) {
				if (i_10_ == 2) {
					f_18_ = f_6_ + -f_15_ + 0.5F;
					f_19_ = -f_16_ + f + 0.5F;
				} else if (i_10_ == 3) {
					f_19_ = 0.5F + (f + -f_16_);
					f_18_ = f_15_ + f_6_ + 0.5F;
				} else if (i_10_ != 4) {
					f_18_ = f_7_ + -f_17_ + 0.5F;
					f_19_ = 0.5F + (-f_16_ + f);
				} else {
					f_18_ = 0.5F + (f_7_ + f_17_);
					f_19_ = f + -f_16_ + 0.5F;
				}
			} else {
				f_18_ = f_15_ + f_6_ + 0.5F;
				f_19_ = f_7_ + f_17_ + 0.5F;
			}
			if ((i_11_ ^ 0xffffffff) == -2) {
				float f_20_ = f_18_;
				f_18_ = -f_19_;
				f_19_ = f_20_;
			} else if ((i_11_ ^ 0xffffffff) == -3) {
				f_19_ = -f_19_;
				f_18_ = -f_18_;
			} else if (i_11_ == 3) {
				float f_21_ = f_18_;
				f_18_ = f_19_;
				f_19_ = -f_21_;
			}
			Class21_Sub3.aFloat4728 = f_18_;
			Class180.aFloat2521 = f_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qi.D(" + (fs != null ? "{...}" : "null") + ',' + bool + ',' + f + ',' + f_6_ + ',' + i + ',' + f_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public static void method2770(int i) {
		try {
			if (i <= -1) {
				aStringArray6762 = null;
				anIntArray6769 = null;
				aClass201_6766 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qi.A(" + i + ')');
		}
	}

	static final boolean method2771(int i, int i_22_) {
		try {
			SubIncomingPacket.anInt7095 = 1 + i & 0xffff;
			anInt6760++;
			if (i_22_ != -32291)
				method2769(null, false, 1.8498535F, 1.59966F, 104, -0.9522125F, 13, 2, 7, 5, 61, -125, -27);
			Class46.aBool669 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qi.C(" + i + ',' + i_22_ + ')');
		}
	}
}
