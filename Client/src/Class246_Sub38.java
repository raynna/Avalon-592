/* Class246_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub38 extends Node {
	int anInt5429;
	static int anInt5430;
	int anInt5431;
	static int anInt5432;
	static IncomingPacket aClass13_5433 = new IncomingPacket(96, 2);
	private int anInt5434;
	int anInt5435;
	static int anInt5436;
	private int anInt5437;
	private int anInt5438;
	static int anInt5439;
	private int anInt5440;
	private int anInt5441;
	static int anInt5442;
	int anInt5443;
	static IncomingPacket aClass13_5444;
	static int anInt5445;
	static float[] aFloatArray5446 = new float[4];
	static int anInt5447;
	static HashMap aClass54_5448;
	static int anInt5449;
	static int anInt5450;

	final void method2289(int[] is, int i, int i_0_, int i_1_) {
		try {
			is[2] = i_1_ + -anInt5440 + ((Class246_Sub38) this).anInt5431;
			is[1] = -anInt5438 - -((Class246_Sub38) this).anInt5443 + i_0_;
			anInt5442++;
			is[i] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.E(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2290(int i, int i_2_, int i_3_, int[] is) {
		try {
			is[i_3_] = anInt5440 + -((Class246_Sub38) this).anInt5431 + i;
			is[0] = anInt5434;
			anInt5447++;
			is[1] = -((Class246_Sub38) this).anInt5443 - (-anInt5438 - i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.A(" + i + ',' + i_2_ + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2291(byte i, int i_4_, int i_5_) {
		try {
			anInt5432++;
			if (i <= 38)
				anInt5437 = -125;
			if (anInt5438 <= i_5_ && i_5_ <= anInt5441 && i_4_ >= anInt5440 && (anInt5437 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.G(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final boolean method2292(int i, int i_6_, byte i_7_) {
		try {
			anInt5430++;
			if (i_7_ != -58)
				method2289(null, 113, -16, 92);
			if (((Class246_Sub38) this).anInt5443 > i_6_ || ((Class246_Sub38) this).anInt5429 < i_6_ || (i ^ 0xffffffff) > (((Class246_Sub38) this).anInt5431 ^ 0xffffffff) || i > ((Class246_Sub38) this).anInt5435)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.D(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final boolean method2293(int i, int i_8_, int i_9_, int i_10_) {
		try {
			int i_11_ = -54 % ((17 - i) / 44);
			anInt5439++;
			if ((i_10_ ^ 0xffffffff) == (anInt5434 ^ 0xffffffff) && (i_9_ ^ 0xffffffff) <= (anInt5438 ^ 0xffffffff) && i_9_ <= anInt5441 && anInt5440 <= i_8_ && anInt5437 >= i_8_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.B(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	public static void method2294(int i) {
		try {
			aClass13_5433 = null;
			aClass13_5444 = null;
			aFloatArray5446 = null;
			int i_12_ = 15 / ((-29 - i) / 58);
			aClass54_5448 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ul.C(" + i + ')');
		}
	}

	Class246_Sub38(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		try {
			((Class246_Sub38) this).anInt5431 = i_18_;
			((Class246_Sub38) this).anInt5429 = i_19_;
			((Class246_Sub38) this).anInt5435 = i_20_;
			((Class246_Sub38) this).anInt5443 = i_17_;
			anInt5441 = i_15_;
			anInt5438 = i_13_;
			anInt5434 = i;
			anInt5440 = i_14_;
			anInt5437 = i_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.<init>(" + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	static final void method2295(int i, int i_21_, int i_22_, byte i_23_, int i_24_, int i_25_) {
		try {
			anInt5436++;
			for (int i_26_ = i_25_; i_21_ >= i_26_; i_26_++)
				Class135.method918(i, -110, i_22_, i_24_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_26_]));
			int i_27_ = 69 / ((i_23_ - 80) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ul.F(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	static {
		aClass13_5444 = new IncomingPacket(94, 0);
		aClass54_5448 = new HashMap(8);
		anInt5449 = 0;
	}
}
