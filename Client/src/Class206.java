/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class206 {
	static int anInt2890;
	static int anInt2891;
	static float[] aFloatArray2892 = new float[16];
	private Class85 aClass85_2893;
	static int anInt2894;
	static int anInt2895;
	static int anInt2896;
	static int anInt2897;
	static Class81 aClass81_2898 = new Class81(7, 0, 1, 1);
	static int anInt2899;
	private int anInt2900;
	static int anInt2901;
	static int anInt2902;
	static int anInt2903;
	private Class217 aClass217_2904 = new Class217();
	private int anInt2905;
	static int anInt2906;
	static int anInt2907;
	static Stream_Sub2 aStream_Sub2_2908 = new Stream_Sub2(8192);

	private final void method1344(int i, Interface2 interface2) {
		try {
			anInt2899++;
			long l = interface2.method3((byte) 126);
			Class246_Sub1_Sub15 class246_sub1_sub15 = (Class246_Sub1_Sub15) aClass85_2893.method544(l, 123);
			if (i <= 33)
				aClass217_2904 = null;
			for (/**/; class246_sub1_sub15 != null; class246_sub1_sub15 = (Class246_Sub1_Sub15) aClass85_2893.method541(-1)) {
				if (((Class246_Sub1_Sub15) class246_sub1_sub15).anInterface2_6604.method5(interface2, 27398)) {
					method1346(class246_sub1_sub15, 21808);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.C(" + i + ',' + (interface2 != null ? "{...}" : "null") + ')');
		}
	}

	final int method1345(int i) {
		try {
			if (i <= 93)
				aFloatArray2892 = null;
			anInt2897++;
			return anInt2905;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.M(" + i + ')');
		}
	}

	private final void method1346(Class246_Sub1_Sub15 class246_sub1_sub15, int i) {
		do {
			try {
				if (i != 21808)
					aClass85_2893 = null;
				anInt2902++;
				if (class246_sub1_sub15 == null)
					break;
				class246_sub1_sub15.unlink((byte) -107);
				class246_sub1_sub15.method1756((byte) 71);
				anInt2905 += ((Class246_Sub1_Sub15) class246_sub1_sub15).anInt6599;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sq.I(" + (class246_sub1_sub15 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Object method1347(Interface2 interface2, int i) {
		try {
			anInt2895++;
			long l = interface2.method3((byte) 125);
			if (i != 14278)
				method1345(88);
			for (Class246_Sub1_Sub15 class246_sub1_sub15 = (Class246_Sub1_Sub15) aClass85_2893.method544(l, 125); class246_sub1_sub15 != null; class246_sub1_sub15 = (Class246_Sub1_Sub15) aClass85_2893.method541(-1)) {
				if (((Class246_Sub1_Sub15) class246_sub1_sub15).anInterface2_6604.method5(interface2, i + 13120)) {
					Object object = class246_sub1_sub15.method2718((byte) 43);
					if (object == null) {
						class246_sub1_sub15.unlink((byte) -111);
						class246_sub1_sub15.method1756((byte) 97);
						anInt2905 += (((Class246_Sub1_Sub15) class246_sub1_sub15).anInt6599);
					} else {
						if (class246_sub1_sub15.method2714((byte) 114)) {
							Class246_Sub1_Sub15_Sub2 class246_sub1_sub15_sub2 = (new Class246_Sub1_Sub15_Sub2(interface2, object, ((Class246_Sub1_Sub15) class246_sub1_sub15).anInt6599));
							aClass85_2893.method547((((Node) class246_sub1_sub15).hash), -2301, class246_sub1_sub15_sub2);
							aClass217_2904.method1407(-116, class246_sub1_sub15_sub2);
							((Class246_Sub1) class246_sub1_sub15_sub2).aLong3739 = 0L;
							class246_sub1_sub15.unlink((byte) 90);
							class246_sub1_sub15.method1756((byte) -91);
						} else {
							aClass217_2904.method1407(-115, class246_sub1_sub15);
							((Class246_Sub1) class246_sub1_sub15).aLong3739 = 0L;
						}
						return object;
					}
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.A(" + (interface2 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1348(int i) {
		do {
			try {
				aStream_Sub2_2908 = null;
				aClass81_2898 = null;
				aFloatArray2892 = null;
				if (i == 8192)
					break;
				aStream_Sub2_2908 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sq.K(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class103 method1349(int i, Class_fs class_fs, byte i_0_, int i_1_) {
		try {
			anInt2906++;
			byte[] is = class_fs.method91(i, i_1_, i_0_ + 7);
			if (i_0_ != 89)
				aFloatArray2892 = null;
			if (is == null)
				return null;
			return new Class103(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sq.E(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method1350(int i, int i_2_) {
		try {
			i--;
			if (i_2_ != 269173057)
				return 107;
			anInt2901++;
			i |= i >>> 1;
			i |= i >>> 2;
			i |= i >>> 4;
			i |= i >>> 8;
			i |= i >>> 16;
			return 1 + i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.L(" + i + ',' + i_2_ + ')');
		}
	}

	final void method1351(int i, int i_3_) {
		do {
			try {
				anInt2890++;
				int i_4_ = -41 / ((-37 - i) / 42);
				if (Class120.aClass88_1648 == null)
					break;
				for (Class246_Sub1_Sub15 class246_sub1_sub15 = ((Class246_Sub1_Sub15) aClass217_2904.method1408((byte) 87)); class246_sub1_sub15 != null; class246_sub1_sub15 = ((Class246_Sub1_Sub15) aClass217_2904.method1411(true))) {
					if (!class246_sub1_sub15.method2714((byte) 95)) {
						if ((++((Class246_Sub1) class246_sub1_sub15).aLong3739 ^ 0xffffffffffffffffL) < ((long) i_3_ ^ 0xffffffffffffffffL)) {
							Class246_Sub1_Sub15 class246_sub1_sub15_5_ = Class120.aClass88_1648.method556(class246_sub1_sub15, -69);
							aClass85_2893.method547((((Node) class246_sub1_sub15).hash), -2301, class246_sub1_sub15_5_);
							Class118.method813(true, class246_sub1_sub15, class246_sub1_sub15_5_);
							class246_sub1_sub15.unlink((byte) -112);
							class246_sub1_sub15.method1756((byte) 35);
						}
					} else if (class246_sub1_sub15.method2718((byte) 75) == null) {
						class246_sub1_sub15.unlink((byte) -115);
						class246_sub1_sub15.method1756((byte) 19);
						anInt2905 += (((Class246_Sub1_Sub15) class246_sub1_sub15).anInt6599);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sq.B(" + i + ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	final void method1352(boolean bool) {
		try {
			if (bool != true)
				method1345(-74);
			anInt2907++;
			aClass217_2904.method1406((byte) -77);
			aClass85_2893.method543(0);
			anInt2905 = anInt2900;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.H(" + bool + ')');
		}
	}

	final void method1353(int i) {
		try {
			Class246_Sub1_Sub15 class246_sub1_sub15 = (Class246_Sub1_Sub15) aClass217_2904.method1408((byte) 87);
			if (i > 18) {
				for (/**/; class246_sub1_sub15 != null; class246_sub1_sub15 = ((Class246_Sub1_Sub15) aClass217_2904.method1411(true))) {
					if (class246_sub1_sub15.method2714((byte) 86)) {
						class246_sub1_sub15.unlink((byte) -92);
						class246_sub1_sub15.method1756((byte) -74);
						anInt2905 += (((Class246_Sub1_Sub15) class246_sub1_sub15).anInt6599);
					}
				}
				anInt2894++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.F(" + i + ')');
		}
	}

	final void method1354(int i, Object object, Interface2 interface2) {
		try {
			method1356(interface2, object, false, 1);
			if (i >= 44)
				anInt2891++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sq.G(" + i + ',' + (object != null ? "{...}" : "null") + ',' + (interface2 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1355(byte i) {
		try {
			anInt2896++;
			int i_6_ = -78 / ((i + 63) / 36);
			return anInt2900;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.J(" + i + ')');
		}
	}

	private final void method1356(Interface2 interface2, Object object, boolean bool, int i) {
		try {
			anInt2903++;
			if ((i ^ 0xffffffff) < (anInt2900 ^ 0xffffffff))
				throw new IllegalStateException("s>cs");
			method1344(80, interface2);
			anInt2905 -= i;
			while ((anInt2905 ^ 0xffffffff) > -1) {
				Class246_Sub1_Sub15 class246_sub1_sub15 = ((Class246_Sub1_Sub15) aClass217_2904.method1410((byte) -63));
				method1346(class246_sub1_sub15, 21808);
			}
			if (bool != false)
				method1353(-125);
			Class246_Sub1_Sub15_Sub2 class246_sub1_sub15_sub2 = new Class246_Sub1_Sub15_Sub2(interface2, object, i);
			aClass85_2893.method547(interface2.method3((byte) 113), -2301, class246_sub1_sub15_sub2);
			aClass217_2904.method1407(-119, class246_sub1_sub15_sub2);
			((Class246_Sub1) class246_sub1_sub15_sub2).aLong3739 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sq.D(" + (interface2 != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	Class206(int i) {
		try {
			anInt2905 = i;
			anInt2900 = i;
			int i_7_;
			for (i_7_ = 1; i_7_ + i_7_ < i; i_7_ += i_7_) {
				/* empty */
			}
			aClass85_2893 = new Class85(i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sq.<init>(" + i + ')');
		}
	}
}
