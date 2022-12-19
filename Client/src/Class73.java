/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 {
	static int anInt945;
	int anInt946;
	static int anInt947;
	static int anInt948;
	static int anInt949;
	static int anInt950;
	int anInt951;
	static int anInt952;
	private byte[][] aByteArrayArray953;
	static int anInt954;
	int anInt955;
	static int anInt956;
	static int anInt957;
	private byte[] aByteArray958;
	static Class67 aClass67_959 = new Class67("Cancel", "Abbrechen", "Annuler", "Cancelar");
	static int anInt960;
	static int anInt961;
	static Class5[] aClass5Array962;

	final int method458(Class_l[] class_ls, int[] is, byte i, String[] strings, String string) {
		try {
			anInt960++;
			if (string == null)
				return 0;
			int i_0_ = 0;
			int i_1_ = 0;
			if (i >= -2)
				method463(73, -43, 81);
			int i_2_ = -1;
			int i_3_ = 0;
			int i_4_ = 0;
			int i_5_ = -1;
			int i_6_ = -1;
			int i_7_ = 0;
			int i_8_ = string.length();
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++) {
				int i_10_ = 0xff & Class246_Sub1_Sub10.method2601(true, string.charAt(i_9_));
				int i_11_ = 0;
				if ((i_10_ ^ 0xffffffff) == -61)
					i_5_ = i_9_;
				else {
					int i_12_;
					if ((i_5_ ^ 0xffffffff) == 0) {
						i_11_ += method462(22148, i_10_);
						i_12_ = i_9_;
						if (aByteArrayArray953 != null && i_6_ != -1)
							i_11_ += aByteArrayArray953[i_6_][i_10_];
						i_6_ = i_10_;
					} else {
						if (i_10_ != 62)
							continue;
						i_12_ = i_5_;
						String string_13_ = string.substring(1 + i_5_, i_9_);
						i_5_ = -1;
						if (!string_13_.equals("br")) {
							if (!string_13_.equals("lt")) {
								if (!string_13_.equals("gt")) {
									if (!string_13_.equals("nbsp")) {
										if (string_13_.equals("shy")) {
											i_11_ += method462(22148, 173);
											if (aByteArrayArray953 != null && i_6_ != -1)
												i_11_ += (aByteArrayArray953[i_6_][173]);
											i_6_ = 173;
										} else if (string_13_.equals("times")) {
											i_11_ += method462(22148, 215);
											if (aByteArrayArray953 != null && i_6_ != -1)
												i_11_ += (aByteArrayArray953[i_6_][215]);
											i_6_ = 215;
										} else if (string_13_.equals("euro")) {
											i_11_ += method462(22148, 8364);
											if (aByteArrayArray953 != null && i_6_ != -1)
												i_11_ += (aByteArrayArray953[i_6_][8364]);
											i_6_ = 8364;
										} else if (string_13_.equals("copy")) {
											i_11_ += method462(22148, 169);
											if (aByteArrayArray953 != null && (i_6_ ^ 0xffffffff) != 0)
												i_11_ += (aByteArrayArray953[i_6_][169]);
											i_6_ = 169;
										} else if (string_13_.equals("reg")) {
											i_11_ += method462(22148, 174);
											if (aByteArrayArray953 != null && i_6_ != -1)
												i_11_ += (aByteArrayArray953[i_6_][174]);
											i_6_ = 174;
										} else if (string_13_.startsWith("img=") && class_ls != null) {
											try {
												int i_14_ = (Class104.method665(string_13_.substring(4), 10));
												i_6_ = -1;
												i_11_ += class_ls[i_14_].j();
											} catch (Exception exception) {
												/* empty */
											}
										}
									} else {
										i_11_ += method462(22148, 160);
										if (aByteArrayArray953 != null && i_6_ != -1)
											i_11_ += (aByteArrayArray953[i_6_][160]);
										i_6_ = 160;
									}
								} else {
									i_11_ += method462(22148, 62);
									if (aByteArrayArray953 != null && i_6_ != -1)
										i_11_ += aByteArrayArray953[i_6_][62];
									i_6_ = 62;
								}
							} else {
								i_11_ += method462(22148, 60);
								if (aByteArrayArray953 != null && (i_6_ ^ 0xffffffff) != 0)
									i_11_ += aByteArrayArray953[i_6_][60];
								i_6_ = 60;
							}
						} else {
							strings[i_7_] = string.substring(i_1_, 1 + i_9_);
							if (++i_7_ >= strings.length)
								return 0;
							i_6_ = -1;
							i_2_ = -1;
							i_0_ = 0;
							i_1_ = 1 + i_9_;
							continue;
						}
						i_10_ = -1;
					}
					if ((i_11_ ^ 0xffffffff) < -1) {
						i_0_ += i_11_;
						if (is != null) {
							if ((i_10_ ^ 0xffffffff) == -33) {
								i_2_ = i_9_;
								i_3_ = i_0_;
								i_4_ = 1;
							}
							if ((is[((i_7_ ^ 0xffffffff) > (is.length ^ 0xffffffff) ? i_7_ : is.length - 1)] ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
								if (i_2_ >= 0) {
									strings[i_7_] = string.substring(i_1_, -i_4_ + (1 + i_2_));
									i_7_++;
									if ((strings.length ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
										return 0;
									i_1_ = i_2_ + 1;
									i_6_ = -1;
									i_2_ = -1;
									i_0_ -= i_3_;
								} else {
									strings[i_7_] = string.substring(i_1_, i_12_);
									if ((++i_7_ ^ 0xffffffff) <= (strings.length ^ 0xffffffff))
										return 0;
									i_2_ = -1;
									i_0_ = i_11_;
									i_6_ = -1;
									i_1_ = i_12_;
								}
							}
							if ((i_10_ ^ 0xffffffff) == -46) {
								i_2_ = i_9_;
								i_3_ = i_0_;
								i_4_ = 0;
							}
						}
					}
				}
			}
			if (i_1_ < string.length()) {
				strings[i_7_] = string.substring(i_1_, string.length());
				i_7_++;
			}
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.G(" + (class_ls != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + (strings != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int method459(int i, String string) {
		try {
			if (i != -1)
				return 24;
			anInt954++;
			return method461(string, i + 110, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int method460(byte i, int i_15_, char c) {
		try {
			anInt947++;
			if (i > -50)
				anInt961 = -63;
			if (aByteArrayArray953 != null)
				return aByteArrayArray953[i_15_][c];
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.I(" + i + ',' + i_15_ + ',' + c + ')'));
		}
	}

	final int method461(String string, int i, Class_l[] class_ls) {
		try {
			anInt948++;
			if (string == null)
				return 0;
			int i_16_ = -1;
			int i_17_ = -1;
			int i_18_ = 0;
			int i_19_ = string.length();
			if (i <= 50)
				return 11;
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_20_++) {
				char c = string.charAt(i_20_);
				if ((c ^ 0xffffffff) == -61)
					i_16_ = i_20_;
				else {
					if (c == 62 && (i_16_ ^ 0xffffffff) != 0) {
						String string_21_ = string.substring(1 + i_16_, i_20_);
						i_16_ = -1;
						if (!string_21_.equals("lt")) {
							if (string_21_.equals("gt"))
								c = '>';
							else if (!string_21_.equals("nbsp")) {
								if (string_21_.equals("shy"))
									c = '\u00ad';
								else if (!string_21_.equals("times")) {
									if (!string_21_.equals("euro")) {
										if (string_21_.equals("copy"))
											c = '\u00a9';
										else if (string_21_.equals("reg"))
											c = '\u00ae';
										else {
											if (string_21_.startsWith("img=") && class_ls != null) {
												try {
													int i_22_ = (Class104.method665(string_21_.substring(4), 10));
													i_17_ = -1;
													i_18_ += class_ls[i_22_].j();
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
									} else
										c = '\u20ac';
								} else
									c = '\u00d7';
							} else
								c = '\u00a0';
						} else
							c = '<';
					}
					if (i_16_ == -1) {
						i_18_ += 0xff & (aByteArray958[0xff & Class246_Sub1_Sub10.method2601(true, c)]);
						if (aByteArrayArray953 != null && i_17_ != -1)
							i_18_ += aByteArrayArray953[i_17_][c];
						i_17_ = c;
					}
				}
			}
			return i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.F(" + (string != null ? "{...}" : "null") + ',' + i + ',' + (class_ls != null ? "{...}" : "null") + ')'));
		}
	}

	final int method462(int i, int i_23_) {
		try {
			if (i != 22148)
				method464(null, -76, 2, null, -22);
			anInt956++;
			return aByteArray958[i_23_] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gt.D(" + i + ',' + i_23_ + ')');
		}
	}

	static final Class59_Sub4 method463(int i, int i_24_, int i_25_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_24_][i_25_];
		if (class147 == null)
			return null;
		return ((Class147) class147).aClass59_Sub4_2152;
	}

	final int method464(String string, int i, int i_26_, Class_l[] class_ls, int i_27_) {
		try {
			anInt945++;
			if (i_26_ == (i_27_ ^ 0xffffffff))
				i_27_ = ((Class73) this).anInt955;
			int i_28_ = method458(class_ls, new int[] { i }, (byte) -52, Class171.aStringArray2426, string);
			int i_29_ = i_27_ * (-1 + i_28_);
			return (((Class73) this).anInt951 - (-i_29_ - ((Class73) this).anInt946));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.C(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_27_ + ')'));
		}
	}

	final String method465(int i, Class_l[] class_ls, String string, int i_30_) {
		try {
			anInt952++;
			if ((i_30_ ^ 0xffffffff) <= (method461(string, 60, class_ls) ^ 0xffffffff))
				return string;
			i_30_ -= method461("...", 93, null);
			int i_31_ = -1;
			int i_32_ = -1;
			int i_33_ = 0;
			int i_34_ = string.length();
			String string_35_ = "";
			for (int i_36_ = 0; (i_34_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++) {
				char c = string.charAt(i_36_);
				if ((c ^ 0xffffffff) == -61)
					i_31_ = i_36_;
				else {
					if (c == 62 && (i_31_ ^ 0xffffffff) != 0) {
						String string_37_ = string.substring(i_31_ + 1, i_36_);
						i_31_ = -1;
						if (string_37_.equals("lt"))
							c = '<';
						else if (!string_37_.equals("gt")) {
							if (string_37_.equals("nbsp"))
								c = '\u00a0';
							else if (string_37_.equals("shy"))
								c = '\u00ad';
							else if (!string_37_.equals("times")) {
								if (string_37_.equals("euro"))
									c = '\u20ac';
								else if (string_37_.equals("copy"))
									c = '\u00a9';
								else {
									if (!string_37_.equals("reg")) {
										if (string_37_.startsWith("img=") && class_ls != null) {
											try {
												int i_38_ = (Class104.method665(string_37_.substring(4), i ^ 0x20a6));
												i_33_ += class_ls[i_38_].j();
												i_32_ = -1;
												if ((i_30_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff))
													return string_35_ + "...";
												string_35_ = string.substring(0, (i_36_ + 1));
											} catch (Exception exception) {
												/* empty */
											}
										}
										continue;
									}
									c = '\u00ae';
								}
							} else
								c = '\u00d7';
						} else
							c = '>';
					}
					if (i_31_ == -1) {
						i_33_ += (aByteArray958[0xff & Class246_Sub1_Sub10.method2601(true, c)] & 0xff);
						if (aByteArrayArray953 != null && i_32_ != -1)
							i_33_ += aByteArrayArray953[i_32_][c];
						i_32_ = c;
						int i_39_ = i_33_;
						if (aByteArrayArray953 != null)
							i_39_ += aByteArrayArray953[c][46];
						if (i_30_ < i_39_)
							return string_35_ + "...";
						string_35_ = string.substring(0, 1 + i_36_);
					}
				}
			}
			if (i != 8364)
				method462(66, 61);
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.J(" + i + ',' + (class_ls != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i_30_ + ')'));
		}
	}

	final int method466(int i, Class_l[] class_ls, int i_40_, String string) {
		try {
			anInt949++;
			if (i < 59)
				aClass67_959 = null;
			return method458(class_ls, new int[] { i_40_ }, (byte) -10, Class171.aStringArray2426, string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.B(" + i + ',' + (class_ls != null ? "{...}" : "null") + ',' + i_40_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method467(int i) {
		try {
			aClass5Array962 = null;
			int i_41_ = -48 % ((-88 - i) / 37);
			aClass67_959 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gt.K(" + i + ')');
		}
	}

	final int method468(byte i, String string, int i_42_, Class_l[] class_ls) {
		try {
			anInt950++;
			int i_43_ = method458(class_ls, new int[] { i_42_ }, (byte) -76, Class171.aStringArray2426, string);
			int i_44_ = 0;
			int i_45_ = 0;
			int i_46_ = 52 % ((-40 - i) / 58);
			for (/**/; (i_43_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
				int i_47_ = method461(Class171.aStringArray2426[i_45_], 104, class_ls);
				if ((i_44_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff))
					i_44_ = i_47_;
			}
			return i_44_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gt.A(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_42_ + ',' + (class_ls != null ? "{...}" : "null") + ')'));
		}
	}

	Class73(byte[] is) {
		try {
			BufferStream stream = new BufferStream(is);
			int i = stream.readUnsignedByte(255);
			if (i != 0)
				throw new RuntimeException("");
			boolean bool = stream.readUnsignedByte(255) == 1;
			aByteArray958 = new byte[256];
			stream.readBytes((byte) 22, 256, 0, aByteArray958);
			if (bool) {
				int[] is_48_ = new int[256];
				for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -257; i_49_++)
					is_48_[i_49_] = stream.readUnsignedByte(255);
				int[] is_50_ = new int[256];
				for (int i_51_ = 0; i_51_ < 256; i_51_++)
					is_50_[i_51_] = stream.readUnsignedByte(255);
				byte[][] is_52_ = new byte[256][];
				for (int i_53_ = 0; i_53_ < 256; i_53_++) {
					is_52_[i_53_] = new byte[is_48_[i_53_]];
					byte i_54_ = 0;
					for (int i_55_ = 0; ((is_52_[i_53_].length ^ 0xffffffff) < (i_55_ ^ 0xffffffff)); i_55_++) {
						i_54_ += stream.readByte(false);
						is_52_[i_53_][i_55_] = i_54_;
					}
				}
				byte[][] is_56_ = new byte[256][];
				for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > -257; i_57_++) {
					is_56_[i_57_] = new byte[is_48_[i_57_]];
					byte i_58_ = 0;
					for (int i_59_ = 0; i_59_ < is_56_[i_57_].length; i_59_++) {
						i_58_ += stream.readByte(false);
						is_56_[i_57_][i_59_] = i_58_;
					}
				}
				aByteArrayArray953 = new byte[256][256];
				for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > -257; i_60_++) {
					if (i_60_ != 32 && i_60_ != 160) {
						for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > -257; i_61_++) {
							if (i_61_ != 32 && (i_61_ ^ 0xffffffff) != -161)
								aByteArrayArray953[i_60_][i_61_] = (byte) (Class59_Sub3.method2171(i_61_, (byte) -79, is_50_, is_56_, aByteArray958, i_60_, is_48_, is_52_));
						}
					}
				}
				((Class73) this).anInt955 = is_48_[32] + is_50_[32];
			} else
				((Class73) this).anInt955 = stream.readUnsignedByte(255);
			stream.readUnsignedByte(255);
			stream.readUnsignedByte(255);
			((Class73) this).anInt951 = stream.readUnsignedByte(255);
			((Class73) this).anInt946 = stream.readUnsignedByte(255);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gt.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}
}
