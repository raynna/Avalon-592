/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class16 {
	static int anInt234;
	static IncomingPacket aClass13_235;
	static int anInt236;
	private Class85 aClass85_237;
	static Class12 aClass12_238 = new Class12(6, 4);
	static Class246_Sub1_Sub17[] aClass246_Sub1_Sub17Array239 = new Class246_Sub1_Sub17[14];
	private Node aClass246_240;
	private int anInt241 = 0;

	final Node method160(boolean bool) {
		try {
			anInt234++;
			if (bool != true)
				method160(true);
			if ((anInt241 ^ 0xffffffff) < -1 && aClass246_240 != (((Class85) aClass85_237).aClass246Array1118[anInt241 - 1])) {
				Node class246 = aClass246_240;
				aClass246_240 = ((Node) class246).next;
				return class246;
			}
			while (anInt241 < ((Class85) aClass85_237).anInt1115) {
				Node class246 = (((Node) (((Class85) aClass85_237).aClass246Array1118[anInt241++])).next);
				if (((Class85) aClass85_237).aClass246Array1118[-1 + anInt241] != class246) {
					aClass246_240 = ((Node) class246).next;
					return class246;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bo.B(" + bool + ')');
		}
	}

	final Node method161(int i) {
		try {
			anInt241 = 0;
			if (i != 4)
				return null;
			anInt236++;
			return method160(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bo.C(" + i + ')');
		}
	}

	public static void method162(int i) {
		try {
			aClass12_238 = null;
			aClass13_235 = null;
			aClass246_Sub1_Sub17Array239 = null;
			int i_0_ = 35 / ((-31 - i) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bo.A(" + i + ')');
		}
	}

	Class16(Class85 class85) {
		try {
			aClass85_237 = class85;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bo.<init>(" + (class85 != null ? "{...}" : "null") + ')');
		}
	}
}
