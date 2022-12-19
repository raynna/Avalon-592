
/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class176 {
	static IncomingPacket aClass13_2476 = new IncomingPacket(7, 0);
	static int anInt2477;
	static int anInt2478;
	static Class_fs index1;
	static Class87 aClass87_2480 = new Class87(2);
	static int anInt2481;
	/* synthetic */ static Class aClass2482;

	static final void method1155(byte i) {
		do {
			try {
				anInt2477++;
				if (i >= -104)
					aClass13_2476 = null;
				if ((Signlink.anInt740 ^ 0xffffffff) != -3) {
					try {
						Method method = (aClass2482 != null ? aClass2482 : (aClass2482 = getClassByName("java.lang.Runtime"))).getMethod("maxMemory", new Class[0]);
						if (method != null) {
							try {
								Runtime runtime = Runtime.getRuntime();
								Long var_long = (Long) method.invoke(runtime, null);
								Class40_Sub2.anInt4047 = ((int) (var_long.longValue() / 1048576L) + 1);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						break;
					} catch (Exception exception) {
						break;
					}
				}
				Class40_Sub2.anInt4047 = 96;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "qg.A(" + i + ')');
			}
		} while (false);
	}

	static final boolean method1156(Class59_Sub3 class59_sub3, boolean bool) {
		boolean bool_0_ = (Class59_Sub3_Sub4.aClass210Array6993 == Class154.aClass210Array2215);
		int i = 0;
		byte i_1_ = 0;
		byte i_2_ = 0;
		class59_sub3.method2172(11264);
		if (((Class59_Sub3) class59_sub3).aShort5057 < 0 || ((Class59_Sub3) class59_sub3).aShort5064 < 0 || ((Class59_Sub3) class59_sub3).aShort5065 >= Class240.anInt3377 || ((Class59_Sub3) class59_sub3).aShort5062 >= Class_t_Sub1.f_sc)
			return false;
		for (int i_3_ = ((Class59_Sub3) class59_sub3).aShort5057; i_3_ <= ((Class59_Sub3) class59_sub3).aShort5065; i_3_++) {
			for (int i_4_ = ((Class59_Sub3) class59_sub3).aShort5064; i_4_ <= ((Class59_Sub3) class59_sub3).aShort5062; i_4_++) {
				Class147 class147 = Class187.method1222((((Class59_Sub3) class59_sub3).aByte5053), i_3_, i_4_);
				if (class147 != null) {
					int i_5_ = 0;
					if (i_3_ > ((Class59_Sub3) class59_sub3).aShort5057)
						i_5_++;
					if (i_3_ < ((Class59_Sub3) class59_sub3).aShort5065)
						i_5_ += 4;
					if (i_4_ > ((Class59_Sub3) class59_sub3).aShort5064)
						i_5_ += 8;
					if (i_4_ < ((Class59_Sub3) class59_sub3).aShort5062)
						i_5_ += 2;
					Class3 class3 = Class46.method313((byte) -99, i_5_, class59_sub3);
					Class3 class3_6_ = ((Class147) class147).aClass3_2160;
					if (class3_6_ == null)
						((Class147) class147).aClass3_2160 = class3;
					else {
						for (/**/; ((Class3) class3_6_).aClass3_28 != null; class3_6_ = ((Class3) class3_6_).aClass3_28) {
							/* empty */
						}
						((Class3) class3_6_).aClass3_28 = class3;
					}
					((Class147) class147).aByte2168 |= i_5_;
					if (bool_0_ && (Class128_Sub2.anIntArrayArray5565[i_3_][i_4_] & ~0xffffff) != 0) {
						i = Class128_Sub2.anIntArrayArray5565[i_3_][i_4_];
						i_1_ = Class189.aByteArrayArray2669[i_3_][i_4_];
						i_2_ = Class187.aByteArrayArray2649[i_3_][i_4_];
					}
				}
			}
		}
		if (bool_0_ && (i & ~0xffffff) != 0) {
			for (int i_7_ = ((Class59_Sub3) class59_sub3).aShort5057; i_7_ <= ((Class59_Sub3) class59_sub3).aShort5065; i_7_++) {
				for (int i_8_ = ((Class59_Sub3) class59_sub3).aShort5064; i_8_ <= ((Class59_Sub3) class59_sub3).aShort5062; i_8_++) {
					if ((Class128_Sub2.anIntArrayArray5565[i_7_][i_8_] & ~0xffffff) == 0) {
						Class128_Sub2.anIntArrayArray5565[i_7_][i_8_] = i;
						Class189.aByteArrayArray2669[i_7_][i_8_] = i_1_;
						Class187.aByteArrayArray2649[i_7_][i_8_] = i_2_;
					}
				}
			}
		}
		if (bool)
			Class246_Sub28_Sub36.aClass59_Sub3Array7018[Class_a.anInt1181++] = class59_sub3;
		return true;
	}

	public static void method1157(int i) {
		try {
			aClass13_2476 = null;
			aClass87_2480 = null;
			index1 = null;
			int i_9_ = -24 % ((-25 - i) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qg.B(" + i + ')');
		}
	}

	static final void method1158(Class_l[] class_ls, int i) {
		try {
			anInt2478++;
			Class149.anInt2192 = class_ls.length;
			Class21_Sub4.anIntArray4924 = new int[i + Class149.anInt2192];
			Class106_Sub2.aClass_lArray5340 = new Class_l[Class149.anInt2192 + 10];
			Class117.method807(class_ls, 0, Class106_Sub2.aClass_lArray5340, 0, Class149.anInt2192);
			for (int i_10_ = 0; Class149.anInt2192 > i_10_; i_10_++)
				Class21_Sub4.anIntArray4924[i_10_] = Class106_Sub2.aClass_lArray5340[i_10_].T();
			for (int i_11_ = Class149.anInt2192; i_11_ < Class106_Sub2.aClass_lArray5340.length; i_11_++)
				Class21_Sub4.anIntArray4924[i_11_] = 12;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qg.D(" + (class_ls != null ? "{...}" : "null") + ',' + i + ')');
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
		new Class67("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !", "Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!");
		anInt2481 = 0;
	}
}
