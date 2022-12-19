/* Class259_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class259_Sub2 extends Class259 {
	static Class124[] aClass124Array4958 = new Class124[14];
	static int[] anIntArray4959;
	static int anInt4960 = -1;
	static int anInt4961;
	static int anInt4962;
	static int anInt4963;

	static final void method2147(byte i, Class235 class235, int i_0_, int i_1_) {
		do {
			try {
				anInt4962++;
				if (!Class187.aBool2653) {
					for (int i_2_ = 9; (i_2_ ^ 0xffffffff) <= -6; i_2_--) {
						String string = Class238.method1534(i_2_, false, class235);
						if (string != null) {
							Class59_Sub2_Sub2.anInt6026++;
							Class259_Sub2_Sub1.method2846(1002, (byte) -55, false, (long) (1 + i_2_), ((Class235) class235).f_pd, ((Class235) class235).f_jb, true, string, ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, Class40_Sub3.method1860(i_2_, class235, -119));
						}
					}
					String string = Class179.method1174(class235, (byte) 120);
					if (string != null) {
						Class246_Sub1_Sub3.anInt5706++;
						Class259_Sub2_Sub1.method2846(9, (byte) -55, false, 0L, ((Class235) class235).f_pd, ((Class235) class235).f_jb, true, string, ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, ((Class235) class235).anInt3284);
					}
					for (int i_3_ = 4; (i_3_ ^ 0xffffffff) <= -1; i_3_--) {
						String string_4_ = Class238.method1534(i_3_, false, class235);
						if (string_4_ != null) {
							Class59_Sub2_Sub2.anInt6026++;
							Class259_Sub2_Sub1.method2846(48, (byte) -55, false, (long) (1 + i_3_), ((Class235) class235).f_pd, ((Class235) class235).f_jb, true, string_4_, ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, Class40_Sub3.method1860(i_3_, class235, -113));
						}
					}
					if (client.method2971(class235).method2121(1)) {
						Class246_Sub1.anInt3737++;
						if (((Class235) class235).aString3229 == null)
							Class259_Sub2_Sub1.method2846(60, (byte) -55, false, 0L, ((Class235) class235).f_pd, "", true, Class_l_Sub2.aClass67_5478.method436(true, Class_j.anInt1485), ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, -1);
						else
							Class259_Sub2_Sub1.method2846(60, (byte) -55, false, 0L, ((Class235) class235).f_pd, "", true, ((Class235) class235).aString3229, ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, -1);
					}
				} else {
					Class118 class118 = ((Class109_Sub1.anInt3754 ^ 0xffffffff) == 0 ? null : (Class246_Sub1_Sub10.f_eb.method1085((byte) -108, Class109_Sub1.anInt3754)));
					if (client.method2971(class235).method2118(i + 16339) && (0x20 & Node.anInt3469) != 0 && (class118 == null || (class235.method1501(i - 119, (((Class118) class118).anInt1634), Class109_Sub1.anInt3754) != ((Class118) class118).anInt1634))) {
						Class259_Sub2_Sub1.method2846(47, (byte) -55, false, 0L, ((Class235) class235).f_pd, (Class246_Sub7.aString3964 + " -> " + ((Class235) class235).f_jb), true, Class218.aString3026, ((Class235) class235).anInt3248, ((Class235) class235).anInt3210, Class147.anInt2148);
						Class149.anInt2188++;
					}
				}
				if (i == 118)
					break;
				anInt4960 = 79;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("on.C(" + i + ',' + (class235 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method2148(int i, Class_fs class_fs) {
		try {
			anInt4963++;
			int i_5_ = 0;
			if (class_fs.method112(-1, Class59_Sub4.anInt5187))
				i_5_++;
			if (class_fs.method112(-1, Class_c_Sub1.anInt5389))
				i_5_++;
			if (class_fs.method112(-1, Class43.anInt636))
				i_5_++;
			if (class_fs.method112(-1, Class130_Sub1_Sub1.anInt7045))
				i_5_++;
			if (class_fs.method112(-1, Class259_Sub1.anInt4506))
				i_5_++;
			if (class_fs.method112(-1, Class246_Sub1_Sub8_Sub1.anInt7159))
				i_5_++;
			if (class_fs.method112(-1, Class194_Sub2.anInt4954))
				i_5_++;
			if (class_fs.method112(-1, OutgoingPacket.anInt2862))
				i_5_++;
			if (class_fs.method112(-1, Player.f_nd))
				i_5_++;
			if (class_fs.method112(-1, Class21_Sub1.anInt3900))
				i_5_++;
			if (class_fs.method112(-1, Class_t.anInt1439))
				i_5_++;
			if (class_fs.method112(-1, Class107.anInt1507))
				i_5_++;
			if (class_fs.method112(-1, Class_ds.anInt6722))
				i_5_++;
			if (class_fs.method112(-1, Class246_Sub19_Sub2.anInt6805))
				i_5_++;
			if (i <= 110)
				method2149(-97);
			if (class_fs.method112(-1, Class233.anInt3182))
				i_5_++;
			if (class_fs.method112(-1, Class95.anInt1246))
				i_5_++;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("on.A(" + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2149(int i) {
		try {
			anIntArray4959 = null;
			if (i < 98)
				method2148(110, null);
			aClass124Array4958 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "on.B(" + i + ')');
		}
	}

	static {
		new Class67("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
	}
}
