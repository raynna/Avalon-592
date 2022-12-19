/* Class_ds - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ds extends Class246_Sub28 {
	static int anInt6717;
	static Class_l[] aClass_lArray6718;
	static int anInt6719;
	static int anInt6720;
	static int anInt6721;
	static int anInt6722;

	public static void method2753(byte i) {
		try {
			if (i != 95)
				anInt6722 = -74;
			aClass_lArray6718 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ds.A(" + i + ')');
		}
	}

	static final void method2754(int[] is, int i, int[] is_0_, int i_1_, int i_2_) {
		do {
			try {
				anInt6719++;
				if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					int i_3_ = (i - -i_1_) / 2;
					int i_4_ = i;
					int i_5_ = is[i_3_];
					is[i_3_] = is[i_1_];
					is[i_1_] = i_5_;
					int i_6_ = is_0_[i_3_];
					is_0_[i_3_] = is_0_[i_1_];
					is_0_[i_1_] = i_6_;
					int i_7_ = i_5_ == 2147483647 ? 0 : 1;
					for (int i_8_ = i; i_8_ < i_1_; i_8_++) {
						if ((is[i_8_] ^ 0xffffffff) > (i_5_ - -(i_7_ & i_8_) ^ 0xffffffff)) {
							int i_9_ = is[i_8_];
							is[i_8_] = is[i_4_];
							is[i_4_] = i_9_;
							int i_10_ = is_0_[i_8_];
							is_0_[i_8_] = is_0_[i_4_];
							is_0_[i_4_++] = i_10_;
						}
					}
					is[i_1_] = is[i_4_];
					is[i_4_] = i_5_;
					is_0_[i_1_] = is_0_[i_4_];
					is_0_[i_4_] = i_6_;
					method2754(is, i, is_0_, i_4_ - 1, i_2_);
					method2754(is, i_4_ + 1, is_0_, i_1_, i_2_);
				}
				if (i_2_ == 0)
					break;
				anInt6722 = -68;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ds.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_11_) {
		try {
			anInt6721++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_11_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[][] is_12_ = this.method2141(3, 0, i_11_);
				int[] is_13_ = is_12_[0];
				int[] is_14_ = is_12_[1];
				int[] is_15_ = is_12_[2];
				for (int i_16_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++)
					is[i_16_] = (is_15_[i_16_] + is_14_[i_16_] + is_13_[i_16_]) / 3;
			}
			int i_17_ = -108 % ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ds.E(" + i + ',' + i_11_ + ')');
		}
	}

	public Class_ds() {
		super(1, true);
	}

	static final void method2755(int i, short[] is, String[] strings, int i_18_, int i_19_) {
		do {
			try {
				anInt6717++;
				if (i < 57)
					method2755(-15, null, null, 94, 97);
				if ((i_19_ ^ 0xffffffff) >= (i_18_ ^ 0xffffffff))
					break;
				int i_20_ = (i_18_ - -i_19_) / 2;
				int i_21_ = i_18_;
				String string = strings[i_20_];
				strings[i_20_] = strings[i_19_];
				strings[i_19_] = string;
				short i_22_ = is[i_20_];
				is[i_20_] = is[i_19_];
				is[i_19_] = i_22_;
				for (int i_23_ = i_18_; i_23_ < i_19_; i_23_++) {
					if (string == null || (strings[i_23_] != null && ((i_23_ & 0x1 ^ 0xffffffff) < (strings[i_23_].compareTo(string) ^ 0xffffffff)))) {
						String string_24_ = strings[i_23_];
						strings[i_23_] = strings[i_21_];
						strings[i_21_] = string_24_;
						short i_25_ = is[i_23_];
						is[i_23_] = is[i_21_];
						is[i_21_++] = i_25_;
					}
				}
				strings[i_19_] = strings[i_21_];
				strings[i_21_] = string;
				is[i_19_] = is[i_21_];
				is[i_21_] = i_22_;
				method2755(121, is, strings, i_18_, -1 + i_21_);
				method2755(66, is, strings, 1 + i_21_, i_19_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ds.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (strings != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ')'));
			}
			break;
		} while (false);
	}
}
