
/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class177 {
	static int anInt2483;
	Class_fs aClass_fs2484;
	private Class_fs aClass_fs2485;
	static int anInt2486;
	static int anInt2487;
	static int anInt2488;
	static int anInt2489;
	static int anInt2490;
	static int anInt2491;
	private HashMap aClass54_2492 = new HashMap(64);
	static OutgoingPacket aClass201_2493 = new OutgoingPacket(15, -1);
	HashMap aClass54_2494 = new HashMap(30);
	static long aLong2495;
	static CRC32 aCRC32_2496 = new CRC32();
	int anInt2497;
	static int anInt2498 = -1;

	static final Object method1159(byte i, boolean bool, byte[] is) {
		try {
			anInt2487++;
			if (is == null)
				return null;
			if (i != 109)
				aLong2495 = 94L;
			if ((is.length ^ 0xffffffff) < -137 && !Class246_Sub28.aBool4934) {
				try {
					Class82 class82 = (Class82) Class.forName("Class82_Sub1").newInstance();
					class82.method525(i - 107, is);
					return class82;
				} catch (Throwable throwable) {
					Class246_Sub28.aBool4934 = true;
				}
			}
			if (!bool)
				return is;
			return RuntimeException_Sub2.method2922(is, 1727);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qj.C(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1160(int i, boolean bool) {
		try {
			anInt2490++;
			((Class177) this).anInt2497 = i;
			synchronized (((Class177) this).aClass54_2494) {
				((Class177) this).aClass54_2494.method369(bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.A(" + i + ',' + bool + ')');
		}
	}

	final void method1161(int i, int i_0_) {
		try {
			anInt2486++;
			synchronized (aClass54_2492) {
				aClass54_2492.method380(i, -50);
				if (i_0_ != 64)
					aCRC32_2496 = null;
			}
			synchronized (((Class177) this).aClass54_2494) {
				((Class177) this).aClass54_2494.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.H(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1162(int i) {
		try {
			synchronized (aClass54_2492) {
				aClass54_2492.method383(100);
			}
			anInt2483++;
			synchronized (((Class177) this).aClass54_2494) {
				((Class177) this).aClass54_2494.method383(101);
			}
			if (i != 64)
				method1165((byte) 73, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.B(" + i + ')');
		}
	}

	public static void method1163(byte i) {
		try {
			if (i == 109) {
				aCRC32_2496 = null;
				aClass201_2493 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.G(" + i + ')');
		}
	}

	final Class144 method1164(int i, int i_1_) {
		try {
			if (i != -137)
				method1165((byte) 123, true);
			anInt2489++;
			Class144 class144;
			synchronized (aClass54_2492) {
				class144 = (Class144) aClass54_2492.method379((long) i_1_, (byte) 58);
			}
			if (class144 != null)
				return class144;
			byte[] is = aClass_fs2485.method91(BufferStream.method2393(i_1_, (byte) 80), Class_m.method749(79, i_1_), 127);
			class144 = new Class144();
			((Class144) class144).anInt2095 = i_1_;
			((Class144) class144).aClass177_2077 = this;
			if (is != null)
				class144.method966((byte) 3, new BufferStream(is));
			synchronized (aClass54_2492) {
				aClass54_2492.method371(i ^ ~0x89, (long) i_1_, class144);
			}
			return class144;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.D(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method1165(byte i, boolean bool) {
		try {
			if (i <= -7) {
				Class221.method1433(-1, bool, Class162.anInt2300, Class183.anInt2549, Class246_Sub41_Sub1.anInt6171);
				anInt2491++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.E(" + i + ',' + bool + ')');
		}
	}

	final void method1166(boolean bool) {
		try {
			anInt2488++;
			synchronized (aClass54_2492) {
				if (bool != true)
					aLong2495 = -36L;
				aClass54_2492.method369(false);
			}
			synchronized (((Class177) this).aClass54_2494) {
				((Class177) this).aClass54_2494.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qj.F(" + bool + ')');
		}
	}

	Class177(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_2_) {
		try {
			aClass_fs2485 = class_fs;
			((Class177) this).aClass_fs2484 = class_fs_2_;
			int i_3_ = -1 + aClass_fs2485.method87((byte) 39);
			aClass_fs2485.method95(i_3_, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qj.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_2_ != null ? "{...}" : "null") + ')'));
		}
	}
}
