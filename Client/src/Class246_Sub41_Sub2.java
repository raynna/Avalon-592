/* Class246_Sub41_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub41_Sub2 extends Class246_Sub41 {
	static int anInt6473;
	static HashMap aClass54_6474;
	static int anInt6475;
	static int anInt6476;
	static int anInt6477;
	static String[] aStringArray6478 = new String[100];
	static int anInt6479;
	static int anInt6480;
	static int anInt6481;

	static final String method2678(int i, Class246_Sub35 class246_sub35) {
		try {
			if (i >= -25)
				aClass54_6474 = null;
			anInt6473++;
			if (((Class246_Sub35) class246_sub35).aString5152 == null || ((Class246_Sub35) class246_sub35).aString5152.length() <= 0)
				return ((Class246_Sub35) class246_sub35).aString5149;
			return (((Class246_Sub35) class246_sub35).aString5149 + Class78.aClass67_1015.method436(true, Class_j.anInt1485) + ((Class246_Sub35) class246_sub35).aString5152);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kc.F(" + i + ',' + (class246_sub35 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2679(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt6475++;
			int i_4_ = i_2_ + -i_3_;
			int i_5_ = i_0_ + -i_1_;
			if (bool != false)
				method2680(20, -111, 112, -8);
			if (i_4_ != 0) {
				if ((i_5_ ^ 0xffffffff) == -1) {
					Class59.method408(i_1_, i_3_, i, (byte) 96, i_2_);
					return;
				}
			} else {
				if ((i_5_ ^ 0xffffffff) != -1)
					Class121.method823(i_3_, (byte) -44, i_1_, i_0_, i);
				return;
			}
			int i_6_ = (i_5_ << 12) / i_4_;
			int i_7_ = i_1_ - (i_6_ * i_3_ >> 12);
			int i_8_;
			int i_9_;
			if ((i_3_ ^ 0xffffffff) > (Class197.anInt2818 ^ 0xffffffff)) {
				i_8_ = (Class197.anInt2818 * i_6_ >> 12) + i_7_;
				i_9_ = Class197.anInt2818;
			} else if (i_3_ <= Class110.anInt1573) {
				i_8_ = i_1_;
				i_9_ = i_3_;
			} else {
				i_9_ = Class110.anInt1573;
				i_8_ = (Class110.anInt1573 * i_6_ >> 12) + i_7_;
			}
			int i_10_;
			int i_11_;
			if ((i_2_ ^ 0xffffffff) > (Class197.anInt2818 ^ 0xffffffff)) {
				i_11_ = (i_6_ * Class197.anInt2818 >> 12) + i_7_;
				i_10_ = Class197.anInt2818;
			} else if (Class110.anInt1573 >= i_2_) {
				i_10_ = i_2_;
				i_11_ = i_0_;
			} else {
				i_10_ = Class110.anInt1573;
				i_11_ = i_7_ + (i_6_ * Class110.anInt1573 >> 12);
			}
			if (Class_t.anInt1442 <= i_11_) {
				if (i_11_ > Class109_Sub4.anInt4570) {
					i_11_ = Class109_Sub4.anInt4570;
					i_10_ = (Class109_Sub4.anInt4570 - i_7_ << 12) / i_6_;
				}
			} else {
				i_11_ = Class_t.anInt1442;
				i_10_ = (Class_t.anInt1442 + -i_7_ << 12) / i_6_;
			}
			if (i_8_ >= Class_t.anInt1442) {
				if (Class109_Sub4.anInt4570 < i_8_) {
					i_8_ = Class109_Sub4.anInt4570;
					i_9_ = (-i_7_ + Class109_Sub4.anInt4570 << 12) / i_6_;
				}
			} else {
				i_9_ = (Class_t.anInt1442 - i_7_ << 12) / i_6_;
				i_8_ = Class_t.anInt1442;
			}
			Class91.method579(i_8_, i_9_, i, i_11_, i_10_, -27);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kc.B(" + i + ',' + bool + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class246_Sub41_Sub2(int i, int i_12_, int i_13_, int i_14_, int i_15_, float f) {
		super(i, i_12_, i_13_, i_14_, i_15_, f);
	}

	final void method2320(int i, int i_16_, int i_17_, byte i_18_) {
		try {
			((Class246_Sub41) this).anInt5536 = i_16_;
			((Class246_Sub41) this).anInt5524 = i_17_;
			if (i_18_ != 21)
				aClass54_6474 = null;
			((Class246_Sub41) this).anInt5529 = i;
			anInt6479++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kc.G(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	static final void method2680(int i, int i_19_, int i_20_, int i_21_) {
		try {
			anInt6480++;
			String string = ("tele " + i + "," + (i_21_ >> 6) + "," + (i_20_ >> 6) + "," + (0x3f & i_21_) + "," + (i_19_ & i_20_));
			System.out.println(string);
			Class187_Sub2.method2285(string, true, i_19_ - 60);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kc.A(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ')'));
		}
	}

	static final int method2681(PacketsDecoder class_is, Class260 class260, byte i) {
		try {
			if (i != -31)
				return 10;
			anInt6476++;
			if (((PacketsDecoder) class_is).anInt271 != -1)
				return ((PacketsDecoder) class_is).anInt271;
			if ((((PacketsDecoder) class_is).anInt279 ^ 0xffffffff) != 0) {
				Class238 class238 = (((Class260) class260).anInterface6_3714.method17(i - 31274, (class260.method1684() ? ((PacketsDecoder) class_is).anInt279 : ((PacketsDecoder) class_is).anInt276)));
				if (!((Class238) class238).aBool3339)
					return ((Class238) class238).aShort3354;
			}
			return ((PacketsDecoder) class_is).anInt284;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kc.D(" + (class_is != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2315(int i, float f) {
		try {
			if (i != 0)
				method2680(122, -20, -27, 0);
			anInt6477++;
			((Class246_Sub41) this).aFloat5525 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kc.C(" + i + ',' + f + ')');
		}
	}

	public static void method2682(int i) {
		do {
			try {
				aStringArray6478 = null;
				aClass54_6474 = null;
				if (i == -7247)
					break;
				aStringArray6478 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kc.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass54_6474 = new HashMap(4);
		anInt6481 = 0;
		new Class67("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.", "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
	}
}
