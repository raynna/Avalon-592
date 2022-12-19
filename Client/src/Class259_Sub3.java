/* Class259_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class259_Sub3 extends Class259 {
	static int anInt5354;
	static boolean aBool5355 = false;
	static IncomingPacket aClass13_5356 = new IncomingPacket(11, -2);
	static Class260 aClass260_5357;
	static int[] anIntArray5358 = new int[5];

	public static void method2271(byte i) {
		do {
			try {
				aClass260_5357 = null;
				aClass13_5356 = null;
				anIntArray5358 = null;
				if (i == -59)
					break;
				anIntArray5358 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tq.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2272(Class255_Sub1 class255_sub1, byte[][] is, byte i) {
		do {
			try {
				for (int i_0_ = 0; ((((Class255) class255_sub1).anInt3670 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					Class85.method545((byte) -109);
					for (int i_1_ = 0; Class38_Sub1_Sub1.anInt6770 >> 3 > i_1_; i_1_++) {
						for (int i_2_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
							int i_3_ = (Class172.anIntArrayArrayArray2431[i_0_][i_1_][i_2_]);
							if ((i_3_ ^ 0xffffffff) != 0) {
								int i_4_ = 0x3 & i_3_ >> 24;
								if (!((Class255) class255_sub1).aBool3658 || (i_4_ ^ 0xffffffff) == -1) {
									int i_5_ = (0x6 & i_3_) >> 1;
									int i_6_ = 0x3ff & i_3_ >> 14;
									int i_7_ = 0x7ff & i_3_ >> 3;
									int i_8_ = (i_6_ / 8 << 8) - -(i_7_ / 8);
									for (int i_9_ = 0; Class168.anIntArray2398.length > i_9_; i_9_++) {
										if (((Class168.anIntArray2398[i_9_] ^ 0xffffffff) == (i_8_ ^ 0xffffffff)) && is[i_9_] != null) {
											class255_sub1.method2340(is[i_9_], 8 * i_1_, (i_6_ & 0x7) * 8, i_5_, 8 * i_2_, i_0_, Class246_Sub15.aClass260_4445, 8 * (0x7 & i_7_), Class95.aClass199Array1235, i_4_, (byte) 103);
											break;
										}
									}
								}
							}
						}
					}
				}
				anInt5354++;
				if (i > 82)
					break;
				aClass13_5356 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tq.J(" + (class255_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
