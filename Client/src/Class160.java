/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160 {
	static int anInt2261;
	static int[] anIntArray2262 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static boolean aBool2263;
	Interface10 anInterface10_2264;
	byte aByte2265;
	static Class_l aClass_l2266;
	static int[] anIntArray2267 = new int[13];
	byte aByte2268;
	short aShort2269;
	static short[] aShortArray2270;
	static int anInt2271;
	static int anInt2272;

	static final void method1059(int i, boolean bool) {
		try {
			anInt2272++;
			Class85.method545((byte) -109);
			if (Class225.anInt3103 == 30 || Class225.anInt3103 == 25) {
				Class88.anInt1152++;
				if (Class88.anInt1152 >= 50 || bool) {
					if (i >= -31)
						method1062(55, 105, 124);
					Class88.anInt1152 = 0;
					if (!Class59_Sub3_Sub1.aBool5746 && Class65.aClass6_864 != null) {
						Class243.writePacket(-92, Class7.aClass201_92);
						Class40_Sub7.anInt5178++;
						try {
							Class65.aClass6_864.method76((((BufferStream) Class130_Sub1.stream).position), 0, (((BufferStream) Class130_Sub1.stream).buffer), 127);
							((BufferStream) Class130_Sub1.stream).position = 0;
						} catch (java.io.IOException ioexception) {
							Class59_Sub3_Sub1.aBool5746 = true;
						}
					}
					Class85.method545((byte) -109);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pc.D(" + i + ',' + bool + ')');
		}
	}

	static final boolean method1060(int i, int i_0_, int i_1_) {
		for (int i_2_ = 0; i_2_ < Class109_Sub1.anInt3755; i_2_++) {
			Class121 class121 = Class236.aClass121Array3306[i_2_];
			if (((Class121) class121).anInt1669 == 1) {
				int i_3_ = ((Class121) class121).anInt1657 - i;
				if (i_3_ > 0) {
					int i_4_ = (((Class121) class121).anInt1661 + (((Class121) class121).anInt1654 * i_3_ >> 8));
					int i_5_ = (((Class121) class121).anInt1658 + (((Class121) class121).anInt1672 * i_3_ >> 8));
					int i_6_ = (((Class121) class121).anInt1671 + (((Class121) class121).anInt1670 * i_3_ >> 8));
					int i_7_ = (((Class121) class121).anInt1664 + (((Class121) class121).anInt1665 * i_3_ >> 8));
					if (i_1_ >= i_4_ && i_1_ <= i_5_ && i_0_ >= i_6_ && i_0_ <= i_7_)
						return true;
				}
			} else if (((Class121) class121).anInt1669 == 2) {
				int i_8_ = i - ((Class121) class121).anInt1657;
				if (i_8_ > 0) {
					int i_9_ = (((Class121) class121).anInt1661 + (((Class121) class121).anInt1654 * i_8_ >> 8));
					int i_10_ = (((Class121) class121).anInt1658 + (((Class121) class121).anInt1672 * i_8_ >> 8));
					int i_11_ = (((Class121) class121).anInt1671 + (((Class121) class121).anInt1670 * i_8_ >> 8));
					int i_12_ = (((Class121) class121).anInt1664 + (((Class121) class121).anInt1665 * i_8_ >> 8));
					if (i_1_ >= i_9_ && i_1_ <= i_10_ && i_0_ >= i_11_ && i_0_ <= i_12_)
						return true;
				}
			} else if (((Class121) class121).anInt1669 == 3) {
				int i_13_ = ((Class121) class121).anInt1661 - i_1_;
				if (i_13_ > 0) {
					int i_14_ = (((Class121) class121).anInt1657 + (((Class121) class121).anInt1655 * i_13_ >> 8));
					int i_15_ = (((Class121) class121).anInt1674 + (((Class121) class121).anInt1660 * i_13_ >> 8));
					int i_16_ = (((Class121) class121).anInt1671 + (((Class121) class121).anInt1670 * i_13_ >> 8));
					int i_17_ = (((Class121) class121).anInt1664 + (((Class121) class121).anInt1665 * i_13_ >> 8));
					if (i >= i_14_ && i <= i_15_ && i_0_ >= i_16_ && i_0_ <= i_17_)
						return true;
				}
			} else if (((Class121) class121).anInt1669 == 4) {
				int i_18_ = i_1_ - ((Class121) class121).anInt1661;
				if (i_18_ > 0) {
					int i_19_ = (((Class121) class121).anInt1657 + (((Class121) class121).anInt1655 * i_18_ >> 8));
					int i_20_ = (((Class121) class121).anInt1674 + (((Class121) class121).anInt1660 * i_18_ >> 8));
					int i_21_ = (((Class121) class121).anInt1671 + (((Class121) class121).anInt1670 * i_18_ >> 8));
					int i_22_ = (((Class121) class121).anInt1664 + (((Class121) class121).anInt1665 * i_18_ >> 8));
					if (i >= i_19_ && i <= i_20_ && i_0_ >= i_21_ && i_0_ <= i_22_)
						return true;
				}
			} else if (((Class121) class121).anInt1669 == 5) {
				int i_23_ = i_0_ - ((Class121) class121).anInt1671;
				if (i_23_ > 0) {
					int i_24_ = (((Class121) class121).anInt1657 + (((Class121) class121).anInt1655 * i_23_ >> 8));
					int i_25_ = (((Class121) class121).anInt1674 + (((Class121) class121).anInt1660 * i_23_ >> 8));
					int i_26_ = (((Class121) class121).anInt1661 + (((Class121) class121).anInt1654 * i_23_ >> 8));
					int i_27_ = (((Class121) class121).anInt1658 + (((Class121) class121).anInt1672 * i_23_ >> 8));
					if (i >= i_24_ && i <= i_25_ && i_1_ >= i_26_ && i_1_ <= i_27_)
						return true;
				}
			}
		}
		return false;
	}

	public static void method1061(byte i) {
		try {
			aShortArray2270 = null;
			if (i != -14)
				method1061((byte) -54);
			anIntArray2267 = null;
			aClass_l2266 = null;
			anIntArray2262 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pc.B(" + i + ')');
		}
	}

	static final boolean method1062(int i, int i_28_, int i_29_) {
		try {
			if (i_29_ != 0)
				return true;
			anInt2261++;
			return (Class51.method335(i, (byte) -91, i_28_) & Class223.method1437(i_28_, i, (byte) -32));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pc.A(" + i + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	Class160(Interface10 interface10, int i, int i_30_, int i_31_) {
		try {
			((Class160) this).aByte2268 = (byte) i_30_;
			((Class160) this).aShort2269 = (short) i;
			((Class160) this).anInterface10_2264 = interface10;
			((Class160) this).aByte2265 = (byte) i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pc.<init>(" + (interface10 != null ? "{...}" : "null") + ',' + i + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	static {
		aBool2263 = false;
		anInt2271 = -1;
	}
}
