
/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class207 {
	int anInt2909;
	int anInt2910;
	int anInt2911;
	static int anInt2912;
	boolean aBool2913 = true;
	int anInt2914 = -1;
	static int anInt2915;
	private int anInt2916 = 0;
	int anInt2917;
	static int anInt2918;
	static int anInt2919;
	static Class67 aClass67_2920 = new Class67(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.", " saiu do jogo.");
	static int anInt2921;
	static int anInt2922;
	static Class_fs aClass_fs2923;
	int anInt2924 = 128;

	private final void method1357(byte i, int i_0_) {
		try {
			anInt2912++;
			double d = (double) ((i_0_ & 0xff0e1b) >> 16) / 256.0;
			double d_1_ = (double) ((0xff0f & i_0_) >> 8) / 256.0;
			double d_2_ = (double) (0xff & i_0_) / 256.0;
			double d_3_ = d;
			if (d_3_ > d_1_)
				d_3_ = d_1_;
			if (d_2_ < d_3_)
				d_3_ = d_2_;
			double d_4_ = d;
			if (d_4_ < d_1_)
				d_4_ = d_1_;
			if (i <= -124) {
				if (d_2_ > d_4_)
					d_4_ = d_2_;
				double d_5_ = 0.0;
				double d_6_ = 0.0;
				double d_7_ = (d_3_ + d_4_) / 2.0;
				if (d_3_ != d_4_) {
					if (d_7_ < 0.5)
						d_6_ = (-d_3_ + d_4_) / (d_3_ + d_4_);
					if (d != d_4_) {
						if (d_4_ != d_1_) {
							if (d_2_ == d_4_)
								d_5_ = 4.0 + (d - d_1_) / (-d_3_ + d_4_);
						} else
							d_5_ = 2.0 + (-d + d_2_) / (d_4_ - d_3_);
					} else
						d_5_ = (-d_2_ + d_1_) / (-d_3_ + d_4_);
					if (d_7_ >= 0.5)
						d_6_ = (-d_3_ + d_4_) / (-d_4_ + 2.0 - d_3_);
				}
				((Class207) this).anInt2909 = (int) (256.0 * d_6_);
				((Class207) this).anInt2911 = (int) (256.0 * d_7_);
				d_5_ /= 6.0;
				if ((((Class207) this).anInt2911 ^ 0xffffffff) > -1)
					((Class207) this).anInt2911 = 0;
				else if ((((Class207) this).anInt2911 ^ 0xffffffff) < -256)
					((Class207) this).anInt2911 = 255;
				if (!(d_7_ > 0.5))
					((Class207) this).anInt2910 = (int) (d_7_ * d_6_ * 512.0);
				else
					((Class207) this).anInt2910 = (int) (512.0 * (d_6_ * (-d_7_ + 1.0)));
				if (((Class207) this).anInt2909 >= 0) {
					if ((((Class207) this).anInt2909 ^ 0xffffffff) < -256)
						((Class207) this).anInt2909 = 255;
				} else
					((Class207) this).anInt2909 = 0;
				if ((((Class207) this).anInt2910 ^ 0xffffffff) > -2)
					((Class207) this).anInt2910 = 1;
				((Class207) this).anInt2917 = (int) (d_5_ * (double) ((Class207) this).anInt2910);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.F(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method1358(int i) {
		try {
			int i_8_ = 26 % ((i - 11) / 40);
			aClass67_2920 = null;
			aClass_fs2923 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.B(" + i + ')');
		}
	}

	static final int method1359(int i) {
		try {
			anInt2915++;
			Class260 class260 = Class246_Sub15.aClass260_4445;
			boolean bool = false;
			if (BufferStream.anInt5656 != 0) {
				Canvas canvas = new Canvas();
				canvas.setSize(100, 100);
				class260 = Class260.method1682(null, 0, canvas, 0, (byte) 59, null);
				bool = true;
			}
			long l = Class151.time(-77);
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -10001; i_9_++)
				class260.method1717(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
			int i_10_ = 102 % ((i - 36) / 55);
			int i_11_ = (int) (-l + Class151.time(-110));
			class260.method1734(0, 100, 0, (byte) 58, -16777216, 100);
			if (bool)
				class260.method1708(true);
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sr.E(" + i + ')');
		}
	}

	static final void method1360(Actor class_r, int i) {
		do {
			try {
				((Actor) class_r).aBool6419 = false;
				anInt2921++;
				do {
					if ((((Actor) class_r).anInt6470 ^ 0xffffffff) != 0) {
						Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6470);
						if (class124 != null && ((Class124) class124).anIntArray1724 != null) {
							((Actor) class_r).anInt6457++;
							if ((((Actor) class_r).anInt6420 < ((Class124) class124).anIntArray1724.length) && (((((Class124) class124).anIntArray1745[((Actor) class_r).anInt6420]) ^ 0xffffffff) > (((Actor) class_r).anInt6457 ^ 0xffffffff))) {
								((Actor) class_r).anInt6457 = 1;
								((Actor) class_r).f_cb++;
								((Actor) class_r).anInt6420++;
								Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6420, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, class_r == Class_a.aClass_r_Sub1_1180);
							}
							if (((Actor) class_r).anInt6420 >= (((Class124) class124).anIntArray1724).length) {
								((Actor) class_r).anInt6420 = 0;
								((Actor) class_r).anInt6457 = 0;
								if (((Actor) class_r).aBool6450) {
									((Actor) class_r).anInt6470 = class_r.method2676(-1).method915(true);
									if (((Actor) class_r).anInt6470 == -1) {
										((Actor) class_r).aBool6450 = false;
										break;
									}
									class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6470));
								}
								Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6420, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, Class_a.aClass_r_Sub1_1180 == class_r);
							}
							((Actor) class_r).f_cb = 1 + ((Actor) class_r).anInt6420;
							if ((((Class124) class124).anIntArray1724.length ^ 0xffffffff) >= (((Actor) class_r).f_cb ^ 0xffffffff))
								((Actor) class_r).f_cb = 0;
						} else {
							((Actor) class_r).anInt6470 = -1;
							((Actor) class_r).aBool6450 = false;
						}
					}
				} while (false);
				do {
					if ((((Actor) class_r).anInt6437 ^ 0xffffffff) != 0 && ((((Actor) class_r).anInt6448 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff))) {
						Class144 class144 = Class195.aClass177_2745.method1164(-137, (((Actor) class_r).anInt6437));
						int i_12_ = ((Class144) class144).anInt2092;
						if (i_12_ == -1)
							((Actor) class_r).anInt6437 = -1;
						else {
							Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i_12_);
							if (((Class144) class144).aBool2087) {
								if ((((Class124) class124).anInt1727 ^ 0xffffffff) == -4) {
									if ((((Actor) class_r).f_sc ^ 0xffffffff) < -1 && (Class246_Sub1_Sub4.anInt5752 >= ((Actor) class_r).anInt6422) && (Class246_Sub1_Sub4.anInt5752 > ((Actor) class_r).anInt6428)) {
										((Actor) class_r).anInt6437 = -1;
										break;
									}
								} else if ((((Class124) class124).anInt1727 ^ 0xffffffff) == -2 && ((Actor) class_r).f_sc > 0 && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= ((((Actor) class_r).anInt6422) ^ 0xffffffff)) && (Class246_Sub1_Sub4.anInt5752 > (((Actor) class_r).anInt6428))) {
									((Actor) class_r).anInt6448 = 1 + Class246_Sub1_Sub4.anInt5752;
									break;
								}
							}
							if (class124 != null && (((Class124) class124).anIntArray1724 != null)) {
								if ((((Actor) class_r).anInt6433 ^ 0xffffffff) > -1) {
									((Actor) class_r).anInt6433 = 0;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, 0, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (Class_a.aClass_r_Sub1_1180 == class_r));
								}
								((Actor) class_r).anInt6442++;
								if (((((Class124) class124).anIntArray1724).length > ((Actor) class_r).anInt6433) && ((((Actor) class_r).anInt6442 ^ 0xffffffff) < ((((Class124) class124).anIntArray1745[((Actor) class_r).anInt6433]) ^ 0xffffffff))) {
									((Actor) class_r).anInt6433++;
									((Actor) class_r).anInt6442 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6433, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (class_r == Class_a.aClass_r_Sub1_1180));
								}
								if ((((Actor) class_r).anInt6433 ^ 0xffffffff) <= ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)) {
									if (((Class144) class144).aBool2087) {
										((Actor) class_r).anInt6433 -= ((Class124) class124).anInt1731;
										((Actor) class_r).f_ub++;
										if ((((Class124) class124).anInt1746 ^ 0xffffffff) < (((Actor) class_r).f_ub ^ 0xffffffff)) {
											if ((((Actor) class_r).anInt6433 ^ 0xffffffff) <= -1 && ((((Actor) class_r).anInt6433) < (((Class124) class124).anIntArray1724).length))
												Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).anInt5060), (((Actor) class_r).anInt6433), (((Class59_Sub3) class_r).aByte5053), (((Class59_Sub3) class_r).anInt5059), true, class124, ((Class_a.aClass_r_Sub1_1180) == class_r));
											else
												((Actor) class_r).anInt6437 = -1;
										} else
											((Actor) class_r).anInt6437 = -1;
									} else
										((Actor) class_r).anInt6437 = -1;
								}
								((Actor) class_r).f_fc = 1 + ((Actor) class_r).anInt6433;
								if (((Actor) class_r).f_fc >= (((Class124) class124).anIntArray1724).length) {
									if (!((Class144) class144).aBool2087)
										((Actor) class_r).f_fc = -1;
									else {
										((Actor) class_r).f_fc -= ((Class124) class124).anInt1731;
										if (((Class124) class124).anInt1746 > 1 + ((Actor) class_r).f_ub) {
											if ((((Actor) class_r).f_fc ^ 0xffffffff) > -1 || ((((Class124) class124).anIntArray1724).length <= (((Actor) class_r).f_fc)))
												((Actor) class_r).f_fc = -1;
										} else
											((Actor) class_r).f_fc = -1;
									}
								}
							} else
								((Actor) class_r).anInt6437 = -1;
						}
					}
				} while (false);
				do {
					if ((((Actor) class_r).f_pb ^ 0xffffffff) != 0 && (((Actor) class_r).anInt6458 <= Class246_Sub1_Sub4.anInt5752)) {
						Class144 class144 = Class195.aClass177_2745.method1164(-137, ((Actor) class_r).f_pb);
						int i_13_ = ((Class144) class144).anInt2092;
						if (i_13_ != -1) {
							Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, i_13_);
							if (((Class144) class144).aBool2087) {
								if (((Class124) class124).anInt1727 != 3) {
									if ((((Class124) class124).anInt1727 ^ 0xffffffff) == -2 && ((Actor) class_r).f_sc > 0 && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= (((Actor) class_r).anInt6422 ^ 0xffffffff)) && (((Actor) class_r).anInt6428 < Class246_Sub1_Sub4.anInt5752)) {
										((Actor) class_r).anInt6458 = Class246_Sub1_Sub4.anInt5752 + 1;
										break;
									}
								} else if (((Actor) class_r).f_sc > 0 && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= ((((Actor) class_r).anInt6422) ^ 0xffffffff)) && (Class246_Sub1_Sub4.anInt5752 > (((Actor) class_r).anInt6428))) {
									((Actor) class_r).f_pb = -1;
									break;
								}
							}
							if (class124 != null && (((Class124) class124).anIntArray1724 != null)) {
								if ((((Actor) class_r).anInt6427 ^ 0xffffffff) > -1) {
									((Actor) class_r).anInt6427 = 0;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, 0, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (Class_a.aClass_r_Sub1_1180 == class_r));
								}
								((Actor) class_r).anInt6454++;
								if (((((Actor) class_r).anInt6427 ^ 0xffffffff) > ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)) && ((((Actor) class_r).anInt6454 ^ 0xffffffff) < ((((Class124) class124).anIntArray1745[((Actor) class_r).anInt6427]) ^ 0xffffffff))) {
									((Actor) class_r).anInt6427++;
									((Actor) class_r).anInt6454 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6427, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (class_r == Class_a.aClass_r_Sub1_1180));
								}
								if ((((Actor) class_r).anInt6427 ^ 0xffffffff) <= ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)) {
									if (((Class144) class144).aBool2087) {
										((Actor) class_r).anInt6427 -= ((Class124) class124).anInt1731;
										((Actor) class_r).anInt6439++;
										if (((Actor) class_r).anInt6439 >= ((Class124) class124).anInt1746)
											((Actor) class_r).f_pb = -1;
										else if ((((Actor) class_r).anInt6427 < 0) || ((((Class124) class124).anIntArray1724).length <= (((Actor) class_r).anInt6427)))
											((Actor) class_r).f_pb = -1;
										else
											Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).anInt5060), ((Actor) class_r).anInt6427, (((Class59_Sub3) class_r).aByte5053), (((Class59_Sub3) class_r).anInt5059), true, class124, (class_r == (Class_a.aClass_r_Sub1_1180)));
									} else
										((Actor) class_r).f_pb = -1;
								}
								((Actor) class_r).anInt6461 = 1 + ((Actor) class_r).anInt6427;
								if (((((Class124) class124).anIntArray1724).length ^ 0xffffffff) >= (((Actor) class_r).anInt6461 ^ 0xffffffff)) {
									if (!((Class144) class144).aBool2087)
										((Actor) class_r).anInt6461 = -1;
									else {
										((Actor) class_r).anInt6461 -= ((Class124) class124).anInt1731;
										if ((1 + ((Actor) class_r).anInt6439 ^ 0xffffffff) > (((Class124) class124).anInt1746 ^ 0xffffffff)) {
											if ((((Actor) class_r).anInt6461 ^ 0xffffffff) > -1 || (((((Class124) class124).anIntArray1724).length ^ 0xffffffff) >= ((((Actor) class_r).anInt6461) ^ 0xffffffff)))
												((Actor) class_r).anInt6461 = -1;
										} else
											((Actor) class_r).anInt6461 = -1;
									}
								}
							} else
								((Actor) class_r).f_pb = -1;
						} else
							((Actor) class_r).f_pb = -1;
					}
				} while (false);
				if ((((Actor) class_r).anInt6426 ^ 0xffffffff) != 0 && (((Actor) class_r).f_qb ^ 0xffffffff) >= -2) {
					Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6426);
					if ((((Class124) class124).anInt1727 ^ 0xffffffff) != -4) {
						if (((((Class124) class124).anInt1727 ^ 0xffffffff) == -2) && (((Actor) class_r).f_sc ^ 0xffffffff) < -1 && ((((Actor) class_r).anInt6422 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff)) && ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) < (((Actor) class_r).anInt6428 ^ 0xffffffff)))
							((Actor) class_r).f_qb = 2;
					} else if (((Actor) class_r).f_sc > 0 && ((((Actor) class_r).anInt6422 ^ 0xffffffff) >= (Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff)) && (Class246_Sub1_Sub4.anInt5752 > ((Actor) class_r).anInt6428))
						((Actor) class_r).anInt6426 = -1;
				}
				if ((((Actor) class_r).anInt6426 ^ 0xffffffff) != 0 && (((Actor) class_r).f_qb ^ 0xffffffff) == -1) {
					Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6426);
					if (class124 == null || ((Class124) class124).anIntArray1724 == null)
						((Actor) class_r).anInt6426 = -1;
					else {
						((Actor) class_r).anInt6465++;
						if ((((Actor) class_r).anInt6452 < ((Class124) class124).anIntArray1724.length) && (((Actor) class_r).anInt6465 > (((Class124) class124).anIntArray1745[((Actor) class_r).anInt6452]))) {
							((Actor) class_r).anInt6465 = 1;
							((Actor) class_r).anInt6452++;
							Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6452, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, class_r == Class_a.aClass_r_Sub1_1180);
						}
						if (((Actor) class_r).anInt6452 >= ((Class124) class124).anIntArray1724.length) {
							((Actor) class_r).anInt6452 -= ((Class124) class124).anInt1731;
							((Actor) class_r).anInt6415++;
							if (((Class124) class124).anInt1746 > ((Actor) class_r).anInt6415) {
								if ((((Actor) class_r).anInt6452 ^ 0xffffffff) <= -1 && ((((Actor) class_r).anInt6452 ^ 0xffffffff) > ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)))
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Actor) class_r).anInt6452, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (class_r == Class_a.aClass_r_Sub1_1180));
								else
									((Actor) class_r).anInt6426 = -1;
							} else
								((Actor) class_r).anInt6426 = -1;
						}
						((Actor) class_r).anInt6449 = 1 + ((Actor) class_r).anInt6452;
						if (((Actor) class_r).anInt6449 >= ((Class124) class124).anIntArray1724.length) {
							((Actor) class_r).anInt6449 -= ((Class124) class124).anInt1731;
							if ((((Actor) class_r).anInt6415 + 1 ^ 0xffffffff) > (((Class124) class124).anInt1746 ^ 0xffffffff)) {
								if ((((Actor) class_r).anInt6449 ^ 0xffffffff) > -1 || ((((Actor) class_r).anInt6449 ^ 0xffffffff) <= ((((Class124) class124).anIntArray1724).length ^ 0xffffffff)))
									((Actor) class_r).anInt6449 = -1;
							} else
								((Actor) class_r).anInt6449 = -1;
						}
						((Actor) class_r).aBool6419 = ((Class124) class124).aBool1744;
					}
				}
				if (((Actor) class_r).f_qb > 0)
					((Actor) class_r).f_qb--;
				for (int i_14_ = 0; ((((Actor) class_r).aClass148Array6467.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
					Class148 class148 = ((Actor) class_r).aClass148Array6467[i_14_];
					if (class148 != null) {
						if (((Class148) class148).anInt2181 > 0)
							((Class148) class148).anInt2181--;
						else {
							Class124 class124 = (Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Class148) class148).anInt2179));
							if (class124 == null || (((Class124) class124).anIntArray1724 == null))
								((Actor) class_r).aClass148Array6467[i_14_] = null;
							else {
								((Class148) class148).anInt2182++;
								if ((((((Class124) class124).anIntArray1724).length ^ 0xffffffff) < (((Class148) class148).anInt2177 ^ 0xffffffff)) && (((((Class124) class124).anIntArray1745[((Class148) class148).anInt2177]) ^ 0xffffffff) > (((Class148) class148).anInt2182 ^ 0xffffffff))) {
									((Class148) class148).anInt2177++;
									((Class148) class148).anInt2182 = 1;
									Class246_Sub1_Sub2.method2424(((Class59_Sub3) class_r).anInt5060, ((Class148) class148).anInt2177, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059, true, class124, (Class_a.aClass_r_Sub1_1180 == class_r));
								}
								if (((Class148) class148).anInt2177 >= (((Class124) class124).anIntArray1724).length) {
									((Class148) class148).anInt2177 -= ((Class124) class124).anInt1731;
									((Class148) class148).anInt2183++;
									if ((((Class148) class148).anInt2183 ^ 0xffffffff) <= (((Class124) class124).anInt1746 ^ 0xffffffff))
										((Actor) class_r).aClass148Array6467[i_14_] = null;
									else if ((((Class148) class148).anInt2177 >= 0) && ((((Class124) class124).anIntArray1724).length > (((Class148) class148).anInt2177)))
										Class246_Sub1_Sub2.method2424((((Class59_Sub3) class_r).anInt5060), ((Class148) class148).anInt2177, (((Class59_Sub3) class_r).aByte5053), (((Class59_Sub3) class_r).anInt5059), true, class124, (Class_a.aClass_r_Sub1_1180 == class_r));
									else
										((Actor) class_r).aClass148Array6467[i_14_] = null;
								}
								((Class148) class148).anInt2180 = 1 + ((Class148) class148).anInt2177;
								if (((Class124) class124).anIntArray1724.length <= ((Class148) class148).anInt2180) {
									((Class148) class148).anInt2180 -= ((Class124) class124).anInt1731;
									if (((Class148) class148).anInt2183 + 1 >= ((Class124) class124).anInt1746)
										((Class148) class148).anInt2180 = -1;
									else if ((((Class148) class148).anInt2180 ^ 0xffffffff) > -1 || ((((Class124) class124).anIntArray1724).length <= (((Class148) class148).anInt2180)))
										((Class148) class148).anInt2180 = -1;
								}
							}
						}
					}
				}
				if (i < -36)
					break;
				aClass67_2920 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sr.D(" + (class_r != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1361(int i, BufferStream stream) {
		try {
			anInt2919++;
			if (i != -1)
				method1362(null, -126, -77);
			for (;;) {
				int i_15_ = stream.readUnsignedByte(255);
				if ((i_15_ ^ 0xffffffff) == -1)
					break;
				method1362(stream, i_15_, i + 129);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sr.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1362(BufferStream stream, int i, int i_16_) {
		do {
			try {
				anInt2918++;
				if (i != 1) {
					if (i != 2) {
						if (i == 3)
							((Class207) this).anInt2924 = stream.readUnsignedShort((byte) -59) << 0;
						else if (i == 4)
							((Class207) this).aBool2913 = false;
					} else {
						((Class207) this).anInt2914 = stream.readUnsignedShort((byte) -109);
						if ((((Class207) this).anInt2914 ^ 0xffffffff) == -65536)
							((Class207) this).anInt2914 = -1;
					}
				} else {
					anInt2916 = stream.read24BitInteger((byte) 29);
					method1357((byte) -127, anInt2916);
				}
				if (i_16_ == 128)
					break;
				method1362(null, 126, -96);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("sr.C(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ')'));
			}
			break;
		} while (false);
	}

	static final int method1363(int i, int i_17_, String string) {
		try {
			if (i_17_ > -13)
				return 18;
			anInt2922++;
			return Class248.method1583(false, i, true, string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sr.G(" + i + ',' + i_17_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class207() {
		/* empty */
	}
}
