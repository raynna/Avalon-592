
/* Class40_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub5 extends Class40 {
	static int anInt4907;
	private Class34 aClass34_4908;
	static int anInt4909;
	static int anInt4910;
	static int anInt4911;
	static int anInt4912;
	static int anInt4913 = 0;
	static int anInt4914;
	static int anInt4915;
	static int anInt4916;
	private Class_m aClass_m4917;
	static int anInt4918;

	static final void method2127(int i) {
		do {
			try {
				anInt4914++;
				try {
					if ((Class12.anInt182 ^ 0xffffffff) == -2) {
						int i_0_ = Class32.aClass246_Sub37_Sub1_433.method2512(0);
						if ((i_0_ ^ 0xffffffff) < -1 && Class32.aClass246_Sub37_Sub1_433.method2509((byte) -125)) {
							i_0_ -= Class22.anInt327;
							if (i_0_ < 0)
								i_0_ = 0;
							Class32.aClass246_Sub37_Sub1_433.method2503(true, i_0_);
							break;
						}
						Class32.aClass246_Sub37_Sub1_433.method2515(2);
						Class32.aClass246_Sub37_Sub1_433.method2516((byte) -113);
						Class40_Sub9.aClass155_5506 = null;
						do {
							if (Class_m.aClass_fs1545 != null) {
								Class12.anInt182 = 2;
								if (!client.f_ob)
									break;
							}
							Class12.anInt182 = 0;
						} while (false);
						Class76.aClass246_Sub24_999 = null;
					}
					if (i < -43)
						break;
					method2128(-66, 98);
				} catch (Exception exception) {
					exception.printStackTrace();
					Class32.aClass246_Sub37_Sub1_433.method2515(2);
					Class_m.aClass_fs1545 = null;
					Class12.anInt182 = 0;
					Class40_Sub9.aClass155_5506 = null;
					Class76.aClass246_Sub24_999 = null;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "nu.E(" + i + ')');
			}
		} while (false);
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			anInt4915++;
			if (bool != true)
				aClass34_4908 = null;
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
			((Class40) this).aClass260_Sub2_613.method1900(7681, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nu.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method280(int i) {
		try {
			aClass34_4908.method246('\001', -1);
			anInt4916++;
			((Class40) this).aClass260_Sub2_613.method1936(1, -119);
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
			((Class40) this).aClass260_Sub2_613.method1936(i, -120);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nu.I(" + i + ')');
		}
	}

	final void method277(int i, int i_1_, int i_2_) {
		do {
			try {
				anInt4909++;
				float f = (float) (1 + (i & 0x3)) * -5.0E-4F;
				float f_3_ = (float) ((0x3 & i >> 3) + 1) * 5.0E-4F;
				float f_4_ = ((i & 0x40 ^ 0xffffffff) == -1 ? 4.8828125E-4F : 9.765625E-4F);
				((Class40) this).aClass260_Sub2_613.method1936(1, -125);
				boolean bool = (0x80 & i) != 0;
				if (!bool) {
					Class246_Sub28_Sub13.aFloatArray6294[2] = f_4_;
					Class246_Sub28_Sub13.aFloatArray6294[0] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[1] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[3] = 0.0F;
				} else {
					Class246_Sub28_Sub13.aFloatArray6294[3] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[2] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[1] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[0] = f_4_;
				}
				OpenGL.glTexGenfv(8192, 9474, Class246_Sub28_Sub13.aFloatArray6294, 0);
				Class246_Sub28_Sub13.aFloatArray6294[3] = f * (float) (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe) % 1.0F;
				Class246_Sub28_Sub13.aFloatArray6294[0] = 0.0F;
				Class246_Sub28_Sub13.aFloatArray6294[1] = f_4_;
				Class246_Sub28_Sub13.aFloatArray6294[2] = 0.0F;
				OpenGL.glTexGenfv(8193, 9474, Class246_Sub28_Sub13.aFloatArray6294, 0);
				if (((Class_m) aClass_m4917).aBool1538) {
					Class246_Sub28_Sub13.aFloatArray6294[3] = ((float) ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe * f_3_ % 1.0F);
					Class246_Sub28_Sub13.aFloatArray6294[1] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[2] = 0.0F;
					Class246_Sub28_Sub13.aFloatArray6294[0] = 0.0F;
					OpenGL.glTexGenfv(8194, 9473, Class246_Sub28_Sub13.aFloatArray6294, 0);
				} else {
					int i_5_ = (int) (16.0F * ((float) ((Class260_Sub2) (((Class40) this).aClass260_Sub2_613)).f_qe * f_3_));
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, (((Class_m) aClass_m4917).aClass109_Sub1Array1540[i_5_ % 16]));
				}
				((Class40) this).aClass260_Sub2_613.method1936(0, -128);
				if (i_1_ >= 76)
					break;
				method2128(-89, 5);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nu.H(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void method284(boolean bool, byte i) {
		try {
			if (i <= 115)
				anInt4918 = 122;
			anInt4911++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nu.A(" + bool + ',' + i + ')');
		}
	}

	final boolean method282(boolean bool) {
		try {
			anInt4907++;
			if (bool != true)
				aClass34_4908 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nu.G(" + bool + ')');
		}
	}

	final void method278(int i, boolean bool) {
		do {
			try {
				anInt4912++;
				if (i == 0) {
					aClass34_4908.method246('\0', -1);
					if (!((Class_m) aClass_m4917).aBool1538)
						break;
					((Class40) this).aClass260_Sub2_613.method1936(1, -125);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4917).aClass109_Sub3_1537);
					((Class40) this).aClass260_Sub2_613.method1936(0, -120);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "nu.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final Class104 method2128(int i, int i_6_) {
		try {
			anInt4910++;
			Class104 class104 = (Class104) Class40_Sub8.aClass54_5195.method379((long) i_6_, (byte) 58);
			if (class104 != null)
				return class104;
			byte[] is = Class78.aClass_fs1019.method91(i_6_, 0, 106);
			if (i <= 42)
				anInt4913 = 50;
			class104 = new Class104();
			if (is != null)
				class104.method666(new BufferStream(is), 28201);
			class104.method667(-116);
			Class40_Sub8.aClass54_5195.method371(1, (long) i_6_, class104);
			return class104;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nu.C(" + i + ',' + i_6_ + ')');
		}
	}

	Class40_Sub5(Class260_Sub2 class260_sub2, Class_m class_m) {
		super(class260_sub2);
		try {
			aClass_m4917 = class_m;
			aClass34_4908 = new Class34(class260_sub2, 2);
			aClass34_4908.method247(0, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -119);
			if (((Class_m) aClass_m4917).aBool1538) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glEnable(3170);
			}
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glTexGeni(8193, 9472, 9216);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			((Class40) this).aClass260_Sub2_613.method1936(0, -118);
			aClass34_4908.method248((byte) 39);
			aClass34_4908.method247(1, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -121);
			if (((Class_m) aClass_m4917).aBool1538)
				OpenGL.glDisable(3170);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			((Class40) this).aClass260_Sub2_613.method1936(0, -128);
			aClass34_4908.method248((byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nu.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class_m != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,", "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.", "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		new Class67("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!", "Vous avez d\u00e9j\u00e0 signal\u00e9 un abus il y a moins d'une minute ! N'abusez pas du syst\u00e8me !", "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
	}
}
