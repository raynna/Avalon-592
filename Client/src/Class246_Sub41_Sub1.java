/* Class246_Sub41_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub41_Sub1 extends Class246_Sub41 {
	static int anInt6168;
	static int anInt6169;
	static int anInt6170;
	static int anInt6171;
	static String[] aStringArray6172 = new String[100];

	public static void method2584(byte i) {
		try {
			if (i != 55)
				anInt6171 = -10;
			aStringArray6172 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hc.A(" + i + ')');
		}
	}

	Class246_Sub41_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		super(i, i_0_, i_1_, i_2_, i_3_, f);
	}

	final void method2320(int i, int i_4_, int i_5_, byte i_6_) {
		try {
			((Class246_Sub41) this).anInt5536 = i_4_;
			((Class246_Sub41) this).anInt5524 = i_5_;
			anInt6170++;
			if (i_6_ != 21)
				method2320(4, -40, -119, (byte) 30);
			((Class246_Sub41) this).anInt5529 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hc.G(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final int method2585(byte i, Actor class_r) {
		try {
			if (i != -17)
				anInt6171 = 31;
			anInt6169++;
			if (((Actor) class_r).f_cc == 0)
				return 0;
			if (((Actor) class_r).faceEntity != -1) {
				Actor class_r_7_ = null;
				if (((Actor) class_r).faceEntity >= 32768) {
					if (((Actor) class_r).faceEntity >= 32768)
						class_r_7_ = (Class143.aClass_r_Sub1Array2069[-32768 + ((Actor) class_r).faceEntity]);
				} else
					class_r_7_ = (Class76.aClass_r_Sub2Array1002[((Actor) class_r).faceEntity]);
				if (class_r_7_ != null) {
					int i_8_ = (-((Class59_Sub3) class_r_7_).anInt5060 + ((Class59_Sub3) class_r).anInt5060);
					int i_9_ = (-((Class59_Sub3) class_r_7_).anInt5059 + ((Class59_Sub3) class_r).anInt5059);
					if (i_8_ != 0 || i_9_ != 0)
						class_r.method2662(0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_8_, (double) i_9_)), false);
				}
			}
			do {
				if (!(class_r instanceof Player)) {
					if (!(class_r instanceof Npc))
						break;
					Npc class_r_sub2 = (Npc) class_r;
					if ((((Npc) class_r_sub2).f_vc ^ 0xffffffff) == 0 || (((Actor) class_r_sub2).f_oc != 0 && ((Actor) class_r_sub2).f_kc <= 0))
						break;
					int i_10_ = (((Class59_Sub3) class_r_sub2).anInt5060 - (-Class39_Sub1.anInt4670 + (-Class39_Sub1.anInt4670 + ((Npc) class_r_sub2).f_vc)) * 64);
					int i_11_ = (-(64 * (-Class47.anInt686 + ((Npc) class_r_sub2).anInt7171 - Class47.anInt686)) + ((Class59_Sub3) class_r_sub2).anInt5059);
					if ((i_10_ ^ 0xffffffff) != -1 || (i_11_ ^ 0xffffffff) != -1)
						class_r_sub2.method2662(0x3fff & (int) (Math.atan2((double) i_10_, (double) i_11_) * 2607.5945876176133), false);
					((Npc) class_r_sub2).f_vc = -1;
					if (!client.f_ob)
						break;
				}
				Player class_r_sub1 = (Player) class_r;
				if ((((Player) class_r_sub1).anInt7133 ^ 0xffffffff) != 0 && (((Actor) class_r_sub1).f_oc == 0 || ((Actor) class_r_sub1).f_kc > 0)) {
					class_r_sub1.method2662((((Player) class_r_sub1).anInt7133), false);
					((Player) class_r_sub1).anInt7133 = -1;
				}
			} while (false);
			return class_r.method2669(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hc.B(" + i + ',' + (class_r != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2315(int i, float f) {
		try {
			anInt6168++;
			if (i != 0)
				anInt6171 = 127;
			((Class246_Sub41) this).aFloat5525 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hc.C(" + i + ',' + f + ')');
		}
	}
}
