
/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.net.InetAddress;

final class Class243 implements Runnable {
	private Class166 aClass166_3438 = new Class166();
	static int anInt3439;
	static int anInt3440;
	private Thread aThread3441;
	static int anInt3442;
	static int anInt3443;
	static long[] aLongArray3444;
	static int anInt3445;
	static int[] anIntArray3446 = new int[1000];
	static int anInt3447;
	static Class_l[] aClass_lArray3448;

	final void method1564(int i) {
		try {
			anInt3440++;
			if (aThread3441 != null) {
				method1566(i + 22509, new Node());
				try {
					aThread3441.join();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				if (i != -21509)
					method1564(24);
				aThread3441 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vo.B(" + i + ')');
		}
	}

	static final void writePacket(int i, OutgoingPacket class201) {
		try {
			anInt3442++;
			if (i > -48)
				writePacket(-14, null);
			Class130_Sub1.stream.method2474(class201.method1327(2), 13127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vo.F(" + i + ',' + (class201 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1566(int i, Node class246) {
		try {
			anInt3443++;
			if (i == 1000) {
				synchronized (aClass166_3438) {
					aClass166_3438.method1101(false, class246);
					aClass166_3438.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vo.C(" + i + ',' + (class246 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1567(int i, int i_0_) {
		try {
			synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
				Class246_Sub1_Sub6_Sub2.aClass54_7109.method380(i_0_, -50);
			}
			if (i <= 11)
				anIntArray3446 = null;
			anInt3439++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vo.D(" + i + ',' + i_0_ + ')');
		}
	}

	final Class246_Sub39 method1568(int i, String string) {
		try {
			anInt3447++;
			if (aThread3441 == null)
				throw new IllegalStateException("");
			if (string == null)
				throw new IllegalArgumentException("");
			Class246_Sub39 class246_sub39 = new Class246_Sub39(string);
			if (i <= 64)
				anIntArray3446 = null;
			method1566(1000, class246_sub39);
			return class246_sub39;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vo.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1569(byte i) {
		try {
			if (i > 82) {
				anIntArray3446 = null;
				aLongArray3444 = null;
				aClass_lArray3448 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vo.A(" + i + ')');
		}
	}

	public final void run() {
		try {
			anInt3445++;
			for (;;) {
				Class246_Sub39 class246_sub39;
				synchronized (aClass166_3438) {
					Node class246;
					for (class246 = aClass166_3438.method1100(4095); class246 == null; class246 = aClass166_3438.method1100(4095)) {
						try {
							aClass166_3438.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (!(class246 instanceof Class246_Sub39))
						break;
					class246_sub39 = (Class246_Sub39) class246;
				}
				int i;
				try {
					byte[] is = InetAddress.getByName(((Class246_Sub39) class246_sub39).aString5486).getAddress();
					i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
				} catch (Throwable throwable) {
					i = 1000;
				}
				((Class246_Sub39) class246_sub39).anInt5485 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vo.run(" + ')');
		}
	}

	public Class243() {
		try {
			aThread3441 = new Thread(this);
			aThread3441.setDaemon(true);
			aThread3441.start();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vo.<init>(" + ')');
		}
	}
}
