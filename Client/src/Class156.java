/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class156 {
	static int anInt2231;
	static int anInt2232;
	private Class_fs aClass_fs2233;
	private HashMap aClass54_2234 = new HashMap(64);
	static int anInt2235;
	static Class86[] aClass86Array2236;
	static int anInt2237;
	static IncomingPacket aClass13_2238 = new IncomingPacket(56, 4);
	Class_fs aClass_fs2239;
	static int anInt2240;
	static int anInt2241;
	HashMap aClass54_2242 = new HashMap(2);
	static IncomingPacket aClass13_2243 = new IncomingPacket(51, 14);
	static float aFloat2244;

	final Class60 method1032(int i, int i_0_) {
		try {
			anInt2240++;
			Class60 class60;
			synchronized (aClass54_2234) {
				class60 = (Class60) aClass54_2234.method379((long) i, (byte) 58);
			}
			if (class60 != null)
				return class60;
			int i_1_ = -100 % ((-62 - i_0_) / 37);
			byte[] is = aClass_fs2233.method91(i, 33, 87);
			class60 = new Class60();
			((Class60) class60).aClass156_828 = this;
			if (is != null)
				class60.method410(new BufferStream(is), 27223);
			synchronized (aClass54_2234) {
				aClass54_2234.method371(1, (long) i, class60);
			}
			return class60;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ok.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1033(boolean bool) {
		try {
			synchronized (aClass54_2234) {
				aClass54_2234.method369(false);
			}
			if (bool != true)
				method1036(51, 124);
			anInt2235++;
			synchronized (((Class156) this).aClass54_2242) {
				((Class156) this).aClass54_2242.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ok.D(" + bool + ')');
		}
	}

	final void method1034(int i) {
		try {
			synchronized (aClass54_2234) {
				if (i != 64)
					aClass86Array2236 = null;
				aClass54_2234.method383(73);
			}
			anInt2231++;
			synchronized (((Class156) this).aClass54_2242) {
				((Class156) this).aClass54_2242.method383(96);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ok.A(" + i + ')');
		}
	}

	static final void method1035(byte i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (i_2_ < i_3_) {
				for (int i_6_ = i_2_; (i_3_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
					Class246_Sub28_Sub6.anIntArrayArray6042[i_6_][i_4_] = i_5_;
			} else {
				for (int i_7_ = i_3_; (i_2_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
					Class246_Sub28_Sub6.anIntArrayArray6042[i_7_][i_4_] = i_5_;
			}
			if (i == -17)
				anInt2241++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ok.F(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method1036(int i, int i_8_) {
		try {
			synchronized (aClass54_2234) {
				aClass54_2234.method380(i, i_8_ + 24555);
			}
			anInt2237++;
			synchronized (((Class156) this).aClass54_2242) {
				((Class156) this).aClass54_2242.method380(i, -50);
			}
			if (i_8_ != -24605)
				((Class156) this).aClass_fs2239 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ok.B(" + i + ',' + i_8_ + ')');
		}
	}

	public static void method1037(int i) {
		try {
			if (i == 56) {
				aClass86Array2236 = null;
				aClass13_2243 = null;
				aClass13_2238 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ok.C(" + i + ')');
		}
	}

	Class156(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_9_) {
		try {
			((Class156) this).aClass_fs2239 = class_fs_9_;
			aClass_fs2233 = class_fs;
			aClass_fs2233.method95(33, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ok.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_9_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67("Changes will take effect on your clan in the next 60 seconds.", "Die \u00c4nderungen am Chatraum werden innerhalb von 60 Sekunden g\u00fcltig.", "Les modifications seront apport\u00e9es \u00e0 votre clan dans les prochaines 60 secondes.", "As altera\u00e7\u00f5es passar\u00e3o a valer no seu cl\u00e3 nos pr\u00f3ximos 60 segundos.");
	}
}
