/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class211 {
	static int anInt2958;
	static int anInt2959;
	static int anInt2960;
	static int anInt2961;
	static Class235 aClass235_2962;
	static Class166 aClass166_2963;
	static int anInt2964;
	static int anInt2965;

	static final void method1386(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt2961++;
			if (i_0_ < 128 || (i_1_ ^ 0xffffffff) > -129 || (Class38_Sub1_Sub1.anInt6770 - 2) * 128 < i_0_ || (-2 + Class152.anInt2205) * 128 < i_1_)
				Class257.anIntArray3689[0] = Class257.anIntArray3689[1] = -1;
			else {
				int i_9_ = -i_5_ + Class6.getAverageHeight(i_0_, -105, i_7_, i_1_);
				Class130_Sub3.aClass_c4413.o(i_3_, 0, 0);
				Class246_Sub15.aClass260_4445.ea(Class130_Sub3.aClass_c4413);
				Class246_Sub15.aClass260_4445.X(i_0_, i_9_, i_1_, Class257.anIntArray3689);
				if (i_6_ != 503)
					aClass235_2962 = null;
				Class130_Sub3.aClass_c4413.o(-i_3_, 0, 0);
				Class246_Sub15.aClass260_4445.ea(Class130_Sub3.aClass_c4413);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tb.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method1387(int i, Class_fs class_fs) {
		try {
			Class199.anInt2846 = 0;
			if (i >= -105)
				aClass166_2963 = null;
			anInt2964++;
			Class165.anInt2335 = 0;
			Class216.aClass68_3008 = new Class68();
			Class246_Sub43.aClass130_Sub1_Sub1_Sub1Array5600 = new Class130_Sub1_Sub1_Sub1[1024];
			Class37.method260(class_fs, 1);
			Class21_Sub1.method1814(class_fs, 3325);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tb.F(" + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1388(boolean bool) {
		try {
			if (bool != false)
				aClass235_2962 = null;
			aClass235_2962 = null;
			aClass166_2963 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tb.I(" + bool + ')');
		}
	}

	static final boolean method1389(int i, int i_10_, int i_11_) {
		try {
			anInt2965++;
			if (i_10_ != -29792)
				method1391(-95, null, 56, null, -26, 117, 90, (byte) 127, 15);
			if ((Class45.aByteArrayArrayArray648[1][i][i_11_] & 0x2 ^ 0xffffffff) != -1)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tb.K(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final Class235 method1390(int i, int i_12_, byte i_13_) {
		try {
			anInt2959++;
			int i_14_ = -113 / ((84 - i_13_) / 42);
			Class235 class235 = Class220.method1423(0, i);
			if ((i_12_ ^ 0xffffffff) == 0)
				return class235;
			if (class235 == null || ((Class235) class235).f_ad == null || i_12_ >= ((Class235) class235).f_ad.length)
				return null;
			return ((Class235) class235).f_ad[i_12_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tb.H(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	static final void method1391(int i, byte[] is, int i_15_, byte[] is_16_, int i_17_, int i_18_, int i_19_, byte i_20_, int i_21_) {
		try {
			int i_22_ = -32 % ((-38 - i_20_) / 47);
			anInt2958++;
			int i_23_ = -(i_18_ >> 2);
			i_18_ = -(i_18_ & 0x3);
			for (int i_24_ = -i_21_; (i_24_ ^ 0xffffffff) > -1; i_24_++) {
				for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
					is_16_[i++] += -is[i_17_++];
					is_16_[i++] += -is[i_17_++];
					is_16_[i++] += -is[i_17_++];
					is_16_[i++] += -is[i_17_++];
				}
				for (int i_26_ = i_18_; i_26_ < 0; i_26_++)
					is_16_[i++] += -is[i_17_++];
				i_17_ += i_19_;
				i += i_15_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tb.J(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_15_ + ',' + (is_16_ != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	public Class211() {
		/* empty */
	}
}
