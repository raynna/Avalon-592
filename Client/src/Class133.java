/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class133 {
	static int anInt1834;
	Class246_Sub1_Sub4 aClass246_Sub1_Sub4_1835;
	static int anInt1836;
	Class_t aClass_t1837;
	static int anInt1838;
	static int anInt1839;
	static int anInt1840;
	static Class67 aClass67_1841 = new Class67("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "D\u00e9marrage de la librairie 3D", "Iniciando biblioteca 3D");
	static int anInt1842 = 20;
	static Class67 aClass67_1843 = new Class67("wave:", "welle:", "ondulation:", "onda:");
	static OutgoingPacket aClass201_1844 = new OutgoingPacket(72, -1);

	static final void method894(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			anInt1839++;
			if (i_3_ > -77)
				anInt1842 = -67;
			int i_7_ = 0;
			int i_8_ = i_0_;
			int i_9_ = 0;
			int i_10_ = -i_4_ + i_1_;
			int i_11_ = i_0_ - i_4_;
			int i_12_ = i_1_ * i_1_;
			int i_13_ = i_0_ * i_0_;
			int i_14_ = i_10_ * i_10_;
			int i_15_ = i_11_ * i_11_;
			int i_16_ = i_13_ << 1;
			int i_17_ = i_12_ << 1;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_14_ << 1;
			int i_20_ = i_0_ << 1;
			int i_21_ = i_11_ << 1;
			int i_22_ = i_12_ * (1 + -i_20_) - -i_16_;
			int i_23_ = i_13_ + -((i_20_ - 1) * i_17_);
			int i_24_ = i_18_ + (-i_21_ + 1) * i_14_;
			int i_25_ = i_15_ - i_19_ * (i_21_ - 1);
			int i_26_ = i_12_ << 2;
			int i_27_ = i_13_ << 2;
			int i_28_ = i_14_ << 2;
			int i_29_ = i_15_ << 2;
			int i_30_ = i_16_ * 3;
			int i_31_ = i_17_ * (-3 + i_20_);
			int i_32_ = i_18_ * 3;
			int i_33_ = (-3 + i_21_) * i_19_;
			int i_34_ = i_27_;
			int i_35_ = (-1 + i_0_) * i_26_;
			int i_36_ = i_29_;
			int i_37_ = (i_11_ - 1) * i_28_;
			int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i];
			Class135.method918(-i_1_ + i_5_, 124, i_2_, -i_10_ + i_5_, is);
			Class135.method918(-i_10_ + i_5_, 118, i_6_, i_5_ - -i_10_, is);
			Class135.method918(i_5_ + i_10_, -93, i_2_, i_5_ - -i_1_, is);
			while (i_8_ > 0) {
				boolean bool = (i_11_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff);
				if ((i_22_ ^ 0xffffffff) > -1) {
					while (i_22_ < 0) {
						i_23_ += i_34_;
						i_22_ += i_30_;
						i_34_ += i_27_;
						i_7_++;
						i_30_ += i_27_;
					}
				}
				if (bool) {
					if ((i_24_ ^ 0xffffffff) > -1) {
						while ((i_24_ ^ 0xffffffff) > -1) {
							i_25_ += i_36_;
							i_24_ += i_32_;
							i_36_ += i_29_;
							i_32_ += i_29_;
							i_9_++;
						}
					}
					if (i_25_ < 0) {
						i_25_ += i_36_;
						i_24_ += i_32_;
						i_36_ += i_29_;
						i_32_ += i_29_;
						i_9_++;
					}
					i_24_ += -i_37_;
					i_25_ += -i_33_;
					i_33_ -= i_28_;
					i_37_ -= i_28_;
				}
				if (i_23_ < 0) {
					i_23_ += i_34_;
					i_22_ += i_30_;
					i_34_ += i_27_;
					i_7_++;
					i_30_ += i_27_;
				}
				i_23_ += -i_31_;
				i_22_ += -i_35_;
				i_35_ -= i_26_;
				i_31_ -= i_26_;
				i_8_--;
				int i_38_ = i + -i_8_;
				int i_39_ = i_8_ + i;
				int i_40_ = i_7_ + i_5_;
				int i_41_ = i_5_ - i_7_;
				if (!bool) {
					Class135.method918(i_41_, -24, i_2_, i_40_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_38_]));
					Class135.method918(i_41_, 127, i_2_, i_40_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_39_]));
				} else {
					int i_42_ = i_5_ + i_9_;
					int i_43_ = -i_9_ + i_5_;
					Class135.method918(i_41_, -99, i_2_, i_43_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_38_]));
					Class135.method918(i_43_, 126, i_6_, i_42_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_38_]));
					Class135.method918(i_42_, 126, i_2_, i_40_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_38_]));
					Class135.method918(i_41_, -107, i_2_, i_43_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_39_]));
					Class135.method918(i_43_, -127, i_6_, i_42_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_39_]));
					Class135.method918(i_42_, -13, i_2_, i_40_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_39_]));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mg.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final boolean method895(int i, char c) {
		try {
			anInt1840++;
			if (i != 26959)
				method894(-94, -48, 46, 98, 125, -50, 111, -26);
			if (((c ^ 0xffffffff) > -66 || (c ^ 0xffffffff) < -91) && ((c ^ 0xffffffff) > -98 || (c ^ 0xffffffff) < -123))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mg.E(" + i + ',' + c + ')');
		}
	}

	public static void method896(byte i) {
		try {
			if (i != 93)
				method894(23, -85, -97, -109, 104, -54, -97, -74);
			aClass67_1841 = null;
			aClass201_1844 = null;
			aClass67_1843 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mg.A(" + i + ')');
		}
	}

	static final void method897(byte i, String string, boolean bool) {
		try {
			anInt1838++;
			((Class_fs) Class219.index19).anInt126 = 1;
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_44_ = 0;
			for (int i_45_ = 0; ((i_45_ ^ 0xffffffff) > (((Class191) Class255.aClass191_3663).anInt2690 ^ 0xffffffff)); i_45_++) {
				Class197 class197 = Class255.aClass191_3663.method1251(i + 22778, i_45_);
				if ((!bool || ((Class197) class197).aBool2774) && (((Class197) class197).f_tb ^ 0xffffffff) == 0 && ((Class197) class197).anInt2817 == -1 && ((Class197) class197).anInt2801 == 0 && (((Class197) class197).aString2778.toLowerCase().indexOf(string) ^ 0xffffffff) != 0) {
					if ((i_44_ ^ 0xffffffff) <= -251) {
						Class102.aShortArray1323 = null;
						Class246_Sub38.anInt5445 = -1;
						return;
					}
					if (i_44_ >= is.length) {
						short[] is_46_ = new short[is.length * 2];
						for (int i_47_ = 0; i_44_ > i_47_; i_47_++)
							is_46_[i_47_] = is[i_47_];
						is = is_46_;
					}
					is[i_44_++] = (short) i_45_;
				}
			}
			Class22.anInt324 = 0;
			Class102.aShortArray1323 = is;
			Class246_Sub38.anInt5445 = i_44_;
			String[] strings = new String[Class246_Sub38.anInt5445];
			for (int i_48_ = 0; ((i_48_ ^ 0xffffffff) > (Class246_Sub38.anInt5445 ^ 0xffffffff)); i_48_++)
				strings[i_48_] = (((Class197) Class255.aClass191_3663.method1251(i + 22778, is[i_48_])).aString2778);
			Class246_Sub28_Sub3.method2495(0, strings, Class102.aShortArray1323);
			Class219.index19.method105(0);
			if (i != 105)
				aClass67_1841 = null;
			((Class_fs) Class219.index19).anInt126 = 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mg.F(" + i + ',' + (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final void method898(int i, int i_49_, int i_50_) {
		try {
			anInt1836++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 116, i_50_);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_49_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mg.D(" + i + ',' + i_49_ + ',' + i_50_ + ')'));
		}
	}

	static final int method899(int i, int i_51_) {
		if (Class189.aByteArrayArray2669 != null)
			return (Class189.aByteArrayArray2669[i][i_51_] & 0xff) << 3;
		return 0;
	}

	public Class133() {
		/* empty */
	}
}
