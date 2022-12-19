/* Class40_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class40_Sub8 extends Class40 {
	static int anInt5190;
	static int anInt5191;
	static int anInt5192;
	static Class_fs aClass_fs5193;
	static int anInt5194;
	static HashMap aClass54_5195 = new HashMap(64);
	static int anInt5196;
	static int anInt5197;
	static int anInt5198;
	static int anInt5199;
	static int anInt5200;

	static final String method2211(int i, BufferStream stream, int i_0_) {
		try {
			anInt5191++;
			try {
				int i_1_ = stream.readSmart((byte) 53);
				if ((i_0_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
					i_1_ = i_0_;
				byte[] is = new byte[i_1_];
				((BufferStream) stream).position += (Class246_Sub19_Sub2.aClass99_6812.method623(((BufferStream) stream).buffer, i, is, i ^ 0xffffffff, i_1_, ((BufferStream) stream).position));
				String string = Class_l_Sub2.method2299(11783, is, i_1_, 0);
				return string;
			} catch (Exception exception) {
				return "Cabbage";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sc.C(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	public static void method2212(int i) {
		try {
			aClass_fs5193 = null;
			if (i > -99)
				aClass_fs5193 = null;
			aClass54_5195 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sc.E(" + i + ')');
		}
	}

	final void method283(int i, Class109 class109, boolean bool) {
		try {
			((Class40) this).aClass260_Sub2_613.method1905((byte) 78, class109);
			anInt5192++;
			if (bool != true)
				method2213(false);
			((Class40) this).aClass260_Sub2_613.method1900(7681, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sc.B(" + i + ',' + (class109 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method277(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt5194++;
				if (i_2_ > 76)
					break;
				method277(-22, 85, -112);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sc.H(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method280(int i) {
		try {
			if (i != 0)
				anInt5198 = 22;
			((Class40) this).aClass260_Sub2_613.method1966(false, false);
			anInt5196++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sc.I(" + i + ')');
		}
	}

	final void method284(boolean bool, byte i) {
		do {
			try {
				anInt5200++;
				if (i > 115)
					break;
				method284(true, (byte) 35);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sc.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2213(boolean bool) {
		for (int i = Class246_Sub37_Sub4.anInt6880; i < Class154_Sub1.anInt4803; i++) {
			Class147[][] class147s = Class106.aClass147ArrayArrayArray1494[i];
			for (int i_4_ = -Class125.anInt1777; i_4_ <= 0; i_4_++) {
				int i_5_ = Class244.anInt3454 + i_4_;
				int i_6_ = Class244.anInt3454 - i_4_;
				if (i_5_ >= Class56.anInt796 || i_6_ < Class188.anInt2662) {
					for (int i_7_ = -Class125.anInt1777; i_7_ <= 0; i_7_++) {
						int i_8_ = Class59_Sub2_Sub2.anInt6025 + i_7_;
						int i_9_ = Class59_Sub2_Sub2.anInt6025 - i_7_;
						if (i_5_ >= Class56.anInt796) {
							if (i_8_ >= Class133.anInt1834) {
								Class147 class147 = class147s[i_5_][i_8_];
								if (class147 != null && ((Class147) class147).aBool2166) {
									Class81.aBool1068 = bool;
									Class245.aClass106_3462.method727(class147, 0);
									Class245.aClass106_3462.method721(5000);
								}
							}
							if (i_9_ < Class246_Sub1_Sub10.f_db) {
								Class147 class147 = class147s[i_5_][i_9_];
								if (class147 != null && ((Class147) class147).aBool2166) {
									Class81.aBool1068 = bool;
									Class245.aClass106_3462.method727(class147, 0);
									Class245.aClass106_3462.method721(5000);
								}
							}
						}
						if (i_6_ < Class188.anInt2662) {
							if (i_8_ >= Class133.anInt1834) {
								Class147 class147 = class147s[i_6_][i_8_];
								if (class147 != null && ((Class147) class147).aBool2166) {
									Class81.aBool1068 = bool;
									Class245.aClass106_3462.method727(class147, 0);
									Class245.aClass106_3462.method721(5000);
								}
							}
							if (i_9_ < Class246_Sub1_Sub10.f_db) {
								Class147 class147 = class147s[i_6_][i_9_];
								if (class147 != null && ((Class147) class147).aBool2166) {
									Class81.aBool1068 = bool;
									Class245.aClass106_3462.method727(class147, 0);
									Class245.aClass106_3462.method721(5000);
								}
							}
						}
						if (Class109_Sub1_Sub1.anInt6733 == 0) {
							if (Class246_Sub28_Sub25.aBool6705)
								Class245.aClass106_3462.method724((byte) 2, 24);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	final boolean method282(boolean bool) {
		try {
			if (bool != true)
				method283(-81, null, false);
			anInt5199++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sc.G(" + bool + ')');
		}
	}

	Class40_Sub8(Class260_Sub2 class260_sub2) {
		super(class260_sub2);
	}

	final void method278(int i, boolean bool) {
		try {
			if (i == 0) {
				anInt5197++;
				((Class40) this).aClass260_Sub2_613.method1966(true, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sc.D(" + i + ',' + bool + ')');
		}
	}

	static final void method2214(int i) {
		try {
			anInt5190++;
			if (i != 64)
				aClass_fs5193 = null;
			if (Class38_Sub1_Sub1.aBool6765) {
				Class187_Sub2.aClass_l5428 = null;
				Class46.aClass_l666 = null;
				Class38_Sub1_Sub1.aBool6765 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sc.F(" + i + ')');
		}
	}
}
