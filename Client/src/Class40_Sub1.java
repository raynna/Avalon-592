
/* Class40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub1 extends Class40 {
	static int anInt3766;
	static int anInt3767;
	static int[] anIntArray3768 = { 16, 32, 64, 128 };
	static int anInt3769;
	static int anInt3770;
	static int anInt3771;
	private Class196 aClass196_3772;
	static int anInt3773;
	private Class_m aClass_m3774;
	static int anInt3775;
	static Class85 aClass85_3776 = new Class85(8);
	static int anInt3777;
	private boolean aBool3778 = false;
	static int anInt3779;
	private boolean aBool3780 = false;
	static IncomingPacket aClass13_3781 = new IncomingPacket(0, 28);

	final void method284(boolean bool, byte i) {
		try {
			if (i < 115)
				aClass196_3772 = null;
			anInt3779++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aj.A(" + bool + ',' + i + ')');
		}
	}

	Class40_Sub1(Class260_Sub2 class260_sub2, Class_m class_m) {
		super(class260_sub2);
		do {
			try {
				aClass_m3774 = class_m;
				if (((Class_m) aClass_m3774).aClass109_Sub3_1542 == null || !(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_bh) || !(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aBool4391))
					break;
				Class256 class256 = (Class246_Sub34.method2201((byte) 121, ((Class40) this).aClass260_Sub2_613, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
				Class256 class256_0_ = (Class246_Sub34.method2201((byte) 121, ((Class40) this).aClass260_Sub2_613, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n"));
				aClass196_3772 = Class138.method935(new Class256[] { class256, class256_0_ }, ((Class40) this).aClass260_Sub2_613, -1);
				aBool3780 = aClass196_3772 != null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("aj.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class_m != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				method284(false, (byte) 77);
			anInt3770++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aj.G(" + bool + ')');
		}
	}

	public static void method1769(byte i) {
		do {
			try {
				aClass85_3776 = null;
				aClass13_3781 = null;
				anIntArray3768 = null;
				if (i == 121)
					break;
				method1769((byte) -83);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "aj.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method278(int i, boolean bool) {
		do {
			try {
				anInt3777++;
				Class109_Sub4 class109_sub4 = ((Class40) this).aClass260_Sub2_613.method1946((byte) 60);
				if (i != 0)
					method1771(-87, -40, -112, -121, -33, -94, 120, (byte) 5, -29);
				if (!aBool3780 || class109_sub4 == null)
					break;
				((Class40) this).aClass260_Sub2_613.method1936(1, -124);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109_sub4);
				((Class40) this).aClass260_Sub2_613.method1936(0, -126);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m3774).aClass109_Sub3_1542);
				long l = ((Class196) aClass196_3772).aLong2755;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
				OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[0]), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[1]), -(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[2]));
				OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_tg), (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloat4332), (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloat4367), 1.0F);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), 928.0F * Math.abs(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).aFloatArray4374[1]) + 96.0F);
				aBool3778 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "aj.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		do {
			try {
				if (aBool3778) {
					((Class40) this).aClass260_Sub2_613.method1936(1, -127);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
					((Class40) this).aClass260_Sub2_613.method1936(0, -118);
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
					OpenGL.glUseProgramObjectARB(0L);
					aBool3778 = false;
				}
				anInt3766++;
				if (i == 0)
					break;
				method1771(-106, 12, -35, -121, 67, -95, -27, (byte) -102, 65);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "aj.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			if (bool == true) {
				if (!aBool3778) {
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
					((Class40) this).aClass260_Sub2_613.method1900(7681, i);
				}
				anInt3769++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("aj.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final Class246_Sub28 method1770(int i, int i_1_) {
		try {
			anInt3771++;
			int i_2_ = i;
			while_213_: do {
				while_212_: do {
					while_211_: do {
						while_210_: do {
							while_209_: do {
								while_208_: do {
									while_207_: do {
										while_206_: do {
											while_205_: do {
												while_204_: do {
													while_203_: do {
														while_202_: do {
															while_201_: do {
																while_200_: do {
																	while_199_: do {
																		while_198_: do {
																			while_197_: do {
																				while_196_: do {
																					while_195_: do {
																						while_194_: do {
																							while_193_: do {
																								while_192_: do {
																									while_191_: do {
																										while_190_: do {
																											while_189_: do {
																												while_188_: do {
																													while_187_: do {
																														while_186_: do {
																															while_185_: do {
																																while_184_: do {
																																	while_183_: do {
																																		while_182_: do {
																																			while_181_: do {
																																				while_180_: do {
																																					while_179_: do {
																																						while_178_: do {
																																							while_177_: do {
																																								while_176_: do {
																																									while_175_: do {
																																										do {
																																											if ((i_2_ ^ 0xffffffff) != -1) {
																																												if ((i_2_ ^ 0xffffffff) == -2)
																																													break;
																																												if ((i_2_ ^ 0xffffffff) == -3)
																																													break while_175_;
																																												if ((i_2_ ^ 0xffffffff) == -4)
																																													break while_176_;
																																												if ((i_2_ ^ 0xffffffff) == -5)
																																													break while_177_;
																																												if (i_2_ == 5)
																																													break while_178_;
																																												if (i_2_ == 6)
																																													break while_179_;
																																												if (i_2_ == 7)
																																													break while_180_;
																																												if ((i_2_ ^ 0xffffffff) == -9)
																																													break while_181_;
																																												if (i_2_ == 9)
																																													break while_182_;
																																												if ((i_2_ ^ 0xffffffff) == -11)
																																													break while_183_;
																																												if ((i_2_ ^ 0xffffffff) == -12)
																																													break while_184_;
																																												if (i_2_ == 12)
																																													break while_185_;
																																												if ((i_2_ ^ 0xffffffff) == -14)
																																													break while_186_;
																																												if ((i_2_ ^ 0xffffffff) == -15)
																																													break while_187_;
																																												if (i_2_ == 15)
																																													break while_188_;
																																												if (i_2_ == 16)
																																													break while_189_;
																																												if (i_2_ == 17)
																																													break while_190_;
																																												if ((i_2_ ^ 0xffffffff) == -19)
																																													break while_191_;
																																												if ((i_2_ ^ 0xffffffff) == -20)
																																													break while_192_;
																																												if (i_2_ == 20)
																																													break while_193_;
																																												if ((i_2_ ^ 0xffffffff) == -22)
																																													break while_194_;
																																												if (i_2_ == 22)
																																													break while_195_;
																																												if (i_2_ == 23)
																																													break while_196_;
																																												if ((i_2_ ^ 0xffffffff) == -25)
																																													break while_197_;
																																												if ((i_2_ ^ 0xffffffff) == -26)
																																													break while_198_;
																																												if (i_2_ == 26)
																																													break while_199_;
																																												if ((i_2_ ^ 0xffffffff) == -28)
																																													break while_200_;
																																												if ((i_2_ ^ 0xffffffff) == -29)
																																													break while_201_;
																																												if (i_2_ == 29)
																																													break while_202_;
																																												if ((i_2_ ^ 0xffffffff) == -31)
																																													break while_203_;
																																												if ((i_2_ ^ 0xffffffff) == -32)
																																													break while_204_;
																																												if ((i_2_ ^ 0xffffffff) == -33)
																																													break while_205_;
																																												if ((i_2_ ^ 0xffffffff) == -34)
																																													break while_206_;
																																												if ((i_2_ ^ 0xffffffff) == -35)
																																													break while_207_;
																																												if (i_2_ == 35)
																																													break while_208_;
																																												if ((i_2_ ^ 0xffffffff) == -37)
																																													break while_209_;
																																												if ((i_2_ ^ 0xffffffff) == -38)
																																													break while_210_;
																																												if (i_2_ == 38)
																																													break while_211_;
																																												if (i_2_ != 39)
																																													break while_213_;
																																												if (!client.f_ob)
																																													break while_212_;
																																											}
																																											return new Class246_Sub28_Sub20();
																																										} while (false);
																																										return new Class246_Sub28_Sub1();
																																									} while (false);
																																									return new Class246_Sub28_Sub25();
																																								} while (false);
																																								return new Class246_Sub28_Sub6();
																																							} while (false);
																																							return new Class246_Sub28_Sub23();
																																						} while (false);
																																						return new Class246_Sub28_Sub28();
																																					} while (false);
																																					return new Class246_Sub28_Sub12();
																																				} while (false);
																																				return new Class246_Sub28_Sub17();
																																			} while (false);
																																			return new Class246_Sub28_Sub2();
																																		} while (false);
																																		return new Class246_Sub28_Sub13();
																																	} while (false);
																																	return new Class246_Sub28_Sub4();
																																} while (false);
																																return new Class246_Sub28_Sub18();
																															} while (false);
																															return new Class246_Sub28_Sub31();
																														} while (false);
																														return new Class246_Sub28_Sub14();
																													} while (false);
																													return new Class246_Sub28_Sub3();
																												} while (false);
																												return new Class246_Sub28_Sub32();
																											} while (false);
																											return new Class246_Sub28_Sub22();
																										} while (false);
																										return new Class246_Sub28_Sub36();
																									} while (false);
																									return new Class_cs();
																								} while (false);
																								return new Class246_Sub28_Sub21();
																							} while (false);
																							return new Class_ss();
																						} while (false);
																						return new Class246_Sub28_Sub29();
																					} while (false);
																					return new Class246_Sub28_Sub24();
																				} while (false);
																				return new Class246_Sub28_Sub10();
																			} while (false);
																			return new Class_ds();
																		} while (false);
																		return new Class246_Sub28_Sub33();
																	} while (false);
																	return (new Class246_Sub28_Sub11());
																} while (false);
																return (new Class_w());
															} while (false);
															return (new Class246_Sub28_Sub8());
														} while (false);
														return (new Class246_Sub28_Sub7());
													} while (false);
													return (new Class246_Sub28_Sub30());
												} while (false);
												return (new Class246_Sub28_Sub26());
											} while (false);
											return new Class246_Sub28_Sub15();
										} while (false);
										return new Class246_Sub28_Sub35();
									} while (false);
									return new Class246_Sub28_Sub9();
								} while (false);
								return new Class246_Sub28_Sub34();
							} while (false);
							return new Class246_Sub28_Sub16();
						} while (false);
						return new Class246_Sub28_Sub19();
					} while (false);
					return new Class246_Sub28_Sub27();
				} while (false);
				return new Class246_Sub28_Sub5();
			} while (false);
			if (i_1_ != 35)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "aj.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method1771(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_, int i_10_) {
		try {
			if (i_9_ == 27) {
				anInt3775++;
				if (!Class246_Sub13.method1992(-114, i_6_)) {
					if (i_3_ == -1) {
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -101; i_11_++)
							Class246_Sub39.aBoolArray5488[i_11_] = true;
					} else
						Class246_Sub39.aBoolArray5488[i_3_] = true;
				} else if (Class14.aClass235ArrayArray225[i_6_] != null)
					Class246_Sub1_Sub9.method2588(i_4_, i_5_, i_10_, i_3_, (Class14.aClass235ArrayArray225[i_6_]), i, -1, i_7_, i_8_, -1268043624);
				else
					Class246_Sub1_Sub9.method2588(i_4_, i_5_, i_10_, i_3_, (Class246_Sub32.aClass235ArrayArray5049[i_6_]), i, -1, i_7_, i_8_, -1268043624);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("aj.F(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method277(int i, int i_12_, int i_13_) {
		do {
			try {
				anInt3773++;
				if (aBool3778) {
					int i_14_ = 1 << (i & 0x3);
					float f = (float) (1 << (0x7 & i >> 3)) / 32.0F;
					int i_15_ = i_13_ & 0xffff;
					float f_16_ = (float) ((0x3a3d2 & i_13_) >> 16) / 8.0F;
					long l = ((Class196) aClass196_3772).aLong2755;
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe * i_14_ % 40000) / 40000.0F);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_15_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_16_);
				}
				if (i_12_ >= 76)
					break;
				method282(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("aj.H(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}
}
