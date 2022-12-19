abstract class Class210 {

	int anInt2950;
	static int anInt2951;
	int anInt2952;
	static int anInt2953;
	static int anInt2954;
	int anInt2955;
	int anInt2956;
	static int anInt2957;

	abstract int l(int var1, int var2);

	abstract Class246_Sub1_Sub4 k(int var1, int var2, Class246_Sub1_Sub4 var3);

	abstract void ca();

	abstract boolean method1377(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);

	abstract void method1378(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, int var14, int var15, int var16, boolean var17);

	abstract int a(int var1, int var2);

	abstract void method1379(Class246_Sub41 var1, int[] var2);

	abstract void i(int var1, int var2, int var3);

	abstract void method1380(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

	static final void method1381(int var0, boolean var1, Player var2) {
		try {
			++anInt2951;
			if (~Class230.anInt3147 > -401) {
				int var3 = 67 / ((var0 - 17) / 56);
				if (Class_a.aClass_r_Sub1_1180 == var2) {
					if (Class187.aBool2653 && ~(Node.anInt3469 & 16) != -1) {
						++Class59_Sub3_Sub3.anInt6276;
						Class259_Sub2_Sub1.method2846(8, (byte) -55, false, 0L, 0, Class246_Sub7.aString3964 + " -> <col=ffffff>" + Player.aClass67_7125.method436(true, Class_j.anInt1485), true, Class218.aString3026, 0, -1, Class147.anInt2148);
					}

				} else {
					String var4;
					int var8;
					if (var2.f_fd != 0) {
						var4 = var2.method2915(56, true) + " (" + Class66.aClass67_878.method436(true, Class_j.anInt1485) + var2.f_fd + ")";
					} else {
						boolean var5 = true;
						if (~Class_a.aClass_r_Sub1_1180.anInt7141 != 0 && ~var2.anInt7141 != 0) {
							int var6 = ~Class_a.aClass_r_Sub1_1180.f_qd < ~var2.f_qd ? Class_a.aClass_r_Sub1_1180.f_qd : var2.f_qd;
							int var7 = ~var2.anInt7141 < ~Class_a.aClass_r_Sub1_1180.anInt7141 ? Class_a.aClass_r_Sub1_1180.anInt7141 : var2.anInt7141;
							var8 = 10 * var6 / 100 + 5 + var7;
							int var9 = -var2.f_qd + Class_a.aClass_r_Sub1_1180.f_qd;
							if (~var9 > -1) {
								var9 = -var9;
							}

							if (~var9 < ~var8) {
								var5 = false;
							}
						}

						String var11 = Class40_Sub6.aClass101_5092 != Class59_Sub4_Sub3.aClass101_6943 ? Class38_Sub1.aClass67_5105.method436(true, Class_j.anInt1485) : Class246_Sub1.aClass67_3748.method436(true, Class_j.anInt1485);
						if (~var2.f_qd <= ~var2.f_bd) {
							var4 = var2.method2915(33, true) + (var5 ? Class246_Sub27.method2122(Class_a.aClass_r_Sub1_1180.f_qd, true, var2.f_qd) : "<col=ffffff>") + " (" + var11 + var2.f_qd + ")";
						} else {
							var4 = var2.method2915(-124, true) + (var5 ? Class246_Sub27.method2122(Class_a.aClass_r_Sub1_1180.f_qd, true, var2.f_qd) : "<col=ffffff>") + " (" + var11 + var2.f_qd + "+" + (-var2.f_qd + var2.f_bd) + ")";
						}
					}

					if (!Class187.aBool2653) {
						if (var1) {
							Class259_Sub2_Sub1.method2846(-1, (byte) -55, true, 0L, 0, "", false, "<col=cccccc>" + var4, 0, 0, -1);
						} else {
							for (int var12 = 7; ~var12 <= -1; --var12) {
								if (Class191.aStringArray2682[var12] != null) {
									short var13 = 0;
									if (Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394 && Class191.aStringArray2682[var12].equalsIgnoreCase(Class246_Sub11.aClass67_4107.method436(true, Class_j.anInt1485))) {
										if (~var2.f_qd < ~Class_a.aClass_r_Sub1_1180.f_qd) {
											var13 = 2000;
										}

										if (~Class_a.aClass_r_Sub1_1180.anInt7138 != -1 && ~var2.anInt7138 != -1) {
											if (Class_a.aClass_r_Sub1_1180.anInt7138 != var2.anInt7138) {
												var13 = 0;
											} else {
												var13 = 2000;
											}
										}
									} else if (Class130_Sub4.aBoolArray4742[var12]) {
										var13 = 2000;
									}

									short var15 = (short) (var13 + Class106_Sub2.aShortArray5328[var12]);
									var8 = ~Class246_Sub27.anIntArray4903[var12] != 0 ? Class246_Sub27.anIntArray4903[var12] : Class109.anInt1568;
									Class259_Sub2_Sub1.method2846(var15, (byte) -55, false, (long) var2.f_db, 0, "<col=ffffff>" + var4, true, Class191.aStringArray2682[var12], 0, -1, var8);
									++Class130_Sub8.anInt5614;
								}
							}
						}
					} else if (!var1 && ~(Node.anInt3469 & 8) != -1) {
						Class259_Sub2_Sub1.method2846(46, (byte) -55, false, (long) var2.f_db, 0, Class246_Sub7.aString3964 + " -> <col=ffffff>" + var4, true, Class218.aString3026, 0, -1, Class147.anInt2148);
						++Class115.anInt1604;
					}

					if (!var1) {
						for (Class246_Sub35 var14 = (Class246_Sub35) Class108.aClass166_1525.method1104(74); var14 != null; var14 = (Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112)) {
							if (var14.anInt5156 == 44) {
								var14.aString5152 = "<col=ffffff>" + var4;
								return;
							}
						}

					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class193.method1272(var10, "ta.P(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1382(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++anInt2954;
			int var7 = Class246_Sub4.anInt3869;
			Class121.anInt1677 = 0;
			int[] var8 = Class53.anIntArray755;

			int var12;
			int var18;
			int var19;
			int var26;
			Object var29;
			int var33;
			int var36;
			int var37;
			for (int var9 = 0; Class5.anInt55 + var7 > var9; ++var9) {
				Class253 var10 = null;
				Object var11;
				if (~var7 < ~var9) {
					var11 = Class143.aClass_r_Sub1Array2069[var8[var9]];
				} else {
					var11 = Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[var9 + -var7]];
					var10 = ((Npc) var11).aClass253_7184;
					if (var10.anIntArray3594 != null) {
						var10 = var10.method1624(false, Class246_Sub28_Sub23.aClass95_6658);
						if (var10 == null) {
							continue;
						}
					}
				}

				if (~((Actor) var11).anInt6431 <= -1 && (~((Actor) var11).anInt6453 == ~Class64_Sub1.anInt5236 || ~((Class59_Sub3) var11).aByte5053 == ~Class_a.aClass_r_Sub1_1180.aByte5053)) {
					Class205.method1340(var0 >> 1, var2 ^ 10, var6 >> 1, var4, var1, ((Actor) var11).method2674(0), (Actor) var11);
					if (~Class257.anIntArray3689[0] <= -1) {
						if (((Actor) var11).aString6429 != null && (~var9 <= ~var7 || ~Class7.anInt95 == -1 || ~Class7.anInt95 == -4 || Class7.anInt95 == 1 && Class246_Sub1_Sub9.method2586(117, ((Player) var11).aString7140)) && Class225.anInt3109 > Class121.anInt1677) {
							Class225.anIntArray3101[Class121.anInt1677] = Class_fs.aClass73_148.method459(-1, ((Actor) var11).aString6429) / 2;
							Class225.anIntArray3110[Class121.anInt1677] = Class257.anIntArray3689[0];
							Class225.anIntArray3102[Class121.anInt1677] = Class257.anIntArray3689[1];
							Class225.anIntArray3097[Class121.anInt1677] = ((Actor) var11).f_hc;
							Class225.anIntArray3104[Class121.anInt1677] = ((Actor) var11).anInt6456;
							Class225.anIntArray3111[Class121.anInt1677] = ((Actor) var11).anInt6471;
							Class225.aStringArray3106[Class121.anInt1677] = ((Actor) var11).aString6429;
							++Class121.anInt1677;
						}

						var12 = Class257.anIntArray3689[1] + var3;
						Object var16;
						Class10[] var17;
						if (!((Actor) var11).aBool6441 && ~((Actor) var11).anInt6464 < ~Class246_Sub1_Sub4.anInt5752) {
							boolean var13 = true;
							byte var14 = 1;
							if (var7 > var9) {
								Player var15 = Class143.aClass_r_Sub1Array2069[var8[var9]];
								var26 = ((Actor) var11).method2676(-1).anInt1922;
								if (var15.aBool7129) {
									var14 = 2;
								}
							} else {
								var26 = var10.anInt3577;
								if (var26 == -1) {
									var26 = ((Actor) var11).method2676(var2 ^ -11).anInt1922;
								}
							}

							Object var28 = Class246_Sub28_Sub12.aClass_lArray6192;
							if (var26 != -1) {
								var16 = Class140.aClass54_2034.method379((long) var26, (byte) 58);
								if (var16 == null) {
									var17 = Class10.method129(Class210_Sub2.index8, var26, 0);
									if (var17 != null) {
										var16 = new Class_l[var17.length];

										for (var18 = 0; var18 < var17.length; ++var18) {
											((Object[]) var16)[var18] = Class246_Sub15.aClass260_4445.method1749(var17[var18], true);
										}

										Class140.aClass54_2034.method371(var2 - 9, (long) var26, var16);
									}
								}

								if (var16 != null && ~((Object[]) var16).length <= -3) {
									var28 = var16;
								}
							}

							if (var14 >= ((Object[]) var28).length) {
								var14 = 1;
							}

							var16 = ((Object[]) var28)[0];
							Object var35 = ((Object[]) var28)[var14];
							var12 -= Math.max(Class_fs.aClass73_148.anInt951, ((Class_l) var16).ma());
							var18 = Class257.anIntArray3689[0] + var5 - (((Class_l) var16).la() >> 1);
							var19 = ((Class_l) var16).la() * ((Actor) var11).anInt6432 / 255;
							if (~((Actor) var11).anInt6432 < -1 && var19 < 2) {
								var19 = 2;
							}

							((Class_l) var16).method729(var18, var12);
							Class246_Sub15.aClass260_4445.fa(var18, var12, var18 - -var19, ((Class_l) var16).ma() + var12);
							((Class_l) var35).method729(var18, var12);
							Class246_Sub15.aClass260_4445.OA(var5, var3, var0 + var5, var3 + var6);
						} else {
							var12 -= Math.max(Class_fs.aClass73_148.anInt951, Class246_Sub28_Sub12.aClass_lArray6192[0].ma());
						}

						var12 -= 2;
						if (!((Actor) var11).aBool6441) {
							if (Class246_Sub1_Sub4.anInt5752 < ((Actor) var11).f_bb) {
								Object var27 = Class233.aClass_lArray3188[!((Actor) var11).aBool6414 ? 0 : 2];
								var29 = Class233.aClass_lArray3188[!((Actor) var11).aBool6414 ? 1 : 3];
								boolean var30 = true;
								if (!(var11 instanceof Npc)) {
									var33 = ((Actor) var11).method2676(-1).anInt1898;
								} else {
									var33 = var10.anInt3602;
									if (var33 == -1) {
										var33 = ((Actor) var11).method2676(-1).anInt1898;
									}
								}

								if (~var33 != 0) {
									var16 = Class246_Sub41_Sub2.aClass54_6474.method379((long) var33, (byte) 58);
									if (var16 == null) {
										var17 = Class10.method129(Class210_Sub2.index8, var33, 0);
										if (var17 != null) {
											var16 = new Class_l[var17.length];

											for (var18 = 0; ~var18 > ~var17.length; ++var18) {
												((Object[]) var16)[var18] = Class246_Sub15.aClass260_4445.method1749(var17[var18], true);
											}

											Class246_Sub41_Sub2.aClass54_6474.method371(var2 - 9, (long) var33, var16);
										}
									}

									if (var16 != null && ~((Object[]) var16).length == -5) {
										var27 = ((Object[]) var16)[!((Actor) var11).aBool6414 ? 0 : 2];
										var29 = ((Object[]) var16)[((Actor) var11).aBool6414 ? 3 : 1];
									}
								}

								int var38 = ((Actor) var11).f_bb + -Class246_Sub1_Sub4.anInt5752;
								if (((Actor) var11).f_vb < var38) {
									var38 -= ((Actor) var11).f_vb;
									var18 = ((Actor) var11).anInt6444 != 0 ? ((Actor) var11).anInt6444 * ((-var38 + ((Actor) var11).f_jb) / ((Actor) var11).anInt6444) : 0;
									var37 = ((Class_l) var27).la() * var18 / ((Actor) var11).f_jb;
								} else {
									var37 = ((Class_l) var27).la();
								}

								var18 = ((Class_l) var27).ma();
								var12 -= var18;
								var19 = Class257.anIntArray3689[0] + (var5 - (((Class_l) var27).la() >> 1));
								((Class_l) var27).method729(var19, var12);
								Class246_Sub15.aClass260_4445.fa(var19, var12, var19 - -var37, var18 + var12);
								((Class_l) var29).method729(var19, var12);
								var12 -= 2;
								Class246_Sub15.aClass260_4445.OA(var5, var3, var5 + var0, var3 - -var6);
							}

							if (var9 < var7) {
								Player var31 = (Player) var11;
								if (var31.f_jd != -1) {
									var12 -= 25;
									Class98.aClass_lArray1279[var31.f_jd].method729(-12 + Class257.anIntArray3689[0] + var5, var12);
									var12 -= 2;
								}

								if (~var31.f_td != 0) {
									var12 -= 25;
									Class58.aClass_lArray814[var31.f_td].method729(var5 + Class257.anIntArray3689[0] - 12, var12);
									var12 -= 2;
								}
							} else if (var10.anInt3578 >= 0 && var10.anInt3578 < Class58.aClass_lArray814.length) {
								Class_l var34 = Class58.aClass_lArray814[var10.anInt3578];
								var12 -= 25;
								var34.method729(Class257.anIntArray3689[0] + var5 + -(var34.la() >> 1), var12);
								var12 -= 2;
							}
						}

						int var10000;
						Class29[] var32;
						Class29 var40;
						Class_l var41;
						if (!(var11 instanceof Player)) {
							var26 = 0;
							var32 = Class166.aClass29Array2347;

							for (var33 = 0; var32.length > var33; ++var33) {
								var40 = var32[var33];
								if (var40 != null && ~var40.anInt391 == -2 && Class246_Sub28_Sub29.anIntArray6815[var9 - var7] == var40.anInt384) {
									var41 = Class_cs.aClass_lArray7146[var40.anInt385];
									if (var41.ma() > var26) {
										var26 = var41.ma();
									}

									if (~(Class246_Sub1_Sub4.anInt5752 % 20) > -11) {
										var41.method729(-12 + var5 - -Class257.anIntArray3689[0], var12 + -var41.ma());
									}
								}
							}

							if (~var26 < -1) {
								var10000 = var12 - (var26 + 2);
							}
						} else if (var9 >= 0) {
							var26 = 0;
							var32 = Class166.aClass29Array2347;

							for (var33 = 0; ~var33 > ~var32.length; ++var33) {
								var40 = var32[var33];
								if (var40 != null && var40.anInt391 == 10 && ~var8[var9] == ~var40.anInt384) {
									var41 = Class_cs.aClass_lArray7146[var40.anInt385];
									if (~var26 > ~var41.ma()) {
										var26 = var41.ma();
									}

									var41.method729(-12 + Class257.anIntArray3689[0] + var5, var12 - var41.ma());
								}
							}

							if (var26 > 0) {
								var10000 = var12 - (var26 + 2);
							}
						}

						for (var26 = 0; ~var26 > -5; ++var26) {
							if (Class246_Sub1_Sub4.anInt5752 < ((Actor) var11).anIntArray6447[var26]) {
								var36 = ((Actor) var11).method2674(var2 ^ 10) / 2;
								Class205.method1340(var0 >> 1, var2 ^ 10, var6 >> 1, var4, var1, var36, (Actor) var11);
								if (~Class257.anIntArray3689[0] < 0) {
									if (var26 == 1) {
										Class257.anIntArray3689[1] -= 20;
									}

									if (var26 == 2) {
										Class257.anIntArray3689[1] -= 10;
										Class257.anIntArray3689[0] -= 15;
									}

									if (var26 == 3) {
										Class257.anIntArray3689[1] -= 10;
										Class257.anIntArray3689[0] += 15;
									}

									Class191.aClass_lArray2694[((Actor) var11).anIntArray6472[var26]].method729(-12 + var5 - -Class257.anIntArray3689[0], -12 + Class257.anIntArray3689[1] + var3);
									Class_c.aClass116_1196.method792(var5 + Class257.anIntArray3689[0] - 1, -1, var2 - 10, 3 + var3 - -Class257.anIntArray3689[1], -16777216, // adds shadow,
																																												// used to be 0
											Integer.toString(((Actor) var11).anIntArray6434[var26]));
								}
							}
						}
					}
				}
			}

			if (var2 == 10) {
				int var25;
				for (int var24 = 0; var24 < Class163.anInt2308; ++var24) {
					var25 = Class121.anIntArray1663[var24];
					Object var39;
					if (var25 < 2048) {
						var39 = Class143.aClass_r_Sub1Array2069[var25];
					} else {
						var39 = Class76.aClass_r_Sub2Array1002[-2048 + var25];
					}

					var26 = Class236.anIntArray3315[var24];
					if (~var26 <= -2049) {
						var29 = Class76.aClass_r_Sub2Array1002[var26 - 2048];
					} else {
						var29 = Class143.aClass_r_Sub1Array2069[var26];
					}

					method1385(false, var1, var3, var5, (Actor) var29, (Actor) var39, --((Actor) var39).anInt6463, var0, var6, var4);
				}

				var25 = 2 + Class_fs.aClass73_148.anInt946 + Class_fs.aClass73_148.anInt951;

				for (var12 = 0; ~var12 > ~Class121.anInt1677; ++var12) {
					var26 = Class225.anIntArray3110[var12];
					var36 = Class225.anIntArray3102[var12];
					var33 = Class225.anIntArray3101[var12];
					boolean var42 = true;

					while (var42) {
						var42 = false;

						for (var37 = 0; ~var37 > ~var12; ++var37) {
							if (~(-var25 + Class225.anIntArray3102[var37]) > ~(var36 + 2) && Class225.anIntArray3102[var37] + 2 > var36 - var25 && Class225.anIntArray3101[var37] + Class225.anIntArray3110[var37] > var26 - var33 && ~(Class225.anIntArray3110[var37] + -Class225.anIntArray3101[var37]) > ~(var33 + var26) && ~var36 < ~(Class225.anIntArray3102[var37] + -var25)) {
								var36 = -var25 + Class225.anIntArray3102[var37];
								var42 = true;
							}
						}
					}

					Class225.anIntArray3102[var12] = var36;
					String var43 = Class225.aStringArray3106[var12];
					if (Class101.anInt1313 == 0) {
						var18 = 16776960;
						if (Class225.anIntArray3097[var12] < 6) {
							var18 = Player.f_id[Class225.anIntArray3097[var12]];
						}

						if (~Class225.anIntArray3097[var12] == -7) {
							var18 = Class64_Sub1.anInt5236 % 20 >= 10 ? 16776960 : 16711680;
						}

						if (~Class225.anIntArray3097[var12] == -8) {
							var18 = ~(Class64_Sub1.anInt5236 % 20) <= -11 ? '\uffff' : 255;
						}

						if (~Class225.anIntArray3097[var12] == -9) {
							var18 = ~(Class64_Sub1.anInt5236 % 20) <= -11 ? 8454016 : '\ub000';
						}

						if (~Class225.anIntArray3097[var12] == -10) {
							var19 = -Class225.anIntArray3111[var12] + 150;
							if (~var19 > -51) {
								var18 = 16711680 - -(var19 * 1280);
							} else if (~var19 > -101) {
								var18 = -(327680 * (var19 - 50)) + 16776960;
							} else if (~var19 > -151) {
								var18 = '\uff00' + 5 * (var19 - 100);
							}
						}

						if (~Class225.anIntArray3097[var12] == -11) {
							var19 = -Class225.anIntArray3111[var12] + 150;
							if (~var19 <= -51) {
								if (~var19 <= -101) {
									if (var19 < 150) {
										var18 = 255 + 327680 * (var19 - 100) - (-500 + var19 * 5);
									}
								} else {
									var18 = -((var19 - 50) * 327680) + 16711935;
								}
							} else {
								var18 = var19 * 5 + 16711680;
							}
						}

						if (~Class225.anIntArray3097[var12] == -12) {
							var19 = -Class225.anIntArray3111[var12] + 150;
							if (~var19 <= -51) {
								if (~var19 <= -101) {
									if (~var19 > -151) {
										var18 = 32768000 + -(327680 * var19) + 16777215;
									}
								} else {
									var18 = -16384250 + var19 * 327685 + '\uff00';
								}
							} else {
								var18 = 16777215 - var19 * 327685;
							}
						}

						var19 = -16777216 | var18;
						if (~Class225.anIntArray3104[var12] == -1) {
							Class79_Sub1.aClass116_5162.method792(var5 + var26, var19, 0, var36 + var3, -16777216, var43);
						}

						if (~Class225.anIntArray3104[var12] == -2) {
							Class79_Sub1.aClass116_5162.method786(var19, var43, -58, var36 + var3, var26 + var5, Class64_Sub1.anInt5236, -16777216);
						}

						if (~Class225.anIntArray3104[var12] == -3) {
							Class79_Sub1.aClass116_5162.method782(var3 + var36, -16777216, var26 + var5, var43, Class64_Sub1.anInt5236, var19, var2 ^ -120);
						}

						if (Class225.anIntArray3104[var12] == 3) {
							Class79_Sub1.aClass116_5162.method800(-16777216, var19, var3 + var36, var43, 124, var5 - -var26, Class64_Sub1.anInt5236, -Class225.anIntArray3111[var12] + 150);
						}

						int var20;
						if (~Class225.anIntArray3104[var12] == -5) {
							var20 = (150 + -Class225.anIntArray3111[var12]) * (Class_fs.aClass73_148.method459(-1, var43) + 100) / 150;
							Class246_Sub15.aClass260_4445.fa(-50 + var5 + var26, var3, var5 - (-var26 - 50), var3 - -var6);
							Class79_Sub1.aClass116_5162.method794(-16777216, var19, var43, var3 - -var36, 50 + var5 + var26 - var20, 0);
							Class246_Sub15.aClass260_4445.OA(var5, var3, var0 + var5, var6 + var3);
						}

						if (Class225.anIntArray3104[var12] == 5) {
							var20 = 150 - Class225.anIntArray3111[var12];
							int var21 = 0;
							if (~var20 <= -26) {
								if (~var20 < -126) {
									var21 = var20 - 125;
								}
							} else {
								var21 = -25 + var20;
							}

							int var22 = Class_fs.aClass73_148.anInt951 + Class_fs.aClass73_148.anInt946;
							Class246_Sub15.aClass260_4445.fa(var5, -var22 + var36 + var3 - 1, var5 - -var0, 5 + var36 + var3);
							Class79_Sub1.aClass116_5162.method792(var26 + var5, var19, 0, var36 + var3 - -var21, -16777216, var43);
							Class246_Sub15.aClass260_4445.OA(var5, var3, var0 + var5, var6 + var3);
						}
					} else {
						Class79_Sub1.aClass116_5162.method792(var5 - -var26, -256, 0, var36 + var3, -16777216, var43);
					}
				}

			}
		} catch (RuntimeException var23) {
			throw Class193.method1272(var23, "ta.O(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	abstract void B(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, int var12, int var13, boolean var14);

	abstract void method1383(int var1, int var2);

	abstract void method1384(int var1, int var2, int var3, boolean[][] var4, boolean var5);

	Class210(int var1, int var2, int var3) {
		try {
			for (this.anInt2956 = var1; var3 > 1; ++this.anInt2950) {
				var3 >>= 1;
			}

			this.anInt2952 = var2;
			this.anInt2955 = 1 << this.anInt2950;
		} catch (RuntimeException var5) {
			throw Class193.method1272(var5, "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private static final void method1385(boolean var0, int var1, int var2, int var3, Actor var4, Actor var5, int var6, int var7, int var8, int var9) {
		try {
			++anInt2957;
			int var10 = var4.method2675((byte) 18);
			if (var10 != -1) {
				Class_l var11 = null;
				var11 = (Class_l) Class211_Sub1.aClass54_5351.method379((long) var10, (byte) 58);
				if (var11 == null) {
					Class10[] var12 = Class10.method129(Class210_Sub2.index8, var10, 0);
					if (var12 == null) {
						return;
					}

					var11 = Class246_Sub15.aClass260_4445.method1749(var12[0], true);
					Class211_Sub1.aClass54_5351.method371(1, (long) var10, var11);
				}

				Class211.method1386(var1, var5.anInt5060, var5.anInt5059, var9, 64 * var5.method2670((byte) 127), var7 >> 1, 0, 503, var5.aByte5053, var8 >> 1);
				int var16 = Class257.anIntArray3689[0] + (var3 - 18);
				var16 += 18 * (var6 / 4);
				int var13 = -54 + -16 + Class257.anIntArray3689[1] + var2;
				var13 += 18 * (var6 % 4);
				var11.method729(var16, var13);
				if (var5 == var4) {
					Class246_Sub15.aClass260_4445.method1736(-1 + var16, -256, 18, 8, 18, -1 + var13);
				}

				Class130_Sub4 var14 = Class234.method1496(8);
				var14.anInt4737 = var16;
				if (!var0) {
					var14.anInt4743 = var13;
					var14.anInt4741 = 16 + var16;
					var14.aClass_r4744 = var4;
					var14.anInt4739 = var13 + 16;
					HashMap.aClass68_762.method438(83, var14);
				}
			}
		} catch (RuntimeException var15) {
			throw Class193.method1272(var15, "ta.N(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	abstract void b(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);

	abstract void p(Class246_Sub1_Sub4 var1, int var2, int var3, int var4, int var5, boolean var6);
}
