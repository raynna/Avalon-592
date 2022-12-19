/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
	static int anInt1280;
	private int[] anIntArray1281;
	static int anInt1282;
	private int[] anIntArray1283;
	static int anInt1284;
	static int anInt1285;
	static int[] anIntArray1286 = new int[14];
	static Class67 aClass67_1287 = new Class67("K", "T", "K", "K");
	static int anInt1288;
	static int anInt1289;
	static int anInt1290;
	private byte[] aByteArray1291;
	static int anInt1292 = 0;
	static IncomingPacket SEND_URL_PACKET;
	static int anInt1294 = 0;

	static final void method622(byte i, int i_0_) {
		try {
			anInt1289++;
			if (i_0_ != Class225.anInt3103) {
				if (Class225.anInt3103 == 0)
					Class246_Sub28_Sub22.method2724(false);
				if (i_0_ == 40)
					Class128_Sub1.method2331(1);
				if ((i_0_ ^ 0xffffffff) != -41 && Class92.aClass6_1208 != null) {
					Class92.aClass6_1208.method72(false);
					Class92.aClass6_1208 = null;
				}
				if (Class225.anInt3103 == 25 || Class225.anInt3103 == 28) {
					((Class_fs) ISAAC.index2).anInt126 = 2;
					((Class_fs) Class110.index17).anInt126 = 2;
					((Class_fs) Class246_Sub40.index16).anInt126 = 2;
					((Class_fs) Class214.index18).anInt126 = 2;
					((Class_fs) Class219.index19).anInt126 = 2;
					((Class_fs) Class218.index20).anInt126 = 2;
					((Class_fs) Class246_Sub1_Sub5.index21).anInt126 = 2;
				}
				if (i_0_ == 25 || i_0_ == 28) {
					Class148.anInt2184 = 0;
					Class246_Sub30_Sub1.anInt5756 = 1;
					Class27.anInt379 = 0;
					Class246_Sub28_Sub8.anInt6072 = 0;
					Class255.anInt3665 = 1;
					Class246_Sub4.method1809(4095, true);
					((Class_fs) ISAAC.index2).anInt126 = 1;
					((Class_fs) Class110.index17).anInt126 = 1;
					((Class_fs) Class246_Sub40.index16).anInt126 = 1;
					((Class_fs) Class214.index18).anInt126 = 1;
					((Class_fs) Class219.index19).anInt126 = 1;
					((Class_fs) Class218.index20).anInt126 = 1;
					((Class_fs) Class246_Sub1_Sub5.index21).anInt126 = 1;
				}
				if (i_0_ == 25 || i_0_ == 10)
					Class188.method1231((byte) 62);
				if ((i_0_ ^ 0xffffffff) != -6)
					Class40_Sub8.method2214(64);
				else
					Class254.method1642(Class246_Sub15.aClass260_4445, (byte) 103, Class210_Sub2.index8);
				boolean bool = ((i_0_ ^ 0xffffffff) == -6 || (i_0_ ^ 0xffffffff) == -11 || i_0_ == 28);
				boolean bool_1_ = (Class225.anInt3103 == 5 || Class225.anInt3103 == 10 || Class225.anInt3103 == 28);
				if (bool == !bool_1_) {
					if (bool) {
						Class36.anInt512 = Class236.anInt3307;
						if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587 == 0)
							Class59_Sub5.method2281(2, (byte) 35);
						else
							Class231.method1481((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt587), Class21.index6, 2, 0, (byte) -57, false, Class236.anInt3307);
						Class140.aClass242_2036.method1552(false, (byte) 87);
					} else {
						Class59_Sub5.method2281(2, (byte) 35);
						Class140.aClass242_2036.method1552(true, (byte) 18);
					}
				}
				int i_2_ = -35 % ((-63 - i) / 52);
				if ((i_0_ ^ 0xffffffff) == -26 || i_0_ == 28 || (i_0_ ^ 0xffffffff) == -41)
					Class246_Sub15.aClass260_4445.method1722();
				Class225.anInt3103 = i_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ji.E(" + i + ',' + i_0_ + ')');
		}
	}

	final int method623(byte[] is, int i, byte[] is_3_, int i_4_, int i_5_, int i_6_) {
		try {
			anInt1280++;
			if (i_5_ == 0)
				return 0;
			i_5_ += i;
			int i_7_ = 0;
			int i_8_ = i_6_;
			if (i_4_ != -1)
				method624(67, 23, -35, 65, -5);
			for (;;) {
				byte i_9_ = is[i_8_];
				if ((i_9_ ^ 0xffffffff) <= -1)
					i_7_++;
				else
					i_7_ = anIntArray1283[i_7_];
				int i_10_;
				if ((i_10_ = anIntArray1283[i_7_]) < 0) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				if ((0x40 & i_9_ ^ 0xffffffff) == -1)
					i_7_++;
				else
					i_7_ = anIntArray1283[i_7_];
				if (((i_10_ = anIntArray1283[i_7_]) ^ 0xffffffff) > -1) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if (i_5_ <= i)
						break;
					i_7_ = 0;
				}
				if ((i_9_ & 0x20) != 0)
					i_7_ = anIntArray1283[i_7_];
				else
					i_7_++;
				if (((i_10_ = anIntArray1283[i_7_]) ^ 0xffffffff) > -1) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				if ((i_9_ & 0x10) != 0)
					i_7_ = anIntArray1283[i_7_];
				else
					i_7_++;
				if (((i_10_ = anIntArray1283[i_7_]) ^ 0xffffffff) > -1) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if (i_5_ <= i)
						break;
					i_7_ = 0;
				}
				if ((i_9_ & 0x8) != 0)
					i_7_ = anIntArray1283[i_7_];
				else
					i_7_++;
				if ((i_10_ = anIntArray1283[i_7_]) < 0) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i_5_ ^ 0xffffffff) >= (i ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				if ((i_9_ & 0x4 ^ 0xffffffff) == -1)
					i_7_++;
				else
					i_7_ = anIntArray1283[i_7_];
				if (((i_10_ = anIntArray1283[i_7_]) ^ 0xffffffff) > -1) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				if ((i_9_ & 0x2 ^ 0xffffffff) != -1)
					i_7_ = anIntArray1283[i_7_];
				else
					i_7_++;
				if ((i_10_ = anIntArray1283[i_7_]) < 0) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				if ((0x1 & i_9_ ^ 0xffffffff) == -1)
					i_7_++;
				else
					i_7_ = anIntArray1283[i_7_];
				if (((i_10_ = anIntArray1283[i_7_]) ^ 0xffffffff) > -1) {
					is_3_[i++] = (byte) (i_10_ ^ 0xffffffff);
					if ((i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						break;
					i_7_ = 0;
				}
				i_8_++;
			}
			return -i_6_ + (1 + i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ji.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_3_ != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method624(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt602 ^ 0xffffffff) != -1 && i_12_ != 0 && (Class59.anInt819 ^ 0xffffffff) > -51 && (i ^ 0xffffffff) != 0)
				Class47.aClass258Array684[Class59.anInt819++] = new Class258((byte) 1, i, i_12_, i_14_, i_13_, 0);
			if (i_11_ == 0)
				anInt1284++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ji.D(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method625(byte[] is, int i, byte i_15_, int i_16_, byte[] is_17_, int i_18_) {
		try {
			anInt1290++;
			if (i_15_ != 40)
				return -81;
			int i_19_ = 0;
			i_18_ += i_16_;
			int i_20_ = i << 3;
			for (/**/; i_16_ < i_18_; i_16_++) {
				int i_21_ = is[i_16_] & 0xff;
				int i_22_ = anIntArray1281[i_21_];
				int i_23_ = aByteArray1291[i_21_];
				if ((i_23_ ^ 0xffffffff) == -1)
					throw new RuntimeException("No codeword for data value " + i_21_);
				int i_24_ = i_20_ >> 3;
				int i_25_ = i_20_ & 0x7;
				i_19_ &= -i_25_ >> 31;
				int i_26_ = (-1 + i_23_ + i_25_ >> 3) + i_24_;
				i_25_ += 24;
				is_17_[i_24_] = (byte) (i_19_ = Class236.method1523(i_19_, i_22_ >>> i_25_));
				if (i_24_ < i_26_) {
					i_25_ -= 8;
					i_24_++;
					is_17_[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
					if ((i_26_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
						i_24_++;
						i_25_ -= 8;
						is_17_[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
						if (i_24_ < i_26_) {
							i_25_ -= 8;
							i_24_++;
							is_17_[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
							if ((i_26_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
								i_25_ -= 8;
								i_24_++;
								is_17_[i_24_] = (byte) (i_19_ = i_22_ << -i_25_);
							}
						}
					}
				}
				i_20_ += i_23_;
			}
			return (i_20_ + 7 >> 3) + -i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ji.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ',' + i_16_ + ',' + (is_17_ != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	public static void method626(int i) {
		try {
			aClass67_1287 = null;
			SEND_URL_PACKET = null;
			if (i == 0)
				anIntArray1286 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ji.A(" + i + ')');
		}
	}

	static final Class246_Sub2 method627(int i) {
		try {
			anInt1285++;
			if (Class79.aClass166_1034 == null || Class168.aClass51_2393 == null)
				return null;
			for (Class246_Sub2 class246_sub2 = ((Class246_Sub2) Class168.aClass51_2393.method334((byte) 123)); class246_sub2 != null; class246_sub2 = (Class246_Sub2) Class168.aClass51_2393.method334((byte) 85)) {
				Class140 class140 = Class79.aClass165_1022.method1088((((Class246_Sub2) class246_sub2).anInt3808), (byte) -41);
				if (class140 != null && ((Class140) class140).aBool1991 && class140.method942(-11247, Class79.anInterface11_1025))
					return class246_sub2;
			}
			if (i != -2)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ji.F(" + i + ')');
		}
	}

	static final int method628(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		try {
			i_27_ &= 0x3;
			anInt1288++;
			if ((0x1 & i_31_ ^ 0xffffffff) == -2) {
				int i_33_ = i_32_;
				i_32_ = i_28_;
				i_28_ = i_33_;
			}
			if (i_27_ == 0)
				return i;
			if (i_27_ == 1)
				return i_29_;
			if ((i_27_ ^ 0xffffffff) == -3)
				return 1 + -i_32_ + 7 + -i;
			if (i_30_ != 15993)
				aClass67_1287 = null;
			return 1 - (i_28_ - (7 - i_29_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ji.G(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}

	Class99(byte[] is) {
		try {
			int i = is.length;
			aByteArray1291 = is;
			anIntArray1281 = new int[i];
			anIntArray1283 = new int[8];
			int[] is_34_ = new int[33];
			int i_35_ = 0;
			for (int i_36_ = 0; (i ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++) {
				int i_37_ = is[i_36_];
				if (i_37_ != 0) {
					int i_38_ = 1 << -i_37_ + 32;
					int i_39_ = is_34_[i_37_];
					anIntArray1281[i_36_] = i_39_;
					int i_40_;
					if ((i_38_ & i_39_ ^ 0xffffffff) != -1)
						i_40_ = is_34_[-1 + i_37_];
					else {
						i_40_ = i_38_ | i_39_;
						for (int i_41_ = -1 + i_37_; (i_41_ ^ 0xffffffff) <= -2; i_41_--) {
							int i_42_ = is_34_[i_41_];
							if ((i_42_ ^ 0xffffffff) != (i_39_ ^ 0xffffffff))
								break;
							int i_43_ = 1 << -i_41_ + 32;
							if ((i_43_ & i_42_) != 0) {
								is_34_[i_41_] = is_34_[i_41_ - 1];
								break;
							}
							is_34_[i_41_] = Class236.method1523(i_43_, i_42_);
						}
					}
					is_34_[i_37_] = i_40_;
					for (int i_44_ = 1 + i_37_; (i_44_ ^ 0xffffffff) >= -33; i_44_++) {
						if ((i_39_ ^ 0xffffffff) == (is_34_[i_44_] ^ 0xffffffff))
							is_34_[i_44_] = i_40_;
					}
					int i_45_ = 0;
					for (int i_46_ = 0; i_37_ > i_46_; i_46_++) {
						int i_47_ = -2147483648 >>> i_46_;
						if ((i_39_ & i_47_ ^ 0xffffffff) != -1) {
							if ((anIntArray1283[i_45_] ^ 0xffffffff) == -1)
								anIntArray1283[i_45_] = i_35_;
							i_45_ = anIntArray1283[i_45_];
						} else
							i_45_++;
						i_47_ >>>= 1;
						if ((anIntArray1283.length ^ 0xffffffff) >= (i_45_ ^ 0xffffffff)) {
							int[] is_48_ = new int[anIntArray1283.length * 2];
							for (int i_49_ = 0; ((anIntArray1283.length ^ 0xffffffff) < (i_49_ ^ 0xffffffff)); i_49_++)
								is_48_[i_49_] = anIntArray1283[i_49_];
							anIntArray1283 = is_48_;
						}
					}
					anIntArray1283[i_45_] = i_36_ ^ 0xffffffff;
					if ((i_35_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff))
						i_35_ = i_45_ + 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ji.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		SEND_URL_PACKET = new IncomingPacket(16, -1);
	}
}
