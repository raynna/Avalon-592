/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class114 implements Interface7 {
	static int anInt1596;
	static int anInt1597;
	static int anInt1598;
	static int anInt1599;
	static int anInt1600;

	public final String method25(long l, byte i, int[] is, Class81 class81) {
		try {
			anInt1596++;
			if (Class194_Sub2.aClass81_4952 == class81) {
				Class183 class183 = Class246_Sub39.aClass141_5487.method954(is[0], i - 186);
				return class183.method1185(111, (int) l);
			}
			if (i != 85)
				method777(-122, 28);
			if (Class256.aClass81_3675 == class81 || class81 == Class186.aClass81_2636) {
				Class197 class197 = Class255.aClass191_3663.method1251(22883, (int) l);
				return ((Class197) class197).aString2778;
			}
			if (class81 == Class21.aClass81_320 || Class206.aClass81_2898 == class81 || class81 == Class59_Sub5_Sub1.aClass81_5815)
				return Class246_Sub39.aClass141_5487.method954(is[0], i ^ ~0xa).method1185(115, (int) l);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ko.D(" + l + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + (class81 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method777(int i, int i_0_) {
		try {
			if (i_0_ != -1886501846)
				anInt1598 = -116;
			anInt1600++;
			return i >>> 10;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ko.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method778(int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, String string) {
		try {
			anInt1597++;
			Class130_Sub8 class130_sub8 = new Class130_Sub8();
			((Class130_Sub8) class130_sub8).anInt5621 = i;
			if (bool != false)
				method778(-18, -44, -55, -74, false, 16, 0, null);
			((Class130_Sub8) class130_sub8).anInt5617 = i_2_;
			((Class130_Sub8) class130_sub8).anInt5611 = Class246_Sub1_Sub4.anInt5752 - -i_1_;
			((Class130_Sub8) class130_sub8).anInt5619 = i_4_;
			((Class130_Sub8) class130_sub8).aString5608 = string;
			((Class130_Sub8) class130_sub8).anInt5610 = i_3_;
			((Class130_Sub8) class130_sub8).anInt5620 = i_5_;
			Class_o.aClass68_7208.method438(-120, class130_sub8);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ko.B(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class114() {
		/* empty */
	}

	static final Class198 method779(int i, byte i_6_) {
		try {
			if (i_6_ != -117)
				method778(-115, -30, -77, 33, false, -89, 40, null);
			anInt1599++;
			if (i == 0) {
				if ((double) Class79.aFloat1033 == 3.0)
					return Class139.aClass198_1986;
				if ((double) Class79.aFloat1033 == 4.0)
					return Class208.aClass198_2934;
				if ((double) Class79.aFloat1033 == 6.0)
					return Class129.aClass198_1806;
				if ((double) Class79.aFloat1033 >= 8.0)
					return Class246_Sub7_Sub1.aClass198_6080;
			} else if (i != 1) {
				if ((i ^ 0xffffffff) == -3) {
					if ((double) Class79.aFloat1033 == 3.0)
						return Class141.aClass198_2043;
					if ((double) Class79.aFloat1033 == 4.0)
						return Class246_Sub11.aClass198_4099;
					if ((double) Class79.aFloat1033 == 6.0)
						return Class246_Sub8.aClass198_3982;
					if ((double) Class79.aFloat1033 >= 8.0)
						return Class246_Sub14.aClass198_4437;
				}
			} else {
				if ((double) Class79.aFloat1033 == 3.0)
					return Class129.aClass198_1806;
				if ((double) Class79.aFloat1033 == 4.0)
					return Class246_Sub7_Sub1.aClass198_6080;
				if ((double) Class79.aFloat1033 == 6.0)
					return Class141.aClass198_2043;
				if ((double) Class79.aFloat1033 >= 8.0)
					return Class246_Sub11.aClass198_4099;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ko.A(" + i + ',' + i_6_ + ')');
		}
	}

	static {
		new Class67("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
		anInt1598 = 0;
	}
}
