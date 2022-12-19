/* Class246_Sub28_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub2 extends Class246_Sub28 {
	static int anInt5795;
	static int anInt5796;
	private int anInt5797 = 0;
	static int anInt5798;
	private int[] anIntArray5799;
	private int[][] anIntArrayArray5800;
	static int anInt5801;
	private int[] anIntArray5802;
	static int anInt5803;
	static int anInt5804;
	static int anInt5805;
	static int anInt5806;
	static int[] anIntArray5807 = new int[32];
	private short[] aShortArray5808 = new short[257];
	static Class166 aClass166_5809;

	static final boolean method2457(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = 39 % ((i_0_ + 46) / 51);
			anInt5796++;
			if ((0x20 & i_1_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bt.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int[] method2135(int i, int i_3_) {
		try {
			anInt5801++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_3_);
			int i_4_ = 96 / ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_5_ = this.method2133(i_3_, 0, 0);
				for (int i_6_ = 0; Class246_Sub37_Sub1.f_gb > i_6_; i_6_++) {
					int i_7_ = is_5_[i_6_] >> 4;
					if ((i_7_ ^ 0xffffffff) > -1)
						i_7_ = 0;
					if ((i_7_ ^ 0xffffffff) < -257)
						i_7_ = 256;
					is[i_6_] = aShortArray5808[i_7_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bt.E(" + i + ',' + i_3_ + ')');
		}
	}

	public static void method2458(int i) {
		try {
			anIntArray5807 = null;
			if (i != 0)
				anIntArray5807 = null;
			aClass166_5809 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bt.B(" + i + ')');
		}
	}

	private final void method2459(int i) {
		do {
			try {
				anInt5803++;
				int i_8_ = anInt5797;
				while_116_: do {
					do {
						if ((i_8_ ^ 0xffffffff) != -3) {
							if (i_8_ != 1)
								break;
						} else {
							for (i_8_ = 0; (i_8_ ^ 0xffffffff) > -258; i_8_++) {
								int i_9_ = i_8_ << 4;
								int i_10_;
								for (i_10_ = 1; ((anIntArrayArray5800.length - 1 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
									if ((anIntArrayArray5800[i_10_][0] ^ 0xffffffff) < (i_9_ ^ 0xffffffff))
										break;
								}
								int[] is = anIntArrayArray5800[-1 + i_10_];
								int[] is_11_ = anIntArrayArray5800[i_10_];
								int i_12_ = method2461(i_10_ - 2, -90)[1];
								int i_13_ = is[1];
								int i_14_ = is_11_[1];
								int i_15_ = method2461(1 + i_10_, -107)[1];
								int i_16_ = ((-is[0] + i_9_ << 12) / (-is[0] + is_11_[0]));
								int i_17_ = i_16_ * i_16_ >> 12;
								int i_18_ = i_13_ + -i_12_ + -i_14_ + i_15_;
								int i_19_ = -i_18_ + i_12_ - i_13_;
								int i_20_ = i_14_ - i_12_;
								int i_21_ = i_13_;
								int i_22_ = (i_18_ * i_16_ >> 12) * i_17_ >> 12;
								int i_23_ = i_19_ * i_17_ >> 12;
								int i_24_ = i_16_ * i_20_ >> 12;
								int i_25_ = i_21_ + i_24_ + (i_22_ - -i_23_);
								if (i_25_ <= -32768)
									i_25_ = -32767;
								if ((i_25_ ^ 0xffffffff) <= -32769)
									i_25_ = 32767;
								aShortArray5808[i_8_] = (short) i_25_;
							}
							break while_116_;
						}
						for (i_8_ = 0; (i_8_ ^ 0xffffffff) > -258; i_8_++) {
							int i_26_ = i_8_ << 4;
							int i_27_;
							for (i_27_ = 1; i_27_ < -1 + anIntArrayArray5800.length; i_27_++) {
								if ((i_26_ ^ 0xffffffff) > (anIntArrayArray5800[i_27_][0] ^ 0xffffffff))
									break;
							}
							int[] is = anIntArrayArray5800[-1 + i_27_];
							int[] is_28_ = anIntArrayArray5800[i_27_];
							int i_29_ = ((-is[0] + i_26_ << 12) / (-is[0] + is_28_[0]));
							int i_30_ = (-(Class246_Sub1_Sub18.anIntArray6855[(i_29_ & 0x1ff5) >> 5]) + 4096 >> 1);
							int i_31_ = 4096 - i_30_;
							int i_32_ = i_30_ * is_28_[1] + i_31_ * is[1] >> 12;
							if (i_32_ <= -32768)
								i_32_ = -32767;
							if (i_32_ >= 32768)
								i_32_ = 32767;
							aShortArray5808[i_8_] = (short) i_32_;
						}
						break while_116_;
					} while (false);
					for (i_8_ = 0; i_8_ < 257; i_8_++) {
						int i_33_ = i_8_ << 4;
						int i_34_;
						for (i_34_ = 1; ((i_34_ ^ 0xffffffff) > (-1 + anIntArrayArray5800.length ^ 0xffffffff)); i_34_++) {
							if ((i_33_ ^ 0xffffffff) > (anIntArrayArray5800[i_34_][0] ^ 0xffffffff))
								break;
						}
						int[] is = anIntArrayArray5800[i_34_ - 1];
						int[] is_35_ = anIntArrayArray5800[i_34_];
						int i_36_ = (i_33_ - is[0] << 12) / (is_35_[0] - is[0]);
						int i_37_ = 4096 - i_36_;
						int i_38_ = is_35_[1] * i_36_ + i_37_ * is[1] >> 12;
						if (i_38_ <= -32768)
							i_38_ = -32767;
						if (i_38_ >= 32768)
							i_38_ = 32767;
						aShortArray5808[i_8_] = (short) i_38_;
					}
				} while (false);
				if (i == 29335)
					break;
				method2461(67, -5);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bt.H(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2460(int i) {
		try {
			anInt5806++;
			int[] is = anIntArrayArray5800[0];
			int[] is_39_ = anIntArrayArray5800[1];
			int[] is_40_ = anIntArrayArray5800[-2 + anIntArrayArray5800.length];
			if (i != -17633)
				method2458(52);
			int[] is_41_ = anIntArrayArray5800[-1 + anIntArrayArray5800.length];
			anIntArray5802 = new int[] { is_40_[0] + (-is_41_[0] + is_40_[0]), -is_41_[1] - -is_40_[1] + is_40_[1] };
			anIntArray5799 = new int[] { is[0] - (is_39_[0] - is[0]), is[1] + (-is_39_[1] + is[1]) };
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bt.D(" + i + ')');
		}
	}

	private final int[] method2461(int i, int i_42_) {
		try {
			anInt5805++;
			if ((i ^ 0xffffffff) > -1)
				return anIntArray5799;
			if (anIntArrayArray5800.length <= i)
				return anIntArray5802;
			int i_43_ = -125 % ((-42 - i_42_) / 34);
			return anIntArrayArray5800[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bt.A(" + i + ',' + i_42_ + ')');
		}
	}

	final void method2143(int i, int i_44_, BufferStream stream) {
		do {
			try {
				anInt5804++;
				if ((i_44_ ^ 0xffffffff) == -1) {
					anInt5797 = stream.readUnsignedByte(255);
					anIntArrayArray5800 = new int[stream.readUnsignedByte(i ^ 0xfb)][2];
					for (int i_45_ = 0; i_45_ < anIntArrayArray5800.length; i_45_++) {
						anIntArrayArray5800[i_45_][0] = stream.readUnsignedShort((byte) 123);
						anIntArrayArray5800[i_45_][1] = stream.readUnsignedShort((byte) 96);
					}
				}
				if (i == 4)
					break;
				method2461(-14, -64);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bt.G(" + i + ',' + i_44_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2134(boolean bool) {
		do {
			try {
				if (anIntArrayArray5800 == null)
					anIntArrayArray5800 = new int[][] { new int[2], { 4096, 4096 } };
				anInt5795++;
				if ((anIntArrayArray5800.length ^ 0xffffffff) > -3)
					throw new RuntimeException("Curve operation requires at least two markers");
				if (anInt5797 == 2)
					method2460(-17633);
				HashMap.method376(true);
				method2459(29335);
				if (bool == false)
					break;
				anIntArrayArray5800 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bt.F(" + bool + ')');
			}
			break;
		} while (false);
	}

	public Class246_Sub28_Sub2() {
		super(1, true);
	}

	static {
		new Class67("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		aClass166_5809 = new Class166();
	}
}
