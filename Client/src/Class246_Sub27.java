/* Class246_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub27 extends Node {
	static int anInt4892;
	int anInt4893;
	static int anInt4894;
	static int anInt4895;
	static int anInt4896;
	static int anInt4897;
	int anInt4898;
	static int anInt4899;
	static int anInt4900;
	static int anInt4901;
	static IncomingPacket SEND_CAMERA_SHAKE_PACKET;
	static int[] anIntArray4903 = new int[8];
	static int anInt4904;
	static int anInt4905;
	static int anInt4906;

	final boolean method2118(int i) {
		try {
			anInt4904++;
			if (i != 16457)
				method2126(-20);
			if ((0x1 & ((Class246_Sub27) this).anInt4893 >> 22 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.B(" + i + ')');
		}
	}

	final boolean method2119(int i) {
		try {
			anInt4899++;
			if (i < 47)
				anInt4906 = 21;
			if (((0x34886e & ((Class246_Sub27) this).anInt4893) >> 21 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.E(" + i + ')');
		}
	}

	final boolean method2120(int i, int i_0_) {
		try {
			if (i_0_ != 1)
				method2125(104);
			anInt4901++;
			if ((0x1 & ((Class246_Sub27) this).anInt4893 >> 1 + i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.D(" + i + ',' + i_0_ + ')');
		}
	}

	final boolean method2121(int i) {
		try {
			if (i != 1)
				anInt4906 = 43;
			anInt4897++;
			if ((0x1 & ((Class246_Sub27) this).anInt4893) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.I(" + i + ')');
		}
	}

	static final String method2122(int i, boolean bool, int i_1_) {
		try {
			anInt4905++;
			int i_2_ = -i_1_ + i;
			if (i_2_ < -9)
				return "<col=ff0000>";
			if (i_2_ < -6)
				return "<col=ff3000>";
			if (i_2_ < -3)
				return "<col=ff7000>";
			if (i_2_ < 0)
				return "<col=ffb000>";
			if ((i_2_ ^ 0xffffffff) < -10)
				return "<col=00ff00>";
			if (i_2_ > 6)
				return "<col=40ff00>";
			if ((i_2_ ^ 0xffffffff) < -4)
				return "<col=80ff00>";
			if (bool != true)
				method2122(-1, false, -117);
			if ((i_2_ ^ 0xffffffff) < -1)
				return "<col=c0ff00>";
			return "<col=ffff00>";
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ns.G(" + i + ',' + bool + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2123(Class260 class260, byte i, Class246_Sub2 class246_sub2, Class140 class140, int i_3_, int i_4_) {
		try {
			anInt4896++;
			int i_5_ = 2147483647;
			int i_6_ = -2147483648;
			int i_7_ = 2147483647;
			int i_8_ = -2147483648;
			if (((Class140) class140).anIntArray2027 != null) {
				i_6_ = (Class79.anInt1040 - -((Class79.anInt1056 + -Class79.anInt1040) * (-Class79.anInt1048 + (((Class140) class140).anInt2032 + ((Class246_Sub2) class246_sub2).anInt3807)) / (Class79.anInt1052 + -Class79.anInt1048)));
				i_8_ = (-((((Class140) class140).anInt2008 - (-((Class246_Sub2) class246_sub2).anInt3801 + Class79.anInt1047)) * (-Class79.anInt1049 + Class79.anInt1055) / (-Class79.anInt1047 + Class79.anInt1039)) + Class79.anInt1055);
				i_5_ = (Class79.anInt1040 + ((-Class79.anInt1048 + ((Class140) class140).anInt2038 + ((Class246_Sub2) class246_sub2).anInt3807) * (Class79.anInt1056 + -Class79.anInt1040) / (Class79.anInt1052 + -Class79.anInt1048)));
				i_7_ = (Class79.anInt1055 + -((Class79.anInt1055 + -Class79.anInt1049) * (((Class246_Sub2) class246_sub2).anInt3801 + ((Class140) class140).anInt2021 - Class79.anInt1047) / (-Class79.anInt1047 + Class79.anInt1039)));
			}
			Class_l class_l = null;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			if ((((Class140) class140).anInt2026 ^ 0xffffffff) != 0) {
				if (((Class246_Sub2) class246_sub2).aBool3802 && ((Class140) class140).anInt2005 != -1)
					class_l = class140.method949(class260, true, (byte) 69);
				else
					class_l = class140.method949(class260, false, (byte) 107);
				if (class_l != null) {
					i_9_ = (((Class246_Sub2) class246_sub2).anInt3810 + -(1 + class_l.j() >> 1));
					if (i_9_ < i_5_)
						i_5_ = i_9_;
					i_10_ = (((Class246_Sub2) class246_sub2).anInt3810 + (1 + class_l.j() >> 1));
					i_11_ = (((Class246_Sub2) class246_sub2).anInt3805 - (class_l.T() + 1 >> 1));
					if ((i_10_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
						i_6_ = i_10_;
					i_12_ = (((Class246_Sub2) class246_sub2).anInt3805 - -(1 + class_l.T() >> 1));
					if ((i_7_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
						i_7_ = i_11_;
					if ((i_8_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
						i_8_ = i_12_;
				}
			}
			Class198 class198 = null;
			int i_13_ = 0;
			int i_14_ = 0;
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			if (((Class140) class140).aString1998 != null) {
				class198 = Class114.method779(((Class140) class140).anInt1994, (byte) -117);
				if (class198 != null) {
					i_13_ = (Class217.aClass73_3022.method458(null, null, (byte) -78, Class214.aStringArray2986, ((Class140) class140).aString1998));
					i_14_ = ((Class246_Sub2) class246_sub2).anInt3805;
					if (class_l != null)
						i_14_ -= (class_l.T() >> 1) - -(class198.method1303() * i_13_);
					else
						i_14_ -= i_13_ * class198.method1306() / 2;
					for (int i_20_ = 0; i_13_ > i_20_; i_20_++) {
						String string = Class214.aStringArray2986[i_20_];
						if ((i_13_ - 1 ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
							string = string.substring(0, -4 + string.length());
						int i_21_ = class198.method1305(string);
						if (i_21_ > i_15_)
							i_15_ = i_21_;
					}
					i_16_ = (-(i_15_ / 2) + ((Class246_Sub2) class246_sub2).anInt3810 - -i_4_);
					i_17_ = (i_15_ / 2 + ((Class246_Sub2) class246_sub2).anInt3810 - -i_4_);
					if (i_16_ < i_5_)
						i_5_ = i_16_;
					i_18_ = i_14_ + i_3_;
					if ((i_17_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
						i_6_ = i_17_;
					i_19_ = i_3_ + (i_14_ + i_13_ * class198.method1303());
					if ((i_18_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
						i_7_ = i_18_;
					if (i_8_ < i_19_)
						i_8_ = i_19_;
				}
			}
			if (Class79.anInt1040 > i_6_ || i_5_ > Class79.anInt1056 || (Class79.anInt1049 ^ 0xffffffff) < (i_8_ ^ 0xffffffff) || (Class79.anInt1055 ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
				return true;
			if (i != -83)
				anIntArray4903 = null;
			if (((Class140) class140).anIntArray2027 != null) {
				int[] is = new int[((Class140) class140).anIntArray2027.length];
				for (int i_22_ = 0; (is.length / 2 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
					int i_23_ = (((Class140) class140).anIntArray2027[2 * i_22_] + ((Class246_Sub2) class246_sub2).anInt3807);
					int i_24_ = (((Class140) class140).anIntArray2027[i_22_ * 2 + 1] + ((Class246_Sub2) class246_sub2).anInt3801);
					is[2 * i_22_] = (Class79.anInt1040 + ((-Class79.anInt1048 + i_23_) * (Class79.anInt1056 - Class79.anInt1040) / (Class79.anInt1052 + -Class79.anInt1048)));
					is[i_22_ * 2 + 1] = (-((-Class79.anInt1047 + i_24_) * (-Class79.anInt1049 + Class79.anInt1055) / (Class79.anInt1039 + -Class79.anInt1047)) + Class79.anInt1055);
				}
				Class77.method479(class260, is, ((Class140) class140).anInt2023);
				for (int i_25_ = 0; is.length / 2 - 1 > i_25_; i_25_++)
					class260.method1737(is[1 + 2 * i_25_], ((Class140) class140).anInt2000, is[i_25_ * 2], is[(i_25_ + 1) * 2 + 1], is[2 * i_25_ + 2], i + 87);
				class260.method1737(is[is.length - 1], ((Class140) class140).anInt2000, is[is.length - 2], is[1], is[0], 4);
			}
			if (class_l != null) {
				if ((Class74.anInt966 ^ 0xffffffff) < -1 && (((Class246_Sub28_Sub4.anInt5975 ^ 0xffffffff) != 0 && (((Class246_Sub2) class246_sub2).anInt3808 == Class246_Sub28_Sub4.anInt5975)) || (Class246_Sub28_Sub33.anInt6968 != -1 && ((((Class140) class140).anInt2014 ^ 0xffffffff) == (Class246_Sub28_Sub33.anInt6968 ^ 0xffffffff))))) {
					int i_26_;
					if ((Class40_Sub5.anInt4918 ^ 0xffffffff) >= -51)
						i_26_ = Class40_Sub5.anInt4918 * 2;
					else
						i_26_ = (100 + -Class40_Sub5.anInt4918) * 2;
					int i_27_ = i_26_ << 24 | 0xffff00;
					class260.method1745((byte) 76, ((Class246_Sub2) class246_sub2).anInt3805, 7 + class_l.la() / 2, ((Class246_Sub2) class246_sub2).anInt3810, i_27_);
					class260.method1745((byte) 76, ((Class246_Sub2) class246_sub2).anInt3805, class_l.la() / 2 + 5, ((Class246_Sub2) class246_sub2).anInt3810, i_27_);
					class260.method1745((byte) 76, ((Class246_Sub2) class246_sub2).anInt3805, class_l.la() / 2 + 3, ((Class246_Sub2) class246_sub2).anInt3810, i_27_);
					class260.method1745((byte) 76, ((Class246_Sub2) class246_sub2).anInt3805, class_l.la() / 2 + 1, ((Class246_Sub2) class246_sub2).anInt3810, i_27_);
					class260.method1745((byte) 76, ((Class246_Sub2) class246_sub2).anInt3805, class_l.la() / 2, ((Class246_Sub2) class246_sub2).anInt3810, i_27_);
				}
				class_l.method729((((Class246_Sub2) class246_sub2).anInt3810 + -(class_l.j() >> 1)), (((Class246_Sub2) class246_sub2).anInt3805 - (class_l.T() >> 1)));
			}
			if (((Class140) class140).aString1998 != null && class198 != null)
				Class233.method1492(i_13_, (byte) 124, class246_sub2, i_15_, i_14_, class198, class140, class260);
			if ((((Class140) class140).anInt2026 ^ 0xffffffff) != 0 || ((Class140) class140).aString1998 != null) {
				Class246_Sub10 class246_sub10 = new Class246_Sub10(class246_sub2);
				((Class246_Sub10) class246_sub10).anInt4076 = i_12_;
				((Class246_Sub10) class246_sub10).anInt4082 = i_17_;
				((Class246_Sub10) class246_sub10).anInt4073 = i_10_;
				((Class246_Sub10) class246_sub10).anInt4072 = i_9_;
				((Class246_Sub10) class246_sub10).anInt4074 = i_19_;
				((Class246_Sub10) class246_sub10).anInt4075 = i_16_;
				((Class246_Sub10) class246_sub10).anInt4078 = i_11_;
				((Class246_Sub10) class246_sub10).anInt4077 = i_18_;
				Class211.aClass166_2963.method1101(false, class246_sub10);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ns.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + (class246_sub2 != null ? "{...}" : "null") + ',' + (class140 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method2124(int i) {
		try {
			anIntArray4903 = null;
			if (i != 0)
				method2122(125, true, -26);
			SEND_CAMERA_SHAKE_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.H(" + i + ')');
		}
	}

	Class246_Sub27(int i, int i_28_) {
		try {
			((Class246_Sub27) this).anInt4893 = i;
			((Class246_Sub27) this).anInt4898 = i_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.<init>(" + i + ',' + i_28_ + ')');
		}
	}

	final int method2125(int i) {
		try {
			if (i != 1861624)
				method2124(-84);
			anInt4895++;
			return (((Class246_Sub27) this).anInt4893 & 0x1c67f8) >> 18;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.A(" + i + ')');
		}
	}

	final int method2126(int i) {
		try {
			anInt4900++;
			if (i != 16693)
				SEND_CAMERA_SHAKE_PACKET = null;
			return Class259_Sub3_Sub1.method2841(9921, ((Class246_Sub27) this).anInt4893);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ns.F(" + i + ')');
		}
	}

	static {
		anInt4894 = 0;
		SEND_CAMERA_SHAKE_PACKET = new IncomingPacket(93, 8);
		anInt4906 = 0;
	}
}
