/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257 {
	static boolean aBool3683 = false;
	static int anInt3684;
	static boolean aBool3685 = false;
	static int anInt3686;
	static int anInt3687;
	static int anInt3688;
	static int[] anIntArray3689 = new int[3];
	static int anInt3690;

	static final float[] method1665(float f, int i, int i_0_, int i_1_, int i_2_, byte i_3_, float f_4_, float f_5_) {
		try {
			anInt3688++;
			float[] fs = new float[9];
			float[] fs_6_ = new float[9];
			float f_7_ = (float) Math.cos((double) (0.024543693F * (float) i));
			float f_8_ = (float) Math.sin((double) (0.024543693F * (float) i));
			fs[8] = f_7_;
			float f_9_ = 1.0F - f_7_;
			fs[3] = 0.0F;
			fs[0] = f_7_;
			fs[5] = 0.0F;
			fs[1] = 0.0F;
			fs[4] = 1.0F;
			fs[6] = -f_8_;
			fs[2] = f_8_;
			fs[7] = 0.0F;
			float[] fs_10_ = new float[9];
			float f_11_ = 1.0F;
			float f_12_ = 0.0F;
			f_7_ = (float) i_0_ / 32767.0F;
			f_9_ = 1.0F - f_7_;
			if (i_3_ != -66)
				return null;
			f_8_ = -(float) Math.sqrt((double) (-(f_7_ * f_7_) + 1.0F));
			float f_13_ = (float) Math.sqrt((double) (i_2_ * i_2_ - -(i_1_ * i_1_)));
			do {
				if (f_13_ != 0.0F || f_7_ != 0.0F) {
					if (f_13_ != 0.0F) {
						f_12_ = (float) i_2_ / f_13_;
						f_11_ = (float) -i_1_ / f_13_;
					}
					fs_10_[2] = f_9_ * (f_11_ * f_12_);
					fs_10_[4] = f_7_;
					fs_10_[7] = -f_11_ * f_8_;
					fs_10_[5] = f_11_ * f_8_;
					fs_10_[8] = f_7_ + f_9_ * (f_12_ * f_12_);
					fs_10_[0] = f_11_ * f_11_ * f_9_ + f_7_;
					fs_10_[3] = -f_12_ * f_8_;
					fs_10_[1] = f_8_ * f_12_;
					fs_10_[6] = f_9_ * (f_12_ * f_11_);
					fs_6_[0] = fs[2] * fs_10_[6] + (fs_10_[3] * fs[1] + fs_10_[0] * fs[0]);
					fs_6_[1] = fs[2] * fs_10_[7] + (fs_10_[1] * fs[0] + fs_10_[4] * fs[1]);
					fs_6_[2] = fs_10_[8] * fs[2] + (fs_10_[2] * fs[0] + fs_10_[5] * fs[1]);
					fs_6_[3] = fs_10_[6] * fs[5] + (fs[3] * fs_10_[0] + fs_10_[3] * fs[4]);
					fs_6_[4] = fs[5] * fs_10_[7] + (fs[3] * fs_10_[1] + fs[4] * fs_10_[4]);
					fs_6_[6] = (fs_10_[3] * fs[7] + fs_10_[0] * fs[6] + fs[8] * fs_10_[6]);
					fs_6_[5] = fs[5] * fs_10_[8] + (fs_10_[5] * fs[4] + fs_10_[2] * fs[3]);
					fs_6_[7] = (fs[6] * fs_10_[1] + fs_10_[4] * fs[7] + fs[8] * fs_10_[7]);
					fs_6_[8] = (fs_10_[5] * fs[7] + fs[6] * fs_10_[2] + fs_10_[8] * fs[8]);
					if (!client.f_ob)
						break;
				}
				fs_6_ = fs;
			} while (false);
			fs_6_[5] *= f_4_;
			fs_6_[6] *= f_5_;
			fs_6_[0] *= f;
			fs_6_[1] *= f;
			fs_6_[7] *= f_5_;
			fs_6_[8] *= f_5_;
			fs_6_[3] *= f_4_;
			fs_6_[4] *= f_4_;
			fs_6_[2] *= f;
			return fs_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wo.B(" + f + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + f_4_ + ',' + f_5_ + ')'));
		}
	}

	static final void method1666(int i, boolean bool) {
		do {
			try {
				Class209.anInt2947++;
				if (i != -15257)
					method1667(-50);
				anInt3687++;
				Class243.writePacket(-123, Class24.aClass201_339);
				for (Class246_Sub40 class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.first((byte) -23); class246_sub40 != null; class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.next((byte) -20)) {
					if (!class246_sub40.method1576(-127)) {
						class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.first((byte) -23);
						if (class246_sub40 == null)
							break;
					}
					if ((((Class246_Sub40) class246_sub40).anInt5519 ^ 0xffffffff) == -1)
						Class50.method328(true, class246_sub40, bool, -112);
				}
				if (Class163.aClass235_2312 == null)
					break;
				Stream_Sub1.method2483(Class163.aClass235_2312, (byte) -109);
				Class163.aClass235_2312 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wo.E(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method1667(int i) {
		try {
			anInt3690++;
			if (i != 0)
				method1668(-98, -8);
			for (Class246_Sub1_Sub9 class246_sub1_sub9 = ((Class246_Sub1_Sub9) Class246_Sub29.aClass166_4968.method1104(45)); class246_sub1_sub9 != null; class246_sub1_sub9 = (Class246_Sub1_Sub9) Class246_Sub29.aClass166_4968.method1108((byte) -112)) {
				Class59_Sub3_Sub2 class59_sub3_sub2 = (((Class246_Sub1_Sub9) class246_sub1_sub9).aClass59_Sub3_Sub2_6173);
				if (((Class59_Sub3_Sub2) class59_sub3_sub2).aBool5886) {
					class246_sub1_sub9.unlink((byte) -53);
					class59_sub3_sub2.method2489(true);
				} else if (((Class59_Sub3_Sub2) class59_sub3_sub2).anInt5868 <= Class246_Sub1_Sub4.anInt5752) {
					class59_sub3_sub2.method2488(Class246_Sub17.anInt4663, true);
					if (!((Class59_Sub3_Sub2) class59_sub3_sub2).aBool5886)
						Class176.method1156(class59_sub3_sub2, true);
					else
						class246_sub1_sub9.unlink((byte) -112);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wo.D(" + i + ')');
		}
	}

	static final byte[][][] method1668(int i, int i_14_) {
		try {
			anInt3684++;
			byte[][][] is = new byte[8][4][];
			int i_15_ = i_14_;
			int i_16_ = i_14_;
			byte[] is_17_ = new byte[i_15_ * i_16_];
			int i_18_ = 0;
			for (int i_19_ = 0; i_16_ > i_19_; i_19_++) {
				for (int i_20_ = 0; i_15_ > i_20_; i_20_++) {
					if ((i_20_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[0][0] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_21_ = -1 + i_16_; i_21_ >= 0; i_21_--) {
				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_22_++) {
					if ((i_21_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[0][1] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_23_++) {
				for (int i_24_ = 0; (i_15_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
					if (i_23_ <= i_24_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[0][2] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_15_ * i_16_];
			for (int i_25_ = -1 + i_16_; (i_25_ ^ 0xffffffff) <= -1; i_25_--) {
				for (int i_26_ = 0; i_26_ < i_15_; i_26_++) {
					if ((i_25_ ^ 0xffffffff) >= (i_26_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[0][3] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_15_ * i_16_];
			for (int i_27_ = -1 + i_16_; i_27_ >= 0; i_27_--) {
				for (int i_28_ = 0; i_28_ < i_15_; i_28_++) {
					if (i_28_ <= i_27_ >> 1)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[1][0] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_29_ = 0; (i_16_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++) {
				for (int i_30_ = 0; i_15_ > i_30_; i_30_++) {
					if (i_18_ < 0 || is_17_.length <= i_18_)
						i_18_++;
					else {
						if (i_30_ >= i_29_ << 1)
							is_17_[i_18_] = (byte) -1;
						i_18_++;
					}
				}
			}
			is[1][1] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_31_ = 0; (i_16_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
				for (int i_32_ = i_15_ - 1; (i_32_ ^ 0xffffffff) <= -1; i_32_--) {
					if ((i_31_ >> 1 ^ 0xffffffff) <= (i_32_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[1][2] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_33_ = -1 + i_16_; (i_33_ ^ 0xffffffff) <= -1; i_33_--) {
				for (int i_34_ = i_15_ - 1; (i_34_ ^ 0xffffffff) <= -1; i_34_--) {
					if ((i_34_ ^ 0xffffffff) <= (i_33_ << 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[1][3] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_35_ = i_16_ - 1; (i_35_ ^ 0xffffffff) <= -1; i_35_--) {
				for (int i_36_ = i_15_ - 1; (i_36_ ^ 0xffffffff) <= -1; i_36_--) {
					if ((i_35_ >> 1 ^ 0xffffffff) <= (i_36_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[2][0] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_37_ = i_16_ - 1; i_37_ >= 0; i_37_--) {
				for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_38_++) {
					if ((i_38_ ^ 0xffffffff) <= (i_37_ << 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[2][1] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_39_ = 0; (i_16_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
				for (int i_40_ = 0; i_40_ < i_15_; i_40_++) {
					if ((i_40_ ^ 0xffffffff) >= (i_39_ >> 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[2][2] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_41_++) {
				for (int i_42_ = i_15_ - 1; i_42_ >= 0; i_42_--) {
					if (i_41_ << 1 <= i_42_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[2][3] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_43_ = i_16_ - 1; (i_43_ ^ 0xffffffff) <= -1; i_43_--) {
				for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_44_++) {
					if ((i_43_ >> 1 ^ 0xffffffff) >= (i_44_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[3][0] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_45_ = 0; i_45_ < i_16_; i_45_++) {
				for (int i_46_ = 0; i_15_ > i_46_; i_46_++) {
					if (i_46_ <= i_45_ << 1)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[3][1] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_47_ = 0; (i_16_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
				for (int i_48_ = -1 + i_15_; i_48_ >= 0; i_48_--) {
					if ((i_47_ >> 1 ^ 0xffffffff) >= (i_48_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[3][2] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_49_ = -1 + i_16_; i_49_ >= 0; i_49_--) {
				for (int i_50_ = i_15_ - 1; (i_50_ ^ 0xffffffff) <= -1; i_50_--) {
					if ((i_50_ ^ 0xffffffff) >= (i_49_ << 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[3][3] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_51_ = -1 + i_16_; i_51_ >= 0; i_51_--) {
				for (int i_52_ = i_15_ - 1; i_52_ >= 0; i_52_--) {
					if ((i_52_ ^ 0xffffffff) <= (i_51_ >> 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[4][0] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_53_ = -1 + i_16_; (i_53_ ^ 0xffffffff) <= -1; i_53_--) {
				for (int i_54_ = 0; (i_15_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++) {
					if ((i_54_ ^ 0xffffffff) >= (i_53_ << 1 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[4][1] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_55_ = 0; (i_16_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++) {
				for (int i_56_ = 0; (i_15_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
					if (i_56_ >= i_55_ >> 1)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[4][2] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_57_ = i; (i_57_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_57_++) {
				for (int i_58_ = -1 + i_15_; i_58_ >= 0; i_58_--) {
					if (i_57_ << 1 >= i_58_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[4][3] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_59_ = 0; (i_16_ ^ 0xffffffff) < (i_59_ ^ 0xffffffff); i_59_++) {
				for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_60_++) {
					if ((i_60_ ^ 0xffffffff) >= (i_15_ / 2 ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[5][0] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_61_ = 0; (i_16_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
				for (int i_62_ = 0; (i_15_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff); i_62_++) {
					if (i_16_ / 2 >= i_61_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[5][1] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_63_++) {
				for (int i_64_ = 0; (i_64_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_64_++) {
					if (i_15_ / 2 <= i_64_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[5][2] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_65_ = 0; (i_16_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++) {
				for (int i_66_ = 0; (i_15_ ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
					if (i_65_ >= i_16_ / 2)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[5][3] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_67_ = 0; (i_16_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
				for (int i_68_ = 0; (i_68_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_68_++) {
					if ((-(i_16_ / 2) + i_67_ ^ 0xffffffff) <= (i_68_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[6][0] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_69_ = i_16_ - 1; i_69_ >= 0; i_69_--) {
				for (int i_70_ = 0; (i_15_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
					if (i_70_ <= i_69_ - i_16_ / 2)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[6][1] = is_17_;
			is_17_ = new byte[i_16_ * i_15_];
			i_18_ = 0;
			for (int i_71_ = i_16_ - 1; i_71_ >= 0; i_71_--) {
				for (int i_72_ = i_15_ - 1; i_72_ >= 0; i_72_--) {
					if ((i_72_ ^ 0xffffffff) >= (i_71_ + -(i_16_ / 2) ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[6][2] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_73_ = 0; (i_16_ ^ 0xffffffff) < (i_73_ ^ 0xffffffff); i_73_++) {
				for (int i_74_ = -1 + i_15_; (i_74_ ^ 0xffffffff) <= -1; i_74_--) {
					if ((-(i_16_ / 2) + i_73_ ^ 0xffffffff) <= (i_74_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[6][3] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_16_ * i_15_];
			for (int i_75_ = 0; (i_75_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_75_++) {
				for (int i_76_ = 0; (i_15_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff); i_76_++) {
					if ((-(i_16_ / 2) + i_75_ ^ 0xffffffff) >= (i_76_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[7][0] = is_17_;
			i_18_ = 0;
			is_17_ = new byte[i_15_ * i_16_];
			for (int i_77_ = i_16_ - 1; (i_77_ ^ 0xffffffff) <= -1; i_77_--) {
				for (int i_78_ = 0; (i_15_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff); i_78_++) {
					if (i_77_ - i_16_ / 2 <= i_78_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[7][1] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_79_ = i_16_ - 1; i_79_ >= 0; i_79_--) {
				for (int i_80_ = -1 + i_15_; (i_80_ ^ 0xffffffff) <= -1; i_80_--) {
					if (i_79_ + -(i_16_ / 2) <= i_80_)
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[7][2] = is_17_;
			is_17_ = new byte[i_15_ * i_16_];
			i_18_ = 0;
			for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_81_++) {
				for (int i_82_ = i_15_ - 1; (i_82_ ^ 0xffffffff) <= -1; i_82_--) {
					if ((-(i_16_ / 2) + i_81_ ^ 0xffffffff) >= (i_82_ ^ 0xffffffff))
						is_17_[i_18_] = (byte) -1;
					i_18_++;
				}
			}
			is[7][3] = is_17_;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wo.C(" + i + ',' + i_14_ + ')');
		}
	}

	public static void method1669(int i) {
		do {
			try {
				anIntArray3689 = null;
				if (i == 7582)
					break;
				anInt3686 = 23;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wo.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
