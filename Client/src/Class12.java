/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12 {
	static int anInt172;
	static int anInt173;
	static int anInt174;
	static int anInt175;
	static OutgoingPacket aClass201_176 = new OutgoingPacket(19, 2);
	static IncomingPacket aClass13_177 = new IncomingPacket(18, 1);
	static float[] aFloatArray178;
	static float[] aFloatArray179 = new float[16384];
	static Class166 aClass166_180;
	static int anInt181;
	static int anInt182;

	static final void method137(int i, int i_0_) {
		try {
			do {
				if (anInt182 == 0) {
					Class32.aClass246_Sub37_Sub1_433.method2503(true, i);
					if (!client.f_ob)
						break;
				}
				Class108.anInt1534 = i;
			} while (false);
			if (i_0_ < 68)
				method140(-26);
			anInt174++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bf.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final int method138(int i, byte i_1_) {
		try {
			anInt173++;
			if (i_1_ != -98)
				anInt182 = -17;
			return 0xff & i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bf.A(" + i + ',' + i_1_ + ')');
		}
	}

	public final String toString() {
		try {
			anInt172++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bf.toString(" + ')');
		}
	}

	static final void method139(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		do {
			try {
				anInt175++;
				if (i_4_ != 255)
					method140(33);
				if ((i_2_ ^ 0xffffffff) > -2 || i_8_ < 1 || ((-2 + Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) || i_8_ > -2 + Class152.anInt2205)
					break;
				int i_10_ = i;
				if (i_10_ < 3 && Class211.method1389(i_2_, -29792, i_8_))
					i_10_++;
				if ((Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 111) || IntegerNode.method2179(i_2_, Class40_Sub6.anInt5103, (byte) 56, i_10_, i_8_)) && Class106.aClass147ArrayArrayArray1494 != null) {
					Class246_Sub28_Sub3.aClass255_Sub1_5900.method2337(Class246_Sub15.aClass260_4445, -4, Class95.aClass199Array1235[i], i_9_, i, i_8_, i_2_);
					if (i_7_ < 0)
						break;
					boolean bool = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool607);
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool607 = true;
					Class246_Sub28_Sub3.aClass255_Sub1_5900.method2341(i_2_, i, i_6_, i_5_, i_7_, Class246_Sub15.aClass260_4445, i_3_, i_8_, i_10_, (byte) 28, Class95.aClass199Array1235[i]);
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool607 = bool;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bf.D(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	Class12(int i, int i_11_) {
		/* empty */
	}

	public static void method140(int i) {
		do {
			try {
				aClass166_180 = null;
				aClass201_176 = null;
				aFloatArray178 = null;
				aClass13_177 = null;
				aFloatArray179 = null;
				if (i == -22964)
					break;
				method137(52, -2);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bf.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aFloatArray178 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
			aFloatArray178[i] = (float) Math.sin(d * (double) i);
			aFloatArray179[i] = (float) Math.cos(d * (double) i);
		}
		anInt182 = 0;
		aClass166_180 = new Class166();
	}
}
