/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class196 {
	static int[] anIntArray2749;
	static String[] aStringArray2750 = new String[100];
	static int anInt2751;
	static int anInt2752;
	static int anInt2753;
	private Class260_Sub2 aClass260_Sub2_2754;
	long aLong2755;
	static int anInt2756;
	static int anInt2757;

	protected final void finalize() throws Throwable {
		try {
			anInt2756++;
			aClass260_Sub2_2754.method1973(-34844, ((Class196) this).aLong2755);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ru.finalize(" + ')');
		}
	}

	public static void method1278(int i) {
		try {
			aStringArray2750 = null;
			anIntArray2749 = null;
			int i_0_ = 88 / ((i + 31) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ru.B(" + i + ')');
		}
	}

	static final void method1279(int i, int i_1_, int i_2_, float f, Class64 class64, float f_3_, float f_4_, byte[] is, int i_5_, int i_6_, float f_7_, int i_8_, float f_9_, boolean bool) {
		try {
			anInt2752++;
			int i_10_ = i_1_ * i;
			float[] fs = new float[i_10_];
			int i_11_ = 0;
			if (bool != false)
				anIntArray2749 = null;
			for (/**/; i_11_ < i_2_; i_11_++) {
				int i_12_ = i_8_;
				class64.method422(0, f_4_ / (float) i_1_, i, i_1_, f_3_ / (float) i_5_, i_5_, f_7_ / (float) i, f_9_ * 127.0F, 7, i_6_, fs);
				f_3_ *= 2.0F;
				f_4_ *= 2.0F;
				f_7_ *= 2.0F;
				f_9_ *= f;
				for (int i_13_ = 0; i_10_ > i_13_; i_13_++) {
					is[i_12_] += fs[i_13_];
					i_12_++;
				}
			}
			int i_14_ = i_8_;
			for (int i_15_ = 0; i_10_ > i_15_; i_15_++) {
				is[i_14_] = (byte) (is[i_14_] + 127);
				i_14_++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ru.A(" + i + ',' + i_1_ + ',' + i_2_ + ',' + f + ',' + (class64 != null ? "{...}" : "null") + ',' + f_3_ + ',' + f_4_ + ',' + (is != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ',' + f_9_ + ',' + bool + ')'));
		}
	}

	Class196(Class260_Sub2 class260_sub2, long l, Class256[] class256s) {
		try {
			aClass260_Sub2_2754 = class260_sub2;
			((Class196) this).aLong2755 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ru.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + l + ',' + (class256s != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1280(int i, boolean bool) {
		try {
			anInt2753++;
			boolean bool_16_ = Class246_Sub15.aClass260_4445.method1742();
			if (i != -14734)
				anInt2757 = -1;
			if (bool_16_ != !bool)
				return true;
			do {
				if (!bool) {
					Class246_Sub15.aClass260_4445.method1677();
					if (!client.f_ob)
						break;
				}
				if (!Class246_Sub15.aClass260_4445.method1689())
					bool = false;
			} while (false);
			if (bool_16_ == bool)
				return false;
			((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool596 = bool;
			Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -120);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ru.C(" + i + ',' + bool + ')');
		}
	}

	static {
		anIntArray2749 = new int[2];
		new Class67("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado");
		anInt2757 = 765;
	}
}
