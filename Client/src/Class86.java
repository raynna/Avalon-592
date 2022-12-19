/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class86 {
	static byte aByte1136;
	int anInt1137;
	int anInt1138;
	static int[] anIntArray1139 = new int[25];
	int anInt1140;
	int anInt1141;

	public static void method553(byte i) {
		try {
			anIntArray1139 = null;
			int i_0_ = -93 / ((i - 28) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ic.A(" + i + ')');
		}
	}

	static final void method554(int i, int i_1_, int i_2_, int i_3_, Class59_Sub5 class59_sub5) {
		Class147 class147 = Class187.method1222(i, i_1_, i_2_);
		if (class147 != null) {
			int i_4_ = 0;
			((Class59_Sub5) class59_sub5).anInt5405 = (i_1_ << Class126.anInt1781) + Class40_Sub7.anInt5174;
			((Class59_Sub5) class59_sub5).anInt5397 = i_3_;
			((Class59_Sub5) class59_sub5).anInt5395 = (i_2_ << Class126.anInt1781) + Class40_Sub7.anInt5174;
			for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
				if (((Class59_Sub3) ((Class3) class3).aClass59_Sub3_24).aBool5054) {
					int i_5_ = ((Class3) class3).aClass59_Sub3_24.method2168(-25430);
					if (i_5_ != -32768 && i_5_ < i_4_)
						i_4_ = i_5_;
				}
			}
			if (i_4_ < 0) {
				((Class59_Sub5) class59_sub5).anInt5397 += i_4_;
				((Class59_Sub5) class59_sub5).aBool5404 = true;
			}
			((Class147) class147).aClass59_Sub5_2158 = class59_sub5;
		}
	}

	public Class86() {
		/* empty */
	}
}
