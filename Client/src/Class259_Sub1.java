/* Class259_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class259_Sub1 extends Class259 {
	static int anInt4506;
	static int anInt4507;
	static OutgoingPacket ACTION_BUTTON3 = new OutgoingPacket(62, 8);
	static int anInt4509;
	static int anInt4510;
	static int anInt4511 = 0;

	public static void method2015(byte i) {
		try {
			if (i == -44)
				ACTION_BUTTON3 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hg.A(" + i + ')');
		}
	}

	static final void method2016(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt4507++;
			Class246_Sub6 class246_sub6 = null;
			for (Class246_Sub6 class246_sub6_9_ = (Class246_Sub6) Class61.aClass166_846.method1104(63); class246_sub6_9_ != null; class246_sub6_9_ = ((Class246_Sub6) Class61.aClass166_846.method1108((byte) -112))) {
				if (((i_6_ ^ 0xffffffff) == (((Class246_Sub6) class246_sub6_9_).anInt3936 ^ 0xffffffff)) && i == ((Class246_Sub6) class246_sub6_9_).anInt3928 && i_4_ == ((Class246_Sub6) class246_sub6_9_).anInt3925 && i_3_ == ((Class246_Sub6) class246_sub6_9_).anInt3927) {
					class246_sub6 = class246_sub6_9_;
					break;
				}
			}
			if (class246_sub6 == null) {
				class246_sub6 = new Class246_Sub6();
				((Class246_Sub6) class246_sub6).anInt3928 = i;
				((Class246_Sub6) class246_sub6).anInt3925 = i_4_;
				((Class246_Sub6) class246_sub6).anInt3927 = i_3_;
				((Class246_Sub6) class246_sub6).anInt3936 = i_6_;
				if (i >= 0 && i_4_ >= 0 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i ^ 0xffffffff)) && (Class152.anInt2205 ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
					Class9.method82(16, class246_sub6);
				Class61.aClass166_846.method1101(false, class246_sub6);
			}
			((Class246_Sub6) class246_sub6).anInt3929 = i_2_;
			((Class246_Sub6) class246_sub6).anInt3941 = i_7_;
			((Class246_Sub6) class246_sub6).anInt3931 = i_0_;
			if (i_5_ > -105)
				anInt4506 = -119;
			((Class246_Sub6) class246_sub6).anInt3934 = i_8_;
			((Class246_Sub6) class246_sub6).anInt3937 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hg.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}
}
