/* Class246_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub41 extends Node {
	private int anInt5523;
	int anInt5524;
	float aFloat5525;
	private int anInt5526;
	static int anInt5527;
	static int anInt5528;
	int anInt5529;
	static int anInt5530;
	static int anInt5531 = 0;
	static int anInt5532;
	static int anInt5533;
	static int anInt5534;
	static Class_l aClass_l5535;
	int anInt5536;

	public static void method2314(boolean bool) {
		do {
			try {
				aClass_l5535 = null;
				if (bool == false)
					break;
				aClass_l5535 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vp.N(" + bool + ')');
			}
			break;
		} while (false);
	}

	abstract void method2315(int i, float f);

	final float method2316(boolean bool) {
		try {
			if (bool != false)
				((Class246_Sub41) this).anInt5529 = 97;
			anInt5530++;
			return ((Class246_Sub41) this).aFloat5525;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.I(" + bool + ')');
		}
	}

	final int method2317(boolean bool) {
		try {
			anInt5533++;
			if (bool != false)
				return -94;
			return ((Class246_Sub41) this).anInt5529;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.L(" + bool + ')');
		}
	}

	final int method2318(byte i) {
		try {
			anInt5532++;
			if (i != 27)
				return 4;
			return ((Class246_Sub41) this).anInt5536;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.M(" + i + ')');
		}
	}

	final int method2319(byte i) {
		try {
			anInt5534++;
			if (i > -108)
				return -110;
			return anInt5526;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.K(" + i + ')');
		}
	}

	abstract void method2320(int i, int i_0_, int i_1_, byte i_2_);

	Class246_Sub41(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
		try {
			((Class246_Sub41) this).aFloat5525 = f;
			((Class246_Sub41) this).anInt5536 = i_3_;
			anInt5523 = i_5_;
			anInt5526 = i_6_;
			((Class246_Sub41) this).anInt5529 = i;
			((Class246_Sub41) this).anInt5524 = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vp.<init>(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f + ')'));
		}
	}

	final int method2321(byte i) {
		try {
			anInt5528++;
			if (i >= -35)
				method2315(11, 0.6382251F);
			return ((Class246_Sub41) this).anInt5524;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.H(" + i + ')');
		}
	}

	final int method2322(int i) {
		try {
			anInt5527++;
			if (i <= 78)
				((Class246_Sub41) this).aFloat5525 = 1.2582719F;
			return anInt5523;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vp.J(" + i + ')');
		}
	}
}
