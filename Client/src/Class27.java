
/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class27 {
	private int[] anIntArray361;
	int anInt362 = -1;
	static int anInt363;
	static int anInt364;
	boolean aBool365;
	static int anInt366;
	static int anInt367;
	static int anInt368;
	static int anInt369;
	private long aLong370;
	static int anInt371;
	static int anInt372;
	int[] anIntArray373;
	static int anInt374;
	private int anInt375;
	static int anInt376;
	private int[][] anIntArrayArray377;
	private long aLong378;
	static int anInt379;
	static int anInt380;

	final Class_t method212(int i, int i_0_, boolean bool, Class228 class228, Class191 class191, Interface11 interface11, int i_1_, Class124 class124, Class92 class92, Class260 class260, Class45 class45, int i_2_) {
		try {
			anInt363++;
			if ((((Class27) this).anInt362 ^ 0xffffffff) != 0)
				return (class228.method1462(((Class27) this).anInt362, 1).method1634(i_0_, i_1_, 33, i_2_, class124, i, interface11, class260, class45));
			int i_3_ = i_2_;
			if (class124 != null) {
				boolean bool_4_ = false;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				boolean bool_7_ = false;
				int i_8_ = -1;
				int i_9_ = -1;
				Object object = null;
				Object object_10_ = null;
				i_3_ |= 0x20;
				i_8_ = ((Class124) class124).anIntArray1724[i];
				int i_11_ = i_8_ >>> 16;
				i_8_ &= 0xffff;
				Class246_Sub1_Sub17 class246_sub1_sub17 = class45.method298(i_11_, 1);
				if (class246_sub1_sub17 != null) {
					bool_5_ |= class246_sub1_sub17.method2757((byte) -121, i_8_);
					bool_4_ |= class246_sub1_sub17.method2764(-6210, i_8_);
					bool_7_ |= class246_sub1_sub17.method2765(i_8_, (byte) 127);
					bool_6_ |= ((Class124) class124).aBool1743;
				}
				if ((((Class124) class124).aBool1732 || OutputStream_Sub1.aBool4488) && (i_0_ ^ 0xffffffff) != 0 && ((i_0_ ^ 0xffffffff) > (((Class124) class124).anIntArray1724.length ^ 0xffffffff))) {
					i_9_ = ((Class124) class124).anIntArray1724[i_0_];
					int i_12_ = i_9_ >>> 16;
					i_9_ &= 0xffff;
					Class246_Sub1_Sub17 class246_sub1_sub17_13_ = ((i_11_ ^ 0xffffffff) == (i_12_ ^ 0xffffffff) ? class246_sub1_sub17 : class45.method298(i_12_, 1));
					if (class246_sub1_sub17_13_ != null) {
						bool_5_ |= class246_sub1_sub17_13_.method2757((byte) -79, i_9_);
						bool_4_ |= class246_sub1_sub17_13_.method2764(-6210, i_9_);
						bool_7_ |= class246_sub1_sub17_13_.method2765(i_9_, (byte) 104);
					}
				}
				if (bool_5_)
					i_3_ |= 0x80;
				if (bool_4_)
					i_3_ |= 0x100;
				if (bool_6_)
					i_3_ |= 0x200;
				if (bool_7_)
					i_3_ |= 0x400;
			}
			Class_t class_t;
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				class_t = (Class_t) Class246_Sub28_Sub14.aClass54_6304.method379(aLong370, (byte) 58);
			}
			if (class_t == null || class260.method1710(class_t.P(), i_3_) != 0) {
				if (class_t != null)
					i_3_ = class260.method1723(i_3_, class_t.P());
				int i_14_ = i_3_;
				boolean bool_15_ = false;
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -13; i_16_++) {
					int i_17_ = anIntArray361[i_16_];
					if ((i_17_ & 0x40000000) != 0) {
						if (!class191.method1251(22883, i_17_ & 0x3fffffff).method1284(116, ((Class27) this).aBool365))
							bool_15_ = true;
					} else if ((i_17_ & ~0x7fffffff) != 0 && !class92.method589(0x3fffffff & i_17_, -18653).method1065((byte) 105))
						bool_15_ = true;
				}
				if (bool_15_)
					return null;
				Class103[] class103s = new Class103[12];
				int i_18_ = 0;
				for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -13; i_19_++) {
					int i_20_ = anIntArray361[i_19_];
					if ((0x40000000 & i_20_ ^ 0xffffffff) != -1) {
						Class103 class103 = class191.method1251(22883, i_20_ & 0x3fffffff).method1300(0, ((Class27) this).aBool365);
						if (class103 != null)
							class103s[i_18_++] = class103;
					} else if ((~0x7fffffff & i_20_ ^ 0xffffffff) != -1) {
						Class103 class103 = class92.method589(0x3fffffff & i_20_, -18653).method1071(0);
						if (class103 != null)
							class103s[i_18_++] = class103;
					}
				}
				i_14_ |= 0x4000;
				Class103 class103 = new Class103(class103s, i_18_);
				class_t = class260.method1695(class103, i_14_, CS2Script.anInt5682, 64, 768);
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -6; i_21_++) {
					if ((((Class27) this).anIntArray373[i_21_] ^ 0xffffffff) > ((Class246_Sub30_Sub1.aShortArrayArray5767[i_21_]).length ^ 0xffffffff))
						class_t.BA(Class160.aShortArray2270[i_21_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_21_][((Class27) this).anIntArray373[i_21_]]));
					if ((Class246_Sub1_Sub2.aShortArrayArray5693[i_21_].length ^ 0xffffffff) < (((Class27) this).anIntArray373[i_21_] ^ 0xffffffff))
						class_t.BA(Node.aShortArray3466[i_21_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_21_][((Class27) this).anIntArray373[i_21_]]));
				}
				class_t.UA(i_3_);
				synchronized (Class246_Sub28_Sub14.aClass54_6304) {
					Class246_Sub28_Sub14.aClass54_6304.method371(1, aLong370, class_t);
				}
			}
			if (class124 == null)
				return class_t;
			Class_t class_t_22_ = class_t.method678((byte) 4, i_3_, true);
			class_t_22_ = class124.method846(i_1_, i_2_, i_0_, i, class_t, -107);
			if (bool != false)
				anInt375 = 6;
			return class_t_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.C(" + i + ',' + i_0_ + ',' + bool + ',' + (class228 != null ? "{...}" : "null") + ',' + (class191 != null ? "{...}" : "null") + ',' + (interface11 != null ? "{...}" : "null") + ',' + i_1_ + ',' + (class124 != null ? "{...}" : "null") + ',' + (class92 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	final void method213(boolean bool, int i) {
		do {
			try {
				anInt367++;
				((Class27) this).aBool365 = bool;
				method216((byte) 105);
				if (i == 15366)
					break;
				method218(-92);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "cj.E(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method214(int i, Class92 class92, int i_23_, int i_24_) {
		try {
			if (i_24_ < 91)
				method215(null, null, null, -45, null, null, 77, 1, null, (byte) -1, null, 74, 27, null, null, 69, null, 93, false);
			anInt364++;
			int i_25_ = Class160.anIntArray2262[i_23_];
			if (anIntArray361[i_25_] != 0 && class92.method589(i, -18653) != null) {
				anIntArray361[i_25_] = Class236.method1523(i, -2147483648);
				method216((byte) 117);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.K(" + i + ',' + (class92 != null ? "{...}" : "null") + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	final Class_t method215(Class_v class_v, Class92 class92, Class124 class124, int i, Class148[] class148s, Class228 class228, int i_26_, int i_27_, Class124 class124_28_, byte i_29_, Class45 class45, int i_30_, int i_31_, Class260 class260, Class191 class191, int i_32_, Interface11 interface11, int i_33_, boolean bool) {
		try {
			anInt372++;
			if ((((Class27) this).anInt362 ^ 0xffffffff) != 0)
				return (class228.method1462(((Class27) this).anInt362, 1).method1625(i_32_, -117, class124_28_, interface11, i_26_, i, i_33_, i_31_, class260, i_27_, i_30_, class148s, class124, class45, class_v));
			int i_34_ = i;
			long l = aLong370;
			int[] is = anIntArray361;
			if (class124_28_ != null && (((Class124) class124_28_).anInt1739 >= 0 || ((Class124) class124_28_).anInt1749 >= 0)) {
				is = new int[12];
				for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -13; i_35_++)
					is[i_35_] = anIntArray361[i_35_];
				if (((Class124) class124_28_).anInt1739 >= 0) {
					if (((Class124) class124_28_).anInt1739 == 65535) {
						l ^= ~0xffffffffL;
						is[5] = 0;
					} else {
						is[5] = Class236.method1523((((Class124) class124_28_).anInt1739), 1073741824);
						l ^= (long) is[5] << 32;
					}
				}
				if (((Class124) class124_28_).anInt1749 >= 0) {
					if (((Class124) class124_28_).anInt1749 != 65535) {
						is[3] = Class236.method1523(1073741824, (((Class124) class124_28_).anInt1749));
						l ^= (long) is[3];
					} else {
						l ^= 0xffffffffL;
						is[3] = 0;
					}
				}
			}
			boolean bool_36_ = false;
			boolean bool_37_ = false;
			if (i_29_ <= 103)
				((Class27) this).anIntArray373 = null;
			boolean bool_38_ = false;
			boolean bool_39_ = class124_28_ != null || class124 != null;
			int i_40_ = class148s != null ? class148s.length : 0;
			for (int i_41_ = 0; (i_40_ ^ 0xffffffff) < (i_41_ ^ 0xffffffff); i_41_++) {
				Class17.aClass246_Sub1_Sub17Array246[i_41_] = null;
				if (class148s[i_41_] != null) {
					Class124 class124_42_ = class45.method304(3, (((Class148) class148s[i_41_]).anInt2179));
					if (((Class124) class124_42_).anIntArray1724 != null) {
						bool_39_ = true;
						Class259_Sub2.aClass124Array4958[i_41_] = class124_42_;
						int i_43_ = ((Class148) class148s[i_41_]).anInt2177;
						int i_44_ = ((Class148) class148s[i_41_]).anInt2180;
						int i_45_ = ((Class124) class124_42_).anIntArray1724[i_43_];
						Class17.aClass246_Sub1_Sub17Array246[i_41_] = class45.method298(i_45_ >>> 16, 1);
						i_45_ &= 0xffff;
						Class136.anIntArray1943[i_41_] = i_45_;
						if (Class17.aClass246_Sub1_Sub17Array246[i_41_] != null) {
							bool_37_ |= Class17.aClass246_Sub1_Sub17Array246[i_41_].method2757((byte) -105, i_45_);
							bool_36_ |= Class17.aClass246_Sub1_Sub17Array246[i_41_].method2764(-6210, i_45_);
							bool_38_ |= Class17.aClass246_Sub1_Sub17Array246[i_41_].method2765(i_45_, (byte) 125);
						}
						if ((((Class124) class124_42_).aBool1732 || OutputStream_Sub1.aBool4488) && i_44_ != -1 && i_44_ < (((Class124) class124_42_).anIntArray1724).length) {
							Class246_Sub22.anIntArray4771[i_41_] = (((Class124) class124_42_).anIntArray1745[i_43_]);
							Class64_Sub1.anIntArray5235[i_41_] = ((Class148) class148s[i_41_]).anInt2182;
							int i_46_ = (((Class124) class124_42_).anIntArray1724[i_44_]);
							Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_] = class45.method298(i_46_ >>> 16, 1);
							i_46_ &= 0xffff;
							Class31.anIntArray415[i_41_] = i_46_;
							if ((Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_]) != null) {
								bool_37_ |= Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_].method2757((byte) -107, i_46_);
								bool_36_ |= Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_].method2764(-6210, i_46_);
								bool_38_ |= Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_].method2765(i_46_, (byte) 111);
							}
						} else {
							Class246_Sub22.anIntArray4771[i_41_] = 0;
							Class64_Sub1.anIntArray5235[i_41_] = 0;
							Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_41_] = null;
							Class31.anIntArray415[i_41_] = -1;
						}
					}
				}
			}
			int i_47_ = -1;
			int i_48_ = -1;
			int i_49_ = 0;
			Class246_Sub1_Sub17 class246_sub1_sub17 = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_50_ = null;
			int i_51_ = -1;
			int i_52_ = -1;
			int i_53_ = 0;
			Class246_Sub1_Sub17 class246_sub1_sub17_54_ = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_55_ = null;
			if (bool_39_) {
				if (class124_28_ != null) {
					i_47_ = ((Class124) class124_28_).anIntArray1724[i_27_];
					int i_56_ = i_47_ >>> 16;
					class246_sub1_sub17 = class45.method298(i_56_, 1);
					i_47_ &= 0xffff;
					if (class246_sub1_sub17 != null) {
						bool_37_ |= class246_sub1_sub17.method2757((byte) -106, i_47_);
						bool_36_ |= class246_sub1_sub17.method2764(-6210, i_47_);
						bool_38_ |= class246_sub1_sub17.method2765(i_47_, (byte) 101);
					}
					if ((((Class124) class124_28_).aBool1732 || OutputStream_Sub1.aBool4488) && (i_26_ ^ 0xffffffff) != 0 && (((Class124) class124_28_).anIntArray1724.length > i_26_)) {
						i_49_ = ((Class124) class124_28_).anIntArray1745[i_27_];
						i_48_ = ((Class124) class124_28_).anIntArray1724[i_26_];
						int i_57_ = i_48_ >>> 16;
						class246_sub1_sub17_50_ = (i_56_ != i_57_ ? class45.method298(i_57_, 1) : class246_sub1_sub17);
						i_48_ &= 0xffff;
						if (class246_sub1_sub17_50_ != null) {
							bool_37_ |= class246_sub1_sub17_50_.method2757((byte) -121, i_48_);
							bool_36_ |= class246_sub1_sub17_50_.method2764(-6210, i_48_);
							bool_38_ |= class246_sub1_sub17_50_.method2765(i_48_, (byte) 95);
						}
					}
				}
				i_34_ |= 0x20;
				if (class124 != null) {
					i_51_ = ((Class124) class124).anIntArray1724[i_31_];
					int i_58_ = i_51_ >>> 16;
					class246_sub1_sub17_54_ = class45.method298(i_58_, 1);
					i_51_ &= 0xffff;
					if (class246_sub1_sub17_54_ != null) {
						bool_37_ |= class246_sub1_sub17_54_.method2757((byte) -113, i_51_);
						bool_36_ |= class246_sub1_sub17_54_.method2764(-6210, i_51_);
						bool_38_ |= class246_sub1_sub17_54_.method2765(i_51_, (byte) 122);
					}
					if ((((Class124) class124).aBool1732 || OutputStream_Sub1.aBool4488) && (i_30_ ^ 0xffffffff) != 0 && (((Class124) class124).anIntArray1724.length > i_30_)) {
						i_52_ = ((Class124) class124).anIntArray1724[i_30_];
						i_53_ = ((Class124) class124).anIntArray1745[i_31_];
						int i_59_ = i_52_ >>> 16;
						i_52_ &= 0xffff;
						class246_sub1_sub17_55_ = (i_58_ != i_59_ ? class45.method298(i_59_, 1) : class246_sub1_sub17_54_);
						if (class246_sub1_sub17_55_ != null) {
							bool_37_ |= class246_sub1_sub17_55_.method2757((byte) -126, i_52_);
							bool_36_ |= class246_sub1_sub17_55_.method2764(-6210, i_52_);
							bool_38_ |= class246_sub1_sub17_55_.method2765(i_52_, (byte) 122);
						}
					}
				}
				if (bool_37_)
					i_34_ |= 0x80;
				if (bool_36_)
					i_34_ |= 0x100;
				if (bool_38_)
					i_34_ |= 0x400;
			}
			Class_t class_t;
			synchronized (Class253.aClass54_3600) {
				class_t = (Class_t) Class253.aClass54_3600.method379(l, (byte) 58);
			}
			Class135 class135 = null;
			if (anInt375 != -1)
				class135 = class_v.method694(false, anInt375);
			if (class_t == null || (class260.method1710(class_t.P(), i_34_) ^ 0xffffffff) != -1 || (class135 != null && ((Class135) class135).anIntArrayArray1905 != null && anIntArrayArray377 == null)) {
				if (class_t != null)
					i_34_ = class260.method1723(i_34_, class_t.P());
				int i_60_ = i_34_;
				boolean bool_61_ = false;
				for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > -13; i_62_++) {
					int i_63_ = is[i_62_];
					if ((i_63_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((i_63_ & ~0x7fffffff) != 0 && !class92.method589(0x3fffffff & i_63_, -18653).method1067((byte) 55))
							bool_61_ = true;
					} else if (!class191.method1251(22883, 0x3fffffff & i_63_).method1292(-1, ((Class27) this).aBool365))
						bool_61_ = true;
				}
				if (bool_61_) {
					if (aLong378 != -1L) {
						synchronized (Class253.aClass54_3600) {
							class_t = ((Class_t) Class253.aClass54_3600.method379(aLong378, (byte) 58));
						}
					}
					if (class_t == null || class260.method1710(class_t.P(), i_34_) != 0 || (class135 != null && (((Class135) class135).anIntArrayArray1905 != null) && anIntArrayArray377 == null))
						return null;
				} else {
					Class103[] class103s = new Class103[12];
					for (int i_64_ = 0; i_64_ < 12; i_64_++) {
						int i_65_ = is[i_64_];
						if ((i_65_ & 0x40000000) != 0) {
							Class103 class103 = (class191.method1251(22883, 0x3fffffff & i_65_).method1291(((Class27) this).aBool365, 0));
							if (class103 != null)
								class103s[i_64_] = class103;
						} else if ((i_65_ & ~0x7fffffff) != 0) {
							Class103 class103 = class92.method589(i_65_ & 0x3fffffff, -18653).method1068((byte) -63);
							if (class103 != null)
								class103s[i_64_] = class103;
						}
					}
					if (class135 != null && ((Class135) class135).anIntArrayArray1905 != null) {
						for (int i_66_ = 0; ((((Class135) class135).anIntArrayArray1905.length ^ 0xffffffff) < (i_66_ ^ 0xffffffff)); i_66_++) {
							if ((((Class135) class135).anIntArrayArray1905[i_66_]) != null && class103s[i_66_] != null) {
								int i_67_ = (((Class135) class135).anIntArrayArray1905[i_66_][0]);
								int i_68_ = (((Class135) class135).anIntArrayArray1905[i_66_][1]);
								int i_69_ = (((Class135) class135).anIntArrayArray1905[i_66_][2]);
								int i_70_ = ((((Class135) class135).anIntArrayArray1905[i_66_][3]) << 3);
								int i_71_ = ((((Class135) class135).anIntArrayArray1905[i_66_][4]) << 3);
								int i_72_ = ((((Class135) class135).anIntArrayArray1905[i_66_][5]) << 3);
								if (anIntArrayArray377 == null)
									anIntArrayArray377 = (new int[(((Class135) class135).anIntArrayArray1905).length][]);
								if (anIntArrayArray377[i_66_] == null) {
									int[] is_73_ = (anIntArrayArray377[i_66_] = new int[15]);
									if ((i_70_ ^ 0xffffffff) != -1 || i_71_ != 0 || (i_72_ ^ 0xffffffff) != -1) {
										int i_74_ = (Class39_Sub1.anIntArray4672[i_70_]);
										int i_75_ = Class39_Sub1.f_fb[i_70_];
										int i_76_ = (Class39_Sub1.anIntArray4672[i_71_]);
										int i_77_ = Class39_Sub1.f_fb[i_71_];
										int i_78_ = (Class39_Sub1.anIntArray4672[i_72_]);
										int i_79_ = Class39_Sub1.f_fb[i_72_];
										int i_80_ = i_78_ * i_75_ + 16384 >> 15;
										int i_81_ = i_75_ * i_79_ + 16384 >> 15;
										is_73_[8] = 16384 + i_76_ * i_74_ >> 15;
										is_73_[7] = (-i_79_ * -i_77_ + i_80_ * i_76_ + 16384) >> 15;
										is_73_[2] = 16384 + i_74_ * i_77_ >> 15;
										is_73_[5] = -i_75_;
										is_73_[6] = 16384 + (-i_77_ * i_78_ + i_76_ * i_81_) >> 15;
										is_73_[0] = (16384 + (i_76_ * i_78_ - -(i_77_ * i_81_)) >> 15);
										is_73_[4] = 16384 + i_74_ * i_78_ >> 15;
										is_73_[3] = 16384 + i_79_ * i_74_ >> 15;
										is_73_[1] = 16384 + (i_77_ * i_80_ + i_76_ * -i_79_) >> 15;
										is_73_[13] = ((16384 + is_73_[1] * -i_67_ + (-i_68_ * is_73_[4] - -(-i_69_ * is_73_[7]))) >> 15);
										is_73_[14] = (is_73_[2] * -i_67_ + is_73_[5] * -i_68_ - (-(-i_69_ * is_73_[8]) - 16384)) >> 15;
										is_73_[12] = (-i_69_ * is_73_[6] + (-i_68_ * is_73_[3] + -i_67_ * is_73_[0] + 16384)) >> 15;
									} else {
										is_73_[14] = -i_69_;
										is_73_[13] = -i_68_;
										is_73_[12] = -i_67_;
										is_73_[0] = is_73_[4] = is_73_[8] = 32768;
									}
									is_73_[9] = i_67_;
									is_73_[10] = i_68_;
									is_73_[11] = i_69_;
								}
								if ((i_70_ ^ 0xffffffff) != -1 || i_71_ != 0 || (i_72_ ^ 0xffffffff) != -1)
									class103s[i_66_].method660(i_70_, i_71_, i_72_, (byte) 107);
								if ((i_67_ ^ 0xffffffff) != -1 || (i_68_ ^ 0xffffffff) != -1 || (i_69_ ^ 0xffffffff) != -1)
									class103s[i_66_].method648(i_68_, i_67_, i_69_, -52);
							}
						}
					}
					i_60_ |= 0x4000;
					Class103 class103 = new Class103(class103s, class103s.length);
					class_t = class260.method1695(class103, i_60_, CS2Script.anInt5682, 64, 850);
					for (int i_82_ = 0; i_82_ < 5; i_82_++) {
						if ((((Class27) this).anIntArray373[i_82_] ^ 0xffffffff) > ((Class246_Sub30_Sub1.aShortArrayArray5767[i_82_]).length ^ 0xffffffff))
							class_t.BA(Class160.aShortArray2270[i_82_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_82_][(((Class27) this).anIntArray373[i_82_])]));
						if (((Class27) this).anIntArray373[i_82_] < (Class246_Sub1_Sub2.aShortArrayArray5693[i_82_]).length)
							class_t.BA(Node.aShortArray3466[i_82_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_82_][(((Class27) this).anIntArray373[i_82_])]));
					}
					if (bool) {
						class_t.UA(i_34_);
						synchronized (Class253.aClass54_3600) {
							Class253.aClass54_3600.method371(1, l, class_t);
						}
						aLong378 = l;
					}
				}
			}
			Class_t class_t_83_ = class_t.method678((byte) 4, i_34_, true);
			if (!bool_39_)
				return class_t_83_;
			int i_84_ = 0;
			int i_85_ = 1;
			while (i_40_ > i_84_) {
				if (Class17.aClass246_Sub1_Sub17Array246[i_84_] != null)
					class_t_83_.method688(Class31.anIntArray415[i_84_], Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_84_], (anIntArrayArray377 != null ? anIntArrayArray377[i_84_] : null), false, 0, Class136.anIntArray1943[i_84_], -91, Class246_Sub22.anIntArray4771[i_84_], Class17.aClass246_Sub1_Sub17Array246[i_84_], Class64_Sub1.anIntArray5235[i_84_] - 1, i_85_);
				i_84_++;
				i_85_ <<= 1;
			}
			if (class246_sub1_sub17 != null && class246_sub1_sub17_54_ != null)
				class_t_83_.method690(i_47_, i_49_, class246_sub1_sub17_55_, false, i_53_, -1 + i_32_, i_51_, class246_sub1_sub17_54_, class246_sub1_sub17, i_52_, ((Class124) class124_28_).aBoolArray1751, class246_sub1_sub17_50_, i_33_ - 1, i_48_, -75);
			else if (class246_sub1_sub17 == null) {
				if (class246_sub1_sub17_54_ != null)
					class_t_83_.method674(0, i_53_, false, i_51_, i_52_, class246_sub1_sub17_54_, class246_sub1_sub17_55_, -1 + i_32_, 0);
			} else
				class_t_83_.method674(0, i_49_, false, i_47_, i_48_, class246_sub1_sub17, class246_sub1_sub17_50_, -1 + i_33_, 0);
			for (int i_86_ = 0; i_40_ > i_86_; i_86_++) {
				Class17.aClass246_Sub1_Sub17Array246[i_86_] = null;
				Class59_Sub5.aClass246_Sub1_Sub17Array5407[i_86_] = null;
				Class259_Sub2.aClass124Array4958[i_86_] = null;
			}
			return class_t_83_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.H(" + (class_v != null ? "{...}" : "null") + ',' + (class92 != null ? "{...}" : "null") + ',' + (class124 != null ? "{...}" : "null") + ',' + i + ',' + (class148s != null ? "{...}" : "null") + ',' + (class228 != null ? "{...}" : "null") + ',' + i_26_ + ',' + i_27_ + ',' + (class124_28_ != null ? "{...}" : "null") + ',' + i_29_ + ',' + (class45 != null ? "{...}" : "null") + ',' + i_30_ + ',' + i_31_ + ',' + (class260 != null ? "{...}" : "null") + ',' + (class191 != null ? "{...}" : "null") + ',' + i_32_ + ',' + (interface11 != null ? "{...}" : "null") + ',' + i_33_ + ',' + bool + ')'));
		}
	}

	private final void method216(byte i) {
		try {
			anInt371++;
			aLong370 = -1L;
			long[] ls = Class102.aLongArray1322;
			aLong370 = (ls[(int) ((aLong370 ^ (long) (anInt375 >> 8)) & 0xffL)] ^ aLong370 >>> 8);
			aLong370 = aLong370 >>> 8 ^ ls[(int) ((aLong370 ^ (long) anInt375) & 0xffL)];
			for (int i_87_ = 0; i_87_ < 12; i_87_++) {
				aLong370 = ls[(int) (0xffL & ((long) (anIntArray361[i_87_] >> 24) ^ aLong370))] ^ aLong370 >>> 8;
				aLong370 = (aLong370 >>> 8 ^ ls[(int) ((aLong370 ^ (long) (anIntArray361[i_87_] >> 16)) & 0xffL)]);
				aLong370 = (aLong370 >>> 8 ^ ls[(int) (0xffL & (aLong370 ^ (long) (anIntArray361[i_87_] >> 8)))]);
				aLong370 = (aLong370 >>> 8 ^ ls[(int) (0xffL & (aLong370 ^ (long) anIntArray361[i_87_]))]);
			}
			if (i < 104)
				method221(null, -67, -31, true);
			for (int i_88_ = 0; (i_88_ ^ 0xffffffff) > -6; i_88_++)
				aLong370 = (ls[(int) (0xffL & (aLong370 ^ (long) (((Class27) this).anIntArray373[i_88_])))] ^ aLong370 >>> 8);
			aLong370 = aLong370 >>> 8 ^ ls[(int) (((long) (((Class27) this).aBool365 ? 1 : 0) ^ aLong370) & 0xffL)];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cj.G(" + i + ')');
		}
	}

	final void method217(boolean bool, byte i, int i_89_, int i_90_, int[] is, int[] is_91_) {
		try {
			if ((i_90_ ^ 0xffffffff) != (anInt375 ^ 0xffffffff)) {
				anInt375 = i_90_;
				anIntArrayArray377 = null;
			}
			((Class27) this).anIntArray373 = is_91_;
			((Class27) this).aBool365 = bool;
			anInt380++;
			if (i > -94)
				method214(126, null, 96, 55);
			((Class27) this).anInt362 = i_89_;
			anIntArray361 = is;
			method216((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.F(" + bool + ',' + i + ',' + i_89_ + ',' + i_90_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_91_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method218(int i) {
		try {
			Class246_Sub28_Sub13.anInt6293 = 0;
			int i_92_ = -26 / ((i + 62) / 59);
			Class34.anInt451 = -1;
			Class188.anInt2658 = -1;
			anInt369++;
			Class211_Sub1.anInt5343 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cj.J(" + i + ')');
		}
	}

	final Class_t method219(Class124 class124, int i, Class45 class45, int i_93_, int i_94_, Class92 class92, int i_95_, int i_96_, int i_97_, Class260 class260, int i_98_, int i_99_) {
		try {
			anInt376++;
			int i_100_ = i_95_;
			if (class124 != null) {
				boolean bool = false;
				boolean bool_101_ = false;
				boolean bool_102_ = false;
				boolean bool_103_ = false;
				int i_104_ = -1;
				int i_105_ = -1;
				Object object = null;
				i_104_ = ((Class124) class124).anIntArray1724[i_99_];
				Object object_106_ = null;
				i_100_ |= 0x20;
				int i_107_ = i_104_ >>> 16;
				Class246_Sub1_Sub17 class246_sub1_sub17 = class45.method298(i_107_, 1);
				i_104_ &= 0xffff;
				if (class246_sub1_sub17 != null) {
					bool_101_ |= class246_sub1_sub17.method2757((byte) -54, i_104_);
					bool |= class246_sub1_sub17.method2764(-6210, i_104_);
					bool_103_ |= class246_sub1_sub17.method2765(i_104_, (byte) 113);
					bool_102_ |= ((Class124) class124).aBool1743;
				}
				if ((((Class124) class124).aBool1732 || OutputStream_Sub1.aBool4488) && i_97_ != -1 && i_97_ < ((Class124) class124).anIntArray1724.length) {
					i_105_ = ((Class124) class124).anIntArray1724[i_97_];
					int i_108_ = i_105_ >>> 16;
					i_105_ &= 0xffff;
					Class246_Sub1_Sub17 class246_sub1_sub17_109_;
					if ((i_107_ ^ 0xffffffff) != (i_108_ ^ 0xffffffff))
						class246_sub1_sub17_109_ = class45.method298(i_105_ >>> 16, 1);
					else
						class246_sub1_sub17_109_ = class246_sub1_sub17;
					if (class246_sub1_sub17_109_ != null) {
						bool_101_ |= class246_sub1_sub17_109_.method2757((byte) -51, i_105_);
						bool |= class246_sub1_sub17_109_.method2764(-6210, i_105_);
						bool_103_ |= class246_sub1_sub17_109_.method2765(i_105_, (byte) 108);
					}
				}
				if (bool_101_)
					i_100_ |= 0x80;
				if (bool)
					i_100_ |= 0x100;
				if (bool_102_)
					i_100_ |= 0x200;
				if (bool_103_)
					i_100_ |= 0x400;
			}
			long l = (long) i_93_ | ((long) (i_96_ << 16) | (long) i_94_ << 32);
			Class_t class_t;
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				class_t = (Class_t) Class246_Sub28_Sub14.aClass54_6304.method379(l, (byte) 58);
			}
			if (class_t == null || (class260.method1710(class_t.P(), i_100_) ^ 0xffffffff) != -1) {
				if (class_t != null)
					i_100_ = class260.method1723(i_100_, class_t.P());
				int i_110_ = i_100_;
				Class103[] class103s = new Class103[3];
				int i_111_ = 0;
				if (class92.method589(i_93_, -18653).method1065((byte) 101) && class92.method589(i_96_, -18653).method1065((byte) 87) && class92.method589(i_94_, -18653).method1065((byte) 91)) {
					Class103 class103 = class92.method589(i_93_, -18653).method1071(0);
					if (class103 != null)
						class103s[i_111_++] = class103;
					class103 = class92.method589(i_96_, -18653).method1071(0);
					if (class103 != null)
						class103s[i_111_++] = class103;
					class103 = class92.method589(i_94_, -18653).method1071(0);
					if (class103 != null)
						class103s[i_111_++] = class103;
					i_110_ |= 0x4000;
					class103 = new Class103(class103s, i_111_);
					class_t = class260.method1695(class103, i_110_, CS2Script.anInt5682, 64, 768);
					for (int i_112_ = 0; i_112_ < 5; i_112_++) {
						if ((((Class27) this).anIntArray373[i_112_] ^ 0xffffffff) > ((Class246_Sub30_Sub1.aShortArrayArray5767[i_112_]).length ^ 0xffffffff))
							class_t.BA(Class160.aShortArray2270[i_112_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_112_][(((Class27) this).anIntArray373[i_112_])]));
						if (((Class27) this).anIntArray373[i_112_] < (Class246_Sub1_Sub2.aShortArrayArray5693[i_112_]).length)
							class_t.BA(Node.aShortArray3466[i_112_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_112_][(((Class27) this).anIntArray373[i_112_])]));
					}
					class_t.UA(i_100_);
					synchronized (Class246_Sub28_Sub14.aClass54_6304) {
						Class246_Sub28_Sub14.aClass54_6304.method371(1, l, class_t);
					}
				} else
					return null;
			}
			if (class124 == null)
				return class_t;
			if (i >= -50)
				anIntArray361 = null;
			class_t = class_t.method678((byte) 4, i_100_, true);
			class_t = class124.method846(i_98_, i_95_, i_97_, i_99_, class_t, -127);
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.D(" + (class124 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + i_93_ + ',' + i_94_ + ',' + (class92 != null ? "{...}" : "null") + ',' + i_95_ + ',' + i_96_ + ',' + i_97_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_98_ + ',' + i_99_ + ')'));
		}
	}

	final void method220(int i, int i_113_, byte i_114_) {
		try {
			((Class27) this).anIntArray373[i] = i_113_;
			anInt368++;
			method216((byte) 116);
			int i_115_ = -66 % ((-30 - i_114_) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.A(" + i + ',' + i_113_ + ',' + i_114_ + ')'));
		}
	}

	public Class27() {
		/* empty */
	}

	static final boolean method221(String string, int i, int i_116_, boolean bool) {
		try {
			anInt374++;
			if (i_116_ < 2 || (i_116_ ^ 0xffffffff) < -37)
				throw new IllegalArgumentException("Invalid radix:" + i_116_);
			boolean bool_117_ = false;
			if (i <= 115)
				anInt379 = 26;
			boolean bool_118_ = false;
			int i_119_ = 0;
			int i_120_ = string.length();
			for (int i_121_ = 0; (i_121_ ^ 0xffffffff) > (i_120_ ^ 0xffffffff); i_121_++) {
				int i_122_ = string.charAt(i_121_);
				if (i_121_ == 0) {
					if (i_122_ == 45) {
						bool_117_ = true;
						continue;
					}
					if (i_122_ == 43 && bool)
						continue;
				}
				if ((i_122_ ^ 0xffffffff) > -49 || i_122_ > 57) {
					if ((i_122_ ^ 0xffffffff) > -66 || (i_122_ ^ 0xffffffff) < -91) {
						if ((i_122_ ^ 0xffffffff) > -98 || (i_122_ ^ 0xffffffff) < -123)
							return false;
						i_122_ -= 87;
					} else
						i_122_ -= 55;
				} else
					i_122_ -= 48;
				if ((i_116_ ^ 0xffffffff) >= (i_122_ ^ 0xffffffff))
					return false;
				if (bool_117_)
					i_122_ = -i_122_;
				int i_123_ = i_119_ * i_116_ - -i_122_;
				if ((i_123_ / i_116_ ^ 0xffffffff) != (i_119_ ^ 0xffffffff))
					return false;
				i_119_ = i_123_;
				bool_118_ = true;
			}
			return bool_118_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.I(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_116_ + ',' + bool + ')'));
		}
	}

	static final void method222(byte i, int i_124_, int i_125_, int i_126_, byte[] is, int i_127_, int i_128_) {
		try {
			anInt366++;
			if ((i_124_ ^ 0xffffffff) < -1 && !Class246_Sub40.method2313(200, i_124_))
				throw new IllegalArgumentException("");
			if (i == 117) {
				if (i_126_ > 0 && !Class246_Sub40.method2313(200, i_126_))
					throw new IllegalArgumentException("");
				int i_129_ = Class4.method56((byte) -11, i_127_);
				int i_130_ = 0;
				int i_131_ = i_126_ <= i_124_ ? i_126_ : i_124_;
				int i_132_ = i_124_ >> 1;
				int i_133_ = i_126_ >> 1;
				byte[] is_134_ = is;
				byte[] is_135_ = new byte[i_129_ * (i_132_ * i_133_)];
				for (;;) {
					OpenGL.glTexImage2Dub(i_128_, i_130_, i_125_, i_124_, i_126_, 0, i_127_, 5121, is_134_, 0);
					if (i_131_ <= 1)
						break;
					int i_136_ = i_129_ * i_124_;
					byte[] is_137_ = is_135_;
					for (int i_138_ = 0; i_129_ > i_138_; i_138_++) {
						int i_139_ = i_138_;
						int i_140_ = i_138_;
						int i_141_ = i_136_ + i_140_;
						for (int i_142_ = 0; (i_142_ ^ 0xffffffff) > (i_133_ ^ 0xffffffff); i_142_++) {
							for (int i_143_ = 0; i_143_ < i_132_; i_143_++) {
								int i_144_ = is_134_[i_140_];
								i_140_ += i_129_;
								i_144_ += is_134_[i_140_];
								i_140_ += i_129_;
								i_144_ += is_134_[i_141_];
								i_141_ += i_129_;
								i_144_ += is_134_[i_141_];
								is_135_[i_139_] = (byte) (i_144_ >> 2);
								i_141_ += i_129_;
								i_139_ += i_129_;
							}
							i_140_ += i_136_;
							i_141_ += i_136_;
						}
					}
					is_135_ = is_134_;
					is_134_ = is_137_;
					i_124_ = i_132_;
					i_126_ = i_133_;
					i_132_ >>= 1;
					i_130_++;
					i_131_ >>= 1;
					i_133_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cj.B(" + i + ',' + i_124_ + ',' + i_125_ + ',' + i_126_ + ',' + (is != null ? "{...}" : "null") + ',' + i_127_ + ',' + i_128_ + ')'));
		}
	}

	static {
		new Class67("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		anInt379 = 0;
	}
}
