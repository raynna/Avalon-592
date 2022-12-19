
/* Class40_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub7 extends Class40 {
	static int anInt5168;
	static int anInt5169;
	static int anInt5170 = -1;
	static int anInt5171;
	static int anInt5172;
	private boolean aBool5173 = false;
	static int anInt5174;
	static String aString5175;
	static int anInt5176;
	private Class34 aClass34_5177;
	static int anInt5178;
	static Class_l[] aClass_lArray5179;
	static int anInt5180;
	static int anInt5181;

	static final void method2207(byte i) {
		do {
			try {
				anInt5181++;
				Class78.packetStream.method2477(-934);
				int i_0_ = Class78.packetStream.readBits(-112, 8);
				if (i_0_ < Class5.anInt55) {
					for (int i_1_ = i_0_; (i_1_ ^ 0xffffffff) > (Class5.anInt55 ^ 0xffffffff); i_1_++)
						Class246_Sub28_Sub1.anIntArray5791[Class48.anInt695++] = Class246_Sub28_Sub29.anIntArray6815[i_1_];
				}
				if (i_0_ > Class5.anInt55)
					throw new RuntimeException("gnpov1");
				Class5.anInt55 = 0;
				for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
					int i_3_ = Class246_Sub28_Sub29.anIntArray6815[i_2_];
					Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_3_];
					int i_4_ = Class78.packetStream.readBits(-54, 1);
					if ((i_4_ ^ 0xffffffff) == -1) {
						Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_3_;
						((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
					} else {
						int i_5_ = Class78.packetStream.readBits(i - 18, 2);
						if (i_5_ == 0) {
							Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_3_;
							((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
							Class251.anIntArray3552[Class59_Sub5_Sub1.anInt5826++] = i_3_;
						} else if (i_5_ == 1) {
							Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_3_;
							((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
							int i_6_ = Class78.packetStream.readBits(i - 6, 3);
							class_r_sub2.method2931(-126, i_6_, 1);
							int i_7_ = Class78.packetStream.readBits(-59, 1);
							if ((i_7_ ^ 0xffffffff) == -2)
								Class251.anIntArray3552[Class59_Sub5_Sub1.anInt5826++] = i_3_;
						} else if ((i_5_ ^ 0xffffffff) == -3) {
							Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_3_;
							((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
							if ((Class78.packetStream.readBits(i - 63, 1) ^ 0xffffffff) == -2) {
								int i_8_ = Class78.packetStream.readBits(-88, 3);
								class_r_sub2.method2931(60, i_8_, 2);
								int i_9_ = Class78.packetStream.readBits(-99, 3);
								class_r_sub2.method2931(-128, i_9_, 2);
							} else {
								int i_10_ = Class78.packetStream.readBits(-53, 3);
								class_r_sub2.method2931(42, i_10_, 0);
							}
							int i_11_ = Class78.packetStream.readBits(i ^ 0x74, 1);
							if (i_11_ == 1)
								Class251.anIntArray3552[Class59_Sub5_Sub1.anInt5826++] = i_3_;
						} else if ((i_5_ ^ 0xffffffff) == -4)
							Class246_Sub28_Sub1.anIntArray5791[Class48.anInt695++] = i_3_;
					}
				}
				if (i == -53)
					break;
				aString5175 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "qr.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class40_Sub7(Class260_Sub2 class260_sub2) {
		super(class260_sub2);
		do {
			try {
				if (!((Class260_Sub2) class260_sub2).aBool4340)
					break;
				aClass34_5177 = new Class34(class260_sub2, 2);
				aClass34_5177.method247(0, true);
				((Class40) this).aClass260_Sub2_613.method1936(1, -120);
				((Class40) this).aClass260_Sub2_613.method1912(34165, 7681, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 2, 770, 34168);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34167, 0);
				OpenGL.glTexGeni(8192, 9472, 34066);
				OpenGL.glTexGeni(8193, 9472, 34066);
				OpenGL.glTexGeni(8194, 9472, 34066);
				OpenGL.glEnable(3168);
				OpenGL.glEnable(3169);
				OpenGL.glEnable(3170);
				((Class40) this).aClass260_Sub2_613.method1936(0, -128);
				aClass34_5177.method248((byte) 39);
				aClass34_5177.method247(1, true);
				((Class40) this).aClass260_Sub2_613.method1936(1, -119);
				((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
				((Class40) this).aClass260_Sub2_613.method1945((byte) 79, 2, 770, 34166);
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
				OpenGL.glDisable(3168);
				OpenGL.glDisable(3169);
				OpenGL.glDisable(3170);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5888);
				((Class40) this).aClass260_Sub2_613.method1936(0, -121);
				aClass34_5177.method248((byte) 39);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "qr.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public static void method2208(int i) {
		try {
			if (i != 0)
				method2207((byte) 39);
			aClass_lArray5179 = null;
			aString5175 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qr.E(" + i + ')');
		}
	}

	final void method278(int i, boolean bool) {
		try {
			anInt5176++;
			if (i != 0)
				method2207((byte) -85);
			Class109_Sub4 class109_sub4 = ((Class40) this).aClass260_Sub2_613.method1946((byte) 9);
			if (aClass34_5177 != null && class109_sub4 != null && bool) {
				aClass34_5177.method246('\0', -1);
				((Class40) this).aClass260_Sub2_613.method1936(1, -119);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109_sub4);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadMatrixf(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_bg.method2273(123), 0);
				OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
				OpenGL.glMatrixMode(5888);
				((Class40) this).aClass260_Sub2_613.method1936(0, i ^ ~0x7f);
				aBool5173 = true;
			} else
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34168, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qr.D(" + i + ',' + bool + ')');
		}
	}

	final void method277(int i, int i_12_, int i_13_) {
		try {
			if (i_12_ < 76)
				aClass34_5177 = null;
			anInt5169++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qr.H(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	final void method284(boolean bool, byte i) {
		do {
			try {
				anInt5180++;
				((Class40) this).aClass260_Sub2_613.method1912(8448, 7681, true);
				if (i > 115)
					break;
				aClass34_5177 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "qr.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		try {
			do {
				if (aBool5173) {
					aClass34_5177.method246('\001', -1);
					((Class40) this).aClass260_Sub2_613.method1936(1, i ^ ~0x76);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
					((Class40) this).aClass260_Sub2_613.method1936(0, -120);
					if (!client.f_ob)
						break;
				}
				((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
			} while (false);
			anInt5168++;
			((Class40) this).aClass260_Sub2_613.method1912(8448, 8448, true);
			if (i != 0)
				aBool5173 = false;
			aBool5173 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qr.I(" + i + ')');
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			anInt5171++;
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
			if (bool != true)
				aClass_lArray5179 = null;
			((Class40) this).aClass260_Sub2_613.method1900(7681, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qr.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				method282(true);
			anInt5172++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qr.G(" + bool + ')');
		}
	}
}
