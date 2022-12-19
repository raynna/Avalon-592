/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	Node aClass246_2343 = new Node();
	static Class_fs aClass_fs2344;
	static int[] anIntArray2345;
	static int anInt2346;
	static Class29[] aClass29Array2347 = new Class29[8];
	static int anInt2348;
	static int anInt2349;
	static int anInt2350;
	static int anInt2351;
	static int anInt2352;
	static int anInt2353;
	static int[] anIntArray2354 = new int[2];
	static int anInt2355;
	static int anInt2356;
	static boolean aBool2357;
	static int anInt2358;
	static int anInt2359;
	private Node aClass246_2360;
	static int anInt2361;
	static int anInt2362;
	static int anInt2363;
	static int anInt2364;
	static Class240[] aClass240Array2365;
	static int anInt2366;

	final void method1097(int i, Node class246) {
		try {
			if (((Node) class246).prev != null)
				class246.unlink((byte) -83);
			if (i != 1245184)
				method1097(17, null);
			anInt2351++;
			((Node) class246).next = ((Node) ((Class166) this).aClass246_2343).next;
			((Node) class246).prev = ((Class166) this).aClass246_2343;
			((Node) ((Node) class246).prev).next = class246;
			((Node) ((Node) class246).next).prev = class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pk.A(" + i + ',' + (class246 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1098(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt2366++;
			Class195.method1276(!bool, i_0_);
			int i_5_ = 0;
			int i_6_ = i_0_ - i_2_;
			if ((i_6_ ^ 0xffffffff) > -1)
				i_6_ = 0;
			int i_7_ = i_0_;
			int i_8_ = -i_0_;
			int i_9_ = i_6_;
			int i_10_ = -i_6_;
			int i_11_ = -1;
			int i_12_ = -1;
			int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_4_];
			int i_13_ = -i_6_ + i_1_;
			Class135.method918(-i_0_ + i_1_, -112, i, i_13_, is);
			if (bool == true) {
				int i_14_ = i_1_ + i_6_;
				Class135.method918(i_13_, 125, i_3_, i_14_, is);
				Class135.method918(i_14_, -89, i, i_0_ + i_1_, is);
				while ((i_7_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
					i_11_ += 2;
					i_12_ += 2;
					i_8_ += i_11_;
					i_10_ += i_12_;
					if ((i_10_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) <= -2) {
						Class120.anIntArray1649[i_9_] = i_5_;
						i_9_--;
						i_10_ -= i_9_ << 1;
					}
					i_5_++;
					if ((i_8_ ^ 0xffffffff) <= -1) {
						i_7_--;
						i_8_ -= i_7_ << 1;
						if (i_7_ < i_6_) {
							int[] is_15_ = (Class246_Sub28_Sub6.anIntArrayArray6042[i_7_ + i_4_]);
							int[] is_16_ = (Class246_Sub28_Sub6.anIntArrayArray6042[-i_7_ + i_4_]);
							int i_17_ = Class120.anIntArray1649[i_7_];
							int i_18_ = i_5_ + i_1_;
							int i_19_ = i_1_ + -i_5_;
							int i_20_ = i_17_ + i_1_;
							int i_21_ = i_1_ + -i_17_;
							Class135.method918(i_19_, 118, i, i_21_, is_15_);
							Class135.method918(i_21_, -127, i_3_, i_20_, is_15_);
							Class135.method918(i_20_, -37, i, i_18_, is_15_);
							Class135.method918(i_19_, 123, i, i_21_, is_16_);
							Class135.method918(i_21_, 124, i_3_, i_20_, is_16_);
							Class135.method918(i_20_, -62, i, i_18_, is_16_);
						} else {
							int[] is_22_ = (Class246_Sub28_Sub6.anIntArrayArray6042[i_7_ + i_4_]);
							int[] is_23_ = (Class246_Sub28_Sub6.anIntArrayArray6042[-i_7_ + i_4_]);
							int i_24_ = i_1_ + i_5_;
							int i_25_ = i_1_ + -i_5_;
							Class135.method918(i_25_, 119, i, i_24_, is_22_);
							Class135.method918(i_25_, -8, i, i_24_, is_23_);
						}
					}
					int[] is_26_ = (Class246_Sub28_Sub6.anIntArrayArray6042[i_4_ - -i_5_]);
					int[] is_27_ = (Class246_Sub28_Sub6.anIntArrayArray6042[-i_5_ + i_4_]);
					int i_28_ = i_7_ + i_1_;
					int i_29_ = -i_7_ + i_1_;
					if (i_6_ <= i_5_) {
						Class135.method918(i_29_, 123, i, i_28_, is_26_);
						Class135.method918(i_29_, -117, i, i_28_, is_27_);
					} else {
						int i_30_ = (i_9_ >= i_5_ ? i_9_ : Class120.anIntArray1649[i_5_]);
						int i_31_ = i_1_ - -i_30_;
						int i_32_ = i_1_ - i_30_;
						Class135.method918(i_29_, -68, i, i_32_, is_26_);
						Class135.method918(i_32_, -24, i_3_, i_31_, is_26_);
						Class135.method918(i_31_, 118, i, i_28_, is_26_);
						Class135.method918(i_29_, 118, i, i_32_, is_27_);
						Class135.method918(i_32_, -74, i_3_, i_31_, is_27_);
						Class135.method918(i_31_, -63, i, i_28_, is_27_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pk.K(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final boolean method1099(int i, boolean bool, int i_33_, int i_34_, int i_35_, Class147[][][] class147s) {
		try {
			anInt2364++;
			byte i_36_ = bool ? (byte) 1 : (byte) (0xff & Class64_Sub1.anInt5236);
			if (i_36_ == (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i][i_34_]))
				return false;
			if ((0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i][i_34_])) == 0)
				return false;
			int i_37_ = 0;
			int i_38_ = 0;
			if (i_33_ != 32582)
				method1107((byte) -60);
			Class64.anIntArray858[i_37_] = i;
			Class230.anIntArray3151[i_37_++] = i_34_;
			Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i][i_34_] = i_36_;
			while ((i_37_ ^ 0xffffffff) != (i_38_ ^ 0xffffffff)) {
				int i_39_ = Class64.anIntArray858[i_38_] & 0xffff;
				int i_40_ = Class64.anIntArray858[i_38_] >> 16 & 0xff;
				int i_41_ = 0xff & Class64.anIntArray858[i_38_] >> 24;
				int i_42_ = Class230.anIntArray3151[i_38_] & 0xffff;
				int i_43_ = 0xff & Class230.anIntArray3151[i_38_] >> 16;
				i_38_ = 1 + i_38_ & 0xfff;
				boolean bool_44_ = false;
				if (((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_]) & 0x4) == 0)
					bool_44_ = true;
				boolean bool_45_ = false;
				while_172_: for (int i_46_ = Class246_Sub28_Sub24.anInt6681 + 1; (i_46_ ^ 0xffffffff) >= -4; i_46_++) {
					if ((0x8 & (Class45.aByteArrayArrayArray648[i_46_][i_39_][i_42_]) ^ 0xffffffff) == -1) {
						if (bool_44_ && class147s[i_46_][i_39_][i_42_] != null) {
							if ((((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2172) != null) {
								int i_47_ = Class142.method959(i_40_, 20268);
								if (i_47_ == ((Class59_Sub4) (((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2172)).anInt5185 || ((((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2152) != null && ((((Class59_Sub4) (((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2152)).anInt5185 ^ 0xffffffff) == (i_47_ ^ 0xffffffff))))
									continue;
								if (i_41_ != 0) {
									int i_48_ = Class142.method959(i_41_, i_33_ - 12314);
									if ((((Class59_Sub4) (((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2172)).anInt5185 ^ 0xffffffff) == (i_48_ ^ 0xffffffff) || ((((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2152) != null && (((Class59_Sub4) (((Class147) (class147s[i_46_][i_39_][i_42_])).aClass59_Sub4_2152)).anInt5185) == i_48_))
										continue;
								}
								if ((i_43_ ^ 0xffffffff) != -1) {
									int i_49_ = Class142.method959(i_43_, 20268);
									if (((i_49_ ^ 0xffffffff) == (((Class59_Sub4) (((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2172)).anInt5185 ^ 0xffffffff)) || ((((Class147) class147s[i_46_][i_39_][i_42_]).aClass59_Sub4_2152) != null && (i_49_ == (((Class59_Sub4) (((Class147) (class147s[i_46_][i_39_][i_42_])).aClass59_Sub4_2152)).anInt5185))))
										continue;
								}
							}
							Class147 class147 = class147s[i_46_][i_39_][i_42_];
							if (((Class147) class147).aClass3_2160 != null) {
								for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
									Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
									if (class59_sub3 instanceof Class_f) {
										Class_f class_f = (Class_f) class59_sub3;
										int i_50_ = class_f.method24(-75);
										int i_51_ = class_f.method18((byte) -70);
										if (i_50_ == 21)
											i_50_ = 19;
										int i_52_ = i_50_ | i_51_ << 6;
										if (i_52_ == i_40_ || (i_41_ != 0 && ((i_41_ ^ 0xffffffff) == (i_52_ ^ 0xffffffff))) || (i_43_ != 0 && ((i_52_ ^ 0xffffffff) == (i_43_ ^ 0xffffffff))))
											continue while_172_;
									}
								}
							}
						}
						Class147 class147 = class147s[i_46_][i_39_][i_42_];
						if (class147 != null && ((Class147) class147).aClass3_2160 != null) {
							for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
								Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
								if ((((Class59_Sub3) class59_sub3).aShort5057 != (((Class59_Sub3) class59_sub3).aShort5065)) || ((((Class59_Sub3) class59_sub3).aShort5064) != (((Class59_Sub3) class59_sub3).aShort5062))) {
									for (int i_53_ = ((Class59_Sub3) class59_sub3).aShort5057; (i_53_ <= (((Class59_Sub3) class59_sub3).aShort5065)); i_53_++) {
										for (int i_54_ = (((Class59_Sub3) class59_sub3).aShort5064); ((i_54_ ^ 0xffffffff) >= (((Class59_Sub3) class59_sub3).aShort5062 ^ 0xffffffff)); i_54_++)
											Class5.aByteArrayArrayArray56[i_46_][i_53_][i_54_] = i_36_;
									}
								}
							}
						}
						bool_45_ = true;
						Class5.aByteArrayArrayArray56[i_46_][i_39_][i_42_] = i_36_;
					}
				}
				if (bool_45_) {
					int i_55_ = Class59_Sub3_Sub4.aClass210Array6993[1 + Class246_Sub28_Sub24.anInt6681].l(i_39_, i_42_);
					if (anIntArray2354[i_35_] < i_55_)
						anIntArray2354[i_35_] = i_55_;
					int i_56_ = i_39_ << 7;
					if ((Class246_Sub1_Sub3.anIntArray5715[i_35_] ^ 0xffffffff) < (i_56_ ^ 0xffffffff))
						Class246_Sub1_Sub3.anIntArray5715[i_35_] = i_56_;
					else if ((Class254.anIntArray3625[i_35_] ^ 0xffffffff) > (i_56_ ^ 0xffffffff))
						Class254.anIntArray3625[i_35_] = i_56_;
					int i_57_ = i_42_ << 7;
					if ((Class29.anIntArray395[i_35_] ^ 0xffffffff) >= (i_57_ ^ 0xffffffff)) {
						if (Class173.anIntArray2442[i_35_] < i_57_)
							Class173.anIntArray2442[i_35_] = i_57_;
					} else
						Class29.anIntArray395[i_35_] = i_57_;
				}
				if (!bool_44_) {
					if (i_39_ >= 1 && (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ - 1][i_42_]) != i_36_) {
						Class64.anIntArray858[i_37_] = Class236.method1523(Class236.method1523((i_39_ - 1), 1179648), -754974720);
						Class230.anIntArray3151[i_37_] = Class236.method1523(i_42_, 1245184);
						i_37_ = i_37_ + 1 & 0xfff;
						Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ - 1][i_42_] = i_36_;
					}
					if ((++i_42_ ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff)) {
						if ((-1 + i_39_ ^ 0xffffffff) <= -1 && i_36_ != (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][-1 + i_39_][i_42_]) && (0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_]) ^ 0xffffffff) == -1 && ((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][-1 + i_39_][-1 + i_42_]) & 0x4 ^ 0xffffffff) == -1) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(Class236.method1523(1179648, i_39_ - 1), 1375731712));
							Class230.anIntArray3151[i_37_] = Class236.method1523(i_42_, 1245184);
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][-1 + i_39_][i_42_] = i_36_;
							i_37_ = 0xfff & 1 + i_37_;
						}
						if (i_36_ != (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_])) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(318767104, Class236.method1523(5373952, i_39_)));
							Class230.anIntArray3151[i_37_] = Class236.method1523(i_42_, 5439488);
							i_37_ = 1 + i_37_ & 0xfff;
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_] = i_36_;
						}
						if (Class38_Sub1_Sub1.anInt6770 > 1 + i_39_ && i_36_ != (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][1 + i_39_][i_42_]) && (0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_]) ^ 0xffffffff) == -1 && ((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][1 + i_39_][i_42_ - 1]) & 0x4) == 0) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(Class236.method1523(i_39_ + 1, 5373952), -1845493760));
							Class230.anIntArray3151[i_37_] = Class236.method1523(i_42_, 5439488);
							i_37_ = 0xfff & 1 + i_37_;
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][1 + i_39_][i_42_] = i_36_;
						}
					}
					i_42_--;
					if ((i_39_ + 1 ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) && i_36_ != (Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ + 1][i_42_])) {
						Class64.anIntArray858[i_37_] = (Class236.method1523(1392508928, Class236.method1523(1 + i_39_, 9568256)));
						Class230.anIntArray3151[i_37_] = Class236.method1523(9633792, i_42_);
						Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ + 1][i_42_] = i_36_;
						i_37_ = 0xfff & i_37_ + 1;
					}
					if (--i_42_ >= 0) {
						if ((-1 + i_39_ ^ 0xffffffff) <= -1 && ((i_36_ ^ 0xffffffff) != ((Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ - 1][i_42_]) ^ 0xffffffff)) && (0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_]) ^ 0xffffffff) == -1 && (0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][-1 + i_39_][i_42_ + 1]) ^ 0xffffffff) == -1) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(301989888, Class236.method1523(13762560, -1 + i_39_)));
							Class230.anIntArray3151[i_37_] = Class236.method1523(13828096, i_42_);
							i_37_ = 0xfff & 1 + i_37_;
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][-1 + i_39_][i_42_] = i_36_;
						}
						if ((Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_]) != i_36_) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(Class236.method1523(i_39_, 13762560), -1828716544));
							Class230.anIntArray3151[i_37_] = Class236.method1523(13828096, i_42_);
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_] = i_36_;
							i_37_ = 0xfff & 1 + i_37_;
						}
						if (i_39_ + 1 < Class38_Sub1_Sub1.anInt6770 && ((i_36_ ^ 0xffffffff) != ((Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ + 1][i_42_]) ^ 0xffffffff)) && (0x4 & (Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_][i_42_])) == 0 && ((Class45.aByteArrayArrayArray648[Class246_Sub28_Sub24.anInt6681][i_39_ + 1][i_42_ + 1]) & 0x4) == 0) {
							Class64.anIntArray858[i_37_] = (Class236.method1523(-771751936, Class236.method1523(9568256, i_39_ + 1)));
							Class230.anIntArray3151[i_37_] = Class236.method1523(9633792, i_42_);
							i_37_ = 0xfff & i_37_ + 1;
							Class5.aByteArrayArrayArray56[Class246_Sub28_Sub24.anInt6681][i_39_ + 1][i_42_] = i_36_;
						}
					}
				}
			}
			if ((anIntArray2354[i_35_] ^ 0xffffffff) != 999999) {
				anIntArray2354[i_35_] += 10;
				Class246_Sub1_Sub3.anIntArray5715[i_35_] -= 50;
				Class254.anIntArray3625[i_35_] += 50;
				Class173.anIntArray2442[i_35_] += 50;
				Class29.anIntArray395[i_35_] -= 50;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pk.P(" + i + ',' + bool + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + (class147s != null ? "{...}" : "null") + ')'));
		}
	}

	final Node method1100(int i) {
		try {
			anInt2349++;
			Node class246 = ((Node) ((Class166) this).aClass246_2343).next;
			if (((Class166) this).aClass246_2343 == class246)
				return null;
			if (i != 4095)
				anIntArray2345 = null;
			class246.unlink((byte) 96);
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.F(" + i + ')');
		}
	}

	final void method1101(boolean bool, Node class246) {
		try {
			anInt2362++;
			if (((Node) class246).prev != null)
				class246.unlink((byte) -110);
			((Node) class246).next = ((Class166) this).aClass246_2343;
			((Node) class246).prev = ((Node) ((Class166) this).aClass246_2343).prev;
			if (bool != false)
				aBool2357 = true;
			((Node) ((Node) class246).prev).next = class246;
			((Node) ((Node) class246).next).prev = class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("pk.B(" + bool + ',' + (class246 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1102(int i) {
		do {
			try {
				for (;;) {
					Node class246 = (((Node) ((Class166) this).aClass246_2343).next);
					if (((Class166) this).aClass246_2343 == class246)
						break;
					class246.unlink((byte) -100);
				}
				anInt2359++;
				aClass246_2360 = null;
				if (i <= -48)
					break;
				anIntArray2345 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "pk.O(" + i + ')');
			}
			break;
		} while (false);
	}

	final Node method1103(int i) {
		try {
			if (i > -17)
				return null;
			anInt2348++;
			Node class246 = ((Node) ((Class166) this).aClass246_2343).prev;
			if (((Class166) this).aClass246_2343 == class246) {
				aClass246_2360 = null;
				return null;
			}
			aClass246_2360 = ((Node) class246).prev;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.G(" + i + ')');
		}
	}

	final Node method1104(int i) {
		try {
			anInt2350++;
			if (i < 36)
				return null;
			Node class246 = ((Node) ((Class166) this).aClass246_2343).next;
			if (((Class166) this).aClass246_2343 == class246) {
				aClass246_2360 = null;
				return null;
			}
			aClass246_2360 = ((Node) class246).next;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.I(" + i + ')');
		}
	}

	private final void method1105(Node class246, boolean bool, Class166 class166_58_) {
		do {
			try {
				anInt2356++;
				Node class246_59_ = (((Node) ((Class166) this).aClass246_2343).prev);
				((Node) ((Class166) this).aClass246_2343).prev = ((Node) class246).prev;
				((Node) ((Node) class246).prev).next = ((Class166) this).aClass246_2343;
				if (bool == false) {
					if (class246 == ((Class166) this).aClass246_2343)
						break;
					((Node) class246).prev = ((Node) (((Class166) class166_58_).aClass246_2343)).prev;
					((Node) ((Node) class246).prev).next = class246;
					((Node) ((Class166) class166_58_).aClass246_2343).prev = class246_59_;
					((Node) class246_59_).next = ((Class166) class166_58_).aClass246_2343;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("pk.J(" + (class246 != null ? "{...}" : "null") + ',' + bool + ',' + (class166_58_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final int method1106(int i, boolean bool) {
		try {
			anInt2361++;
			if (bool != false)
				anIntArray2345 = null;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.M(" + i + ',' + bool + ')');
		}
	}

	public static void method1107(byte i) {
		try {
			aClass240Array2365 = null;
			aClass_fs2344 = null;
			anIntArray2354 = null;
			if (i == -84) {
				anIntArray2345 = null;
				aClass29Array2347 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.H(" + i + ')');
		}
	}

	final Node method1108(byte i) {
		try {
			anInt2363++;
			Node class246 = aClass246_2360;
			if (((Class166) this).aClass246_2343 == class246) {
				aClass246_2360 = null;
				return null;
			}
			aClass246_2360 = ((Node) class246).next;
			if (i != -112)
				return null;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.N(" + i + ')');
		}
	}

	final Node method1109(byte i) {
		try {
			anInt2358++;
			Node class246 = aClass246_2360;
			if (((Class166) this).aClass246_2343 == class246) {
				aClass246_2360 = null;
				return null;
			}
			if (i != 32)
				method1098(false, 15, -117, -94, 3, -8, 22);
			aClass246_2360 = ((Node) class246).prev;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.Q(" + i + ')');
		}
	}

	public Class166() {
		try {
			((Node) ((Class166) this).aClass246_2343).prev = ((Class166) this).aClass246_2343;
			((Node) ((Class166) this).aClass246_2343).next = ((Class166) this).aClass246_2343;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.<init>(" + ')');
		}
	}

	static final void method1110(boolean bool) {
		try {
			anInt2355++;
			if (bool == true && (Class246_Sub1_Sub14.anInt6590 ^ 0xffffffff) == -6)
				Class246_Sub1_Sub14.anInt6590 = 6;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.E(" + bool + ')');
		}
	}

	final boolean method1111(byte i) {
		try {
			anInt2353++;
			if (i > -121)
				aBool2357 = true;
			if (((Node) ((Class166) this).aClass246_2343).next != ((Class166) this).aClass246_2343)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.L(" + i + ')');
		}
	}

	final int method1112(int i) {
		try {
			anInt2346++;
			int i_60_ = i;
			for (Node class246 = (((Node) ((Class166) this).aClass246_2343).next); ((Class166) this).aClass246_2343 != class246; class246 = ((Node) class246).next)
				i_60_++;
			return i_60_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.C(" + i + ')');
		}
	}

	final void method1113(Class166 class166_61_, byte i) {
		try {
			anInt2352++;
			if (i <= -70)
				method1105((((Node) ((Class166) this).aClass246_2343).next), false, class166_61_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "pk.D(" + (class166_61_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		anIntArray2345 = new int[] { 1, 2, 4, 8 };
		aClass240Array2365 = new Class240[2048];
		aBool2357 = false;
	}
}
