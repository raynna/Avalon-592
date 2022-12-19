/* Class128_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class128_Sub2 extends Class128 {
	static int[][] anIntArrayArray5565;
	static int[][] anIntArrayArray5566 = { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
	int[] anIntArray5567;
	int[] anIntArray5568;
	static int anInt5569;
	static int anInt5570;

	public static void method2333(byte i) {
		try {
			anIntArrayArray5566 = null;
			anIntArrayArray5565 = null;
			int i_0_ = 102 % ((i + 79) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wm.G(" + i + ')');
		}
	}

	static final void method2334(Actor class_r, int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_3_ < -99) {
				anInt5569++;
				Class135 class135 = class_r.method2676(-1);
				int i_4_ = (0x3fff & (((Actor) class_r).anInt6455 - ((Class24) ((Actor) class_r).f_fb).anInt344));
				if (i == -1) {
					if (i_4_ != 0 || (((Actor) class_r).anInt6435 ^ 0xffffffff) < -26) {
						((Actor) class_r).aBool6450 = false;
						if ((i_2_ ^ 0xffffffff) > -1 && ((((Class135) class135).anInt1887 ^ 0xffffffff) != 0))
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1887;
						else if ((i_2_ ^ 0xffffffff) < -1 && (((Class135) class135).anInt1918 ^ 0xffffffff) != 0)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1918;
						else
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1927;
					} else if (!((Actor) class_r).aBool6450 || !class135.method920((byte) 8, (((Actor) class_r).anInt6470))) {
						((Actor) class_r).anInt6470 = class135.method915(true);
						((Actor) class_r).aBool6450 = ((((Actor) class_r).anInt6470 ^ 0xffffffff) != 0);
					}
				} else if (((Actor) class_r).faceEntity != -1 && ((i_4_ ^ 0xffffffff) <= -10241 || i_4_ <= 2048)) {
					int i_5_ = ((-((Class24) ((Actor) class_r).f_fb).anInt344 + Class213.anIntArray2984[i_1_]) & 0x3fff);
					((Actor) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) != -3 || ((((Class135) class135).anInt1894 ^ 0xffffffff) == 0)) {
						if ((i ^ 0xffffffff) == -1 && ((Class135) class135).anInt1892 != -1) {
							if (i_5_ <= 2048 || (i_5_ ^ 0xffffffff) < -6145 || (((Class135) class135).anInt1917 ^ 0xffffffff) == 0) {
								if (i_5_ < 10240 || (i_5_ ^ 0xffffffff) <= -14337 || ((Class135) class135).anInt1900 == -1) {
									if ((i_5_ ^ 0xffffffff) >= -6145 || (i_5_ ^ 0xffffffff) <= -10241 || (((Class135) class135).anInt1908 == -1))
										((Actor) class_r).anInt6470 = ((Class135) class135).anInt1892;
									else
										((Actor) class_r).anInt6470 = ((Class135) class135).anInt1908;
								} else
									((Actor) class_r).anInt6470 = ((Class135) class135).anInt1900;
							} else
								((Actor) class_r).anInt6470 = ((Class135) class135).anInt1917;
						} else if (i_5_ <= 2048 || i_5_ > 6144 || (((Class135) class135).anInt1882 ^ 0xffffffff) == 0) {
							if ((i_5_ ^ 0xffffffff) <= -10241 && (i_5_ ^ 0xffffffff) > -14337 && ((Class135) class135).anInt1907 != -1)
								((Actor) class_r).anInt6470 = ((Class135) class135).anInt1907;
							else if (i_5_ > 6144 && i_5_ < 10240 && (((Class135) class135).f_bb ^ 0xffffffff) != 0)
								((Actor) class_r).anInt6470 = ((Class135) class135).f_bb;
							else
								((Actor) class_r).anInt6470 = ((Class135) class135).anInt1927;
						} else
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1882;
					} else if (i_5_ > 2048 && i_5_ <= 6144 && (((Class135) class135).anInt1890 ^ 0xffffffff) != 0)
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1890;
					else if (i_5_ >= 10240 && i_5_ < 14336 && ((Class135) class135).anInt1914 != -1)
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1914;
					else if (i_5_ <= 6144 || i_5_ >= 10240 || ((((Class135) class135).anInt1880 ^ 0xffffffff) == 0))
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1894;
					else
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1880;
				} else if ((i_4_ ^ 0xffffffff) != -1 || ((Actor) class_r).anInt6435 > 25) {
					((Actor) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) == -3 && ((((Class135) class135).anInt1894 ^ 0xffffffff) != 0)) {
						if (i_2_ < 0 && (((Class135) class135).anInt1915 ^ 0xffffffff) != 0)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1915;
						else if ((i_2_ ^ 0xffffffff) >= -1 || (((Class135) class135).anInt1903 ^ 0xffffffff) == 0)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1894;
						else
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1903;
					} else if (i != 0 || (((Class135) class135).anInt1892 ^ 0xffffffff) == 0) {
						if ((i_2_ ^ 0xffffffff) > -1 && ((Class135) class135).anInt1893 != -1)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1893;
						else if (i_2_ > 0 && ((Class135) class135).anInt1909 != -1)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1909;
						else
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1927;
					} else if ((i_2_ ^ 0xffffffff) <= -1 || (((Class135) class135).anInt1881 ^ 0xffffffff) == 0) {
						if ((i_2_ ^ 0xffffffff) >= -1 || ((Class135) class135).anInt1897 == -1)
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1892;
						else
							((Actor) class_r).anInt6470 = ((Class135) class135).anInt1897;
					} else
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1881;
				} else {
					((Actor) class_r).aBool6450 = false;
					if ((i ^ 0xffffffff) == -3 && ((Class135) class135).anInt1894 != -1)
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1894;
					else if (i == 0 && (((Class135) class135).anInt1892 ^ 0xffffffff) != 0)
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1892;
					else
						((Actor) class_r).anInt6470 = ((Class135) class135).anInt1927;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wm.E(" + (class_r != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class128_Sub2(int i, int i_6_, int[] is, int[] is_7_) {
		try {
			((Class128_Sub2) this).anIntArray5567 = is_7_;
			((Class128_Sub2) this).anIntArray5568 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wm.<init>(" + i + ',' + i_6_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2335(int i, byte i_8_) {
		try {
			if (i_8_ < -14) {
				for (Node class246 = Class113.aClass85_1595.first((byte) -23); class246 != null; class246 = Class113.aClass85_1595.next((byte) -20)) {
					if ((long) i == (((Node) class246).hash >> 48 & 0xffffL))
						class246.unlink((byte) 75);
				}
				anInt5570++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wm.F(" + i + ',' + i_8_ + ')');
		}
	}
}
