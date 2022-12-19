/* Class_v - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_v {
	static int anInt1443;
	static int anInt1444;
	static int anInt1445;
	static int anInt1446;
	static Class67 aClass67_1447 = new Class67("white:", "weiss:", "blanc:", "branco:");
	static int anInt1448;
	private Class_fs aClass_fs1449;
	private HashMap aClass54_1450 = new HashMap(64);
	static boolean aBool1451 = false;
	static boolean aBool1452 = false;
	static float aFloat1453;

	final void method691(byte i, int i_0_) {
		try {
			synchronized (aClass54_1450) {
				if (i != -51)
					aFloat1453 = 0.2750447F;
				aClass54_1450.method380(i_0_, -50);
			}
			anInt1443++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method692(byte i, String string) {
		try {
			Class67.method437(0, 0, string, "", "", true);
			if (i != -99)
				aClass67_1447 = null;
			anInt1445++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("v.F(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method693(int i) {
		try {
			if (i > -22)
				method695(-71);
			synchronized (aClass54_1450) {
				aClass54_1450.method383(91);
			}
			anInt1446++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.B(" + i + ')');
		}
	}

	final Class135 method694(boolean bool, int i) {
		try {
			anInt1448++;
			Class135 class135;
			synchronized (aClass54_1450) {
				class135 = (Class135) aClass54_1450.method379((long) i, (byte) 58);
			}
			if (class135 != null)
				return class135;
			if (bool != false)
				method694(true, 93);
			byte[] is = aClass_fs1449.method91(i, 32, 93);
			class135 = new Class135();
			if (is != null)
				class135.method916(65535, new BufferStream(is));
			synchronized (aClass54_1450) {
				aClass54_1450.method371(1, (long) i, class135);
			}
			return class135;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.A(" + bool + ',' + i + ')');
		}
	}

	public static void method695(int i) {
		try {
			if (i != -25819)
				aClass67_1447 = null;
			aClass67_1447 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.D(" + i + ')');
		}
	}

	final void method696(int i) {
		try {
			synchronized (aClass54_1450) {
				if (i > -51)
					return;
				aClass54_1450.method369(false);
			}
			anInt1444++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "v.E(" + i + ')');
		}
	}

	Class_v(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs1449 = class_fs;
			aClass_fs1449.method95(32, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("v.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
