/* Class246_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub36 extends Node {
	private int anInt5242;
	int anInt5243;
	private static int[] anIntArray5244;
	int anInt5245;
	private int[] anIntArray5246;
	boolean aBool5247;

	final void method2222(int i, int i_0_) {
		if (i != 0 || i_0_ != 0) {
			if (anIntArray5244 == null || anIntArray5244.length < anIntArray5246.length)
				anIntArray5244 = new int[anIntArray5246.length];
			int i_1_ = anIntArray5246.length;
			int i_2_ = i;
			int i_3_ = anInt5242 - 1;
			int i_4_ = anInt5242 * i_0_;
			int i_5_ = i_1_ - 1;
			for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt5242) {
				int i_7_ = i_6_ + i_4_ & i_5_;
				for (int i_8_ = 0; i_8_ < anInt5242; i_8_++) {
					int i_9_ = i_6_ + i_8_;
					int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
					anIntArray5244[i_9_] = anIntArray5246[i_10_];
				}
			}
			int[] is = anIntArray5246;
			anIntArray5246 = anIntArray5244;
			anIntArray5244 = is;
		}
	}

	public static void method2223() {
		anIntArray5244 = null;
	}

	final int[] method2224() {
		return anIntArray5246;
	}

	Class246_Sub36(int i, int i_11_, int[] is, boolean bool) {
		((Class246_Sub36) this).anInt5243 = i;
		anInt5242 = i_11_;
		anIntArray5246 = is;
		if (bool) {
			int[] is_12_ = new int[anInt5242];
			int[] is_13_ = new int[anInt5242];
			int[] is_14_ = new int[anInt5242];
			if (anIntArray5244 == null || anIntArray5244.length < anIntArray5246.length)
				anIntArray5244 = new int[anIntArray5246.length];
			int i_15_ = anInt5242;
			int i_16_ = anInt5242;
			int i_17_ = i_15_ - 1;
			int i_18_ = i_16_ - 1;
			int i_19_ = i_15_ * i_16_;
			int i_21_;
			int i_20_ = i_21_ = i_15_;
			for (int i_22_ = 2; i_22_ >= 0; i_22_--) {
				for (int i_23_ = i_17_; i_23_ >= 0; i_23_--) {
					int i_24_ = anIntArray5246[--i_21_];
					is_12_[i_23_] += i_24_ >> 16 & 0xff;
					is_13_[i_23_] += i_24_ >> 8 & 0xff;
					is_14_[i_23_] += i_24_ & 0xff;
				}
				if (i_21_ == 0)
					i_21_ = i_19_;
			}
			int i_25_ = i_19_;
			for (int i_26_ = i_18_; i_26_ >= 0; i_26_--) {
				int i_27_ = 1;
				int i_28_ = 1;
				int i_30_;
				int i_31_;
				int i_29_ = i_30_ = i_31_ = 0;
				for (int i_32_ = 2; i_32_ >= 0; i_32_--) {
					i_28_--;
					i_29_ += is_12_[i_28_];
					i_31_ += is_13_[i_28_];
					i_30_ += is_14_[i_28_];
					if (i_28_ == 0)
						i_28_ = i_15_;
				}
				for (int i_33_ = i_17_; i_33_ >= 0; i_33_--) {
					i_28_--;
					i_27_--;
					int i_34_ = i_29_ / 9;
					int i_35_ = i_31_ / 9;
					int i_36_ = i_30_ / 9;
					anIntArray5244[--i_25_] = i_34_ << 16 | i_35_ << 8 | i_36_;
					i_29_ += is_12_[i_28_] - is_12_[i_27_];
					i_30_ += is_14_[i_28_] - is_14_[i_27_];
					i_31_ += is_13_[i_28_] - is_13_[i_27_];
					if (i_28_ == 0)
						i_28_ = i_15_;
					if (i_27_ == 0)
						i_27_ = i_15_;
				}
				for (int i_37_ = i_17_; i_37_ >= 0; i_37_--) {
					int i_38_ = anIntArray5246[--i_21_];
					int i_39_ = anIntArray5246[--i_20_];
					is_12_[i_37_] += (i_38_ >> 16 & 0xff) - (i_39_ >> 16 & 0xff);
					is_13_[i_37_] += (i_38_ >> 8 & 0xff) - (i_39_ >> 8 & 0xff);
					is_14_[i_37_] += (i_38_ & 0xff) - (i_39_ & 0xff);
				}
				if (i_21_ == 0)
					i_21_ = i_19_;
				if (i_20_ == 0)
					i_20_ = i_19_;
			}
			int[] is_40_ = anIntArray5246;
			anIntArray5246 = anIntArray5244;
			anIntArray5244 = is_40_;
		}
	}
}
