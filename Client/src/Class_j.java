/* Class_j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_j {
	int anInt1471;
	int anInt1472;
	int anInt1473;
	static int anInt1474;
	short aShort1475;
	byte aByte1476;
	byte aByte1477;
	boolean aBool1478;
	static IncomingPacket aClass13_1479 = new IncomingPacket(48, 3);
	int anInt1480;
	static int anInt1481;
	int anInt1482;
	short aShort1483;
	short aShort1484;
	static int anInt1485 = 0;
	static Class67 aClass67_1486 = new Class67("M", "M", "M", "M");
	static int[] anIntArray1487;
	static Class246_Sub39 aClass246_Sub39_1488;

	static final int method716(String string, int i, int i_0_, int i_1_, int i_2_, byte[] is) {
		try {
			anInt1481++;
			int i_3_ = i_0_ + -i;
			for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				int i_5_ = string.charAt(i_4_ + i);
				if (((i_5_ ^ 0xffffffff) >= -1 || i_5_ >= 128) && (i_5_ < 160 || (i_5_ ^ 0xffffffff) < -256)) {
					if (i_5_ == 8364)
						is[i_1_ - -i_4_] = (byte) -128;
					else if ((i_5_ ^ 0xffffffff) != -8219) {
						if ((i_5_ ^ 0xffffffff) != -403) {
							if (i_5_ != 8222) {
								if (i_5_ == 8230)
									is[i_4_ + i_1_] = (byte) -123;
								else if (i_5_ != 8224) {
									if (i_5_ != 8225) {
										if (i_5_ == 710)
											is[i_1_ - -i_4_] = (byte) -120;
										else if (i_5_ == 8240)
											is[i_1_ + i_4_] = (byte) -119;
										else if (i_5_ == 352)
											is[i_1_ - -i_4_] = (byte) -118;
										else if (i_5_ == 8249)
											is[i_1_ - -i_4_] = (byte) -117;
										else if ((i_5_ ^ 0xffffffff) != -339) {
											if (i_5_ != 381) {
												if ((i_5_ ^ 0xffffffff) != -8217) {
													if (i_5_ == 8217)
														is[i_1_ - -i_4_] = (byte) -110;
													else if ((i_5_ ^ 0xffffffff) != -8221) {
														if ((i_5_ ^ 0xffffffff) != -8222) {
															if ((i_5_ ^ 0xffffffff) == -8227)
																is[i_1_ + i_4_] = (byte) -107;
															else if ((i_5_ ^ 0xffffffff) == -8212)
																is[i_4_ + i_1_] = (byte) -106;
															else if ((i_5_ ^ 0xffffffff) != -8213) {
																if (i_5_ == 732)
																	is[(i_4_ + i_1_)] = (byte) -104;
																else if ((i_5_ ^ 0xffffffff) == -8483)
																	is[(i_4_ + i_1_)] = (byte) -103;
																else if ((i_5_ ^ 0xffffffff) == -354)
																	is[(i_4_ + i_1_)] = (byte) -102;
																else if ((i_5_ ^ 0xffffffff) == -8251)
																	is[(i_4_ + i_1_)] = (byte) -101;
																else if ((i_5_ ^ 0xffffffff) == -340)
																	is[(i_1_ + i_4_)] = (byte) -100;
																else if ((i_5_ ^ 0xffffffff) == -383)
																	is[(i_4_ + i_1_)] = (byte) -98;
																else if ((i_5_ ^ 0xffffffff) == -377)
																	is[(i_4_ + i_1_)] = (byte) -97;
																else
																	is[(i_4_ + i_1_)] = (byte) 63;
															} else
																is[i_1_ + i_4_] = (byte) -105;
														} else
															is[i_4_ + i_1_] = (byte) -108;
													} else
														is[i_4_ + i_1_] = (byte) -109;
												} else
													is[i_4_ + i_1_] = (byte) -111;
											} else
												is[i_4_ + i_1_] = (byte) -114;
										} else
											is[i_4_ + i_1_] = (byte) -116;
									} else
										is[i_1_ - -i_4_] = (byte) -121;
								} else
									is[i_1_ + i_4_] = (byte) -122;
							} else
								is[i_1_ - -i_4_] = (byte) -124;
						} else
							is[i_4_ + i_1_] = (byte) -125;
					} else
						is[i_4_ + i_1_] = (byte) -126;
				} else
					is[i_4_ + i_1_] = (byte) i_5_;
			}
			if (i_2_ >= -37)
				method716(null, -8, -68, -120, 58, null);
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("j.C(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method717(byte i) {
		do {
			try {
				anIntArray1487 = null;
				aClass246_Sub39_1488 = null;
				aClass67_1486 = null;
				aClass13_1479 = null;
				if (i < -26)
					break;
				method717((byte) -101);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "j.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method718(int i, int i_6_) {
		try {
			anInt1474++;
			if (i_6_ >= -47)
				method716(null, 1, 62, -45, 56, null);
			if (i != 2 && (i ^ 0xffffffff) != -4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "j.A(" + i + ',' + i_6_ + ')');
		}
	}

	Class_j(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, boolean bool_15_, int i_16_) {
		try {
			((Class_j) this).anInt1480 = i_7_;
			((Class_j) this).aShort1483 = (short) i_10_;
			((Class_j) this).anInt1472 = i_9_;
			((Class_j) this).anInt1473 = i_16_;
			((Class_j) this).aShort1484 = (short) i_12_;
			((Class_j) this).anInt1471 = i;
			((Class_j) this).aShort1475 = (short) i_11_;
			((Class_j) this).anInt1482 = i_8_;
			((Class_j) this).aByte1477 = (byte) i_13_;
			((Class_j) this).aBool1478 = bool_15_;
			((Class_j) this).aByte1476 = (byte) i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("j.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + bool + ',' + bool_15_ + ',' + i_16_ + ')'));
		}
	}

	static {
		new Class169("", 73);
	}
}
