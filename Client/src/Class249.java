
/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class249 {
	static int anInt3490;
	private int anInt3491 = 1;
	private int anInt3492;
	private boolean aBool3493;
	static int anInt3494;
	private Class166 aClass166_3495;
	private Class134 aClass134_3496;
	static Class67 aClass67_3497 = (new Class67("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O m\u00e1x. \u00e9 100."));
	private int anInt3498;
	private Class260_Sub2 aClass260_Sub2_3499;
	static int anInt3500;
	private int anInt3501 = 0;
	private Class134 aClass134_3502;
	static int anInt3503;
	static int anInt3504;
	static int anInt3505;
	private Class134 aClass134_3506;
	static int anInt3507;
	private boolean aBool3508;
	private boolean aBool3509;
	private boolean aBool3510;
	private int anInt3511;
	private Class246_Sub1_Sub12 aClass246_Sub1_Sub12_3512;
	private int anInt3513;
	static String[] aStringArray3514;
	private Class109_Sub1 aClass109_Sub1_3515;
	private boolean aBool3516;
	private Class109_Sub1[] aClass109_Sub1Array3517;
	private boolean aBool3518;
	private Class246_Sub1_Sub12 aClass246_Sub1_Sub12_3519;
	static int anInt3520;
	static OutgoingPacket aClass201_3521;
	static boolean aBool3522 = false;

	final void method1587(int i) {
		try {
			if (i != 26187)
				aClass109_Sub1_3515 = null;
			aClass109_Sub1_3515 = null;
			aClass246_Sub1_Sub12_3519 = null;
			aClass134_3496 = aClass134_3502 = aClass134_3506 = null;
			aClass109_Sub1Array3517 = null;
			anInt3500++;
			aClass246_Sub1_Sub12_3512 = null;
			if (!aClass166_3495.method1111((byte) -124)) {
				for (Node class246 = aClass166_3495.method1104(71); class246 != ((Class166) aClass166_3495).aClass246_2343; class246 = ((Node) class246).next)
					((Class246_Sub7) class246).method1839((byte) -71);
			}
			anInt3492 = anInt3491 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.H(" + i + ')');
		}
	}

	final boolean method1588(int i, Class246_Sub7 class246_sub7) {
		try {
			anInt3503++;
			if (i != 0)
				return true;
			if (aClass134_3496 != null) {
				if (class246_sub7.method1837((byte) 109) || class246_sub7.method1838((byte) 126)) {
					aClass166_3495.method1101(false, class246_sub7);
					method1589(i + 2);
					if (method1591((byte) 102)) {
						if ((anInt3492 ^ 0xffffffff) != 0 && (anInt3491 ^ 0xffffffff) != 0)
							class246_sub7.method1840(i + 8574, anInt3491, anInt3492);
						((Class246_Sub7) class246_sub7).aBool3966 = true;
						return true;
					}
				}
				method1592(i - 104, class246_sub7);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wb.F(" + i + ',' + (class246_sub7 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1589(int i) {
		try {
			anInt3494++;
			boolean bool = false;
			int i_0_ = 0;
			int i_1_ = 0;
			for (Class246_Sub7 class246_sub7 = (Class246_Sub7) aClass166_3495.method1104(i ^ 0x68); class246_sub7 != null; class246_sub7 = ((Class246_Sub7) aClass166_3495.method1108((byte) -112))) {
				int i_2_ = class246_sub7.method1832(true);
				i_1_ += class246_sub7.method1834(true);
				if ((i_2_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
					i_0_ = i_2_;
				bool |= class246_sub7.method1831(true);
			}
			int i_3_;
			if (i_0_ == i)
				i_3_ = 34836;
			else if ((i_0_ ^ 0xffffffff) != -2)
				i_3_ = 6408;
			else
				i_3_ = 34842;
			if (i_3_ != anInt3513) {
				aBool3518 = true;
				anInt3513 = i_3_;
			}
			int i_4_ = anInt3511 > 2 ? 2 : anInt3511;
			int i_5_ = (i_1_ ^ 0xffffffff) < -3 ? 2 : i_1_;
			if (!bool == aBool3516) {
				aBool3516 = bool;
				aBool3508 = true;
			}
			if (i_4_ != i_5_)
				aBool3509 = aBool3518 = true;
			anInt3511 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.A(" + i + ')');
		}
	}

	public static void method1590(int i) {
		try {
			aStringArray3514 = null;
			int i_6_ = 62 % ((27 - i) / 52);
			aClass201_3521 = null;
			aClass67_3497 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.I(" + i + ')');
		}
	}

	private final boolean method1591(byte i) {
		try {
			if (i < 64)
				method1595((byte) 119);
			if (aBool3508) {
				if (aClass246_Sub1_Sub12_3519 != null) {
					aClass246_Sub1_Sub12_3519.method2619(-25097);
					aClass246_Sub1_Sub12_3519 = null;
				}
				if (aClass109_Sub1_3515 != null) {
					aClass109_Sub1_3515.method755(-122);
					aClass109_Sub1_3515 = null;
				}
				if (aClass134_3502 != null)
					aClass246_Sub1_Sub12_3519 = new Class246_Sub1_Sub12(aClass260_Sub2_3499, 6402, anInt3492, anInt3491, ((Class260_Sub2) aClass260_Sub2_3499).f_je);
				if (aBool3516)
					aClass109_Sub1_3515 = new Class109_Sub1(aClass260_Sub2_3499, 34037, 6402, anInt3492, anInt3491);
				else if (aClass246_Sub1_Sub12_3519 == null)
					aClass246_Sub1_Sub12_3519 = new Class246_Sub1_Sub12(aClass260_Sub2_3499, 6402, anInt3492, anInt3491);
				aBool3509 = true;
				aBool3508 = false;
				aBool3510 = true;
			}
			anInt3520++;
			if (aBool3518) {
				if (aClass246_Sub1_Sub12_3512 != null) {
					aClass246_Sub1_Sub12_3512.method2619(-25097);
					aClass246_Sub1_Sub12_3512 = null;
				}
				if (aClass109_Sub1Array3517[0] != null) {
					aClass109_Sub1Array3517[0].method755(-100);
					aClass109_Sub1Array3517[0] = null;
				}
				if (aClass109_Sub1Array3517[1] != null) {
					aClass109_Sub1Array3517[1].method755(-100);
					aClass109_Sub1Array3517[1] = null;
				}
				if (aClass134_3502 != null)
					aClass246_Sub1_Sub12_3512 = new Class246_Sub1_Sub12(aClass260_Sub2_3499, anInt3513, anInt3492, anInt3491, ((Class260_Sub2) aClass260_Sub2_3499).f_je);
				aClass109_Sub1Array3517[0] = new Class109_Sub1(aClass260_Sub2_3499, 34037, anInt3513, anInt3492, anInt3491);
				aClass109_Sub1Array3517[1] = (anInt3511 <= 1 ? (Class109_Sub1) null : new Class109_Sub1(aClass260_Sub2_3499, 34037, anInt3513, anInt3492, anInt3491));
				aBool3518 = false;
				aBool3510 = true;
				aBool3509 = true;
			}
			if (aBool3509) {
				if (aClass134_3502 != null) {
					aClass260_Sub2_3499.method1922(aClass134_3506, (byte) -101);
					aClass134_3506.method903(0, -94);
					aClass134_3506.method903(1, 81);
					aClass134_3506.method903(8, -76);
					aClass134_3506.method913((byte) 76, aClass109_Sub1Array3517[0], 0);
					if (anInt3511 > 1)
						aClass134_3506.method913((byte) 76, aClass109_Sub1Array3517[1], 1);
					if (aBool3516)
						aClass134_3506.method913((byte) 76, aClass109_Sub1_3515, 8);
					aClass260_Sub2_3499.method1971(aClass134_3506, 112);
					aClass260_Sub2_3499.method1922(aClass134_3502, (byte) -101);
					aClass134_3502.method903(0, -106);
					aClass134_3502.method903(8, -63);
					aClass134_3502.method906(aClass246_Sub1_Sub12_3512, 0, (byte) -87);
					aClass134_3502.method906(aClass246_Sub1_Sub12_3519, 8, (byte) -125);
					aClass260_Sub2_3499.method1971(aClass134_3502, -114);
				} else {
					aClass260_Sub2_3499.method1922(aClass134_3506, (byte) -101);
					aClass134_3506.method903(0, 80);
					aClass134_3506.method903(1, 85);
					aClass134_3506.method903(8, -71);
					aClass134_3506.method913((byte) 76, aClass109_Sub1Array3517[0], 0);
					if (anInt3511 > 1)
						aClass134_3506.method913((byte) 76, aClass109_Sub1Array3517[1], 1);
					if (aBool3516)
						aClass134_3506.method913((byte) 76, aClass109_Sub1_3515, 8);
					else
						aClass134_3506.method906(aClass246_Sub1_Sub12_3519, 8, (byte) -126);
					aClass260_Sub2_3499.method1971(aClass134_3506, -5);
				}
				aBool3510 = true;
				aBool3509 = false;
			}
			if (aBool3510) {
				aClass260_Sub2_3499.method1922(aClass134_3496, (byte) -101);
				aBool3510 = !aClass134_3496.method908(-36054);
				aClass260_Sub2_3499.method1971(aClass134_3496, 86);
			}
			if (aBool3510)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.D(" + i + ')');
		}
	}

	final void method1592(int i, Class246_Sub7 class246_sub7) {
		try {
			if (i > -53)
				method1590(63);
			anInt3504++;
			((Class246_Sub7) class246_sub7).aBool3966 = false;
			class246_sub7.method1839((byte) -71);
			class246_sub7.unlink((byte) -49);
			method1589(2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wb.C(" + i + ',' + (class246_sub7 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1593(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			if (i_8_ > -68)
				method1594(51);
			anInt3490++;
			if (aClass134_3496 == null || aClass166_3495.method1111((byte) -128))
				return false;
			if ((anInt3492 ^ 0xffffffff) != (i_7_ ^ 0xffffffff) || (i_10_ ^ 0xffffffff) != (anInt3491 ^ 0xffffffff)) {
				anInt3491 = i_10_;
				anInt3492 = i_7_;
				for (Node class246 = aClass166_3495.method1104(65); ((Class166) aClass166_3495).aClass246_2343 != class246; class246 = ((Node) class246).next)
					((Class246_Sub7) class246).method1840(8574, anInt3491, anInt3492);
				aBool3518 = true;
				aBool3509 = true;
				aBool3508 = true;
			}
			if (method1591((byte) 73)) {
				anInt3501 = i;
				anInt3498 = i_9_;
				aBool3493 = true;
				aClass260_Sub2_3499.method1922(aClass134_3496, (byte) -101);
				aClass134_3496.method902(82, 0);
				aClass260_Sub2_3499.method1931((anInt3491 - aClass134_3496.method907((byte) -20) - anInt3498), -anInt3501, 1);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wb.E(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final boolean method1594(int i) {
		try {
			anInt3505++;
			if (i != 0)
				return true;
			if (aClass134_3496 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.G(" + i + ')');
		}
	}

	final void method1595(byte i) {
		try {
			anInt3507++;
			if (aBool3493) {
				if (aClass134_3502 != null) {
					aClass260_Sub2_3499.method1949(aClass134_3502, (byte) -45);
					int i_11_ = 16384;
					aClass260_Sub2_3499.method1956(aClass134_3506, (byte) 54);
					aClass134_3502.method910(0, (byte) 5);
					aClass134_3506.method902(i ^ ~0x5f, 0);
					if (aBool3516)
						i_11_ |= 0x100;
					OpenGL.glBlitFramebufferEXT(0, 0, anInt3492, anInt3491, 0, 0, anInt3492, anInt3491, i_11_, 9728);
					aClass260_Sub2_3499.method1935(false, aClass134_3502);
					aClass260_Sub2_3499.method1940((byte) 79, aClass134_3506);
				}
				aClass260_Sub2_3499.method1930(false);
				if (i != -14)
					anInt3491 = 44;
				aClass260_Sub2_3499.method1958(i - 58, 0);
				aClass260_Sub2_3499.method1900(i ^ ~0x1e0c, 1);
				aClass260_Sub2_3499.e();
				int i_12_ = 0;
				int i_13_ = 1;
				Class246_Sub7 class246_sub7;
				for (Class246_Sub7 class246_sub7_14_ = (Class246_Sub7) aClass166_3495.method1104(125); class246_sub7_14_ != null; class246_sub7_14_ = class246_sub7) {
					class246_sub7 = ((Class246_Sub7) aClass166_3495.method1108((byte) -112));
					int i_15_ = class246_sub7_14_.method1834(true);
					for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_16_++) {
						class246_sub7_14_.method1833(i_16_, (byte) 24, (aClass109_Sub1Array3517[i_12_]), aClass109_Sub1_3515);
						if (class246_sub7 != null || i_16_ != -1 + i_15_) {
							aClass134_3506.method902(82, i_13_);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) anInt3491);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, anInt3491);
							OpenGL.glTexCoord2f((float) anInt3492, (float) anInt3491);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(anInt3492, anInt3491);
							OpenGL.glTexCoord2f((float) anInt3492, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(anInt3492, 0);
							OpenGL.glEnd();
						} else {
							aClass260_Sub2_3499.method1971(aClass134_3506, i + 29);
							aClass260_Sub2_3499.method1931(0, 0, 1);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) anInt3491);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(anInt3501, anInt3498);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(anInt3501, anInt3491 + anInt3498);
							OpenGL.glTexCoord2f((float) anInt3492, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(anInt3501 + anInt3492, anInt3491 + anInt3498);
							OpenGL.glTexCoord2f((float) anInt3492, (float) anInt3491);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(anInt3492 + anInt3501, anInt3498);
							OpenGL.glEnd();
						}
						i_12_ = 0x1 & i_12_ + 1;
						i_13_ = 1 + i_13_ & 0x1;
						class246_sub7_14_.method1829(0, i_16_);
					}
				}
				aBool3493 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wb.B(" + i + ')');
		}
	}

	Class249(Class260_Sub2 class260_sub2) {
		anInt3498 = 0;
		anInt3492 = 1;
		aClass166_3495 = new Class166();
		anInt3513 = -1;
		aBool3508 = true;
		aBool3510 = true;
		anInt3511 = 0;
		aBool3518 = true;
		aClass109_Sub1Array3517 = new Class109_Sub1[2];
		aBool3509 = true;
		aBool3516 = false;
		do {
			try {
				aClass260_Sub2_3499 = class260_sub2;
				if (!((Class260_Sub2) aClass260_Sub2_3499).aBool4322 || !((Class260_Sub2) aClass260_Sub2_3499).f_pg)
					break;
				aClass134_3496 = aClass134_3506 = new Class134(aClass260_Sub2_3499);
				if (((((Class260_Sub2) aClass260_Sub2_3499).f_je ^ 0xffffffff) >= -2) || !((Class260_Sub2) aClass260_Sub2_3499).aBool4358 || !((Class260_Sub2) aClass260_Sub2_3499).aBool4375)
					break;
				aClass134_3496 = aClass134_3502 = new Class134(aClass260_Sub2_3499);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wb.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass201_3521 = new OutgoingPacket(63, -1);
	}
}
