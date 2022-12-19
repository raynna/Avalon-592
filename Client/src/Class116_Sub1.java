/* Class116_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116_Sub1 extends Class116 {
	private byte[][] aByteArrayArray3988;
	private Class260_Sub1 aClass260_Sub1_3989;
	private int[] anIntArray3990;
	private int[] anIntArray3991;
	private int[] anIntArray3992;
	private int[] anIntArray3993;

	private final void method1844(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, Class128 class128, int i_10_, int i_11_) {
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		int[] is_12_ = ((Class128_Sub2) class128_sub2).anIntArray5568;
		int[] is_13_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
		int i_14_ = i_7_ - ((Class260_Sub1) aClass260_Sub1_3989).f_lb;
		int i_15_ = i_8_;
		if (i_11_ > i_15_) {
			i_15_ = i_11_;
			i_2_ += (i_11_ - i_8_) * ((Class260_Sub1) aClass260_Sub1_3989).f_nb;
			i_1_ += (i_11_ - i_8_) * i_9_;
		}
		int i_16_ = (i_11_ + is_12_.length < i_8_ + i_4_ ? i_11_ + is_12_.length : i_8_ + i_4_);
		for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
			int i_18_ = is_12_[i_17_ - i_11_] + i_10_;
			int i_19_ = is_13_[i_17_ - i_11_];
			int i_20_ = i_3_;
			if (i_14_ > i_18_) {
				int i_21_ = i_14_ - i_18_;
				if (i_21_ >= i_19_) {
					i_1_ += i_3_ + i_6_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_19_ -= i_21_;
			} else {
				int i_22_ = i_18_ - i_14_;
				if (i_22_ >= i_3_) {
					i_1_ += i_3_ + i_6_;
					i_2_ += i_3_ + i_5_;
					continue;
				}
				i_1_ += i_22_;
				i_20_ -= i_22_;
				i_2_ += i_22_;
			}
			int i_23_ = 0;
			if (i_20_ < i_19_)
				i_19_ = i_20_;
			else
				i_23_ = i_20_ - i_19_;
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				int i_25_ = is[i_1_++] & 0xff;
				if (i_25_ != 0) {
					int i_26_ = ((((i & 0xff00ff) * i_25_ & ~0xff00ff) + ((i & 0xff00) * i_25_ & 0xff0000)) >> 8);
					i_25_ = 256 - i_25_;
					int i_27_ = is_0_[i_2_];
					is_0_[i_2_++] = ((((i_27_ & 0xff00ff) * i_25_ & ~0xff00ff) + ((i_27_ & 0xff00) * i_25_ & 0xff0000)) >> 8) + i_26_;
				} else
					i_2_++;
			}
			i_1_ += i_23_ + i_6_;
			i_2_ += i_23_ + i_5_;
		}
	}

	final void method787(char c, int i, int i_28_, int i_29_, boolean bool, Class128 class128, int i_30_, int i_31_) {
		if (class128 == null)
			OA(c, i, i_28_, i_29_, bool);
		else {
			i += anIntArray3992[c];
			i_28_ += anIntArray3993[c];
			int i_32_ = anIntArray3990[c];
			int i_33_ = anIntArray3991[c];
			int i_34_ = ((Class260_Sub1) aClass260_Sub1_3989).f_nb;
			int i_35_ = i + i_28_ * i_34_;
			int i_36_ = i_34_ - i_32_;
			int i_37_ = 0;
			int i_38_ = 0;
			if (i_28_ < ((Class260_Sub1) aClass260_Sub1_3989).f_eb) {
				int i_39_ = ((Class260_Sub1) aClass260_Sub1_3989).f_eb - i_28_;
				i_33_ -= i_39_;
				i_28_ = ((Class260_Sub1) aClass260_Sub1_3989).f_eb;
				i_38_ += i_39_ * i_32_;
				i_35_ += i_39_ * i_34_;
			}
			if (i_28_ + i_33_ > ((Class260_Sub1) aClass260_Sub1_3989).anInt3856)
				i_33_ -= (i_28_ + i_33_ - ((Class260_Sub1) aClass260_Sub1_3989).anInt3856);
			if (i < ((Class260_Sub1) aClass260_Sub1_3989).f_lb) {
				int i_40_ = ((Class260_Sub1) aClass260_Sub1_3989).f_lb - i;
				i_32_ -= i_40_;
				i = ((Class260_Sub1) aClass260_Sub1_3989).f_lb;
				i_38_ += i_40_;
				i_35_ += i_40_;
				i_37_ += i_40_;
				i_36_ += i_40_;
			}
			if (i + i_32_ > ((Class260_Sub1) aClass260_Sub1_3989).anInt3832) {
				int i_41_ = (i + i_32_ - ((Class260_Sub1) aClass260_Sub1_3989).anInt3832);
				i_32_ -= i_41_;
				i_37_ += i_41_;
				i_36_ += i_41_;
			}
			if (i_32_ > 0 && i_33_ > 0)
				method1844(aByteArrayArray3988[c], (((Class260_Sub1) aClass260_Sub1_3989).anIntArray3834), i_29_, i_38_, i_35_, i_32_, i_33_, i_36_, i_37_, i, i_28_, anIntArray3990[c], class128, i_30_, i_31_);
		}
	}

	final void OA(char c, int i, int i_42_, int i_43_, boolean bool) {
		i += anIntArray3992[c];
		i_42_ += anIntArray3993[c];
		int i_44_ = anIntArray3990[c];
		int i_45_ = anIntArray3991[c];
		int i_46_ = ((Class260_Sub1) aClass260_Sub1_3989).f_nb;
		int i_47_ = i + i_42_ * i_46_;
		int i_48_ = i_46_ - i_44_;
		int i_49_ = 0;
		int i_50_ = 0;
		if (i_42_ < ((Class260_Sub1) aClass260_Sub1_3989).f_eb) {
			int i_51_ = ((Class260_Sub1) aClass260_Sub1_3989).f_eb - i_42_;
			i_45_ -= i_51_;
			i_42_ = ((Class260_Sub1) aClass260_Sub1_3989).f_eb;
			i_50_ += i_51_ * i_44_;
			i_47_ += i_51_ * i_46_;
		}
		if (i_42_ + i_45_ > ((Class260_Sub1) aClass260_Sub1_3989).anInt3856)
			i_45_ -= (i_42_ + i_45_ - ((Class260_Sub1) aClass260_Sub1_3989).anInt3856);
		if (i < ((Class260_Sub1) aClass260_Sub1_3989).f_lb) {
			int i_52_ = ((Class260_Sub1) aClass260_Sub1_3989).f_lb - i;
			i_44_ -= i_52_;
			i = ((Class260_Sub1) aClass260_Sub1_3989).f_lb;
			i_50_ += i_52_;
			i_47_ += i_52_;
			i_49_ += i_52_;
			i_48_ += i_52_;
		}
		if (i + i_44_ > ((Class260_Sub1) aClass260_Sub1_3989).anInt3832) {
			int i_53_ = i + i_44_ - ((Class260_Sub1) aClass260_Sub1_3989).anInt3832;
			i_44_ -= i_53_;
			i_49_ += i_53_;
			i_48_ += i_53_;
		}
		if (i_44_ > 0 && i_45_ > 0)
			method1845(aByteArrayArray3988[c], ((Class260_Sub1) aClass260_Sub1_3989).anIntArray3834, i_43_, i_50_, i_47_, i_44_, i_45_, i_48_, i_49_);
	}

	Class116_Sub1(Class260_Sub1 class260_sub1, Class73 class73, Class10[] class10s, int[] is, int[] is_54_) {
		super(class260_sub1, class73);
		aClass260_Sub1_3989 = class260_sub1;
		aClass260_Sub1_3989 = class260_sub1;
		anIntArray3990 = is;
		anIntArray3991 = is_54_;
		aByteArrayArray3988 = new byte[class10s.length][];
		anIntArray3993 = new int[class10s.length];
		anIntArray3992 = new int[class10s.length];
		for (int i = 0; i < class10s.length; i++) {
			aByteArrayArray3988[i] = ((Class10) class10s[i]).aByteArray161;
			anIntArray3993[i] = ((Class10) class10s[i]).anInt162;
			anIntArray3992[i] = ((Class10) class10s[i]).anInt158;
		}
	}

	private final void method1845(byte[] is, int[] is_55_, int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_) {
		for (int i_62_ = -i_59_; i_62_ < 0; i_62_++) {
			for (int i_63_ = -i_58_; i_63_ < 0; i_63_++) {
				int i_64_ = is[i_56_++] & 0xff;
				if (i_64_ != 0) {
					int i_65_ = ((((i & 0xff00ff) * i_64_ & ~0xff00ff) + ((i & 0xff00) * i_64_ & 0xff0000)) >> 8);
					i_64_ = 256 - i_64_;
					int i_66_ = is_55_[i_57_];
					is_55_[i_57_++] = ((((i_66_ & 0xff00ff) * i_64_ & ~0xff00ff) + ((i_66_ & 0xff00) * i_64_ & 0xff0000)) >> 8) + i_65_;
				} else
					i_57_++;
			}
			i_57_ += i_60_;
			i_56_ += i_61_;
		}
	}
}
