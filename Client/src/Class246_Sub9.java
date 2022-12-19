/* Class246_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub9 extends Node {
	static Class119[] aClass119Array4000;
	private byte[][] aByteArrayArray4001;
	private static boolean aBool4002 = false;
	private float[] aFloatArray4003;
	private static float[] aFloatArray4004;
	private static int anInt4005;
	private boolean aBool4006;
	private int anInt4007;
	private static byte[] aByteArray4008;
	private static int[] anIntArray4009;
	private static int anInt4010;
	private static int anInt4011;
	private static float[] aFloatArray4012;
	private int anInt4013;
	private int anInt4014;
	private static float[] aFloatArray4015;
	private static boolean[] aBoolArray4016;
	private static float[] aFloatArray4017;
	private static float[] aFloatArray4018;
	private static int[] anIntArray4019;
	private static int[] anIntArray4020;
	private static Class62[] aClass62Array4021;
	private static float[] aFloatArray4022;
	private int anInt4023;
	private static float[] aFloatArray4024;
	private int anInt4025;
	private static int anInt4026;
	private static Class237[] aClass237Array4027;
	private int anInt4028;
	private boolean aBool4029;
	private byte[] aByteArray4030;
	private int anInt4031;
	private int anInt4032;
	private static Class181[] aClass181Array4033;

	static final int method1846(int i) {
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_;
		for (/**/; i >= 8 - anInt4010; i -= i_2_) {
			i_2_ = 8 - anInt4010;
			int i_3_ = (1 << i_2_) - 1;
			i_0_ += (aByteArray4008[anInt4011] >> anInt4010 & i_3_) << i_1_;
			anInt4010 = 0;
			anInt4011++;
			i_1_ += i_2_;
		}
		if (i > 0) {
			i_2_ = (1 << i) - 1;
			i_0_ += (aByteArray4008[anInt4011] >> anInt4010 & i_2_) << i_1_;
			anInt4010 += i;
		}
		return i_0_;
	}

	private static final void method1847(byte[] is, int i) {
		aByteArray4008 = is;
		anInt4011 = i;
		anInt4010 = 0;
	}

	static final Class246_Sub9 method1848(Class_fs class_fs, int i) {
		if (!method1852(class_fs)) {
			class_fs.method112(-1, i);
			return null;
		}
		byte[] is = class_fs.method109(i, -1);
		if (is == null)
			return null;
		return new Class246_Sub9(is);
	}

	static final int method1849() {
		int i = aByteArray4008[anInt4011] >> anInt4010 & 0x1;
		anInt4010++;
		anInt4011 += anInt4010 >> 3;
		anInt4010 &= 0x7;
		return i;
	}

	static final Class246_Sub9 method1850(Class_fs class_fs, int i, int i_4_) {
		if (!method1852(class_fs)) {
			class_fs.method85(i_4_, (byte) -124, i);
			return null;
		}
		byte[] is = class_fs.method91(i_4_, i, 118);
		if (is == null)
			return null;
		return new Class246_Sub9(is);
	}

	private static final void method1851(byte[] is) {
		method1847(is, 0);
		anInt4026 = 1 << method1846(4);
		anInt4005 = 1 << method1846(4);
		aFloatArray4015 = new float[anInt4005];
		for (int i = 0; i < 2; i++) {
			int i_5_ = i != 0 ? anInt4005 : anInt4026;
			int i_6_ = i_5_ >> 1;
			int i_7_ = i_5_ >> 2;
			int i_8_ = i_5_ >> 3;
			float[] fs = new float[i_6_];
			for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
				fs[2 * i_9_] = (float) Math.cos((double) (4 * i_9_) * 3.141592653589793 / (double) i_5_);
				fs[2 * i_9_ + 1] = -(float) Math.sin((double) (4 * i_9_) * 3.141592653589793 / (double) i_5_);
			}
			float[] fs_10_ = new float[i_6_];
			for (int i_11_ = 0; i_11_ < i_7_; i_11_++) {
				fs_10_[2 * i_11_] = (float) Math.cos((double) (2 * i_11_ + 1) * 3.141592653589793 / (double) (2 * i_5_));
				fs_10_[2 * i_11_ + 1] = (float) Math.sin((double) (2 * i_11_ + 1) * 3.141592653589793 / (double) (2 * i_5_));
			}
			float[] fs_12_ = new float[i_7_];
			for (int i_13_ = 0; i_13_ < i_8_; i_13_++) {
				fs_12_[2 * i_13_] = (float) Math.cos((double) (4 * i_13_ + 2) * 3.141592653589793 / (double) i_5_);
				fs_12_[2 * i_13_ + 1] = -(float) Math.sin((double) (4 * i_13_ + 2) * 3.141592653589793 / (double) i_5_);
			}
			int[] is_14_ = new int[i_8_];
			int i_15_ = Class179.method1169(i_8_ - 1, (byte) -14);
			for (int i_16_ = 0; i_16_ < i_8_; i_16_++)
				is_14_[i_16_] = Class47.method316(i_16_, 2, i_15_);
			if (i != 0) {
				aFloatArray4022 = fs;
				aFloatArray4012 = fs_10_;
				aFloatArray4024 = fs_12_;
				anIntArray4019 = is_14_;
			} else {
				aFloatArray4017 = fs;
				aFloatArray4018 = fs_10_;
				aFloatArray4004 = fs_12_;
				anIntArray4009 = is_14_;
			}
		}
		int i = method1846(8) + 1;
		aClass119Array4000 = new Class119[i];
		for (int i_17_ = 0; i_17_ < i; i_17_++)
			aClass119Array4000[i_17_] = new Class119();
		int i_18_ = method1846(6) + 1;
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
			method1846(16);
		int i_20_ = method1846(6) + 1;
		aClass237Array4027 = new Class237[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			aClass237Array4027[i_21_] = new Class237();
		int i_22_ = method1846(6) + 1;
		aClass181Array4033 = new Class181[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
			aClass181Array4033[i_23_] = new Class181();
		int i_24_ = method1846(6) + 1;
		aClass62Array4021 = new Class62[i_24_];
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
			aClass62Array4021[i_25_] = new Class62();
		int i_26_ = method1846(6) + 1;
		aBoolArray4016 = new boolean[i_26_];
		anIntArray4020 = new int[i_26_];
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
			aBoolArray4016[i_27_] = method1849() != 0;
			method1846(16);
			method1846(16);
			anIntArray4020[i_27_] = method1846(8);
		}
	}

	private static final boolean method1852(Class_fs class_fs) {
		if (!aBool4002) {
			byte[] is = class_fs.method91(0, 0, 94);
			if (is == null)
				return false;
			method1851(is);
			aBool4002 = true;
		}
		return true;
	}

	private final void method1853(byte[] is) {
		BufferStream stream = new BufferStream(is);
		anInt4028 = stream.readInt((byte) 106);
		anInt4025 = stream.readInt((byte) 95);
		anInt4013 = stream.readInt((byte) 73);
		anInt4014 = stream.readInt((byte) 105);
		if (anInt4014 < 0) {
			anInt4014 = anInt4014 ^ 0xffffffff;
			aBool4029 = true;
		}
		int i = stream.readInt((byte) 115);
		aByteArrayArray4001 = new byte[i][];
		for (int i_28_ = 0; i_28_ < i; i_28_++) {
			int i_29_ = 0;
			int i_30_;
			do {
				i_30_ = stream.readUnsignedByte(255);
				i_29_ += i_30_;
			} while (i_30_ >= 255);
			byte[] is_31_ = new byte[i_29_];
			stream.readBytes((byte) 22, i_29_, 0, is_31_);
			aByteArrayArray4001[i_28_] = is_31_;
		}
	}

	final Class246_Sub3_Sub1 method1854(int[] is) {
		if (is != null && is[0] <= 0)
			return null;
		if (aByteArray4030 == null) {
			anInt4023 = 0;
			aFloatArray4003 = new float[anInt4005];
			aByteArray4030 = new byte[anInt4025];
			anInt4032 = 0;
			anInt4031 = 0;
		}
		for (/**/; anInt4031 < aByteArrayArray4001.length; anInt4031++) {
			if (is != null && is[0] <= 0)
				return null;
			float[] fs = method1857(anInt4031);
			if (fs != null) {
				int i = anInt4032;
				int i_32_ = fs.length;
				if (i_32_ > anInt4025 - i)
					i_32_ = anInt4025 - i;
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
					int i_34_ = (int) (128.0F + fs[i_33_] * 128.0F);
					if ((i_34_ & ~0xff) != 0)
						i_34_ = (i_34_ ^ 0xffffffff) >> 31;
					aByteArray4030[i++] = (byte) (i_34_ - 128);
				}
				if (is != null)
					is[0] -= i - anInt4032;
				anInt4032 = i;
			}
		}
		aFloatArray4003 = null;
		byte[] is_35_ = aByteArray4030;
		aByteArray4030 = null;
		return new Class246_Sub3_Sub1(anInt4028, is_35_, anInt4013, anInt4014, aBool4029);
	}

	static final float method1855(int i) {
		int i_36_ = i & 0x1fffff;
		int i_37_ = i & ~0x7fffffff;
		int i_38_ = (i & 0x7fe00000) >> 21;
		if (i_37_ != 0)
			i_36_ = -i_36_;
		return (float) ((double) i_36_ * Math.pow(2.0, (double) (i_38_ - 788)));
	}

	public static void method1856() {
		aByteArray4008 = null;
		aClass119Array4000 = null;
		aClass237Array4027 = null;
		aClass181Array4033 = null;
		aClass62Array4021 = null;
		aBoolArray4016 = null;
		anIntArray4020 = null;
		aFloatArray4015 = null;
		aFloatArray4017 = null;
		aFloatArray4018 = null;
		aFloatArray4004 = null;
		aFloatArray4022 = null;
		aFloatArray4012 = null;
		aFloatArray4024 = null;
		anIntArray4009 = null;
		anIntArray4019 = null;
	}

	private final float[] method1857(int i) {
		method1847(aByteArrayArray4001[i], 0);
		method1849();
		int i_39_ = method1846(Class179.method1169(anIntArray4020.length - 1, (byte) -14));
		boolean bool = aBoolArray4016[i_39_];
		int i_40_ = bool ? anInt4005 : anInt4026;
		boolean bool_41_ = false;
		boolean bool_42_ = false;
		if (bool) {
			bool_41_ = method1849() != 0;
			bool_42_ = method1849() != 0;
		}
		int i_43_ = i_40_ >> 1;
		int i_44_;
		int i_45_;
		int i_46_;
		if (bool && !bool_41_) {
			i_44_ = (i_40_ >> 2) - (anInt4026 >> 2);
			i_45_ = (i_40_ >> 2) + (anInt4026 >> 2);
			i_46_ = anInt4026 >> 1;
		} else {
			i_44_ = 0;
			i_45_ = i_43_;
			i_46_ = i_40_ >> 1;
		}
		int i_47_;
		int i_48_;
		int i_49_;
		if (bool && !bool_42_) {
			i_47_ = i_40_ - (i_40_ >> 2) - (anInt4026 >> 2);
			i_48_ = i_40_ - (i_40_ >> 2) + (anInt4026 >> 2);
			i_49_ = anInt4026 >> 1;
		} else {
			i_47_ = i_43_;
			i_48_ = i_40_;
			i_49_ = i_40_ >> 1;
		}
		Class62 class62 = aClass62Array4021[anIntArray4020[i_39_]];
		int i_50_ = ((Class62) class62).anInt848;
		int i_51_ = ((Class62) class62).anIntArray847[i_50_];
		boolean bool_52_ = !aClass237Array4027[i_51_].method1529();
		boolean bool_53_ = bool_52_;
		for (int i_54_ = 0; i_54_ < ((Class62) class62).anInt850; i_54_++) {
			Class181 class181 = aClass181Array4033[((Class62) class62).anIntArray849[i_54_]];
			float[] fs = aFloatArray4015;
			class181.method1178(fs, i_40_ >> 1, bool_53_);
		}
		if (!bool_52_) {
			int i_55_ = ((Class62) class62).anInt848;
			int i_56_ = ((Class62) class62).anIntArray847[i_55_];
			aClass237Array4027[i_56_].method1524(aFloatArray4015, i_40_ >> 1);
		}
		if (bool_52_) {
			for (int i_57_ = i_40_ >> 1; i_57_ < i_40_; i_57_++)
				aFloatArray4015[i_57_] = 0.0F;
		} else {
			int i_58_ = i_40_ >> 1;
			int i_59_ = i_40_ >> 2;
			int i_60_ = i_40_ >> 3;
			float[] fs = aFloatArray4015;
			for (int i_61_ = 0; i_61_ < i_58_; i_61_++)
				fs[i_61_] *= 0.5F;
			for (int i_62_ = i_58_; i_62_ < i_40_; i_62_++)
				fs[i_62_] = -fs[i_40_ - i_62_ - 1];
			float[] fs_63_ = bool ? aFloatArray4022 : aFloatArray4017;
			float[] fs_64_ = bool ? aFloatArray4012 : aFloatArray4018;
			float[] fs_65_ = bool ? aFloatArray4024 : aFloatArray4004;
			int[] is = bool ? anIntArray4019 : anIntArray4009;
			for (int i_66_ = 0; i_66_ < i_59_; i_66_++) {
				float f = fs[4 * i_66_] - fs[i_40_ - 4 * i_66_ - 1];
				float f_67_ = fs[4 * i_66_ + 2] - fs[i_40_ - 4 * i_66_ - 3];
				float f_68_ = fs_63_[2 * i_66_];
				float f_69_ = fs_63_[2 * i_66_ + 1];
				fs[i_40_ - 4 * i_66_ - 1] = f * f_68_ - f_67_ * f_69_;
				fs[i_40_ - 4 * i_66_ - 3] = f * f_69_ + f_67_ * f_68_;
			}
			for (int i_70_ = 0; i_70_ < i_60_; i_70_++) {
				float f = fs[i_58_ + 3 + 4 * i_70_];
				float f_71_ = fs[i_58_ + 1 + 4 * i_70_];
				float f_72_ = fs[4 * i_70_ + 3];
				float f_73_ = fs[4 * i_70_ + 1];
				fs[i_58_ + 3 + 4 * i_70_] = f + f_72_;
				fs[i_58_ + 1 + 4 * i_70_] = f_71_ + f_73_;
				float f_74_ = fs_63_[i_58_ - 4 - 4 * i_70_];
				float f_75_ = fs_63_[i_58_ - 3 - 4 * i_70_];
				fs[4 * i_70_ + 3] = (f - f_72_) * f_74_ - (f_71_ - f_73_) * f_75_;
				fs[4 * i_70_ + 1] = (f_71_ - f_73_) * f_74_ + (f - f_72_) * f_75_;
			}
			int i_76_ = Class179.method1169(i_40_ - 1, (byte) -14);
			for (int i_77_ = 0; i_77_ < i_76_ - 3; i_77_++) {
				int i_78_ = i_40_ >> i_77_ + 2;
				int i_79_ = 8 << i_77_;
				for (int i_80_ = 0; i_80_ < 2 << i_77_; i_80_++) {
					int i_81_ = i_40_ - i_78_ * 2 * i_80_;
					int i_82_ = i_40_ - i_78_ * (2 * i_80_ + 1);
					for (int i_83_ = 0; i_83_ < i_40_ >> i_77_ + 4; i_83_++) {
						int i_84_ = 4 * i_83_;
						float f = fs[i_81_ - 1 - i_84_];
						float f_85_ = fs[i_81_ - 3 - i_84_];
						float f_86_ = fs[i_82_ - 1 - i_84_];
						float f_87_ = fs[i_82_ - 3 - i_84_];
						fs[i_81_ - 1 - i_84_] = f + f_86_;
						fs[i_81_ - 3 - i_84_] = f_85_ + f_87_;
						float f_88_ = fs_63_[i_83_ * i_79_];
						float f_89_ = fs_63_[i_83_ * i_79_ + 1];
						fs[i_82_ - 1 - i_84_] = (f - f_86_) * f_88_ - (f_85_ - f_87_) * f_89_;
						fs[i_82_ - 3 - i_84_] = (f_85_ - f_87_) * f_88_ + (f - f_86_) * f_89_;
					}
				}
			}
			for (int i_90_ = 1; i_90_ < i_60_ - 1; i_90_++) {
				int i_91_ = is[i_90_];
				if (i_90_ < i_91_) {
					int i_92_ = 8 * i_90_;
					int i_93_ = 8 * i_91_;
					float f = fs[i_92_ + 1];
					fs[i_92_ + 1] = fs[i_93_ + 1];
					fs[i_93_ + 1] = f;
					f = fs[i_92_ + 3];
					fs[i_92_ + 3] = fs[i_93_ + 3];
					fs[i_93_ + 3] = f;
					f = fs[i_92_ + 5];
					fs[i_92_ + 5] = fs[i_93_ + 5];
					fs[i_93_ + 5] = f;
					f = fs[i_92_ + 7];
					fs[i_92_ + 7] = fs[i_93_ + 7];
					fs[i_93_ + 7] = f;
				}
			}
			for (int i_94_ = 0; i_94_ < i_58_; i_94_++)
				fs[i_94_] = fs[2 * i_94_ + 1];
			for (int i_95_ = 0; i_95_ < i_60_; i_95_++) {
				fs[i_40_ - 1 - 2 * i_95_] = fs[4 * i_95_];
				fs[i_40_ - 2 - 2 * i_95_] = fs[4 * i_95_ + 1];
				fs[i_40_ - i_59_ - 1 - 2 * i_95_] = fs[4 * i_95_ + 2];
				fs[i_40_ - i_59_ - 2 - 2 * i_95_] = fs[4 * i_95_ + 3];
			}
			for (int i_96_ = 0; i_96_ < i_60_; i_96_++) {
				float f = fs_65_[2 * i_96_];
				float f_97_ = fs_65_[2 * i_96_ + 1];
				float f_98_ = fs[i_58_ + 2 * i_96_];
				float f_99_ = fs[i_58_ + 2 * i_96_ + 1];
				float f_100_ = fs[i_40_ - 2 - 2 * i_96_];
				float f_101_ = fs[i_40_ - 1 - 2 * i_96_];
				float f_102_ = f_97_ * (f_98_ - f_100_) + f * (f_99_ + f_101_);
				fs[i_58_ + 2 * i_96_] = (f_98_ + f_100_ + f_102_) * 0.5F;
				fs[i_40_ - 2 - 2 * i_96_] = (f_98_ + f_100_ - f_102_) * 0.5F;
				f_102_ = f_97_ * (f_99_ + f_101_) - f * (f_98_ - f_100_);
				fs[i_58_ + 2 * i_96_ + 1] = (f_99_ - f_101_ + f_102_) * 0.5F;
				fs[i_40_ - 1 - 2 * i_96_] = (-f_99_ + f_101_ + f_102_) * 0.5F;
			}
			for (int i_103_ = 0; i_103_ < i_59_; i_103_++) {
				fs[i_103_] = (fs[2 * i_103_ + i_58_] * fs_64_[2 * i_103_] + fs[2 * i_103_ + 1 + i_58_] * fs_64_[2 * i_103_ + 1]);
				fs[i_58_ - 1 - i_103_] = (fs[2 * i_103_ + i_58_] * fs_64_[2 * i_103_ + 1] - fs[2 * i_103_ + 1 + i_58_] * fs_64_[2 * i_103_]);
			}
			for (int i_104_ = 0; i_104_ < i_59_; i_104_++)
				fs[i_40_ - i_59_ + i_104_] = -fs[i_104_];
			for (int i_105_ = 0; i_105_ < i_59_; i_105_++)
				fs[i_105_] = fs[i_59_ + i_105_];
			for (int i_106_ = 0; i_106_ < i_59_; i_106_++)
				fs[i_59_ + i_106_] = -fs[i_59_ - i_106_ - 1];
			for (int i_107_ = 0; i_107_ < i_59_; i_107_++)
				fs[i_58_ + i_107_] = fs[i_40_ - i_107_ - 1];
			for (int i_108_ = i_44_; i_108_ < i_45_; i_108_++) {
				float f = (float) Math.sin(((double) (i_108_ - i_44_) + 0.5) / (double) i_46_ * 0.5 * 3.141592653589793);
				aFloatArray4015[i_108_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_109_ = i_47_; i_109_ < i_48_; i_109_++) {
				float f = (float) Math.sin((((double) (i_109_ - i_47_) + 0.5) / (double) i_49_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray4015[i_109_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (anInt4023 > 0) {
			int i_110_ = anInt4023 + i_40_ >> 2;
			fs = new float[i_110_];
			if (!aBool4006) {
				for (int i_111_ = 0; i_111_ < anInt4007; i_111_++) {
					int i_112_ = (anInt4023 >> 1) + i_111_;
					fs[i_111_] += aFloatArray4003[i_112_];
				}
			}
			if (!bool_52_) {
				for (int i_113_ = i_44_; i_113_ < i_40_ >> 1; i_113_++) {
					int i_114_ = fs.length - (i_40_ >> 1) + i_113_;
					fs[i_114_] += aFloatArray4015[i_113_];
				}
			}
		}
		float[] fs_115_ = aFloatArray4003;
		aFloatArray4003 = aFloatArray4015;
		aFloatArray4015 = fs_115_;
		anInt4023 = i_40_;
		anInt4007 = i_48_ - (i_40_ >> 1);
		aBool4006 = bool_52_;
		return fs;
	}

	private Class246_Sub9(byte[] is) {
		method1853(is);
	}
}
