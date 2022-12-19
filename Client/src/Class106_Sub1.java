/* Class106_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106_Sub1 extends Class106 {
	static int anInt4163;
	static int anInt4164;
	static int anInt4165;
	static int anInt4166;
	static int anInt4167;
	static int anInt4168;
	static int anInt4169;
	static int anInt4170;
	static int anInt4171;
	static int anInt4172;
	static int anInt4173;
	static int anInt4174 = -1;
	private Object anObject4175 = new Object();
	static int anInt4176;
	static int anInt4177;
	static int anInt4178;
	static int anInt4179;
	static int anInt4180;
	private int anInt4181 = 0;
	private int anInt4182;
	private Class100_Sub1[] aClass100_Sub1Array4183 = new Class100_Sub1[0];

	final void method724(byte i, int i_0_) {
		try {
			int i_1_ = -118 / ((i + 81) / 34);
			anInt4177++;
			synchronized (anObject4175) {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) i_0_;
				((Class106) this).anInt1492++;
				if (((Class106) this).anInt1492 >= 5000)
					((Class106) this).anInt1492 = 0;
				((Class106) this).anInt1496++;
				((Class106) this).anInt1493++;
				if ((anInt4181 ^ 0xffffffff) < -1)
					anObject4175.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1890(byte i) {
		do {
			try {
				if (i != 3)
					anInt4174 = 38;
				anInt4173++;
				if (Class246_Sub1.aClass260_3741 == null)
					break;
				Class246_Sub1.aClass260_3741.method1708(true);
				Class246_Sub1.aClass260_3741 = null;
				Class59_Sub3_Sub1.aClass116_5747 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fc.L(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1891(int i, int i_2_) {
		try {
			anInt4178++;
			((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) (i_2_ + 10);
			((Class106) this).anInt1492++;
			((Class106) this).anInt1496++;
			if (i != 0)
				anObject4175 = null;
			if ((((Class106) this).anInt1492 ^ 0xffffffff) <= -5001)
				((Class106) this).anInt1492 = 0;
			((Class106) this).anInt1493++;
			if ((anInt4181 ^ 0xffffffff) < -1) {
				synchronized (anObject4175) {
					anObject4175.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.M(" + i + ',' + i_2_ + ')');
		}
	}

	final void method725(byte i, Class147 class147) {
		try {
			if (i > -29)
				aClass100_Sub1Array4183 = null;
			synchronized (anObject4175) {
				((Class106) this).anInt1489--;
				if (((Class106) this).anInt1489 < 0)
					((Class106) this).anInt1489 = 4999;
				((Class106) this).aByteArray1490[((Class106) this).anInt1489] = (byte) 21;
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1489)] = class147;
				((Class106) this).anInt1493++;
				((Class106) this).anInt1496++;
				if ((anInt4181 ^ 0xffffffff) < -1)
					anObject4175.notifyAll();
			}
			anInt4167++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fc.K(" + i + ',' + (class147 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method726(int i, boolean bool, Class210 class210, float f, byte i_3_) {
		try {
			synchronized (anObject4175) {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) (!bool ? 30 + i : i + 40);
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class210;
				((Class106) this).aFloatArray1495[((Class106) this).anInt1492] = f;
				((Class106) this).anInt1492++;
				((Class106) this).anInt1496++;
				((Class106) this).anInt1493++;
				if (i_3_ != 46)
					anInt4174 = -35;
				if (((Class106) this).anInt1492 >= 5000)
					((Class106) this).anInt1492 = 0;
				if ((anInt4181 ^ 0xffffffff) < -1)
					anObject4175.notifyAll();
			}
			anInt4166++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fc.E(" + i + ',' + bool + ',' + (class210 != null ? "{...}" : "null") + ',' + f + ',' + i_3_ + ')'));
		}
	}

	static final void method1892(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool) {
		try {
			do {
				if ((Class197.anInt2818 ^ 0xffffffff) < (-i_4_ + i ^ 0xffffffff) || Class110.anInt1573 < i_4_ + i || Class_t.anInt1442 > -i_4_ + i_6_ || ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i_4_ + i_6_ ^ 0xffffffff))) {
					Class56.method388((byte) 127, i_8_, i_5_, i_4_, i_7_, i, i_6_);
					if (!client.f_ob)
						break;
				}
				Class166.method1098(bool, i_7_, i_4_, i, i_8_, i_5_, i_6_);
			} while (false);
			if (bool != true)
				anInt4179 = 48;
			anInt4180++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fc.C(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ')'));
		}
	}

	final void method720(int i) {
		try {
			int i_9_ = -29 / ((i + 73) / 50);
			synchronized (anObject4175) {
				for (int i_10_ = 0; (anInt4182 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
					if ((((Class100_Sub1) aClass100_Sub1Array4183[i_10_]).anInt5079) >= 0)
						method1891(0, ((Class100_Sub1) (aClass100_Sub1Array4183[i_10_])).anInt5079);
				}
			}
			anInt4163++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.J(" + i + ')');
		}
	}

	static final void method1893(int i) {
		try {
			Class230.anInt3147 = 0;
			anInt4164++;
			Class108.aClass166_1525.method1102(-55);
			if (i >= -87)
				method1893(15);
			Class246_Sub28_Sub21.aBool6580 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.D(" + i + ')');
		}
	}

	final void method727(Class147 class147, int i) {
		try {
			anInt4172++;
			synchronized (anObject4175) {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) 21;
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class147;
				((Class106) this).anInt1492++;
				((Class106) this).anInt1496++;
				((Class106) this).anInt1493++;
				if ((((Class106) this).anInt1492 ^ 0xffffffff) <= -5001)
					((Class106) this).anInt1492 = 0;
				if (i < anInt4181)
					anObject4175.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.A(" + (class147 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method723(Class147 class147, byte i) {
		try {
			anInt4176++;
			synchronized (anObject4175) {
				((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) 20;
				((Class106) this).anObjectArray1491[(((Class106) this).anInt1492)] = class147;
				((Class106) this).anInt1492++;
				((Class106) this).anInt1496++;
				if (((Class106) this).anInt1492 >= 5000)
					((Class106) this).anInt1492 = 0;
				((Class106) this).anInt1493++;
				if (i != -39)
					anInt4182 = -19;
				if (anInt4181 > 0)
					anObject4175.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.H(" + (class147 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method721(int i) {
		try {
			try {
				if (i != 5000)
					return;
				synchronized (anObject4175) {
					while ((((Class106) this).anInt1493 ^ 0xffffffff) != -1)
						anObject4175.wait();
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt4165++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.F(" + i + ')');
		}
	}

	final void method722(int i, int i_11_) {
		try {
			anInt4168++;
			int i_12_ = 0;
			synchronized (anObject4175) {
				if (anInt4182 == i) {
					for (int i_13_ = 0; anInt4182 > i_13_; i_13_++)
						method1894(-21572, i_12_++);
				} else {
					if (i_11_ != 5000)
						method1893(35);
					for (int i_14_ = 0; i_14_ < anInt4182; i_14_++)
						aClass100_Sub1Array4183[i_14_].method2173((byte) -110);
					anInt4182 = i;
					aClass100_Sub1Array4183 = new Class100_Sub1[anInt4182];
					for (int i_15_ = 0; (anInt4182 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
						aClass100_Sub1Array4183[i_15_] = new Class100_Sub1(this);
						aClass100_Sub1Array4183[i_15_].method2176((byte) -64);
						method1894(i_11_ - 26572, i_12_++);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.G(" + i + ',' + i_11_ + ')');
		}
	}

	private final void method1894(int i, int i_16_) {
		try {
			anInt4170++;
			((Class106) this).aByteArray1490[((Class106) this).anInt1492] = (byte) i_16_;
			((Class106) this).anInt1492++;
			((Class106) this).anInt1493++;
			if ((((Class106) this).anInt1492 ^ 0xffffffff) <= -5001)
				((Class106) this).anInt1492 = 0;
			if (i != -21572)
				anObject4175 = null;
			((Class106) this).anInt1496++;
			if (anInt4181 > 0) {
				synchronized (anObject4175) {
					anObject4175.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fc.I(" + i + ',' + i_16_ + ')');
		}
	}

	final void method1895(Class100_Sub1 class100_sub1, int i) {
		do {
			try {
				anInt4169++;
				boolean bool = false;
				try {
					boolean bool_17_ = false;
					float f = 0.0F;
					int i_18_;
					synchronized (anObject4175) {
						while ((((Class106) this).anInt1496 ^ 0xffffffff) == -1) {
							anInt4181++;
							anObject4175.wait();
							anInt4181--;
						}
						i_18_ = (((Class106) this).aByteArray1490[((Class106) this).anInt1489]);
						if (((Class100_Sub1) class100_sub1).anInt5079 < 0) {
							if (i_18_ >= 0 && i_18_ <= 3)
								bool = true;
						} else if (i_18_ < 0 || (i_18_ ^ 0xffffffff) < -4)
							bool = true;
						if (bool) {
							((Class100) class100_sub1).anObject1307 = (((Class106) this).anObjectArray1491[((Class106) this).anInt1489]);
							f = (((Class106) this).aFloatArray1495[((Class106) this).anInt1489]);
							((Class106) this).anObjectArray1491[((Class106) this).anInt1489] = null;
							((Class106) this).anInt1489++;
							if (((Class106) this).anInt1489 >= 5000)
								((Class106) this).anInt1489 = 0;
							((Class106) this).anInt1496--;
						}
					}
					if (bool) {
						if ((((Class100_Sub1) class100_sub1).anInt5079 ^ 0xffffffff) <= -1) {
							if ((i_18_ ^ 0xffffffff) != -22) {
								if ((i_18_ ^ 0xffffffff) == -21) {
									Class147 class147 = ((Class147) (((Class100) class100_sub1).anObject1307));
									if ((((Class147) class147).aClass59_Sub4_2172) != null)
										((Class147) class147).aClass59_Sub4_2172.method403(Class259_Sub3.aClass260_5357, 68);
									if ((((Class147) class147).aClass59_Sub4_2152) != null)
										((Class147) class147).aClass59_Sub4_2152.method403(Class259_Sub3.aClass260_5357, 80);
									if ((((Class147) class147).aClass59_Sub2_2153) != null)
										((Class147) class147).aClass59_Sub2_2153.method403(Class259_Sub3.aClass260_5357, 98);
									if ((((Class147) class147).aClass59_Sub2_2159) != null)
										((Class147) class147).aClass59_Sub2_2159.method403(Class259_Sub3.aClass260_5357, 115);
									if ((((Class147) class147).aClass59_Sub1_2156) != null)
										((Class147) class147).aClass59_Sub1_2156.method403(Class259_Sub3.aClass260_5357, i - 25069);
									for (Class3 class3 = (((Class147) class147).aClass3_2160); class3 != null; class3 = ((Class3) class3).aClass3_28)
										((Class3) class3).aClass59_Sub3_24.method403(Class259_Sub3.aClass260_5357, 81);
								} else if ((i_18_ ^ 0xffffffff) > -31 || (i_18_ ^ 0xffffffff) < -34) {
									if (i_18_ < 40 || i_18_ > 43) {
										if ((i_18_ ^ 0xffffffff) == -23)
											Class259_Sub3.aClass260_5357.AA(-1, 1583160, 40, 127);
										else if ((i_18_ ^ 0xffffffff) == -24)
											Class259_Sub3.aClass260_5357.l();
										else if ((i_18_ ^ 0xffffffff) != -25) {
											if ((i_18_ ^ 0xffffffff) <= -11 && ((i_18_ ^ 0xffffffff) >= -14)) {
												Class259_Sub3.aClass260_5357.method1744(((Class100_Sub1) class100_sub1).anInt5079);
												((Class100_Sub1) class100_sub1).anInt5079 = -1;
											}
										} else
											Class259_Sub3.aClass260_5357.method1679(0, null);
									} else {
										Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
										((Class210) (((Class100) class100_sub1).anObject1307)).method1384(Class244.anInt3454, Class59_Sub2_Sub2.anInt6025, Class125.anInt1777, Class251.aBoolArrayArray3556, i_18_ - 40 == 0);
									}
								} else {
									Class259_Sub3.aClass260_5357.g(3000.0F, f * 1.5F);
									((Class210) ((Class100) class100_sub1).anObject1307).method1384(Class244.anInt3454, Class59_Sub2_Sub2.anInt6025, Class125.anInt1777, Class187_Sub1.aBoolArrayArray4866, -30 + i_18_ == 0);
								}
							} else
								Class162.method1073(class100_sub1, ((Class147) (((Class100) class100_sub1).anObject1307)));
						} else if ((i_18_ ^ 0xffffffff) <= -1 && i_18_ <= 3) {
							((Class100_Sub1) class100_sub1).anInt5079 = i_18_;
							Class259_Sub3.aClass260_5357.method1714(i_18_);
						}
					} else
						Thread.yield();
				} catch (Exception exception) {
					/* empty */
				} finally {
					if (bool) {
						synchronized (anObject4175) {
							((Class106) this).anInt1493--;
							if (((Class106) this).anInt1493 == 0)
								anObject4175.notifyAll();
						}
					}
				}
				if (i == 25152)
					break;
				method722(-110, -75);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fc.N(" + (class100_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public Class106_Sub1() {
		anInt4182 = 0;
	}

	static {
		new Class169("", 76);
	}
}
