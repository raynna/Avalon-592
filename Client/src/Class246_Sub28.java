/* Class246_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub28 extends Node {
	static int anInt4931;
	int anInt4932;
	Class136 aClass136_4933;
	static boolean aBool4934 = false;
	Class246_Sub28[] aClass246_Sub28Array4935;
	static int anInt4936;
	static int anInt4937;
	Class66 aClass66_4938;
	static int anInt4939;
	static IncomingPacket GLOBAL_CONFIG_BYTE = new IncomingPacket(12, 5);
	static int anInt4941;
	static int anInt4942;
	static int anInt4943;
	static int anInt4944;
	static int anInt4945;
	static int anInt4946;
	boolean aBool4947;

	final int[] method2133(int i, int i_0_, int i_1_) {
		try {
			anInt4943++;
			if (i_1_ != 0)
				return null;
			if (!((Class246_Sub28) ((Class246_Sub28) this).aClass246_Sub28Array4935[i_0_]).aBool4947)
				return (((Class246_Sub28) this).aClass246_Sub28Array4935[i_0_].method2139((byte) 92, i)[0]);
			return ((Class246_Sub28) this).aClass246_Sub28Array4935[i_0_].method2135(123, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oc.L(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	void method2134(boolean bool) {
		try {
			if (bool != false)
				((Class246_Sub28) this).aBool4947 = true;
			anInt4944++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.F(" + bool + ')');
		}
	}

	int[] method2135(int i, int i_2_) {
		try {
			anInt4939++;
			int i_3_ = 110 / ((i - 67) / 50);
			throw new IllegalStateException("This operation does not have a monochrome output");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.E(" + i + ',' + i_2_ + ')');
		}
	}

	int method2136(int i) {
		try {
			anInt4936++;
			if (i != -1)
				return -30;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.M(" + i + ')');
		}
	}

	int method2137(int i) {
		try {
			if (i != 3)
				return 17;
			anInt4946++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.P(" + i + ')');
		}
	}

	void method2138(int i, byte i_4_, int i_5_) {
		try {
			anInt4937++;
			if (i_4_ != -54)
				method2142(7);
			int i_6_ = ((((Class246_Sub28) this).anInt4932 ^ 0xffffffff) == -256 ? i : ((Class246_Sub28) this).anInt4932);
			if (((Class246_Sub28) this).aBool4947)
				((Class246_Sub28) this).aClass66_4938 = new Class66(i_6_, i, i_5_);
			else
				((Class246_Sub28) this).aClass136_4933 = new Class136(i_6_, i, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oc.R(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	int[][] method2139(byte i, int i_7_) {
		try {
			if (i < 33)
				return null;
			anInt4931++;
			throw new IllegalStateException("This operation does not have a colour output");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.J(" + i + ',' + i_7_ + ')');
		}
	}

	public static void method2140(int i) {
		do {
			try {
				GLOBAL_CONFIG_BYTE = null;
				if (i == -256)
					break;
				method2140(-23);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "oc.N(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[][] method2141(int i, int i_8_, int i_9_) {
		try {
			anInt4942++;
			if (i != 3)
				return null;
			if (!((Class246_Sub28) ((Class246_Sub28) this).aClass246_Sub28Array4935[i_8_]).aBool4947)
				return ((Class246_Sub28) this).aClass246_Sub28Array4935[i_8_].method2139((byte) 127, i_9_);
			int[] is = ((Class246_Sub28) this).aClass246_Sub28Array4935[i_8_].method2135(117, i_9_);
			int[][] is_10_ = new int[3][];
			is_10_[0] = is;
			is_10_[2] = is;
			is_10_[1] = is;
			return is_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oc.Q(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	void method2142(int i) {
		try {
			do {
				if (!((Class246_Sub28) this).aBool4947) {
					((Class246_Sub28) this).aClass136_4933.method926((byte) 56);
					((Class246_Sub28) this).aClass136_4933 = null;
					if (!client.f_ob)
						break;
				}
				((Class246_Sub28) this).aClass66_4938.method429(258510055);
				((Class246_Sub28) this).aClass66_4938 = null;
			} while (false);
			if (i > 120)
				anInt4941++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.O(" + i + ')');
		}
	}

	void method2143(int i, int i_11_, BufferStream stream) {
		do {
			try {
				anInt4945++;
				if (i == 4)
					break;
				method2142(-35);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oc.G(" + i + ',' + i_11_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class246_Sub28(int i, boolean bool) {
		try {
			((Class246_Sub28) this).aBool4947 = bool;
			((Class246_Sub28) this).aClass246_Sub28Array4935 = new Class246_Sub28[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oc.<init>(" + i + ',' + bool + ')');
		}
	}
}
