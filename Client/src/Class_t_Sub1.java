
/* Class_t_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

import java.awt.Color;
import java.util.Date;

final class Class_t_Sub1 extends Class_t {
	private int anInt4574;
	private float[] aFloatArray4575;
	private short[] aShortArray4576;
	static int anInt4577;
	static int anInt4578;
	private int[][] anIntArrayArray4579;
	static int anInt4580;
	private short[] aShortArray4581;
	private short[] aShortArray4582;
	static int anInt4583;
	static int anInt4584;
	private int[][] anIntArrayArray4585;
	private int[] anIntArray4586;
	private Class160 aClass160_4587;
	private short[] aShortArray4588;
	private short[] aShortArray4589;
	private short aShort4590;
	static int anInt4591;
	static int anInt4592;
	static int anInt4593;
	private Class218 aClass218_4594;
	private short[] aShortArray4595;
	private Class160 aClass160_4596;
	static int anInt4597;
	static int anInt4598;
	static int anInt4599;
	static int anInt4600;
	static int anInt4601;
	private short[] aShortArray4602;
	static int anInt4603;
	static int anInt4604;
	private short aShort4605;
	private boolean aBool4606 = false;
	static int anInt4607;
	static int anInt4608;
	private int[] anIntArray4609;
	static int anInt4610;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	private short f_eb;
	static int f_fb;
	static int f_gb;
	private short[] f_hb;
	static int f_ib;
	private Class69[] f_jb;
	static int f_kb;
	private short f_lb;
	static int f_mb;
	static int f_nb;
	static int f_ob;
	static int f_pb;
	private byte f_qb;
	static int f_rb;
	private boolean f_sb;
	private short[] f_tb;
	private Class122 f_ub;
	static int f_vb;
	static int f_wb;
	static int anInt4611;
	private int anInt4612;
	private short[] aShortArray4613;
	private short aShort4614;
	static int anInt4615;
	private int anInt4616;
	private int anInt4617;
	static int anInt4618;
	private float[] aFloatArray4619;
	private byte[] aByteArray4620;
	private int anInt4621;
	private short aShort4622;
	static int anInt4623;
	static int anInt4624;
	static int anInt4625;
	private Class160 aClass160_4626;
	private Class162[] aClass162Array4627;
	private short aShort4628;
	private Class19[] aClass19Array4629;
	private int[] anIntArray4630;
	private byte[] aByteArray4631;
	static int anInt4632;
	static int anInt4633;
	static int anInt4634;
	static int anInt4635;
	private Class260_Sub2 aClass260_Sub2_4636;
	static int anInt4637;
	private short aShort4638;
	private int anInt4639;
	private int[][] f_ac;
	private Class_j[] f_bc;
	private Class160 f_cc;
	static int f_dc;
	static int f_ec;
	private short[] f_fc;
	private int[] anIntArray4640;
	static int f_hc;
	private int f_ic;
	private Interface1 f_jc;
	private int f_kc;
	static Class67 f_lc = new Class67("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");
	static int f_mc;
	static int f_nc;
	static int f_oc;
	private int[] f_pc;
	static int f_qc;
	static int f_rc;
	static int f_sc;
	private short f_tc;
	static int f_uc;
	static int[] f_vc;
	private Interface10 f_wc;
	static Color[] aColorArray4641 = { new Color(16777215), new Color(16777215) };

	final void XA(int i, int[] is, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		try {
			f_rb++;
			int i_4_ = is.length;
			if ((i ^ 0xffffffff) == -1) {
				i_1_ <<= 4;
				i_2_ <<= 4;
				i_0_ <<= 4;
				int i_5_ = 0;
				Class246_Sub28_Sub18.anInt6515 = 0;
				Class109_Sub2.anInt3815 = 0;
				Class98.anInt1275 = 0;
				for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
					int i_7_ = is[i_6_];
					if (f_ac.length > i_7_) {
						int[] is_8_ = f_ac[i_7_];
						for (int i_9_ = 0; is_8_.length > i_9_; i_9_++) {
							int i_10_ = is_8_[i_9_];
							Class109_Sub2.anInt3815 += anIntArray4586[i_10_];
							Class98.anInt1275 += f_pc[i_10_];
							Class246_Sub28_Sub18.anInt6515 += anIntArray4609[i_10_];
							i_5_++;
						}
					}
				}
				if ((i_5_ ^ 0xffffffff) < -1) {
					Class246_Sub28_Sub18.anInt6515 = Class246_Sub28_Sub18.anInt6515 / i_5_ + i_2_;
					Class109_Sub2.anInt3815 = i_0_ + Class109_Sub2.anInt3815 / i_5_;
					Class98.anInt1275 = Class98.anInt1275 / i_5_ - -i_1_;
				} else {
					Class246_Sub28_Sub18.anInt6515 = i_2_;
					Class98.anInt1275 = i_1_;
					Class109_Sub2.anInt3815 = i_0_;
				}
			} else if (i == 1) {
				i_0_ <<= 4;
				i_1_ <<= 4;
				i_2_ <<= 4;
				for (int i_11_ = 0; (i_4_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
					int i_12_ = is[i_11_];
					if ((i_12_ ^ 0xffffffff) > (f_ac.length ^ 0xffffffff)) {
						int[] is_13_ = f_ac[i_12_];
						for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (is_13_.length ^ 0xffffffff)); i_14_++) {
							int i_15_ = is_13_[i_14_];
							anIntArray4586[i_15_] += i_0_;
							f_pc[i_15_] += i_1_;
							anIntArray4609[i_15_] += i_2_;
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -3) {
				for (int i_16_ = 0; i_16_ < i_4_; i_16_++) {
					int i_17_ = is[i_16_];
					if ((f_ac.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
						int[] is_18_ = f_ac[i_17_];
						if ((i_3_ & 0x1) != 0) {
							for (int i_19_ = 0; i_19_ < is_18_.length; i_19_++) {
								int i_20_ = is_18_[i_19_];
								anIntArray4586[i_20_] -= Class109_Sub2.anInt3815;
								f_pc[i_20_] -= Class98.anInt1275;
								anIntArray4609[i_20_] -= Class246_Sub28_Sub18.anInt6515;
								if (i_0_ != 0) {
									int i_21_ = Class39_Sub1.f_fb[i_0_];
									int i_22_ = Class39_Sub1.anIntArray4672[i_0_];
									int i_23_ = (32767 + (-(i_21_ * anIntArray4609[i_20_]) + i_22_ * f_pc[i_20_]) >> 15);
									anIntArray4609[i_20_] = ((i_22_ * anIntArray4609[i_20_] + (i_21_ * f_pc[i_20_] + 32767)) >> 15);
									f_pc[i_20_] = i_23_;
								}
								if (i_2_ != 0) {
									int i_24_ = Class39_Sub1.f_fb[i_2_];
									int i_25_ = Class39_Sub1.anIntArray4672[i_2_];
									int i_26_ = ((i_24_ * f_pc[i_20_] - (-(anIntArray4586[i_20_] * i_25_) - 32767)) >> 15);
									f_pc[i_20_] = (i_25_ * f_pc[i_20_] + (-(i_24_ * anIntArray4586[i_20_]) + 32767)) >> 15;
									anIntArray4586[i_20_] = i_26_;
								}
								if (i_1_ != 0) {
									int i_27_ = Class39_Sub1.f_fb[i_1_];
									int i_28_ = Class39_Sub1.anIntArray4672[i_1_];
									int i_29_ = ((anIntArray4586[i_20_] * i_28_ + anIntArray4609[i_20_] * i_27_ + 32767) >> 15);
									anIntArray4609[i_20_] = ((32767 + i_28_ * anIntArray4609[i_20_] + -(anIntArray4586[i_20_] * i_27_)) >> 15);
									anIntArray4586[i_20_] = i_29_;
								}
								anIntArray4586[i_20_] += Class109_Sub2.anInt3815;
								f_pc[i_20_] += Class98.anInt1275;
								anIntArray4609[i_20_] += Class246_Sub28_Sub18.anInt6515;
							}
						} else {
							for (int i_30_ = 0; ((is_18_.length ^ 0xffffffff) < (i_30_ ^ 0xffffffff)); i_30_++) {
								int i_31_ = is_18_[i_30_];
								anIntArray4586[i_31_] -= Class109_Sub2.anInt3815;
								f_pc[i_31_] -= Class98.anInt1275;
								anIntArray4609[i_31_] -= Class246_Sub28_Sub18.anInt6515;
								if ((i_2_ ^ 0xffffffff) != -1) {
									int i_32_ = Class39_Sub1.f_fb[i_2_];
									int i_33_ = Class39_Sub1.anIntArray4672[i_2_];
									int i_34_ = ((32767 + i_33_ * anIntArray4586[i_31_] + f_pc[i_31_] * i_32_) >> 15);
									f_pc[i_31_] = (f_pc[i_31_] * i_33_ - i_32_ * anIntArray4586[i_31_] + 32767) >> 15;
									anIntArray4586[i_31_] = i_34_;
								}
								if ((i_0_ ^ 0xffffffff) != -1) {
									int i_35_ = Class39_Sub1.f_fb[i_0_];
									int i_36_ = Class39_Sub1.anIntArray4672[i_0_];
									int i_37_ = ((-(i_35_ * anIntArray4609[i_31_]) + (f_pc[i_31_] * i_36_ + 32767)) >> 15);
									anIntArray4609[i_31_] = ((anIntArray4609[i_31_] * i_36_ + f_pc[i_31_] * i_35_ + 32767) >> 15);
									f_pc[i_31_] = i_37_;
								}
								if ((i_1_ ^ 0xffffffff) != -1) {
									int i_38_ = Class39_Sub1.f_fb[i_1_];
									int i_39_ = Class39_Sub1.anIntArray4672[i_1_];
									int i_40_ = ((anIntArray4586[i_31_] * i_39_ + (i_38_ * anIntArray4609[i_31_] + 32767)) >> 15);
									anIntArray4609[i_31_] = (i_39_ * anIntArray4609[i_31_] + (-(anIntArray4586[i_31_] * i_38_) + 32767)) >> 15;
									anIntArray4586[i_31_] = i_40_;
								}
								anIntArray4586[i_31_] += Class109_Sub2.anInt3815;
								f_pc[i_31_] += Class98.anInt1275;
								anIntArray4609[i_31_] += Class246_Sub28_Sub18.anInt6515;
							}
						}
					}
				}
				if (bool) {
					for (int i_41_ = 0; i_41_ < i_4_; i_41_++) {
						int i_42_ = is[i_41_];
						if ((i_42_ ^ 0xffffffff) > (f_ac.length ^ 0xffffffff)) {
							int[] is_43_ = f_ac[i_42_];
							for (int i_44_ = 0; i_44_ < is_43_.length; i_44_++) {
								int i_45_ = is_43_[i_44_];
								int i_46_ = anIntArray4630[i_45_];
								int i_47_ = anIntArray4630[1 + i_45_];
								for (int i_48_ = i_46_; i_47_ > i_48_; i_48_++) {
									int i_49_ = -1 + f_fc[i_48_];
									if (i_49_ == -1)
										break;
									if ((i_2_ ^ 0xffffffff) != -1) {
										int i_50_ = Class39_Sub1.f_fb[i_2_];
										int i_51_ = (Class39_Sub1.anIntArray4672[i_2_]);
										int i_52_ = 32767 + (i_50_ * (aShortArray4582[i_49_]) - -(i_51_ * (aShortArray4589[i_49_]))) >> 15;
										aShortArray4582[i_49_] = (short) ((32767 + ((aShortArray4582[i_49_]) * i_51_ + -(i_50_ * (aShortArray4589[i_49_])))) >> 15);
										aShortArray4589[i_49_] = (short) i_52_;
									}
									if (i_0_ != 0) {
										int i_53_ = Class39_Sub1.f_fb[i_0_];
										int i_54_ = (Class39_Sub1.anIntArray4672[i_0_]);
										int i_55_ = ((aShortArray4582[i_49_] * i_54_ + -(i_53_ * aShortArray4588[i_49_]) + 32767) >> 15);
										aShortArray4588[i_49_] = (short) ((32767 + ((aShortArray4582[i_49_]) * i_53_ + ((aShortArray4588[i_49_]) * i_54_))) >> 15);
										aShortArray4582[i_49_] = (short) i_55_;
									}
									if (i_1_ != 0) {
										int i_56_ = Class39_Sub1.f_fb[i_1_];
										int i_57_ = (Class39_Sub1.anIntArray4672[i_1_]);
										int i_58_ = (i_56_ * aShortArray4588[i_49_] + aShortArray4589[i_49_] * i_57_ + 32767) >> 15;
										aShortArray4588[i_49_] = (short) ((32767 + (aShortArray4588[i_49_]) * i_57_ + -((aShortArray4589[i_49_]) * i_56_)) >> 15);
										aShortArray4589[i_49_] = (short) i_58_;
									}
								}
							}
						}
					}
					if (f_cc == null && aClass160_4596 != null)
						((Class160) aClass160_4596).anInterface10_2264 = null;
					if (f_cc != null)
						((Class160) f_cc).anInterface10_2264 = null;
				}
			} else if ((i ^ 0xffffffff) == -4) {
				for (int i_59_ = 0; i_4_ > i_59_; i_59_++) {
					int i_60_ = is[i_59_];
					if ((i_60_ ^ 0xffffffff) > (f_ac.length ^ 0xffffffff)) {
						int[] is_61_ = f_ac[i_60_];
						for (int i_62_ = 0; ((i_62_ ^ 0xffffffff) > (is_61_.length ^ 0xffffffff)); i_62_++) {
							int i_63_ = is_61_[i_62_];
							anIntArray4586[i_63_] -= Class109_Sub2.anInt3815;
							f_pc[i_63_] -= Class98.anInt1275;
							anIntArray4609[i_63_] -= Class246_Sub28_Sub18.anInt6515;
							anIntArray4586[i_63_] = i_0_ * anIntArray4586[i_63_] >> 7;
							f_pc[i_63_] = f_pc[i_63_] * i_1_ >> 7;
							anIntArray4609[i_63_] = anIntArray4609[i_63_] * i_2_ >> 7;
							anIntArray4586[i_63_] += Class109_Sub2.anInt3815;
							f_pc[i_63_] += Class98.anInt1275;
							anIntArray4609[i_63_] += Class246_Sub28_Sub18.anInt6515;
						}
					}
				}
			} else if (i == 5) {
				if (anIntArrayArray4585 != null) {
					for (int i_64_ = 0; i_4_ > i_64_; i_64_++) {
						int i_65_ = is[i_64_];
						if (i_65_ < anIntArrayArray4585.length) {
							int[] is_66_ = anIntArrayArray4585[i_65_];
							for (int i_67_ = 0; ((i_67_ ^ 0xffffffff) > (is_66_.length ^ 0xffffffff)); i_67_++) {
								int i_68_ = is_66_[i_67_];
								int i_69_ = (8 * i_0_ + (0xff & aByteArray4620[i_68_]));
								if (i_69_ < 0)
									i_69_ = 0;
								else if (i_69_ > 255)
									i_69_ = 255;
								aByteArray4620[i_68_] = (byte) i_69_;
							}
							if ((is_66_.length ^ 0xffffffff) < -1 && aClass160_4596 != null)
								((Class160) aClass160_4596).anInterface10_2264 = null;
						}
					}
					if (f_bc != null) {
						for (int i_70_ = 0; (f_ic ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
							Class_j class_j = f_bc[i_70_];
							Class69 class69 = f_jb[i_70_];
							((Class69) class69).anInt911 = (-((aByteArray4620[((Class_j) class_j).anInt1471]) & 0xff) + 255 << 24 | 0xffffff & ((Class69) class69).anInt911);
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				if (anIntArrayArray4585 != null) {
					for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_71_++) {
						int i_72_ = is[i_71_];
						if (i_72_ < anIntArrayArray4585.length) {
							int[] is_73_ = anIntArrayArray4585[i_72_];
							for (int i_74_ = 0; i_74_ < is_73_.length; i_74_++) {
								int i_75_ = is_73_[i_74_];
								int i_76_ = aShortArray4581[i_75_] & 0xffff;
								int i_77_ = (i_76_ & 0xfe1b) >> 10;
								int i_78_ = (0x3e5 & i_76_) >> 7;
								int i_79_ = i_76_ & 0x7f;
								i_78_ += i_1_ / 4;
								i_77_ = 0x3f & i_0_ + i_77_;
								i_79_ += i_2_;
								if ((i_78_ ^ 0xffffffff) <= -1) {
									if ((i_78_ ^ 0xffffffff) < -8)
										i_78_ = 7;
								} else
									i_78_ = 0;
								if (i_79_ < 0)
									i_79_ = 0;
								else if ((i_79_ ^ 0xffffffff) < -128)
									i_79_ = 127;
								aShortArray4581[i_75_] = (short) (Class236.method1523(Class236.method1523((i_77_ << 10), (i_78_ << 7)), i_79_));
							}
							if ((is_73_.length ^ 0xffffffff) < -1 && aClass160_4596 != null)
								((Class160) aClass160_4596).anInterface10_2264 = null;
						}
					}
					if (f_bc != null) {
						for (int i_80_ = 0; (i_80_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_80_++) {
							Class_j class_j = f_bc[i_80_];
							Class69 class69 = f_jb[i_80_];
							((Class69) class69).anInt911 = (((Class69) class69).anInt911 & ~0xffffff | 0xffffff & (Class40_Sub3.anIntArray4064[(aShortArray4581[(((Class_j) class_j).anInt1471)]) & 0xffff]));
						}
					}
				}
			} else if (i == 8) {
				if (anIntArrayArray4579 != null) {
					for (int i_81_ = 0; i_81_ < i_4_; i_81_++) {
						int i_82_ = is[i_81_];
						if ((i_82_ ^ 0xffffffff) > (anIntArrayArray4579.length ^ 0xffffffff)) {
							int[] is_83_ = anIntArrayArray4579[i_82_];
							for (int i_84_ = 0; ((is_83_.length ^ 0xffffffff) < (i_84_ ^ 0xffffffff)); i_84_++) {
								Class69 class69 = f_jb[is_83_[i_84_]];
								((Class69) class69).anInt917 += i_0_;
								((Class69) class69).anInt914 += i_1_;
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -11) {
				if (anIntArrayArray4579 != null) {
					for (int i_85_ = 0; (i_4_ ^ 0xffffffff) < (i_85_ ^ 0xffffffff); i_85_++) {
						int i_86_ = is[i_85_];
						if (i_86_ < anIntArrayArray4579.length) {
							int[] is_87_ = anIntArrayArray4579[i_86_];
							for (int i_88_ = 0; ((i_88_ ^ 0xffffffff) > (is_87_.length ^ 0xffffffff)); i_88_++) {
								Class69 class69 = f_jb[is_87_[i_88_]];
								((Class69) class69).anInt909 = i_0_ * ((Class69) class69).anInt909 >> 7;
								((Class69) class69).anInt916 = ((Class69) class69).anInt916 * i_1_ >> 7;
							}
						}
					}
				}
			} else if (i == 9) {
				if (anIntArrayArray4579 != null) {
					for (int i_89_ = 0; (i_4_ ^ 0xffffffff) < (i_89_ ^ 0xffffffff); i_89_++) {
						int i_90_ = is[i_89_];
						if (anIntArrayArray4579.length > i_90_) {
							int[] is_91_ = anIntArrayArray4579[i_90_];
							for (int i_92_ = 0; i_92_ < is_91_.length; i_92_++) {
								Class69 class69 = f_jb[is_91_[i_92_]];
								((Class69) class69).anInt913 = (i_0_ + ((Class69) class69).anInt913 & 0x3fff);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.XA(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ')'));
		}
	}

	final void N(int i, int i_93_, int i_94_, int i_95_) {
		try {
			anInt4584++;
			if (i == 0) {
				int i_96_ = 0;
				Class109_Sub2.anInt3815 = 0;
				Class98.anInt1275 = 0;
				Class246_Sub28_Sub18.anInt6515 = 0;
				for (int i_97_ = 0; (anInt4639 ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++) {
					Class109_Sub2.anInt3815 += anIntArray4586[i_97_];
					Class98.anInt1275 += f_pc[i_97_];
					i_96_++;
					Class246_Sub28_Sub18.anInt6515 += anIntArray4609[i_97_];
				}
				if ((i_96_ ^ 0xffffffff) < -1) {
					Class109_Sub2.anInt3815 = i_93_ + Class109_Sub2.anInt3815 / i_96_;
					Class98.anInt1275 = Class98.anInt1275 / i_96_ - -i_94_;
					Class246_Sub28_Sub18.anInt6515 = Class246_Sub28_Sub18.anInt6515 / i_96_ - -i_95_;
				} else {
					Class109_Sub2.anInt3815 = i_93_;
					Class98.anInt1275 = i_94_;
					Class246_Sub28_Sub18.anInt6515 = i_95_;
				}
			} else if ((i ^ 0xffffffff) == -2) {
				for (int i_98_ = 0; (anInt4639 ^ 0xffffffff) < (i_98_ ^ 0xffffffff); i_98_++) {
					anIntArray4586[i_98_] += i_93_;
					f_pc[i_98_] += i_94_;
					anIntArray4609[i_98_] += i_95_;
				}
			} else if ((i ^ 0xffffffff) == -3) {
				for (int i_99_ = 0; anInt4639 > i_99_; i_99_++) {
					anIntArray4586[i_99_] -= Class109_Sub2.anInt3815;
					f_pc[i_99_] -= Class98.anInt1275;
					anIntArray4609[i_99_] -= Class246_Sub28_Sub18.anInt6515;
					if ((i_95_ ^ 0xffffffff) != -1) {
						int i_100_ = Class39_Sub1.f_fb[i_95_];
						int i_101_ = Class39_Sub1.anIntArray4672[i_95_];
						int i_102_ = ((i_100_ * f_pc[i_99_] + i_101_ * anIntArray4586[i_99_] + 32767) >> 15);
						f_pc[i_99_] = (32767 + -(i_100_ * anIntArray4586[i_99_]) + f_pc[i_99_] * i_101_) >> 15;
						anIntArray4586[i_99_] = i_102_;
					}
					if (i_93_ != 0) {
						int i_103_ = Class39_Sub1.f_fb[i_93_];
						int i_104_ = Class39_Sub1.anIntArray4672[i_93_];
						int i_105_ = 32767 + (-(i_103_ * anIntArray4609[i_99_]) + i_104_ * f_pc[i_99_]) >> 15;
						anIntArray4609[i_99_] = (i_104_ * anIntArray4609[i_99_] + (f_pc[i_99_] * i_103_ + 32767)) >> 15;
						f_pc[i_99_] = i_105_;
					}
					if (i_94_ != 0) {
						int i_106_ = Class39_Sub1.f_fb[i_94_];
						int i_107_ = Class39_Sub1.anIntArray4672[i_94_];
						int i_108_ = ((anIntArray4609[i_99_] * i_106_ - -(anIntArray4586[i_99_] * i_107_) + 32767) >> 15);
						anIntArray4609[i_99_] = (32767 + anIntArray4609[i_99_] * i_107_ - i_106_ * anIntArray4586[i_99_]) >> 15;
						anIntArray4586[i_99_] = i_108_;
					}
					anIntArray4586[i_99_] += Class109_Sub2.anInt3815;
					f_pc[i_99_] += Class98.anInt1275;
					anIntArray4609[i_99_] += Class246_Sub28_Sub18.anInt6515;
				}
			} else if ((i ^ 0xffffffff) == -4) {
				for (int i_109_ = 0; i_109_ < anInt4639; i_109_++) {
					anIntArray4586[i_109_] -= Class109_Sub2.anInt3815;
					f_pc[i_109_] -= Class98.anInt1275;
					anIntArray4609[i_109_] -= Class246_Sub28_Sub18.anInt6515;
					anIntArray4586[i_109_] = anIntArray4586[i_109_] * i_93_ / 128;
					f_pc[i_109_] = i_94_ * f_pc[i_109_] / 128;
					anIntArray4609[i_109_] = anIntArray4609[i_109_] * i_95_ / 128;
					anIntArray4586[i_109_] += Class109_Sub2.anInt3815;
					f_pc[i_109_] += Class98.anInt1275;
					anIntArray4609[i_109_] += Class246_Sub28_Sub18.anInt6515;
				}
			} else if (i == 5) {
				for (int i_110_ = 0; (f_kc ^ 0xffffffff) < (i_110_ ^ 0xffffffff); i_110_++) {
					int i_111_ = (0xff & aByteArray4620[i_110_]) + 8 * i_93_;
					if (i_111_ >= 0) {
						if (i_111_ > 255)
							i_111_ = 255;
					} else
						i_111_ = 0;
					aByteArray4620[i_110_] = (byte) i_111_;
				}
				if (aClass160_4596 != null)
					((Class160) aClass160_4596).anInterface10_2264 = null;
				if (f_bc != null) {
					for (int i_112_ = 0; i_112_ < f_ic; i_112_++) {
						Class_j class_j = f_bc[i_112_];
						Class69 class69 = f_jb[i_112_];
						((Class69) class69).anInt911 = (0xffffff & ((Class69) class69).anInt911 | (-(0xff & aByteArray4620[(((Class_j) class_j).anInt1471)]) + 255 << 24));
					}
				}
			} else if ((i ^ 0xffffffff) == -8) {
				for (int i_113_ = 0; i_113_ < f_kc; i_113_++) {
					int i_114_ = 0xffff & aShortArray4581[i_113_];
					int i_115_ = (i_114_ & 0xfdf3) >> 10;
					int i_116_ = 0x7 & i_114_ >> 7;
					i_116_ += i_94_ / 4;
					int i_117_ = i_114_ & 0x7f;
					i_115_ = 0x3f & i_115_ - -i_93_;
					i_117_ += i_95_;
					if (i_116_ < 0)
						i_116_ = 0;
					else if (i_116_ > 7)
						i_116_ = 7;
					if ((i_117_ ^ 0xffffffff) > -1)
						i_117_ = 0;
					else if ((i_117_ ^ 0xffffffff) < -128)
						i_117_ = 127;
					aShortArray4581[i_113_] = (short) (Class236.method1523(Class236.method1523(i_115_ << 10, i_116_ << 7), i_117_));
				}
				if (aClass160_4596 != null)
					((Class160) aClass160_4596).anInterface10_2264 = null;
				if (f_bc != null) {
					for (int i_118_ = 0; f_ic > i_118_; i_118_++) {
						Class_j class_j = f_bc[i_118_];
						Class69 class69 = f_jb[i_118_];
						((Class69) class69).anInt911 = (0xffffff & (Class40_Sub3.anIntArray4064[((aShortArray4581[((Class_j) class_j).anInt1471]) & 0xffff)]) | ((Class69) class69).anInt911 & ~0xffffff);
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				for (int i_119_ = 0; (i_119_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_119_++) {
					Class69 class69 = f_jb[i_119_];
					((Class69) class69).anInt914 += i_94_;
					((Class69) class69).anInt917 += i_93_;
				}
			} else if ((i ^ 0xffffffff) == -11) {
				for (int i_120_ = 0; (i_120_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_120_++) {
					Class69 class69 = f_jb[i_120_];
					((Class69) class69).anInt916 = ((Class69) class69).anInt916 * i_94_ >> 7;
					((Class69) class69).anInt909 = ((Class69) class69).anInt909 * i_93_ >> 7;
				}
			} else if (i == 9) {
				for (int i_121_ = 0; (i_121_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_121_++) {
					Class69 class69 = f_jb[i_121_];
					((Class69) class69).anInt913 = ((Class69) class69).anInt913 - -i_93_ & 0x3fff;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.N(" + i + ',' + i_93_ + ',' + i_94_ + ',' + i_95_ + ')'));
		}
	}

	final void j() {
		try {
			for (int i = 0; i < anInt4617; i++) {
				anIntArray4586[i] = 7 + anIntArray4586[i] >> 4;
				f_pc[i] = f_pc[i] + 7 >> 4;
				anIntArray4609[i] = anIntArray4609[i] + 7 >> 4;
			}
			f_wb++;
			if (aClass160_4587 != null)
				((Class160) aClass160_4587).anInterface10_2264 = null;
			aBool4606 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.j(" + ')');
		}
	}

	final int PA() {
		try {
			if (!aBool4606)
				method2038(16383);
			f_cb++;
			return f_eb;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.PA(" + ')');
		}
	}

	final void UA(int i) {
		try {
			f_ob++;
			anInt4621 = i;
			f_sb = true;
			if (f_ub != null && (0x10000 & anInt4621) == 0) {
				aShortArray4582 = ((Class122) f_ub).aShortArray1682;
				aShortArray4588 = ((Class122) f_ub).aShortArray1689;
				aByteArray4631 = ((Class122) f_ub).aByteArray1683;
				aShortArray4589 = ((Class122) f_ub).aShortArray1687;
				f_ub = null;
			}
			method2041(-127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.UA(" + i + ')');
		}
	}

	final Class246_Sub1_Sub4 fa(Class246_Sub1_Sub4 class246_sub1_sub4) {
		try {
			anInt4598++;
			if (anInt4612 == 0)
				return null;
			if (!aBool4606)
				method2038(16383);
			int i;
			int i_122_;
			if ((((Class260_Sub2) aClass260_Sub2_4636).anInt4335 ^ 0xffffffff) < -1) {
				i = (-((aShort4614 * ((Class260_Sub2) aClass260_Sub2_4636).anInt4335) >> 8) + aShort4622 >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
				i_122_ = (-(f_lb * ((Class260_Sub2) aClass260_Sub2_4636).anInt4335 >> 8) + aShort4638 >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
			} else {
				i = (-(f_lb * ((Class260_Sub2) aClass260_Sub2_4636).anInt4335 >> 8) + aShort4622 >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
				i_122_ = (-((aShort4614 * ((Class260_Sub2) aClass260_Sub2_4636).anInt4335) >> 8) + aShort4638 >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
			}
			int i_123_;
			int i_124_;
			if (((Class260_Sub2) aClass260_Sub2_4636).anInt4369 <= 0) {
				i_123_ = (f_eb + -((((Class260_Sub2) aClass260_Sub2_4636).anInt4369) * f_lb >> 8) >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
				i_124_ = (aShort4590 + -((((Class260_Sub2) aClass260_Sub2_4636).anInt4369) * aShort4614 >> 8) >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
			} else {
				i_123_ = (-((((Class260_Sub2) aClass260_Sub2_4636).anInt4369 * aShort4614) >> 8) + f_eb >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
				i_124_ = (aShort4590 - (f_lb * ((Class260_Sub2) aClass260_Sub2_4636).anInt4369 >> 8) >> ((Class260_Sub2) aClass260_Sub2_4636).f_re);
			}
			int i_125_ = i_122_ - (i - 1);
			int i_126_ = i_124_ + (-i_123_ + 1);
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1 = (Class246_Sub1_Sub4_Sub1) class246_sub1_sub4;
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1_127_;
			if (class246_sub1_sub4_sub1 == null || !class246_sub1_sub4_sub1.method2892(22582, i_125_, i_126_))
				class246_sub1_sub4_sub1_127_ = new Class246_Sub1_Sub4_Sub1(aClass260_Sub2_4636, i_125_, i_126_);
			else {
				class246_sub1_sub4_sub1_127_ = class246_sub1_sub4_sub1;
				class246_sub1_sub4_sub1_127_.method2895(292993616);
			}
			class246_sub1_sub4_sub1_127_.method2890(i_123_, -57, i, i_122_, i_124_);
			method2034(class246_sub1_sub4_sub1_127_, -99);
			return class246_sub1_sub4_sub1_127_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.fa(" + (class246_sub1_sub4 != null ? "{...}" : "null") + ')');
		}
	}

	final void method682(Class_t class_t, int i, int i_128_, int i_129_, boolean bool) {
		try {
			f_fb++;
			Class_t_Sub1 class_t_sub1_130_ = (Class_t_Sub1) class_t;
			if (f_kc != 0 && class_t_sub1_130_.f_kc != 0) {
				int i_131_ = class_t_sub1_130_.anInt4639;
				int[] is = class_t_sub1_130_.anIntArray4586;
				int[] is_132_ = class_t_sub1_130_.f_pc;
				int[] is_133_ = class_t_sub1_130_.anIntArray4609;
				short[] is_134_ = class_t_sub1_130_.aShortArray4589;
				short[] is_135_ = class_t_sub1_130_.aShortArray4582;
				short[] is_136_ = class_t_sub1_130_.aShortArray4588;
				byte[] is_137_ = class_t_sub1_130_.aByteArray4631;
				short[] is_138_;
				byte[] is_139_;
				short[] is_140_;
				short[] is_141_;
				if (f_ub == null) {
					is_141_ = null;
					is_139_ = null;
					is_138_ = null;
					is_140_ = null;
				} else {
					is_138_ = ((Class122) f_ub).aShortArray1682;
					is_139_ = ((Class122) f_ub).aByteArray1683;
					is_140_ = ((Class122) f_ub).aShortArray1689;
					is_141_ = ((Class122) f_ub).aShortArray1687;
				}
				byte[] is_142_;
				short[] is_143_;
				short[] is_144_;
				short[] is_145_;
				if (class_t_sub1_130_.f_ub != null) {
					is_142_ = ((Class122) class_t_sub1_130_.f_ub).aByteArray1683;
					is_143_ = ((Class122) class_t_sub1_130_.f_ub).aShortArray1687;
					is_144_ = ((Class122) class_t_sub1_130_.f_ub).aShortArray1682;
					is_145_ = ((Class122) class_t_sub1_130_.f_ub).aShortArray1689;
				} else {
					is_142_ = null;
					is_143_ = null;
					is_144_ = null;
					is_145_ = null;
				}
				int[] is_146_ = class_t_sub1_130_.anIntArray4630;
				short[] is_147_ = class_t_sub1_130_.f_fc;
				if (!class_t_sub1_130_.aBool4606)
					class_t_sub1_130_.method2038(16383);
				int i_148_ = class_t_sub1_130_.f_lb;
				int i_149_ = class_t_sub1_130_.aShort4614;
				int i_150_ = class_t_sub1_130_.aShort4622;
				int i_151_ = class_t_sub1_130_.aShort4638;
				int i_152_ = class_t_sub1_130_.f_eb;
				int i_153_ = class_t_sub1_130_.aShort4590;
				for (int i_154_ = 0; (i_154_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff); i_154_++) {
					int i_155_ = f_pc[i_154_] + -i_128_;
					if ((i_148_ ^ 0xffffffff) >= (i_155_ ^ 0xffffffff) && (i_149_ ^ 0xffffffff) <= (i_155_ ^ 0xffffffff)) {
						int i_156_ = -i + anIntArray4586[i_154_];
						if (i_156_ >= i_150_ && i_156_ <= i_151_) {
							int i_157_ = anIntArray4609[i_154_] - i_129_;
							if ((i_157_ ^ 0xffffffff) <= (i_152_ ^ 0xffffffff) && (i_153_ ^ 0xffffffff) <= (i_157_ ^ 0xffffffff)) {
								int i_158_ = -1;
								int i_159_ = anIntArray4630[i_154_];
								int i_160_ = anIntArray4630[1 + i_154_];
								for (int i_161_ = i_159_; i_161_ < i_160_; i_161_++) {
									i_158_ = f_fc[i_161_] - 1;
									if ((i_158_ ^ 0xffffffff) == 0 || (aByteArray4631[i_158_] ^ 0xffffffff) != -1)
										break;
								}
								if ((i_158_ ^ 0xffffffff) != 0) {
									for (int i_162_ = 0; i_162_ < i_131_; i_162_++) {
										if (((is[i_162_] ^ 0xffffffff) == (i_156_ ^ 0xffffffff)) && is_133_[i_162_] == i_157_ && i_155_ == is_132_[i_162_]) {
											int i_163_ = -1;
											i_159_ = is_146_[i_162_];
											i_160_ = is_146_[1 + i_162_];
											for (int i_164_ = i_159_; i_164_ < i_160_; i_164_++) {
												i_163_ = is_147_[i_164_] - 1;
												if ((i_163_ ^ 0xffffffff) == 0 || (is_137_[i_163_] ^ 0xffffffff) != -1)
													break;
											}
											if ((i_163_ ^ 0xffffffff) != 0) {
												if (is_141_ == null) {
													f_ub = new Class122();
													is_141_ = ((Class122) f_ub).aShortArray1687 = (Class246_Sub13.method1989(aShortArray4589, -96));
													is_138_ = ((Class122) f_ub).aShortArray1682 = (Class246_Sub13.method1989(aShortArray4582, -112));
													is_140_ = ((Class122) f_ub).aShortArray1689 = (Class246_Sub13.method1989(aShortArray4588, -101));
													is_139_ = ((Class122) f_ub).aByteArray1683 = (Class29.method227(aByteArray4631, 0));
												}
												if (is_143_ == null) {
													Class122 class122 = (class_t_sub1_130_.f_ub = new Class122());
													is_143_ = ((Class122) class122).aShortArray1687 = (Class246_Sub13.method1989(is_134_, -111));
													is_144_ = ((Class122) class122).aShortArray1682 = (Class246_Sub13.method1989(is_135_, -106));
													is_145_ = ((Class122) class122).aShortArray1689 = (Class246_Sub13.method1989(is_136_, -94));
													is_142_ = ((Class122) class122).aByteArray1683 = (Class29.method227(is_137_, 0));
												}
												short i_165_ = aShortArray4589[i_158_];
												short i_166_ = aShortArray4582[i_158_];
												short i_167_ = aShortArray4588[i_158_];
												byte i_168_ = aByteArray4631[i_158_];
												i_160_ = is_146_[1 + i_162_];
												i_159_ = is_146_[i_162_];
												for (int i_169_ = i_159_; i_169_ < i_160_; i_169_++) {
													int i_170_ = -1 + is_147_[i_169_];
													if ((i_170_ ^ 0xffffffff) == 0)
														break;
													if (is_142_[i_170_] != 0) {
														is_143_[i_170_] += i_165_;
														is_144_[i_170_] += i_166_;
														is_145_[i_170_] += i_167_;
														is_142_[i_170_] += i_168_;
													}
												}
												i_168_ = is_137_[i_163_];
												i_159_ = anIntArray4630[i_154_];
												i_160_ = (anIntArray4630[i_154_ + 1]);
												i_167_ = is_136_[i_163_];
												i_165_ = is_134_[i_163_];
												i_166_ = is_135_[i_163_];
												for (int i_171_ = i_159_; i_171_ < i_160_; i_171_++) {
													int i_172_ = f_fc[i_171_] - 1;
													if (i_172_ == -1)
														break;
													if ((is_139_[i_172_] ^ 0xffffffff) != -1) {
														is_141_[i_172_] += i_165_;
														is_138_[i_172_] += i_166_;
														is_140_[i_172_] += i_167_;
														is_139_[i_172_] += i_168_;
													}
												}
												if (f_cc == null && aClass160_4596 != null)
													((Class160) aClass160_4596).anInterface10_2264 = null;
												if (f_cc != null)
													((Class160) f_cc).anInterface10_2264 = null;
												if ((class_t_sub1_130_.f_cc == null) && ((class_t_sub1_130_.aClass160_4596) != null))
													((Class160) (class_t_sub1_130_.aClass160_4596)).anInterface10_2264 = null;
												if (class_t_sub1_130_.f_cc != null)
													((Class160) class_t_sub1_130_.f_cc).anInterface10_2264 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.S(" + (class_t != null ? "{...}" : "null") + ',' + i + ',' + i_128_ + ',' + i_129_ + ',' + bool + ')'));
		}
	}

	final int U() {
		try {
			f_gb++;
			if (!aBool4606)
				method2038(16383);
			return aShort4605;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.U(" + ')');
		}
	}

	final Class162[] method676() {
		try {
			anInt4583++;
			return aClass162Array4627;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.L(" + ')');
		}
	}

	private final void method2028(int i, Class_c_Sub1 class_c_sub1) {
		do {
			try {
				if (aClass19Array4629 != null) {
					for (int i_173_ = 0; i_173_ < aClass19Array4629.length; i_173_++) {
						Class19 class19 = aClass19Array4629[i_173_];
						Class19 class19_174_ = class19;
						if (((Class19) class19).aClass19_297 != null)
							class19_174_ = ((Class19) class19).aClass19_297;
						((Class19) class19_174_).anInt293 = (int) (((float) (anIntArray4586[((Class19) class19).anInt301]) * (((Class_c_Sub1) class_c_sub1).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1).aFloat5387) * (float) f_pc[(((Class19) class19).anInt301)]) + ((float) (anIntArray4609[(((Class19) class19).anInt301)]) * (((Class_c_Sub1) class_c_sub1).aFloat5388)) + (((Class_c_Sub1) class_c_sub1).aFloat5393));
						((Class19) class19_174_).anInt294 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5385 + (((((Class_c_Sub1) class_c_sub1).aFloat5367) * (float) (anIntArray4609[(((Class19) class19).anInt301)])) + (((float) (anIntArray4586[(((Class19) class19).anInt301)]) * (((Class_c_Sub1) class_c_sub1).aFloat5364)) + ((float) f_pc[(((Class19) class19).anInt301)] * (((Class_c_Sub1) class_c_sub1).aFloat5382)))));
						((Class19) class19_174_).anInt306 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5362 + (((((Class_c_Sub1) class_c_sub1).aFloat5363) * (float) (anIntArray4609[(((Class19) class19).anInt301)])) + (((float) f_pc[(((Class19) class19).anInt301)] * (((Class_c_Sub1) class_c_sub1).aFloat5378)) + ((((Class_c_Sub1) class_c_sub1).aFloat5386) * (float) (anIntArray4586[(((Class19) class19).anInt301)])))));
						((Class19) class19_174_).anInt295 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5393 + (((((Class_c_Sub1) class_c_sub1).aFloat5388) * (float) (anIntArray4609[(((Class19) class19).anInt309)])) + (((((Class_c_Sub1) class_c_sub1).aFloat5387) * (float) f_pc[(((Class19) class19).anInt309)]) + ((float) (anIntArray4586[(((Class19) class19).anInt309)]) * (((Class_c_Sub1) class_c_sub1).aFloat5372)))));
						((Class19) class19_174_).anInt296 = (int) ((((Class_c_Sub1) class_c_sub1).aFloat5364 * (float) (anIntArray4586[(((Class19) class19).anInt309)])) + ((((Class_c_Sub1) class_c_sub1).aFloat5382) * (float) f_pc[(((Class19) class19).anInt309)]) + ((((Class_c_Sub1) class_c_sub1).aFloat5367) * (float) (anIntArray4609[(((Class19) class19).anInt309)])) + (((Class_c_Sub1) class_c_sub1).aFloat5385));
						((Class19) class19_174_).anInt302 = (int) (((float) (anIntArray4609[((Class19) class19).anInt309]) * (((Class_c_Sub1) class_c_sub1).aFloat5363)) + (((float) f_pc[(((Class19) class19).anInt309)] * (((Class_c_Sub1) class_c_sub1).aFloat5378)) + ((((Class_c_Sub1) class_c_sub1).aFloat5386) * (float) (anIntArray4586[(((Class19) class19).anInt309)]))) + (((Class_c_Sub1) class_c_sub1).aFloat5362));
						((Class19) class19_174_).anInt303 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5393 + (((float) f_pc[(((Class19) class19).anInt292)] * (((Class_c_Sub1) class_c_sub1).aFloat5387)) + ((((Class_c_Sub1) class_c_sub1).aFloat5372) * (float) (anIntArray4586[(((Class19) class19).anInt292)])) + ((float) (anIntArray4609[(((Class19) class19).anInt292)]) * (((Class_c_Sub1) class_c_sub1).aFloat5388))));
						((Class19) class19_174_).anInt298 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5385 + (((float) (anIntArray4609[(((Class19) class19).anInt292)]) * (((Class_c_Sub1) class_c_sub1).aFloat5367)) + (((((Class_c_Sub1) class_c_sub1).aFloat5382) * (float) f_pc[(((Class19) class19).anInt292)]) + ((float) (anIntArray4586[(((Class19) class19).anInt292)]) * (((Class_c_Sub1) class_c_sub1).aFloat5364)))));
						((Class19) class19_174_).anInt304 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5362 + (((((Class_c_Sub1) class_c_sub1).aFloat5363) * (float) (anIntArray4609[(((Class19) class19).anInt292)])) + (((((Class_c_Sub1) class_c_sub1).aFloat5386) * (float) (anIntArray4586[(((Class19) class19).anInt292)])) + ((float) f_pc[(((Class19) class19).anInt292)] * (((Class_c_Sub1) class_c_sub1).aFloat5378)))));
					}
				}
				anInt4610++;
				if (i != 0)
					f_lb = (short) 0;
				if (aClass162Array4627 == null)
					break;
				for (int i_175_ = 0; i_175_ < aClass162Array4627.length; i_175_++) {
					Class162 class162 = aClass162Array4627[i_175_];
					Class162 class162_176_ = class162;
					if (((Class162) class162).aClass162_2296 != null)
						class162_176_ = ((Class162) class162).aClass162_2296;
					if (((Class162) class162).aClass_c2291 != null)
						((Class162) class162).aClass_c2291.za(class_c_sub1);
					else
						((Class162) class162).aClass_c2291 = class_c_sub1.method582();
					((Class162) class162_176_).anInt2294 = (int) (((Class_c_Sub1) class_c_sub1).aFloat5393 + (((float) (anIntArray4609[(((Class162) class162).anInt2289)]) * (((Class_c_Sub1) class_c_sub1).aFloat5388)) + (((((Class_c_Sub1) class_c_sub1).aFloat5387) * (float) f_pc[(((Class162) class162).anInt2289)]) + ((float) (anIntArray4586[(((Class162) class162).anInt2289)]) * (((Class_c_Sub1) class_c_sub1).aFloat5372)))));
					((Class162) class162_176_).anInt2292 = (int) (((float) (anIntArray4586[((Class162) class162).anInt2289]) * ((Class_c_Sub1) class_c_sub1).aFloat5364) + (((Class_c_Sub1) class_c_sub1).aFloat5382 * (float) f_pc[(((Class162) class162).anInt2289)]) + ((float) (anIntArray4609[((Class162) class162).anInt2289]) * ((Class_c_Sub1) class_c_sub1).aFloat5367) + ((Class_c_Sub1) class_c_sub1).aFloat5385);
					((Class162) class162_176_).anInt2301 = (int) (((float) (anIntArray4609[((Class162) class162).anInt2289]) * ((Class_c_Sub1) class_c_sub1).aFloat5363) + ((((Class_c_Sub1) class_c_sub1).aFloat5378 * (float) f_pc[(((Class162) class162).anInt2289)]) + (((Class_c_Sub1) class_c_sub1).aFloat5386 * (float) (anIntArray4586[(((Class162) class162).anInt2289)]))) + ((Class_c_Sub1) class_c_sub1).aFloat5362);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ip.FB(" + i + ',' + (class_c_sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int HA() {
		try {
			if (!aBool4606)
				method2038(16383);
			anInt4577++;
			return aShort4622;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.HA(" + ')');
		}
	}

	final void c(int i) {
		do {
			try {
				anInt4603++;
				int i_177_ = Class39_Sub1.f_fb[i];
				int i_178_ = Class39_Sub1.anIntArray4672[i];
				for (int i_179_ = 0; anInt4639 > i_179_; i_179_++) {
					int i_180_ = ((anIntArray4586[i_179_] * i_178_ + anIntArray4609[i_179_] * i_177_) >> 15);
					anIntArray4609[i_179_] = (i_178_ * anIntArray4609[i_179_] + -(i_177_ * anIntArray4586[i_179_])) >> 15;
					anIntArray4586[i_179_] = i_180_;
				}
				for (int i_181_ = 0; (anInt4612 ^ 0xffffffff) < (i_181_ ^ 0xffffffff); i_181_++) {
					int i_182_ = ((i_178_ * aShortArray4589[i_181_] + aShortArray4588[i_181_] * i_177_) >> 15);
					aShortArray4588[i_181_] = (short) ((i_178_ * aShortArray4588[i_181_] + -(i_177_ * aShortArray4589[i_181_])) >> 15);
					aShortArray4589[i_181_] = (short) i_182_;
				}
				if (f_cc == null && aClass160_4596 != null)
					((Class160) aClass160_4596).anInterface10_2264 = null;
				if (f_cc != null)
					((Class160) f_cc).anInterface10_2264 = null;
				aBool4606 = false;
				if (aClass160_4587 == null)
					break;
				((Class160) aClass160_4587).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.c(" + i + ')');
			}
			break;
		} while (false);
	}

	final int D() {
		try {
			f_mc++;
			return f_tc;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.D(" + ')');
		}
	}

	final void BA(short i, short i_183_) {
		do {
			try {
				anInt4618++;
				for (int i_184_ = 0; (f_kc ^ 0xffffffff) < (i_184_ ^ 0xffffffff); i_184_++) {
					if (aShortArray4581[i_184_] == i)
						aShortArray4581[i_184_] = i_183_;
				}
				if (f_bc != null) {
					for (int i_185_ = 0; i_185_ < f_ic; i_185_++) {
						Class_j class_j = f_bc[i_185_];
						Class69 class69 = f_jb[i_185_];
						((Class69) class69).anInt911 = (((Class40_Sub3.anIntArray4064[(aShortArray4581[((Class_j) class_j).anInt1471]) & 0xffff]) & 0xffffff) | ~0xffffff & ((Class69) class69).anInt911);
					}
				}
				if (aClass160_4596 == null)
					break;
				((Class160) aClass160_4596).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.BA(" + i + ',' + i_183_ + ')');
			}
			break;
		} while (false);
	}

	final void Z(int i) {
		try {
			anInt4580++;
			int i_186_ = Class39_Sub1.f_fb[i];
			int i_187_ = Class39_Sub1.anIntArray4672[i];
			for (int i_188_ = 0; i_188_ < anInt4639; i_188_++) {
				int i_189_ = ((-(anIntArray4609[i_188_] * i_186_) + f_pc[i_188_] * i_187_) >> 15);
				anIntArray4609[i_188_] = (i_187_ * anIntArray4609[i_188_] + f_pc[i_188_] * i_186_ >> 15);
				f_pc[i_188_] = i_189_;
			}
			if (aClass160_4587 != null)
				((Class160) aClass160_4587).anInterface10_2264 = null;
			aBool4606 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.Z(" + i + ')');
		}
	}

	final void h(int i, int i_190_, Class210 class210, Class210 class210_191_, int i_192_, int i_193_, int i_194_) {
		try {
			f_nc++;
			if (!aBool4606)
				method2038(16383);
			int i_195_ = i_192_ + aShort4622;
			int i_196_ = i_192_ - -aShort4638;
			int i_197_ = i_194_ - -f_eb;
			int i_198_ = aShort4590 + i_194_;
			if (((i ^ 0xffffffff) != -2 && i != 2 && (i ^ 0xffffffff) != -4 && i != 5) || (i_195_ >= 0 && ((i_196_ + ((Class210) class210).anInt2955 >> ((Class210) class210).anInt2950) < ((Class210) class210).anInt2956) && i_197_ >= 0 && (((Class210) class210).anInt2952 > (i_198_ - -((Class210) class210).anInt2955 >> ((Class210) class210).anInt2950)))) {
				if (i != 4 && i != 5) {
					i_195_ >>= ((Class210) class210).anInt2950;
					i_196_ = (((Class210) class210).anInt2955 + (-1 + i_196_) >> ((Class210) class210).anInt2950);
					i_197_ >>= ((Class210) class210).anInt2950;
					i_198_ = (-1 + (((Class210) class210).anInt2955 + i_198_) >> ((Class210) class210).anInt2950);
					if ((i_193_ ^ 0xffffffff) == (class210.l(i_195_, i_197_) ^ 0xffffffff) && class210.l(i_196_, i_197_) == i_193_ && (i_193_ ^ 0xffffffff) == (class210.l(i_195_, i_198_) ^ 0xffffffff) && i_193_ == class210.l(i_196_, i_198_))
						return;
				} else if (class210_191_ == null || ((i_195_ ^ 0xffffffff) > -1 || ((((i_196_ + ((Class210) class210_191_).anInt2955) >> ((Class210) class210_191_).anInt2950) ^ 0xffffffff) <= (((Class210) class210_191_).anInt2956 ^ 0xffffffff)) || i_197_ < 0 || ((((i_198_ + ((Class210) class210_191_).anInt2955) >> ((Class210) class210_191_).anInt2950) ^ 0xffffffff) <= (((Class210) class210_191_).anInt2952 ^ 0xffffffff))))
					return;
				if (i != 1) {
					if ((i ^ 0xffffffff) != -3) {
						if (i != 3) {
							if ((i ^ 0xffffffff) != -5) {
								if (i == 5) {
									int i_199_ = -f_lb + aShort4614;
									for (int i_200_ = 0; ((i_200_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff)); i_200_++) {
										int i_201_ = i_192_ + anIntArray4586[i_200_];
										int i_202_ = anIntArray4609[i_200_] + i_194_;
										int i_203_ = class210.a(i_201_, i_202_);
										int i_204_ = class210_191_.a(i_201_, i_202_);
										int i_205_ = i_203_ - i_204_;
										f_pc[i_200_] = (-i_193_ - (-i_203_ - (i_205_ * ((f_pc[i_200_] << 8) / i_199_) >> 8)));
									}
								}
							} else {
								int i_206_ = aShort4614 - f_lb;
								for (int i_207_ = 0; ((i_207_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff)); i_207_++)
									f_pc[i_207_] = (i_206_ + f_pc[i_207_] - (-(class210_191_.a((i_192_ + anIntArray4586[i_207_]), (i_194_ + anIntArray4609[i_207_]))) + i_193_));
							}
						} else {
							int i_208_ = (0xff & i_190_) * 4;
							int i_209_ = 4 * (0xff & i_190_ >> 8);
							int i_210_ = (0xff & i_190_ >> 16) << 6;
							int i_211_ = (0xff & i_190_ >> 24) << 6;
							if ((i_192_ - (i_208_ >> 1) ^ 0xffffffff) > -1 || ((((i_208_ >> 1) + (i_192_ + ((Class210) class210).anInt2955)) ^ 0xffffffff) <= ((((Class210) class210).anInt2956 << ((Class210) class210).anInt2950) ^ 0xffffffff)) || (-(i_209_ >> 1) + i_194_ ^ 0xffffffff) > -1 || (((i_209_ >> 1) + i_194_ - -((Class210) class210).anInt2955) >= (((Class210) class210).anInt2952 << ((Class210) class210).anInt2950)))
								return;
							this.method675(16384, i_192_, i_194_, i_209_, i_210_, class210, i_208_, i_211_, i_193_);
						}
					} else {
						int i_212_ = f_lb;
						if (i_212_ == 0)
							return;
						for (int i_213_ = 0; (anInt4639 ^ 0xffffffff) < (i_213_ ^ 0xffffffff); i_213_++) {
							int i_214_ = (f_pc[i_213_] << 16) / i_212_;
							if (i_214_ < i_190_)
								f_pc[i_213_] = (f_pc[i_213_] + ((-i_214_ + i_190_) * (-i_193_ + class210.a((i_192_ + (anIntArray4586[i_213_])), ((anIntArray4609[i_213_]) - -i_194_))) / i_190_));
						}
					}
				} else {
					for (int i_215_ = 0; anInt4639 > i_215_; i_215_++)
						f_pc[i_215_] = (-i_193_ + f_pc[i_215_] + class210.a(i_192_ + anIntArray4586[i_215_], anIntArray4609[i_215_] - -i_194_));
				}
				if (aClass160_4587 != null)
					((Class160) aClass160_4587).anInterface10_2264 = null;
				aBool4606 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.h(" + i + ',' + i_190_ + ',' + (class210 != null ? "{...}" : "null") + ',' + (class210_191_ != null ? "{...}" : "null") + ',' + i_192_ + ',' + i_193_ + ',' + i_194_ + ')'));
		}
	}

	public static void method2029(int i) {
		do {
			try {
				f_lc = null;
				f_vc = null;
				aColorArray4641 = null;
				if (i >= 109)
					break;
				method2030(-24, 66, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.EB(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method681() {
		try {
			f_kb++;
			if (f_tb == null)
				return true;
			for (int i = 0; (i ^ 0xffffffff) > (f_tb.length ^ 0xffffffff); i++) {
				if (f_tb[i] != -1 && !((Class260) aClass260_Sub2_4636).anInterface6_3714.method13(f_tb[i], 19378))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.F(" + ')');
		}
	}

	final int NA() {
		try {
			if (!aBool4606)
				method2038(16383);
			anInt4611++;
			return aShort4638;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.NA(" + ')');
		}
	}

	static final void method2030(int i, int i_216_, boolean bool) {
		try {
			f_qc++;
			Class246_Sub18 class246_sub18 = Class95.method610(22, bool, i);
			if (class246_sub18 != null) {
				for (int i_217_ = i_216_; ((i_217_ ^ 0xffffffff) > ((((Class246_Sub18) class246_sub18).anIntArray4682).length ^ 0xffffffff)); i_217_++) {
					((Class246_Sub18) class246_sub18).anIntArray4682[i_217_] = -1;
					((Class246_Sub18) class246_sub18).anIntArray4679[i_217_] = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.EA(" + i + ',' + i_216_ + ',' + bool + ')'));
		}
	}

	final int l() {
		try {
			anInt4607++;
			return aShort4628;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.l(" + ')');
		}
	}

	final boolean method685(int i, int i_218_, Class_c class_c, boolean bool) {
		try {
			f_db++;
			Class_c_Sub1 class_c_sub1 = (Class_c_Sub1) class_c;
			Class_c_Sub1 class_c_sub1_219_ = ((Class260_Sub2) aClass260_Sub2_4636).f_hg;
			float f = (((Class_c_Sub1) class_c_sub1_219_).aFloat5393 + ((((Class_c_Sub1) class_c_sub1).aFloat5385 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5387) + (((Class_c_Sub1) class_c_sub1).aFloat5393 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5372) + (((Class_c_Sub1) class_c_sub1).aFloat5362 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5388)));
			float f_220_ = ((((Class_c_Sub1) class_c_sub1_219_).aFloat5364 * ((Class_c_Sub1) class_c_sub1).aFloat5393) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5382 * ((Class_c_Sub1) class_c_sub1).aFloat5385) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5367 * ((Class_c_Sub1) class_c_sub1).aFloat5362) + ((Class_c_Sub1) class_c_sub1_219_).aFloat5385);
			Class_v.aFloat1453 = ((((Class_c_Sub1) class_c_sub1).aFloat5363 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5367) + ((((Class_c_Sub1) class_c_sub1).aFloat5367 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5382) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5364 * ((Class_c_Sub1) class_c_sub1).aFloat5388)));
			Class_o.aFloat7226 = ((((Class_c_Sub1) class_c_sub1).aFloat5382 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5387) + (((Class_c_Sub1) class_c_sub1).aFloat5387 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5372) + (((Class_c_Sub1) class_c_sub1).aFloat5378 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5388));
			Class63_Sub1.aFloat4718 = ((((Class_c_Sub1) class_c_sub1_219_).aFloat5386 * ((Class_c_Sub1) class_c_sub1).aFloat5388) + (((Class_c_Sub1) class_c_sub1).aFloat5367 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5378) + (((Class_c_Sub1) class_c_sub1).aFloat5363 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5363));
			Class39.aFloat579 = ((((Class_c_Sub1) class_c_sub1).aFloat5367 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5387) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5372 * ((Class_c_Sub1) class_c_sub1).aFloat5388) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5388 * ((Class_c_Sub1) class_c_sub1).aFloat5363));
			Canvas_Sub1.aFloat6894 = ((((Class_c_Sub1) class_c_sub1).aFloat5382 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5378) + (((Class_c_Sub1) class_c_sub1).aFloat5387 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5386) + (((Class_c_Sub1) class_c_sub1).aFloat5378 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5363));
			Class246_Sub28_Sub21.aFloat6586 = ((((Class_c_Sub1) class_c_sub1_219_).aFloat5388 * ((Class_c_Sub1) class_c_sub1).aFloat5386) + ((((Class_c_Sub1) class_c_sub1).aFloat5372 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5372) + (((Class_c_Sub1) class_c_sub1).aFloat5364 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5387)));
			float f_221_ = ((((Class_c_Sub1) class_c_sub1).aFloat5393 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5386) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5378 * ((Class_c_Sub1) class_c_sub1).aFloat5385) + (((Class_c_Sub1) class_c_sub1).aFloat5362 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5363) + ((Class_c_Sub1) class_c_sub1_219_).aFloat5362);
			Class246_Sub43.aFloat5603 = ((((Class_c_Sub1) class_c_sub1).aFloat5372 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5386) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5378 * ((Class_c_Sub1) class_c_sub1).aFloat5364) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5363 * ((Class_c_Sub1) class_c_sub1).aFloat5386));
			Class156.aFloat2244 = ((((Class_c_Sub1) class_c_sub1).aFloat5382 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5382) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5364 * ((Class_c_Sub1) class_c_sub1).aFloat5387) + (((Class_c_Sub1) class_c_sub1_219_).aFloat5367 * ((Class_c_Sub1) class_c_sub1).aFloat5378));
			Class59_Sub4_Sub2.aFloat6845 = ((((Class_c_Sub1) class_c_sub1_219_).aFloat5367 * ((Class_c_Sub1) class_c_sub1).aFloat5386) + ((((Class_c_Sub1) class_c_sub1).aFloat5364 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5382) + (((Class_c_Sub1) class_c_sub1).aFloat5372 * ((Class_c_Sub1) class_c_sub1_219_).aFloat5364)));
			boolean bool_222_ = false;
			float f_223_ = 3.4028235E38F;
			float f_224_ = -3.4028235E38F;
			float f_225_ = 3.4028235E38F;
			float f_226_ = -3.4028235E38F;
			int i_227_ = ((Class260_Sub2) aClass260_Sub2_4636).anInt4366;
			int i_228_ = ((Class260_Sub2) aClass260_Sub2_4636).f_tf;
			if (!aBool4606)
				method2038(16383);
			Class246_Sub1_Sub8.anIntArray6104[0] = aShort4622;
			Class147.anIntArray2143[0] = f_lb;
			Class246_Sub1_Sub8.anIntArray6104[1] = aShort4638;
			Class9.anIntArray103[0] = f_eb;
			Class147.anIntArray2143[1] = f_lb;
			Class9.anIntArray103[1] = f_eb;
			Class246_Sub1_Sub8.anIntArray6104[2] = aShort4622;
			Class147.anIntArray2143[2] = aShort4614;
			Class9.anIntArray103[2] = f_eb;
			Class246_Sub1_Sub8.anIntArray6104[3] = aShort4638;
			Class147.anIntArray2143[3] = aShort4614;
			Class246_Sub1_Sub8.anIntArray6104[4] = aShort4622;
			Class9.anIntArray103[3] = f_eb;
			Class147.anIntArray2143[4] = f_lb;
			Class246_Sub1_Sub8.anIntArray6104[5] = aShort4638;
			Class9.anIntArray103[4] = aShort4590;
			Class147.anIntArray2143[5] = f_lb;
			Class246_Sub1_Sub8.anIntArray6104[6] = aShort4622;
			Class9.anIntArray103[5] = aShort4590;
			Class147.anIntArray2143[6] = aShort4614;
			Class9.anIntArray103[6] = aShort4590;
			Class246_Sub1_Sub8.anIntArray6104[7] = aShort4638;
			Class147.anIntArray2143[7] = aShort4614;
			Class9.anIntArray103[7] = aShort4590;
			for (int i_229_ = 0; (i_229_ ^ 0xffffffff) > -9; i_229_++) {
				float f_230_ = (float) Class147.anIntArray2143[i_229_];
				float f_231_ = (float) Class246_Sub1_Sub8.anIntArray6104[i_229_];
				float f_232_ = (float) Class9.anIntArray103[i_229_];
				float f_233_ = (Class63_Sub1.aFloat4718 * f_232_ + (f_231_ * Class246_Sub43.aFloat5603 + Canvas_Sub1.aFloat6894 * f_230_) + f_221_);
				float f_234_ = (f_230_ * Class156.aFloat2244 + Class59_Sub4_Sub2.aFloat6845 * f_231_ + f_232_ * Class_v.aFloat1453 + f_220_);
				float f_235_ = f + (f_230_ * Class_o.aFloat7226 + Class246_Sub28_Sub21.aFloat6586 * f_231_ + Class39.aFloat579 * f_232_);
				if (f_233_ >= (float) ((Class260_Sub2) aClass260_Sub2_4636).f_cf) {
					float f_236_ = ((float) ((Class260_Sub2) aClass260_Sub2_4636).f_vf + f_235_ * (float) i_227_ / f_233_);
					if (f_236_ < f_223_)
						f_223_ = f_236_;
					if (f_236_ > f_224_)
						f_224_ = f_236_;
					float f_237_ = ((float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4339) + (float) i_228_ * f_234_ / f_233_);
					bool_222_ = true;
					if (f_225_ > f_237_)
						f_225_ = f_237_;
					if (f_226_ < f_237_)
						f_226_ = f_237_;
				}
			}
			if (bool_222_ && (float) i > f_223_ && (float) i < f_224_ && (float) i_218_ > f_225_ && (float) i_218_ < f_226_) {
				if (bool)
					return true;
				if (Class126.anIntArray1779.length < anInt4612) {
					Class94.anIntArray1234 = new int[anInt4612];
					Class126.anIntArray1779 = new int[anInt4612];
				}
				for (int i_238_ = 0; i_238_ < anInt4639; i_238_++) {
					float f_239_ = (float) anIntArray4586[i_238_];
					float f_240_ = (float) f_pc[i_238_];
					float f_241_ = (float) anIntArray4609[i_238_];
					float f_242_ = f + (f_240_ * Class_o.aFloat7226 + Class246_Sub28_Sub21.aFloat6586 * f_239_ + Class39.aFloat579 * f_241_);
					float f_243_ = f_221_ + (Class63_Sub1.aFloat4718 * f_241_ + (f_240_ * Canvas_Sub1.aFloat6894 + f_239_ * Class246_Sub43.aFloat5603));
					float f_244_ = f_220_ + (Class_v.aFloat1453 * f_241_ + (Class59_Sub4_Sub2.aFloat6845 * f_239_ + f_240_ * Class156.aFloat2244));
					if ((float) ((Class260_Sub2) aClass260_Sub2_4636).f_cf <= f_243_) {
						int i_245_ = (int) (f_242_ * (float) i_227_ / f_243_ + (float) ((Class260_Sub2) aClass260_Sub2_4636).f_vf);
						int i_246_ = (int) (f_244_ * (float) i_228_ / f_243_ + (float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4339));
						int i_247_ = anIntArray4630[i_238_];
						int i_248_ = anIntArray4630[1 + i_238_];
						for (int i_249_ = i_247_; (i_249_ ^ 0xffffffff) > (i_248_ ^ 0xffffffff); i_249_++) {
							int i_250_ = f_fc[i_249_] - 1;
							if (i_250_ == -1)
								break;
							Class126.anIntArray1779[i_250_] = i_245_;
							Class94.anIntArray1234[i_250_] = i_246_;
						}
					} else {
						int i_251_ = anIntArray4630[i_238_];
						int i_252_ = anIntArray4630[1 + i_238_];
						for (int i_253_ = i_251_; i_252_ > i_253_; i_253_++) {
							int i_254_ = -1 + f_fc[i_253_];
							if (i_254_ == -1)
								break;
							Class126.anIntArray1779[-1 + f_fc[i_253_]] = -999999;
						}
					}
				}
				for (int i_255_ = 0; f_kc > i_255_; i_255_++) {
					if ((Class126.anIntArray1779[aShortArray4613[i_255_]] != -999999) && (Class126.anIntArray1779[aShortArray4602[i_255_]] ^ 0xffffffff) != 999998 && (Class126.anIntArray1779[f_hb[i_255_]] ^ 0xffffffff) != 999998 && (method2040(false, Class126.anIntArray1779[aShortArray4613[i_255_]], Class94.anIntArray1234[aShortArray4613[i_255_]], Class126.anIntArray1779[f_hb[i_255_]], i_218_, Class126.anIntArray1779[aShortArray4602[i_255_]], Class94.anIntArray1234[aShortArray4602[i_255_]], Class94.anIntArray1234[f_hb[i_255_]], i)))
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.T(" + i + ',' + i_218_ + ',' + (class_c != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int m() {
		try {
			if (!aBool4606)
				method2038(16383);
			f_rc++;
			return aShort4590;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.m(" + ')');
		}
	}

	private final void method2031(boolean bool) {
		try {
			anInt4637++;
			if (anInt4574 != 0) {
				if (f_qb != 0)
					method2033(-12, true);
				method2033(-12, bool);
				if (aClass218_4594 != null) {
					if (((Class218) aClass218_4594).anInterface1_3032 == null)
						method2042((f_qb & 0x10 ^ 0xffffffff) != -1, false);
					if (((Class218) aClass218_4594).anInterface1_3032 != null) {
						aClass260_Sub2_4636.method1906(f_cc != null, -126);
						aClass260_Sub2_4636.method1934(aClass160_4596, 126, f_cc, aClass160_4626, aClass160_4587);
						int i = -1 + anIntArray4640.length;
						for (int i_256_ = 0; (i ^ 0xffffffff) < (i_256_ ^ 0xffffffff); i_256_++) {
							int i_257_ = anIntArray4640[i_256_];
							int i_258_ = anIntArray4640[i_256_ + 1];
							int i_259_ = f_tb[i_257_] & 0xffff;
							if (i_259_ == 65535)
								i_259_ = -1;
							aClass260_Sub2_4636.method1938(true, i_259_, f_cc != null);
							aClass260_Sub2_4636.method1967(i_257_ * 3, (i_258_ - i_257_) * 3, 4, ((Class218) aClass218_4594).anInterface1_3032, (byte) -95);
						}
					}
				}
				method2041(-128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.AB(" + bool + ')');
		}
	}

	private final int method2032(int i, int i_260_, byte i_261_, byte i_262_, short i_263_) {
		try {
			anInt4597++;
			if (i_261_ != 105)
				U();
			int i_264_ = (Class40_Sub3.anIntArray4064[Class246_Sub1_Sub3.method2438(i_260_, i_261_ ^ 0x69, i)]);
			if (i_263_ != -1) {
				Class238 class238 = ((Class260) aClass260_Sub2_4636).anInterface6_3714.method17(-31305, 0xffff & i_263_);
				int i_265_ = ((Class238) class238).aByte3344 & 0xff;
				if ((i_265_ ^ 0xffffffff) != -1) {
					int i_266_;
					if (i_260_ >= 0) {
						if (i_260_ <= 127)
							i_266_ = i_260_ * 131586;
						else
							i_266_ = 16777215;
					} else
						i_266_ = 0;
					if (i_265_ != 256) {
						int i_267_ = i_265_;
						int i_268_ = 256 - i_265_;
						i_264_ = ((~0xff00ff & (i_267_ * (i_266_ & 0xff00ff) - -(i_268_ * (i_264_ & 0xff00ff)))) + ((i_268_ * (i_264_ & 0xff00) + i_267_ * (i_266_ & 0xff00)) & 0xff0000)) >> 8;
					} else
						i_264_ = i_266_;
				}
				int i_269_ = ((Class238) class238).aByte3338 & 0xff;
				if (i_269_ != 0) {
					i_269_ += 256;
					int i_270_ = (i_264_ >> 16 & 0xff) * i_269_;
					if (i_270_ > 65535)
						i_270_ = 65535;
					int i_271_ = i_269_ * ((i_264_ & 0xff00) >> 8);
					if ((i_271_ ^ 0xffffffff) < -65536)
						i_271_ = 65535;
					int i_272_ = i_269_ * (0xff & i_264_);
					if ((i_272_ ^ 0xffffffff) < -65536)
						i_272_ = 65535;
					i_264_ = (0xff00 & i_271_) + ((0xff00f4 & i_270_ << 8) - -(i_272_ >> 8));
				}
			}
			return (i_264_ << 8) - (0xff & i_262_) + 255;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.BB(" + i + ',' + i_260_ + ',' + i_261_ + ',' + i_262_ + ',' + i_263_ + ')'));
		}
	}

	private final void method2033(int i, boolean bool) {
		do {
			try {
				anInt4615++;
				boolean bool_273_ = (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264 == null));
				boolean bool_274_ = (f_cc != null && ((Class160) f_cc).anInterface10_2264 == null);
				boolean bool_275_ = (aClass160_4587 != null && (((Class160) aClass160_4587).anInterface10_2264 == null));
				boolean bool_276_ = (aClass160_4626 != null && (((Class160) aClass160_4626).anInterface10_2264 == null));
				if (bool) {
					bool_275_ = bool_275_ & (0x1 & f_qb ^ 0xffffffff) != -1;
					bool_274_ = bool_274_ & (0x4 & f_qb ^ 0xffffffff) != -1;
					bool_273_ = bool_273_ & (f_qb & 0x2 ^ 0xffffffff) != -1;
					bool_276_ = bool_276_ & (0x8 & f_qb) != 0;
				}
				byte i_277_ = 0;
				byte i_278_ = 0;
				byte i_279_ = 0;
				if (i == -12) {
					byte i_280_ = 0;
					if (bool_275_) {
						i_278_ = i_277_;
						i_277_ += 12;
					}
					byte i_281_ = 0;
					if (bool_273_) {
						i_279_ = i_277_;
						i_277_ += 4;
					}
					if (bool_274_) {
						i_280_ = i_277_;
						i_277_ += 12;
					}
					if (bool_276_) {
						i_281_ = i_277_;
						i_277_ += 8;
					}
					if ((i_277_ ^ 0xffffffff) != -1) {
						if ((((BufferStream) Class206.aStream_Sub2_2908).buffer).length >= anInt4612 * i_277_)
							((BufferStream) Class206.aStream_Sub2_2908).position = 0;
						else
							Class206.aStream_Sub2_2908 = new Stream_Sub2(i_277_ * (100 + anInt4612));
						if (bool_275_) {
							if (((Class260_Sub2) aClass260_Sub2_4636).aBool4392) {
								for (int i_282_ = 0; i_282_ < anInt4639; i_282_++) {
									int i_283_ = (Stream.floatToRawIntBits((float) anIntArray4586[i_282_]));
									int i_284_ = (Stream.floatToRawIntBits((float) f_pc[i_282_]));
									int i_285_ = (Stream.floatToRawIntBits((float) anIntArray4609[i_282_]));
									int i_286_ = anIntArray4630[i_282_];
									int i_287_ = anIntArray4630[i_282_ + 1];
									for (int i_288_ = i_286_; ((i_287_ ^ 0xffffffff) < (i_288_ ^ 0xffffffff)); i_288_++) {
										int i_289_ = f_fc[i_288_] - 1;
										if (i_289_ == -1)
											break;
										((BufferStream) Class206.aStream_Sub2_2908).position = i_277_ * i_289_;
										Class206.aStream_Sub2_2908.writeInt(i_283_, (byte) 109);
										Class206.aStream_Sub2_2908.writeInt(i_284_, (byte) -40);
										Class206.aStream_Sub2_2908.writeInt(i_285_, (byte) -64);
									}
								}
							} else {
								for (int i_290_ = 0; i_290_ < anInt4639; i_290_++) {
									int i_291_ = (Stream.floatToRawIntBits((float) anIntArray4586[i_290_]));
									int i_292_ = (Stream.floatToRawIntBits((float) f_pc[i_290_]));
									int i_293_ = (Stream.floatToRawIntBits((float) anIntArray4609[i_290_]));
									int i_294_ = anIntArray4630[i_290_];
									int i_295_ = anIntArray4630[1 + i_290_];
									for (int i_296_ = i_294_; i_295_ > i_296_; i_296_++) {
										int i_297_ = -1 + f_fc[i_296_];
										if (i_297_ == -1)
											break;
										((BufferStream) Class206.aStream_Sub2_2908).position = i_297_ * i_277_;
										Class206.aStream_Sub2_2908.method2413(i ^ 0x198cd28c, i_291_);
										Class206.aStream_Sub2_2908.method2413(-428659336, i_292_);
										Class206.aStream_Sub2_2908.method2413(-428659336, i_293_);
									}
								}
							}
						}
						if (bool_273_) {
							if (f_cc != null) {
								for (int i_298_ = 0; ((f_kc ^ 0xffffffff) < (i_298_ ^ 0xffffffff)); i_298_++) {
									int i_299_ = method2032(aShortArray4581[i_298_], f_tc, (byte) 105, aByteArray4620[i_298_], f_tb[i_298_]);
									((BufferStream) Class206.aStream_Sub2_2908).position = (i_279_ + aShortArray4613[i_298_] * i_277_);
									Class206.aStream_Sub2_2908.writeInt(i_299_, (byte) -37);
									((BufferStream) Class206.aStream_Sub2_2908).position = i_279_ - -(i_277_ * (aShortArray4602[i_298_]));
									Class206.aStream_Sub2_2908.writeInt(i_299_, (byte) 120);
									((BufferStream) Class206.aStream_Sub2_2908).position = i_277_ * f_hb[i_298_] + i_279_;
									Class206.aStream_Sub2_2908.writeInt(i_299_, (byte) -97);
								}
							} else {
								short[] is;
								short[] is_300_;
								byte[] is_301_;
								short[] is_302_;
								if (f_ub != null) {
									is_302_ = ((Class122) f_ub).aShortArray1689;
									is_301_ = ((Class122) f_ub).aByteArray1683;
									is_300_ = ((Class122) f_ub).aShortArray1682;
									is = ((Class122) f_ub).aShortArray1687;
								} else {
									is = aShortArray4589;
									is_300_ = aShortArray4582;
									is_301_ = aByteArray4631;
									is_302_ = aShortArray4588;
								}
								float f = (((Class260_Sub2) aClass260_Sub2_4636).aFloatArray4374[0]);
								float f_303_ = (((Class260_Sub2) aClass260_Sub2_4636).aFloatArray4374[1]);
								float f_304_ = (((Class260_Sub2) aClass260_Sub2_4636).aFloatArray4374[2]);
								float f_305_ = (((Class260_Sub2) aClass260_Sub2_4636).f_gg);
								float f_306_ = (768.0F * (((Class260_Sub2) aClass260_Sub2_4636).f_vg) / (float) aShort4628);
								float f_307_ = ((((Class260_Sub2) aClass260_Sub2_4636).aFloat4352) * 768.0F / (float) aShort4628);
								for (int i_308_ = 0; i_308_ < f_kc; i_308_++) {
									int i_309_ = method2032(aShortArray4581[i_308_], f_tc, (byte) 105, aByteArray4620[i_308_], f_tb[i_308_]);
									int i_310_ = aShortArray4613[i_308_];
									float f_311_ = ((float) ((0xff00 & i_309_) >> 8) * ((Class260_Sub2) aClass260_Sub2_4636).aFloat4367);
									float f_312_ = (((Class260_Sub2) aClass260_Sub2_4636).f_tg * (float) (i_309_ >>> 24));
									float f_313_ = ((float) ((0xfffa5c & i_309_) >> 16) * ((Class260_Sub2) aClass260_Sub2_4636).aFloat4332);
									short i_314_ = (short) is_301_[i_310_];
									float f_315_;
									if ((i_314_ ^ 0xffffffff) == -1)
										f_315_ = (0.0026041667F * ((f_304_ * (float) is_302_[i_310_]) + (((float) is_300_[i_310_] * f_303_) + f * (float) is[i_310_])));
									else
										f_315_ = ((((float) is_302_[i_310_] * f_304_) + (f * (float) is[i_310_] + ((float) is_300_[i_310_] * f_303_))) / (float) (i_314_ * 256));
									float f_316_ = f_305_ + (f_315_ < 0.0F ? f_307_ : f_306_) * f_315_;
									int i_317_ = (int) (f_312_ * f_316_);
									int i_318_ = (int) (f_316_ * f_313_);
									if (i_317_ >= 0) {
										if ((i_317_ ^ 0xffffffff) < -256)
											i_317_ = 255;
									} else
										i_317_ = 0;
									if ((i_318_ ^ 0xffffffff) > -1)
										i_318_ = 0;
									else if ((i_318_ ^ 0xffffffff) < -256)
										i_318_ = 255;
									int i_319_ = (int) (f_311_ * f_316_);
									if (i_319_ < 0)
										i_319_ = 0;
									else if ((i_319_ ^ 0xffffffff) < -256)
										i_319_ = 255;
									((BufferStream) Class206.aStream_Sub2_2908).position = i_310_ * i_277_ + i_279_;
									Class206.aStream_Sub2_2908.writeByte(255, i_317_);
									Class206.aStream_Sub2_2908.writeByte(255, i_318_);
									Class206.aStream_Sub2_2908.writeByte(i + 267, i_319_);
									Class206.aStream_Sub2_2908.writeByte(255, 255 + -(0xff & aByteArray4620[i_308_]));
									i_310_ = aShortArray4602[i_308_];
									i_314_ = (short) is_301_[i_310_];
									if (i_314_ == 0)
										f_315_ = ((f * (float) is[i_310_] + ((float) is_300_[i_310_] * f_303_) + (f_304_ * (float) is_302_[i_310_])) * 0.0026041667F);
									else
										f_315_ = ((((float) is_302_[i_310_] * f_304_) + ((float) is[i_310_] * f + (f_303_ * (float) (is_300_[i_310_])))) / (float) (256 * i_314_));
									f_316_ = f_315_ * (f_315_ < 0.0F ? f_307_ : f_306_) + f_305_;
									i_317_ = (int) (f_312_ * f_316_);
									i_318_ = (int) (f_313_ * f_316_);
									if (i_317_ >= 0) {
										if (i_317_ > 255)
											i_317_ = 255;
									} else
										i_317_ = 0;
									if ((i_318_ ^ 0xffffffff) > -1)
										i_318_ = 0;
									else if (i_318_ > 255)
										i_318_ = 255;
									i_319_ = (int) (f_311_ * f_316_);
									((BufferStream) Class206.aStream_Sub2_2908).position = i_279_ + i_277_ * i_310_;
									if ((i_319_ ^ 0xffffffff) > -1)
										i_319_ = 0;
									else if ((i_319_ ^ 0xffffffff) < -256)
										i_319_ = 255;
									Class206.aStream_Sub2_2908.writeByte(i ^ ~0xf4, i_317_);
									Class206.aStream_Sub2_2908.writeByte(i + 267, i_318_);
									Class206.aStream_Sub2_2908.writeByte(255, i_319_);
									Class206.aStream_Sub2_2908.writeByte(255, (-(0xff & aByteArray4620[i_308_]) + 255));
									i_310_ = f_hb[i_308_];
									i_314_ = (short) is_301_[i_310_];
									if (i_314_ == 0)
										f_315_ = (0.0026041667F * (((float) is_302_[i_310_] * f_304_) + ((float) is[i_310_] * f + (f_303_ * (float) (is_300_[i_310_])))));
									else
										f_315_ = (((f_304_ * (float) is_302_[i_310_]) + (f * (float) is[i_310_] + ((float) is_300_[i_310_] * f_303_))) / (float) (i_314_ * 256));
									f_316_ = f_305_ + (f_315_ < 0.0F ? f_307_ : f_306_) * f_315_;
									i_317_ = (int) (f_316_ * f_312_);
									i_318_ = (int) (f_313_ * f_316_);
									if (i_317_ >= 0) {
										if ((i_317_ ^ 0xffffffff) < -256)
											i_317_ = 255;
									} else
										i_317_ = 0;
									if (i_318_ >= 0) {
										if (i_318_ > 255)
											i_318_ = 255;
									} else
										i_318_ = 0;
									i_319_ = (int) (f_311_ * f_316_);
									if (i_319_ < 0)
										i_319_ = 0;
									else if ((i_319_ ^ 0xffffffff) < -256)
										i_319_ = 255;
									((BufferStream) Class206.aStream_Sub2_2908).position = i_279_ - -(i_310_ * i_277_);
									Class206.aStream_Sub2_2908.writeByte(i ^ ~0xf4, i_317_);
									Class206.aStream_Sub2_2908.writeByte(i + 267, i_318_);
									Class206.aStream_Sub2_2908.writeByte(255, i_319_);
									Class206.aStream_Sub2_2908.writeByte(255, 255 - (0xff & aByteArray4620[i_308_]));
								}
							}
						}
						if (bool_274_) {
							short[] is;
							byte[] is_320_;
							short[] is_321_;
							short[] is_322_;
							if (f_ub != null) {
								is_321_ = ((Class122) f_ub).aShortArray1689;
								is = ((Class122) f_ub).aShortArray1682;
								is_320_ = ((Class122) f_ub).aByteArray1683;
								is_322_ = ((Class122) f_ub).aShortArray1687;
							} else {
								is = aShortArray4582;
								is_320_ = aByteArray4631;
								is_321_ = aShortArray4588;
								is_322_ = aShortArray4589;
							}
							float f = 3.0F / (float) aShort4628;
							((BufferStream) Class206.aStream_Sub2_2908).position = i_280_;
							float f_323_ = (3.0F / (float) (aShort4628 - -(aShort4628 / 2)));
							if (((Class260_Sub2) aClass260_Sub2_4636).aBool4392) {
								for (int i_324_ = 0; anInt4612 > i_324_; i_324_++) {
									int i_325_ = 0xff & is_320_[i_324_];
									if (i_325_ == 0) {
										Class206.aStream_Sub2_2908.method2595(f_323_ * (float) is_322_[i_324_], (byte) 98);
										Class206.aStream_Sub2_2908.method2595((float) is[i_324_] * f_323_, (byte) 98);
										Class206.aStream_Sub2_2908.method2595((float) is_321_[i_324_] * f_323_, (byte) 98);
									} else {
										float f_326_ = f / (float) i_325_;
										Class206.aStream_Sub2_2908.method2595((float) is_322_[i_324_] * f_326_, (byte) 98);
										Class206.aStream_Sub2_2908.method2595((float) is[i_324_] * f_326_, (byte) 98);
										Class206.aStream_Sub2_2908.method2595((float) is_321_[i_324_] * f_326_, (byte) 98);
									}
									((BufferStream) Class206.aStream_Sub2_2908).position += -12 + i_277_;
								}
							} else {
								for (int i_327_ = 0; ((anInt4612 ^ 0xffffffff) < (i_327_ ^ 0xffffffff)); i_327_++) {
									int i_328_ = is_320_[i_327_] & 0xff;
									if ((i_328_ ^ 0xffffffff) != -1) {
										float f_329_ = f / (float) i_328_;
										Class206.aStream_Sub2_2908.method2591(f_329_ * (float) is_322_[i_327_], i + 1739667516);
										Class206.aStream_Sub2_2908.method2591(f_329_ * (float) is[i_327_], 1739667504);
										Class206.aStream_Sub2_2908.method2591((float) is_321_[i_327_] * f_329_, 1739667504);
									} else {
										Class206.aStream_Sub2_2908.method2591((float) is_322_[i_327_] * f_323_, 1739667504);
										Class206.aStream_Sub2_2908.method2591((float) is[i_327_] * f_323_, i + 1739667516);
										Class206.aStream_Sub2_2908.method2591((float) is_321_[i_327_] * f_323_, 1739667504);
									}
									((BufferStream) Class206.aStream_Sub2_2908).position += -12 + i_277_;
								}
							}
						}
						if (bool_276_) {
							((BufferStream) Class206.aStream_Sub2_2908).position = i_281_;
							if (!((Class260_Sub2) aClass260_Sub2_4636).aBool4392) {
								for (int i_330_ = 0; ((i_330_ ^ 0xffffffff) > (anInt4612 ^ 0xffffffff)); i_330_++) {
									Class206.aStream_Sub2_2908.method2591(aFloatArray4619[i_330_], 1739667504);
									Class206.aStream_Sub2_2908.method2591(aFloatArray4575[i_330_], i + 1739667516);
									((BufferStream) Class206.aStream_Sub2_2908).position += -8 + i_277_;
								}
							} else {
								for (int i_331_ = 0; ((anInt4612 ^ 0xffffffff) < (i_331_ ^ 0xffffffff)); i_331_++) {
									Class206.aStream_Sub2_2908.method2595(aFloatArray4619[i_331_], (byte) 98);
									Class206.aStream_Sub2_2908.method2595(aFloatArray4575[i_331_], (byte) 98);
									((BufferStream) Class206.aStream_Sub2_2908).position += i_277_ - 8;
								}
							}
						}
						((BufferStream) Class206.aStream_Sub2_2908).position = anInt4612 * i_277_;
						Interface10 interface10;
						if (!bool) {
							interface10 = (aClass260_Sub2_4636.method1960(i + 12, ((BufferStream) Class206.aStream_Sub2_2908).position, (((BufferStream) Class206.aStream_Sub2_2908).buffer), false, i_277_));
							f_sb = true;
						} else {
							if (f_wc != null)
								f_wc.method33((byte) -85, (((BufferStream) Class206.aStream_Sub2_2908).position), i_277_, (((BufferStream) Class206.aStream_Sub2_2908).buffer));
							else
								f_wc = (aClass260_Sub2_4636.method1960(i ^ ~0xb, (((BufferStream) Class206.aStream_Sub2_2908).position), (((BufferStream) Class206.aStream_Sub2_2908).buffer), true, i_277_));
							interface10 = f_wc;
							f_qb = (byte) 0;
						}
						if (bool_275_) {
							((Class160) aClass160_4587).aByte2265 = i_278_;
							((Class160) aClass160_4587).anInterface10_2264 = interface10;
						}
						if (bool_276_) {
							((Class160) aClass160_4626).anInterface10_2264 = interface10;
							((Class160) aClass160_4626).aByte2265 = i_281_;
						}
						if (bool_273_) {
							((Class160) aClass160_4596).anInterface10_2264 = interface10;
							((Class160) aClass160_4596).aByte2265 = i_279_;
						}
						if (!bool_274_)
							break;
						((Class160) f_cc).aByte2265 = i_280_;
						((Class160) f_cc).anInterface10_2264 = interface10;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.SA(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void aa(int i) {
		do {
			try {
				anInt4625++;
				if (aClass160_4596 != null)
					((Class160) aClass160_4596).anInterface10_2264 = null;
				aShort4628 = (short) i;
				if (f_cc == null)
					break;
				((Class160) f_cc).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.aa(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean w() {
		try {
			anInt4599++;
			if (f_ac == null)
				return false;
			for (int i = 0; i < anInt4617; i++) {
				anIntArray4586[i] <<= 4;
				f_pc[i] <<= 4;
				anIntArray4609[i] <<= 4;
			}
			Class98.anInt1275 = 0;
			Class109_Sub2.anInt3815 = 0;
			Class246_Sub28_Sub18.anInt6515 = 0;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.w(" + ')');
		}
	}

	private final void method2034(Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1, int i) {
		try {
			anInt4633++;
			int i_332_ = 58 / ((i - 59) / 52);
			if (Class126.anIntArray1779.length < anInt4612) {
				Class126.anIntArray1779 = new int[anInt4612];
				Class94.anIntArray1234 = new int[anInt4612];
			}
			for (int i_333_ = 0; (i_333_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff); i_333_++) {
				int i_334_ = (-(((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7073) + (-((((Class260_Sub2) aClass260_Sub2_4636).anInt4335 * f_pc[i_333_]) >> 8) + anIntArray4586[i_333_] >> ((Class260_Sub2) aClass260_Sub2_4636).f_re));
				int i_335_ = (((anIntArray4609[i_333_] + -((((Class260_Sub2) aClass260_Sub2_4636).anInt4369 * f_pc[i_333_]) >> 8)) >> ((Class260_Sub2) aClass260_Sub2_4636).f_re) + -(((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7071));
				int i_336_ = anIntArray4630[i_333_];
				int i_337_ = anIntArray4630[i_333_ + 1];
				for (int i_338_ = i_336_; (i_338_ ^ 0xffffffff) > (i_337_ ^ 0xffffffff); i_338_++) {
					int i_339_ = -1 + f_fc[i_338_];
					if ((i_339_ ^ 0xffffffff) == 0)
						break;
					Class126.anIntArray1779[i_339_] = i_334_;
					Class94.anIntArray1234[i_339_] = i_335_;
				}
			}
			for (int i_340_ = 0; anInt4574 > i_340_; i_340_++) {
				if (aByteArray4620 == null || aByteArray4620[i_340_] <= 128) {
					short i_341_ = aShortArray4613[i_340_];
					short i_342_ = aShortArray4602[i_340_];
					short i_343_ = f_hb[i_340_];
					int i_344_ = Class126.anIntArray1779[i_341_];
					int i_345_ = Class126.anIntArray1779[i_342_];
					int i_346_ = Class126.anIntArray1779[i_343_];
					int i_347_ = Class94.anIntArray1234[i_341_];
					int i_348_ = Class94.anIntArray1234[i_342_];
					int i_349_ = Class94.anIntArray1234[i_343_];
					if (((-i_345_ + i_344_) * (i_348_ - i_349_) - (-i_345_ + i_346_) * (-i_347_ + i_348_)) > 0)
						class246_sub1_sub4_sub1.method2894(i_344_, i_348_, i_347_, false, i_345_, i_349_, i_346_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.CB(" + (class246_sub1_sub4_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final void method2035(boolean bool) {
		do {
			try {
				if (bool == false) {
					f_oc++;
					if (f_bc == null)
						break;
					Class_c_Sub1 class_c_sub1 = ((Class260_Sub2) aClass260_Sub2_4636).f_me;
					float f = aClass260_Sub2_4636.xa();
					float f_350_ = aClass260_Sub2_4636.W();
					aClass260_Sub2_4636.method1965((byte) 126);
					aClass260_Sub2_4636.method1750(false);
					aClass260_Sub2_4636.method1906(false, 115);
					aClass260_Sub2_4636.method1934(null, 126, null, ((Class260_Sub2) aClass260_Sub2_4636).aClass160_4342, ((Class260_Sub2) aClass260_Sub2_4636).aClass160_4349);
					for (int i = 0; f_ic > i; i++) {
						Class_j class_j = f_bc[i];
						Class69 class69 = f_jb[i];
						if (!((Class_j) class_j).aBool1478 || !aClass260_Sub2_4636.method1742()) {
							float f_351_ = ((float) ((anIntArray4586[((Class_j) class_j).anInt1472]) + ((anIntArray4586[(((Class_j) class_j).anInt1482)]) + (anIntArray4586[(((Class_j) class_j).anInt1480)]))) * 0.3333333F);
							float f_352_ = (0.3333333F * (float) ((f_pc[((Class_j) class_j).anInt1472]) + f_pc[(((Class_j) class_j).anInt1482)] + f_pc[(((Class_j) class_j).anInt1480)]));
							float f_353_ = ((float) ((anIntArray4609[((Class_j) class_j).anInt1482]) + (anIntArray4609[((Class_j) class_j).anInt1480]) - -(anIntArray4609[(((Class_j) class_j).anInt1472)])) * 0.3333333F);
							float f_354_ = (Class128_Sub1.aFloat5561 + (f_352_ * Class_o.aFloat7226 + (Class246_Sub28_Sub21.aFloat6586 * f_351_) + Class39.aFloat579 * f_353_));
							float f_355_ = (f_353_ * Class_v.aFloat1453 + (Class59_Sub4_Sub2.aFloat6845 * f_351_ + f_352_ * Class156.aFloat2244) + Class55.aFloat783);
							float f_356_ = (Class255.aFloat3654 + (f_353_ * Class63_Sub1.aFloat4718 + (f_351_ * Class246_Sub43.aFloat5603 + Canvas_Sub1.aFloat6894 * f_352_)));
							class_c_sub1.method2277(0, ((Class69) class69).anInt913, (((Class69) class69).anInt909 * ((Class_j) class_j).aShort1483) >> 7, (float) ((Class69) class69).anInt914 - f_355_, (((Class_j) class_j).aShort1475 * ((Class69) class69).anInt916) >> 7, (float) ((Class69) class69).anInt917 + f_354_, -f_356_);
							aClass260_Sub2_4636.method1942(class_c_sub1, -24);
							aClass260_Sub2_4636.g(f_350_, f - ((float) (((Class_j) class_j).anInt1473) * 1.5F));
							int i_357_ = ((Class69) class69).anInt911;
							OpenGL.glColor4ub((byte) (i_357_ >> 16), (byte) (i_357_ >> 8), (byte) i_357_, (byte) (i_357_ >> 24));
							aClass260_Sub2_4636.method1957(false, (((Class_j) class_j).aShort1484));
							aClass260_Sub2_4636.method1958(116, (((Class_j) class_j).aByte1476));
							aClass260_Sub2_4636.method1900(7681, (((Class_j) class_j).aByte1477));
							aClass260_Sub2_4636.method1925(1, 0, 7, 4);
						}
					}
					aClass260_Sub2_4636.g(f_350_, f);
					aClass260_Sub2_4636.method1750(true);
					aClass260_Sub2_4636.method1916(1);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.GB(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method671(Class_c class_c, Class130_Sub5 class130_sub5, int i, int i_358_) {
		try {
			f_ab++;
			if (anInt4612 != 0) {
				Class_c_Sub1 class_c_sub1 = ((Class260_Sub2) aClass260_Sub2_4636).f_hg;
				if (!aBool4606)
					method2038(16383);
				Class_c_Sub1 class_c_sub1_359_ = (Class_c_Sub1) class_c;
				Class255.aFloat3654 = ((((Class_c_Sub1) class_c_sub1).aFloat5363 * ((Class_c_Sub1) class_c_sub1_359_).aFloat5362) + ((((Class_c_Sub1) class_c_sub1).aFloat5378 * ((Class_c_Sub1) class_c_sub1_359_).aFloat5385) + (((Class_c_Sub1) class_c_sub1).aFloat5386 * ((Class_c_Sub1) class_c_sub1_359_).aFloat5393)) + ((Class_c_Sub1) class_c_sub1).aFloat5362);
				Canvas_Sub1.aFloat6894 = ((((Class_c_Sub1) class_c_sub1).aFloat5363 * ((Class_c_Sub1) class_c_sub1_359_).aFloat5378) + ((((Class_c_Sub1) class_c_sub1_359_).aFloat5387 * ((Class_c_Sub1) class_c_sub1).aFloat5386) + (((Class_c_Sub1) class_c_sub1_359_).aFloat5382 * ((Class_c_Sub1) class_c_sub1).aFloat5378)));
				float f = (Class255.aFloat3654 + (float) f_lb * Canvas_Sub1.aFloat6894);
				float f_360_ = ((float) aShort4614 * Canvas_Sub1.aFloat6894 + Class255.aFloat3654);
				float f_361_;
				float f_362_;
				if (f_360_ < f) {
					f_361_ = f + (float) aShort4605;
					f_362_ = f_360_ - (float) aShort4605;
				} else {
					f_361_ = (float) aShort4605 + f_360_;
					f_362_ = (float) -aShort4605 + f;
				}
				if (!(f_362_ >= ((Class260_Sub2) aClass260_Sub2_4636).aFloat4389) && !(f_361_ <= (float) (((Class260_Sub2) aClass260_Sub2_4636).f_cf))) {
					Class_o.aFloat7226 = ((((Class_c_Sub1) class_c_sub1).aFloat5372 * ((Class_c_Sub1) class_c_sub1_359_).aFloat5387) + (((Class_c_Sub1) class_c_sub1_359_).aFloat5382 * ((Class_c_Sub1) class_c_sub1).aFloat5387) + (((Class_c_Sub1) class_c_sub1).aFloat5388 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5378)));
					Class128_Sub1.aFloat5561 = (((Class_c_Sub1) class_c_sub1).aFloat5393 + ((((Class_c_Sub1) class_c_sub1_359_).aFloat5362 * ((Class_c_Sub1) class_c_sub1).aFloat5388) + ((((Class_c_Sub1) class_c_sub1).aFloat5387 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5385)) + ((((Class_c_Sub1) class_c_sub1_359_).aFloat5393) * (((Class_c_Sub1) class_c_sub1).aFloat5372)))));
					float f_363_ = (Class128_Sub1.aFloat5561 + (float) f_lb * Class_o.aFloat7226);
					float f_364_ = (Class_o.aFloat7226 * (float) aShort4614 + Class128_Sub1.aFloat5561);
					float f_365_;
					float f_366_;
					if (f_364_ < f_363_) {
						f_365_ = ((f_363_ + (float) aShort4605) * (float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366));
						f_366_ = ((float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * (f_364_ - (float) aShort4605));
					} else {
						f_365_ = ((float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * (f_364_ + (float) aShort4605));
						f_366_ = ((float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * ((float) -aShort4605 + f_363_));
					}
					if (!(f_366_ / (float) i >= ((Class260_Sub2) aClass260_Sub2_4636).aFloat4344) && !(f_365_ / (float) i <= (((Class260_Sub2) aClass260_Sub2_4636).aFloat4383))) {
						Class156.aFloat2244 = ((((Class_c_Sub1) class_c_sub1).aFloat5364 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5387)) + (((Class_c_Sub1) class_c_sub1).aFloat5382 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5382)) + (((Class_c_Sub1) class_c_sub1).aFloat5367 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5378)));
						Class55.aFloat783 = (((Class_c_Sub1) class_c_sub1).aFloat5385 + (((((Class_c_Sub1) class_c_sub1_359_).aFloat5385) * ((Class_c_Sub1) class_c_sub1).aFloat5382) + ((((Class_c_Sub1) class_c_sub1_359_).aFloat5393) * (((Class_c_Sub1) class_c_sub1).aFloat5364)) + (((Class_c_Sub1) class_c_sub1).aFloat5367 * (((Class_c_Sub1) class_c_sub1_359_).aFloat5362))));
						float f_367_ = (Class55.aFloat783 + Class156.aFloat2244 * (float) f_lb);
						float f_368_ = (Class55.aFloat783 + Class156.aFloat2244 * (float) aShort4614);
						float f_369_;
						float f_370_;
						if (f_367_ > f_368_) {
							f_370_ = (((float) -aShort4605 + f_368_) * (float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf);
							f_369_ = (((float) aShort4605 + f_367_) * (float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf);
						} else {
							f_369_ = ((f_368_ + (float) aShort4605) * (float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf);
							f_370_ = ((f_367_ - (float) aShort4605) * (float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf);
						}
						if (!(((Class260_Sub2) aClass260_Sub2_4636).aFloat4361 <= f_370_ / (float) i) && !(((Class260_Sub2) aClass260_Sub2_4636).f_qf >= f_369_ / (float) i)) {
							if (class130_sub5 != null || f_bc != null) {
								Class63_Sub1.aFloat4718 = (((((Class_c_Sub1) class_c_sub1_359_).aFloat5363) * (((Class_c_Sub1) class_c_sub1).aFloat5363)) + (((((Class_c_Sub1) class_c_sub1_359_).aFloat5388) * (((Class_c_Sub1) class_c_sub1).aFloat5386)) + ((((Class_c_Sub1) class_c_sub1).aFloat5378) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5367))));
								Class246_Sub28_Sub21.aFloat6586 = (((((Class_c_Sub1) class_c_sub1).aFloat5372) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1).aFloat5387) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5364)) + ((((Class_c_Sub1) class_c_sub1_359_).aFloat5386) * (((Class_c_Sub1) class_c_sub1).aFloat5388)));
								Class246_Sub43.aFloat5603 = (((((Class_c_Sub1) class_c_sub1_359_).aFloat5364) * (((Class_c_Sub1) class_c_sub1).aFloat5378)) + ((((Class_c_Sub1) class_c_sub1).aFloat5386) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1).aFloat5363) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5386)));
								Class59_Sub4_Sub2.aFloat6845 = (((((Class_c_Sub1) class_c_sub1_359_).aFloat5386) * (((Class_c_Sub1) class_c_sub1).aFloat5367)) + (((((Class_c_Sub1) class_c_sub1_359_).aFloat5372) * (((Class_c_Sub1) class_c_sub1).aFloat5364)) + (((Class_c_Sub1) class_c_sub1_359_).aFloat5364 * (((Class_c_Sub1) class_c_sub1).aFloat5382))));
								Class_v.aFloat1453 = (((((Class_c_Sub1) class_c_sub1_359_).aFloat5367) * (((Class_c_Sub1) class_c_sub1).aFloat5382)) + ((((Class_c_Sub1) class_c_sub1).aFloat5364) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5388)) + ((((Class_c_Sub1) class_c_sub1).aFloat5367) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5363)));
								Class39.aFloat579 = (((((Class_c_Sub1) class_c_sub1).aFloat5388) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5363)) + (((((Class_c_Sub1) class_c_sub1_359_).aFloat5388) * (((Class_c_Sub1) class_c_sub1).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1).aFloat5387) * (((Class_c_Sub1) class_c_sub1_359_).aFloat5367))));
							}
							if (class130_sub5 != null) {
								int i_371_ = aShort4638 + aShort4622 >> 1;
								int i_372_ = f_eb - -aShort4590 >> 1;
								int i_373_ = (int) (Class39.aFloat579 * (float) i_372_ + (((float) f_lb * Class_o.aFloat7226) + (((float) i_371_ * (Class246_Sub28_Sub21.aFloat6586)) + (Class128_Sub1.aFloat5561))));
								int i_374_ = (int) (((float) i_371_ * Class59_Sub4_Sub2.aFloat6845) + Class55.aFloat783 + (Class156.aFloat2244 * (float) f_lb) + (Class_v.aFloat1453 * (float) i_372_));
								int i_375_ = (int) (((float) i_372_ * Class63_Sub1.aFloat4718) + (((float) i_371_ * Class246_Sub43.aFloat5603) + Class255.aFloat3654 + (Canvas_Sub1.aFloat6894 * (float) f_lb)));
								int i_376_ = (int) ((float) i_372_ * Class39.aFloat579 + (((float) i_371_ * (Class246_Sub28_Sub21.aFloat6586)) + Class128_Sub1.aFloat5561 + ((float) aShort4614 * Class_o.aFloat7226)));
								int i_377_ = (int) (Class55.aFloat783 + (Class59_Sub4_Sub2.aFloat6845 * (float) i_371_) + (Class156.aFloat2244 * (float) aShort4614) + ((float) i_372_ * Class_v.aFloat1453));
								((Class130_Sub5) class130_sub5).anInt4813 = ((((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * i_373_ / i + (((Class260_Sub2) aClass260_Sub2_4636).f_vf));
								((Class130_Sub5) class130_sub5).anInt4811 = (i_374_ * ((Class260_Sub2) aClass260_Sub2_4636).f_tf / i + (((Class260_Sub2) aClass260_Sub2_4636).anInt4339));
								((Class130_Sub5) class130_sub5).anInt4815 = ((((Class260_Sub2) aClass260_Sub2_4636).f_vf) + i_376_ * (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) / i);
								((Class130_Sub5) class130_sub5).anInt4812 = ((((Class260_Sub2) aClass260_Sub2_4636).anInt4339) - -(i_377_ * ((Class260_Sub2) aClass260_Sub2_4636).f_tf / i));
								int i_378_ = (int) (((float) aShort4614 * Canvas_Sub1.aFloat6894) + ((Class246_Sub43.aFloat5603 * (float) i_371_) + Class255.aFloat3654) + ((float) i_372_ * Class63_Sub1.aFloat4718));
								if (i_375_ < ((Class260_Sub2) aClass260_Sub2_4636).f_cf && (((Class260_Sub2) aClass260_Sub2_4636).f_cf) > i_378_) {
									((Class130_Sub5) class130_sub5).anInt4816 = (-(((Class130_Sub5) class130_sub5).anInt4813) + ((Class260_Sub2) aClass260_Sub2_4636).f_vf - -(((Class260_Sub2) aClass260_Sub2_4636).anInt4366 * (aShort4605 + i_373_) / i));
									((Class130_Sub5) class130_sub5).aBool4814 = true;
								}
							}
							aClass260_Sub2_4636.method1937((float) i, (byte) 97);
							aClass260_Sub2_4636.method1928(true);
							aClass260_Sub2_4636.method1948(0, class_c_sub1_359_);
							method2031(false);
							aClass260_Sub2_4636.method1916(1);
							method2035(false);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.A(" + (class_c != null ? "{...}" : "null") + ',' + (class130_sub5 != null ? "{...}" : "null") + ',' + i + ',' + i_358_ + ')'));
		}
	}

	final void JA(int i, int i_379_, int i_380_) {
		try {
			for (int i_381_ = 0; (i_381_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff); i_381_++) {
				if ((i ^ 0xffffffff) != -1)
					anIntArray4586[i_381_] += i;
				if ((i_379_ ^ 0xffffffff) != -1)
					f_pc[i_381_] += i_379_;
				if (i_380_ != 0)
					anIntArray4609[i_381_] += i_380_;
			}
			f_uc++;
			if (aClass160_4587 != null)
				((Class160) aClass160_4587).anInterface10_2264 = null;
			aBool4606 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.JA(" + i + ',' + i_379_ + ',' + i_380_ + ')'));
		}
	}

	private final Class_t method2036(int i, int i_382_, Class_t_Sub1 class_t_sub1_383_, boolean bool, Class_t_Sub1 class_t_sub1_384_, boolean bool_385_) {
		try {
			class_t_sub1_384_.f_tc = f_tc;
			class_t_sub1_384_.anInt4617 = anInt4617;
			class_t_sub1_384_.anInt4639 = anInt4639;
			class_t_sub1_384_.f_ic = f_ic;
			class_t_sub1_384_.anInt4616 = anInt4616;
			class_t_sub1_384_.anInt4621 = i_382_;
			class_t_sub1_384_.anInt4612 = anInt4612;
			anInt4578++;
			class_t_sub1_384_.aShort4628 = aShort4628;
			class_t_sub1_384_.anInt4574 = anInt4574;
			class_t_sub1_384_.f_qb = (byte) 0;
			class_t_sub1_384_.f_kc = f_kc;
			boolean bool_386_ = Class59_Sub2_Sub3.method2720(anInt4616, i_382_, 2);
			boolean bool_387_ = Class246_Sub28_Sub14.method2633(i_382_, i + -1376317715, anInt4616);
			boolean bool_388_ = Class46.method310((byte) 101, i_382_, anInt4616);
			boolean bool_389_ = bool_386_ | bool_387_ | bool_388_;
			if (!bool_389_) {
				class_t_sub1_384_.anIntArray4609 = anIntArray4609;
				class_t_sub1_384_.f_pc = f_pc;
				class_t_sub1_384_.anIntArray4586 = anIntArray4586;
			} else {
				if (bool_386_) {
					if (class_t_sub1_383_.anIntArray4586 == null || class_t_sub1_383_.anIntArray4586.length < anInt4617)
						class_t_sub1_384_.anIntArray4586 = class_t_sub1_383_.anIntArray4586 = new int[anInt4617];
					else
						class_t_sub1_384_.anIntArray4586 = class_t_sub1_383_.anIntArray4586;
				} else
					class_t_sub1_384_.anIntArray4586 = anIntArray4586;
				if (bool_387_) {
					if (class_t_sub1_383_.f_pc == null || class_t_sub1_383_.f_pc.length < anInt4617)
						class_t_sub1_384_.f_pc = class_t_sub1_383_.f_pc = new int[anInt4617];
					else
						class_t_sub1_384_.f_pc = class_t_sub1_383_.f_pc;
				} else
					class_t_sub1_384_.f_pc = f_pc;
				if (bool_388_) {
					if (class_t_sub1_383_.anIntArray4609 != null && (class_t_sub1_383_.anIntArray4609.length >= anInt4617))
						class_t_sub1_384_.anIntArray4609 = class_t_sub1_383_.anIntArray4609;
					else
						class_t_sub1_384_.anIntArray4609 = class_t_sub1_383_.anIntArray4609 = new int[anInt4617];
				} else
					class_t_sub1_384_.anIntArray4609 = anIntArray4609;
				for (int i_390_ = 0; (anInt4617 ^ 0xffffffff) < (i_390_ ^ 0xffffffff); i_390_++) {
					if (bool_386_)
						class_t_sub1_384_.anIntArray4586[i_390_] = anIntArray4586[i_390_];
					if (bool_387_)
						class_t_sub1_384_.f_pc[i_390_] = f_pc[i_390_];
					if (bool_388_)
						class_t_sub1_384_.anIntArray4609[i_390_] = anIntArray4609[i_390_];
				}
			}
			if (!Class147.method996(anInt4616, -1, i_382_)) {
				if (Class241.method1544(anInt4616, (byte) 122, i_382_))
					class_t_sub1_384_.aClass160_4587 = aClass160_4587;
				else
					class_t_sub1_384_.aClass160_4587 = null;
			} else {
				class_t_sub1_384_.aClass160_4587 = class_t_sub1_383_.aClass160_4587;
				if (bool_385_)
					class_t_sub1_384_.f_qb |= 0x1;
				((Class160) class_t_sub1_384_.aClass160_4587).aByte2265 = ((Class160) aClass160_4587).aByte2265;
				((Class160) class_t_sub1_384_.aClass160_4587).anInterface10_2264 = ((Class160) aClass160_4587).anInterface10_2264;
			}
			if (!Class59_Sub2_Sub2.method2545(anInt4616, i_382_, (byte) -91))
				class_t_sub1_384_.aShortArray4581 = aShortArray4581;
			else {
				if (class_t_sub1_383_.aShortArray4581 != null && ((class_t_sub1_383_.aShortArray4581.length ^ 0xffffffff) <= (f_kc ^ 0xffffffff)))
					class_t_sub1_384_.aShortArray4581 = class_t_sub1_383_.aShortArray4581;
				else
					class_t_sub1_384_.aShortArray4581 = class_t_sub1_383_.aShortArray4581 = new short[f_kc];
				for (int i_391_ = 0; (f_kc ^ 0xffffffff) < (i_391_ ^ 0xffffffff); i_391_++)
					class_t_sub1_384_.aShortArray4581[i_391_] = aShortArray4581[i_391_];
			}
			if (!Class246_Sub1_Sub5.method2470(i_382_, anInt4616, (byte) -60))
				class_t_sub1_384_.aByteArray4620 = aByteArray4620;
			else {
				if (class_t_sub1_383_.aByteArray4620 != null && f_kc <= class_t_sub1_383_.aByteArray4620.length)
					class_t_sub1_384_.aByteArray4620 = class_t_sub1_383_.aByteArray4620;
				else
					class_t_sub1_384_.aByteArray4620 = class_t_sub1_383_.aByteArray4620 = new byte[f_kc];
				for (int i_392_ = 0; i_392_ < f_kc; i_392_++)
					class_t_sub1_384_.aByteArray4620[i_392_] = aByteArray4620[i_392_];
			}
			if (!Class6.method71(-20147, anInt4616, i_382_)) {
				if (Class246_Sub6.method1818(anInt4616, i_382_, i ^ 0x147d))
					class_t_sub1_384_.aClass160_4596 = aClass160_4596;
				else
					class_t_sub1_384_.aClass160_4596 = null;
			} else {
				if (bool_385_)
					class_t_sub1_384_.f_qb |= 0x2;
				class_t_sub1_384_.aClass160_4596 = class_t_sub1_383_.aClass160_4596;
				((Class160) class_t_sub1_384_.aClass160_4596).aByte2265 = ((Class160) aClass160_4596).aByte2265;
				((Class160) class_t_sub1_384_.aClass160_4596).anInterface10_2264 = ((Class160) aClass160_4596).anInterface10_2264;
			}
			if (Class40_Sub3.method1863(anInt4616, -127, i_382_)) {
				if (class_t_sub1_383_.aShortArray4589 != null && ((class_t_sub1_383_.aShortArray4589.length ^ 0xffffffff) <= (anInt4612 ^ 0xffffffff))) {
					class_t_sub1_384_.aShortArray4589 = class_t_sub1_383_.aShortArray4589;
					class_t_sub1_384_.aShortArray4582 = class_t_sub1_383_.aShortArray4582;
					class_t_sub1_384_.aShortArray4588 = class_t_sub1_383_.aShortArray4588;
				} else {
					int i_393_ = anInt4612;
					class_t_sub1_384_.aShortArray4589 = class_t_sub1_383_.aShortArray4589 = new short[i_393_];
					class_t_sub1_384_.aShortArray4588 = class_t_sub1_383_.aShortArray4588 = new short[i_393_];
					class_t_sub1_384_.aShortArray4582 = class_t_sub1_383_.aShortArray4582 = new short[i_393_];
				}
				if (f_ub == null) {
					for (int i_394_ = 0; i_394_ < anInt4612; i_394_++) {
						class_t_sub1_384_.aShortArray4589[i_394_] = aShortArray4589[i_394_];
						class_t_sub1_384_.aShortArray4582[i_394_] = aShortArray4582[i_394_];
						class_t_sub1_384_.aShortArray4588[i_394_] = aShortArray4588[i_394_];
					}
				} else {
					if (class_t_sub1_383_.f_ub == null)
						class_t_sub1_383_.f_ub = new Class122();
					Class122 class122 = class_t_sub1_384_.f_ub = class_t_sub1_383_.f_ub;
					if (((Class122) class122).aShortArray1687 == null || (((Class122) class122).aShortArray1687.length ^ 0xffffffff) > (anInt4612 ^ 0xffffffff)) {
						int i_395_ = anInt4612;
						((Class122) class122).aShortArray1687 = new short[i_395_];
						((Class122) class122).aByteArray1683 = new byte[i_395_];
						((Class122) class122).aShortArray1689 = new short[i_395_];
						((Class122) class122).aShortArray1682 = new short[i_395_];
					}
					for (int i_396_ = 0; i_396_ < anInt4612; i_396_++) {
						class_t_sub1_384_.aShortArray4589[i_396_] = aShortArray4589[i_396_];
						class_t_sub1_384_.aShortArray4582[i_396_] = aShortArray4582[i_396_];
						class_t_sub1_384_.aShortArray4588[i_396_] = aShortArray4588[i_396_];
						((Class122) class122).aShortArray1687[i_396_] = ((Class122) f_ub).aShortArray1687[i_396_];
						((Class122) class122).aShortArray1682[i_396_] = ((Class122) f_ub).aShortArray1682[i_396_];
						((Class122) class122).aShortArray1689[i_396_] = ((Class122) f_ub).aShortArray1689[i_396_];
						((Class122) class122).aByteArray1683[i_396_] = ((Class122) f_ub).aByteArray1683[i_396_];
					}
				}
				class_t_sub1_384_.aByteArray4631 = aByteArray4631;
			} else {
				class_t_sub1_384_.aByteArray4631 = aByteArray4631;
				class_t_sub1_384_.aShortArray4582 = aShortArray4582;
				class_t_sub1_384_.aShortArray4588 = aShortArray4588;
				class_t_sub1_384_.f_ub = f_ub;
				class_t_sub1_384_.aShortArray4589 = aShortArray4589;
			}
			if (!Class125.method858(anInt4616, i_382_, 25926)) {
				if (!Class246_Sub7.method1835(i_382_, anInt4616, 124))
					class_t_sub1_384_.f_cc = null;
				else
					class_t_sub1_384_.f_cc = f_cc;
			} else {
				if (bool_385_)
					class_t_sub1_384_.f_qb |= 0x4;
				class_t_sub1_384_.f_cc = class_t_sub1_383_.f_cc;
				((Class160) class_t_sub1_384_.f_cc).anInterface10_2264 = ((Class160) f_cc).anInterface10_2264;
				((Class160) class_t_sub1_384_.f_cc).aByte2265 = ((Class160) f_cc).aByte2265;
			}
			if (!Class152.method1012(i_382_, -124, anInt4616)) {
				class_t_sub1_384_.aFloatArray4619 = aFloatArray4619;
				class_t_sub1_384_.aFloatArray4575 = aFloatArray4575;
			} else {
				if (class_t_sub1_383_.aFloatArray4619 != null && ((class_t_sub1_383_.aFloatArray4619.length ^ 0xffffffff) <= (f_kc ^ 0xffffffff))) {
					class_t_sub1_384_.aFloatArray4575 = class_t_sub1_383_.aFloatArray4575;
					class_t_sub1_384_.aFloatArray4619 = class_t_sub1_383_.aFloatArray4619;
				} else {
					int i_397_ = anInt4612;
					class_t_sub1_384_.aFloatArray4619 = class_t_sub1_383_.aFloatArray4619 = new float[i_397_];
					class_t_sub1_384_.aFloatArray4575 = class_t_sub1_383_.aFloatArray4575 = new float[i_397_];
				}
				for (int i_398_ = 0; (i_398_ ^ 0xffffffff) > (anInt4612 ^ 0xffffffff); i_398_++) {
					class_t_sub1_384_.aFloatArray4619[i_398_] = aFloatArray4619[i_398_];
					class_t_sub1_384_.aFloatArray4575[i_398_] = aFloatArray4575[i_398_];
				}
			}
			if (i != 5126)
				f_bc = null;
			if (!Class_b.method568(i_382_, anInt4616, (byte) -50)) {
				if (Class3.method51(i_382_, anInt4616, -125))
					class_t_sub1_384_.aClass160_4626 = aClass160_4626;
				else
					class_t_sub1_384_.aClass160_4626 = null;
			} else {
				if (bool_385_)
					class_t_sub1_384_.f_qb |= 0x8;
				class_t_sub1_384_.aClass160_4626 = class_t_sub1_383_.aClass160_4626;
				((Class160) class_t_sub1_384_.aClass160_4626).aByte2265 = ((Class160) aClass160_4626).aByte2265;
				((Class160) class_t_sub1_384_.aClass160_4626).anInterface10_2264 = ((Class160) aClass160_4626).anInterface10_2264;
			}
			if (Class51.method335(i_382_, (byte) 118, anInt4616)) {
				if (class_t_sub1_383_.aShortArray4613 != null && class_t_sub1_383_.aShortArray4613.length >= f_kc) {
					class_t_sub1_384_.f_hb = class_t_sub1_383_.f_hb;
					class_t_sub1_384_.aShortArray4602 = class_t_sub1_383_.aShortArray4602;
					class_t_sub1_384_.aShortArray4613 = class_t_sub1_383_.aShortArray4613;
				} else {
					int i_399_ = f_kc;
					class_t_sub1_384_.f_hb = class_t_sub1_383_.f_hb = new short[i_399_];
					class_t_sub1_384_.aShortArray4602 = class_t_sub1_383_.aShortArray4602 = new short[i_399_];
					class_t_sub1_384_.aShortArray4613 = class_t_sub1_383_.aShortArray4613 = new short[i_399_];
				}
				for (int i_400_ = 0; (i_400_ ^ 0xffffffff) > (f_kc ^ 0xffffffff); i_400_++) {
					class_t_sub1_384_.aShortArray4613[i_400_] = aShortArray4613[i_400_];
					class_t_sub1_384_.aShortArray4602[i_400_] = aShortArray4602[i_400_];
					class_t_sub1_384_.f_hb[i_400_] = f_hb[i_400_];
				}
			} else {
				class_t_sub1_384_.aShortArray4602 = aShortArray4602;
				class_t_sub1_384_.f_hb = f_hb;
				class_t_sub1_384_.aShortArray4613 = aShortArray4613;
			}
			if (!Class160.method1062(i_382_, anInt4616, 0)) {
				if (Class223.method1437(anInt4616, i_382_, (byte) -32))
					class_t_sub1_384_.aClass218_4594 = aClass218_4594;
				else
					class_t_sub1_384_.aClass218_4594 = null;
			} else {
				if (bool_385_)
					class_t_sub1_384_.f_qb |= 0x10;
				class_t_sub1_384_.aClass218_4594 = class_t_sub1_383_.aClass218_4594;
				((Class218) class_t_sub1_384_.aClass218_4594).anInterface1_3032 = ((Class218) aClass218_4594).anInterface1_3032;
			}
			if (!Class100_Sub1.method2174(i_382_, anInt4616, (byte) -99))
				class_t_sub1_384_.f_tb = f_tb;
			else {
				if (class_t_sub1_383_.f_tb == null || class_t_sub1_383_.f_tb.length < f_kc) {
					int i_401_ = f_kc;
					class_t_sub1_384_.f_tb = class_t_sub1_383_.f_tb = new short[i_401_];
				} else
					class_t_sub1_384_.f_tb = class_t_sub1_383_.f_tb;
				for (int i_402_ = 0; (f_kc ^ 0xffffffff) < (i_402_ ^ 0xffffffff); i_402_++)
					class_t_sub1_384_.f_tb[i_402_] = f_tb[i_402_];
			}
			if (Class59_Sub1_Sub3.method2640(anInt4616, i_382_, true)) {
				if (class_t_sub1_383_.f_jb == null || ((class_t_sub1_383_.f_jb.length ^ 0xffffffff) > (f_ic ^ 0xffffffff))) {
					int i_403_ = f_ic;
					class_t_sub1_384_.f_jb = class_t_sub1_383_.f_jb = new Class69[i_403_];
					for (int i_404_ = 0; (f_ic ^ 0xffffffff) < (i_404_ ^ 0xffffffff); i_404_++)
						class_t_sub1_384_.f_jb[i_404_] = f_jb[i_404_].method450(23495);
				} else {
					class_t_sub1_384_.f_jb = class_t_sub1_383_.f_jb;
					for (int i_405_ = 0; f_ic > i_405_; i_405_++)
						class_t_sub1_384_.f_jb[i_405_].method447(128, f_jb[i_405_]);
				}
			} else
				class_t_sub1_384_.f_jb = f_jb;
			class_t_sub1_384_.aClass162Array4627 = aClass162Array4627;
			class_t_sub1_384_.f_bc = f_bc;
			class_t_sub1_384_.aShortArray4595 = aShortArray4595;
			class_t_sub1_384_.f_fc = f_fc;
			class_t_sub1_384_.anIntArrayArray4585 = anIntArrayArray4585;
			class_t_sub1_384_.anIntArray4640 = anIntArray4640;
			class_t_sub1_384_.aClass19Array4629 = aClass19Array4629;
			if (!aBool4606)
				class_t_sub1_384_.aBool4606 = false;
			else {
				class_t_sub1_384_.f_lb = f_lb;
				class_t_sub1_384_.aShort4622 = aShort4622;
				class_t_sub1_384_.aShort4638 = aShort4638;
				class_t_sub1_384_.f_eb = f_eb;
				class_t_sub1_384_.aShort4605 = aShort4605;
				class_t_sub1_384_.aBool4606 = true;
				class_t_sub1_384_.aShort4614 = aShort4614;
				class_t_sub1_384_.aShort4590 = aShort4590;
			}
			class_t_sub1_384_.anIntArrayArray4579 = anIntArrayArray4579;
			class_t_sub1_384_.anIntArray4630 = anIntArray4630;
			class_t_sub1_384_.f_ac = f_ac;
			class_t_sub1_384_.aShortArray4576 = aShortArray4576;
			return class_t_sub1_384_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.QA(" + i + ',' + i_382_ + ',' + (class_t_sub1_383_ != null ? "{...}" : "null") + ',' + bool + ',' + (class_t_sub1_384_ != null ? "{...}" : "null") + ',' + bool_385_ + ')'));
		}
	}

	final void H(int i, int i_406_, int i_407_) {
		try {
			for (int i_408_ = 0; (anInt4639 ^ 0xffffffff) < (i_408_ ^ 0xffffffff); i_408_++) {
				if ((i ^ 0xffffffff) != -129)
					anIntArray4586[i_408_] = anIntArray4586[i_408_] * i >> 7;
				if (i_406_ != 128)
					f_pc[i_408_] = i_406_ * f_pc[i_408_] >> 7;
				if (i_407_ != 128)
					anIntArray4609[i_408_] = i_407_ * anIntArray4609[i_408_] >> 7;
			}
			anInt4600++;
			if (aClass160_4587 != null)
				((Class160) aClass160_4587).anInterface10_2264 = null;
			aBool4606 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.H(" + i + ',' + i_406_ + ',' + i_407_ + ')'));
		}
	}

	final void M(int i, int[] is, int i_409_, int i_410_, int i_411_, boolean bool, int i_412_, int[] is_413_) {
		try {
			f_hc++;
			int i_414_ = is.length;
			if ((i ^ 0xffffffff) == -1) {
				i_409_ <<= 4;
				i_411_ <<= 4;
				i_410_ <<= 4;
				Class98.anInt1275 = 0;
				Class109_Sub2.anInt3815 = 0;
				int i_415_ = 0;
				Class246_Sub28_Sub18.anInt6515 = 0;
				for (int i_416_ = 0; i_414_ > i_416_; i_416_++) {
					int i_417_ = is[i_416_];
					if ((f_ac.length ^ 0xffffffff) < (i_417_ ^ 0xffffffff)) {
						int[] is_418_ = f_ac[i_417_];
						for (int i_419_ = 0; i_419_ < is_418_.length; i_419_++) {
							int i_420_ = is_418_[i_419_];
							if (aShortArray4576 == null || (aShortArray4576[i_420_] & i_412_ ^ 0xffffffff) != -1) {
								Class109_Sub2.anInt3815 += anIntArray4586[i_420_];
								Class98.anInt1275 += f_pc[i_420_];
								Class246_Sub28_Sub18.anInt6515 += anIntArray4609[i_420_];
								i_415_++;
							}
						}
					}
				}
				if (i_415_ > 0) {
					Class246_Sub1_Sub7.aBool6033 = true;
					Class109_Sub2.anInt3815 = i_409_ + Class109_Sub2.anInt3815 / i_415_;
					Class98.anInt1275 = Class98.anInt1275 / i_415_ - -i_410_;
					Class246_Sub28_Sub18.anInt6515 = Class246_Sub28_Sub18.anInt6515 / i_415_ - -i_411_;
				} else {
					Class98.anInt1275 = i_410_;
					Class109_Sub2.anInt3815 = i_409_;
					Class246_Sub28_Sub18.anInt6515 = i_411_;
				}
			} else if (i == 1) {
				if (is_413_ != null) {
					int i_421_ = ((16384 + is_413_[0] * i_409_ - -(i_410_ * is_413_[1]) + is_413_[2] * i_411_) >> 15);
					int i_422_ = ((16384 + (is_413_[5] * i_411_ + is_413_[3] * i_409_) - -(i_410_ * is_413_[4])) >> 15);
					int i_423_ = ((16384 + is_413_[6] * i_409_ + (i_410_ * is_413_[7] + is_413_[8] * i_411_)) >> 15);
					i_409_ = i_421_;
					i_411_ = i_423_;
					i_410_ = i_422_;
				}
				i_411_ <<= 4;
				i_410_ <<= 4;
				i_409_ <<= 4;
				for (int i_424_ = 0; i_414_ > i_424_; i_424_++) {
					int i_425_ = is[i_424_];
					if (i_425_ < f_ac.length) {
						int[] is_426_ = f_ac[i_425_];
						for (int i_427_ = 0; ((is_426_.length ^ 0xffffffff) < (i_427_ ^ 0xffffffff)); i_427_++) {
							int i_428_ = is_426_[i_427_];
							if (aShortArray4576 == null || (i_412_ & aShortArray4576[i_428_]) != 0) {
								anIntArray4586[i_428_] += i_409_;
								f_pc[i_428_] += i_410_;
								anIntArray4609[i_428_] += i_411_;
							}
						}
					}
				}
			} else if (i == 2) {
				if (is_413_ != null) {
					int i_429_ = is_413_[9] << 4;
					int i_430_ = is_413_[10] << 4;
					int i_431_ = is_413_[11] << 4;
					int i_432_ = is_413_[12] << 4;
					int i_433_ = is_413_[13] << 4;
					int i_434_ = is_413_[14] << 4;
					if (Class246_Sub1_Sub7.aBool6033) {
						int i_435_ = ((Class109_Sub2.anInt3815 * is_413_[0] - -(is_413_[3] * Class98.anInt1275) + (Class246_Sub28_Sub18.anInt6515 * is_413_[6] + 16384)) >> 15);
						int i_436_ = ((Class246_Sub28_Sub18.anInt6515 * is_413_[7] + (Class109_Sub2.anInt3815 * is_413_[1] + (Class98.anInt1275 * is_413_[4] + 16384))) >> 15);
						i_436_ += i_433_;
						i_435_ += i_432_;
						int i_437_ = ((Class98.anInt1275 * is_413_[5] + is_413_[2] * Class109_Sub2.anInt3815 + Class246_Sub28_Sub18.anInt6515 * is_413_[8] + 16384) >> 15);
						i_437_ += i_434_;
						Class109_Sub2.anInt3815 = i_435_;
						Class98.anInt1275 = i_436_;
						Class246_Sub1_Sub7.aBool6033 = false;
						Class246_Sub28_Sub18.anInt6515 = i_437_;
					}
					int[] is_438_ = new int[9];
					int i_439_ = Class39_Sub1.anIntArray4672[i_409_];
					int i_440_ = Class39_Sub1.f_fb[i_409_];
					int i_441_ = Class39_Sub1.anIntArray4672[i_410_];
					int i_442_ = Class39_Sub1.f_fb[i_410_];
					int i_443_ = Class39_Sub1.anIntArray4672[i_411_];
					int i_444_ = Class39_Sub1.f_fb[i_411_];
					int i_445_ = i_443_ * i_440_ + 16384 >> 15;
					int i_446_ = 16384 + i_444_ * i_440_ >> 15;
					is_438_[3] = 16384 + i_444_ * i_439_ >> 15;
					is_438_[6] = 16384 + (i_441_ * i_446_ + i_443_ * -i_442_) >> 15;
					is_438_[5] = -i_440_;
					is_438_[2] = i_439_ * i_442_ + 16384 >> 15;
					is_438_[8] = 16384 + i_441_ * i_439_ >> 15;
					is_438_[1] = 16384 + (i_442_ * i_445_ + -i_441_ * i_444_) >> 15;
					is_438_[7] = 16384 + (i_444_ * i_442_ + i_445_ * i_441_) >> 15;
					is_438_[0] = 16384 + i_446_ * i_442_ + i_441_ * i_443_ >> 15;
					is_438_[4] = 16384 + i_439_ * i_443_ >> 15;
					int i_447_ = ((is_438_[1] * -Class98.anInt1275 + -Class109_Sub2.anInt3815 * is_438_[0] - (-(-Class246_Sub28_Sub18.anInt6515 * is_438_[2]) - 16384)) >> 15);
					int i_448_ = ((-Class246_Sub28_Sub18.anInt6515 * is_438_[5] + (is_438_[4] * -Class98.anInt1275 + (is_438_[3] * -Class109_Sub2.anInt3815 + 16384))) >> 15);
					int i_449_ = ((16384 + is_438_[6] * -Class109_Sub2.anInt3815 - -(is_438_[7] * -Class98.anInt1275) + -Class246_Sub28_Sub18.anInt6515 * is_438_[8]) >> 15);
					int i_450_ = Class109_Sub2.anInt3815 + i_447_;
					int i_451_ = i_448_ + Class98.anInt1275;
					int i_452_ = i_449_ - -Class246_Sub28_Sub18.anInt6515;
					int[] is_453_ = new int[9];
					for (int i_454_ = 0; i_454_ < 3; i_454_++) {
						for (int i_455_ = 0; i_455_ < 3; i_455_++) {
							int i_456_ = 0;
							for (int i_457_ = 0; i_457_ < 3; i_457_++)
								i_456_ += (is_438_[i_457_ + i_454_ * 3] * is_413_[i_457_ + i_455_ * 3]);
							is_453_[3 * i_454_ - -i_455_] = i_456_ + 16384 >> 15;
						}
					}
					int i_458_ = ((16384 + i_434_ * is_438_[2] + (is_438_[1] * i_433_ + is_438_[0] * i_432_)) >> 15);
					int i_459_ = ((i_434_ * is_438_[5] + is_438_[3] * i_432_ - (-(is_438_[4] * i_433_) - 16384)) >> 15);
					i_458_ += i_450_;
					i_459_ += i_451_;
					int i_460_ = ((16384 + i_433_ * is_438_[7] + (i_432_ * is_438_[6] - -(is_438_[8] * i_434_))) >> 15);
					i_460_ += i_452_;
					int[] is_461_ = new int[9];
					for (int i_462_ = 0; (i_462_ ^ 0xffffffff) > -4; i_462_++) {
						for (int i_463_ = 0; i_463_ < 3; i_463_++) {
							int i_464_ = 0;
							for (int i_465_ = 0; (i_465_ ^ 0xffffffff) > -4; i_465_++)
								i_464_ += (is_453_[i_463_ - -(3 * i_465_)] * is_413_[i_465_ + 3 * i_462_]);
							is_461_[i_463_ + i_462_ * 3] = 16384 + i_464_ >> 15;
						}
					}
					int i_466_ = (is_413_[1] * i_459_ + (is_413_[0] * i_458_ + i_460_ * is_413_[2] + 16384) >> 15);
					int i_467_ = (is_413_[3] * i_458_ + (i_459_ * is_413_[4] - (-(is_413_[5] * i_460_) - 16384)) >> 15);
					int i_468_ = ((i_460_ * is_413_[8] + is_413_[6] * i_458_ - -(is_413_[7] * i_459_) + 16384) >> 15);
					i_467_ += i_430_;
					i_466_ += i_429_;
					i_468_ += i_431_;
					for (int i_469_ = 0; (i_469_ ^ 0xffffffff) > (i_414_ ^ 0xffffffff); i_469_++) {
						int i_470_ = is[i_469_];
						if ((i_470_ ^ 0xffffffff) > (f_ac.length ^ 0xffffffff)) {
							int[] is_471_ = f_ac[i_470_];
							for (int i_472_ = 0; ((i_472_ ^ 0xffffffff) > (is_471_.length ^ 0xffffffff)); i_472_++) {
								int i_473_ = is_471_[i_472_];
								if (aShortArray4576 == null || (aShortArray4576[i_473_] & i_412_ ^ 0xffffffff) != -1) {
									int i_474_ = ((anIntArray4609[i_473_] * is_461_[2] + f_pc[i_473_] * is_461_[1] + ((anIntArray4586[i_473_] * is_461_[0]) + 16384)) >> 15);
									int i_475_ = ((is_461_[5] * anIntArray4609[i_473_] + is_461_[4] * f_pc[i_473_] + (anIntArray4586[i_473_] * is_461_[3]) + 16384) >> 15);
									i_474_ += i_466_;
									i_475_ += i_467_;
									int i_476_ = ((anIntArray4609[i_473_] * is_461_[8] + ((anIntArray4586[i_473_] * is_461_[6]) - -(is_461_[7] * f_pc[i_473_])) + 16384) >> 15);
									i_476_ += i_468_;
									anIntArray4586[i_473_] = i_474_;
									f_pc[i_473_] = i_475_;
									anIntArray4609[i_473_] = i_476_;
								}
							}
						}
					}
				} else {
					for (int i_477_ = 0; (i_414_ ^ 0xffffffff) < (i_477_ ^ 0xffffffff); i_477_++) {
						int i_478_ = is[i_477_];
						if ((f_ac.length ^ 0xffffffff) < (i_478_ ^ 0xffffffff)) {
							int[] is_479_ = f_ac[i_478_];
							for (int i_480_ = 0; ((is_479_.length ^ 0xffffffff) < (i_480_ ^ 0xffffffff)); i_480_++) {
								int i_481_ = is_479_[i_480_];
								if (aShortArray4576 == null || (i_412_ & aShortArray4576[i_481_] ^ 0xffffffff) != -1) {
									anIntArray4586[i_481_] -= Class109_Sub2.anInt3815;
									f_pc[i_481_] -= Class98.anInt1275;
									anIntArray4609[i_481_] -= Class246_Sub28_Sub18.anInt6515;
									if ((i_411_ ^ 0xffffffff) != -1) {
										int i_482_ = Class39_Sub1.f_fb[i_411_];
										int i_483_ = (Class39_Sub1.anIntArray4672[i_411_]);
										int i_484_ = (f_pc[i_481_] * i_482_ + (anIntArray4586[i_481_] * i_483_) + 32767) >> 15;
										f_pc[i_481_] = (i_483_ * f_pc[i_481_] - (anIntArray4586[i_481_] * i_482_) + 32767) >> 15;
										anIntArray4586[i_481_] = i_484_;
									}
									if (i_409_ != 0) {
										int i_485_ = Class39_Sub1.f_fb[i_409_];
										int i_486_ = (Class39_Sub1.anIntArray4672[i_409_]);
										int i_487_ = ((32767 + -(anIntArray4609[i_481_] * i_485_) + i_486_ * f_pc[i_481_]) >> 15);
										anIntArray4609[i_481_] = (anIntArray4609[i_481_] * i_486_ + (i_485_ * f_pc[i_481_] + 32767)) >> 15;
										f_pc[i_481_] = i_487_;
									}
									if ((i_410_ ^ 0xffffffff) != -1) {
										int i_488_ = Class39_Sub1.f_fb[i_410_];
										int i_489_ = (Class39_Sub1.anIntArray4672[i_410_]);
										int i_490_ = ((i_488_ * anIntArray4609[i_481_] + (anIntArray4586[i_481_] * i_489_) + 32767) >> 15);
										anIntArray4609[i_481_] = ((32767 + (i_489_ * anIntArray4609[i_481_]) + -(i_488_ * anIntArray4586[i_481_])) >> 15);
										anIntArray4586[i_481_] = i_490_;
									}
									anIntArray4586[i_481_] += Class109_Sub2.anInt3815;
									f_pc[i_481_] += Class98.anInt1275;
									anIntArray4609[i_481_] += Class246_Sub28_Sub18.anInt6515;
								}
							}
						}
					}
					if (bool) {
						for (int i_491_ = 0; (i_491_ ^ 0xffffffff) > (i_414_ ^ 0xffffffff); i_491_++) {
							int i_492_ = is[i_491_];
							if (i_492_ < f_ac.length) {
								int[] is_493_ = f_ac[i_492_];
								for (int i_494_ = 0; ((is_493_.length ^ 0xffffffff) < (i_494_ ^ 0xffffffff)); i_494_++) {
									int i_495_ = is_493_[i_494_];
									if (aShortArray4576 == null || (i_412_ & aShortArray4576[i_495_] ^ 0xffffffff) != -1) {
										int i_496_ = anIntArray4630[i_495_];
										int i_497_ = anIntArray4630[1 + i_495_];
										for (int i_498_ = i_496_; i_497_ > i_498_; i_498_++) {
											int i_499_ = -1 + f_fc[i_498_];
											if ((i_499_ ^ 0xffffffff) == 0)
												break;
											if (i_411_ != 0) {
												int i_500_ = (Class39_Sub1.f_fb[i_411_]);
												int i_501_ = (Class39_Sub1.anIntArray4672[i_411_]);
												int i_502_ = ((aShortArray4589[i_499_] * i_501_) + (i_500_ * (aShortArray4582[i_499_])) + 32767) >> 15;
												aShortArray4582[i_499_] = (short) ((-(i_500_ * (aShortArray4589[i_499_])) + ((aShortArray4582[i_499_]) * i_501_) + 32767) >> 15);
												aShortArray4589[i_499_] = (short) i_502_;
											}
											if (i_409_ != 0) {
												int i_503_ = (Class39_Sub1.f_fb[i_409_]);
												int i_504_ = (Class39_Sub1.anIntArray4672[i_409_]);
												int i_505_ = ((32767 + -(i_503_ * (aShortArray4588[i_499_])) + (i_504_ * (aShortArray4582[i_499_]))) >> 15);
												aShortArray4588[i_499_] = (short) ((32767 + ((aShortArray4582[i_499_]) * i_503_) + (i_504_ * (aShortArray4588[i_499_]))) >> 15);
												aShortArray4582[i_499_] = (short) i_505_;
											}
											if ((i_410_ ^ 0xffffffff) != -1) {
												int i_506_ = (Class39_Sub1.f_fb[i_410_]);
												int i_507_ = (Class39_Sub1.anIntArray4672[i_410_]);
												int i_508_ = (((i_507_ * (aShortArray4589[i_499_])) + (aShortArray4588[i_499_]) * i_506_ + 32767) >> 15);
												aShortArray4588[i_499_] = (short) ((32767 + (-((aShortArray4589[i_499_]) * i_506_) + ((aShortArray4588[i_499_]) * i_507_))) >> 15);
												aShortArray4589[i_499_] = (short) i_508_;
											}
										}
									}
								}
							}
						}
						if (f_cc == null && aClass160_4596 != null)
							((Class160) aClass160_4596).anInterface10_2264 = null;
						if (f_cc != null)
							((Class160) f_cc).anInterface10_2264 = null;
					}
				}
			} else if ((i ^ 0xffffffff) == -4) {
				if (is_413_ != null) {
					int i_509_ = is_413_[9] << 4;
					int i_510_ = is_413_[10] << 4;
					int i_511_ = is_413_[11] << 4;
					int i_512_ = is_413_[12] << 4;
					int i_513_ = is_413_[13] << 4;
					int i_514_ = is_413_[14] << 4;
					if (Class246_Sub1_Sub7.aBool6033) {
						int i_515_ = ((16384 + is_413_[6] * Class246_Sub28_Sub18.anInt6515 + is_413_[3] * Class98.anInt1275 + Class109_Sub2.anInt3815 * is_413_[0]) >> 15);
						int i_516_ = ((is_413_[4] * Class98.anInt1275 + (is_413_[1] * Class109_Sub2.anInt3815 + (is_413_[7] * Class246_Sub28_Sub18.anInt6515)) + 16384) >> 15);
						i_515_ += i_512_;
						i_516_ += i_513_;
						int i_517_ = (16384 + (Class109_Sub2.anInt3815 * is_413_[2] + Class98.anInt1275 * is_413_[5] - -(Class246_Sub28_Sub18.anInt6515 * is_413_[8])) >> 15);
						i_517_ += i_514_;
						Class98.anInt1275 = i_516_;
						Class109_Sub2.anInt3815 = i_515_;
						Class246_Sub1_Sub7.aBool6033 = false;
						Class246_Sub28_Sub18.anInt6515 = i_517_;
					}
					int i_518_ = i_409_ << 15 >> 7;
					int i_519_ = i_410_ << 15 >> 7;
					int i_520_ = i_411_ << 15 >> 7;
					int i_521_ = 16384 + i_518_ * -Class109_Sub2.anInt3815 >> 15;
					int i_522_ = 16384 + -Class98.anInt1275 * i_519_ >> 15;
					int i_523_ = (16384 + -Class246_Sub28_Sub18.anInt6515 * i_520_ >> 15);
					int i_524_ = Class109_Sub2.anInt3815 + i_521_;
					int i_525_ = i_522_ + Class98.anInt1275;
					int i_526_ = i_523_ - -Class246_Sub28_Sub18.anInt6515;
					int[] is_527_ = new int[9];
					is_527_[0] = 16384 + i_518_ * is_413_[0] >> 15;
					is_527_[2] = 16384 + i_518_ * is_413_[6] >> 15;
					is_527_[1] = 16384 + is_413_[3] * i_518_ >> 15;
					is_527_[4] = is_413_[4] * i_519_ + 16384 >> 15;
					is_527_[3] = 16384 + is_413_[1] * i_519_ >> 15;
					is_527_[5] = 16384 + is_413_[7] * i_519_ >> 15;
					is_527_[6] = i_520_ * is_413_[2] + 16384 >> 15;
					is_527_[7] = 16384 + i_520_ * is_413_[5] >> 15;
					is_527_[8] = i_520_ * is_413_[8] + 16384 >> 15;
					int i_528_ = 16384 + i_512_ * i_518_ >> 15;
					int i_529_ = 16384 + i_519_ * i_513_ >> 15;
					int i_530_ = 16384 + i_514_ * i_520_ >> 15;
					i_529_ += i_525_;
					i_528_ += i_524_;
					i_530_ += i_526_;
					int[] is_531_ = new int[9];
					for (int i_532_ = 0; (i_532_ ^ 0xffffffff) > -4; i_532_++) {
						for (int i_533_ = 0; (i_533_ ^ 0xffffffff) > -4; i_533_++) {
							int i_534_ = 0;
							for (int i_535_ = 0; i_535_ < 3; i_535_++)
								i_534_ += (is_413_[i_532_ * 3 + i_535_] * is_527_[i_533_ + i_535_ * 3]);
							is_531_[3 * i_532_ + i_533_] = 16384 + i_534_ >> 15;
						}
					}
					int i_536_ = ((i_528_ * is_413_[0] + (i_529_ * is_413_[1] - -(i_530_ * is_413_[2])) + 16384) >> 15);
					int i_537_ = (16384 + (is_413_[5] * i_530_ + is_413_[4] * i_529_ + is_413_[3] * i_528_) >> 15);
					i_537_ += i_510_;
					i_536_ += i_509_;
					int i_538_ = 16384 + i_528_ * is_413_[6] - (-(is_413_[7] * i_529_) + -(is_413_[8] * i_530_)) >> 15;
					i_538_ += i_511_;
					for (int i_539_ = 0; (i_539_ ^ 0xffffffff) > (i_414_ ^ 0xffffffff); i_539_++) {
						int i_540_ = is[i_539_];
						if ((f_ac.length ^ 0xffffffff) < (i_540_ ^ 0xffffffff)) {
							int[] is_541_ = f_ac[i_540_];
							for (int i_542_ = 0; ((is_541_.length ^ 0xffffffff) < (i_542_ ^ 0xffffffff)); i_542_++) {
								int i_543_ = is_541_[i_542_];
								if (aShortArray4576 == null || (i_412_ & aShortArray4576[i_543_] ^ 0xffffffff) != -1) {
									int i_544_ = ((16384 + (anIntArray4586[i_543_] * is_531_[0]) - (-(f_pc[i_543_] * is_531_[1]) - (anIntArray4609[i_543_] * is_531_[2]))) >> 15);
									int i_545_ = ((is_531_[3] * anIntArray4586[i_543_] - -(is_531_[4] * f_pc[i_543_]) + (is_531_[5] * anIntArray4609[i_543_]) + 16384) >> 15);
									int i_546_ = ((anIntArray4609[i_543_] * is_531_[8] + (f_pc[i_543_] * is_531_[7] + (is_531_[6] * anIntArray4586[i_543_])) + 16384) >> 15);
									i_545_ += i_537_;
									i_544_ += i_536_;
									i_546_ += i_538_;
									anIntArray4586[i_543_] = i_544_;
									f_pc[i_543_] = i_545_;
									anIntArray4609[i_543_] = i_546_;
								}
							}
						}
					}
				} else {
					for (int i_547_ = 0; i_414_ > i_547_; i_547_++) {
						int i_548_ = is[i_547_];
						if ((f_ac.length ^ 0xffffffff) < (i_548_ ^ 0xffffffff)) {
							int[] is_549_ = f_ac[i_548_];
							for (int i_550_ = 0; ((is_549_.length ^ 0xffffffff) < (i_550_ ^ 0xffffffff)); i_550_++) {
								int i_551_ = is_549_[i_550_];
								if (aShortArray4576 == null || ((i_412_ & aShortArray4576[i_551_]) != 0)) {
									anIntArray4586[i_551_] -= Class109_Sub2.anInt3815;
									f_pc[i_551_] -= Class98.anInt1275;
									anIntArray4609[i_551_] -= Class246_Sub28_Sub18.anInt6515;
									anIntArray4586[i_551_] = anIntArray4586[i_551_] * i_409_ >> 7;
									f_pc[i_551_] = f_pc[i_551_] * i_410_ >> 7;
									anIntArray4609[i_551_] = anIntArray4609[i_551_] * i_411_ >> 7;
									anIntArray4586[i_551_] += Class109_Sub2.anInt3815;
									f_pc[i_551_] += Class98.anInt1275;
									anIntArray4609[i_551_] += Class246_Sub28_Sub18.anInt6515;
								}
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -6) {
				if (anIntArrayArray4585 != null) {
					for (int i_552_ = 0; i_414_ > i_552_; i_552_++) {
						int i_553_ = is[i_552_];
						if ((i_553_ ^ 0xffffffff) > (anIntArrayArray4585.length ^ 0xffffffff)) {
							int[] is_554_ = anIntArrayArray4585[i_553_];
							for (int i_555_ = 0; ((i_555_ ^ 0xffffffff) > (is_554_.length ^ 0xffffffff)); i_555_++) {
								int i_556_ = is_554_[i_555_];
								if (aShortArray4595 == null || ((aShortArray4595[i_556_] & i_412_) != 0)) {
									int i_557_ = ((aByteArray4620[i_556_] & 0xff) - -(i_409_ * 8));
									if ((i_557_ ^ 0xffffffff) > -1)
										i_557_ = 0;
									else if (i_557_ > 255)
										i_557_ = 255;
									aByteArray4620[i_556_] = (byte) i_557_;
									if (aClass160_4596 != null)
										((Class160) aClass160_4596).anInterface10_2264 = null;
								}
							}
						}
					}
					if (f_bc != null) {
						for (int i_558_ = 0; i_558_ < f_ic; i_558_++) {
							Class_j class_j = f_bc[i_558_];
							Class69 class69 = f_jb[i_558_];
							((Class69) class69).anInt911 = (255 + -(0xff & (aByteArray4620[(((Class_j) class_j).anInt1471)])) << 24 | ((Class69) class69).anInt911 & 0xffffff);
						}
					}
				}
			} else if (i == 7) {
				if (anIntArrayArray4585 != null) {
					for (int i_559_ = 0; i_414_ > i_559_; i_559_++) {
						int i_560_ = is[i_559_];
						if ((anIntArrayArray4585.length ^ 0xffffffff) < (i_560_ ^ 0xffffffff)) {
							int[] is_561_ = anIntArrayArray4585[i_560_];
							for (int i_562_ = 0; ((is_561_.length ^ 0xffffffff) < (i_562_ ^ 0xffffffff)); i_562_++) {
								int i_563_ = is_561_[i_562_];
								if (aShortArray4595 == null || ((i_412_ & aShortArray4595[i_563_]) != 0)) {
									int i_564_ = 0xffff & aShortArray4581[i_563_];
									int i_565_ = (i_564_ & 0xfc1d) >> 10;
									int i_566_ = i_564_ >> 7 & 0x7;
									i_565_ = 0x3f & i_409_ + i_565_;
									i_566_ += i_410_ / 4;
									int i_567_ = 0x7f & i_564_;
									if (i_566_ >= 0) {
										if (i_566_ > 7)
											i_566_ = 7;
									} else
										i_566_ = 0;
									i_567_ += i_411_;
									if (i_567_ >= 0) {
										if ((i_567_ ^ 0xffffffff) < -128)
											i_567_ = 127;
									} else
										i_567_ = 0;
									aShortArray4581[i_563_] = (short) (Class236.method1523(i_567_, (Class236.method1523(i_566_ << 7, i_565_ << 10))));
									if (aClass160_4596 != null)
										((Class160) aClass160_4596).anInterface10_2264 = null;
								}
							}
						}
					}
					if (f_bc != null) {
						for (int i_568_ = 0; (f_ic ^ 0xffffffff) < (i_568_ ^ 0xffffffff); i_568_++) {
							Class_j class_j = f_bc[i_568_];
							Class69 class69 = f_jb[i_568_];
							((Class69) class69).anInt911 = (((Class69) class69).anInt911 & ~0xffffff | 0xffffff & (Class40_Sub3.anIntArray4064[(aShortArray4581[(((Class_j) class_j).anInt1471)]) & 0xffff]));
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -9) {
				if (anIntArrayArray4579 != null) {
					for (int i_569_ = 0; i_414_ > i_569_; i_569_++) {
						int i_570_ = is[i_569_];
						if (i_570_ < anIntArrayArray4579.length) {
							int[] is_571_ = anIntArrayArray4579[i_570_];
							for (int i_572_ = 0; ((i_572_ ^ 0xffffffff) > (is_571_.length ^ 0xffffffff)); i_572_++) {
								Class69 class69 = f_jb[is_571_[i_572_]];
								((Class69) class69).anInt914 += i_410_;
								((Class69) class69).anInt917 += i_409_;
							}
						}
					}
				}
			} else if (i == 10) {
				if (anIntArrayArray4579 != null) {
					for (int i_573_ = 0; i_414_ > i_573_; i_573_++) {
						int i_574_ = is[i_573_];
						if (anIntArrayArray4579.length > i_574_) {
							int[] is_575_ = anIntArrayArray4579[i_574_];
							for (int i_576_ = 0; i_576_ < is_575_.length; i_576_++) {
								Class69 class69 = f_jb[is_575_[i_576_]];
								((Class69) class69).anInt916 = (((Class69) class69).anInt916 * i_410_ >> 7);
								((Class69) class69).anInt909 = (((Class69) class69).anInt909 * i_409_ >> 7);
							}
						}
					}
				}
			} else if ((i ^ 0xffffffff) == -10) {
				if (anIntArrayArray4579 != null) {
					for (int i_577_ = 0; (i_577_ ^ 0xffffffff) > (i_414_ ^ 0xffffffff); i_577_++) {
						int i_578_ = is[i_577_];
						if (anIntArrayArray4579.length > i_578_) {
							int[] is_579_ = anIntArrayArray4579[i_578_];
							for (int i_580_ = 0; is_579_.length > i_580_; i_580_++) {
								Class69 class69 = f_jb[is_579_[i_580_]];
								((Class69) class69).anInt913 = 0x3fff & i_409_ + (((Class69) class69).anInt913);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.M(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_409_ + ',' + i_410_ + ',' + i_411_ + ',' + bool + ',' + i_412_ + ',' + (is_413_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class19[] method672() {
		try {
			anInt4608++;
			return aClass19Array4629;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.G(" + ')');
		}
	}

	final void E(int i) {
		try {
			f_ec++;
			if (aClass160_4596 != null)
				((Class160) aClass160_4596).anInterface10_2264 = null;
			f_tc = (short) i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.E(" + i + ')');
		}
	}

	final void Q(int i) {
		do {
			try {
				f_dc++;
				int i_581_ = Class39_Sub1.f_fb[i];
				int i_582_ = Class39_Sub1.anIntArray4672[i];
				for (int i_583_ = 0; (i_583_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff); i_583_++) {
					int i_584_ = ((i_581_ * anIntArray4609[i_583_] - -(anIntArray4586[i_583_] * i_582_)) >> 15);
					anIntArray4609[i_583_] = (-(anIntArray4586[i_583_] * i_581_) + anIntArray4609[i_583_] * i_582_) >> 15;
					anIntArray4586[i_583_] = i_584_;
				}
				aBool4606 = false;
				if (aClass160_4587 == null)
					break;
				((Class160) aClass160_4587).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class_t method678(byte i, int i_585_, boolean bool) {
		try {
			f_vb++;
			Class_t_Sub1 class_t_sub1_586_;
			Class_t_Sub1 class_t_sub1_587_;
			if ((i ^ 0xffffffff) == -2) {
				class_t_sub1_586_ = ((Class260_Sub2) aClass260_Sub2_4636).f_lg;
				class_t_sub1_587_ = ((Class260_Sub2) aClass260_Sub2_4636).aClass_t_Sub1_4328;
			} else if ((i ^ 0xffffffff) == -3) {
				class_t_sub1_586_ = ((Class260_Sub2) aClass260_Sub2_4636).f_rf;
				class_t_sub1_587_ = ((Class260_Sub2) aClass260_Sub2_4636).f_ig;
			} else if (i == 3) {
				class_t_sub1_587_ = ((Class260_Sub2) aClass260_Sub2_4636).aClass_t_Sub1_4387;
				class_t_sub1_586_ = ((Class260_Sub2) aClass260_Sub2_4636).aClass_t_Sub1_4372;
			} else if (i != 4) {
				if (i != 5)
					class_t_sub1_586_ = class_t_sub1_587_ = new Class_t_Sub1(aClass260_Sub2_4636);
				else {
					class_t_sub1_586_ = ((Class260_Sub2) aClass260_Sub2_4636).f_ug;
					class_t_sub1_587_ = (((Class260_Sub2) aClass260_Sub2_4636).aClass_t_Sub1_4336);
				}
			} else {
				class_t_sub1_587_ = ((Class260_Sub2) aClass260_Sub2_4636).f_jg;
				class_t_sub1_586_ = ((Class260_Sub2) aClass260_Sub2_4636).f_ef;
			}
			return method2036(5126, i_585_, class_t_sub1_587_, bool, class_t_sub1_586_, (i ^ 0xffffffff) != -1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.O(" + i + ',' + i_585_ + ',' + bool + ')'));
		}
	}

	final void R(int i) {
		do {
			try {
				anInt4591++;
				int i_588_ = Class39_Sub1.f_fb[i];
				int i_589_ = Class39_Sub1.anIntArray4672[i];
				for (int i_590_ = 0; (anInt4639 ^ 0xffffffff) < (i_590_ ^ 0xffffffff); i_590_++) {
					int i_591_ = ((i_589_ * anIntArray4586[i_590_] + f_pc[i_590_] * i_588_) >> 15);
					f_pc[i_590_] = (-(anIntArray4586[i_590_] * i_588_) + i_589_ * f_pc[i_590_]) >> 15;
					anIntArray4586[i_590_] = i_591_;
				}
				aBool4606 = false;
				if (aClass160_4587 == null)
					break;
				((Class160) aClass160_4587).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.R(" + i + ')');
			}
			break;
		} while (false);
	}

	private final short method2037(int i, long l, float f, float f_592_, int i_593_, byte i_594_, int i_595_, int i_596_, Class103 class103, int i_597_) {
		try {
			anInt4601++;
			int i_598_ = anIntArray4630[i_596_];
			int i_599_ = anIntArray4630[1 + i_596_];
			if (i_594_ != 5)
				return (short) 76;
			int i_600_ = 0;
			for (int i_601_ = i_598_; i_601_ < i_599_; i_601_++) {
				short i_602_ = f_fc[i_601_];
				if ((i_602_ ^ 0xffffffff) == -1) {
					i_600_ = i_601_;
					break;
				}
				if ((Class243.aLongArray3444[i_601_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL))
					return (short) (i_602_ - 1);
			}
			f_fc[i_600_] = (short) (1 + anInt4612);
			Class243.aLongArray3444[i_600_] = l;
			aShortArray4589[anInt4612] = (short) i_597_;
			aShortArray4582[anInt4612] = (short) i_595_;
			aShortArray4588[anInt4612] = (short) i;
			aByteArray4631[anInt4612] = (byte) i_593_;
			aFloatArray4619[anInt4612] = f_592_;
			aFloatArray4575[anInt4612] = f;
			return (short) anInt4612++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.RA(" + i + ',' + l + ',' + f + ',' + f_592_ + ',' + i_593_ + ',' + i_594_ + ',' + i_595_ + ',' + i_596_ + ',' + (class103 != null ? "{...}" : "null") + ',' + i_597_ + ')'));
		}
	}

	final void IA() {
		try {
			f_ib++;
			for (int i = 0; i < anInt4639; i++)
				anIntArray4609[i] = -anIntArray4609[i];
			for (int i = 0; (anInt4612 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				aShortArray4588[i] = (short) -aShortArray4588[i];
			for (int i = 0; f_kc > i; i++) {
				short i_603_ = aShortArray4613[i];
				aShortArray4613[i] = f_hb[i];
				f_hb[i] = i_603_;
			}
			if (f_cc == null && aClass160_4596 != null)
				((Class160) aClass160_4596).anInterface10_2264 = null;
			if (f_cc != null)
				((Class160) f_cc).anInterface10_2264 = null;
			if (aClass160_4587 != null)
				((Class160) aClass160_4587).anInterface10_2264 = null;
			if (aClass218_4594 != null)
				((Class218) aClass218_4594).anInterface1_3032 = null;
			aBool4606 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.IA(" + ')');
		}
	}

	final void method680(Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		try {
			anInt4592++;
			if (anInt4612 != 0) {
				Class_c_Sub1 class_c_sub1 = ((Class260_Sub2) aClass260_Sub2_4636).f_hg;
				Class_c_Sub1 class_c_sub1_604_ = (Class_c_Sub1) class_c;
				if (!aBool4606)
					method2038(16383);
				method2028(0, class_c_sub1_604_);
				Class255.aFloat3654 = ((((Class_c_Sub1) class_c_sub1_604_).aFloat5393 * ((Class_c_Sub1) class_c_sub1).aFloat5386) + (((Class_c_Sub1) class_c_sub1).aFloat5378 * ((Class_c_Sub1) class_c_sub1_604_).aFloat5385) + (((Class_c_Sub1) class_c_sub1_604_).aFloat5362 * ((Class_c_Sub1) class_c_sub1).aFloat5363) + ((Class_c_Sub1) class_c_sub1).aFloat5362);
				Canvas_Sub1.aFloat6894 = ((((Class_c_Sub1) class_c_sub1).aFloat5363 * ((Class_c_Sub1) class_c_sub1_604_).aFloat5378) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5387 * ((Class_c_Sub1) class_c_sub1).aFloat5386) + (((Class_c_Sub1) class_c_sub1).aFloat5378 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5382))));
				float f = (Canvas_Sub1.aFloat6894 * (float) f_lb + Class255.aFloat3654);
				float f_605_ = ((float) aShort4614 * Canvas_Sub1.aFloat6894 + Class255.aFloat3654);
				float f_606_;
				float f_607_;
				if (!(f > f_605_)) {
					f_606_ = (float) aShort4605 + f_605_;
					f_607_ = (float) -aShort4605 + f;
				} else {
					f_606_ = (float) aShort4605 + f;
					f_607_ = f_605_ - (float) aShort4605;
				}
				if (!(((Class260_Sub2) aClass260_Sub2_4636).f_mf <= f_607_) && !(f_606_ <= (float) (((Class260_Sub2) aClass260_Sub2_4636).f_cf))) {
					Class128_Sub1.aFloat5561 = ((((Class_c_Sub1) class_c_sub1).aFloat5372 * ((Class_c_Sub1) class_c_sub1_604_).aFloat5393) + (((Class_c_Sub1) class_c_sub1).aFloat5387 * ((Class_c_Sub1) class_c_sub1_604_).aFloat5385) + (((Class_c_Sub1) class_c_sub1_604_).aFloat5362 * ((Class_c_Sub1) class_c_sub1).aFloat5388) + ((Class_c_Sub1) class_c_sub1).aFloat5393);
					Class_o.aFloat7226 = ((((Class_c_Sub1) class_c_sub1_604_).aFloat5378 * ((Class_c_Sub1) class_c_sub1).aFloat5388) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5382 * ((Class_c_Sub1) class_c_sub1).aFloat5387) + (((Class_c_Sub1) class_c_sub1).aFloat5372 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5387))));
					float f_608_ = (Class_o.aFloat7226 * (float) f_lb + Class128_Sub1.aFloat5561);
					float f_609_ = (Class_o.aFloat7226 * (float) aShort4614 + Class128_Sub1.aFloat5561);
					float f_610_;
					float f_611_;
					if (f_608_ > f_609_) {
						f_610_ = ((float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * ((float) -aShort4605 + f_609_));
						f_611_ = ((f_608_ + (float) aShort4605) * (float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366));
					} else {
						f_610_ = (((float) -aShort4605 + f_608_) * (float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366));
						f_611_ = ((f_609_ + (float) aShort4605) * (float) (((Class260_Sub2) aClass260_Sub2_4636).anInt4366));
					}
					if (!(((Class260_Sub2) aClass260_Sub2_4636).aFloat4344 <= f_610_ / f_606_) && !(f_611_ / f_606_ <= (((Class260_Sub2) aClass260_Sub2_4636).aFloat4383))) {
						Class156.aFloat2244 = ((((Class_c_Sub1) class_c_sub1).aFloat5382 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5382)) + (((Class_c_Sub1) class_c_sub1).aFloat5364 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5387)) + (((Class_c_Sub1) class_c_sub1).aFloat5367 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5378)));
						Class55.aFloat783 = (((Class_c_Sub1) class_c_sub1).aFloat5385 + ((((Class_c_Sub1) class_c_sub1).aFloat5364 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5393)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5385) * (((Class_c_Sub1) class_c_sub1).aFloat5382)) + (((Class_c_Sub1) class_c_sub1).aFloat5367 * (((Class_c_Sub1) class_c_sub1_604_).aFloat5362))));
						float f_612_ = (Class156.aFloat2244 * (float) f_lb + Class55.aFloat783);
						float f_613_ = (Class55.aFloat783 + (float) aShort4614 * Class156.aFloat2244);
						float f_614_;
						float f_615_;
						if (f_612_ > f_613_) {
							f_615_ = ((float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf * (f_612_ + (float) aShort4605));
							f_614_ = ((float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf * ((float) -aShort4605 + f_613_));
						} else {
							f_614_ = ((float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf * (f_612_ - (float) aShort4605));
							f_615_ = ((f_613_ + (float) aShort4605) * (float) ((Class260_Sub2) aClass260_Sub2_4636).f_tf);
						}
						if (!(((Class260_Sub2) aClass260_Sub2_4636).aFloat4361 <= f_614_ / f_606_) && !(f_615_ / f_606_ <= (((Class260_Sub2) aClass260_Sub2_4636).f_qf))) {
							if (class130_sub5 != null || f_bc != null) {
								Class39.aFloat579 = (((((Class_c_Sub1) class_c_sub1_604_).aFloat5367) * (((Class_c_Sub1) class_c_sub1).aFloat5387)) + ((((Class_c_Sub1) class_c_sub1).aFloat5372) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5388)) + ((((Class_c_Sub1) class_c_sub1).aFloat5388) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5363)));
								Class63_Sub1.aFloat4718 = (((((Class_c_Sub1) class_c_sub1_604_).aFloat5388) * (((Class_c_Sub1) class_c_sub1).aFloat5386)) + ((((Class_c_Sub1) class_c_sub1).aFloat5378) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5367)) + ((((Class_c_Sub1) class_c_sub1).aFloat5363) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5363)));
								Class246_Sub43.aFloat5603 = (((((Class_c_Sub1) class_c_sub1).aFloat5378) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5364)) + ((((Class_c_Sub1) class_c_sub1).aFloat5386) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5386) * (((Class_c_Sub1) class_c_sub1).aFloat5363)));
								Class246_Sub28_Sub21.aFloat6586 = (((((Class_c_Sub1) class_c_sub1).aFloat5387) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5364)) + ((((Class_c_Sub1) class_c_sub1).aFloat5372) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5372)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5386) * (((Class_c_Sub1) class_c_sub1).aFloat5388)));
								Class59_Sub4_Sub2.aFloat6845 = (((((Class_c_Sub1) class_c_sub1_604_).aFloat5372) * (((Class_c_Sub1) class_c_sub1).aFloat5364)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5364) * (((Class_c_Sub1) class_c_sub1).aFloat5382)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5386) * (((Class_c_Sub1) class_c_sub1).aFloat5367)));
								Class_v.aFloat1453 = (((((Class_c_Sub1) class_c_sub1_604_).aFloat5388) * (((Class_c_Sub1) class_c_sub1).aFloat5364)) + ((((Class_c_Sub1) class_c_sub1).aFloat5382) * (((Class_c_Sub1) class_c_sub1_604_).aFloat5367)) + ((((Class_c_Sub1) class_c_sub1_604_).aFloat5363) * (((Class_c_Sub1) class_c_sub1).aFloat5367)));
							}
							if (class130_sub5 != null) {
								boolean bool = false;
								boolean bool_616_ = true;
								int i_617_ = aShort4622 + aShort4638 >> 1;
								int i_618_ = aShort4590 + f_eb >> 1;
								int i_619_ = (int) (Class39.aFloat579 * (float) i_618_ + ((Class246_Sub28_Sub21.aFloat6586) * (float) i_617_ + Class128_Sub1.aFloat5561 + (Class_o.aFloat7226 * (float) f_lb)));
								int i_620_ = (int) ((Class_v.aFloat1453 * (float) i_618_) + ((Class156.aFloat2244 * (float) f_lb) + (Class55.aFloat783 + ((float) i_617_ * (Class59_Sub4_Sub2.aFloat6845)))));
								int i_621_ = (int) (((float) f_lb * Canvas_Sub1.aFloat6894) + (((float) i_617_ * Class246_Sub43.aFloat5603) + Class255.aFloat3654) + (Class63_Sub1.aFloat4718 * (float) i_618_));
								if ((i_621_ ^ 0xffffffff) > ((((Class260_Sub2) aClass260_Sub2_4636).f_cf) ^ 0xffffffff))
									bool = true;
								else {
									((Class130_Sub5) class130_sub5).anInt4813 = (((Class260_Sub2) aClass260_Sub2_4636).f_vf - -(((Class260_Sub2) aClass260_Sub2_4636).anInt4366 * i_619_ / i_621_));
									((Class130_Sub5) class130_sub5).anInt4811 = (i_620_ * (((Class260_Sub2) aClass260_Sub2_4636).f_tf) / i_621_ + ((Class260_Sub2) aClass260_Sub2_4636).anInt4339);
								}
								int i_622_ = (int) ((float) i_618_ * Class39.aFloat579 + (Class128_Sub1.aFloat5561 + ((Class246_Sub28_Sub21.aFloat6586) * (float) i_617_) + (Class_o.aFloat7226 * (float) aShort4614)));
								int i_623_ = (int) (((float) i_618_ * Class_v.aFloat1453) + ((Class156.aFloat2244 * (float) aShort4614) + (Class55.aFloat783 + ((float) i_617_ * (Class59_Sub4_Sub2.aFloat6845)))));
								int i_624_ = (int) ((Class246_Sub43.aFloat5603 * (float) i_617_) + Class255.aFloat3654 + ((float) aShort4614 * Canvas_Sub1.aFloat6894) + ((float) i_618_ * Class63_Sub1.aFloat4718));
								if ((((Class260_Sub2) aClass260_Sub2_4636).f_cf ^ 0xffffffff) >= (i_624_ ^ 0xffffffff)) {
									((Class130_Sub5) class130_sub5).anInt4812 = (i_623_ * (((Class260_Sub2) aClass260_Sub2_4636).f_tf) / i_624_ + ((Class260_Sub2) aClass260_Sub2_4636).anInt4339);
									((Class130_Sub5) class130_sub5).anInt4815 = (((Class260_Sub2) aClass260_Sub2_4636).f_vf + (((Class260_Sub2) aClass260_Sub2_4636).anInt4366 * i_622_ / i_624_));
								} else
									bool = true;
								if (bool) {
									if (i_621_ < ((Class260_Sub2) aClass260_Sub2_4636).f_cf && i_624_ < ((Class260_Sub2) aClass260_Sub2_4636).f_cf)
										bool_616_ = false;
									else if (i_621_ >= ((Class260_Sub2) aClass260_Sub2_4636).f_cf) {
										if ((i_624_ ^ 0xffffffff) > (((Class260_Sub2) aClass260_Sub2_4636).f_cf ^ 0xffffffff)) {
											int i_625_ = ((-(((Class260_Sub2) aClass260_Sub2_4636).f_cf) + i_621_ << 16) / (i_621_ - i_624_));
											int i_626_ = i_619_ - -(((-i_622_ + i_619_) * i_625_) >> 16);
											((Class130_Sub5) class130_sub5).anInt4813 = (((((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * i_626_ / (((Class260_Sub2) aClass260_Sub2_4636).f_cf)) + (((Class260_Sub2) aClass260_Sub2_4636).f_vf));
											int i_627_ = i_620_ + (((i_620_ + -i_623_) * i_625_) >> 16);
											((Class130_Sub5) class130_sub5).anInt4811 = ((((Class260_Sub2) aClass260_Sub2_4636).f_tf * i_627_ / (((Class260_Sub2) aClass260_Sub2_4636).f_cf)) + (((Class260_Sub2) aClass260_Sub2_4636).anInt4339));
										}
									} else {
										int i_628_ = ((-(((Class260_Sub2) aClass260_Sub2_4636).f_cf) + i_624_ << 16) / (-i_621_ + i_624_));
										int i_629_ = (((-i_619_ + i_622_) * i_628_ >> 16) + i_622_);
										int i_630_ = (i_623_ - -((i_623_ + -i_620_) * i_628_ >> 16));
										((Class130_Sub5) class130_sub5).anInt4813 = ((((Class260_Sub2) aClass260_Sub2_4636).anInt4366 * i_629_ / ((Class260_Sub2) aClass260_Sub2_4636).f_cf) + ((Class260_Sub2) aClass260_Sub2_4636).f_vf);
										((Class130_Sub5) class130_sub5).anInt4811 = (((Class260_Sub2) aClass260_Sub2_4636).anInt4339 - -(i_630_ * ((Class260_Sub2) aClass260_Sub2_4636).f_tf / (((Class260_Sub2) aClass260_Sub2_4636).f_cf)));
									}
								}
								if (bool_616_) {
									if (i_624_ >= i_621_)
										((Class130_Sub5) class130_sub5).anInt4816 = (-((Class130_Sub5) class130_sub5).anInt4815 + (((Class260_Sub2) aClass260_Sub2_4636).f_vf + ((((Class260_Sub2) aClass260_Sub2_4636).anInt4366) * (i_622_ - -aShort4605) / i_624_)));
									else
										((Class130_Sub5) class130_sub5).anInt4816 = (((aShort4605 + i_619_) * (((Class260_Sub2) aClass260_Sub2_4636).anInt4366) / i_621_) + (((Class260_Sub2) aClass260_Sub2_4636).f_vf - (((Class130_Sub5) class130_sub5).anInt4813)));
									((Class130_Sub5) class130_sub5).aBool4814 = true;
								}
							}
							aClass260_Sub2_4636.method1904(8);
							aClass260_Sub2_4636.method1948(0, class_c_sub1_604_);
							method2031(false);
							aClass260_Sub2_4636.method1916(1);
							method2035(false);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.K(" + (class_c != null ? "{...}" : "null") + ',' + (class130_sub5 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method684(int i, int i_631_, int i_632_, int i_633_) {
		do {
			try {
				anInt4632++;
				for (int i_634_ = 0; i_634_ < f_kc; i_634_++) {
					int i_635_ = 0xffff & aShortArray4581[i_634_];
					int i_636_ = 0x3f & i_635_ >> 10;
					int i_637_ = (i_635_ & 0x392) >> 7;
					if ((i ^ 0xffffffff) != 0)
						i_636_ = (i_633_ * (-i_636_ + i) >> 7) + i_636_;
					int i_638_ = i_635_ & 0x7f;
					if ((i_631_ ^ 0xffffffff) != 0)
						i_637_ = ((-i_637_ + i_631_) * i_633_ >> 7) + i_637_;
					if ((i_632_ ^ 0xffffffff) != 0)
						i_638_ += (i_632_ + -i_638_) * i_633_ >> 7;
					aShortArray4581[i_634_] = (short) (Class236.method1523(i_638_, Class236.method1523(i_637_ << 7, i_636_ << 10)));
				}
				if (f_bc != null) {
					for (int i_639_ = 0; (i_639_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_639_++) {
						Class_j class_j = f_bc[i_639_];
						Class69 class69 = f_jb[i_639_];
						((Class69) class69).anInt911 = (~0xffffff & ((Class69) class69).anInt911 | 0xffffff & (Class40_Sub3.anIntArray4064[(aShortArray4581[(((Class_j) class_j).anInt1471)]) & 0xffff]));
					}
				}
				if (aClass160_4596 == null)
					break;
				((Class160) aClass160_4596).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ip.B(" + i + ',' + i_631_ + ',' + i_632_ + ',' + i_633_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method2038(int i) {
		try {
			anInt4634++;
			int i_640_ = 32767;
			int i_641_ = 32767;
			int i_642_ = 32767;
			int i_643_ = -32768;
			int i_644_ = -32768;
			int i_645_ = -32768;
			int i_646_ = 0;
			int i_647_ = 0;
			if (i == 16383) {
				for (int i_648_ = 0; (i_648_ ^ 0xffffffff) > (anInt4639 ^ 0xffffffff); i_648_++) {
					int i_649_ = anIntArray4586[i_648_];
					int i_650_ = f_pc[i_648_];
					if (i_643_ < i_649_)
						i_643_ = i_649_;
					if ((i_650_ ^ 0xffffffff) > (i_641_ ^ 0xffffffff))
						i_641_ = i_650_;
					if ((i_644_ ^ 0xffffffff) > (i_650_ ^ 0xffffffff))
						i_644_ = i_650_;
					int i_651_ = anIntArray4609[i_648_];
					if ((i_640_ ^ 0xffffffff) < (i_649_ ^ 0xffffffff))
						i_640_ = i_649_;
					if (i_642_ > i_651_)
						i_642_ = i_651_;
					if (i_645_ < i_651_)
						i_645_ = i_651_;
					int i_652_ = i_651_ * i_651_ + i_649_ * i_649_;
					if ((i_652_ ^ 0xffffffff) < (i_646_ ^ 0xffffffff))
						i_646_ = i_652_;
					i_652_ = i_651_ * i_651_ + i_649_ * i_649_ - -(i_650_ * i_650_);
					if (i_647_ < i_652_)
						i_647_ = i_652_;
				}
				aShort4638 = (short) i_643_;
				f_eb = (short) i_642_;
				aShort4590 = (short) i_645_;
				aShort4614 = (short) i_644_;
				aShort4622 = (short) i_640_;
				f_lb = (short) i_641_;
				aShort4605 = (short) (int) (0.99 + Math.sqrt((double) i_646_));
				Math.sqrt((double) i_647_);
				aBool4606 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.TA(" + i + ')');
		}
	}

	final int WA() {
		try {
			if (!aBool4606)
				method2038(16383);
			f_mb++;
			return aShort4614;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.WA(" + ')');
		}
	}

	final void method677() {
		try {
			anInt4604++;
			if (anInt4612 > 0 && (anInt4574 ^ 0xffffffff) < -1) {
				method2033(-12, false);
				if ((f_qb & 0x10) == 0 && ((Class218) aClass218_4594).anInterface1_3032 == null)
					method2042(false, false);
				method2041(-126);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.J(" + ')');
		}
	}

	final void I(short i, short i_653_) {
		do {
			try {
				anInt4635++;
				Interface6 interface6 = ((Class260) aClass260_Sub2_4636).anInterface6_3714;
				for (int i_654_ = 0; (f_kc ^ 0xffffffff) < (i_654_ ^ 0xffffffff); i_654_++) {
					if (f_tb[i_654_] == i)
						f_tb[i_654_] = i_653_;
				}
				byte i_655_ = 0;
				byte i_656_ = 0;
				if (i != -1) {
					Class238 class238 = interface6.method17(-31305, 0xffff & i);
					i_656_ = ((Class238) class238).aByte3338;
					i_655_ = ((Class238) class238).aByte3344;
				}
				byte i_657_ = 0;
				byte i_658_ = 0;
				if (i_653_ != -1) {
					Class238 class238 = interface6.method17(-31305, 0xffff & i_653_);
					i_657_ = ((Class238) class238).aByte3344;
					i_658_ = ((Class238) class238).aByte3338;
				}
				if (!(i_655_ != i_657_ | (i_656_ ^ 0xffffffff) != (i_658_ ^ 0xffffffff)))
					break;
				if (f_bc != null) {
					for (int i_659_ = 0; i_659_ < f_ic; i_659_++) {
						Class_j class_j = f_bc[i_659_];
						Class69 class69 = f_jb[i_659_];
						((Class69) class69).anInt911 = (((Class69) class69).anInt911 & ~0xffffff | ((Class40_Sub3.anIntArray4064[aShortArray4581[(((Class_j) class_j).anInt1471)] & 0xffff]) & 0xffffff));
					}
				}
				if (aClass160_4596 == null)
					break;
				((Class160) aClass160_4596).anInterface10_2264 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.I(" + i + ',' + i_653_ + ')');
			}
			break;
		} while (false);
	}

	static final String method2039(long l, int i) {
		try {
			Class246_Sub28_Sub22.aCalendar6634.setTime(new Date(l));
			f_pb++;
			if (i != -20881)
				return null;
			int i_660_ = Class246_Sub28_Sub22.aCalendar6634.get(7);
			int i_661_ = Class246_Sub28_Sub22.aCalendar6634.get(5);
			int i_662_ = Class246_Sub28_Sub22.aCalendar6634.get(2);
			int i_663_ = Class246_Sub28_Sub22.aCalendar6634.get(1);
			int i_664_ = Class246_Sub28_Sub22.aCalendar6634.get(11);
			int i_665_ = Class246_Sub28_Sub22.aCalendar6634.get(12);
			int i_666_ = Class246_Sub28_Sub22.aCalendar6634.get(13);
			return (Class21_Sub1.aStringArray3909[i_660_ - 1] + ", " + i_661_ / 10 + i_661_ % 10 + "-" + Class246_Sub28_Sub25.aStringArray6707[i_662_] + "-" + i_663_ + " " + i_664_ / 10 + i_664_ % 10 + ":" + i_665_ / 10 + i_665_ % 10 + ":" + i_666_ / 10 + i_666_ % 10 + " GMT");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.VA(" + l + ',' + i + ')');
		}
	}

	final int P() {
		try {
			anInt4593++;
			return anInt4621;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.P(" + ')');
		}
	}

	private final boolean method2040(boolean bool, int i, int i_667_, int i_668_, int i_669_, int i_670_, int i_671_, int i_672_, int i_673_) {
		try {
			anInt4624++;
			if ((i_667_ ^ 0xffffffff) < (i_669_ ^ 0xffffffff) && i_669_ < i_671_ && (i_672_ ^ 0xffffffff) < (i_669_ ^ 0xffffffff))
				return false;
			if ((i_667_ ^ 0xffffffff) > (i_669_ ^ 0xffffffff) && i_669_ > i_671_ && (i_669_ ^ 0xffffffff) < (i_672_ ^ 0xffffffff))
				return false;
			if ((i_673_ ^ 0xffffffff) > (i ^ 0xffffffff) && (i_670_ ^ 0xffffffff) < (i_673_ ^ 0xffffffff) && (i_668_ ^ 0xffffffff) < (i_673_ ^ 0xffffffff))
				return false;
			if ((i_673_ ^ 0xffffffff) < (i ^ 0xffffffff) && i_673_ > i_670_ && (i_668_ ^ 0xffffffff) > (i_673_ ^ 0xffffffff))
				return false;
			if (bool != false)
				return true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ip.HB(" + bool + ',' + i + ',' + i_667_ + ',' + i_668_ + ',' + i_669_ + ',' + i_670_ + ',' + i_671_ + ',' + i_672_ + ',' + i_673_ + ')'));
		}
	}

	private final void method2041(int i) {
		do {
			try {
				f_nb++;
				if (f_sb) {
					f_sb = false;
					if (aClass19Array4629 == null && aClass162Array4627 == null && f_bc == null) {
						if (anIntArray4586 != null && !Class59_Sub5.method2280(anInt4616, -1, anInt4621)) {
							if (aClass160_4587 == null || (((Class160) aClass160_4587).anInterface10_2264) != null) {
								if (!aBool4606)
									method2038(16383);
								anIntArray4586 = null;
							} else
								f_sb = true;
						}
						if (f_pc != null && !Class246_Sub7.method1830(anInt4621, anInt4616, 2074)) {
							if (aClass160_4587 != null && (((Class160) aClass160_4587).anInterface10_2264) == null)
								f_sb = true;
							else {
								if (!aBool4606)
									method2038(16383);
								f_pc = null;
							}
						}
						if (anIntArray4609 != null && !Class59_Sub4_Sub2.method2824(anInt4616, 125, anInt4621)) {
							if (aClass160_4587 == null || (((Class160) aClass160_4587).anInterface10_2264) != null) {
								if (!aBool4606)
									method2038(16383);
								anIntArray4609 = null;
							} else
								f_sb = true;
						}
					}
					if (f_fc != null && anIntArray4586 == null && f_pc == null && anIntArray4609 == null) {
						anIntArray4630 = null;
						f_fc = null;
					}
					if (aByteArray4631 != null && !Class246_Sub13.method1987(anInt4616, (byte) -120, anInt4621)) {
						if (f_cc == null) {
							if (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264) == null)
								f_sb = true;
							else {
								aByteArray4631 = null;
								aShortArray4589 = aShortArray4582 = aShortArray4588 = null;
							}
						} else if (((Class160) f_cc).anInterface10_2264 == null)
							f_sb = true;
						else {
							aShortArray4589 = aShortArray4582 = aShortArray4588 = null;
							aByteArray4631 = null;
						}
					}
					if (i > -115)
						anInt4574 = -10;
					if (aShortArray4581 != null && !Class246_Sub31.method2162(anInt4621, anInt4616, (byte) 112)) {
						if (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264 == null))
							f_sb = true;
						else
							aShortArray4581 = null;
					}
					if (aByteArray4620 != null && !Class102_Sub1.method2008(-16623, anInt4616, anInt4621)) {
						if (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264 == null))
							f_sb = true;
						else
							aByteArray4620 = null;
					}
					if (aFloatArray4619 != null && !Class219.method1421(true, anInt4616, anInt4621)) {
						if (aClass160_4626 == null || (((Class160) aClass160_4626).anInterface10_2264 != null))
							aFloatArray4619 = aFloatArray4575 = null;
						else
							f_sb = true;
					}
					if (f_tb != null && !Class246_Sub19_Sub2.method2814(anInt4616, false, anInt4621)) {
						if (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264 == null))
							f_sb = true;
						else
							f_tb = null;
					}
					if (aShortArray4613 != null && !Class171.method1131(anInt4616, anInt4621, 15)) {
						if ((aClass218_4594 != null && (((Class218) aClass218_4594).anInterface1_3032 == null)) || (aClass160_4596 != null && (((Class160) aClass160_4596).anInterface10_2264) == null))
							f_sb = true;
						else
							aShortArray4613 = aShortArray4602 = f_hb = null;
					}
					if (anIntArrayArray4585 != null && !Class59_Sub5.method2283((byte) 127, anInt4616, anInt4621)) {
						aShortArray4595 = null;
						anIntArrayArray4585 = null;
					}
					if (f_ac != null && !Class246_Sub28_Sub2.method2457(anInt4616, 11, anInt4621)) {
						f_ac = null;
						aShortArray4576 = null;
					}
					if (anIntArrayArray4579 != null && !Class59_Sub3.method2169(-18445, anInt4621, anInt4616))
						anIntArrayArray4579 = null;
					if (anIntArray4640 == null || (anInt4621 & 0x800) != 0 || (anInt4621 & 0x40000 ^ 0xffffffff) != -1)
						break;
					anIntArray4640 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ip.DB(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2042(boolean bool, boolean bool_674_) {
		do {
			try {
				if (bool_674_ != false)
					HA();
				if ((anInt4574 * 6 ^ 0xffffffff) < ((((BufferStream) Class206.aStream_Sub2_2908).buffer).length ^ 0xffffffff))
					Class206.aStream_Sub2_2908 = new Stream_Sub2(600 + 6 * anInt4574);
				else
					((BufferStream) Class206.aStream_Sub2_2908).position = 0;
				anInt4623++;
				if (!((Class260_Sub2) aClass260_Sub2_4636).aBool4392) {
					for (int i = 0; (anInt4574 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						Class206.aStream_Sub2_2908.method2404((byte) -98, aShortArray4613[i]);
						Class206.aStream_Sub2_2908.method2404((byte) -70, aShortArray4602[i]);
						Class206.aStream_Sub2_2908.method2404((byte) -56, f_hb[i]);
					}
				} else {
					for (int i = 0; i < anInt4574; i++) {
						Class206.aStream_Sub2_2908.writeShort((byte) 67, aShortArray4613[i]);
						Class206.aStream_Sub2_2908.writeShort((byte) 67, aShortArray4602[i]);
						Class206.aStream_Sub2_2908.writeShort((byte) 67, f_hb[i]);
					}
				}
				if ((((BufferStream) Class206.aStream_Sub2_2908).position ^ 0xffffffff) != -1) {
					if (bool) {
						if (f_jc != null)
							f_jc.method2((((BufferStream) Class206.aStream_Sub2_2908).buffer), true, 5123, (((BufferStream) Class206.aStream_Sub2_2908).position));
						else
							f_jc = (aClass260_Sub2_4636.method1955(112, ((BufferStream) Class206.aStream_Sub2_2908).position, true, (((BufferStream) Class206.aStream_Sub2_2908).buffer), 5123));
						((Class218) aClass218_4594).anInterface1_3032 = f_jc;
					} else
						((Class218) aClass218_4594).anInterface1_3032 = (aClass260_Sub2_4636.method1955(107, ((BufferStream) Class206.aStream_Sub2_2908).position, false, (((BufferStream) Class206.aStream_Sub2_2908).buffer), 5123));
					if (bool)
						break;
					f_sb = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ip.C(" + bool + ',' + bool_674_ + ')'));
			}
			break;
		} while (false);
	}

	final int MA() {
		try {
			if (!aBool4606)
				method2038(16383);
			f_bb++;
			return f_lb;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.MA(" + ')');
		}
	}

	Class_t_Sub1(Class260_Sub2 class260_sub2) {
		anInt4574 = 0;
		anInt4617 = 0;
		anInt4639 = 0;
		f_sb = true;
		anInt4612 = 0;
		f_kc = 0;
		try {
			aClass260_Sub2_4636 = class260_sub2;
			aClass160_4587 = new Class160(null, 5126, 3, 0);
			aClass160_4626 = new Class160(null, 5126, 2, 0);
			f_cc = new Class160(null, 5126, 3, 0);
			aClass160_4596 = new Class160(null, 5121, 4, 0);
			aClass218_4594 = new Class218();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ip.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	Class_t_Sub1(Class260_Sub2 class260_sub2, Class103 class103, int i, int i_675_, int i_676_, int i_677_) {
		anInt4574 = 0;
		anInt4617 = 0;
		anInt4639 = 0;
		f_sb = true;
		anInt4612 = 0;
		f_kc = 0;
		do {
			try {
				anInt4616 = i_677_;
				aClass260_Sub2_4636 = class260_sub2;
				anInt4621 = i;
				if (Class241.method1544(i_677_, (byte) 127, i))
					aClass160_4587 = new Class160(null, 5126, 3, 0);
				if (Class3.method51(i, i_677_, -128))
					aClass160_4626 = new Class160(null, 5126, 2, 0);
				if (Class246_Sub7.method1835(i, i_677_, -122))
					f_cc = new Class160(null, 5126, 3, 0);
				if (Class246_Sub6.method1818(i_677_, i, 127))
					aClass160_4596 = new Class160(null, 5121, 4, 0);
				if (Class223.method1437(i_677_, i, (byte) -32))
					aClass218_4594 = new Class218();
				Interface6 interface6 = ((Class260) class260_sub2).anInterface6_3714;
				int[] is = new int[((Class103) class103).anInt1368];
				anIntArray4630 = new int[((Class103) class103).anInt1354 + 1];
				for (int i_678_ = 0; ((Class103) class103).anInt1368 > i_678_; i_678_++) {
					if ((((Class103) class103).aByteArray1345 == null || ((Class103) class103).aByteArray1345[i_678_] != 2) && (((Class103) class103).f_cb == null || (((Class103) class103).f_cb[i_678_] ^ 0xffffffff) == 0 || !((Class238) interface6.method17(-31305, ((((Class103) class103).f_cb[i_678_]) & 0xffff))).aBool3348)) {
						is[f_kc++] = i_678_;
						anIntArray4630[(((Class103) class103).aShortArray1337[i_678_])]++;
						anIntArray4630[(((Class103) class103).aShortArray1334[i_678_])]++;
						anIntArray4630[(((Class103) class103).aShortArray1329[i_678_])]++;
					}
				}
				anInt4574 = f_kc;
				long[] ls = new long[f_kc];
				boolean bool = (anInt4621 & 0x100) != 0;
				while_167_: for (int i_679_ = 0; i_679_ < f_kc; i_679_++) {
					int i_680_ = is[i_679_];
					Class238 class238 = null;
					int i_681_ = 0;
					int i_682_ = 0;
					int i_683_ = 0;
					int i_684_ = 0;
					if (((Class103) class103).aClass131Array1348 != null) {
						for (int i_685_ = 0; ((((Class103) class103).aClass131Array1348.length ^ 0xffffffff) < (i_685_ ^ 0xffffffff)); i_685_++) {
							Class131 class131 = (((Class103) class103).aClass131Array1348[i_685_]);
							if ((i_680_ ^ 0xffffffff) == (((Class131) class131).anInt1823 ^ 0xffffffff)) {
								Class98 class98 = Class247.method1578(true, (((Class131) class131).anInt1828));
								if (((Class98) class98).aBool1277) {
									ls[i_679_] = 9223372036854775807L;
									anInt4574--;
									continue while_167_;
								}
							}
						}
					}
					int i_686_ = -1;
					if (((Class103) class103).f_cb != null) {
						i_686_ = ((Class103) class103).f_cb[i_680_];
						if (i_686_ != -1) {
							class238 = interface6.method17(-31305, i_686_ & 0xffff);
							i_683_ = ((Class238) class238).aByte3343;
							i_684_ = ((Class238) class238).aByte3342;
						}
					}
					boolean bool_687_ = ((((Class103) class103).aByteArray1371 != null && (((Class103) class103).aByteArray1371[i_680_] != 0)) || (class238 != null && !((Class238) class238).aBool3340));
					if ((bool || bool_687_) && ((Class103) class103).aByteArray1332 != null)
						i_681_ += (((Class103) class103).aByteArray1332[i_680_] << 17);
					if (bool_687_)
						i_681_ += 65536;
					i_681_ += i_683_ << 8 & 0xff00;
					i_681_ += 0xff & i_684_;
					i_682_ += (0xffff & i_686_) << 16;
					i_682_ += 0xffff & i_679_;
					ls[i_679_] = ((long) i_681_ << 32) - -(long) i_682_;
				}
				Class233.method1493(is, ls, 29621);
				anInt4639 = ((Class103) class103).anInt1354;
				anIntArray4586 = ((Class103) class103).anIntArray1343;
				f_pc = ((Class103) class103).anIntArray1328;
				anInt4617 = ((Class103) class103).anInt1331;
				anIntArray4609 = ((Class103) class103).anIntArray1375;
				aShortArray4576 = ((Class103) class103).aShortArray1351;
				aClass19Array4629 = ((Class103) class103).aClass19Array1364;
				aClass162Array4627 = ((Class103) class103).aClass162Array1346;
				Class179[] class179s = new Class179[anInt4639];
				if (((Class103) class103).aClass131Array1348 != null) {
					f_ic = ((Class103) class103).aClass131Array1348.length;
					f_bc = new Class_j[f_ic];
					f_jb = new Class69[f_ic];
					for (int i_688_ = 0; (i_688_ ^ 0xffffffff) > (f_ic ^ 0xffffffff); i_688_++) {
						Class131 class131 = ((Class103) class103).aClass131Array1348[i_688_];
						Class98 class98 = Class247.method1578(true, (((Class131) class131).anInt1828));
						int i_689_ = -1;
						for (int i_690_ = 0; f_kc > i_690_; i_690_++) {
							if ((is[i_690_] ^ 0xffffffff) == (((Class131) class131).anInt1823 ^ 0xffffffff)) {
								i_689_ = i_690_;
								break;
							}
						}
						if ((i_689_ ^ 0xffffffff) == 0)
							throw new RuntimeException();
						int i_691_ = (0xffffff & (Class40_Sub3.anIntArray4064[((((Class103) class103).aShortArray1353[((Class131) class131).anInt1823]) & 0xffff)]));
						i_691_ = (i_691_ | -(((Class103) class103).aByteArray1371 == null ? (int) 0 : (((Class103) class103).aByteArray1371[(((Class131) class131).anInt1823)])) + 255 << 24);
						f_bc[i_688_] = new Class_j(i_689_, (((Class103) class103).aShortArray1337[((Class131) class131).anInt1823]), (((Class103) class103).aShortArray1334[((Class131) class131).anInt1823]), (((Class103) class103).aShortArray1329[((Class131) class131).anInt1823]), ((Class98) class98).anInt1271, ((Class98) class98).anInt1278, ((Class98) class98).anInt1269, ((Class98) class98).anInt1268, ((Class98) class98).anInt1276, ((Class98) class98).aBool1277, ((Class98) class98).aBool1266, ((Class131) class131).anInt1830);
						f_jb[i_688_] = new Class69(i_691_);
					}
				}
				int i_692_ = 3 * f_kc;
				aFloatArray4619 = new float[i_692_];
				aByteArray4620 = new byte[f_kc];
				aFloatArray4575 = new float[i_692_];
				f_tb = new short[f_kc];
				f_tc = (short) i_675_;
				f_fc = new short[i_692_];
				aShortArray4582 = new short[i_692_];
				Class243.aLongArray3444 = new long[i_692_];
				aShortArray4588 = new short[i_692_];
				if (((Class103) class103).aShortArray1338 != null)
					aShortArray4595 = new short[f_kc];
				aShortArray4589 = new short[i_692_];
				aShortArray4613 = new short[f_kc];
				aShort4628 = (short) i_676_;
				aShortArray4602 = new short[f_kc];
				f_hb = new short[f_kc];
				aShortArray4581 = new short[f_kc];
				aByteArray4631 = new byte[i_692_];
				int i_693_ = 0;
				for (int i_694_ = 0; i_694_ < ((Class103) class103).anInt1354; i_694_++) {
					int i_695_ = anIntArray4630[i_694_];
					anIntArray4630[i_694_] = i_693_;
					class179s[i_694_] = new Class179();
					i_693_ += i_695_;
				}
				anIntArray4630[((Class103) class103).anInt1354] = i_693_;
				int[] is_696_ = null;
				int[] is_697_ = null;
				int[] is_698_ = null;
				float[][] fs = null;
				if (((Class103) class103).f_bb != null) {
					int i_699_ = ((Class103) class103).f_db;
					int[] is_700_ = new int[i_699_];
					int[] is_701_ = new int[i_699_];
					int[] is_702_ = new int[i_699_];
					int[] is_703_ = new int[i_699_];
					int[] is_704_ = new int[i_699_];
					int[] is_705_ = new int[i_699_];
					for (int i_706_ = 0; i_699_ > i_706_; i_706_++) {
						is_700_[i_706_] = 2147483647;
						is_701_[i_706_] = -2147483647;
						is_702_[i_706_] = 2147483647;
						is_703_[i_706_] = -2147483647;
						is_704_[i_706_] = 2147483647;
						is_705_[i_706_] = -2147483647;
					}
					is_698_ = new int[i_699_];
					for (int i_707_ = 0; (f_kc ^ 0xffffffff) < (i_707_ ^ 0xffffffff); i_707_++) {
						int i_708_ = is[i_707_];
						if ((((Class103) class103).f_bb[i_708_] ^ 0xffffffff) != 0) {
							int i_709_ = 0xff & ((Class103) class103).f_bb[i_708_];
							for (int i_710_ = 0; i_710_ < 3; i_710_++) {
								short i_711_;
								if ((i_710_ ^ 0xffffffff) == -1)
									i_711_ = (((Class103) class103).aShortArray1337[i_708_]);
								else if (i_710_ != 1)
									i_711_ = (((Class103) class103).aShortArray1329[i_708_]);
								else
									i_711_ = (((Class103) class103).aShortArray1334[i_708_]);
								int i_712_ = (((Class103) class103).anIntArray1343[i_711_]);
								int i_713_ = (((Class103) class103).anIntArray1328[i_711_]);
								int i_714_ = (((Class103) class103).anIntArray1375[i_711_]);
								if ((is_700_[i_709_] ^ 0xffffffff) < (i_712_ ^ 0xffffffff))
									is_700_[i_709_] = i_712_;
								if (i_712_ > is_701_[i_709_])
									is_701_[i_709_] = i_712_;
								if ((i_713_ ^ 0xffffffff) > (is_702_[i_709_] ^ 0xffffffff))
									is_702_[i_709_] = i_713_;
								if (i_713_ > is_703_[i_709_])
									is_703_[i_709_] = i_713_;
								if ((is_704_[i_709_] ^ 0xffffffff) < (i_714_ ^ 0xffffffff))
									is_704_[i_709_] = i_714_;
								if (is_705_[i_709_] < i_714_)
									is_705_[i_709_] = i_714_;
							}
						}
					}
					is_696_ = new int[i_699_];
					is_697_ = new int[i_699_];
					fs = new float[i_699_][];
					for (int i_715_ = 0; (i_699_ ^ 0xffffffff) < (i_715_ ^ 0xffffffff); i_715_++) {
						byte i_716_ = ((Class103) class103).f_eb[i_715_];
						if (i_716_ > 0) {
							is_696_[i_715_] = (is_700_[i_715_] + is_701_[i_715_]) / 2;
							is_697_[i_715_] = (is_702_[i_715_] + is_703_[i_715_]) / 2;
							is_698_[i_715_] = (is_705_[i_715_] + is_704_[i_715_]) / 2;
							float f;
							float f_717_;
							float f_718_;
							if ((i_716_ ^ 0xffffffff) == -2) {
								int i_719_ = (((Class103) class103).anIntArray1370[i_715_]);
								f_718_ = 64.0F / (float) (((Class103) class103).anIntArray1367[i_715_]);
								if (i_719_ == 0) {
									f_717_ = 1.0F;
									f = 1.0F;
								} else if (i_719_ > 0) {
									f_717_ = 1.0F;
									f = (float) i_719_ / 1024.0F;
								} else {
									f = 1.0F;
									f_717_ = (float) -i_719_ / 1024.0F;
								}
							} else if (i_716_ == 2) {
								f = 64.0F / (float) (((Class103) class103).anIntArray1373[i_715_]);
								f_717_ = 64.0F / (float) (((Class103) class103).anIntArray1370[i_715_]);
								f_718_ = 64.0F / (float) (((Class103) class103).anIntArray1367[i_715_]);
							} else {
								f = ((float) (((Class103) class103).anIntArray1373[i_715_]) / 1024.0F);
								f_718_ = ((float) (((Class103) class103).anIntArray1367[i_715_]) / 1024.0F);
								f_717_ = ((float) (((Class103) class103).anIntArray1370[i_715_]) / 1024.0F);
							}
							fs[i_715_] = (Class257.method1665(f_717_, PacketsDecoder.method184(255, (((Class103) class103).aByteArray1330[i_715_])), (((Class103) class103).aShortArray1326[i_715_]), (((Class103) class103).aShortArray1362[i_715_]), (((Class103) class103).aShortArray1333[i_715_]), (byte) -66, f_718_, f));
						}
					}
				}
				Class75[] class75s = new Class75[((Class103) class103).anInt1368];
				for (int i_720_ = 0; i_720_ < ((Class103) class103).anInt1368; i_720_++) {
					short i_721_ = ((Class103) class103).aShortArray1337[i_720_];
					short i_722_ = ((Class103) class103).aShortArray1334[i_720_];
					short i_723_ = ((Class103) class103).aShortArray1329[i_720_];
					int i_724_ = anIntArray4586[i_722_] - anIntArray4586[i_721_];
					int i_725_ = -f_pc[i_721_] + f_pc[i_722_];
					int i_726_ = anIntArray4609[i_722_] + -anIntArray4609[i_721_];
					int i_727_ = anIntArray4586[i_723_] + -anIntArray4586[i_721_];
					int i_728_ = -f_pc[i_721_] + f_pc[i_723_];
					int i_729_ = anIntArray4609[i_723_] + -anIntArray4609[i_721_];
					int i_730_ = i_729_ * i_725_ + -(i_728_ * i_726_);
					int i_731_ = -(i_729_ * i_724_) + i_727_ * i_726_;
					int i_732_;
					for (i_732_ = i_724_ * i_728_ + -(i_727_ * i_725_); (i_730_ > 8192 || (i_731_ ^ 0xffffffff) < -8193 || i_732_ > 8192 || i_730_ < -8192 || i_731_ < -8192 || (i_732_ ^ 0xffffffff) > 8191); i_732_ >>= 1) {
						i_731_ >>= 1;
						i_730_ >>= 1;
					}
					int i_733_ = (int) Math.sqrt((double) (i_732_ * i_732_ + (i_731_ * i_731_ + i_730_ * i_730_)));
					if (i_733_ <= 0)
						i_733_ = 1;
					i_730_ = i_730_ * 256 / i_733_;
					i_731_ = i_731_ * 256 / i_733_;
					i_732_ = 256 * i_732_ / i_733_;
					byte i_734_ = (((Class103) class103).aByteArray1345 == null ? (byte) 0 : ((Class103) class103).aByteArray1345[i_720_]);
					if ((i_734_ ^ 0xffffffff) != -1) {
						if ((i_734_ ^ 0xffffffff) == -2) {
							Class75 class75 = class75s[i_720_] = new Class75();
							((Class75) class75).anInt981 = i_731_;
							((Class75) class75).anInt982 = i_732_;
							((Class75) class75).anInt984 = i_730_;
						}
					} else {
						Class179 class179 = class179s[i_721_];
						((Class179) class179).anInt2517++;
						((Class179) class179).anInt2514 += i_731_;
						((Class179) class179).anInt2510 += i_730_;
						((Class179) class179).anInt2506 += i_732_;
						class179 = class179s[i_722_];
						((Class179) class179).anInt2510 += i_730_;
						((Class179) class179).anInt2514 += i_731_;
						((Class179) class179).anInt2517++;
						((Class179) class179).anInt2506 += i_732_;
						class179 = class179s[i_723_];
						((Class179) class179).anInt2510 += i_730_;
						((Class179) class179).anInt2506 += i_732_;
						((Class179) class179).anInt2514 += i_731_;
						((Class179) class179).anInt2517++;
					}
				}
				for (int i_735_ = 0; (f_kc ^ 0xffffffff) < (i_735_ ^ 0xffffffff); i_735_++) {
					int i_736_ = is[i_735_];
					int i_737_ = (0xffff & ((Class103) class103).aShortArray1353[i_736_]);
					short i_738_;
					if (((Class103) class103).f_cb == null)
						i_738_ = (short) -1;
					else
						i_738_ = ((Class103) class103).f_cb[i_736_];
					int i_739_;
					if (((Class103) class103).f_bb != null)
						i_739_ = ((Class103) class103).f_bb[i_736_];
					else
						i_739_ = -1;
					int i_740_;
					if (((Class103) class103).aByteArray1371 != null)
						i_740_ = 0xff & (((Class103) class103).aByteArray1371[i_736_]);
					else
						i_740_ = 0;
					float f = 0.0F;
					float f_741_ = 0.0F;
					float f_742_ = 0.0F;
					float f_743_ = 0.0F;
					float f_744_ = 0.0F;
					float f_745_ = 0.0F;
					int i_746_ = 0;
					int i_747_ = 0;
					int i_748_ = 0;
					if (i_738_ != -1) {
						if (i_739_ == -1) {
							i_746_ = 1;
							f_743_ = 1.0F;
							f_745_ = 0.0F;
							f_741_ = 1.0F;
							f = 0.0F;
							i_747_ = 2;
							f_744_ = 0.0F;
							f_742_ = 1.0F;
						} else {
							i_739_ &= 0xff;
							byte i_749_ = ((Class103) class103).f_eb[i_739_];
							if (i_749_ != 0) {
								short i_750_ = (((Class103) class103).aShortArray1337[i_736_]);
								short i_751_ = (((Class103) class103).aShortArray1334[i_736_]);
								short i_752_ = (((Class103) class103).aShortArray1329[i_736_]);
								int i_753_ = is_696_[i_739_];
								int i_754_ = is_697_[i_739_];
								int i_755_ = is_698_[i_739_];
								float[] fs_756_ = fs[i_739_];
								byte i_757_ = ((Class103) class103).f_ab[i_739_];
								float f_758_ = ((float) (((Class103) class103).f_fb[i_739_]) / 256.0F);
								if (i_749_ == 1) {
									float f_759_ = ((float) (((Class103) class103).anIntArray1373[i_739_]) / 1024.0F);
									Class_o.method2941((((Class103) class103).anIntArray1375[i_750_]), f_758_, i_754_, 8, (((Class103) class103).anIntArray1328[i_750_]), fs_756_, (((Class103) class103).anIntArray1343[i_750_]), i_753_, f_759_, i_757_, i_755_);
									f_741_ = Class246_Sub1_Sub15.aFloat6601;
									f = Class225.aFloat3098;
									Class_o.method2941((((Class103) class103).anIntArray1375[i_751_]), f_758_, i_754_, 8, (((Class103) class103).anIntArray1328[i_751_]), fs_756_, (((Class103) class103).anIntArray1343[i_751_]), i_753_, f_759_, i_757_, i_755_);
									f_742_ = Class225.aFloat3098;
									f_743_ = Class246_Sub1_Sub15.aFloat6601;
									Class_o.method2941((((Class103) class103).anIntArray1375[i_752_]), f_758_, i_754_, 8, (((Class103) class103).anIntArray1328[i_752_]), fs_756_, (((Class103) class103).anIntArray1343[i_752_]), i_753_, f_759_, i_757_, i_755_);
									f_744_ = Class225.aFloat3098;
									f_745_ = Class246_Sub1_Sub15.aFloat6601;
									float f_760_ = f_759_ / 2.0F;
									if ((i_757_ & 0x1) == 0) {
										if (-f + f_742_ > f_760_) {
											f_742_ -= f_759_;
											i_746_ = 1;
										} else if (f_760_ < -f_742_ + f) {
											i_746_ = 2;
											f_742_ += f_759_;
										}
										if (f_760_ < f_744_ - f) {
											i_747_ = 1;
											f_744_ -= f_759_;
										} else if (f_760_ < -f_744_ + f) {
											f_744_ += f_759_;
											i_747_ = 2;
										}
									} else {
										if (!(f_760_ < f_743_ - f_741_)) {
											if (f_741_ - f_743_ > f_760_) {
												f_743_ += f_759_;
												i_746_ = 2;
											}
										} else {
											f_743_ -= f_759_;
											i_746_ = 1;
										}
										if (f_745_ - f_741_ > f_760_) {
											i_747_ = 1;
											f_745_ -= f_759_;
										} else if (f_741_ - f_745_ > f_760_) {
											i_747_ = 2;
											f_745_ += f_759_;
										}
									}
								} else if (i_749_ != 2) {
									if (i_749_ == 3) {
										Class246_Sub28_Sub1.method2455((((Class103) class103).anIntArray1375[i_750_]), f_758_, (((Class103) class103).anIntArray1343[i_750_]), i_753_, true, (((Class103) class103).anIntArray1328[i_750_]), fs_756_, i_757_, i_754_, i_755_);
										f_741_ = Class59_Sub2.aFloat4561;
										f = Class50.aFloat708;
										Class246_Sub28_Sub1.method2455((((Class103) class103).anIntArray1375[i_751_]), f_758_, (((Class103) class103).anIntArray1343[i_751_]), i_753_, true, (((Class103) class103).anIntArray1328[i_751_]), fs_756_, i_757_, i_754_, i_755_);
										f_742_ = Class50.aFloat708;
										f_743_ = Class59_Sub2.aFloat4561;
										Class246_Sub28_Sub1.method2455((((Class103) class103).anIntArray1375[i_752_]), f_758_, (((Class103) class103).anIntArray1343[i_752_]), i_753_, true, (((Class103) class103).anIntArray1328[i_752_]), fs_756_, i_757_, i_754_, i_755_);
										f_744_ = Class50.aFloat708;
										f_745_ = Class59_Sub2.aFloat4561;
										if ((i_757_ & 0x1 ^ 0xffffffff) != -1) {
											if (!(f_743_ - f_741_ > 0.5F)) {
												if (-f_743_ + f_741_ > 0.5F) {
													f_743_++;
													i_746_ = 2;
												}
											} else {
												f_743_--;
												i_746_ = 1;
											}
											if (f_745_ - f_741_ > 0.5F) {
												f_745_--;
												i_747_ = 1;
											} else if (-f_745_ + f_741_ > 0.5F) {
												f_745_++;
												i_747_ = 2;
											}
										} else {
											if (f_744_ - f > 0.5F) {
												f_744_--;
												i_747_ = 1;
											} else if (f - f_744_ > 0.5F) {
												i_747_ = 2;
												f_744_++;
											}
											if (-f + f_742_ > 0.5F) {
												f_742_--;
												i_746_ = 1;
											} else if (f - f_742_ > 0.5F) {
												i_746_ = 2;
												f_742_++;
											}
										}
									}
								} else {
									float f_761_ = ((float) (((Class103) class103).anIntArray1335[i_739_]) / 256.0F);
									float f_762_ = ((float) (((Class103) class103).anIntArray1366[i_739_]) / 256.0F);
									int i_763_ = ((((Class103) class103).anIntArray1343[i_751_]) + -(((Class103) class103).anIntArray1343[i_750_]));
									int i_764_ = ((((Class103) class103).anIntArray1328[i_751_]) + -(((Class103) class103).anIntArray1328[i_750_]));
									int i_765_ = (-(((Class103) class103).anIntArray1375[i_750_]) + (((Class103) class103).anIntArray1375[i_751_]));
									int i_766_ = (-(((Class103) class103).anIntArray1343[i_750_]) + (((Class103) class103).anIntArray1343[i_752_]));
									int i_767_ = (-(((Class103) class103).anIntArray1328[i_750_]) + (((Class103) class103).anIntArray1328[i_752_]));
									int i_768_ = (-(((Class103) class103).anIntArray1375[i_750_]) + (((Class103) class103).anIntArray1375[i_752_]));
									int i_769_ = i_768_ * i_764_ - i_767_ * i_765_;
									int i_770_ = -(i_768_ * i_763_) + i_766_ * i_765_;
									int i_771_ = -(i_766_ * i_764_) + i_763_ * i_767_;
									float f_772_ = (64.0F / (float) (((Class103) class103).anIntArray1370[i_739_]));
									float f_773_ = (64.0F / (float) (((Class103) class103).anIntArray1367[i_739_]));
									float f_774_ = (64.0F / (float) (((Class103) class103).anIntArray1373[i_739_]));
									float f_775_ = ((fs_756_[1] * (float) i_770_ + (float) i_769_ * fs_756_[0] + (float) i_771_ * fs_756_[2]) / f_772_);
									float f_776_ = ((fs_756_[5] * (float) i_771_ + (fs_756_[4] * (float) i_770_ + fs_756_[3] * (float) i_769_)) / f_773_);
									float f_777_ = ((fs_756_[7] * (float) i_770_ + (float) i_769_ * fs_756_[6] + (float) i_771_ * fs_756_[8]) / f_774_);
									i_748_ = Class252.method1617((byte) -91, f_775_, f_777_, f_776_);
									Class38_Sub1_Sub1.method2769(fs_756_, true, f_761_, f_758_, (((Class103) class103).anIntArray1343[i_750_]), f_762_, (((Class103) class103).anIntArray1328[i_750_]), i_755_, i_748_, i_757_, i_753_, i_754_, (((Class103) class103).anIntArray1375[i_750_]));
									f = Class21_Sub3.aFloat4728;
									f_741_ = Class180.aFloat2521;
									Class38_Sub1_Sub1.method2769(fs_756_, true, f_761_, f_758_, (((Class103) class103).anIntArray1343[i_751_]), f_762_, (((Class103) class103).anIntArray1328[i_751_]), i_755_, i_748_, i_757_, i_753_, i_754_, (((Class103) class103).anIntArray1375[i_751_]));
									f_742_ = Class21_Sub3.aFloat4728;
									f_743_ = Class180.aFloat2521;
									Class38_Sub1_Sub1.method2769(fs_756_, true, f_761_, f_758_, (((Class103) class103).anIntArray1343[i_752_]), f_762_, (((Class103) class103).anIntArray1328[i_752_]), i_755_, i_748_, i_757_, i_753_, i_754_, (((Class103) class103).anIntArray1375[i_752_]));
									f_744_ = Class21_Sub3.aFloat4728;
									f_745_ = Class180.aFloat2521;
								}
							} else {
								short i_778_ = (((Class103) class103).aShortArray1337[i_736_]);
								short i_779_ = (((Class103) class103).aShortArray1334[i_736_]);
								short i_780_ = (((Class103) class103).aShortArray1329[i_736_]);
								short i_781_ = (((Class103) class103).aShortArray1333[i_739_]);
								short i_782_ = (((Class103) class103).aShortArray1326[i_739_]);
								short i_783_ = (((Class103) class103).aShortArray1362[i_739_]);
								float f_784_ = (float) (((Class103) class103).anIntArray1343[i_781_]);
								float f_785_ = (float) (((Class103) class103).anIntArray1328[i_781_]);
								float f_786_ = (float) (((Class103) class103).anIntArray1375[i_781_]);
								float f_787_ = ((float) (((Class103) class103).anIntArray1343[i_782_]) - f_784_);
								float f_788_ = ((float) (((Class103) class103).anIntArray1328[i_782_]) - f_785_);
								float f_789_ = (-f_786_ + (float) (((Class103) class103).anIntArray1375[i_782_]));
								float f_790_ = ((float) (((Class103) class103).anIntArray1343[i_783_]) - f_784_);
								float f_791_ = ((float) (((Class103) class103).anIntArray1328[i_783_]) - f_785_);
								float f_792_ = ((float) (((Class103) class103).anIntArray1375[i_783_]) - f_786_);
								float f_793_ = ((float) (((Class103) class103).anIntArray1343[i_778_]) - f_784_);
								float f_794_ = ((float) (((Class103) class103).anIntArray1328[i_778_]) - f_785_);
								float f_795_ = ((float) (((Class103) class103).anIntArray1375[i_778_]) - f_786_);
								float f_796_ = ((float) (((Class103) class103).anIntArray1343[i_779_]) - f_784_);
								float f_797_ = (-f_785_ + (float) (((Class103) class103).anIntArray1328[i_779_]));
								float f_798_ = (-f_786_ + (float) (((Class103) class103).anIntArray1375[i_779_]));
								float f_799_ = (-f_784_ + (float) (((Class103) class103).anIntArray1343[i_780_]));
								float f_800_ = ((float) (((Class103) class103).anIntArray1328[i_780_]) - f_785_);
								float f_801_ = (-f_786_ + (float) (((Class103) class103).anIntArray1375[i_780_]));
								float f_802_ = -(f_791_ * f_789_) + f_788_ * f_792_;
								float f_803_ = -(f_792_ * f_787_) + f_790_ * f_789_;
								float f_804_ = -(f_788_ * f_790_) + f_787_ * f_791_;
								float f_805_ = -(f_803_ * f_792_) + f_804_ * f_791_;
								float f_806_ = f_802_ * f_792_ - f_804_ * f_790_;
								float f_807_ = -(f_791_ * f_802_) + f_803_ * f_790_;
								float f_808_ = 1.0F / (f_805_ * f_787_ + f_806_ * f_788_ + f_807_ * f_789_);
								f_742_ = f_808_ * (f_806_ * f_797_ + f_805_ * f_796_ + f_798_ * f_807_);
								f = (f_806_ * f_794_ + f_793_ * f_805_ + f_795_ * f_807_) * f_808_;
								f_744_ = f_808_ * (f_801_ * f_807_ + (f_806_ * f_800_ + f_799_ * f_805_));
								f_807_ = -(f_802_ * f_788_) + f_803_ * f_787_;
								f_805_ = f_804_ * f_788_ - f_803_ * f_789_;
								f_806_ = f_802_ * f_789_ - f_804_ * f_787_;
								f_808_ = 1.0F / (f_807_ * f_792_ + (f_806_ * f_791_ + f_790_ * f_805_));
								f_743_ = (f_806_ * f_797_ + f_796_ * f_805_ + f_807_ * f_798_) * f_808_;
								f_741_ = (f_807_ * f_795_ + (f_806_ * f_794_ + f_793_ * f_805_)) * f_808_;
								f_745_ = f_808_ * (f_807_ * f_801_ + (f_800_ * f_806_ + f_805_ * f_799_));
							}
						}
					}
					byte i_809_;
					if (((Class103) class103).aByteArray1345 == null)
						i_809_ = (byte) 0;
					else
						i_809_ = ((Class103) class103).aByteArray1345[i_736_];
					if ((i_809_ ^ 0xffffffff) != -1) {
						if (i_809_ == 1) {
							Class75 class75 = class75s[i_736_];
							long l = ((((long) (i_748_ << 24) + (long) (i_737_ << 8) + (long) i_740_) << 32) + (long) (((256 + ((Class75) class75).anInt981) << 12) + ((((Class75) class75).anInt984 ^ 0xffffffff) < -1 ? 1024 : 2048) + ((i_739_ << 2) + (256 + (((Class75) class75).anInt982) << 22))));
							aShortArray4613[i_735_] = method2037(((Class75) class75).anInt982, l, f_741_, f, 0, (byte) 5, ((Class75) class75).anInt981, (((Class103) class103).aShortArray1337[i_736_]), class103, ((Class75) class75).anInt984);
							aShortArray4602[i_735_] = method2037(((Class75) class75).anInt982, l + (long) i_746_, f_743_, f_742_, 0, (byte) 5, ((Class75) class75).anInt981, (((Class103) class103).aShortArray1334[i_736_]), class103, ((Class75) class75).anInt984);
							f_hb[i_735_] = method2037(((Class75) class75).anInt982, l + (long) i_747_, f_745_, f_744_, 0, (byte) 5, ((Class75) class75).anInt981, (((Class103) class103).aShortArray1329[i_736_]), class103, ((Class75) class75).anInt984);
						}
					} else {
						long l = ((long) (i_739_ << 2) + ((long) (i_737_ << 8) + ((long) (i_748_ << 24) + (long) i_740_) << 32));
						short i_810_ = ((Class103) class103).aShortArray1337[i_736_];
						short i_811_ = ((Class103) class103).aShortArray1334[i_736_];
						short i_812_ = ((Class103) class103).aShortArray1329[i_736_];
						Class179 class179 = class179s[i_810_];
						aShortArray4613[i_735_] = method2037(((Class179) class179).anInt2506, l, f_741_, f, ((Class179) class179).anInt2517, (byte) 5, ((Class179) class179).anInt2514, i_810_, class103, ((Class179) class179).anInt2510);
						class179 = class179s[i_811_];
						aShortArray4602[i_735_] = method2037(((Class179) class179).anInt2506, (long) i_746_ + l, f_743_, f_742_, ((Class179) class179).anInt2517, (byte) 5, ((Class179) class179).anInt2514, i_811_, class103, ((Class179) class179).anInt2510);
						class179 = class179s[i_812_];
						f_hb[i_735_] = method2037(((Class179) class179).anInt2506, (long) i_747_ + l, f_745_, f_744_, ((Class179) class179).anInt2517, (byte) 5, ((Class179) class179).anInt2514, i_812_, class103, ((Class179) class179).anInt2510);
					}
					if (((Class103) class103).f_cb == null)
						f_tb[i_735_] = (short) -1;
					else
						f_tb[i_735_] = ((Class103) class103).f_cb[i_736_];
					if (((Class103) class103).aByteArray1371 != null)
						aByteArray4620[i_735_] = ((Class103) class103).aByteArray1371[i_736_];
					if (((Class103) class103).aShortArray1338 != null)
						aShortArray4595[i_735_] = ((Class103) class103).aShortArray1338[i_736_];
					aShortArray4581[i_735_] = ((Class103) class103).aShortArray1353[i_736_];
				}
				int i_813_ = 0;
				short i_814_ = -10000;
				for (int i_815_ = 0; (anInt4574 ^ 0xffffffff) < (i_815_ ^ 0xffffffff); i_815_++) {
					short i_816_ = f_tb[i_815_];
					if ((i_814_ ^ 0xffffffff) != (i_816_ ^ 0xffffffff)) {
						i_813_++;
						i_814_ = i_816_;
					}
				}
				anIntArray4640 = new int[i_813_ + 1];
				i_814_ = (short) -10000;
				i_813_ = 0;
				for (int i_817_ = 0; anInt4574 > i_817_; i_817_++) {
					short i_818_ = f_tb[i_817_];
					if (i_818_ != i_814_) {
						i_814_ = i_818_;
						anIntArray4640[i_813_++] = i_817_;
					}
				}
				anIntArray4640[i_813_] = anInt4574;
				Class243.aLongArray3444 = null;
				aShortArray4589 = Class246_Sub1_Sub6_Sub2.method2908(0, aShortArray4589, anInt4612);
				aShortArray4582 = Class246_Sub1_Sub6_Sub2.method2908(0, aShortArray4582, anInt4612);
				aShortArray4588 = Class246_Sub1_Sub6_Sub2.method2908(0, aShortArray4588, anInt4612);
				aByteArray4631 = Class128.method877((byte) 106, aByteArray4631, anInt4612);
				aFloatArray4619 = Class38_Sub1.method2189(anInt4612, aFloatArray4619, 0);
				aFloatArray4575 = Class38_Sub1.method2189(anInt4612, aFloatArray4575, 0);
				if (((Class103) class103).anIntArray1361 != null && Class246_Sub28_Sub2.method2457(anInt4616, -128, i))
					f_ac = class103.method657((byte) 81);
				if (((Class103) class103).aClass131Array1348 != null && Class59_Sub3.method2169(-18445, i, anInt4616))
					anIntArrayArray4579 = class103.method644((byte) 61);
				if (((Class103) class103).anIntArray1347 == null || !Class59_Sub5.method2283((byte) 111, anInt4616, i))
					break;
				int i_819_ = 0;
				int[] is_820_ = new int[256];
				for (int i_821_ = 0; i_821_ < f_kc; i_821_++) {
					int i_822_ = ((Class103) class103).anIntArray1347[is[i_821_]];
					if (i_822_ >= 0) {
						is_820_[i_822_]++;
						if ((i_822_ ^ 0xffffffff) < (i_819_ ^ 0xffffffff))
							i_819_ = i_822_;
					}
				}
				anIntArrayArray4585 = new int[i_819_ + 1][];
				for (int i_823_ = 0; (i_819_ ^ 0xffffffff) <= (i_823_ ^ 0xffffffff); i_823_++) {
					anIntArrayArray4585[i_823_] = new int[is_820_[i_823_]];
					is_820_[i_823_] = 0;
				}
				for (int i_824_ = 0; f_kc > i_824_; i_824_++) {
					int i_825_ = ((Class103) class103).anIntArray1347[is[i_824_]];
					if (i_825_ >= 0)
						anIntArrayArray4585[i_825_][is_820_[i_825_]++] = i_824_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ip.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class103 != null ? "{...}" : "null") + ',' + i + ',' + i_675_ + ',' + i_676_ + ',' + i_677_ + ')'));
			}
			break;
		} while (false);
	}
}
