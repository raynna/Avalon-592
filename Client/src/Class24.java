/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static int anInt336;
	static int anInt337 = 0;
	static int anInt338;
	static OutgoingPacket aClass201_339 = new OutgoingPacket(69, 0);
	private int anInt340;
	static float aFloat341 = 0.0F;
	static Class67 aClass67_342;
	static int[] anIntArray343 = { 1, 2, 4, 8 };
	int anInt344;
	static int anInt345;
	static int anInt346;
	static int anInt347;
	static int[][] anIntArrayArray348;
	static int anInt349;

	public static void method202(int i) {
		try {
			if (i == 2) {
				anIntArray343 = null;
				anIntArrayArray348 = null;
				aClass201_339 = null;
				aClass67_342 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ch.D(" + i + ')');
		}
	}

	final int method203(int i) {
		try {
			anInt345++;
			if (i >= -93)
				anInt337 = -4;
			return 0x3fff & ((Class24) this).anInt344;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ch.B(" + i + ')');
		}
	}

	final void method204(int i, int i_0_) {
		try {
			((Class24) this).anInt344 = i;
			anInt347++;
			anInt340 = 0;
			int i_1_ = -7 / ((i_0_ - 51) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ch.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method205(int i) {
		do {
			try {
				anInt336++;
				if (Class246_Sub15.aClass260_4445 != null) {
					Class246_Sub2.aClass68_3814.method443(43);
					Class246_Sub28_Sub4.method2537();
					Class149.method1004(i ^ ~0x70);
					Class246_Sub23.method2099((byte) 126);
					Class173.method1137(false);
					Npc.method2927(0);
					if (Class_u_Sub1.aClass230_5685 != null)
						Class_u_Sub1.aClass230_5685.method1476(i ^ ~0xfff);
					Class246_Sub6.method1817(i - 1);
					Class232.method1484((byte) 124);
					Class159.method1058(false);
					Class246_Sub4.method1809(i + 4095, false);
					Class40_Sub8.method2214(64);
					for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -2049; i_2_++) {
						Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_2_];
						if (class_r_sub1 != null) {
							((Actor) class_r_sub1).f_pc = null;
							for (int i_3_ = 0; ((((Actor) class_r_sub1).f_qc.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++)
								((Actor) class_r_sub1).f_qc[i_3_] = null;
						}
					}
					for (int i_4_ = 0; Class76.aClass_r_Sub2Array1002.length > i_4_; i_4_++) {
						Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_4_];
						if (class_r_sub2 != null) {
							for (int i_5_ = 0; ((i_5_ ^ 0xffffffff) > (((Actor) class_r_sub2).f_qc.length ^ 0xffffffff)); i_5_++)
								((Actor) class_r_sub2).f_qc[i_5_] = null;
						}
					}
					Class246_Sub15.aClass260_4445.method1708(true);
					Class246_Sub15.aClass260_4445 = null;
				}
				if (i == 0)
					break;
				anIntArray343 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ch.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method206(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		Class121 class121 = new Class121();
		((Class121) class121).anInt1668 = i_6_ >> Class126.anInt1781;
		((Class121) class121).anInt1666 = i_7_ >> Class126.anInt1781;
		((Class121) class121).anInt1656 = i_8_ >> Class126.anInt1781;
		((Class121) class121).anInt1659 = i_9_ >> Class126.anInt1781;
		((Class121) class121).anInt1662 = i;
		((Class121) class121).anInt1657 = i_6_;
		((Class121) class121).anInt1674 = i_7_;
		((Class121) class121).anInt1661 = i_8_;
		((Class121) class121).anInt1658 = i_9_;
		((Class121) class121).anInt1671 = i_10_;
		((Class121) class121).anInt1664 = i_11_;
		Class246_Sub28_Sub5.aClass121Array5996[Class59_Sub2_Sub2.anInt6015++] = class121;
	}

	final void method207(boolean bool) {
		try {
			if (bool != false)
				anIntArray343 = null;
			anInt346++;
			((Class24) this).anInt344 &= 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ch.E(" + bool + ')');
		}
	}

	final boolean method208(int i, int i_12_, int i_13_, int i_14_) {
		try {
			anInt338++;
			int i_15_ = anInt340;
			if (((Class24) this).anInt344 == i_14_ && anInt340 == 0)
				return false;
			boolean bool;
			if ((anInt340 ^ 0xffffffff) != -1) {
				if ((anInt340 ^ 0xffffffff) >= -1 || i_14_ <= ((Class24) this).anInt344) {
					if (anInt340 >= 0 || ((Class24) this).anInt344 <= i_14_)
						bool = false;
					else {
						int i_16_ = anInt340 * anInt340 / (2 * i);
						int i_17_ = -i_16_ + ((Class24) this).anInt344;
						if (i_14_ < i_17_ && i_17_ <= ((Class24) this).anInt344)
							bool = true;
						else
							bool = false;
					}
				} else {
					int i_18_ = anInt340 * anInt340 / (2 * i);
					int i_19_ = ((Class24) this).anInt344 + i_18_;
					if (i_19_ >= i_14_ || ((((Class24) this).anInt344 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)))
						bool = false;
					else
						bool = true;
				}
			} else {
				if (((((Class24) this).anInt344 ^ 0xffffffff) > (i_14_ ^ 0xffffffff) && ((((Class24) this).anInt344 + i ^ 0xffffffff) <= (i_14_ ^ 0xffffffff))) || (((((Class24) this).anInt344 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) && -i + ((Class24) this).anInt344 <= i_14_)) {
					((Class24) this).anInt344 = i_14_;
					return false;
				}
				bool = true;
			}
			if (bool) {
				if ((i_14_ ^ 0xffffffff) >= (((Class24) this).anInt344 ^ 0xffffffff)) {
					anInt340 -= i;
					if (i_12_ != 0 && anInt340 < -i_12_)
						anInt340 = -i_12_;
				} else {
					anInt340 += i;
					if (i_12_ != 0 && i_12_ < anInt340)
						anInt340 = i_12_;
				}
				if ((anInt340 ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) {
					int i_20_ = anInt340 * anInt340 / (i * 2);
					if ((((Class24) this).anInt344 ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
						if (((Class24) this).anInt344 + i_20_ > i_14_)
							anInt340 = i_15_;
					} else if (i_14_ < ((Class24) this).anInt344 && i_14_ > ((Class24) this).anInt344 + -i_20_)
						anInt340 = i_15_;
				}
			} else if (anInt340 > 0) {
				anInt340 -= i;
				if (anInt340 < 0)
					anInt340 = 0;
			} else {
				anInt340 += i;
				if ((anInt340 ^ 0xffffffff) < -1)
					anInt340 = 0;
			}
			((Class24) this).anInt344 += i_15_ + anInt340 >> 1;
			if (i_13_ < 111)
				return true;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ch.G(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public Class24() {
		/* empty */
	}

	static {
		aClass67_342 = new Class67("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des param\u00e8tres par d\u00e9faut - ", "Carregando padr\u00f5es - ");
		new Class67("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est d\u00e9sactiv\u00e9.", "Seu canal de cl\u00e3 foi desativado!");
		anInt349 = 0;
	}
}
