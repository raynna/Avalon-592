/* Class_ss - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_ss extends Class246_Sub28 {
	static int anInt7050;
	private int anInt7051 = 4;
	static int anInt7052;
	static int anInt7053;
	static int anInt7054;
	private int anInt7055 = 4;
	static IncomingPacket aClass13_7056 = new IncomingPacket(6, 11);
	static Class67 aClass67_7057;
	static int[] anIntArray7058 = { 16, 32, 64, 128 };
	static int anInt7059;
	static OutgoingPacket aClass201_7060;

	static final void method2883(int i, int i_0_, int i_1_, int i_2_) {
		do {
			try {
				Class45.aByteArrayArrayArray648 = new byte[i_2_][i_1_][i_0_];
				anInt7059++;
				if (i == 0)
					break;
				method2884((byte) -124);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ss.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2143(int i, int i_3_, BufferStream stream) {
		while_241_: do {
			try {
				anInt7053++;
				if (i != 4)
					method2883(-22, 83, 45, -95);
				int i_4_ = i_3_;
				do {
					if (i_4_ != 0) {
						if (i_4_ != 1)
							break while_241_;
						if (!client.f_ob)
							break;
					}
					anInt7055 = stream.readUnsignedByte(255);
					return;
				} while (false);
				anInt7051 = stream.readUnsignedByte(i ^ 0xfb);
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ss.G(" + i + ',' + i_3_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	public Class_ss() {
		super(1, false);
	}

	final int[][] method2139(byte i, int i_5_) {
		try {
			if (i <= 33)
				anInt7055 = -106;
			anInt7052++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 13, i_5_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int i_6_ = Class246_Sub37_Sub1.f_gb / anInt7055;
				int i_7_ = Class141.anInt2044 / anInt7051;
				int[][] is_8_;
				if ((i_7_ ^ 0xffffffff) < -1) {
					int i_9_ = i_5_ % i_7_;
					is_8_ = this.method2141(3, 0, i_9_ * Class141.anInt2044 / i_7_);
				} else
					is_8_ = this.method2141(3, 0, 0);
				int[] is_10_ = is_8_[0];
				int[] is_11_ = is_8_[1];
				int[] is_12_ = is_8_[2];
				int[] is_13_ = is[0];
				int[] is_14_ = is[1];
				int[] is_15_ = is[2];
				for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_16_++) {
					int i_17_;
					if (i_6_ <= 0)
						i_17_ = 0;
					else {
						int i_18_ = i_16_ % i_6_;
						i_17_ = Class246_Sub37_Sub1.f_gb * i_18_ / i_6_;
					}
					is_13_[i_16_] = is_10_[i_17_];
					is_14_[i_16_] = is_11_[i_17_];
					is_15_[i_16_] = is_12_[i_17_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ss.J(" + i + ',' + i_5_ + ')');
		}
	}

	final int[] method2135(int i, int i_19_) {
		try {
			anInt7050++;
			int i_20_ = 45 % ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_19_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_21_ = Class246_Sub37_Sub1.f_gb / anInt7055;
				int i_22_ = Class141.anInt2044 / anInt7051;
				int[] is_23_;
				if ((i_22_ ^ 0xffffffff) < -1) {
					int i_24_ = i_19_ % i_22_;
					is_23_ = this.method2133(i_24_ * Class141.anInt2044 / i_22_, 0, 0);
				} else
					is_23_ = this.method2133(0, 0, 0);
				for (int i_25_ = 0; i_25_ < Class246_Sub37_Sub1.f_gb; i_25_++) {
					if ((i_21_ ^ 0xffffffff) >= -1)
						is[i_25_] = is_23_[0];
					else {
						int i_26_ = i_25_ % i_21_;
						is[i_25_] = is_23_[Class246_Sub37_Sub1.f_gb * i_26_ / i_21_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ss.E(" + i + ',' + i_19_ + ')');
		}
	}

	public static void method2884(byte i) {
		try {
			aClass13_7056 = null;
			anIntArray7058 = null;
			aClass67_7057 = null;
			aClass201_7060 = null;
			int i_27_ = -22 % ((i + 61) / 58);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ss.A(" + i + ')');
		}
	}

	static {
		aClass67_7057 = new Class67("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D d\u00e9marr\u00e9e", "Biblioteca 3D iniciada");
		aClass201_7060 = new OutgoingPacket(57, 4);
	}
}
