/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class149 {
	static int anInt2187;
	static int anInt2188;
	static int anInt2189;
	static IncomingPacket aClass13_2190 = new IncomingPacket(98, -1);
	static int[] anIntArray2191;
	static int anInt2192;
	static int anInt2193;
	static int[] anIntArray2194 = new int[32];

	static final synchronized byte[] method1003(int i, int i_0_) {
		try {
			anInt2189++;
			if ((i_0_ ^ 0xffffffff) == -101 && (Class253.f_wb ^ 0xffffffff) < -1) {
				byte[] is = Class211_Sub1.aByteArrayArray5345[--Class253.f_wb];
				Class211_Sub1.aByteArrayArray5345[Class253.f_wb] = null;
				return is;
			}
			if (i_0_ == 5000 && Class218.anInt3023 > 0) {
				byte[] is = (Class246_Sub1_Sub8.aByteArrayArray6105[--Class218.anInt3023]);
				Class246_Sub1_Sub8.aByteArrayArray6105[Class218.anInt3023] = null;
				return is;
			}
			if (i != 14592)
				return null;
			if (i_0_ == 30000 && (Class195.anInt2727 ^ 0xffffffff) < -1) {
				byte[] is = Class135.f_cb[--Class195.anInt2727];
				Class135.f_cb[Class195.anInt2727] = null;
				return is;
			}
			return new byte[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oa.D(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1004(int i) {
		try {
			Class123.aClass_l1710 = null;
			if (i >= -71)
				method1003(72, -19);
			anInt2193++;
			Class211_Sub1.anInt5343 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oa.C(" + i + ')');
		}
	}

	public static void method1005(boolean bool) {
		try {
			if (bool != false)
				anIntArray2194 = null;
			aClass13_2190 = null;
			anIntArray2191 = null;
			anIntArray2194 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oa.B(" + bool + ')');
		}
	}

	static final void method1006(boolean bool, int i) {
		do {
			try {
				anInt2187++;
				Class140.method939((byte) -44);
				if (bool == false) {
					int i_1_ = (((Class93) SubIncomingPacket.aClass209_7085.method1374(i, -10231)).anInt1223);
					if ((i_1_ ^ 0xffffffff) != -1) {
						int i_2_ = (((Class95) Class246_Sub28_Sub23.aClass95_6658).varps[i]);
						if (i_1_ == 5)
							Class59_Sub3_Sub2.anInt5889 = i_2_;
						if (i_1_ != 6)
							break;
						Class101.anInt1313 = i_2_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "oa.A(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}
}
