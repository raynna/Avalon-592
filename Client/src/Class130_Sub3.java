/* Class130_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub3 extends Class130 {
	static int anInt4406;
	static int anInt4407;
	int anInt4408;
	static int anInt4409;
	int anInt4410;
	int anInt4411;
	static int anInt4412;
	static Class_c aClass_c4413;
	Class59 aClass59_4414;
	Class130_Sub5[] aClass130_Sub5Array4415;
	static OutgoingPacket PLAYER_OPTION_1_PACKET = new OutgoingPacket(40, 3);
	static int anInt4417;
	static int anInt4418;

	static final void method1983(Player class_r_sub1, int i, int i_0_, int i_1_, byte i_2_) {
		try {
			anInt4412++;
			if (i_0_ == 347) {
				int i_3_ = ((Actor) class_r_sub1).f_mc[0];
				int i_4_ = ((Actor) class_r_sub1).f_nc[0];
				if (i_3_ >= 0 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) && i_4_ >= 0 && Class152.anInt2205 > i_4_ && ((i ^ 0xffffffff) <= -1 && i < Class38_Sub1_Sub1.anInt6770 && (i_1_ ^ 0xffffffff) <= -1 && ((Class152.anInt2205 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)))) {
					int i_5_ = (CS2Script.method2416((byte) -79, (Class95.aClass199Array1235[((Class59_Sub3) class_r_sub1).aByte5053]), i_3_, i, 0, i_1_, class_r_sub1.method2670((byte) 127), 0, Class246_Sub4.anIntArray3865, 0, true, Class220.anIntArray3049, i_4_, 0, -4));
					if (i_5_ >= 1 && i_5_ <= 3) {
						for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (-1 + i_5_ ^ 0xffffffff); i_6_++)
							class_r_sub1.method2914((Class246_Sub4.anIntArray3865[i_6_]), (Class220.anIntArray3049[i_6_]), (byte) -115, i_2_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fk.A(" + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1984(int i) {
		do {
			try {
				anInt4409++;
				Class239.aClass166_3372 = new Class166();
				if (i == 0)
					break;
				method1983(null, 29, 35, 102, (byte) 93);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fk.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1985(int i, int i_7_, int i_8_, Class260 class260) {
		try {
			anInt4407++;
			if (i_7_ != 0)
				method1986(-86);
			if (((Class130_Sub3) this).aClass130_Sub5Array4415 != null) {
				for (int i_9_ = 0; (i_9_ < ((Class130_Sub3) this).aClass130_Sub5Array4415.length); i_9_++) {
					if (((Class130_Sub3) this).aClass130_Sub5Array4415[i_9_].method2098(i, i_8_) && ((Class130_Sub3) this).aClass59_4414.method409(i_8_, 0, class260, i))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fk.B(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1986(int i) {
		do {
			try {
				aClass_c4413 = null;
				PLAYER_OPTION_1_PACKET = null;
				if (i >= 113)
					break;
				anInt4418 = -25;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fk.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
