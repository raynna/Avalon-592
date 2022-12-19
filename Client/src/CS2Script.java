import java.util.ArrayList;
import java.util.List;

/* Class246_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CS2Script extends Class246_Sub1 {
	int[] opcodes;
	static client aclient5668;
	int integerArgumentCount;
	int[] integerOperands;
	int integerVariableCount;
	String[] stringOperands;
	int stringVariableCount;
	static int anInt5674;
	int stringArgumentCount;
	static int anInt5676;
	String name;
	static int anInt5678;
	Class85[] switchBlocks;
	static int anInt5680;
	Class169 aClass169_5681;
	static int anInt5682;

	public List<Integer> getLinkedInterfaces() {
		List<Integer> linkedInterfaces = new ArrayList<Integer>();
		for (int i = 0; i < integerOperands.length; i++) {
			int interfaceId = integerOperands[i] >> 16;
			if (interfaceId <= 0 || linkedInterfaces.contains(interfaceId))
				continue;
			linkedInterfaces.add(interfaceId);
		}
		return linkedInterfaces;
	}

	static final Class_t method2415(int i, int i_0_, Class_t class_t, int i_1_, int i_2_, int i_3_, Class260 class260, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, Class124 class124, int i_9_) {
		try {
			anInt5680++;
			if (class_t == null)
				return null;
			int i_10_ = 2055;
			if (class124 != null) {
				i_10_ |= class124.method847(i_8_, 256, -1, false);
				i_10_ &= ~0x200;
			}
			long l = (((long) i_3_ << 48) + (long) ((i_9_ << 24) + (i_6_ - -(i_4_ << 16))) + ((long) i_1_ << 32));
			Class_t class_t_11_;
			synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
				class_t_11_ = (Class_t) Class246_Sub1_Sub6_Sub2.aClass54_7109.method379(l, (byte) 58);
			}
			if (i_5_ < 98)
				return null;
			if (class_t_11_ == null || ((class260.method1710(class_t_11_.P(), i_10_) ^ 0xffffffff) != -1)) {
				if (class_t_11_ != null)
					i_10_ = class260.method1723(i_10_, class_t_11_.P());
				int i_12_;
				if (i_6_ != 1) {
					if ((i_6_ ^ 0xffffffff) == -3)
						i_12_ = 12;
					else if ((i_6_ ^ 0xffffffff) != -4) {
						if ((i_6_ ^ 0xffffffff) != -5)
							i_12_ = 21;
						else
							i_12_ = 18;
					} else
						i_12_ = 15;
				} else
					i_12_ = 9;
				int i_13_ = 3;
				int[] is = { 64, 96, 128 };
				Class103 class103 = new Class103(1 - -(i_13_ * i_12_), -i_12_ + 2 * (i_12_ * i_13_), 0);
				int i_14_ = class103.method647(0, 0, 0, 0);
				int[][] is_15_ = new int[i_13_][i_12_];
				for (int i_16_ = 0; (i_13_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
					int i_17_ = is[i_16_];
					int i_18_ = is[i_16_];
					for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
						int i_20_ = (i_19_ << 14) / i_12_;
						int i_21_ = i_17_ * Class39_Sub1.f_fb[i_20_] >> 15;
						int i_22_ = Class39_Sub1.anIntArray4672[i_20_] * i_18_ >> 15;
						is_15_[i_16_][i_19_] = class103.method647(i_22_, 0, i_21_, 0);
					}
				}
				for (int i_23_ = 0; i_13_ > i_23_; i_23_++) {
					int i_24_ = (i_23_ * 256 + 128) / i_13_;
					int i_25_ = -i_24_ + 256;
					byte i_26_ = (byte) (i_9_ * i_24_ + i_25_ * i_4_ >> 8);
					short i_27_ = (short) (((i_24_ * (0x7f & i_3_) + i_25_ * (0x7f & i_1_) & 0x7f00) + (((i_24_ * (i_3_ & 0xfc00) + (0xfc00 & i_1_) * i_25_) & 0xfc0000) + (((0x380 & i_1_) * i_25_ + i_24_ * (0x380 & i_3_)) & 0x38000))) >> 8);
					for (int i_28_ = 0; (i_12_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
						if ((i_23_ ^ 0xffffffff) != -1) {
							class103.method654((is_15_[i_23_][(i_28_ + 1) % i_12_]), (short) -1, (byte) -1, is_15_[-1 + i_23_][i_28_], -126, (is_15_[-1 + i_23_][(i_28_ + 1) % i_12_]), i_27_, (byte) 1, i_26_);
							class103.method654(is_15_[i_23_][i_28_], (short) -1, (byte) -1, is_15_[-1 + i_23_][i_28_], -120, (is_15_[i_23_][(i_28_ + 1) % i_12_]), i_27_, (byte) 1, i_26_);
						} else
							class103.method654(is_15_[0][i_28_], (short) -1, (byte) -1, i_14_, -124, is_15_[0][(1 + i_28_) % i_12_], i_27_, (byte) 1, i_26_);
					}
				}
				class_t_11_ = class260.method1695(class103, i_10_, Class109.anInt1569, 64, 768);
				synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
					Class246_Sub1_Sub6_Sub2.aClass54_7109.method371(1, l, class_t_11_);
				}
			}
			int i_29_ = (i_6_ << 6) - 1;
			int i_30_ = -i_29_;
			int i_31_ = -i_29_;
			int i_32_ = i_29_;
			int i_33_ = i_29_;
			if (bool) {
				if ((i_7_ ^ 0xffffffff) < -1025 && (i_7_ ^ 0xffffffff) > -7169)
					i_30_ -= 128;
				if (i_7_ > 13312 || (i_7_ ^ 0xffffffff) > -3073)
					i_31_ -= 128;
				if (i_7_ > 9216 && i_7_ < 15360)
					i_32_ += 128;
				if ((i_7_ ^ 0xffffffff) < -5121 && (i_7_ ^ 0xffffffff) > -11265)
					i_33_ += 128;
			}
			int i_34_ = class_t.HA();
			int i_35_ = class_t.NA();
			int i_36_ = class_t.PA();
			if ((i_31_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff))
				i_36_ = i_31_;
			if ((i_35_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
				i_35_ = i_32_;
			if ((i_30_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff))
				i_34_ = i_30_;
			int i_37_ = class_t.m();
			if (i_37_ > i_33_)
				i_37_ = i_33_;
			Class246_Sub1_Sub17 class246_sub1_sub17 = null;
			if (class124 != null) {
				i_8_ = ((Class124) class124).anIntArray1724[i_8_];
				class246_sub1_sub17 = Class59_Sub3_Sub3.aClass45_6275.method298(i_8_ >> 16, 1);
				i_8_ &= 0xffff;
			}
			if (class246_sub1_sub17 == null) {
				class_t_11_ = class_t_11_.method678((byte) 3, i_10_, true);
				class_t_11_.H(-i_34_ + i_35_ >> 1, 128, i_37_ + -i_36_ >> 1);
				class_t_11_.JA(i_35_ + i_34_ >> 1, 0, i_37_ + i_36_ >> 1);
			} else {
				class_t_11_ = class_t_11_.method678((byte) 3, i_10_, true);
				class_t_11_.H(i_35_ - i_34_ >> 1, 128, -i_36_ + i_37_ >> 1);
				class_t_11_.JA(i_34_ - -i_35_ >> 1, 0, i_37_ + i_36_ >> 1);
				class_t_11_.method683(-5561, i_8_, class246_sub1_sub17);
			}
			if ((i_0_ ^ 0xffffffff) != -1)
				class_t_11_.Z(i_0_);
			if (i != 0)
				class_t_11_.R(i);
			if (i_2_ != 0)
				class_t_11_.JA(0, i_2_, 0);
			return class_t_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ae.B(" + i + ',' + i_0_ + ',' + (class_t != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + (class124 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
		}
	}

	static final int method2416(byte i, Class199 class199, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int[] is, int i_44_, boolean bool, int[] is_45_, int i_46_, int i_47_, int i_48_) {
		try {
			anInt5676++;
			for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -129; i_49_++) {
				for (int i_50_ = 0; i_50_ < 128; i_50_++) {
					Class85.anIntArrayArray1119[i_49_][i_50_] = 0;
					Class7.anIntArrayArray94[i_49_][i_50_] = 99999999;
				}
			}
			boolean bool_51_;
			if (i_42_ != 1) {
				if (i_42_ != 2)
					bool_51_ = Class246_Sub28_Sub21.method2706(-1, i_39_, i_47_, i_43_, i_38_, class199, i_41_, i_46_, i_40_, i_42_, i_44_, i_48_);
				else
					bool_51_ = Class246_Sub4.method1810((byte) -117, i_48_, class199, i_43_, i_40_, i_47_, i_38_, i_41_, i_46_, i_39_, i_44_);
			} else
				bool_51_ = Class_l_Sub2.method2302(i_40_, i_43_, i_48_, -1, i_39_, class199, i_41_, i_44_, i_47_, i_46_, i_38_);
			int i_52_ = -64 + i_38_;
			int i_53_ = i_46_ - 64;
			int i_54_ = Class246_Sub28_Sub32.anInt6925;
			int i_55_ = Class55.anInt785;
			if (!bool_51_) {
				if (!bool)
					return -1;
				int i_56_ = 2147483647;
				int i_57_ = 2147483647;
				int i_58_ = 10;
				for (int i_59_ = i_39_ + -i_58_; i_39_ - -i_58_ >= i_59_; i_59_++) {
					for (int i_60_ = i_41_ - i_58_; (i_60_ ^ 0xffffffff) >= (i_58_ + i_41_ ^ 0xffffffff); i_60_++) {
						int i_61_ = i_59_ + -i_52_;
						int i_62_ = -i_53_ + i_60_;
						if ((i_61_ ^ 0xffffffff) <= -1 && (i_62_ ^ 0xffffffff) <= -1 && (i_61_ ^ 0xffffffff) > -129 && (i_62_ ^ 0xffffffff) > -129 && Class7.anIntArrayArray94[i_61_][i_62_] < 100) {
							int i_63_ = 0;
							if (i_59_ < i_39_)
								i_63_ = i_39_ - i_59_;
							else if ((i_59_ ^ 0xffffffff) < (-1 + i_40_ + i_39_ ^ 0xffffffff))
								i_63_ = i_59_ + 1 + -i_39_ + -i_40_;
							int i_64_ = 0;
							if ((i_41_ ^ 0xffffffff) >= (i_60_ ^ 0xffffffff)) {
								if (i_60_ > i_41_ + (i_47_ - 1))
									i_64_ = 1 - (i_41_ - -i_47_ - i_60_);
							} else
								i_64_ = -i_60_ + i_41_;
							int i_65_ = i_63_ * i_63_ - -(i_64_ * i_64_);
							if ((i_56_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff) || ((i_65_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && i_57_ > (Class7.anIntArrayArray94[i_61_][i_62_]))) {
								i_57_ = Class7.anIntArrayArray94[i_61_][i_62_];
								i_54_ = i_59_;
								i_56_ = i_65_;
								i_55_ = i_60_;
							}
						}
					}
				}
				if ((i_56_ ^ 0xffffffff) == -2147483648)
					return -1;
			}
			if (i_38_ == i_54_ && i_55_ == i_46_)
				return 0;
			int i_66_ = 0;
			Class246_Sub28_Sub9.anIntArray6148[i_66_] = i_54_;
			Class246_Sub39.anIntArray5489[i_66_++] = i_55_;
			if (i > -44)
				method2418(-79, 34);
			int i_68_;
			int i_67_ = i_68_ = (Class85.anIntArrayArray1119[i_54_ - i_52_][-i_53_ + i_55_]);
			while (i_38_ != i_54_ || (i_46_ ^ 0xffffffff) != (i_55_ ^ 0xffffffff)) {
				if (i_67_ != i_68_) {
					i_68_ = i_67_;
					Class246_Sub28_Sub9.anIntArray6148[i_66_] = i_54_;
					Class246_Sub39.anIntArray5489[i_66_++] = i_55_;
				}
				if ((i_67_ & 0x1 ^ 0xffffffff) != -1)
					i_55_++;
				else if ((i_67_ & 0x4) != 0)
					i_55_--;
				if ((0x2 & i_67_ ^ 0xffffffff) == -1) {
					if ((i_67_ & 0x8) != 0)
						i_54_--;
				} else
					i_54_++;
				i_67_ = (Class85.anIntArrayArray1119[i_54_ + -i_52_][-i_53_ + i_55_]);
			}
			int i_69_ = 0;
			while (i_66_-- > 0) {
				is_45_[i_69_] = Class246_Sub28_Sub9.anIntArray6148[i_66_];
				is[i_69_++] = Class246_Sub39.anIntArray5489[i_66_];
				if (i_69_ >= is_45_.length)
					break;
			}
			return i_69_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ae.A(" + i + ',' + (class199 != null ? "{...}" : "null") + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + (is != null ? "{...}" : "null") + ',' + i_44_ + ',' + bool + ',' + (is_45_ != null ? "{...}" : "null") + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	public static void method2417(byte i) {
		try {
			int i_70_ = 25 / ((i + 49) / 57);
			aclient5668 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ae.D(" + i + ')');
		}
	}

	static final void method2418(int i, int i_71_) {
		try {
			anInt5678++;
			Class_q_Sub1.anInt6666 = i;
			if (i_71_ != 268)
				aclient5668 = null;
			Class_ls.aClass54_963.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ae.C(" + i + ',' + i_71_ + ')');
		}
	}

	public CS2Script() {
		/* empty */
	}

	static {
		new Class67("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
		anInt5674 = -1;
	}
}
