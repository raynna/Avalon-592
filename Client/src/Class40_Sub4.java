
/* Class40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class40_Sub4 extends Class40 {
	private Class213 aClass213_4115;
	static int anInt4116;
	private Class_m aClass_m4117;
	static int anInt4118;
	static int anInt4119;
	static int anInt4120;
	private float[] aFloatArray4121;
	static int anInt4122;
	private int anInt4123;
	static int anInt4124;
	static int anInt4125;
	private Class34 aClass34_4126;
	static int anInt4127;
	static int anInt4128;

	final void method278(int i, boolean bool) {
		do {
			try {
				anInt4127++;
				if (aClass34_4126 != null) {
					aClass34_4126.method246('\0', -1);
					((Class40) this).aClass260_Sub2_613.method1936(1, -118);
					OpenGL.glMatrixMode(5890);
					OpenGL.glLoadMatrixf(((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_bg.method2279(i), i);
					OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
					OpenGL.glMatrixMode(5888);
					((Class40) this).aClass260_Sub2_613.method1936(0, -119);
					if (anInt4123 == ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe)
						break;
					int i_0_ = 128 * (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe % 5120) / 5120;
					i_0_ *= 128;
					for (int i_1_ = 0; i_1_ < 64; i_1_++) {
						OpenGL.glProgramLocalParameter4fvARB(34336, i_1_, aFloatArray4121, i_0_);
						i_0_ += 2;
					}
					if (!((Class_m) aClass_m4117).aBool1538)
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					else {
						float f = ((float) ((((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe) % 4000) / 4000.0F);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, f, 0.0F, 0.0F, 1.0F);
					}
					anInt4123 = ((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ei.D(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final boolean method282(boolean bool) {
		try {
			anInt4120++;
			if (bool != true)
				return true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ei.G(" + bool + ')');
		}
	}

	final void method284(boolean bool, byte i) {
		try {
			if (i >= 115)
				anInt4119++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ei.A(" + bool + ',' + i + ')');
		}
	}

	final void method277(int i, int i_2_, int i_3_) {
		try {
			anInt4122++;
			if (aClass34_4126 != null && i_2_ >= 76) {
				((Class40) this).aClass260_Sub2_613.method1936(1, -120);
				if ((0x80 & i ^ 0xffffffff) == -1) {
					if (((Class_m) aClass_m4117).aBool1538)
						((Class40) this).aClass260_Sub2_613.method1905((byte) 78, ((Class_m) aClass_m4117).aClass109_Sub3_1543);
					else {
						int i_4_ = (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_qe % 4000 * 16 / 4000);
						((Class40) this).aClass260_Sub2_613.method1905((byte) 78, (((Class_m) aClass_m4117).aClass109_Sub1Array1541[i_4_]));
					}
				} else
					((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				((Class40) this).aClass260_Sub2_613.method1936(0, -124);
				if ((i & 0x40 ^ 0xffffffff) == -1) {
					OpenGL.glGetFloatv(2899, Class1.aFloatArray1, 0);
					OpenGL.glProgramLocalParameter4fvARB(34336, 66, Class1.aFloatArray1, 0);
				} else
					OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
				int i_5_ = i & 0x3;
				if (i_5_ == 2)
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
				else if ((i_5_ ^ 0xffffffff) != -4)
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ei.H(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method280(int i) {
		try {
			anInt4128++;
			if (aClass34_4126 != null) {
				aClass34_4126.method246('\001', i ^ 0xffffffff);
				((Class40) this).aClass260_Sub2_613.method1936(1, -118);
				((Class40) this).aClass260_Sub2_613.method1905((byte) 78, null);
				((Class40) this).aClass260_Sub2_613.method1936(i, -120);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ei.I(" + i + ')');
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			anInt4124++;
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
			if (bool != true)
				method1877(-18, 71, -107, -62);
			((Class40) this).aClass260_Sub2_613.method1900(7681, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ei.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	Class40_Sub4(Class260_Sub2 class260_sub2, Class_m class_m) {
		super(class260_sub2);
		do {
			try {
				aClass_m4117 = class_m;
				if (!((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_uf || (((Class260_Sub2) ((Class40) this).aClass260_Sub2_613).f_mg) < 2)
					break;
				aClass213_4115 = (Class220.method1427(34336, (byte) 62, ((Class40) this).aClass260_Sub2_613, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
				if (aClass213_4115 != null) {
					int[][] is = OutgoingPacket.method1328(0, 64, 4, 8, false, (byte) -94, 256, 0.4F, 3);
					int[][] is_6_ = OutgoingPacket.method1328(8, 64, 4, 8, false, (byte) -128, 256, 0.4F, 3);
					int i = 0;
					aFloatArray4121 = new float[32768];
					for (int i_7_ = 0; i_7_ < 256; i_7_++) {
						int[] is_8_ = is[i_7_];
						int[] is_9_ = is_6_[i_7_];
						for (int i_10_ = 0; i_10_ < 64; i_10_++) {
							aFloatArray4121[i++] = (float) is_8_[i_10_] / 4096.0F;
							aFloatArray4121[i++] = (float) is_9_[i_10_] / 4096.0F;
						}
					}
					method1878((byte) -104);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ei.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class_m != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final int method1877(int i, int i_11_, int i_12_, int i_13_) {
		try {
			if (i_12_ != 2)
				return -122;
			anInt4118++;
			if (i_13_ > 243)
				i >>= 4;
			else if ((i_13_ ^ 0xffffffff) >= -218) {
				if (i_13_ > 192)
					i >>= 2;
				else if ((i_13_ ^ 0xffffffff) < -180)
					i >>= 1;
			} else
				i >>= 3;
			return ((i_13_ >> 1) + (((0x3f & i_11_ >> 2) << 10) - -(i >> 5 << 7)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ei.F(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	private final void method1878(byte i) {
		try {
			aClass34_4126 = new Class34(((Class40) this).aClass260_Sub2_613, 2);
			anInt4116++;
			if (i >= -91)
				aClass34_4126 = null;
			aClass34_4126.method247(0, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -127);
			((Class40) this).aClass260_Sub2_613.method1901((byte) -100, -16777216);
			((Class40) this).aClass260_Sub2_613.method1912(260, 7681, true);
			((Class40) this).aClass260_Sub2_613.method1954(true, 770, 34166, 0);
			((Class40) this).aClass260_Sub2_613.method1936(0, -119);
			OpenGL.glBindProgramARB(34336, ((Class213) aClass213_4115).anInt2978);
			OpenGL.glEnable(34336);
			aClass34_4126.method248((byte) 39);
			aClass34_4126.method247(1, true);
			((Class40) this).aClass260_Sub2_613.method1936(1, -118);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class40) this).aClass260_Sub2_613.method1900(7681, 0);
			((Class40) this).aClass260_Sub2_613.method1954(true, 770, 5890, 0);
			((Class40) this).aClass260_Sub2_613.method1936(0, -120);
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34336);
			OpenGL.glDisable(34820);
			aClass34_4126.method248((byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ei.C(" + i + ')');
		}
	}

	static final void method1879(String string, int i) {
		try {
			anInt4125++;
			if (!string.equals("")) {
				Class243.writePacket(-56, Class177.aClass201_2493);
				if (i == 65) {
					Class76.anInt998++;
					Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -78));
					Class130_Sub1.stream.writeString(63, string);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ei.E(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
