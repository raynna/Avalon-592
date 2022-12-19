/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class135 {
	int anInt1880;
	int anInt1881;
	int anInt1882;
	static int anInt1883;
	int anInt1884 = 0;
	int anInt1885;
	int anInt1886;
	int anInt1887 = -1;
	static OutgoingPacket aClass201_1888 = new OutgoingPacket(4, -1);
	int anInt1889;
	int anInt1890;
	static int anInt1891;
	int anInt1892;
	int anInt1893;
	int anInt1894 = -1;
	int anInt1895;
	int anInt1896;
	int anInt1897;
	int anInt1898;
	int anInt1899;
	int anInt1900;
	int anInt1901;
	static int anInt1902;
	int anInt1903;
	static int anInt1904;
	int[][] anIntArrayArray1905;
	boolean aBool1906;
	int anInt1907;
	int anInt1908;
	int anInt1909;
	int[] anIntArray1910;
	int anInt1911;
	int anInt1912;
	int anInt1913;
	int anInt1914;
	int anInt1915;
	int[] anIntArray1916;
	int anInt1917;
	int anInt1918;
	int[] anIntArray1919;
	int anInt1920;
	private int anInt1921;
	int anInt1922;
	int anInt1923;
	static int anInt1924;
	static int anInt1925;
	int anInt1926;
	int anInt1927;
	static int anInt1928;
	static boolean aBool1929 = true;
	static int anInt1930;
	int anInt1931;
	static int[] f_ab = { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 };// added
	int f_bb;
	static byte[][] f_cb = new byte[50][];

	static final int method914(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			anInt1928++;
			i &= 0x3;
			if ((i ^ 0xffffffff) == -1)
				return i_2_;
			if (i_0_ > -97)
				return -27;
			if (i == 1)
				return 7 - i_1_;
			if (i == 2)
				return 7 - i_2_;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int method915(boolean bool) {
		try {
			if (bool != true)
				method919((byte) 94);
			anInt1925++;
			if ((((Class135) this).anInt1885 ^ 0xffffffff) != 0)
				return ((Class135) this).anInt1885;
			if (((Class135) this).anIntArray1910 != null) {
				int i = (int) (Math.random() * (double) anInt1921);
				int i_3_;
				for (i_3_ = 0; ((Class135) this).anIntArray1916[i_3_] <= i; i_3_++)
					i -= ((Class135) this).anIntArray1916[i_3_];
				return ((Class135) this).anIntArray1910[i_3_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.D(" + bool + ')');
		}
	}

	final void method916(int i, BufferStream stream) {
		try {
			anInt1904++;
			if (i != 65535)
				method918(89, 35, -45, -44, null);
			for (;;) {
				int i_4_ = stream.readUnsignedByte(255);
				if (i_4_ == 0)
					break;
				method921(i_4_, 0, stream);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.C(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method917(int i) {
		try {
			anInt1902++;
			if (Class65.aClass6_864 != null) {
				Class65.aClass6_864.method72(false);
				Class65.aClass6_864 = null;
			}
			Class232.method1484((byte) 114);
			Class246_Sub28_Sub4.method2537();
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -5; i_5_++)
				Class95.aClass199Array1235[i_5_].method1324(i - 2813);
			Class246_Sub4.method1809(4095, false);
			if (i == 2700) {
				System.gc();
				Class59_Sub5.method2281(2, (byte) 35);
				Class_w.aBool6383 = false;
				Class36.anInt512 = -1;
				Class218.method1413(true, i + -34093);
				Class255_Sub1.anInt5573 = 0;
				Class130_Sub8.anInt5618 = 0;
				Class92.anInt1206 = 0;
				Class39_Sub1.anInt4670 = 0;
				Class47.anInt686 = 0;
				for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (Class166.aClass29Array2347.length ^ 0xffffffff)); i_6_++)
					Class166.aClass29Array2347[i_6_] = null;
				Class57.method391((byte) 28);
				for (int i_7_ = 0; i_7_ < 2048; i_7_++)
					Class143.aClass_r_Sub1Array2069[i_7_] = null;
				Class5.anInt55 = 0;
				for (int i_8_ = 0; i_8_ < 32768; i_8_++)
					Class76.aClass_r_Sub2Array1002[i_8_] = null;
				Class251.aClass85_3551.method543(i - 2700);
				Class31.method231(-18006);
				SubIncomingPacket.anInt7095 = 0;
				Class246_Sub28_Sub23.aClass95_6658.reset(i - 2575);
				Class246_Sub28_Sub3.method2494(2048);
				Class132.method893(125);
				Class259_Sub3_Sub1.method2840(true, -54);
				try {
					Class80.method521(Class108.aClass52_1535.anApplet733, "loggedout", 101);
				} catch (Throwable throwable) {
					/* empty */
				}
				Class_j.aClass246_Sub39_1488 = null;
				Class40_Sub9.aLong5507 = 0L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.B(" + i + ')');
		}
	}

	static final void method918(int i, int i_9_, int i_10_, int i_11_, int[] is) {
		try {
			i--;
			anInt1883++;
			int i_12_ = --i_11_ - 7;
			while ((i ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
				is[++i] = i_10_;
			}
			int i_13_ = 108 / ((55 - i_9_) / 63);
			while ((i_11_ ^ 0xffffffff) < (i ^ 0xffffffff))
				is[++i] = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.H(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method919(byte i) {
		try {
			if (i == 4) {
				aClass201_1888 = null;
				f_ab = null;
				f_cb = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.E(" + i + ')');
		}
	}

	final boolean method920(byte i, int i_14_) {
		try {
			anInt1930++;
			if ((i_14_ ^ 0xffffffff) == 0)
				return false;
			if ((((Class135) this).anInt1885 ^ 0xffffffff) == (i_14_ ^ 0xffffffff))
				return true;
			if (i != 8)
				((Class135) this).anInt1931 = -33;
			if (((Class135) this).anIntArray1910 != null) {
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (((Class135) this).anIntArray1910.length ^ 0xffffffff)); i_15_++) {
					if ((((Class135) this).anIntArray1910[i_15_] ^ 0xffffffff) == (i_14_ ^ 0xffffffff))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mp.G(" + i + ',' + i_14_ + ')');
		}
	}

	private final void method921(int i, int i_16_, BufferStream stream) {
		try {
			if (i_16_ == 0) {
				anInt1924++;
				if ((i ^ 0xffffffff) == -2) {
					((Class135) this).anInt1885 = stream.readUnsignedShort((byte) -57);
					((Class135) this).anInt1927 = stream.readUnsignedShort((byte) 94);
					if (((Class135) this).anInt1927 == 65535)
						((Class135) this).anInt1927 = -1;
					if (((Class135) this).anInt1885 == 65535)
						((Class135) this).anInt1885 = -1;
				} else if ((i ^ 0xffffffff) == -3)
					((Class135) this).anInt1892 = stream.readUnsignedShort((byte) -66);
				else if (i == 3)
					((Class135) this).anInt1908 = stream.readUnsignedShort((byte) -103);
				else if (i != 4) {
					if (i != 5) {
						if ((i ^ 0xffffffff) == -7)
							((Class135) this).anInt1894 = stream.readUnsignedShort((byte) -76);
						else if (i != 7) {
							if ((i ^ 0xffffffff) != -9) {
								if (i != 9) {
									if (i != 26) {
										if (i != 27) {
											if ((i ^ 0xffffffff) == -29) {
												((Class135) this).anIntArray1919 = new int[12];
												for (int i_17_ = 0; i_17_ < 12; i_17_++) {
													((Class135) this).anIntArray1919[i_17_] = (stream.readUnsignedByte(i_16_ + 255));
													if (((((Class135) this).anIntArray1919[i_17_]) ^ 0xffffffff) == -256)
														((Class135) this).anIntArray1919[i_17_] = -1;
												}
											} else if (i != 29) {
												if ((i ^ 0xffffffff) == -31)
													((Class135) this).anInt1926 = (stream.readUnsignedShort((byte) 125));
												else if ((i ^ 0xffffffff) != -32) {
													if ((i ^ 0xffffffff) != -33) {
														if (i != 33) {
															if ((i ^ 0xffffffff) == -35)
																((Class135) this).anInt1911 = (stream.readUnsignedByte(i_16_ + 255));
															else if ((i ^ 0xffffffff) != -36) {
																if ((i ^ 0xffffffff) != -37) {
																	if (i != 37) {
																		if (i != 38) {
																			if (i != 39) {
																				if ((i ^ 0xffffffff) == -41)
																					((Class135) this).f_bb = stream.readUnsignedShort((byte) -40);
																				else if (i != 41) {
																					if (i == 42)
																						((Class135) this).anInt1882 = stream.readUnsignedShort((byte) 113);
																					else if ((i ^ 0xffffffff) != -44) {
																						if ((i ^ 0xffffffff) != -45) {
																							if (i == 45)
																								((Class135) this).anInt1912 = stream.readUnsignedShort((byte) 126);
																							else if (i == 46)
																								((Class135) this).anInt1881 = stream.readUnsignedShort((byte) -65);
																							else if ((i ^ 0xffffffff) == -48)
																								((Class135) this).anInt1897 = stream.readUnsignedShort((byte) -92);
																							else if (i != 48) {
																								if ((i ^ 0xffffffff) == -50)
																									((Class135) this).anInt1903 = stream.readUnsignedShort((byte) -64);
																								else if ((i ^ 0xffffffff) != -51) {
																									if (i != 51) {
																										if ((i ^ 0xffffffff) == -53) {
																											int i_18_ = stream.readUnsignedByte(255);
																											((Class135) this).anIntArray1916 = new int[i_18_];
																											((Class135) this).anIntArray1910 = new int[i_18_];
																											for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
																												((Class135) this).anIntArray1910[i_19_] = stream.readUnsignedShort((byte) -121);
																												int i_20_ = stream.readUnsignedByte(255);
																												((Class135) this).anIntArray1916[i_19_] = i_20_;
																												anInt1921 += i_20_;
																											}
																										} else if (i != 53) {
																											if (i == 54) {
																												((Class135) this).anInt1896 = stream.readUnsignedByte(255) << 6;
																												((Class135) this).anInt1923 = stream.readUnsignedByte(255) << 6;
																											}
																										} else
																											((Class135) this).aBool1906 = false;
																									} else
																										((Class135) this).anInt1909 = stream.readUnsignedShort((byte) 109);
																								} else
																									((Class135) this).anInt1893 = stream.readUnsignedShort((byte) 117);
																							} else
																								((Class135) this).anInt1915 = stream.readUnsignedShort((byte) -106);
																						} else
																							((Class135) this).anInt1898 = stream.readUnsignedShort((byte) -114);
																					} else
																						((Class135) this).anInt1922 = stream.readUnsignedShort((byte) -77);
																				} else
																					((Class135) this).anInt1907 = stream.readUnsignedShort((byte) 105);
																			} else
																				((Class135) this).anInt1918 = stream.readUnsignedShort((byte) 97);
																		} else
																			((Class135) this).anInt1887 = stream.readUnsignedShort((byte) 105);
																	} else
																		((Class135) this).anInt1889 = stream.readUnsignedByte(255);
																} else
																	((Class135) this).anInt1884 = (stream.method2375((byte) 1));
															} else
																((Class135) this).anInt1920 = (stream.readUnsignedShort((byte) -106));
														} else
															((Class135) this).anInt1899 = (stream.method2375((byte) 1));
													} else
														((Class135) this).anInt1913 = (stream.readUnsignedShort((byte) -110));
												} else
													((Class135) this).anInt1931 = (stream.readUnsignedByte(i_16_ + 255));
											} else
												((Class135) this).anInt1901 = stream.readUnsignedByte(255);
										} else {
											if ((((Class135) this).anIntArrayArray1905) == null)
												((Class135) this).anIntArrayArray1905 = new int[12][];
											int i_21_ = stream.readUnsignedByte(i_16_ + 255);
											((Class135) this).anIntArrayArray1905[i_21_] = new int[6];
											for (int i_22_ = 0; i_22_ < 6; i_22_++)
												((Class135) this).anIntArrayArray1905[i_21_][i_22_] = (stream.method2375((byte) 1));
										}
									} else {
										((Class135) this).anInt1886 = (short) (4 * stream.readUnsignedByte(255));
										((Class135) this).anInt1895 = (short) (stream.readUnsignedByte(255) * 4);
									}
								} else
									((Class135) this).anInt1890 = stream.readUnsignedShort((byte) 124);
							} else
								((Class135) this).anInt1914 = stream.readUnsignedShort((byte) 111);
						} else
							((Class135) this).anInt1880 = stream.readUnsignedShort((byte) 112);
					} else
						((Class135) this).anInt1917 = stream.readUnsignedShort((byte) 92);
				} else
					((Class135) this).anInt1900 = stream.readUnsignedShort((byte) -123);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mp.A(" + i + ',' + i_16_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class135() {
		((Class135) this).anInt1889 = -1;
		((Class135) this).anInt1895 = 0;
		((Class135) this).anInt1897 = -1;
		((Class135) this).aBool1906 = true;
		((Class135) this).anInt1901 = 0;
		((Class135) this).anInt1890 = -1;
		((Class135) this).anInt1899 = 0;
		((Class135) this).anInt1893 = -1;
		((Class135) this).anInt1900 = -1;
		((Class135) this).anInt1885 = -1;
		((Class135) this).anInt1882 = -1;
		((Class135) this).anInt1911 = 0;
		((Class135) this).anInt1907 = -1;
		((Class135) this).anInt1881 = -1;
		((Class135) this).anInt1892 = -1;
		((Class135) this).anInt1912 = -1;
		((Class135) this).anInt1886 = 0;
		((Class135) this).anInt1915 = -1;
		((Class135) this).anInt1896 = 0;
		((Class135) this).anIntArray1910 = null;
		((Class135) this).anInt1914 = -1;
		((Class135) this).anInt1898 = -1;
		((Class135) this).anInt1920 = 0;
		((Class135) this).anInt1880 = -1;
		((Class135) this).anInt1923 = 0;
		((Class135) this).anInt1903 = -1;
		((Class135) this).anInt1908 = -1;
		((Class135) this).anInt1909 = -1;
		((Class135) this).anInt1926 = 0;
		((Class135) this).anInt1918 = -1;
		((Class135) this).anInt1927 = -1;
		((Class135) this).anInt1917 = -1;
		((Class135) this).anInt1922 = -1;
		anInt1921 = 0;
		((Class135) this).anIntArray1916 = null;
		((Class135) this).anInt1913 = 0;
		((Class135) this).anInt1931 = 0;
		((Class135) this).f_bb = -1;
	}
}
