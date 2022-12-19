/* Class246_Sub28_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub19 extends Class246_Sub28 {
	static int anInt6532;
	static OutgoingPacket aClass201_6533;
	private int anInt6534;
	static int anInt6535;
	static int anInt6536;
	private int anInt6537;
	private int anInt6538 = 2048;
	private int anInt6539;
	private int anInt6540;
	static int anInt6541 = 2;
	private int anInt6542;
	private int anInt6543;
	static int anInt6544;
	static int anInt6545;
	static int anInt6546;
	static int anInt6547 = 0;
	static Class182 aClass182_6548;
	static float aFloat6549;
	/* synthetic */ static Class aClass6550;

	static final boolean method2691(byte i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt6544++;
			if (i >= -51)
				method2691((byte) -46, -8, -110, -80);
			Class_f class_f = (Class_f) Class246_Sub22.method2082(i_1_, i_2_, i_0_);
			boolean bool = true;
			if (class_f != null)
				bool &= Class246_Sub1_Sub17.method2760(27298, class_f);
			class_f = ((Class_f) Class17.method168(i_1_, i_2_, i_0_, (aClass6550 != null ? aClass6550 : (aClass6550 = getClassByName("Class_f")))));
			if (class_f != null)
				bool &= Class246_Sub1_Sub17.method2760(27298, class_f);
			class_f = (Class_f) Class246_Sub14.method1997(i_1_, i_2_, i_0_);
			if (class_f != null)
				bool &= Class246_Sub1_Sub17.method2760(27298, class_f);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kt.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method2692(byte i) {
		try {
			if (i == 18) {
				aClass201_6533 = null;
				aClass182_6548 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kt.B(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_3_) {
		try {
			anInt6535++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_3_);
			int i_4_ = -59 % ((67 - i) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_5_ = Class246_Sub1_Sub11.anIntArray6245[i_3_] - 2048;
				for (int i_6_ = 0; Class246_Sub37_Sub1.f_gb > i_6_; i_6_++) {
					int i_7_ = -2048 + Class187.anIntArray2654[i_6_];
					int i_8_ = i_7_ + anInt6538;
					i_8_ = (i_8_ ^ 0xffffffff) > 2047 ? i_8_ + 4096 : i_8_;
					i_8_ = (i_8_ ^ 0xffffffff) < -2049 ? -4096 + i_8_ : i_8_;
					int i_9_ = anInt6537 + i_5_;
					i_9_ = (i_9_ ^ 0xffffffff) > 2047 ? i_9_ + 4096 : i_9_;
					i_9_ = i_9_ <= 2048 ? i_9_ : i_9_ - 4096;
					int i_10_ = i_7_ - -anInt6540;
					i_10_ = i_10_ < -2048 ? i_10_ + 4096 : i_10_;
					i_10_ = ((i_10_ ^ 0xffffffff) >= -2049 ? i_10_ : -4096 + i_10_);
					int i_11_ = i_5_ + anInt6539;
					i_11_ = (i_11_ ^ 0xffffffff) > 2047 ? 4096 + i_11_ : i_11_;
					i_11_ = i_11_ <= 2048 ? i_11_ : i_11_ - 4096;
					is[i_6_] = (method2693(i_8_, i_9_, -1364948212) || method2694(i_11_, i_10_, (byte) -8)) ? 4096 : 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kt.E(" + i + ',' + i_3_ + ')');
		}
	}

	public Class246_Sub28_Sub19() {
		super(0, true);
		anInt6534 = 4096;
		anInt6537 = 0;
		anInt6539 = 2048;
		anInt6542 = 12288;
		anInt6540 = 0;
		anInt6543 = 8192;
	}

	final void method2143(int i, int i_12_, BufferStream stream) {
		try {
			if (i == 4) {
				int i_13_ = i_12_;
				while_124_: do {
					while_123_: do {
						while_122_: do {
							while_121_: do {
								while_120_: do {
									do {
										if ((i_13_ ^ 0xffffffff) != -1) {
											if (i_13_ != 1) {
												if ((i_13_ ^ 0xffffffff) != -3) {
													if ((i_13_ ^ 0xffffffff) != -4) {
														if ((i_13_ ^ 0xffffffff) != -5) {
															if (i_13_ != 5) {
																if (i_13_ == 6)
																	break while_123_;
																break while_124_;
															}
														} else
															break while_121_;
														break while_122_;
													}
												} else
													break;
												break while_120_;
											}
										} else {
											anInt6538 = stream.readUnsignedShort((byte) -114);
											break while_124_;
										}
										anInt6537 = stream.readUnsignedShort((byte) 116);
										break while_124_;
									} while (false);
									anInt6540 = stream.readUnsignedShort((byte) 89);
									break while_124_;
								} while (false);
								anInt6539 = stream.readUnsignedShort((byte) 90);
								break while_124_;
							} while (false);
							anInt6542 = stream.readUnsignedShort((byte) -63);
							break while_124_;
						} while (false);
						anInt6534 = stream.readUnsignedShort((byte) -36);
						break while_124_;
					} while (false);
					anInt6543 = stream.readUnsignedShort((byte) 118);
				} while (false);
				anInt6536++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kt.G(" + i + ',' + i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final boolean method2693(int i, int i_14_, int i_15_) {
		try {
			anInt6545++;
			int i_16_ = (-i + i_14_) * anInt6542 >> 12;
			int i_17_ = (Class246_Sub1_Sub18.anIntArray6855[(i_16_ * 255 & 0xfff2a) >> 12]);
			i_17_ = (i_17_ << 12) / anInt6542;
			i_17_ = (i_17_ << 12) / anInt6543;
			i_17_ = i_17_ * anInt6534 >> 12;
			if (i_15_ != -1364948212)
				aClass182_6548 = null;
			if (i_14_ + i >= i_17_ || (-i_17_ ^ 0xffffffff) <= (i + i_14_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kt.D(" + i + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	private final boolean method2694(int i, int i_18_, byte i_19_) {
		try {
			anInt6532++;
			int i_20_ = anInt6542 * (i_18_ + i) >> 12;
			int i_21_ = Class246_Sub1_Sub18.anIntArray6855[255 * i_20_ >> 12 & 0xff];
			i_21_ = (i_21_ << 12) / anInt6542;
			i_21_ = (i_21_ << 12) / anInt6543;
			i_21_ = anInt6534 * i_21_ >> 12;
			if (i_19_ != -8)
				anInt6537 = 96;
			if (i_21_ <= -i_18_ + i || i + -i_18_ <= -i_21_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kt.A(" + i + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool != false)
				aClass182_6548 = null;
			HashMap.method376(!bool);
			anInt6546++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kt.F(" + bool + ')');
		}
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		aClass201_6533 = new OutgoingPacket(45, 3);
	}
}
