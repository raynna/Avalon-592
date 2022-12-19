/* Class_l_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_l_Sub1_Sub3 extends Class_l_Sub1 {
	private int[] anIntArray7035;
	private byte[] aByteArray7036;

	final void method737(int i, int i_0_, Class128 class128, int i_1_, int i_2_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		i += ((Class_l_Sub1) this).anInt5218;
		i_0_ += ((Class_l_Sub1) this).anInt5209;
		int i_3_ = 0;
		int i_4_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		int i_5_ = ((Class_l_Sub1) this).anInt5230;
		int i_6_ = ((Class_l_Sub1) this).anInt5205;
		int i_7_ = i_4_ - i_5_;
		int i_8_ = 0;
		int i_9_ = i + i_0_ * i_4_;
		if (i_0_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_10_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_0_);
			i_6_ -= i_10_;
			i_0_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_3_ += i_10_ * i_5_;
			i_9_ += i_10_ * i_4_;
		}
		if (i_0_ + i_6_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_6_ -= i_0_ + i_6_ - (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_11_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_5_ -= i_11_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_3_ += i_11_;
			i_9_ += i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if (i + i_5_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_12_ = (i + i_5_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_5_ -= i_12_;
			i_8_ += i_12_;
			i_7_ += i_12_;
		}
		if (i_5_ > 0 && i_6_ > 0) {
			Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
			int[] is = ((Class128_Sub2) class128_sub2).anIntArray5568;
			int[] is_13_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
			int[] is_14_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			int i_15_ = i_0_;
			if (i_2_ > i_15_) {
				i_15_ = i_2_;
				i_9_ += (i_2_ - i_0_) * i_4_;
				i_3_ += (i_2_ - i_0_) * ((Class_l_Sub1) this).anInt5230;
			}
			int i_16_ = (i_2_ + is.length < i_0_ + i_6_ ? i_2_ + is.length : i_0_ + i_6_);
			for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
				int i_18_ = is[i_17_ - i_2_] + i_1_;
				int i_19_ = is_13_[i_17_ - i_2_];
				int i_20_ = i_5_;
				if (i > i_18_) {
					int i_21_ = i - i_18_;
					if (i_21_ >= i_19_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_19_ -= i_21_;
				} else {
					int i_22_ = i_18_ - i;
					if (i_22_ >= i_5_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_3_ += i_22_;
					i_20_ -= i_22_;
					i_9_ += i_22_;
				}
				int i_23_ = 0;
				if (i_20_ < i_19_)
					i_19_ = i_20_;
				else
					i_23_ = i_20_ - i_19_;
				for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
					int i_25_ = aByteArray7036[i_3_++];
					if (i_25_ != 0)
						is_14_[i_9_++] = anIntArray7035[i_25_ & 0xff];
					else
						i_9_++;
				}
				i_3_ += i_23_ + i_8_;
				i_9_ += i_23_ + i_7_;
			}
		}
	}

	final void BA(int i, int i_26_, int i_27_) {
		throw new IllegalStateException();
	}

	Class_l_Sub1_Sub3(Class260_Sub1 class260_sub1, byte[] is, int[] is_28_, int i, int i_29_) {
		super(class260_sub1, i, i_29_);
		aByteArray7036 = is;
		anIntArray7035 = is_28_;
	}

	final void method2217(int[] is, int[] is_30_, int i, int i_31_) {
		int[] is_32_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_33_ = Class_l_Sub1.anInt5202;
				while (i_33_ < 0) {
					int i_34_ = i_33_ + i_31_;
					if (i_34_ >= 0) {
						if (i_34_ >= is.length)
							break;
						int i_35_ = Class_l_Sub1.anInt5217;
						int i_36_ = Class_l_Sub1.anInt5206;
						int i_37_ = Class_l_Sub1.anInt5207;
						int i_38_ = Class_l_Sub1.anInt5212;
						if (i_36_ >= 0 && i_37_ >= 0 && (i_36_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0) && (i_37_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
							int i_39_ = is[i_34_] - i;
							int i_40_ = -is_30_[i_34_];
							int i_41_ = i_39_ - (i_35_ - Class_l_Sub1.anInt5217);
							if (i_41_ > 0) {
								i_35_ += i_41_;
								i_38_ += i_41_;
								i_36_ += Class_l_Sub1.anInt5214 * i_41_;
								i_37_ += Class_l_Sub1.anInt5226 * i_41_;
							} else
								i_40_ -= i_41_;
							if (i_38_ < i_40_)
								i_38_ = i_40_;
							for (/**/; i_38_ < 0; i_38_++) {
								int i_42_ = (aByteArray7036[(((i_37_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_36_ >> 12))]);
								if (i_42_ != 0)
									is_32_[i_35_++] = anIntArray7035[i_42_ & 0xff];
								else
									i_35_++;
							}
						}
					}
					i_33_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_43_ = Class_l_Sub1.anInt5202;
				while (i_43_ < 0) {
					int i_44_ = i_43_ + i_31_;
					if (i_44_ >= 0) {
						if (i_44_ >= is.length)
							break;
						int i_45_ = Class_l_Sub1.anInt5217;
						int i_46_ = Class_l_Sub1.anInt5206;
						int i_47_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_48_ = Class_l_Sub1.anInt5212;
						if (i_46_ >= 0 && (i_46_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
							int i_49_;
							if ((i_49_ = i_47_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
								i_49_ = ((Class_l_Sub1.anInt5226 - i_49_) / Class_l_Sub1.anInt5226);
								i_48_ += i_49_;
								i_47_ += Class_l_Sub1.anInt5226 * i_49_;
								i_45_ += i_49_;
							}
							if ((i_49_ = ((i_47_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_48_)
								i_48_ = i_49_;
							int i_50_ = is[i_44_] - i;
							int i_51_ = -is_30_[i_44_];
							int i_52_ = i_50_ - (i_45_ - Class_l_Sub1.anInt5217);
							if (i_52_ > 0) {
								i_45_ += i_52_;
								i_48_ += i_52_;
								i_46_ += Class_l_Sub1.anInt5214 * i_52_;
								i_47_ += Class_l_Sub1.anInt5226 * i_52_;
							} else
								i_51_ -= i_52_;
							if (i_48_ < i_51_)
								i_48_ = i_51_;
							for (/**/; i_48_ < 0; i_48_++) {
								int i_53_ = (aByteArray7036[(((i_47_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_46_ >> 12))]);
								if (i_53_ != 0)
									is_32_[i_45_++] = anIntArray7035[i_53_ & 0xff];
								else
									i_45_++;
								i_47_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_43_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_54_ = Class_l_Sub1.anInt5202;
				while (i_54_ < 0) {
					int i_55_ = i_54_ + i_31_;
					if (i_55_ >= 0) {
						if (i_55_ >= is.length)
							break;
						int i_56_ = Class_l_Sub1.anInt5217;
						int i_57_ = Class_l_Sub1.anInt5206;
						int i_58_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_59_ = Class_l_Sub1.anInt5212;
						if (i_57_ >= 0 && (i_57_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
							if (i_58_ < 0) {
								int i_60_ = ((Class_l_Sub1.anInt5226 - 1 - i_58_) / Class_l_Sub1.anInt5226);
								i_59_ += i_60_;
								i_58_ += Class_l_Sub1.anInt5226 * i_60_;
								i_56_ += i_60_;
							}
							int i_61_;
							if ((i_61_ = ((1 + i_58_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_59_)
								i_59_ = i_61_;
							int i_62_ = is[i_55_] - i;
							int i_63_ = -is_30_[i_55_];
							int i_64_ = i_62_ - (i_56_ - Class_l_Sub1.anInt5217);
							if (i_64_ > 0) {
								i_56_ += i_64_;
								i_59_ += i_64_;
								i_57_ += Class_l_Sub1.anInt5214 * i_64_;
								i_58_ += Class_l_Sub1.anInt5226 * i_64_;
							} else
								i_63_ -= i_64_;
							if (i_59_ < i_63_)
								i_59_ = i_63_;
							for (/**/; i_59_ < 0; i_59_++) {
								int i_65_ = (aByteArray7036[(((i_58_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_57_ >> 12))]);
								if (i_65_ != 0)
									is_32_[i_56_++] = anIntArray7035[i_65_ & 0xff];
								else
									i_56_++;
								i_58_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_54_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_66_ = Class_l_Sub1.anInt5202;
				while (i_66_ < 0) {
					int i_67_ = i_66_ + i_31_;
					if (i_67_ >= 0) {
						if (i_67_ >= is.length)
							break;
						int i_68_ = Class_l_Sub1.anInt5217;
						int i_69_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_70_ = Class_l_Sub1.anInt5207;
						int i_71_ = Class_l_Sub1.anInt5212;
						if (i_70_ >= 0 && (i_70_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
							int i_72_;
							if ((i_72_ = i_69_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
								i_72_ = ((Class_l_Sub1.anInt5214 - i_72_) / Class_l_Sub1.anInt5214);
								i_71_ += i_72_;
								i_69_ += Class_l_Sub1.anInt5214 * i_72_;
								i_68_ += i_72_;
							}
							if ((i_72_ = ((i_69_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_71_)
								i_71_ = i_72_;
							int i_73_ = is[i_67_] - i;
							int i_74_ = -is_30_[i_67_];
							int i_75_ = i_73_ - (i_68_ - Class_l_Sub1.anInt5217);
							if (i_75_ > 0) {
								i_68_ += i_75_;
								i_71_ += i_75_;
								i_69_ += Class_l_Sub1.anInt5214 * i_75_;
								i_70_ += Class_l_Sub1.anInt5226 * i_75_;
							} else
								i_74_ -= i_75_;
							if (i_71_ < i_74_)
								i_71_ = i_74_;
							for (/**/; i_71_ < 0; i_71_++) {
								int i_76_ = (aByteArray7036[(((i_70_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_69_ >> 12))]);
								if (i_76_ != 0)
									is_32_[i_68_++] = anIntArray7035[i_76_ & 0xff];
								else
									i_68_++;
								i_69_ += Class_l_Sub1.anInt5214;
							}
						}
					}
					i_66_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_77_ = Class_l_Sub1.anInt5202;
				while (i_77_ < 0) {
					int i_78_ = i_77_ + i_31_;
					if (i_78_ >= 0) {
						if (i_78_ >= is.length)
							break;
						int i_79_ = Class_l_Sub1.anInt5217;
						int i_80_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_81_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_82_ = Class_l_Sub1.anInt5212;
						int i_83_;
						if ((i_83_ = i_80_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_83_ = ((Class_l_Sub1.anInt5214 - i_83_) / Class_l_Sub1.anInt5214);
							i_82_ += i_83_;
							i_80_ += Class_l_Sub1.anInt5214 * i_83_;
							i_81_ += Class_l_Sub1.anInt5226 * i_83_;
							i_79_ += i_83_;
						}
						if ((i_83_ = ((i_80_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_82_)
							i_82_ = i_83_;
						if ((i_83_ = i_81_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_83_ = ((Class_l_Sub1.anInt5226 - i_83_) / Class_l_Sub1.anInt5226);
							i_82_ += i_83_;
							i_80_ += Class_l_Sub1.anInt5214 * i_83_;
							i_81_ += Class_l_Sub1.anInt5226 * i_83_;
							i_79_ += i_83_;
						}
						if ((i_83_ = ((i_81_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_82_)
							i_82_ = i_83_;
						int i_84_ = is[i_78_] - i;
						int i_85_ = -is_30_[i_78_];
						int i_86_ = i_84_ - (i_79_ - Class_l_Sub1.anInt5217);
						if (i_86_ > 0) {
							i_79_ += i_86_;
							i_82_ += i_86_;
							i_80_ += Class_l_Sub1.anInt5214 * i_86_;
							i_81_ += Class_l_Sub1.anInt5226 * i_86_;
						} else
							i_85_ -= i_86_;
						if (i_82_ < i_85_)
							i_82_ = i_85_;
						for (/**/; i_82_ < 0; i_82_++) {
							int i_87_ = (aByteArray7036[(((i_81_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_80_ >> 12))]);
							if (i_87_ != 0)
								is_32_[i_79_++] = anIntArray7035[i_87_ & 0xff];
							else
								i_79_++;
							i_80_ += Class_l_Sub1.anInt5214;
							i_81_ += Class_l_Sub1.anInt5226;
						}
					}
					i_77_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_88_ = Class_l_Sub1.anInt5202;
				while (i_88_ < 0) {
					int i_89_ = i_88_ + i_31_;
					if (i_89_ >= 0) {
						if (i_89_ >= is.length)
							break;
						int i_90_ = Class_l_Sub1.anInt5217;
						int i_91_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_92_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_93_ = Class_l_Sub1.anInt5212;
						int i_94_;
						if ((i_94_ = i_91_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_94_ = ((Class_l_Sub1.anInt5214 - i_94_) / Class_l_Sub1.anInt5214);
							i_93_ += i_94_;
							i_91_ += Class_l_Sub1.anInt5214 * i_94_;
							i_92_ += Class_l_Sub1.anInt5226 * i_94_;
							i_90_ += i_94_;
						}
						if ((i_94_ = ((i_91_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_93_)
							i_93_ = i_94_;
						if (i_92_ < 0) {
							i_94_ = ((Class_l_Sub1.anInt5226 - 1 - i_92_) / Class_l_Sub1.anInt5226);
							i_93_ += i_94_;
							i_91_ += Class_l_Sub1.anInt5214 * i_94_;
							i_92_ += Class_l_Sub1.anInt5226 * i_94_;
							i_90_ += i_94_;
						}
						if ((i_94_ = ((1 + i_92_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_93_)
							i_93_ = i_94_;
						int i_95_ = is[i_89_] - i;
						int i_96_ = -is_30_[i_89_];
						int i_97_ = i_95_ - (i_90_ - Class_l_Sub1.anInt5217);
						if (i_97_ > 0) {
							i_90_ += i_97_;
							i_93_ += i_97_;
							i_91_ += Class_l_Sub1.anInt5214 * i_97_;
							i_92_ += Class_l_Sub1.anInt5226 * i_97_;
						} else
							i_96_ -= i_97_;
						if (i_93_ < i_96_)
							i_93_ = i_96_;
						for (/**/; i_93_ < 0; i_93_++) {
							int i_98_ = (aByteArray7036[(((i_92_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_91_ >> 12))]);
							if (i_98_ != 0)
								is_32_[i_90_++] = anIntArray7035[i_98_ & 0xff];
							else
								i_90_++;
							i_91_ += Class_l_Sub1.anInt5214;
							i_92_ += Class_l_Sub1.anInt5226;
						}
					}
					i_88_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_99_ = Class_l_Sub1.anInt5202;
			while (i_99_ < 0) {
				int i_100_ = i_99_ + i_31_;
				if (i_100_ >= 0) {
					if (i_100_ >= is.length)
						break;
					int i_101_ = Class_l_Sub1.anInt5217;
					int i_102_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_103_ = Class_l_Sub1.anInt5207;
					int i_104_ = Class_l_Sub1.anInt5212;
					if (i_103_ >= 0 && (i_103_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						if (i_102_ < 0) {
							int i_105_ = ((Class_l_Sub1.anInt5214 - 1 - i_102_) / Class_l_Sub1.anInt5214);
							i_104_ += i_105_;
							i_102_ += Class_l_Sub1.anInt5214 * i_105_;
							i_101_ += i_105_;
						}
						int i_106_;
						if ((i_106_ = ((1 + i_102_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_104_)
							i_104_ = i_106_;
						int i_107_ = is[i_100_] - i;
						int i_108_ = -is_30_[i_100_];
						int i_109_ = i_107_ - (i_101_ - Class_l_Sub1.anInt5217);
						if (i_109_ > 0) {
							i_101_ += i_109_;
							i_104_ += i_109_;
							i_102_ += Class_l_Sub1.anInt5214 * i_109_;
							i_103_ += Class_l_Sub1.anInt5226 * i_109_;
						} else
							i_108_ -= i_109_;
						if (i_104_ < i_108_)
							i_104_ = i_108_;
						for (/**/; i_104_ < 0; i_104_++) {
							int i_110_ = (aByteArray7036[(((i_103_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_102_ >> 12))]);
							if (i_110_ != 0)
								is_32_[i_101_++] = anIntArray7035[i_110_ & 0xff];
							else
								i_101_++;
							i_102_ += Class_l_Sub1.anInt5214;
						}
					}
				}
				i_99_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			int i_111_ = Class_l_Sub1.anInt5202;
			while (i_111_ < 0) {
				int i_112_ = i_111_ + i_31_;
				if (i_112_ >= 0) {
					if (i_112_ >= is.length)
						break;
					int i_113_ = Class_l_Sub1.anInt5217;
					int i_114_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_115_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_116_ = Class_l_Sub1.anInt5212;
					if (i_114_ < 0) {
						int i_117_ = ((Class_l_Sub1.anInt5214 - 1 - i_114_) / Class_l_Sub1.anInt5214);
						i_116_ += i_117_;
						i_114_ += Class_l_Sub1.anInt5214 * i_117_;
						i_115_ += Class_l_Sub1.anInt5226 * i_117_;
						i_113_ += i_117_;
					}
					int i_118_;
					if ((i_118_ = (1 + i_114_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_116_)
						i_116_ = i_118_;
					if ((i_118_ = i_115_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_118_ = ((Class_l_Sub1.anInt5226 - i_118_) / Class_l_Sub1.anInt5226);
						i_116_ += i_118_;
						i_114_ += Class_l_Sub1.anInt5214 * i_118_;
						i_115_ += Class_l_Sub1.anInt5226 * i_118_;
						i_113_ += i_118_;
					}
					if ((i_118_ = ((i_115_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_116_)
						i_116_ = i_118_;
					int i_119_ = is[i_112_] - i;
					int i_120_ = -is_30_[i_112_];
					int i_121_ = i_119_ - (i_113_ - Class_l_Sub1.anInt5217);
					if (i_121_ > 0) {
						i_113_ += i_121_;
						i_116_ += i_121_;
						i_114_ += Class_l_Sub1.anInt5214 * i_121_;
						i_115_ += Class_l_Sub1.anInt5226 * i_121_;
					} else
						i_120_ -= i_121_;
					if (i_116_ < i_120_)
						i_116_ = i_120_;
					for (/**/; i_116_ < 0; i_116_++) {
						int i_122_ = (aByteArray7036[(((i_115_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_114_ >> 12))]);
						if (i_122_ != 0)
							is_32_[i_113_++] = anIntArray7035[i_122_ & 0xff];
						else
							i_113_++;
						i_114_ += Class_l_Sub1.anInt5214;
						i_115_ += Class_l_Sub1.anInt5226;
					}
				}
				i_111_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			int i_123_ = Class_l_Sub1.anInt5202;
			while (i_123_ < 0) {
				int i_124_ = i_123_ + i_31_;
				if (i_124_ >= 0) {
					if (i_124_ >= is.length)
						break;
					int i_125_ = Class_l_Sub1.anInt5217;
					int i_126_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_127_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_128_ = Class_l_Sub1.anInt5212;
					if (i_126_ < 0) {
						int i_129_ = ((Class_l_Sub1.anInt5214 - 1 - i_126_) / Class_l_Sub1.anInt5214);
						i_128_ += i_129_;
						i_126_ += Class_l_Sub1.anInt5214 * i_129_;
						i_127_ += Class_l_Sub1.anInt5226 * i_129_;
						i_125_ += i_129_;
					}
					int i_130_;
					if ((i_130_ = (1 + i_126_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_128_)
						i_128_ = i_130_;
					if (i_127_ < 0) {
						i_130_ = ((Class_l_Sub1.anInt5226 - 1 - i_127_) / Class_l_Sub1.anInt5226);
						i_128_ += i_130_;
						i_126_ += Class_l_Sub1.anInt5214 * i_130_;
						i_127_ += Class_l_Sub1.anInt5226 * i_130_;
						i_125_ += i_130_;
					}
					if ((i_130_ = (1 + i_127_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_128_)
						i_128_ = i_130_;
					int i_131_ = is[i_124_] - i;
					int i_132_ = -is_30_[i_124_];
					int i_133_ = i_131_ - (i_125_ - Class_l_Sub1.anInt5217);
					if (i_133_ > 0) {
						i_125_ += i_133_;
						i_128_ += i_133_;
						i_126_ += Class_l_Sub1.anInt5214 * i_133_;
						i_127_ += Class_l_Sub1.anInt5226 * i_133_;
					} else
						i_132_ -= i_133_;
					if (i_128_ < i_132_)
						i_128_ = i_132_;
					for (/**/; i_128_ < 0; i_128_++) {
						int i_134_ = (aByteArray7036[(((i_127_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_126_ >> 12))]);
						if (i_134_ != 0)
							is_32_[i_125_++] = anIntArray7035[i_134_ & 0xff];
						else
							i_125_++;
						i_126_ += Class_l_Sub1.anInt5214;
						i_127_ += Class_l_Sub1.anInt5226;
					}
				}
				i_123_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}

	final void t(int i, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_) {
		throw new IllegalStateException();
	}

	final void s(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		if (i_141_ > 0 && i_142_ > 0) {
			int i_146_ = 0;
			int i_147_ = 0;
			int i_148_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb);
			int i_149_ = (((Class_l_Sub1) this).anInt5218 + ((Class_l_Sub1) this).anInt5230 + ((Class_l_Sub1) this).anInt5216);
			int i_150_ = (((Class_l_Sub1) this).anInt5209 + ((Class_l_Sub1) this).anInt5205 + ((Class_l_Sub1) this).anInt5224);
			int i_151_ = (i_149_ << 16) / i_141_;
			int i_152_ = (i_150_ << 16) / i_142_;
			if (((Class_l_Sub1) this).anInt5218 > 0) {
				int i_153_ = (((((Class_l_Sub1) this).anInt5218 << 16) + i_151_ - 1) / i_151_);
				i += i_153_;
				i_146_ += i_153_ * i_151_ - (((Class_l_Sub1) this).anInt5218 << 16);
			}
			if (((Class_l_Sub1) this).anInt5209 > 0) {
				int i_154_ = (((((Class_l_Sub1) this).anInt5209 << 16) + i_152_ - 1) / i_152_);
				i_140_ += i_154_;
				i_147_ += i_154_ * i_152_ - (((Class_l_Sub1) this).anInt5209 << 16);
			}
			if (((Class_l_Sub1) this).anInt5230 < i_149_)
				i_141_ = ((((Class_l_Sub1) this).anInt5230 << 16) - i_146_ + i_151_ - 1) / i_151_;
			if (((Class_l_Sub1) this).anInt5205 < i_150_)
				i_142_ = ((((Class_l_Sub1) this).anInt5205 << 16) - i_147_ + i_152_ - 1) / i_152_;
			int i_155_ = i + i_140_ * i_148_;
			int i_156_ = i_148_ - i_141_;
			if (i_140_ + i_142_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
				i_142_ -= i_140_ + i_142_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856;
			if (i_140_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
				int i_157_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb - i_140_);
				i_142_ -= i_157_;
				i_155_ += i_157_ * i_148_;
				i_147_ += i_152_ * i_157_;
			}
			if (i + i_141_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
				int i_158_ = (i + i_141_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
				i_141_ -= i_158_;
				i_156_ += i_158_;
			}
			if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
				int i_159_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb - i);
				i_141_ -= i_159_;
				i_155_ += i_159_;
				i_146_ += i_151_ * i_159_;
				i_156_ += i_159_;
			}
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_145_ == 0) {
				if (i_143_ == 1) {
					int i_160_ = i_146_;
					for (int i_161_ = -i_142_; i_161_ < 0; i_161_++) {
						int i_162_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_163_ = -i_141_; i_163_ < 0; i_163_++) {
							is[i_155_++] = (anIntArray7035[(aByteArray7036[(i_146_ >> 16) + i_162_] & 0xff)]);
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_160_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 0) {
					int i_164_ = (i_144_ & 0xff0000) >> 16;
					int i_165_ = (i_144_ & 0xff00) >> 8;
					int i_166_ = i_144_ & 0xff;
					int i_167_ = i_146_;
					for (int i_168_ = -i_142_; i_168_ < 0; i_168_++) {
						int i_169_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_170_ = -i_141_; i_170_ < 0; i_170_++) {
							int i_171_ = (anIntArray7035[(aByteArray7036[(i_146_ >> 16) + i_169_] & 0xff)]);
							int i_172_ = (i_171_ & 0xff0000) * i_164_ & ~0xffffff;
							int i_173_ = (i_171_ & 0xff00) * i_165_ & 0xff0000;
							int i_174_ = (i_171_ & 0xff) * i_166_ & 0xff00;
							is[i_155_++] = (i_172_ | i_173_ | i_174_) >>> 8;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_167_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 3) {
					int i_175_ = i_146_;
					for (int i_176_ = -i_142_; i_176_ < 0; i_176_++) {
						int i_177_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_178_ = -i_141_; i_178_ < 0; i_178_++) {
							byte i_179_ = aByteArray7036[(i_146_ >> 16) + i_177_];
							int i_180_ = i_179_ > 0 ? anIntArray7035[i_179_] : 0;
							int i_181_ = i_180_ + i_144_;
							int i_182_ = (i_180_ & 0xff00ff) + (i_144_ & 0xff00ff);
							int i_183_ = ((i_182_ & 0x1000100) + (i_181_ - i_182_ & 0x10000));
							is[i_155_++] = i_181_ - i_183_ | i_183_ - (i_183_ >>> 8);
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_175_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 2) {
					int i_184_ = i_144_ >>> 24;
					int i_185_ = 256 - i_184_;
					int i_186_ = (i_144_ & 0xff00ff) * i_185_ & ~0xff00ff;
					int i_187_ = (i_144_ & 0xff00) * i_185_ & 0xff0000;
					i_144_ = (i_186_ | i_187_) >>> 8;
					int i_188_ = i_146_;
					for (int i_189_ = -i_142_; i_189_ < 0; i_189_++) {
						int i_190_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_191_ = -i_141_; i_191_ < 0; i_191_++) {
							int i_192_ = (anIntArray7035[(aByteArray7036[(i_146_ >> 16) + i_190_] & 0xff)]);
							i_186_ = (i_192_ & 0xff00ff) * i_184_ & ~0xff00ff;
							i_187_ = (i_192_ & 0xff00) * i_184_ & 0xff0000;
							is[i_155_++] = ((i_186_ | i_187_) >>> 8) + i_144_;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_188_;
						i_155_ += i_156_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_145_ == 1) {
				if (i_143_ == 1) {
					int i_193_ = i_146_;
					for (int i_194_ = -i_142_; i_194_ < 0; i_194_++) {
						int i_195_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_196_ = -i_141_; i_196_ < 0; i_196_++) {
							int i_197_ = aByteArray7036[(i_146_ >> 16) + i_195_];
							if (i_197_ != 0)
								is[i_155_++] = anIntArray7035[i_197_ & 0xff];
							else
								i_155_++;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_193_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 0) {
					int i_198_ = i_146_;
					if ((i_144_ & 0xffffff) == 16777215) {
						int i_199_ = i_144_ >>> 24;
						int i_200_ = 256 - i_199_;
						for (int i_201_ = -i_142_; i_201_ < 0; i_201_++) {
							int i_202_ = ((i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_203_ = -i_141_; i_203_ < 0; i_203_++) {
								int i_204_ = aByteArray7036[(i_146_ >> 16) + i_202_];
								if (i_204_ != 0) {
									int i_205_ = anIntArray7035[i_204_ & 0xff];
									int i_206_ = is[i_155_];
									is[i_155_++] = ((((i_205_ & 0xff00ff) * i_199_ + (i_206_ & 0xff00ff) * i_200_) & ~0xff00ff) + (((i_205_ & 0xff00) * i_199_ + (i_206_ & 0xff00) * i_200_) & 0xff0000)) >> 8;
								} else
									i_155_++;
								i_146_ += i_151_;
							}
							i_147_ += i_152_;
							i_146_ = i_198_;
							i_155_ += i_156_;
						}
					} else {
						int i_207_ = (i_144_ & 0xff0000) >> 16;
						int i_208_ = (i_144_ & 0xff00) >> 8;
						int i_209_ = i_144_ & 0xff;
						int i_210_ = i_144_ >>> 24;
						int i_211_ = 256 - i_210_;
						for (int i_212_ = -i_142_; i_212_ < 0; i_212_++) {
							int i_213_ = ((i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_214_ = -i_141_; i_214_ < 0; i_214_++) {
								int i_215_ = aByteArray7036[(i_146_ >> 16) + i_213_];
								if (i_215_ != 0) {
									int i_216_ = anIntArray7035[i_215_ & 0xff];
									if (i_210_ != 255) {
										int i_217_ = ((i_216_ & 0xff0000) * i_207_ & ~0xffffff);
										int i_218_ = ((i_216_ & 0xff00) * i_208_ & 0xff0000);
										int i_219_ = ((i_216_ & 0xff) * i_209_ & 0xff00);
										i_216_ = (i_217_ | i_218_ | i_219_) >>> 8;
										int i_220_ = is[i_155_];
										is[i_155_++] = ((((i_216_ & 0xff00ff) * i_210_ + ((i_220_ & 0xff00ff) * i_211_)) & ~0xff00ff) + (((i_216_ & 0xff00) * i_210_ + ((i_220_ & 0xff00) * i_211_)) & 0xff0000)) >> 8;
									} else {
										int i_221_ = ((i_216_ & 0xff0000) * i_207_ & ~0xffffff);
										int i_222_ = ((i_216_ & 0xff00) * i_208_ & 0xff0000);
										int i_223_ = ((i_216_ & 0xff) * i_209_ & 0xff00);
										is[i_155_++] = (i_221_ | i_222_ | i_223_) >>> 8;
									}
								} else
									i_155_++;
								i_146_ += i_151_;
							}
							i_147_ += i_152_;
							i_146_ = i_198_;
							i_155_ += i_156_;
						}
						return;
					}
					return;
				}
				if (i_143_ == 3) {
					int i_224_ = i_146_;
					int i_225_ = i_144_ >>> 24;
					int i_226_ = 256 - i_225_;
					for (int i_227_ = -i_142_; i_227_ < 0; i_227_++) {
						int i_228_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_229_ = -i_141_; i_229_ < 0; i_229_++) {
							byte i_230_ = aByteArray7036[(i_146_ >> 16) + i_228_];
							int i_231_ = i_230_ > 0 ? anIntArray7035[i_230_] : 0;
							int i_232_ = i_231_ + i_144_;
							int i_233_ = (i_231_ & 0xff00ff) + (i_144_ & 0xff00ff);
							int i_234_ = ((i_233_ & 0x1000100) + (i_232_ - i_233_ & 0x10000));
							i_234_ = i_232_ - i_234_ | i_234_ - (i_234_ >>> 8);
							if (i_231_ == 0 && i_225_ != 255) {
								i_231_ = i_234_;
								i_234_ = is[i_155_];
								i_234_ = ((((i_231_ & 0xff00ff) * i_225_ + (i_234_ & 0xff00ff) * i_226_) & ~0xff00ff) + (((i_231_ & 0xff00) * i_225_ + (i_234_ & 0xff00) * i_226_) & 0xff0000)) >> 8;
							}
							is[i_155_++] = i_234_;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_224_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 2) {
					int i_235_ = i_144_ >>> 24;
					int i_236_ = 256 - i_235_;
					int i_237_ = (i_144_ & 0xff00ff) * i_236_ & ~0xff00ff;
					int i_238_ = (i_144_ & 0xff00) * i_236_ & 0xff0000;
					i_144_ = (i_237_ | i_238_) >>> 8;
					int i_239_ = i_146_;
					for (int i_240_ = -i_142_; i_240_ < 0; i_240_++) {
						int i_241_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_242_ = -i_141_; i_242_ < 0; i_242_++) {
							int i_243_ = aByteArray7036[(i_146_ >> 16) + i_241_];
							if (i_243_ != 0) {
								int i_244_ = anIntArray7035[i_243_ & 0xff];
								i_237_ = (i_244_ & 0xff00ff) * i_235_ & ~0xff00ff;
								i_238_ = (i_244_ & 0xff00) * i_235_ & 0xff0000;
								is[i_155_++] = ((i_237_ | i_238_) >>> 8) + i_144_;
							} else
								i_155_++;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_239_;
						i_155_ += i_156_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_145_ == 2) {
				if (i_143_ == 1) {
					int i_245_ = i_146_;
					for (int i_246_ = -i_142_; i_246_ < 0; i_246_++) {
						int i_247_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_248_ = -i_141_; i_248_ < 0; i_248_++) {
							int i_249_ = aByteArray7036[(i_146_ >> 16) + i_247_];
							if (i_249_ != 0) {
								int i_250_ = anIntArray7035[i_249_ & 0xff];
								int i_251_ = is[i_155_];
								int i_252_ = i_250_ + i_251_;
								int i_253_ = ((i_250_ & 0xff00ff) + (i_251_ & 0xff00ff));
								i_251_ = (i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000);
								is[i_155_++] = i_252_ - i_251_ | i_251_ - (i_251_ >>> 8);
							} else
								i_155_++;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_245_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 0) {
					int i_254_ = i_146_;
					int i_255_ = (i_144_ & 0xff0000) >> 16;
					int i_256_ = (i_144_ & 0xff00) >> 8;
					int i_257_ = i_144_ & 0xff;
					for (int i_258_ = -i_142_; i_258_ < 0; i_258_++) {
						int i_259_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_260_ = -i_141_; i_260_ < 0; i_260_++) {
							int i_261_ = aByteArray7036[(i_146_ >> 16) + i_259_];
							if (i_261_ != 0) {
								int i_262_ = anIntArray7035[i_261_ & 0xff];
								int i_263_ = (i_262_ & 0xff0000) * i_255_ & ~0xffffff;
								int i_264_ = (i_262_ & 0xff00) * i_256_ & 0xff0000;
								int i_265_ = (i_262_ & 0xff) * i_257_ & 0xff00;
								i_262_ = (i_263_ | i_264_ | i_265_) >>> 8;
								int i_266_ = is[i_155_];
								int i_267_ = i_262_ + i_266_;
								int i_268_ = ((i_262_ & 0xff00ff) + (i_266_ & 0xff00ff));
								i_266_ = (i_268_ & 0x1000100) + (i_267_ - i_268_ & 0x10000);
								is[i_155_++] = i_267_ - i_266_ | i_266_ - (i_266_ >>> 8);
							} else
								i_155_++;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_254_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 3) {
					int i_269_ = i_146_;
					for (int i_270_ = -i_142_; i_270_ < 0; i_270_++) {
						int i_271_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_272_ = -i_141_; i_272_ < 0; i_272_++) {
							byte i_273_ = aByteArray7036[(i_146_ >> 16) + i_271_];
							int i_274_ = i_273_ > 0 ? anIntArray7035[i_273_] : 0;
							int i_275_ = i_274_ + i_144_;
							int i_276_ = (i_274_ & 0xff00ff) + (i_144_ & 0xff00ff);
							int i_277_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
							i_274_ = i_275_ - i_277_ | i_277_ - (i_277_ >>> 8);
							i_277_ = is[i_155_];
							i_275_ = i_274_ + i_277_;
							i_276_ = (i_274_ & 0xff00ff) + (i_277_ & 0xff00ff);
							i_277_ = (i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000);
							is[i_155_++] = i_275_ - i_277_ | i_277_ - (i_277_ >>> 8);
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_269_;
						i_155_ += i_156_;
					}
					return;
				}
				if (i_143_ == 2) {
					int i_278_ = i_144_ >>> 24;
					int i_279_ = 256 - i_278_;
					int i_280_ = (i_144_ & 0xff00ff) * i_279_ & ~0xff00ff;
					int i_281_ = (i_144_ & 0xff00) * i_279_ & 0xff0000;
					i_144_ = (i_280_ | i_281_) >>> 8;
					int i_282_ = i_146_;
					for (int i_283_ = -i_142_; i_283_ < 0; i_283_++) {
						int i_284_ = (i_147_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_285_ = -i_141_; i_285_ < 0; i_285_++) {
							int i_286_ = aByteArray7036[(i_146_ >> 16) + i_284_];
							if (i_286_ != 0) {
								int i_287_ = anIntArray7035[i_286_ & 0xff];
								i_280_ = (i_287_ & 0xff00ff) * i_278_ & ~0xff00ff;
								i_281_ = (i_287_ & 0xff00) * i_278_ & 0xff0000;
								i_287_ = ((i_280_ | i_281_) >>> 8) + i_144_;
								int i_288_ = is[i_155_];
								int i_289_ = i_287_ + i_288_;
								int i_290_ = ((i_287_ & 0xff00ff) + (i_288_ & 0xff00ff));
								i_288_ = (i_290_ & 0x1000100) + (i_289_ - i_290_ & 0x10000);
								is[i_155_++] = i_289_ - i_288_ | i_288_ - (i_288_ >>> 8);
							} else
								i_155_++;
							i_146_ += i_151_;
						}
						i_147_ += i_152_;
						i_146_ = i_282_;
						i_155_ += i_156_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void r(int i, int i_291_, int i_292_, int i_293_, int i_294_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		int i_295_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		i += ((Class_l_Sub1) this).anInt5218;
		i_291_ += ((Class_l_Sub1) this).anInt5209;
		int i_296_ = i_291_ * i_295_ + i;
		int i_297_ = 0;
		int i_298_ = ((Class_l_Sub1) this).anInt5205;
		int i_299_ = ((Class_l_Sub1) this).anInt5230;
		int i_300_ = i_295_ - i_299_;
		int i_301_ = 0;
		if (i_291_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_302_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_291_);
			i_298_ -= i_302_;
			i_291_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_297_ += i_302_ * i_299_;
			i_296_ += i_302_ * i_295_;
		}
		if (i_291_ + i_298_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_298_ -= i_291_ + i_298_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_303_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_299_ -= i_303_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_297_ += i_303_;
			i_296_ += i_303_;
			i_301_ += i_303_;
			i_300_ += i_303_;
		}
		if (i + i_299_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_304_ = i + i_299_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_299_ -= i_304_;
			i_301_ += i_304_;
			i_300_ += i_304_;
		}
		if (i_299_ > 0 && i_298_ > 0) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_294_ == 0) {
				if (i_292_ == 1) {
					for (int i_305_ = -i_298_; i_305_ < 0; i_305_++) {
						int i_306_ = i_296_ + i_299_ - 3;
						while (i_296_ < i_306_) {
							is[i_296_++] = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							is[i_296_++] = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							is[i_296_++] = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							is[i_296_++] = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
						}
						i_306_ += 3;
						while (i_296_ < i_306_)
							is[i_296_++] = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 0) {
					int i_307_ = (i_293_ & 0xff0000) >> 16;
					int i_308_ = (i_293_ & 0xff00) >> 8;
					int i_309_ = i_293_ & 0xff;
					for (int i_310_ = -i_298_; i_310_ < 0; i_310_++) {
						for (int i_311_ = -i_299_; i_311_ < 0; i_311_++) {
							int i_312_ = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							int i_313_ = (i_312_ & 0xff0000) * i_307_ & ~0xffffff;
							int i_314_ = (i_312_ & 0xff00) * i_308_ & 0xff0000;
							int i_315_ = (i_312_ & 0xff) * i_309_ & 0xff00;
							is[i_296_++] = (i_313_ | i_314_ | i_315_) >>> 8;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 3) {
					for (int i_316_ = -i_298_; i_316_ < 0; i_316_++) {
						for (int i_317_ = -i_299_; i_317_ < 0; i_317_++) {
							int i_318_ = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							int i_319_ = i_318_ + i_293_;
							int i_320_ = (i_318_ & 0xff00ff) + (i_293_ & 0xff00ff);
							int i_321_ = ((i_320_ & 0x1000100) + (i_319_ - i_320_ & 0x10000));
							is[i_296_++] = i_319_ - i_321_ | i_321_ - (i_321_ >>> 8);
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 2) {
					int i_322_ = i_293_ >>> 24;
					int i_323_ = 256 - i_322_;
					int i_324_ = (i_293_ & 0xff00ff) * i_323_ & ~0xff00ff;
					int i_325_ = (i_293_ & 0xff00) * i_323_ & 0xff0000;
					i_293_ = (i_324_ | i_325_) >>> 8;
					for (int i_326_ = -i_298_; i_326_ < 0; i_326_++) {
						for (int i_327_ = -i_299_; i_327_ < 0; i_327_++) {
							int i_328_ = (anIntArray7035[aByteArray7036[i_297_++] & 0xff]);
							i_324_ = (i_328_ & 0xff00ff) * i_322_ & ~0xff00ff;
							i_325_ = (i_328_ & 0xff00) * i_322_ & 0xff0000;
							is[i_296_++] = ((i_324_ | i_325_) >>> 8) + i_293_;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_294_ == 1) {
				if (i_292_ == 1) {
					for (int i_329_ = -i_298_; i_329_ < 0; i_329_++) {
						int i_330_ = i_296_ + i_299_ - 3;
						while (i_296_ < i_330_) {
							int i_331_ = aByteArray7036[i_297_++];
							if (i_331_ != 0)
								is[i_296_++] = anIntArray7035[i_331_ & 0xff];
							else
								i_296_++;
							i_331_ = aByteArray7036[i_297_++];
							if (i_331_ != 0)
								is[i_296_++] = anIntArray7035[i_331_ & 0xff];
							else
								i_296_++;
							i_331_ = aByteArray7036[i_297_++];
							if (i_331_ != 0)
								is[i_296_++] = anIntArray7035[i_331_ & 0xff];
							else
								i_296_++;
							i_331_ = aByteArray7036[i_297_++];
							if (i_331_ != 0)
								is[i_296_++] = anIntArray7035[i_331_ & 0xff];
							else
								i_296_++;
						}
						i_330_ += 3;
						while (i_296_ < i_330_) {
							int i_332_ = aByteArray7036[i_297_++];
							if (i_332_ != 0)
								is[i_296_++] = anIntArray7035[i_332_ & 0xff];
							else
								i_296_++;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 0) {
					if ((i_293_ & 0xffffff) == 16777215) {
						int i_333_ = i_293_ >>> 24;
						int i_334_ = 256 - i_333_;
						for (int i_335_ = -i_298_; i_335_ < 0; i_335_++) {
							for (int i_336_ = -i_299_; i_336_ < 0; i_336_++) {
								int i_337_ = aByteArray7036[i_297_++];
								if (i_337_ != 0) {
									int i_338_ = anIntArray7035[i_337_ & 0xff];
									int i_339_ = is[i_296_];
									is[i_296_++] = ((((i_338_ & 0xff00ff) * i_333_ + (i_339_ & 0xff00ff) * i_334_) & ~0xff00ff) + (((i_338_ & 0xff00) * i_333_ + (i_339_ & 0xff00) * i_334_) & 0xff0000)) >> 8;
								} else
									i_296_++;
							}
							i_296_ += i_300_;
							i_297_ += i_301_;
						}
					} else {
						int i_340_ = (i_293_ & 0xff0000) >> 16;
						int i_341_ = (i_293_ & 0xff00) >> 8;
						int i_342_ = i_293_ & 0xff;
						int i_343_ = i_293_ >>> 24;
						int i_344_ = 256 - i_343_;
						for (int i_345_ = -i_298_; i_345_ < 0; i_345_++) {
							for (int i_346_ = -i_299_; i_346_ < 0; i_346_++) {
								int i_347_ = aByteArray7036[i_297_++];
								if (i_347_ != 0) {
									int i_348_ = anIntArray7035[i_347_ & 0xff];
									if (i_343_ != 255) {
										int i_349_ = ((i_348_ & 0xff0000) * i_340_ & ~0xffffff);
										int i_350_ = ((i_348_ & 0xff00) * i_341_ & 0xff0000);
										int i_351_ = ((i_348_ & 0xff) * i_342_ & 0xff00);
										i_348_ = (i_349_ | i_350_ | i_351_) >>> 8;
										int i_352_ = is[i_296_];
										is[i_296_++] = ((((i_348_ & 0xff00ff) * i_343_ + ((i_352_ & 0xff00ff) * i_344_)) & ~0xff00ff) + (((i_348_ & 0xff00) * i_343_ + ((i_352_ & 0xff00) * i_344_)) & 0xff0000)) >> 8;
									} else {
										int i_353_ = ((i_348_ & 0xff0000) * i_340_ & ~0xffffff);
										int i_354_ = ((i_348_ & 0xff00) * i_341_ & 0xff0000);
										int i_355_ = ((i_348_ & 0xff) * i_342_ & 0xff00);
										is[i_296_++] = (i_353_ | i_354_ | i_355_) >>> 8;
									}
								} else
									i_296_++;
							}
							i_296_ += i_300_;
							i_297_ += i_301_;
						}
						return;
					}
					return;
				}
				if (i_292_ == 3) {
					int i_356_ = i_293_ >>> 24;
					int i_357_ = 256 - i_356_;
					for (int i_358_ = -i_298_; i_358_ < 0; i_358_++) {
						for (int i_359_ = -i_299_; i_359_ < 0; i_359_++) {
							byte i_360_ = aByteArray7036[i_297_++];
							int i_361_ = i_360_ > 0 ? anIntArray7035[i_360_] : 0;
							int i_362_ = i_361_ + i_293_;
							int i_363_ = (i_361_ & 0xff00ff) + (i_293_ & 0xff00ff);
							int i_364_ = ((i_363_ & 0x1000100) + (i_362_ - i_363_ & 0x10000));
							i_364_ = i_362_ - i_364_ | i_364_ - (i_364_ >>> 8);
							if (i_361_ == 0 && i_356_ != 255) {
								i_361_ = i_364_;
								i_364_ = is[i_296_];
								i_364_ = ((((i_361_ & 0xff00ff) * i_356_ + (i_364_ & 0xff00ff) * i_357_) & ~0xff00ff) + (((i_361_ & 0xff00) * i_356_ + (i_364_ & 0xff00) * i_357_) & 0xff0000)) >> 8;
							}
							is[i_296_++] = i_364_;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 2) {
					int i_365_ = i_293_ >>> 24;
					int i_366_ = 256 - i_365_;
					int i_367_ = (i_293_ & 0xff00ff) * i_366_ & ~0xff00ff;
					int i_368_ = (i_293_ & 0xff00) * i_366_ & 0xff0000;
					i_293_ = (i_367_ | i_368_) >>> 8;
					for (int i_369_ = -i_298_; i_369_ < 0; i_369_++) {
						for (int i_370_ = -i_299_; i_370_ < 0; i_370_++) {
							int i_371_ = aByteArray7036[i_297_++];
							if (i_371_ != 0) {
								int i_372_ = anIntArray7035[i_371_ & 0xff];
								i_367_ = (i_372_ & 0xff00ff) * i_365_ & ~0xff00ff;
								i_368_ = (i_372_ & 0xff00) * i_365_ & 0xff0000;
								is[i_296_++] = ((i_367_ | i_368_) >>> 8) + i_293_;
							} else
								i_296_++;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_294_ == 2) {
				if (i_292_ == 1) {
					for (int i_373_ = -i_298_; i_373_ < 0; i_373_++) {
						for (int i_374_ = -i_299_; i_374_ < 0; i_374_++) {
							int i_375_ = aByteArray7036[i_297_++];
							if (i_375_ != 0) {
								int i_376_ = anIntArray7035[i_375_ & 0xff];
								int i_377_ = is[i_296_];
								int i_378_ = i_376_ + i_377_;
								int i_379_ = ((i_376_ & 0xff00ff) + (i_377_ & 0xff00ff));
								i_377_ = (i_379_ & 0x1000100) + (i_378_ - i_379_ & 0x10000);
								is[i_296_++] = i_378_ - i_377_ | i_377_ - (i_377_ >>> 8);
							} else
								i_296_++;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 0) {
					int i_380_ = (i_293_ & 0xff0000) >> 16;
					int i_381_ = (i_293_ & 0xff00) >> 8;
					int i_382_ = i_293_ & 0xff;
					for (int i_383_ = -i_298_; i_383_ < 0; i_383_++) {
						for (int i_384_ = -i_299_; i_384_ < 0; i_384_++) {
							int i_385_ = aByteArray7036[i_297_++];
							if (i_385_ != 0) {
								int i_386_ = anIntArray7035[i_385_ & 0xff];
								int i_387_ = (i_386_ & 0xff0000) * i_380_ & ~0xffffff;
								int i_388_ = (i_386_ & 0xff00) * i_381_ & 0xff0000;
								int i_389_ = (i_386_ & 0xff) * i_382_ & 0xff00;
								i_386_ = (i_387_ | i_388_ | i_389_) >>> 8;
								int i_390_ = is[i_296_];
								int i_391_ = i_386_ + i_390_;
								int i_392_ = ((i_386_ & 0xff00ff) + (i_390_ & 0xff00ff));
								i_390_ = (i_392_ & 0x1000100) + (i_391_ - i_392_ & 0x10000);
								is[i_296_++] = i_391_ - i_390_ | i_390_ - (i_390_ >>> 8);
							} else
								i_296_++;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 3) {
					for (int i_393_ = -i_298_; i_393_ < 0; i_393_++) {
						for (int i_394_ = -i_299_; i_394_ < 0; i_394_++) {
							byte i_395_ = aByteArray7036[i_297_++];
							int i_396_ = i_395_ > 0 ? anIntArray7035[i_395_] : 0;
							int i_397_ = i_396_ + i_293_;
							int i_398_ = (i_396_ & 0xff00ff) + (i_293_ & 0xff00ff);
							int i_399_ = ((i_398_ & 0x1000100) + (i_397_ - i_398_ & 0x10000));
							i_396_ = i_397_ - i_399_ | i_399_ - (i_399_ >>> 8);
							i_399_ = is[i_296_];
							i_397_ = i_396_ + i_399_;
							i_398_ = (i_396_ & 0xff00ff) + (i_399_ & 0xff00ff);
							i_399_ = (i_398_ & 0x1000100) + (i_397_ - i_398_ & 0x10000);
							is[i_296_++] = i_397_ - i_399_ | i_399_ - (i_399_ >>> 8);
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				if (i_292_ == 2) {
					int i_400_ = i_293_ >>> 24;
					int i_401_ = 256 - i_400_;
					int i_402_ = (i_293_ & 0xff00ff) * i_401_ & ~0xff00ff;
					int i_403_ = (i_293_ & 0xff00) * i_401_ & 0xff0000;
					i_293_ = (i_402_ | i_403_) >>> 8;
					for (int i_404_ = -i_298_; i_404_ < 0; i_404_++) {
						for (int i_405_ = -i_299_; i_405_ < 0; i_405_++) {
							int i_406_ = aByteArray7036[i_297_++];
							if (i_406_ != 0) {
								int i_407_ = anIntArray7035[i_406_ & 0xff];
								i_402_ = (i_407_ & 0xff00ff) * i_400_ & ~0xff00ff;
								i_403_ = (i_407_ & 0xff00) * i_400_ & 0xff0000;
								i_407_ = ((i_402_ | i_403_) >>> 8) + i_293_;
								int i_408_ = is[i_296_];
								int i_409_ = i_407_ + i_408_;
								int i_410_ = ((i_407_ & 0xff00ff) + (i_408_ & 0xff00ff));
								i_408_ = (i_410_ & 0x1000100) + (i_409_ - i_410_ & 0x10000);
								is[i_296_++] = i_409_ - i_408_ | i_408_ - (i_408_ >>> 8);
							} else
								i_296_++;
						}
						i_296_ += i_300_;
						i_297_ += i_301_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void method2216(int i, int i_411_) {
		int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_412_ = Class_l_Sub1.anInt5202;
				while (i_412_ < 0) {
					int i_413_ = Class_l_Sub1.anInt5217;
					int i_414_ = Class_l_Sub1.anInt5206;
					int i_415_ = Class_l_Sub1.anInt5207;
					int i_416_ = Class_l_Sub1.anInt5212;
					if (i_414_ >= 0 && i_415_ >= 0 && i_414_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0 && (i_415_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						for (/**/; i_416_ < 0; i_416_++) {
							int i_417_ = (((i_415_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_414_ >> 12));
							int i_418_ = i_413_++;
							int[] is_419_ = is;
							int i_420_ = i;
							int i_421_ = i_411_;
							if (i_421_ == 0) {
								if (i_420_ == 1)
									is_419_[i_418_] = (anIntArray7035[aByteArray7036[i_417_] & 0xff]);
								else if (i_420_ == 0) {
									int i_422_ = (anIntArray7035[aByteArray7036[i_417_] & 0xff]);
									int i_423_ = (((i_422_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_424_ = (((i_422_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_425_ = (((i_422_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_419_[i_418_] = (i_423_ | i_424_ | i_425_) >>> 8;
								} else if (i_420_ == 3) {
									int i_426_ = (anIntArray7035[aByteArray7036[i_417_] & 0xff]);
									int i_427_ = Class_l_Sub1.anInt5221;
									int i_428_ = i_426_ + i_427_;
									int i_429_ = ((i_426_ & 0xff00ff) + (i_427_ & 0xff00ff));
									int i_430_ = ((i_429_ & 0x1000100) + (i_428_ - i_429_ & 0x10000));
									is_419_[i_418_] = i_428_ - i_430_ | i_430_ - (i_430_ >>> 8);
								} else if (i_420_ == 2) {
									int i_431_ = (anIntArray7035[aByteArray7036[i_417_] & 0xff]);
									int i_432_ = (((i_431_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_433_ = (((i_431_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_419_[i_418_] = (((i_432_ | i_433_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_421_ == 1) {
								if (i_420_ == 1) {
									int i_434_ = aByteArray7036[i_417_];
									if (i_434_ != 0)
										is_419_[i_418_] = anIntArray7035[i_434_ & 0xff];
								} else if (i_420_ == 0) {
									int i_435_ = aByteArray7036[i_417_];
									if (i_435_ != 0) {
										int i_436_ = anIntArray7035[i_435_ & 0xff];
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_437_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_438_ = 256 - i_437_;
											int i_439_ = is_419_[i_418_];
											is_419_[i_418_] = (((((i_436_ & 0xff00ff) * i_437_) + ((i_439_ & 0xff00ff) * i_438_)) & ~0xff00ff) + ((((i_436_ & 0xff00) * i_437_) + ((i_439_ & 0xff00) * i_438_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_440_ = (((i_436_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_441_ = (((i_436_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_442_ = (((i_436_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_436_ = (i_440_ | i_441_ | i_442_) >>> 8;
											int i_443_ = is_419_[i_418_];
											is_419_[i_418_] = (((((i_436_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_443_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_436_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_443_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_444_ = (((i_436_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_445_ = (((i_436_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_446_ = (((i_436_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_419_[i_418_] = (i_444_ | i_445_ | i_446_) >>> 8;
										}
									}
								} else if (i_420_ == 3) {
									byte i_447_ = aByteArray7036[i_417_];
									int i_448_ = (i_447_ > 0 ? anIntArray7035[i_447_] : 0);
									int i_449_ = Class_l_Sub1.anInt5221;
									int i_450_ = i_448_ + i_449_;
									int i_451_ = ((i_448_ & 0xff00ff) + (i_449_ & 0xff00ff));
									int i_452_ = ((i_451_ & 0x1000100) + (i_450_ - i_451_ & 0x10000));
									i_452_ = i_450_ - i_452_ | i_452_ - (i_452_ >>> 8);
									if (i_448_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_448_ = i_452_;
										i_452_ = is_419_[i_418_];
										i_452_ = (((((i_448_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_452_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_448_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_452_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_419_[i_418_] = i_452_;
								} else if (i_420_ == 2) {
									int i_453_ = aByteArray7036[i_417_];
									if (i_453_ != 0) {
										int i_454_ = anIntArray7035[i_453_ & 0xff];
										int i_455_ = (((i_454_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_456_ = (((i_454_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_419_[i_418_++] = (((i_455_ | i_456_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_421_ == 2) {
								if (i_420_ == 1) {
									int i_457_ = aByteArray7036[i_417_];
									if (i_457_ != 0) {
										int i_458_ = anIntArray7035[i_457_ & 0xff];
										int i_459_ = is_419_[i_418_];
										int i_460_ = i_458_ + i_459_;
										int i_461_ = ((i_458_ & 0xff00ff) + (i_459_ & 0xff00ff));
										i_459_ = ((i_461_ & 0x1000100) + (i_460_ - i_461_ & 0x10000));
										is_419_[i_418_] = (i_460_ - i_459_ | i_459_ - (i_459_ >>> 8));
									}
								} else if (i_420_ == 0) {
									int i_462_ = aByteArray7036[i_417_];
									if (i_462_ != 0) {
										int i_463_ = anIntArray7035[i_462_ & 0xff];
										int i_464_ = (((i_463_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_465_ = (((i_463_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_466_ = (((i_463_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_463_ = (i_464_ | i_465_ | i_466_) >>> 8;
										int i_467_ = is_419_[i_418_];
										int i_468_ = i_463_ + i_467_;
										int i_469_ = ((i_463_ & 0xff00ff) + (i_467_ & 0xff00ff));
										i_467_ = ((i_469_ & 0x1000100) + (i_468_ - i_469_ & 0x10000));
										is_419_[i_418_] = (i_468_ - i_467_ | i_467_ - (i_467_ >>> 8));
									}
								} else if (i_420_ == 3) {
									byte i_470_ = aByteArray7036[i_417_];
									int i_471_ = (i_470_ > 0 ? anIntArray7035[i_470_] : 0);
									int i_472_ = Class_l_Sub1.anInt5221;
									int i_473_ = i_471_ + i_472_;
									int i_474_ = ((i_471_ & 0xff00ff) + (i_472_ & 0xff00ff));
									int i_475_ = ((i_474_ & 0x1000100) + (i_473_ - i_474_ & 0x10000));
									i_475_ = i_473_ - i_475_ | i_475_ - (i_475_ >>> 8);
									if (i_471_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_471_ = i_475_;
										i_475_ = is_419_[i_418_];
										i_475_ = (((((i_471_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_475_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_471_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_475_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_419_[i_418_] = i_475_;
								} else if (i_420_ == 2) {
									int i_476_ = aByteArray7036[i_417_];
									if (i_476_ != 0) {
										int i_477_ = anIntArray7035[i_476_ & 0xff];
										int i_478_ = (((i_477_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_479_ = (((i_477_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_477_ = (((i_478_ | i_479_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_480_ = is_419_[i_418_];
										int i_481_ = i_477_ + i_480_;
										int i_482_ = ((i_477_ & 0xff00ff) + (i_480_ & 0xff00ff));
										i_480_ = ((i_482_ & 0x1000100) + (i_481_ - i_482_ & 0x10000));
										is_419_[i_418_] = (i_481_ - i_480_ | i_480_ - (i_480_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_412_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_483_ = Class_l_Sub1.anInt5202;
				while (i_483_ < 0) {
					int i_484_ = Class_l_Sub1.anInt5217;
					int i_485_ = Class_l_Sub1.anInt5206;
					int i_486_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_487_ = Class_l_Sub1.anInt5212;
					if (i_485_ >= 0 && (i_485_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						int i_488_;
						if ((i_488_ = i_486_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_488_ = ((Class_l_Sub1.anInt5226 - i_488_) / Class_l_Sub1.anInt5226);
							i_487_ += i_488_;
							i_486_ += Class_l_Sub1.anInt5226 * i_488_;
							i_484_ += i_488_;
						}
						if ((i_488_ = ((i_486_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_487_)
							i_487_ = i_488_;
						for (/**/; i_487_ < 0; i_487_++) {
							int i_489_ = (((i_486_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_485_ >> 12));
							int i_490_ = i_484_++;
							int[] is_491_ = is;
							int i_492_ = i;
							int i_493_ = i_411_;
							if (i_493_ == 0) {
								if (i_492_ == 1)
									is_491_[i_490_] = (anIntArray7035[aByteArray7036[i_489_] & 0xff]);
								else if (i_492_ == 0) {
									int i_494_ = (anIntArray7035[aByteArray7036[i_489_] & 0xff]);
									int i_495_ = (((i_494_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_496_ = (((i_494_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_497_ = (((i_494_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_491_[i_490_] = (i_495_ | i_496_ | i_497_) >>> 8;
								} else if (i_492_ == 3) {
									int i_498_ = (anIntArray7035[aByteArray7036[i_489_] & 0xff]);
									int i_499_ = Class_l_Sub1.anInt5221;
									int i_500_ = i_498_ + i_499_;
									int i_501_ = ((i_498_ & 0xff00ff) + (i_499_ & 0xff00ff));
									int i_502_ = ((i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000));
									is_491_[i_490_] = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
								} else if (i_492_ == 2) {
									int i_503_ = (anIntArray7035[aByteArray7036[i_489_] & 0xff]);
									int i_504_ = (((i_503_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_505_ = (((i_503_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_491_[i_490_] = (((i_504_ | i_505_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_493_ == 1) {
								if (i_492_ == 1) {
									int i_506_ = aByteArray7036[i_489_];
									if (i_506_ != 0)
										is_491_[i_490_] = anIntArray7035[i_506_ & 0xff];
								} else if (i_492_ == 0) {
									int i_507_ = aByteArray7036[i_489_];
									if (i_507_ != 0) {
										int i_508_ = anIntArray7035[i_507_ & 0xff];
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_509_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_510_ = 256 - i_509_;
											int i_511_ = is_491_[i_490_];
											is_491_[i_490_] = (((((i_508_ & 0xff00ff) * i_509_) + ((i_511_ & 0xff00ff) * i_510_)) & ~0xff00ff) + ((((i_508_ & 0xff00) * i_509_) + ((i_511_ & 0xff00) * i_510_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_512_ = (((i_508_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_513_ = (((i_508_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_514_ = (((i_508_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_508_ = (i_512_ | i_513_ | i_514_) >>> 8;
											int i_515_ = is_491_[i_490_];
											is_491_[i_490_] = (((((i_508_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_515_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_508_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_515_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_516_ = (((i_508_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_517_ = (((i_508_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_518_ = (((i_508_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_491_[i_490_] = (i_516_ | i_517_ | i_518_) >>> 8;
										}
									}
								} else if (i_492_ == 3) {
									byte i_519_ = aByteArray7036[i_489_];
									int i_520_ = (i_519_ > 0 ? anIntArray7035[i_519_] : 0);
									int i_521_ = Class_l_Sub1.anInt5221;
									int i_522_ = i_520_ + i_521_;
									int i_523_ = ((i_520_ & 0xff00ff) + (i_521_ & 0xff00ff));
									int i_524_ = ((i_523_ & 0x1000100) + (i_522_ - i_523_ & 0x10000));
									i_524_ = i_522_ - i_524_ | i_524_ - (i_524_ >>> 8);
									if (i_520_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_520_ = i_524_;
										i_524_ = is_491_[i_490_];
										i_524_ = (((((i_520_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_524_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_520_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_524_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_491_[i_490_] = i_524_;
								} else if (i_492_ == 2) {
									int i_525_ = aByteArray7036[i_489_];
									if (i_525_ != 0) {
										int i_526_ = anIntArray7035[i_525_ & 0xff];
										int i_527_ = (((i_526_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_528_ = (((i_526_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_491_[i_490_++] = (((i_527_ | i_528_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_493_ == 2) {
								if (i_492_ == 1) {
									int i_529_ = aByteArray7036[i_489_];
									if (i_529_ != 0) {
										int i_530_ = anIntArray7035[i_529_ & 0xff];
										int i_531_ = is_491_[i_490_];
										int i_532_ = i_530_ + i_531_;
										int i_533_ = ((i_530_ & 0xff00ff) + (i_531_ & 0xff00ff));
										i_531_ = ((i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000));
										is_491_[i_490_] = (i_532_ - i_531_ | i_531_ - (i_531_ >>> 8));
									}
								} else if (i_492_ == 0) {
									int i_534_ = aByteArray7036[i_489_];
									if (i_534_ != 0) {
										int i_535_ = anIntArray7035[i_534_ & 0xff];
										int i_536_ = (((i_535_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_537_ = (((i_535_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_538_ = (((i_535_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_535_ = (i_536_ | i_537_ | i_538_) >>> 8;
										int i_539_ = is_491_[i_490_];
										int i_540_ = i_535_ + i_539_;
										int i_541_ = ((i_535_ & 0xff00ff) + (i_539_ & 0xff00ff));
										i_539_ = ((i_541_ & 0x1000100) + (i_540_ - i_541_ & 0x10000));
										is_491_[i_490_] = (i_540_ - i_539_ | i_539_ - (i_539_ >>> 8));
									}
								} else if (i_492_ == 3) {
									byte i_542_ = aByteArray7036[i_489_];
									int i_543_ = (i_542_ > 0 ? anIntArray7035[i_542_] : 0);
									int i_544_ = Class_l_Sub1.anInt5221;
									int i_545_ = i_543_ + i_544_;
									int i_546_ = ((i_543_ & 0xff00ff) + (i_544_ & 0xff00ff));
									int i_547_ = ((i_546_ & 0x1000100) + (i_545_ - i_546_ & 0x10000));
									i_547_ = i_545_ - i_547_ | i_547_ - (i_547_ >>> 8);
									if (i_543_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_543_ = i_547_;
										i_547_ = is_491_[i_490_];
										i_547_ = (((((i_543_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_547_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_543_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_547_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_491_[i_490_] = i_547_;
								} else if (i_492_ == 2) {
									int i_548_ = aByteArray7036[i_489_];
									if (i_548_ != 0) {
										int i_549_ = anIntArray7035[i_548_ & 0xff];
										int i_550_ = (((i_549_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_551_ = (((i_549_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_549_ = (((i_550_ | i_551_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_552_ = is_491_[i_490_];
										int i_553_ = i_549_ + i_552_;
										int i_554_ = ((i_549_ & 0xff00ff) + (i_552_ & 0xff00ff));
										i_552_ = ((i_554_ & 0x1000100) + (i_553_ - i_554_ & 0x10000));
										is_491_[i_490_] = (i_553_ - i_552_ | i_552_ - (i_552_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_486_ += Class_l_Sub1.anInt5226;
						}
					}
					i_483_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_555_ = Class_l_Sub1.anInt5202;
				while (i_555_ < 0) {
					int i_556_ = Class_l_Sub1.anInt5217;
					int i_557_ = Class_l_Sub1.anInt5206;
					int i_558_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_559_ = Class_l_Sub1.anInt5212;
					if (i_557_ >= 0 && (i_557_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						if (i_558_ < 0) {
							int i_560_ = ((Class_l_Sub1.anInt5226 - 1 - i_558_) / Class_l_Sub1.anInt5226);
							i_559_ += i_560_;
							i_558_ += Class_l_Sub1.anInt5226 * i_560_;
							i_556_ += i_560_;
						}
						int i_561_;
						if ((i_561_ = ((1 + i_558_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_559_)
							i_559_ = i_561_;
						for (/**/; i_559_ < 0; i_559_++) {
							int i_562_ = (((i_558_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_557_ >> 12));
							int i_563_ = i_556_++;
							int[] is_564_ = is;
							int i_565_ = i;
							int i_566_ = i_411_;
							if (i_566_ == 0) {
								if (i_565_ == 1)
									is_564_[i_563_] = (anIntArray7035[aByteArray7036[i_562_] & 0xff]);
								else if (i_565_ == 0) {
									int i_567_ = (anIntArray7035[aByteArray7036[i_562_] & 0xff]);
									int i_568_ = (((i_567_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_569_ = (((i_567_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_570_ = (((i_567_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_564_[i_563_] = (i_568_ | i_569_ | i_570_) >>> 8;
								} else if (i_565_ == 3) {
									int i_571_ = (anIntArray7035[aByteArray7036[i_562_] & 0xff]);
									int i_572_ = Class_l_Sub1.anInt5221;
									int i_573_ = i_571_ + i_572_;
									int i_574_ = ((i_571_ & 0xff00ff) + (i_572_ & 0xff00ff));
									int i_575_ = ((i_574_ & 0x1000100) + (i_573_ - i_574_ & 0x10000));
									is_564_[i_563_] = i_573_ - i_575_ | i_575_ - (i_575_ >>> 8);
								} else if (i_565_ == 2) {
									int i_576_ = (anIntArray7035[aByteArray7036[i_562_] & 0xff]);
									int i_577_ = (((i_576_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_578_ = (((i_576_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_564_[i_563_] = (((i_577_ | i_578_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_566_ == 1) {
								if (i_565_ == 1) {
									int i_579_ = aByteArray7036[i_562_];
									if (i_579_ != 0)
										is_564_[i_563_] = anIntArray7035[i_579_ & 0xff];
								} else if (i_565_ == 0) {
									int i_580_ = aByteArray7036[i_562_];
									if (i_580_ != 0) {
										int i_581_ = anIntArray7035[i_580_ & 0xff];
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_582_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_583_ = 256 - i_582_;
											int i_584_ = is_564_[i_563_];
											is_564_[i_563_] = (((((i_581_ & 0xff00ff) * i_582_) + ((i_584_ & 0xff00ff) * i_583_)) & ~0xff00ff) + ((((i_581_ & 0xff00) * i_582_) + ((i_584_ & 0xff00) * i_583_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_585_ = (((i_581_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_586_ = (((i_581_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_587_ = (((i_581_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_581_ = (i_585_ | i_586_ | i_587_) >>> 8;
											int i_588_ = is_564_[i_563_];
											is_564_[i_563_] = (((((i_581_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_588_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_581_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_588_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_589_ = (((i_581_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_590_ = (((i_581_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_591_ = (((i_581_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_564_[i_563_] = (i_589_ | i_590_ | i_591_) >>> 8;
										}
									}
								} else if (i_565_ == 3) {
									byte i_592_ = aByteArray7036[i_562_];
									int i_593_ = (i_592_ > 0 ? anIntArray7035[i_592_] : 0);
									int i_594_ = Class_l_Sub1.anInt5221;
									int i_595_ = i_593_ + i_594_;
									int i_596_ = ((i_593_ & 0xff00ff) + (i_594_ & 0xff00ff));
									int i_597_ = ((i_596_ & 0x1000100) + (i_595_ - i_596_ & 0x10000));
									i_597_ = i_595_ - i_597_ | i_597_ - (i_597_ >>> 8);
									if (i_593_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_593_ = i_597_;
										i_597_ = is_564_[i_563_];
										i_597_ = (((((i_593_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_597_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_593_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_597_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_564_[i_563_] = i_597_;
								} else if (i_565_ == 2) {
									int i_598_ = aByteArray7036[i_562_];
									if (i_598_ != 0) {
										int i_599_ = anIntArray7035[i_598_ & 0xff];
										int i_600_ = (((i_599_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_601_ = (((i_599_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_564_[i_563_++] = (((i_600_ | i_601_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_566_ == 2) {
								if (i_565_ == 1) {
									int i_602_ = aByteArray7036[i_562_];
									if (i_602_ != 0) {
										int i_603_ = anIntArray7035[i_602_ & 0xff];
										int i_604_ = is_564_[i_563_];
										int i_605_ = i_603_ + i_604_;
										int i_606_ = ((i_603_ & 0xff00ff) + (i_604_ & 0xff00ff));
										i_604_ = ((i_606_ & 0x1000100) + (i_605_ - i_606_ & 0x10000));
										is_564_[i_563_] = (i_605_ - i_604_ | i_604_ - (i_604_ >>> 8));
									}
								} else if (i_565_ == 0) {
									int i_607_ = aByteArray7036[i_562_];
									if (i_607_ != 0) {
										int i_608_ = anIntArray7035[i_607_ & 0xff];
										int i_609_ = (((i_608_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_610_ = (((i_608_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_611_ = (((i_608_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_608_ = (i_609_ | i_610_ | i_611_) >>> 8;
										int i_612_ = is_564_[i_563_];
										int i_613_ = i_608_ + i_612_;
										int i_614_ = ((i_608_ & 0xff00ff) + (i_612_ & 0xff00ff));
										i_612_ = ((i_614_ & 0x1000100) + (i_613_ - i_614_ & 0x10000));
										is_564_[i_563_] = (i_613_ - i_612_ | i_612_ - (i_612_ >>> 8));
									}
								} else if (i_565_ == 3) {
									byte i_615_ = aByteArray7036[i_562_];
									int i_616_ = (i_615_ > 0 ? anIntArray7035[i_615_] : 0);
									int i_617_ = Class_l_Sub1.anInt5221;
									int i_618_ = i_616_ + i_617_;
									int i_619_ = ((i_616_ & 0xff00ff) + (i_617_ & 0xff00ff));
									int i_620_ = ((i_619_ & 0x1000100) + (i_618_ - i_619_ & 0x10000));
									i_620_ = i_618_ - i_620_ | i_620_ - (i_620_ >>> 8);
									if (i_616_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_616_ = i_620_;
										i_620_ = is_564_[i_563_];
										i_620_ = (((((i_616_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_620_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_616_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_620_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_564_[i_563_] = i_620_;
								} else if (i_565_ == 2) {
									int i_621_ = aByteArray7036[i_562_];
									if (i_621_ != 0) {
										int i_622_ = anIntArray7035[i_621_ & 0xff];
										int i_623_ = (((i_622_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_624_ = (((i_622_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_622_ = (((i_623_ | i_624_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_625_ = is_564_[i_563_];
										int i_626_ = i_622_ + i_625_;
										int i_627_ = ((i_622_ & 0xff00ff) + (i_625_ & 0xff00ff));
										i_625_ = ((i_627_ & 0x1000100) + (i_626_ - i_627_ & 0x10000));
										is_564_[i_563_] = (i_626_ - i_625_ | i_625_ - (i_625_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_558_ += Class_l_Sub1.anInt5226;
						}
					}
					i_555_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_628_ = Class_l_Sub1.anInt5202;
				while (i_628_ < 0) {
					int i_629_ = Class_l_Sub1.anInt5217;
					int i_630_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_631_ = Class_l_Sub1.anInt5207;
					int i_632_ = Class_l_Sub1.anInt5212;
					if (i_631_ >= 0 && (i_631_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						int i_633_;
						if ((i_633_ = i_630_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_633_ = ((Class_l_Sub1.anInt5214 - i_633_) / Class_l_Sub1.anInt5214);
							i_632_ += i_633_;
							i_630_ += Class_l_Sub1.anInt5214 * i_633_;
							i_629_ += i_633_;
						}
						if ((i_633_ = ((i_630_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_632_)
							i_632_ = i_633_;
						for (/**/; i_632_ < 0; i_632_++) {
							int i_634_ = (((i_631_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_630_ >> 12));
							int i_635_ = i_629_++;
							int[] is_636_ = is;
							int i_637_ = i;
							int i_638_ = i_411_;
							if (i_638_ == 0) {
								if (i_637_ == 1)
									is_636_[i_635_] = (anIntArray7035[aByteArray7036[i_634_] & 0xff]);
								else if (i_637_ == 0) {
									int i_639_ = (anIntArray7035[aByteArray7036[i_634_] & 0xff]);
									int i_640_ = (((i_639_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_641_ = (((i_639_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_642_ = (((i_639_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_636_[i_635_] = (i_640_ | i_641_ | i_642_) >>> 8;
								} else if (i_637_ == 3) {
									int i_643_ = (anIntArray7035[aByteArray7036[i_634_] & 0xff]);
									int i_644_ = Class_l_Sub1.anInt5221;
									int i_645_ = i_643_ + i_644_;
									int i_646_ = ((i_643_ & 0xff00ff) + (i_644_ & 0xff00ff));
									int i_647_ = ((i_646_ & 0x1000100) + (i_645_ - i_646_ & 0x10000));
									is_636_[i_635_] = i_645_ - i_647_ | i_647_ - (i_647_ >>> 8);
								} else if (i_637_ == 2) {
									int i_648_ = (anIntArray7035[aByteArray7036[i_634_] & 0xff]);
									int i_649_ = (((i_648_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_650_ = (((i_648_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_636_[i_635_] = (((i_649_ | i_650_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_638_ == 1) {
								if (i_637_ == 1) {
									int i_651_ = aByteArray7036[i_634_];
									if (i_651_ != 0)
										is_636_[i_635_] = anIntArray7035[i_651_ & 0xff];
								} else if (i_637_ == 0) {
									int i_652_ = aByteArray7036[i_634_];
									if (i_652_ != 0) {
										int i_653_ = anIntArray7035[i_652_ & 0xff];
										if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
											int i_654_ = (Class_l_Sub1.anInt5221 >>> 24);
											int i_655_ = 256 - i_654_;
											int i_656_ = is_636_[i_635_];
											is_636_[i_635_] = (((((i_653_ & 0xff00ff) * i_654_) + ((i_656_ & 0xff00ff) * i_655_)) & ~0xff00ff) + ((((i_653_ & 0xff00) * i_654_) + ((i_656_ & 0xff00) * i_655_)) & 0xff0000)) >> 8;
										} else if (Class_l_Sub1.anInt5223 != 255) {
											int i_657_ = (((i_653_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_658_ = (((i_653_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_659_ = (((i_653_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											i_653_ = (i_657_ | i_658_ | i_659_) >>> 8;
											int i_660_ = is_636_[i_635_];
											is_636_[i_635_] = (((((i_653_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_660_ & 0xff00ff) * (Class_l_Sub1.anInt5220))) & ~0xff00ff) + ((((i_653_ & 0xff00) * (Class_l_Sub1.anInt5223)) + ((i_660_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
										} else {
											int i_661_ = (((i_653_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
											int i_662_ = (((i_653_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
											int i_663_ = (((i_653_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
											is_636_[i_635_] = (i_661_ | i_662_ | i_663_) >>> 8;
										}
									}
								} else if (i_637_ == 3) {
									byte i_664_ = aByteArray7036[i_634_];
									int i_665_ = (i_664_ > 0 ? anIntArray7035[i_664_] : 0);
									int i_666_ = Class_l_Sub1.anInt5221;
									int i_667_ = i_665_ + i_666_;
									int i_668_ = ((i_665_ & 0xff00ff) + (i_666_ & 0xff00ff));
									int i_669_ = ((i_668_ & 0x1000100) + (i_667_ - i_668_ & 0x10000));
									i_669_ = i_667_ - i_669_ | i_669_ - (i_669_ >>> 8);
									if (i_665_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_665_ = i_669_;
										i_669_ = is_636_[i_635_];
										i_669_ = (((((i_665_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_669_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_665_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_669_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_636_[i_635_] = i_669_;
								} else if (i_637_ == 2) {
									int i_670_ = aByteArray7036[i_634_];
									if (i_670_ != 0) {
										int i_671_ = anIntArray7035[i_670_ & 0xff];
										int i_672_ = (((i_671_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_673_ = (((i_671_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										is_636_[i_635_++] = (((i_672_ | i_673_) >>> 8) + Class_l_Sub1.anInt5213);
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_638_ == 2) {
								if (i_637_ == 1) {
									int i_674_ = aByteArray7036[i_634_];
									if (i_674_ != 0) {
										int i_675_ = anIntArray7035[i_674_ & 0xff];
										int i_676_ = is_636_[i_635_];
										int i_677_ = i_675_ + i_676_;
										int i_678_ = ((i_675_ & 0xff00ff) + (i_676_ & 0xff00ff));
										i_676_ = ((i_678_ & 0x1000100) + (i_677_ - i_678_ & 0x10000));
										is_636_[i_635_] = (i_677_ - i_676_ | i_676_ - (i_676_ >>> 8));
									}
								} else if (i_637_ == 0) {
									int i_679_ = aByteArray7036[i_634_];
									if (i_679_ != 0) {
										int i_680_ = anIntArray7035[i_679_ & 0xff];
										int i_681_ = (((i_680_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_682_ = (((i_680_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_683_ = (((i_680_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_680_ = (i_681_ | i_682_ | i_683_) >>> 8;
										int i_684_ = is_636_[i_635_];
										int i_685_ = i_680_ + i_684_;
										int i_686_ = ((i_680_ & 0xff00ff) + (i_684_ & 0xff00ff));
										i_684_ = ((i_686_ & 0x1000100) + (i_685_ - i_686_ & 0x10000));
										is_636_[i_635_] = (i_685_ - i_684_ | i_684_ - (i_684_ >>> 8));
									}
								} else if (i_637_ == 3) {
									byte i_687_ = aByteArray7036[i_634_];
									int i_688_ = (i_687_ > 0 ? anIntArray7035[i_687_] : 0);
									int i_689_ = Class_l_Sub1.anInt5221;
									int i_690_ = i_688_ + i_689_;
									int i_691_ = ((i_688_ & 0xff00ff) + (i_689_ & 0xff00ff));
									int i_692_ = ((i_691_ & 0x1000100) + (i_690_ - i_691_ & 0x10000));
									i_692_ = i_690_ - i_692_ | i_692_ - (i_692_ >>> 8);
									if (i_688_ == 0 && Class_l_Sub1.anInt5223 != 255) {
										i_688_ = i_692_;
										i_692_ = is_636_[i_635_];
										i_692_ = (((((i_688_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_692_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_688_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_692_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									}
									is_636_[i_635_] = i_692_;
								} else if (i_637_ == 2) {
									int i_693_ = aByteArray7036[i_634_];
									if (i_693_ != 0) {
										int i_694_ = anIntArray7035[i_693_ & 0xff];
										int i_695_ = (((i_694_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
										int i_696_ = (((i_694_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
										i_694_ = (((i_695_ | i_696_) >>> 8) + Class_l_Sub1.anInt5213);
										int i_697_ = is_636_[i_635_];
										int i_698_ = i_694_ + i_697_;
										int i_699_ = ((i_694_ & 0xff00ff) + (i_697_ & 0xff00ff));
										i_697_ = ((i_699_ & 0x1000100) + (i_698_ - i_699_ & 0x10000));
										is_636_[i_635_] = (i_698_ - i_697_ | i_697_ - (i_697_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_630_ += Class_l_Sub1.anInt5214;
						}
					}
					i_628_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_700_ = Class_l_Sub1.anInt5202;
				while (i_700_ < 0) {
					int i_701_ = Class_l_Sub1.anInt5217;
					int i_702_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_703_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_704_ = Class_l_Sub1.anInt5212;
					int i_705_;
					if ((i_705_ = i_702_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_705_ = ((Class_l_Sub1.anInt5214 - i_705_) / Class_l_Sub1.anInt5214);
						i_704_ += i_705_;
						i_702_ += Class_l_Sub1.anInt5214 * i_705_;
						i_703_ += Class_l_Sub1.anInt5226 * i_705_;
						i_701_ += i_705_;
					}
					if ((i_705_ = ((i_702_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_704_)
						i_704_ = i_705_;
					if ((i_705_ = i_703_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_705_ = ((Class_l_Sub1.anInt5226 - i_705_) / Class_l_Sub1.anInt5226);
						i_704_ += i_705_;
						i_702_ += Class_l_Sub1.anInt5214 * i_705_;
						i_703_ += Class_l_Sub1.anInt5226 * i_705_;
						i_701_ += i_705_;
					}
					if ((i_705_ = ((i_703_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_704_)
						i_704_ = i_705_;
					for (/**/; i_704_ < 0; i_704_++) {
						int i_706_ = ((i_703_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_702_ >> 12));
						int i_707_ = i_701_++;
						int[] is_708_ = is;
						int i_709_ = i;
						int i_710_ = i_411_;
						if (i_710_ == 0) {
							if (i_709_ == 1)
								is_708_[i_707_] = (anIntArray7035[aByteArray7036[i_706_] & 0xff]);
							else if (i_709_ == 0) {
								int i_711_ = (anIntArray7035[aByteArray7036[i_706_] & 0xff]);
								int i_712_ = (((i_711_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_713_ = (((i_711_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_714_ = ((i_711_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_708_[i_707_] = (i_712_ | i_713_ | i_714_) >>> 8;
							} else if (i_709_ == 3) {
								int i_715_ = (anIntArray7035[aByteArray7036[i_706_] & 0xff]);
								int i_716_ = Class_l_Sub1.anInt5221;
								int i_717_ = i_715_ + i_716_;
								int i_718_ = ((i_715_ & 0xff00ff) + (i_716_ & 0xff00ff));
								int i_719_ = ((i_718_ & 0x1000100) + (i_717_ - i_718_ & 0x10000));
								is_708_[i_707_] = i_717_ - i_719_ | i_719_ - (i_719_ >>> 8);
							} else if (i_709_ == 2) {
								int i_720_ = (anIntArray7035[aByteArray7036[i_706_] & 0xff]);
								int i_721_ = (((i_720_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_722_ = (((i_720_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_708_[i_707_] = (((i_721_ | i_722_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_710_ == 1) {
							if (i_709_ == 1) {
								int i_723_ = aByteArray7036[i_706_];
								if (i_723_ != 0)
									is_708_[i_707_] = anIntArray7035[i_723_ & 0xff];
							} else if (i_709_ == 0) {
								int i_724_ = aByteArray7036[i_706_];
								if (i_724_ != 0) {
									int i_725_ = anIntArray7035[i_724_ & 0xff];
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_726_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_727_ = 256 - i_726_;
										int i_728_ = is_708_[i_707_];
										is_708_[i_707_] = ((((i_725_ & 0xff00ff) * i_726_ + ((i_728_ & 0xff00ff) * i_727_)) & ~0xff00ff) + (((i_725_ & 0xff00) * i_726_ + ((i_728_ & 0xff00) * i_727_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_729_ = (((i_725_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_730_ = (((i_725_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_731_ = (((i_725_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_725_ = (i_729_ | i_730_ | i_731_) >>> 8;
										int i_732_ = is_708_[i_707_];
										is_708_[i_707_] = (((((i_725_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_732_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_725_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_732_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_733_ = (((i_725_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_734_ = (((i_725_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_735_ = (((i_725_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_708_[i_707_] = (i_733_ | i_734_ | i_735_) >>> 8;
									}
								}
							} else if (i_709_ == 3) {
								byte i_736_ = aByteArray7036[i_706_];
								int i_737_ = i_736_ > 0 ? anIntArray7035[i_736_] : 0;
								int i_738_ = Class_l_Sub1.anInt5221;
								int i_739_ = i_737_ + i_738_;
								int i_740_ = ((i_737_ & 0xff00ff) + (i_738_ & 0xff00ff));
								int i_741_ = ((i_740_ & 0x1000100) + (i_739_ - i_740_ & 0x10000));
								i_741_ = i_739_ - i_741_ | i_741_ - (i_741_ >>> 8);
								if (i_737_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_737_ = i_741_;
									i_741_ = is_708_[i_707_];
									i_741_ = (((((i_737_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_741_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_737_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_741_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_708_[i_707_] = i_741_;
							} else if (i_709_ == 2) {
								int i_742_ = aByteArray7036[i_706_];
								if (i_742_ != 0) {
									int i_743_ = anIntArray7035[i_742_ & 0xff];
									int i_744_ = (((i_743_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_745_ = (((i_743_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_708_[i_707_++] = (((i_744_ | i_745_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_710_ == 2) {
							if (i_709_ == 1) {
								int i_746_ = aByteArray7036[i_706_];
								if (i_746_ != 0) {
									int i_747_ = anIntArray7035[i_746_ & 0xff];
									int i_748_ = is_708_[i_707_];
									int i_749_ = i_747_ + i_748_;
									int i_750_ = ((i_747_ & 0xff00ff) + (i_748_ & 0xff00ff));
									i_748_ = ((i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000));
									is_708_[i_707_] = i_749_ - i_748_ | i_748_ - (i_748_ >>> 8);
								}
							} else if (i_709_ == 0) {
								int i_751_ = aByteArray7036[i_706_];
								if (i_751_ != 0) {
									int i_752_ = anIntArray7035[i_751_ & 0xff];
									int i_753_ = (((i_752_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_754_ = (((i_752_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_755_ = (((i_752_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_752_ = (i_753_ | i_754_ | i_755_) >>> 8;
									int i_756_ = is_708_[i_707_];
									int i_757_ = i_752_ + i_756_;
									int i_758_ = ((i_752_ & 0xff00ff) + (i_756_ & 0xff00ff));
									i_756_ = ((i_758_ & 0x1000100) + (i_757_ - i_758_ & 0x10000));
									is_708_[i_707_] = i_757_ - i_756_ | i_756_ - (i_756_ >>> 8);
								}
							} else if (i_709_ == 3) {
								byte i_759_ = aByteArray7036[i_706_];
								int i_760_ = i_759_ > 0 ? anIntArray7035[i_759_] : 0;
								int i_761_ = Class_l_Sub1.anInt5221;
								int i_762_ = i_760_ + i_761_;
								int i_763_ = ((i_760_ & 0xff00ff) + (i_761_ & 0xff00ff));
								int i_764_ = ((i_763_ & 0x1000100) + (i_762_ - i_763_ & 0x10000));
								i_764_ = i_762_ - i_764_ | i_764_ - (i_764_ >>> 8);
								if (i_760_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_760_ = i_764_;
									i_764_ = is_708_[i_707_];
									i_764_ = (((((i_760_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_764_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_760_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_764_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_708_[i_707_] = i_764_;
							} else if (i_709_ == 2) {
								int i_765_ = aByteArray7036[i_706_];
								if (i_765_ != 0) {
									int i_766_ = anIntArray7035[i_765_ & 0xff];
									int i_767_ = (((i_766_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_768_ = (((i_766_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_766_ = (((i_767_ | i_768_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_769_ = is_708_[i_707_];
									int i_770_ = i_766_ + i_769_;
									int i_771_ = ((i_766_ & 0xff00ff) + (i_769_ & 0xff00ff));
									i_769_ = ((i_771_ & 0x1000100) + (i_770_ - i_771_ & 0x10000));
									is_708_[i_707_] = i_770_ - i_769_ | i_769_ - (i_769_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_702_ += Class_l_Sub1.anInt5214;
						i_703_ += Class_l_Sub1.anInt5226;
					}
					i_700_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_772_ = Class_l_Sub1.anInt5202;
				while (i_772_ < 0) {
					int i_773_ = Class_l_Sub1.anInt5217;
					int i_774_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_775_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_776_ = Class_l_Sub1.anInt5212;
					int i_777_;
					if ((i_777_ = i_774_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_777_ = ((Class_l_Sub1.anInt5214 - i_777_) / Class_l_Sub1.anInt5214);
						i_776_ += i_777_;
						i_774_ += Class_l_Sub1.anInt5214 * i_777_;
						i_775_ += Class_l_Sub1.anInt5226 * i_777_;
						i_773_ += i_777_;
					}
					if ((i_777_ = ((i_774_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_776_)
						i_776_ = i_777_;
					if (i_775_ < 0) {
						i_777_ = ((Class_l_Sub1.anInt5226 - 1 - i_775_) / Class_l_Sub1.anInt5226);
						i_776_ += i_777_;
						i_774_ += Class_l_Sub1.anInt5214 * i_777_;
						i_775_ += Class_l_Sub1.anInt5226 * i_777_;
						i_773_ += i_777_;
					}
					if ((i_777_ = (1 + i_775_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_776_)
						i_776_ = i_777_;
					for (/**/; i_776_ < 0; i_776_++) {
						int i_778_ = ((i_775_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_774_ >> 12));
						int i_779_ = i_773_++;
						int[] is_780_ = is;
						int i_781_ = i;
						int i_782_ = i_411_;
						if (i_782_ == 0) {
							if (i_781_ == 1)
								is_780_[i_779_] = (anIntArray7035[aByteArray7036[i_778_] & 0xff]);
							else if (i_781_ == 0) {
								int i_783_ = (anIntArray7035[aByteArray7036[i_778_] & 0xff]);
								int i_784_ = (((i_783_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_785_ = (((i_783_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_786_ = ((i_783_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_780_[i_779_] = (i_784_ | i_785_ | i_786_) >>> 8;
							} else if (i_781_ == 3) {
								int i_787_ = (anIntArray7035[aByteArray7036[i_778_] & 0xff]);
								int i_788_ = Class_l_Sub1.anInt5221;
								int i_789_ = i_787_ + i_788_;
								int i_790_ = ((i_787_ & 0xff00ff) + (i_788_ & 0xff00ff));
								int i_791_ = ((i_790_ & 0x1000100) + (i_789_ - i_790_ & 0x10000));
								is_780_[i_779_] = i_789_ - i_791_ | i_791_ - (i_791_ >>> 8);
							} else if (i_781_ == 2) {
								int i_792_ = (anIntArray7035[aByteArray7036[i_778_] & 0xff]);
								int i_793_ = (((i_792_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_794_ = (((i_792_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_780_[i_779_] = (((i_793_ | i_794_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_782_ == 1) {
							if (i_781_ == 1) {
								int i_795_ = aByteArray7036[i_778_];
								if (i_795_ != 0)
									is_780_[i_779_] = anIntArray7035[i_795_ & 0xff];
							} else if (i_781_ == 0) {
								int i_796_ = aByteArray7036[i_778_];
								if (i_796_ != 0) {
									int i_797_ = anIntArray7035[i_796_ & 0xff];
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_798_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_799_ = 256 - i_798_;
										int i_800_ = is_780_[i_779_];
										is_780_[i_779_] = ((((i_797_ & 0xff00ff) * i_798_ + ((i_800_ & 0xff00ff) * i_799_)) & ~0xff00ff) + (((i_797_ & 0xff00) * i_798_ + ((i_800_ & 0xff00) * i_799_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_801_ = (((i_797_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_802_ = (((i_797_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_803_ = (((i_797_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_797_ = (i_801_ | i_802_ | i_803_) >>> 8;
										int i_804_ = is_780_[i_779_];
										is_780_[i_779_] = (((((i_797_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_804_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_797_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_804_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_805_ = (((i_797_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_806_ = (((i_797_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_807_ = (((i_797_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_780_[i_779_] = (i_805_ | i_806_ | i_807_) >>> 8;
									}
								}
							} else if (i_781_ == 3) {
								byte i_808_ = aByteArray7036[i_778_];
								int i_809_ = i_808_ > 0 ? anIntArray7035[i_808_] : 0;
								int i_810_ = Class_l_Sub1.anInt5221;
								int i_811_ = i_809_ + i_810_;
								int i_812_ = ((i_809_ & 0xff00ff) + (i_810_ & 0xff00ff));
								int i_813_ = ((i_812_ & 0x1000100) + (i_811_ - i_812_ & 0x10000));
								i_813_ = i_811_ - i_813_ | i_813_ - (i_813_ >>> 8);
								if (i_809_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_809_ = i_813_;
									i_813_ = is_780_[i_779_];
									i_813_ = (((((i_809_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_813_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_809_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_813_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_780_[i_779_] = i_813_;
							} else if (i_781_ == 2) {
								int i_814_ = aByteArray7036[i_778_];
								if (i_814_ != 0) {
									int i_815_ = anIntArray7035[i_814_ & 0xff];
									int i_816_ = (((i_815_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_817_ = (((i_815_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_780_[i_779_++] = (((i_816_ | i_817_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_782_ == 2) {
							if (i_781_ == 1) {
								int i_818_ = aByteArray7036[i_778_];
								if (i_818_ != 0) {
									int i_819_ = anIntArray7035[i_818_ & 0xff];
									int i_820_ = is_780_[i_779_];
									int i_821_ = i_819_ + i_820_;
									int i_822_ = ((i_819_ & 0xff00ff) + (i_820_ & 0xff00ff));
									i_820_ = ((i_822_ & 0x1000100) + (i_821_ - i_822_ & 0x10000));
									is_780_[i_779_] = i_821_ - i_820_ | i_820_ - (i_820_ >>> 8);
								}
							} else if (i_781_ == 0) {
								int i_823_ = aByteArray7036[i_778_];
								if (i_823_ != 0) {
									int i_824_ = anIntArray7035[i_823_ & 0xff];
									int i_825_ = (((i_824_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_826_ = (((i_824_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_827_ = (((i_824_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_824_ = (i_825_ | i_826_ | i_827_) >>> 8;
									int i_828_ = is_780_[i_779_];
									int i_829_ = i_824_ + i_828_;
									int i_830_ = ((i_824_ & 0xff00ff) + (i_828_ & 0xff00ff));
									i_828_ = ((i_830_ & 0x1000100) + (i_829_ - i_830_ & 0x10000));
									is_780_[i_779_] = i_829_ - i_828_ | i_828_ - (i_828_ >>> 8);
								}
							} else if (i_781_ == 3) {
								byte i_831_ = aByteArray7036[i_778_];
								int i_832_ = i_831_ > 0 ? anIntArray7035[i_831_] : 0;
								int i_833_ = Class_l_Sub1.anInt5221;
								int i_834_ = i_832_ + i_833_;
								int i_835_ = ((i_832_ & 0xff00ff) + (i_833_ & 0xff00ff));
								int i_836_ = ((i_835_ & 0x1000100) + (i_834_ - i_835_ & 0x10000));
								i_836_ = i_834_ - i_836_ | i_836_ - (i_836_ >>> 8);
								if (i_832_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_832_ = i_836_;
									i_836_ = is_780_[i_779_];
									i_836_ = (((((i_832_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_836_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_832_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_836_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_780_[i_779_] = i_836_;
							} else if (i_781_ == 2) {
								int i_837_ = aByteArray7036[i_778_];
								if (i_837_ != 0) {
									int i_838_ = anIntArray7035[i_837_ & 0xff];
									int i_839_ = (((i_838_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_840_ = (((i_838_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_838_ = (((i_839_ | i_840_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_841_ = is_780_[i_779_];
									int i_842_ = i_838_ + i_841_;
									int i_843_ = ((i_838_ & 0xff00ff) + (i_841_ & 0xff00ff));
									i_841_ = ((i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000));
									is_780_[i_779_] = i_842_ - i_841_ | i_841_ - (i_841_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_774_ += Class_l_Sub1.anInt5214;
						i_775_ += Class_l_Sub1.anInt5226;
					}
					i_772_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_844_ = Class_l_Sub1.anInt5202;
			while (i_844_ < 0) {
				int i_845_ = Class_l_Sub1.anInt5217;
				int i_846_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_847_ = Class_l_Sub1.anInt5207;
				int i_848_ = Class_l_Sub1.anInt5212;
				if (i_847_ >= 0 && i_847_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
					if (i_846_ < 0) {
						int i_849_ = ((Class_l_Sub1.anInt5214 - 1 - i_846_) / Class_l_Sub1.anInt5214);
						i_848_ += i_849_;
						i_846_ += Class_l_Sub1.anInt5214 * i_849_;
						i_845_ += i_849_;
					}
					int i_850_;
					if ((i_850_ = (1 + i_846_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_848_)
						i_848_ = i_850_;
					for (/**/; i_848_ < 0; i_848_++) {
						int i_851_ = ((i_847_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_846_ >> 12));
						int i_852_ = i_845_++;
						int[] is_853_ = is;
						int i_854_ = i;
						int i_855_ = i_411_;
						if (i_855_ == 0) {
							if (i_854_ == 1)
								is_853_[i_852_] = (anIntArray7035[aByteArray7036[i_851_] & 0xff]);
							else if (i_854_ == 0) {
								int i_856_ = (anIntArray7035[aByteArray7036[i_851_] & 0xff]);
								int i_857_ = (((i_856_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_858_ = (((i_856_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_859_ = ((i_856_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_853_[i_852_] = (i_857_ | i_858_ | i_859_) >>> 8;
							} else if (i_854_ == 3) {
								int i_860_ = (anIntArray7035[aByteArray7036[i_851_] & 0xff]);
								int i_861_ = Class_l_Sub1.anInt5221;
								int i_862_ = i_860_ + i_861_;
								int i_863_ = ((i_860_ & 0xff00ff) + (i_861_ & 0xff00ff));
								int i_864_ = ((i_863_ & 0x1000100) + (i_862_ - i_863_ & 0x10000));
								is_853_[i_852_] = i_862_ - i_864_ | i_864_ - (i_864_ >>> 8);
							} else if (i_854_ == 2) {
								int i_865_ = (anIntArray7035[aByteArray7036[i_851_] & 0xff]);
								int i_866_ = (((i_865_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_867_ = (((i_865_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_853_[i_852_] = (((i_866_ | i_867_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_855_ == 1) {
							if (i_854_ == 1) {
								int i_868_ = aByteArray7036[i_851_];
								if (i_868_ != 0)
									is_853_[i_852_] = anIntArray7035[i_868_ & 0xff];
							} else if (i_854_ == 0) {
								int i_869_ = aByteArray7036[i_851_];
								if (i_869_ != 0) {
									int i_870_ = anIntArray7035[i_869_ & 0xff];
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_871_ = Class_l_Sub1.anInt5221 >>> 24;
										int i_872_ = 256 - i_871_;
										int i_873_ = is_853_[i_852_];
										is_853_[i_852_] = ((((i_870_ & 0xff00ff) * i_871_ + ((i_873_ & 0xff00ff) * i_872_)) & ~0xff00ff) + (((i_870_ & 0xff00) * i_871_ + ((i_873_ & 0xff00) * i_872_)) & 0xff0000)) >> 8;
									} else if (Class_l_Sub1.anInt5223 != 255) {
										int i_874_ = (((i_870_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_875_ = (((i_870_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_876_ = (((i_870_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_870_ = (i_874_ | i_875_ | i_876_) >>> 8;
										int i_877_ = is_853_[i_852_];
										is_853_[i_852_] = (((((i_870_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_877_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_870_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_877_ & 0xff00) * (Class_l_Sub1.anInt5220))) & 0xff0000)) >> 8;
									} else {
										int i_878_ = (((i_870_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_879_ = (((i_870_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_880_ = (((i_870_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_853_[i_852_] = (i_878_ | i_879_ | i_880_) >>> 8;
									}
								}
							} else if (i_854_ == 3) {
								byte i_881_ = aByteArray7036[i_851_];
								int i_882_ = i_881_ > 0 ? anIntArray7035[i_881_] : 0;
								int i_883_ = Class_l_Sub1.anInt5221;
								int i_884_ = i_882_ + i_883_;
								int i_885_ = ((i_882_ & 0xff00ff) + (i_883_ & 0xff00ff));
								int i_886_ = ((i_885_ & 0x1000100) + (i_884_ - i_885_ & 0x10000));
								i_886_ = i_884_ - i_886_ | i_886_ - (i_886_ >>> 8);
								if (i_882_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_882_ = i_886_;
									i_886_ = is_853_[i_852_];
									i_886_ = (((((i_882_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_886_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_882_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_886_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_853_[i_852_] = i_886_;
							} else if (i_854_ == 2) {
								int i_887_ = aByteArray7036[i_851_];
								if (i_887_ != 0) {
									int i_888_ = anIntArray7035[i_887_ & 0xff];
									int i_889_ = (((i_888_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_890_ = (((i_888_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_853_[i_852_++] = (((i_889_ | i_890_) >>> 8) + Class_l_Sub1.anInt5213);
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_855_ == 2) {
							if (i_854_ == 1) {
								int i_891_ = aByteArray7036[i_851_];
								if (i_891_ != 0) {
									int i_892_ = anIntArray7035[i_891_ & 0xff];
									int i_893_ = is_853_[i_852_];
									int i_894_ = i_892_ + i_893_;
									int i_895_ = ((i_892_ & 0xff00ff) + (i_893_ & 0xff00ff));
									i_893_ = ((i_895_ & 0x1000100) + (i_894_ - i_895_ & 0x10000));
									is_853_[i_852_] = i_894_ - i_893_ | i_893_ - (i_893_ >>> 8);
								}
							} else if (i_854_ == 0) {
								int i_896_ = aByteArray7036[i_851_];
								if (i_896_ != 0) {
									int i_897_ = anIntArray7035[i_896_ & 0xff];
									int i_898_ = (((i_897_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_899_ = (((i_897_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_900_ = (((i_897_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_897_ = (i_898_ | i_899_ | i_900_) >>> 8;
									int i_901_ = is_853_[i_852_];
									int i_902_ = i_897_ + i_901_;
									int i_903_ = ((i_897_ & 0xff00ff) + (i_901_ & 0xff00ff));
									i_901_ = ((i_903_ & 0x1000100) + (i_902_ - i_903_ & 0x10000));
									is_853_[i_852_] = i_902_ - i_901_ | i_901_ - (i_901_ >>> 8);
								}
							} else if (i_854_ == 3) {
								byte i_904_ = aByteArray7036[i_851_];
								int i_905_ = i_904_ > 0 ? anIntArray7035[i_904_] : 0;
								int i_906_ = Class_l_Sub1.anInt5221;
								int i_907_ = i_905_ + i_906_;
								int i_908_ = ((i_905_ & 0xff00ff) + (i_906_ & 0xff00ff));
								int i_909_ = ((i_908_ & 0x1000100) + (i_907_ - i_908_ & 0x10000));
								i_909_ = i_907_ - i_909_ | i_909_ - (i_909_ >>> 8);
								if (i_905_ == 0 && Class_l_Sub1.anInt5223 != 255) {
									i_905_ = i_909_;
									i_909_ = is_853_[i_852_];
									i_909_ = (((((i_905_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_909_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_905_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_909_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								}
								is_853_[i_852_] = i_909_;
							} else if (i_854_ == 2) {
								int i_910_ = aByteArray7036[i_851_];
								if (i_910_ != 0) {
									int i_911_ = anIntArray7035[i_910_ & 0xff];
									int i_912_ = (((i_911_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_913_ = (((i_911_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_911_ = (((i_912_ | i_913_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_914_ = is_853_[i_852_];
									int i_915_ = i_911_ + i_914_;
									int i_916_ = ((i_911_ & 0xff00ff) + (i_914_ & 0xff00ff));
									i_914_ = ((i_916_ & 0x1000100) + (i_915_ - i_916_ & 0x10000));
									is_853_[i_852_] = i_915_ - i_914_ | i_914_ - (i_914_ >>> 8);
								}
							}
						} else
							throw new IllegalArgumentException();
						i_846_ += Class_l_Sub1.anInt5214;
					}
				}
				i_844_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			for (int i_917_ = Class_l_Sub1.anInt5202; i_917_ < 0; i_917_++) {
				int i_918_ = Class_l_Sub1.anInt5217;
				int i_919_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_920_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_921_ = Class_l_Sub1.anInt5212;
				if (i_919_ < 0) {
					int i_922_ = ((Class_l_Sub1.anInt5214 - 1 - i_919_) / Class_l_Sub1.anInt5214);
					i_921_ += i_922_;
					i_919_ += Class_l_Sub1.anInt5214 * i_922_;
					i_920_ += Class_l_Sub1.anInt5226 * i_922_;
					i_918_ += i_922_;
				}
				int i_923_;
				if ((i_923_ = (1 + i_919_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_921_)
					i_921_ = i_923_;
				if ((i_923_ = i_920_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
					i_923_ = ((Class_l_Sub1.anInt5226 - i_923_) / Class_l_Sub1.anInt5226);
					i_921_ += i_923_;
					i_919_ += Class_l_Sub1.anInt5214 * i_923_;
					i_920_ += Class_l_Sub1.anInt5226 * i_923_;
					i_918_ += i_923_;
				}
				if ((i_923_ = ((i_920_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_921_)
					i_921_ = i_923_;
				for (/**/; i_921_ < 0; i_921_++) {
					int i_924_ = ((i_920_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_919_ >> 12));
					int i_925_ = i_918_++;
					int[] is_926_ = is;
					int i_927_ = i;
					int i_928_ = i_411_;
					if (i_928_ == 0) {
						if (i_927_ == 1)
							is_926_[i_925_] = (anIntArray7035[aByteArray7036[i_924_] & 0xff]);
						else if (i_927_ == 0) {
							int i_929_ = (anIntArray7035[aByteArray7036[i_924_] & 0xff]);
							int i_930_ = ((i_929_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_931_ = ((i_929_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_932_ = ((i_929_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_926_[i_925_] = (i_930_ | i_931_ | i_932_) >>> 8;
						} else if (i_927_ == 3) {
							int i_933_ = (anIntArray7035[aByteArray7036[i_924_] & 0xff]);
							int i_934_ = Class_l_Sub1.anInt5221;
							int i_935_ = i_933_ + i_934_;
							int i_936_ = (i_933_ & 0xff00ff) + (i_934_ & 0xff00ff);
							int i_937_ = ((i_936_ & 0x1000100) + (i_935_ - i_936_ & 0x10000));
							is_926_[i_925_] = i_935_ - i_937_ | i_937_ - (i_937_ >>> 8);
						} else if (i_927_ == 2) {
							int i_938_ = (anIntArray7035[aByteArray7036[i_924_] & 0xff]);
							int i_939_ = ((i_938_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_940_ = ((i_938_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_926_[i_925_] = (((i_939_ | i_940_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_928_ == 1) {
						if (i_927_ == 1) {
							int i_941_ = aByteArray7036[i_924_];
							if (i_941_ != 0)
								is_926_[i_925_] = anIntArray7035[i_941_ & 0xff];
						} else if (i_927_ == 0) {
							int i_942_ = aByteArray7036[i_924_];
							if (i_942_ != 0) {
								int i_943_ = anIntArray7035[i_942_ & 0xff];
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_944_ = Class_l_Sub1.anInt5221 >>> 24;
									int i_945_ = 256 - i_944_;
									int i_946_ = is_926_[i_925_];
									is_926_[i_925_] = ((((i_943_ & 0xff00ff) * i_944_ + (i_946_ & 0xff00ff) * i_945_) & ~0xff00ff) + (((i_943_ & 0xff00) * i_944_ + (i_946_ & 0xff00) * i_945_) & 0xff0000)) >> 8;
								} else if (Class_l_Sub1.anInt5223 != 255) {
									int i_947_ = (((i_943_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_948_ = (((i_943_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_949_ = (((i_943_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_943_ = (i_947_ | i_948_ | i_949_) >>> 8;
									int i_950_ = is_926_[i_925_];
									is_926_[i_925_] = (((((i_943_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_950_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_943_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_950_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								} else {
									int i_951_ = (((i_943_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_952_ = (((i_943_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_953_ = (((i_943_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_926_[i_925_] = (i_951_ | i_952_ | i_953_) >>> 8;
								}
							}
						} else if (i_927_ == 3) {
							byte i_954_ = aByteArray7036[i_924_];
							int i_955_ = i_954_ > 0 ? anIntArray7035[i_954_] : 0;
							int i_956_ = Class_l_Sub1.anInt5221;
							int i_957_ = i_955_ + i_956_;
							int i_958_ = (i_955_ & 0xff00ff) + (i_956_ & 0xff00ff);
							int i_959_ = ((i_958_ & 0x1000100) + (i_957_ - i_958_ & 0x10000));
							i_959_ = i_957_ - i_959_ | i_959_ - (i_959_ >>> 8);
							if (i_955_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_955_ = i_959_;
								i_959_ = is_926_[i_925_];
								i_959_ = (((((i_955_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_959_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_955_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_959_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_926_[i_925_] = i_959_;
						} else if (i_927_ == 2) {
							int i_960_ = aByteArray7036[i_924_];
							if (i_960_ != 0) {
								int i_961_ = anIntArray7035[i_960_ & 0xff];
								int i_962_ = (((i_961_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_963_ = (((i_961_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_926_[i_925_++] = (((i_962_ | i_963_) >>> 8) + Class_l_Sub1.anInt5213);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_928_ == 2) {
						if (i_927_ == 1) {
							int i_964_ = aByteArray7036[i_924_];
							if (i_964_ != 0) {
								int i_965_ = anIntArray7035[i_964_ & 0xff];
								int i_966_ = is_926_[i_925_];
								int i_967_ = i_965_ + i_966_;
								int i_968_ = ((i_965_ & 0xff00ff) + (i_966_ & 0xff00ff));
								i_966_ = (i_968_ & 0x1000100) + (i_967_ - i_968_ & 0x10000);
								is_926_[i_925_] = i_967_ - i_966_ | i_966_ - (i_966_ >>> 8);
							}
						} else if (i_927_ == 0) {
							int i_969_ = aByteArray7036[i_924_];
							if (i_969_ != 0) {
								int i_970_ = anIntArray7035[i_969_ & 0xff];
								int i_971_ = (((i_970_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_972_ = (((i_970_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_973_ = ((i_970_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_970_ = (i_971_ | i_972_ | i_973_) >>> 8;
								int i_974_ = is_926_[i_925_];
								int i_975_ = i_970_ + i_974_;
								int i_976_ = ((i_970_ & 0xff00ff) + (i_974_ & 0xff00ff));
								i_974_ = (i_976_ & 0x1000100) + (i_975_ - i_976_ & 0x10000);
								is_926_[i_925_] = i_975_ - i_974_ | i_974_ - (i_974_ >>> 8);
							}
						} else if (i_927_ == 3) {
							byte i_977_ = aByteArray7036[i_924_];
							int i_978_ = i_977_ > 0 ? anIntArray7035[i_977_] : 0;
							int i_979_ = Class_l_Sub1.anInt5221;
							int i_980_ = i_978_ + i_979_;
							int i_981_ = (i_978_ & 0xff00ff) + (i_979_ & 0xff00ff);
							int i_982_ = ((i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000));
							i_982_ = i_980_ - i_982_ | i_982_ - (i_982_ >>> 8);
							if (i_978_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_978_ = i_982_;
								i_982_ = is_926_[i_925_];
								i_982_ = (((((i_978_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_982_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_978_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_982_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_926_[i_925_] = i_982_;
						} else if (i_927_ == 2) {
							int i_983_ = aByteArray7036[i_924_];
							if (i_983_ != 0) {
								int i_984_ = anIntArray7035[i_983_ & 0xff];
								int i_985_ = (((i_984_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_986_ = (((i_984_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_984_ = (((i_985_ | i_986_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_987_ = is_926_[i_925_];
								int i_988_ = i_984_ + i_987_;
								int i_989_ = ((i_984_ & 0xff00ff) + (i_987_ & 0xff00ff));
								i_987_ = (i_989_ & 0x1000100) + (i_988_ - i_989_ & 0x10000);
								is_926_[i_925_] = i_988_ - i_987_ | i_987_ - (i_987_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_919_ += Class_l_Sub1.anInt5214;
					i_920_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			for (int i_990_ = Class_l_Sub1.anInt5202; i_990_ < 0; i_990_++) {
				int i_991_ = Class_l_Sub1.anInt5217;
				int i_992_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_993_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_994_ = Class_l_Sub1.anInt5212;
				if (i_992_ < 0) {
					int i_995_ = ((Class_l_Sub1.anInt5214 - 1 - i_992_) / Class_l_Sub1.anInt5214);
					i_994_ += i_995_;
					i_992_ += Class_l_Sub1.anInt5214 * i_995_;
					i_993_ += Class_l_Sub1.anInt5226 * i_995_;
					i_991_ += i_995_;
				}
				int i_996_;
				if ((i_996_ = (1 + i_992_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_994_)
					i_994_ = i_996_;
				if (i_993_ < 0) {
					i_996_ = ((Class_l_Sub1.anInt5226 - 1 - i_993_) / Class_l_Sub1.anInt5226);
					i_994_ += i_996_;
					i_992_ += Class_l_Sub1.anInt5214 * i_996_;
					i_993_ += Class_l_Sub1.anInt5226 * i_996_;
					i_991_ += i_996_;
				}
				if ((i_996_ = (1 + i_993_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_994_)
					i_994_ = i_996_;
				for (/**/; i_994_ < 0; i_994_++) {
					int i_997_ = ((i_993_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_992_ >> 12));
					int i_998_ = i_991_++;
					int[] is_999_ = is;
					int i_1000_ = i;
					int i_1001_ = i_411_;
					if (i_1001_ == 0) {
						if (i_1000_ == 1)
							is_999_[i_998_] = (anIntArray7035[aByteArray7036[i_997_] & 0xff]);
						else if (i_1000_ == 0) {
							int i_1002_ = (anIntArray7035[aByteArray7036[i_997_] & 0xff]);
							int i_1003_ = (((i_1002_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
							int i_1004_ = ((i_1002_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_1005_ = ((i_1002_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_999_[i_998_] = (i_1003_ | i_1004_ | i_1005_) >>> 8;
						} else if (i_1000_ == 3) {
							int i_1006_ = (anIntArray7035[aByteArray7036[i_997_] & 0xff]);
							int i_1007_ = Class_l_Sub1.anInt5221;
							int i_1008_ = i_1006_ + i_1007_;
							int i_1009_ = (i_1006_ & 0xff00ff) + (i_1007_ & 0xff00ff);
							int i_1010_ = ((i_1009_ & 0x1000100) + (i_1008_ - i_1009_ & 0x10000));
							is_999_[i_998_] = i_1008_ - i_1010_ | i_1010_ - (i_1010_ >>> 8);
						} else if (i_1000_ == 2) {
							int i_1011_ = (anIntArray7035[aByteArray7036[i_997_] & 0xff]);
							int i_1012_ = (((i_1011_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
							int i_1013_ = ((i_1011_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_999_[i_998_] = (((i_1012_ | i_1013_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_1001_ == 1) {
						if (i_1000_ == 1) {
							int i_1014_ = aByteArray7036[i_997_];
							if (i_1014_ != 0)
								is_999_[i_998_] = anIntArray7035[i_1014_ & 0xff];
						} else if (i_1000_ == 0) {
							int i_1015_ = aByteArray7036[i_997_];
							if (i_1015_ != 0) {
								int i_1016_ = anIntArray7035[i_1015_ & 0xff];
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_1017_ = Class_l_Sub1.anInt5221 >>> 24;
									int i_1018_ = 256 - i_1017_;
									int i_1019_ = is_999_[i_998_];
									is_999_[i_998_] = ((((i_1016_ & 0xff00ff) * i_1017_ + (i_1019_ & 0xff00ff) * i_1018_) & ~0xff00ff) + (((i_1016_ & 0xff00) * i_1017_ + (i_1019_ & 0xff00) * i_1018_) & 0xff0000)) >> 8;
								} else if (Class_l_Sub1.anInt5223 != 255) {
									int i_1020_ = (((i_1016_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_1021_ = (((i_1016_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_1022_ = (((i_1016_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_1016_ = (i_1020_ | i_1021_ | i_1022_) >>> 8;
									int i_1023_ = is_999_[i_998_];
									is_999_[i_998_] = (((((i_1016_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_1023_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_1016_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_1023_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
								} else {
									int i_1024_ = (((i_1016_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_1025_ = (((i_1016_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_1026_ = (((i_1016_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_999_[i_998_] = (i_1024_ | i_1025_ | i_1026_) >>> 8;
								}
							}
						} else if (i_1000_ == 3) {
							byte i_1027_ = aByteArray7036[i_997_];
							int i_1028_ = i_1027_ > 0 ? anIntArray7035[i_1027_] : 0;
							int i_1029_ = Class_l_Sub1.anInt5221;
							int i_1030_ = i_1028_ + i_1029_;
							int i_1031_ = (i_1028_ & 0xff00ff) + (i_1029_ & 0xff00ff);
							int i_1032_ = ((i_1031_ & 0x1000100) + (i_1030_ - i_1031_ & 0x10000));
							i_1032_ = i_1030_ - i_1032_ | i_1032_ - (i_1032_ >>> 8);
							if (i_1028_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_1028_ = i_1032_;
								i_1032_ = is_999_[i_998_];
								i_1032_ = (((((i_1028_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_1032_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_1028_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_1032_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_999_[i_998_] = i_1032_;
						} else if (i_1000_ == 2) {
							int i_1033_ = aByteArray7036[i_997_];
							if (i_1033_ != 0) {
								int i_1034_ = anIntArray7035[i_1033_ & 0xff];
								int i_1035_ = (((i_1034_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_1036_ = (((i_1034_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_999_[i_998_++] = (((i_1035_ | i_1036_) >>> 8) + Class_l_Sub1.anInt5213);
							}
						} else
							throw new IllegalArgumentException();
					} else if (i_1001_ == 2) {
						if (i_1000_ == 1) {
							int i_1037_ = aByteArray7036[i_997_];
							if (i_1037_ != 0) {
								int i_1038_ = anIntArray7035[i_1037_ & 0xff];
								int i_1039_ = is_999_[i_998_];
								int i_1040_ = i_1038_ + i_1039_;
								int i_1041_ = ((i_1038_ & 0xff00ff) + (i_1039_ & 0xff00ff));
								i_1039_ = ((i_1041_ & 0x1000100) + (i_1040_ - i_1041_ & 0x10000));
								is_999_[i_998_] = i_1040_ - i_1039_ | i_1039_ - (i_1039_ >>> 8);
							}
						} else if (i_1000_ == 0) {
							int i_1042_ = aByteArray7036[i_997_];
							if (i_1042_ != 0) {
								int i_1043_ = anIntArray7035[i_1042_ & 0xff];
								int i_1044_ = (((i_1043_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_1045_ = (((i_1043_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_1046_ = (((i_1043_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
								i_1043_ = (i_1044_ | i_1045_ | i_1046_) >>> 8;
								int i_1047_ = is_999_[i_998_];
								int i_1048_ = i_1043_ + i_1047_;
								int i_1049_ = ((i_1043_ & 0xff00ff) + (i_1047_ & 0xff00ff));
								i_1047_ = ((i_1049_ & 0x1000100) + (i_1048_ - i_1049_ & 0x10000));
								is_999_[i_998_] = i_1048_ - i_1047_ | i_1047_ - (i_1047_ >>> 8);
							}
						} else if (i_1000_ == 3) {
							byte i_1050_ = aByteArray7036[i_997_];
							int i_1051_ = i_1050_ > 0 ? anIntArray7035[i_1050_] : 0;
							int i_1052_ = Class_l_Sub1.anInt5221;
							int i_1053_ = i_1051_ + i_1052_;
							int i_1054_ = (i_1051_ & 0xff00ff) + (i_1052_ & 0xff00ff);
							int i_1055_ = ((i_1054_ & 0x1000100) + (i_1053_ - i_1054_ & 0x10000));
							i_1055_ = i_1053_ - i_1055_ | i_1055_ - (i_1055_ >>> 8);
							if (i_1051_ == 0 && Class_l_Sub1.anInt5223 != 255) {
								i_1051_ = i_1055_;
								i_1055_ = is_999_[i_998_];
								i_1055_ = (((((i_1051_ & 0xff00ff) * Class_l_Sub1.anInt5223) + ((i_1055_ & 0xff00ff) * Class_l_Sub1.anInt5220)) & ~0xff00ff) + ((((i_1051_ & 0xff00) * Class_l_Sub1.anInt5223) + ((i_1055_ & 0xff00) * Class_l_Sub1.anInt5220)) & 0xff0000)) >> 8;
							}
							is_999_[i_998_] = i_1055_;
						} else if (i_1000_ == 2) {
							int i_1056_ = aByteArray7036[i_997_];
							if (i_1056_ != 0) {
								int i_1057_ = anIntArray7035[i_1056_ & 0xff];
								int i_1058_ = (((i_1057_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_1059_ = (((i_1057_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_1057_ = (((i_1058_ | i_1059_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_1060_ = is_999_[i_998_];
								int i_1061_ = i_1057_ + i_1060_;
								int i_1062_ = ((i_1057_ & 0xff00ff) + (i_1060_ & 0xff00ff));
								i_1060_ = ((i_1062_ & 0x1000100) + (i_1061_ - i_1062_ & 0x10000));
								is_999_[i_998_] = i_1061_ - i_1060_ | i_1060_ - (i_1060_ >>> 8);
							}
						}
					} else
						throw new IllegalArgumentException();
					i_992_ += Class_l_Sub1.anInt5214;
					i_993_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}
}
