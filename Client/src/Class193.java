/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class193 {
	static int anInt2711;
	static boolean aBool2712 = true;
	static int[] anIntArray2713;
	static byte[] aByteArray2714;
	private HashMap aClass54_2715 = new HashMap(64);
	static int anInt2716;
	static int[] anIntArray2717 = new int[6];
	static float aFloat2718;
	static int anInt2719;
	static Class_fs index15;
	static int anInt2721;
	static int anInt2722;
	private Class_fs aClass_fs2723;

	public static void method1267(int i) {
		try {
			aByteArray2714 = null;
			int i_0_ = 39 / ((i + 1) / 57);
			index15 = null;
			anIntArray2713 = null;
			anIntArray2717 = null;
		} catch (RuntimeException runtimeexception) {
			throw method1272(runtimeexception, "rq.C(" + i + ')');
		}
	}

	static final void method1268(Class100 class100, int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class100) class100).anInt1298 = 0;
		for (int i_5_ = 0; i_5_ < 4; i_5_++) {
			if (((Class100) class100).aClass246_Sub41Array1301[i_5_] != null)
				((Class100) class100).anInt1298++;
		}
		while_248_: for (int i_6_ = 0; i_6_ < ((Class100) class100).anInt1298; i_6_++) {
			long l = Class255.aLongArrayArrayArray3648[i][i_1_][i_2_];
			while (l != 0L) {
				Class174 class174 = Class57.aClass174Array811[(int) ((l & 0xffffL) - 1L)];
				l >>>= 16;
				if (((Class174) class174).aClass246_Sub41_2452 == ((Class100) class100).aClass246_Sub41Array1301[i_6_])
					continue while_248_;
			}
			l = Class255.aLongArrayArrayArray3648[i][i_3_][i_4_];
			while (l != 0L) {
				Class174 class174 = Class57.aClass174Array811[(int) ((l & 0xffffL) - 1L)];
				l >>>= 16;
				if (((Class174) class174).aClass246_Sub41_2452 == ((Class100) class100).aClass246_Sub41Array1301[i_6_])
					continue while_248_;
			}
			for (int i_7_ = i_6_; i_7_ < ((Class100) class100).anInt1298 - 1; i_7_++)
				((Class100) class100).aClass246_Sub41Array1301[i_7_] = ((Class100) class100).aClass246_Sub41Array1301[i_7_ + 1];
			((Class100) class100).anInt1298--;
		}
	}

	final void method1269(byte i) {
		do {
			try {
				anInt2719++;
				synchronized (aClass54_2715) {
					aClass54_2715.method369(false);
				}
				if (i > 81)
					break;
				aFloat2718 = 0.45382535F;
			} catch (RuntimeException runtimeexception) {
				throw method1272(runtimeexception, "rq.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1270(boolean bool) {
		try {
			synchronized (aClass54_2715) {
				aClass54_2715.method383(85);
			}
			if (bool != false)
				anIntArray2713 = null;
			anInt2722++;
		} catch (RuntimeException runtimeexception) {
			throw method1272(runtimeexception, "rq.E(" + bool + ')');
		}
	}

	final void method1271(int i, int i_8_) {
		try {
			int i_9_ = 79 / ((-21 - i_8_) / 43);
			synchronized (aClass54_2715) {
				aClass54_2715.method380(i, -50);
			}
			anInt2721++;
		} catch (RuntimeException runtimeexception) {
			throw method1272(runtimeexception, "rq.A(" + i + ',' + i_8_ + ')');
		}
	}

	static final RuntimeException_Sub2 method1272(Throwable throwable, String string) {
		try {
			anInt2711++;
			RuntimeException_Sub2 runtimeexception_sub2;
			if (throwable instanceof RuntimeException_Sub2) {
				runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
				((RuntimeException_Sub2) runtimeexception_sub2).aString7149 += ' ' + (String) string;
			} else
				runtimeexception_sub2 = new RuntimeException_Sub2(throwable, string);
			return runtimeexception_sub2;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class193(Class101 class101, int i, Class_fs class_fs) {
		do {
			try {
				aClass_fs2723 = class_fs;
				if (aClass_fs2723 == null)
					break;
				aClass_fs2723.method95(35, 28724);
			} catch (RuntimeException runtimeexception) {
				throw method1272(runtimeexception, ("rq.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class84 method1273(byte i, int i_10_) {
		try {
			anInt2716++;
			Class84 class84;
			synchronized (aClass54_2715) {
				class84 = (Class84) aClass54_2715.method379((long) i_10_, (byte) 58);
			}
			if (class84 != null)
				return class84;
			byte[] is = aClass_fs2723.method91(i_10_, 35, 84);
			class84 = new Class84();
			if (is != null)
				class84.method537((byte) -78, new BufferStream(is));
			class84.method534(-64);
			if (i > -55)
				return null;
			synchronized (aClass54_2715) {
				aClass54_2715.method371(1, (long) i_10_, class84);
			}
			return class84;
		} catch (RuntimeException runtimeexception) {
			throw method1272(runtimeexception, "rq.D(" + i + ',' + i_10_ + ')');
		}
	}

	static {
		aByteArray2714 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray2713 = new int[14];
	}
}
