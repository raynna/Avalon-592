/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class81 {
	int anInt1061;
	int anInt1062;
	int anInt1063;
	static int anInt1064;
	int anInt1065;
	static Class12 aClass12_1066;
	static int anInt1067;
	static boolean aBool1068;
	static int anInt1069;

	public static void method522(int i) {
		do {
			try {
				aClass12_1066 = null;
				if (i == 30068)
					break;
				aClass12_1066 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ho.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			anInt1064++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ho.toString(" + ')');
		}
	}

	Class81(int i, int i_0_, int i_1_, int i_2_) {
		try {
			((Class81) this).anInt1063 = i_1_;
			((Class81) this).anInt1065 = i;
			((Class81) this).anInt1061 = i_0_;
			((Class81) this).anInt1062 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ho.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static {
		new Class67("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de clan.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para conversar neste canal de cl\u00e3.");
		aClass12_1066 = new Class12(2, 6);
		aBool1068 = true;
		anInt1067 = 52;
	}
}
