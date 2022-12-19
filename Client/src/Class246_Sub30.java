/* Class246_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub30 extends Node {
	static int anInt5027;
	static int anInt5028;
	static Class67 aClass67_5029 = new Class67(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est d\u00e9j\u00e0 dans votre liste d'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
	static Class12 SEND_PROJECTILE;
	static int anInt5031 = 0;

	static final void method2156(boolean bool) {
		try {
			anInt5027++;
			if (Class74.anInt967 != -1 && (Class21_Sub2.anInt4494 ^ 0xffffffff) != 0) {
				int i = (((Class246_Sub4.anInt3868 * (-Class246_Sub28_Sub4.anInt5977 + Class240.anInt3385)) >> 16) + Class246_Sub28_Sub4.anInt5977);
				Class246_Sub4.anInt3868 += i;
				if (Class246_Sub4.anInt3868 >= 65535) {
					Class246_Sub4.anInt3868 = 65535;
					if (Class147.aBool2149)
						Class59_Sub4_Sub2.aBool6844 = false;
					else
						Class59_Sub4_Sub2.aBool6844 = true;
					Class147.aBool2149 = true;
				} else {
					Class147.aBool2149 = false;
					Class59_Sub4_Sub2.aBool6844 = false;
				}
				float f = (float) Class246_Sub4.anInt3868 / 65535.0F;
				float[] fs = new float[3];
				if (bool == true) {
					int i_0_ = 2 * Class259_Sub1.anInt4511;
					for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -4; i_1_++) {
						int i_2_ = 3 * (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_][i_1_]);
						int i_3_ = 3 * (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_ + 1][i_1_]);
						int i_4_ = 3 * ((Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][2 + i_0_][i_1_]) + (-(Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][3 + i_0_][i_1_]) + (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][2 + i_0_][i_1_])));
						int i_5_ = (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_][i_1_]);
						int i_6_ = -i_2_ + i_3_;
						int i_7_ = -(i_3_ * 2) + i_2_ - -i_4_;
						int i_8_ = i_3_ + ((Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_ + 2][i_1_]) + -i_5_ - i_4_);
						fs[i_1_] = (float) i_5_ + f * ((float) i_6_ + (f * (float) i_8_ + (float) i_7_) * f);
					}
					Class246_Sub16.aInt92 = -(128 * Class39_Sub1.anInt4670) + (int) fs[0];
					Class246_Sub28_Sub8.anInt6077 = -1 * (int) fs[1];
					Class259_Sub1.anInt4509 = -(Class47.anInt686 * 128) + (int) fs[2];
					float[] fs_9_ = new float[3];
					int i_10_ = Class93.anInt1228 * 2;
					for (int i_11_ = 0; i_11_ < 3; i_11_++) {
						int i_12_ = ((Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][i_10_][i_11_]) * 3);
						int i_13_ = ((Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][i_10_ + 1][i_11_]) * 3);
						int i_14_ = 3 * ((Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][i_10_ + 2][i_11_]) + (-(Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][3 + i_10_][i_11_]) - -(Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][2 + i_10_][i_11_])));
						int i_15_ = (Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][i_10_][i_11_]);
						int i_16_ = -i_12_ + i_13_;
						int i_17_ = i_12_ + -(2 * i_13_) + i_14_;
						int i_18_ = (i_13_ + (Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494][2 + i_10_][i_11_]) + (-i_15_ - i_14_));
						fs_9_[i_11_] = (f * ((float) i_17_ + (float) i_18_ * f) + (float) i_16_) * f + (float) i_15_;
					}
					float f_19_ = fs_9_[0] - fs[0];
					float f_20_ = (fs_9_[1] - fs[1]) * -1.0F;
					float f_21_ = -fs[2] + fs_9_[2];
					double d = Math.sqrt((double) (f_19_ * f_19_ + f_21_ * f_21_));
					Class244.anInt3456 = (int) (2607.5945876176133 * Math.atan2((double) f_20_, d)) & 0x3fff;
					Class73.anInt961 = 0x3fff & (int) (2607.5945876176133 * -Math.atan2((double) f_19_, (double) f_21_));
					Class106_Sub1.anInt4179 = ((Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_][3]) - -(((-(Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][i_0_][3]) + (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967][2 + i_0_][3])) * Class246_Sub4.anInt3868) >> 16));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "os.H(" + bool + ')');
		}
	}

	abstract int method2157(byte i);

	abstract long method2158(byte i);

	public Class246_Sub30() {
		/* empty */
	}

	public static void method2159(int i) {
		try {
			aClass67_5029 = null;
			if (i != 3)
				SEND_PROJECTILE = null;
			SEND_PROJECTILE = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "os.G(" + i + ')');
		}
	}

	abstract int method2160(int i);

	abstract int method2161(byte i);

	static {
		SEND_PROJECTILE = new Class12(0, 15);
	}
}
