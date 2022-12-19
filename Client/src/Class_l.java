/* Class_l - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_l {
	abstract void JA(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_);

	final void method728(float f, float f_6_, int i, int i_7_, Class128 class128, int i_8_, int i_9_) {
		method733(f, f_6_, (float) j() / 2.0F, (float) T() / 2.0F, i, i_7_, class128, i_8_, i_9_);
	}

	abstract int la();

	final void method729(int i, int i_10_) {
		r(i, i_10_, 1, 0, 1);
	}

	public Class_l() {
		/* empty */
	}

	abstract void BA(int i, int i_11_, int i_12_);

	abstract void MA(int i, int i_13_, int i_14_, int i_15_);

	abstract void r(int i, int i_16_, int i_17_, int i_18_, int i_19_);

	abstract void a(float f, float f_20_, float f_21_, float f_22_, float f_23_, float f_24_, int i, int i_25_, int i_26_);

	abstract void method730(float f, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, Class128 class128, int i, int i_32_);

	abstract int T();

	final void method731(float f, float f_33_, int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		method735(f, f_33_, (float) j() / 2.0F, (float) T() / 2.0F, i, i_34_, i_35_, i_36_, i_37_);
	}

	abstract void t(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_);

	final void method732(int i, int i_43_, int i_44_, int i_45_) {
		s(i, i_43_, i_44_, i_45_, 1, 0, 1);
	}

	abstract void s(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_);

	final void method733(float f, float f_52_, float f_53_, float f_54_, int i, int i_55_, Class128 class128, int i_56_, int i_57_) {
		if (i != 0) {
			double d = (double) (i_55_ & 0xffff) * 9.587379924285257E-5;
			float f_58_ = (float) Math.sin(d) * (float) i;
			float f_59_ = (float) Math.cos(d) * (float) i;
			float f_60_ = (-f_53_ * f_59_ + -f_54_ * f_58_) / 4096.0F + f;
			float f_61_ = (f_53_ * f_58_ + -f_54_ * f_59_) / 4096.0F + f_52_;
			float f_62_ = ((((float) j() - f_53_) * f_59_ + -f_54_ * f_58_) / 4096.0F + f);
			float f_63_ = ((-((float) j() - f_53_) * f_58_ + -f_54_ * f_59_) / 4096.0F + f_52_);
			float f_64_ = ((-f_53_ * f_59_ + ((float) T() - f_54_) * f_58_) / 4096.0F + f);
			float f_65_ = ((f_53_ * f_58_ + ((float) T() - f_54_) * f_59_) / 4096.0F + f_52_);
			method730(f_60_, f_61_, f_62_, f_63_, f_64_, f_65_, class128, i_56_, i_57_);
		}
	}

	final void method734(int i, int i_66_, int i_67_, int i_68_) {
		JA(i, i_66_, i_67_, i_68_, 1, 0, 1);
	}

	private final void method735(float f, float f_69_, float f_70_, float f_71_, int i, int i_72_, int i_73_, int i_74_, int i_75_) {
		if (i != 0) {
			double d = (double) (i_72_ & 0xffff) * 9.587379924285257E-5;
			float f_76_ = (float) Math.sin(d) * (float) i;
			float f_77_ = (float) Math.cos(d) * (float) i;
			float f_78_ = (-f_70_ * f_77_ + -f_71_ * f_76_) / 4096.0F + f;
			float f_79_ = (f_70_ * f_76_ + -f_71_ * f_77_) / 4096.0F + f_69_;
			float f_80_ = ((((float) j() - f_70_) * f_77_ + -f_71_ * f_76_) / 4096.0F + f);
			float f_81_ = ((-((float) j() - f_70_) * f_76_ + -f_71_ * f_77_) / 4096.0F + f_69_);
			float f_82_ = ((-f_70_ * f_77_ + ((float) T() - f_71_) * f_76_) / 4096.0F + f);
			float f_83_ = ((f_70_ * f_76_ + ((float) T() - f_71_) * f_77_) / 4096.0F + f_69_);
			a(f_78_, f_79_, f_80_, f_81_, f_82_, f_83_, i_73_, i_74_, i_75_);
		}
	}

	abstract int j();

	abstract int ma();

	final void method736(float f, float f_84_, int i, int i_85_) {
		method735(f, f_84_, (float) j() / 2.0F, (float) T() / 2.0F, i, i_85_, 1, 0, 1);
	}

	abstract void method737(int i, int i_86_, Class128 class128, int i_87_, int i_88_);
}
