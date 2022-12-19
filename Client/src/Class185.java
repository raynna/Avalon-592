/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class185 {
	int anInt2570 = 1;
	private int anInt2571;
	int anInt2572;
	private int anInt2573 = 128;
	private byte aByte2574;
	private byte[] aByteArray2575;
	static int anInt2576;
	boolean aBool2577 = false;
	int anInt2578;
	int anInt2579;
	private int[] anIntArray2580;
	static int anInt2581;
	static int anInt2582;
	boolean aBool2583;
	boolean aBool2584;
	static int anInt2585;
	int[] anIntArray2586;
	private short[] aShortArray2587;
	private int anInt2588;
	private int anInt2589;
	int anInt2590;
	static int anInt2591;
	static OutgoingPacket aClass201_2592;
	int anInt2593;
	boolean aBool2594;
	String[] aStringArray2595;
	int anInt2596;
	int anInt2597;
	int anInt2598;
	private int anInt2599;
	int anInt2600;
	boolean aBool2601;
	private byte aByte2602;
	int anInt2603;
	boolean aBool2604;
	int[] anIntArray2605;
	private int anInt2606;
	int anInt2607;
	private int[][] anIntArrayArray2608;
	int anInt2609;
	Class251 aClass251_2610;
	boolean aBool2611;
	private int anInt2612;
	static int anInt2613;
	private byte aByte2614;
	private int anInt2615;
	int anInt2616;
	private int anInt2617;
	boolean aBool2618;
	boolean aBool2619;
	boolean aBool2620;
	static int anInt2621;
	boolean f_ab;
	int[] f_bb;
	static int f_cb;
	private int f_db;
	private Class85 f_eb;
	boolean f_fb;
	private int f_gb;
	int f_hb;
	static int f_ib;
	static int f_jb;
	int f_kb;
	private byte[] f_lb;
	private int f_mb;
	int[] f_nb;
	static int f_ob;
	int f_pb;
	boolean f_qb;
	private short[] f_rb;
	static int f_sb;
	private short[] f_tb;
	int f_ub;
	boolean f_vb;
	String f_wb;
	int anInt2622;
	int anInt2623;
	static int anInt2624;
	private byte aByte2625;
	static int anInt2626 = -1;
	boolean aBool2627;
	private byte aByte2628;
	static int anInt2629;
	static int anInt2630;
	int anInt2631;
	static int anInt2632;
	private short[] aShortArray2633;
	int anInt2634;

	final void method1202(byte i) {
		do {
			try {
				if ((((Class185) this).anInt2590 ^ 0xffffffff) == 0) {
					((Class185) this).anInt2590 = 0;
					if (f_lb != null && (f_lb.length ^ 0xffffffff) == -2 && (f_lb[0] ^ 0xffffffff) == -11)
						((Class185) this).anInt2590 = 1;
					for (int i_0_ = 0; i_0_ < 5; i_0_++) {
						if (((Class185) this).aStringArray2595[i_0_] != null) {
							((Class185) this).anInt2590 = 1;
							break;
						}
					}
				}
				anInt2621++;
				if ((((Class185) this).anInt2598 ^ 0xffffffff) == 0)
					((Class185) this).anInt2598 = ((((Class185) this).anInt2634 ^ 0xffffffff) != -1 ? 1 : 0);
				if (i < -11)
					break;
				method1218(-23, null, -125);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rd.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1203(int i) {
		try {
			anInt2629++;
			if (((Class185) this).f_bb == null) {
				if ((((Class185) this).anInt2603 ^ 0xffffffff) == 0 && ((Class185) this).anIntArray2605 == null)
					return false;
				return true;
			}
			for (int i_1_ = i; ((i_1_ ^ 0xffffffff) > (((Class185) this).f_bb.length ^ 0xffffffff)); i_1_++) {
				if ((((Class185) this).f_bb[i_1_] ^ 0xffffffff) != 0) {
					Class185 class185_2_ = ((Class185) this).aClass251_2610.method1610(((Class185) this).f_bb[i_1_], 0);
					if (((Class185) class185_2_).anInt2603 != -1 || ((Class185) class185_2_).anIntArray2605 != null)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.K(" + i + ')');
		}
	}

	final boolean method1204(int i, int i_3_) {
		try {
			if (i != 0)
				return false;
			f_sb++;
			if (i_3_ == -1)
				return false;
			if ((i_3_ ^ 0xffffffff) == (((Class185) this).f_pb ^ 0xffffffff))
				return true;
			if (((Class185) this).anIntArray2586 != null) {
				for (int i_4_ = 0; i_4_ < ((Class185) this).anIntArray2586.length; i_4_++) {
					if ((i_3_ ^ 0xffffffff) == (((Class185) this).anIntArray2586[i_4_] ^ 0xffffffff))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.O(" + i + ',' + i_3_ + ')');
		}
	}

	final Class185 method1205(Interface11 interface11, byte i) {
		try {
			anInt2630++;
			int i_5_ = -1;
			int i_6_ = -76 / ((45 - i) / 46);
			do {
				if (anInt2588 == -1) {
					if (anInt2606 == -1)
						break;
					i_5_ = interface11.method35(anInt2606, 0);
					if (!client.f_ob)
						break;
				}
				i_5_ = interface11.method34((byte) 45, anInt2588);
			} while (false);
			if (i_5_ < 0 || i_5_ >= ((Class185) this).f_bb.length - 1 || ((Class185) this).f_bb[i_5_] == -1) {
				int i_7_ = (((Class185) this).f_bb[-1 + ((Class185) this).f_bb.length]);
				if (i_7_ == -1)
					return null;
				return ((Class185) this).aClass251_2610.method1610(i_7_, 0);
			}
			return ((Class185) this).aClass251_2610.method1610(((Class185) this).f_bb[i_5_], 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.E(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1206(int i, byte i_8_, int i_9_) {
		try {
			anInt2581++;
			if (i_8_ <= 75)
				((Class185) this).f_wb = null;
			if (f_eb == null)
				return i_9_;
			IntegerNode class246_sub33 = (IntegerNode) f_eb.method544((long) i, 123);
			if (class246_sub33 == null)
				return i_9_;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.P(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public static void method1207(byte i) {
		do {
			try {
				aClass201_2592 = null;
				if (i == 17)
					break;
				method1216((byte) 92, false, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rd.L(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1208(BufferStream stream, byte i) {
		try {
			f_jb++;
			int i_10_ = stream.readUnsignedByte(255);
			if (i == 34) {
				for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
					((BufferStream) stream).position++;
					int i_12_ = stream.readUnsignedByte(255);
					((BufferStream) stream).position += i_12_ * 2;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.N(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1209(byte i) {
		try {
			anInt2591++;
			if (((Class185) this).anIntArray2586 != null) {
				int i_13_ = (int) ((double) anInt2571 * Math.random());
				int i_14_;
				for (i_14_ = 0; i_13_ >= anIntArray2580[i_14_]; i_14_++)
					i_13_ -= anIntArray2580[i_14_];
				return ((Class185) this).anIntArray2586[i_14_];
			}
			if (i >= -31)
				method1213(-110);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.G(" + i + ')');
		}
	}

	final Class133 method1210(Class260 class260, int i, int i_15_, int i_16_, int i_17_, boolean bool, int i_18_, Class210 class210, int i_19_, int i_20_, Class210 class210_21_) {
		try {
			f_cb++;
			if (Class242.method1559(122, i_20_))
				i_20_ = 4;
			long l = (long) ((i_20_ << 3) + ((((Class185) this).anInt2607 << 10) + i_18_));
			l |= (long) (((Class260) class260).anInt3719 << 29);
			int i_22_ = i_16_;
			if ((aByte2625 ^ 0xffffffff) == -4)
				i_22_ |= 0x7;
			else if (aByte2625 != 0)
				i_22_ |= 0x2;
			if (bool)
				i_22_ |= 0x40000;
			Class133 class133;
			synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3557) {
				if (i_15_ != 3)
					((Class185) this).anInt2634 = 107;
				class133 = (Class133) ((Class251) ((Class185) this).aClass251_2610).aClass54_3557.method379(l, (byte) 58);
			}
			Class_t class_t = class133 == null ? null : ((Class133) class133).aClass_t1837;
			Class246_Sub1_Sub4 class246_sub1_sub4 = null;
			if (class_t == null || class260.method1710(class_t.P(), i_22_) != 0) {
				if (class_t != null)
					i_22_ = class260.method1723(i_22_, class_t.P());
				int i_23_ = i_22_;
				if ((i_20_ ^ 0xffffffff) == -11 && (i_18_ ^ 0xffffffff) < -4)
					i_23_ |= 0x5;
				class_t = method1212((byte) 17, class260, i_18_, i_20_, i_23_);
				if (class_t == null)
					return null;
				if ((i_20_ ^ 0xffffffff) == -11 && i_18_ > 3)
					class_t.Q(2048);
				if (bool)
					class246_sub1_sub4 = class_t.fa(null);
				class_t.UA(i_22_);
				class133 = new Class133();
				((Class133) class133).aClass_t1837 = class_t;
				((Class133) class133).aClass246_Sub1_Sub4_1835 = class246_sub1_sub4;
				synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3557) {
					((Class251) ((Class185) this).aClass251_2610).aClass54_3557.method371(1, l, class133);
				}
			} else {
				class_t = ((Class133) class133).aClass_t1837;
				class246_sub1_sub4 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
				if (bool && class246_sub1_sub4 == null)
					class246_sub1_sub4 = ((Class133) class133).aClass246_Sub1_Sub4_1835 = class_t.fa(null);
			}
			if ((aByte2625 ^ 0xffffffff) != -1 && (class210_21_ != null || class210 != null)) {
				class_t = class_t.method678((byte) 0, i_22_, true);
				class_t.h(aByte2625, f_mb, class210_21_, class210, i, i_17_, i_19_);
				class_t.UA(i_16_);
			} else
				class_t = class_t.method678((byte) 0, i_16_, true);
			((Class133) Class246_Sub28_Sub36.aClass133_7032).aClass_t1837 = class_t;
			((Class133) Class246_Sub28_Sub36.aClass133_7032).aClass246_Sub1_Sub4_1835 = class246_sub1_sub4;
			return Class246_Sub28_Sub36.aClass133_7032;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + bool + ',' + i_18_ + ',' + (class210 != null ? "{...}" : "null") + ',' + i_19_ + ',' + i_20_ + ',' + (class210_21_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1211(byte i, int i_24_) {
		try {
			anInt2632++;
			if (anIntArrayArray2608 == null)
				return true;
			synchronized (((Class251) ((Class185) this).aClass251_2610).aClass_fs3550) {
				if (i > -64)
					((Class185) this).aBool2611 = false;
				for (int i_25_ = 0; (f_lb.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
					if (f_lb[i_25_] == i_24_) {
						for (int i_26_ = 0; ((anIntArrayArray2608[i_25_].length ^ 0xffffffff) < (i_26_ ^ 0xffffffff)); i_26_++) {
							if (!((Class251) ((Class185) this).aClass251_2610).aClass_fs3550.method85(0, (byte) -124, anIntArrayArray2608[i_25_][i_26_]))
								return false;
						}
						return true;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.B(" + i + ',' + i_24_ + ')');
		}
	}

	private final Class_t method1212(byte i, Class260 class260, int i_27_, int i_28_, int i_29_) {
		try {
			anInt2582++;
			int i_30_ = 64 + anInt2589;
			int i_31_ = anInt2612 + 850;
			int i_32_ = i_29_;
			boolean bool = (((Class185) this).f_fb || i_28_ == 2 && (i_27_ ^ 0xffffffff) < -4);
			if (bool)
				i_29_ |= 0x10;
			if (i_27_ == 0) {
				if (anInt2617 != 128 || (f_gb ^ 0xffffffff) != -1)
					i_29_ |= 0x1;
				if ((anInt2573 ^ 0xffffffff) != -129 || f_db != 0)
					i_29_ |= 0x4;
			} else
				i_29_ |= 0xd;
			if (anInt2599 != 128 || (anInt2615 ^ 0xffffffff) != -1)
				i_29_ |= 0x2;
			if (aShortArray2633 != null)
				i_29_ |= 0x4000;
			if (aShortArray2587 != null)
				i_29_ |= 0x8000;
			if (aByte2614 != 0)
				i_29_ |= 0x80000;
			Class_t class_t = null;
			if (f_lb == null)
				return null;
			int i_33_ = -1;
			for (int i_34_ = 0; i_34_ < f_lb.length; i_34_++) {
				if (f_lb[i_34_] == i_28_) {
					i_33_ = i_34_;
					break;
				}
			}
			if (i_33_ == -1)
				return null;
			int i_35_ = anIntArrayArray2608[i_33_].length;
			if ((i_35_ ^ 0xffffffff) < -1) {
				long l = (long) ((Class260) class260).anInt3719;
				for (int i_36_ = 0; (i_35_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++)
					l = (long) anIntArrayArray2608[i_33_][i_36_] + l * 67783L;
				synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3554) {
					class_t = ((Class_t) ((Class251) ((Class185) this).aClass251_2610).aClass54_3554.method379(l, (byte) 58));
				}
				if (class_t != null) {
					if (class_t.D() != i_30_)
						i_29_ |= 0x1000;
					if ((i_31_ ^ 0xffffffff) != (class_t.l() ^ 0xffffffff))
						i_29_ |= 0x2000;
				}
				if (class_t == null || class260.method1710(class_t.P(), i_29_) != 0) {
					int i_37_ = 0x1f01f | i_29_;
					if (class_t != null)
						i_37_ = class260.method1723(i_37_, class_t.P());
					Class103 class103 = null;
					synchronized (Class218.aClass103Array3030) {
						for (int i_38_ = 0; (i_35_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
							synchronized (((Class251) ((Class185) this).aClass251_2610).aClass_fs3550) {
								class103 = (Class206.method1349(0, (((Class251) (((Class185) this).aClass251_2610)).aClass_fs3550), (byte) 89, 0xffff & (anIntArrayArray2608[i_33_][i_38_])));
							}
							if (class103 == null)
								return null;
							if ((((Class103) class103).anInt1358 ^ 0xffffffff) > -14)
								class103.method646(0, (byte) -49);
							if (i_35_ > 1)
								Class218.aClass103Array3030[i_38_] = class103;
						}
						if ((i_35_ ^ 0xffffffff) < -2)
							class103 = new Class103(Class218.aClass103Array3030, i_35_);
					}
					class_t = class260.method1695(class103, i_37_, (((Class251) (((Class185) this).aClass251_2610)).anInt3559), i_30_, i_31_);
					synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3554) {
						((Class251) ((Class185) this).aClass251_2610).aClass54_3554.method371(1, l, class_t);
					}
				}
			}
			Class_t class_t_39_ = class_t.method678((byte) 0, i_29_, true);
			if ((class_t.D() ^ 0xffffffff) != (i_30_ ^ 0xffffffff))
				class_t_39_.E(i_30_);
			if ((i_31_ ^ 0xffffffff) != (class_t.l() ^ 0xffffffff))
				class_t_39_.aa(i_31_);
			if (bool)
				class_t_39_.IA();
			if (i_28_ == 4 && i_27_ > 3) {
				class_t_39_.c(2048);
				class_t_39_.JA(45, 0, -45);
			}
			i_27_ &= 0x3;
			if ((i_27_ ^ 0xffffffff) != -2) {
				if (i_27_ == 2)
					class_t_39_.c(8192);
				else if ((i_27_ ^ 0xffffffff) == -4)
					class_t_39_.c(12288);
			} else
				class_t_39_.c(4096);
			if (aShortArray2633 != null) {
				for (int i_40_ = 0; aShortArray2633.length > i_40_; i_40_++)
					class_t_39_.BA(aShortArray2633[i_40_], f_tb[i_40_]);
			}
			if (aShortArray2587 != null) {
				for (int i_41_ = 0; ((i_41_ ^ 0xffffffff) > (aShortArray2587.length ^ 0xffffffff)); i_41_++)
					class_t_39_.I(aShortArray2587[i_41_], f_rb[i_41_]);
			}
			if (aByte2614 != 0)
				class_t_39_.method684(aByte2628, aByte2574, aByte2602, 0xff & aByte2614);
			if ((anInt2617 ^ 0xffffffff) != -129 || (anInt2599 ^ 0xffffffff) != -129 || anInt2573 != 128)
				class_t_39_.H(anInt2617, anInt2599, anInt2573);
			if ((f_gb ^ 0xffffffff) != -1 || (anInt2615 ^ 0xffffffff) != -1 || (f_db ^ 0xffffffff) != -1)
				class_t_39_.JA(f_gb, anInt2615, f_db);
			class_t_39_.UA(i_32_);
			if (i != 17)
				method1207((byte) 83);
			return class_t_39_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')'));
		}
	}

	final boolean method1213(int i) {
		try {
			anInt2576++;
			if (anIntArrayArray2608 == null)
				return true;
			boolean bool = true;
			synchronized (((Class251) ((Class185) this).aClass251_2610).aClass_fs3550) {
				for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > (anIntArrayArray2608.length ^ 0xffffffff)); i_42_++) {
					for (int i_43_ = 0; i_43_ < anIntArrayArray2608[i_42_].length; i_43_++)
						bool &= (((Class251) ((Class185) this).aClass251_2610).aClass_fs3550.method85(0, (byte) -124, anIntArrayArray2608[i_42_][i_43_]));
				}
			}
			int i_44_ = -10 % ((71 - i) / 32);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rd.D(" + i + ')');
		}
	}

	private final void method1214(BufferStream stream, int i, int i_45_) {
		try {
			if ((i ^ 0xffffffff) == i_45_ || i == 5) {
				if ((i ^ 0xffffffff) == -6 && ((Class251) ((Class185) this).aClass251_2610).aBool3547)
					method1208(stream, (byte) 34);
				int i_46_ = stream.readUnsignedByte(255);
				anIntArrayArray2608 = new int[i_46_][];
				f_lb = new byte[i_46_];
				for (int i_47_ = 0; i_46_ > i_47_; i_47_++) {
					f_lb[i_47_] = stream.readByte(false);
					int i_48_ = stream.readUnsignedByte(255);
					anIntArrayArray2608[i_47_] = new int[i_48_];
					for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff); i_49_++)
						anIntArrayArray2608[i_47_][i_49_] = stream.readUnsignedShort((byte) 126);
				}
				if ((i ^ 0xffffffff) == -6 && !(((Class251) ((Class185) this).aClass251_2610).aBool3547))
					method1208(stream, (byte) 34);
			} else if ((i ^ 0xffffffff) == -3)
				((Class185) this).f_wb = stream.readString((byte) -40);
			else if ((i ^ 0xffffffff) != -15) {
				if ((i ^ 0xffffffff) != -16) {
					if ((i ^ 0xffffffff) != -18) {
						if (i == 18)
							((Class185) this).aBool2620 = false;
						else if ((i ^ 0xffffffff) == -20)
							((Class185) this).anInt2590 = stream.readUnsignedByte(i_45_ + 257);
						else if ((i ^ 0xffffffff) != -22) {
							if (i == 22)
								((Class185) this).aBool2594 = true;
							else if (i == 23)
								((Class185) this).anInt2616 = 1;
							else if (i == 24) {
								((Class185) this).f_pb = stream.readUnsignedShort((byte) -74);
								if ((((Class185) this).f_pb ^ 0xffffffff) == -65536)
									((Class185) this).f_pb = -1;
							} else if ((i ^ 0xffffffff) == -28)
								((Class185) this).anInt2634 = 1;
							else if ((i ^ 0xffffffff) != -29) {
								if ((i ^ 0xffffffff) == -30)
									anInt2589 = stream.readByte(false);
								else if (i != 39) {
									if (i >= 30 && (i ^ 0xffffffff) > -36)
										((Class185) this).aStringArray2595[-30 + i] = stream.readString((byte) -40);
									else if ((i ^ 0xffffffff) == -41) {
										int i_50_ = stream.readUnsignedByte(255);
										f_tb = new short[i_50_];
										aShortArray2633 = new short[i_50_];
										for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
											aShortArray2633[i_51_] = (short) (stream.readUnsignedShort((byte) -45));
											f_tb[i_51_] = (short) (stream.readUnsignedShort((byte) 101));
										}
									} else if (i != 41) {
										if (i != 42) {
											if (i == 62)
												((Class185) this).f_fb = true;
											else if (i == 64)
												((Class185) this).f_vb = false;
											else if (i == 65)
												anInt2617 = (stream.readUnsignedShort((byte) -109));
											else if ((i ^ 0xffffffff) == -67)
												anInt2599 = (stream.readUnsignedShort((byte) 96));
											else if ((i ^ 0xffffffff) != -68) {
												if ((i ^ 0xffffffff) != -70) {
													if ((i ^ 0xffffffff) != -71) {
														if (i != 71) {
															if ((i ^ 0xffffffff) != -73) {
																if (i != 73) {
																	if (i != 74) {
																		if (i != 75) {
																			if (i == 77 || (i ^ 0xffffffff) == -93) {
																				anInt2588 = stream.readUnsignedShort((byte) -66);
																				if ((anInt2588 ^ 0xffffffff) == -65536)
																					anInt2588 = -1;
																				anInt2606 = stream.readUnsignedShort((byte) 88);
																				if (anInt2606 == 65535)
																					anInt2606 = -1;
																				int i_52_ = -1;
																				if (i == 92) {
																					i_52_ = stream.readUnsignedShort((byte) 125);
																					if (i_52_ == 65535)
																						i_52_ = -1;
																				}
																				int i_53_ = stream.readUnsignedByte(255);
																				((Class185) this).f_bb = new int[2 + i_53_];
																				for (int i_54_ = 0; i_54_ <= i_53_; i_54_++) {
																					((Class185) this).f_bb[i_54_] = stream.readUnsignedShort((byte) 91);
																					if (((Class185) this).f_bb[i_54_] == 65535)
																						((Class185) this).f_bb[i_54_] = -1;
																				}
																				((Class185) this).f_bb[1 + i_53_] = i_52_;
																			} else if (i == 78) {
																				((Class185) this).anInt2603 = stream.readUnsignedShort((byte) -68);
																				((Class185) this).anInt2631 = stream.readUnsignedByte(i_45_ + 257);
																			} else if ((i ^ 0xffffffff) != -80) {
																				if ((i ^ 0xffffffff) == -82) {
																					aByte2625 = (byte) 2;
																					f_mb = stream.readUnsignedByte(255) * 256;
																				} else if (i == 82)
																					((Class185) this).aBool2611 = true;
																				else if ((i ^ 0xffffffff) == -89)
																					((Class185) this).aBool2583 = false;
																				else if ((i ^ 0xffffffff) == -90)
																					((Class185) this).f_ab = false;
																				else if (i != 90) {
																					if (i != 91) {
																						if ((i ^ 0xffffffff) != -94) {
																							if ((i ^ 0xffffffff) != -95) {
																								if (i == 95)
																									aByte2625 = (byte) 5;
																								else if ((i ^ 0xffffffff) == -97)
																									((Class185) this).aBool2601 = true;
																								else if ((i ^ 0xffffffff) != -98) {
																									if ((i ^ 0xffffffff) == -99)
																										((Class185) this).f_qb = true;
																									else if (i != 99) {
																										if (i != 100) {
																											if ((i ^ 0xffffffff) == -102)
																												((Class185) this).anInt2597 = stream.readUnsignedByte(255);
																											else if ((i ^ 0xffffffff) != -103) {
																												if ((i ^ 0xffffffff) == -104)
																													((Class185) this).anInt2616 = 0;
																												else if ((i ^ 0xffffffff) != -105) {
																													if ((i ^ 0xffffffff) == -106)
																														((Class185) this).aBool2604 = true;
																													else if (i == 106) {
																														int i_55_ = stream.readUnsignedByte(255);
																														((Class185) this).anIntArray2586 = new int[i_55_];
																														anIntArray2580 = new int[i_55_];
																														for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > (i_55_ ^ 0xffffffff); i_56_++) {
																															((Class185) this).anIntArray2586[i_56_] = stream.readUnsignedShort((byte) 94);
																															int i_57_ = stream.readUnsignedByte(255);
																															anIntArray2580[i_56_] = i_57_;
																															anInt2571 += i_57_;
																														}
																													} else if ((i ^ 0xffffffff) != -108) {
																														if (i < 150 || (i ^ 0xffffffff) <= -156) {
																															if ((i ^ 0xffffffff) != -161) {
																																if ((i ^ 0xffffffff) == -163) {
																																	aByte2625 = (byte) 3;
																																	f_mb = stream.readInt((byte) 77);
																																} else if ((i ^ 0xffffffff) == -164) {
																																	aByte2628 = stream.readByte(false);
																																	aByte2574 = stream.readByte(false);
																																	aByte2602 = stream.readByte(false);
																																	aByte2614 = stream.readByte(false);
																																} else if (i == 249) {
																																	int i_58_ = stream.readUnsignedByte(255);
																																	if (f_eb == null) {
																																		int i_59_ = Class206.method1350(i_58_, 269173057);
																																		f_eb = new Class85(i_59_);
																																	}
																																	for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_58_ ^ 0xffffffff); i_60_++) {
																																		boolean bool = stream.readUnsignedByte(255) == 1;
																																		int i_61_ = stream.read24BitInteger((byte) 29);
																																		Node class246;
																																		if (!bool)
																																			class246 = new IntegerNode(stream.readInt((byte) 119));
																																		else
																																			class246 = new Class246_Sub4(stream.readString((byte) -40));
																																		f_eb.method547((long) i_61_, -2301, class246);
																																	}
																																}
																															} else {
																																int i_62_ = stream.readUnsignedByte(i_45_ + 257);
																																((Class185) this).f_nb = new int[i_62_];
																																for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
																																	((Class185) this).f_nb[i_63_] = stream.readUnsignedShort((byte) 84);
																															}
																														} else {
																															((Class185) this).aStringArray2595[i - 150] = stream.readString((byte) -40);
																															if (!((Class251) ((Class185) this).aClass251_2610).aBool3539)
																																((Class185) this).aStringArray2595[-150 + i] = null;
																														}
																													} else
																														((Class185) this).anInt2579 = stream.readUnsignedShort((byte) -95);
																												} else
																													((Class185) this).anInt2578 = stream.readUnsignedByte(255);
																											} else
																												((Class185) this).anInt2572 = stream.readUnsignedShort((byte) -90);
																										} else {
																											((Class185) this).f_kb = stream.readUnsignedByte(255);
																											((Class185) this).f_ub = stream.readUnsignedShort((byte) 90);
																										}
																									} else {
																										((Class185) this).anInt2600 = stream.readUnsignedByte(255);
																										((Class185) this).anInt2609 = stream.readUnsignedShort((byte) -125);
																									}
																								} else
																									((Class185) this).aBool2619 = true;
																							} else
																								aByte2625 = (byte) 4;
																						} else {
																							aByte2625 = (byte) 3;
																							f_mb = stream.readUnsignedShort((byte) 102);
																						}
																					} else
																						((Class185) this).aBool2618 = true;
																				} else
																					((Class185) this).aBool2584 = true;
																			} else {
																				((Class185) this).anInt2623 = stream.readUnsignedShort((byte) -73);
																				((Class185) this).anInt2622 = stream.readUnsignedShort((byte) -77);
																				((Class185) this).anInt2631 = stream.readUnsignedByte(255);
																				int i_64_ = stream.readUnsignedByte(255);
																				((Class185) this).anIntArray2605 = new int[i_64_];
																				for (int i_65_ = 0; i_64_ > i_65_; i_65_++)
																					((Class185) this).anIntArray2605[i_65_] = stream.readUnsignedShort((byte) 106);
																			}
																		} else
																			((Class185) this).anInt2598 = stream.readUnsignedByte(255);
																	} else
																		((Class185) this).aBool2577 = true;
																} else
																	((Class185) this).aBool2627 = true;
															} else
																f_db = ((stream.method2375((byte) 1)) << 0);
														} else
															anInt2615 = ((stream.method2375((byte) 1)) << 0);
													} else
														f_gb = ((stream.method2375((byte) 1)) << 0);
												} else
													((Class185) this).f_hb = (stream.readUnsignedByte(i_45_ ^ ~0xfe));
											} else
												anInt2573 = (stream.readUnsignedShort((byte) 98));
										} else {
											int i_66_ = stream.readUnsignedByte(255);
											aByteArray2575 = new byte[i_66_];
											for (int i_67_ = 0; ((i_66_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff)); i_67_++)
												aByteArray2575[i_67_] = stream.readByte(false);
										}
									} else {
										int i_68_ = stream.readUnsignedByte(i_45_ ^ ~0xfe);
										f_rb = new short[i_68_];
										aShortArray2587 = new short[i_68_];
										for (int i_69_ = 0; ((i_69_ ^ 0xffffffff) > (i_68_ ^ 0xffffffff)); i_69_++) {
											aShortArray2587[i_69_] = (short) (stream.readUnsignedShort((byte) 88));
											f_rb[i_69_] = (short) (stream.readUnsignedShort((byte) -68));
										}
									}
								} else
									anInt2612 = stream.readByte(false) * 5;
							} else
								((Class185) this).anInt2593 = stream.readUnsignedByte(i_45_ ^ ~0xfe) << 0;
						} else
							aByte2625 = (byte) 1;
					} else {
						((Class185) this).aBool2620 = false;
						((Class185) this).anInt2634 = 0;
					}
				} else
					((Class185) this).anInt2570 = stream.readUnsignedByte(i_45_ ^ ~0xfe);
			} else
				((Class185) this).anInt2596 = stream.readUnsignedByte(255);
			anInt2613++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.J(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_45_ + ')'));
		}
	}

	final Class_t method1215(byte i, int i_70_, int i_71_, int i_72_, int i_73_, Class260 class260, Class124 class124, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, Class210 class210, Class210 class210_79_) {
		try {
			if (Class242.method1559(126, i_70_))
				i_70_ = 4;
			f_ob++;
			long l = (long) ((((Class185) this).anInt2607 << 10) - (-(i_70_ << 3) - i_76_));
			int i_80_ = i_78_;
			l |= (long) (((Class260) class260).anInt3719 << 29);
			if (class124 != null)
				i_78_ |= class124.method847(i_73_, 256, i_74_, false);
			do {
				if ((aByte2625 ^ 0xffffffff) != -4) {
					if (aByte2625 == 0)
						break;
					i_78_ |= 0x2;
					if (!client.f_ob)
						break;
				}
				i_78_ |= 0x7;
			} while (false);
			if ((i_70_ ^ 0xffffffff) == -11 && i_76_ > 3)
				i_78_ |= 0x5;
			Class_t class_t;
			synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3558) {
				if (i >= -63)
					return null;
				class_t = (Class_t) ((Class251) ((Class185) this).aClass251_2610).aClass54_3558.method379(l, (byte) 58);
			}
			if (class_t == null || class260.method1710(class_t.P(), i_78_) != 0) {
				if (class_t != null)
					i_78_ = class260.method1723(i_78_, class_t.P());
				class_t = method1212((byte) 17, class260, i_76_, i_70_, i_78_);
				if (class_t == null)
					return null;
				synchronized (((Class251) ((Class185) this).aClass251_2610).aClass54_3558) {
					((Class251) ((Class185) this).aClass251_2610).aClass54_3558.method371(1, l, class_t);
				}
			}
			boolean bool = false;
			if (class124 != null) {
				class_t = class124.method849(i_73_, (byte) 1, class_t, i_72_, i_74_, 0x3 & i_76_, i_78_, 256);
				bool = true;
			}
			if ((i_70_ ^ 0xffffffff) == -11 && (i_76_ ^ 0xffffffff) < -4) {
				if (!bool) {
					class_t = class_t.method678((byte) 3, i_78_, true);
					bool = true;
				}
				class_t.Q(2048);
			}
			if (aByte2625 != 0) {
				if (!bool) {
					bool = true;
					class_t = class_t.method678((byte) 3, i_78_, true);
				}
				class_t.h(aByte2625, f_mb, class210_79_, class210, i_75_, i_71_, i_77_);
			}
			if (bool)
				class_t.UA(i_80_);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.M(" + i + ',' + i_70_ + ',' + i_71_ + ',' + i_72_ + ',' + i_73_ + ',' + (class260 != null ? "{...}" : "null") + ',' + (class124 != null ? "{...}" : "null") + ',' + i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ',' + (class210 != null ? "{...}" : "null") + ',' + (class210_79_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1216(byte i, boolean bool, String string) {
		try {
			if (i <= -109) {
				anInt2624++;
				if (string != null) {
					if (Class235.anInt3266 >= 100)
						Class_v.method692((byte) -99, (Class249.aClass67_3497.method436(true, Class_j.anInt1485)));
					else {
						String string_81_ = Class64.method424(string, (byte) -64);
						if (string_81_ != null) {
							for (int i_82_ = 0; ((Class235.anInt3266 ^ 0xffffffff) < (i_82_ ^ 0xffffffff)); i_82_++) {
								String string_83_ = Class64.method424((Class38_Sub1_Sub1.aStringArray6762[i_82_]), (byte) -69);
								if (string_83_ != null && string_83_.equals(string_81_)) {
									Class_v.method692((byte) -99, string + (Class100.aClass67_1300.method436(true, Class_j.anInt1485)));
									return;
								}
								if (Class246_Sub1_Sub17.aStringArray6745[i_82_] != null) {
									String string_84_ = (Class64.method424((Class246_Sub1_Sub17.aStringArray6745[i_82_]), (byte) -116));
									if (string_84_ != null && string_84_.equals(string_81_)) {
										Class_v.method692((byte) -99, string + (Class100.aClass67_1300.method436(true, Class_j.anInt1485)));
										return;
									}
								}
							}
							for (int i_85_ = 0; i_85_ < Class246_Sub7.anInt3969; i_85_++) {
								String string_86_ = Class64.method424(Class103.f_gb[i_85_], (byte) -98);
								if (string_86_ != null && string_86_.equals(string_81_)) {
									Class_v.method692((byte) -99, ((Class138.aClass67_1968.method436(true, Class_j.anInt1485)) + string + (Class_ls.aClass67_965.method436(true, Class_j.anInt1485))));
									return;
								}
								if (Class33.aStringArray446[i_85_] != null) {
									String string_87_ = Class64.method424((Class33.aStringArray446[i_85_]), (byte) -71);
									if (string_87_ != null && string_87_.equals(string_81_)) {
										Class_v.method692((byte) -99, ((Class138.aClass67_1968.method436(true, Class_j.anInt1485)) + string + (Class_ls.aClass67_965.method436(true, Class_j.anInt1485))));
										return;
									}
								}
							}
							if (Class64.method424(((Player) Class_a.aClass_r_Sub1_1180).aString7140, (byte) -85).equals(string_81_))
								Class_v.method692((byte) -99, Class186.aClass67_2637.method436(true, Class_j.anInt1485));
							else {
								Class243.writePacket(-126, (Class246_Sub11.ADD_IGNORE_PACKET));
								Class156.anInt2232++;
								Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -126) + 1);
								Class130_Sub1.stream.writeString(100, string);
								Class130_Sub1.stream.writeByte(255, bool ? 1 : 0);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.I(" + i + ',' + bool + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1217(BufferStream stream, int i) {
		do {
			try {
				for (;;) {
					int i_88_ = stream.readUnsignedByte(255);
					if ((i_88_ ^ 0xffffffff) == -1)
						break;
					method1214(stream, i_88_, -2);
				}
				anInt2585++;
				if (i >= 90)
					break;
				((Class185) this).anInt2609 = 7;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rd.H(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final String method1218(int i, String string, int i_89_) {
		try {
			if (i > -114)
				return null;
			f_ib++;
			if (f_eb == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) f_eb.method544((long) i_89_, 126);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rd.F(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_89_ + ')'));
		}
	}

	public Class185() {
		((Class185) this).anInt2572 = -1;
		((Class185) this).anInt2593 = 16;
		((Class185) this).aStringArray2595 = new String[5];
		anInt2589 = 0;
		((Class185) this).anInt2578 = 255;
		((Class185) this).aBool2594 = false;
		((Class185) this).anInt2579 = -1;
		anInt2571 = 0;
		((Class185) this).anInt2596 = 1;
		((Class185) this).anInt2598 = -1;
		((Class185) this).aBool2584 = false;
		((Class185) this).aBool2611 = false;
		((Class185) this).anInt2597 = 0;
		((Class185) this).aBool2604 = false;
		((Class185) this).aBool2601 = false;
		((Class185) this).anIntArray2586 = null;
		anInt2612 = 0;
		((Class185) this).anInt2590 = -1;
		((Class185) this).anInt2609 = -1;
		((Class185) this).aBool2620 = true;
		anInt2599 = 128;
		aByte2614 = (byte) 0;
		((Class185) this).aBool2583 = true;
		f_db = 0;
		((Class185) this).aBool2619 = false;
		anInt2617 = 128;
		((Class185) this).aBool2618 = false;
		((Class185) this).f_kb = -1;
		((Class185) this).f_vb = true;
		((Class185) this).f_ab = true;
		f_mb = -1;
		((Class185) this).anInt2623 = 0;
		((Class185) this).f_hb = 0;
		anInt2615 = 0;
		anIntArray2580 = null;
		((Class185) this).f_pb = -1;
		aByte2625 = (byte) 0;
		((Class185) this).anInt2600 = -1;
		((Class185) this).f_ub = -1;
		f_gb = 0;
		((Class185) this).anInt2616 = -1;
		anInt2588 = -1;
		((Class185) this).anInt2622 = 0;
		((Class185) this).f_wb = "null";
		((Class185) this).f_qb = false;
		((Class185) this).anInt2631 = 0;
		((Class185) this).anInt2603 = -1;
		((Class185) this).f_fb = false;
		((Class185) this).anInt2634 = 2;
		((Class185) this).aBool2627 = false;
		anInt2606 = -1;
	}

	static {
		aClass201_2592 = new OutgoingPacket(39, 7);
	}
}
