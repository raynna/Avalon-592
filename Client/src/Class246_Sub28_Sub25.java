/* Class246_Sub28_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub25 extends Class246_Sub28 {
	static Class81 aClass81_6700 = new Class81(13, 0, 1, 0);
	static int anInt6701;
	static Class57 aClass57_6702;
	static Class67 aClass67_6703 = new Class67("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	static int[] anIntArray6704 = new int[200];
	static boolean aBool6705;
	static int[] anIntArray6706 = { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	static String[] aStringArray6707 = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	static final void method2750() {
		Class228.method1461(1, Class154_Sub1.anInt4803);
	}

	public Class246_Sub28_Sub25() {
		super(0, true);
	}

	public static void method2751(int i) {
		try {
			aClass81_6700 = null;
			anIntArray6704 = null;
			aStringArray6707 = null;
			aClass67_6703 = null;
			aClass57_6702 = null;
			if (i > 87)
				anIntArray6706 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "od.B(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6701++;
			int i_1_ = 34 % ((67 - i) / 50);
			return Class187.anIntArray2654;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "od.E(" + i + ',' + i_0_ + ')');
		}
	}
}
