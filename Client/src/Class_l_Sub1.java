/* Class_l_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_l_Sub1 extends Class_l {
	private static int anInt5201;
	static int anInt5202;
	static int anInt5203;
	static int anInt5204;
	int anInt5205;
	static int anInt5206;
	static int anInt5207;
	private static int anInt5208 = 0;
	int anInt5209;
	private static int anInt5210;
	static int anInt5211;
	static int anInt5212;
	static int anInt5213 = 0;
	static int anInt5214;
	static int anInt5215;
	int anInt5216;
	static int anInt5217;
	int anInt5218;
	static int anInt5219;
	static int anInt5220;
	static int anInt5221;
	private int[] anIntArray5222;
	static int anInt5223;
	int anInt5224;
	private static int anInt5225;
	static int anInt5226;
	static int anInt5227 = 0;
	private static int anInt5228;
	static int anInt5229;
	int anInt5230;
	static int anInt5231;
	Class260_Sub1 aClass260_Sub1_5232;
	private static int anInt5233;

	final int ma() {
		return ((Class_l_Sub1) this).anInt5205;
	}

	final int la() {
		return ((Class_l_Sub1) this).anInt5230;
	}

	final void method730(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, Class128 class128, int i, int i_5_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		method2215(f, f_0_, f_1_, f_2_, f_3_, f_4_);
		Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
		method2217(((Class128_Sub2) class128_sub2).anIntArray5568, ((Class128_Sub2) class128_sub2).anIntArray5567, anInt5233 - i, -i_5_ - (anInt5202 - anInt5210));
	}

	private final void method2215(float f, float f_6_, float f_7_, float f_8_, float f_9_, float f_10_) {
		int i = (((Class_l_Sub1) this).anInt5218 + ((Class_l_Sub1) this).anInt5230 + ((Class_l_Sub1) this).anInt5216);
		int i_11_ = (((Class_l_Sub1) this).anInt5209 + ((Class_l_Sub1) this).anInt5205 + ((Class_l_Sub1) this).anInt5224);
		if (i != ((Class_l_Sub1) this).anInt5230 || i_11_ != ((Class_l_Sub1) this).anInt5205) {
			float f_12_ = (f_7_ - f) / (float) i;
			float f_13_ = (f_8_ - f_6_) / (float) i;
			float f_14_ = (f_9_ - f) / (float) i_11_;
			float f_15_ = (f_10_ - f_6_) / (float) i_11_;
			float f_16_ = f_14_ * (float) ((Class_l_Sub1) this).anInt5209;
			float f_17_ = f_15_ * (float) ((Class_l_Sub1) this).anInt5209;
			float f_18_ = f_12_ * (float) ((Class_l_Sub1) this).anInt5218;
			float f_19_ = f_13_ * (float) ((Class_l_Sub1) this).anInt5218;
			float f_20_ = -f_12_ * (float) ((Class_l_Sub1) this).anInt5216;
			float f_21_ = -f_13_ * (float) ((Class_l_Sub1) this).anInt5216;
			float f_22_ = -f_14_ * (float) ((Class_l_Sub1) this).anInt5224;
			float f_23_ = -f_15_ * (float) ((Class_l_Sub1) this).anInt5224;
			f += f_18_ + f_16_;
			f_6_ += f_19_ + f_17_;
			f_7_ += f_20_ + f_16_;
			f_8_ += f_21_ + f_17_;
			f_9_ += f_18_ + f_22_;
			f_10_ += f_19_ + f_23_;
		}
		float f_24_ = f_9_ + (f_7_ - f);
		float f_25_ = f_8_ + (f_10_ - f_6_);
		float f_26_;
		float f_27_;
		if (f < f_7_) {
			f_26_ = f;
			f_27_ = f_7_;
		} else {
			f_26_ = f_7_;
			f_27_ = f;
		}
		if (f_9_ < f_26_)
			f_26_ = f_9_;
		if (f_24_ < f_26_)
			f_26_ = f_24_;
		if (f_9_ > f_27_)
			f_27_ = f_9_;
		if (f_24_ > f_27_)
			f_27_ = f_24_;
		float f_28_;
		float f_29_;
		if (f_6_ < f_8_) {
			f_28_ = f_6_;
			f_29_ = f_8_;
		} else {
			f_28_ = f_8_;
			f_29_ = f_6_;
		}
		if (f_10_ < f_28_)
			f_28_ = f_10_;
		if (f_25_ < f_28_)
			f_28_ = f_25_;
		if (f_10_ > f_29_)
			f_29_ = f_10_;
		if (f_25_ > f_29_)
			f_29_ = f_25_;
		if (f_26_ < (float) ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)
			f_26_ = (float) ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb;
		if (f_27_ > (float) ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832)
			f_27_ = (float) ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832;
		if (f_28_ < (float) ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)
			f_28_ = (float) ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb;
		if (f_29_ > (float) ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856)
			f_29_ = (float) ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856;
		f_27_ = f_26_ - f_27_;
		if (!(f_27_ >= 0.0F)) {
			f_29_ = f_28_ - f_29_;
			if (!(f_29_ >= 0.0F)) {
				anInt5215 = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
				anInt5217 = (int) ((float) ((int) f_28_ * anInt5215) + f_26_);
				float f_30_ = (f_7_ - f) * (f_10_ - f_6_) - (f_8_ - f_6_) * (f_9_ - f);
				float f_31_ = (f_9_ - f) * (f_8_ - f_6_) - (f_10_ - f_6_) * (f_7_ - f);
				anInt5214 = (int) ((f_10_ - f_6_) * 4096.0F * (float) ((Class_l_Sub1) this).anInt5230 / f_30_);
				anInt5226 = (int) ((f_8_ - f_6_) * 4096.0F * (float) ((Class_l_Sub1) this).anInt5205 / f_31_);
				anInt5231 = (int) ((f_9_ - f) * 4096.0F * (float) ((Class_l_Sub1) this).anInt5230 / f_31_);
				anInt5211 = (int) ((f_7_ - f) * 4096.0F * (float) ((Class_l_Sub1) this).anInt5205 / f_30_);
				anInt5201 = (int) (f_26_ * 16.0F + 8.0F - (f + f_7_ + f_9_ + f_24_) / 4.0F * 16.0F);
				anInt5225 = (int) (f_28_ * 16.0F + 8.0F - (f_6_ + f_8_ + f_10_ + f_25_) / 4.0F * 16.0F);
				anInt5206 = ((((Class_l_Sub1) this).anInt5230 >> 1 << 12) + (anInt5225 * anInt5231 >> 4));
				anInt5207 = ((((Class_l_Sub1) this).anInt5205 >> 1 << 12) + (anInt5225 * anInt5211 >> 4));
				anInt5204 = anInt5201 * anInt5214 >> 4;
				anInt5203 = anInt5201 * anInt5226 >> 4;
				anInt5233 = (int) f_26_;
				anInt5212 = (int) f_27_;
				anInt5210 = (int) f_28_;
				anInt5202 = (int) f_29_;
			}
		}
	}

	final int j() {
		return (((Class_l_Sub1) this).anInt5218 + ((Class_l_Sub1) this).anInt5230 + ((Class_l_Sub1) this).anInt5216);
	}

	final void MA(int i, int i_32_, int i_33_, int i_34_) {
		((Class_l_Sub1) this).anInt5218 = i;
		((Class_l_Sub1) this).anInt5209 = i_32_;
		((Class_l_Sub1) this).anInt5216 = i_33_;
		((Class_l_Sub1) this).anInt5224 = i_34_;
	}

	abstract void method2216(int i, int i_35_);

	abstract void r(int i, int i_36_, int i_37_, int i_38_, int i_39_);

	abstract void method737(int i, int i_40_, Class128 class128, int i_41_, int i_42_);

	abstract void s(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_);

	final int T() {
		return (((Class_l_Sub1) this).anInt5209 + ((Class_l_Sub1) this).anInt5205 + ((Class_l_Sub1) this).anInt5224);
	}

	final void a(float f, float f_49_, float f_50_, float f_51_, float f_52_, float f_53_, int i, int i_54_, int i_55_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		method2215(f, f_49_, f_50_, f_51_, f_52_, f_53_);
		anInt5221 = i_54_;
		if (i != 1) {
			anInt5223 = i_54_ >>> 24;
			anInt5220 = 256 - anInt5223;
			if (i == 0) {
				anInt5227 = (i_54_ & 0xff0000) >> 16;
				anInt5229 = (i_54_ & 0xff00) >> 8;
				anInt5219 = i_54_ & 0xff;
			} else if (i == 2) {
				anInt5208 = i_54_ >>> 24;
				anInt5228 = 256 - anInt5208;
				int i_56_ = (i_54_ & 0xff00ff) * anInt5228 & ~0xff00ff;
				int i_57_ = (i_54_ & 0xff00) * anInt5228 & 0xff0000;
				anInt5213 = (i_56_ | i_57_) >>> 8;
			}
		}
		if (i == 1) {
			if (i_55_ == 0)
				method2216(1, 0);
			else if (i_55_ == 1)
				method2216(1, 1);
			else if (i_55_ == 2)
				method2216(1, 2);
		} else if (i == 0) {
			if (i_55_ == 0)
				method2216(0, 0);
			else if (i_55_ == 1)
				method2216(0, 1);
			else if (i_55_ == 2)
				method2216(0, 2);
		} else if (i == 3) {
			if (i_55_ == 0)
				method2216(3, 0);
			else if (i_55_ == 1)
				method2216(3, 1);
			else if (i_55_ == 2)
				method2216(3, 2);
		} else if (i == 2) {
			if (i_55_ == 0)
				method2216(2, 0);
			else if (i_55_ == 1)
				method2216(2, 1);
			else if (i_55_ == 2)
				method2216(2, 2);
		}
	}

	final void JA(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		if (anIntArray5222 == null)
			anIntArray5222 = new int[4];
		((Class_l_Sub1) this).aClass260_Sub1_5232.da(anIntArray5222);
		((Class_l_Sub1) this).aClass260_Sub1_5232.fa(((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb, ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb, i + i_59_, i_58_ + i_60_);
		int i_64_ = j();
		int i_65_ = T();
		int i_66_ = (i_59_ + i_64_ - 1) / i_64_;
		int i_67_ = (i_60_ + i_65_ - 1) / i_65_;
		for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
			int i_69_ = i_68_ * i_65_;
			for (int i_70_ = 0; i_70_ < i_66_; i_70_++)
				r(i + i_70_ * i_64_, i_58_ + i_69_, i_61_, i_62_, i_63_);
		}
		((Class_l_Sub1) this).aClass260_Sub1_5232.OA(anIntArray5222[0], anIntArray5222[1], anIntArray5222[2], anIntArray5222[3]);
	}

	Class_l_Sub1(Class260_Sub1 class260_sub1, int i, int i_71_) {
		((Class_l_Sub1) this).aClass260_Sub1_5232 = class260_sub1;
		((Class_l_Sub1) this).anInt5230 = i;
		((Class_l_Sub1) this).anInt5205 = i_71_;
	}

	abstract void method2217(int[] is, int[] is_72_, int i, int i_73_);

	static {
		anInt5219 = 0;
		anInt5229 = 0;
		anInt5223 = 0;
		anInt5228 = 0;
		anInt5220 = 0;
	}
}
