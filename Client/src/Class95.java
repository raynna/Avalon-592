/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class95 implements Interface11 {
	static Class199[] aClass199Array1235 = new Class199[4];
	static int anInt1236;
	static int anInt1237;
	static int anInt1238;
	static int anInt1239;
	int[] varps;
	static Class81 aClass81_1241 = new Class81(4, 1, 1, 1);
	private int[] updatedVarps;
	private Class85 aClass85_1243 = new Class85(128);
	static int anInt1244;
	static int anInt1245;
	static int anInt1246;
	static int anInt1247;
	static int anInt1248;
	static int anInt1249;
	static int anInt1250;
	static int[] anIntArray1251;
	static int anInt1252;
	static int anInt1253 = 0;

	public static void method603(boolean bool) {
		do {
			try {
				aClass199Array1235 = null;
				anIntArray1251 = null;
				aClass81_1241 = null;
				if (bool == false)
					break;
				anInt1252 = -42;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "it.I(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method604(int i, int i_0_, int i_1_) {
		try {
			anInt1248++;
			Class108 class108 = Class246_Sub30_Sub1.aClass17_5761.method167(i_0_, i_1_ ^ ~0xff);
			int i_2_ = ((Class108) class108).anInt1526;
			int i_3_ = ((Class108) class108).anInt1531;
			int i_4_ = ((Class108) class108).anInt1527;
			int i_5_ = Class246_Sub1_Sub3.anIntArray5702[i_4_ + -i_3_];
			if (i_1_ > i || (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff))
				i = 0;
			i_5_ <<= i_3_;
			method606(114, i_2_, i_5_ & i << i_3_ | ((i_5_ ^ 0xffffffff) & updatedVarps[i_2_]));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void reset(int i) {
		try {
			anInt1239++;
			for (int i_6_ = 0; (((Class209) SubIncomingPacket.aClass209_7085).anInt2945 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				Class93 class93 = SubIncomingPacket.aClass209_7085.method1374(i_6_, -10231);
				if (class93 != null && (((Class93) class93).anInt1223 ^ 0xffffffff) == -1) {
					updatedVarps[i_6_] = 0;
					((Class95) this).varps[i_6_] = 0;
				}
			}
			aClass85_1243 = new Class85(128);
			int i_7_ = -27 / ((i + 15) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.E(" + i + ')');
		}
	}

	final void method606(int i, int i_8_, int i_9_) {
		try {
			updatedVarps[i_8_] = i_9_;
			anInt1245++;
			int i_10_ = -105 % ((-64 - i) / 44);
			Class246_Sub23 class246_sub23 = (Class246_Sub23) aClass85_1243.method544((long) i_8_, 124);
			if (class246_sub23 != null) {
				if (((Class246_Sub23) class246_sub23).aLong4822 != 4611686018427387905L)
					((Class246_Sub23) class246_sub23).aLong4822 = (500L + Class151.time(-68) | 0x4000000000000000L);
			} else {
				class246_sub23 = new Class246_Sub23(4611686018427387905L);
				aClass85_1243.method547((long) i_8_, -2301, class246_sub23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.F(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void setIntVarp(int i, int value, int id) {
		try {
			if (i != 0)
				setIntVarp(34, -24, -115);
			((Class95) this).varps[id] = value;
			anInt1244++;
			Class246_Sub23 class246_sub23 = (Class246_Sub23) aClass85_1243.method544((long) id, 125);
			if (class246_sub23 != null)
				((Class246_Sub23) class246_sub23).aLong4822 = 500L + Class151.time(-92);
			else {
				class246_sub23 = new Class246_Sub23(Class151.time(-93) + 500L);
				aClass85_1243.method547((long) id, -2301, class246_sub23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.K(" + i + ',' + value + ',' + id + ')'));
		}
	}

	public final int method34(byte i, int i_13_) {
		try {
			anInt1237++;
			if (i != 45)
				anInt1246 = -23;
			Class108 class108 = Class246_Sub30_Sub1.aClass17_5761.method167(i_13_, i - 301);
			int i_14_ = ((Class108) class108).anInt1526;
			int i_15_ = ((Class108) class108).anInt1531;
			int i_16_ = ((Class108) class108).anInt1527;
			int i_17_ = Class246_Sub1_Sub3.anIntArray5702[i_16_ - i_15_];
			return ((Class95) this).varps[i_14_] >> i_15_ & i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.C(" + i + ',' + i_13_ + ')');
		}
	}

	final int method608(boolean bool, int i) {
		try {
			anInt1238++;
			long l = Class151.time(-123);
			Class246_Sub23 class246_sub23 = (!bool ? (Class246_Sub23) aClass85_1243.next((byte) -20) : (Class246_Sub23) aClass85_1243.first((byte) -23));
			if (i > -53)
				method604(125, -36, -30);
			for (/**/; class246_sub23 != null; class246_sub23 = (Class246_Sub23) aClass85_1243.next((byte) -20)) {
				if (((0x3fffffffffffffffL & ((Class246_Sub23) class246_sub23).aLong4822) ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
					if ((((Class246_Sub23) class246_sub23).aLong4822 & 0x4000000000000000L) != 0L) {
						int index = (int) ((Node) class246_sub23).hash;
						varps[index] = updatedVarps[index];
						class246_sub23.unlink((byte) -99);
						return index;
					}
					class246_sub23.unlink((byte) -110);
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.J(" + bool + ',' + i + ')');
		}
	}

	static final void method609(int i) {
		try {
			if (i != 1)
				method609(29);
			Class33.aClass260_444.method1698(Class126.aFloat1782, Class31.aFloat420, Class259_Sub3_Sub1.aFloat6901);
			anInt1250++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.G(" + i + ')');
		}
	}

	static final Class246_Sub18 method610(int i, boolean bool, int i_19_) {
		try {
			anInt1249++;
			if (i <= 18)
				method603(false);
			long l = (long) (i_19_ | (!bool ? 0 : -2147483648));
			return (Class246_Sub18) Class110.aClass85_1572.method544(l, 123);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.H(" + i + ',' + bool + ',' + i_19_ + ')'));
		}
	}

	final void method611(int i, byte i_20_, int i_21_) {
		try {
			anInt1236++;
			int i_22_ = 45 % ((28 - i_20_) / 59);
			Class108 class108 = Class246_Sub30_Sub1.aClass17_5761.method167(i, -256);
			int i_23_ = ((Class108) class108).anInt1526;
			int i_24_ = ((Class108) class108).anInt1531;
			int i_25_ = ((Class108) class108).anInt1527;
			int i_26_ = Class246_Sub1_Sub3.anIntArray5702[i_25_ + -i_24_];
			if (i_21_ < 0 || (i_21_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff))
				i_21_ = 0;
			i_26_ <<= i_24_;
			setIntVarp(0, (i_26_ & i_21_ << i_24_ | ((i_26_ ^ 0xffffffff) & ((Class95) this).varps[i_23_])), i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("it.D(" + i + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	public final int method35(int i, int i_27_) {
		try {
			anInt1247++;
			if (i_27_ != 0)
				method611(98, (byte) 37, 65);
			return ((Class95) this).varps[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.B(" + i + ',' + i_27_ + ')');
		}
	}

	public Class95() {
		try {
			updatedVarps = new int[(((Class209) SubIncomingPacket.aClass209_7085).anInt2945)];
			((Class95) this).varps = new int[(((Class209) SubIncomingPacket.aClass209_7085).anInt2945)];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "it.<init>(" + ')');
		}
	}

	static {
		anInt1252 = 0;
	}
}
