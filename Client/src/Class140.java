/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
	static int anInt1989;
	static int anInt1990;
	boolean aBool1991 = true;
	private Class85 aClass85_1992;
	private int anInt1993;
	int anInt1994 = 0;
	static int anInt1995;
	boolean aBool1996;
	int anInt1997;
	String aString1998;
	int anInt1999;
	int anInt2000;
	private int anInt2001;
	private int anInt2002;
	static int anInt2003;
	private int anInt2004;
	int anInt2005 = -1;
	int anInt2006;
	static Class_c aClass_c2007;
	int anInt2008;
	Class165 aClass165_2009;
	static Class67 aClass67_2010 = new Class67("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
	private int anInt2011;
	private int anInt2012;
	int anInt2013;
	int anInt2014;
	static int anInt2015;
	String aString2016;
	static int anInt2017;
	static int anInt2018;
	static int anInt2019;
	private int anInt2020;
	int anInt2021;
	int anInt2022;
	int anInt2023;
	static int anInt2024;
	private int anInt2025;
	int anInt2026;
	int[] anIntArray2027;
	boolean aBool2028;
	String[] aStringArray2029;
	static int anInt2030;
	static int anInt2031;
	int anInt2032;
	static int anInt2033;
	static HashMap aClass54_2034 = new HashMap(4);
	private int anInt2035;
	static Class242 aClass242_2036;
	boolean aBool2037;
	int anInt2038;
	static int anInt2039;
	static IncomingPacket aClass13_2040 = new IncomingPacket(84, 2);
	static OutgoingPacket SWITCH_INTERFACE_COMPONENTS_OUT = new OutgoingPacket(75, 16);

	static final void method939(byte i) {
		try {
			anInt2017++;
			for (Class246_Sub5 class246_sub5 = (Class246_Sub5) Class150.aClass166_2195.method1104(112); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195.method1108((byte) -112))) {
				if (((Class246_Sub5) class246_sub5).aBool3873)
					class246_sub5.method1811(-2212);
			}
			for (Class246_Sub5 class246_sub5 = (Class246_Sub5) Class76.aClass166_992.method1104(56); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class76.aClass166_992.method1108((byte) -112))) {
				if (((Class246_Sub5) class246_sub5).aBool3873)
					class246_sub5.method1811(-2212);
			}
			int i_0_ = -11 % ((-87 - i) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.A(" + i + ')');
		}
	}

	static final String method940(boolean bool, BufferStream stream) {
		try {
			if (bool != false)
				method951(null, null, -9, 97, 73);
			anInt2031++;
			return Class40_Sub8.method2211(0, stream, 32767);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.H(" + bool + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final String method941(int i, String string, int i_1_) {
		try {
			anInt2018++;
			if (i < 77)
				method948(null, 87);
			if (aClass85_1992 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_1992.method544((long) i_1_, 125);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.J(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final boolean method942(int i, Interface11 interface11) {
		try {
			anInt2030++;
			int i_2_;
			if (anInt2012 != -1)
				i_2_ = interface11.method35(anInt2012, 0);
			else {
				if (anInt2035 == -1)
					return true;
				i_2_ = interface11.method34((byte) 45, anInt2035);
			}
			if (i != -11247)
				((Class140) this).anInt1994 = 116;
			if ((i_2_ ^ 0xffffffff) > (anInt2020 ^ 0xffffffff) || anInt1993 < i_2_)
				return false;
			boolean bool = false;
			int i_3_;
			if (anInt2002 == -1) {
				if ((anInt2001 ^ 0xffffffff) == 0)
					return true;
				i_3_ = interface11.method34((byte) 45, anInt2001);
			} else
				i_3_ = interface11.method35(anInt2002, 0);
			if ((anInt2025 ^ 0xffffffff) < (i_3_ ^ 0xffffffff) || anInt2011 < i_3_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.I(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')');
		}
	}

	final int method943(int i, int i_4_, int i_5_) {
		try {
			anInt2033++;
			if (aClass85_1992 == null)
				return i_4_;
			IntegerNode class246_sub33 = (IntegerNode) aClass85_1992.method544((long) i_5_, 127);
			if (i < 47)
				method950((byte) 119);
			if (class246_sub33 == null)
				return i_4_;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.E(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final Class_l method944(int i, Class260 class260) {
		try {
			anInt2019++;
			Class_l class_l = (Class_l) (((Class165) ((Class140) this).aClass165_2009).aClass54_2337.method379((long) (anInt2004 | 0x20000 | ((Class260) class260).anInt3719 << 29), (byte) 58));
			if (class_l != null)
				return class_l;
			((Class165) ((Class140) this).aClass165_2009).aClass_fs2327.method112(-1, anInt2004);
			if (i < 64)
				return null;
			Class10 class10 = Class10.method120((((Class165) (((Class140) this).aClass165_2009)).aClass_fs2327), anInt2004, 0);
			if (class10 != null) {
				class_l = class260.method1749(class10, true);
				((Class165) ((Class140) this).aClass165_2009).aClass54_2337.method371(1, (long) (((Class260) class260).anInt3719 << 29 | (anInt2004 | 0x20000)), class_l);
			}
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.K(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method945(byte i) {
		try {
			if (((Class140) this).anIntArray2027 != null) {
				for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class140) this).anIntArray2027.length ^ 0xffffffff)); i_6_ += 2) {
					if ((((Class140) this).anInt2038 ^ 0xffffffff) >= (((Class140) this).anIntArray2027[i_6_] ^ 0xffffffff)) {
						if ((((Class140) this).anInt2032 ^ 0xffffffff) > (((Class140) this).anIntArray2027[i_6_] ^ 0xffffffff))
							((Class140) this).anInt2032 = ((Class140) this).anIntArray2027[i_6_];
					} else
						((Class140) this).anInt2038 = ((Class140) this).anIntArray2027[i_6_];
					if (((Class140) this).anInt2008 <= ((Class140) this).anIntArray2027[i_6_ + 1]) {
						if (((Class140) this).anIntArray2027[1 + i_6_] > ((Class140) this).anInt2021)
							((Class140) this).anInt2021 = ((Class140) this).anIntArray2027[i_6_ + 1];
					} else
						((Class140) this).anInt2008 = ((Class140) this).anIntArray2027[i_6_ + 1];
				}
			}
			if (i != 45)
				method945((byte) -113);
			anInt2015++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.B(" + i + ')');
		}
	}

	static final void method946(byte[] is, float f, float f_7_, int i, int i_8_, int i_9_, float f_10_, float f_11_, int i_12_, int i_13_, int i_14_, float f_15_, Class64 class64) {
		try {
			anInt1989++;
			if (i_13_ > 0) {
				for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
					Class196.method1279(i_9_, i_8_, i_12_, f_7_, class64, f, f_11_, is, i_14_, i_16_, f_15_, i, f_10_, false);
					i += i_9_ * i_8_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.F(" + (is != null ? "{...}" : "null") + ',' + f + ',' + f_7_ + ',' + i + ',' + i_8_ + ',' + i_9_ + ',' + f_10_ + ',' + f_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + f_15_ + ',' + (class64 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method947(BufferStream stream, byte i, int i_17_) {
		try {
			anInt1990++;
			int i_18_ = 69 / ((82 - i) / 32);
			if ((i_17_ ^ 0xffffffff) != -2) {
				if ((i_17_ ^ 0xffffffff) != -3) {
					if (i_17_ != 3) {
						if ((i_17_ ^ 0xffffffff) != -5) {
							if ((i_17_ ^ 0xffffffff) == -6)
								((Class140) this).anInt1999 = stream.read24BitInteger((byte) 29);
							else if ((i_17_ ^ 0xffffffff) != -7) {
								if (i_17_ != 7) {
									if (i_17_ != 8) {
										if (i_17_ == 9) {
											anInt2035 = stream.readUnsignedShort((byte) 107);
											if (anInt2035 == 65535)
												anInt2035 = -1;
											anInt2012 = stream.readUnsignedShort((byte) 98);
											if ((anInt2012 ^ 0xffffffff) == -65536)
												anInt2012 = -1;
											anInt2020 = stream.readInt((byte) 125);
											anInt1993 = stream.readInt((byte) 84);
										} else if ((i_17_ ^ 0xffffffff) > -11 || ((i_17_ ^ 0xffffffff) < -15)) {
											if (i_17_ != 15) {
												if ((i_17_ ^ 0xffffffff) != -17) {
													if ((i_17_ ^ 0xffffffff) != -18) {
														if (i_17_ != 18) {
															if ((i_17_ ^ 0xffffffff) != -20) {
																if (i_17_ == 20) {
																	anInt2001 = (stream.readUnsignedShort((byte) -84));
																	if (anInt2001 == 65535)
																		anInt2001 = -1;
																	anInt2002 = (stream.readUnsignedShort((byte) -45));
																	if (anInt2002 == 65535)
																		anInt2002 = -1;
																	anInt2025 = (stream.readInt((byte) 77));
																	anInt2011 = (stream.readInt((byte) 88));
																} else if (i_17_ == 21)
																	((Class140) this).anInt1997 = (stream.readInt((byte) 85));
																else if (i_17_ == 22)
																	((Class140) this).anInt2013 = (stream.readInt((byte) 88));
																else if ((i_17_ ^ 0xffffffff) == -250) {
																	int i_19_ = (stream.readUnsignedByte(255));
																	if (aClass85_1992 == null) {
																		int i_20_ = Class206.method1350(i_19_, 269173057);
																		aClass85_1992 = new Class85(i_20_);
																	}
																	for (int i_21_ = 0; (i_21_ < i_19_); i_21_++) {
																		boolean bool = stream.readUnsignedByte(255) == 1;
																		int i_22_ = stream.read24BitInteger((byte) 29);
																		Node class246;
																		if (bool)
																			class246 = new Class246_Sub4(stream.readString((byte) -40));
																		else
																			class246 = new IntegerNode(stream.readInt((byte) 85));
																		aClass85_1992.method547((long) i_22_, -2301, class246);
																	}
																}
															} else
																((Class140) this).anInt2014 = (stream.readUnsignedShort((byte) -42));
														} else
															anInt2004 = (stream.readUnsignedShort((byte) 127));
													} else
														((Class140) this).aString2016 = (stream.readString((byte) -40));
												} else
													((Class140) this).aBool1991 = false;
											} else {
												int i_23_ = stream.readUnsignedByte(255);
												((Class140) this).anIntArray2027 = new int[i_23_ * 2];
												for (int i_24_ = 0; ((2 * i_23_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++)
													((Class140) this).anIntArray2027[i_24_] = (stream.method2375((byte) 1));
												((Class140) this).anInt2000 = (stream.readInt((byte) 75));
												((Class140) this).anInt2023 = (stream.readInt((byte) 116));
											}
										} else
											((Class140) this).aStringArray2029[i_17_ - 10] = stream.readString((byte) -40);
									} else
										((Class140) this).aBool2037 = stream.readUnsignedByte(255) == 1;
								} else {
									int i_25_ = stream.readUnsignedByte(255);
									if ((i_25_ & 0x1) == 0)
										((Class140) this).aBool1996 = false;
									if ((0x2 & i_25_ ^ 0xffffffff) == -3)
										((Class140) this).aBool2028 = true;
								}
							} else
								((Class140) this).anInt1994 = stream.readUnsignedByte(255);
						} else
							((Class140) this).anInt2022 = stream.read24BitInteger((byte) 29);
					} else
						((Class140) this).aString1998 = stream.readString((byte) -40);
				} else
					((Class140) this).anInt2005 = stream.readUnsignedShort((byte) 108);
			} else
				((Class140) this).anInt2026 = stream.readUnsignedShort((byte) -124);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.L(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ')'));
		}
	}

	final void method948(BufferStream stream, int i) {
		try {
			anInt2003++;
			for (;;) {
				int i_26_ = stream.readUnsignedByte(255);
				if (i_26_ == 0)
					break;
				method947(stream, (byte) 120, i_26_);
			}
			int i_27_ = -1 % ((66 - i) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class_l method949(Class260 class260, boolean bool, byte i) {
		try {
			anInt1995++;
			int i_28_ = (!bool ? ((Class140) this).anInt2026 : ((Class140) this).anInt2005);
			int i_29_ = i_28_ | ((Class260) class260).anInt3719 << 29;
			if (i < 44)
				return null;
			Class_l class_l = ((Class_l) ((Class165) ((Class140) this).aClass165_2009).aClass54_2337.method379((long) i_29_, (byte) 58));
			if (class_l != null)
				return class_l;
			if (!((Class165) ((Class140) this).aClass165_2009).aClass_fs2327.method112(-1, i_28_))
				return null;
			Class10 class10 = Class10.method120((((Class165) (((Class140) this).aClass165_2009)).aClass_fs2327), i_28_, 0);
			if (class10 != null) {
				class_l = class260.method1749(class10, true);
				((Class165) ((Class140) this).aClass165_2009).aClass54_2337.method371(1, (long) i_29_, class_l);
			}
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nf.N(" + (class260 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}

	public static void method950(byte i) {
		try {
			aClass13_2040 = null;
			SWITCH_INTERFACE_COMPONENTS_OUT = null;
			aClass_c2007 = null;
			aClass67_2010 = null;
			aClass242_2036 = null;
			if (i < 54)
				aClass13_2040 = null;
			aClass54_2034 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.D(" + i + ')');
		}
	}

	static final void method951(Class260 class260, Class59 class59, int i, int i_30_, int i_31_) {
		if (i_30_ < Class240.anInt3377) {
			Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_30_ + 1][i_31_];
			if (class147 != null && ((Class147) class147).aClass59_Sub1_2156 != null && ((Class147) class147).aClass59_Sub1_2156.method406((byte) 118))
				class59.method405(0, Class246_Sub1.anInt3744, ((Class147) class147).aClass59_Sub1_2156, (byte) -99, true, class260, 0);
		}
		if (i_31_ < Class240.anInt3377) {
			Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_30_][i_31_ + 1];
			if (class147 != null && ((Class147) class147).aClass59_Sub1_2156 != null && ((Class147) class147).aClass59_Sub1_2156.method406((byte) 114))
				class59.method405(Class246_Sub1.anInt3744, 0, ((Class147) class147).aClass59_Sub1_2156, (byte) -99, true, class260, 0);
		}
		if (i_30_ < Class240.anInt3377 && i_31_ < Class_t_Sub1.f_sc) {
			Class147 class147 = (Class106.aClass147ArrayArrayArray1494[i][i_30_ + 1][i_31_ + 1]);
			if (class147 != null && ((Class147) class147).aClass59_Sub1_2156 != null && ((Class147) class147).aClass59_Sub1_2156.method406((byte) 117))
				class59.method405(Class246_Sub1.anInt3744, Class246_Sub1.anInt3744, ((Class147) class147).aClass59_Sub1_2156, (byte) -99, true, class260, 0);
		}
		if (i_30_ < Class240.anInt3377 && i_31_ > 0) {
			Class147 class147 = (Class106.aClass147ArrayArrayArray1494[i][i_30_ + 1][i_31_ - 1]);
			if (class147 != null && ((Class147) class147).aClass59_Sub1_2156 != null && ((Class147) class147).aClass59_Sub1_2156.method406((byte) 105))
				class59.method405(-Class246_Sub1.anInt3744, Class246_Sub1.anInt3744, ((Class147) class147).aClass59_Sub1_2156, (byte) -99, true, class260, 0);
		}
	}

	static final void method952(byte i) {
		try {
			if (i < 3)
				method952((byte) 33);
			anInt2039++;
			Class168.aBool2394 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nf.M(" + i + ')');
		}
	}

	public Class140() {
		anInt2002 = -1;
		((Class140) this).anInt1999 = -1;
		((Class140) this).anInt2008 = 2147483647;
		anInt2012 = -1;
		((Class140) this).anInt2014 = -1;
		anInt2001 = -1;
		((Class140) this).aBool1996 = true;
		((Class140) this).anInt2021 = -2147483648;
		anInt2004 = -1;
		((Class140) this).aBool2028 = false;
		anInt2035 = -1;
		((Class140) this).anInt2026 = -1;
		((Class140) this).anInt2032 = -2147483648;
		((Class140) this).aStringArray2029 = new String[5];
		((Class140) this).aBool2037 = true;
		((Class140) this).anInt2038 = 2147483647;
	}
}
