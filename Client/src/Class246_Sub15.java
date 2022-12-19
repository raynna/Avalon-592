/* Class246_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub15 extends Node {
	int anInt4439;
	static int anInt4440;
	int anInt4441;
	static OutgoingPacket aClass201_4442;
	static int[] anIntArray4443 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static OutgoingPacket aClass201_4444;
	static Class260 aClass260_4445;
	static String[] aStringArray4446;

	public static void method1998(int i) {
		try {
			aClass260_4445 = null;
			aClass201_4442 = null;
			anIntArray4443 = null;
			aStringArray4446 = null;
			if (i == -1)
				aClass201_4444 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gd.A(" + i + ')');
		}
	}

	Class246_Sub15(int i, int i_0_) {
		try {
			((Class246_Sub15) this).anInt4441 = i_0_;
			((Class246_Sub15) this).anInt4439 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gd.<init>(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1999(boolean bool, int i, Class235[] class235s) {
		try {
			if (bool != false)
				method1998(-59);
			anInt4440++;
			for (int i_1_ = 0; (class235s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				Class235 class235 = class235s[i_1_];
				if (class235 != null && (i ^ 0xffffffff) == (((Class235) class235).anInt3293 ^ 0xffffffff) && !client.method2966(class235)) {
					if (((Class235) class235).f_vc == 0) {
						method1999(false, ((Class235) class235).anInt3248, class235s);
						if (((Class235) class235).f_ad != null)
							method1999(false, ((Class235) class235).anInt3248, ((Class235) class235).f_ad);
						Class246_Sub40 class246_sub40 = ((Class246_Sub40) (Class246_Sub34.aClass85_5143.method544((long) ((Class235) class235).anInt3248, 124)));
						if (class246_sub40 != null)
							Class78.method489((byte) -25, ((Class246_Sub40) class246_sub40).anInt5517);
					}
					if (((Class235) class235).f_vc == 6 && ((((Class235) class235).anInt3232 ^ 0xffffffff) != 0)) {
						Class124 class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class235) class235).anInt3232));
						if (class124 != null) {
							((Class235) class235).anInt3275 += Class246_Sub17.anInt4663;
							while ((((Class124) class124).anIntArray1745[((Class235) class235).anInt3256]) < ((Class235) class235).anInt3275) {
								((Class235) class235).anInt3275 -= (((Class124) class124).anIntArray1745[((Class235) class235).anInt3256]);
								((Class235) class235).anInt3256++;
								if (((Class124) class124).anIntArray1724.length <= ((Class235) class235).anInt3256) {
									((Class235) class235).anInt3256 -= ((Class124) class124).anInt1731;
									if (((Class235) class235).anInt3256 < 0 || ((((Class235) class235).anInt3256 ^ 0xffffffff) <= ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)))
										((Class235) class235).anInt3256 = 0;
								}
								((Class235) class235).anInt3221 = ((Class235) class235).anInt3256 + 1;
								if (((Class124) class124).anIntArray1724.length <= ((Class235) class235).anInt3221) {
									((Class235) class235).anInt3221 -= ((Class124) class124).anInt1731;
									if ((((Class235) class235).anInt3221 ^ 0xffffffff) > -1 || ((((Class235) class235).anInt3221 ^ 0xffffffff) <= ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)))
										((Class235) class235).anInt3221 = -1;
								}
								Stream_Sub1.method2483(class235, (byte) -109);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gd.B(" + bool + ',' + i + ',' + (class235s != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass201_4442 = new OutgoingPacket(76, 3);
		aClass201_4444 = new OutgoingPacket(18, 6);
		aStringArray4446 = new String[100];
	}
}
