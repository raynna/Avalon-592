/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class172 {
	static int anInt2427;
	static int anInt2428;
	static OutgoingPacket ACTION_BUTTON1;
	static int[] anIntArray2430 = new int[2048];
	static int[][][] anIntArrayArrayArray2431;
	static int anInt2432;
	static int anInt2433;

	static final void method1133(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			Class118.anInt1636 = i_2_;
			Class130_Sub3.anInt4406 = i_4_;
			Class214.anInt2988 = i;
			anInt2428++;
			Class40_Sub9.anInt5497 = i_1_;
			int i_5_ = -27 / ((i_3_ + 62) / 39);
			Class246_Sub1_Sub14.anInt6593 = i_0_;
			if (Class214.anInt2988 >= 100) {
				int i_6_ = 128 * Class130_Sub3.anInt4406 + 64;
				int i_7_ = 64 + Class40_Sub9.anInt5497 * 128;
				int i_8_ = (Class6.getAverageHeight(i_6_, -105, Class246_Sub28_Sub24.anInt6681, i_7_) + -Class246_Sub1_Sub14.anInt6593);
				int i_9_ = -Class246_Sub16.aInt92 + i_6_;
				int i_10_ = i_8_ + -Class246_Sub28_Sub8.anInt6077;
				int i_11_ = i_7_ - Class259_Sub1.anInt4509;
				int i_12_ = (int) Math.sqrt((double) (i_11_ * i_11_ + i_9_ * i_9_));
				Class244.anInt3456 = 0x3fff & (int) (Math.atan2((double) i_10_, (double) i_12_) * 2607.5945876176133);
				Class73.anInt961 = 0x3fff & (int) (Math.atan2((double) i_9_, (double) i_11_) * -2607.5945876176133);
				if (Class244.anInt3456 < 1024)
					Class244.anInt3456 = 1024;
				Class106_Sub1.anInt4179 = 0;
				if ((Class244.anInt3456 ^ 0xffffffff) < -3073)
					Class244.anInt3456 = 3072;
			}
			Class130_Sub3.anInt4417 = 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pr.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method1134(byte i, int i_13_) {
		try {
			if (i != 9)
				anInt2433 = 59;
			anInt2427++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_13_, (byte) 120, 12);
			class246_sub1_sub10.method2604((byte) -49);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pr.C(" + i + ',' + i_13_ + ')');
		}
	}

	public static void method1135(byte i) {
		try {
			int i_14_ = -113 / ((i - 63) / 54);
			anIntArray2430 = null;
			anIntArrayArrayArray2431 = null;
			ACTION_BUTTON1 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pr.A(" + i + ')');
		}
	}

	static {
		ACTION_BUTTON1 = new OutgoingPacket(6, 8);
		new Class67(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
	}
}
