
/* Class40_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub6 extends Class40 {
	static int anInt5085;
	private boolean aBool5086;
	static int anInt5087;
	static int anInt5088;
	static int anInt5089;
	private Class34 aClass34_5090;
	private boolean aBool5091 = false;
	static Class101 aClass101_5092;
	static int anInt5093;
	static int anInt5094;
	static int anInt5095;
	static int anInt5096;
	static int anInt5097;
	static int anInt5098;
	static int anInt5099 = 13156520;
	private Class109_Sub4[] aClass109_Sub4Array5100;
	static int anInt5101;
	static int[] anIntArray5102;
	static int anInt5103;

	final void method284(boolean bool, byte i) {
		do {
			try {
				((Class40) this).aClass260_Sub2_613.method1912(8448, 7681, true);
				anInt5095++;
				if (i > 115)
					break;
				method280(39);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pv.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		try {
			anInt5093++;
			if (i != 0)
				method280(100);
			do {
				if (!aBool5091) {
					((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
					if (!client.f_ob)
						break;
				}
				if (!aBool5086) {
					((Class40) this).aClass260_Sub2_613.method1936(2, -127);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				}
				((Class40) this).aClass260_Sub2_613.method1936(1, -127);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				((Class40) this).aClass260_Sub2_613.method1936(0, -127);
				aClass34_5090.method246('\001', i ^ 0xffffffff);
				aBool5091 = false;
			} while (false);
			((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pv.I(" + i + ')');
		}
	}

	Class40_Sub6(Class260_Sub2 class260_sub2) {
		super(class260_sub2);
		do {
			try {
				if (!((Class260_Sub2) class260_sub2).aBool4340)
					break;
				aBool5086 = ((Class260_Sub2) class260_sub2).f_mg < 3;
				int i = !aBool5086 ? 127 : 48;
				byte[][] is = new byte[6][4096];
				byte[][] is_0_ = new byte[6][4096];
				byte[][] is_1_ = new byte[6][4096];
				int i_2_ = 0;
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -65; i_3_++) {
					for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -65; i_4_++) {
						float f = -1.0F + 2.0F * (float) i_4_ / 64.0F;
						float f_5_ = (float) i_3_ * 2.0F / 64.0F - 1.0F;
						float f_6_ = (float) (1.0 / Math.sqrt((double) (f_5_ * f_5_ + (f * f + 1.0F))));
						f *= f_6_;
						f_5_ *= f_6_;
						for (int i_7_ = 0; i_7_ < 6; i_7_++) {
							float f_8_;
							if ((i_7_ ^ 0xffffffff) != -1) {
								if (i_7_ != 1) {
									if (i_7_ != 2) {
										if (i_7_ != 3) {
											if ((i_7_ ^ 0xffffffff) == -5)
												f_8_ = f_6_;
											else
												f_8_ = -f_6_;
										} else
											f_8_ = -f_5_;
									} else
										f_8_ = f_5_;
								} else
									f_8_ = f;
							} else
								f_8_ = -f;
							int i_9_;
							int i_10_;
							int i_11_;
							if (!(f_8_ > 0.0F))
								i_9_ = i_10_ = i_11_ = 0;
							else {
								i_9_ = (int) (Math.pow((double) f_8_, 96.0) * (double) i);
								i_10_ = (int) (Math.pow((double) f_8_, 36.0) * (double) i);
								i_11_ = (int) (Math.pow((double) f_8_, 12.0) * (double) i);
							}
							is_0_[i_7_][i_2_] = (byte) i_9_;
							is_1_[i_7_][i_2_] = (byte) i_10_;
							is[i_7_][i_2_] = (byte) i_11_;
						}
						i_2_++;
					}
				}
				aClass109_Sub4Array5100 = new Class109_Sub4[3];
				aClass109_Sub4Array5100[0] = new Class109_Sub4(((Class40) this).aClass260_Sub2_613, 6406, 64, false, is_0_, 6406);
				aClass109_Sub4Array5100[1] = new Class109_Sub4(((Class40) this).aClass260_Sub2_613, 6406, 64, false, is_1_, 6406);
				aClass109_Sub4Array5100[2] = new Class109_Sub4(((Class40) this).aClass260_Sub2_613, 6406, 64, false, is, 6406);
				method2184(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pv.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final void method2182(byte i) {
		do {
			try {
				anInt5097++;
				Class33.aClass260_444.UA(Class195.anInt2731, ((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool592) ? Class3.anInt29 + 256 << 0 : -1), 256);
				if (i == -98)
					break;
				aClass101_5092 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pv.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			if (bool != true)
				method282(false);
			anInt5089++;
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
			((Class40) this).aClass260_Sub2_613.method1900(7681, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pv.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final int method2183(byte i) {
		try {
			anInt5096++;
			if (i != -29)
				anIntArray5102 = null;
			synchronized (Class253.aClass54_3600) {
				return Class253.aClass54_3600.method378((byte) -120);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pv.J(" + i + ')');
		}
	}

	private final void method2184(boolean bool) {
		try {
			anInt5101++;
			aClass34_5090 = new Class34(((Class40) this).aClass260_Sub2_613, 2);
			aClass34_5090.method247(0, bool);
			((Class40) this).aClass260_Sub2_613.method1936(1, -120);
			OpenGL.glTexGeni(8192, 9472, 34065);
			OpenGL.glTexGeni(8193, 9472, 34065);
			OpenGL.glTexGeni(8194, 9472, 34065);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			OpenGL.glMatrixMode(5888);
			if (aBool5086) {
				((Class40) this).aClass260_Sub2_613.method1912(260, 7681, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 770, 5890);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34167, 0);
			} else {
				((Class40) this).aClass260_Sub2_613.method1912(7681, 8448, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 34168);
				((Class40) this).aClass260_Sub2_613.method1936(2, -118);
				((Class40) this).aClass260_Sub2_613.method1912(260, 7681, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 34168);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 1, 770, 34168);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34167, 0);
			}
			((Class40) this).aClass260_Sub2_613.method1936(0, -118);
			aClass34_5090.method248((byte) 39);
			aClass34_5090.method247(1, bool);
			((Class40) this).aClass260_Sub2_613.method1936(1, -119);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			if (!aBool5086) {
				((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, bool);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 5890);
				((Class40) this).aClass260_Sub2_613.method1936(2, -127);
				((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 5890);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 1, 768, 34168);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
			} else {
				((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 0, 768, 5890);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
			}
			((Class40) this).aClass260_Sub2_613.method1936(0, -121);
			aClass34_5090.method248((byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pv.E(" + bool + ')');
		}
	}

	final void method278(int i, boolean bool) {
		do {
			try {
				do {
					if (aClass34_5090 == null || !bool) {
						((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34168, 0);
						if (!client.f_ob)
							break;
					}
					if (!aBool5086) {
						((Class40) this).aClass260_Sub2_613.method1936(2, -119);
						((Class40) this).aClass260_Sub2_613.method1905((byte) 78, (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aClass109_Sub1_4370));
						((Class40) this).aClass260_Sub2_613.method1936(0, -124);
					}
					aClass34_5090.method246('\0', -1);
					aBool5091 = true;
				} while (false);
				anInt5087++;
				if (i == 0)
					break;
				method2185(null, 49, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pv.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2185(Class_fs class_fs, int i, Class_fs class_fs_12_) {
		try {
			if (i != 3168)
				aClass101_5092 = null;
			anInt5088++;
			Class_u_Sub1.aClass_fs5684 = class_fs;
			Class236.aClass_fs3308 = class_fs_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pv.F(" + (class_fs != null ? "{...}" : "null") + ',' + i + ',' + (class_fs_12_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				method2184(false);
			anInt5085++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pv.G(" + bool + ')');
		}
	}

	final void method277(int i, int i_13_, int i_14_) {
		do {
			try {
				if (aBool5091) {
					((Class40) this).aClass260_Sub2_613.method1936(1, -127);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, aClass109_Sub4Array5100[-1 + i]);
					((Class40) this).aClass260_Sub2_613.method1936(0, -125);
				}
				anInt5098++;
				if (i_13_ >= 76)
					break;
				method2185(null, -58, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pv.H(" + i + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2186(boolean bool) {
		try {
			aClass101_5092 = null;
			if (bool == true)
				anIntArray5102 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pv.C(" + bool + ')');
		}
	}

	static {
		aClass101_5092 = new Class101("stellardawn", 1);
		anIntArray5102 = new int[14];
		anInt5103 = 0;
	}
}
