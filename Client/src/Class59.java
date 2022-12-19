/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class59 {
	static int anInt817;
	static int anInt818;
	static int anInt819 = 0;
	static boolean aBool820;
	static Object anObject821;
	static int[] anIntArray822 = { -1, -1, 1, 1 };
	static int anInt823 = 0;
	static int anInt824;

	public static void method400(byte i) {
		try {
			if (i == 54) {
				anIntArray822 = null;
				anObject821 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fi.O(" + i + ')');
		}
	}

	abstract void method401(int i);

	static final boolean method402(char c, int i) {
		try {
			anInt818++;
			if ((c ^ 0xffffffff) <= -33 && (c ^ 0xffffffff) >= -127)
				return true;
			if ((c ^ 0xffffffff) <= -161 && c <= 255)
				return true;
			if (c == 8364 || c == 338 || c == 8212 || (c ^ 0xffffffff) == -340 || c == 376)
				return true;
			if (i <= 116)
				aBool820 = true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fi.P(" + c + ',' + i + ')');
		}
	}

	abstract void method403(Class260 class260, int i);

	static final boolean method404(byte i) {
		try {
			anInt817++;
			if (Class12.anInt182 != 0)
				return true;
			int i_0_ = -48 % ((i + 48) / 34);
			return Class32.aClass246_Sub37_Sub1_433.method2509((byte) -105);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fi.N(" + i + ')');
		}
	}

	abstract void method405(int i, int i_1_, Class59 class59_2_, byte i_3_, boolean bool, Class260 class260, int i_4_);

	abstract boolean method406(byte i);

	public Class59() {
		/* empty */
	}

	abstract Class130_Sub3 method407(Class260 class260, int i);

	static final void method408(int i, int i_5_, int i_6_, byte i_7_, int i_8_) {
		do {
			try {
				if ((Class_t.anInt1442 ^ 0xffffffff) >= (i ^ 0xffffffff) && i <= Class109_Sub4.anInt4570) {
					i_5_ = Class180.method1176(Class110.anInt1573, -24309, i_5_, Class197.anInt2818);
					i_8_ = Class180.method1176(Class110.anInt1573, -24309, i_8_, Class197.anInt2818);
					Class186.method1219(i_8_, i, i_6_, i_5_, 10);
				}
				anInt824++;
				if (i_7_ >= 27)
					break;
				method402('\uffb5', -126);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fi.Q(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	abstract boolean method409(int i, int i_9_, Class260 class260, int i_10_);

	static {
		aBool820 = false;
	}
}
