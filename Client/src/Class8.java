/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
	static int anInt99;
	static int anInt100;
	static int anInt101;
	static int anInt102 = 0;

	static final void method80(byte i, Class260 class260) {
		try {
			anInt100++;
			if ((Class230.anInt3147 >= 2 || Class187.aBool2653) && Class150.aClass235_2196 == null && i <= -47) {
				String string;
				if (Class187.aBool2653 && Class230.anInt3147 < 2)
					string = (Class218.aString3026 + Class78.aClass67_1015.method436(true, Class_j.anInt1485) + Class246_Sub7.aString3964 + " ->");
				else if (!Node.aBool3468 || !Class216.aClass232_3009.method1488(-117, 81) || Class230.anInt3147 <= 2) {
					Class246_Sub35 class246_sub35 = ((Class246_Sub35) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev);
					string = Class246_Sub41_Sub2.method2678(-102, class246_sub35);
					int[] is = null;
					if (!Class252.method1619((((Class246_Sub35) class246_sub35).anInt5156), 0)) {
						if (((Class246_Sub35) class246_sub35).anInt5148 != -1)
							is = ((Class197) (Class255.aClass191_3663.method1251(22883, (((Class246_Sub35) class246_sub35).anInt5148)))).anIntArray2772;
						else if (Class246_Sub28_Sub27.method2767(((Class246_Sub35) class246_sub35).anInt5156, (byte) -123)) {
							Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[(int) (((Class246_Sub35) class246_sub35).aLong5157)]);
							if (class_r_sub2 != null) {
								Class253 class253 = (((Npc) class_r_sub2).aClass253_7184);
								if (((Class253) class253).anIntArray3594 != null)
									class253 = (class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658)));
								if (class253 != null)
									is = ((Class253) class253).f_ob;
							}
						} else if (Class57.method390(-112, (((Class246_Sub35) class246_sub35).anInt5156))) {
							Object object = null;
							Class185 class185;
							if ((((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) != -1011)
								class185 = (Class143.aClass251_2067.method1610((int) ((((Class246_Sub35) class246_sub35).aLong5157 >>> 32) & 0x7fffffffL), 0));
							else
								class185 = (Class143.aClass251_2067.method1610((int) ((Class246_Sub35) class246_sub35).aLong5157, 0));
							if (((Class185) class185).f_bb != null)
								class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) 92);
							if (class185 != null)
								is = ((Class185) class185).f_nb;
						}
					} else
						is = ((Class197) (Class255.aClass191_3663.method1251(22883, (int) (((Class246_Sub35) class246_sub35).aLong5157)))).anIntArray2772;
					if (is != null)
						string += Class247.method1581(is, 124);
				} else
					string = (Class246_Sub41_Sub2.method2678(-102, ((Class246_Sub35) (((Node) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev).prev))));
				if ((Class230.anInt3147 ^ 0xffffffff) < -3)
					string += ("<col=ffffff> / " + (Class230.anInt3147 - 2) + Class40_Sub2.aClass67_4034.method436(true, Class_j.anInt1485));
				if (Class152.aClass235_2203 == null) {
					if (Class87.aClass235_1142 != null && (Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394)) {
						int i_0_ = (Class79_Sub1.aClass116_5162.method789(Class246_Sub34.aRandom5144, Class106_Sub2.aClass_lArray5340, 0, Class21_Sub4.anIntArray4924, Class129.anInt1809, string, 0, 16777215, 4 + Class259_Sub2.anInt4960, Class246_Sub1_Sub8_Sub1.anInt7157 + 16));
						Class162.method1075(4 + Class259_Sub2.anInt4960, true, 16, Class_fs.aClass73_148.method459(-1, string) - -i_0_, Class246_Sub1_Sub8_Sub1.anInt7157);
					}
				} else {
					Class116 class116 = Class152.aClass235_2203.method1512(class260, -1);
					if (class116 == null)
						class116 = Class79_Sub1.aClass116_5162;
					class116.method783(((Class235) Class152.aClass235_2203).f_oc, ((Class235) Class152.aClass235_2203).f_sb, Class129.anInt1809, Class21_Sub4.anIntArray4924, Class106_Sub2.aClass_lArray5340, Class177.anInt2498, Class246_Sub34.aRandom5144, string, ((Class235) Class152.aClass235_2203).anInt3197, ((Class235) Class152.aClass235_2203).f_fc, ((Class235) Class152.aClass235_2203).anInt3209, ((Class235) Class152.aClass235_2203).f_pb, -23980, Class102.anIntArray1321, Class235.f_kd);
					Class162.method1075(Class102.anIntArray1321[0], true, Class102.anIntArray1321[3], Class102.anIntArray1321[2], Class102.anIntArray1321[1]);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ap.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}
}
