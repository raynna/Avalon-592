/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class144 {
	private short[] aShortArray2070;
	static int anInt2071;
	private int anInt2072;
	private int anInt2073;
	static int anInt2074 = 0;
	private short[] aShortArray2075;
	byte aByte2076 = 0;
	Class177 aClass177_2077;
	private short[] aShortArray2078;
	static int anInt2079;
	static int anInt2080;
	static int anInt2081;
	static int anInt2082;
	private int anInt2083;
	private int anInt2084;
	static int anInt2085 = 0;
	static int anInt2086;
	boolean aBool2087;
	static Class67 aClass67_2088 = (new Class67("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde..."));
	private int anInt2089;
	static int anInt2090;
	private short[] aShortArray2091;
	int anInt2092;
	private int anInt2093;
	private int anInt2094;
	int anInt2095;
	static int anInt2096 = 1;

	final Class_t method965(int i, int i_0_, Class45 class45, byte i_1_, int i_2_, int i_3_, Class260 class260) {
		try {
			anInt2080++;
			if (i_1_ > -86)
				return null;
			return method971(i, i_3_, class45, 0, null, false, class260, i_2_, (byte) 2, false, i_0_, 0, 0, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.B(" + i + ',' + i_0_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method966(byte i, BufferStream stream) {
		try {
			anInt2079++;
			if (i != 3)
				method968(null, true, -4, -72, null, 127, -67, null, 11, true, null, -99, -41);
			for (;;) {
				int i_4_ = stream.readUnsignedByte(255);
				if (i_4_ == 0)
					break;
				method970((byte) -115, stream, i_4_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method967(byte i) {
		try {
			if (i == -120)
				aClass67_2088 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nm.D(" + i + ')');
		}
	}

	final Class_t method968(Class210 class210, boolean bool, int i, int i_5_, Class260 class260, int i_6_, int i_7_, Class210 class210_8_, int i_9_, boolean bool_10_, Class45 class45, int i_11_, int i_12_) {
		try {
			anInt2071++;
			if (bool_10_ != true)
				return null;
			return method971(i_7_, i_11_, class45, i, class210_8_, bool, class260, i_9_, (byte) 2, false, i_12_, i_5_, i_6_, class210);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.G(" + (class210 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_5_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + (class210_8_ != null ? "{...}" : "null") + ',' + i_9_ + ',' + bool_10_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final Class97[] method969(byte i) {
		try {
			anInt2082++;
			if (i <= 4)
				anInt2096 = 101;
			return (new Class97[] { SubIncomingPacket.aClass97_7088, Class189.aClass97_2666, Class37.aClass97_544 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nm.F(" + i + ')');
		}
	}

	private final void method970(byte i, BufferStream stream, int i_13_) {
		try {
			int i_14_ = 75 / ((i + 39) / 62);
			anInt2090++;
			if (i_13_ == 1)
				anInt2083 = stream.readUnsignedShort((byte) -125);
			else if ((i_13_ ^ 0xffffffff) == -3)
				((Class144) this).anInt2092 = stream.readUnsignedShort((byte) 87);
			else if ((i_13_ ^ 0xffffffff) != -5) {
				if ((i_13_ ^ 0xffffffff) == -6)
					anInt2072 = stream.readUnsignedShort((byte) 116);
				else if (i_13_ == 6)
					anInt2084 = stream.readUnsignedShort((byte) 124);
				else if ((i_13_ ^ 0xffffffff) == -8)
					anInt2089 = stream.readUnsignedByte(255);
				else if ((i_13_ ^ 0xffffffff) != -9) {
					if (i_13_ == 9) {
						((Class144) this).aByte2076 = (byte) 3;
						anInt2094 = 8224;
					} else if ((i_13_ ^ 0xffffffff) == -11)
						((Class144) this).aBool2087 = true;
					else if (i_13_ != 11) {
						if ((i_13_ ^ 0xffffffff) != -13) {
							if (i_13_ != 13) {
								if (i_13_ != 14) {
									if (i_13_ != 15) {
										if (i_13_ == 16) {
											((Class144) this).aByte2076 = (byte) 3;
											anInt2094 = stream.readInt((byte) 127);
										} else if ((i_13_ ^ 0xffffffff) == -41) {
											int i_15_ = stream.readUnsignedByte(255);
											aShortArray2075 = new short[i_15_];
											aShortArray2078 = new short[i_15_];
											for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff)); i_16_++) {
												aShortArray2078[i_16_] = (short) (stream.readUnsignedShort((byte) -52));
												aShortArray2075[i_16_] = (short) (stream.readUnsignedShort((byte) -82));
											}
										} else if ((i_13_ ^ 0xffffffff) == -42) {
											int i_17_ = stream.readUnsignedByte(255);
											aShortArray2070 = new short[i_17_];
											aShortArray2091 = new short[i_17_];
											for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)); i_18_++) {
												aShortArray2070[i_18_] = (short) (stream.readUnsignedShort((byte) -37));
												aShortArray2091[i_18_] = (short) (stream.readUnsignedShort((byte) 87));
											}
										}
									} else {
										((Class144) this).aByte2076 = (byte) 3;
										anInt2094 = stream.readUnsignedShort((byte) -45);
									}
								} else {
									((Class144) this).aByte2076 = (byte) 2;
									anInt2094 = 256 * stream.readUnsignedByte(255);
								}
							} else
								((Class144) this).aByte2076 = (byte) 5;
						} else
							((Class144) this).aByte2076 = (byte) 4;
					} else
						((Class144) this).aByte2076 = (byte) 1;
				} else
					anInt2093 = stream.readUnsignedByte(255);
			} else
				anInt2073 = stream.readUnsignedShort((byte) -36);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.E(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_13_ + ')'));
		}
	}

	private final Class_t method971(int i, int i_19_, Class45 class45, int i_20_, Class210 class210, boolean bool, Class260 class260, int i_21_, byte i_22_, boolean bool_23_, int i_24_, int i_25_, int i_26_, Class210 class210_27_) {
		try {
			anInt2086++;
			int i_28_ = i_19_;
			Class124 class124 = (((Class144) this).anInt2092 != -1 && i != -1 ? class45.method304(3, ((Class144) this).anInt2092) : null);
			bool = bool & ((Class144) this).aByte2076 != 0;
			if (class124 != null)
				i_28_ |= class124.method847(i, 256, i_21_, false);
			if (bool_23_ != false)
				return null;
			if (bool)
				i_28_ = i_28_ | (((Class144) this).aByte2076 == 3 ? 7 : 2);
			if ((anInt2072 ^ 0xffffffff) != -129)
				i_28_ |= 0x2;
			if (anInt2073 != 128 || (anInt2084 ^ 0xffffffff) != -1)
				i_28_ |= 0x5;
			Class_t class_t;
			synchronized (((Class177) ((Class144) this).aClass177_2077).aClass54_2494) {
				class_t = ((Class_t) (((Class177) ((Class144) this).aClass177_2077).aClass54_2494.method379((long) (((Class144) this).anInt2095 |= ((Class260) class260).anInt3719 << 29), (byte) 58)));
			}
			if (class_t == null || (class260.method1710(class_t.P(), i_28_) ^ 0xffffffff) != -1) {
				if (class_t != null)
					i_28_ = class260.method1723(i_28_, class_t.P());
				int i_29_ = i_28_;
				if (aShortArray2078 != null)
					i_29_ |= 0x4000;
				if (aShortArray2070 != null)
					i_29_ |= 0x8000;
				Class103 class103 = Class206.method1349(0, (((Class177) ((Class144) this).aClass177_2077).aClass_fs2484), (byte) 89, anInt2083);
				if (class103 == null)
					return null;
				if (((Class103) class103).anInt1358 < 13)
					class103.method646(0, (byte) -123);
				class_t = class260.method1695(class103, i_29_, (((Class177) (((Class144) this).aClass177_2077)).anInt2497), anInt2089 + 64, 850 + anInt2093);
				if (aShortArray2078 != null) {
					for (int i_30_ = 0; i_30_ < aShortArray2078.length; i_30_++)
						class_t.BA(aShortArray2078[i_30_], aShortArray2075[i_30_]);
				}
				if (aShortArray2070 != null) {
					for (int i_31_ = 0; ((aShortArray2070.length ^ 0xffffffff) < (i_31_ ^ 0xffffffff)); i_31_++)
						class_t.I(aShortArray2070[i_31_], aShortArray2091[i_31_]);
				}
				class_t.UA(i_28_);
				synchronized (((Class177) ((Class144) this).aClass177_2077).aClass54_2494) {
					((Class177) ((Class144) this).aClass177_2077).aClass54_2494.method371(1, (long) (((Class144) this).anInt2095 |= ((Class260) class260).anInt3719 << 29), class_t);
				}
			}
			Class_t class_t_32_ = (class124 != null ? class124.method849(i, i_22_, class_t, i_24_, i_21_, 0, i_28_, 256) : class_t.method678(i_22_, i_28_, true));
			if ((anInt2073 ^ 0xffffffff) != -129 || (anInt2072 ^ 0xffffffff) != -129)
				class_t_32_.H(anInt2073, anInt2072, anInt2073);
			if (anInt2084 != 0) {
				if (anInt2084 == 90)
					class_t_32_.Q(4096);
				if ((anInt2084 ^ 0xffffffff) == -181)
					class_t_32_.Q(8192);
				if (anInt2084 == 270)
					class_t_32_.Q(12288);
			}
			if (bool)
				class_t_32_.h(((Class144) this).aByte2076, anInt2094, class210, class210_27_, i_25_, i_20_, i_26_);
			class_t_32_.UA(i_19_);
			return class_t_32_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.H(" + i + ',' + i_19_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_20_ + ',' + (class210 != null ? "{...}" : "null") + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + bool_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + (class210_27_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class_t method972(Class260 class260, byte i, int i_33_, Class45 class45, int i_34_, int i_35_, int i_36_) {
		try {
			if (i != -53)
				anInt2093 = 17;
			anInt2081++;
			return method971(i_34_, i_35_, class45, 0, null, false, class260, i_36_, (byte) 5, false, i_33_, 0, 0, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nm.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_33_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}

	public Class144() {
		anInt2073 = 128;
		anInt2072 = 128;
		((Class144) this).aBool2087 = false;
		anInt2084 = 0;
		anInt2089 = 0;
		((Class144) this).anInt2092 = -1;
		anInt2093 = 0;
		anInt2094 = -1;
	}
}
