/* Class246_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub5 extends Node {
	int anInt3870;
	Class185 aClass185_3871;
	int anInt3872;
	boolean aBool3873;
	Class246_Sub37_Sub3 aClass246_Sub37_Sub3_3874;
	Npc aClass_r_Sub2_3875;
	int anInt3876;
	static Class85 aClass85_3877 = new Class85(16);
	int[] anIntArray3878;
	int anInt3879;
	int anInt3880;
	Player aClass_r_Sub1_3881;
	int anInt3882;
	static int anInt3883;
	int anInt3884;
	static byte[][] aByteArrayArray3885;
	int anInt3886;
	int anInt3887;
	int anInt3888 = 0;
	int anInt3889;
	int anInt3890;
	static String aString3891 = null;
	static Class73 aClass73_3892;
	Class246_Sub37_Sub3 aClass246_Sub37_Sub3_3893;

	final void method1811(int i) {
		do {
			try {
				anInt3883++;
				int i_0_ = ((Class246_Sub5) this).anInt3882;
				if (((Class246_Sub5) this).aClass185_3871 == null) {
					if (((Class246_Sub5) this).aClass_r_Sub2_3875 == null) {
						if (((Class246_Sub5) this).aClass_r_Sub1_3881 != null) {
							((Class246_Sub5) this).anInt3882 = (Class246_Sub4.method1807((byte) -106, (((Class246_Sub5) this).aClass_r_Sub1_3881)));
							((Class246_Sub5) this).anInt3887 = ((Player) (((Class246_Sub5) this).aClass_r_Sub1_3881)).f_wd;
							((Class246_Sub5) this).anInt3870 = (((Player) (((Class246_Sub5) this).aClass_r_Sub1_3881)).f_dd << 7);
						}
					} else {
						int i_1_ = Class246_Sub34.method2196((byte) -26, (((Class246_Sub5) this).aClass_r_Sub2_3875));
						if (i_0_ != i_1_) {
							((Class246_Sub5) this).anInt3882 = i_1_;
							Class253 class253 = (((Npc) ((Class246_Sub5) this).aClass_r_Sub2_3875).aClass253_7184);
							if (((Class253) class253).anIntArray3594 != null)
								class253 = class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658));
							if (class253 == null)
								((Class246_Sub5) this).anInt3887 = ((Class246_Sub5) this).anInt3870 = 0;
							else {
								((Class246_Sub5) this).anInt3887 = ((Class253) class253).f_jb;
								((Class246_Sub5) this).anInt3870 = ((Class253) class253).f_sb << 7;
							}
						}
					}
				} else {
					Class185 class185 = (((Class246_Sub5) this).aClass185_3871.method1205(Class246_Sub28_Sub23.aClass95_6658, (byte) -108));
					if (class185 == null) {
						((Class246_Sub5) this).anInt3882 = -1;
						((Class246_Sub5) this).anInt3887 = 0;
						((Class246_Sub5) this).anInt3889 = 0;
						((Class246_Sub5) this).anIntArray3878 = null;
						((Class246_Sub5) this).anInt3870 = 0;
						((Class246_Sub5) this).anInt3890 = 0;
					} else {
						((Class246_Sub5) this).anInt3887 = ((Class185) class185).anInt2578;
						((Class246_Sub5) this).anIntArray3878 = ((Class185) class185).anIntArray2605;
						((Class246_Sub5) this).anInt3890 = ((Class185) class185).anInt2623;
						((Class246_Sub5) this).anInt3882 = ((Class185) class185).anInt2603;
						((Class246_Sub5) this).anInt3870 = ((Class185) class185).anInt2631 << 7;
						((Class246_Sub5) this).anInt3889 = ((Class185) class185).anInt2622;
					}
				}
				if (i != -2212)
					method1811(113);
				if (i_0_ == ((Class246_Sub5) this).anInt3882 || (((Class246_Sub5) this).aClass246_Sub37_Sub3_3893 == null))
					break;
				Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) this).aClass246_Sub37_Sub3_3893);
				((Class246_Sub5) this).aClass246_Sub37_Sub3_3893 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bn.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1812(boolean bool) {
		try {
			if (bool != false)
				aByteArrayArray3885 = null;
			aClass85_3877 = null;
			aByteArrayArray3885 = null;
			aClass73_3892 = null;
			aString3891 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bn.A(" + bool + ')');
		}
	}

	public Class246_Sub5() {
		/* empty */
	}
}
