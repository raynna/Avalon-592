/* Class246_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub5 extends Class246_Sub1 {
	boolean aBool5830;
	static char[] aCharArray5831 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static int anInt5832;
	int anInt5833;
	static Class_fs index21;
	static int anInt5835;
	int anInt5836;
	static int anInt5837;
	int anInt5838;
	static int anInt5839;
	int anInt5840;
	int anInt5841;
	int anInt5842 = 12800;
	Class166 aClass166_5843;
	String aString5844;
	int anInt5845 = 0;
	String aString5846;
	static int anInt5847;
	static int anInt5848;
	static int anInt5849;
	int anInt5850;

	final boolean method2466(int i, int[] is, byte i_0_, int i_1_) {
		try {
			anInt5849++;
			for (Class246_Sub38 class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1104(50); class246_sub38 != null; class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1108((byte) -112)) {
				if (class246_sub38.method2292(i_1_, i, (byte) -58)) {
					class246_sub38.method2290(i_1_, i, 2, is);
					return true;
				}
			}
			if (i_0_ != 111)
				method2472((byte) -56);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method2467(int i, int[] is, int i_2_, int i_3_) {
		try {
			anInt5835++;
			for (Class246_Sub38 class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1104(124); class246_sub38 != null; class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1108((byte) -112)) {
				if (class246_sub38.method2291((byte) 110, i_2_, i_3_)) {
					class246_sub38.method2289(is, 0, i_3_, i_2_);
					return true;
				}
			}
			if (i <= 8)
				((Class246_Sub1_Sub5) this).anInt5845 = -24;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.D(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final boolean method2468(int i, int i_4_, int i_5_) {
		try {
			anInt5832++;
			if (i > -82)
				method2471(false, null, 112, -88, -95);
			for (Class246_Sub38 class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1104(96); class246_sub38 != null; class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1108((byte) -112)) {
				if (class246_sub38.method2291((byte) 82, i_4_, i_5_))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.E(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method2469(byte i) {
		try {
			((Class246_Sub1_Sub5) this).anInt5842 = 12800;
			((Class246_Sub1_Sub5) this).anInt5838 = 0;
			((Class246_Sub1_Sub5) this).anInt5845 = 0;
			anInt5839++;
			if (i > -4)
				method2468(83, 104, -33);
			((Class246_Sub1_Sub5) this).anInt5833 = 12800;
			for (Class246_Sub38 class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1104(112); class246_sub38 != null; class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1108((byte) -112)) {
				if ((((Class246_Sub38) class246_sub38).anInt5443 ^ 0xffffffff) > (((Class246_Sub1_Sub5) this).anInt5833 ^ 0xffffffff))
					((Class246_Sub1_Sub5) this).anInt5833 = ((Class246_Sub38) class246_sub38).anInt5443;
				if (((Class246_Sub38) class246_sub38).anInt5431 < ((Class246_Sub1_Sub5) this).anInt5842)
					((Class246_Sub1_Sub5) this).anInt5842 = ((Class246_Sub38) class246_sub38).anInt5431;
				if (((Class246_Sub1_Sub5) this).anInt5845 < ((Class246_Sub38) class246_sub38).anInt5435)
					((Class246_Sub1_Sub5) this).anInt5845 = ((Class246_Sub38) class246_sub38).anInt5435;
				if ((((Class246_Sub1_Sub5) this).anInt5838 ^ 0xffffffff) > (((Class246_Sub38) class246_sub38).anInt5429 ^ 0xffffffff))
					((Class246_Sub1_Sub5) this).anInt5838 = ((Class246_Sub38) class246_sub38).anInt5429;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cn.B(" + i + ')');
		}
	}

	static final boolean method2470(int i, int i_6_, byte i_7_) {
		try {
			anInt5848++;
			if (i_7_ != -60)
				index21 = null;
			if ((0x100 & i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.F(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final boolean method2471(boolean bool, int[] is, int i, int i_8_, int i_9_) {
		try {
			anInt5837++;
			if (bool != false)
				((Class246_Sub1_Sub5) this).aString5844 = null;
			for (Class246_Sub38 class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1104(50); class246_sub38 != null; class246_sub38 = (Class246_Sub38) ((Class246_Sub1_Sub5) this).aClass166_5843.method1108((byte) -112)) {
				if (class246_sub38.method2293(98, i_8_, i_9_, i)) {
					class246_sub38.method2289(is, 0, i_9_, i_8_);
					return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.G(" + bool + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public static void method2472(byte i) {
		try {
			aCharArray5831 = null;
			index21 = null;
			int i_10_ = 78 % ((-34 - i) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cn.A(" + i + ')');
		}
	}

	Class246_Sub1_Sub5(int i, String string, String string_11_, int i_12_, int i_13_, boolean bool, int i_14_, int i_15_) {
		((Class246_Sub1_Sub5) this).anInt5840 = -1;
		((Class246_Sub1_Sub5) this).anInt5833 = 12800;
		((Class246_Sub1_Sub5) this).anInt5838 = 0;
		((Class246_Sub1_Sub5) this).anInt5841 = -1;
		((Class246_Sub1_Sub5) this).aBool5830 = true;
		try {
			((Class246_Sub1_Sub5) this).anInt5841 = i_13_;
			((Class246_Sub1_Sub5) this).anInt5840 = i_14_;
			((Class246_Sub1_Sub5) this).anInt5836 = i;
			((Class246_Sub1_Sub5) this).aBool5830 = bool;
			((Class246_Sub1_Sub5) this).aString5844 = string_11_;
			((Class246_Sub1_Sub5) this).aString5846 = string;
			((Class246_Sub1_Sub5) this).anInt5850 = i_12_;
			if (((Class246_Sub1_Sub5) this).anInt5840 == 255)
				((Class246_Sub1_Sub5) this).anInt5840 = 0;
			((Class246_Sub1_Sub5) this).aClass166_5843 = new Class166();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cn.<init>(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (string_11_ != null ? "{...}" : "null") + ',' + i_12_ + ',' + i_13_ + ',' + bool + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}
}
