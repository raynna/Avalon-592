/* Class246_Sub28_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub34 extends Class246_Sub28 {
	private int anInt7001 = 4096;
	static int anInt7002;
	static int anInt7003;
	static int anInt7004;
	static int anInt7005;
	static IncomingPacket aClass13_7006 = new IncomingPacket(17, 0);
	static IncomingPacket aClass13_7007;
	static boolean aBool7008 = false;
	static float[] aFloatArray7009;

	public Class246_Sub28_Sub34() {
		super(1, true);
	}

	public static void method2870(int i) {
		try {
			if (i != -969029332)
				aClass13_7006 = null;
			aFloatArray7009 = null;
			aClass13_7006 = null;
			aClass13_7007 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vi.B(" + i + ')');
		}
	}

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt7005++;
				if ((i_0_ ^ 0xffffffff) == -1)
					anInt7001 = stream.readUnsignedShort((byte) -76);
				if (i == 4)
					break;
				anInt7001 = 34;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("vi.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2135(int i, int i_1_) {
		try {
			anInt7003++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_1_);
			int i_2_ = 79 % ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_3_ = this.method2133(i_1_ - 1 & Class113.anInt1594, 0, 0);
				int[] is_4_ = this.method2133(i_1_, 0, 0);
				int[] is_5_ = this.method2133(Class113.anInt1594 & i_1_ + 1, 0, 0);
				for (int i_6_ = 0; Class246_Sub37_Sub1.f_gb > i_6_; i_6_++) {
					int i_7_ = (-is_3_[i_6_] + is_5_[i_6_]) * anInt7001;
					int i_8_ = (anInt7001 * (is_4_[Class63_Sub1.anInt4719 & i_6_ + 1] + -is_4_[-1 + i_6_ & Class63_Sub1.anInt4719]));
					int i_9_ = i_8_ >> 12;
					int i_10_ = i_7_ >> 12;
					int i_11_ = i_9_ * i_9_ >> 12;
					int i_12_ = i_10_ * i_10_ >> 12;
					int i_13_ = (int) (Math.sqrt((double) ((float) (i_11_ - -i_12_ + 4096) / 4096.0F)) * 4096.0);
					int i_14_ = i_13_ != 0 ? 16777216 / i_13_ : 0;
					is[i_6_] = 4096 - i_14_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vi.E(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method2871(int i) {
		try {
			anInt7004++;
			Class246_Sub5.aClass85_3877.method543(0);
			if (i != -1846215604)
				method2870(-33);
			Class130_Sub6.aClass217_4844.method1406((byte) 100);
			Class53.aClass217_757.method1406((byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vi.C(" + i + ')');
		}
	}

	static final boolean method2872(boolean bool) {
		try {
			anInt7002++;
			if (bool != true)
				aClass13_7006 = null;
			if (Class208.aClass205_2930 == Class260_Sub2.aClass205_4297 && (Class260_Sub2.anInt4289 ^ 0xffffffff) > -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vi.A(" + bool + ')');
		}
	}

	static {
		aClass13_7007 = new IncomingPacket(15, 8);
		aFloatArray7009 = new float[4];
	}
}
