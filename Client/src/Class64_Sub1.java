
/* Class64_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class64_Sub1 extends Class64 {
	static int anInt5234;
	static int[] anIntArray5235 = new int[14];
	static int anInt5236 = 0;
	private int[] anIntArray5237 = new int[512];
	static int anInt5238;
	static int anInt5239;
	static boolean aBool5240 = false;
	static int anInt5241;

	public static void method2218(boolean bool) {
		do {
			try {
				anIntArray5235 = null;
				if (bool == false)
					break;
				method2218(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "sh.E(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2219(int i, byte i_0_, Class235 class235, int i_1_) {
		try {
			if (i_0_ == -82) {
				Class259_Sub2.anInt4960 = i_1_;
				Class87.aClass235_1142 = class235;
				anInt5238++;
				Class246_Sub1_Sub8_Sub1.anInt7157 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sh.D(" + i + ',' + i_0_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	final void method422(int i, float f, int i_2_, int i_3_, float f_4_, int i_5_, float f_6_, float f_7_, int i_8_, int i_9_, float[] fs) {
		try {
			anInt5234++;
			int i_10_ = (int) (-1.0F + f_6_ * (float) i_2_);
			i_10_ &= 0xff;
			int i_11_ = (int) (-1.0F + f * (float) i_3_);
			i_11_ &= 0xff;
			int i_12_ = (int) (f_4_ * (float) i_5_ - 1.0F);
			i_12_ &= 0xff;
			float f_13_ = (float) i_9_ * f_4_;
			int i_14_ = (int) f_13_;
			int i_15_ = 1 + i_14_;
			float f_16_ = (float) -i_14_ + f_13_;
			float f_17_ = 1.0F - f_16_;
			i_15_ &= i_12_;
			i_14_ &= i_12_;
			if (i_8_ != 7)
				method2220(78, -75, 13, null, 77, 94);
			float f_18_ = Class14.method150((byte) 126, f_16_);
			int i_19_ = anIntArray5237[i_14_];
			int i_20_ = anIntArray5237[i_15_];
			for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_21_++) {
				float f_22_ = (float) i_21_ * f;
				int i_23_ = (int) f_22_;
				int i_24_ = i_23_ + 1;
				float f_25_ = f_22_ - (float) i_23_;
				float f_26_ = 1.0F - f_25_;
				float f_27_ = Class14.method150((byte) 126, f_25_);
				i_24_ &= i_11_;
				i_23_ &= i_11_;
				int i_28_ = anIntArray5237[i_19_ + i_23_];
				int i_29_ = anIntArray5237[i_24_ + i_19_];
				int i_30_ = anIntArray5237[i_20_ + i_23_];
				int i_31_ = anIntArray5237[i_24_ - -i_20_];
				for (int i_32_ = 0; i_32_ < i_2_; i_32_++) {
					float f_33_ = (float) i_32_ * f_6_;
					int i_34_ = (int) f_33_;
					int i_35_ = 1 + i_34_;
					float f_36_ = f_33_ - (float) i_34_;
					float f_37_ = -f_36_ + 1.0F;
					float f_38_ = Class14.method150((byte) 126, f_36_);
					i_35_ &= i_10_;
					i_34_ &= i_10_;
					fs[i++] = (f_7_ * (Class_q.method2059(f_18_, 4449, (Class_q.method2059(f_27_, 4449, (Class_q.method2059(f_38_, 4449, (Class232_Sub1.method2328(f_37_, f_26_, -129, PacketsDecoder.method184(7, (anIntArray5237[i_28_ + i_34_])), f_17_)), (Class232_Sub1.method2328(f_36_, f_26_, -129, PacketsDecoder.method184(7, (anIntArray5237[i_28_ + i_35_])), f_17_)))), (Class_q.method2059(f_38_, 4449, (Class232_Sub1.method2328(f_37_, f_25_, -129, PacketsDecoder.method184((anIntArray5237[i_29_ + i_34_]), 7), f_17_)), (Class232_Sub1.method2328(f_36_, f_25_, i_8_ - 136, PacketsDecoder.method184(7, (anIntArray5237[i_29_ + i_35_])), f_17_)))))), (Class_q.method2059(f_27_, 4449, (Class_q.method2059(f_38_, 4449, (Class232_Sub1.method2328(f_37_, f_26_, -129, PacketsDecoder.method184((anIntArray5237[i_30_ + i_34_]), 7), f_16_)), (Class232_Sub1.method2328(f_36_, f_26_, -129, PacketsDecoder.method184((anIntArray5237[i_30_ + i_35_]), 7), f_16_)))), (Class_q.method2059(f_38_, 4449, (Class232_Sub1.method2328(f_37_, f_25_, -129, PacketsDecoder.method184(7, (anIntArray5237[i_34_ + i_31_])), f_16_)), (Class232_Sub1.method2328(f_36_, f_25_, Class93.method599(i_8_, -136), PacketsDecoder.method184((anIntArray5237[i_31_ + i_35_]), 7), f_16_)))))))));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sh.B(" + i + ',' + f + ',' + i_2_ + ',' + i_3_ + ',' + f_4_ + ',' + i_5_ + ',' + f_6_ + ',' + f_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method2220(int i, int i_39_, int i_40_, byte[] is, int i_41_, int i_42_) {
		try {
			anInt5241++;
			boolean bool = true;
			BufferStream stream = new BufferStream(is);
			int i_43_ = -1;
			for (;;) {
				int i_44_ = stream.method2362(55);
				if (i_44_ == 0)
					break;
				i_43_ += i_44_;
				int i_45_ = 0;
				boolean bool_46_ = false;
				for (;;) {
					if (bool_46_) {
						int i_47_ = stream.readSmart((byte) 80);
						if ((i_47_ ^ 0xffffffff) == -1)
							break;
						stream.readUnsignedByte(i_42_);
					} else {
						int i_48_ = stream.readSmart((byte) 77);
						if (i_48_ == 0)
							break;
						i_45_ += i_48_ - 1;
						int i_49_ = i_45_ & 0x3f;
						int i_50_ = (0xff1 & i_45_) >> 6;
						int i_51_ = stream.readUnsignedByte(i_42_) >> 2;
						int i_52_ = i_39_ + i_50_;
						int i_53_ = i_41_ + i_49_;
						if ((i_52_ ^ 0xffffffff) < -1 && (i_53_ ^ 0xffffffff) < -1 && (i_52_ ^ 0xffffffff) > (i - 1 ^ 0xffffffff) && -1 + i_40_ > i_53_) {
							Class185 class185 = Class143.aClass251_2067.method1610(i_43_, 0);
							if ((i_51_ ^ 0xffffffff) != -23 || ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool607 || ((Class185) class185).anInt2590 != 0 || ((Class185) class185).anInt2634 == 1 || ((Class185) class185).aBool2627) {
								bool_46_ = true;
								if (!class185.method1213(-95)) {
									Class148.anInt2184++;
									bool = false;
								}
							}
						}
					}
				}
			}
			if (i_42_ != 255)
				return true;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sh.G(" + i + ',' + i_39_ + ',' + i_40_ + ',' + (is != null ? "{...}" : "null") + ',' + i_41_ + ',' + i_42_ + ')'));
		}
	}

	Class64_Sub1(int i) {
		try {
			Random random = new Random((long) i);
			for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > -257; i_54_++)
				anIntArray5237[i_54_] = anIntArray5237[i_54_ + 256] = i_54_;
			for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > -257; i_55_++) {
				int i_56_ = 0xff & random.nextInt();
				int i_57_ = anIntArray5237[i_56_];
				anIntArray5237[i_56_] = anIntArray5237[256 + i_56_] = anIntArray5237[i_55_];
				anIntArray5237[i_55_] = anIntArray5237[i_55_ + 256] = i_57_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sh.<init>(" + i + ')');
		}
	}

	static final void method2221(int i) {
		try {
			Class243.writePacket(-72, Class177.aClass201_2493);
			Class76.anInt998++;
			anInt5239++;
			Class130_Sub1.stream.writeByte(255, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sh.F(" + i + ')');
		}
	}
}
