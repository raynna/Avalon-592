/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class35 {
	int anInt455;
	byte[] aByteArray456;
	boolean[] aBoolArray457 = new boolean[256];
	int anInt458;
	int anInt459;
	byte[] aByteArray460;
	boolean[] aBoolArray461;
	byte[] aByteArray462 = new byte[18002];
	static short aShort463 = 320;
	int anInt464;
	int anInt465;
	int anInt466;
	int[][] anIntArrayArray467;
	static Class67 aClass67_468;
	byte[][] aByteArrayArray469;
	int anInt470;
	static int anInt471;
	byte aByte472;
	int[] anIntArray473;
	int anInt474;
	int anInt475;
	int anInt476;
	int[] anIntArray477;
	byte[] aByteArray478;
	int anInt479;
	int[][] anIntArrayArray480;
	static int[] anIntArray481 = new int[5];
	int anInt482;
	int[][] anIntArrayArray483;
	int anInt484;
	int anInt485;
	byte[] aByteArray486;
	byte[] aByteArray487;
	int[] anIntArray488;
	int[] anIntArray489;
	int anInt490;

	public static void method250(byte i) {
		do {
			try {
				anIntArray481 = null;
				aClass67_468 = null;
				if (i >= 17)
					break;
				method250((byte) -42);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cu.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class21_Sub2 method251(int i, BufferStream stream) {
		try {
			if (i != 18002)
				method251(-52, null);
			anInt471++;
			return new Class21_Sub2(stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.read24BitInteger((byte) 29), stream.readUnsignedByte(i - 17747));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cu.B(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	Class35() {
		((Class35) this).aBoolArray461 = new boolean[16];
		((Class35) this).anInt466 = 0;
		((Class35) this).anInt474 = 0;
		((Class35) this).anIntArray473 = new int[6];
		((Class35) this).anIntArrayArray467 = new int[6][258];
		((Class35) this).anIntArrayArray480 = new int[6][258];
		((Class35) this).anIntArray477 = new int[257];
		((Class35) this).anIntArrayArray483 = new int[6][258];
		((Class35) this).aByteArray456 = new byte[18002];
		((Class35) this).aByteArrayArray469 = new byte[6][258];
		((Class35) this).aByteArray486 = new byte[256];
		((Class35) this).anIntArray489 = new int[256];
		((Class35) this).aByteArray460 = new byte[4096];
		((Class35) this).anIntArray488 = new int[16];
	}

	static {
		aClass67_468 = new Class67("Loaded client variable data", "Client-Variablen geladen", "Variables du client charg\u00e9es", "As vari\u00e1veis do sistema foram carregadas");
	}
}
