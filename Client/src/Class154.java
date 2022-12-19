
/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class154 {
	static int anInt2213;
	static int anInt2214;
	static Class210[] aClass210Array2215;

	static final void method1017(int i) {
		try {
			anInt2214++;
			if ((Class228.anInt3137 ^ 0xffffffff) != -1) {
				try {
					if (i != -5)
						method1017(-93);
					if ((++Class_o.anInt7225 ^ 0xffffffff) < -1501) {
						if (Class65.aClass6_864 != null) {
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
						}
						if (Class129.anInt1808 < 1) {
							if (Class172.anInt2432 != Class71.anInt925)
								Class172.anInt2432 = Class71.anInt925;
							else
								Class172.anInt2432 = Class40_Sub1.anInt3767;
							Class129.anInt1808++;
							Class_o.anInt7225 = 0;
							Class228.anInt3137 = 1;
						} else {
							Class246_Sub31.anInt5034 = -5;
							Class228.anInt3137 = 0;
							return;
						}
					}
					if ((Class228.anInt3137 ^ 0xffffffff) == -2) {
						Class17.aClass182_242 = Class108.aClass52_1535.method364(i ^ ~0x4, (Class6.aString68), (Class172.anInt2432));
						Class228.anInt3137 = 2;
					}
					if ((Class228.anInt3137 ^ 0xffffffff) == -3) {
						if ((Class17.aClass182_242.anInt2539 ^ 0xffffffff) == -3)
							throw new IOException();
						if (Class17.aClass182_242.anInt2539 != 1)
							return;
						Class65.aClass6_864 = new Class6(((Socket) Class17.aClass182_242.anObject2535), Class108.aClass52_1535);
						Class17.aClass182_242 = null;
						Class65.aClass6_864.method76(((BufferStream) Class130_Sub1.stream).position, 0, (((BufferStream) Class130_Sub1.stream).buffer), 126);
						Class179.method1170((byte) 86);
						int i_0_ = Class65.aClass6_864.method73(30);
						Class179.method1170((byte) 66);
						if ((i_0_ ^ 0xffffffff) != -102) {
							Class246_Sub31.anInt5034 = i_0_;
							Class228.anInt3137 = 0;
							Class65.aClass6_864.method72(false);
							Class65.aClass6_864 = null;
							return;
						}
						Class228.anInt3137 = 3;
					}
					if (Class228.anInt3137 == 3) {
						if ((Class65.aClass6_864.method67(3) ^ 0xffffffff) <= -3) {
							int i_1_ = (Class65.aClass6_864.method73(i ^ ~0x5d) << 8 | Class65.aClass6_864.method73(125));
							Class88.method559(false, i_1_);
							if (Class32.anInt438 == -1) {
								Class228.anInt3137 = 0;
								Class246_Sub31.anInt5034 = 6;
								Class65.aClass6_864.method72(false);
								Class65.aClass6_864 = null;
							} else {
								Class228.anInt3137 = 0;
								Class65.aClass6_864.method72(false);
								Class65.aClass6_864 = null;
								Class128_Sub1.method2331(1);
							}
						}
					}
				} catch (IOException ioexception) {
					if (Class65.aClass6_864 != null) {
						Class65.aClass6_864.method72(false);
						Class65.aClass6_864 = null;
					}
					if ((Class129.anInt1808 ^ 0xffffffff) <= -2) {
						Class228.anInt3137 = 0;
						Class246_Sub31.anInt5034 = -4;
					} else {
						Class228.anInt3137 = 1;
						Class_o.anInt7225 = 0;
						Class129.anInt1808++;
						if ((Class71.anInt925 ^ 0xffffffff) != (Class172.anInt2432 ^ 0xffffffff))
							Class172.anInt2432 = Class71.anInt925;
						else
							Class172.anInt2432 = Class40_Sub1.anInt3767;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oi.R(" + i + ')');
		}
	}

	public static void method1018(int i) {
		try {
			aClass210Array2215 = null;
			int i_2_ = -61 / ((i - 6) / 37);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oi.Q(" + i + ')');
		}
	}

	public Class154() {
		/* empty */
	}

	abstract void method1019(int i, int i_3_);

	static final Actor method1020(int i, int i_4_, byte i_5_, int i_6_) {
		try {
			anInt2213++;
			Class147 class147 = Class106.aClass147ArrayArrayArray1494[i_6_][i_4_][i];
			if (class147 == null)
				return null;
			Actor class_r = null;
			if (i_5_ < 74)
				method1017(-24);
			int i_7_ = -1;
			for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
				Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
				if (class59_sub3 instanceof Actor) {
					Actor class_r_8_ = (Actor) class59_sub3;
					int i_9_ = (-1 + class_r_8_.method2670((byte) 127)) * 64 + 60;
					int i_10_ = ((Class59_Sub3) class_r_8_).anInt5060 - i_9_ >> 7;
					int i_11_ = ((Class59_Sub3) class_r_8_).anInt5059 + -i_9_ >> 7;
					int i_12_ = i_9_ + ((Class59_Sub3) class_r_8_).anInt5060 >> 7;
					int i_13_ = ((Class59_Sub3) class_r_8_).anInt5059 + i_9_ >> 7;
					if (i_10_ <= i_4_ && (i_11_ ^ 0xffffffff) >= (i ^ 0xffffffff) && i_4_ <= i_12_ && (i ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)) {
						int i_14_ = (i_13_ + 1 + -i) * (-i_4_ + (1 + i_12_));
						if (i_14_ > i_7_) {
							class_r = class_r_8_;
							i_7_ = i_14_;
						}
					}
				}
			}
			return class_r;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oi.P(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	abstract Class195 method1021(byte i);

	abstract int method1022(int i, byte i_15_);

	abstract byte[] method1023(int i, int i_16_);
}
