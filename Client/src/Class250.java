/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class250 {
	private int anInt3523;
	static int anInt3524;
	static int anInt3525;
	static int anInt3526;
	static int anInt3527;
	private int anInt3528;
	static int anInt3529;
	static int anInt3530;
	static Class67 aClass67_3531 = new Class67("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
	static int anInt3532;
	static int anInt3533;
	static boolean aBool3534 = true;
	private int[][] anIntArrayArray3535;

	public static void method1596(boolean bool) {
		try {
			if (bool == false)
				aClass67_3531 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wd.A(" + bool + ')');
		}
	}

	static final void method1597(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i == 23040) {
				anInt3527++;
				Class130_Sub1.stream.writeInt(i_0_, (byte) 114);
				Class130_Sub1.stream.writeShortLE(i_1_, (byte) 125);
				Class130_Sub1.stream.writeShortLE(i_2_, (byte) 95);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wd.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1598(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			anInt3533++;
			int i_9_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i, Class_t.anInt1442);
			int i_10_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_7_, Class_t.anInt1442);
			int i_11_ = Class180.method1176(Class110.anInt1573, -24309, i_4_, Class197.anInt2818);
			int i_12_ = Class180.method1176(Class110.anInt1573, -24309, i_5_, Class197.anInt2818);
			int i_13_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i - -i_6_, Class_t.anInt1442);
			int i_14_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, -i_6_ + i_7_, Class_t.anInt1442);
			for (int i_15_ = i_9_; (i_13_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++)
				Class135.method918(i_11_, 123, i_3_, i_12_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_15_]));
			for (int i_16_ = i_10_; i_14_ < i_16_; i_16_--)
				Class135.method918(i_11_, -64, i_3_, i_12_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_16_]));
			int i_17_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ - -i_6_, Class197.anInt2818);
			int i_18_ = Class180.method1176(Class110.anInt1573, -24309, -i_6_ + i_5_, Class197.anInt2818);
			int i_19_ = -31 / ((23 - i_8_) / 42);
			for (int i_20_ = i_13_; i_20_ <= i_14_; i_20_++) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_20_];
				Class135.method918(i_11_, -19, i_3_, i_17_, is);
				Class135.method918(i_18_, -81, i_3_, i_12_, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wd.E(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method1599(String string, int i) {
		do {
			try {
				anInt3529++;
				if (string != null) {
					if (string.startsWith("*"))
						string = string.substring(1);
					String string_21_ = Class64.method424(string, (byte) -116);
					if (string_21_ != null) {
						for (int i_22_ = 0; ((Class235.anInt3266 ^ 0xffffffff) < (i_22_ ^ 0xffffffff)); i_22_++) {
							String string_23_ = Class38_Sub1_Sub1.aStringArray6762[i_22_];
							if (string_23_.startsWith("*"))
								string_23_ = string_23_.substring(1);
							string_23_ = Class64.method424(string_23_, (byte) -69);
							if (string_23_ != null && string_23_.equals(string_21_)) {
								Class235.anInt3266--;
								for (int i_24_ = i_22_; Class235.anInt3266 > i_24_; i_24_++) {
									Class38_Sub1_Sub1.aStringArray6762[i_24_] = (Class38_Sub1_Sub1.aStringArray6762[i_24_ + 1]);
									Class55.aStringArray784[i_24_] = Class55.aStringArray784[1 + i_24_];
									Class246_Sub1_Sub17.aStringArray6745[i_24_] = (Class246_Sub1_Sub17.aStringArray6745[i_24_ + 1]);
									Class246_Sub41_Sub1.aStringArray6172[i_24_] = (Class246_Sub41_Sub1.aStringArray6172[1 + i_24_]);
									Class236.aBoolArray3319[i_24_] = Class236.aBoolArray3319[i_24_ + 1];
								}
								Class211.anInt2960++;
								Class246_Sub1_Sub15.anInt6602 = Class246_Sub34.anInt5146;
								Class243.writePacket(-63, (Class246_Sub28_Sub4.aClass201_5970));
								Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -115));
								Class130_Sub1.stream.writeString(101, string);
								break;
							}
						}
						if (i > 6)
							break;
						method1603((byte) -95, null);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wd.F(" + (string != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int method1600(int i, byte i_25_) {
		try {
			if (anIntArrayArray3535 != null)
				i = 6 - -(int) ((long) i * (long) anInt3523 / (long) anInt3528);
			if (i_25_ != 83)
				method1600(-105, (byte) 91);
			anInt3524++;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wd.C(" + i + ',' + i_25_ + ')');
		}
	}

	final byte[] method1601(byte[] is, int i) {
		try {
			if (i >= -47)
				anInt3523 = 116;
			anInt3532++;
			if (anIntArrayArray3535 != null) {
				int i_26_ = 14 + (int) ((long) anInt3523 * (long) is.length / (long) anInt3528);
				int[] is_27_ = new int[i_26_];
				int i_28_ = 0;
				int i_29_ = 0;
				for (int i_30_ = 0; is.length > i_30_; i_30_++) {
					int i_31_ = is[i_30_];
					int[] is_32_ = anIntArrayArray3535[i_29_];
					for (int i_33_ = 0; i_33_ < 14; i_33_++)
						is_27_[i_28_ + i_33_] += is_32_[i_33_] * i_31_;
					i_29_ += anInt3523;
					int i_34_ = i_29_ / anInt3528;
					i_28_ += i_34_;
					i_29_ -= i_34_ * anInt3528;
				}
				is = new byte[i_26_];
				for (int i_35_ = 0; i_26_ > i_35_; i_35_++) {
					int i_36_ = 32768 + is_27_[i_35_] >> 16;
					if (i_36_ < -128)
						is[i_35_] = (byte) -128;
					else if ((i_36_ ^ 0xffffffff) < -128)
						is[i_35_] = (byte) 127;
					else
						is[i_35_] = (byte) i_36_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wd.H(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1602(int i, int i_37_) {
		try {
			anInt3525++;
			if (i != -22951)
				return -92;
			if (anIntArrayArray3535 != null)
				i_37_ = (int) ((long) anInt3523 * (long) i_37_ / (long) anInt3528);
			return i_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wd.I(" + i + ',' + i_37_ + ')');
		}
	}

	static final void method1603(byte i, String string) {
		try {
			anInt3526++;
			Class246_Sub5.aString3891 = string;
			if (Class108.aClass52_1535.anApplet733 != null) {
				try {
					if (i < -11) {
						String string_38_ = Class108.aClass52_1535.anApplet733.getParameter("cookieprefix");
						String string_39_ = Class108.aClass52_1535.anApplet733.getParameter("cookiehost");
						String string_40_ = (string_38_ + "settings=" + string + "; version=1; path=/; domain=" + string_39_);
						do {
							if (string.length() == 0) {
								string_40_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
								if (!client.f_ob)
									break;
							}
							string_40_ += ("; Expires=" + (Class_t_Sub1.method2039((94608000000L + Class151.time(-84)), -20881)) + "; Max-Age=" + 94608000L);
						} while (false);
						Class80.method520(("document.cookie=\"" + string_40_ + "\""), Class108.aClass52_1535.anApplet733, false);
					}
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wd.D(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1604(Class_fs class_fs, Class246_Sub37_Sub1 class246_sub37_sub1, Class_fs class_fs_41_, Class_fs class_fs_42_, byte i) {
		try {
			anInt3530++;
			Class246_Sub28_Sub15.aClass_fs6368 = class_fs_42_;
			Class246_Sub1_Sub18.aClass_fs6860 = class_fs_41_;
			if (i >= -52)
				return true;
			Class207.aClass_fs2923 = class_fs;
			Class32.aClass246_Sub37_Sub1_433 = class246_sub37_sub1;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wd.G(" + (class_fs != null ? "{...}" : "null") + ',' + (class246_sub37_sub1 != null ? "{...}" : "null") + ',' + (class_fs_41_ != null ? "{...}" : "null") + ',' + (class_fs_42_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class250(int i, int i_43_) {
		try {
			if (i != i_43_) {
				int i_44_ = Class232_Sub1.method2324(i, i_43_, -1);
				i /= i_44_;
				i_43_ /= i_44_;
				anInt3523 = i_43_;
				anIntArrayArray3535 = new int[i][14];
				anInt3528 = i;
				for (int i_45_ = 0; i > i_45_; i_45_++) {
					int[] is = anIntArrayArray3535[i_45_];
					double d = 6.0 + (double) i_45_ / (double) i;
					int i_46_ = (int) Math.floor(1.0 + (-7.0 + d));
					if (i_46_ < 0)
						i_46_ = 0;
					int i_47_ = (int) Math.ceil(d + 7.0);
					if (i_47_ > 14)
						i_47_ = 14;
					double d_48_ = (double) i_43_ / (double) i;
					for (/**/; (i_47_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
						double d_49_ = ((double) i_46_ - d) * 3.141592653589793;
						double d_50_ = d_48_;
						if (d_49_ < -1.0E-4 || d_49_ > 1.0E-4)
							d_50_ *= Math.sin(d_49_) / d_49_;
						d_50_ *= 0.54 + Math.cos(0.2243994752564138 * ((double) i_46_ - d)) * 0.46;
						is[i_46_] = (int) Math.floor(0.5 + d_50_ * 65536.0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wd.<init>(" + i + ',' + i_43_ + ')');
		}
	}
}
