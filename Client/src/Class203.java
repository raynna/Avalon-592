
/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class203 {
	static int anInt2869;
	static int anInt2870;
	private Class_fs aClass_fs2871;
	static int anInt2872;
	static int anInt2873;
	static int anInt2874;
	static int anInt2875;
	private HashMap aClass54_2876 = new HashMap(16);
	static int anInt2877 = -1;
	static Rectangle[] aRectangleArray2878;

	final void method1332(byte i) {
		try {
			if (i != 54)
				aClass_fs2871 = null;
			anInt2874++;
			synchronized (aClass54_2876) {
				aClass54_2876.method383(81);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sn.C(" + i + ')');
		}
	}

	final void method1333(int i) {
		do {
			try {
				synchronized (aClass54_2876) {
					aClass54_2876.method369(false);
				}
				anInt2870++;
				if (i == 7569)
					break;
				method1332((byte) -116);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sn.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1334(int i, int i_0_) {
		try {
			if (i == 0) {
				synchronized (aClass54_2876) {
					aClass54_2876.method380(i_0_, -50);
				}
				anInt2872++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sn.A(" + i + ',' + i_0_ + ')');
		}
	}

	final Class230 method1335(int i, int i_1_, int i_2_, int i_3_, int i_4_, Class214 class214) {
		try {
			anInt2873++;
			if (i_2_ < 108)
				return null;
			Class2[] class2s = null;
			Class153 class153 = method1336(i_1_, (byte) 71);
			if (((Class153) class153).anIntArray2211 != null) {
				class2s = new Class2[((Class153) class153).anIntArray2211.length];
				for (int i_5_ = 0; (class2s.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					Class46 class46 = class214.method1400(-8321, (((Class153) class153).anIntArray2211[i_5_]));
					class2s[i_5_] = new Class2(((Class46) class46).anInt657, ((Class46) class46).anInt661, ((Class46) class46).anInt670, ((Class46) class46).anInt665, ((Class46) class46).anInt668, ((Class46) class46).anInt671, ((Class46) class46).anInt672, ((Class46) class46).aBool673);
				}
			}
			return new Class230(((Class153) class153).anInt2209, class2s, ((Class153) class153).anInt2208, i, i_3_, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sn.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (class214 != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class153 method1336(int i, byte i_6_) {
		try {
			anInt2869++;
			Class153 class153;
			synchronized (aClass54_2876) {
				class153 = (Class153) aClass54_2876.method379((long) i, (byte) 58);
			}
			if (class153 != null)
				return class153;
			byte[] is = aClass_fs2871.method91(i, 29, 91);
			class153 = new Class153();
			if (is != null)
				class153.method1013(new BufferStream(is), -1);
			if (i_6_ <= 42)
				method1336(88, (byte) 2);
			synchronized (aClass54_2876) {
				aClass54_2876.method371(1, (long) i, class153);
			}
			return class153;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sn.E(" + i + ',' + i_6_ + ')');
		}
	}

	public static void method1337(byte i) {
		try {
			aRectangleArray2878 = null;
			int i_7_ = 107 / ((-56 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sn.B(" + i + ')');
		}
	}

	Class203(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs2871 = class_fs;
			aClass_fs2871.method95(29, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sn.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "N\u00e3o consigo alcan\u00e7ar!");
		aRectangleArray2878 = new Rectangle[100];
	}
}
