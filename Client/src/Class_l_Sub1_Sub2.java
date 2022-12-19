/* Class_l_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_l_Sub1_Sub2 extends Class_l_Sub1 {
	private int[] anIntArray6682;

	Class_l_Sub1_Sub2(Class260_Sub1 class260_sub1, int[] is, int i, int i_0_) {
		super(class260_sub1, i, i_0_);
		anIntArray6682 = is;
	}

	final void method2217(int[] is, int[] is_1_, int i, int i_2_) {
		int[] is_3_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_4_ = Class_l_Sub1.anInt5202;
				while (i_4_ < 0) {
					int i_5_ = i_4_ + i_2_;
					if (i_5_ >= 0) {
						if (i_5_ >= is.length)
							break;
						int i_6_ = Class_l_Sub1.anInt5217;
						int i_7_ = Class_l_Sub1.anInt5206;
						int i_8_ = Class_l_Sub1.anInt5207;
						int i_9_ = Class_l_Sub1.anInt5212;
						if (i_7_ >= 0 && i_8_ >= 0 && (i_7_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0) && (i_8_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
							int i_10_ = is[i_5_] - i;
							int i_11_ = -is_1_[i_5_];
							int i_12_ = i_10_ - (i_6_ - Class_l_Sub1.anInt5217);
							if (i_12_ > 0) {
								i_6_ += i_12_;
								i_9_ += i_12_;
								i_7_ += Class_l_Sub1.anInt5214 * i_12_;
								i_8_ += Class_l_Sub1.anInt5226 * i_12_;
							} else
								i_11_ -= i_12_;
							if (i_9_ < i_11_)
								i_9_ = i_11_;
							for (/**/; i_9_ < 0; i_9_++) {
								int i_13_ = (anIntArray6682[(((i_8_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_7_ >> 12))]);
								int i_14_ = i_13_ >>> 24;
								int i_15_ = 256 - i_14_;
								int i_16_ = is_3_[i_6_];
								is_3_[i_6_++] = ((((i_13_ & 0xff00ff) * i_14_ + (i_16_ & 0xff00ff) * i_15_) & ~0xff00ff) + (((i_13_ & 0xff00) * i_14_ + (i_16_ & 0xff00) * i_15_) & 0xff0000)) >> 8;
							}
						}
					}
					i_4_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_17_ = Class_l_Sub1.anInt5202;
				while (i_17_ < 0) {
					int i_18_ = i_17_ + i_2_;
					if (i_18_ >= 0) {
						if (i_18_ >= is.length)
							break;
						int i_19_ = Class_l_Sub1.anInt5217;
						int i_20_ = Class_l_Sub1.anInt5206;
						int i_21_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_22_ = Class_l_Sub1.anInt5212;
						if (i_20_ >= 0 && (i_20_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
							int i_23_;
							if ((i_23_ = i_21_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
								i_23_ = ((Class_l_Sub1.anInt5226 - i_23_) / Class_l_Sub1.anInt5226);
								i_22_ += i_23_;
								i_21_ += Class_l_Sub1.anInt5226 * i_23_;
								i_19_ += i_23_;
							}
							if ((i_23_ = ((i_21_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_22_)
								i_22_ = i_23_;
							int i_24_ = is[i_18_] - i;
							int i_25_ = -is_1_[i_18_];
							int i_26_ = i_24_ - (i_19_ - Class_l_Sub1.anInt5217);
							if (i_26_ > 0) {
								i_19_ += i_26_;
								i_22_ += i_26_;
								i_20_ += Class_l_Sub1.anInt5214 * i_26_;
								i_21_ += Class_l_Sub1.anInt5226 * i_26_;
							} else
								i_25_ -= i_26_;
							if (i_22_ < i_25_)
								i_22_ = i_25_;
							for (/**/; i_22_ < 0; i_22_++) {
								int i_27_ = (anIntArray6682[(((i_21_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_20_ >> 12))]);
								int i_28_ = i_27_ >>> 24;
								int i_29_ = 256 - i_28_;
								int i_30_ = is_3_[i_19_];
								is_3_[i_19_++] = ((((i_27_ & 0xff00ff) * i_28_ + (i_30_ & 0xff00ff) * i_29_) & ~0xff00ff) + (((i_27_ & 0xff00) * i_28_ + (i_30_ & 0xff00) * i_29_) & 0xff0000)) >> 8;
								i_21_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_17_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_31_ = Class_l_Sub1.anInt5202;
				while (i_31_ < 0) {
					int i_32_ = i_31_ + i_2_;
					if (i_32_ >= 0) {
						if (i_32_ >= is.length)
							break;
						int i_33_ = Class_l_Sub1.anInt5217;
						int i_34_ = Class_l_Sub1.anInt5206;
						int i_35_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_36_ = Class_l_Sub1.anInt5212;
						if (i_34_ >= 0 && (i_34_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
							if (i_35_ < 0) {
								int i_37_ = ((Class_l_Sub1.anInt5226 - 1 - i_35_) / Class_l_Sub1.anInt5226);
								i_36_ += i_37_;
								i_35_ += Class_l_Sub1.anInt5226 * i_37_;
								i_33_ += i_37_;
							}
							int i_38_;
							if ((i_38_ = ((1 + i_35_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_36_)
								i_36_ = i_38_;
							int i_39_ = is[i_32_] - i;
							int i_40_ = -is_1_[i_32_];
							int i_41_ = i_39_ - (i_33_ - Class_l_Sub1.anInt5217);
							if (i_41_ > 0) {
								i_33_ += i_41_;
								i_36_ += i_41_;
								i_34_ += Class_l_Sub1.anInt5214 * i_41_;
								i_35_ += Class_l_Sub1.anInt5226 * i_41_;
							} else
								i_40_ -= i_41_;
							if (i_36_ < i_40_)
								i_36_ = i_40_;
							for (/**/; i_36_ < 0; i_36_++) {
								int i_42_ = (anIntArray6682[(((i_35_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_34_ >> 12))]);
								int i_43_ = i_42_ >>> 24;
								int i_44_ = 256 - i_43_;
								int i_45_ = is_3_[i_33_];
								is_3_[i_33_++] = ((((i_42_ & 0xff00ff) * i_43_ + (i_45_ & 0xff00ff) * i_44_) & ~0xff00ff) + (((i_42_ & 0xff00) * i_43_ + (i_45_ & 0xff00) * i_44_) & 0xff0000)) >> 8;
								i_35_ += Class_l_Sub1.anInt5226;
							}
						}
					}
					i_31_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_46_ = Class_l_Sub1.anInt5202;
				while (i_46_ < 0) {
					int i_47_ = i_46_ + i_2_;
					if (i_47_ >= 0) {
						if (i_47_ >= is.length)
							break;
						int i_48_ = Class_l_Sub1.anInt5217;
						int i_49_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_50_ = Class_l_Sub1.anInt5207;
						int i_51_ = Class_l_Sub1.anInt5212;
						if (i_50_ >= 0 && (i_50_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
							int i_52_;
							if ((i_52_ = i_49_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
								i_52_ = ((Class_l_Sub1.anInt5214 - i_52_) / Class_l_Sub1.anInt5214);
								i_51_ += i_52_;
								i_49_ += Class_l_Sub1.anInt5214 * i_52_;
								i_48_ += i_52_;
							}
							if ((i_52_ = ((i_49_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_51_)
								i_51_ = i_52_;
							int i_53_ = is[i_47_] - i;
							int i_54_ = -is_1_[i_47_];
							int i_55_ = i_53_ - (i_48_ - Class_l_Sub1.anInt5217);
							if (i_55_ > 0) {
								i_48_ += i_55_;
								i_51_ += i_55_;
								i_49_ += Class_l_Sub1.anInt5214 * i_55_;
								i_50_ += Class_l_Sub1.anInt5226 * i_55_;
							} else
								i_54_ -= i_55_;
							if (i_51_ < i_54_)
								i_51_ = i_54_;
							for (/**/; i_51_ < 0; i_51_++) {
								int i_56_ = (anIntArray6682[(((i_50_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_49_ >> 12))]);
								int i_57_ = i_56_ >>> 24;
								int i_58_ = 256 - i_57_;
								int i_59_ = is_3_[i_48_];
								is_3_[i_48_++] = ((((i_56_ & 0xff00ff) * i_57_ + (i_59_ & 0xff00ff) * i_58_) & ~0xff00ff) + (((i_56_ & 0xff00) * i_57_ + (i_59_ & 0xff00) * i_58_) & 0xff0000)) >> 8;
								i_49_ += Class_l_Sub1.anInt5214;
							}
						}
					}
					i_46_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_60_ = Class_l_Sub1.anInt5202;
				while (i_60_ < 0) {
					int i_61_ = i_60_ + i_2_;
					if (i_61_ >= 0) {
						if (i_61_ >= is.length)
							break;
						int i_62_ = Class_l_Sub1.anInt5217;
						int i_63_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_64_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_65_ = Class_l_Sub1.anInt5212;
						int i_66_;
						if ((i_66_ = i_63_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_66_ = ((Class_l_Sub1.anInt5214 - i_66_) / Class_l_Sub1.anInt5214);
							i_65_ += i_66_;
							i_63_ += Class_l_Sub1.anInt5214 * i_66_;
							i_64_ += Class_l_Sub1.anInt5226 * i_66_;
							i_62_ += i_66_;
						}
						if ((i_66_ = ((i_63_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_65_)
							i_65_ = i_66_;
						if ((i_66_ = i_64_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_66_ = ((Class_l_Sub1.anInt5226 - i_66_) / Class_l_Sub1.anInt5226);
							i_65_ += i_66_;
							i_63_ += Class_l_Sub1.anInt5214 * i_66_;
							i_64_ += Class_l_Sub1.anInt5226 * i_66_;
							i_62_ += i_66_;
						}
						if ((i_66_ = ((i_64_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_65_)
							i_65_ = i_66_;
						int i_67_ = is[i_61_] - i;
						int i_68_ = -is_1_[i_61_];
						int i_69_ = i_67_ - (i_62_ - Class_l_Sub1.anInt5217);
						if (i_69_ > 0) {
							i_62_ += i_69_;
							i_65_ += i_69_;
							i_63_ += Class_l_Sub1.anInt5214 * i_69_;
							i_64_ += Class_l_Sub1.anInt5226 * i_69_;
						} else
							i_68_ -= i_69_;
						if (i_65_ < i_68_)
							i_65_ = i_68_;
						for (/**/; i_65_ < 0; i_65_++) {
							int i_70_ = (anIntArray6682[(((i_64_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_63_ >> 12))]);
							int i_71_ = i_70_ >>> 24;
							int i_72_ = 256 - i_71_;
							int i_73_ = is_3_[i_62_];
							is_3_[i_62_++] = ((((i_70_ & 0xff00ff) * i_71_ + (i_73_ & 0xff00ff) * i_72_) & ~0xff00ff) + (((i_70_ & 0xff00) * i_71_ + (i_73_ & 0xff00) * i_72_) & 0xff0000)) >> 8;
							i_63_ += Class_l_Sub1.anInt5214;
							i_64_ += Class_l_Sub1.anInt5226;
						}
					}
					i_60_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_74_ = Class_l_Sub1.anInt5202;
				while (i_74_ < 0) {
					int i_75_ = i_74_ + i_2_;
					if (i_75_ >= 0) {
						if (i_75_ >= is.length)
							break;
						int i_76_ = Class_l_Sub1.anInt5217;
						int i_77_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
						int i_78_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
						int i_79_ = Class_l_Sub1.anInt5212;
						int i_80_;
						if ((i_80_ = i_77_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_80_ = ((Class_l_Sub1.anInt5214 - i_80_) / Class_l_Sub1.anInt5214);
							i_79_ += i_80_;
							i_77_ += Class_l_Sub1.anInt5214 * i_80_;
							i_78_ += Class_l_Sub1.anInt5226 * i_80_;
							i_76_ += i_80_;
						}
						if ((i_80_ = ((i_77_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_79_)
							i_79_ = i_80_;
						if (i_78_ < 0) {
							i_80_ = ((Class_l_Sub1.anInt5226 - 1 - i_78_) / Class_l_Sub1.anInt5226);
							i_79_ += i_80_;
							i_77_ += Class_l_Sub1.anInt5214 * i_80_;
							i_78_ += Class_l_Sub1.anInt5226 * i_80_;
							i_76_ += i_80_;
						}
						if ((i_80_ = ((1 + i_78_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_79_)
							i_79_ = i_80_;
						int i_81_ = is[i_75_] - i;
						int i_82_ = -is_1_[i_75_];
						int i_83_ = i_81_ - (i_76_ - Class_l_Sub1.anInt5217);
						if (i_83_ > 0) {
							i_76_ += i_83_;
							i_79_ += i_83_;
							i_77_ += Class_l_Sub1.anInt5214 * i_83_;
							i_78_ += Class_l_Sub1.anInt5226 * i_83_;
						} else
							i_82_ -= i_83_;
						if (i_79_ < i_82_)
							i_79_ = i_82_;
						for (/**/; i_79_ < 0; i_79_++) {
							int i_84_ = (anIntArray6682[(((i_78_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_77_ >> 12))]);
							int i_85_ = i_84_ >>> 24;
							int i_86_ = 256 - i_85_;
							int i_87_ = is_3_[i_76_];
							is_3_[i_76_++] = ((((i_84_ & 0xff00ff) * i_85_ + (i_87_ & 0xff00ff) * i_86_) & ~0xff00ff) + (((i_84_ & 0xff00) * i_85_ + (i_87_ & 0xff00) * i_86_) & 0xff0000)) >> 8;
							i_77_ += Class_l_Sub1.anInt5214;
							i_78_ += Class_l_Sub1.anInt5226;
						}
					}
					i_74_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_88_ = Class_l_Sub1.anInt5202;
			while (i_88_ < 0) {
				int i_89_ = i_88_ + i_2_;
				if (i_89_ >= 0) {
					if (i_89_ >= is.length)
						break;
					int i_90_ = Class_l_Sub1.anInt5217;
					int i_91_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_92_ = Class_l_Sub1.anInt5207;
					int i_93_ = Class_l_Sub1.anInt5212;
					if (i_92_ >= 0 && i_92_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
						if (i_91_ < 0) {
							int i_94_ = ((Class_l_Sub1.anInt5214 - 1 - i_91_) / Class_l_Sub1.anInt5214);
							i_93_ += i_94_;
							i_91_ += Class_l_Sub1.anInt5214 * i_94_;
							i_90_ += i_94_;
						}
						int i_95_;
						if ((i_95_ = ((1 + i_91_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_93_)
							i_93_ = i_95_;
						int i_96_ = is[i_89_] - i;
						int i_97_ = -is_1_[i_89_];
						int i_98_ = i_96_ - (i_90_ - Class_l_Sub1.anInt5217);
						if (i_98_ > 0) {
							i_90_ += i_98_;
							i_93_ += i_98_;
							i_91_ += Class_l_Sub1.anInt5214 * i_98_;
							i_92_ += Class_l_Sub1.anInt5226 * i_98_;
						} else
							i_97_ -= i_98_;
						if (i_93_ < i_97_)
							i_93_ = i_97_;
						for (/**/; i_93_ < 0; i_93_++) {
							int i_99_ = (anIntArray6682[(((i_92_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_91_ >> 12))]);
							int i_100_ = i_99_ >>> 24;
							int i_101_ = 256 - i_100_;
							int i_102_ = is_3_[i_90_];
							is_3_[i_90_++] = ((((i_99_ & 0xff00ff) * i_100_ + (i_102_ & 0xff00ff) * i_101_) & ~0xff00ff) + (((i_99_ & 0xff00) * i_100_ + (i_102_ & 0xff00) * i_101_) & 0xff0000)) >> 8;
							i_91_ += Class_l_Sub1.anInt5214;
						}
					}
				}
				i_88_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			int i_103_ = Class_l_Sub1.anInt5202;
			while (i_103_ < 0) {
				int i_104_ = i_103_ + i_2_;
				if (i_104_ >= 0) {
					if (i_104_ >= is.length)
						break;
					int i_105_ = Class_l_Sub1.anInt5217;
					int i_106_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_107_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_108_ = Class_l_Sub1.anInt5212;
					if (i_106_ < 0) {
						int i_109_ = ((Class_l_Sub1.anInt5214 - 1 - i_106_) / Class_l_Sub1.anInt5214);
						i_108_ += i_109_;
						i_106_ += Class_l_Sub1.anInt5214 * i_109_;
						i_107_ += Class_l_Sub1.anInt5226 * i_109_;
						i_105_ += i_109_;
					}
					int i_110_;
					if ((i_110_ = (1 + i_106_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_108_)
						i_108_ = i_110_;
					if ((i_110_ = i_107_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_110_ = ((Class_l_Sub1.anInt5226 - i_110_) / Class_l_Sub1.anInt5226);
						i_108_ += i_110_;
						i_106_ += Class_l_Sub1.anInt5214 * i_110_;
						i_107_ += Class_l_Sub1.anInt5226 * i_110_;
						i_105_ += i_110_;
					}
					if ((i_110_ = ((i_107_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_108_)
						i_108_ = i_110_;
					int i_111_ = is[i_104_] - i;
					int i_112_ = -is_1_[i_104_];
					int i_113_ = i_111_ - (i_105_ - Class_l_Sub1.anInt5217);
					if (i_113_ > 0) {
						i_105_ += i_113_;
						i_108_ += i_113_;
						i_106_ += Class_l_Sub1.anInt5214 * i_113_;
						i_107_ += Class_l_Sub1.anInt5226 * i_113_;
					} else
						i_112_ -= i_113_;
					if (i_108_ < i_112_)
						i_108_ = i_112_;
					for (/**/; i_108_ < 0; i_108_++) {
						int i_114_ = (anIntArray6682[(((i_107_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_106_ >> 12))]);
						int i_115_ = i_114_ >>> 24;
						int i_116_ = 256 - i_115_;
						int i_117_ = is_3_[i_105_];
						is_3_[i_105_++] = ((((i_114_ & 0xff00ff) * i_115_ + (i_117_ & 0xff00ff) * i_116_) & ~0xff00ff) + (((i_114_ & 0xff00) * i_115_ + (i_117_ & 0xff00) * i_116_) & 0xff0000)) >> 8;
						i_106_ += Class_l_Sub1.anInt5214;
						i_107_ += Class_l_Sub1.anInt5226;
					}
				}
				i_103_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			int i_118_ = Class_l_Sub1.anInt5202;
			while (i_118_ < 0) {
				int i_119_ = i_118_ + i_2_;
				if (i_119_ >= 0) {
					if (i_119_ >= is.length)
						break;
					int i_120_ = Class_l_Sub1.anInt5217;
					int i_121_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_122_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_123_ = Class_l_Sub1.anInt5212;
					if (i_121_ < 0) {
						int i_124_ = ((Class_l_Sub1.anInt5214 - 1 - i_121_) / Class_l_Sub1.anInt5214);
						i_123_ += i_124_;
						i_121_ += Class_l_Sub1.anInt5214 * i_124_;
						i_122_ += Class_l_Sub1.anInt5226 * i_124_;
						i_120_ += i_124_;
					}
					int i_125_;
					if ((i_125_ = (1 + i_121_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_123_)
						i_123_ = i_125_;
					if (i_122_ < 0) {
						i_125_ = ((Class_l_Sub1.anInt5226 - 1 - i_122_) / Class_l_Sub1.anInt5226);
						i_123_ += i_125_;
						i_121_ += Class_l_Sub1.anInt5214 * i_125_;
						i_122_ += Class_l_Sub1.anInt5226 * i_125_;
						i_120_ += i_125_;
					}
					if ((i_125_ = (1 + i_122_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_123_)
						i_123_ = i_125_;
					int i_126_ = is[i_119_] - i;
					int i_127_ = -is_1_[i_119_];
					int i_128_ = i_126_ - (i_120_ - Class_l_Sub1.anInt5217);
					if (i_128_ > 0) {
						i_120_ += i_128_;
						i_123_ += i_128_;
						i_121_ += Class_l_Sub1.anInt5214 * i_128_;
						i_122_ += Class_l_Sub1.anInt5226 * i_128_;
					} else
						i_127_ -= i_128_;
					if (i_123_ < i_127_)
						i_123_ = i_127_;
					for (/**/; i_123_ < 0; i_123_++) {
						int i_129_ = (anIntArray6682[(((i_122_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_121_ >> 12))]);
						int i_130_ = i_129_ >>> 24;
						int i_131_ = 256 - i_130_;
						int i_132_ = is_3_[i_120_];
						is_3_[i_120_++] = ((((i_129_ & 0xff00ff) * i_130_ + (i_132_ & 0xff00ff) * i_131_) & ~0xff00ff) + (((i_129_ & 0xff00) * i_130_ + (i_132_ & 0xff00) * i_131_) & 0xff0000)) >> 8;
						i_121_ += Class_l_Sub1.anInt5214;
						i_122_ += Class_l_Sub1.anInt5226;
					}
				}
				i_118_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}

	final void BA(int i, int i_133_, int i_134_) {
		if (i_134_ == 0) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			for (int i_135_ = 0; i_135_ < ((Class_l_Sub1) this).anInt5205; i_135_++) {
				int i_136_ = i_135_ * ((Class_l_Sub1) this).anInt5230;
				int i_137_ = (((i_133_ + i_135_) * ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).f_nb) + i);
				for (int i_138_ = 0; i_138_ < ((Class_l_Sub1) this).anInt5230; i_138_++)
					anIntArray6682[i_136_ + i_138_] = (anIntArray6682[i_136_ + i_138_] & 0xffffff | is[i_137_ + i_138_] << 8 & ~0xffffff);
			}
		} else if (i_134_ == 1) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			for (int i_139_ = 0; i_139_ < ((Class_l_Sub1) this).anInt5205; i_139_++) {
				int i_140_ = i_139_ * ((Class_l_Sub1) this).anInt5230;
				int i_141_ = (((i_133_ + i_139_) * ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).f_nb) + i);
				for (int i_142_ = 0; i_142_ < ((Class_l_Sub1) this).anInt5230; i_142_++)
					anIntArray6682[i_140_ + i_142_] = (anIntArray6682[i_140_ + i_142_] & 0xffffff | is[i_141_ + i_142_] << 16 & ~0xffffff);
			}
		} else if (i_134_ == 2) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			for (int i_143_ = 0; i_143_ < ((Class_l_Sub1) this).anInt5205; i_143_++) {
				int i_144_ = i_143_ * ((Class_l_Sub1) this).anInt5230;
				int i_145_ = (((i_133_ + i_143_) * ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).f_nb) + i);
				for (int i_146_ = 0; i_146_ < ((Class_l_Sub1) this).anInt5230; i_146_++)
					anIntArray6682[i_144_ + i_146_] = (anIntArray6682[i_144_ + i_146_] & 0xffffff | is[i_145_ + i_146_] << 24 & ~0xffffff);
			}
		} else if (i_134_ == 3) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			for (int i_147_ = 0; i_147_ < ((Class_l_Sub1) this).anInt5205; i_147_++) {
				int i_148_ = i_147_ * ((Class_l_Sub1) this).anInt5230;
				int i_149_ = (((i_133_ + i_147_) * ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).f_nb) + i);
				for (int i_150_ = 0; i_150_ < ((Class_l_Sub1) this).anInt5230; i_150_++)
					anIntArray6682[i_148_ + i_150_] = (anIntArray6682[i_148_ + i_150_] & 0xffffff | (is[i_149_ + i_150_] != 0 ? -16777216 : 0));
			}
		}
	}

	final void r(int i, int i_151_, int i_152_, int i_153_, int i_154_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		int i_155_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		i += ((Class_l_Sub1) this).anInt5218;
		i_151_ += ((Class_l_Sub1) this).anInt5209;
		int i_156_ = i_151_ * i_155_ + i;
		int i_157_ = 0;
		int i_158_ = ((Class_l_Sub1) this).anInt5205;
		int i_159_ = ((Class_l_Sub1) this).anInt5230;
		int i_160_ = i_155_ - i_159_;
		int i_161_ = 0;
		if (i_151_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_162_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_151_);
			i_158_ -= i_162_;
			i_151_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_157_ += i_162_ * i_159_;
			i_156_ += i_162_ * i_155_;
		}
		if (i_151_ + i_158_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_158_ -= i_151_ + i_158_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_163_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_159_ -= i_163_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_157_ += i_163_;
			i_156_ += i_163_;
			i_161_ += i_163_;
			i_160_ += i_163_;
		}
		if (i + i_159_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_164_ = i + i_159_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_159_ -= i_164_;
			i_161_ += i_164_;
			i_160_ += i_164_;
		}
		if (i_159_ > 0 && i_158_ > 0) {
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_154_ == 0) {
				if (i_152_ == 1) {
					for (int i_165_ = -i_158_; i_165_ < 0; i_165_++) {
						int i_166_ = i_156_ + i_159_ - 3;
						while (i_156_ < i_166_) {
							is[i_156_++] = anIntArray6682[i_157_++];
							is[i_156_++] = anIntArray6682[i_157_++];
							is[i_156_++] = anIntArray6682[i_157_++];
							is[i_156_++] = anIntArray6682[i_157_++];
						}
						i_166_ += 3;
						while (i_156_ < i_166_)
							is[i_156_++] = anIntArray6682[i_157_++];
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 0) {
					int i_167_ = (i_153_ & 0xff0000) >> 16;
					int i_168_ = (i_153_ & 0xff00) >> 8;
					int i_169_ = i_153_ & 0xff;
					for (int i_170_ = -i_158_; i_170_ < 0; i_170_++) {
						for (int i_171_ = -i_159_; i_171_ < 0; i_171_++) {
							int i_172_ = anIntArray6682[i_157_++];
							int i_173_ = (i_172_ & 0xff0000) * i_167_ & ~0xffffff;
							int i_174_ = (i_172_ & 0xff00) * i_168_ & 0xff0000;
							int i_175_ = (i_172_ & 0xff) * i_169_ & 0xff00;
							is[i_156_++] = (i_173_ | i_174_ | i_175_) >>> 8;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 3) {
					for (int i_176_ = -i_158_; i_176_ < 0; i_176_++) {
						for (int i_177_ = -i_159_; i_177_ < 0; i_177_++) {
							int i_178_ = anIntArray6682[i_157_++];
							int i_179_ = i_178_ + i_153_;
							int i_180_ = (i_178_ & 0xff00ff) + (i_153_ & 0xff00ff);
							int i_181_ = ((i_180_ & 0x1000100) + (i_179_ - i_180_ & 0x10000));
							is[i_156_++] = i_179_ - i_181_ | i_181_ - (i_181_ >>> 8);
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 2) {
					int i_182_ = i_153_ >>> 24;
					int i_183_ = 256 - i_182_;
					int i_184_ = (i_153_ & 0xff00ff) * i_183_ & ~0xff00ff;
					int i_185_ = (i_153_ & 0xff00) * i_183_ & 0xff0000;
					i_153_ = (i_184_ | i_185_) >>> 8;
					for (int i_186_ = -i_158_; i_186_ < 0; i_186_++) {
						for (int i_187_ = -i_159_; i_187_ < 0; i_187_++) {
							int i_188_ = anIntArray6682[i_157_++];
							i_184_ = (i_188_ & 0xff00ff) * i_182_ & ~0xff00ff;
							i_185_ = (i_188_ & 0xff00) * i_182_ & 0xff0000;
							is[i_156_++] = ((i_184_ | i_185_) >>> 8) + i_153_;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_154_ == 1) {
				if (i_152_ == 1) {
					for (int i_189_ = -i_158_; i_189_ < 0; i_189_++) {
						for (int i_190_ = -i_159_; i_190_ < 0; i_190_++) {
							int i_191_ = anIntArray6682[i_157_++];
							int i_192_ = i_191_ >>> 24;
							int i_193_ = 256 - i_192_;
							int i_194_ = is[i_156_];
							is[i_156_++] = ((((i_191_ & 0xff00ff) * i_192_ + (i_194_ & 0xff00ff) * i_193_) & ~0xff00ff) + (((i_191_ & 0xff00) * i_192_ + (i_194_ & 0xff00) * i_193_) & 0xff0000)) >> 8;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 0) {
					if ((i_153_ & 0xffffff) == 16777215) {
						for (int i_195_ = -i_158_; i_195_ < 0; i_195_++) {
							for (int i_196_ = -i_159_; i_196_ < 0; i_196_++) {
								int i_197_ = anIntArray6682[i_157_++];
								int i_198_ = (i_197_ >>> 24) * (i_153_ >>> 24) >> 8;
								int i_199_ = 256 - i_198_;
								int i_200_ = is[i_156_];
								is[i_156_++] = ((((i_197_ & 0xff00ff) * i_198_ + (i_200_ & 0xff00ff) * i_199_) & ~0xff00ff) + (((i_197_ & 0xff00) * i_198_ + (i_200_ & 0xff00) * i_199_) & 0xff0000)) >> 8;
							}
							i_156_ += i_160_;
							i_157_ += i_161_;
						}
					} else {
						int i_201_ = (i_153_ & 0xff0000) >> 16;
						int i_202_ = (i_153_ & 0xff00) >> 8;
						int i_203_ = i_153_ & 0xff;
						for (int i_204_ = -i_158_; i_204_ < 0; i_204_++) {
							for (int i_205_ = -i_159_; i_205_ < 0; i_205_++) {
								int i_206_ = anIntArray6682[i_157_++];
								int i_207_ = (i_206_ >>> 24) * (i_153_ >>> 24) >> 8;
								int i_208_ = 256 - i_207_;
								if (i_207_ != 255) {
									int i_209_ = ((i_206_ & 0xff0000) * i_201_ & ~0xffffff);
									int i_210_ = ((i_206_ & 0xff00) * i_202_ & 0xff0000);
									int i_211_ = (i_206_ & 0xff) * i_203_ & 0xff00;
									i_206_ = (i_209_ | i_210_ | i_211_) >>> 8;
									int i_212_ = is[i_156_];
									is[i_156_++] = ((((i_206_ & 0xff00ff) * i_207_ + (i_212_ & 0xff00ff) * i_208_) & ~0xff00ff) + (((i_206_ & 0xff00) * i_207_ + (i_212_ & 0xff00) * i_208_) & 0xff0000)) >> 8;
								} else {
									int i_213_ = ((i_206_ & 0xff0000) * i_201_ & ~0xffffff);
									int i_214_ = ((i_206_ & 0xff00) * i_202_ & 0xff0000);
									int i_215_ = (i_206_ & 0xff) * i_203_ & 0xff00;
									is[i_156_++] = (i_213_ | i_214_ | i_215_) >>> 8;
								}
							}
							i_156_ += i_160_;
							i_157_ += i_161_;
						}
						return;
					}
					return;
				}
				if (i_152_ == 3) {
					for (int i_216_ = -i_158_; i_216_ < 0; i_216_++) {
						for (int i_217_ = -i_159_; i_217_ < 0; i_217_++) {
							int i_218_ = anIntArray6682[i_157_++];
							int i_219_ = i_218_ + i_153_;
							int i_220_ = (i_218_ & 0xff00ff) + (i_153_ & 0xff00ff);
							int i_221_ = ((i_220_ & 0x1000100) + (i_219_ - i_220_ & 0x10000));
							i_221_ = i_219_ - i_221_ | i_221_ - (i_221_ >>> 8);
							int i_222_ = (i_221_ >>> 24) * (i_153_ >>> 24) >> 8;
							int i_223_ = 256 - i_222_;
							if (i_222_ != 255) {
								i_218_ = i_221_;
								i_221_ = is[i_156_];
								i_221_ = ((((i_218_ & 0xff00ff) * i_222_ + (i_221_ & 0xff00ff) * i_223_) & ~0xff00ff) + (((i_218_ & 0xff00) * i_222_ + (i_221_ & 0xff00) * i_223_) & 0xff0000)) >> 8;
							}
							is[i_156_++] = i_221_;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 2) {
					int i_224_ = i_153_ >>> 24;
					int i_225_ = 256 - i_224_;
					int i_226_ = (i_153_ & 0xff00ff) * i_225_ & ~0xff00ff;
					int i_227_ = (i_153_ & 0xff00) * i_225_ & 0xff0000;
					i_153_ = (i_226_ | i_227_) >>> 8;
					for (int i_228_ = -i_158_; i_228_ < 0; i_228_++) {
						for (int i_229_ = -i_159_; i_229_ < 0; i_229_++) {
							int i_230_ = anIntArray6682[i_157_++];
							int i_231_ = i_230_ >>> 24;
							int i_232_ = 256 - i_231_;
							i_226_ = (i_230_ & 0xff00ff) * i_224_ & ~0xff00ff;
							i_227_ = (i_230_ & 0xff00) * i_224_ & 0xff0000;
							i_230_ = ((i_226_ | i_227_) >>> 8) + i_153_;
							int i_233_ = is[i_156_];
							is[i_156_++] = ((((i_230_ & 0xff00ff) * i_231_ + (i_233_ & 0xff00ff) * i_232_) & ~0xff00ff) + (((i_230_ & 0xff00) * i_231_ + (i_233_ & 0xff00) * i_232_) & 0xff0000)) >> 8;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_154_ == 2) {
				if (i_152_ == 1) {
					for (int i_234_ = -i_158_; i_234_ < 0; i_234_++) {
						for (int i_235_ = -i_159_; i_235_ < 0; i_235_++) {
							int i_236_ = anIntArray6682[i_157_++];
							if (i_236_ != 0) {
								int i_237_ = is[i_156_];
								int i_238_ = i_236_ + i_237_;
								int i_239_ = ((i_236_ & 0xff00ff) + (i_237_ & 0xff00ff));
								i_237_ = (i_239_ & 0x1000100) + (i_238_ - i_239_ & 0x10000);
								is[i_156_++] = i_238_ - i_237_ | i_237_ - (i_237_ >>> 8);
							} else
								i_156_++;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 0) {
					int i_240_ = (i_153_ & 0xff0000) >> 16;
					int i_241_ = (i_153_ & 0xff00) >> 8;
					int i_242_ = i_153_ & 0xff;
					for (int i_243_ = -i_158_; i_243_ < 0; i_243_++) {
						for (int i_244_ = -i_159_; i_244_ < 0; i_244_++) {
							int i_245_ = anIntArray6682[i_157_++];
							if (i_245_ != 0) {
								int i_246_ = (i_245_ & 0xff0000) * i_240_ & ~0xffffff;
								int i_247_ = (i_245_ & 0xff00) * i_241_ & 0xff0000;
								int i_248_ = (i_245_ & 0xff) * i_242_ & 0xff00;
								i_245_ = (i_246_ | i_247_ | i_248_) >>> 8;
								int i_249_ = is[i_156_];
								int i_250_ = i_245_ + i_249_;
								int i_251_ = ((i_245_ & 0xff00ff) + (i_249_ & 0xff00ff));
								i_249_ = (i_251_ & 0x1000100) + (i_250_ - i_251_ & 0x10000);
								is[i_156_++] = i_250_ - i_249_ | i_249_ - (i_249_ >>> 8);
							} else
								i_156_++;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 3) {
					for (int i_252_ = -i_158_; i_252_ < 0; i_252_++) {
						for (int i_253_ = -i_159_; i_253_ < 0; i_253_++) {
							int i_254_ = anIntArray6682[i_157_++];
							int i_255_ = i_254_ + i_153_;
							int i_256_ = (i_254_ & 0xff00ff) + (i_153_ & 0xff00ff);
							int i_257_ = ((i_256_ & 0x1000100) + (i_255_ - i_256_ & 0x10000));
							i_254_ = i_255_ - i_257_ | i_257_ - (i_257_ >>> 8);
							i_257_ = is[i_156_];
							i_255_ = i_254_ + i_257_;
							i_256_ = (i_254_ & 0xff00ff) + (i_257_ & 0xff00ff);
							i_257_ = (i_256_ & 0x1000100) + (i_255_ - i_256_ & 0x10000);
							is[i_156_++] = i_255_ - i_257_ | i_257_ - (i_257_ >>> 8);
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				if (i_152_ == 2) {
					int i_258_ = i_153_ >>> 24;
					int i_259_ = 256 - i_258_;
					int i_260_ = (i_153_ & 0xff00ff) * i_259_ & ~0xff00ff;
					int i_261_ = (i_153_ & 0xff00) * i_259_ & 0xff0000;
					i_153_ = (i_260_ | i_261_) >>> 8;
					for (int i_262_ = -i_158_; i_262_ < 0; i_262_++) {
						for (int i_263_ = -i_159_; i_263_ < 0; i_263_++) {
							int i_264_ = anIntArray6682[i_157_++];
							if (i_264_ != 0) {
								i_260_ = (i_264_ & 0xff00ff) * i_258_ & ~0xff00ff;
								i_261_ = (i_264_ & 0xff00) * i_258_ & 0xff0000;
								i_264_ = ((i_260_ | i_261_) >>> 8) + i_153_;
								int i_265_ = is[i_156_];
								int i_266_ = i_264_ + i_265_;
								int i_267_ = ((i_264_ & 0xff00ff) + (i_265_ & 0xff00ff));
								i_265_ = (i_267_ & 0x1000100) + (i_266_ - i_267_ & 0x10000);
								is[i_156_++] = i_266_ - i_265_ | i_265_ - (i_265_ >>> 8);
							} else
								i_156_++;
						}
						i_156_ += i_160_;
						i_157_ += i_161_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	final void t(int i, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_) {
		int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		for (int i_273_ = 0; i_273_ < i_270_; i_273_++) {
			int i_274_ = (i_268_ + i_273_) * i_269_ + i;
			int i_275_ = (i_272_ + i_273_) * i_269_ + i_271_;
			for (int i_276_ = 0; i_276_ < i_269_; i_276_++)
				anIntArray6682[i_274_ + i_276_] = is[i_275_ + i_276_] & 0xffffff;
		}
	}

	final void method737(int i, int i_277_, Class128 class128, int i_278_, int i_279_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		i += ((Class_l_Sub1) this).anInt5218;
		i_277_ += ((Class_l_Sub1) this).anInt5209;
		int i_280_ = 0;
		int i_281_ = ((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb;
		int i_282_ = ((Class_l_Sub1) this).anInt5230;
		int i_283_ = ((Class_l_Sub1) this).anInt5205;
		int i_284_ = i_281_ - i_282_;
		int i_285_ = 0;
		int i_286_ = i + i_277_ * i_281_;
		if (i_277_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
			int i_287_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb) - i_277_);
			i_283_ -= i_287_;
			i_277_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb);
			i_280_ += i_287_ * i_282_;
			i_286_ += i_287_ * i_281_;
		}
		if (i_277_ + i_283_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
			i_283_ -= i_277_ + i_283_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856);
		if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
			int i_288_ = ((((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb) - i);
			i_282_ -= i_288_;
			i = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb);
			i_280_ += i_288_;
			i_286_ += i_288_;
			i_285_ += i_288_;
			i_284_ += i_288_;
		}
		if (i + i_282_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
			int i_289_ = i + i_282_ - (((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
			i_282_ -= i_289_;
			i_285_ += i_289_;
			i_284_ += i_289_;
		}
		if (i_282_ > 0 && i_283_ > 0) {
			Class128_Sub2 class128_sub2 = (Class128_Sub2) class128;
			int[] is = ((Class128_Sub2) class128_sub2).anIntArray5568;
			int[] is_290_ = ((Class128_Sub2) class128_sub2).anIntArray5567;
			int[] is_291_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			int i_292_ = i_277_;
			if (i_279_ > i_292_) {
				i_292_ = i_279_;
				i_286_ += (i_279_ - i_277_) * i_281_;
				i_280_ += (i_279_ - i_277_) * ((Class_l_Sub1) this).anInt5230;
			}
			int i_293_ = (i_279_ + is.length < i_277_ + i_283_ ? i_279_ + is.length : i_277_ + i_283_);
			for (int i_294_ = i_292_; i_294_ < i_293_; i_294_++) {
				int i_295_ = is[i_294_ - i_279_] + i_278_;
				int i_296_ = is_290_[i_294_ - i_279_];
				int i_297_ = i_282_;
				if (i > i_295_) {
					int i_298_ = i - i_295_;
					if (i_298_ >= i_296_) {
						i_280_ += i_282_ + i_285_;
						i_286_ += i_282_ + i_284_;
						continue;
					}
					i_296_ -= i_298_;
				} else {
					int i_299_ = i_295_ - i;
					if (i_299_ >= i_282_) {
						i_280_ += i_282_ + i_285_;
						i_286_ += i_282_ + i_284_;
						continue;
					}
					i_280_ += i_299_;
					i_297_ -= i_299_;
					i_286_ += i_299_;
				}
				int i_300_ = 0;
				if (i_297_ < i_296_)
					i_296_ = i_297_;
				else
					i_300_ = i_297_ - i_296_;
				for (int i_301_ = -i_296_; i_301_ < 0; i_301_++) {
					int i_302_ = anIntArray6682[i_280_++];
					int i_303_ = i_302_ >>> 24;
					int i_304_ = 256 - i_303_;
					int i_305_ = is_291_[i_286_];
					is_291_[i_286_++] = ((((i_302_ & 0xff00ff) * i_303_ + (i_305_ & 0xff00ff) * i_304_) & ~0xff00ff) + (((i_302_ & 0xff00) * i_303_ + (i_305_ & 0xff00) * i_304_) & 0xff0000)) >> 8;
				}
				i_280_ += i_300_ + i_285_;
				i_286_ += i_300_ + i_284_;
			}
		}
	}

	Class_l_Sub1_Sub2(Class260_Sub1 class260_sub1, int[] is, int i, int i_306_, int i_307_, int i_308_) {
		super(class260_sub1, i_307_, i_308_);
		anIntArray6682 = new int[i_307_ * i_308_];
		i_306_ -= ((Class_l_Sub1) this).anInt5230;
		int i_309_ = 0;
		for (int i_310_ = 0; i_310_ < i_308_; i_310_++) {
			for (int i_311_ = 0; i_311_ < i_307_; i_311_++)
				anIntArray6682[i_309_++] = is[i++];
			i += i_306_;
		}
	}

	final void method2216(int i, int i_312_) {
		int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
		if (Class_l_Sub1.anInt5214 == 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_313_ = Class_l_Sub1.anInt5202;
				while (i_313_ < 0) {
					int i_314_ = Class_l_Sub1.anInt5217;
					int i_315_ = Class_l_Sub1.anInt5206;
					int i_316_ = Class_l_Sub1.anInt5207;
					int i_317_ = Class_l_Sub1.anInt5212;
					if (i_315_ >= 0 && i_316_ >= 0 && i_315_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0 && (i_316_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						for (/**/; i_317_ < 0; i_317_++) {
							int i_318_ = (((i_316_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_315_ >> 12));
							int i_319_ = i_314_++;
							int[] is_320_ = is;
							int i_321_ = i;
							int i_322_ = i_312_;
							if (i_322_ == 0) {
								if (i_321_ == 1)
									is_320_[i_319_] = anIntArray6682[i_318_];
								else if (i_321_ == 0) {
									int i_323_ = anIntArray6682[i_318_++];
									int i_324_ = (((i_323_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_325_ = (((i_323_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_326_ = (((i_323_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_320_[i_319_] = (i_324_ | i_325_ | i_326_) >>> 8;
								} else if (i_321_ == 3) {
									int i_327_ = anIntArray6682[i_318_++];
									int i_328_ = Class_l_Sub1.anInt5221;
									int i_329_ = i_327_ + i_328_;
									int i_330_ = ((i_327_ & 0xff00ff) + (i_328_ & 0xff00ff));
									int i_331_ = ((i_330_ & 0x1000100) + (i_329_ - i_330_ & 0x10000));
									is_320_[i_319_] = i_329_ - i_331_ | i_331_ - (i_331_ >>> 8);
								} else if (i_321_ == 2) {
									int i_332_ = anIntArray6682[i_318_];
									int i_333_ = (((i_332_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_334_ = (((i_332_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_320_[i_319_] = (((i_333_ | i_334_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_322_ == 1) {
								if (i_321_ == 1) {
									int i_335_ = anIntArray6682[i_318_];
									int i_336_ = i_335_ >>> 24;
									int i_337_ = 256 - i_336_;
									int i_338_ = is_320_[i_319_];
									is_320_[i_319_] = ((((i_335_ & 0xff00ff) * i_336_ + (i_338_ & 0xff00ff) * i_337_) & ~0xff00ff) + (((i_335_ & 0xff00) * i_336_ + (i_338_ & 0xff00) * i_337_) & 0xff0000)) >> 8;
								} else if (i_321_ == 0) {
									int i_339_ = anIntArray6682[i_318_];
									int i_340_ = (((i_339_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_341_ = 256 - i_340_;
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_342_ = is_320_[i_319_];
										is_320_[i_319_] = ((((i_339_ & 0xff00ff) * i_340_ + ((i_342_ & 0xff00ff) * i_341_)) & ~0xff00ff) + (((i_339_ & 0xff00) * i_340_ + ((i_342_ & 0xff00) * i_341_)) & 0xff0000)) >> 8;
									} else if (i_340_ != 255) {
										int i_343_ = (((i_339_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_344_ = (((i_339_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_345_ = (((i_339_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_339_ = (i_343_ | i_344_ | i_345_) >>> 8;
										int i_346_ = is_320_[i_319_];
										is_320_[i_319_] = ((((i_339_ & 0xff00ff) * i_340_ + ((i_346_ & 0xff00ff) * i_341_)) & ~0xff00ff) + (((i_339_ & 0xff00) * i_340_ + ((i_346_ & 0xff00) * i_341_)) & 0xff0000)) >> 8;
									} else {
										int i_347_ = (((i_339_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_348_ = (((i_339_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_349_ = (((i_339_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_320_[i_319_] = (i_347_ | i_348_ | i_349_) >>> 8;
									}
								} else if (i_321_ == 3) {
									int i_350_ = anIntArray6682[i_318_];
									int i_351_ = Class_l_Sub1.anInt5221;
									int i_352_ = i_350_ + i_351_;
									int i_353_ = ((i_350_ & 0xff00ff) + (i_351_ & 0xff00ff));
									int i_354_ = ((i_353_ & 0x1000100) + (i_352_ - i_353_ & 0x10000));
									i_354_ = i_352_ - i_354_ | i_354_ - (i_354_ >>> 8);
									int i_355_ = (((i_354_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_356_ = 256 - i_355_;
									if (i_355_ != 255) {
										i_350_ = i_354_;
										i_354_ = is_320_[i_319_];
										i_354_ = ((((i_350_ & 0xff00ff) * i_355_ + ((i_354_ & 0xff00ff) * i_356_)) & ~0xff00ff) + (((i_350_ & 0xff00) * i_355_ + ((i_354_ & 0xff00) * i_356_)) & 0xff0000)) >> 8;
									}
									is_320_[i_319_] = i_354_;
								} else if (i_321_ == 2) {
									int i_357_ = anIntArray6682[i_318_];
									int i_358_ = i_357_ >>> 24;
									int i_359_ = 256 - i_358_;
									int i_360_ = (((i_357_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_361_ = (((i_357_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_357_ = (((i_360_ | i_361_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_362_ = is_320_[i_319_];
									is_320_[i_319_] = ((((i_357_ & 0xff00ff) * i_358_ + (i_362_ & 0xff00ff) * i_359_) & ~0xff00ff) + (((i_357_ & 0xff00) * i_358_ + (i_362_ & 0xff00) * i_359_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_322_ == 2) {
								if (i_321_ == 1) {
									int i_363_ = anIntArray6682[i_318_];
									int i_364_ = is_320_[i_319_];
									int i_365_ = i_363_ + i_364_;
									int i_366_ = ((i_363_ & 0xff00ff) + (i_364_ & 0xff00ff));
									i_364_ = ((i_366_ & 0x1000100) + (i_365_ - i_366_ & 0x10000));
									is_320_[i_319_] = i_365_ - i_364_ | i_364_ - (i_364_ >>> 8);
								} else if (i_321_ == 0) {
									int i_367_ = anIntArray6682[i_318_];
									int i_368_ = (((i_367_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_369_ = (((i_367_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_370_ = (((i_367_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_367_ = (i_368_ | i_369_ | i_370_) >>> 8;
									int i_371_ = is_320_[i_319_];
									int i_372_ = i_367_ + i_371_;
									int i_373_ = ((i_367_ & 0xff00ff) + (i_371_ & 0xff00ff));
									i_371_ = ((i_373_ & 0x1000100) + (i_372_ - i_373_ & 0x10000));
									is_320_[i_319_] = i_372_ - i_371_ | i_371_ - (i_371_ >>> 8);
								} else if (i_321_ == 3) {
									int i_374_ = anIntArray6682[i_318_];
									int i_375_ = Class_l_Sub1.anInt5221;
									int i_376_ = i_374_ + i_375_;
									int i_377_ = ((i_374_ & 0xff00ff) + (i_375_ & 0xff00ff));
									int i_378_ = ((i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000));
									i_374_ = i_376_ - i_378_ | i_378_ - (i_378_ >>> 8);
									i_378_ = is_320_[i_319_];
									i_376_ = i_374_ + i_378_;
									i_377_ = (i_374_ & 0xff00ff) + (i_378_ & 0xff00ff);
									i_378_ = ((i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000));
									is_320_[i_319_] = i_376_ - i_378_ | i_378_ - (i_378_ >>> 8);
								} else if (i_321_ == 2) {
									int i_379_ = anIntArray6682[i_318_];
									int i_380_ = (((i_379_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_381_ = (((i_379_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_379_ = (((i_380_ | i_381_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_382_ = is_320_[i_319_];
									int i_383_ = i_379_ + i_382_;
									int i_384_ = ((i_379_ & 0xff00ff) + (i_382_ & 0xff00ff));
									i_382_ = ((i_384_ & 0x1000100) + (i_383_ - i_384_ & 0x10000));
									is_320_[i_319_] = i_383_ - i_382_ | i_382_ - (i_382_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
						}
					}
					i_313_++;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_385_ = Class_l_Sub1.anInt5202;
				while (i_385_ < 0) {
					int i_386_ = Class_l_Sub1.anInt5217;
					int i_387_ = Class_l_Sub1.anInt5206;
					int i_388_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_389_ = Class_l_Sub1.anInt5212;
					if (i_387_ >= 0 && (i_387_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						int i_390_;
						if ((i_390_ = i_388_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
							i_390_ = ((Class_l_Sub1.anInt5226 - i_390_) / Class_l_Sub1.anInt5226);
							i_389_ += i_390_;
							i_388_ += Class_l_Sub1.anInt5226 * i_390_;
							i_386_ += i_390_;
						}
						if ((i_390_ = ((i_388_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_389_)
							i_389_ = i_390_;
						for (/**/; i_389_ < 0; i_389_++) {
							int i_391_ = (((i_388_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_387_ >> 12));
							int i_392_ = i_386_++;
							int[] is_393_ = is;
							int i_394_ = i;
							int i_395_ = i_312_;
							if (i_395_ == 0) {
								if (i_394_ == 1)
									is_393_[i_392_] = anIntArray6682[i_391_];
								else if (i_394_ == 0) {
									int i_396_ = anIntArray6682[i_391_++];
									int i_397_ = (((i_396_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_398_ = (((i_396_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_399_ = (((i_396_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_393_[i_392_] = (i_397_ | i_398_ | i_399_) >>> 8;
								} else if (i_394_ == 3) {
									int i_400_ = anIntArray6682[i_391_++];
									int i_401_ = Class_l_Sub1.anInt5221;
									int i_402_ = i_400_ + i_401_;
									int i_403_ = ((i_400_ & 0xff00ff) + (i_401_ & 0xff00ff));
									int i_404_ = ((i_403_ & 0x1000100) + (i_402_ - i_403_ & 0x10000));
									is_393_[i_392_] = i_402_ - i_404_ | i_404_ - (i_404_ >>> 8);
								} else if (i_394_ == 2) {
									int i_405_ = anIntArray6682[i_391_];
									int i_406_ = (((i_405_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_407_ = (((i_405_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_393_[i_392_] = (((i_406_ | i_407_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_395_ == 1) {
								if (i_394_ == 1) {
									int i_408_ = anIntArray6682[i_391_];
									int i_409_ = i_408_ >>> 24;
									int i_410_ = 256 - i_409_;
									int i_411_ = is_393_[i_392_];
									is_393_[i_392_] = ((((i_408_ & 0xff00ff) * i_409_ + (i_411_ & 0xff00ff) * i_410_) & ~0xff00ff) + (((i_408_ & 0xff00) * i_409_ + (i_411_ & 0xff00) * i_410_) & 0xff0000)) >> 8;
								} else if (i_394_ == 0) {
									int i_412_ = anIntArray6682[i_391_];
									int i_413_ = (((i_412_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_414_ = 256 - i_413_;
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_415_ = is_393_[i_392_];
										is_393_[i_392_] = ((((i_412_ & 0xff00ff) * i_413_ + ((i_415_ & 0xff00ff) * i_414_)) & ~0xff00ff) + (((i_412_ & 0xff00) * i_413_ + ((i_415_ & 0xff00) * i_414_)) & 0xff0000)) >> 8;
									} else if (i_413_ != 255) {
										int i_416_ = (((i_412_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_417_ = (((i_412_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_418_ = (((i_412_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_412_ = (i_416_ | i_417_ | i_418_) >>> 8;
										int i_419_ = is_393_[i_392_];
										is_393_[i_392_] = ((((i_412_ & 0xff00ff) * i_413_ + ((i_419_ & 0xff00ff) * i_414_)) & ~0xff00ff) + (((i_412_ & 0xff00) * i_413_ + ((i_419_ & 0xff00) * i_414_)) & 0xff0000)) >> 8;
									} else {
										int i_420_ = (((i_412_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_421_ = (((i_412_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_422_ = (((i_412_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_393_[i_392_] = (i_420_ | i_421_ | i_422_) >>> 8;
									}
								} else if (i_394_ == 3) {
									int i_423_ = anIntArray6682[i_391_];
									int i_424_ = Class_l_Sub1.anInt5221;
									int i_425_ = i_423_ + i_424_;
									int i_426_ = ((i_423_ & 0xff00ff) + (i_424_ & 0xff00ff));
									int i_427_ = ((i_426_ & 0x1000100) + (i_425_ - i_426_ & 0x10000));
									i_427_ = i_425_ - i_427_ | i_427_ - (i_427_ >>> 8);
									int i_428_ = (((i_427_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_429_ = 256 - i_428_;
									if (i_428_ != 255) {
										i_423_ = i_427_;
										i_427_ = is_393_[i_392_];
										i_427_ = ((((i_423_ & 0xff00ff) * i_428_ + ((i_427_ & 0xff00ff) * i_429_)) & ~0xff00ff) + (((i_423_ & 0xff00) * i_428_ + ((i_427_ & 0xff00) * i_429_)) & 0xff0000)) >> 8;
									}
									is_393_[i_392_] = i_427_;
								} else if (i_394_ == 2) {
									int i_430_ = anIntArray6682[i_391_];
									int i_431_ = i_430_ >>> 24;
									int i_432_ = 256 - i_431_;
									int i_433_ = (((i_430_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_434_ = (((i_430_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_430_ = (((i_433_ | i_434_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_435_ = is_393_[i_392_];
									is_393_[i_392_] = ((((i_430_ & 0xff00ff) * i_431_ + (i_435_ & 0xff00ff) * i_432_) & ~0xff00ff) + (((i_430_ & 0xff00) * i_431_ + (i_435_ & 0xff00) * i_432_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_395_ == 2) {
								if (i_394_ == 1) {
									int i_436_ = anIntArray6682[i_391_];
									int i_437_ = is_393_[i_392_];
									int i_438_ = i_436_ + i_437_;
									int i_439_ = ((i_436_ & 0xff00ff) + (i_437_ & 0xff00ff));
									i_437_ = ((i_439_ & 0x1000100) + (i_438_ - i_439_ & 0x10000));
									is_393_[i_392_] = i_438_ - i_437_ | i_437_ - (i_437_ >>> 8);
								} else if (i_394_ == 0) {
									int i_440_ = anIntArray6682[i_391_];
									int i_441_ = (((i_440_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_442_ = (((i_440_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_443_ = (((i_440_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_440_ = (i_441_ | i_442_ | i_443_) >>> 8;
									int i_444_ = is_393_[i_392_];
									int i_445_ = i_440_ + i_444_;
									int i_446_ = ((i_440_ & 0xff00ff) + (i_444_ & 0xff00ff));
									i_444_ = ((i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000));
									is_393_[i_392_] = i_445_ - i_444_ | i_444_ - (i_444_ >>> 8);
								} else if (i_394_ == 3) {
									int i_447_ = anIntArray6682[i_391_];
									int i_448_ = Class_l_Sub1.anInt5221;
									int i_449_ = i_447_ + i_448_;
									int i_450_ = ((i_447_ & 0xff00ff) + (i_448_ & 0xff00ff));
									int i_451_ = ((i_450_ & 0x1000100) + (i_449_ - i_450_ & 0x10000));
									i_447_ = i_449_ - i_451_ | i_451_ - (i_451_ >>> 8);
									i_451_ = is_393_[i_392_];
									i_449_ = i_447_ + i_451_;
									i_450_ = (i_447_ & 0xff00ff) + (i_451_ & 0xff00ff);
									i_451_ = ((i_450_ & 0x1000100) + (i_449_ - i_450_ & 0x10000));
									is_393_[i_392_] = i_449_ - i_451_ | i_451_ - (i_451_ >>> 8);
								} else if (i_394_ == 2) {
									int i_452_ = anIntArray6682[i_391_];
									int i_453_ = (((i_452_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_454_ = (((i_452_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_452_ = (((i_453_ | i_454_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_455_ = is_393_[i_392_];
									int i_456_ = i_452_ + i_455_;
									int i_457_ = ((i_452_ & 0xff00ff) + (i_455_ & 0xff00ff));
									i_455_ = ((i_457_ & 0x1000100) + (i_456_ - i_457_ & 0x10000));
									is_393_[i_392_] = i_456_ - i_455_ | i_455_ - (i_455_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_388_ += Class_l_Sub1.anInt5226;
						}
					}
					i_385_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_458_ = Class_l_Sub1.anInt5202;
				while (i_458_ < 0) {
					int i_459_ = Class_l_Sub1.anInt5217;
					int i_460_ = Class_l_Sub1.anInt5206;
					int i_461_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_462_ = Class_l_Sub1.anInt5212;
					if (i_460_ >= 0 && (i_460_ - (((Class_l_Sub1) this).anInt5230 << 12) < 0)) {
						if (i_461_ < 0) {
							int i_463_ = ((Class_l_Sub1.anInt5226 - 1 - i_461_) / Class_l_Sub1.anInt5226);
							i_462_ += i_463_;
							i_461_ += Class_l_Sub1.anInt5226 * i_463_;
							i_459_ += i_463_;
						}
						int i_464_;
						if ((i_464_ = ((1 + i_461_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_462_)
							i_462_ = i_464_;
						for (/**/; i_462_ < 0; i_462_++) {
							int i_465_ = (((i_461_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_460_ >> 12));
							int i_466_ = i_459_++;
							int[] is_467_ = is;
							int i_468_ = i;
							int i_469_ = i_312_;
							if (i_469_ == 0) {
								if (i_468_ == 1)
									is_467_[i_466_] = anIntArray6682[i_465_];
								else if (i_468_ == 0) {
									int i_470_ = anIntArray6682[i_465_++];
									int i_471_ = (((i_470_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_472_ = (((i_470_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_473_ = (((i_470_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_467_[i_466_] = (i_471_ | i_472_ | i_473_) >>> 8;
								} else if (i_468_ == 3) {
									int i_474_ = anIntArray6682[i_465_++];
									int i_475_ = Class_l_Sub1.anInt5221;
									int i_476_ = i_474_ + i_475_;
									int i_477_ = ((i_474_ & 0xff00ff) + (i_475_ & 0xff00ff));
									int i_478_ = ((i_477_ & 0x1000100) + (i_476_ - i_477_ & 0x10000));
									is_467_[i_466_] = i_476_ - i_478_ | i_478_ - (i_478_ >>> 8);
								} else if (i_468_ == 2) {
									int i_479_ = anIntArray6682[i_465_];
									int i_480_ = (((i_479_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_481_ = (((i_479_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_467_[i_466_] = (((i_480_ | i_481_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_469_ == 1) {
								if (i_468_ == 1) {
									int i_482_ = anIntArray6682[i_465_];
									int i_483_ = i_482_ >>> 24;
									int i_484_ = 256 - i_483_;
									int i_485_ = is_467_[i_466_];
									is_467_[i_466_] = ((((i_482_ & 0xff00ff) * i_483_ + (i_485_ & 0xff00ff) * i_484_) & ~0xff00ff) + (((i_482_ & 0xff00) * i_483_ + (i_485_ & 0xff00) * i_484_) & 0xff0000)) >> 8;
								} else if (i_468_ == 0) {
									int i_486_ = anIntArray6682[i_465_];
									int i_487_ = (((i_486_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_488_ = 256 - i_487_;
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_489_ = is_467_[i_466_];
										is_467_[i_466_] = ((((i_486_ & 0xff00ff) * i_487_ + ((i_489_ & 0xff00ff) * i_488_)) & ~0xff00ff) + (((i_486_ & 0xff00) * i_487_ + ((i_489_ & 0xff00) * i_488_)) & 0xff0000)) >> 8;
									} else if (i_487_ != 255) {
										int i_490_ = (((i_486_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_491_ = (((i_486_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_492_ = (((i_486_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_486_ = (i_490_ | i_491_ | i_492_) >>> 8;
										int i_493_ = is_467_[i_466_];
										is_467_[i_466_] = ((((i_486_ & 0xff00ff) * i_487_ + ((i_493_ & 0xff00ff) * i_488_)) & ~0xff00ff) + (((i_486_ & 0xff00) * i_487_ + ((i_493_ & 0xff00) * i_488_)) & 0xff0000)) >> 8;
									} else {
										int i_494_ = (((i_486_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_495_ = (((i_486_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_496_ = (((i_486_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_467_[i_466_] = (i_494_ | i_495_ | i_496_) >>> 8;
									}
								} else if (i_468_ == 3) {
									int i_497_ = anIntArray6682[i_465_];
									int i_498_ = Class_l_Sub1.anInt5221;
									int i_499_ = i_497_ + i_498_;
									int i_500_ = ((i_497_ & 0xff00ff) + (i_498_ & 0xff00ff));
									int i_501_ = ((i_500_ & 0x1000100) + (i_499_ - i_500_ & 0x10000));
									i_501_ = i_499_ - i_501_ | i_501_ - (i_501_ >>> 8);
									int i_502_ = (((i_501_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_503_ = 256 - i_502_;
									if (i_502_ != 255) {
										i_497_ = i_501_;
										i_501_ = is_467_[i_466_];
										i_501_ = ((((i_497_ & 0xff00ff) * i_502_ + ((i_501_ & 0xff00ff) * i_503_)) & ~0xff00ff) + (((i_497_ & 0xff00) * i_502_ + ((i_501_ & 0xff00) * i_503_)) & 0xff0000)) >> 8;
									}
									is_467_[i_466_] = i_501_;
								} else if (i_468_ == 2) {
									int i_504_ = anIntArray6682[i_465_];
									int i_505_ = i_504_ >>> 24;
									int i_506_ = 256 - i_505_;
									int i_507_ = (((i_504_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_508_ = (((i_504_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_504_ = (((i_507_ | i_508_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_509_ = is_467_[i_466_];
									is_467_[i_466_] = ((((i_504_ & 0xff00ff) * i_505_ + (i_509_ & 0xff00ff) * i_506_) & ~0xff00ff) + (((i_504_ & 0xff00) * i_505_ + (i_509_ & 0xff00) * i_506_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_469_ == 2) {
								if (i_468_ == 1) {
									int i_510_ = anIntArray6682[i_465_];
									int i_511_ = is_467_[i_466_];
									int i_512_ = i_510_ + i_511_;
									int i_513_ = ((i_510_ & 0xff00ff) + (i_511_ & 0xff00ff));
									i_511_ = ((i_513_ & 0x1000100) + (i_512_ - i_513_ & 0x10000));
									is_467_[i_466_] = i_512_ - i_511_ | i_511_ - (i_511_ >>> 8);
								} else if (i_468_ == 0) {
									int i_514_ = anIntArray6682[i_465_];
									int i_515_ = (((i_514_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_516_ = (((i_514_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_517_ = (((i_514_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_514_ = (i_515_ | i_516_ | i_517_) >>> 8;
									int i_518_ = is_467_[i_466_];
									int i_519_ = i_514_ + i_518_;
									int i_520_ = ((i_514_ & 0xff00ff) + (i_518_ & 0xff00ff));
									i_518_ = ((i_520_ & 0x1000100) + (i_519_ - i_520_ & 0x10000));
									is_467_[i_466_] = i_519_ - i_518_ | i_518_ - (i_518_ >>> 8);
								} else if (i_468_ == 3) {
									int i_521_ = anIntArray6682[i_465_];
									int i_522_ = Class_l_Sub1.anInt5221;
									int i_523_ = i_521_ + i_522_;
									int i_524_ = ((i_521_ & 0xff00ff) + (i_522_ & 0xff00ff));
									int i_525_ = ((i_524_ & 0x1000100) + (i_523_ - i_524_ & 0x10000));
									i_521_ = i_523_ - i_525_ | i_525_ - (i_525_ >>> 8);
									i_525_ = is_467_[i_466_];
									i_523_ = i_521_ + i_525_;
									i_524_ = (i_521_ & 0xff00ff) + (i_525_ & 0xff00ff);
									i_525_ = ((i_524_ & 0x1000100) + (i_523_ - i_524_ & 0x10000));
									is_467_[i_466_] = i_523_ - i_525_ | i_525_ - (i_525_ >>> 8);
								} else if (i_468_ == 2) {
									int i_526_ = anIntArray6682[i_465_];
									int i_527_ = (((i_526_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_528_ = (((i_526_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_526_ = (((i_527_ | i_528_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_529_ = is_467_[i_466_];
									int i_530_ = i_526_ + i_529_;
									int i_531_ = ((i_526_ & 0xff00ff) + (i_529_ & 0xff00ff));
									i_529_ = ((i_531_ & 0x1000100) + (i_530_ - i_531_ & 0x10000));
									is_467_[i_466_] = i_530_ - i_529_ | i_529_ - (i_529_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_461_ += Class_l_Sub1.anInt5226;
						}
					}
					i_458_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5214 < 0) {
			if (Class_l_Sub1.anInt5226 == 0) {
				int i_532_ = Class_l_Sub1.anInt5202;
				while (i_532_ < 0) {
					int i_533_ = Class_l_Sub1.anInt5217;
					int i_534_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_535_ = Class_l_Sub1.anInt5207;
					int i_536_ = Class_l_Sub1.anInt5212;
					if (i_535_ >= 0 && (i_535_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0)) {
						int i_537_;
						if ((i_537_ = i_534_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
							i_537_ = ((Class_l_Sub1.anInt5214 - i_537_) / Class_l_Sub1.anInt5214);
							i_536_ += i_537_;
							i_534_ += Class_l_Sub1.anInt5214 * i_537_;
							i_533_ += i_537_;
						}
						if ((i_537_ = ((i_534_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_536_)
							i_536_ = i_537_;
						for (/**/; i_536_ < 0; i_536_++) {
							int i_538_ = (((i_535_ >> 12) * ((Class_l_Sub1) this).anInt5230) + (i_534_ >> 12));
							int i_539_ = i_533_++;
							int[] is_540_ = is;
							int i_541_ = i;
							int i_542_ = i_312_;
							if (i_542_ == 0) {
								if (i_541_ == 1)
									is_540_[i_539_] = anIntArray6682[i_538_];
								else if (i_541_ == 0) {
									int i_543_ = anIntArray6682[i_538_++];
									int i_544_ = (((i_543_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_545_ = (((i_543_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_546_ = (((i_543_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_540_[i_539_] = (i_544_ | i_545_ | i_546_) >>> 8;
								} else if (i_541_ == 3) {
									int i_547_ = anIntArray6682[i_538_++];
									int i_548_ = Class_l_Sub1.anInt5221;
									int i_549_ = i_547_ + i_548_;
									int i_550_ = ((i_547_ & 0xff00ff) + (i_548_ & 0xff00ff));
									int i_551_ = ((i_550_ & 0x1000100) + (i_549_ - i_550_ & 0x10000));
									is_540_[i_539_] = i_549_ - i_551_ | i_551_ - (i_551_ >>> 8);
								} else if (i_541_ == 2) {
									int i_552_ = anIntArray6682[i_538_];
									int i_553_ = (((i_552_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_554_ = (((i_552_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									is_540_[i_539_] = (((i_553_ | i_554_) >>> 8) + Class_l_Sub1.anInt5213);
								} else
									throw new IllegalArgumentException();
							} else if (i_542_ == 1) {
								if (i_541_ == 1) {
									int i_555_ = anIntArray6682[i_538_];
									int i_556_ = i_555_ >>> 24;
									int i_557_ = 256 - i_556_;
									int i_558_ = is_540_[i_539_];
									is_540_[i_539_] = ((((i_555_ & 0xff00ff) * i_556_ + (i_558_ & 0xff00ff) * i_557_) & ~0xff00ff) + (((i_555_ & 0xff00) * i_556_ + (i_558_ & 0xff00) * i_557_) & 0xff0000)) >> 8;
								} else if (i_541_ == 0) {
									int i_559_ = anIntArray6682[i_538_];
									int i_560_ = (((i_559_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_561_ = 256 - i_560_;
									if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
										int i_562_ = is_540_[i_539_];
										is_540_[i_539_] = ((((i_559_ & 0xff00ff) * i_560_ + ((i_562_ & 0xff00ff) * i_561_)) & ~0xff00ff) + (((i_559_ & 0xff00) * i_560_ + ((i_562_ & 0xff00) * i_561_)) & 0xff0000)) >> 8;
									} else if (i_560_ != 255) {
										int i_563_ = (((i_559_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_564_ = (((i_559_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_565_ = (((i_559_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										i_559_ = (i_563_ | i_564_ | i_565_) >>> 8;
										int i_566_ = is_540_[i_539_];
										is_540_[i_539_] = ((((i_559_ & 0xff00ff) * i_560_ + ((i_566_ & 0xff00ff) * i_561_)) & ~0xff00ff) + (((i_559_ & 0xff00) * i_560_ + ((i_566_ & 0xff00) * i_561_)) & 0xff0000)) >> 8;
									} else {
										int i_567_ = (((i_559_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
										int i_568_ = (((i_559_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
										int i_569_ = (((i_559_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
										is_540_[i_539_] = (i_567_ | i_568_ | i_569_) >>> 8;
									}
								} else if (i_541_ == 3) {
									int i_570_ = anIntArray6682[i_538_];
									int i_571_ = Class_l_Sub1.anInt5221;
									int i_572_ = i_570_ + i_571_;
									int i_573_ = ((i_570_ & 0xff00ff) + (i_571_ & 0xff00ff));
									int i_574_ = ((i_573_ & 0x1000100) + (i_572_ - i_573_ & 0x10000));
									i_574_ = i_572_ - i_574_ | i_574_ - (i_574_ >>> 8);
									int i_575_ = (((i_574_ >>> 24) * Class_l_Sub1.anInt5223) >> 8);
									int i_576_ = 256 - i_575_;
									if (i_575_ != 255) {
										i_570_ = i_574_;
										i_574_ = is_540_[i_539_];
										i_574_ = ((((i_570_ & 0xff00ff) * i_575_ + ((i_574_ & 0xff00ff) * i_576_)) & ~0xff00ff) + (((i_570_ & 0xff00) * i_575_ + ((i_574_ & 0xff00) * i_576_)) & 0xff0000)) >> 8;
									}
									is_540_[i_539_] = i_574_;
								} else if (i_541_ == 2) {
									int i_577_ = anIntArray6682[i_538_];
									int i_578_ = i_577_ >>> 24;
									int i_579_ = 256 - i_578_;
									int i_580_ = (((i_577_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_581_ = (((i_577_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_577_ = (((i_580_ | i_581_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_582_ = is_540_[i_539_];
									is_540_[i_539_] = ((((i_577_ & 0xff00ff) * i_578_ + (i_582_ & 0xff00ff) * i_579_) & ~0xff00ff) + (((i_577_ & 0xff00) * i_578_ + (i_582_ & 0xff00) * i_579_) & 0xff0000)) >> 8;
								} else
									throw new IllegalArgumentException();
							} else if (i_542_ == 2) {
								if (i_541_ == 1) {
									int i_583_ = anIntArray6682[i_538_];
									int i_584_ = is_540_[i_539_];
									int i_585_ = i_583_ + i_584_;
									int i_586_ = ((i_583_ & 0xff00ff) + (i_584_ & 0xff00ff));
									i_584_ = ((i_586_ & 0x1000100) + (i_585_ - i_586_ & 0x10000));
									is_540_[i_539_] = i_585_ - i_584_ | i_584_ - (i_584_ >>> 8);
								} else if (i_541_ == 0) {
									int i_587_ = anIntArray6682[i_538_];
									int i_588_ = (((i_587_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_589_ = (((i_587_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_590_ = (((i_587_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_587_ = (i_588_ | i_589_ | i_590_) >>> 8;
									int i_591_ = is_540_[i_539_];
									int i_592_ = i_587_ + i_591_;
									int i_593_ = ((i_587_ & 0xff00ff) + (i_591_ & 0xff00ff));
									i_591_ = ((i_593_ & 0x1000100) + (i_592_ - i_593_ & 0x10000));
									is_540_[i_539_] = i_592_ - i_591_ | i_591_ - (i_591_ >>> 8);
								} else if (i_541_ == 3) {
									int i_594_ = anIntArray6682[i_538_];
									int i_595_ = Class_l_Sub1.anInt5221;
									int i_596_ = i_594_ + i_595_;
									int i_597_ = ((i_594_ & 0xff00ff) + (i_595_ & 0xff00ff));
									int i_598_ = ((i_597_ & 0x1000100) + (i_596_ - i_597_ & 0x10000));
									i_594_ = i_596_ - i_598_ | i_598_ - (i_598_ >>> 8);
									i_598_ = is_540_[i_539_];
									i_596_ = i_594_ + i_598_;
									i_597_ = (i_594_ & 0xff00ff) + (i_598_ & 0xff00ff);
									i_598_ = ((i_597_ & 0x1000100) + (i_596_ - i_597_ & 0x10000));
									is_540_[i_539_] = i_596_ - i_598_ | i_598_ - (i_598_ >>> 8);
								} else if (i_541_ == 2) {
									int i_599_ = anIntArray6682[i_538_];
									int i_600_ = (((i_599_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
									int i_601_ = (((i_599_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
									i_599_ = (((i_600_ | i_601_) >>> 8) + Class_l_Sub1.anInt5213);
									int i_602_ = is_540_[i_539_];
									int i_603_ = i_599_ + i_602_;
									int i_604_ = ((i_599_ & 0xff00ff) + (i_602_ & 0xff00ff));
									i_602_ = ((i_604_ & 0x1000100) + (i_603_ - i_604_ & 0x10000));
									is_540_[i_539_] = i_603_ - i_602_ | i_602_ - (i_602_ >>> 8);
								}
							} else
								throw new IllegalArgumentException();
							i_534_ += Class_l_Sub1.anInt5214;
						}
					}
					i_532_++;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else if (Class_l_Sub1.anInt5226 < 0) {
				int i_605_ = Class_l_Sub1.anInt5202;
				while (i_605_ < 0) {
					int i_606_ = Class_l_Sub1.anInt5217;
					int i_607_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_608_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_609_ = Class_l_Sub1.anInt5212;
					int i_610_;
					if ((i_610_ = i_607_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_610_ = ((Class_l_Sub1.anInt5214 - i_610_) / Class_l_Sub1.anInt5214);
						i_609_ += i_610_;
						i_607_ += Class_l_Sub1.anInt5214 * i_610_;
						i_608_ += Class_l_Sub1.anInt5226 * i_610_;
						i_606_ += i_610_;
					}
					if ((i_610_ = ((i_607_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_609_)
						i_609_ = i_610_;
					if ((i_610_ = i_608_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
						i_610_ = ((Class_l_Sub1.anInt5226 - i_610_) / Class_l_Sub1.anInt5226);
						i_609_ += i_610_;
						i_607_ += Class_l_Sub1.anInt5214 * i_610_;
						i_608_ += Class_l_Sub1.anInt5226 * i_610_;
						i_606_ += i_610_;
					}
					if ((i_610_ = ((i_608_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_609_)
						i_609_ = i_610_;
					for (/**/; i_609_ < 0; i_609_++) {
						int i_611_ = ((i_608_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_607_ >> 12));
						int i_612_ = i_606_++;
						int[] is_613_ = is;
						int i_614_ = i;
						int i_615_ = i_312_;
						if (i_615_ == 0) {
							if (i_614_ == 1)
								is_613_[i_612_] = anIntArray6682[i_611_];
							else if (i_614_ == 0) {
								int i_616_ = anIntArray6682[i_611_++];
								int i_617_ = (((i_616_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_618_ = (((i_616_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_619_ = ((i_616_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_613_[i_612_] = (i_617_ | i_618_ | i_619_) >>> 8;
							} else if (i_614_ == 3) {
								int i_620_ = anIntArray6682[i_611_++];
								int i_621_ = Class_l_Sub1.anInt5221;
								int i_622_ = i_620_ + i_621_;
								int i_623_ = ((i_620_ & 0xff00ff) + (i_621_ & 0xff00ff));
								int i_624_ = ((i_623_ & 0x1000100) + (i_622_ - i_623_ & 0x10000));
								is_613_[i_612_] = i_622_ - i_624_ | i_624_ - (i_624_ >>> 8);
							} else if (i_614_ == 2) {
								int i_625_ = anIntArray6682[i_611_];
								int i_626_ = (((i_625_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_627_ = (((i_625_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_613_[i_612_] = (((i_626_ | i_627_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_615_ == 1) {
							if (i_614_ == 1) {
								int i_628_ = anIntArray6682[i_611_];
								int i_629_ = i_628_ >>> 24;
								int i_630_ = 256 - i_629_;
								int i_631_ = is_613_[i_612_];
								is_613_[i_612_] = ((((i_628_ & 0xff00ff) * i_629_ + (i_631_ & 0xff00ff) * i_630_) & ~0xff00ff) + (((i_628_ & 0xff00) * i_629_ + (i_631_ & 0xff00) * i_630_) & 0xff0000)) >> 8;
							} else if (i_614_ == 0) {
								int i_632_ = anIntArray6682[i_611_];
								int i_633_ = ((i_632_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_634_ = 256 - i_633_;
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_635_ = is_613_[i_612_];
									is_613_[i_612_] = ((((i_632_ & 0xff00ff) * i_633_ + (i_635_ & 0xff00ff) * i_634_) & ~0xff00ff) + (((i_632_ & 0xff00) * i_633_ + (i_635_ & 0xff00) * i_634_) & 0xff0000)) >> 8;
								} else if (i_633_ != 255) {
									int i_636_ = (((i_632_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_637_ = (((i_632_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_638_ = (((i_632_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_632_ = (i_636_ | i_637_ | i_638_) >>> 8;
									int i_639_ = is_613_[i_612_];
									is_613_[i_612_] = ((((i_632_ & 0xff00ff) * i_633_ + (i_639_ & 0xff00ff) * i_634_) & ~0xff00ff) + (((i_632_ & 0xff00) * i_633_ + (i_639_ & 0xff00) * i_634_) & 0xff0000)) >> 8;
								} else {
									int i_640_ = (((i_632_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_641_ = (((i_632_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_642_ = (((i_632_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_613_[i_612_] = (i_640_ | i_641_ | i_642_) >>> 8;
								}
							} else if (i_614_ == 3) {
								int i_643_ = anIntArray6682[i_611_];
								int i_644_ = Class_l_Sub1.anInt5221;
								int i_645_ = i_643_ + i_644_;
								int i_646_ = ((i_643_ & 0xff00ff) + (i_644_ & 0xff00ff));
								int i_647_ = ((i_646_ & 0x1000100) + (i_645_ - i_646_ & 0x10000));
								i_647_ = i_645_ - i_647_ | i_647_ - (i_647_ >>> 8);
								int i_648_ = ((i_647_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_649_ = 256 - i_648_;
								if (i_648_ != 255) {
									i_643_ = i_647_;
									i_647_ = is_613_[i_612_];
									i_647_ = ((((i_643_ & 0xff00ff) * i_648_ + (i_647_ & 0xff00ff) * i_649_) & ~0xff00ff) + (((i_643_ & 0xff00) * i_648_ + (i_647_ & 0xff00) * i_649_) & 0xff0000)) >> 8;
								}
								is_613_[i_612_] = i_647_;
							} else if (i_614_ == 2) {
								int i_650_ = anIntArray6682[i_611_];
								int i_651_ = i_650_ >>> 24;
								int i_652_ = 256 - i_651_;
								int i_653_ = (((i_650_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_654_ = (((i_650_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_650_ = (((i_653_ | i_654_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_655_ = is_613_[i_612_];
								is_613_[i_612_] = ((((i_650_ & 0xff00ff) * i_651_ + (i_655_ & 0xff00ff) * i_652_) & ~0xff00ff) + (((i_650_ & 0xff00) * i_651_ + (i_655_ & 0xff00) * i_652_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_615_ == 2) {
							if (i_614_ == 1) {
								int i_656_ = anIntArray6682[i_611_];
								int i_657_ = is_613_[i_612_];
								int i_658_ = i_656_ + i_657_;
								int i_659_ = ((i_656_ & 0xff00ff) + (i_657_ & 0xff00ff));
								i_657_ = (i_659_ & 0x1000100) + (i_658_ - i_659_ & 0x10000);
								is_613_[i_612_] = i_658_ - i_657_ | i_657_ - (i_657_ >>> 8);
							} else if (i_614_ == 0) {
								int i_660_ = anIntArray6682[i_611_];
								int i_661_ = (((i_660_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_662_ = (((i_660_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_663_ = ((i_660_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_660_ = (i_661_ | i_662_ | i_663_) >>> 8;
								int i_664_ = is_613_[i_612_];
								int i_665_ = i_660_ + i_664_;
								int i_666_ = ((i_660_ & 0xff00ff) + (i_664_ & 0xff00ff));
								i_664_ = (i_666_ & 0x1000100) + (i_665_ - i_666_ & 0x10000);
								is_613_[i_612_] = i_665_ - i_664_ | i_664_ - (i_664_ >>> 8);
							} else if (i_614_ == 3) {
								int i_667_ = anIntArray6682[i_611_];
								int i_668_ = Class_l_Sub1.anInt5221;
								int i_669_ = i_667_ + i_668_;
								int i_670_ = ((i_667_ & 0xff00ff) + (i_668_ & 0xff00ff));
								int i_671_ = ((i_670_ & 0x1000100) + (i_669_ - i_670_ & 0x10000));
								i_667_ = i_669_ - i_671_ | i_671_ - (i_671_ >>> 8);
								i_671_ = is_613_[i_612_];
								i_669_ = i_667_ + i_671_;
								i_670_ = (i_667_ & 0xff00ff) + (i_671_ & 0xff00ff);
								i_671_ = (i_670_ & 0x1000100) + (i_669_ - i_670_ & 0x10000);
								is_613_[i_612_] = i_669_ - i_671_ | i_671_ - (i_671_ >>> 8);
							} else if (i_614_ == 2) {
								int i_672_ = anIntArray6682[i_611_];
								int i_673_ = (((i_672_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_674_ = (((i_672_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_672_ = (((i_673_ | i_674_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_675_ = is_613_[i_612_];
								int i_676_ = i_672_ + i_675_;
								int i_677_ = ((i_672_ & 0xff00ff) + (i_675_ & 0xff00ff));
								i_675_ = (i_677_ & 0x1000100) + (i_676_ - i_677_ & 0x10000);
								is_613_[i_612_] = i_676_ - i_675_ | i_675_ - (i_675_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_607_ += Class_l_Sub1.anInt5214;
						i_608_ += Class_l_Sub1.anInt5226;
					}
					i_605_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			} else {
				int i_678_ = Class_l_Sub1.anInt5202;
				while (i_678_ < 0) {
					int i_679_ = Class_l_Sub1.anInt5217;
					int i_680_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
					int i_681_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
					int i_682_ = Class_l_Sub1.anInt5212;
					int i_683_;
					if ((i_683_ = i_680_ - (((Class_l_Sub1) this).anInt5230 << 12)) >= 0) {
						i_683_ = ((Class_l_Sub1.anInt5214 - i_683_) / Class_l_Sub1.anInt5214);
						i_682_ += i_683_;
						i_680_ += Class_l_Sub1.anInt5214 * i_683_;
						i_681_ += Class_l_Sub1.anInt5226 * i_683_;
						i_679_ += i_683_;
					}
					if ((i_683_ = ((i_680_ - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214)) > i_682_)
						i_682_ = i_683_;
					if (i_681_ < 0) {
						i_683_ = ((Class_l_Sub1.anInt5226 - 1 - i_681_) / Class_l_Sub1.anInt5226);
						i_682_ += i_683_;
						i_680_ += Class_l_Sub1.anInt5214 * i_683_;
						i_681_ += Class_l_Sub1.anInt5226 * i_683_;
						i_679_ += i_683_;
					}
					if ((i_683_ = (1 + i_681_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_682_)
						i_682_ = i_683_;
					for (/**/; i_682_ < 0; i_682_++) {
						int i_684_ = ((i_681_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_680_ >> 12));
						int i_685_ = i_679_++;
						int[] is_686_ = is;
						int i_687_ = i;
						int i_688_ = i_312_;
						if (i_688_ == 0) {
							if (i_687_ == 1)
								is_686_[i_685_] = anIntArray6682[i_684_];
							else if (i_687_ == 0) {
								int i_689_ = anIntArray6682[i_684_++];
								int i_690_ = (((i_689_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_691_ = (((i_689_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_692_ = ((i_689_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_686_[i_685_] = (i_690_ | i_691_ | i_692_) >>> 8;
							} else if (i_687_ == 3) {
								int i_693_ = anIntArray6682[i_684_++];
								int i_694_ = Class_l_Sub1.anInt5221;
								int i_695_ = i_693_ + i_694_;
								int i_696_ = ((i_693_ & 0xff00ff) + (i_694_ & 0xff00ff));
								int i_697_ = ((i_696_ & 0x1000100) + (i_695_ - i_696_ & 0x10000));
								is_686_[i_685_] = i_695_ - i_697_ | i_697_ - (i_697_ >>> 8);
							} else if (i_687_ == 2) {
								int i_698_ = anIntArray6682[i_684_];
								int i_699_ = (((i_698_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_700_ = (((i_698_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_686_[i_685_] = (((i_699_ | i_700_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_688_ == 1) {
							if (i_687_ == 1) {
								int i_701_ = anIntArray6682[i_684_];
								int i_702_ = i_701_ >>> 24;
								int i_703_ = 256 - i_702_;
								int i_704_ = is_686_[i_685_];
								is_686_[i_685_] = ((((i_701_ & 0xff00ff) * i_702_ + (i_704_ & 0xff00ff) * i_703_) & ~0xff00ff) + (((i_701_ & 0xff00) * i_702_ + (i_704_ & 0xff00) * i_703_) & 0xff0000)) >> 8;
							} else if (i_687_ == 0) {
								int i_705_ = anIntArray6682[i_684_];
								int i_706_ = ((i_705_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_707_ = 256 - i_706_;
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_708_ = is_686_[i_685_];
									is_686_[i_685_] = ((((i_705_ & 0xff00ff) * i_706_ + (i_708_ & 0xff00ff) * i_707_) & ~0xff00ff) + (((i_705_ & 0xff00) * i_706_ + (i_708_ & 0xff00) * i_707_) & 0xff0000)) >> 8;
								} else if (i_706_ != 255) {
									int i_709_ = (((i_705_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_710_ = (((i_705_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_711_ = (((i_705_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_705_ = (i_709_ | i_710_ | i_711_) >>> 8;
									int i_712_ = is_686_[i_685_];
									is_686_[i_685_] = ((((i_705_ & 0xff00ff) * i_706_ + (i_712_ & 0xff00ff) * i_707_) & ~0xff00ff) + (((i_705_ & 0xff00) * i_706_ + (i_712_ & 0xff00) * i_707_) & 0xff0000)) >> 8;
								} else {
									int i_713_ = (((i_705_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_714_ = (((i_705_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_715_ = (((i_705_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_686_[i_685_] = (i_713_ | i_714_ | i_715_) >>> 8;
								}
							} else if (i_687_ == 3) {
								int i_716_ = anIntArray6682[i_684_];
								int i_717_ = Class_l_Sub1.anInt5221;
								int i_718_ = i_716_ + i_717_;
								int i_719_ = ((i_716_ & 0xff00ff) + (i_717_ & 0xff00ff));
								int i_720_ = ((i_719_ & 0x1000100) + (i_718_ - i_719_ & 0x10000));
								i_720_ = i_718_ - i_720_ | i_720_ - (i_720_ >>> 8);
								int i_721_ = ((i_720_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_722_ = 256 - i_721_;
								if (i_721_ != 255) {
									i_716_ = i_720_;
									i_720_ = is_686_[i_685_];
									i_720_ = ((((i_716_ & 0xff00ff) * i_721_ + (i_720_ & 0xff00ff) * i_722_) & ~0xff00ff) + (((i_716_ & 0xff00) * i_721_ + (i_720_ & 0xff00) * i_722_) & 0xff0000)) >> 8;
								}
								is_686_[i_685_] = i_720_;
							} else if (i_687_ == 2) {
								int i_723_ = anIntArray6682[i_684_];
								int i_724_ = i_723_ >>> 24;
								int i_725_ = 256 - i_724_;
								int i_726_ = (((i_723_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_727_ = (((i_723_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_723_ = (((i_726_ | i_727_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_728_ = is_686_[i_685_];
								is_686_[i_685_] = ((((i_723_ & 0xff00ff) * i_724_ + (i_728_ & 0xff00ff) * i_725_) & ~0xff00ff) + (((i_723_ & 0xff00) * i_724_ + (i_728_ & 0xff00) * i_725_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_688_ == 2) {
							if (i_687_ == 1) {
								int i_729_ = anIntArray6682[i_684_];
								int i_730_ = is_686_[i_685_];
								int i_731_ = i_729_ + i_730_;
								int i_732_ = ((i_729_ & 0xff00ff) + (i_730_ & 0xff00ff));
								i_730_ = (i_732_ & 0x1000100) + (i_731_ - i_732_ & 0x10000);
								is_686_[i_685_] = i_731_ - i_730_ | i_730_ - (i_730_ >>> 8);
							} else if (i_687_ == 0) {
								int i_733_ = anIntArray6682[i_684_];
								int i_734_ = (((i_733_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_735_ = (((i_733_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_736_ = ((i_733_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_733_ = (i_734_ | i_735_ | i_736_) >>> 8;
								int i_737_ = is_686_[i_685_];
								int i_738_ = i_733_ + i_737_;
								int i_739_ = ((i_733_ & 0xff00ff) + (i_737_ & 0xff00ff));
								i_737_ = (i_739_ & 0x1000100) + (i_738_ - i_739_ & 0x10000);
								is_686_[i_685_] = i_738_ - i_737_ | i_737_ - (i_737_ >>> 8);
							} else if (i_687_ == 3) {
								int i_740_ = anIntArray6682[i_684_];
								int i_741_ = Class_l_Sub1.anInt5221;
								int i_742_ = i_740_ + i_741_;
								int i_743_ = ((i_740_ & 0xff00ff) + (i_741_ & 0xff00ff));
								int i_744_ = ((i_743_ & 0x1000100) + (i_742_ - i_743_ & 0x10000));
								i_740_ = i_742_ - i_744_ | i_744_ - (i_744_ >>> 8);
								i_744_ = is_686_[i_685_];
								i_742_ = i_740_ + i_744_;
								i_743_ = (i_740_ & 0xff00ff) + (i_744_ & 0xff00ff);
								i_744_ = (i_743_ & 0x1000100) + (i_742_ - i_743_ & 0x10000);
								is_686_[i_685_] = i_742_ - i_744_ | i_744_ - (i_744_ >>> 8);
							} else if (i_687_ == 2) {
								int i_745_ = anIntArray6682[i_684_];
								int i_746_ = (((i_745_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_747_ = (((i_745_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_745_ = (((i_746_ | i_747_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_748_ = is_686_[i_685_];
								int i_749_ = i_745_ + i_748_;
								int i_750_ = ((i_745_ & 0xff00ff) + (i_748_ & 0xff00ff));
								i_748_ = (i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000);
								is_686_[i_685_] = i_749_ - i_748_ | i_748_ - (i_748_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_680_ += Class_l_Sub1.anInt5214;
						i_681_ += Class_l_Sub1.anInt5226;
					}
					i_678_++;
					Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
					Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
					Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
				}
			}
		} else if (Class_l_Sub1.anInt5226 == 0) {
			int i_751_ = Class_l_Sub1.anInt5202;
			while (i_751_ < 0) {
				int i_752_ = Class_l_Sub1.anInt5217;
				int i_753_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_754_ = Class_l_Sub1.anInt5207;
				int i_755_ = Class_l_Sub1.anInt5212;
				if (i_754_ >= 0 && i_754_ - (((Class_l_Sub1) this).anInt5205 << 12) < 0) {
					if (i_753_ < 0) {
						int i_756_ = ((Class_l_Sub1.anInt5214 - 1 - i_753_) / Class_l_Sub1.anInt5214);
						i_755_ += i_756_;
						i_753_ += Class_l_Sub1.anInt5214 * i_756_;
						i_752_ += i_756_;
					}
					int i_757_;
					if ((i_757_ = (1 + i_753_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_755_)
						i_755_ = i_757_;
					for (/**/; i_755_ < 0; i_755_++) {
						int i_758_ = ((i_754_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_753_ >> 12));
						int i_759_ = i_752_++;
						int[] is_760_ = is;
						int i_761_ = i;
						int i_762_ = i_312_;
						if (i_762_ == 0) {
							if (i_761_ == 1)
								is_760_[i_759_] = anIntArray6682[i_758_];
							else if (i_761_ == 0) {
								int i_763_ = anIntArray6682[i_758_++];
								int i_764_ = (((i_763_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_765_ = (((i_763_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_766_ = ((i_763_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_760_[i_759_] = (i_764_ | i_765_ | i_766_) >>> 8;
							} else if (i_761_ == 3) {
								int i_767_ = anIntArray6682[i_758_++];
								int i_768_ = Class_l_Sub1.anInt5221;
								int i_769_ = i_767_ + i_768_;
								int i_770_ = ((i_767_ & 0xff00ff) + (i_768_ & 0xff00ff));
								int i_771_ = ((i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000));
								is_760_[i_759_] = i_769_ - i_771_ | i_771_ - (i_771_ >>> 8);
							} else if (i_761_ == 2) {
								int i_772_ = anIntArray6682[i_758_];
								int i_773_ = (((i_772_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_774_ = (((i_772_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								is_760_[i_759_] = (((i_773_ | i_774_) >>> 8) + Class_l_Sub1.anInt5213);
							} else
								throw new IllegalArgumentException();
						} else if (i_762_ == 1) {
							if (i_761_ == 1) {
								int i_775_ = anIntArray6682[i_758_];
								int i_776_ = i_775_ >>> 24;
								int i_777_ = 256 - i_776_;
								int i_778_ = is_760_[i_759_];
								is_760_[i_759_] = ((((i_775_ & 0xff00ff) * i_776_ + (i_778_ & 0xff00ff) * i_777_) & ~0xff00ff) + (((i_775_ & 0xff00) * i_776_ + (i_778_ & 0xff00) * i_777_) & 0xff0000)) >> 8;
							} else if (i_761_ == 0) {
								int i_779_ = anIntArray6682[i_758_];
								int i_780_ = ((i_779_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_781_ = 256 - i_780_;
								if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
									int i_782_ = is_760_[i_759_];
									is_760_[i_759_] = ((((i_779_ & 0xff00ff) * i_780_ + (i_782_ & 0xff00ff) * i_781_) & ~0xff00ff) + (((i_779_ & 0xff00) * i_780_ + (i_782_ & 0xff00) * i_781_) & 0xff0000)) >> 8;
								} else if (i_780_ != 255) {
									int i_783_ = (((i_779_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_784_ = (((i_779_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_785_ = (((i_779_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									i_779_ = (i_783_ | i_784_ | i_785_) >>> 8;
									int i_786_ = is_760_[i_759_];
									is_760_[i_759_] = ((((i_779_ & 0xff00ff) * i_780_ + (i_786_ & 0xff00ff) * i_781_) & ~0xff00ff) + (((i_779_ & 0xff00) * i_780_ + (i_786_ & 0xff00) * i_781_) & 0xff0000)) >> 8;
								} else {
									int i_787_ = (((i_779_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
									int i_788_ = (((i_779_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
									int i_789_ = (((i_779_ & 0xff) * Class_l_Sub1.anInt5219) & 0xff00);
									is_760_[i_759_] = (i_787_ | i_788_ | i_789_) >>> 8;
								}
							} else if (i_761_ == 3) {
								int i_790_ = anIntArray6682[i_758_];
								int i_791_ = Class_l_Sub1.anInt5221;
								int i_792_ = i_790_ + i_791_;
								int i_793_ = ((i_790_ & 0xff00ff) + (i_791_ & 0xff00ff));
								int i_794_ = ((i_793_ & 0x1000100) + (i_792_ - i_793_ & 0x10000));
								i_794_ = i_792_ - i_794_ | i_794_ - (i_794_ >>> 8);
								int i_795_ = ((i_794_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
								int i_796_ = 256 - i_795_;
								if (i_795_ != 255) {
									i_790_ = i_794_;
									i_794_ = is_760_[i_759_];
									i_794_ = ((((i_790_ & 0xff00ff) * i_795_ + (i_794_ & 0xff00ff) * i_796_) & ~0xff00ff) + (((i_790_ & 0xff00) * i_795_ + (i_794_ & 0xff00) * i_796_) & 0xff0000)) >> 8;
								}
								is_760_[i_759_] = i_794_;
							} else if (i_761_ == 2) {
								int i_797_ = anIntArray6682[i_758_];
								int i_798_ = i_797_ >>> 24;
								int i_799_ = 256 - i_798_;
								int i_800_ = (((i_797_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_801_ = (((i_797_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_797_ = (((i_800_ | i_801_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_802_ = is_760_[i_759_];
								is_760_[i_759_] = ((((i_797_ & 0xff00ff) * i_798_ + (i_802_ & 0xff00ff) * i_799_) & ~0xff00ff) + (((i_797_ & 0xff00) * i_798_ + (i_802_ & 0xff00) * i_799_) & 0xff0000)) >> 8;
							} else
								throw new IllegalArgumentException();
						} else if (i_762_ == 2) {
							if (i_761_ == 1) {
								int i_803_ = anIntArray6682[i_758_];
								int i_804_ = is_760_[i_759_];
								int i_805_ = i_803_ + i_804_;
								int i_806_ = ((i_803_ & 0xff00ff) + (i_804_ & 0xff00ff));
								i_804_ = (i_806_ & 0x1000100) + (i_805_ - i_806_ & 0x10000);
								is_760_[i_759_] = i_805_ - i_804_ | i_804_ - (i_804_ >>> 8);
							} else if (i_761_ == 0) {
								int i_807_ = anIntArray6682[i_758_];
								int i_808_ = (((i_807_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_809_ = (((i_807_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_810_ = ((i_807_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_807_ = (i_808_ | i_809_ | i_810_) >>> 8;
								int i_811_ = is_760_[i_759_];
								int i_812_ = i_807_ + i_811_;
								int i_813_ = ((i_807_ & 0xff00ff) + (i_811_ & 0xff00ff));
								i_811_ = (i_813_ & 0x1000100) + (i_812_ - i_813_ & 0x10000);
								is_760_[i_759_] = i_812_ - i_811_ | i_811_ - (i_811_ >>> 8);
							} else if (i_761_ == 3) {
								int i_814_ = anIntArray6682[i_758_];
								int i_815_ = Class_l_Sub1.anInt5221;
								int i_816_ = i_814_ + i_815_;
								int i_817_ = ((i_814_ & 0xff00ff) + (i_815_ & 0xff00ff));
								int i_818_ = ((i_817_ & 0x1000100) + (i_816_ - i_817_ & 0x10000));
								i_814_ = i_816_ - i_818_ | i_818_ - (i_818_ >>> 8);
								i_818_ = is_760_[i_759_];
								i_816_ = i_814_ + i_818_;
								i_817_ = (i_814_ & 0xff00ff) + (i_818_ & 0xff00ff);
								i_818_ = (i_817_ & 0x1000100) + (i_816_ - i_817_ & 0x10000);
								is_760_[i_759_] = i_816_ - i_818_ | i_818_ - (i_818_ >>> 8);
							} else if (i_761_ == 2) {
								int i_819_ = anIntArray6682[i_758_];
								int i_820_ = (((i_819_ & 0xff00ff) * Class_l_Sub1.anInt5223) & ~0xff00ff);
								int i_821_ = (((i_819_ & 0xff00) * Class_l_Sub1.anInt5223) & 0xff0000);
								i_819_ = (((i_820_ | i_821_) >>> 8) + Class_l_Sub1.anInt5213);
								int i_822_ = is_760_[i_759_];
								int i_823_ = i_819_ + i_822_;
								int i_824_ = ((i_819_ & 0xff00ff) + (i_822_ & 0xff00ff));
								i_822_ = (i_824_ & 0x1000100) + (i_823_ - i_824_ & 0x10000);
								is_760_[i_759_] = i_823_ - i_822_ | i_822_ - (i_822_ >>> 8);
							}
						} else
							throw new IllegalArgumentException();
						i_753_ += Class_l_Sub1.anInt5214;
					}
				}
				i_751_++;
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else if (Class_l_Sub1.anInt5226 < 0) {
			for (int i_825_ = Class_l_Sub1.anInt5202; i_825_ < 0; i_825_++) {
				int i_826_ = Class_l_Sub1.anInt5217;
				int i_827_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_828_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_829_ = Class_l_Sub1.anInt5212;
				if (i_827_ < 0) {
					int i_830_ = ((Class_l_Sub1.anInt5214 - 1 - i_827_) / Class_l_Sub1.anInt5214);
					i_829_ += i_830_;
					i_827_ += Class_l_Sub1.anInt5214 * i_830_;
					i_828_ += Class_l_Sub1.anInt5226 * i_830_;
					i_826_ += i_830_;
				}
				int i_831_;
				if ((i_831_ = (1 + i_827_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_829_)
					i_829_ = i_831_;
				if ((i_831_ = i_828_ - (((Class_l_Sub1) this).anInt5205 << 12)) >= 0) {
					i_831_ = ((Class_l_Sub1.anInt5226 - i_831_) / Class_l_Sub1.anInt5226);
					i_829_ += i_831_;
					i_827_ += Class_l_Sub1.anInt5214 * i_831_;
					i_828_ += Class_l_Sub1.anInt5226 * i_831_;
					i_826_ += i_831_;
				}
				if ((i_831_ = ((i_828_ - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226)) > i_829_)
					i_829_ = i_831_;
				for (/**/; i_829_ < 0; i_829_++) {
					int i_832_ = ((i_828_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_827_ >> 12));
					int i_833_ = i_826_++;
					int[] is_834_ = is;
					int i_835_ = i;
					int i_836_ = i_312_;
					if (i_836_ == 0) {
						if (i_835_ == 1)
							is_834_[i_833_] = anIntArray6682[i_832_];
						else if (i_835_ == 0) {
							int i_837_ = anIntArray6682[i_832_++];
							int i_838_ = ((i_837_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_839_ = ((i_837_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_840_ = ((i_837_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_834_[i_833_] = (i_838_ | i_839_ | i_840_) >>> 8;
						} else if (i_835_ == 3) {
							int i_841_ = anIntArray6682[i_832_++];
							int i_842_ = Class_l_Sub1.anInt5221;
							int i_843_ = i_841_ + i_842_;
							int i_844_ = (i_841_ & 0xff00ff) + (i_842_ & 0xff00ff);
							int i_845_ = ((i_844_ & 0x1000100) + (i_843_ - i_844_ & 0x10000));
							is_834_[i_833_] = i_843_ - i_845_ | i_845_ - (i_845_ >>> 8);
						} else if (i_835_ == 2) {
							int i_846_ = anIntArray6682[i_832_];
							int i_847_ = ((i_846_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_848_ = ((i_846_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_834_[i_833_] = (((i_847_ | i_848_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_836_ == 1) {
						if (i_835_ == 1) {
							int i_849_ = anIntArray6682[i_832_];
							int i_850_ = i_849_ >>> 24;
							int i_851_ = 256 - i_850_;
							int i_852_ = is_834_[i_833_];
							is_834_[i_833_] = ((((i_849_ & 0xff00ff) * i_850_ + (i_852_ & 0xff00ff) * i_851_) & ~0xff00ff) + (((i_849_ & 0xff00) * i_850_ + (i_852_ & 0xff00) * i_851_) & 0xff0000)) >> 8;
						} else if (i_835_ == 0) {
							int i_853_ = anIntArray6682[i_832_];
							int i_854_ = ((i_853_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
							int i_855_ = 256 - i_854_;
							if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
								int i_856_ = is_834_[i_833_];
								is_834_[i_833_] = ((((i_853_ & 0xff00ff) * i_854_ + (i_856_ & 0xff00ff) * i_855_) & ~0xff00ff) + (((i_853_ & 0xff00) * i_854_ + (i_856_ & 0xff00) * i_855_) & 0xff0000)) >> 8;
							} else if (i_854_ != 255) {
								int i_857_ = (((i_853_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_858_ = (((i_853_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_859_ = ((i_853_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_853_ = (i_857_ | i_858_ | i_859_) >>> 8;
								int i_860_ = is_834_[i_833_];
								is_834_[i_833_] = ((((i_853_ & 0xff00ff) * i_854_ + (i_860_ & 0xff00ff) * i_855_) & ~0xff00ff) + (((i_853_ & 0xff00) * i_854_ + (i_860_ & 0xff00) * i_855_) & 0xff0000)) >> 8;
							} else {
								int i_861_ = (((i_853_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_862_ = (((i_853_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_863_ = ((i_853_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_834_[i_833_] = (i_861_ | i_862_ | i_863_) >>> 8;
							}
						} else if (i_835_ == 3) {
							int i_864_ = anIntArray6682[i_832_];
							int i_865_ = Class_l_Sub1.anInt5221;
							int i_866_ = i_864_ + i_865_;
							int i_867_ = (i_864_ & 0xff00ff) + (i_865_ & 0xff00ff);
							int i_868_ = ((i_867_ & 0x1000100) + (i_866_ - i_867_ & 0x10000));
							i_868_ = i_866_ - i_868_ | i_868_ - (i_868_ >>> 8);
							int i_869_ = ((i_868_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
							int i_870_ = 256 - i_869_;
							if (i_869_ != 255) {
								i_864_ = i_868_;
								i_868_ = is_834_[i_833_];
								i_868_ = ((((i_864_ & 0xff00ff) * i_869_ + (i_868_ & 0xff00ff) * i_870_) & ~0xff00ff) + (((i_864_ & 0xff00) * i_869_ + (i_868_ & 0xff00) * i_870_) & 0xff0000)) >> 8;
							}
							is_834_[i_833_] = i_868_;
						} else if (i_835_ == 2) {
							int i_871_ = anIntArray6682[i_832_];
							int i_872_ = i_871_ >>> 24;
							int i_873_ = 256 - i_872_;
							int i_874_ = ((i_871_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_875_ = ((i_871_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							i_871_ = (((i_874_ | i_875_) >>> 8) + Class_l_Sub1.anInt5213);
							int i_876_ = is_834_[i_833_];
							is_834_[i_833_] = ((((i_871_ & 0xff00ff) * i_872_ + (i_876_ & 0xff00ff) * i_873_) & ~0xff00ff) + (((i_871_ & 0xff00) * i_872_ + (i_876_ & 0xff00) * i_873_) & 0xff0000)) >> 8;
						} else
							throw new IllegalArgumentException();
					} else if (i_836_ == 2) {
						if (i_835_ == 1) {
							int i_877_ = anIntArray6682[i_832_];
							int i_878_ = is_834_[i_833_];
							int i_879_ = i_877_ + i_878_;
							int i_880_ = (i_877_ & 0xff00ff) + (i_878_ & 0xff00ff);
							i_878_ = (i_880_ & 0x1000100) + (i_879_ - i_880_ & 0x10000);
							is_834_[i_833_] = i_879_ - i_878_ | i_878_ - (i_878_ >>> 8);
						} else if (i_835_ == 0) {
							int i_881_ = anIntArray6682[i_832_];
							int i_882_ = ((i_881_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_883_ = ((i_881_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_884_ = ((i_881_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							i_881_ = (i_882_ | i_883_ | i_884_) >>> 8;
							int i_885_ = is_834_[i_833_];
							int i_886_ = i_881_ + i_885_;
							int i_887_ = (i_881_ & 0xff00ff) + (i_885_ & 0xff00ff);
							i_885_ = (i_887_ & 0x1000100) + (i_886_ - i_887_ & 0x10000);
							is_834_[i_833_] = i_886_ - i_885_ | i_885_ - (i_885_ >>> 8);
						} else if (i_835_ == 3) {
							int i_888_ = anIntArray6682[i_832_];
							int i_889_ = Class_l_Sub1.anInt5221;
							int i_890_ = i_888_ + i_889_;
							int i_891_ = (i_888_ & 0xff00ff) + (i_889_ & 0xff00ff);
							int i_892_ = ((i_891_ & 0x1000100) + (i_890_ - i_891_ & 0x10000));
							i_888_ = i_890_ - i_892_ | i_892_ - (i_892_ >>> 8);
							i_892_ = is_834_[i_833_];
							i_890_ = i_888_ + i_892_;
							i_891_ = (i_888_ & 0xff00ff) + (i_892_ & 0xff00ff);
							i_892_ = (i_891_ & 0x1000100) + (i_890_ - i_891_ & 0x10000);
							is_834_[i_833_] = i_890_ - i_892_ | i_892_ - (i_892_ >>> 8);
						} else if (i_835_ == 2) {
							int i_893_ = anIntArray6682[i_832_];
							int i_894_ = ((i_893_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_895_ = ((i_893_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							i_893_ = (((i_894_ | i_895_) >>> 8) + Class_l_Sub1.anInt5213);
							int i_896_ = is_834_[i_833_];
							int i_897_ = i_893_ + i_896_;
							int i_898_ = (i_893_ & 0xff00ff) + (i_896_ & 0xff00ff);
							i_896_ = (i_898_ & 0x1000100) + (i_897_ - i_898_ & 0x10000);
							is_834_[i_833_] = i_897_ - i_896_ | i_896_ - (i_896_ >>> 8);
						}
					} else
						throw new IllegalArgumentException();
					i_827_ += Class_l_Sub1.anInt5214;
					i_828_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		} else {
			for (int i_899_ = Class_l_Sub1.anInt5202; i_899_ < 0; i_899_++) {
				int i_900_ = Class_l_Sub1.anInt5217;
				int i_901_ = Class_l_Sub1.anInt5206 + Class_l_Sub1.anInt5204;
				int i_902_ = Class_l_Sub1.anInt5207 + Class_l_Sub1.anInt5203;
				int i_903_ = Class_l_Sub1.anInt5212;
				if (i_901_ < 0) {
					int i_904_ = ((Class_l_Sub1.anInt5214 - 1 - i_901_) / Class_l_Sub1.anInt5214);
					i_903_ += i_904_;
					i_901_ += Class_l_Sub1.anInt5214 * i_904_;
					i_902_ += Class_l_Sub1.anInt5226 * i_904_;
					i_900_ += i_904_;
				}
				int i_905_;
				if ((i_905_ = (1 + i_901_ - (((Class_l_Sub1) this).anInt5230 << 12) - Class_l_Sub1.anInt5214) / Class_l_Sub1.anInt5214) > i_903_)
					i_903_ = i_905_;
				if (i_902_ < 0) {
					i_905_ = ((Class_l_Sub1.anInt5226 - 1 - i_902_) / Class_l_Sub1.anInt5226);
					i_903_ += i_905_;
					i_901_ += Class_l_Sub1.anInt5214 * i_905_;
					i_902_ += Class_l_Sub1.anInt5226 * i_905_;
					i_900_ += i_905_;
				}
				if ((i_905_ = (1 + i_902_ - (((Class_l_Sub1) this).anInt5205 << 12) - Class_l_Sub1.anInt5226) / Class_l_Sub1.anInt5226) > i_903_)
					i_903_ = i_905_;
				for (/**/; i_903_ < 0; i_903_++) {
					int i_906_ = ((i_902_ >> 12) * ((Class_l_Sub1) this).anInt5230 + (i_901_ >> 12));
					int i_907_ = i_900_++;
					int[] is_908_ = is;
					int i_909_ = i;
					int i_910_ = i_312_;
					if (i_910_ == 0) {
						if (i_909_ == 1)
							is_908_[i_907_] = anIntArray6682[i_906_];
						else if (i_909_ == 0) {
							int i_911_ = anIntArray6682[i_906_++];
							int i_912_ = ((i_911_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_913_ = ((i_911_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_914_ = ((i_911_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							is_908_[i_907_] = (i_912_ | i_913_ | i_914_) >>> 8;
						} else if (i_909_ == 3) {
							int i_915_ = anIntArray6682[i_906_++];
							int i_916_ = Class_l_Sub1.anInt5221;
							int i_917_ = i_915_ + i_916_;
							int i_918_ = (i_915_ & 0xff00ff) + (i_916_ & 0xff00ff);
							int i_919_ = ((i_918_ & 0x1000100) + (i_917_ - i_918_ & 0x10000));
							is_908_[i_907_] = i_917_ - i_919_ | i_919_ - (i_919_ >>> 8);
						} else if (i_909_ == 2) {
							int i_920_ = anIntArray6682[i_906_];
							int i_921_ = ((i_920_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_922_ = ((i_920_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							is_908_[i_907_] = (((i_921_ | i_922_) >>> 8) + Class_l_Sub1.anInt5213);
						} else
							throw new IllegalArgumentException();
					} else if (i_910_ == 1) {
						if (i_909_ == 1) {
							int i_923_ = anIntArray6682[i_906_];
							int i_924_ = i_923_ >>> 24;
							int i_925_ = 256 - i_924_;
							int i_926_ = is_908_[i_907_];
							is_908_[i_907_] = ((((i_923_ & 0xff00ff) * i_924_ + (i_926_ & 0xff00ff) * i_925_) & ~0xff00ff) + (((i_923_ & 0xff00) * i_924_ + (i_926_ & 0xff00) * i_925_) & 0xff0000)) >> 8;
						} else if (i_909_ == 0) {
							int i_927_ = anIntArray6682[i_906_];
							int i_928_ = ((i_927_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
							int i_929_ = 256 - i_928_;
							if ((Class_l_Sub1.anInt5221 & 0xffffff) == 16777215) {
								int i_930_ = is_908_[i_907_];
								is_908_[i_907_] = ((((i_927_ & 0xff00ff) * i_928_ + (i_930_ & 0xff00ff) * i_929_) & ~0xff00ff) + (((i_927_ & 0xff00) * i_928_ + (i_930_ & 0xff00) * i_929_) & 0xff0000)) >> 8;
							} else if (i_928_ != 255) {
								int i_931_ = (((i_927_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_932_ = (((i_927_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_933_ = ((i_927_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								i_927_ = (i_931_ | i_932_ | i_933_) >>> 8;
								int i_934_ = is_908_[i_907_];
								is_908_[i_907_] = ((((i_927_ & 0xff00ff) * i_928_ + (i_934_ & 0xff00ff) * i_929_) & ~0xff00ff) + (((i_927_ & 0xff00) * i_928_ + (i_934_ & 0xff00) * i_929_) & 0xff0000)) >> 8;
							} else {
								int i_935_ = (((i_927_ & 0xff0000) * Class_l_Sub1.anInt5227) & ~0xffffff);
								int i_936_ = (((i_927_ & 0xff00) * Class_l_Sub1.anInt5229) & 0xff0000);
								int i_937_ = ((i_927_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
								is_908_[i_907_] = (i_935_ | i_936_ | i_937_) >>> 8;
							}
						} else if (i_909_ == 3) {
							int i_938_ = anIntArray6682[i_906_];
							int i_939_ = Class_l_Sub1.anInt5221;
							int i_940_ = i_938_ + i_939_;
							int i_941_ = (i_938_ & 0xff00ff) + (i_939_ & 0xff00ff);
							int i_942_ = ((i_941_ & 0x1000100) + (i_940_ - i_941_ & 0x10000));
							i_942_ = i_940_ - i_942_ | i_942_ - (i_942_ >>> 8);
							int i_943_ = ((i_942_ >>> 24) * Class_l_Sub1.anInt5223 >> 8);
							int i_944_ = 256 - i_943_;
							if (i_943_ != 255) {
								i_938_ = i_942_;
								i_942_ = is_908_[i_907_];
								i_942_ = ((((i_938_ & 0xff00ff) * i_943_ + (i_942_ & 0xff00ff) * i_944_) & ~0xff00ff) + (((i_938_ & 0xff00) * i_943_ + (i_942_ & 0xff00) * i_944_) & 0xff0000)) >> 8;
							}
							is_908_[i_907_] = i_942_;
						} else if (i_909_ == 2) {
							int i_945_ = anIntArray6682[i_906_];
							int i_946_ = i_945_ >>> 24;
							int i_947_ = 256 - i_946_;
							int i_948_ = ((i_945_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_949_ = ((i_945_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							i_945_ = (((i_948_ | i_949_) >>> 8) + Class_l_Sub1.anInt5213);
							int i_950_ = is_908_[i_907_];
							is_908_[i_907_] = ((((i_945_ & 0xff00ff) * i_946_ + (i_950_ & 0xff00ff) * i_947_) & ~0xff00ff) + (((i_945_ & 0xff00) * i_946_ + (i_950_ & 0xff00) * i_947_) & 0xff0000)) >> 8;
						} else
							throw new IllegalArgumentException();
					} else if (i_910_ == 2) {
						if (i_909_ == 1) {
							int i_951_ = anIntArray6682[i_906_];
							int i_952_ = is_908_[i_907_];
							int i_953_ = i_951_ + i_952_;
							int i_954_ = (i_951_ & 0xff00ff) + (i_952_ & 0xff00ff);
							i_952_ = (i_954_ & 0x1000100) + (i_953_ - i_954_ & 0x10000);
							is_908_[i_907_] = i_953_ - i_952_ | i_952_ - (i_952_ >>> 8);
						} else if (i_909_ == 0) {
							int i_955_ = anIntArray6682[i_906_];
							int i_956_ = ((i_955_ & 0xff0000) * Class_l_Sub1.anInt5227 & ~0xffffff);
							int i_957_ = ((i_955_ & 0xff00) * Class_l_Sub1.anInt5229 & 0xff0000);
							int i_958_ = ((i_955_ & 0xff) * Class_l_Sub1.anInt5219 & 0xff00);
							i_955_ = (i_956_ | i_957_ | i_958_) >>> 8;
							int i_959_ = is_908_[i_907_];
							int i_960_ = i_955_ + i_959_;
							int i_961_ = (i_955_ & 0xff00ff) + (i_959_ & 0xff00ff);
							i_959_ = (i_961_ & 0x1000100) + (i_960_ - i_961_ & 0x10000);
							is_908_[i_907_] = i_960_ - i_959_ | i_959_ - (i_959_ >>> 8);
						} else if (i_909_ == 3) {
							int i_962_ = anIntArray6682[i_906_];
							int i_963_ = Class_l_Sub1.anInt5221;
							int i_964_ = i_962_ + i_963_;
							int i_965_ = (i_962_ & 0xff00ff) + (i_963_ & 0xff00ff);
							int i_966_ = ((i_965_ & 0x1000100) + (i_964_ - i_965_ & 0x10000));
							i_962_ = i_964_ - i_966_ | i_966_ - (i_966_ >>> 8);
							i_966_ = is_908_[i_907_];
							i_964_ = i_962_ + i_966_;
							i_965_ = (i_962_ & 0xff00ff) + (i_966_ & 0xff00ff);
							i_966_ = (i_965_ & 0x1000100) + (i_964_ - i_965_ & 0x10000);
							is_908_[i_907_] = i_964_ - i_966_ | i_966_ - (i_966_ >>> 8);
						} else if (i_909_ == 2) {
							int i_967_ = anIntArray6682[i_906_];
							int i_968_ = ((i_967_ & 0xff00ff) * Class_l_Sub1.anInt5223 & ~0xff00ff);
							int i_969_ = ((i_967_ & 0xff00) * Class_l_Sub1.anInt5223 & 0xff0000);
							i_967_ = (((i_968_ | i_969_) >>> 8) + Class_l_Sub1.anInt5213);
							int i_970_ = is_908_[i_907_];
							int i_971_ = i_967_ + i_970_;
							int i_972_ = (i_967_ & 0xff00ff) + (i_970_ & 0xff00ff);
							i_970_ = (i_972_ & 0x1000100) + (i_971_ - i_972_ & 0x10000);
							is_908_[i_907_] = i_971_ - i_970_ | i_970_ - (i_970_ >>> 8);
						}
					} else
						throw new IllegalArgumentException();
					i_901_ += Class_l_Sub1.anInt5214;
					i_902_ += Class_l_Sub1.anInt5226;
				}
				Class_l_Sub1.anInt5206 += Class_l_Sub1.anInt5231;
				Class_l_Sub1.anInt5207 += Class_l_Sub1.anInt5211;
				Class_l_Sub1.anInt5217 += Class_l_Sub1.anInt5215;
			}
		}
	}

	final void s(int i, int i_973_, int i_974_, int i_975_, int i_976_, int i_977_, int i_978_) {
		if (((Class_l_Sub1) this).aClass260_Sub1_5232.method1799())
			throw new IllegalStateException();
		if (i_974_ > 0 && i_975_ > 0) {
			int i_979_ = 0;
			int i_980_ = 0;
			int i_981_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_nb);
			int i_982_ = (((Class_l_Sub1) this).anInt5218 + ((Class_l_Sub1) this).anInt5230 + ((Class_l_Sub1) this).anInt5216);
			int i_983_ = (((Class_l_Sub1) this).anInt5209 + ((Class_l_Sub1) this).anInt5205 + ((Class_l_Sub1) this).anInt5224);
			int i_984_ = (i_982_ << 16) / i_974_;
			int i_985_ = (i_983_ << 16) / i_975_;
			if (((Class_l_Sub1) this).anInt5218 > 0) {
				int i_986_ = (((((Class_l_Sub1) this).anInt5218 << 16) + i_984_ - 1) / i_984_);
				i += i_986_;
				i_979_ += i_986_ * i_984_ - (((Class_l_Sub1) this).anInt5218 << 16);
			}
			if (((Class_l_Sub1) this).anInt5209 > 0) {
				int i_987_ = (((((Class_l_Sub1) this).anInt5209 << 16) + i_985_ - 1) / i_985_);
				i_973_ += i_987_;
				i_980_ += i_987_ * i_985_ - (((Class_l_Sub1) this).anInt5209 << 16);
			}
			if (((Class_l_Sub1) this).anInt5230 < i_982_)
				i_974_ = ((((Class_l_Sub1) this).anInt5230 << 16) - i_979_ + i_984_ - 1) / i_984_;
			if (((Class_l_Sub1) this).anInt5205 < i_983_)
				i_975_ = ((((Class_l_Sub1) this).anInt5205 << 16) - i_980_ + i_985_ - 1) / i_985_;
			int i_988_ = i + i_973_ * i_981_;
			int i_989_ = i_981_ - i_974_;
			if (i_973_ + i_975_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3856))
				i_975_ -= i_973_ + i_975_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3856;
			if (i_973_ < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb)) {
				int i_990_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_eb - i_973_);
				i_975_ -= i_990_;
				i_988_ += i_990_ * i_981_;
				i_980_ += i_985_ * i_990_;
			}
			if (i + i_974_ > (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anInt3832)) {
				int i_991_ = (i + i_974_ - ((Class260_Sub1) (((Class_l_Sub1) this).aClass260_Sub1_5232)).anInt3832);
				i_974_ -= i_991_;
				i_989_ += i_991_;
			}
			if (i < (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb)) {
				int i_992_ = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).f_lb - i);
				i_974_ -= i_992_;
				i_988_ += i_992_;
				i_979_ += i_984_ * i_992_;
				i_989_ += i_992_;
			}
			int[] is = (((Class260_Sub1) ((Class_l_Sub1) this).aClass260_Sub1_5232).anIntArray3834);
			if (i_978_ == 0) {
				if (i_976_ == 1) {
					int i_993_ = i_979_;
					for (int i_994_ = -i_975_; i_994_ < 0; i_994_++) {
						int i_995_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_996_ = -i_974_; i_996_ < 0; i_996_++) {
							is[i_988_++] = anIntArray6682[(i_979_ >> 16) + i_995_];
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_993_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 0) {
					int i_997_ = (i_977_ & 0xff0000) >> 16;
					int i_998_ = (i_977_ & 0xff00) >> 8;
					int i_999_ = i_977_ & 0xff;
					int i_1000_ = i_979_;
					for (int i_1001_ = -i_975_; i_1001_ < 0; i_1001_++) {
						int i_1002_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1003_ = -i_974_; i_1003_ < 0; i_1003_++) {
							int i_1004_ = anIntArray6682[(i_979_ >> 16) + i_1002_];
							int i_1005_ = (i_1004_ & 0xff0000) * i_997_ & ~0xffffff;
							int i_1006_ = (i_1004_ & 0xff00) * i_998_ & 0xff0000;
							int i_1007_ = (i_1004_ & 0xff) * i_999_ & 0xff00;
							is[i_988_++] = (i_1005_ | i_1006_ | i_1007_) >>> 8;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1000_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 3) {
					int i_1008_ = i_979_;
					for (int i_1009_ = -i_975_; i_1009_ < 0; i_1009_++) {
						int i_1010_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1011_ = -i_974_; i_1011_ < 0; i_1011_++) {
							int i_1012_ = anIntArray6682[(i_979_ >> 16) + i_1010_];
							int i_1013_ = i_1012_ + i_977_;
							int i_1014_ = (i_1012_ & 0xff00ff) + (i_977_ & 0xff00ff);
							int i_1015_ = ((i_1014_ & 0x1000100) + (i_1013_ - i_1014_ & 0x10000));
							is[i_988_++] = i_1013_ - i_1015_ | i_1015_ - (i_1015_ >>> 8);
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1008_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 2) {
					int i_1016_ = i_977_ >>> 24;
					int i_1017_ = 256 - i_1016_;
					int i_1018_ = (i_977_ & 0xff00ff) * i_1017_ & ~0xff00ff;
					int i_1019_ = (i_977_ & 0xff00) * i_1017_ & 0xff0000;
					i_977_ = (i_1018_ | i_1019_) >>> 8;
					int i_1020_ = i_979_;
					for (int i_1021_ = -i_975_; i_1021_ < 0; i_1021_++) {
						int i_1022_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1023_ = -i_974_; i_1023_ < 0; i_1023_++) {
							int i_1024_ = anIntArray6682[(i_979_ >> 16) + i_1022_];
							i_1018_ = (i_1024_ & 0xff00ff) * i_1016_ & ~0xff00ff;
							i_1019_ = (i_1024_ & 0xff00) * i_1016_ & 0xff0000;
							is[i_988_++] = ((i_1018_ | i_1019_) >>> 8) + i_977_;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1020_;
						i_988_ += i_989_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_978_ == 1) {
				if (i_976_ == 1) {
					int i_1025_ = i_979_;
					for (int i_1026_ = -i_975_; i_1026_ < 0; i_1026_++) {
						int i_1027_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1028_ = -i_974_; i_1028_ < 0; i_1028_++) {
							int i_1029_ = anIntArray6682[(i_979_ >> 16) + i_1027_];
							int i_1030_ = i_1029_ >>> 24;
							int i_1031_ = 256 - i_1030_;
							int i_1032_ = is[i_988_];
							is[i_988_++] = ((((i_1029_ & 0xff00ff) * i_1030_ + (i_1032_ & 0xff00ff) * i_1031_) & ~0xff00ff) + (((i_1029_ & 0xff00) * i_1030_ + (i_1032_ & 0xff00) * i_1031_) & 0xff0000)) >> 8;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1025_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 0) {
					int i_1033_ = i_979_;
					if ((i_977_ & 0xffffff) == 16777215) {
						for (int i_1034_ = -i_975_; i_1034_ < 0; i_1034_++) {
							int i_1035_ = ((i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_1036_ = -i_974_; i_1036_ < 0; i_1036_++) {
								int i_1037_ = anIntArray6682[(i_979_ >> 16) + i_1035_];
								int i_1038_ = (i_1037_ >>> 24) * (i_977_ >>> 24) >> 8;
								int i_1039_ = 256 - i_1038_;
								int i_1040_ = is[i_988_];
								is[i_988_++] = ((((i_1037_ & 0xff00ff) * i_1038_ + (i_1040_ & 0xff00ff) * i_1039_) & ~0xff00ff) + (((i_1037_ & 0xff00) * i_1038_ + (i_1040_ & 0xff00) * i_1039_) & 0xff0000)) >> 8;
								i_979_ += i_984_;
							}
							i_980_ += i_985_;
							i_979_ = i_1033_;
							i_988_ += i_989_;
						}
					} else {
						int i_1041_ = (i_977_ & 0xff0000) >> 16;
						int i_1042_ = (i_977_ & 0xff00) >> 8;
						int i_1043_ = i_977_ & 0xff;
						for (int i_1044_ = -i_975_; i_1044_ < 0; i_1044_++) {
							int i_1045_ = ((i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230);
							for (int i_1046_ = -i_974_; i_1046_ < 0; i_1046_++) {
								int i_1047_ = anIntArray6682[(i_979_ >> 16) + i_1045_];
								int i_1048_ = (i_1047_ >>> 24) * (i_977_ >>> 24) >> 8;
								int i_1049_ = 256 - i_1048_;
								if (i_1048_ != 255) {
									int i_1050_ = ((i_1047_ & 0xff0000) * i_1041_ & ~0xffffff);
									int i_1051_ = ((i_1047_ & 0xff00) * i_1042_ & 0xff0000);
									int i_1052_ = (i_1047_ & 0xff) * i_1043_ & 0xff00;
									i_1047_ = (i_1050_ | i_1051_ | i_1052_) >>> 8;
									int i_1053_ = is[i_988_];
									is[i_988_++] = ((((i_1047_ & 0xff00ff) * i_1048_ + (i_1053_ & 0xff00ff) * i_1049_) & ~0xff00ff) + (((i_1047_ & 0xff00) * i_1048_ + (i_1053_ & 0xff00) * i_1049_) & 0xff0000)) >> 8;
								} else {
									int i_1054_ = ((i_1047_ & 0xff0000) * i_1041_ & ~0xffffff);
									int i_1055_ = ((i_1047_ & 0xff00) * i_1042_ & 0xff0000);
									int i_1056_ = (i_1047_ & 0xff) * i_1043_ & 0xff00;
									is[i_988_++] = (i_1054_ | i_1055_ | i_1056_) >>> 8;
								}
								i_979_ += i_984_;
							}
							i_980_ += i_985_;
							i_979_ = i_1033_;
							i_988_ += i_989_;
						}
						return;
					}
					return;
				}
				if (i_976_ == 3) {
					int i_1057_ = i_979_;
					for (int i_1058_ = -i_975_; i_1058_ < 0; i_1058_++) {
						int i_1059_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1060_ = -i_974_; i_1060_ < 0; i_1060_++) {
							int i_1061_ = anIntArray6682[(i_979_ >> 16) + i_1059_];
							int i_1062_ = i_1061_ + i_977_;
							int i_1063_ = (i_1061_ & 0xff00ff) + (i_977_ & 0xff00ff);
							int i_1064_ = ((i_1063_ & 0x1000100) + (i_1062_ - i_1063_ & 0x10000));
							i_1064_ = i_1062_ - i_1064_ | i_1064_ - (i_1064_ >>> 8);
							int i_1065_ = (i_1064_ >>> 24) * (i_977_ >>> 24) >> 8;
							int i_1066_ = 256 - i_1065_;
							if (i_1065_ != 255) {
								i_1061_ = i_1064_;
								i_1064_ = is[i_988_];
								i_1064_ = ((((i_1061_ & 0xff00ff) * i_1065_ + (i_1064_ & 0xff00ff) * i_1066_) & ~0xff00ff) + (((i_1061_ & 0xff00) * i_1065_ + (i_1064_ & 0xff00) * i_1066_) & 0xff0000)) >> 8;
							}
							is[i_988_++] = i_1064_;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1057_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 2) {
					int i_1067_ = i_977_ >>> 24;
					int i_1068_ = 256 - i_1067_;
					int i_1069_ = (i_977_ & 0xff00ff) * i_1068_ & ~0xff00ff;
					int i_1070_ = (i_977_ & 0xff00) * i_1068_ & 0xff0000;
					i_977_ = (i_1069_ | i_1070_) >>> 8;
					int i_1071_ = i_979_;
					for (int i_1072_ = -i_975_; i_1072_ < 0; i_1072_++) {
						int i_1073_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1074_ = -i_974_; i_1074_ < 0; i_1074_++) {
							int i_1075_ = anIntArray6682[(i_979_ >> 16) + i_1073_];
							int i_1076_ = i_1075_ >>> 24;
							int i_1077_ = 256 - i_1076_;
							i_1069_ = (i_1075_ & 0xff00ff) * i_1067_ & ~0xff00ff;
							i_1070_ = (i_1075_ & 0xff00) * i_1067_ & 0xff0000;
							i_1075_ = ((i_1069_ | i_1070_) >>> 8) + i_977_;
							int i_1078_ = is[i_988_];
							is[i_988_++] = ((((i_1075_ & 0xff00ff) * i_1076_ + (i_1078_ & 0xff00ff) * i_1077_) & ~0xff00ff) + (((i_1075_ & 0xff00) * i_1076_ + (i_1078_ & 0xff00) * i_1077_) & 0xff0000)) >> 8;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1071_;
						i_988_ += i_989_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_978_ == 2) {
				if (i_976_ == 1) {
					int i_1079_ = i_979_;
					for (int i_1080_ = -i_975_; i_1080_ < 0; i_1080_++) {
						int i_1081_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1082_ = -i_974_; i_1082_ < 0; i_1082_++) {
							int i_1083_ = anIntArray6682[(i_979_ >> 16) + i_1081_];
							if (i_1083_ != 0) {
								int i_1084_ = is[i_988_];
								int i_1085_ = i_1083_ + i_1084_;
								int i_1086_ = ((i_1083_ & 0xff00ff) + (i_1084_ & 0xff00ff));
								i_1084_ = ((i_1086_ & 0x1000100) + (i_1085_ - i_1086_ & 0x10000));
								is[i_988_++] = i_1085_ - i_1084_ | i_1084_ - (i_1084_ >>> 8);
							} else
								i_988_++;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1079_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 0) {
					int i_1087_ = i_979_;
					int i_1088_ = (i_977_ & 0xff0000) >> 16;
					int i_1089_ = (i_977_ & 0xff00) >> 8;
					int i_1090_ = i_977_ & 0xff;
					for (int i_1091_ = -i_975_; i_1091_ < 0; i_1091_++) {
						int i_1092_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1093_ = -i_974_; i_1093_ < 0; i_1093_++) {
							int i_1094_ = anIntArray6682[(i_979_ >> 16) + i_1092_];
							if (i_1094_ != 0) {
								int i_1095_ = ((i_1094_ & 0xff0000) * i_1088_ & ~0xffffff);
								int i_1096_ = (i_1094_ & 0xff00) * i_1089_ & 0xff0000;
								int i_1097_ = (i_1094_ & 0xff) * i_1090_ & 0xff00;
								i_1094_ = (i_1095_ | i_1096_ | i_1097_) >>> 8;
								int i_1098_ = is[i_988_];
								int i_1099_ = i_1094_ + i_1098_;
								int i_1100_ = ((i_1094_ & 0xff00ff) + (i_1098_ & 0xff00ff));
								i_1098_ = ((i_1100_ & 0x1000100) + (i_1099_ - i_1100_ & 0x10000));
								is[i_988_++] = i_1099_ - i_1098_ | i_1098_ - (i_1098_ >>> 8);
							} else
								i_988_++;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1087_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 3) {
					int i_1101_ = i_979_;
					for (int i_1102_ = -i_975_; i_1102_ < 0; i_1102_++) {
						int i_1103_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1104_ = -i_974_; i_1104_ < 0; i_1104_++) {
							int i_1105_ = anIntArray6682[(i_979_ >> 16) + i_1103_];
							int i_1106_ = i_1105_ + i_977_;
							int i_1107_ = (i_1105_ & 0xff00ff) + (i_977_ & 0xff00ff);
							int i_1108_ = ((i_1107_ & 0x1000100) + (i_1106_ - i_1107_ & 0x10000));
							i_1105_ = i_1106_ - i_1108_ | i_1108_ - (i_1108_ >>> 8);
							i_1108_ = is[i_988_];
							i_1106_ = i_1105_ + i_1108_;
							i_1107_ = (i_1105_ & 0xff00ff) + (i_1108_ & 0xff00ff);
							i_1108_ = (i_1107_ & 0x1000100) + (i_1106_ - i_1107_ & 0x10000);
							is[i_988_++] = i_1106_ - i_1108_ | i_1108_ - (i_1108_ >>> 8);
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1101_;
						i_988_ += i_989_;
					}
					return;
				}
				if (i_976_ == 2) {
					int i_1109_ = i_977_ >>> 24;
					int i_1110_ = 256 - i_1109_;
					int i_1111_ = (i_977_ & 0xff00ff) * i_1110_ & ~0xff00ff;
					int i_1112_ = (i_977_ & 0xff00) * i_1110_ & 0xff0000;
					i_977_ = (i_1111_ | i_1112_) >>> 8;
					int i_1113_ = i_979_;
					for (int i_1114_ = -i_975_; i_1114_ < 0; i_1114_++) {
						int i_1115_ = (i_980_ >> 16) * ((Class_l_Sub1) this).anInt5230;
						for (int i_1116_ = -i_974_; i_1116_ < 0; i_1116_++) {
							int i_1117_ = anIntArray6682[(i_979_ >> 16) + i_1115_];
							if (i_1117_ != 0) {
								i_1111_ = ((i_1117_ & 0xff00ff) * i_1109_ & ~0xff00ff);
								i_1112_ = (i_1117_ & 0xff00) * i_1109_ & 0xff0000;
								i_1117_ = ((i_1111_ | i_1112_) >>> 8) + i_977_;
								int i_1118_ = is[i_988_];
								int i_1119_ = i_1117_ + i_1118_;
								int i_1120_ = ((i_1117_ & 0xff00ff) + (i_1118_ & 0xff00ff));
								i_1118_ = ((i_1120_ & 0x1000100) + (i_1119_ - i_1120_ & 0x10000));
								is[i_988_++] = i_1119_ - i_1118_ | i_1118_ - (i_1118_ >>> 8);
							} else
								i_988_++;
							i_979_ += i_984_;
						}
						i_980_ += i_985_;
						i_979_ = i_1113_;
						i_988_ += i_989_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
}
