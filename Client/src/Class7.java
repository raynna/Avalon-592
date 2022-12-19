/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	static int anInt91;
	static OutgoingPacket aClass201_92;
	static int anInt93;
	static int[][] anIntArrayArray94;
	static int anInt95 = 0;
	static int anInt96;
	static int anInt97;
	static short aShort98;

	static final boolean method77(int i) {
		try {
			if (i != 128)
				anIntArrayArray94 = null;
			anInt91++;
			if (Class230.anInt3147 <= 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "am.A(" + i + ')');
		}
	}

	public static void method78(int i) {
		do {
			try {
				aClass201_92 = null;
				anIntArrayArray94 = null;
				if (i == 0)
					break;
				method77(49);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "am.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method79(int i, int i_0_, byte i_1_) {
		try {
			anInt93++;
			if (i_1_ >= -29)
				method78(74);
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 123, 6);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("am.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static {
		anIntArrayArray94 = new int[128][128];
		aClass201_92 = new OutgoingPacket(74, 0);
		anInt97 = 0;
		aShort98 = (short) 256;
	}
}
