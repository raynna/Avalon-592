/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
	static int anInt1653;
	int anInt1654;
	int anInt1655;
	int anInt1656;
	int anInt1657;
	int anInt1658;
	int anInt1659;
	int anInt1660;
	int anInt1661;
	int anInt1662;
	static int[] anIntArray1663 = new int[500];
	int anInt1664;
	int anInt1665;
	int anInt1666;
	static int anInt1667;
	int anInt1668;
	int anInt1669;
	int anInt1670;
	int anInt1671;
	int anInt1672;
	static int[] anIntArray1673;
	int anInt1674;
	static OutgoingPacket ACTION_BUTTON7 = new OutgoingPacket(28, 8);
	static IncomingPacket aClass13_1676;
	static int anInt1677 = 0;
	static Class208 aClass208_1678;

	static final void method821(byte i) {
		try {
			Class40_Sub5.method2127(-106);
			if (i > 32) {
				anInt1667++;
				Class85.method545((byte) -109);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lk.B(" + i + ')');
		}
	}

	public static void method822(int i) {
		try {
			if (i == 500) {
				anIntArray1663 = null;
				aClass208_1678 = null;
				anIntArray1673 = null;
				aClass13_1676 = null;
				ACTION_BUTTON7 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lk.A(" + i + ')');
		}
	}

	public Class121() {
		/* empty */
	}

	static final void method823(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				if (i_0_ >= -33)
					method822(-12);
				anInt1653++;
				if (i < Class197.anInt2818 || (i ^ 0xffffffff) < (Class110.anInt1573 ^ 0xffffffff))
					break;
				i_1_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_1_, Class_t.anInt1442);
				i_2_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_2_, Class_t.anInt1442);
				Class156.method1035((byte) -17, i_2_, i_1_, i, i_3_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lk.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass13_1676 = new IncomingPacket(44, 6);
	}
}
