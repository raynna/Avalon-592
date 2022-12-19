/* Class246_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub10 extends Node {
	int anInt4072;
	int anInt4073;
	int anInt4074;
	int anInt4075;
	int anInt4076 = -2147483648;
	int anInt4077;
	int anInt4078;
	static Class67 aClass67_4079 = new Class67("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "N\u00e3o \u00e9 poss\u00edvel encontrar ");
	static int anInt4080;
	Class246_Sub2 aClass246_Sub2_4081;
	int anInt4082;
	static int[][] anIntArrayArray4083 = { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	static Class254 aClass254_4084;

	final boolean method1866(int i, int i_0_, int i_1_) {
		try {
			anInt4080++;
			if (i_0_ != -15997)
				return false;
			if (i_1_ >= ((Class246_Sub10) this).anInt4072 && ((((Class246_Sub10) this).anInt4073 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) && i >= ((Class246_Sub10) this).anInt4078 && i <= ((Class246_Sub10) this).anInt4076)
				return true;
			if (i_1_ >= ((Class246_Sub10) this).anInt4075 && ((Class246_Sub10) this).anInt4082 >= i_1_ && (i ^ 0xffffffff) <= (((Class246_Sub10) this).anInt4077 ^ 0xffffffff) && ((Class246_Sub10) this).anInt4074 >= i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dr.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method1867(int i) {
		try {
			anIntArrayArray4083 = null;
			aClass254_4084 = null;
			if (i < -106)
				aClass67_4079 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dr.B(" + i + ')');
		}
	}

	Class246_Sub10(Class246_Sub2 class246_sub2) {
		((Class246_Sub10) this).anInt4073 = -2147483648;
		((Class246_Sub10) this).anInt4078 = 2147483647;
		((Class246_Sub10) this).anInt4075 = 2147483647;
		((Class246_Sub10) this).anInt4077 = 2147483647;
		((Class246_Sub10) this).anInt4074 = -2147483648;
		((Class246_Sub10) this).anInt4082 = -2147483648;
		((Class246_Sub10) this).anInt4072 = 2147483647;
		try {
			((Class246_Sub10) this).aClass246_Sub2_4081 = class246_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dr.<init>(" + (class246_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		new Class67("The channel you tried to join is currently full.", "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
	}
}
