/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class153 {
	static int anInt2206;
	static Class_fs index11;
	int anInt2208;
	int anInt2209 = -1;
	static int anInt2210;
	int[] anIntArray2211;
	static int anInt2212;

	final void method1013(BufferStream stream, int i) {
		try {
			anInt2206++;
			if (i != -1)
				method1013(null, 22);
			for (;;) {
				int i_0_ = stream.readUnsignedByte(i ^ ~0xff);
				if ((i_0_ ^ 0xffffffff) == -1)
					break;
				method1015(i_0_, 89, stream);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oh.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final byte[] method1014(String string, int i) {
		try {
			anInt2212++;
			int i_1_ = string.length();
			byte[] is = new byte[i_1_];
			int i_2_ = 0;
			if (i != 17952)
				return null;
			for (/**/; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				int i_3_ = string.charAt(i_2_);
				if (i_3_ > 0 && (i_3_ ^ 0xffffffff) > -129 || i_3_ >= 160 && (i_3_ ^ 0xffffffff) >= -256)
					is[i_2_] = (byte) i_3_;
				else if ((i_3_ ^ 0xffffffff) == -8365)
					is[i_2_] = (byte) -128;
				else if ((i_3_ ^ 0xffffffff) == -8219)
					is[i_2_] = (byte) -126;
				else if (i_3_ == 402)
					is[i_2_] = (byte) -125;
				else if ((i_3_ ^ 0xffffffff) != -8223) {
					if ((i_3_ ^ 0xffffffff) != -8231) {
						if (i_3_ != 8224) {
							if ((i_3_ ^ 0xffffffff) == -8226)
								is[i_2_] = (byte) -121;
							else if (i_3_ == 710)
								is[i_2_] = (byte) -120;
							else if ((i_3_ ^ 0xffffffff) == -8241)
								is[i_2_] = (byte) -119;
							else if ((i_3_ ^ 0xffffffff) == -353)
								is[i_2_] = (byte) -118;
							else if (i_3_ != 8249) {
								if (i_3_ != 338) {
									if (i_3_ == 381)
										is[i_2_] = (byte) -114;
									else if (i_3_ == 8216)
										is[i_2_] = (byte) -111;
									else if ((i_3_ ^ 0xffffffff) == -8218)
										is[i_2_] = (byte) -110;
									else if ((i_3_ ^ 0xffffffff) == -8221)
										is[i_2_] = (byte) -109;
									else if ((i_3_ ^ 0xffffffff) != -8222) {
										if ((i_3_ ^ 0xffffffff) != -8227) {
											if (i_3_ != 8211) {
												if ((i_3_ ^ 0xffffffff) == -8213)
													is[i_2_] = (byte) -105;
												else if ((i_3_ ^ 0xffffffff) != -733) {
													if ((i_3_ ^ 0xffffffff) == -8483)
														is[i_2_] = (byte) -103;
													else if ((i_3_ ^ 0xffffffff) == -354)
														is[i_2_] = (byte) -102;
													else if ((i_3_ ^ 0xffffffff) == -8251)
														is[i_2_] = (byte) -101;
													else if ((i_3_ ^ 0xffffffff) == -340)
														is[i_2_] = (byte) -100;
													else if (i_3_ == 382)
														is[i_2_] = (byte) -98;
													else if (i_3_ == 376)
														is[i_2_] = (byte) -97;
													else
														is[i_2_] = (byte) 63;
												} else
													is[i_2_] = (byte) -104;
											} else
												is[i_2_] = (byte) -106;
										} else
											is[i_2_] = (byte) -107;
									} else
										is[i_2_] = (byte) -108;
								} else
									is[i_2_] = (byte) -116;
							} else
								is[i_2_] = (byte) -117;
						} else
							is[i_2_] = (byte) -122;
					} else
						is[i_2_] = (byte) -123;
				} else
					is[i_2_] = (byte) -124;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oh.D(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method1015(int i, int i_4_, BufferStream stream) {
		try {
			if (i_4_ <= 23)
				method1014(null, 59);
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3) {
					((Class153) this).anIntArray2211 = new int[stream.readUnsignedByte(255)];
					for (int i_5_ = 0; ((i_5_ ^ 0xffffffff) > (((Class153) this).anIntArray2211.length ^ 0xffffffff)); i_5_++)
						((Class153) this).anIntArray2211[i_5_] = stream.readUnsignedShort((byte) 115);
				} else if ((i ^ 0xffffffff) == -4)
					((Class153) this).anInt2208 = stream.readUnsignedByte(255);
			} else
				((Class153) this).anInt2209 = stream.readUnsignedShort((byte) -74);
			anInt2210++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oh.B(" + i + ',' + i_4_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1016(int i) {
		try {
			if (i == 13732)
				index11 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oh.A(" + i + ')');
		}
	}

	public Class153() {
		((Class153) this).anInt2208 = -1;
	}
}
