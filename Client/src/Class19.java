/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class19 {
	static int anInt291;
	int anInt292;
	int anInt293;
	int anInt294;
	int anInt295;
	int anInt296;
	Class19 aClass19_297;
	int anInt298;
	static int anInt299;
	static int anInt300;
	int anInt301;
	int anInt302;
	int anInt303;
	int anInt304;
	static int anInt305;
	int anInt306;
	static int anInt307;
	static Class_fs aClass_fs308;
	int anInt309;
	private int anInt310;
	byte aByte311;
	static int[] anIntArray312;
	static int anInt313;

	public static void method186(byte i) {
		do {
			try {
				aClass_fs308 = null;
				anIntArray312 = null;
				if (i == 7)
					break;
				aClass_fs308 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bu.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class19 method187(int i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt299++;
			int i_3_ = -17 / ((i_2_ + 4) / 54);
			return new Class19(anInt310, i, i_0_, i_1_, ((Class19) this).aByte311);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final Class104 method188(byte i) {
		try {
			if (i != 85)
				return null;
			anInt307++;
			return Class40_Sub5.method2128(90, anInt310);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bu.D(" + i + ')');
		}
	}

	static final void method189(Class260 class260, Class_fs class_fs, int i, Class_fs class_fs_4_) {
		try {
			Class217.aClass73_3022 = Class129.method878(6, 0, BufferStream.f_eb, class_fs_4_);
			anInt291++;
			int i_5_ = 31 % ((-13 - i) / 62);
			Class_c.aClass116_1196 = class260.method1716(Class217.aClass73_3022, Class10.method129(class_fs, BufferStream.f_eb, 0), true);
			Class246_Sub5.aClass73_3892 = Class129.method878(6, 0, Class36.f_ib, class_fs_4_);
			Class109.aClass116_1554 = class260.method1716(Class246_Sub5.aClass73_3892, Class10.method129(class_fs, Class36.f_ib, 0), true);
			Class_fs.aClass73_148 = Class129.method878(6, 0, Class259_Sub1.anInt4510, class_fs_4_);
			Class79_Sub1.aClass116_5162 = class260.method1716(Class_fs.aClass73_148, Class10.method129(class_fs, (Class259_Sub1.anInt4510), 0), true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.B(" + (class260 != null ? "{...}" : "null") + ',' + (class_fs != null ? "{...}" : "null") + ',' + i + ',' + (class_fs_4_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method190(int i, Class235 class235, int i_6_, int i_7_) {
		try {
			Class177.anInt2498 = i_7_;
			Class152.aClass235_2203 = class235;
			Class235.f_kd = i_6_;
			int i_8_ = -49 / ((-37 - i) / 60);
			anInt300++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.E(" + i + ',' + (class235 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static final int method191(int i, String string, String string_9_, int i_10_) {
		try {
			anInt305++;
			int i_11_ = string_9_.length();
			int i_12_ = string.length();
			int i_13_ = 0;
			int i_14_ = 0;
			char c = '\0';
			char c_15_ = '\0';
			while_245_: do {
				char c_16_;
				char c_17_;
				for (;;) {
					if (-c + i_13_ >= i_11_ && (i_12_ ^ 0xffffffff) >= (i_14_ + -c_15_ ^ 0xffffffff))
						break while_245_;
					if (i_11_ <= -c + i_13_)
						return -1;
					if (-c_15_ + i_14_ >= i_12_)
						return 1;
					if ((c ^ 0xffffffff) != -1) {
						c_16_ = c;
						boolean bool = false;
					} else
						c_16_ = string_9_.charAt(i_13_++);
					if (c_15_ == 0)
						c_17_ = string.charAt(i_14_++);
					else {
						c_17_ = c_15_;
						boolean bool = false;
					}
					c = Class208.method1365(c_16_, 520);
					c_15_ = Class208.method1365(c_17_, 520);
					c_16_ = Class_q.method2061(-73, c_16_, i_10_);
					c_17_ = Class_q.method2061(-120, c_17_, i_10_);
					if ((c_16_ ^ 0xffffffff) != (c_17_ ^ 0xffffffff) && ((Character.toUpperCase(c_16_) ^ 0xffffffff) != (Character.toUpperCase(c_17_) ^ 0xffffffff))) {
						c_16_ = Character.toLowerCase(c_16_);
						c_17_ = Character.toLowerCase(c_17_);
						if (c_16_ != c_17_)
							break;
					}
				}
				return (Class75.method475((byte) -78, i_10_, c_16_) - Class75.method475((byte) -78, i_10_, c_17_));
			} while (false);
			int i_18_ = Math.min(i_11_, i_12_);
			for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_19_++) {
				if ((i_10_ ^ 0xffffffff) != -3)
					i_13_ = i_14_ = i_19_;
				else {
					i_14_ = -1 + (i_12_ + -i_19_);
					i_13_ = -i_19_ + (-1 + i_11_);
				}
				char c_20_ = string_9_.charAt(i_13_);
				char c_21_ = string.charAt(i_14_);
				if (c_21_ != c_20_ && (Character.toUpperCase(c_20_) != Character.toUpperCase(c_21_))) {
					c_20_ = Character.toLowerCase(c_20_);
					c_21_ = Character.toLowerCase(c_21_);
					if (c_20_ != c_21_)
						return (Class75.method475((byte) -78, i_10_, c_20_) + -Class75.method475((byte) -78, i_10_, c_21_));
				}
			}
			int i_22_ = -i_12_ + i_11_;
			int i_23_ = 102 % ((i - 60) / 33);
			if (i_22_ != 0)
				return i_22_;
			for (int i_24_ = 0; (i_18_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
				char c_25_ = string_9_.charAt(i_24_);
				char c_26_ = string.charAt(i_24_);
				if (c_26_ != c_25_)
					return (Class75.method475((byte) -78, i_10_, c_25_) - Class75.method475((byte) -78, i_10_, c_26_));
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.C(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (string_9_ != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	Class19(int i, int i_27_, int i_28_, int i_29_, byte i_30_) {
		try {
			((Class19) this).aByte311 = i_30_;
			((Class19) this).anInt309 = i_28_;
			((Class19) this).anInt301 = i_27_;
			anInt310 = i;
			((Class19) this).anInt292 = i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.<init>(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	Class19(Class19 class19_31_, int i) {
		try {
			((Class19) this).aClass19_297 = class19_31_;
			anInt310 = ((Class19) this).aClass19_297.anInt310;
			((Class19) this).aByte311 = ((Class19) ((Class19) this).aClass19_297).aByte311;
			((Class19) this).anInt292 = ((Class19) ((Class19) this).aClass19_297).anInt292 - -i;
			((Class19) this).anInt309 = ((Class19) ((Class19) this).aClass19_297).anInt309 + i;
			((Class19) this).anInt301 = i + ((Class19) ((Class19) this).aClass19_297).anInt301;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bu.<init>(" + (class19_31_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		new Class67("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.", "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
		new Class67("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de clan de cet utilisateur.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para entrar no canal de cl\u00e3 desse usu\u00e1rio.");
		anIntArray312 = new int[1];
	}
}
