/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class155 {
	static OutgoingPacket ACTION_BUTTON6 = new OutgoingPacket(8, 8);
	private Class_fs aClass_fs2217;
	static int anInt2218;
	static int anInt2219;
	static int anInt2220;
	static long aLong2221;
	static int anInt2222;
	static int anInt2223;
	private Class_fs aClass_fs2224;
	private Class85 aClass85_2225 = new Class85(256);
	static int anInt2226;
	static int anInt2227;
	static Class205 aClass205_2228 = new Class205("LOCAL", 4);
	static int anInt2229;
	private Class85 aClass85_2230 = new Class85(256);

	private final Class246_Sub3_Sub1 method1024(int i, int i_0_, int i_1_, int[] is) {
		try {
			anInt2223++;
			int i_2_ = (i << 4 & 0xfff4 | i >>> 12) ^ i_1_;
			i_2_ |= i << 16;
			long l = (long) i_2_;
			Class246_Sub3_Sub1 class246_sub3_sub1 = (Class246_Sub3_Sub1) aClass85_2230.method544(l, 123);
			if (class246_sub3_sub1 != null)
				return class246_sub3_sub1;
			if (is != null && is[0] <= 0)
				return null;
			if (i_0_ < 85)
				return null;
			Class229 class229 = Class229.method1467(aClass_fs2224, i, i_1_);
			if (class229 == null)
				return null;
			class246_sub3_sub1 = class229.method1468();
			aClass85_2230.method547(l, -2301, class246_sub3_sub1);
			if (is != null)
				is[0] -= (((Class246_Sub3_Sub1) class246_sub3_sub1).aByteArray6391).length;
			return class246_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1025(byte i) {
		try {
			int i_3_ = 85 % ((60 - i) / 51);
			ACTION_BUTTON6 = null;
			aClass205_2228 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oj.F(" + i + ')');
		}
	}

	private final Class246_Sub3_Sub1 method1026(int i, int[] is, byte i_4_, int i_5_) {
		try {
			anInt2218++;
			int i_6_ = i_5_ ^ (0xfff2 & i << 4 | i >>> 12);
			if (i_4_ < 19)
				return null;
			i_6_ |= i << 16;
			long l = 0x100000000L ^ (long) i_6_;
			Class246_Sub3_Sub1 class246_sub3_sub1 = (Class246_Sub3_Sub1) aClass85_2230.method544(l, 124);
			if (class246_sub3_sub1 != null)
				return class246_sub3_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class246_Sub9 class246_sub9 = (Class246_Sub9) aClass85_2225.method544(l, 125);
			if (class246_sub9 == null) {
				class246_sub9 = Class246_Sub9.method1850(aClass_fs2217, i, i_5_);
				if (class246_sub9 == null)
					return null;
				aClass85_2225.method547(l, -2301, class246_sub9);
			}
			class246_sub3_sub1 = class246_sub9.method1854(is);
			if (class246_sub3_sub1 == null)
				return null;
			class246_sub9.unlink((byte) 118);
			aClass85_2230.method547(l, -2301, class246_sub3_sub1);
			return class246_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.D(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final Class246_Sub3_Sub1 method1027(int[] is, int i, int i_7_) {
		try {
			if (i_7_ != 2509)
				aClass_fs2224 = null;
			anInt2222++;
			if ((aClass_fs2217.method87((byte) 39) ^ 0xffffffff) == -2)
				return method1026(0, is, (byte) 20, i);
			if ((aClass_fs2217.method95(i, 28724) ^ 0xffffffff) == -2)
				return method1026(i, is, (byte) 114, 0);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ')'));
		}
	}

	static final void method1028(int i, int i_8_, int i_9_) {
		do {
			try {
				if (i_9_ != Class246_Sub37_Sub1.f_gb) {
					Class187.anIntArray2654 = new int[i_9_];
					for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
						Class187.anIntArray2654[i_10_] = (i_10_ << 12) / i_9_;
					Class63_Sub1.anInt4719 = i_9_ - 1;
					Class246_Sub37_Sub1.f_gb = i_9_;
					Class138.anInt1977 = 32 * i_9_;
				}
				anInt2220++;
				if (i_8_ != 9188)
					method1028(-112, -115, -10);
				if (Class141.anInt2044 == i)
					break;
				if (Class246_Sub37_Sub1.f_gb != i) {
					Class246_Sub1_Sub11.anIntArray6245 = new int[i];
					for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff); i_11_++)
						Class246_Sub1_Sub11.anIntArray6245[i_11_] = (i_11_ << 12) / i;
				} else
					Class246_Sub1_Sub11.anIntArray6245 = Class187.anIntArray2654;
				Class141.anInt2044 = i;
				Class113.anInt1594 = i - 1;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oj.A(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1029(int i, int i_12_, Class235 class235, byte i_13_) {
		try {
			anInt2229++;
			if (class235 != null) {
				if (((Class235) class235).f_eb != null) {
					Class246_Sub29 class246_sub29 = new Class246_Sub29();
					((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
					((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_eb;
					Class146.method988(class246_sub29);
				}
				Class231.anInt3168 = ((Class235) class235).anInt3248;
				Class109_Sub1.anInt3754 = i;
				Class187.aBool2653 = true;
				Class83.anInt1089 = ((Class235) class235).anInt3199;
				Class87.anInt1145 = ((Class235) class235).anInt3210;
				Node.anInt3469 = i_12_;
				Class_b.anInt1161 = ((Class235) class235).f_pd;
				if (i_13_ == -38) {
					Class147.anInt2148 = ((Class235) class235).anInt3234;
					Stream_Sub1.method2483(class235, (byte) -109);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.C(" + i + ',' + i_12_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_13_ + ')'));
		}
	}

	final Class246_Sub3_Sub1 method1030(int[] is, int i, int i_14_) {
		try {
			if (i != -1903291760)
				method1024(-81, -67, -64, null);
			anInt2219++;
			if (aClass_fs2224.method87((byte) 39) == 1)
				return method1024(0, 123, i_14_, is);
			if (aClass_fs2224.method95(i_14_, 28724) == 1)
				return method1024(i_14_, i + 1903291868, 0, is);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.E(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ')'));
		}
	}

	Class155(Class_fs class_fs, Class_fs class_fs_15_) {
		try {
			aClass_fs2217 = class_fs_15_;
			aClass_fs2224 = class_fs;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oj.<init>(" + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_15_ != null ? "{...}" : "null") + ')'));
		}
	}
}
