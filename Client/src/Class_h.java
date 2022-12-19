/* Class_h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_h {
	private static Class35 aClass35_1470 = new Class35();

	public static void method707() {
		aClass35_1470 = null;
	}

	private static final void method708(Class35 class35) {
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		int i = 0;
		int[] is = null;
		int[] is_17_ = null;
		int[] is_18_ = null;
		((Class35) class35).anInt479 = 1;
		if (Class59_Sub4_Sub3.anIntArray6957 == null)
			Class59_Sub4_Sub3.anIntArray6957 = new int[((Class35) class35).anInt479 * 100000];
		boolean bool_19_ = true;
		while (bool_19_) {
			byte i_20_ = method711(class35);
			if (i_20_ == 23)
				break;
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method711(class35);
			i_20_ = method714(class35);
			((Class35) class35).anInt470 = 0;
			int i_21_ = method711(class35);
			((Class35) class35).anInt470 = ((Class35) class35).anInt470 << 8 | i_21_ & 0xff;
			i_21_ = method711(class35);
			((Class35) class35).anInt470 = ((Class35) class35).anInt470 << 8 | i_21_ & 0xff;
			i_21_ = method711(class35);
			((Class35) class35).anInt470 = ((Class35) class35).anInt470 << 8 | i_21_ & 0xff;
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				i_20_ = method714(class35);
				if (i_20_ == 1)
					((Class35) class35).aBoolArray461[i_22_] = true;
				else
					((Class35) class35).aBoolArray461[i_22_] = false;
			}
			for (int i_23_ = 0; i_23_ < 256; i_23_++)
				((Class35) class35).aBoolArray457[i_23_] = false;
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				if (((Class35) class35).aBoolArray461[i_24_]) {
					for (int i_25_ = 0; i_25_ < 16; i_25_++) {
						i_20_ = method714(class35);
						if (i_20_ == 1)
							((Class35) class35).aBoolArray457[(i_24_ * 16 + i_25_)] = true;
					}
				}
			}
			method713(class35);
			int i_26_ = ((Class35) class35).anInt484 + 2;
			int i_27_ = method715(3, class35);
			int i_28_ = method715(15, class35);
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = 0;
				for (;;) {
					i_20_ = method714(class35);
					if (i_20_ == 0)
						break;
					i_30_++;
				}
				((Class35) class35).aByteArray456[i_29_] = (byte) i_30_;
			}
			byte[] is_31_ = new byte[6];
			for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
				is_31_[i_32_] = i_32_;
			for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
				byte i_34_ = ((Class35) class35).aByteArray456[i_33_];
				byte i_35_ = is_31_[i_34_];
				for (/**/; i_34_ > 0; i_34_--)
					is_31_[i_34_] = is_31_[i_34_ - 1];
				is_31_[0] = i_35_;
				((Class35) class35).aByteArray462[i_33_] = i_35_;
			}
			for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
				int i_37_ = method715(5, class35);
				for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
					for (;;) {
						i_20_ = method714(class35);
						if (i_20_ == 0)
							break;
						i_20_ = method714(class35);
						if (i_20_ == 0)
							i_37_++;
						else
							i_37_--;
					}
					((Class35) class35).aByteArrayArray469[i_36_][i_38_] = (byte) i_37_;
				}
			}
			for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
				int i_40_ = 32;
				byte i_41_ = 0;
				for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
					if (((Class35) class35).aByteArrayArray469[i_39_][i_42_] > i_41_)
						i_41_ = (((Class35) class35).aByteArrayArray469[i_39_][i_42_]);
					if (((Class35) class35).aByteArrayArray469[i_39_][i_42_] < i_40_)
						i_40_ = (((Class35) class35).aByteArrayArray469[i_39_][i_42_]);
				}
				method710(((Class35) class35).anIntArrayArray483[i_39_], ((Class35) class35).anIntArrayArray467[i_39_], ((Class35) class35).anIntArrayArray480[i_39_], ((Class35) class35).aByteArrayArray469[i_39_], i_40_, i_41_, i_26_);
				((Class35) class35).anIntArray473[i_39_] = i_40_;
			}
			int i_43_ = ((Class35) class35).anInt484 + 1;
			int i_44_ = -1;
			int i_45_ = 0;
			for (int i_46_ = 0; i_46_ <= 255; i_46_++)
				((Class35) class35).anIntArray489[i_46_] = 0;
			int i_47_ = 4095;
			for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
				for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
					((Class35) class35).aByteArray460[i_47_] = (byte) (i_48_ * 16 + i_49_);
					i_47_--;
				}
				((Class35) class35).anIntArray488[i_48_] = i_47_ + 1;
			}
			int i_50_ = 0;
			if (i_45_ == 0) {
				i_44_++;
				i_45_ = 50;
				byte i_51_ = ((Class35) class35).aByteArray462[i_44_];
				i = ((Class35) class35).anIntArray473[i_51_];
				is = ((Class35) class35).anIntArrayArray483[i_51_];
				is_18_ = ((Class35) class35).anIntArrayArray480[i_51_];
				is_17_ = ((Class35) class35).anIntArrayArray467[i_51_];
			}
			i_45_--;
			int i_52_ = i;
			int i_53_;
			int i_54_;
			for (i_54_ = method715(i_52_, class35); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
				i_52_++;
				i_53_ = method714(class35);
			}
			int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
			while (i_55_ != i_43_) {
				if (i_55_ == 0 || i_55_ == 1) {
					int i_56_ = -1;
					int i_57_ = 1;
					do {
						if (i_55_ == 0)
							i_56_ += i_57_;
						else if (i_55_ == 1)
							i_56_ += 2 * i_57_;
						i_57_ *= 2;
						if (i_45_ == 0) {
							i_44_++;
							i_45_ = 50;
							byte i_58_ = ((Class35) class35).aByteArray462[i_44_];
							i = ((Class35) class35).anIntArray473[i_58_];
							is = ((Class35) class35).anIntArrayArray483[i_58_];
							is_18_ = (((Class35) class35).anIntArrayArray480[i_58_]);
							is_17_ = (((Class35) class35).anIntArrayArray467[i_58_]);
						}
						i_45_--;
						i_52_ = i;
						for (i_54_ = method715(i_52_, class35); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
							i_52_++;
							i_53_ = method714(class35);
						}
						i_55_ = is_18_[i_54_ - is_17_[i_52_]];
					} while (i_55_ == 0 || i_55_ == 1);
					i_56_++;
					i_21_ = (((Class35) class35).aByteArray486[(((Class35) class35).aByteArray460[((Class35) class35).anIntArray488[0]]) & 0xff]);
					((Class35) class35).anIntArray489[i_21_ & 0xff] += i_56_;
					for (/**/; i_56_ > 0; i_56_--) {
						Class59_Sub4_Sub3.anIntArray6957[i_50_] = i_21_ & 0xff;
						i_50_++;
					}
				} else {
					int i_59_ = i_55_ - 1;
					if (i_59_ < 16) {
						int i_60_ = ((Class35) class35).anIntArray488[0];
						i_20_ = ((Class35) class35).aByteArray460[i_60_ + i_59_];
						for (/**/; i_59_ > 3; i_59_ -= 4) {
							int i_61_ = i_60_ + i_59_;
							((Class35) class35).aByteArray460[i_61_] = ((Class35) class35).aByteArray460[i_61_ - 1];
							((Class35) class35).aByteArray460[i_61_ - 1] = ((Class35) class35).aByteArray460[i_61_ - 2];
							((Class35) class35).aByteArray460[i_61_ - 2] = ((Class35) class35).aByteArray460[i_61_ - 3];
							((Class35) class35).aByteArray460[i_61_ - 3] = ((Class35) class35).aByteArray460[i_61_ - 4];
						}
						for (/**/; i_59_ > 0; i_59_--)
							((Class35) class35).aByteArray460[i_60_ + i_59_] = (((Class35) class35).aByteArray460[i_60_ + i_59_ - 1]);
						((Class35) class35).aByteArray460[i_60_] = i_20_;
					} else {
						int i_62_ = i_59_ / 16;
						int i_63_ = i_59_ % 16;
						int i_64_ = ((Class35) class35).anIntArray488[i_62_] + i_63_;
						i_20_ = ((Class35) class35).aByteArray460[i_64_];
						for (/**/; i_64_ > ((Class35) class35).anIntArray488[i_62_]; i_64_--)
							((Class35) class35).aByteArray460[i_64_] = ((Class35) class35).aByteArray460[i_64_ - 1];
						((Class35) class35).anIntArray488[i_62_]++;
						for (/**/; i_62_ > 0; i_62_--) {
							((Class35) class35).anIntArray488[i_62_]--;
							((Class35) class35).aByteArray460[((Class35) class35).anIntArray488[i_62_]] = (((Class35) class35).aByteArray460[(((Class35) class35).anIntArray488[i_62_ - 1]) + 16 - 1]);
						}
						((Class35) class35).anIntArray488[0]--;
						((Class35) class35).aByteArray460[(((Class35) class35).anIntArray488[0])] = i_20_;
						if (((Class35) class35).anIntArray488[0] == 0) {
							int i_65_ = 4095;
							for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
								for (int i_67_ = 15; i_67_ >= 0; i_67_--) {
									((Class35) class35).aByteArray460[i_65_] = (((Class35) class35).aByteArray460[(((Class35) class35).anIntArray488[i_66_]) + i_67_]);
									i_65_--;
								}
								((Class35) class35).anIntArray488[i_66_] = i_65_ + 1;
							}
						}
					}
					((Class35) class35).anIntArray489[(((Class35) class35).aByteArray486[i_20_ & 0xff] & 0xff)]++;
					Class59_Sub4_Sub3.anIntArray6957[i_50_] = (((Class35) class35).aByteArray486[i_20_ & 0xff] & 0xff);
					i_50_++;
					if (i_45_ == 0) {
						i_44_++;
						i_45_ = 50;
						byte i_68_ = ((Class35) class35).aByteArray462[i_44_];
						i = ((Class35) class35).anIntArray473[i_68_];
						is = ((Class35) class35).anIntArrayArray483[i_68_];
						is_18_ = ((Class35) class35).anIntArrayArray480[i_68_];
						is_17_ = ((Class35) class35).anIntArrayArray467[i_68_];
					}
					i_45_--;
					i_52_ = i;
					for (i_54_ = method715(i_52_, class35); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
						i_52_++;
						i_53_ = method714(class35);
					}
					i_55_ = is_18_[i_54_ - is_17_[i_52_]];
				}
			}
			((Class35) class35).anInt465 = 0;
			((Class35) class35).aByte472 = (byte) 0;
			((Class35) class35).anIntArray477[0] = 0;
			for (int i_69_ = 1; i_69_ <= 256; i_69_++)
				((Class35) class35).anIntArray477[i_69_] = ((Class35) class35).anIntArray489[i_69_ - 1];
			for (int i_70_ = 1; i_70_ <= 256; i_70_++)
				((Class35) class35).anIntArray477[i_70_] += ((Class35) class35).anIntArray477[i_70_ - 1];
			for (int i_71_ = 0; i_71_ < i_50_; i_71_++) {
				i_21_ = (byte) (Class59_Sub4_Sub3.anIntArray6957[i_71_] & 0xff);
				Class59_Sub4_Sub3.anIntArray6957[((Class35) class35).anIntArray477[i_21_ & 0xff]] |= i_71_ << 8;
				((Class35) class35).anIntArray477[i_21_ & 0xff]++;
			}
			((Class35) class35).anInt459 = (Class59_Sub4_Sub3.anIntArray6957[((Class35) class35).anInt470]) >> 8;
			((Class35) class35).anInt464 = 0;
			((Class35) class35).anInt459 = (Class59_Sub4_Sub3.anIntArray6957[((Class35) class35).anInt459]);
			((Class35) class35).anInt455 = (byte) (((Class35) class35).anInt459 & 0xff);
			((Class35) class35).anInt459 >>= 8;
			((Class35) class35).anInt464++;
			((Class35) class35).anInt490 = i_50_;
			method712(class35);
			if ((((Class35) class35).anInt464 == ((Class35) class35).anInt490 + 1) && ((Class35) class35).anInt465 == 0)
				bool_19_ = true;
			else
				bool_19_ = false;
		}
	}

	static final int method709(byte[] is, int i, byte[] is_72_, int i_73_, int i_74_) {
		synchronized (aClass35_1470) {
			((Class35) aClass35_1470).aByteArray487 = is_72_;
			((Class35) aClass35_1470).anInt466 = i_74_;
			((Class35) aClass35_1470).aByteArray478 = is;
			((Class35) aClass35_1470).anInt474 = 0;
			((Class35) aClass35_1470).anInt485 = i;
			((Class35) aClass35_1470).anInt482 = 0;
			((Class35) aClass35_1470).anInt476 = 0;
			((Class35) aClass35_1470).anInt458 = 0;
			((Class35) aClass35_1470).anInt475 = 0;
			method708(aClass35_1470);
			i -= ((Class35) aClass35_1470).anInt485;
			((Class35) aClass35_1470).aByteArray487 = null;
			((Class35) aClass35_1470).aByteArray478 = null;
			return i;
		}
	}

	private static final void method710(int[] is, int[] is_75_, int[] is_76_, byte[] is_77_, int i, int i_78_, int i_79_) {
		int i_80_ = 0;
		for (int i_81_ = i; i_81_ <= i_78_; i_81_++) {
			for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
				if (is_77_[i_82_] == i_81_) {
					is_76_[i_80_] = i_82_;
					i_80_++;
				}
			}
		}
		for (int i_83_ = 0; i_83_ < 23; i_83_++)
			is_75_[i_83_] = 0;
		for (int i_84_ = 0; i_84_ < i_79_; i_84_++)
			is_75_[is_77_[i_84_] + 1]++;
		for (int i_85_ = 1; i_85_ < 23; i_85_++)
			is_75_[i_85_] += is_75_[i_85_ - 1];
		for (int i_86_ = 0; i_86_ < 23; i_86_++)
			is[i_86_] = 0;
		int i_87_ = 0;
		for (int i_88_ = i; i_88_ <= i_78_; i_88_++) {
			i_87_ += is_75_[i_88_ + 1] - is_75_[i_88_];
			is[i_88_] = i_87_ - 1;
			i_87_ <<= 1;
		}
		for (int i_89_ = i + 1; i_89_ <= i_78_; i_89_++)
			is_75_[i_89_] = (is[i_89_ - 1] + 1 << 1) - is_75_[i_89_];
	}

	private static final byte method711(Class35 class35) {
		return (byte) method715(8, class35);
	}

	private static final void method712(Class35 class35) {
		byte i = ((Class35) class35).aByte472;
		int i_90_ = ((Class35) class35).anInt465;
		int i_91_ = ((Class35) class35).anInt464;
		int i_92_ = ((Class35) class35).anInt455;
		int[] is = Class59_Sub4_Sub3.anIntArray6957;
		int i_93_ = ((Class35) class35).anInt459;
		byte[] is_94_ = ((Class35) class35).aByteArray478;
		int i_95_ = ((Class35) class35).anInt474;
		int i_96_ = ((Class35) class35).anInt485;
		int i_97_ = i_96_;
		int i_98_ = ((Class35) class35).anInt490 + 1;
		while_39_: for (;;) {
			if (i_90_ > 0) {
				for (;;) {
					if (i_96_ == 0)
						break while_39_;
					if (i_90_ == 1)
						break;
					is_94_[i_95_] = i;
					i_90_--;
					i_95_++;
					i_96_--;
				}
				if (i_96_ == 0) {
					i_90_ = 1;
					break;
				}
				is_94_[i_95_] = i;
				i_95_++;
				i_96_--;
			}
			for (;;) {
				if (i_91_ == i_98_) {
					i_90_ = 0;
					break while_39_;
				}
				i = (byte) i_92_;
				i_93_ = is[i_93_];
				int i_99_ = (byte) i_93_;
				i_93_ >>= 8;
				i_91_++;
				if (i_99_ != i_92_) {
					i_92_ = i_99_;
					if (i_96_ == 0) {
						i_90_ = 1;
						break while_39_;
					}
					is_94_[i_95_] = i;
					i_95_++;
					i_96_--;
				} else {
					if (i_91_ != i_98_)
						break;
					if (i_96_ == 0) {
						i_90_ = 1;
						break while_39_;
					}
					is_94_[i_95_] = i;
					i_95_++;
					i_96_--;
				}
			}
			i_90_ = 2;
			i_93_ = is[i_93_];
			int i_100_ = (byte) i_93_;
			i_93_ >>= 8;
			if (++i_91_ != i_98_) {
				if (i_100_ != i_92_)
					i_92_ = i_100_;
				else {
					i_90_ = 3;
					i_93_ = is[i_93_];
					i_100_ = (byte) i_93_;
					i_93_ >>= 8;
					if (++i_91_ != i_98_) {
						if (i_100_ != i_92_)
							i_92_ = i_100_;
						else {
							i_93_ = is[i_93_];
							i_100_ = (byte) i_93_;
							i_93_ >>= 8;
							i_91_++;
							i_90_ = (i_100_ & 0xff) + 4;
							i_93_ = is[i_93_];
							i_92_ = (byte) i_93_;
							i_93_ >>= 8;
							i_91_++;
						}
					}
				}
			}
		}
		int i_101_ = ((Class35) class35).anInt475;
		((Class35) class35).anInt475 += i_97_ - i_96_;
		((Class35) class35).aByte472 = i;
		((Class35) class35).anInt465 = i_90_;
		((Class35) class35).anInt464 = i_91_;
		((Class35) class35).anInt455 = i_92_;
		Class59_Sub4_Sub3.anIntArray6957 = is;
		((Class35) class35).anInt459 = i_93_;
		((Class35) class35).aByteArray478 = is_94_;
		((Class35) class35).anInt474 = i_95_;
		((Class35) class35).anInt485 = i_96_;
	}

	private static final void method713(Class35 class35) {
		((Class35) class35).anInt484 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class35) class35).aBoolArray457[i]) {
				((Class35) class35).aByteArray486[((Class35) class35).anInt484] = (byte) i;
				((Class35) class35).anInt484++;
			}
		}
	}

	private static final byte method714(Class35 class35) {
		return (byte) method715(1, class35);
	}

	private static final int method715(int i, Class35 class35) {
		for (;;) {
			if (((Class35) class35).anInt482 >= i) {
				int i_102_ = ((((Class35) class35).anInt476 >> ((Class35) class35).anInt482 - i) & (1 << i) - 1);
				((Class35) class35).anInt482 -= i;
				return i_102_;
			}
			((Class35) class35).anInt476 = (((Class35) class35).anInt476 << 8 | (((Class35) class35).aByteArray487[((Class35) class35).anInt466]) & 0xff);
			((Class35) class35).anInt482 += 8;
			((Class35) class35).anInt466++;
			((Class35) class35).anInt458++;
		}
	}
}
