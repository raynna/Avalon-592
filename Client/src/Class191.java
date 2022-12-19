/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class191 {
	static int anInt2678;
	static int anInt2679;
	private HashMap aClass54_2680 = new HashMap(64);
	static int anInt2681;
	static String[] aStringArray2682 = new String[8];
	static int anInt2683;
	static int anInt2684;
	static int anInt2685;
	static int anInt2686;
	static int anInt2687;
	static int anInt2688;
	static int anInt2689;
	int anInt2690;
	Class_fs aClass_fs2691;
	int anInt2692;
	static int anInt2693;
	static Class_l[] aClass_lArray2694;
	private Class_fs aClass_fs2695;
	static int anInt2696;
	static int anInt2697;
	private boolean aBool2698;
	static int anInt2699;
	HashMap aClass54_2700 = new HashMap(50);
	Class206 aClass206_2701 = new Class206(250);
	private Class137 aClass137_2702 = new Class137();
	private String[] aStringArray2703;
	private Class163 aClass163_2704;
	int anInt2705;
	private String[] aStringArray2706;

	final Class_l method1247(boolean bool, Class27 class27, Class116 class116, int i, int i_0_, Class260 class260, boolean bool_1_, int i_2_, int i_3_, int i_4_, boolean bool_5_, Class260 class260_6_) {
		try {
			anInt2681++;
			Class_l class_l = method1248(class260_6_, i, -127, class27, i_0_, i_2_, i_4_, i_3_);
			if (class_l != null)
				return class_l;
			if (bool_5_ != true)
				method1259(64);
			Class197 class197 = method1251(22883, i);
			if (i_2_ > 1 && ((Class197) class197).anIntArray2782 != null) {
				int i_7_ = -1;
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
					if (((((Class197) class197).f_gb[i_8_] ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) && ((((Class197) class197).f_gb[i_8_] ^ 0xffffffff) != -1))
						i_7_ = ((Class197) class197).anIntArray2782[i_8_];
				}
				if (i_7_ != -1)
					class197 = method1251(22883, i_7_);
			}
			int[] is = class197.method1282(class27, bool, class116, i_2_, i_4_, 0, i_0_, class260_6_, i_3_, class260);
			if (is == null)
				return null;
			Class_l class_l_9_;
			if (bool_1_)
				class_l_9_ = class260.method1706(is, 0, 36, 36, 32);
			else
				class_l_9_ = class260_6_.method1706(is, 0, 36, 36, 32);
			if (!bool_1_) {
				Class137 class137 = new Class137();
				((Class137) class137).aBool1955 = class27 != null;
				((Class137) class137).anInt1952 = i_4_;
				((Class137) class137).anInt1950 = i;
				((Class137) class137).anInt1962 = i_0_;
				((Class137) class137).anInt1949 = i_2_;
				((Class137) class137).anInt1953 = ((Class260) class260_6_).anInt3719;
				((Class137) class137).anInt1957 = i_3_;
				((Class191) this).aClass206_2701.method1354(91, class_l_9_, class137);
			}
			return class_l_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ro.J(" + bool + ',' + (class27 != null ? "{...}" : "null") + ',' + (class116 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + bool_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + bool_5_ + ',' + (class260_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class_l method1248(Class260 class260, int i, int i_10_, Class27 class27, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			((Class137) aClass137_2702).anInt1957 = i_14_;
			((Class137) aClass137_2702).anInt1953 = ((Class260) class260).anInt3719;
			((Class137) aClass137_2702).anInt1962 = i_11_;
			((Class137) aClass137_2702).anInt1952 = i_13_;
			((Class137) aClass137_2702).aBool1955 = class27 != null;
			((Class137) aClass137_2702).anInt1950 = i;
			anInt2683++;
			((Class137) aClass137_2702).anInt1949 = i_12_;
			if (i_10_ > -112)
				method1251(24, 119);
			return ((Class_l) ((Class191) this).aClass206_2701.method1347(aClass137_2702, 14278));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ro.A(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ',' + (class27 != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method1249(byte i) {
		try {
			anInt2678++;
			synchronized (((Class191) this).aClass206_2701) {
				if (i != 65) {
					/* empty */
				} else
					((Class191) this).aClass206_2701.method1352(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.N(" + i + ')');
		}
	}

	final void method1250(int i) {
		try {
			anInt2685++;
			if (i != 36)
				method1255((byte) 58);
			synchronized (aClass54_2680) {
				aClass54_2680.method383(i ^ 0x4a);
			}
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method383(112);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1353(107);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.B(" + i + ')');
		}
	}

	final Class197 method1251(int i, int i_15_) {
		try {
			anInt2684++;
			Class197 class197;
			synchronized (aClass54_2680) {
				class197 = (Class197) aClass54_2680.method379((long) i_15_, (byte) 58);
			}
			if (class197 != null)
				return class197;
			byte[] is = aClass_fs2695.method91(Class246_Sub1_Sub4.method2446(i - 22628, i_15_), Class213.method1394(i_15_, (byte) 103), 91);
			class197 = new Class197();
			((Class197) class197).f_pb = i_15_;
			((Class197) class197).f_ob = this;
			((Class197) class197).aStringArray2796 = (new String[] { null, null, Class246_Sub1_Sub9.aClass67_6178.method436(true, ((Class191) this).anInt2692), null, null });
			((Class197) class197).aStringArray2779 = (new String[] { null, null, null, null, Class259_Sub3_Sub1.aClass67_6900.method436(true, ((Class191) this).anInt2692) });
			if (i != 22883)
				anInt2689 = -127;
			if (is != null)
				class197.method1298(new BufferStream(is), i ^ ~0x5910);
			class197.method1299(i ^ ~0x5901);
			if (((Class197) class197).f_tb != -1)
				class197.method1295(i ^ 0x591e, method1251(i, ((Class197) class197).f_cb), method1251(22883, ((Class197) class197).f_tb));
			if ((((Class197) class197).anInt2817 ^ 0xffffffff) != 0)
				class197.method1287(method1251(22883, (((Class197) class197).anInt2785)), method1251(22883, (((Class197) class197).anInt2817)), true);
			if (!aBool2698 && ((Class197) class197).aBool2794) {
				((Class197) class197).aString2778 = Class59_Sub5.aClass67_5403.method436(true, ((Class191) this).anInt2692);
				((Class197) class197).anInt2813 = 0;
				((Class197) class197).aStringArray2796 = aStringArray2706;
				((Class197) class197).anIntArray2772 = null;
				((Class197) class197).aBool2774 = false;
				((Class197) class197).aStringArray2779 = aStringArray2703;
				if (((Class197) class197).aClass85_2810 != null) {
					boolean bool = false;
					for (Node class246 = ((Class197) class197).aClass85_2810.first((byte) -23); class246 != null; class246 = ((Class197) class197).aClass85_2810.next((byte) -20)) {
						Class118 class118 = aClass163_2704.method1085((byte) 100, (int) (((Node) class246).hash));
						if (((Class118) class118).aBool1633)
							class246.unlink((byte) -34);
						else
							bool = true;
					}
					if (!bool)
						((Class197) class197).aClass85_2810 = null;
				}
			}
			synchronized (aClass54_2680) {
				aClass54_2680.method371(1, (long) i_15_, class197);
			}
			return class197;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.G(" + i + ',' + i_15_ + ')');
		}
	}

	final void method1252(boolean bool, boolean bool_16_) {
		do {
			try {
				anInt2693++;
				if (bool != aBool2698) {
					aBool2698 = bool;
					method1255((byte) -73);
					if (bool_16_ == true)
						break;
					method1255((byte) 69);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ro.K(" + bool + ',' + bool_16_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1253(Player class_r_sub1, byte i) {
		do {
			try {
				anInt2688++;
				Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651.method544((long) (((Actor) class_r_sub1).f_db), 125));
				if (i <= 24)
					method1257(27, -65, 92, 95, -84, (byte) 1);
				if (class246_sub5 == null)
					break;
				if (((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 != null) {
					Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
					((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
				}
				class246_sub5.unlink((byte) 88);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ro.M(" + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1254(int i, int i_17_) {
		try {
			synchronized (aClass54_2680) {
				aClass54_2680.method380(i_17_, -50);
			}
			anInt2696++;
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method380(i_17_, -50);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1351(122, i_17_);
			}
			int i_18_ = -67 / ((i + 33) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.E(" + i + ',' + i_17_ + ')');
		}
	}

	final void method1255(byte i) {
		try {
			synchronized (aClass54_2680) {
				aClass54_2680.method369(false);
			}
			if (i != -73)
				aStringArray2703 = null;
			anInt2686++;
			synchronized (((Class191) this).aClass54_2700) {
				((Class191) this).aClass54_2700.method369(false);
			}
			synchronized (((Class191) this).aClass206_2701) {
				((Class191) this).aClass206_2701.method1352(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.C(" + i + ')');
		}
	}

	public static void method1256(int i) {
		do {
			try {
				aStringArray2682 = null;
				aClass_lArray2694 = null;
				if (i == 1)
					break;
				method1257(-97, -47, -51, 6, 58, (byte) -45);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ro.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1257(int i, int i_19_, int i_20_, int i_21_, int i_22_, byte i_23_) {
		try {
			int i_24_ = 22 % ((i_23_ - 67) / 35);
			do {
				if ((Class197.anInt2818 ^ 0xffffffff) < (i_19_ ^ 0xffffffff) || Class110.anInt1573 < i_21_ || (Class_t.anInt1442 ^ 0xffffffff) < (i_22_ ^ 0xffffffff) || ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i ^ 0xffffffff))) {
					Class15.method159(i_22_, i_20_, -81, i_21_, i_19_, i);
					if (!client.f_ob)
						break;
				}
				Class246_Sub38.method2295(i_19_, i, i_20_, (byte) 113, i_21_, i_22_);
			} while (false);
			anInt2687++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ro.L(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method1258(byte i) {
		try {
			synchronized (((Class191) this).aClass54_2700) {
				if (i >= -68)
					return;
				((Class191) this).aClass54_2700.method369(false);
			}
			anInt2697++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.F(" + i + ')');
		}
	}

	static final void method1259(int i) {
		try {
			do {
				if (Class246_Sub15.aClass260_4445.method1732()) {
					Class246_Sub15.aClass260_4445.method1704(Class147.aCanvas2155);
					Class75.method473((byte) 56);
					Class246_Sub15.aClass260_4445.method1690(Class147.aCanvas2155);
					Class246_Sub15.aClass260_4445.method1691(Class147.aCanvas2155);
					if (!client.f_ob)
						break;
				}
				Class129.method883(BufferStream.anInt5656, (byte) 117);
			} while (false);
			anInt2679++;
			if (i > -30)
				aStringArray2682 = null;
			Class205.method1341(-11712);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.I(" + i + ')');
		}
	}

	final void method1260(int i, int i_25_) {
		try {
			if (i_25_ == 8) {
				anInt2699++;
				((Class191) this).anInt2705 = i;
				synchronized (((Class191) this).aClass54_2700) {
					((Class191) this).aClass54_2700.method369(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ro.D(" + i + ',' + i_25_ + ')');
		}
	}

	Class191(Class101 class101, int i, boolean bool, Class163 class163, Class_fs class_fs, Class_fs class_fs_26_) {
		try {
			aClass163_2704 = class163;
			((Class191) this).aClass_fs2691 = class_fs_26_;
			aClass_fs2695 = class_fs;
			aBool2698 = bool;
			((Class191) this).anInt2692 = i;
			do {
				if (aClass_fs2695 != null) {
					int i_27_ = -1 + aClass_fs2695.method87((byte) 39);
					((Class191) this).anInt2690 = aClass_fs2695.method95(i_27_, 28724) + 256 * i_27_;
					if (!client.f_ob)
						break;
				}
				((Class191) this).anInt2690 = 0;
			} while (false);
			aStringArray2706 = (new String[] { null, null, Class246_Sub1_Sub9.aClass67_6178.method436(true, ((Class191) this).anInt2692), null, null });
			aStringArray2703 = (new String[] { null, null, null, null, Class259_Sub3_Sub1.aClass67_6900.method436(true, ((Class191) this).anInt2692) });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ro.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class163 != null ? "{...}" : "null") + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_26_ != null ? "{...}" : "null") + ')'));
		}
	}
}
