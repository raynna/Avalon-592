/* Class79_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79_Sub1 extends Class79 {
	static Class116 aClass116_5162;
	static Interface6 anInterface6_5163;
	static int anInt5164;
	static OutgoingPacket aClass201_5165 = new OutgoingPacket(67, 7);
	static int anInt5166;
	static IncomingPacket aClass13_5167 = new IncomingPacket(85, 6);

	static final void method2204(byte i, int i_0_, int i_1_, Class235 class235) {
		try {
			anInt5164++;
			Class128 class128 = class235.method1514(0, Class246_Sub15.aClass260_4445);
			if (class128 != null) {
				if (i >= -84)
					method2206(false);
				Class246_Sub15.aClass260_4445.OA(i_0_, i_1_, i_0_ - -(((Class235) class235).f_fc), (((Class235) class235).f_sb + i_1_));
				if (Class246_Sub28_Sub13.anInt6293 < 3)
					Class246_Sub16.aClass_l4521.method728(((float) i_0_ + (float) ((Class235) class235).f_fc / 2.0F), ((float) i_1_ + (float) ((Class235) class235).f_sb / 2.0F), 4096, (0x3fff & (int) -Class204.aFloat2881) << 2, class128, i_0_, i_1_);
				else
					Class246_Sub15.aClass260_4445.ca(-16777216, class128, i_0_, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qp.CA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class235 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class109_Sub1_Sub1 method2205(int i, int i_2_, int i_3_, int i_4_, int i_5_, Class260_Sub2 class260_sub2) {
		try {
			if (i_5_ >= -96)
				aClass116_5162 = null;
			anInt5166++;
			if (((Class260_Sub2) class260_sub2).aBool4385 || (Class246_Sub40.method2313(200, i_4_) && Class246_Sub40.method2313(200, i_2_)))
				return new Class109_Sub1_Sub1(class260_sub2, 3553, i_3_, i, i_4_, i_2_, true);
			if (!((Class260_Sub2) class260_sub2).f_pg)
				return new Class109_Sub1_Sub1(class260_sub2, i_3_, i, i_4_, i_2_, Class206.method1350(i_4_, 269173057), Class206.method1350(i_2_, 269173057), true);
			return new Class109_Sub1_Sub1(class260_sub2, 34037, i_3_, i, i_4_, i_2_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qp.AA(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2206(boolean bool) {
		try {
			if (bool != false)
				method2204((byte) 102, -5, 105, null);
			aClass201_5165 = null;
			aClass13_5167 = null;
			anInterface6_5163 = null;
			aClass116_5162 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qp.BA(" + bool + ')');
		}
	}
}
