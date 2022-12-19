/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90 {
	static byte[] aByteArray1167;
	static Class235[] aClass235Array1168;
	static int anInt1169;
	static Class83 aClass83_1170;
	static int anInt1171;
	static short[] aShortArray1172 = new short[256];

	public static void method569(int i) {
		try {
			aShortArray1172 = null;
			aClass235Array1168 = null;
			if (i == -16641) {
				aByteArray1167 = null;
				aClass83_1170 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ik.B(" + i + ')');
		}
	}

	static final boolean method570(int i, int i_0_, int i_1_, int i_2_, boolean bool, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			anInt1169++;
			int i_7_ = ((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0];
			int i_8_ = ((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0];
			if ((i_7_ ^ 0xffffffff) > -1 || Class38_Sub1_Sub1.anInt6770 <= i_7_ || i_8_ < 0 || (i_8_ ^ 0xffffffff) <= (Class152.anInt2205 ^ 0xffffffff))
				return false;
			if ((i_1_ ^ 0xffffffff) > -1 || (i_1_ ^ 0xffffffff) <= (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) || i_0_ < 0 || (i_0_ ^ 0xffffffff) <= (Class152.anInt2205 ^ 0xffffffff))
				return false;
			if (i_6_ <= 98)
				return false;
			int i_9_ = (CS2Script.method2416((byte) -106, (Class95.aClass199Array1235[((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053]), i_7_, i_1_, i_3_, i_0_, Class_a.aClass_r_Sub1_1180.method2670((byte) 127), i_4_, Class246_Sub4.anIntArray3865, i, bool, Class220.anIntArray3049, i_8_, i_2_, i_5_));
			if ((i_9_ ^ 0xffffffff) > -2)
				return false;
			Class188.anInt2658 = Class220.anIntArray3049[i_9_ - 1];
			Class34.anInt451 = Class246_Sub4.anIntArray3865[-1 + i_9_];
			Class193.aBool2712 = false;
			Class43.method294((byte) -31);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ik.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method571(int i, int i_10_, int i_11_, int i_12_, byte i_13_, int i_14_, int i_15_) {
		do {
			try {
				anInt1171++;
				if ((i_14_ ^ 0xffffffff) <= (Class197.anInt2818 ^ 0xffffffff) && Class110.anInt1573 >= i && Class_t.anInt1442 <= i_15_ && Class109_Sub4.anInt4570 >= i_12_) {
					if ((i_11_ ^ 0xffffffff) != -2)
						Class194_Sub1.method1882(i_12_, i_14_, -21, i_10_, i, i_11_, i_15_);
					else
						Class258.method1672(i_12_, i, i_15_, i_10_, i_14_, -95);
				} else if (i_11_ != 1)
					Class250.method1598(i_15_, i_10_, i_14_, i, i_11_, i_12_, (byte) -126);
				else
					Class209.method1371(i, i_12_, i_10_, -70, i_15_, i_14_);
				if (i_13_ < -60)
					break;
				method571(-39, 4, 126, -25, (byte) -92, 118, 79);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ik.A(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		aByteArray1167 = new byte[520];
		aClass83_1170 = new Class83(8);
	}
}
