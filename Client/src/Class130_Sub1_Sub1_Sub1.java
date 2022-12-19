/* Class130_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub1_Sub1_Sub1 extends Class130_Sub1_Sub1 {
	private int anInt7096;
	private int anInt7097;
	private short aShort7098;
	private short aShort7099;
	private short aShort7100;
	private short aShort7101;
	private short aShort7102;
	private Class130_Sub6 aClass130_Sub6_7103;
	private short aShort7104;

	private final void method2901() {
		((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).aClass130_Sub1_Sub1_Sub1Array3787[aShort7101] = null;
		Class246_Sub43.aClass130_Sub1_Sub1_Sub1Array5600[Class165.anInt2335] = this;
		Class165.anInt2335 = Class165.anInt2335 + 1 & 0x3ff;
		this.method886(1024);
		this.method1754(10009);
	}

	final void method2902(long l) {
		int i = ((Class130_Sub1_Sub1) this).anInt7037 >> 12 + Class126.anInt1781;
		int i_0_ = ((Class130_Sub1_Sub1) this).anInt7044 >> 12 + Class126.anInt1781;
		int i_1_ = ((Class130_Sub1_Sub1) this).anInt7048 >> Class93.anInt1225;
		if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= Class240.anInt3377 || i_0_ < 0 || i_0_ >= Class_t_Sub1.f_sc)
			method2901();
		else {
			Class130_Sub2 class130_sub2 = ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859;
			Class104 class104 = ((Class130_Sub6) aClass130_Sub6_7103).aClass104_4856;
			Class210[] class210s = Class59_Sub3_Sub4.aClass210Array6993;
			int i_2_ = class210s[((Class130_Sub2) class130_sub2).anInt3797].l(i, i_0_);
			int i_3_;
			if (((Class130_Sub2) class130_sub2).anInt3797 < Class154_Sub1.anInt4803 - 1)
				i_3_ = class210s[((Class130_Sub2) class130_sub2).anInt3797 + 1].l(i, i_0_);
			else
				i_3_ = i_2_ - (8 << Class126.anInt1781);
			if (((Class104) class104).aBool1404) {
				if (((Class104) class104).anInt1403 == -1 && i_1_ > i_2_) {
					method2901();
					return;
				}
				if (((Class104) class104).anInt1403 >= 0 && i_1_ > class210s[((Class104) class104).anInt1403].l(i, i_0_)) {
					method2901();
					return;
				}
				if (((Class104) class104).f_cb == -1 && i_1_ < i_3_) {
					method2901();
					return;
				}
				if (((Class104) class104).f_cb >= 0 && i_1_ < class210s[((Class104) class104).f_cb + 1].l(i, i_0_)) {
					method2901();
					return;
				}
			}
			if (i < ((Class130_Sub2) class130_sub2).anInt3795 || i > ((Class130_Sub2) class130_sub2).anInt3798 || i_0_ < ((Class130_Sub2) class130_sub2).anInt3799 || i_0_ > ((Class130_Sub2) class130_sub2).anInt3793 || i_1_ > i_2_ || i_1_ < i_3_) {
				int i_4_;
				for (i_4_ = Class154_Sub1.anInt4803 - 1; i_4_ > 0 && i_1_ > class210s[i_4_].l(i, i_0_); i_4_--) {
					/* empty */
				}
				if (i_4_ == 0 && i_1_ > class210s[0].l(i, i_0_))
					method2901();
				else if (i_4_ == Class154_Sub1.anInt4803 - 1 && (class210s[i_4_].l(i, i_0_) - i_1_ > 8 << Class126.anInt1781))
					method2901();
				else {
					Class147 class147 = Class106.aClass147ArrayArrayArray1494[i_4_][i][i_0_];
					if (class147 == null) {
						if (i_4_ == 0)
							class147 = Class106.aClass147ArrayArrayArray1494[0][i][i_0_] = new Class147(0, i, i_0_);
						boolean bool = (((Class147) (Class106.aClass147ArrayArrayArray1494[0][i][i_0_])).aClass147_2165 != null);
						if (i_4_ == 3 && bool) {
							method2901();
							return;
						}
						for (int i_5_ = 1; i_5_ <= i_4_; i_5_++) {
							if ((Class106.aClass147ArrayArrayArray1494[i_5_][i][i_0_]) == null) {
								class147 = Class106.aClass147ArrayArrayArray1494[i_5_][i][i_0_] = new Class147(i_5_, i, i_0_);
								if (bool)
									((Class147) class147).aByte2174++;
							}
						}
					}
					if (((Class147) class147).aClass129_2173 == null) {
						((Class147) class147).aClass129_2173 = new Class129();
						((Class147) class147).aByte2154 = (byte) (int) (l & 0xffL);
					} else if (((Class147) class147).aByte2154 != (byte) (int) (l & 0xffL)) {
						((Class129) ((Class147) class147).aClass129_2173).aClass220_1802.method1424(124);
						((Class129) ((Class147) class147).aClass129_2173).aBool1812 = false;
						((Class147) class147).aByte2154 = (byte) (int) (l & 0xffL);
					}
					((Class129) ((Class147) class147).aClass129_2173).aClass220_1802.method1428(true, this);
				}
			} else
				((Class129) ((Class130_Sub2) class130_sub2).aClass129_3800).aClass220_1802.method1428(true, this);
		}
	}

	final void method2903(Class130_Sub6 class130_sub6, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, boolean bool_16_) {
		aClass130_Sub6_7103 = class130_sub6;
		((Class130_Sub1_Sub1) this).anInt7037 = i << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7048 = i_6_ << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7044 = i_7_ << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7043 = i_13_;
		aShort7100 = aShort7104 = (short) i_12_;
		((Class130_Sub1_Sub1) this).anInt7038 = i_14_;
		((Class130_Sub1_Sub1) this).anInt7049 = i_15_;
		((Class130_Sub1_Sub1) this).aBool7040 = bool_16_;
		aShort7102 = (short) i_8_;
		aShort7098 = (short) i_9_;
		aShort7099 = (short) i_10_;
		anInt7097 = i_11_;
		((Class130_Sub1_Sub1) this).aByte7041 = (((Class19) ((Class130_Sub6) aClass130_Sub6_7103).aClass19_4852).aByte311);
		method2904();
	}

	private final void method2904() {
		int i = (((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).anInt3785);
		if ((((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).aClass130_Sub1_Sub1_Sub1Array3787[i]) != null)
			((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).aClass130_Sub1_Sub1_Sub1Array3787[i].method2901();
		((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).aClass130_Sub1_Sub1_Sub1Array3787[i] = this;
		aShort7101 = (short) ((Class130_Sub2) (((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859)).anInt3785;
		((Class130_Sub2) ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859).anInt3785 = i + 1 & 0x1fff;
		((Class130_Sub6) aClass130_Sub6_7103).aClass68_4838.method438(-126, this);
	}

	final void method2905(long l, int i) {
		aShort7104 -= i;
		if (aShort7104 <= 0)
			method2901();
		else {
			int i_17_ = ((Class130_Sub1_Sub1) this).anInt7037 >> Class93.anInt1225;
			int i_18_ = ((Class130_Sub1_Sub1) this).anInt7048 >> Class93.anInt1225;
			int i_19_ = ((Class130_Sub1_Sub1) this).anInt7044 >> Class93.anInt1225;
			Class130_Sub2 class130_sub2 = ((Class130_Sub6) aClass130_Sub6_7103).aClass130_Sub2_4859;
			Class104 class104 = ((Class130_Sub6) aClass130_Sub6_7103).aClass104_4856;
			if (((Class104) class104).anInt1392 != 0) {
				if (aShort7100 - aShort7104 <= ((Class104) class104).anInt1411) {
					int i_20_ = ((((Class130_Sub1_Sub1) this).anInt7043 >> 8 & 0xff00) + (anInt7096 >> 16 & 0xff) + ((Class104) class104).anInt1421 * i);
					int i_21_ = ((((Class130_Sub1_Sub1) this).anInt7043 & 0xff00) + (anInt7096 >> 8 & 0xff) + ((Class104) class104).f_gb * i);
					int i_22_ = ((((Class130_Sub1_Sub1) this).anInt7043 << 8 & 0xff00) + (anInt7096 & 0xff) + ((Class104) class104).anInt1388 * i);
					if (i_20_ < 0)
						i_20_ = 0;
					else if (i_20_ > 65535)
						i_20_ = 65535;
					if (i_21_ < 0)
						i_21_ = 0;
					else if (i_21_ > 65535)
						i_21_ = 65535;
					if (i_22_ < 0)
						i_22_ = 0;
					else if (i_22_ > 65535)
						i_22_ = 65535;
					((Class130_Sub1_Sub1) this).anInt7043 &= ~0xffffff;
					((Class130_Sub1_Sub1) this).anInt7043 |= (((i_20_ & 0xff00) << 8) + (i_21_ & 0xff00) + ((i_22_ & 0xff00) >> 8));
					anInt7096 &= ~0xffffff;
					anInt7096 |= (((i_20_ & 0xff) << 16) + ((i_21_ & 0xff) << 8) + (i_22_ & 0xff));
				}
				if (aShort7100 - aShort7104 <= ((Class104) class104).anInt1389) {
					int i_23_ = ((((Class130_Sub1_Sub1) this).anInt7043 >> 16 & 0xff00) + (anInt7096 >> 24 & 0xff) + ((Class104) class104).f_qb * i);
					if (i_23_ < 0)
						i_23_ = 0;
					else if (i_23_ > 65535)
						i_23_ = 65535;
					((Class130_Sub1_Sub1) this).anInt7043 &= 0xffffff;
					((Class130_Sub1_Sub1) this).anInt7043 |= (i_23_ & 0xff00) << 16;
					anInt7096 &= 0xffffff;
					anInt7096 |= (i_23_ & 0xff) << 24;
				}
			}
			if (((Class104) class104).anInt1410 != -1 && aShort7100 - aShort7104 <= ((Class104) class104).f_ob)
				anInt7097 += ((Class104) class104).anInt1408 * i;
			if (((Class104) class104).anInt1426 != -1 && aShort7100 - aShort7104 <= ((Class104) class104).anInt1424)
				((Class130_Sub1_Sub1) this).anInt7038 += ((Class104) class104).anInt1405 * i;
			int i_24_ = aShort7102;
			int i_25_ = aShort7098;
			int i_26_ = aShort7099;
			boolean bool = false;
			if (((Class104) class104).anInt1406 == 1) {
				int i_27_ = i_17_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4832;
				int i_28_ = i_18_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4858;
				int i_29_ = i_19_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4860;
				int i_30_ = (int) Math.sqrt((double) (i_27_ * i_27_ + i_28_ * i_28_ + i_29_ * i_29_));
				long l_31_ = (long) (((Class104) class104).f_db * i_30_ * i);
				anInt7097 -= (long) anInt7097 * l_31_ >> 18;
			} else if (((Class104) class104).anInt1406 == 2) {
				int i_32_ = i_17_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4832;
				int i_33_ = i_18_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4858;
				int i_34_ = i_19_ - ((Class130_Sub6) aClass130_Sub6_7103).anInt4860;
				int i_35_ = i_32_ * i_32_ + i_33_ * i_33_ + i_34_ * i_34_;
				long l_36_ = (long) (((Class104) class104).f_db * i_35_ * i);
				anInt7097 -= (long) anInt7097 * l_36_ >> 28;
			}
			if (((Class104) class104).anIntArray1386 != null) {
				Node class246 = (((Class166) ((Class130_Sub2) class130_sub2).aClass166_3791).aClass246_2343);
				for (Node class246_37_ = ((Node) class246).next; class246_37_ != class246; class246_37_ = ((Node) class246_37_).next) {
					Class246_Sub1_Sub11 class246_sub1_sub11 = (Class246_Sub1_Sub11) class246_37_;
					Class4 class4 = (((Class246_Sub1_Sub11) class246_sub1_sub11).aClass4_6237);
					if (((Class4) class4).anInt36 != 1) {
						boolean bool_38_ = false;
						for (int i_39_ = 0; (i_39_ < ((Class104) class104).anIntArray1386.length); i_39_++) {
							if (((Class104) class104).anIntArray1386[i_39_] == ((Class4) class4).anInt46) {
								bool_38_ = true;
								break;
							}
						}
						if (bool_38_) {
							int i_40_ = i_17_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6240;
							int i_41_ = i_18_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6242;
							int i_42_ = i_19_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6247;
							long l_43_ = (long) (i_40_ * i_40_ + i_41_ * i_41_ + i_42_ * i_42_);
							if (l_43_ <= ((Class4) class4).aLong35) {
								int i_44_ = (int) Math.sqrt((double) l_43_);
								if (i_44_ == 0)
									i_44_ = 1;
								long l_45_ = ((long) (i_40_ * (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238) + (i_41_ * ((Class4) class4).anInt40) + (i_42_ * (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241))) * 65535L / (long) (((Class4) class4).anInt33 * i_44_));
								if (l_45_ >= (long) ((Class4) class4).anInt39) {
									int i_46_ = 0;
									if (((Class4) class4).anInt49 == 1)
										i_46_ = ((i_44_ >> 4) * ((Class4) class4).anInt47);
									else if (((Class4) class4).anInt49 == 2)
										i_46_ = ((i_44_ >> 4) * (i_44_ >> 4) * ((Class4) class4).anInt47);
									if (((Class4) class4).anInt38 == 0) {
										if (((Class4) class4).anInt42 == 0) {
											i_24_ += ((((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238) - i_46_) * i;
											i_25_ += (((Class4) class4).anInt40 - i_46_) * i;
											i_26_ += ((((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241) - i_46_) * i;
											bool = true;
										} else {
											((Class130_Sub1_Sub1) this).anInt7037 += ((((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238) - i_46_) * i;
											((Class130_Sub1_Sub1) this).anInt7048 += (((Class4) class4).anInt40 - i_46_) * i;
											((Class130_Sub1_Sub1) this).anInt7044 += ((((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241) - i_46_) * i;
										}
									} else {
										int i_47_ = ((i_40_ << 15) / i_44_ * ((Class4) class4).anInt33);
										int i_48_ = ((i_41_ << 15) / i_44_ * ((Class4) class4).anInt33);
										int i_49_ = ((i_42_ << 15) / i_44_ * ((Class4) class4).anInt33);
										if (((Class4) class4).anInt42 == 0) {
											i_24_ += i_47_ * i >> 15;
											i_25_ += i_48_ * i >> 15;
											i_26_ += i_49_ * i >> 15;
											bool = true;
										} else {
											((Class130_Sub1_Sub1) this).anInt7037 += i_47_ * i >> 15;
											((Class130_Sub1_Sub1) this).anInt7048 += i_48_ * i >> 15;
											((Class130_Sub1_Sub1) this).anInt7044 += i_49_ * i >> 15;
										}
									}
								}
							}
						}
					}
				}
			}
			if (((Class104) class104).anIntArray1378 != null) {
				for (int i_50_ = 0; i_50_ < ((Class104) class104).anIntArray1378.length; i_50_++) {
					Class246_Sub1_Sub11 class246_sub1_sub11 = ((Class246_Sub1_Sub11) (Class90.aClass83_1170.method529((long) (((Class104) class104).anIntArray1378[i_50_]), -13373)));
					while (class246_sub1_sub11 != null) {
						Class4 class4 = (((Class246_Sub1_Sub11) class246_sub1_sub11).aClass4_6237);
						int i_51_ = i_17_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6240;
						int i_52_ = i_18_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6242;
						int i_53_ = i_19_ - ((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6247;
						long l_54_ = (long) (i_51_ * i_51_ + i_52_ * i_52_ + i_53_ * i_53_);
						if (l_54_ > ((Class4) class4).aLong35)
							class246_sub1_sub11 = ((Class246_Sub1_Sub11) Class90.aClass83_1170.method528(true));
						else {
							int i_55_ = (int) Math.sqrt((double) l_54_);
							if (i_55_ == 0)
								i_55_ = 1;
							long l_56_ = ((long) (i_51_ * (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238) + i_52_ * ((Class4) class4).anInt40 + i_53_ * (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241)) * 65535L / (long) (((Class4) class4).anInt33 * i_55_));
							if (l_56_ < (long) ((Class4) class4).anInt39)
								class246_sub1_sub11 = ((Class246_Sub1_Sub11) Class90.aClass83_1170.method528(true));
							else {
								int i_57_ = 0;
								if (((Class4) class4).anInt49 == 1)
									i_57_ = ((i_55_ >> 4) * ((Class4) class4).anInt47);
								else if (((Class4) class4).anInt49 == 2)
									i_57_ = ((i_55_ >> 4) * (i_55_ >> 4) * ((Class4) class4).anInt47);
								if (((Class4) class4).anInt38 == 0) {
									if (((Class4) class4).anInt42 == 0) {
										i_24_ += (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238 - i_57_) * i;
										i_25_ += (((Class4) class4).anInt40 - i_57_) * i;
										i_26_ += (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241 - i_57_) * i;
										bool = true;
									} else {
										((Class130_Sub1_Sub1) this).anInt7037 += (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6238 - i_57_) * i;
										((Class130_Sub1_Sub1) this).anInt7048 += (((Class4) class4).anInt40 - i_57_) * i;
										((Class130_Sub1_Sub1) this).anInt7044 += (((Class246_Sub1_Sub11) class246_sub1_sub11).anInt6241 - i_57_) * i;
									}
								} else {
									int i_58_ = ((i_51_ << 15) / i_55_ * ((Class4) class4).anInt33);
									int i_59_ = ((i_52_ << 15) / i_55_ * ((Class4) class4).anInt33);
									int i_60_ = ((i_53_ << 15) / i_55_ * ((Class4) class4).anInt33);
									if (((Class4) class4).anInt42 == 0) {
										i_24_ += i_58_ * i >> 15;
										i_25_ += i_59_ * i >> 15;
										i_26_ += i_60_ * i >> 15;
										bool = true;
									} else {
										((Class130_Sub1_Sub1) this).anInt7037 += i_58_ * i >> 15;
										((Class130_Sub1_Sub1) this).anInt7048 += i_59_ * i >> 15;
										((Class130_Sub1_Sub1) this).anInt7044 += i_60_ * i >> 15;
									}
								}
								class246_sub1_sub11 = ((Class246_Sub1_Sub11) Class90.aClass83_1170.method528(true));
							}
						}
					}
				}
			}
			if (((Class104) class104).anIntArray1399 != null) {
				if (((Class104) class104).anIntArray1423 == null) {
					((Class104) class104).anIntArray1423 = new int[((Class104) class104).anIntArray1399.length];
					for (int i_61_ = 0; i_61_ < ((Class104) class104).anIntArray1399.length; i_61_++) {
						Class59_Sub1_Sub1.method2541(0, (((Class104) class104).anIntArray1399[i_61_]));
						((Class104) class104).anIntArray1423[i_61_] = ((IntegerNode) (IntegerNode) (Class246_Sub2.aClass85_3813.method544((long) (((Class104) class104).anIntArray1399[i_61_]), 123))).value;
					}
				}
				for (int i_62_ = 0; i_62_ < ((Class104) class104).anIntArray1423.length; i_62_++) {
					Class4 class4 = (Class220.aClass4Array3057[((Class104) class104).anIntArray1423[i_62_]]);
					if (((Class4) class4).anInt42 == 0) {
						i_24_ += ((Class4) class4).anInt44 * i;
						i_25_ += ((Class4) class4).anInt40 * i;
						i_26_ += ((Class4) class4).anInt48 * i;
						bool = true;
					} else {
						((Class130_Sub1_Sub1) this).anInt7037 += ((Class4) class4).anInt44 * i;
						((Class130_Sub1_Sub1) this).anInt7048 += ((Class4) class4).anInt40 * i;
						((Class130_Sub1_Sub1) this).anInt7044 += ((Class4) class4).anInt48 * i;
					}
				}
			}
			if (bool) {
				while (i_24_ > 32767 || i_25_ > 32767 || i_26_ > 32767 || i_24_ < -32767 || i_25_ < -32767 || i_26_ < -32767) {
					i_24_ >>= 1;
					i_25_ >>= 1;
					i_26_ >>= 1;
					anInt7097 <<= 1;
				}
				aShort7102 = (short) i_24_;
				aShort7098 = (short) i_25_;
				aShort7099 = (short) i_26_;
			}
			((Class130_Sub1_Sub1) this).anInt7037 += ((long) aShort7102 * (long) anInt7097 >> 23) * (long) i;
			((Class130_Sub1_Sub1) this).anInt7048 += ((long) aShort7098 * (long) anInt7097 >> 23) * (long) i;
			((Class130_Sub1_Sub1) this).anInt7044 += ((long) aShort7099 * (long) anInt7097 >> 23) * (long) i;
		}
	}

	Class130_Sub1_Sub1_Sub1(Class130_Sub6 class130_sub6, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, boolean bool, boolean bool_73_) {
		aClass130_Sub6_7103 = class130_sub6;
		((Class130_Sub1_Sub1) this).anInt7037 = i << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7048 = i_63_ << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7044 = i_64_ << Class93.anInt1225;
		((Class130_Sub1_Sub1) this).anInt7043 = i_70_;
		aShort7100 = aShort7104 = (short) i_69_;
		((Class130_Sub1_Sub1) this).anInt7038 = i_71_;
		((Class130_Sub1_Sub1) this).anInt7049 = i_72_;
		((Class130_Sub1_Sub1) this).aBool7040 = bool_73_;
		aShort7102 = (short) i_65_;
		aShort7098 = (short) i_66_;
		aShort7099 = (short) i_67_;
		anInt7097 = i_68_;
		((Class130_Sub1_Sub1) this).aByte7041 = (((Class19) ((Class130_Sub6) aClass130_Sub6_7103).aClass19_4852).aByte311);
		method2904();
	}
}
