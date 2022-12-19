/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168 {
	static int anInt2392 = 0;
	static Class51 aClass51_2393;
	static boolean aBool2394;
	static boolean aBool2395 = false;
	static int anInt2396;
	static int anInt2397;
	static int[] anIntArray2398;
	static int anInt2399 = 0;
	static boolean aBool2400;

	static final void method1118(int i, int i_0_, byte i_1_) {
		do {
			try {
				anInt2396++;
				if (Class79.aFloat1033 < Class79.aFloat1036) {
					Class79.aFloat1033 += (double) Class79.aFloat1033 / 30.0;
					if (Class79.aFloat1036 < Class79.aFloat1033)
						Class79.aFloat1033 = Class79.aFloat1036;
					Class_c_Sub1.method2278(-1);
					Class79.anInt1030 = (int) Class79.aFloat1033 >> 1;
					Class79.aByteArrayArrayArray1032 = Class257.method1668(0, Class79.anInt1030);
				} else if (Class79.aFloat1033 > Class79.aFloat1036) {
					Class79.aFloat1033 -= (double) Class79.aFloat1033 / 30.0;
					if (Class79.aFloat1036 > Class79.aFloat1033)
						Class79.aFloat1033 = Class79.aFloat1036;
					Class_c_Sub1.method2278(-1);
					Class79.anInt1030 = (int) Class79.aFloat1033 >> 1;
					Class79.aByteArrayArrayArray1032 = Class257.method1668(0, Class79.anInt1030);
				}
				int i_2_ = -30 % ((i_1_ + 71) / 44);
				if (OutputStream_Sub1.anInt4489 != -1 && Class40.anInt617 != -1) {
					int i_3_ = (OutputStream_Sub1.anInt4489 - Class109_Sub1_Sub1.anInt6725);
					if ((i_3_ ^ 0xffffffff) > -3 || (i_3_ ^ 0xffffffff) < -3)
						i_3_ /= 8;
					int i_4_ = -Class21.anInt322 + Class40.anInt617;
					Class109_Sub1_Sub1.anInt6725 = i_3_ + Class109_Sub1_Sub1.anInt6725;
					if ((i_4_ ^ 0xffffffff) > -3 || (i_4_ ^ 0xffffffff) < -3)
						i_4_ /= 8;
					Class21.anInt322 = i_4_ + Class21.anInt322;
					if ((i_3_ ^ 0xffffffff) == -1 && (i_4_ ^ 0xffffffff) == -1) {
						OutputStream_Sub1.anInt4489 = -1;
						Class40.anInt617 = -1;
					}
					Class_c_Sub1.method2278(-1);
				}
				if ((Class74.anInt966 ^ 0xffffffff) < -1) {
					Class40_Sub5.anInt4918--;
					if ((Class40_Sub5.anInt4918 ^ 0xffffffff) == -1) {
						Class74.anInt966--;
						Class40_Sub5.anInt4918 = 100;
					}
				} else {
					Class246_Sub28_Sub33.anInt6968 = -1;
					Class246_Sub28_Sub4.anInt5975 = -1;
				}
				if (!Class246_Sub28_Sub34.aBool7008 || Class211.aClass166_2963 == null)
					break;
				for (Class246_Sub10 class246_sub10 = ((Class246_Sub10) Class211.aClass166_2963.method1104(58)); class246_sub10 != null; class246_sub10 = ((Class246_Sub10) Class211.aClass166_2963.method1108((byte) -112))) {
					Class140 class140 = (Class79.aClass165_1022.method1088(((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, (byte) -41));
					if (!class246_sub10.method1866(i_0_, -15997, i)) {
						if (((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).aBool3802) {
							((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).aBool3802 = false;
							Class146.method993(Class116.aClass169_1609, (((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808), (((Class140) class140).anInt2014));
						}
					} else {
						if (((Class140) class140).aStringArray2029 != null) {
							if (((Class140) class140).aStringArray2029[4] != null)
								Class259_Sub2_Sub1.method2846(1006, (byte) -55, false, (long) ((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, ((Class140) class140).anInt2014, ((Class140) class140).aString2016, true, ((Class140) class140).aStringArray2029[4], 0, -1, -1);
							if (((Class140) class140).aStringArray2029[3] != null)
								Class259_Sub2_Sub1.method2846(1001, (byte) -55, false, (long) ((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, ((Class140) class140).anInt2014, ((Class140) class140).aString2016, true, ((Class140) class140).aStringArray2029[3], 0, -1, -1);
							if (((Class140) class140).aStringArray2029[2] != null)
								Class259_Sub2_Sub1.method2846(1008, (byte) -55, false, (long) ((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, ((Class140) class140).anInt2014, ((Class140) class140).aString2016, true, ((Class140) class140).aStringArray2029[2], 0, -1, -1);
							if (((Class140) class140).aStringArray2029[1] != null)
								Class259_Sub2_Sub1.method2846(1012, (byte) -55, false, (long) ((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, ((Class140) class140).anInt2014, ((Class140) class140).aString2016, true, ((Class140) class140).aStringArray2029[1], 0, -1, -1);
							if (((Class140) class140).aStringArray2029[0] != null)
								Class259_Sub2_Sub1.method2846(1004, (byte) -55, false, (long) ((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808, ((Class140) class140).anInt2014, ((Class140) class140).aString2016, true, ((Class140) class140).aStringArray2029[0], 0, -1, -1);
						}
						if (!((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).aBool3802) {
							((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).aBool3802 = true;
							Class146.method993(Class171.aClass169_2425, (((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808), (((Class140) class140).anInt2014));
						}
						if (((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).aBool3802)
							Class146.method993(Class51.aClass169_718, (((Class246_Sub2) (((Class246_Sub10) class246_sub10).aClass246_Sub2_4081)).anInt3808), (((Class140) class140).anInt2014));
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pm.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method1119(int i, Class63_Sub1 class63_sub1, boolean bool, Class63_Sub1 class63_sub1_5_, int i_6_, boolean bool_7_, byte i_8_) {
		try {
			int i_9_ = -70 / ((i_8_ + 5) / 48);
			anInt2397++;
			int i_10_ = Class152.method1010(bool_7_, i, class63_sub1, false, class63_sub1_5_);
			if ((i_10_ ^ 0xffffffff) != -1) {
				if (!bool_7_)
					return i_10_;
				return -i_10_;
			}
			if (i_6_ == -1)
				return 0;
			int i_11_ = Class152.method1010(bool, i_6_, class63_sub1, false, class63_sub1_5_);
			if (!bool)
				return i_11_;
			return -i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pm.A(" + i + ',' + (class63_sub1 != null ? "{...}" : "null") + ',' + bool + ',' + (class63_sub1_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + bool_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method1120(boolean bool) {
		try {
			if (bool == false) {
				anIntArray2398 = null;
				aClass51_2393 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pm.C(" + bool + ')');
		}
	}

	static {
		aClass51_2393 = new Class51();
		aBool2400 = false;
	}
}
