/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class112 {
	static int anInt1577;
	boolean aBool1578;
	short aShort1579;
	short aShort1580;
	static IncomingPacket REMOVE_GROUND_ITEMS_PACKET = new IncomingPacket(43, 3);
	static int anInt1582;
	short aShort1583;
	byte aByte1584;
	static int anInt1585;
	int anInt1586;
	static Class169 aClass169_1587;
	static int anInt1588;
	static int[] anIntArray1589 = new int[13];
	byte aByte1590;

	final Class112 method769(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = 53 / ((i_1_ - 36) / 50);
			anInt1582++;
			return new Class112(i_0_, i_3_, i_2_, i, ((Class112) this).aShort1580, ((Class112) this).aShort1579, ((Class112) this).aShort1583, ((Class112) this).aByte1590, ((Class112) this).aByte1584, ((Class112) this).aBool1578);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("km.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final int method770(Class246_Sub35 class246_sub35, int i) {
		try {
			if (i != 3)
				method770(null, 49);
			anInt1585++;
			String string = Class246_Sub41_Sub2.method2678(-96, class246_sub35);
			int[] is = null;
			if (Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), 0))
				is = ((Class197) (Class255.aClass191_3663.method1251(22883, (int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
			else if ((((Class246_Sub35) class246_sub35).anInt5148 ^ 0xffffffff) == 0) {
				if (!Class246_Sub28_Sub27.method2767((((Class246_Sub35) class246_sub35).anInt5156), (byte) -112)) {
					if (Class57.method390(-110, (((Class246_Sub35) class246_sub35).anInt5156))) {
						Object object = null;
						Class185 class185;
						if (((Class246_Sub35) class246_sub35).anInt5156 == 1010)
							class185 = (Class143.aClass251_2067.method1610((int) (((Class246_Sub35) class246_sub35).aLong5157), 0));
						else
							class185 = (Class143.aClass251_2067.method1610((int) (0x7fffffffL & (((Class246_Sub35) class246_sub35).aLong5157) >>> 32), 0));
						if (((Class185) class185).f_bb != null)
							class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) -29);
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
				is = (((Class197) Class255.aClass191_3663.method1251(22883, (((Class246_Sub35) class246_sub35).anInt5148))).anIntArray2772);
			if (is != null)
				string += Class247.method1581(is, 124);
			int i_5_ = Class_fs.aClass73_148.method461(string, i ^ 0x78, (Class106_Sub2.aClass_lArray5340));
			if (((Class246_Sub35) class246_sub35).aBool5147)
				i_5_ += 4 + Class246_Sub28_Sub32.aClass_l6928.la();
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "km.B(" + (class246_sub35 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final boolean method771(char c, boolean bool) {
		try {
			anInt1577++;
			if (Character.isISOControl(c))
				return false;
			if (Class246_Sub1_Sub13.method2700(-107, c))
				return true;
			char[] cs = Class246_Sub1_Sub5.aCharArray5831;
			for (int i = 0; (cs.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				int i_6_ = cs[i];
				if ((i_6_ ^ 0xffffffff) == (c ^ 0xffffffff))
					return true;
			}
			char[] cs_7_ = Class248.aCharArray3489;
			for (int i = 0; (i ^ 0xffffffff) > (cs_7_.length ^ 0xffffffff); i++) {
				int i_8_ = cs_7_[i];
				if (i_8_ == c)
					return true;
			}
			if (bool != false)
				anInt1588 = -102;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "km.C(" + c + ',' + bool + ')');
		}
	}

	public static void method772(int i) {
		try {
			aClass169_1587 = null;
			anIntArray1589 = null;
			if (i != -10933)
				anIntArray1589 = null;
			REMOVE_GROUND_ITEMS_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "km.D(" + i + ')');
		}
	}

	Class112(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
		try {
			((Class112) this).aByte1584 = (byte) i_16_;
			((Class112) this).aShort1579 = (short) i_13_;
			((Class112) this).aByte1590 = (byte) i_15_;
			((Class112) this).anInt1586 = i;
			((Class112) this).aShort1580 = (short) i_12_;
			((Class112) this).aBool1578 = bool;
			((Class112) this).aShort1583 = (short) i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("km.<init>(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + bool + ')'));
		}
	}

	static {
		aClass169_1587 = new Class169("", 13);
	}
}
