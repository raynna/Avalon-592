/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class248 {
	static int anInt3483;
	static OutgoingPacket INTERFACE_ON_INTERFACE_PACKET = new OutgoingPacket(55, 16);
	static int anInt3485;
	static int anInt3486;
	static boolean aBool3487;
	static Class_o aClass_o3488 = null;
	static char[] aCharArray3489;

	abstract Class246_Sub1_Sub8 method1582(int i, Class246_Sub1_Sub8 class246_sub1_sub8);

	static final int method1583(boolean bool, int i, boolean bool_0_, String string) {
		try {
			anInt3486++;
			if ((i ^ 0xffffffff) > -3 || i > 36)
				throw new IllegalArgumentException("Invalid radix:" + i);
			boolean bool_1_ = bool;
			boolean bool_2_ = false;
			int i_3_ = 0;
			int i_4_ = string.length();
			for (int i_5_ = 0; (i_4_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				int i_6_ = string.charAt(i_5_);
				if ((i_5_ ^ 0xffffffff) == -1) {
					if (i_6_ == 45) {
						bool_1_ = true;
						continue;
					}
					if (i_6_ == 43 && bool_0_)
						continue;
				}
				if (i_6_ >= 48 && i_6_ <= 57)
					i_6_ -= 48;
				else if ((i_6_ ^ 0xffffffff) > -66 || i_6_ > 90) {
					if ((i_6_ ^ 0xffffffff) <= -98 && i_6_ <= 122)
						i_6_ -= 87;
					else
						throw new NumberFormatException();
				} else
					i_6_ -= 55;
				if (i_6_ >= i)
					throw new NumberFormatException();
				if (bool_1_)
					i_6_ = -i_6_;
				int i_7_ = i_6_ + i_3_ * i;
				if ((i_7_ / i ^ 0xffffffff) != (i_3_ ^ 0xffffffff))
					throw new NumberFormatException();
				i_3_ = i_7_;
				bool_2_ = true;
			}
			if (!bool_2_)
				throw new NumberFormatException();
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wa.D(" + bool + ',' + i + ',' + bool_0_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1584(int i) {
		do {
			try {
				if ((Class100.anInt1303 ^ 0xffffffff) < -2) {
					Class168.anInt2399 = Class246_Sub34.anInt5146;
					Class100.anInt1303--;
				}
				anInt3483++;
				if ((Class246_Sub1_Sub7.anInt6030 ^ 0xffffffff) < -1)
					Class246_Sub1_Sub7.anInt6030--;
				if (Class59_Sub3_Sub1.aBool5746) {
					Class59_Sub3_Sub1.aBool5746 = false;
					Class246_Sub1_Sub11.method2615((byte) 124);
				} else {
					if (!Class246_Sub28_Sub21.aBool6580)
						Class109_Sub1_Sub1.method2756(-89);
					for (int i_8_ = 0; i_8_ < 100; i_8_++) {
						if (!Class109.method760(false))
							break;
					}
					if (Class225.anInt3103 == 30) {
						Class174.method1147(Class135.aClass201_1888.method1327(2), Class130_Sub1.stream, -125);
						if (Class_j.aClass246_Sub39_1488 == null) {
							if (Class40_Sub9.aLong5507 <= Class151.time(-99))
								Class_j.aClass246_Sub39_1488 = (Class246_Sub28_Sub33.aClass243_6959.method1568(i ^ 0x300f, Class174.aString2449));
						} else if (((Class246_Sub39) Class_j.aClass246_Sub39_1488).anInt5485 != -1) {
							Class243.writePacket(-78, Class12.aClass201_176);
							Class130_Sub1.stream.writeShort((byte) 67, ((Class246_Sub39) Class_j.aClass246_Sub39_1488).anInt5485);
							Class_j.aClass246_Sub39_1488 = null;
							Class40_Sub9.aLong5507 = Class151.time(-62) - -30000L;
						}
						Class246_Sub30 class246_sub30 = (Class246_Sub30) Class235.f_qb.method1104(60);
						if (class246_sub30 != null || ((Class151.time(i ^ ~0x301f) - 2000L ^ 0xffffffffffffffffL) < (Class246_Sub29.aLong4970 ^ 0xffffffffffffffffL))) {
							boolean bool = false;
							int i_9_ = (((BufferStream) Class130_Sub1.stream).position);
							for (Class246_Sub30 class246_sub30_10_ = (Class246_Sub30) Class246_Sub28_Sub30.aClass166_6865.method1104(74); class246_sub30_10_ != null; class246_sub30_10_ = ((Class246_Sub30) Class246_Sub28_Sub30.aClass166_6865.method1108((byte) -112))) {
								if (-i_9_ + (((BufferStream) Class130_Sub1.stream).position) >= 240)
									break;
								class246_sub30_10_.unlink((byte) -80);
								int i_11_ = class246_sub30_10_.method2161((byte) -87);
								if (i_11_ >= 0) {
									if ((i_11_ ^ 0xffffffff) < -65535)
										i_11_ = 65534;
								} else
									i_11_ = 0;
								int i_12_ = class246_sub30_10_.method2160(i ^ 0x3013);
								if ((i_12_ ^ 0xffffffff) <= -1) {
									if (i_12_ > 65534)
										i_12_ = 65534;
								} else
									i_12_ = 0;
								boolean bool_13_ = false;
								if ((class246_sub30_10_.method2161((byte) -87) == -1) && (class246_sub30_10_.method2160(-107) ^ 0xffffffff) == 0) {
									i_11_ = -1;
									bool_13_ = true;
									i_12_ = -1;
								}
								if (i_12_ != Class246_Sub43.anInt5604 || ((i_11_ ^ 0xffffffff) != (Class233.anInt3183 ^ 0xffffffff))) {
									if (!bool) {
										Class135.anInt1891++;
										Class243.writePacket(i - 12442, (Class246_Sub26.aClass201_4890));
										Class130_Sub1.stream.writeByte(255, 0);
										bool = true;
										i_9_ = (((BufferStream) (Class130_Sub1.stream)).position);
									}
									int i_14_ = -Class246_Sub43.anInt5604 + i_12_;
									Class246_Sub43.anInt5604 = i_12_;
									int i_15_ = i_11_ + -Class233.anInt3183;
									Class233.anInt3183 = i_11_;
									int i_16_ = (int) ((class246_sub30_10_.method2158((byte) 122) + -Class246_Sub29.aLong4970) / 20L);
									if ((i_16_ ^ 0xffffffff) > -9 && (i_14_ ^ 0xffffffff) <= 31 && i_14_ <= 31 && i_15_ >= -32 && (i_15_ ^ 0xffffffff) >= -32) {
										i_15_ += 32;
										i_14_ += 32;
										Class130_Sub1.stream.writeShort((byte) 67, i_15_ + ((i_16_ << 12) + (i_14_ << 6)));
									} else if ((i_16_ ^ 0xffffffff) > -33 && (i_14_ ^ 0xffffffff) <= 127 && i_14_ <= 127 && i_15_ >= -128 && i_15_ <= 127) {
										Class130_Sub1.stream.writeByte(255, i_16_ + 128);
										i_14_ += 128;
										i_15_ += 128;
										Class130_Sub1.stream.writeShort((byte) 67, i_15_ + (i_14_ << 8));
									} else if (i_16_ >= 32) {
										Class130_Sub1.stream.writeShort((byte) 67, 57344 - -i_16_);
										if (!bool_13_)
											Class130_Sub1.stream.writeInt(i_11_ << 16 | i_12_, (byte) -97);
										else
											Class130_Sub1.stream.writeInt(-2147483648, (byte) -83);
									} else {
										Class130_Sub1.stream.writeByte(255, i_16_ + 192);
										if (!bool_13_)
											Class130_Sub1.stream.writeInt(i_11_ << 16 | i_12_, (byte) 92);
										else
											Class130_Sub1.stream.writeInt(-2147483648, (byte) -68);
									}
									Class246_Sub29.aLong4970 = class246_sub30_10_.method2158((byte) 117);
								}
							}
							if (bool)
								Class130_Sub1.stream.method2408(-1591647264, (((BufferStream) Class130_Sub1.stream).position + -i_9_));
						}
						if (class246_sub30 != null) {
							long l = ((class246_sub30.method2158((byte) 127) + -Class_q_Sub1.aLong6671) / 50L);
							if (l > 32767L)
								l = 32767L;
							Class_q_Sub1.aLong6671 = class246_sub30.method2158((byte) -68);
							int i_17_ = class246_sub30.method2161((byte) -122);
							if (i_17_ < 0)
								i_17_ = 0;
							else if (i_17_ > 65535)
								i_17_ = 65535;
							int i_18_ = class246_sub30.method2160(-104);
							if ((i_18_ ^ 0xffffffff) > -1)
								i_18_ = 0;
							else if (i_18_ > 65535)
								i_18_ = 65535;
							int i_19_ = 0;
							if ((class246_sub30.method2157((byte) 102) ^ 0xffffffff) == -3)
								i_19_ = 1;
							Class246_Sub7.anInt3959++;
							int i_20_ = (int) l;
							Class243.writePacket(-120, Class122.aClass201_1685);
							Class130_Sub1.stream.writeInt(i_17_ << 16 | i_18_, (byte) -65);
							Class130_Sub1.stream.writeShort128((byte) -115, i_20_ | i_19_ << 15);
						}
						if ((Class246_Sub28_Sub14.anInt6308 ^ 0xffffffff) < -1) {
							int i_21_ = 0;
							for (int i_22_ = 0; Class246_Sub28_Sub14.anInt6308 > i_22_; i_22_++) {
								if (Class59_Sub2.aClass188Array4544[i_22_].method1228(false))
									i_21_++;
							}
							if ((i_21_ ^ 0xffffffff) < -1) {
								Class243.writePacket(-86, Class120.aClass201_1650);
								if ((i_21_ ^ 0xffffffff) < -76)
									i_21_ = 75;
								Node.anInt3473++;
								Class130_Sub1.stream.writeByte(255, i_21_ * 3);
								for (int i_23_ = 0; ((i_23_ ^ 0xffffffff) > (Class246_Sub28_Sub14.anInt6308 ^ 0xffffffff)); i_23_++) {
									Class188 class188 = (Class59_Sub2.aClass188Array4544[i_23_]);
									if (class188.method1228(false)) {
										long l = ((class188.method1229(-5423) + -Class138.aLong1971) / 50L);
										Class138.aLong1971 = class188.method1229(-5423);
										if ((l ^ 0xffffffffffffffffL) < -65536L)
											l = 65535L;
										Class130_Sub1.stream.writeByte(i ^ 0x30b5, class188.method1233((byte) 120));
										Class130_Sub1.stream.writeShort((byte) 67, (int) l);
									}
								}
							}
						}
						if ((Class176.anInt2481 ^ 0xffffffff) < -1)
							Class176.anInt2481--;
						if (Class135.aBool1929 && (Class176.anInt2481 ^ 0xffffffff) >= -1) {
							Class135.aBool1929 = false;
							Class176.anInt2481 = 20;
							Class38.anInt565++;
							Class243.writePacket(-81, (Class246_Sub28_Sub22.aClass201_6632));
							Class130_Sub1.stream.writeShort128((byte) -120, (int) Class204.aFloat2881 >> 3);
							Class130_Sub1.stream.writeShortLE128((byte) -57, (int) Class59_Sub2.aFloat4553 >> 3);
						}
						if (Class142.aBool2049 != false && !Class59_Sub5_Sub1.aBool5824 != false) {
							Class59_Sub2.anInt4562++;
							Class59_Sub5_Sub1.aBool5824 = true;
							Class243.writePacket(i - 12475, Class246_Sub6.aClass201_3935);
							Class130_Sub1.stream.writeByte(255, 1);
						}
						if (Class142.aBool2049 == false && Class59_Sub5_Sub1.aBool5824 != false) {
							Class59_Sub2.anInt4562++;
							Class59_Sub5_Sub1.aBool5824 = false;
							Class243.writePacket(i ^ ~0x300b, Class246_Sub6.aClass201_3935);
							Class130_Sub1.stream.writeByte(255, 0);
						}
						if (!RuntimeException_Sub2.aBool7148) {
							Class243.writePacket(-86, (Class246_Sub28_Sub17.aClass201_6410));
							Class59_Sub2.anInt4550++;
							Class130_Sub1.stream.writeByte(255, 0);
							int i_24_ = (((BufferStream) Class130_Sub1.stream).position);
							BufferStream stream = Class246_Sub28_Sub27.aClass39_Sub1_6759.method2054(i ^ ~0x3011);
							Class130_Sub1.stream.writeBytes(0, true, ((BufferStream) stream).buffer, ((BufferStream) stream).position);
							Class130_Sub1.stream.method2408(i + -1591659626, (-i_24_ + (((BufferStream) Class130_Sub1.stream).position)));
							RuntimeException_Sub2.aBool7148 = true;
						}
						if (Class106.aClass147ArrayArrayArray1494 != null) {
							if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -3) {
								if (Class130_Sub3.anInt4417 == 3)
									Class246_Sub30.method2156(true);
							} else
								Class179.method1173(488012003);
						}
						if (Class168.aBool2400)
							Class168.aBool2400 = false;
						else
							Class259_Sub2_Sub1.aFloat6906 /= 2.0F;
						if (!Class15.aBool231)
							Class24.aFloat341 /= 2.0F;
						else
							Class15.aBool231 = false;
						Class137.method928(false);
						if (Class225.anInt3103 == 30) {
							InputStream_Sub1.method2101(-12388);
							Class246_Sub37_Sub1.method2508(127);
							Class_l_Sub2.method2300((byte) 124);
							BufferStream.method2390(-126);
							Class233.anInt3184++;
							if ((Class233.anInt3184 ^ 0xffffffff) < -751)
								Class246_Sub1_Sub11.method2615((byte) 103);
							else {
								Class124.method848(-117);
								Class_o.method2950((byte) -86);
								Class246_Sub7_Sub1.method2564(true);
								for (int i_25_ = Class246_Sub28_Sub23.aClass95_6658.method608(true, i ^ ~0x3071); i_25_ != -1; i_25_ = Class246_Sub28_Sub23.aClass95_6658.method608(false, i - 12470)) {
									Class149.method1006(false, i_25_);
									Class3.anIntArray27[PacketsDecoder.method184(31, Class246_Sub29.anInt4981++)] = i_25_;
								}
								for (Class246_Sub1_Sub10 class246_sub1_sub10 = Class51.method336(0); class246_sub1_sub10 != null; class246_sub1_sub10 = Class51.method336(0)) {
									int i_26_ = class246_sub1_sub10.method2602((byte) 94);
									int i_27_ = class246_sub1_sub10.method2605((byte) -10);
									if (i_26_ != 1) {
										if ((i_26_ ^ 0xffffffff) != -3) {
											if (i_26_ == 3) {
												Class235 class235 = (Class220.method1423(0, i_27_));
												if (!((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209.equals(((Class235) class235).aString3247)) {
													((Class235) class235).aString3247 = (((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209);
													Stream_Sub1.method2483(class235, (byte) -109);
												}
											} else if ((i_26_ ^ 0xffffffff) != -5) {
												if (i_26_ == 5) {
													Class235 class235 = (Class220.method1423(0, i_27_));
													if (((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211) != (((Class235) class235).anInt3232)) || ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211) ^ 0xffffffff) == 0) {
														((Class235) class235).anInt3256 = 0;
														((Class235) class235).anInt3275 = 0;
														((Class235) class235).anInt3221 = 1;
														((Class235) class235).anInt3232 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
														Stream_Sub1.method2483(class235, (byte) -109);
													}
												} else if ((i_26_ ^ 0xffffffff) == -7) {
													int i_28_ = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
													int i_29_ = i_28_ >> 10 & 0x1f;
													int i_30_ = (i_28_ & 0x3e9) >> 5;
													int i_31_ = 0x1f & i_28_;
													int i_32_ = ((i_31_ << 3) + (i_30_ << 11) + (i_29_ << 19));
													Class235 class235 = (Class220.method1423(i ^ 0x304a, i_27_));
													if ((((Class235) class235).anInt3197) != i_32_) {
														((Class235) class235).anInt3197 = i_32_;
														Stream_Sub1.method2483(class235, (byte) -109);
													}
												} else if (i_26_ != 7) {
													if ((i_26_ ^ 0xffffffff) == -9) {
														Class235 class235 = (Class220.method1423(0, i_27_));
														if ((((((Class235) class235).anInt3283) ^ 0xffffffff) != ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211) ^ 0xffffffff)) || (((((Class235) class235).f_gd) ^ 0xffffffff) != ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210) ^ 0xffffffff)) || (((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206) ^ 0xffffffff) != ((((Class235) class235).f_dd) ^ 0xffffffff))) {
															((Class235) class235).f_dd = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206);
															((Class235) class235).f_gd = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
															((Class235) class235).anInt3283 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
															if (((((Class235) class235).anInt3210) ^ 0xffffffff) != 0) {
																if (((((Class235) class235).anInt3265) ^ 0xffffffff) >= -1) {
																	if ((((Class235) class235).anInt3258) > 0)
																		((Class235) class235).f_dd = ((Class235) class235).f_dd * 32 / ((Class235) class235).anInt3258;
																} else
																	((Class235) class235).f_dd = (((Class235) class235).f_dd * 32 / ((Class235) class235).anInt3265);
															}
															Stream_Sub1.method2483(class235, (byte) -109);
														}
													} else if ((i_26_ ^ 0xffffffff) != -10) {
														if (i_26_ == 10) {
															Class235 class235 = (Class220.method1423(i - 12362, i_27_));
															if (((((Class235) class235).anInt3255) != (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211)) || (((((Class235) class235).anInt3271) ^ 0xffffffff) != ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210) ^ 0xffffffff)) || (((((Class235) class235).anInt3281) ^ 0xffffffff) != ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206) ^ 0xffffffff))) {
																((Class235) class235).anInt3255 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
																((Class235) class235).anInt3271 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
																((Class235) class235).anInt3281 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206);
																Stream_Sub1.method2483(class235, (byte) -109);
															}
														} else if (i_26_ == 11) {
															Class235 class235 = (Class220.method1423(0, i_27_));
															((Class235) class235).f_cb = (byte) 0;
															((Class235) class235).f_mc = ((Class235) class235).f_rb = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
															((Class235) class235).aByte3296 = (byte) 0;
															((Class235) class235).f_hd = ((Class235) class235).f_vb = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
															Stream_Sub1.method2483(class235, (byte) -109);
														} else if ((i_26_ ^ 0xffffffff) != -13) {
															if (i_26_ != 14) {
																if ((i_26_ ^ 0xffffffff) == -16) {
																	Class34.anInt451 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
																	Class193.aBool2712 = true;
																	Class188.anInt2658 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
																} else if ((i_26_ ^ 0xffffffff) == -17) {
																	Class235 class235 = (Class220.method1423(0, i_27_));
																	((Class235) class235).anInt3235 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
																}
															} else {
																Class235 class235 = (Class220.method1423(i ^ 0x304a, i_27_));
																((Class235) class235).f_lb = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
															}
														} else {
															Class235 class235 = (Class220.method1423(0, i_27_));
															int i_33_ = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
															if ((class235 != null) && (((((Class235) class235).f_vc) ^ 0xffffffff) == -1)) {
																if (i_33_ > ((((Class235) class235).anInt3276) - (((Class235) class235).f_sb)))
																	i_33_ = (-((Class235) class235).f_sb + ((Class235) class235).anInt3276);
																if ((i_33_ ^ 0xffffffff) > -1)
																	i_33_ = 0;
																if ((((Class235) class235).anInt3292) != i_33_) {
																	((Class235) class235).anInt3292 = i_33_;
																	Stream_Sub1.method2483(class235, (byte) -109);
																}
															}
														}
													} else {
														Class235 class235 = (Class220.method1423(0, i_27_));
														if (((((Class235) class235).anInt3210) != (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211)) || (((((Class235) class235).f_ec) ^ 0xffffffff) != ((((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210) ^ 0xffffffff))) {
															((Class235) class235).f_ec = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
															((Class235) class235).anInt3210 = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
															Stream_Sub1.method2483(class235, (byte) -109);
														}
													}
												} else {
													Class235 class235 = (Class220.method1423(0, i_27_));
													boolean bool = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211) == 1;
													if (!bool == ((Class235) class235).f_ic) {
														((Class235) class235).f_ic = bool;
														Stream_Sub1.method2483(class235, (byte) -109);
													}
												}
											} else {
												Class235 class235 = (Class220.method1423(i ^ 0x304a, i_27_));
												int i_34_ = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211);
												int i_35_ = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210);
												int i_36_ = (((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206);
												if ((i_34_ != (((Class235) class235).anInt3244)) || (((Class235) class235).anInt3215) != i_35_ || ((i_36_ ^ 0xffffffff) != ((((Class235) class235).anInt3289) ^ 0xffffffff))) {
													((Class235) class235).anInt3215 = i_35_;
													((Class235) class235).anInt3289 = i_36_;
													((Class235) class235).anInt3244 = i_34_;
													Stream_Sub1.method2483(class235, (byte) -109);
												}
											}
										} else {
											Class142.aStringArray2062[i_27_] = (((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209);
											Class149.anIntArray2194[(PacketsDecoder.method184(Class246_Sub1_Sub13.anInt6561++, 31))] = i_27_;
										}
									} else {
										Class246_Sub1_Sub11.anIntArray6246[i_27_] = ((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211;
										Class246_Sub28_Sub10.aBool6159 |= (Class59_Sub3_Sub1.aBoolArray5739[i_27_]);
										Class76.anIntArray996[(PacketsDecoder.method184(Class109_Sub1_Sub1.anInt6728++, 31))] = i_27_;
									}
								}
								Class246_Sub17.anInt4663++;
								if ((Class246_Sub28_Sub4.anInt5976 ^ 0xffffffff) != -1) {
									Class246_Sub28_Sub19.anInt6547 += 20;
									if (Class246_Sub28_Sub19.anInt6547 >= 400)
										Class246_Sub28_Sub4.anInt5976 = 0;
								}
								if (Class211.aClass235_2962 != null) {
									Class246_Sub28_Sub5.anInt6006++;
									if ((Class246_Sub28_Sub5.anInt6006 ^ 0xffffffff) <= -16) {
										Stream_Sub1.method2483(Class211.aClass235_2962, (byte) -109);
										Class211.aClass235_2962 = null;
									}
								}
								Class246_Sub11.aClass235_4106 = null;
								Class_ls.aClass235_964 = null;
								Class64_Sub1.aBool5240 = false;
								Class259_Sub3.aBool5355 = false;
								Class64_Sub1.method2219(-1, (byte) -82, null, -1);
								Class19.method190(-103, null, -1, -1);
								if (!Class187.aBool2653)
									Class83.anInt1089 = -1;
								Class59_Sub2.method2022(128);
								Class246_Sub34.anInt5146++;
								if (Class116.aBool1620) {
									Class246_Sub27.anInt4892++;
									Class243.writePacket(-85, (Class_ss.aClass201_7060));
									Class130_Sub1.stream.writeIntV1((Class128_Sub1.anInt5560 | ((Class246_Sub28_Sub24.anInt6675 << 14) | Class59_Sub1.anInt4513 << 28)), 690087856);
									Class116.aBool1620 = false;
								}
								for (;;) {
									Class246_Sub29 class246_sub29 = ((Class246_Sub29) Class128.aClass166_1796.method1100(i - 8267));
									if (class246_sub29 == null)
										break;
									Class235 class235 = (((Class246_Sub29) class246_sub29).aClass235_4974);
									if ((((Class235) class235).f_pd ^ 0xffffffff) <= -1) {
										Class235 class235_37_ = (Class220.method1423(i ^ 0x304a, (((Class235) class235).anInt3293)));
										if (class235_37_ == null || (((Class235) class235_37_).f_ad == null) || ((((Class235) class235_37_).f_ad).length <= ((Class235) class235).f_pd) || (class235 != (((Class235) class235_37_).f_ad[(((Class235) class235).f_pd)])))
											continue;
									}
									Class146.method988(class246_sub29);
								}
								for (;;) {
									Class246_Sub29 class246_sub29 = ((Class246_Sub29) Class246_Sub28_Sub2.aClass166_5809.method1100(4095));
									if (class246_sub29 == null)
										break;
									Class235 class235 = (((Class246_Sub29) class246_sub29).aClass235_4974);
									if ((((Class235) class235).f_pd ^ 0xffffffff) <= -1) {
										Class235 class235_38_ = (Class220.method1423(0, (((Class235) class235).anInt3293)));
										if (class235_38_ == null || (((Class235) class235_38_).f_ad == null) || ((((Class235) class235).f_pd ^ 0xffffffff) <= ((((Class235) class235_38_).f_ad).length ^ 0xffffffff)) || ((((Class235) class235_38_).f_ad[((Class235) class235).f_pd]) != class235))
											continue;
									}
									Class146.method988(class246_sub29);
								}
								for (;;) {
									Class246_Sub29 class246_sub29 = ((Class246_Sub29) Class246_Sub28_Sub26.aClass166_6708.method1100(4095));
									if (class246_sub29 == null)
										break;
									Class235 class235 = (((Class246_Sub29) class246_sub29).aClass235_4974);
									if ((((Class235) class235).f_pd ^ 0xffffffff) <= -1) {
										Class235 class235_39_ = (Class220.method1423(0, (((Class235) class235).anInt3293)));
										if (class235_39_ == null || (((Class235) class235_39_).f_ad == null) || ((((Class235) class235).f_pd ^ 0xffffffff) <= ((((Class235) class235_39_).f_ad).length ^ 0xffffffff)) || (class235 != (((Class235) class235_39_).f_ad[(((Class235) class235).f_pd)])))
											continue;
									}
									Class146.method988(class246_sub29);
								}
								if (i == 12362) {
									if (Class246_Sub11.aClass235_4106 == null)
										Class59_Sub3_Sub2.f_db = 0;
									if (Class150.aClass235_2196 != null)
										Class_a.method574(-95);
									if (Class260_Sub2.anInt4289 > 0 && Class216.aClass232_3009.method1488(-97, 82) && Class216.aClass232_3009.method1488(-73, 81) && (Class246_Sub41.anInt5531 ^ 0xffffffff) != -1) {
										int i_40_ = (-Class246_Sub41.anInt5531 + (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053));
										if (i_40_ < 0)
											i_40_ = 0;
										else if (i_40_ > 3)
											i_40_ = 3;
										Class246_Sub41_Sub2.method2680(i_40_, i - 12299, (Class47.anInt686 + (((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0])), ((((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0]) + Class39_Sub1.anInt4670));
									}
									Class59_Sub5_Sub1.method2465(-1);
									for (int i_41_ = 0; i_41_ < 5; i_41_++)
										Class259_Sub3.anIntArray5358[i_41_]++;
									if (Class246_Sub28_Sub10.aBool6159 && ((PacketsDecoder.aLong273 ^ 0xffffffffffffffffL) > ((Class151.time(-111) - 60000L) ^ 0xffffffffffffffffL)))
										Class173.method1136(i + -34487);
									Class246_Sub41_Sub2.anInt6481++;
									if ((Class246_Sub41_Sub2.anInt6481 ^ 0xffffffff) < -501) {
										Class246_Sub41_Sub2.anInt6481 = 0;
										int i_42_ = (int) (8.0 * Math.random());
										if ((0x1 & i_42_) == 1)
											Class130_Sub4.anInt4745 += Class56.anInt798;
										if ((i_42_ & 0x4 ^ 0xffffffff) == -5)
											Class147.anInt2147 += Class144.anInt2096;
										if ((i_42_ & 0x2 ^ 0xffffffff) == -3)
											Class246_Sub28_Sub27.anInt6755 += (Class246_Sub28_Sub15.anInt6364);
									}
									if ((Class130_Sub4.anInt4745 ^ 0xffffffff) > 49)
										Class56.anInt798 = 2;
									if (Class246_Sub28_Sub27.anInt6755 < -55)
										Class246_Sub28_Sub15.anInt6364 = 2;
									if (Class130_Sub4.anInt4745 > 50)
										Class56.anInt798 = -2;
									if ((Class246_Sub28_Sub27.anInt6755 ^ 0xffffffff) < -56)
										Class246_Sub28_Sub15.anInt6364 = -2;
									if (Class147.anInt2147 < -40)
										Class144.anInt2096 = 1;
									ISAAC.anInt628++;
									if ((Class147.anInt2147 ^ 0xffffffff) < -41)
										Class144.anInt2096 = -1;
									if (ISAAC.anInt628 > 500) {
										ISAAC.anInt628 = 0;
										int i_43_ = (int) (8.0 * Math.random());
										if ((i_43_ & 0x2) == 2)
											Class246_Sub12.anInt4405 += Class246_Sub12.anInt4397;
										if ((i_43_ & 0x1) == 1)
											Class95.anInt1253 += Class187_Sub2.anInt5427;
									}
									if (Class95.anInt1253 < -60)
										Class187_Sub2.anInt5427 = 2;
									if (Class95.anInt1253 > 60)
										Class187_Sub2.anInt5427 = -2;
									if (Class246_Sub12.anInt4405 < -20)
										Class246_Sub12.anInt4397 = 1;
									if (Class246_Sub12.anInt4405 > 10)
										Class246_Sub12.anInt4397 = -1;
									Class88.anInt1152++;
									if ((Class88.anInt1152 ^ 0xffffffff) < -51) {
										Class40_Sub7.anInt5178++;
										Class243.writePacket(-65, (Class7.aClass201_92));
									}
									if (Class46.aBool669) {
										Class259_Sub3_Sub1.method2842((byte) 82);
										Class46.aBool669 = false;
									}
									try {
										if (Class65.aClass6_864 == null || (((BufferStream) (Class130_Sub1.stream)).position ^ 0xffffffff) >= -1)
											break;
										Class34.anInt454 += (((BufferStream) (Class130_Sub1.stream)).position);
										Class65.aClass6_864.method76((((BufferStream) Class130_Sub1.stream).position), 0, (((BufferStream) Class130_Sub1.stream).buffer), 127);
										((BufferStream) Class130_Sub1.stream).position = 0;
										Class88.anInt1152 = 0;
									} catch (java.io.IOException ioexception) {
										Class246_Sub1_Sub11.method2615((byte) 99);
									}
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wa.C(" + i + ')');
			}
		} while (false);
	}

	public static void method1585(byte i) {
		do {
			try {
				INTERFACE_ON_INTERFACE_PACKET = null;
				aCharArray3489 = null;
				if (i < -12)
					break;
				aBool3487 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wa.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final String method1586(String string, int i, String string_44_, String string_45_) {
		try {
			if (i != -9)
				return null;
			anInt3485++;
			for (int i_46_ = string_45_.indexOf(string_44_); (i_46_ ^ 0xffffffff) != 0; i_46_ = string_45_.indexOf(string_44_, string.length() + i_46_))
				string_45_ = (string_45_.substring(0, i_46_) + string + string_45_.substring(i_46_ + string_44_.length()));
			return string_45_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		aBool3487 = false;
		aCharArray3489 = new char[] { '[', ']', '#' };
	}
}
