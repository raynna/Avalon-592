
import jaclib.memory.Stream;
import jaggl.OpenGL;

final class Class210_Sub2 extends Class210 {
	static int anInt4983;
	static short[] aShortArray4984 = { -10304, 9104, -1, -1, -1 };
	static int anInt4985;
	static int anInt4986;
	static int anInt4987;
	static int anInt4988;
	static int anInt4989;
	int[][][] anIntArrayArrayArray4990;
	int[][][] anIntArrayArrayArray4991;
	private int anInt4992;
	static int anInt4993;
	private int[][][] anIntArrayArrayArray4994;
	private int[][] anIntArrayArray4995;
	private int anInt4996;
	static int anInt4997;
	static int anInt4998;
	private int anInt4999;
	private int[][][] anIntArrayArrayArray5000;
	static int anInt5001;
	static int anInt5002;
	static int anInt5003;
	Class260_Sub2 aClass260_Sub2_5004;
	private Class224 aClass224_5005;
	private Class166 aClass166_5006 = new Class166();
	static Class_fs index8;
	private byte[][] aByteArrayArray5008;
	private int[][][] anIntArrayArrayArray5009;
	static int anInt5010;
	private int anInt5011;
	static int anInt5012;
	private int[][][] anIntArrayArrayArray5013;
	static int anInt5014;
	static Class211 aClass211_5015;
	private Class246_Sub11[][][] aClass246_Sub11ArrayArrayArray5016;
	static int anInt5017;
	static Class248 aClass248_5018 = Class59_Sub3_Sub3.method2622((byte) 108);
	static int anInt5019;
	int anInt5020;
	short[][] aShortArrayArray5021;
	static int anInt5022 = 0;
	private Class160 aClass160_5023;
	Class160 aClass160_5024;
	private Interface10 anInterface10_5025;
	private int anInt5026;
	Class160 f_ab;
	private float[][] f_bb;
	private float[][] f_cb;
	private byte[][] f_db;
	private Class85 f_eb;
	private int f_fb;
	Class160 f_gb;
	private float[][] f_hb;
	private Class246_Sub11[] f_ib;

