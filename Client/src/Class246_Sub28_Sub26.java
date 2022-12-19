/* Class246_Sub28_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub26 extends Class246_Sub28 {
	static Class166 aClass166_6708;
	private int anInt6709;
	private int anInt6710 = 0;
	static short aShort6711 = 1;
	private int anInt6712 = 20;
	static int anInt6713;
	static int anInt6714;
	private int anInt6715;
	static Class123 aClass123_6716;

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6714++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				for (int i_1_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
					int i_2_ = ((Class187.anIntArray2654[i_1_] << 12) / anInt6709 + anInt6715);
					int i_3_ = ((Class246_Sub1_Sub11.anIntArray6245[i_0_] << 12) / anInt6709 + anInt6710);
					int i_4_ = i_2_;
					int i_5_ = i_3_;
					int i_6_ = i_2_;
					int i_7_ = i_3_;
					int i_8_ = i_2_ * i_2_ >> 12;
					int i_9_ = i_3_ * i_3_ >> 12;
					int i_10_;
					for (i_10_ = 0; ((i_8_ + i_9_ ^ 0xffffffff) > -16385 && i_10_ < anInt6712); i_9_ = i_7_ * i_7_ >> 12) {
						i_7_ = (i_6_ * i_7_ >> 12) * 2 + i_5_;
						i_6_ = i_4_ + i_8_ + -i_9_;
						i_10_++;
						i_8_ = i_6_ * i_6_ >> 12;
					}
					is[i_1_] = (i_10_ < anInt6712 - 1 ? (i_10_ << 12) / anInt6712 : 0);
				}
			}
			int i_11_ = 102 / ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oo.E(" + i + ',' + i_0_ + ')');
		}
	}

	public Class246_Sub28_Sub26() {
		super(0, true);
		anInt6709 = 1365;
		anInt6715 = 0;
	}

	public static void method2752(int i) {
		try {
			if (i > -84)
				aShort6711 = (short) 101;
			aClass166_6708 = null;
			aClass123_6716 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oo.A(" + i + ')');
		}
	}

	final void method2143(int i, int i_12_, BufferStream stream) {
		try {
			if (i != 4)
				method2143(100, 48, null);
			int i_13_ = i_12_;
			while_115_: do {
				while_114_: do {
					do {
						if (i_13_ != 0) {
							if (i_13_ != 1) {
								if ((i_13_ ^ 0xffffffff) != -3) {
									if ((i_13_ ^ 0xffffffff) != -4)
										break while_115_;
								} else
									break;
								break while_114_;
							}
						} else {
							anInt6709 = stream.readUnsignedShort((byte) 105);
							break while_115_;
						}
						anInt6712 = stream.readUnsignedShort((byte) 87);
						break while_115_;
					} while (false);
					anInt6715 = stream.readUnsignedShort((byte) 82);
					break while_115_;
				} while (false);
				anInt6710 = stream.readUnsignedShort((byte) 99);
			} while (false);
			anInt6713++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oo.G(" + i + ',' + i_12_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass166_6708 = new Class166();
	}
}
