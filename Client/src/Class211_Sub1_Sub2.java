/* Class211_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class211_Sub1_Sub2 extends Class211_Sub1 {
	private int anInt6519;
	static int anInt6520;
	private int anInt6521;
	private int anInt6522;
	static int anInt6523;
	private int anInt6524;
	private int anInt6525;
	private int anInt6526;
	private Class109_Sub4 aClass109_Sub4_6527;
	static OutgoingPacket aClass201_6528 = new OutgoingPacket(52, -1);
	private Class260_Sub2 aClass260_Sub2_6529;
	static float[][] aFloatArrayArray6530 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
	static int anInt6531 = 0;

	static final void method2689(int i) {
		try {
			anInt6523++;
			int i_0_ = Class246_Sub28_Sub27.aClass39_Sub1_6759.method2049(BufferStream.anInt5656, 28);
			if (i_0_ != i) {
				if ((i_0_ ^ 0xffffffff) == -2) {
					Class39_Sub1.method2051(-93, (byte) 0);
					Class98.method620(512, true);
					if (Class45.aByteArrayArrayArray648 != null)
						Class106_Sub2.method2264(-29238);
				} else {
					Class39_Sub1.method2051(i ^ ~0x74, (byte) (Class64_Sub1.anInt5236 - 4 & 0xff));
					Class98.method620(2, true);
				}
			} else {
				Class5.aByteArrayArrayArray56 = null;
				Class98.method620(0, true);
			}
			Class40_Sub7.anInt5170 = Class246_Sub28_Sub24.anInt6681;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kr.B(" + i + ')');
		}
	}

	final Class109_Sub4 method2265(int i) {
		try {
			if (i != 2)
				return null;
			anInt6520++;
			if (aClass109_Sub4_6527 == null) {
				Interface6 interface6 = ((Class260) aClass260_Sub2_6529).anInterface6_3714;
				Class_q_Sub1.anIntArray6669[2] = anInt6522;
				Class_q_Sub1.anIntArray6669[5] = anInt6521;
				Class_q_Sub1.anIntArray6669[0] = anInt6525;
				Class_q_Sub1.anIntArray6669[4] = anInt6526;
				Class_q_Sub1.anIntArray6669[1] = anInt6519;
				Class_q_Sub1.anIntArray6669[3] = anInt6524;
				boolean bool = false;
				int i_1_ = 0;
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -7; i_2_++) {
					if (!interface6.method13(Class_q_Sub1.anIntArray6669[i_2_], 19378))
						return null;
					Class238 class238 = interface6.method17(i - 31307, (Class_q_Sub1.anIntArray6669[i_2_]));
					int i_3_ = ((Class238) class238).aBool3335 ? 64 : 128;
					if ((((Class238) class238).aByte3349 ^ 0xffffffff) < -1)
						bool = true;
					if ((i_1_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
						i_1_ = i_3_;
				}
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -7; i_4_++)
					OutgoingPacket.anIntArrayArray2864[i_4_] = interface6.method14(false, 5754, (Class_q_Sub1.anIntArray6669[i_4_]), 1.0F, i_1_, i_1_);
				aClass109_Sub4_6527 = new Class109_Sub4(aClass260_Sub2_6529, 6407, i_1_, bool, OutgoingPacket.anIntArrayArray2864);
			}
			return aClass109_Sub4_6527;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kr.D(" + i + ')');
		}
	}

	public static void method2690(int i) {
		try {
			aFloatArrayArray6530 = null;
			if (i != -4)
				anInt6531 = -57;
			aClass201_6528 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kr.A(" + i + ')');
		}
	}

	Class211_Sub1_Sub2(Class260_Sub2 class260_sub2, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			anInt6524 = i_7_;
			anInt6526 = i_8_;
			anInt6521 = i_9_;
			anInt6525 = i;
			anInt6522 = i_6_;
			aClass260_Sub2_6529 = class260_sub2;
			anInt6519 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kr.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}
}
