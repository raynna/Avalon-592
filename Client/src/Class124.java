/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class124 {
	int[] anIntArray1724;
	boolean aBool1725;
	static int anInt1726;
	int anInt1727 = -1;
	static int anInt1728;
	static int anInt1729;
	static int anInt1730;
	int anInt1731;
	boolean aBool1732;
	static Class_l aClass_l1733;
	int[][] anIntArrayArray1734;
	static Class205 aClass205_1735;
	Class45 aClass45_1736;
	int anInt1737;
	static int anInt1738 = 0;
	int anInt1739;
	static int anInt1740;
	int anInt1741;
	int anInt1742;
	boolean aBool1743 = false;
	boolean aBool1744;
	int[] anIntArray1745;
	int anInt1746;
	int anInt1747;
	static int anInt1748;
	int anInt1749;
	private int[] anIntArray1750;
	boolean[] aBoolArray1751;
	static int anInt1752;

	private final void method844(BufferStream stream, int i, int i_0_) {
		try {
			if (i_0_ != -15734)
				method848(-111);
			anInt1740++;
			if (i != 1) {
				if ((i ^ 0xffffffff) != -3) {
					if (i == 3) {
						((Class124) this).aBoolArray1751 = new boolean[256];
						int i_1_ = stream.readUnsignedByte(i_0_ + 15989);
						for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++)
							((Class124) this).aBoolArray1751[stream.readUnsignedByte(Class93.method599(i_0_, -15755))] = true;
					} else if (i == 4)
						((Class124) this).aBool1744 = true;
					else if ((i ^ 0xffffffff) != -6) {
						if ((i ^ 0xffffffff) == -7)
							((Class124) this).anInt1739 = stream.readUnsignedShort((byte) 98);
						else if ((i ^ 0xffffffff) == -8)
							((Class124) this).anInt1749 = stream.readUnsignedShort((byte) 113);
						else if (i == 8)
							((Class124) this).anInt1746 = stream.readUnsignedByte(255);
						else if ((i ^ 0xffffffff) == -10)
							((Class124) this).anInt1727 = stream.readUnsignedByte(255);
						else if (i == 10)
							((Class124) this).anInt1741 = stream.readUnsignedByte(255);
						else if (i == 11)
							((Class124) this).anInt1737 = stream.readUnsignedByte(255);
						else if ((i ^ 0xffffffff) != -13) {
							if (i == 13) {
								int i_3_ = stream.readUnsignedShort((byte) -74);
								((Class124) this).anIntArrayArray1734 = new int[i_3_][];
								for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++) {
									int i_5_ = stream.readUnsignedByte(255);
									if (i_5_ > 0) {
										((Class124) this).anIntArrayArray1734[i_4_] = new int[i_5_];
										((Class124) this).anIntArrayArray1734[i_4_][0] = stream.read24BitInteger((byte) 29);
										for (int i_6_ = 1; ((i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++)
											((Class124) this).anIntArrayArray1734[i_4_][i_6_] = stream.readUnsignedShort((byte) -128);
									}
								}
							} else if (i == 14)
								((Class124) this).aBool1743 = true;
							else if ((i ^ 0xffffffff) == -16)
								((Class124) this).aBool1732 = true;
							else if ((i ^ 0xffffffff) == -17)
								((Class124) this).aBool1725 = true;
						} else {
							int i_7_ = stream.readUnsignedByte(i_0_ + 15989);
							anIntArray1750 = new int[i_7_];
							for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_8_++)
								anIntArray1750[i_8_] = stream.readUnsignedShort((byte) -101);
							for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
								anIntArray1750[i_9_] = ((stream.readUnsignedShort((byte) -29) << 16) - -anIntArray1750[i_9_]);
						}
					} else
						((Class124) this).anInt1747 = stream.readUnsignedByte(255);
				} else
					((Class124) this).anInt1731 = stream.readUnsignedShort((byte) -74);
			} else {
				int i_10_ = stream.readUnsignedShort((byte) -105);
				((Class124) this).anIntArray1745 = new int[i_10_];
				for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
					((Class124) this).anIntArray1745[i_11_] = stream.readUnsignedShort((byte) 88);
				((Class124) this).anIntArray1724 = new int[i_10_];
				for (int i_12_ = 0; i_10_ > i_12_; i_12_++)
					((Class124) this).anIntArray1724[i_12_] = stream.readUnsignedShort((byte) -64);
				for (int i_13_ = 0; (i_10_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
					((Class124) this).anIntArray1724[i_13_] = ((stream.readUnsignedShort((byte) -108) << 16) + ((Class124) this).anIntArray1724[i_13_]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lp.C(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final void method845(BufferStream stream, int i) {
		try {
			int i_14_ = 111 % ((i + 57) / 48);
			for (;;) {
				int i_15_ = stream.readUnsignedByte(255);
				if (i_15_ == 0)
					break;
				method844(stream, i_15_, -15734);
			}
			anInt1748++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lp.G(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class_t method846(int i, int i_16_, int i_17_, int i_18_, Class_t class_t, int i_19_) {
		try {
			if (i_19_ >= -102)
				((Class124) this).anIntArray1724 = null;
			anInt1729++;
			int i_20_ = ((Class124) this).anIntArray1745[i_18_];
			int i_21_ = ((Class124) this).anIntArray1724[i_18_];
			Class246_Sub1_Sub17 class246_sub1_sub17 = ((Class124) this).aClass45_1736.method298(i_21_ >> 16, 1);
			i_21_ &= 0xffff;
			if (class246_sub1_sub17 == null)
				return class_t.method678((byte) 1, i_16_, true);
			Class246_Sub1_Sub17 class246_sub1_sub17_22_ = null;
			if ((((Class124) this).aBool1732 || OutputStream_Sub1.aBool4488) && (i_17_ ^ 0xffffffff) != 0 && ((Class124) this).anIntArray1724.length > i_17_) {
				i_17_ = ((Class124) this).anIntArray1724[i_17_];
				class246_sub1_sub17_22_ = ((Class124) this).aClass45_1736.method298(i_17_ >> 16, 1);
				i_17_ &= 0xffff;
			}
			Class246_Sub1_Sub17 class246_sub1_sub17_23_ = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_24_ = null;
			int i_25_ = 0;
			int i_26_ = 0;
			if (anIntArray1750 != null) {
				if ((i_18_ ^ 0xffffffff) > (anIntArray1750.length ^ 0xffffffff)) {
					i_25_ = anIntArray1750[i_18_];
					if (i_25_ != 65535) {
						class246_sub1_sub17_23_ = ((Class124) this).aClass45_1736.method298(i_25_ >> 16, 1);
						i_25_ &= 0xffff;
					}
				}
				if ((((Class124) this).aBool1732 || OutputStream_Sub1.aBool4488) && (i_17_ ^ 0xffffffff) != 0 && (i_17_ ^ 0xffffffff) > (anIntArray1750.length ^ 0xffffffff)) {
					i_26_ = anIntArray1750[i_17_];
					if (i_26_ != 65535) {
						class246_sub1_sub17_24_ = ((Class124) this).aClass45_1736.method298(i_26_ >> 16, 1);
						i_26_ &= 0xffff;
					}
				}
			}
			if (((Class124) this).aBool1743)
				i_16_ |= 0x200;
			if (class246_sub1_sub17.method2757((byte) -103, i_21_))
				i_16_ |= 0x80;
			if (class246_sub1_sub17.method2764(-6210, i_21_))
				i_16_ |= 0x100;
			if (class246_sub1_sub17.method2765(i_21_, (byte) 105))
				i_16_ |= 0x400;
			if (class246_sub1_sub17_23_ != null) {
				if (class246_sub1_sub17_23_.method2757((byte) -119, i_25_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_23_.method2764(-6210, i_25_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_23_.method2765(i_25_, (byte) 119))
					i_16_ |= 0x400;
			}
			if (class246_sub1_sub17_22_ != null) {
				if (class246_sub1_sub17_22_.method2757((byte) -110, i_17_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_22_.method2764(-6210, i_17_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_22_.method2765(i_17_, (byte) 95))
					i_16_ |= 0x400;
			}
			if (class246_sub1_sub17_24_ != null) {
				if (class246_sub1_sub17_24_.method2757((byte) -125, i_26_))
					i_16_ |= 0x80;
				if (class246_sub1_sub17_24_.method2764(-6210, i_26_))
					i_16_ |= 0x100;
				if (class246_sub1_sub17_24_.method2765(i_26_, (byte) 116))
					i_16_ |= 0x400;
			}
			i_16_ |= 0x20;
			Class_t class_t_27_ = class_t.method678((byte) 1, i_16_, true);
			class_t_27_.method674(0, i_20_, ((Class124) this).aBool1743, i_21_, i_17_, class246_sub1_sub17, class246_sub1_sub17_22_, -1 + i, 0);
			if (class246_sub1_sub17_23_ != null)
				class_t_27_.method674(0, i_20_, ((Class124) this).aBool1743, i_25_, i_26_, class246_sub1_sub17_23_, class246_sub1_sub17_24_, i - 1, 0);
			return class_t_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lp.B(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + (class_t != null ? "{...}" : "null") + ',' + i_19_ + ')'));
		}
	}

	final int method847(int i, int i_28_, int i_29_, boolean bool) {
		try {
			anInt1728++;
			int i_30_ = 0;
			int i_31_ = 0;
			if (i_28_ != 256)
				method844(null, 46, 101);
			int i_32_ = ((Class124) this).anIntArray1724[i];
			Class246_Sub1_Sub17 class246_sub1_sub17 = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_33_ = ((Class124) this).aClass45_1736.method298(i_32_ >> 16, 1);
			i_32_ &= 0xffff;
			if (class246_sub1_sub17_33_ == null)
				return i_30_;
			if ((((Class124) this).aBool1732 || OutputStream_Sub1.aBool4488) && (i_29_ ^ 0xffffffff) != 0 && i_29_ < ((Class124) this).anIntArray1724.length) {
				i_31_ = ((Class124) this).anIntArray1724[i_29_];
				class246_sub1_sub17 = ((Class124) this).aClass45_1736.method298(i_31_ >> 16, 1);
				i_31_ &= 0xffff;
			}
			if (((Class124) this).aBool1743)
				i_30_ |= 0x200;
			if (class246_sub1_sub17_33_.method2757((byte) -88, i_32_))
				i_30_ |= 0x80;
			if (class246_sub1_sub17_33_.method2764(-6210, i_32_))
				i_30_ |= 0x100;
			if (class246_sub1_sub17_33_.method2765(i_32_, (byte) 115))
				i_30_ |= 0x400;
			if (class246_sub1_sub17 != null) {
				if (class246_sub1_sub17.method2757((byte) -108, i_31_))
					i_30_ |= 0x80;
				if (class246_sub1_sub17.method2764(-6210, i_31_))
					i_30_ |= 0x100;
				if (class246_sub1_sub17.method2765(i_31_, (byte) 109))
					i_30_ |= 0x400;
			}
			if (anIntArray1750 != null && bool) {
				if ((anIntArray1750.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
					int i_34_ = anIntArray1750[i];
					if ((i_34_ ^ 0xffffffff) != -65536) {
						Class246_Sub1_Sub17 class246_sub1_sub17_35_ = ((Class124) this).aClass45_1736.method298(i_34_ >> 16, 1);
						i_34_ &= 0xffff;
						if (class246_sub1_sub17_35_ != null) {
							if (class246_sub1_sub17_35_.method2757((byte) -55, i_34_))
								i_30_ |= 0x80;
							if (class246_sub1_sub17_35_.method2764(-6210, i_34_))
								i_30_ |= 0x100;
							if (class246_sub1_sub17_35_.method2765(i_34_, (byte) 95))
								i_30_ |= 0x400;
						}
					}
				}
				if ((((Class124) this).aBool1732 || OutputStream_Sub1.aBool4488) && (i_29_ ^ 0xffffffff) != 0 && (anIntArray1750.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff)) {
					int i_36_ = anIntArray1750[i_29_];
					if ((i_36_ ^ 0xffffffff) != -65536) {
						Class246_Sub1_Sub17 class246_sub1_sub17_37_ = ((Class124) this).aClass45_1736.method298(i_36_ >> 16, 1);
						i_36_ &= 0xffff;
						if (class246_sub1_sub17_37_ != null) {
							if (class246_sub1_sub17_37_.method2757((byte) -55, i_36_))
								i_30_ |= 0x80;
							if (class246_sub1_sub17_37_.method2764(-6210, i_36_))
								i_30_ |= 0x100;
							if (class246_sub1_sub17_37_.method2765(i_36_, (byte) 109))
								i_30_ |= 0x400;
						}
					}
				}
			}
			return 0x20 | i_30_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lp.H(" + i + ',' + i_28_ + ',' + i_29_ + ',' + bool + ')'));
		}
	}

	static final void method848(int i) {
		try {
			if (i > -41)
				aClass205_1735 = null;
			anInt1730++;
			int i_38_ = Class246_Sub4.anInt3869;
			int[] is = Class53.anIntArray755;
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
				Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[is[i_39_]];
				if (class_r_sub1 != null)
					Class246_Sub6.method1819(class_r_sub1.method2670((byte) 127), (byte) -10, class_r_sub1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lp.E(" + i + ')');
		}
	}

	final Class_t method849(int i, byte i_40_, Class_t class_t, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
		try {
			anInt1726++;
			int i_46_ = ((Class124) this).anIntArray1745[i];
			i = ((Class124) this).anIntArray1724[i];
			Class246_Sub1_Sub17 class246_sub1_sub17 = ((Class124) this).aClass45_1736.method298(i >> 16, i_45_ ^ 0x101);
			i &= 0xffff;
			if (class246_sub1_sub17 == null)
				return class_t.method678(i_40_, i_44_, true);
			Class246_Sub1_Sub17 class246_sub1_sub17_47_ = null;
			if ((((Class124) this).aBool1732 || OutputStream_Sub1.aBool4488) && i_42_ != -1 && i_42_ < ((Class124) this).anIntArray1724.length) {
				i_42_ = ((Class124) this).anIntArray1724[i_42_];
				class246_sub1_sub17_47_ = ((Class124) this).aClass45_1736.method298(i_42_ >> 16, i_45_ ^ 0x101);
				i_42_ &= 0xffff;
			}
			if (((Class124) this).aBool1743)
				i_44_ |= 0x200;
			if (i_45_ != 256)
				((Class124) this).aBool1725 = false;
			if (class246_sub1_sub17.method2757((byte) -45, i))
				i_44_ |= 0x80;
			if (class246_sub1_sub17.method2764(i_45_ - 6466, i))
				i_44_ |= 0x100;
			if (class246_sub1_sub17.method2765(i, (byte) 96))
				i_44_ |= 0x400;
			if (class246_sub1_sub17_47_ != null) {
				if (class246_sub1_sub17_47_.method2757((byte) -92, i_42_))
					i_44_ |= 0x80;
				if (class246_sub1_sub17_47_.method2764(-6210, i_42_))
					i_44_ |= 0x100;
				if (class246_sub1_sub17_47_.method2765(i_42_, (byte) 94))
					i_44_ |= 0x400;
			}
			i_44_ |= 0x20;
			Class_t class_t_48_ = class_t.method678(i_40_, i_44_, true);
			class_t_48_.method674(i_43_, i_46_, ((Class124) this).aBool1743, i, i_42_, class246_sub1_sub17, class246_sub1_sub17_47_, i_41_ - 1, 0);
			return class_t_48_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lp.D(" + i + ',' + i_40_ + ',' + (class_t != null ? "{...}" : "null") + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ')'));
		}
	}

	final void method850(int i) {
		do {
			try {
				do {
					if ((((Class124) this).anInt1727 ^ 0xffffffff) == 0) {
						if (((Class124) this).aBoolArray1751 == null) {
							((Class124) this).anInt1727 = 0;
							if (!client.f_ob)
								break;
						}
						((Class124) this).anInt1727 = 2;
					}
				} while (false);
				if (i != 2)
					((Class124) this).anInt1741 = -63;
				anInt1752++;
				if (((Class124) this).anInt1741 != -1)
					break;
				if (((Class124) this).aBoolArray1751 != null)
					((Class124) this).anInt1741 = 2;
				else
					((Class124) this).anInt1741 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lp.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method851(byte i) {
		try {
			aClass_l1733 = null;
			aClass205_1735 = null;
			int i_49_ = 114 / ((i - 44) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lp.A(" + i + ')');
		}
	}

	public Class124() {
		((Class124) this).anInt1739 = -1;
		((Class124) this).anInt1746 = 99;
		((Class124) this).aBool1732 = false;
		((Class124) this).anInt1747 = 5;
		((Class124) this).aBool1744 = false;
		((Class124) this).anInt1731 = -1;
		((Class124) this).aBool1725 = false;
		((Class124) this).anInt1737 = 2;
		((Class124) this).anInt1749 = -1;
		((Class124) this).anInt1741 = -1;
	}

	static {
		aClass205_1735 = new Class205("WTI", 5);
	}
}
