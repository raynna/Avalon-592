/* Class246_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IntegerNode extends Node {
	static int anInt5080;
	static IncomingPacket aClass13_5081 = new IncomingPacket(55, 2);
	static int anInt5082;
	static int anInt5083;
	int value;

	static final boolean method2179(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
		try {
			anInt5080++;
			if ((Class45.aByteArrayArrayArray648[0][i][i_3_] & 0x2) != 0)
				return true;
			if (i_1_ != 56)
				aClass13_5081 = null;
			if ((Class45.aByteArrayArrayArray648[i_2_][i][i_3_] & 0x10 ^ 0xffffffff) != -1)
				return false;
			if (Class127.method868(i_3_, (byte) 89, i_2_, i) == i_0_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("po.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2180(int i, int i_4_, int i_5_) {
		try {
			if (i_4_ != -1)
				method2181(-23);
			anInt5083++;
			if (Class246_Sub13.method1992(i_4_ - 91, i))
				Class109_Sub3.method1824(i_5_, 49, (Class246_Sub32.aClass235ArrayArray5049[i]));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("po.A(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	public static void method2181(int i) {
		do {
			try {
				aClass13_5081 = null;
				if (i == 0)
					break;
				anInt5082 = -18;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "po.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public IntegerNode() {
		/* empty */
	}

	IntegerNode(int i) {
		try {
			((IntegerNode) this).value = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "po.<init>(" + i + ')');
		}
	}
}
