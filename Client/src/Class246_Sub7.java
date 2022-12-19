/* Class246_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub7 extends Node {
	static int anInt3958;
	static int anInt3959;
	static IncomingPacket aClass13_3960;
	static int anInt3961;
	static int anInt3962;
	static int anInt3963;
	static String aString3964;
	static int anInt3965;
	boolean aBool3966;
	Class260_Sub2 aClass260_Sub2_3967;
	static Class_fs index5;
	static int anInt3969;
	static int anInt3970;

	public static void method1828(int i) {
		try {
			aString3964 = null;
			index5 = null;
			if (i != 0)
				method1835(-47, 20, -73);
			aClass13_3960 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.N(" + i + ')');
		}
	}

	abstract void method1829(int i, int i_0_);

	static final boolean method1830(int i, int i_1_, int i_2_) {
		try {
			if (i_2_ != 2074)
				aString3964 = null;
			anInt3961++;
			if (!(Class246_Sub28_Sub14.method2633(i, -1376312589, i_1_) | (0x70000 & i) != 0) && !Class147.method996(i_1_, -1, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cg.K(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final boolean method1831(boolean bool) {
		try {
			if (bool != true)
				method1836((byte) 52);
			anInt3962++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.L(" + bool + ')');
		}
	}

	int method1832(boolean bool) {
		try {
			anInt3970++;
			if (bool != true)
				aString3964 = null;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.H(" + bool + ')');
		}
	}

	abstract void method1833(int i, byte i_3_, Class109_Sub1 class109_sub1, Class109_Sub1 class109_sub1_4_);

	final int method1834(boolean bool) {
		try {
			anInt3965++;
			if (bool != true)
				method1829(-33, -71);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.O(" + bool + ')');
		}
	}

	static final boolean method1835(int i, int i_5_, int i_6_) {
		try {
			int i_7_ = -34 % ((-66 - i_6_) / 53);
			anInt3963++;
			if ((i & 0x800 ^ 0xffffffff) == -1 || (0x37 & i_5_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cg.M(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final boolean method1836(byte i) {
		try {
			anInt3958++;
			if (i < 119)
				index5 = null;
			return ((Class246_Sub7) this).aBool3966;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.P(" + i + ')');
		}
	}

	abstract boolean method1837(byte i);

	abstract boolean method1838(byte i);

	abstract void method1839(byte i);

	Class246_Sub7(Class260_Sub2 class260_sub2) {
		try {
			((Class246_Sub7) this).aClass260_Sub2_3967 = class260_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cg.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method1840(int i, int i_8_, int i_9_);

	static {
		new Class67("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicita\u00e7\u00e3o para deixar o canal...");
		aClass13_3960 = new IncomingPacket(33, 0);
		anInt3969 = 0;
		aString3964 = null;
	}
}
