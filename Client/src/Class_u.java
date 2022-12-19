/* Class_u - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_u extends Node {
	static IncomingPacket aClass13_4700;
	static Class211 aClass211_4701;
	static int anInt4702;
	static boolean aBool4703 = false;

	public Class_u() {
		/* empty */
	}

	public static void method2063(boolean bool) {
		try {
			aClass211_4701 = null;
			if (bool != true)
				method2063(true);
			aClass13_4700 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "u.D(" + bool + ')');
		}
	}

	static {
		aClass13_4700 = new IncomingPacket(64, 10);
	}
}
