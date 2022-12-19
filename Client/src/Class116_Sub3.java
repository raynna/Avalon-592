/* Class116_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116_Sub3 extends Class116 {
	private int[] anIntArray5118;
	private byte[][] aByteArrayArray5119;
	private int[] anIntArray5120;
	private int[] anIntArray5121;
	private Class260_Sub1 aClass260_Sub1_5122;
	private int[] anIntArray5123;
	private int[] anIntArray5124;

	private final void method2191(byte[] is, int[] is_0_, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		boolean bool = false;
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				int i_10_;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
				if ((i_10_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_10_ & 0xff];
				else
					i_2_++;
			}
			for (int i_11_ = i_3_; i_11_ < 0; i_11_++) {
				int i_12_;
				if ((i_12_ = is[i++]) != 0)
					is_0_[i_2_++] = is_1_[i_12_ & 0xff];
				else
					i_2_++;
			}
			i_2_ += i_5_;
			i += i_6_;
		}
	}

	private final void method2192(byte[] is, int[] is_13_, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		int i_20_ = -(i_16_ >> 2);
		i_16_ = -(i_16_ & 0x3);
		for (int i_21_ = -i_17_; i_21_ < 0; i_21_++) {
			for (int i_22_ = i_20_; i_22_ < 0; i_22_++) {
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
			}
			for (int i_23_ = i_16_; i_23_ < 0; i_23_++) {
				if (is[i_14_++] != 0)
					is_13_[i_15_++] = i;
				else
					i_15_++;
			}
			i_15_ += i_18_;
			i_14_ += i_19_;
		}
	}

	final void OA(char c, int i, int i_24_, int i_25_, boolean bool) {
		i += anIntArray5121[c];
		i_24_ += anIntArray5120[c];
		int i_26_ = anIntArray5118[c];
		int i_27_ = anIntArray5124[c];
		int i_28_ = ((Class260_Sub1) aClass260_Sub1_5122).f_nb;
		int i_29_ = i + i_24_ * i_28_;
		int i_30_ = i_28_ - i_26_;
		int i_31_ = 0;
		int i_32_ = 0;
		if (i_24_ < ((Class260_Sub1) aClass260_Sub1_5122).f_eb) {
			int i_33_ = ((Class260_Sub1) aClass260_Sub1_5122).f_eb - i_24_;
			i_27_ -= i_33_;
			i_24_ = ((Class260_Sub1) aClass260_Sub1_5122).f_eb;
			i_32_ += i_33_ * i_26_;
			i_29_ += i_33_ * i_28_;
		}
		if (i_24_ + i_27_ > ((Class260_Sub1) aClass260_Sub1_5122).anInt3856)
			i_27_ -= (i_24_ + i_27_ - ((Class260_Sub1) aClass260_Sub1_5122).anInt3856);
		if (i < ((Class260_Sub1) aClass260_Sub1_5122).f_lb) {
			int i_34_ = ((Class260_Sub1) aClass260_Sub1_5122).f_lb - i;
			i_26_ -= i_34_;
			i = ((Class260_Sub1) aClass260_Sub1_5122).f_lb;
			i_32_ += i_34_;
			i_29_ += i_34_;
			i_31_ += i_34_;
			i_30_ += i_34_;
		}
		if (i + i_26_ > ((Class260_Sub1) aClass260_Sub1_5122).anInt3832) {
			int i_35_ = i + i_26_ - ((Class260_Sub1) aClass260_Sub1_5122).anInt3832;
			i_26_ -= i_35_;
			i_31_ += i_35_;
			i_30_ += i_35_;
		}
		if (i_26_ > 0 && i_27_ > 0) {
			if (bool)
				method2192(aByteArrayArray5119[c], (((Class260_Sub1) aClass260_Sub1_5122).anIntArray3834), i_25_, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
			else
				method2191(aByteArrayArray5119[c], (((Class260_Sub1) aClass260_Sub1_5122).anIntArray3834), anIntArray5123, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
		}
	}

	private final void method2193(byte[] is, int[] is_36_, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, Class128 class128, int i_46_, int i_47_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is_48_ = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_49_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_50_ = i_43_ - ((Class260_Sub1) aClass260_Sub1_5122).f_lb;
		int i_51_ = i_44_;
		if (i_47_ > i_51_) {
			i_51_ = i_47_;
			i_38_ += ((i_47_ - i_44_) * ((Class260_Sub1) aClass260_Sub1_5122).f_nb);
			i_37_ += (i_47_ - i_44_) * i_45_;
		}
		int i_52_ = (i_47_ + is_48_.length < i_44_ + i_40_ ? i_47_ + is_48_.length : i_44_ + i_40_);
		for (int i_53_ = i_51_; i_53_ < i_52_; i_53_++) {
			int i_54_ = is_48_[i_53_ - i_47_] + i_46_;
			int i_55_ = is_49_[i_53_ - i_47_];
			int i_56_ = i_39_;
			if (i_50_ > i_54_) {
				int i_57_ = i_50_ - i_54_;
				if (i_57_ >= i_55_) {
					i_37_ += i_39_ + i_42_;
					i_38_ += i_39_ + i_41_;
					continue;
				}
				i_55_ -= i_57_;
			} else {
				int i_58_ = i_54_ - i_50_;
				if (i_58_ >= i_39_) {
					i_37_ += i_39_ + i_42_;
					i_38_ += i_39_ + i_41_;
					continue;
				}
				i_37_ += i_58_;
				i_56_ -= i_58_;
				i_38_ += i_58_;
			}
			int i_59_ = 0;
			if (i_56_ < i_55_)
				i_55_ = i_56_;
			else
				i_59_ = i_56_ - i_55_;
			for (int i_60_ = -i_55_; i_60_ < 0; i_60_++) {
				if (is[i_37_++] != 0)
					is_36_[i_38_++] = i;
				else
					i_38_++;
			}
			i_37_ += i_59_ + i_37_;
			i_38_ += i_59_ + i_41_;
		}
	}

	private final void method2194(byte[] is, int[] is_61_, int[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, Class128 class128, int i_72_, int i_73_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is_74_ = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_75_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_76_ = i_69_ - ((Class260_Sub1) aClass260_Sub1_5122).f_lb;
		int i_77_ = i_70_;
		if (i_73_ > i_77_) {
			i_77_ = i_73_;
			i_64_ += ((i_73_ - i_70_) * ((Class260_Sub1) aClass260_Sub1_5122).f_nb);
			i_63_ += (i_73_ - i_70_) * i_71_;
		}
		int i_78_ = (i_73_ + is_74_.length < i_70_ + i_66_ ? i_73_ + is_74_.length : i_70_ + i_66_);
		boolean bool = false;
		for (int i_79_ = i_77_; i_79_ < i_78_; i_79_++) {
			int i_80_ = is_74_[i_79_ - i_73_] + i_72_;
			int i_81_ = is_75_[i_79_ - i_73_];
			int i_82_ = i_65_;
			if (i_76_ > i_80_) {
				int i_83_ = i_76_ - i_80_;
				if (i_83_ >= i_81_) {
					i_63_ += i_65_ + i_68_;
					i_64_ += i_65_ + i_67_;
					continue;
				}
				i_81_ -= i_83_;
			} else {
				int i_84_ = i_80_ - i_76_;
				if (i_84_ >= i_65_) {
					i_63_ += i_65_ + i_68_;
					i_64_ += i_65_ + i_67_;
					continue;
				}
				i_63_ += i_84_;
				i_82_ -= i_84_;
				i_64_ += i_84_;
			}
			int i_85_ = 0;
			if (i_82_ < i_81_)
				i_81_ = i_82_;
			else
				i_85_ = i_82_ - i_81_;
			for (int i_86_ = -i_81_; i_86_ < 0; i_86_++) {
				int i_87_;
				if ((i_87_ = is[i_63_++]) != 0)
					is_61_[i_64_++] = is_62_[i_87_ & 0xff];
				else
					i_64_++;
			}
			i_63_ += i_85_ + i_68_;
			i_64_ += i_85_ + i_67_;
		}
	}

	Class116_Sub3(Class260_Sub1 class260_sub1, Class73 class73, Class10[] class10s, int[] is, int[] is_88_) {
		super(class260_sub1, class73);
		aClass260_Sub1_5122 = class260_sub1;
		aClass260_Sub1_5122 = class260_sub1;
		anIntArray5118 = is;
		anIntArray5124 = is_88_;
		aByteArrayArray5119 = new byte[class10s.length][];
		anIntArray5120 = new int[class10s.length];
		anIntArray5121 = new int[class10s.length];
		for (int i = 0; i < class10s.length; i++) {
			aByteArrayArray5119[i] = ((Class10) class10s[i]).aByteArray157;
			anIntArray5120[i] = ((Class10) class10s[i]).anInt162;
			anIntArray5121[i] = ((Class10) class10s[i]).anInt158;
		}
		anIntArray5123 = ((Class10) class10s[0]).anIntArray160;
	}

	final void method787(char c, int i, int i_89_, int i_90_, boolean bool, Class128 class128, int i_91_, int i_92_) {
		if (class128 == null)
			OA(c, i, i_89_, i_90_, bool);
		else {
			i += anIntArray5121[c];
			i_89_ += anIntArray5120[c];
			int i_93_ = anIntArray5118[c];
			int i_94_ = anIntArray5124[c];
			int i_95_ = ((Class260_Sub1) aClass260_Sub1_5122).f_nb;
			int i_96_ = i + i_89_ * i_95_;
			int i_97_ = i_95_ - i_93_;
			int i_98_ = 0;
			int i_99_ = 0;
			if (i_89_ < ((Class260_Sub1) aClass260_Sub1_5122).f_eb) {
				int i_100_ = ((Class260_Sub1) aClass260_Sub1_5122).f_eb - i_89_;
				i_94_ -= i_100_;
				i_89_ = ((Class260_Sub1) aClass260_Sub1_5122).f_eb;
				i_99_ += i_100_ * i_93_;
				i_96_ += i_100_ * i_95_;
			}
			if (i_89_ + i_94_ > ((Class260_Sub1) aClass260_Sub1_5122).anInt3856)
				i_94_ -= (i_89_ + i_94_ - ((Class260_Sub1) aClass260_Sub1_5122).anInt3856);
			if (i < ((Class260_Sub1) aClass260_Sub1_5122).f_lb) {
				int i_101_ = ((Class260_Sub1) aClass260_Sub1_5122).f_lb - i;
				i_93_ -= i_101_;
				i = ((Class260_Sub1) aClass260_Sub1_5122).f_lb;
				i_99_ += i_101_;
				i_96_ += i_101_;
				i_98_ += i_101_;
				i_97_ += i_101_;
			}
			if (i + i_93_ > ((Class260_Sub1) aClass260_Sub1_5122).anInt3832) {
				int i_102_ = (i + i_93_ - ((Class260_Sub1) aClass260_Sub1_5122).anInt3832);
				i_93_ -= i_102_;
				i_98_ += i_102_;
				i_97_ += i_102_;
			}
			if (i_93_ > 0 && i_94_ > 0) {
				if (bool)
					method2193(aByteArrayArray5119[c], (((Class260_Sub1) aClass260_Sub1_5122).anIntArray3834), i_90_, i_99_, i_96_, i_93_, i_94_, i_97_, i_98_, i, i_89_, anIntArray5118[c], class128, i_91_, i_92_);
				else
					method2194(aByteArrayArray5119[c], (((Class260_Sub1) aClass260_Sub1_5122).anIntArray3834), anIntArray5123, i_90_, i_99_, i_96_, i_93_, i_94_, i_97_, i_98_, i, i_89_, anIntArray5118[c], class128, i_91_, i_92_);
			}
		}
	}
}
