/* Class246_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub43 extends Node {
	int anInt5596;
	int anInt5597;
	static Class67 aClass67_5598 = new Class67("M", "M", "M", "M");
	static int anInt5599 = 500;
	static Class130_Sub1_Sub1_Sub1[] aClass130_Sub1_Sub1_Sub1Array5600;
	static IncomingPacket aClass13_5601;
	static int[][] anIntArrayArray5602 = { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
	static float aFloat5603;
	static int anInt5604;
	static int anInt5605 = 0;
	static int anInt5606;

	public static void method2346(int i) {
		try {
			anIntArrayArray5602 = null;
			aClass67_5598 = null;
			aClass130_Sub1_Sub1_Sub1Array5600 = null;
			if (i != 1)
				method2346(2);
			aClass13_5601 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wt.A(" + i + ')');
		}
	}

	Class246_Sub43(int i, int i_0_) {
		try {
			((Class246_Sub43) this).anInt5597 = i_0_;
			((Class246_Sub43) this).anInt5596 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wt.<init>(" + i + ',' + i_0_ + ')');
		}
	}

	static {
		anInt5604 = -1;
		anInt5606 = 0;
		aClass13_5601 = new IncomingPacket(29, 1);
	}
}
