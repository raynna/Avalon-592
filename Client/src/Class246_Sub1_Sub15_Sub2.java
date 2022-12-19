/* Class246_Sub1_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub15_Sub2 extends Class246_Sub1_Sub15 {
	static int anInt7078;
	static int anInt7079;
	static int anInt7080;
	static int anInt7081;
	static int anInt7082;
	static float aFloat7083;
	private Object anObject7084;

	static final void method2896(int i, int i_0_, boolean bool) {
		try {
			anInt7079++;
			Class246_Sub18 class246_sub18 = Class95.method610(92, bool, i_0_);
			if (i != 21856)
				aFloat7083 = -0.47409412F;
			if (class246_sub18 != null)
				class246_sub18.unlink((byte) 102);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hl.C(" + i + ',' + i_0_ + ',' + bool + ')'));
		}
	}

	final boolean method2714(byte i) {
		try {
			if (i <= 81)
				method2897((byte) 47, 41);
			anInt7081++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hl.D(" + i + ')');
		}
	}

	static final void method2897(byte i, int i_1_) {
		do {
			try {
				anInt7078++;
				Class109.anInt1569 = i_1_;
				synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
					Class246_Sub1_Sub6_Sub2.aClass54_7109.method369(false);
				}
				if (i == -3)
					break;
				aFloat7083 = 0.19173466F;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hl.B(" + i + ',' + i_1_ + ')');
			}
			break;
		} while (false);
	}

	final Object method2718(byte i) {
		try {
			anInt7080++;
			if (i <= 22)
				method2897((byte) 93, 69);
			return anObject7084;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hl.E(" + i + ')');
		}
	}

	Class246_Sub1_Sub15_Sub2(Interface2 interface2, Object object, int i) {
		super(interface2, i);
		try {
			anObject7084 = object;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hl.<init>(" + (interface2 != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final Class88 method2898(byte i) {
		try {
			anInt7082++;
			try {
				if (i > -45)
					return null;
				return (Class88) Class.forName("Class88_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hl.A(" + i + ')');
		}
	}
}
