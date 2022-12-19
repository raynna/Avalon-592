/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class77 {
	private static int anInt1003;
	private static int anInt1004;
	private static int anInt1005;
	private static int anInt1006;
	private static int[] anIntArray1007;
	private static int anInt1008;
	private static int anInt1009;
	private static int anInt1010;

	static final void method479(Class260 class260, int[] is, int i) {
		method485(class260, is, 0, is.length, i, null, null);
	}

	private static final void method480(int i, int i_0_) {
		if (i_0_ > i + 4) {
			int i_1_ = i;
			int i_2_ = anIntArray1007[i_1_];
			int i_3_ = anIntArray1007[i_1_ + 1];
			int i_4_ = anIntArray1007[i_1_ + 2];
			int i_5_ = anIntArray1007[i_1_ + 3];
			for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
				int i_7_ = anIntArray1007[i_6_ + 1];
				if (i_7_ < i_3_) {
					anIntArray1007[i_1_] = anIntArray1007[i_6_];
					anIntArray1007[i_1_ + 1] = i_7_;
					anIntArray1007[i_1_ + 2] = anIntArray1007[i_6_ + 2];
					anIntArray1007[i_1_ + 3] = anIntArray1007[i_6_ + 3];
					i_1_ += 4;
					anIntArray1007[i_6_] = anIntArray1007[i_1_];
					anIntArray1007[i_6_ + 1] = anIntArray1007[i_1_ + 1];
					anIntArray1007[i_6_ + 2] = anIntArray1007[i_1_ + 2];
					anIntArray1007[i_6_ + 3] = anIntArray1007[i_1_ + 3];
				}
			}
			anIntArray1007[i_1_] = i_2_;
			anIntArray1007[i_1_ + 1] = i_3_;
			anIntArray1007[i_1_ + 2] = i_4_;
			anIntArray1007[i_1_ + 3] = i_5_;
			method480(i, i_1_);
			method480(i_1_ + 4, i_0_);
		}
	}

	private static final void method481(int i, int i_8_) {
		for (/**/; i_8_ >= i + 8; i_8_ -= 4) {
			boolean bool = true;
			for (int i_9_ = i + 4; i_9_ < i_8_; i_9_ += 4) {
				int i_10_ = anIntArray1007[i_9_ - 4];
				int i_11_ = anIntArray1007[i_9_];
				if (i_10_ > i_11_) {
					bool = false;
					anIntArray1007[i_9_ - 4] = i_11_;
					anIntArray1007[i_9_] = i_10_;
					i_10_ = anIntArray1007[i_9_ - 2];
					anIntArray1007[i_9_ - 2] = anIntArray1007[i_9_ + 2];
					anIntArray1007[i_9_ + 2] = i_10_;
					i_10_ = anIntArray1007[i_9_ - 1];
					anIntArray1007[i_9_ - 1] = anIntArray1007[i_9_ + 3];
					anIntArray1007[i_9_ + 3] = i_10_;
				}
			}
			if (bool)
				break;
		}
	}

	public static void method482() {
		anIntArray1007 = null;
	}

	private static final void method483() {
		anInt1006 = 0;
	}

	private static final boolean method484(int i) {
		int i_12_ = anInt1003;
		int i_13_ = anInt1005;
		int i_14_ = anInt1009;
		int i_15_;
		for (/**/; i_13_ >= i_12_; i_13_ = i_15_) {
			anInt1009 = ++i_14_;
			if (i_14_ >= i)
				return false;
			i_15_ = anInt1008;
			for (/**/; i_12_ < anInt1006; i_12_ += 4) {
				int i_16_ = anIntArray1007[i_12_ + 1];
				if (i_14_ < i_16_)
					break;
				int i_17_ = anIntArray1007[i_12_];
				int i_18_ = anIntArray1007[i_12_ + 2];
				int i_19_ = anIntArray1007[i_12_ + 3];
				int i_20_ = (i_18_ - i_17_ << 16) / (i_19_ - i_16_);
				int i_21_ = (i_17_ << 16) + 32768;
				anIntArray1007[i_12_] = i_21_;
				anIntArray1007[i_12_ + 2] = i_20_;
			}
			for (int i_22_ = i_15_; i_22_ < i_12_; i_22_ += 4) {
				int i_23_ = anIntArray1007[i_22_ + 3];
				if (i_14_ >= i_23_) {
					anIntArray1007[i_22_] = anIntArray1007[i_15_];
					anIntArray1007[i_22_ + 1] = anIntArray1007[i_15_ + 1];
					anIntArray1007[i_22_ + 2] = anIntArray1007[i_15_ + 2];
					anIntArray1007[i_22_ + 3] = anIntArray1007[i_15_ + 3];
					i_15_ += 4;
				}
			}
			if (i_15_ == anInt1006) {
				anInt1006 = 0;
				return false;
			}
			method481(i_15_, i_12_);
			anInt1008 = i_15_;
			anInt1003 = i_12_;
		}
		anInt1004 = anIntArray1007[i_13_] >> 16;
		anInt1010 = anIntArray1007[i_13_ + 4] >> 16;
		anIntArray1007[i_13_] += anIntArray1007[i_13_ + 2];
		anIntArray1007[i_13_ + 4] += anIntArray1007[i_13_ + 6];
		i_13_ += 8;
		anInt1005 = i_13_;
		return true;
	}

	private static final void method485(Class260 class260, int[] is, int i, int i_24_, int i_25_, int[] is_26_, int[] is_27_) {
		int[] is_28_ = new int[4];
		class260.da(is_28_);
		if (is_26_ != null && is_28_[3] - is_28_[1] != is_26_.length)
			throw new IllegalStateException();
		method483();
		method488(is, i, i_24_);
		method486(is_28_[1]);
		while (method484(is_28_[3])) {
			int i_29_ = anInt1004;
			int i_30_ = anInt1010;
			int i_31_ = anInt1009;
			if (is_26_ != null) {
				int i_32_ = i_31_ - is_28_[1];
				if (i_29_ < is_26_[i_32_] + is_28_[0])
					i_29_ = is_26_[i_32_] + is_28_[0];
				if (i_30_ > is_26_[i_32_] + is_27_[i_32_] + is_28_[0])
					i_30_ = is_26_[i_32_] + is_27_[i_32_] + is_28_[0];
				if (i_30_ - i_29_ <= 0)
					continue;
			}
			class260.b(i_29_, i_31_, i_30_ - i_29_, i_25_, 1);
		}
	}

	private static final void method486(int i) {
		if (anInt1006 < 0) {
			anInt1008 = anInt1003 = anInt1005 = 0;
			anInt1009 = 2147483646;
		} else {
			method480(0, anInt1006);
			int i_33_ = anIntArray1007[1];
			if (i_33_ < i)
				i_33_ = i;
			int i_34_ = 0;
			int i_35_;
			for (i_35_ = 0; i_35_ < anInt1006; i_35_ += 4) {
				int i_36_ = anIntArray1007[i_35_ + 1];
				if (i_33_ < i_36_)
					break;
				int i_37_ = anIntArray1007[i_35_];
				int i_38_ = anIntArray1007[i_35_ + 2];
				int i_39_ = anIntArray1007[i_35_ + 3];
				int i_40_ = (i_38_ - i_37_ << 16) / (i_39_ - i_36_);
				int i_41_ = (i_37_ << 16) + 32768;
				anIntArray1007[i_35_] = i_41_ + (i_33_ - i_36_) * i_40_;
				anIntArray1007[i_35_ + 2] = i_40_;
			}
			anInt1008 = i_34_;
			anInt1003 = i_35_;
			anInt1005 = i_35_;
			anInt1009 = i_33_ - 1;
		}
	}

	static final void method487(Class260 class260, int[] is, int i, int[] is_42_, int[] is_43_) {
		method485(class260, is, 0, is.length, i, is_42_, is_43_);
	}

	private static final void method488(int[] is, int i, int i_44_) {
		int i_45_ = anInt1006 + (i_44_ << 1);
		if (anIntArray1007 == null || anIntArray1007.length < i_45_) {
			int[] is_46_ = new int[i_45_];
			for (int i_47_ = 0; i_47_ < anInt1006; i_47_++)
				is_46_[i_47_] = anIntArray1007[i_47_];
			anIntArray1007 = is_46_;
		}
		i_44_ += i;
		int i_48_ = i_44_ - 2;
		for (int i_49_ = i; i_49_ < i_44_; i_49_ += 2) {
			int i_50_ = is[i_48_ + 1];
			int i_51_ = is[i_49_ + 1];
			if (i_50_ < i_51_) {
				anIntArray1007[anInt1006++] = is[i_48_];
				anIntArray1007[anInt1006++] = i_50_;
				anIntArray1007[anInt1006++] = is[i_49_];
				anIntArray1007[anInt1006++] = i_51_;
			} else if (i_51_ < i_50_) {
				anIntArray1007[anInt1006++] = is[i_49_];
				anIntArray1007[anInt1006++] = i_51_;
				anIntArray1007[anInt1006++] = is[i_48_];
				anIntArray1007[anInt1006++] = i_50_;
			}
			i_48_ = i_49_;
		}
	}
}
