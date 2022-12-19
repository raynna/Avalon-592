/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
	static int anInt1831;
	static OutgoingPacket aClass201_1832 = new OutgoingPacket(53, -1);
	static boolean aBool1833 = false;

	public static void method892(int i) {
		do {
			try {
				aClass201_1832 = null;
				if (i == 53)
					break;
				method893(-37);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mf.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method893(int i) {
		try {
			Class246_Sub28_Sub11.aClass85_6164.method543(0);
			if (i < 48)
				method893(-36);
			anInt1831++;
			Class40_Sub1.aClass85_3776.method543(0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mf.B(" + i + ')');
		}
	}
}
