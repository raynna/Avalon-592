/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84 {
	static int anInt1091;
	private int[][] anIntArrayArray1092;
	private int[] anIntArray1093;
	private int[] anIntArray1094;
	static int anInt1095;
	private int[] anIntArray1096;
	static HashMap aClass54_1097;
	static int anInt1098;
	private Class85 aClass85_1099;
	private String[] aStringArray1100;
	private int[] anIntArray1101;
	private String aString1102;
	private int[] anIntArray1103;
	private int[] anIntArray1104;
	static int anInt1105;
	private String aString1106;
	int anInt1107 = -1;
	private int[] anIntArray1108;
	private int[][] anIntArrayArray1109;
	private int[] anIntArray1110;
	private int[][] anIntArrayArray1111;
	static int anInt1112;
	private String[] aStringArray1113;
	static int anInt1114;

	public static void method533(byte i) {
		try {
			if (i != -82)
				aClass54_1097 = null;
			aClass54_1097 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hv.G(" + i + ')');
		}
	}

	final void method534(int i) {
		try {
			if (aString1106 == null)
				aString1106 = aString1102;
			if (i > -7)
				((Class84) this).anInt1107 = -108;
			anInt1095++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hv.D(" + i + ')');
		}
	}

	static final boolean method535(byte i) {
		try {
			anInt1105++;
			Class246_Sub35 class246_sub35 = ((Class246_Sub35) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev);
			if (i != -20)
				aClass54_1097 = null;
			if (class246_sub35 == null || (class246_sub35 == ((Class166) Class108.aClass166_1525).aClass246_2343))
				return false;
			if ((((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) <= -2001)
				((Class246_Sub35) class246_sub35).anInt5156 -= 2000;
			if (((Class246_Sub35) class246_sub35).anInt5156 == 1002)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hv.E(" + i + ')');
		}
	}

	static final int method536(int i, int i_0_, int i_1_) {
		try {
			anInt1114++;
			int i_2_ = i_0_;
			for (/**/; i_1_ > 1; i_1_ >>= 1) {
				if ((i_1_ & 0x1 ^ 0xffffffff) != -1)
					i_2_ *= i;
				i *= i;
			}
			if ((i_1_ ^ 0xffffffff) == -2)
				return i * i_2_;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hv.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method537(byte i, BufferStream stream) {
		do {
			try {
				for (;;) {
					int i_3_ = stream.readUnsignedByte(255);
					if (i_3_ == 0)
						break;
					method539(stream, i_3_, 49);
				}
				anInt1112++;
				if (i <= 0)
					break;
				method534(21);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("hv.F(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class246_Sub28 method538(BufferStream stream, byte i) {
		try {
			stream.readUnsignedByte(255);
			anInt1098++;
			if (i >= -120)
				method536(25, -18, 115);
			int i_4_ = stream.readUnsignedByte(255);
			Class246_Sub28 class246_sub28 = Class40_Sub1.method1770(i_4_, 35);
			((Class246_Sub28) class246_sub28).anInt4932 = stream.readUnsignedByte(255);
			int i_5_ = stream.readUnsignedByte(255);
			for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				int i_7_ = stream.readUnsignedByte(255);
				class246_sub28.method2143(4, i_7_, stream);
			}
			class246_sub28.method2134(false);
			return class246_sub28;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hv.B(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method539(BufferStream stream, int i, int i_8_) {
		try {
			anInt1091++;
			if (i_8_ <= 45)
				method537((byte) 34, null);
			if ((i ^ 0xffffffff) == -2)
				aString1102 = stream.method2360(32);
			else if ((i ^ 0xffffffff) == -3)
				aString1106 = stream.method2360(82);
			else if ((i ^ 0xffffffff) != -4) {
				if (i != 4) {
					if ((i ^ 0xffffffff) == -6)
						stream.readUnsignedShort((byte) -29);
					else if ((i ^ 0xffffffff) != -7) {
						if ((i ^ 0xffffffff) == -8)
							stream.readUnsignedByte(255);
						else if (i != 8) {
							if ((i ^ 0xffffffff) != -10) {
								if (i == 10) {
									int i_9_ = stream.readUnsignedByte(255);
									anIntArray1110 = new int[i_9_];
									for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
										anIntArray1110[i_10_] = stream.readInt((byte) 97);
								} else if (i == 12)
									stream.readInt((byte) 82);
								else if ((i ^ 0xffffffff) != -14) {
									if (i == 14) {
										int i_11_ = stream.readUnsignedByte(255);
										anIntArrayArray1111 = new int[i_11_][2];
										for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)); i_12_++) {
											anIntArrayArray1111[i_12_][0] = stream.readUnsignedByte(255);
											anIntArrayArray1111[i_12_][1] = stream.readUnsignedByte(255);
										}
									} else if (i == 15)
										stream.readUnsignedShort((byte) -90);
									else if ((i ^ 0xffffffff) == -18)
										((Class84) this).anInt1107 = stream.readUnsignedShort((byte) 108);
									else if ((i ^ 0xffffffff) != -19) {
										if ((i ^ 0xffffffff) != -20) {
											if (i == 249) {
												int i_13_ = stream.readUnsignedByte(255);
												if (aClass85_1099 == null) {
													int i_14_ = (Class206.method1350(i_13_, 269173057));
													aClass85_1099 = new Class85(i_14_);
												}
												for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)); i_15_++) {
													boolean bool = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
													int i_16_ = (stream.read24BitInteger((byte) 29));
													Node class246;
													if (bool)
														class246 = (new Class246_Sub4(stream.readString((byte) -40)));
													else
														class246 = (new IntegerNode(stream.readInt((byte) 90)));
													aClass85_1099.method547((long) i_16_, -2301, class246);
												}
											}
										} else {
											int i_17_ = stream.readUnsignedByte(255);
											anIntArray1101 = new int[i_17_];
											aStringArray1113 = new String[i_17_];
											anIntArray1103 = new int[i_17_];
											anIntArray1093 = new int[i_17_];
											for (int i_18_ = 0; ((i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++) {
												anIntArray1103[i_18_] = (stream.readInt((byte) 115));
												anIntArray1101[i_18_] = (stream.readInt((byte) 101));
												anIntArray1093[i_18_] = (stream.readInt((byte) 119));
												aStringArray1113[i_18_] = (stream.readString((byte) -40));
											}
										}
									} else {
										int i_19_ = stream.readUnsignedByte(255);
										anIntArray1096 = new int[i_19_];
										aStringArray1100 = new String[i_19_];
										anIntArray1094 = new int[i_19_];
										anIntArray1104 = new int[i_19_];
										for (int i_20_ = 0; ((i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)); i_20_++) {
											anIntArray1104[i_20_] = stream.readInt((byte) 86);
											anIntArray1096[i_20_] = stream.readInt((byte) 110);
											anIntArray1094[i_20_] = stream.readInt((byte) 73);
											aStringArray1100[i_20_] = stream.readString((byte) -40);
										}
									}
								} else {
									int i_21_ = stream.readUnsignedByte(255);
									anIntArray1108 = new int[i_21_];
									for (int i_22_ = 0; ((i_21_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)); i_22_++)
										anIntArray1108[i_22_] = stream.readUnsignedShort((byte) -117);
								}
							} else
								stream.readUnsignedByte(255);
						}
					} else
						stream.readUnsignedByte(255);
				} else {
					int i_23_ = stream.readUnsignedByte(255);
					anIntArrayArray1109 = new int[i_23_][3];
					for (int i_24_ = 0; i_23_ > i_24_; i_24_++) {
						anIntArrayArray1109[i_24_][0] = stream.readUnsignedShort((byte) -84);
						anIntArrayArray1109[i_24_][1] = stream.readInt((byte) 127);
						anIntArrayArray1109[i_24_][2] = stream.readInt((byte) 115);
					}
				}
			} else {
				int i_25_ = stream.readUnsignedByte(255);
				anIntArrayArray1092 = new int[i_25_][3];
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
					anIntArrayArray1092[i_26_][0] = stream.readUnsignedShort((byte) -105);
					anIntArrayArray1092[i_26_][1] = stream.readInt((byte) 120);
					anIntArrayArray1092[i_26_][2] = stream.readInt((byte) 120);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hv.A(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')'));
		}
	}

	public Class84() {
		/* empty */
	}

	static {
		new Class67("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
		aClass54_1097 = new HashMap(4);
	}
}
