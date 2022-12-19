/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class259 {
	static Class97 aClass97_3707;
	static int anInt3708;
	static int anInt3709;

	public static void method1674(boolean bool) {
		try {
			if (bool != true)
				method1676(79, -22, (byte) 97, 86, -35);
			aClass97_3707 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ws.G(" + bool + ')');
		}
	}

	static final void method1675(boolean bool) {
		try {
			anInt3708++;
			Class246_Sub35.aClass54_5150.method369(bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ws.F(" + bool + ')');
		}
	}

	static final void method1676(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
		try {
			Class110.anInt1573 = i_0_;
			if (i_1_ <= -62) {
				Class109_Sub4.anInt4570 = i_2_;
				Class197.anInt2818 = i_3_;
				anInt3709++;
				Class_t.anInt1442 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ws.H(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
