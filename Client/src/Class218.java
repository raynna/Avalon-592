/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218 {
	static int anInt3023;
	static int anInt3024;
	static int[] anIntArray3025;
	static String aString3026 = null;
	static Class_fs index20;
	static int anInt3028;
	static int anInt3029;
	static Class103[] aClass103Array3030 = new Class103[4];
	static int anInt3031;
	Interface1 anInterface1_3032;
	static int anInt3033;
	static int anInt3034;
	static int anInt3035;

	static final void method1413(boolean bool, int i) {
		do {
			try {
				anInt3035++;
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195.method1104(i ^ ~0x7ad4)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class150.aClass166_2195.method1108((byte) -112))) {
					if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
						Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
						((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
					}
					if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874) != null) {
						Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874);
						((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3874 = null;
					}
					class246_sub5.unlink((byte) -51);
				}
				if (i != -31393)
					anInt3029 = 65;
				if (!bool)
					break;
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class76.aClass166_992.method1104(i ^ ~0x7a88)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class76.aClass166_992.method1108((byte) -112))) {
					if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
						Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
						((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
					}
					class246_sub5.unlink((byte) 69);
				}
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651.first((byte) -23)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651.next((byte) -20))) {
					if ((((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893) != null) {
						Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893);
						((Class246_Sub5) class246_sub5).aClass246_Sub37_Sub3_3893 = null;
					}
					class246_sub5.unlink((byte) 110);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "to.B(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final Class109_Sub1_Sub1 method1414(Class260_Sub2 class260_sub2, int i, int[] is, boolean bool, int i_0_, int i_1_) {
		try {
			if (i_1_ != -1)
				method1417(-53, (byte) -94, 86, null, null);
			anInt3028++;
			if (!((Class260_Sub2) class260_sub2).aBool4385 && (!Class246_Sub40.method2313(200, i_0_) || !Class246_Sub40.method2313(i_1_ + 201, i))) {
				if (((Class260_Sub2) class260_sub2).f_pg)
					return new Class109_Sub1_Sub1(class260_sub2, 34037, i_0_, i, bool, is);
				return new Class109_Sub1_Sub1(class260_sub2, i_0_, i, Class206.method1350(i_0_, 269173057), Class206.method1350(i, 269173057), is);
			}
			return new Class109_Sub1_Sub1(class260_sub2, 3553, i_0_, i, bool, is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("to.C(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method1415(int i, byte i_2_, int i_3_, int i_4_) {
		try {
			anInt3024++;
			if ((Class39.anInt571 ^ 0xffffffff) > -101)
				return -2;
			int i_5_ = -2;
			int i_6_ = 90 % ((73 - i_2_) / 46);
			int i_7_ = 2147483647;
			int i_8_ = -Class79.anInt1057 + i;
			int i_9_ = -Class79.anInt1041 + i_3_;
			for (Class246_Sub2 class246_sub2 = (Class246_Sub2) Class79.aClass166_1034.method1104(122); class246_sub2 != null; class246_sub2 = ((Class246_Sub2) Class79.aClass166_1034.method1108((byte) -112))) {
				if (i_4_ == ((Class246_Sub2) class246_sub2).anInt3808) {
					int i_10_ = ((Class246_Sub2) class246_sub2).anInt3807;
					int i_11_ = ((Class246_Sub2) class246_sub2).anInt3801;
					int i_12_ = (Class79.anInt1057 + i_10_ << 14 | Class79.anInt1041 + i_11_);
					int i_13_ = ((i_9_ - i_11_) * (i_9_ + -i_11_) + (-i_10_ + i_8_) * (-i_10_ + i_8_));
					if ((i_5_ ^ 0xffffffff) > -1 || (i_7_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
						i_5_ = i_12_;
						i_7_ = i_13_;
					}
				}
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("to.F(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final byte[] method1416(int i, int i_14_, int i_15_, byte[] is) {
		try {
			anInt3031++;
			byte[] is_16_ = new byte[i_15_];
			Class117.method805(is, i_14_, is_16_, i, i_15_);
			return is_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("to.E(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1417(int i, byte i_17_, int i_18_, int[] is, long[] ls) {
		do {
			try {
				if (i < i_18_) {
					int i_19_ = (i - -i_18_) / 2;
					int i_20_ = i;
					long l = ls[i_19_];
					ls[i_19_] = ls[i_18_];
					ls[i_18_] = l;
					int i_21_ = is[i_19_];
					is[i_19_] = is[i_18_];
					is[i_18_] = i_21_;
					int i_22_ = l != 9223372036854775807L ? 1 : 0;
					for (int i_23_ = i; i_23_ < i_18_; i_23_++) {
						if ((l + (long) (i_22_ & i_23_) ^ 0xffffffffffffffffL) < (ls[i_23_] ^ 0xffffffffffffffffL)) {
							long l_24_ = ls[i_23_];
							ls[i_23_] = ls[i_20_];
							ls[i_20_] = l_24_;
							int i_25_ = is[i_23_];
							is[i_23_] = is[i_20_];
							is[i_20_++] = i_25_;
						}
					}
					ls[i_18_] = ls[i_20_];
					ls[i_20_] = l;
					is[i_18_] = is[i_20_];
					is[i_20_] = i_21_;
					method1417(i, (byte) 38, -1 + i_20_, is, ls);
					method1417(1 + i_20_, (byte) 38, i_18_, is, ls);
				}
				anInt3034++;
				if (i_17_ == 38)
					break;
				method1418(-42);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("to.A(" + i + ',' + i_17_ + ',' + i_18_ + ',' + (is != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1418(int i) {
		try {
			aClass103Array3030 = null;
			index20 = null;
			if (i != 1)
				aString3026 = null;
			aString3026 = null;
			anIntArray3025 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "to.D(" + i + ')');
		}
	}

	static {
		anIntArray3025 = new int[2048];
		anInt3023 = 0;
	}
}
