
/* Class40_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub3 extends Class40 {
	private Class_m aClass_m4052;
	static int anInt4053;
	static double aDouble4054 = -1.0;
	static int anInt4055;
	static int anInt4056;
	static int anInt4057;
	static IncomingPacket aClass13_4058;
	static int anInt4059;
	static int anInt4060;
	static int anInt4061;
	private Class109_Sub2 aClass109_Sub2_4062;
	private Class34 aClass34_4063;
	static int[] anIntArray4064;
	static int anInt4065;
	static int anInt4066;
	static int anInt4067;
	static int anInt4068;
	static int anInt4069;
	static byte[] aByteArray4070 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int[] anIntArray4071;

	static final int method1860(int i, Class235 class235, int i_0_) {
		try {
			if (i_0_ >= -104)
				method1865(-93, 38, -9, -68, -37, -18);
			anInt4056++;
			if (!client.method2971(class235).method2120(i, 1) && ((Class235) class235).anObjectArray3236 == null)
				return -1;
			if (((Class235) class235).f_pc == null || ((Class235) class235).f_pc.length <= i)
				return -1;
			return ((Class235) class235).f_pc[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dm.E(" + i + ',' + (class235 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	Class40_Sub3(Class260_Sub2 class260_sub2, Class_m class_m) {
		super(class260_sub2);
		try {
			aClass_m4052 = class_m;
			method1861(-11540);
			aClass109_Sub2_4062 = new Class109_Sub2(((Class40) this).aClass260_Sub2_613, 6406, 2, new byte[] { 0, -1 }, 6406);
			aClass109_Sub2_4062.method1791((byte) 35, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dm.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class_m != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1861(int i) {
		try {
			anInt4066++;
			aClass34_4063 = new Class34(((Class40) this).aClass260_Sub2_613, 2);
			aClass34_4063.method247(0, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -125);
			((Class40) this).aClass260_Sub2_613.method1912(7681, 260, true);
			((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 34168);
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glEnable(3168);
			((Class40) this).aClass260_Sub2_613.method1936(0, -124);
			OpenGL.glTexEnvf(8960, 34163, 2.0F);
			if (((Class_m) aClass_m4052).aBool1538) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glTexGeni(8195, 9472, 9217);
				OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
				OpenGL.glEnable(3170);
				OpenGL.glEnable(3171);
			}
			aClass34_4063.method248((byte) 39);
			aClass34_4063.method247(1, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -128);
			((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
			((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 5890);
			if (i == -11540) {
				OpenGL.glDisable(3168);
				((Class40) this).aClass260_Sub2_613.method1936(0, -121);
				OpenGL.glTexEnvf(8960, 34163, 1.0F);
				if (((Class_m) aClass_m4052).aBool1538) {
					OpenGL.glDisable(3170);
					OpenGL.glDisable(3171);
				}
				aClass34_4063.method248((byte) 39);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.K(" + i + ')');
		}
	}

	final void method284(boolean bool, byte i) {
		do {
			try {
				((Class40) this).aClass260_Sub2_613.method1912(260, 8448, true);
				anInt4061++;
				if (i >= 115)
					break;
				anIntArray4064 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dm.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				method280(74);
			anInt4068++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.G(" + bool + ')');
		}
	}

	final void method278(int i, boolean bool) {
		try {
			if (((((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4377) ^ 0xffffffff) < -1) {
				float f = -0.5F / (float) (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4377);
				((Class40) this).aClass260_Sub2_613.method1936(1, -120);
				Class246_Sub28_Sub34.aFloatArray7009[1] = 0.0F;
				Class246_Sub28_Sub34.aFloatArray7009[0] = 0.0F;
				Class246_Sub28_Sub34.aFloatArray7009[2] = f;
				Class246_Sub28_Sub34.aFloatArray7009[3] = 0.25F + ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_gf * f;
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glTexGenfv(8192, 9474, Class246_Sub28_Sub34.aFloatArray7009, 0);
				OpenGL.glPopMatrix();
				((Class40) this).aClass260_Sub2_613.method1943(0.5F, (float) ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4377, 27060);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, aClass109_Sub2_4062);
				((Class40) this).aClass260_Sub2_613.method1936(0, i ^ ~0x7c);
			}
			anInt4060++;
			aClass34_4063.method246('\0', -1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(0.25F, 0.25F, 1.0F);
			if (i == 0)
				OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.D(" + i + ',' + bool + ')');
		}
	}

	public static void method1862(int i) {
		try {
			if (i <= 97)
				method1863(-107, 9, -47);
			aClass13_4058 = null;
			aByteArray4070 = null;
			anIntArray4064 = null;
			anIntArray4071 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.L(" + i + ')');
		}
	}

	static final boolean method1863(int i, int i_1_, int i_2_) {
		try {
			int i_3_ = 87 / ((-70 - i_1_) / 51);
			anInt4053++;
			return (i_2_ & 0x220 ^ 0xffffffff) == -545 | (0x18 & i_2_) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dm.J(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1864(byte i) {
		try {
			Class238.method1533(22050, ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool570, false, 2);
			anInt4059++;
			Class200.aClass246_Sub37_Sub1_2850 = new Class246_Sub37_Sub1();
			Class200.aClass246_Sub37_Sub1_2850.method2528(-25296, 128, 9);
			Class246_Sub40.aClass123_5522 = Class259_Sub2_Sub1.method2845(0, 2, Class108.aClass52_1535, 22050, Class147.aCanvas2155);
			Class246_Sub40.aClass123_5522.method836(Class200.aClass246_Sub37_Sub1_2850, (byte) -15);
			Class250.method1604(Class246_Sub28_Sub3.index4, Class200.aClass246_Sub37_Sub1_2850, Class171.index14, Class193.index15, (byte) -115);
			Class246_Sub28_Sub26.aClass123_6716 = Class259_Sub2_Sub1.method2845(1, 2, Class108.aClass52_1535, 2048, Class147.aCanvas2155);
			Canvas_Sub1.aClass246_Sub37_Sub2_6889 = new Class246_Sub37_Sub2();
			Class246_Sub28_Sub26.aClass123_6716.method836(Canvas_Sub1.aClass246_Sub37_Sub2_6889, (byte) -15);
			Class148.aClass250_2178 = new Class250(22050, Class140.anInt2024);
			Class236.anInt3307 = Class21.index6.method86(ClientLoader.LOGIN_MUSIC, (byte) -111);
			int i_4_ = 49 / ((i + 57) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.F(" + i + ')');
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			if (bool == true)
				anInt4067++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dm.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method277(int i, int i_5_, int i_6_) {
		do {
			try {
				anInt4057++;
				if ((0x1 & i) == 1) {
					if (!((Class_m) aClass_m4052).aBool1538) {
						int i_7_ = (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe % 4000 * 16 / 4000);
						((Class40) this).aClass260_Sub2_613.method1905((byte) 78, (((Class_m) aClass_m4052).aClass109_Sub1Array1541[i_7_]));
					} else {
						((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4052).aClass109_Sub3_1543);
						Class246_Sub28_Sub34.aFloatArray7009[3] = (float) ((((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe) % 4000) / 4000.0F;
						Class246_Sub28_Sub34.aFloatArray7009[1] = 0.0F;
						Class246_Sub28_Sub34.aFloatArray7009[2] = 0.0F;
						Class246_Sub28_Sub34.aFloatArray7009[0] = 0.0F;
						OpenGL.glTexGenfv(8194, 9473, Class246_Sub28_Sub34.aFloatArray7009, 0);
					}
				} else if (((Class_m) aClass_m4052).aBool1538) {
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4052).aClass109_Sub3_1543);
					Class246_Sub28_Sub34.aFloatArray7009[0] = 0.0F;
					Class246_Sub28_Sub34.aFloatArray7009[3] = 0.0F;
					Class246_Sub28_Sub34.aFloatArray7009[2] = 0.0F;
					Class246_Sub28_Sub34.aFloatArray7009[1] = 0.0F;
					OpenGL.glTexGenfv(8194, 9473, Class246_Sub28_Sub34.aFloatArray7009, 0);
				} else
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4052).aClass109_Sub1Array1541[0]);
				if (i_5_ > 76)
					break;
				method1860(30, null, -115);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dm.H(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		try {
			aClass34_4063.method246('\001', -1);
			anInt4065++;
			if (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4377 > i) {
				((Class40) this).aClass260_Sub2_613.method1936(1, -127);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				((Class40) this).aClass260_Sub2_613.method1943(1.0F, 0.0F, 27060);
				((Class40) this).aClass260_Sub2_613.method1936(0, -125);
			}
			((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dm.I(" + i + ')');
		}
	}

	static final void method1865(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			anInt4069++;
			int i_13_ = 0;
			int i_14_ = i_11_;
			int i_15_ = i_8_ * i_8_;
			int i_16_ = i_11_ * i_11_;
			int i_17_ = i_16_ << 1;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_11_ << 1;
			int i_20_ = i_15_ * (1 + -i_19_) - -i_17_;
			int i_21_ = -((i_19_ - 1) * i_18_) + i_16_;
			int i_22_ = i_15_ << 2;
			int i_23_ = i_16_ << 2;
			int i_24_ = ((i_13_ << 1) + 3) * i_17_;
			int i_25_ = i_18_ * (-3 + (i_14_ << 1));
			int i_26_ = (1 + i_13_) * i_23_;
			Class135.method918(-i_8_ + i_12_, -101, i_10_, i_12_ - -i_8_, Class246_Sub28_Sub6.anIntArrayArray6042[i]);
			int i_27_ = i_22_ * (-1 + i_14_);
			if (i_9_ != -484166047)
				anIntArray4071 = null;
			while ((i_14_ ^ 0xffffffff) < -1) {
				if ((i_20_ ^ 0xffffffff) > -1) {
					while (i_20_ < 0) {
						i_20_ += i_24_;
						i_21_ += i_26_;
						i_24_ += i_23_;
						i_26_ += i_23_;
						i_13_++;
					}
				}
				if (i_21_ < 0) {
					i_20_ += i_24_;
					i_21_ += i_26_;
					i_26_ += i_23_;
					i_24_ += i_23_;
					i_13_++;
				}
				i_20_ += -i_27_;
				i_21_ += -i_25_;
				i_14_--;
				i_27_ -= i_22_;
				i_25_ -= i_22_;
				int i_28_ = -i_14_ + i;
				int i_29_ = i_14_ + i;
				int i_30_ = i_13_ + i_12_;
				int i_31_ = -i_13_ + i_12_;
				Class135.method918(i_31_, i_9_ + 484166167, i_10_, i_30_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_28_]));
				Class135.method918(i_31_, 126, i_10_, i_30_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_29_]));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dm.C(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static {
		aClass13_4058 = new IncomingPacket(77, -2);
		anIntArray4071 = new int[] { 1, 4 };
	}
}
