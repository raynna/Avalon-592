/* Class246_Sub28_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub31 extends Class246_Sub28 {
	static int anInt6909;
	private int anInt6910;
	static int anInt6911;
	private int anInt6912 = 0;
	static int[] anIntArray6913;
	static int anInt6914;
	static int anInt6915;
	private int anInt6916 = 1;
	static int anInt6917;
	static int anInt6918;
	static int anInt6919 = 0;
	static int anInt6920;
	static int anInt6921;

	static final Class48[] method2849(boolean bool) {
		try {
			anInt6921++;
			if (bool != true)
				return null;
			return new Class48[] { Class246_Sub1_Sub10.aClass48_6204, Class246_Sub1_Sub10.aClass48_6213, Class246_Sub1_Sub10.aClass48_6215, Class246_Sub1_Sub10.aClass48_6216, Class246_Sub1_Sub10.aClass48_6217, Class246_Sub1_Sub10.aClass48_6218, Class246_Sub1_Sub10.aClass48_6219, Class246_Sub1_Sub10.aClass48_6220, Class246_Sub1_Sub10.aClass48_6221, Class246_Sub1_Sub10.aClass48_6222 };
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tg.D(" + bool + ')');
		}
	}

	final void method2134(boolean bool) {
		try {
			if (bool == false) {
				HashMap.method376(true);
				anInt6917++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tg.F(" + bool + ')');
		}
	}

	public Class246_Sub28_Sub31() {
		super(0, true);
		anInt6910 = 0;
	}

	static final void method2850(int i) {
		try {
			anInt6911++;
			if (i >= -102)
				anInt6919 = -15;
			if (!Class15.aBool231) {
				Class135.aBool1929 = true;
				do {
					if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) {
						Class24.aFloat341 += (-12.0F - Class24.aFloat341) / 2.0F;
						if (!client.f_ob)
							break;
					}
					Class59_Sub2.aFloat4553 = (float) (~0xf & -17 + (int) Class59_Sub2.aFloat4553);
				} while (false);
				Class15.aBool231 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tg.B(" + i + ')');
		}
	}

	static final void method2851(Class166 class166, int i, Class260 class260, int i_0_, int i_1_) {
		try {
			Class211.aClass166_2963.method1102(-110);
			anInt6920++;
			if (!Class100_Sub1.aBool5070) {
				if (i != 3)
					anInt6919 = 15;
				for (Class246_Sub2 class246_sub2 = (Class246_Sub2) class166.method1104(70); class246_sub2 != null; class246_sub2 = (Class246_Sub2) class166.method1108((byte) -112)) {
					Class140 class140 = Class79.aClass165_1022.method1088((((Class246_Sub2) class246_sub2).anInt3808), (byte) -41);
					if (Class242.method1562(class140, 2)) {
						boolean bool = Class246_Sub27.method2123(class260, (byte) -83, class246_sub2, class140, i_0_, i_1_);
						if (bool)
							Class162.method1074(class140, class246_sub2, (byte) 55, class260);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tg.C(" + (class166 != null ? "{...}" : "null") + ',' + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2852(int i, boolean bool, int i_2_, int i_3_) {
		try {
			if (i != 1004) {
				if (i == 1012)
					Class146.method993(client.f_mb, i_3_, i_2_);
				else if (i == 1008)
					Class146.method993(Class246_Sub28_Sub6.aClass169_6040, i_3_, i_2_);
				else if ((i ^ 0xffffffff) == -1002)
					Class146.method993(Class112.aClass169_1587, i_3_, i_2_);
				else if ((i ^ 0xffffffff) == -1007)
					Class146.method993(Class_o.aClass169_7223, i_3_, i_2_);
			} else
				Class146.method993(Class139.aClass169_1984, i_3_, i_2_);
			if (bool == true)
				anInt6914++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tg.A(" + i + ',' + bool + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method2143(int i, int i_4_, BufferStream stream) {
		try {
			if (i != 4)
				anInt6916 = 94;
			int i_5_ = i_4_;
			while_68_: do {
				do {
					if (i_5_ != 0) {
						if ((i_5_ ^ 0xffffffff) != -2) {
							if (i_5_ == 3)
								break;
							break while_68_;
						}
					} else {
						anInt6910 = stream.readUnsignedByte(255);
						break while_68_;
					}
					anInt6912 = stream.readUnsignedByte(255);
					break while_68_;
				} while (false);
				anInt6916 = stream.readUnsignedByte(255);
			} while (false);
			anInt6915++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tg.G(" + i + ',' + i_4_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2853(byte i) {
		do {
			try {
				anIntArray6913 = null;
				if (i >= 28)
					break;
				anIntArray6913 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tg.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_6_) {
		try {
			anInt6918++;
			int i_7_ = 91 % ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_6_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_8_ = Class246_Sub1_Sub11.anIntArray6245[i_6_];
				int i_9_ = i_8_ - 2048 >> 1;
				for (int i_10_ = 0; i_10_ < Class246_Sub37_Sub1.f_gb; i_10_++) {
					int i_11_ = Class187.anIntArray2654[i_10_];
					int i_12_ = -2048 + i_11_ >> 1;
					int i_13_;
					if (anInt6910 != 0) {
						int i_14_ = i_9_ * i_9_ + i_12_ * i_12_ >> 12;
						i_13_ = (int) (Math.sqrt((double) ((float) i_14_ / 4096.0F)) * 4096.0);
						i_13_ = (int) ((double) (i_13_ * anInt6916) * 3.141592653589793);
					} else
						i_13_ = (-i_8_ + i_11_) * anInt6916;
					i_13_ -= ~0xfff & i_13_;
					if (anInt6912 == 0)
						i_13_ = 4096 + (Class149.anIntArray2191[i_13_ >> 4 & 0xff]) >> 1;
					else if ((anInt6912 ^ 0xffffffff) == -3) {
						i_13_ -= 2048;
						if (i_13_ < 0)
							i_13_ = -i_13_;
						i_13_ = 2048 - i_13_ << 1;
					}
					is[i_10_] = i_13_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tg.E(" + i + ',' + i_6_ + ')');
		}
	}

	static final void method2854(int i, int i_15_) {
		try {
			if (i_15_ != 1012)
				method2851(null, -43, null, -67, 66);
			anInt6909++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 121, 5);
			class246_sub1_sub10.method2604((byte) -117);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tg.I(" + i + ',' + i_15_ + ')');
		}
	}
}
