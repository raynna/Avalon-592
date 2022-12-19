/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120 {
	static Class88 aClass88_1648 = Class246_Sub1_Sub15_Sub2.method2898((byte) -88);
	static int[] anIntArray1649;
	static OutgoingPacket aClass201_1650;
	static OutgoingPacket GROUND_ITEM_EXAMINE_PACKET;
	static int[] anIntArray1652;

	public static void method820(byte i) {
		do {
			try {
				GROUND_ITEM_EXAMINE_PACKET = null;
				aClass88_1648 = null;
				anIntArray1649 = null;
				anIntArray1652 = null;
				aClass201_1650 = null;
				if (i == -63)
					break;
				method820((byte) -86);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lj.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		new Class67("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de la connexion au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.", "Erro ao entrar no canal do cl\u00e3. Tente de novo depois!");
		aClass201_1650 = new OutgoingPacket(21, -1);
		anIntArray1652 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		GROUND_ITEM_EXAMINE_PACKET = new OutgoingPacket(1, 2);
	}
}
