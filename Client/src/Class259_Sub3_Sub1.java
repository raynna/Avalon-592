/* Class259_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class259_Sub3_Sub1 extends Class259_Sub3 {
	static int anInt6896;
	static int anInt6897;
	static int anInt6898;
	static int anInt6899;
	static Class67 aClass67_6900;
	static float aFloat6901;
	static Class67 aClass67_6902;
	static int anInt6903;

	static final void method2840(boolean bool, int i) {
		try {
			anInt6899++;
			if (bool) {
				if ((Class183.anInt2549 ^ 0xffffffff) != 0)
					Class246_Sub19.method2065(0, Class183.anInt2549);
				for (Class246_Sub40 class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.first((byte) -23); class246_sub40 != null; class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.next((byte) -20)) {
					if (!class246_sub40.method1576(-104)) {
						class246_sub40 = (Class246_Sub40) Class246_Sub34.aClass85_5143.first((byte) -23);
						if (class246_sub40 == null)
							break;
					}
					Class50.method328(true, class246_sub40, false, -80);
				}
				Class183.anInt2549 = -1;
				Class246_Sub34.aClass85_5143 = new Class85(8);
				IncomingPacket.method144(-19181);
				Class183.anInt2549 = Class136.anInt1945;
				Class177.method1165((byte) -112, false);
				Class205.method1341(-11712);
				Class146.method991(Class183.anInt2549);
			}
			Class69.method448(0);
			Class83.anInt1089 = -1;
			Class204.method1339(Class188.anInt2657, (byte) 127);
			Class_a.aClass_r_Sub1_1180 = new Player();
			((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0] = Class38_Sub1_Sub1.anInt6770 / 2;
			((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 = 128 * Class152.anInt2205 / 2;
			((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 = 128 * Class38_Sub1_Sub1.anInt6770 / 2;
			((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0] = Class152.anInt2205 / 2;
			Class246_Sub16.aInt92 = Class259_Sub1.anInt4509 = 0;
			int i_0_ = 125 % ((i - 16) / 46);
			if (Class130_Sub3.anInt4417 == 2) {
				Class259_Sub1.anInt4509 = Class100.anInt1306 << 7;
				Class246_Sub16.aInt92 = Class78.anInt1013 << 7;
			} else
				Class246_Sub30.method2156(true);
			Class118.method815((byte) -36);
			if (Class246_Sub16.aInt92 == 0 || (Class259_Sub1.anInt4509 ^ 0xffffffff) == -1)
				Class99.method622((byte) 78, 10);
			else {
				Stream_Sub1.method2475(-12319);
				Class99.method622((byte) -125, 28);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.E(" + bool + ',' + i + ')');
		}
	}

	static final int method2841(int i, int i_1_) {
		try {
			if (i != 9921)
				aFloat6901 = -2.019924F;
			anInt6898++;
			return 0x7f & i_1_ >> 11;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.B(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method2842(byte i) {
		try {
			Class98.anInt1274++;
			Class243.writePacket(-114, Class195.aClass201_2746);
			anInt6896++;
			Class130_Sub1.stream.writeShort((byte) 67, SubIncomingPacket.anInt7095);
			int i_2_ = -3 / ((14 - i) / 47);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.D(" + i + ')');
		}
	}

	public static void method2843(byte i) {
		try {
			if (i > 105) {
				aClass67_6900 = null;
				aClass67_6902 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "su.A(" + i + ')');
		}
	}

	static final void method2844(Class235 class235, int i, boolean bool) {
		do {
			try {
				anInt6897++;
				int i_3_ = ((((Class235) class235).anInt3264 ^ 0xffffffff) != -1 ? ((Class235) class235).anInt3264 : ((Class235) class235).f_fc);
				int i_4_ = ((((Class235) class235).anInt3276 ^ 0xffffffff) != i ? ((Class235) class235).anInt3276 : ((Class235) class235).f_sb);
				Class246_Sub1_Sub13.method2698(i_3_, i_4_, (Class246_Sub32.aClass235ArrayArray5049[((Class235) class235).anInt3248 >> 16]), 22611, ((Class235) class235).anInt3248, bool);
				if (((Class235) class235).f_ad != null)
					Class246_Sub1_Sub13.method2698(i_3_, i_4_, ((Class235) class235).f_ad, i + 22612, (((Class235) class235).anInt3248), bool);
				Class246_Sub40 class246_sub40 = ((Class246_Sub40) (Class246_Sub34.aClass85_5143.method544((long) ((Class235) class235).anInt3248, 123)));
				if (class246_sub40 == null)
					break;
				Class221.method1433(-1, bool, i_4_, (((Class246_Sub40) class246_sub40).anInt5517), i_3_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("su.C(" + (class235 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static {
		new Class67("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activ\u00e9 !", "Seu canal de cl\u00e3 j\u00e1 est\u00e1 ativado!");
		aClass67_6900 = new Class67("Drop", "Fallen lassen", "Poser", "Largar");
		new Class67("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.", "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
		aClass67_6902 = (new Class67("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde..."));
		anInt6903 = -1;
	}
}
