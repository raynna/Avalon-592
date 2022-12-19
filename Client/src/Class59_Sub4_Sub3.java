/* Class59_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub4_Sub3 extends Class59_Sub4 implements Class_f {
	static int anInt6938;
	static int anInt6939;
	static int anInt6940;
	private boolean aBool6941;
	static int anInt6942;
	static Class101 aClass101_6943;
	static int anInt6944;
	static int anInt6945;
	static int anInt6946;
	static int anInt6947;
	static int[] anIntArray6948 = new int[32];
	static int anInt6949;
	static int anInt6950;
	static int anInt6951;
	Class14 aClass14_6952;
	static int anInt6953;
	static int anInt6954;
	static int anInt6955;
	static int anInt6956;
	static int[] anIntArray6957;
	static int anInt6958;

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6951++;
			Class_t class_t = (((Class59_Sub4_Sub3) this).aClass14_6952.method147(((Class59_Sub4) this).anInt5186, true, class260, ((Class59_Sub4) this).anInt5184, 2048, (byte) 119, false));
			if (class_t == null)
				return null;
			Class_c class_c = class260.method1730();
			if (i > -87)
				return null;
			class_c.j(((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5188, ((Class59_Sub4) this).anInt5186);
			Class130_Sub3 class130_sub3 = null;
			if (aBool6941)
				class130_sub3 = Class18.method177(1, (byte) -95);
			do {
				if ((((Class14) ((Class59_Sub4_Sub3) this).aClass14_6952).aClass130_Sub2_214) != null) {
					Class129 class129 = ((Class14) ((Class59_Sub4_Sub3) this).aClass14_6952).aClass130_Sub2_214.method1779();
					class260.method1703(class_t, class129, class_c, (class130_sub3 != null ? (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0]) : null), 0);
					if (!client.f_ob)
						break;
				}
				class_t.method680(class_c, (class130_sub3 != null ? (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0]) : null), 0);
			} while (false);
			int i_0_ = ((Class59_Sub4) this).anInt5184 >> 7;
			int i_1_ = ((Class59_Sub4) this).anInt5186 >> 7;
			((Class59_Sub4_Sub3) this).aClass14_6952.method155(true, i_1_, 28146, class_t, i_0_, class260, i_1_, i_0_);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final Class21_Sub1 method2858(BufferStream stream, byte i) {
		try {
			if (i <= 93)
				return null;
			anInt6942++;
			return new Class21_Sub1(stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.read24BitInteger((byte) 29), stream.readUnsignedByte(255));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.K(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method405(int i, int i_2_, Class59 class59, byte i_3_, boolean bool, Class260 class260, int i_4_) {
		try {
			anInt6958++;
			if (i_3_ == -99)
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tt.L(" + i + ',' + i_2_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_3_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_4_ + ')'));
		}
	}

	public final int method24(int i) {
		try {
			int i_5_ = -31 % ((i - 39) / 41);
			anInt6946++;
			return (((Class14) ((Class59_Sub4_Sub3) this).aClass14_6952).anInt204);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.G(" + i + ')');
		}
	}

	public final void method19(Class260 class260, int i) {
		try {
			if (i != -12694)
				anIntArray6948 = null;
			anInt6947++;
			((Class59_Sub4_Sub3) this).aClass14_6952.method151(i ^ ~0x43195, class260);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method409(int i, int i_6_, Class260 class260, int i_7_) {
		try {
			anInt6939++;
			if (i_6_ != 0)
				return false;
			Class_t class_t = (((Class59_Sub4_Sub3) this).aClass14_6952.method147(((Class59_Sub4) this).anInt5186, false, class260, ((Class59_Sub4) this).anInt5184, 131072, (byte) 118, false));
			if (class_t == null)
				return false;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5188, ((Class59_Sub4) this).anInt5186);
			return class_t.method685(i_7_, i, class_c, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tt.A(" + i + ',' + i_6_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		try {
			((Class59_Sub4_Sub3) this).aClass14_6952.method157(bool, class260);
			anInt6955++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tt.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				((Class59_Sub4_Sub3) this).aClass14_6952 = null;
			anInt6956++;
			return (((Class14) ((Class59_Sub4_Sub3) this).aClass14_6952).anInt222);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.F(" + bool + ')');
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_8_) {
		try {
			int i_9_ = 42 % ((i_8_ - 54) / 56);
			anInt6944++;
			return ((Class59_Sub4_Sub3) this).aClass14_6952.method147(0, false, class260, 0, i, (byte) 119, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tt.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')'));
		}
	}

	Class59_Sub4_Sub3(Class260 class260, Class185 class185, int i, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, int i_14_, int i_15_, int i_16_) {
		super(i_11_, i_12_, i_13_, Class246_Sub1_Sub17.method2762(false, i_14_, i_15_));
		try {
			((Class59_Sub4_Sub3) this).aClass14_6952 = new Class14(class260, class185, i_14_, i_15_, i, i_10_, ((Class59_Sub4) this).anInt5184, ((Class59_Sub4) this).anInt5186, bool, i_16_);
			aBool6941 = ((Class185) class185).anInt2590 != 0 && !bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tt.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + bool + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	final void method401(int i) {
		try {
			int i_17_ = -9 / ((i - 57) / 44);
			anInt6949++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.J(" + i + ')');
		}
	}

	public static void method2859(byte i) {
		try {
			aClass101_6943 = null;
			anIntArray6957 = null;
			int i_18_ = 62 % ((i + 76) / 49);
			anIntArray6948 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.C(" + i + ')');
		}
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt6954++;
				if (i < 53)
					method401(-52);
				Class_t class_t = (((Class59_Sub4_Sub3) this).aClass14_6952.method147(((Class59_Sub4) this).anInt5186, true, class260, ((Class59_Sub4) this).anInt5184, 262144, (byte) 126, true));
				if (class_t == null)
					break;
				int i_19_ = ((Class59_Sub4) this).anInt5184 >> 7;
				int i_20_ = ((Class59_Sub4) this).anInt5186 >> 7;
				((Class59_Sub4_Sub3) this).aClass14_6952.method155(false, i_20_, 28146, class_t, i_19_, class260, i_20_, i_19_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("tt.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final void method9(int i) {
		try {
			if (i >= -18)
				method401(53);
			anInt6940++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.I(" + i + ')');
		}
	}

	public final int method18(byte i) {
		try {
			anInt6945++;
			if (i != -70)
				anIntArray6948 = null;
			return (((Class14) ((Class59_Sub4_Sub3) this).aClass14_6952).anInt226);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.M(" + i + ')');
		}
	}

	public final boolean method22(int i) {
		try {
			anInt6950++;
			if (i != 10869)
				method2858(null, (byte) -105);
			return ((Class59_Sub4_Sub3) this).aClass14_6952.method153(i - 10870);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.V(" + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			anInt6938++;
			if (i < 104)
				aClass101_6943 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tt.E(" + i + ')');
		}
	}

	static {
		aClass101_6943 = null;
	}
}
