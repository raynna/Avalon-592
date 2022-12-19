/* Class246_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub1_Sub4 extends Class246_Sub1 {
	static String aString5748 = "";
	static IncomingPacket SEND_VAR_BYTE = new IncomingPacket(40, 3);
	static Class_fs index26;
	static int anInt5751;
	public static int anInt5752 = 0;
	static Class67 aClass67_5753 = new Class67("Allocated memory", "Zugewiesener Speicher.", "M\u00e9moire attribu\u00e9e", "Mem\u00f3ria alocada");

	public static void method2445(int i) {
		try {
			SEND_VAR_BYTE = null;
			int i_0_ = 10 % ((-44 - i) / 60);
			aString5748 = null;
			aClass67_5753 = null;
			index26 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ba.H(" + i + ')');
		}
	}

	static final int method2446(int i, int i_1_) {
		try {
			if (i != 255)
				SEND_VAR_BYTE = null;
			anInt5751++;
			return 0xff & i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ba.G(" + i + ',' + i_1_ + ')');
		}
	}

	public Class246_Sub1_Sub4() {
		/* empty */
	}
}
