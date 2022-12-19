/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66 {
	static int anInt872;
	private int[][] anIntArrayArray873;
	static int anInt874;
	static int anInt875;
	private int anInt876;
	static int anInt877;
	static Class67 aClass67_878 = new Class67("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
	private Class166 aClass166_879;
	private Class246_Sub8[] aClass246_Sub8Array880;
	static int anInt881;
	static Class_l[] aClass_lArray882;
	private int anInt883 = 0;
	static int anInt884;
	private int anInt885 = -1;
	private int anInt886;
	boolean aBool887;

	final void method429(int i) {
		try {
			anInt884++;
			if (i == 258510055) {
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (anInt876 ^ 0xffffffff); i_0_++)
					anIntArrayArray873[i_0_] = null;
				anIntArrayArray873 = null;
				aClass246_Sub8Array880 = null;
				aClass166_879.method1102(-105);
				aClass166_879 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gi.G(" + i + ')');
		}
	}

	static final boolean method430(byte i, int i_1_, int i_2_) {
		try {
			anInt874++;
			if (i >= -87)
				method432(-8);
			Class185 class185 = Class143.aClass251_2067.method1610(i_1_, 0);
			if (i_2_ == 11)
				i_2_ = 10;
			if ((i_2_ ^ 0xffffffff) <= -6 && i_2_ <= 8)
				i_2_ = 4;
			return class185.method1211((byte) -105, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gi.F(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method431(boolean bool) {
		try {
			if (bool != false)
				method431(true);
			aClass67_878 = null;
			aClass_lArray882 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gi.C(" + bool + ')');
		}
	}

	static final void method432(int i) {
		do {
			try {
				anInt875++;
				if (i <= 113)
					aClass67_878 = null;
				if (Class246_Sub28_Sub15.anInt6370 == -1)
					break;
				Class126.method864(-1, -1, -112, Class246_Sub28_Sub15.anInt6370, false);
				Class246_Sub28_Sub15.anInt6370 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "gi.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[][] method433(int i) {
		try {
			anInt872++;
			if (i != 10)
				return null;
			if (anInt876 != anInt886)
				throw new RuntimeException("Can only retrieve a full image cache");
			for (int i_3_ = 0; (anInt876 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
				aClass246_Sub8Array880[i_3_] = Class40.aClass246_Sub8_610;
			return anIntArrayArray873;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gi.B(" + i + ')');
		}
	}

	static final void method434(int i, int i_4_, Npc class_r_sub2, Player class_r_sub1, int i_5_, int i_6_, int i_7_, Class185 class185) {
		try {
			anInt877++;
			Class246_Sub5 class246_sub5 = new Class246_Sub5();
			if (i_4_ != -1)
				method434(-111, 71, null, null, -94, 47, 5, null);
			((Class246_Sub5) class246_sub5).anInt3879 = i << 7;
			((Class246_Sub5) class246_sub5).anInt3886 = i_7_;
			((Class246_Sub5) class246_sub5).anInt3876 = i_5_ << 7;
			if (class185 == null) {
				if (class_r_sub2 != null) {
					((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875 = class_r_sub2;
					Class253 class253 = ((Npc) class_r_sub2).aClass253_7184;
					if (((Class253) class253).anIntArray3594 != null) {
						((Class246_Sub5) class246_sub5).aBool3873 = true;
						class253 = class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658));
					}
					if (class253 != null) {
						((Class246_Sub5) class246_sub5).anInt3880 = i - -((Class253) class253).anInt3574 << 7;
						((Class246_Sub5) class246_sub5).anInt3872 = i_5_ - -((Class253) class253).anInt3574 << 7;
						((Class246_Sub5) class246_sub5).anInt3882 = Class246_Sub34.method2196((byte) -26, class_r_sub2);
						((Class246_Sub5) class246_sub5).anInt3870 = ((Class253) class253).f_sb << 7;
						((Class246_Sub5) class246_sub5).anInt3887 = ((Class253) class253).f_jb;
					}
					Class76.aClass166_992.method1101(false, class246_sub5);
				} else if (class_r_sub1 != null) {
					((Class246_Sub5) class246_sub5).aClass_r_Sub1_3881 = class_r_sub1;
					((Class246_Sub5) class246_sub5).anInt3880 = class_r_sub1.method2670((byte) 127) + i << 7;
					((Class246_Sub5) class246_sub5).anInt3872 = class_r_sub1.method2670((byte) 127) + i_5_ << 7;
					((Class246_Sub5) class246_sub5).anInt3882 = Class246_Sub4.method1807((byte) -80, class_r_sub1);
					((Class246_Sub5) class246_sub5).anInt3887 = ((Player) class_r_sub1).f_wd;
					((Class246_Sub5) class246_sub5).anInt3870 = ((Player) class_r_sub1).f_dd << 7;
					Class187.aClass85_2651.method547((long) (((Actor) class_r_sub1).f_db), -2301, class246_sub5);
				}
			} else {
				((Class246_Sub5) class246_sub5).aClass185_3871 = class185;
				int i_8_ = ((Class185) class185).anInt2596;
				int i_9_ = ((Class185) class185).anInt2570;
				if (i_6_ == 1 || i_6_ == 3) {
					i_8_ = ((Class185) class185).anInt2570;
					i_9_ = ((Class185) class185).anInt2596;
				}
				((Class246_Sub5) class246_sub5).anInt3887 = ((Class185) class185).anInt2578;
				((Class246_Sub5) class246_sub5).anInt3889 = ((Class185) class185).anInt2622;
				((Class246_Sub5) class246_sub5).anInt3872 = i_5_ + i_9_ << 7;
				((Class246_Sub5) class246_sub5).anIntArray3878 = ((Class185) class185).anIntArray2605;
				((Class246_Sub5) class246_sub5).anInt3880 = i_8_ + i << 7;
				((Class246_Sub5) class246_sub5).anInt3882 = ((Class185) class185).anInt2603;
				((Class246_Sub5) class246_sub5).anInt3870 = ((Class185) class185).anInt2631 << 7;
				((Class246_Sub5) class246_sub5).anInt3890 = ((Class185) class185).anInt2623;
				if (((Class185) class185).f_bb != null) {
					((Class246_Sub5) class246_sub5).aBool3873 = true;
					class246_sub5.method1811(i_4_ ^ 0x8a3);
				}
				if (((Class246_Sub5) class246_sub5).anIntArray3878 != null)
					((Class246_Sub5) class246_sub5).anInt3884 = (((Class246_Sub5) class246_sub5).anInt3890 - -(int) ((double) ((((Class246_Sub5) class246_sub5).anInt3889) - ((Class246_Sub5) class246_sub5).anInt3890) * Math.random()));
				Class150.aClass166_2195.method1101(false, class246_sub5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gi.E(" + i + ',' + i_4_ + ',' + (class_r_sub2 != null ? "{...}" : "null") + ',' + (class_r_sub1 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (class185 != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method435(byte i, int i_10_) {
		try {
			if (i != -112)
				aClass_lArray882 = null;
			anInt881++;
			if (anInt886 != anInt876) {
				if (anInt876 != 1) {
					Class246_Sub8 class246_sub8 = aClass246_Sub8Array880[i_10_];
					if (class246_sub8 == null) {
						((Class66) this).aBool887 = true;
						if ((anInt876 ^ 0xffffffff) < (anInt883 ^ 0xffffffff)) {
							class246_sub8 = new Class246_Sub8(i_10_, anInt883);
							anInt883++;
						} else {
							Class246_Sub8 class246_sub8_11_ = ((Class246_Sub8) aClass166_879.method1103(-102));
							class246_sub8 = new Class246_Sub8(i_10_, (((Class246_Sub8) class246_sub8_11_).anInt3983));
							aClass246_Sub8Array880[((Class246_Sub8) class246_sub8_11_).anInt3981] = null;
							class246_sub8_11_.unlink((byte) -29);
						}
						aClass246_Sub8Array880[i_10_] = class246_sub8;
					} else
						((Class66) this).aBool887 = false;
					aClass166_879.method1097(1245184, class246_sub8);
					return (anIntArrayArray873[((Class246_Sub8) class246_sub8).anInt3983]);
				}
				((Class66) this).aBool887 = (anInt885 ^ 0xffffffff) != (i_10_ ^ 0xffffffff);
				anInt885 = i_10_;
				return anIntArrayArray873[0];
			}
			((Class66) this).aBool887 = aClass246_Sub8Array880[i_10_] == null;
			aClass246_Sub8Array880[i_10_] = Class40.aClass246_Sub8_610;
			return anIntArrayArray873[i_10_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gi.A(" + i + ',' + i_10_ + ')');
		}
	}

	Class66(int i, int i_12_, int i_13_) {
		aClass166_879 = new Class166();
		((Class66) this).aBool887 = false;
		try {
			anInt886 = i_12_;
			anInt876 = i;
			aClass246_Sub8Array880 = new Class246_Sub8[anInt886];
			anIntArrayArray873 = new int[anInt876][i_13_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gi.<init>(" + i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}
}
