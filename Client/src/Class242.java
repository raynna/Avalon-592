
/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class242 {
	static int anInt3408;
	static int anInt3409;
	static int anInt3410;
	static int anInt3411;
	static int anInt3412;
	static int anInt3413;
	static int anInt3414;
	static int anInt3415;
	static Class135 aClass135_3416 = new Class135();
	private Class217 aClass217_3417 = new Class217();
	static int anInt3418;
	static int anInt3419;
	static int anInt3420;
	static int anInt3421;
	static int anInt3422;
	static int anInt3423;
	static int anInt3424 = 0;
	static int anInt3425;
	private Class217 aClass217_3426 = new Class217();
	private Class217 aClass217_3427 = new Class217();
	private Class217 aClass217_3428 = new Class217();
	private Class6 aClass6_3429;
	private long aLong3430;
	private BufferStream aStream3431 = new BufferStream(4);
	private int anInt3432;
	private BufferStream aStream3433;
	volatile int anInt3434 = 0;
	private byte aByte3435 = 0;
	volatile int anInt3436 = 0;
	private SubIncomingPacket aClass246_Sub1_Sub6_Sub1_3437;

	private final int method1548(byte i) {
		try {
			anInt3410++;
			if (i != 58)
				anInt3432 = -126;
			return (aClass217_3427.method1412(true) - -aClass217_3428.method1412(true));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.H(" + i + ')');
		}
	}

	final boolean method1549(int i) {
		try {
			if (i != 0)
				method1554(33, (byte) 9, (byte) 80, false, -3);
			anInt3411++;
			if (method1558(0) < 20)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.E(" + i + ')');
		}
	}

	final void method1550(int i, Class6 class6, boolean bool) {
		try {
			anInt3420++;
			if (aClass6_3429 != null) {
				try {
					aClass6_3429.method72(false);
				} catch (Exception exception) {
					/* empty */
				}
				aClass6_3429 = null;
			}
			aClass6_3429 = class6;
			method1551((byte) 56);
			method1552(bool, (byte) 61);
			((BufferStream) aStream3433).position = 0;
			aClass246_Sub1_Sub6_Sub1_3437 = null;
			for (;;) {
				SubIncomingPacket class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3426.method1410((byte) 90));
				if (class246_sub1_sub6_sub1 == null)
					break;
				aClass217_3417.method1407(30, class246_sub1_sub6_sub1);
			}
			for (;;) {
				SubIncomingPacket class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3428.method1410((byte) -71));
				if (class246_sub1_sub6_sub1 == null)
					break;
				aClass217_3427.method1407(14, class246_sub1_sub6_sub1);
			}
			if (aByte3435 != 0) {
				try {
					((BufferStream) aStream3431).position = 0;
					aStream3431.writeByte(255, 4);
					aStream3431.writeByte(i ^ 0xff, aByte3435);
					aStream3431.writeShort((byte) 67, 0);
					aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), i ^ 0x7f);
				} catch (IOException ioexception) {
					try {
						aClass6_3429.method72(false);
					} catch (Exception exception) {
						/* empty */
					}
					((Class242) this).anInt3436 = -2;
					((Class242) this).anInt3434++;
					aClass6_3429 = null;
				}
			}
			anInt3432 = i;
			aLong3430 = Class151.time(-91);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vn.N(" + i + ',' + (class6 != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method1551(byte i) {
		try {
			anInt3415++;
			if (aClass6_3429 != null) {
				try {
					((BufferStream) aStream3431).position = 0;
					aStream3431.writeByte(255, 6);
					aStream3431.method2380(-28, 3);
					if (i == 56)
						aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), i + 71);
				} catch (IOException ioexception) {
					try {
						aClass6_3429.method72(false);
					} catch (Exception exception) {
						/* empty */
					}
					aClass6_3429 = null;
					((Class242) this).anInt3434++;
					((Class242) this).anInt3436 = -2;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.B(" + i + ')');
		}
	}

	final void method1552(boolean bool, byte i) {
		try {
			if (i < 4)
				method1560(20);
			anInt3412++;
			if (aClass6_3429 != null) {
				try {
					((BufferStream) aStream3431).position = 0;
					aStream3431.writeByte(255, bool ? 2 : 3);
					aStream3431.method2380(-86, 0);
					aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), 126);
				} catch (IOException ioexception) {
					try {
						aClass6_3429.method72(false);
					} catch (Exception exception) {
						/* empty */
					}
					((Class242) this).anInt3436 = -2;
					aClass6_3429 = null;
					((Class242) this).anInt3434++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.J(" + bool + ',' + i + ')');
		}
	}

	final void method1553(byte i) {
		try {
			anInt3414++;
			try {
				aClass6_3429.method72(false);
			} catch (Exception exception) {
				/* empty */
			}
			aClass6_3429 = null;
			((Class242) this).anInt3436 = -1;
			aByte3435 = (byte) (int) (1.0 + Math.random() * 255.0);
			((Class242) this).anInt3434++;
			int i_0_ = 110 / ((i - 26) / 60);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.F(" + i + ')');
		}
	}

	final SubIncomingPacket method1554(int i, byte i_1_, byte i_2_, boolean bool, int i_3_) {
		try {
			anInt3418++;
			int i_4_ = 78 / ((i_2_ + 8) / 37);
			long l = (long) ((i << 16) - -i_3_);
			SubIncomingPacket class246_sub1_sub6_sub1 = new SubIncomingPacket();
			((Class246_Sub1) class246_sub1_sub6_sub1).aLong3739 = l;
			((Class246_Sub1_Sub6) class246_sub1_sub6_sub1).aBool5964 = bool;
			((SubIncomingPacket) class246_sub1_sub6_sub1).aByte7092 = i_1_;
			do {
				if (bool) {
					if ((method1558(0) ^ 0xffffffff) <= -21)
						throw new RuntimeException();
					aClass217_3417.method1407(-126, class246_sub1_sub6_sub1);
					if (!client.f_ob)
						break;
				}
				if ((method1548((byte) 58) ^ 0xffffffff) <= -21)
					throw new RuntimeException();
				aClass217_3427.method1407(-13, class246_sub1_sub6_sub1);
			} while (false);
			return class246_sub1_sub6_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vn.L(" + i + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + i_3_ + ')'));
		}
	}

	final void method1555(byte i) {
		try {
			if (aClass6_3429 != null)
				aClass6_3429.method66(0);
			int i_5_ = 76 / ((14 - i) / 35);
			anInt3423++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.C(" + i + ')');
		}
	}

	final void method1556(byte i) {
		do {
			try {
				anInt3422++;
				if (aClass6_3429 != null) {
					try {
						((BufferStream) aStream3431).position = 0;
						aStream3431.writeByte(255, 7);
						aStream3431.method2380(-14, 0);
						aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), 126);
					} catch (IOException ioexception) {
						try {
							aClass6_3429.method72(false);
						} catch (Exception exception) {
							/* empty */
						}
						((Class242) this).anInt3436 = -2;
						aClass6_3429 = null;
						((Class242) this).anInt3434++;
					}
					if (i == -81)
						break;
					method1553((byte) 64);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vn.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1557(int i) {
		try {
			anInt3413++;
			if (aClass6_3429 != null) {
				long l = Class151.time(-113);
				int i_6_ = (int) (-aLong3430 + l);
				aLong3430 = l;
				if (i_6_ > 200)
					i_6_ = 200;
				anInt3432 += i_6_;
				if (anInt3432 > 30000) {
					try {
						aClass6_3429.method72(false);
					} catch (Exception exception) {
						/* empty */
					}
					aClass6_3429 = null;
				}
			}
			if (aClass6_3429 == null) {
				if ((method1558(0) ^ 0xffffffff) == -1 && (method1548((byte) 58) ^ 0xffffffff) == -1)
					return true;
				return false;
			}
			try {
				aClass6_3429.method75(-2);
				for (SubIncomingPacket class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3417.method1408((byte) 87)); class246_sub1_sub6_sub1 != null; class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3417.method1411(true))) {
					((BufferStream) aStream3431).position = 0;
					aStream3431.writeByte(255, 1);
					aStream3431.method2380(-77, (int) (((Class246_Sub1) class246_sub1_sub6_sub1).aLong3739));
					aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), 127);
					aClass217_3426.method1407(-114, class246_sub1_sub6_sub1);
				}
				for (SubIncomingPacket class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3427.method1408((byte) 87)); class246_sub1_sub6_sub1 != null; class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3427.method1411(true))) {
					((BufferStream) aStream3431).position = 0;
					aStream3431.writeByte(255, 0);
					aStream3431.method2380(-41, (int) (((Class246_Sub1) class246_sub1_sub6_sub1).aLong3739));
					aClass6_3429.method76(4, 0, (((BufferStream) aStream3431).buffer), 127);
					aClass217_3428.method1407(-117, class246_sub1_sub6_sub1);
				}
				if (i > -40)
					aLong3430 = -111L;
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -101; i_7_++) {
					int i_8_ = aClass6_3429.method67(3);
					if (i_8_ < 0)
						throw new IOException();
					if (i_8_ == 0)
						break;
					anInt3432 = 0;
					int i_9_ = 0;
					if (aClass246_Sub1_Sub6_Sub1_3437 == null)
						i_9_ = 8;
					else if ((((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 ^ 0xffffffff) == -1)
						i_9_ = 1;
					if (i_9_ <= 0) {
						int i_10_ = (-((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aByte7092 + (((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).buffer).length);
						int i_11_ = (-((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 + 512);
						if ((i_10_ - ((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position ^ 0xffffffff) > (i_11_ ^ 0xffffffff))
							i_11_ = i_10_ - ((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position;
						if ((i_11_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
							i_11_ = i_8_;
						aClass6_3429.method65(((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position, (byte) 113, i_11_, ((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).buffer);
						if ((aByte3435 ^ 0xffffffff) != -1) {
							for (int i_12_ = 0; (i_11_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
								((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).buffer[i_12_ + ((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position] = (byte) (Class93.method599((((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).buffer[(i_12_ + ((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position)]), aByte3435));
						}
						((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position += i_11_;
						((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 += i_11_;
						if (((BufferStream) (((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089)).position == i_10_) {
							aClass246_Sub1_Sub6_Sub1_3437.method1756((byte) 59);
							((Class246_Sub1_Sub6) aClass246_Sub1_Sub6_Sub1_3437).aBool5960 = false;
							aClass246_Sub1_Sub6_Sub1_3437 = null;
						} else if ((((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 ^ 0xffffffff) == -513)
							((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 = 0;
					} else {
						int i_13_ = i_9_ - ((BufferStream) aStream3433).position;
						if ((i_13_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
							i_13_ = i_8_;
						aClass6_3429.method65(((BufferStream) aStream3433).position, (byte) 113, i_13_, (((BufferStream) aStream3433).buffer));
						if (aByte3435 != 0) {
							for (int i_14_ = 0; (i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
								((BufferStream) aStream3433).buffer[((BufferStream) aStream3433).position + i_14_] = (byte) (Class93.method599((((BufferStream) aStream3433).buffer[(((BufferStream) aStream3433).position + i_14_)]), aByte3435));
						}
						((BufferStream) aStream3433).position += i_13_;
						if ((i_9_ ^ 0xffffffff) >= (((BufferStream) aStream3433).position ^ 0xffffffff)) {
							if (aClass246_Sub1_Sub6_Sub1_3437 == null) {
								((BufferStream) aStream3433).position = 0;
								int i_15_ = aStream3433.readUnsignedByte(255);
								int i_16_ = aStream3433.readUnsignedShort((byte) -95);
								int i_17_ = aStream3433.readUnsignedByte(255);
								int i_18_ = aStream3433.readInt((byte) 77);
								int i_19_ = 0x7f & i_17_;
								boolean bool = (0x80 & i_17_ ^ 0xffffffff) != -1;
								long l = (long) ((i_15_ << 16) + i_16_);
								Object object = null;
								SubIncomingPacket class246_sub1_sub6_sub1;
								if (!bool) {
									for (class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3426.method1408((byte) 87)); class246_sub1_sub6_sub1 != null; class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3426.method1411(true))) {
										if (((Class246_Sub1) class246_sub1_sub6_sub1).aLong3739 == l)
											break;
									}
								} else {
									for (class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3428.method1408((byte) 87)); class246_sub1_sub6_sub1 != null; class246_sub1_sub6_sub1 = ((SubIncomingPacket) aClass217_3428.method1411(true))) {
										if (((Class246_Sub1) class246_sub1_sub6_sub1).aLong3739 == l)
											break;
									}
								}
								if (class246_sub1_sub6_sub1 == null)
									throw new IOException();
								int i_20_ = i_19_ == 0 ? 5 : 9;
								aClass246_Sub1_Sub6_Sub1_3437 = class246_sub1_sub6_sub1;
								((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089 = (new BufferStream(i_20_ + i_18_ - -(((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aByte7092)));
								((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089.writeByte(255, i_19_);
								((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).aStream7089.writeInt(i_18_, (byte) 120);
								((BufferStream) aStream3433).position = 0;
								((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 = 8;
							} else if ((((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090) == 0) {
								if (((BufferStream) aStream3433).buffer[0] != -1)
									aClass246_Sub1_Sub6_Sub1_3437 = null;
								else {
									((SubIncomingPacket) aClass246_Sub1_Sub6_Sub1_3437).anInt7090 = 1;
									((BufferStream) aStream3433).position = 0;
								}
							} else
								throw new IOException();
						}
					}
				}
				return true;
			} catch (IOException ioexception) {
				try {
					aClass6_3429.method72(false);
				} catch (Exception exception) {
					/* empty */
				}
				((Class242) this).anInt3434++;
				((Class242) this).anInt3436 = -2;
				aClass6_3429 = null;
				if (method1558(0) == 0 && method1548((byte) 58) == 0)
					return true;
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.K(" + i + ')');
		}
	}

	final int method1558(int i) {
		try {
			if (i != 0)
				method1548((byte) -36);
			anInt3409++;
			return (aClass217_3417.method1412(true) + aClass217_3426.method1412(true));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.I(" + i + ')');
		}
	}

	static final boolean method1559(int i, int i_21_) {
		try {
			if (i <= 121)
				anInt3424 = 12;
			anInt3419++;
			if ((i_21_ ^ 0xffffffff) > -5 || i_21_ > 8)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.M(" + i + ',' + i_21_ + ')');
		}
	}

	public static void method1560(int i) {
		do {
			try {
				aClass135_3416 = null;
				if (i == -15604)
					break;
				method1562(null, -27);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vn.O(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1561(byte i) {
		try {
			if (i != -46)
				return false;
			anInt3421++;
			if ((method1548((byte) 58) ^ 0xffffffff) > -21)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.P(" + i + ')');
		}
	}

	static final boolean method1562(Class140 class140, int i) {
		try {
			anInt3425++;
			if (class140 == null)
				return false;
			if (!((Class140) class140).aBool1996)
				return false;
			if (!class140.method942(i - 11249, Class79.anInterface11_1025))
				return false;
			if (Class246_Sub28_Sub11.aClass85_6164.method544((long) ((Class140) class140).anInt2006, 127) != null)
				return false;
			if (Class40_Sub1.aClass85_3776.method544((long) ((Class140) class140).anInt2014, 126) != null)
				return false;
			if (i != 2)
				method1559(114, -84);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vn.G(" + (class140 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1563(int i) {
		do {
			try {
				if (i != 228742352)
					aByte3435 = (byte) -102;
				anInt3408++;
				if (aClass6_3429 == null)
					break;
				aClass6_3429.method72(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vn.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class242() {
		aStream3433 = new BufferStream(8);
	}
}
