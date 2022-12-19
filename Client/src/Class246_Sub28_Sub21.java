/* Class246_Sub28_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub21 extends Class246_Sub28 {
	static int anInt6575;
	static Class67 aClass67_6576 = new Class67("glow3:", "leuchten3:", "brillant3:", "brilho3:");
	static int anInt6577;
	static int anInt6578;
	static int anInt6579;
	static boolean aBool6580 = false;
	static int anInt6581;
	private int anInt6582 = 32768;
	static int anInt6583;
	static IncomingPacket INDEX_14_SOUND_IN;
	static int anInt6585;
	static float aFloat6586;
	static Class175 aClass175_6587;

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6581++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			int i_1_ = 42 % ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_2_ = this.method2133(i_0_, 1, 0);
				int[] is_3_ = this.method2133(i_0_, 2, 0);
				for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_4_++) {
					int i_5_ = (0xff1 & is_2_[i_4_]) >> 4;
					int i_6_ = is_3_[i_4_] * anInt6582 >> 12;
					int i_7_ = (Class246_Sub1_Sub18.anIntArray6855[i_5_] * i_6_ >> 12);
					int i_8_ = i_6_ * Class149.anIntArray2191[i_5_] >> 12;
					int i_9_ = i_4_ + (i_7_ >> 12) & Class63_Sub1.anInt4719;
					int i_10_ = Class113.anInt1594 & (i_8_ >> 12) + i_0_;
					int[] is_11_ = this.method2133(i_10_, 0, 0);
					is[i_4_] = is_11_[i_9_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2143(int i, int i_12_, BufferStream stream) {
		try {
			int i_13_ = i_12_;
			do {
				if ((i_13_ ^ 0xffffffff) != -1) {
					if ((i_13_ ^ 0xffffffff) != -2)
						break;
				} else {
					anInt6582 = stream.readUnsignedShort((byte) 84) << 4;
					break;
				}
				((Class246_Sub28) this).aBool4947 = stream.readUnsignedByte(255) == 1;
			} while (false);
			if (i != 4)
				method2139((byte) 85, -90);
			anInt6577++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lu.G(" + i + ',' + i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub28_Sub21() {
		super(3, false);
	}

	static final boolean method2706(int i, int i_14_, int i_15_, int i_16_, int i_17_, Class199 class199, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		try {
			anInt6575++;
			int i_24_ = i_17_;
			int i_25_ = i_19_;
			if (i != -1)
				aClass67_6576 = null;
			int i_26_ = 64;
			int i_27_ = 64;
			int i_28_ = i_17_ - i_26_;
			int i_29_ = i_19_ + -i_27_;
			Class85.anIntArrayArray1119[i_26_][i_27_] = 99;
			Class7.anIntArrayArray94[i_26_][i_27_] = 0;
			int i_30_ = 0;
			int i_31_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
			Class246_Sub39.anIntArray5489[i_30_++] = i_25_;
			int[][] is = ((Class199) class199).anIntArrayArray2829;
			while_109_: while (i_30_ != i_31_) {
				i_24_ = Class246_Sub28_Sub9.anIntArray6148[i_31_];
				i_25_ = Class246_Sub39.anIntArray5489[i_31_];
				i_27_ = i_25_ - i_29_;
				i_26_ = -i_28_ + i_24_;
				i_31_ = i_31_ + 1 & 0xfff;
				int i_32_ = i_24_ + -((Class199) class199).anInt2836;
				int i_33_ = i_25_ + -((Class199) class199).anInt2841;
				int i_34_ = i_23_;
				while_101_: do {
					while_100_: do {
						while_99_: do {
							while_98_: do {
								do {
									if ((i_34_ ^ 0xffffffff) != 3) {
										if (i_34_ != -3) {
											if ((i_34_ ^ 0xffffffff) != 1) {
												if ((i_34_ ^ 0xffffffff) != 0) {
													if (i_34_ == 0 || (i_34_ ^ 0xffffffff) == -2 || i_34_ == 2 || (i_34_ ^ 0xffffffff) == -4 || i_34_ == 9)
														break while_99_;
													break while_100_;
												}
											} else
												break;
											break while_98_;
										}
									} else {
										if (((i_24_ ^ 0xffffffff) == (i_14_ ^ 0xffffffff)) && i_25_ == i_18_) {
											Class55.anInt785 = i_25_;
											Class246_Sub28_Sub32.anInt6925 = i_24_;
											return true;
										}
										break while_101_;
									}
									if (Class260.method1746(i_21_, i_18_, i_21_, i_15_, i_20_, i_25_, i_24_, i_14_, (byte) 119)) {
										Class246_Sub28_Sub32.anInt6925 = i_24_;
										Class55.anInt785 = i_25_;
										return true;
									}
									break while_101_;
								} while (false);
								if (class199.method1317(i_14_, i + 1, i_21_, i_15_, i_24_, i_16_, i_18_, i_25_, i_20_, i_21_)) {
									Class246_Sub28_Sub32.anInt6925 = i_24_;
									Class55.anInt785 = i_25_;
									return true;
								}
								break while_101_;
							} while (false);
							if (class199.method1313(i_20_, i_21_, i_14_, i_16_, i_15_, i_18_, i_24_, i ^ ~0x7c, i_25_)) {
								Class55.anInt785 = i_25_;
								Class246_Sub28_Sub32.anInt6925 = i_24_;
								return true;
							}
							break while_101_;
						} while (false);
						if (class199.method1315(i_25_, i_22_, i_18_, i_21_, i_24_, false, i_14_, i_23_)) {
							Class55.anInt785 = i_25_;
							Class246_Sub28_Sub32.anInt6925 = i_24_;
							return true;
						}
						break while_101_;
					} while (false);
					if (class199.method1322(i_22_, i_24_, false, i_23_, i_14_, i_25_, i_18_, i_21_)) {
						Class246_Sub28_Sub32.anInt6925 = i_24_;
						Class55.anInt785 = i_25_;
						return true;
					}
				} while (false);
				i_34_ = Class7.anIntArrayArray94[i_26_][i_27_] + 1;
				while_102_: do {
					if (i_26_ > 0 && (Class85.anIntArrayArray1119[i_26_ - 1][i_27_] ^ 0xffffffff) == -1 && (0x43a40000 & is[i_32_ - 1][i_33_]) == 0 && (0x4e240000 & is[i_32_ - 1][-1 + i_33_ + i_21_] ^ 0xffffffff) == -1) {
						for (int i_35_ = 1; i_35_ < i_21_ - 1; i_35_++) {
							if ((is[-1 + i_32_][i_33_ - -i_35_] & 0x4fa40000) != 0)
								break while_102_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ - 1;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_;
						Class85.anIntArrayArray1119[i_26_ - 1][i_27_] = 2;
						i_30_ = 1 + i_30_ & 0xfff;
						Class7.anIntArrayArray94[i_26_ - 1][i_27_] = i_34_;
					}
				} while (false);
				while_103_: do {
					if (i_26_ < -i_21_ + 128 && Class85.anIntArrayArray1119[i_26_ + 1][i_27_] == 0 && (is[i_32_ + i_21_][i_33_] & 0x60e40000) == 0 && ((is[i_21_ + i_32_][i_33_ - (-i_21_ + 1)] & 0x78240000) ^ 0xffffffff) == -1) {
						for (int i_36_ = 1; i_36_ < i_21_ - 1; i_36_++) {
							if ((is[i_32_ - -i_21_][i_36_ + i_33_] & 0x78e40000) != 0)
								break while_103_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_;
						Class85.anIntArrayArray1119[1 + i_26_][i_27_] = 8;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[1 + i_26_][i_27_] = i_34_;
					}
				} while (false);
				while_104_: do {
					if ((i_27_ ^ 0xffffffff) < -1 && (Class85.anIntArrayArray1119[i_26_][-1 + i_27_] ^ 0xffffffff) == -1 && (is[i_32_][i_33_ - 1] & 0x43a40000) == 0 && ((0x60e40000 & is[-1 + (i_21_ + i_32_)][-1 + i_33_]) == 0)) {
						for (int i_37_ = 1; i_21_ - 1 > i_37_; i_37_++) {
							if ((0x63e40000 & is[i_37_ + i_32_][i_33_ - 1]) != 0)
								break while_104_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ - 1;
						Class85.anIntArrayArray1119[i_26_][-1 + i_27_] = 1;
						i_30_ = 1 + i_30_ & 0xfff;
						Class7.anIntArrayArray94[i_26_][i_27_ - 1] = i_34_;
					}
				} while (false);
				while_105_: do {
					if ((i_27_ ^ 0xffffffff) > (-i_21_ + 128 ^ 0xffffffff) && Class85.anIntArrayArray1119[i_26_][i_27_ + 1] == 0 && (is[i_32_][i_33_ + i_21_] & 0x4e240000) == 0 && (is[i_32_ + i_21_ - 1][i_33_ + i_21_] & 0x78240000 ^ 0xffffffff) == -1) {
						for (int i_38_ = 1; i_21_ - 1 > i_38_; i_38_++) {
							if ((0x7e240000 & is[i_38_ + i_32_][i_21_ + i_33_] ^ 0xffffffff) != -1)
								break while_105_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ + 1;
						Class85.anIntArrayArray1119[i_26_][i_27_ + 1] = 4;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[i_26_][1 + i_27_] = i_34_;
					}
				} while (false);
				while_106_: do {
					if ((i_26_ ^ 0xffffffff) < -1 && (i_27_ ^ 0xffffffff) < -1 && (Class85.anIntArrayArray1119[-1 + i_26_][i_27_ - 1] == 0) && (is[i_32_ - 1][i_33_ - 1] & 0x43a40000 ^ 0xffffffff) == -1) {
						for (int i_39_ = 1; i_21_ > i_39_; i_39_++) {
							if ((0x4fa40000 & is[-1 + i_32_][i_33_ - 1 - -i_39_]) != 0 || (is[i_32_ - 1 - -i_39_][i_33_ - 1] & 0x63e40000) != 0)
								break while_106_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = -1 + i_24_;
						Class246_Sub39.anIntArray5489[i_30_] = i_25_ - 1;
						Class85.anIntArrayArray1119[-1 + i_26_][-1 + i_27_] = 3;
						i_30_ = 0xfff & i_30_ + 1;
						Class7.anIntArrayArray94[i_26_ - 1][-1 + i_27_] = i_34_;
					}
				} while (false);
				while_107_: do {
					if ((i_26_ ^ 0xffffffff) > (-i_21_ + 128 ^ 0xffffffff) && (i_27_ ^ 0xffffffff) < -1 && (Class85.anIntArrayArray1119[i_26_ + 1][-1 + i_27_] == 0) && (is[i_32_ - -i_21_][i_33_ - 1] & 0x60e40000 ^ 0xffffffff) == -1) {
						for (int i_40_ = 1; i_21_ > i_40_; i_40_++) {
							if ((is[i_32_ - -i_21_][i_40_ + (-1 + i_33_)] & 0x78e40000) != 0 || (is[i_32_ - -i_40_][-1 + i_33_] & 0x63e40000) != 0)
								break while_107_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
						Class246_Sub39.anIntArray5489[i_30_] = -1 + i_25_;
						i_30_ = 0xfff & 1 + i_30_;
						Class85.anIntArrayArray1119[i_26_ + 1][-1 + i_27_] = 9;
						Class7.anIntArrayArray94[1 + i_26_][-1 + i_27_] = i_34_;
					}
				} while (false);
				while_108_: do {
					if ((i_26_ ^ 0xffffffff) < -1 && -i_21_ + 128 > i_27_ && (Class85.anIntArrayArray1119[-1 + i_26_][i_27_ + 1] ^ 0xffffffff) == -1 && (0x4e240000 & is[i_32_ - 1][i_33_ - -i_21_]) == 0) {
						for (int i_41_ = 1; (i_21_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
							if ((0x4fa40000 & is[-1 + i_32_][i_33_ + i_41_] ^ 0xffffffff) != -1 || ((0x7e240000 & is[-1 + i_32_ - -i_41_][i_21_ + i_33_]) != 0))
								break while_108_;
						}
						Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ - 1;
						Class246_Sub39.anIntArray5489[i_30_] = 1 + i_25_;
						i_30_ = i_30_ + 1 & 0xfff;
						Class85.anIntArrayArray1119[i_26_ - 1][i_27_ + 1] = 6;
						Class7.anIntArrayArray94[-1 + i_26_][i_27_ + 1] = i_34_;
					}
				} while (false);
				if (-i_21_ + 128 > i_26_ && -i_21_ + 128 > i_27_ && (Class85.anIntArrayArray1119[1 + i_26_][1 + i_27_] ^ 0xffffffff) == -1 && (is[i_21_ + i_32_][i_21_ + i_33_] & 0x78240000) == 0) {
					for (int i_42_ = 1; (i_42_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_42_++) {
						if (((0x7e240000 & is[i_42_ + i_32_][i_21_ + i_33_]) != 0) || (is[i_21_ + i_32_][i_33_ - -i_42_] & 0x78e40000) != 0)
							continue while_109_;
					}
					Class246_Sub28_Sub9.anIntArray6148[i_30_] = i_24_ + 1;
					Class246_Sub39.anIntArray5489[i_30_] = 1 + i_25_;
					Class85.anIntArrayArray1119[1 + i_26_][1 + i_27_] = 12;
					i_30_ = 0xfff & i_30_ + 1;
					Class7.anIntArrayArray94[1 + i_26_][1 + i_27_] = i_34_;
				}
			}
			Class246_Sub28_Sub32.anInt6925 = i_24_;
			Class55.anInt785 = i_25_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lu.C(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + (class199 != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool == false) {
				anInt6578++;
				HashMap.method376(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.F(" + bool + ')');
		}
	}

	public static void method2707(int i) {
		do {
			try {
				aClass67_6576 = null;
				INDEX_14_SOUND_IN = null;
				aClass175_6587 = null;
				if (i == 1675886592)
					break;
				aBool6580 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lu.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2708(byte i) {
		try {
			anInt6585++;
			Class_q_Sub1.aClass54_6663.method383(75);
			Class_ls.aClass54_963.method383(99);
			Class216.aClass54_3007.method383(119);
			Class29.aClass54_387.method383(107);
			if (i <= 7)
				method2707(49);
			Class84.aClass54_1097.method383(91);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.A(" + i + ')');
		}
	}

	final int[][] method2139(byte i, int i_43_) {
		try {
			anInt6579++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 126, i_43_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[] is_44_ = this.method2133(i_43_, 1, 0);
				int[] is_45_ = this.method2133(i_43_, 2, 0);
				int[] is_46_ = is[0];
				int[] is_47_ = is[1];
				int[] is_48_ = is[2];
				for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_49_++) {
					int i_50_ = 0xff & is_44_[i_49_] * 255 >> 12;
					int i_51_ = anInt6582 * is_45_[i_49_] >> 12;
					int i_52_ = (Class246_Sub1_Sub18.anIntArray6855[i_50_] * i_51_ >> 12);
					int i_53_ = Class149.anIntArray2191[i_50_] * i_51_ >> 12;
					int i_54_ = Class63_Sub1.anInt4719 & i_49_ + (i_52_ >> 12);
					int i_55_ = Class113.anInt1594 & i_43_ + (i_53_ >> 12);
					int[][] is_56_ = this.method2141(3, 0, i_55_);
					is_46_[i_49_] = is_56_[0][i_54_];
					is_47_[i_49_] = is_56_[1][i_54_];
					is_48_[i_49_] = is_56_[2][i_54_];
				}
			}
			if (i < 33)
				method2706(5, -16, -89, 35, 67, null, 31, 94, -60, -10, -34, 98);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.J(" + i + ',' + i_43_ + ')');
		}
	}

	static final void method2709(int i, byte i_57_) {
		try {
			anInt6583++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 118, 14);
			if (i_57_ == -5)
				class246_sub1_sub10.method2604((byte) -118);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lu.B(" + i + ',' + i_57_ + ')');
		}
	}

	static {
		new Class67(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.", " deixou o canal.");
		INDEX_14_SOUND_IN = new IncomingPacket(19, 6);
		new Class67("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).", "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 100 para usu\u00e1rios n\u00e3o pagantes, e 200 para membros.");
	}
}
