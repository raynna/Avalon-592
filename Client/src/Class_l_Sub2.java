
/* Class_l_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class_l_Sub2 extends Class_l {
	static int anInt5451;
	static int anInt5452;
	private int anInt5453 = 0;
	private boolean aBool5454 = false;
	static int anInt5455;
	private int anInt5456 = 0;
	private int anInt5457;
	private Class109_Sub1_Sub1 aClass109_Sub1_Sub1_5458;
	private int anInt5459 = 0;
	static int anInt5460;
	static int anInt5461;
	static int anInt5462;
	static int anInt5463;
	static int anInt5464;
	private Class109_Sub1_Sub1 aClass109_Sub1_Sub1_5465;
	static int anInt5466;
	static int anInt5467;
	static int anInt5468;
	static int anInt5469;
	static int anInt5470;
	static int anInt5471;
	private Class260_Sub2 aClass260_Sub2_5472;
	private int anInt5473;
	static int anInt5474;
	static int anInt5475 = 0;
	static int anInt5476;
	static int anInt5477;
	static Class67 aClass67_5478 = new Class67("Continue", "Weiter", "Continuer", "Continuar");
	static int anInt5479;
	static int anInt5480;
	static int anInt5481 = 0;
	static OutgoingPacket REGION_DONE_LOADING_PACKET = new OutgoingPacket(17, 0);
	/* synthetic */ static Class aClass5483;

	final void method730(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, Class128 class128, int i, int i_5_) {
		try {
			anInt5455++;
			Class109_Sub1_Sub1 class109_sub1_sub1 = (((Class128_Sub1) (Class128_Sub1) class128).aClass109_Sub1_Sub1_5563);
			if (aBool5454) {
				float f_6_ = (float) j();
				float f_7_ = (float) T();
				float f_8_ = (-f + f_1_) / f_6_;
				float f_9_ = (-f_0_ + f_2_) / f_6_;
				float f_10_ = (-f + f_3_) / f_7_;
				float f_11_ = (-f_0_ + f_4_) / f_7_;
				float f_12_ = (float) anInt5457 * f_10_;
				float f_13_ = f_11_ * (float) anInt5457;
				float f_14_ = (float) anInt5473 * f_8_;
				float f_15_ = (float) anInt5473 * f_9_;
				float f_16_ = -f_8_ * (float) anInt5453;
				float f_17_ = -f_9_ * (float) anInt5453;
				float f_18_ = -f_10_ * (float) anInt5459;
				f_0_ = f_15_ + f_0_ + f_13_;
				f_3_ = f_14_ + f_3_ + f_18_;
				f_1_ = f_12_ + (f_1_ + f_16_);
				f_2_ = f_17_ + f_2_ + f_13_;
				f = f_14_ + f + f_12_;
				float f_19_ = -f_11_ * (float) anInt5459;
				f_4_ = f_19_ + (f_15_ + f_4_);
			}
			float f_20_ = -f + f_1_ + f_3_;
			float f_21_ = f_2_ + (-f_0_ + f_4_);
			aClass109_Sub1_Sub1_5465.method753(-107, true);
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
			aClass260_Sub2_5472.method1900(7681, 1);
			aClass260_Sub2_5472.method1936(1, -118);
			aClass260_Sub2_5472.method1905((byte) 78, class109_sub1_sub1);
			aClass260_Sub2_5472.method1912(7681, 8448, true);
			aClass260_Sub2_5472.method1945((byte) 79, 0, 768, 34168);
			aClass260_Sub2_5472.method1958(103, 1);
			float f_22_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6730 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6724));
			float f_23_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6729));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glMultiTexCoord2f(33985, f_22_ * (f - (float) i), (-(f_23_ * ((float) -i_5_ + f_0_)) + ((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727));
			OpenGL.glVertex2f(f, f_0_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, ((float) -i + f_3_) * f_22_, (-((f_4_ - (float) i_5_) * f_23_) + ((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727));
			OpenGL.glVertex2f(f_3_, f_4_);
			OpenGL.glMultiTexCoord2f(33984, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, ((float) -i + f_20_) * f_22_, (-(((float) -i_5_ + f_21_) * f_23_) + ((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727));
			OpenGL.glVertex2f(f_20_, f_21_);
			OpenGL.glMultiTexCoord2f(33984, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glMultiTexCoord2f(33985, f_22_ * (f_1_ - (float) i), (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 - f_23_ * ((float) -i_5_ + f_2_)));
			OpenGL.glVertex2f(f_1_, f_2_);
			OpenGL.glEnd();
			aClass260_Sub2_5472.method1945((byte) 79, 0, 768, 5890);
			aClass260_Sub2_5472.method1900(7681, 0);
			aClass260_Sub2_5472.method1905((byte) 78, null);
			aClass260_Sub2_5472.method1936(0, -127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.a(" + f + ',' + f_0_ + ',' + f_1_ + ',' + f_2_ + ',' + f_3_ + ',' + f_4_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
		}
	}

	public static void method2296(int i) {
		try {
			REGION_DONE_LOADING_PACKET = null;
			int i_24_ = -7 % ((i + 22) / 62);
			aClass67_5478 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.D(" + i + ')');
		}
	}

	final int la() {
		try {
			anInt5464++;
			return ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.la(" + ')');
		}
	}

	private final void method2297(byte i) {
		try {
			anInt5476++;
			aClass260_Sub2_5472.method1936(1, -124);
			if (i < 74)
				aClass67_5478 = null;
			aClass260_Sub2_5472.method1905((byte) 78, null);
			aClass260_Sub2_5472.method1912(8448, 8448, true);
			aClass260_Sub2_5472.method1945((byte) 79, 1, 768, 34168);
			aClass260_Sub2_5472.method1954(true, 770, 5890, 0);
			aClass260_Sub2_5472.method1936(0, -125);
			aClass260_Sub2_5472.method1945((byte) 79, 1, 768, 34168);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.G(" + i + ')');
		}
	}

	static final void method2298(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		do {
			try {
				anInt5474++;
				if (i_27_ != -27348)
					anInt5475 = -13;
				if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt602) == 0 || (i_28_ ^ 0xffffffff) == -1 || Class59.anInt819 >= 50 || i_25_ == -1)
					break;
				Class47.aClass258Array684[Class59.anInt819++] = new Class258((byte) 1, i_25_, i_28_, i_26_, i, i_29_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ut.B(" + i + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')'));
			}
			break;
		} while (false);
	}

	final int T() {
		try {
			anInt5477++;
			return (anInt5459 + (anInt5457 + (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.T(" + ')');
		}
	}

	final void BA(int i, int i_30_, int i_31_) {
		try {
			anInt5451++;
			OpenGL.glPixelTransferf(3348, 0.5F);
			OpenGL.glPixelTransferf(3349, 0.499F);
			OpenGL.glPixelTransferf(3352, 0.5F);
			OpenGL.glPixelTransferf(3353, 0.499F);
			OpenGL.glPixelTransferf(3354, 0.5F);
			OpenGL.glPixelTransferf(3355, 0.499F);
			aClass109_Sub1_Sub1_5458 = Class79_Sub1.method2205(i_30_, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729, i, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724, -128, aClass260_Sub2_5472);
			anInt5456 = i_31_;
			OpenGL.glPixelTransferf(3348, 1.0F);
			OpenGL.glPixelTransferf(3349, 0.0F);
			OpenGL.glPixelTransferf(3352, 1.0F);
			OpenGL.glPixelTransferf(3353, 0.0F);
			OpenGL.glPixelTransferf(3354, 1.0F);
			OpenGL.glPixelTransferf(3355, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.BA(" + i + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final int j() {
		try {
			anInt5467++;
			return (anInt5453 + ((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724) - -anInt5473));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.j(" + ')');
		}
	}

	static final String method2299(int i, byte[] is, int i_32_, int i_33_) {
		try {
			anInt5452++;
			char[] cs = new char[i_32_];
			int i_34_ = 0;
			for (int i_35_ = 0; (i_32_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
				int i_36_ = is[i_35_ + i_33_] & 0xff;
				if (i_36_ != 0) {
					if (i_36_ >= 128 && (i_36_ ^ 0xffffffff) > -161) {
						int i_37_ = Class40_Sub9.aCharArray5496[i_36_ - 128];
						if ((i_37_ ^ 0xffffffff) == -1)
							i_37_ = 63;
						i_36_ = i_37_;
					}
					cs[i_34_++] = (char) i_36_;
				}
			}
			if (i != 11783)
				anInt5481 = 48;
			return new String(cs, 0, i_34_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.A(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_32_ + ',' + i_33_ + ')'));
		}
	}

	final int ma() {
		try {
			anInt5470++;
			return ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.ma(" + ')');
		}
	}

	static final void method2300(byte i) {
		try {
			anInt5480++;
			int i_38_ = -53 / ((65 - i) / 47);
			for (Class246_Sub16 class246_sub16 = ((Class246_Sub16) Class159.aClass166_2258.method1104(100)); class246_sub16 != null; class246_sub16 = ((Class246_Sub16) Class159.aClass166_2258.method1108((byte) -112))) {
				if (Class106.aClass147ArrayArrayArray1494 == null)
					class246_sub16.unlink((byte) -51);
				else if ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) > (((Class246_Sub16) class246_sub16).anInt4535 ^ 0xffffffff)) {
					if (((Class246_Sub16) class246_sub16).anInt4523 == Class246_Sub1_Sub4.anInt5752) {
						int i_39_ = (Class246_Sub19.anIntArray4712[((Class246_Sub16) class246_sub16).anInt4527]);
						if ((i_39_ ^ 0xffffffff) != -1) {
							if ((i_39_ ^ 0xffffffff) == -2) {
								Class59_Sub2 class59_sub2 = (Class31.method236((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)));
								if (class59_sub2 instanceof Class59_Sub2_Sub2)
									class246_sub16.unlink((byte) -35);
								else if (Class214.method1398((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)) != null)
									class246_sub16.unlink((byte) 83);
								else {
									Class59_Sub2_Sub2 class59_sub2_sub2 = (new Class59_Sub2_Sub2((((Class246_Sub16) class246_sub16).anInt4527), (((Class246_Sub16) class246_sub16).anInt4522), (((Class246_Sub16) class246_sub16).anInt4530), (((Class246_Sub16) class246_sub16).anInt4519), (((Class246_Sub16) class246_sub16).anInt4536), class59_sub2));
									Class41.method285((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), class59_sub2_sub2, null);
								}
							} else if (i_39_ == 2) {
								Class59_Sub3 class59_sub3 = (Class17.method168((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (aClass5483 != null ? aClass5483 : (aClass5483 = getClassByName("Class_f")))));
								if (class59_sub3 instanceof Class59_Sub3_Sub1)
									class246_sub16.unlink((byte) -97);
								else {
									Class103.method653((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (aClass5483 != null ? aClass5483 : (aClass5483 = getClassByName("Class_f"))));
									Class185 class185 = (Class143.aClass251_2067.method1610((((Class246_Sub16) class246_sub16).anInt4526), 0));
									int i_40_;
									int i_41_;
									if (((((Class246_Sub16) class246_sub16).anInt4522) ^ 0xffffffff) == -2 || ((((Class246_Sub16) class246_sub16).anInt4522) ^ 0xffffffff) == -4) {
										i_40_ = ((Class185) class185).anInt2596;
										i_41_ = ((Class185) class185).anInt2570;
									} else {
										i_40_ = ((Class185) class185).anInt2570;
										i_41_ = ((Class185) class185).anInt2596;
									}
									Class59_Sub3_Sub1 class59_sub3_sub1 = (new Class59_Sub3_Sub1((((Class246_Sub16) class246_sub16).anInt4527), (((Class246_Sub16) class246_sub16).anInt4522), (((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4530), (((Class246_Sub16) class246_sub16).anInt4519), (((Class246_Sub16) class246_sub16).anInt4536), (((Class246_Sub16) class246_sub16).anInt4520), i_41_ + (((Class246_Sub16) class246_sub16).anInt4520 - 1), (((Class246_Sub16) class246_sub16).anInt4525), (((Class246_Sub16) class246_sub16).anInt4525) - -i_40_ - 1, class59_sub3));
									Class176.method1156(class59_sub3_sub1, false);
								}
							} else if ((i_39_ ^ 0xffffffff) == -4) {
								Class59_Sub1 class59_sub1 = (Class246_Sub14.method1997((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)));
								if (class59_sub1 instanceof Class59_Sub1_Sub1)
									class246_sub16.unlink((byte) -33);
								else {
									Class59_Sub1_Sub1 class59_sub1_sub1 = (new Class59_Sub1_Sub1((((Class246_Sub16) class246_sub16).anInt4530), (((Class246_Sub16) class246_sub16).anInt4519), (((Class246_Sub16) class246_sub16).anInt4536), class59_sub1));
									Class213.method1393((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), class59_sub1_sub1);
								}
							}
						} else {
							Class59_Sub4 class59_sub4 = (Class246_Sub22.method2082((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)));
							if (class59_sub4 instanceof Class59_Sub4_Sub1)
								class246_sub16.unlink((byte) -115);
							else if (Class73.method463((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)) != null)
								class246_sub16.unlink((byte) 82);
							else {
								Class59_Sub4_Sub1 class59_sub4_sub1 = (new Class59_Sub4_Sub1((((Class246_Sub16) class246_sub16).anInt4527), (((Class246_Sub16) class246_sub16).anInt4522), (((Class246_Sub16) class246_sub16).anInt4530), (((Class246_Sub16) class246_sub16).anInt4519), (((Class246_Sub16) class246_sub16).anInt4536), class59_sub4));
								Class246_Sub2.method1785((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), class59_sub4_sub1, null);
							}
						}
					}
				} else {
					int i_42_ = (Class246_Sub19.anIntArray4712[((Class246_Sub16) class246_sub16).anInt4527]);
					if ((i_42_ ^ 0xffffffff) != -1) {
						if ((i_42_ ^ 0xffffffff) != -2) {
							if ((i_42_ ^ 0xffffffff) != -3) {
								if ((i_42_ ^ 0xffffffff) == -4) {
									Class59_Sub1 class59_sub1 = (Class246_Sub14.method1997((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525)));
									if (class59_sub1 instanceof Class59_Sub1_Sub1) {
										Class232.method1490((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525));
										Class59_Sub1_Sub1 class59_sub1_sub1 = (Class59_Sub1_Sub1) class59_sub1;
										if ((((Class59_Sub1_Sub1) class59_sub1_sub1).aClass59_Sub1_5982) != null)
											Class213.method1393(((Class246_Sub16) class246_sub16).anInt4528, ((Class246_Sub16) class246_sub16).anInt4520, ((Class246_Sub16) class246_sub16).anInt4525, (((Class59_Sub1_Sub1) class59_sub1_sub1).aClass59_Sub1_5982));
									}
								}
							} else {
								Class59_Sub3 class59_sub3 = (Class17.method168((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (aClass5483 != null ? aClass5483 : (aClass5483 = getClassByName("Class_f")))));
								if (class59_sub3 instanceof Class59_Sub3_Sub1) {
									Class103.method653((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (aClass5483 != null ? aClass5483 : (aClass5483 = getClassByName("Class_f"))));
									Class59_Sub3_Sub1 class59_sub3_sub1 = (Class59_Sub3_Sub1) class59_sub3;
									if (((Class59_Sub3_Sub1) class59_sub3_sub1).aClass59_Sub3_5732 != null)
										Class176.method1156((((Class59_Sub3_Sub1) class59_sub3_sub1).aClass59_Sub3_5732), false);
								}
							}
						} else {
							Class59_Sub2 class59_sub2 = Class31.method236(((Class246_Sub16) class246_sub16).anInt4528, ((Class246_Sub16) class246_sub16).anInt4520, (((Class246_Sub16) class246_sub16).anInt4525));
							if (class59_sub2 instanceof Class59_Sub2_Sub2) {
								Class40_Sub9.method2308((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525));
								Class59_Sub2_Sub2 class59_sub2_sub2 = (Class59_Sub2_Sub2) class59_sub2;
								if ((((Class59_Sub2_Sub2) class59_sub2_sub2).aClass59_Sub2_6009) != null)
									Class41.method285((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (((Class59_Sub2_Sub2) class59_sub2_sub2).aClass59_Sub2_6009), null);
							}
						}
					} else {
						Class59_Sub4 class59_sub4 = (Class246_Sub22.method2082(((Class246_Sub16) class246_sub16).anInt4528, ((Class246_Sub16) class246_sub16).anInt4520, ((Class246_Sub16) class246_sub16).anInt4525));
						if (class59_sub4 instanceof Class59_Sub4_Sub1) {
							Class197.method1285(((Class246_Sub16) class246_sub16).anInt4528, ((Class246_Sub16) class246_sub16).anInt4520, ((Class246_Sub16) class246_sub16).anInt4525);
							Class59_Sub4_Sub1 class59_sub4_sub1 = (Class59_Sub4_Sub1) class59_sub4;
							if ((((Class59_Sub4_Sub1) class59_sub4_sub1).aClass59_Sub4_6317) != null)
								Class246_Sub2.method1785((((Class246_Sub16) class246_sub16).anInt4528), (((Class246_Sub16) class246_sub16).anInt4520), (((Class246_Sub16) class246_sub16).anInt4525), (((Class59_Sub4_Sub1) class59_sub4_sub1).aClass59_Sub4_6317), null);
						}
					}
					class246_sub16.unlink((byte) -108);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.E(" + i + ')');
		}
	}

	final void a(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_, int i, int i_48_, int i_49_) {
		try {
			anInt5466++;
			if (aBool5454) {
				float f_50_ = (float) j();
				float f_51_ = (float) T();
				float f_52_ = (f_44_ - f) / f_50_;
				float f_53_ = (f_45_ - f_43_) / f_50_;
				float f_54_ = (f_46_ - f) / f_51_;
				float f_55_ = (-f_43_ + f_47_) / f_51_;
				float f_56_ = f_54_ * (float) anInt5457;
				float f_57_ = (float) anInt5457 * f_55_;
				float f_58_ = f_52_ * (float) anInt5473;
				float f_59_ = f_53_ * (float) anInt5473;
				float f_60_ = -f_52_ * (float) anInt5453;
				float f_61_ = -f_53_ * (float) anInt5453;
				float f_62_ = (float) anInt5459 * -f_54_;
				f = f + f_58_ + f_56_;
				f_43_ = f_59_ + f_43_ + f_57_;
				float f_63_ = -f_55_ * (float) anInt5459;
				f_44_ = f_44_ + f_60_ + f_56_;
				f_46_ = f_58_ + f_46_ + f_62_;
				f_45_ = f_45_ + f_61_ + f_57_;
				f_47_ = f_63_ + (f_59_ + f_47_);
			}
			float f_64_ = f_46_ + (f_44_ - f);
			float f_65_ = f_45_ + (f_47_ - f_43_);
			aClass109_Sub1_Sub1_5465.method753(-92, true);
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
			aClass260_Sub2_5472.method1958(122, i_49_);
			aClass260_Sub2_5472.method1900(7681, i);
			OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8), (byte) i_48_, (byte) (i_48_ >> 24));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glVertex2f(f, f_43_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2f(f_46_, f_47_);
			OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
			OpenGL.glVertex2f(f_64_, f_65_);
			OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glVertex2f(f_44_, f_45_);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.a(" + f + ',' + f_43_ + ',' + f_44_ + ',' + f_45_ + ',' + f_46_ + ',' + f_47_ + ',' + i + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	final void method737(int i, int i_66_, Class128 class128, int i_67_, int i_68_) {
		try {
			anInt5462++;
			Class128_Sub1 class128_sub1 = (Class128_Sub1) class128;
			Class109_Sub1_Sub1 class109_sub1_sub1 = ((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563;
			aClass109_Sub1_Sub1_5465.method753(-62, false);
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
			aClass260_Sub2_5472.method1900(7681, 1);
			aClass260_Sub2_5472.method1936(1, -119);
			aClass260_Sub2_5472.method1905((byte) 78, class109_sub1_sub1);
			aClass260_Sub2_5472.method1912(7681, 8448, true);
			aClass260_Sub2_5472.method1945((byte) 79, 0, 768, 34168);
			aClass260_Sub2_5472.method1958(110, 1);
			i_66_ += anInt5457;
			i += anInt5473;
			int i_69_ = i - -(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724);
			int i_70_ = i_66_ - -(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
			float f = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6730 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6724));
			float f_71_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6729));
			float f_72_ = f * (float) (i - i_67_);
			float f_73_ = f * (float) (-i_67_ + i_69_);
			float f_74_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 - f_71_ * (float) (-i_68_ + i_66_));
			float f_75_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 - f_71_ * (float) (i_70_ + -i_68_));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glMultiTexCoord2f(33985, f_72_, f_74_);
			OpenGL.glVertex2i(i, i_66_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_72_, f_75_);
			OpenGL.glVertex2i(i, i_66_ - -((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
			OpenGL.glMultiTexCoord2f(33984, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_73_, f_75_);
			OpenGL.glVertex2i(i + ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724, i_66_ + ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
			OpenGL.glMultiTexCoord2f(33984, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
			OpenGL.glMultiTexCoord2f(33985, f_73_, f_74_);
			OpenGL.glVertex2i(i - -((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724, i_66_);
			OpenGL.glEnd();
			aClass260_Sub2_5472.method1945((byte) 79, 0, 768, 5890);
			aClass260_Sub2_5472.method1900(7681, 0);
			aClass260_Sub2_5472.method1905((byte) 78, null);
			aClass260_Sub2_5472.method1936(0, -126);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.r(" + i + ',' + i_66_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i_67_ + ',' + i_68_ + ')'));
		}
	}

	private final void method2301(byte i, int i_76_) {
		try {
			anInt5469++;
			aClass260_Sub2_5472.method1936(1, -126);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
			aClass260_Sub2_5472.method1912(aClass260_Sub2_5472.method1962(1, i_76_), 7681, true);
			aClass260_Sub2_5472.method1945((byte) 79, 1, 768, 34167);
			aClass260_Sub2_5472.method1954(true, 770, 34168, 0);
			aClass260_Sub2_5472.method1936(0, -119);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5458);
			aClass260_Sub2_5472.method1912(34479, 7681, true);
			aClass260_Sub2_5472.method1945((byte) 79, 1, 768, 34166);
			if (i >= -5)
				j();
			if (anInt5456 == 0)
				aClass260_Sub2_5472.method1913(true, 0.5F, 0.0F, 0.5F, 1.0F);
			else if (anInt5456 != 1) {
				if (anInt5456 == 2)
					aClass260_Sub2_5472.method1913(true, 0.5F, 0.0F, 1.0F, 0.5F);
				else if ((anInt5456 ^ 0xffffffff) == -4)
					aClass260_Sub2_5472.method1913(true, 128.5F, 0.0F, 128.5F, 128.5F);
			} else
				aClass260_Sub2_5472.method1913(true, 1.0F, 0.0F, 0.5F, 0.5F);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ut.F(" + i + ',' + i_76_ + ')');
		}
	}

	final void r(int i, int i_77_, int i_78_, int i_79_, int i_80_) {
		try {
			anInt5479++;
			aClass109_Sub1_Sub1_5465.method753(-87, false);
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1958(-124, i_80_);
			OpenGL.glColor4ub((byte) (i_79_ >> 16), (byte) (i_79_ >> 8), (byte) i_79_, (byte) (i_79_ >> 24));
			i_77_ += anInt5457;
			i += anInt5473;
			if (aClass109_Sub1_Sub1_5458 == null) {
				aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
				aClass260_Sub2_5472.method1900(7681, i_78_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
				OpenGL.glVertex2i(i, i_77_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729 + i_77_));
				OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
				OpenGL.glVertex2i(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724 + i, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729 + i_77_));
				OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
				OpenGL.glVertex2i(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724 + i, i_77_);
				OpenGL.glEnd();
			} else {
				method2301((byte) -88, i_78_);
				aClass109_Sub1_Sub1_5458.method753(-73, false);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
				OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
				OpenGL.glVertex2i(i, i_77_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729 + i_77_));
				OpenGL.glMultiTexCoord2f(33985, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
				OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
				OpenGL.glVertex2i(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724 + i, i_77_ - -(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729));
				OpenGL.glMultiTexCoord2f(33985, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
				OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
				OpenGL.glVertex2i(i + ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724, i_77_);
				OpenGL.glEnd();
				method2297((byte) 109);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.r(" + i + ',' + i_77_ + ',' + i_78_ + ',' + i_79_ + ',' + i_80_ + ')'));
		}
	}

	final void JA(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_) {
		try {
			anInt5463++;
			int i_87_ = i - -i_82_;
			aClass109_Sub1_Sub1_5465.method753(-127, false);
			int i_88_ = i_81_ + i_83_;
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
			aClass260_Sub2_5472.method1958(-52, i_86_);
			aClass260_Sub2_5472.method1900(7681, i_84_);
			OpenGL.glColor4ub((byte) (i_85_ >> 16), (byte) (i_85_ >> 8), (byte) i_85_, (byte) (i_85_ >> 24));
			if (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aBool6732 && !aBool5454) {
				float f = ((float) i_83_ * (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727) / (float) ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
				float f_89_ = ((float) i_82_ * (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730) / (float) ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, f);
				OpenGL.glVertex2i(i, i_81_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, i_88_);
				OpenGL.glTexCoord2f(f_89_, 0.0F);
				OpenGL.glVertex2i(i_87_, i_88_);
				OpenGL.glTexCoord2f(f_89_, f);
				OpenGL.glVertex2i(i_87_, i_81_);
				OpenGL.glEnd();
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef((float) anInt5473, (float) anInt5457, 0.0F);
				int i_90_ = j();
				int i_91_ = T();
				int i_92_ = i_81_ - -(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
				OpenGL.glBegin(7);
				int i_93_ = i_81_;
				for (/**/; i_92_ <= i_88_; i_92_ += i_91_) {
					int i_94_ = ((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724) + i);
					int i_95_ = i;
					for (/**/; (i_87_ ^ 0xffffffff) <= (i_94_ ^ 0xffffffff); i_94_ += i_90_) {
						OpenGL.glTexCoord2f(0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_95_, i_93_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_95_, i_92_);
						OpenGL.glTexCoord2f((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), 0.0F);
						OpenGL.glVertex2i(i_94_, i_92_);
						OpenGL.glTexCoord2f((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_94_, i_93_);
						i_95_ += i_90_;
					}
					if ((i_95_ ^ 0xffffffff) > (i_87_ ^ 0xffffffff)) {
						float f = ((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730) * (float) (i_87_ + -i_95_) / (float) ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724);
						OpenGL.glTexCoord2f(0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_95_, i_93_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_95_, i_92_);
						OpenGL.glTexCoord2f(f, 0.0F);
						OpenGL.glVertex2i(i_87_, i_92_);
						OpenGL.glTexCoord2f(f, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_87_, i_93_);
					}
					i_93_ += i_91_;
				}
				if (i_88_ > i_93_) {
					float f = ((float) (-i_88_ + i_93_ + ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729) * (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727) / (float) ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729);
					int i_96_ = i - -(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724);
					int i_97_ = i;
					while ((i_96_ ^ 0xffffffff) >= (i_87_ ^ 0xffffffff)) {
						OpenGL.glTexCoord2f(0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_97_, i_93_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_97_, i_88_);
						OpenGL.glTexCoord2f((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), f);
						OpenGL.glVertex2i(i_96_, i_88_);
						OpenGL.glTexCoord2f((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_96_, i_93_);
						i_96_ += i_90_;
						i_97_ += i_90_;
					}
					if (i_87_ > i_97_) {
						float f_98_ = ((((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730) * (float) (-i_97_ + i_87_) / (float) ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724);
						OpenGL.glTexCoord2f(0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_97_, i_93_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_97_, i_88_);
						OpenGL.glTexCoord2f(f_98_, f);
						OpenGL.glVertex2i(i_87_, i_88_);
						OpenGL.glTexCoord2f(f_98_, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
						OpenGL.glVertex2i(i_87_, i_93_);
					}
				}
				OpenGL.glEnd();
				OpenGL.glPopMatrix();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.JA(" + i + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ',' + i_84_ + ',' + i_85_ + ',' + i_86_ + ')'));
		}
	}

	final void t(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		try {
			aClass109_Sub1_Sub1_5465.method1764(i_102_, (byte) 72, i_103_, i, i_99_, i_101_, i_100_);
			anInt5461++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.t(" + i + ',' + i_99_ + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ',' + i_103_ + ')'));
		}
	}

	final void MA(int i, int i_104_, int i_105_, int i_106_) {
		try {
			anInt5459 = i_106_;
			anInt5473 = i;
			anInt5453 = i_105_;
			anInt5471++;
			anInt5457 = i_104_;
			aBool5454 = ((anInt5473 ^ 0xffffffff) != -1 || anInt5457 != 0 || anInt5453 != 0 || (anInt5459 ^ 0xffffffff) != -1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.MA(" + i + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ')'));
		}
	}

	static final boolean method2302(int i, int i_107_, int i_108_, int i_109_, int i_110_, Class199 class199, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_) {
		try {
			anInt5468++;
			int i_116_ = i_115_;
			int i_117_ = i_114_;
			int i_118_ = 64;
			int i_119_ = 64;
			int i_120_ = -i_118_ + i_115_;
			Class85.anIntArrayArray1119[i_118_][i_119_] = 99;
			int i_121_ = i_114_ - i_119_;
			Class7.anIntArrayArray94[i_118_][i_119_] = 0;
			int i_122_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_122_] = i_116_;
			int i_123_ = 0;
			Class246_Sub39.anIntArray5489[i_122_++] = i_117_;
			int[][] is = ((Class199) class199).anIntArrayArray2829;
			while (i_122_ != i_123_) {
				i_117_ = Class246_Sub39.anIntArray5489[i_123_];
				i_116_ = Class246_Sub28_Sub9.anIntArray6148[i_123_];
				i_119_ = i_117_ + -i_121_;
				i_123_ = 1 + i_123_ & 0xfff;
				int i_124_ = -((Class199) class199).anInt2836 + i_116_;
				i_118_ = -i_120_ + i_116_;
				int i_125_ = i_117_ + -((Class199) class199).anInt2841;
				int i_126_ = i_108_;
				while_36_: do {
					while_35_: do {
						while_34_: do {
							while_33_: do {
								do {
									if ((i_126_ ^ 0xffffffff) != 3) {
										if ((i_126_ ^ 0xffffffff) != 2) {
											if ((i_126_ ^ 0xffffffff) != 1) {
												if ((i_126_ ^ 0xffffffff) != 0) {
													if (i_126_ == 0 || i_126_ == 1 || (i_126_ ^ 0xffffffff) == -3 || (i_126_ ^ 0xffffffff) == -4 || i_126_ == 9)
														break while_34_;
													break while_35_;
												}
											} else
												break;
											break while_33_;
										}
									} else {
										if (((i_110_ ^ 0xffffffff) == (i_116_ ^ 0xffffffff)) && ((i_111_ ^ 0xffffffff) == (i_117_ ^ 0xffffffff))) {
											Class55.anInt785 = i_117_;
											Class246_Sub28_Sub32.anInt6925 = i_116_;
											return true;
										}
										break while_36_;
									}
									if (Class260.method1746(1, i_111_, 1, i_113_, i, i_117_, i_116_, i_110_, (byte) 120)) {
										Class246_Sub28_Sub32.anInt6925 = i_116_;
										Class55.anInt785 = i_117_;
										return true;
									}
									break while_36_;
								} while (false);
								if (class199.method1317(i_110_, 0, 1, i_113_, i_116_, i_107_, i_111_, i_117_, i, 1)) {
									Class246_Sub28_Sub32.anInt6925 = i_116_;
									Class55.anInt785 = i_117_;
									return true;
								}
								break while_36_;
							} while (false);
							if (class199.method1313(i, 1, i_110_, i_107_, i_113_, i_111_, i_116_, 67, i_117_)) {
								Class55.anInt785 = i_117_;
								Class246_Sub28_Sub32.anInt6925 = i_116_;
								return true;
							}
							break while_36_;
						} while (false);
						if (class199.method1315(i_117_, i_112_, i_111_, 1, i_116_, false, i_110_, i_108_)) {
							Class246_Sub28_Sub32.anInt6925 = i_116_;
							Class55.anInt785 = i_117_;
							return true;
						}
						break while_36_;
					} while (false);
					if (class199.method1322(i_112_, i_116_, false, i_108_, i_110_, i_117_, i_111_, 1)) {
						Class55.anInt785 = i_117_;
						Class246_Sub28_Sub32.anInt6925 = i_116_;
						return true;
					}
				} while (false);
				i_126_ = Class7.anIntArrayArray94[i_118_][i_119_] + 1;
				if ((i_118_ ^ 0xffffffff) < -1 && (Class85.anIntArrayArray1119[-1 + i_118_][i_119_] ^ 0xffffffff) == -1 && (is[-1 + i_124_][i_125_] & 0x42240000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = -1 + i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = i_117_;
					Class85.anIntArrayArray1119[i_118_ - 1][i_119_] = 2;
					i_122_ = i_122_ + 1 & 0xfff;
					Class7.anIntArrayArray94[i_118_ - 1][i_119_] = i_126_;
				}
				if ((i_118_ ^ 0xffffffff) > -128 && (Class85.anIntArrayArray1119[i_118_ + 1][i_119_] ^ 0xffffffff) == -1 && ((0x60240000 & is[i_124_ + 1][i_125_] ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = i_116_ + 1;
					Class246_Sub39.anIntArray5489[i_122_] = i_117_;
					i_122_ = 0xfff & 1 + i_122_;
					Class85.anIntArrayArray1119[1 + i_118_][i_119_] = 8;
					Class7.anIntArrayArray94[1 + i_118_][i_119_] = i_126_;
				}
				if (i_119_ > 0 && Class85.anIntArrayArray1119[i_118_][-1 + i_119_] == 0 && ((is[i_124_][-1 + i_125_] & 0x40a40000 ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = -1 + i_117_;
					i_122_ = 0xfff & 1 + i_122_;
					Class85.anIntArrayArray1119[i_118_][-1 + i_119_] = 1;
					Class7.anIntArrayArray94[i_118_][i_119_ - 1] = i_126_;
				}
				if ((i_119_ ^ 0xffffffff) > -128 && Class85.anIntArrayArray1119[i_118_][i_119_ + 1] == 0 && ((is[i_124_][1 + i_125_] & 0x48240000 ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = i_117_ + 1;
					Class85.anIntArrayArray1119[i_118_][i_119_ + 1] = 4;
					i_122_ = 0xfff & 1 + i_122_;
					Class7.anIntArrayArray94[i_118_][i_119_ + 1] = i_126_;
				}
				if ((i_118_ ^ 0xffffffff) < -1 && i_119_ > 0 && (Class85.anIntArrayArray1119[-1 + i_118_][-1 + i_119_] ^ 0xffffffff) == -1 && ((is[i_124_ - 1][-1 + i_125_] & 0x43a40000 ^ 0xffffffff) == -1) && (0x42240000 & is[-1 + i_124_][i_125_]) == 0 && ((is[i_124_][i_125_ - 1] & 0x40a40000 ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = -1 + i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = -1 + i_117_;
					i_122_ = 0xfff & i_122_ + 1;
					Class85.anIntArrayArray1119[-1 + i_118_][-1 + i_119_] = 3;
					Class7.anIntArrayArray94[i_118_ - 1][-1 + i_119_] = i_126_;
				}
				if (i_118_ < 127 && i_119_ > 0 && (Class85.anIntArrayArray1119[i_118_ + 1][i_119_ - 1] ^ 0xffffffff) == -1 && (is[i_124_ + 1][i_125_ - 1] & 0x60e40000) == 0 && (0x60240000 & is[i_124_ + 1][i_125_] ^ 0xffffffff) == -1 && ((0x40a40000 & is[i_124_][-1 + i_125_] ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = 1 + i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = -1 + i_117_;
					i_122_ = 1 + i_122_ & 0xfff;
					Class85.anIntArrayArray1119[i_118_ + 1][i_119_ - 1] = 9;
					Class7.anIntArrayArray94[i_118_ + 1][i_119_ - 1] = i_126_;
				}
				if (i_118_ > 0 && (i_119_ ^ 0xffffffff) > -128 && Class85.anIntArrayArray1119[i_118_ - 1][1 + i_119_] == 0 && (is[i_124_ - 1][1 + i_125_] & 0x4e240000) == 0 && (is[i_124_ - 1][i_125_] & 0x42240000 ^ 0xffffffff) == -1 && (is[i_124_][i_125_ + 1] & 0x48240000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = -1 + i_116_;
					Class246_Sub39.anIntArray5489[i_122_] = i_117_ + 1;
					i_122_ = 0xfff & i_122_ + 1;
					Class85.anIntArrayArray1119[i_118_ - 1][i_119_ + 1] = 6;
					Class7.anIntArrayArray94[i_118_ - 1][1 + i_119_] = i_126_;
				}
				if ((i_118_ ^ 0xffffffff) > -128 && i_119_ < 127 && (Class85.anIntArrayArray1119[i_118_ + 1][1 + i_119_] ^ 0xffffffff) == -1 && (is[1 + i_124_][i_125_ + 1] & 0x78240000) == 0 && (0x60240000 & is[1 + i_124_][i_125_]) == 0 && ((is[i_124_][i_125_ + 1] & 0x48240000 ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_122_] = i_116_ + 1;
					Class246_Sub39.anIntArray5489[i_122_] = 1 + i_117_;
					Class85.anIntArrayArray1119[i_118_ + 1][i_119_ + 1] = 12;
					i_122_ = 0xfff & i_122_ + 1;
					Class7.anIntArrayArray94[1 + i_118_][1 + i_119_] = i_126_;
				}
			}
			Class246_Sub28_Sub32.anInt6925 = i_116_;
			Class55.anInt785 = i_117_;
			if (i_109_ != -1)
				method2296(-106);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.C(" + i + ',' + i_107_ + ',' + i_108_ + ',' + i_109_ + ',' + i_110_ + ',' + (class199 != null ? "{...}" : "null") + ',' + i_111_ + ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ',' + i_115_ + ')'));
		}
	}

	final void s(int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_) {
		try {
			anInt5460++;
			aClass109_Sub1_Sub1_5465.method753(90, true);
			aClass260_Sub2_5472.method1930(false);
			aClass260_Sub2_5472.method1958(-76, i_132_);
			OpenGL.glColor4ub((byte) (i_131_ >> 16), (byte) (i_131_ >> 8), (byte) i_131_, (byte) (i_131_ >> 24));
			if (!aBool5454) {
				if (aClass109_Sub1_Sub1_5458 != null) {
					method2301((byte) -97, i_130_);
					aClass109_Sub1_Sub1_5458.method753(-42, true);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
					OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2i(i, i_127_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_129_ + i_127_);
					OpenGL.glMultiTexCoord2f(33985, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), 0.0F);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
					OpenGL.glVertex2i(i_128_ + i, i_129_ + i_127_);
					OpenGL.glMultiTexCoord2f(33985, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2i(i - -i_128_, i_127_);
					OpenGL.glEnd();
					method2297((byte) 115);
				} else {
					aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
					aClass260_Sub2_5472.method1900(7681, i_130_);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2i(i, i_127_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_129_ + i_127_);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
					OpenGL.glVertex2i(i_128_ + i, i_129_ + i_127_);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2i(i - -i_128_, i_127_);
					OpenGL.glEnd();
				}
			} else {
				float f = (float) i_128_ / (float) j();
				float f_133_ = (float) i_129_ / (float) T();
				float f_134_ = f * (float) anInt5473 + (float) i;
				float f_135_ = (float) i_127_ + f_133_ * (float) anInt5457;
				float f_136_ = ((float) (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6724) * f + f_134_);
				float f_137_ = f_135_ + (float) (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).anInt6729) * f_133_;
				if (aClass109_Sub1_Sub1_5458 != null) {
					method2301((byte) -66, i_130_);
					aClass109_Sub1_Sub1_5458.method753(-4, true);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
					OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2f(f_134_, f_135_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_134_, f_137_);
					OpenGL.glMultiTexCoord2f(33985, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), 0.0F);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
					OpenGL.glVertex2f(f_136_, f_137_);
					OpenGL.glMultiTexCoord2f(33985, (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730), (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727));
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2f(f_136_, f_135_);
					OpenGL.glEnd();
					method2297((byte) 112);
				} else {
					aClass260_Sub2_5472.method1905((byte) 78, aClass109_Sub1_Sub1_5465);
					aClass260_Sub2_5472.method1900(7681, i_130_);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2f(f_134_, f_135_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_134_, f_137_);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, 0.0F);
					OpenGL.glVertex2f(f_136_, f_137_);
					OpenGL.glTexCoord2f(((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6730, ((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_5465).aFloat6727);
					OpenGL.glVertex2f(f_136_, f_135_);
					OpenGL.glEnd();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.s(" + i + ',' + i_127_ + ',' + i_128_ + ',' + i_129_ + ',' + i_130_ + ',' + i_131_ + ',' + i_132_ + ')'));
		}
	}

	Class_l_Sub2(Class260_Sub2 class260_sub2, int i, int i_138_, int i_139_, int i_140_) {
		anInt5457 = 0;
		anInt5473 = 0;
		try {
			aClass260_Sub2_5472 = class260_sub2;
			aClass109_Sub1_Sub1_5465 = Class79_Sub1.method2205(i_138_, i_140_, i, i_139_, -101, class260_sub2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_138_ + ',' + i_139_ + ',' + i_140_ + ')'));
		}
	}

	Class_l_Sub2(Class260_Sub2 class260_sub2, int i, int i_141_, int[] is, int i_142_, int i_143_) {
		anInt5457 = 0;
		anInt5473 = 0;
		try {
			aClass260_Sub2_5472 = class260_sub2;
			aClass109_Sub1_Sub1_5465 = Class218.method1414(class260_sub2, i_141_, is, false, i, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ut.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_141_ + ',' + (is != null ? "{...}" : "null") + ',' + i_142_ + ',' + i_143_ + ')'));
		}
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
