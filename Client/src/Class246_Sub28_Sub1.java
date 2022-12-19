/* Class246_Sub28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub1 extends Class246_Sub28 {
	private int anInt5786;
	static int anInt5787;
	private int anInt5788;
	static int anInt5789;
	private int anInt5790;
	static int[] anIntArray5791 = new int[1000];
	static int anInt5792;
	static int anInt5793;
	static int anInt5794;

	private Class246_Sub28_Sub1(int i) {
		super(0, false);
		try {
			method2456(i, (byte) -88);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bj.<init>(" + i + ')');
		}
	}

	static final void decodeGlobalPlayerUpdate(Stream_Sub1 stream_sub1, int i) {
		try {
			anInt5787++;
			int i_0_ = i;
			stream_sub1.method2477(i ^ ~0x3a5);
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (Class246_Sub4.anInt3869 ^ 0xffffffff); i_1_++) {
				int i_2_ = Class53.anIntArray755[i_1_];
				if ((0x1 & Class246_Sub1_Sub8.aByteArray6107[i_2_] ^ 0xffffffff) == -1) {
					if (i_0_ > 0) {
						i_0_--;
						Class246_Sub1_Sub8.aByteArray6107[i_2_] = (byte) Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_2_]), 2);
					} else {
						int i_3_ = stream_sub1.readBits(-86, 1);
						if (i_3_ == 0) {
							i_0_ = Class235.method1510((byte) -37, stream_sub1);
							Class246_Sub1_Sub8.aByteArray6107[i_2_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_2_]), 2));
						} else
							Class85.method546(stream_sub1, i_2_, (byte) -64);
					}
				}
			}
			stream_sub1.method2476((byte) -93);
			if (i_0_ != 0)
				throw new RuntimeException("nsn0");
			stream_sub1.method2477(i ^ ~0x3a5);
			for (int i_4_ = 0; i_4_ < Class246_Sub4.anInt3869; i_4_++) {
				int i_5_ = Class53.anIntArray755[i_4_];
				if ((Class246_Sub1_Sub8.aByteArray6107[i_5_] & 0x1 ^ 0xffffffff) != -1) {
					if ((i_0_ ^ 0xffffffff) < -1) {
						Class246_Sub1_Sub8.aByteArray6107[i_5_] = (byte) Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_5_]), 2);
						i_0_--;
					} else {
						int i_6_ = stream_sub1.readBits(-108, 1);
						if ((i_6_ ^ 0xffffffff) == -1) {
							i_0_ = Class235.method1510((byte) -37, stream_sub1);
							Class246_Sub1_Sub8.aByteArray6107[i_5_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_5_]), 2));
						} else
							Class85.method546(stream_sub1, i_5_, (byte) -64);
					}
				}
			}
			stream_sub1.method2476((byte) 94);
			if (i_0_ != 0)
				throw new RuntimeException("nsn1");
			stream_sub1.method2477(i ^ ~0x3a5);
			for (int i_7_ = 0; i_7_ < Class183.anInt2541; i_7_++) {
				int i_8_ = Class172.anIntArray2430[i_7_];
				if ((0x1 & Class246_Sub1_Sub8.aByteArray6107[i_8_] ^ 0xffffffff) != -1) {
					if ((i_0_ ^ 0xffffffff) < -1) {
						i_0_--;
						Class246_Sub1_Sub8.aByteArray6107[i_8_] = (byte) Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_8_]), 2);
					} else {
						int i_9_ = stream_sub1.readBits(-57, 1);
						if (i_9_ == 0) {
							i_0_ = Class235.method1510((byte) -37, stream_sub1);
							Class246_Sub1_Sub8.aByteArray6107[i_8_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_8_]), 2));
						} else if (Class232.method1489(stream_sub1, i ^ 0x55, i_8_))
							Class246_Sub1_Sub8.aByteArray6107[i_8_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_8_]), 2));
					}
				}
			}
			stream_sub1.method2476((byte) -75);
			if ((i_0_ ^ 0xffffffff) != -1)
				throw new RuntimeException("nsn2");
			stream_sub1.method2477(-934);
			for (int i_10_ = 0; Class183.anInt2541 > i_10_; i_10_++) {
				int i_11_ = Class172.anIntArray2430[i_10_];
				if ((0x1 & Class246_Sub1_Sub8.aByteArray6107[i_11_]) == 0) {
					if (i_0_ > 0) {
						Class246_Sub1_Sub8.aByteArray6107[i_11_] = (byte) Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_11_]), 2);
						i_0_--;
					} else {
						int i_12_ = stream_sub1.readBits(-63, 1);
						if ((i_12_ ^ 0xffffffff) == -1) {
							i_0_ = Class235.method1510((byte) -37, stream_sub1);
							Class246_Sub1_Sub8.aByteArray6107[i_11_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_11_]), 2));
						} else if (Class232.method1489(stream_sub1, i + 109, i_11_))
							Class246_Sub1_Sub8.aByteArray6107[i_11_] = (byte) (Class236.method1523((Class246_Sub1_Sub8.aByteArray6107[i_11_]), 2));
					}
				}
			}
			stream_sub1.method2476((byte) 78);
			if (i_0_ != 0)
				throw new RuntimeException("nsn3");
			Class183.anInt2541 = 0;
			Class246_Sub4.anInt3869 = 0;
			for (int i_13_ = 1; i_13_ < 2048; i_13_++) {
				Class246_Sub1_Sub8.aByteArray6107[i_13_] >>= 1;
				Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_13_];
				if (class_r_sub1 != null)
					Class53.anIntArray755[Class246_Sub4.anInt3869++] = i_13_;
				else
					Class172.anIntArray2430[Class183.anInt2541++] = i_13_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bj.D(" + (stream_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2454(byte i) {
		try {
			int i_14_ = -122 % ((-7 - i) / 42);
			anIntArray5791 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bj.B(" + i + ')');
		}
	}

	static final void method2455(int i, float f, int i_15_, int i_16_, boolean bool, int i_17_, float[] fs, int i_18_, int i_19_, int i_20_) {
		try {
			i -= i_20_;
			anInt5792++;
			i_17_ -= i_19_;
			if (bool == true) {
				i_15_ -= i_16_;
				float f_21_ = fs[2] * (float) i + ((float) i_17_ * fs[1] + fs[0] * (float) i_15_);
				float f_22_ = (float) i * fs[5] + (fs[4] * (float) i_17_ + (float) i_15_ * fs[3]);
				float f_23_ = fs[8] * (float) i + (fs[7] * (float) i_17_ + (float) i_15_ * fs[6]);
				float f_24_ = (float) Math.sqrt((double) (f_23_ * f_23_ + (f_22_ * f_22_ + f_21_ * f_21_)));
				float f_25_ = ((float) Math.atan2((double) f_21_, (double) f_23_) / 6.2831855F + 0.5F);
				float f_26_ = ((float) Math.asin((double) (f_22_ / f_24_)) / 3.1415927F + 0.5F + f);
				if ((i_18_ ^ 0xffffffff) == -2) {
					float f_27_ = f_25_;
					f_25_ = -f_26_;
					f_26_ = f_27_;
				} else if (i_18_ == 2) {
					f_26_ = -f_26_;
					f_25_ = -f_25_;
				} else if (i_18_ == 3) {
					float f_28_ = f_25_;
					f_25_ = f_26_;
					f_26_ = -f_28_;
				}
				Class59_Sub2.aFloat4561 = f_26_;
				Class50.aFloat708 = f_25_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bj.A(" + i + ',' + f + ',' + i_15_ + ',' + i_16_ + ',' + bool + ',' + i_17_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final void method2143(int i, int i_29_, BufferStream stream) {
		try {
			int i_30_ = i_29_;
			if (i_30_ == 0)
				method2456(stream.read24BitInteger((byte) 29), (byte) -88);
			if (i != 4)
				decodeGlobalPlayerUpdate(null, -45);
			anInt5789++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bj.G(" + i + ',' + i_29_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub28_Sub1() {
		this(0);
	}

	final int[][] method2139(byte i, int i_31_) {
		try {
			anInt5793++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 80, i_31_);
			if (i < 33)
				anIntArray5791 = null;
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[] is_32_ = is[0];
				int[] is_33_ = is[1];
				int[] is_34_ = is[2];
				for (int i_35_ = 0; ((i_35_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_35_++) {
					is_32_[i_35_] = anInt5786;
					is_33_[i_35_] = anInt5790;
					is_34_[i_35_] = anInt5788;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bj.J(" + i + ',' + i_31_ + ')');
		}
	}

	private final void method2456(int i, byte i_36_) {
		do {
			try {
				anInt5790 = i >> 4 & 0xff0;
				anInt5786 = i >> 12 & 0xff0;
				anInt5794++;
				anInt5788 = (i & 0xff) << 4;
				if (i_36_ == -88)
					break;
				anInt5788 = 11;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bj.C(" + i + ',' + i_36_ + ')');
			}
			break;
		} while (false);
	}

	static {
		new Class67("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.", "Aguarde at\u00e9 se desconectar do canal anterior.");
	}
}
