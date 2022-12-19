/* Class246_Sub28_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub6 extends Class246_Sub28 {
	static int anInt6035;
	static int anInt6036;
	static int anInt6037;
	static int anInt6038;
	static int anInt6039;
	static Class169 aClass169_6040 = new Class169("", 12);
	static Class67 aClass67_6041 = new Class67("Checking for updates - ", "Suche nach Updates - ", "V\u00e9rification des mises \u00e0 jour - ", "Verificando atualiza\u00e7\u00f5es - ");
	static int[][] anIntArrayArray6042;
	static int[] anIntArray6043 = new int[1000];
	static Class67 aClass67_6044 = new Class67("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
	static int anInt6045;
	static int anInt6046;

	static final void method2550(int i, int i_0_, Class235 class235, int i_1_) {
		try {
			anInt6036++;
			if (Class150.aClass235_2196 == null && !Class246_Sub28_Sub21.aBool6580 && (class235 != null && Class5.method60(i + 3547, class235) != null)) {
				Class150.aClass235_2196 = class235;
				Class33.aClass235_445 = Class5.method60(3547, class235);
				Class246_Sub43.anInt5605 = i_0_;
				Class246_Sub1_Sub17.anInt6734 = i;
				Class99.anInt1292 = i_1_;
				Class246_Sub1_Sub2.aBool5698 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eq.A(" + i + ',' + i_0_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	static final void method2551(Class235 class235, int i) {
		try {
			anInt6037++;
			if (i == 18804) {
				if (Class100_Sub1.anInt5076 == ((Class235) class235).anInt3280) {
					if (((Player) Class_a.aClass_r_Sub1_1180).aString7140 == null) {
						((Class235) class235).anInt3289 = 0;
						((Class235) class235).anInt3215 = 0;
					} else {
						((Class235) class235).anInt3283 = 150;
						((Class235) class235).f_gd = (0x7ff & (int) (256.0 * Math.sin((double) (Class246_Sub1_Sub4.anInt5752) / 40.0)));
						((Class235) class235).anInt3244 = 5;
						((Class235) class235).anInt3215 = Class109.anInt1567;
						((Class235) class235).anInt3289 = (Class246_Sub1_Sub4_Sub1.method2893((byte) -93, (((Player) Class_a.aClass_r_Sub1_1180).aString7140)));
						((Class235) class235).anInt3221 = ((Actor) Class_a.aClass_r_Sub1_1180).f_cb;
						((Class235) class235).anInt3256 = ((Actor) Class_a.aClass_r_Sub1_1180).anInt6420;
						((Class235) class235).anInt3275 = 0;
						((Class235) class235).anInt3232 = ((Actor) Class_a.aClass_r_Sub1_1180).anInt6470;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.B(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2552(byte i) {
		try {
			anIntArray6043 = null;
			aClass169_6040 = null;
			anIntArrayArray6042 = null;
			if (i < 8)
				method2550(-65, 91, null, 33);
			aClass67_6041 = null;
			aClass67_6044 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.H(" + i + ')');
		}
	}

	static final void method2553(int i) {
		do {
			try {
				anInt6039++;
				for (Class246_Sub1_Sub7 class246_sub1_sub7 = ((Class246_Sub1_Sub7) Class12.aClass166_180.method1104(40)); class246_sub1_sub7 != null; class246_sub1_sub7 = ((Class246_Sub1_Sub7) Class12.aClass166_180.method1108((byte) -112))) {
					Class_g class_g = (((Class246_Sub1_Sub7) class246_sub1_sub7).aClass_g6034);
					if ((Class246_Sub28_Sub24.anInt6681 != ((Class59_Sub3) class_g).aByte5053) || ((((Class_g) class_g).anInt6492 ^ 0xffffffff) > (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff))) {
						class246_sub1_sub7.unlink((byte) 116);
						class_g.method2683((byte) -105);
					} else if ((((Class_g) class_g).f_hb ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff)) {
						if ((((Class_g) class_g).anInt6503 ^ 0xffffffff) < -1) {
							Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[((Class_g) class_g).anInt6503 - 1]);
							if (class_r_sub2 != null && (((Class59_Sub3) class_r_sub2).anInt5060 ^ 0xffffffff) <= -1 && ((128 * Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (((Class59_Sub3) class_r_sub2).anInt5060 ^ 0xffffffff)) && (((Class59_Sub3) class_r_sub2).anInt5059 ^ 0xffffffff) <= -1 && ((Class152.anInt2205 * 128 ^ 0xffffffff) < (((Class59_Sub3) class_r_sub2).anInt5059 ^ 0xffffffff)))
								class_g.method2686(Class246_Sub1_Sub4.anInt5752, ((Class59_Sub3) class_r_sub2).anInt5060, (Class6.getAverageHeight(((Class59_Sub3) class_r_sub2).anInt5060, 86, (((Class59_Sub3) class_g).aByte5053), ((Class59_Sub3) class_r_sub2).anInt5059) - ((Class_g) class_g).anInt6502), ((Class59_Sub3) class_r_sub2).anInt5059, 16);
						}
						if (((Class_g) class_g).anInt6503 < 0) {
							int i_2_ = -1 + -((Class_g) class_g).anInt6503;
							Player class_r_sub1;
							if ((Class109.anInt1567 ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
								class_r_sub1 = Class_a.aClass_r_Sub1_1180;
							else
								class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_2_];
							if (class_r_sub1 != null && (((Class59_Sub3) class_r_sub1).anInt5060 ^ 0xffffffff) <= -1 && (((Class59_Sub3) class_r_sub1).anInt5060 < 128 * Class38_Sub1_Sub1.anInt6770) && (((Class59_Sub3) class_r_sub1).anInt5059 ^ 0xffffffff) <= -1 && (((Class59_Sub3) class_r_sub1).anInt5059 < Class152.anInt2205 * 128))
								class_g.method2686(Class246_Sub1_Sub4.anInt5752, ((Class59_Sub3) class_r_sub1).anInt5060, (Class6.getAverageHeight(((Class59_Sub3) class_r_sub1).anInt5060, i ^ 0x6569, (((Class59_Sub3) class_g).aByte5053), ((Class59_Sub3) class_r_sub1).anInt5059) - ((Class_g) class_g).anInt6502), ((Class59_Sub3) class_r_sub1).anInt5059, 71);
						}
						class_g.method2687((byte) -51, Class246_Sub17.anInt4663);
						Class176.method1156(class_g, true);
					}
				}
				if (i == 25861)
					break;
				anIntArrayArray6042 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "eq.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class246_Sub28_Sub6() {
		super(0, true);
	}

	static final long method2554(int i, String string) {
		try {
			anInt6038++;
			long l = 0L;
			int i_3_ = string.length();
			if (i != 1)
				method2554(-9, null);
			for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				l *= 37L;
				int i_5_ = string.charAt(i_4_);
				if ((i_5_ ^ 0xffffffff) <= -66 && i_5_ <= 90)
					l += (long) (i_5_ + 1 - 65);
				else if (i_5_ >= 97 && i_5_ <= 122)
					l += (long) (i_5_ + 1 - 97);
				else if ((i_5_ ^ 0xffffffff) <= -49 && (i_5_ ^ 0xffffffff) >= -58)
					l += (long) (-48 + i_5_ + 27);
				if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L)
					break;
			}
			for (/**/; ((l % 37L ^ 0xffffffffffffffffL) == -1L && (l ^ 0xffffffffffffffffL) != -1L); l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eq.C(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method2135(int i, int i_6_) {
		try {
			anInt6035++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_6_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887)
				Class117.method802(is, 0, Class246_Sub37_Sub1.f_gb, Class246_Sub1_Sub11.anIntArray6245[i_6_]);
			int i_7_ = -55 / ((67 - i) / 50);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eq.E(" + i + ',' + i_6_ + ')');
		}
	}
}
