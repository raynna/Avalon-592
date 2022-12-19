/* Class_fs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_fs {
	static int anInt115;
	static int anInt116;
	private Object[][] anObjectArrayArray117;
	static int anInt118;
	static int anInt119;
	static int anInt120;
	static int anInt121;
	static int anInt122;
	static int anInt123;
	static int anInt124;
	static int anInt125;
	int anInt126;
	static int anInt127;
	static int anInt128;
	static int anInt129;
	static int anInt130;
	static int anInt131;
	static int anInt132;
	static int anInt133;
	static int anInt134;
	private boolean aBool135;
	static int anInt136;
	static int anInt137;
	static int anInt138;
	static int anInt139;
	static int anInt140;
	static int anInt141;
	static int anInt142;
	static int anInt143 = 0;
	static int anInt144;
	static int anInt145;
	private Class154 aClass154_146;
	private Object[] anObjectArray147;
	static Class73 aClass73_148;
	static int anInt149;
	static Class156 aClass156_150;
	private Class195 aClass195_151 = null;
	static int anInt152;
	static int anInt153;
	static int anInt154;

	private final boolean method84(boolean bool) {
		try {
			anInt140++;
			if (aClass195_151 == null) {
				aClass195_151 = aClass154_146.method1021((byte) -118);
				if (aClass195_151 == null)
					return false;
				anObjectArray147 = new Object[((Class195) aClass195_151).anInt2738];
				anObjectArrayArray117 = new Object[((Class195) aClass195_151).anInt2738][];
			}
			if (bool != true)
				method105(73);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.M(" + bool + ')');
		}
	}

	final boolean method85(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ != -124)
				method91(-38, 90, -33);
			anInt131++;
			if (!method114((byte) -99, i_1_, i))
				return false;
			if (anObjectArrayArray117[i_1_] != null && anObjectArrayArray117[i_1_][i] != null)
				return true;
			if (anObjectArray147[i_1_] != null)
				return true;
			method106(0, i_1_);
			if (anObjectArray147[i_1_] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int method86(String string, byte i) {
		try {
			anInt136++;
			if (!method84(true))
				return -1;
			string = string.toLowerCase();
			int i_3_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string));
			if (!method93(i_3_, -2))
				return -1;
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.L(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method87(byte i) {
		try {
			anInt138++;
			if (i != 39)
				return 108;
			if (!method84(true))
				return -1;
			return ((Class195) aClass195_151).anIntArray2748.length;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.GA(" + i + ')');
		}
	}

	final boolean method88(int i, int i_4_) {
		try {
			anInt118++;
			if (!method93(i, i_4_ ^ ~0x22c))
				return false;
			if (anObjectArray147[i] != null)
				return true;
			method106(i_4_ ^ i_4_, i);
			if (anObjectArray147[i] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.B(" + i + ',' + i_4_ + ')');
		}
	}

	final void method89(byte i) {
		try {
			if (i > 122) {
				if (anObjectArray147 != null) {
					for (int i_5_ = 0; anObjectArray147.length > i_5_; i_5_++)
						anObjectArray147[i_5_] = null;
				}
				anInt128++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.J(" + i + ')');
		}
	}

	final boolean method90(int i, String string) {
		try {
			anInt134++;
			if (!method84(true))
				return false;
			if (i != -1)
				return true;
			string = string.toLowerCase();
			int i_6_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string));
			return method88(i_6_, 557);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.DA(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final byte[] method91(int i, int i_7_, int i_8_) {
		try {
			anInt121++;
			if (i_8_ <= 83)
				method96(null, false, null);
			return method108(i_7_, i, null, (byte) -62);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.V(" + i + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	private final int method92(int i, int i_9_) {
		try {
			anInt125++;
			if (!method93(i_9_, -2))
				return 0;
			if (anObjectArray147[i_9_] != null)
				return 100;
			return aClass154_146.method1022(i_9_, (byte) 119);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.IA(" + i + ',' + i_9_ + ')');
		}
	}

	private final boolean method93(int i, int i_11_) {
		try {
			anInt142++;
			if (i_11_ != -2)
				aClass154_146 = null;
			if (!method84(true))
				return false;
			if ((i ^ 0xffffffff) > -1 || ((i ^ 0xffffffff) <= (((Class195) aClass195_151).anIntArray2748.length ^ 0xffffffff)) || ((((Class195) aClass195_151).anIntArray2748[i] ^ 0xffffffff) == -1)) {
				if (!Class_v.aBool1451)
					return false;
				throw new IllegalArgumentException(Integer.toString(i));
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.C(" + i + ',' + i_11_ + ')');
		}
	}

	final boolean method94(String string, int i) {
		try {
			anInt132++;
			if (!method84(true))
				return false;
			string = string.toLowerCase();
			int i_12_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string));
			if (i_12_ < 0)
				return false;
			if (i != -1)
				method89((byte) 81);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.D(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method95(int i, int i_13_) {
		try {
			if (i_13_ != 28724)
				aClass195_151 = null;
			anInt152++;
			if (!method93(i, -2))
				return 0;
			return ((Class195) aClass195_151).anIntArray2748[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.AA(" + i + ',' + i_13_ + ')');
		}
	}

	final byte[] method96(String string, boolean bool, String string_14_) {
		try {
			anInt144++;
			if (!method84(true))
				return null;
			if (bool != false)
				anObjectArray147 = null;
			string = string.toLowerCase();
			string_14_ = string_14_.toLowerCase();
			int i = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string));
			if (!method93(i, -2))
				return null;
			int i_15_ = ((Class195) aClass195_151).aClass223Array2741[i].method1439(109, Class145.method976(true, string_14_));
			return method91(i_15_, i, 125);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.R(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + (string_14_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method97(int i) {
		try {
			aClass156_150 = null;
			if (i >= 83)
				aClass73_148 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.U(" + i + ')');
		}
	}

	final int method98(byte i) {
		try {
			if (i != -23)
				return 60;
			anInt133++;
			if (!method84(true))
				throw new IllegalStateException("");
			return ((Class195) aClass195_151).anInt2736;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.CA(" + i + ')');
		}
	}

	final int method99(boolean bool) {
		try {
			if (bool != false)
				return 16;
			anInt137++;
			if (!method84(true))
				return 0;
			int i = 0;
			int i_16_ = 0;
			for (int i_17_ = 0; (anObjectArray147.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				if (((Class195) aClass195_151).anIntArray2726[i_17_] > 0) {
					i += 100;
					i_16_ += method92(123, i_17_);
				}
			}
			if ((i ^ 0xffffffff) == -1)
				return 100;
			int i_18_ = i_16_ * 100 / i;
			return i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.O(" + bool + ')');
		}
	}

	final int method100(String string, byte i) {
		try {
			anInt127++;
			if (!method84(true))
				return 0;
			if (i != 33)
				return 120;
			string = string.toLowerCase();
			int i_19_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string));
			return method92(-79, i_19_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.E(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final boolean method101(int i, int i_20_, int i_21_, int[] is) {
		try {
			anInt139++;
			if (!method93(i, -2))
				return false;
			if (anObjectArray147[i] == null)
				return false;
			int i_22_ = ((Class195) aClass195_151).anIntArray2726[i];
			int[] is_23_ = ((Class195) aClass195_151).anIntArrayArray2733[i];
			if (anObjectArrayArray117[i] == null)
				anObjectArrayArray117[i] = new Object[((Class195) aClass195_151).anIntArray2748[i]];
			Object[] objects = anObjectArrayArray117[i];
			boolean bool = true;
			for (int i_24_ = i_20_; (i_22_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
				int i_25_;
				if (is_23_ != null)
					i_25_ = is_23_[i_24_];
				else
					i_25_ = i_24_;
				if (objects[i_25_] == null) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
			byte[] is_26_;
			if (is != null && ((is[0] ^ 0xffffffff) != -1 || is[1] != 0 || (is[2] ^ 0xffffffff) != -1 || (is[3] ^ 0xffffffff) != -1)) {
				is_26_ = Class202.method1331(true, (byte) 114, anObjectArray147[i]);
				BufferStream stream = new BufferStream(is_26_);
				stream.method2407(5, ((BufferStream) stream).buffer.length, -65, is);
			} else
				is_26_ = Class202.method1331(false, (byte) 87, anObjectArray147[i]);
			byte[] is_27_;
			try {
				is_27_ = Class130_Sub8.method2349(is_26_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("T3 - " + (is != null) + "," + i + "," + is_26_.length + "," + Class_o.method2945((byte) 37, is_26_.length, is_26_) + "," + Class_o.method2945((byte) -95, is_26_.length - 2, is_26_) + "," + ((Class195) aClass195_151).anIntArray2730[i] + "," + ((Class195) aClass195_151).anInt2736));
			}
			if (aBool135)
				anObjectArray147[i] = null;
			if ((i_22_ ^ 0xffffffff) < -2) {
				if ((((Class_fs) this).anInt126 ^ 0xffffffff) == -3) {
					int i_28_ = is_27_.length;
					int i_29_ = is_27_[--i_28_] & 0xff;
					i_28_ -= i_22_ * i_29_ * 4;
					BufferStream stream = new BufferStream(is_27_);
					int i_30_ = 0;
					int i_31_ = 0;
					((BufferStream) stream).position = i_28_;
					for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_32_++) {
						int i_33_ = 0;
						for (int i_34_ = 0; i_34_ < i_22_; i_34_++) {
							i_33_ += stream.readInt((byte) 80);
							int i_35_;
							if (is_23_ == null)
								i_35_ = i_34_;
							else
								i_35_ = is_23_[i_34_];
							if (i_21_ == i_35_) {
								i_30_ += i_33_;
								i_31_ = i_35_;
							}
						}
					}
					if ((i_30_ ^ 0xffffffff) == -1)
						return true;
					byte[] is_36_ = new byte[i_30_];
					((BufferStream) stream).position = i_28_;
					i_30_ = 0;
					int i_37_ = 0;
					for (int i_38_ = 0; (i_29_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
						int i_39_ = 0;
						for (int i_40_ = 0; (i_22_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
							i_39_ += stream.readInt((byte) 102);
							int i_41_;
							if (is_23_ == null)
								i_41_ = i_40_;
							else
								i_41_ = is_23_[i_40_];
							if (i_21_ == i_41_) {
								Class117.method805(is_27_, i_37_, is_36_, i_30_, i_39_);
								i_30_ += i_39_;
							}
							i_37_ += i_39_;
						}
					}
					objects[i_31_] = is_36_;
				} else {
					int i_42_ = is_27_.length;
					int i_43_ = 0xff & is_27_[--i_42_];
					i_42_ -= i_22_ * (i_43_ * 4);
					BufferStream stream = new BufferStream(is_27_);
					int[] is_44_ = new int[i_22_];
					((BufferStream) stream).position = i_42_;
					for (int i_45_ = 0; i_43_ > i_45_; i_45_++) {
						int i_46_ = 0;
						for (int i_47_ = 0; (i_22_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
							i_46_ += stream.readInt((byte) 120);
							is_44_[i_47_] += i_46_;
						}
					}
					byte[][] is_48_ = new byte[i_22_][];
					for (int i_49_ = 0; i_49_ < i_22_; i_49_++) {
						is_48_[i_49_] = new byte[is_44_[i_49_]];
						is_44_[i_49_] = 0;
					}
					((BufferStream) stream).position = i_42_;
					int i_50_ = 0;
					for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
						int i_52_ = 0;
						for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff); i_53_++) {
							i_52_ += stream.readInt((byte) 77);
							Class117.method805(is_27_, i_50_, is_48_[i_53_], is_44_[i_53_], i_52_);
							i_50_ += i_52_;
							is_44_[i_53_] += i_52_;
						}
					}
					for (int i_54_ = 0; (i_22_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff); i_54_++) {
						int i_55_;
						if (is_23_ == null)
							i_55_ = i_54_;
						else
							i_55_ = is_23_[i_54_];
						if ((((Class_fs) this).anInt126 ^ 0xffffffff) == -1)
							objects[i_55_] = Class177.method1159((byte) 109, false, is_48_[i_54_]);
						else
							objects[i_55_] = is_48_[i_54_];
					}
				}
			} else {
				int i_56_;
				if (is_23_ == null)
					i_56_ = 0;
				else
					i_56_ = is_23_[0];
				if (((Class_fs) this).anInt126 == 0)
					objects[i_56_] = Class177.method1159((byte) 109, false, is_27_);
				else
					objects[i_56_] = is_27_;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.I(" + i + ',' + i_20_ + ',' + i_21_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method102(int i, int i_57_) {
		do {
			try {
				anInt115++;
				if (i != -1)
					method99(false);
				if (method93(i_57_, -2)) {
					if (anObjectArrayArray117 == null)
						break;
					anObjectArrayArray117[i_57_] = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fs.FA(" + i + ',' + i_57_ + ')');
			}
			break;
		} while (false);
	}

	final boolean method103(int i) {
		try {
			anInt130++;
			if (!method84(true))
				return false;
			boolean bool = true;
			for (int i_58_ = i; ((i_58_ ^ 0xffffffff) > (((Class195) aClass195_151).anIntArray2735.length ^ 0xffffffff)); i_58_++) {
				int i_59_ = ((Class195) aClass195_151).anIntArray2735[i_58_];
				if (anObjectArray147[i_59_] == null) {
					method106(0, i_59_);
					if (anObjectArray147[i_59_] == null)
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.EA(" + i + ')');
		}
	}

	final int method104(int i, int i_60_) {
		try {
			anInt122++;
			if (!method84(true))
				return -1;
			int i_61_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, i_60_);
			if (i != -14943)
				method105(-55);
			if (!method93(i_61_, -2))
				return -1;
			return i_61_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.F(" + i + ',' + i_60_ + ')');
		}
	}

	final void method105(int i) {
		do {
			try {
				anInt149++;
				if (i == 0) {
					if (anObjectArrayArray117 == null)
						break;
					for (int i_62_ = 0; ((i_62_ ^ 0xffffffff) > (anObjectArrayArray117.length ^ 0xffffffff)); i_62_++)
						anObjectArrayArray117[i_62_] = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fs.HA(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method106(int i, int i_63_) {
		try {
			do {
				if (aBool135) {
					anObjectArray147[i_63_] = aClass154_146.method1023(73, i_63_);
					if (!client.f_ob)
						break;
				}
				anObjectArray147[i_63_] = (Class177.method1159((byte) 109, false, aClass154_146.method1023(Class93.method599(i, 122), i_63_)));
			} while (false);
			if (i != 0)
				aClass195_151 = null;
			anInt154++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.S(" + i + ',' + i_63_ + ')');
		}
	}

	private final void method107(byte i, int i_64_) {
		try {
			anInt129++;
			if (i <= 55)
				method89((byte) 26);
			aClass154_146.method1019(i_64_, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.W(" + i + ',' + i_64_ + ')');
		}
	}

	final byte[] method108(int i, int i_65_, int[] is, byte i_66_) {
		try {
			anInt124++;
			if (!method114((byte) -99, i, i_65_))
				return null;
			if (anObjectArrayArray117[i] == null || anObjectArrayArray117[i][i_65_] == null) {
				boolean bool = method101(i, 0, i_65_, is);
				if (!bool) {
					method106(0, i);
					bool = method101(i, 0, i_65_, is);
					if (!bool)
						return null;
				}
			}
			byte[] is_67_ = Class202.method1331(false, (byte) 82, anObjectArrayArray117[i][i_65_]);
			if (i_66_ >= -49)
				aClass195_151 = null;
			do {
				if ((((Class_fs) this).anInt126 ^ 0xffffffff) != -2) {
					if (((Class_fs) this).anInt126 != 2)
						break;
					anObjectArrayArray117[i] = null;
					if (!client.f_ob)
						break;
				}
				anObjectArrayArray117[i][i_65_] = null;
				if ((((Class195) aClass195_151).anIntArray2748[i] ^ 0xffffffff) == -2)
					anObjectArrayArray117[i] = null;
			} while (false);
			return is_67_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.H(" + i + ',' + i_65_ + ',' + (is != null ? "{...}" : "null") + ',' + i_66_ + ')'));
		}
	}

	final byte[] method109(int i, int i_68_) {
		try {
			anInt141++;
			if (!method84(true))
				return null;
			if ((((Class195) aClass195_151).anIntArray2748.length ^ 0xffffffff) == -2)
				return method91(i, 0, 95);
			if (!method93(i, i_68_ + i_68_))
				return null;
			if (((Class195) aClass195_151).anIntArray2748[i] == 1)
				return method91(0, i, 94);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.BA(" + i + ',' + i_68_ + ')');
		}
	}

	final boolean methodIdk2(int i, String string, String string_69_) {
		try {
			anInt145++;
			if (i != 0)
				method108(-27, -13, null, (byte) 22);
			if (!method84(true))
				return false;
			string_69_ = string_69_.toLowerCase();
			string = string.toLowerCase();
			int i_70_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string_69_));
			if (!method93(i_70_, -2))
				return false;
			int i_71_ = ((Class195) aClass195_151).aClass223Array2741[i_70_].method1439(109, Class145.method976(true, string));
			return method85(i_71_, (byte) -124, i_70_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.T(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (string_69_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean test(String string, String string_69_) {
		try {
			if (!method84(true))
				return false;
			string_69_ = string_69_.toLowerCase();
			string = string.toLowerCase();
			int i_70_ = ((Class195) aClass195_151).aClass223_2737.method1439(109, Class145.method976(true, string_69_));
			if (i_70_ < 0) {
				return false;
			}
			int i_71_ = ((Class195) aClass195_151).aClass223Array2741[i_70_].method1439(109, Class145.method976(true, string));
			if (i_71_ < 0) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, ("fs.T(" + (string != null ? "{...}" : "null") + ',' + (string_69_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method111(int i, int i_72_) {
		try {
			anInt153++;
			if (i != 16947)
				method96(null, false, null);
			if (!method93(i_72_, -2))
				return null;
			int[] is = ((Class195) aClass195_151).anIntArrayArray2733[i_72_];
			if (is == null) {
				is = new int[((Class195) aClass195_151).anIntArray2726[i_72_]];
				for (int i_73_ = 0; is.length > i_73_; i_73_++)
					is[i_73_] = i_73_;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.P(" + i + ',' + i_72_ + ')');
		}
	}

	final boolean method112(int i, int i_74_) {
		try {
			anInt119++;
			if (!method84(true))
				return false;
			if (i != -1)
				return true;
			if ((((Class195) aClass195_151).anIntArray2748.length ^ 0xffffffff) == -2)
				return method85(i_74_, (byte) -124, 0);
			if (!method93(i_74_, -2))
				return false;
			if (((Class195) aClass195_151).anIntArray2748[i_74_] == 1)
				return method85(0, (byte) -124, i_74_);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fs.G(" + i + ',' + i_74_ + ')');
		}
	}

	final void method113(int i, String string) {
		try {
			anInt116++;
			if (method84(true)) {
				string = string.toLowerCase();
				if (i != 100)
					aClass154_146 = null;
				int i_75_ = ((Class195) aClass195_151).aClass223_2737.method1439(i + 9, Class145.method976(true, string));
				method107((byte) 115, i_75_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.K(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final boolean method114(byte i, int i_76_, int i_77_) {
		try {
			anInt120++;
			if (!method84(true))
				return false;
			if ((i_76_ ^ 0xffffffff) > -1 || (i_77_ ^ 0xffffffff) > -1 || ((Class195) aClass195_151).anIntArray2748.length <= i_76_ || ((Class195) aClass195_151).anIntArray2748[i_76_] <= i_77_) {
				if (Class_v.aBool1451)
					throw new IllegalArgumentException(String.valueOf(i_76_) + "," + i_77_);
				return false;
			}
			if (i != -99)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.N(" + i + ',' + i_76_ + ',' + i_77_ + ')'));
		}
	}

	final void method115(boolean bool, int i, boolean bool_78_) {
		do {
			try {
				anInt123++;
				if (i != 4)
					method101(116, -55, 0, null);
				if (method84(true)) {
					if (bool_78_) {
						((Class195) aClass195_151).anIntArrayArray2734 = null;
						((Class195) aClass195_151).aClass223Array2741 = null;
					}
					if (!bool)
						break;
					((Class195) aClass195_151).anIntArray2742 = null;
					((Class195) aClass195_151).aClass223_2737 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fs.Q(" + bool + ',' + i + ',' + bool_78_ + ')'));
			}
			break;
		} while (false);
	}

	Class_fs(Class154 class154, boolean bool, int i) {
		try {
			if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -3)
				throw new IllegalArgumentException("js5: Invalid value " + i + " supplied for discardunpacked");
			((Class_fs) this).anInt126 = i;
			aBool135 = bool;
			aClass154_146 = class154;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fs.<init>(" + (class154 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
		}
	}
}
