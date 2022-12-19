/* Class_c - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_c {
	static Class67 aClass67_1190 = new Class67("Loaded core fonts", "Schriftarten geladen", "Polices charg\u00e9es", "Fontes principais carregadas");
	static int anInt1191;
	static int anInt1192;
	static IncomingPacket DYNAMIC_MAP_REGION_PACKET = new IncomingPacket(59, -2);
	static Class76 aClass76_1194;
	static int anInt1195;
	static Class116 aClass116_1196;

	public Class_c() {
		/* empty */
	}

	abstract void p(int i, int i_0_, int i_1_, int[] is);

	abstract void N(int i);

	abstract void xa();

	abstract void m(int[] is);

	abstract void ra(int i);

	abstract void j(int i, int i_2_, int i_3_);

	abstract Class_c method582();

	abstract void ja(int i);

	abstract void za(Class_c class_c_4_);

	abstract void ka(int i);

	static final void method583(boolean bool, int i, Class235 class235, int i_5_, int i_6_) {
		do {
			try {
				anInt1191++;
				int i_7_ = ((Class235) class235).f_fc;
				if ((((Class235) class235).f_ob ^ 0xffffffff) == -1)
					((Class235) class235).f_fc = ((Class235) class235).anInt3258;
				else if ((((Class235) class235).f_ob ^ 0xffffffff) == -2)
					((Class235) class235).f_fc = i + -((Class235) class235).anInt3258;
				else if ((((Class235) class235).f_ob ^ 0xffffffff) == -3)
					((Class235) class235).f_fc = ((Class235) class235).anInt3258 * i >> 14;
				int i_8_ = ((Class235) class235).f_sb;
				int i_9_ = 4 % ((-13 - i_5_) / 45);
				if (((Class235) class235).aByte3223 == 0)
					((Class235) class235).f_sb = ((Class235) class235).f_mb;
				else if (((Class235) class235).aByte3223 == 1)
					((Class235) class235).f_sb = -((Class235) class235).f_mb + i_6_;
				else if (((Class235) class235).aByte3223 == 2)
					((Class235) class235).f_sb = ((Class235) class235).f_mb * i_6_ >> 14;
				if (((Class235) class235).f_ob == 4)
					((Class235) class235).f_fc = (((Class235) class235).anInt3200 * ((Class235) class235).f_sb / ((Class235) class235).f_cd);
				if (((Class235) class235).aByte3223 == 4)
					((Class235) class235).f_sb = (((Class235) class235).f_cd * ((Class235) class235).f_fc / ((Class235) class235).anInt3200);
				if (Class_v.aBool1452 && (((((Class246_Sub27) client.method2971(class235)).anInt4893) ^ 0xffffffff) != -1 || ((Class235) class235).f_vc == 0)) {
					if ((((Class235) class235).f_sb ^ 0xffffffff) > -6 && (((Class235) class235).f_fc ^ 0xffffffff) > -6) {
						((Class235) class235).f_sb = 5;
						((Class235) class235).f_fc = 5;
					} else {
						if ((((Class235) class235).f_sb ^ 0xffffffff) >= -1)
							((Class235) class235).f_sb = 5;
						if ((((Class235) class235).f_fc ^ 0xffffffff) >= -1)
							((Class235) class235).f_fc = 5;
					}
				}
				if (((Class235) class235).anInt3280 == Class246_Sub1_Sub3.anInt5719)
					Class104.f_vb = class235;
				if (!bool || ((Class235) class235).anObjectArray3206 == null)
					break;
				if ((i_7_ ^ 0xffffffff) != (((Class235) class235).f_fc ^ 0xffffffff) || (i_8_ ^ 0xffffffff) != (((Class235) class235).f_sb ^ 0xffffffff)) {
					Class246_Sub29 class246_sub29 = new Class246_Sub29();
					((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
					((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3206;
					Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("c.C(" + bool + ',' + i + ',' + (class235 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method584(boolean bool) {
		try {
			aClass76_1194 = null;
			if (bool != false)
				anInt1195 = 60;
			DYNAMIC_MAP_REGION_PACKET = null;
			aClass67_1190 = null;
			aClass116_1196 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "c.D(" + bool + ')');
		}
	}

	abstract void O(int i);

	abstract void method585(int i, int i_10_, int i_11_, int[] is);

	abstract void s(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	abstract void o(int i, int i_17_, int i_18_);
}
