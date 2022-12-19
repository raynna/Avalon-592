/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class97 {
	static Class166 aClass166_1260 = new Class166();
	int anInt1261;
	static int anInt1262;
	static int anInt1263;
	static int anInt1264;

	Class97(String string, int i) {
		try {
			((Class97) this).anInt1261 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jc.<init>(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final String toString() {
		try {
			anInt1263++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jc.toString(" + ')');
		}
	}

	final int method616(boolean bool) {
		try {
			if (bool != false)
				toString();
			anInt1262++;
			return ((Class97) this).anInt1261;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jc.B(" + bool + ')');
		}
	}

	public static void method617(int i) {
		try {
			if (i != -15098)
				method617(-69);
			aClass166_1260 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jc.A(" + i + ')');
		}
	}
}
