/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254 {
	private HashMap aClass54_3622 = new HashMap(64);
	static int[] anIntArray3623;
	private Class_fs aClass_fs3624;
	static int[] anIntArray3625 = new int[2];
	static int anInt3626;
	static int anInt3627;
	Class_fs aClass_fs3628;
	static int anInt3629;
	static int anInt3630;
	static int anInt3631;
	static int anInt3632;
	static int anInt3633;
	static int anInt3634;
	static int anInt3635;
	static IncomingPacket aClass13_3636 = new IncomingPacket(101, -1);
	static int anInt3637;
	HashMap aClass54_3638 = new HashMap(64);

	final void method1637(int i) {
		try {
			synchronized (aClass54_3622) {
				aClass54_3622.method369(false);
			}
			anInt3637++;
			synchronized (((Class254) this).aClass54_3638) {
				((Class254) this).aClass54_3638.method369(false);
				if (i != 34)
					((Class254) this).aClass_fs3628 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.B(" + i + ')');
		}
	}

	final Class32 method1638(int i, int i_0_) {
		try {
			anInt3626++;
			Class32 class32;
			synchronized (aClass54_3622) {
				class32 = (Class32) aClass54_3622.method379((long) i_0_, (byte) 58);
			}
			if (class32 != null)
				return class32;
			if (i != 1409)
				aClass13_3636 = null;
			byte[] is = aClass_fs3624.method91(i_0_, 34, 113);
			class32 = new Class32();
			((Class32) class32).aClass254_443 = this;
			if (is != null)
				class32.method241(new BufferStream(is), -8616);
			synchronized (aClass54_3622) {
				aClass54_3622.method371(1, (long) i_0_, class32);
			}
			return class32;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.H(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1639(int i, long l, int i_1_, int i_2_) {
		try {
			anInt3629++;
			int i_3_ = (int) l >> 14 & 0x1f;
			int i_4_ = (0x34ee89 & (int) l) >> 20;
			if (i == 22) {
				int i_5_ = 0x7fffffff & (int) (l >>> 32);
				if ((i_3_ ^ 0xffffffff) == -11 || i_3_ == 11 || i_3_ == 22) {
					Class185 class185 = Class143.aClass251_2067.method1610(i_5_, i - 22);
					int i_6_;
					int i_7_;
					do {
						if ((i_4_ ^ 0xffffffff) == -1 || (i_4_ ^ 0xffffffff) == -3) {
							i_6_ = ((Class185) class185).anInt2570;
							i_7_ = ((Class185) class185).anInt2596;
							if (!client.f_ob)
								break;
						}
						i_7_ = ((Class185) class185).anInt2570;
						i_6_ = ((Class185) class185).anInt2596;
					} while (false);
					int i_8_ = ((Class185) class185).f_hb;
					if (i_4_ != 0)
						i_8_ = (0xf & i_8_ << i_4_) + (i_8_ >> 4 - i_4_);
					Class90.method570(0, i_2_, i_1_, i_6_, true, i_7_, i_8_, 0, 108);
				} else
					Class90.method570(i_4_, i_2_, i_1_, 0, true, 0, 0, i_3_, i + 79);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.I(" + i + ',' + l + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method1640(boolean bool) {
		try {
			anIntArray3625 = null;
			aClass13_3636 = null;
			if (bool != false)
				method1639(-87, -67L, 95, -31);
			anIntArray3623 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.G(" + bool + ')');
		}
	}

	final void method1641(int i, int i_9_, int i_10_) {
		try {
			if (i_10_ == 383137607) {
				aClass54_3622 = new HashMap(i_9_);
				anInt3633++;
				((Class254) this).aClass54_3638 = new HashMap(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.D(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method1642(Class260 class260, byte i, Class_fs class_fs) {
		try {
			anInt3627++;
			if (!Class38_Sub1_Sub1.aBool6765) {
				class260.p(0);
				Class187_Sub2.aClass_l5428 = class260.method1749(Class10.method130(class_fs, (Class185.anInt2626)), true);
				Class187_Sub2.aClass_l5428.method729((Class246_Sub41_Sub1.anInt6171 + -Class187_Sub2.aClass_l5428.j()) / 2, ((Class162.anInt2300 - Class187_Sub2.aClass_l5428.T()) / 2));
				if (i <= 97)
					anIntArray3625 = null;
				Class46.aClass_l666 = class260.method1749(Class10.method130(class_fs, (Class203.anInt2877)), true);
				Class46.aClass_l666.method729((Class246_Sub41_Sub1.anInt6171 + -Class46.aClass_l666.j()) / 2, 18);
				Class38_Sub1_Sub1.aBool6765 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1643(String string, int i, byte i_11_) {
		do {
			try {
				anInt3635++;
				int i_12_ = 117 / ((68 - i_11_) / 50);
				int i_13_ = Class246_Sub4.anInt3869;
				int[] is = Class53.anIntArray755;
				boolean bool = false;
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[is[i_14_]];
					if (class_r_sub1 != null && Class_a.aClass_r_Sub1_1180 != class_r_sub1 && ((Player) class_r_sub1).aString7140 != null && ((Player) class_r_sub1).aString7140.equalsIgnoreCase(string)) {
						if (i != 1) {
							if ((i ^ 0xffffffff) != -5) {
								if (i != 5) {
									if (i == 6) {
										Class243.writePacket(-62, (Class246_Sub15.aClass201_4442));
										Class104.anInt1394++;
										Class130_Sub1.stream.write128Byte(0, 0);
										Class130_Sub1.stream.writeShort128((byte) -127, is[i_14_]);
									} else if (i == 7) {
										Class243.writePacket(-85, (Class134.aClass201_1877));
										Class143.anInt2066++;
										Class130_Sub1.stream.method2358((byte) 23, 0);
										Class130_Sub1.stream.writeShort((byte) 67, is[i_14_]);
									}
								} else {
									Class232_Sub1.anInt5547++;
									Class243.writePacket(-76, (Class_e.aClass201_1214));
									Class130_Sub1.stream.writeShortLE128((byte) -88, is[i_14_]);
									Class130_Sub1.stream.write128Byte(0, 0);
								}
							} else {
								Class243.writePacket(-104, (Class246_Sub1_Sub4_Sub1.PLAYER_OPTION_4_PACKET));
								Class256.anInt3681++;
								Class130_Sub1.stream.write128Byte(0, 0);
								Class130_Sub1.stream.writeShortLE128((byte) -78, is[i_14_]);
							}
						} else {
							Class196.anInt2751++;
							Class243.writePacket(-54, Class130_Sub3.PLAYER_OPTION_1_PACKET);
							Class130_Sub1.stream.writeShort128((byte) -128, is[i_14_]);
							Class130_Sub1.stream.writeByte(255, 0);
						}
						bool = true;
						break;
					}
				}
				if (bool)
					break;
				Class_v.method692((byte) -99, (Class246_Sub10.aClass67_4079.method436(true, Class_j.anInt1485) + string));
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wi.A(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1644(int i, int i_15_) {
		try {
			anInt3634++;
			synchronized (aClass54_3622) {
				aClass54_3622.method380(i, -50);
				int i_16_ = 120 % ((i_15_ + 94) / 32);
			}
			synchronized (((Class254) this).aClass54_3638) {
				((Class254) this).aClass54_3638.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.E(" + i + ',' + i_15_ + ')');
		}
	}

	static final void method1645(int i, int i_17_, int i_18_, int i_19_) {
		try {
			anInt3631++;
			if (Class106.aClass147ArrayArrayArray1494 != null) {
				long l = (long) (i_19_ << 14 | i << 28 | i_18_);
				Class246_Sub13 class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.method544(l, 127));
				if (class246_sub13 == null)
					Class234.method1498(i, i_18_, i_19_);
				else {
					Class246_Sub43 class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1104(i_17_ ^ 0x5c302b41));
					if (i_17_ != 1546660647)
						method1639(-12, -72L, 30, -54);
					if (class246_sub43 == null)
						Class234.method1498(i, i_18_, i_19_);
					else {
						Class59_Sub5_Sub1 class59_sub5_sub1 = ((Class59_Sub5_Sub1) Class234.method1498(i, i_18_, i_19_));
						if (class59_sub5_sub1 != null)
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823 = ((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5810 = -1;
						else
							class59_sub5_sub1 = new Class59_Sub5_Sub1();
						((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820 = ((Class246_Sub43) class246_sub43).anInt5596;
						((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5821 = ((Class246_Sub43) class246_sub43).anInt5597;
						while_30_: do {
							Class246_Sub43 class246_sub43_20_;
							do {
								class246_sub43_20_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1108((byte) -112));
								if (class246_sub43_20_ == null)
									break while_30_;
							} while ((((Class246_Sub43) class246_sub43_20_).anInt5596) == ((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820);
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823 = (((Class246_Sub43) class246_sub43_20_).anInt5596);
							((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5817 = (((Class246_Sub43) class246_sub43_20_).anInt5597);
							for (;;) {
								Class246_Sub43 class246_sub43_21_ = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1108((byte) -112));
								if (class246_sub43_21_ == null)
									break;
								if (((((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5820) != (((Class246_Sub43) class246_sub43_21_).anInt5596)) && ((((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5823 ^ 0xffffffff) != (((Class246_Sub43) class246_sub43_21_).anInt5596 ^ 0xffffffff))) {
									((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5810 = ((Class246_Sub43) class246_sub43_21_).anInt5596;
									((Class59_Sub5_Sub1) class59_sub5_sub1).anInt5813 = ((Class246_Sub43) class246_sub43_21_).anInt5597;
								}
							}
						} while (false);
						int i_22_ = Class6.getAverageHeight((i_18_ << 7) + 64, 97, i, 64 + (i_19_ << 7));
						Class86.method554(i, i_18_, i_19_, i_22_, class59_sub5_sub1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.J(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method1646(byte i) {
		try {
			if (i <= -85) {
				synchronized (aClass54_3622) {
					aClass54_3622.method383(119);
				}
				anInt3630++;
				synchronized (((Class254) this).aClass54_3638) {
					((Class254) this).aClass54_3638.method383(107);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wi.F(" + i + ')');
		}
	}

	Class254(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_23_) {
		try {
			((Class254) this).aClass_fs3628 = class_fs_23_;
			aClass_fs3624 = class_fs;
			aClass_fs3624.method95(34, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wi.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_23_ != null ? "{...}" : "null") + ')'));
		}
	}
}
