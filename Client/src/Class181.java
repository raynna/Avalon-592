/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
	private int anInt2527;
	private int anInt2528;
	private int anInt2529 = Class246_Sub9.method1846(16);
	private int anInt2530 = Class246_Sub9.method1846(24);
	private int anInt2531;
	private int[] anIntArray2532;
	private int anInt2533 = Class246_Sub9.method1846(24);

	final void method1178(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = (((Class119) Class246_Sub9.aClass119Array4000[anInt2527]).anInt1644);
			int i_2_ = anInt2533 - anInt2530;
			int i_3_ = i_2_ / anInt2531;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class246_Sub9.aClass119Array4000[anInt2527].method817();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % anInt2528;
							i_6_ /= anInt2528;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray2532[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt2530 + i_5_ * anInt2531;
							Class119 class119 = Class246_Sub9.aClass119Array4000[i_10_];
							if (anInt2529 == 0) {
								int i_12_ = (anInt2531 / ((Class119) class119).anInt1644);
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class119.method819();
									for (int i_15_ = 0; (i_15_ < ((Class119) class119).anInt1644); i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt2531) {
									float[] fs_17_ = class119.method819();
									for (int i_18_ = 0; (i_18_ < ((Class119) class119).anInt1644); i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	Class181() {
		anInt2531 = Class246_Sub9.method1846(24) + 1;
		anInt2528 = Class246_Sub9.method1846(6) + 1;
		anInt2527 = Class246_Sub9.method1846(8);
		int[] is = new int[anInt2528];
		for (int i = 0; i < anInt2528; i++) {
			int i_19_ = 0;
			int i_20_ = Class246_Sub9.method1846(3);
			boolean bool = Class246_Sub9.method1849() != 0;
			if (bool)
				i_19_ = Class246_Sub9.method1846(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray2532 = new int[anInt2528 * 8];
		for (int i = 0; i < anInt2528 * 8; i++)
			anIntArray2532[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class246_Sub9.method1846(8) : -1);
	}
}
