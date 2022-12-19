
/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class Class170 {
	private Inflater anInflater2415;
	static int anInt2416;
	static IncomingPacket SPAWN_WORLD_OBJECT_PACKET = new IncomingPacket(70, 4);
	static int anInt2418;
	static int anInt2419;
	static OutgoingPacket aClass201_2420 = new OutgoingPacket(44, -1);
	static int anInt2421;

	static final void method1125(boolean bool, byte i, int i_0_, int i_1_, boolean bool_2_) {
		try {
			anInt2418++;
			if (bool_2_ || Class92.anInt1206 != i_1_ || (i_0_ ^ 0xffffffff) != (Class130_Sub8.anInt5618 ^ 0xffffffff) || (Class40_Sub6.anInt5103 != Class246_Sub28_Sub24.anInt6681 && !Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 111))) {
				Class92.anInt1206 = i_1_;
				Class130_Sub8.anInt5618 = i_0_;
				Class40_Sub6.anInt5103 = Class246_Sub28_Sub24.anInt6681;
				if (Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 123))
					Class40_Sub6.anInt5103 = 0;
				if (!bool)
					Class99.method622((byte) -120, 25);
				else
					Class99.method622((byte) 37, 28);
				Class_w.method2650(true, Class250.aClass67_3531.method436(true, Class_j.anInt1485), Class109.aClass116_1554, 13);
				int i_3_ = Class39_Sub1.anInt4670;
				Class39_Sub1.anInt4670 = 8 * (-(Class38_Sub1_Sub1.anInt6770 >> 4) + Class92.anInt1206);
				int i_4_ = Class47.anInt686;
				Class47.anInt686 = 8 * (Class130_Sub8.anInt5618 - (Class152.anInt2205 >> 4));
				Class246_Sub28_Sub17.aClass246_Sub1_Sub5_6409 = Class79.method498(8 * Class92.anInt1206, 8 * Class130_Sub8.anInt5618);
				Class246_Sub29.aClass178_4966 = null;
				int i_5_ = Class39_Sub1.anInt4670 - i_3_;
				int i_6_ = Class47.anInt686 + -i_4_;
				if (bool) {
					Class5.anInt55 = 0;
					int i_7_ = 128 * (Class38_Sub1_Sub1.anInt6770 - 1);
					int i_8_ = -128 + Class152.anInt2205 * 128;
					for (int i_9_ = 0; i_9_ < 32768; i_9_++) {
						Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_9_];
						if (class_r_sub2 != null) {
							((Class59_Sub3) class_r_sub2).anInt5059 -= i_6_ * 128;
							((Class59_Sub3) class_r_sub2).anInt5060 -= i_5_ * 128;
							if ((((Class59_Sub3) class_r_sub2).anInt5060 ^ 0xffffffff) <= -1 && ((i_7_ ^ 0xffffffff) <= (((Class59_Sub3) class_r_sub2).anInt5060 ^ 0xffffffff)) && ((Class59_Sub3) class_r_sub2).anInt5059 >= 0 && i_8_ >= (((Class59_Sub3) class_r_sub2).anInt5059)) {
								boolean bool_10_ = true;
								for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -11; i_11_++) {
									((Actor) class_r_sub2).f_mc[i_11_] -= i_5_;
									((Actor) class_r_sub2).f_nc[i_11_] -= i_6_;
									if ((((Actor) class_r_sub2).f_mc[i_11_] ^ 0xffffffff) > -1 || (Class38_Sub1_Sub1.anInt6770 <= (((Actor) class_r_sub2).f_mc[i_11_])) || ((((Actor) class_r_sub2).f_nc[i_11_]) ^ 0xffffffff) > -1 || ((Class152.anInt2205 ^ 0xffffffff) >= ((((Actor) class_r_sub2).f_nc[i_11_]) ^ 0xffffffff)))
										bool_10_ = false;
								}
								if (bool_10_)
									Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_9_;
								else {
									Class76.aClass_r_Sub2Array1002[i_9_].method2934((byte) -124, null);
									Class76.aClass_r_Sub2Array1002[i_9_] = null;
								}
							} else {
								Class76.aClass_r_Sub2Array1002[i_9_].method2934((byte) -124, null);
								Class76.aClass_r_Sub2Array1002[i_9_] = null;
							}
						}
					}
				} else {
					for (int i_12_ = 0; i_12_ < 32768; i_12_++) {
						Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_12_];
						if (class_r_sub2 != null) {
							for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -11; i_13_++) {
								((Actor) class_r_sub2).f_mc[i_13_] -= i_5_;
								((Actor) class_r_sub2).f_nc[i_13_] -= i_6_;
							}
							((Class59_Sub3) class_r_sub2).anInt5059 -= i_6_ * 128;
							((Class59_Sub3) class_r_sub2).anInt5060 -= 128 * i_5_;
						}
					}
				}
				for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -2049; i_14_++) {
					Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_14_];
					if (class_r_sub1 != null) {
						for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -11; i_15_++) {
							((Actor) class_r_sub1).f_mc[i_15_] -= i_5_;
							((Actor) class_r_sub1).f_nc[i_15_] -= i_6_;
						}
						((Class59_Sub3) class_r_sub1).anInt5059 -= 128 * i_6_;
						((Class59_Sub3) class_r_sub1).anInt5060 -= i_5_ * 128;
					}
				}
				Class29[] class29s = Class166.aClass29Array2347;
				for (int i_16_ = 0; i_16_ < class29s.length; i_16_++) {
					Class29 class29 = class29s[i_16_];
					if (class29 != null) {
						((Class29) class29).anInt394 -= 128 * i_6_;
						((Class29) class29).anInt392 -= i_5_ * 128;
					}
				}
				Class63_Sub1.method2074(27106, i_5_, i_6_);
				for (Class246_Sub6 class246_sub6 = ((Class246_Sub6) Class61.aClass166_846.method1104(93)); class246_sub6 != null; class246_sub6 = ((Class246_Sub6) Class61.aClass166_846.method1108((byte) -112))) {
					((Class246_Sub6) class246_sub6).anInt3925 -= i_6_;
					((Class246_Sub6) class246_sub6).anInt3928 -= i_5_;
					if ((Class255_Sub1.anInt5573 ^ 0xffffffff) != -4 && (((Class246_Sub6) class246_sub6).anInt3928 < 0 || ((Class246_Sub6) class246_sub6).anInt3925 < 0 || (((Class246_Sub6) class246_sub6).anInt3928 >= Class38_Sub1_Sub1.anInt6770) || (((Class246_Sub6) class246_sub6).anInt3925 >= Class152.anInt2205)))
						class246_sub6.unlink((byte) -56);
				}
				if (Class188.anInt2658 != 0) {
					Class188.anInt2658 -= i_5_;
					Class34.anInt451 -= i_6_;
				}
				Class246_Sub1_Sub9.method2590(true);
				if (bool) {
					Class100.anInt1306 -= i_6_;
					Class246_Sub16.aInt92 -= i_5_ * 128;
					Class130_Sub3.anInt4406 -= i_5_;
					Class40_Sub9.anInt5497 -= i_6_;
					Class259_Sub1.anInt4509 -= 128 * i_6_;
					Class78.anInt1013 -= i_5_;
					if (Math.abs(i_5_) > Class38_Sub1_Sub1.anInt6770 || (Math.abs(i_6_) ^ 0xffffffff) < (Class152.anInt2205 ^ 0xffffffff))
						Class118.method815((byte) -36);
				} else if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -5)
					Class130_Sub3.anInt4417 = 1;
				else {
					Class246_Sub34.anInt5135 -= 128 * i_6_;
					Class242.anInt3424 -= i_5_ * 128;
					Class246_Sub43.anInt5606 -= i_6_ * 128;
					Class_c_Sub1.anInt5366 -= i_5_ * 128;
				}
				Class106_Sub1.method1893(-128);
				Class149.method1004(-100);
				Class246_Sub29.aClass166_4968.method1102(-103);
				Class12.aClass166_180.method1102(-87);
				Class_o.aClass68_7208.method443(i ^ 0xb);
				if (i == 104)
					Class4.method54(i ^ 0x60);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pp.B(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + bool_2_ + ')'));
		}
	}

	public static void method1126(boolean bool) {
		try {
			if (bool == false) {
				aClass201_2420 = null;
				SPAWN_WORLD_OBJECT_PACKET = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pp.A(" + bool + ')');
		}
	}

	static final void method1127(byte i, int i_17_) {
		try {
			if (i <= -77) {
				if (i_17_ == 37)
					Class79.aFloat1036 = 3.0F;
				else if ((i_17_ ^ 0xffffffff) == -51)
					Class79.aFloat1036 = 4.0F;
				else if (i_17_ != 75) {
					if ((i_17_ ^ 0xffffffff) == -101)
						Class79.aFloat1036 = 8.0F;
					else if ((i_17_ ^ 0xffffffff) == -201)
						Class79.aFloat1036 = 16.0F;
				} else
					Class79.aFloat1036 = 6.0F;
				Class40.anInt617 = -1;
				anInt2416++;
				Class40.anInt617 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pp.E(" + i + ',' + i_17_ + ')');
		}
	}

	static final void method1128(byte i) {
		try {
			anInt2419++;
			if (i >= -126)
				SPAWN_WORLD_OBJECT_PACKET = null;
			if (!Class168.aBool2400) {
				Class168.aBool2400 = true;
				Class135.aBool1929 = true;
				if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605)
					Class259_Sub2_Sub1.aFloat6906 += (-24.0F - Class259_Sub2_Sub1.aFloat6906) / 2.0F;
				else
					Class204.aFloat2881 = (float) (~0x7f & (int) Class204.aFloat2881 - 65);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pp.C(" + i + ')');
		}
	}

	private Class170(int i, int i_18_, int i_19_) {
		/* empty */
	}

	public Class170() {
		this(-1, 1000000, 1000000);
	}

	final void method1129(byte i, byte[] is, BufferStream stream) {
		try {
			anInt2421++;
			if (i != -33)
				SPAWN_WORLD_OBJECT_PACKET = null;
			if ((((BufferStream) stream).buffer[((BufferStream) stream).position] ^ 0xffffffff) != -32 || (((BufferStream) stream).buffer[((BufferStream) stream).position + 1]) != -117)
				throw new RuntimeException("Invalid GZIP header!");
			if (anInflater2415 == null)
				anInflater2415 = new Inflater(true);
			try {
				anInflater2415.setInput(((BufferStream) stream).buffer, 10 + ((BufferStream) stream).position, (-10 + -((BufferStream) stream).position + (-8 + (((BufferStream) stream).buffer).length)));
				anInflater2415.inflate(is);
			} catch (Exception exception) {
				anInflater2415.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater2415.reset();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pp.D(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}
}
