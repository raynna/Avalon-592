/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class213 {
	private Class260_Sub2 aClass260_Sub2_2976;
	static int anInt2977;
	int anInt2978;
	static Class67 aClass67_2979 = new Class67("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es", "Interfaces carregadas");
	static int anInt2980;
	static IncomingPacket GLOBAL_STRING_1_PACKET = new IncomingPacket(53, -1);
	static Class166 aClass166_2982 = new Class166();
	static boolean[][] aBoolArrayArray2983 = { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
	static int[] anIntArray2984 = { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	public static void method1392(byte i) {
		try {
			aClass166_2982 = null;
			aClass67_2979 = null;
			GLOBAL_STRING_1_PACKET = null;
			aBoolArrayArray2983 = null;
			if (i != -10)
				method1392((byte) -104);
			anIntArray2984 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "td.B(" + i + ')');
		}
	}

	static final void method1393(int i, int i_0_, int i_1_, Class59_Sub1 class59_sub1) {
		Class147 class147 = Class187.method1222(i, i_0_, i_1_);
		if (class147 != null)
			((Class147) class147).aClass59_Sub1_2156 = class59_sub1;
	}

	static final int method1394(int i, byte i_2_) {
		try {
			anInt2977++;
			if (i_2_ < 59)
				return 50;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "td.A(" + i + ',' + i_2_ + ')');
		}
	}

	Class213(Class260_Sub2 class260_sub2, int i, int i_3_) {
		try {
			((Class213) this).anInt2978 = i_3_;
			aClass260_Sub2_2976 = class260_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("td.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt2980++;
			aClass260_Sub2_2976.method1908(((Class213) this).anInt2978, (byte) 51);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "td.finalize(" + ')');
		}
	}
}
