/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class40 {
	static Class246_Sub8 aClass246_Sub8_610 = new Class246_Sub8(0, 0);
	static Class246_Sub1_Sub17[] aClass246_Sub1_Sub17Array611 = new Class246_Sub1_Sub17[14];
	static byte[] aByteArray612 = new byte[32896];
	Class260_Sub2 aClass260_Sub2_613;
	static int anInt614;
	static int[] anIntArray615;
	static int anInt616;
	static int anInt617;

	abstract void method277(int i, int i_0_, int i_1_);

	abstract void method278(int i, boolean bool);

	static final void method279(boolean bool, Class260 class260) {
		do {
			try {
				anInt614++;
				if (bool != true)
					aClass246_Sub1_Sub17Array611 = null;
				if ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053 != Class211_Sub1.anInt5343) && Class106.aClass147ArrayArrayArray1494 != null) {
					if (!Class246_Sub1_Sub16.method2743(-4, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053), class260))
						break;
					Class211_Sub1.anInt5343 = (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dl.N(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	abstract void method280(int i);

	public static void method281(byte i) {
		try {
			aClass246_Sub8_610 = null;
			aByteArray612 = null;
			int i_2_ = 104 % ((28 - i) / 33);
			aClass246_Sub1_Sub17Array611 = null;
			anIntArray615 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dl.M(" + i + ')');
		}
	}

	abstract boolean method282(boolean bool);

	abstract void method283(int i, Class109 class109, boolean bool);

	abstract void method284(boolean bool, byte i);

	Class40(Class260_Sub2 class260_sub2) {
		try {
			((Class40) this).aClass260_Sub2_613 = class260_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dl.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		int i = 0;
		for (int i_3_ = 0; i_3_ < 256; i_3_++) {
			for (int i_4_ = 0; i_3_ >= i_4_; i_4_++)
				aByteArray612[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) (i_3_ * i_3_ + (i_4_ * i_4_) + 65535) / 65535.0F)));
		}
		anIntArray615 = new int[200];
		anInt617 = -1;
	}
}
