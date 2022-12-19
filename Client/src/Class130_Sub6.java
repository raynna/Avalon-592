
/* Class130_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class130_Sub6 extends Class130 {
	private int anInt4829;
	static int anInt4830;
	private int anInt4831;
	int anInt4832;
	private int anInt4833;
	private int anInt4834;
	private int anInt4835;
	private int anInt4836;
	static int anInt4837;
	Class68 aClass68_4838;
	private int anInt4839;
	private int anInt4840;
	static int anInt4841 = -2;
	static int anInt4842;
	private int anInt4843;
	static Class217 aClass217_4844 = new Class217();
	private boolean aBool4845;
	private int anInt4846 = 0;
	private int anInt4847;
	private int anInt4848;
	private int anInt4849;
	static int anInt4850;
	private int anInt4851;
	Class19 aClass19_4852;
	private int anInt4853;
	static int anInt4854;
	int anInt4855;
	Class104 aClass104_4856;
	private int anInt4857;
	int anInt4858;
	Class130_Sub2 aClass130_Sub2_4859;
	int anInt4860;
	private long aLong4861;
	boolean aBool4862;
	static int anInt4863;
	private int anInt4864;

	static final void method2102(int i, int i_0_) {
		try {
			anInt4854++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_0_, (byte) 118, i);
			class246_sub1_sub10.method2604((byte) -61);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mo.D(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2103(int i) {
		try {
			anInt4836 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt306;
			anInt4834 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt294;
			anInt4857 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt302;
			anInt4831 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt303;
			anInt4835 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt295;
			anInt4840 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt293;
			anInt4839 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt296;
			anInt4849 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt304;
			anInt4850++;
			if (i != 1)
				method2107((byte) -46, 5, -1, null, 107, -30, 90);
			anInt4848 = ((Class19) ((Class130_Sub6) this).aClass19_4852).anInt298;
			if ((anInt4840 ^ 0xffffffff) != (anInt4835 ^ 0xffffffff) || (anInt4835 ^ 0xffffffff) != (anInt4831 ^ 0xffffffff) || anInt4839 != anInt4834 || (anInt4839 ^ 0xffffffff) != (anInt4848 ^ 0xffffffff) || anInt4857 != anInt4836 || anInt4849 != anInt4857)
				aBool4845 = false;
			else {
				aBool4845 = true;
				return;
			}
			int i_1_ = (anInt4831 + (anInt4835 + anInt4840)) / 3;
			int i_2_ = (anInt4848 + anInt4834 - -anInt4839) / 3;
			int i_3_ = (anInt4849 + anInt4836 - -anInt4857) / 3;
			if (((((Class130_Sub6) this).anInt4832 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) || ((Class130_Sub6) this).anInt4858 != i_2_ || (i_3_ ^ 0xffffffff) != (((Class130_Sub6) this).anInt4860 ^ 0xffffffff)) {
				((Class130_Sub6) this).anInt4858 = i_2_;
				((Class130_Sub6) this).anInt4860 = i_3_;
				((Class130_Sub6) this).anInt4832 = i_1_;
				int i_4_ = anInt4835 - anInt4840;
				int i_5_ = -anInt4834 + anInt4839;
				int i_6_ = -anInt4836 + anInt4857;
				int i_7_ = anInt4831 - anInt4840;
				int i_8_ = anInt4848 - anInt4834;
				int i_9_ = anInt4849 + -anInt4836;
				anInt4864 = i_8_ * i_4_ + -(i_5_ * i_7_);
				anInt4853 = i_9_ * i_5_ - i_6_ * i_8_;
				for (anInt4829 = i_7_ * i_6_ + -(i_4_ * i_9_); (anInt4853 > 32767 || (anInt4829 ^ 0xffffffff) < -32768 || (anInt4864 ^ 0xffffffff) < -32768 || anInt4853 < -32767 || (anInt4829 ^ 0xffffffff) > 32766 || (anInt4864 ^ 0xffffffff) > 32766); anInt4864 >>= 1) {
					anInt4853 >>= 1;
					anInt4829 >>= 1;
				}
				int i_10_ = (int) Math.sqrt((double) (anInt4864 * anInt4864 + (anInt4853 * anInt4853 + anInt4829 * anInt4829)));
				if ((i_10_ ^ 0xffffffff) >= -1)
					i_10_ = 1;
				anInt4829 = 32767 * anInt4829 / i_10_;
				anInt4864 = anInt4864 * 32767 / i_10_;
				anInt4853 = 32767 * anInt4853 / i_10_;
				if ((((Class104) ((Class130_Sub6) this).aClass104_4856).aShort1382) > 0 || (((Class104) ((Class130_Sub6) this).aClass104_4856).f_mb ^ 0xffffffff) < -1) {
					int i_11_ = (int) (2607.5945876176133 * Math.atan2((double) anInt4864, (double) anInt4853));
					int i_12_ = (int) ((Math.atan2((double) anInt4829, Math.sqrt((double) (anInt4853 * anInt4853 - -(anInt4864 * anInt4864))))) * 2607.5945876176133);
					anInt4847 = ((((Class104) ((Class130_Sub6) this).aClass104_4856).aShort1382) + -((Class104) (((Class130_Sub6) this).aClass104_4856)).aShort1415);
					anInt4843 = ((((Class104) ((Class130_Sub6) this).aClass104_4856).f_mb) + -((Class104) ((Class130_Sub6) this).aClass104_4856).f_bb);
					anInt4833 = i_11_ + (((Class104) (((Class130_Sub6) this).aClass104_4856)).aShort1415) + -(anInt4847 >> 1);
					anInt4851 = i_12_ + (((Class104) (((Class130_Sub6) this).aClass104_4856)).f_bb) + -(anInt4843 >> 1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mo.B(" + i + ')');
		}
	}

	static final boolean method2104(int i, int i_13_) {
		try {
			int i_14_ = -96 / ((-50 - i) / 42);
			anInt4842++;
			if (i_13_ < 12 || i_13_ > 17)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mo.F(" + i + ',' + i_13_ + ')');
		}
	}

	final void method2105(int i, int i_15_, long l, boolean bool, Class260 class260) {
		try {
			if (((Class130_Sub6) this).aBool4862)
				bool = false;
			else if ((((Class104) ((Class130_Sub6) this).aClass104_4856).anInt1412) <= Class246_Sub28_Sub19.anInt6541) {
				if ((Class246_Sub27.anInt4906 ^ 0xffffffff) < ((Class40_Sub2.anIntArray4051[Class246_Sub28_Sub19.anInt6541]) ^ 0xffffffff))
					bool = false;
				else if (!aBool4845) {
					if (((Class104) ((Class130_Sub6) this).aClass104_4856).f_eb != -1) {
						int i_16_ = (int) (l - aLong4861);
						if ((((Class104) ((Class130_Sub6) this).aClass104_4856).aBool1383) || ((i_16_ ^ 0xffffffff) >= (((Class104) (((Class130_Sub6) this).aClass104_4856)).f_eb ^ 0xffffffff)))
							i_16_ %= ((Class104) (((Class130_Sub6) this).aClass104_4856)).f_eb;
						else
							bool = false;
						if (!((Class104) ((Class130_Sub6) this).aClass104_4856).aBool1395 && (((Class104) ((Class130_Sub6) this).aClass104_4856).f_lb ^ 0xffffffff) < (i_16_ ^ 0xffffffff))
							bool = false;
						if ((((Class104) ((Class130_Sub6) this).aClass104_4856).aBool1395) && (((Class104) ((Class130_Sub6) this).aClass104_4856).f_lb ^ 0xffffffff) >= (i_16_ ^ 0xffffffff))
							bool = false;
					}
				} else
					bool = false;
			} else
				bool = false;
			anInt4830++;
			if (bool) {
				anInt4846 += (int) (((double) ((Class104) (((Class130_Sub6) this).aClass104_4856)).f_pb + (Math.random() * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1379 + -((Class104) (((Class130_Sub6) this).aClass104_4856)).f_pb))) * (double) i);
				if ((anInt4846 ^ 0xffffffff) < -64) {
					int i_17_ = anInt4846 >> 6;
					anInt4846 &= 0x3f;
					for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
						int i_19_;
						int i_20_;
						int i_21_;
						if ((((Class104) ((Class130_Sub6) this).aClass104_4856).aShort1382 ^ 0xffffffff) >= -1 && (((Class104) ((Class130_Sub6) this).aClass104_4856).f_mb ^ 0xffffffff) >= -1) {
							i_19_ = anInt4829;
							i_20_ = anInt4853;
							i_21_ = anInt4864;
						} else {
							int i_22_ = ((int) (Math.random() * (double) anInt4847) + anInt4833);
							i_22_ &= 0x3fff;
							int i_23_ = Class39_Sub1.f_fb[i_22_];
							int i_24_ = Class39_Sub1.anIntArray4672[i_22_];
							int i_25_ = anInt4851 + (int) (Math.random() * (double) anInt4843);
							i_25_ &= 0x1fff;
							int i_26_ = Class39_Sub1.f_fb[i_25_];
							int i_27_ = Class39_Sub1.anIntArray4672[i_25_];
							int i_28_ = 15;
							i_19_ = -1 * (i_27_ << 0);
							i_20_ = i_24_ * i_26_ >> i_28_;
							i_21_ = i_26_ * i_23_ >> i_28_;
						}
						int i_29_ = (int) (65535.0 * Math.random());
						int i_30_ = (int) (65535.0 * Math.random());
						if ((i_29_ + i_30_ ^ 0xffffffff) < -65536) {
							i_30_ = -i_30_ + 65535;
							i_29_ = -i_29_ + 65535;
						}
						int i_31_ = 65535 - (i_29_ - -i_30_);
						int i_32_ = ((anInt4835 * i_30_ + anInt4840 * i_29_ - -(i_31_ * anInt4831)) >> 16);
						int i_33_ = (i_31_ * anInt4848 + (anInt4839 * i_30_ + i_29_ * anInt4834) >> 16);
						int i_34_ = (anInt4857 * i_30_ + (anInt4836 * i_29_ + anInt4849 * i_31_) >> 16);
						int i_35_ = ((int) ((double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1414 - (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1422)) * Math.random()) + ((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1422);
						int i_36_ = (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1381 - -(int) ((double) ((((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1390) + -(((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1381)) * Math.random()));
						int i_37_ = ((int) (Math.random() * (double) (-(((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1401) + ((Class104) (((Class130_Sub6) this).aClass104_4856)).f_nb)) + ((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1401);
						int i_38_;
						if (!((Class104) ((Class130_Sub6) this).aClass104_4856).f_kb)
							i_38_ = ((int) ((double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1416) + (Math.random() * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).f_rb))) << 24 | ((int) ((Math.random() * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1413)) + (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1393)) << 16 | (int) ((double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1398) + (Math.random() * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1380))) << 8 | (int) ((Math.random() * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1396)) + (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).f_sb))));
						else {
							double d = Math.random();
							i_38_ = ((int) ((Math.random() * (double) ((Class104) (((Class130_Sub6) this).aClass104_4856)).f_rb) + (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1416)) << 24 | ((int) ((double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1393) + (d * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1413))) << 16 | (int) ((d * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1380)) + (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1398)) << 8 | (int) ((d * (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).anInt1396)) + (double) (((Class104) (((Class130_Sub6) this).aClass104_4856)).f_sb))));
						}
						int i_39_ = (((Class104) ((Class130_Sub6) this).aClass104_4856).anInt1387);
						if (!class260.method1720() && !((Class104) (((Class130_Sub6) this).aClass104_4856)).aBool1420)
							i_39_ = -1;
						if (Class165.anInt2335 == Class199.anInt2846) {
							Class130_Sub1_Sub1_Sub1 class130_sub1_sub1_sub1 = (new Class130_Sub1_Sub1_Sub1(this, i_32_, i_33_, i_34_, i_20_, i_19_, i_21_, i_35_, i_36_, i_38_, i_37_, i_39_, ((Class104) (((Class130_Sub6) this).aClass104_4856)).aBool1418, ((Class104) (((Class130_Sub6) this).aClass104_4856)).aBool1385));
						} else {
							Class130_Sub1_Sub1_Sub1 class130_sub1_sub1_sub1 = (Class246_Sub43.aClass130_Sub1_Sub1_Sub1Array5600[Class199.anInt2846]);
							Class199.anInt2846 = 0x3ff & Class199.anInt2846 + 1;
							class130_sub1_sub1_sub1.method2903(this, i_32_, i_33_, i_34_, i_20_, i_19_, i_21_, i_35_, i_36_, i_38_, i_37_, i_39_, ((Class104) (((Class130_Sub6) this).aClass104_4856)).aBool1418, ((Class104) (((Class130_Sub6) this).aClass104_4856)).aBool1385);
						}
					}
				}
			}
			((Class130_Sub6) this).anInt4855 = 0;
			for (Class130_Sub1_Sub1_Sub1 class130_sub1_sub1_sub1 = ((Class130_Sub1_Sub1_Sub1) ((Class130_Sub6) this).aClass68_4838.method445(62)); class130_sub1_sub1_sub1 != null; class130_sub1_sub1_sub1 = (Class130_Sub1_Sub1_Sub1) ((Class130_Sub6) this).aClass68_4838.method442((byte) -99)) {
				class130_sub1_sub1_sub1.method2905(l, i);
				((Class130_Sub6) this).anInt4855++;
			}
			if (i_15_ >= 44)
				Class247.anInt3480 += ((Class130_Sub6) this).anInt4855;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mo.E(" + i + ',' + i_15_ + ',' + l + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2106(int i) {
		do {
			try {
				aClass217_4844 = null;
				if (i == -1)
					break;
				method2102(39, -57);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mo.G(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2107(byte i, int i_40_, int i_41_, float[] fs, int i_42_, int i_43_, int i_44_) {
		try {
			anInt4837++;
			if ((i_43_ ^ 0xffffffff) < -1 && !Class246_Sub40.method2313(200, i_43_))
				throw new IllegalArgumentException("");
			if (i_44_ > 0 && !Class246_Sub40.method2313(200, i_44_))
				throw new IllegalArgumentException("");
			int i_45_ = Class4.method56((byte) -11, i_42_);
			int i_46_ = 0;
			int i_47_ = (i_43_ ^ 0xffffffff) > (i_44_ ^ 0xffffffff) ? i_43_ : i_44_;
			int i_48_ = i_43_ >> 1;
			int i_49_ = i_44_ >> 1;
			if (i <= 20)
				method2102(-117, 29);
			float[] fs_50_ = fs;
			float[] fs_51_ = new float[i_49_ * (i_48_ * i_45_)];
			for (;;) {
				OpenGL.glTexImage2Df(i_41_, i_46_, i_40_, i_43_, i_44_, 0, i_42_, 5126, fs_50_, 0);
				if ((i_47_ ^ 0xffffffff) >= -2)
					break;
				int i_52_ = i_45_ * i_43_;
				for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
					int i_54_ = i_53_;
					int i_55_ = i_53_;
					int i_56_ = i_52_ + i_55_;
					for (int i_57_ = 0; i_49_ > i_57_; i_57_++) {
						for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (i_48_ ^ 0xffffffff); i_58_++) {
							float f = fs_50_[i_55_];
							i_55_ += i_45_;
							f += fs_50_[i_55_];
							f += fs_50_[i_56_];
							i_55_ += i_45_;
							i_56_ += i_45_;
							f += fs_50_[i_56_];
							i_56_ += i_45_;
							fs_51_[i_54_] = f * 0.25F;
							i_54_ += i_45_;
						}
						i_55_ += i_52_;
						i_56_ += i_52_;
					}
				}
				float[] fs_59_ = fs_51_;
				fs_51_ = fs_50_;
				i_43_ = i_48_;
				fs_50_ = fs_59_;
				i_44_ = i_49_;
				i_46_++;
				i_48_ >>= 1;
				i_49_ >>= 1;
				i_47_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mo.C(" + i + ',' + i_40_ + ',' + i_41_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ')'));
		}
	}

	final void method2108(boolean bool, long l) {
		try {
			anInt4863++;
			if (bool != true)
				method2105(-108, -59, 45L, false, null);
			for (Class130_Sub1_Sub1_Sub1 class130_sub1_sub1_sub1 = ((Class130_Sub1_Sub1_Sub1) ((Class130_Sub6) this).aClass68_4838.method445(62)); class130_sub1_sub1_sub1 != null; class130_sub1_sub1_sub1 = (Class130_Sub1_Sub1_Sub1) ((Class130_Sub6) this).aClass68_4838.method442((byte) -71))
				class130_sub1_sub1_sub1.method2902(l);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mo.A(" + bool + ',' + l + ')');
		}
	}

	Class130_Sub6(Class260 class260, Class19 class19, Class130_Sub2 class130_sub2, long l) {
		aBool4845 = false;
		((Class130_Sub6) this).aBool4862 = false;
		try {
			((Class130_Sub6) this).aClass130_Sub2_4859 = class130_sub2;
			aLong4861 = l;
			((Class130_Sub6) this).aClass19_4852 = class19;
			((Class130_Sub6) this).aClass104_4856 = ((Class130_Sub6) this).aClass19_4852.method188((byte) 85);
			if (!class260.method1720() && (((Class104) ((Class130_Sub6) this).aClass104_4856).f_ab ^ 0xffffffff) != 0)
				((Class130_Sub6) this).aClass104_4856 = Class40_Sub5.method2128(112, ((Class104) (((Class130_Sub6) this).aClass104_4856)).f_ab);
			((Class130_Sub6) this).aClass68_4838 = new Class68();
			anInt4846 += Math.random() * 64.0;
			method2103(1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mo.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class19 != null ? "{...}" : "null") + ',' + (class130_sub2 != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}
}
