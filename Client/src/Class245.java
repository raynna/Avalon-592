/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
	static IncomingPacket RECEIVE_FRIEND_CHAT_MESSAGE_PACKET;
	static int anInt3458;
	static int anInt3459;
	static int anInt3460;
	static String[] aStringArray3461 = new String[200];
	static Class106 aClass106_3462;
	static IncomingPacket aClass13_3463;

	static final void method1572(Class260 class260, int i) {
		try {
			anInt3459++;
			if (i != 8)
				method1572(null, 3);
			class260.OA(0, 0, Class246_Sub41_Sub1.anInt6171, 350);
			class260.O(0, 0, Class246_Sub41_Sub1.anInt6171, 350, Class_q_Sub1.anInt6670 << 24 | 0x332277, 1);
			int i_0_ = 350 / Class97.anInt1264;
			if ((Class59_Sub2_Sub2.anInt6018 ^ 0xffffffff) < -1) {
				int i_1_ = -4 + (-Class97.anInt1264 + 346);
				int i_2_ = (i_0_ * i_1_ / (-1 + (i_0_ + Class59_Sub2_Sub2.anInt6018)));
				int i_3_ = 4;
				if ((Class59_Sub2_Sub2.anInt6018 ^ 0xffffffff) < -2)
					i_3_ += ((Class59_Sub2_Sub2.anInt6018 - 1 + -Class91.anInt1188) * (-i_2_ + i_1_) / (Class59_Sub2_Sub2.anInt6018 - 1));
				class260.O(Class246_Sub41_Sub1.anInt6171 - 16, i_3_, 12, i_2_, Class_q_Sub1.anInt6670 << 24 | 0x332277, 2);
				for (int i_4_ = Class91.anInt1188; ((i_4_ ^ 0xffffffff) > (Class91.anInt1188 - -i_0_ ^ 0xffffffff) && (i_4_ ^ 0xffffffff) > (Class59_Sub2_Sub2.anInt6018 ^ 0xffffffff)); i_4_++) {
					String[] strings = Class60.method412((byte) -87, Class55.aStringArray786[i_4_], '\010');
					int i_5_ = ((-24 + Class246_Sub41_Sub1.anInt6171) / strings.length);
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_6_++) {
						int i_7_ = i_6_ * i_5_ + 8;
						class260.OA(i_7_, 0, -8 + i_7_ + i_5_, 350);
						Class109.aClass116_1554.method794(-16777216, -1, strings[i_6_], (-((-Class91.anInt1188 + i_4_) * Class97.anInt1264) - 2 + (-Class200.anInt2852 + 350 + -(((Class73) Class246_Sub5.aClass73_3892).anInt946))), i_7_, 0);
					}
				}
			}
			class260.OA(0, 0, Class246_Sub41_Sub1.anInt6171, 350);
			class260.method1697(Class246_Sub41_Sub1.anInt6171, -126, -Class200.anInt2852 + 350, 0, -1);
			Class79_Sub1.aClass116_5162.method794(-16777216, -1, "--> " + Class246_Sub14.aString4438, -1 + -((Class73) Class_fs.aClass73_148).anInt946 + 350, 10, 0);
			int i_8_ = -1;
			if (Class246_Sub1_Sub4.anInt5752 % 30 > 15)
				i_8_ = 16777215;
			class260.method1681(0, -((Class73) Class_fs.aClass73_148).anInt946 + 350 - 11, 12, ((Class_fs.aClass73_148.method459(-1, "--> " + Class246_Sub14.aString4438.substring(0, Class246_Sub1_Sub14.anInt6596))) + 10), i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vt.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1573(int i) {
		try {
			RECEIVE_FRIEND_CHAT_MESSAGE_PACKET = null;
			aClass106_3462 = null;
			aClass13_3463 = null;
			if (i != -16777216)
				aClass13_3463 = null;
			aStringArray3461 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vt.A(" + i + ')');
		}
	}

	static final void method1574(int i) {
		try {
			anInt3458++;
			Class246_Sub28_Sub30.aClipboard6876 = null;
			Class39.aBool572 = false;
			int i_9_ = 70 % ((-41 - i) / 48);
			Class205.method1341(-11712);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vt.C(" + i + ')');
		}
	}

	static {
		RECEIVE_FRIEND_CHAT_MESSAGE_PACKET = new IncomingPacket(107, -1);
		aClass13_3463 = new IncomingPacket(103, 6);
	}
}
