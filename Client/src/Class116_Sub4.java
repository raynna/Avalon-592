/* Class116_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116_Sub4 extends Class116 {
	private int[] anIntArray5315;
	private byte[][] aByteArrayArray5316;
	private int[] anIntArray5317;
	private int[] anIntArray5318;
	private int[] anIntArray5319;
	private Class260_Sub1 aClass260_Sub1_5320;

	private final void method2250(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
				if (is[i_1_++] != 0)
					is_0_[i_2_++] = i;
				else
					i_2_++;
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	final void OA(char c, int i, int i_11_, int i_12_, boolean bool) {
		i += anIntArray5319[c];
		i_11_ += anIntArray5315[c];
		int i_13_ = anIntArray5317[c];
		int i_14_ = anIntArray5318[c];
		int i_15_ = ((Class260_Sub1) aClass260_Sub1_5320).f_nb;
		int i_16_ = i + i_11_ * i_15_;
		int i_17_ = i_15_ - i_13_;
		int i_18_ = 0;
		int i_19_ = 0;
		if (i_11_ < ((Class260_Sub1) aClass260_Sub1_5320).f_eb) {
			int i_20_ = ((Class260_Sub1) aClass260_Sub1_5320).f_eb - i_11_;
			i_14_ -= i_20_;
			i_11_ = ((Class260_Sub1) aClass260_Sub1_5320).f_eb;
			i_19_ += i_20_ * i_13_;
			i_16_ += i_20_ * i_15_;
		}
		if (i_11_ + i_14_ > ((Class260_Sub1) aClass260_Sub1_5320).anInt3856)
			i_14_ -= (i_11_ + i_14_ - ((Class260_Sub1) aClass260_Sub1_5320).anInt3856);
		if (i < ((Class260_Sub1) aClass260_Sub1_5320).f_lb) {
			int i_21_ = ((Class260_Sub1) aClass260_Sub1_5320).f_lb - i;
			i_13_ -= i_21_;
			i = ((Class260_Sub1) aClass260_Sub1_5320).f_lb;
			i_19_ += i_21_;
			i_16_ += i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
		}
		if (i + i_13_ > ((Class260_Sub1) aClass260_Sub1_5320).anInt3832) {
			int i_22_ = i + i_13_ - ((Class260_Sub1) aClass260_Sub1_5320).anInt3832;
			i_13_ -= i_22_;
			i_18_ += i_22_;
			i_17_ += i_22_;
		}
		if (i_13_ > 0 && i_14_ > 0) {
			if ((i_12_ & ~0xffffff) == -16777216)
				method2250(aByteArrayArray5316[c], (((Class260_Sub1) aClass260_Sub1_5320).anIntArray3834), i_12_, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
			else if ((i_12_ & ~0xffffff) != 0)
				method2253(aByteArrayArray5316[c], (((Class260_Sub1) aClass260_Sub1_5320).anIntArray3834), i_12_, i_19_, i_16_, i_13_, i_14_, i_17_, i_18_);
		}
	}

	final void method787(char c, int i, int i_23_, int i_24_, boolean bool, Class128 class128, int i_25_, int i_26_) {
		if (class128 == null)
			OA(c, i, i_23_, i_24_, bool);
		else {
			i += anIntArray5319[c];
			i_23_ += anIntArray5315[c];
			int i_27_ = anIntArray5317[c];
			int i_28_ = anIntArray5318[c];
			int i_29_ = ((Class260_Sub1) aClass260_Sub1_5320).f_nb;
			int i_30_ = i + i_23_ * i_29_;
			int i_31_ = i_29_ - i_27_;
			int i_32_ = 0;
			int i_33_ = 0;
			if (i_23_ < ((Class260_Sub1) aClass260_Sub1_5320).f_eb) {
				int i_34_ = ((Class260_Sub1) aClass260_Sub1_5320).f_eb - i_23_;
				i_28_ -= i_34_;
				i_23_ = ((Class260_Sub1) aClass260_Sub1_5320).f_eb;
				i_33_ += i_34_ * i_27_;
				i_30_ += i_34_ * i_29_;
			}
			if (i_23_ + i_28_ > ((Class260_Sub1) aClass260_Sub1_5320).anInt3856)
				i_28_ -= (i_23_ + i_28_ - ((Class260_Sub1) aClass260_Sub1_5320).anInt3856);
			if (i < ((Class260_Sub1) aClass260_Sub1_5320).f_lb) {
				int i_35_ = ((Class260_Sub1) aClass260_Sub1_5320).f_lb - i;
				i_27_ -= i_35_;
				i = ((Class260_Sub1) aClass260_Sub1_5320).f_lb;
				i_33_ += i_35_;
				i_30_ += i_35_;
				i_32_ += i_35_;
				i_31_ += i_35_;
			}
			if (i + i_27_ > ((Class260_Sub1) aClass260_Sub1_5320).anInt3832) {
				int i_36_ = (i + i_27_ - ((Class260_Sub1) aClass260_Sub1_5320).anInt3832);
				i_27_ -= i_36_;
				i_32_ += i_36_;
				i_31_ += i_36_;
			}
			if (i_27_ > 0 && i_28_ > 0) {
				if ((i_24_ & ~0xffffff) == -16777216)
					method2251(aByteArrayArray5316[c], (((Class260_Sub1) aClass260_Sub1_5320).anIntArray3834), i_24_, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_, i, i_23_, anIntArray5317[c], class128, i_25_, i_26_);
				else
					method2252(aByteArrayArray5316[c], (((Class260_Sub1) aClass260_Sub1_5320).anIntArray3834), i_24_, i_33_, i_30_, i_27_, i_28_, i_31_, i_32_, i, i_23_, anIntArray5317[c], class128, i_25_, i_26_);
			}
		}
	}

	private final void method2251(byte[] is, int[] is_37_, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, Class128 class128, int i_47_, int i_48_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is_49_ = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_50_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_51_ = i_45_;
		if (i_48_ > i_51_) {
			i_51_ = i_48_;
			i_39_ += ((i_48_ - i_45_) * ((Class260_Sub1) aClass260_Sub1_5320).f_nb);
			i_38_ += (i_48_ - i_45_) * i_46_;
		}
		int i_52_ = (i_48_ + is_49_.length < i_45_ + i_41_ ? i_48_ + is_49_.length : i_45_ + i_41_);
		for (int i_53_ = i_51_; i_53_ < i_52_; i_53_++) {
			int i_54_ = i_47_ + is_49_[i_53_ - i_48_];
			int i_55_ = is_50_[i_53_ - i_48_];
			int i_56_ = i_40_;
			if (i_44_ > i_54_) {
				int i_57_ = i_44_ - i_54_;
				if (i_57_ >= i_55_) {
					i_38_ += i_40_ + i_43_;
					i_39_ += i_40_ + i_42_;
					continue;
				}
				i_55_ -= i_57_;
			} else {
				int i_58_ = i_54_ - i_44_;
				if (i_58_ >= i_40_) {
					i_38_ += i_40_ + i_43_;
					i_39_ += i_40_ + i_42_;
					continue;
				}
				i_38_ += i_58_;
				i_56_ -= i_58_;
				i_39_ += i_58_;
			}
			int i_59_ = 0;
			if (i_56_ < i_55_)
				i_55_ = i_56_;
			else
				i_59_ = i_56_ - i_55_;
			for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
				if (is[i_38_++] != 0)
					is_37_[i_39_++] = i;
				else
					i_39_++;
			}
			i_38_ += i_59_ + i_43_;
			i_39_ += i_59_ + i_42_;
		}
	}

	private final void method2252(byte[] is, int[] is_61_, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, Class128 class128, int i_71_, int i_72_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is_73_ = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_74_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_75_ = i_68_ - ((Class260_Sub1) aClass260_Sub1_5320).f_lb;
		int i_76_ = i_69_;
		if (i_72_ > i_76_) {
			i_76_ = i_72_;
			i_63_ += ((i_72_ - i_69_) * ((Class260_Sub1) aClass260_Sub1_5320).f_nb);
			i_62_ += (i_72_ - i_69_) * i_70_;
		}
		int i_77_ = (i_72_ + is_73_.length < i_69_ + i_65_ ? i_72_ + is_73_.length : i_69_ + i_65_);
		int i_78_ = i >>> 24;
		int i_79_ = 255 - i_78_;
		for (int i_80_ = i_76_; i_80_ < i_77_; i_80_++) {
			int i_81_ = is_73_[i_80_ - i_72_] + i_71_;
			int i_82_ = is_74_[i_80_ - i_72_];
			int i_83_ = i_64_;
			if (i_75_ > i_81_) {
				int i_84_ = i_75_ - i_81_;
				if (i_84_ >= i_82_) {
					i_62_ += i_64_ + i_67_;
					i_63_ += i_64_ + i_66_;
					continue;
				}
				i_82_ -= i_84_;
			} else {
				int i_85_ = i_81_ - i_75_;
				if (i_85_ >= i_64_) {
					i_62_ += i_64_ + i_67_;
					i_63_ += i_64_ + i_66_;
					continue;
				}
				i_62_ += i_85_;
				i_83_ -= i_85_;
				i_63_ += i_85_;
			}
			int i_86_ = 0;
			if (i_83_ < i_82_)
				i_82_ = i_83_;
			else
				i_86_ = i_83_ - i_82_;
			for (int i_87_ = -i_82_; i_87_ < 0; i_87_++) {
				if (is[i_62_++] != 0) {
					int i_88_ = ((((i & 0xff00ff) * i_78_ & ~0xff00ff) + ((i & 0xff00) * i_78_ & 0xff0000)) >> 8);
					int i_89_ = is_61_[i_63_];
					is_61_[i_63_++] = ((((i_89_ & 0xff00ff) * i_79_ & ~0xff00ff) + ((i_89_ & 0xff00) * i_79_ & 0xff0000)) >> 8) + i_88_;
				} else
					i_63_++;
			}
			i_62_ += i_86_ + i_67_;
			i_63_ += i_86_ + i_66_;
		}
	}

	private final void method2253(byte[] is, int[] is_90_, int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_) {
		int i_97_ = i >>> 24;
		int i_98_ = 255 - i_97_;
		for (int i_99_ = -i_94_; i_99_ < 0; i_99_++) {
			for (int i_100_ = -i_93_; i_100_ < 0; i_100_++) {
				if (is[i_91_++] != 0) {
					int i_101_ = ((((i & 0xff00ff) * i_97_ & ~0xff00ff) + ((i & 0xff00) * i_97_ & 0xff0000)) >> 8);
					int i_102_ = is_90_[i_92_];
					is_90_[i_92_++] = ((((i_102_ & 0xff00ff) * i_98_ & ~0xff00ff) + ((i_102_ & 0xff00) * i_98_ & 0xff0000)) >> 8) + i_101_;
				} else
					i_92_++;
			}
			i_92_ += i_95_;
			i_91_ += i_96_;
		}
	}

	Class116_Sub4(Class260_Sub1 class260_sub1, Class73 class73, Class10[] class10s, int[] is, int[] is_103_) {
		super(class260_sub1, class73);
		aClass260_Sub1_5320 = class260_sub1;
		anIntArray5317 = is;
		anIntArray5318 = is_103_;
		aByteArrayArray5316 = new byte[class10s.length][];
		anIntArray5315 = new int[class10s.length];
		anIntArray5319 = new int[class10s.length];
		for (int i = 0; i < class10s.length; i++) {
			aByteArrayArray5316[i] = ((Class10) class10s[i]).aByteArray157;
			anIntArray5315[i] = ((Class10) class10s[i]).anInt162;
			anIntArray5319[i] = ((Class10) class10s[i]).anInt158;
		}
	}
}
