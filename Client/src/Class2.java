/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	private int anInt5;
	private int anInt6;
	private boolean aBool7;
	int anInt8;
	private int anInt9;
	private static Class_l aClass_l10;
	private int anInt11;
	private int anInt12;
	private static Class_t aClass_t13;
	private static int[] anIntArray14 = new int[4];
	private int anInt15;
	private int anInt16;
	private int anInt17;
	private static Class_l aClass_l18;
	private int anInt19;
	private int anInt20;
	private int anInt21;
	private Class_l aClass_l22;

	private static final void method38(Class260 class260) {
		if (aClass_t13 == null) {
			Class103 class103 = new Class103(580, 1104, 1);
			class103.method649((byte) 0, (short) 1024, (byte) 0, (short) 0, 25543, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 32767);
			class103.method647(0, 128, 0, 0);
			class103.method647(0, -128, 0, 0);
			for (int i = 0; i <= 24; i++) {
				int i_0_ = i * 8192 / 24;
				int i_1_ = Class39_Sub1.f_fb[i_0_];
				int i_2_ = Class39_Sub1.anIntArray4672[i_0_];
				for (int i_3_ = 1; i_3_ < 24; i_3_++) {
					int i_4_ = i_3_ * 8192 / 24;
					int i_5_ = Class39_Sub1.anIntArray4672[i_4_] >> 8;
					int i_6_ = Class39_Sub1.f_fb[i_4_] * i_1_ >> 23;
					int i_7_ = Class39_Sub1.f_fb[i_4_] * i_2_ >> 23;
					class103.method647(-i_6_, i_5_, i_7_, 0);
				}
				if (i > 0) {
					int i_8_ = i * 23 + 2;
					int i_9_ = i_8_ - 23;
					class103.method654(i_8_, (short) 0, (byte) 0, 0, -128, i_9_, (short) 127, (byte) 0, (byte) 0);
					for (int i_10_ = 1; i_10_ < 23; i_10_++) {
						int i_11_ = i_9_ + 1;
						int i_12_ = i_8_ + 1;
						class103.method654(i_8_, (short) 0, (byte) 0, i_9_, -126, i_11_, (short) 127, (byte) 0, (byte) 0);
						class103.method654(i_8_, (short) 0, (byte) 0, i_11_, -119, i_12_, (short) 127, (byte) 0, (byte) 0);
						i_9_ = i_11_;
						i_8_ = i_12_;
					}
					class103.method654(1, (short) 0, (byte) 0, i_8_, -126, i_9_, (short) 127, (byte) 0, (byte) 0);
				}
			}
			((Class103) class103).anInt1354 = ((Class103) class103).anInt1331;
			((Class103) class103).anIntArray1347 = null;
			((Class103) class103).anIntArray1361 = null;
			((Class103) class103).aByteArray1332 = null;
			aClass_t13 = class260.method1695(class103, 51200, 33, 64, 768);
		}
	}

	private final void method39(Class260 class260, Class2 class2_13_) {
		Class103 class103 = Class206.method1349(0, Class246_Sub28_Sub12.aClass_fs6195, (byte) 89, anInt5);
		if (class103 != null) {
			class260.da(anIntArray14);
			class260.OA(0, 0, anInt15, anInt15);
			class260.O(0, 0, anInt15, anInt15, 0, 0);
			int i = 0;
			int i_14_ = 0;
			int i_15_ = 256;
			if (class2_13_ != null) {
				if (class2_13_.aBool7) {
					i = -class2_13_.anInt20;
					i_14_ = -class2_13_.anInt9;
					i_15_ = -class2_13_.anInt17;
				} else {
					i = anInt20 - class2_13_.anInt20;
					i_14_ = anInt9 - class2_13_.anInt9;
					i_15_ = anInt17 - class2_13_.anInt17;
				}
			}
			if (anInt6 != 0) {
				int i_16_ = -anInt6 & 0x3fff;
				int i_17_ = Class39_Sub1.f_fb[i_16_];
				int i_18_ = Class39_Sub1.anIntArray4672[i_16_];
				int i_19_ = i_14_ * i_18_ - i_15_ * i_17_ >> 15;
				i_15_ = i_14_ * i_17_ + i_15_ * i_18_ >> 15;
				i_14_ = i_19_;
			}
			if (anInt16 != 0) {
				int i_20_ = -anInt16 & 0x3fff;
				int i_21_ = Class39_Sub1.f_fb[i_20_];
				int i_22_ = Class39_Sub1.anIntArray4672[i_20_];
				int i_23_ = i_15_ * i_21_ + i * i_22_ >> 15;
				i_15_ = i_15_ * i_22_ - i * i_21_ >> 15;
				i = i_23_;
			}
			class260.B(1.0F);
			class260.T(16777215, 1.0F, 1.0F, (float) i, (float) i_14_, (float) i_15_);
			Class_t class_t = class260.method1695(class103, 2048, 0, 64, 768);
			int i_24_ = class_t.NA() - class_t.HA();
			int i_25_ = class_t.WA() - class_t.MA();
			int i_26_ = class_t.HA() + i_24_ / 2;
			int i_27_ = class_t.MA() + i_25_ / 2;
			int i_28_ = i_24_ > i_25_ ? i_24_ : i_25_;
			class260.H(i_26_, i_27_, i_28_, i_28_);
			class260.ea(class260.method1715());
			Class_c class_c = class260.method1730();
			class_c.j(0, 0, class260.a() - class_t.PA());
			class_t.method671(class_c, null, class260.a(), 1);
			aClass_l22 = class260.method1721(0, 0, anInt15, anInt15, true);
			aClass_l22.BA(0, 0, 3);
			class260.OA(anIntArray14[0], anIntArray14[1], anIntArray14[2], anIntArray14[3]);
		}
	}

	final void method40() {
		aClass_l22 = null;
	}

	private final boolean method41(Class260 class260, Class2 class2_29_) {
		if (aClass_l22 == null) {
			if (anInt11 == 0) {
				if (Class246_Sub28_Sub33.anInterface6_6967.method13(anInt5, 19378)) {
					int[] is = (Class246_Sub28_Sub33.anInterface6_6967.method16(false, anInt5, false, 0.7F, anInt15, anInt15));
					aClass_l22 = class260.method1706(is, 0, anInt15, anInt15, anInt15);
				}
			} else if (anInt11 == 2)
				method39(class260, class2_29_);
			else if (anInt11 == 1)
				method45(class260, class2_29_);
		}
		if (aClass_l22 == null)
			return false;
		return true;
	}

	final boolean method42(int i, int i_30_, int i_31_, int i_32_) {
		int i_33_;
		int i_34_;
		int i_35_;
		if (!aBool7) {
			i_33_ = anInt20 - i;
			i_34_ = anInt9 - i_30_;
			i_35_ = anInt17 - i_31_;
			((Class2) this).anInt8 = (int) Math.sqrt((double) (i_33_ * i_33_ + i_34_ * i_34_ + i_35_ * i_35_));
			if (((Class2) this).anInt8 == 0)
				((Class2) this).anInt8 = 1;
			i_33_ = (i_33_ << 8) / ((Class2) this).anInt8;
			i_34_ = (i_34_ << 8) / ((Class2) this).anInt8;
			i_35_ = (i_35_ << 8) / ((Class2) this).anInt8;
		} else {
			((Class2) this).anInt8 = 1073741823;
			i_33_ = anInt20;
			i_34_ = anInt9;
			i_35_ = anInt17;
		}
		int i_36_ = (int) (Math.sqrt((double) (i_33_ * i_33_ + i_34_ * i_34_ + i_35_ * i_35_)) * 256.0);
		if (i_36_ > 128) {
			i_33_ = (i_33_ << 16) / i_36_;
			i_34_ = (i_34_ << 16) / i_36_;
			i_35_ = (i_35_ << 16) / i_36_;
			anInt12 = anInt21 * i_32_ / (aBool7 ? 1024 : ((Class2) this).anInt8);
		} else
			anInt12 = 0;
		if (anInt12 < 8) {
			aClass_l22 = null;
			return false;
		}
		int i_37_ = Class206.method1350(anInt12, 269173057);
		if (i_37_ > i_32_)
			i_37_ = Class85.method540(i_32_, false);
		if (i_37_ > 512)
			i_37_ = 512;
		if (i_37_ != anInt15)
			anInt15 = i_37_;
		anInt6 = (int) (Math.asin((double) ((float) i_34_ / 256.0F)) * 5215.189175235227) & 0x3fff;
		anInt16 = (int) (Math.atan2((double) i_33_, (double) -i_35_) * 5215.189175235227) & 0x3fff;
		aClass_l22 = null;
		return true;
	}

	private static final void method43(Class260 class260) {
		if (aClass_l10 == null) {
			int[] is = new int[16384];
			int[] is_38_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_39_ = 64 - i;
				i_39_ *= i_39_;
				int i_40_ = 128 - i - 1;
				int i_41_ = i * 128;
				int i_42_ = i_40_ * 128;
				for (int i_43_ = 0; i_43_ < 64; i_43_++) {
					int i_44_ = 64 - i_43_;
					i_44_ *= i_44_;
					int i_45_ = 128 - i_43_ - 1;
					int i_46_ = 256 - (i_44_ + i_39_ << 8) / 4096;
					i_46_ = i_46_ * 16 * 192 / 1536;
					if (i_46_ < 0)
						i_46_ = 0;
					else if (i_46_ > 255)
						i_46_ = 255;
					int i_47_ = i_46_ / 2;
					is_38_[i_41_ + i_43_] = is_38_[i_41_ + i_45_] = is_38_[i_42_ + i_43_] = is_38_[i_42_ + i_45_] = ~0xffffff | i_46_ << 16;
					is[i_41_ + i_43_] = is[i_41_ + i_45_] = is[i_42_ + i_43_] = is[i_42_ + i_45_] = 127 - i_47_ << 24 | 0xffffff;
				}
			}
			aClass_l10 = class260.method1706(is_38_, 0, 128, 128, 128);
			aClass_l18 = class260.method1706(is, 0, 128, 128, 128);
		}
	}

	public static void method44() {
		aClass_t13 = null;
		aClass_l18 = null;
		aClass_l10 = null;
		anIntArray14 = null;
	}

	private final void method45(Class260 class260, Class2 class2_48_) {
		method38(class260);
		method43(class260);
		class260.da(anIntArray14);
		class260.OA(0, 0, anInt15, anInt15);
		class260.method1707();
		class260.O(0, 0, anInt15, anInt15, ~0xffffff | anInt19, 0);
		int i = 0;
		int i_49_ = 0;
		int i_50_ = 256;
		if (class2_48_ != null) {
			if (class2_48_.aBool7) {
				i = -class2_48_.anInt20;
				i_49_ = -class2_48_.anInt9;
				i_50_ = -class2_48_.anInt17;
			} else {
				i = class2_48_.anInt20 - anInt20;
				i_49_ = class2_48_.anInt9 - anInt9;
				i_50_ = class2_48_.anInt17 - anInt17;
			}
		}
		if (anInt6 != 0) {
			int i_51_ = Class39_Sub1.f_fb[anInt6];
			int i_52_ = Class39_Sub1.anIntArray4672[anInt6];
			int i_53_ = i_49_ * i_52_ - i_50_ * i_51_ >> 15;
			i_50_ = i_49_ * i_51_ + i_50_ * i_52_ >> 15;
			i_49_ = i_53_;
		}
		if (anInt16 != 0) {
			int i_54_ = Class39_Sub1.f_fb[anInt16];
			int i_55_ = Class39_Sub1.anIntArray4672[anInt16];
			int i_56_ = i_50_ * i_54_ + i * i_55_ >> 15;
			i_50_ = i_50_ * i_55_ - i * i_54_ >> 15;
			i = i_56_;
		}
		Class_t class_t = aClass_t13.method678((byte) 0, 51200, true);
		if (!class260.method1692()) {
			class_t.BA((short) 127, ((Class238) Class246_Sub28_Sub33.anInterface6_6967.method17(-31305, anInt5)).aShort3354);
			class_t.I((short) 0, (short) -1);
		} else
			class_t.I((short) 0, (short) anInt5);
		class260.B(1.0F);
		class260.T(16777215, 1.0F, 1.0F, (float) i, (float) i_49_, (float) i_50_);
		int i_57_ = 1024 * anInt15 / (class_t.NA() - class_t.HA());
		if (anInt19 != 0)
			i_57_ = i_57_ * 13 / 16;
		class260.H(anInt15 / 2, anInt15 / 2, i_57_, i_57_);
		class260.ea(class260.method1715());
		Class_c class_c = class260.method1715();
		class_c.j(0, 0, class260.a() - class_t.PA());
		class_t.method671(class_c, null, 1024, 1);
		int i_58_ = anInt15 * 13 / 16;
		int i_59_ = (anInt15 - i_58_) / 2;
		aClass_l18.s(i_59_, i_59_, i_58_, i_58_, 0, ~0xffffff | anInt19, 1);
		aClass_l22 = class260.method1721(0, 0, anInt15, anInt15, true);
		class260.method1707();
		class260.O(0, 0, anInt15, anInt15, 0, 0);
		aClass_l10.s(0, 0, anInt15, anInt15, 1, 0, 0);
		aClass_l22.BA(0, 0, 0);
		class260.OA(anIntArray14[0], anIntArray14[1], anIntArray14[2], anIntArray14[3]);
	}

	static final void method46() {
		aClass_t13 = null;
		aClass_l10 = null;
	}

	final void method47(Class260 class260, int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		if (aClass_l22 != null) {
			int i_65_ = anInt6 - i_63_ & 0x3fff;
			int i_66_ = anInt16 - i_64_ & 0x3fff;
			if (i_66_ > 8192)
				i_66_ -= 16384;
			if (i_65_ > 8192)
				i_65_ -= 16384;
			int i_67_ = i_65_ * i_62_ / 4096 + (i_62_ - anInt12) / 2;
			int i_68_ = i_66_ * i_62_ / -4096 + (i_61_ - anInt12) / 2;
			if (i_67_ < i_62_ && i_67_ + anInt12 > 0 && i_68_ < i_61_ && i_68_ + anInt12 > 0)
				aClass_l22.method732(i_68_ + i, i_67_ + i_60_, anInt12, anInt12);
		}
	}

	final boolean method48(Class260 class260, Class2 class2_69_) {
		if (aClass_l22 == null && !method41(class260, class2_69_))
			return false;
		return true;
	}

	Class2(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, boolean bool) {
		anInt20 = i_71_;
		anInt9 = i_72_;
		anInt17 = i_73_;
		aBool7 = bool;
		anInt5 = i_70_;
		anInt19 = i_75_;
		anInt21 = i_74_;
		anInt11 = i;
	}
}
