/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253 {
	private byte[] aByteArray3568;
	boolean aBool3569;
	private short[] aShortArray3570;
	boolean aBool3571;
	static int anInt3572;
	private short[] aShortArray3573;
	int anInt3574;
	int anInt3575;
	static int anInt3576;
	int anInt3577;
	int anInt3578;
	private short[] aShortArray3579;
	int anInt3580;
	boolean aBool3581;
	private byte aByte3582 = 0;
	int anInt3583;
	static int anInt3584;
	int anInt3585;
	int anInt3586;
	int anInt3587;
	private int[][] anIntArrayArray3588;
	int anInt3589;
	private int[][] anIntArrayArray3590;
	private int anInt3591;
	int anInt3592;
	static int anInt3593;
	int[] anIntArray3594;
	static int anInt3595;
	boolean aBool3596;
	static int anInt3597;
	private byte aByte3598;
	private Class85 aClass85_3599;
	static HashMap aClass54_3600 = new HashMap(260);
	private byte aByte3601;
	int anInt3602;
	byte aByte3603;
	String[] aStringArray3604;
	private int[] anIntArray3605;
	int anInt3606;
	private int anInt3607;
	int anInt3608;
	byte aByte3609;
	byte aByte3610;
	static int anInt3611;
	static int anInt3612;
	private int anInt3613;
	static int anInt3614;
	short aShort3615;
	byte aByte3616;
	static int anInt3617;
	boolean aBool3618;
	static int anInt3619;
	private int f_ab;
	int f_bb;
	static int f_cb;
	String f_db;
	private int f_eb;
	private int f_fb;
	static int f_gb;
	private short[] f_hb;
	int f_ib;
	int f_jb;
	private int[] f_kb;
	int f_lb;
	static int f_mb;
	static long f_nb = 0L;
	int[] f_ob;
	int f_pb;
	boolean f_qb;
	private byte f_rb;
	int f_sb;
	short f_tb;
	int f_ub;
	boolean f_vb;
	static int f_wb = 0;
	Class228 aClass228_3620;
	int anInt3621;

	final boolean method1622(Interface11 interface11, int i) {
		try {
			f_mb++;
			if (((Class253) this).anIntArray3594 == null)
				return true;
			int i_0_ = -1;
			do {
				if ((anInt3591 ^ 0xffffffff) != 0) {
					i_0_ = interface11.method34((byte) 45, anInt3591);
					if (!client.f_ob)
						break;
				}
				if ((f_eb ^ 0xffffffff) != 0)
					i_0_ = interface11.method35(f_eb, 0);
			} while (false);
			if (i != -14095)
				method1622(null, 45);
			if ((i_0_ ^ 0xffffffff) > -1 || ((((Class253) this).anIntArray3594.length - 1 ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) || ((((Class253) this).anIntArray3594[i_0_] ^ 0xffffffff) == 0)) {
				int i_1_ = (((Class253) this).anIntArray3594[-1 + ((Class253) this).anIntArray3594.length]);
				if ((i_1_ ^ 0xffffffff) != 0)
					return true;
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wh.D(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1623(int i, int i_2_, int i_3_) {
		try {
			anInt3595++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(0, (byte) 125, 15);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_3_;
			if (i != 132)
				f_wb = 69;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.M(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final Class253 method1624(boolean bool, Interface11 interface11) {
		try {
			anInt3611++;
			if (bool != false)
				method1634(106, 39, -68, 29, null, 30, null, null, null);
			int i = -1;
			do {
				if ((anInt3591 ^ 0xffffffff) != 0) {
					i = interface11.method34((byte) 45, anInt3591);
					if (!client.f_ob)
						break;
				}
				if ((f_eb ^ 0xffffffff) != 0)
					i = interface11.method35(f_eb, 0);
			} while (false);
			if ((i ^ 0xffffffff) > -1 || i >= -1 + ((Class253) this).anIntArray3594.length || ((Class253) this).anIntArray3594[i] == -1) {
				int i_4_ = (((Class253) this).anIntArray3594[((Class253) this).anIntArray3594.length - 1]);
				if (i_4_ != -1)
					return ((Class253) this).aClass228_3620.method1462(i_4_, 1);
				return null;
			}
			return ((Class253) this).aClass228_3620.method1462(((Class253) this).anIntArray3594[i], 1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.N(" + bool + ',' + (interface11 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class_t method1625(int i, int i_5_, Class124 class124, Interface11 interface11, int i_6_, int i_7_, int i_8_, int i_9_, Class260 class260, int i_10_, int i_11_, Class148[] class148s, Class124 class124_12_, Class45 class45, Class_v class_v) {
		try {
			anInt3612++;
			if (((Class253) this).anIntArray3594 != null) {
				Class253 class253_13_ = method1624(false, interface11);
				if (class253_13_ == null)
					return null;
				return class253_13_.method1625(i, -126, class124, interface11, i_6_, i_7_, i_8_, i_9_, class260, i_10_, i_11_, class148s, class124_12_, class45, class_v);
			}
			int i_14_ = i_7_;
			if ((anInt3613 ^ 0xffffffff) != -129)
				i_14_ |= 0x2;
			if (anInt3607 != 128)
				i_14_ |= 0x5;
			boolean bool = class124 != null || class124_12_ != null;
			boolean bool_15_ = false;
			boolean bool_16_ = false;
			boolean bool_17_ = false;
			boolean bool_18_ = false;
			int i_19_ = class148s != null ? class148s.length : 0;
			for (int i_20_ = 0; (i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
				Class16.aClass246_Sub1_Sub17Array239[i_20_] = null;
				if (class148s[i_20_] != null) {
					Class124 class124_21_ = class45.method304(3, (((Class148) class148s[i_20_]).anInt2179));
					if (((Class124) class124_21_).anIntArray1724 != null) {
						bool = true;
						Class222.aClass124Array3067[i_20_] = class124_21_;
						int i_22_ = ((Class148) class148s[i_20_]).anInt2177;
						int i_23_ = ((Class148) class148s[i_20_]).anInt2180;
						int i_24_ = ((Class124) class124_21_).anIntArray1724[i_22_];
						Class16.aClass246_Sub1_Sub17Array239[i_20_] = class45.method298(i_24_ >>> 16, 1);
						i_24_ &= 0xffff;
						Class40_Sub6.anIntArray5102[i_20_] = i_24_;
						if (Class16.aClass246_Sub1_Sub17Array239[i_20_] != null) {
							bool_16_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2757((byte) -111, i_24_);
							bool_15_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2764(-6210, i_24_);
							bool_18_ |= Class16.aClass246_Sub1_Sub17Array239[i_20_].method2765(i_24_, (byte) 95);
							bool_17_ |= ((Class124) class124_21_).aBool1743;
						}
						if ((((Class124) class124_21_).aBool1732 || OutputStream_Sub1.aBool4488) && (i_23_ ^ 0xffffffff) != 0 && (((Class124) class124_21_).anIntArray1724.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff)) {
							Class193.anIntArray2713[i_20_] = (((Class124) class124_21_).anIntArray1745[i_22_]);
							Class_e.anIntArray1215[i_20_] = ((Class148) class148s[i_20_]).anInt2182;
							int i_25_ = (((Class124) class124_21_).anIntArray1724[i_23_]);
							Class40.aClass246_Sub1_Sub17Array611[i_20_] = class45.method298(i_25_ >>> 16, 1);
							i_25_ &= 0xffff;
							Class99.anIntArray1286[i_20_] = i_25_;
							if (Class40.aClass246_Sub1_Sub17Array611[i_20_] != null) {
								bool_16_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2757((byte) -96, i_25_);
								bool_15_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2764(-6210, i_25_);
								bool_18_ |= Class40.aClass246_Sub1_Sub17Array611[i_20_].method2765(i_25_, (byte) 114);
							}
						} else {
							Class193.anIntArray2713[i_20_] = 0;
							Class_e.anIntArray1215[i_20_] = 0;
							Class40.aClass246_Sub1_Sub17Array611[i_20_] = null;
							Class99.anIntArray1286[i_20_] = -1;
						}
					}
				}
			}
			int i_26_ = -1;
			int i_27_ = -1;
			int i_28_ = 0;
			Class246_Sub1_Sub17 class246_sub1_sub17 = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_29_ = null;
			int i_30_ = -1;
			int i_31_ = -1;
			int i_32_ = 0;
			Class246_Sub1_Sub17 class246_sub1_sub17_33_ = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_34_ = null;
			if (bool) {
				if (class124 != null) {
					i_26_ = ((Class124) class124).anIntArray1724[i_10_];
					int i_35_ = i_26_ >>> 16;
					i_26_ &= 0xffff;
					class246_sub1_sub17 = class45.method298(i_35_, 1);
					if (class246_sub1_sub17 != null) {
						bool_16_ |= class246_sub1_sub17.method2757((byte) -100, i_26_);
						bool_15_ |= class246_sub1_sub17.method2764(-6210, i_26_);
						bool_18_ |= class246_sub1_sub17.method2765(i_26_, (byte) 96);
						bool_17_ |= ((Class124) class124).aBool1743;
					}
					if ((((Class124) class124).aBool1732 || OutputStream_Sub1.aBool4488) && i_6_ != -1 && ((i_6_ ^ 0xffffffff) > (((Class124) class124).anIntArray1724.length ^ 0xffffffff))) {
						i_27_ = ((Class124) class124).anIntArray1724[i_6_];
						i_28_ = ((Class124) class124).anIntArray1745[i_10_];
						int i_36_ = i_27_ >>> 16;
						if ((i_36_ ^ 0xffffffff) == (i_35_ ^ 0xffffffff))
							class246_sub1_sub17_29_ = class246_sub1_sub17;
						else
							class246_sub1_sub17_29_ = class45.method298(i_36_, 1);
						i_27_ &= 0xffff;
						if (class246_sub1_sub17_29_ != null) {
							bool_16_ |= class246_sub1_sub17_29_.method2757((byte) -121, i_27_);
							bool_15_ |= class246_sub1_sub17_29_.method2764(-6210, i_27_);
							bool_18_ |= class246_sub1_sub17_29_.method2765(i_27_, (byte) 96);
						}
					}
				}
				i_14_ |= 0x20;
				if (class124_12_ != null) {
					i_30_ = ((Class124) class124_12_).anIntArray1724[i_9_];
					int i_37_ = i_30_ >>> 16;
					i_30_ &= 0xffff;
					class246_sub1_sub17_33_ = class45.method298(i_37_, 1);
					if (class246_sub1_sub17_33_ != null) {
						bool_16_ |= class246_sub1_sub17_33_.method2757((byte) -97, i_30_);
						bool_15_ |= class246_sub1_sub17_33_.method2764(-6210, i_30_);
						bool_18_ |= class246_sub1_sub17_33_.method2765(i_30_, (byte) 94);
						bool_17_ |= ((Class124) class124_12_).aBool1743;
					}
					if ((((Class124) class124_12_).aBool1732 || OutputStream_Sub1.aBool4488) && (i_11_ ^ 0xffffffff) != 0 && ((i_11_ ^ 0xffffffff) > (((Class124) class124_12_).anIntArray1724.length ^ 0xffffffff))) {
						i_31_ = ((Class124) class124_12_).anIntArray1724[i_11_];
						i_32_ = ((Class124) class124_12_).anIntArray1745[i_9_];
						int i_38_ = i_31_ >>> 16;
						i_31_ &= 0xffff;
						if ((i_38_ ^ 0xffffffff) != (i_37_ ^ 0xffffffff))
							class246_sub1_sub17_34_ = class45.method298(i_38_, 1);
						else
							class246_sub1_sub17_34_ = class246_sub1_sub17_33_;
						if (class246_sub1_sub17_34_ != null) {
							bool_16_ |= class246_sub1_sub17_34_.method2757((byte) -90, i_31_);
							bool_15_ |= class246_sub1_sub17_34_.method2764(-6210, i_31_);
							bool_18_ |= class246_sub1_sub17_34_.method2765(i_31_, (byte) 117);
						}
					}
				}
				if (bool_16_)
					i_14_ |= 0x80;
				if (bool_15_)
					i_14_ |= 0x100;
				if (bool_17_)
					i_14_ |= 0x200;
				if (bool_18_)
					i_14_ |= 0x400;
			}
			Class_t class_t;
			synchronized (((Class228) ((Class253) this).aClass228_3620).aClass54_3136) {
				class_t = (Class_t) (((Class228) ((Class253) this).aClass228_3620).aClass54_3136.method379((long) (((Class260) class260).anInt3719 << 16 | ((Class253) this).anInt3587), (byte) 58));
			}
			if (class_t == null || i_14_ != (class_t.P() & i_14_)) {
				if (class_t != null)
					i_14_ |= class_t.P();
				int i_39_ = i_14_;
				boolean bool_40_ = false;
				synchronized (((Class228) ((Class253) this).aClass228_3620).aClass_fs3134) {
					for (int i_41_ = 0; i_41_ < anIntArray3605.length; i_41_++) {
						if ((anIntArray3605[i_41_] ^ 0xffffffff) != 0 && !(((Class228) ((Class253) this).aClass228_3620).aClass_fs3134.method85(0, (byte) -124, anIntArray3605[i_41_])))
							bool_40_ = true;
					}
				}
				if (bool_40_)
					return null;
				Class103[] class103s = new Class103[anIntArray3605.length];
				for (int i_42_ = 0; ((anIntArray3605.length ^ 0xffffffff) < (i_42_ ^ 0xffffffff)); i_42_++) {
					if (anIntArray3605[i_42_] != -1) {
						synchronized (((Class228) ((Class253) this).aClass228_3620).aClass_fs3134) {
							class103s[i_42_] = Class206.method1349(0, (((Class228) (((Class253) this).aClass228_3620)).aClass_fs3134), (byte) 89, anIntArray3605[i_42_]);
						}
						if (class103s[i_42_] != null) {
							if (((Class103) class103s[i_42_]).anInt1358 < 13)
								class103s[i_42_].method646(0, (byte) -85);
							if (anIntArrayArray3588 != null && anIntArrayArray3588[i_42_] != null)
								class103s[i_42_].method648(anIntArrayArray3588[i_42_][1], anIntArrayArray3588[i_42_][0], anIntArrayArray3588[i_42_][2], -62);
						}
					}
				}
				Class135 class135 = null;
				if ((((Class253) this).anInt3621 ^ 0xffffffff) != 0)
					class135 = class_v.method694(false, ((Class253) this).anInt3621);
				if (class135 != null && ((Class135) class135).anIntArrayArray1905 != null) {
					for (int i_43_ = 0; (i_43_ < ((Class135) class135).anIntArrayArray1905.length); i_43_++) {
						if ((((Class135) class135).anIntArrayArray1905[i_43_] != null) && class103s.length > i_43_ && class103s[i_43_] != null) {
							int i_44_ = (((Class135) class135).anIntArrayArray1905[i_43_][0]);
							int i_45_ = (((Class135) class135).anIntArrayArray1905[i_43_][1]);
							int i_46_ = (((Class135) class135).anIntArrayArray1905[i_43_][2]);
							int i_47_ = ((((Class135) class135).anIntArrayArray1905[i_43_][3]) << 3);
							int i_48_ = ((((Class135) class135).anIntArrayArray1905[i_43_][4]) << 3);
							int i_49_ = ((((Class135) class135).anIntArrayArray1905[i_43_][5]) << 3);
							if (anIntArrayArray3590 == null)
								anIntArrayArray3590 = new int[(((Class135) class135).anIntArrayArray1905).length][];
							if (anIntArrayArray3590[i_43_] == null) {
								int[] is = anIntArrayArray3590[i_43_] = new int[15];
								if (i_47_ == 0 && i_48_ == 0 && (i_49_ ^ 0xffffffff) == -1) {
									is[14] = -i_46_;
									is[0] = is[4] = is[8] = 32768;
									is[13] = -i_45_;
									is[12] = -i_44_;
								} else {
									int i_50_ = Class39_Sub1.anIntArray4672[i_47_];
									int i_51_ = Class39_Sub1.f_fb[i_47_];
									int i_52_ = Class39_Sub1.anIntArray4672[i_48_];
									int i_53_ = Class39_Sub1.f_fb[i_48_];
									int i_54_ = Class39_Sub1.anIntArray4672[i_49_];
									int i_55_ = Class39_Sub1.f_fb[i_49_];
									int i_56_ = i_54_ * i_51_ + 16384 >> 15;
									int i_57_ = 16384 + i_55_ * i_51_ >> 15;
									is[3] = 16384 + i_50_ * i_55_ >> 15;
									is[5] = -i_51_;
									is[1] = (16384 + i_52_ * -i_55_ - -(i_53_ * i_56_)) >> 15;
									is[8] = i_52_ * i_50_ + 16384 >> 15;
									is[7] = i_56_ * i_52_ + (-i_53_ * -i_55_ + 16384) >> 15;
									is[0] = (16384 + i_54_ * i_52_ + i_53_ * i_57_) >> 15;
									is[2] = 16384 + i_53_ * i_50_ >> 15;
									is[4] = 16384 + i_50_ * i_54_ >> 15;
									is[6] = (16384 + i_57_ * i_52_ + -i_53_ * i_54_) >> 15;
									is[13] = 16384 + (is[4] * -i_45_ + is[1] * -i_44_ + -i_46_ * is[7]) >> 15;
									is[14] = 16384 + (is[8] * -i_46_ + (-i_44_ * is[2] + is[5] * -i_45_)) >> 15;
									is[12] = 16384 + (-i_44_ * is[0] + -i_45_ * is[3] + is[6] * -i_46_) >> 15;
								}
								is[11] = i_46_;
								is[10] = i_45_;
								is[9] = i_44_;
							}
							if (i_47_ != 0 || (i_48_ ^ 0xffffffff) != -1 || i_49_ != 0)
								class103s[i_43_].method660(i_47_, i_48_, i_49_, (byte) 111);
							if ((i_44_ ^ 0xffffffff) != -1 || (i_45_ ^ 0xffffffff) != -1 || (i_46_ ^ 0xffffffff) != -1)
								class103s[i_43_].method648(i_45_, i_44_, i_46_, -17);
						}
					}
				}
				Class103 class103;
				if ((class103s.length ^ 0xffffffff) == -2)
					class103 = class103s[0];
				else
					class103 = new Class103(class103s, class103s.length);
				if (f_hb != null)
					i_39_ |= 0x4000;
				if (aShortArray3579 != null)
					i_39_ |= 0x8000;
				if ((aByte3582 ^ 0xffffffff) != -1)
					i_39_ |= 0x80000;
				class_t = class260.method1695(class103, i_39_, (((Class228) (((Class253) this).aClass228_3620)).anInt3139), 64 + f_ab, 850 + f_fb);
				if (f_hb != null) {
					for (int i_58_ = 0; (f_hb.length ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
						if (aByteArray3568 == null || ((aByteArray3568.length ^ 0xffffffff) >= (i_58_ ^ 0xffffffff)))
							class_t.BA(f_hb[i_58_], aShortArray3573[i_58_]);
						else
							class_t.BA(f_hb[i_58_], (Class44.aShortArray641[aByteArray3568[i_58_] & 0xff]));
					}
				}
				if (aShortArray3579 != null) {
					for (int i_59_ = 0; ((i_59_ ^ 0xffffffff) > (aShortArray3579.length ^ 0xffffffff)); i_59_++)
						class_t.I(aShortArray3579[i_59_], aShortArray3570[i_59_]);
				}
				if (aByte3582 != 0)
					class_t.method684(aByte3598, aByte3601, f_rb, aByte3582 & 0xff);
				class_t.UA(i_14_);
				synchronized (((Class228) ((Class253) this).aClass228_3620).aClass54_3136) {
					((Class228) ((Class253) this).aClass228_3620).aClass54_3136.method371(1, (long) (((Class260) class260).anInt3719 << 16 | ((Class253) this).anInt3587), class_t);
				}
			}
			Class_t class_t_60_ = class_t.method678((byte) 4, i_14_, true);
			if (!bool)
				return class_t_60_;
			int i_61_ = -55 / ((-15 - i_5_) / 42);
			int i_62_ = 0;
			int i_63_ = 1;
			while (i_19_ > i_62_) {
				if (Class16.aClass246_Sub1_Sub17Array239[i_62_] != null)
					class_t_60_.method688(Class99.anIntArray1286[i_62_], Class40.aClass246_Sub1_Sub17Array611[i_62_], anIntArrayArray3590[i_62_], (((Class124) Class222.aClass124Array3067[i_62_]).aBool1743), 0, Class40_Sub6.anIntArray5102[i_62_], 127, Class193.anIntArray2713[i_62_], Class16.aClass246_Sub1_Sub17Array239[i_62_], -1 + Class_e.anIntArray1215[i_62_], i_63_);
				i_62_++;
				i_63_ <<= 1;
			}
			if (class246_sub1_sub17 != null && class246_sub1_sub17_33_ != null)
				class_t_60_.method690(i_26_, i_28_, class246_sub1_sub17_34_, (((Class124) class124_12_).aBool1743 | ((Class124) class124).aBool1743), i_32_, -1 + i, i_30_, class246_sub1_sub17_33_, class246_sub1_sub17, i_31_, ((Class124) class124).aBoolArray1751, class246_sub1_sub17_29_, -1 + i_8_, i_27_, -122);
			else if (class246_sub1_sub17 != null)
				class_t_60_.method674(0, i_28_, ((Class124) class124).aBool1743, i_26_, i_27_, class246_sub1_sub17, class246_sub1_sub17_29_, i_8_ - 1, 0);
			else if (class246_sub1_sub17_33_ != null)
				class_t_60_.method674(0, i_32_, ((Class124) class124_12_).aBool1743, i_30_, i_31_, class246_sub1_sub17_33_, class246_sub1_sub17_34_, i - 1, 0);
			for (int i_64_ = 0; (i_19_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff); i_64_++) {
				Class16.aClass246_Sub1_Sub17Array239[i_64_] = null;
				Class40.aClass246_Sub1_Sub17Array611[i_64_] = null;
				Class222.aClass124Array3067[i_64_] = null;
			}
			if ((anInt3607 ^ 0xffffffff) != -129 || (anInt3613 ^ 0xffffffff) != -129)
				class_t_60_.H(anInt3607, anInt3613, anInt3607);
			class_t_60_.UA(i_7_);
			return class_t_60_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.I(" + i + ',' + i_5_ + ',' + (class124 != null ? "{...}" : "null") + ',' + (interface11 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_10_ + ',' + i_11_ + ',' + (class148s != null ? "{...}" : "null") + ',' + (class124_12_ != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + (class_v != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1626(boolean bool) {
		do {
			try {
				anInt3576++;
				if (anIntArray3605 == null)
					anIntArray3605 = new int[0];
				if (bool == false)
					break;
				f_hb = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wh.K(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method1627(int i) {
		try {
			if (i == 0)
				aClass54_3600 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wh.E(" + i + ')');
		}
	}

	final boolean method1628(int i) {
		try {
			f_cb++;
			int i_65_ = 64 % ((i - 33) / 52);
			if (((Class253) this).anIntArray3594 == null) {
				if (((Class253) this).anInt3586 == -1 && ((Class253) this).anInt3575 == -1 && ((Class253) this).anInt3589 == -1)
					return false;
				return true;
			}
			for (int i_66_ = 0; ((Class253) this).anIntArray3594.length > i_66_; i_66_++) {
				if ((((Class253) this).anIntArray3594[i_66_] ^ 0xffffffff) != 0) {
					Class253 class253_67_ = (((Class253) this).aClass228_3620.method1462(((Class253) this).anIntArray3594[i_66_], 1));
					if (((Class253) class253_67_).anInt3586 != -1 || ((((Class253) class253_67_).anInt3575 ^ 0xffffffff) != 0) || ((((Class253) class253_67_).anInt3589 ^ 0xffffffff) != 0))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wh.C(" + i + ')');
		}
	}

	final String method1629(byte i, String string, int i_68_) {
		try {
			if (i != -116)
				method1636(-38, null, null, null, null);
			anInt3617++;
			if (aClass85_3599 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_3599.method544((long) i_68_, 125);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.G(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_68_ + ')'));
		}
	}

	private final void method1630(BufferStream stream, int i, int i_69_) {
		do {
			try {
				if ((i ^ 0xffffffff) != -2) {
					if (i != 2) {
						if ((i ^ 0xffffffff) != -13) {
							if ((i ^ 0xffffffff) > -31 || i >= 35) {
								if ((i ^ 0xffffffff) == -41) {
									int i_70_ = stream.readUnsignedByte(255);
									f_hb = new short[i_70_];
									aShortArray3573 = new short[i_70_];
									for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
										f_hb[i_71_] = (short) (stream.readUnsignedShort((byte) 124));
										aShortArray3573[i_71_] = (short) (stream.readUnsignedShort((byte) -120));
									}
								} else if ((i ^ 0xffffffff) == -42) {
									int i_72_ = stream.readUnsignedByte(255);
									aShortArray3570 = new short[i_72_];
									aShortArray3579 = new short[i_72_];
									for (int i_73_ = 0; i_72_ > i_73_; i_73_++) {
										aShortArray3579[i_73_] = (short) (stream.readUnsignedShort((byte) -35));
										aShortArray3570[i_73_] = (short) (stream.readUnsignedShort((byte) 105));
									}
								} else if (i == 42) {
									int i_74_ = stream.readUnsignedByte(255);
									aByteArray3568 = new byte[i_74_];
									for (int i_75_ = 0; ((i_75_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff)); i_75_++)
										aByteArray3568[i_75_] = stream.readByte(false);
								} else if (i != 60) {
									if ((i ^ 0xffffffff) == -94)
										((Class253) this).aBool3569 = false;
									else if ((i ^ 0xffffffff) == -96)
										((Class253) this).f_lb = stream.readUnsignedShort((byte) 95);
									else if (i != 97) {
										if (i == 98)
											anInt3613 = stream.readUnsignedShort((byte) -74);
										else if ((i ^ 0xffffffff) == -100)
											((Class253) this).aBool3581 = true;
										else if (i != 100) {
											if (i != 101) {
												if ((i ^ 0xffffffff) != -103) {
													if ((i ^ 0xffffffff) == -104)
														((Class253) this).anInt3608 = (stream.readUnsignedShort((byte) 107));
													else if (i != 106 && ((i ^ 0xffffffff) != -119)) {
														if (i == 107)
															((Class253) this).aBool3596 = false;
														else if (i != 109) {
															if ((i ^ 0xffffffff) == -112)
																((Class253) this).f_qb = false;
															else if ((i ^ 0xffffffff) != -114) {
																if (i != 114) {
																	if (i != 115) {
																		if ((i ^ 0xffffffff) == -120)
																			((Class253) this).aByte3609 = stream.readByte(false);
																		else if (i == 121) {
																			anIntArrayArray3588 = new int[anIntArray3605.length][];
																			int i_76_ = stream.readUnsignedByte(255);
																			for (int i_77_ = 0; i_76_ > i_77_; i_77_++) {
																				int i_78_ = stream.readUnsignedByte(255);
																				int[] is = anIntArrayArray3588[i_78_] = new int[3];
																				is[0] = stream.readByte(false);
																				is[1] = stream.readByte(false);
																				is[2] = stream.readByte(false);
																			}
																		} else if ((i ^ 0xffffffff) != -123) {
																			if (i != 123) {
																				if (i == 125)
																					((Class253) this).aByte3616 = stream.readByte(false);
																				else if (i == 127)
																					((Class253) this).anInt3621 = stream.readUnsignedShort((byte) -107);
																				else if ((i ^ 0xffffffff) == -129)
																					stream.readUnsignedByte(255);
																				else if (i != 134) {
																					if ((i ^ 0xffffffff) != -136) {
																						if (i != 136) {
																							if ((i ^ 0xffffffff) == -138)
																								((Class253) this).anInt3592 = stream.readUnsignedShort((byte) 92);
																							else if (i != 138) {
																								if (i == 139)
																									((Class253) this).anInt3602 = stream.readUnsignedShort((byte) 104);
																								else if ((i ^ 0xffffffff) != -141) {
																									if (i != 141) {
																										if (i != 142) {
																											if (i != 143) {
																												if (i < 150 || i >= 155) {
																													if (i != 155) {
																														if ((i ^ 0xffffffff) == -161) {
																															int i_79_ = stream.readUnsignedByte(i_69_ ^ ~0xff);
																															((Class253) this).f_ob = new int[i_79_];
																															for (int i_80_ = 0; (i_79_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff); i_80_++)
																																((Class253) this).f_ob[i_80_] = stream.readUnsignedShort((byte) 93);
																														} else if ((i ^ 0xffffffff) == -250) {
																															int i_81_ = stream.readUnsignedByte(255);
																															if (aClass85_3599 == null) {
																																int i_82_ = Class206.method1350(i_81_, 269173057);
																																aClass85_3599 = new Class85(i_82_);
																															}
																															for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
																																boolean bool = stream.readUnsignedByte(255) == 1;
																																int i_84_ = stream.read24BitInteger((byte) 29);
																																Node class246;
																																if (bool)
																																	class246 = new Class246_Sub4(stream.readString((byte) -40));
																																else
																																	class246 = new IntegerNode(stream.readInt((byte) 114));
																																aClass85_3599.method547((long) i_84_, i_69_ - 2300, class246);
																															}
																														}
																													} else {
																														aByte3598 = stream.readByte(false);
																														aByte3601 = stream.readByte(false);
																														f_rb = stream.readByte(false);
																														aByte3582 = stream.readByte(false);
																													}
																												} else {
																													((Class253) this).aStringArray3604[i - 150] = stream.readString((byte) -40);
																													if (!((Class228) ((Class253) this).aClass228_3620).aBool3131)
																														((Class253) this).aStringArray3604[-150 + i] = null;
																												}
																											} else
																												((Class253) this).aBool3571 = true;
																										} else
																											((Class253) this).f_ub = stream.readUnsignedShort((byte) -48);
																									} else
																										((Class253) this).f_vb = true;
																								} else
																									((Class253) this).f_jb = stream.readUnsignedByte(i_69_ + 256);
																							} else
																								((Class253) this).anInt3585 = stream.readUnsignedShort((byte) -71);
																						} else {
																							((Class253) this).anInt3606 = stream.readUnsignedByte(255);
																							((Class253) this).f_bb = stream.readUnsignedShort((byte) -78);
																						}
																					} else {
																						((Class253) this).anInt3580 = stream.readUnsignedByte(i_69_ ^ ~0xff);
																						((Class253) this).f_pb = stream.readUnsignedShort((byte) -102);
																					}
																				} else {
																					((Class253) this).anInt3586 = stream.readUnsignedShort((byte) -111);
																					if ((((Class253) this).anInt3586 ^ 0xffffffff) == -65536)
																						((Class253) this).anInt3586 = -1;
																					((Class253) this).anInt3583 = stream.readUnsignedShort((byte) -84);
																					if (((Class253) this).anInt3583 == 65535)
																						((Class253) this).anInt3583 = -1;
																					((Class253) this).anInt3575 = stream.readUnsignedShort((byte) 83);
																					if ((((Class253) this).anInt3575 ^ 0xffffffff) == -65536)
																						((Class253) this).anInt3575 = -1;
																					((Class253) this).anInt3589 = stream.readUnsignedShort((byte) -125);
																					if ((((Class253) this).anInt3589 ^ 0xffffffff) == -65536)
																						((Class253) this).anInt3589 = -1;
																					((Class253) this).f_sb = stream.readUnsignedByte(255);
																				}
																			} else
																				((Class253) this).f_ib = stream.readUnsignedShort((byte) -124);
																		} else
																			((Class253) this).anInt3577 = stream.readUnsignedShort((byte) -111);
																	} else {
																		stream.readUnsignedByte(i_69_ ^ ~0xff);
																		stream.readUnsignedByte(i_69_ ^ ~0xff);
																	}
																} else {
																	((Class253) this).aByte3603 = (stream.readByte(false));
																	((Class253) this).aByte3610 = (stream.readByte(false));
																}
															} else {
																((Class253) this).f_tb = (short) stream.readUnsignedShort((byte) -39);
																((Class253) this).aShort3615 = (short) stream.readUnsignedShort((byte) -75);
															}
														} else
															((Class253) this).aBool3618 = false;
													} else {
														anInt3591 = (stream.readUnsignedShort((byte) -112));
														if (anInt3591 == 65535)
															anInt3591 = -1;
														f_eb = (stream.readUnsignedShort((byte) -45));
														if (f_eb == 65535)
															f_eb = -1;
														int i_85_ = -1;
														if (i == 118) {
															i_85_ = (stream.readUnsignedShort((byte) -128));
															if (i_85_ == 65535)
																i_85_ = -1;
														}
														int i_86_ = (stream.readUnsignedByte(i_69_ + 256));
														((Class253) this).anIntArray3594 = (new int[i_86_ + 2]);
														for (int i_87_ = 0; i_86_ >= i_87_; i_87_++) {
															((Class253) this).anIntArray3594[i_87_] = (stream.readUnsignedShort((byte) -125));
															if (((((Class253) this).anIntArray3594[i_87_]) ^ 0xffffffff) == -65536)
																((Class253) this).anIntArray3594[i_87_] = -1;
														}
														((Class253) this).anIntArray3594[1 + i_86_] = i_85_;
													}
												} else
													((Class253) this).anInt3578 = (stream.readUnsignedShort((byte) -112));
											} else
												f_fb = (stream.readByte(false) * 5);
										} else
											f_ab = stream.readByte(false);
									} else
										anInt3607 = stream.readUnsignedShort((byte) 85);
								} else {
									int i_88_ = stream.readUnsignedByte(255);
									f_kb = new int[i_88_];
									for (int i_89_ = 0; i_88_ > i_89_; i_89_++)
										f_kb[i_89_] = stream.readUnsignedShort((byte) -123);
								}
							} else
								((Class253) this).aStringArray3604[-30 + i] = stream.readString((byte) -40);
						} else
							((Class253) this).anInt3574 = stream.readUnsignedByte(i_69_ ^ ~0xff);
					} else
						((Class253) this).f_db = stream.readString((byte) -40);
				} else {
					int i_90_ = stream.readUnsignedByte(255);
					anIntArray3605 = new int[i_90_];
					for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
						anIntArray3605[i_91_] = stream.readUnsignedShort((byte) 105);
						if ((anIntArray3605[i_91_] ^ 0xffffffff) == -65536)
							anIntArray3605[i_91_] = -1;
					}
				}
				anInt3584++;
				if (i_69_ == -1)
					break;
				aClass54_3600 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wh.L(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_69_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1631(int i, BufferStream stream) {
		try {
			anInt3614++;
			if (i != 0)
				method1622(null, -112);
			for (;;) {
				int i_92_ = stream.readUnsignedByte(255);
				if (i_92_ == 0)
					break;
				method1630(stream, i_92_, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.J(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1632(int i, int i_93_, int i_94_) {
		try {
			anInt3619++;
			if (i_94_ != 0)
				return 78;
			if (aClass85_3599 == null)
				return i;
			IntegerNode class246_sub33 = ((IntegerNode) aClass85_3599.method544((long) i_93_, i_94_ ^ 0x7b));
			if (class246_sub33 == null)
				return i;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.A(" + i + ',' + i_93_ + ',' + i_94_ + ')'));
		}
	}

	static final boolean method1633(boolean bool, byte[] is) {
		try {
			anInt3593++;
			if (bool != false)
				method1635(-95, false, null, null, null, 112, -27, -117);
			BufferStream stream = new BufferStream(is);
			int i = stream.readUnsignedByte(255);
			if (i != 1)
				return false;
			boolean bool_95_ = stream.readUnsignedByte(255) == 1;
			if (bool_95_)
				Class75.method472(stream, (byte) 13);
			Class186.method1221((byte) -47, stream);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.B(" + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Class_t method1634(int i, int i_96_, int i_97_, int i_98_, Class124 class124, int i_99_, Interface11 interface11, Class260 class260, Class45 class45) {
		try {
			f_gb++;
			if (i_97_ <= 29)
				((Class253) this).anIntArray3594 = null;
			if (((Class253) this).anIntArray3594 != null) {
				Class253 class253_100_ = method1624(false, interface11);
				if (class253_100_ == null)
					return null;
				return class253_100_.method1634(i, i_96_, 41, i_98_, class124, i_99_, interface11, class260, class45);
			}
			if (f_kb == null)
				return null;
			int i_101_ = i_98_;
			if (class124 != null && (i_99_ ^ 0xffffffff) != 0)
				i_101_ |= class124.method847(i_99_, 256, i, true);
			Class_t class_t;
			synchronized (((Class228) ((Class253) this).aClass228_3620).aClass54_3138) {
				class_t = ((Class_t) (((Class228) ((Class253) this).aClass228_3620).aClass54_3138.method379((long) (((Class253) this).anInt3587 | ((Class260) class260).anInt3719 << 16), (byte) 58)));
			}
			if (class_t == null || (i_101_ & class_t.P() ^ 0xffffffff) != (i_101_ ^ 0xffffffff)) {
				if (class_t != null)
					i_101_ |= class_t.P();
				int i_102_ = i_101_;
				boolean bool = false;
				synchronized (((Class228) ((Class253) this).aClass228_3620).aClass_fs3134) {
					for (int i_103_ = 0; i_103_ < f_kb.length; i_103_++) {
						if (!((Class228) ((Class253) this).aClass228_3620).aClass_fs3134.method85(0, (byte) -124, f_kb[i_103_]))
							bool = true;
					}
				}
				if (bool)
					return null;
				Class103[] class103s = new Class103[f_kb.length];
				synchronized (((Class228) ((Class253) this).aClass228_3620).aClass_fs3134) {
					for (int i_104_ = 0; (f_kb.length ^ 0xffffffff) < (i_104_ ^ 0xffffffff); i_104_++)
						class103s[i_104_] = Class206.method1349(0, (((Class228) (((Class253) this).aClass228_3620)).aClass_fs3134), (byte) 89, f_kb[i_104_]);
				}
				for (int i_105_ = 0; i_105_ < f_kb.length; i_105_++) {
					if (class103s[i_105_] != null && (((Class103) class103s[i_105_]).anInt1358 ^ 0xffffffff) > -14)
						class103s[i_105_].method646(0, (byte) -100);
				}
				Class103 class103;
				if ((class103s.length ^ 0xffffffff) != -2)
					class103 = new Class103(class103s, class103s.length);
				else
					class103 = class103s[0];
				if (f_hb != null)
					i_102_ |= 0x4000;
				if (aShortArray3579 != null)
					i_102_ |= 0x8000;
				if ((aByte3582 ^ 0xffffffff) != -1)
					i_102_ |= 0x80000;
				class_t = class260.method1695(class103, i_102_, (((Class228) (((Class253) this).aClass228_3620)).anInt3139), 64, 768);
				if (f_hb != null) {
					for (int i_106_ = 0; (f_hb.length ^ 0xffffffff) < (i_106_ ^ 0xffffffff); i_106_++) {
						if (aByteArray3568 == null || (i_106_ ^ 0xffffffff) <= (aByteArray3568.length ^ 0xffffffff))
							class_t.BA(f_hb[i_106_], aShortArray3573[i_106_]);
						else
							class_t.BA(f_hb[i_106_], (Class44.aShortArray641[0xff & aByteArray3568[i_106_]]));
					}
				}
				if (aShortArray3579 != null) {
					for (int i_107_ = 0; ((i_107_ ^ 0xffffffff) > (aShortArray3579.length ^ 0xffffffff)); i_107_++)
						class_t.I(aShortArray3579[i_107_], aShortArray3570[i_107_]);
				}
				if ((aByte3582 ^ 0xffffffff) != -1)
					class_t.method684(aByte3598, aByte3601, f_rb, aByte3582 & 0xff);
				class_t.UA(i_101_);
				synchronized (((Class228) ((Class253) this).aClass228_3620).aClass54_3138) {
					((Class228) ((Class253) this).aClass228_3620).aClass54_3138.method371(1, (long) (((Class253) this).anInt3587 | ((Class260) class260).anInt3719 << 16), class_t);
				}
			}
			if (class124 != null && i_99_ != -1)
				class_t = class124.method846(i_96_, i_101_, i, i_99_, class_t, -105);
			class_t.UA(i_98_);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.H(" + i + ',' + i_96_ + ',' + i_97_ + ',' + i_98_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_99_ + ',' + (interface11 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1635(int i, boolean bool, Class_l class_l, Class235 class235, Class128 class128, int i_108_, int i_109_, int i_110_) {
		try {
			if (bool != true)
				aClass54_3600 = null;
			anInt3597++;
			if (class_l != null) {
				int i_111_;
				do {
					if (Class130_Sub3.anInt4417 != 4) {
						i_111_ = 0x3fff & (Class95.anInt1253 + (int) Class204.aFloat2881);
						if (!client.f_ob)
							break;
					}
					i_111_ = 0x3fff & (int) Class204.aFloat2881;
				} while (false);
				int i_112_ = (Math.max(((Class235) class235).f_fc / 2, ((Class235) class235).f_sb / 2) + 10);
				int i_113_ = i_109_ * i_109_ + i_108_ * i_108_;
				if ((i_113_ ^ 0xffffffff) >= (i_112_ * i_112_ ^ 0xffffffff)) {
					int i_114_ = Class39_Sub1.f_fb[i_111_];
					int i_115_ = Class39_Sub1.anIntArray4672[i_111_];
					if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -5) {
						i_114_ = 256 * i_114_ / (Class246_Sub12.anInt4405 + 256);
						i_115_ = i_115_ * 256 / (Class246_Sub12.anInt4405 + 256);
					}
					int i_116_ = i_108_ * i_114_ + i_109_ * i_115_ >> 15;
					int i_117_ = -(i_114_ * i_109_) + i_115_ * i_108_ >> 15;
					class_l.method737((i_116_ + ((Class235) class235).f_fc / 2 + (i - class_l.j() / 2)), (-i_117_ + ((Class235) class235).f_sb / 2 + i_110_ + -(class_l.T() / 2)), class128, i, i_110_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.F(" + i + ',' + bool + ',' + (class_l != null ? "{...}" : "null") + ',' + (class235 != null ? "{...}" : "null") + ',' + (class128 != null ? "{...}" : "null") + ',' + i_108_ + ',' + i_109_ + ',' + i_110_ + ')'));
		}
	}

	static final void method1636(int i, Class_fs class_fs, Class_fs class_fs_118_, Class_fs class_fs_119_, Class_fs class_fs_120_) {
		try {
			if (i != -1)
				f_nb = -107L;
			anInt3572++;
			Class40_Sub8.aClass_fs5193 = class_fs;
			Class233.aClass_fs3181 = class_fs_119_;
			Class29.aClass_fs383 = class_fs_118_;
			Class214.aClass_fs2990 = class_fs_120_;
			Class246_Sub32.aClass235ArrayArray5049 = (new Class235[Class40_Sub8.aClass_fs5193.method87((byte) 39)][]);
			Class130_Sub8.aBoolArray5609 = new boolean[Class40_Sub8.aClass_fs5193.method87((byte) 39)];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wh.O(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_118_ != null ? "{...}" : "null") + ',' + (class_fs_119_ != null ? "{...}" : "null") + ',' + (class_fs_120_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class253() {
		((Class253) this).anInt3578 = -1;
		((Class253) this).anInt3577 = -1;
		((Class253) this).anInt3602 = -1;
		((Class253) this).aBool3569 = true;
		anInt3591 = -1;
		anInt3607 = 128;
		((Class253) this).aBool3571 = false;
		((Class253) this).anInt3608 = 32;
		((Class253) this).anInt3575 = -1;
		((Class253) this).aByte3609 = (byte) 0;
		((Class253) this).aByte3616 = (byte) 4;
		((Class253) this).anInt3592 = -1;
		((Class253) this).aBool3581 = false;
		((Class253) this).aBool3618 = true;
		f_eb = -1;
		((Class253) this).f_bb = -1;
		((Class253) this).anInt3589 = -1;
		((Class253) this).aByte3610 = (byte) -16;
		((Class253) this).aStringArray3604 = new String[5];
		((Class253) this).aBool3596 = true;
		((Class253) this).f_db = "null";
		((Class253) this).aShort3615 = (short) 0;
		((Class253) this).anInt3586 = -1;
		((Class253) this).anInt3580 = -1;
		((Class253) this).f_sb = 0;
		((Class253) this).f_lb = -1;
		f_fb = 0;
		((Class253) this).anInt3574 = 1;
		((Class253) this).anInt3583 = -1;
		((Class253) this).f_pb = -1;
		((Class253) this).f_tb = (short) 0;
		((Class253) this).anInt3606 = -1;
		((Class253) this).f_qb = true;
		((Class253) this).aByte3603 = (byte) -96;
		anInt3613 = 128;
		((Class253) this).f_jb = 255;
		((Class253) this).f_ib = -1;
		((Class253) this).f_ub = -1;
		((Class253) this).anInt3621 = -1;
		((Class253) this).f_vb = false;
		((Class253) this).anInt3585 = -1;
		f_ab = 0;
	}
}
