/* Class_a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_a {
	static int anInt1173;
	static int anInt1174;
	static Class138[][] aClass138ArrayArray1175;
	static int anInt1176;
	static int anInt1177;
	static IncomingPacket DESTROY_WORLD_OBJECT_PACKET = new IncomingPacket(45, 2);
	static int loadingStage = 0;
	static Player aClass_r_Sub1_1180;
	static int anInt1181 = 0;
	static boolean[][] aBoolArrayArray1182 = { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	static final void method572(int i) {
		try {
			anInt1173++;
			if (i != 0)
				method575(-95);
			for (Class246_Sub6 class246_sub6 = (Class246_Sub6) Class61.aClass166_846.method1104(111); class246_sub6 != null; class246_sub6 = ((Class246_Sub6) Class61.aClass166_846.method1108((byte) -112))) {
				if ((((Class246_Sub6) class246_sub6).anInt3931 ^ 0xffffffff) != 0)
					class246_sub6.unlink((byte) -124);
				else {
					((Class246_Sub6) class246_sub6).anInt3934 = 0;
					if ((((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff) <= -1 && (((Class246_Sub6) class246_sub6).anInt3925 ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (((Class246_Sub6) class246_sub6).anInt3928 ^ 0xffffffff)) && (Class152.anInt2205 > ((Class246_Sub6) class246_sub6).anInt3925))
						Class9.method82(22, class246_sub6);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.E(" + i + ')');
		}
	}

	static final void method573(boolean bool, int i) {
		do {
			try {
				Class59_Sub3_Sub3.aClass54_6277.method380(i, -50);
				anInt1177++;
				if (bool == true)
					break;
				method572(122);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "a.D(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final void method574(int i) {
		try {
			Stream_Sub1.method2483(Class150.aClass235_2196, (byte) -109);
			anInt1176++;
			Class246_Sub1_Sub17.anInt6734++;
			if (!Class64_Sub1.aBool5240 || !Class259_Sub3.aBool5355) {
				if (Class246_Sub1_Sub17.anInt6734 > 1)
					Class150.aClass235_2196 = null;
			} else {
				if (i >= -75)
					method573(true, -33);
				int i_0_ = Class238.aClass102_3360.method640((byte) 58);
				int i_1_ = Class238.aClass102_3360.method636(3045);
				i_0_ -= Class99.anInt1292;
				i_1_ -= Class246_Sub43.anInt5605;
				if (i_0_ < Class260.anInt3722)
					i_0_ = Class260.anInt3722;
				if (((((Class235) Class33.aClass235_445).f_fc + Class260.anInt3722) ^ 0xffffffff) > (i_0_ + ((Class235) Class150.aClass235_2196).f_fc ^ 0xffffffff))
					i_0_ = (-((Class235) Class150.aClass235_2196).f_fc + (Class260.anInt3722 + ((Class235) Class33.aClass235_445).f_fc));
				if ((Class208.anInt2937 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
					i_1_ = Class208.anInt2937;
				if ((i_1_ - -((Class235) Class150.aClass235_2196).f_sb ^ 0xffffffff) < ((((Class235) Class33.aClass235_445).f_sb + Class208.anInt2937) ^ 0xffffffff))
					i_1_ = (Class208.anInt2937 + ((Class235) Class33.aClass235_445).f_sb - ((Class235) Class150.aClass235_2196).f_sb);
				int i_2_ = i_0_ + (-Class260.anInt3722 + ((Class235) Class33.aClass235_445).anInt3270);
				int i_3_ = (((Class235) Class33.aClass235_445).anInt3292 + (-Class208.anInt2937 + i_1_));
				if (Class238.aClass102_3360.method634(114)) {
					if (Class246_Sub1_Sub17.anInt6734 > ((Class235) Class150.aClass235_2196).anInt3226) {
						int i_4_ = i_0_ - Class134.anInt1873;
						int i_5_ = -Class259_Sub3_Sub1.anInt6903 + i_1_;
						if ((((Class235) Class150.aClass235_2196).anInt3240 < i_4_) || (-((Class235) Class150.aClass235_2196).anInt3240 > i_4_) || (((Class235) Class150.aClass235_2196).anInt3240 ^ 0xffffffff) > (i_5_ ^ 0xffffffff) || ((i_5_ ^ 0xffffffff) > (-(((Class235) Class150.aClass235_2196).anInt3240) ^ 0xffffffff)))
							Class246_Sub1_Sub2.aBool5698 = true;
					}
					if ((((Class235) Class150.aClass235_2196).anObjectArray3269 != null) && Class246_Sub1_Sub2.aBool5698) {
						Class246_Sub29 class246_sub29 = new Class246_Sub29();
						((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) Class150.aClass235_2196).anObjectArray3269);
						((Class246_Sub29) class246_sub29).anInt4979 = i_2_;
						((Class246_Sub29) class246_sub29).anInt4975 = i_3_;
						((Class246_Sub29) class246_sub29).aClass235_4974 = Class150.aClass235_2196;
						Class146.method988(class246_sub29);
					}
				} else {
					if (!Class246_Sub1_Sub2.aBool5698) {
						if ((Class59_Sub3_Sub2.anInt5889 != 1 && !Class84.method535((byte) -20)) || (Class230.anInt3147 ^ 0xffffffff) >= -3) {
							if (Class7.method77(128))
								Class55.method386(113, (Class99.anInt1292 - -Class134.anInt1873), (Class259_Sub3_Sub1.anInt6903 + (Class246_Sub43.anInt5605)));
						} else
							Class55.method386(-119, (Class99.anInt1292 + Class134.anInt1873), (Class259_Sub3_Sub1.anInt6903 + Class246_Sub43.anInt5605));
					} else {
						Class59_Sub4.method2209((byte) 120);
						if ((((Class235) Class150.aClass235_2196).anObjectArray3241) != null) {
							Class246_Sub29 class246_sub29 = new Class246_Sub29();
							((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) Class150.aClass235_2196).anObjectArray3241);
							((Class246_Sub29) class246_sub29).anInt4975 = i_3_;
							((Class246_Sub29) class246_sub29).aClass235_4969 = Class_ls.aClass235_964;
							((Class246_Sub29) class246_sub29).aClass235_4974 = Class150.aClass235_2196;
							((Class246_Sub29) class246_sub29).anInt4979 = i_2_;
							Class146.method988(class246_sub29);
						}
						if (Class_ls.aClass235_964 != null && (client.method2977(Class150.aClass235_2196) != null))
							Class46.method312(Class150.aClass235_2196, true, Class_ls.aClass235_964);
					}
					Class150.aClass235_2196 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.B(" + i + ')');
		}
	}

	public static void method575(int i) {
		try {
			if (i != -14407)
				DESTROY_WORLD_OBJECT_PACKET = null;
			aClass_r_Sub1_1180 = null;
			DESTROY_WORLD_OBJECT_PACKET = null;
			aClass138ArrayArray1175 = null;
			aBoolArrayArray1182 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.C(" + i + ')');
		}
	}

	static final void method576(byte i) {
		try {
			OutgoingPacket.anInt2856++;
			anInt1174++;
			Class243.writePacket(-122, Npc.aClass201_7168);
			Class130_Sub1.stream.writeByte(255, Class258.method1673((byte) -123));
			if (i >= 48) {
				Class130_Sub1.stream.writeShort((byte) 67, Class246_Sub41_Sub1.anInt6171);
				Class130_Sub1.stream.writeShort((byte) 67, Class162.anInt2300);
				Class130_Sub1.stream.writeByte(255, (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt588));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "a.A(" + i + ')');
		}
	}
}
