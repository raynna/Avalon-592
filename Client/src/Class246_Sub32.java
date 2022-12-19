/* Class246_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub32 extends Node {
	static int anInt5039;
	byte[][][] aByteArrayArrayArray5040;
	Class182[] aClass182Array5041;
	static String aString5042 = "";
	int anInt5043;
	int[] anIntArray5044;
	int[] anIntArray5045;
	int anInt5046;
	Class182[] aClass182Array5047;
	static int anInt5048;
	static Class235[][] aClass235ArrayArray5049;
	int[] anIntArray5050;
	/* synthetic */ static Class aClass5051;

	static final void method2164(int i) {
		try {
			anInt5048++;
			((BufferStream) Class130_Sub1.stream).position = 0;
			Class233.anInt3184 = 0;
			Class259_Sub2_Sub1.aClass13_6907 = null;
			Class173.aClass13_2438 = null;
			Class100.anInt1303 = 0;
			Class161.INCOMING_PACKET = null;
			Class16.aClass13_235 = null;
			((BufferStream) Class78.packetStream).position = 0;
			Class130_Sub1_Sub1.anInt7046 = 0;
			Class106_Sub1.method1893(i - 151);
			Class105.method701(4);
			for (int i_0_ = 0; i_0_ < 2048; i_0_++)
				Class143.aClass_r_Sub1Array2069[i_0_] = null;
			Class_a.aClass_r_Sub1_1180 = null;
			for (int i_1_ = 0; i_1_ < Class76.aClass_r_Sub2Array1002.length; i_1_++) {
				Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_1_];
				if (class_r_sub2 != null)
					((Actor) class_r_sub2).faceEntity = -1;
			}
			Class38.method266(-121);
			Class130_Sub3.anInt4417 = 1;
			Class99.method622((byte) -123, i);
			for (int i_2_ = 0; i_2_ < 100; i_2_++)
				Class246_Sub39.aBoolArray5488[i_2_] = true;
			Class_a.method576((byte) 66);
			Class40_Sub9.aLong5507 = 0L;
			Class_j.aClass246_Sub39_1488 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ov.C(" + i + ')');
		}
	}

	static final void method2165(Class100 class100, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		((Class100) class100).anInt1298 = 0;
		while_17_: for (int i_7_ = i_3_; i_7_ <= i_5_; i_7_++) {
			for (int i_8_ = i_4_; i_8_ <= i_6_; i_8_++) {
				long l = Class255.aLongArrayArrayArray3648[i][i_7_][i_8_];
				long l_9_ = 0L;
				while_16_: while (l_9_ <= 48L) {
					int i_10_ = (int) (l >>> (int) l_9_ & 0xffffL);
					if (i_10_ <= 0)
						break;
					Class174 class174 = Class57.aClass174Array811[i_10_ - 1];
					for (int i_11_ = 0; i_11_ < ((Class100) class100).anInt1298; i_11_++) {
						if ((((Class100) class100).aClass246_Sub41Array1301[i_11_]) == ((Class174) class174).aClass246_Sub41_2452) {
							l_9_ += 16L;
							continue while_16_;
						}
					}
					((Class100) class100).aClass246_Sub41Array1301[((Class100) class100).anInt1298++] = ((Class174) class174).aClass246_Sub41_2452;
					if (((Class100) class100).anInt1298 == 4)
						break while_17_;
					l_9_ += 16L;
				}
			}
		}
		for (int i_12_ = ((Class100) class100).anInt1298; i_12_ < 4; i_12_++)
			((Class100) class100).aClass246_Sub41Array1301[i_12_] = null;
	}

	static final void method2166(int i, int i_13_, byte i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		while_19_: do {
			while_18_: do {
				try {
					int i_20_ = -4 % ((65 - i_14_) / 51);
					anInt5039++;
					if ((i_18_ ^ 0xffffffff) > -1 || (i_19_ ^ 0xffffffff) > -1 || ((-1 + Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) >= (i_18_ ^ 0xffffffff)) || i_19_ >= Class152.anInt2205 - 1)
						break while_19_;
					if (Class106.aClass147ArrayArrayArray1494 == null)
						break;
					if ((i_16_ ^ 0xffffffff) != -1) {
						do {
							if ((i_16_ ^ 0xffffffff) != -2) {
								if ((i_16_ ^ 0xffffffff) == -3) {
									Class_f class_f = ((Class_f) (Class17.method168(i, i_18_, i_19_, (aClass5051 != null ? aClass5051 : (aClass5051 = (getClassByName("Class_f")))))));
									if (class_f != null) {
										if ((i_17_ ^ 0xffffffff) == -12)
											i_17_ = 10;
										if (!(class_f instanceof Class59_Sub3_Sub3))
											Class12.method139(i, i_18_, i_17_, 255, i_15_, i_13_, class_f.method21(true), i_19_, i_16_);
										else
											((Class59_Sub3_Sub3) (Class59_Sub3_Sub3) class_f).aClass14_6269.method156(i_15_, 8192);
									}
								} else {
									if (i_16_ != 3)
										break;
									Class_f class_f = ((Class_f) Class246_Sub14.method1997(i, i_18_, i_19_));
									if (class_f == null)
										break;
									if (!(class_f instanceof Class59_Sub1_Sub2))
										Class12.method139(i, i_18_, i_17_, 255, i_15_, i_13_, class_f.method21(true), i_19_, i_16_);
									else
										((Class59_Sub1_Sub2) (Class59_Sub1_Sub2) class_f).aClass14_6124.method156(i_15_, 8192);
								}
								break;
							}
							Class_f class_f = (Class_f) Class31.method236(i, i_18_, i_19_);
							if (class_f == null)
								break while_18_;
							if (!(class_f instanceof Class59_Sub2_Sub3)) {
								int i_21_ = class_f.method21(true);
								if ((i_17_ ^ 0xffffffff) == -5 || i_17_ == 5)
									Class12.method139(i, i_18_, 4, 255, i_15_, i_13_, i_21_, i_19_, i_16_);
								else {
									if (i_17_ == 6)
										Class12.method139(i, i_18_, 4, 255, i_15_, i_13_ + 4, i_21_, i_19_, i_16_);
									else {
										if ((i_17_ ^ 0xffffffff) != -8) {
											if (i_17_ == 8) {
												Class12.method139(i, i_18_, 4, 255, i_15_, 4 + i_13_, i_21_, i_19_, i_16_);
												Class12.method139(i, i_18_, 4, 255, i_15_, (2 + i_13_ & 0x3) + 4, i_21_, i_19_, i_16_);
											}
										} else
											Class12.method139(i, i_18_, 4, 255, i_15_, 4 + (0x3 & 2 + i_13_), i_21_, i_19_, i_16_);
										break;
									}
									break;
								}
								break;
							}
							((Class59_Sub2_Sub3) (Class59_Sub2_Sub3) class_f).aClass14_6620.method156(i_15_, 8192);
						} while (false);
						break;
					}
					Class_f class_f = (Class_f) Class246_Sub22.method2082(i, i_18_, i_19_);
					Class_f class_f_22_ = (Class_f) Class73.method463(i, i_18_, i_19_);
					do {
						if (class_f != null && (i_17_ ^ 0xffffffff) != -3) {
							if (class_f instanceof Class59_Sub4_Sub3) {
								((Class59_Sub4_Sub3) (Class59_Sub4_Sub3) class_f).aClass14_6952.method156(i_15_, 8192);
								if (!client.f_ob)
									break;
							}
							Class12.method139(i, i_18_, i_17_, 255, i_15_, i_13_, class_f.method21(true), i_19_, i_16_);
						}
					} while (false);
					if (class_f_22_ == null)
						break while_19_;
					if (class_f_22_ instanceof Class59_Sub4_Sub3) {
						((Class59_Sub4_Sub3) (Class59_Sub4_Sub3) class_f_22_).aClass14_6952.method156(i_15_, 8192);
						break;
					}
					Class12.method139(i, i_18_, i_17_, 255, i_15_, i_13_, class_f_22_.method21(true), i_19_, i_16_);
				} catch (RuntimeException runtimeexception) {
					throw Class193.method1272(runtimeexception, ("ov.B(" + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	public static void method2167(byte i) {
		try {
			if (i != 86)
				method2164(114);
			aClass235ArrayArray5049 = null;
			aString5042 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ov.A(" + i + ')');
		}
	}

	public Class246_Sub32() {
		/* empty */
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
