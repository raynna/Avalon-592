/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11 {
	private int[][][] anIntArrayArrayArray164 = new int[2][2][4];
	static int[][] anIntArrayArray165;
	private static float[][] aFloatArrayArray166 = new float[2][8];
	private int[][][] anIntArrayArrayArray167;
	private int[] anIntArray168 = new int[2];
	int[] anIntArray169 = new int[2];
	static int anInt170;
	private static float aFloat171;

	private final float method131(int i, int i_0_, float f) {
		float f_1_ = ((float) anIntArrayArrayArray167[i][0][i_0_] + f * (float) (anIntArrayArrayArray167[i][1][i_0_] - anIntArrayArrayArray167[i][0][i_0_]));
		f_1_ *= 1.2207031E-4F;
		return method135(f_1_);
	}

	final void method132(BufferStream stream, Class49 class49) {
		int i = stream.readUnsignedByte(255);
		((Class11) this).anIntArray169[0] = i >> 4;
		((Class11) this).anIntArray169[1] = i & 0xf;
		if (i != 0) {
			anIntArray168[0] = stream.readUnsignedShort((byte) -61);
			anIntArray168[1] = stream.readUnsignedShort((byte) -121);
			int i_2_ = stream.readUnsignedByte(255);
			for (int i_3_ = 0; i_3_ < 2; i_3_++) {
				for (int i_4_ = 0; i_4_ < ((Class11) this).anIntArray169[i_3_]; i_4_++) {
					anIntArrayArrayArray167[i_3_][0][i_4_] = stream.readUnsignedShort((byte) 120);
					anIntArrayArrayArray164[i_3_][0][i_4_] = stream.readUnsignedShort((byte) -38);
				}
			}
			for (int i_5_ = 0; i_5_ < 2; i_5_++) {
				for (int i_6_ = 0; i_6_ < ((Class11) this).anIntArray169[i_5_]; i_6_++) {
					if ((i_2_ & 1 << i_5_ * 4 << i_6_) != 0) {
						anIntArrayArrayArray167[i_5_][1][i_6_] = stream.readUnsignedShort((byte) 95);
						anIntArrayArrayArray164[i_5_][1][i_6_] = stream.readUnsignedShort((byte) 120);
					} else {
						anIntArrayArrayArray167[i_5_][1][i_6_] = anIntArrayArrayArray167[i_5_][0][i_6_];
						anIntArrayArrayArray164[i_5_][1][i_6_] = anIntArrayArrayArray164[i_5_][0][i_6_];
					}
				}
			}
			if (i_2_ != 0 || anIntArray168[1] != anIntArray168[0])
				class49.method327(stream);
		} else
			anIntArray168[0] = anIntArray168[1] = 0;
	}

	final int method133(int i, float f) {
		if (i == 0) {
			float f_7_ = ((float) anIntArray168[0] + (float) (anIntArray168[1] - anIntArray168[0]) * f);
			f_7_ *= 0.0030517578F;
			aFloat171 = (float) Math.pow(0.1, (double) (f_7_ / 20.0F));
			anInt170 = (int) (aFloat171 * 65536.0F);
		}
		if (((Class11) this).anIntArray169[i] == 0)
			return 0;
		float f_8_ = method134(i, 0, f);
		aFloatArrayArray166[i][0] = -2.0F * f_8_ * (float) Math.cos((double) method131(i, 0, f));
		aFloatArrayArray166[i][1] = f_8_ * f_8_;
		for (int i_9_ = 1; i_9_ < ((Class11) this).anIntArray169[i]; i_9_++) {
			f_8_ = method134(i, i_9_, f);
			float f_10_ = (-2.0F * f_8_ * (float) Math.cos((double) method131(i, i_9_, f)));
			float f_11_ = f_8_ * f_8_;
			aFloatArrayArray166[i][i_9_ * 2 + 1] = aFloatArrayArray166[i][i_9_ * 2 - 1] * f_11_;
			aFloatArrayArray166[i][i_9_ * 2] = (aFloatArrayArray166[i][i_9_ * 2 - 1] * f_10_ + aFloatArrayArray166[i][i_9_ * 2 - 2] * f_11_);
			for (int i_12_ = i_9_ * 2 - 1; i_12_ >= 2; i_12_--)
				aFloatArrayArray166[i][i_12_] += (aFloatArrayArray166[i][i_12_ - 1] * f_10_ + aFloatArrayArray166[i][i_12_ - 2] * f_11_);
			aFloatArrayArray166[i][1] += aFloatArrayArray166[i][0] * f_10_ + f_11_;
			aFloatArrayArray166[i][0] += f_10_;
		}
		if (i == 0) {
			for (int i_13_ = 0; i_13_ < ((Class11) this).anIntArray169[0] * 2; i_13_++)
				aFloatArrayArray166[0][i_13_] *= aFloat171;
		}
		for (int i_14_ = 0; i_14_ < ((Class11) this).anIntArray169[i] * 2; i_14_++)
			anIntArrayArray165[i][i_14_] = (int) (aFloatArrayArray166[i][i_14_] * 65536.0F);
		return ((Class11) this).anIntArray169[i] * 2;
	}

	private final float method134(int i, int i_15_, float f) {
		float f_16_ = ((float) anIntArrayArrayArray164[i][0][i_15_] + f * (float) (anIntArrayArrayArray164[i][1][i_15_] - anIntArrayArrayArray164[i][0][i_15_]));
		f_16_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_16_ / 20.0F));
	}

	private static final float method135(float f) {
		float f_17_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_17_ * 3.1415927F / 11025.0F;
	}

	public static void method136() {
		aFloatArrayArray166 = null;
		anIntArrayArray165 = null;
	}

	public Class11() {
		anIntArrayArrayArray167 = new int[2][2][4];
	}

	static {
		anIntArrayArray165 = new int[2][8];
	}
}
