/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class221 {
	static Class_fs index0;
	static String aString3061 = null;
	static int anInt3062;
	static int anInt3063;
	static int anInt3064;
	static int anInt3065;
	static int[] anIntArray3066 = new int[25];

	static final int method1431(int i, int i_0_, int i_1_) {
		try {
			anInt3065++;
			if ((i ^ 0xffffffff) == 0)
				return 12345678;
			i_0_ = i_0_ * (0x7f & i) >> 7;
			do {
				if ((i_0_ ^ 0xffffffff) <= -3) {
					if ((i_0_ ^ 0xffffffff) >= -127)
						break;
					i_0_ = 126;
					if (!client.f_ob)
						break;
				}
				i_0_ = 2;
			} while (false);
			if (i_1_ != -1669)
				method1433(-116, true, 37, -7, -107);
			return i_0_ + (i & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tv.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1432(int i, boolean bool, Actor class_r) {
		try {
			anInt3063++;
			Class135 class135 = class_r.method2676(-1);
			if ((((Actor) class_r).f_oc ^ 0xffffffff) == -1) {
				RuntimeException_Sub2.anInt7150 = -1;
				Class_e.anInt1218 = 0;
				((Actor) class_r).f_kc = 0;
			} else {
				if ((((Actor) class_r).anInt6426 ^ 0xffffffff) != 0 && (((Actor) class_r).f_qb ^ 0xffffffff) == -1) {
					Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6426);
					if ((((Actor) class_r).f_sc ^ 0xffffffff) < -1 && ((Class124) class124).anInt1727 == 0) {
						((Actor) class_r).f_kc++;
						Class_e.anInt1218 = 0;
						RuntimeException_Sub2.anInt7150 = -1;
						return;
					}
					if ((((Actor) class_r).f_sc ^ 0xffffffff) >= -1 && ((Class124) class124).anInt1741 == 0) {
						((Actor) class_r).f_kc++;
						RuntimeException_Sub2.anInt7150 = -1;
						Class_e.anInt1218 = 0;
						return;
					}
				}
				if (((Actor) class_r).anInt6437 != -1 && ((((Actor) class_r).anInt6448 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff))) {
					Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) class_r).anInt6437);
					if (((Class144) class144).aBool2087 && ((((Class144) class144).anInt2092 ^ 0xffffffff) != 0)) {
						Class124 class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092));
						if (((Actor) class_r).f_sc > 0 && ((Class124) class124).anInt1727 == 0) {
							Class_e.anInt1218 = 0;
							RuntimeException_Sub2.anInt7150 = -1;
							((Actor) class_r).f_kc++;
							return;
						}
						if ((((Actor) class_r).f_sc ^ 0xffffffff) >= -1 && ((((Class124) class124).anInt1741 ^ 0xffffffff) == -1)) {
							Class_e.anInt1218 = 0;
							RuntimeException_Sub2.anInt7150 = -1;
							((Actor) class_r).f_kc++;
							return;
						}
					}
				}
				if (((Actor) class_r).anInt6437 != -1 && ((((Actor) class_r).anInt6448 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff))) {
					Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) class_r).anInt6437);
					if (((Class144) class144).aBool2087 && ((((Class144) class144).anInt2092 ^ 0xffffffff) != 0)) {
						Class124 class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092));
						if ((((Actor) class_r).f_sc ^ 0xffffffff) < -1 && ((((Class124) class124).anInt1727 ^ 0xffffffff) == -1)) {
							RuntimeException_Sub2.anInt7150 = -1;
							((Actor) class_r).f_kc++;
							Class_e.anInt1218 = 0;
							return;
						}
						if ((((Actor) class_r).f_sc ^ 0xffffffff) >= -1 && ((((Class124) class124).anInt1741 ^ 0xffffffff) == -1)) {
							((Actor) class_r).f_kc++;
							RuntimeException_Sub2.anInt7150 = -1;
							Class_e.anInt1218 = 0;
							return;
						}
					}
				}
				int i_2_ = ((Class59_Sub3) class_r).anInt5060;
				int i_3_ = ((Class59_Sub3) class_r).anInt5059;
				int i_4_ = ((((Actor) class_r).f_mc[-1 + ((Actor) class_r).f_oc] * 128) + 64 * class_r.method2670((byte) 127));
				int i_5_ = ((((Actor) class_r).f_nc[-1 + ((Actor) class_r).f_oc] * 128) - -(class_r.method2670((byte) 127) * 64));
				if ((i_4_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
					if (i_5_ <= i_3_) {
						if ((i_3_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff))
							class_r.method2662(12288, false);
						else
							class_r.method2662(14336, false);
					} else
						class_r.method2662(10240, false);
				} else if (i_4_ >= i_2_) {
					if (i_3_ >= i_5_) {
						if (i_3_ > i_5_)
							class_r.method2662(0, false);
					} else
						class_r.method2662(8192, false);
				} else if (i_5_ <= i_3_) {
					if (i_3_ <= i_5_)
						class_r.method2662(4096, false);
					else
						class_r.method2662(2048, false);
				} else
					class_r.method2662(6144, false);
				byte i_6_ = ((Actor) class_r).f_rc[-1 + ((Actor) class_r).f_oc];
				if (!bool && ((i_4_ - i_2_ ^ 0xffffffff) < -257 || i_4_ + -i_2_ < -256 || (-i_3_ + i_5_ ^ 0xffffffff) < -257 || (i_5_ - i_3_ ^ 0xffffffff) > 255)) {
					((Class59_Sub3) class_r).anInt5060 = i_4_;
					((Class59_Sub3) class_r).anInt5059 = i_5_;
					class_r.method2664(113, ((Actor) class_r).anInt6455);
					if ((((Actor) class_r).f_sc ^ 0xffffffff) < -1)
						((Actor) class_r).f_sc--;
					RuntimeException_Sub2.anInt7150 = -1;
					Class_e.anInt1218 = 0;
					((Actor) class_r).f_oc--;
				} else {
					int i_7_ = 4;
					boolean bool_8_ = true;
					if (class_r instanceof Npc)
						bool_8_ = ((Class253) ((Npc) (Npc) class_r).aClass253_7184).aBool3618;
					if (bool_8_) {
						int i_9_ = (((Actor) class_r).anInt6455 + -(((Class24) ((Actor) class_r).f_fb).anInt344));
						if (i_9_ != 0 && (((Actor) class_r).faceEntity ^ 0xffffffff) == 0 && ((Actor) class_r).f_cc != 0)
							i_7_ = 2;
						if (!bool && (((Actor) class_r).f_oc ^ 0xffffffff) < -3)
							i_7_ = 6;
						if (!bool && (((Actor) class_r).f_oc ^ 0xffffffff) < -4)
							i_7_ = 8;
					} else {
						if (!bool && ((Actor) class_r).f_oc > 1)
							i_7_ = 6;
						if (!bool && (((Actor) class_r).f_oc ^ 0xffffffff) < -3)
							i_7_ = 8;
					}
					if ((((Actor) class_r).f_kc ^ 0xffffffff) < -1 && (((Actor) class_r).f_oc ^ 0xffffffff) < -2) {
						i_7_ = 8;
						((Actor) class_r).f_kc--;
					}
					if (i >= -39)
						aString3061 = null;
					if ((i_6_ ^ 0xffffffff) != -3) {
						if (i_6_ == 0)
							i_7_ >>= 1;
					} else
						i_7_ <<= 1;
					if ((((Class135) class135).anInt1889 ^ 0xffffffff) != 0) {
						i_7_ <<= 7;
						if ((((Actor) class_r).f_oc ^ 0xffffffff) == -2) {
							int i_10_ = (((Actor) class_r).f_tc * ((Actor) class_r).f_tc);
							int i_11_ = ((((i_4_ ^ 0xffffffff) <= (((Class59_Sub3) class_r).anInt5060 ^ 0xffffffff)) ? i_4_ - ((Class59_Sub3) class_r).anInt5060 : (((Class59_Sub3) class_r).anInt5060 - i_4_)) << 7);
							int i_12_ = ((((Class59_Sub3) class_r).anInt5059 ^ 0xffffffff) < (i_5_ ^ 0xffffffff) ? ((Class59_Sub3) class_r).anInt5059 + -i_5_ : i_5_ + -(((Class59_Sub3) class_r).anInt5059)) << 7;
							int i_13_ = ((i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff) ? i_11_ : i_12_);
							int i_14_ = (i_13_ * (((Class135) class135).anInt1889 * 2));
							if (i_14_ >= i_10_) {
								if ((i_10_ / 2 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
									((Actor) class_r).f_tc -= ((Class135) class135).anInt1889;
									if ((((Actor) class_r).f_tc ^ 0xffffffff) > -1)
										((Actor) class_r).f_tc = 0;
								} else if (((Actor) class_r).f_tc < i_7_) {
									((Actor) class_r).f_tc += ((Class135) class135).anInt1889;
									if ((i_7_ ^ 0xffffffff) > (((Actor) class_r).f_tc ^ 0xffffffff))
										((Actor) class_r).f_tc = i_7_;
								}
							} else
								((Actor) class_r).f_tc /= 2;
						} else if ((((Actor) class_r).f_tc ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
							((Actor) class_r).f_tc += ((Class135) class135).anInt1889;
							if (i_7_ < ((Actor) class_r).f_tc)
								((Actor) class_r).f_tc = i_7_;
						} else if ((((Actor) class_r).f_tc ^ 0xffffffff) < -1) {
							((Actor) class_r).f_tc -= ((Class135) class135).anInt1889;
							if ((((Actor) class_r).f_tc ^ 0xffffffff) > -1)
								((Actor) class_r).f_tc = 0;
						}
						i_7_ = ((Actor) class_r).f_tc >> 7;
						if ((i_7_ ^ 0xffffffff) > -2)
							i_7_ = 1;
					}
					Class_e.anInt1218 = 0;
					if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).anInt5060 += i_7_;
						Class_e.anInt1218 |= 0x4;
						if (((Class59_Sub3) class_r).anInt5060 > i_4_)
							((Class59_Sub3) class_r).anInt5060 = i_4_;
					} else if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).anInt5060 -= i_7_;
						Class_e.anInt1218 |= 0x8;
						if (i_4_ > ((Class59_Sub3) class_r).anInt5060)
							((Class59_Sub3) class_r).anInt5060 = i_4_;
					}
					if ((i_5_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).anInt5059 += i_7_;
						Class_e.anInt1218 |= 0x1;
						if (i_5_ < ((Class59_Sub3) class_r).anInt5059)
							((Class59_Sub3) class_r).anInt5059 = i_5_;
					} else if ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
						((Class59_Sub3) class_r).anInt5059 -= i_7_;
						Class_e.anInt1218 |= 0x2;
						if (((Class59_Sub3) class_r).anInt5059 < i_5_)
							((Class59_Sub3) class_r).anInt5059 = i_5_;
					}
					if (((((Class59_Sub3) class_r).anInt5060 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) && i_5_ == ((Class59_Sub3) class_r).anInt5059) {
						((Actor) class_r).f_oc--;
						if ((((Actor) class_r).f_sc ^ 0xffffffff) < -1)
							((Actor) class_r).f_sc--;
					}
					if (i_7_ >= 8)
						RuntimeException_Sub2.anInt7150 = 2;
					else
						RuntimeException_Sub2.anInt7150 = i_6_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tv.C(" + i + ',' + bool + ',' + (class_r != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1433(int i, boolean bool, int i_15_, int i_16_, int i_17_) {
		try {
			anInt3064++;
			if (Class246_Sub13.method1992(i ^ 0x5c, i_16_))
				Class246_Sub1_Sub13.method2698(i_17_, i_15_, (Class246_Sub32.aClass235ArrayArray5049[i_16_]), 22611, i, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tv.A(" + i + ',' + bool + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	static final int method1434(int i) {
		try {
			anInt3062++;
			if (i >= -101)
				method1433(55, true, 36, -16, 68);
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tv.E(" + i + ')');
		}
	}

	public static void method1435(byte i) {
		try {
			if (i <= 37)
				method1432(-47, false, null);
			anIntArray3066 = null;
			index0 = null;
			aString3061 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tv.D(" + i + ')');
		}
	}
}
