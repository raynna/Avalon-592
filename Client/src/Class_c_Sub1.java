/* Class_c_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_c_Sub1 extends Class_c {
	static int anInt5359;
	static int anInt5360;
	static int anInt5361;
	float aFloat5362;
	float aFloat5363;
	float aFloat5364;
	static int anInt5365;
	static int anInt5366;
	float aFloat5367;
	static int anInt5368;
	static int anInt5369;
	static int anInt5370;
	static int anInt5371;
	float aFloat5372;
	static int anInt5373;
	static int anInt5374;
	static int anInt5375;
	static int anInt5376;
	static int anInt5377;
	float aFloat5378;
	static int anInt5379;
	static int anInt5380;
	static int anInt5381;
	float aFloat5382;
	static int anInt5383;
	static int anInt5384;
	float aFloat5385;
	float aFloat5386;
	float aFloat5387;
	float aFloat5388;
	static int anInt5389;
	static int anInt5390;
	static int anInt5391;
	static Class125 aClass125_5392;
	float aFloat5393;

	final float[] method2273(int i) {
		try {
			Class169.aFloatArray2413[2] = ((Class_c_Sub1) this).aFloat5386;
			Class169.aFloatArray2413[0] = ((Class_c_Sub1) this).aFloat5372;
			Class169.aFloatArray2413[12] = 0.0F;
			Class169.aFloatArray2413[13] = 0.0F;
			anInt5374++;
			Class169.aFloatArray2413[9] = ((Class_c_Sub1) this).aFloat5367;
			Class169.aFloatArray2413[5] = ((Class_c_Sub1) this).aFloat5382;
			Class169.aFloatArray2413[1] = ((Class_c_Sub1) this).aFloat5364;
			Class169.aFloatArray2413[4] = ((Class_c_Sub1) this).aFloat5387;
			Class169.aFloatArray2413[6] = ((Class_c_Sub1) this).aFloat5378;
			if (i < 66)
				((Class_c_Sub1) this).aFloat5367 = -0.5634646F;
			Class169.aFloatArray2413[14] = 0.0F;
			Class169.aFloatArray2413[10] = ((Class_c_Sub1) this).aFloat5363;
			Class169.aFloatArray2413[8] = ((Class_c_Sub1) this).aFloat5388;
			return Class169.aFloatArray2413;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.I(" + i + ')');
		}
	}

	final void method585(int i, int i_0_, int i_1_, int[] is) {
		try {
			is[0] = (int) (((Class_c_Sub1) this).aFloat5388 * (float) i_1_ + ((float) i * ((Class_c_Sub1) this).aFloat5372 + (float) i_0_ * ((Class_c_Sub1) this).aFloat5387) + ((Class_c_Sub1) this).aFloat5393);
			is[1] = (int) (((Class_c_Sub1) this).aFloat5385 + (((Class_c_Sub1) this).aFloat5367 * (float) i_1_ + (((Class_c_Sub1) this).aFloat5382 * (float) i_0_ + ((float) i * ((Class_c_Sub1) this).aFloat5364))));
			anInt5379++;
			is[2] = (int) (((Class_c_Sub1) this).aFloat5386 * (float) i + ((Class_c_Sub1) this).aFloat5378 * (float) i_0_ + ((Class_c_Sub1) this).aFloat5363 * (float) i_1_ + ((Class_c_Sub1) this).aFloat5362);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tu.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2274(int i) {
		try {
			if (i < -52)
				aClass125_5392 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.H(" + i + ')');
		}
	}

	final void ka(int i) {
		try {
			anInt5375++;
			float f = Class12.aFloatArray179[0x3fff & i];
			float f_2_ = Class12.aFloatArray178[0x3fff & i];
			float f_3_ = ((Class_c_Sub1) this).aFloat5364;
			float f_4_ = ((Class_c_Sub1) this).aFloat5382;
			float f_5_ = ((Class_c_Sub1) this).aFloat5367;
			float f_6_ = ((Class_c_Sub1) this).aFloat5385;
			((Class_c_Sub1) this).aFloat5364 = -(((Class_c_Sub1) this).aFloat5386 * f_2_) + f_3_ * f;
			((Class_c_Sub1) this).aFloat5386 = f * ((Class_c_Sub1) this).aFloat5386 + f_3_ * f_2_;
			((Class_c_Sub1) this).aFloat5382 = f_4_ * f - ((Class_c_Sub1) this).aFloat5378 * f_2_;
			((Class_c_Sub1) this).aFloat5378 = f_2_ * f_4_ + f * ((Class_c_Sub1) this).aFloat5378;
			((Class_c_Sub1) this).aFloat5367 = f_5_ * f - f_2_ * ((Class_c_Sub1) this).aFloat5363;
			((Class_c_Sub1) this).aFloat5363 = f_2_ * f_5_ + f * ((Class_c_Sub1) this).aFloat5363;
			((Class_c_Sub1) this).aFloat5385 = f_6_ * f - f_2_ * ((Class_c_Sub1) this).aFloat5362;
			((Class_c_Sub1) this).aFloat5362 = f * ((Class_c_Sub1) this).aFloat5362 + f_2_ * f_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.ka(" + i + ')');
		}
	}

	final void s(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			anInt5373++;
			float f = Class12.aFloatArray179[0x3fff & i_9_];
			float f_12_ = Class12.aFloatArray178[0x3fff & i_9_];
			float f_13_ = Class12.aFloatArray179[0x3fff & i_10_];
			float f_14_ = Class12.aFloatArray178[i_10_ & 0x3fff];
			float f_15_ = Class12.aFloatArray179[i_11_ & 0x3fff];
			float f_16_ = Class12.aFloatArray178[0x3fff & i_11_];
			float f_17_ = f_15_ * f_12_;
			float f_18_ = f_16_ * f_12_;
			((Class_c_Sub1) this).aFloat5367 = f_13_ * f_17_ + f_14_ * f_16_;
			((Class_c_Sub1) this).aFloat5363 = f * f_13_;
			((Class_c_Sub1) this).aFloat5372 = f_18_ * f_14_ + f_13_ * f_15_;
			((Class_c_Sub1) this).aFloat5364 = f_16_ * -f_13_ + f_14_ * f_17_;
			((Class_c_Sub1) this).aFloat5386 = f_14_ * f;
			((Class_c_Sub1) this).aFloat5378 = -f_12_;
			((Class_c_Sub1) this).aFloat5387 = f_16_ * f;
			((Class_c_Sub1) this).aFloat5382 = f_15_ * f;
			((Class_c_Sub1) this).aFloat5388 = f_18_ * f_13_ + f_15_ * -f_14_;
			((Class_c_Sub1) this).aFloat5393 = (((Class_c_Sub1) this).aFloat5372 * (float) -i - (float) i_7_ * ((Class_c_Sub1) this).aFloat5387 - (float) i_8_ * ((Class_c_Sub1) this).aFloat5388);
			((Class_c_Sub1) this).aFloat5385 = ((float) -i * ((Class_c_Sub1) this).aFloat5364 - ((Class_c_Sub1) this).aFloat5382 * (float) i_7_ - (float) i_8_ * ((Class_c_Sub1) this).aFloat5367);
			((Class_c_Sub1) this).aFloat5362 = (-((float) i_8_ * ((Class_c_Sub1) this).aFloat5363) + (((Class_c_Sub1) this).aFloat5386 * (float) -i - (float) i_7_ * ((Class_c_Sub1) this).aFloat5378));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tu.s(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	final void m(int[] is) {
		try {
			anInt5359++;
			float f = (float) is[0] - ((Class_c_Sub1) this).aFloat5393;
			float f_19_ = -((Class_c_Sub1) this).aFloat5385 + (float) is[1];
			float f_20_ = (float) is[2] - ((Class_c_Sub1) this).aFloat5362;
			is[2] = (int) (f * ((Class_c_Sub1) this).aFloat5388 + f_19_ * ((Class_c_Sub1) this).aFloat5367 + f_20_ * ((Class_c_Sub1) this).aFloat5363);
			is[1] = (int) (((Class_c_Sub1) this).aFloat5387 * f + ((Class_c_Sub1) this).aFloat5382 * f_19_ + f_20_ * ((Class_c_Sub1) this).aFloat5378);
			is[0] = (int) (f_20_ * ((Class_c_Sub1) this).aFloat5386 + (((Class_c_Sub1) this).aFloat5372 * f + f_19_ * ((Class_c_Sub1) this).aFloat5364));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.m(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2275(byte i, Class130_Sub4 class130_sub4) {
		do {
			try {
				((Class130_Sub4) class130_sub4).aClass_r4744 = null;
				anInt5376++;
				if (i != -69)
					anInt5389 = -32;
				if (Class246_Sub28_Sub32.anInt6932 >= 20)
					break;
				Class246_Sub34.aClass68_5141.method438(-120, class130_sub4);
				Class246_Sub28_Sub32.anInt6932++;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tu.J(" + i + ',' + (class130_sub4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void xa() {
		try {
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) this).aFloat5382 = ((Class_c_Sub1) this).aFloat5363 = 1.0F;
			anInt5381++;
			((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5367 = ((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) this).aFloat5385 = ((Class_c_Sub1) this).aFloat5362 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.xa(" + ')');
		}
	}

	final void method2276(Class_c class_c, boolean bool) {
		try {
			anInt5368++;
			Class_c_Sub1 class_c_sub1_21_ = (Class_c_Sub1) class_c;
			((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5386;
			((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5364;
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5372;
			((Class_c_Sub1) this).aFloat5367 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5378;
			((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5388;
			((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5387;
			((Class_c_Sub1) this).aFloat5382 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5382;
			((Class_c_Sub1) this).aFloat5393 = -((((Class_c_Sub1) class_c_sub1_21_).aFloat5385 * ((Class_c_Sub1) this).aFloat5387) + (((Class_c_Sub1) class_c_sub1_21_).aFloat5393 * ((Class_c_Sub1) this).aFloat5372) + (((Class_c_Sub1) this).aFloat5388 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5362));
			((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5367;
			((Class_c_Sub1) this).aFloat5363 = ((Class_c_Sub1) class_c_sub1_21_).aFloat5363;
			if (bool == false) {
				((Class_c_Sub1) this).aFloat5385 = -((((Class_c_Sub1) this).aFloat5367 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5362) + ((((Class_c_Sub1) this).aFloat5364 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5393) + (((Class_c_Sub1) this).aFloat5382 * (((Class_c_Sub1) class_c_sub1_21_).aFloat5385))));
				((Class_c_Sub1) this).aFloat5362 = -((((Class_c_Sub1) this).aFloat5386 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5393) + (((Class_c_Sub1) this).aFloat5378 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5385) + (((Class_c_Sub1) this).aFloat5363 * ((Class_c_Sub1) class_c_sub1_21_).aFloat5362));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.K(" + (class_c != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final void method2277(int i, int i_22_, int i_23_, float f, int i_24_, float f_25_, float f_26_) {
		do {
			try {
				do {
					if ((i_22_ ^ 0xffffffff) != -1) {
						float f_27_ = Class12.aFloatArray179[i_22_ & 0x3fff];
						float f_28_ = Class12.aFloatArray178[i_22_ & 0x3fff];
						((Class_c_Sub1) this).aFloat5363 = 1.0F;
						((Class_c_Sub1) this).aFloat5387 = -f_28_ * (float) i_24_;
						((Class_c_Sub1) this).aFloat5382 = (float) i_24_ * f_27_;
						((Class_c_Sub1) this).aFloat5372 = f_27_ * (float) i_23_;
						((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5367 = 0.0F;
						((Class_c_Sub1) this).aFloat5364 = f_28_ * (float) i_23_;
						if (!client.f_ob)
							break;
					}
					((Class_c_Sub1) this).aFloat5363 = 1.0F;
					((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5367 = 0.0F;
					((Class_c_Sub1) this).aFloat5372 = (float) i_23_;
					((Class_c_Sub1) this).aFloat5382 = (float) i_24_;
				} while (false);
				anInt5383++;
				((Class_c_Sub1) this).aFloat5393 = f_25_;
				((Class_c_Sub1) this).aFloat5362 = f_26_;
				((Class_c_Sub1) this).aFloat5385 = f;
				if (i == 0)
					break;
				ra(-121);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tu.E(" + i + ',' + i_22_ + ',' + i_23_ + ',' + f + ',' + i_24_ + ',' + f_25_ + ',' + f_26_ + ')'));
			}
			break;
		} while (false);
	}

	final void za(Class_c class_c) {
		try {
			anInt5360++;
			Class_c_Sub1 class_c_sub1_29_ = (Class_c_Sub1) class_c;
			((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5378;
			((Class_c_Sub1) this).aFloat5363 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5363;
			((Class_c_Sub1) this).aFloat5385 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5385;
			((Class_c_Sub1) this).aFloat5362 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5362;
			((Class_c_Sub1) this).aFloat5382 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5382;
			((Class_c_Sub1) this).aFloat5367 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5367;
			((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5364;
			((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5387;
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5372;
			((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5388;
			((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5393;
			((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) class_c_sub1_29_).aFloat5386;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.za(" + (class_c != null ? "{...}" : "null") + ')');
		}
	}

	final void ja(int i) {
		try {
			anInt5371++;
			float f = Class12.aFloatArray179[i & 0x3fff];
			float f_30_ = Class12.aFloatArray178[i & 0x3fff];
			float f_31_ = ((Class_c_Sub1) this).aFloat5372;
			float f_32_ = ((Class_c_Sub1) this).aFloat5387;
			float f_33_ = ((Class_c_Sub1) this).aFloat5388;
			((Class_c_Sub1) this).aFloat5372 = f_30_ * ((Class_c_Sub1) this).aFloat5386 + f * f_31_;
			float f_34_ = ((Class_c_Sub1) this).aFloat5393;
			((Class_c_Sub1) this).aFloat5387 = f * f_32_ + ((Class_c_Sub1) this).aFloat5378 * f_30_;
			((Class_c_Sub1) this).aFloat5386 = f * ((Class_c_Sub1) this).aFloat5386 - f_31_ * f_30_;
			((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5378 * f - f_32_ * f_30_;
			((Class_c_Sub1) this).aFloat5388 = f * f_33_ + f_30_ * ((Class_c_Sub1) this).aFloat5363;
			((Class_c_Sub1) this).aFloat5363 = -(f_30_ * f_33_) + ((Class_c_Sub1) this).aFloat5363 * f;
			((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) this).aFloat5362 * f_30_ + f * f_34_;
			((Class_c_Sub1) this).aFloat5362 = -(f_30_ * f_34_) + ((Class_c_Sub1) this).aFloat5362 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.ja(" + i + ')');
		}
	}

	final void o(int i, int i_35_, int i_36_) {
		try {
			((Class_c_Sub1) this).aFloat5385 += (float) i_35_;
			anInt5369++;
			((Class_c_Sub1) this).aFloat5362 += (float) i_36_;
			((Class_c_Sub1) this).aFloat5393 += (float) i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tu.o(" + i + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	final void ra(int i) {
		try {
			anInt5390++;
			((Class_c_Sub1) this).aFloat5382 = 1.0F;
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) this).aFloat5363 = Class12.aFloatArray179[i & 0x3fff];
			((Class_c_Sub1) this).aFloat5388 = Class12.aFloatArray178[0x3fff & i];
			((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) this).aFloat5367 = ((Class_c_Sub1) this).aFloat5385 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5362 = 0.0F;
			((Class_c_Sub1) this).aFloat5386 = -((Class_c_Sub1) this).aFloat5388;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.ra(" + i + ')');
		}
	}

	static final void method2278(int i) {
		do {
			try {
				anInt5391++;
				if (Class109_Sub1_Sub1.anInt6725 < 0) {
					Class109_Sub1_Sub1.anInt6725 = 0;
					OutputStream_Sub1.anInt4489 = -1;
					Class40.anInt617 = -1;
				}
				if (Class109_Sub1_Sub1.anInt6725 > Class79.anInt1054) {
					OutputStream_Sub1.anInt4489 = -1;
					Class40.anInt617 = -1;
					Class109_Sub1_Sub1.anInt6725 = Class79.anInt1054;
				}
				if (i < (Class21.anInt322 ^ 0xffffffff)) {
					Class40.anInt617 = -1;
					OutputStream_Sub1.anInt4489 = -1;
					Class21.anInt322 = 0;
				}
				if ((Class21.anInt322 ^ 0xffffffff) >= (Class79.anInt1058 ^ 0xffffffff))
					break;
				OutputStream_Sub1.anInt4489 = -1;
				Class40.anInt617 = -1;
				Class21.anInt322 = Class79.anInt1058;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tu.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void p(int i, int i_37_, int i_38_, int[] is) {
		try {
			is[1] = (int) ((float) i * ((Class_c_Sub1) this).aFloat5364 + (float) i_37_ * ((Class_c_Sub1) this).aFloat5382 + (float) i_38_ * ((Class_c_Sub1) this).aFloat5367);
			is[0] = (int) (((Class_c_Sub1) this).aFloat5387 * (float) i_37_ + ((Class_c_Sub1) this).aFloat5372 * (float) i + (float) i_38_ * ((Class_c_Sub1) this).aFloat5388);
			anInt5361++;
			is[2] = (int) ((float) i_38_ * ((Class_c_Sub1) this).aFloat5363 + ((float) i_37_ * ((Class_c_Sub1) this).aFloat5378 + ((Class_c_Sub1) this).aFloat5386 * (float) i));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tu.p(" + i + ',' + i_37_ + ',' + i_38_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2279(int i) {
		try {
			Class169.aFloatArray2413[14] = ((Class_c_Sub1) this).aFloat5362;
			anInt5370++;
			Class169.aFloatArray2413[1] = ((Class_c_Sub1) this).aFloat5364;
			Class169.aFloatArray2413[i] = ((Class_c_Sub1) this).aFloat5372;
			Class169.aFloatArray2413[8] = ((Class_c_Sub1) this).aFloat5388;
			Class169.aFloatArray2413[13] = ((Class_c_Sub1) this).aFloat5385;
			Class169.aFloatArray2413[10] = ((Class_c_Sub1) this).aFloat5363;
			Class169.aFloatArray2413[2] = ((Class_c_Sub1) this).aFloat5386;
			Class169.aFloatArray2413[5] = ((Class_c_Sub1) this).aFloat5382;
			Class169.aFloatArray2413[9] = ((Class_c_Sub1) this).aFloat5367;
			Class169.aFloatArray2413[12] = ((Class_c_Sub1) this).aFloat5393;
			Class169.aFloatArray2413[4] = ((Class_c_Sub1) this).aFloat5387;
			Class169.aFloatArray2413[6] = ((Class_c_Sub1) this).aFloat5378;
			return Class169.aFloatArray2413;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.G(" + i + ')');
		}
	}

	final void j(int i, int i_39_, int i_40_) {
		try {
			((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5367 = 0.0F;
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) this).aFloat5382 = ((Class_c_Sub1) this).aFloat5363 = 1.0F;
			anInt5365++;
			((Class_c_Sub1) this).aFloat5362 = (float) i_40_;
			((Class_c_Sub1) this).aFloat5393 = (float) i;
			((Class_c_Sub1) this).aFloat5385 = (float) i_39_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tu.j(" + i + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	final Class_c method582() {
		try {
			anInt5377++;
			Class_c_Sub1 class_c_sub1_41_ = new Class_c_Sub1();
			((Class_c_Sub1) class_c_sub1_41_).aFloat5362 = ((Class_c_Sub1) this).aFloat5362;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5378 = ((Class_c_Sub1) this).aFloat5378;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5372 = ((Class_c_Sub1) this).aFloat5372;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5386 = ((Class_c_Sub1) this).aFloat5386;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5363 = ((Class_c_Sub1) this).aFloat5363;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5367 = ((Class_c_Sub1) this).aFloat5367;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5393 = ((Class_c_Sub1) this).aFloat5393;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5364 = ((Class_c_Sub1) this).aFloat5364;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5385 = ((Class_c_Sub1) this).aFloat5385;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5388 = ((Class_c_Sub1) this).aFloat5388;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5387 = ((Class_c_Sub1) this).aFloat5387;
			((Class_c_Sub1) class_c_sub1_41_).aFloat5382 = ((Class_c_Sub1) this).aFloat5382;
			return class_c_sub1_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.A(" + ')');
		}
	}

	final void O(int i) {
		try {
			anInt5384++;
			((Class_c_Sub1) this).aFloat5363 = 1.0F;
			((Class_c_Sub1) this).aFloat5372 = ((Class_c_Sub1) this).aFloat5382 = Class12.aFloatArray179[i & 0x3fff];
			((Class_c_Sub1) this).aFloat5364 = Class12.aFloatArray178[i & 0x3fff];
			((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) this).aFloat5367 = ((Class_c_Sub1) this).aFloat5385 = ((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5378 = ((Class_c_Sub1) this).aFloat5362 = 0.0F;
			((Class_c_Sub1) this).aFloat5387 = -((Class_c_Sub1) this).aFloat5364;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.O(" + i + ')');
		}
	}

	final void N(int i) {
		try {
			((Class_c_Sub1) this).aFloat5372 = 1.0F;
			anInt5380++;
			((Class_c_Sub1) this).aFloat5382 = ((Class_c_Sub1) this).aFloat5363 = Class12.aFloatArray179[i & 0x3fff];
			((Class_c_Sub1) this).aFloat5378 = Class12.aFloatArray178[i & 0x3fff];
			((Class_c_Sub1) this).aFloat5387 = ((Class_c_Sub1) this).aFloat5388 = ((Class_c_Sub1) this).aFloat5393 = ((Class_c_Sub1) this).aFloat5364 = ((Class_c_Sub1) this).aFloat5385 = ((Class_c_Sub1) this).aFloat5386 = ((Class_c_Sub1) this).aFloat5362 = 0.0F;
			((Class_c_Sub1) this).aFloat5367 = -((Class_c_Sub1) this).aFloat5378;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.N(" + i + ')');
		}
	}

	public Class_c_Sub1() {
		try {
			xa();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tu.<init>(" + ')');
		}
	}
}
