/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class247 {
	static int anInt3475;
	static byte[] aByteArray3476 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int anInt3477;
	static byte[][] aByteArrayArray3478;
	static IncomingPacket aClass13_3479 = new IncomingPacket(4, -1);
	static int anInt3480;
	static int anInt3481;
	static Class12 aClass12_3482;

	static final Class98 method1578(boolean bool, int i) {
		try {
			anInt3481++;
			if (bool != true)
				method1578(false, 67);
			Class98 class98 = ((Class98) Class_w.aClass54_6386.method379((long) i, (byte) 58));
			if (class98 != null)
				return class98;
			byte[] is = Class166.aClass_fs2344.method91(i, 0, 105);
			class98 = new Class98();
			if (is != null)
				class98.method618(8554, i, new BufferStream(is));
			Class_w.aClass54_6386.method371(1, (long) i, class98);
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vv.C(" + bool + ',' + i + ')');
		}
	}

	public static void method1579(byte i) {
		try {
			aClass12_3482 = null;
			aByteArray3476 = null;
			if (i == 98) {
				aClass13_3479 = null;
				aByteArrayArray3478 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vv.B(" + i + ')');
		}
	}

	static final void method1580(long l, int i) {
		try {
			if (i != -5184)
				method1578(false, 105);
			anInt3475++;
			if ((l ^ 0xffffffffffffffffL) < -1L) {
				if (l % 10L == 0L) {
					Class246_Sub28_Sub32.method2856(63, l + -1L);
					Class246_Sub28_Sub32.method2856(29, 1L);
				} else
					Class246_Sub28_Sub32.method2856(i + 5236, l);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vv.D(" + l + ',' + i + ')');
		}
	}

	static final String method1581(int[] is, int i) {
		try {
			anInt3477++;
			if (i <= 123)
				aClass13_3479 = null;
			StringBuffer stringbuffer = new StringBuffer();
			int i_0_ = Class149.anInt2192;
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_1_++) {
				Class84 class84 = Class241.aClass193_3398.method1273((byte) -118, is[i_1_]);
				if (((Class84) class84).anInt1107 != -1) {
					Class_l class_l = ((Class_l) Class56.aClass54_793.method379((long) (((Class84) class84).anInt1107), (byte) 58));
					if (class_l == null) {
						Class10 class10 = Class10.method120(Class210_Sub2.index8, ((Class84) class84).anInt1107, 0);
						if (class10 != null) {
							class_l = Class246_Sub15.aClass260_4445.method1749(class10, true);
							Class56.aClass54_793.method371(1, (long) (((Class84) class84).anInt1107), class_l);
						}
					}
					if (class_l != null) {
						Class106_Sub2.aClass_lArray5340[i_0_] = class_l;
						stringbuffer.append(" <img=").append(i_0_).append(">");
						i_0_++;
					}
				}
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vv.A(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		new Class67(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
		aClass12_3482 = new Class12(13, 3);
	}
}
