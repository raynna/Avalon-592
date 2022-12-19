
/* Class109_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

class Class109_Sub1 extends Class109 {
	static int anInt3749;
	static int anInt3750;
	static int anInt3751;
	int anInt3752;
	static int anInt3753;
	static int anInt3754;
	static int anInt3755 = 0;
	static int anInt3756;
	static int anInt3757;
	static int anInt3758;
	private int anInt3759 = -1;
	int anInt3760;
	private int anInt3761 = -1;
	static Class246_Sub39 aClass246_Sub39_3762 = null;
	static OutgoingPacket ACTION_BUTTON9 = new OutgoingPacket(66, 8);
	static int anInt3764;
	static IncomingPacket aClass13_3765 = new IncomingPacket(89, 8);

	Class109_Sub1(Class260_Sub2 class260_sub2, int i, int i_0_, int i_1_, int i_2_, boolean bool, float[] fs, int i_3_) {
		super(class260_sub2, i, i_0_, i_2_ * i_1_, bool);
		try {
			((Class109_Sub1) this).anInt3760 = i_1_;
			((Class109_Sub1) this).anInt3752 = i_2_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			do {
				if (!bool || ((Class109) this).anInt1553 == 34037) {
					OpenGL.glTexImage2Df(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, ((Class109_Sub1) this).anInt3760, ((Class109_Sub1) this).anInt3752, 0, i_3_, 5126, fs, 0);
					this.method757(false, false);
					if (!client.f_ob)
						break;
				}
				Class130_Sub6.method2107((byte) 100, i_0_, i, fs, i_3_, i_1_, i_2_);
				this.method757(false, true);
			} while (false);
			this.method753(-3, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + (fs != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	Class109_Sub1(Class260_Sub2 class260_sub2, int i, int i_4_, int i_5_, int i_6_, boolean bool, byte[] is, int i_7_, boolean bool_8_) {
		super(class260_sub2, i, i_4_, i_6_ * i_5_, bool);
		try {
			((Class109_Sub1) this).anInt3760 = i_5_;
			((Class109_Sub1) this).anInt3752 = i_6_;
			if (bool_8_) {
				byte[] is_9_ = new byte[is.length];
				for (int i_10_ = 0; (i_6_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
					int i_11_ = i_5_ * i_10_;
					int i_12_ = (-1 + (-i_10_ + i_6_)) * i_5_;
					for (int i_13_ = 0; i_5_ > i_13_; i_13_++)
						is_9_[i_11_++] = is[i_12_++];
				}
				is = is_9_;
			}
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glPixelStorei(3317, 1);
			if (!bool || (((Class109) this).anInt1553 ^ 0xffffffff) == -34038) {
				OpenGL.glTexImage2Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, ((Class109_Sub1) this).anInt3760, ((Class109_Sub1) this).anInt3752, 0, i_7_, 5121, is, 0);
				this.method757(false, false);
			} else {
				Class27.method222((byte) 117, i_5_, i_4_, i_6_, is, i_7_, i);
				this.method757(false, true);
			}
			OpenGL.glPixelStorei(3317, 4);
			this.method753(106, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_7_ + ',' + bool_8_ + ')'));
		}
	}

	Class109_Sub1(Class260_Sub2 class260_sub2, int i, int i_14_, int i_15_, int i_16_) {
		super(class260_sub2, i, i_14_, i_16_ * i_15_, false);
		try {
			((Class109_Sub1) this).anInt3752 = i_16_;
			((Class109_Sub1) this).anInt3760 = i_15_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glTexImage2Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, i_15_, i_16_, 0, Class163.method1086((((Class109) this).anInt1556), 13519), 5121, null, 0);
			this.method753(95, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final int method1761(boolean bool, int i) {
		try {
			if (bool != false)
				aClass13_3765 = null;
			anInt3757++;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "af.R(" + bool + ',' + i + ')');
		}
	}

	final void method1762(int i, int i_17_, byte[] is, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool, int i_23_) {
		try {
			anInt3753++;
			if (i_23_ < 35)
				anInt3754 = 62;
			if ((i_20_ ^ 0xffffffff) == -1)
				i_20_ = i;
			if (bool) {
				int i_24_ = Class4.method56((byte) -11, i_19_);
				int i_25_ = i_24_ * i;
				int i_26_ = i_24_ * i_20_;
				byte[] is_27_ = new byte[i_25_ * i_18_];
				for (int i_28_ = 0; (i_18_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
					int i_29_ = i_28_ * i_25_;
					int i_30_ = (-i_28_ + (i_18_ - 1)) * i_26_ + i_21_;
					for (int i_31_ = 0; i_31_ < i_25_; i_31_++)
						is_27_[i_29_++] = is[i_30_++];
				}
				is = is_27_;
			}
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glPixelStorei(3317, 1);
			if ((i_20_ ^ 0xffffffff) != (i ^ 0xffffffff))
				OpenGL.glPixelStorei(3314, i_20_);
			OpenGL.glTexSubImage2Dub(((Class109) this).anInt1553, 0, i_22_, i_17_, i, i_18_, i_19_, 5121, is, i_21_);
			if (i != i_20_)
				OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.N(" + i + ',' + i_17_ + ',' + (is != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + bool + ',' + i_23_ + ')'));
		}
	}

	public final void method8(int i) {
		try {
			anInt3751++;
			if (i > 121) {
				OpenGL.glFramebufferTexture2DEXT(anInt3759, anInt3761, ((Class109) this).anInt1553, 0, 0);
				anInt3759 = -1;
				anInt3761 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "af.P(" + i + ')');
		}
	}

	public static void method1763(int i) {
		do {
			try {
				ACTION_BUTTON9 = null;
				aClass13_3765 = null;
				aClass246_Sub39_3762 = null;
				if (i <= -71)
					break;
				method1765((byte) 65, -56, -15);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "af.O(" + i + ')');
			}
			break;
		} while (false);
	}

	Class109_Sub1(Class260_Sub2 class260_sub2, int i, int i_32_, int i_33_, int i_34_, boolean bool, int[] is, boolean bool_35_) {
		super(class260_sub2, i, i_32_, i_34_ * i_33_, bool);
		try {
			((Class109_Sub1) this).anInt3760 = i_33_;
			((Class109_Sub1) this).anInt3752 = i_34_;
			if (bool_35_) {
				int[] is_36_ = new int[is.length];
				for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff); i_37_++) {
					int i_38_ = i_33_ * i_37_;
					int i_39_ = i_33_ * (-1 + i_34_ + -i_37_);
					for (int i_40_ = 0; i_40_ < i_33_; i_40_++)
						is_36_[i_38_++] = is[i_39_++];
				}
				is = is_36_;
			}
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			if (bool && (((Class109) this).anInt1553 ^ 0xffffffff) != -34038) {
				Class21_Sub1.method1815(32993, is, ((Class109) this).anInt1556, ((Class109_Sub1) this).anInt3752, ((Class109_Sub1) this).anInt3760, ((Class260_Sub2) (((Class109) this).aClass260_Sub2_1552)).f_sg, ((Class109) this).anInt1553, 17054);
				this.method757(false, true);
			} else {
				OpenGL.glTexImage2Di(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, ((Class109_Sub1) this).anInt3760, ((Class109_Sub1) this).anInt3752, 0, 32993, (((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).f_sg), is, 0);
				this.method757(false, false);
			}
			this.method753(116, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + bool_35_ + ')'));
		}
	}

	final void method1764(int i, byte i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		do {
			try {
				anInt3756++;
				int i_47_ = (-i_45_ - i_42_ + ((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).f_tb);
				((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
				OpenGL.glCopyTexSubImage2D(((Class109) this).anInt1553, 0, i_43_, -i_44_ + -i_45_ + ((Class109_Sub1) this).anInt3752, i, i_47_, i_46_, i_45_);
				OpenGL.glFlush();
				if (i_41_ > 1)
					break;
				anInt3754 = -101;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("af.M(" + i + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1765(byte i, int i_48_, int i_49_) {
		try {
			anInt3764++;
			if (i <= 30)
				ACTION_BUTTON9 = null;
			Class138 class138 = Class_a.aClass138ArrayArray1175[i_48_][i_49_];
			if (class138 != null) {
				Class246_Sub7_Sub1.anInt6101 = ((Class138) class138).anInt1964;
				Class178.anInt2500 = ((Class138) class138).anInt1979;
				HashMap.anInt771 = ((Class138) class138).anInt1976;
			}
			Class5.method61((byte) 84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.S(" + i + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	Class109_Sub1(Class260_Sub2 class260_sub2, int i, int i_50_, int i_51_, int i_52_, int i_53_) {
		super(class260_sub2, i, 6407, i_53_ * i_52_, false);
		try {
			((Class109_Sub1) this).anInt3760 = i_52_;
			((Class109_Sub1) this).anInt3752 = i_53_;
			int i_54_ = (-i_51_ + (-i_53_ + ((Class260_Sub2) ((Class109) this).aClass260_Sub2_1552).f_tb));
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glCopyTexImage2D(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, i_50_, i_54_, i_52_, i_53_, 0);
			this.method753(91, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ')'));
		}
	}

	final void method1766(int i, int i_55_, int i_56_, int i_57_) {
		try {
			anInt3758++;
			OpenGL.glFramebufferTexture2DEXT(i_56_, i_55_, ((Class109) this).anInt1553, ((Class109) this).anInt1563, i);
			int i_58_ = -69 / ((i_57_ - 72) / 43);
			anInt3761 = i_55_;
			anInt3759 = i_56_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.T(" + i + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ')'));
		}
	}

	final void method1767(int i, boolean bool, boolean bool_59_) {
		try {
			if (((Class109) this).anInt1553 == 3553) {
				((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10242, bool ? 10497 : 33071);
				OpenGL.glTexParameteri(((Class109) this).anInt1553, 10243, bool_59_ ? 10497 : 33071);
			}
			if (i != 10497)
				method1768(true, -114, 89, 53, null, -65, (byte) -76, -38, 93);
			anInt3749++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("af.U(" + i + ',' + bool + ',' + bool_59_ + ')'));
		}
	}

	final void method1768(boolean bool, int i, int i_60_, int i_61_, int[] is, int i_62_, byte i_63_, int i_64_, int i_65_) {
		do {
			try {
				if ((i_60_ ^ 0xffffffff) == -1)
					i_60_ = i_65_;
				anInt3750++;
				if (bool) {
					int[] is_66_ = new int[i * i_65_];
					for (int i_67_ = 0; i > i_67_; i_67_++) {
						int i_68_ = i_67_ * i_65_;
						int i_69_ = i_60_ * (i + (-i_67_ - 1)) - -i_62_;
						for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > (i_65_ ^ 0xffffffff); i_70_++)
							is_66_[i_68_++] = is[i_69_++];
					}
					is = is_66_;
				}
				((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
				if ((i_65_ ^ 0xffffffff) != (i_60_ ^ 0xffffffff))
					OpenGL.glPixelStorei(3314, i_60_);
				if (i_63_ >= -29)
					method8(-124);
				OpenGL.glTexSubImage2Di(((Class109) this).anInt1553, 0, i_64_, i_61_, i_65_, i, 32993, ((Class260_Sub2) (((Class109) this).aClass260_Sub2_1552)).f_sg, is, i_62_);
				if ((i_65_ ^ 0xffffffff) == (i_60_ ^ 0xffffffff))
					break;
				OpenGL.glPixelStorei(3314, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("af.Q(" + bool + ',' + i + ',' + i_60_ + ',' + i_61_ + ',' + (is != null ? "{...}" : "null") + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ')'));
			}
			break;
		} while (false);
	}
}
