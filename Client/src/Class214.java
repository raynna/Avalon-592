
/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class214 {
	static Class_fs index18;
	static String[] aStringArray2986;
	static int anInt2987;
	static int anInt2988;
	private Class_fs aClass_fs2989;
	static Class_fs aClass_fs2990;
	static int anInt2991 = 0;
	static Font aFont2992;
	static int anInt2993 = 2;
	private HashMap aClass54_2994 = new HashMap(16);
	static int anInt2995;
	static int anInt2996;
	static int anInt2997;

	final void method1395(byte i) {
		try {
			if (i > 21) {
				anInt2997++;
				synchronized (aClass54_2994) {
					aClass54_2994.method369(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tf.A(" + i + ')');
		}
	}

	public static void method1396(int i) {
		do {
			try {
				aStringArray2986 = null;
				index18 = null;
				aClass_fs2990 = null;
				aFont2992 = null;
				if (i < -45)
					break;
				anInt2988 = 33;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tf.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1397(int i) {
		try {
			if (i != 2)
				anInt2991 = 80;
			anInt2996++;
			synchronized (aClass54_2994) {
				aClass54_2994.method383(i ^ 0x7a);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tf.D(" + i + ')');
		}
	}

	static final Class59_Sub2 method1398(int i, int i_0_, int i_1_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_0_][i_1_];
		if (class147 == null)
			return null;
		return ((Class147) class147).aClass59_Sub2_2159;
	}

	final void method1399(byte i, int i_2_) {
		do {
			try {
				synchronized (aClass54_2994) {
					aClass54_2994.method380(i_2_, -50);
				}
				anInt2987++;
				if (i == 37)
					break;
				anInt2988 = 54;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tf.B(" + i + ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	final Class46 method1400(int i, int i_3_) {
		try {
			anInt2995++;
			Class46 class46;
			synchronized (aClass54_2994) {
				class46 = (Class46) aClass54_2994.method379((long) i_3_, (byte) 58);
			}
			if (i != -8321)
				return null;
			if (class46 != null)
				return class46;
			byte[] is = aClass_fs2989.method91(i_3_, 30, 120);
			class46 = new Class46();
			if (is != null)
				class46.method309(new BufferStream(is), (byte) -19);
			synchronized (aClass54_2994) {
				aClass54_2994.method371(1, (long) i_3_, class46);
			}
			return class46;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tf.E(" + i + ',' + i_3_ + ')');
		}
	}

	Class214(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs2989 = class_fs;
			aClass_fs2989.method95(30, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tf.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aStringArray2986 = new String[5];
	}
}
