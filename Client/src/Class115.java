/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 {
	static int anInt1601;
	static IncomingPacket aClass13_1602 = new IncomingPacket(36, 12);
	static int anInt1603;
	static int anInt1604;
	static Class147[][][] aClass147ArrayArrayArray1605;
	static Class67 aClass67_1606 = new Class67("K", "T", "K", "K");

	static final void method780(int i) {
		try {
			anInt1603++;
			if (i == 22) {
				for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(40)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
					if (Class255.method1658(4, (((Class246_Sub35) class246_sub35).anInt5156)))
						Class246_Sub17.method2045(21944, class246_sub35);
				}
				if (Class230.anInt3147 == 1) {
					Class246_Sub28_Sub21.aBool6580 = false;
					Class162.method1075(IntegerNode.anInt5082, true, Class246_Sub13.anInt4419, Class94.anInt1233, Class93.anInt1226);
				} else {
					Class162.method1075(IntegerNode.anInt5082, true, Class246_Sub13.anInt4419, Class94.anInt1233, Class93.anInt1226);
					int i_0_ = (Class_fs.aClass73_148.method459(-1, Class219.aClass67_3039.method436(true, Class_j.anInt1485)));
					for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(106)); class246_sub35 != null; class246_sub35 = (Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112)) {
						int i_1_ = Class112.method770(class246_sub35, 3);
						if ((i_0_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
							i_0_ = i_1_;
					}
					Class94.anInt1233 = i_0_ + 8;
					Class246_Sub13.anInt4419 = ((Class160.aBool2263 ? 26 : 22) + 16 * Class230.anInt3147);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kq.A(" + i + ')');
		}
	}

	public static void method781(byte i) {
		try {
			aClass13_1602 = null;
			aClass67_1606 = null;
			aClass147ArrayArrayArray1605 = null;
			int i_2_ = 126 % ((i - 62) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kq.B(" + i + ')');
		}
	}
}
