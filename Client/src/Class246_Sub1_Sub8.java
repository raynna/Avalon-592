/* Class246_Sub1_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub1_Sub8 extends Class246_Sub1 {
	static int[] anIntArray6104;
	static byte[][] aByteArrayArray6105 = new byte[250][];
	int anInt6106;
	static byte[] aByteArray6107;

	abstract boolean method2566(byte i);

	public static void method2567(int i) {
		try {
			aByteArrayArray6105 = null;
			if (i != 2048)
				anIntArray6104 = null;
			aByteArray6107 = null;
			anIntArray6104 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fq.C(" + i + ')');
		}
	}

	abstract Object method2568(int i);

	Class246_Sub1_Sub8(int i) {
		try {
			((Class246_Sub1_Sub8) this).anInt6106 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fq.<init>(" + i + ')');
		}
	}

	static {
		anIntArray6104 = new int[8];
		aByteArray6107 = new byte[2048];
	}
}
