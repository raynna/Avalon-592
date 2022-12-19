
/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class37 {
	static int anInt542;
	private Class260_Sub2 aClass260_Sub2_543;
	static Class97 aClass97_544;
	private Class196 aClass196_545;
	static boolean[] aBoolArray546 = new boolean[100];
	static int anInt547 = 16777215;
	static int anInt548;
	static int anInt549;
	static int anInt550;
	static int anInt551;

	static final void method257(Class147[][][] class147s, int i) {
		try {
			if (i < -71) {
				anInt548++;
				for (int i_0_ = 0; (class147s.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
					Class147[][] class147s_1_ = class147s[i_0_];
					for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (class147s_1_.length ^ 0xffffffff)); i_2_++) {
						for (int i_3_ = 0; i_3_ < class147s_1_[i_2_].length; i_3_++) {
							Class147 class147 = class147s_1_[i_2_][i_3_];
							if (class147 != null) {
								if (((Class147) class147).aClass59_Sub1_2156 instanceof Class_f)
									((Class_f) ((Class147) class147).aClass59_Sub1_2156).method9(-65);
								if (((Class147) class147).aClass59_Sub2_2153 instanceof Class_f)
									((Class_f) ((Class147) class147).aClass59_Sub2_2153).method9(-115);
								if (((Class147) class147).aClass59_Sub2_2159 instanceof Class_f)
									((Class_f) ((Class147) class147).aClass59_Sub2_2159).method9(-51);
								if (((Class147) class147).aClass59_Sub4_2172 instanceof Class_f)
									((Class_f) ((Class147) class147).aClass59_Sub4_2172).method9(-65);
								if (((Class147) class147).aClass59_Sub4_2152 instanceof Class_f)
									((Class_f) ((Class147) class147).aClass59_Sub4_2152).method9(-21);
								for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
									Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
									if (class59_sub3 instanceof Class_f)
										((Class_f) class59_sub3).method9(-75);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "de.A(" + (class147s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method258(int i) {
		try {
			if (i < 12)
				aClass97_544 = null;
			aClass97_544 = null;
			aBoolArray546 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "de.E(" + i + ')');
		}
	}

	final boolean method259(int i) {
		try {
			anInt549++;
			if (i > -16)
				anInt551 = -107;
			if (((Class260_Sub2) aClass260_Sub2_543).aBool4322 && ((Class260_Sub2) aClass260_Sub2_543).aBool4391 && aClass196_545 == null) {
				Class256 class256 = (Class246_Sub34.method2201((byte) 121, aClass260_Sub2_543, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
				if (class256 != null)
					aClass196_545 = Class138.method935(new Class256[] { class256 }, aClass260_Sub2_543, -1);
			}
			if (aClass196_545 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "de.C(" + i + ')');
		}
	}

	static final void method260(Class_fs class_fs, int i) {
		do {
			try {
				anInt542++;
				Class78.aClass_fs1019 = class_fs;
				if (i == 1)
					break;
				aClass97_544 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("de.D(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	Class37(Class260_Sub2 class260_sub2) {
		try {
			aClass260_Sub2_543 = class260_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "de.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method261(float f, Class109_Sub3 class109_sub3, int i, Class109_Sub3 class109_sub3_4_) {
		try {
			anInt550++;
			if (!method259(-62))
				return false;
			Class134 class134 = ((Class260_Sub2) aClass260_Sub2_543).aClass134_4378;
			Class246_Sub1_Sub12 class246_sub1_sub12 = new Class246_Sub1_Sub12(aClass260_Sub2_543, 6408, (((Class109_Sub3) class109_sub3_4_).anInt3947), (((Class109_Sub3) class109_sub3_4_).anInt3956));
			if (i != 1)
				anInt547 = 20;
			aClass260_Sub2_543.method1922(class134, (byte) -101);
			boolean bool = false;
			class134.method906(class246_sub1_sub12, 0, (byte) -102);
			if (class134.method908(-36054)) {
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5889);
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glPushAttrib(2048);
				OpenGL.glViewport(0, 0, ((Class109_Sub3) class109_sub3_4_).anInt3947, (((Class109_Sub3) class109_sub3_4_).anInt3956));
				OpenGL.glUseProgramObjectARB(((Class196) aClass196_545).aLong2755);
				OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB(((Class196) aClass196_545).aLong2755, "heightMap")), 0);
				OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB(((Class196) aClass196_545).aLong2755, "rcpRelief")), 1.0F / f);
				OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB((((Class196) aClass196_545).aLong2755), "sampleSize"), 1.0F / (float) ((Class109_Sub3) class109_sub3).anInt3947, 1.0F / (float) ((Class109_Sub3) class109_sub3).anInt3956);
				for (int i_5_ = 0; ((i_5_ ^ 0xffffffff) > (((Class109_Sub3) class109_sub3_4_).anInt3949 ^ 0xffffffff)); i_5_++) {
					float f_6_ = ((float) i_5_ / (float) (((Class109_Sub3) class109_sub3_4_).anInt3949));
					aClass260_Sub2_543.method1905((byte) 78, class109_sub3);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord3f(0.0F, 0.0F, f_6_);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 0.0F, f_6_);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 1.0F, f_6_);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3f(0.0F, 1.0F, f_6_);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					class109_sub3_4_.method1827(0, 0, 0, ((Class109_Sub3) class109_sub3_4_).anInt3947, i_5_, (byte) -9, ((Class109_Sub3) class109_sub3_4_).anInt3956, 0);
				}
				OpenGL.glUseProgramObjectARB(0L);
				OpenGL.glPopAttrib();
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
				bool = true;
				OpenGL.glPopMatrix();
			}
			class134.method903(0, i - 110);
			aClass260_Sub2_543.method1971(class134, -114);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("de.B(" + f + ',' + (class109_sub3 != null ? "{...}" : "null") + ',' + i + ',' + (class109_sub3_4_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass97_544 = new Class97("WIP", 2);
		anInt551 = 0;
	}
}
