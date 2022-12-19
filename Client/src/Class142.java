/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class142 {
	static int anInt2048;
	static boolean aBool2049;
	static int anInt2050;
	private Class241 aClass241_2051;
	static int anInt2052;
	static int anInt2053;
	private Class154_Sub1[] aClass154_Sub1Array2054;
	private Class242 aClass242_2055;
	private SubIncomingPacket aClass246_Sub1_Sub6_Sub1_2056;
	static int anInt2057;
	private BufferStream aStream2058;
	static int anInt2059;
	static OutgoingPacket aClass201_2060 = new OutgoingPacket(47, 3);
	static int anInt2061;
	static String[] aStringArray2062;
	static IncomingPacket ANIMATION_ON_INTERFACE_PACKET = new IncomingPacket(86, 8);
	static Class211 aClass211_2064;

	final boolean method955(boolean bool) {
		try {
			anInt2059++;
			if (aStream2058 != null)
				return true;
			if (aClass246_Sub1_Sub6_Sub1_2056 == null) {
				if (aClass242_2055.method1549(0))
					return false;
				aClass246_Sub1_Sub6_Sub1_2056 = aClass242_2055.method1554(255, (byte) 0, (byte) -90, true, 255);
			}
			if (((Class246_Sub1_Sub6) aClass246_Sub1_Sub6_Sub1_2056).aBool5960)
				return false;
			if (bool != true)
				aClass241_2051 = null;
			aStream2058 = new BufferStream(aClass246_Sub1_Sub6_Sub1_2056.method2534(false));
			aClass154_Sub1Array2054 = (new Class154_Sub1[(-5 + ((BufferStream) aStream2058).buffer.length) / 8]);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nj.B(" + bool + ')');
		}
	}

	public static void method956(int i) {
		try {
			if (i == 3) {
				aClass201_2060 = null;
				aClass211_2064 = null;
				ANIMATION_ON_INTERFACE_PACKET = null;
				aStringArray2062 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nj.E(" + i + ')');
		}
	}

	static final void method957(byte i) {
		try {
			if (i == 60) {
				for (int i_0_ = 0; ((Class_a.aClass138ArrayArray1175.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					for (int i_1_ = 0; Class_a.aClass138ArrayArray1175[i_0_].length > i_1_; i_1_++)
						Class_a.aClass138ArrayArray1175[i_0_][i_1_] = Class22.aClass138_328;
				}
				anInt2053++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nj.A(" + i + ')');
		}
	}

	private final Class154_Sub1 method958(Class208 class208, Class208 class208_2_, int i, int i_3_) {
		try {
			if (i != 255)
				getFileStore(true, -36, false, 12, 105);
			anInt2048++;
			return method962(class208_2_, true, (byte) -115, i_3_, class208);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nj.H(" + (class208 != null ? "{...}" : "null") + ',' + (class208_2_ != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')'));
		}
	}

	static final int method959(int i, int i_4_) {
		try {
			anInt2050++;
			if (i_4_ != 20268)
				return 98;
			int i_5_ = i & 0x3f;
			int i_6_ = (0xe0 & i) >> 6;
			if ((i_5_ ^ 0xffffffff) == -19) {
				if (i_6_ == 0)
					return 1;
				if (i_6_ == 1)
					return 2;
				if (i_6_ == 2)
					return 4;
				if ((i_6_ ^ 0xffffffff) == -4)
					return 8;
			} else if ((i_5_ ^ 0xffffffff) == -20 || (i_5_ ^ 0xffffffff) == -22) {
				if (i_6_ == 0)
					return 16;
				if ((i_6_ ^ 0xffffffff) == -2)
					return 32;
				if ((i_6_ ^ 0xffffffff) == -3)
					return 64;
				if ((i_6_ ^ 0xffffffff) == -4)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nj.F(" + i + ',' + i_4_ + ')');
		}
	}

	final void method960(int i) {
		try {
			anInt2057++;
			if (aClass154_Sub1Array2054 != null && i >= 48) {
				for (int i_7_ = 0; ((aClass154_Sub1Array2054.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
					if (aClass154_Sub1Array2054[i_7_] != null)
						aClass154_Sub1Array2054[i_7_].method2092((byte) -98);
				}
				for (int i_8_ = 0; i_8_ < aClass154_Sub1Array2054.length; i_8_++) {
					if (aClass154_Sub1Array2054[i_8_] != null)
						aClass154_Sub1Array2054[i_8_].method2090(23747);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nj.C(" + i + ')');
		}
	}

	Class142(Class242 class242, Class241 class241) {
		do {
			try {
				aClass241_2051 = class241;
				aClass242_2055 = class242;
				if (aClass242_2055.method1549(0))
					break;
				aClass246_Sub1_Sub6_Sub1_2056 = aClass242_2055.method1554(255, (byte) 0, (byte) -45, true, 255);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nj.<init>(" + (class242 != null ? "{...}" : "null") + ',' + (class241 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class_fs getFileStore(boolean bool, int i, boolean bool_9_, int i_10_, int i_11_) {
		try {
			anInt2052++;
			Class208 class208 = null;
			if (Class48.aClass125_696 != null)
				class208 = new Class208(i, Class48.aClass125_696, Class47.aClass125Array687[i], 1000000);
			Class59_Sub1_Sub2.aClass154_Sub1Array6127[i] = Class194_Sub1.aClass142_4140.method958(Class121.aClass208_1678, class208, 255, i);
			if (bool_9_)
				Class59_Sub1_Sub2.aClass154_Sub1Array6127[i].method2096((byte) 126);
			if (i_10_ < 42)
				ANIMATION_ON_INTERFACE_PACKET = null;
			return new Class_fs(Class59_Sub1_Sub2.aClass154_Sub1Array6127[i], bool, i_11_);
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, ("nj.D(" + bool + ',' + i + ',' + bool_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	private final Class154_Sub1 method962(Class208 class208, boolean bool, byte i, int i_12_, Class208 class208_13_) {
		try {
			anInt2061++;
			if (aStream2058 == null)
				throw new RuntimeException();
			((BufferStream) aStream2058).position = 5 + i_12_ * 8;
			if (((BufferStream) aStream2058).buffer.length <= ((BufferStream) aStream2058).position)
				throw new RuntimeException();
			if (aClass154_Sub1Array2054[i_12_] != null)
				return aClass154_Sub1Array2054[i_12_];
			int i_14_ = aStream2058.readInt((byte) 89);
			int i_15_ = aStream2058.readInt((byte) 94);
			Class154_Sub1 class154_sub1 = new Class154_Sub1(i_12_, class208, class208_13_, aClass242_2055, aClass241_2051, i_14_, i_15_, bool);
			aClass154_Sub1Array2054[i_12_] = class154_sub1;
			int i_16_ = 23 / ((-73 - i) / 33);
			return class154_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nj.G(" + (class208 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_12_ + ',' + (class208_13_ != null ? "{...}" : "null") + ')'));
		}
	}
}
