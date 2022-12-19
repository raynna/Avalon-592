/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189 {
	private HashMap aClass54_2663 = new HashMap(64);
	static int anInt2664;
	static int anInt2665;
	static Class97 aClass97_2666 = new Class97("RC", 1);
	static int anInt2667;
	static int anInt2668;
	static byte[][] aByteArrayArray2669;
	static int anInt2670;
	static int anInt2671 = 0;
	private Class_fs aClass_fs2672;
	static int[] anIntArray2673 = { 0, -1, 0, 1 };
	static int[] anIntArray2674;

	final void method1238(int i) {
		try {
			anInt2668++;
			synchronized (aClass54_2663) {
				aClass54_2663.method369(false);
				if (i != 64)
					method1242((byte) -49, 14);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rl.B(" + i + ')');
		}
	}

	final void method1239(boolean bool) {
		do {
			try {
				synchronized (aClass54_2663) {
					aClass54_2663.method383(88);
				}
				anInt2667++;
				if (bool == true)
					break;
				aClass_fs2672 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rl.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method1240(byte i) {
		try {
			aByteArrayArray2669 = null;
			anIntArray2673 = null;
			if (i > -7)
				anIntArray2673 = null;
			aClass97_2666 = null;
			anIntArray2674 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rl.E(" + i + ')');
		}
	}

	static final long method1241(byte i, int i_0_, Class_f class_f, int i_1_) {
		try {
			anInt2664++;
			long l = 4194304L;
			long l_2_ = 2147483648L;
			long l_3_ = -9223372036854775808L;
			Class185 class185 = Class143.aClass251_2067.method1610(class_f.method21(true), 0);
			long l_4_ = (long) (0x40000000 | (i_1_ << 7 | i_0_ | class_f.method24(118) << 14 | class_f.method18((byte) -70) << 20));
			if (((Class185) class185).anInt2590 == 0)
				l_4_ |= l_3_;
			if (((Class185) class185).anInt2598 == 1)
				l_4_ |= l;
			if (i <= 11)
				method1241((byte) 127, -81, null, -45);
			if (((Class185) class185).aBool2601)
				l_4_ |= l_2_;
			l_4_ |= (long) class_f.method21(true) << 32;
			return l_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rl.F(" + i + ',' + i_0_ + ',' + (class_f != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final void method1242(byte i, int i_5_) {
		try {
			synchronized (aClass54_2663) {
				if (i >= -123)
					return;
				aClass54_2663.method380(i_5_, -50);
			}
			anInt2670++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rl.D(" + i + ',' + i_5_ + ')');
		}
	}

	final Class173 method1243(int i, int i_6_) {
		try {
			anInt2665++;
			if (i_6_ <= 54)
				method1241((byte) 12, 34, null, -37);
			Class173 class173;
			synchronized (aClass54_2663) {
				class173 = (Class173) aClass54_2663.method379((long) i, (byte) 58);
			}
			if (class173 != null)
				return class173;
			byte[] is = aClass_fs2672.method91(i, 31, 122);
			class173 = new Class173();
			if (is != null)
				class173.method1138(false, new BufferStream(is));
			synchronized (aClass54_2663) {
				aClass54_2663.method371(1, (long) i, class173);
			}
			return class173;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rl.C(" + i + ',' + i_6_ + ')');
		}
	}

	Class189(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs2672 = class_fs;
			aClass_fs2672.method95(31, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rl.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
