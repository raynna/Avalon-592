/* Class_q_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_q_Sub1 extends Class_q {
	static int anInt6659;
	static int anInt6660;
	static int anInt6661;
	private byte[] aByteArray6662;
	static HashMap aClass54_6663 = new HashMap(200);
	static int anInt6664 = -1;
	static int anInt6665;
	static int anInt6666;
	static int anInt6667;
	static int anInt6668;
	static int[] anIntArray6669 = new int[6];
	static int anInt6670 = 0;
	static long aLong6671;

	final void method2060(byte i, int i_0_, int i_1_) {
		try {
			anInt6661++;
			int i_2_ = i_0_ * 2;
			int i_3_ = 0xff & i;
			aByteArray6662[i_2_++] = (byte) (3 * i_3_ >> 5);
			int i_4_ = 101 / ((i_1_ + 21) / 51);
			aByteArray6662[i_2_] = (byte) (3 * i_3_ >> 5);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nd.E(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2731(int i, Class235 class235, Class260 class260) {
		do {
			try {
				anInt6667++;
				boolean bool = (Class255.aClass191_3663.method1248(class260, ((Class235) class235).anInt3210, i + 16777101, (((Class235) class235).f_db ? (((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131) : null), ((Class235) class235).anInt3274, ((Class235) class235).f_ec, ((Class235) class235).f_dc, ((Class235) class235).anInt3209 | i)) == null;
				if (!bool)
					break;
				Class213.aClass166_2982.method1101(false, new Class246_Sub12(((Class235) class235).anInt3210, ((Class235) class235).f_ec, ((Class235) class235).f_dc, (~0xffffff | ((Class235) class235).anInt3209), ((Class235) class235).anInt3274, ((Class235) class235).f_db));
				Stream_Sub1.method2483(class235, (byte) -109);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nd.B(" + i + ',' + (class235 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2732(int i) {
		do {
			try {
				aClass54_6663 = null;
				anIntArray6669 = null;
				if (i == -11878)
					break;
				method2731(-124, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "nd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2733(Class255_Sub1 class255_sub1, int i, byte[][] is) {
		do {
			try {
				anInt6665++;
				if (i == 8) {
					int[] is_5_ = { -1, 0, 0, 0, 0 };
					for (int i_6_ = 0; ((((Class255) class255_sub1).anInt3670 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
						Class85.method545((byte) -109);
						for (int i_7_ = 0; Class38_Sub1_Sub1.anInt6770 >> 3 > i_7_; i_7_++) {
							for (int i_8_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++) {
								boolean bool = false;
								int i_9_ = (Class172.anIntArrayArrayArray2431[i_6_][i_7_][i_8_]);
								if (i_9_ != -1) {
									int i_10_ = 0x3 & i_9_ >> 24;
									if (!((Class255) class255_sub1).aBool3658 || (i_10_ ^ 0xffffffff) == -1) {
										int i_11_ = i_9_ >> 1 & 0x3;
										int i_12_ = (0xffc909 & i_9_) >> 14;
										int i_13_ = (0x3ffc & i_9_) >> 3;
										int i_14_ = (i_12_ / 8 << 8) + i_13_ / 8;
										for (int i_15_ = 0; (Class168.anIntArray2398.length > i_15_); i_15_++) {
											if ((((Class168.anIntArray2398[i_15_]) ^ 0xffffffff) == (i_14_ ^ 0xffffffff)) && is[i_15_] != null) {
												BufferStream stream = new BufferStream(is[i_15_]);
												class255_sub1.method1657(i_11_, stream, i_10_, (Class95.aClass199Array1235), (byte) -12, i_13_, i_6_, 8 * i_8_, i_7_ * 8, i_12_);
												class255_sub1.method2339(i_6_, i_8_ * 8, stream, ((is_5_[0] ^ 0xffffffff) == 0) ? is_5_ : null, (Class246_Sub15.aClass260_4445), i_13_, i_12_, i_11_, i, i_10_, 8 * i_7_);
												bool = true;
												break;
											}
										}
									}
								}
								if (!bool)
									class255_sub1.method1648(true, 8, i_6_, 8, i_8_ * 8, 8 * i_7_);
							}
						}
					}
					if (is_5_[0] == -1)
						break;
					Class_u_Sub1.aClass230_5685 = (Class246_Sub31.aClass203_5038.method1335(is_5_[1], is_5_[0], 118, is_5_[2], is_5_[3], Class246_Sub1_Sub14.aClass214_6597));
					Class246_Sub28_Sub8.anInt6076 = is_5_[4];
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nd.D(" + (class255_sub1 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class_q_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	static final void method2734(int[] is, Npc class_r_sub2, int[] is_16_, boolean bool, int[] is_17_) {
		do {
			try {
				for (int i = 0; (i ^ 0xffffffff) > (is_16_.length ^ 0xffffffff); i++) {
					int i_18_ = is_16_[i];
					int i_19_ = is_17_[i];
					int i_20_ = is[i];
					for (int i_21_ = 0; i_19_ != 0 && (((Actor) class_r_sub2).aClass148Array6467).length > i_21_; i_21_++) {
						if ((0x1 & i_19_) != 0) {
							if (i_18_ == -1)
								((Actor) class_r_sub2).aClass148Array6467[i_21_] = null;
							else {
								Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i_18_);
								int i_22_ = ((Class124) class124).anInt1737;
								Class148 class148 = (((Actor) class_r_sub2).aClass148Array6467[i_21_]);
								if (class148 != null) {
									if (i_18_ != ((Class148) class148).anInt2179) {
										if (((Class124) class124).anInt1747 >= ((Class124) (Class59_Sub3_Sub3.aClass45_6275.method304(3, (((Class148) class148).anInt2179)))).anInt1747)
											class148 = ((Actor) class_r_sub2).aClass148Array6467[i_21_] = null;
									} else if (i_22_ != 0) {
										if (i_22_ != 1) {
											if ((i_22_ ^ 0xffffffff) == -3)
												((Class148) class148).anInt2183 = 0;
										} else {
											((Class148) class148).anInt2180 = 1;
											((Class148) class148).anInt2177 = 0;
											((Class148) class148).anInt2182 = 0;
											((Class148) class148).anInt2183 = 0;
											((Class148) class148).anInt2181 = i_20_;
											Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r_sub2).anInt5060), 0, (((Class59_Sub3) class_r_sub2).aByte5053), (((Class59_Sub3) class_r_sub2).anInt5059), !bool, class124, false);
										}
									} else
										class148 = ((Actor) class_r_sub2).aClass148Array6467[i_21_] = null;
								}
								if (class148 == null) {
									class148 = ((Actor) class_r_sub2).aClass148Array6467[i_21_] = new Class148();
									((Class148) class148).anInt2180 = 1;
									((Class148) class148).anInt2181 = i_20_;
									((Class148) class148).anInt2179 = i_18_;
									((Class148) class148).anInt2182 = 0;
									((Class148) class148).anInt2177 = 0;
									((Class148) class148).anInt2183 = 0;
									Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r_sub2).anInt5060), 0, (((Class59_Sub3) class_r_sub2).aByte5053), (((Class59_Sub3) class_r_sub2).anInt5059), !bool, class124, false);
								}
							}
						}
						i_19_ >>>= 1;
					}
				}
				anInt6659++;
				if (bool == false)
					break;
				aClass54_6663 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nd.C(" + (is != null ? "{...}" : "null") + ',' + (class_r_sub2 != null ? "{...}" : "null") + ',' + (is_16_ != null ? "{...}" : "null") + ',' + bool + ',' + (is_17_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final byte[] method2735(int i, int i_23_, int i_24_, int i_25_) {
		try {
			anInt6660++;
			aByteArray6662 = new byte[i_24_ * i_25_ * (i * 2)];
			if (i_23_ != -201)
				anInt6670 = -74;
			this.method263((byte) -95, i_24_, i, i_25_);
			return aByteArray6662;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nd.F(" + i + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	static {
		new Class67("Unable to add name - unknown player.", "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
		aLong6671 = -1L;
	}
}
