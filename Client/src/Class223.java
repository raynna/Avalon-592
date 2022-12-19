/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223 {
	static int anInt3070;
	static int anInt3071;
	private int[] anIntArray3072;
	static int anInt3073;
	static IncomingPacket aClass13_3074 = new IncomingPacket(109, 0);
	static Class67 aClass67_3075 = new Class67("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es", "Interfaces carregadas");
	static IncomingPacket aClass13_3076 = new IncomingPacket(60, -1);

	static final boolean method1437(int i, int i_0_, byte i_1_) {
		try {
			anInt3073++;
			if (i_1_ != -32)
				aClass13_3074 = null;
			if ((0x800 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ud.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method1438(int i) {
		try {
			aClass13_3076 = null;
			if (i == 20253) {
				aClass67_3075 = null;
				aClass13_3074 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ud.A(" + i + ')');
		}
	}

	final int method1439(int i, int i_2_) {
		try {
			anInt3071++;
			if (i != 109)
				method1437(-21, -23, (byte) 112);
			int i_3_ = (anIntArray3072.length >> 1) - 1;
			int i_4_ = i_3_ & i_2_;
			for (;;) {
				int i_5_ = anIntArray3072[i_4_ + (i_4_ + 1)];
				if ((i_5_ ^ 0xffffffff) == 0)
					return -1;
				if (anIntArray3072[i_4_ + i_4_] == i_2_)
					return i_5_;
				i_4_ = i_3_ & i_4_ + 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ud.C(" + i + ',' + i_2_ + ')');
		}
	}

	Class223(int[] is) {
		try {
			int i;
			for (i = 1; (is.length >> 1) + is.length >= i; i <<= 1) {
				/* empty */
			}
			anIntArray3072 = new int[i + i];
			for (int i_6_ = 0; (i + i ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
				anIntArray3072[i_6_] = -1;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_7_++) {
				int i_8_;
				for (i_8_ = is[i_7_] & -1 + i; anIntArray3072[1 + (i_8_ + i_8_)] != -1; i_8_ = i - 1 & i_8_ + 1) {
					/* empty */
				}
				anIntArray3072[i_8_ - -i_8_] = is[i_7_];
				anIntArray3072[1 + (i_8_ - -i_8_)] = i_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ud.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}
}
