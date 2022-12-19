
/* Class246_Sub1_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class246_Sub1_Sub12 extends Class246_Sub1 implements Interface8 {
	private int anInt6248;
	private int anInt6249;
	static int anInt6250;
	static int anInt6251;
	private Class260_Sub2 aClass260_Sub2_6252;
	int anInt6253;
	int anInt6254;
	static int anInt6255;
	private int anInt6256;
	private int anInt6257 = -1;
	static int anInt6258;
	static int anInt6259;
	static int anInt6260;
	private int anInt6261 = -1;

	protected final void finalize() throws Throwable {
		try {
			anInt6260++;
			method2619(-25097);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "io.finalize(" + ')');
		}
	}

	final void method2617(boolean bool, int i, int i_0_) {
		do {
			try {
				OpenGL.glFramebufferRenderbufferEXT(i_0_, i, 36161, anInt6248);
				anInt6250++;
				anInt6257 = i_0_;
				anInt6261 = i;
				if (bool == true)
					break;
				method2619(112);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("io.A(" + bool + ',' + i + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method8(int i) {
		try {
			OpenGL.glFramebufferRenderbufferEXT(anInt6257, anInt6261, 36161, 0);
			if (i < 121)
				((Class246_Sub1_Sub12) this).anInt6254 = 104;
			anInt6258++;
			anInt6261 = -1;
			anInt6257 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "io.P(" + i + ')');
		}
	}

	static final boolean method2618(int i, int i_1_, int i_2_) {
		try {
			anInt6259++;
			if (!Class246_Sub28_Sub21.aBool6580)
				return false;
			int i_3_ = i >> 16;
			int i_4_ = i & 0xffff;
			if (Class246_Sub32.aClass235ArrayArray5049[i_3_] == null || Class246_Sub32.aClass235ArrayArray5049[i_3_][i_4_] == null)
				return false;
			Class235 class235 = Class246_Sub32.aClass235ArrayArray5049[i_3_][i_4_];
			if (i_2_ != -1 || ((Class235) class235).f_vc != 0) {
				for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(102)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
					if (((i_2_ ^ 0xffffffff) == (((Class246_Sub35) class246_sub35).anInt5151 ^ 0xffffffff)) && (((Class246_Sub35) class246_sub35).anInt5154 == ((Class235) class235).anInt3248) && (((Class246_Sub35) class246_sub35).anInt5156 == 47 || (((Class246_Sub35) class246_sub35).anInt5156 == 1002) || (((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -10 || (((Class246_Sub35) class246_sub35).anInt5156 == 48) || (((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -61))
						return true;
				}
			} else {
				for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(115)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
					if ((((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -48 || (((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -1003 || ((Class246_Sub35) class246_sub35).anInt5156 == 9 || (((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -49 || (((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) == -61) {
						for (Class235 class235_5_ = Class220.method1423(0, (((Class246_Sub35) class246_sub35).anInt5154)); class235_5_ != null; class235_5_ = Class5.method59(class235_5_, (byte) 83)) {
							if (((Class235) class235_5_).anInt3248 == ((Class235) class235).anInt3248)
								return true;
						}
					}
				}
			}
			if (i_1_ >= -51)
				method2618(-94, -88, -22);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("io.C(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2619(int i) {
		do {
			try {
				if (i == -25097) {
					anInt6251++;
					if ((anInt6248 ^ 0xffffffff) >= -1)
						break;
					aClass260_Sub2_6252.method1910(-89, anInt6249, anInt6248);
					anInt6248 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "io.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2620(int i, int i_6_, int i_7_, int i_8_, Class185 class185) {
		try {
			if (i_7_ == 36161) {
				anInt6255++;
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195.method1104(73)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195.method1108((byte) -112))) {
					if ((((Class246_Sub5) class246_sub5).anInt3886 ^ 0xffffffff) == (i_8_ ^ 0xffffffff) && (((Class246_Sub5) class246_sub5).anInt3879 == i_6_ << 7) && (((Class246_Sub5) class246_sub5).anInt3876 ^ 0xffffffff) == (i << 7 ^ 0xffffffff) && ((((Class185) (((Class246_Sub5) class246_sub5).aClass185_3871)).anInt2607 ^ 0xffffffff) == (((Class185) class185).anInt2607 ^ 0xffffffff))) {
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
						}
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874 = null;
						}
						class246_sub5.unlink((byte) -121);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("io.D(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (class185 != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub1_Sub12(Class260_Sub2 class260_sub2, int i, int i_9_, int i_10_) {
		try {
			anInt6256 = i;
			((Class246_Sub1_Sub12) this).anInt6254 = i_9_;
			((Class246_Sub1_Sub12) this).anInt6253 = i_10_;
			aClass260_Sub2_6252 = class260_sub2;
			OpenGL.glGenRenderbuffersEXT(1, Class143.anIntArray2065, 0);
			anInt6248 = Class143.anIntArray2065[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt6248);
			OpenGL.glRenderbufferStorageEXT(36161, anInt6256, (((Class246_Sub1_Sub12) this).anInt6254), (((Class246_Sub1_Sub12) this).anInt6253));
			anInt6249 = (((Class246_Sub1_Sub12) this).anInt6253 * (((Class246_Sub1_Sub12) this).anInt6254 * aClass260_Sub2_6252.method1920(anInt6256, 2)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("io.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	Class246_Sub1_Sub12(Class260_Sub2 class260_sub2, int i, int i_11_, int i_12_, int i_13_) {
		try {
			anInt6256 = i;
			aClass260_Sub2_6252 = class260_sub2;
			((Class246_Sub1_Sub12) this).anInt6253 = i_12_;
			((Class246_Sub1_Sub12) this).anInt6254 = i_11_;
			OpenGL.glGenRenderbuffersEXT(1, Class143.anIntArray2065, 0);
			anInt6248 = Class143.anIntArray2065[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt6248);
			OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_13_, anInt6256, ((Class246_Sub1_Sub12) this).anInt6254, ((Class246_Sub1_Sub12) this).anInt6253);
			anInt6249 = (((Class246_Sub1_Sub12) this).anInt6253 * ((Class246_Sub1_Sub12) this).anInt6254 * aClass260_Sub2_6252.method1920(anInt6256, 2));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("io.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}
}
