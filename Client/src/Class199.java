/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class199 {
	static int anInt2827;
	static int anInt2828;
	int[][] anIntArrayArray2829;
	int anInt2830;
	static int anInt2831;
	static int anInt2832;
	static int anInt2833;
	static Class_fs index7;
	static int anInt2835;
	int anInt2836;
	int anInt2837;
	static int anInt2838;
	static int anInt2839;
	static int anInt2840;
	int anInt2841;
	static int anInt2842;
	static int anInt2843;
	static int anInt2844;
	static int anInt2845;
	static int anInt2846 = 0;
	static int anInt2847;
	static int anInt2848;
	static int anInt2849;

	final void method1308(int i, int i_0_, int i_1_) {
		try {
			i_1_ -= ((Class199) this).anInt2836;
			anInt2849++;
			i_0_ -= ((Class199) this).anInt2841;
			if (i != -1)
				method1309(-50, -17, 88);
			((Class199) this).anIntArrayArray2829[i_1_][i_0_] = Class236.method1523((((Class199) this).anIntArrayArray2829[i_1_][i_0_]), 262144);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.K(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1309(int i, int i_2_, int i_3_) {
		try {
			anInt2827++;
			i_2_ -= ((Class199) this).anInt2841;
			int i_4_ = -128 % ((26 - i_3_) / 52);
			i -= ((Class199) this).anInt2836;
			((Class199) this).anIntArrayArray2829[i][i_2_] = PacketsDecoder.method184((((Class199) this).anIntArrayArray2829[i][i_2_]), -2097153);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.L(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method1310(int i, int i_5_, boolean bool, int i_6_, int i_7_, int i_8_, boolean bool_9_, int i_10_) {
		try {
			anInt2838++;
			if (i_6_ != 22914)
				method1322(13, -76, true, 20, 86, -58, -72, -112);
			int i_11_ = 256;
			if (bool)
				i_11_ |= 0x20000;
			if (i_5_ == 1 || (i_5_ ^ 0xffffffff) == -4) {
				int i_12_ = i_7_;
				i_7_ = i_10_;
				i_10_ = i_12_;
			}
			if (bool_9_)
				i_11_ |= 0x40000000;
			i_8_ -= ((Class199) this).anInt2836;
			i -= ((Class199) this).anInt2841;
			for (int i_13_ = i_8_; i_7_ + i_8_ > i_13_; i_13_++) {
				if ((i_13_ ^ 0xffffffff) <= -1 && (i_13_ ^ 0xffffffff) > (((Class199) this).anInt2837 ^ 0xffffffff)) {
					for (int i_14_ = i; (i - -i_10_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
						if (i_14_ >= 0 && ((Class199) this).anInt2830 > i_14_)
							method1312(i_11_, 0, i_13_, i_14_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.D(" + i + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool_9_ + ',' + i_10_ + ')'));
		}
	}

	private final void method1311(int i, int i_15_, int i_16_, boolean bool) {
		try {
			if (bool == false) {
				((Class199) this).anIntArrayArray2829[i_16_][i_15_] = Class236.method1523((((Class199) this).anIntArrayArray2829[i_16_][i_15_]), i);
				anInt2845++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.P(" + i + ',' + i_15_ + ',' + i_16_ + ',' + bool + ')'));
		}
	}

	private final void method1312(int i, int i_17_, int i_18_, int i_19_) {
		try {
			((Class199) this).anIntArrayArray2829[i_18_][i_19_] = PacketsDecoder.method184((((Class199) this).anIntArrayArray2829[i_18_][i_19_]), i ^ 0xffffffff);
			if (i_17_ != 0)
				((Class199) this).anInt2837 = -117;
			anInt2832++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.O(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final boolean method1313(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		try {
			anInt2828++;
			if (i_20_ > 1) {
				if (Class260.method1746(i_20_, i_24_, i_20_, i_23_, i, i_27_, i_25_, i_21_, (byte) 119))
					return true;
				return method1317(i_21_, 0, i_20_, i_23_, i_25_, i_22_, i_24_, i_27_, i, i_20_);
			}
			if (i_26_ < 63)
				method1321(-54, -2, 32, -25, -125, true, true);
			int i_28_ = i + i_21_ - 1;
			int i_29_ = -1 + (i_24_ - -i_23_);
			if (i_21_ <= i_25_ && (i_28_ ^ 0xffffffff) <= (i_25_ ^ 0xffffffff) && i_24_ <= i_27_ && i_27_ <= i_29_)
				return true;
			if ((i_25_ ^ 0xffffffff) == (i_21_ - 1 ^ 0xffffffff) && (i_24_ ^ 0xffffffff) >= (i_27_ ^ 0xffffffff) && (i_27_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[-((Class199) this).anInt2836 + i_25_][-((Class199) this).anInt2841 + i_27_]) & 0x8 ^ 0xffffffff) == -1 && (i_22_ & 0x8 ^ 0xffffffff) == -1)
				return true;
			if ((i_25_ ^ 0xffffffff) == (i_28_ + 1 ^ 0xffffffff) && (i_24_ ^ 0xffffffff) >= (i_27_ ^ 0xffffffff) && i_27_ <= i_29_ && ((((Class199) this).anIntArrayArray2829[-((Class199) this).anInt2836 + i_25_][-((Class199) this).anInt2841 + i_27_]) & 0x80) == 0 && (0x2 & i_22_) == 0)
				return true;
			if (i_24_ - 1 == i_27_ && i_21_ <= i_25_ && i_25_ <= i_28_ && (0x2 & (((Class199) this).anIntArrayArray2829[-((Class199) this).anInt2836 + i_25_][-((Class199) this).anInt2841 + i_27_]) ^ 0xffffffff) == -1 && (i_22_ & 0x4 ^ 0xffffffff) == -1)
				return true;
			if (i_27_ == 1 + i_29_ && i_25_ >= i_21_ && i_28_ >= i_25_ && (0x20 & (((Class199) this).anIntArrayArray2829[i_25_ + -((Class199) this).anInt2836][i_27_ - ((Class199) this).anInt2841]) ^ 0xffffffff) == -1 && (i_22_ & 0x1 ^ 0xffffffff) == -1)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.J(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ')'));
		}
	}

	final void method1314(int i, boolean bool, int i_30_, int i_31_, boolean bool_32_, int i_33_, int i_34_) {
		try {
			anInt2833++;
			int i_35_ = 256;
			if (bool)
				i_35_ |= 0x20000;
			if (bool_32_)
				i_35_ |= 0x40000000;
			i_34_ -= ((Class199) this).anInt2841;
			i_33_ -= ((Class199) this).anInt2836;
			int i_36_ = i_33_;
			if (i_30_ != 16624)
				method1324(11);
			for (/**/; i_33_ - -i > i_36_; i_36_++) {
				if ((i_36_ ^ 0xffffffff) <= -1 && ((Class199) this).anInt2837 > i_36_) {
					for (int i_37_ = i_34_; (i_34_ + i_31_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
						if ((i_37_ ^ 0xffffffff) <= -1 && ((((Class199) this).anInt2830 ^ 0xffffffff) < (i_37_ ^ 0xffffffff)))
							method1311(i_35_, i_37_, i_36_, false);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.M(" + i + ',' + bool + ',' + i_30_ + ',' + i_31_ + ',' + bool_32_ + ',' + i_33_ + ',' + i_34_ + ')'));
		}
	}

	final boolean method1315(int i, int i_38_, int i_39_, int i_40_, int i_41_, boolean bool, int i_42_, int i_43_) {
		try {
			anInt2844++;
			if ((i_40_ ^ 0xffffffff) != -2) {
				if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (-1 + i_41_ + i_40_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && -1 + (i_40_ + i_39_) >= i_39_)
					return true;
			} else if ((i_41_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff))
				return true;
			i_41_ -= ((Class199) this).anInt2836;
			i -= ((Class199) this).anInt2841;
			i_39_ -= ((Class199) this).anInt2841;
			i_42_ -= ((Class199) this).anInt2836;
			if (i_40_ == 1) {
				if (i_43_ == 0) {
					if (i_38_ == 0) {
						if (i_41_ == i_42_ - 1 && (i_39_ ^ 0xffffffff) == (i ^ 0xffffffff))
							return true;
						if ((i_41_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff) && i == i_39_ + 1 && ((0x2c0120 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0))
							return true;
						if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (-1 + i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_41_][i]) & 0x2c0102 ^ 0xffffffff) == -1)
							return true;
					} else if ((i_38_ ^ 0xffffffff) != -2) {
						if ((i_38_ ^ 0xffffffff) == -3) {
							if ((i_42_ + 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff))
								return true;
							if (i_41_ == i_42_ && 1 + i_39_ == i && ((((Class199) this).anIntArrayArray2829[i_41_][i]) & 0x2c0120 ^ 0xffffffff) == -1)
								return true;
							if ((i_41_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_39_ - 1 ^ 0xffffffff) && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0)
								return true;
						} else if ((i_38_ ^ 0xffffffff) == -4) {
							if (i_42_ == i_41_ && i_39_ - 1 == i)
								return true;
							if (i_41_ == i_42_ - 1 && i_39_ == i && (0x2c0108 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0)
								return true;
							if (1 + i_42_ == i_41_ && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff) && (0x2c0180 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0)
								return true;
						}
					} else {
						if (i_42_ == i_41_ && (i ^ 0xffffffff) == (i_39_ + 1 ^ 0xffffffff))
							return true;
						if ((-1 + i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && (((Class199) this).anIntArrayArray2829[i_41_][i] & 0x2c0108) == 0)
							return true;
						if (i_42_ + 1 == i_41_ && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff) && (((Class199) this).anIntArrayArray2829[i_41_][i] & 0x2c0180) == 0)
							return true;
					}
				}
				if (i_43_ == 2) {
					if (i_38_ == 0) {
						if ((i_41_ ^ 0xffffffff) == (-1 + i_42_ ^ 0xffffffff) && i_39_ == i)
							return true;
						if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i_39_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff))
							return true;
						if ((i_42_ + 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && i_39_ == i && ((((Class199) this).anIntArrayArray2829[i_41_][i]) & 0x2c0180 ^ 0xffffffff) == -1)
							return true;
						if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (-1 + i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_41_][i]) & 0x2c0102 ^ 0xffffffff) == -1)
							return true;
					} else if (i_38_ == 1) {
						if (i_41_ == -1 + i_42_ && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff) && ((0x2c0108 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0))
							return true;
						if ((i_41_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff) && (i ^ 0xffffffff) == (1 + i_39_ ^ 0xffffffff))
							return true;
						if ((1 + i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff))
							return true;
						if (i_42_ == i_41_ && (i ^ 0xffffffff) == (-1 + i_39_ ^ 0xffffffff) && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_41_][i]) ^ 0xffffffff) == -1)
							return true;
					} else if ((i_38_ ^ 0xffffffff) != -3) {
						if (i_38_ == 3) {
							if ((-1 + i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_39_ ^ 0xffffffff))
								return true;
							if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && 1 + i_39_ == i && (0x2c0120 & (((Class199) this).anIntArrayArray2829[i_41_][i])) == 0)
								return true;
							if ((i_42_ + 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_41_][i]) & 0x2c0180) == 0)
								return true;
							if (i_42_ == i_41_ && (i ^ 0xffffffff) == (-1 + i_39_ ^ 0xffffffff))
								return true;
						}
					} else {
						if (i_41_ == i_42_ - 1 && i_39_ == i && (((Class199) this).anIntArrayArray2829[i_41_][i] & 0x2c0108) == 0)
							return true;
						if (i_42_ == i_41_ && (i_39_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff) && (((Class199) this).anIntArrayArray2829[i_41_][i] & 0x2c0120) == 0)
							return true;
						if ((1 + i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) == (i ^ 0xffffffff))
							return true;
						if (i_42_ == i_41_ && -1 + i_39_ == i)
							return true;
					}
				}
				if (i_43_ == 9) {
					if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (1 + i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && ((0x20 & ((Class199) this).anIntArrayArray2829[i_41_][i]) ^ 0xffffffff) == -1)
						return true;
					if ((i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && i == i_39_ - 1 && (((Class199) this).anIntArrayArray2829[i_41_][i] & 0x2) == 0)
						return true;
					if ((i_42_ - 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && i == i_39_ && ((0x8 & ((Class199) this).anIntArrayArray2829[i_41_][i]) == 0))
						return true;
					if ((1 + i_42_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && i_39_ == i && ((0x80 & ((Class199) this).anIntArrayArray2829[i_41_][i]) == 0))
						return true;
				}
			} else {
				int i_44_ = -1 + i_41_ + i_40_;
				int i_45_ = i_40_ + (i - 1);
				if (i_43_ == 0) {
					if (i_38_ == 0) {
						if (i_42_ - i_40_ == i_41_ && i_39_ >= i && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff))
							return true;
						if ((i_42_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff) && i_42_ <= i_44_ && (1 + i_39_ ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_42_][i]) & 0x2c0120 ^ 0xffffffff) == -1)
							return true;
						if (i_41_ <= i_42_ && i_44_ >= i_42_ && i == -i_40_ + i_39_ && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_42_][i_45_])) == 0)
							return true;
					} else if ((i_38_ ^ 0xffffffff) != -2) {
						if ((i_38_ ^ 0xffffffff) == -3) {
							if (i_41_ == 1 + i_42_ && i_39_ >= i && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff))
								return true;
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && (i_39_ + 1 ^ 0xffffffff) == (i ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_42_][i]) & 0x2c0120) == 0)
								return true;
							if (i_41_ <= i_42_ && (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && ((-i_40_ + i_39_ ^ 0xffffffff) == (i ^ 0xffffffff)) && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_42_][i_45_]) ^ 0xffffffff) == -1)
								return true;
						} else if (i_38_ == 3) {
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && i == i_39_ - i_40_)
								return true;
							if (-i_40_ + i_42_ == i_41_ && (i ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_44_][i_39_]) & 0x2c0108 ^ 0xffffffff) == -1)
								return true;
							if (1 + i_42_ == i_41_ && (i_39_ ^ 0xffffffff) <= (i ^ 0xffffffff) && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_41_][i_39_]) & 0x2c0180) == 0)
								return true;
						}
					} else {
						if (i_41_ <= i_42_ && i_44_ >= i_42_ && (i ^ 0xffffffff) == (i_39_ + 1 ^ 0xffffffff))
							return true;
						if (i_41_ == -i_40_ + i_42_ && i_39_ >= i && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && (0x2c0108 & (((Class199) this).anIntArrayArray2829[i_44_][i_39_])) == 0)
							return true;
						if (i_41_ == 1 + i_42_ && i <= i_39_ && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_41_][i_39_]) & 0x2c0180 ^ 0xffffffff) == -1)
							return true;
					}
				}
				if ((i_43_ ^ 0xffffffff) == -3) {
					if (i_38_ != 0) {
						if ((i_38_ ^ 0xffffffff) == -2) {
							if (-i_40_ + i_42_ == i_41_ && i <= i_39_ && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff) && (0x2c0108 & (((Class199) this).anIntArrayArray2829[i_44_][i_39_])) == 0)
								return true;
							if (i_41_ <= i_42_ && i_44_ >= i_42_ && (i ^ 0xffffffff) == (i_39_ + 1 ^ 0xffffffff))
								return true;
							if ((i_41_ ^ 0xffffffff) == (1 + i_42_ ^ 0xffffffff) && (i ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff))
								return true;
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && i == -i_40_ + i_39_ && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_42_][i_45_])) == 0)
								return true;
						} else if ((i_38_ ^ 0xffffffff) == -3) {
							if (-i_40_ + i_42_ == i_41_ && i <= i_39_ && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_44_][i_39_]) & 0x2c0108 ^ 0xffffffff) == -1)
								return true;
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && i == 1 + i_39_ && ((((Class199) this).anIntArrayArray2829[i_42_][i]) & 0x2c0120 ^ 0xffffffff) == -1)
								return true;
							if ((i_41_ ^ 0xffffffff) == (i_42_ + 1 ^ 0xffffffff) && i_39_ >= i && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff))
								return true;
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && i_44_ >= i_42_ && i == i_39_ - i_40_)
								return true;
						} else if ((i_38_ ^ 0xffffffff) == -4) {
							if (-i_40_ + i_42_ == i_41_ && (i ^ 0xffffffff) >= (i_39_ ^ 0xffffffff) && i_45_ >= i_39_)
								return true;
							if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && i_42_ <= i_44_ && i == i_39_ + 1 && (0x2c0120 & (((Class199) this).anIntArrayArray2829[i_42_][i]) ^ 0xffffffff) == -1)
								return true;
							if ((i_41_ ^ 0xffffffff) == (1 + i_42_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) <= (i ^ 0xffffffff) && i_39_ <= i_45_ && (0x2c0180 & (((Class199) this).anIntArrayArray2829[i_41_][i_39_]) ^ 0xffffffff) == -1)
								return true;
							if (i_41_ <= i_42_ && i_44_ >= i_42_ && -i_40_ + i_39_ == i)
								return true;
						}
					} else {
						if (-i_40_ + i_42_ == i_41_ && i <= i_39_ && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff))
							return true;
						if ((i_42_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff) && i_44_ >= i_42_ && (i ^ 0xffffffff) == (i_39_ + 1 ^ 0xffffffff))
							return true;
						if ((i_42_ + 1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff) && (i_39_ ^ 0xffffffff) <= (i ^ 0xffffffff) && (i_39_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff) && (0x2c0180 & (((Class199) this).anIntArrayArray2829[i_41_][i_39_])) == 0)
							return true;
						if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && (i_44_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff) && (i ^ 0xffffffff) == (-i_40_ + i_39_ ^ 0xffffffff) && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_42_][i_45_]) ^ 0xffffffff) == -1)
							return true;
					}
				}
				if ((i_43_ ^ 0xffffffff) == -10) {
					if (i_42_ >= i_41_ && i_42_ <= i_44_ && (i ^ 0xffffffff) == (i_39_ + 1 ^ 0xffffffff) && ((0x2c0120 & ((Class199) this).anIntArrayArray2829[i_42_][i]) ^ 0xffffffff) == -1)
						return true;
					if ((i_41_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && i_42_ <= i_44_ && i == i_39_ - i_40_ && (0x2c0102 & (((Class199) this).anIntArrayArray2829[i_42_][i_45_])) == 0)
						return true;
					if (i_42_ + -i_40_ == i_41_ && (i_39_ ^ 0xffffffff) <= (i ^ 0xffffffff) && (i_45_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_44_][i_39_]) & 0x2c0108 ^ 0xffffffff) == -1)
						return true;
					if (i_42_ + 1 == i_41_ && i_39_ >= i && i_39_ <= i_45_ && ((((Class199) this).anIntArrayArray2829[i_41_][i_39_]) & 0x2c0180 ^ 0xffffffff) == -1)
						return true;
				}
			}
			if (bool != false)
				method1315(-38, 68, -104, -110, 105, true, 33, 79);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.F(" + i + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + bool + ',' + i_42_ + ',' + i_43_ + ')'));
		}
	}

	public static void method1316(int i) {
		try {
			if (i != 3)
				anInt2846 = 99;
			index7 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sd.N(" + i + ')');
		}
	}

	final boolean method1317(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		try {
			anInt2840++;
			int i_55_ = i_47_ + i_49_;
			int i_56_ = i_52_ - -i_54_;
			if (i_46_ != 0)
				anInt2846 = -66;
			int i_57_ = i + i_53_;
			int i_58_ = i_48_ + i_51_;
			if ((i_49_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (0x2 & i_50_ ^ 0xffffffff) == -1) {
				int i_59_ = i_51_ < i_52_ ? i_52_ : i_51_;
				for (int i_60_ = i_58_ > i_56_ ? i_56_ : i_58_; i_59_ < i_60_; i_59_++) {
					if (((((Class199) this).anIntArrayArray2829[-((Class199) this).anInt2836 + (-1 + i_57_)][-((Class199) this).anInt2841 + i_59_]) & 0x8 ^ 0xffffffff) == -1)
						return true;
				}
			} else if (i_55_ == i && (0x8 & i_50_) == 0) {
				int i_61_ = i_51_ >= i_52_ ? i_51_ : i_52_;
				for (int i_62_ = ((i_56_ ^ 0xffffffff) > (i_58_ ^ 0xffffffff) ? i_56_ : i_58_); i_61_ < i_62_; i_61_++) {
					if ((0x80 & (((Class199) this).anIntArrayArray2829[i + -((Class199) this).anInt2836][i_61_ + -((Class199) this).anInt2841]) ^ 0xffffffff) == -1)
						return true;
				}
			} else if (i_52_ != i_58_ || (i_50_ & 0x1 ^ 0xffffffff) != -1) {
				if (i_56_ == i_51_ && (i_50_ & 0x4) == 0) {
					int i_63_ = i < i_49_ ? i_49_ : i;
					for (int i_64_ = i_57_ > i_55_ ? i_55_ : i_57_; i_63_ < i_64_; i_63_++) {
						if (((((Class199) this).anIntArrayArray2829[i_63_ - ((Class199) this).anInt2836][i_51_ - ((Class199) this).anInt2841]) & 0x20 ^ 0xffffffff) == -1)
							return true;
					}
				}
			} else {
				int i_65_ = (i_49_ ^ 0xffffffff) >= (i ^ 0xffffffff) ? i : i_49_;
				for (int i_66_ = ((i_57_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff) ? i_57_ : i_55_); (i_65_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff); i_65_++) {
					if (((((Class199) this).anIntArrayArray2829[i_65_ - ((Class199) this).anInt2836][-((Class199) this).anInt2841 - 1 + i_58_]) & 0x2 ^ 0xffffffff) == -1)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.C(" + i + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ')'));
		}
	}

	final void method1318(int i, boolean bool, int i_67_, int i_68_, int i_69_, boolean bool_70_, int i_71_) {
		do {
			try {
				i_67_ -= ((Class199) this).anInt2836;
				i -= ((Class199) this).anInt2841;
				anInt2831++;
				if (i_71_ == 0) {
					if (i_69_ == 0) {
						method1311(128, i, i_67_, false);
						method1311(8, i, -1 + i_67_, false);
					}
					if (i_69_ == 1) {
						method1311(2, i, i_67_, false);
						method1311(32, i + 1, i_67_, false);
					}
					if ((i_69_ ^ 0xffffffff) == -3) {
						method1311(8, i, i_67_, false);
						method1311(128, i, 1 + i_67_, false);
					}
					if ((i_69_ ^ 0xffffffff) == -4) {
						method1311(32, i, i_67_, false);
						method1311(2, -1 + i, i_67_, false);
					}
				}
				if (i_68_ == 268435456) {
					if ((i_71_ ^ 0xffffffff) == -2 || (i_71_ ^ 0xffffffff) == -4) {
						if (i_69_ == 0) {
							method1311(1, i, i_67_, false);
							method1311(16, 1 + i, i_67_ - 1, false);
						}
						if ((i_69_ ^ 0xffffffff) == -2) {
							method1311(4, i, i_67_, false);
							method1311(64, i + 1, 1 + i_67_, false);
						}
						if ((i_69_ ^ 0xffffffff) == -3) {
							method1311(16, i, i_67_, false);
							method1311(1, i - 1, 1 + i_67_, false);
						}
						if (i_69_ == 3) {
							method1311(64, i, i_67_, false);
							method1311(4, i - 1, i_67_ - 1, false);
						}
					}
					if (i_71_ == 2) {
						if (i_69_ == 0) {
							method1311(130, i, i_67_, false);
							method1311(8, i, -1 + i_67_, false);
							method1311(32, 1 + i, i_67_, false);
						}
						if (i_69_ == 1) {
							method1311(10, i, i_67_, false);
							method1311(32, 1 + i, i_67_, false);
							method1311(128, i, 1 + i_67_, false);
						}
						if (i_69_ == 2) {
							method1311(40, i, i_67_, false);
							method1311(128, i, i_67_ + 1, false);
							method1311(2, i - 1, i_67_, false);
						}
						if (i_69_ == 3) {
							method1311(160, i, i_67_, false);
							method1311(2, -1 + i, i_67_, false);
							method1311(8, i, i_67_ - 1, false);
						}
					}
					if (bool) {
						if (i_71_ == 0) {
							if (i_69_ == 0) {
								method1311(65536, i, i_67_, false);
								method1311(4096, i, -1 + i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -2) {
								method1311(1024, i, i_67_, false);
								method1311(16384, 1 + i, i_67_, false);
							}
							if (i_69_ == 2) {
								method1311(4096, i, i_67_, false);
								method1311(65536, i, 1 + i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -4) {
								method1311(16384, i, i_67_, false);
								method1311(1024, i - 1, i_67_, false);
							}
						}
						if ((i_71_ ^ 0xffffffff) == -2 || i_71_ == 3) {
							if (i_69_ == 0) {
								method1311(512, i, i_67_, false);
								method1311(8192, i + 1, -1 + i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -2) {
								method1311(2048, i, i_67_, false);
								method1311(32768, i + 1, 1 + i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -3) {
								method1311(8192, i, i_67_, false);
								method1311(512, -1 + i, i_67_ + 1, false);
							}
							if ((i_69_ ^ 0xffffffff) == -4) {
								method1311(32768, i, i_67_, false);
								method1311(2048, i - 1, i_67_ - 1, false);
							}
						}
						if (i_71_ == 2) {
							if (i_69_ == 0) {
								method1311(66560, i, i_67_, false);
								method1311(4096, i, i_67_ - 1, false);
								method1311(16384, i + 1, i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -2) {
								method1311(5120, i, i_67_, false);
								method1311(16384, 1 + i, i_67_, false);
								method1311(65536, i, 1 + i_67_, false);
							}
							if (i_69_ == 2) {
								method1311(20480, i, i_67_, false);
								method1311(65536, i, 1 + i_67_, false);
								method1311(1024, -1 + i, i_67_, false);
							}
							if ((i_69_ ^ 0xffffffff) == -4) {
								method1311(81920, i, i_67_, false);
								method1311(1024, -1 + i, i_67_, false);
								method1311(4096, i, -1 + i_67_, false);
							}
						}
					}
					if (!bool_70_)
						break;
					if (i_71_ == 0) {
						if (i_69_ == 0) {
							method1311(536870912, i, i_67_, false);
							method1311(33554432, i, -1 + i_67_, false);
						}
						if ((i_69_ ^ 0xffffffff) == -2) {
							method1311(8388608, i, i_67_, false);
							method1311(134217728, 1 + i, i_67_, false);
						}
						if (i_69_ == 2) {
							method1311(33554432, i, i_67_, false);
							method1311(536870912, i, 1 + i_67_, false);
						}
						if ((i_69_ ^ 0xffffffff) == -4) {
							method1311(134217728, i, i_67_, false);
							method1311(8388608, -1 + i, i_67_, false);
						}
					}
					if (i_71_ == 1 || (i_71_ ^ 0xffffffff) == -4) {
						if (i_69_ == 0) {
							method1311(4194304, i, i_67_, false);
							method1311(67108864, 1 + i, -1 + i_67_, false);
						}
						if (i_69_ == 1) {
							method1311(16777216, i, i_67_, false);
							method1311(268435456, 1 + i, 1 + i_67_, false);
						}
						if ((i_69_ ^ 0xffffffff) == -3) {
							method1311(67108864, i, i_67_, false);
							method1311(4194304, -1 + i, 1 + i_67_, false);
						}
						if ((i_69_ ^ 0xffffffff) == -4) {
							method1311(268435456, i, i_67_, false);
							method1311(16777216, i - 1, i_67_ - 1, false);
						}
					}
					if (i_71_ != 2)
						break;
					if ((i_69_ ^ 0xffffffff) == -1) {
						method1311(545259520, i, i_67_, false);
						method1311(33554432, i, i_67_ - 1, false);
						method1311(134217728, 1 + i, i_67_, false);
					}
					if (i_69_ == 1) {
						method1311(41943040, i, i_67_, false);
						method1311(134217728, 1 + i, i_67_, false);
						method1311(536870912, i, i_67_ + 1, false);
					}
					if ((i_69_ ^ 0xffffffff) == -3) {
						method1311(167772160, i, i_67_, false);
						method1311(536870912, i, 1 + i_67_, false);
						method1311(8388608, i - 1, i_67_, false);
					}
					if ((i_69_ ^ 0xffffffff) != -4)
						break;
					method1311(671088640, i, i_67_, false);
					method1311(8388608, -1 + i, i_67_, false);
					method1311(33554432, i, -1 + i_67_, false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sd.A(" + i + ',' + bool + ',' + i_67_ + ',' + i_68_ + ',' + i_69_ + ',' + bool_70_ + ',' + i_71_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1319(int i) {
		try {
			anInt2843++;
			synchronized (Class253.aClass54_3600) {
				Class253.aClass54_3600.method369(false);
			}
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				Class246_Sub28_Sub14.aClass54_6304.method369(false);
				if (i != 8)
					index7 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sd.B(" + i + ')');
		}
	}

	final void method1320(int i, int i_72_, boolean bool) {
		try {
			anInt2848++;
			i -= ((Class199) this).anInt2836;
			if (bool == false) {
				i_72_ -= ((Class199) this).anInt2841;
				((Class199) this).anIntArrayArray2829[i][i_72_] = PacketsDecoder.method184((((Class199) this).anIntArrayArray2829[i][i_72_]), -262145);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.I(" + i + ',' + i_72_ + ',' + bool + ')'));
		}
	}

	final void method1321(int i, int i_73_, int i_74_, int i_75_, int i_76_, boolean bool, boolean bool_77_) {
		do {
			try {
				anInt2847++;
				i_76_ -= ((Class199) this).anInt2836;
				i_75_ -= ((Class199) this).anInt2841;
				if ((i_74_ ^ 0xffffffff) == -1) {
					if (i_73_ == 0) {
						method1312(128, 0, i_76_, i_75_);
						method1312(8, 0, i_76_ - 1, i_75_);
					}
					if (i_73_ == 1) {
						method1312(2, 0, i_76_, i_75_);
						method1312(32, 0, i_76_, 1 + i_75_);
					}
					if ((i_73_ ^ 0xffffffff) == -3) {
						method1312(8, 0, i_76_, i_75_);
						method1312(128, 0, 1 + i_76_, i_75_);
					}
					if ((i_73_ ^ 0xffffffff) == -4) {
						method1312(32, 0, i_76_, i_75_);
						method1312(2, 0, i_76_, i_75_ - 1);
					}
				}
				if ((i_74_ ^ 0xffffffff) == -2 || (i_74_ ^ 0xffffffff) == -4) {
					if (i_73_ == 0) {
						method1312(1, 0, i_76_, i_75_);
						method1312(16, 0, -1 + i_76_, 1 + i_75_);
					}
					if (i_73_ == 1) {
						method1312(4, 0, i_76_, i_75_);
						method1312(64, 0, 1 + i_76_, i_75_ + 1);
					}
					if ((i_73_ ^ 0xffffffff) == -3) {
						method1312(16, 0, i_76_, i_75_);
						method1312(1, 0, i_76_ + 1, i_75_ - 1);
					}
					if ((i_73_ ^ 0xffffffff) == -4) {
						method1312(64, 0, i_76_, i_75_);
						method1312(4, 0, i_76_ - 1, i_75_ - 1);
					}
				}
				if (i_74_ == 2) {
					if (i_73_ == 0) {
						method1312(130, 0, i_76_, i_75_);
						method1312(8, 0, -1 + i_76_, i_75_);
						method1312(32, 0, i_76_, 1 + i_75_);
					}
					if ((i_73_ ^ 0xffffffff) == -2) {
						method1312(10, 0, i_76_, i_75_);
						method1312(32, 0, i_76_, i_75_ + 1);
						method1312(128, 0, 1 + i_76_, i_75_);
					}
					if (i_73_ == 2) {
						method1312(40, 0, i_76_, i_75_);
						method1312(128, 0, 1 + i_76_, i_75_);
						method1312(2, 0, i_76_, i_75_ - 1);
					}
					if (i_73_ == 3) {
						method1312(160, 0, i_76_, i_75_);
						method1312(2, 0, i_76_, -1 + i_75_);
						method1312(8, 0, -1 + i_76_, i_75_);
					}
				}
				if (i <= -56) {
					if (bool) {
						if ((i_74_ ^ 0xffffffff) == -1) {
							if (i_73_ == 0) {
								method1312(65536, 0, i_76_, i_75_);
								method1312(4096, 0, i_76_ - 1, i_75_);
							}
							if ((i_73_ ^ 0xffffffff) == -2) {
								method1312(1024, 0, i_76_, i_75_);
								method1312(16384, 0, i_76_, 1 + i_75_);
							}
							if (i_73_ == 2) {
								method1312(4096, 0, i_76_, i_75_);
								method1312(65536, 0, i_76_ + 1, i_75_);
							}
							if ((i_73_ ^ 0xffffffff) == -4) {
								method1312(16384, 0, i_76_, i_75_);
								method1312(1024, 0, i_76_, -1 + i_75_);
							}
						}
						if (i_74_ == 1 || (i_74_ ^ 0xffffffff) == -4) {
							if (i_73_ == 0) {
								method1312(512, 0, i_76_, i_75_);
								method1312(8192, 0, i_76_ - 1, 1 + i_75_);
							}
							if ((i_73_ ^ 0xffffffff) == -2) {
								method1312(2048, 0, i_76_, i_75_);
								method1312(32768, 0, 1 + i_76_, 1 + i_75_);
							}
							if (i_73_ == 2) {
								method1312(8192, 0, i_76_, i_75_);
								method1312(512, 0, i_76_ + 1, -1 + i_75_);
							}
							if (i_73_ == 3) {
								method1312(32768, 0, i_76_, i_75_);
								method1312(2048, 0, i_76_ - 1, -1 + i_75_);
							}
						}
						if (i_74_ == 2) {
							if (i_73_ == 0) {
								method1312(66560, 0, i_76_, i_75_);
								method1312(4096, 0, i_76_ - 1, i_75_);
								method1312(16384, 0, i_76_, 1 + i_75_);
							}
							if ((i_73_ ^ 0xffffffff) == -2) {
								method1312(5120, 0, i_76_, i_75_);
								method1312(16384, 0, i_76_, 1 + i_75_);
								method1312(65536, 0, i_76_ + 1, i_75_);
							}
							if (i_73_ == 2) {
								method1312(20480, 0, i_76_, i_75_);
								method1312(65536, 0, i_76_ + 1, i_75_);
								method1312(1024, 0, i_76_, i_75_ - 1);
							}
							if ((i_73_ ^ 0xffffffff) == -4) {
								method1312(81920, 0, i_76_, i_75_);
								method1312(1024, 0, i_76_, i_75_ - 1);
								method1312(4096, 0, i_76_ - 1, i_75_);
							}
						}
					}
					if (!bool_77_)
						break;
					if (i_74_ == 0) {
						if ((i_73_ ^ 0xffffffff) == -1) {
							method1312(536870912, 0, i_76_, i_75_);
							method1312(33554432, 0, -1 + i_76_, i_75_);
						}
						if ((i_73_ ^ 0xffffffff) == -2) {
							method1312(8388608, 0, i_76_, i_75_);
							method1312(134217728, 0, i_76_, 1 + i_75_);
						}
						if ((i_73_ ^ 0xffffffff) == -3) {
							method1312(33554432, 0, i_76_, i_75_);
							method1312(536870912, 0, 1 + i_76_, i_75_);
						}
						if ((i_73_ ^ 0xffffffff) == -4) {
							method1312(134217728, 0, i_76_, i_75_);
							method1312(8388608, 0, i_76_, i_75_ - 1);
						}
					}
					if (i_74_ == 1 || i_74_ == 3) {
						if (i_73_ == 0) {
							method1312(4194304, 0, i_76_, i_75_);
							method1312(67108864, 0, i_76_ - 1, i_75_ + 1);
						}
						if ((i_73_ ^ 0xffffffff) == -2) {
							method1312(16777216, 0, i_76_, i_75_);
							method1312(268435456, 0, i_76_ + 1, 1 + i_75_);
						}
						if (i_73_ == 2) {
							method1312(67108864, 0, i_76_, i_75_);
							method1312(4194304, 0, i_76_ + 1, i_75_ - 1);
						}
						if ((i_73_ ^ 0xffffffff) == -4) {
							method1312(268435456, 0, i_76_, i_75_);
							method1312(16777216, 0, -1 + i_76_, i_75_ - 1);
						}
					}
					if ((i_74_ ^ 0xffffffff) != -3)
						break;
					if (i_73_ == 0) {
						method1312(545259520, 0, i_76_, i_75_);
						method1312(33554432, 0, i_76_ - 1, i_75_);
						method1312(134217728, 0, i_76_, i_75_ + 1);
					}
					if (i_73_ == 1) {
						method1312(41943040, 0, i_76_, i_75_);
						method1312(134217728, 0, i_76_, i_75_ + 1);
						method1312(536870912, 0, i_76_ + 1, i_75_);
					}
					if (i_73_ == 2) {
						method1312(167772160, 0, i_76_, i_75_);
						method1312(536870912, 0, i_76_ + 1, i_75_);
						method1312(8388608, 0, i_76_, i_75_ - 1);
					}
					if (i_73_ != 3)
						break;
					method1312(671088640, 0, i_76_, i_75_);
					method1312(8388608, 0, i_76_, i_75_ - 1);
					method1312(33554432, 0, -1 + i_76_, i_75_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sd.G(" + i + ',' + i_73_ + ',' + i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + bool + ',' + bool_77_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1322(int i, int i_78_, boolean bool, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		try {
			anInt2835++;
			if (i_83_ != 1) {
				if (i_78_ <= i_80_ && (i_80_ ^ 0xffffffff) >= (i_83_ + (i_78_ - 1) ^ 0xffffffff) && (i_82_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff) && i_82_ + i_83_ - 1 >= i_82_)
					return true;
			} else if (i_78_ == i_80_ && i_81_ == i_82_)
				return true;
			if (bool != false)
				((Class199) this).anInt2830 = -32;
			i_82_ -= ((Class199) this).anInt2841;
			i_80_ -= ((Class199) this).anInt2836;
			i_78_ -= ((Class199) this).anInt2836;
			i_81_ -= ((Class199) this).anInt2841;
			if ((i_83_ ^ 0xffffffff) == -2) {
				if (i_79_ == 6 || i_79_ == 7) {
					if ((i_79_ ^ 0xffffffff) == -8)
						i = 0x3 & 2 + i;
					if (i != 0) {
						if (i != 1) {
							if (i != 2) {
								if ((i ^ 0xffffffff) == -4) {
									if (((i_80_ + 1 ^ 0xffffffff) == (i_78_ ^ 0xffffffff)) && ((i_82_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff)) && ((((Class199) this).anIntArrayArray2829[i_78_][i_81_]) & 0x80 ^ 0xffffffff) == -1)
										return true;
									if (i_80_ == i_78_ && ((i_82_ + 1 ^ 0xffffffff) == (i_81_ ^ 0xffffffff)) && (0x20 & (((Class199) this).anIntArrayArray2829[i_78_][i_81_]) ^ 0xffffffff) == -1)
										return true;
								}
							} else {
								if (i_78_ == i_80_ - 1 && i_82_ == i_81_ && (0x8 & (((Class199) this).anIntArrayArray2829[i_78_][i_81_]) ^ 0xffffffff) == -1)
									return true;
								if (i_80_ == i_78_ && 1 + i_82_ == i_81_ && ((((Class199) this).anIntArrayArray2829[i_78_][i_81_]) & 0x20 ^ 0xffffffff) == -1)
									return true;
							}
						} else {
							if ((i_80_ - 1 ^ 0xffffffff) == (i_78_ ^ 0xffffffff) && i_82_ == i_81_ && ((((Class199) this).anIntArrayArray2829[i_78_][i_81_]) & 0x8) == 0)
								return true;
							if (i_78_ == i_80_ && (-1 + i_82_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff) && (0x2 & (((Class199) this).anIntArrayArray2829[i_78_][i_81_])) == 0)
								return true;
						}
					} else {
						if (i_80_ + 1 == i_78_ && (i_81_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff) && (0x80 & (((Class199) this).anIntArrayArray2829[i_78_][i_81_]) ^ 0xffffffff) == -1)
							return true;
						if ((i_78_ ^ 0xffffffff) == (i_80_ ^ 0xffffffff) && (i_81_ ^ 0xffffffff) == (i_82_ - 1 ^ 0xffffffff) && (0x2 & (((Class199) this).anIntArrayArray2829[i_78_][i_81_])) == 0)
							return true;
					}
				}
				if ((i_79_ ^ 0xffffffff) == -9) {
					if (i_78_ == i_80_ && (1 + i_82_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff) && (((Class199) this).anIntArrayArray2829[i_78_][i_81_] & 0x20) == 0)
						return true;
					if ((i_78_ ^ 0xffffffff) == (i_80_ ^ 0xffffffff) && i_82_ - 1 == i_81_ && ((((Class199) this).anIntArrayArray2829[i_78_][i_81_]) & 0x2 ^ 0xffffffff) == -1)
						return true;
					if ((i_78_ ^ 0xffffffff) == (-1 + i_80_ ^ 0xffffffff) && (i_82_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff) && (((Class199) this).anIntArrayArray2829[i_78_][i_81_] & 0x8) == 0)
						return true;
					if ((i_78_ ^ 0xffffffff) == (i_80_ + 1 ^ 0xffffffff) && i_81_ == i_82_ && (((Class199) this).anIntArrayArray2829[i_78_][i_81_] & 0x80) == 0)
						return true;
				}
			} else {
				int i_84_ = -1 + (i_83_ + i_78_);
				int i_85_ = -1 + (i_83_ + i_81_);
				if ((i_79_ ^ 0xffffffff) == -7 || (i_79_ ^ 0xffffffff) == -8) {
					if (i_79_ == 7)
						i = 2 + i & 0x3;
					if (i != 0) {
						if ((i ^ 0xffffffff) == -2) {
							if ((i_78_ ^ 0xffffffff) == (i_80_ + -i_83_ ^ 0xffffffff) && i_81_ <= i_82_ && i_82_ <= i_85_ && ((((Class199) this).anIntArrayArray2829[i_84_][i_82_]) & 0x8) == 0)
								return true;
							if (i_78_ <= i_80_ && (i_84_ ^ 0xffffffff) <= (i_80_ ^ 0xffffffff) && ((i_82_ - i_83_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff)) && (0x2 & (((Class199) this).anIntArrayArray2829[i_80_][i_85_]) ^ 0xffffffff) == -1)
								return true;
						} else if (i == 2) {
							if (i_78_ == -i_83_ + i_80_ && (i_81_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff) && (i_82_ ^ 0xffffffff) >= (i_85_ ^ 0xffffffff) && (0x8 & (((Class199) this).anIntArrayArray2829[i_84_][i_82_]) ^ 0xffffffff) == -1)
								return true;
							if (i_80_ >= i_78_ && i_84_ >= i_80_ && i_82_ + 1 == i_81_ && (0x20 & (((Class199) this).anIntArrayArray2829[i_80_][i_81_])) == 0)
								return true;
						} else if ((i ^ 0xffffffff) == -4) {
							if (i_78_ == i_80_ + 1 && (i_81_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff) && i_85_ >= i_82_ && (0x80 & (((Class199) this).anIntArrayArray2829[i_78_][i_82_])) == 0)
								return true;
							if (i_80_ >= i_78_ && i_84_ >= i_80_ && (i_81_ ^ 0xffffffff) == (i_82_ + 1 ^ 0xffffffff) && ((((Class199) this).anIntArrayArray2829[i_80_][i_81_]) & 0x20 ^ 0xffffffff) == -1)
								return true;
						}
					} else {
						if (i_78_ == 1 + i_80_ && (i_82_ ^ 0xffffffff) <= (i_81_ ^ 0xffffffff) && (i_85_ ^ 0xffffffff) <= (i_82_ ^ 0xffffffff) && (0x80 & (((Class199) this).anIntArrayArray2829[i_78_][i_82_])) == 0)
							return true;
						if (i_78_ <= i_80_ && (i_84_ ^ 0xffffffff) <= (i_80_ ^ 0xffffffff) && i_82_ - i_83_ == i_81_ && ((((Class199) this).anIntArrayArray2829[i_80_][i_85_]) & 0x2 ^ 0xffffffff) == -1)
							return true;
					}
				}
				if (i_79_ == 8) {
					if ((i_78_ ^ 0xffffffff) >= (i_80_ ^ 0xffffffff) && i_84_ >= i_80_ && i_82_ + 1 == i_81_ && (0x20 & (((Class199) this).anIntArrayArray2829[i_80_][i_81_]) ^ 0xffffffff) == -1)
						return true;
					if (i_80_ >= i_78_ && i_80_ <= i_84_ && (i_82_ - i_83_ ^ 0xffffffff) == (i_81_ ^ 0xffffffff) && (0x2 & (((Class199) this).anIntArrayArray2829[i_80_][i_85_]) ^ 0xffffffff) == -1)
						return true;
					if ((i_78_ ^ 0xffffffff) == (i_80_ - i_83_ ^ 0xffffffff) && (i_81_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff) && (i_82_ ^ 0xffffffff) >= (i_85_ ^ 0xffffffff) && (0x8 & (((Class199) this).anIntArrayArray2829[i_84_][i_82_])) == 0)
						return true;
					if ((i_78_ ^ 0xffffffff) == (i_80_ + 1 ^ 0xffffffff) && i_81_ <= i_82_ && i_82_ <= i_85_ && (0x80 & (((Class199) this).anIntArrayArray2829[i_78_][i_82_])) == 0)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.E(" + i + ',' + i_78_ + ',' + bool + ',' + i_79_ + ',' + i_80_ + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ')'));
		}
	}

	final void method1323(int i, int i_86_, int i_87_) {
		try {
			anInt2839++;
			i -= ((Class199) this).anInt2841;
			i_87_ -= ((Class199) this).anInt2836;
			((Class199) this).anIntArrayArray2829[i_87_][i] = Class236.method1523((((Class199) this).anIntArrayArray2829[i_87_][i]), i_86_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sd.Q(" + i + ',' + i_86_ + ',' + i_87_ + ')'));
		}
	}

	final void method1324(int i) {
		try {
			anInt2842++;
			if (i > -47)
				method1313(-104, -4, 100, 41, 16, 28, 39, 115, -124);
			for (int i_88_ = 0; i_88_ < ((Class199) this).anInt2837; i_88_++) {
				for (int i_89_ = 0; ((i_89_ ^ 0xffffffff) > (((Class199) this).anInt2830 ^ 0xffffffff)); i_89_++) {
					if (i_88_ == 0 || i_89_ == 0 || ((((Class199) this).anInt2837 - 5 ^ 0xffffffff) >= (i_88_ ^ 0xffffffff)) || -5 + ((Class199) this).anInt2830 <= i_89_)
						((Class199) this).anIntArrayArray2829[i_88_][i_89_] = -1;
					else
						((Class199) this).anIntArrayArray2829[i_88_][i_89_] = 2097152;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sd.H(" + i + ')');
		}
	}
}
