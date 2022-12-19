/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class110 {
	static int anInt1570;
	static int anInt1571;
	static Class85 aClass85_1572;
	static int anInt1573;
	static Class_fs index17;

	abstract void method762(byte i);

	static final void method763(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			anInt1570++;
			if (Class59_Sub3_Sub4.aClass210Array6993 != null) {
				Actor class_r;
				if ((i_5_ ^ 0xffffffff) > -1) {
					int i_13_ = -i_5_ - 1;
					if (i_13_ != Class109.anInt1567)
						class_r = Class143.aClass_r_Sub1Array2069[i_13_];
					else
						class_r = Class_a.aClass_r_Sub1_1180;
				} else {
					int i_14_ = -1 + i_5_;
					class_r = Class76.aClass_r_Sub2Array1002[i_14_];
				}
				if (class_r != null) {
					Class185 class185 = Class143.aClass251_2067.method1610(i_10_, 0);
					int i_15_;
					int i_16_;
					if (i_1_ == 1 || i_1_ == 3) {
						i_16_ = ((Class185) class185).anInt2570;
						i_15_ = ((Class185) class185).anInt2596;
					} else {
						i_15_ = ((Class185) class185).anInt2570;
						i_16_ = ((Class185) class185).anInt2596;
					}
					int i_17_ = (i_16_ >> 1) + i;
					int i_18_ = i - -(i_16_ + 1 >> 1);
					int i_19_ = i_9_ + (i_15_ >> 1);
					int i_20_ = 25 / ((i_2_ - 28) / 35);
					int i_21_ = i_9_ + (i_15_ + 1 >> 1);
					Class210 class210 = Class59_Sub3_Sub4.aClass210Array6993[i_7_];
					int i_22_ = (class210.l(i_17_, i_19_) - -class210.l(i_18_, i_19_) + class210.l(i_17_, i_21_) - -class210.l(i_18_, i_21_)) >> 2;
					Class246_Sub16 class246_sub16 = new Class246_Sub16();
					((Class246_Sub16) class246_sub16).anInt4523 = Class246_Sub1_Sub4.anInt5752 - -i_11_;
					((Class246_Sub16) class246_sub16).anInt4527 = i_12_;
					((Class246_Sub16) class246_sub16).anInt4535 = Class246_Sub1_Sub4.anInt5752 - -i_0_;
					((Class246_Sub16) class246_sub16).anInt4528 = ((Class59_Sub3) class_r).aByte5053;
					((Class246_Sub16) class246_sub16).anInt4522 = i_1_;
					if ((i_3_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
						int i_23_ = i_3_;
						i_3_ = i_8_;
						i_8_ = i_23_;
					}
					((Class246_Sub16) class246_sub16).anInt4520 = i;
					((Class246_Sub16) class246_sub16).anInt4526 = i_10_;
					((Class246_Sub16) class246_sub16).anInt4525 = i_9_;
					if ((i_4_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
						int i_24_ = i_6_;
						i_6_ = i_4_;
						i_4_ = i_24_;
					}
					((Class246_Sub16) class246_sub16).anInt4537 = i + i_8_;
					((Class246_Sub16) class246_sub16).anInt4533 = i + i_3_;
					((Class246_Sub16) class246_sub16).anInt4536 = ((i_15_ << 6) + (((Class246_Sub16) class246_sub16).anInt4525 << 7));
					((Class246_Sub16) class246_sub16).anInt4524 = i_6_ + i_9_;
					((Class246_Sub16) class246_sub16).anInt4532 = i_4_ + i_9_;
					((Class246_Sub16) class246_sub16).anInt4519 = i_22_;
					((Class246_Sub16) class246_sub16).anInt4530 = ((((Class246_Sub16) class246_sub16).anInt4520 << 7) + (i_16_ << 6));
					Class159.aClass166_2258.method1101(false, class246_sub16);
					((Actor) class_r).f_pc = class246_sub16;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kk.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final void method764(byte i) {
		try {
			anInt1571++;
			int i_25_ = 44 % ((11 - i) / 56);
			if (Signlink.aString747.toLowerCase().indexOf("microsoft") != -1) {
				Class169.anIntArray2408[221] = 43;
				Class169.anIntArray2408[186] = 57;
				Class169.anIntArray2408[189] = 26;
				Class169.anIntArray2408[220] = 74;
				Class169.anIntArray2408[187] = 27;
				Class169.anIntArray2408[222] = 59;
				Class169.anIntArray2408[192] = 58;
				Class169.anIntArray2408[219] = 42;
				Class169.anIntArray2408[190] = 72;
				Class169.anIntArray2408[191] = 73;
				Class169.anIntArray2408[188] = 71;
				Class169.anIntArray2408[223] = 28;
			} else {
				do {
					if (Signlink.aMethod750 == null) {
						Class169.anIntArray2408[222] = 59;
						Class169.anIntArray2408[192] = 58;
						if (!client.f_ob)
							break;
					}
					Class169.anIntArray2408[192] = 28;
					Class169.anIntArray2408[520] = 59;
					Class169.anIntArray2408[222] = 58;
				} while (false);
				Class169.anIntArray2408[91] = 42;
				Class169.anIntArray2408[46] = 72;
				Class169.anIntArray2408[61] = 27;
				Class169.anIntArray2408[93] = 43;
				Class169.anIntArray2408[47] = 73;
				Class169.anIntArray2408[59] = 57;
				Class169.anIntArray2408[92] = 74;
				Class169.anIntArray2408[45] = 26;
				Class169.anIntArray2408[44] = 71;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kk.G(" + i + ')');
		}
	}

	public Class110() {
		/* empty */
	}

	public static void method765(boolean bool) {
		try {
			if (bool != false)
				anInt1573 = -73;
			aClass85_1572 = null;
			index17 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kk.E(" + bool + ')');
		}
	}

	abstract long method766(byte i);

	abstract int method767(boolean bool, int i);

	static {
		new Class67("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
		aClass85_1572 = new Class85(32);
		anInt1573 = 100;
	}
}
