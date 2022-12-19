/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class136 {
	private int anInt1932 = 0;
	private Class166 aClass166_1933;
	static int anInt1934;
	private int[][][] anIntArrayArrayArray1935;
	static IncomingPacket aClass13_1936 = new IncomingPacket(102, 5);
	private Class246_Sub15[] aClass246_Sub15Array1937;
	private int anInt1938;
	static int anInt1939;
	static int anInt1940;
	static int anInt1941;
	private int anInt1942 = -1;
	static int[] anIntArray1943 = new int[14];
	private int anInt1944;
	static int anInt1945;
	boolean aBool1946;

	final int[][] method922(byte i, int i_0_) {
		try {
			anInt1939++;
			int i_1_ = 119 % ((i + 51) / 48);
			if ((anInt1938 ^ 0xffffffff) == (anInt1944 ^ 0xffffffff)) {
				((Class136) this).aBool1946 = aClass246_Sub15Array1937[i_0_] == null;
				aClass246_Sub15Array1937[i_0_] = Class202.aClass246_Sub15_2867;
				return anIntArrayArrayArray1935[i_0_];
			}
			if (anInt1938 == 1) {
				((Class136) this).aBool1946 = (anInt1942 ^ 0xffffffff) != (i_0_ ^ 0xffffffff);
				anInt1942 = i_0_;
				return anIntArrayArrayArray1935[0];
			}
			Class246_Sub15 class246_sub15 = aClass246_Sub15Array1937[i_0_];
			if (class246_sub15 != null)
				((Class136) this).aBool1946 = false;
			else {
				((Class136) this).aBool1946 = true;
				if ((anInt1932 ^ 0xffffffff) <= (anInt1938 ^ 0xffffffff)) {
					Class246_Sub15 class246_sub15_2_ = (Class246_Sub15) aClass166_1933.method1103(-85);
					class246_sub15 = new Class246_Sub15(i_0_, ((Class246_Sub15) class246_sub15_2_).anInt4441);
					aClass246_Sub15Array1937[((Class246_Sub15) class246_sub15_2_).anInt4439] = null;
					class246_sub15_2_.unlink((byte) -99);
				} else {
					class246_sub15 = new Class246_Sub15(i_0_, anInt1932);
					anInt1932++;
				}
				aClass246_Sub15Array1937[i_0_] = class246_sub15;
			}
			aClass166_1933.method1097(1245184, class246_sub15);
			return (anIntArrayArrayArray1935[((Class246_Sub15) class246_sub15).anInt4441]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ms.D(" + i + ',' + i_0_ + ')');
		}
	}

	final int[][][] method923(byte i) {
		try {
			anInt1941++;
			if ((anInt1938 ^ 0xffffffff) != (anInt1944 ^ 0xffffffff))
				throw new RuntimeException("Can only retrieve a full image cache");
			for (int i_3_ = 0; (anInt1938 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
				aClass246_Sub15Array1937[i_3_] = Class202.aClass246_Sub15_2867;
			if (i < 108)
				anIntArrayArrayArray1935 = null;
			return anIntArrayArrayArray1935;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ms.A(" + i + ')');
		}
	}

	public static void method924(byte i) {
		try {
			aClass13_1936 = null;
			int i_4_ = 41 / ((i + 1) / 47);
			anIntArray1943 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ms.E(" + i + ')');
		}
	}

	static final void method925(int i, Class260 class260, int i_5_, int i_6_) {
		try {
			Class_a.aClass138ArrayArray1175 = new Class138[i_5_][i];
			anInt1934++;
			Class33.aClass260_444 = class260;
			if (Class246_Sub28_Sub31.anIntArray6913 != null)
				Class142.aClass211_2064 = (Class21_Sub3.method2078(Class246_Sub28_Sub31.anIntArray6913[4], Class246_Sub28_Sub31.anIntArray6913[2], Class246_Sub28_Sub31.anIntArray6913[5], Class246_Sub28_Sub31.anIntArray6913[0], Class246_Sub28_Sub31.anIntArray6913[3], Class246_Sub28_Sub31.anIntArray6913[1], -1101853054));
			Class22.aClass138_328 = new Class138();
			int i_7_ = 24 / ((i_6_ - 6) / 58);
			Class142.method957((byte) 60);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ms.B(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method926(byte i) {
		try {
			if (i == 56) {
				for (int i_8_ = 0; (anInt1938 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					anIntArrayArrayArray1935[i_8_][0] = null;
					anIntArrayArrayArray1935[i_8_][1] = null;
					anIntArrayArrayArray1935[i_8_][2] = null;
					anIntArrayArrayArray1935[i_8_] = null;
				}
				anInt1940++;
				anIntArrayArrayArray1935 = null;
				aClass246_Sub15Array1937 = null;
				aClass166_1933.method1102(-63);
				aClass166_1933 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ms.C(" + i + ')');
		}
	}

	Class136(int i, int i_9_, int i_10_) {
		aClass166_1933 = new Class166();
		((Class136) this).aBool1946 = false;
		try {
			anInt1938 = i;
			anInt1944 = i_9_;
			aClass246_Sub15Array1937 = new Class246_Sub15[anInt1944];
			anIntArrayArrayArray1935 = new int[anInt1938][3][i_10_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ms.<init>(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}
}
