
/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.IOException;

class Class123 {
	static int anInt1690;
	static int anInt1691;
	private Class246_Sub37 aClass246_Sub37_1692;
	private int anInt1693 = 32;
	private boolean aBool1694 = false;
	static int anInt1695;
	static int anInt1696;
	private long aLong1697 = Class151.time(-99);
	static int anInt1698;
	static int anInt1699;
	static int anInt1700;
	static int anInt1701;
	static OutgoingPacket aClass201_1702 = new OutgoingPacket(54, 12);
	static int anInt1703;
	static int anInt1704;
	static int anInt1705;
	int[] anIntArray1706;
	static OutgoingPacket WALKING_OUT = new OutgoingPacket(5, 5);
	static int anInt1708;
	static int anInt1709;
	static Class_l aClass_l1710;
	static int anInt1711;
	private int anInt1712 = 0;
	private int anInt1713;
	private int anInt1714;
	int anInt1715;
	private Class246_Sub37[] aClass246_Sub37Array1716 = new Class246_Sub37[8];
	int anInt1717;
	private long aLong1718 = 0L;
	private boolean aBool1719 = true;
	private int anInt1720;
	private long aLong1721;
	private Class246_Sub37[] aClass246_Sub37Array1722;
	private int anInt1723;

	private final void method828(int i, int i_0_) {
		do {
			try {
				if (i_0_ == 1) {
					anInt1695++;
					anInt1714 -= i;
					if (anInt1714 < 0)
						anInt1714 = 0;
					if (aClass246_Sub37_1692 == null)
						break;
					aClass246_Sub37_1692.method2260(i);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ln.A(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	public static void method829(byte i) {
		try {
			WALKING_OUT = null;
			aClass201_1702 = null;
			if (i != -57)
				aClass_l1710 = null;
			aClass_l1710 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.L(" + i + ')');
		}
	}

	final synchronized void method830(int i) {
		do {
			try {
				aBool1719 = true;
				anInt1704++;
				try {
					method838();
				} catch (Exception exception) {
					method837();
					aLong1721 = 2000L + Class151.time(-123);
				}
				if (i == 2000)
					break;
				method834((byte) -2);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ln.N(" + i + ')');
			}
			break;
		} while (false);
	}

	void method831(int i) throws Exception {
		try {
			anInt1701++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.D(" + i + ')');
		}
	}

	void method832(Component component) throws Exception {
		try {
			anInt1696++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.P(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	int method833() throws Exception {
		try {
			anInt1691++;
			return ((Class123) this).anInt1715;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.H(" + ')');
		}
	}

	static final void method834(byte i) {
		do {
			try {
				anInt1699++;
				if (i == 14) {
					Class192 class192 = null;
					try {
						Class182 class182 = Class108.aClass52_1535.method365((byte) -73, "2");
						while (class182.anInt2539 == 0)
							Class247.method1580(1L, -5184);
						if (class182.anInt2539 == 1) {
							class192 = (Class192) class182.anObject2535;
							byte[] is = new byte[(int) class192.method1266(74)];
							int i_1_;
							for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_2_ += i_1_) {
								i_1_ = class192.method1261(i_2_, is.length + -i_2_, is, (byte) -89);
								if ((i_1_ ^ 0xffffffff) == 0)
									throw new IOException("EOF");
							}
							Canvas_Sub1.method2838(-2, new BufferStream(is));
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
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ln.M(" + i + ')');
			}
		} while (false);
	}

	final synchronized void method835(int i) {
		try {
			anInt1703++;
			if (!aBool1694) {
				long l = Class151.time(i ^ ~0x38);
				try {
					if ((l ^ 0xffffffffffffffffL) < (500000L + aLong1697 ^ 0xffffffffffffffffL))
						aLong1697 = l + -500000L;
					for (/**/; ((aLong1697 + 5000L ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)); aLong1697 += (long) (256000 / Class140.anInt2024))
						method828(256, 1);
				} catch (Exception exception) {
					aLong1697 = l;
				}
				if (((Class123) this).anIntArray1706 != null) {
					try {
						if ((long) i != aLong1721) {
							if ((l ^ 0xffffffffffffffffL) > (aLong1721 ^ 0xffffffffffffffffL))
								return;
							method831(((Class123) this).anInt1715);
							aLong1721 = 0L;
							aBool1719 = true;
						}
						int i_3_ = method833();
						if (anInt1712 < -i_3_ + anInt1720)
							anInt1712 = -i_3_ + anInt1720;
						int i_4_ = ((Class123) this).anInt1717 + anInt1713;
						if (i_4_ + 256 > 16384)
							i_4_ = 16128;
						if ((((Class123) this).anInt1715 ^ 0xffffffff) > (i_4_ + 256 ^ 0xffffffff)) {
							((Class123) this).anInt1715 += 1024;
							if (((Class123) this).anInt1715 > 16384)
								((Class123) this).anInt1715 = 16384;
							method837();
							method831(((Class123) this).anInt1715);
							i_3_ = 0;
							aBool1719 = true;
							if ((((Class123) this).anInt1715 ^ 0xffffffff) > (256 + i_4_ ^ 0xffffffff)) {
								i_4_ = -256 + ((Class123) this).anInt1715;
								anInt1713 = i_4_ - ((Class123) this).anInt1717;
							}
						}
						for (/**/; i_3_ < i_4_; i_3_ += 256) {
							method842(((Class123) this).anIntArray1706, 256);
							method839();
						}
						if ((aLong1718 ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
							if (aBool1719)
								aBool1719 = false;
							else {
								if (anInt1712 == 0 && anInt1723 == 0) {
									method837();
									aLong1721 = l - -2000L;
									return;
								}
								anInt1713 = Math.min(anInt1723, anInt1712);
								anInt1723 = anInt1712;
							}
							aLong1718 = 2000L + l;
							anInt1712 = 0;
						}
						anInt1720 = i_3_;
					} catch (Exception exception) {
						method837();
						aLong1721 = 2000L + l;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.C(" + i + ')');
		}
	}

	final synchronized void method836(Class246_Sub37 class246_sub37, byte i) {
		do {
			try {
				anInt1709++;
				aClass246_Sub37_1692 = class246_sub37;
				if (i == -15)
					break;
				aLong1697 = -125L;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ln.F(" + (class246_sub37 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	void method837() {
		try {
			anInt1708++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.J(" + ')');
		}
	}

	void method838() throws Exception {
		try {
			anInt1711++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.I(" + ')');
		}
	}

	void method839() throws Exception {
		try {
			anInt1698++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.K(" + ')');
		}
	}

	final synchronized void method840(int i) {
		try {
			if (i != 12)
				method830(-32);
			anInt1690++;
			if (Class36.aClass215_492 != null) {
				boolean bool = true;
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -3; i_5_++) {
					if ((((Class215) Class36.aClass215_492).aClass123Array3002[i_5_]) == this)
						((Class215) Class36.aClass215_492).aClass123Array3002[i_5_] = null;
					if ((((Class215) Class36.aClass215_492).aClass123Array3002[i_5_]) != null)
						bool = false;
				}
				if (bool) {
					((Class215) Class36.aClass215_492).aBool3000 = true;
					while (((Class215) Class36.aClass215_492).aBool3003)
						Class247.method1580(50L, -5184);
					Class36.aClass215_492 = null;
				}
			}
			method837();
			((Class123) this).anIntArray1706 = null;
			aBool1694 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.G(" + i + ')');
		}
	}

	private final void method841(int i, int i_6_, Class246_Sub37 class246_sub37) {
		try {
			anInt1705++;
			int i_7_ = i_6_ >> 5;
			Class246_Sub37 class246_sub37_8_ = aClass246_Sub37Array1716[i_7_];
			do {
				if (class246_sub37_8_ != null) {
					((Class246_Sub37) class246_sub37_8_).aClass246_Sub37_5322 = class246_sub37;
					if (!client.f_ob)
						break;
				}
				aClass246_Sub37Array1722[i_7_] = class246_sub37;
			} while (false);
			int i_9_ = -106 % ((i - 36) / 55);
			aClass246_Sub37Array1716[i_7_] = class246_sub37;
			((Class246_Sub37) class246_sub37).anInt5321 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ln.O(" + i + ',' + i_6_ + ',' + (class246_sub37 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method842(int[] is, int i) {
		int i_10_ = i;
		if (Class240.aBool3387)
			i_10_ <<= 1;
		Class117.method801(is, 0, i_10_);
		anInt1714 -= i;
		if (aClass246_Sub37_1692 != null && anInt1714 <= 0) {
			anInt1714 += Class140.anInt2024 >> 4;
			Class129.method879(aClass246_Sub37_1692, 7582);
			method841(126, aClass246_Sub37_1692.method2255(), aClass246_Sub37_1692);
			int i_11_ = 0;
			int i_12_ = 255;
			int i_13_ = 7;
			while_20_: while (i_12_ != 0) {
				int i_14_;
				int i_15_;
				if (i_13_ < 0) {
					i_14_ = i_13_ & 0x3;
					i_15_ = -(i_13_ >> 2);
				} else {
					i_14_ = i_13_;
					i_15_ = 0;
				}
				for (int i_16_ = i_12_ >>> i_14_ & 0x11111111; i_16_ != 0; i_16_ >>>= 4) {
					if ((i_16_ & 0x1) != 0) {
						i_12_ &= 1 << i_14_ ^ 0xffffffff;
						Class246_Sub37 class246_sub37 = null;
						Class246_Sub37 class246_sub37_17_ = aClass246_Sub37Array1722[i_14_];
						while (class246_sub37_17_ != null) {
							Class246_Sub3 class246_sub3 = (((Class246_Sub37) class246_sub37_17_).aClass246_Sub3_5324);
							if (class246_sub3 != null && (((Class246_Sub3) class246_sub3).anInt3824 > i_15_)) {
								i_12_ |= 1 << i_14_;
								class246_sub37 = class246_sub37_17_;
								class246_sub37_17_ = (((Class246_Sub37) class246_sub37_17_).aClass246_Sub37_5322);
							} else {
								((Class246_Sub37) class246_sub37_17_).aBool5323 = true;
								int i_18_ = class246_sub37_17_.method2258();
								i_11_ += i_18_;
								if (class246_sub3 != null)
									((Class246_Sub3) class246_sub3).anInt3824 += i_18_;
								if (i_11_ >= anInt1693)
									break while_20_;
								Class246_Sub37 class246_sub37_19_ = class246_sub37_17_.method2259();
								if (class246_sub37_19_ != null) {
									int i_20_ = (((Class246_Sub37) class246_sub37_17_).anInt5321);
									for (/**/; class246_sub37_19_ != null; class246_sub37_19_ = class246_sub37_17_.method2256())
										method841(101, (i_20_ * class246_sub37_19_.method2255() >> 8), class246_sub37_19_);
								}
								Class246_Sub37 class246_sub37_21_ = (((Class246_Sub37) class246_sub37_17_).aClass246_Sub37_5322);
								((Class246_Sub37) class246_sub37_17_).aClass246_Sub37_5322 = null;
								if (class246_sub37 == null)
									aClass246_Sub37Array1722[i_14_] = class246_sub37_21_;
								else
									((Class246_Sub37) class246_sub37).aClass246_Sub37_5322 = class246_sub37_21_;
								if (class246_sub37_21_ == null)
									aClass246_Sub37Array1716[i_14_] = class246_sub37;
								class246_sub37_17_ = class246_sub37_21_;
							}
						}
					}
					i_14_ += 4;
					i_15_++;
				}
				i_13_--;
			}
			for (int i_22_ = 0; i_22_ < 8; i_22_++) {
				Class246_Sub37 class246_sub37 = aClass246_Sub37Array1722[i_22_];
				aClass246_Sub37Array1722[i_22_] = aClass246_Sub37Array1716[i_22_] = null;
				Class246_Sub37 class246_sub37_23_;
				for (/**/; class246_sub37 != null; class246_sub37 = class246_sub37_23_) {
					class246_sub37_23_ = (((Class246_Sub37) class246_sub37).aClass246_Sub37_5322);
					((Class246_Sub37) class246_sub37).aClass246_Sub37_5322 = null;
				}
			}
		}
		if (anInt1714 < 0)
			anInt1714 = 0;
		if (aClass246_Sub37_1692 != null)
			aClass246_Sub37_1692.method2254(is, 0, i);
		aLong1697 = Class151.time(-58);
	}

	final void method843(byte i) {
		try {
			aBool1719 = true;
			anInt1700++;
			int i_24_ = -26 % ((i - 60) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ln.E(" + i + ')');
		}
	}

	public Class123() {
		anInt1714 = 0;
		anInt1720 = 0;
		aClass246_Sub37Array1722 = new Class246_Sub37[8];
		aLong1721 = 0L;
		anInt1723 = 0;
	}
}
