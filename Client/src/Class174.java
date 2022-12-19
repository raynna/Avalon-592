
/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class174 {
	short[] aShortArray2447;
	private int anInt2448;
	static String aString2449;
	int anInt2450;
	static int anInt2451;
	Class246_Sub41 aClass246_Sub41_2452;
	static int anInt2453;
	static Class67 aClass67_2454;
	private int anInt2455;
	private int anInt2456;
	private int anInt2457;
	private int anInt2458;
	static int anInt2459;
	static int[] anIntArray2460 = new int[1];
	int anInt2461;
	static boolean aBool2462;
	static int anInt2463;
	static int anInt2464;
	static int anInt2465;
	boolean aBool2466;
	boolean aBool2467;
	static int anInt2468;

	final void method1143(int i, boolean bool, int i_0_) {
		try {
			anInt2463++;
			if (i_0_ <= 3)
				aClass67_2454 = null;
			int i_1_;
			while_218_: do {
				if (bool)
					i_1_ = 2048;
				else {
					int i_2_ = i * anInt2458 / 50 + anInt2456 & 0x7ff;
					int i_3_ = anInt2457;
					while_217_: do {
						while_216_: do {
							while_215_: do {
								do {
									if (i_3_ != 1) {
										if ((i_3_ ^ 0xffffffff) != -4) {
											if ((i_3_ ^ 0xffffffff) != -5) {
												if (i_3_ != 2) {
													if ((i_3_ ^ 0xffffffff) == -6)
														break while_216_;
													break while_217_;
												}
											} else
												break;
											break while_215_;
										}
									} else {
										i_1_ = (Class39_Sub1.f_fb[i_2_ << 3] >> 5) + 1024;
										break while_218_;
									}
									i_1_ = (Class59_Sub1_Sub2.anIntArray6123[i_2_]) >> 1;
									break while_218_;
								} while (false);
								i_1_ = i_2_ >> 10 << 11;
								break while_218_;
							} while (false);
							i_1_ = i_2_;
							break while_218_;
						} while (false);
						i_1_ = (i_2_ < 1024 ? i_2_ : -i_2_ + 2048) << 1;
						break while_218_;
					} while (false);
					i_1_ = 2048;
				}
			} while (false);
			((Class174) this).aClass246_Sub41_2452.method2315(0, (float) (anInt2455 + (anInt2448 * i_1_ >> 11)) / 2048.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.F(" + i + ',' + bool + ',' + i_0_ + ')'));
		}
	}

	private final void method1144(byte i) {
		try {
			anInt2459++;
			if (i < 18)
				((Class174) this).aShortArray2447 = null;
			int i_4_ = ((Class174) this).anInt2450;
			while_232_: do {
				while_231_: do {
					while_230_: do {
						while_229_: do {
							while_228_: do {
								while_227_: do {
									while_226_: do {
										while_225_: do {
											while_224_: do {
												while_223_: do {
													while_222_: do {
														while_221_: do {
															while_220_: do {
																while_219_: do {
																	do {
																		if (i_4_ != 2) {
																			if (i_4_ == 3)
																				break;
																			if (i_4_ == 4)
																				break while_219_;
																			if ((i_4_ ^ 0xffffffff) == -6)
																				break while_220_;
																			if ((i_4_ ^ 0xffffffff) == -13)
																				break while_221_;
																			if (i_4_ == 13)
																				break while_222_;
																			if (i_4_ == 10)
																				break while_223_;
																			if (i_4_ == 11)
																				break while_224_;
																			if (i_4_ == 6)
																				break while_225_;
																			if (i_4_ == 7)
																				break while_226_;
																			if ((i_4_ ^ 0xffffffff) == -9)
																				break while_227_;
																			if (i_4_ == 9)
																				break while_228_;
																			if ((i_4_ ^ 0xffffffff) == -15)
																				break while_229_;
																			if (i_4_ == 15)
																				break while_230_;
																			if (i_4_ != 16)
																				break while_232_;
																			if (!client.f_ob)
																				break while_231_;
																		}
																		anInt2455 = 0;
																		anInt2457 = 1;
																		anInt2448 = 2048;
																		anInt2458 = 2048;
																		return;
																	} while (false);
																	anInt2455 = 0;
																	anInt2448 = 2048;
																	anInt2458 = 4096;
																	anInt2457 = 1;
																	return;
																} while (false);
																anInt2457 = 4;
																anInt2458 = 2048;
																anInt2455 = 0;
																anInt2448 = 2048;
																return;
															} while (false);
															anInt2458 = 8192;
															anInt2448 = 2048;
															anInt2457 = 4;
															anInt2455 = 0;
															return;
														} while (false);
														anInt2455 = 0;
														anInt2458 = 2048;
														anInt2448 = 2048;
														anInt2457 = 2;
														return;
													} while (false);
													anInt2448 = 2048;
													anInt2455 = 0;
													anInt2457 = 2;
													anInt2458 = 8192;
													return;
												} while (false);
												anInt2455 = 1536;
												anInt2448 = 512;
												anInt2458 = 2048;
												anInt2457 = 3;
												return;
											} while (false);
											anInt2455 = 1536;
											anInt2458 = 4096;
											anInt2448 = 512;
											anInt2457 = 3;
											return;
										} while (false);
										anInt2448 = 768;
										anInt2455 = 1280;
										anInt2458 = 2048;
										anInt2457 = 3;
										return;
									} while (false);
									anInt2448 = 768;
									anInt2455 = 1280;
									anInt2458 = 4096;
									anInt2457 = 3;
									return;
								} while (false);
								anInt2458 = 2048;
								anInt2448 = 1024;
								anInt2457 = 3;
								anInt2455 = 1024;
								return;
							} while (false);
							anInt2448 = 1024;
							anInt2458 = 4096;
							anInt2457 = 3;
							anInt2455 = 1024;
							return;
						} while (false);
						anInt2457 = 1;
						anInt2448 = 768;
						anInt2458 = 2048;
						anInt2455 = 1280;
						return;
					} while (false);
					anInt2457 = 1;
					anInt2455 = 1536;
					anInt2458 = 4096;
					anInt2448 = 512;
					return;
				} while (false);
				anInt2448 = 256;
				anInt2457 = 1;
				anInt2455 = 1792;
				anInt2458 = 8192;
				return;
			} while (false);
			anInt2458 = 2048;
			anInt2448 = 2048;
			anInt2455 = 0;
			anInt2457 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qc.A(" + i + ')');
		}
	}

	final void method1145(int i, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			anInt2455 = i_7_;
			anInt2457 = i;
			anInt2468++;
			anInt2458 = i_5_;
			anInt2448 = i_6_;
			int i_9_ = 95 % ((i_8_ - 6) / 61);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.D(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method1146(Object[] objects, long[] ls, byte i) {
		try {
			anInt2453++;
			if (i <= 38)
				aClass67_2454 = null;
			Class246_Sub28_Sub15.method2649(0, ls, objects, -1 + ls.length, 28260);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.B(" + (objects != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method1147(int i, Stream_Sub1 stream_sub1, int i_10_) {
		try {
			if (i_10_ > -77)
				anIntArray2460 = null;
			anInt2451++;
			for (;;) {
				Class246_Sub32 class246_sub32 = (Class246_Sub32) Class239.aClass166_3372.method1104(108);
				if (class246_sub32 == null)
					break;
				boolean bool = false;
				for (int i_11_ = 0; ((Class246_Sub32) class246_sub32).anInt5043 > i_11_; i_11_++) {
					if ((((Class246_Sub32) class246_sub32).aClass182Array5041[i_11_]) != null) {
						if ((((Class246_Sub32) class246_sub32).aClass182Array5041[i_11_].anInt2539) == 2)
							((Class246_Sub32) class246_sub32).anIntArray5050[i_11_] = -5;
						if (((((Class246_Sub32) class246_sub32).aClass182Array5041[i_11_].anInt2539) ^ 0xffffffff) == -1)
							bool = true;
					}
					if ((((Class246_Sub32) class246_sub32).aClass182Array5047[i_11_]) != null) {
						if ((((Class246_Sub32) class246_sub32).aClass182Array5047[i_11_].anInt2539) == 2)
							((Class246_Sub32) class246_sub32).anIntArray5050[i_11_] = -6;
						if (((((Class246_Sub32) class246_sub32).aClass182Array5047[i_11_].anInt2539) ^ 0xffffffff) == -1)
							bool = true;
					}
				}
				if (bool)
					break;
				stream_sub1.method2474(i, 13127);
				stream_sub1.writeByte(255, 0);
				int i_12_ = ((BufferStream) stream_sub1).position;
				stream_sub1.writeInt((((Class246_Sub32) class246_sub32).anInt5046), (byte) 93);
				for (int i_13_ = 0; ((Class246_Sub32) class246_sub32).anInt5043 > i_13_; i_13_++) {
					if (((Class246_Sub32) class246_sub32).anIntArray5050[i_13_] != 0)
						stream_sub1.writeByte(255, (((Class246_Sub32) class246_sub32).anIntArray5050[i_13_]));
					else {
						try {
							int i_14_ = (((Class246_Sub32) class246_sub32).anIntArray5044[i_13_]);
							if ((i_14_ ^ 0xffffffff) == -1) {
								Field field = ((Field) (((Class246_Sub32) class246_sub32).aClass182Array5041[i_13_].anObject2535));
								int i_15_ = field.getInt(null);
								stream_sub1.writeByte(255, 0);
								stream_sub1.writeInt(i_15_, (byte) 119);
							} else if (i_14_ == 1) {
								Field field = ((Field) (((Class246_Sub32) class246_sub32).aClass182Array5041[i_13_].anObject2535));
								field.setInt(null, (((Class246_Sub32) class246_sub32).anIntArray5045[i_13_]));
								stream_sub1.writeByte(255, 0);
							} else if (i_14_ == 2) {
								Field field = ((Field) (((Class246_Sub32) class246_sub32).aClass182Array5041[i_13_].anObject2535));
								int i_16_ = field.getModifiers();
								stream_sub1.writeByte(255, 0);
								stream_sub1.writeInt(i_16_, (byte) -3);
							}
							if (i_14_ == 3) {
								Method method = ((Method) (((Class246_Sub32) class246_sub32).aClass182Array5047[i_13_].anObject2535));
								byte[][] is = (((Class246_Sub32) class246_sub32).aByteArrayArrayArray5040[i_13_]);
								Object[] objects = new Object[is.length];
								for (int i_17_ = 0; is.length > i_17_; i_17_++) {
									ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_17_])));
									objects[i_17_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object != null) {
									if (object instanceof Number) {
										stream_sub1.writeByte(255, 1);
										stream_sub1.writeLong(((Number) object).longValue(), (byte) -48);
									} else if (object instanceof String) {
										stream_sub1.writeByte(255, 2);
										stream_sub1.writeString(95, (String) object);
									} else
										stream_sub1.writeByte(255, 4);
								} else
									stream_sub1.writeByte(255, 0);
							} else if ((i_14_ ^ 0xffffffff) == -5) {
								Method method = ((Method) (((Class246_Sub32) class246_sub32).aClass182Array5047[i_13_].anObject2535));
								int i_18_ = method.getModifiers();
								stream_sub1.writeByte(255, 0);
								stream_sub1.writeInt(i_18_, (byte) 122);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							stream_sub1.writeByte(255, -10);
						} catch (java.io.InvalidClassException invalidclassexception) {
							stream_sub1.writeByte(255, -11);
						} catch (java.io.StreamCorruptedException streamcorruptedexception) {
							stream_sub1.writeByte(255, -12);
						} catch (java.io.OptionalDataException optionaldataexception) {
							stream_sub1.writeByte(255, -13);
						} catch (IllegalAccessException illegalaccessexception) {
							stream_sub1.writeByte(255, -14);
						} catch (IllegalArgumentException illegalargumentexception) {
							stream_sub1.writeByte(255, -15);
						} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
							stream_sub1.writeByte(255, -16);
						} catch (SecurityException securityexception) {
							stream_sub1.writeByte(255, -17);
						} catch (java.io.IOException ioexception) {
							stream_sub1.writeByte(255, -18);
						} catch (NullPointerException nullpointerexception) {
							stream_sub1.writeByte(255, -19);
						} catch (Exception exception) {
							stream_sub1.writeByte(255, -20);
						} catch (Throwable throwable) {
							stream_sub1.writeByte(255, -21);
						}
					}
				}
				stream_sub1.method2388(i_12_, -19774);
				stream_sub1.method2408(-1591647264, -i_12_ + ((BufferStream) stream_sub1).position);
				class246_sub32.unlink((byte) -36);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.E(" + i + ',' + (stream_sub1 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	public static void method1148(byte i) {
		try {
			aClass67_2454 = null;
			if (i != -29)
				method1146(null, null, (byte) 48);
			anIntArray2460 = null;
			aString2449 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qc.G(" + i + ')');
		}
	}

	private final void method1149(Class260 class260, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		try {
			if (i == -591532287) {
				anInt2464++;
				((Class174) this).aClass246_Sub41_2452 = class260.method1751(i_19_, i_21_, i_20_, i_23_, i_22_, 1.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	protected Class174() {
		try {
			if (Class59_Sub1_Sub2.anIntArray6123 == null)
				Class246_Sub1_Sub15.method2715(true);
			method1144((byte) 79);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qc.<init>(" + ')');
		}
	}

	Class174(Class260 class260, BufferStream stream, int i) {
		try {
			if (Class59_Sub1_Sub2.anIntArray6123 == null)
				Class246_Sub1_Sub15.method2715(true);
			((Class174) this).anInt2461 = stream.readUnsignedByte(255);
			((Class174) this).aBool2466 = (((Class174) this).anInt2461 & 0x8 ^ 0xffffffff) != -1;
			((Class174) this).aBool2467 = (0x10 & ((Class174) this).anInt2461 ^ 0xffffffff) != -1;
			((Class174) this).anInt2461 = 0x7 & ((Class174) this).anInt2461;
			int i_24_ = stream.readUnsignedShort((byte) -53) << i;
			int i_25_ = stream.readUnsignedShort((byte) 114) << i;
			int i_26_ = stream.readUnsignedShort((byte) 117) << i;
			int i_27_ = stream.readUnsignedByte(255);
			int i_28_ = 2 * i_27_ + 1;
			((Class174) this).aShortArray2447 = new short[i_28_];
			for (int i_29_ = 0; ((i_29_ ^ 0xffffffff) > (((Class174) this).aShortArray2447.length ^ 0xffffffff)); i_29_++) {
				int i_30_ = (short) stream.readUnsignedShort((byte) -72);
				int i_31_ = i_30_ >>> 8;
				int i_32_ = 0xff & i_30_;
				if ((i_28_ ^ 0xffffffff) >= (i_31_ ^ 0xffffffff))
					i_31_ = i_28_ - 1;
				if (i_32_ > -i_31_ + i_28_)
					i_32_ = i_28_ + -i_31_;
				((Class174) this).aShortArray2447[i_29_] = (short) Class236.method1523(i_32_, i_31_ << 8);
			}
			i_27_ = (i_27_ << Class126.anInt1781) - -Class40_Sub7.anInt5174;
			int i_33_ = (Class40_Sub3.anIntArray4064 != null ? Class40_Sub3.anIntArray4064[stream.readUnsignedShort((byte) -82)] : (Actor.f_eb[(0xffff & Class_e.method594(-32, stream.readUnsignedShort((byte) 119)))]));
			int i_34_ = stream.readUnsignedByte(255);
			((Class174) this).anInt2450 = i_34_ & 0x1f;
			anInt2456 = 0x700 & i_34_ << 3;
			if (((Class174) this).anInt2450 != 31)
				method1144((byte) 22);
			method1149(class260, -591532287, i_24_, i_25_, i_26_, i_33_, i_27_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qc.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (stream != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass67_2454 = new Class67("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connect\u00e9 au serveur de mise \u00e0 jour", "Conectado ao servidor de atualiza\u00e7\u00e3o");
		aBool2462 = false;
	}
}
