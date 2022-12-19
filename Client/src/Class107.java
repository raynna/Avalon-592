/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107 {
	private Class260_Sub2 aClass260_Sub2_1497;
	private int anInt1498;
	private int anInt1499;
	static int anInt1500;
	private int anInt1501;
	private Class109_Sub1 aClass109_Sub1_1502;
	static int anInt1503;
	private Class224 aClass224_1504;
	boolean aBool1505 = true;
	static int anInt1506;
	static int anInt1507;
	static int anInt1508 = 0;
	private Class194_Sub1 aClass194_Sub1_1509;
	private Interface1 anInterface1_1510;
	static int anInt1511;
	private int anInt1512 = -1;

	private final void method738(int i) {
		do {
			try {
				anInt1506++;
				if (((Class107) this).aBool1505) {
					((Class107) this).aBool1505 = false;
					byte[] is = ((Class224) aClass224_1504).aByteArray3080;
					byte[] is_0_ = Class241.aByteArray3407;
					int i_1_ = 0;
					int i_2_ = ((Class224) aClass224_1504).anInt3086;
					int i_3_ = (((Class224) aClass224_1504).anInt3086 * anInt1499 + anInt1501);
					for (int i_4_ = -128; i_4_ < 0; i_4_++) {
						i_1_ = (i_1_ << 8) + -i_1_;
						for (int i_5_ = -128; (i_5_ ^ 0xffffffff) > -1; i_5_++) {
							if (is[i_3_++] != 0)
								i_1_++;
						}
						i_3_ += -128 + i_2_;
					}
					if (aClass109_Sub1_1502 != null && i_1_ == anInt1512)
						((Class107) this).aBool1505 = false;
					else {
						anInt1512 = i_1_;
						int i_6_ = 0;
						i_3_ = anInt1501 + anInt1499 * i_2_;
						for (int i_7_ = -128; i_7_ < 0; i_7_++) {
							for (int i_8_ = -128; i_8_ < 0; i_8_++) {
								if (is[i_3_] == 0) {
									int i_9_ = 0;
									if (is[i_3_ - 1] != 0)
										i_9_++;
									if (is[i_3_ + 1] != 0)
										i_9_++;
									if (is[i_3_ - i_2_] != 0)
										i_9_++;
									if ((is[i_2_ + i_3_] ^ 0xffffffff) != -1)
										i_9_++;
									is_0_[i_6_++] = (byte) (17 * i_9_);
								} else
									is_0_[i_6_++] = (byte) 68;
								i_3_++;
							}
							i_3_ += (-128 + ((Class224) aClass224_1504).anInt3086);
						}
						if (aClass109_Sub1_1502 != null)
							aClass109_Sub1_1502.method1762(128, 0, (Class241.aByteArray3407), 128, 6406, 0, 0, 0, false, 54);
						else {
							aClass109_Sub1_1502 = new Class109_Sub1(aClass260_Sub2_1497, 3553, 6406, 128, 128, false, Class241.aByteArray3407, 6406, false);
							aClass109_Sub1_1502.method1767(10497, false, false);
							aClass109_Sub1_1502.method753(-21, true);
						}
						if (i == -1)
							break;
						method739(null, 108, true);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kh.A(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method739(Interface1 interface1, int i, boolean bool) {
		try {
			anInt1500++;
			if (bool == true && (i ^ 0xffffffff) != -1) {
				method738(-1);
				aClass260_Sub2_1497.method1905((byte) 78, aClass109_Sub1_1502);
				aClass260_Sub2_1497.method1967(0, i, 4, interface1, (byte) -95);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kh.D(" + (interface1 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
		}
	}

	final void method740(byte i) {
		do {
			try {
				method739(anInterface1_1510, anInt1498, true);
				anInt1511++;
				if (i == -33)
					break;
				anInt1508 = 62;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kh.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method741(byte i, byte[] is, int i_10_, int i_11_) {
		do {
			try {
				anInt1503++;
				aClass194_Sub1_1509.method2(is, true, i_10_, (i_11_ * aClass260_Sub2_1497.method1897(i_10_, 127)));
				method739(aClass194_Sub1_1509, i_11_, true);
				if (i >= 41)
					break;
				method740((byte) 56);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("kh.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	Class107(Class260_Sub2 class260_sub2, Class224 class224, Class210_Sub2 class210_sub2, int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			anInt1499 = i_15_;
			aClass224_1504 = class224;
			aClass260_Sub2_1497 = class260_sub2;
			anInt1501 = i_14_;
			int i_16_ = 1 << i_13_;
			int i_17_ = 0;
			int i_18_ = i << i_13_;
			int i_19_ = i_12_ << i_13_;
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_20_++) {
				int i_21_ = (((Class210) class210_sub2).anInt2956 * (i_20_ + i_19_) + i_18_);
				for (int i_22_ = 0; (i_16_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
					short[] is = (((Class210_Sub2) class210_sub2).aShortArrayArray5021[i_21_++]);
					if (is != null)
						i_17_ += is.length;
				}
			}
			anInt1498 = i_17_;
			if ((i_17_ ^ 0xffffffff) < -1) {
				BufferStream stream = new BufferStream(i_17_ * 2);
				if (!((Class260_Sub2) aClass260_Sub2_1497).aBool4392) {
					for (int i_23_ = 0; i_23_ < i_16_; i_23_++) {
						int i_24_ = i_18_ + (((Class210) class210_sub2).anInt2956 * (i_23_ + i_19_));
						for (int i_25_ = 0; (i_16_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
							short[] is = (((Class210_Sub2) class210_sub2).aShortArrayArray5021[i_24_++]);
							if (is != null) {
								for (int i_26_ = 0; is.length > i_26_; i_26_++)
									stream.method2404((byte) -100, is[i_26_] & 0xffff);
							}
						}
					}
				} else {
					for (int i_27_ = 0; (i_16_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
						int i_28_ = (((i_27_ + i_19_) * ((Class210) class210_sub2).anInt2956) - -i_18_);
						for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_29_++) {
							short[] is = (((Class210_Sub2) class210_sub2).aShortArrayArray5021[i_28_++]);
							if (is != null) {
								for (int i_30_ = 0; i_30_ < is.length; i_30_++)
									stream.writeShort((byte) 67, 0xffff & is[i_30_]);
							}
						}
					}
				}
				anInterface1_1510 = aClass260_Sub2_1497.method1955(103, ((BufferStream) stream).position, false, (((BufferStream) stream).buffer), 5123);
				aClass194_Sub1_1509 = new Class194_Sub1(aClass260_Sub2_1497, 5123, null, 1);
			} else
				aClass109_Sub1_1502 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kh.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class224 != null ? "{...}" : "null") + ',' + (class210_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}
}
