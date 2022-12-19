
/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class38 {
	static int anInt552;
	static int anInt553;
	private int anInt554;
	private int anInt555;
	int anInt556;
	static int anInt557;
	private short[] aShortArray558;
	private int anInt559;
	private short[] aShortArray560 = new short[512];
	static int anInt561;
	static int anInt562;
	static boolean aBool563 = false;
	private int anInt564;
	static int anInt565;
	static Class_fs index24;

	static final void method262(int i, int i_0_, Class260 class260, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				class260.OA(i_1_, i_2_, i_1_ + i, i_3_ + i_2_);
				anInt562++;
				class260.method1734(i_1_, i, i_2_, (byte) 58, -16777216, i_3_);
				if (Class39.anInt571 >= 100) {
					float f = ((float) Class79.anInt1058 / (float) Class79.anInt1054);
					int i_4_ = i;
					int i_5_ = i_3_;
					if (f < 1.0F)
						i_5_ = (int) (f * (float) i);
					else
						i_4_ = (int) ((float) i_3_ / f);
					i_1_ += (-i_4_ + i) / 2;
					i_2_ += (i_3_ + -i_5_) / 2;
					if (Class124.aClass_l1733 == null || (i ^ 0xffffffff) != (Class124.aClass_l1733.la() ^ 0xffffffff) || Class124.aClass_l1733.ma() != i_3_) {
						Class79.method517(Class79.anInt1057, (Class79.anInt1041 + Class79.anInt1058), (Class79.anInt1057 - -Class79.anInt1054), Class79.anInt1041, i_1_, i_2_, i_1_ - -i_4_, i_2_ - -i_5_);
						Class79.method512(class260);
						Class124.aClass_l1733 = class260.method1721(i_1_, i_2_, i_4_, i_5_, false);
					}
					Class124.aClass_l1733.method729(i_1_, i_2_);
					int i_6_ = Class8.anInt99 * i_4_ / Class79.anInt1054;
					int i_7_ = Class216.anInt3010 * i_5_ / Class79.anInt1058;
					int i_8_ = 71 % ((i_0_ + 55) / 59);
					int i_9_ = Class100.anInt1302 * i_4_ / Class79.anInt1054 + i_1_;
					int i_10_ = -i_7_ + (-(Class260.anInt3724 * i_5_ / Class79.anInt1058) + i_5_) + i_2_;
					int i_11_ = -1996554240;
					if (Class40_Sub6.aClass101_5092 == Class59_Sub4_Sub3.aClass101_6943)
						i_11_ = -1996488705;
					class260.O(i_9_, i_10_, i_6_, i_7_, i_11_, 1);
					class260.method1753(i_9_, i_10_, i_6_, i_7_, i_11_, 0);
					if ((Class74.anInt966 ^ 0xffffffff) >= -1)
						break;
					int i_12_;
					if ((Class40_Sub5.anInt4918 ^ 0xffffffff) < -51)
						i_12_ = 5 * (100 - Class40_Sub5.anInt4918);
					else
						i_12_ = 5 * Class40_Sub5.anInt4918;
					for (Class246_Sub2 class246_sub2 = ((Class246_Sub2) Class79.aClass166_1034.method1104(110)); class246_sub2 != null; class246_sub2 = (Class246_Sub2) Class79.aClass166_1034.method1108((byte) -112)) {
						Class140 class140 = (Class79.aClass165_1022.method1088(((Class246_Sub2) class246_sub2).anInt3808, (byte) -41));
						if (Class242.method1562(class140, 2)) {
							if (((Class246_Sub2) class246_sub2).anInt3808 != Class246_Sub28_Sub4.anInt5975) {
								if ((Class246_Sub28_Sub33.anInt6968 ^ 0xffffffff) != 0 && (Class246_Sub28_Sub33.anInt6968 == ((Class140) class140).anInt2014)) {
									int i_13_ = (i_1_ - -((((Class246_Sub2) class246_sub2).anInt3807) * i_4_ / Class79.anInt1054));
									int i_14_ = ((i_5_ * (Class79.anInt1058 + -((Class246_Sub2) class246_sub2).anInt3801) / Class79.anInt1058) + i_2_);
									class260.method1734(-2 + i_13_, 4, i_14_ - 2, (byte) 58, i_12_ << 24 | 0xffff00, 4);
								}
							} else {
								int i_15_ = i_1_ - -((((Class246_Sub2) class246_sub2).anInt3807) * i_4_ / Class79.anInt1054);
								int i_16_ = ((i_5_ * (Class79.anInt1058 - (((Class246_Sub2) class246_sub2).anInt3801)) / Class79.anInt1058) + i_2_);
								class260.method1734(-2 + i_15_, 4, -2 + i_16_, (byte) 58, 0xffff00 | i_12_ << 24, 4);
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("df.O(" + i + ',' + i_0_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method263(byte i, int i_17_, int i_18_, int i_19_) {
		try {
			anInt553++;
			if (i >= -51)
				method266(60);
			int[] is = new int[i_17_];
			int[] is_20_ = new int[i_19_];
			for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_21_++)
				is[i_21_] = (i_21_ << 12) / i_17_;
			int[] is_22_ = new int[i_18_];
			for (int i_23_ = 0; i_23_ < i_19_; i_23_++)
				is_20_[i_23_] = (i_23_ << 12) / i_19_;
			for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_24_++)
				is_22_[i_24_] = (i_24_ << 12) / i_18_;
			method270(-99);
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_25_++) {
				for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
					for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_27_++) {
						for (int i_28_ = 0; ((Class38) this).anInt556 > i_28_; i_28_++) {
							int i_29_ = aShortArray558[i_28_] << 12;
							int i_30_ = i_29_ * is[i_27_] >> 12;
							int i_31_ = i_29_ * anInt554 >> 12;
							int i_32_ = i_29_ * anInt564 >> 12;
							int i_33_ = is_22_[i_25_] * i_29_ >> 12;
							int i_34_ = i_29_ * is_20_[i_26_] >> 12;
							int i_35_ = anInt559 * i_29_ >> 12;
							i_30_ *= anInt559;
							i_34_ *= anInt564;
							i_33_ *= anInt554;
							int i_36_ = i_30_ >> 12;
							int i_37_ = 1 + i_36_;
							int i_38_ = i_34_ >> 12;
							i_36_ &= 0xff;
							int i_39_ = 1 + i_38_;
							i_38_ &= 0xff;
							int i_40_ = i_33_ >> 12;
							int i_41_ = 1 + i_40_;
							i_34_ &= 0xfff;
							i_40_ &= 0xff;
							i_30_ &= 0xfff;
							i_33_ &= 0xfff;
							if ((i_31_ ^ 0xffffffff) >= (i_41_ ^ 0xffffffff))
								i_41_ = 0;
							else
								i_41_ &= 0xff;
							if (i_37_ < i_35_)
								i_37_ &= 0xff;
							else
								i_37_ = 0;
							if (i_32_ > i_39_)
								i_39_ &= 0xff;
							else
								i_39_ = 0;
							int i_42_ = Class61.anIntArray839[i_30_];
							int i_43_ = aShortArray560[i_41_];
							int i_44_ = -4096 + i_33_;
							int i_45_ = i_30_ - 4096;
							int i_46_ = -4096 + i_34_;
							int i_47_ = aShortArray560[i_40_];
							int i_48_ = Class61.anIntArray839[i_34_];
							int i_49_ = Class61.anIntArray839[i_33_];
							int i_50_ = aShortArray560[i_38_ - -i_43_];
							int i_51_ = aShortArray560[i_43_ + i_39_];
							int i_52_ = aShortArray560[i_39_ + i_47_];
							int i_53_ = aShortArray560[i_47_ + i_38_];
							int i_54_ = Class187.method1227(i_34_, -5, i_30_, i_33_, (aShortArray560[i_36_ - -i_53_]));
							int i_55_ = Class187.method1227(i_34_, -5, i_45_, i_33_, (aShortArray560[i_37_ - -i_53_]));
							int i_56_ = i_54_ + (i_42_ * (i_55_ + -i_54_) >> 12);
							i_54_ = Class187.method1227(i_46_, -5, i_30_, i_33_, (aShortArray560[i_52_ + i_36_]));
							i_55_ = Class187.method1227(i_46_, -5, i_45_, i_33_, (aShortArray560[i_37_ + i_52_]));
							int i_57_ = i_54_ + (i_42_ * (-i_54_ + i_55_) >> 12);
							int i_58_ = i_56_ - -(i_48_ * (-i_56_ + i_57_) >> 12);
							i_54_ = Class187.method1227(i_34_, -5, i_30_, i_44_, (aShortArray560[i_50_ + i_36_]));
							i_55_ = Class187.method1227(i_34_, -5, i_45_, i_44_, (aShortArray560[i_50_ + i_37_]));
							i_56_ = ((-i_54_ + i_55_) * i_42_ >> 12) + i_54_;
							i_54_ = Class187.method1227(i_46_, -5, i_30_, i_44_, (aShortArray560[i_51_ + i_36_]));
							i_55_ = Class187.method1227(i_46_, -5, i_45_, i_44_, (aShortArray560[i_51_ + i_37_]));
							i_57_ = ((i_55_ - i_54_) * i_42_ >> 12) + i_54_;
							int i_59_ = i_56_ - -(i_48_ * (-i_56_ + i_57_) >> 12);
							method268(i_28_, i_58_ + (i_49_ * (i_59_ + -i_58_) >> 12), true);
						}
						method265((byte) -76);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("df.P(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	private final void method264(int i) {
		try {
			if (i != 731)
				method263((byte) -7, 87, -18, 75);
			anInt552++;
			aShortArray558 = new short[((Class38) this).anInt556];
			for (int i_60_ = 0; ((Class38) this).anInt556 > i_60_; i_60_++)
				aShortArray558[i_60_] = (short) (int) Math.pow(2.0, (double) i_60_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "df.N(" + i + ')');
		}
	}

	abstract void method265(byte i);

	static final void method266(int i) {
		try {
			if (i <= -119) {
				Class110.aClass85_1572.method543(0);
				anInt561++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "df.Q(" + i + ')');
		}
	}

	private final void method267(byte i) {
		try {
			anInt557++;
			if (i != -15)
				index24 = null;
			Random random = new Random((long) anInt555);
			for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > -256; i_61_++)
				aShortArray560[i_61_] = (short) i_61_;
			for (int i_62_ = 0; i_62_ < 255; i_62_++) {
				int i_63_ = -i_62_ + 255;
				int i_64_ = Class122.method826((byte) 94, random, i_63_);
				short i_65_ = aShortArray560[i_64_];
				aShortArray560[i_64_] = aShortArray560[i_63_];
				aShortArray560[i_63_] = aShortArray560[i_63_ + 256] = i_65_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "df.S(" + i + ')');
		}
	}

	abstract void method268(int i, int i_66_, boolean bool);

	public static void method269(int i) {
		try {
			if (i != 385672172)
				method266(-103);
			index24 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "df.R(" + i + ')');
		}
	}

	abstract void method270(int i);

	Class38(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		anInt554 = 4;
		((Class38) this).anInt556 = 4;
		anInt555 = 0;
		anInt559 = 4;
		anInt564 = 4;
		try {
			((Class38) this).anInt556 = i_67_;
			anInt554 = i_70_;
			anInt564 = i_69_;
			anInt555 = i;
			anInt559 = i_68_;
			method264(731);
			method267((byte) -15);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("df.<init>(" + i + ',' + i_67_ + ',' + i_68_ + ',' + i_69_ + ',' + i_70_ + ')'));
		}
	}

	static {
		new Class67("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
	}
}
