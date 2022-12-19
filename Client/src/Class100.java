/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class100 {
	Class59_Sub3[] aClass59_Sub3Array1295 = new Class59_Sub3[100];
	static int anInt1296;
	static int anInt1297;
	int anInt1298;
	int[] anIntArray1299 = new int[100];
	static Class67 aClass67_1300;
	Class246_Sub41[] aClass246_Sub41Array1301;
	static int anInt1302;
	static int anInt1303 = 0;
	int[] anIntArray1304 = new int[3];
	static int anInt1305;
	static int anInt1306;
	Object anObject1307;

	static final void method629(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		try {
			Class130_Sub8.aLong5616 = 0L;
			anInt1305++;
			if (bool_2_ != false)
				anInt1306 = -128;
			int i_3_ = Class258.method1673((byte) -123);
			if (i == 3 || (i_3_ ^ 0xffffffff) == -4)
				bool = true;
			if (!Class246_Sub15.aClass260_4445.method1686())
				bool = true;
			Class246_Sub29.method2150(i, i_3_, (byte) -45, i_1_, bool, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jj.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + bool + ',' + bool_2_ + ')'));
		}
	}

	public static void method630(byte i) {
		do {
			try {
				aClass67_1300 = null;
				if (i == 123)
					break;
				anInt1306 = -54;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jj.H(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class100() {
		((Class100) this).aClass246_Sub41Array1301 = new Class246_Sub41[8];
	}

	static {
		aClass67_1300 = new Class67(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est d\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
	}
}
