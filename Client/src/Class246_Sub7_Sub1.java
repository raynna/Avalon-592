
/* Class246_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class246_Sub7_Sub1 extends Class246_Sub7 {
	static int anInt6078;
	private int anInt6079;
	static Class198 aClass198_6080;
	static int[][] anIntArrayArray6081 = { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
	private Class196 aClass196_6082;
	static int anInt6083;
	static int anInt6084;
	static int anInt6085;
	static int anInt6086;
	private Class109_Sub1[] aClass109_Sub1Array6087;
	private int anInt6088;
	static int anInt6089;
	private Class196 aClass196_6090;
	private Class109_Sub1 aClass109_Sub1_6091;
	private Class109_Sub1 aClass109_Sub1_6092;
	private int anInt6093;
	static short[][] aShortArrayArray6094 = { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	static int anInt6095;
	private int anInt6096;
	static int anInt6097;
	private Class196 aClass196_6098;
	private Class196 aClass196_6099;
	static int anInt6100;
	static int anInt6101 = -50;
	private Class134 aClass134_6102;
	private Class134 aClass134_6103;

	final void method1833(int i, byte i_0_, Class109_Sub1 class109_sub1, Class109_Sub1 class109_sub1_1_) {
		try {
			anInt6089++;
			OpenGL.glPushAttrib(2048);
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			if (aClass109_Sub1Array6087 != null) {
				((Class246_Sub7) this).aClass260_Sub2_3967.method1922(aClass134_6102, (byte) -101);
				int i_2_ = Class85.method540(anInt6079, false);
				int i_3_ = Class85.method540(anInt6088, false);
				int i_4_ = 0;
				while (i_2_ > 256 || (i_3_ ^ 0xffffffff) < -257) {
					OpenGL.glViewport(0, 0, i_2_, i_3_);
					aClass134_6102.method913((byte) 76, aClass109_Sub1Array6087[i_4_], 0);
					if ((i_4_ ^ 0xffffffff) != -1) {
						((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, aClass109_Sub1Array6087[i_4_ - 1]);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(1.0F, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f(1.0F, 1.0F);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, 1.0F);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					} else {
						((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, class109_sub1);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f((float) anInt6079, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f((float) anInt6079, (float) anInt6088);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, (float) anInt6088);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					}
					if (i_2_ > 256)
						i_2_ >>= 1;
					if (i_3_ > 256)
						i_3_ >>= 1;
					i_4_++;
				}
				((Class246_Sub7) this).aClass260_Sub2_3967.method1971(aClass134_6102, -3);
				((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, aClass109_Sub1Array6087[i_4_ - 1]);
				((Class246_Sub7) this).aClass260_Sub2_3967.method1922(aClass134_6103, (byte) -101);
				aClass134_6103.method902(82, 0);
				OpenGL.glViewport(0, 0, 256, 256);
				long l = ((Class196) aClass196_6099).aLong2755;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"), Class246_Sub1_Sub2.aFloat5694, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			} else {
				((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, class109_sub1);
				((Class246_Sub7) this).aClass260_Sub2_3967.method1922(aClass134_6103, (byte) -101);
				aClass134_6103.method902(82, 0);
				OpenGL.glViewport(0, 0, 256, 256);
				long l = ((Class196) aClass196_6098).aLong2755;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "params"), Class246_Sub1_Sub2.aFloat5694, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f((float) anInt6079, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f((float) anInt6079, (float) anInt6088);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, (float) anInt6088);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			}
			int i_5_ = 121 / ((-74 - i_0_) / 47);
			aClass134_6103.method902(82, 1);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, aClass109_Sub1_6092);
			long l = ((Class196) aClass196_6082).aLong2755;
			OpenGL.glUseProgramObjectARB(l);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.00390625F, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
			aClass134_6103.method902(82, 0);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, aClass109_Sub1_6091);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"), 0.0F, 0.00390625F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1971(aClass134_6103, 46);
			long l_6_ = ((Class196) aClass196_6090).aLong2755;
			OpenGL.glUseProgramObjectARB(l_6_);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_6_, "sceneTex"), 0);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_6_, "bloomTex"), 1);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l_6_, "params"), Class239.aFloat3376, Class85.aFloat1135, 0.0F);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1936(1, -118);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, aClass109_Sub1_6092);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1936(0, -121);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, class109_sub1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fh.F(" + i + ',' + i_0_ + ',' + (class109_sub1 != null ? "{...}" : "null") + ',' + (class109_sub1_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2563(boolean bool) {
		try {
			if (bool != true)
				method1833(14, (byte) 60, null, null);
			anInt6084++;
			if (!(((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4322) || !((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4391 || !((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4333)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.B(" + bool + ')');
		}
	}

	final void method1829(int i, int i_7_) {
		try {
			anInt6100++;
			OpenGL.glUseProgramObjectARB(0L);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1936(1, -122);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1905((byte) 78, null);
			((Class246_Sub7) this).aClass260_Sub2_3967.method1936(i, -128);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.E(" + i + ',' + i_7_ + ')');
		}
	}

	final boolean method1838(byte i) {
		try {
			anInt6085++;
			if (i <= 121)
				method1832(false);
			if ((((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4322) && ((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4391 && ((Class260_Sub2) ((Class246_Sub7) this).aClass260_Sub2_3967).aBool4333) {
				aClass134_6103 = new Class134(((Class246_Sub7) this).aClass260_Sub2_3967);
				aClass109_Sub1_6092 = new Class109_Sub1((((Class246_Sub7) this).aClass260_Sub2_3967), 3553, 34842, 256, 256);
				aClass109_Sub1_6092.method1767(10497, false, false);
				aClass109_Sub1_6091 = new Class109_Sub1((((Class246_Sub7) this).aClass260_Sub2_3967), 3553, 34842, 256, 256);
				aClass109_Sub1_6091.method1767(10497, false, false);
				((Class246_Sub7) this).aClass260_Sub2_3967.method1922(aClass134_6103, (byte) -101);
				aClass134_6103.method913((byte) 76, aClass109_Sub1_6092, 0);
				aClass134_6103.method913((byte) 76, aClass109_Sub1_6091, 1);
				aClass134_6103.method902(82, 0);
				if (!aClass134_6103.method908(-36054)) {
					((Class246_Sub7) this).aClass260_Sub2_3967.method1971(aClass134_6103, 123);
					return false;
				}
				((Class246_Sub7) this).aClass260_Sub2_3967.method1971(aClass134_6103, -126);
				aClass196_6098 = (Class138.method935((new Class256[] { Class246_Sub34.method2201((byte) 121, ((Class246_Sub7) this).aClass260_Sub2_3967, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }), ((Class246_Sub7) this).aClass260_Sub2_3967, -1));
				aClass196_6099 = (Class138.method935((new Class256[] { Class246_Sub34.method2201((byte) 121, ((Class246_Sub7) this).aClass260_Sub2_3967, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }), ((Class246_Sub7) this).aClass260_Sub2_3967, -1));
				aClass196_6090 = (Class138.method935((new Class256[] { Class246_Sub34.method2201((byte) 121, ((Class246_Sub7) this).aClass260_Sub2_3967, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }), ((Class246_Sub7) this).aClass260_Sub2_3967, -1));
				aClass196_6082 = (Class138.method935((new Class256[] { Class246_Sub34.method2201((byte) 121, ((Class246_Sub7) this).aClass260_Sub2_3967, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }), ((Class246_Sub7) this).aClass260_Sub2_3967, -1));
				if (aClass196_6099 == null || aClass196_6098 == null || aClass196_6090 == null || aClass196_6082 == null)
					return false;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.G(" + i + ')');
		}
	}

	Class246_Sub7_Sub1(Class260_Sub2 class260_sub2) {
		super(class260_sub2);
	}

	final boolean method1837(byte i) {
		try {
			anInt6083++;
			if (i != 109)
				anInt6079 = -96;
			if (aClass134_6103 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.A(" + i + ')');
		}
	}

	final int method1832(boolean bool) {
		try {
			if (bool != true)
				anInt6088 = -37;
			anInt6078++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.H(" + bool + ')');
		}
	}

	final void method1840(int i, int i_8_, int i_9_) {
		try {
			anInt6079 = i_9_;
			anInt6095++;
			anInt6088 = i_8_;
			if (i == 8574) {
				int i_10_ = Class85.method540(anInt6079, false);
				int i_11_ = Class85.method540(anInt6088, false);
				if (i_10_ != anInt6093 || (anInt6096 ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
					if (aClass109_Sub1Array6087 != null) {
						for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (aClass109_Sub1Array6087.length ^ 0xffffffff)); i_12_++)
							aClass109_Sub1Array6087[i_12_].method755(i ^ 0x216c);
						aClass109_Sub1Array6087 = null;
					}
					if (i_10_ <= 256 && (i_11_ ^ 0xffffffff) >= -257)
						aClass134_6102 = null;
					else {
						int i_13_ = i_10_;
						int i_14_ = i_11_;
						int i_15_ = 0;
						if (aClass134_6102 == null)
							aClass134_6102 = new Class134(((Class246_Sub7) this).aClass260_Sub2_3967);
						while ((i_13_ ^ 0xffffffff) < -257 || i_14_ > 256) {
							if (i_14_ > 256)
								i_14_ >>= 1;
							if ((i_13_ ^ 0xffffffff) < -257)
								i_13_ >>= 1;
							i_15_++;
						}
						i_13_ = i_10_;
						aClass109_Sub1Array6087 = new Class109_Sub1[i_15_];
						i_14_ = i_11_;
						i_15_ = 0;
						while (i_13_ > 256 || (i_14_ ^ 0xffffffff) < -257) {
							aClass109_Sub1Array6087[i_15_++] = new Class109_Sub1((((Class246_Sub7) this).aClass260_Sub2_3967), 3553, 34842, i_13_, i_14_);
							if ((i_14_ ^ 0xffffffff) < -257)
								i_14_ >>= 1;
							if ((i_13_ ^ 0xffffffff) < -257)
								i_13_ >>= 1;
						}
					}
					anInt6093 = i_10_;
					anInt6096 = i_11_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fh.J(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method1839(byte i) {
		try {
			aClass196_6098 = null;
			aClass109_Sub1_6092 = null;
			anInt6097++;
			aClass109_Sub1Array6087 = null;
			if (i == -71) {
				aClass134_6103 = null;
				aClass134_6102 = null;
				aClass196_6082 = null;
				aClass196_6099 = null;
				aClass196_6090 = null;
				aClass109_Sub1_6091 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.I(" + i + ')');
		}
	}

	static final void method2564(boolean bool) {
		try {
			anInt6086++;
			int i = Class246_Sub4.anInt3869;
			int[] is = Class53.anIntArray755;
			if (bool != true)
				aClass198_6080 = null;
			for (int i_16_ = 0; i > i_16_; i_16_++) {
				Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[is[i_16_]];
				if (class_r_sub1 != null && (((Actor) class_r_sub1).anInt6471 ^ 0xffffffff) < -1) {
					((Actor) class_r_sub1).anInt6471--;
					if (((Actor) class_r_sub1).anInt6471 == 0)
						((Actor) class_r_sub1).aString6429 = null;
				}
			}
			for (int i_17_ = 0; i_17_ < Class5.anInt55; i_17_++) {
				int i_18_ = Class246_Sub28_Sub29.anIntArray6815[i_17_];
				Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_18_];
				if (class_r_sub2 != null && ((Actor) class_r_sub2).anInt6471 > 0) {
					((Actor) class_r_sub2).anInt6471--;
					if ((((Actor) class_r_sub2).anInt6471 ^ 0xffffffff) == -1)
						((Actor) class_r_sub2).aString6429 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.C(" + bool + ')');
		}
	}

	public static void method2565(byte i) {
		try {
			aClass198_6080 = null;
			anIntArrayArray6081 = null;
			if (i < 18)
				anIntArrayArray6081 = null;
			aShortArrayArray6094 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fh.D(" + i + ')');
		}
	}
}
