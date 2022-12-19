/* Class63_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class63_Sub1 extends Class63 {
	int anInt4713;
	String aString4714;
	static OutgoingPacket aClass201_4715 = new OutgoingPacket(35, 3);
	static int anInt4716;
	String aString4717;
	static float aFloat4718;
	static int anInt4719;
	static int anInt4720;
	static int anInt4721;
	static int anInt4722;
	int anInt4723 = -1;

	final Class5 method2072(int i) {
		try {
			if (i != -14839)
				method2072(82);
			anInt4720++;
			return Class73.aClass5Array962[((Class63) this).anInt854];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kf.A(" + i + ')');
		}
	}

	static final int method2073(int i) {
		try {
			if (i > -35)
				anInt4719 = -33;
			anInt4721++;
			return 16;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kf.B(" + i + ')');
		}
	}

	static final void method2074(int i, int i_0_, int i_1_) {
		try {
			anInt4722++;
			Class85 class85 = new Class85(16);
			if (i != 27106)
				method2075(71);
			for (Class246_Sub13 class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.first((byte) -23)); class246_sub13 != null; class246_sub13 = ((Class246_Sub13) Class251.aClass85_3551.next((byte) -20))) {
				class246_sub13.unlink((byte) -119);
				int i_2_ = (int) (((Node) class246_sub13).hash >> 28);
				int i_3_ = ((int) (0x3fffL & ((Node) class246_sub13).hash >> 14) - i_1_);
				int i_4_ = ((int) (0x3fffL & ((Node) class246_sub13).hash) - i_0_);
				if (i_4_ >= 0 && i_3_ >= 0 && (i_4_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) && Class152.anInt2205 > i_3_)
					class85.method547((long) (i_2_ << 28 | i_3_ << 14 | i_4_), -2301, class246_sub13);
			}
			Class251.aClass85_3551 = class85;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kf.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2075(int i) {
		do {
			try {
				aClass201_4715 = null;
				if (i == 23573)
					break;
				aFloat4718 = 0.5439605F;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kf.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
