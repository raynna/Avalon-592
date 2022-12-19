/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
	static Class166 aClass166_2195;
	static Class235 aClass235_2196;
	static int anInt2197;
	static int anInt2198 = 1405;

	static final Class63_Sub1 method1007(int i) {
		try {
			anInt2197++;
			if (i != 1405)
				method1007(-71);
			if (Class220.aClass63_Sub1Array3056.length > Class187.anInt2652)
				return Class220.aClass63_Sub1Array3056[Class187.anInt2652++];
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oe.B(" + i + ')');
		}
	}

	public static void method1008(int i) {
		try {
			aClass166_2195 = null;
			if (i < -110)
				aClass235_2196 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oe.A(" + i + ')');
		}
	}

	static {
		aClass235_2196 = null;
		aClass166_2195 = new Class166();
	}
}
