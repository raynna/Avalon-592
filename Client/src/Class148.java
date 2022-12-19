/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148 {
	static int anInt2176 = 0;
	int anInt2177;
	static Class250 aClass250_2178;
	int anInt2179;
	int anInt2180;
	int anInt2181;
	int anInt2182;
	int anInt2183;
	static int anInt2184;
	static int anInt2185;
	static int anInt2186;

	public static void method1000(int i) {
		try {
			if (i != 7559)
				anInt2184 = 0;
			aClass250_2178 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nv.A(" + i + ')');
		}
	}

	static final void method1001(Signlink class52, String string, boolean bool, boolean bool_0_, int i) {
		try {
			anInt2186++;
			int i_1_ = -104 / ((-16 - i) / 33);
			if (!bool_0_)
				Class246_Sub28_Sub17.method2658(class52, 3, string, 120);
			else {
				if (Signlink.osName.startsWith("win") && Signlink.anInt740 != 3) {
					String string_2_ = null;
					if (class52.anApplet733 != null)
						string_2_ = class52.anApplet733.getParameter("haveie6");
					if (string_2_ == null || !string_2_.equals("1")) {
						Class182 class182 = Class246_Sub28_Sub17.method2658(class52, 0, string, 122);
						Class40_Sub7.aString5175 = string;
						Class75.aClass182_989 = class182;
						InputStream_Sub1.aClass52_4825 = class52;
						return;
					}
				}
				if (Signlink.osName.startsWith("mac")) {
					String string_3_ = null;
					if (class52.anApplet733 != null)
						string_3_ = class52.anApplet733.getParameter("havefirefox");
					if (string_3_ != null && string_3_.equals("1") && bool) {
						Class246_Sub28_Sub17.method2658(class52, 1, string, 118);
						return;
					}
				}
				Class246_Sub28_Sub17.method2658(class52, 2, string, 127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nv.C(" + (class52 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + bool + ',' + bool_0_ + ',' + i + ')'));
		}
	}

	static final void method1002(int i, String string, int i_4_, int i_5_, int i_6_, Class116 class116, int i_7_, Class235 class235, int i_8_, int i_9_, Class73 class73, Class128 class128) {
		try {
			anInt2185++;
			int i_10_;
			do {
				if (Class130_Sub3.anInt4417 == 4) {
					i_10_ = (int) Class204.aFloat2881 & 0x3fff;
					if (!client.f_ob)
						break;
				}
				i_10_ = 0x3fff & (int) Class204.aFloat2881 - -Class95.anInt1253;
			} while (false);
			int i_11_ = 10 + Math.max(((Class235) class235).f_fc / 2, ((Class235) class235).f_sb / 2);
			int i_12_ = i_5_ * i_5_ + i_8_ * i_8_;
			if (i_4_ == 3 && i_12_ <= i_11_ * i_11_) {
				int i_13_ = Class39_Sub1.f_fb[i_10_];
				int i_14_ = Class39_Sub1.anIntArray4672[i_10_];
				if (Class130_Sub3.anInt4417 != 4) {
					i_14_ = i_14_ * 256 / (Class246_Sub12.anInt4405 + 256);
					i_13_ = i_13_ * 256 / (256 + Class246_Sub12.anInt4405);
				}
				int i_15_ = i_8_ * i_13_ - -(i_5_ * i_14_) >> 15;
				int i_16_ = i_14_ * i_8_ - i_13_ * i_5_ >> 15;
				int i_17_ = class73.method468((byte) 73, string, 100, null);
				int i_18_ = class73.method464(string, 100, -1, null, 0);
				i_15_ -= i_17_ / 2;
				if (((-((Class235) class235).f_fc ^ 0xffffffff) >= (i_15_ ^ 0xffffffff)) && i_15_ <= ((Class235) class235).f_fc && i_16_ >= -((Class235) class235).f_sb && i_16_ <= ((Class235) class235).f_sb)
					class116.method799(0, i_7_, null, i, 1, class128, (-i_18_ + (-i_6_ + (-i_16_ + (((Class235) class235).f_sb / 2 + i_7_)))), (i_15_ - -i - -(((Class235) class235).f_fc / 2)), 0, 0, 50, i_17_, i_9_, 0, string, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nv.B(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + (class116 != null ? "{...}" : "null") + ',' + i_7_ + ',' + (class235 != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ',' + (class73 != null ? "{...}" : "null") + ',' + (class128 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class148() {
		/* empty */
	}

	static {
		new Class67(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		anInt2184 = 0;
	}
}
