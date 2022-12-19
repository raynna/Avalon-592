/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108 {
	static Class166 aClass166_1525 = new Class166();
	int anInt1526;
	int anInt1527;
	static int anInt1528;
	static int anInt1529;
	static int anInt1530;
	int anInt1531;
	static int[] anIntArray1532;
	static String[] aStringArray1533;
	static int anInt1534;
	static Signlink aClass52_1535;
	static float[] aFloatArray1536;

	final void method745(BufferStream stream, byte i) {
		do {
			try {
				anInt1529++;
				for (;;) {
					int i_0_ = stream.readUnsignedByte(i ^ ~0xe7);
					if ((i_0_ ^ 0xffffffff) == -1)
						break;
					method748(i_0_, stream, 15902);
				}
				if (i == -25)
					break;
				aStringArray1533 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ki.B(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final Class63_Sub1 method746(int i, byte i_1_) {
		try {
			anInt1530++;
			int i_2_ = 91 / ((-85 - i_1_) / 36);
			if (!Class194_Sub1.aBool4139 || i < Class_u.anInt4702 || i > Class246_Sub19_Sub2.anInt6810)
				return null;
			return Class230.aClass63_Sub1Array3154[i - Class_u.anInt4702];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ki.A(" + i + ',' + i_1_ + ')');
		}
	}

	public static void method747(int i) {
		try {
			aFloatArray1536 = null;
			if (i == 1) {
				anIntArray1532 = null;
				aStringArray1533 = null;
				aClass166_1525 = null;
				aClass52_1535 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ki.C(" + i + ')');
		}
	}

	public Class108() {
		/* empty */
	}

	private final void method748(int i, BufferStream stream, int i_3_) {
		do {
			try {
				if (i == 1) {
					((Class108) this).anInt1526 = stream.readUnsignedShort((byte) -91);
					((Class108) this).anInt1531 = stream.readUnsignedByte(255);
					((Class108) this).anInt1527 = stream.readUnsignedByte(255);
				}
				anInt1528++;
				if (i_3_ == 15902)
					break;
				anInt1534 = -77;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ki.D(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		new Class67("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.", "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.", "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
		anIntArray1532 = new int[99];
		int i = 0;
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -100; i_4_++) {
			int i_5_ = 1 + i_4_;
			int i_6_ = (int) ((double) i_5_ + 300.0 * Math.pow(2.0, (double) i_5_ / 7.0));
			i += i_6_;
			anIntArray1532[i_4_] = i / 4;
		}
		aFloatArray1536 = new float[4];
	}
}
