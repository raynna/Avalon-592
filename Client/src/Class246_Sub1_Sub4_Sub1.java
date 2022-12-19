/* Class246_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub4_Sub1 extends Class246_Sub1_Sub4 {
	static Class67 aClass67_7066 = new Class67("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
	static int anInt7067;
	int anInt7068;
	static int anInt7069;
	static int anInt7070;
	int anInt7071;
	static int anInt7072;
	int anInt7073;
	byte[] aByteArray7074;
	int anInt7075;
	static int anInt7076;
	static OutgoingPacket PLAYER_OPTION_4_PACKET = new OutgoingPacket(65, 3);

	final void method2890(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_0_ >= -8)
				aClass67_7066 = null;
			((Class246_Sub1_Sub4_Sub1) this).anInt7068 = i_3_ + -i;
			((Class246_Sub1_Sub4_Sub1) this).anInt7071 = i;
			((Class246_Sub1_Sub4_Sub1) this).anInt7073 = i_1_;
			((Class246_Sub1_Sub4_Sub1) this).anInt7075 = -i_1_ + i_2_;
			anInt7069++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gm.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method2891(byte i) {
		try {
			if (i != -77)
				method2893((byte) 109, null);
			aClass67_7066 = null;
			PLAYER_OPTION_4_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gm.C(" + i + ')');
		}
	}

	final boolean method2892(int i, int i_4_, int i_5_) {
		try {
			anInt7070++;
			if (i != 22582)
				PLAYER_OPTION_4_PACKET = null;
			if (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074.length < i_5_ * i_4_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gm.F(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final int method2893(byte i, String string) {
		try {
			anInt7072++;
			int i_6_ = 101 % ((68 - i) / 50);
			int i_7_ = string.length();
			int i_8_ = 0;
			for (int i_9_ = 0; (i_7_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
				i_8_ = string.charAt(i_9_) + (-i_8_ + (i_8_ << 5));
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gm.D(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2894(int i, int i_10_, int i_11_, boolean bool, int i_12_, int i_13_, int i_14_) {
		try {
			anInt7067++;
			int i_15_ = 0;
			if (i_11_ != i_10_)
				i_15_ = (i_12_ + -i << 16) / (i_10_ - i_11_);
			int i_16_ = 0;
			if ((i_10_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff))
				i_16_ = (-i_12_ + i_14_ << 16) / (i_13_ - i_10_);
			int i_17_ = 0;
			if (bool != false)
				((Class246_Sub1_Sub4_Sub1) this).aByteArray7074 = null;
			if (i_13_ != i_11_)
				i_17_ = (i - i_14_ << 16) / (i_11_ + -i_13_);
			if (i_11_ <= i_10_ && (i_13_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)) {
				if ((i_10_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)) {
					i_12_ = i <<= 16;
					i_14_ <<= 16;
					if (i_11_ < 0) {
						i_12_ -= i_17_ * i_11_;
						i -= i_15_ * i_11_;
						i_11_ = 0;
					}
					if (i_13_ < 0) {
						i_14_ -= i_13_ * i_16_;
						i_13_ = 0;
					}
					if (i_11_ != i_13_ && (i_15_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff) || ((i_13_ ^ 0xffffffff) == (i_11_ ^ 0xffffffff) && (i_16_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff))) {
						i_10_ -= i_13_;
						i_13_ -= i_11_;
						i_11_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_11_);
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i >> 16, i_12_ >> 16, i_11_);
							i_12_ += i_17_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i += i_15_;
						}
						while ((--i_10_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i >> 16, i_14_ >> 16, i_11_);
							i_14_ += i_16_;
							i += i_15_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
					} else {
						i_10_ -= i_13_;
						i_13_ -= i_11_;
						i_11_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_11_);
						while (--i_13_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_12_ >> 16, i >> 16, i_11_);
							i_12_ += i_17_;
							i += i_15_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
						while (--i_10_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_14_ >> 16, i >> 16, i_11_);
							i_14_ += i_16_;
							i += i_15_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
					}
				} else {
					i_14_ = i <<= 16;
					if (i_11_ < 0) {
						i -= i_15_ * i_11_;
						i_14_ -= i_17_ * i_11_;
						i_11_ = 0;
					}
					i_12_ <<= 16;
					if (i_10_ < 0) {
						i_12_ -= i_10_ * i_16_;
						i_10_ = 0;
					}
					if (((i_11_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff) || i_15_ <= i_17_) && ((i_10_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff) || (i_17_ ^ 0xffffffff) >= (i_16_ ^ 0xffffffff))) {
						i_13_ -= i_10_;
						i_10_ -= i_11_;
						i_11_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_11_);
						while (--i_10_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, !bool, i_14_ >> 16, i >> 16, i_11_);
							i += i_15_;
							i_14_ += i_17_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_14_ >> 16, i_12_ >> 16, i_11_);
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_14_ += i_17_;
							i_12_ += i_16_;
						}
					} else {
						i_13_ -= i_10_;
						i_10_ -= i_11_;
						i_11_ *= ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						while (--i_10_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i >> 16, i_14_ >> 16, i_11_);
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_14_ += i_17_;
							i += i_15_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_12_ >> 16, i_14_ >> 16, i_11_);
							i_14_ += i_17_;
							i_12_ += i_16_;
							i_11_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
					}
				}
			} else if (i_10_ > i_13_) {
				if (i_10_ > i_11_) {
					i_12_ = i_14_ <<= 16;
					i <<= 16;
					if (i_13_ < 0) {
						i_14_ -= i_17_ * i_13_;
						i_12_ -= i_13_ * i_16_;
						i_13_ = 0;
					}
					if ((i_11_ ^ 0xffffffff) > -1) {
						i -= i_15_ * i_11_;
						i_11_ = 0;
					}
					if (i_16_ >= i_17_) {
						i_10_ -= i_11_;
						i_11_ -= i_13_;
						i_13_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_13_);
						while (--i_11_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_12_ >> 16, i_14_ >> 16, i_13_);
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_12_ += i_16_;
							i_14_ += i_17_;
						}
						while (--i_10_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_12_ >> 16, i >> 16, i_13_);
							i += i_15_;
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_12_ += i_16_;
						}
					} else {
						i_10_ -= i_11_;
						i_11_ -= i_13_;
						i_13_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_13_);
						while (--i_11_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_14_ >> 16, i_12_ >> 16, i_13_);
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_12_ += i_16_;
							i_14_ += i_17_;
						}
						while ((--i_10_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i >> 16, i_12_ >> 16, i_13_);
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_12_ += i_16_;
							i += i_15_;
						}
					}
				} else {
					i = i_14_ <<= 16;
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_14_ -= i_13_ * i_17_;
						i -= i_16_ * i_13_;
						i_13_ = 0;
					}
					i_12_ <<= 16;
					if ((i_10_ ^ 0xffffffff) > -1) {
						i_12_ -= i_10_ * i_15_;
						i_10_ = 0;
					}
					if ((i_16_ ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)) {
						i_11_ -= i_10_;
						i_10_ -= i_13_;
						i_13_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_13_);
						while (--i_10_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i >> 16, i_14_ >> 16, i_13_);
							i_14_ += i_17_;
							i += i_16_;
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
						while (--i_11_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_12_ >> 16, i_14_ >> 16, i_13_);
							i_14_ += i_17_;
							i_12_ += i_15_;
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						}
					} else {
						i_11_ -= i_10_;
						i_10_ -= i_13_;
						i_13_ = (((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_13_);
						while ((--i_10_ ^ 0xffffffff) <= -1) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, !bool, i_14_ >> 16, i >> 16, i_13_);
							i_14_ += i_17_;
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i += i_16_;
						}
						while (--i_11_ >= 0) {
							Class165.method1089(0, ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074, true, i_14_ >> 16, i_12_ >> 16, i_13_);
							i_13_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
							i_14_ += i_17_;
							i_12_ += i_15_;
						}
					}
				}
			} else if ((i_11_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)) {
				i_14_ = i_12_ <<= 16;
				i <<= 16;
				if (i_10_ < 0) {
					i_14_ -= i_10_ * i_15_;
					i_12_ -= i_16_ * i_10_;
					i_10_ = 0;
				}
				if ((i_11_ ^ 0xffffffff) > -1) {
					i -= i_11_ * i_17_;
					i_11_ = 0;
				}
				if (i_15_ < i_16_) {
					i_13_ -= i_11_;
					i_11_ -= i_10_;
					i_10_ *= ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
					while (--i_11_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i_12_ >> 16, i_14_ >> 16, i_10_);
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i_12_ += i_16_;
						i_14_ += i_15_;
					}
					while (--i_13_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i_12_ >> 16, i >> 16, i_10_);
						i += i_17_;
						i_12_ += i_16_;
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
					}
				} else {
					i_13_ -= i_11_;
					i_11_ -= i_10_;
					i_10_ = ((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_10_;
					while ((--i_11_ ^ 0xffffffff) <= -1) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i_14_ >> 16, i_12_ >> 16, i_10_);
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i_14_ += i_15_;
						i_12_ += i_16_;
					}
					while (--i_13_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), !bool, i >> 16, i_12_ >> 16, i_10_);
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i += i_17_;
						i_12_ += i_16_;
					}
				}
			} else {
				i = i_12_ <<= 16;
				if ((i_10_ ^ 0xffffffff) > -1) {
					i_12_ -= i_10_ * i_16_;
					i -= i_10_ * i_15_;
					i_10_ = 0;
				}
				i_14_ <<= 16;
				if ((i_13_ ^ 0xffffffff) > -1) {
					i_14_ -= i_13_ * i_17_;
					i_13_ = 0;
				}
				if (((i_10_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff) && (i_15_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) || ((i_10_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff) && i_17_ < i_15_)) {
					i_11_ -= i_13_;
					i_13_ -= i_10_;
					i_10_ = ((Class246_Sub1_Sub4_Sub1) this).anInt7075 * i_10_;
					while (--i_13_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i_12_ >> 16, i >> 16, i_10_);
						i_12_ += i_16_;
						i += i_15_;
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
					}
					while (--i_11_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), !bool, i_14_ >> 16, i >> 16, i_10_);
						i_14_ += i_17_;
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i += i_15_;
					}
				} else {
					i_11_ -= i_13_;
					i_13_ -= i_10_;
					i_10_ *= ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i >> 16, i_12_ >> 16, i_10_);
						i += i_15_;
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i_12_ += i_16_;
					}
					while (--i_11_ >= 0) {
						Class165.method1089(0, (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074), true, i >> 16, i_14_ >> 16, i_10_);
						i_10_ += ((Class246_Sub1_Sub4_Sub1) this).anInt7075;
						i_14_ += i_17_;
						i += i_15_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gm.B(" + i + ',' + i_10_ + ',' + i_11_ + ',' + bool + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method2895(int i) {
		try {
			anInt7076++;
			int i_18_ = -1;
			int i_19_ = ((Class246_Sub1_Sub4_Sub1) this).aByteArray7074.length - 8;
			if (i == 292993616) {
				while (i_19_ > i_18_) {
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
				}
				while (i_18_ < -1 + (((Class246_Sub1_Sub4_Sub1) this).aByteArray7074).length)
					((Class246_Sub1_Sub4_Sub1) this).aByteArray7074[++i_18_] = (byte) 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gm.E(" + i + ')');
		}
	}

	Class246_Sub1_Sub4_Sub1(Class260_Sub2 class260_sub2, int i, int i_20_) {
		try {
			((Class246_Sub1_Sub4_Sub1) this).aByteArray7074 = new byte[i_20_ * i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gm.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_20_ + ')'));
		}
	}
}
