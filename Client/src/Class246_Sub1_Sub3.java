/* Class246_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub3 extends Class246_Sub1 {
	int[] anIntArray5699;
	static int anInt5700;
	static int anInt5701;
	static int[] anIntArray5702 = new int[32];
	static int anInt5703;
	static int anInt5704;
	static int anInt5705;
	static int anInt5706;
	static Class_l aClass_l5707;
	private String[] aStringArray5708;
	static int anInt5709;
	static int anInt5710;
	Class65 aClass65_5711;
	static int anInt5712;
	static int anInt5713;
	private int[] anIntArray5714;
	static int[] anIntArray5715 = new int[2];
	static int anInt5716;
	private int[][] anIntArrayArray5717;
	static int anInt5718;
	static int anInt5719 = 1337;
	boolean aBool5720 = true;
	static Class67 aClass67_5721;

	final Class81 method2428(int i, int i_0_) {
		try {
			anInt5700++;
			if (anIntArray5714 == null || (i ^ 0xffffffff) > -1 || anIntArray5714.length < i)
				return null;
			int i_1_ = 48 % ((-37 - i_0_) / 41);
			return Class5.method62(anIntArray5714[i], 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.P(" + i + ',' + i_0_ + ')');
		}
	}

	final int method2429(int i, boolean bool, int i_2_) {
		try {
			anInt5701++;
			if (bool != false)
				aClass67_5721 = null;
			if (anIntArray5714 == null || i_2_ < 0 || (anIntArray5714.length ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
				return -1;
			if (anIntArrayArray5717[i_2_] == null || i < 0 || (i ^ 0xffffffff) < (anIntArrayArray5717[i_2_].length ^ 0xffffffff))
				return -1;
			return anIntArrayArray5717[i_2_][i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("au.G(" + i + ',' + bool + ',' + i_2_ + ')'));
		}
	}

	final void method2430(int i) {
		try {
			if (((Class246_Sub1_Sub3) this).anIntArray5699 != null) {
				for (int i_3_ = 0; ((((Class246_Sub1_Sub3) this).anIntArray5699.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++)
					((Class246_Sub1_Sub3) this).anIntArray5699[i_3_] = Class236.method1523((((Class246_Sub1_Sub3) this).anIntArray5699[i_3_]), 32768);
			}
			int i_4_ = 96 % ((9 - i) / 63);
			anInt5718++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.F(" + i + ')');
		}
	}

	final String method2431(int i) {
		try {
			anInt5704++;
			StringBuffer stringbuffer = new StringBuffer(80);
			if (aStringArray5708 == null)
				return "";
			stringbuffer.append(aStringArray5708[i]);
			for (int i_5_ = 1; aStringArray5708.length > i_5_; i_5_++) {
				stringbuffer.append("...");
				stringbuffer.append(aStringArray5708[i_5_]);
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.B(" + i + ')');
		}
	}

	public static void method2432(int i) {
		do {
			try {
				aClass_l5707 = null;
				aClass67_5721 = null;
				anIntArray5715 = null;
				anIntArray5702 = null;
				if (i >= 100)
					break;
				aClass67_5721 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "au.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2433(byte i, int[] is, BufferStream stream) {
		while_14_: do {
			try {
				anInt5703++;
				if (i <= 22)
					anIntArray5702 = null;
				if (anIntArray5714 != null) {
					int i_6_ = 0;
					for (;;) {
						if (i_6_ >= anIntArray5714.length)
							break while_14_;
						if (i_6_ >= is.length)
							break;
						int i_7_ = ((Class81) method2428(i_6_, 122)).anInt1061;
						if (i_7_ > 0)
							stream.method2389(i_7_, (long) is[i_6_], (byte) 12);
						i_6_++;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("au.H(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2434(BufferStream stream, int i) {
		try {
			if (i == 9536) {
				for (;;) {
					int i_8_ = stream.readUnsignedByte(255);
					if (i_8_ == 0)
						break;
					method2437(stream, i_8_, false);
				}
				anInt5705++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.I(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method2435(int i) {
		try {
			anInt5713++;
			if (i != 0)
				anIntArray5714 = null;
			if (anIntArray5714 == null)
				return 0;
			return anIntArray5714.length;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.C(" + i + ')');
		}
	}

	final String method2436(BufferStream stream, int i) {
		try {
			anInt5709++;
			if (i != -127)
				method2431(-72);
			StringBuffer stringbuffer = new StringBuffer(80);
			if (anIntArray5714 != null) {
				for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (anIntArray5714.length ^ 0xffffffff)); i_9_++) {
					stringbuffer.append(aStringArray5708[i_9_]);
					stringbuffer.append(((Class246_Sub1_Sub3) this).aClass65_5711.method425(method2428(i_9_, 6), (byte) -123, anIntArrayArray5717[i_9_], stream.method2355(i ^ 0x5ffe, ((Class81) Class5.method62((anIntArray5714[i_9_]), 0)).anInt1063)));
				}
			}
			stringbuffer.append(aStringArray5708[-1 + aStringArray5708.length]);
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "au.E(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method2437(BufferStream stream, int i, boolean bool) {
		try {
			if (bool != false)
				anInt5710 = 37;
			anInt5716++;
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2) {
					int i_10_ = stream.readUnsignedByte(255);
					((Class246_Sub1_Sub3) this).anIntArray5699 = new int[i_10_];
					for (int i_11_ = 0; i_10_ > i_11_; i_11_++)
						((Class246_Sub1_Sub3) this).anIntArray5699[i_11_] = stream.readUnsignedShort((byte) -39);
				} else if ((i ^ 0xffffffff) == -4) {
					int i_12_ = stream.readUnsignedByte(255);
					anIntArrayArray5717 = new int[i_12_][];
					anIntArray5714 = new int[i_12_];
					for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
						int i_14_ = stream.readUnsignedShort((byte) 117);
						Class81 class81 = Class5.method62(i_14_, 0);
						if (class81 != null) {
							anIntArray5714[i_13_] = i_14_;
							anIntArrayArray5717[i_13_] = new int[((Class81) class81).anInt1062];
							for (int i_15_ = 0; ((Class81) class81).anInt1062 > i_15_; i_15_++)
								anIntArrayArray5717[i_13_][i_15_] = stream.readUnsignedShort((byte) 121);
						}
					}
				} else if ((i ^ 0xffffffff) == -5)
					((Class246_Sub1_Sub3) this).aBool5720 = false;
			} else
				aStringArray5708 = Class60.method412((byte) -84, stream.readString((byte) -40), '<');
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("au.D(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
		}
	}

	static final int method2438(int i, int i_16_, int i_17_) {
		try {
			anInt5712++;
			i = (i_17_ & 0x7f) * i >> 7;
			if (i_16_ != 0)
				method2432(-54);
			do {
				if (i >= 2) {
					if ((i ^ 0xffffffff) >= -127)
						break;
					i = 126;
					if (!client.f_ob)
						break;
				}
				i = 2;
			} while (false);
			return (0xff80 & i_17_) + i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("au.J(" + i + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	public Class246_Sub1_Sub3() {
		/* empty */
	}

	static {
		int i = 2;
		for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -33; i_18_++) {
			anIntArray5702[i_18_] = i - 1;
			i += i;
		}
		aClass67_5721 = new Class67("Examine", "Untersuchen", "Examiner", "Examinar");
	}
}
