/* Class_w - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_w extends Class246_Sub28 {
	private int[] anIntArray6372;
	private int anInt6373 = 0;
	static int anInt6374;
	static int anInt6375;
	static int anInt6376;
	private int anInt6377 = 10;
	private int anInt6378 = 2048;
	static OutgoingPacket ACTION_BUTTON4;
	static int anInt6380;
	static int anInt6381;
	private int[] anIntArray6382;
	static boolean aBool6383 = false;
	static int anInt6384;
	static int anInt6385;
	static HashMap aClass54_6386;
	static boolean aBool6387;
	static boolean aBool6388;

	final void method2134(boolean bool) {
		try {
			method2653(-3);
			if (bool != false)
				aBool6388 = true;
			anInt6385++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "w.F(" + bool + ')');
		}
	}

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6376++;
				int i_1_ = i_0_;
				while_37_: do {
					do {
						if (i_1_ != 0) {
							if (i_1_ != 1) {
								if ((i_1_ ^ 0xffffffff) == -3)
									break;
								break while_37_;
							}
						} else {
							anInt6377 = stream.readUnsignedByte(255);
							break while_37_;
						}
						anInt6378 = stream.readUnsignedShort((byte) -116);
						break while_37_;
					} while (false);
					anInt6373 = stream.readUnsignedByte(255);
				} while (false);
				if (i == 4)
					break;
				aBool6388 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("w.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2650(boolean bool, String string, Class116 class116, int i) {
		do {
			try {
				anInt6384++;
				int i_2_ = 4;
				int i_3_ = 6 - -i_2_;
				int i_4_ = i_2_ + 6;
				int i_5_ = Class246_Sub5.aClass73_3892.method468((byte) -103, string, 250, null);
				int i_6_ = (Class246_Sub5.aClass73_3892.method466(94, null, 250, string) * i);
				Class246_Sub15.aClass260_4445.O(-i_2_ + i_3_, i_4_ - i_2_, i_2_ + i_2_ + i_5_, i_2_ + i_6_ + i_2_, -16777216, 0);
				Class246_Sub15.aClass260_4445.method1753(-i_2_ + i_3_, -i_2_ + i_4_, i_2_ + i_2_ + i_5_, i_2_ + (i_2_ + i_6_), -1, 0);
				class116.method799(-1, 0, null, 0, 1, null, i_4_, i_3_, 0, 0, i_6_, i_5_, -1, 1, string, null);
				Class162.method1075(i_3_ + -i_2_, true, i_2_ + (i_6_ - -i_2_), i_2_ + i_5_ + i_2_, -i_2_ + i_4_);
				if (!bool)
					break;
				Class246_Sub15.aClass260_4445.method1688();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("w.D(" + bool + ',' + (string != null ? "{...}" : "null") + ',' + (class116 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2651(int i) {
		try {
			anInt6375++;
			Class99.method622((byte) 56, 25);
			Class246_Sub28_Sub3.method2494(2048);
			System.gc();
			int i_7_ = 82 / ((10 - i) / 47);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "w.B(" + i + ')');
		}
	}

	static final boolean method2652(char c, boolean bool) {
		try {
			anInt6381++;
			if (bool != false)
				return false;
			if ((c ^ 0xffffffff) > -49 || (c ^ 0xffffffff) < -58)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "w.A(" + c + ',' + bool + ')');
		}
	}

	private final void method2653(int i) {
		try {
			anInt6380++;
			anIntArray6372 = new int[anInt6377 + 1];
			anIntArray6382 = new int[anInt6377 + 1];
			int i_8_ = 0;
			int i_9_ = 4096 / anInt6377;
			int i_10_ = anInt6378 * i_9_ >> 12;
			if (i != -3)
				method2135(18, 43);
			for (int i_11_ = 0; (anInt6377 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
				anIntArray6372[i_11_] = i_8_;
				anIntArray6382[i_11_] = i_10_ + i_8_;
				i_8_ += i_9_;
			}
			anIntArray6372[anInt6377] = 4096;
			anIntArray6382[anInt6377] = anIntArray6382[0] + 4096;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "w.C(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_12_) {
		try {
			anInt6374++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_12_);
			int i_13_ = 20 % ((67 - i) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_14_ = Class246_Sub1_Sub11.anIntArray6245[i_12_];
				if (anInt6373 != 0) {
					for (int i_15_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++) {
						int i_16_ = 0;
						int i_17_ = 0;
						int i_18_ = Class187.anIntArray2654[i_15_];
						int i_19_ = anInt6373;
						while_38_: do {
							do {
								if ((i_19_ ^ 0xffffffff) != -2) {
									if ((i_19_ ^ 0xffffffff) != -3) {
										if (i_19_ == 3)
											break;
										break while_38_;
									}
								} else {
									i_16_ = i_18_;
									break while_38_;
								}
								i_16_ = (i_18_ + i_14_ - 4096 >> 1) + 2048;
								break while_38_;
							} while (false);
							i_16_ = (i_18_ + -i_14_ >> 1) + 2048;
						} while (false);
						for (i_19_ = 0; (i_19_ ^ 0xffffffff) > (anInt6377 ^ 0xffffffff); i_19_++) {
							if ((i_16_ ^ 0xffffffff) <= (anIntArray6372[i_19_] ^ 0xffffffff) && i_16_ < anIntArray6372[i_19_ + 1]) {
								if ((anIntArray6382[i_19_] ^ 0xffffffff) < (i_16_ ^ 0xffffffff))
									i_17_ = 4096;
								break;
							}
						}
						is[i_15_] = i_17_;
					}
				} else {
					int i_20_ = 0;
					for (int i_21_ = 0; (anInt6377 ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
						if (i_14_ >= anIntArray6372[i_21_] && i_14_ < anIntArray6372[i_21_ + 1]) {
							if (i_14_ < anIntArray6382[i_21_])
								i_20_ = 4096;
							break;
						}
					}
					Class117.method802(is, 0, Class246_Sub37_Sub1.f_gb, i_20_);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "w.E(" + i + ',' + i_12_ + ')');
		}
	}

	public static void method2654(byte i) {
		do {
			try {
				ACTION_BUTTON4 = null;
				aClass54_6386 = null;
				if (i == -48)
					break;
				method2652('\uff86', true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "w.H(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class_w() {
		super(0, true);
	}

	static {
		ACTION_BUTTON4 = new OutgoingPacket(46, 8);
		aClass54_6386 = new HashMap(64);
		aBool6387 = false;
		aBool6388 = false;
	}
}
