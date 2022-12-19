/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class93 {
	static int anInt1220;
	static IncomingPacket aClass13_1221;
	static int anInt1222;
	int anInt1223 = 0;
	static boolean aBool1224 = false;
	static int anInt1225;
	static int anInt1226;
	static int[] anIntArray1227;
	static int anInt1228;
	static HashMap aClass54_1229;

	static final void method596(int i, int i_0_, int i_1_) {
		boolean bool = (Class106.aClass147ArrayArrayArray1494[0][i_0_][i_1_] != null && ((Class147) (Class106.aClass147ArrayArrayArray1494[0][i_0_][i_1_])).aClass147_2165 != null);
		for (int i_2_ = i; i_2_ >= 0; i_2_--) {
			if (Class106.aClass147ArrayArrayArray1494[i_2_][i_0_][i_1_] == null) {
				Class147 class147 = (Class106.aClass147ArrayArrayArray1494[i_2_][i_0_][i_1_] = new Class147(i_2_, i_0_, i_1_));
				if (bool)
					((Class147) class147).aByte2174++;
			}
		}
	}

	final void method597(BufferStream stream, boolean bool) {
		try {
			if (bool != true)
				method598(null, 61, -27);
			for (;;) {
				int i = stream.readUnsignedByte(255);
				if ((i ^ 0xffffffff) == -1)
					break;
				method598(stream, i, -75);
			}
			anInt1222++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iq.D(" + (stream != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	private final void method598(BufferStream stream, int i, int i_3_) {
		try {
			if ((i ^ 0xffffffff) == -6)
				((Class93) this).anInt1223 = stream.readUnsignedShort((byte) -106);
			anInt1220++;
			int i_4_ = -22 / ((i_3_ - 41) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iq.C(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')'));
		}
	}

	static int method599(int i, int i_5_) {
		try {
			return i ^ i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iq.B(" + i + ',' + i_5_ + ')');
		}
	}

	public static void method600(int i) {
		do {
			try {
				anIntArray1227 = null;
				aClass13_1221 = null;
				aClass54_1229 = null;
				if (i == 13815)
					break;
				aBool1224 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iq.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class93() {
		/* empty */
	}

	static {
		aClass13_1221 = new IncomingPacket(46, -1);
		anInt1225 = 12;
		anIntArray1227 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
		anInt1228 = 0;
		aClass54_1229 = new HashMap(10);
	}
}
