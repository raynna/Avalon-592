/* Class_l_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_l_Sub1_Sub1 extends Class_l_Sub1 {
	private int[] anIntArray5959;

	final void s(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		if (i_1_ > 0 && i_2_ > 0) {
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb);
			int i_9_ = (((Class_l_Sub1) this).anInt5218 + ((Class_l_Sub1) this).anInt5230 + ((Class_l_Sub1) this).anInt5216);
			int i_10_ = (((Class_l_Sub1) this).anInt5209 + ((Class_l_Sub1) this).anInt5205 + ((Class_l_Sub1) this).anInt5224);
			int i_11_ = (i_9_ << 16) / i_1_;
			int i_12_ = (i_10_ << 16) / i_2_;
			if (((Class_l_Sub1) this).anInt5218 > 0) {
				int i_13_ = (((((Class_l_Sub1) this).anInt5218 << 16) + i_11_ - 1) / i_11_);
				i += i_13_;
				i_6_ += i_13_ * i_11_ - (((Class_l_Sub1) this).anInt5218 << 16);
			}
			if (((Class_l_Sub1) this).anInt5209 > 0) {
				int i_14_ = (((((Class_l_Sub1) this).anInt5209 << 16) + i_12_ - 1) / i_12_);
				i_0_ += i_14_;
				i_7_ += i_14_ * i_12_ - (((Class_l_Sub1) this).anInt5209 << 16);
			}
			if (((Class_l_Sub1) this).anInt5230 < i_9_)
				i_1_ = ((((Class_l_Sub1) this).anInt5230 << 16) - i_6_ + i_11_ - 1) / i_11_;
			if (((Class_l_Sub1) this).anInt5205 < i_10_)
				i_2_ = ((((Class_l_Sub1) this).anInt5205 << 16) - i_7_ + i_12_ - 1) / i_12_;
			int i_15_ = i + i_0_ * i_8_;
			int i_16_ = i_8_ - i_1_;
			if (i_0_ + i_2_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
				i_2_ -= i_0_ + i_2_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
			if (i_0_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
				int i_17_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb - i_0_);
				i_2_ -= i_17_;
				i_15_ += i_17_ * i_8_;
				i_7_ += i_12_ * i_17_;
			}
			if (i + i_1_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
				int i_18_ = (i + i_1_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
				i_1_ -= i_18_;
				i_16_ += i_18_;
			}
			if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
				int i_19_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb - i);
				i_1_ -= i_19_;
				i_15_ += i_19_;
				i_6_ += i_11_ * i_19_;
				i_16_ += i_19_;
			}
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_5_ == 0) {
				if (i_3_ == 1) {
					int i_20_ = i_6_;
					for (int i_21_ = -i_2_; i_21_ < 0; i_21_++) {
						int i_22_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_23_ = -i_1_; i_23_ < 0; i_23_++) {
							is[i_15_++] = anIntArray5959[(i_6_ >> 16) + i_22_];
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_20_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 0) {
					int i_24_ = (i_4_ & 0xff0000) >> 16;
					int i_25_ = (i_4_ & 0xff00) >> 8;
					int i_26_ = i_4_ & 0xff;
					int i_27_ = i_6_;
					for (int i_28_ = -i_2_; i_28_ < 0; i_28_++) {
						int i_29_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_30_ = -i_1_; i_30_ < 0; i_30_++) {
							int i_31_ = anIntArray5959[(i_6_ >> 16) + i_29_];
							int i_32_ = (i_31_ & 0xff0000) * i_24_ & ~0xffffff;
							int i_33_ = (i_31_ & 0xff00) * i_25_ & 0xff0000;
							int i_34_ = (i_31_ & 0xff) * i_26_ & 0xff00;
							is[i_15_++] = (i_32_ | i_33_ | i_34_) >>> 8;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_27_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 3) {
					int i_35_ = i_6_;
					for (int i_36_ = -i_2_; i_36_ < 0; i_36_++) {
						int i_37_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_38_ = -i_1_; i_38_ < 0; i_38_++) {
							int i_39_ = anIntArray5959[(i_6_ >> 16) + i_37_];
							int i_40_ = i_39_ + i_4_;
							int i_41_ = (i_39_ & 0xff00ff) + (i_4_ & 0xff00ff);
							int i_42_ = ((i_41_ & 0x1000100) + (i_40_ - i_41_ & 0x10000));
							is[i_15_++] = i_40_ - i_42_ | i_42_ - (i_42_ >>> 8);
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_35_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 2) {
					int i_43_ = i_4_ >>> 24;
					int i_44_ = 256 - i_43_;
					int i_45_ = (i_4_ & 0xff00ff) * i_44_ & ~0xff00ff;
					int i_46_ = (i_4_ & 0xff00) * i_44_ & 0xff0000;
					i_4_ = (i_45_ | i_46_) >>> 8;
					int i_47_ = i_6_;
					for (int i_48_ = -i_2_; i_48_ < 0; i_48_++) {
						int i_49_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_50_ = -i_1_; i_50_ < 0; i_50_++) {
							int i_51_ = anIntArray5959[(i_6_ >> 16) + i_49_];
							i_45_ = (i_51_ & 0xff00ff) * i_43_ & ~0xff00ff;
							i_46_ = (i_51_ & 0xff00) * i_43_ & 0xff0000;
							is[i_15_++] = ((i_45_ | i_46_) >>> 8) + i_4_;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_47_;
						i_15_ += i_16_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_5_ == 1) {
				if (i_3_ == 1) {
					int i_52_ = i_6_;
					for (int i_53_ = -i_2_; i_53_ < 0; i_53_++) {
						int i_54_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_55_ = -i_1_; i_55_ < 0; i_55_++) {
							int i_56_ = anIntArray5959[(i_6_ >> 16) + i_54_];
							if (i_56_ != 0)
								is[i_15_++] = i_56_;
							else
								i_15_++;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_52_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 0) {
					int i_57_ = i_6_;
					if ((i_4_ & 0xffffff) == 16777215) {
						int i_58_ = i_4_ >>> 24;
						int i_59_ = 256 - i_58_;
						for (int i_60_ = -i_2_; i_60_ < 0; i_60_++) {
							int i_61_ = ((i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_62_ = -i_1_; i_62_ < 0; i_62_++) {
								int i_63_ = anIntArray5959[(i_6_ >> 16) + i_61_];
								if (i_63_ != 0) {
									int i_64_ = is[i_15_];
									is[i_15_++] = ((((i_63_ & 0xff00ff) * i_58_ + (i_64_ & 0xff00ff) * i_59_) & ~0xff00ff) + (((i_63_ & 0xff00) * i_58_ + (i_64_ & 0xff00) * i_59_) & 0xff0000)) >> 8;
								} else
									i_15_++;
								i_6_ += i_11_;
							}
							i_7_ += i_12_;
							i_6_ = i_57_;
							i_15_ += i_16_;
						}
					} else {
						int i_65_ = (i_4_ & 0xff0000) >> 16;
						int i_66_ = (i_4_ & 0xff00) >> 8;
						int i_67_ = i_4_ & 0xff;
						int i_68_ = i_4_ >>> 24;
						int i_69_ = 256 - i_68_;
						for (int i_70_ = -i_2_; i_70_ < 0; i_70_++) {
							int i_71_ = ((i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_72_ = -i_1_; i_72_ < 0; i_72_++) {
								int i_73_ = anIntArray5959[(i_6_ >> 16) + i_71_];
								if (i_73_ != 0) {
									if (i_68_ != 255) {
										int i_74_ = ((i_73_ & 0xff0000) * i_65_ & ~0xffffff);
										int i_75_ = ((i_73_ & 0xff00) * i_66_ & 0xff0000);
										int i_76_ = (i_73_ & 0xff) * i_67_ & 0xff00;
										i_73_ = (i_74_ | i_75_ | i_76_) >>> 8;
										int i_77_ = is[i_15_];
										is[i_15_++] = ((((i_73_ & 0xff00ff) * i_68_ + (i_77_ & 0xff00ff) * i_69_) & ~0xff00ff) + (((i_73_ & 0xff00) * i_68_ + (i_77_ & 0xff00) * i_69_) & 0xff0000)) >> 8;
									} else {
										int i_78_ = ((i_73_ & 0xff0000) * i_65_ & ~0xffffff);
										int i_79_ = ((i_73_ & 0xff00) * i_66_ & 0xff0000);
										int i_80_ = (i_73_ & 0xff) * i_67_ & 0xff00;
										is[i_15_++] = (i_78_ | i_79_ | i_80_) >>> 8;
									}
								} else
									i_15_++;
								i_6_ += i_11_;
							}
							i_7_ += i_12_;
							i_6_ = i_57_;
							i_15_ += i_16_;
						}
						return;
					}
					return;
				}
				if (i_3_ == 3) {
					int i_81_ = i_6_;
					int i_82_ = i_4_ >>> 24;
					int i_83_ = 256 - i_82_;
					for (int i_84_ = -i_2_; i_84_ < 0; i_84_++) {
						int i_85_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_86_ = -i_1_; i_86_ < 0; i_86_++) {
							int i_87_ = anIntArray5959[(i_6_ >> 16) + i_85_];
							int i_88_ = i_87_ + i_4_;
							int i_89_ = (i_87_ & 0xff00ff) + (i_4_ & 0xff00ff);
							int i_90_ = ((i_89_ & 0x1000100) + (i_88_ - i_89_ & 0x10000));
							i_90_ = i_88_ - i_90_ | i_90_ - (i_90_ >>> 8);
							if (i_87_ == 0 && i_82_ != 255) {
								i_87_ = i_90_;
								i_90_ = is[i_15_];
								i_90_ = ((((i_87_ & 0xff00ff) * i_82_ + (i_90_ & 0xff00ff) * i_83_) & ~0xff00ff) + (((i_87_ & 0xff00) * i_82_ + (i_90_ & 0xff00) * i_83_) & 0xff0000)) >> 8;
							}
							is[i_15_++] = i_90_;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_81_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 2) {
					int i_91_ = i_4_ >>> 24;
					int i_92_ = 256 - i_91_;
					int i_93_ = (i_4_ & 0xff00ff) * i_92_ & ~0xff00ff;
					int i_94_ = (i_4_ & 0xff00) * i_92_ & 0xff0000;
					i_4_ = (i_93_ | i_94_) >>> 8;
					int i_95_ = i_6_;
					for (int i_96_ = -i_2_; i_96_ < 0; i_96_++) {
						int i_97_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_98_ = -i_1_; i_98_ < 0; i_98_++) {
							int i_99_ = anIntArray5959[(i_6_ >> 16) + i_97_];
							if (i_99_ != 0) {
								i_93_ = (i_99_ & 0xff00ff) * i_91_ & ~0xff00ff;
								i_94_ = (i_99_ & 0xff00) * i_91_ & 0xff0000;
								is[i_15_++] = ((i_93_ | i_94_) >>> 8) + i_4_;
							} else
								i_15_++;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_95_;
						i_15_ += i_16_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_5_ == 2) {
				if (i_3_ == 1) {
					int i_100_ = i_6_;
					for (int i_101_ = -i_2_; i_101_ < 0; i_101_++) {
						int i_102_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_103_ = -i_1_; i_103_ < 0; i_103_++) {
							int i_104_ = anIntArray5959[(i_6_ >> 16) + i_102_];
							if (i_104_ != 0) {
								int i_105_ = is[i_15_];
								int i_106_ = i_104_ + i_105_;
								int i_107_ = ((i_104_ & 0xff00ff) + (i_105_ & 0xff00ff));
								i_105_ = (i_107_ & 0x1000100) + (i_106_ - i_107_ & 0x10000);
								is[i_15_++] = i_106_ - i_105_ | i_105_ - (i_105_ >>> 8);
							} else
								i_15_++;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_100_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 0) {
					int i_108_ = i_6_;
					int i_109_ = (i_4_ & 0xff0000) >> 16;
					int i_110_ = (i_4_ & 0xff00) >> 8;
					int i_111_ = i_4_ & 0xff;
					for (int i_112_ = -i_2_; i_112_ < 0; i_112_++) {
						int i_113_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_114_ = -i_1_; i_114_ < 0; i_114_++) {
							int i_115_ = anIntArray5959[(i_6_ >> 16) + i_113_];
							if (i_115_ != 0) {
								int i_116_ = (i_115_ & 0xff0000) * i_109_ & ~0xffffff;
								int i_117_ = (i_115_ & 0xff00) * i_110_ & 0xff0000;
								int i_118_ = (i_115_ & 0xff) * i_111_ & 0xff00;
								i_115_ = (i_116_ | i_117_ | i_118_) >>> 8;
								int i_119_ = is[i_15_];
								int i_120_ = i_115_ + i_119_;
								int i_121_ = ((i_115_ & 0xff00ff) + (i_119_ & 0xff00ff));
								i_119_ = (i_121_ & 0x1000100) + (i_120_ - i_121_ & 0x10000);
								is[i_15_++] = i_120_ - i_119_ | i_119_ - (i_119_ >>> 8);
							} else
								i_15_++;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_108_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 3) {
					int i_122_ = i_6_;
					for (int i_123_ = -i_2_; i_123_ < 0; i_123_++) {
						int i_124_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_125_ = -i_1_; i_125_ < 0; i_125_++) {
							int i_126_ = anIntArray5959[(i_6_ >> 16) + i_124_];
							int i_127_ = i_126_ + i_4_;
							int i_128_ = (i_126_ & 0xff00ff) + (i_4_ & 0xff00ff);
							int i_129_ = ((i_128_ & 0x1000100) + (i_127_ - i_128_ & 0x10000));
							i_126_ = i_127_ - i_129_ | i_129_ - (i_129_ >>> 8);
							i_129_ = is[i_15_];
							i_127_ = i_126_ + i_129_;
							i_128_ = (i_126_ & 0xff00ff) + (i_129_ & 0xff00ff);
							i_129_ = (i_128_ & 0x1000100) + (i_127_ - i_128_ & 0x10000);
							is[i_15_++] = i_127_ - i_129_ | i_129_ - (i_129_ >>> 8);
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_122_;
						i_15_ += i_16_;
					}
					return;
				}
				if (i_3_ == 2) {
					int i_130_ = i_4_ >>> 24;
					int i_131_ = 256 - i_130_;
					int i_132_ = (i_4_ & 0xff00ff) * i_131_ & ~0xff00ff;
					int i_133_ = (i_4_ & 0xff00) * i_131_ & 0xff0000;
					i_4_ = (i_132_ | i_133_) >>> 8;
					int i_134_ = i_6_;
					for (int i_135_ = -i_2_; i_135_ < 0; i_135_++) {
						int i_136_ = (i_7_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_137_ = -i_1_; i_137_ < 0; i_137_++) {
							int i_138_ = anIntArray5959[(i_6_ >> 16) + i_136_];
							if (i_138_ != 0) {
								i_132_ = (i_138_ & 0xff00ff) * i_130_ & ~0xff00ff;
								i_133_ = (i_138_ & 0xff00) * i_130_ & 0xff0000;
								i_138_ = ((i_132_ | i_133_) >>> 8) + i_4_;
								int i_139_ = is[i_15_];
								int i_140_ = i_138_ + i_139_;
								int i_141_ = ((i_138_ & 0xff00ff) + (i_139_ & 0xff00ff));
								i_139_ = (i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000);
								is[i_15_++] = i_140_ - i_139_ | i_139_ - (i_139_ >>> 8);
							} else
								i_15_++;
							i_6_ += i_11_;
						}
						i_7_ += i_12_;
						i_6_ = i_134_;
						i_15_ += i_16_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void t(int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_) {
		int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		for (int i_147_ = 0; i_147_ < i_144_; i_147_++) {
			int i_148_ = (i_142_ + i_147_) * ((Class_l_Sub1) this).anInt5230 + i;
			int i_149_ = (i_146_ + i_147_) * (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).f_nb) + i_145_;
			for (int i_150_ = 0; i_150_ < i_143_; i_150_++)
				anIntArray5959[i_148_ + i_150_] = is[i_149_ + i_150_];
		}
	}

	final void method737(int i, int i_151_, Class128 class128, int i_152_, int i_153_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		i += ((Class_l_Sub1) this).anInt5218;
		i_151_ += ((Class_l_Sub1) this).anInt5209;
		int i_154_ = 0;
		int i_155_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		int i_156_ = ((Class_l_Sub1) this).anInt5230;
		int i_157_ = ((Class_l_Sub1) this).anInt5205;
		int i_158_ = i_155_ - i_156_;
		int i_159_ = 0;
		int i_160_ = i + i_151_ * i_155_;
		if (i_151_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_161_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_151_);
			i_157_ -= i_161_;
			i_151_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_154_ += i_161_ * i_156_;
			i_160_ += i_161_ * i_155_;
		}
		if (i_151_ + i_157_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_157_ -= i_151_ + i_157_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_162_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_156_ -= i_162_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_154_ += i_162_;
			i_160_ += i_162_;
			i_159_ += i_162_;
			i_158_ += i_162_;
		}
		if (i + i_156_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_163_ = i + i_156_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_156_ -= i_163_;
			i_159_ += i_163_;
			i_158_ += i_163_;
		}
		if (i_156_ > 0 && i_157_ > 0) {
			Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
			int[] is = ((Class128_Sub2) class128_sub2).anIntArray5568;
			int[] is_164_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
			int[] is_165_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			int i_166_ = i_151_;
			if (i_153_ > i_166_) {
				i_166_ = i_153_;
				i_160_ += (i_153_ - i_151_) * i_155_;
				i_154_ += (i_153_ - i_151_) * ((Class_l_Sub1) this).anInt5230;
			}
			int i_167_ = (i_153_ + is.length < i_151_ + i_157_ ? i_153_ + is.length : i_151_ + i_157_);
			for (int i_168_ = i_166_; i_168_ < i_167_; i_168_++) {
				int i_169_ = is[i_168_ - i_153_] + i_152_;
				int i_170_ = is_164_[i_168_ - i_153_];
				int i_171_ = i_156_;
				if (i > i_169_) {
					int i_172_ = i - i_169_;
					if (i_172_ >= i_170_) {
						i_154_ += i_156_ + i_159_;
						i_160_ += i_156_ + i_158_;
						continue;
					}
					i_170_ -= i_172_;
				} else {
					int i_173_ = i_169_ - i;
					if (i_173_ >= i_156_) {
						i_154_ += i_156_ + i_159_;
						i_160_ += i_156_ + i_158_;
						continue;
					}
					i_154_ += i_173_;
					i_171_ -= i_173_;
					i_160_ += i_173_;
				}
				int i_174_ = 0;
				if (i_171_ < i_170_)
					i_170_ = i_171_;
				else
					i_174_ = i_171_ - i_170_;
				for (int i_175_ = -i_170_; i_175_ < 0; i_175_++) {
					int i_176_ = anIntArray5959[i_154_++];
					if (i_176_ != 0)
						is_165_[i_160_++] = i_176_;
					else
						i_160_++;
				}
				i_154_ += i_174_ + i_159_;
				i_160_ += i_174_ + i_158_;
			}
		}
	}

	final void r(int i, int i_177_, int i_178_, int i_179_, int i_180_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		int i_181_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		i += ((Class_l_Sub1) this).anInt5218;
		i_177_ += ((Class_l_Sub1) this).anInt5209;
		int i_182_ = i_177_ * i_181_ + i;
		int i_183_ = 0;
		int i_184_ = ((Class_l_Sub1) this).anInt5205;
		int i_185_ = ((Class_l_Sub1) this).anInt5230;
		int i_186_ = i_181_ - i_185_;
		int i_187_ = 0;
		if (i_177_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_188_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_177_);
			i_184_ -= i_188_;
			i_177_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_183_ += i_188_ * i_185_;
			i_182_ += i_188_ * i_181_;
		}
		if (i_177_ + i_184_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_184_ -= i_177_ + i_184_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_189_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_185_ -= i_189_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_183_ += i_189_;
			i_182_ += i_189_;
			i_187_ += i_189_;
			i_186_ += i_189_;
		}
		if (i + i_185_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_190_ = i + i_185_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_185_ -= i_190_;
			i_187_ += i_190_;
			i_186_ += i_190_;
		}
		if (i_185_ > 0 && i_184_ > 0) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_180_ == 0) {
				if (i_178_ == 1) {
					for (int i_191_ = -i_184_; i_191_ < 0; i_191_++) {
						int i_192_ = i_182_ + i_185_ - 3;
						while (i_182_ < i_192_) {
							is[i_182_++] = anIntArray5959[i_183_++];
							is[i_182_++] = anIntArray5959[i_183_++];
							is[i_182_++] = anIntArray5959[i_183_++];
							is[i_182_++] = anIntArray5959[i_183_++];
						}
						i_192_ += 3;
						while (i_182_ < i_192_)
							is[i_182_++] = anIntArray5959[i_183_++];
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 0) {
					int i_193_ = (i_179_ & 0xff0000) >> 16;
					int i_194_ = (i_179_ & 0xff00) >> 8;
					int i_195_ = i_179_ & 0xff;
					for (int i_196_ = -i_184_; i_196_ < 0; i_196_++) {
						for (int i_197_ = -i_185_; i_197_ < 0; i_197_++) {
							int i_198_ = anIntArray5959[i_183_++];
							int i_199_ = (i_198_ & 0xff0000) * i_193_ & ~0xffffff;
							int i_200_ = (i_198_ & 0xff00) * i_194_ & 0xff0000;
							int i_201_ = (i_198_ & 0xff) * i_195_ & 0xff00;
							is[i_182_++] = (i_199_ | i_200_ | i_201_) >>> 8;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 3) {
					for (int i_202_ = -i_184_; i_202_ < 0; i_202_++) {
						for (int i_203_ = -i_185_; i_203_ < 0; i_203_++) {
							int i_204_ = anIntArray5959[i_183_++];
							int i_205_ = i_204_ + i_179_;
							int i_206_ = (i_204_ & 0xff00ff) + (i_179_ & 0xff00ff);
							int i_207_ = ((i_206_ & 0x1000100) + (i_205_ - i_206_ & 0x10000));
							is[i_182_++] = i_205_ - i_207_ | i_207_ - (i_207_ >>> 8);
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 2) {
					int i_208_ = i_179_ >>> 24;
					int i_209_ = 256 - i_208_;
					int i_210_ = (i_179_ & 0xff00ff) * i_209_ & ~0xff00ff;
					int i_211_ = (i_179_ & 0xff00) * i_209_ & 0xff0000;
					i_179_ = (i_210_ | i_211_) >>> 8;
					for (int i_212_ = -i_184_; i_212_ < 0; i_212_++) {
						for (int i_213_ = -i_185_; i_213_ < 0; i_213_++) {
							int i_214_ = anIntArray5959[i_183_++];
							i_210_ = (i_214_ & 0xff00ff) * i_208_ & ~0xff00ff;
							i_211_ = (i_214_ & 0xff00) * i_208_ & 0xff0000;
							is[i_182_++] = ((i_210_ | i_211_) >>> 8) + i_179_;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_180_ == 1) {
				if (i_178_ == 1) {
					for (int i_215_ = -i_184_; i_215_ < 0; i_215_++) {
						int i_216_ = i_182_ + i_185_ - 3;
						while (i_182_ < i_216_) {
							int i_217_ = anIntArray5959[i_183_++];
							if (i_217_ != 0)
								is[i_182_++] = i_217_;
							else
								i_182_++;
							i_217_ = anIntArray5959[i_183_++];
							if (i_217_ != 0)
								is[i_182_++] = i_217_;
							else
								i_182_++;
							i_217_ = anIntArray5959[i_183_++];
							if (i_217_ != 0)
								is[i_182_++] = i_217_;
							else
								i_182_++;
							i_217_ = anIntArray5959[i_183_++];
							if (i_217_ != 0)
								is[i_182_++] = i_217_;
							else
								i_182_++;
						}
						i_216_ += 3;
						while (i_182_ < i_216_) {
							int i_218_ = anIntArray5959[i_183_++];
							if (i_218_ != 0)
								is[i_182_++] = i_218_;
							else
								i_182_++;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 0) {
					if ((i_179_ & 0xffffff) == 16777215) {
						int i_219_ = i_179_ >>> 24;
						int i_220_ = 256 - i_219_;
						for (int i_221_ = -i_184_; i_221_ < 0; i_221_++) {
							for (int i_222_ = -i_185_; i_222_ < 0; i_222_++) {
								int i_223_ = anIntArray5959[i_183_++];
								if (i_223_ != 0) {
									int i_224_ = is[i_182_];
									is[i_182_++] = ((((i_223_ & 0xff00ff) * i_219_ + (i_224_ & 0xff00ff) * i_220_) & ~0xff00ff) + (((i_223_ & 0xff00) * i_219_ + (i_224_ & 0xff00) * i_220_) & 0xff0000)) >> 8;
								} else
									i_182_++;
							}
							i_182_ += i_186_;
							i_183_ += i_187_;
						}
					} else {
						int i_225_ = (i_179_ & 0xff0000) >> 16;
						int i_226_ = (i_179_ & 0xff00) >> 8;
						int i_227_ = i_179_ & 0xff;
						int i_228_ = i_179_ >>> 24;
						int i_229_ = 256 - i_228_;
						for (int i_230_ = -i_184_; i_230_ < 0; i_230_++) {
							for (int i_231_ = -i_185_; i_231_ < 0; i_231_++) {
								int i_232_ = anIntArray5959[i_183_++];
								if (i_232_ != 0) {
									if (i_228_ != 255) {
										int i_233_ = ((i_232_ & 0xff0000) * i_225_ & ~0xffffff);
										int i_234_ = ((i_232_ & 0xff00) * i_226_ & 0xff0000);
										int i_235_ = ((i_232_ & 0xff) * i_227_ & 0xff00);
										i_232_ = (i_233_ | i_234_ | i_235_) >>> 8;
										int i_236_ = is[i_182_];
										is[i_182_++] = ((((i_232_ & 0xff00ff) * i_228_ + ((i_236_ & 0xff00ff) * i_229_)) & ~0xff00ff) + (((i_232_ & 0xff00) * i_228_ + ((i_236_ & 0xff00) * i_229_)) & 0xff0000)) >> 8;
									} else {
										int i_237_ = ((i_232_ & 0xff0000) * i_225_ & ~0xffffff);
										int i_238_ = ((i_232_ & 0xff00) * i_226_ & 0xff0000);
										int i_239_ = ((i_232_ & 0xff) * i_227_ & 0xff00);
										is[i_182_++] = (i_237_ | i_238_ | i_239_) >>> 8;
									}
								} else
									i_182_++;
							}
							i_182_ += i_186_;
							i_183_ += i_187_;
						}
						return;
					}
					return;
				}
				if (i_178_ == 3) {
					int i_240_ = i_179_ >>> 24;
					int i_241_ = 256 - i_240_;
					for (int i_242_ = -i_184_; i_242_ < 0; i_242_++) {
						for (int i_243_ = -i_185_; i_243_ < 0; i_243_++) {
							int i_244_ = anIntArray5959[i_183_++];
							int i_245_ = i_244_ + i_179_;
							int i_246_ = (i_244_ & 0xff00ff) + (i_179_ & 0xff00ff);
							int i_247_ = ((i_246_ & 0x1000100) + (i_245_ - i_246_ & 0x10000));
							i_247_ = i_245_ - i_247_ | i_247_ - (i_247_ >>> 8);
							if (i_244_ == 0 && i_240_ != 255) {
								i_244_ = i_247_;
								i_247_ = is[i_182_];
								i_247_ = ((((i_244_ & 0xff00ff) * i_240_ + (i_247_ & 0xff00ff) * i_241_) & ~0xff00ff) + (((i_244_ & 0xff00) * i_240_ + (i_247_ & 0xff00) * i_241_) & 0xff0000)) >> 8;
							}
							is[i_182_++] = i_247_;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 2) {
					int i_248_ = i_179_ >>> 24;
					int i_249_ = 256 - i_248_;
					int i_250_ = (i_179_ & 0xff00ff) * i_249_ & ~0xff00ff;
					int i_251_ = (i_179_ & 0xff00) * i_249_ & 0xff0000;
					i_179_ = (i_250_ | i_251_) >>> 8;
					for (int i_252_ = -i_184_; i_252_ < 0; i_252_++) {
						for (int i_253_ = -i_185_; i_253_ < 0; i_253_++) {
							int i_254_ = anIntArray5959[i_183_++];
							if (i_254_ != 0) {
								i_250_ = (i_254_ & 0xff00ff) * i_248_ & ~0xff00ff;
								i_251_ = (i_254_ & 0xff00) * i_248_ & 0xff0000;
								is[i_182_++] = ((i_250_ | i_251_) >>> 8) + i_179_;
							} else
								i_182_++;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_180_ == 2) {
				if (i_178_ == 1) {
					for (int i_255_ = -i_184_; i_255_ < 0; i_255_++) {
						for (int i_256_ = -i_185_; i_256_ < 0; i_256_++) {
							int i_257_ = anIntArray5959[i_183_++];
							if (i_257_ != 0) {
								int i_258_ = is[i_182_];
								int i_259_ = i_257_ + i_258_;
								int i_260_ = ((i_257_ & 0xff00ff) + (i_258_ & 0xff00ff));
								i_258_ = (i_260_ & 0x1000100) + (i_259_ - i_260_ & 0x10000);
								is[i_182_++] = i_259_ - i_258_ | i_258_ - (i_258_ >>> 8);
							} else
								i_182_++;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 0) {
					int i_261_ = (i_179_ & 0xff0000) >> 16;
					int i_262_ = (i_179_ & 0xff00) >> 8;
					int i_263_ = i_179_ & 0xff;
					for (int i_264_ = -i_184_; i_264_ < 0; i_264_++) {
						for (int i_265_ = -i_185_; i_265_ < 0; i_265_++) {
							int i_266_ = anIntArray5959[i_183_++];
							if (i_266_ != 0) {
								int i_267_ = (i_266_ & 0xff0000) * i_261_ & ~0xffffff;
								int i_268_ = (i_266_ & 0xff00) * i_262_ & 0xff0000;
								int i_269_ = (i_266_ & 0xff) * i_263_ & 0xff00;
								i_266_ = (i_267_ | i_268_ | i_269_) >>> 8;
								int i_270_ = is[i_182_];
								int i_271_ = i_266_ + i_270_;
								int i_272_ = ((i_266_ & 0xff00ff) + (i_270_ & 0xff00ff));
								i_270_ = (i_272_ & 0x1000100) + (i_271_ - i_272_ & 0x10000);
								is[i_182_++] = i_271_ - i_270_ | i_270_ - (i_270_ >>> 8);
							} else
								i_182_++;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 3) {
					for (int i_273_ = -i_184_; i_273_ < 0; i_273_++) {
						for (int i_274_ = -i_185_; i_274_ < 0; i_274_++) {
							int i_275_ = anIntArray5959[i_183_++];
							int i_276_ = i_275_ + i_179_;
							int i_277_ = (i_275_ & 0xff00ff) + (i_179_ & 0xff00ff);
							int i_278_ = ((i_277_ & 0x1000100) + (i_276_ - i_277_ & 0x10000));
							i_275_ = i_276_ - i_278_ | i_278_ - (i_278_ >>> 8);
							i_278_ = is[i_182_];
							i_276_ = i_275_ + i_278_;
							i_277_ = (i_275_ & 0xff00ff) + (i_278_ & 0xff00ff);
							i_278_ = (i_277_ & 0x1000100) + (i_276_ - i_277_ & 0x10000);
							is[i_182_++] = i_276_ - i_278_ | i_278_ - (i_278_ >>> 8);
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				if (i_178_ == 2) {
					int i_279_ = i_179_ >>> 24;
					int i_280_ = 256 - i_279_;
					int i_281_ = (i_179_ & 0xff00ff) * i_280_ & ~0xff00ff;
					int i_282_ = (i_179_ & 0xff00) * i_280_ & 0xff0000;
					i_179_ = (i_281_ | i_282_) >>> 8;
					for (int i_283_ = -i_184_; i_283_ < 0; i_283_++) {
						for (int i_284_ = -i_185_; i_284_ < 0; i_284_++) {
							int i_285_ = anIntArray5959[i_183_++];
							if (i_285_ != 0) {
								i_281_ = (i_285_ & 0xff00ff) * i_279_ & ~0xff00ff;
								i_282_ = (i_285_ & 0xff00) * i_279_ & 0xff0000;
								i_285_ = ((i_281_ | i_282_) >>> 8) + i_179_;
								int i_286_ = is[i_182_];
								int i_287_ = i_285_ + i_286_;
								int i_288_ = ((i_285_ & 0xff00ff) + (i_286_ & 0xff00ff));
								i_286_ = (i_288_ & 0x1000100) + (i_287_ - i_288_ & 0x10000);
								is[i_182_++] = i_287_ - i_286_ | i_286_ - (i_286_ >>> 8);
							} else
								i_182_++;
						}
						i_182_ += i_186_;
						i_183_ += i_187_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void BA(int i, int i_289_, int i_290_) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}

	final void method2216(int i, int i_291_) {
		int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_292_ = Class_l_Sub1.anInt5202;
				while (i_292_ < 0) {
					int i_293_ = Class_l_Sub1.anInt5217;
					int i_294_ = Class_l_Sub1.anInt5206;
					int i_295_ = Class_l_Sub1.anInt5207;
					int i_296_ = Class_l_Sub1.anInt5212;
					if (i_294_ >= 0 && i_295_ >= 0 && i_294_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0 && (i_295_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						for (/**/; i_296_ < 0; i_296_++) {
							int i_297_ = (((i_295_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_294_ >> 12));
							int i_298_ = i_293_++;
							int[] is_299_ = is;
							int i_300_ = i;
							int i_301_ = i_291_;
							if (i_301_ == 0) {
								if (i_300_ == 1)
									is_299_[i_298_] = anIntArray5959[i_297_];
								else if (i_300_ == 0) {
									int i_302_ = anIntArray5959[i_297_++];
									int i_303_ = (((i_302_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_304_ = (((i_302_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_305_ = (((i_302_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_299_[i_298_] = (i_303_ | i_304_ | i_305_) >>> 8;
								} else if (i_300_ == 3) {
									int i_306_ = anIntArray5959[i_297_++];
									int i_307_ = Class_l_Sub1.anInt5221;
									int i_308_ = i_306_ + i_307_;
									int i_309_ = ((i_306_ & 0xff00ff) + (i_307_ & 0xff00ff));
									int i_310_ = ((i_309_ & 0x1000100) + (i_308_ - i_309_ & 0x10000));
									is_299_[i_298_] = i_308_ - i_310_ | i_310_ - (i_310_ >>> 8);
								} else if (i_300_ == 2) {
									int i_311_ = anIntArray5959[i_297_];
									int i_312_ = (((i_311_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_313_ = (((i_311_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_299_[i_298_] = (((i_312_ | i_313_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_301_ == 1) {
								if (i_300_ == 1) {
									int i_314_ = anIntArray5959[i_297_];
									if (i_314_ != 0)
										is_299_[i_298_] = i_314_;
								} else if (i_300_ == 0) {
									int i_315_ = anIntArray5959[i_297_];
									if (i_315_ != 0) {
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_316_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_317_ = 256 - i_316_;
											int i_318_ = is_299_[i_298_];
											is_299_[i_298_] = (((((i_315_ & 0xff00ff) * i_316_) + ((i_318_ & 0xff00ff) * i_317_)) & ~0xff00ff) + ((((i_315_ & 0xff00) * i_316_) + ((i_318_ & 0xff00) * i_317_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_319_ = (((i_315_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_320_ = (((i_315_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_321_ = (((i_315_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_315_ = (i_319_ | i_320_ | i_321_) >>> 8;
											int i_322_ = is_299_[i_298_];
											is_299_[i_298_] = (((((i_315_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_322_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_315_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_322_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_323_ = (((i_315_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_324_ = (((i_315_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_325_ = (((i_315_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_299_[i_298_] = (i_323_ | i_324_ | i_325_) >>> 8;
										}
									}
								} else if (i_300_ == 3) {
									int i_326_ = anIntArray5959[i_297_];
									int i_327_ = Class_l_Sub1.anInt5221;
									int i_328_ = i_326_ + i_327_;
									int i_329_ = ((i_326_ & 0xff00ff) + (i_327_ & 0xff00ff));
									int i_330_ = ((i_329_ & 0x1000100) + (i_328_ - i_329_ & 0x10000));
									i_330_ = i_328_ - i_330_ | i_330_ - (i_330_ >>> 8);
									if (i_326_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_326_ = i_330_;
										i_330_ = is_299_[i_298_];
										i_330_ = (((((i_326_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_330_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_326_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_330_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_299_[i_298_] = i_330_;
								} else if (i_300_ == 2) {
									int i_331_ = anIntArray5959[i_297_];
									if (i_331_ != 0) {
										int i_332_ = (((i_331_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_333_ = (((i_331_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_299_[i_298_++] = (((i_332_ | i_333_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_301_ == 2) {
								if (i_300_ == 1) {
									int i_334_ = anIntArray5959[i_297_];
									if (i_334_ != 0) {
										int i_335_ = is_299_[i_298_];
										int i_336_ = i_334_ + i_335_;
										int i_337_ = ((i_334_ & 0xff00ff) + (i_335_ & 0xff00ff));
										i_335_ = ((i_337_ & 0x1000100) + (i_336_ - i_337_ & 0x10000));
										is_299_[i_298_] = (i_336_ - i_335_ | i_335_ - (i_335_ >>> 8));
									}
								} else if (i_300_ == 0) {
									int i_338_ = anIntArray5959[i_297_];
									if (i_338_ != 0) {
										int i_339_ = (((i_338_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_340_ = (((i_338_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_341_ = (((i_338_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_338_ = (i_339_ | i_340_ | i_341_) >>> 8;
										int i_342_ = is_299_[i_298_];
										int i_343_ = i_338_ + i_342_;
										int i_344_ = ((i_338_ & 0xff00ff) + (i_342_ & 0xff00ff));
										i_342_ = ((i_344_ & 0x1000100) + (i_343_ - i_344_ & 0x10000));
										is_299_[i_298_] = (i_343_ - i_342_ | i_342_ - (i_342_ >>> 8));
									}
								} else if (i_300_ == 3) {
									int i_345_ = anIntArray5959[i_297_];
									int i_346_ = Class_l_Sub1.anInt5221;
									int i_347_ = i_345_ + i_346_;
									int i_348_ = ((i_345_ & 0xff00ff) + (i_346_ & 0xff00ff));
									int i_349_ = ((i_348_ & 0x1000100) + (i_347_ - i_348_ & 0x10000));
									i_345_ = i_347_ - i_349_ | i_349_ - (i_349_ >>> 8);
									i_349_ = is_299_[i_298_];
									i_347_ = i_345_ + i_349_;
									i_348_ = (i_345_ & 0xff00ff) + (i_349_ & 0xff00ff);
									i_349_ = ((i_348_ & 0x1000100) + (i_347_ - i_348_ & 0x10000));
									is_299_[i_298_] = i_347_ - i_349_ | i_349_ - (i_349_ >>> 8);
								} else if (i_300_ == 2) {
									int i_350_ = anIntArray5959[i_297_];
									if (i_350_ != 0) {
										int i_351_ = (((i_350_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_352_ = (((i_350_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_350_ = (((i_351_ | i_352_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_353_ = is_299_[i_298_];
										int i_354_ = i_350_ + i_353_;
										int i_355_ = ((i_350_ & 0xff00ff) + (i_353_ & 0xff00ff));
										i_353_ = ((i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000));
										is_299_[i_298_] = (i_354_ - i_353_ | i_353_ - (i_353_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_292_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_356_ = Class_l_Sub1.anInt5202;
				while (i_356_ < 0) {
					int i_357_ = Class_l_Sub1.anInt5217;
					int i_358_ = Class_l_Sub1.anInt5206;
					int i_359_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_360_ = Class_l_Sub1.anInt5212;
					if (i_358_ >= 0 && (i_358_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						int i_361_;
						if ((i_361_ = i_359_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_361_ = ((Class_l_Sub1.anInt5226 - i_361_) / Class_l_Sub1.anInt5226);
							i_360_ += i_361_;
							i_359_ += Class_l_Sub1.anInt5226 * i_361_;
							i_357_ += i_361_;
						}
						if ((i_361_ = ((i_359_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_360_)
							i_360_ = i_361_;
						for (/**/; i_360_ < 0; i_360_++) {
							int i_362_ = (((i_359_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_358_ >> 12));
							int i_363_ = i_357_++;
							int[] is_364_ = is;
							int i_365_ = i;
							int i_366_ = i_291_;
							if (i_366_ == 0) {
								if (i_365_ == 1)
									is_364_[i_363_] = anIntArray5959[i_362_];
								else if (i_365_ == 0) {
									int i_367_ = anIntArray5959[i_362_++];
									int i_368_ = (((i_367_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_369_ = (((i_367_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_370_ = (((i_367_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_364_[i_363_] = (i_368_ | i_369_ | i_370_) >>> 8;
								} else if (i_365_ == 3) {
									int i_371_ = anIntArray5959[i_362_++];
									int i_372_ = Class_l_Sub1.anInt5221;
									int i_373_ = i_371_ + i_372_;
									int i_374_ = ((i_371_ & 0xff00ff) + (i_372_ & 0xff00ff));
									int i_375_ = ((i_374_ & 0x1000100) + (i_373_ - i_374_ & 0x10000));
									is_364_[i_363_] = i_373_ - i_375_ | i_375_ - (i_375_ >>> 8);
								} else if (i_365_ == 2) {
									int i_376_ = anIntArray5959[i_362_];
									int i_377_ = (((i_376_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_378_ = (((i_376_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_364_[i_363_] = (((i_377_ | i_378_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_366_ == 1) {
								if (i_365_ == 1) {
									int i_379_ = anIntArray5959[i_362_];
									if (i_379_ != 0)
										is_364_[i_363_] = i_379_;
								} else if (i_365_ == 0) {
									int i_380_ = anIntArray5959[i_362_];
									if (i_380_ != 0) {
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_381_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_382_ = 256 - i_381_;
											int i_383_ = is_364_[i_363_];
											is_364_[i_363_] = (((((i_380_ & 0xff00ff) * i_381_) + ((i_383_ & 0xff00ff) * i_382_)) & ~0xff00ff) + ((((i_380_ & 0xff00) * i_381_) + ((i_383_ & 0xff00) * i_382_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_384_ = (((i_380_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_385_ = (((i_380_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_386_ = (((i_380_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_380_ = (i_384_ | i_385_ | i_386_) >>> 8;
											int i_387_ = is_364_[i_363_];
											is_364_[i_363_] = (((((i_380_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_387_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_380_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_387_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_388_ = (((i_380_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_389_ = (((i_380_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_390_ = (((i_380_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_364_[i_363_] = (i_388_ | i_389_ | i_390_) >>> 8;
										}
									}
								} else if (i_365_ == 3) {
									int i_391_ = anIntArray5959[i_362_];
									int i_392_ = Class_l_Sub1.anInt5221;
									int i_393_ = i_391_ + i_392_;
									int i_394_ = ((i_391_ & 0xff00ff) + (i_392_ & 0xff00ff));
									int i_395_ = ((i_394_ & 0x1000100) + (i_393_ - i_394_ & 0x10000));
									i_395_ = i_393_ - i_395_ | i_395_ - (i_395_ >>> 8);
									if (i_391_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_391_ = i_395_;
										i_395_ = is_364_[i_363_];
										i_395_ = (((((i_391_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_395_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_391_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_395_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_364_[i_363_] = i_395_;
								} else if (i_365_ == 2) {
									int i_396_ = anIntArray5959[i_362_];
									if (i_396_ != 0) {
										int i_397_ = (((i_396_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_398_ = (((i_396_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_364_[i_363_++] = (((i_397_ | i_398_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_366_ == 2) {
								if (i_365_ == 1) {
									int i_399_ = anIntArray5959[i_362_];
									if (i_399_ != 0) {
										int i_400_ = is_364_[i_363_];
										int i_401_ = i_399_ + i_400_;
										int i_402_ = ((i_399_ & 0xff00ff) + (i_400_ & 0xff00ff));
										i_400_ = ((i_402_ & 0x1000100) + (i_401_ - i_402_ & 0x10000));
										is_364_[i_363_] = (i_401_ - i_400_ | i_400_ - (i_400_ >>> 8));
									}
								} else if (i_365_ == 0) {
									int i_403_ = anIntArray5959[i_362_];
									if (i_403_ != 0) {
										int i_404_ = (((i_403_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_405_ = (((i_403_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_406_ = (((i_403_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_403_ = (i_404_ | i_405_ | i_406_) >>> 8;
										int i_407_ = is_364_[i_363_];
										int i_408_ = i_403_ + i_407_;
										int i_409_ = ((i_403_ & 0xff00ff) + (i_407_ & 0xff00ff));
										i_407_ = ((i_409_ & 0x1000100) + (i_408_ - i_409_ & 0x10000));
										is_364_[i_363_] = (i_408_ - i_407_ | i_407_ - (i_407_ >>> 8));
									}
								} else if (i_365_ == 3) {
									int i_410_ = anIntArray5959[i_362_];
									int i_411_ = Class_l_Sub1.anInt5221;
									int i_412_ = i_410_ + i_411_;
									int i_413_ = ((i_410_ & 0xff00ff) + (i_411_ & 0xff00ff));
									int i_414_ = ((i_413_ & 0x1000100) + (i_412_ - i_413_ & 0x10000));
									i_410_ = i_412_ - i_414_ | i_414_ - (i_414_ >>> 8);
									i_414_ = is_364_[i_363_];
									i_412_ = i_410_ + i_414_;
									i_413_ = (i_410_ & 0xff00ff) + (i_414_ & 0xff00ff);
									i_414_ = ((i_413_ & 0x1000100) + (i_412_ - i_413_ & 0x10000));
									is_364_[i_363_] = i_412_ - i_414_ | i_414_ - (i_414_ >>> 8);
								} else if (i_365_ == 2) {
									int i_415_ = anIntArray5959[i_362_];
									if (i_415_ != 0) {
										int i_416_ = (((i_415_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_417_ = (((i_415_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_415_ = (((i_416_ | i_417_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_418_ = is_364_[i_363_];
										int i_419_ = i_415_ + i_418_;
										int i_420_ = ((i_415_ & 0xff00ff) + (i_418_ & 0xff00ff));
										i_418_ = ((i_420_ & 0x1000100) + (i_419_ - i_420_ & 0x10000));
										is_364_[i_363_] = (i_419_ - i_418_ | i_418_ - (i_418_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_359_ += Class_l_Sub1.anInt5226;
						}
					}
					i_356_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_421_ = Class_l_Sub1.anInt5202;
				while (i_421_ < 0) {
					int i_422_ = Class_l_Sub1.anInt5217;
					int i_423_ = Class_l_Sub1.anInt5206;
					int i_424_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_425_ = Class_l_Sub1.anInt5212;
					if (i_423_ >= 0 && (i_423_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						if (i_424_ < 0) {
							int i_426_ = ((Class_l_Sub1.anInt5226 - 1 - i_424_) / Class_l_Sub1.anInt5226);
							i_425_ += i_426_;
							i_424_ += Class_l_Sub1.anInt5226 * i_426_;
							i_422_ += i_426_;
						}
						int i_427_;
						if ((i_427_ = ((1 + i_424_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_425_)
							i_425_ = i_427_;
						for (/**/; i_425_ < 0; i_425_++) {
							int i_428_ = (((i_424_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_423_ >> 12));
							int i_429_ = i_422_++;
							int[] is_430_ = is;
							int i_431_ = i;
							int i_432_ = i_291_;
							if (i_432_ == 0) {
								if (i_431_ == 1)
									is_430_[i_429_] = anIntArray5959[i_428_];
								else if (i_431_ == 0) {
									int i_433_ = anIntArray5959[i_428_++];
									int i_434_ = (((i_433_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_435_ = (((i_433_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_436_ = (((i_433_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_430_[i_429_] = (i_434_ | i_435_ | i_436_) >>> 8;
								} else if (i_431_ == 3) {
									int i_437_ = anIntArray5959[i_428_++];
									int i_438_ = Class_l_Sub1.anInt5221;
									int i_439_ = i_437_ + i_438_;
									int i_440_ = ((i_437_ & 0xff00ff) + (i_438_ & 0xff00ff));
									int i_441_ = ((i_440_ & 0x1000100) + (i_439_ - i_440_ & 0x10000));
									is_430_[i_429_] = i_439_ - i_441_ | i_441_ - (i_441_ >>> 8);
								} else if (i_431_ == 2) {
									int i_442_ = anIntArray5959[i_428_];
									int i_443_ = (((i_442_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_444_ = (((i_442_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_430_[i_429_] = (((i_443_ | i_444_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_432_ == 1) {
								if (i_431_ == 1) {
									int i_445_ = anIntArray5959[i_428_];
									if (i_445_ != 0)
										is_430_[i_429_] = i_445_;
								} else if (i_431_ == 0) {
									int i_446_ = anIntArray5959[i_428_];
									if (i_446_ != 0) {
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_447_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_448_ = 256 - i_447_;
											int i_449_ = is_430_[i_429_];
											is_430_[i_429_] = (((((i_446_ & 0xff00ff) * i_447_) + ((i_449_ & 0xff00ff) * i_448_)) & ~0xff00ff) + ((((i_446_ & 0xff00) * i_447_) + ((i_449_ & 0xff00) * i_448_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_450_ = (((i_446_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_451_ = (((i_446_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_452_ = (((i_446_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_446_ = (i_450_ | i_451_ | i_452_) >>> 8;
											int i_453_ = is_430_[i_429_];
											is_430_[i_429_] = (((((i_446_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_453_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_446_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_453_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_454_ = (((i_446_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_455_ = (((i_446_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_456_ = (((i_446_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_430_[i_429_] = (i_454_ | i_455_ | i_456_) >>> 8;
										}
									}
								} else if (i_431_ == 3) {
									int i_457_ = anIntArray5959[i_428_];
									int i_458_ = Class_l_Sub1.anInt5221;
									int i_459_ = i_457_ + i_458_;
									int i_460_ = ((i_457_ & 0xff00ff) + (i_458_ & 0xff00ff));
									int i_461_ = ((i_460_ & 0x1000100) + (i_459_ - i_460_ & 0x10000));
									i_461_ = i_459_ - i_461_ | i_461_ - (i_461_ >>> 8);
									if (i_457_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_457_ = i_461_;
										i_461_ = is_430_[i_429_];
										i_461_ = (((((i_457_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_461_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_457_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_461_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_430_[i_429_] = i_461_;
								} else if (i_431_ == 2) {
									int i_462_ = anIntArray5959[i_428_];
									if (i_462_ != 0) {
										int i_463_ = (((i_462_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_464_ = (((i_462_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_430_[i_429_++] = (((i_463_ | i_464_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_432_ == 2) {
								if (i_431_ == 1) {
									int i_465_ = anIntArray5959[i_428_];
									if (i_465_ != 0) {
										int i_466_ = is_430_[i_429_];
										int i_467_ = i_465_ + i_466_;
										int i_468_ = ((i_465_ & 0xff00ff) + (i_466_ & 0xff00ff));
										i_466_ = ((i_468_ & 0x1000100) + (i_467_ - i_468_ & 0x10000));
										is_430_[i_429_] = (i_467_ - i_466_ | i_466_ - (i_466_ >>> 8));
									}
								} else if (i_431_ == 0) {
									int i_469_ = anIntArray5959[i_428_];
									if (i_469_ != 0) {
										int i_470_ = (((i_469_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_471_ = (((i_469_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_472_ = (((i_469_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_469_ = (i_470_ | i_471_ | i_472_) >>> 8;
										int i_473_ = is_430_[i_429_];
										int i_474_ = i_469_ + i_473_;
										int i_475_ = ((i_469_ & 0xff00ff) + (i_473_ & 0xff00ff));
										i_473_ = ((i_475_ & 0x1000100) + (i_474_ - i_475_ & 0x10000));
										is_430_[i_429_] = (i_474_ - i_473_ | i_473_ - (i_473_ >>> 8));
									}
								} else if (i_431_ == 3) {
									int i_476_ = anIntArray5959[i_428_];
									int i_477_ = Class_l_Sub1.anInt5221;
									int i_478_ = i_476_ + i_477_;
									int i_479_ = ((i_476_ & 0xff00ff) + (i_477_ & 0xff00ff));
									int i_480_ = ((i_479_ & 0x1000100) + (i_478_ - i_479_ & 0x10000));
									i_476_ = i_478_ - i_480_ | i_480_ - (i_480_ >>> 8);
									i_480_ = is_430_[i_429_];
									i_478_ = i_476_ + i_480_;
									i_479_ = (i_476_ & 0xff00ff) + (i_480_ & 0xff00ff);
									i_480_ = ((i_479_ & 0x1000100) + (i_478_ - i_479_ & 0x10000));
									is_430_[i_429_] = i_478_ - i_480_ | i_480_ - (i_480_ >>> 8);
								} else if (i_431_ == 2) {
									int i_481_ = anIntArray5959[i_428_];
									if (i_481_ != 0) {
										int i_482_ = (((i_481_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_483_ = (((i_481_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_481_ = (((i_482_ | i_483_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_484_ = is_430_[i_429_];
										int i_485_ = i_481_ + i_484_;
										int i_486_ = ((i_481_ & 0xff00ff) + (i_484_ & 0xff00ff));
										i_484_ = ((i_486_ & 0x1000100) + (i_485_ - i_486_ & 0x10000));
										is_430_[i_429_] = (i_485_ - i_484_ | i_484_ - (i_484_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_424_ += Class_l_Sub1.anInt5226;
						}
					}
					i_421_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_487_ = Class_l_Sub1.anInt5202;
				while (i_487_ < 0) {
					int i_488_ = Class_l_Sub1.anInt5217;
					int i_489_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_490_ = Class_l_Sub1.anInt5207;
					int i_491_ = Class_l_Sub1.anInt5212;
					if (i_490_ >= 0 && (i_490_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						int i_492_;
						if ((i_492_ = i_489_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_492_ = ((Class_l_Sub1.anInt5214 - i_492_) / Class_l_Sub1.anInt5214);
							i_491_ += i_492_;
							i_489_ += Class_l_Sub1.anInt5214 * i_492_;
							i_488_ += i_492_;
						}
						if ((i_492_ = ((i_489_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_491_)
							i_491_ = i_492_;
						for (/**/; i_491_ < 0; i_491_++) {
							int i_493_ = (((i_490_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_489_ >> 12));
							int i_494_ = i_488_++;
							int[] is_495_ = is;
							int i_496_ = i;
							int i_497_ = i_291_;
							if (i_497_ == 0) {
								if (i_496_ == 1)
									is_495_[i_494_] = anIntArray5959[i_493_];
								else if (i_496_ == 0) {
									int i_498_ = anIntArray5959[i_493_++];
									int i_499_ = (((i_498_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_500_ = (((i_498_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_501_ = (((i_498_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_495_[i_494_] = (i_499_ | i_500_ | i_501_) >>> 8;
								} else if (i_496_ == 3) {
									int i_502_ = anIntArray5959[i_493_++];
									int i_503_ = Class_l_Sub1.anInt5221;
									int i_504_ = i_502_ + i_503_;
									int i_505_ = ((i_502_ & 0xff00ff) + (i_503_ & 0xff00ff));
									int i_506_ = ((i_505_ & 0x1000100) + (i_504_ - i_505_ & 0x10000));
									is_495_[i_494_] = i_504_ - i_506_ | i_506_ - (i_506_ >>> 8);
								} else if (i_496_ == 2) {
									int i_507_ = anIntArray5959[i_493_];
									int i_508_ = (((i_507_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_509_ = (((i_507_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_495_[i_494_] = (((i_508_ | i_509_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_497_ == 1) {
								if (i_496_ == 1) {
									int i_510_ = anIntArray5959[i_493_];
									if (i_510_ != 0)
										is_495_[i_494_] = i_510_;
								} else if (i_496_ == 0) {
									int i_511_ = anIntArray5959[i_493_];
									if (i_511_ != 0) {
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_512_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_513_ = 256 - i_512_;
											int i_514_ = is_495_[i_494_];
											is_495_[i_494_] = (((((i_511_ & 0xff00ff) * i_512_) + ((i_514_ & 0xff00ff) * i_513_)) & ~0xff00ff) + ((((i_511_ & 0xff00) * i_512_) + ((i_514_ & 0xff00) * i_513_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_515_ = (((i_511_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_516_ = (((i_511_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_517_ = (((i_511_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_511_ = (i_515_ | i_516_ | i_517_) >>> 8;
											int i_518_ = is_495_[i_494_];
											is_495_[i_494_] = (((((i_511_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_518_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_511_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_518_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_519_ = (((i_511_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_520_ = (((i_511_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_521_ = (((i_511_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_495_[i_494_] = (i_519_ | i_520_ | i_521_) >>> 8;
										}
									}
								} else if (i_496_ == 3) {
									int i_522_ = anIntArray5959[i_493_];
									int i_523_ = Class_l_Sub1.anInt5221;
									int i_524_ = i_522_ + i_523_;
									int i_525_ = ((i_522_ & 0xff00ff) + (i_523_ & 0xff00ff));
									int i_526_ = ((i_525_ & 0x1000100) + (i_524_ - i_525_ & 0x10000));
									i_526_ = i_524_ - i_526_ | i_526_ - (i_526_ >>> 8);
									if (i_522_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_522_ = i_526_;
										i_526_ = is_495_[i_494_];
										i_526_ = (((((i_522_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_526_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_522_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_526_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_495_[i_494_] = i_526_;
								} else if (i_496_ == 2) {
									int i_527_ = anIntArray5959[i_493_];
									if (i_527_ != 0) {
										int i_528_ = (((i_527_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_529_ = (((i_527_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_495_[i_494_++] = (((i_528_ | i_529_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_497_ == 2) {
								if (i_496_ == 1) {
									int i_530_ = anIntArray5959[i_493_];
									if (i_530_ != 0) {
										int i_531_ = is_495_[i_494_];
										int i_532_ = i_530_ + i_531_;
										int i_533_ = ((i_530_ & 0xff00ff) + (i_531_ & 0xff00ff));
										i_531_ = ((i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000));
										is_495_[i_494_] = (i_532_ - i_531_ | i_531_ - (i_531_ >>> 8));
									}
								} else if (i_496_ == 0) {
									int i_534_ = anIntArray5959[i_493_];
									if (i_534_ != 0) {
										int i_535_ = (((i_534_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_536_ = (((i_534_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_537_ = (((i_534_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_534_ = (i_535_ | i_536_ | i_537_) >>> 8;
										int i_538_ = is_495_[i_494_];
										int i_539_ = i_534_ + i_538_;
										int i_540_ = ((i_534_ & 0xff00ff) + (i_538_ & 0xff00ff));
										i_538_ = ((i_540_ & 0x1000100) + (i_539_ - i_540_ & 0x10000));
										is_495_[i_494_] = (i_539_ - i_538_ | i_538_ - (i_538_ >>> 8));
									}
								} else if (i_496_ == 3) {
									int i_541_ = anIntArray5959[i_493_];
									int i_542_ = Class_l_Sub1.anInt5221;
									int i_543_ = i_541_ + i_542_;
									int i_544_ = ((i_541_ & 0xff00ff) + (i_542_ & 0xff00ff));
									int i_545_ = ((i_544_ & 0x1000100) + (i_543_ - i_544_ & 0x10000));
									i_541_ = i_543_ - i_545_ | i_545_ - (i_545_ >>> 8);
									i_545_ = is_495_[i_494_];
									i_543_ = i_541_ + i_545_;
									i_544_ = (i_541_ & 0xff00ff) + (i_545_ & 0xff00ff);
									i_545_ = ((i_544_ & 0x1000100) + (i_543_ - i_544_ & 0x10000));
									is_495_[i_494_] = i_543_ - i_545_ | i_545_ - (i_545_ >>> 8);
								} else if (i_496_ == 2) {
									int i_546_ = anIntArray5959[i_493_];
									if (i_546_ != 0) {
										int i_547_ = (((i_546_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_548_ = (((i_546_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_546_ = (((i_547_ | i_548_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_549_ = is_495_[i_494_];
										int i_550_ = i_546_ + i_549_;
										int i_551_ = ((i_546_ & 0xff00ff) + (i_549_ & 0xff00ff));
										i_549_ = ((i_551_ & 0x1000100) + (i_550_ - i_551_ & 0x10000));
										is_495_[i_494_] = (i_550_ - i_549_ | i_549_ - (i_549_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_489_ += Class_l_Sub1.anInt5214;
						}
					}
					i_487_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_552_ = Class_l_Sub1.anInt5202;
				while (i_552_ < 0) {
					int i_553_ = Class_l_Sub1.anInt5217;
					int i_554_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_555_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_556_ = Class_l_Sub1.anInt5212;
					int i_557_;
					if ((i_557_ = i_554_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_557_ = ((Class_l_Sub1.anInt5214 - i_557_) / Class_l_Sub1.anInt5214);
						i_556_ += i_557_;
						i_554_ += Class_l_Sub1.anInt5214 * i_557_;
						i_555_ += Class_l_Sub1.anInt5226 * i_557_;
						i_553_ += i_557_;
					}
					if ((i_557_ = ((i_554_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_556_)
						i_556_ = i_557_;
					if ((i_557_ = i_555_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_557_ = ((Class_l_Sub1.anInt5226 - i_557_) / Class_l_Sub1.anInt5226);
						i_556_ += i_557_;
						i_554_ += Class_l_Sub1.anInt5214 * i_557_;
						i_555_ += Class_l_Sub1.anInt5226 * i_557_;
						i_553_ += i_557_;
					}
					if ((i_557_ = ((i_555_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_556_)
						i_556_ = i_557_;
					for (/**/; i_556_ < 0; i_556_++) {
						int i_558_ = ((i_555_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_554_ >> 12));
						int i_559_ = i_553_++;
						int[] is_560_ = is;
						int i_561_ = i;
						int i_562_ = i_291_;
						if (i_562_ == 0) {
							if (i_561_ == 1)
								is_560_[i_559_] = anIntArray5959[i_558_];
							else if (i_561_ == 0) {
								int i_563_ = anIntArray5959[i_558_++];
								int i_564_ = (((i_563_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_565_ = (((i_563_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_566_ = ((i_563_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_560_[i_559_] = (i_564_ | i_565_ | i_566_) >>> 8;
							} else if (i_561_ == 3) {
								int i_567_ = anIntArray5959[i_558_++];
								int i_568_ = Class_l_Sub1.anInt5221;
								int i_569_ = i_567_ + i_568_;
								int i_570_ = ((i_567_ & 0xff00ff) + (i_568_ & 0xff00ff));
								int i_571_ = ((i_570_ & 0x1000100) + (i_569_ - i_570_ & 0x10000));
								is_560_[i_559_] = i_569_ - i_571_ | i_571_ - (i_571_ >>> 8);
							} else if (i_561_ == 2) {
								int i_572_ = anIntArray5959[i_558_];
								int i_573_ = (((i_572_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_574_ = (((i_572_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_560_[i_559_] = (((i_573_ | i_574_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_562_ == 1) {
							if (i_561_ == 1) {
								int i_575_ = anIntArray5959[i_558_];
								if (i_575_ != 0)
									is_560_[i_559_] = i_575_;
							} else if (i_561_ == 0) {
								int i_576_ = anIntArray5959[i_558_];
								if (i_576_ != 0) {
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_577_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_578_ = 256 - i_577_;
										int i_579_ = is_560_[i_559_];
										is_560_[i_559_] = ((((i_576_ & 0xff00ff) * i_577_ + ((i_579_ & 0xff00ff) * i_578_)) & ~0xff00ff) + (((i_576_ & 0xff00) * i_577_ + ((i_579_ & 0xff00) * i_578_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_580_ = (((i_576_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_581_ = (((i_576_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_582_ = (((i_576_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_576_ = (i_580_ | i_581_ | i_582_) >>> 8;
										int i_583_ = is_560_[i_559_];
										is_560_[i_559_] = (((((i_576_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_583_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_576_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_583_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_584_ = (((i_576_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_585_ = (((i_576_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_586_ = (((i_576_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_560_[i_559_] = (i_584_ | i_585_ | i_586_) >>> 8;
									}
								}
							} else if (i_561_ == 3) {
								int i_587_ = anIntArray5959[i_558_];
								int i_588_ = Class_l_Sub1.anInt5221;
								int i_589_ = i_587_ + i_588_;
								int i_590_ = ((i_587_ & 0xff00ff) + (i_588_ & 0xff00ff));
								int i_591_ = ((i_590_ & 0x1000100) + (i_589_ - i_590_ & 0x10000));
								i_591_ = i_589_ - i_591_ | i_591_ - (i_591_ >>> 8);
								if (i_587_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_587_ = i_591_;
									i_591_ = is_560_[i_559_];
									i_591_ = (((((i_587_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_591_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_587_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_591_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_560_[i_559_] = i_591_;
							} else if (i_561_ == 2) {
								int i_592_ = anIntArray5959[i_558_];
								if (i_592_ != 0) {
									int i_593_ = (((i_592_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_594_ = (((i_592_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_560_[i_559_++] = (((i_593_ | i_594_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_562_ == 2) {
							if (i_561_ == 1) {
								int i_595_ = anIntArray5959[i_558_];
								if (i_595_ != 0) {
									int i_596_ = is_560_[i_559_];
									int i_597_ = i_595_ + i_596_;
									int i_598_ = ((i_595_ & 0xff00ff) + (i_596_ & 0xff00ff));
									i_596_ = ((i_598_ & 0x1000100) + (i_597_ - i_598_ & 0x10000));
									is_560_[i_559_] = i_597_ - i_596_ | i_596_ - (i_596_ >>> 8);
								}
							} else if (i_561_ == 0) {
								int i_599_ = anIntArray5959[i_558_];
								if (i_599_ != 0) {
									int i_600_ = (((i_599_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_601_ = (((i_599_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_602_ = (((i_599_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_599_ = (i_600_ | i_601_ | i_602_) >>> 8;
									int i_603_ = is_560_[i_559_];
									int i_604_ = i_599_ + i_603_;
									int i_605_ = ((i_599_ & 0xff00ff) + (i_603_ & 0xff00ff));
									i_603_ = ((i_605_ & 0x1000100) + (i_604_ - i_605_ & 0x10000));
									is_560_[i_559_] = i_604_ - i_603_ | i_603_ - (i_603_ >>> 8);
								}
							} else if (i_561_ == 3) {
								int i_606_ = anIntArray5959[i_558_];
								int i_607_ = Class_l_Sub1.anInt5221;
								int i_608_ = i_606_ + i_607_;
								int i_609_ = ((i_606_ & 0xff00ff) + (i_607_ & 0xff00ff));
								int i_610_ = ((i_609_ & 0x1000100) + (i_608_ - i_609_ & 0x10000));
								i_606_ = i_608_ - i_610_ | i_610_ - (i_610_ >>> 8);
								i_610_ = is_560_[i_559_];
								i_608_ = i_606_ + i_610_;
								i_609_ = (i_606_ & 0xff00ff) + (i_610_ & 0xff00ff);
								i_610_ = (i_609_ & 0x1000100) + (i_608_ - i_609_ & 0x10000);
								is_560_[i_559_] = i_608_ - i_610_ | i_610_ - (i_610_ >>> 8);
							} else if (i_561_ == 2) {
								int i_611_ = anIntArray5959[i_558_];
								if (i_611_ != 0) {
									int i_612_ = (((i_611_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_613_ = (((i_611_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_611_ = (((i_612_ | i_613_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_614_ = is_560_[i_559_];
									int i_615_ = i_611_ + i_614_;
									int i_616_ = ((i_611_ & 0xff00ff) + (i_614_ & 0xff00ff));
									i_614_ = ((i_616_ & 0x1000100) + (i_615_ - i_616_ & 0x10000));
									is_560_[i_559_] = i_615_ - i_614_ | i_614_ - (i_614_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_554_ += Class_l_Sub1.anInt5214;
						i_555_ += Class_l_Sub1.anInt5226;
					}
					i_552_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_617_ = Class_l_Sub1.anInt5202;
				while (i_617_ < 0) {
					int i_618_ = Class_l_Sub1.anInt5217;
					int i_619_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_620_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_621_ = Class_l_Sub1.anInt5212;
					int i_622_;
					if ((i_622_ = i_619_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_622_ = ((Class_l_Sub1.anInt5214 - i_622_) / Class_l_Sub1.anInt5214);
						i_621_ += i_622_;
						i_619_ += Class_l_Sub1.anInt5214 * i_622_;
						i_620_ += Class_l_Sub1.anInt5226 * i_622_;
						i_618_ += i_622_;
					}
					if ((i_622_ = ((i_619_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_621_)
						i_621_ = i_622_;
					if (i_620_ < 0) {
						i_622_ = ((Class_l_Sub1.anInt5226 - 1 - i_620_) / Class_l_Sub1.anInt5226);
						i_621_ += i_622_;
						i_619_ += Class_l_Sub1.anInt5214 * i_622_;
						i_620_ += Class_l_Sub1.anInt5226 * i_622_;
						i_618_ += i_622_;
					}
					if ((i_622_ = (1 + i_620_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_621_)
						i_621_ = i_622_;
					for (/**/; i_621_ < 0; i_621_++) {
						int i_623_ = ((i_620_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_619_ >> 12));
						int i_624_ = i_618_++;
						int[] is_625_ = is;
						int i_626_ = i;
						int i_627_ = i_291_;
						if (i_627_ == 0) {
							if (i_626_ == 1)
								is_625_[i_624_] = anIntArray5959[i_623_];
							else if (i_626_ == 0) {
								int i_628_ = anIntArray5959[i_623_++];
								int i_629_ = (((i_628_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_630_ = (((i_628_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_631_ = ((i_628_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_625_[i_624_] = (i_629_ | i_630_ | i_631_) >>> 8;
							} else if (i_626_ == 3) {
								int i_632_ = anIntArray5959[i_623_++];
								int i_633_ = Class_l_Sub1.anInt5221;
								int i_634_ = i_632_ + i_633_;
								int i_635_ = ((i_632_ & 0xff00ff) + (i_633_ & 0xff00ff));
								int i_636_ = ((i_635_ & 0x1000100) + (i_634_ - i_635_ & 0x10000));
								is_625_[i_624_] = i_634_ - i_636_ | i_636_ - (i_636_ >>> 8);
							} else if (i_626_ == 2) {
								int i_637_ = anIntArray5959[i_623_];
								int i_638_ = (((i_637_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_639_ = (((i_637_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_625_[i_624_] = (((i_638_ | i_639_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_627_ == 1) {
							if (i_626_ == 1) {
								int i_640_ = anIntArray5959[i_623_];
								if (i_640_ != 0)
									is_625_[i_624_] = i_640_;
							} else if (i_626_ == 0) {
								int i_641_ = anIntArray5959[i_623_];
								if (i_641_ != 0) {
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_642_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_643_ = 256 - i_642_;
										int i_644_ = is_625_[i_624_];
										is_625_[i_624_] = ((((i_641_ & 0xff00ff) * i_642_ + ((i_644_ & 0xff00ff) * i_643_)) & ~0xff00ff) + (((i_641_ & 0xff00) * i_642_ + ((i_644_ & 0xff00) * i_643_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_645_ = (((i_641_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_646_ = (((i_641_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_647_ = (((i_641_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_641_ = (i_645_ | i_646_ | i_647_) >>> 8;
										int i_648_ = is_625_[i_624_];
										is_625_[i_624_] = (((((i_641_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_648_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_641_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_648_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_649_ = (((i_641_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_650_ = (((i_641_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_651_ = (((i_641_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_625_[i_624_] = (i_649_ | i_650_ | i_651_) >>> 8;
									}
								}
							} else if (i_626_ == 3) {
								int i_652_ = anIntArray5959[i_623_];
								int i_653_ = Class_l_Sub1.anInt5221;
								int i_654_ = i_652_ + i_653_;
								int i_655_ = ((i_652_ & 0xff00ff) + (i_653_ & 0xff00ff));
								int i_656_ = ((i_655_ & 0x1000100) + (i_654_ - i_655_ & 0x10000));
								i_656_ = i_654_ - i_656_ | i_656_ - (i_656_ >>> 8);
								if (i_652_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_652_ = i_656_;
									i_656_ = is_625_[i_624_];
									i_656_ = (((((i_652_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_656_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_652_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_656_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_625_[i_624_] = i_656_;
							} else if (i_626_ == 2) {
								int i_657_ = anIntArray5959[i_623_];
								if (i_657_ != 0) {
									int i_658_ = (((i_657_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_659_ = (((i_657_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_625_[i_624_++] = (((i_658_ | i_659_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_627_ == 2) {
							if (i_626_ == 1) {
								int i_660_ = anIntArray5959[i_623_];
								if (i_660_ != 0) {
									int i_661_ = is_625_[i_624_];
									int i_662_ = i_660_ + i_661_;
									int i_663_ = ((i_660_ & 0xff00ff) + (i_661_ & 0xff00ff));
									i_661_ = ((i_663_ & 0x1000100) + (i_662_ - i_663_ & 0x10000));
									is_625_[i_624_] = i_662_ - i_661_ | i_661_ - (i_661_ >>> 8);
								}
							} else if (i_626_ == 0) {
								int i_664_ = anIntArray5959[i_623_];
								if (i_664_ != 0) {
									int i_665_ = (((i_664_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_666_ = (((i_664_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_667_ = (((i_664_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_664_ = (i_665_ | i_666_ | i_667_) >>> 8;
									int i_668_ = is_625_[i_624_];
									int i_669_ = i_664_ + i_668_;
									int i_670_ = ((i_664_ & 0xff00ff) + (i_668_ & 0xff00ff));
									i_668_ = ((i_670_ & 0x1000100) + (i_669_ - i_670_ & 0x10000));
									is_625_[i_624_] = i_669_ - i_668_ | i_668_ - (i_668_ >>> 8);
								}
							} else if (i_626_ == 3) {
								int i_671_ = anIntArray5959[i_623_];
								int i_672_ = Class_l_Sub1.anInt5221;
								int i_673_ = i_671_ + i_672_;
								int i_674_ = ((i_671_ & 0xff00ff) + (i_672_ & 0xff00ff));
								int i_675_ = ((i_674_ & 0x1000100) + (i_673_ - i_674_ & 0x10000));
								i_671_ = i_673_ - i_675_ | i_675_ - (i_675_ >>> 8);
								i_675_ = is_625_[i_624_];
								i_673_ = i_671_ + i_675_;
								i_674_ = (i_671_ & 0xff00ff) + (i_675_ & 0xff00ff);
								i_675_ = (i_674_ & 0x1000100) + (i_673_ - i_674_ & 0x10000);
								is_625_[i_624_] = i_673_ - i_675_ | i_675_ - (i_675_ >>> 8);
							} else if (i_626_ == 2) {
								int i_676_ = anIntArray5959[i_623_];
								if (i_676_ != 0) {
									int i_677_ = (((i_676_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_678_ = (((i_676_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_676_ = (((i_677_ | i_678_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_679_ = is_625_[i_624_];
									int i_680_ = i_676_ + i_679_;
									int i_681_ = ((i_676_ & 0xff00ff) + (i_679_ & 0xff00ff));
									i_679_ = ((i_681_ & 0x1000100) + (i_680_ - i_681_ & 0x10000));
									is_625_[i_624_] = i_680_ - i_679_ | i_679_ - (i_679_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_619_ += Class_l_Sub1.anInt5214;
						i_620_ += Class_l_Sub1.anInt5226;
					}
					i_617_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_682_ = Class_l_Sub1.anInt5202;
			while (i_682_ < 0) {
				int i_683_ = Class_l_Sub1.anInt5217;
				int i_684_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_685_ = Class_l_Sub1.anInt5207;
				int i_686_ = Class_l_Sub1.anInt5212;
				if (i_685_ >= 0 && i_685_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
					if (i_684_ < 0) {
						int i_687_ = ((Class_l_Sub1.anInt5214 - 1 - i_684_) / Class_l_Sub1.anInt5214);
						i_686_ += i_687_;
						i_684_ += Class_l_Sub1.anInt5214 * i_687_;
						i_683_ += i_687_;
					}
					int i_688_;
					if ((i_688_ = (1 + i_684_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_686_)
						i_686_ = i_688_;
					for (/**/; i_686_ < 0; i_686_++) {
						int i_689_ = ((i_685_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_684_ >> 12));
						int i_690_ = i_683_++;
						int[] is_691_ = is;
						int i_692_ = i;
						int i_693_ = i_291_;
						if (i_693_ == 0) {
							if (i_692_ == 1)
								is_691_[i_690_] = anIntArray5959[i_689_];
							else if (i_692_ == 0) {
								int i_694_ = anIntArray5959[i_689_++];
								int i_695_ = (((i_694_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_696_ = (((i_694_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_697_ = ((i_694_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_691_[i_690_] = (i_695_ | i_696_ | i_697_) >>> 8;
							} else if (i_692_ == 3) {
								int i_698_ = anIntArray5959[i_689_++];
								int i_699_ = Class_l_Sub1.anInt5221;
								int i_700_ = i_698_ + i_699_;
								int i_701_ = ((i_698_ & 0xff00ff) + (i_699_ & 0xff00ff));
								int i_702_ = ((i_701_ & 0x1000100) + (i_700_ - i_701_ & 0x10000));
								is_691_[i_690_] = i_700_ - i_702_ | i_702_ - (i_702_ >>> 8);
							} else if (i_692_ == 2) {
								int i_703_ = anIntArray5959[i_689_];
								int i_704_ = (((i_703_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_705_ = (((i_703_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_691_[i_690_] = (((i_704_ | i_705_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_693_ == 1) {
							if (i_692_ == 1) {
								int i_706_ = anIntArray5959[i_689_];
								if (i_706_ != 0)
									is_691_[i_690_] = i_706_;
							} else if (i_692_ == 0) {
								int i_707_ = anIntArray5959[i_689_];
								if (i_707_ != 0) {
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_708_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_709_ = 256 - i_708_;
										int i_710_ = is_691_[i_690_];
										is_691_[i_690_] = ((((i_707_ & 0xff00ff) * i_708_ + ((i_710_ & 0xff00ff) * i_709_)) & ~0xff00ff) + (((i_707_ & 0xff00) * i_708_ + ((i_710_ & 0xff00) * i_709_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_711_ = (((i_707_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_712_ = (((i_707_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_713_ = (((i_707_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_707_ = (i_711_ | i_712_ | i_713_) >>> 8;
										int i_714_ = is_691_[i_690_];
										is_691_[i_690_] = (((((i_707_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_714_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_707_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_714_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_715_ = (((i_707_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_716_ = (((i_707_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_717_ = (((i_707_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_691_[i_690_] = (i_715_ | i_716_ | i_717_) >>> 8;
									}
								}
							} else if (i_692_ == 3) {
								int i_718_ = anIntArray5959[i_689_];
								int i_719_ = Class_l_Sub1.anInt5221;
								int i_720_ = i_718_ + i_719_;
								int i_721_ = ((i_718_ & 0xff00ff) + (i_719_ & 0xff00ff));
								int i_722_ = ((i_721_ & 0x1000100) + (i_720_ - i_721_ & 0x10000));
								i_722_ = i_720_ - i_722_ | i_722_ - (i_722_ >>> 8);
								if (i_718_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_718_ = i_722_;
									i_722_ = is_691_[i_690_];
									i_722_ = (((((i_718_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_722_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_718_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_722_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_691_[i_690_] = i_722_;
							} else if (i_692_ == 2) {
								int i_723_ = anIntArray5959[i_689_];
								if (i_723_ != 0) {
									int i_724_ = (((i_723_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_725_ = (((i_723_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_691_[i_690_++] = (((i_724_ | i_725_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_693_ == 2) {
							if (i_692_ == 1) {
								int i_726_ = anIntArray5959[i_689_];
								if (i_726_ != 0) {
									int i_727_ = is_691_[i_690_];
									int i_728_ = i_726_ + i_727_;
									int i_729_ = ((i_726_ & 0xff00ff) + (i_727_ & 0xff00ff));
									i_727_ = ((i_729_ & 0x1000100) + (i_728_ - i_729_ & 0x10000));
									is_691_[i_690_] = i_728_ - i_727_ | i_727_ - (i_727_ >>> 8);
								}
							} else if (i_692_ == 0) {
								int i_730_ = anIntArray5959[i_689_];
								if (i_730_ != 0) {
									int i_731_ = (((i_730_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_732_ = (((i_730_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_733_ = (((i_730_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_730_ = (i_731_ | i_732_ | i_733_) >>> 8;
									int i_734_ = is_691_[i_690_];
									int i_735_ = i_730_ + i_734_;
									int i_736_ = ((i_730_ & 0xff00ff) + (i_734_ & 0xff00ff));
									i_734_ = ((i_736_ & 0x1000100) + (i_735_ - i_736_ & 0x10000));
									is_691_[i_690_] = i_735_ - i_734_ | i_734_ - (i_734_ >>> 8);
								}
							} else if (i_692_ == 3) {
								int i_737_ = anIntArray5959[i_689_];
								int i_738_ = Class_l_Sub1.anInt5221;
								int i_739_ = i_737_ + i_738_;
								int i_740_ = ((i_737_ & 0xff00ff) + (i_738_ & 0xff00ff));
								int i_741_ = ((i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000));
								i_737_ = i_739_ - i_741_ | i_741_ - (i_741_ >>> 8);
								i_741_ = is_691_[i_690_];
								i_739_ = i_737_ + i_741_;
								i_740_ = (i_737_ & 0xff00ff) + (i_741_ & 0xff00ff);
								i_741_ = (i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000);
								is_691_[i_690_] = i_739_ - i_741_ | i_741_ - (i_741_ >>> 8);
							} else if (i_692_ == 2) {
								int i_742_ = anIntArray5959[i_689_];
								if (i_742_ != 0) {
									int i_743_ = (((i_742_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_744_ = (((i_742_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_742_ = (((i_743_ | i_744_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_745_ = is_691_[i_690_];
									int i_746_ = i_742_ + i_745_;
									int i_747_ = ((i_742_ & 0xff00ff) + (i_745_ & 0xff00ff));
									i_745_ = ((i_747_ & 0x1000100) + (i_746_ - i_747_ & 0x10000));
									is_691_[i_690_] = i_746_ - i_745_ | i_745_ - (i_745_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_684_ += Class_l_Sub1.anInt5214;
					}
				}
				i_682_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			for (int i_748_ = Class_l_Sub1.anInt5202; i_748_ < 0; i_748_++) {
				int i_749_ = Class_l_Sub1.anInt5217;
				int i_750_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_751_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_752_ = Class_l_Sub1.anInt5212;
				if (i_750_ < 0) {
					int i_753_ = ((Class_l_Sub1.anInt5214 - 1 - i_750_) / Class_l_Sub1.anInt5214);
					i_752_ += i_753_;
					i_750_ += Class_l_Sub1.anInt5214 * i_753_;
					i_751_ += Class_l_Sub1.anInt5226 * i_753_;
					i_749_ += i_753_;
				}
				int i_754_;
				if ((i_754_ = (1 + i_750_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_752_)
					i_752_ = i_754_;
				if ((i_754_ = i_751_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
					i_754_ = ((Class_l_Sub1.anInt5226 - i_754_) / Class_l_Sub1.anInt5226);
					i_752_ += i_754_;
					i_750_ += Class_l_Sub1.anInt5214 * i_754_;
					i_751_ += Class_l_Sub1.anInt5226 * i_754_;
					i_749_ += i_754_;
				}
				if ((i_754_ = ((i_751_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_752_)
					i_752_ = i_754_;
				for (/**/; i_752_ < 0; i_752_++) {
					int i_755_ = ((i_751_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_750_ >> 12));
					int i_756_ = i_749_++;
					int[] is_757_ = is;
					int i_758_ = i;
					int i_759_ = i_291_;
					if (i_759_ == 0) {
						if (i_758_ == 1)
							is_757_[i_756_] = anIntArray5959[i_755_];
						else if (i_758_ == 0) {
							int i_760_ = anIntArray5959[i_755_++];
							int i_761_ = ((i_760_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_762_ = ((i_760_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_763_ = ((i_760_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_757_[i_756_] = (i_761_ | i_762_ | i_763_) >>> 8;
						} else if (i_758_ == 3) {
							int i_764_ = anIntArray5959[i_755_++];
							int i_765_ = Class_l_Sub1.anInt5221;
							int i_766_ = i_764_ + i_765_;
							int i_767_ = (i_764_ & 0xff00ff) + (i_765_ & 0xff00ff);
							int i_768_ = ((i_767_ & 0x1000100) + (i_766_ - i_767_ & 0x10000));
							is_757_[i_756_] = i_766_ - i_768_ | i_768_ - (i_768_ >>> 8);
						} else if (i_758_ == 2) {
							int i_769_ = anIntArray5959[i_755_];
							int i_770_ = ((i_769_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_771_ = ((i_769_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_757_[i_756_] = (((i_770_ | i_771_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_759_ == 1) {
						if (i_758_ == 1) {
							int i_772_ = anIntArray5959[i_755_];
							if (i_772_ != 0)
								is_757_[i_756_] = i_772_;
						} else if (i_758_ == 0) {
							int i_773_ = anIntArray5959[i_755_];
							if (i_773_ != 0) {
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_774_ = Class_l_Sub1.anInt5221 >>> 24;
									int i_775_ = 256 - i_774_;
									int i_776_ = is_757_[i_756_];
									is_757_[i_756_] = ((((i_773_ & 0xff00ff) * i_774_ + (i_776_ & 0xff00ff) * i_775_) & ~0xff00ff) + (((i_773_ & 0xff00) * i_774_ + (i_776_ & 0xff00) * i_775_) & 0xff0000)) >> 8;
								} else if (Class_l_Sub1.anInt5223 != 255) {
									int i_777_ = (((i_773_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_778_ = (((i_773_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_779_ = (((i_773_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_773_ = (i_777_ | i_778_ | i_779_) >>> 8;
									int i_780_ = is_757_[i_756_];
									is_757_[i_756_] = (((((i_773_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_780_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_773_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_780_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								} else {
									int i_781_ = (((i_773_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_782_ = (((i_773_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_783_ = (((i_773_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_757_[i_756_] = (i_781_ | i_782_ | i_783_) >>> 8;
								}
							}
						} else if (i_758_ == 3) {
							int i_784_ = anIntArray5959[i_755_];
							int i_785_ = Class_l_Sub1.anInt5221;
							int i_786_ = i_784_ + i_785_;
							int i_787_ = (i_784_ & 0xff00ff) + (i_785_ & 0xff00ff);
							int i_788_ = ((i_787_ & 0x1000100) + (i_786_ - i_787_ & 0x10000));
							i_788_ = i_786_ - i_788_ | i_788_ - (i_788_ >>> 8);
							if (i_784_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_784_ = i_788_;
								i_788_ = is_757_[i_756_];
								i_788_ = (((((i_784_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_788_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_784_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_788_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_757_[i_756_] = i_788_;
						} else if (i_758_ == 2) {
							int i_789_ = anIntArray5959[i_755_];
							if (i_789_ != 0) {
								int i_790_ = (((i_789_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_791_ = (((i_789_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_757_[i_756_++] = (((i_790_ | i_791_) >>> 8) + Class_l_Sub1.anInt5213);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_759_ == 2) {
						if (i_758_ == 1) {
							int i_792_ = anIntArray5959[i_755_];
							if (i_792_ != 0) {
								int i_793_ = is_757_[i_756_];
								int i_794_ = i_792_ + i_793_;
								int i_795_ = ((i_792_ & 0xff00ff) + (i_793_ & 0xff00ff));
								i_793_ = (i_795_ & 0x1000100) + (i_794_ - i_795_ & 0x10000);
								is_757_[i_756_] = i_794_ - i_793_ | i_793_ - (i_793_ >>> 8);
							}
						} else if (i_758_ == 0) {
							int i_796_ = anIntArray5959[i_755_];
							if (i_796_ != 0) {
								int i_797_ = (((i_796_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_798_ = (((i_796_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_799_ = ((i_796_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_796_ = (i_797_ | i_798_ | i_799_) >>> 8;
								int i_800_ = is_757_[i_756_];
								int i_801_ = i_796_ + i_800_;
								int i_802_ = ((i_796_ & 0xff00ff) + (i_800_ & 0xff00ff));
								i_800_ = (i_802_ & 0x1000100) + (i_801_ - i_802_ & 0x10000);
								is_757_[i_756_] = i_801_ - i_800_ | i_800_ - (i_800_ >>> 8);
							}
						} else if (i_758_ == 3) {
							int i_803_ = anIntArray5959[i_755_];
							int i_804_ = Class_l_Sub1.anInt5221;
							int i_805_ = i_803_ + i_804_;
							int i_806_ = (i_803_ & 0xff00ff) + (i_804_ & 0xff00ff);
							int i_807_ = ((i_806_ & 0x1000100) + (i_805_ - i_806_ & 0x10000));
							i_803_ = i_805_ - i_807_ | i_807_ - (i_807_ >>> 8);
							i_807_ = is_757_[i_756_];
							i_805_ = i_803_ + i_807_;
							i_806_ = (i_803_ & 0xff00ff) + (i_807_ & 0xff00ff);
							i_807_ = (i_806_ & 0x1000100) + (i_805_ - i_806_ & 0x10000);
							is_757_[i_756_] = i_805_ - i_807_ | i_807_ - (i_807_ >>> 8);
						} else if (i_758_ == 2) {
							int i_808_ = anIntArray5959[i_755_];
							if (i_808_ != 0) {
								int i_809_ = (((i_808_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_810_ = (((i_808_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_808_ = (((i_809_ | i_810_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_811_ = is_757_[i_756_];
								int i_812_ = i_808_ + i_811_;
								int i_813_ = ((i_808_ & 0xff00ff) + (i_811_ & 0xff00ff));
								i_811_ = (i_813_ & 0x1000100) + (i_812_ - i_813_ & 0x10000);
								is_757_[i_756_] = i_812_ - i_811_ | i_811_ - (i_811_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_750_ += Class_l_Sub1.anInt5214;
					i_751_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			for (int i_814_ = Class_l_Sub1.anInt5202; i_814_ < 0; i_814_++) {
				int i_815_ = Class_l_Sub1.anInt5217;
				int i_816_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_817_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_818_ = Class_l_Sub1.anInt5212;
				if (i_816_ < 0) {
					int i_819_ = ((Class_l_Sub1.anInt5214 - 1 - i_816_) / Class_l_Sub1.anInt5214);
					i_818_ += i_819_;
					i_816_ += Class_l_Sub1.anInt5214 * i_819_;
					i_817_ += Class_l_Sub1.anInt5226 * i_819_;
					i_815_ += i_819_;
				}
				int i_820_;
				if ((i_820_ = (1 + i_816_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_818_)
					i_818_ = i_820_;
				if (i_817_ < 0) {
					i_820_ = ((Class_l_Sub1.anInt5226 - 1 - i_817_) / Class_l_Sub1.anInt5226);
					i_818_ += i_820_;
					i_816_ += Class_l_Sub1.anInt5214 * i_820_;
					i_817_ += Class_l_Sub1.anInt5226 * i_820_;
					i_815_ += i_820_;
				}
				if ((i_820_ = (1 + i_817_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_818_)
					i_818_ = i_820_;
				for (/**/; i_818_ < 0; i_818_++) {
					int i_821_ = ((i_817_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_816_ >> 12));
					int i_822_ = i_815_++;
					int[] is_823_ = is;
					int i_824_ = i;
					int i_825_ = i_291_;
					if (i_825_ == 0) {
						if (i_824_ == 1)
							is_823_[i_822_] = anIntArray5959[i_821_];
						else if (i_824_ == 0) {
							int i_826_ = anIntArray5959[i_821_++];
							int i_827_ = ((i_826_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_828_ = ((i_826_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_829_ = ((i_826_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_823_[i_822_] = (i_827_ | i_828_ | i_829_) >>> 8;
						} else if (i_824_ == 3) {
							int i_830_ = anIntArray5959[i_821_++];
							int i_831_ = Class_l_Sub1.anInt5221;
							int i_832_ = i_830_ + i_831_;
							int i_833_ = (i_830_ & 0xff00ff) + (i_831_ & 0xff00ff);
							int i_834_ = ((i_833_ & 0x1000100) + (i_832_ - i_833_ & 0x10000));
							is_823_[i_822_] = i_832_ - i_834_ | i_834_ - (i_834_ >>> 8);
						} else if (i_824_ == 2) {
							int i_835_ = anIntArray5959[i_821_];
							int i_836_ = ((i_835_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_837_ = ((i_835_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_823_[i_822_] = (((i_836_ | i_837_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_825_ == 1) {
						if (i_824_ == 1) {
							int i_838_ = anIntArray5959[i_821_];
							if (i_838_ != 0)
								is_823_[i_822_] = i_838_;
						} else if (i_824_ == 0) {
							int i_839_ = anIntArray5959[i_821_];
							if (i_839_ != 0) {
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_840_ = Class_l_Sub1.anInt5221 >>> 24;
									int i_841_ = 256 - i_840_;
									int i_842_ = is_823_[i_822_];
									is_823_[i_822_] = ((((i_839_ & 0xff00ff) * i_840_ + (i_842_ & 0xff00ff) * i_841_) & ~0xff00ff) + (((i_839_ & 0xff00) * i_840_ + (i_842_ & 0xff00) * i_841_) & 0xff0000)) >> 8;
								} else if (Class_l_Sub1.anInt5223 != 255) {
									int i_843_ = (((i_839_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_844_ = (((i_839_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_845_ = (((i_839_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_839_ = (i_843_ | i_844_ | i_845_) >>> 8;
									int i_846_ = is_823_[i_822_];
									is_823_[i_822_] = (((((i_839_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_846_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_839_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_846_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								} else {
									int i_847_ = (((i_839_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_848_ = (((i_839_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_849_ = (((i_839_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_823_[i_822_] = (i_847_ | i_848_ | i_849_) >>> 8;
								}
							}
						} else if (i_824_ == 3) {
							int i_850_ = anIntArray5959[i_821_];
							int i_851_ = Class_l_Sub1.anInt5221;
							int i_852_ = i_850_ + i_851_;
							int i_853_ = (i_850_ & 0xff00ff) + (i_851_ & 0xff00ff);
							int i_854_ = ((i_853_ & 0x1000100) + (i_852_ - i_853_ & 0x10000));
							i_854_ = i_852_ - i_854_ | i_854_ - (i_854_ >>> 8);
							if (i_850_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_850_ = i_854_;
								i_854_ = is_823_[i_822_];
								i_854_ = (((((i_850_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_854_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_850_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_854_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_823_[i_822_] = i_854_;
						} else if (i_824_ == 2) {
							int i_855_ = anIntArray5959[i_821_];
							if (i_855_ != 0) {
								int i_856_ = (((i_855_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_857_ = (((i_855_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_823_[i_822_++] = (((i_856_ | i_857_) >>> 8) + Class_l_Sub1.anInt5213);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_825_ == 2) {
						if (i_824_ == 1) {
							int i_858_ = anIntArray5959[i_821_];
							if (i_858_ != 0) {
								int i_859_ = is_823_[i_822_];
								int i_860_ = i_858_ + i_859_;
								int i_861_ = ((i_858_ & 0xff00ff) + (i_859_ & 0xff00ff));
								i_859_ = (i_861_ & 0x1000100) + (i_860_ - i_861_ & 0x10000);
								is_823_[i_822_] = i_860_ - i_859_ | i_859_ - (i_859_ >>> 8);
							}
						} else if (i_824_ == 0) {
							int i_862_ = anIntArray5959[i_821_];
							if (i_862_ != 0) {
								int i_863_ = (((i_862_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_864_ = (((i_862_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_865_ = ((i_862_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_862_ = (i_863_ | i_864_ | i_865_) >>> 8;
								int i_866_ = is_823_[i_822_];
								int i_867_ = i_862_ + i_866_;
								int i_868_ = ((i_862_ & 0xff00ff) + (i_866_ & 0xff00ff));
								i_866_ = (i_868_ & 0x1000100) + (i_867_ - i_868_ & 0x10000);
								is_823_[i_822_] = i_867_ - i_866_ | i_866_ - (i_866_ >>> 8);
							}
						} else if (i_824_ == 3) {
							int i_869_ = anIntArray5959[i_821_];
							int i_870_ = Class_l_Sub1.anInt5221;
							int i_871_ = i_869_ + i_870_;
							int i_872_ = (i_869_ & 0xff00ff) + (i_870_ & 0xff00ff);
							int i_873_ = ((i_872_ & 0x1000100) + (i_871_ - i_872_ & 0x10000));
							i_869_ = i_871_ - i_873_ | i_873_ - (i_873_ >>> 8);
							i_873_ = is_823_[i_822_];
							i_871_ = i_869_ + i_873_;
							i_872_ = (i_869_ & 0xff00ff) + (i_873_ & 0xff00ff);
							i_873_ = (i_872_ & 0x1000100) + (i_871_ - i_872_ & 0x10000);
							is_823_[i_822_] = i_871_ - i_873_ | i_873_ - (i_873_ >>> 8);
						} else if (i_824_ == 2) {
							int i_874_ = anIntArray5959[i_821_];
							if (i_874_ != 0) {
								int i_875_ = (((i_874_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_876_ = (((i_874_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_874_ = (((i_875_ | i_876_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_877_ = is_823_[i_822_];
								int i_878_ = i_874_ + i_877_;
								int i_879_ = ((i_874_ & 0xff00ff) + (i_877_ & 0xff00ff));
								i_877_ = (i_879_ & 0x1000100) + (i_878_ - i_879_ & 0x10000);
								is_823_[i_822_] = i_878_ - i_877_ | i_877_ - (i_877_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_816_ += Class_l_Sub1.anInt5214;
					i_817_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}

	Class_l_Sub1_Sub1(Class260_Sub1 class260_sub1, int[] is, int i, int i_880_, int i_881_, int i_882_) {
		super(class260_sub1, i_881_, i_882_);
		anIntArray5959 = new int[i_881_ * i_882_];
		i_880_ -= ((Class_l_Sub1) this).anInt5230;
		int i_883_ = 0;
		for (int i_884_ = 0; i_884_ < i_882_; i_884_++) {
			for (int i_885_ = 0; i_885_ < i_881_; i_885_++) {
				int i_886_ = is[i++];
				if (i_886_ >>> 24 == 255) {
					int i_887_ = i_886_ & 0xffffff;
					if (i_887_ != 0)
						anIntArray5959[i_883_++] = i_887_;
					else
						anIntArray5959[i_883_++] = 1;
				} else
					anIntArray5959[i_883_++] = 0;
			}
			i += i_880_;
		}
	}

	Class_l_Sub1_Sub1(Class260_Sub1 class260_sub1, int[] is, int i, int i_888_) {
		super(class260_sub1, i, i_888_);
		anIntArray5959 = is;
	}

	final void method2217(int[] is, int[] is_889_, int i, int i_890_) {
		int[] is_891_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_892_ = Class_l_Sub1.anInt5202;
				while (i_892_ < 0) {
					int i_893_ = i_892_ + i_890_;
					if (i_893_ >= 0) {
						if (i_893_ >= is.length)
							break;
						int i_894_ = Class_l_Sub1.anInt5217;
						int i_895_ = Class_l_Sub1.anInt5206;
						int i_896_ = Class_l_Sub1.anInt5207;
						int i_897_ = Class_l_Sub1.anInt5212;
						if (i_895_ >= 0 && i_896_ >= 0 && i_895_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0 && i_896_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
							int i_898_ = is[i_893_] - i;
							int i_899_ = -is_889_[i_893_];
							int i_900_ = i_898_ - (i_894_ - Class_l_Sub1.anInt5217);
							if (i_900_ > 0) {
								i_894_ += i_900_;
								i_897_ += i_900_;
								i_895_ += Class_l_Sub1.anInt5214 * i_900_;
								i_896_ += Class_l_Sub1.anInt5226 * i_900_;
							} else
								i_899_ -= i_900_;
							if (i_897_ < i_899_)
								i_897_ = i_899_;
							for (/**/; i_897_ < 0; i_897_++) {
								int i_901_ = (anIntArray5959[(((i_896_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_895_ >> 12))]);
								if (i_901_ != 0)
									is_891_[i_894_++] = i_901_;
								else
									i_894_++;
							}
						}
					}
					i_892_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_902_ = Class_l_Sub1.anInt5202;
				while (i_902_ < 0) {
					int i_903_ = i_902_ + i_890_;
					if (i_903_ >= 0) {
						if (i_903_ >= is.length)
							break;
						int i_904_ = Class_l_Sub1.anInt5217;
						int i_905_ = Class_l_Sub1.anInt5206;
						int i_906_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_907_ = Class_l_Sub1.anInt5212;
						if (i_905_ >= 0 && i_905_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0) {
							int i_908_;
							if ((i_908_ = i_906_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
								i_908_ = ((Class_l_Sub1.anInt5226 - i_908_) / Class_l_Sub1.anInt5226);
								i_907_ += i_908_;
								i_906_ += Class_l_Sub1.anInt5226 * i_908_;
								i_904_ += i_908_;
							}
							if ((i_908_ = ((i_906_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_907_)
								i_907_ = i_908_;
							int i_909_ = is[i_903_] - i;
							int i_910_ = -is_889_[i_903_];
							int i_911_ = i_909_ - (i_904_ - Class_l_Sub1.anInt5217);
							if (i_911_ > 0) {
								i_904_ += i_911_;
								i_907_ += i_911_;
								i_905_ += Class_l_Sub1.anInt5214 * i_911_;
								i_906_ += Class_l_Sub1.anInt5226 * i_911_;
							} else
								i_910_ -= i_911_;
							if (i_907_ < i_910_)
								i_907_ = i_910_;
							for (/**/; i_907_ < 0; i_907_++) {
								int i_912_ = (anIntArray5959[(((i_906_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_905_ >> 12))]);
								if (i_912_ != 0)
									is_891_[i_904_++] = i_912_;
								else
									i_904_++;
								i_906_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_902_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_913_ = Class_l_Sub1.anInt5202;
				while (i_913_ < 0) {
					int i_914_ = i_913_ + i_890_;
					if (i_914_ >= 0) {
						if (i_914_ >= is.length)
							break;
						int i_915_ = Class_l_Sub1.anInt5217;
						int i_916_ = Class_l_Sub1.anInt5206;
						int i_917_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_918_ = Class_l_Sub1.anInt5212;
						if (i_916_ >= 0 && i_916_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0) {
							if (i_917_ < 0) {
								int i_919_ = ((Class_l_Sub1.anInt5226 - 1 - i_917_) / Class_l_Sub1.anInt5226);
								i_918_ += i_919_;
								i_917_ += Class_l_Sub1.anInt5226 * i_919_;
								i_915_ += i_919_;
							}
							int i_920_;
							if ((i_920_ = ((1 + i_917_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_918_)
								i_918_ = i_920_;
							int i_921_ = is[i_914_] - i;
							int i_922_ = -is_889_[i_914_];
							int i_923_ = i_921_ - (i_915_ - Class_l_Sub1.anInt5217);
							if (i_923_ > 0) {
								i_915_ += i_923_;
								i_918_ += i_923_;
								i_916_ += Class_l_Sub1.anInt5214 * i_923_;
								i_917_ += Class_l_Sub1.anInt5226 * i_923_;
							} else
								i_922_ -= i_923_;
							if (i_918_ < i_922_)
								i_918_ = i_922_;
							for (/**/; i_918_ < 0; i_918_++) {
								int i_924_ = (anIntArray5959[(((i_917_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_916_ >> 12))]);
								if (i_924_ != 0)
									is_891_[i_915_++] = i_924_;
								else
									i_915_++;
								i_917_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_913_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_925_ = Class_l_Sub1.anInt5202;
				while (i_925_ < 0) {
					int i_926_ = i_925_ + i_890_;
					if (i_926_ >= 0) {
						if (i_926_ >= is.length)
							break;
						int i_927_ = Class_l_Sub1.anInt5217;
						int i_928_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_929_ = Class_l_Sub1.anInt5207;
						int i_930_ = Class_l_Sub1.anInt5212;
						if (i_929_ >= 0 && i_929_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
							int i_931_;
							if ((i_931_ = i_928_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
								i_931_ = ((Class_l_Sub1.anInt5214 - i_931_) / Class_l_Sub1.anInt5214);
								i_930_ += i_931_;
								i_928_ += Class_l_Sub1.anInt5214 * i_931_;
								i_927_ += i_931_;
							}
							if ((i_931_ = ((i_928_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_930_)
								i_930_ = i_931_;
							int i_932_ = is[i_926_] - i;
							int i_933_ = -is_889_[i_926_];
							int i_934_ = i_932_ - (i_927_ - Class_l_Sub1.anInt5217);
							if (i_934_ > 0) {
								i_927_ += i_934_;
								i_930_ += i_934_;
								i_928_ += Class_l_Sub1.anInt5214 * i_934_;
								i_929_ += Class_l_Sub1.anInt5226 * i_934_;
							} else
								i_933_ -= i_934_;
							if (i_930_ < i_933_)
								i_930_ = i_933_;
							for (/**/; i_930_ < 0; i_930_++) {
								int i_935_ = (anIntArray5959[(((i_929_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_928_ >> 12))]);
								if (i_935_ != 0)
									is_891_[i_927_++] = i_935_;
								else
									i_927_++;
								i_928_ += Class_l_Sub1.anInt5214;
							}
						}
					}
					i_925_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_936_ = Class_l_Sub1.anInt5202;
				while (i_936_ < 0) {
					int i_937_ = i_936_ + i_890_;
					if (i_937_ >= 0) {
						if (i_937_ >= is.length)
							break;
						int i_938_ = Class_l_Sub1.anInt5217;
						int i_939_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_940_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_941_ = Class_l_Sub1.anInt5212;
						int i_942_;
						if ((i_942_ = i_939_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_942_ = ((Class_l_Sub1.anInt5214 - i_942_) / Class_l_Sub1.anInt5214);
							i_941_ += i_942_;
							i_939_ += Class_l_Sub1.anInt5214 * i_942_;
							i_940_ += Class_l_Sub1.anInt5226 * i_942_;
							i_938_ += i_942_;
						}
						if ((i_942_ = ((i_939_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_941_)
							i_941_ = i_942_;
						if ((i_942_ = i_940_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_942_ = ((Class_l_Sub1.anInt5226 - i_942_) / Class_l_Sub1.anInt5226);
							i_941_ += i_942_;
							i_939_ += Class_l_Sub1.anInt5214 * i_942_;
							i_940_ += Class_l_Sub1.anInt5226 * i_942_;
							i_938_ += i_942_;
						}
						if ((i_942_ = ((i_940_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_941_)
							i_941_ = i_942_;
						int i_943_ = is[i_937_] - i;
						int i_944_ = -is_889_[i_937_];
						int i_945_ = i_943_ - (i_938_ - Class_l_Sub1.anInt5217);
						if (i_945_ > 0) {
							i_938_ += i_945_;
							i_941_ += i_945_;
							i_939_ += Class_l_Sub1.anInt5214 * i_945_;
							i_940_ += Class_l_Sub1.anInt5226 * i_945_;
						} else
							i_944_ -= i_945_;
						if (i_941_ < i_944_)
							i_941_ = i_944_;
						for (/**/; i_941_ < 0; i_941_++) {
							int i_946_ = (anIntArray5959[(((i_940_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_939_ >> 12))]);
							if (i_946_ != 0)
								is_891_[i_938_++] = i_946_;
							else
								i_938_++;
							i_939_ += Class_l_Sub1.anInt5214;
							i_940_ += Class_l_Sub1.anInt5226;
						}
					}
					i_936_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_947_ = Class_l_Sub1.anInt5202;
				while (i_947_ < 0) {
					int i_948_ = i_947_ + i_890_;
					if (i_948_ >= 0) {
						if (i_948_ >= is.length)
							break;
						int i_949_ = Class_l_Sub1.anInt5217;
						int i_950_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_951_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_952_ = Class_l_Sub1.anInt5212;
						int i_953_;
						if ((i_953_ = i_950_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_953_ = ((Class_l_Sub1.anInt5214 - i_953_) / Class_l_Sub1.anInt5214);
							i_952_ += i_953_;
							i_950_ += Class_l_Sub1.anInt5214 * i_953_;
							i_951_ += Class_l_Sub1.anInt5226 * i_953_;
							i_949_ += i_953_;
						}
						if ((i_953_ = ((i_950_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_952_)
							i_952_ = i_953_;
						if (i_951_ < 0) {
							i_953_ = ((Class_l_Sub1.anInt5226 - 1 - i_951_) / Class_l_Sub1.anInt5226);
							i_952_ += i_953_;
							i_950_ += Class_l_Sub1.anInt5214 * i_953_;
							i_951_ += Class_l_Sub1.anInt5226 * i_953_;
							i_949_ += i_953_;
						}
						if ((i_953_ = ((1 + i_951_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_952_)
							i_952_ = i_953_;
						int i_954_ = is[i_948_] - i;
						int i_955_ = -is_889_[i_948_];
						int i_956_ = i_954_ - (i_949_ - Class_l_Sub1.anInt5217);
						if (i_956_ > 0) {
							i_949_ += i_956_;
							i_952_ += i_956_;
							i_950_ += Class_l_Sub1.anInt5214 * i_956_;
							i_951_ += Class_l_Sub1.anInt5226 * i_956_;
						} else
							i_955_ -= i_956_;
						if (i_952_ < i_955_)
							i_952_ = i_955_;
						for (/**/; i_952_ < 0; i_952_++) {
							int i_957_ = (anIntArray5959[(((i_951_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_950_ >> 12))]);
							if (i_957_ != 0)
								is_891_[i_949_++] = i_957_;
							else
								i_949_++;
							i_950_ += Class_l_Sub1.anInt5214;
							i_951_ += Class_l_Sub1.anInt5226;
						}
					}
					i_947_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_958_ = Class_l_Sub1.anInt5202;
			while (i_958_ < 0) {
				int i_959_ = i_958_ + i_890_;
				if (i_959_ >= 0) {
					if (i_959_ >= is.length)
						break;
					int i_960_ = Class_l_Sub1.anInt5217;
					int i_961_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_962_ = Class_l_Sub1.anInt5207;
					int i_963_ = Class_l_Sub1.anInt5212;
					if (i_962_ >= 0 && (i_962_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						if (i_961_ < 0) {
							int i_964_ = ((Class_l_Sub1.anInt5214 - 1 - i_961_) / Class_l_Sub1.anInt5214);
							i_963_ += i_964_;
							i_961_ += Class_l_Sub1.anInt5214 * i_964_;
							i_960_ += i_964_;
						}
						int i_965_;
						if ((i_965_ = ((1 + i_961_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_963_)
							i_963_ = i_965_;
						int i_966_ = is[i_959_] - i;
						int i_967_ = -is_889_[i_959_];
						int i_968_ = i_966_ - (i_960_ - Class_l_Sub1.anInt5217);
						if (i_968_ > 0) {
							i_960_ += i_968_;
							i_963_ += i_968_;
							i_961_ += Class_l_Sub1.anInt5214 * i_968_;
							i_962_ += Class_l_Sub1.anInt5226 * i_968_;
						} else
							i_967_ -= i_968_;
						if (i_963_ < i_967_)
							i_963_ = i_967_;
						for (/**/; i_963_ < 0; i_963_++) {
							int i_969_ = (anIntArray5959[(((i_962_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_961_ >> 12))]);
							if (i_969_ != 0)
								is_891_[i_960_++] = i_969_;
							else
								i_960_++;
							i_961_ += Class_l_Sub1.anInt5214;
						}
					}
				}
				i_958_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			int i_970_ = Class_l_Sub1.anInt5202;
			while (i_970_ < 0) {
				int i_971_ = i_970_ + i_890_;
				if (i_971_ >= 0) {
					if (i_971_ >= is.length)
						break;
					int i_972_ = Class_l_Sub1.anInt5217;
					int i_973_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_974_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_975_ = Class_l_Sub1.anInt5212;
					if (i_973_ < 0) {
						int i_976_ = ((Class_l_Sub1.anInt5214 - 1 - i_973_) / Class_l_Sub1.anInt5214);
						i_975_ += i_976_;
						i_973_ += Class_l_Sub1.anInt5214 * i_976_;
						i_974_ += Class_l_Sub1.anInt5226 * i_976_;
						i_972_ += i_976_;
					}
					int i_977_;
					if ((i_977_ = (1 + i_973_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_975_)
						i_975_ = i_977_;
					if ((i_977_ = i_974_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_977_ = ((Class_l_Sub1.anInt5226 - i_977_) / Class_l_Sub1.anInt5226);
						i_975_ += i_977_;
						i_973_ += Class_l_Sub1.anInt5214 * i_977_;
						i_974_ += Class_l_Sub1.anInt5226 * i_977_;
						i_972_ += i_977_;
					}
					if ((i_977_ = ((i_974_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_975_)
						i_975_ = i_977_;
					int i_978_ = is[i_971_] - i;
					int i_979_ = -is_889_[i_971_];
					int i_980_ = i_978_ - (i_972_ - Class_l_Sub1.anInt5217);
					if (i_980_ > 0) {
						i_972_ += i_980_;
						i_975_ += i_980_;
						i_973_ += Class_l_Sub1.anInt5214 * i_980_;
						i_974_ += Class_l_Sub1.anInt5226 * i_980_;
					} else
						i_979_ -= i_980_;
					if (i_975_ < i_979_)
						i_975_ = i_979_;
					for (/**/; i_975_ < 0; i_975_++) {
						int i_981_ = (anIntArray5959[(((i_974_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_973_ >> 12))]);
						if (i_981_ != 0)
							is_891_[i_972_++] = i_981_;
						else
							i_972_++;
						i_973_ += Class_l_Sub1.anInt5214;
						i_974_ += Class_l_Sub1.anInt5226;
					}
				}
				i_970_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			int i_982_ = Class_l_Sub1.anInt5202;
			while (i_982_ < 0) {
				int i_983_ = i_982_ + i_890_;
				if (i_983_ >= 0) {
					if (i_983_ >= is.length)
						break;
					int i_984_ = Class_l_Sub1.anInt5217;
					int i_985_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_986_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_987_ = Class_l_Sub1.anInt5212;
					if (i_985_ < 0) {
						int i_988_ = ((Class_l_Sub1.anInt5214 - 1 - i_985_) / Class_l_Sub1.anInt5214);
						i_987_ += i_988_;
						i_985_ += Class_l_Sub1.anInt5214 * i_988_;
						i_986_ += Class_l_Sub1.anInt5226 * i_988_;
						i_984_ += i_988_;
					}
					int i_989_;
					if ((i_989_ = (1 + i_985_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_987_)
						i_987_ = i_989_;
					if (i_986_ < 0) {
						i_989_ = ((Class_l_Sub1.anInt5226 - 1 - i_986_) / Class_l_Sub1.anInt5226);
						i_987_ += i_989_;
						i_985_ += Class_l_Sub1.anInt5214 * i_989_;
						i_986_ += Class_l_Sub1.anInt5226 * i_989_;
						i_984_ += i_989_;
					}
					if ((i_989_ = (1 + i_986_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_987_)
						i_987_ = i_989_;
					int i_990_ = is[i_983_] - i;
					int i_991_ = -is_889_[i_983_];
					int i_992_ = i_990_ - (i_984_ - Class_l_Sub1.anInt5217);
					if (i_992_ > 0) {
						i_984_ += i_992_;
						i_987_ += i_992_;
						i_985_ += Class_l_Sub1.anInt5214 * i_992_;
						i_986_ += Class_l_Sub1.anInt5226 * i_992_;
					} else
						i_991_ -= i_992_;
					if (i_987_ < i_991_)
						i_987_ = i_991_;
					for (/**/; i_987_ < 0; i_987_++) {
						int i_993_ = (anIntArray5959[(((i_986_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_985_ >> 12))]);
						if (i_993_ != 0)
							is_891_[i_984_++] = i_993_;
						else
							i_984_++;
						i_985_ += Class_l_Sub1.anInt5214;
						i_986_ += Class_l_Sub1.anInt5226;
					}
				}
				i_982_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}
}
