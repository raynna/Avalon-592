/* Class246_Sub28_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class246_Sub28_Sub5 extends Class246_Sub28 {
	static Class121[] aClass121Array5996;
	int anInt5997;
	static int anInt5998;
	static int anInt5999;
	static int anInt6000;
	static int anInt6001;
	static int anInt6002;
	static int anInt6003;
	private int anInt6004 = -1;
	int anInt6005;
	static int anInt6006 = 0;
	int[] anIntArray6007;

	int[][] method2139(byte i, int i_0_) {
		try {
			anInt6003++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -103, i_0_);
			if (i < 33)
				return null;
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946 && method2544(-1121128860)) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				int i_4_ = (((Class141.anInt2044 != ((Class246_Sub28_Sub5) this).anInt6005) ? (((Class246_Sub28_Sub5) this).anInt6005 * i_0_ / Class141.anInt2044) : i_0_) * ((Class246_Sub28_Sub5) this).anInt5997);
				if ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) != (((Class246_Sub28_Sub5) this).anInt5997 ^ 0xffffffff)) {
					for (int i_5_ = 0; Class246_Sub37_Sub1.f_gb > i_5_; i_5_++) {
						int i_6_ = (i_5_ * ((Class246_Sub28_Sub5) this).anInt5997 / Class246_Sub37_Sub1.f_gb);
						int i_7_ = (((Class246_Sub28_Sub5) this).anIntArray6007[i_4_ - -i_6_]);
						is_3_[i_5_] = PacketsDecoder.method184(255, i_7_) << 4;
						is_2_[i_5_] = PacketsDecoder.method184(i_7_, 65280) >> 4;
						is_1_[i_5_] = PacketsDecoder.method184(i_7_, 16711680) >> 12;
					}
				} else {
					for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_8_++) {
						int i_9_ = (((Class246_Sub28_Sub5) this).anIntArray6007[i_4_++]);
						is_3_[i_8_] = PacketsDecoder.method184(4080, i_9_ << 4);
						is_2_[i_8_] = PacketsDecoder.method184(4080, i_9_ >> 4);
						is_1_[i_8_] = PacketsDecoder.method184(4080, i_9_ >> 12);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "el.J(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2542(int i) {
		do {
			try {
				aClass121Array5996 = null;
				if (i == -5669)
					break;
				anInt6006 = -77;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "el.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2543(boolean bool) {
		try {
			if (bool != false)
				method2543(false);
			synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
				Class246_Sub1_Sub6_Sub2.aClass54_7109.method369(bool);
			}
			anInt6000++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "el.B(" + bool + ')');
		}
	}

	final int method2136(int i) {
		try {
			if (i != -1)
				return 29;
			anInt5999++;
			return anInt6004;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "el.M(" + i + ')');
		}
	}

	public Class246_Sub28_Sub5() {
		super(0, false);
	}

	final void method2142(int i) {
		try {
			super.method2142(121);
			anInt6001++;
			if (i <= 120)
				method2139((byte) -62, 110);
			((Class246_Sub28_Sub5) this).anIntArray6007 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "el.O(" + i + ')');
		}
	}

	final boolean method2544(int i) {
		try {
			anInt5998++;
			if (((Class246_Sub28_Sub5) this).anIntArray6007 != null)
				return true;
			if (i != -1121128860)
				return false;
			if (anInt6004 >= 0) {
				Class10 class10 = ((Class59_Sub3_Sub3.anInt6285 ^ 0xffffffff) <= -1 ? Class10.method120(Class19.aClass_fs308, Class59_Sub3_Sub3.anInt6285, anInt6004) : Class10.method130(Class19.aClass_fs308, anInt6004));
				class10.method124();
				((Class246_Sub28_Sub5) this).anIntArray6007 = class10.method121();
				((Class246_Sub28_Sub5) this).anInt6005 = ((Class10) class10).anInt155;
				((Class246_Sub28_Sub5) this).anInt5997 = ((Class10) class10).anInt156;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "el.C(" + i + ')');
		}
	}

	final void method2143(int i, int i_10_, BufferStream stream) {
		do {
			try {
				anInt6002++;
				if (i_10_ == 0)
					anInt6004 = stream.readUnsignedShort((byte) -92);
				if (i == 4)
					break;
				method2136(-108);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("el.G(" + i + ',' + i_10_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
