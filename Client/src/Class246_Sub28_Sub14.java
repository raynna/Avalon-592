/* Class246_Sub28_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub14 extends Class246_Sub28 {
	static int anInt6299;
	static int anInt6300;
	static int anInt6301;
	static int anInt6302;
	static Class67 aClass67_6303 = new Class67("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1");
	static HashMap aClass54_6304 = new HashMap(5);
	static Object anObject6305;
	static int anInt6306;
	static Class81 aClass81_6307 = new Class81(9, 0, 4, 1);
	static int anInt6308 = 0;

	static final boolean method2633(int i, int i_0_, int i_1_) {
		try {
			anInt6299++;
			if (i_0_ != -1376312589)
				method2633(109, 32, -43);
			if ((0x22 & i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jm.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int[] method2135(int i, int i_2_) {
		try {
			anInt6302++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_2_);
			int i_3_ = 38 / ((67 - i) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_4_ = Class246_Sub1_Sub11.anIntArray6245[i_2_];
				for (int i_5_ = 0; i_5_ < Class246_Sub37_Sub1.f_gb; i_5_++)
					is[i_5_] = method2637((byte) 40, i_4_, Class187.anIntArray2654[i_5_]) % 4096;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jm.E(" + i + ',' + i_2_ + ')');
		}
	}

	static final int method2634(int i, int i_6_, int i_7_) {
		try {
			if (i != 18059)
				method2636(null);
			anInt6301++;
			int i_8_ = i_6_ >>> 31;
			return -i_8_ + (i_8_ + i_6_) / i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jm.H(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method2635(byte i) {
		do {
			try {
				aClass54_6304 = null;
				aClass67_6303 = null;
				aClass81_6307 = null;
				anObject6305 = null;
				if (i > 76)
					break;
				anInt6306 = 34;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jm.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2636(Class59_Sub3 class59_sub3) {
		for (int i = ((Class59_Sub3) class59_sub3).aShort5057; i <= ((Class59_Sub3) class59_sub3).aShort5065; i++) {
			for (int i_9_ = ((Class59_Sub3) class59_sub3).aShort5064; i_9_ <= ((Class59_Sub3) class59_sub3).aShort5062; i_9_++) {
				Class147 class147 = (Class106.aClass147ArrayArrayArray1494[((Class59_Sub3) class59_sub3).aByte5053][i][i_9_]);
				if (class147 != null) {
					Class3 class3 = ((Class147) class147).aClass3_2160;
					Class3 class3_10_ = null;
					for (/**/; class3 != null; class3 = ((Class3) class3).aClass3_28) {
						if (((Class3) class3).aClass59_Sub3_24 == class59_sub3) {
							if (class3_10_ != null)
								((Class3) class3_10_).aClass3_28 = ((Class3) class3).aClass3_28;
							else
								((Class147) class147).aClass3_2160 = ((Class3) class3).aClass3_28;
							class3.method49(35);
							break;
						}
						class3_10_ = class3;
					}
					((Class147) class147).aByte2168 = (byte) 0;
					for (Class3 class3_11_ = ((Class147) class147).aClass3_2160; class3_11_ != null; class3_11_ = ((Class3) class3_11_).aClass3_28)
						((Class147) class147).aByte2168 |= ((Class3) class3_11_).anInt31;
				}
			}
		}
	}

	public Class246_Sub28_Sub14() {
		super(0, true);
	}

	private final int method2637(byte i, int i_12_, int i_13_) {
		try {
			anInt6300++;
			int i_14_ = 57 * i_12_ + i_13_;
			if (i <= 1)
				return -98;
			i_14_ = i_14_ << 1 ^ i_14_;
			return 4096 + -((0x7fffffff & i_14_ * (15731 * i_14_ * i_14_ + 789221) - -1376312589) / 262144);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jm.A(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}
}
