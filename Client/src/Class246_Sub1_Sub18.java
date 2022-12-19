/* Class246_Sub1_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub18 extends Class246_Sub1 {
	private Class85 aClass85_6854;
	static int[] anIntArray6855;
	static int anInt6856;
	static int anInt6857;
	static IncomingPacket aClass13_6858 = new IncomingPacket(76, 7);
	static int anInt6859 = 0;
	static Class_fs aClass_fs6860;
	static int anInt6861;
	static int anInt6862;

	private final void method2827(BufferStream stream, int i, int i_0_) {
		do {
			try {
				anInt6861++;
				if (i != i_0_)
					break;
				int i_1_ = stream.readUnsignedByte(i_0_ ^ 0x6);
				if (aClass85_6854 == null) {
					int i_2_ = Class206.method1350(i_1_, i_0_ + 269172808);
					aClass85_6854 = new Class85(i_2_);
				}
				for (int i_3_ = 0; i_1_ > i_3_; i_3_++) {
					boolean bool = stream.readUnsignedByte(255) == 1;
					int i_4_ = stream.read24BitInteger((byte) 29);
					Node class246;
					if (bool)
						class246 = new Class246_Sub4(stream.readString((byte) -40));
					else
						class246 = new IntegerNode(stream.readInt((byte) 90));
					aClass85_6854.method547((long) i_4_, -2301, class246);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rk.B(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2828(int i, BufferStream stream) {
		try {
			if (i != 76)
				method2828(-30, null);
			for (;;) {
				int i_5_ = stream.readUnsignedByte(255);
				if (i_5_ == 0)
					break;
				method2827(stream, i_5_, 249);
			}
			anInt6862++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rk.D(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2829(int i) {
		do {
			try {
				aClass13_6858 = null;
				anIntArray6855 = null;
				aClass_fs6860 = null;
				if (i == 7)
					break;
				aClass13_6858 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rk.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2830(int i, int i_6_, int i_7_) {
		try {
			anInt6856++;
			if (aClass85_6854 == null)
				return i;
			if (i_6_ != 76)
				method2828(-36, null);
			IntegerNode class246_sub33 = (IntegerNode) aClass85_6854.method544((long) i_7_, 126);
			if (class246_sub33 == null)
				return i;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rk.A(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public Class246_Sub1_Sub18() {
		/* empty */
	}

	final String method2831(int i, String string, int i_8_) {
		try {
			anInt6857++;
			if (i != -16471)
				anIntArray6855 = null;
			if (aClass85_6854 == null)
				return string;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) aClass85_6854.method544((long) i_8_, 123);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rk.C(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_8_ + ')'));
		}
	}
}
