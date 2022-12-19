
/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.util.Calendar;
import java.util.Date;

final class Class146 {
	private static int[] anIntArray2114;
	static int anInt2115;
	static int anInt2116;
	static int anInt2117;
	static int anInt2118;
	static int anInt2119;
	private static Class244 aClass244_2120;
	static int anInt2121;
	private static int[] anIntArray2122;
	private static Class235 aClass235_2123;
	static int anInt2124;
	private static String[] aStringArray2125;
	private static int anInt2126 = 0;
	private static int[][] anIntArrayArray2127;
	static int anInt2128;
	static int anInt2129;
	private static int anInt2130;
	static int anInt2131;
	private static Calendar aCalendar2132;
	private static Class_b[] aClass_bArray2133;
	private static Class235 aClass235_2134;
	static int anInt2135;
	private static int[] anIntArray2136;
	private static int anInt2137;
	private static String[] aStringArray2138;
	static HashMap aClass54_2139;
	private static int[] anIntArray2140;
	private static String[] aStringArray2141;
	private static int anInt2142;

	private static final void method980(Class246_Sub29 class246_sub29, int i) {
		Object[] objects = ((Class246_Sub29) class246_sub29).anObjectArray4977;
		int i_0_ = ((Integer) objects[0]).intValue();
		CS2Script class246_sub1_sub1 = Class113.getScript(i_0_, 88);
		if (class246_sub1_sub1 != null) {
			anIntArray2114 = new int[((CS2Script) class246_sub1_sub1).integerVariableCount];
			int i_1_ = 0;
			aStringArray2138 = (new String[((CS2Script) class246_sub1_sub1).stringVariableCount]);
			int i_2_ = 0;
			for (int i_3_ = 1; i_3_ < objects.length; i_3_++) {
				if (objects[i_3_] instanceof Integer) {
					int i_4_ = ((Integer) objects[i_3_]).intValue();
					if (i_4_ == -2147483647)
						i_4_ = ((Class246_Sub29) class246_sub29).anInt4979;
					if (i_4_ == -2147483646)
						i_4_ = ((Class246_Sub29) class246_sub29).anInt4975;
					if (i_4_ == -2147483645)
						i_4_ = ((((Class246_Sub29) class246_sub29).aClass235_4974) != null ? ((Class235) (((Class246_Sub29) class246_sub29).aClass235_4974)).anInt3248 : -1);
					if (i_4_ == -2147483644)
						i_4_ = ((Class246_Sub29) class246_sub29).anInt4972;
					if (i_4_ == -2147483643)
						i_4_ = ((((Class246_Sub29) class246_sub29).aClass235_4974) != null ? ((Class235) (((Class246_Sub29) class246_sub29).aClass235_4974)).f_pd : -1);
					if (i_4_ == -2147483642)
						i_4_ = ((((Class246_Sub29) class246_sub29).aClass235_4969) != null ? ((Class235) (((Class246_Sub29) class246_sub29).aClass235_4969)).anInt3248 : -1);
					if (i_4_ == -2147483641)
						i_4_ = ((((Class246_Sub29) class246_sub29).aClass235_4969) != null ? ((Class235) (((Class246_Sub29) class246_sub29).aClass235_4969)).f_pd : -1);
					if (i_4_ == -2147483640)
						i_4_ = ((Class246_Sub29) class246_sub29).anInt4978;
					if (i_4_ == -2147483639)
						i_4_ = ((Class246_Sub29) class246_sub29).anInt4973;
					anIntArray2114[i_1_++] = i_4_;
				} else if (objects[i_3_] instanceof String) {
					String string = (String) objects[i_3_];
					if (string.equals("event_opbase"))
						string = ((Class246_Sub29) class246_sub29).aString4965;
					aStringArray2138[i_2_++] = string;
				}
			}
			anInt2142 = ((Class246_Sub29) class246_sub29).anInt4971;
			method990(class246_sub1_sub1, i);
		}
	}

	private static final String method981(int i) {
		long l = ((long) i + 11745L) * 86400000L;
		aCalendar2132.setTime(new Date(l));
		int i_5_ = aCalendar2132.get(5);
		int i_6_ = aCalendar2132.get(2);
		int i_7_ = aCalendar2132.get(1);
		return (String.valueOf(i_5_) + "-" + aStringArray2141[i_6_] + "-" + i_7_);
	}

