/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101 {
	static int anInt1308;
	static int anInt1309;
	int anInt1310;
	static int anInt1311;
	static IncomingPacket SEND_VAR_INT;
	static int anInt1313;
	static int anInt1314;
	String aString1315;
	static int anInt1316;
	static int[] anIntArray1317;

	public static void method631(int i) {
		try {
			SEND_VAR_INT = null;
			if (i == -7325)
				anIntArray1317 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jk.B(" + i + ')');
		}
	}

	public final String toString() {
		try {
			anInt1314++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jk.toString(" + ')');
		}
	}

	static final void decodePlayerUpdate(Stream_Sub1 stream_sub1, int i, int i_0_) {
		try {
			Class257.aBool3685 = false;
			if (i >= -114)
				anInt1309 = -85;
			Class252.anInt3567 = 0;
			anInt1316++;
			Class246_Sub28_Sub1.decodeGlobalPlayerUpdate(stream_sub1, 0);
			Class94.decodePlayerMasks(stream_sub1, (byte) -128);
			if (Class257.aBool3685)
				System.out.println("---endgpp---");
			if ((i_0_ ^ 0xffffffff) != (((BufferStream) stream_sub1).position ^ 0xffffffff))
				throw new RuntimeException("gpi1 pos:" + ((BufferStream) stream_sub1).position + " psize:" + i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jk.A(" + (stream_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	Class101(String string, int i) {
		try {
			((Class101) this).aString1315 = string;
			((Class101) this).anInt1310 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jk.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		new Class67("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
		anInt1313 = 0;
		SEND_VAR_INT = new IncomingPacket(79, 6);
	}
}
