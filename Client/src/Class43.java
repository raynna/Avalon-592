/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
	static Class246_Sub27 aClass246_Sub27_635 = new Class246_Sub27(0, -1);
	static int anInt636;
	static IncomingPacket aClass13_637 = new IncomingPacket(71, 6);
	static Class87 aClass87_638;
	static int anInt639;

	static final void method294(byte i) {
		do {
			try {
				anInt639++;
				Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(0, (byte) 123, 15);
				class246_sub1_sub10.method2604((byte) -125);
				if (i == -31)
					break;
				aClass246_Sub27_635 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dq.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method295(int i) {
		try {
			if (i != 0)
				aClass87_638 = null;
			aClass87_638 = null;
			aClass13_637 = null;
			aClass246_Sub27_635 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dq.A(" + i + ')');
		}
	}

	static {
		new Class67("The channel you tried to join does not exist.", "Der von dir gew\u00fcnschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
		aClass87_638 = new Class87(1);
	}
}
