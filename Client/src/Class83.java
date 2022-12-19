/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83 {
	static int anInt1077;
	private long aLong1078;
	private Class246_Sub1 aClass246_Sub1_1079;
	static int anInt1080;
	static Class67 aClass67_1081 = new Class67("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
	static int anInt1082;
	private Class246_Sub1[] aClass246_Sub1Array1083;
	static Class67 aClass67_1084 = new Class67("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:");
	private int anInt1085;
	static int anInt1086;
	static int anInt1087;
	static int anInt1088;
	static int anInt1089 = -1;
	static int anInt1090 = 503;

	static final void method527(BufferStream stream, int i, int i_0_) {
		try {
			anInt1088++;
			if (Class_c_Sub1.aClass125_5392 != null) {
				try {
					Class_c_Sub1.aClass125_5392.method856(0, 0L);
					Class_c_Sub1.aClass125_5392.method854(i_0_, (byte) 126, (((BufferStream) stream).buffer), 24);
				} catch (Exception exception) {
					/* empty */
				}
			}
			int i_1_ = -117 / ((47 - i) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hu.E(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final Class246_Sub1 method528(boolean bool) {
		try {
			anInt1080++;
			if (aClass246_Sub1_1079 == null)
				return null;
			for (Class246_Sub1 class246_sub1 = aClass246_Sub1Array1083[(int) ((long) (anInt1085 - 1) & aLong1078)]; aClass246_Sub1_1079 != class246_sub1; aClass246_Sub1_1079 = (((Class246_Sub1) aClass246_Sub1_1079).aClass246_Sub1_3742)) {
				if (((Class246_Sub1) aClass246_Sub1_1079).aLong3739 == aLong1078) {
					Class246_Sub1 class246_sub1_2_ = aClass246_Sub1_1079;
					aClass246_Sub1_1079 = (((Class246_Sub1) aClass246_Sub1_1079).aClass246_Sub1_3742);
					return class246_sub1_2_;
				}
			}
			aClass246_Sub1_1079 = null;
			if (bool != true)
				method531(123, 87);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hu.B(" + bool + ')');
		}
	}

	final Class246_Sub1 method529(long l, int i) {
		try {
			aLong1078 = l;
			anInt1086++;
			Class246_Sub1 class246_sub1 = aClass246_Sub1Array1083[(int) (l & (long) (anInt1085 - 1))];
			for (aClass246_Sub1_1079 = ((Class246_Sub1) class246_sub1).aClass246_Sub1_3742; aClass246_Sub1_1079 != class246_sub1; aClass246_Sub1_1079 = (((Class246_Sub1) aClass246_Sub1_1079).aClass246_Sub1_3742)) {
				if ((((Class246_Sub1) aClass246_Sub1_1079).aLong3739 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
					Class246_Sub1 class246_sub1_3_ = aClass246_Sub1_1079;
					aClass246_Sub1_1079 = (((Class246_Sub1) aClass246_Sub1_1079).aClass246_Sub1_3742);
					return class246_sub1_3_;
				}
			}
			aClass246_Sub1_1079 = null;
			if (i != -13373)
				anInt1089 = -18;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hu.C(" + l + ',' + i + ')');
		}
	}

	public static void method530(int i) {
		try {
			aClass67_1081 = null;
			if (i == -1)
				aClass67_1084 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hu.A(" + i + ')');
		}
	}

	static final void method531(int i, int i_4_) {
		try {
			anInt1077++;
			if (i < 0 || i > 2)
				i = 0;
			if (i_4_ == 9060)
				Class246_Sub28_Sub19.anInt6541 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hu.F(" + i + ',' + i_4_ + ')');
		}
	}

	final void method532(byte i, Class246_Sub1 class246_sub1, long l) {
		do {
			try {
				anInt1087++;
				if (((Class246_Sub1) class246_sub1).aClass246_Sub1_3743 != null)
					class246_sub1.method1756((byte) 115);
				Class246_Sub1 class246_sub1_5_ = (aClass246_Sub1Array1083[(int) (l & (long) (-1 + anInt1085))]);
				((Class246_Sub1) class246_sub1).aClass246_Sub1_3742 = class246_sub1_5_;
				((Class246_Sub1) class246_sub1).aClass246_Sub1_3743 = ((Class246_Sub1) class246_sub1_5_).aClass246_Sub1_3743;
				((Class246_Sub1) (((Class246_Sub1) class246_sub1).aClass246_Sub1_3743)).aClass246_Sub1_3742 = class246_sub1;
				((Class246_Sub1) class246_sub1).aLong3739 = l;
				((Class246_Sub1) (((Class246_Sub1) class246_sub1).aClass246_Sub1_3742)).aClass246_Sub1_3743 = class246_sub1;
				if (i == 75)
					break;
				method527(null, -109, -85);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("hu.D(" + i + ',' + (class246_sub1 != null ? "{...}" : "null") + ',' + l + ')'));
			}
			break;
		} while (false);
	}

	Class83(int i) {
		try {
			aClass246_Sub1Array1083 = new Class246_Sub1[i];
			anInt1085 = i;
			for (int i_6_ = 0; i_6_ < i; i_6_++) {
				Class246_Sub1 class246_sub1 = aClass246_Sub1Array1083[i_6_] = new Class246_Sub1();
				((Class246_Sub1) class246_sub1).aClass246_Sub1_3742 = class246_sub1;
				((Class246_Sub1) class246_sub1).aClass246_Sub1_3743 = class246_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hu.<init>(" + i + ')');
		}
	}
}
