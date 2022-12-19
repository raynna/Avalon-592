/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
	static int anInt1983;
	static Class169 aClass169_1984 = new Class169("", 10);
	static int anInt1985;
	static Class198 aClass198_1986;
	static int anInt1987;
	static String[] aStringArray1988 = { "en", "de", "fr", "pt", "nl" };

	public static void method937(byte i) {
		try {
			aStringArray1988 = null;
			aClass169_1984 = null;
			if (i < -53)
				aClass198_1986 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nc.A(" + i + ')');
		}
	}

	static final void method938(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			anInt1983++;
			for (Class246_Sub5 class246_sub5 = (Class246_Sub5) Class150.aClass166_2195.method1104(76); class246_sub5 != null; class246_sub5 = (Class246_Sub5) Class150.aClass166_2195.method1108((byte) -112))
				Class246_Sub12.method1982(true, i_2_, i, i_1_, class246_sub5, i_0_);
			Class246_Sub5 class246_sub5 = (Class246_Sub5) Class76.aClass166_992.method1104(61);
			if (i_3_ != -107)
				anInt1987 = 91;
			for (/**/; class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class76.aClass166_992.method1108((byte) -112))) {
				int i_4_ = 1;
				Class135 class135 = ((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875.method2676(-1);
				if (!((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).aBool6450) {
					if (((((Class135) class135).anInt1894 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470 ^ 0xffffffff)) || ((((Class135) class135).anInt1880 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470 ^ 0xffffffff)) || (((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470 == ((Class135) class135).anInt1890) || (((Class135) class135).anInt1914 == ((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470))
						i_4_ = 2;
					else if ((((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470 == ((Class135) class135).anInt1892) || (((Class135) class135).anInt1908 == ((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470) || (((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470 == ((Class135) class135).anInt1917) || (((Class135) class135).anInt1900 == ((Actor) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt6470))
						i_4_ = 3;
				} else
					i_4_ = 0;
				if (((Class246_Sub5) class246_sub5).anInt3888 != i_4_) {
					int i_5_ = Class246_Sub34.method2196((byte) -26, (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875));
					if ((((Class246_Sub5) class246_sub5).anInt3882 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
						if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
							((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
						}
						((Class246_Sub5) class246_sub5).anInt3882 = i_5_;
					}
					((Class246_Sub5) class246_sub5).anInt3888 = i_4_;
				}
				((Class246_Sub5) class246_sub5).anInt3879 = ((Class59_Sub3) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt5060;
				((Class246_Sub5) class246_sub5).anInt3880 = (((Class59_Sub3) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt5060 - -(((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875.method2670((byte) 127) << 6));
				((Class246_Sub5) class246_sub5).anInt3876 = ((Class59_Sub3) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt5059;
				((Class246_Sub5) class246_sub5).anInt3872 = (((Class59_Sub3) (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875)).anInt5059 + (((Class246_Sub5) class246_sub5).aClass_r_Sub2_3875.method2670((byte) 127) << 6));
				Class246_Sub12.method1982(true, i_2_, i, i_1_, class246_sub5, i_0_);
			}
			for (Class246_Sub5 class246_sub5_6_ = ((Class246_Sub5) Class187.aClass85_2651.first((byte) -23)); class246_sub5_6_ != null; class246_sub5_6_ = ((Class246_Sub5) Class187.aClass85_2651.next((byte) -20))) {
				int i_7_ = 1;
				Class135 class135 = ((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881.method2676(-1);
				if (!((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).aBool6450) {
					if (((((Class135) class135).anInt1894 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff)) || ((((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff) == (((Class135) class135).anInt1880 ^ 0xffffffff)) || (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 == ((Class135) class135).anInt1890) || (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 == ((Class135) class135).anInt1914))
						i_7_ = 2;
					else if (((((Class135) class135).anInt1892 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff)) || ((((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff) == (((Class135) class135).anInt1908 ^ 0xffffffff)) || ((((Class135) class135).anInt1917 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff)) || ((((Class135) class135).anInt1900 ^ 0xffffffff) == (((Actor) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt6470 ^ 0xffffffff)))
						i_7_ = 3;
				} else
					i_7_ = 0;
				if ((i_7_ ^ 0xffffffff) != (((Class246_Sub5) class246_sub5_6_).anInt3888 ^ 0xffffffff)) {
					int i_8_ = Class246_Sub4.method1807((byte) -70, (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881));
					if (i_8_ != ((Class246_Sub5) class246_sub5_6_).anInt3882) {
						if ((((Class246_Sub5) class246_sub5_6_).aClass246_Sub37_Sub3_3893) != null) {
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5_6_).aClass246_Sub37_Sub3_3893);
							((Class246_Sub5) class246_sub5_6_).aClass246_Sub37_Sub3_3893 = null;
						}
						((Class246_Sub5) class246_sub5_6_).anInt3882 = i_8_;
					}
					((Class246_Sub5) class246_sub5_6_).anInt3888 = i_7_;
				}
				((Class246_Sub5) class246_sub5_6_).anInt3879 = ((Class59_Sub3) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt5060;
				((Class246_Sub5) class246_sub5_6_).anInt3880 = (((Class59_Sub3) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt5060 + (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881.method2670((byte) 127) << 6));
				((Class246_Sub5) class246_sub5_6_).anInt3876 = ((Class59_Sub3) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt5059;
				((Class246_Sub5) class246_sub5_6_).anInt3872 = (((Class59_Sub3) (((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881)).anInt5059 - -(((Class246_Sub5) class246_sub5_6_).aClass_r_Sub1_3881.method2670((byte) 127) << 6));
				Class246_Sub12.method1982(true, i_2_, i, i_1_, class246_sub5_6_, i_0_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nc.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