	private static final void method982(int i, boolean bool) {
		if (i < 300) {
			if (i == 100) {
				anInt2130 -= 3;
				int i_8_ = anIntArray2122[anInt2130];
				int i_9_ = anIntArray2122[anInt2130 + 1];
				int i_10_ = anIntArray2122[anInt2130 + 2];
				if (i_9_ == 0)
					throw new RuntimeException();
				Class235 class235 = Class220.method1423(0, i_8_);
				if (((Class235) class235).f_ad == null)
					((Class235) class235).f_ad = new Class235[i_10_ + 1];
				if (((Class235) class235).f_ad.length <= i_10_) {
					Class235[] class235s = new Class235[i_10_ + 1];
					for (int i_11_ = 0; i_11_ < ((Class235) class235).f_ad.length; i_11_++)
						class235s[i_11_] = ((Class235) class235).f_ad[i_11_];
					((Class235) class235).f_ad = class235s;
				}
				if (i_10_ > 0 && ((Class235) class235).f_ad[i_10_ - 1] == null)
					throw new RuntimeException("Gap at:" + (i_10_ - 1));
				Class235 class235_12_ = new Class235();
				((Class235) class235_12_).f_vc = i_9_;
				((Class235) class235_12_).anInt3293 = ((Class235) class235_12_).anInt3248 = ((Class235) class235).anInt3248;
				((Class235) class235_12_).f_pd = i_10_;
				((Class235) class235).f_ad[i_10_] = class235_12_;
				if (bool)
					aClass235_2134 = class235_12_;
				else
					aClass235_2123 = class235_12_;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 101) {
				Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
				if (((Class235) class235).f_pd == -1) {
					if (bool)
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				Class235 class235_13_ = Class220.method1423(0, ((Class235) class235).anInt3248);
				((Class235) class235_13_).f_ad[((Class235) class235).f_pd] = null;
				Stream_Sub1.method2483(class235_13_, (byte) -109);
				return;
			}
			if (i == 102) {
				Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
				((Class235) class235).f_ad = null;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 200) {
				anInt2130 -= 2;
				int i_14_ = anIntArray2122[anInt2130];
				int i_15_ = anIntArray2122[anInt2130 + 1];
				Class235 class235 = Class211.method1390(i_14_, i_15_, (byte) 127);
				if (class235 != null && i_15_ != -1) {
					anIntArray2122[anInt2130++] = 1;
					if (bool)
						aClass235_2134 = class235;
					else
						aClass235_2123 = class235;
				} else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 201) {
				int i_16_ = anIntArray2122[--anInt2130];
				Class235 class235 = Class220.method1423(0, i_16_);
				if (class235 != null) {
					anIntArray2122[anInt2130++] = 1;
					if (bool)
						aClass235_2134 = class235;
					else
						aClass235_2123 = class235;
				} else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 202) {
				int i_17_ = anIntArray2122[--anInt2130];
				method983(i_17_);
				return;
			}
			if (i == 203) {
				int i_18_ = anIntArray2122[--anInt2130];
				method984(i_18_);
				return;
			}
		} else if (i < 500) {
			if (i == 403) {
				anInt2130 -= 2;
				int i_19_ = anIntArray2122[anInt2130];
				int i_20_ = anIntArray2122[anInt2130 + 1];
				for (int i_21_ = 0; i_21_ < HashMap.anIntArray779.length; i_21_++) {
					if (HashMap.anIntArray779[i_21_] == i_19_) {
						((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131.method214(i_20_, Class238.aClass92_3358, i_21_, 108);
						return;
					}
				}
				for (int i_22_ = 0; i_22_ < Class93.anIntArray1227.length; i_22_++) {
					if (Class93.anIntArray1227[i_22_] == i_19_) {
						((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131.method214(i_20_, Class238.aClass92_3358, i_22_, 111);
						break;
					}
				}
				return;
			}
			if (i == 404) {
				anInt2130 -= 2;
				int i_23_ = anIntArray2122[anInt2130];
				int i_24_ = anIntArray2122[anInt2130 + 1];
				((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131.method220(i_23_, i_24_, (byte) 27);
				return;
			}
			if (i == 410) {
				boolean bool_25_ = anIntArray2122[--anInt2130] != 0;
				((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131.method213(bool_25_, 15366);
				return;
			}
		} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
			Class235 class235;
			if (i >= 2000) {
				i -= 1000;
				class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
			} else
				class235 = bool ? aClass235_2134 : aClass235_2123;
			if (i == 1000) {
				anInt2130 -= 4;
				((Class235) class235).f_rb = anIntArray2122[anInt2130];
				((Class235) class235).f_vb = anIntArray2122[anInt2130 + 1];
				int i_26_ = anIntArray2122[anInt2130 + 2];
				if (i_26_ < 0)
					i_26_ = 0;
				else if (i_26_ > 5)
					i_26_ = 5;
				int i_27_ = anIntArray2122[anInt2130 + 3];
				if (i_27_ < 0)
					i_27_ = 0;
				else if (i_27_ > 5)
					i_27_ = 5;
				((Class235) class235).f_cb = (byte) i_26_;
				((Class235) class235).aByte3296 = (byte) i_27_;
				Stream_Sub1.method2483(class235, (byte) -109);
				Class246_Sub12.method1981(class235, 0);
				if (((Class235) class235).f_pd == -1)
					Class194_Sub2.method2145(((Class235) class235).anInt3248, false);
				return;
			}
			if (i == 1001) {
				anInt2130 -= 4;
				((Class235) class235).anInt3258 = anIntArray2122[anInt2130];
				((Class235) class235).f_mb = anIntArray2122[anInt2130 + 1];
				((Class235) class235).anInt3265 = 0;
				((Class235) class235).anInt3237 = 0;
				int i_28_ = anIntArray2122[anInt2130 + 2];
				if (i_28_ < 0)
					i_28_ = 0;
				else if (i_28_ > 4)
					i_28_ = 4;
				int i_29_ = anIntArray2122[anInt2130 + 3];
				if (i_29_ < 0)
					i_29_ = 0;
				else if (i_29_ > 4)
					i_29_ = 4;
				((Class235) class235).f_ob = (byte) i_28_;
				((Class235) class235).aByte3223 = (byte) i_29_;
				Stream_Sub1.method2483(class235, (byte) -109);
				Class246_Sub12.method1981(class235, 0);
				if (((Class235) class235).f_vc == 0)
					Class259_Sub3_Sub1.method2844(class235, -1, false);
				return;
			}
			if (i == 1003) {
				boolean bool_30_ = anIntArray2122[--anInt2130] == 1;
				if (((Class235) class235).f_ic != bool_30_) {
					((Class235) class235).f_ic = bool_30_;
					Stream_Sub1.method2483(class235, (byte) -109);
				}
				if (((Class235) class235).f_pd == -1)
					Class29.method228(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1004) {
				anInt2130 -= 2;
				((Class235) class235).anInt3200 = anIntArray2122[anInt2130];
				((Class235) class235).f_cd = anIntArray2122[anInt2130 + 1];
				Stream_Sub1.method2483(class235, (byte) -109);
				Class246_Sub12.method1981(class235, 0);
				if (((Class235) class235).f_vc == 0)
					Class259_Sub3_Sub1.method2844(class235, -1, false);
				return;
			}
			if (i == 1005) {
				((Class235) class235).aBool3290 = anIntArray2122[--anInt2130] == 1;
				return;
			}
		} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
			Class235 class235;
			if (i >= 2000) {
				i -= 1000;
				class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
			} else
				class235 = bool ? aClass235_2134 : aClass235_2123;
			if (i == 1100) {
				anInt2130 -= 2;
				((Class235) class235).anInt3270 = anIntArray2122[anInt2130];
				if (((Class235) class235).anInt3270 > (((Class235) class235).anInt3264 - ((Class235) class235).f_fc))
					((Class235) class235).anInt3270 = (((Class235) class235).anInt3264 - ((Class235) class235).f_fc);
				if (((Class235) class235).anInt3270 < 0)
					((Class235) class235).anInt3270 = 0;
				((Class235) class235).anInt3292 = anIntArray2122[anInt2130 + 1];
				if (((Class235) class235).anInt3292 > (((Class235) class235).anInt3276 - ((Class235) class235).f_sb))
					((Class235) class235).anInt3292 = (((Class235) class235).anInt3276 - ((Class235) class235).f_sb);
				if (((Class235) class235).anInt3292 < 0)
					((Class235) class235).anInt3292 = 0;
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1)
					Class172.method1134((byte) 9, ((Class235) class235).anInt3248);
				return;
			}
			if (i == 1101) {
				((Class235) class235).anInt3197 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1)
					Class233.method1494(127, ((Class235) class235).anInt3248);
				return;
			}
			if (i == 1102) {
				((Class235) class235).f_uc = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1103) {
				((Class235) class235).anInt3295 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1104) {
				((Class235) class235).anInt3239 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1105) {
				int i_31_ = anIntArray2122[--anInt2130];
				if (((Class235) class235).f_lb != i_31_) {
					((Class235) class235).f_lb = i_31_;
					Stream_Sub1.method2483(class235, (byte) -109);
				}
				if (((Class235) class235).f_pd == -1)
					Class246_Sub28_Sub21.method2709((((Class235) class235).anInt3248), (byte) -5);
				return;
			}
			if (i == 1106) {
				((Class235) class235).anInt3260 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1107) {
				((Class235) class235).aBool3286 = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1108) {
				((Class235) class235).anInt3244 = 1;
				((Class235) class235).anInt3215 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1109) {
				anInt2130 -= 6;
				((Class235) class235).anInt3255 = anIntArray2122[anInt2130];
				((Class235) class235).anInt3271 = anIntArray2122[anInt2130 + 1];
				((Class235) class235).anInt3283 = anIntArray2122[anInt2130 + 2];
				((Class235) class235).f_gd = anIntArray2122[anInt2130 + 3];
				((Class235) class235).anInt3281 = anIntArray2122[anInt2130 + 4];
				((Class235) class235).f_dd = anIntArray2122[anInt2130 + 5];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1) {
					Class205.method1343((byte) 126, ((Class235) class235).anInt3248);
					Class211_Sub1_Sub1.method2611(0, ((Class235) class235).anInt3248);
				}
				return;
			}
			if (i == 1110) {
				int i_32_ = anIntArray2122[--anInt2130];
				if (((Class235) class235).anInt3232 != i_32_) {
					((Class235) class235).anInt3232 = i_32_;
					((Class235) class235).anInt3256 = 0;
					((Class235) class235).anInt3221 = 1;
					((Class235) class235).anInt3275 = 0;
					Stream_Sub1.method2483(class235, (byte) -109);
				}
				if (((Class235) class235).f_pd == -1)
					Class246_Sub28_Sub31.method2854(((Class235) class235).anInt3248, 1012);
				return;
			}
			if (i == 1111) {
				((Class235) class235).aBool3285 = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1112) {
				String string = aStringArray2125[--anInt2126];
				if (!string.equals(((Class235) class235).aString3247)) {
					((Class235) class235).aString3247 = string;
					Stream_Sub1.method2483(class235, (byte) -109);
				}
				if (((Class235) class235).f_pd == -1)
					Class50.method330(((Class235) class235).anInt3248, -125);
				return;
			}
			if (i == 1113) {
				((Class235) class235).anInt3235 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1)
					Class194_Sub2.method2146(((Class235) class235).anInt3248, (byte) 59);
				return;
			}
			if (i == 1114) {
				anInt2130 -= 3;
				((Class235) class235).f_oc = anIntArray2122[anInt2130];
				((Class235) class235).f_pb = anIntArray2122[anInt2130 + 1];
				((Class235) class235).anInt3300 = anIntArray2122[anInt2130 + 2];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1115) {
				((Class235) class235).f_cc = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1116) {
				((Class235) class235).f_dc = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1117) {
				((Class235) class235).anInt3209 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1118) {
				((Class235) class235).aBool3201 = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1119) {
				((Class235) class235).aBool3294 = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1120) {
				anInt2130 -= 2;
				((Class235) class235).anInt3264 = anIntArray2122[anInt2130];
				((Class235) class235).anInt3276 = anIntArray2122[anInt2130 + 1];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_vc == 0)
					Class259_Sub3_Sub1.method2844(class235, -1, false);
				return;
			}
			if (i == 1121) {
				anInt2130 -= 2;
				((Class235) class235).f_md = (short) anIntArray2122[anInt2130];
				((Class235) class235).anInt3217 = (short) anIntArray2122[anInt2130 + 1];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1122) {
				((Class235) class235).aBool3252 = anIntArray2122[--anInt2130] == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1123) {
				((Class235) class235).f_dd = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				if (((Class235) class235).f_pd == -1)
					Class205.method1343((byte) 127, ((Class235) class235).anInt3248);
				return;
			}
			if (i == 1124) {
				int i_33_ = anIntArray2122[--anInt2130];
				((Class235) class235).aBool3207 = i_33_ == 1;
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1125) {
				anInt2130 -= 2;
				((Class235) class235).anInt3287 = anIntArray2122[anInt2130];
				((Class235) class235).anInt3238 = anIntArray2122[anInt2130 + 1];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1126) {
				((Class235) class235).anInt3259 = anIntArray2122[--anInt2130];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1127) {
				anInt2130 -= 2;
				int i_34_ = anIntArray2122[anInt2130];
				int i_35_ = anIntArray2122[anInt2130 + 1];
				Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) -80, i_34_);
				if (i_35_ != ((Class118) class118).anInt1634)
					class235.method1517(i_34_, i_35_, -122);
				else {
					class235.method1505((byte) 79, i_34_);
					return;
				}
				return;
			}
			if (i == 1128) {
				int i_36_ = anIntArray2122[--anInt2130];
				String string = aStringArray2125[--anInt2126];
				Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) 100, i_36_);
				if (!((Class118) class118).aString1629.equals(string))
					class235.method1499(string, i_36_, 16);
				else {
					class235.method1505((byte) 114, i_36_);
					return;
				}
				return;
			}
		} else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
			Class235 class235;
			if (i >= 2000) {
				i -= 1000;
				class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
			} else
				class235 = bool ? aClass235_2134 : aClass235_2123;
			Stream_Sub1.method2483(class235, (byte) -109);
			if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
				anInt2130 -= 2;
				int i_37_ = anIntArray2122[anInt2130];
				int i_38_ = anIntArray2122[anInt2130 + 1];
				if (((Class235) class235).f_pd == -1) {
					Class188.method1237(95, ((Class235) class235).anInt3248);
					Class205.method1343((byte) 125, ((Class235) class235).anInt3248);
					Class211_Sub1_Sub1.method2611(0, ((Class235) class235).anInt3248);
				}
				if (i_37_ == -1) {
					((Class235) class235).anInt3244 = 1;
					((Class235) class235).anInt3215 = -1;
					((Class235) class235).anInt3210 = -1;
				} else {
					((Class235) class235).anInt3210 = i_37_;
					((Class235) class235).f_ec = i_38_;
					if (i == 1208 || i == 1209)
						((Class235) class235).f_db = true;
					else
						((Class235) class235).f_db = false;
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_37_);
					((Class235) class235).anInt3283 = ((Class197) class197).anInt2776;
					((Class235) class235).f_gd = ((Class197) class197).anInt2758;
					((Class235) class235).anInt3281 = ((Class197) class197).anInt2780;
					((Class235) class235).anInt3255 = ((Class197) class197).anInt2802;
					((Class235) class235).anInt3271 = ((Class197) class197).f_lb;
					((Class235) class235).f_dd = ((Class197) class197).anInt2783;
					if (i == 1205 || i == 1209)
						((Class235) class235).anInt3274 = 0;
					else if (i == 1212 || i == 1213)
						((Class235) class235).anInt3274 = 1;
					else
						((Class235) class235).anInt3274 = 2;
					if (((Class235) class235).anInt3265 > 0)
						((Class235) class235).f_dd = (((Class235) class235).f_dd * 32 / ((Class235) class235).anInt3265);
					else {
						if (((Class235) class235).anInt3258 > 0)
							((Class235) class235).f_dd = (((Class235) class235).f_dd * 32 / ((Class235) class235).anInt3258);
						return;
					}
					return;
				}
				return;
			}
			if (i == 1201) {
				((Class235) class235).anInt3244 = 2;
				((Class235) class235).anInt3215 = anIntArray2122[--anInt2130];
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1202) {
				((Class235) class235).anInt3244 = 3;
				((Class235) class235).anInt3215 = -1;
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1203) {
				((Class235) class235).anInt3244 = 6;
				((Class235) class235).anInt3215 = anIntArray2122[--anInt2130];
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1204) {
				((Class235) class235).anInt3244 = 5;
				((Class235) class235).anInt3215 = anIntArray2122[--anInt2130];
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1206) {
				anInt2130 -= 4;
				((Class235) class235).anInt3213 = anIntArray2122[anInt2130];
				((Class235) class235).anInt3204 = anIntArray2122[anInt2130 + 1];
				((Class235) class235).anInt3249 = anIntArray2122[anInt2130 + 2];
				((Class235) class235).f_fb = anIntArray2122[anInt2130 + 3];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1207) {
				anInt2130 -= 2;
				((Class235) class235).anInt3253 = anIntArray2122[anInt2130];
				((Class235) class235).f_id = anIntArray2122[anInt2130 + 1];
				Stream_Sub1.method2483(class235, (byte) -109);
				return;
			}
			if (i == 1210) {
				anInt2130 -= 4;
				((Class235) class235).anInt3215 = anIntArray2122[anInt2130];
				((Class235) class235).anInt3289 = anIntArray2122[anInt2130 + 1];
				if (anIntArray2122[anInt2130 + 2] == 1)
					((Class235) class235).anInt3244 = 9;
				else
					((Class235) class235).anInt3244 = 8;
				if (anIntArray2122[anInt2130 + 3] == 1)
					((Class235) class235).f_db = true;
				else
					((Class235) class235).f_db = false;
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
			if (i == 1211) {
				((Class235) class235).anInt3244 = 5;
				((Class235) class235).anInt3215 = Class109.anInt1567;
				((Class235) class235).anInt3289 = 0;
				if (((Class235) class235).f_pd == -1)
					Class217.method1405(((Class235) class235).anInt3248, true);
				return;
			}
		} else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
			Class235 class235;
			if (i >= 2000) {
				i -= 1000;
				class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
			} else
				class235 = bool ? aClass235_2134 : aClass235_2123;
			if (i == 1300) {
				int i_39_ = anIntArray2122[--anInt2130] - 1;
				if (i_39_ < 0 || i_39_ > 9)
					anInt2126--;
				else {
					class235.method1507(aStringArray2125[--anInt2126], i_39_, (byte) -54);
					return;
				}
				return;
			}
			if (i == 1301) {
				anInt2130 -= 2;
				int i_40_ = anIntArray2122[anInt2130];
				int i_41_ = anIntArray2122[anInt2130 + 1];
				if (i_40_ == -1 && i_41_ == -1)
					((Class235) class235).aClass235_3257 = null;
				else {
					((Class235) class235).aClass235_3257 = Class211.method1390(i_40_, i_41_, (byte) -21);
					return;
				}
				return;
			}
			if (i == 1302) {
				int i_42_ = anIntArray2122[--anInt2130];
				if (i_42_ == Class246_Sub27.anInt4894 || i_42_ == Class_e.anInt1219 || i_42_ == Class214.anInt2993) {
					((Class235) class235).anInt3205 = i_42_;
					return;
				}
				return;
			}
			if (i == 1303) {
				((Class235) class235).anInt3240 = anIntArray2122[--anInt2130];
				return;
			}
			if (i == 1304) {
				((Class235) class235).anInt3226 = anIntArray2122[--anInt2130];
				return;
			}
			if (i == 1305) {
				((Class235) class235).f_jb = aStringArray2125[--anInt2126];
				return;
			}
			if (i == 1306) {
				((Class235) class235).aString3301 = aStringArray2125[--anInt2126];
				return;
			}
			if (i == 1307) {
				((Class235) class235).aStringArray3268 = null;
				return;
			}
			if (i == 1308) {
				((Class235) class235).anInt3199 = anIntArray2122[--anInt2130];
				((Class235) class235).anInt3234 = anIntArray2122[--anInt2130];
				return;
			}
			if (i == 1309) {
				int i_43_ = anIntArray2122[--anInt2130];
				int i_44_ = anIntArray2122[--anInt2130];
				if (i_44_ >= 1 && i_44_ <= 10)
					class235.method1500(65535, i_43_, i_44_ - 1);
				return;
			}
			if (i == 1310) {
				((Class235) class235).aString3229 = aStringArray2125[--anInt2126];
				return;
			}
			if (i == 1311) {
				((Class235) class235).anInt3284 = anIntArray2122[--anInt2130];
				return;
			}
			if (i == 1312 || i == 1313) {
				int i_45_;
				int i_46_;
				int i_47_;
				if (i == 1312) {
					anInt2130 -= 3;
					i_45_ = anIntArray2122[anInt2130] - 1;
					i_46_ = anIntArray2122[anInt2130 + 1];
					i_47_ = anIntArray2122[anInt2130 + 2];
					if (i_45_ < 0 || i_45_ > 9)
						throw new RuntimeException("IOR13121313");
				} else {
					anInt2130 -= 2;
					i_45_ = 10;
					i_46_ = anIntArray2122[anInt2130];
					i_47_ = anIntArray2122[anInt2130 + 1];
				}
				if (((Class235) class235).aByteArray3214 == null) {
					if (i_46_ != 0) {
						((Class235) class235).aByteArray3214 = new byte[11];
						((Class235) class235).aByteArray3291 = new byte[11];
						((Class235) class235).f_ed = new int[11];
					} else
						return;
				}
				((Class235) class235).aByteArray3214[i_45_] = (byte) i_46_;
				if (i_46_ != 0)
					((Class235) class235).f_bd = true;
				else {
					((Class235) class235).f_bd = false;
					for (int i_48_ = 0; i_48_ < ((Class235) class235).aByteArray3214.length; i_48_++) {
						if (((Class235) class235).aByteArray3214[i_48_] != 0) {
							((Class235) class235).f_bd = true;
							break;
						}
					}
				}
				((Class235) class235).aByteArray3291[i_45_] = (byte) i_47_;
				return;
			}
			if (i == 1314) {
				((Class235) class235).anInt3233 = anIntArray2122[--anInt2130];
				return;
			}
		} else {
			if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
				Class235 class235;
				if (i >= 2000) {
					i -= 1000;
					class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
				} else
					class235 = bool ? aClass235_2134 : aClass235_2123;
				String string = aStringArray2125[--anInt2126];
				int[] is = null;
				if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
					int i_49_ = anIntArray2122[--anInt2130];
					if (i_49_ > 0) {
						is = new int[i_49_];
						while (i_49_-- > 0)
							is[i_49_] = anIntArray2122[--anInt2130];
					}
					string = string.substring(0, string.length() - 1);
				}
				Object[] objects = new Object[string.length() + 1];
				for (int i_50_ = objects.length - 1; i_50_ >= 1; i_50_--) {
					if (string.charAt(i_50_ - 1) == 's')
						objects[i_50_] = aStringArray2125[--anInt2126];
					else
						objects[i_50_] = new Integer(anIntArray2122[--anInt2130]);
				}
				int i_51_ = anIntArray2122[--anInt2130];
				if (i_51_ != -1)
					objects[0] = new Integer(i_51_);
				else
					objects = null;
				if (i == 1400)
					((Class235) class235).anObjectArray3227 = objects;
				else if (i == 1401)
					((Class235) class235).f_ib = objects;
				else if (i == 1402)
					((Class235) class235).anObjectArray3282 = objects;
				else if (i == 1403)
					((Class235) class235).anObjectArray3278 = objects;
				else if (i == 1404)
					((Class235) class235).anObjectArray3212 = objects;
				else if (i == 1405)
					((Class235) class235).anObjectArray3269 = objects;
				else if (i == 1406)
					((Class235) class235).anObjectArray3250 = objects;
				else if (i == 1407) {
					((Class235) class235).anObjectArray3243 = objects;
					((Class235) class235).anIntArray3195 = is;
				} else if (i == 1408)
					((Class235) class235).anObjectArray3211 = objects;
				else if (i == 1409)
					((Class235) class235).anObjectArray3236 = objects;
				else if (i == 1410)
					((Class235) class235).anObjectArray3241 = objects;
				else if (i == 1411)
					((Class235) class235).f_nb = objects;
				else if (i == 1412)
					((Class235) class235).anObjectArray3273 = objects;
				else if (i == 1414) {
					((Class235) class235).anObjectArray3246 = objects;
					((Class235) class235).f_jc = is;
				} else if (i == 1415) {
					((Class235) class235).f_fd = objects;
					((Class235) class235).anIntArray3302 = is;
				} else if (i == 1416)
					((Class235) class235).f_eb = objects;
				else if (i == 1417)
					((Class235) class235).f_wb = objects;
				else if (i == 1418)
					((Class235) class235).anObjectArray3218 = objects;
				else if (i == 1419)
					((Class235) class235).f_ab = objects;
				else if (i == 1420)
					((Class235) class235).anObjectArray3299 = objects;
				else if (i == 1421)
					((Class235) class235).f_wc = objects;
				else if (i == 1422)
					((Class235) class235).anObjectArray3231 = objects;
				else if (i == 1423)
					((Class235) class235).f_kc = objects;
				else if (i == 1424)
					((Class235) class235).anObjectArray3216 = objects;
				else if (i == 1425)
					((Class235) class235).anObjectArray3230 = objects;
				else if (i == 1426)
					((Class235) class235).anObjectArray3198 = objects;
				else if (i == 1427)
					((Class235) class235).anObjectArray3206 = objects;
				else if (i == 1428) {
					((Class235) class235).f_sc = objects;
					((Class235) class235).anIntArray3220 = is;
				} else if (i == 1429) {
					((Class235) class235).anObjectArray3298 = objects;
					((Class235) class235).anIntArray3208 = is;
				} else if (i == 1430)
					((Class235) class235).anObjectArray3242 = objects;
				((Class235) class235).aBool3222 = true;
				return;
			}
			if (i < 1600) {
				Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
				if (i == 1500) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_mc;
					return;
				}
				if (i == 1501) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_hd;
					return;
				}
				if (i == 1502) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_fc;
					return;
				}
				if (i == 1503) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_sb;
					return;
				}
				if (i == 1504) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_ic ? 1 : 0;
					return;
				}
				if (i == 1505) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3293;
					return;
				}
				if (i == 1506) {
					Class235 class235_52_ = Class5.method59(class235, (byte) 62);
					anIntArray2122[anInt2130++] = (class235_52_ == null ? -1 : ((Class235) class235_52_).anInt3248);
					return;
				}
			} else if (i < 1700) {
				Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
				if (i == 1600) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3270;
					return;
				}
				if (i == 1601) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3292;
					return;
				}
				if (i == 1602) {
					aStringArray2125[anInt2126++] = ((Class235) class235).aString3247;
					return;
				}
				if (i == 1603) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3264;
					return;
				}
				if (i == 1604) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3276;
					return;
				}
				if (i == 1605) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_dd;
					return;
				}
				if (i == 1606) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3283;
					return;
				}
				if (i == 1607) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3281;
					return;
				}
				if (i == 1608) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_gd;
					return;
				}
				if (i == 1609) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3295;
					return;
				}
				if (i == 1610) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3255;
					return;
				}
				if (i == 1611) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3271;
					return;
				}
				if (i == 1612) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_lb;
					return;
				}
				if (i == 1613) {
					int i_53_ = anIntArray2122[--anInt2130];
					Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) 96, i_53_);
					if (class118.method810(115))
						aStringArray2125[anInt2126++] = class235.method1516((((Class118) class118).aString1629), i_53_, -26191);
					else
						anIntArray2122[anInt2130++] = class235.method1501(-1, (((Class118) class118).anInt1634), i_53_);
				}
			} else if (i < 1800) {
				Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
				if (i == 1700) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3210;
					return;
				}
				if (i == 1701) {
					if (((Class235) class235).anInt3210 != -1)
						anIntArray2122[anInt2130++] = ((Class235) class235).f_ec;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 1702) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_pd;
					return;
				}
			} else if (i < 1900) {
				Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
				if (i == 1800) {
					anIntArray2122[anInt2130++] = client.method2971(class235).method2126(16693);
					return;
				}
				if (i == 1801) {
					int i_54_ = anIntArray2122[--anInt2130];
					i_54_--;
					if (((Class235) class235).aStringArray3268 == null || (i_54_ >= ((Class235) class235).aStringArray3268.length) || (((Class235) class235).aStringArray3268[i_54_] == null))
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = ((Class235) class235).aStringArray3268[i_54_];
						return;
					}
					return;
				}
				if (i == 1802) {
					if (((Class235) class235).f_jb == null)
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = ((Class235) class235).f_jb;
						return;
					}
					return;
				}
			} else if (i < 2000 || i >= 2900 && i < 3000) {
				Class235 class235;
				if (i >= 2000) {
					class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
					i -= 1000;
				} else
					class235 = bool ? aClass235_2134 : aClass235_2123;
				if (anInt2142 >= 10)
					throw new RuntimeException("C29xx-1");
				if (i == 1927) {
					if (((Class235) class235).anObjectArray3206 != null) {
						Class246_Sub29 class246_sub29 = new Class246_Sub29();
						((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
						((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3206;
						((Class246_Sub29) class246_sub29).anInt4971 = anInt2142 + 1;
						Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
						return;
					}
					return;
				}
			} else if (i < 2600) {
				Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
				if (i == 2500) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_mc;
					return;
				}
				if (i == 2501) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_hd;
					return;
				}
				if (i == 2502) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_fc;
					return;
				}
				if (i == 2503) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_sb;
					return;
				}
				if (i == 2504) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_ic ? 1 : 0;
					return;
				}
				if (i == 2505) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3293;
					return;
				}
				if (i == 1506) {
					Class235 class235_55_ = Class5.method59(class235, (byte) 97);
					anIntArray2122[anInt2130++] = (class235_55_ == null ? -1 : ((Class235) class235_55_).anInt3248);
					return;
				}
			} else if (i < 2700) {
				Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
				if (i == 2600) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3270;
					return;
				}
				if (i == 2601) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3292;
					return;
				}
				if (i == 2602) {
					aStringArray2125[anInt2126++] = ((Class235) class235).aString3247;
					return;
				}
				if (i == 2603) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3264;
					return;
				}
				if (i == 2604) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3276;
					return;
				}
				if (i == 2605) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_dd;
					return;
				}
				if (i == 2606) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3283;
					return;
				}
				if (i == 2607) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3281;
					return;
				}
				if (i == 2608) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_gd;
					return;
				}
				if (i == 2609) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3295;
					return;
				}
				if (i == 2610) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3255;
					return;
				}
				if (i == 2611) {
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3271;
					return;
				}
				if (i == 2612) {
					anIntArray2122[anInt2130++] = ((Class235) class235).f_lb;
					return;
				}
			} else if (i < 2800) {
				if (i == 2700) {
					Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
					anIntArray2122[anInt2130++] = ((Class235) class235).anInt3210;
					return;
				}
				if (i == 2701) {
					Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
					if (((Class235) class235).anInt3210 != -1)
						anIntArray2122[anInt2130++] = ((Class235) class235).f_ec;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 2702) {
					int i_56_ = anIntArray2122[--anInt2130];
					Class246_Sub40 class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.method544((long) i_56_, 126));
					if (class246_sub40 != null)
						anIntArray2122[anInt2130++] = 1;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 2703) {
					Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
					if (((Class235) class235).f_ad == null)
						anIntArray2122[anInt2130++] = 0;
					else {
						int i_57_ = ((Class235) class235).f_ad.length;
						for (int i_58_ = 0; i_58_ < ((Class235) class235).f_ad.length; i_58_++) {
							if (((Class235) class235).f_ad[i_58_] == null) {
								i_57_ = i_58_;
								break;
							}
						}
						anIntArray2122[anInt2130++] = i_57_;
						return;
					}
					return;
				}
				if (i == 2704 || i == 2705) {
					anInt2130 -= 2;
					int i_59_ = anIntArray2122[anInt2130];
					int i_60_ = anIntArray2122[anInt2130 + 1];
					Class246_Sub40 class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.method544((long) i_59_, 126));
					if (class246_sub40 != null && (((Class246_Sub40) class246_sub40).anInt5517 == i_60_))
						anIntArray2122[anInt2130++] = 1;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
			} else if (i < 2900) {
				Class235 class235 = Class220.method1423(0, anIntArray2122[--anInt2130]);
				if (i == 2800) {
					anIntArray2122[anInt2130++] = client.method2971(class235).method2126(16693);
					return;
				}
				if (i == 2801) {
					int i_61_ = anIntArray2122[--anInt2130];
					i_61_--;
					if (((Class235) class235).aStringArray3268 == null || (i_61_ >= ((Class235) class235).aStringArray3268.length) || (((Class235) class235).aStringArray3268[i_61_] == null))
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = ((Class235) class235).aStringArray3268[i_61_];
						return;
					}
					return;
				}
				if (i == 2802) {
					if (((Class235) class235).f_jb == null)
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = ((Class235) class235).f_jb;
						return;
					}
					return;
				}
			} else if (i < 3200) {
				if (i == 3100) {
					String string = aStringArray2125[--anInt2126];
					Class_v.method692((byte) -99, string);
					return;
				}
				if (i == 3101) {
					anInt2130 -= 2;
					Class246_Sub2.method1789(anIntArray2122[anInt2130 + 1], Class_a.aClass_r_Sub1_1180, false, anIntArray2122[anInt2130]);
					return;
				}
				if (i == 3103) {
					Class257.method1666(-15257, true);
					return;
				}
				if (i == 3104) {
					String string = aStringArray2125[--anInt2126];
					int i_62_ = 0;
					if (Class48.method323(string, 59))
						i_62_ = Class104.method665(string, 10);
					anInt2118++;
					Class243.writePacket(-126, Class68.aClass201_898);
					Class130_Sub1.stream.writeInt(i_62_, (byte) -46);
					return;
				}
				if (i == 3105) {
					String string = aStringArray2125[--anInt2126];
					anInt2129++;
					Class243.writePacket(-53, Class132.aClass201_1832);
					Class130_Sub1.stream.writeByte(255, string.length() + 1);
					Class130_Sub1.stream.writeString(55, string);
					return;
				}
				if (i == 3106) {
					String string = aStringArray2125[--anInt2126];
					anInt2117++;
					Class243.writePacket(-93, Class133.aClass201_1844);
					Class130_Sub1.stream.writeByte(255, string.length() + 1);
					Class130_Sub1.stream.writeString(74, string);
					return;
				}
				if (i == 3107) {
					int i_63_ = anIntArray2122[--anInt2130];
					String string = aStringArray2125[--anInt2126];
					Class254.method1643(string, i_63_, (byte) -24);
					return;
				}
				if (i == 3108) {
					anInt2130 -= 3;
					int i_64_ = anIntArray2122[anInt2130];
					int i_65_ = anIntArray2122[anInt2130 + 1];
					int i_66_ = anIntArray2122[anInt2130 + 2];
					Class235 class235 = Class220.method1423(0, i_66_);
					Class246_Sub28_Sub6.method2550(0, i_65_, class235, i_64_);
					return;
				}
				if (i == 3109) {
					anInt2130 -= 2;
					int i_67_ = anIntArray2122[anInt2130];
					int i_68_ = anIntArray2122[anInt2130 + 1];
					Class235 class235 = bool ? aClass235_2134 : aClass235_2123;
					Class246_Sub28_Sub6.method2550(0, i_68_, class235, i_67_);
					return;
				}
				if (i == 3110) {
					int i_69_ = anIntArray2122[--anInt2130];
					anInt2131++;
					Class243.writePacket(-61, Class220.GRAND_EXCHANGE_ITEM_SELECT_PACKET);
					Class130_Sub1.stream.writeShort((byte) 67, i_69_);
					return;
				}
				if (i == 3111) {
					anInt2130 -= 2;
					int i_70_ = anIntArray2122[anInt2130];
					int i_71_ = anIntArray2122[anInt2130 + 1];
					Class246_Sub40 class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.method544((long) i_70_, 124));
					if (class246_sub40 != null)
						Class50.method328((((Class246_Sub40) class246_sub40).anInt5517) != i_71_, class246_sub40, true, -43);
					Class161.method1064(i_71_, 3, true, (byte) -71, i_70_);
					return;
				}
				if (i == 3112) {
					anInt2130--;
					int i_72_ = anIntArray2122[anInt2130];
					Class246_Sub40 class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.method544((long) i_72_, 125));
					if (class246_sub40 != null && ((Class246_Sub40) class246_sub40).anInt5519 == 3)
						Class50.method328(true, class246_sub40, true, -41);
					return;
				}
				if (i == 3113) {
					Class165.method1094(aStringArray2125[--anInt2126], -110);
					return;
				}
				if (i == 3114) {
					anInt2130 -= 2;
					int i_73_ = anIntArray2122[anInt2130];
					int i_74_ = anIntArray2122[anInt2130 + 1];
					String string = aStringArray2125[--anInt2126];
					Class67.method437(i_74_, i_73_, string, "", "", true);
					return;
				}
			} else if (i < 3300) {
				if (i == 3200) {
					anInt2130 -= 3;
					Class99.method624(anIntArray2122[anInt2130], 0, anIntArray2122[anInt2130 + 1], 255, anIntArray2122[anInt2130 + 2]);
					return;
				}
				if (i == 3201) {
					Class246_Sub28_Sub36.method2877(anIntArray2122[--anInt2130], -97, 50, 255);
					return;
				}
				if (i == 3202) {
					anInt2130 -= 2;
					Class234.method1497(255, 0, anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130]);
					return;
				}
				if (i == 3203) {
					anInt2130 -= 4;
					Class99.method624(anIntArray2122[anInt2130], 0, anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130 + 3], anIntArray2122[anInt2130 + 2]);
					return;
				}
				if (i == 3204) {
					anInt2130 -= 3;
					Class246_Sub28_Sub36.method2877(anIntArray2122[anInt2130], 125, (anIntArray2122[anInt2130 + 2]), (anIntArray2122[anInt2130 + 1]));
					return;
				}
				if (i == 3205) {
					anInt2130 -= 3;
					Class234.method1497(anIntArray2122[anInt2130 + 2], 0, anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130]);
					return;
				}
				if (i == 3206) {
					anInt2130 -= 4;
					Class147.method994(anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130 + 2], false, anIntArray2122[anInt2130], anIntArray2122[anInt2130 + 3]);
					return;
				}
			} else if (i < 3400) {
				if (i == 3300) {
					anIntArray2122[anInt2130++] = Class246_Sub1_Sub4.anInt5752;
					return;
				}
				if (i == 3301) {
					anInt2130 -= 2;
					int i_75_ = anIntArray2122[anInt2130];
					int i_76_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class246_Sub28_Sub23.method2730(false, false, i_76_, i_75_);
					return;
				}
				if (i == 3302) {
					anInt2130 -= 2;
					int i_77_ = anIntArray2122[anInt2130];
					int i_78_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class130_Sub8.method2347(120, i_78_, i_77_, false);
					return;
				}
				if (i == 3303) {
					anInt2130 -= 2;
					int i_79_ = anIntArray2122[anInt2130];
					int i_80_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class39.method274(-10077, false, i_79_, i_80_);
					return;
				}
				if (i == 3304) {
					int i_81_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = ((Class246_Sub1_Sub2) HashMap.aClass61_774.method416(5, i_81_)).anInt5697;
					return;
				}
				if (i == 3305) {
					int i_82_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class221.anIntArray3066[i_82_];
					return;
				}
				if (i == 3306) {
					int i_83_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class104.anIntArray1419[i_83_];
					return;
				}
				if (i == 3307) {
					int i_84_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class86.anIntArray1139[i_84_];
					return;
				}
				if (i == 3308) {
					int i_85_ = (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053);
					int i_86_ = (((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060) >> 7) + Class39_Sub1.anInt4670);
					int i_87_ = (((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059) >> 7) + Class47.anInt686);
					anIntArray2122[anInt2130++] = (i_85_ << 28) + (i_86_ << 14) + i_87_;
					return;
				}
				if (i == 3309) {
					int i_88_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = i_88_ >> 14 & 0x3fff;
					return;
				}
				if (i == 3310) {
					int i_89_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = i_89_ >> 28;
					return;
				}
				if (i == 3311) {
					int i_90_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = i_90_ & 0x3fff;
					return;
				}
				if (i == 3312) {
					anIntArray2122[anInt2130++] = Class246_Sub34.aBool5140 ? 1 : 0;
					return;
				}
				if (i == 3313) {
					anInt2130 -= 2;
					int i_91_ = anIntArray2122[anInt2130];
					int i_92_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class246_Sub28_Sub23.method2730(false, true, i_92_, i_91_);
					return;
				}
				if (i == 3314) {
					anInt2130 -= 2;
					int i_93_ = anIntArray2122[anInt2130];
					int i_94_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class130_Sub8.method2347(67, i_94_, i_93_, true);
					return;
				}
				if (i == 3315) {
					anInt2130 -= 2;
					int i_95_ = anIntArray2122[anInt2130];
					int i_96_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class39.method274(-10077, true, i_95_, i_96_);
					return;
				}
				if (i == 3316) {
					if (Class260_Sub2.anInt4289 >= 2)
						anIntArray2122[anInt2130++] = Class260_Sub2.anInt4289;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3317) {
					anIntArray2122[anInt2130++] = Class100.anInt1303;
					return;
				}
				if (i == 3318) {
					anIntArray2122[anInt2130++] = Class32.anInt438;
					return;
				}
				if (i == 3321) {
					anIntArray2122[anInt2130++] = Class51.anInt723;
					return;
				}
				if (i == 3322) {
					anIntArray2122[anInt2130++] = Class8.anInt102;
					return;
				}
				if (i == 3323) {
					if (Class64.anInt861 >= 5 && Class64.anInt861 <= 9)
						anIntArray2122[anInt2130++] = 1;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3324) {
					if (Class64.anInt861 >= 5 && Class64.anInt861 <= 9)
						anIntArray2122[anInt2130++] = Class64.anInt861;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3325) {
					anIntArray2122[anInt2130++] = Class246_Sub23.aBool4817 ? 1 : 0;
					return;
				}
				if (i == 3326) {
					anIntArray2122[anInt2130++] = ((Player) Class_a.aClass_r_Sub1_1180).f_qd;
					return;
				}
				if (i == 3327) {
					anIntArray2122[anInt2130++] = ((Class27) (((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131)).aBool365 ? 1 : 0;
					return;
				}
				if (i == 3328) {
					anIntArray2122[anInt2130++] = Class59.aBool820 && !Class_u.aBool4703 ? 1 : 0;
					return;
				}
				if (i == 3329) {
					anIntArray2122[anInt2130++] = Class168.aBool2395 ? 1 : 0;
					return;
				}
				if (i == 3330) {
					int i_97_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class246_Sub28_Sub33.method2861(false, i_97_, true);
					return;
				}
				if (i == 3331) {
					anInt2130 -= 2;
					int i_98_ = anIntArray2122[anInt2130];
					int i_99_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class21_Sub3.method2077(false, false, i_98_, i_99_, (byte) 120);
					return;
				}
				if (i == 3332) {
					anInt2130 -= 2;
					int i_100_ = anIntArray2122[anInt2130];
					int i_101_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = Class21_Sub3.method2077(false, true, i_100_, i_101_, (byte) 84);
					return;
				}
				if (i == 3333) {
					anIntArray2122[anInt2130++] = Class87.anInt1143;
					return;
				}
				if (i == 3335) {
					anIntArray2122[anInt2130++] = Class_j.anInt1485;
					return;
				}
				if (i == 3336) {
					anInt2130 -= 4;
					int i_102_ = anIntArray2122[anInt2130];
					int i_103_ = anIntArray2122[anInt2130 + 1];
					int i_104_ = anIntArray2122[anInt2130 + 2];
					int i_105_ = anIntArray2122[anInt2130 + 3];
					i_102_ += i_103_ << 14;
					i_102_ += i_104_ << 28;
					i_102_ += i_105_;
					anIntArray2122[anInt2130++] = i_102_;
					return;
				}
				if (i == 3337) {
					anIntArray2122[anInt2130++] = Class109_Sub4.anInt4573;
					return;
				}
				if (i == 3338) {
					anIntArray2122[anInt2130++] = Class207.method1359(-49);
					return;
				}
			} else if (i < 3500) {
				if (i == 3400) {
					anInt2130 -= 2;
					int i_106_ = anIntArray2122[anInt2130];
					int i_107_ = anIntArray2122[anInt2130 + 1];
					Class183 class183 = Class246_Sub39.aClass141_5487.method954(i_106_, -92);
					aStringArray2125[anInt2126++] = class183.method1185(114, i_107_);
					return;
				}
				if (i == 3408) {
					anInt2130 -= 4;
					int i_108_ = anIntArray2122[anInt2130];
					int i_109_ = anIntArray2122[anInt2130 + 1];
					int i_110_ = anIntArray2122[anInt2130 + 2];
					int i_111_ = anIntArray2122[anInt2130 + 3];
					Class183 class183 = Class246_Sub39.aClass141_5487.method954(i_110_, -93);
					if (((Class183) class183).aChar2544 != i_108_ || ((Class183) class183).aChar2547 != i_109_)
						throw new RuntimeException("C3408-1");
					if (i_109_ == 115)
						aStringArray2125[anInt2126++] = class183.method1185(109, i_111_);
					else {
						anIntArray2122[anInt2130++] = class183.method1180(i_111_, -6);
						return;
					}
					return;
				}
				if (i == 3409) {
					anInt2130 -= 3;
					int i_112_ = anIntArray2122[anInt2130];
					int i_113_ = anIntArray2122[anInt2130 + 1];
					int i_114_ = anIntArray2122[anInt2130 + 2];
					if (i_113_ == -1)
						throw new RuntimeException("C3409-2");
					Class183 class183 = Class246_Sub39.aClass141_5487.method954(i_113_, 22);
					if (((Class183) class183).aChar2547 != i_112_)
						throw new RuntimeException("C3409-1");
					anIntArray2122[anInt2130++] = class183.method1183(true, i_114_) ? 1 : 0;
					return;
				}
				if (i == 3410) {
					int i_115_ = anIntArray2122[--anInt2130];
					String string = aStringArray2125[--anInt2126];
					if (i_115_ == -1)
						throw new RuntimeException("C3410-2");
					Class183 class183 = Class246_Sub39.aClass141_5487.method954(i_115_, -98);
					if (((Class183) class183).aChar2547 != 's')
						throw new RuntimeException("C3410-1");
					anIntArray2122[anInt2130++] = class183.method1182(2, string) ? 1 : 0;
					return;
				}
				if (i == 3411) {
					int i_116_ = anIntArray2122[--anInt2130];
					Class183 class183 = Class246_Sub39.aClass141_5487.method954(i_116_, -110);
					anIntArray2122[anInt2130++] = ((Class183) class183).aClass85_2551.method542(-5);
					return;
				}
			} else if (i < 3700) {
				if (i == 3600) {
					if (Class_t.anInt1429 == 0)
						anIntArray2122[anInt2130++] = -2;
					else {
						if (Class_t.anInt1429 == 1)
							anIntArray2122[anInt2130++] = -1;
						else {
							anIntArray2122[anInt2130++] = Class246_Sub7.anInt3969;
							return;
						}
						return;
					}
					return;
				}
				if (i == 3601) {
					int i_117_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 == 2 && i_117_ < Class246_Sub7.anInt3969) {
						aStringArray2125[anInt2126++] = Class103.f_gb[i_117_];
						if (Class33.aStringArray446[i_117_] != null)
							aStringArray2125[anInt2126++] = Class33.aStringArray446[i_117_];
						else
							aStringArray2125[anInt2126++] = "";
					} else {
						aStringArray2125[anInt2126++] = "";
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3602) {
					int i_118_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 == 2 && i_118_ < Class246_Sub7.anInt3969)
						anIntArray2122[anInt2130++] = Class40.anIntArray615[i_118_];
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3603) {
					int i_119_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 == 2 && i_119_ < Class246_Sub7.anInt3969)
						anIntArray2122[anInt2130++] = Class246_Sub28_Sub25.anIntArray6704[i_119_];
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3604) {
					String string = aStringArray2125[--anInt2126];
					int i_120_ = anIntArray2122[--anInt2130];
					Class246_Sub1_Sub14.method2712(string, i_120_, 1);
					return;
				}
				if (i == 3605) {
					String string = aStringArray2125[--anInt2126];
					Class127.method867(string, false);
					return;
				}
				if (i == 3606) {
					String string = aStringArray2125[--anInt2126];
					Class215.method1402(string, (byte) -117);
					return;
				}
				if (i == 3607) {
					String string = aStringArray2125[--anInt2126];
					Class185.method1216((byte) -125, false, string);
					return;
				}
				if (i == 3608) {
					String string = aStringArray2125[--anInt2126];
					Class250.method1599(string, 104);
					return;
				}
				if (i == 3609) {
					String string = aStringArray2125[--anInt2126];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray2122[anInt2130++] = Class246_Sub1_Sub9.method2586(119, string) ? 1 : 0;
					return;
				}
				if (i == 3610) {
					int i_121_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 == 2 && i_121_ < Class246_Sub7.anInt3969)
						aStringArray2125[anInt2126++] = Class245.aStringArray3461[i_121_];
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3611) {
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null)
						aStringArray2125[anInt2126++] = Class190.method1246(true, (Class246_Sub1_Sub6_Sub2.aString7111));
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3612) {
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null)
						anIntArray2122[anInt2130++] = Class259_Sub2.anInt4961;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3613) {
					int i_122_ = anIntArray2122[--anInt2130];
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null && i_122_ < Class259_Sub2.anInt4961)
						aStringArray2125[anInt2126++] = (((Class9) Class_o.aClass9Array7224[i_122_]).aString110);
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3614) {
					int i_123_ = anIntArray2122[--anInt2130];
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null && i_123_ < Class259_Sub2.anInt4961)
						anIntArray2122[anInt2130++] = (((Class9) Class_o.aClass9Array7224[i_123_]).anInt113);
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3615) {
					int i_124_ = anIntArray2122[--anInt2130];
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null && i_124_ < Class259_Sub2.anInt4961)
						anIntArray2122[anInt2130++] = (((Class9) Class_o.aClass9Array7224[i_124_]).aByte111);
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3616) {
					anIntArray2122[anInt2130++] = Class256.aByte3680;
					return;
				}
				if (i == 3617) {
					String string = aStringArray2125[--anInt2126];
					Class145.method975(string, (byte) 67);
					return;
				}
				if (i == 3618) {
					anIntArray2122[anInt2130++] = Class86.aByte1136;
					return;
				}
				if (i == 3619) {
					String string = aStringArray2125[--anInt2126];
					Class40_Sub4.method1879(string, 65);
					return;
				}
				if (i == 3620) {
					Class64_Sub1.method2221(0);
					return;
				}
				if (i == 3621) {
					if (Class_t.anInt1429 == 0)
						anIntArray2122[anInt2130++] = -1;
					else {
						anIntArray2122[anInt2130++] = Class235.anInt3266;
						return;
					}
					return;
				}
				if (i == 3622) {
					int i_125_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 != 0 && i_125_ < Class235.anInt3266) {
						aStringArray2125[anInt2126++] = Class38_Sub1_Sub1.aStringArray6762[i_125_];
						if (Class246_Sub1_Sub17.aStringArray6745[i_125_] != null)
							aStringArray2125[anInt2126++] = Class246_Sub1_Sub17.aStringArray6745[i_125_];
						else
							aStringArray2125[anInt2126++] = "";
					} else {
						aStringArray2125[anInt2126++] = "";
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3623) {
					String string = aStringArray2125[--anInt2126];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray2122[anInt2130++] = Class129.method881(string, false) ? 1 : 0;
					return;
				}
				if (i == 3624) {
					int i_126_ = anIntArray2122[--anInt2130];
					if (Class_o.aClass9Array7224 != null && i_126_ < Class259_Sub2.anInt4961 && (((Class9) Class_o.aClass9Array7224[i_126_]).aString109.equalsIgnoreCase(((Player) Class_a.aClass_r_Sub1_1180).aString7140)))
						anIntArray2122[anInt2130++] = 1;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3625) {
					if (Class221.aString3061 != null)
						aStringArray2125[anInt2126++] = Class221.aString3061;
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3626) {
					int i_127_ = anIntArray2122[--anInt2130];
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null && i_127_ < Class259_Sub2.anInt4961)
						aStringArray2125[anInt2126++] = (((Class9) Class_o.aClass9Array7224[i_127_]).aString105);
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3627) {
					int i_128_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 == 2 && i_128_ >= 0 && i_128_ < Class246_Sub7.anInt3969)
						anIntArray2122[anInt2130++] = Class246_Sub40.aBoolArray5520[i_128_] ? 1 : 0;
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 3628) {
					String string = aStringArray2125[--anInt2126];
					if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray2122[anInt2130++] = Class59_Sub2_Sub1.method2450(-30749, string);
					return;
				}
				if (i == 3629) {
					anIntArray2122[anInt2130++] = Class122.anInt1680;
					return;
				}
				if (i == 3630) {
					String string = aStringArray2125[--anInt2126];
					Class185.method1216((byte) -118, true, string);
					return;
				}
				if (i == 3631) {
					int i_129_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class236.aBoolArray3319[i_129_] ? 1 : 0;
					return;
				}
				if (i == 3632) {
					int i_130_ = anIntArray2122[--anInt2130];
					if (Class246_Sub1_Sub6_Sub2.aString7111 != null && i_130_ < Class259_Sub2.anInt4961)
						aStringArray2125[anInt2126++] = (((Class9) Class_o.aClass9Array7224[i_130_]).aString109);
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 3633) {
					int i_131_ = anIntArray2122[--anInt2130];
					if (Class_t.anInt1429 != 0 && i_131_ < Class235.anInt3266)
						aStringArray2125[anInt2126++] = Class55.aStringArray784[i_131_];
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
			} else if (i < 4000) {
				if (i == 3903) {
					int i_132_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class231.aClass18Array3169[i_132_].method173((byte) 100);
					return;
				}
				if (i == 3904) {
					int i_133_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class18) Class231.aClass18Array3169[i_133_]).anInt254);
					return;
				}
				if (i == 3905) {
					int i_134_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class18) Class231.aClass18Array3169[i_134_]).anInt257);
					return;
				}
				if (i == 3906) {
					int i_135_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class18) Class231.aClass18Array3169[i_135_]).anInt258);
					return;
				}
				if (i == 3907) {
					int i_136_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class18) Class231.aClass18Array3169[i_136_]).anInt252);
					return;
				}
				if (i == 3908) {
					int i_137_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class18) Class231.aClass18Array3169[i_137_]).anInt265);
					return;
				}
				if (i == 3910) {
					int i_138_ = anIntArray2122[--anInt2130];
					int i_139_ = Class231.aClass18Array3169[i_138_].method172((byte) -111);
					anIntArray2122[anInt2130++] = i_139_ == 0 ? 1 : 0;
					return;
				}
				if (i == 3911) {
					int i_140_ = anIntArray2122[--anInt2130];
					int i_141_ = Class231.aClass18Array3169[i_140_].method172((byte) -111);
					anIntArray2122[anInt2130++] = i_141_ == 2 ? 1 : 0;
					return;
				}
				if (i == 3912) {
					int i_142_ = anIntArray2122[--anInt2130];
					int i_143_ = Class231.aClass18Array3169[i_142_].method172((byte) -111);
					anIntArray2122[anInt2130++] = i_143_ == 5 ? 1 : 0;
					return;
				}
				if (i == 3913) {
					int i_144_ = anIntArray2122[--anInt2130];
					int i_145_ = Class231.aClass18Array3169[i_144_].method172((byte) -111);
					anIntArray2122[anInt2130++] = i_145_ == 1 ? 1 : 0;
					return;
				}
			} else if (i < 4100) {
				if (i == 4000) {
					anInt2130 -= 2;
					int i_146_ = anIntArray2122[anInt2130];
					int i_147_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_146_ + i_147_;
					return;
				}
				if (i == 4001) {
					anInt2130 -= 2;
					int i_148_ = anIntArray2122[anInt2130];
					int i_149_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_148_ - i_149_;
					return;
				}
				if (i == 4002) {
					anInt2130 -= 2;
					int i_150_ = anIntArray2122[anInt2130];
					int i_151_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_150_ * i_151_;
					return;
				}
				if (i == 4003) {
					anInt2130 -= 2;
					int i_152_ = anIntArray2122[anInt2130];
					int i_153_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_152_ / i_153_;
					return;
				}
				if (i == 4004) {
					int i_154_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (int) (Math.random() * (double) i_154_);
					return;
				}
				if (i == 4005) {
					int i_155_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (int) (Math.random() * (double) (i_155_ + 1));
					return;
				}
				if (i == 4006) {
					anInt2130 -= 5;
					int i_156_ = anIntArray2122[anInt2130];
					int i_157_ = anIntArray2122[anInt2130 + 1];
					int i_158_ = anIntArray2122[anInt2130 + 2];
					int i_159_ = anIntArray2122[anInt2130 + 3];
					int i_160_ = anIntArray2122[anInt2130 + 4];
					anIntArray2122[anInt2130++] = i_156_ + ((i_157_ - i_156_) * (i_160_ - i_158_) / (i_159_ - i_158_));
					return;
				}
				if (i == 4007) {
					anInt2130 -= 2;
					long l = (long) anIntArray2122[anInt2130];
					long l_161_ = (long) anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = (int) (l + l * l_161_ / 100L);
					return;
				}
				if (i == 4008) {
					anInt2130 -= 2;
					int i_162_ = anIntArray2122[anInt2130];
					int i_163_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_162_ | 1 << i_163_;
					return;
				}
				if (i == 4009) {
					anInt2130 -= 2;
					int i_164_ = anIntArray2122[anInt2130];
					int i_165_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_164_ & -1 - (1 << i_165_);
					return;
				}
				if (i == 4010) {
					anInt2130 -= 2;
					int i_166_ = anIntArray2122[anInt2130];
					int i_167_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = (i_166_ & 1 << i_167_) != 0 ? 1 : 0;
					return;
				}
				if (i == 4011) {
					anInt2130 -= 2;
					int i_168_ = anIntArray2122[anInt2130];
					int i_169_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_168_ % i_169_;
					return;
				}
				if (i == 4012) {
					anInt2130 -= 2;
					int i_170_ = anIntArray2122[anInt2130];
					int i_171_ = anIntArray2122[anInt2130 + 1];
					if (i_170_ == 0)
						anIntArray2122[anInt2130++] = 0;
					else {
						anIntArray2122[anInt2130++] = (int) Math.pow((double) i_170_, (double) i_171_);
						return;
					}
					return;
				}
				if (i == 4013) {
					anInt2130 -= 2;
					int i_172_ = anIntArray2122[anInt2130];
					int i_173_ = anIntArray2122[anInt2130 + 1];
					if (i_172_ == 0)
						anIntArray2122[anInt2130++] = 0;
					else {
						if (i_173_ == 0)
							anIntArray2122[anInt2130++] = 2147483647;
						else {
							anIntArray2122[anInt2130++] = (int) Math.pow((double) i_172_, 1.0 / (double) i_173_);
							return;
						}
						return;
					}
					return;
				}
				if (i == 4014) {
					anInt2130 -= 2;
					int i_174_ = anIntArray2122[anInt2130];
					int i_175_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_174_ & i_175_;
					return;
				}
				if (i == 4015) {
					anInt2130 -= 2;
					int i_176_ = anIntArray2122[anInt2130];
					int i_177_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_176_ | i_177_;
					return;
				}
				if (i == 4016) {
					anInt2130 -= 2;
					int i_178_ = anIntArray2122[anInt2130];
					int i_179_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_178_ < i_179_ ? i_178_ : i_179_;
					return;
				}
				if (i == 4017) {
					anInt2130 -= 2;
					int i_180_ = anIntArray2122[anInt2130];
					int i_181_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = i_180_ > i_181_ ? i_180_ : i_181_;
					return;
				}
				if (i == 4018) {
					anInt2130 -= 3;
					long l = (long) anIntArray2122[anInt2130];
					long l_182_ = (long) anIntArray2122[anInt2130 + 1];
					long l_183_ = (long) anIntArray2122[anInt2130 + 2];
					anIntArray2122[anInt2130++] = (int) (l * l_183_ / l_182_);
					return;
				}
			} else if (i < 4200) {
				if (i == 4100) {
					String string = aStringArray2125[--anInt2126];
					int i_184_ = anIntArray2122[--anInt2130];
					aStringArray2125[anInt2126++] = string + i_184_;
					return;
				}
				if (i == 4101) {
					anInt2126 -= 2;
					String string = aStringArray2125[anInt2126];
					String string_185_ = aStringArray2125[anInt2126 + 1];
					aStringArray2125[anInt2126++] = string + string_185_;
					return;
				}
				if (i == 4102) {
					String string = aStringArray2125[--anInt2126];
					int i_186_ = anIntArray2122[--anInt2130];
					aStringArray2125[anInt2126++] = string + Class137.method932(true, i_186_, (byte) 103);
					return;
				}
				if (i == 4103) {
					String string = aStringArray2125[--anInt2126];
					aStringArray2125[anInt2126++] = string.toLowerCase();
					return;
				}
				if (i == 4104) {
					aStringArray2125[anInt2126++] = method981(anIntArray2122[--anInt2130]);
					return;
				}
				if (i == 4105) {
					anInt2126 -= 2;
					String string = aStringArray2125[anInt2126];
					String string_187_ = aStringArray2125[anInt2126 + 1];
					if ((((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131) != null && ((Class27) (((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131)).aBool365)
						aStringArray2125[anInt2126++] = string_187_;
					else {
						aStringArray2125[anInt2126++] = string;
						return;
					}
					return;
				}
				if (i == 4106) {
					int i_188_ = anIntArray2122[--anInt2130];
					aStringArray2125[anInt2126++] = Integer.toString(i_188_);
					return;
				}
				if (i == 4107) {
					anInt2126 -= 2;
					anIntArray2122[anInt2130++] = Class19.method191(103, aStringArray2125[anInt2126 + 1], aStringArray2125[anInt2126], Class_j.anInt1485);
					return;
				}
				if (i == 4108) {
					String string = aStringArray2125[--anInt2126];
					anInt2130 -= 2;
					int i_189_ = anIntArray2122[anInt2130];
					int i_190_ = anIntArray2122[anInt2130 + 1];
					Class73 class73 = Class129.method878(6, 0, i_190_, Class111.index13);
					anIntArray2122[anInt2130++] = class73.method466(94, Class243.aClass_lArray3448, i_189_, string);
					return;
				}
				if (i == 4109) {
					String string = aStringArray2125[--anInt2126];
					anInt2130 -= 2;
					int i_191_ = anIntArray2122[anInt2130];
					int i_192_ = anIntArray2122[anInt2130 + 1];
					Class73 class73 = Class129.method878(6, 0, i_192_, Class111.index13);
					anIntArray2122[anInt2130++] = class73.method468((byte) 123, string, i_191_, Class243.aClass_lArray3448);
					return;
				}
				if (i == 4110) {
					anInt2126 -= 2;
					String string = aStringArray2125[anInt2126];
					String string_193_ = aStringArray2125[anInt2126 + 1];
					if (anIntArray2122[--anInt2130] == 1)
						aStringArray2125[anInt2126++] = string;
					else {
						aStringArray2125[anInt2126++] = string_193_;
						return;
					}
					return;
				}
				if (i == 4111) {
					String string = aStringArray2125[--anInt2126];
					aStringArray2125[anInt2126++] = Class59_Sub3_Sub1.method2443(string, (byte) 90);
					return;
				}
				if (i == 4112) {
					String string = aStringArray2125[--anInt2126];
					int i_194_ = anIntArray2122[--anInt2130];
					if (i_194_ == -1)
						throw new RuntimeException("null char");
					aStringArray2125[anInt2126++] = string + (char) i_194_;
					return;
				}
				if (i == 4113) {
					int i_195_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class59.method402((char) i_195_, 123) ? 1 : 0;
					return;
				}
				if (i == 4114) {
					int i_196_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (Class246_Sub1_Sub13.method2700(-122, (char) i_196_) ? 1 : 0);
					return;
				}
				if (i == 4115) {
					int i_197_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class133.method895(26959, (char) i_197_) ? 1 : 0;
					return;
				}
				if (i == 4116) {
					int i_198_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Class_w.method2652((char) i_198_, false) ? 1 : 0;
					return;
				}
				if (i == 4117) {
					String string = aStringArray2125[--anInt2126];
					if (string != null)
						anIntArray2122[anInt2130++] = string.length();
					else {
						anIntArray2122[anInt2130++] = 0;
						return;
					}
					return;
				}
				if (i == 4118) {
					String string = aStringArray2125[--anInt2126];
					anInt2130 -= 2;
					int i_199_ = anIntArray2122[anInt2130];
					int i_200_ = anIntArray2122[anInt2130 + 1];
					aStringArray2125[anInt2126++] = string.substring(i_199_, i_200_);
					return;
				}
				if (i == 4119) {
					String string = aStringArray2125[--anInt2126];
					StringBuffer stringbuffer = new StringBuffer(string.length());
					boolean bool_201_ = false;
					for (int i_202_ = 0; i_202_ < string.length(); i_202_++) {
						char c = string.charAt(i_202_);
						if (c == '<')
							bool_201_ = true;
						else if (c == '>')
							bool_201_ = false;
						else if (!bool_201_)
							stringbuffer.append(c);
					}
					aStringArray2125[anInt2126++] = stringbuffer.toString();
					return;
				}
				if (i == 4120) {
					String string = aStringArray2125[--anInt2126];
					anInt2130 -= 2;
					int i_203_ = anIntArray2122[anInt2130];
					int i_204_ = anIntArray2122[anInt2130 + 1];
					anIntArray2122[anInt2130++] = string.indexOf(i_203_, i_204_);
					return;
				}
				if (i == 4121) {
					anInt2126 -= 2;
					String string = aStringArray2125[anInt2126];
					String string_205_ = aStringArray2125[anInt2126 + 1];
					int i_206_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = string.indexOf(string_205_, i_206_);
					return;
				}
				if (i == 4122) {
					int i_207_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Character.toLowerCase((char) i_207_);
					return;
				}
				if (i == 4123) {
					int i_208_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = Character.toUpperCase((char) i_208_);
					return;
				}
				if (i == 4124) {
					boolean bool_209_ = anIntArray2122[--anInt2130] != 0;
					int i_210_ = anIntArray2122[--anInt2130];
					aStringArray2125[anInt2126++] = Class188.method1235(bool_209_, (long) i_210_, 0, -121, Class_j.anInt1485);
					return;
				}
				if (i == 4125) {
					String string = aStringArray2125[--anInt2126];
					int i_211_ = anIntArray2122[--anInt2130];
					Class73 class73 = Class129.method878(6, 0, i_211_, Class111.index13);
					anIntArray2122[anInt2130++] = class73.method461(string, 67, Class243.aClass_lArray3448);
					return;
				}
			} else if (i < 4300) {
				if (i == 4200) {
					int i_212_ = anIntArray2122[--anInt2130];
					aStringArray2125[anInt2126++] = (((Class197) Class255.aClass191_3663.method1251(22883, i_212_)).aString2778);
					return;
				}
				if (i == 4201) {
					anInt2130 -= 2;
					int i_213_ = anIntArray2122[anInt2130];
					int i_214_ = anIntArray2122[anInt2130 + 1];
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_213_);
					if (i_214_ >= 1 && i_214_ <= 5 && (((Class197) class197).aStringArray2796[i_214_ - 1] != null))
						aStringArray2125[anInt2126++] = (((Class197) class197).aStringArray2796[i_214_ - 1]);
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 4202) {
					anInt2130 -= 2;
					int i_215_ = anIntArray2122[anInt2130];
					int i_216_ = anIntArray2122[anInt2130 + 1];
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_215_);
					if (i_216_ >= 1 && i_216_ <= 5 && (((Class197) class197).aStringArray2779[i_216_ - 1] != null))
						aStringArray2125[anInt2126++] = (((Class197) class197).aStringArray2779[i_216_ - 1]);
					else {
						aStringArray2125[anInt2126++] = "";
						return;
					}
					return;
				}
				if (i == 4203) {
					int i_217_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = ((Class197) Class255.aClass191_3663.method1251(22883, i_217_)).f_fb;
					return;
				}
				if (i == 4204) {
					int i_218_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class197) Class255.aClass191_3663.method1251(22883, i_218_)).f_eb == 1) ? 1 : 0;
					return;
				}
				if (i == 4205) {
					int i_219_ = anIntArray2122[--anInt2130];
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_219_);
					if (((Class197) class197).f_tb == -1 && ((Class197) class197).f_cb >= 0)
						anIntArray2122[anInt2130++] = ((Class197) class197).f_cb;
					else {
						anIntArray2122[anInt2130++] = i_219_;
						return;
					}
					return;
				}
				if (i == 4206) {
					int i_220_ = anIntArray2122[--anInt2130];
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_220_);
					if (((Class197) class197).f_tb >= 0 && ((Class197) class197).f_cb >= 0)
						anIntArray2122[anInt2130++] = ((Class197) class197).f_cb;
					else {
						anIntArray2122[anInt2130++] = i_220_;
						return;
					}
					return;
				}
				if (i == 4207) {
					int i_221_ = anIntArray2122[--anInt2130];
					anIntArray2122[anInt2130++] = (((Class197) Class255.aClass191_3663.method1251(22883, i_221_)).aBool2794) ? 1 : 0;
					return;
				}
				if (i == 4208) {
					anInt2130 -= 2;
					int i_222_ = anIntArray2122[anInt2130];
					int i_223_ = anIntArray2122[anInt2130 + 1];
					Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) -77, i_223_);
					if (class118.method810(115))
						aStringArray2125[anInt2126++] = (Class255.aClass191_3663.method1251(22883, i_222_).method1297(((Class118) class118).aString1629, -128, i_223_));
					else {
						anIntArray2122[anInt2130++] = (Class255.aClass191_3663.method1251(22883, i_222_).method1289(i_223_, -115, ((Class118) class118).anInt1634));
						return;
					}
					return;
				}
				if (i == 4209) {
					anInt2130 -= 2;
					int i_224_ = anIntArray2122[anInt2130];
					int i_225_ = anIntArray2122[anInt2130 + 1] - 1;
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_224_);
					if (((Class197) class197).anInt2790 == i_225_)
						anIntArray2122[anInt2130++] = ((Class197) class197).f_ab;
					else {
						if (((Class197) class197).anInt2816 == i_225_)
							anIntArray2122[anInt2130++] = ((Class197) class197).anInt2765;
						else {
							anIntArray2122[anInt2130++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (i == 4210) {
					String string = aStringArray2125[--anInt2126];
					int i_226_ = anIntArray2122[--anInt2130];
					Class133.method897((byte) 105, string, i_226_ == 1);
					anIntArray2122[anInt2130++] = Class246_Sub38.anInt5445;
					return;
				}
				if (i == 4211) {
					if (Class102.aShortArray1323 == null || Class22.anInt324 >= Class246_Sub38.anInt5445)
						anIntArray2122[anInt2130++] = -1;
					else {
						anIntArray2122[anInt2130++] = (Class102.aShortArray1323[Class22.anInt324++] & 0xffff);
						return;
					}
					return;
				}
				if (i == 4212) {
					Class22.anInt324 = 0;
					return;
				}
			} else if (i < 4400) {
				if (i == 4300) {
					anInt2130 -= 2;
					int i_227_ = anIntArray2122[anInt2130];
					int i_228_ = anIntArray2122[anInt2130 + 1];
					Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) -80, i_228_);
					if (class118.method810(115))
						aStringArray2125[anInt2126++] = (Class179.aClass228_2518.method1462(i_227_, 1).method1629((byte) -116, ((Class118) class118).aString1629, i_228_));
					else {
						anIntArray2122[anInt2130++] = (Class179.aClass228_2518.method1462(i_227_, 1).method1632(((Class118) class118).anInt1634, i_228_, 0));
						return;
					}
					return;
				}
			} else if (i < 4500) {
				if (i == 4400) {
					anInt2130 -= 2;
					int i_229_ = anIntArray2122[anInt2130];
					int i_230_ = anIntArray2122[anInt2130 + 1];
					Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) 123, i_230_);
					if (class118.method810(115))
						aStringArray2125[anInt2126++] = (Class143.aClass251_2067.method1610(i_229_, 0).method1218(-126, ((Class118) class118).aString1629, i_230_));
					else {
						anIntArray2122[anInt2130++] = (Class143.aClass251_2067.method1610(i_229_, 0).method1206(i_230_, (byte) 85, ((Class118) class118).anInt1634));
						return;
					}
					return;
				}
			} else if (i < 4600) {
				if (i == 4500) {
					anInt2130 -= 2;
					int i_231_ = anIntArray2122[anInt2130];
					int i_232_ = anIntArray2122[anInt2130 + 1];
					Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) 116, i_232_);
					if (class118.method810(115))
						aStringArray2125[anInt2126++] = (Class246_Sub28_Sub25.aClass57_6702.method396(i_231_, -24).method2831(-16471, ((Class118) class118).aString1629, i_232_));
					else {
						anIntArray2122[anInt2130++] = (Class246_Sub28_Sub25.aClass57_6702.method396(i_231_, -24).method2830(((Class118) class118).anInt1634, 76, i_232_));
						return;
					}
					return;
				}
			} else if (i < 4700 && i == 4600) {
				int i_233_ = anIntArray2122[--anInt2130];
				Class135 class135 = Class118.aClass_v1641.method694(false, i_233_);
				if (((Class135) class135).anIntArray1910 != null && ((Class135) class135).anIntArray1910.length > 0) {
					int i_234_ = 0;
					int i_235_ = ((Class135) class135).anIntArray1916[0];
					for (int i_236_ = 1; i_236_ < ((Class135) class135).anIntArray1910.length; i_236_++) {
						if (((Class135) class135).anIntArray1916[i_236_] > i_235_) {
							i_234_ = i_236_;
							i_235_ = ((Class135) class135).anIntArray1916[i_236_];
						}
					}
					anIntArray2122[anInt2130++] = ((Class135) class135).anIntArray1910[i_234_];
				} else {
					anIntArray2122[anInt2130++] = ((Class135) class135).anInt1885;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException();
	}

	private static final void method983(int i) {
		Class235 class235 = Class220.method1423(0, i);
		if (class235 != null) {
			int i_237_ = i >>> 16;
			Class235[] class235s = Class14.aClass235ArrayArray225[i_237_];
			if (class235s == null) {
				Class235[] class235s_238_ = Class246_Sub32.aClass235ArrayArray5049[i_237_];
				int i_239_ = class235s_238_.length;
				class235s = Class14.aClass235ArrayArray225[i_237_] = new Class235[i_239_];
				Class117.method807(class235s_238_, 0, class235s, 0, class235s_238_.length);
			}
			int i_240_;
			for (i_240_ = 0; i_240_ < class235s.length; i_240_++) {
				if (class235s[i_240_] == class235)
					break;
			}
			if (i_240_ < class235s.length) {
				Class117.method807(class235s, i_240_ + 1, class235s, i_240_, class235s.length - i_240_ - 1);
				class235s[class235s.length - 1] = class235;
			}
		}
	}

	private static final void method984(int i) {
		Class235 class235 = Class220.method1423(0, i);
		if (class235 != null) {
			int i_241_ = i >>> 16;
			Class235[] class235s = Class14.aClass235ArrayArray225[i_241_];
			if (class235s == null) {
				Class235[] class235s_242_ = Class246_Sub32.aClass235ArrayArray5049[i_241_];
				int i_243_ = class235s_242_.length;
				class235s = Class14.aClass235ArrayArray225[i_241_] = new Class235[i_243_];
				Class117.method807(class235s_242_, 0, class235s, 0, class235s_242_.length);
			}
			int i_244_;
			for (i_244_ = 0; i_244_ < class235s.length; i_244_++) {
				if (class235s[i_244_] == class235)
					break;
			}
			if (i_244_ < class235s.length) {
				Class117.method807(class235s, 0, class235s, 1, i_244_);
				class235s[0] = class235;
			}
		}
	}

	private static final void method985(String string, int i) {
		if (Class260_Sub2.anInt4289 != 0 || ((!Class59.aBool820 || Class_u.aBool4703) && !Class168.aBool2395)) {
			String string_245_ = string.toLowerCase();
			int i_246_ = 0;
			if (string_245_.startsWith(Class_q.aClass67_4686.method436(true, 0))) {
				i_246_ = 0;
				string = string.substring(Class_q.aClass67_4686.method436(true, 0).length());
			} else if (string_245_.startsWith(Class232.aClass67_3178.method436(true, 0))) {
				i_246_ = 1;
				string = string.substring(Class232.aClass67_3178.method436(true, 0).length());
			} else if (string_245_.startsWith(Class246_Sub1_Sub10.aClass67_6224.method436(true, 0))) {
				i_246_ = 2;
				string = string.substring(Class246_Sub1_Sub10.aClass67_6224.method436(true, 0).length());
			} else if (string_245_.startsWith(Class83.aClass67_1081.method436(true, 0))) {
				i_246_ = 3;
				string = string.substring(Class83.aClass67_1081.method436(true, 0).length());
			} else if (string_245_.startsWith(Class188_Sub1.aClass67_3924.method436(true, 0))) {
				i_246_ = 4;
				string = string.substring(Class188_Sub1.aClass67_3924.method436(true, 0).length());
			} else if (string_245_.startsWith(Class_v.aClass67_1447.method436(true, 0))) {
				i_246_ = 5;
				string = string.substring(Class_v.aClass67_1447.method436(true, 0).length());
			} else if (string_245_.startsWith(Class130_Sub1_Sub1.aClass67_7047.method436(true, 0))) {
				i_246_ = 6;
				string = string.substring(Class130_Sub1_Sub1.aClass67_7047.method436(true, 0).length());
			} else if (string_245_.startsWith(Class231.aClass67_3171.method436(true, 0))) {
				i_246_ = 7;
				string = string.substring(Class231.aClass67_3171.method436(true, 0).length());
			} else if (string_245_.startsWith(Class246_Sub1_Sub9.aClass67_6177.method436(true, 0))) {
				i_246_ = 8;
				string = string.substring(Class246_Sub1_Sub9.aClass67_6177.method436(true, 0).length());
			} else if (string_245_.startsWith(Class102.aClass67_1320.method436(true, 0))) {
				i_246_ = 9;
				string = string.substring(Class102.aClass67_1320.method436(true, 0).length());
			} else if (string_245_.startsWith(Class61.aClass67_844.method436(true, 0))) {
				i_246_ = 10;
				string = string.substring(Class61.aClass67_844.method436(true, 0).length());
			} else if (string_245_.startsWith(Class246_Sub28_Sub21.aClass67_6576.method436(true, 0))) {
				i_246_ = 11;
				string = string.substring(Class246_Sub28_Sub21.aClass67_6576.method436(true, 0).length());
			} else if (Class_j.anInt1485 != 0) {
				if (string_245_.startsWith(Class_q.aClass67_4686.method436(true, Class_j.anInt1485))) {
					i_246_ = 0;
					string = string.substring(Class_q.aClass67_4686.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class232.aClass67_3178.method436(true, Class_j.anInt1485))) {
					i_246_ = 1;
					string = string.substring(Class232.aClass67_3178.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class246_Sub1_Sub10.aClass67_6224.method436(true, Class_j.anInt1485))) {
					i_246_ = 2;
					string = string.substring(Class246_Sub1_Sub10.aClass67_6224.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class83.aClass67_1081.method436(true, Class_j.anInt1485))) {
					i_246_ = 3;
					string = string.substring(Class83.aClass67_1081.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class188_Sub1.aClass67_3924.method436(true, Class_j.anInt1485))) {
					i_246_ = 4;
					string = string.substring(Class188_Sub1.aClass67_3924.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class_v.aClass67_1447.method436(true, Class_j.anInt1485))) {
					i_246_ = 5;
					string = string.substring(Class_v.aClass67_1447.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class130_Sub1_Sub1.aClass67_7047.method436(true, Class_j.anInt1485))) {
					i_246_ = 6;
					string = string.substring(Class130_Sub1_Sub1.aClass67_7047.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class231.aClass67_3171.method436(true, Class_j.anInt1485))) {
					i_246_ = 7;
					string = string.substring(Class231.aClass67_3171.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class246_Sub1_Sub9.aClass67_6177.method436(true, Class_j.anInt1485))) {
					i_246_ = 8;
					string = string.substring(Class246_Sub1_Sub9.aClass67_6177.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class102.aClass67_1320.method436(true, Class_j.anInt1485))) {
					i_246_ = 9;
					string = string.substring(Class102.aClass67_1320.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class61.aClass67_844.method436(true, Class_j.anInt1485))) {
					i_246_ = 10;
					string = string.substring(Class61.aClass67_844.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class246_Sub28_Sub21.aClass67_6576.method436(true, Class_j.anInt1485))) {
					i_246_ = 11;
					string = string.substring(Class246_Sub28_Sub21.aClass67_6576.method436(true, Class_j.anInt1485).length());
				}
			}
			string_245_ = string.toLowerCase();
			int i_247_ = 0;
			if (string_245_.startsWith(Class133.aClass67_1843.method436(true, 0))) {
				i_247_ = 1;
				string = string.substring(Class133.aClass67_1843.method436(true, 0).length());
			} else if (string_245_.startsWith(Class53.aClass67_754.method436(true, 0))) {
				i_247_ = 2;
				string = string.substring(Class53.aClass67_754.method436(true, 0).length());
			} else if (string_245_.startsWith(Class216.aClass67_3006.method436(true, 0))) {
				i_247_ = 3;
				string = string.substring(Class216.aClass67_3006.method436(true, 0).length());
			} else if (string_245_.startsWith(Class83.aClass67_1084.method436(true, 0))) {
				i_247_ = 4;
				string = string.substring(Class83.aClass67_1084.method436(true, 0).length());
			} else if (string_245_.startsWith(Class159.aClass67_2259.method436(true, 0))) {
				i_247_ = 5;
				string = string.substring(Class159.aClass67_2259.method436(true, 0).length());
			} else if (Class_j.anInt1485 != 0) {
				if (string_245_.startsWith(Class133.aClass67_1843.method436(true, Class_j.anInt1485))) {
					i_247_ = 1;
					string = string.substring(Class133.aClass67_1843.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class53.aClass67_754.method436(true, Class_j.anInt1485))) {
					i_247_ = 2;
					string = string.substring(Class53.aClass67_754.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class216.aClass67_3006.method436(true, Class_j.anInt1485))) {
					i_247_ = 3;
					string = string.substring(Class216.aClass67_3006.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class83.aClass67_1084.method436(true, Class_j.anInt1485))) {
					i_247_ = 4;
					string = string.substring(Class83.aClass67_1084.method436(true, Class_j.anInt1485).length());
				} else if (string_245_.startsWith(Class159.aClass67_2259.method436(true, Class_j.anInt1485))) {
					i_247_ = 5;
					string = string.substring(Class159.aClass67_2259.method436(true, Class_j.anInt1485).length());
				}
			}
			anInt2119++;
			Class243.writePacket(-59, Class246_Sub6.aClass201_3940);
			Class130_Sub1.stream.writeByte(255, 0);
			int i_248_ = ((BufferStream) Class130_Sub1.stream).position;
			if (i == 5021)
				Class130_Sub1.stream.writeByte(255, 1);
			else if (i == 5022)
				Class130_Sub1.stream.writeByte(255, 2);
			else
				Class130_Sub1.stream.writeByte(255, 0);
			Class130_Sub1.stream.writeByte(255, i_246_);
			Class130_Sub1.stream.writeByte(255, i_247_);
			Class59_Sub3_Sub4.method2867(string, 0, Class130_Sub1.stream);
			Class130_Sub1.stream.method2408(-1591647264, ((BufferStream) Class130_Sub1.stream).position - i_248_);
		}
	}

	public static void method986() {
		anIntArray2114 = null;
		aStringArray2138 = null;
		anIntArray2136 = null;
		anIntArrayArray2127 = null;
		anIntArray2122 = null;
		aStringArray2125 = null;
		aClass_bArray2133 = null;
		aClass235_2123 = null;
		aClass235_2134 = null;
		aClass244_2120 = null;
		aCalendar2132 = null;
		aStringArray2141 = null;
		anIntArray2140 = null;
		aClass54_2139 = null;
	}

	static final void method987() {
		/* empty */
	}

	static final void method988(Class246_Sub29 class246_sub29) {
		method980(class246_sub29, 200000);
	}

	static final void method989(int i, boolean bool) {
		/* empty */
	}

	private static final void method990(CS2Script class246_sub1_sub1, int i) {
		anInt2130 = 0;
		anInt2126 = 0;
		int i_249_ = -1;
		int[] is = ((CS2Script) class246_sub1_sub1).opcodes;
		int[] is_250_ = ((CS2Script) class246_sub1_sub1).integerOperands;
		int i_251_ = -1;
		anInt2137 = 0;
		try {
			int i_252_ = 0;
			for (;;) {
				if (++i_252_ > i)
					throw new RuntimeException("slow");
				i_251_ = is[++i_249_];
				if (i_251_ < 100) {
					if (i_251_ == 0)
						anIntArray2122[anInt2130++] = is_250_[i_249_];
					else if (i_251_ == 1) {
						int i_253_ = is_250_[i_249_];
						anIntArray2122[anInt2130++] = (((Class95) Class246_Sub28_Sub23.aClass95_6658).varps[i_253_]);
					} else if (i_251_ == 2) {
						int i_254_ = is_250_[i_249_];
						Class246_Sub28_Sub23.aClass95_6658.setIntVarp(0, anIntArray2122[--anInt2130], i_254_);
					} else if (i_251_ == 3)
						aStringArray2125[anInt2126++] = (((CS2Script) class246_sub1_sub1).stringOperands[i_249_]);
					else if (i_251_ == 6)
						i_249_ += is_250_[i_249_];
					else if (i_251_ == 7) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] != anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 8) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] == anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 9) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] < anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 10) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] > anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 21) {
						if (anInt2137 == 0)
							return;
						Class_b class_b = aClass_bArray2133[--anInt2137];
						class246_sub1_sub1 = ((Class_b) class_b).aClass246_Sub1_Sub1_1160;
						is = (((CS2Script) class246_sub1_sub1).opcodes);
						is_250_ = (((CS2Script) class246_sub1_sub1).integerOperands);
						i_249_ = ((Class_b) class_b).anInt1165;
						anIntArray2114 = ((Class_b) class_b).anIntArray1163;
						aStringArray2138 = ((Class_b) class_b).aStringArray1164;
					} else if (i_251_ == 25) {
						int i_255_ = is_250_[i_249_];
						anIntArray2122[anInt2130++] = Class246_Sub28_Sub23.aClass95_6658.method34((byte) 45, i_255_);
					} else if (i_251_ == 27) {
						int i_256_ = is_250_[i_249_];
						Class246_Sub28_Sub23.aClass95_6658.method611(i_256_, (byte) 108, anIntArray2122[--anInt2130]);
					} else if (i_251_ == 31) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] <= anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 32) {
						anInt2130 -= 2;
						if (anIntArray2122[anInt2130] >= anIntArray2122[anInt2130 + 1])
							i_249_ += is_250_[i_249_];
					} else if (i_251_ == 33)
						anIntArray2122[anInt2130++] = anIntArray2114[is_250_[i_249_]];
					else if (i_251_ == 34)
						anIntArray2114[is_250_[i_249_]] = anIntArray2122[--anInt2130];
					else if (i_251_ == 35)
						aStringArray2125[anInt2126++] = aStringArray2138[is_250_[i_249_]];
					else if (i_251_ == 36)
						aStringArray2138[is_250_[i_249_]] = aStringArray2125[--anInt2126];
					else if (i_251_ == 37) {
						int i_257_ = is_250_[i_249_];
						anInt2126 -= i_257_;
						String string = Class244.method1571(anInt2126, aStringArray2125, (byte) 123, i_257_);
						aStringArray2125[anInt2126++] = string;
					} else if (i_251_ == 38)
						anInt2130--;
					else if (i_251_ == 39)
						anInt2126--;
					else if (i_251_ == 40) {
						int i_258_ = is_250_[i_249_];
						CS2Script class246_sub1_sub1_259_ = Class113.getScript(i_258_, 71);
						if (class246_sub1_sub1_259_ == null)
							throw new RuntimeException();
						int[] is_260_ = (new int[(((CS2Script) class246_sub1_sub1_259_).integerVariableCount)]);
						String[] strings = (new String[(((CS2Script) class246_sub1_sub1_259_).stringVariableCount)]);
						for (int i_261_ = 0; (i_261_ < (((CS2Script) class246_sub1_sub1_259_).integerArgumentCount)); i_261_++)
							is_260_[i_261_] = (anIntArray2122[anInt2130 - (((CS2Script) class246_sub1_sub1_259_).integerArgumentCount) + i_261_]);
						for (int i_262_ = 0; (i_262_ < (((CS2Script) class246_sub1_sub1_259_).stringArgumentCount)); i_262_++)
							strings[i_262_] = (aStringArray2125[anInt2126 - (((CS2Script) class246_sub1_sub1_259_).stringArgumentCount) + i_262_]);
						anInt2130 -= (((CS2Script) class246_sub1_sub1_259_).integerArgumentCount);
						anInt2126 -= (((CS2Script) class246_sub1_sub1_259_).stringArgumentCount);
						Class_b class_b = new Class_b();
						((Class_b) class_b).aClass246_Sub1_Sub1_1160 = class246_sub1_sub1;
						((Class_b) class_b).anInt1165 = i_249_;
						((Class_b) class_b).anIntArray1163 = anIntArray2114;
						((Class_b) class_b).aStringArray1164 = aStringArray2138;
						if (anInt2137 >= aClass_bArray2133.length)
							throw new RuntimeException();
						aClass_bArray2133[anInt2137++] = class_b;
						class246_sub1_sub1 = class246_sub1_sub1_259_;
						is = (((CS2Script) class246_sub1_sub1).opcodes);
						is_250_ = (((CS2Script) class246_sub1_sub1).integerOperands);
						i_249_ = -1;
						anIntArray2114 = is_260_;
						aStringArray2138 = strings;
					} else if (i_251_ == 42)
						anIntArray2122[anInt2130++] = (Class246_Sub1_Sub11.anIntArray6246[is_250_[i_249_]]);
					else if (i_251_ == 43) {
						int i_263_ = is_250_[i_249_];
						Class246_Sub1_Sub11.anIntArray6246[i_263_] = anIntArray2122[--anInt2130];
						Class18.method175(i_263_, -117);
						Class246_Sub28_Sub10.aBool6159 |= Class59_Sub3_Sub1.aBoolArray5739[i_263_];
					} else if (i_251_ == 44) {
						int i_264_ = is_250_[i_249_] >> 16;
						int i_265_ = is_250_[i_249_] & 0xffff;
						int i_266_ = anIntArray2122[--anInt2130];
						if (i_266_ < 0 || i_266_ > 5000)
							throw new RuntimeException();
						anIntArray2136[i_264_] = i_266_;
						int i_267_ = -1;
						if (i_265_ == 105)
							i_267_ = 0;
						for (int i_268_ = 0; i_268_ < i_266_; i_268_++)
							anIntArrayArray2127[i_264_][i_268_] = i_267_;
					} else if (i_251_ == 45) {
						int i_269_ = is_250_[i_249_];
						int i_270_ = anIntArray2122[--anInt2130];
						if (i_270_ < 0 || i_270_ >= anIntArray2136[i_269_])
							throw new RuntimeException();
						anIntArray2122[anInt2130++] = anIntArrayArray2127[i_269_][i_270_];
					} else if (i_251_ == 46) {
						int i_271_ = is_250_[i_249_];
						anInt2130 -= 2;
						int i_272_ = anIntArray2122[anInt2130];
						if (i_272_ < 0 || i_272_ >= anIntArray2136[i_271_])
							throw new RuntimeException();
						anIntArrayArray2127[i_271_][i_272_] = anIntArray2122[anInt2130 + 1];
					} else if (i_251_ == 47) {
						String string = Class142.aStringArray2062[is_250_[i_249_]];
						if (string == null)
							string = "null";
						aStringArray2125[anInt2126++] = string;
					} else if (i_251_ == 48) {
						int i_273_ = is_250_[i_249_];
						Class142.aStringArray2062[i_273_] = aStringArray2125[--anInt2126];
						Class130_Sub6.method2102(2, i_273_);
					} else if (i_251_ == 51) {
						Class85 class85 = (((CS2Script) class246_sub1_sub1).switchBlocks[is_250_[i_249_]]);
						IntegerNode class246_sub33 = ((IntegerNode) class85.method544((long) (anIntArray2122[--anInt2130]), 127));
						if (class246_sub33 != null)
							i_249_ += ((IntegerNode) class246_sub33).value;
					}
				} else {
					boolean bool;
					if (is_250_[i_249_] == 1)
						bool = true;
					else
						bool = false;
					if (i_251_ >= 100 && i_251_ < 5000)
						method982(i_251_, bool);
					else {
						if (i_251_ < 5000 || i_251_ >= 10000)
							break;
						method992(i_251_, bool);
					}
				}
			}
			throw new IllegalStateException("Command: " + i_251_);
		} catch (Exception exception) {
			if (((CS2Script) class246_sub1_sub1).name != null) {
				Class_v.method692((byte) -99, ("Clientscript error in: " + (((CS2Script) class246_sub1_sub1).name)));
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript error in: ").append(((CS2Script) class246_sub1_sub1).name).append("\n");
				for (int i_274_ = anInt2137 - 1; i_274_ >= 0; i_274_--)
					stringbuffer.append("via: ").append(((CS2Script) (((Class_b) aClass_bArray2133[i_274_]).aClass246_Sub1_Sub1_1160)).name).append("\n");
				stringbuffer.append("Op: ").append(i_251_).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0)
					stringbuffer.append("Message: ").append(string).append("\n");
				Class194_Sub1.method1883(exception, stringbuffer.toString(), -79);
				Class252.printConsoleMessage(126, stringbuffer.toString());
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ").append(((Node) class246_sub1_sub1).hash).append(" ");
				for (int i_275_ = anInt2137 - 1; i_275_ >= 0; i_275_--)
					stringbuffer.append("v: ").append(((Node) (((Class_b) aClass_bArray2133[i_275_]).aClass246_Sub1_Sub1_1160)).hash).append(" ");
				stringbuffer.append("op: ").append(i_251_);
				Class194_Sub1.method1883(exception, stringbuffer.toString(), -80);
			}
		}
	}

	static final void method991(int i) {
		if (i != -1 && Class246_Sub13.method1992(-125, i)) {
			Class235[] class235s = Class246_Sub32.aClass235ArrayArray5049[i];
			for (int i_276_ = 0; i_276_ < class235s.length; i_276_++) {
				Class235 class235 = class235s[i_276_];
				if (((Class235) class235).f_ac != null) {
					Class246_Sub29 class246_sub29 = new Class246_Sub29();
					((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
					((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_ac;
					method980(class246_sub29, 2000000);
				}
			}
		}
	}

	private static final void method992(int i, boolean bool) {
		if (i < 5100) {
			if (i == 5000) {
				anIntArray2122[anInt2130++] = Class7.anInt95;
				return;
			}
			if (i == 5001) {
				anInt2130 -= 3;
				Class7.anInt95 = anIntArray2122[anInt2130];
				Class246_Sub18.aClass87_4677 = Class1.method36(0, anIntArray2122[anInt2130 + 1]);
				if (Class246_Sub18.aClass87_4677 == null)
					Class246_Sub18.aClass87_4677 = Class43.aClass87_638;
				Class_l_Sub2.anInt5475 = anIntArray2122[anInt2130 + 2];
				anInt2116++;
				Class243.writePacket(-101, Class187_Sub2.aClass201_5426);
				Class130_Sub1.stream.writeByte(255, Class7.anInt95);
				Class130_Sub1.stream.writeByte(255, ((Class87) Class246_Sub18.aClass87_4677).anInt1146);
				Class130_Sub1.stream.writeByte(255, Class_l_Sub2.anInt5475);
				return;
			}
			if (i == 5002) {
				anInt2126 -= 2;
				String string = aStringArray2125[anInt2126];
				String string_277_ = aStringArray2125[anInt2126 + 1];
				anInt2130 -= 2;
				int i_278_ = anIntArray2122[anInt2130];
				int i_279_ = anIntArray2122[anInt2130 + 1];
				if (string_277_ == null)
					string_277_ = "";
				if (string_277_.length() > 80)
					string_277_ = string_277_.substring(0, 80);
				anInt2121++;
				Class243.writePacket(-114, Class211_Sub1_Sub2.aClass201_6528);
				Class130_Sub1.stream.writeByte(255, (Class145.method978(string, (byte) -92) + 2 + Class145.method978(string_277_, (byte) -128)));
				Class130_Sub1.stream.writeString(91, string);
				Class130_Sub1.stream.writeByte(255, i_278_ - 1);
				Class130_Sub1.stream.writeByte(255, i_279_);
				Class130_Sub1.stream.writeString(125, string_277_);
				return;
			}
			if (i == 5003) {
				int i_280_ = anIntArray2122[--anInt2130];
				String string = null;
				if (i_280_ < 100)
					string = Class246_Sub1_Sub2.aStringArray5688[i_280_];
				if (string == null)
					string = "";
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5004) {
				int i_281_ = anIntArray2122[--anInt2130];
				int i_282_ = -1;
				if (i_281_ < 100 && Class246_Sub1_Sub2.aStringArray5688[i_281_] != null)
					i_282_ = Class186.anIntArray2639[i_281_];
				anIntArray2122[anInt2130++] = i_282_;
				return;
			}
			if (i == 5005) {
				if (Class246_Sub18.aClass87_4677 == null)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = ((Class87) Class246_Sub18.aClass87_4677).anInt1146;
					return;
				}
				return;
			}
			if (i == 5008 || i == 5021 || i == 5022) {
				String string = aStringArray2125[--anInt2126];
				method985(string, i);
				return;
			}
			if (i == 5009) {
				anInt2126 -= 2;
				String string = aStringArray2125[anInt2126];
				String string_283_ = aStringArray2125[anInt2126 + 1];
				if (Class260_Sub2.anInt4289 != 0 || ((!Class59.aBool820 || Class_u.aBool4703) && !Class168.aBool2395)) {
					anInt2124++;
					Class243.writePacket(-70, Class170.aClass201_2420);
					Class130_Sub1.stream.writeByte(255, 0);
					int i_284_ = ((BufferStream) Class130_Sub1.stream).position;
					Class130_Sub1.stream.writeString(85, string);
					Class59_Sub3_Sub4.method2867(string_283_, 0, (Class130_Sub1.stream));
					Class130_Sub1.stream.method2408(-1591647264, (((BufferStream) Class130_Sub1.stream).position - i_284_));
					return;
				}
				return;
			}
			if (i == 5010) {
				int i_285_ = anIntArray2122[--anInt2130];
				String string = null;
				if (i_285_ < 100)
					string = Class196.aStringArray2750[i_285_];
				if (string == null)
					string = "";
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5011) {
				int i_286_ = anIntArray2122[--anInt2130];
				String string = null;
				if (i_286_ < 100)
					string = Class246_Sub41_Sub2.aStringArray6478[i_286_];
				if (string == null)
					string = "";
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5012) {
				int i_287_ = anIntArray2122[--anInt2130];
				int i_288_ = -1;
				if (i_287_ < 100)
					i_288_ = Class246_Sub22.anIntArray4773[i_287_];
				anIntArray2122[anInt2130++] = i_288_;
				return;
			}
			if (i == 5015) {
				String string;
				if (Class_a.aClass_r_Sub1_1180 != null && (((Player) Class_a.aClass_r_Sub1_1180).aString7123 != null))
					string = Class_a.aClass_r_Sub1_1180.method2915(120, true);
				else
					string = Class1.aString3;
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5016) {
				anIntArray2122[anInt2130++] = Class_l_Sub2.anInt5475;
				return;
			}
			if (i == 5017) {
				anIntArray2122[anInt2130++] = Class224.anInt3092;
				return;
			}
			if (i == 5018) {
				int i_289_ = anIntArray2122[--anInt2130];
				int i_290_ = 0;
				if (i_289_ < 100 && Class246_Sub1_Sub2.aStringArray5688[i_289_] != null)
					i_290_ = Class186.anIntArray2639[i_289_];
				anIntArray2122[anInt2130++] = i_290_;
				return;
			}
			if (i == 5019) {
				int i_291_ = anIntArray2122[--anInt2130];
				String string = null;
				if (i_291_ < 100)
					string = Class246_Sub15.aStringArray4446[i_291_];
				if (string == null)
					string = "";
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5020) {
				String string;
				if (Class_a.aClass_r_Sub1_1180 != null && (((Player) Class_a.aClass_r_Sub1_1180).aString7123 != null))
					string = Class_a.aClass_r_Sub1_1180.method2919(false, 1);
				else
					string = Class1.aString3;
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5050) {
				int i_292_ = anIntArray2122[--anInt2130];
				aStringArray2125[anInt2126++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096.method329(i_292_, (byte) 96)).aString6693);
				return;
			}
			if (i == 5051) {
				int i_293_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_293_, (byte) -114);
				if (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698 == null)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698).length;
					return;
				}
				return;
			}
			if (i == 5052) {
				anInt2130 -= 2;
				int i_294_ = anIntArray2122[anInt2130];
				int i_295_ = anIntArray2122[anInt2130 + 1];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_294_, (byte) 107);
				int i_296_ = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6698[i_295_]);
				anIntArray2122[anInt2130++] = i_296_;
				return;
			}
			if (i == 5053) {
				int i_297_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub16 class246_sub1_sub16 = Class224.aClass50_3096.method329(i_297_, (byte) -98);
				if (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6684 == null)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub16) class246_sub1_sub16).anIntArray6684).length;
					return;
				}
				return;
			}
			if (i == 5054) {
				anInt2130 -= 2;
				int i_298_ = anIntArray2122[anInt2130];
				int i_299_ = anIntArray2122[anInt2130 + 1];
				anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096.method329(i_298_, (byte) 113)).anIntArray6684[i_299_]);
				return;
			}
			if (i == 5055) {
				int i_300_ = anIntArray2122[--anInt2130];
				aStringArray2125[anInt2126++] = Class128_Sub1.aClass65_5558.method428(i_300_, (byte) -99).method2431(0);
				return;
			}
			if (i == 5056) {
				int i_301_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub3 class246_sub1_sub3 = Class128_Sub1.aClass65_5558.method428(i_301_, (byte) -99);
				if (((Class246_Sub1_Sub3) class246_sub1_sub3).anIntArray5699 == null)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub3) class246_sub1_sub3).anIntArray5699).length;
					return;
				}
				return;
			}
			if (i == 5057) {
				anInt2130 -= 2;
				int i_302_ = anIntArray2122[anInt2130];
				int i_303_ = anIntArray2122[anInt2130 + 1];
				anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub3) Class128_Sub1.aClass65_5558.method428(i_302_, (byte) -99)).anIntArray5699[i_303_]);
				return;
			}
			if (i == 5058) {
				aClass244_2120 = new Class244();
				((Class244) aClass244_2120).anInt3449 = anIntArray2122[--anInt2130];
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450 = Class128_Sub1.aClass65_5558.method428((((Class244) aClass244_2120).anInt3449), (byte) -99);
				((Class244) aClass244_2120).anIntArray3452 = new int[((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2435(0)];
				return;
			}
			if (i == 5059) {
				anInt2115++;
				Class243.writePacket(-69, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_304_ = ((BufferStream) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeByte(255, 0);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 50, ((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((BufferStream) Class130_Sub1.stream).position - i_304_);
				return;
			}
			if (i == 5060) {
				String string = aStringArray2125[--anInt2126];
				anInt2128++;
				Class243.writePacket(-65, Class260_Sub2.SEND_FRIEND_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_305_ = ((BufferStream) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeString(69, string);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 27, ((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((BufferStream) Class130_Sub1.stream).position - i_305_);
				return;
			}
			if (i == 5061) {
				anInt2115++;
				Class243.writePacket(-123, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_306_ = ((BufferStream) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeByte(255, 1);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 39, ((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((BufferStream) Class130_Sub1.stream).position - i_306_);
				return;
			}
			if (i == 5062) {
				anInt2130 -= 2;
				int i_307_ = anIntArray2122[anInt2130];
				int i_308_ = anIntArray2122[anInt2130 + 1];
				anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096.method329(i_307_, (byte) 79)).aCharArray6688[i_308_]);
				return;
			}
			if (i == 5063) {
				anInt2130 -= 2;
				int i_309_ = anIntArray2122[anInt2130];
				int i_310_ = anIntArray2122[anInt2130 + 1];
				anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub16) Class224.aClass50_3096.method329(i_309_, (byte) 81)).aCharArray6696[i_310_]);
				return;
			}
			if (i == 5064) {
				anInt2130 -= 2;
				int i_311_ = anIntArray2122[anInt2130];
				int i_312_ = anIntArray2122[anInt2130 + 1];
				if (i_312_ == -1)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = Class224.aClass50_3096.method329(i_311_, (byte) -59).method2744((char) i_312_, (byte) -112);
					return;
				}
				return;
			}
			if (i == 5065) {
				anInt2130 -= 2;
				int i_313_ = anIntArray2122[anInt2130];
				int i_314_ = anIntArray2122[anInt2130 + 1];
				if (i_314_ == -1)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = Class224.aClass50_3096.method329(i_313_, (byte) 119).method2742((char) i_314_, (byte) -88);
					return;
				}
				return;
			}
			if (i == 5066) {
				int i_315_ = anIntArray2122[--anInt2130];
				anIntArray2122[anInt2130++] = Class128_Sub1.aClass65_5558.method428(i_315_, (byte) -99).method2435(0);
				return;
			}
			if (i == 5067) {
				anInt2130 -= 2;
				int i_316_ = anIntArray2122[anInt2130];
				int i_317_ = anIntArray2122[anInt2130 + 1];
				int i_318_ = (((Class81) Class128_Sub1.aClass65_5558.method428(i_316_, (byte) -99).method2428(i_317_, 30)).anInt1065);
				anIntArray2122[anInt2130++] = i_318_;
				return;
			}
			if (i == 5068) {
				anInt2130 -= 2;
				int i_319_ = anIntArray2122[anInt2130];
				int i_320_ = anIntArray2122[anInt2130 + 1];
				((Class244) aClass244_2120).anIntArray3452[i_319_] = i_320_;
				return;
			}
			if (i == 5069) {
				anInt2130 -= 2;
				int i_321_ = anIntArray2122[anInt2130];
				int i_322_ = anIntArray2122[anInt2130 + 1];
				((Class244) aClass244_2120).anIntArray3452[i_321_] = i_322_;
				return;
			}
			if (i == 5070) {
				anInt2130 -= 3;
				int i_323_ = anIntArray2122[anInt2130];
				int i_324_ = anIntArray2122[anInt2130 + 1];
				int i_325_ = anIntArray2122[anInt2130 + 2];
				Class246_Sub1_Sub3 class246_sub1_sub3 = Class128_Sub1.aClass65_5558.method428(i_323_, (byte) -99);
				if ((((Class81) class246_sub1_sub3.method2428(i_324_, 42)).anInt1065) != 0)
					throw new RuntimeException("bad command");
				anIntArray2122[anInt2130++] = class246_sub1_sub3.method2429(i_325_, false, i_324_);
				return;
			}
			if (i == 5071) {
				String string = aStringArray2125[--anInt2126];
				boolean bool_326_ = anIntArray2122[--anInt2130] == 1;
				Class100_Sub1.method2177(bool_326_, 32768, string);
				anIntArray2122[anInt2130++] = Class246_Sub38.anInt5445;
				return;
			}
			if (i == 5072) {
				if (Class102.aShortArray1323 == null || Class22.anInt324 >= Class246_Sub38.anInt5445)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = (Class102.aShortArray1323[Class22.anInt324++] & 0xffff);
					return;
				}
				return;
			}
			if (i == 5073) {
				Class22.anInt324 = 0;
				return;
			}
			if (i == 5074) {
				anInt2115++;
				Class243.writePacket(-104, Class246_Sub1_Sub14.PUBLIC_QUICK_CHAT_PACKET);
				Class130_Sub1.stream.writeByte(255, 0);
				int i_327_ = ((BufferStream) Class130_Sub1.stream).position;
				Class130_Sub1.stream.writeByte(255, 2);
				Class130_Sub1.stream.writeShort((byte) 67, (((Class244) aClass244_2120).anInt3449));
				((Class244) aClass244_2120).aClass246_Sub1_Sub3_3450.method2433((byte) 41, ((Class244) aClass244_2120).anIntArray3452, Class130_Sub1.stream);
				Class130_Sub1.stream.method2408(-1591647264, ((BufferStream) Class130_Sub1.stream).position - i_327_);
				return;
			}
		} else if (i < 5200) {
			if (i == 5100) {
				if (Class216.aClass232_3009.method1488(-92, 86))
					anIntArray2122[anInt2130++] = 1;
				else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 5101) {
				if (Class216.aClass232_3009.method1488(-89, 82))
					anIntArray2122[anInt2130++] = 1;
				else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 5102) {
				if (Class216.aClass232_3009.method1488(-89, 81))
					anIntArray2122[anInt2130++] = 1;
				else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
		} else if (i < 5300) {
			if (i == 5200) {
				Class170.method1127((byte) -126, anIntArray2122[--anInt2130]);
				return;
			}
			if (i == 5201) {
				anIntArray2122[anInt2130++] = Class103.method655(true);
				return;
			}
			if (i == 5205) {
				Class126.method864(-1, -1, -105, anIntArray2122[--anInt2130], false);
				return;
			}
			if (i == 5206) {
				int i_328_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method498(i_328_ >> 14 & 0x3fff, i_328_ & 0x3fff);
				if (class246_sub1_sub5 == null)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = ((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5836;
					return;
				}
				return;
			}
			if (i == 5207) {
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(anIntArray2122[--anInt2130]);
				if (class246_sub1_sub5 == null || (((Class246_Sub1_Sub5) class246_sub1_sub5).aString5844 == null))
					aStringArray2125[anInt2126++] = "";
				else {
					aStringArray2125[anInt2126++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).aString5844);
					return;
				}
				return;
			}
			if (i == 5208) {
				anIntArray2122[anInt2130++] = Class8.anInt99;
				anIntArray2122[anInt2130++] = Class216.anInt3010;
				return;
			}
			if (i == 5209) {
				anIntArray2122[anInt2130++] = Class109_Sub1_Sub1.anInt6725 + Class79.anInt1057;
				anIntArray2122[anInt2130++] = Class21.anInt322 + Class79.anInt1041;
				return;
			}
			if (i == 5210) {
				int i_329_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_329_);
				if (class246_sub1_sub5 == null) {
					anIntArray2122[anInt2130++] = 0;
					anIntArray2122[anInt2130++] = 0;
				} else {
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5850 >> 14) & 0x3fff;
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5850 & 0x3fff);
					return;
				}
				return;
			}
			if (i == 5211) {
				int i_330_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_330_);
				if (class246_sub1_sub5 == null) {
					anIntArray2122[anInt2130++] = 0;
					anIntArray2122[anInt2130++] = 0;
				} else {
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5838 - (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5833));
					anIntArray2122[anInt2130++] = (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5845 - (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5842));
					return;
				}
				return;
			}
			if (i == 5212) {
				Class246_Sub2 class246_sub2 = Class225.method1450(true);
				if (class246_sub2 == null) {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = -1;
				} else {
					anIntArray2122[anInt2130++] = ((Class246_Sub2) class246_sub2).anInt3808;
					int i_331_ = (((Class246_Sub2) class246_sub2).anInt3812 << 28 | (((Class246_Sub2) class246_sub2).anInt3807 + Class79.anInt1057) << 14 | (((Class246_Sub2) class246_sub2).anInt3801 + Class79.anInt1041));
					anIntArray2122[anInt2130++] = i_331_;
					return;
				}
				return;
			}
			if (i == 5213) {
				Class246_Sub2 class246_sub2 = Class99.method627(-2);
				if (class246_sub2 == null) {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = -1;
				} else {
					anIntArray2122[anInt2130++] = ((Class246_Sub2) class246_sub2).anInt3808;
					int i_332_ = (((Class246_Sub2) class246_sub2).anInt3812 << 28 | (((Class246_Sub2) class246_sub2).anInt3807 + Class79.anInt1057) << 14 | (((Class246_Sub2) class246_sub2).anInt3801 + Class79.anInt1041));
					anIntArray2122[anInt2130++] = i_332_;
					return;
				}
				return;
			}
			if (i == 5214) {
				int i_333_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_334_ = class246_sub1_sub5.method2471(false, anIntArray2140, i_333_ >> 28 & 0x3, i_333_ & 0x3fff, i_333_ >> 14 & 0x3fff);
					if (bool_334_)
						Class9.method81(anIntArray2140[2], (byte) 109, anIntArray2140[1]);
				}
				return;
			}
			if (i == 5215) {
				anInt2130 -= 2;
				int i_335_ = anIntArray2122[anInt2130];
				int i_336_ = anIntArray2122[anInt2130 + 1];
				Class217 class217 = Class79.method510(i_335_ >> 14 & 0x3fff, i_335_ & 0x3fff);
				boolean bool_337_ = false;
				for (Class246_Sub1_Sub5 class246_sub1_sub5 = (Class246_Sub1_Sub5) class217.method1408((byte) 87); class246_sub1_sub5 != null; class246_sub1_sub5 = (Class246_Sub1_Sub5) class217.method1411(true)) {
					if (((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5836 == i_336_) {
						bool_337_ = true;
						break;
					}
				}
				if (bool_337_)
					anIntArray2122[anInt2130++] = 1;
				else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 5218) {
				int i_338_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class79.method515(i_338_);
				if (class246_sub1_sub5 == null)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = ((Class246_Sub1_Sub5) class246_sub1_sub5).anInt5840;
					return;
				}
				return;
			}
			if (i == 5220) {
				anIntArray2122[anInt2130++] = Class39.anInt571 == 100 ? 1 : 0;
				return;
			}
			if (i == 5221) {
				int i_339_ = anIntArray2122[--anInt2130];
				Class9.method81(i_339_ & 0x3fff, (byte) 93, i_339_ >> 14 & 0x3fff);
				return;
			}
			if (i == 5222) {
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_340_ = (class246_sub1_sub5.method2466(Class109_Sub1_Sub1.anInt6725 + Class79.anInt1057, anIntArray2140, (byte) 111, Class21.anInt322 + Class79.anInt1041));
					if (bool_340_) {
						anIntArray2122[anInt2130++] = anIntArray2140[1];
						anIntArray2122[anInt2130++] = anIntArray2140[2];
					} else {
						anIntArray2122[anInt2130++] = -1;
						anIntArray2122[anInt2130++] = -1;
					}
				} else {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = -1;
					return;
				}
				return;
			}
			if (i == 5223) {
				anInt2130 -= 2;
				int i_341_ = anIntArray2122[anInt2130];
				int i_342_ = anIntArray2122[anInt2130 + 1];
				Class126.method864(i_342_ >> 14 & 0x3fff, i_342_ & 0x3fff, -105, i_341_, false);
				return;
			}
			if (i == 5224) {
				int i_343_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_344_ = class246_sub1_sub5.method2471(false, anIntArray2140, i_343_ >> 28 & 0x3, i_343_ & 0x3fff, i_343_ >> 14 & 0x3fff);
					if (bool_344_) {
						anIntArray2122[anInt2130++] = anIntArray2140[1];
						anIntArray2122[anInt2130++] = anIntArray2140[2];
					} else {
						anIntArray2122[anInt2130++] = -1;
						anIntArray2122[anInt2130++] = -1;
					}
				} else {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = -1;
					return;
				}
				return;
			}
			if (i == 5225) {
				int i_345_ = anIntArray2122[--anInt2130];
				Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
				if (class246_sub1_sub5 != null) {
					boolean bool_346_ = class246_sub1_sub5.method2466(i_345_ >> 14 & 0x3fff, anIntArray2140, (byte) 111, i_345_ & 0x3fff);
					if (bool_346_) {
						anIntArray2122[anInt2130++] = anIntArray2140[1];
						anIntArray2122[anInt2130++] = anIntArray2140[2];
					} else {
						anIntArray2122[anInt2130++] = -1;
						anIntArray2122[anInt2130++] = -1;
					}
				} else {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = -1;
					return;
				}
				return;
			}
			if (i == 5226) {
				Class228.method1464(false, anIntArray2122[--anInt2130]);
				return;
			}
			if (i == 5227) {
				anInt2130 -= 2;
				int i_347_ = anIntArray2122[anInt2130];
				int i_348_ = anIntArray2122[anInt2130 + 1];
				Class126.method864(i_348_ >> 14 & 0x3fff, i_348_ & 0x3fff, -109, i_347_, true);
				return;
			}
			if (i == 5228) {
				Class100_Sub1.aBool5070 = anIntArray2122[--anInt2130] == 1;
				return;
			}
			if (i == 5229) {
				anIntArray2122[anInt2130++] = Class100_Sub1.aBool5070 ? 1 : 0;
				return;
			}
			if (i == 5230) {
				int i_349_ = anIntArray2122[--anInt2130];
				Class246_Sub28_Sub10.method2579(120, i_349_);
				return;
			}
			if (i == 5231) {
				anInt2130 -= 2;
				int i_350_ = anIntArray2122[anInt2130];
				boolean bool_351_ = anIntArray2122[anInt2130 + 1] == 1;
				if (Class40_Sub1.aClass85_3776 != null) {
					Node class246 = Class40_Sub1.aClass85_3776.method544((long) i_350_, 125);
					if (class246 != null && !bool_351_)
						class246.unlink((byte) 100);
					else if (class246 == null && bool_351_) {
						class246 = new Node();
						Class40_Sub1.aClass85_3776.method547((long) i_350_, -2301, class246);
					}
				}
				return;
			}
			if (i == 5232) {
				int i_352_ = anIntArray2122[--anInt2130];
				if (Class40_Sub1.aClass85_3776 != null) {
					Node class246 = Class40_Sub1.aClass85_3776.method544((long) i_352_, 123);
					anIntArray2122[anInt2130++] = class246 != null ? 1 : 0;
				} else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 5233) {
				anInt2130 -= 2;
				int i_353_ = anIntArray2122[anInt2130];
				boolean bool_354_ = anIntArray2122[anInt2130 + 1] == 1;
				if (Class246_Sub28_Sub11.aClass85_6164 != null) {
					Node class246 = Class246_Sub28_Sub11.aClass85_6164.method544((long) i_353_, 126);
					if (class246 != null && !bool_354_)
						class246.unlink((byte) -79);
					else if (class246 == null && bool_354_) {
						class246 = new Node();
						Class246_Sub28_Sub11.aClass85_6164.method547((long) i_353_, -2301, class246);
					}
				}
				return;
			}
			if (i == 5234) {
				int i_355_ = anIntArray2122[--anInt2130];
				if (Class246_Sub28_Sub11.aClass85_6164 != null) {
					Node class246 = Class246_Sub28_Sub11.aClass85_6164.method544((long) i_355_, 127);
					anIntArray2122[anInt2130++] = class246 != null ? 1 : 0;
				} else {
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 5235) {
				anIntArray2122[anInt2130++] = (Class79.aClass246_Sub1_Sub5_1020 != null ? ((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5836 : -1);
				return;
			}
			if (i == 5236) {
				anInt2130 -= 2;
				int i_356_ = anIntArray2122[anInt2130];
				int i_357_ = anIntArray2122[anInt2130 + 1];
				int i_358_ = i_357_ >> 14 & 0x3fff;
				int i_359_ = i_357_ & 0x3fff;
				int i_360_ = Class218.method1415(i_358_, (byte) 124, i_359_, i_356_);
				if (i_360_ < 0)
					anIntArray2122[anInt2130++] = -1;
				else {
					anIntArray2122[anInt2130++] = i_360_;
					return;
				}
				return;
			}
		} else if (i < 5400) {
			if (i == 5300) {
				anInt2130 -= 2;
				int i_361_ = anIntArray2122[anInt2130];
				int i_362_ = anIntArray2122[anInt2130 + 1];
				Class100.method629(3, i_362_, i_361_, false, false);
				anIntArray2122[anInt2130++] = Class38_Sub1.aFrame5114 != null ? 1 : 0;
				return;
			}
			if (i == 5301) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.method629((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt600), -1, -1, false, false);
				return;
			}
			if (i == 5302) {
				Class86[] class86s = Class130.method885(true);
				anIntArray2122[anInt2130++] = class86s.length;
				return;
			}
			if (i == 5303) {
				int i_363_ = anIntArray2122[--anInt2130];
				Class86[] class86s = Class130.method885(true);
				anIntArray2122[anInt2130++] = ((Class86) class86s[i_363_]).anInt1137;
				anIntArray2122[anInt2130++] = ((Class86) class86s[i_363_]).anInt1138;
				return;
			}
			if (i == 5305) {
				int i_364_ = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt577);
				int i_365_ = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt604);
				int i_366_ = -1;
				Class86[] class86s = Class130.method885(true);
				for (int i_367_ = 0; i_367_ < class86s.length; i_367_++) {
					Class86 class86 = class86s[i_367_];
					if (((Class86) class86).anInt1137 == i_364_ && ((Class86) class86).anInt1138 == i_365_) {
						i_366_ = i_367_;
						break;
					}
				}
				anIntArray2122[anInt2130++] = i_366_;
				return;
			}
			if (i == 5306) {
				anIntArray2122[anInt2130++] = Class258.method1673((byte) -123);
				return;
			}
			if (i == 5307) {
				int i_368_ = anIntArray2122[--anInt2130];
				if (i_368_ >= 1 && i_368_ <= 2) {
					Class100.method629(i_368_, -1, -1, false, false);
					return;
				}
				return;
			}
			if (i == 5308) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt600);
				return;
			}
			if (i == 5309) {
				int i_369_ = anIntArray2122[--anInt2130];
				if (i_369_ >= 1 && i_369_ <= 2) {
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt600 = i_369_;
					Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 34);
					return;
				}
				return;
			}
		} else if (i < 5500) {
			if (i == 5400) {
				anInt2126 -= 2;
				String string = aStringArray2125[anInt2126];
				String string_370_ = aStringArray2125[anInt2126 + 1];
				int i_371_ = anIntArray2122[--anInt2130];
				anInt2135++;
				Class243.writePacket(-101, Class187.aClass201_2647);
				Class130_Sub1.stream.writeByte(255, (Class145.method978(string, (byte) -116) + Class145.method978(string_370_, (byte) -95) + 1));
				Class130_Sub1.stream.writeString(55, string);
				Class130_Sub1.stream.writeString(119, string_370_);
				Class130_Sub1.stream.writeByte(255, i_371_);
				return;
			}
			if (i == 5401) {
				anInt2130 -= 2;
				Class187_Sub1.aShortArray4872[anIntArray2122[anInt2130]] = (short) Class246_Sub26.method2115(0, (anIntArray2122[anInt2130 + 1]));
				Class255.aClass191_3663.method1258((byte) -125);
				Class255.aClass191_3663.method1249((byte) 65);
				Class179.aClass228_2518.method1456(3);
				Class205.method1341(-11712);
				return;
			}
			if (i == 5405) {
				anInt2130 -= 2;
				int i_372_ = anIntArray2122[anInt2130];
				int i_373_ = anIntArray2122[anInt2130 + 1];
				if (i_372_ >= 0 && i_372_ < 2)
					Class21_Sub2.anIntArrayArrayArray4503[i_372_] = new int[i_373_ << 1][4];
				return;
			}
			if (i == 5406) {
				anInt2130 -= 7;
				int i_374_ = anIntArray2122[anInt2130];
				int i_375_ = anIntArray2122[anInt2130 + 1] << 1;
				int i_376_ = anIntArray2122[anInt2130 + 2];
				int i_377_ = anIntArray2122[anInt2130 + 3];
				int i_378_ = anIntArray2122[anInt2130 + 4];
				int i_379_ = anIntArray2122[anInt2130 + 5];
				int i_380_ = anIntArray2122[anInt2130 + 6];
				if (i_374_ >= 0 && i_374_ < 2 && Class21_Sub2.anIntArrayArrayArray4503[i_374_] != null && i_375_ >= 0 && i_375_ < (Class21_Sub2.anIntArrayArrayArray4503[i_374_]).length) {
					Class21_Sub2.anIntArrayArrayArray4503[i_374_][i_375_] = new int[] { (i_376_ >> 14 & 0x3fff) << 7, i_377_, (i_376_ & 0x3fff) << 7, i_380_ };
					Class21_Sub2.anIntArrayArrayArray4503[i_374_][i_375_ + 1] = new int[] { (i_378_ >> 14 & 0x3fff) << 7, i_379_, (i_378_ & 0x3fff) << 7 };
				}
				return;
			}
			if (i == 5407) {
				int i_381_ = ((Class21_Sub2.anIntArrayArrayArray4503[anIntArray2122[--anInt2130]]).length >> 1);
				anIntArray2122[anInt2130++] = i_381_;
				return;
			}
			if (i == 5411) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.method629((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt600), -1, -1, false, false);
				if (Class122.aFrame1688 != null) {
					Class173.method1136(-22125);
					System.exit(0);
				} else {
					String string = (Class59_Sub2.aString4546 != null ? Class59_Sub2.aString4546 : Class59_Sub3_Sub1.method2444(256));
					Class148.method1001(Class108.aClass52_1535, string, BufferStream.anInt5656 == 1, false, 121);
					return;
				}
				return;
			}
			if (i == 5419) {
				String string = "";
				if (Class246_Sub28_Sub19.aClass182_6548 != null) {
					if (Class246_Sub28_Sub19.aClass182_6548.anObject2535 != null)
						string = (String) (Class246_Sub28_Sub19.aClass182_6548.anObject2535);
					else
						string = Class147.method995((Class246_Sub28_Sub19.aClass182_6548.anInt2534), (byte) -71);
				}
				aStringArray2125[anInt2126++] = string;
				return;
			}
			if (i == 5420) {
				anIntArray2122[anInt2130++] = Signlink.anInt740 == 3 ? 1 : 0;
				return;
			}
			if (i == 5421) {
				if (Class38_Sub1.aFrame5114 != null)
					Class100.method629((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt600), -1, -1, false, false);
				String string = aStringArray2125[--anInt2126];
				boolean bool_382_ = anIntArray2122[--anInt2130] == 1;
				String string_383_ = Class59_Sub3_Sub1.method2444(256) + string;
				Class148.method1001(Class108.aClass52_1535, string_383_, BufferStream.anInt5656 == 1, bool_382_, -54);
				return;
			}
			if (i == 5422) {
				anInt2126 -= 2;
				String string = aStringArray2125[anInt2126];
				String string_384_ = aStringArray2125[anInt2126 + 1];
				int i_385_ = anIntArray2122[--anInt2130];
				if (string.length() > 0) {
					if (Class251.aStringArray3546 == null)
						Class251.aStringArray3546 = new String[(Class40_Sub3.anIntArray4071[(((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310)])];
					Class251.aStringArray3546[i_385_] = string;
				}
				if (string_384_.length() > 0) {
					if (Class249.aStringArray3514 == null)
						Class249.aStringArray3514 = new String[(Class40_Sub3.anIntArray4071[(((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310)])];
					Class249.aStringArray3514[i_385_] = string_384_;
				}
				return;
			}
			if (i == 5423) {
				System.out.println(aStringArray2125[--anInt2126]);
				return;
			}
			if (i == 5424) {
				anInt2130 -= 11;
				Class241.anInt3400 = anIntArray2122[anInt2130];
				Class_ss.anInt7054 = anIntArray2122[anInt2130 + 1];
				Class81.anInt1069 = anIntArray2122[anInt2130 + 2];
				Class68.anInt905 = anIntArray2122[anInt2130 + 3];
				Class105.anInt1469 = anIntArray2122[anInt2130 + 4];
				Class40_Sub9.anInt5511 = anIntArray2122[anInt2130 + 5];
				Class246_Sub1_Sub16.anInt6697 = anIntArray2122[anInt2130 + 6];
				Class246_Sub28_Sub14.anInt6306 = anIntArray2122[anInt2130 + 7];
				Class255.anInt3662 = anIntArray2122[anInt2130 + 8];
				Class130_Sub3.anInt4418 = anIntArray2122[anInt2130 + 9];
				Class155.anInt2227 = anIntArray2122[anInt2130 + 10];
				Class210_Sub2.index8.method112(-1, Class105.anInt1469);
				Class210_Sub2.index8.method112(-1, Class40_Sub9.anInt5511);
				Class210_Sub2.index8.method112(-1, Class246_Sub1_Sub16.anInt6697);
				Class210_Sub2.index8.method112(-1, Class246_Sub28_Sub14.anInt6306);
				Class210_Sub2.index8.method112(-1, Class255.anInt3662);
				Class76.aClass_l993 = Class69.aClass_l907 = Class246_Sub28_Sub23.aClass_l6656 = null;
				Class246_Sub1_Sub3.aClass_l5707 = Class246_Sub41.aClass_l5535 = Class160.aClass_l2266 = null;
				Class205.aClass_l2885 = Class246_Sub37_Sub1.aClass_l5943 = null;
				Class160.aBool2263 = true;
				return;
			}
			if (i == 5425) {
				Class246_Sub23.method2099((byte) 115);
				Class160.aBool2263 = false;
				return;
			}
			if (i == 5426) {
				anInt2130 -= 2;
				Class188.anInt2657 = anIntArray2122[anInt2130];
				Class109.anInt1568 = anIntArray2122[anInt2130 + 1];
				return;
			}
			if (i == 5427) {
				anInt2130 -= 2;
				Class106_Sub1.anInt4174 = anIntArray2122[anInt2130 + 1];
				return;
			}
			if (i == 5428) {
				anInt2130 -= 2;
				int i_386_ = anIntArray2122[anInt2130];
				int i_387_ = anIntArray2122[anInt2130 + 1];
				anIntArray2122[anInt2130++] = (Class246_Sub1_Sub12.method2618(i_386_, -125, i_387_) ? 1 : 0);
				return;
			}
			if (i == 5429) {
				Class187_Sub2.method2285(aStringArray2125[--anInt2126], false, 3);
				return;
			}
			if (i == 5430) {
				try {
					Class80.method521(Class108.aClass52_1535.anApplet733, "accountcreated", 127);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
		} else if (i < 5600) {
			if (i == 5500) {
				anInt2130 -= 4;
				int i_388_ = anIntArray2122[anInt2130];
				int i_389_ = anIntArray2122[anInt2130 + 1];
				int i_390_ = anIntArray2122[anInt2130 + 2];
				int i_391_ = anIntArray2122[anInt2130 + 3];
				Class59_Sub2_Sub3.method2722(i_389_, false, i_391_, (i_388_ & 0x3fff) - Class47.anInt686, true, (i_388_ >> 14 & 0x3fff) - Class39_Sub1.anInt4670, i_390_);
				return;
			}
			if (i == 5501) {
				anInt2130 -= 4;
				int i_392_ = anIntArray2122[anInt2130];
				int i_393_ = anIntArray2122[anInt2130 + 1];
				int i_394_ = anIntArray2122[anInt2130 + 2];
				int i_395_ = anIntArray2122[anInt2130 + 3];
				Class172.method1133(i_395_, i_393_, (i_392_ & 0x3fff) - Class47.anInt686, i_394_, -8, ((i_392_ >> 14 & 0x3fff) - Class39_Sub1.anInt4670));
				return;
			}
			if (i == 5502) {
				anInt2130 -= 6;
				int i_396_ = anIntArray2122[anInt2130];
				if (i_396_ >= 2)
					throw new RuntimeException();
				Class74.anInt967 = i_396_;
				int i_397_ = anIntArray2122[anInt2130 + 1];
				if (i_397_ + 1 >= (Class21_Sub2.anIntArrayArrayArray4503[Class74.anInt967]).length >> 1)
					throw new RuntimeException();
				Class259_Sub1.anInt4511 = i_397_;
				Class246_Sub4.anInt3868 = 0;
				Class246_Sub28_Sub4.anInt5977 = anIntArray2122[anInt2130 + 2];
				Class240.anInt3385 = anIntArray2122[anInt2130 + 3];
				int i_398_ = anIntArray2122[anInt2130 + 4];
				if (i_398_ >= 2)
					throw new RuntimeException();
				Class21_Sub2.anInt4494 = i_398_;
				int i_399_ = anIntArray2122[anInt2130 + 5];
				if (i_399_ + 1 >= (Class21_Sub2.anIntArrayArrayArray4503[Class21_Sub2.anInt4494]).length >> 1)
					throw new RuntimeException();
				Class93.anInt1228 = i_399_;
				Class130_Sub3.anInt4417 = 3;
				return;
			}
			if (i == 5503) {
				Class31.method231(-18006);
				return;
			}
			if (i == 5504) {
				anInt2130 -= 2;
				Class246_Sub22.method2084(anIntArray2122[anInt2130], (byte) -125, anIntArray2122[anInt2130 + 1], 0);
				return;
			}
			if (i == 5505) {
				anIntArray2122[anInt2130++] = (int) Class59_Sub2.aFloat4553 >> 3;
				return;
			}
			if (i == 5506) {
				anIntArray2122[anInt2130++] = (int) Class204.aFloat2881 >> 3;
				return;
			}
			if (i == 5507) {
				Class122.method825(-123);
				return;
			}
			if (i == 5508) {
				Class246_Sub28_Sub31.method2850(-107);
				return;
			}
			if (i == 5509) {
				Class246_Sub28_Sub3.method2493(-22855);
				return;
			}
			if (i == 5510) {
				Class170.method1128((byte) -127);
				return;
			}
			if (i == 5511) {
				int i_400_ = anIntArray2122[--anInt2130];
				int i_401_ = i_400_ >> 14 & 0x3fff;
				int i_402_ = i_400_ & 0x3fff;
				i_401_ -= Class39_Sub1.anInt4670;
				if (i_401_ < 0)
					i_401_ = 0;
				else if (i_401_ >= Class38_Sub1_Sub1.anInt6770)
					i_401_ = Class38_Sub1_Sub1.anInt6770;
				i_402_ -= Class47.anInt686;
				if (i_402_ < 0)
					i_402_ = 0;
				else if (i_402_ >= Class152.anInt2205)
					i_402_ = Class152.anInt2205;
				Class242.anInt3424 = (i_401_ << 7) + 64;
				Class246_Sub43.anInt5606 = (i_402_ << 7) + 64;
				Class130_Sub3.anInt4417 = 4;
				return;
			}
			if (i == 5512) {
				Class246_Sub28_Sub8.method2559(true);
				return;
			}
		} else if (i < 5700) {
			if (i == 5600) {
				anInt2126 -= 2;
				String string = aStringArray2125[anInt2126];
				String string_403_ = aStringArray2125[anInt2126 + 1];
				int i_404_ = anIntArray2122[--anInt2130];
				if (Class225.anInt3103 == 10 && (Class228.anInt3137 == 0 && Class246_Sub1_Sub14.anInt6590 == 0 && Class197.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class128_Sub1.method2332(6745, string, i_404_, string_403_);
					return;
				}
				return;
			}
			if (i == 5601) {
				Class166.method1110(true);
				return;
			}
			if (i == 5602) {
				if (Class246_Sub1_Sub14.anInt6590 == 0)
					Class246_Sub31.anInt5034 = -2;
				return;
			}
			if (i == 5603) {
				anInt2130 -= 4;
				if (Class225.anInt3103 == 10 && (Class228.anInt3137 == 0 && Class246_Sub1_Sub14.anInt6590 == 0 && Class197.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class211_Sub1.method2266(anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130], anIntArray2122[anInt2130 + 2], 4, anIntArray2122[anInt2130 + 3]);
					return;
				}
				return;
			}
			if (i == 5604) {
				anInt2126--;
				if (Class225.anInt3103 == 10 && (Class228.anInt3137 == 0 && Class246_Sub1_Sub14.anInt6590 == 0 && Class197.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class21_Sub4.method2131((Class246_Sub28_Sub6.method2554(1, aStringArray2125[anInt2126])), (byte) 119);
					return;
				}
				return;
			}
			if (i == 5605) {
				anInt2126 -= 3;
				anInt2130 -= 7;
				if (Class225.anInt3103 == 10 && (Class228.anInt3137 == 0 && Class246_Sub1_Sub14.anInt6590 == 0 && Class197.anInt2815 == 0 && Class24.anInt349 == 0)) {
					Class96.method614(2, anIntArray2122[anInt2130 + 1], anIntArray2122[anInt2130 + 5] == 1, aStringArray2125[anInt2126 + 1], anIntArray2122[anInt2130 + 6] == 1, anIntArray2122[anInt2130 + 4] == 1, anIntArray2122[anInt2130 + 2], anIntArray2122[anInt2130 + 3], (Class246_Sub28_Sub6.method2554(1, aStringArray2125[anInt2126])), aStringArray2125[anInt2126 + 2], anIntArray2122[anInt2130]);
					return;
				}
				return;
			}
			if (i == 5606) {
				if (Class197.anInt2815 == 0)
					RuntimeException_Sub2.anInt7154 = -2;
				return;
			}
			if (i == 5607) {
				anIntArray2122[anInt2130++] = Class246_Sub31.anInt5034;
				return;
			}
			if (i == 5608) {
				anIntArray2122[anInt2130++] = Class95.anInt1252;
				return;
			}
			if (i == 5609) {
				anIntArray2122[anInt2130++] = RuntimeException_Sub2.anInt7154;
				return;
			}
			if (i == 5610) {
				for (int i_405_ = 0; i_405_ < 5; i_405_++)
					aStringArray2125[anInt2126++] = (Class108.aStringArray1533.length > i_405_ ? Class190.method1246(true, (Class108.aStringArray1533[i_405_])) : "");
				Class108.aStringArray1533 = null;
				return;
			}
			if (i == 5611) {
				anIntArray2122[anInt2130++] = Class160.anInt2271;
				return;
			}
		} else if (i < 6100) {
			if (i == 6001) {
				int i_406_ = anIntArray2122[--anInt2130];
				if (i_406_ < 1)
					i_406_ = 1;
				if (i_406_ > 4)
					i_406_ = 4;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt583 = i_406_;
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 99);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6002) {
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2050(-2, anIntArray2122[--anInt2130] == 1);
				Actor.method2663(true);
				Class211_Sub1_Sub2.method2689(0);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -107);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6003) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool608 = anIntArray2122[--anInt2130] == 1;
				Class211_Sub1_Sub2.method2689(0);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 78);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6005) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool607 = anIntArray2122[--anInt2130] == 1;
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -108);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6006) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool586 = anIntArray2122[--anInt2130] == 1;
				Class246_Sub15.aClass260_4445.method1678(!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool586);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -120);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6007) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580 = anIntArray2122[--anInt2130];
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 89);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6008) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool576 = anIntArray2122[--anInt2130] == 1;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 110);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6009) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool573 = anIntArray2122[--anInt2130] == 1;
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 106);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6010) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool601 = anIntArray2122[--anInt2130] == 1;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 125);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6011) {
				int i_407_ = anIntArray2122[--anInt2130];
				if (i_407_ < 0 || i_407_ > 2)
					i_407_ = 0;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method273(BufferStream.anInt5656, -4, i_407_);
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -128);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6012) {
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method276(anIntArray2122[--anInt2130] == 1, -115, BufferStream.anInt5656);
				Class59_Sub1_Sub2.method2571(-7);
				Class118.method815((byte) -36);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 39);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6014) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool574 = anIntArray2122[--anInt2130] == 1;
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 71);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6015) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool592 = anIntArray2122[--anInt2130] == 1;
				Actor.method2663(true);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -126);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6016) {
				int i_408_ = anIntArray2122[--anInt2130];
				if (i_408_ < 0 || i_408_ > 2)
					i_408_ = 0;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt588 = i_408_;
				Class129.method883(BufferStream.anInt5656, (byte) 56);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -99);
				return;
			}
			if (i == 6017) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool570 = anIntArray2122[--anInt2130] == 1;
				Class91.method581(false);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 108);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6018) {
				int i_409_ = anIntArray2122[--anInt2130];
				if (i_409_ < 0)
					i_409_ = 0;
				if (i_409_ > 127)
					i_409_ = 127;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt602 = i_409_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 103);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6019) {
				int i_410_ = anIntArray2122[--anInt2130];
				if (i_410_ < 0)
					i_410_ = 0;
				if (i_410_ > 255)
					i_410_ = 255;
				if (i_410_ != (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587)) {
					if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587) == 0 && Class36.anInt512 != -1) {
						Class15.method158(i_410_, Class36.anInt512, 0, Class21.index6, -15727, false);
						Class_w.aBool6383 = false;
					} else if (i_410_ == 0) {
						Class57.method394((byte) -19);
						Class_w.aBool6383 = false;
					} else
						Class12.method137(i_410_, 101);
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587 = i_410_;
				}
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 100);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6020) {
				int i_411_ = anIntArray2122[--anInt2130];
				if (i_411_ < 0)
					i_411_ = 0;
				if (i_411_ > 127)
					i_411_ = 127;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt603 = i_411_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 121);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6021) {
				((Class39_Sub1) Class246_Sub28_Sub27.aClass39_Sub1_6759).f_cb = anIntArray2122[--anInt2130] == 1;
				Class211_Sub1_Sub2.method2689(0);
				return;
			}
			if (i == 6023) {
				int i_412_ = anIntArray2122[--anInt2130];
				boolean bool_413_ = false;
				if (i_412_ < 0)
					i_412_ = 0;
				if (i_412_ > 2)
					i_412_ = 2;
				if (Class40_Sub2.anInt4047 < 96) {
					i_412_ = 0;
					bool_413_ = true;
				}
				Class83.method531(i_412_, 9060);
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 106);
				RuntimeException_Sub2.aBool7148 = false;
				anIntArray2122[anInt2130++] = bool_413_ ? 0 : 1;
				return;
			}
			if (i == 6024) {
				int i_414_ = anIntArray2122[--anInt2130];
				if (i_414_ < 0 || i_414_ > 2)
					i_414_ = 0;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt590 = i_414_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 23);
				return;
			}
			if (i == 6025) {
				int i_415_ = anIntArray2122[--anInt2130];
				if (i_415_ < 0 || i_415_ > client.method2969(Class40_Sub2.anInt4047, (byte) -98))
					i_415_ = 0;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt581 = i_415_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 77);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6027) {
				int i_416_ = anIntArray2122[--anInt2130];
				if (i_416_ < 0 || i_416_ > 1)
					i_416_ = 0;
				Class196.method1280(-14734, i_416_ == 1);
				return;
			}
			if (i == 6028) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool606 = anIntArray2122[--anInt2130] != 0;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -98);
				return;
			}
			if (i == 6029) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580 = anIntArray2122[--anInt2130];
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -116);
				return;
			}
			if (i == 6030) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool567 = anIntArray2122[--anInt2130] != 0;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -106);
				Actor.method2663(true);
				return;
			}
			if (i == 6031) {
				int i_417_ = anIntArray2122[--anInt2130];
				if (i_417_ < 0 || i_417_ > 3)
					i_417_ = 2;
				Class129.method883(i_417_, (byte) 58);
				return;
			}
			if (i == 6032) {
				int i_418_ = anIntArray2122[--anInt2130];
				if (i_418_ < 0 || i_418_ > 3)
					i_418_ = 2;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt598 = i_418_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -127);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6033) {
				int i_419_ = anIntArray2122[--anInt2130];
				if (i_419_ < 0 || i_419_ > 4)
					i_419_ = 2;
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt584 = i_419_;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 39);
				return;
			}
			if (i == 6034) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609 = anIntArray2122[--anInt2130] == 1;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 109);
				Class59_Sub1_Sub2.method2571(-7);
				RuntimeException_Sub2.aBool7148 = false;
				return;
			}
			if (i == 6035) {
				((Class39_Sub1) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool4671 = anIntArray2122[--anInt2130] == 1;
				Actor.method2663(true);
				Class211_Sub1_Sub2.method2689(0);
				return;
			}
		} else if (i < 6200) {
			if (i == 6101) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt583);
				return;
			}
			if (i == 6102) {
				anIntArray2122[anInt2130++] = Class246_Sub28_Sub27.aClass39_Sub1_6759.method2048(-117, BufferStream.anInt5656) ? 1 : 0;
				return;
			}
			if (i == 6103) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool608) ? 1 : 0;
				return;
			}
			if (i == 6105) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool607) ? 1 : 0;
				return;
			}
			if (i == 6106) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool586) ? 1 : 0;
				return;
			}
			if (i == 6107) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580);
				return;
			}
			if (i == 6108) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool576) ? 1 : 0;
				return;
			}
			if (i == 6109) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool573) ? 1 : 0;
				return;
			}
			if (i == 6110) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool601) ? 1 : 0;
				return;
			}
			if (i == 6111) {
				anIntArray2122[anInt2130++] = Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28);
				return;
			}
			if (i == 6112) {
				anIntArray2122[anInt2130++] = Class246_Sub28_Sub27.aClass39_Sub1_6759.method275(29083, BufferStream.anInt5656) ? 1 : 0;
				return;
			}
			if (i == 6114) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool574) ? 1 : 0;
				return;
			}
			if (i == 6115) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool592) ? 1 : 0;
				return;
			}
			if (i == 6116) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt588);
				return;
			}
			if (i == 6117) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool570) ? 1 : 0;
				return;
			}
			if (i == 6118) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt602);
				return;
			}
			if (i == 6119) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587);
				return;
			}
			if (i == 6120) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt603);
				return;
			}
			if (i == 6121) {
				anIntArray2122[anInt2130++] = Class246_Sub15.aClass260_4445.method1700() ? 1 : 0;
				return;
			}
			if (i == 6123) {
				anIntArray2122[anInt2130++] = Class246_Sub1_Sub13.method2699(8458);
				return;
			}
			if (i == 6124) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt590);
				return;
			}
			if (i == 6125) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt581);
				return;
			}
			if (i == 6126) {
				anIntArray2122[anInt2130++] = Class246_Sub15.aClass260_4445.method1693() ? 1 : 0;
				return;
			}
			if (i == 6127) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool596) ? 1 : 0;
				return;
			}
			if (i == 6128) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool606) ? 1 : 0;
				return;
			}
			if (i == 6129) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580);
				return;
			}
			if (i == 6130) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool567) ? 1 : 0;
				return;
			}
			if (i == 6131) {
				anIntArray2122[anInt2130++] = BufferStream.anInt5656;
				return;
			}
			if (i == 6132) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt598);
				return;
			}
			if (i == 6133) {
				anIntArray2122[anInt2130++] = Signlink.anInt740 == 1 || Signlink.anInt740 == 4 ? 1 : 0;
				return;
			}
			if (i == 6134) {
				anIntArray2122[anInt2130++] = client.method2969(Class40_Sub2.anInt4047, (byte) -48);
				return;
			}
			if (i == 6135) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt584);
				return;
			}
			if (i == 6136) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609) ? 1 : 0;
				return;
			}
			if (i == 6137) {
				boolean bool_420_ = true;
				try {
					bool_420_ = jagmisc.getTotalPhysicalMemory() > 268435456L;
				} catch (Throwable throwable) {
					/* empty */
				}
				anIntArray2122[anInt2130++] = bool_420_ ? 1 : 0;
				return;
			}
		} else if (i < 6300) {
			if (i == 6200) {
				anInt2130 -= 2;
				Class159.aShort2260 = (short) anIntArray2122[anInt2130];
				if (Class159.aShort2260 <= 0)
					Class159.aShort2260 = (short) 256;
				Class67.aShort888 = (short) anIntArray2122[anInt2130 + 1];
				if (Class67.aShort888 <= 0)
					Class67.aShort888 = (short) 205;
				return;
			}
			if (i == 6201) {
				anInt2130 -= 2;
				Class7.aShort98 = (short) anIntArray2122[anInt2130];
				if (Class7.aShort98 <= 0)
					Class7.aShort98 = (short) 256;
				Class35.aShort463 = (short) anIntArray2122[anInt2130 + 1];
				if (Class35.aShort463 <= 0)
					Class35.aShort463 = (short) 320;
				return;
			}
			if (i == 6202) {
				anInt2130 -= 4;
				Class246_Sub28_Sub26.aShort6711 = (short) anIntArray2122[anInt2130];
				if (Class246_Sub28_Sub26.aShort6711 <= 0)
					Class246_Sub28_Sub26.aShort6711 = (short) 1;
				Class246_Sub12.aShort4404 = (short) anIntArray2122[anInt2130 + 1];
				if (Class246_Sub12.aShort4404 <= 0)
					Class246_Sub12.aShort4404 = (short) 32767;
				else if (Class246_Sub12.aShort4404 < Class246_Sub28_Sub26.aShort6711)
					Class246_Sub12.aShort4404 = Class246_Sub28_Sub26.aShort6711;
				Class60.aShort832 = (short) anIntArray2122[anInt2130 + 2];
				if (Class60.aShort832 <= 0)
					Class60.aShort832 = (short) 1;
				Class232.aShort3179 = (short) anIntArray2122[anInt2130 + 3];
				if (Class232.aShort3179 <= 0)
					Class232.aShort3179 = (short) 32767;
				else {
					if (Class232.aShort3179 < Class60.aShort832)
						Class232.aShort3179 = Class60.aShort832;
					return;
				}
				return;
			}
			if (i == 6203) {
				Class_o.method2944(0, ((Class235) Class104.f_vb).f_fc, (byte) -21, 0, false, ((Class235) Class104.f_vb).f_sb);
				anIntArray2122[anInt2130++] = Class179.anInt2512;
				anIntArray2122[anInt2130++] = Class59_Sub1_Sub2.anInt6133;
				return;
			}
			if (i == 6204) {
				anIntArray2122[anInt2130++] = Class7.aShort98;
				anIntArray2122[anInt2130++] = Class35.aShort463;
				return;
			}
			if (i == 6205) {
				anIntArray2122[anInt2130++] = Class159.aShort2260;
				anIntArray2122[anInt2130++] = Class67.aShort888;
				return;
			}
		} else if (i < 6400) {
			if (i == 6300) {
				anIntArray2122[anInt2130++] = (int) (Class151.time(-60) / 60000L);
				return;
			}
			if (i == 6301) {
				anIntArray2122[anInt2130++] = (int) (Class151.time(-115) / 86400000L) - 11745;
				return;
			}
			if (i == 6302) {
				anInt2130 -= 3;
				int i_421_ = anIntArray2122[anInt2130];
				int i_422_ = anIntArray2122[anInt2130 + 1];
				int i_423_ = anIntArray2122[anInt2130 + 2];
				aCalendar2132.clear();
				aCalendar2132.set(11, 12);
				aCalendar2132.set(i_423_, i_422_, i_421_);
				anIntArray2122[anInt2130++] = ((int) (aCalendar2132.getTime().getTime() / 86400000L) - 11745);
				return;
			}
			if (i == 6303) {
				aCalendar2132.clear();
				aCalendar2132.setTime(new Date(Class151.time(-127)));
				anIntArray2122[anInt2130++] = aCalendar2132.get(1);
				return;
			}
			if (i == 6304) {
				int i_424_ = anIntArray2122[--anInt2130];
				boolean bool_425_ = true;
				if (i_424_ < 0)
					bool_425_ = (i_424_ + 1) % 4 == 0;
				else if (i_424_ < 1582)
					bool_425_ = i_424_ % 4 == 0;
				else if (i_424_ % 4 != 0)
					bool_425_ = false;
				else if (i_424_ % 100 != 0)
					bool_425_ = true;
				else if (i_424_ % 400 != 0)
					bool_425_ = false;
				anIntArray2122[anInt2130++] = bool_425_ ? 1 : 0;
				return;
			}
		} else if (i < 6500) {
			if (i == 6405) {
				anIntArray2122[anInt2130++] = Class187_Sub2.method2286(89) ? 1 : 0;
				return;
			}
			if (i == 6406) {
				anIntArray2122[anInt2130++] = Class162.method1077(8271) ? 1 : 0;
				return;
			}
		} else if (i < 6600) {
			if (i == 6500) {
				if (Class225.anInt3103 != 10 || Class228.anInt3137 != 0 || Class246_Sub1_Sub14.anInt6590 != 0 || Class197.anInt2815 != 0)
					anIntArray2122[anInt2130++] = 1;
				else {
					anIntArray2122[anInt2130++] = Class246_Sub13.method1993(3) != -1 ? 1 : 0;
					return;
				}
				return;
			}
			if (i == 6501) {
				Class63_Sub1 class63_sub1 = Class230.method1473(0);
				if (class63_sub1 != null) {
					anIntArray2122[anInt2130++] = ((Class63_Sub1) class63_sub1).anInt4713;
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt851;
					aStringArray2125[anInt2126++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					anIntArray2122[anInt2130++] = ((Class5) class5).anInt64;
					aStringArray2125[anInt2126++] = ((Class5) class5).aString54;
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt855;
					anIntArray2122[anInt2130++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = 0;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 6502) {
				Class63_Sub1 class63_sub1 = Class150.method1007(1405);
				if (class63_sub1 != null) {
					anIntArray2122[anInt2130++] = ((Class63_Sub1) class63_sub1).anInt4713;
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt851;
					aStringArray2125[anInt2126++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					anIntArray2122[anInt2130++] = ((Class5) class5).anInt64;
					aStringArray2125[anInt2126++] = ((Class5) class5).aString54;
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt855;
					anIntArray2122[anInt2130++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					anIntArray2122[anInt2130++] = -1;
					anIntArray2122[anInt2130++] = 0;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 6503) {
				int i_426_ = anIntArray2122[--anInt2130];
				if (Class225.anInt3103 != 10 || Class228.anInt3137 != 0 || Class246_Sub1_Sub14.anInt6590 != 0 || Class197.anInt2815 != 0)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = Class88.method559(false, i_426_) ? 1 : 0;
					return;
				}
				return;
			}
			if (i == 6504) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt569 = anIntArray2122[--anInt2130];
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -112);
				return;
			}
			if (i == 6505) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt569);
				return;
			}
			if (i == 6506) {
				int i_427_ = anIntArray2122[--anInt2130];
				Class63_Sub1 class63_sub1 = Class108.method746(i_427_, (byte) 112);
				if (class63_sub1 != null) {
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt851;
					aStringArray2125[anInt2126++] = ((Class63_Sub1) class63_sub1).aString4714;
					Class5 class5 = class63_sub1.method2072(-14839);
					anIntArray2122[anInt2130++] = ((Class5) class5).anInt64;
					aStringArray2125[anInt2126++] = ((Class5) class5).aString54;
					anIntArray2122[anInt2130++] = ((Class63) class63_sub1).anInt855;
					anIntArray2122[anInt2130++] = ((Class63_Sub1) class63_sub1).anInt4723;
				} else {
					anIntArray2122[anInt2130++] = -1;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					aStringArray2125[anInt2126++] = "";
					anIntArray2122[anInt2130++] = 0;
					anIntArray2122[anInt2130++] = 0;
					return;
				}
				return;
			}
			if (i == 6507) {
				anInt2130 -= 4;
				int i_428_ = anIntArray2122[anInt2130];
				boolean bool_429_ = anIntArray2122[anInt2130 + 1] == 1;
				int i_430_ = anIntArray2122[anInt2130 + 2];
				boolean bool_431_ = anIntArray2122[anInt2130 + 3] == 1;
				Class18.method174(i_428_, bool_429_, i_430_, bool_431_, (byte) 90);
				return;
			}
			if (i == 6508) {
				Class246_Sub28_Sub9.method2578((byte) -77);
				return;
			}
			if (i == 6509) {
				if (Class225.anInt3103 == 10) {
					Class5.aBool60 = anIntArray2122[--anInt2130] == 1;
					return;
				}
				return;
			}
		} else if (i < 6700) {
			if (i == 6600) {
				((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605 = anIntArray2122[--anInt2130] == 1;
				Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 23);
				return;
			}
			if (i == 6601) {
				anIntArray2122[anInt2130++] = (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) ? 1 : 0;
				return;
			}
		} else if (i < 6800 && Class259.aClass97_3707 == Class37.aClass97_544) {
			if (i == 6700) {
				int i_432_ = Class246_Sub34.aClass85_5143.method542(-5);
				if (Class183.anInt2549 != -1)
					i_432_++;
				anIntArray2122[anInt2130++] = i_432_;
				return;
			}
			if (i == 6701) {
				int i_433_ = anIntArray2122[--anInt2130];
				if (Class183.anInt2549 != -1) {
					if (i_433_ == 0) {
						anIntArray2122[anInt2130++] = Class183.anInt2549;
						return;
					}
					i_433_--;
				}
				Class246_Sub40 class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.first((byte) -23));
				while (i_433_-- > 0)
					class246_sub40 = ((Class246_Sub40) Class246_Sub34.aClass85_5143.next((byte) -20));
				anIntArray2122[anInt2130++] = ((Class246_Sub40) class246_sub40).anInt5517;
				return;
			}
			if (i == 6702) {
				int i_434_ = anIntArray2122[--anInt2130];
				if (Class246_Sub32.aClass235ArrayArray5049[i_434_] == null)
					aStringArray2125[anInt2126++] = "";
				else {
					String string = (((Class235) Class246_Sub32.aClass235ArrayArray5049[i_434_][0]).f_gb);
					if (string == null)
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = string.substring(0, string.indexOf(':'));
						return;
					}
					return;
				}
				return;
			}
			if (i == 6703) {
				int i_435_ = anIntArray2122[--anInt2130];
				if (Class246_Sub32.aClass235ArrayArray5049[i_435_] == null)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = (Class246_Sub32.aClass235ArrayArray5049[i_435_]).length;
					return;
				}
				return;
			}
			if (i == 6704) {
				anInt2130 -= 2;
				int i_436_ = anIntArray2122[anInt2130];
				int i_437_ = anIntArray2122[anInt2130 + 1];
				if (Class246_Sub32.aClass235ArrayArray5049[i_436_] == null)
					aStringArray2125[anInt2126++] = "";
				else {
					String string = (((Class235) (Class246_Sub32.aClass235ArrayArray5049[i_436_][i_437_])).f_gb);
					if (string == null)
						aStringArray2125[anInt2126++] = "";
					else {
						aStringArray2125[anInt2126++] = string;
						return;
					}
					return;
				}
				return;
			}
			if (i == 6705) {
				anInt2130 -= 2;
				int i_438_ = anIntArray2122[anInt2130];
				int i_439_ = anIntArray2122[anInt2130 + 1];
				if (Class246_Sub32.aClass235ArrayArray5049[i_438_] == null)
					anIntArray2122[anInt2130++] = 0;
				else {
					anIntArray2122[anInt2130++] = ((Class235) (Class246_Sub32.aClass235ArrayArray5049[i_438_][i_439_])).anInt3262;
					return;
				}
				return;
			}
			if (i == 6706)
				return;
			if (i == 6707) {
				anInt2130 -= 3;
				int i_440_ = anIntArray2122[anInt2130];
				int i_441_ = anIntArray2122[anInt2130 + 1];
				int i_442_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 1, "", i_440_ << 16 | i_441_, i_442_);
				return;
			}
			if (i == 6708) {
				anInt2130 -= 3;
				int i_443_ = anIntArray2122[anInt2130];
				int i_444_ = anIntArray2122[anInt2130 + 1];
				int i_445_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 2, "", i_443_ << 16 | i_444_, i_445_);
				return;
			}
			if (i == 6709) {
				anInt2130 -= 3;
				int i_446_ = anIntArray2122[anInt2130];
				int i_447_ = anIntArray2122[anInt2130 + 1];
				int i_448_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 3, "", i_446_ << 16 | i_447_, i_448_);
				return;
			}
			if (i == 6710) {
				anInt2130 -= 3;
				int i_449_ = anIntArray2122[anInt2130];
				int i_450_ = anIntArray2122[anInt2130 + 1];
				int i_451_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 4, "", i_449_ << 16 | i_450_, i_451_);
				return;
			}
			if (i == 6711) {
				anInt2130 -= 3;
				int i_452_ = anIntArray2122[anInt2130];
				int i_453_ = anIntArray2122[anInt2130 + 1];
				int i_454_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 5, "", i_452_ << 16 | i_453_, i_454_);
				return;
			}
			if (i == 6712) {
				anInt2130 -= 3;
				int i_455_ = anIntArray2122[anInt2130];
				int i_456_ = anIntArray2122[anInt2130 + 1];
				int i_457_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 6, "", i_455_ << 16 | i_456_, i_457_);
				return;
			}
			if (i == 6713) {
				anInt2130 -= 3;
				int i_458_ = anIntArray2122[anInt2130];
				int i_459_ = anIntArray2122[anInt2130 + 1];
				int i_460_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 7, "", i_458_ << 16 | i_459_, i_460_);
				return;
			}
			if (i == 6714) {
				anInt2130 -= 3;
				int i_461_ = anIntArray2122[anInt2130];
				int i_462_ = anIntArray2122[anInt2130 + 1];
				int i_463_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 8, "", i_461_ << 16 | i_462_, i_463_);
				return;
			}
			if (i == 6715) {
				anInt2130 -= 3;
				int i_464_ = anIntArray2122[anInt2130];
				int i_465_ = anIntArray2122[anInt2130 + 1];
				int i_466_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 9, "", i_464_ << 16 | i_465_, i_466_);
				return;
			}
			if (i == 6716) {
				anInt2130 -= 3;
				int i_467_ = anIntArray2122[anInt2130];
				int i_468_ = anIntArray2122[anInt2130 + 1];
				int i_469_ = anIntArray2122[anInt2130 + 2];
				Class235.method1511(true, 10, "", i_467_ << 16 | i_468_, i_469_);
				return;
			}
			if (i == 6717) {
				anInt2130 -= 3;
				int i_470_ = anIntArray2122[anInt2130];
				int i_471_ = anIntArray2122[anInt2130 + 1];
				int i_472_ = anIntArray2122[anInt2130 + 2];
				Class235 class235 = Class211.method1390(i_470_ << 16 | i_471_, i_472_, (byte) 126);
				Class59_Sub4.method2209((byte) 102);
				Class246_Sub27 class246_sub27 = client.method2971(class235);
				Class155.method1029((((Class246_Sub27) class246_sub27).anInt4898), class246_sub27.method2126(16693), class235, (byte) -38);
				return;
			}
		} else if (i < 6900) {
			if (i == 6800) {
				int i_473_ = anIntArray2122[--anInt2130];
				Class140 class140 = Class246_Sub28_Sub30.aClass165_6873.method1088(i_473_, (byte) -41);
				if (((Class140) class140).aString1998 == null)
					aStringArray2125[anInt2126++] = "";
				else {
					aStringArray2125[anInt2126++] = ((Class140) class140).aString1998;
					return;
				}
				return;
			}
			if (i == 6801) {
				int i_474_ = anIntArray2122[--anInt2130];
				Class140 class140 = Class246_Sub28_Sub30.aClass165_6873.method1088(i_474_, (byte) -41);
				anIntArray2122[anInt2130++] = ((Class140) class140).anInt2026;
				return;
			}
			if (i == 6802) {
				int i_475_ = anIntArray2122[--anInt2130];
				Class140 class140 = Class246_Sub28_Sub30.aClass165_6873.method1088(i_475_, (byte) -41);
				anIntArray2122[anInt2130++] = ((Class140) class140).anInt1994;
				return;
			}
			if (i == 6803) {
				int i_476_ = anIntArray2122[--anInt2130];
				Class140 class140 = Class246_Sub28_Sub30.aClass165_6873.method1088(i_476_, (byte) -41);
				anIntArray2122[anInt2130++] = ((Class140) class140).anInt2014;
				return;
			}
			if (i == 6804) {
				anInt2130 -= 2;
				int i_477_ = anIntArray2122[anInt2130];
				int i_478_ = anIntArray2122[anInt2130 + 1];
				Class118 class118 = Class246_Sub1_Sub10.f_eb.method1085((byte) -118, i_478_);
				if (class118.method810(115))
					aStringArray2125[anInt2126++] = (Class246_Sub28_Sub30.aClass165_6873.method1088(i_477_, (byte) -41).method941(120, ((Class118) class118).aString1629, i_478_));
				else {
					anIntArray2122[anInt2130++] = (Class246_Sub28_Sub30.aClass165_6873.method1088(i_477_, (byte) -41).method943(121, ((Class118) class118).anInt1634, i_478_));
					return;
				}
				return;
			}
		}
		throw new IllegalStateException();
	}

	static final void method993(Class169 class169, int i, int i_479_) {
		CS2Script class246_sub1_sub1 = Class59_Sub1_Sub2.method2569(11639, i_479_, i, class169);
		if (class246_sub1_sub1 != null) {
			anIntArray2114 = new int[((CS2Script) class246_sub1_sub1).integerVariableCount];
			aStringArray2138 = (new String[((CS2Script) class246_sub1_sub1).stringVariableCount]);
			if ((((CS2Script) class246_sub1_sub1).aClass169_5681 == Class171.aClass169_2425) || (((CS2Script) class246_sub1_sub1).aClass169_5681 == Class51.aClass169_718) || (((CS2Script) class246_sub1_sub1).aClass169_5681 == Class116.aClass169_1609)) {
				int i_480_ = 0;
				int i_481_ = 0;
				if (Class246_Sub11.aClass235_4106 != null) {
					i_480_ = ((Class235) Class246_Sub11.aClass235_4106).f_mc;
					i_481_ = ((Class235) Class246_Sub11.aClass235_4106).f_hd;
				}
				anIntArray2114[0] = Class238.aClass102_3360.method640((byte) 58) - i_480_;
				anIntArray2114[1] = Class238.aClass102_3360.method636(3045) - i_481_;
			}
			method990(class246_sub1_sub1, 200000);
		}
	}

	static {
		aStringArray2125 = new String[1000];
		anIntArray2122 = new int[1000];
		anIntArrayArray2127 = new int[5][5000];
		aClass_bArray2133 = new Class_b[50];
		anInt2137 = 0;
		anInt2130 = 0;
		anIntArray2136 = new int[5];
		aCalendar2132 = Calendar.getInstance();
		anIntArray2140 = new int[3];
		aStringArray2141 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		aClass54_2139 = new HashMap(4);
		anInt2142 = 0;
	}
}
