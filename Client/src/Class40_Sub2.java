
/* Class40_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub2 extends Class40 {
	static Class67 aClass67_4034;
	static int anInt4035;
	private Class196 aClass196_4036;
	static short[] aShortArray4037;
	static int anInt4038;
	static int anInt4039;
	static int anInt4040;
	static int anInt4041;
	private boolean aBool4042 = false;
	static int anInt4043;
	static int anInt4044;
	private Class_m aClass_m4045;
	private boolean aBool4046 = false;
	static int anInt4047 = 64;
	static int anInt4048;
	static Class81 aClass81_4049;
	static short[][] aShortArrayArray4050;
	static int[] anIntArray4051;

	final void method278(int i, boolean bool) {
		do {
			try {
				anInt4035++;
				if (i != 0)
					aBool4042 = false;
				Class109_Sub4 class109_sub4 = ((Class40) this).aClass260_Sub2_613.method1946((byte) 114);
				if (!aBool4042 || class109_sub4 == null)
					break;
				float f = ((1.0F - Math.abs(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[1])) * 2.0F + 1.0F);
				((Class40) this).aClass260_Sub2_613.method1936(1, i ^ ~0x79);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109_sub4);
				((Class40) this).aClass260_Sub2_613.method1936(0, -123);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4045).aClass109_Sub3_1542);
				long l = ((Class196) aClass196_4036).aLong2755;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
				OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[0]), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[1]), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[2]));
				OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), f * (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_tg), (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloat4332) * f, (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloat4367) * f, 1.0F);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), (64.0F + 928.0F * Math.abs(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[1])));
				aBool4046 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dk.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final boolean method282(boolean bool) {
		try {
			anInt4040++;
			if (bool != true)
				anIntArray4051 = null;
			return aBool4042;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dk.G(" + bool + ')');
		}
	}

	static final void method1858(long l, Class260 class260, int i) {
		do {
			try {
				anInt4039++;
				Class246_Sub27.anInt4906 = Class247.anInt3480;
				Class148.anInt2176 = 0;
				if (i >= 65) {
					Class247.anInt3480 = 0;
					long l_0_ = Class151.time(-93);
					for (Class130_Sub2 class130_sub2 = ((Class130_Sub2) Class216.aClass68_3008.method445(62)); class130_sub2 != null; class130_sub2 = (Class130_Sub2) Class216.aClass68_3008.method442((byte) -119)) {
						if (class130_sub2.method1780(class260, l))
							Class148.anInt2176++;
					}
					if (!Class14.aBool201 || (l % 100L ^ 0xffffffffffffffffL) != -1L)
						break;
					System.out.println("Particle system count: " + Class216.aClass68_3008.method440((byte) -122) + ", running: " + Class148.anInt2176 + ". Particles: " + Class247.anInt3480 + ". Time taken: " + (Class151.time(-128) + -l_0_) + "ms");
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dk.C(" + l + ',' + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method277(int i, int i_1_, int i_2_) {
		try {
			if (aBool4046) {
				int i_3_ = 1 << (i & 0x3);
				float f = (float) (1 << (0x7 & i >> 3)) / 32.0F;
				int i_4_ = i_2_ & 0xffff;
				float f_5_ = (float) ((0x3d84d & i_2_) >> 16) / 8.0F;
				float f_6_ = (float) ((i_2_ & 0x7dc68b) >> 19) / 16.0F;
				float f_7_ = (float) ((0x7d6be91 & i_2_) >> 23) / 16.0F;
				int i_8_ = 0xf & i_2_ >> 27;
				long l = ((Class196) aClass196_4036).aLong2755;
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (((Class260_Sub2) (((Class40) this).aClass260_Sub2_613)).f_qe * i_3_ % 40000) / 40000.0F);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_4_);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_5_);
				OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_7_, f_6_);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "waveExponent"), (float) i_8_);
			}
			if (i_1_ <= 76)
				aShortArray4037 = null;
			anInt4038++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dk.H(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		do {
			try {
				anInt4043++;
				if (bool != true)
					method277(-28, -34, 26);
				if (aBool4046)
					break;
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
				((Class40) this).aClass260_Sub2_613.method1900(7681, i);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dk.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	Class40_Sub2(Class260_Sub2 class260_sub2, Class_m class_m) {
		super(class260_sub2);
		do {
			try {
				aClass_m4045 = class_m;
				if (((Class_m) aClass_m4045).aClass109_Sub3_1542 == null || !(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_bh) || !(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aBool4391))
					break;
				Class256 class256 = (Class246_Sub34.method2201((byte) 121, ((Class40) this).aClass260_Sub2_613, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
				Class256 class256_9_ = (Class246_Sub34.method2201((byte) 121, ((Class40) this).aClass260_Sub2_613, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n"));
				aClass196_4036 = Class138.method935(new Class256[] { class256, class256_9_ }, ((Class40) this).aClass260_Sub2_613, -1);
				aBool4042 = aClass196_4036 != null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dk.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class_m != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		try {
			if (i != 0)
				method283(-118, null, false);
			if (aBool4046) {
				((Class40) this).aClass260_Sub2_613.method1936(1, i - 127);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				((Class40) this).aClass260_Sub2_613.method1936(0, -128);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				OpenGL.glUseProgramObjectARB(0L);
				aBool4046 = false;
			}
			anInt4041++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dk.I(" + i + ')');
		}
	}

	public static void method1859(byte i) {
		do {
			try {
				aClass81_4049 = null;
				aShortArrayArray4050 = null;
				anIntArray4051 = null;
				aClass67_4034 = null;
				aShortArray4037 = null;
				if (i == 95)
					break;
				anIntArray4051 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dk.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method284(boolean bool, byte i) {
		do {
			try {
				anInt4044++;
				if (i > 115)
					break;
				method278(51, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dk.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aShortArray4037 = new short[] { -4160, -4163, -8256, -8259, 22461 };
		aClass67_4034 = new Class67(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
		aClass81_4049 = new Class81(2, 4, 4, 0);
		aShortArrayArray4050 = (new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } });
		anIntArray4051 = new int[] { 2047, 16383, 65535 };
	}
}
