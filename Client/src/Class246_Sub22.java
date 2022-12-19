/* Class246_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub22 extends Node {
	int anInt4748;
	static int anInt4749;
	int anInt4750;
	static int anInt4751;
	int anInt4752;
	int anInt4753;
	int anInt4754;
	static int anInt4755;
	Class246_Sub37_Sub3 aClass246_Sub37_Sub3_4756;
	int anInt4757;
	int anInt4758;
	int anInt4759;
	Class239 aClass239_4760;
	int anInt4761;
	int anInt4762;
	int anInt4763;
	Class246_Sub3_Sub1 aClass246_Sub3_Sub1_4764;
	Class246_Sub34 aClass246_Sub34_4765;
	int anInt4766;
	int anInt4767;
	int anInt4768;
	int anInt4769;
	int anInt4770;
	static int[] anIntArray4771;
	static int[] anIntArray4772;
	static int[] anIntArray4773;
	int anInt4774;
	static String[] aStringArray4775;

	static final void method2081(Class100 class100, int i, int i_0_, int i_1_) {
		long l = Class255.aLongArrayArrayArray3648[i][i_0_][i_1_];
		long l_2_ = 0L;
		((Class100) class100).anInt1298 = 0;
		for (/**/; l_2_ <= 48L; l_2_ += 16L) {
			int i_3_ = (int) (l >> (int) l_2_ & 0xffffL);
			if (i_3_ <= 0)
				break;
			((Class100) class100).aClass246_Sub41Array1301[((Class100) class100).anInt1298++] = (((Class174) Class57.aClass174Array811[i_3_ - 1]).aClass246_Sub41_2452);
		}
		for (int i_4_ = ((Class100) class100).anInt1298; i_4_ < 4; i_4_++)
			((Class100) class100).aClass246_Sub41Array1301[i_4_] = null;
	}

	static final Class59_Sub4 method2082(int i, int i_5_, int i_6_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_5_][i_6_];
		if (class147 == null)
			return null;
		return ((Class147) class147).aClass59_Sub4_2172;
	}

	static final int method2083(int i, int i_7_, int i_8_, int i_9_, byte i_10_) {
		try {
			anInt4751++;
			if (i_10_ != -79)
				return -36;
			int i_11_ = 65536 + -Class39_Sub1.anIntArray4672[i * 8192 / i_7_] >> 1;
			return (i_9_ * i_11_ >> 16) + ((65536 - i_11_) * i_8_ >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lm.D(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method2084(int i, byte i_12_, int i_13_, int i_14_) {
		try {
			i_14_ <<= 3;
			i_13_ <<= 3;
			i <<= 3;
			anInt4755++;
			if (i_12_ >= -58)
				anIntArray4772 = null;
			if ((Class130_Sub3.anInt4417 ^ 0xffffffff) == -3) {
				Class73.anInt961 = i_13_;
				Class244.anInt3456 = i;
				Class106_Sub1.anInt4179 = i_14_;
			}
			Class204.aFloat2881 = (float) i_13_;
			Class59_Sub2.aFloat4553 = (float) i;
			Class145.method977(84);
			Class135.aBool1929 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lm.B(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public static void method2085(byte i) {
		try {
			if (i < -124) {
				anIntArray4771 = null;
				aStringArray4775 = null;
				anIntArray4772 = null;
				anIntArray4773 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lm.C(" + i + ')');
		}
	}

	final void method2086(int i) {
		try {
			if (i != 0)
				((Class246_Sub22) this).anInt4754 = 75;
			((Class246_Sub22) this).aClass246_Sub34_4765 = null;
			anInt4749++;
			((Class246_Sub22) this).aClass246_Sub3_Sub1_4764 = null;
			((Class246_Sub22) this).aClass246_Sub37_Sub3_4756 = null;
			((Class246_Sub22) this).aClass239_4760 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lm.E(" + i + ')');
		}
	}

	static {
		new Class67("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.", "Voc\u00ea foi expulso do canal.");
		anIntArray4772 = new int[1];
		aStringArray4775 = new String[100];
		anIntArray4773 = new int[100];
		anIntArray4771 = new int[14];
	}
}
