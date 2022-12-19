
/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.io.IOException;

final class Class39_Sub1 extends Class39 {
	static int anInt4667;
	static float aFloat4668;
	static int anInt4669;
	static int anInt4670;
	boolean aBool4671 = false;
	static int[] anIntArray4672;
	static int anInt4673;
	static int anInt4674;
	static int anInt4675;
	static int f_ab;
	static int f_bb;
	boolean f_cb = false;
	static int f_db;
	static int f_eb = 0;
	static int[] f_fb = new int[16384];
	static int[] f_gb;

	final void method2047(Signlink class52, byte i) {
		do {
			try {
				anInt4667++;
				Class192 class192 = null;
				try {
					int i_0_ = -84 / ((i + 37) / 59);
					Class182 class182 = class52.method365((byte) -127, "");
					while (class182.anInt2539 == 0)
						Class247.method1580(1L, -5184);
					if (class182.anInt2539 == 1) {
						class192 = (Class192) class182.anObject2535;
						BufferStream stream = method2054(-114);
						class192.method1265(0, ((BufferStream) stream).position, ((BufferStream) stream).buffer, 1);
					}
				} catch (Exception exception) {
					/* empty */
				}
				try {
					if (class192 == null)
						break;
					class192.method1262(-1);
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jb.K(" + (class52 != null ? "{...}" : "null") + ',' + i + ')'));
			}
		} while (false);
	}

	final boolean method2048(int i, int i_1_) {
		try {
			if (i >= -52)
				return false;
			f_bb++;
			if ((i_1_ ^ 0xffffffff) != -1)
				return true;
			return ((Class39) this).aBool568;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.L(" + i + ',' + i_1_ + ')');
		}
	}

	final int method2049(int i, int i_2_) {
		try {
			int i_3_ = -28 / ((i_2_ - 74) / 46);
			anInt4674++;
			if (((Class39_Sub1) this).f_cb)
				return 0;
			if (!method2052(i, 116))
				return 1;
			if (((Class39) this).aBool608)
				return 2;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.H(" + i + ',' + i_2_ + ')');
		}
	}

	final void method2050(int i, boolean bool) {
		do {
			try {
				((Class39) this).aBool568 = bool;
				anInt4673++;
				if (Class143.aClass251_2067 != null)
					Class143.aClass251_2067.method1612((byte) 114, !method2052(BufferStream.anInt5656, i ^ ~0x71));
				if (i == -2)
					break;
				f_fb = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jb.M(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2051(int i, byte i_4_) {
		try {
			if (Class5.aByteArrayArrayArray56 == null)
				Class5.aByteArrayArrayArray56 = (new byte[4][Class38_Sub1_Sub1.anInt6770][Class152.anInt2205]);
			f_ab++;
			if (i <= -87) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++) {
					for (int i_6_ = 0; ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
						for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff)); i_7_++)
							Class5.aByteArrayArrayArray56[i_5_][i_6_][i_7_] = i_4_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.O(" + i + ',' + i_4_ + ')');
		}
	}

	final boolean method2052(int i, int i_8_) {
		try {
			if (i_8_ <= 104)
				return false;
			anInt4675++;
			if ((i ^ 0xffffffff) != -1 || ((Class39_Sub1) this).aBool4671)
				return true;
			return ((Class39) this).aBool568;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.G(" + i + ',' + i_8_ + ')');
		}
	}

	private final void method2053(BufferStream stream, int i) {
		do {
			try {
				f_db++;
				if (((((BufferStream) stream).buffer.length + -((BufferStream) stream).position) ^ 0xffffffff) <= -2) {
					int i_9_ = stream.readUnsignedByte(255);
					if ((i_9_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) >= -18) {
						int i_10_;
						if (i_9_ != 17) {
							if ((i_9_ ^ 0xffffffff) == -17)
								i_10_ = 38;
							else if ((i_9_ ^ 0xffffffff) != -16) {
								if (i_9_ == 14)
									i_10_ = 36;
								else if ((i_9_ ^ 0xffffffff) == -14)
									i_10_ = 35;
								else if ((i_9_ ^ 0xffffffff) == -13)
									i_10_ = 34;
								else if ((i_9_ ^ 0xffffffff) != -12) {
									if (i_9_ == 10)
										i_10_ = 32;
									else if ((i_9_ ^ 0xffffffff) == -10)
										i_10_ = 31;
									else if ((i_9_ ^ 0xffffffff) != -9) {
										if (i_9_ == 7)
											i_10_ = 29;
										else if ((i_9_ ^ 0xffffffff) != -7) {
											if (i_9_ != 5) {
												if (i_9_ != 4) {
													if (i_9_ != 3) {
														if (i_9_ != 2) {
															if ((i_9_ ^ 0xffffffff) == -2)
																i_10_ = 23;
															else
																i_10_ = 19;
														} else
															i_10_ = 22;
													} else
														i_10_ = 23;
												} else
													i_10_ = 24;
											} else
												i_10_ = 28;
										} else
											i_10_ = 28;
									} else
										i_10_ = 30;
								} else
									i_10_ = 33;
							} else
								i_10_ = 37;
						} else
							i_10_ = 40;
						if (((-((BufferStream) stream).position + ((BufferStream) stream).buffer.length) ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)) {
							((Class39) this).anInt583 = stream.readUnsignedByte(255);
							if (((Class39) this).anInt583 < 1)
								((Class39) this).anInt583 = 1;
							else if ((((Class39) this).anInt583 ^ 0xffffffff) < -5)
								((Class39) this).anInt583 = 4;
							method2050(-2, stream.readUnsignedByte(255) == 1);
							((Class39) this).aBool608 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
							((Class39) this).aBool607 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
							((Class39) this).aBool586 = stream.readUnsignedByte(255) == 1;
							((Class39) this).anInt580 = stream.readUnsignedByte(255) != 1 ? 0 : 1;
							((Class39) this).aBool576 = stream.readUnsignedByte(255) == 1;
							((Class39) this).aBool573 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
							((Class39) this).aBool601 = stream.readUnsignedByte(255) == 1;
							((Class39) this).anInt582 = stream.readUnsignedByte(255);
							if ((((Class39) this).anInt582 ^ 0xffffffff) < -3)
								((Class39) this).anInt582 = 2;
							if ((i_9_ ^ 0xffffffff) <= -18)
								((Class39) this).anInt575 = stream.readUnsignedByte(255);
							if (i_9_ < 2) {
								((Class39) this).aBool593 = ((stream.readUnsignedByte(255) ^ 0xffffffff) == -2);
								stream.readUnsignedByte(255);
							} else {
								((Class39) this).aBool593 = ((stream.readUnsignedByte(255) ^ 0xffffffff) == -2);
								if (i_9_ >= 17)
									((Class39) this).aBool597 = stream.readUnsignedByte(255) == 1;
							}
							((Class39) this).aBool574 = stream.readUnsignedByte(255) == 1;
							((Class39) this).aBool592 = stream.readUnsignedByte(255) == 1;
							((Class39) this).anInt590 = stream.readUnsignedByte(255);
							if ((((Class39) this).anInt590 ^ 0xffffffff) < -3)
								((Class39) this).anInt590 = 2;
							((Class39) this).anInt588 = ((Class39) this).anInt590;
							((Class39) this).aBool570 = stream.readUnsignedByte(255) == 1;
							((Class39) this).anInt602 = stream.readUnsignedByte(255);
							if (((Class39) this).anInt602 > 127)
								((Class39) this).anInt602 = 127;
							((Class39) this).anInt587 = stream.readUnsignedByte(255);
							((Class39) this).anInt603 = stream.readUnsignedByte(255);
							if (((Class39) this).anInt603 > 127)
								((Class39) this).anInt603 = 127;
							if ((i_9_ ^ 0xffffffff) <= -2) {
								((Class39) this).anInt577 = stream.readUnsignedShort((byte) 91);
								((Class39) this).anInt604 = stream.readUnsignedShort((byte) -79);
							}
							if (i_9_ >= 3 && i_9_ < 6)
								stream.readUnsignedByte(255);
							if (i_9_ >= 4) {
								int i_11_ = stream.readUnsignedByte(255);
								if ((i_11_ ^ 0xffffffff) > -1 || i_11_ > 2)
									i_11_ = 0;
								if (Class40_Sub2.anInt4047 < 96)
									i_11_ = 0;
								Class83.method531(i_11_, 9060);
							}
							if (i_9_ >= 5)
								((Class39) this).anInt569 = stream.readInt((byte) 126);
							int i_12_ = -12 / ((i + 27) / 49);
							int i_13_ = 0;
							if ((i_9_ ^ 0xffffffff) <= -7)
								((Class39) this).anInt600 = i_13_ = stream.readUnsignedByte(255);
							if (((Class39) this).anInt600 != 1 && ((Class39) this).anInt600 != 2)
								((Class39) this).anInt600 = 2;
							if ((i_9_ ^ 0xffffffff) <= -8)
								((Class39) this).aBool591 = stream.readUnsignedByte(255) == 1;
							if ((i_9_ ^ 0xffffffff) <= -9)
								((Class39) this).aBool605 = stream.readUnsignedByte(255) == 1;
							if (i_9_ >= 9)
								((Class39) this).anInt581 = stream.readUnsignedByte(255);
							if ((((Class39) this).anInt581 ^ 0xffffffff) > -1 || ((((Class39) this).anInt581 ^ 0xffffffff) < (client.method2969((Class40_Sub2.anInt4047), (byte) 101) ^ 0xffffffff)))
								((Class39) this).anInt581 = 0;
							if (i_9_ >= 10)
								((Class39) this).aBool596 = ((stream.readUnsignedByte(255) ^ 0xffffffff) != -1);
							if ((i_9_ ^ 0xffffffff) <= -12)
								((Class39) this).aBool606 = ((stream.readUnsignedByte(255) ^ 0xffffffff) != -1);
							if (i_9_ >= 12)
								((Class39) this).anInt580 = stream.readUnsignedByte(255);
							if ((((Class39) this).anInt580 ^ 0xffffffff) > -1 || ((Class39) this).anInt580 > 2)
								((Class39) this).anInt580 = 1;
							if (i_9_ >= 13)
								((Class39) this).aBool567 = stream.readUnsignedByte(255) == 1;
							if (i_9_ >= 14)
								((Class39) this).anInt598 = stream.readUnsignedByte(255);
							else if (i_13_ == 0)
								((Class39) this).anInt598 = 2;
							else
								((Class39) this).anInt598 = 1;
							if ((((Class39) this).anInt598 ^ 0xffffffff) > -1 || ((Class39) this).anInt598 > 3)
								((Class39) this).anInt598 = 2;
							if (i_9_ >= 15) {
								((Class39) this).anInt584 = stream.readUnsignedByte(255);
								if (((Class39) this).anInt584 < 0 || ((Class39) this).anInt584 > 4)
									((Class39) this).anInt584 = (RuntimeException_Sub2.anInt7153 == 1 ? 2 : 4);
							}
							if (i_9_ >= 16) {
								((Class39) this).aBool609 = stream.readUnsignedByte(255) == 1;
								try {
									if ((jagmisc.getTotalPhysicalMemory() ^ 0xffffffffffffffffL) >= -268435457L)
										((Class39) this).aBool609 = false;
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (i_9_ >= 17 || ((Class39) this).anInt598 != 0)
								break;
							((Class39) this).anInt598 = 2;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jb.I(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final BufferStream method2054(int i) {
		try {
			anInt4669++;
			BufferStream stream = new BufferStream(41);
			stream.writeByte(255, 17);
			stream.writeByte(255, ((Class39) this).anInt583);
			stream.writeByte(255, ((Class39) this).aBool568 ? 1 : 0);
			if (i >= -60)
				anInt4670 = -20;
			stream.writeByte(255, ((Class39) this).aBool608 ? 1 : 0);
			stream.writeByte(255, !((Class39) this).aBool607 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).aBool586 ? 1 : 0);
			stream.writeByte(255, 0);
			stream.writeByte(255, ((Class39) this).aBool576 ? 1 : 0);
			stream.writeByte(255, !((Class39) this).aBool573 ? 0 : 1);
			stream.writeByte(255, !((Class39) this).aBool601 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).anInt582);
			stream.writeByte(255, ((Class39) this).anInt575);
			stream.writeByte(255, !((Class39) this).aBool593 ? 0 : 1);
			stream.writeByte(255, !((Class39) this).aBool597 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).aBool574 ? 1 : 0);
			stream.writeByte(255, !((Class39) this).aBool592 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).anInt590);
			stream.writeByte(255, !((Class39) this).aBool570 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).anInt602);
			stream.writeByte(255, ((Class39) this).anInt587);
			stream.writeByte(255, ((Class39) this).anInt603);
			stream.writeShort((byte) 67, ((Class39) this).anInt577);
			stream.writeShort((byte) 67, ((Class39) this).anInt604);
			stream.writeByte(255, Class246_Sub1_Sub13.method2699(8458));
			stream.writeInt(((Class39) this).anInt569, (byte) 121);
			stream.writeByte(255, ((Class39) this).anInt600);
			stream.writeByte(255, ((Class39) this).aBool591 ? 1 : 0);
			stream.writeByte(255, ((Class39) this).aBool605 ? 1 : 0);
			stream.writeByte(255, ((Class39) this).anInt581);
			stream.writeByte(255, ((Class39) this).aBool596 ? 1 : 0);
			stream.writeByte(255, !((Class39) this).aBool606 ? 0 : 1);
			stream.writeByte(255, ((Class39) this).anInt580);
			stream.writeByte(255, ((Class39) this).aBool567 ? 1 : 0);
			stream.writeByte(255, ((Class39) this).anInt598);
			stream.writeByte(255, ((Class39) this).anInt584);
			stream.writeByte(255, !((Class39) this).aBool609 ? 0 : 1);
			return stream;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.N(" + i + ')');
		}
	}

	Class39_Sub1(Signlink class52) {
		do {
			try {
				((Class39) this).anInt583 = 3;
				method2050(-2, true);
				((Class39) this).aBool576 = true;
				((Class39) this).aBool573 = true;
				((Class39) this).anInt587 = 255;
				((Class39) this).aBool607 = true;
				((Class39) this).anInt582 = 2;
				((Class39) this).anInt604 = 0;
				((Class39) this).aBool608 = true;
				((Class39) this).anInt603 = 127;
				((Class39) this).aBool592 = true;
				((Class39) this).anInt577 = 0;
				((Class39) this).anInt602 = 127;
				((Class39) this).aBool586 = true;
				((Class39) this).aBool574 = true;
				((Class39) this).anInt588 = 0;
				((Class39) this).anInt590 = 0;
				((Class39) this).anInt575 = 0;
				((Class39) this).aBool593 = true;
				((Class39) this).aBool570 = true;
				((Class39) this).aBool597 = false;
				((Class39) this).aBool601 = true;
				((Class39) this).anInt580 = 1;
				if (Class40_Sub2.anInt4047 >= 96)
					Class83.method531(2, 9060);
				else
					Class83.method531(0, 9060);
				((Class39) this).anInt581 = 0;
				((Class39) this).aBool605 = false;
				((Class39) this).aBool567 = true;
				((Class39) this).aBool606 = true;
				((Class39) this).anInt600 = 2;
				((Class39) this).aBool591 = false;
				((Class39) this).anInt598 = 2;
				((Class39) this).anInt584 = ((RuntimeException_Sub2.anInt7153 ^ 0xffffffff) != -2 ? 4 : 2);
				((Class39) this).anInt569 = 0;
				((Class39) this).aBool596 = false;
				Class192 class192 = null;
				try {
					Class182 class182 = class52.method365((byte) -69, "");
					while (class182.anInt2539 == 0)
						Class247.method1580(1L, -5184);
					if (class182.anInt2539 == 1) {
						class192 = (Class192) class182.anObject2535;
						byte[] is = new byte[(int) class192.method1266(74)];
						int i;
						for (int i_14_ = 0; is.length > i_14_; i_14_ += i) {
							i = class192.method1261(i_14_, -i_14_ + is.length, is, (byte) -119);
							if (i == -1)
								throw new IOException("EOF");
						}
						method2053(new BufferStream(is), 93);
					}
				} catch (Exception exception) {
					/* empty */
				}
				try {
					if (class192 == null)
						break;
					class192.method1262(-1);
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jb.<init>(" + (class52 != null ? "{...}" : "null") + ')');
			}
		} while (false);
	}

	public static void method2055(int i) {
		try {
			f_gb = null;
			f_fb = null;
			if (i != 1)
				method2055(-116);
			anIntArray4672 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jb.J(" + i + ')');
		}
	}

	static {
		anIntArray4672 = new int[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
			f_fb[i] = (int) (Math.sin(d * (double) i) * 32768.0);
			anIntArray4672[i] = (int) (32768.0 * Math.cos((double) i * d));
		}
		f_gb = new int[] { 104, 120, 136, 168 };
	}
}
