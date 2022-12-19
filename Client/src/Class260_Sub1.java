
/* Class260_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;

final class Class260_Sub1 extends Class260 {
	private boolean aBool3825 = false;
	private Canvas aCanvas3826;
	private boolean aBool3827 = false;
	private Class85 aClass85_3828 = new Class85(4);
	private int anInt3829;
	private Class246_Sub19 aClass246_Sub19_3830;
	int anInt3831;
	int anInt3832;
	int anInt3833 = 3500;
	int[] anIntArray3834;
	private Class36[] aClass36Array3835;
	int anInt3836;
	private int anInt3837;
	private HashMap aClass54_3838;
	int anInt3839 = 50;
	boolean aBool3840;
	private int anInt3841;
	int anInt3842;
	int anInt3843;
	private float aFloat3844;
	int anInt3845;
	int anInt3846;
	int anInt3847;
	int anInt3848;
	private int anInt3849;
	int anInt3850;
	int anInt3851;
	int anInt3852;
	private int anInt3853;
	int anInt3854;
	int anInt3855;
	int anInt3856;
	Class_c_Sub2 aClass_c_Sub2_3857;
	int anInt3858;
	int f_ab;
	private float f_bb;
	int f_cb;
	boolean f_db;
	int f_eb;
	int f_fb;
	private boolean f_gb;
	int f_hb;
	int f_ib;
	private Class_l f_jb;
	private HashMap f_kb;
	int f_lb;
	private int f_mb;
	int f_nb;
	private Class_l f_ob;
	private int f_pb;

	final int YA() {
		return anInt3837;
	}

	final boolean method1742() {
		return false;
	}

	final boolean method1732() {
		return true;
	}

	final void H(int i, int i_0_, int i_1_, int i_2_) {
		((Class260_Sub1) this).f_cb = i;
		((Class260_Sub1) this).anInt3858 = i_0_;
		((Class260_Sub1) this).anInt3851 = i_1_;
		((Class260_Sub1) this).anInt3852 = i_2_;
		method1793();
	}

	final void method1728(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class128 class128, int i_8_, int i_9_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_10_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_11_ = (((Class260_Sub1) this).f_eb > i_9_ ? ((Class260_Sub1) this).f_eb : i_9_);
		int i_12_ = (((Class260_Sub1) this).anInt3856 < i_9_ + is.length ? ((Class260_Sub1) this).anInt3856 : i_9_ + is.length);
		i_4_ -= i;
		i_5_ -= i_3_;
		if (i_4_ + i_5_ < 0) {
			i += i_4_;
			i_4_ = -i_4_;
			i_3_ += i_5_;
			i_5_ = -i_5_;
		}
		if (i_4_ > i_5_) {
			i_3_ <<= 16;
			i_3_ += 32768;
			i_5_ <<= 16;
			int i_13_ = (int) Math.floor((double) i_5_ / (double) i_4_ + 0.5);
			i_4_ += i;
			if (i < ((Class260_Sub1) this).f_lb) {
				i_3_ += i_13_ * (((Class260_Sub1) this).f_lb - i);
				i = ((Class260_Sub1) this).f_lb;
			}
			if (i_4_ >= ((Class260_Sub1) this).anInt3832)
				i_4_ = ((Class260_Sub1) this).anInt3832 - 1;
			int i_14_ = i_6_ >>> 24;
			if (i_7_ == 0 || i_7_ == 1 && i_14_ == 255) {
				for (/**/; i <= i_4_; i++) {
					int i_15_ = i_3_ >> 16;
					int i_16_ = i_15_ - i_9_;
					if (i_15_ >= i_11_ && i_15_ < i_12_) {
						int i_17_ = i_8_ + is[i_16_];
						if (i >= i_17_ && i < i_17_ + is_10_[i_16_])
							((Class260_Sub1) this).anIntArray3834[i + i_15_ * ((Class260_Sub1) this).f_nb] = i_6_;
					}
					i_3_ += i_13_;
				}
				return;
			}
			if (i_7_ == 1) {
				i_6_ = (((i_6_ & 0xff00ff) * i_14_ >> 8 & 0xff00ff) + ((i_6_ & 0xff00) * i_14_ >> 8 & 0xff00) + (i_14_ << 24));
				int i_18_ = 256 - i_14_;
				for (/**/; i <= i_4_; i++) {
					int i_19_ = i_3_ >> 16;
					int i_20_ = i_19_ - i_9_;
					if (i_19_ >= i_11_ && i_19_ < i_12_) {
						int i_21_ = i_8_ + is[i_20_];
						if (i >= i_21_ && i < i_21_ + is_10_[i_20_]) {
							int i_22_ = i + i_19_ * ((Class260_Sub1) this).f_nb;
							int i_23_ = ((Class260_Sub1) this).anIntArray3834[i_22_];
							i_23_ = (((i_23_ & 0xff00ff) * i_18_ >> 8 & 0xff00ff) + ((i_23_ & 0xff00) * i_18_ >> 8 & 0xff00));
							((Class260_Sub1) this).anIntArray3834[i_22_] = i_6_ + i_23_;
						}
					}
					i_3_ += i_13_;
				}
				return;
			}
			if (i_7_ == 2) {
				for (/**/; i <= i_4_; i++) {
					int i_24_ = i_3_ >> 16;
					int i_25_ = i_24_ - i_9_;
					if (i_24_ >= i_11_ && i_24_ < i_12_) {
						int i_26_ = i_8_ + is[i_25_];
						if (i >= i_26_ && i < i_26_ + is_10_[i_25_]) {
							int i_27_ = i + i_24_ * ((Class260_Sub1) this).f_nb;
							int i_28_ = ((Class260_Sub1) this).anIntArray3834[i_27_];
							int i_29_ = i_6_ + i_28_;
							int i_30_ = (i_6_ & 0xff00ff) + (i_28_ & 0xff00ff);
							i_28_ = (i_30_ & 0x1000100) + (i_29_ - i_30_ & 0x10000);
							((Class260_Sub1) this).anIntArray3834[i_27_] = i_29_ - i_28_ | i_28_ - (i_28_ >>> 8);
						}
					}
					i_3_ += i_13_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_4_ <<= 16;
		int i_31_ = (int) Math.floor((double) i_4_ / (double) i_5_ + 0.5);
		i_5_ += i_3_;
		if (i_3_ < i_11_) {
			i += i_31_ * (i_11_ - i_3_);
			i_3_ = i_11_;
		}
		if (i_5_ >= i_12_)
			i_5_ = i_12_ - 1;
		int i_32_ = i_6_ >>> 24;
		if (i_7_ == 0 || i_7_ == 1 && i_32_ == 255) {
			for (/**/; i_3_ <= i_5_; i_3_++) {
				int i_33_ = i >> 16;
				int i_34_ = i_3_ - i_9_;
				int i_35_ = i_8_ + is[i_34_];
				if (i_33_ >= ((Class260_Sub1) this).f_lb && i_33_ < ((Class260_Sub1) this).anInt3832 && i_33_ >= i_35_ && i_33_ < i_35_ + is_10_[i_34_])
					((Class260_Sub1) this).anIntArray3834[i_33_ + i_3_ * ((Class260_Sub1) this).f_nb] = i_6_;
				i += i_31_;
			}
		} else if (i_7_ == 1) {
			i_6_ = (((i_6_ & 0xff00ff) * i_32_ >> 8 & 0xff00ff) + ((i_6_ & 0xff00) * i_32_ >> 8 & 0xff00) + (i_32_ << 24));
			int i_36_ = 256 - i_32_;
			for (/**/; i_3_ <= i_5_; i_3_++) {
				int i_37_ = i >> 16;
				int i_38_ = i_3_ - i_9_;
				int i_39_ = i_8_ + is[i_38_];
				if (i_37_ >= ((Class260_Sub1) this).f_lb && i_37_ < ((Class260_Sub1) this).anInt3832 && i_37_ >= i_39_ && i_37_ < i_39_ + is_10_[i_38_]) {
					int i_40_ = i_37_ + i_3_ * ((Class260_Sub1) this).f_nb;
					int i_41_ = ((Class260_Sub1) this).anIntArray3834[i_40_];
					i_41_ = (((i_41_ & 0xff00ff) * i_36_ >> 8 & 0xff00ff) + ((i_41_ & 0xff00) * i_36_ >> 8 & 0xff00));
					((Class260_Sub1) this).anIntArray3834[i_37_ + i_3_ * ((Class260_Sub1) this).f_nb] = i_6_ + i_41_;
				}
				i += i_31_;
			}
		} else if (i_7_ == 2) {
			for (/**/; i_3_ <= i_5_; i_3_++) {
				int i_42_ = i >> 16;
				int i_43_ = i_3_ - i_9_;
				int i_44_ = i_8_ + is[i_43_];
				if (i_42_ >= ((Class260_Sub1) this).f_lb && i_42_ < ((Class260_Sub1) this).anInt3832 && i_42_ >= i_44_ && i_42_ < i_44_ + is_10_[i_43_]) {
					int i_45_ = i_42_ + i_3_ * ((Class260_Sub1) this).f_nb;
					int i_46_ = ((Class260_Sub1) this).anIntArray3834[i_45_];
					int i_47_ = i_6_ + i_46_;
					int i_48_ = (i_6_ & 0xff00ff) + (i_46_ & 0xff00ff);
					i_46_ = (i_48_ & 0x1000100) + (i_47_ - i_48_ & 0x10000);
					((Class260_Sub1) this).anIntArray3834[i_45_] = i_47_ - i_46_ | i_46_ - (i_46_ >>> 8);
				}
				i += i_31_;
			}
		} else
			throw new IllegalArgumentException();
	}

	private final void method1793() {
		((Class260_Sub1) this).f_ab = ((Class260_Sub1) this).f_lb - ((Class260_Sub1) this).f_cb;
		((Class260_Sub1) this).f_ib = ((Class260_Sub1) this).anInt3832 - ((Class260_Sub1) this).f_cb;
		((Class260_Sub1) this).anInt3850 = ((Class260_Sub1) this).f_eb - ((Class260_Sub1) this).anInt3858;
		((Class260_Sub1) this).anInt3842 = (((Class260_Sub1) this).anInt3856 - ((Class260_Sub1) this).anInt3858);
		for (int i = 0; i < ((Class260_Sub1) this).anInt3855; i++) {
			Class184 class184 = ((Class36) aClass36Array3835[i]).aClass184_494;
			((Class184) class184).anInt2562 = ((Class260_Sub1) this).f_cb - ((Class260_Sub1) this).f_lb;
			((Class184) class184).anInt2568 = (((Class260_Sub1) this).anInt3858 - ((Class260_Sub1) this).f_eb);
			((Class184) class184).anInt2557 = (((Class260_Sub1) this).anInt3832 - ((Class260_Sub1) this).f_lb);
			((Class184) class184).anInt2566 = (((Class260_Sub1) this).anInt3856 - ((Class260_Sub1) this).f_eb);
		}
		int i = (((Class260_Sub1) this).f_eb * ((Class260_Sub1) this).f_nb + ((Class260_Sub1) this).f_lb);
		for (int i_49_ = ((Class260_Sub1) this).f_eb; i_49_ < ((Class260_Sub1) this).anInt3856; i_49_++) {
			for (int i_50_ = 0; i_50_ < ((Class260_Sub1) this).anInt3855; i_50_++)
				((Class184) ((Class36) aClass36Array3835[i_50_]).aClass184_494).anIntArray2569[i_49_ - ((Class260_Sub1) this).f_eb] = i;
			i += ((Class260_Sub1) this).f_nb;
		}
	}

	final int method1794(int i) {
		return (((Class238) ((Class260) this).anInterface6_3714.method17(-31305, i)).aShort3354 & 0xffff);
	}

	final void ca(int i, Class128 class128, int i_51_, int i_52_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_53_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_54_;
		if (((Class260_Sub1) this).anInt3856 < i_52_ + is.length)
			i_54_ = ((Class260_Sub1) this).anInt3856 - i_52_;
		else
			i_54_ = is.length;
		int i_55_;
		if (((Class260_Sub1) this).f_eb > i_52_) {
			i_55_ = ((Class260_Sub1) this).f_eb - i_52_;
			i_52_ = ((Class260_Sub1) this).f_eb;
		} else
			i_55_ = 0;
		if (i_54_ - i_55_ > 0) {
			int i_56_ = i_52_ * ((Class260_Sub1) this).f_nb;
			for (int i_57_ = i_55_; i_57_ < i_54_; i_57_++) {
				int i_58_ = i_51_ + is[i_57_];
				int i_59_ = is_53_[i_57_];
				if (((Class260_Sub1) this).f_lb > i_58_) {
					i_59_ -= ((Class260_Sub1) this).f_lb - i_58_;
					i_58_ = ((Class260_Sub1) this).f_lb;
				}
				if (((Class260_Sub1) this).anInt3832 < i_58_ + i_59_)
					i_59_ = ((Class260_Sub1) this).anInt3832 - i_58_;
				i_58_ += i_56_;
				for (int i_60_ = -i_59_; i_60_ < 0; i_60_++)
					((Class260_Sub1) this).anIntArray3834[i_58_++] = i;
				i_56_ += ((Class260_Sub1) this).f_nb;
			}
		}
	}

	final int method1710(int i, int i_61_) {
		i |= 0x20800;
		return i & i_61_ ^ i_61_;
	}

	final void method1735(int i, int i_62_, int i_63_, int i_64_) {
		/* empty */
	}

	final void NA(int i, int i_65_, int i_66_, int i_67_, int i_68_) {
		if (i_66_ < 0)
			i_66_ = -i_66_;
		int i_69_ = i_65_ - i_66_;
		if (i_69_ < ((Class260_Sub1) this).f_eb)
			i_69_ = ((Class260_Sub1) this).f_eb;
		int i_70_ = i_65_ + i_66_ + 1;
		if (i_70_ > ((Class260_Sub1) this).anInt3856)
			i_70_ = ((Class260_Sub1) this).anInt3856;
		int i_71_ = i_69_;
		int i_72_ = i_66_ * i_66_;
		int i_73_ = 0;
		int i_74_ = i_65_ - i_71_;
		int i_75_ = i_74_ * i_74_;
		int i_76_ = i_75_ - i_74_;
		if (i_65_ > i_70_)
			i_65_ = i_70_;
		int i_77_ = i_67_ >>> 24;
		if (i_68_ == 0 || i_68_ == 1 && i_77_ == 255) {
			while (i_71_ < i_65_) {
				for (/**/; i_76_ <= i_72_ || i_75_ <= i_72_; i_76_ += i_73_++ + i_73_)
					i_75_ += i_73_ + i_73_;
				int i_78_ = i - i_73_ + 1;
				if (i_78_ < ((Class260_Sub1) this).f_lb)
					i_78_ = ((Class260_Sub1) this).f_lb;
				int i_79_ = i + i_73_;
				if (i_79_ > ((Class260_Sub1) this).anInt3832)
					i_79_ = ((Class260_Sub1) this).anInt3832;
				int i_80_ = i_78_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_81_ = i_78_; i_81_ < i_79_; i_81_++)
					((Class260_Sub1) this).anIntArray3834[i_80_++] = i_67_;
				i_71_++;
				i_75_ -= i_74_-- + i_74_;
				i_76_ -= i_74_ + i_74_;
			}
			i_73_ = i_66_;
			i_74_ = i_71_ - i_65_;
			i_76_ = i_74_ * i_74_ + i_72_;
			i_75_ = i_76_ - i_73_;
			i_76_ -= i_74_;
			while (i_71_ < i_70_) {
				for (/**/; i_76_ > i_72_ && i_75_ > i_72_; i_75_ -= i_73_ + i_73_)
					i_76_ -= i_73_-- + i_73_;
				int i_82_ = i - i_73_;
				if (i_82_ < ((Class260_Sub1) this).f_lb)
					i_82_ = ((Class260_Sub1) this).f_lb;
				int i_83_ = i + i_73_;
				if (i_83_ > ((Class260_Sub1) this).anInt3832 - 1)
					i_83_ = ((Class260_Sub1) this).anInt3832 - 1;
				int i_84_ = i_82_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_85_ = i_82_; i_85_ <= i_83_; i_85_++)
					((Class260_Sub1) this).anIntArray3834[i_84_++] = i_67_;
				i_71_++;
				i_76_ += i_74_ + i_74_;
				i_75_ += i_74_++ + i_74_;
			}
		} else if (i_68_ == 1) {
			i_67_ = (((i_67_ & 0xff00ff) * i_77_ >> 8 & 0xff00ff) + ((i_67_ & 0xff00) * i_77_ >> 8 & 0xff00) + (i_77_ << 24));
			int i_86_ = 256 - i_77_;
			while (i_71_ < i_65_) {
				for (/**/; i_76_ <= i_72_ || i_75_ <= i_72_; i_76_ += i_73_++ + i_73_)
					i_75_ += i_73_ + i_73_;
				int i_87_ = i - i_73_ + 1;
				if (i_87_ < ((Class260_Sub1) this).f_lb)
					i_87_ = ((Class260_Sub1) this).f_lb;
				int i_88_ = i + i_73_;
				if (i_88_ > ((Class260_Sub1) this).anInt3832)
					i_88_ = ((Class260_Sub1) this).anInt3832;
				int i_89_ = i_87_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_90_ = i_87_; i_90_ < i_88_; i_90_++) {
					int i_91_ = ((Class260_Sub1) this).anIntArray3834[i_89_];
					i_91_ = (((i_91_ & 0xff00ff) * i_86_ >> 8 & 0xff00ff) + ((i_91_ & 0xff00) * i_86_ >> 8 & 0xff00));
					((Class260_Sub1) this).anIntArray3834[i_89_++] = i_67_ + i_91_;
				}
				i_71_++;
				i_75_ -= i_74_-- + i_74_;
				i_76_ -= i_74_ + i_74_;
			}
			i_73_ = i_66_;
			i_74_ = -i_74_;
			i_76_ = i_74_ * i_74_ + i_72_;
			i_75_ = i_76_ - i_73_;
			i_76_ -= i_74_;
			while (i_71_ < i_70_) {
				for (/**/; i_76_ > i_72_ && i_75_ > i_72_; i_75_ -= i_73_ + i_73_)
					i_76_ -= i_73_-- + i_73_;
				int i_92_ = i - i_73_;
				if (i_92_ < ((Class260_Sub1) this).f_lb)
					i_92_ = ((Class260_Sub1) this).f_lb;
				int i_93_ = i + i_73_;
				if (i_93_ > ((Class260_Sub1) this).anInt3832 - 1)
					i_93_ = ((Class260_Sub1) this).anInt3832 - 1;
				int i_94_ = i_92_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_95_ = i_92_; i_95_ <= i_93_; i_95_++) {
					int i_96_ = ((Class260_Sub1) this).anIntArray3834[i_94_];
					i_96_ = (((i_96_ & 0xff00ff) * i_86_ >> 8 & 0xff00ff) + ((i_96_ & 0xff00) * i_86_ >> 8 & 0xff00));
					((Class260_Sub1) this).anIntArray3834[i_94_++] = i_67_ + i_96_;
				}
				i_71_++;
				i_76_ += i_74_ + i_74_;
				i_75_ += i_74_++ + i_74_;
			}
		} else if (i_68_ == 2) {
			while (i_71_ < i_65_) {
				for (/**/; i_76_ <= i_72_ || i_75_ <= i_72_; i_76_ += i_73_++ + i_73_)
					i_75_ += i_73_ + i_73_;
				int i_97_ = i - i_73_ + 1;
				if (i_97_ < ((Class260_Sub1) this).f_lb)
					i_97_ = ((Class260_Sub1) this).f_lb;
				int i_98_ = i + i_73_;
				if (i_98_ > ((Class260_Sub1) this).anInt3832)
					i_98_ = ((Class260_Sub1) this).anInt3832;
				int i_99_ = i_97_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_100_ = i_97_; i_100_ < i_98_; i_100_++) {
					int i_101_ = ((Class260_Sub1) this).anIntArray3834[i_99_];
					int i_102_ = i_67_ + i_101_;
					int i_103_ = (i_67_ & 0xff00ff) + (i_101_ & 0xff00ff);
					i_101_ = (i_103_ & 0x1000100) + (i_102_ - i_103_ & 0x10000);
					((Class260_Sub1) this).anIntArray3834[i_99_++] = i_102_ - i_101_ | i_101_ - (i_101_ >>> 8);
				}
				i_71_++;
				i_75_ -= i_74_-- + i_74_;
				i_76_ -= i_74_ + i_74_;
			}
			i_73_ = i_66_;
			i_74_ = -i_74_;
			i_76_ = i_74_ * i_74_ + i_72_;
			i_75_ = i_76_ - i_73_;
			i_76_ -= i_74_;
			while (i_71_ < i_70_) {
				for (/**/; i_76_ > i_72_ && i_75_ > i_72_; i_75_ -= i_73_ + i_73_)
					i_76_ -= i_73_-- + i_73_;
				int i_104_ = i - i_73_;
				if (i_104_ < ((Class260_Sub1) this).f_lb)
					i_104_ = ((Class260_Sub1) this).f_lb;
				int i_105_ = i + i_73_;
				if (i_105_ > ((Class260_Sub1) this).anInt3832 - 1)
					i_105_ = ((Class260_Sub1) this).anInt3832 - 1;
				int i_106_ = i_104_ + i_71_ * ((Class260_Sub1) this).f_nb;
				for (int i_107_ = i_104_; i_107_ <= i_105_; i_107_++) {
					int i_108_ = ((Class260_Sub1) this).anIntArray3834[i_106_];
					int i_109_ = i_67_ + i_108_;
					int i_110_ = (i_67_ & 0xff00ff) + (i_108_ & 0xff00ff);
					i_108_ = (i_110_ & 0x1000100) + (i_109_ - i_110_ & 0x10000);
					((Class260_Sub1) this).anIntArray3834[i_106_++] = i_109_ - i_108_ | i_108_ - (i_108_ >>> 8);
				}
				i_71_++;
				i_76_ += i_74_ + i_74_;
				i_75_ += i_74_++ + i_74_;
			}
		} else
			throw new IllegalArgumentException();
	}

	final void method1722() {
		/* empty */
	}

	private final void method1795() {
		if (f_bb != 0.0F) {
			float f = (float) anInt3837;
			float f_111_ = (float) ((Class260_Sub1) this).anInt3839;
			float f_112_ = -(2.0F * f_111_ * f) / (f - f_111_);
			float f_113_ = aFloat3844 / (f_bb + aFloat3844);
			float f_114_ = f_113_ * f_113_;
			float f_115_ = -f_112_ * (1.0F - f_113_) * (1.0F - f_113_) / f_bb;
			((Class260_Sub1) this).anInt3833 = (int) (0.5F + (((float) anInt3837 - f_112_ * f_114_) / ((f + f_111_) / (f - f_111_) - f_115_)));
		} else
			((Class260_Sub1) this).anInt3833 = anInt3837;
	}

	final int method1701() {
		return 0;
	}

	final void method1714(int i) {
		aClass36Array3835[i].method253(0, Thread.currentThread());
	}

	final void O(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_) {
		if (i < ((Class260_Sub1) this).f_lb) {
			i_117_ -= ((Class260_Sub1) this).f_lb - i;
			i = ((Class260_Sub1) this).f_lb;
		}
		if (i_116_ < ((Class260_Sub1) this).f_eb) {
			i_118_ -= ((Class260_Sub1) this).f_eb - i_116_;
			i_116_ = ((Class260_Sub1) this).f_eb;
		}
		if (i + i_117_ > ((Class260_Sub1) this).anInt3832)
			i_117_ = ((Class260_Sub1) this).anInt3832 - i;
		if (i_116_ + i_118_ > ((Class260_Sub1) this).anInt3856)
			i_118_ = ((Class260_Sub1) this).anInt3856 - i_116_;
		if (i_117_ > 0 && i_118_ > 0 && i <= ((Class260_Sub1) this).anInt3832 && i_116_ <= ((Class260_Sub1) this).anInt3856) {
			int i_121_ = ((Class260_Sub1) this).f_nb - i_117_;
			int i_122_ = i + i_116_ * ((Class260_Sub1) this).f_nb;
			int i_123_ = i_119_ >>> 24;
			if (i_120_ == 0 || i_120_ == 1 && i_123_ == 255) {
				int i_124_ = i_117_ >> 3;
				int i_125_ = i_117_ & 0x7;
				i_117_ = i_122_ - 1;
				for (int i_126_ = -i_118_; i_126_ < 0; i_126_++) {
					if (i_124_ > 0) {
						i = i_124_;
						do {
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
						} while (--i > 0);
					}
					if (i_125_ > 0) {
						i = i_125_;
						do
							((Class260_Sub1) this).anIntArray3834[++i_117_] = i_119_;
						while (--i > 0);
					}
					i_117_ += i_121_;
				}
			} else if (i_120_ == 1) {
				i_119_ = (((i_119_ & 0xff00ff) * i_123_ >> 8 & 0xff00ff) + ((i_119_ & 0xff00) * i_123_ >> 8 & 0xff00) + (i_123_ << 24));
				int i_127_ = 256 - i_123_;
				for (int i_128_ = 0; i_128_ < i_118_; i_128_++) {
					for (int i_129_ = -i_117_; i_129_ < 0; i_129_++) {
						int i_130_ = ((Class260_Sub1) this).anIntArray3834[i_122_];
						i_130_ = (((i_130_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_130_ & 0xff00) * i_127_ >> 8 & 0xff00));
						((Class260_Sub1) this).anIntArray3834[i_122_++] = i_119_ + i_130_;
					}
					i_122_ += i_121_;
				}
			} else if (i_120_ == 2) {
				for (int i_131_ = 0; i_131_ < i_118_; i_131_++) {
					for (int i_132_ = -i_117_; i_132_ < 0; i_132_++) {
						int i_133_ = ((Class260_Sub1) this).anIntArray3834[i_122_];
						int i_134_ = i_119_ + i_133_;
						int i_135_ = (i_119_ & 0xff00ff) + (i_133_ & 0xff00ff);
						i_133_ = (i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000);
						((Class260_Sub1) this).anIntArray3834[i_122_++] = i_134_ - i_133_ | i_133_ - (i_133_ >>> 8);
					}
					i_122_ += i_121_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void p(int i) {
		O(0, 0, ((Class260_Sub1) this).f_nb, anInt3853, i, 0);
	}

	final float xa() {
		return f_bb;
	}

	final void MA(int i) {
		/* empty */
	}

	final void method1729(Class211 class211) {
		/* empty */
	}

	final Class246_Sub41 method1751(int i, int i_136_, int i_137_, int i_138_, int i_139_, float f) {
		return null;
	}

	final boolean method1796(int i) {
		return ((Class260) this).anInterface6_3714.method13(i, 19378);
	}

	final void method1707() {
		/* empty */
	}

	private Class260_Sub1(int i, Interface6 interface6) {
		super(i, interface6);
		((Class260_Sub1) this).anInt3836 = 75518;
		((Class260_Sub1) this).aBool3840 = false;
		((Class260_Sub1) this).anInt3845 = 0;
		((Class260_Sub1) this).anInt3852 = 512;
		anInt3837 = 3500;
		((Class260_Sub1) this).anInt3832 = 0;
		((Class260_Sub1) this).f_eb = 0;
		((Class260_Sub1) this).anInt3851 = 512;
		((Class260_Sub1) this).anInt3843 = 0;
		((Class260_Sub1) this).anInt3856 = 0;
		anInt3841 = 0;
		((Class260_Sub1) this).f_hb = 45823;
		anInt3849 = 0;
		((Class260_Sub1) this).anInt3848 = 78642;
		((Class260_Sub1) this).f_fb = 0;
		((Class260_Sub1) this).anInt3846 = anInt3837 - 255;
		f_mb = 0;
		((Class260_Sub1) this).f_lb = 0;
		f_gb = false;
		aClass54_3838 = new HashMap(16);
		f_pb = -1;
		f_kb = new HashMap(20);
		((Class260_Sub1) this).aClass_c_Sub2_3857 = new Class_c_Sub2();
		method1724(1);
		method1714(0);
		Class190.method1244(true, false, false);
		aBool3827 = true;
	}

	final void DA(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, byte[] is, int i_145_, int i_146_) {
		if (i_141_ > 0 && i_142_ > 0) {
			int i_147_ = 0;
			int i_148_ = 0;
			int i_149_ = (i_145_ << 16) / i_141_;
			int i_150_ = (is.length / i_145_ << 16) / i_142_;
			int i_151_ = i + i_140_ * ((Class260_Sub1) this).f_nb;
			int i_152_ = ((Class260_Sub1) this).f_nb - i_141_;
			if (i_140_ + i_142_ > ((Class260_Sub1) this).anInt3856)
				i_142_ -= i_140_ + i_142_ - ((Class260_Sub1) this).anInt3856;
			if (i_140_ < ((Class260_Sub1) this).f_eb) {
				int i_153_ = ((Class260_Sub1) this).f_eb - i_140_;
				i_142_ -= i_153_;
				i_151_ += i_153_ * ((Class260_Sub1) this).f_nb;
				i_148_ += i_150_ * i_153_;
			}
			if (i + i_141_ > ((Class260_Sub1) this).anInt3832) {
				int i_154_ = i + i_141_ - ((Class260_Sub1) this).anInt3832;
				i_141_ -= i_154_;
				i_152_ += i_154_;
			}
			if (i < ((Class260_Sub1) this).f_lb) {
				int i_155_ = ((Class260_Sub1) this).f_lb - i;
				i_141_ -= i_155_;
				i_151_ += i_155_;
				i_147_ += i_149_ * i_155_;
				i_152_ += i_155_;
			}
			int i_156_ = i_143_ >>> 24;
			int i_157_ = i_144_ >>> 24;
			if (i_146_ == 0 || i_146_ == 1 && i_156_ == 255 && i_157_ == 255) {
				int i_158_ = i_147_;
				for (int i_159_ = -i_142_; i_159_ < 0; i_159_++) {
					int i_160_ = (i_148_ >> 16) * i_145_;
					for (int i_161_ = -i_141_; i_161_ < 0; i_161_++) {
						if (is[(i_147_ >> 16) + i_160_] != 0)
							((Class260_Sub1) this).anIntArray3834[i_151_++] = i_144_;
						else
							((Class260_Sub1) this).anIntArray3834[i_151_++] = i_143_;
						i_147_ += i_149_;
					}
					i_148_ += i_150_;
					i_147_ = i_158_;
					i_151_ += i_152_;
				}
			} else if (i_146_ == 1) {
				int i_162_ = i_147_;
				for (int i_163_ = -i_142_; i_163_ < 0; i_163_++) {
					int i_164_ = (i_148_ >> 16) * i_145_;
					for (int i_165_ = -i_141_; i_165_ < 0; i_165_++) {
						int i_166_ = i_143_;
						if (is[(i_147_ >> 16) + i_164_] != 0)
							i_166_ = i_144_;
						int i_167_ = i_166_ >>> 24;
						int i_168_ = 255 - i_167_;
						int i_169_ = ((Class260_Sub1) this).anIntArray3834[i_151_];
						((Class260_Sub1) this).anIntArray3834[i_151_++] = ((((i_166_ & 0xff00ff) * i_167_ + (i_169_ & 0xff00ff) * i_168_) & ~0xff00ff) + (((i_166_ & 0xff00) * i_167_ + (i_169_ & 0xff00) * i_168_) & 0xff0000)) >> 8;
						i_147_ += i_149_;
					}
					i_148_ += i_150_;
					i_147_ = i_162_;
					i_151_ += i_152_;
				}
			} else if (i_146_ == 2) {
				int i_170_ = i_147_;
				for (int i_171_ = -i_142_; i_171_ < 0; i_171_++) {
					int i_172_ = (i_148_ >> 16) * i_145_;
					for (int i_173_ = -i_141_; i_173_ < 0; i_173_++) {
						int i_174_ = i_143_;
						if (is[(i_147_ >> 16) + i_172_] != 0)
							i_174_ = i_144_;
						if (i_174_ != 0) {
							int i_175_ = (((Class260_Sub1) this).anIntArray3834[i_151_]);
							int i_176_ = i_174_ + i_175_;
							int i_177_ = (i_174_ & 0xff00ff) + (i_175_ & 0xff00ff);
							i_175_ = (i_177_ & 0x1000100) + (i_176_ - i_177_ & 0x10000);
							((Class260_Sub1) this).anIntArray3834[i_151_++] = i_176_ - i_175_ | i_175_ - (i_175_ >>> 8);
						} else
							i_151_++;
						i_147_ += i_149_;
					}
					i_148_ += i_150_;
					i_147_ = i_170_;
					i_151_ += i_152_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	private final int[] method1797(int i) {
		Class246_Sub36 class246_sub36;
		synchronized (f_kb) {
			class246_sub36 = (Class246_Sub36) f_kb.method379((long) i, (byte) 58);
			if (class246_sub36 == null) {
				if (!((Class260) this).anInterface6_3714.method13(i, 19378))
					return null;
				Class238 class238 = ((Class260) this).anInterface6_3714.method17(-31305, i);
				int i_178_ = ((Class238) class238).aBool3335 || f_gb ? 64 : 128;
				class246_sub36 = (new Class246_Sub36(i, i_178_, ((Class260) this).anInterface6_3714.method16(true, i, false, 0.7F, i_178_, i_178_), ((Class238) class238).aBool3347));
				f_kb.method371(1, (long) i, class246_sub36);
			}
		}
		((Class246_Sub36) class246_sub36).aBool5247 = true;
		return class246_sub36.method2224();
	}

	final void fa(int i, int i_179_, int i_180_, int i_181_) {
		if (((Class260_Sub1) this).f_lb < i)
			((Class260_Sub1) this).f_lb = i;
		if (((Class260_Sub1) this).f_eb < i_179_)
			((Class260_Sub1) this).f_eb = i_179_;
		if (((Class260_Sub1) this).anInt3832 > i_180_)
			((Class260_Sub1) this).anInt3832 = i_180_;
		if (((Class260_Sub1) this).anInt3856 > i_181_)
			((Class260_Sub1) this).anInt3856 = i_181_;
		method1793();
	}

	final Class36 method1798(Runnable runnable) {
		for (int i = 0; i < ((Class260_Sub1) this).anInt3855; i++) {
			if (((Class36) aClass36Array3835[i]).aRunnable496 == runnable)
				return aClass36Array3835[i];
		}
		return null;
	}

	final void method1677() {
		/* empty */
	}

	final Class_l method1706(int[] is, int i, int i_182_, int i_183_, int i_184_) {
		boolean bool = false;
		int i_185_ = i;
		while_157_: for (int i_186_ = 0; i_186_ < i_184_; i_186_++) {
			for (int i_187_ = 0; i_187_ < i_183_; i_187_++) {
				int i_188_ = is[i_185_++] >>> 24;
				if (i_188_ != 0 && i_188_ != 255) {
					bool = true;
					break while_157_;
				}
			}
		}
		if (bool)
			return new Class_l_Sub1_Sub2(this, is, i, i_182_, i_183_, i_184_);
		return new Class_l_Sub1_Sub1(this, is, i, i_182_, i_183_, i_184_);
	}

	final void method1687(int i) {
		int i_189_ = i - anInt3829;
		for (Object object = f_kb.method381((byte) -119); object != null; object = f_kb.method374(-17845)) {
			Class246_Sub36 class246_sub36 = (Class246_Sub36) object;
			if (((Class246_Sub36) class246_sub36).aBool5247) {
				((Class246_Sub36) class246_sub36).anInt5245 += i_189_;
				int i_190_ = ((Class246_Sub36) class246_sub36).anInt5245 / 20;
				if (i_190_ > 0) {
					Class238 class238 = (((Class260) this).anInterface6_3714.method17(-31305, ((Class246_Sub36) class246_sub36).anInt5243));
					class246_sub36.method2222((((Class238) class238).aByte3345 * i_189_ * 50 / 1000), (((Class238) class238).aByte3350 * i_189_ * 50 / 1000));
					((Class246_Sub36) class246_sub36).anInt5245 -= i_190_ * 20;
				}
				((Class246_Sub36) class246_sub36).aBool5247 = false;
			}
		}
		anInt3829 = i;
		aClass54_3838.method380(5, -50);
	}

	final Class128 method1726(int i, int i_191_, int[] is, int[] is_192_) {
		return new Class128_Sub2(i, i_191_, is, is_192_);
	}

	final void method1696(boolean bool) {
		/* empty */
	}

	final void method1685(Class_u class_u) {
		/* empty */
	}

	final void method1748(Class_t[] class_ts, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		Class_t_Sub2[] class_t_sub2s = new Class_t_Sub2[class_ts.length];
		for (int i_193_ = 0; i_193_ < class_ts.length; i_193_++) {
			if (class_ts[i_193_] != null)
				class_t_sub2s[i_193_] = (Class_t_Sub2) class_ts[i_193_];
		}
		Class_t_Sub2 class_t_sub2 = Class_t_Sub2.method2237(this, class_t_sub2s);
		class_t_sub2.method2225(class_c, (class130_sub5s != null ? class130_sub5s[0] : null), null, i);
	}

	final boolean method1799() {
		return aBool3825;
	}

	final int ZA() {
		int i = anInt3849;
		anInt3849 = 0;
		return i;
	}

	final void B(float f) {
		((Class260_Sub1) this).anInt3836 = (int) (f * 65535.0F);
	}

	final boolean method1705() {
		return true;
	}

	final boolean method1692() {
		return false;
	}

	final void method1718(Class129 class129) {
		Class130_Sub1 class130_sub1 = (((Class220) ((Class129) class129).aClass220_1802).aClass130_Sub1_3052);
		for (Class130_Sub1 class130_sub1_194_ = ((Class130_Sub1) class130_sub1).aClass130_Sub1_3732; class130_sub1_194_ != class130_sub1; class130_sub1_194_ = ((Class130_Sub1) class130_sub1_194_).aClass130_Sub1_3732) {
			Class130_Sub1_Sub1 class130_sub1_sub1 = (Class130_Sub1_Sub1) class130_sub1_194_;
			int i = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037 >> 12;
			int i_195_ = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048 >> 12;
			int i_196_ = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044 >> 12;
			int i_197_ = ((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5593) + ((((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5583 * i + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5590 * i_195_) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5585 * i_196_)) >> 15));
			if (i_197_ >= ((Class260_Sub1) this).anInt3839 && i_197_ <= ((Class260_Sub1) this).anInt3846) {
				int i_198_ = (((Class260_Sub1) this).f_cb + (((Class260_Sub1) this).anInt3851 * (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5589 + (((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5594) * i + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5588) * i_195_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5592) * i_196_) >> 15)) / i_197_));
				int i_199_ = (((Class260_Sub1) this).anInt3858 + (((Class260_Sub1) this).anInt3852 * (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5584 + (((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5591) * i + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5586) * i_195_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5587) * i_196_) >> 15)) / i_197_));
				if (i_198_ >= ((Class260_Sub1) this).f_lb && i_198_ <= ((Class260_Sub1) this).anInt3832 && i_199_ >= ((Class260_Sub1) this).f_eb && i_199_ <= ((Class260_Sub1) this).anInt3856) {
					if (i_197_ == 0)
						i_197_ = 1;
					method1801(class130_sub1_sub1, i_198_, i_199_, ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038) >> 2) / i_197_);
				}
			}
		}
	}

	final void method1698(float f, float f_200_, float f_201_) {
		/* empty */
	}

	final void method1743(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_) {
		i_203_ -= i;
		i_204_ -= i_202_;
		if (i_204_ == 0) {
			if (i_203_ >= 0)
				b(i, i_202_, i_203_ + 1, i_205_, i_206_);
			else
				b(i + i_203_, i_202_, -i_203_ + 1, i_205_, i_206_);
		} else if (i_203_ == 0) {
			if (i_204_ >= 0)
				TA(i, i_202_, i_204_ + 1, i_205_, i_206_);
			else
				TA(i, i_202_ + i_204_, -i_204_ + 1, i_205_, i_206_);
		} else {
			if (i_203_ + i_204_ < 0) {
				i += i_203_;
				i_203_ = -i_203_;
				i_202_ += i_204_;
				i_204_ = -i_204_;
			}
			if (i_203_ > i_204_) {
				i_202_ <<= 16;
				i_202_ += 32768;
				i_204_ <<= 16;
				int i_207_ = (int) Math.floor((double) i_204_ / (double) i_203_ + 0.5);
				i_203_ += i;
				if (i < ((Class260_Sub1) this).f_lb) {
					i_202_ += i_207_ * (((Class260_Sub1) this).f_lb - i);
					i = ((Class260_Sub1) this).f_lb;
				}
				if (i_203_ >= ((Class260_Sub1) this).anInt3832)
					i_203_ = ((Class260_Sub1) this).anInt3832 - 1;
				int i_208_ = i_205_ >>> 24;
				if (i_206_ == 0 || i_206_ == 1 && i_208_ == 255) {
					for (/**/; i <= i_203_; i++) {
						int i_209_ = i_202_ >> 16;
						if (i_209_ >= ((Class260_Sub1) this).f_eb && i_209_ < ((Class260_Sub1) this).anInt3856)
							((Class260_Sub1) this).anIntArray3834[i + i_209_ * ((Class260_Sub1) this).f_nb] = i_205_;
						i_202_ += i_207_;
					}
					return;
				}
				if (i_206_ == 1) {
					i_205_ = (((i_205_ & 0xff00ff) * i_208_ >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_208_ >> 8 & 0xff00) + (i_208_ << 24));
					int i_210_ = 256 - i_208_;
					for (/**/; i <= i_203_; i++) {
						int i_211_ = i_202_ >> 16;
						if (i_211_ >= ((Class260_Sub1) this).f_eb && i_211_ < ((Class260_Sub1) this).anInt3856) {
							int i_212_ = i + i_211_ * ((Class260_Sub1) this).f_nb;
							int i_213_ = (((Class260_Sub1) this).anIntArray3834[i_212_]);
							i_213_ = (((i_213_ & 0xff00ff) * i_210_ >> 8 & 0xff00ff) + ((i_213_ & 0xff00) * i_210_ >> 8 & 0xff00));
							((Class260_Sub1) this).anIntArray3834[i_212_] = i_205_ + i_213_;
						}
						i_202_ += i_207_;
					}
					return;
				}
				if (i_206_ == 2) {
					for (/**/; i <= i_203_; i++) {
						int i_214_ = i_202_ >> 16;
						if (i_214_ >= ((Class260_Sub1) this).f_eb && i_214_ < ((Class260_Sub1) this).anInt3856) {
							int i_215_ = i + i_214_ * ((Class260_Sub1) this).f_nb;
							int i_216_ = (((Class260_Sub1) this).anIntArray3834[i_215_]);
							int i_217_ = i_205_ + i_216_;
							int i_218_ = (i_205_ & 0xff00ff) + (i_216_ & 0xff00ff);
							i_216_ = (i_218_ & 0x1000100) + (i_217_ - i_218_ & 0x10000);
							((Class260_Sub1) this).anIntArray3834[i_215_] = i_217_ - i_216_ | i_216_ - (i_216_ >>> 8);
						}
						i_202_ += i_207_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_203_ <<= 16;
			int i_219_ = (int) Math.floor((double) i_203_ / (double) i_204_ + 0.5);
			i_204_ += i_202_;
			if (i_202_ < ((Class260_Sub1) this).f_eb) {
				i += i_219_ * (((Class260_Sub1) this).f_eb - i_202_);
				i_202_ = ((Class260_Sub1) this).f_eb;
			}
			if (i_204_ >= ((Class260_Sub1) this).anInt3856)
				i_204_ = ((Class260_Sub1) this).anInt3856 - 1;
			int i_220_ = i_205_ >>> 24;
			if (i_206_ == 0 || i_206_ == 1 && i_220_ == 255) {
				for (/**/; i_202_ <= i_204_; i_202_++) {
					int i_221_ = i >> 16;
					if (i_221_ >= ((Class260_Sub1) this).f_lb && i_221_ < ((Class260_Sub1) this).anInt3832)
						((Class260_Sub1) this).anIntArray3834[i_221_ + i_202_ * ((Class260_Sub1) this).f_nb] = i_205_;
					i += i_219_;
				}
			} else if (i_206_ == 1) {
				i_205_ = (((i_205_ & 0xff00ff) * i_220_ >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_220_ >> 8 & 0xff00) + (i_220_ << 24));
				int i_222_ = 256 - i_220_;
				for (/**/; i_202_ <= i_204_; i_202_++) {
					int i_223_ = i >> 16;
					if (i_223_ >= ((Class260_Sub1) this).f_lb && i_223_ < ((Class260_Sub1) this).anInt3832) {
						int i_224_ = i_223_ + i_202_ * ((Class260_Sub1) this).f_nb;
						int i_225_ = ((Class260_Sub1) this).anIntArray3834[i_224_];
						i_225_ = (((i_225_ & 0xff00ff) * i_222_ >> 8 & 0xff00ff) + ((i_225_ & 0xff00) * i_222_ >> 8 & 0xff00));
						((Class260_Sub1) this).anIntArray3834[i_223_ + i_202_ * ((Class260_Sub1) this).f_nb] = i_205_ + i_225_;
					}
					i += i_219_;
				}
			} else if (i_206_ == 2) {
				for (/**/; i_202_ <= i_204_; i_202_++) {
					int i_226_ = i >> 16;
					if (i_226_ >= ((Class260_Sub1) this).f_lb && i_226_ < ((Class260_Sub1) this).anInt3832) {
						int i_227_ = i_226_ + i_202_ * ((Class260_Sub1) this).f_nb;
						int i_228_ = ((Class260_Sub1) this).anIntArray3834[i_227_];
						int i_229_ = i_205_ + i_228_;
						int i_230_ = (i_205_ & 0xff00ff) + (i_228_ & 0xff00ff);
						i_228_ = (i_230_ & 0x1000100) + (i_229_ - i_230_ & 0x10000);
						((Class260_Sub1) this).anIntArray3834[i_227_] = i_229_ - i_228_ | i_228_ - (i_228_ >>> 8);
					}
					i += i_219_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final Class211 method1709(int i, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_) {
		return null;
	}

	final void e() {
		((Class260_Sub1) this).f_lb = 0;
		((Class260_Sub1) this).f_eb = 0;
		((Class260_Sub1) this).anInt3832 = ((Class260_Sub1) this).f_nb;
		((Class260_Sub1) this).anInt3856 = anInt3853;
		method1793();
	}

	final void method1690(Canvas canvas) {
		Class246_Sub19 class246_sub19 = ((Class246_Sub19) aClass85_3828.method544((long) canvas.hashCode(), 127));
		if (class246_sub19 == null) {
			class246_sub19 = Class59_Sub2.method2024(canvas, 18248);
			aClass85_3828.method547((long) canvas.hashCode(), -2301, class246_sub19);
		}
	}

	final boolean method1686() {
		return true;
	}

	final void method1680() {
		if (aBool3827) {
			Class246_Sub1_Sub13.method2701(true, 478210754, false);
			aBool3827 = false;
		}
		aClass246_Sub19_3830 = null;
		aCanvas3826 = null;
		aClass85_3828 = null;
		aBool3825 = true;
	}

	final boolean method1800(int i) {
		return (((Class238) ((Class260) this).anInterface6_3714.method17(-31305, i)).aBool3340);
	}

	final void AA(int i, int i_236_, int i_237_, int i_238_) {
		f_mb = ((Class260_Sub1) this).anInt3843;
		((Class260_Sub1) this).anInt3845 = i;
		((Class260_Sub1) this).anInt3843 = i_236_;
		((Class260_Sub1) this).f_fb = i_237_;
		((Class260_Sub1) this).aBool3840 = true;
	}

	final void method1801(Class130_Sub1_Sub1 class130_sub1_sub1, int i, int i_239_, int i_240_) {
		int i_241_ = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049;
		int i_242_ = i_240_ >> 1;
		if (i_241_ == -1)
			NA(i, i_239_, i_242_, ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043, 1);
		else {
			if (f_pb != i_241_) {
				Class_l class_l = ((Class_l) aClass54_3838.method379((long) i_241_, (byte) 58));
				if (class_l == null) {
					int[] is = method1797(i_241_);
					if (is != null) {
						int i_243_ = method1803(i_241_) ? 64 : 128;
						class_l = method1706(is, 0, i_243_, i_243_, i_243_);
						aClass54_3838.method371(1, (long) i_241_, class_l);
					} else
						return;
				}
				f_pb = i_241_;
				f_ob = class_l;
			}
			if (f_ob.j() == 64) {
				i_240_ <<= 1;
				i_242_ <<= 1;
			}
			f_ob.s(i - i_242_, i_239_ - i_242_, i_240_, i_240_, 0, ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043, 1);
		}
	}

	Class260_Sub1(int i, Canvas canvas, Interface6 interface6) {
		this(i, interface6);
		method1690(canvas);
		method1691(canvas);
	}

	final boolean method1699() {
		return false;
	}

	final void ea(Class_c class_c) {
		((Class260_Sub1) this).aClass_c_Sub2_3857 = (Class_c_Sub2) class_c;
	}

	final Class211 method1739(Class211 class211, Class211 class211_244_, float f, Class211 class211_245_) {
		return null;
	}

	final void method1703(Class_t class_t, Class129 class129, Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		((Class_t_Sub2) class_t).method2225(class_c, class130_sub5, class129, i);
	}

	final boolean method1684() {
		return false;
	}

	private final void method1802() {
		for (int i = 0; i < ((Class260_Sub1) this).anInt3855; i++)
			aClass36Array3835[i].method255((byte) -81);
		e();
	}

	final void ia(int i, int i_246_) {
		((Class260_Sub1) this).anInt3839 = i;
		anInt3837 = i_246_;
		((Class260_Sub1) this).anInt3846 = anInt3837 - 255;
		method1795();
	}

	final int method1723(int i, int i_247_) {
		return i | i_247_;
	}

	final Class_c method1730() {
		Class36 class36 = method1798(Thread.currentThread());
		return ((Class36) class36).aClass_c_Sub2_493;
	}

	final void X(int i, int i_248_, int i_249_, int[] is) {
		int i_250_ = ((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5593) + (((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5583) * i + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5590 * i_248_ + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5585 * i_249_) >> 15));
		if (i_250_ < ((Class260_Sub1) this).anInt3839 || i_250_ > anInt3837)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_251_ = (((Class260_Sub1) this).anInt3851 * (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5589 + ((((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5594 * i + (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5588 * i_248_) + (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5592 * i_249_)) >> 15)) / i_250_);
			int i_252_ = (((Class260_Sub1) this).anInt3852 * (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5584 + ((((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5591 * i + (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5586 * i_248_) + (((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5587 * i_249_)) >> 15)) / i_250_);
			if (i_251_ >= ((Class260_Sub1) this).f_ab && i_251_ <= ((Class260_Sub1) this).f_ib && i_252_ >= ((Class260_Sub1) this).anInt3850 && i_252_ <= ((Class260_Sub1) this).anInt3842) {
				is[0] = i_251_ - ((Class260_Sub1) this).f_ab;
				is[1] = i_252_ - ((Class260_Sub1) this).anInt3850;
				is[2] = i_250_;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	final void g(float f, float f_253_) {
		aFloat3844 = f;
		f_bb = f_253_;
		method1795();
	}

	final void da(int[] is) {
		is[0] = ((Class260_Sub1) this).f_lb;
		is[1] = ((Class260_Sub1) this).f_eb;
		is[2] = ((Class260_Sub1) this).anInt3832;
		is[3] = ((Class260_Sub1) this).anInt3856;
	}

	final void T(int i, float f, float f_254_, float f_255_, float f_256_, float f_257_) {
		((Class260_Sub1) this).f_hb = (int) (f * 65535.0F);
		((Class260_Sub1) this).anInt3848 = (int) (f_254_ * 65535.0F);
		float f_258_ = (float) Math.sqrt((double) (f_255_ * f_255_ + f_256_ * f_256_ + f_257_ * f_257_));
		((Class260_Sub1) this).anInt3831 = (int) (f_255_ * 65535.0F / f_258_);
		((Class260_Sub1) this).anInt3847 = (int) (f_256_ * 65535.0F / f_258_);
		((Class260_Sub1) this).anInt3854 = (int) (f_257_ * 65535.0F / f_258_);
	}

	final Class_l method1749(Class10 class10, boolean bool) {
		int[] is = ((Class10) class10).anIntArray160;
		byte[] is_259_ = ((Class10) class10).aByteArray157;
		int i = ((Class10) class10).anInt156;
		int i_260_ = ((Class10) class10).anInt155;
		Class_l_Sub1 class_l_sub1;
		if (bool && ((Class10) class10).aByteArray161 == null) {
			int[] is_261_ = new int[is.length];
			byte[] is_262_ = new byte[i * i_260_];
			for (int i_263_ = 0; i_263_ < i_260_; i_263_++) {
				int i_264_ = i_263_ * i;
				for (int i_265_ = 0; i_265_ < i; i_265_++)
					is_262_[i_264_ + i_265_] = is_259_[i_264_ + i_265_];
			}
			for (int i_266_ = 0; i_266_ < is.length; i_266_++)
				is_261_[i_266_] = is[i_266_];
			class_l_sub1 = new Class_l_Sub1_Sub3(this, is_262_, is_261_, i, i_260_);
		} else {
			int[] is_267_ = new int[i * i_260_];
			byte[] is_268_ = ((Class10) class10).aByteArray161;
			if (is_268_ != null) {
				for (int i_269_ = 0; i_269_ < i_260_; i_269_++) {
					int i_270_ = i_269_ * i;
					for (int i_271_ = 0; i_271_ < i; i_271_++)
						is_267_[i_270_ + i_271_] = (is[is_259_[i_270_ + i_271_] & 0xff] | is_268_[i_270_ + i_271_] << 24);
				}
				class_l_sub1 = new Class_l_Sub1_Sub2(this, is_267_, i, i_260_);
			} else {
				for (int i_272_ = 0; i_272_ < i_260_; i_272_++) {
					int i_273_ = i_272_ * i;
					for (int i_274_ = 0; i_274_ < i; i_274_++)
						is_267_[i_273_ + i_274_] = is[is_259_[i_273_ + i_274_] & 0xff];
				}
				Class_l_Sub1_Sub2 class_l_sub1_sub2 = new Class_l_Sub1_Sub2(this, is_267_, i, i_260_);
				class_l_sub1 = new Class_l_Sub1_Sub1(this, is_267_, i, i_260_);
			}
		}
		class_l_sub1.MA(((Class10) class10).anInt158, ((Class10) class10).anInt162, ((Class10) class10).anInt159, ((Class10) class10).anInt163);
		return class_l_sub1;
	}

	final void GA(int i, int i_275_, int i_276_, int i_277_) {
		((Class260_Sub1) this).anInt3845 = i;
		((Class260_Sub1) this).anInt3843 = i_275_;
		((Class260_Sub1) this).f_fb = i_276_;
	}

	final Class_l method1721(int i, int i_278_, int i_279_, int i_280_, boolean bool) {
		int[] is = new int[i_279_ * i_280_];
		int i_281_ = i_278_ * ((Class260_Sub1) this).f_nb + i;
		int i_282_ = ((Class260_Sub1) this).f_nb - i_279_;
		for (int i_283_ = 0; i_283_ < i_280_; i_283_++) {
			int i_284_ = i_283_ * i_279_;
			for (int i_285_ = 0; i_285_ < i_279_; i_285_++)
				is[i_284_ + i_285_] = ((Class260_Sub1) this).anIntArray3834[i_281_++];
			i_281_ += i_282_;
		}
		if (bool)
			return new Class_l_Sub1_Sub2(this, is, i_279_, i_280_);
		return new Class_l_Sub1_Sub1(this, is, i_279_, i_280_);
	}

	final int IA() {
		return 0;
	}

	final boolean method1803(int i) {
		if (f_gb || ((Class238) ((Class260) this).anInterface6_3714.method17(-31305, i)).aBool3335)
			return true;
		return false;
	}

	final void method1804(int i, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_, int i_293_) {
		if (i_287_ != 0 && i_288_ != 0) {
			if (i_290_ != 65535 && !((Class238) ((Class260) this).anInterface6_3714.method17(-31305, i_290_)).aBool3339) {
				if (f_pb != i_290_) {
					Class_l class_l = ((Class_l) aClass54_3838.method379((long) i_290_, (byte) 58));
					if (class_l == null) {
						int[] is = method1797(i_290_);
						if (is == null)
							return;
						int i_294_ = method1803(i_290_) ? 64 : 128;
						class_l = method1706(is, 0, i_294_, i_294_, i_294_);
						aClass54_3838.method371(1, (long) i_290_, class_l);
					}
					f_pb = i_290_;
					f_ob = class_l;
				}
				f_ob.s(i - i_287_, i_286_ - i_288_, i_287_ << 1, i_288_ << 1, i_292_, i_291_, i_293_);
			} else
				NA(i, i_286_, i_287_, i_291_, i_293_);
		}
	}

	final void l() {
		((Class260_Sub1) this).anInt3843 = f_mb;
		((Class260_Sub1) this).aBool3840 = false;
	}

	final float W() {
		return aFloat3844;
	}

	final boolean method1689() {
		return false;
	}

	final void method1713(Canvas canvas) {
		Class246_Sub19 class246_sub19 = ((Class246_Sub19) aClass85_3828.method544((long) canvas.hashCode(), 123));
		if (class246_sub19 != null) {
			class246_sub19.unlink((byte) -123);
			class246_sub19 = Class59_Sub2.method2024(canvas, 18248);
			aClass85_3828.method547((long) canvas.hashCode(), -2301, class246_sub19);
			if (aCanvas3826 == canvas && f_jb == null) {
				aClass246_Sub19_3830 = class246_sub19;
				((Class260_Sub1) this).anIntArray3834 = ((Class246_Sub19) class246_sub19).anIntArray4704;
				((Class260_Sub1) this).f_nb = ((Class246_Sub19) class246_sub19).anInt4706;
				anInt3853 = ((Class246_Sub19) class246_sub19).anInt4705;
				method1802();
			}
		}
	}

	final void method1679(int i, Class246_Sub41[] class246_sub41s) {
		/* empty */
	}

	final void method1688() {
		if (aCanvas3826 == null || aClass246_Sub19_3830 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas3826.getGraphics();
			aClass246_Sub19_3830.method2071(-10312, 0, 0, graphics);
		} catch (Exception exception) {
			aCanvas3826.repaint();
		}
	}

	final int[] F(int i, int i_295_, int i_296_, int i_297_) {
		int[] is = new int[i_296_ * i_297_];
		int i_298_ = 0;
		for (int i_299_ = 0; i_299_ < i_297_; i_299_++) {
			int i_300_ = (i_295_ + i_299_) * ((Class260_Sub1) this).f_nb + i;
			for (int i_301_ = 0; i_301_ < i_296_; i_301_++)
				is[i_298_++] = ((Class260_Sub1) this).anIntArray3834[i_300_ + i_301_];
		}
		return is;
	}

	final Class_t method1695(Class103 class103, int i, int i_302_, int i_303_, int i_304_) {
		return new Class_t_Sub2(this, class103, i, i_303_, i_304_, i_302_);
	}

	final boolean method1693() {
		return false;
	}

	final void method1717(int i, int i_305_, int i_306_, int i_307_, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_) {
		Class36 class36 = method1798(Thread.currentThread());
		Class184 class184 = ((Class36) class36).aClass184_494;
		((Class184) class184).aBool2559 = false;
		int i_314_ = i_310_ >>> 24;
		if (i_313_ == 0 || i_313_ == 1 && i_314_ == 255) {
			((Class184) class184).aBool2559 = false;
			((Class184) class184).anInt2565 = 0;
			((Class184) class184).aBool2560 = true;
			class184.method1195(i_305_, i_307_, i_309_, i, i_306_, i_308_, i_310_, i_311_, i_312_);
		} else if (i_313_ == 1) {
			((Class184) class184).aBool2559 = false;
			((Class184) class184).anInt2565 = 255 - i_314_;
			((Class184) class184).aBool2560 = true;
			class184.method1195(i_305_, i_307_, i_309_, i, i_306_, i_308_, i_310_, i_311_, i_312_);
		} else {
			if (i_313_ == 2)
				throw new IllegalStateException();
			throw new IllegalArgumentException();
		}
		((Class184) class184).aBool2559 = true;
	}

	final void TA(int i, int i_315_, int i_316_, int i_317_, int i_318_) {
		if (i >= ((Class260_Sub1) this).f_lb && i < ((Class260_Sub1) this).anInt3832) {
			if (i_315_ < ((Class260_Sub1) this).f_eb) {
				i_316_ -= ((Class260_Sub1) this).f_eb - i_315_;
				i_315_ = ((Class260_Sub1) this).f_eb;
			}
			if (i_315_ + i_316_ > ((Class260_Sub1) this).anInt3856)
				i_316_ = ((Class260_Sub1) this).anInt3856 - i_315_;
			int i_319_ = i + i_315_ * ((Class260_Sub1) this).f_nb;
			int i_320_ = i_317_ >>> 24;
			if (i_318_ == 0 || i_318_ == 1 && i_320_ == 255) {
				for (int i_321_ = 0; i_321_ < i_316_; i_321_++)
					((Class260_Sub1) this).anIntArray3834[i_319_ + i_321_ * ((Class260_Sub1) this).f_nb] = i_317_;
			} else if (i_318_ == 1) {
				i_317_ = (((i_317_ & 0xff00ff) * i_320_ >> 8 & 0xff00ff) + ((i_317_ & 0xff00) * i_320_ >> 8 & 0xff00) + (i_320_ << 24));
				int i_322_ = 256 - i_320_;
				for (int i_323_ = 0; i_323_ < i_316_; i_323_++) {
					int i_324_ = i_319_ + i_323_ * ((Class260_Sub1) this).f_nb;
					int i_325_ = ((Class260_Sub1) this).anIntArray3834[i_324_];
					i_325_ = (((i_325_ & 0xff00ff) * i_322_ >> 8 & 0xff00ff) + ((i_325_ & 0xff00) * i_322_ >> 8 & 0xff00));
					((Class260_Sub1) this).anIntArray3834[i_324_] = i_317_ + i_325_;
				}
			} else if (i_318_ == 2) {
				for (int i_326_ = 0; i_326_ < i_316_; i_326_++) {
					int i_327_ = i_319_ + i_326_ * ((Class260_Sub1) this).f_nb;
					int i_328_ = ((Class260_Sub1) this).anIntArray3834[i_327_];
					int i_329_ = i_317_ + i_328_;
					int i_330_ = (i_317_ & 0xff00ff) + (i_328_ & 0xff00ff);
					i_328_ = (i_330_ & 0x1000100) + (i_329_ - i_330_ & 0x10000);
					((Class260_Sub1) this).anIntArray3834[i_327_] = i_329_ - i_328_ | i_328_ - (i_328_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final void method1724(int i) {
		if (((Class260_Sub1) this).anInt3855 != i) {
			((Class260_Sub1) this).anInt3855 = i;
			aClass36Array3835 = new Class36[((Class260_Sub1) this).anInt3855];
			for (int i_331_ = 0; i_331_ < ((Class260_Sub1) this).anInt3855; i_331_++)
				aClass36Array3835[i_331_] = new Class36(this);
		}
	}

	final void method1704(Canvas canvas) {
		if (aCanvas3826 == canvas)
			method1691(null);
		Class246_Sub19 class246_sub19 = ((Class246_Sub19) aClass85_3828.method544((long) canvas.hashCode(), 123));
		if (class246_sub19 != null)
			class246_sub19.unlink((byte) -80);
	}

	final void method1752() {
		f_kb.method369(false);
	}

	final void OA(int i, int i_332_, int i_333_, int i_334_) {
		if (i < 0)
			i = 0;
		if (i_332_ < 0)
			i_332_ = 0;
		if (i_333_ > ((Class260_Sub1) this).f_nb)
			i_333_ = ((Class260_Sub1) this).f_nb;
		if (i_334_ > anInt3853)
			i_334_ = anInt3853;
		((Class260_Sub1) this).f_lb = i;
		((Class260_Sub1) this).anInt3832 = i_333_;
		((Class260_Sub1) this).f_eb = i_332_;
		((Class260_Sub1) this).anInt3856 = i_334_;
		method1793();
	}

	final void method1744(int i) {
		aClass36Array3835[i].method253(0, null);
	}

	final void method1750(boolean bool) {
		/* empty */
	}

	final void b(int i, int i_335_, int i_336_, int i_337_, int i_338_) {
		if (i_335_ >= ((Class260_Sub1) this).f_eb && i_335_ < ((Class260_Sub1) this).anInt3856) {
			if (i < ((Class260_Sub1) this).f_lb) {
				i_336_ -= ((Class260_Sub1) this).f_lb - i;
				i = ((Class260_Sub1) this).f_lb;
			}
			if (i + i_336_ > ((Class260_Sub1) this).anInt3832)
				i_336_ = ((Class260_Sub1) this).anInt3832 - i;
			int i_339_ = i + i_335_ * ((Class260_Sub1) this).f_nb;
			int i_340_ = i_337_ >>> 24;
			if (i_338_ == 0 || i_338_ == 1 && i_340_ == 255) {
				for (int i_341_ = 0; i_341_ < i_336_; i_341_++)
					((Class260_Sub1) this).anIntArray3834[i_339_ + i_341_] = i_337_;
			} else if (i_338_ == 1) {
				i_337_ = (((i_337_ & 0xff00ff) * i_340_ >> 8 & 0xff00ff) + ((i_337_ & 0xff00) * i_340_ >> 8 & 0xff00) + (i_340_ << 24));
				int i_342_ = 256 - i_340_;
				for (int i_343_ = 0; i_343_ < i_336_; i_343_++) {
					int i_344_ = (((Class260_Sub1) this).anIntArray3834[i_339_ + i_343_]);
					i_344_ = (((i_344_ & 0xff00ff) * i_342_ >> 8 & 0xff00ff) + ((i_344_ & 0xff00) * i_342_ >> 8 & 0xff00));
					((Class260_Sub1) this).anIntArray3834[i_339_ + i_343_] = i_337_ + i_344_;
				}
			} else if (i_338_ == 2) {
				for (int i_345_ = 0; i_345_ < i_336_; i_345_++) {
					int i_346_ = (((Class260_Sub1) this).anIntArray3834[i_339_ + i_345_]);
					int i_347_ = i_337_ + i_346_;
					int i_348_ = (i_337_ & 0xff00ff) + (i_346_ & 0xff00ff);
					i_346_ = (i_348_ & 0x1000100) + (i_347_ - i_348_ & 0x10000);
					((Class260_Sub1) this).anIntArray3834[i_339_ + i_345_] = i_347_ - i_346_ | i_346_ - (i_346_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	final boolean method1683() {
		return false;
	}

	final boolean method1720() {
		return false;
	}

	final void method1753(int i, int i_349_, int i_350_, int i_351_, int i_352_, int i_353_) {
		b(i, i_349_, i_350_, i_352_, i_353_);
		b(i, i_349_ + i_351_ - 1, i_350_, i_352_, i_353_);
		TA(i, i_349_ + 1, i_351_ - 2, i_352_, i_353_);
		TA(i + i_350_ - 1, i_349_ + 1, i_351_ - 2, i_352_, i_353_);
	}

	final int a() {
		return ((Class260_Sub1) this).anInt3839;
	}

	final boolean method1741() {
		return false;
	}

	final void method1694(int i, int i_354_, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_) {
		Class36 class36 = method1798(Thread.currentThread());
		Class184 class184 = ((Class36) class36).aClass184_494;
		int i_360_ = i_355_ - i;
		int i_361_ = i_356_ - i_354_;
		int i_362_ = i_360_ >= 0 ? i_360_ : -i_360_;
		int i_363_ = i_361_ >= 0 ? i_361_ : -i_361_;
		int i_364_ = i_362_;
		if (i_364_ < i_363_)
			i_364_ = i_363_;
		if (i_364_ != 0) {
			int i_365_ = (i_360_ << 16) / i_364_;
			int i_366_ = (i_361_ << 16) / i_364_;
			if (i_366_ <= i_365_)
				i_365_ = -i_365_;
			else
				i_366_ = -i_366_;
			int i_367_ = i_358_ * i_366_ >> 17;
			int i_368_ = i_358_ * i_366_ + 1 >> 17;
			int i_369_ = i_358_ * i_365_ >> 17;
			int i_370_ = i_358_ * i_365_ + 1 >> 17;
			i -= class184.method1198();
			i_354_ -= class184.method1196();
			int i_371_ = i + i_367_;
			int i_372_ = i - i_368_;
			int i_373_ = i + i_360_ - i_368_;
			int i_374_ = i + i_360_ + i_367_;
			int i_375_ = i_354_ + i_369_;
			int i_376_ = i_354_ - i_370_;
			int i_377_ = i_354_ + i_361_ - i_370_;
			int i_378_ = i_354_ + i_361_ + i_369_;
			if (i_359_ == 0)
				((Class184) class184).anInt2565 = 0;
			else if (i_359_ == 1)
				((Class184) class184).anInt2565 = 255 - (i_357_ >> 24);
			else
				throw new IllegalArgumentException();
			((Class184) class184).aBool2560 = (i_371_ < 0 || i_371_ > ((Class184) class184).anInt2557 || i_372_ < 0 || i_372_ > ((Class184) class184).anInt2557 || i_373_ < 0 || i_373_ > ((Class184) class184).anInt2557);
			class184.method1199(i_375_, i_376_, i_377_, i_371_, i_372_, i_373_, i_357_);
			((Class184) class184).aBool2560 = (i_371_ < 0 || i_371_ > ((Class184) class184).anInt2557 || i_372_ < 0 || i_372_ > ((Class184) class184).anInt2557 || i_374_ < 0 || i_374_ > ((Class184) class184).anInt2557);
			class184.method1199(i_375_, i_377_, i_378_, i_371_, i_373_, i_374_, i_357_);
		}
	}

	final void method1719() {
		/* empty */
	}

	final void method1678(boolean bool) {
		f_gb = bool;
		f_kb.method369(false);
	}

	final Class210 method1738(int i, int i_379_, int[][] is, int[][] is_380_, int i_381_, int i_382_, int i_383_) {
		return new Class210_Sub1(this, i_382_, i_383_, i, i_379_, is, is_380_, i_381_);
	}

	final Class116 method1716(Class73 class73, Class10[] class10s, boolean bool) {
		int[] is = new int[class10s.length];
		int[] is_384_ = new int[class10s.length];
		boolean bool_385_ = false;
		for (int i = 0; i < class10s.length; i++) {
			is[i] = ((Class10) class10s[i]).anInt156;
			is_384_[i] = ((Class10) class10s[i]).anInt155;
			if (((Class10) class10s[i]).aByteArray161 != null)
				bool_385_ = true;
		}
		if (bool)
			return new Class116_Sub4(this, class73, class10s, is, is_384_);
		if (bool_385_)
			return new Class116_Sub1(this, class73, class10s, is, is_384_);
		return new Class116_Sub3(this, class73, class10s, is, is_384_);
	}

	final Class_c method1715() {
		return new Class_c_Sub2();
	}

	final void method1747(int i) {
		/* empty */
	}

	final boolean method1700() {
		return false;
	}

	final int[] method1805(int i) {
		Class246_Sub36 class246_sub36;
		synchronized (f_kb) {
			class246_sub36 = (Class246_Sub36) f_kb.method379((long) i, (byte) 58);
			if (class246_sub36 == null) {
				if (!((Class260) this).anInterface6_3714.method13(i, 19378))
					return null;
				Class238 class238 = ((Class260) this).anInterface6_3714.method17(-31305, i);
				int i_386_ = ((Class238) class238).aBool3335 || f_gb ? 64 : 128;
				class246_sub36 = (new Class246_Sub36(i, i_386_, ((Class260) this).anInterface6_3714.method14(true, 5754, i, 0.7F, i_386_, i_386_), ((Class238) class238).aBool3347));
				f_kb.method371(1, (long) i, class246_sub36);
			}
		}
		((Class246_Sub36) class246_sub36).aBool5247 = true;
		return class246_sub36.method2224();
	}

	final boolean method1702() {
		return true;
	}

	final boolean method1727() {
		return false;
	}

	final int w() {
		int i = anInt3841;
		anInt3841 = 0;
		return i;
	}

	final void UA(int i, int i_387_, int i_388_) {
		((Class260_Sub1) this).anInt3843 = i & 0xffffff;
		int i_389_ = ((Class260_Sub1) this).anInt3843 >>> 16 & 0xff;
		if (i_389_ < 2)
			i_389_ = 2;
		int i_390_ = ((Class260_Sub1) this).anInt3843 >> 8 & 0xff;
		if (i_390_ < 2)
			i_390_ = 2;
		int i_391_ = ((Class260_Sub1) this).anInt3843 & 0xff;
		if (i_391_ < 2)
			i_391_ = 2;
		((Class260_Sub1) this).anInt3843 = i_389_ << 16 | i_390_ << 8 | i_391_;
		if (i_387_ < 0)
			((Class260_Sub1) this).f_db = false;
		else
			((Class260_Sub1) this).f_db = true;
	}

	final void method1731(Rectangle[] rectangles, int i) {
		if (aCanvas3826 == null || aClass246_Sub19_3830 == null)
			throw new IllegalStateException("off");
		try {
			Graphics graphics = aCanvas3826.getGraphics();
			for (int i_392_ = 0; i_392_ < i; i_392_++) {
				Rectangle rectangle = rectangles[i_392_];
				if (rectangle.x <= ((Class260_Sub1) this).f_nb && rectangle.y <= anInt3853 && rectangle.x + rectangle.width > 0 && rectangle.y + rectangle.height > 0)
					aClass246_Sub19_3830.method2064(rectangle.y, rectangle.width, rectangle.x, graphics, (byte) -104, rectangle.height);
			}
		} catch (Exception exception) {
			aCanvas3826.repaint();
		}
	}

	final boolean JA(int i, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_) {
		int i_398_ = ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5583) * i + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5590) * i_393_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5585) * i_394_) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5593));
		if (i_398_ < 1)
			i_398_ = 1;
		int i_399_ = ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5583) * i_395_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5590) * i_396_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5585) * i_397_) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5593));
		if (i_399_ < 1)
			i_399_ = 1;
		if ((i_398_ < ((Class260_Sub1) this).anInt3839 && i_399_ < ((Class260_Sub1) this).anInt3839) || i_398_ > anInt3837 && i_399_ > anInt3837)
			return false;
		int i_400_ = (((Class260_Sub1) this).anInt3851 * ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5594) * i + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5588 * i_393_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5592 * i_394_)) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5589)) / i_398_);
		int i_401_ = (((Class260_Sub1) this).anInt3851 * ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5594) * i_395_ + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5588 * i_396_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5592 * i_397_)) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5589)) / i_399_);
		if ((i_400_ < ((Class260_Sub1) this).f_ab && i_401_ < ((Class260_Sub1) this).f_ab) || (i_400_ > ((Class260_Sub1) this).f_ib && i_401_ > ((Class260_Sub1) this).f_ib))
			return false;
		int i_402_ = (((Class260_Sub1) this).anInt3852 * ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5591) * i + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5586 * i_393_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5587 * i_394_)) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5584)) / i_398_);
		int i_403_ = (((Class260_Sub1) this).anInt3852 * ((((((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5591) * i_395_ + ((Class_c_Sub2) (((Class260_Sub1) this).aClass_c_Sub2_3857)).anInt5586 * i_396_ + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5587 * i_397_)) >> 15) + (((Class_c_Sub2) ((Class260_Sub1) this).aClass_c_Sub2_3857).anInt5584)) / i_399_);
		if ((i_402_ < ((Class260_Sub1) this).anInt3850 && i_403_ < ((Class260_Sub1) this).anInt3850) || (i_402_ > ((Class260_Sub1) this).anInt3842 && i_403_ > ((Class260_Sub1) this).anInt3842))
			return false;
		return true;
	}

	final void method1691(Canvas canvas) {
		if (canvas != null) {
			Class246_Sub19 class246_sub19 = ((Class246_Sub19) aClass85_3828.method544((long) canvas.hashCode(), 126));
			if (class246_sub19 != null) {
				aCanvas3826 = canvas;
				aClass246_Sub19_3830 = class246_sub19;
				if (f_jb == null) {
					((Class260_Sub1) this).anIntArray3834 = ((Class246_Sub19) class246_sub19).anIntArray4704;
					((Class260_Sub1) this).f_nb = ((Class246_Sub19) class246_sub19).anInt4706;
					anInt3853 = ((Class246_Sub19) class246_sub19).anInt4705;
					method1802();
				}
			}
		} else {
			aCanvas3826 = null;
			aClass246_Sub19_3830 = null;
			if (f_jb == null) {
				((Class260_Sub1) this).anIntArray3834 = null;
				((Class260_Sub1) this).f_nb = anInt3853 = 1;
				method1802();
			}
		}
	}

	final Class_u method1725(int i) {
		return null;
	}

	final void method1740(Class_t[] class_ts, Class129 class129, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		Class_t_Sub2[] class_t_sub2s = new Class_t_Sub2[class_ts.length];
		for (int i_404_ = 0; i_404_ < class_ts.length; i_404_++) {
			if (class_ts[i_404_] != null)
				class_t_sub2s[i_404_] = (Class_t_Sub2) class_ts[i_404_];
		}
		Class_t_Sub2 class_t_sub2 = Class_t_Sub2.method2237(this, class_t_sub2s);
		class_t_sub2.method2225(class_c, (class130_sub5s != null ? class130_sub5s[0] : null), class129, i);
	}
}
