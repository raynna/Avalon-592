/* Class246_Sub28_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub15 extends Class246_Sub28 {
	static int anInt6356;
	static int anInt6357;
	static int anInt6358;
	static int anInt6359;
	static int anInt6360;
	static IncomingPacket DECODE_MAP_REGION_IN;
	private int anInt6362;
	static int anInt6363;
	static int anInt6364 = 2;
	private int anInt6365 = 3216;
	private int anInt6366;
	static int anInt6367;
	static Class_fs aClass_fs6368;
	static int anInt6369;
	static int anInt6370;
	private int[] anIntArray6371;

	public static void method2645(boolean bool) {
		try {
			if (bool != false)
				method2648((byte) -74, null);
			DECODE_MAP_REGION_IN = null;
			aClass_fs6368 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jr.A(" + bool + ')');
		}
	}

	static final void method2646(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			anInt6356++;
			int i_7_ = i_5_ - 334;
			do {
				if ((i_7_ ^ 0xffffffff) > -1) {
					i_7_ = 0;
					if (!client.f_ob)
						break;
				}
				if ((i_7_ ^ 0xffffffff) < -101)
					i_7_ = 100;
			} while (false);
			int i_8_ = ((Class35.aShort463 - Class7.aShort98) * i_7_ / 100 + Class7.aShort98);
			i_1_ = i_8_ * i_1_ >> 8;
			int i_9_ = 0x3fff & -i_6_ + 16384;
			int i_10_ = 0x3fff & -i_3_ + 16384;
			int i_11_ = i;
			int i_12_ = 0;
			int i_13_ = i_1_;
			if (i_9_ != 0) {
				i_12_ = -i_13_ * Class39_Sub1.f_fb[i_9_] >> 15;
				i_13_ = Class39_Sub1.anIntArray4672[i_9_] * i_13_ >> 15;
			}
			if (i_10_ != 0) {
				i_11_ = i_13_ * Class39_Sub1.f_fb[i_10_] >> 15;
				i_13_ = Class39_Sub1.anIntArray4672[i_10_] * i_13_ >> 15;
			}
			Class244.anInt3456 = i_6_;
			Class246_Sub16.aInt92 = i_0_ - i_11_;
			Class106_Sub1.anInt4179 = 0;
			Class259_Sub1.anInt4509 = -i_13_ + i_2_;
			Class73.anInt961 = i_3_;
			Class246_Sub28_Sub8.anInt6077 = i_4_ + -i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jr.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public Class246_Sub28_Sub15() {
		super(1, true);
		anInt6362 = 4096;
		anInt6366 = 3216;
		anIntArray6371 = new int[3];
	}

	final void method2134(boolean bool) {
		try {
			if (bool != false)
				anInt6365 = -62;
			anInt6357++;
			method2647(-57);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jr.F(" + bool + ')');
		}
	}

	private final void method2647(int i) {
		do {
			try {
				anInt6363++;
				double d = Math.cos((double) ((float) anInt6366 / 4096.0F));
				anIntArray6371[0] = (int) (d * Math.sin((double) ((float) anInt6365 / 4096.0F)) * 4096.0);
				anIntArray6371[1] = (int) (4096.0 * (d * Math.cos((double) ((float) anInt6365 / 4096.0F))));
				anIntArray6371[2] = (int) (4096.0 * Math.sin((double) ((float) anInt6366 / 4096.0F)));
				if (i >= -44)
					method2648((byte) -59, null);
				int i_14_ = anIntArray6371[0] * anIntArray6371[0] >> 12;
				int i_15_ = anIntArray6371[1] * anIntArray6371[1] >> 12;
				int i_16_ = anIntArray6371[2] * anIntArray6371[2] >> 12;
				int i_17_ = (int) (4096.0 * Math.sqrt((double) (i_16_ + i_15_ + i_14_ >> 12)));
				if ((i_17_ ^ 0xffffffff) == -1)
					break;
				anIntArray6371[2] = (anIntArray6371[2] << 12) / i_17_;
				anIntArray6371[1] = (anIntArray6371[1] << 12) / i_17_;
				anIntArray6371[0] = (anIntArray6371[0] << 12) / i_17_;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jr.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2143(int i, int i_18_, BufferStream stream) {
		while_126_: do {
			try {
				if (i == 4) {
					anInt6367++;
					int i_19_ = i_18_;
					while_125_: do {
						do {
							if (i_19_ != 0) {
								if ((i_19_ ^ 0xffffffff) == -2)
									break;
								if (i_19_ != 2)
									break while_126_;
								if (!client.f_ob)
									break while_125_;
							}
							anInt6362 = stream.readUnsignedShort((byte) 103);
							return;
						} while (false);
						anInt6365 = stream.readUnsignedShort((byte) -73);
						return;
					} while (false);
					anInt6366 = stream.readUnsignedShort((byte) -125);
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jr.G(" + i + ',' + i_18_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static final void method2648(byte i, Class99 class99) {
		try {
			if (i > -1)
				method2649(-53, null, null, 10, 26);
			Class246_Sub19_Sub2.aClass99_6812 = class99;
			anInt6359++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jr.H(" + i + ',' + (class99 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2649(int i, long[] ls, Object[] objects, int i_20_, int i_21_) {
		do {
			try {
				if ((i ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
					int i_22_ = (i + i_20_) / 2;
					int i_23_ = i;
					long l = ls[i_22_];
					ls[i_22_] = ls[i_20_];
					ls[i_20_] = l;
					Object object = objects[i_22_];
					objects[i_22_] = objects[i_20_];
					objects[i_20_] = object;
					int i_24_ = l == 9223372036854775807L ? 0 : 1;
					for (int i_25_ = i; i_25_ < i_20_; i_25_++) {
						if (ls[i_25_] < l - -(long) (i_25_ & i_24_)) {
							long l_26_ = ls[i_25_];
							ls[i_25_] = ls[i_23_];
							ls[i_23_] = l_26_;
							Object object_27_ = objects[i_25_];
							objects[i_25_] = objects[i_23_];
							objects[i_23_++] = object_27_;
						}
					}
					ls[i_20_] = ls[i_23_];
					ls[i_23_] = l;
					objects[i_20_] = objects[i_23_];
					objects[i_23_] = object;
					method2649(i, ls, objects, i_23_ - 1, 28260);
					method2649(i_23_ + 1, ls, objects, i_20_, 28260);
				}
				anInt6369++;
				if (i_21_ == 28260)
					break;
				method2645(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jr.C(" + i + ',' + (ls != null ? "{...}" : "null") + ',' + (objects != null ? "{...}" : "null") + ',' + i_20_ + ',' + i_21_ + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_28_) {
		try {
			anInt6360++;
			int i_29_ = -102 % ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_28_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_30_ = Class138.anInt1977 * anInt6362 >> 12;
				int[] is_31_ = this.method2133(i_28_ - 1 & Class113.anInt1594, 0, 0);
				int[] is_32_ = this.method2133(i_28_, 0, 0);
				int[] is_33_ = this.method2133(Class113.anInt1594 & i_28_ + 1, 0, 0);
				for (int i_34_ = 0; i_34_ < Class246_Sub37_Sub1.f_gb; i_34_++) {
					int i_35_ = (-is_31_[i_34_] + is_33_[i_34_]) * i_30_ >> 12;
					int i_36_ = ((i_30_ * (is_32_[-1 + i_34_ & Class63_Sub1.anInt4719] - is_32_[Class63_Sub1.anInt4719 & 1 + i_34_])) >> 12);
					int i_37_ = i_36_ >> 4;
					int i_38_ = i_35_ >> 4;
					if (i_37_ < 0)
						i_37_ = -i_37_;
					if ((i_38_ ^ 0xffffffff) > -1)
						i_38_ = -i_38_;
					if (i_37_ > 255)
						i_37_ = 255;
					if ((i_38_ ^ 0xffffffff) < -256)
						i_38_ = 255;
					int i_39_ = 0xff & (Class40.aByteArray612[i_37_ - -(i_38_ * (1 + i_38_) >> 1)]);
					int i_40_ = i_36_ * i_39_ >> 8;
					int i_41_ = i_39_ * 4096 >> 8;
					int i_42_ = i_39_ * i_35_ >> 8;
					i_40_ = i_40_ * anIntArray6371[0] >> 12;
					i_42_ = i_42_ * anIntArray6371[1] >> 12;
					i_41_ = anIntArray6371[2] * i_41_ >> 12;
					is[i_34_] = i_41_ + i_40_ - -i_42_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jr.E(" + i + ',' + i_28_ + ')');
		}
	}

	static {
		DECODE_MAP_REGION_IN = new IncomingPacket(13, -2);
	}
}
