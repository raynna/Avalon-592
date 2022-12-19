/* Class246_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub4 extends Node {
	static int anInt3859;
	static Class3 aClass3_3860;
	static int anInt3861;
	String aString3862;
	static int anInt3863;
	static Class67 aClass67_3864;
	static int[] anIntArray3865 = new int[50];
	static int anInt3866;
	static int anInt3867;
	static int anInt3868;
	static int anInt3869;

	public static void method1806(int i) {
		try {
			aClass3_3860 = null;
			if (i == 0) {
				anIntArray3865 = null;
				aClass67_3864 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bm.B(" + i + ')');
		}
	}

	static final int method1807(byte i, Player class_r_sub1) {
		try {
			if (i >= -63)
				method1809(68, true);
			anInt3859++;
			int i_0_ = ((Player) class_r_sub1).f_cd;
			Class135 class135 = class_r_sub1.method2676(-1);
			if (!((Actor) class_r_sub1).aBool6450) {
				if (((((Class135) class135).anInt1894 ^ 0xffffffff) != (((Actor) class_r_sub1).anInt6470 ^ 0xffffffff)) && ((((Actor) class_r_sub1).anInt6470 ^ 0xffffffff) != (((Class135) class135).anInt1880 ^ 0xffffffff)) && ((((Class135) class135).anInt1890 ^ 0xffffffff) != (((Actor) class_r_sub1).anInt6470 ^ 0xffffffff)) && (((Class135) class135).anInt1914 != ((Actor) class_r_sub1).anInt6470)) {
					if ((((Actor) class_r_sub1).anInt6470 == ((Class135) class135).anInt1892) || (((Class135) class135).anInt1908 == ((Actor) class_r_sub1).anInt6470) || ((((Actor) class_r_sub1).anInt6470 ^ 0xffffffff) == (((Class135) class135).anInt1917 ^ 0xffffffff)) || ((((Actor) class_r_sub1).anInt6470 ^ 0xffffffff) == (((Class135) class135).anInt1900 ^ 0xffffffff)))
						i_0_ = ((Player) class_r_sub1).anInt7127;
				} else
					i_0_ = ((Player) class_r_sub1).anInt7132;
			} else
				i_0_ = ((Player) class_r_sub1).anInt7118;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bm.E(" + i + ',' + (class_r_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1808(int i, int i_1_, int i_2_, Npc class_r_sub2) {
		do {
			try {
				if (i_2_ != 1)
					method1809(-124, false);
				anInt3867++;
				if ((i ^ 0xffffffff) == (((Actor) class_r_sub2).anInt6426 ^ 0xffffffff) && i != -1) {
					Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i);
					int i_3_ = ((Class124) class124).anInt1737;
					if (i_3_ == 1) {
						((Actor) class_r_sub2).f_qb = i_1_;
						((Actor) class_r_sub2).anInt6452 = 0;
						((Actor) class_r_sub2).anInt6449 = 1;
						((Actor) class_r_sub2).anInt6415 = 0;
						((Actor) class_r_sub2).anInt6465 = 0;
						Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub2).anInt5060, ((Actor) class_r_sub2).anInt6452, ((Class59_Sub3) class_r_sub2).aByte5053, ((Class59_Sub3) class_r_sub2).anInt5059, true, class124, false);
					}
					if (i_3_ == 2)
						((Actor) class_r_sub2).anInt6415 = 0;
				} else if (i == -1 || (((Actor) class_r_sub2).anInt6426 ^ 0xffffffff) == 0 || (((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(i_2_ + 2, i)).anInt1747) ^ 0xffffffff) <= ((((Class124) (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r_sub2).anInt6426))).anInt1747) ^ 0xffffffff))) {
					((Actor) class_r_sub2).anInt6415 = 0;
					((Actor) class_r_sub2).anInt6449 = 1;
					((Actor) class_r_sub2).anInt6465 = 0;
					((Actor) class_r_sub2).f_sc = ((Actor) class_r_sub2).f_oc;
					((Actor) class_r_sub2).f_qb = i_1_;
					((Actor) class_r_sub2).anInt6426 = i;
					((Actor) class_r_sub2).anInt6452 = 0;
					if ((((Actor) class_r_sub2).anInt6426 ^ 0xffffffff) == 0)
						break;
					Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r_sub2).anInt5060, ((Actor) class_r_sub2).anInt6452, ((Class59_Sub3) class_r_sub2).aByte5053, ((Class59_Sub3) class_r_sub2).anInt5059, true, Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r_sub2).anInt6426), false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bm.A(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (class_r_sub2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method1809(int i, boolean bool) {
		try {
			do {
				if (!bool || Class79.aClass246_Sub1_Sub5_1020 == null) {
					Class246_Sub28_Sub15.anInt6370 = -1;
					if (!client.f_ob)
						break;
				}
				Class246_Sub28_Sub15.anInt6370 = (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5836);
			} while (false);
			anInt3861++;
			Class39.anInt571 = 0;
			Class79.aClass246_Sub1_Sub5_1020 = null;
			if (i != 4095)
				anIntArray3865 = null;
			Class246_Sub11.aClass235_4106 = null;
			Class211.aClass166_2963 = null;
			Class79.method514();
			Class79.aClass166_1034.method1102(-93);
			Class141.aClass198_2043 = null;
			Class208.aClass198_2934 = null;
			Class40.anInt617 = -1;
			Class246_Sub8.aClass198_3982 = null;
			Class139.aClass198_1986 = null;
			Class129.aClass198_1806 = null;
			Class246_Sub7_Sub1.aClass198_6080 = null;
			Class79.aClass178_1031 = null;
			Class124.aClass_l1733 = null;
			OutputStream_Sub1.anInt4489 = -1;
			Class246_Sub11.aClass198_4099 = null;
			Class246_Sub14.aClass198_4437 = null;
			Class79.aClass165_1022.method1091(-127);
			Class79.aClass254_1024.method1641(64, 64, 383137607);
			Class79.aClass165_1022.method1095(64, false, 128);
			Class79.aClass251_1028.method1615(i - 31673, 64);
			Class246_Sub30_Sub1.aClass17_5761.method166(64, -119);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bm.C(" + i + ',' + bool + ')');
		}
	}

	static final boolean method1810(byte i, int i_4_, Class199 class199, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			anInt3866++;
			int i_13_ = i_8_;
			int i_14_ = i_10_;
			if (i > -111)
				return false;
			int i_15_ = 64;
			int i_16_ = 64;
			int i_17_ = -i_15_ + i_8_;
			Class85.anIntArrayArray1119[i_15_][i_16_] = 99;
			int i_18_ = i_10_ - i_16_;
			Class7.anIntArrayArray94[i_15_][i_16_] = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_;
			Class246_Sub39.anIntArray5489[i_19_++] = i_14_;
			int[][] is = ((Class199) class199).anIntArrayArray2829;
			while (i_19_ != i_20_) {
				i_13_ = Class246_Sub28_Sub9.anIntArray6148[i_20_];
				i_14_ = Class246_Sub39.anIntArray5489[i_20_];
				i_16_ = i_14_ + -i_18_;
				i_20_ = i_20_ + 1 & 0xfff;
				i_15_ = -i_17_ + i_13_;
				int i_21_ = -((Class199) class199).anInt2836 + i_13_;
				int i_22_ = i_14_ - ((Class199) class199).anInt2841;
				int i_23_ = i_4_;
				while_43_: do {
					while_42_: do {
						while_41_: do {
							while_40_: do {
								do {
									if (i_23_ != -4) {
										if (i_23_ != -3) {
											if ((i_23_ ^ 0xffffffff) != 1) {
												if (i_23_ != -1) {
													if (((i_23_ ^ 0xffffffff) == -1) || (i_23_ ^ 0xffffffff) == -2 || (i_23_ ^ 0xffffffff) == -3 || (i_23_ ^ 0xffffffff) == -4 || ((i_23_ ^ 0xffffffff) == -10))
														break while_41_;
													break while_42_;
												}
											} else
												break;
											break while_40_;
										}
									} else {
										if (((i_13_ ^ 0xffffffff) == (i_11_ ^ 0xffffffff)) && ((i_14_ ^ 0xffffffff) == (i_9_ ^ 0xffffffff))) {
											Class55.anInt785 = i_14_;
											Class246_Sub28_Sub32.anInt6925 = i_13_;
											return true;
										}
										break while_43_;
									}
									if (Class260.method1746(2, i_9_, 2, i_7_, i_6_, i_14_, i_13_, i_11_, (byte) 127)) {
										Class55.anInt785 = i_14_;
										Class246_Sub28_Sub32.anInt6925 = i_13_;
										return true;
									}
									break while_43_;
								} while (false);
								if (class199.method1317(i_11_, 0, 2, i_7_, i_13_, i_5_, i_9_, i_14_, i_6_, 2)) {
									Class55.anInt785 = i_14_;
									Class246_Sub28_Sub32.anInt6925 = i_13_;
									return true;
								}
								break while_43_;
							} while (false);
							if (class199.method1313(i_6_, 2, i_11_, i_5_, i_7_, i_9_, i_13_, 107, i_14_)) {
								Class55.anInt785 = i_14_;
								Class246_Sub28_Sub32.anInt6925 = i_13_;
								return true;
							}
							break while_43_;
						} while (false);
						if (class199.method1315(i_14_, i_12_, i_9_, 2, i_13_, false, i_11_, i_4_)) {
							Class246_Sub28_Sub32.anInt6925 = i_13_;
							Class55.anInt785 = i_14_;
							return true;
						}
						break while_43_;
					} while (false);
					if (class199.method1322(i_12_, i_13_, false, i_4_, i_11_, i_14_, i_9_, 2)) {
						Class246_Sub28_Sub32.anInt6925 = i_13_;
						Class55.anInt785 = i_14_;
						return true;
					}
				} while (false);
				i_23_ = 1 + Class7.anIntArrayArray94[i_15_][i_16_];
				if (i_15_ > 0 && Class85.anIntArrayArray1119[-1 + i_15_][i_16_] == 0 && (is[-1 + i_21_][i_22_] & 0x43a40000) == 0 && (is[i_21_ - 1][i_22_ + 1] & 0x4e240000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = -1 + i_13_;
					Class246_Sub39.anIntArray5489[i_19_] = i_14_;
					i_19_ = 1 + i_19_ & 0xfff;
					Class85.anIntArrayArray1119[-1 + i_15_][i_16_] = 2;
					Class7.anIntArrayArray94[-1 + i_15_][i_16_] = i_23_;
				}
				if (i_15_ < 126 && Class85.anIntArrayArray1119[1 + i_15_][i_16_] == 0 && (0x60e40000 & is[2 + i_21_][i_22_] ^ 0xffffffff) == -1 && (is[i_21_ + 2][1 + i_22_] & 0x78240000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_ + 1;
					Class246_Sub39.anIntArray5489[i_19_] = i_14_;
					Class85.anIntArrayArray1119[1 + i_15_][i_16_] = 8;
					i_19_ = 0xfff & i_19_ + 1;
					Class7.anIntArrayArray94[1 + i_15_][i_16_] = i_23_;
				}
				if ((i_16_ ^ 0xffffffff) < -1 && Class85.anIntArrayArray1119[i_15_][-1 + i_16_] == 0 && (is[i_21_][i_22_ - 1] & 0x43a40000) == 0 && (0x60e40000 & is[1 + i_21_][-1 + i_22_]) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_;
					Class246_Sub39.anIntArray5489[i_19_] = -1 + i_14_;
					Class85.anIntArrayArray1119[i_15_][-1 + i_16_] = 1;
					i_19_ = 0xfff & i_19_ + 1;
					Class7.anIntArrayArray94[i_15_][i_16_ - 1] = i_23_;
				}
				if ((i_16_ ^ 0xffffffff) > -127 && Class85.anIntArrayArray1119[i_15_][1 + i_16_] == 0 && (0x4e240000 & is[i_21_][2 + i_22_]) == 0 && ((0x78240000 & is[1 + i_21_][i_22_ + 2] ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_;
					Class246_Sub39.anIntArray5489[i_19_] = 1 + i_14_;
					i_19_ = 0xfff & i_19_ + 1;
					Class85.anIntArrayArray1119[i_15_][1 + i_16_] = 4;
					Class7.anIntArrayArray94[i_15_][i_16_ + 1] = i_23_;
				}
				if ((i_15_ ^ 0xffffffff) < -1 && i_16_ > 0 && Class85.anIntArrayArray1119[i_15_ - 1][i_16_ - 1] == 0 && (is[-1 + i_21_][i_22_] & 0x4fa40000) == 0 && (0x43a40000 & is[i_21_ - 1][i_22_ - 1]) == 0 && (is[i_21_][-1 + i_22_] & 0x63e40000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_ - 1;
					Class246_Sub39.anIntArray5489[i_19_] = -1 + i_14_;
					Class85.anIntArrayArray1119[-1 + i_15_][-1 + i_16_] = 3;
					i_19_ = 0xfff & i_19_ + 1;
					Class7.anIntArrayArray94[i_15_ - 1][i_16_ - 1] = i_23_;
				}
				if (i_15_ < 126 && (i_16_ ^ 0xffffffff) < -1 && Class85.anIntArrayArray1119[i_15_ + 1][i_16_ - 1] == 0 && ((is[i_21_ + 1][-1 + i_22_] & 0x63e40000 ^ 0xffffffff) == -1) && (0x60e40000 & is[i_21_ + 2][-1 + i_22_]) == 0 && (is[2 + i_21_][i_22_] & 0x78e40000) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_ + 1;
					Class246_Sub39.anIntArray5489[i_19_] = -1 + i_14_;
					i_19_ = 0xfff & i_19_ + 1;
					Class85.anIntArrayArray1119[1 + i_15_][i_16_ - 1] = 9;
					Class7.anIntArrayArray94[1 + i_15_][-1 + i_16_] = i_23_;
				}
				if (i_15_ > 0 && i_16_ < 126 && Class85.anIntArrayArray1119[i_15_ - 1][i_16_ + 1] == 0 && (0x4fa40000 & is[i_21_ - 1][i_22_ + 1]) == 0 && ((is[i_21_ - 1][2 + i_22_] & 0x4e240000 ^ 0xffffffff) == -1) && ((is[i_21_][2 + i_22_] & 0x7e240000 ^ 0xffffffff) == -1)) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = -1 + i_13_;
					Class246_Sub39.anIntArray5489[i_19_] = i_14_ + 1;
					Class85.anIntArrayArray1119[-1 + i_15_][1 + i_16_] = 6;
					i_19_ = 1 + i_19_ & 0xfff;
					Class7.anIntArrayArray94[i_15_ - 1][1 + i_16_] = i_23_;
				}
				if (i_15_ < 126 && (i_16_ ^ 0xffffffff) > -127 && (Class85.anIntArrayArray1119[i_15_ + 1][i_16_ + 1] ^ 0xffffffff) == -1 && (is[i_21_ + 1][i_22_ + 2] & 0x7e240000) == 0 && (is[2 + i_21_][i_22_ + 2] & 0x78240000) == 0 && (0x78e40000 & is[2 + i_21_][1 + i_22_]) == 0) {
					Class246_Sub28_Sub9.anIntArray6148[i_19_] = i_13_ + 1;
					Class246_Sub39.anIntArray5489[i_19_] = i_14_ + 1;
					i_19_ = 1 + i_19_ & 0xfff;
					Class85.anIntArrayArray1119[i_15_ + 1][i_16_ + 1] = 12;
					Class7.anIntArrayArray94[i_15_ + 1][i_16_ + 1] = i_23_;
				}
			}
			Class55.anInt785 = i_14_;
			Class246_Sub28_Sub32.anInt6925 = i_13_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bm.D(" + i + ',' + i_4_ + ',' + (class199 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public Class246_Sub4() {
		/* empty */
	}

	Class246_Sub4(String string) {
		try {
			((Class246_Sub4) this).aString3862 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bm.<init>(" + (string != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass67_3864 = new Class67("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise \u00e0 jour en cours", "Conectando ao servidor de atualiza\u00e7\u00e3o");
		anInt3868 = 0;
		anInt3869 = 0;
	}
}
