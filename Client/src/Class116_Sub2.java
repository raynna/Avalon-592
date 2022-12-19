
/* Class116_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class116_Sub2 extends Class116 {
	private boolean aBool4429;
	private Class109_Sub1_Sub1 aClass109_Sub1_Sub1_4430;
	private Class260_Sub2 aClass260_Sub2_4431;
	private Class34 aClass34_4432;

	Class116_Sub2(Class260_Sub2 class260_sub2, Class73 class73, Class10[] class10s, boolean bool) {
		super(class260_sub2, class73);
		aClass260_Sub2_4431 = class260_sub2;
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			Class10 class10 = class10s[i_0_];
			if (((Class10) class10).anInt155 > i)
				i = ((Class10) class10).anInt155;
			if (((Class10) class10).anInt156 > i)
				i = ((Class10) class10).anInt156;
		}
		int i_1_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_1_ * i_1_];
			for (int i_2_ = 0; i_2_ < 256; i_2_++) {
				Class10 class10 = class10s[i_2_];
				byte[] is_3_ = ((Class10) class10).aByteArray157;
				int i_4_ = ((Class10) class10).anInt155;
				int i_5_ = ((Class10) class10).anInt156;
				int i_6_ = i_2_ % 16 * i;
				int i_7_ = i_2_ / 16 * i;
				int i_8_ = i_7_ * i_1_ + i_6_;
				int i_9_ = 0;
				for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
					for (int i_11_ = 0; i_11_ < i_5_; i_11_++)
						is[i_8_++] = is_3_[i_9_++] == 0 ? (byte) 0 : (byte) -1;
					i_8_ += i_1_ - i_5_;
				}
			}
			aClass109_Sub1_Sub1_4430 = Class18.method176(false, (byte) -115, is, class260_sub2, i_1_, i_1_, 6406, 6406);
			aBool4429 = true;
		} else {
			int[] is = new int[i_1_ * i_1_];
			for (int i_12_ = 0; i_12_ < 256; i_12_++) {
				Class10 class10 = class10s[i_12_];
				int[] is_13_ = ((Class10) class10).anIntArray160;
				byte[] is_14_ = ((Class10) class10).aByteArray161;
				byte[] is_15_ = ((Class10) class10).aByteArray157;
				int i_16_ = ((Class10) class10).anInt155;
				int i_17_ = ((Class10) class10).anInt156;
				int i_18_ = i_12_ % 16 * i;
				int i_19_ = i_12_ / 16 * i;
				int i_20_ = i_19_ * i_1_ + i_18_;
				int i_21_ = 0;
				if (is_14_ != null) {
					for (int i_22_ = 0; i_22_ < i_16_; i_22_++) {
						for (int i_23_ = 0; i_23_ < i_17_; i_23_++) {
							is[i_20_++] = (is_14_[i_21_] << 24 | is_13_[is_15_[i_21_] & 0xff]);
							i_21_++;
						}
						i_20_ += i_1_ - i_17_;
					}
				} else {
					for (int i_24_ = 0; i_24_ < i_16_; i_24_++) {
						for (int i_25_ = 0; i_25_ < i_17_; i_25_++)
							is[i_20_++] = ~0xffffff | is_13_[is_15_[i_21_++] & 0xff];
						i_20_ += i_1_ - i_17_;
					}
				}
			}
			aClass109_Sub1_Sub1_4430 = Class218.method1414(class260_sub2, i_1_, is, false, i_1_, -1);
			aBool4429 = false;
		}
		aClass109_Sub1_Sub1_4430.method753(122, false);
		aClass34_4432 = new Class34(class260_sub2, 256);
		float f = (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6730 / (float) (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).anInt6724));
		float f_26_ = (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6727 / (float) (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).anInt6729));
		for (int i_27_ = 0; i_27_ < 256; i_27_++) {
			Class10 class10 = class10s[i_27_];
			int i_28_ = ((Class10) class10).anInt155;
			int i_29_ = ((Class10) class10).anInt156;
			int i_30_ = ((Class10) class10).anInt162;
			int i_31_ = ((Class10) class10).anInt158;
			float f_32_ = (float) (i_27_ % 16 * i);
			float f_33_ = (float) (i_27_ / 16 * i);
			float f_34_ = f_32_ * f;
			float f_35_ = f_33_ * f_26_;
			float f_36_ = (f_32_ + (float) i_29_) * f;
			float f_37_ = (f_33_ + (float) i_28_) * f_26_;
			aClass34_4432.method247(i_27_, true);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_34_, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6727 - f_35_);
			OpenGL.glVertex2i(i_31_, i_30_);
			OpenGL.glTexCoord2f(f_34_, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6727 - f_37_);
			OpenGL.glVertex2i(i_31_, i_30_ + i_28_);
			OpenGL.glTexCoord2f(f_36_, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6727 - f_37_);
			OpenGL.glVertex2i(i_31_ + i_29_, i_30_ + i_28_);
			OpenGL.glTexCoord2f(f_36_, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4430).aFloat6727 - f_35_);
			OpenGL.glVertex2i(i_31_ + i_29_, i_30_);
			OpenGL.glEnd();
			aClass34_4432.method248((byte) 39);
		}
	}

	final void method787(char c, int i, int i_38_, int i_39_, boolean bool, Class128 class128, int i_40_, int i_41_) {
		Class128_Sub1 class128_sub1 = (Class128_Sub1) class128;
		Class109_Sub1_Sub1 class109_sub1_sub1 = ((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563;
		aClass260_Sub2_4431.method1929(1);
		aClass260_Sub2_4431.method1905((byte) 78, aClass109_Sub1_Sub1_4430);
		if (aBool4429 || bool) {
			aClass260_Sub2_4431.method1912(7681, 8448, true);
			aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 34168);
		}
		aClass260_Sub2_4431.method1936(1, -122);
		aClass260_Sub2_4431.method1905((byte) 78, class109_sub1_sub1);
		aClass260_Sub2_4431.method1912(7681, 8448, true);
		aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6730 / (float) ((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6724);
		float f_42_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 / (float) ((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6729);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_40_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_42_, 0.0F, (float) -i_41_ * f_42_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_39_ >> 16), (byte) (i_39_ >> 8), (byte) i_39_, (byte) (i_39_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_38_, 0.0F);
		aClass34_4432.method246(c, -1);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 5890);
		aClass260_Sub2_4431.method1912(8448, 8448, true);
		aClass260_Sub2_4431.method1905((byte) 78, null);
		aClass260_Sub2_4431.method1936(0, -122);
		if (aBool4429 || bool)
			aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 5890);
	}

	final void OA(char c, int i, int i_43_, int i_44_, boolean bool) {
		aClass260_Sub2_4431.method1929(1);
		aClass260_Sub2_4431.method1905((byte) 78, aClass109_Sub1_Sub1_4430);
		if (aBool4429 || bool) {
			aClass260_Sub2_4431.method1912(7681, 8448, true);
			aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 34168);
		}
		OpenGL.glColor4ub((byte) (i_44_ >> 16), (byte) (i_44_ >> 8), (byte) i_44_, (byte) (i_44_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_43_, 0.0F);
		aClass34_4432.method246(c, -1);
		OpenGL.glLoadIdentity();
		if (aBool4429 || bool)
			aClass260_Sub2_4431.method1945((byte) 79, 0, 768, 5890);
	}
}
