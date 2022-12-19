/* Class246_Sub30_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub30_Sub1 extends Class246_Sub30 {
	long aLong5754;
	static int anInt5755;
	static int anInt5756 = 1;
	int anInt5757;
	static int anInt5758;
	int anInt5759;
	static int anInt5760;
	static Class17 aClass17_5761;
	static int anInt5762;
	static IncomingPacket aClass13_5763;
	static int anInt5764;
	static int[] anIntArray5765 = new int[16];
	int anInt5766;
	static short[][] aShortArrayArray5767;

	final int method2157(byte i) {
		try {
			if (i != 102)
				aClass17_5761 = null;
			anInt5762++;
			return ((Class246_Sub30_Sub1) this).anInt5759;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.D(" + i + ')');
		}
	}

	public static void method2447(byte i) {
		try {
			aClass13_5763 = null;
			aClass17_5761 = null;
			anIntArray5765 = null;
			aShortArrayArray5767 = null;
			int i_0_ = 34 / ((-57 - i) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.A(" + i + ')');
		}
	}

	final int method2160(int i) {
		try {
			anInt5764++;
			int i_1_ = 79 / ((-44 - i) / 45);
			return ((Class246_Sub30_Sub1) this).anInt5757;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.E(" + i + ')');
		}
	}

	static final boolean method2448(boolean bool, char c) {
		try {
			anInt5755++;
			if (bool != false)
				return false;
			if (c > 0 && (c ^ 0xffffffff) > -129 || c >= 160 && c <= 255)
				return true;
			if ((c ^ 0xffffffff) != -1) {
				char[] cs = Class40_Sub9.aCharArray5496;
				for (int i = 0; i < cs.length; i++) {
					int i_2_ = cs[i];
					if (c == i_2_)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.F(" + bool + ',' + c + ')');
		}
	}

	final long method2158(byte i) {
		try {
			int i_3_ = 46 / ((73 - i) / 40);
			anInt5758++;
			return ((Class246_Sub30_Sub1) this).aLong5754;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.B(" + i + ')');
		}
	}

	final int method2161(byte i) {
		try {
			if (i > -62)
				return 20;
			anInt5760++;
			return ((Class246_Sub30_Sub1) this).anInt5766;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "be.C(" + i + ')');
		}
	}

	static {
		aClass13_5763 = new IncomingPacket(87, -1);
	}
}
