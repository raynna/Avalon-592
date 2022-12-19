/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class94 {
	static int anInt1230;
	static OutgoingPacket aClass201_1231 = new OutgoingPacket(22, 4);
	static long aLong1232 = 0L;
	static int anInt1233;
	static int[] anIntArray1234 = new int[1];

	static final void decodePlayerMasks(Stream_Sub1 stream_sub1, byte i) {
		try {
			for (int i_0_ = 0; (Class252.anInt3567 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				int i_1_ = Class218.anIntArray3025[i_0_];
				Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_1_];
				int i_2_ = stream_sub1.readUnsignedByte(255);
				if ((i_2_ & 0x4) != 0)
					i_2_ += stream_sub1.readUnsignedByte(255) << 8;
				if ((0x2000 & i_2_) != 0)
					i_2_ += stream_sub1.readUnsignedByte(255) << 16;
				Class59_Sub5_Sub1.playerMasksHelper(i_2_, stream_sub1, i_1_, 2, class_r_sub1);
			}
			if (i > -119)
				anInt1233 = -3;
			anInt1230++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ir.A(" + (stream_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method602(int i) {
		do {
			try {
				anIntArray1234 = null;
				aClass201_1231 = null;
				if (i == 22)
					break;
				method602(80);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ir.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
