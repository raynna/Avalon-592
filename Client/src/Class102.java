/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class102 {
	static int anInt1318;
	static int anInt1319;
	static Class67 aClass67_1320 = new Class67("glow1:", "leuchten1:", "brillant1:", "brilho1:");
	static int[] anIntArray1321;
	static long[] aLongArray1322;
	static short[] aShortArray1323;
	static int[] anIntArray1324 = new int[64];
	static int[][] anIntArrayArray1325;

	abstract void method633(boolean bool);

	final boolean method634(int i) {
		try {
			if (i <= 99)
				aShortArray1323 = null;
			anInt1318++;
			if (!method641(2) && !method643((byte) 77) && !method635(1))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jn.U(" + i + ')');
		}
	}

	abstract boolean method635(int i);

	abstract int method636(int i);

	public static void method637(int i) {
		try {
			anIntArray1324 = null;
			anIntArray1321 = null;
			if (i > -13)
				method639(-91, 35);
			aShortArray1323 = null;
			aLongArray1322 = null;
			anIntArrayArray1325 = null;
			aClass67_1320 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jn.T(" + i + ')');
		}
	}

	public Class102() {
		/* empty */
	}

	abstract Class246_Sub30 method638(byte i);

	static final void method639(int i, int i_0_) {
		try {
			if (i != 1)
				method637(107);
			CS2Script.anInt5682 = i_0_;
			anInt1319++;
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				Class246_Sub28_Sub14.aClass54_6304.method369(false);
			}
			synchronized (Class253.aClass54_3600) {
				Class253.aClass54_3600.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jn.S(" + i + ',' + i_0_ + ')');
		}
	}

	abstract int method640(byte i);

	abstract boolean method641(int i);

	abstract void method642(int i);

	abstract boolean method643(byte i);

	static {
		anIntArray1321 = new int[4];
		aLongArray1322 = new long[256];
		anIntArrayArray1325 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			long l = (long) i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if ((l & 0x1L ^ 0xffffffffffffffffL) == -2L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray1322[i] = l;
		}
	}
}
