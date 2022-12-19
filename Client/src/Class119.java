/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119 {
	private int[] anIntArray1642;
	private int anInt1643;
	int anInt1644;
	private int[] anIntArray1645;
	private float[][] aFloatArrayArray1646;
	private int[] anIntArray1647;

	private final void method816() {
		int[] is = new int[anInt1643];
		int[] is_0_ = new int[33];
		for (int i = 0; i < anInt1643; i++) {
			int i_1_ = anIntArray1645[i];
			if (i_1_ != 0) {
				int i_2_ = 1 << 32 - i_1_;
				int i_3_ = is_0_[i_1_];
				is[i] = i_3_;
				int i_4_;
				if ((i_3_ & i_2_) != 0)
					i_4_ = is_0_[i_1_ - 1];
				else {
					i_4_ = i_3_ | i_2_;
					for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
						int i_6_ = is_0_[i_5_];
						if (i_6_ != i_3_)
							break;
						int i_7_ = 1 << 32 - i_5_;
						if ((i_6_ & i_7_) != 0) {
							is_0_[i_5_] = is_0_[i_5_ - 1];
							break;
						}
						is_0_[i_5_] = i_6_ | i_7_;
					}
				}
				is_0_[i_1_] = i_4_;
				for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
					int i_9_ = is_0_[i_8_];
					if (i_9_ == i_3_)
						is_0_[i_8_] = i_4_;
				}
			}
		}
		anIntArray1647 = new int[8];
		int i = 0;
		for (int i_10_ = 0; i_10_ < anInt1643; i_10_++) {
			int i_11_ = anIntArray1645[i_10_];
			if (i_11_ != 0) {
				int i_12_ = is[i_10_];
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
					int i_15_ = -2147483648 >>> i_14_;
					if ((i_12_ & i_15_) != 0) {
						if (anIntArray1647[i_13_] == 0)
							anIntArray1647[i_13_] = i;
						i_13_ = anIntArray1647[i_13_];
					} else
						i_13_++;
					if (i_13_ >= anIntArray1647.length) {
						int[] is_16_ = new int[anIntArray1647.length * 2];
						for (int i_17_ = 0; i_17_ < anIntArray1647.length; i_17_++)
							is_16_[i_17_] = anIntArray1647[i_17_];
						anIntArray1647 = is_16_;
					}
					i_15_ >>>= 1;
				}
				anIntArray1647[i_13_] = i_10_ ^ 0xffffffff;
				if (i_13_ >= i)
					i = i_13_ + 1;
			}
		}
	}

	final int method817() {
		int i;
		for (i = 0; anIntArray1647[i] >= 0; i = Class246_Sub9.method1849() != 0 ? anIntArray1647[i] : i + 1) {
			/* empty */
		}
		return anIntArray1647[i] ^ 0xffffffff;
	}

	private static final int method818(int i, int i_18_) {
		int i_19_;
		for (i_19_ = (int) Math.pow((double) i, 1.0 / (double) i_18_) + 1; Class84.method536(i_19_, 1, i_18_) > i; i_19_--) {
			/* empty */
		}
		return i_19_;
	}

	final float[] method819() {
		return aFloatArrayArray1646[method817()];
	}

	Class119() {
		Class246_Sub9.method1846(24);
		((Class119) this).anInt1644 = Class246_Sub9.method1846(16);
		anInt1643 = Class246_Sub9.method1846(24);
		anIntArray1645 = new int[anInt1643];
		boolean bool = Class246_Sub9.method1849() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Class246_Sub9.method1846(5) + 1;
			while (i < anInt1643) {
				int i_21_ = (Class246_Sub9.method1846(Class179.method1169(anInt1643 - i, (byte) -14)));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray1645[i++] = i_20_;
				i_20_++;
			}
		} else {
			boolean bool_23_ = Class246_Sub9.method1849() != 0;
			for (int i = 0; i < anInt1643; i++) {
				if (bool_23_ && Class246_Sub9.method1849() == 0)
					anIntArray1645[i] = 0;
				else
					anIntArray1645[i] = Class246_Sub9.method1846(5) + 1;
			}
		}
		method816();
		int i = Class246_Sub9.method1846(4);
		if (i > 0) {
			float f = Class246_Sub9.method1855(Class246_Sub9.method1846(32));
			float f_24_ = Class246_Sub9.method1855(Class246_Sub9.method1846(32));
			int i_25_ = Class246_Sub9.method1846(4) + 1;
			boolean bool_26_ = Class246_Sub9.method1849() != 0;
			int i_27_;
			if (i == 1)
				i_27_ = method818(anInt1643, ((Class119) this).anInt1644);
			else
				i_27_ = anInt1643 * ((Class119) this).anInt1644;
			anIntArray1642 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray1642[i_28_] = Class246_Sub9.method1846(i_25_);
			aFloatArrayArray1646 = new float[anInt1643][((Class119) this).anInt1644];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt1643; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < ((Class119) this).anInt1644; i_32_++) {
						int i_33_ = i_29_ / i_31_ % i_27_;
						float f_34_ = ((float) anIntArray1642[i_33_] * f_24_ + f + f_30_);
						aFloatArrayArray1646[i_29_][i_32_] = f_34_;
						if (bool_26_)
							f_30_ = f_34_;
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt1643; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * ((Class119) this).anInt1644;
					for (int i_38_ = 0; i_38_ < ((Class119) this).anInt1644; i_38_++) {
						float f_39_ = ((float) anIntArray1642[i_37_] * f_24_ + f + f_36_);
						aFloatArrayArray1646[i_35_][i_38_] = f_39_;
						if (bool_26_)
							f_36_ = f_39_;
						i_37_++;
					}
				}
			}
		}
	}
}
