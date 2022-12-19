/* Class246_Sub28_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub36 extends Class246_Sub28 {
	static Class59_Sub3[] aClass59_Sub3Array7018;
	static int anInt7019;
	private int anInt7020;
	private int anInt7021;
	private int anInt7022;
	private int anInt7023 = 0;
	static int anInt7024;
	static int anInt7025;
	static int anInt7026;
	private int anInt7027;
	private int anInt7028 = 0;
	static int anInt7029;
	private int anInt7030;
	private int anInt7031;
	static Class133 aClass133_7032;
	static OutgoingPacket aClass201_7033;
	private int anInt7034 = 0;

	private final void method2876(int i, int i_0_, int i_1_, int i_2_) {
		do {
			try {
				anInt7024++;
				int i_3_ = ((i_1_ ^ 0xffffffff) >= -2049 ? i_1_ * (i_0_ + 4096) >> 12 : -(i_1_ * i_0_ >> 12) + (i_0_ + i_1_));
				while_51_: do {
					if (i_3_ <= 0)
						anInt7020 = anInt7021 = anInt7031 = i_1_;
					else {
						i_2_ *= 6;
						int i_4_ = -i_3_ + i_1_ + i_1_;
						int i_5_ = (i_3_ + -i_4_ << 12) / i_3_;
						int i_6_ = i_2_ >> 12;
						int i_7_ = i_2_ + -(i_6_ << 12);
						int i_8_ = i_3_;
						i_8_ = i_8_ * i_5_ >> 12;
						i_8_ = i_8_ * i_7_ >> 12;
						int i_9_ = i_4_ - -i_8_;
						int i_10_ = -i_8_ + i_3_;
						int i_11_ = i_6_;
						while_50_: do {
							while_49_: do {
								while_48_: do {
									do {
										if ((i_11_ ^ 0xffffffff) != -1) {
											if (i_11_ != 1) {
												if (i_11_ != 2) {
													if ((i_11_ ^ 0xffffffff) != -4) {
														if (i_11_ != 4) {
															if (i_11_ != 5)
																break while_51_;
														} else
															break while_49_;
														break while_50_;
													}
												} else
													break;
												break while_48_;
											}
										} else {
											anInt7021 = i_9_;
											anInt7020 = i_3_;
											anInt7031 = i_4_;
											break while_51_;
										}
										anInt7031 = i_4_;
										anInt7021 = i_3_;
										anInt7020 = i_10_;
										break while_51_;
									} while (false);
									anInt7031 = i_9_;
									anInt7021 = i_3_;
									anInt7020 = i_4_;
									break while_51_;
								} while (false);
								anInt7031 = i_3_;
								anInt7020 = i_4_;
								anInt7021 = i_10_;
								break while_51_;
							} while (false);
							anInt7021 = i_4_;
							anInt7031 = i_3_;
							anInt7020 = i_9_;
							break while_51_;
						} while (false);
						anInt7020 = i_3_;
						anInt7021 = i_4_;
						anInt7031 = i_10_;
					}
				} while (false);
				if (i == 100)
					break;
				anInt7028 = -95;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vm.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2877(int i, int i_12_, int i_13_, int i_14_) {
		try {
			i_14_ = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587 * i_14_) >> 8;
			int i_15_ = 20 % ((59 - i_12_) / 58);
			anInt7025++;
			do {
				if (i != -1 || Class_w.aBool6383) {
					if ((i ^ 0xffffffff) == 0 || (i == Class36.anInt512 && Class59.method404((byte) -89)) || (i_14_ ^ 0xffffffff) == -1 || Class_w.aBool6383)
						break;
					Class59_Sub3_Sub4.method2863(i_14_, Class21.index6, (byte) -89, i_13_, false, 0, i);
					if (!client.f_ob)
						break;
				}
				Class57.method394((byte) 127);
			} while (false);
			Class36.anInt512 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vm.D(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public Class246_Sub28_Sub36() {
		super(1, false);
	}

	private final void method2878(int i, int i_16_, int i_17_, int i_18_) {
		try {
			anInt7029++;
			int i_19_ = (i_16_ ^ 0xffffffff) <= (i ^ 0xffffffff) ? i_16_ : i;
			i_19_ = i_17_ > i_19_ ? i_17_ : i_19_;
			int i_20_ = (i ^ 0xffffffff) > (i_16_ ^ 0xffffffff) ? i : i_16_;
			i_20_ = (i_17_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff) ? i_20_ : i_17_;
			int i_21_ = -i_20_ + i_19_;
			anInt7022 = (i_20_ - -i_19_) / 2;
			if ((i_21_ ^ 0xffffffff) < -1) {
				int i_22_ = (-i + i_19_ << 12) / i_21_;
				int i_23_ = (-i_16_ + i_19_ << 12) / i_21_;
				int i_24_ = (i_19_ + -i_17_ << 12) / i_21_;
				if (i == i_19_)
					anInt7027 = ((i_16_ ^ 0xffffffff) == (i_20_ ^ 0xffffffff) ? i_24_ + 20480 : 4096 - i_23_);
				else if (i_16_ != i_19_)
					anInt7027 = ((i ^ 0xffffffff) == (i_20_ ^ 0xffffffff) ? i_23_ + 12288 : -i_22_ + 20480);
				else
					anInt7027 = ((i_17_ ^ 0xffffffff) == (i_20_ ^ 0xffffffff) ? 4096 + i_22_ : 12288 + -i_24_);
				anInt7027 /= 6;
			} else
				anInt7027 = 0;
			if ((anInt7022 ^ 0xffffffff) < -1 && (anInt7022 ^ 0xffffffff) > -4097)
				anInt7030 = (i_21_ << 12) / (anInt7022 <= 2048 ? 2 * anInt7022 : -(2 * anInt7022) + 8192);
			else
				anInt7030 = 0;
			int i_25_ = 75 % ((-68 - i_18_) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vm.A(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	final void method2143(int i, int i_26_, BufferStream stream) {
		try {
			if (i != 4)
				aClass201_7033 = null;
			int i_27_ = i_26_;
			while_52_: do {
				do {
					if ((i_27_ ^ 0xffffffff) != -1) {
						if (i_27_ != 1) {
							if ((i_27_ ^ 0xffffffff) == -3)
								break;
							break while_52_;
						}
					} else {
						anInt7034 = stream.method2375((byte) 1);
						break while_52_;
					}
					anInt7023 = (stream.readByte(false) << 12) / 100;
					break while_52_;
				} while (false);
				anInt7028 = (stream.readByte(false) << 12) / 100;
			} while (false);
			anInt7019++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vm.G(" + i + ',' + i_26_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method2139(byte i, int i_28_) {
		try {
			anInt7026++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 90, i_28_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_29_ = this.method2141(3, 0, i_28_);
				int[] is_30_ = is_29_[0];
				int[] is_31_ = is_29_[1];
				int[] is_32_ = is_29_[2];
				int[] is_33_ = is[0];
				int[] is_34_ = is[1];
				int[] is_35_ = is[2];
				for (int i_36_ = 0; i_36_ < Class246_Sub37_Sub1.f_gb; i_36_++) {
					method2878(is_30_[i_36_], is_31_[i_36_], is_32_[i_36_], 36);
					anInt7022 += anInt7028;
					anInt7027 += anInt7034;
					anInt7030 += anInt7023;
					for (/**/; anInt7027 < 0; anInt7027 += 4096) {
						/* empty */
					}
					if ((anInt7030 ^ 0xffffffff) > -1)
						anInt7030 = 0;
					for (/**/; (anInt7027 ^ 0xffffffff) < -4097; anInt7027 -= 4096) {
						/* empty */
					}
					if ((anInt7030 ^ 0xffffffff) < -4097)
						anInt7030 = 4096;
					if (anInt7022 < 0)
						anInt7022 = 0;
					if (anInt7022 > 4096)
						anInt7022 = 4096;
					method2876(100, anInt7030, anInt7022, anInt7027);
					is_33_[i_36_] = anInt7020;
					is_34_[i_36_] = anInt7021;
					is_35_[i_36_] = anInt7031;
				}
			}
			if (i <= 33)
				method2139((byte) -70, 115);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vm.J(" + i + ',' + i_28_ + ')');
		}
	}

	public static void method2879(byte i) {
		try {
			aClass133_7032 = null;
			aClass59_Sub3Array7018 = null;
			if (i >= -95)
				method2877(5, 57, -60, -9);
			aClass201_7033 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vm.B(" + i + ')');
		}
	}

	static {
		new Class67("Please close the interface you have open before using 'Report Abuse'.", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		aClass133_7032 = new Class133();
		aClass201_7033 = new OutgoingPacket(12, 4);
	}
}
