
/* Class40_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub9 extends Class40 {
	private Class213 aClass213_5490;
	static int anInt5491;
	static int anInt5492;
	static int anInt5493;
	static byte[] aByteArray5494;
	static Class138 aClass138_5495;
	static char[] aCharArray5496 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	static int anInt5497;
	static int anInt5498;
	static int anInt5499;
	private Class213 aClass213_5500;
	private boolean aBool5501;
	private boolean aBool5502;
	static int anInt5503;
	private boolean aBool5504;
	private Class213 aClass213_5505;
	static Class155 aClass155_5506;
	static long aLong5507;
	static int anInt5508;
	static int anInt5509;
	static int anInt5510;
	static int anInt5511;
	private Class213 aClass213_5512;
	static int anInt5513;

	final void method280(int i) {
		try {
			if (i != 0)
				aClass213_5505 = null;
			if (aBool5504) {
				OpenGL.glBindProgramARB(34336, 0);
				OpenGL.glDisable(34820);
				OpenGL.glDisable(34336);
				aBool5504 = false;
			}
			anInt5498++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.I(" + i + ')');
		}
	}

	final void method284(boolean bool, byte i) {
		try {
			if (i <= 115)
				method277(125, -84, -7);
			anInt5499++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.A(" + bool + ',' + i + ')');
		}
	}

	static final Class244 method2304(BufferStream stream, byte i) {
		try {
			anInt5492++;
			if (i >= -109)
				method2309(-123, 16, -120, -32);
			Class244 class244 = new Class244();
			((Class244) class244).anInt3449 = stream.readUnsignedShort((byte) -84);
			((Class244) class244).aClass246_Sub1_Sub3_3450 = Class128_Sub1.aClass65_5558.method428(((Class244) class244).anInt3449, (byte) -99);
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class40_Sub9(Class260_Sub2 class260_sub2) {
		super(class260_sub2);
		try {
			if (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_uf) {
				aClass213_5505 = (Class220.method1427(34336, (byte) 62, ((Class40) this).aClass260_Sub2_613, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass213_5512 = (Class220.method1427(34336, (byte) 62, ((Class40) this).aClass260_Sub2_613, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass213_5500 = (Class220.method1427(34336, (byte) 62, ((Class40) this).aClass260_Sub2_613, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				aClass213_5490 = (Class220.method1427(34336, (byte) 62, ((Class40) this).aClass260_Sub2_613, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = state.texgen.eye.s;\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oFogCoord.x, fogFactor.x, fogFactor.y;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				aBool5501 = (aClass213_5505 != null & aClass213_5512 != null & aClass213_5500 != null & aClass213_5490 != null);
			} else
				aBool5501 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	final void method278(int i, boolean bool) {
		do {
			try {
				aBool5502 = bool;
				anInt5508++;
				if (i == 0)
					break;
				aClass213_5505 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ve.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method2305(int i) {
		try {
			if (aBool5504)
				OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4371 - 1280), (float) (-768 + (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4371)), 1.0F / (float) (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4384), ((float) ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_sf / 255.0F));
			if (i < 125)
				aClass213_5500 = null;
			anInt5493++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.F(" + i + ')');
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			if (bool != true)
				method2305(-86);
			anInt5491++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ve.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method2306(byte i) {
		try {
			anInt5503++;
			InputStream_Sub1.aFloatArray4823[3] = (float) ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4334;
			if (i == -41) {
				OpenGL.glTexGenfv(8192, 9474, InputStream_Sub1.aFloatArray4823, 0);
				do {
					if (aBool5502) {
						OpenGL.glBindProgramARB(34336, ((((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4334 ^ 0xffffffff) != -2147483648 ? ((Class213) aClass213_5490).anInt2978 : ((Class213) aClass213_5512).anInt2978));
						if (!client.f_ob)
							break;
					}
					OpenGL.glBindProgramARB(34336, ((((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).anInt4334 ^ 0xffffffff) == -2147483648 ? ((Class213) aClass213_5505).anInt2978 : ((Class213) aClass213_5500).anInt2978));
				} while (false);
				OpenGL.glEnable(34336);
				aBool5504 = true;
				method2305(127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.E(" + i + ')');
		}
	}

	public static void method2307(int i) {
		try {
			aByteArray5494 = null;
			aCharArray5496 = null;
			if (i == -261) {
				aClass138_5495 = null;
				aClass155_5506 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.L(" + i + ')');
		}
	}

	final void method277(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ <= 76)
				aLong5507 = 84L;
			anInt5510++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ve.H(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2308(int i, int i_2_, int i_3_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_2_][i_3_];
		if (class147 != null) {
			if (((Class147) class147).aClass59_Sub2_2153 != null)
				((Class147) class147).aClass59_Sub2_2153 = null;
			if (((Class147) class147).aClass59_Sub2_2159 != null)
				((Class147) class147).aClass59_Sub2_2159 = null;
		}
	}

	static final void method2309(int i, int i_4_, int i_5_, int i_6_) {
		try {
			if ((i_5_ ^ 0xffffffff) == -1) {
				Class100.anInt1296++;
				Class243.writePacket(-128, Class123.WALKING_OUT);
			}
			anInt5509++;
			if (i_5_ == 1) {
				Class258.anInt3691++;
				Class243.writePacket(-94, Class48.MINIMAP_WALKING_OUT);
			}
			Class130_Sub1.stream.writeByte(255, Class216.aClass232_3009.method1488(-95, 82) ? 1 : 0);
			Class130_Sub1.stream.writeShort((byte) 67, i - -Class39_Sub1.anInt4670);
			Class130_Sub1.stream.writeShort((byte) 67, i_6_ - -Class47.anInt686);
			if (i_4_ >= -115)
				anInt5511 = 98;
			Class34.anInt451 = i_6_;
			Class188.anInt2658 = i;
			Class193.aBool2712 = false;
			Class43.method294((byte) -31);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ve.K(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				return false;
			anInt5513++;
			return aBool5501;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ve.G(" + bool + ')');
		}
	}

	static {
		aByteArray5494 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	}
}
