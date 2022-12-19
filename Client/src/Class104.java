/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104 {
	private int anInt1376;
	private int anInt1377;
	int[] anIntArray1378;
	int anInt1379;
	int anInt1380;
	int anInt1381;
	short aShort1382;
	boolean aBool1383;
	private int anInt1384;
	boolean aBool1385;
	int[] anIntArray1386;
	int anInt1387 = -1;
	int anInt1388;
	int anInt1389;
	int anInt1390;
	private int anInt1391;
	int anInt1392;
	int anInt1393;
	static int anInt1394;
	boolean aBool1395;
	int anInt1396;
	static Class246_Sub35 aClass246_Sub35_1397;
	int anInt1398;
	int[] anIntArray1399;
	private int anInt1400;
	int anInt1401;
	int anInt1402 = 0;
	int anInt1403;
	boolean aBool1404;
	int anInt1405;
	int anInt1406;
	private int anInt1407;
	int anInt1408;
	static int anInt1409;
	int anInt1410 = -1;
	int anInt1411;
	int anInt1412;
	int anInt1413;
	int anInt1414;
	short aShort1415;
	int anInt1416;
	static int anInt1417;
	boolean aBool1418;
	static int[] anIntArray1419 = new int[25];
	boolean aBool1420;
	int anInt1421;
	int anInt1422;
	int[] anIntArray1423;
	int anInt1424;
	static volatile boolean aBool1425 = true;
	int anInt1426;
	int f_ab;
	short f_bb;
	int f_cb;
	int f_db;
	int f_eb;
	private int f_fb;
	int f_gb;
	static int f_hb;
	static int f_ib;
	private int f_jb;
	boolean f_kb;
	int f_lb;
	short f_mb;
	int f_nb;
	int f_ob;
	int f_pb;
	int f_qb;
	int f_rb;
	int f_sb;
	static int f_tb;
	private int f_ub;
	static Class235 f_vb = null;
	private int f_wb;
	/* synthetic */ static Class aClass1427;

	private final void method664(int i, BufferStream stream, int i_0_) {
		try {
			f_ib++;
			if (i_0_ == -21) {
				if ((i ^ 0xffffffff) == -2) {
					((Class104) this).aShort1415 = (short) stream.readUnsignedShort((byte) -125);
					((Class104) this).aShort1382 = (short) stream.readUnsignedShort((byte) 91);
					((Class104) this).f_bb = (short) stream.readUnsignedShort((byte) 95);
					((Class104) this).f_mb = (short) stream.readUnsignedShort((byte) -50);
					int i_1_ = 3;
					((Class104) this).aShort1415 <<= i_1_;
					((Class104) this).f_mb <<= i_1_;
					((Class104) this).f_bb <<= i_1_;
					((Class104) this).aShort1382 <<= i_1_;
				} else if (i != 2) {
					if (i == 3) {
						((Class104) this).anInt1422 = stream.readInt((byte) 101);
						((Class104) this).anInt1414 = stream.readInt((byte) 117);
					} else if ((i ^ 0xffffffff) != -5) {
						if (i == 5)
							((Class104) this).anInt1401 = ((Class104) this).f_nb = stream.readUnsignedShort((byte) -94) << 12 << 0;
						else if (i == 6) {
							anInt1384 = stream.readInt((byte) 88);
							anInt1376 = stream.readInt((byte) 104);
						} else if (i == 7) {
							((Class104) this).anInt1381 = stream.readUnsignedShort((byte) -55);
							((Class104) this).anInt1390 = stream.readUnsignedShort((byte) -82);
						} else if (i == 8) {
							((Class104) this).f_pb = stream.readUnsignedShort((byte) -102);
							((Class104) this).anInt1379 = stream.readUnsignedShort((byte) -57);
						} else if (i != 9) {
							if (i != 10) {
								if (i == 12)
									((Class104) this).anInt1403 = stream.readByte(false);
								else if ((i ^ 0xffffffff) != -14) {
									if ((i ^ 0xffffffff) != -15) {
										if (i == 15)
											((Class104) this).anInt1387 = stream.readUnsignedShort((byte) -65);
										else if (i == 16) {
											((Class104) this).aBool1395 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
											((Class104) this).f_lb = stream.readUnsignedShort((byte) 122);
											((Class104) this).f_eb = stream.readUnsignedShort((byte) -36);
											((Class104) this).aBool1383 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
										} else if (i != 17) {
											if (i != 18) {
												if (i == 19)
													((Class104) this).anInt1412 = (stream.readUnsignedByte(i_0_ + 276));
												else if ((i ^ 0xffffffff) != -21) {
													if (i == 21)
														anInt1391 = (stream.readUnsignedByte(255));
													else if (i == 22)
														((Class104) this).anInt1410 = (stream.readInt((byte) 96));
													else if (i == 23)
														anInt1377 = (stream.readUnsignedByte(i_0_ ^ ~0xeb));
													else if ((i ^ 0xffffffff) == -25)
														((Class104) this).f_kb = false;
													else if ((i ^ 0xffffffff) == -26) {
														int i_2_ = (stream.readUnsignedByte(255));
														((Class104) this).anIntArray1378 = new int[i_2_];
														for (int i_3_ = 0; ((i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++)
															((Class104) this).anIntArray1378[i_3_] = (stream.readUnsignedShort((byte) -70));
													} else if (i == 26)
														((Class104) this).aBool1418 = false;
													else if ((i ^ 0xffffffff) != -28) {
														if (i != 28) {
															if (i != 29) {
																if ((i ^ 0xffffffff) != -31) {
																	if (i != 31) {
																		if ((i ^ 0xffffffff) == -33)
																			((Class104) this).aBool1385 = false;
																	} else {
																		((Class104) this).anInt1401 = stream.readUnsignedShort((byte) 124) << 12 << 0;
																		((Class104) this).f_nb = stream.readUnsignedShort((byte) 87) << 12 << 0;
																	}
																} else
																	((Class104) this).aBool1420 = true;
															} else
																stream.method2375((byte) 1);
														} else
															f_jb = (stream.readUnsignedByte(255));
													} else
														((Class104) this).anInt1426 = ((stream.readUnsignedShort((byte) 89)) << 12 << 0);
												} else
													f_wb = stream.readUnsignedByte(255);
											} else
												((Class104) this).anInt1392 = (stream.readInt((byte) 75));
										} else
											((Class104) this).f_ab = stream.readUnsignedShort((byte) -44);
									} else
										((Class104) this).anInt1402 = stream.readUnsignedShort((byte) 123);
								} else
									((Class104) this).f_cb = stream.readByte(false);
							} else {
								int i_4_ = stream.readUnsignedByte(255);
								((Class104) this).anIntArray1399 = new int[i_4_];
								for (int i_5_ = 0; i_4_ > i_5_; i_5_++)
									((Class104) this).anIntArray1399[i_5_] = stream.readUnsignedShort((byte) 89);
							}
						} else {
							int i_6_ = stream.readUnsignedByte(255);
							((Class104) this).anIntArray1386 = new int[i_6_];
							for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_7_++)
								((Class104) this).anIntArray1386[i_7_] = stream.readUnsignedShort((byte) 90);
						}
					} else {
						((Class104) this).anInt1406 = stream.readUnsignedByte(255);
						((Class104) this).f_db = stream.readByte(false);
					}
				} else
					stream.readUnsignedByte(255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jv.D(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static final int method665(String string, int i) {
		try {
			anInt1417++;
			if (i != 10)
				aClass246_Sub35_1397 = null;
			return Class248.method1583(false, 10, true, string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jv.F(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method666(BufferStream stream, int i) {
		try {
			if (i == 28201) {
				for (;;) {
					int i_8_ = stream.readUnsignedByte(255);
					if ((i_8_ ^ 0xffffffff) == -1)
						break;
					method664(i_8_, stream, i - 28222);
				}
				f_hb++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jv.E(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method667(int i) {
		do {
			try {
				if (((Class104) this).anInt1403 > -2 || (((Class104) this).f_cb ^ 0xffffffff) < 1)
					((Class104) this).aBool1404 = true;
				((Class104) this).anInt1393 = (0xff3764 & anInt1384) >> 16;
				anInt1400 = 0xff & anInt1376 >> 16;
				anInt1409++;
				anInt1407 = (anInt1376 & 0xff9e) >> 8;
				((Class104) this).anInt1413 = anInt1400 + -((Class104) this).anInt1393;
				((Class104) this).anInt1398 = 0xff & anInt1384 >> 8;
				f_ub = 0xff & anInt1376;
				((Class104) this).f_sb = 0xff & anInt1384;
				((Class104) this).anInt1380 = anInt1407 - ((Class104) this).anInt1398;
				if (i <= -108) {
					((Class104) this).anInt1396 = f_ub + -((Class104) this).f_sb;
					((Class104) this).anInt1416 = anInt1384 >> 24 & 0xff;
					f_fb = 0xff & anInt1376 >> 24;
					((Class104) this).f_rb = f_fb - ((Class104) this).anInt1416;
					if (((Class104) this).anInt1410 != -1) {
						((Class104) this).f_ob = anInt1377 * ((Class104) this).anInt1390 / 100;
						if (((Class104) this).f_ob == 0)
							((Class104) this).f_ob = 1;
						((Class104) this).anInt1408 = ((((Class104) this).anInt1410 - ((((Class104) this).anInt1414 + -((Class104) this).anInt1422) / 2 + ((Class104) this).anInt1422)) / ((Class104) this).f_ob);
					}
					if ((((Class104) this).anInt1426 ^ 0xffffffff) != 0) {
						((Class104) this).anInt1424 = f_jb * ((Class104) this).anInt1390 / 100;
						if ((((Class104) this).anInt1424 ^ 0xffffffff) == -1)
							((Class104) this).anInt1424 = 1;
						((Class104) this).anInt1405 = ((((Class104) this).anInt1426 + (-((Class104) this).anInt1401 - (((Class104) this).f_nb - ((Class104) this).anInt1401) / 2)) / ((Class104) this).anInt1424);
					}
					if ((((Class104) this).anInt1392 ^ 0xffffffff) == -1)
						break;
					((Class104) this).anInt1389 = ((Class104) this).anInt1390 * anInt1391 / 100;
					((Class104) this).anInt1411 = f_wb * ((Class104) this).anInt1390 / 100;
					if (((Class104) this).anInt1411 == 0)
						((Class104) this).anInt1411 = 1;
					((Class104) this).anInt1421 = ((((((Class104) this).anInt1392 & 0xffee6a) >> 16) + -(((Class104) this).anInt1413 / 2) + -((Class104) this).anInt1393) << 8) / ((Class104) this).anInt1411;
					((Class104) this).f_gb = (((0xff & ((Class104) this).anInt1392 >> 8) + -((Class104) this).anInt1398 + -(((Class104) this).anInt1380 / 2)) << 8) / ((Class104) this).anInt1411;
					((Class104) this).anInt1388 = (((0xff & ((Class104) this).anInt1392) + (-((Class104) this).f_sb - ((Class104) this).anInt1396 / 2)) << 8) / ((Class104) this).anInt1411;
					if ((((Class104) this).anInt1389 ^ 0xffffffff) == -1)
						((Class104) this).anInt1389 = 1;
					Class104 class104_9_ = this;
					((Class104) class104_9_).anInt1421 = (((Class104) class104_9_).anInt1421 + (((Class104) this).anInt1421 > 0 ? -4 : 4));
					Class104 class104_10_ = this;
					((Class104) class104_10_).f_gb = (((Class104) class104_10_).f_gb + ((((Class104) this).f_gb ^ 0xffffffff) < -1 ? -4 : 4));
					((Class104) this).f_qb = (((((Class104) this).anInt1392 >> 24 & 0xff) + -((Class104) this).anInt1416 + -(((Class104) this).f_rb / 2)) << 8) / ((Class104) this).anInt1389;
					Class104 class104_11_ = this;
					((Class104) class104_11_).anInt1388 = (((Class104) class104_11_).anInt1388 - ((((Class104) this).anInt1388 ^ 0xffffffff) >= -1 ? 4 : 4));
					Class104 class104_12_ = this;
					((Class104) class104_12_).f_qb = (((Class104) class104_12_).f_qb + (((Class104) this).f_qb > 0 ? -4 : 4));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jv.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method668(int i) {
		try {
			aClass246_Sub35_1397 = null;
			if (i == 22404) {
				anIntArray1419 = null;
				f_vb = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jv.B(" + i + ')');
		}
	}

	static final void method669(int i) {
		try {
			f_tb++;
			Class82.aClass105_1072.method705(5, false);
			Class246_Sub28_Sub21.aClass175_6587.method1150((byte) 115, 5);
			Class238.aClass92_3358.method590(true, 5);
			Class143.aClass251_2067.method1606(5, i + 8);
			Class179.aClass228_2518.method1465((byte) -127, 5);
			Class255.aClass191_3663.method1254(-127, 5);
			Class59_Sub3_Sub3.aClass45_6275.method301(5, 36);
			Class195.aClass177_2745.method1161(5, 64);
			Class246_Sub30_Sub1.aClass17_5761.method165((byte) 9, 5);
			SubIncomingPacket.aClass209_7085.method1375(5, -3);
			Class118.aClass_v1641.method691((byte) -51, 5);
			Class246_Sub28_Sub30.aClass165_6873.method1092(5, (byte) 60);
			Class246_Sub10.aClass254_4084.method1644(5, -38);
			Class246_Sub1_Sub10.f_eb.method1084(5, 1);
			Class241.aClass193_3398.method1271(5, i ^ ~0x7e);
			Class246_Sub31.aClass203_5038.method1334(0, 5);
			Class246_Sub1_Sub14.aClass214_6597.method1399((byte) 37, 5);
			Class228.aClass189_3132.method1242((byte) -126, 5);
			Class_fs.aClass156_150.method1036(5, -24605);
			Class246_Sub28_Sub25.aClass57_6702.method393(true, 5);
			Class163.method1083(5, false);
			Class118.method811(50, (byte) 55);
			Class_a.method573(true, 5);
			if (i != -2)
				method669(-126);
			Class243.method1567(48, 5);
			Class140.aClass54_2034.method380(5, -50);
			Class246_Sub41_Sub2.aClass54_6474.method380(5, -50);
			Class211_Sub1.aClass54_5351.method380(5, -50);
			Class56.aClass54_793.method380(5, -50);
			Class146.aClass54_2139.method380(5, -50);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jv.C(" + i + ')');
		}
	}

	static final void method670() {
		for (int i = 0; i < Class_c.anInt1195; i++) {
			if (!Class102_Sub1.aBoolArray4449[i]) {
				Class174 class174 = Class57.aClass174Array811[i];
				Class246_Sub41 class246_sub41 = ((Class174) class174).aClass246_Sub41_2452;
				int i_13_ = ((Class174) class174).anInt2461;
				int i_14_ = class246_sub41.method2322(102) - Class40_Sub7.anInt5174;
				int i_15_ = 1 + (2 * i_14_ >> Class126.anInt1781);
				int i_16_ = 0;
				int[] is = new int[i_15_ * i_15_];
				int i_17_ = (class246_sub41.method2317(false) - i_14_ >> Class126.anInt1781);
				int i_18_ = (class246_sub41.method2321((byte) -51) - i_14_ >> Class126.anInt1781);
				int i_19_ = (class246_sub41.method2321((byte) -80) + i_14_ >> Class126.anInt1781);
				if (i_18_ < 0) {
					i_16_ -= i_18_;
					i_18_ = 0;
				}
				if (i_19_ >= Class_t_Sub1.f_sc)
					i_19_ = Class_t_Sub1.f_sc - 1;
				for (int i_20_ = i_18_; i_20_ <= i_19_; i_20_++) {
					int i_21_ = ((Class174) class174).aShortArray2447[i_16_];
					int i_22_ = i_21_ >>> 8;
					int i_23_ = i_16_ * i_15_ + i_22_;
					int i_24_ = i_17_ + (i_21_ >>> 8);
					int i_25_ = i_24_ + (i_21_ & 0xff) - 1;
					if (i_24_ < 0) {
						i_23_ -= i_24_;
						i_24_ = 0;
					}
					if (i_25_ >= Class240.anInt3377)
						i_25_ = Class240.anInt3377 - 1;
					for (int i_26_ = i_24_; i_26_ <= i_25_; i_26_++) {
						int i_27_ = 1;
						Class59_Sub3 class59_sub3 = Class17.method168(i_13_, i_26_, i_20_, (aClass1427 != null ? aClass1427 : (aClass1427 = getClassByName("Class59_Sub3"))));
						if (class59_sub3 != null && ((Class59_Sub3) class59_sub3).aByte5055 != 0) {
							if (((Class59_Sub3) class59_sub3).aByte5055 == 1) {
								boolean bool = i_26_ - 1 >= i_24_;
								boolean bool_28_ = i_26_ + 1 <= i_25_;
								if (!bool && i_20_ + 1 <= i_19_) {
									int i_29_ = (((Class174) class174).aShortArray2447[i_16_ + 1]);
									int i_30_ = i_17_ + (i_29_ >>> 8);
									int i_31_ = i_30_ + (i_29_ & 0xff);
									bool = i_26_ > i_30_ && i_26_ < i_31_;
								}
								if (!bool_28_ && i_20_ - 1 >= i_18_) {
									int i_32_ = (((Class174) class174).aShortArray2447[i_16_ - 1]);
									int i_33_ = i_17_ + (i_32_ >>> 8);
									int i_34_ = i_33_ + (i_32_ & 0xff);
									bool_28_ = i_26_ > i_33_ && i_26_ < i_34_;
								}
								if (bool && !bool_28_)
									i_27_ = 4;
								else if (bool_28_ && !bool)
									i_27_ = 2;
							} else {
								boolean bool = i_26_ - 1 >= i_24_;
								boolean bool_35_ = i_26_ + 1 <= i_25_;
								if (!bool && i_20_ - 1 >= i_18_) {
									int i_36_ = (((Class174) class174).aShortArray2447[i_16_ - 1]);
									int i_37_ = i_17_ + (i_36_ >>> 8);
									int i_38_ = i_37_ + (i_36_ & 0xff);
									bool = i_26_ > i_37_ && i_26_ < i_38_;
								}
								if (!bool_35_ && i_20_ + 1 <= i_19_) {
									int i_39_ = (((Class174) class174).aShortArray2447[i_16_ + 1]);
									int i_40_ = i_17_ + (i_39_ >>> 8);
									int i_41_ = i_40_ + (i_39_ & 0xff);
									bool_35_ = i_26_ > i_40_ && i_26_ < i_41_;
								}
								if (bool && !bool_35_)
									i_27_ = 3;
								else if (bool_35_ && !bool)
									i_27_ = 5;
							}
						}
						is[i_23_++] = i_27_;
					}
					i_16_++;
				}
				Class102_Sub1.aBoolArray4449[i] = true;
				Class59_Sub3_Sub4.aClass210Array6993[i_13_].method1379(class246_sub41, is);
			}
		}
	}

	public Class104() {
		((Class104) this).anInt1403 = -2;
		((Class104) this).anInt1412 = 0;
		((Class104) this).aBool1404 = false;
		((Class104) this).f_ab = -1;
		((Class104) this).aBool1383 = true;
		((Class104) this).anInt1406 = 0;
		((Class104) this).aBool1418 = true;
		((Class104) this).f_kb = true;
		f_jb = 100;
		anInt1377 = 100;
		((Class104) this).aBool1420 = false;
		((Class104) this).f_lb = -1;
		((Class104) this).f_eb = -1;
		((Class104) this).aBool1385 = true;
		anInt1391 = 100;
		((Class104) this).aBool1395 = true;
		((Class104) this).anInt1426 = -1;
		((Class104) this).f_cb = -2;
		f_wb = 100;
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
