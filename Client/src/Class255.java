/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class255 {
	static int anInt3639;
	static int anInt3640;
	byte[][][] aByteArrayArrayArray3641;
	static int anInt3642;
	int anInt3643;
	static int anInt3644;
	static int anInt3645;
	private byte[][][] aByteArrayArrayArray3646;
	static Class67 aClass67_3647 = new Class67("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conex\u00e3o perdida.");
	static long[][][] aLongArrayArrayArray3648;
	byte[][][] aByteArrayArrayArray3649;
	private int[] anIntArray3650;
	private byte[][][] aByteArrayArrayArray3651;
	static int anInt3652;
	static int anInt3653;
	static float aFloat3654;
	private byte[][][] aByteArrayArrayArray3655;
	private byte[][][] aByteArrayArrayArray3656;
	private int[] anIntArray3657 = { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };
	boolean aBool3658;
	private Class175 aClass175_3659;
	static int anInt3660;
	int anInt3661;
	static int anInt3662;
	static Class191 aClass191_3663;
	int[][][] anIntArrayArrayArray3664;
	static int anInt3665 = 1;
	static int anInt3666;
	private Class105 aClass105_3667;
	static int anInt3668;
	static int anInt3669;
	int anInt3670;
	static int anInt3671;
	static int anInt3672;

	final void method1647(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				for (int i_4_ = 0; i_4_ < ((Class255) this).anInt3670; i_4_++)
					method1648(true, i_3_, i_4_, i_2_, i_1_, i);
				anInt3644++;
				if (i_0_ == 228)
					break;
				method1651(84, -38, -54, null, -91, null, -103);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wj.H(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1648(boolean bool, int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		do {
			try {
				for (int i_9_ = i_7_; i_9_ < i_7_ + i; i_9_++) {
					for (int i_10_ = i_8_; (i_10_ ^ 0xffffffff) > (i_6_ + i_8_ ^ 0xffffffff); i_10_++) {
						if ((i_10_ ^ 0xffffffff) <= -1 && ((i_10_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)) && (i_9_ ^ 0xffffffff) <= -1 && ((Class255) this).anInt3643 > i_9_)
							((Class255) this).anIntArrayArrayArray3664[i_5_][i_10_][i_9_] = ((i_5_ ^ 0xffffffff) >= -1 ? 0 : -240 + (((Class255) this).anIntArrayArrayArray3664[i_5_ - 1][i_10_][i_9_]));
					}
				}
				anInt3671++;
				if (i_8_ > 0 && i_8_ < ((Class255) this).anInt3661) {
					for (int i_11_ = i_7_ + 1; i + i_7_ > i_11_; i_11_++) {
						if ((i_11_ ^ 0xffffffff) <= -1 && i_11_ < ((Class255) this).anInt3643)
							((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_11_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][-1 + i_8_][i_11_]);
					}
				}
				if (bool != true)
					((Class255) this).aBool3658 = false;
				if (i_7_ > 0 && i_7_ < ((Class255) this).anInt3643) {
					for (int i_12_ = i_8_ + 1; i_12_ < i_8_ + i_6_; i_12_++) {
						if ((i_12_ ^ 0xffffffff) <= -1 && i_12_ < ((Class255) this).anInt3661)
							((Class255) this).anIntArrayArrayArray3664[i_5_][i_12_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_12_][i_7_ - 1]);
					}
				}
				if (i_8_ < 0 || i_7_ < 0 || i_8_ >= ((Class255) this).anInt3661 || ((((Class255) this).anInt3643 ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)))
					break;
				if ((i_5_ ^ 0xffffffff) != -1) {
					if (i_8_ > 0 && (((((Class255) this).anIntArrayArrayArray3664[-1 + i_5_][i_8_ - 1][i_7_]) ^ 0xffffffff) != ((((Class255) this).anIntArrayArrayArray3664[i_5_][-1 + i_8_][i_7_]) ^ 0xffffffff)))
						((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_ - 1][i_7_]);
					else if (i_7_ > 0 && (((((Class255) this).anIntArrayArrayArray3664[-1 + i_5_][i_8_][-1 + i_7_]) ^ 0xffffffff) != ((((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][-1 + i_7_]) ^ 0xffffffff)))
						((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_ - 1]);
					else if (i_8_ > 0 && (i_7_ ^ 0xffffffff) < -1 && (((((Class255) this).anIntArrayArrayArray3664[i_5_ - 1][-1 + i_8_][i_7_ - 1]) ^ 0xffffffff) != ((((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_ - 1][i_7_ - 1]) ^ 0xffffffff)))
						((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_ - 1][-1 + i_7_]);
				} else {
					if ((i_8_ ^ 0xffffffff) >= -1 || ((((Class255) this).anIntArrayArrayArray3664[i_5_][-1 + i_8_][i_7_]) ^ 0xffffffff) == -1) {
						if (i_7_ <= 0 || ((((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][-1 + i_7_]) ^ 0xffffffff) == -1) {
							if (i_8_ > 0 && i_7_ > 0 && (((Class255) this).anIntArrayArrayArray3664[i_5_][-1 + i_8_][-1 + i_7_]) != 0)
								((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_ - 1][i_7_ - 1]);
						} else
							((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][-1 + i_7_]);
						break;
					}
					((Class255) this).anIntArrayArrayArray3664[i_5_][i_8_][i_7_] = (((Class255) this).anIntArrayArrayArray3664[i_5_][-1 + i_8_][i_7_]);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wj.B(" + bool + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method1649(byte i, Class_fs class_fs, Class_fs class_fs_13_) {
		try {
			anInt3653++;
			int i_14_ = 0;
			if (class_fs_13_.method112(-1, BufferStream.f_eb))
				i_14_++;
			if (class_fs_13_.method112(-1, Class36.f_ib))
				i_14_++;
			if (i > -42)
				return 1;
			if (class_fs_13_.method112(-1, Class259_Sub1.anInt4510))
				i_14_++;
			if (class_fs.method112(-1, BufferStream.f_eb))
				i_14_++;
			if (class_fs.method112(-1, Class36.f_ib))
				i_14_++;
			if (class_fs.method112(-1, Class259_Sub1.anInt4510))
				i_14_++;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.G(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_13_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1650(int i, int[][] is, int i_15_) {
		try {
			anInt3666++;
			int[][] is_16_ = ((Class255) this).anIntArrayArrayArray3664[i_15_];
			if (i != -1)
				method1648(false, -67, 54, -32, -82, 123);
			for (int i_17_ = 0; ((((Class255) this).anInt3661 + 1 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
				for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (1 + ((Class255) this).anInt3643 ^ 0xffffffff)); i_18_++)
					is_16_[i_17_][i_18_] += is[i_17_][i_18_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	final void method1651(int i, int i_19_, int i_20_, BufferStream stream, int i_21_, Class199[] class199s, int i_22_) {
		try {
			anInt3640++;
			if (i > -75)
				((Class255) this).aByteArrayArrayArray3649 = null;
			if (!((Class255) this).aBool3658) {
				for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -5; i_23_++) {
					Class199 class199 = class199s[i_23_];
					for (int i_24_ = 0; i_24_ < 64; i_24_++) {
						for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -65; i_25_++) {
							int i_26_ = i_21_ + i_24_;
							int i_27_ = i_22_ + i_25_;
							if ((i_26_ ^ 0xffffffff) <= -1 && ((i_26_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)) && i_27_ >= 0 && ((Class255) this).anInt3643 > i_27_)
								class199.method1309(i_26_, i_27_, 99);
						}
					}
				}
			}
			int i_28_ = i_21_ + i_19_;
			int i_29_ = i_22_ + i_20_;
			for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (((Class255) this).anInt3670 ^ 0xffffffff)); i_30_++) {
				for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -65; i_31_++) {
					for (int i_32_ = 0; i_32_ < 64; i_32_++)
						method1654(i_22_ + i_32_, i_29_ - -i_32_, i_31_ - -i_21_, i_31_ + i_28_, 0, false, i_30_, 0, 0, 19108, stream);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.J(" + i + ',' + i_19_ + ',' + i_20_ + ',' + (stream != null ? "{...}" : "null") + ',' + i_21_ + ',' + (class199s != null ? "{...}" : "null") + ',' + i_22_ + ')'));
		}
	}

	final void method1652(int[][][] is, byte i, Class199[] class199s, Class260 class260) {
		try {
			if (!((Class255) this).aBool3658) {
				for (int i_33_ = 0; i_33_ < 4; i_33_++) {
					for (int i_34_ = 0; i_34_ < ((Class255) this).anInt3661; i_34_++) {
						for (int i_35_ = 0; ((Class255) this).anInt3643 > i_35_; i_35_++) {
							if (((Class45.aByteArrayArrayArray648[i_33_][i_34_][i_35_]) & 0x1) != 0) {
								int i_36_ = i_33_;
								if (((Class45.aByteArrayArrayArray648[1][i_34_][i_35_]) & 0x2) != 0)
									i_36_--;
								if (i_36_ >= 0)
									class199s[i_36_].method1323(i_35_, 2097152, i_34_);
							}
						}
					}
				}
			}
			anInt3660++;
			if (i > -16)
				method1650(46, null, 98);
			for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (((Class255) this).anInt3670 ^ 0xffffffff)); i_37_++) {
				int i_38_ = 0;
				int i_39_ = 0;
				if (!((Class255) this).aBool3658) {
					if (Class174.aBool2462)
						i_39_ |= 0x8;
					if (Class132.aBool1833)
						i_38_ |= 0x2;
					if (Stream_Sub1.anInt5855 != 0) {
						if ((i_37_ ^ 0xffffffff) == -1 | Class59_Sub5_Sub1.aBool5828)
							i_39_ |= 0x10;
						i_38_ |= 0x1;
					}
				}
				if (Class132.aBool1833)
					i_39_ |= 0x7;
				if (!Class_w.aBool6387)
					i_39_ |= 0x20;
				int[][] is_40_ = (is != null && (i_37_ ^ 0xffffffff) > (is.length ^ 0xffffffff) ? is[i_37_] : ((Class255) this).anIntArrayArrayArray3664[i_37_]);
				Class246_Sub28_Sub24.method2739(i_37_, class260.method1738(((Class255) this).anInt3661, ((Class255) this).anInt3643, (((Class255) this).anIntArrayArrayArray3664[i_37_]), is_40_, 128, i_38_, i_39_));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class199s != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1653(int i, Class210 class210, Class210 class210_41_, Class260 class260) {
		try {
			anInt3642++;
			if (Class_j.anIntArray1487 == null || (Class_j.anIntArray1487.length != ((Class255) this).anInt3643)) {
				Class187_Sub1.anIntArray4869 = new int[((Class255) this).anInt3643];
				BufferStream.anIntArray5630 = new int[((Class255) this).anInt3643];
				Class254.anIntArray3623 = new int[((Class255) this).anInt3643];
				Class137.anIntArray1961 = new int[((Class255) this).anInt3643];
				Class_j.anIntArray1487 = new int[((Class255) this).anInt3643];
			}
			int[][] is = (new int[((Class255) this).anInt3661][((Class255) this).anInt3643]);
			for (int i_42_ = 0; ((((Class255) this).anInt3670 ^ 0xffffffff) < (i_42_ ^ 0xffffffff)); i_42_++) {
				for (int i_43_ = 0; ((i_43_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)); i_43_++) {
					Class_j.anIntArray1487[i_43_] = 0;
					Class187_Sub1.anIntArray4869[i_43_] = 0;
					BufferStream.anIntArray5630[i_43_] = 0;
					Class137.anIntArray1961[i_43_] = 0;
					Class254.anIntArray3623[i_43_] = 0;
				}
				for (int i_44_ = -5; ((i_44_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)); i_44_++) {
					for (int i_45_ = 0; ((i_45_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)); i_45_++) {
						int i_46_ = i_44_ + 5;
						if (((Class255) this).anInt3661 > i_46_) {
							int i_47_ = ((aByteArrayArrayArray3655[i_42_][i_46_][i_45_]) & 0xff);
							if (i_47_ > 0) {
								Class207 class207 = aClass175_3659.method1151(-18411, i_47_ - 1);
								Class_j.anIntArray1487[i_45_] += ((Class207) class207).anInt2917;
								Class187_Sub1.anIntArray4869[i_45_] += ((Class207) class207).anInt2909;
								BufferStream.anIntArray5630[i_45_] += ((Class207) class207).anInt2911;
								Class137.anIntArray1961[i_45_] += ((Class207) class207).anInt2910;
								Class254.anIntArray3623[i_45_]++;
							}
						}
						int i_48_ = -5 + i_44_;
						if (i_48_ >= 0) {
							int i_49_ = 0xff & (aByteArrayArrayArray3655[i_42_][i_48_][i_45_]);
							if ((i_49_ ^ 0xffffffff) < -1) {
								Class207 class207 = aClass175_3659.method1151(i + -39890, i_49_ - 1);
								Class_j.anIntArray1487[i_45_] -= ((Class207) class207).anInt2917;
								Class187_Sub1.anIntArray4869[i_45_] -= ((Class207) class207).anInt2909;
								BufferStream.anIntArray5630[i_45_] -= ((Class207) class207).anInt2911;
								Class137.anIntArray1961[i_45_] -= ((Class207) class207).anInt2910;
								Class254.anIntArray3623[i_45_]--;
							}
						}
					}
					if ((i_44_ ^ 0xffffffff) <= -1) {
						int i_50_ = 0;
						int i_51_ = 0;
						int i_52_ = 0;
						int i_53_ = 0;
						int i_54_ = 0;
						for (int i_55_ = -5; ((Class255) this).anInt3643 > i_55_; i_55_++) {
							int i_56_ = 5 + i_55_;
							if ((i_56_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)) {
								i_51_ += Class187_Sub1.anIntArray4869[i_56_];
								i_54_ += Class254.anIntArray3623[i_56_];
								i_50_ += Class_j.anIntArray1487[i_56_];
								i_53_ += Class137.anIntArray1961[i_56_];
								i_52_ += BufferStream.anIntArray5630[i_56_];
							}
							int i_57_ = -5 + i_55_;
							if (i_57_ >= 0) {
								i_53_ -= Class137.anIntArray1961[i_57_];
								i_50_ -= Class_j.anIntArray1487[i_57_];
								i_54_ -= Class254.anIntArray3623[i_57_];
								i_51_ -= Class187_Sub1.anIntArray4869[i_57_];
								i_52_ -= BufferStream.anIntArray5630[i_57_];
							}
							if (i_55_ >= 0 && (i_53_ ^ 0xffffffff) < -1 && (i_54_ ^ 0xffffffff) < -1)
								is[i_44_][i_55_] = Class40_Sub4.method1877(i_51_ / i_54_, (i_50_ * 256 / i_53_), i - 21477, i_52_ / i_54_);
						}
					}
				}
				if (!Class31.aBool414)
					method1655(class260, ((i_42_ ^ 0xffffffff) != -1 ? null : class210_41_), i_42_ != 0 ? null : class210, is, 8228, i_42_, Class59_Sub3_Sub4.aClass210Array6993[i_42_]);
				else
					method1656(i_42_, i_42_ == 0 ? class210 : null, is, class260, (byte) -73, Class59_Sub3_Sub4.aClass210Array6993[i_42_], ((i_42_ ^ 0xffffffff) == -1 ? class210_41_ : null));
				aByteArrayArrayArray3655[i_42_] = null;
				aByteArrayArrayArray3651[i_42_] = null;
				aByteArrayArrayArray3646[i_42_] = null;
				aByteArrayArrayArray3656[i_42_] = null;
			}
			if (!((Class255) this).aBool3658) {
				if (Stream_Sub1.anInt5855 != 0)
					Class246_Sub28_Sub25.method2750();
				if (Class132.aBool1833)
					Class104.method670();
			}
			if (i == 21479) {
				for (int i_58_ = 0; ((Class255) this).anInt3670 > i_58_; i_58_++)
					Class59_Sub3_Sub4.aClass210Array6993[i_58_].ca();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.M(" + i + ',' + (class210 != null ? "{...}" : "null") + ',' + (class210_41_ != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1654(int i, int i_59_, int i_60_, int i_61_, int i_62_, boolean bool, int i_63_, int i_64_, int i_65_, int i_66_, BufferStream stream) {
		try {
			if (i_66_ != 19108)
				aClass175_3659 = null;
			anInt3652++;
			if (i_62_ == 1)
				i_64_ = 1;
			else if ((i_62_ ^ 0xffffffff) == -3) {
				i_65_ = 1;
				i_64_ = 1;
			} else if (i_62_ == 3)
				i_65_ = 1;
			if ((i_60_ ^ 0xffffffff) > -1 || (i_60_ ^ 0xffffffff) <= (((Class255) this).anInt3661 ^ 0xffffffff) || (i ^ 0xffffffff) > -1 || i >= ((Class255) this).anInt3643) {
				for (;;) {
					int i_67_ = stream.readUnsignedByte(255);
					if (i_67_ == 0)
						break;
					if ((i_67_ ^ 0xffffffff) == -2) {
						stream.readUnsignedByte(255);
						break;
					}
					if ((i_67_ ^ 0xffffffff) >= -50)
						stream.readUnsignedByte(255);
				}
			} else {
				if (!((Class255) this).aBool3658 && !bool)
					Class45.aByteArrayArrayArray648[i_63_][i_60_][i] = (byte) 0;
				for (;;) {
					int i_68_ = stream.readUnsignedByte(255);
					if ((i_68_ ^ 0xffffffff) == -1) {
						if (!((Class255) this).aBool3658) {
							if ((i_63_ ^ 0xffffffff) == -1)
								((Class255) this).anIntArrayArrayArray3664[0][i_65_ + i_60_][i + i_64_] = (8 * -Class103.method663((byte) -84, 932731 - -i_61_, i_59_ + 556238) << 0);
							else
								((Class255) this).anIntArrayArrayArray3664[i_63_][i_60_ - -i_65_][i_64_ + i] = -240 + (((Class255) this).anIntArrayArrayArray3664[i_63_ - 1][i_65_ + i_60_][i_64_ + i]);
						} else {
							((Class255) this).anIntArrayArrayArray3664[0][i_60_ - -i_65_][i - -i_64_] = 0;
							break;
						}
						break;
					}
					if ((i_68_ ^ 0xffffffff) == -2) {
						int i_69_ = stream.readUnsignedByte(255);
						if (!((Class255) this).aBool3658) {
							if ((i_69_ ^ 0xffffffff) == -2)
								i_69_ = 0;
							if (i_63_ != 0)
								((Class255) this).anIntArrayArrayArray3664[i_63_][i_65_ + i_60_][i + i_64_] = ((((Class255) this).anIntArrayArrayArray3664[-1 + i_63_][i_65_ + i_60_][i - -i_64_]) + -(8 * i_69_ << 0));
							else
								((Class255) this).anIntArrayArrayArray3664[0][i_60_ + i_65_][i - -i_64_] = 8 * -i_69_ << 0;
						} else {
							((Class255) this).anIntArrayArrayArray3664[0][i_65_ + i_60_][i - -i_64_] = 8 * i_69_ << 0;
							break;
						}
						break;
					}
					if (i_68_ <= 49) {
						if (bool)
							stream.readUnsignedByte(i_66_ ^ 0x4a5b);
						else {
							aByteArrayArrayArray3651[i_63_][i_60_][i] = stream.readByte(false);
							aByteArrayArrayArray3646[i_63_][i_60_][i] = (byte) ((-2 + i_68_) / 4);
							aByteArrayArrayArray3656[i_63_][i_60_][i] = (byte) PacketsDecoder.method184(3, i_62_ + (-2 + i_68_));
						}
					} else if (i_68_ <= 81) {
						if (!((Class255) this).aBool3658 && !bool)
							Class45.aByteArrayArrayArray648[i_63_][i_60_][i] = (byte) (i_68_ - 49);
					} else if (!bool)
						aByteArrayArrayArray3655[i_63_][i_60_][i] = (byte) (i_68_ - 81);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.D(" + i + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + i_62_ + ',' + bool + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + i_66_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1655(Class260 class260, Class210 class210, Class210 class210_70_, int[][] is, int i, int i_71_, Class210 class210_72_) {
		try {
			anInt3639++;
			if (i != 8228)
				aFloat3654 = 0.76392615F;
			for (int i_73_ = 0; ((i_73_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)); i_73_++) {
				for (int i_74_ = 0; ((i_74_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)); i_74_++) {
					if ((Class_q_Sub1.anInt6664 ^ 0xffffffff) == 0 || IntegerNode.method2179(i_73_, Class_q_Sub1.anInt6664, (byte) 56, i_71_, i_74_)) {
						byte i_75_ = aByteArrayArrayArray3646[i_71_][i_73_][i_74_];
						byte i_76_ = aByteArrayArrayArray3656[i_71_][i_73_][i_74_];
						int i_77_ = 0xff & (aByteArrayArrayArray3651[i_71_][i_73_][i_74_]);
						int i_78_ = (aByteArrayArrayArray3655[i_71_][i_73_][i_74_] & 0xff);
						PacketsDecoder class_is = ((i_77_ ^ 0xffffffff) == -1 ? null : aClass105_3667.method703(4, i_77_ - 1));
						Class207 class207 = (i_78_ == 0 ? null : aClass175_3659.method1151(i ^ ~0x67ce, -1 + i_78_));
						int i_79_ = 0;
						int i_80_ = 0;
						if ((i_75_ ^ 0xffffffff) != -1) {
							i_80_ = (class_is == null ? 0 : Class260_Sub2.f_be[i_75_]);
							i_79_ = (class207 != null ? Class120.anIntArray1652[i_75_] : 0);
						} else if (class_is == null) {
							if (class207 != null)
								i_79_ = Class260_Sub2.f_be[i_75_];
						} else
							i_80_ = Class260_Sub2.f_be[i_75_];
						int i_81_ = i_79_ + i_80_;
						int i_82_ = 0;
						if (i_81_ != 0) {
							int[] is_83_ = new int[i_81_];
							int[] is_84_ = new int[i_81_];
							int[] is_85_ = new int[i_81_];
							int[] is_86_ = new int[i_81_];
							boolean bool = false;
							if (class_is == null || ((((PacketsDecoder) class_is).anInt284 ^ 0xffffffff) == 0 && (((PacketsDecoder) class_is).anInt271 ^ 0xffffffff) == 0 && (((PacketsDecoder) class_is).anInt279 ^ 0xffffffff) == 0)) {
								for (int i_87_ = 0; ((i_87_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff)); i_87_++) {
									is_83_[i_82_] = -1;
									i_82_++;
								}
							} else {
								int i_88_ = (!class260.method1684() ? ((PacketsDecoder) class_is).anInt276 : ((PacketsDecoder) class_is).anInt279);
								if (Class246_Sub1_Sub9.aBool6180)
									i_88_ = -1;
								for (int i_89_ = 0; ((i_89_ ^ 0xffffffff) > (i_80_ ^ 0xffffffff)); i_89_++) {
									is_85_[i_82_] = i_88_;
									is_86_[i_82_] = ((PacketsDecoder) class_is).anInt275;
									if ((((PacketsDecoder) class_is).anInt284 ^ 0xffffffff) != 0)
										is_83_[i_82_] = ((PacketsDecoder) class_is).anInt284;
									else
										is_83_[i_82_] = -1;
									if ((((PacketsDecoder) class_is).anInt271 ^ 0xffffffff) == 0)
										is_84_[i_82_] = -1;
									else {
										is_84_[i_82_] = ((PacketsDecoder) class_is).anInt271;
										bool = true;
									}
									i_82_++;
								}
								if (!((Class255) this).aBool3658 && (i_71_ ^ 0xffffffff) == -1)
									Class41.method287(i_73_, i_74_, ((PacketsDecoder) class_is).anInt277, 8 * ((PacketsDecoder) class_is).anInt286, ((PacketsDecoder) class_is).anInt287);
							}
							if (!bool)
								is_84_ = null;
							if (class207 == null) {
								for (int i_90_ = 0; i_90_ < i_79_; i_90_++) {
									is_83_[i_82_] = -1;
									i_82_++;
								}
							} else {
								int i_91_ = ((Class207) class207).anInt2914;
								if (Class246_Sub1_Sub9.aBool6180)
									i_91_ = -1;
								for (int i_92_ = 0; i_79_ > i_92_; i_92_++) {
									is_85_[i_82_] = i_91_;
									is_86_[i_82_] = ((Class207) class207).anInt2924;
									is_83_[i_82_] = is[i_73_][i_74_];
									if (is_84_ != null)
										is_84_[i_82_] = -1;
									i_82_++;
								}
							}
							int i_93_ = anIntArray3650.length;
							int[] is_94_ = new int[i_93_];
							int[] is_95_ = new int[i_93_];
							int[] is_96_ = class210_70_ != null ? new int[i_93_] : null;
							int[] is_97_ = (class210_70_ == null && class210 == null ? null : new int[i_93_]);
							for (int i_98_ = 0; (i_93_ ^ 0xffffffff) < (i_98_ ^ 0xffffffff); i_98_++) {
								int i_99_ = anIntArray3650[i_98_];
								int i_100_ = anIntArray3657[i_98_];
								if ((i_76_ ^ 0xffffffff) != -1) {
									if ((i_76_ ^ 0xffffffff) == -2) {
										int i_101_ = i_99_;
										is_94_[i_98_] = i_100_;
										is_95_[i_98_] = 128 + -i_101_;
									} else if (i_76_ != 2) {
										if (i_76_ == 3) {
											int i_102_ = i_99_;
											is_94_[i_98_] = -i_100_ + 128;
											is_95_[i_98_] = i_102_;
										}
									} else {
										is_94_[i_98_] = -i_99_ + 128;
										is_95_[i_98_] = -i_100_ + 128;
									}
								} else {
									is_94_[i_98_] = i_99_;
									is_95_[i_98_] = i_100_;
								}
								if (is_96_ != null && (Class59_Sub4_Sub1.aBoolArrayArray6312[i_75_][i_98_])) {
									int i_103_ = (i_73_ << 7) - -i_99_;
									int i_104_ = i_99_ + (i_74_ << 7);
									is_96_[i_98_] = (class210_70_.a(i_103_, i_104_) + -class210_72_.a(i_103_, i_104_));
								}
								if (is_97_ != null) {
									if (class210_70_ == null || (Class59_Sub4_Sub1.aBoolArrayArray6312[i_75_][i_98_])) {
										if (class210 != null && !(Class213.aBoolArrayArray2983[i_75_][i_98_])) {
											int i_105_ = (i_73_ << 7) - -i_99_;
											int i_106_ = i_99_ + (i_74_ << 7);
											is_97_[i_98_] = (class210.a(i_105_, i_106_) - class210_72_.a(i_105_, i_106_));
										}
									} else {
										int i_107_ = i_99_ + (i_73_ << 7);
										int i_108_ = (i_74_ << 7) + i_99_;
										is_97_[i_98_] = (class210_72_.a(i_107_, i_108_) - class210_70_.a(i_107_, i_108_));
									}
								}
							}
							int i_109_ = class210_72_.l(i_73_, i_74_);
							int i_110_ = class210_72_.l(1 + i_73_, i_74_);
							int i_111_ = class210_72_.l(1 + i_73_, i_74_ + 1);
							int i_112_ = class210_72_.l(i_73_, 1 + i_74_);
							if (i_71_ > 0) {
								boolean bool_113_ = true;
								if ((i_78_ ^ 0xffffffff) == -1 && i_75_ != 0)
									bool_113_ = false;
								if (i_77_ > 0 && class_is != null && !((PacketsDecoder) class_is).aBool290)
									bool_113_ = false;
								if (bool_113_ && (i_110_ ^ 0xffffffff) == (i_109_ ^ 0xffffffff) && i_109_ == i_111_ && i_112_ == i_109_)
									((Class255) this).aByteArrayArrayArray3641[i_71_][i_73_][i_74_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i_71_][i_73_][i_74_]), 4));
							}
							int i_114_ = 0;
							int i_115_ = 0;
							int i_116_ = 0;
							if (((Class255) this).aBool3658) {
								i_114_ = Actor.method2672(i_73_, i_74_);
								i_115_ = Class133.method899(i_73_, i_74_);
								i_116_ = Class59_Sub4_Sub1.method2638(i_73_, i_74_);
							}
							class210_72_.method1378(i_73_, i_74_, is_94_, is_96_, is_95_, is_97_, Class205.anIntArrayArray2889[i_75_], Class246_Sub7_Sub1.anIntArrayArray6081[i_75_], Class128_Sub2.anIntArrayArray5566[i_75_], is_83_, is_84_, is_85_, is_86_, i_114_, i_115_, i_116_, false);
							Class93.method596(i_71_, i_73_, i_74_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.I(" + (class260 != null ? "{...}" : "null") + ',' + (class210 != null ? "{...}" : "null") + ',' + (class210_70_ != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_71_ + ',' + (class210_72_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1656(int i, Class210 class210, int[][] is, Class260 class260, byte i_117_, Class210 class210_118_, Class210 class210_119_) {
		try {
			anInt3672++;
			byte[][] is_120_ = aByteArrayArrayArray3646[i];
			if (i_117_ > -54)
				method1652(null, (byte) 24, null, null);
			byte[][] is_121_ = aByteArrayArrayArray3656[i];
			byte[][] is_122_ = aByteArrayArrayArray3655[i];
			byte[][] is_123_ = aByteArrayArrayArray3651[i];
			for (int i_124_ = 0; ((i_124_ ^ 0xffffffff) > (((Class255) this).anInt3661 ^ 0xffffffff)); i_124_++) {
				int i_125_ = (((-1 + ((Class255) this).anInt3661 ^ 0xffffffff) < (i_124_ ^ 0xffffffff)) ? 1 + i_124_ : i_124_);
				for (int i_126_ = 0; ((i_126_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)); i_126_++) {
					int i_127_ = (i_126_ >= ((Class255) this).anInt3643 - 1 ? i_126_ : i_126_ + 1);
					if (Class_q_Sub1.anInt6664 == -1 || IntegerNode.method2179(i_124_, Class_q_Sub1.anInt6664, (byte) 56, i, i_126_)) {
						boolean bool = false;
						boolean bool_128_ = false;
						boolean[] bools = new boolean[4];
						byte i_129_ = is_120_[i_124_][i_126_];
						int i_130_ = is_121_[i_124_][i_126_];
						int i_131_ = 0xff & is_123_[i_124_][i_126_];
						int i_132_ = is_122_[i_124_][i_126_] & 0xff;
						int i_133_ = is_122_[i_124_][i_127_] & 0xff;
						int i_134_ = 0xff & is_122_[i_125_][i_127_];
						int i_135_ = is_122_[i_125_][i_126_] & 0xff;
						if ((i_131_ ^ 0xffffffff) != -1 || i_132_ != 0) {
							PacketsDecoder class_is = (i_131_ != 0 ? aClass105_3667.method703(4, -1 + i_131_) : null);
							Class207 class207 = (i_132_ != 0 ? aClass175_3659.method1151(-18411, -1 + i_132_) : null);
							if (i_129_ == 0 && class_is == null)
								i_129_ = (byte) 12;
							PacketsDecoder class_is_136_ = class_is;
							if (class_is != null) {
								if (((PacketsDecoder) class_is).anInt284 != -1 || ((PacketsDecoder) class_is).anInt271 != -1) {
									if (class207 != null && i_129_ != 0)
										bool_128_ = ((PacketsDecoder) class_is).aBool281;
								} else {
									class_is_136_ = class_is;
									class_is = null;
								}
							}
							if ((i_129_ == 0 || (i_129_ ^ 0xffffffff) == -13) && (i_124_ ^ 0xffffffff) < -1 && i_126_ > 0 && ((((Class255) this).anInt3661 ^ 0xffffffff) < (i_124_ ^ 0xffffffff)) && ((Class255) this).anInt3643 > i_126_) {
								int i_137_ = 0;
								int i_138_ = 0;
								int i_139_ = 0;
								i_139_ = (i_139_ + (i_132_ != is_122_[i_125_][i_127_] ? -1 : 1));
								i_138_ = i_138_ + (i_132_ != (is_122_[i_125_][i_126_ - 1]) ? -1 : 1);
								i_137_ = i_137_ + (((i_132_ ^ 0xffffffff) != ((is_122_[-1 + i_124_][i_126_ - 1]) ^ 0xffffffff)) ? -1 : 1);
								int i_140_ = 0;
								i_140_ = (i_140_ - (i_132_ == is_122_[i_124_ - 1][i_127_] ? 1 : 1));
								if ((i_132_ ^ 0xffffffff) != (is_122_[i_124_][i_126_ - 1] ^ 0xffffffff)) {
									i_137_--;
									i_138_--;
								} else {
									i_138_++;
									i_137_++;
								}
								if (i_132_ != is_122_[i_125_][i_126_]) {
									i_138_--;
									i_139_--;
								} else {
									i_138_++;
									i_139_++;
								}
								if ((i_132_ ^ 0xffffffff) == (is_122_[i_124_][i_127_] ^ 0xffffffff)) {
									i_140_++;
									i_139_++;
								} else {
									i_140_--;
									i_139_--;
								}
								if ((is_122_[-1 + i_124_][i_126_] ^ 0xffffffff) != (i_132_ ^ 0xffffffff)) {
									i_140_--;
									i_137_--;
								} else {
									i_137_++;
									i_140_++;
								}
								int i_141_ = i_137_ + -i_139_;
								if (i_141_ < 0)
									i_141_ = -i_141_;
								int i_142_ = i_138_ + -i_140_;
								if ((i_142_ ^ 0xffffffff) > -1)
									i_142_ = -i_142_;
								if (i_141_ == i_142_) {
									i_141_ = (class210_118_.l(i_124_, i_126_) + -class210_118_.l(i_125_, i_127_));
									if (i_141_ < 0)
										i_141_ = -i_141_;
									i_142_ = (class210_118_.l(i_125_, i_126_) - class210_118_.l(i_124_, i_127_));
									if ((i_142_ ^ 0xffffffff) > -1)
										i_142_ = -i_142_;
								}
								i_130_ = i_142_ > i_141_ ? 1 : 0;
							}
							for (int i_143_ = 0; i_143_ < 13; i_143_++) {
								Class82.anIntArray1076[i_143_] = -1;
								Class160.anIntArray2267[i_143_] = 1;
							}
							boolean[] bools_144_ = ((class_is == null || !((PacketsDecoder) class_is).aBool281) ? Class92.aBoolArrayArray1207[i_129_] : Class_a.aBoolArrayArray1182[i_129_]);
							method1659(((Class255) this).anInt3643, 22245, is_123_, i_129_, i_126_, i_130_, bools, ((Class255) this).anInt3661, i_124_, class_is, is_120_, class207, is_121_, class260);
							boolean bool_145_ = (class_is != null && ((((PacketsDecoder) class_is).anInt284 ^ 0xffffffff) != (((PacketsDecoder) class_is).anInt271 ^ 0xffffffff)));
							if (!bool_145_) {
								for (int i_146_ = 0; (i_146_ ^ 0xffffffff) > -9; i_146_++) {
									if ((Class82.anIntArray1076[i_146_] ^ 0xffffffff) <= -1 && ((Class61.anIntArray845[i_146_] ^ 0xffffffff) != ((Class38_Sub1_Sub1.anIntArray6769[i_146_]) ^ 0xffffffff))) {
										bool_145_ = true;
										break;
									}
								}
							}
							if (!bools_144_[1 - -i_130_ & 0x3])
								bools[1] = (Class113.method774(bools[1], PacketsDecoder.method184((Class160.anIntArray2267[2]), (Class160.anIntArray2267[4])) == 0));
							if (!bools_144_[0x3 & 3 + i_130_])
								bools[3] = (Class113.method774(bools[3], (PacketsDecoder.method184((Class160.anIntArray2267[6]), (Class160.anIntArray2267[0])) ^ 0xffffffff) == -1));
							if (!bools_144_[i_130_ & 0x3])
								bools[0] = (Class113.method774(bools[0], PacketsDecoder.method184((Class160.anIntArray2267[0]), (Class160.anIntArray2267[2])) == 0));
							if (!bools_144_[i_130_ + 2 & 0x3])
								bools[2] = (Class113.method774(bools[2], PacketsDecoder.method184((Class160.anIntArray2267[4]), (Class160.anIntArray2267[6])) == 0));
							if (!bool_128_ && (i_129_ == 0 || i_129_ == 12)) {
								if (!bools[0] || bools[1] || bools[2] || !bools[3]) {
									if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
										i_130_ = 3;
										bools[0] = bools[1] = false;
										i_129_ = (i_129_ != 0 ? (byte) 14 : (byte) 13);
									} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
										i_130_ = 2;
										i_129_ = ((i_129_ ^ 0xffffffff) != -1 ? (byte) 14 : (byte) 13);
										bools[1] = bools[2] = false;
									} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
										i_130_ = 1;
										i_129_ = (i_129_ == 0 ? (byte) 13 : (byte) 14);
										bools[2] = bools[3] = false;
									}
								} else {
									bools[0] = bools[3] = false;
									i_129_ = ((i_129_ ^ 0xffffffff) == -1 ? (byte) 13 : (byte) 14);
									i_130_ = 0;
								}
							}
							boolean bool_147_ = (!bool_128_ && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
							int[] is_148_ = null;
							int i_149_;
							int[] is_150_;
							int[] is_151_;
							int i_152_;
							int[] is_153_;
							if (!bool_147_) {
								if (!bool_128_) {
									is_148_ = Class102.anIntArrayArray1325[i_129_];
									is_150_ = Class251.anIntArrayArray3555[i_129_];
									is_153_ = (Class246_Sub43.anIntArrayArray5602[i_129_]);
									is_151_ = Class200.anIntArrayArray2853[i_129_];
									i_152_ = (class_is == null ? 0 : (Class246_Sub1.anIntArray3738[i_129_]));
									i_149_ = (class207 == null ? 0 : (Class246_Sub28_Sub25.anIntArray6706[i_129_]));
								} else {
									i_152_ = class_is != null ? (Class260_Sub2.anIntArray4277[i_129_]) : 0;
									is_150_ = (Class246_Sub10.anIntArrayArray4083[i_129_]);
									is_151_ = (Class59_Sub2.anIntArrayArray4545[i_129_]);
									is_153_ = (Class59_Sub4_Sub1.anIntArrayArray6315[i_129_]);
									i_149_ = (class207 == null ? 0 : (Class59_Sub2_Sub2.anIntArray6023[i_129_]));
									is_148_ = (Class246_Sub1_Sub8_Sub1.anIntArrayArray7158[i_129_]);
								}
							} else {
								i_149_ = (class207 == null ? 0 : Class120.anIntArray1652[i_129_]);
								is_150_ = Class205.anIntArrayArray2889[i_129_];
								is_151_ = (Class246_Sub7_Sub1.anIntArrayArray6081[i_129_]);
								i_152_ = (class_is != null ? Class260_Sub2.f_be[i_129_] : 0);
								is_153_ = (Class128_Sub2.anIntArrayArray5566[i_129_]);
							}
							int i_154_ = i_152_ + i_149_;
							if (i_154_ <= 0)
								Class93.method596(i, i_124_, i_126_);
							else {
								if (bools[0])
									i_154_++;
								if (bools[2])
									i_154_++;
								if (bools[1])
									i_154_++;
								if (bools[3])
									i_154_++;
								int i_155_ = 0;
								int i_156_ = 0;
								int i_157_ = i_154_ * 3;
								int[] is_158_ = !bool_145_ ? null : new int[i_157_];
								int[] is_159_ = new int[i_157_];
								int[] is_160_ = new int[i_157_];
								int[] is_161_ = new int[i_157_];
								int[] is_162_ = new int[i_157_];
								int[] is_163_ = new int[i_157_];
								int[] is_164_ = (class210 == null ? null : new int[i_157_]);
								int[] is_165_ = ((class210 == null && class210_119_ == null) ? null : new int[i_157_]);
								int i_166_ = -1;
								int i_167_ = -1;
								int i_168_ = 256;
								if (class_is != null) {
									i_166_ = ((PacketsDecoder) class_is).anInt284;
									i_167_ = (!class260.method1684() ? ((PacketsDecoder) class_is).anInt276 : ((PacketsDecoder) class_is).anInt279);
									i_168_ = ((PacketsDecoder) class_is).anInt275;
									int i_169_ = (Class246_Sub41_Sub2.method2681(class_is, class260, (byte) -31));
									for (int i_170_ = 0; ((i_170_ ^ 0xffffffff) > (i_152_ ^ 0xffffffff)); i_170_++) {
										boolean bool_171_ = false;
										int i_172_;
										if (bools[-i_130_ & 0x3] && i_155_ == is_148_[0]) {
											Class193.anIntArray2717[0] = is_150_[i_155_];
											Class193.anIntArray2717[1] = 1;
											Class193.anIntArray2717[2] = is_153_[i_155_];
											Class193.anIntArray2717[3] = 1;
											Class193.anIntArray2717[4] = is_151_[i_155_];
											i_172_ = 6;
											Class193.anIntArray2717[5] = is_153_[i_155_];
										} else if (!bools[2 + -i_130_ & 0x3] || ((is_148_[2] ^ 0xffffffff) != (i_155_ ^ 0xffffffff))) {
											if (!bools[-i_130_ + 1 & 0x3] || ((i_155_ ^ 0xffffffff) != (is_148_[1] ^ 0xffffffff))) {
												if (bools[3 - i_130_ & 0x3] && is_148_[3] == i_155_) {
													Class193.anIntArray2717[0] = is_150_[i_155_];
													Class193.anIntArray2717[1] = 7;
													Class193.anIntArray2717[2] = is_153_[i_155_];
													Class193.anIntArray2717[3] = 7;
													Class193.anIntArray2717[4] = is_151_[i_155_];
													Class193.anIntArray2717[5] = is_153_[i_155_];
													i_172_ = 6;
												} else {
													Class193.anIntArray2717[0] = is_150_[i_155_];
													Class193.anIntArray2717[1] = is_151_[i_155_];
													Class193.anIntArray2717[2] = is_153_[i_155_];
													i_172_ = 3;
												}
											} else {
												Class193.anIntArray2717[0] = is_150_[i_155_];
												Class193.anIntArray2717[1] = 3;
												Class193.anIntArray2717[2] = is_153_[i_155_];
												Class193.anIntArray2717[3] = 3;
												Class193.anIntArray2717[4] = is_151_[i_155_];
												i_172_ = 6;
												Class193.anIntArray2717[5] = is_153_[i_155_];
											}
										} else {
											Class193.anIntArray2717[0] = is_150_[i_155_];
											Class193.anIntArray2717[1] = 5;
											Class193.anIntArray2717[2] = is_153_[i_155_];
											Class193.anIntArray2717[3] = 5;
											Class193.anIntArray2717[4] = is_151_[i_155_];
											Class193.anIntArray2717[5] = is_153_[i_155_];
											i_172_ = 6;
										}
										for (int i_173_ = 0; ((i_172_ ^ 0xffffffff) < (i_173_ ^ 0xffffffff)); i_173_++) {
											int i_174_ = (Class193.anIntArray2717[i_173_]);
											int i_175_ = 0x7 & -(2 * i_130_) + i_174_;
											int i_176_ = anIntArray3650[i_174_];
											int i_177_ = anIntArray3657[i_174_];
											int i_178_;
											int i_179_;
											if (i_130_ != 1) {
												if ((i_130_ ^ 0xffffffff) != -3) {
													if ((i_130_ ^ 0xffffffff) == -4) {
														i_178_ = -i_177_ + 128;
														i_179_ = i_176_;
													} else {
														i_178_ = i_176_;
														i_179_ = i_177_;
													}
												} else {
													i_179_ = -i_177_ + 128;
													i_178_ = -i_176_ + 128;
												}
											} else {
												i_178_ = i_177_;
												i_179_ = -i_176_ + 128;
											}
											is_159_[i_156_] = i_178_;
											is_160_[i_156_] = i_179_;
											if (is_164_ != null && (Class59_Sub4_Sub1.aBoolArrayArray6312[i_129_][i_174_])) {
												int i_180_ = (i_124_ << 7) - -i_178_;
												int i_181_ = i_179_ + (i_126_ << 7);
												is_164_[i_156_] = (class210.a(i_180_, i_181_) + -(class210_118_.a(i_180_, i_181_)));
											}
											if (is_165_ != null) {
												if (class210 == null || (Class59_Sub4_Sub1.aBoolArrayArray6312[i_129_][i_174_])) {
													if (class210_119_ != null && !(Class213.aBoolArrayArray2983[i_129_][i_174_])) {
														int i_182_ = i_178_ + (i_124_ << 7);
														int i_183_ = ((i_126_ << 7) - -i_179_);
														is_165_[i_156_] = ((class210_119_.a(i_182_, i_183_)) - (class210_118_.a(i_182_, i_183_)));
													}
												} else {
													int i_184_ = (i_178_ + (i_124_ << 7));
													int i_185_ = (i_179_ + (i_126_ << 7));
													is_165_[i_156_] = ((class210_118_.a(i_184_, i_185_)) + -(class210.a(i_184_, i_185_)));
												}
											}
											if ((i_174_ ^ 0xffffffff) <= -9 || ((Class82.anIntArray1076[i_175_]) <= (((PacketsDecoder) class_is).anInt274))) {
												if (is_158_ != null)
													is_158_[i_156_] = i_169_;
												is_162_[i_156_] = (class260.method1684() ? (((PacketsDecoder) class_is).anInt279) : (((PacketsDecoder) class_is).anInt276));
												is_163_[i_156_] = (((PacketsDecoder) class_is).anInt275);
												is_161_[i_156_] = i_166_;
											} else {
												if (is_158_ != null)
													is_158_[i_156_] = (Class61.anIntArray845[i_175_]);
												is_163_[i_156_] = (Class112.anIntArray1589[i_175_]);
												is_162_[i_156_] = (Class59_Sub4_Sub1.anIntArray6313[i_175_]);
												is_161_[i_156_] = (Class38_Sub1_Sub1.anIntArray6769[i_175_]);
											}
											i_156_++;
										}
										i_155_++;
									}
									if (!((Class255) this).aBool3658 && i == 0)
										Class41.method287(i_124_, i_126_, ((PacketsDecoder) class_is).anInt277, (((PacketsDecoder) class_is).anInt286 * 8), ((PacketsDecoder) class_is).anInt287);
									if ((i_129_ ^ 0xffffffff) != -13 && ((PacketsDecoder) class_is).anInt284 != -1 && ((PacketsDecoder) class_is).aBool283)
										bool = true;
								} else if (!bool_147_) {
									if (!bool_128_)
										i_155_ += (Class246_Sub1.anIntArray3738[i_129_]);
									else
										i_155_ += (Class260_Sub2.anIntArray4277[i_129_]);
								} else
									i_155_ += Class260_Sub2.f_be[i_129_];
								if (class207 != null) {
									if (i_135_ == 0)
										i_135_ = i_132_;
									if (i_134_ == 0)
										i_134_ = i_132_;
									if ((i_133_ ^ 0xffffffff) == -1)
										i_133_ = i_132_;
									Class207 class207_186_ = aClass175_3659.method1151(-18411, i_132_ - 1);
									Class207 class207_187_ = aClass175_3659.method1151(-18411, -1 + i_133_);
									Class207 class207_188_ = aClass175_3659.method1151(-18411, -1 + i_134_);
									Class207 class207_189_ = aClass175_3659.method1151(-18411, i_135_ - 1);
									for (int i_190_ = 0; ((i_149_ ^ 0xffffffff) < (i_190_ ^ 0xffffffff)); i_190_++) {
										boolean bool_191_ = false;
										int i_192_;
										if (!bools[0x3 & -i_130_] || i_155_ != is_148_[0]) {
											if (!bools[0x3 & -i_130_ + 2] || ((is_148_[2] ^ 0xffffffff) != (i_155_ ^ 0xffffffff))) {
												if (!bools[0x3 & -i_130_ + 1] || i_155_ != is_148_[1]) {
													if ((bools[0x3 & 3 + -i_130_]) && ((i_155_ ^ 0xffffffff) == (is_148_[3] ^ 0xffffffff))) {
														Class193.anIntArray2717[0] = is_150_[i_155_];
														Class193.anIntArray2717[1] = 7;
														Class193.anIntArray2717[2] = is_153_[i_155_];
														Class193.anIntArray2717[3] = 7;
														Class193.anIntArray2717[4] = is_151_[i_155_];
														i_192_ = 6;
														Class193.anIntArray2717[5] = is_153_[i_155_];
													} else {
														Class193.anIntArray2717[0] = is_150_[i_155_];
														Class193.anIntArray2717[1] = is_151_[i_155_];
														i_192_ = 3;
														Class193.anIntArray2717[2] = is_153_[i_155_];
													}
												} else {
													Class193.anIntArray2717[0] = is_150_[i_155_];
													Class193.anIntArray2717[1] = 3;
													Class193.anIntArray2717[2] = is_153_[i_155_];
													Class193.anIntArray2717[3] = 3;
													Class193.anIntArray2717[4] = is_151_[i_155_];
													Class193.anIntArray2717[5] = is_153_[i_155_];
													i_192_ = 6;
												}
											} else {
												Class193.anIntArray2717[0] = is_150_[i_155_];
												Class193.anIntArray2717[1] = 5;
												Class193.anIntArray2717[2] = is_153_[i_155_];
												Class193.anIntArray2717[3] = 5;
												Class193.anIntArray2717[4] = is_151_[i_155_];
												i_192_ = 6;
												Class193.anIntArray2717[5] = is_153_[i_155_];
											}
										} else {
											Class193.anIntArray2717[0] = is_150_[i_155_];
											Class193.anIntArray2717[1] = 1;
											Class193.anIntArray2717[2] = is_153_[i_155_];
											Class193.anIntArray2717[3] = 1;
											Class193.anIntArray2717[4] = is_151_[i_155_];
											Class193.anIntArray2717[5] = is_153_[i_155_];
											i_192_ = 6;
										}
										for (int i_193_ = 0; ((i_193_ ^ 0xffffffff) > (i_192_ ^ 0xffffffff)); i_193_++) {
											int i_194_ = (Class193.anIntArray2717[i_193_]);
											int i_195_ = i_194_ - 2 * i_130_ & 0x7;
											int i_196_ = anIntArray3650[i_194_];
											int i_197_ = anIntArray3657[i_194_];
											int i_198_;
											int i_199_;
											if (i_130_ != 1) {
												if (i_130_ != 2) {
													if (i_130_ == 3) {
														i_199_ = i_196_;
														i_198_ = -i_197_ + 128;
													} else {
														i_198_ = i_196_;
														i_199_ = i_197_;
													}
												} else {
													i_199_ = -i_197_ + 128;
													i_198_ = 128 - i_196_;
												}
											} else {
												i_198_ = i_197_;
												i_199_ = -i_196_ + 128;
											}
											is_159_[i_156_] = i_198_;
											is_160_[i_156_] = i_199_;
											if (is_164_ != null && (Class59_Sub4_Sub1.aBoolArrayArray6312[i_129_][i_194_])) {
												int i_200_ = i_198_ + (i_124_ << 7);
												int i_201_ = i_199_ + (i_126_ << 7);
												is_164_[i_156_] = (class210.a(i_200_, i_201_) + -(class210_118_.a(i_200_, i_201_)));
											}
											if (is_165_ != null) {
												if (class210 != null && !(Class59_Sub4_Sub1.aBoolArrayArray6312[i_129_][i_194_])) {
													int i_202_ = (i_198_ + (i_124_ << 7));
													int i_203_ = ((i_126_ << 7) - -i_199_);
													is_165_[i_156_] = ((class210_118_.a(i_202_, i_203_)) + -(class210.a(i_202_, i_203_)));
												} else if ((class210_119_ != null) && !(Class213.aBoolArrayArray2983[i_129_][i_194_])) {
													int i_204_ = ((i_124_ << 7) + i_198_);
													int i_205_ = ((i_126_ << 7) + i_199_);
													is_165_[i_156_] = ((class210_119_.a(i_204_, i_205_)) - (class210_118_.a(i_204_, i_205_)));
												}
											}
											if ((i_194_ ^ 0xffffffff) <= -9 || (Class82.anIntArray1076[i_195_]) < 0) {
												if (!bool_128_ || !(Class59_Sub4_Sub1.aBoolArrayArray6312[i_129_][i_194_])) {
													if (((i_198_ ^ 0xffffffff) != -1) || ((i_199_ ^ 0xffffffff) != -1)) {
														if (i_198_ != 0 || i_199_ != 128) {
															if (i_198_ == 128 && (i_199_ == 128)) {
																is_161_[i_156_] = (is[i_125_][i_127_]);
																is_162_[i_156_] = (((Class207) class207_188_).anInt2914);
																is_163_[i_156_] = (((Class207) class207_188_).anInt2924);
															} else if (((i_198_ ^ 0xffffffff) != -129) || ((i_199_ ^ 0xffffffff) != -1)) {
																if ((i_198_ ^ 0xffffffff) > -65) {
																	if (i_199_ >= 64) {
																		is_162_[i_156_] = ((Class207) class207_187_).anInt2914;
																		is_163_[i_156_] = ((Class207) class207_187_).anInt2924;
																	} else {
																		is_162_[i_156_] = ((Class207) class207_186_).anInt2914;
																		is_163_[i_156_] = ((Class207) class207_186_).anInt2924;
																	}
																} else if ((i_199_ ^ 0xffffffff) > -65) {
																	is_162_[i_156_] = (((Class207) class207_189_).anInt2914);
																	is_163_[i_156_] = (((Class207) class207_189_).anInt2924);
																} else {
																	is_162_[i_156_] = (((Class207) class207_188_).anInt2914);
																	is_163_[i_156_] = (((Class207) class207_188_).anInt2924);
																}
																int i_206_ = (ISAAC.method290((byte) 86, (i_198_ << 7 >> 7), (is[i_124_][i_126_]), (is[i_125_][i_126_])));
																int i_207_ = (ISAAC.method290((byte) 86, (i_198_ << 7 >> 7), (is[i_124_][i_127_]), (is[i_125_][i_127_])));
																is_161_[i_156_] = (ISAAC.method290((byte) 86, (i_199_ << 7 >> 7), i_206_, i_207_));
															} else {
																is_161_[i_156_] = (is[i_125_][i_126_]);
																is_162_[i_156_] = (((Class207) class207_189_).anInt2914);
																is_163_[i_156_] = (((Class207) class207_189_).anInt2924);
															}
														} else {
															is_161_[i_156_] = (is[i_124_][i_127_]);
															is_162_[i_156_] = (((Class207) class207_187_).anInt2914);
															is_163_[i_156_] = (((Class207) class207_187_).anInt2924);
														}
													} else {
														is_161_[i_156_] = (is[i_124_][i_126_]);
														is_162_[i_156_] = (((Class207) class207_186_).anInt2914);
														is_163_[i_156_] = (((Class207) class207_186_).anInt2924);
													}
												} else {
													is_162_[i_156_] = i_167_;
													is_163_[i_156_] = i_168_;
													is_161_[i_156_] = i_166_;
												}
												if (is_158_ != null)
													is_158_[i_156_] = is_161_[i_156_];
											} else {
												if (is_158_ != null)
													is_158_[i_156_] = (Class61.anIntArray845[i_195_]);
												is_163_[i_156_] = (Class112.anIntArray1589[i_195_]);
												is_162_[i_156_] = (Class59_Sub4_Sub1.anIntArray6313[i_195_]);
												is_161_[i_156_] = (Class38_Sub1_Sub1.anIntArray6769[i_195_]);
											}
											i_156_++;
										}
										i_155_++;
									}
									if ((i_129_ ^ 0xffffffff) != -1 && ((Class207) class207).aBool2913)
										bool = true;
								}
								int i_208_ = class210_118_.l(i_124_, i_126_);
								int i_209_ = class210_118_.l(i_125_, i_126_);
								int i_210_ = class210_118_.l(i_125_, i_127_);
								int i_211_ = class210_118_.l(i_124_, i_127_);
								if (i > 0) {
									boolean bool_212_ = true;
									if (i_132_ == 0 && i_129_ != 0)
										bool_212_ = false;
									if (i_131_ > 0 && class_is_136_ != null && !(((PacketsDecoder) class_is_136_).aBool290))
										bool_212_ = false;
									if (bool_212_ && i_208_ == i_209_ && i_210_ == i_208_ && ((i_211_ ^ 0xffffffff) == (i_208_ ^ 0xffffffff)))
										((Class255) this).aByteArrayArrayArray3641[i][i_124_][i_126_] = (byte) (Class236.method1523((((Class255) this).aByteArrayArrayArray3641[i][i_124_][i_126_]), 4));
								}
								int i_213_ = 0;
								int i_214_ = 0;
								int i_215_ = 0;
								if (((Class255) this).aBool3658) {
									i_213_ = Actor.method2672(i_124_, i_126_);
									i_214_ = Class133.method899(i_124_, i_126_);
									i_215_ = Class59_Sub4_Sub1.method2638(i_124_, i_126_);
								}
								class210_118_.B(i_124_, i_126_, is_159_, is_164_, is_160_, is_165_, is_161_, is_158_, is_162_, is_163_, i_213_, i_214_, i_215_, bool);
								Class93.method596(i, i_124_, i_126_);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.N(" + i + ',' + (class210 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + i_117_ + ',' + (class210_118_ != null ? "{...}" : "null") + ',' + (class210_119_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1657(int i, BufferStream stream, int i_216_, Class199[] class199s, byte i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_) {
		try {
			anInt3668++;
			int i_223_ = (0x7 & i_222_) * 8;
			if (!((Class255) this).aBool3658) {
				Class199 class199 = class199s[i_219_];
				for (int i_224_ = 0; i_224_ < 8; i_224_++) {
					for (int i_225_ = 0; i_225_ < 8; i_225_++) {
						int i_226_ = i_221_ + Class230.method1475(i_225_ & 0x7, i, 103, 0x7 & i_224_);
						int i_227_ = i_220_ - -Class135.method914(i, (byte) -122, i_224_ & 0x7, i_225_ & 0x7);
						if (i_226_ > 0 && i_226_ < ((Class255) this).anInt3661 - 1 && (i_227_ ^ 0xffffffff) < -1 && i_227_ < ((Class255) this).anInt3643 - 1)
							class199.method1309(i_226_, i_227_, -48);
					}
				}
			}
			int i_228_ = (0x7 & i_218_) * 8;
			int i_229_ = (i_222_ & ~0x7) << 3;
			int i_230_ = i_218_ << 3 & ~0x3f;
			int i_231_ = 0;
			if (i_217_ != -12)
				aByteArrayArrayArray3651 = null;
			int i_232_ = 0;
			if (i != 1) {
				if (i == 2) {
					i_231_ = 1;
					i_232_ = 1;
				} else if (i == 3)
					i_231_ = 1;
			} else
				i_232_ = 1;
			for (int i_233_ = 0; ((i_233_ ^ 0xffffffff) > (((Class255) this).anInt3670 ^ 0xffffffff)); i_233_++) {
				for (int i_234_ = 0; i_234_ < 64; i_234_++) {
					for (int i_235_ = 0; i_235_ < 64; i_235_++) {
						if ((i_233_ ^ 0xffffffff) == (i_216_ ^ 0xffffffff) && (i_234_ ^ 0xffffffff) <= (i_223_ ^ 0xffffffff) && i_234_ <= i_223_ + 8 && i_235_ >= i_228_ && (8 + i_228_ ^ 0xffffffff) <= (i_235_ ^ 0xffffffff)) {
							if ((8 + i_223_ ^ 0xffffffff) == (i_234_ ^ 0xffffffff) || (i_235_ ^ 0xffffffff) == (8 + i_228_ ^ 0xffffffff)) {
								int i_236_;
								int i_237_;
								if ((i ^ 0xffffffff) != -1) {
									if ((i ^ 0xffffffff) != -2) {
										if ((i ^ 0xffffffff) != -3) {
											i_236_ = i_234_ - i_223_ + i_220_;
											i_237_ = i_221_ - (-8 + (-i_228_ + i_235_));
										} else {
											i_236_ = 8 + i_220_ - i_235_ + i_228_;
											i_237_ = (8 + (i_221_ + -i_234_) + i_223_);
										}
									} else {
										i_237_ = i_221_ - (i_228_ + -i_235_);
										i_236_ = i_223_ + -i_234_ + i_220_ + 8;
									}
								} else {
									i_236_ = -i_228_ - (-i_235_ - i_220_);
									i_237_ = i_221_ + (i_234_ - i_223_);
								}
								method1654(i_236_, i_230_ + i_235_, i_237_, i_234_ + i_229_, 0, true, i_219_, 0, 0, 19108, stream);
							} else {
								int i_238_ = (i_221_ + Class230.method1475(i_235_ & 0x7, i, 108, 0x7 & i_234_));
								int i_239_ = (Class135.method914(i, (byte) -113, 0x7 & i_234_, i_235_ & 0x7) + i_220_);
								method1654(i_239_, i_230_ - -i_235_, i_238_, i_234_ + i_229_, i, false, i_219_, i_232_, i_231_, 19108, stream);
								if (i_234_ == 63 || i_235_ == 63) {
									int i_240_ = i_234_ == 63 ? 64 : i_234_;
									int i_241_ = ((i_235_ ^ 0xffffffff) == -64 ? 64 : i_235_);
									int i_242_;
									int i_243_;
									if ((i ^ 0xffffffff) != -1) {
										if (i != 1) {
											if ((i ^ 0xffffffff) != -3) {
												i_243_ = (i_240_ + -i_223_ + i_220_);
												i_242_ = (8 + i_221_ - i_241_ - -i_228_);
											} else {
												i_242_ = (i_221_ + 8 + -i_240_ + i_223_);
												i_243_ = (8 + i_220_ + i_228_ + -i_241_);
											}
										} else {
											i_242_ = i_241_ - (i_228_ - i_221_);
											i_243_ = (-i_240_ + i_223_ + (8 + i_220_));
										}
									} else {
										i_242_ = i_240_ + -i_223_ + i_221_;
										i_243_ = -i_228_ - (-i_241_ - i_220_);
									}
									if (i_242_ >= 0 && ((Class255) this).anInt3661 > i_242_ && (i_243_ ^ 0xffffffff) <= -1 && ((i_243_ ^ 0xffffffff) > (((Class255) this).anInt3643 ^ 0xffffffff)))
										((Class255) this).anIntArrayArrayArray3664[i_219_][i_242_][i_243_] = (((Class255) this).anIntArrayArrayArray3664[i_219_][i_238_ - -i_231_][i_239_ + i_232_]);
								}
							}
						} else
							method1654(-1, 0, -1, 0, 0, false, 0, 0, 0, 19108, stream);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.L(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_216_ + ',' + (class199s != null ? "{...}" : "null") + ',' + i_217_ + ',' + i_218_ + ',' + i_219_ + ',' + i_220_ + ',' + i_221_ + ',' + i_222_ + ')'));
		}
	}

	static final boolean method1658(int i, int i_244_) {
		try {
			if (i != 4)
				return false;
			anInt3669++;
			if ((i_244_ ^ 0xffffffff) != -49 && (i_244_ ^ 0xffffffff) != -48 && (i_244_ ^ 0xffffffff) != -1003 && (i_244_ ^ 0xffffffff) != -10 && (i_244_ ^ 0xffffffff) != -61)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wj.E(" + i + ',' + i_244_ + ')');
		}
	}

	private final void method1659(int i, int i_245_, byte[][] is, int i_246_, int i_247_, int i_248_, boolean[] bools, int i_249_, int i_250_, PacketsDecoder class_is, byte[][] is_251_, Class207 class207, byte[][] is_252_, Class260 class260) {
		do {
			try {
				anInt3645++;
				if (class_is != null && class207 != null || class207 != null && i_246_ == 12 || class_is != null && (i_246_ ^ 0xffffffff) == -1) {
					boolean[] bools_253_ = (class_is == null || !((PacketsDecoder) class_is).aBool281 ? Class92.aBoolArrayArray1207[i_246_] : Class_a.aBoolArrayArray1182[i_246_]);
					if (i_247_ > 0) {
						if ((i_250_ ^ 0xffffffff) < -1) {
							int i_254_ = 0xff & is[-1 + i_250_][-1 + i_247_];
							if ((i_254_ ^ 0xffffffff) < -1) {
								PacketsDecoder class_is_255_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_254_);
								if (((PacketsDecoder) class_is_255_).anInt284 != -1 && ((PacketsDecoder) class_is_255_).aBool281) {
									byte i_256_ = is_251_[i_250_ - 1][i_247_ - 1];
									int i_257_ = 0x7 & 2 * (is_252_[-1 + i_250_][-1 + i_247_]) + 4;
									int i_258_ = (Class246_Sub41_Sub2.method2681(class_is_255_, class260, (byte) -31));
									if (Class59_Sub4_Sub1.aBoolArrayArray6312[i_256_][i_257_]) {
										Class38_Sub1_Sub1.anIntArray6769[0] = (((PacketsDecoder) class_is_255_).anInt284);
										Class61.anIntArray845[0] = i_258_;
										Class59_Sub4_Sub1.anIntArray6313[0] = (class260.method1684() ? (((PacketsDecoder) class_is_255_).anInt279) : (((PacketsDecoder) class_is_255_).anInt276));
										Class112.anIntArray1589[0] = (((PacketsDecoder) class_is_255_).anInt275);
										Class82.anIntArray1076[0] = (((PacketsDecoder) class_is_255_).anInt274);
										Class160.anIntArray2267[0] = 256;
									}
								}
							}
						}
						if ((i_249_ - 1 ^ 0xffffffff) < (i_250_ ^ 0xffffffff)) {
							int i_259_ = 0xff & is[1 + i_250_][-1 + i_247_];
							if (i_259_ > 0) {
								PacketsDecoder class_is_260_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_259_);
								if ((((PacketsDecoder) class_is_260_).anInt284 ^ 0xffffffff) != 0 && ((PacketsDecoder) class_is_260_).aBool281) {
									byte i_261_ = is_251_[1 + i_250_][-1 + i_247_];
									int i_262_ = (2 * is_252_[1 + i_250_][-1 + i_247_] + 6) & 0x7;
									int i_263_ = (Class246_Sub41_Sub2.method2681(class_is_260_, class260, (byte) -31));
									if (Class59_Sub4_Sub1.aBoolArrayArray6312[i_261_][i_262_]) {
										Class38_Sub1_Sub1.anIntArray6769[2] = (((PacketsDecoder) class_is_260_).anInt284);
										Class61.anIntArray845[2] = i_263_;
										Class59_Sub4_Sub1.anIntArray6313[2] = (!class260.method1684() ? (((PacketsDecoder) class_is_260_).anInt276) : (((PacketsDecoder) class_is_260_).anInt279));
										Class112.anIntArray1589[2] = (((PacketsDecoder) class_is_260_).anInt275);
										Class82.anIntArray1076[2] = (((PacketsDecoder) class_is_260_).anInt274);
										Class160.anIntArray2267[2] = 512;
									}
								}
							}
						}
					}
					if ((i_247_ ^ 0xffffffff) > (-1 + i ^ 0xffffffff)) {
						if (i_250_ > 0) {
							int i_264_ = 0xff & is[i_250_ - 1][i_247_ + 1];
							if (i_264_ > 0) {
								PacketsDecoder class_is_265_ = aClass105_3667.method703(4, i_264_ - 1);
								if (((PacketsDecoder) class_is_265_).anInt284 != -1 && ((PacketsDecoder) class_is_265_).aBool281) {
									byte i_266_ = is_251_[-1 + i_250_][1 + i_247_];
									int i_267_ = ((2 * is_252_[i_250_ - 1][i_247_ + 1] + 2) & 0x7);
									int i_268_ = (Class246_Sub41_Sub2.method2681(class_is_265_, class260, (byte) -31));
									if (Class59_Sub4_Sub1.aBoolArrayArray6312[i_266_][i_267_]) {
										Class38_Sub1_Sub1.anIntArray6769[6] = (((PacketsDecoder) class_is_265_).anInt284);
										Class61.anIntArray845[6] = i_268_;
										Class59_Sub4_Sub1.anIntArray6313[6] = (!class260.method1684() ? (((PacketsDecoder) class_is_265_).anInt276) : (((PacketsDecoder) class_is_265_).anInt279));
										Class112.anIntArray1589[6] = (((PacketsDecoder) class_is_265_).anInt275);
										Class82.anIntArray1076[6] = (((PacketsDecoder) class_is_265_).anInt274);
										Class160.anIntArray2267[6] = 64;
									}
								}
							}
						}
						if ((i_250_ ^ 0xffffffff) > (-1 + i_249_ ^ 0xffffffff)) {
							int i_269_ = 0xff & is[1 + i_250_][1 + i_247_];
							if ((i_269_ ^ 0xffffffff) < -1) {
								PacketsDecoder class_is_270_ = aClass105_3667.method703(i_245_ ^ 0x56e1, i_269_ - 1);
								if ((((PacketsDecoder) class_is_270_).anInt284 ^ 0xffffffff) != 0 && ((PacketsDecoder) class_is_270_).aBool281) {
									byte i_271_ = is_251_[i_250_ + 1][i_247_ + 1];
									int i_272_ = (2 * is_252_[1 + i_250_][1 + i_247_] & 0x7);
									int i_273_ = (Class246_Sub41_Sub2.method2681(class_is_270_, class260, (byte) -31));
									if (Class59_Sub4_Sub1.aBoolArrayArray6312[i_271_][i_272_]) {
										Class38_Sub1_Sub1.anIntArray6769[4] = (((PacketsDecoder) class_is_270_).anInt284);
										Class61.anIntArray845[4] = i_273_;
										Class59_Sub4_Sub1.anIntArray6313[4] = (class260.method1684() ? (((PacketsDecoder) class_is_270_).anInt279) : (((PacketsDecoder) class_is_270_).anInt276));
										Class112.anIntArray1589[4] = (((PacketsDecoder) class_is_270_).anInt275);
										Class82.anIntArray1076[4] = (((PacketsDecoder) class_is_270_).anInt274);
										Class160.anIntArray2267[4] = 128;
									}
								}
							}
						}
					}
					if ((i_247_ ^ 0xffffffff) < -1) {
						int i_274_ = 0xff & is[i_250_][i_247_ - 1];
						if ((i_274_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_275_ = aClass105_3667.method703(4, -1 + i_274_);
							if ((((PacketsDecoder) class_is_275_).anInt284 ^ 0xffffffff) != 0) {
								byte i_276_ = is_251_[i_250_][-1 + i_247_];
								int i_277_ = is_252_[i_250_][i_247_ - 1];
								if (((PacketsDecoder) class_is_275_).aBool281) {
									int i_278_ = 2;
									int i_279_ = 4 - -(2 * i_277_);
									int i_280_ = (Class246_Sub41_Sub2.method2681(class_is_275_, class260, (byte) -31));
									for (int i_281_ = 0; i_281_ < 3; i_281_++) {
										i_278_ = 0x7 & i_278_;
										i_279_ = 0x7 & i_279_;
										if ((Class59_Sub4_Sub1.aBoolArrayArray6312[i_276_][i_279_]) && ((Class82.anIntArray1076[i_278_] ^ 0xffffffff) >= ((((PacketsDecoder) class_is_275_).anInt274) ^ 0xffffffff))) {
											Class38_Sub1_Sub1.anIntArray6769[i_278_] = (((PacketsDecoder) class_is_275_).anInt284);
											Class61.anIntArray845[i_278_] = i_280_;
											Class59_Sub4_Sub1.anIntArray6313[i_278_] = (class260.method1684() ? ((PacketsDecoder) class_is_275_).anInt279 : ((PacketsDecoder) class_is_275_).anInt276);
											Class112.anIntArray1589[i_278_] = (((PacketsDecoder) class_is_275_).anInt275);
											if (Class82.anIntArray1076[i_278_] != (((PacketsDecoder) class_is_275_).anInt274))
												Class160.anIntArray2267[i_278_] = 32;
											else
												Class160.anIntArray2267[i_278_] = (Class236.method1523((Class160.anIntArray2267[i_278_]), 32));
											Class82.anIntArray1076[i_278_] = (((PacketsDecoder) class_is_275_).anInt274);
										}
										i_279_++;
										i_278_--;
									}
									if (!bools_253_[0x3 & i_248_])
										bools[0] = (Class_a.aBoolArrayArray1182[i_276_][PacketsDecoder.method184(i_277_ + 2, 3)]);
								} else if (!bools_253_[0x3 & --i_248_])
									bools[0] = (Class92.aBoolArrayArray1207[i_276_][PacketsDecoder.method184(3, i_277_ + 2)]);
							}
						}
					}
					if (i_247_ < -1 + i) {
						int i_282_ = 0xff & is[i_250_][i_247_ + 1];
						if ((i_282_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_283_ = aClass105_3667.method703(i_245_ ^ 0x56e1, -1 + i_282_);
							if ((((PacketsDecoder) class_is_283_).anInt284 ^ 0xffffffff) != 0) {
								byte i_284_ = is_251_[i_250_][i_247_ + 1];
								int i_285_ = is_252_[i_250_][1 + i_247_];
								if (!((PacketsDecoder) class_is_283_).aBool281) {
									if (!bools_253_[0x3 & 2 + i_248_])
										bools[2] = (Class92.aBoolArrayArray1207[i_284_][PacketsDecoder.method184(3, i_285_)]);
								} else {
									int i_286_ = 4;
									int i_287_ = 2 + 2 * i_285_;
									int i_288_ = (Class246_Sub41_Sub2.method2681(class_is_283_, class260, (byte) -31));
									for (int i_289_ = 0; i_289_ < 3; i_289_++) {
										i_287_ &= 0x7;
										i_286_ &= 0x7;
										if ((Class59_Sub4_Sub1.aBoolArrayArray6312[i_284_][i_287_]) && ((((PacketsDecoder) class_is_283_).anInt274) >= (Class82.anIntArray1076[i_286_]))) {
											Class38_Sub1_Sub1.anIntArray6769[i_286_] = (((PacketsDecoder) class_is_283_).anInt284);
											Class61.anIntArray845[i_286_] = i_288_;
											Class59_Sub4_Sub1.anIntArray6313[i_286_] = (!class260.method1684() ? ((PacketsDecoder) class_is_283_).anInt276 : ((PacketsDecoder) class_is_283_).anInt279);
											Class112.anIntArray1589[i_286_] = (((PacketsDecoder) class_is_283_).anInt275);
											if ((Class82.anIntArray1076[i_286_] ^ 0xffffffff) != ((((PacketsDecoder) class_is_283_).anInt274) ^ 0xffffffff))
												Class160.anIntArray2267[i_286_] = 16;
											else
												Class160.anIntArray2267[i_286_] = (Class236.method1523((Class160.anIntArray2267[i_286_]), 16));
											Class82.anIntArray1076[i_286_] = (((PacketsDecoder) class_is_283_).anInt274);
										}
										i_286_++;
										i_287_--;
									}
									if (!bools_253_[0x3 & i_248_ + 2])
										bools[2] = (Class_a.aBoolArrayArray1182[i_284_][PacketsDecoder.method184(i_285_, 3)]);
								}
							}
						}
					}
					if (i_250_ > 0) {
						int i_290_ = 0xff & is[i_250_ - 1][i_247_];
						if (i_290_ > 0) {
							PacketsDecoder class_is_291_ = aClass105_3667.method703(i_245_ - 22241, -1 + i_290_);
							if (((PacketsDecoder) class_is_291_).anInt284 != -1) {
								byte i_292_ = is_251_[-1 + i_250_][i_247_];
								int i_293_ = is_252_[-1 + i_250_][i_247_];
								if (((PacketsDecoder) class_is_291_).aBool281) {
									int i_294_ = 6;
									int i_295_ = 4 + 2 * i_293_;
									int i_296_ = (Class246_Sub41_Sub2.method2681(class_is_291_, class260, (byte) -31));
									for (int i_297_ = 0; (i_297_ ^ 0xffffffff) > -4; i_297_++) {
										i_294_ = 0x7 & i_294_;
										i_295_ = 0x7 & i_295_;
										if ((Class59_Sub4_Sub1.aBoolArrayArray6312[i_292_][i_295_]) && ((((PacketsDecoder) class_is_291_).anInt274) >= (Class82.anIntArray1076[i_294_]))) {
											Class38_Sub1_Sub1.anIntArray6769[i_294_] = (((PacketsDecoder) class_is_291_).anInt284);
											Class61.anIntArray845[i_294_] = i_296_;
											Class59_Sub4_Sub1.anIntArray6313[i_294_] = (!class260.method1684() ? ((PacketsDecoder) class_is_291_).anInt276 : ((PacketsDecoder) class_is_291_).anInt279);
											Class112.anIntArray1589[i_294_] = (((PacketsDecoder) class_is_291_).anInt275);
											if (((((PacketsDecoder) class_is_291_).anInt274) ^ 0xffffffff) != ((Class82.anIntArray1076[i_294_]) ^ 0xffffffff))
												Class160.anIntArray2267[i_294_] = 8;
											else
												Class160.anIntArray2267[i_294_] = (Class236.method1523((Class160.anIntArray2267[i_294_]), 8));
											Class82.anIntArray1076[i_294_] = (((PacketsDecoder) class_is_291_).anInt274);
										}
										i_295_--;
										i_294_++;
									}
									if (!bools_253_[0x3 & i_248_ + 3])
										bools[3] = (Class_a.aBoolArrayArray1182[i_292_][PacketsDecoder.method184(1 - -i_293_, 3)]);
								} else if (!bools_253_[i_248_ + 3 & 0x3])
									bools[3] = (Class92.aBoolArrayArray1207[i_292_][PacketsDecoder.method184(3, i_293_ + 1)]);
							}
						}
					}
					if (i_250_ < i_249_ - 1) {
						int i_298_ = 0xff & is[i_250_ + 1][i_247_];
						if ((i_298_ ^ 0xffffffff) < -1) {
							PacketsDecoder class_is_299_ = aClass105_3667.method703(4, i_298_ - 1);
							if (((PacketsDecoder) class_is_299_).anInt284 != -1) {
								byte i_300_ = is_251_[i_250_ + 1][i_247_];
								int i_301_ = is_252_[1 + i_250_][i_247_];
								if (((PacketsDecoder) class_is_299_).aBool281) {
									int i_302_ = 4;
									int i_303_ = i_301_ * 2 + 6;
									int i_304_ = (Class246_Sub41_Sub2.method2681(class_is_299_, class260, (byte) -31));
									for (int i_305_ = 0; i_305_ < 3; i_305_++) {
										i_302_ &= 0x7;
										i_303_ = 0x7 & i_303_;
										if ((Class59_Sub4_Sub1.aBoolArrayArray6312[i_300_][i_303_]) && ((Class82.anIntArray1076[i_302_] ^ 0xffffffff) >= ((((PacketsDecoder) class_is_299_).anInt274) ^ 0xffffffff))) {
											Class38_Sub1_Sub1.anIntArray6769[i_302_] = (((PacketsDecoder) class_is_299_).anInt284);
											Class61.anIntArray845[i_302_] = i_304_;
											Class59_Sub4_Sub1.anIntArray6313[i_302_] = (!class260.method1684() ? ((PacketsDecoder) class_is_299_).anInt276 : ((PacketsDecoder) class_is_299_).anInt279);
											Class112.anIntArray1589[i_302_] = (((PacketsDecoder) class_is_299_).anInt275);
											if ((((PacketsDecoder) class_is_299_).anInt274) == (Class82.anIntArray1076[i_302_]))
												Class160.anIntArray2267[i_302_] = (Class236.method1523((Class160.anIntArray2267[i_302_]), 4));
											else
												Class160.anIntArray2267[i_302_] = 4;
											Class82.anIntArray1076[i_302_] = (((PacketsDecoder) class_is_299_).anInt274);
										}
										i_302_--;
										i_303_++;
									}
									if (!bools_253_[i_248_ + 1 & 0x3])
										bools[1] = (Class_a.aBoolArrayArray1182[i_300_][(PacketsDecoder.method184(3, 3 - -i_301_))]);
								} else if (!bools_253_[1 - -i_248_ & 0x3])
									bools[1] = (Class92.aBoolArrayArray1207[i_300_][PacketsDecoder.method184(i_301_ + 3, 3)]);
							}
						}
					}
				}
				if (i_245_ == 22245) {
					if (class_is == null)
						break;
					int i_306_ = Class246_Sub41_Sub2.method2681(class_is, class260, (byte) -31);
					if (!((PacketsDecoder) class_is).aBool281)
						break;
					for (int i_307_ = 0; i_307_ < 8; i_307_++) {
						int i_308_ = i_307_ + -(i_248_ * 2) & 0x7;
						if ((Class59_Sub4_Sub1.aBoolArrayArray6312[i_246_][i_307_]) && ((((PacketsDecoder) class_is).anInt274 ^ 0xffffffff) <= (Class82.anIntArray1076[i_308_] ^ 0xffffffff))) {
							Class38_Sub1_Sub1.anIntArray6769[i_308_] = ((PacketsDecoder) class_is).anInt284;
							Class61.anIntArray845[i_308_] = i_306_;
							Class59_Sub4_Sub1.anIntArray6313[i_308_] = (!class260.method1684() ? ((PacketsDecoder) class_is).anInt276 : ((PacketsDecoder) class_is).anInt279);
							Class112.anIntArray1589[i_308_] = ((PacketsDecoder) class_is).anInt275;
							if (Class82.anIntArray1076[i_308_] != ((PacketsDecoder) class_is).anInt274)
								Class160.anIntArray2267[i_308_] = 2;
							else
								Class160.anIntArray2267[i_308_] = Class236.method1523((Class160.anIntArray2267[i_308_]), 2);
							Class82.anIntArray1076[i_308_] = ((PacketsDecoder) class_is).anInt274;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wj.F(" + i + ',' + i_245_ + ',' + (is != null ? "{...}" : "null") + ',' + i_246_ + ',' + i_247_ + ',' + i_248_ + ',' + (bools != null ? "{...}" : "null") + ',' + i_249_ + ',' + i_250_ + ',' + (class_is != null ? "{...}" : "null") + ',' + (is_251_ != null ? "{...}" : "null") + ',' + (class207 != null ? "{...}" : "null") + ',' + (is_252_ != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1660(byte i) {
		try {
			aClass191_3663 = null;
			aLongArrayArrayArray3648 = null;
			if (i == 119)
				aClass67_3647 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wj.K(" + i + ')');
		}
	}

	Class255(int i, int i_309_, int i_310_, boolean bool, Class105 class105, Class175 class175) {
		anIntArray3650 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };
		try {
			((Class255) this).aBool3658 = bool;
			aClass105_3667 = class105;
			((Class255) this).anInt3661 = i_309_;
			aClass175_3659 = class175;
			((Class255) this).anInt3643 = i_310_;
			((Class255) this).anInt3670 = i;
			aByteArrayArrayArray3646 = (new byte[((Class255) this).anInt3670][((Class255) this).anInt3661][((Class255) this).anInt3643]);
			aByteArrayArrayArray3656 = (new byte[((Class255) this).anInt3670][((Class255) this).anInt3661][((Class255) this).anInt3643]);
			aByteArrayArrayArray3651 = (new byte[((Class255) this).anInt3670][((Class255) this).anInt3661][((Class255) this).anInt3643]);
			((Class255) this).anIntArrayArrayArray3664 = (new int[((Class255) this).anInt3670][1 + ((Class255) this).anInt3661][((Class255) this).anInt3643 + 1]);
			((Class255) this).aByteArrayArrayArray3641 = (new byte[((Class255) this).anInt3670][1 + ((Class255) this).anInt3661][((Class255) this).anInt3643 + 1]);
			aByteArrayArrayArray3655 = (new byte[((Class255) this).anInt3670][((Class255) this).anInt3661][((Class255) this).anInt3643]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wj.<init>(" + i + ',' + i_309_ + ',' + i_310_ + ',' + bool + ',' + (class105 != null ? "{...}" : "null") + ',' + (class175 != null ? "{...}" : "null") + ')'));
		}
	}
}
