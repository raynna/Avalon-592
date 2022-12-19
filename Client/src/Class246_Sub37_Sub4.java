/* Class246_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub37_Sub4 extends Class246_Sub37 {
	static int anInt6877;
	private Class246_Sub37_Sub1 aClass246_Sub37_Sub1_6878;
	static int anInt6879;
	static int anInt6880 = 0;
	static int anInt6881;
	Class166 aClass166_6882 = new Class166();
	static int anInt6883;
	Class246_Sub37_Sub2 aClass246_Sub37_Sub2_6884 = new Class246_Sub37_Sub2();
	static int anInt6885;
	static int anInt6886;
	static int anInt6887;

	final Class246_Sub37 method2256() {
		try {
			anInt6887++;
			Class246_Sub22 class246_sub22;
			do {
				class246_sub22 = (Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1108((byte) -112);
				if (class246_sub22 == null)
					return null;
			} while ((((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756) == null);
			return ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "se.SA(" + ')');
		}
	}

	final void method2254(int[] is, int i, int i_0_) {
		try {
			anInt6886++;
			((Class246_Sub37_Sub4) this).aClass246_Sub37_Sub2_6884.method2254(is, i, i_0_);
			Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1104(56));
			while_234_: for (/**/; class246_sub22 != null; class246_sub22 = (Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1108((byte) -112)) {
				if (!aClass246_Sub37_Sub1_6878.method2505((byte) -73, class246_sub22)) {
					int i_1_ = i;
					int i_2_ = i_0_;
					while (((Class246_Sub22) class246_sub22).anInt4748 < i_2_) {
						method2837(is, i_1_, ((Class246_Sub22) class246_sub22).anInt4748, class246_sub22, i_2_ + i_1_, 0);
						i_1_ += ((Class246_Sub22) class246_sub22).anInt4748;
						i_2_ -= ((Class246_Sub22) class246_sub22).anInt4748;
						if (aClass246_Sub37_Sub1_6878.method2524(class246_sub22, is, i_2_, true, i_1_))
							continue while_234_;
					}
					method2837(is, i_1_, i_2_, class246_sub22, i_1_ + i_2_, 0);
					((Class246_Sub22) class246_sub22).anInt4748 -= i_2_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("se.DA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	private final void method2836(int i, Class246_Sub22 class246_sub22, int i_3_) {
		try {
			anInt6877++;
			if ((0x4 & (((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).anIntArray5945[((Class246_Sub22) class246_sub22).anInt4754]) ^ 0xffffffff) != -1 && ((((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) > -1)) {
				int i_4_ = ((((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).f_eb[((Class246_Sub22) class246_sub22).anInt4754]) / Class140.anInt2024);
				int i_5_ = ((i_4_ + 1048575 - ((Class246_Sub22) class246_sub22).anInt4761) / i_4_);
				((Class246_Sub22) class246_sub22).anInt4761 = 0xfffff & (((Class246_Sub22) class246_sub22).anInt4761 + i_4_ * i_3_);
				if ((i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
					do {
						if (((((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).anIntArray5924[((Class246_Sub22) class246_sub22).anInt4754]) ^ 0xffffffff) != -1) {
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806((((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764), ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2804(), 0, ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2794()));
							aClass246_Sub37_Sub1_6878.method2511(((((Class246_Sub34) (((Class246_Sub22) class246_sub22).aClass246_Sub34_4765)).aShortArray5137[(((Class246_Sub22) class246_sub22).anInt4752)]) ^ 0xffffffff) > -1, -1, class246_sub22);
							if (!client.f_ob)
								break;
						}
						((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806((((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764), ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2804(), ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2789(), ((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2794()));
					} while (false);
					if (((((Class246_Sub34) (((Class246_Sub22) class246_sub22).aClass246_Sub34_4765)).aShortArray5137[((Class246_Sub22) class246_sub22).anInt4752]) ^ 0xffffffff) > -1)
						((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2781(-1);
					i_3_ = ((Class246_Sub22) class246_sub22).anInt4761 / i_4_;
				}
			}
			if (i <= -12)
				((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2260(i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("se.B(" + i + ',' + (class246_sub22 != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	final Class246_Sub37 method2259() {
		try {
			anInt6881++;
			Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1104(60));
			if (class246_sub22 == null)
				return null;
			if (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 != null)
				return (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756);
			return method2256();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "se.OA(" + ')');
		}
	}

	private final void method2837(int[] is, int i, int i_6_, Class246_Sub22 class246_sub22, int i_7_, int i_8_) {
		try {
			if (i_8_ == 0) {
				if ((0x4 & (((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).anIntArray5945[((Class246_Sub22) class246_sub22).anInt4754]) ^ 0xffffffff) != -1 && (((Class246_Sub22) class246_sub22).anInt4766 ^ 0xffffffff) > -1) {
					int i_9_ = ((((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).f_eb[((Class246_Sub22) class246_sub22).anInt4754]) / Class140.anInt2024);
					for (;;) {
						int i_10_ = ((1048575 - (-i_9_ - -(((Class246_Sub22) class246_sub22).anInt4761))) / i_9_);
						if (i_10_ > i_6_)
							break;
						((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2254(is, i, i_10_);
						i_6_ -= i_10_;
						((Class246_Sub22) class246_sub22).anInt4761 += i_9_ * i_10_ - 1048576;
						i += i_10_;
						int i_11_ = Class140.anInt2024 / 100;
						int i_12_ = 262144 / i_9_;
						if (i_12_ < i_11_)
							i_11_ = i_12_;
						Class246_Sub37_Sub3 class246_sub37_sub3 = (((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756);
						if ((((Class246_Sub37_Sub1) aClass246_Sub37_Sub1_6878).anIntArray5924[((Class246_Sub22) class246_sub22).anInt4754]) != 0) {
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806((((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764), class246_sub37_sub3.method2804(), 0, class246_sub37_sub3.method2794()));
							aClass246_Sub37_Sub1_6878.method2511((((Class246_Sub34) (((Class246_Sub22) class246_sub22).aClass246_Sub34_4765)).aShortArray5137[(((Class246_Sub22) class246_sub22).anInt4752)]) < 0, -1, class246_sub22);
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2801(i_11_, class246_sub37_sub3.method2789());
						} else
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756 = (Class246_Sub37_Sub3.method2806((((Class246_Sub22) class246_sub22).aClass246_Sub3_Sub1_4764), class246_sub37_sub3.method2804(), class246_sub37_sub3.method2789(), class246_sub37_sub3.method2794()));
						if ((((Class246_Sub34) (((Class246_Sub22) class246_sub22).aClass246_Sub34_4765)).aShortArray5137[((Class246_Sub22) class246_sub22).anInt4752]) < 0)
							((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2781(-1);
						class246_sub37_sub3.method2810(i_11_);
						class246_sub37_sub3.method2254(is, i, -i + i_7_);
						if (class246_sub37_sub3.method2807())
							((Class246_Sub37_Sub4) this).aClass246_Sub37_Sub2_6884.method2626(class246_sub37_sub3);
					}
					((Class246_Sub22) class246_sub22).anInt4761 += i_6_ * i_9_;
				}
				anInt6879++;
				((Class246_Sub22) class246_sub22).aClass246_Sub37_Sub3_4756.method2254(is, i, i_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("se.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + (class246_sub22 != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2260(int i) {
		try {
			anInt6885++;
			((Class246_Sub37_Sub4) this).aClass246_Sub37_Sub2_6884.method2260(i);
			Class246_Sub22 class246_sub22 = ((Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1104(85));
			while_236_: for (/**/; class246_sub22 != null; class246_sub22 = (Class246_Sub22) ((Class246_Sub37_Sub4) this).aClass166_6882.method1108((byte) -112)) {
				if (!aClass246_Sub37_Sub1_6878.method2505((byte) -59, class246_sub22)) {
					int i_13_ = i;
					while ((i_13_ ^ 0xffffffff) < (((Class246_Sub22) class246_sub22).anInt4748 ^ 0xffffffff)) {
						method2836(-83, class246_sub22, (((Class246_Sub22) class246_sub22).anInt4748));
						i_13_ -= ((Class246_Sub22) class246_sub22).anInt4748;
						if (aClass246_Sub37_Sub1_6878.method2524(class246_sub22, null, i_13_, true, 0))
							continue while_236_;
					}
					method2836(-120, class246_sub22, i_13_);
					((Class246_Sub22) class246_sub22).anInt4748 -= i_13_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "se.E(" + i + ')');
		}
	}

	final int method2258() {
		try {
			anInt6883++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "se.C(" + ')');
		}
	}

	Class246_Sub37_Sub4(Class246_Sub37_Sub1 class246_sub37_sub1) {
		try {
			aClass246_Sub37_Sub1_6878 = class246_sub37_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("se.<init>(" + (class246_sub37_sub1 != null ? "{...}" : "null") + ')'));
		}
	}
}
