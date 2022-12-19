/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class152 {
	static int anInt2201;
	static int anInt2202 = 1339;
	static Class235 aClass235_2203 = null;
	static int anInt2204;
	static int anInt2205 = 104;

	static final int method1010(boolean bool, int i, Class63_Sub1 class63_sub1, boolean bool_0_, Class63_Sub1 class63_sub1_1_) {
		try {
			if (bool_0_ != false)
				method1011(55);
			anInt2204++;
			if (i == 1) {
				int i_2_ = ((Class63) class63_sub1).anInt855;
				int i_3_ = ((Class63) class63_sub1_1_).anInt855;
				if (!bool) {
					if ((i_3_ ^ 0xffffffff) == 0)
						i_3_ = 2001;
					if ((i_2_ ^ 0xffffffff) == 0)
						i_2_ = 2001;
				}
				return -i_3_ + i_2_;
			}
			if ((i ^ 0xffffffff) == -3)
				return (Class19.method191(-39, (((Class5) class63_sub1_1_.method2072(-14839)).aString54), ((Class5) class63_sub1.method2072(-14839)).aString54, Class_j.anInt1485));
			if ((i ^ 0xffffffff) == -4) {
				if (!((Class63_Sub1) class63_sub1).aString4714.equals("-")) {
					if (((Class63_Sub1) class63_sub1_1_).aString4714.equals("-")) {
						if (bool)
							return 1;
						return -1;
					}
				} else {
					if (((Class63_Sub1) class63_sub1_1_).aString4714.equals("-"))
						return 0;
					if (!bool)
						return 1;
					return -1;
				}
				return Class19.method191(117, (((Class63_Sub1) class63_sub1_1_).aString4714), (((Class63_Sub1) class63_sub1).aString4714), Class_j.anInt1485);
			}
			if (i == 4) {
				if (class63_sub1.method418(false)) {
					if (class63_sub1_1_.method418(false))
						return 0;
					return 1;
				}
				if (!class63_sub1_1_.method418(false))
					return 0;
				return -1;
			}
			if (i == 5) {
				if (!class63_sub1.method419(16563)) {
					if (!class63_sub1_1_.method419(16563))
						return 0;
					return -1;
				}
				if (class63_sub1_1_.method419(16563))
					return 0;
				return 1;
			}
			if (i == 6) {
				if (!class63_sub1.method421(512)) {
					if (!class63_sub1_1_.method421(512))
						return 0;
					return -1;
				}
				if (!class63_sub1_1_.method421(512))
					return 1;
				return 0;
			}
			if ((i ^ 0xffffffff) == -8) {
				if (!class63_sub1.method420((byte) -92)) {
					if (class63_sub1_1_.method420((byte) -92))
						return -1;
					return 0;
				}
				if (!class63_sub1_1_.method420((byte) -92))
					return 1;
				return 0;
			}
			if ((i ^ 0xffffffff) == -9) {
				int i_4_ = ((Class63_Sub1) class63_sub1).anInt4723;
				int i_5_ = ((Class63_Sub1) class63_sub1_1_).anInt4723;
				do {
					if (bool) {
						if (i_5_ == 1000)
							i_5_ = -1;
						if ((i_4_ ^ 0xffffffff) != -1001)
							break;
						i_4_ = -1;
						if (!client.f_ob)
							break;
					}
					if (i_5_ == -1)
						i_5_ = 1000;
					if ((i_4_ ^ 0xffffffff) == 0)
						i_4_ = 1000;
				} while (false);
				return i_4_ + -i_5_;
			}
			return (((Class63_Sub1) class63_sub1).anInt4713 - ((Class63_Sub1) class63_sub1_1_).anInt4713);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("og.C(" + bool + ',' + i + ',' + (class63_sub1 != null ? "{...}" : "null") + ',' + bool_0_ + ',' + (class63_sub1_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1011(int i) {
		do {
			try {
				aClass235_2203 = null;
				if (i == 1)
					break;
				method1012(-14, 121, 10);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "og.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1012(int i, int i_6_, int i_7_) {
		try {
			int i_8_ = -124 / ((-73 - i_6_) / 49);
			anInt2201++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("og.A(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}
}
