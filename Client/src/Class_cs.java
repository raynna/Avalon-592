/* Class_cs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_cs extends Class246_Sub28_Sub5 {
	static int anInt7143;
	static int anInt7144;
	static int anInt7145;
	static Class_l[] aClass_lArray7146;
	static int anInt7147;

	final int[][] method2139(byte i, int i_0_) {
		try {
			anInt7144++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 94, i_0_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946 && this.method2544(-1121128860)) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				int i_4_ = (((Class246_Sub28_Sub5) this).anInt6005 * (i_0_ % ((Class246_Sub28_Sub5) this).anInt6005));
				for (int i_5_ = 0; Class246_Sub37_Sub1.f_gb > i_5_; i_5_++) {
					int i_6_ = (((Class246_Sub28_Sub5) this).anIntArray6007[i_4_ + i_5_ % (((Class246_Sub28_Sub5) this).anInt5997)]);
					is_3_[i_5_] = PacketsDecoder.method184(i_6_ << 4, 4080);
					is_2_[i_5_] = PacketsDecoder.method184(i_6_, 65280) >> 4;
					is_1_[i_5_] = PacketsDecoder.method184(i_6_ >> 12, 4080);
				}
			}
			if (i < 33)
				anInt7145 = -102;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cs.J(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2920(boolean bool) {
		do {
			try {
				aClass_lArray7146 = null;
				if (bool == true)
					break;
				method2921(89, -13, 30, 99, -18, 64, -91, 8, -57, -49);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cs.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2921(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			anInt7147++;
			if (Class246_Sub13.method1992(-98, i_9_)) {
				if (i_10_ != 29474)
					anInt7145 = -20;
				if (Class14.aClass235ArrayArray225[i_9_] == null)
					client.method2972((Class246_Sub32.aClass235ArrayArray5049[i_9_]), -1, i, i_11_, i_8_, i_13_, i_12_, i_7_, i_15_, i_14_);
				else
					client.method2972(Class14.aClass235ArrayArray225[i_9_], -1, i, i_11_, i_8_, i_13_, i_12_, i_7_, i_15_, i_14_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cs.H(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	public Class_cs() {
		/* empty */
	}
}
