/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class47 {
	private Interface6 anInterface6_677;
	static int anInt678;
	static int anInt679;
	private Class260_Sub2 aClass260_Sub2_680;
	static int anInt681;
	private HashMap aClass54_682 = new HashMap(256);
	static int anInt683;
	static Class258[] aClass258Array684;
	static int anInt685;
	static int anInt686;
	static Class125[] aClass125Array687;
	/* synthetic */ static Class aClass688;

	public static void method314(boolean bool) {
		do {
			try {
				aClass258Array684 = null;
				aClass125Array687 = null;
				if (bool == true)
					break;
				method318(6, -98, -124, -108, null, -45, 29, -114, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ee.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method315(byte i) {
		try {
			anInt685++;
			int i_0_ = 110 / ((35 - i) / 58);
			aClass54_682.method380(5, -50);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ee.D(" + i + ')');
		}
	}

	static final int method316(int i, int i_1_, int i_2_) {
		try {
			if (i_1_ != 2)
				anInt686 = -123;
			anInt678++;
			int i_3_ = 0;
			while (i_2_ > 0) {
				i_3_ = 0x1 & i | i_3_ << 1;
				i_2_--;
				i >>>= 1;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ee.C(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method317(boolean bool) {
		if (bool) {
			Class106.aClass147ArrayArrayArray1494 = Class1.aClass147ArrayArrayArray4;
			Class59_Sub3_Sub4.aClass210Array6993 = Class154.aClass210Array2215;
		} else {
			Class106.aClass147ArrayArrayArray1494 = Class115.aClass147ArrayArrayArray1605;
			Class59_Sub3_Sub4.aClass210Array6993 = Class246_Sub28_Sub3.aClass210Array5899;
		}
		Class154_Sub1.anInt4803 = Class106.aClass147ArrayArrayArray1494.length;
	}

	static final void method318(int i, int i_4_, int i_5_, int i_6_, Class260 class260, int i_7_, int i_8_, int i_9_, int i_10_) {
		do {
			try {
				anInt681++;
				Class_f class_f = (Class_f) Class246_Sub22.method2082(i, i_7_, i_5_);
				if (class_f != null) {
					Class185 class185 = Class143.aClass251_2067.method1610(class_f.method21(true), 0);
					int i_11_ = 0x3 & class_f.method18((byte) -70);
					int i_12_ = class_f.method24(-36);
					if (((Class185) class185).anInt2572 == -1) {
						int i_13_ = i_4_;
						if ((((Class185) class185).anInt2590 ^ 0xffffffff) < -1)
							i_13_ = i_10_;
						if (i_12_ == 0 || (i_12_ ^ 0xffffffff) == -3) {
							if (i_11_ != 0) {
								if (i_11_ != 1) {
									if (i_11_ == 2)
										class260.method1681(0, i_6_, 4, 3 + i_8_, i_13_);
									else if ((i_11_ ^ 0xffffffff) == -4)
										class260.method1697(4, -125, 3 + i_6_, i_8_, i_13_);
								} else
									class260.method1697(4, i_9_ - 17931, i_6_, i_8_, i_13_);
							} else
								class260.method1681(0, i_6_, 4, i_8_, i_13_);
						}
						if (i_12_ == 3) {
							if ((i_11_ ^ 0xffffffff) != -1) {
								if (i_11_ != 1) {
									if (i_11_ == 2)
										class260.method1734(3 + i_8_, 1, i_6_ + 3, (byte) 58, i_13_, 1);
									else if ((i_11_ ^ 0xffffffff) == -4)
										class260.method1734(i_8_, 1, 3 + i_6_, (byte) 58, i_13_, 1);
								} else
									class260.method1734(i_8_ + 3, 1, i_6_, (byte) 58, i_13_, 1);
							} else
								class260.method1734(i_8_, 1, i_6_, (byte) 58, i_13_, 1);
						}
						if (i_12_ == 2) {
							if (i_11_ == 0)
								class260.method1697(4, i_9_ - 17931, i_6_, i_8_, i_13_);
							else if (i_11_ != 1) {
								if (i_11_ != 2) {
									if (i_11_ == 3)
										class260.method1681(0, i_6_, 4, i_8_, i_13_);
								} else
									class260.method1697(4, -127, 3 + i_6_, i_8_, i_13_);
							} else
								class260.method1681(0, i_6_, 4, i_8_ + 3, i_13_);
						}
					} else
						Class161.method1066(class260, i_11_, i_9_ ^ 0x45e3, class185, i_6_, i_8_);
				}
				class_f = ((Class_f) Class17.method168(i, i_7_, i_5_, (aClass688 != null ? aClass688 : (aClass688 = getClassByName("Class_f")))));
				if (class_f != null) {
					Class185 class185 = Class143.aClass251_2067.method1610(class_f.method21(true), 0);
					int i_14_ = class_f.method18((byte) -70) & 0x3;
					int i_15_ = class_f.method24(-46);
					if ((((Class185) class185).anInt2572 ^ 0xffffffff) == 0) {
						if (i_15_ == 9) {
							int i_16_ = -1118482;
							if (((Class185) class185).anInt2590 > 0)
								i_16_ = -1179648;
							if (i_14_ != 0 && i_14_ != 2)
								class260.method1737(i_6_, i_16_, i_8_, 3 + i_6_, i_8_ + 3, 4);
							else
								class260.method1737(i_6_ + 3, i_16_, i_8_, i_6_, 3 + i_8_, 4);
						}
					} else
						Class161.method1066(class260, i_14_, 116, class185, i_6_, i_8_);
				}
				class_f = (Class_f) Class246_Sub14.method1997(i, i_7_, i_5_);
				if (class_f != null) {
					Class185 class185 = (Class143.aClass251_2067.method1610(class_f.method21(true), i_9_ ^ 0x458d));
					int i_17_ = 0x3 & class_f.method18((byte) -70);
					if (((Class185) class185).anInt2572 != -1)
						Class161.method1066(class260, i_17_, 120, class185, i_6_, i_8_);
				}
				if (i_9_ == 17805)
					break;
				method318(-52, -91, 95, 17, null, -122, -81, 60, 20);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ee.A(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	final Class109_Sub1 method319(int i, int i_18_) {
		try {
			anInt679++;
			if (i_18_ >= -127)
				return null;
			Object object = aClass54_682.method379((long) i, (byte) 58);
			if (object != null)
				return (Class109_Sub1) object;
			if (!anInterface6_677.method13(i, 19378))
				return null;
			Class238 class238 = anInterface6_677.method17(-31305, i);
			int i_19_ = (((Class238) class238).aBool3335 ? 64 : ((Class260_Sub2) aClass260_Sub2_680).f_ce);
			Class109_Sub1 class109_sub1;
			if (((Class238) class238).aBool3337 && aClass260_Sub2_680.method1742()) {
				float[] fs = anInterface6_677.method15(0.7F, i, i_19_, false, i_19_, 15752);
				class109_sub1 = new Class109_Sub1(aClass260_Sub2_680, 3553, 34842, i_19_, i_19_, ((Class238) class238).aByte3349 != 0, fs, 6408);
			} else {
				int[] is;
				int i_20_;
				if (((Class238) class238).aBool3340 && Class118.method809(((Class238) class238).aByte3343, -6)) {
					is = anInterface6_677.method14(false, 5754, i, 0.7F, i_19_, i_19_);
					i_20_ = 6407;
				} else {
					is = anInterface6_677.method16(false, i, false, 0.7F, i_19_, i_19_);
					i_20_ = 6408;
				}
				class109_sub1 = new Class109_Sub1(aClass260_Sub2_680, 3553, i_20_, i_19_, i_19_, (((Class238) class238).aByte3349 ^ 0xffffffff) != -1, is, false);
			}
			class109_sub1.method1767(10497, ((Class238) class238).aBool3352, ((Class238) class238).aBool3353);
			aClass54_682.method371(1, (long) i, class109_sub1);
			return class109_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ee.E(" + i + ',' + i_18_ + ')');
		}
	}

	final void method320(int i) {
		do {
			try {
				aClass54_682.method369(false);
				anInt683++;
				if (i == 4)
					break;
				aClass260_Sub2_680 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ee.F(" + i + ')');
			}
			break;
		} while (false);
	}

	Class47(Class260_Sub2 class260_sub2, Interface6 interface6) {
		try {
			anInterface6_677 = interface6;
			aClass260_Sub2_680 = class260_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ee.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		new Class67("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...", "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
		aClass258Array684 = new Class258[50];
		aClass125Array687 = new Class125[ClientLoader.MAX_INDEX_COUNT];
	}
}
