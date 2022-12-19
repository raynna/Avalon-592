/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class82 {
	static IncomingPacket aClass13_1070 = new IncomingPacket(78, 2);
	static BufferStream aStream1071 = new BufferStream(new byte[5000]);
	static Class105 aClass105_1072;
	static Class67 aClass67_1073 = new Class67("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
	static Class_fs index25;
	static int baseTileX;
	static int[] anIntArray1076 = new int[13];

	abstract byte[] method523(int i, int i_0_, int i_1_);

	abstract byte[] method524(byte i);

	abstract void method525(int i, byte[] is);

	public static void method526(int i) {
		try {
			aClass67_1073 = null;
			aClass105_1072 = null;
			aStream1071 = null;
			if (i != 13)
				aClass105_1072 = null;
			index25 = null;
			anIntArray1076 = null;
			aClass13_1070 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hq.D(" + i + ')');
		}
	}
}
