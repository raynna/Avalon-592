/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178 {
	int[] anIntArray2499;
	static int anInt2500 = -60;
	static long aLong2501 = 0L;
	static int anInt2502;
	static int anInt2503;
	int anInt2504;
	int[] anIntArray2505;

	static final Class78 method1167(boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt2502++;
			try {
				return (Class78) Class.forName("Class78_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qk.A(" + bool + ')');
		}
	}

	static final int method1168(int i, byte i_0_, int i_1_) {
		try {
			anInt2503++;
			if (i_1_ == 4 || i_1_ == 5)
				return Class234.anIntArray3191[i & 0x3];
			if (i_0_ != 58)
				method1167(false);
			return 256;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qk.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class178(int i) {
		try {
			((Class178) this).anInt2504 = i;
			((Class178) this).anIntArray2499 = new int[((Class178) this).anInt2504];
			((Class178) this).anIntArray2505 = new int[((Class178) this).anInt2504];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qk.<init>(" + i + ')');
		}
	}
}
