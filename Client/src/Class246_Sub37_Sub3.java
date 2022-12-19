/* Class246_Sub37_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub37_Sub3 extends Class246_Sub37 {
	private int anInt6771;
	private int anInt6772;
	private int anInt6773;
	private int anInt6774;
	private int anInt6775;
	private boolean aBool6776;
	private int anInt6777;
	private int anInt6778;
	private int anInt6779;
	private int anInt6780;
	private int anInt6781;
	private int anInt6782;
	private int anInt6783;
	private int anInt6784;
	private int anInt6785;

	private final int method2772(int[] is, int i, int i_0_, int i_1_, int i_2_) {
		while (anInt6779 > 0) {
			int i_3_ = i + anInt6779;
			if (i_3_ > i_1_)
				i_3_ = i_1_;
			anInt6779 += i;
			if (anInt6783 == -256 && (anInt6773 & 0xff) == 0) {
				if (Class240.aBool3387)
					i = method2811(0, ((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6784, anInt6785, anInt6777, anInt6771, 0, i_3_, i_0_, this);
				else
					i = method2776(((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6774, anInt6782, 0, i_3_, i_0_, this);
			} else if (Class240.aBool3387)
				i = method2790(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6784, anInt6785, anInt6777, anInt6771, 0, i_3_, i_0_, this, anInt6783, i_2_);
			else
				i = method2780(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, anInt6782, 0, i_3_, i_0_, this, anInt6783, i_2_);
			anInt6779 -= i;
			if (anInt6779 != 0)
				return i;
			if (method2779())
				return i_1_;
		}
		if (anInt6783 == -256 && (anInt6773 & 0xff) == 0) {
			if (Class240.aBool3387)
				return method2773(0, ((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6784, anInt6785, 0, i_1_, i_0_, this);
			return method2777((((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, 0, i_1_, i_0_, this);
		}
		if (Class240.aBool3387)
			return method2788(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6784, anInt6785, 0, i_1_, i_0_, this, anInt6783, i_2_);
		return method2785(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, 0, i_1_, i_0_, this, anInt6783, i_2_);
	}

	final synchronized void method2260(int i) {
		if (anInt6779 > 0) {
			if (i >= anInt6779) {
				if (anInt6781 == -2147483648) {
					anInt6781 = 0;
					anInt6774 = anInt6784 = anInt6785 = 0;
					this.unlink((byte) -54);
					i = anInt6779;
				}
				anInt6779 = 0;
				method2792();
			} else {
				anInt6774 += anInt6782 * i;
				anInt6784 += anInt6777 * i;
				anInt6785 += anInt6771 * i;
				anInt6779 -= i;
			}
		}
		Class246_Sub3_Sub1 class246_sub3_sub1 = (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324;
		int i_4_ = anInt6772 << 8;
		int i_5_ = anInt6780 << 8;
		int i_6_ = (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391.length << 8);
		int i_7_ = i_5_ - i_4_;
		if (i_7_ <= 0)
			anInt6775 = 0;
		if (anInt6773 < 0) {
			if (anInt6783 > 0)
				anInt6773 = 0;
			else {
				method2786();
				this.unlink((byte) -126);
				return;
			}
		}
		if (anInt6773 >= i_6_) {
			if (anInt6783 < 0)
				anInt6773 = i_6_ - 1;
			else {
				method2786();
				this.unlink((byte) -42);
				return;
			}
		}
		anInt6773 += anInt6783 * i;
		if (anInt6775 < 0) {
			if (aBool6776) {
				if (anInt6783 < 0) {
					if (anInt6773 >= i_4_)
						return;
					anInt6773 = i_4_ + i_4_ - 1 - anInt6773;
					anInt6783 = -anInt6783;
				}
				while (anInt6773 >= i_5_) {
					anInt6773 = i_5_ + i_5_ - 1 - anInt6773;
					anInt6783 = -anInt6783;
					if (anInt6773 >= i_4_)
						break;
					anInt6773 = i_4_ + i_4_ - 1 - anInt6773;
					anInt6783 = -anInt6783;
				}
			} else if (anInt6783 < 0) {
				if (anInt6773 < i_4_)
					anInt6773 = i_5_ - 1 - (i_5_ - 1 - anInt6773) % i_7_;
			} else if (anInt6773 >= i_5_)
				anInt6773 = i_4_ + (anInt6773 - i_4_) % i_7_;
		} else {
			do {
				if (anInt6775 > 0) {
					if (aBool6776) {
						if (anInt6783 < 0) {
							if (anInt6773 >= i_4_)
								return;
							anInt6773 = i_4_ + i_4_ - 1 - anInt6773;
							anInt6783 = -anInt6783;
							if (--anInt6775 == 0)
								break;
						}
						do {
							if (anInt6773 < i_5_)
								return;
							anInt6773 = i_5_ + i_5_ - 1 - anInt6773;
							anInt6783 = -anInt6783;
							if (--anInt6775 == 0)
								break;
							if (anInt6773 >= i_4_)
								return;
							anInt6773 = i_4_ + i_4_ - 1 - anInt6773;
							anInt6783 = -anInt6783;
						} while (--anInt6775 != 0);
					} else if (anInt6783 < 0) {
						if (anInt6773 >= i_4_)
							return;
						int i_8_ = (i_5_ - 1 - anInt6773) / i_7_;
						if (i_8_ >= anInt6775) {
							anInt6773 += i_7_ * anInt6775;
							anInt6775 = 0;
						} else {
							anInt6773 += i_7_ * i_8_;
							anInt6775 -= i_8_;
							return;
						}
					} else {
						if (anInt6773 < i_5_)
							return;
						int i_9_ = (anInt6773 - i_4_) / i_7_;
						if (i_9_ >= anInt6775) {
							anInt6773 -= i_7_ * anInt6775;
							anInt6775 = 0;
						} else {
							anInt6773 -= i_7_ * i_9_;
							anInt6775 -= i_9_;
							return;
						}
					}
				}
			} while (false);
			if (anInt6783 < 0) {
				if (anInt6773 < 0) {
					anInt6773 = -1;
					method2786();
					this.unlink((byte) -120);
				}
			} else if (anInt6773 >= i_6_) {
				anInt6773 = i_6_;
				method2786();
				this.unlink((byte) 78);
			}
		}
	}

	private static final int method2773(int i, byte[] is, int[] is_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i_11_ >>= 8;
		i_17_ >>= 8;
		i_13_ <<= 2;
		i_14_ <<= 2;
		if ((i_15_ = i_12_ + i_11_ - (i_17_ - 1)) > i_16_)
			i_15_ = i_16_;
		i_12_ <<= 1;
		i_15_ <<= 1;
		i_15_ -= 6;
		while (i_12_ < i_15_) {
			i = is[i_11_--];
			is_10_[i_12_++] += i * i_13_;
			is_10_[i_12_++] += i * i_14_;
			i = is[i_11_--];
			is_10_[i_12_++] += i * i_13_;
			is_10_[i_12_++] += i * i_14_;
			i = is[i_11_--];
			is_10_[i_12_++] += i * i_13_;
			is_10_[i_12_++] += i * i_14_;
			i = is[i_11_--];
			is_10_[i_12_++] += i * i_13_;
			is_10_[i_12_++] += i * i_14_;
		}
		i_15_ += 6;
		while (i_12_ < i_15_) {
			i = is[i_11_--];
			is_10_[i_12_++] += i * i_13_;
			is_10_[i_12_++] += i * i_14_;
		}
		class246_sub37_sub3.anInt6773 = i_11_ << 8;
		return i_12_ >> 1;
	}

	final synchronized void method2774(boolean bool) {
		anInt6783 = (anInt6783 ^ anInt6783 >> 31) + (anInt6783 >>> 31);
		if (bool)
			anInt6783 = -anInt6783;
	}

	private static final int method2775(int i, int i_18_, byte[] is, int[] is_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_27_, int i_28_) {
		if (i_27_ == 0 || (i_24_ = i_21_ + (i_26_ - i_20_ + i_27_ - 257) / i_27_) > i_25_)
			i_24_ = i_25_;
		i_21_ <<= 1;
		i_24_ <<= 1;
		while (i_21_ < i_24_) {
			i_18_ = i_20_ >> 8;
			i = is[i_18_];
			i = (i << 8) + (is[i_18_ + 1] - i) * (i_20_ & 0xff);
			is_19_[i_21_++] += i * i_22_ >> 6;
			is_19_[i_21_++] += i * i_23_ >> 6;
			i_20_ += i_27_;
		}
		if (i_27_ == 0 || ((i_24_ = (i_21_ >> 1) + (i_26_ - i_20_ + i_27_ - 1) / i_27_) > i_25_))
			i_24_ = i_25_;
		i_24_ <<= 1;
		i_18_ = i_28_;
		while (i_21_ < i_24_) {
			i = is[i_20_ >> 8];
			i = (i << 8) + (i_18_ - i) * (i_20_ & 0xff);
			is_19_[i_21_++] += i * i_22_ >> 6;
			is_19_[i_21_++] += i * i_23_ >> 6;
			i_20_ += i_27_;
		}
		class246_sub37_sub3.anInt6773 = i_20_;
		return i_21_ >> 1;
	}

	private static final int method2776(byte[] is, int[] is_29_, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i >>= 8;
		i_35_ >>= 8;
		i_31_ <<= 2;
		i_32_ <<= 2;
		if ((i_33_ = i_30_ + i - (i_35_ - 1)) > i_34_)
			i_33_ = i_34_;
		class246_sub37_sub3.anInt6784 += class246_sub37_sub3.anInt6777 * (i_33_ - i_30_);
		class246_sub37_sub3.anInt6785 += class246_sub37_sub3.anInt6771 * (i_33_ - i_30_);
		i_33_ -= 3;
		while (i_30_ < i_33_) {
			is_29_[i_30_++] += is[i--] * i_31_;
			i_31_ += i_32_;
			is_29_[i_30_++] += is[i--] * i_31_;
			i_31_ += i_32_;
			is_29_[i_30_++] += is[i--] * i_31_;
			i_31_ += i_32_;
			is_29_[i_30_++] += is[i--] * i_31_;
			i_31_ += i_32_;
		}
		i_33_ += 3;
		while (i_30_ < i_33_) {
			is_29_[i_30_++] += is[i--] * i_31_;
			i_31_ += i_32_;
		}
		class246_sub37_sub3.anInt6774 = i_31_ >> 2;
		class246_sub37_sub3.anInt6773 = i << 8;
		return i_30_;
	}

	private static final int method2777(byte[] is, int[] is_36_, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i >>= 8;
		i_41_ >>= 8;
		i_38_ <<= 2;
		if ((i_39_ = i_37_ + i - (i_41_ - 1)) > i_40_)
			i_39_ = i_40_;
		i_39_ -= 3;
		while (i_37_ < i_39_) {
			is_36_[i_37_++] += is[i--] * i_38_;
			is_36_[i_37_++] += is[i--] * i_38_;
			is_36_[i_37_++] += is[i--] * i_38_;
			is_36_[i_37_++] += is[i--] * i_38_;
		}
		i_39_ += 3;
		while (i_37_ < i_39_)
			is_36_[i_37_++] += is[i--] * i_38_;
		class246_sub37_sub3.anInt6773 = i << 8;
		return i_37_;
	}

	private static final int method2778(int i, int i_42_) {
		if (i_42_ < 0)
			return i;
		return (int) (((double) i * Math.sqrt((double) (16384 - i_42_) * 1.220703125E-4)) + 0.5);
	}

	final int method2258() {
		if (anInt6781 == 0 && anInt6779 == 0)
			return 0;
		return 1;
	}

	private final boolean method2779() {
		int i = anInt6781;
		int i_43_;
		int i_44_;
		if (i == -2147483648)
			i = i_43_ = i_44_ = 0;
		else {
			i_43_ = method2778(i, anInt6778);
			i_44_ = method2805(i, anInt6778);
		}
		if (anInt6774 != i || anInt6784 != i_43_ || anInt6785 != i_44_) {
			if (anInt6774 < i) {
				anInt6782 = 1;
				anInt6779 = i - anInt6774;
			} else if (anInt6774 > i) {
				anInt6782 = -1;
				anInt6779 = anInt6774 - i;
			} else
				anInt6782 = 0;
			if (anInt6784 < i_43_) {
				anInt6777 = 1;
				if (anInt6779 == 0 || anInt6779 > i_43_ - anInt6784)
					anInt6779 = i_43_ - anInt6784;
			} else if (anInt6784 > i_43_) {
				anInt6777 = -1;
				if (anInt6779 == 0 || anInt6779 > anInt6784 - i_43_)
					anInt6779 = anInt6784 - i_43_;
			} else
				anInt6777 = 0;
			if (anInt6785 < i_44_) {
				anInt6771 = 1;
				if (anInt6779 == 0 || anInt6779 > i_44_ - anInt6785)
					anInt6779 = i_44_ - anInt6785;
			} else if (anInt6785 > i_44_) {
				anInt6771 = -1;
				if (anInt6779 == 0 || anInt6779 > anInt6785 - i_44_)
					anInt6779 = anInt6785 - i_44_;
			} else
				anInt6771 = 0;
			return false;
		}
		if (anInt6781 == -2147483648) {
			anInt6781 = 0;
			anInt6774 = anInt6784 = anInt6785 = 0;
			this.unlink((byte) -79);
			return true;
		}
		method2792();
		return false;
	}

	private static final int method2780(int i, int i_45_, byte[] is, int[] is_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_54_, int i_55_) {
		class246_sub37_sub3.anInt6784 -= class246_sub37_sub3.anInt6777 * i_48_;
		class246_sub37_sub3.anInt6785 -= class246_sub37_sub3.anInt6771 * i_48_;
		if (i_54_ == 0 || (i_51_ = i_48_ + (i_53_ + 256 - i_47_ + i_54_) / i_54_) > i_52_)
			i_51_ = i_52_;
		while (i_48_ < i_51_) {
			i_45_ = i_47_ >> 8;
			i = is[i_45_ - 1];
			is_46_[i_48_++] += ((i << 8) + (is[i_45_] - i) * (i_47_ & 0xff)) * i_49_ >> 6;
			i_49_ += i_50_;
			i_47_ += i_54_;
		}
		if (i_54_ == 0 || (i_51_ = i_48_ + (i_53_ - i_47_ + i_54_) / i_54_) > i_52_)
			i_51_ = i_52_;
		i = i_55_;
		i_45_ = i_54_;
		while (i_48_ < i_51_) {
			is_46_[i_48_++] += (((i << 8) + (is[i_47_ >> 8] - i) * (i_47_ & 0xff)) * i_49_ >> 6);
			i_49_ += i_50_;
			i_47_ += i_45_;
		}
		class246_sub37_sub3.anInt6784 += class246_sub37_sub3.anInt6777 * i_48_;
		class246_sub37_sub3.anInt6785 += class246_sub37_sub3.anInt6771 * i_48_;
		class246_sub37_sub3.anInt6774 = i_49_;
		class246_sub37_sub3.anInt6773 = i_47_;
		return i_48_;
	}

	final synchronized void method2781(int i) {
		anInt6775 = i;
	}

	final synchronized void method2254(int[] is, int i, int i_56_) {
		if (anInt6781 == 0 && anInt6779 == 0)
			method2260(i_56_);
		else {
			Class246_Sub3_Sub1 class246_sub3_sub1 = ((Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324);
			int i_57_ = anInt6772 << 8;
			int i_58_ = anInt6780 << 8;
			int i_59_ = ((((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391).length << 8);
			int i_60_ = i_58_ - i_57_;
			if (i_60_ <= 0)
				anInt6775 = 0;
			int i_61_ = i;
			i_56_ += i;
			if (anInt6773 < 0) {
				if (anInt6783 > 0)
					anInt6773 = 0;
				else {
					method2786();
					this.unlink((byte) -99);
					return;
				}
			}
			if (anInt6773 >= i_59_) {
				if (anInt6783 < 0)
					anInt6773 = i_59_ - 1;
				else {
					method2786();
					this.unlink((byte) 103);
					return;
				}
			}
			if (anInt6775 < 0) {
				if (aBool6776) {
					if (anInt6783 < 0) {
						i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
						if (anInt6773 >= i_57_)
							return;
						anInt6773 = i_57_ + i_57_ - 1 - anInt6773;
						anInt6783 = -anInt6783;
					}
					for (;;) {
						i_61_ = method2799(is, i_61_, i_58_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6780 - 1]));
						if (anInt6773 < i_58_)
							break;
						anInt6773 = i_58_ + i_58_ - 1 - anInt6773;
						anInt6783 = -anInt6783;
						i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
						if (anInt6773 >= i_57_)
							break;
						anInt6773 = i_57_ + i_57_ - 1 - anInt6773;
						anInt6783 = -anInt6783;
					}
				} else if (anInt6783 < 0) {
					for (;;) {
						i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6780 - 1]));
						if (anInt6773 >= i_57_)
							break;
						anInt6773 = i_58_ - 1 - (i_58_ - 1 - anInt6773) % i_60_;
					}
				} else {
					for (;;) {
						i_61_ = method2799(is, i_61_, i_58_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
						if (anInt6773 < i_58_)
							break;
						anInt6773 = i_57_ + (anInt6773 - i_57_) % i_60_;
					}
				}
			} else {
				do {
					if (anInt6775 > 0) {
						if (aBool6776) {
							if (anInt6783 < 0) {
								i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
								if (anInt6773 >= i_57_)
									return;
								anInt6773 = i_57_ + i_57_ - 1 - anInt6773;
								anInt6783 = -anInt6783;
								if (--anInt6775 == 0)
									break;
							}
							do {
								i_61_ = method2799(is, i_61_, i_58_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6780 - 1]));
								if (anInt6773 < i_58_)
									return;
								anInt6773 = i_58_ + i_58_ - 1 - anInt6773;
								anInt6783 = -anInt6783;
								if (--anInt6775 == 0)
									break;
								i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
								if (anInt6773 >= i_57_)
									return;
								anInt6773 = i_57_ + i_57_ - 1 - anInt6773;
								anInt6783 = -anInt6783;
							} while (--anInt6775 != 0);
						} else if (anInt6783 < 0) {
							for (;;) {
								i_61_ = method2772(is, i_61_, i_57_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6780 - 1]));
								if (anInt6773 >= i_57_)
									return;
								int i_62_ = (i_58_ - 1 - anInt6773) / i_60_;
								if (i_62_ >= anInt6775) {
									anInt6773 += i_60_ * anInt6775;
									anInt6775 = 0;
									break;
								}
								anInt6773 += i_60_ * i_62_;
								anInt6775 -= i_62_;
							}
						} else {
							for (;;) {
								i_61_ = method2799(is, i_61_, i_58_, i_56_, (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391[anInt6772]));
								if (anInt6773 < i_58_)
									return;
								int i_63_ = (anInt6773 - i_57_) / i_60_;
								if (i_63_ >= anInt6775) {
									anInt6773 -= i_60_ * anInt6775;
									anInt6775 = 0;
									break;
								}
								anInt6773 -= i_60_ * i_63_;
								anInt6775 -= i_63_;
							}
						}
					}
				} while (false);
				if (anInt6783 < 0) {
					method2772(is, i_61_, 0, i_56_, 0);
					if (anInt6773 < 0) {
						anInt6773 = -1;
						method2786();
						this.unlink((byte) -120);
					}
				} else {
					method2799(is, i_61_, i_59_, i_56_, 0);
					if (anInt6773 >= i_59_) {
						anInt6773 = i_59_;
						method2786();
						this.unlink((byte) -53);
					}
				}
			}
		}
	}

	final boolean method2782() {
		if (anInt6773 >= 0 && anInt6773 < (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391).length << 8)
			return false;
		return true;
	}

	private static final int method2783(int i, byte[] is, int[] is_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i_65_ >>= 8;
		i_71_ >>= 8;
		i_67_ <<= 2;
		i_68_ <<= 2;
		if ((i_69_ = i_66_ + i_71_ - i_65_) > i_70_)
			i_69_ = i_70_;
		i_66_ <<= 1;
		i_69_ <<= 1;
		i_69_ -= 6;
		while (i_66_ < i_69_) {
			i = is[i_65_++];
			is_64_[i_66_++] += i * i_67_;
			is_64_[i_66_++] += i * i_68_;
			i = is[i_65_++];
			is_64_[i_66_++] += i * i_67_;
			is_64_[i_66_++] += i * i_68_;
			i = is[i_65_++];
			is_64_[i_66_++] += i * i_67_;
			is_64_[i_66_++] += i * i_68_;
			i = is[i_65_++];
			is_64_[i_66_++] += i * i_67_;
			is_64_[i_66_++] += i * i_68_;
		}
		i_69_ += 6;
		while (i_66_ < i_69_) {
			i = is[i_65_++];
			is_64_[i_66_++] += i * i_67_;
			is_64_[i_66_++] += i * i_68_;
		}
		class246_sub37_sub3.anInt6773 = i_65_ << 8;
		return i_66_ >> 1;
	}

	private static final int method2784(int i, byte[] is, int[] is_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i_73_ >>= 8;
		i_81_ >>= 8;
		i_75_ <<= 2;
		i_76_ <<= 2;
		i_77_ <<= 2;
		i_78_ <<= 2;
		if ((i_79_ = i_74_ + i_81_ - i_73_) > i_80_)
			i_79_ = i_80_;
		class246_sub37_sub3.anInt6774 += class246_sub37_sub3.anInt6782 * (i_79_ - i_74_);
		i_74_ <<= 1;
		i_79_ <<= 1;
		i_79_ -= 6;
		while (i_74_ < i_79_) {
			i = is[i_73_++];
			is_72_[i_74_++] += i * i_75_;
			i_75_ += i_77_;
			is_72_[i_74_++] += i * i_76_;
			i_76_ += i_78_;
			i = is[i_73_++];
			is_72_[i_74_++] += i * i_75_;
			i_75_ += i_77_;
			is_72_[i_74_++] += i * i_76_;
			i_76_ += i_78_;
			i = is[i_73_++];
			is_72_[i_74_++] += i * i_75_;
			i_75_ += i_77_;
			is_72_[i_74_++] += i * i_76_;
			i_76_ += i_78_;
			i = is[i_73_++];
			is_72_[i_74_++] += i * i_75_;
			i_75_ += i_77_;
			is_72_[i_74_++] += i * i_76_;
			i_76_ += i_78_;
		}
		i_79_ += 6;
		while (i_74_ < i_79_) {
			i = is[i_73_++];
			is_72_[i_74_++] += i * i_75_;
			i_75_ += i_77_;
			is_72_[i_74_++] += i * i_76_;
			i_76_ += i_78_;
		}
		class246_sub37_sub3.anInt6784 = i_75_ >> 2;
		class246_sub37_sub3.anInt6785 = i_76_ >> 2;
		class246_sub37_sub3.anInt6773 = i_73_ << 8;
		return i_74_ >> 1;
	}

	final Class246_Sub37 method2259() {
		return null;
	}

	private static final int method2785(int i, int i_82_, byte[] is, int[] is_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_90_, int i_91_) {
		if (i_90_ == 0 || (i_87_ = i_85_ + (i_89_ + 256 - i_84_ + i_90_) / i_90_) > i_88_)
			i_87_ = i_88_;
		while (i_85_ < i_87_) {
			i_82_ = i_84_ >> 8;
			i = is[i_82_ - 1];
			is_83_[i_85_++] += ((i << 8) + (is[i_82_] - i) * (i_84_ & 0xff)) * i_86_ >> 6;
			i_84_ += i_90_;
		}
		if (i_90_ == 0 || (i_87_ = i_85_ + (i_89_ - i_84_ + i_90_) / i_90_) > i_88_)
			i_87_ = i_88_;
		i = i_91_;
		i_82_ = i_90_;
		while (i_85_ < i_87_) {
			is_83_[i_85_++] += (((i << 8) + (is[i_84_ >> 8] - i) * (i_84_ & 0xff)) * i_86_ >> 6);
			i_84_ += i_82_;
		}
		class246_sub37_sub3.anInt6773 = i_84_;
		return i_85_;
	}

	final int method2255() {
		int i = anInt6774 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt6775 == 0)
			i -= (i * anInt6773 / ((((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391).length << 8));
		else if (anInt6775 >= 0)
			i -= i * anInt6772 / (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391).length;
		if (i > 255)
			return 255;
		return i;
	}

	private final void method2786() {
		if (anInt6779 != 0) {
			if (anInt6781 == -2147483648)
				anInt6781 = 0;
			anInt6779 = 0;
			method2792();
		}
	}

	final synchronized void method2787(int i) {
		if (anInt6783 < 0)
			anInt6783 = -i;
		else
			anInt6783 = i;
	}

	private static final int method2788(int i, int i_92_, byte[] is, int[] is_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_101_, int i_102_) {
		if (i_101_ == 0 || ((i_98_ = i_95_ + (i_100_ + 256 - i_94_ + i_101_) / i_101_) > i_99_))
			i_98_ = i_99_;
		i_95_ <<= 1;
		i_98_ <<= 1;
		while (i_95_ < i_98_) {
			i_92_ = i_94_ >> 8;
			i = is[i_92_ - 1];
			i = (i << 8) + (is[i_92_] - i) * (i_94_ & 0xff);
			is_93_[i_95_++] += i * i_96_ >> 6;
			is_93_[i_95_++] += i * i_97_ >> 6;
			i_94_ += i_101_;
		}
		if (i_101_ == 0 || ((i_98_ = (i_95_ >> 1) + (i_100_ - i_94_ + i_101_) / i_101_) > i_99_))
			i_98_ = i_99_;
		i_98_ <<= 1;
		i_92_ = i_102_;
		while (i_95_ < i_98_) {
			i = (i_92_ << 8) + (is[i_94_ >> 8] - i_92_) * (i_94_ & 0xff);
			is_93_[i_95_++] += i * i_96_ >> 6;
			is_93_[i_95_++] += i * i_97_ >> 6;
			i_94_ += i_101_;
		}
		class246_sub37_sub3.anInt6773 = i_94_;
		return i_95_ >> 1;
	}

	final synchronized int method2789() {
		if (anInt6781 == -2147483648)
			return 0;
		return anInt6781;
	}

	private static final int method2790(int i, int i_103_, byte[] is, int[] is_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_114_, int i_115_) {
		class246_sub37_sub3.anInt6774 -= class246_sub37_sub3.anInt6782 * i_106_;
		if (i_114_ == 0 || ((i_111_ = i_106_ + (i_113_ + 256 - i_105_ + i_114_) / i_114_) > i_112_))
			i_111_ = i_112_;
		i_106_ <<= 1;
		i_111_ <<= 1;
		while (i_106_ < i_111_) {
			i_103_ = i_105_ >> 8;
			i = is[i_103_ - 1];
			i = (i << 8) + (is[i_103_] - i) * (i_105_ & 0xff);
			is_104_[i_106_++] += i * i_107_ >> 6;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_ >> 6;
			i_108_ += i_110_;
			i_105_ += i_114_;
		}
		if (i_114_ == 0 || ((i_111_ = (i_106_ >> 1) + (i_113_ - i_105_ + i_114_) / i_114_) > i_112_))
			i_111_ = i_112_;
		i_111_ <<= 1;
		i_103_ = i_115_;
		while (i_106_ < i_111_) {
			i = (i_103_ << 8) + (is[i_105_ >> 8] - i_103_) * (i_105_ & 0xff);
			is_104_[i_106_++] += i * i_107_ >> 6;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_ >> 6;
			i_108_ += i_110_;
			i_105_ += i_114_;
		}
		i_106_ >>= 1;
		class246_sub37_sub3.anInt6774 += class246_sub37_sub3.anInt6782 * i_106_;
		class246_sub37_sub3.anInt6784 = i_107_;
		class246_sub37_sub3.anInt6785 = i_108_;
		class246_sub37_sub3.anInt6773 = i_105_;
		return i_106_;
	}

	private static final int method2791(int i, int i_116_, byte[] is, int[] is_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_127_, int i_128_) {
		class246_sub37_sub3.anInt6774 -= class246_sub37_sub3.anInt6782 * i_119_;
		if (i_127_ == 0 || ((i_124_ = i_119_ + (i_126_ - i_118_ + i_127_ - 257) / i_127_) > i_125_))
			i_124_ = i_125_;
		i_119_ <<= 1;
		i_124_ <<= 1;
		while (i_119_ < i_124_) {
			i_116_ = i_118_ >> 8;
			i = is[i_116_];
			i = (i << 8) + (is[i_116_ + 1] - i) * (i_118_ & 0xff);
			is_117_[i_119_++] += i * i_120_ >> 6;
			i_120_ += i_122_;
			is_117_[i_119_++] += i * i_121_ >> 6;
			i_121_ += i_123_;
			i_118_ += i_127_;
		}
		if (i_127_ == 0 || (i_124_ = (i_119_ >> 1) + (i_126_ - i_118_ + i_127_ - 1) / i_127_) > i_125_)
			i_124_ = i_125_;
		i_124_ <<= 1;
		i_116_ = i_128_;
		while (i_119_ < i_124_) {
			i = is[i_118_ >> 8];
			i = (i << 8) + (i_116_ - i) * (i_118_ & 0xff);
			is_117_[i_119_++] += i * i_120_ >> 6;
			i_120_ += i_122_;
			is_117_[i_119_++] += i * i_121_ >> 6;
			i_121_ += i_123_;
			i_118_ += i_127_;
		}
		i_119_ >>= 1;
		class246_sub37_sub3.anInt6774 += class246_sub37_sub3.anInt6782 * i_119_;
		class246_sub37_sub3.anInt6784 = i_120_;
		class246_sub37_sub3.anInt6785 = i_121_;
		class246_sub37_sub3.anInt6773 = i_118_;
		return i_119_;
	}

	private final void method2792() {
		anInt6774 = anInt6781;
		anInt6784 = method2778(anInt6781, anInt6778);
		anInt6785 = method2805(anInt6781, anInt6778);
	}

	final synchronized void method2793(int i) {
		int i_129_ = ((((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391).length << 8);
		if (i < -1)
			i = -1;
		if (i > i_129_)
			i = i_129_;
		anInt6773 = i;
	}

	final synchronized int method2794() {
		if (anInt6778 < 0)
			return -1;
		return anInt6778;
	}

	private final synchronized void method2795(int i, int i_130_) {
		anInt6781 = i;
		anInt6778 = i_130_;
		anInt6779 = 0;
		method2792();
	}

	private static final int method2796(byte[] is, int[] is_131_, int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i >>= 8;
		i_136_ >>= 8;
		i_133_ <<= 2;
		if ((i_134_ = i_132_ + i_136_ - i) > i_135_)
			i_134_ = i_135_;
		i_134_ -= 3;
		while (i_132_ < i_134_) {
			is_131_[i_132_++] += is[i++] * i_133_;
			is_131_[i_132_++] += is[i++] * i_133_;
			is_131_[i_132_++] += is[i++] * i_133_;
			is_131_[i_132_++] += is[i++] * i_133_;
		}
		i_134_ += 3;
		while (i_132_ < i_134_)
			is_131_[i_132_++] += is[i++] * i_133_;
		class246_sub37_sub3.anInt6773 = i << 8;
		return i_132_;
	}

	private static final int method2797(int i, int i_137_, byte[] is, int[] is_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_145_, int i_146_) {
		if (i_145_ == 0 || ((i_142_ = i_140_ + (i_144_ - i_139_ + i_145_ - 257) / i_145_) > i_143_))
			i_142_ = i_143_;
		while (i_140_ < i_142_) {
			i_137_ = i_139_ >> 8;
			i = is[i_137_];
			is_138_[i_140_++] += (((i << 8) + (is[i_137_ + 1] - i) * (i_139_ & 0xff)) * i_141_) >> 6;
			i_139_ += i_145_;
		}
		if (i_145_ == 0 || ((i_142_ = i_140_ + (i_144_ - i_139_ + i_145_ - 1) / i_145_) > i_143_))
			i_142_ = i_143_;
		i_137_ = i_146_;
		while (i_140_ < i_142_) {
			i = is[i_139_ >> 8];
			is_138_[i_140_++] += ((i << 8) + (i_137_ - i) * (i_139_ & 0xff)) * i_141_ >> 6;
			i_139_ += i_145_;
		}
		class246_sub37_sub3.anInt6773 = i_139_;
		return i_140_;
	}

	final synchronized void method2798(int i) {
		method2795(i << 6, method2794());
	}

	private final int method2799(int[] is, int i, int i_147_, int i_148_, int i_149_) {
		while (anInt6779 > 0) {
			int i_150_ = i + anInt6779;
			if (i_150_ > i_148_)
				i_150_ = i_148_;
			anInt6779 += i;
			if (anInt6783 == 256 && (anInt6773 & 0xff) == 0) {
				if (Class240.aBool3387)
					i = method2784(0, ((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6784, anInt6785, anInt6777, anInt6771, 0, i_150_, i_147_, this);
				else
					i = method2803(((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6774, anInt6782, 0, i_150_, i_147_, this);
			} else if (Class240.aBool3387)
				i = method2791(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6784, anInt6785, anInt6777, anInt6771, 0, i_150_, i_147_, this, anInt6783, i_149_);
			else
				i = method2802(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, anInt6782, 0, i_150_, i_147_, this, anInt6783, i_149_);
			anInt6779 -= i;
			if (anInt6779 != 0)
				return i;
			if (method2779())
				return i_148_;
		}
		if (anInt6783 == 256 && (anInt6773 & 0xff) == 0) {
			if (Class240.aBool3387)
				return method2783(0, ((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) (((Class246_Sub37) this).aClass246_Sub3_5324)).aByteArray6391, is, anInt6773, i, anInt6784, anInt6785, 0, i_148_, i_147_, this);
			return method2796((((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, 0, i_148_, i_147_, this);
		}
		if (Class240.aBool3387)
			return method2775(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6784, anInt6785, 0, i_148_, i_147_, this, anInt6783, i_149_);
		return method2797(0, 0, (((Class246_Sub3_Sub1) (Class246_Sub3_Sub1) ((Class246_Sub37) this).aClass246_Sub3_5324).aByteArray6391), is, anInt6773, i, anInt6774, 0, i_148_, i_147_, this, anInt6783, i_149_);
	}

	final synchronized void method2800(int i, int i_151_, int i_152_) {
		if (i == 0)
			method2795(i_151_, i_152_);
		else {
			int i_153_ = method2778(i_151_, i_152_);
			int i_154_ = method2805(i_151_, i_152_);
			if (anInt6784 == i_153_ && anInt6785 == i_154_)
				anInt6779 = 0;
			else {
				int i_155_ = i_151_ - anInt6774;
				if (anInt6774 - i_151_ > i_155_)
					i_155_ = anInt6774 - i_151_;
				if (i_153_ - anInt6784 > i_155_)
					i_155_ = i_153_ - anInt6784;
				if (anInt6784 - i_153_ > i_155_)
					i_155_ = anInt6784 - i_153_;
				if (i_154_ - anInt6785 > i_155_)
					i_155_ = i_154_ - anInt6785;
				if (anInt6785 - i_154_ > i_155_)
					i_155_ = anInt6785 - i_154_;
				if (i > i_155_)
					i = i_155_;
				anInt6779 = i;
				anInt6781 = i_151_;
				anInt6778 = i_152_;
				anInt6782 = (i_151_ - anInt6774) / i;
				anInt6777 = (i_153_ - anInt6784) / i;
				anInt6771 = (i_154_ - anInt6785) / i;
			}
		}
	}

	final synchronized void method2801(int i, int i_156_) {
		method2800(i, i_156_, method2794());
	}

	private static final int method2802(int i, int i_157_, byte[] is, int[] is_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, Class246_Sub37_Sub3 class246_sub37_sub3, int i_166_, int i_167_) {
		class246_sub37_sub3.anInt6784 -= class246_sub37_sub3.anInt6777 * i_160_;
		class246_sub37_sub3.anInt6785 -= class246_sub37_sub3.anInt6771 * i_160_;
		if (i_166_ == 0 || ((i_163_ = i_160_ + (i_165_ - i_159_ + i_166_ - 257) / i_166_) > i_164_))
			i_163_ = i_164_;
		while (i_160_ < i_163_) {
			i_157_ = i_159_ >> 8;
			i = is[i_157_];
			is_158_[i_160_++] += (((i << 8) + (is[i_157_ + 1] - i) * (i_159_ & 0xff)) * i_161_) >> 6;
			i_161_ += i_162_;
			i_159_ += i_166_;
		}
		if (i_166_ == 0 || ((i_163_ = i_160_ + (i_165_ - i_159_ + i_166_ - 1) / i_166_) > i_164_))
			i_163_ = i_164_;
		i_157_ = i_167_;
		while (i_160_ < i_163_) {
			i = is[i_159_ >> 8];
			is_158_[i_160_++] += ((i << 8) + (i_157_ - i) * (i_159_ & 0xff)) * i_161_ >> 6;
			i_161_ += i_162_;
			i_159_ += i_166_;
		}
		class246_sub37_sub3.anInt6784 += class246_sub37_sub3.anInt6777 * i_160_;
		class246_sub37_sub3.anInt6785 += class246_sub37_sub3.anInt6771 * i_160_;
		class246_sub37_sub3.anInt6774 = i_161_;
		class246_sub37_sub3.anInt6773 = i_159_;
		return i_160_;
	}

	private static final int method2803(byte[] is, int[] is_168_, int i, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i >>= 8;
		i_174_ >>= 8;
		i_170_ <<= 2;
		i_171_ <<= 2;
		if ((i_172_ = i_169_ + i_174_ - i) > i_173_)
			i_172_ = i_173_;
		class246_sub37_sub3.anInt6784 += class246_sub37_sub3.anInt6777 * (i_172_ - i_169_);
		class246_sub37_sub3.anInt6785 += class246_sub37_sub3.anInt6771 * (i_172_ - i_169_);
		i_172_ -= 3;
		while (i_169_ < i_172_) {
			is_168_[i_169_++] += is[i++] * i_170_;
			i_170_ += i_171_;
			is_168_[i_169_++] += is[i++] * i_170_;
			i_170_ += i_171_;
			is_168_[i_169_++] += is[i++] * i_170_;
			i_170_ += i_171_;
			is_168_[i_169_++] += is[i++] * i_170_;
			i_170_ += i_171_;
		}
		i_172_ += 3;
		while (i_169_ < i_172_) {
			is_168_[i_169_++] += is[i++] * i_170_;
			i_170_ += i_171_;
		}
		class246_sub37_sub3.anInt6774 = i_170_ >> 2;
		class246_sub37_sub3.anInt6773 = i << 8;
		return i_169_;
	}

	final synchronized int method2804() {
		if (anInt6783 < 0)
			return -anInt6783;
		return anInt6783;
	}

	final Class246_Sub37 method2256() {
		return null;
	}

	private static final int method2805(int i, int i_175_) {
		if (i_175_ < 0)
			return -i;
		return (int) ((double) i * Math.sqrt((double) i_175_ * 1.220703125E-4) + 0.5);
	}

	static final Class246_Sub37_Sub3 method2806(Class246_Sub3_Sub1 class246_sub3_sub1, int i, int i_176_, int i_177_) {
		if (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391 == null || (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391.length == 0))
			return null;
		return new Class246_Sub37_Sub3(class246_sub3_sub1, i, i_176_, i_177_);
	}

	final boolean method2807() {
		if (anInt6779 == 0)
			return false;
		return true;
	}

	private final synchronized void method2808(int i) {
		method2795(i, method2794());
	}

	static final Class246_Sub37_Sub3 method2809(Class246_Sub3_Sub1 class246_sub3_sub1, int i, int i_178_) {
		if (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391 == null || (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391.length == 0))
			return null;
		return new Class246_Sub37_Sub3(class246_sub3_sub1, (int) ((long) (((Class246_Sub3_Sub1) class246_sub3_sub1).anInt6393) * 256L * (long) i / (long) (100 * Class140.anInt2024)), i_178_ << 6);
	}

	final synchronized void method2810(int i) {
		if (i == 0) {
			method2808(0);
			this.unlink((byte) 112);
		} else if (anInt6784 == 0 && anInt6785 == 0) {
			anInt6779 = 0;
			anInt6781 = 0;
			anInt6774 = 0;
			this.unlink((byte) 124);
		} else {
			int i_179_ = -anInt6774;
			if (anInt6774 > i_179_)
				i_179_ = anInt6774;
			if (-anInt6784 > i_179_)
				i_179_ = -anInt6784;
			if (anInt6784 > i_179_)
				i_179_ = anInt6784;
			if (-anInt6785 > i_179_)
				i_179_ = -anInt6785;
			if (anInt6785 > i_179_)
				i_179_ = anInt6785;
			if (i > i_179_)
				i = i_179_;
			anInt6779 = i;
			anInt6781 = -2147483648;
			anInt6782 = -anInt6774 / i;
			anInt6777 = -anInt6784 / i;
			anInt6771 = -anInt6785 / i;
		}
	}

	private Class246_Sub37_Sub3(Class246_Sub3_Sub1 class246_sub3_sub1, int i, int i_180_) {
		((Class246_Sub37) this).aClass246_Sub3_5324 = class246_sub3_sub1;
		anInt6772 = ((Class246_Sub3_Sub1) class246_sub3_sub1).anInt6390;
		anInt6780 = ((Class246_Sub3_Sub1) class246_sub3_sub1).anInt6389;
		aBool6776 = ((Class246_Sub3_Sub1) class246_sub3_sub1).aBool6392;
		anInt6783 = i;
		anInt6781 = i_180_;
		anInt6778 = 8192;
		anInt6773 = 0;
		method2792();
	}

	private static final int method2811(int i, byte[] is, int[] is_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, Class246_Sub37_Sub3 class246_sub37_sub3) {
		i_182_ >>= 8;
		i_190_ >>= 8;
		i_184_ <<= 2;
		i_185_ <<= 2;
		i_186_ <<= 2;
		i_187_ <<= 2;
		if ((i_188_ = i_183_ + i_182_ - (i_190_ - 1)) > i_189_)
			i_188_ = i_189_;
		class246_sub37_sub3.anInt6774 += class246_sub37_sub3.anInt6782 * (i_188_ - i_183_);
		i_183_ <<= 1;
		i_188_ <<= 1;
		i_188_ -= 6;
		while (i_183_ < i_188_) {
			i = is[i_182_--];
			is_181_[i_183_++] += i * i_184_;
			i_184_ += i_186_;
			is_181_[i_183_++] += i * i_185_;
			i_185_ += i_187_;
			i = is[i_182_--];
			is_181_[i_183_++] += i * i_184_;
			i_184_ += i_186_;
			is_181_[i_183_++] += i * i_185_;
			i_185_ += i_187_;
			i = is[i_182_--];
			is_181_[i_183_++] += i * i_184_;
			i_184_ += i_186_;
			is_181_[i_183_++] += i * i_185_;
			i_185_ += i_187_;
			i = is[i_182_--];
			is_181_[i_183_++] += i * i_184_;
			i_184_ += i_186_;
			is_181_[i_183_++] += i * i_185_;
			i_185_ += i_187_;
		}
		i_188_ += 6;
		while (i_183_ < i_188_) {
			i = is[i_182_--];
			is_181_[i_183_++] += i * i_184_;
			i_184_ += i_186_;
			is_181_[i_183_++] += i * i_185_;
			i_185_ += i_187_;
		}
		class246_sub37_sub3.anInt6784 = i_184_ >> 2;
		class246_sub37_sub3.anInt6785 = i_185_ >> 2;
		class246_sub37_sub3.anInt6773 = i_182_ << 8;
		return i_183_ >> 1;
	}

	private Class246_Sub37_Sub3(Class246_Sub3_Sub1 class246_sub3_sub1, int i, int i_191_, int i_192_) {
		((Class246_Sub37) this).aClass246_Sub3_5324 = class246_sub3_sub1;
		anInt6772 = ((Class246_Sub3_Sub1) class246_sub3_sub1).anInt6390;
		anInt6780 = ((Class246_Sub3_Sub1) class246_sub3_sub1).anInt6389;
		aBool6776 = ((Class246_Sub3_Sub1) class246_sub3_sub1).aBool6392;
		anInt6783 = i;
		anInt6781 = i_191_;
		anInt6778 = i_192_;
		anInt6773 = 0;
		method2792();
	}
}
