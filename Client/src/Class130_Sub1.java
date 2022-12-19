/* Class130_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class130_Sub1 extends Class130 {
	static int anInt3728;
	static IncomingPacket aClass13_3729;
	static int[] anIntArray3730 = new int[100];
	Class130_Sub1 aClass130_Sub1_3731;
	Class130_Sub1 aClass130_Sub1_3732;
	static Class67 aClass67_3733;
	static Stream_Sub1 stream;
	static int anInt3735;

	final void method1754(int i) {
		try {
			anInt3728++;
			if (i != 10009)
				((Class130_Sub1) this).aClass130_Sub1_3732 = null;
			if (((Class130_Sub1) this).aClass130_Sub1_3731 != null) {
				((Class130_Sub1) ((Class130_Sub1) this).aClass130_Sub1_3731).aClass130_Sub1_3732 = ((Class130_Sub1) this).aClass130_Sub1_3732;
				((Class130_Sub1) ((Class130_Sub1) this).aClass130_Sub1_3732).aClass130_Sub1_3731 = ((Class130_Sub1) this).aClass130_Sub1_3731;
				((Class130_Sub1) this).aClass130_Sub1_3732 = null;
				((Class130_Sub1) this).aClass130_Sub1_3731 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ab.G(" + i + ')');
		}
	}

	public static void method1755(byte i) {
		try {
			stream = null;
			if (i == -32) {
				anIntArray3730 = null;
				aClass67_3733 = null;
				aClass13_3729 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ab.F(" + i + ')');
		}
	}

	public Class130_Sub1() {
		/* empty */
	}

	static {
		aClass13_3729 = new IncomingPacket(5, 8);
		aClass67_3733 = new Class67("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
		stream = new Stream_Sub1(5000);
	}
}
