/* Class_r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Actor {
	private byte f_vc;
	static int f_wc;
	static int anInt7114;
	static int anInt7115;
	private byte aByte7116 = 0;
	static int anInt7117;
	int anInt7118 = -1;
	static int anInt7119;
	static int anInt7120;
	static int anInt7121;
	int anInt7122;
	String aString7123;
	private byte aByte7124;
	static Class67 aClass67_7125;
	static int anInt7126;
	int anInt7127;
	static int anInt7128;
	boolean aBool7129;
	static int anInt7130;
	Class27 aClass27_7131;
	int anInt7132;
	int anInt7133;
	private int anInt7134;
	static int anInt7135;
	static int anInt7136;
	static int anInt7137;
	int anInt7138;
	static int anInt7139;
	String aString7140;
	int anInt7141;
	boolean aBool7142;
	static int f_ad;
	int f_bd;
	int f_cd;
	int f_dd;
	int f_ed;
	int f_fd;
	static int f_gd;
	static int f_hd;
	static int[] f_id = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	int f_jd;
	static int f_kd;
	boolean f_ld;
	static int f_md;
	static int f_nd;
	static int f_od;
	static int f_pd;
	int f_qd;
	static Class78 f_rd;
	static IncomingPacket RUNSCRIPT_IN;
	int f_td;
	static int f_ud;
	static int[] f_vd;
	int f_wd;

	final void readAppearance(BufferStream stream, int i) {
		do {
			try {
				(stream).position = 0;
				f_pd++;
				int flagHash = stream.readUnsignedByte(i + -2147483393);
				aByte7124 = (byte) (flagHash & 0x1);
				boolean bool = (0x2 & flagHash ^ 0xffffffff) != -1;
				boolean bool_1_ = (0x4 & flagHash ^ 0xffffffff) != -1;
				int i_2_ = super.method2670((byte) 127);
				this.method2673(1 + (flagHash >> 3 & 0x7), (byte) -120);
				f_vc = (byte) (0x3 & flagHash >> 6);
				((Class59_Sub3) this).anInt5060 += -i_2_ + method2670((byte) 127) << 6;
				((Class59_Sub3) this).anInt5059 += method2670((byte) 127) - i_2_ << 6;
				aByte7116 = stream.readByte(false);
				((Player) this).f_jd = stream.readByte(false);
				((Player) this).f_td = stream.readByte(false);
				int i_3_ = -1;
				((Player) this).anInt7138 = 0;
				int[] is = new int[12];
				for (int i_4_ = 0; i_4_ < 12; i_4_++) {
					int i_5_ = stream.readUnsignedByte(i + -2147483393);
					if (i_5_ == 0)
						is[i_4_] = 0;
					else {
						int i_6_ = stream.readUnsignedByte(255);
						int i_7_ = (i_5_ << 8) - -i_6_;
						if (i_4_ == 0 && i_7_ == 65535) {
							i_3_ = stream.readUnsignedShort((byte) 107);
							((Player) this).anInt7138 = stream.readUnsignedByte(255);
							break;
						}
						/*
						 * if (i_7_ >= 32768) { i_7_ = (Class59_Sub1_Sub2.anIntArray6131[i_7_ - 32768]); is[i_4_] = Class236.method1523(i_7_,
						 * 1073741824); int i_8_ = (((Class197) Class255.aClass191_3663 .method1251(i + -2147460765, i_7_)).anInt2813); if ((i_8_ ^
						 * 0xffffffff) != -1) ((Player) this).anInt7138 = i_8_; } else is[i_4_] = Class236.method1523(-256 + i_7_, -2147483648); } /
						 */
						if (i_7_ >= 16384) { // calculate the equip ids client-sided
							i_7_ -= 16384;
							is[i_4_] = Class236.method1523(i_7_, 1073741824);
							int i_8_ = (((Class197) Class255.aClass191_3663.method1251(i + -2147460765, i_7_)).anInt2813);
							if ((i_8_ ^ 0xffffffff) != -1)
								((Player) this).anInt7138 = i_8_;
						} else
							is[i_4_] = Class236.method1523(-256 + i_7_, -2147483648);
					}

				}
				int[] is_9_ = new int[5];
				for (int i_10_ = 0; i_10_ < 5; i_10_++) {
					int i_11_ = stream.readUnsignedByte(i ^ ~0x7fffff00);
					if (i_11_ < 0 || i_11_ >= (Class246_Sub30_Sub1.aShortArrayArray5767[i_10_]).length)
						i_11_ = 0;
					is_9_[i_10_] = i_11_;
				}
				anInt7134 = stream.readUnsignedShort((byte) -109);
				((Player) this).aString7123 = stream.readString((byte) -40);
				if (i != -2147483648)
					method2914(-103, -113, (byte) -98, (byte) 71);
				if (bool)
					((Player) this).aString7140 = stream.readString((byte) -40);
				else
					((Player) this).aString7140 = ((Player) this).aString7123;
				((Player) this).f_qd = stream.readUnsignedByte(i ^ ~0x7fffff00);
				if (!bool_1_) {
					((Player) this).f_fd = 0;
					((Player) this).f_bd = stream.readUnsignedByte(255);
					((Player) this).anInt7141 = stream.readUnsignedByte(255);
					if (((Player) this).anInt7141 == 255)
						((Player) this).anInt7141 = -1;
				} else {
					((Player) this).f_fd = stream.readUnsignedShort((byte) 105);
					((Player) this).f_bd = ((Player) this).f_qd;
					((Player) this).anInt7141 = -1;
				}
				int i_12_ = ((Player) this).f_dd;
				((Player) this).f_dd = stream.readUnsignedByte(255);
				if ((((Player) this).f_dd ^ 0xffffffff) == -1)
					Class191.method1253(this, (byte) 45);
				else {
					int i_13_ = ((Player) this).anInt7118;
					int i_14_ = ((Player) this).anInt7127;
					int i_15_ = ((Player) this).f_cd;
					int i_16_ = ((Player) this).anInt7132;
					int i_17_ = ((Player) this).f_wd;
					((Player) this).anInt7118 = stream.readUnsignedShort((byte) -66);
					((Player) this).anInt7127 = stream.readUnsignedShort((byte) 117);
					((Player) this).f_cd = stream.readUnsignedShort((byte) 87);
					((Player) this).anInt7132 = stream.readUnsignedShort((byte) -84);
					((Player) this).f_wd = stream.readUnsignedByte(255);
					if (i_12_ != ((Player) this).f_dd || ((((Player) this).anInt7118 ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) || ((Player) this).anInt7127 != i_14_ || ((Player) this).f_cd != i_15_ || ((i_16_ ^ 0xffffffff) != (((Player) this).anInt7132 ^ 0xffffffff)) || ((((Player) this).f_wd ^ 0xffffffff) != (i_17_ ^ 0xffffffff)))
						Stream_Sub2.method2594(this, -127);
				}
				if (((Player) this).aClass27_7131 == null)
					((Player) this).aClass27_7131 = new Class27();
				int i_18_ = ((Class27) ((Player) this).aClass27_7131).anInt362;
				int[] is_19_ = (((Class27) ((Player) this).aClass27_7131).anIntArray373);
				((Player) this).aClass27_7131.method217((aByte7124 ^ 0xffffffff) == -2, (byte) -109, i_3_, method2668((byte) 122), is, is_9_);
				if (i_3_ != i_18_) {
					((Class59_Sub3) this).anInt5060 = ((((Actor) this).f_mc[0] << 7) - -(method2670((byte) 127) << 6));
					((Class59_Sub3) this).anInt5059 = ((((Actor) this).f_nc[0] << 7) + (method2670((byte) 127) << 6));
				}
				if ((((Actor) this).f_db ^ 0xffffffff) == (Class109.anInt1567 ^ 0xffffffff) && is_19_ != null) {
					for (int i_20_ = 0; is_9_.length > i_20_; i_20_++) {
						if (is_19_[i_20_] != is_9_[i_20_]) {
							Class255.aClass191_3663.method1249((byte) 65);
							break;
						}
					}
				}
				if (((Actor) this).f_lc != null)
					((Actor) this).f_lc.method1772();
				if (((Actor) this).anInt6470 == -1 || !((Actor) this).aBool6450)
					break;
				Class135 class135 = this.method2676(-1);
				if (class135.method920((byte) 8, ((Actor) this).anInt6470))
					break;
				((Actor) this).anInt6470 = -1;
				((Actor) this).aBool6450 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lh.FA(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				f_kd++;
				if (((Player) this).aClass27_7131 != null && (((Actor) this).f_uc || method2917(false, class260, 0))) {
					this.method2660(((Actor) this).f_uc, ((Actor) this).f_qc, 0, class260);
					((Actor) this).f_qc[0] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
					if (i >= 53)
						break;
					method2912(69);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lh.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2910(byte i, int i_21_, int i_22_, int i_23_) {
		try {
			if (i_23_ != 1)
				method2918(null, -16, -94);
			f_wc++;
			if ((((Actor) this).anInt6426 ^ 0xffffffff) != 0 && (((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426)).anInt1741) == 1)
				((Actor) this).anInt6426 = -1;
			if (((Actor) this).anInt6437 != -1) {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).anInt6437);
				if (((Class144) class144).aBool2087 && (((Class144) class144).anInt2092 ^ 0xffffffff) != 0 && ((((Class124) (Class59_Sub3_Sub3.aClass45_6275.method304(i_23_ + 2, ((Class144) class144).anInt2092))).anInt1741) ^ 0xffffffff) == -2)
					((Actor) this).anInt6437 = -1;
			}
			if ((((Actor) this).f_pb ^ 0xffffffff) != 0) {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).f_pb);
				if (((Class144) class144).aBool2087 && (((Class144) class144).anInt2092 ^ 0xffffffff) != 0 && ((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092)).anInt1741) ^ 0xffffffff) == -2)
					((Actor) this).f_pb = -1;
			}
			((Player) this).anInt7133 = -1;
			if ((i_22_ ^ 0xffffffff) > -1 || (i_22_ ^ 0xffffffff) <= (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) || (i_21_ ^ 0xffffffff) > -1 || (Class152.anInt2205 ^ 0xffffffff) >= (i_21_ ^ 0xffffffff))
				method2913(i_21_, 0, i_22_);
			else if ((((Actor) this).f_mc[0] ^ 0xffffffff) <= -1 && ((Actor) this).f_mc[0] < Class38_Sub1_Sub1.anInt6770 && (((Actor) this).f_nc[0] ^ 0xffffffff) <= -1 && ((((Actor) this).f_nc[0] ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff))) {
				if (i == 2)
					Class130_Sub3.method1983(this, i_22_, 347, i_21_, (byte) 2);
				method2914(i_21_, i_22_, (byte) -128, i);
			} else
				method2913(i_21_, 0, i_22_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.DA(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final int method2675(byte i) {
		try {
			if (i != 18)
				method2912(-72);
			anInt7135++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.C(" + i + ')');
		}
	}

	final boolean method409(int i, int i_24_, Class260 class260, int i_25_) {
		try {
			anInt7126++;
			if (((Player) this).aClass27_7131 == null || !method2917(false, class260, 131072))
				return false;
			Class_c class_c = class260.method1730();
			int i_26_ = ((Actor) this).f_fb.method203(i_24_ - 103);
			class_c.ra(i_26_);
			class_c.o(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			boolean bool = false;
			for (int i_27_ = i_24_; i_27_ < ((Actor) this).f_qc.length; i_27_++) {
				if (((Actor) this).f_qc[i_27_] != null && ((Actor) this).f_qc[i_27_].method685(i_25_, i, class_c, true)) {
					bool = true;
					break;
				}
			}
			((Actor) this).f_qc[0] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.A(" + i + ',' + i_24_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_25_ + ')'));
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt7128++;
			if (((Player) this).aClass27_7131 == null || !method2917(false, class260, 2048))
				return null;
			Class_c class_c = class260.method1730();
			int i_28_ = ((Actor) this).f_fb.method203(-117);
			class_c.ra(i_28_);
			class_c.o(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			float f = class260.W();
			if (i >= -87)
				aByte7116 = (byte) -106;
			float f_29_ = class260.xa();
			if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool601) {
				Class135 class135 = this.method2676(-1);
				if (((Class135) class135).aBool1906 && ((((Class27) ((Player) this).aClass27_7131).anInt362) == -1 || ((Class253) (Class179.aClass228_2518.method1462(((Class27) (((Player) this).aClass27_7131)).anInt362, 1))).f_qb)) {
					Class124 class124 = ((((Actor) this).anInt6426 == -1 || ((Actor) this).f_qb != 0) ? null : Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426));
					Class124 class124_30_ = ((((Actor) this).anInt6470 != -1 && !((Player) this).f_ld && (!((Actor) this).aBool6450 || class124 == null)) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6470) : null);
					Class_t class_t = (CS2Script.method2415(((Actor) this).f_kb, ((Actor) this).anInt6462, ((Actor) this).f_qc[0], 0, ((Actor) this).f_ib, 0, class260, 160, 101, 1, i_28_, (class124_30_ != null ? ((Actor) this).anInt6420 : ((Actor) this).anInt6452), ((Actor) this).aBool6419, class124_30_ != null ? class124_30_ : class124, 240));
					if (class_t != null) {
						class260.g(f, f_29_ - 128.0F);
						class260.method1750(false);
						class_t.method680(class_c, null, 0);
						class260.method1750(true);
					}
				}
			}
			if (this == Class_a.aClass_r_Sub1_1180) {
				class260.g(f, -144.0F + f_29_);
				class_c.j(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
				for (int i_31_ = -1 + Class166.aClass29Array2347.length; (i_31_ ^ 0xffffffff) <= -1; i_31_--) {
					Class29 class29 = Class166.aClass29Array2347[i_31_];
					if (class29 != null && (((Class29) class29).anInt388 ^ 0xffffffff) != 0) {
						if ((((Class29) class29).anInt391 ^ 0xffffffff) == -2 && ((Class29) class29).anInt384 >= 0 && (((Class29) class29).anInt384 < Class76.aClass_r_Sub2Array1002.length)) {
							Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[((Class29) class29).anInt384]);
							if (class_r_sub2 != null) {
								int i_32_ = (((Class59_Sub3) class_r_sub2).anInt5060 + -(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060));
								int i_33_ = (-((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 + (((Class59_Sub3) class_r_sub2).anInt5059));
								method2916(i_33_, ((Actor) this).f_qc[0], i_32_, class260, -117, 5760000, ((Class29) class29).anInt388, class_c);
							}
						}
						if (((Class29) class29).anInt391 == 2) {
							int i_34_ = (-((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 + (64 + ((Class29) class29).anInt392));
							int i_35_ = (((Class29) class29).anInt394 + 64 - ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059);
							int i_36_ = ((Class29) class29).anInt389 << 7;
							i_36_ *= i_36_;
							method2916(i_35_, ((Actor) this).f_qc[0], i_34_, class260, -63, i_36_, ((Class29) class29).anInt388, class_c);
						}
						if (((Class29) class29).anInt391 == 10 && ((Class29) class29).anInt384 >= 0 && (Class143.aClass_r_Sub1Array2069.length > ((Class29) class29).anInt384)) {
							Player class_r_sub1_37_ = (Class143.aClass_r_Sub1Array2069[((Class29) class29).anInt384]);
							if (class_r_sub1_37_ != null) {
								int i_38_ = ((((Class59_Sub3) class_r_sub1_37_).anInt5060) + -(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060));
								int i_39_ = (-((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 + (((Class59_Sub3) class_r_sub1_37_).anInt5059));
								method2916(i_39_, ((Actor) this).f_qc[0], i_38_, class260, 64, 5760000, ((Class29) class29).anInt388, class_c);
							}
						}
					}
				}
				class_c.ra(i_28_);
				class_c.o(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			}
			class260.g(f, f_29_);
			Class130_Sub3 class130_sub3 = Class18.method177(((Actor) this).f_qc.length, (byte) -95);
			if (((Actor) this).f_lc != null) {
				Class129 class129 = ((Actor) this).f_lc.method1779();
				class260.method1740(((Actor) this).f_qc, class129, class_c, (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415), (Class_a.aClass_r_Sub1_1180 == this ? 1 : 0));
			} else
				class260.method1748(((Actor) this).f_qc, class_c, (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415), (Class_a.aClass_r_Sub1_1180 != this ? 0 : 1));
			this.method2660(false, ((Actor) this).f_qc, 0, class260);
			if (((Actor) this).f_qc[2] != null) {
				if (i_28_ != 0)
					((Actor) this).f_qc[2].Q(i_28_);
				((Actor) this).f_qc[2].JA((-((Class246_Sub16) ((Actor) this).f_pc).anInt4530 + ((Class59_Sub3) this).anInt5060), (-((Class246_Sub16) ((Actor) this).f_pc).anInt4519 + ((Class59_Sub3) this).anInt5052), (-((Class246_Sub16) ((Actor) this).f_pc).anInt4536 + ((Class59_Sub3) this).anInt5059));
			}
			((Actor) this).f_qc[0] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
			((Actor) this).anInt6453 = Class64_Sub1.anInt5236;
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2911(boolean bool) {
		do {
			try {
				f_id = null;
				f_rd = null;
				aClass67_7125 = null;
				f_vd = null;
				RUNSCRIPT_IN = null;
				if (bool == false)
					break;
				method2918(null, -101, -123);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lh.BA(" + bool + ')');
			}
			break;
		} while (false);
	}

	final int method2168(int i) {
		try {
			anInt7139++;
			if (i != -25430)
				return 98;
			return ((Actor) this).anInt6438;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.K(" + i + ')');
		}
	}

	final int method2668(byte i) {
		try {
			anInt7120++;
			if (i < 100)
				method2918(null, -83, 89);
			return anInt7134;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.T(" + i + ')');
		}
	}

	final boolean method2912(int i) {
		try {
			f_hd++;
			if (i < 10)
				return false;
			if (((Player) this).aClass27_7131 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.D(" + i + ')');
		}
	}

	final void method2913(int i, int i_40_, int i_41_) {
		do {
			try {
				((Actor) this).f_oc = i_40_;
				anInt7119++;
				((Actor) this).f_kc = 0;
				((Actor) this).f_sc = 0;
				((Actor) this).f_mc[0] = i_41_;
				((Actor) this).f_nc[0] = i;
				int i_42_ = method2670((byte) 127);
				((Class59_Sub3) this).anInt5060 = i_42_ * 64 + 128 * ((Actor) this).f_mc[0];
				((Class59_Sub3) this).anInt5059 = 128 * ((Actor) this).f_nc[0] - -(i_42_ * 64);
				if (this == Class_a.aClass_r_Sub1_1180)
					Class118.method815((byte) -36);
				if (((Actor) this).f_lc == null)
					break;
				((Actor) this).f_lc.method1772();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lh.JA(" + i + ',' + i_40_ + ',' + i_41_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2914(int i, int i_43_, byte i_44_, byte i_45_) {
		try {
			if ((((Actor) this).f_oc ^ 0xffffffff) > -10)
				((Actor) this).f_oc++;
			anInt7121++;
			for (int i_46_ = ((Actor) this).f_oc; (i_46_ ^ 0xffffffff) < -1; i_46_--) {
				((Actor) this).f_mc[i_46_] = ((Actor) this).f_mc[i_46_ - 1];
				((Actor) this).f_nc[i_46_] = ((Actor) this).f_nc[-1 + i_46_];
				((Actor) this).f_rc[i_46_] = ((Actor) this).f_rc[-1 + i_46_];
			}
			if (i_44_ >= -111)
				f_nd = -126;
			((Actor) this).f_mc[0] = i_43_;
			((Actor) this).f_rc[0] = i_45_;
			((Actor) this).f_nc[0] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.IA(" + i + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ')'));
		}
	}

	final boolean method406(byte i) {
		try {
			if (i < 104)
				method2916(-53, null, 75, null, -121, 100, -12, null);
			anInt7117++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.E(" + i + ')');
		}
	}

	final void method405(int i, int i_47_, Class59 class59, byte i_48_, boolean bool, Class260 class260, int i_49_) {
		try {
			f_gd++;
			if (i_48_ != -99)
				method2913(102, 46, -19);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.L(" + i + ',' + i_47_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_48_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_49_ + ')'));
		}
	}

	final String method2915(int i, boolean bool) {
		try {
			int i_50_ = -102 / ((-72 - i) / 33);
			anInt7137++;
			String string = "";
			if (Class251.aStringArray3546 != null)
				string += Class251.aStringArray3546[f_vc];
			int[] is;
			if (aByte7124 != 1 || Class_t_Sub1.f_vc == null)
				is = Class259_Sub2.anIntArray4959;
			else
				is = Class_t_Sub1.f_vc;
			if (is != null && (is[f_vc] ^ 0xffffffff) != 0) {
				Class183 class183 = Class246_Sub39.aClass141_5487.method954(is[f_vc], 79);
				if (((Class183) class183).aChar2547 == 's')
					string += class183.method1185(108, 0xff & aByte7116);
				else {
					Class194_Sub1.method1883(new Throwable(), "gdn1", 54);
					is[f_vc] = -1;
				}
			}
			if (!bool)
				string += ((Player) this).aString7140;
			else
				string += ((Player) this).aString7123;
			if (Class249.aStringArray3514 != null)
				string += Class249.aStringArray3514[f_vc];
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.CA(" + i + ',' + bool + ')');
		}
	}

	private final void method2916(int i, Class_t class_t, int i_51_, Class260 class260, int i_52_, int i_53_, int i_54_, Class_c class_c) {
		do {
			try {
				f_md++;
				int i_55_ = i_51_ * i_51_ + i * i;
				if ((i_55_ ^ 0xffffffff) <= -16385 && (i_53_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff)) {
					int i_56_ = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_51_, (double) i));
					int i_57_ = 35 / ((i_52_ - 18) / 45);
					Class_t class_t_58_ = (Class246_Sub1_Sub14.method2713(i_54_, ((Actor) this).anInt6462, class260, -124, ((Actor) this).f_kb, i_56_, ((Actor) this).f_ib));
					if (class_t_58_ == null)
						break;
					class260.method1750(false);
					class_t_58_.method680(class_c, null, 0);
					class260.method1750(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lh.KA(" + i + ',' + (class_t != null ? "{...}" : "null") + ',' + i_51_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + (class_c != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2670(byte i) {
		try {
			f_ud++;
			if (((Player) this).aClass27_7131 != null && (((Class27) ((Player) this).aClass27_7131).anInt362 != -1))
				return (((Class253) Class179.aClass228_2518.method1462((((Class27) (((Player) this).aClass27_7131)).anInt362), 1)).anInt3574);
			if (i != 127)
				return -57;
			return super.method2670((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.GA(" + i + ')');
		}
	}

	private final boolean method2917(boolean bool, Class260 class260, int i) {
		try {
			anInt7136++;
			int i_59_ = i;
			Class135 class135 = this.method2676(-1);
			Class124 class124 = (((((Actor) this).anInt6426 ^ 0xffffffff) != 0 && (((Actor) this).f_qb ^ 0xffffffff) == -1) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426) : null);
			Class124 class124_60_ = ((((Actor) this).anInt6470 != -1 && !((Player) this).f_ld && (!((Actor) this).aBool6450 || class124 == null)) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6470) : null);
			if (bool != false)
				((Player) this).f_wd = 25;
			int i_61_ = ((Class135) class135).anInt1886;
			int i_62_ = ((Class135) class135).anInt1895;
			if (i_61_ != 0 || (i_62_ ^ 0xffffffff) != -1 || (((Class135) class135).anInt1899 ^ 0xffffffff) != -1 || ((Class135) class135).anInt1884 != 0)
				i |= 0x7;
			boolean bool_63_ = ((((Actor) this).aByte6425 ^ 0xffffffff) != -1 && (((Actor) this).anInt6424 <= Class246_Sub1_Sub4.anInt5752) && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) > (((Actor) this).anInt6460 ^ 0xffffffff)));
			if (bool_63_)
				i |= 0x80000;
			Class_t class_t = (((Actor) this).f_qc[0] = (((Player) this).aClass27_7131.method215(Class118.aClass_v1641, Class238.aClass92_3358, class124_60_, i, ((Actor) this).aClass148Array6467, Class179.aClass228_2518, ((Actor) this).anInt6449, ((Actor) this).anInt6452, class124, (byte) 127, Class59_Sub3_Sub3.aClass45_6275, ((Actor) this).f_cb, ((Actor) this).anInt6420, class260, Class255.aClass191_3663, ((Actor) this).anInt6457, Class246_Sub28_Sub23.aClass95_6658, ((Actor) this).anInt6465, true)));
			int i_64_ = Class40_Sub6.method2183((byte) -29);
			if (Class40_Sub2.anInt4047 < 96 && i_64_ > 50)
				Class188.method1230((byte) 113);
			if (Class208.aClass205_2930 == Class260_Sub2.aClass205_4297 || i_64_ >= 50) {
				if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297) {
					Class220.aByteArrayArray3051 = new byte[50][];
					Class55.anInt781 = 0;
				}
			} else {
				int i_65_;
				for (i_65_ = -i_64_ + 50; Class55.anInt781 < i_65_; Class55.anInt781++)
					Class220.aByteArrayArray3051[Class55.anInt781] = new byte[102400];
				while (i_65_ < Class55.anInt781) {
					Class55.anInt781--;
					Class220.aByteArrayArray3051[Class55.anInt781] = null;
				}
			}
			if (class_t == null)
				return false;
			((Actor) this).anInt6438 = class_t.MA();
			this.method2666((byte) -17, class_t);
			int i_66_ = ((Actor) this).f_fb.method203(-126);
			if (i_61_ != 0 || i_62_ != 0) {
				this.method2671(i_61_, ((Class135) class135).anInt1896, ((Class135) class135).anInt1923, i_66_, i_62_, -83);
				if ((((Actor) this).anInt6462 ^ 0xffffffff) != -1)
					class_t.Z(((Actor) this).anInt6462);
				if (((Actor) this).f_kb != 0)
					class_t.R(((Actor) this).f_kb);
				if (((Actor) this).f_ib != 0)
					class_t.JA(0, ((Actor) this).f_ib, 0);
			} else
				this.method2671(method2670((byte) 127) << 7, 0, 0, i_66_, method2670((byte) 127) << 7, -72);
			if (bool_63_)
				class_t.method684(((Actor) this).aByte6468, ((Actor) this).aByte6436, ((Actor) this).f_mb, 0xff & ((Actor) this).aByte6425);
			if (((Player) this).f_ld || ((Actor) this).anInt6437 == -1 || (((Actor) this).anInt6433 ^ 0xffffffff) == 0)
				((Actor) this).f_qc[1] = null;
			else {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).anInt6437);
				boolean bool_67_ = (((Class144) class144).aByte2076 == 3 && (i_61_ != 0 || i_62_ != 0));
				int i_68_ = i_59_;
				if (bool_67_)
					i_68_ |= 0x7;
				else {
					if (((Actor) this).anInt6421 != 0)
						i_68_ |= 0x5;
					if ((((Actor) this).anInt6417 ^ 0xffffffff) != -1)
						i_68_ |= 0x2;
				}
				Class_t class_t_69_ = (((Actor) this).f_qc[1] = class144.method965(((Actor) this).anInt6433, ((Actor) this).anInt6442, Class59_Sub3_Sub3.aClass45_6275, (byte) -113, ((Actor) this).f_fc, i_68_, class260));
				if (class_t_69_ != null) {
					if ((((Actor) this).anInt6417 ^ 0xffffffff) != -1)
						class_t_69_.JA(0, -((Actor) this).anInt6417 << 0, 0);
					if ((((Actor) this).anInt6421 ^ 0xffffffff) != -1)
						class_t_69_.Q(2048 * ((Actor) this).anInt6421);
					if (bool_67_) {
						if (((Actor) this).anInt6462 != 0)
							class_t_69_.Z(((Actor) this).anInt6462);
						if (((Actor) this).f_kb != 0)
							class_t_69_.R(((Actor) this).f_kb);
						if (((Actor) this).f_ib != 0)
							class_t_69_.JA(0, ((Actor) this).f_ib, 0);
					}
				}
			}
			if (((Player) this).f_ld || (((Actor) this).f_pb ^ 0xffffffff) == 0 || (((Actor) this).anInt6427 ^ 0xffffffff) == 0)
				((Actor) this).f_qc[3] = null;
			else {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).f_pb);
				boolean bool_70_ = (((Class144) class144).aByte2076 == 3 && ((i_61_ ^ 0xffffffff) != -1 || (i_62_ ^ 0xffffffff) != -1));
				int i_71_ = i_59_;
				if (!bool_70_) {
					if ((((Actor) this).anInt6446 ^ 0xffffffff) != -1)
						i_71_ |= 0x5;
					if ((((Actor) this).anInt6443 ^ 0xffffffff) != -1)
						i_71_ |= 0x2;
				} else
					i_71_ |= 0x7;
				Class_t class_t_72_ = (((Actor) this).f_qc[3] = class144.method972(class260, (byte) -53, ((Actor) this).anInt6454, Class59_Sub3_Sub3.aClass45_6275, ((Actor) this).anInt6427, i_71_, ((Actor) this).anInt6461));
				if (class_t_72_ != null) {
					if (((Actor) this).anInt6443 != 0)
						class_t_72_.JA(0, -((Actor) this).anInt6443 << 0, 0);
					if (((Actor) this).anInt6446 != 0)
						class_t_72_.Q(2048 * ((Actor) this).anInt6446);
					if (bool_70_) {
						if ((((Actor) this).anInt6462 ^ 0xffffffff) != -1)
							class_t_72_.Z(((Actor) this).anInt6462);
						if ((((Actor) this).f_kb ^ 0xffffffff) != -1)
							class_t_72_.R(((Actor) this).f_kb);
						if (((Actor) this).f_ib != 0)
							class_t_72_.JA(0, ((Actor) this).f_ib, 0);
					}
				}
			}
			((Actor) this).f_qc[2] = null;
			if (!((Player) this).f_ld && ((Actor) this).f_pc != null) {
				if ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= (((Class246_Sub16) ((Actor) this).f_pc).anInt4535 ^ 0xffffffff))
					((Actor) this).f_pc = null;
				else if ((((Class246_Sub16) ((Actor) this).f_pc).anInt4523 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff)) {
					Class_t class_t_73_ = ((Actor) this).f_pc.method2017(1, class260, i_59_ | 0x7);
					if (class_t_73_ != null) {
						class_t_73_.JA((((Class246_Sub16) ((Actor) this).f_pc).anInt4530 + -((Class59_Sub3) this).anInt5060), (((Class246_Sub16) ((Actor) this).f_pc).anInt4519 - ((Class59_Sub3) this).anInt5052), (-((Class59_Sub3) this).anInt5059 + ((Class246_Sub16) ((Actor) this).f_pc).anInt4536));
						if ((i_66_ ^ 0xffffffff) != -1)
							class_t_73_.Q(0x3fff & -i_66_);
						((Actor) this).f_qc[2] = class_t_73_;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.EA(" + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2918(Class138 class138, int i, int i_74_) {
		try {
			if (i_74_ < 46)
				f_rd = null;
			if (Class59_Sub4.aBool5189) {
				Class59_Sub4.aBool5189 = false;
				i = 0;
			}
			f_ad++;
			if (Class40_Sub9.aClass138_5495 == null || !Class40_Sub9.aClass138_5495.method936((byte) 115, class138)) {
				Class40_Sub9.aClass138_5495 = class138;
				Class253.f_nb = Class151.time(-113);
				Class220.anInt3055 = Class109_Sub4.anInt4566 = i;
				if (Class220.anInt3055 != 0) {
					Class39_Sub1.aFloat4668 = Class259_Sub3_Sub1.aFloat6901;
					f_od = Class3.anInt29;
					Canvas_Sub1.aFloat6895 = Class126.aFloat1782;
					Class165.aFloat2339 = Class31.aFloat420;
					Class19.anInt313 = Class195.anInt2731;
					Class122.aFloat1686 = Node.aFloat3470;
					Class56.aFloat790 = Class246_Sub28_Sub19.aFloat6549;
					Class246_Sub1_Sub15_Sub2.aFloat7083 = Class193.aFloat2718;
					OutputStream_Sub1.anInt4490 = Class222.anInt3069;
					Class210_Sub2.aClass211_5015 = Class_u.aClass211_4701;
				} else
					Class154_Sub1.method2089(127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lh.AA(" + (class138 != null ? "{...}" : "null") + ',' + i + ',' + i_74_ + ')'));
		}
	}

	final void method401(int i) {
		try {
			anInt7114++;
			int i_75_ = -67 % ((57 - i) / 44);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.J(" + i + ')');
		}
	}

	final String method2919(boolean bool, int i) {
		try {
			if (i != 1)
				((Player) this).aString7140 = null;
			anInt7115++;
			if (bool)
				return ((Player) this).aString7123;
			return ((Player) this).aString7140;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lh.HA(" + bool + ',' + i + ')');
		}
	}

	public Player() {
		f_vc = (byte) 0;
		((Player) this).anInt7133 = -1;
		((Player) this).anInt7127 = -1;
		((Player) this).anInt7141 = -1;
		((Player) this).f_cd = -1;
		((Player) this).f_fd = 0;
		((Player) this).anInt7138 = 0;
		((Player) this).aBool7142 = false;
		((Player) this).f_ld = false;
		((Player) this).aBool7129 = false;
		((Player) this).f_bd = 0;
		aByte7124 = (byte) 0;
		((Player) this).f_jd = -1;
		((Player) this).f_td = -1;
		((Player) this).anInt7132 = -1;
		((Player) this).f_dd = 0;
		((Player) this).f_qd = 0;
		((Player) this).f_wd = 255;
	}

	static {
		aClass67_7125 = new Class67("Self", "Mich", "Moi", "Eu");
		RUNSCRIPT_IN = new IncomingPacket(27, -2);
	}
}
