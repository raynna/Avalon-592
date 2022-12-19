
/* Class109_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class109_Sub3 extends Class109 {
	static int anInt3946;
	int anInt3947;
	static int anInt3948;
	int anInt3949;
	static int anInt3950;
	private int anInt3951 = -1;
	private int anInt3952 = -1;
	static IncomingPacket aClass13_3953 = new IncomingPacket(30, 3);
	static int anInt3954;
	static int anInt3955;
	int anInt3956;
	static Class127 aClass127_3957 = new Class127(128);

	Class109_Sub3(Class260_Sub2 class260_sub2, int i, int i_0_, int i_1_, int i_2_, byte[] is, int i_3_) {
		super(class260_sub2, 32879, i, i_0_ * (i_1_ * i_2_), false);
		try {
			((Class109_Sub3) this).anInt3956 = i_1_;
			((Class109_Sub3) this).anInt3949 = i_2_;
			((Class109_Sub3) this).anInt3947 = i_0_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage3Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, ((Class109_Sub3) this).anInt3947, ((Class109_Sub3) this).anInt3956, ((Class109_Sub3) this).anInt3949, 0, i_3_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method753(85, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method1823(int i) {
		do {
			try {
				anInt3950++;
				Class93.aClass54_1229.method369(false);
				if (i == 1)
					break;
				method1823(-101);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cf.O(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method8(int i) {
		try {
			if (i >= 121) {
				OpenGL.glFramebufferTexture3DEXT(anInt3951, anInt3952, ((Class109) this).anInt1553, 0, 0, 0);
				anInt3946++;
				anInt3952 = -1;
				anInt3951 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cf.P(" + i + ')');
		}
	}

	static final void method1824(int i, int i_4_, Class235[] class235s) {
		try {
			if (i_4_ < 35)
				aClass13_3953 = null;
			for (int i_5_ = 0; (class235s.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				Class235 class235 = class235s[i_5_];
				if (class235 != null) {
					if ((((Class235) class235).f_vc ^ 0xffffffff) == -1) {
						if (((Class235) class235).f_ad != null)
							method1824(i, 122, ((Class235) class235).f_ad);
						Class246_Sub40 class246_sub40 = ((Class246_Sub40) (Class246_Sub34.aClass85_5143.method544((long) ((Class235) class235).anInt3248, 126)));
						if (class246_sub40 != null)
							IntegerNode.method2180((((Class246_Sub40) class246_sub40).anInt5517), -1, i);
					}
					if (i == 0 && ((Class235) class235).f_kc != null) {
						Class246_Sub29 class246_sub29 = new Class246_Sub29();
						((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_kc;
						((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
						Class146.method988(class246_sub29);
					}
					if ((i ^ 0xffffffff) == -2 && ((Class235) class235).anObjectArray3216 != null) {
						if (((Class235) class235).f_pd >= 0) {
							Class235 class235_6_ = Class220.method1423(0, (((Class235) class235).anInt3248));
							if (class235_6_ == null || ((Class235) class235_6_).f_ad == null || (((Class235) class235).f_pd >= ((Class235) class235_6_).f_ad.length) || (((Class235) class235_6_).f_ad[((Class235) class235).f_pd]) != class235)
								continue;
						}
						Class246_Sub29 class246_sub29 = new Class246_Sub29();
						((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
						((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3216;
						Class146.method988(class246_sub29);
					}
				}
			}
			anInt3954++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.N(" + i + ',' + i_4_ + ',' + (class235s != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1825(int i, int i_7_, int i_8_) {
		try {
			if (i <= 98)
				method1826((byte) 51);
			i_8_ = i_8_ * (0x7f & i_7_) >> 7;
			anInt3948++;
			do {
				if (i_8_ >= 2) {
					if (i_8_ <= 126)
						break;
					i_8_ = 126;
					if (!client.f_ob)
						break;
				}
				i_8_ = 2;
			} while (false);
			return i_8_ + (i_7_ & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.L(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method1826(byte i) {
		try {
			aClass13_3953 = null;
			if (i != 76)
				aClass13_3953 = null;
			aClass127_3957 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cf.M(" + i + ')');
		}
	}

	final void method1827(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_, int i_14_, int i_15_) {
		try {
			anInt3955++;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			if (i_13_ != -9)
				method1827(64, 57, 63, 83, -112, (byte) 35, -38, 114);
			OpenGL.glCopyTexSubImage3D(((Class109) this).anInt1553, 0, i_9_, i, i_12_, i_15_, i_10_, i_11_, i_14_);
			OpenGL.glFlush();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.Q(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	Class109_Sub3(Class260_Sub2 class260_sub2, int i, int i_16_, int i_17_, int i_18_) {
		super(class260_sub2, 32879, i, i_18_ * (i_16_ * i_17_), false);
		try {
			((Class109_Sub3) this).anInt3949 = i_18_;
			((Class109_Sub3) this).anInt3947 = i_16_;
			((Class109_Sub3) this).anInt3956 = i_17_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glTexImage3Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, ((Class109_Sub3) this).anInt3947, ((Class109_Sub3) this).anInt3956, ((Class109_Sub3) this).anInt3949, 0, Class163.method1086((((Class109) this).anInt1556), 13519), 5121, null, 0);
			this.method753(99, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cf.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}
}
