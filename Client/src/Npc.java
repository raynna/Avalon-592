/* Class_r_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Npc extends Actor {
	int f_vc = -1;
	static int f_wc;
	static int anInt7166;
	static int anInt7167;
	static OutgoingPacket aClass201_7168 = new OutgoingPacket(58, 6);
	static int anInt7169;
	static int anInt7170;
	int anInt7171 = -1;
	static int anInt7172;
	static int anInt7173;
	static int anInt7174;
	static int anInt7175;
	static int anInt7176;
	static int anInt7177;
	static int anInt7178;
	static int anInt7179;
	static int anInt7180;
	static int anInt7181;
	static int anInt7182;
	static int anInt7183;
	Class253 aClass253_7184;

	static final void method2927(int i) {
		try {
			Class78.method491(-62);
			anInt7174++;
			if (i != 0)
				aClass201_7168 = null;
			Class210_Sub2.aClass211_5015 = null;
			Class_a.aClass138ArrayArray1175 = null;
			Class142.aClass211_2064 = null;
			Class33.aClass260_444 = null;
			Class_u.aClass211_4701 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.W(" + i + ')');
		}
	}

	final int method2668(byte i) {
		try {
			if (i <= 100)
				method2675((byte) -5);
			f_wc++;
			if ((((Class253) ((Npc) this).aClass253_7184).anIntArray3594) != null) {
				Class253 class253 = (((Npc) this).aClass253_7184.method1624(false, Class246_Sub28_Sub23.aClass95_6658));
				if (class253 != null && ((Class253) class253).anInt3621 != -1)
					return ((Class253) class253).anInt3621;
			}
			return ((Class253) ((Npc) this).aClass253_7184).anInt3621;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.T(" + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			if (i < 104)
				return false;
			anInt7177++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.E(" + i + ')');
		}
	}

	final void method405(int i, int i_0_, Class59 class59, byte i_1_, boolean bool, Class260 class260, int i_2_) {
		try {
			if (i_1_ != -99)
				((Npc) this).aClass253_7184 = null;
			anInt7176++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rs.L(" + i + ',' + i_0_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_1_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	final void method2928(int i, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_) {
		do {
			try {
				anInt7183++;
				((Class59_Sub3) this).aByte5053 = (byte) i;
				if (((Actor) this).anInt6426 != -1 && ((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426)).anInt1741) ^ 0xffffffff) == -2)
					((Actor) this).anInt6426 = -1;
				if ((((Actor) this).anInt6437 ^ 0xffffffff) != 0) {
					Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).anInt6437);
					if (((Class144) class144).aBool2087 && (((Class144) class144).anInt2092 ^ 0xffffffff) != 0 && (((Class124) (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092))).anInt1741) == 1)
						((Actor) this).anInt6437 = -1;
				}
				if (((Actor) this).f_pb != -1) {
					Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).f_pb);
					if (((Class144) class144).aBool2087 && ((Class144) class144).anInt2092 != -1 && (((Class124) (Class59_Sub3_Sub3.aClass45_6275.method304(i_3_ ^ ~0x4fd7, ((Class144) class144).anInt2092))).anInt1741) == 1)
						((Actor) this).f_pb = -1;
				}
				if (!bool) {
					int i_7_ = i_4_ + -((Actor) this).f_mc[0];
					int i_8_ = -((Actor) this).f_nc[0] + i_6_;
					if ((i_7_ ^ 0xffffffff) <= 7 && (i_7_ ^ 0xffffffff) >= -9 && (i_8_ ^ 0xffffffff) <= 7 && (i_8_ ^ 0xffffffff) >= -9) {
						if ((((Actor) this).f_oc ^ 0xffffffff) > -10)
							((Actor) this).f_oc++;
						for (int i_9_ = ((Actor) this).f_oc; i_9_ > 0; i_9_--) {
							((Actor) this).f_mc[i_9_] = ((Actor) this).f_mc[-1 + i_9_];
							((Actor) this).f_nc[i_9_] = ((Actor) this).f_nc[i_9_ - 1];
							((Actor) this).f_rc[i_9_] = ((Actor) this).f_rc[i_9_ - 1];
						}
						((Actor) this).f_mc[0] = i_4_;
						((Actor) this).f_nc[0] = i_6_;
						((Actor) this).f_rc[0] = (byte) 1;
						break;
					}
				}
				((Actor) this).f_mc[0] = i_4_;
				((Actor) this).f_oc = 0;
				((Actor) this).f_kc = 0;
				((Actor) this).f_sc = 0;
				((Actor) this).f_nc[0] = i_6_;
				if (i_3_ != -20437)
					aClass201_7168 = null;
				((Class59_Sub3) this).anInt5059 = (((Actor) this).f_nc[0] << 7) + (i_5_ << 6);
				((Class59_Sub3) this).anInt5060 = (i_5_ << 6) + (((Actor) this).f_mc[0] << 7);
				if (((Actor) this).f_lc == null)
					break;
				((Actor) this).f_lc.method1772();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rs.M(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + bool + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final int method2674(int i) {
		try {
			anInt7167++;
			if (i != 0)
				return 12;
			if ((((Class253) ((Npc) this).aClass253_7184).anIntArray3594) != null) {
				Class253 class253 = (((Npc) this).aClass253_7184.method1624(false, Class246_Sub28_Sub23.aClass95_6658));
				if (class253 != null && (((Class253) class253).f_ib ^ 0xffffffff) != 0)
					return ((Class253) class253).f_ib;
			}
			if ((((Class253) ((Npc) this).aClass253_7184).f_ib ^ 0xffffffff) == 0)
				return super.method2674(0);
			return ((Class253) ((Npc) this).aClass253_7184).f_ib;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.U(" + i + ')');
		}
	}

	public static void method2929(int i) {
		try {
			if (i != 0)
				aClass201_7168 = null;
			aClass201_7168 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.G(" + i + ')');
		}
	}

	final int method2168(int i) {
		try {
			anInt7173++;
			if (i != -25430)
				return -37;
			return ((Actor) this).anInt6438;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.K(" + i + ')');
		}
	}

	final void method401(int i) {
		try {
			anInt7170++;
			int i_10_ = -64 / ((i - 57) / 44);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.J(" + i + ')');
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt7179++;
			if (((Npc) this).aClass253_7184 == null || !method2932(-77, class260, 2048))
				return null;
			if (i > -87)
				return null;
			Class_c class_c = class260.method1730();
			int i_11_ = ((Actor) this).f_fb.method203(-118);
			class_c.ra(i_11_);
			class_c.o(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			Class135 class135 = this.method2676(-1);
			Class253 class253 = ((((Class253) ((Npc) this).aClass253_7184).anIntArray3594) == null ? ((Npc) this).aClass253_7184 : (((Npc) this).aClass253_7184.method1624(false, Class246_Sub28_Sub23.aClass95_6658)));
			if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool601 && ((Class253) class253).f_qb && ((Class135) class135).aBool1906) {
				Class124 class124 = (((((Actor) this).anInt6426 ^ 0xffffffff) != 0 && ((Actor) this).f_qb == 0) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426) : null);
				Class124 class124_12_ = ((((Actor) this).anInt6470 != -1 && (!((Actor) this).aBool6450 || class124 == null)) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6470) : null);
				Class_t class_t = (CS2Script.method2415(((Actor) this).f_kb, ((Actor) this).anInt6462, ((Actor) this).f_qc[0], 0xffff & ((Class253) ((Npc) this).aClass253_7184).f_tb, ((Actor) this).f_ib, (((Class253) ((Npc) this).aClass253_7184).aShort3615) & 0xffff, class260, (((Class253) ((Npc) this).aClass253_7184).aByte3603) & 0xff, 109, (((Class253) ((Npc) this).aClass253_7184).anInt3574), i_11_, (class124_12_ != null ? ((Actor) this).anInt6420 : ((Actor) this).anInt6452), ((Actor) this).aBool6419, class124_12_ != null ? class124_12_ : class124, 0xff & ((Class253) (((Npc) this).aClass253_7184)).aByte3610));
				if (class_t != null) {
					float f = class260.W();
					float f_13_ = class260.xa();
					class260.method1750(false);
					class260.g(f, -150.0F + f_13_);
					class_t.method680(class_c, null, 0);
					class260.g(f, f_13_);
					class260.method1750(true);
				}
			}
			Class130_Sub3 class130_sub3 = null;
			if (method2933(-1))
				class130_sub3 = Class18.method177(((Actor) this).f_qc.length, (byte) -95);
			do {
				if (((Actor) this).f_lc == null) {
					class260.method1748(((Actor) this).f_qc, class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415)), 0);
					if (!client.f_ob)
						break;
				}
				Class129 class129 = ((Actor) this).f_lc.method1779();
				class260.method1740(((Actor) this).f_qc, class129, class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415)), 0);
			} while (false);
			this.method2660(false, ((Actor) this).f_qc, 0, class260);
			if (((Actor) this).f_qc[2] != null) {
				if ((i_11_ ^ 0xffffffff) != -1)
					((Actor) this).f_qc[2].Q(i_11_);
				((Actor) this).f_qc[2].JA((((Class59_Sub3) this).anInt5060 + -((Class246_Sub16) ((Actor) this).f_pc).anInt4530), (-((Class246_Sub16) ((Actor) this).f_pc).anInt4519 + ((Class59_Sub3) this).anInt5052), (((Class59_Sub3) this).anInt5059 - ((Class246_Sub16) ((Actor) this).f_pc).anInt4536));
			}
			((Actor) this).anInt6453 = Class64_Sub1.anInt5236;
			((Actor) this).f_qc[0] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method2930(int i) {
		try {
			if (i <= 10)
				method2934((byte) 87, null);
			anInt7182++;
			if (((Npc) this).aClass253_7184 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.D(" + i + ')');
		}
	}

	final int method2675(byte i) {
		try {
			anInt7166++;
			if (i != 18)
				method2929(44);
			if ((((Class253) ((Npc) this).aClass253_7184).anIntArray3594) != null) {
				Class253 class253 = (((Npc) this).aClass253_7184.method1624(false, Class246_Sub28_Sub23.aClass95_6658));
				if (class253 != null && ((Class253) class253).anInt3585 != -1)
					return ((Class253) class253).anInt3585;
			}
			return ((Class253) ((Npc) this).aClass253_7184).anInt3585;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.C(" + i + ')');
		}
	}

	final boolean method409(int i, int i_14_, Class260 class260, int i_15_) {
		try {
			anInt7180++;
			if (((Npc) this).aClass253_7184 == null || !method2932(-91, class260, 131072))
				return false;
			Class_c class_c = class260.method1730();
			int i_16_ = ((Actor) this).f_fb.method203(-96);
			class_c.ra(i_16_);
			class_c.o(((Class59_Sub3) this).anInt5060, ((Class59_Sub3) this).anInt5052, ((Class59_Sub3) this).anInt5059);
			boolean bool = false;
			for (int i_17_ = 0; i_17_ < ((Actor) this).f_qc.length; i_17_++) {
				if (((Actor) this).f_qc[i_17_] != null && (((Actor) this).f_qc[i_17_].method685(i_15_, i, class_c, (((Class253) ((Npc) this).aClass253_7184).anInt3574) == 1))) {
					bool = true;
					break;
				}
			}
			((Actor) this).f_qc[i_14_] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rs.A(" + i + ',' + i_14_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	final void method2931(int i, int i_18_, int i_19_) {
		try {
			anInt7172++;
			int i_20_ = -77 % ((-93 - i) / 33);
			int i_21_ = ((Actor) this).f_mc[0];
			int i_22_ = ((Actor) this).f_nc[0];
			if (i_18_ == 0)
				i_22_++;
			if (i_18_ == 1) {
				i_21_++;
				i_22_++;
			}
			if ((i_18_ ^ 0xffffffff) == -3)
				i_21_++;
			if ((i_18_ ^ 0xffffffff) == -4) {
				i_22_--;
				i_21_++;
			}
			if (i_18_ == 4)
				i_22_--;
			if (i_18_ == 5) {
				i_22_--;
				i_21_--;
			}
			if ((i_18_ ^ 0xffffffff) == -7)
				i_21_--;
			if (((Actor) this).anInt6426 != -1 && ((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426)).anInt1741) ^ 0xffffffff) == -2)
				((Actor) this).anInt6426 = -1;
			if (i_18_ == 7) {
				i_21_--;
				i_22_++;
			}
			if (((Actor) this).anInt6437 != -1) {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).anInt6437);
				if (((Class144) class144).aBool2087 && ((Class144) class144).anInt2092 != -1 && ((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092)).anInt1741) ^ 0xffffffff) == -2)
					((Actor) this).anInt6437 = -1;
			}
			if ((((Actor) this).f_pb ^ 0xffffffff) != 0) {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).f_pb);
				if (((Class144) class144).aBool2087 && ((Class144) class144).anInt2092 != -1 && ((((Class124) Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class144) class144).anInt2092)).anInt1741) ^ 0xffffffff) == -2)
					((Actor) this).f_pb = -1;
			}
			if (((Actor) this).f_oc < 9)
				((Actor) this).f_oc++;
			for (int i_23_ = ((Actor) this).f_oc; i_23_ > 0; i_23_--) {
				((Actor) this).f_mc[i_23_] = ((Actor) this).f_mc[i_23_ - 1];
				((Actor) this).f_nc[i_23_] = ((Actor) this).f_nc[i_23_ - 1];
				((Actor) this).f_rc[i_23_] = ((Actor) this).f_rc[i_23_ - 1];
			}
			((Actor) this).f_mc[0] = i_21_;
			((Actor) this).f_nc[0] = i_22_;
			((Actor) this).f_rc[0] = (byte) i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rs.I(" + i + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method403(Class260 class260, int i) {
		try {
			if (i <= 53)
				((Npc) this).aClass253_7184 = null;
			anInt7181++;
			if (((Npc) this).aClass253_7184 != null && (((Actor) this).f_uc || method2932(-98, class260, 0))) {
				this.method2660(((Actor) this).f_uc, ((Actor) this).f_qc, 0, class260);
				((Actor) this).f_qc[0] = ((Actor) this).f_qc[1] = ((Actor) this).f_qc[2] = ((Actor) this).f_qc[3] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final boolean method2932(int i, Class260 class260, int i_24_) {
		try {
			anInt7175++;
			int i_25_ = i_24_;
			Class135 class135 = this.method2676(-1);
			Class124 class124 = ((((Actor) this).anInt6426 != -1 && ((Actor) this).f_qb == 0) ? Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6426) : null);
			Class124 class124_26_ = ((((Actor) this).anInt6470 == -1 || ((Actor) this).aBool6450 && class124 != null) ? null : Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) this).anInt6470));
			int i_27_ = ((Class135) class135).anInt1886;
			int i_28_ = ((Class135) class135).anInt1895;
			if ((i_27_ ^ 0xffffffff) != -1 || (i_28_ ^ 0xffffffff) != -1 || (((Class135) class135).anInt1899 ^ 0xffffffff) != -1 || ((Class135) class135).anInt1884 != 0)
				i_24_ |= 0x7;
			boolean bool = ((((Actor) this).aByte6425 ^ 0xffffffff) != -1 && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= (((Actor) this).anInt6424 ^ 0xffffffff)) && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) > (((Actor) this).anInt6460 ^ 0xffffffff)));
			if (bool)
				i_24_ |= 0x80000;
			Class_t class_t = (((Actor) this).f_qc[0] = (((Npc) this).aClass253_7184.method1625(((Actor) this).anInt6457, -77, class124, Class246_Sub28_Sub23.aClass95_6658, ((Actor) this).anInt6449, i_24_, ((Actor) this).anInt6465, ((Actor) this).anInt6420, class260, ((Actor) this).anInt6452, ((Actor) this).f_cb, ((Actor) this).aClass148Array6467, class124_26_, Class59_Sub3_Sub3.aClass45_6275, Class118.aClass_v1641)));
			if (class_t == null)
				return false;
			((Actor) this).anInt6438 = class_t.MA();
			this.method2666((byte) -17, class_t);
			int i_29_ = ((Actor) this).f_fb.method203(-119);
			if ((i_27_ ^ 0xffffffff) != -1 || (i_28_ ^ 0xffffffff) != -1) {
				this.method2671(i_27_, ((Class135) class135).anInt1896, ((Class135) class135).anInt1923, i_29_, i_28_, -60);
				if (((Actor) this).anInt6462 != 0)
					((Actor) this).f_qc[0].Z(((Actor) this).anInt6462);
				if ((((Actor) this).f_kb ^ 0xffffffff) != -1)
					((Actor) this).f_qc[0].R(((Actor) this).f_kb);
				if (((Actor) this).f_ib != 0)
					((Actor) this).f_qc[0].JA(0, ((Actor) this).f_ib, 0);
			} else
				this.method2671(this.method2670((byte) 127) << 7, 0, 0, i_29_, this.method2670((byte) 127) << 7, -54);
			if (bool)
				class_t.method684(((Actor) this).aByte6468, ((Actor) this).aByte6436, ((Actor) this).f_mb, 0xff & ((Actor) this).aByte6425);
			if (i >= -72)
				return true;
			if ((((Actor) this).anInt6437 ^ 0xffffffff) == 0 || (((Actor) this).anInt6433 ^ 0xffffffff) == 0)
				((Actor) this).f_qc[1] = null;
			else {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).anInt6437);
				boolean bool_30_ = (((Class144) class144).aByte2076 == 3 && ((i_27_ ^ 0xffffffff) != -1 || i_28_ != 0));
				int i_31_ = i_25_;
				if (bool_30_)
					i_31_ |= 0x7;
				else {
					if (((Actor) this).anInt6421 != 0)
						i_31_ |= 0x5;
					if (((Actor) this).anInt6417 != 0)
						i_31_ |= 0x2;
				}
				Class_t class_t_32_ = (((Actor) this).f_qc[1] = class144.method965(((Actor) this).anInt6433, ((Actor) this).anInt6442, Class59_Sub3_Sub3.aClass45_6275, (byte) -114, ((Actor) this).f_fc, i_31_, class260));
				if (class_t_32_ != null) {
					if ((((Actor) this).anInt6417 ^ 0xffffffff) != -1)
						class_t_32_.JA(0, -((Actor) this).anInt6417 << 0, 0);
					if (((Actor) this).anInt6421 != 0)
						class_t_32_.Q(2048 * ((Actor) this).anInt6421);
					if (bool_30_) {
						if ((((Actor) this).anInt6462 ^ 0xffffffff) != -1)
							class_t_32_.Z(((Actor) this).anInt6462);
						if (((Actor) this).f_kb != 0)
							class_t_32_.R(((Actor) this).f_kb);
						if ((((Actor) this).f_ib ^ 0xffffffff) != -1)
							class_t_32_.JA(0, ((Actor) this).f_ib, 0);
					}
				}
			}
			if (((Actor) this).f_pb == -1 || (((Actor) this).anInt6427 ^ 0xffffffff) == 0)
				((Actor) this).f_qc[3] = null;
			else {
				Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) this).f_pb);
				boolean bool_33_ = ((((Class144) class144).aByte2076 ^ 0xffffffff) == -4 && (i_27_ != 0 || (i_28_ ^ 0xffffffff) != -1));
				int i_34_ = i_25_;
				if (!bool_33_) {
					if ((((Actor) this).anInt6446 ^ 0xffffffff) != -1)
						i_34_ |= 0x5;
					if ((((Actor) this).anInt6443 ^ 0xffffffff) != -1)
						i_34_ |= 0x2;
				} else
					i_34_ |= 0x7;
				Class_t class_t_35_ = (((Actor) this).f_qc[3] = class144.method972(class260, (byte) -53, ((Actor) this).anInt6454, Class59_Sub3_Sub3.aClass45_6275, ((Actor) this).anInt6427, i_34_, ((Actor) this).anInt6461));
				if (class_t_35_ != null) {
					if ((((Actor) this).anInt6443 ^ 0xffffffff) != -1)
						class_t_35_.JA(0, -((Actor) this).anInt6443 << 0, 0);
					if ((((Actor) this).anInt6446 ^ 0xffffffff) != -1)
						class_t_35_.Q(2048 * ((Actor) this).anInt6446);
					if (bool_33_) {
						if ((((Actor) this).anInt6462 ^ 0xffffffff) != -1)
							class_t_35_.Z(((Actor) this).anInt6462);
						if (((Actor) this).f_kb != 0)
							class_t_35_.R(((Actor) this).f_kb);
						if ((((Actor) this).f_ib ^ 0xffffffff) != -1)
							class_t_35_.JA(0, ((Actor) this).f_ib, 0);
					}
				}
			}
			((Actor) this).f_qc[2] = null;
			if (((Actor) this).f_pc != null) {
				if (((Class246_Sub16) ((Actor) this).f_pc).anInt4535 <= Class246_Sub1_Sub4.anInt5752)
					((Actor) this).f_pc = null;
				else if ((((Class246_Sub16) ((Actor) this).f_pc).anInt4523 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff)) {
					Class_t class_t_36_ = ((Actor) this).f_pc.method2017(1, class260, i_25_ | 0x7);
					if (class_t_36_ != null) {
						class_t_36_.JA((-((Class59_Sub3) this).anInt5060 + ((Class246_Sub16) ((Actor) this).f_pc).anInt4530), (((Class246_Sub16) ((Actor) this).f_pc).anInt4519 + -((Class59_Sub3) this).anInt5052), (((Class246_Sub16) ((Actor) this).f_pc).anInt4536 + -((Class59_Sub3) this).anInt5059));
						if ((i_29_ ^ 0xffffffff) != -1)
							class_t_36_.Q(i_29_);
						((Actor) this).f_qc[2] = class_t_36_;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rs.V(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_24_ + ')'));
		}
	}

	private final boolean method2933(int i) {
		try {
			anInt7169++;
			if (i != -1)
				((Npc) this).aClass253_7184 = null;
			return ((Class253) ((Npc) this).aClass253_7184).aBool3596;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rs.R(" + i + ')');
		}
	}

	public Npc() {
		/* empty */
	}

	final void method2934(byte i, Class253 class253) {
		do {
			try {
				anInt7178++;
				((Npc) this).aClass253_7184 = class253;
				if (((Actor) this).f_lc != null)
					((Actor) this).f_lc.method1772();
				if (i <= -114)
					break;
				method2928(25, -50, 104, -108, true, -102);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rs.F(" + i + ',' + (class253 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