	public static void method2152(boolean bool) {
		try {
			if (bool == false) {
				aShortArray4984 = null;
				aClass248_5018 = null;
				index8 = null;
				aClass211_5015 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oq.I(" + bool + ')');
		}
	}

	final void method1383(int i, int i_0_) {
		try {
			anInt5003++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oq.H(" + i + ',' + i_0_ + ')');
		}
	}

	final void i(int i, int i_1_, int i_2_) {
		do {
			try {
				anInt4989++;
				if (i_2_ <= (0xff & f_db[i][i_1_]))
					break;
				f_db[i][i_1_] = (byte) i_2_;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oq.i(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void p(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		try {
			anInt5001++;
			if (aClass224_5005 != null && class246_sub1_sub4 != null) {
				int i_6_ = (-(i_3_ * (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).anInt4335) >> 8) + i >> ((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_re);
				int i_7_ = (i_4_ + -((((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).anInt4369) * i_3_ >> 8) >> ((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_re);
				aClass224_5005.method1444(i_7_, i_6_, class246_sub1_sub4, (byte) 57);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.p(" + (class246_sub1_sub4 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + bool + ')'));
		}
	}

	final Class246_Sub1_Sub4 k(int i, int i_8_, Class246_Sub1_Sub4 class246_sub1_sub4) {
		try {
			anInt4988++;
			if ((0x1 & aByteArrayArray5008[i][i_8_] ^ 0xffffffff) == -1)
				return null;
			int i_9_ = (((Class210) this).anInt2955 >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1 = (Class246_Sub1_Sub4_Sub1) class246_sub1_sub4;
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1_10_;
			do {
				if (class246_sub1_sub4_sub1 == null || !class246_sub1_sub4_sub1.method2892(22582, i_9_, i_9_)) {
					class246_sub1_sub4_sub1_10_ = new Class246_Sub1_Sub4_Sub1((((Class210_Sub2) this).aClass260_Sub2_5004), i_9_, i_9_);
					if (!client.f_ob)
						break;
				}
				class246_sub1_sub4_sub1_10_ = class246_sub1_sub4_sub1;
				class246_sub1_sub4_sub1_10_.method2895(292993616);
			} while (false);
			class246_sub1_sub4_sub1_10_.method2890(0, -102, 0, i_9_, i_9_);
			method2153(class246_sub1_sub4_sub1_10_, i, (byte) -82, i_8_);
			return class246_sub1_sub4_sub1_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.k(" + i + ',' + i_8_ + ',' + (class246_sub1_sub4 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1380(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean[][] bools) {
		do {
			try {
				anInt5012++;
				if (f_fb > 0) {
					((Class210_Sub2) this).aClass260_Sub2_5004.method1898(true);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1918(false, 0);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1906(false, -105);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1951(false, (byte) 92);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1911(-32, false);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1958(110, 0);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1957(false, -2);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1905((byte) 78, null);
					Class206.aFloatArray2892[7] = 0.0F;
					Class206.aFloatArray2892[5] = ((float) i_12_ / ((float) (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_tb) * (128.0F * (float) ((Class210) this).anInt2955)));
					Class206.aFloatArray2892[6] = 0.0F;
					Class206.aFloatArray2892[9] = 0.0F;
					Class206.aFloatArray2892[1] = 0.0F;
					Class206.aFloatArray2892[3] = 0.0F;
					Class206.aFloatArray2892[10] = 0.0F;
					Class206.aFloatArray2892[15] = 1.0F;
					Class206.aFloatArray2892[14] = 0.0F;
					Class206.aFloatArray2892[2] = 0.0F;
					Class206.aFloatArray2892[0] = ((float) i_12_ / ((float) (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_vd) * (128.0F * (float) ((Class210) this).anInt2955)));
					Class206.aFloatArray2892[12] = -1.0F - (((float) -(i * 2) + (float) (i_12_ * i_13_) / 128.0F) / (float) ((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_vd);
					Class206.aFloatArray2892[4] = 0.0F;
					Class206.aFloatArray2892[8] = 0.0F;
					Class206.aFloatArray2892[11] = 0.0F;
					Class206.aFloatArray2892[13] = -(((float) (i_11_ * 2) + (float) (i_16_ * i_12_) / 128.0F) / (float) (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_tb)) + 1.0F;
					OpenGL.glMatrixMode(5889);
					OpenGL.glLoadMatrixf(Class206.aFloatArray2892, 0);
					Class206.aFloatArray2892[8] = 0.0F;
					Class206.aFloatArray2892[3] = 0.0F;
					Class206.aFloatArray2892[12] = 0.0F;
					Class206.aFloatArray2892[5] = 0.0F;
					Class206.aFloatArray2892[9] = 1.0F;
					Class206.aFloatArray2892[0] = 1.0F;
					Class206.aFloatArray2892[10] = 0.0F;
					Class206.aFloatArray2892[2] = 0.0F;
					Class206.aFloatArray2892[1] = 0.0F;
					Class206.aFloatArray2892[6] = 1.0F;
					Class206.aFloatArray2892[4] = 0.0F;
					Class206.aFloatArray2892[13] = 0.0F;
					Class206.aFloatArray2892[15] = 1.0F;
					Class206.aFloatArray2892[11] = 0.0F;
					Class206.aFloatArray2892[14] = 0.0F;
					Class206.aFloatArray2892[7] = 0.0F;
					OpenGL.glMatrixMode(5888);
					OpenGL.glLoadMatrixf(Class206.aFloatArray2892, 0);
					if ((((Class210_Sub2) this).anInt5020 & 0x7 ^ 0xffffffff) == -1)
						((Class210_Sub2) this).aClass260_Sub2_5004.method1906(false, -44);
					else {
						((Class210_Sub2) this).aClass260_Sub2_5004.method1906(true, 99);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1914((byte) 66);
					}
					((Class210_Sub2) this).aClass260_Sub2_5004.method1934(aClass160_5023, 123, ((Class210_Sub2) this).f_gb, ((Class210_Sub2) this).aClass160_5024, ((Class210_Sub2) this).f_ab);
					if (((BufferStream) Class215.aStream3001).buffer.length < 2 * anInt4992)
						Class215.aStream3001 = new BufferStream(anInt4992 * 2);
					else
						((BufferStream) Class215.aStream3001).position = 0;
					int i_17_ = 0;
					if (!((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aBool4392) {
						for (int i_18_ = i_14_; i_18_ < i_16_; i_18_++) {
							int i_19_ = ((Class210) this).anInt2956 * i_18_ - -i_13_;
							for (int i_20_ = i_13_; (i_20_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_20_++) {
								if (bools[-i_13_ + i_20_][-i_14_ + i_18_]) {
									short[] is = (((Class210_Sub2) this).aShortArrayArray5021[i_19_]);
									if (is != null) {
										for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_21_++) {
											i_17_++;
											Class215.aStream3001.method2404((byte) -52, is[i_21_] & 0xffff);
										}
									}
								}
								i_19_++;
							}
						}
					} else {
						for (int i_22_ = i_14_; (i_22_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_22_++) {
							int i_23_ = i_13_ + i_22_ * ((Class210) this).anInt2956;
							for (int i_24_ = i_13_; (i_24_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_24_++) {
								if (bools[-i_13_ + i_24_][-i_14_ + i_22_]) {
									short[] is = (((Class210_Sub2) this).aShortArrayArray5021[i_23_]);
									if (is != null) {
										for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_25_++) {
											Class215.aStream3001.writeShort((byte) 67, 0xffff & is[i_25_]);
											i_17_++;
										}
									}
								}
								i_23_++;
							}
						}
					}
					if ((i_17_ ^ 0xffffffff) >= -1)
						break;
					Class194_Sub1 class194_sub1 = (new Class194_Sub1(((Class210_Sub2) this).aClass260_Sub2_5004, 5123, ((BufferStream) Class215.aStream3001).buffer, ((BufferStream) Class215.aStream3001).position));
					((Class210_Sub2) this).aClass260_Sub2_5004.method1967(0, i_17_, 4, class194_sub1, (byte) -95);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oq.C(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1379(Class246_Sub41 class246_sub41, int[] is) {
		try {
			aClass166_5006.method1101(false, new Class246_Sub17(((Class210_Sub2) this).aClass260_Sub2_5004, this, class246_sub41, is));
			anInt4998++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.F(" + (class246_sub41 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1377(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_26_, int i_27_, int i_28_, boolean bool) {
		try {
			anInt5010++;
			if (aClass224_5005 == null || class246_sub1_sub4 == null)
				return false;
			int i_29_ = (i - ((((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).anInt4335) * i_26_ >> 8) >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
			int i_30_ = (-(i_26_ * ((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).anInt4369 >> 8) + i_27_ >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
			return aClass224_5005.method1440((byte) -128, class246_sub1_sub4, i_30_, i_29_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.A(" + (class246_sub1_sub4 != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + bool + ')'));
		}
	}

	final void method1378(int i, int i_31_, int[] is, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_, int[] is_41_, int i_42_, int i_43_, int i_44_, boolean bool) {
		try {
			anInt4993++;
			int i_45_ = is_38_.length;
			int[] is_46_ = new int[i_45_ * 3];
			int[] is_47_ = new int[3 * i_45_];
			int[] is_48_ = new int[3 * i_45_];
			int[] is_49_ = new int[3 * i_45_];
			int[] is_50_ = new int[3 * i_45_];
			int[] is_51_ = new int[3 * i_45_];
			int[] is_52_ = is_32_ != null ? new int[3 * i_45_] : null;
			int[] is_53_ = is_34_ != null ? new int[3 * i_45_] : null;
			int i_54_ = 0;
			for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > (i_45_ ^ 0xffffffff); i_55_++) {
				int i_56_ = is_35_[i_55_];
				int i_57_ = is_36_[i_55_];
				int i_58_ = is_37_[i_55_];
				is_46_[i_54_] = is[i_56_];
				is_47_[i_54_] = is_33_[i_56_];
				is_48_[i_54_] = is_38_[i_55_];
				is_50_[i_54_] = is_40_[i_55_];
				is_51_[i_54_] = is_41_[i_55_];
				if (is_39_ != null)
					is_49_[i_54_] = is_39_[i_55_];
				if (is_32_ != null)
					is_52_[i_54_] = is_32_[i_56_];
				if (is_34_ != null)
					is_53_[i_54_] = is_34_[i_56_];
				i_54_++;
				is_46_[i_54_] = is[i_57_];
				is_47_[i_54_] = is_33_[i_57_];
				is_48_[i_54_] = is_38_[i_55_];
				is_50_[i_54_] = is_40_[i_55_];
				is_51_[i_54_] = is_41_[i_55_];
				if (is_39_ != null)
					is_49_[i_54_] = is_39_[i_55_];
				if (is_32_ != null)
					is_52_[i_54_] = is_32_[i_57_];
				if (is_34_ != null)
					is_53_[i_54_] = is_34_[i_57_];
				i_54_++;
				is_46_[i_54_] = is[i_58_];
				is_47_[i_54_] = is_33_[i_58_];
				is_48_[i_54_] = is_38_[i_55_];
				is_50_[i_54_] = is_40_[i_55_];
				is_51_[i_54_] = is_41_[i_55_];
				if (is_39_ != null)
					is_49_[i_54_] = is_39_[i_55_];
				if (is_32_ != null)
					is_52_[i_54_] = is_32_[i_58_];
				if (is_34_ != null)
					is_53_[i_54_] = is_34_[i_58_];
				i_54_++;
			}
			B(i, i_31_, is_46_, is_52_, is_47_, is_53_, is_48_, is_49_, is_50_, is_51_, i_42_, i_43_, i_44_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.D(" + i + ',' + i_31_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_32_ != null ? "{...}" : "null") + ',' + (is_33_ != null ? "{...}" : "null") + ',' + (is_34_ != null ? "{...}" : "null") + ',' + (is_35_ != null ? "{...}" : "null") + ',' + (is_36_ != null ? "{...}" : "null") + ',' + (is_37_ != null ? "{...}" : "null") + ',' + (is_38_ != null ? "{...}" : "null") + ',' + (is_39_ != null ? "{...}" : "null") + ',' + (is_40_ != null ? "{...}" : "null") + ',' + (is_41_ != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + bool + ')'));
		}
	}

	final void b(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_59_, int i_60_, int i_61_, boolean bool) {
		try {
			anInt4983++;
			if (aClass224_5005 != null && class246_sub1_sub4 != null) {
				int i_62_ = (-(i_59_ * (((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).anInt4335) >> 8) + i >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
				int i_63_ = (i_60_ + -((((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).anInt4369) * i_59_ >> 8) >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
				aClass224_5005.method1445(-75, i_63_, i_62_, class246_sub1_sub4);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.b(" + (class246_sub1_sub4 != null ? "{...}" : "null") + ',' + i + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + bool + ')'));
		}
	}

	final void method1384(int i, int i_64_, int i_65_, boolean[][] bools, boolean bool) {
		try {
			method2155(i, (byte) 112, bool, bools, i_64_, -1, i_65_);
			anInt5014++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.E(" + i + ',' + i_64_ + ',' + i_65_ + ',' + (bools != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method2153(Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1, int i, byte i_66_, int i_67_) {
		try {
			anInt4997++;
			int[] is = ((Class210_Sub2) this).anIntArrayArrayArray4990[i][i_67_];
			int[] is_68_ = ((Class210_Sub2) this).anIntArrayArrayArray4991[i][i_67_];
			int i_69_ = is.length;
			if (i_69_ > Class246_Sub22.anIntArray4772.length) {
				Class246_Sub22.anIntArray4772 = new int[i_69_];
				Class174.anIntArray2460 = new int[i_69_];
			}
			for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
				Class246_Sub22.anIntArray4772[i_70_] = (PacketsDecoder.method184(255, is[i_70_]) >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
				Class174.anIntArray2460[i_70_] = (PacketsDecoder.method184(is_68_[i_70_], 255) >> ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_re);
			}
			int i_71_ = 59 % ((71 - i_66_) / 43);
			int i_72_ = 0;
			while ((i_69_ ^ 0xffffffff) < (i_72_ ^ 0xffffffff)) {
				int i_73_ = Class246_Sub22.anIntArray4772[i_72_];
				int i_74_ = Class174.anIntArray2460[i_72_++];
				int i_75_ = Class246_Sub22.anIntArray4772[i_72_];
				int i_76_ = Class174.anIntArray2460[i_72_++];
				int i_77_ = Class246_Sub22.anIntArray4772[i_72_];
				int i_78_ = Class174.anIntArray2460[i_72_++];
				if ((-((-i_75_ + i_77_) * (-i_74_ + i_76_)) + (i_76_ + -i_78_) * (i_73_ - i_75_)) > 0)
					class246_sub1_sub4_sub1.method2894(i_73_, i_76_, i_74_, false, i_75_, i_78_, i_77_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.J(" + (class246_sub1_sub4_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_66_ + ',' + i_67_ + ')'));
		}
	}

	final int l(int i, int i_79_) {
		try {
			anInt4987++;
			return anIntArrayArray4995[i][i_79_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oq.l(" + i + ',' + i_79_ + ')');
		}
	}

	final void B(int i, int i_80_, int[] is, int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int i_88_, int i_89_, int i_90_, boolean bool) {
		try {
			if (is_83_ != null && anIntArrayArrayArray5000 == null)
				anIntArrayArrayArray5000 = (new int[((Class210) this).anInt2956][((Class210) this).anInt2952][]);
			if (is_81_ != null && anIntArrayArrayArray4994 == null)
				anIntArrayArrayArray4994 = (new int[((Class210) this).anInt2956][((Class210) this).anInt2952][]);
			anInt5002++;
			((Class210_Sub2) this).anIntArrayArrayArray4990[i][i_80_] = is;
			((Class210_Sub2) this).anIntArrayArrayArray4991[i][i_80_] = is_82_;
			anIntArrayArrayArray5013[i][i_80_] = is_84_;
			anIntArrayArrayArray5009[i][i_80_] = is_85_;
			if (anIntArrayArrayArray5000 != null)
				anIntArrayArrayArray5000[i][i_80_] = is_83_;
			if (anIntArrayArrayArray4994 != null)
				anIntArrayArrayArray4994[i][i_80_] = is_81_;
			Class246_Sub11[] class246_sub11s = (aClass246_Sub11ArrayArrayArray5016[i][i_80_] = new Class246_Sub11[is_84_.length]);
			for (int i_91_ = 0; is_84_.length > i_91_; i_91_++) {
				long l = ((long) i_88_ << 28 | ((long) i_90_ << 48 | (long) i_89_ << 42) | (long) (is_87_[i_91_] << 14) | (long) is_86_[i_91_]);
				Node class246;
				for (class246 = f_eb.method544(l, 126); class246 != null; class246 = f_eb.method541(-1)) {
					Class246_Sub11 class246_sub11 = (Class246_Sub11) class246;
					if (((is_86_[i_91_] ^ 0xffffffff) == (((Class246_Sub11) class246_sub11).anInt4103 ^ 0xffffffff)) && (((Class246_Sub11) class246_sub11).aFloat4102 == (float) is_87_[i_91_]) && ((Class246_Sub11) class246_sub11).anInt4090 == i_88_ && ((Class246_Sub11) class246_sub11).anInt4089 == i_89_ && (((Class246_Sub11) class246_sub11).anInt4097 ^ 0xffffffff) == (i_90_ ^ 0xffffffff))
						break;
				}
				if (class246 != null)
					class246_sub11s[i_91_] = (Class246_Sub11) class246;
				else {
					class246_sub11s[i_91_] = new Class246_Sub11(this, is_86_[i_91_], is_87_[i_91_], i_88_, i_89_, i_90_);
					f_eb.method547(l, -2301, class246_sub11s[i_91_]);
				}
			}
			if (bool)
				aByteArrayArray5008[i][i_80_] = (byte) Class236.method1523(aByteArrayArray5008[i][i_80_], 1);
			if (anInt5026 < is_84_.length)
				anInt5026 = is_84_.length;
			f_fb += is_84_.length;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.B(" + i + ',' + i_80_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_81_ != null ? "{...}" : "null") + ',' + (is_82_ != null ? "{...}" : "null") + ',' + (is_83_ != null ? "{...}" : "null") + ',' + (is_84_ != null ? "{...}" : "null") + ',' + (is_85_ != null ? "{...}" : "null") + ',' + (is_86_ != null ? "{...}" : "null") + ',' + (is_87_ != null ? "{...}" : "null") + ',' + i_88_ + ',' + i_89_ + ',' + i_90_ + ',' + bool + ')'));
		}
	}

	Class210_Sub2(Class260_Sub2 class260_sub2, int i, int i_92_, int i_93_, int i_94_, int[][] is, int[][] is_95_, int i_96_) {
		super(i_93_, i_94_, i_96_);
		do {
			try {
				anIntArrayArray4995 = is;
				((Class210_Sub2) this).aClass260_Sub2_5004 = class260_sub2;
				anInt4996 = ((Class210) this).anInt2950 - 2;
				((Class210_Sub2) this).aShortArrayArray5021 = new short[i_93_ * i_94_][];
				aByteArrayArray5008 = new byte[i_93_][i_94_];
				((Class210_Sub2) this).anInt5020 = i_92_;
				anInt4999 = 1 << anInt4996;
				aClass246_Sub11ArrayArrayArray5016 = new Class246_Sub11[i_93_][i_94_][];
				anIntArrayArrayArray4994 = new int[i_93_][i_94_][];
				anIntArrayArrayArray5013 = new int[i_93_][i_94_][];
				((Class210_Sub2) this).anIntArrayArrayArray4991 = new int[i_93_][i_94_][];
				anIntArrayArrayArray5009 = new int[i_93_][i_94_][];
				f_db = new byte[i_93_ + 1][1 + i_94_];
				f_bb = (new float[1 + ((Class210) this).anInt2956][((Class210) this).anInt2952 + 1]);
				f_cb = (new float[1 + ((Class210) this).anInt2956][((Class210) this).anInt2952 + 1]);
				f_hb = (new float[1 + ((Class210) this).anInt2956][((Class210) this).anInt2952 + 1]);
				((Class210_Sub2) this).anIntArrayArrayArray4990 = new int[i_93_][i_94_][];
				for (int i_97_ = 1; ((i_97_ ^ 0xffffffff) > (((Class210) this).anInt2952 ^ 0xffffffff)); i_97_++) {
					for (int i_98_ = 1; ((Class210) this).anInt2956 > i_98_; i_98_++) {
						int i_99_ = (is_95_[i_98_ + 1][i_97_] - is_95_[i_98_ - 1][i_97_]);
						int i_100_ = (-is_95_[i_98_][-1 + i_97_] + is_95_[i_98_][1 + i_97_]);
						float f = (float) (1.0 / Math.sqrt((double) (i_99_ * i_99_ - -(i_96_ * (i_96_ * 4)) - -(i_100_ * i_100_))));
						f_hb[i_98_][i_97_] = f * (float) i_99_;
						f_bb[i_98_][i_97_] = f * (float) (-i_96_ * 2);
						f_cb[i_98_][i_97_] = (float) i_100_ * f;
					}
				}
				f_eb = new Class85(128);
				if ((0x10 & ((Class210_Sub2) this).anInt5020 ^ 0xffffffff) == -1)
					break;
				aClass224_5005 = new Class224(((Class210_Sub2) this).aClass260_Sub2_5004, this);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oq.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_92_ + ',' + i_93_ + ',' + i_94_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_95_ != null ? "{...}" : "null") + ',' + i_96_ + ')'));
			}
			break;
		} while (false);
	}

	final int a(int i, int i_101_) {
		try {
			anInt4985++;
			int i_102_ = i >> ((Class210) this).anInt2950;
			int i_103_ = i_101_ >> ((Class210) this).anInt2950;
			if ((i_102_ ^ 0xffffffff) > -1 || (i_103_ ^ 0xffffffff) > -1 || -1 + ((Class210) this).anInt2956 < i_102_ || ((Class210) this).anInt2952 - 1 < i_103_)
				return 0;
			int i_104_ = -1 + ((Class210) this).anInt2955 & i;
			int i_105_ = ((Class210) this).anInt2955 - 1 & i_101_;
			int i_106_ = ((anIntArrayArray4995[i_102_ + 1][i_103_] * i_104_ + (anIntArrayArray4995[i_102_][i_103_] * (-i_104_ + ((Class210) this).anInt2955))) >> ((Class210) this).anInt2950);
			int i_107_ = ((((-i_104_ + ((Class210) this).anInt2955) * anIntArrayArray4995[i_102_][1 + i_103_]) - -(i_104_ * anIntArrayArray4995[i_102_ + 1][i_103_ + 1])) >> ((Class210) this).anInt2950);
			return ((i_106_ * (-i_105_ + ((Class210) this).anInt2955) - -(i_107_ * i_105_)) >> ((Class210) this).anInt2950);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oq.a(" + i + ',' + i_101_ + ')');
		}
	}

	final void ca() {
		try {
			anInt5017++;
			if (f_fb <= 0)
				aClass224_5005 = null;
			else {
				byte[][] is = (new byte[1 + ((Class210) this).anInt2956][((Class210) this).anInt2952 + 1]);
				for (int i = 1; i < ((Class210) this).anInt2956; i++) {
					for (int i_108_ = 1; ((((Class210) this).anInt2952 ^ 0xffffffff) < (i_108_ ^ 0xffffffff)); i_108_++)
						is[i][i_108_] = (byte) ((f_db[1 + i][i_108_] >> 3) + ((f_db[i - 1][i_108_] >> 2) + ((f_db[i][i_108_ - 1] >> 2) + (f_db[i][1 + i_108_] >> 3))) + (f_db[i][i_108_] >> 1));
				}
				f_ib = new Class246_Sub11[f_eb.method542(-5)];
				f_eb.method552(-44, f_ib);
				for (int i = 0; (i ^ 0xffffffff) > (f_ib.length ^ 0xffffffff); i++)
					f_ib[i].method1874(-103, f_fb);
				int i = 24;
				if (anIntArrayArrayArray5000 != null)
					i += 4;
				if ((0x7 & ((Class210_Sub2) this).anInt5020 ^ 0xffffffff) != -1)
					i += 12;
				jaclib.memory.heap.NativeHeapBuffer nativebuffer = ((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).f_pe.a(i * f_fb, false);
				Stream nativestream = new Stream(nativebuffer);
				Class246_Sub11[] class246_sub11s = new Class246_Sub11[f_fb];
				int i_109_ = Class85.method540(f_fb / 4, false);
				if (i_109_ < 1)
					i_109_ = 1;
				Class85 class85 = new Class85(i_109_);
				Class246_Sub11[] class246_sub11s_110_ = new Class246_Sub11[anInt5026];
				for (int i_111_ = 0; ((((Class210) this).anInt2956 ^ 0xffffffff) < (i_111_ ^ 0xffffffff)); i_111_++) {
					for (int i_112_ = 0; i_112_ < ((Class210) this).anInt2952; i_112_++) {
						if (anIntArrayArrayArray5013[i_111_][i_112_] != null) {
							Class246_Sub11[] class246_sub11s_113_ = (aClass246_Sub11ArrayArrayArray5016[i_111_][i_112_]);
							int[] is_114_ = (((Class210_Sub2) this).anIntArrayArrayArray4990[i_111_][i_112_]);
							int[] is_115_ = (((Class210_Sub2) this).anIntArrayArrayArray4991[i_111_][i_112_]);
							int[] is_116_ = anIntArrayArrayArray5009[i_111_][i_112_];
							int[] is_117_ = anIntArrayArrayArray5013[i_111_][i_112_];
							int[] is_118_ = (anIntArrayArrayArray4994 != null ? anIntArrayArrayArray4994[i_111_][i_112_] : null);
							int[] is_119_ = (anIntArrayArrayArray5000 == null ? null : anIntArrayArrayArray5000[i_111_][i_112_]);
							if (is_116_ == null)
								is_116_ = is_117_;
							float f = f_hb[i_111_][i_112_];
							float f_120_ = f_bb[i_111_][i_112_];
							float f_121_ = f_cb[i_111_][i_112_];
							float f_122_ = f_hb[i_111_][i_112_ + 1];
							float f_123_ = f_bb[i_111_][i_112_ + 1];
							float f_124_ = f_cb[i_111_][i_112_ + 1];
							float f_125_ = f_hb[i_111_ + 1][1 + i_112_];
							float f_126_ = f_bb[1 + i_111_][i_112_ + 1];
							float f_127_ = f_cb[1 + i_111_][1 + i_112_];
							float f_128_ = f_hb[1 + i_111_][i_112_];
							float f_129_ = f_bb[1 + i_111_][i_112_];
							float f_130_ = f_cb[i_111_ + 1][i_112_];
							int i_131_ = 0xff & is[i_111_][i_112_];
							int i_132_ = is[i_111_][i_112_ + 1] & 0xff;
							int i_133_ = is[i_111_ + 1][i_112_ + 1] & 0xff;
							int i_134_ = is[1 + i_111_][i_112_] & 0xff;
							int i_135_ = 0;
							while_258_: for (int i_136_ = 0; i_136_ < is_117_.length; i_136_++) {
								Class246_Sub11 class246_sub11 = class246_sub11s_113_[i_136_];
								for (int i_137_ = 0; ((i_137_ ^ 0xffffffff) > (i_135_ ^ 0xffffffff)); i_137_++) {
									if (class246_sub11s_110_[i_137_] == class246_sub11)
										continue while_258_;
								}
								class246_sub11s_110_[i_135_++] = class246_sub11;
							}
							short[] is_138_ = (((Class210_Sub2) this).aShortArrayArray5021[(i_112_ * ((Class210) this).anInt2956 - -i_111_)] = new short[is_117_.length]);
							for (int i_139_ = 0; is_117_.length > i_139_; i_139_++) {
								int i_140_ = ((i_111_ << ((Class210) this).anInt2950) - -is_114_[i_139_]);
								int i_141_ = ((i_112_ << ((Class210) this).anInt2950) + is_115_[i_139_]);
								int i_142_ = i_140_ >> anInt4996;
								int i_143_ = i_141_ >> anInt4996;
								int i_144_ = is_117_[i_139_];
								int i_145_ = is_116_[i_139_];
								int i_146_ = is_118_ == null ? 0 : is_118_[i_139_];
								long l = ((long) i_143_ | ((long) i_144_ << 32 | (long) i_145_ << 48 | (long) (i_142_ << 16)));
								int i_147_ = is_114_[i_139_];
								int i_148_ = is_115_[i_139_];
								int i_149_ = 74;
								int i_150_ = 0;
								float f_151_;
								float f_152_;
								float f_153_;
								if ((i_147_ ^ 0xffffffff) != -1 || (i_148_ ^ 0xffffffff) != -1) {
									if (i_147_ != 0 || ((((Class210) this).anInt2955 ^ 0xffffffff) != (i_148_ ^ 0xffffffff))) {
										if (((i_147_ ^ 0xffffffff) == (((Class210) this).anInt2955 ^ 0xffffffff)) && i_148_ == (((Class210) this).anInt2955)) {
											f_153_ = f_125_;
											f_151_ = f_126_;
											f_152_ = f_127_;
											i_149_ -= i_133_;
										} else if ((((Class210) this).anInt2955 != i_147_) || ((i_148_ ^ 0xffffffff) != -1)) {
											float f_154_ = ((float) i_147_ / (float) (((Class210) this).anInt2955));
											float f_155_ = ((float) i_148_ / (float) (((Class210) this).anInt2955));
											float f_156_ = f + f_154_ * (f_128_ - f);
											float f_157_ = f_120_ + f_154_ * (-f_120_ + f_129_);
											float f_158_ = f_121_ + ((-f_121_ + f_130_) * f_154_);
											float f_159_ = ((f_125_ - f_122_) * f_154_ + f_122_);
											float f_160_ = f_123_ + f_154_ * (f_126_ - f_123_);
											f_151_ = f_157_ + f_155_ * (-f_157_ + f_160_);
											float f_161_ = ((-f_124_ + f_127_) * f_154_ + f_124_);
											f_153_ = ((-f_156_ + f_159_) * f_155_ + f_156_);
											f_152_ = f_158_ + f_155_ * (-f_158_ + f_161_);
											int i_162_ = (i_131_ + (i_147_ * (-i_131_ + i_134_) >> (((Class210) this).anInt2950)));
											int i_163_ = ((i_147_ * (-i_132_ + i_133_) >> (((Class210) this).anInt2950)) + i_132_);
											i_149_ -= (i_162_ - -(((i_163_ + -i_162_) * i_148_) >> (((Class210) this).anInt2950)));
										} else {
											f_152_ = f_130_;
											f_151_ = f_129_;
											f_153_ = f_128_;
											i_149_ -= i_134_;
										}
									} else {
										i_149_ -= i_132_;
										f_153_ = f_122_;
										f_151_ = f_123_;
										f_152_ = f_124_;
									}
								} else {
									f_151_ = f_120_;
									f_152_ = f_121_;
									i_149_ -= i_131_;
									f_153_ = f;
								}
								float f_164_ = 1.0F;
								if (i_144_ != -1) {
									int i_165_ = (0x7f & i_144_) * i_149_ >> 7;
									if ((i_165_ ^ 0xffffffff) <= -3) {
										if ((i_165_ ^ 0xffffffff) < -127)
											i_165_ = 126;
									} else
										i_165_ = 2;
									i_150_ = (Class40_Sub3.anIntArray4064[i_165_ | i_144_ & 0xff80]);
									if ((((Class210_Sub2) this).anInt5020 & 0x7 ^ 0xffffffff) == -1) {
										f_164_ = ((((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[1]) * f_151_ + (f_153_ * (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[0])) + (f_152_ * (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[2])));
										f_164_ = ((f_164_ * (!(f_164_ > 0.0F) ? (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloat4352) : (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_vg))) + (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_gg));
									}
								}
								Node class246 = null;
								if ((-1 + anInt4999 & i_140_) == 0 && ((i_141_ & anInt4999 - 1 ^ 0xffffffff) == -1))
									class246 = class85.method544(l, 126);
								int i_166_;
								if (class246 == null) {
									int i_167_;
									if ((i_144_ ^ 0xffffffff) == (i_145_ ^ 0xffffffff))
										i_167_ = i_150_;
									else {
										int i_168_ = i_149_ * (0x7f & i_145_) >> 7;
										if (i_168_ < 2)
											i_168_ = 2;
										else if ((i_168_ ^ 0xffffffff) < -127)
											i_168_ = 126;
										i_167_ = (Class40_Sub3.anIntArray4064[i_145_ & 0xff80 | i_168_]);
										if ((0x7 & (((Class210_Sub2) this).anInt5020) ^ 0xffffffff) == -1) {
											float f_169_ = (((((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[2]) * f_152_) + ((((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[0]) * f_153_ + (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloatArray4374[1]) * f_151_));
											f_169_ = ((((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_gg) + (f_164_ > 0.0F ? (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).f_vg) : (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloat4352)) * f_164_);
											int i_170_ = i_167_ >> 16 & 0xff;
											int i_171_ = (i_167_ & 0xffdc) >> 8;
											int i_172_ = i_167_ & 0xff;
											i_170_ *= f_169_;
											if ((i_170_ ^ 0xffffffff) <= -1) {
												if ((i_170_ ^ 0xffffffff) < -256)
													i_170_ = 255;
											} else
												i_170_ = 0;
											i_171_ *= f_169_;
											i_172_ *= f_169_;
											if ((i_171_ ^ 0xffffffff) > -1)
												i_171_ = 0;
											else if ((i_171_ ^ 0xffffffff) < -256)
												i_171_ = 255;
											if ((i_172_ ^ 0xffffffff) <= -1) {
												if ((i_172_ ^ 0xffffffff) < -256)
													i_172_ = 255;
											} else
												i_172_ = 0;
											i_167_ = i_172_ | (i_171_ << 8 | i_170_ << 16);
										}
									}
									if (!((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aBool4392) {
										nativestream.a((float) i_140_);
										nativestream.a((float) (i_146_ + a(i_140_, i_141_)));
										nativestream.a((float) i_141_);
										nativestream.c((byte) (i_167_ >> 16));
										nativestream.c((byte) (i_167_ >> 8));
										nativestream.c((byte) i_167_);
										nativestream.c(-1);
										nativestream.a((float) i_140_);
										nativestream.a((float) i_141_);
										if (anIntArrayArrayArray5000 != null)
											nativestream.a((float) (is_119_ == null ? 0 : -1 + (is_119_[i_139_])));
										if ((((Class210_Sub2) this).anInt5020 & 0x7) != 0) {
											nativestream.a(f_153_);
											nativestream.a(f_151_);
											nativestream.a(f_152_);
										}
									} else {
										nativestream.b((float) i_140_);
										nativestream.b((float) (a(i_140_, i_141_) - -i_146_));
										nativestream.b((float) i_141_);
										nativestream.c((byte) (i_167_ >> 16));
										nativestream.c((byte) (i_167_ >> 8));
										nativestream.c((byte) i_167_);
										nativestream.c(-1);
										nativestream.b((float) i_140_);
										nativestream.b((float) i_141_);
										if (anIntArrayArrayArray5000 != null)
											nativestream.b((float) (is_119_ != null ? (-1 + is_119_[i_139_]) : 0));
										if ((0x7 & (((Class210_Sub2) this).anInt5020)) != 0) {
											nativestream.b(f_153_);
											nativestream.b(f_151_);
											nativestream.b(f_152_);
										}
									}
									i_166_ = anInt5011++;
									is_138_[i_139_] = (short) i_166_;
									if (i_144_ != -1)
										class246_sub11s[i_166_] = class246_sub11s_113_[i_139_];
									class85.method547(l, -2301, new Class246_Sub25(is_138_[i_139_]));
								} else {
									is_138_[i_139_] = ((Class246_Sub25) (Class246_Sub25) class246).aShort4879;
									i_166_ = 0xffff & is_138_[i_139_];
									if ((i_144_ ^ 0xffffffff) != 0 && (((Node) class246_sub11s[i_166_]).hash > (((Node) class246_sub11s_113_[i_139_]).hash)))
										class246_sub11s[i_166_] = class246_sub11s_113_[i_139_];
								}
								for (int i_173_ = 0; i_135_ > i_173_; i_173_++)
									class246_sub11s_110_[i_173_].method1873(i_149_, i_166_, (byte) 109, i_150_, f_164_);
								anInt4992++;
							}
						}
					}
				}
				for (int i_174_ = 0; i_174_ < anInt5011; i_174_++) {
					Class246_Sub11 class246_sub11 = class246_sub11s[i_174_];
					if (class246_sub11 != null)
						class246_sub11.method1875(i_174_, false);
				}
				for (int i_175_ = 0; ((((Class210) this).anInt2956 ^ 0xffffffff) < (i_175_ ^ 0xffffffff)); i_175_++) {
					for (int i_176_ = 0; ((i_176_ ^ 0xffffffff) > (((Class210) this).anInt2952 ^ 0xffffffff)); i_176_++) {
						short[] is_177_ = (((Class210_Sub2) this).aShortArrayArray5021[(i_176_ * ((Class210) this).anInt2956 + i_175_)]);
						if (is_177_ != null) {
							int i_178_ = 0;
							int i_179_ = 0;
							while (i_179_ < is_177_.length) {
								int i_180_ = is_177_[i_179_++] & 0xffff;
								int i_181_ = 0xffff & is_177_[i_179_++];
								int i_182_ = 0xffff & is_177_[i_179_++];
								Class246_Sub11 class246_sub11 = class246_sub11s[i_180_];
								Class246_Sub11 class246_sub11_183_ = class246_sub11s[i_181_];
								Class246_Sub11 class246_sub11_184_ = class246_sub11s[i_182_];
								Class246_Sub11 class246_sub11_185_ = null;
								if (class246_sub11 != null) {
									class246_sub11.method1872(i_176_, i_178_, i_175_, false);
									class246_sub11_185_ = class246_sub11;
								}
								if (class246_sub11_183_ != null) {
									class246_sub11_183_.method1872(i_176_, i_178_, i_175_, false);
									if (class246_sub11_185_ == null || ((((Node) class246_sub11_185_).hash) > (((Node) class246_sub11_183_).hash)))
										class246_sub11_185_ = class246_sub11_183_;
								}
								if (class246_sub11_184_ != null) {
									class246_sub11_184_.method1872(i_176_, i_178_, i_175_, false);
									if (class246_sub11_185_ == null || ((((Node) class246_sub11_185_).hash) > (((Node) class246_sub11_184_).hash)))
										class246_sub11_185_ = class246_sub11_184_;
								}
								if (class246_sub11_185_ != null) {
									if (class246_sub11 != null)
										class246_sub11_185_.method1875(i_180_, false);
									if (class246_sub11_183_ != null)
										class246_sub11_185_.method1875(i_181_, false);
									if (class246_sub11_184_ != null)
										class246_sub11_185_.method1875(i_182_, false);
									class246_sub11_185_.method1872(i_176_, i_178_, i_175_, false);
								}
								i_178_++;
							}
						}
					}
				}
				nativestream.c();
				anInterface10_5025 = (((Class210_Sub2) this).aClass260_Sub2_5004.method1902(false, 121, nativebuffer, nativestream.b(), i));
				((Class210_Sub2) this).f_ab = new Class160(anInterface10_5025, 5126, 3, 0);
				aClass160_5023 = new Class160(anInterface10_5025, 5121, 4, 12);
				int i_186_;
				if (anIntArrayArrayArray5000 == null) {
					i_186_ = 24;
					((Class210_Sub2) this).aClass160_5024 = new Class160(anInterface10_5025, 5126, 2, 16);
				} else {
					i_186_ = 28;
					((Class210_Sub2) this).aClass160_5024 = new Class160(anInterface10_5025, 5126, 3, 16);
				}
				if ((0x7 & ((Class210_Sub2) this).anInt5020) != 0)
					((Class210_Sub2) this).f_gb = new Class160(anInterface10_5025, 5126, 3, i_186_);
				long[] ls = new long[f_ib.length];
				for (int i_187_ = 0; (f_ib.length ^ 0xffffffff) < (i_187_ ^ 0xffffffff); i_187_++) {
					Class246_Sub11 class246_sub11 = f_ib[i_187_];
					ls[i_187_] = ((Node) class246_sub11).hash;
					class246_sub11.method1869(anInt5011, 102);
				}
				Class174.method1146(f_ib, ls, (byte) 41);
				if (aClass224_5005 != null)
					aClass224_5005.method1443(-1);
			}
			anIntArrayArrayArray4994 = null;
			anIntArrayArrayArray5000 = null;
			anIntArrayArrayArray5009 = null;
			f_eb = null;
			aClass246_Sub11ArrayArrayArray5016 = null;
			f_hb = f_bb = f_cb = null;
			((Class210_Sub2) this).anIntArrayArrayArray4990 = ((Class210_Sub2) this).anIntArrayArrayArray4991 = null;
			f_db = null;
			anIntArrayArrayArray5013 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "oq.ca(" + ')');
		}
	}

	static final void method2154(byte i, Class260 class260) {
		try {
			anInt5019++;
			int i_188_ = IntegerNode.anInt5082;
			int i_189_ = Class93.anInt1226;
			int i_190_ = Class94.anInt1233;
			int i_191_ = Class246_Sub13.anInt4419;
			int i_192_ = -10660793;
			class260.method1734(i_188_, i_190_, i_189_, (byte) 58, i_192_, i_191_);
			class260.method1734(1 + i_188_, i_190_ - 2, i_189_ + 1, (byte) 58, -16777216, 16);
			class260.method1736(i_188_ + 1, -16777216, -19 + i_191_, 8, i_190_ - 2, 18 + i_189_);
			Class79_Sub1.aClass116_5162.method794(-1, i_192_, Class219.aClass67_3039.method436(true, Class_j.anInt1485), i_189_ + 14, 3 + i_188_, 0);
			if (i != -76)
				anInt5022 = -97;
			int i_193_ = Class238.aClass102_3360.method640((byte) 58);
			int i_194_ = Class238.aClass102_3360.method636(3045);
			int i_195_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(i ^ ~0x17)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
				int i_196_ = (-1 + (Class230.anInt3147 + -i_195_)) * 16 + 31 + i_189_;
				int i_197_ = -1;
				if ((i_188_ ^ 0xffffffff) > (i_193_ ^ 0xffffffff) && (i_188_ - -i_190_ ^ 0xffffffff) < (i_193_ ^ 0xffffffff) && (i_194_ ^ 0xffffffff) < (i_196_ - 13 ^ 0xffffffff) && (i_196_ + 3 ^ 0xffffffff) < (i_194_ ^ 0xffffffff) && ((Class246_Sub35) class246_sub35).aBool5153)
					i_197_ = -256;
				int[] is = null;
				if (!Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), 0)) {
					if ((((Class246_Sub35) class246_sub35).anInt5148 ^ 0xffffffff) == 0) {
						if (!Class246_Sub28_Sub27.method2767((((Class246_Sub35) class246_sub35).anInt5156), (byte) -117)) {
							if (Class57.method390(-99, (((Class246_Sub35) class246_sub35).anInt5156))) {
								Object object = null;
								Class185 class185;
								if (((Class246_Sub35) class246_sub35).anInt5156 != 1010)
									class185 = (Class143.aClass251_2067.method1610((int) (0x7fffffffL & (((Class246_Sub35) class246_sub35).aLong5157) >>> 32), 0));
								else
									class185 = (Class143.aClass251_2067.method1610((int) ((Class246_Sub35) class246_sub35).aLong5157, 0));
								if (((Class185) class185).f_bb != null)
									class185 = (class185.method1205(Class246_Sub28_Sub23.aClass95_6658, (byte) -16));
								if (class185 != null)
									is = ((Class185) class185).f_nb;
							}
						} else {
							Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[(int) (((Class246_Sub35) class246_sub35).aLong5157)]);
							if (class_r_sub2 != null) {
								Class253 class253 = (((Npc) class_r_sub2).aClass253_7184);
								if (((Class253) class253).anIntArray3594 != null)
									class253 = (class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658)));
								if (class253 != null)
									is = ((Class253) class253).f_ob;
							}
						}
					} else
						is = ((Class197) (Class255.aClass191_3663.method1251(22883, (((Class246_Sub35) class246_sub35).anInt5148)))).anIntArray2772;
				} else
					is = ((Class197) (Class255.aClass191_3663.method1251(22883, (int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
				String string = Class246_Sub41_Sub2.method2678(i + 12, class246_sub35);
				if (is != null)
					string += Class247.method1581(is, 126);
				Class79_Sub1.aClass116_5162.method793((byte) -114, Class21_Sub4.anIntArray4924, 0, Class106_Sub2.aClass_lArray5340, i_197_, string, 3 + i_188_, i_196_);
				i_195_++;
				if (((Class246_Sub35) class246_sub35).aBool5147)
					Class246_Sub28_Sub32.aClass_l6928.method729((Class_fs.aClass73_148.method459(-1, string) + i_188_ + 5), -12 + i_196_);
			}
			Class225.method1449(Class94.anInt1233, Class246_Sub13.anInt4419, Class93.anInt1226, 0, IntegerNode.anInt5082);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("oq.K(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2155(int i, byte i_198_, boolean bool, boolean[][] bools, int i_199_, int i_200_, int i_201_) {
		do {
			try {
				if (f_ib != null) {
					float f = (((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).aFloat4359);
					float f_202_ = (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).aFloat4343);
					int i_203_ = 1 + i_201_ - -i_201_;
					i_203_ *= i_203_;
					if ((i_203_ ^ 0xffffffff) < (Class59_Sub4_Sub1.anIntArray6309.length ^ 0xffffffff))
						Class59_Sub4_Sub1.anIntArray6309 = new int[i_203_];
					if ((((BufferStream) Class215.aStream3001).buffer.length ^ 0xffffffff) > (2 * anInt4992 ^ 0xffffffff))
						Class215.aStream3001 = new BufferStream(2 * anInt4992);
					int i_204_ = -i_201_ + i;
					int i_205_ = i_204_;
					if (i_204_ < 0)
						i_204_ = 0;
					int i_206_ = -i_201_ + i_199_;
					int i_207_ = i_206_;
					if (i_206_ < 0)
						i_206_ = 0;
					int i_208_ = i - -i_201_;
					if ((i_208_ ^ 0xffffffff) < (-1 + ((Class210) this).anInt2956 ^ 0xffffffff))
						i_208_ = ((Class210) this).anInt2956 - 1;
					int i_209_ = i_201_ + i_199_;
					if ((-1 + ((Class210) this).anInt2952 ^ 0xffffffff) > (i_209_ ^ 0xffffffff))
						i_209_ = ((Class210) this).anInt2952 - 1;
					Class40_Sub8.anInt5198 = 0;
					for (int i_210_ = i_204_; i_208_ >= i_210_; i_210_++) {
						boolean[] bools_211_ = bools[-i_205_ + i_210_];
						for (int i_212_ = i_206_; i_212_ <= i_209_; i_212_++) {
							if (bools_211_[i_212_ + -i_207_])
								Class59_Sub4_Sub1.anIntArray6309[Class40_Sub8.anInt5198++] = (i_212_ * ((Class210) this).anInt2956 - -i_210_);
						}
					}
					if (i_200_ != -1) {
						((Class210_Sub2) this).aClass260_Sub2_5004.method1937((float) i_200_, (byte) 99);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1928(true);
					} else
						((Class210_Sub2) this).aClass260_Sub2_5004.method1904(8);
					((Class210_Sub2) this).aClass260_Sub2_5004.method1906((((Class210_Sub2) this).anInt5020 & 0x7) != 0, -95);
					for (int i_213_ = 0; (i_213_ ^ 0xffffffff) > (f_ib.length ^ 0xffffffff); i_213_++)
						f_ib[i_213_].method1870((Class59_Sub4_Sub1.anIntArray6309), Class40_Sub8.anInt5198, -45);
					if (!aClass166_5006.method1111((byte) -126)) {
						int i_214_ = (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).anInt4364);
						int i_215_ = (((Class260_Sub2) (((Class210_Sub2) this).aClass260_Sub2_5004)).anInt4377);
						((Class210_Sub2) this).aClass260_Sub2_5004.UA(0, i_215_, (((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).anInt4323));
						((Class210_Sub2) this).aClass260_Sub2_5004.g(f_202_, f - 4.0F);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1906(false, 57);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1911(-32, false);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1958(127, 128);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1957(false, -2);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1905((byte) 78, (((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).aClass109_Sub1_4370));
						((Class210_Sub2) this).aClass260_Sub2_5004.method1912(8448, 7681, true);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1945((byte) 79, 0, 770, 34166);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1954(true, 770, 34167, 0);
						for (Node class246 = aClass166_5006.method1104(107); class246 != null; class246 = aClass166_5006.method1108((byte) -112)) {
							Class246_Sub17 class246_sub17 = (Class246_Sub17) class246;
							class246_sub17.method2046(i_201_, 52, i, i_199_, bools);
						}
						((Class210_Sub2) this).aClass260_Sub2_5004.method1945((byte) 79, 0, 768, 5890);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1954(true, 770, 5890, 0);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1905((byte) 78, null);
						((Class210_Sub2) this).aClass260_Sub2_5004.UA(i_214_, i_215_, (((Class260_Sub2) ((Class210_Sub2) this).aClass260_Sub2_5004).anInt4323));
					}
					if (aClass224_5005 != null) {
						((Class210_Sub2) this).aClass260_Sub2_5004.g(f_202_, f - 8.0F);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1904(8);
						((Class210_Sub2) this).aClass260_Sub2_5004.method1934(null, 126, null, ((Class210_Sub2) this).aClass160_5024, ((Class210_Sub2) this).f_ab);
						aClass224_5005.method1441(bool, i_199_, i, bools, i_201_, false);
					}
					((Class210_Sub2) this).aClass260_Sub2_5004.g(f_202_, f);
				}
				anInt4986++;
				if (i_198_ > 108)
					break;
				aClass160_5023 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("oq.G(" + i + ',' + i_198_ + ',' + bool + ',' + (bools != null ? "{...}" : "null") + ',' + i_199_ + ',' + i_200_ + ',' + i_201_ + ')'));
			}
			break;
		} while (false);
	}
}
