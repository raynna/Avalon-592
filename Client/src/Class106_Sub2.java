/* Class106_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106_Sub2 extends Class106 {
	private Class100 aClass100_5325;
	static int anInt5326;
	private int anInt5327 = 0;
	static short[] aShortArray5328;
	static int anInt5329;
	static int anInt5330;
	static int anInt5331;
	static int anInt5332;
	static boolean aBool5333 = false;
	static int anInt5334;
	static int anInt5335;
	static int anInt5336;
	static int anInt5337;
	static int anInt5338;
	static Class241 aClass241_5339;
	static Class_l[] aClass_lArray5340;
	static int anInt5341;
	static int baseTileY;

	final void method721(int i) {
		try {
			anInt5329++;
			if (i != 5000)
				baseTileY = -34;
			while (((Class106) this).anInt1489 != ((Class106) this).anInt1492)
				method2263(-5001);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.F(" + i + ')');
		}
	}

	public static void method2261(byte i) {
		try {
			if (i == -91) {
				aClass241_5339 = null;
				aClass_lArray5340 = null;
				aShortArray5328 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.C(" + i + ')');
		}
	}

	static final void method2262(int i) {
		try {
			Class82.aClass105_1072.method704(i - 20379);
			anInt5334++;
			Class246_Sub28_Sub21.aClass175_6587.method1154(7);
			Class238.aClass92_3358.method591(false);
			Class143.aClass251_2067.method1607((byte) 72);
			Class179.aClass228_2518.method1454((byte) 107);
			Class255.aClass191_3663.method1250(36);
			Class59_Sub3_Sub3.aClass45_6275.method299(-16517);
			Class195.aClass177_2745.method1162(64);
			Class246_Sub30_Sub1.aClass17_5761.method169((byte) 7);
			SubIncomingPacket.aClass209_7085.method1373(16);
			Class118.aClass_v1641.method693(-26);
			Class246_Sub10.aClass254_4084.method1646((byte) -127);
			Class246_Sub28_Sub30.aClass165_6873.method1096(i + 6028);
			Class241.aClass193_3398.method1270(false);
			Class246_Sub1_Sub10.f_eb.method1082(false);
			Class246_Sub31.aClass203_5038.method1332((byte) 54);
			Class246_Sub1_Sub14.aClass214_6597.method1397(2);
			Class228.aClass189_3132.method1239(true);
			Class_fs.aClass156_150.method1034(64);
			Class246_Sub28_Sub25.aClass57_6702.method395(-2049);
			Class246_Sub1.method1758((byte) -60);
			Class246_Sub28_Sub21.method2708((byte) 25);
			Class180.method1177((byte) 30);
			Class187.method1225((byte) -57);
			if (i == 20378) {
				Class140.aClass54_2034.method383(87);
				Class246_Sub41_Sub2.aClass54_6474.method383(i ^ 0x4ff1);
				Class211_Sub1.aClass54_5351.method383(97);
				Class56.aClass54_793.method383(124);
				Class146.aClass54_2139.method383(127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.I(" + i + ')');
		}
	}

	private final void method2263(int i) {
		try {
			anInt5335++;
			int i_0_ = ((Class106) this).anInt1489;
			((Class106) this).anInt1489++;
			if ((((Class106) this).anInt1489 ^ 0xffffffff) <= i)
				((Class106) this).anInt1489 = 0;
			anInt5327 = ((Class106) this).aByteArray1490[i_0_];
			Object object = ((Class106) this).anObjectArray1491[i_0_];
			((Class106) this).anObjectArray1491[i_0_] = null;
			if ((anInt5327 ^ 0xffffffff) != -22) {
				if (anInt5327 != 20) {
					if ((anInt5327 ^ 0xffffffff) > -31 || anInt5327 > 33) {
						if ((anInt5327 ^ 0xffffffff) > -41 || (anInt5327 ^ 0xffffffff) < -44) {
							if ((anInt5327 ^ 0xffffffff) != -23) {
								if ((anInt5327 ^ 0xffffffff) == -24)
									Class259_Sub3.aClass260_5357.l();
								else if (anInt5327 == 24)
									Class259_Sub3.aClass260_5357.method1679(0, null);
							} else
								Class259_Sub3.aClass260_5357.AA(-1, 1583160, 40, 127);
						} else {
							Class259_Sub3.aClass260_5357.g(3000.0F, (((Class106) this).aFloatArray1495[i_0_]) * 1.5F);
							((Class210) object).method1384(Class244.anInt3454, Class59_Sub2_Sub2.anInt6025, Class125.anInt1777, Class251.aBoolArrayArray3556, (-40 + anInt5327 ^ 0xffffffff) == -1);
						}
					} else {
						Class259_Sub3.aClass260_5357.g(3000.0F, (((Class106) this).aFloatArray1495[i_0_]) * 1.5F);
						((Class210) object).method1384(Class244.anInt3454, Class59_Sub2_Sub2.anInt6025, Class125.anInt1777, Class187_Sub1.aBoolArrayArray4866, (-30 + anInt5327 ^ 0xffffffff) == -1);
					}
				} else {
					Class147 class147 = (Class147) object;
					if (((Class147) class147).aClass59_Sub4_2172 != null)
						((Class147) class147).aClass59_Sub4_2172.method403(Class259_Sub3.aClass260_5357, 57);
					if (((Class147) class147).aClass59_Sub4_2152 != null)
						((Class147) class147).aClass59_Sub4_2152.method403(Class259_Sub3.aClass260_5357, 115);
					if (((Class147) class147).aClass59_Sub2_2153 != null)
						((Class147) class147).aClass59_Sub2_2153.method403(Class259_Sub3.aClass260_5357, 85);
					if (((Class147) class147).aClass59_Sub2_2159 != null)
						((Class147) class147).aClass59_Sub2_2159.method403(Class259_Sub3.aClass260_5357, 115);
					if (((Class147) class147).aClass59_Sub1_2156 != null)
						((Class147) class147).aClass59_Sub1_2156.method403(Class259_Sub3.aClass260_5357, 111);
					for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28)
						((Class3) class3).aClass59_Sub3_24.method403(Class259_Sub3.aClass260_5357, i ^ ~0x13ed);
				}
			} else
				Class162.method1073(aClass100_5325, (Class147) object);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.L(" + i + ')');
		}
	}

	final void method726(int i, boolean bool, Class210 class210, float f, byte i_1_) {
		do {
			try {
				anInt5337++;
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) (!bool ? 30 + i : i + 40);
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class210;
				((Class106) this).aFloatArray1495[((Class106) this).anInt1492] = f;
				if (i_1_ == 46) {
					((Class106) this).anInt1492++;
					if ((((Class106) this).anInt1492 ^ 0xffffffff) > -5001)
						break;
					((Class106) this).anInt1492 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tl.E(" + i + ',' + bool + ',' + (class210 != null ? "{...}" : "null") + ',' + f + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final void method724(byte i, int i_2_) {
		do {
			try {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) i_2_;
				anInt5338++;
				((Class106) this).anInt1492++;
				int i_3_ = 34 % ((-81 - i) / 34);
				if (((Class106) this).anInt1492 < 5000)
					break;
				((Class106) this).anInt1492 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tl.B(" + i + ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	final void method723(Class147 class147, byte i) {
		do {
			try {
				anInt5332++;
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) 20;
				if (i != -39)
					method726(88, false, null, -0.11426636F, (byte) 32);
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class147;
				((Class106) this).anInt1492++;
				if (((Class106) this).anInt1492 < 5000)
					break;
				((Class106) this).anInt1492 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tl.H(" + (class147 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method725(byte i, Class147 class147) {
		do {
			try {
				((Class106) this).anInt1489--;
				anInt5326++;
				if (((Class106) this).anInt1489 < 0)
					((Class106) this).anInt1489 = 4999;
				((Class106) this).aByteArray1490[((Class106) this).anInt1489] = (byte) 21;
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1489)] = class147;
				if (i <= -29)
					break;
				baseTileY = -8;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tl.K(" + i + ',' + (class147 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class106_Sub2() {
		aClass100_5325 = new Class100();
	}

	final void method727(Class147 class147, int i) {
		do {
			try {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) 21;
				anInt5331++;
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class147;
				if (i != 0)
					anInt5327 = -35;
				((Class106) this).anInt1492++;
				if ((((Class106) this).anInt1492 ^ 0xffffffff) > -5001)
					break;
				((Class106) this).anInt1492 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tl.A(" + (class147 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method722(int i, int i_4_) {
		do {
			try {
				anInt5341++;
				if (i_4_ == 5000)
					break;
				method723(null, (byte) -114);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tl.G(" + i + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	final void method720(int i) {
		try {
			anInt5336++;
			int i_5_ = -105 % ((i + 73) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.J(" + i + ')');
		}
	}

	static final void method2264(int i) {
		try {
			anInt5330++;
			int i_6_ = 0;
			if (i != -29238)
				method2264(-8);
			for (int i_7_ = 0; i_7_ < Class38_Sub1_Sub1.anInt6770; i_7_++) {
				for (int i_8_ = 0; (Class152.anInt2205 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					if (Class166.method1099(i_7_, true, i + 61820, i_8_, i_6_, (Class106.aClass147ArrayArrayArray1494)))
						i_6_++;
					if ((i_6_ ^ 0xffffffff) <= -513)
						return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tl.D(" + i + ')');
		}
	}

	static {
		aShortArray5328 = new short[] { 58, 13, 10, 12, 5, 57, 17, 20 };
		new Class67("You are temporarily banned from this clan channel.", "Du wurdest tempor\u00e4r aus diesem Chatraum verbannt.", "Vous \u00eates temporairement exclu de ce canal de clan.", "Voc\u00ea est\u00e1 temporariamente vetado de entrar nesse canal de cl\u00e3.");
	}
}
