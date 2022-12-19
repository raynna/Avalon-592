/* Class59_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class59_Sub3 extends Class59 {
	int anInt5052;
	byte aByte5053;
	boolean aBool5054;
	byte aByte5055;
	int anInt5056;
	short aShort5057;
	static int anInt5058;
	int anInt5059;
	int anInt5060;
	static int anInt5061;
	short aShort5062;
	static int anInt5063;
	short aShort5064;
	short aShort5065;

	abstract int method2168(int i);

	static final boolean method2169(int i, int i_0_, int i_1_) {
		try {
			anInt5063++;
			if (i != -18445)
				method2169(-27, 83, 57);
			if ((0x400 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pe.MA(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2170(int i, byte[][][] is, int i_2_, byte i_3_, int i_4_, int i_5_) {
		Class76.anInt997++;
		Class109_Sub1_Sub1.anInt6733 = 0;
		for (int i_6_ = Class246_Sub37_Sub4.anInt6880; i_6_ < Class154_Sub1.anInt4803; i_6_++) {
			Class147[][] class147s = Class106.aClass147ArrayArrayArray1494[i_6_];
			for (int i_7_ = Class56.anInt796; i_7_ < Class188.anInt2662; i_7_++) {
				for (int i_8_ = Class133.anInt1834; i_8_ < Class246_Sub1_Sub10.f_db; i_8_++) {
					Class147 class147 = class147s[i_7_][i_8_];
					if (class147 != null) {
						if (!(Class187_Sub1.aBoolArrayArray4866[i_7_ - Class244.anInt3454 + Class125.anInt1777][(i_8_ - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777)]) || (is != null && i_6_ >= i_2_ && is[i_6_][i_7_][i_8_] == i_3_)) {
							((Class147) class147).aBool2166 = false;
							((Class147) class147).aBool2171 = false;
							((Class147) class147).aByte2162 = (byte) 0;
							if (i_7_ >= Class244.anInt3454 - 16 && i_7_ <= Class244.anInt3454 + 16 && i_8_ >= Class59_Sub2_Sub2.anInt6025 - 16 && i_8_ <= Class59_Sub2_Sub2.anInt6025 + 16 && ((((Class147) class147).aClass59_Sub4_2172 != null) || (((Class147) class147).aClass59_Sub4_2152) != null || (((Class147) class147).aClass59_Sub2_2153) != null || (((Class147) class147).aClass59_Sub2_2159) != null || (((Class147) class147).aClass59_Sub1_2156) != null || (((Class147) class147).aClass3_2160 != null)))
								Class245.aClass106_3462.method723(class147, (byte) -39);
						} else {
							((Class147) class147).aBool2166 = true;
							((Class147) class147).aBool2171 = true;
							if (((Class147) class147).aClass3_2160 != null)
								((Class147) class147).aBool2167 = true;
							else
								((Class147) class147).aBool2167 = false;
							Class109_Sub1_Sub1.anInt6733++;
						}
					}
				}
			}
		}
		boolean bool = (Class154.aClass210Array2215 == Class59_Sub3_Sub4.aClass210Array6993);
		for (int i_9_ = Class246_Sub37_Sub4.anInt6880; i_9_ < Class154_Sub1.anInt4803; i_9_++) {
			float f = bool ? 251.5F : 201.5F - 50.0F * (float) i_9_ - 0.5F;
			if (Class259_Sub3.aClass260_5357.method1684() && i_9_ >= i_2_ && is != null) {
				int i_10_ = Class187_Sub1.aBoolArrayArray4866.length;
				if (Class56.anInt796 + Class187_Sub1.aBoolArrayArray4866.length > Class240.anInt3377)
					i_10_ -= (Class56.anInt796 + Class187_Sub1.aBoolArrayArray4866.length - Class240.anInt3377);
				int i_11_ = Class187_Sub1.aBoolArrayArray4866[0].length;
				if ((Class133.anInt1834 + Class187_Sub1.aBoolArrayArray4866[0].length) > Class_t_Sub1.f_sc)
					i_11_ -= (Class133.anInt1834 + Class187_Sub1.aBoolArrayArray4866[0].length - Class_t_Sub1.f_sc);
				for (int i_12_ = Class130_Sub8.anInt5615; i_12_ < i_10_; i_12_++) {
					int i_13_ = i_12_ + Class56.anInt796 - Class130_Sub8.anInt5615;
					for (int i_14_ = Class_cs.anInt7143; i_14_ < i_11_; i_14_++) {
						Class251.aBoolArrayArray3556[i_12_][i_14_] = false;
						if (Class187_Sub1.aBoolArrayArray4866[i_12_][i_14_]) {
							int i_15_ = (i_14_ + Class133.anInt1834 - Class_cs.anInt7143);
							for (int i_16_ = i_9_; i_16_ >= 0; i_16_--) {
								if ((Class106.aClass147ArrayArrayArray1494[i_16_][i_13_][i_15_]) != null && (((Class147) (Class106.aClass147ArrayArrayArray1494[i_16_][i_13_][i_15_])).aByte2174 == i_9_)) {
									Class251.aBoolArrayArray3556[i_12_][i_14_] = ((Class147) (Class106.aClass147ArrayArrayArray1494[i_16_][i_13_][i_15_])).aBool2166;
									break;
								}
							}
						}
					}
				}
				Class245.aClass106_3462.method726(i_9_, true, (Class59_Sub3_Sub4.aClass210Array6993[i_9_]), f, (byte) 46);
			} else
				Class245.aClass106_3462.method726(i_9_, false, (Class59_Sub3_Sub4.aClass210Array6993[i_9_]), f, (byte) 46);
			Class245.aClass106_3462.method721(5000);
		}
		if (!Class40_Sub8.method2213(true))
			Class40_Sub8.method2213(false);
	}

	static final int method2171(int i, byte i_17_, int[] is, byte[][] is_18_, byte[] is_19_, int i_20_, int[] is_21_, byte[][] is_22_) {
		try {
			anInt5061++;
			int i_23_ = is[i_20_];
			int i_24_ = is_21_[i_20_] + i_23_;
			int i_25_ = is[i];
			int i_26_ = i_25_ - -is_21_[i];
			int i_27_ = i_23_;
			if ((i_23_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff))
				i_27_ = i_25_;
			int i_28_ = i_24_;
			if ((i_24_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff))
				i_28_ = i_26_;
			int i_29_ = is_19_[i_20_] & 0xff;
			if ((0xff & is_19_[i] ^ 0xffffffff) > (i_29_ ^ 0xffffffff))
				i_29_ = is_19_[i] & 0xff;
			byte[] is_30_ = is_18_[i_20_];
			byte[] is_31_ = is_22_[i];
			int i_32_ = -i_23_ + i_27_;
			int i_33_ = i_27_ - i_25_;
			int i_34_ = 80 % ((59 - i_17_) / 32);
			for (int i_35_ = i_27_; (i_28_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
				int i_36_ = is_31_[i_33_++] + is_30_[i_32_++];
				if ((i_36_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff))
					i_29_ = i_36_;
			}
			return -i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pe.NA(" + i + ',' + i_17_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_18_ != null ? "{...}" : "null") + ',' + (is_19_ != null ? "{...}" : "null") + ',' + i_20_ + ',' + (is_21_ != null ? "{...}" : "null") + ',' + (is_22_ != null ? "{...}" : "null") + ')'));
		}
	}

	void method2172(int i) {
		try {
			if (i != 11264)
				method2169(113, 83, 92);
			anInt5058++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pe.S(" + i + ')');
		}
	}

	Class59_Sub3(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, boolean bool, byte i_44_) {
		try {
			((Class59_Sub3) this).aShort5064 = (short) i_42_;
			((Class59_Sub3) this).aByte5055 = i_44_;
			((Class59_Sub3) this).aShort5057 = (short) i_40_;
			((Class59_Sub3) this).anInt5060 = i_37_;
			((Class59_Sub3) this).aShort5062 = (short) i_43_;
			((Class59_Sub3) this).anInt5052 = i_38_;
			((Class59_Sub3) this).aShort5065 = (short) i_41_;
			((Class59_Sub3) this).anInt5059 = i_39_;
			((Class59_Sub3) this).aBool5054 = bool;
			((Class59_Sub3) this).aByte5053 = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pe.<init>(" + i + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + bool + ',' + i_44_ + ')'));
		}
	}
}
