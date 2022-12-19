/* Class246_Sub1_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub10 extends Class246_Sub1 {
	static int anInt6199;
	static int anInt6200;
	static int anInt6201;
	static int anInt6202;
	static int anInt6203;
	static Class48 aClass48_6204 = new Class48(14, 1);
	static int anInt6205;
	int anInt6206;
	static int anInt6207;
	static int anInt6208;
	String aString6209;
	int anInt6210;
	int anInt6211;
	static int anInt6212;
	static Class48 aClass48_6213 = new Class48(15, 4);
	static int anInt6214;
	static Class48 aClass48_6215 = new Class48(16, -2);
	static Class48 aClass48_6216 = new Class48(17, 0);
	static Class48 aClass48_6217 = new Class48(18, -2);
	static Class48 aClass48_6218 = new Class48(20, 6);
	static Class48 aClass48_6219 = new Class48(21, 8);
	static Class48 aClass48_6220 = new Class48(22, -2);
	static Class48 aClass48_6221 = new Class48(23, 4);
	static Class48 aClass48_6222 = new Class48(24, -1);
	private static Class48[] aClass48Array6223 = new Class48[32];
	static Class67 aClass67_6224;
	static Class67 f_ab;
	static long f_bb;
	static int f_cb;
	static int f_db;
	static Class163 f_eb;

	static final void method2599(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		try {
			if (i_1_ != -1)
				aClass48_6219 = null;
			anInt6200++;
			long l = (long) (i_2_ | (bool ? -2147483648 : 0));
			Class246_Sub18 class246_sub18 = (Class246_Sub18) Class110.aClass85_1572.method544(l, 125);
			if (class246_sub18 == null) {
				class246_sub18 = new Class246_Sub18();
				Class110.aClass85_1572.method547(l, i_1_ ^ 0x8fc, class246_sub18);
			}
			if (((Class246_Sub18) class246_sub18).anIntArray4682.length <= i) {
				int[] is = new int[i + 1];
				int[] is_4_ = new int[i + 1];
				for (int i_5_ = 0; i_5_ < (((Class246_Sub18) class246_sub18).anIntArray4682).length; i_5_++) {
					is[i_5_] = (((Class246_Sub18) class246_sub18).anIntArray4682[i_5_]);
					is_4_[i_5_] = (((Class246_Sub18) class246_sub18).anIntArray4679[i_5_]);
				}
				for (int i_6_ = (((Class246_Sub18) class246_sub18).anIntArray4682).length; i_6_ < i; i_6_++) {
					is[i_6_] = -1;
					is_4_[i_6_] = 0;
				}
				((Class246_Sub18) class246_sub18).anIntArray4682 = is;
				((Class246_Sub18) class246_sub18).anIntArray4679 = is_4_;
			}
			((Class246_Sub18) class246_sub18).anIntArray4682[i] = i_0_;
			((Class246_Sub18) class246_sub18).anIntArray4679[i] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hp.J(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ')'));
		}
	}

	final void method2600(int i) {
		do {
			try {
				((Class246_Sub1) this).aLong3739 |= ~0x7fffffffffffffffL;
				if (i == -25852) {
					anInt6202++;
					if ((method2607(i + 24690) ^ 0xffffffffffffffffL) != -1L)
						break;
					Class53.aClass217_757.method1407(11, this);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hp.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final byte method2601(boolean bool, char c) {
		try {
			if (bool != true)
				method2606(-30, (byte) 88);
			anInt6201++;
			byte i;
			if ((c <= 0 || (c ^ 0xffffffff) <= -129) && ((c ^ 0xffffffff) > -161 || (c ^ 0xffffffff) < -256)) {
				if (c != 8364) {
					if ((c ^ 0xffffffff) == -8219)
						i = (byte) -126;
					else if ((c ^ 0xffffffff) == -403)
						i = (byte) -125;
					else if (c != 8222) {
						if ((c ^ 0xffffffff) != -8231) {
							if ((c ^ 0xffffffff) != -8225) {
								if (c != 8225) {
									if ((c ^ 0xffffffff) != -711) {
										if ((c ^ 0xffffffff) != -8241) {
											if ((c ^ 0xffffffff) == -353)
												i = (byte) -118;
											else if ((c ^ 0xffffffff) == -8250)
												i = (byte) -117;
											else if ((c ^ 0xffffffff) != -339) {
												if (c != 381) {
													if (c != 8216) {
														if (c == 8217)
															i = (byte) -110;
														else if ((c ^ 0xffffffff) != -8221) {
															if (c != 8221) {
																if ((c ^ 0xffffffff) == -8227)
																	i = (byte) -107;
																else if (c == 8211)
																	i = (byte) -106;
																else if (c == 8212)
																	i = (byte) -105;
																else if ((c ^ 0xffffffff) == -733)
																	i = (byte) -104;
																else if (c != 8482) {
																	if (c == 353)
																		i = (byte) -102;
																	else if (c == 8250)
																		i = (byte) -101;
																	else if ((c ^ 0xffffffff) == -340)
																		i = (byte) -100;
																	else if ((c ^ 0xffffffff) == -383)
																		i = (byte) -98;
																	else if ((c ^ 0xffffffff) == -377)
																		i = (byte) -97;
																	else
																		i = (byte) 63;
																} else
																	i = (byte) -103;
															} else
																i = (byte) -108;
														} else
															i = (byte) -109;
													} else
														i = (byte) -111;
												} else
													i = (byte) -114;
											} else
												i = (byte) -116;
										} else
											i = (byte) -119;
									} else
										i = (byte) -120;
								} else
									i = (byte) -121;
							} else
								i = (byte) -122;
						} else
							i = (byte) -123;
					} else
						i = (byte) -124;
				} else
					i = (byte) -128;
			} else
				i = (byte) c;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.E(" + bool + ',' + c + ')');
		}
	}

	final int method2602(byte i) {
		try {
			anInt6208++;
			int i_7_ = -104 / ((42 - i) / 46);
			return (int) (0xffL & ((Node) this).hash >>> 32);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.D(" + i + ')');
		}
	}

	static final long method2603(int i) {
		try {
			int i_8_ = -36 / ((-53 - i) / 56);
			anInt6205++;
			return Stream_Sub1.aClass110_5862.method766((byte) -53);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.A(" + i + ')');
		}
	}

	final void method2604(byte i) {
		do {
			try {
				anInt6207++;
				((Class246_Sub1) this).aLong3739 = (Class151.time(-55) - -500L | (~0x7fffffffffffffffL & ((Class246_Sub1) this).aLong3739));
				Class130_Sub6.aClass217_4844.method1407(-126, this);
				if (i < -44)
					break;
				aClass48_6204 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hp.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2605(byte i) {
		try {
			anInt6214++;
			if (i != -10)
				return -105;
			return (int) ((Node) this).hash;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.C(" + i + ')');
		}
	}

	static final void method2606(int i, byte i_9_) {
		try {
			anInt6203++;
			int i_10_ = Class246_Sub1_Sub4.anInt5752 - Class246_Sub30.anInt5031;
			if (i_10_ >= 100)
				Class130_Sub3.anInt4417 = 1;
			else {
				int i_11_ = (int) Class59_Sub2.aFloat4553;
				if (Stream_Sub2.anInt6188 >> 8 > i_11_)
					i_11_ = Stream_Sub2.anInt6188 >> 8;
				if (Class246_Sub28_Sub29.aBoolArray6817[4] && (Class59_Sub5_Sub1.anIntArray5827[4] + 128 ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
					i_11_ = Class59_Sub5_Sub1.anIntArray5827[4] + 128;
				int i_12_ = 0x3fff & Class147.anInt2147 + (int) Class204.aFloat2881;
				Class246_Sub28_Sub15.method2646(0, Class_c_Sub1.anInt5366, (i_11_ >> 3) * 3 + 600 << 0, Class246_Sub34.anInt5135, i_12_, -50 + Class6.getAverageHeight((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060), 46, Class246_Sub28_Sub24.anInt6681, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059)), i, i_11_);
				float f = (-((float) ((100 - i_10_) * ((-i_10_ + 100) * (-i_10_ + 100))) / 1000000.0F) + 1.0F);
				Class259_Sub1.anInt4509 = (int) (f * (float) (-Class_cs.anInt7145 + Class259_Sub1.anInt4509) + (float) Class_cs.anInt7145);
				if (i_9_ != 24)
					aClass48_6215 = null;
				Class246_Sub28_Sub8.anInt6077 = (int) ((float) Class56.anInt788 + (float) (-Class56.anInt788 + Class246_Sub28_Sub8.anInt6077) * f);
				Class244.anInt3456 = (int) ((float) Class21_Sub3.anInt4727 + (float) (-Class21_Sub3.anInt4727 + Class244.anInt3456) * f);
				Class246_Sub16.aInt92 = (int) ((float) (Class246_Sub16.aInt92 - Class102_Sub1.anInt4450) * f + (float) Class102_Sub1.anInt4450);
				int i_13_ = -Class96.anInt1259 + Class73.anInt961;
				do {
					if ((i_13_ ^ 0xffffffff) >= -8193) {
						if ((i_13_ ^ 0xffffffff) <= 8191)
							break;
						i_13_ += 16384;
						if (!client.f_ob)
							break;
					}
					i_13_ -= 16384;
				} while (false);
				Class73.anInt961 = (int) ((float) Class96.anInt1259 + (float) i_13_ * f);
				Class73.anInt961 &= 0x3fff;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.H(" + i + ',' + i_9_ + ')');
		}
	}

	final long method2607(int i) {
		try {
			if (i != -1162)
				((Class246_Sub1_Sub10) this).anInt6211 = -22;
			anInt6212++;
			return ((Class246_Sub1) this).aLong3739 & 0x7fffffffffffffffL;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.F(" + i + ')');
		}
	}

	Class246_Sub1_Sub10(int i, int i_14_) {
		try {
			((Node) this).hash = (long) i << 32 | (long) i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.<init>(" + i + ',' + i_14_ + ')');
		}
	}

	public static void method2608(byte i) {
		try {
			aClass48_6215 = null;
			aClass48_6216 = null;
			aClass67_6224 = null;
			f_eb = null;
			aClass48_6218 = null;
			aClass48_6204 = null;
			aClass48_6213 = null;
			aClass48_6221 = null;
			aClass48_6220 = null;
			aClass48_6219 = null;
			aClass48_6217 = null;
			aClass48Array6223 = null;
			if (i == 2) {
				f_ab = null;
				aClass48_6222 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hp.G(" + i + ')');
		}
	}

	static {
		Class48[] class48s = Class246_Sub28_Sub31.method2849(true);
		for (int i = 0; (class48s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			aClass48Array6223[((Class48) class48s[i]).anInt689] = class48s[i];
		aClass67_6224 = new Class67("green:", "gr\u00fcn:", "vert:", "verde:");
		f_ab = new Class67("Created gameworld", "Spielwelt erstellt.", "Monde de jeu cr\u00e9\u00e9", "Universo de jogo criado");
		f_bb = 0L;
		f_cb = 0;
	}
}
