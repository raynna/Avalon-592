/* Class100_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100_Sub1 extends Class100 implements Runnable {
	static int anInt5066;
	static int anInt5067;
	static int anInt5068;
	static int anInt5069;
	static boolean aBool5070;
	static int anInt5071;
	static int anInt5072;
	static int anInt5073;
	private boolean aBool5074 = true;
	static int anInt5075 = 0;
	static int anInt5076;
	private Class106_Sub1 aClass106_Sub1_5077;
	static int anInt5078;
	int anInt5079 = -1;

	final void method2173(byte i) {
		try {
			if (i <= -102) {
				anInt5067++;
				aBool5074 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pg.B(" + i + ')');
		}
	}

	static final boolean method2174(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ >= -22)
				method2175((byte) -118);
			anInt5078++;
			if ((i & 0x8000 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pg.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2175(byte i) {
		try {
			anInt5069++;
			try {
				if (i < 118)
					return true;
				if ((Class12.anInt182 ^ 0xffffffff) == -3) {
					if (Class76.aClass246_Sub24_999 == null) {
						Class76.aClass246_Sub24_999 = Class246_Sub24.method2111(Class_m.aClass_fs1545, Class7.anInt96, (Class59_Sub5.anInt5400));
						if (Class76.aClass246_Sub24_999 == null)
							return false;
					}
					if (Class40_Sub9.aClass155_5506 == null)
						Class40_Sub9.aClass155_5506 = new Class155(Class207.aClass_fs2923, Class246_Sub1_Sub18.aClass_fs6860);
					if (Class32.aClass246_Sub37_Sub1_433.method2531(22050, Class40_Sub9.aClass155_5506, true, Class246_Sub28_Sub15.aClass_fs6368, Class76.aClass246_Sub24_999)) {
						Class32.aClass246_Sub37_Sub1_433.method2513((byte) 111);
						Class32.aClass246_Sub37_Sub1_433.method2503(true, Class108.anInt1534);
						Class32.aClass246_Sub37_Sub1_433.method2525(Class109_Sub2.aBool3818, (byte) -94, Class76.aClass246_Sub24_999);
						Class40_Sub9.aClass155_5506 = null;
						Class_m.aClass_fs1545 = null;
						Class12.anInt182 = 0;
						Class76.aClass246_Sub24_999 = null;
						return true;
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Class32.aClass246_Sub37_Sub1_433.method2515(2);
				Class40_Sub9.aClass155_5506 = null;
				Class_m.aClass_fs1545 = null;
				Class12.anInt182 = 0;
				Class76.aClass246_Sub24_999 = null;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pg.D(" + i + ')');
		}
	}

	public final void run() {
		try {
			while (aBool5074)
				aClass106_Sub1_5077.method1895(this, 25152);
			anInt5068++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pg.run(" + ')');
		}
	}

	final void method2176(byte i) {
		try {
			if (i > -7)
				aBool5070 = true;
			new Thread(this, "a").start();
			anInt5066++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pg.E(" + i + ')');
		}
	}

	static final void method2177(boolean bool, int i, String string) {
		try {
			string = string.toLowerCase();
			anInt5071++;
			short[] is = new short[16];
			int i_2_ = 0;
			int i_3_ = bool ? 32768 : 0;
			if (i != 32768)
				anInt5075 = -11;
			int i_4_ = (i_3_ - -(!bool ? ((Class65) Class128_Sub1.aClass65_5558).anInt865 : ((Class65) Class128_Sub1.aClass65_5558).anInt869));
			for (int i_5_ = i_3_; i_5_ < i_4_; i_5_++) {
				Class246_Sub1_Sub3 class246_sub1_sub3 = Class128_Sub1.aClass65_5558.method428(i_5_, (byte) -99);
				if (((Class246_Sub1_Sub3) class246_sub1_sub3).aBool5720 && (class246_sub1_sub3.method2431(0).toLowerCase().indexOf(string) ^ 0xffffffff) != 0) {
					if ((i_2_ ^ 0xffffffff) <= -51) {
						Class102.aShortArray1323 = null;
						Class246_Sub38.anInt5445 = -1;
						return;
					}
					if ((i_2_ ^ 0xffffffff) <= (is.length ^ 0xffffffff)) {
						short[] is_6_ = new short[is.length * 2];
						for (int i_7_ = 0; i_7_ < i_2_; i_7_++)
							is_6_[i_7_] = is[i_7_];
						is = is_6_;
					}
					is[i_2_++] = (short) i_5_;
				}
			}
			Class246_Sub38.anInt5445 = i_2_;
			Class22.anInt324 = 0;
			Class102.aShortArray1323 = is;
			String[] strings = new String[Class246_Sub38.anInt5445];
			for (int i_8_ = 0; Class246_Sub38.anInt5445 > i_8_; i_8_++)
				strings[i_8_] = Class128_Sub1.aClass65_5558.method428(is[i_8_], (byte) -99).method2431(0);
			Class246_Sub28_Sub3.method2495(0, strings, Class102.aShortArray1323);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pg.F(" + bool + ',' + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2178(int i, int i_9_, int i_10_) {
		try {
			if (i < 2)
				method2177(true, -101, null);
			anInt5073++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_9_, (byte) 119, 13);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pg.C(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	Class100_Sub1(Class106_Sub1 class106_sub1) {
		try {
			aClass106_Sub1_5077 = class106_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pg.<init>(" + (class106_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt5072 = -1;
		aBool5070 = false;
		anInt5076 = 328;
	}
}
