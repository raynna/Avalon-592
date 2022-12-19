/* Class130_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub4 extends Class130 {
	int anInt4737;
	static int anInt4738;
	int anInt4739;
	static Class205 aClass205_4740;
	int anInt4741;
	static boolean[] aBoolArray4742 = new boolean[8];
	int anInt4743;
	Actor aClass_r4744;
	static int anInt4745;

	public static void method2079(int i) {
		do {
			try {
				aBoolArray4742 = null;
				aClass205_4740 = null;
				if (i <= -31)
					break;
				method2080(68, 71L);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ku.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2080(int i, long l) {
		try {
			anInt4738++;
			int i_0_ = (anInt4745 + ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060);
			int i_1_ = (Class246_Sub28_Sub27.anInt6755 + ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059);
			if ((Class_c_Sub1.anInt5366 - i_0_ ^ 0xffffffff) > 499 || -i_0_ + Class_c_Sub1.anInt5366 > 500 || Class246_Sub34.anInt5135 - i_1_ < -500 || Class246_Sub34.anInt5135 - i_1_ > 500) {
				Class_c_Sub1.anInt5366 = i_0_;
				Class246_Sub34.anInt5135 = i_1_;
			}
			int i_2_ = -25 / ((i + 1) / 61);
			if ((i_0_ ^ 0xffffffff) != (Class_c_Sub1.anInt5366 ^ 0xffffffff)) {
				int i_3_ = i_0_ - Class_c_Sub1.anInt5366;
				int i_4_ = (int) (l * (long) i_3_ / 320L);
				if (i_3_ > 0) {
					if (i_4_ == 0)
						i_4_ = 1;
					else if (i_4_ > i_3_)
						i_4_ = i_3_;
				} else if ((i_4_ ^ 0xffffffff) == -1)
					i_4_ = -1;
				else if ((i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
					i_4_ = i_3_;
				Class_c_Sub1.anInt5366 += i_4_;
			}
			if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) {
				Class59_Sub2.aFloat4553 += Class24.aFloat341 * (float) l / 6.0F;
				Class204.aFloat2881 += (float) l * Class259_Sub2_Sub1.aFloat6906 / 6.0F;
			}
			if ((i_1_ ^ 0xffffffff) != (Class246_Sub34.anInt5135 ^ 0xffffffff)) {
				int i_5_ = -Class246_Sub34.anInt5135 + i_1_;
				int i_6_ = (int) ((long) i_5_ * l / 320L);
				if ((i_5_ ^ 0xffffffff) < -1) {
					if ((i_6_ ^ 0xffffffff) == -1)
						i_6_ = 1;
					else if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
						i_6_ = i_5_;
				} else if ((i_6_ ^ 0xffffffff) != -1) {
					if ((i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
						i_6_ = i_5_;
				} else
					i_6_ = -1;
				Class246_Sub34.anInt5135 += i_6_;
			}
			Class145.method977(39);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ku.A(" + i + ',' + l + ')');
		}
	}

	static {
		aClass205_4740 = new Class205("WTQA", 2);
		anInt4745 = 0;
		new Class67("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do cl\u00e3 do jogador: ");
	}
}
