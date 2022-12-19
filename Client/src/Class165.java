/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165 {
	static int anInt2326;
	Class_fs aClass_fs2327;
	static int anInt2328;
	private Class_fs aClass_fs2329;
	static int anInt2330;
	private HashMap aClass54_2331 = new HashMap(128);
	static int anInt2332;
	static int anInt2333;
	static int anInt2334;
	static int anInt2335 = 0;
	static int anInt2336;
	HashMap aClass54_2337 = new HashMap(64);
	static IncomingPacket aClass13_2338 = new IncomingPacket(105, -2);
	static float aFloat2339;
	static int anInt2340 = -1;
	static int anInt2341;
	static int anInt2342;

	static final void method1087(int i) {
		try {
			Class33.aClass260_444.B((0.7F + 0.1F * (float) (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt583)) * 1.1523438F);
			anInt2336++;
			Class33.aClass260_444.T(Class37.anInt547, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
			if (i <= -97) {
				Class33.aClass260_444.UA(Class40_Sub6.anInt5099, -1, 256);
				Class33.aClass260_444.method1729(Class142.aClass211_2064);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.H(" + i + ')');
		}
	}

	final Class140 method1088(int i, byte i_0_) {
		try {
			if (i_0_ != -41)
				return null;
			anInt2328++;
			Class140 class140;
			synchronized (aClass54_2331) {
				class140 = (Class140) aClass54_2331.method379((long) i, (byte) 58);
			}
			if (class140 != null)
				return class140;
			byte[] is = aClass_fs2329.method91(i, 36, i_0_ + 164);
			class140 = new Class140();
			((Class140) class140).anInt2006 = i;
			((Class140) class140).aClass165_2009 = this;
			if (is != null)
				class140.method948(new BufferStream(is), i_0_ ^ ~0x3a);
			class140.method945((byte) 45);
			synchronized (aClass54_2331) {
				aClass54_2331.method371(1, (long) i, class140);
			}
			return class140;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1089(int i, byte[] is, boolean bool, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt2342++;
				if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					i_3_ += i_2_;
					i = i_1_ - i_2_ >> 2;
					while ((--i ^ 0xffffffff) <= -1) {
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
						is[i_3_++] = (byte) 1;
					}
					i = 0x3 & i_1_ + -i_2_;
					while ((--i ^ 0xffffffff) <= -1)
						is[i_3_++] = (byte) 1;
					if (bool == true)
						break;
					anInt2335 = 54;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pj.B(" + i + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1090(byte i) {
		do {
			try {
				aClass13_2338 = null;
				if (i == -16)
					break;
				aClass13_2338 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pj.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1091(int i) {
		try {
			synchronized (aClass54_2331) {
				aClass54_2331.method369(false);
			}
			anInt2334++;
			if (i <= -84) {
				synchronized (((Class165) this).aClass54_2337) {
					((Class165) this).aClass54_2337.method369(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.I(" + i + ')');
		}
	}

	final void method1092(int i, byte i_4_) {
		try {
			anInt2326++;
			synchronized (aClass54_2331) {
				aClass54_2331.method380(i, -50);
			}
			synchronized (((Class165) this).aClass54_2337) {
				((Class165) this).aClass54_2337.method380(i, -50);
			}
			if (i_4_ <= 42)
				method1092(-29, (byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.G(" + i + ',' + i_4_ + ')');
		}
	}

	static final void method1093(Class260 class260, int i) {
		try {
			anInt2332++;
			int i_5_ = IntegerNode.anInt5082;
			int i_6_ = Class93.anInt1226;
			int i_7_ = Class94.anInt1233;
			int i_8_ = Class246_Sub13.anInt4419 - 3;
			int i_9_ = 20;
			if (Class246_Sub1_Sub3.aClass_l5707 == null || Class246_Sub41.aClass_l5535 == null) {
				if (!Class210_Sub2.index8.method112(-1, Class105.anInt1469) || !Class210_Sub2.index8.method112(i - 4, Class40_Sub9.anInt5511))
					class260.O(i_5_, i_6_, i_7_, i_9_, (Class241.anInt3400 | 255 + -Class_ss.anInt7054 << 24), 1);
				else {
					Class246_Sub1_Sub3.aClass_l5707 = (class260.method1749(Class10.method120(Class210_Sub2.index8, Class105.anInt1469, 0), true));
					Class10 class10 = Class10.method120(Class210_Sub2.index8, Class40_Sub9.anInt5511, 0);
					Class246_Sub41.aClass_l5535 = class260.method1749(class10, true);
					class10.method118();
					Class160.aClass_l2266 = class260.method1749(class10, true);
				}
			}
			if (Class246_Sub1_Sub3.aClass_l5707 != null && Class246_Sub41.aClass_l5535 != null) {
				int i_10_ = ((-(Class246_Sub41.aClass_l5535.la() * 2) + i_7_) / Class246_Sub1_Sub3.aClass_l5707.la());
				for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
					Class246_Sub1_Sub3.aClass_l5707.method729((i_5_ + Class246_Sub41.aClass_l5535.la() + Class246_Sub1_Sub3.aClass_l5707.la() * i_11_), i_6_);
				Class246_Sub41.aClass_l5535.method729(i_5_, i_6_);
				Class160.aClass_l2266.method729(i_5_ + i_7_ - Class160.aClass_l2266.la(), i_6_);
			}
			Class79_Sub1.aClass116_5162.method794(-1, Class130_Sub3.anInt4418 | ~0xffffff, Class219.aClass67_3039.method436(true, Class_j.anInt1485), 14 + i_6_, i + i_5_, 0);
			class260.O(i_5_, i_9_ + i_6_, i_7_, i_8_ - i_9_, Class241.anInt3400 | 255 - Class_ss.anInt7054 << 24, 1);
			int i_12_ = Class238.aClass102_3360.method640((byte) 58);
			int i_13_ = Class238.aClass102_3360.method636(3045);
			int i_14_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(i + 46)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
				int i_15_ = ((-i_14_ + (-1 + Class230.anInt3147)) * 16 + 13 + (i_9_ + i_6_));
				i_14_++;
				if ((i_5_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff) && (i_5_ + i_7_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff) && (-13 + i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff) && i_13_ < 4 + i_15_ && ((Class246_Sub35) class246_sub35).aBool5153)
					class260.O(i_5_, i_15_ - 12, i_7_, 16, (255 - Class68.anInt905 << 24 | Class81.anInt1069), 1);
			}
			if ((Class246_Sub28_Sub23.aClass_l6656 == null || Class205.aClass_l2885 == null || Class76.aClass_l993 == null) && Class210_Sub2.index8.method112(-1, Class246_Sub1_Sub16.anInt6697) && Class210_Sub2.index8.method112(-1, Class246_Sub28_Sub14.anInt6306) && Class210_Sub2.index8.method112(-1, Class255.anInt3662)) {
				Class10 class10 = Class10.method120(Class210_Sub2.index8, Class246_Sub28_Sub14.anInt6306, 0);
				Class205.aClass_l2885 = class260.method1749(class10, true);
				class10.method118();
				Class246_Sub37_Sub1.aClass_l5943 = class260.method1749(class10, true);
				Class246_Sub28_Sub23.aClass_l6656 = (class260.method1749(Class10.method120(Class210_Sub2.index8, Class246_Sub1_Sub16.anInt6697, 0), true));
				Class10 class10_16_ = Class10.method120(Class210_Sub2.index8, Class255.anInt3662, 0);
				Class76.aClass_l993 = class260.method1749(class10_16_, true);
				class10_16_.method118();
				Class69.aClass_l907 = class260.method1749(class10_16_, true);
			}
			if (Class246_Sub28_Sub23.aClass_l6656 != null && Class205.aClass_l2885 != null && Class76.aClass_l993 != null) {
				int i_17_ = ((-(Class76.aClass_l993.la() * 2) + i_7_) / Class246_Sub28_Sub23.aClass_l6656.la());
				for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
					Class246_Sub28_Sub23.aClass_l6656.method729((Class76.aClass_l993.la() + i_5_ - -(i_18_ * Class246_Sub28_Sub23.aClass_l6656.la())), i_8_ + (i_6_ + -Class246_Sub28_Sub23.aClass_l6656.ma()));
				int i_19_ = ((-Class76.aClass_l993.ma() + (-i_9_ + i_8_)) / Class205.aClass_l2885.ma());
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
					Class205.aClass_l2885.method729(i_5_, (i_9_ + i_6_ - -(Class205.aClass_l2885.ma() * i_20_)));
					Class246_Sub37_Sub1.aClass_l5943.method729(-Class246_Sub37_Sub1.aClass_l5943.la() + (i_7_ + i_5_), i_6_ - (-i_9_ + -(Class205.aClass_l2885.ma() * i_20_)));
				}
				Class76.aClass_l993.method729(i_5_, i_8_ + i_6_ - Class76.aClass_l993.ma());
				Class69.aClass_l907.method729(i_7_ + (i_5_ + -Class76.aClass_l993.la()), i_6_ + (i_8_ - Class76.aClass_l993.ma()));
			}
			i_14_ = 0;
			for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(i + 76)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
				int i_21_ = (i_6_ + i_9_ + (13 + (-1 + (Class230.anInt3147 + -i_14_)) * 16));
				int i_22_ = ~0xffffff | Class130_Sub3.anInt4418;
				if (i_5_ < i_12_ && (i_7_ + i_5_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff) && (i_13_ ^ 0xffffffff) < (i_21_ - 13 ^ 0xffffffff) && 4 + i_21_ > i_13_ && ((Class246_Sub35) class246_sub35).aBool5153)
					i_22_ = ~0xffffff | Class155.anInt2227;
				int[] is = null;
				if (Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), i ^ 0x3))
					is = ((Class197) (Class255.aClass191_3663.method1251(22883, (int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
				else if ((((Class246_Sub35) class246_sub35).anInt5148 ^ 0xffffffff) == 0) {
					if (!Class246_Sub28_Sub27.method2767((((Class246_Sub35) class246_sub35).anInt5156), (byte) 78)) {
						if (Class57.method390(i ^ ~0x79, ((Class246_Sub35) class246_sub35).anInt5156)) {
							Object object = null;
							Class185 class185;
							if (((Class246_Sub35) class246_sub35).anInt5156 != 1010)
								class185 = (Class143.aClass251_2067.method1610((int) (0x7fffffffL & (((Class246_Sub35) class246_sub35).aLong5157) >>> 32), 0));
							else
								class185 = (Class143.aClass251_2067.method1610((int) ((Class246_Sub35) class246_sub35).aLong5157, 0));
							if (((Class185) class185).f_bb != null)
								class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) 115);
							if (class185 != null)
								is = ((Class185) class185).f_nb;
						}
					} else {
						Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[(int) (((Class246_Sub35) class246_sub35).aLong5157)]);
						if (class_r_sub2 != null) {
							Class253 class253 = ((Npc) class_r_sub2).aClass253_7184;
							if (((Class253) class253).anIntArray3594 != null)
								class253 = class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658));
							if (class253 != null)
								is = ((Class253) class253).f_ob;
						}
					}
				} else
					is = ((Class197) (Class255.aClass191_3663.method1251(22883, (((Class246_Sub35) class246_sub35).anInt5148)))).anIntArray2772;
				String string = Class246_Sub41_Sub2.method2678(-104, class246_sub35);
				if (is != null)
					string += Class247.method1581(is, 124);
				Class79_Sub1.aClass116_5162.method793((byte) -101, Class21_Sub4.anIntArray4924, 0, Class106_Sub2.aClass_lArray5340, i_22_, string, i_5_ + 3, i_21_);
				i_14_++;
				if (((Class246_Sub35) class246_sub35).aBool5147)
					Class246_Sub28_Sub32.aClass_l6928.method729((Class_fs.aClass73_148.method459(-1, string) + 5 + i_5_), -12 + i_21_);
			}
			Class225.method1449(Class94.anInt1233, Class246_Sub13.anInt4419, Class93.anInt1226, 0, IntegerNode.anInt5082);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1094(String string, int i) {
		do {
			try {
				anInt2333++;
				if (Class187.aBool2653) {
					boolean bool = false;
					if (i >= -95)
						method1087(33);
					int i_23_ = Class246_Sub4.anInt3869;
					int[] is = Class53.anIntArray755;
					for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
						Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[is[i_24_]];
						if (class_r_sub1 != null && Class_a.aClass_r_Sub1_1180 != class_r_sub1 && (((Player) class_r_sub1).aString7140 != null) && ((Player) class_r_sub1).aString7140.equalsIgnoreCase(string)) {
							Class243.writePacket(-76, (Class246_Sub19_Sub2.aClass201_6811));
							Class56.anInt794++;
							Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
							Class130_Sub1.stream.writeShortLE128((byte) -73, is[i_24_]);
							Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
							Class130_Sub1.stream.writeShort((byte) 67, Class_b.anInt1161);
							Class130_Sub1.stream.method2358((byte) 23, 0);
							Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 115);
							bool = true;
							break;
						}
					}
					if (!bool)
						Class_v.method692((byte) -99, Class246_Sub10.aClass67_4079.method436(true, Class_j.anInt1485) + string);
					if (!Class187.aBool2653)
						break;
					Class59_Sub4.method2209((byte) 104);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pj.D(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1095(int i, boolean bool, int i_25_) {
		do {
			try {
				aClass54_2331 = new HashMap(i_25_);
				anInt2341++;
				((Class165) this).aClass54_2337 = new HashMap(i);
				if (bool == false)
					break;
				((Class165) this).aClass_fs2327 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pj.J(" + i + ',' + bool + ',' + i_25_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1096(int i) {
		try {
			synchronized (aClass54_2331) {
				aClass54_2331.method383(i ^ 0x677e);
			}
			if (i != 26406)
				method1088(-61, (byte) 61);
			anInt2330++;
			synchronized (((Class165) this).aClass54_2337) {
				((Class165) this).aClass54_2337.method383(i - 26298);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pj.E(" + i + ')');
		}
	}

	Class165(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_26_) {
		try {
			aClass_fs2329 = class_fs;
			((Class165) this).aClass_fs2327 = class_fs_26_;
			aClass_fs2329.method95(36, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pj.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_26_ != null ? "{...}" : "null") + ')'));
		}
	}
}
