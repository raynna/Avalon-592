/* Class246_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub31 extends Node {
	static Class67 aClass67_5032;
	static int anInt5033;
	static int anInt5034 = -2;
	String aString5035;
	static IncomingPacket SOME_PACKET_2;
	static int anInt5037;
	static Class203 aClass203_5038;

	static final boolean method2162(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ <= 22)
				SOME_PACKET_2 = null;
			anInt5033++;
			if (!Class59_Sub2_Sub2.method2545(i_0_, i, (byte) -108) && !Class6.method71(-20147, i_0_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ou.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2163(int i) {
		try {
			aClass67_5032 = null;
			SOME_PACKET_2 = null;
			if (i <= 125)
				SOME_PACKET_2 = null;
			aClass203_5038 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ou.B(" + i + ')');
		}
	}

	public Class246_Sub31() {
		/* empty */
	}

	Class246_Sub31(String string, int i) {
		try {
			((Class246_Sub31) this).aString5035 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ou.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass67_5032 = new Class67("Opened title screen", "Titelbild ge\u00f6ffnet.", "\u00c9cran-titre ouvert", "Tela t\u00edtulo aberta");
		anInt5037 = 0;
		SOME_PACKET_2 = new IncomingPacket(34, 16);
	}
}
