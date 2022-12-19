/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class197 {
	int anInt2758 = 0;
	static short[] aShortArray2759 = { 6798, 8741, 25238, 4626, 4550 };
	static int anInt2760;
	private byte[] aByteArray2761;
	int anInt2762;
	private int anInt2763 = -1;
	private short[] aShortArray2764;
	int anInt2765;
	int anInt2766;
	static int anInt2767;
	static int anInt2768;
	static OutgoingPacket NPC_CLICK_1_PACKET_NEW;
	static BufferStream[] aStreamArray2770 = new BufferStream[2048];
	private int anInt2771;
	int[] anIntArray2772;
	static int anInt2773;
	boolean aBool2774;
	private int anInt2775;
	int anInt2776;
	private int anInt2777 = 0;
	String aString2778;
	String[] aStringArray2779;
	int anInt2780;
	private int anInt2781 = 0;
	int[] anIntArray2782;
	int anInt2783;
	private short[] aShortArray2784;
	int anInt2785;
	static int anInt2786;
	private int anInt2787;
	static int anInt2788;
	static int anInt2789;
	int anInt2790;
	private int anInt2791;
	private int anInt2792;
	private int anInt2793;
	boolean aBool2794;
	private int anInt2795;
	String[] aStringArray2796;
	private short[] aShortArray2797;
	private int anInt2798;
	static int anInt2799;
	private int anInt2800;
	int anInt2801;
	int anInt2802;
	int anInt2803;
	static int anInt2804;
	int anInt2805;
	int anInt2806;
	int anInt2807;
	static int anInt2808;
	private int anInt2809;
	int f_ab;
	private int f_bb;
	int f_cb;
	static int f_db;
	int f_eb;
	int f_fb;
	int[] f_gb;
	static int f_hb;
	private short[] f_ib;
	static int f_jb;
	private int f_kb;
	int f_lb;
	static int f_mb;
	private int f_nb;
	Class191 f_ob;
	int f_pb;
	static int f_qb;
	static int f_rb;
	private int f_sb;
	int f_tb;
	private int f_ub;
	static int f_vb;
	private int f_wb;
	Class85 aClass85_2810;
	static int anInt2811;
	private int anInt2812;
	int anInt2813;
	static int anInt2814;
	static int anInt2815;
	int anInt2816;
	int anInt2817;
	static int anInt2818;

	final Class_t method1281(int i, int i_0_, Class124 class124, int i_1_, int i_2_, Class27 class27, int i_3_, int i_4_, Class260 class260) {
		try {
			f_rb++;
			if (i_4_ > -120)
				return null;
			if (((Class197) this).anIntArray2782 != null && i_0_ > 1) {
				int i_5_ = -1;
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -11; i_6_++) {
					if ((i_0_ ^ 0xffffffff) <= (((Class197) this).f_gb[i_6_] ^ 0xffffffff) && (((Class197) this).f_gb[i_6_] ^ 0xffffffff) != -1)
						i_5_ = ((Class197) this).anIntArray2782[i_6_];
				}
				if (i_5_ != -1)
					return (((Class197) this).f_ob.method1251(22883, i_5_).method1281(i, 1, class124, i_1_, i_2_, class27, i_3_, -128, class260));
			}
			int i_7_ = i_1_;
			if (class124 != null)
				i_7_ |= class124.method847(i_3_, 256, i_2_, true);
			Class_t class_t;
			synchronized (((Class191) ((Class197) this).f_ob).aClass54_2700) {
				class_t = ((Class_t) (((Class191) ((Class197) this).f_ob).aClass54_2700.method379((long) (((Class197) this).f_pb | ((Class260) class260).anInt3719 << 29), (byte) 58)));
			}
			if (class_t == null || class260.method1710(class_t.P(), i_7_) != 0) {
				if (class_t != null)
					i_7_ = class260.method1723(i_7_, class_t.P());
				int i_8_ = i_7_;
				if (aShortArray2797 != null)
					i_8_ |= 0x8000;
				if (f_ib != null || class27 != null)
					i_8_ |= 0x4000;
				if (anInt2812 != 128)
					i_8_ |= 0x1;
				if (anInt2812 != 128)
					i_8_ |= 0x2;
				if (anInt2812 != 128)
					i_8_ |= 0x4;
				Class103 class103 = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, f_wb);
				if (class103 == null)
					return null;
				if (((Class103) class103).anInt1358 < 13)
					class103.method646(0, (byte) -73);
				class_t = class260.method1695(class103, i_8_, (((Class191) ((Class197) this).f_ob).anInt2705), anInt2771 + 64, 850 - -anInt2793);
				if ((anInt2812 ^ 0xffffffff) != -129 || (anInt2791 ^ 0xffffffff) != -129 || anInt2798 != 128)
					class_t.H(anInt2812, anInt2791, anInt2798);
				if (f_ib != null) {
					for (int i_9_ = 0; i_9_ < f_ib.length; i_9_++) {
						if (aByteArray2761 != null && (i_9_ ^ 0xffffffff) > (aByteArray2761.length ^ 0xffffffff))
							class_t.BA(f_ib[i_9_], (Class90.aShortArray1172[aByteArray2761[i_9_] & 0xff]));
						else
							class_t.BA(f_ib[i_9_], aShortArray2764[i_9_]);
					}
				}
				if (aShortArray2797 != null) {
					for (int i_10_ = 0; aShortArray2797.length > i_10_; i_10_++)
						class_t.I(aShortArray2797[i_10_], aShortArray2784[i_10_]);
				}
				if (class27 != null) {
					for (int i_11_ = 0; i_11_ < 5; i_11_++) {
						if (((Class27) class27).anIntArray373[i_11_] < (Class246_Sub30_Sub1.aShortArrayArray5767[i_11_]).length)
							class_t.BA(Class160.aShortArray2270[i_11_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_11_][(((Class27) class27).anIntArray373[i_11_])]));
						if (((Class27) class27).anIntArray373[i_11_] < (Class246_Sub1_Sub2.aShortArrayArray5693[i_11_]).length)
							class_t.BA(Node.aShortArray3466[i_11_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_11_][(((Class27) class27).anIntArray373[i_11_])]));
					}
				}
				class_t.UA(i_7_);
				synchronized (((Class191) ((Class197) this).f_ob).aClass54_2700) {
					((Class191) ((Class197) this).f_ob).aClass54_2700.method371(1, (long) (((Class260) class260).anInt3719 << 29 | ((Class197) this).f_pb), class_t);
				}
			}
			if (class124 != null)
				class_t = class124.method846(i, i_7_, i_2_, i_3_, class_t, -108);
			class_t.UA(i_1_);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.M(" + i + ',' + i_0_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + (class27 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method1282(Class27 class27, boolean bool, Class116 class116, int i, int i_12_, int i_13_, int i_14_, Class260 class260, int i_15_, Class260 class260_16_) {
		try {
			anInt2788++;
			Class103 class103 = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, f_wb);
			if (class103 == null)
				return null;
			if (((Class103) class103).anInt1358 < 13)
				class103.method646(0, (byte) -44);
			if (f_ib != null) {
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (f_ib.length ^ 0xffffffff); i_17_++) {
					if (aByteArray2761 != null && aByteArray2761.length > i_17_)
						class103.method662(f_ib[i_17_], (Class90.aShortArray1172[0xff & aByteArray2761[i_17_]]), false);
					else
						class103.method662(f_ib[i_17_], aShortArray2764[i_17_], false);
				}
			}
			if (aShortArray2797 != null) {
				for (int i_18_ = 0; ((aShortArray2797.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
					class103.method645(aShortArray2784[i_18_], 0, aShortArray2797[i_18_]);
			}
			if (class27 != null) {
				for (int i_19_ = 0; i_19_ < 5; i_19_++) {
					if ((((Class27) class27).anIntArray373[i_19_] ^ 0xffffffff) > ((Class246_Sub30_Sub1.aShortArrayArray5767[i_19_]).length ^ 0xffffffff))
						class103.method662(Class160.aShortArray2270[i_19_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_19_][(((Class27) class27).anIntArray373[i_19_])]), false);
					if ((((Class27) class27).anIntArray373[i_19_] ^ 0xffffffff) > ((Class246_Sub1_Sub2.aShortArrayArray5693[i_19_]).length ^ 0xffffffff))
						class103.method662(Node.aShortArray3466[i_19_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_19_][(((Class27) class27).anIntArray373[i_19_])]), false);
				}
			}
			int i_20_ = 2048;
			boolean bool_21_ = false;
			if ((anInt2812 ^ 0xffffffff) != -129 || anInt2791 != 128 || (anInt2798 ^ 0xffffffff) != -129) {
				bool_21_ = true;
				i_20_ |= 0x7;
			}
			Class_t class_t = class260_16_.method1695(class103, i_20_, 0, 64 + anInt2771, anInt2793 + 768);
			if (!class_t.method681())
				return null;
			if (bool_21_)
				class_t.H(anInt2812, anInt2791, anInt2798);
			Class_l class_l = null;
			if ((((Class197) this).f_tb ^ 0xffffffff) == 0) {
				if ((((Class197) this).anInt2817 ^ 0xffffffff) != 0) {
					class_l = ((Class197) this).f_ob.method1247(false, class27, class116, (((Class197) this).anInt2785), 0, class260_16_, true, i, i_15_, i_12_, true, class260);
					if (class_l == null)
						return null;
				}
			} else {
				class_l = ((Class197) this).f_ob.method1247(true, class27, class116, ((Class197) this).f_cb, 0, class260_16_, true, 10, 0, 1, true, class260);
				if (class_l == null)
					return null;
			}
			int i_22_;
			if (!bool) {
				if (i_12_ != 2)
					i_22_ = ((Class197) this).anInt2783 << 0;
				else
					i_22_ = (int) ((double) ((Class197) this).anInt2783 * 1.04) << 0;
			} else
				i_22_ = (int) ((double) ((Class197) this).anInt2783 * 1.5) << 0;
			class260_16_.H(16, 16, 512, 512);
			Class_c class_c = class260_16_.method1715();
			class_c.xa();
			class260_16_.ea(class_c);
			class260_16_.B(1.0F);
			class260_16_.T(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
			Class_c class_c_23_ = class260_16_.method1730();
			class_c_23_.O(-((Class197) this).anInt2780 << 3);
			class_c_23_.ja(((Class197) this).anInt2758 << 3);
			class_c_23_.o(((Class197) this).anInt2802, ((Class39_Sub1.f_fb[((Class197) this).anInt2776 << 3] * i_22_) >> 15) - class_t.MA() / 2 - -((Class197) this).f_lb, (i_22_ * (Class39_Sub1.anIntArray4672[((Class197) this).anInt2776 << 3]) >> 15) + ((Class197) this).f_lb);
			class_c_23_.ka(((Class197) this).anInt2776 << 3);
			int i_24_ = class260_16_.a();
			int i_25_ = class260_16_.YA();
			class260_16_.ia(50, 2147483647);
			class260_16_.method1707();
			class260_16_.e();
			class260_16_.O(0, 0, 36, 32, 0, 0);
			class_t.method680(class_c_23_, null, 1);
			class260_16_.ia(i_24_, i_25_);
			int[] is = class260_16_.F(0, 0, 36, 32);
			if ((i_12_ ^ 0xffffffff) <= -2) {
				is = method1283(is, i_13_ ^ 0x41f1, -16777214);
				if ((i_12_ ^ 0xffffffff) <= -3)
					is = method1283(is, 16881, -1);
			}
			if ((i_15_ ^ 0xffffffff) != -1)
				method1290(10624, i_15_, is);
			class260_16_.method1706(is, 0, 36, 36, 32).method729(0, i_13_);
			if ((((Class197) this).f_tb ^ 0xffffffff) != 0)
				class_l.method729(0, 0);
			else if ((((Class197) this).anInt2817 ^ 0xffffffff) != 0)
				class_l.method729(0, 0);
			if ((i_14_ ^ 0xffffffff) == -2 || i_14_ == 2 && (((Class197) this).f_eb == 1 || (i ^ 0xffffffff) != -2) && i != -1)
				class116.method794(-16777215, -256, method1286(i, -18536), 9, 0, 0);
			is = class260_16_.F(0, 0, 36, 32);
			for (int i_26_ = 0; i_26_ < is.length; i_26_++) {
				if ((is[i_26_] & 0xffffff) != 0)
					is[i_26_] = Class236.method1523(is[i_26_], -16777216);
				else
					is[i_26_] = 0;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.A(" + (class27 != null ? "{...}" : "null") + ',' + bool + ',' + (class116 != null ? "{...}" : "null") + ',' + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_15_ + ',' + (class260_16_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final int[] method1283(int[] is, int i, int i_27_) {
		try {
			anInt2814++;
			int[] is_28_ = new int[1152];
			if (i != 16881)
				((Class197) this).anIntArray2782 = null;
			int i_29_ = 0;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -33; i_30_++) {
				for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -37; i_31_++) {
					int i_32_ = is[i_29_];
					if (i_32_ == 0) {
						if ((i_31_ ^ 0xffffffff) >= -1 || is[i_29_ - 1] == 0) {
							if ((i_30_ ^ 0xffffffff) < -1 && is[-36 + i_29_] != 0)
								i_32_ = i_27_;
							else if ((i_31_ ^ 0xffffffff) > -36 && (is[1 + i_29_] ^ 0xffffffff) != -1)
								i_32_ = i_27_;
							else if ((i_30_ ^ 0xffffffff) > -32 && (is[i_29_ + 36] ^ 0xffffffff) != -1)
								i_32_ = i_27_;
						} else
							i_32_ = i_27_;
					}
					is_28_[i_29_++] = i_32_;
				}
			}
			return is_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.G(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_27_ + ')'));
		}
	}

	final boolean method1284(int i, boolean bool) {
		try {
			if (i < 110)
				return false;
			anInt2767++;
			int i_33_ = f_kb;
			int i_34_ = anInt2763;
			if (bool) {
				i_33_ = anInt2795;
				i_34_ = f_bb;
			}
			if (i_33_ == -1)
				return true;
			boolean bool_35_ = true;
			if (!((Class191) ((Class197) this).f_ob).aClass_fs2691.method85(0, (byte) -124, i_33_))
				bool_35_ = false;
			if (i_34_ != -1 && !((Class191) ((Class197) this).f_ob).aClass_fs2691.method85(0, (byte) -124, i_34_))
				bool_35_ = false;
			return bool_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.E(" + i + ',' + bool + ')');
		}
	}

	static final void method1285(int i, int i_36_, int i_37_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_36_][i_37_];
		if (class147 != null) {
			if (((Class147) class147).aClass59_Sub4_2172 != null)
				((Class147) class147).aClass59_Sub4_2172 = null;
			if (((Class147) class147).aClass59_Sub4_2152 != null)
				((Class147) class147).aClass59_Sub4_2152 = null;
		}
	}

	private final String method1286(int i, int i_38_) {
		try {
			f_jb++;
			if (i < 100000)
				return "<col=ffff00>" + i + "</col>";
			if (i < 10000000)
				return ("<col=ffffff>" + i / 1000 + Class99.aClass67_1287.method436(true, ((Class191) (((Class197) this).f_ob)).anInt2692) + "</col>");
			if (i_38_ != -18536)
				((Class197) this).anInt2807 = 124;
			return ("<col=00ff80>" + i / 1000000 + Class_j.aClass67_1486.method436(true, (((Class191) ((Class197) this).f_ob).anInt2692)) + "</col>");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.I(" + i + ',' + i_38_ + ')');
		}
	}

	final void method1287(Class197 class197_39_, Class197 class197_40_, boolean bool) {
		try {
			f_bb = class197_39_.f_bb;
			aShortArray2797 = class197_39_.aShortArray2797;
			anInt2799++;
			anInt2800 = class197_39_.anInt2800;
			anInt2775 = class197_39_.anInt2775;
			anInt2792 = class197_39_.anInt2792;
			f_nb = class197_39_.f_nb;
			((Class197) this).f_fb = 0;
			((Class197) this).aStringArray2796 = ((Class197) class197_39_).aStringArray2796;
			anInt2763 = class197_39_.anInt2763;
			((Class197) this).aString2778 = ((Class197) class197_39_).aString2778;
			((Class197) this).anInt2783 = ((Class197) class197_40_).anInt2783;
			((Class197) this).anInt2776 = ((Class197) class197_40_).anInt2776;
			anInt2795 = class197_39_.anInt2795;
			f_ib = class197_39_.f_ib;
			((Class197) this).anInt2780 = ((Class197) class197_40_).anInt2780;
			f_ub = class197_39_.f_ub;
			anInt2781 = class197_39_.anInt2781;
			f_sb = class197_39_.f_sb;
			aShortArray2764 = class197_39_.aShortArray2764;
			((Class197) this).anInt2802 = ((Class197) class197_40_).anInt2802;
			f_kb = class197_39_.f_kb;
			((Class197) this).anInt2806 = ((Class197) class197_39_).anInt2806;
			((Class197) this).f_lb = ((Class197) class197_40_).f_lb;
			aByteArray2761 = class197_39_.aByteArray2761;
			((Class197) this).anInt2813 = ((Class197) class197_39_).anInt2813;
			aShortArray2784 = class197_39_.aShortArray2784;
			((Class197) this).aClass85_2810 = ((Class197) class197_39_).aClass85_2810;
			((Class197) this).aBool2794 = ((Class197) class197_39_).aBool2794;
			((Class197) this).anInt2758 = ((Class197) class197_40_).anInt2758;
			anInt2777 = class197_39_.anInt2777;
			anInt2787 = class197_39_.anInt2787;
			((Class197) this).anInt2807 = ((Class197) class197_39_).anInt2807;
			f_wb = class197_40_.f_wb;
			anInt2809 = class197_39_.anInt2809;
			((Class197) this).aStringArray2779 = new String[5];
			if (((Class197) class197_39_).aStringArray2779 != null) {
				for (int i = 0; (i ^ 0xffffffff) > -5; i++)
					((Class197) this).aStringArray2779[i] = ((Class197) class197_39_).aStringArray2779[i];
			}
			((Class197) this).aStringArray2779[4] = Class18.aClass67_267.method436(bool, (((Class191) ((Class197) this).f_ob).anInt2692));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.S(" + (class197_39_ != null ? "{...}" : "null") + ',' + (class197_40_ != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method1288(int i, BufferStream stream, int i_41_) {
		try {
			if (i_41_ == 0) {
				f_db++;
				if ((i ^ 0xffffffff) == -2)
					f_wb = stream.readUnsignedShort((byte) 84);
				else if (i != 2) {
					if ((i ^ 0xffffffff) != -5) {
						if (i != 5) {
							if (i != 6) {
								if (i != 7) {
									if ((i ^ 0xffffffff) == -9) {
										((Class197) this).f_lb = stream.readUnsignedShort((byte) 104);
										if (((Class197) this).f_lb > 32767)
											((Class197) this).f_lb -= 65536;
										((Class197) this).f_lb <<= 0;
									} else if ((i ^ 0xffffffff) == -12)
										((Class197) this).f_eb = 1;
									else if (i != 12) {
										if (i == 16)
											((Class197) this).aBool2794 = true;
										else if ((i ^ 0xffffffff) != -24) {
											if ((i ^ 0xffffffff) != -25) {
												if (i != 25) {
													if ((i ^ 0xffffffff) != -27) {
														if (i >= 30 && ((i ^ 0xffffffff) > -36))
															((Class197) this).aStringArray2796[-30 + i] = (stream.readString((byte) -40));
														else if (((i ^ 0xffffffff) <= -36) && ((i ^ 0xffffffff) > -41))
															((Class197) this).aStringArray2779[i - 35] = (stream.readString((byte) -40));
														else if ((i ^ 0xffffffff) == -41) {
															int i_42_ = (stream.readUnsignedByte(255));
															aShortArray2764 = (new short[i_42_]);
															f_ib = (new short[i_42_]);
															for (int i_43_ = 0; ((i_42_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)); i_43_++) {
																f_ib[i_43_] = (short) stream.readUnsignedShort((byte) 125);
																aShortArray2764[i_43_] = (short) stream.readUnsignedShort((byte) -113);
															}
														} else if (i != 41) {
															if ((i ^ 0xffffffff) == -43) {
																int i_44_ = (stream.readUnsignedByte(255));
																aByteArray2761 = (new byte[i_44_]);
																for (int i_45_ = 0; ((i_45_ ^ 0xffffffff) > (i_44_ ^ 0xffffffff)); i_45_++)
																	aByteArray2761[i_45_] = (stream.readByte(false));
															} else if ((i ^ 0xffffffff) == -66)
																((Class197) this).aBool2774 = true;
															else if (i == 78)
																f_nb = (stream.readUnsignedShort((byte) -99));
															else if (i != 79) {
																if ((i ^ 0xffffffff) != -91) {
																	if ((i ^ 0xffffffff) == -92)
																		anInt2795 = stream.readUnsignedShort((byte) -117);
																	else if (i != 92) {
																		if (i == 93)
																			f_bb = stream.readUnsignedShort((byte) 90);
																		else if ((i ^ 0xffffffff) == -96)
																			((Class197) this).anInt2780 = stream.readUnsignedShort((byte) 104);
																		else if (i == 96)
																			((Class197) this).anInt2801 = stream.readUnsignedByte(255);
																		else if (i != 97) {
																			if ((i ^ 0xffffffff) != -99) {
																				if (i < 100 || i >= 110) {
																					if (i != 110) {
																						if ((i ^ 0xffffffff) == -112)
																							anInt2791 = stream.readUnsignedShort((byte) -117);
																						else if (i == 112)
																							anInt2798 = stream.readUnsignedShort((byte) 110);
																						else if ((i ^ 0xffffffff) == -114)
																							anInt2771 = stream.readByte(false);
																						else if (i == 114)
																							anInt2793 = stream.readByte(false) * 5;
																						else if (i != 115) {
																							if ((i ^ 0xffffffff) == -122)
																								((Class197) this).anInt2785 = stream.readUnsignedShort((byte) -57);
																							else if (i != 122) {
																								if ((i ^ 0xffffffff) == -126) {
																									f_sb = stream.readByte(false) << 0;
																									anInt2787 = stream.readByte(false) << 0;
																									anInt2781 = stream.readByte(false) << 0;
																								} else if ((i ^ 0xffffffff) == -127) {
																									anInt2792 = stream.readByte(false) << 0;
																									anInt2775 = stream.readByte(false) << 0;
																									anInt2777 = stream.readByte(false) << 0;
																								} else if ((i ^ 0xffffffff) == -128) {
																									((Class197) this).anInt2762 = stream.readUnsignedByte(i_41_ ^ 0xff);
																									((Class197) this).anInt2805 = stream.readUnsignedShort((byte) -97);
																								} else if (i == 128) {
																									((Class197) this).anInt2803 = stream.readUnsignedByte(255);
																									((Class197) this).anInt2766 = stream.readUnsignedShort((byte) 123);
																								} else if (i == 129) {
																									((Class197) this).anInt2790 = stream.readUnsignedByte(255);
																									((Class197) this).f_ab = stream.readUnsignedShort((byte) 124);
																								} else if (i == 130) {
																									((Class197) this).anInt2816 = stream.readUnsignedByte(255);
																									((Class197) this).anInt2765 = stream.readUnsignedShort((byte) 87);
																								} else if (i != 132) {
																									if ((i ^ 0xffffffff) == -250) {
																										int i_46_ = stream.readUnsignedByte(255);
																										if (((Class197) this).aClass85_2810 == null) {
																											int i_47_ = Class206.method1350(i_46_, 269173057);
																											((Class197) this).aClass85_2810 = new Class85(i_47_);
																										}
																										for (int i_48_ = 0; i_46_ > i_48_; i_48_++) {
																											boolean bool = stream.readUnsignedByte(255) == 1;
																											int i_49_ = stream.read24BitInteger((byte) 29);
																											Node class246;
																											if (bool)
																												class246 = new Class246_Sub4(stream.readString((byte) -40));
																											else
																												class246 = new IntegerNode(stream.readInt((byte) 114));
																											((Class197) this).aClass85_2810.method547((long) i_49_, i_41_ ^ ~0x8fc, class246);
																										}
																									}
																								} else {
																									int i_50_ = stream.readUnsignedByte(255);
																									((Class197) this).anIntArray2772 = new int[i_50_];
																									for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff); i_51_++)
																										((Class197) this).anIntArray2772[i_51_] = stream.readUnsignedShort((byte) -87);
																								}
																							} else
																								((Class197) this).anInt2817 = stream.readUnsignedShort((byte) 115);
																						} else
																							((Class197) this).anInt2813 = stream.readUnsignedByte(255);
																					} else
																						anInt2812 = stream.readUnsignedShort((byte) 101);
																				} else {
																					if (((Class197) this).anIntArray2782 == null) {
																						((Class197) this).anIntArray2782 = new int[10];
																						((Class197) this).f_gb = new int[10];
																					}
																					((Class197) this).anIntArray2782[-100 + i] = stream.readUnsignedShort((byte) 107);
																					((Class197) this).f_gb[i - 100] = stream.readUnsignedShort((byte) 99);
																				}
																			} else
																				((Class197) this).f_tb = stream.readUnsignedShort((byte) -75);
																		} else
																			((Class197) this).f_cb = stream.readUnsignedShort((byte) 97);
																	} else
																		anInt2763 = stream.readUnsignedShort((byte) -51);
																} else
																	f_kb = (stream.readUnsignedShort((byte) -97));
															} else
																anInt2809 = (stream.readUnsignedShort((byte) 127));
														} else {
															int i_52_ = (stream.readUnsignedByte(255));
															aShortArray2784 = (new short[i_52_]);
															aShortArray2797 = (new short[i_52_]);
															for (int i_53_ = 0; ((i_52_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
																aShortArray2797[i_53_] = (short) stream.readUnsignedShort((byte) -102);
																aShortArray2784[i_53_] = (short) stream.readUnsignedShort((byte) 100);
															}
														}
													} else
														anInt2800 = (stream.readUnsignedShort((byte) 94));
												} else
													((Class197) this).anInt2806 = (stream.readUnsignedShort((byte) 81));
											} else
												f_ub = (stream.readUnsignedShort((byte) -72));
										} else
											((Class197) this).anInt2807 = stream.readUnsignedShort((byte) -117);
									} else
										((Class197) this).f_fb = stream.readInt((byte) 122);
								} else {
									((Class197) this).anInt2802 = stream.readUnsignedShort((byte) -46);
									if (((Class197) this).anInt2802 > 32767)
										((Class197) this).anInt2802 -= 65536;
									((Class197) this).anInt2802 <<= 0;
								}
							} else
								((Class197) this).anInt2758 = stream.readUnsignedShort((byte) -62);
						} else
							((Class197) this).anInt2776 = stream.readUnsignedShort((byte) -30);
					} else
						((Class197) this).anInt2783 = stream.readUnsignedShort((byte) 101);
				} else
					((Class197) this).aString2778 = stream.readString((byte) -40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.L(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_41_ + ')'));
		}
	}

	final int method1289(int i, int i_54_, int i_55_) {
		try {
			anInt2768++;
			if (((Class197) this).aClass85_2810 == null)
				return i_55_;
			IntegerNode class246_sub33 = ((IntegerNode) ((Class197) this).aClass85_2810.method544((long) i, 127));
			int i_56_ = 52 / ((i_54_ + 40) / 62);
			if (class246_sub33 == null)
				return i_55_;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.F(" + i + ',' + i_54_ + ',' + i_55_ + ')'));
		}
	}

	private final void method1290(int i, int i_57_, int[] is) {
		try {
			for (int i_58_ = 31; i_58_ > 0; i_58_--) {
				int i_59_ = 36 * i_58_;
				for (int i_60_ = 35; i_60_ > 0; i_60_--) {
					if (is[i_59_ + i_60_] == 0 && is[i_59_ + (i_60_ - 37)] != 0)
						is[i_60_ - -i_59_] = i_57_;
				}
			}
			if (i != 10624)
				anInt2798 = -113;
			anInt2786++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.D(" + i + ',' + i_57_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Class103 method1291(boolean bool, int i) {
		try {
			anInt2773++;
			int i_61_ = ((Class197) this).anInt2807;
			int i_62_ = f_ub;
			int i_63_ = f_nb;
			if (bool) {
				i_63_ = anInt2809;
				i_61_ = ((Class197) this).anInt2806;
				i_62_ = anInt2800;
			}
			if (i == (i_61_ ^ 0xffffffff))
				return null;
			Class103 class103 = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, i_61_);
			if ((((Class103) class103).anInt1358 ^ 0xffffffff) > -14)
				class103.method646(0, (byte) -98);
			if ((i_62_ ^ 0xffffffff) != 0) {
				Class103 class103_64_ = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, i_62_);
				if (((Class103) class103_64_).anInt1358 < 13)
					class103_64_.method646(0, (byte) -101);
				if ((i_63_ ^ 0xffffffff) != 0) {
					Class103 class103_65_ = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, i_63_);
					if (((Class103) class103_65_).anInt1358 < 13)
						class103_65_.method646(0, (byte) -91);
					Class103[] class103s = { class103, class103_64_, class103_65_ };
					class103 = new Class103(class103s, 3);
				} else {
					Class103[] class103s = { class103, class103_64_ };
					class103 = new Class103(class103s, 2);
				}
			}
			if (class103 == null)
				return null;
			if (!bool && ((f_sb ^ 0xffffffff) != -1 || anInt2787 != 0 || (anInt2781 ^ 0xffffffff) != -1))
				class103.method648(anInt2787, f_sb, anInt2781, -35);
			if (bool && (anInt2792 != 0 || anInt2775 != 0 || anInt2777 != 0))
				class103.method648(anInt2775, anInt2792, anInt2777, -58);
			if (f_ib != null) {
				for (int i_66_ = 0; f_ib.length > i_66_; i_66_++)
					class103.method662(f_ib[i_66_], aShortArray2764[i_66_], false);
			}
			if (aShortArray2797 != null) {
				for (int i_67_ = 0; ((aShortArray2797.length ^ 0xffffffff) < (i_67_ ^ 0xffffffff)); i_67_++)
					class103.method645(aShortArray2784[i_67_], 0, aShortArray2797[i_67_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.O(" + bool + ',' + i + ')');
		}
	}

	final boolean method1292(int i, boolean bool) {
		try {
			f_qb++;
			int i_68_ = ((Class197) this).anInt2807;
			int i_69_ = f_ub;
			int i_70_ = f_nb;
			if (bool) {
				i_70_ = anInt2809;
				i_69_ = anInt2800;
				i_68_ = ((Class197) this).anInt2806;
			}
			if (i_68_ == i)
				return true;
			boolean bool_71_ = true;
			if (!((Class191) ((Class197) this).f_ob).aClass_fs2691.method85(0, (byte) -124, i_68_))
				bool_71_ = false;
			if ((i_69_ ^ 0xffffffff) != 0 && !((Class191) ((Class197) this).f_ob).aClass_fs2691.method85(0, (byte) -124, i_69_))
				bool_71_ = false;
			if (i_70_ != -1 && !((Class191) ((Class197) this).f_ob).aClass_fs2691.method85(0, (byte) -124, i_70_))
				bool_71_ = false;
			return bool_71_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.Q(" + i + ',' + bool + ')');
		}
	}

	static final int method1293(int i, byte i_72_) {
		try {
			if (i_72_ != -12)
				NPC_CLICK_1_PACKET_NEW = null;
			anInt2804++;
			return i >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.C(" + i + ',' + i_72_ + ')');
		}
	}

	public static void method1294(int i) {
		try {
			NPC_CLICK_1_PACKET_NEW = null;
			if (i == 0) {
				aStreamArray2770 = null;
				aShortArray2759 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.H(" + i + ')');
		}
	}

	final void method1295(int i, Class197 class197_73_, Class197 class197_74_) {
		try {
			((Class197) this).anInt2780 = ((Class197) class197_74_).anInt2780;
			anInt2760++;
			aShortArray2764 = class197_74_.aShortArray2764;
			f_ib = class197_74_.f_ib;
			((Class197) this).aString2778 = ((Class197) class197_73_).aString2778;
			((Class197) this).f_lb = ((Class197) class197_74_).f_lb;
			((Class197) this).anInt2783 = ((Class197) class197_74_).anInt2783;
			((Class197) this).anInt2776 = ((Class197) class197_74_).anInt2776;
			aShortArray2797 = class197_74_.aShortArray2797;
			((Class197) this).anInt2758 = ((Class197) class197_74_).anInt2758;
			((Class197) this).aBool2794 = ((Class197) class197_73_).aBool2794;
			aByteArray2761 = class197_74_.aByteArray2761;
			aShortArray2784 = class197_74_.aShortArray2784;
			if (i <= 108)
				method1282(null, true, null, -75, -3, -98, 22, null, -48, null);
			((Class197) this).f_eb = 1;
			f_wb = class197_74_.f_wb;
			((Class197) this).f_fb = ((Class197) class197_73_).f_fb;
			((Class197) this).anInt2802 = ((Class197) class197_74_).anInt2802;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.J(" + i + ',' + (class197_73_ != null ? "{...}" : "null") + ',' + (class197_74_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class197 method1296(int i, int i_75_) {
		try {
			if (i_75_ != 4223)
				((Class197) this).f_fb = -6;
			anInt2808++;
			if (((Class197) this).anIntArray2782 != null && (i ^ 0xffffffff) < -2) {
				int i_76_ = -1;
				for (int i_77_ = 0; i_77_ < 10; i_77_++) {
					if (((Class197) this).f_gb[i_77_] <= i && ((Class197) this).f_gb[i_77_] != 0)
						i_76_ = ((Class197) this).anIntArray2782[i_77_];
				}
				if (i_76_ != -1)
					return ((Class197) this).f_ob.method1251(22883, i_76_);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.B(" + i + ',' + i_75_ + ')');
		}
	}

	final String method1297(String string, int i, int i_78_) {
		try {
			f_hb++;
			if (((Class197) this).aClass85_2810 == null)
				return string;
			Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((Class197) this).aClass85_2810.method544((long) i_78_, 126));
			int i_79_ = -14 % ((52 - i) / 61);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rv.P(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_78_ + ')'));
		}
	}

	final void method1298(BufferStream stream, int i) {
		try {
			if (i >= -102)
				((Class197) this).aBool2774 = false;
			anInt2811++;
			for (;;) {
				int i_80_ = stream.readUnsignedByte(255);
				if (i_80_ == 0)
					break;
				method1288(i_80_, stream, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.R(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1299(int i) {
		do {
			try {
				f_vb++;
				if (i <= -51)
					break;
				((Class197) this).f_fb = -49;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rv.T(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class103 method1300(int i, boolean bool) {
		try {
			f_mb++;
			int i_81_ = f_kb;
			int i_82_ = anInt2763;
			if (bool) {
				i_81_ = anInt2795;
				i_82_ = f_bb;
			}
			if ((i_81_ ^ 0xffffffff) == 0)
				return null;
			Class103 class103 = Class206.method1349(i, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, i_81_);
			if ((((Class103) class103).anInt1358 ^ 0xffffffff) > -14)
				class103.method646(0, (byte) -83);
			if (i_82_ != -1) {
				Class103 class103_83_ = Class206.method1349(0, (((Class191) ((Class197) this).f_ob).aClass_fs2691), (byte) 89, i_82_);
				if (((Class103) class103_83_).anInt1358 < 13)
					class103_83_.method646(0, (byte) -106);
				Class103[] class103s = { class103, class103_83_ };
				class103 = new Class103(class103s, 2);
			}
			if (f_ib != null) {
				for (int i_84_ = 0; (f_ib.length ^ 0xffffffff) < (i_84_ ^ 0xffffffff); i_84_++)
					class103.method662(f_ib[i_84_], aShortArray2764[i_84_], false);
			}
			if (aShortArray2797 != null) {
				for (int i_85_ = 0; i_85_ < aShortArray2797.length; i_85_++)
					class103.method645(aShortArray2784[i_85_], i, aShortArray2797[i_85_]);
			}
			return class103;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rv.K(" + i + ',' + bool + ')');
		}
	}

	public Class197() {
		((Class197) this).anInt2765 = -1;
		((Class197) this).anInt2783 = 2000;
		((Class197) this).anInt2790 = -1;
		anInt2771 = 0;
		((Class197) this).anInt2780 = 0;
		((Class197) this).aBool2774 = false;
		anInt2792 = 0;
		((Class197) this).aBool2794 = false;
		((Class197) this).anInt2776 = 0;
		((Class197) this).anInt2785 = -1;
		((Class197) this).anInt2807 = -1;
		((Class197) this).anInt2803 = -1;
		((Class197) this).f_ab = -1;
		anInt2800 = -1;
		((Class197) this).anInt2801 = 0;
		((Class197) this).f_fb = 1;
		((Class197) this).f_lb = 0;
		((Class197) this).anInt2806 = -1;
		anInt2791 = 128;
		f_bb = -1;
		f_nb = -1;
		((Class197) this).anInt2762 = -1;
		anInt2793 = 0;
		((Class197) this).aString2778 = "null";
		anInt2787 = 0;
		((Class197) this).anInt2805 = -1;
		f_kb = -1;
		((Class197) this).f_tb = -1;
		((Class197) this).f_eb = 0;
		f_ub = -1;
		anInt2809 = -1;
		anInt2798 = 128;
		((Class197) this).anInt2802 = 0;
		((Class197) this).anInt2766 = -1;
		f_sb = 0;
		anInt2795 = -1;
		((Class197) this).f_cb = -1;
		((Class197) this).anInt2816 = -1;
		((Class197) this).anInt2813 = 0;
		anInt2775 = 0;
		((Class197) this).anInt2817 = -1;
		anInt2812 = 128;
	}

	static {
		NPC_CLICK_1_PACKET_NEW = new OutgoingPacket(13, 3);
		anInt2818 = 0;
		anInt2815 = 0;
	}
}
