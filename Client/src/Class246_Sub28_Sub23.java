
/* Class246_Sub28_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class246_Sub28_Sub23 extends Class246_Sub28 {
	private int anInt6635;
	private int anInt6636;
	private int anInt6637 = 81;
	static int anInt6638;
	static int anInt6639;
	private int[][] anIntArrayArray6640;
	static int anInt6641;
	static int anInt6642;
	private int[][] anIntArrayArray6643;
	private int anInt6644 = 1024;
	static int anInt6645;
	static int anInt6646;
	private int anInt6647;
	private int anInt6648 = 4;
	private int anInt6649;
	private int[] anIntArray6650;
	private int anInt6651;
	private int anInt6652;
	private int anInt6653;
	static IncomingPacket aClass13_6654 = new IncomingPacket(61, 5);
	private int anInt6655;
	static Class_l aClass_l6656;
	static OutgoingPacket aClass201_6657 = new OutgoingPacket(33, 11);
	static Class95 aClass95_6658;

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6638++;
				int i_1_ = i_0_;
				while_95_: do {
					while_94_: do {
						while_93_: do {
							while_92_: do {
								while_91_: do {
									while_90_: do {
										do {
											if (i_1_ != 0) {
												if ((i_1_ ^ 0xffffffff) != -2) {
													if (i_1_ != 2) {
														if (i_1_ != 3) {
															if ((i_1_ ^ 0xffffffff) != -5) {
																if ((i_1_ ^ 0xffffffff) != -6) {
																	if (i_1_ != 6) {
																		if (i_1_ != 7)
																			break while_95_;
																	} else
																		break while_93_;
																	break while_94_;
																}
															} else
																break while_91_;
															break while_92_;
														}
													} else
														break;
													break while_90_;
												}
											} else {
												anInt6648 = stream.readUnsignedByte(255);
												break while_95_;
											}
											anInt6655 = stream.readUnsignedByte(255);
											break while_95_;
										} while (false);
										anInt6636 = stream.readUnsignedShort((byte) 119);
										break while_95_;
									} while (false);
									anInt6647 = stream.readUnsignedShort((byte) -50);
									break while_95_;
								} while (false);
								anInt6644 = stream.readUnsignedShort((byte) 97);
								break while_95_;
							} while (false);
							anInt6652 = stream.readUnsignedShort((byte) 96);
							break while_95_;
						} while (false);
						anInt6637 = stream.readUnsignedShort((byte) -74);
						break while_95_;
					} while (false);
					anInt6649 = stream.readUnsignedShort((byte) -85);
				} while (false);
				if (i == 4)
					break;
				method2134(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("mv.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_2_) {
		try {
			anInt6641++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_2_);
			int i_3_ = -52 / ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_4_ = 0;
				int i_5_;
				for (i_5_ = (Class246_Sub1_Sub11.anIntArray6245[i_2_] - -anInt6652); (i_5_ ^ 0xffffffff) > -1; i_5_ += 4096) {
					/* empty */
				}
				for (/**/; (i_5_ ^ 0xffffffff) < -4097; i_5_ -= 4096) {
					/* empty */
				}
				for (/**/; (anInt6655 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					if (i_5_ < anIntArray6650[i_4_])
						break;
				}
				int i_6_ = -1 + i_4_;
				boolean bool = (i_4_ & 0x1) == 0;
				int i_7_ = anIntArray6650[i_4_];
				int i_8_ = anIntArray6650[i_4_ - 1];
				if ((i_5_ ^ 0xffffffff) < (i_8_ + anInt6635 ^ 0xffffffff) && i_5_ < i_7_ - anInt6635) {
					for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_9_++) {
						int i_10_ = !bool ? -anInt6644 : anInt6644;
						int i_11_ = 0;
						int i_12_;
						for (i_12_ = ((anInt6653 * i_10_ >> 12) + Class187.anIntArray2654[i_9_]); i_12_ < 0; i_12_ += 4096) {
							/* empty */
						}
						for (/**/; (i_12_ ^ 0xffffffff) < -4097; i_12_ -= 4096) {
							/* empty */
						}
						for (/**/; anInt6648 > i_11_; i_11_++) {
							if ((i_12_ ^ 0xffffffff) > (anIntArrayArray6640[i_6_][i_11_] ^ 0xffffffff))
								break;
						}
						int i_13_ = -1 + i_11_;
						int i_14_ = anIntArrayArray6640[i_6_][i_13_];
						int i_15_ = anIntArrayArray6640[i_6_][i_11_];
						if (i_12_ <= anInt6635 + i_14_ || i_12_ >= -anInt6635 + i_15_)
							is[i_9_] = 0;
						else
							is[i_9_] = anIntArrayArray6643[i_6_][i_13_];
					}
				} else
					Class117.method802(is, 0, Class246_Sub37_Sub1.f_gb, 0);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mv.E(" + i + ',' + i_2_ + ')');
		}
	}

	static final byte[] method2727(float f, float f_16_, float f_17_, float f_18_, int i, Class64 class64, int i_19_, byte i_20_, float f_21_, int i_22_, int i_23_) {
		try {
			anInt6645++;
			if (i_20_ <= 9)
				aClass201_6657 = null;
			byte[] is = new byte[i_19_ * i_22_ * i_23_];
			Class140.method946(is, f_17_, f, 0, i_23_, i_22_, f_18_, f_16_, i, 127, i_19_, f_21_, class64);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mv.B(" + f + ',' + f_16_ + ',' + f_17_ + ',' + f_18_ + ',' + i + ',' + (class64 != null ? "{...}" : "null") + ',' + i_19_ + ',' + i_20_ + ',' + f_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	public Class246_Sub28_Sub23() {
		super(0, true);
		anInt6636 = 409;
		anInt6652 = 0;
		anInt6649 = 1024;
		anInt6655 = 8;
		anInt6647 = 204;
	}

	private final void method2728(int i) {
		try {
			anInt6646++;
			Random random = new Random((long) anInt6655);
			anInt6653 = 4096 / anInt6648;
			anInt6651 = 4096 / anInt6655;
			anInt6635 = anInt6637 / 2;
			int i_24_ = anInt6653 / 2;
			anIntArray6650 = new int[1 + anInt6655];
			int i_25_ = anInt6651 / 2;
			anIntArrayArray6640 = new int[anInt6655][1 + anInt6648];
			anIntArrayArray6643 = new int[anInt6655][anInt6648];
			anIntArray6650[i] = 0;
			for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (anInt6655 ^ 0xffffffff); i_26_++) {
				if ((i_26_ ^ 0xffffffff) < -1) {
					int i_27_ = anInt6651;
					int i_28_ = ((Class122.method826((byte) 94, random, 4096) - 2048) * anInt6647 >> 12);
					i_27_ += i_28_ * i_25_ >> 12;
					anIntArray6650[i_26_] = i_27_ + anIntArray6650[i_26_ - 1];
				}
				anIntArrayArray6640[i_26_][0] = 0;
				for (int i_29_ = 0; (anInt6648 ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
					if ((i_29_ ^ 0xffffffff) < -1) {
						int i_30_ = anInt6653;
						int i_31_ = ((-2048 + Class122.method826((byte) 94, random, 4096)) * anInt6636 >> 12);
						i_30_ += i_24_ * i_31_ >> 12;
						anIntArrayArray6640[i_26_][i_29_] = i_30_ + anIntArrayArray6640[i_26_][i_29_ - 1];
					}
					anIntArrayArray6643[i_26_][i_29_] = ((anInt6649 ^ 0xffffffff) < -1 ? 4096 + -Class122.method826((byte) 94, random, anInt6649) : 4096);
				}
				anIntArrayArray6640[i_26_][anInt6648] = 4096;
			}
			anIntArray6650[anInt6655] = 4096;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mv.A(" + i + ')');
		}
	}

	public static void method2729(int i) {
		try {
			aClass95_6658 = null;
			aClass_l6656 = null;
			aClass201_6657 = null;
			if (i == -1)
				aClass13_6654 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mv.D(" + i + ')');
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool != false)
				method2729(99);
			method2728(0);
			anInt6642++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mv.F(" + bool + ')');
		}
	}

	static final int method2730(boolean bool, boolean bool_32_, int i, int i_33_) {
		try {
			if (bool != false)
				return -59;
			anInt6639++;
			Class246_Sub18 class246_sub18 = Class95.method610(71, bool_32_, i_33_);
			if (class246_sub18 == null)
				return -1;
			if (i < 0 || (((Class246_Sub18) class246_sub18).anIntArray4682.length <= i))
				return -1;
			return ((Class246_Sub18) class246_sub18).anIntArray4682[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mv.C(" + bool + ',' + bool_32_ + ',' + i + ',' + i_33_ + ')'));
		}
	}

	static {
		new Class67("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.");
	}
}
