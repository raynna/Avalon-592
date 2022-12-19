
/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class OutgoingPacket {
	static int anInt2855;
	static int anInt2856;
	private int anInt2857;
	static int anInt2858;
	static Class87 aClass87_2859 = new Class87(0);
	static int anInt2860;
	static int anInt2861;
	static int anInt2862;
	static int anInt2863;
	static int[][] anIntArrayArray2864 = new int[6][];

	static final String method1326(boolean bool, byte i, int i_0_, int i_1_) {
		try {
			anInt2860++;
			if ((i_1_ ^ 0xffffffff) > -3 || i_1_ > 36)
				throw new IllegalArgumentException("Invalid radix:" + i_1_);
			if (!bool || i_0_ < 0)
				return Integer.toString(i_0_, i_1_);
			int i_2_ = 2;
			for (int i_3_ = i_0_ / i_1_; (i_3_ ^ 0xffffffff) != -1; i_3_ /= i_1_)
				i_2_++;
			char[] cs = new char[i_2_];
			cs[0] = '+';
			for (int i_4_ = -1 + i_2_; (i_4_ ^ 0xffffffff) < -1; i_4_--) {
				int i_5_ = i_0_;
				i_0_ /= i_1_;
				int i_6_ = i_5_ - i_1_ * i_0_;
				if (i_6_ < 10)
					cs[i_4_] = (char) (48 + i_6_);
				else
					cs[i_4_] = (char) (87 + i_6_);
			}
			if (i != -70)
				method1326(true, (byte) -62, 95, -120);
			return new String(cs);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sl.C(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt2858++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sl.toString(" + ')');
		}
	}

	final int method1327(int i) {
		try {
			anInt2861++;
			if (i != 2)
				anInt2862 = 47;
			return anInt2857;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sl.A(" + i + ')');
		}
	}

	OutgoingPacket(int i, int i_7_) {
		try {
			anInt2857 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sl.<init>(" + i + ',' + i_7_ + ')');
		}
	}

	static final int[][] method1328(int i, int i_8_, int i_9_, int i_10_, boolean bool, byte i_11_, int i_12_, float f, int i_13_) {
		try {
			if (i_11_ >= -79)
				aClass87_2859 = null;
			anInt2855++;
			int[][] is = new int[i_12_][i_8_];
			Class246_Sub28_Sub9 class246_sub28_sub9 = new Class246_Sub28_Sub9();
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6144 = (int) (4096.0F * f);
			((Class246_Sub28_Sub9) class246_sub28_sub9).aBool6150 = bool;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6136 = i_13_;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6149 = i_9_;
			((Class246_Sub28_Sub9) class246_sub28_sub9).anInt6137 = i_10_;
			class246_sub28_sub9.method2134(false);
			Class155.method1028(i_12_, 9188, i_8_);
			for (int i_14_ = 0; i_12_ > i_14_; i_14_++)
				class246_sub28_sub9.method2573(is[i_14_], (byte) 122, i_14_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sl.D(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + f + ',' + i_13_ + ')'));
		}
	}

	public static void method1329(byte i) {
		try {
			int i_15_ = -24 % ((56 - i) / 50);
			anIntArrayArray2864 = null;
			aClass87_2859 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sl.B(" + i + ')');
		}
	}
}
