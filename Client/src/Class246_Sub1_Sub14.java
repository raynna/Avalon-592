/* Class246_Sub1_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub14 extends Class246_Sub1 {
	static OutgoingPacket PUBLIC_QUICK_CHAT_PACKET;
	static int anInt6589;
	static int anInt6590 = 0;
	static int anInt6591;
	static int anInt6592;
	static int anInt6593;
	static int anInt6594;
	byte[] aByteArray6595;
	static int anInt6596 = 0;
	static Class214 aClass214_6597;

	public static void method2710(int i) {
		try {
			PUBLIC_QUICK_CHAT_PACKET = null;
			if (i <= 11)
				method2710(-52);
			aClass214_6597 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mb.D(" + i + ')');
		}
	}

	static final void method2711(byte i) {
		do {
			try {
				anInt6589++;
				if (Actor.f_eb == null) {
					Actor.f_eb = new int[65536];
					double d = Math.random() * 0.03 - 0.015 + 0.7;
					int i_0_ = 0;
					for (int i_1_ = 0; i_1_ < 512; i_1_++) {
						float f = (((float) (i_1_ >> 3) / 64.0F + 0.0078125F) * 360.0F);
						float f_2_ = (float) (i_1_ & 0x7) / 8.0F + 0.0625F;
						for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -129; i_3_++) {
							float f_4_ = (float) i_3_ / 128.0F;
							float f_5_ = 0.0F;
							float f_6_ = 0.0F;
							float f_7_ = 0.0F;
							float f_8_ = f / 60.0F;
							int i_9_ = (int) f_8_;
							int i_10_ = i_9_ % 6;
							float f_11_ = f_8_ - (float) i_9_;
							float f_12_ = (-f_2_ + 1.0F) * f_4_;
							float f_13_ = (-(f_11_ * f_2_) + 1.0F) * f_4_;
							float f_14_ = f_4_ * (-(f_2_ * (1.0F - f_11_)) + 1.0F);
							if (i_10_ != 0) {
								if ((i_10_ ^ 0xffffffff) == -2) {
									f_6_ = f_4_;
									f_7_ = f_12_;
									f_5_ = f_13_;
								} else if (i_10_ != 2) {
									if ((i_10_ ^ 0xffffffff) != -4) {
										if (i_10_ != 4) {
											if (i_10_ == 5) {
												f_7_ = f_13_;
												f_5_ = f_4_;
												f_6_ = f_12_;
											}
										} else {
											f_5_ = f_14_;
											f_7_ = f_4_;
											f_6_ = f_12_;
										}
									} else {
										f_7_ = f_4_;
										f_6_ = f_13_;
										f_5_ = f_12_;
									}
								} else {
									f_5_ = f_12_;
									f_6_ = f_4_;
									f_7_ = f_14_;
								}
							} else {
								f_7_ = f_12_;
								f_6_ = f_14_;
								f_5_ = f_4_;
							}
							f_5_ = (float) Math.pow((double) f_5_, d);
							f_6_ = (float) Math.pow((double) f_6_, d);
							f_7_ = (float) Math.pow((double) f_7_, d);
							int i_15_ = (int) (f_5_ * 256.0F);
							int i_16_ = (int) (256.0F * f_6_);
							int i_17_ = (int) (256.0F * f_7_);
							int i_18_ = (i_17_ + -16777216 - -(i_15_ << 16) - -(i_16_ << 8));
							Actor.f_eb[i_0_++] = i_18_;
						}
					}
					if (i == -24)
						break;
					anInt6590 = 91;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mb.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2712(String string, int i, int i_19_) {
		try {
			Class246_Sub28_Sub2.anInt5798++;
			anInt6591++;
			Class243.writePacket(-86, Class246_Sub39.CHANGE_FRIEND_CHAT_PACKET);
			Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -81) + i_19_);
			Class130_Sub1.stream.write128Byte(0, i);
			Class130_Sub1.stream.writeString(62, string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mb.C(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ')'));
		}
	}

	static final Class_t method2713(int i, int i_20_, Class260 class260, int i_21_, int i_22_, int i_23_, int i_24_) {
		try {
			anInt6594++;
			long l = (long) i;
			Class_t class_t = ((Class_t) Class59_Sub3_Sub3.aClass54_6277.method379(l, (byte) 58));
			int i_25_ = 2055;
			if (class_t == null) {
				Class103 class103 = Class206.method1349(0, Class199.index7, (byte) 89, i);
				if (class103 == null)
					return null;
				if ((((Class103) class103).anInt1358 ^ 0xffffffff) > -14)
					class103.method646(0, (byte) -106);
				class_t = class260.method1695(class103, i_25_, Class109_Sub1_Sub1.anInt6731, 64, 768);
				Class59_Sub3_Sub3.aClass54_6277.method371(1, l, class_t);
			}
			class_t = class_t.method678((byte) 2, i_25_, true);
			if (i_23_ != 0)
				class_t.Q(i_23_);
			if (i_21_ > -108)
				method2713(-19, 101, null, -29, -117, -7, -4);
			if (i_20_ != 0)
				class_t.Z(i_20_);
			if (i_22_ != 0)
				class_t.R(i_22_);
			if ((i_24_ ^ 0xffffffff) != -1)
				class_t.JA(0, i_24_, 0);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mb.B(" + i + ',' + i_20_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	Class246_Sub1_Sub14(byte[] is) {
		try {
			((Class246_Sub1_Sub14) this).aByteArray6595 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mb.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		PUBLIC_QUICK_CHAT_PACKET = new OutgoingPacket(3, -1);
	}
}
