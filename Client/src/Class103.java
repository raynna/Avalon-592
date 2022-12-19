/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class103 {
	short[] aShortArray1326;
	static int anInt1327;
	int[] anIntArray1328;
	short[] aShortArray1329;
	byte[] aByteArray1330;
	int anInt1331 = 0;
	byte[] aByteArray1332;
	short[] aShortArray1333;
	short[] aShortArray1334;
	int[] anIntArray1335;
	static int anInt1336;
	short[] aShortArray1337;
	short[] aShortArray1338;
	static int anInt1339;
	static int anInt1340;
	byte aByte1341 = 0;
	static int anInt1342;
	int[] anIntArray1343;
	static int anInt1344;
	byte[] aByteArray1345;
	Class162[] aClass162Array1346;
	int[] anIntArray1347;
	Class131[] aClass131Array1348;
	static int anInt1349;
	static int anInt1350;
	short[] aShortArray1351;
	static int anInt1352;
	short[] aShortArray1353;
	int anInt1354 = 0;
	static int anInt1355;
	static int anInt1356;
	static int anInt1357;
	int anInt1358 = 12;
	static int anInt1359;
	static int anInt1360;
	int[] anIntArray1361;
	short[] aShortArray1362;
	static int anInt1363;
	Class19[] aClass19Array1364;
	static int anInt1365;
	int[] anIntArray1366;
	int[] anIntArray1367;
	int anInt1368 = 0;
	static IncomingPacket aClass13_1369;
	int[] anIntArray1370;
	byte[] aByteArray1371;
	static int anInt1372;
	int[] anIntArray1373;
	static int anInt1374;
	int[] anIntArray1375;
	byte[] f_ab;
	byte[] f_bb;
	short[] f_cb;
	int f_db = 0;
	byte[] f_eb;
	int[] f_fb;
	static String[] f_gb;
	static int f_hb;
	static int f_ib;

	final int[][] method644(byte i) {
		try {
			int i_0_ = -40 % ((i + 11) / 56);
			anInt1350++;
			int[] is = new int[256];
			int i_1_ = 0;
			for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (((Class103) this).aClass131Array1348.length ^ 0xffffffff)); i_2_++) {
				int i_3_ = (((Class131) ((Class103) this).aClass131Array1348[i_2_]).anInt1829);
				if (i_3_ >= 0) {
					if (i_1_ < i_3_)
						i_1_ = i_3_;
					is[i_3_]++;
				}
			}
			int[][] is_4_ = new int[i_1_ + 1][];
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff); i_5_++) {
				is_4_[i_5_] = new int[is[i_5_]];
				is[i_5_] = 0;
			}
			for (int i_6_ = 0; ((((Class103) this).aClass131Array1348.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
				int i_7_ = (((Class131) ((Class103) this).aClass131Array1348[i_6_]).anInt1829);
				if (i_7_ >= 0)
					is_4_[i_7_][is[i_7_]++] = i_6_;
			}
			return is_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.A(" + i + ')');
		}
	}

	final void method645(short i, int i_8_, short i_9_) {
		try {
			anInt1372++;
			if (((Class103) this).f_cb != null) {
				for (int i_10_ = i_8_; ((Class103) this).anInt1368 > i_10_; i_10_++) {
					if (((Class103) this).f_cb[i_10_] == i_9_)
						((Class103) this).f_cb[i_10_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.D(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method646(int i, byte i_11_) {
		do {
			try {
				if (i_11_ < -33) {
					for (int i_12_ = 0; ((((Class103) this).anInt1331 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						((Class103) this).anIntArray1343[i_12_] <<= i;
						((Class103) this).anIntArray1328[i_12_] <<= i;
						((Class103) this).anIntArray1375[i_12_] <<= i;
					}
					anInt1357++;
					if ((((Class103) this).f_db ^ 0xffffffff) >= -1 || ((Class103) this).anIntArray1370 == null)
						break;
					for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > (((Class103) this).anIntArray1370.length ^ 0xffffffff)); i_13_++) {
						((Class103) this).anIntArray1370[i_13_] <<= i;
						((Class103) this).anIntArray1367[i_13_] <<= i;
						if (((Class103) this).f_eb[i_13_] != 1)
							((Class103) this).anIntArray1373[i_13_] <<= i;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jq.Q(" + i + ',' + i_11_ + ')');
			}
			break;
		} while (false);
	}

	final int method647(int i, int i_14_, int i_15_, int i_16_) {
		try {
			anInt1342++;
			for (int i_17_ = i_16_; i_17_ < ((Class103) this).anInt1331; i_17_++) {
				if (((i_15_ ^ 0xffffffff) == (((Class103) this).anIntArray1343[i_17_] ^ 0xffffffff)) && ((i_14_ ^ 0xffffffff) == (((Class103) this).anIntArray1328[i_17_] ^ 0xffffffff)) && i == ((Class103) this).anIntArray1375[i_17_])
					return i_17_;
			}
			((Class103) this).anIntArray1343[((Class103) this).anInt1331] = i_15_;
			((Class103) this).anIntArray1328[((Class103) this).anInt1331] = i_14_;
			((Class103) this).anIntArray1375[((Class103) this).anInt1331] = i;
			((Class103) this).anInt1354 = 1 + ((Class103) this).anInt1331;
			return ((Class103) this).anInt1331++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.R(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	final void method648(int i, int i_18_, int i_19_, int i_20_) {
		try {
			if (i_20_ > -3)
				method644((byte) -13);
			f_ib++;
			for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (((Class103) this).anInt1331 ^ 0xffffffff)); i_21_++) {
				((Class103) this).anIntArray1343[i_21_] += i_18_;
				((Class103) this).anIntArray1328[i_21_] += i;
				((Class103) this).anIntArray1375[i_21_] += i_19_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.M(" + i + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final byte method649(byte i, short i_22_, byte i_23_, short i_24_, int i_25_, short i_26_, short i_27_, byte i_28_, short i_29_, short i_30_) {
		try {
			anInt1349++;
			if ((((Class103) this).f_db ^ 0xffffffff) <= -256)
				throw new IllegalStateException();
			((Class103) this).f_eb[((Class103) this).f_db] = (byte) 3;
			((Class103) this).aShortArray1333[((Class103) this).f_db] = i_29_;
			((Class103) this).aShortArray1326[((Class103) this).f_db] = i_30_;
			if (i_25_ != 25543)
				method647(-122, -37, -54, -24);
			((Class103) this).aShortArray1362[((Class103) this).f_db] = i_24_;
			((Class103) this).anIntArray1370[((Class103) this).f_db] = i_27_;
			((Class103) this).anIntArray1367[((Class103) this).f_db] = i_26_;
			((Class103) this).anIntArray1373[((Class103) this).f_db] = i_22_;
			((Class103) this).aByteArray1330[((Class103) this).f_db] = i_23_;
			((Class103) this).f_ab[((Class103) this).f_db] = i_28_;
			((Class103) this).f_fb[((Class103) this).f_db] = i;
			return (byte) ((Class103) this).f_db++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.E(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	private final int method650(Class103 class103_31_, int i, int i_32_, short i_33_) {
		try {
			anInt1352++;
			int i_34_ = ((Class103) class103_31_).anIntArray1343[i];
			int i_35_ = -37 / ((41 - i_32_) / 59);
			int i_36_ = ((Class103) class103_31_).anIntArray1328[i];
			int i_37_ = ((Class103) class103_31_).anIntArray1375[i];
			for (int i_38_ = 0; ((i_38_ ^ 0xffffffff) > (((Class103) this).anInt1331 ^ 0xffffffff)); i_38_++) {
				if (((i_34_ ^ 0xffffffff) == (((Class103) this).anIntArray1343[i_38_] ^ 0xffffffff)) && ((i_36_ ^ 0xffffffff) == (((Class103) this).anIntArray1328[i_38_] ^ 0xffffffff)) && ((Class103) this).anIntArray1375[i_38_] == i_37_) {
					((Class103) this).aShortArray1351[i_38_] = (short) Class236.method1523((((Class103) this).aShortArray1351[i_38_]), i_33_);
					return i_38_;
				}
			}
			((Class103) this).anIntArray1343[((Class103) this).anInt1331] = i_34_;
			((Class103) this).anIntArray1328[((Class103) this).anInt1331] = i_36_;
			((Class103) this).anIntArray1375[((Class103) this).anInt1331] = i_37_;
			((Class103) this).aShortArray1351[((Class103) this).anInt1331] = i_33_;
			((Class103) this).anIntArray1361[((Class103) this).anInt1331] = (((Class103) class103_31_).anIntArray1361 != null ? ((Class103) class103_31_).anIntArray1361[i] : -1);
			return ((Class103) this).anInt1331++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.N(" + (class103_31_ != null ? "{...}" : "null") + ',' + i + ',' + i_32_ + ',' + i_33_ + ')'));
		}
	}

	static final void method651(int i) {
		try {
			f_hb++;
			if (i != -8282)
				method663((byte) 35, -27, 21);
			int i_39_ = Class246_Sub5.aByteArrayArray3885.length;
			for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff); i_40_++) {
				if (Class246_Sub5.aByteArrayArray3885[i_40_] != null) {
					int i_41_ = -1;
					for (int i_42_ = 0; Class41.anInt618 > i_42_; i_42_++) {
						if (Class168.anIntArray2398[i_40_] == Class102.anIntArray1324[i_42_]) {
							i_41_ = i_42_;
							break;
						}
					}
					if (i_41_ == -1) {
						Class102.anIntArray1324[Class41.anInt618] = Class168.anIntArray2398[i_40_];
						i_41_ = Class41.anInt618++;
					}
					BufferStream stream = new BufferStream(Class246_Sub5.aByteArrayArray3885[i_40_]);
					int i_43_ = 0;
					while (((BufferStream) stream).position < Class246_Sub5.aByteArrayArray3885[i_40_].length) {
						if ((i_43_ ^ 0xffffffff) <= -512 || (Class5.anInt55 ^ 0xffffffff) <= -1024)
							break;
						int i_44_ = i_41_ | i_43_++ << 6;
						int i_45_ = stream.readUnsignedShort((byte) -39);
						int i_46_ = i_45_ >> 14;
						int i_47_ = i_45_ >> 7 & 0x3f;
						int i_48_ = 0x3f & i_45_;
						int i_49_ = (-Class39_Sub1.anInt4670 + 64 * (Class168.anIntArray2398[i_40_] >> 8) + i_47_);
						int i_50_ = (64 * (Class168.anIntArray2398[i_40_] & 0xff) + -Class47.anInt686 - -i_48_);
						Class253 class253 = (Class179.aClass228_2518.method1462(stream.readUnsignedShort((byte) -27), 1));
						if (Class76.aClass_r_Sub2Array1002[i_44_] == null && (0x1 & ((Class253) class253).aByte3609) > 0 && i_46_ == Class40_Sub6.anInt5103 && i_49_ >= 0 && (i_49_ + ((Class253) class253).anInt3574 < Class38_Sub1_Sub1.anInt6770) && (i_50_ ^ 0xffffffff) <= -1 && (Class152.anInt2205 > ((Class253) class253).anInt3574 + i_50_)) {
							Class76.aClass_r_Sub2Array1002[i_44_] = new Npc();
							((Actor) Class76.aClass_r_Sub2Array1002[i_44_]).f_db = i_44_;
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_44_];
							Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = i_44_;
							((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
							class_r_sub2.method2934((byte) -121, class253);
							class_r_sub2.method2673((((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574), (byte) -120);
							((Actor) class_r_sub2).f_cc = (((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3608 << 3);
							if (((Actor) class_r_sub2).f_cc == 0)
								class_r_sub2.method2664(123, 0);
							else
								class_r_sub2.method2664(i + 8364, (4 + ((Class253) (((Npc) class_r_sub2).aClass253_7184)).aByte3616 & 0x5e600007) << 11);
							class_r_sub2.method2928(i_46_, -20437, i_49_, class_r_sub2.method2670((byte) 127), true, i_50_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.L(" + i + ')');
		}
	}

	final int[][] method652(boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt1359++;
			int[] is = new int[256];
			int i = 0;
			for (int i_51_ = 0; ((((Class103) this).anInt1368 ^ 0xffffffff) < (i_51_ ^ 0xffffffff)); i_51_++) {
				int i_52_ = ((Class103) this).anIntArray1347[i_51_];
				if ((i_52_ ^ 0xffffffff) <= -1) {
					if ((i_52_ ^ 0xffffffff) < (i ^ 0xffffffff))
						i = i_52_;
					is[i_52_]++;
				}
			}
			int[][] is_53_ = new int[1 + i][];
			for (int i_54_ = 0; (i_54_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_54_++) {
				is_53_[i_54_] = new int[is[i_54_]];
				is[i_54_] = 0;
			}
			for (int i_55_ = 0; ((i_55_ ^ 0xffffffff) > (((Class103) this).anInt1368 ^ 0xffffffff)); i_55_++) {
				int i_56_ = ((Class103) this).anIntArray1347[i_55_];
				if ((i_56_ ^ 0xffffffff) <= -1)
					is_53_[i_56_][is[i_56_]++] = i_55_;
			}
			return is_53_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.G(" + bool + ')');
		}
	}

	static final void method653(int i, int i_57_, int i_58_, Class var_class) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_57_][i_58_];
		if (class147 != null) {
			for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
				Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
				if (var_class.isAssignableFrom(class59_sub3.getClass()) && ((Class59_Sub3) class59_sub3).aShort5057 == i_57_ && ((Class59_Sub3) class59_sub3).aShort5064 == i_58_) {
					Class246_Sub28_Sub14.method2636(class59_sub3);
					break;
				}
			}
		}
	}

	final int method654(int i, short i_59_, byte i_60_, int i_61_, int i_62_, int i_63_, short i_64_, byte i_65_, byte i_66_) {
		try {
			((Class103) this).aShortArray1337[((Class103) this).anInt1368] = (short) i_61_;
			if (i_62_ > -118)
				return -82;
			anInt1355++;
			((Class103) this).aShortArray1334[((Class103) this).anInt1368] = (short) i_63_;
			((Class103) this).aShortArray1329[((Class103) this).anInt1368] = (short) i;
			((Class103) this).aByteArray1345[((Class103) this).anInt1368] = i_65_;
			((Class103) this).f_bb[((Class103) this).anInt1368] = i_60_;
			((Class103) this).aShortArray1353[((Class103) this).anInt1368] = i_64_;
			((Class103) this).aByteArray1371[((Class103) this).anInt1368] = i_66_;
			((Class103) this).f_cb[((Class103) this).anInt1368] = i_59_;
			return ((Class103) this).anInt1368++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.T(" + i + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + i_66_ + ')'));
		}
	}

	static final int method655(boolean bool) {
		try {
			anInt1360++;
			if ((double) Class79.aFloat1036 == 3.0)
				return 37;
			if (bool != true)
				return 79;
			if ((double) Class79.aFloat1036 == 4.0)
				return 50;
			if ((double) Class79.aFloat1036 == 6.0)
				return 75;
			if ((double) Class79.aFloat1036 == 8.0)
				return 100;
			return 200;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.K(" + bool + ')');
		}
	}

	public static void method656(int i) {
		try {
			aClass13_1369 = null;
			if (i != 0)
				method655(false);
			f_gb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.F(" + i + ')');
		}
	}

	final int[][] method657(byte i) {
		try {
			anInt1336++;
			int[] is = new int[256];
			int i_67_ = 0;
			int i_68_ = 0;
			int i_69_ = 69 / ((i + 4) / 42);
			for (/**/; ((((Class103) this).anInt1354 ^ 0xffffffff) < (i_68_ ^ 0xffffffff)); i_68_++) {
				int i_70_ = ((Class103) this).anIntArray1361[i_68_];
				if ((i_70_ ^ 0xffffffff) <= -1) {
					if (i_70_ > i_67_)
						i_67_ = i_70_;
					is[i_70_]++;
				}
			}
			int[][] is_71_ = new int[1 + i_67_][];
			for (int i_72_ = 0; (i_67_ ^ 0xffffffff) <= (i_72_ ^ 0xffffffff); i_72_++) {
				is_71_[i_72_] = new int[is[i_72_]];
				is[i_72_] = 0;
			}
			for (int i_73_ = 0; ((i_73_ ^ 0xffffffff) > (((Class103) this).anInt1354 ^ 0xffffffff)); i_73_++) {
				int i_74_ = ((Class103) this).anIntArray1361[i_73_];
				if (i_74_ >= 0)
					is_71_[i_74_][is[i_74_]++] = i_73_;
			}
			return is_71_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.P(" + i + ')');
		}
	}

	private final void method658(int i, byte[] is) {
		do {
			try {
				anInt1339++;
				BufferStream stream = new BufferStream(is);
				BufferStream stream_75_ = new BufferStream(is);
				BufferStream stream_76_ = new BufferStream(is);
				BufferStream stream_77_ = new BufferStream(is);
				BufferStream stream_78_ = new BufferStream(is);
				BufferStream stream_79_ = new BufferStream(is);
				BufferStream stream_80_ = new BufferStream(is);
				((BufferStream) stream).position = -23 + is.length;
				((Class103) this).anInt1331 = stream.readUnsignedShort((byte) 104);
				((Class103) this).anInt1368 = stream.readUnsignedShort((byte) -60);
				((Class103) this).f_db = stream.readUnsignedByte(255);
				int i_81_ = stream.readUnsignedByte(255);
				boolean bool = (i_81_ & 0x1 ^ 0xffffffff) == -2;
				boolean bool_82_ = (i_81_ & 0x2) == 2;
				boolean bool_83_ = (0x4 & i_81_) == 4;
				boolean bool_84_ = (0x8 & i_81_) == 8;
				if (bool_84_) {
					((BufferStream) stream).position -= 7;
					((Class103) this).anInt1358 = stream.readUnsignedByte(255);
					((BufferStream) stream).position += 6;
				}
				int i_85_ = stream.readUnsignedByte(255);
				int i_86_ = stream.readUnsignedByte(255);
				int i_87_ = stream.readUnsignedByte(255);
				int i_88_ = stream.readUnsignedByte(255);
				int i_89_ = stream.readUnsignedByte(255);
				int i_90_ = stream.readUnsignedShort((byte) 104);
				int i_91_ = stream.readUnsignedShort((byte) -96);
				int i_92_ = stream.readUnsignedShort((byte) 115);
				int i_93_ = stream.readUnsignedShort((byte) 101);
				int i_94_ = stream.readUnsignedShort((byte) 106);
				int i_95_ = 0;
				int i_96_ = 0;
				int i_97_ = 0;
				if (((Class103) this).f_db > 0) {
					((BufferStream) stream).position = 0;
					((Class103) this).f_eb = new byte[((Class103) this).f_db];
					for (int i_98_ = 0; i_98_ < ((Class103) this).f_db; i_98_++) {
						byte i_99_ = (((Class103) this).f_eb[i_98_] = stream.readByte(false));
						if ((i_99_ ^ 0xffffffff) == -3)
							i_97_++;
						if ((i_99_ ^ 0xffffffff) <= -2 && (i_99_ ^ 0xffffffff) >= -4)
							i_96_++;
						if (i_99_ == 0)
							i_95_++;
					}
				}
				int i_100_ = ((Class103) this).f_db;
				int i_101_ = i_100_;
				i_100_ += ((Class103) this).anInt1331;
				int i_102_ = i_100_;
				if (bool)
					i_100_ += ((Class103) this).anInt1368;
				int i_103_ = i_100_;
				i_100_ += ((Class103) this).anInt1368;
				int i_104_ = i_100_;
				if (i_85_ == 255)
					i_100_ += ((Class103) this).anInt1368;
				int i_105_ = i_100_;
				if (i_87_ == 1)
					i_100_ += ((Class103) this).anInt1368;
				int i_106_ = i_100_;
				if ((i_89_ ^ 0xffffffff) == -2)
					i_100_ += ((Class103) this).anInt1331;
				int i_107_ = i_100_;
				if ((i_86_ ^ 0xffffffff) == -2)
					i_100_ += ((Class103) this).anInt1368;
				int i_108_ = i_100_;
				i_100_ += i_93_;
				int i_109_ = i_100_;
				if ((i_88_ ^ 0xffffffff) == -2)
					i_100_ += ((Class103) this).anInt1368 * 2;
				int i_110_ = i_100_;
				i_100_ += i_94_;
				int i_111_ = i_100_;
				i_100_ += ((Class103) this).anInt1368 * 2;
				int i_112_ = i_100_;
				i_100_ += i_90_;
				int i_113_ = i_100_;
				i_100_ += i_91_;
				int i_114_ = i_100_;
				i_100_ += i_92_;
				int i_115_ = i_100_;
				i_100_ += 6 * i_95_;
				int i_116_ = i_100_;
				i_100_ += 6 * i_96_;
				if (i > 80) {
					int i_117_ = ((Class103) this).anInt1358 < 14 ? 6 : 7;
					int i_118_ = i_100_;
					i_100_ += i_96_ * i_117_;
					int i_119_ = i_100_;
					i_100_ += i_96_;
					int i_120_ = i_100_;
					i_100_ += i_96_;
					int i_121_ = i_100_;
					i_100_ += i_96_ + 2 * i_97_;
					int i_122_ = i_100_;
					((Class103) this).aShortArray1337 = new short[((Class103) this).anInt1368];
					((Class103) this).aShortArray1334 = new short[((Class103) this).anInt1368];
					if (i_85_ == 255)
						((Class103) this).aByteArray1332 = new byte[((Class103) this).anInt1368];
					else
						((Class103) this).aByte1341 = (byte) i_85_;
					if (i_87_ == 1)
						((Class103) this).anIntArray1347 = new int[((Class103) this).anInt1368];
					((Class103) this).anIntArray1328 = new int[((Class103) this).anInt1331];
					((Class103) this).aShortArray1353 = new short[((Class103) this).anInt1368];
					if (i_88_ == 1)
						((Class103) this).f_cb = new short[((Class103) this).anInt1368];
					if (bool)
						((Class103) this).aByteArray1345 = new byte[((Class103) this).anInt1368];
					if ((i_89_ ^ 0xffffffff) == -2)
						((Class103) this).anIntArray1361 = new int[((Class103) this).anInt1331];
					((Class103) this).anIntArray1343 = new int[((Class103) this).anInt1331];
					if (i_86_ == 1)
						((Class103) this).aByteArray1371 = new byte[((Class103) this).anInt1368];
					((Class103) this).aShortArray1329 = new short[((Class103) this).anInt1368];
					if (((Class103) this).f_db > 0) {
						((Class103) this).aShortArray1326 = new short[((Class103) this).f_db];
						if (i_96_ > 0) {
							((Class103) this).anIntArray1370 = new int[i_96_];
							((Class103) this).f_ab = new byte[i_96_];
							((Class103) this).aByteArray1330 = new byte[i_96_];
							((Class103) this).anIntArray1373 = new int[i_96_];
							((Class103) this).anIntArray1367 = new int[i_96_];
							((Class103) this).f_fb = new int[i_96_];
						}
						if (i_97_ > 0) {
							((Class103) this).anIntArray1335 = new int[i_97_];
							((Class103) this).anIntArray1366 = new int[i_97_];
						}
						((Class103) this).aShortArray1333 = new short[((Class103) this).f_db];
						((Class103) this).aShortArray1362 = new short[((Class103) this).f_db];
					}
					if ((i_88_ ^ 0xffffffff) == -2 && (((Class103) this).f_db ^ 0xffffffff) < -1)
						((Class103) this).f_bb = new byte[((Class103) this).anInt1368];
					((BufferStream) stream).position = i_101_;
					((Class103) this).anIntArray1375 = new int[((Class103) this).anInt1331];
					((BufferStream) stream_75_).position = i_112_;
					((BufferStream) stream_76_).position = i_113_;
					((BufferStream) stream_77_).position = i_114_;
					((BufferStream) stream_78_).position = i_106_;
					int i_123_ = 0;
					int i_124_ = 0;
					int i_125_ = 0;
					for (int i_126_ = 0; ((i_126_ ^ 0xffffffff) > (((Class103) this).anInt1331 ^ 0xffffffff)); i_126_++) {
						int i_127_ = stream.readUnsignedByte(255);
						int i_128_ = 0;
						if ((i_127_ & 0x1 ^ 0xffffffff) != -1)
							i_128_ = stream_75_.method2365(-5115);
						int i_129_ = 0;
						if ((0x2 & i_127_) != 0)
							i_129_ = stream_76_.method2365(-5115);
						int i_130_ = 0;
						if ((i_127_ & 0x4) != 0)
							i_130_ = stream_77_.method2365(-5115);
						((Class103) this).anIntArray1343[i_126_] = i_128_ + i_123_;
						((Class103) this).anIntArray1328[i_126_] = i_129_ + i_124_;
						((Class103) this).anIntArray1375[i_126_] = i_125_ - -i_130_;
						i_123_ = ((Class103) this).anIntArray1343[i_126_];
						i_124_ = ((Class103) this).anIntArray1328[i_126_];
						i_125_ = ((Class103) this).anIntArray1375[i_126_];
						if (i_89_ == 1)
							((Class103) this).anIntArray1361[i_126_] = stream_78_.readUnsignedByte(255);
					}
					((BufferStream) stream).position = i_111_;
					((BufferStream) stream_75_).position = i_102_;
					((BufferStream) stream_76_).position = i_104_;
					((BufferStream) stream_77_).position = i_107_;
					((BufferStream) stream_78_).position = i_105_;
					((BufferStream) stream_79_).position = i_109_;
					((BufferStream) stream_80_).position = i_110_;
					for (int i_131_ = 0; ((i_131_ ^ 0xffffffff) > (((Class103) this).anInt1368 ^ 0xffffffff)); i_131_++) {
						((Class103) this).aShortArray1353[i_131_] = (short) stream.readUnsignedShort((byte) -108);
						if (bool)
							((Class103) this).aByteArray1345[i_131_] = stream_75_.readByte(false);
						if ((i_85_ ^ 0xffffffff) == -256)
							((Class103) this).aByteArray1332[i_131_] = stream_76_.readByte(false);
						if (i_86_ == 1)
							((Class103) this).aByteArray1371[i_131_] = stream_77_.readByte(false);
						if (i_87_ == 1)
							((Class103) this).anIntArray1347[i_131_] = stream_78_.readUnsignedByte(255);
						if (i_88_ == 1)
							((Class103) this).f_cb[i_131_] = (short) (stream_79_.readUnsignedShort((byte) -121) - 1);
						if (((Class103) this).f_bb != null) {
							if ((((Class103) this).f_cb[i_131_] ^ 0xffffffff) == 0)
								((Class103) this).f_bb[i_131_] = (byte) -1;
							else
								((Class103) this).f_bb[i_131_] = (byte) (stream_80_.readUnsignedByte(255) - 1);
						}
					}
					((Class103) this).anInt1354 = -1;
					((BufferStream) stream).position = i_108_;
					((BufferStream) stream_75_).position = i_103_;
					short i_132_ = 0;
					short i_133_ = 0;
					short i_134_ = 0;
					int i_135_ = 0;
					for (int i_136_ = 0; i_136_ < ((Class103) this).anInt1368; i_136_++) {
						int i_137_ = stream_75_.readUnsignedByte(255);
						if (i_137_ == 1) {
							i_132_ = (short) (i_135_ + stream.method2365(-5115));
							i_135_ = i_132_;
							i_133_ = (short) (stream.method2365(-5115) + i_135_);
							i_135_ = i_133_;
							i_134_ = (short) (stream.method2365(-5115) + i_135_);
							((Class103) this).aShortArray1337[i_136_] = i_132_;
							i_135_ = i_134_;
							((Class103) this).aShortArray1334[i_136_] = i_133_;
							((Class103) this).aShortArray1329[i_136_] = i_134_;
							if ((((Class103) this).anInt1354 ^ 0xffffffff) > (i_132_ ^ 0xffffffff))
								((Class103) this).anInt1354 = i_132_;
							if (((Class103) this).anInt1354 < i_133_)
								((Class103) this).anInt1354 = i_133_;
							if (i_134_ > ((Class103) this).anInt1354)
								((Class103) this).anInt1354 = i_134_;
						}
						if (i_137_ == 2) {
							i_133_ = i_134_;
							i_134_ = (short) (i_135_ + stream.method2365(-5115));
							((Class103) this).aShortArray1337[i_136_] = i_132_;
							i_135_ = i_134_;
							((Class103) this).aShortArray1334[i_136_] = i_133_;
							((Class103) this).aShortArray1329[i_136_] = i_134_;
							if ((((Class103) this).anInt1354 ^ 0xffffffff) > (i_134_ ^ 0xffffffff))
								((Class103) this).anInt1354 = i_134_;
						}
						if (i_137_ == 3) {
							i_132_ = i_134_;
							i_134_ = (short) (stream.method2365(-5115) + i_135_);
							i_135_ = i_134_;
							((Class103) this).aShortArray1337[i_136_] = i_132_;
							((Class103) this).aShortArray1334[i_136_] = i_133_;
							((Class103) this).aShortArray1329[i_136_] = i_134_;
							if ((((Class103) this).anInt1354 ^ 0xffffffff) > (i_134_ ^ 0xffffffff))
								((Class103) this).anInt1354 = i_134_;
						}
						if (i_137_ == 4) {
							short i_138_ = i_132_;
							i_132_ = i_133_;
							i_133_ = i_138_;
							i_134_ = (short) (i_135_ + stream.method2365(-5115));
							i_135_ = i_134_;
							((Class103) this).aShortArray1337[i_136_] = i_132_;
							((Class103) this).aShortArray1334[i_136_] = i_133_;
							((Class103) this).aShortArray1329[i_136_] = i_134_;
							if (i_134_ > ((Class103) this).anInt1354)
								((Class103) this).anInt1354 = i_134_;
						}
					}
					((BufferStream) stream).position = i_115_;
					((Class103) this).anInt1354++;
					((BufferStream) stream_75_).position = i_116_;
					((BufferStream) stream_76_).position = i_118_;
					((BufferStream) stream_77_).position = i_119_;
					((BufferStream) stream_78_).position = i_120_;
					((BufferStream) stream_79_).position = i_121_;
					for (int i_139_ = 0; i_139_ < ((Class103) this).f_db; i_139_++) {
						int i_140_ = 0xff & ((Class103) this).f_eb[i_139_];
						if (i_140_ == 0) {
							((Class103) this).aShortArray1333[i_139_] = (short) stream.readUnsignedShort((byte) -103);
							((Class103) this).aShortArray1326[i_139_] = (short) stream.readUnsignedShort((byte) 118);
							((Class103) this).aShortArray1362[i_139_] = (short) stream.readUnsignedShort((byte) 111);
						}
						if (i_140_ == 1) {
							((Class103) this).aShortArray1333[i_139_] = (short) stream_75_.readUnsignedShort((byte) -38);
							((Class103) this).aShortArray1326[i_139_] = (short) stream_75_.readUnsignedShort((byte) -51);
							((Class103) this).aShortArray1362[i_139_] = (short) stream_75_.readUnsignedShort((byte) 127);
							((Class103) this).anIntArray1370[i_139_] = stream_76_.readUnsignedShort((byte) 114);
							if ((((Class103) this).anInt1358 ^ 0xffffffff) > -15)
								((Class103) this).anIntArray1367[i_139_] = stream_76_.readUnsignedShort((byte) -49);
							else
								((Class103) this).anIntArray1367[i_139_] = stream_76_.read24BitInteger((byte) 29);
							((Class103) this).anIntArray1373[i_139_] = stream_76_.readUnsignedShort((byte) 116);
							((Class103) this).aByteArray1330[i_139_] = stream_77_.readByte(false);
							((Class103) this).f_ab[i_139_] = stream_78_.readByte(false);
							((Class103) this).f_fb[i_139_] = stream_79_.readByte(false);
						}
						if (i_140_ == 2) {
							((Class103) this).aShortArray1333[i_139_] = (short) stream_75_.readUnsignedShort((byte) -54);
							((Class103) this).aShortArray1326[i_139_] = (short) stream_75_.readUnsignedShort((byte) 111);
							((Class103) this).aShortArray1362[i_139_] = (short) stream_75_.readUnsignedShort((byte) -61);
							((Class103) this).anIntArray1370[i_139_] = stream_76_.readUnsignedShort((byte) 104);
							if (((Class103) this).anInt1358 < 14)
								((Class103) this).anIntArray1367[i_139_] = stream_76_.readUnsignedShort((byte) -38);
							else
								((Class103) this).anIntArray1367[i_139_] = stream_76_.read24BitInteger((byte) 29);
							((Class103) this).anIntArray1373[i_139_] = stream_76_.readUnsignedShort((byte) 89);
							((Class103) this).aByteArray1330[i_139_] = stream_77_.readByte(false);
							((Class103) this).f_ab[i_139_] = stream_78_.readByte(false);
							((Class103) this).f_fb[i_139_] = stream_79_.readByte(false);
							((Class103) this).anIntArray1335[i_139_] = stream_79_.readByte(false);
							((Class103) this).anIntArray1366[i_139_] = stream_79_.readByte(false);
						}
						if (i_140_ == 3) {
							((Class103) this).aShortArray1333[i_139_] = (short) stream_75_.readUnsignedShort((byte) -118);
							((Class103) this).aShortArray1326[i_139_] = (short) stream_75_.readUnsignedShort((byte) 118);
							((Class103) this).aShortArray1362[i_139_] = (short) stream_75_.readUnsignedShort((byte) -43);
							((Class103) this).anIntArray1370[i_139_] = stream_76_.readUnsignedShort((byte) -30);
							if ((((Class103) this).anInt1358 ^ 0xffffffff) > -15)
								((Class103) this).anIntArray1367[i_139_] = stream_76_.readUnsignedShort((byte) 104);
							else
								((Class103) this).anIntArray1367[i_139_] = stream_76_.read24BitInteger((byte) 29);
							((Class103) this).anIntArray1373[i_139_] = stream_76_.readUnsignedShort((byte) 111);
							((Class103) this).aByteArray1330[i_139_] = stream_77_.readByte(false);
							((Class103) this).f_ab[i_139_] = stream_78_.readByte(false);
							((Class103) this).f_fb[i_139_] = stream_79_.readByte(false);
						}
					}
					((BufferStream) stream).position = i_122_;
					if (bool_82_) {
						int i_141_ = stream.readUnsignedByte(255);
						if ((i_141_ ^ 0xffffffff) < -1) {
							((Class103) this).aClass19Array1364 = new Class19[i_141_];
							for (int i_142_ = 0; i_141_ > i_142_; i_142_++) {
								int i_143_ = stream.readUnsignedShort((byte) -102);
								int i_144_ = stream.readUnsignedShort((byte) -33);
								byte i_145_;
								if ((i_85_ ^ 0xffffffff) != -256)
									i_145_ = (byte) i_85_;
								else
									i_145_ = (((Class103) this).aByteArray1332[i_144_]);
								((Class103) this).aClass19Array1364[i_142_] = new Class19(i_143_, (((Class103) this).aShortArray1337[i_144_]), (((Class103) this).aShortArray1334[i_144_]), (((Class103) this).aShortArray1329[i_144_]), i_145_);
							}
						}
						int i_146_ = stream.readUnsignedByte(255);
						if (i_146_ > 0) {
							((Class103) this).aClass162Array1346 = new Class162[i_146_];
							for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
								int i_148_ = stream.readUnsignedShort((byte) -70);
								int i_149_ = stream.readUnsignedShort((byte) 85);
								((Class103) this).aClass162Array1346[i_147_] = new Class162(i_148_, i_149_);
							}
						}
					}
					if (!bool_83_)
						break;
					int i_150_ = stream.readUnsignedByte(255);
					if ((i_150_ ^ 0xffffffff) >= -1)
						break;
					((Class103) this).aClass131Array1348 = new Class131[i_150_];
					for (int i_151_ = 0; (i_151_ ^ 0xffffffff) > (i_150_ ^ 0xffffffff); i_151_++) {
						int i_152_ = stream.readUnsignedShort((byte) -41);
						int i_153_ = stream.readUnsignedShort((byte) 83);
						int i_154_ = stream.readUnsignedByte(255);
						byte i_155_ = stream.readByte(false);
						((Class103) this).aClass131Array1348[i_151_] = new Class131(i_152_, i_153_, i_154_, i_155_);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jq.B(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method659(long l, byte i) {
		try {
			if (i != 1)
				method651(32);
			anInt1356++;
			int i_156_ = Class242.anInt3424;
			int i_157_ = Class246_Sub43.anInt5606;
			if ((Class_c_Sub1.anInt5366 ^ 0xffffffff) != (i_156_ ^ 0xffffffff)) {
				int i_158_ = i_156_ + -Class_c_Sub1.anInt5366;
				int i_159_ = (int) ((long) i_158_ * l / 320L);
				if (i_158_ > 0) {
					if (i_159_ != 0) {
						if (i_158_ < i_159_)
							i_159_ = i_158_;
					} else
						i_159_ = 1;
				} else if (i_159_ != 0) {
					if (i_158_ > i_159_)
						i_159_ = i_158_;
				} else
					i_159_ = -1;
				Class_c_Sub1.anInt5366 += i_159_;
			}
			if (Class246_Sub34.anInt5135 != i_157_) {
				int i_160_ = i_157_ - Class246_Sub34.anInt5135;
				int i_161_ = (int) ((long) i_160_ * l / 320L);
				if ((i_160_ ^ 0xffffffff) >= -1) {
					if ((i_161_ ^ 0xffffffff) != -1) {
						if (i_160_ > i_161_)
							i_161_ = i_160_;
					} else
						i_161_ = -1;
				} else if ((i_161_ ^ 0xffffffff) == -1)
					i_161_ = 1;
				else if ((i_160_ ^ 0xffffffff) > (i_161_ ^ 0xffffffff))
					i_161_ = i_160_;
				Class246_Sub34.anInt5135 += i_161_;
			}
			if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) {
				Class204.aFloat2881 += (Class259_Sub2_Sub1.aFloat6906 * (float) l / 40.0F * 8.0F);
				Class59_Sub2.aFloat4553 += 8.0F * ((float) l * Class24.aFloat341 / 40.0F);
			}
			Class145.method977(-61);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.J(" + l + ',' + i + ')');
		}
	}

	final void method660(int i, int i_162_, int i_163_, byte i_164_) {
		do {
			try {
				anInt1340++;
				if (i_163_ != 0) {
					int i_165_ = Class39_Sub1.f_fb[i_163_];
					int i_166_ = Class39_Sub1.anIntArray4672[i_163_];
					for (int i_167_ = 0; i_167_ < ((Class103) this).anInt1331; i_167_++) {
						int i_168_ = (((i_166_ * ((Class103) this).anIntArray1343[i_167_]) + (((Class103) this).anIntArray1328[i_167_] * i_165_)) >> 15);
						((Class103) this).anIntArray1328[i_167_] = ((((Class103) this).anIntArray1328[i_167_] * i_166_) + -(i_165_ * (((Class103) this).anIntArray1343[i_167_]))) >> 15;
						((Class103) this).anIntArray1343[i_167_] = i_168_;
					}
				}
				if ((i ^ 0xffffffff) != -1) {
					int i_169_ = Class39_Sub1.f_fb[i];
					int i_170_ = Class39_Sub1.anIntArray4672[i];
					for (int i_171_ = 0; ((Class103) this).anInt1331 > i_171_; i_171_++) {
						int i_172_ = ((-(i_169_ * ((Class103) this).anIntArray1375[i_171_]) + (((Class103) this).anIntArray1328[i_171_] * i_170_)) >> 15);
						((Class103) this).anIntArray1375[i_171_] = ((((Class103) this).anIntArray1328[i_171_] * i_169_) - -(((Class103) this).anIntArray1375[i_171_] * i_170_)) >> 15;
						((Class103) this).anIntArray1328[i_171_] = i_172_;
					}
				}
				if (i_162_ != 0) {
					int i_173_ = Class39_Sub1.f_fb[i_162_];
					int i_174_ = Class39_Sub1.anIntArray4672[i_162_];
					for (int i_175_ = 0; ((Class103) this).anInt1331 > i_175_; i_175_++) {
						int i_176_ = (((((Class103) this).anIntArray1343[i_175_] * i_174_) + (((Class103) this).anIntArray1375[i_175_] * i_173_)) >> 15);
						((Class103) this).anIntArray1375[i_175_] = ((i_174_ * ((Class103) this).anIntArray1375[i_175_]) + -(((Class103) this).anIntArray1343[i_175_] * i_173_)) >> 15;
						((Class103) this).anIntArray1343[i_175_] = i_176_;
					}
				}
				if (i_164_ > 105)
					break;
				((Class103) this).aByte1341 = (byte) 108;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jq.H(" + i + ',' + i_162_ + ',' + i_163_ + ',' + i_164_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method661(byte i, byte[] is) {
		do {
			try {
				anInt1327++;
				boolean bool = false;
				boolean bool_177_ = false;
				BufferStream stream = new BufferStream(is);
				BufferStream stream_178_ = new BufferStream(is);
				BufferStream stream_179_ = new BufferStream(is);
				BufferStream stream_180_ = new BufferStream(is);
				BufferStream stream_181_ = new BufferStream(is);
				((BufferStream) stream).position = -18 + is.length;
				((Class103) this).anInt1331 = stream.readUnsignedShort((byte) -77);
				((Class103) this).anInt1368 = stream.readUnsignedShort((byte) -124);
				((Class103) this).f_db = stream.readUnsignedByte(255);
				int i_182_ = stream.readUnsignedByte(255);
				int i_183_ = stream.readUnsignedByte(255);
				int i_184_ = stream.readUnsignedByte(255);
				int i_185_ = stream.readUnsignedByte(255);
				int i_186_ = stream.readUnsignedByte(i ^ 0xe9);
				int i_187_ = stream.readUnsignedShort((byte) -52);
				int i_188_ = stream.readUnsignedShort((byte) 118);
				int i_189_ = stream.readUnsignedShort((byte) -79);
				int i_190_ = stream.readUnsignedShort((byte) 104);
				int i_191_ = 0;
				int i_192_ = i_191_;
				i_191_ += ((Class103) this).anInt1331;
				int i_193_ = i_191_;
				i_191_ += ((Class103) this).anInt1368;
				int i_194_ = i_191_;
				if (i_183_ == 255)
					i_191_ += ((Class103) this).anInt1368;
				int i_195_ = i_191_;
				if ((i_185_ ^ 0xffffffff) == -2)
					i_191_ += ((Class103) this).anInt1368;
				int i_196_ = i_191_;
				if ((i_182_ ^ 0xffffffff) == -2)
					i_191_ += ((Class103) this).anInt1368;
				if (i == 22) {
					int i_197_ = i_191_;
					if (i_186_ == 1)
						i_191_ += ((Class103) this).anInt1331;
					int i_198_ = i_191_;
					if (i_184_ == 1)
						i_191_ += ((Class103) this).anInt1368;
					int i_199_ = i_191_;
					i_191_ += i_190_;
					int i_200_ = i_191_;
					i_191_ += ((Class103) this).anInt1368 * 2;
					int i_201_ = i_191_;
					i_191_ += ((Class103) this).f_db * 6;
					int i_202_ = i_191_;
					i_191_ += i_187_;
					int i_203_ = i_191_;
					i_191_ += i_188_;
					int i_204_ = i_191_;
					((Class103) this).aShortArray1329 = new short[((Class103) this).anInt1368];
					if ((i_186_ ^ 0xffffffff) == -2)
						((Class103) this).anIntArray1361 = new int[((Class103) this).anInt1331];
					if (i_184_ == 1)
						((Class103) this).aByteArray1371 = new byte[((Class103) this).anInt1368];
					if ((((Class103) this).f_db ^ 0xffffffff) < -1) {
						((Class103) this).aShortArray1362 = new short[((Class103) this).f_db];
						((Class103) this).aShortArray1326 = new short[((Class103) this).f_db];
						((Class103) this).f_eb = new byte[((Class103) this).f_db];
						((Class103) this).aShortArray1333 = new short[((Class103) this).f_db];
					}
					((Class103) this).aShortArray1337 = new short[((Class103) this).anInt1368];
					((Class103) this).anIntArray1375 = new int[((Class103) this).anInt1331];
					((Class103) this).aShortArray1353 = new short[((Class103) this).anInt1368];
					((Class103) this).aShortArray1334 = new short[((Class103) this).anInt1368];
					i_191_ += i_189_;
					((Class103) this).anIntArray1328 = new int[((Class103) this).anInt1331];
					((BufferStream) stream).position = i_192_;
					((Class103) this).anIntArray1343 = new int[((Class103) this).anInt1331];
					if ((i_185_ ^ 0xffffffff) == -2)
						((Class103) this).anIntArray1347 = new int[((Class103) this).anInt1368];
					if ((i_182_ ^ 0xffffffff) == -2) {
						((Class103) this).f_bb = new byte[((Class103) this).anInt1368];
						((Class103) this).aByteArray1345 = new byte[((Class103) this).anInt1368];
						((Class103) this).f_cb = new short[((Class103) this).anInt1368];
					}
					if ((i_183_ ^ 0xffffffff) != -256)
						((Class103) this).aByte1341 = (byte) i_183_;
					else
						((Class103) this).aByteArray1332 = new byte[((Class103) this).anInt1368];
					((BufferStream) stream_178_).position = i_202_;
					((BufferStream) stream_179_).position = i_203_;
					((BufferStream) stream_180_).position = i_204_;
					((BufferStream) stream_181_).position = i_197_;
					int i_205_ = 0;
					int i_206_ = 0;
					int i_207_ = 0;
					for (int i_208_ = 0; ((((Class103) this).anInt1331 ^ 0xffffffff) < (i_208_ ^ 0xffffffff)); i_208_++) {
						int i_209_ = stream.readUnsignedByte(i + 233);
						int i_210_ = 0;
						if ((0x1 & i_209_) != 0)
							i_210_ = stream_178_.method2365(-5115);
						int i_211_ = 0;
						if ((i_209_ & 0x2 ^ 0xffffffff) != -1)
							i_211_ = stream_179_.method2365(-5115);
						int i_212_ = 0;
						if ((i_209_ & 0x4) != 0)
							i_212_ = stream_180_.method2365(-5115);
						((Class103) this).anIntArray1343[i_208_] = i_205_ - -i_210_;
						((Class103) this).anIntArray1328[i_208_] = i_206_ - -i_211_;
						((Class103) this).anIntArray1375[i_208_] = i_212_ + i_207_;
						i_205_ = ((Class103) this).anIntArray1343[i_208_];
						i_206_ = ((Class103) this).anIntArray1328[i_208_];
						i_207_ = ((Class103) this).anIntArray1375[i_208_];
						if ((i_186_ ^ 0xffffffff) == -2)
							((Class103) this).anIntArray1361[i_208_] = stream_181_.readUnsignedByte(255);
					}
					((BufferStream) stream).position = i_200_;
					((BufferStream) stream_178_).position = i_196_;
					((BufferStream) stream_179_).position = i_194_;
					((BufferStream) stream_180_).position = i_198_;
					((BufferStream) stream_181_).position = i_195_;
					for (int i_213_ = 0; i_213_ < ((Class103) this).anInt1368; i_213_++) {
						((Class103) this).aShortArray1353[i_213_] = (short) stream.readUnsignedShort((byte) -93);
						if ((i_182_ ^ 0xffffffff) == -2) {
							int i_214_ = stream_178_.readUnsignedByte(i ^ 0xe9);
							if ((0x1 & i_214_) == 1) {
								bool = true;
								((Class103) this).aByteArray1345[i_213_] = (byte) 1;
							} else
								((Class103) this).aByteArray1345[i_213_] = (byte) 0;
							if ((0x2 & i_214_) != 2) {
								((Class103) this).f_bb[i_213_] = (byte) -1;
								((Class103) this).f_cb[i_213_] = (short) -1;
							} else {
								((Class103) this).f_bb[i_213_] = (byte) (i_214_ >> 2);
								((Class103) this).f_cb[i_213_] = (((Class103) this).aShortArray1353[i_213_]);
								((Class103) this).aShortArray1353[i_213_] = (short) 127;
								if (((Class103) this).f_cb[i_213_] != -1)
									bool_177_ = true;
							}
						}
						if ((i_183_ ^ 0xffffffff) == -256)
							((Class103) this).aByteArray1332[i_213_] = stream_179_.readByte(false);
						if ((i_184_ ^ 0xffffffff) == -2)
							((Class103) this).aByteArray1371[i_213_] = stream_180_.readByte(false);
						if (i_185_ == 1)
							((Class103) this).anIntArray1347[i_213_] = stream_181_.readUnsignedByte(255);
					}
					((BufferStream) stream).position = i_199_;
					((Class103) this).anInt1354 = -1;
					((BufferStream) stream_178_).position = i_193_;
					short i_215_ = 0;
					short i_216_ = 0;
					short i_217_ = 0;
					int i_218_ = 0;
					for (int i_219_ = 0; ((Class103) this).anInt1368 > i_219_; i_219_++) {
						int i_220_ = stream_178_.readUnsignedByte(255);
						if (i_220_ == 1) {
							i_215_ = (short) (stream.method2365(-5115) + i_218_);
							i_218_ = i_215_;
							i_216_ = (short) (stream.method2365(-5115) + i_218_);
							i_218_ = i_216_;
							i_217_ = (short) (stream.method2365(-5115) + i_218_);
							((Class103) this).aShortArray1337[i_219_] = i_215_;
							i_218_ = i_217_;
							((Class103) this).aShortArray1334[i_219_] = i_216_;
							((Class103) this).aShortArray1329[i_219_] = i_217_;
							if ((i_215_ ^ 0xffffffff) < (((Class103) this).anInt1354 ^ 0xffffffff))
								((Class103) this).anInt1354 = i_215_;
							if (i_216_ > ((Class103) this).anInt1354)
								((Class103) this).anInt1354 = i_216_;
							if ((((Class103) this).anInt1354 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
								((Class103) this).anInt1354 = i_217_;
						}
						if ((i_220_ ^ 0xffffffff) == -3) {
							i_216_ = i_217_;
							i_217_ = (short) (stream.method2365(-5115) + i_218_);
							i_218_ = i_217_;
							((Class103) this).aShortArray1337[i_219_] = i_215_;
							((Class103) this).aShortArray1334[i_219_] = i_216_;
							((Class103) this).aShortArray1329[i_219_] = i_217_;
							if ((((Class103) this).anInt1354 ^ 0xffffffff) > (i_217_ ^ 0xffffffff))
								((Class103) this).anInt1354 = i_217_;
						}
						if (i_220_ == 3) {
							i_215_ = i_217_;
							i_217_ = (short) (i_218_ + stream.method2365(-5115));
							i_218_ = i_217_;
							((Class103) this).aShortArray1337[i_219_] = i_215_;
							((Class103) this).aShortArray1334[i_219_] = i_216_;
							((Class103) this).aShortArray1329[i_219_] = i_217_;
							if (((Class103) this).anInt1354 < i_217_)
								((Class103) this).anInt1354 = i_217_;
						}
						if ((i_220_ ^ 0xffffffff) == -5) {
							short i_221_ = i_215_;
							i_215_ = i_216_;
							i_216_ = i_221_;
							i_217_ = (short) (stream.method2365(i ^ ~0x13ec) + i_218_);
							i_218_ = i_217_;
							((Class103) this).aShortArray1337[i_219_] = i_215_;
							((Class103) this).aShortArray1334[i_219_] = i_216_;
							((Class103) this).aShortArray1329[i_219_] = i_217_;
							if (((Class103) this).anInt1354 < i_217_)
								((Class103) this).anInt1354 = i_217_;
						}
					}
					((BufferStream) stream).position = i_201_;
					((Class103) this).anInt1354++;
					for (int i_222_ = 0; ((((Class103) this).f_db ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++) {
						((Class103) this).f_eb[i_222_] = (byte) 0;
						((Class103) this).aShortArray1333[i_222_] = (short) stream.readUnsignedShort((byte) 104);
						((Class103) this).aShortArray1326[i_222_] = (short) stream.readUnsignedShort((byte) 116);
						((Class103) this).aShortArray1362[i_222_] = (short) stream.readUnsignedShort((byte) 83);
					}
					if (((Class103) this).f_bb != null) {
						boolean bool_223_ = false;
						for (int i_224_ = 0; ((Class103) this).anInt1368 > i_224_; i_224_++) {
							int i_225_ = ((Class103) this).f_bb[i_224_] & 0xff;
							if (i_225_ != 255) {
								if (((((Class103) this).aShortArray1333[i_225_] & 0xffff) == (((Class103) this).aShortArray1337[i_224_])) && (((((Class103) this).aShortArray1326[i_225_]) & 0xffff) == (((Class103) this).aShortArray1334[i_224_])) && ((((Class103) this).aShortArray1329[i_224_]) == (0xffff & (((Class103) this).aShortArray1362[i_225_]))))
									((Class103) this).f_bb[i_224_] = (byte) -1;
								else
									bool_223_ = true;
							}
						}
						if (!bool_223_)
							((Class103) this).f_bb = null;
					}
					if (!bool_177_)
						((Class103) this).f_cb = null;
					if (bool)
						break;
					((Class103) this).aByteArray1345 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jq.S(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method662(short i, short i_226_, boolean bool) {
		try {
			anInt1344++;
			if (bool == false) {
				for (int i_227_ = 0; ((i_227_ ^ 0xffffffff) > (((Class103) this).anInt1368 ^ 0xffffffff)); i_227_++) {
					if ((((Class103) this).aShortArray1353[i_227_] ^ 0xffffffff) == (i ^ 0xffffffff))
						((Class103) this).aShortArray1353[i_227_] = i_226_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.C(" + i + ',' + i_226_ + ',' + bool + ')'));
		}
	}

	static final int method663(byte i, int i_228_, int i_229_) {
		try {
			anInt1363++;
			int i_230_ = (-128 + Class260_Sub2.method1972(-95, 4, 91923 + i_229_, i_228_ + 45365) - (-(Class260_Sub2.method1972(-121, 2, i_229_ + 37821, 10294 + i_228_) - 128 >> 1) + -((Class260_Sub2.method1972(-93, 1, i_229_, i_228_) - 128) >> 2)));
			i_230_ = 35 + (int) (0.3 * (double) i_230_);
			if (i >= -16)
				anInt1374 = -59;
			do {
				if ((i_230_ ^ 0xffffffff) <= -11) {
					if ((i_230_ ^ 0xffffffff) >= -61)
						break;
					i_230_ = 60;
					if (!client.f_ob)
						break;
				}
				i_230_ = 10;
			} while (false);
			return i_230_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.I(" + i + ',' + i_228_ + ',' + i_229_ + ')'));
		}
	}

	Class103(byte[] is) {
		try {
			if (is[-1 + is.length] != -1 || is[is.length - 2] != -1)
				method661((byte) 22, is);
			else
				method658(111, is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jq.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	Class103(int i, int i_231_, int i_232_) {
		try {
			((Class103) this).f_bb = new byte[i_231_];
			((Class103) this).aShortArray1334 = new short[i_231_];
			((Class103) this).aShortArray1353 = new short[i_231_];
			((Class103) this).aShortArray1337 = new short[i_231_];
			((Class103) this).anIntArray1375 = new int[i];
			((Class103) this).anIntArray1361 = new int[i];
			((Class103) this).aByteArray1345 = new byte[i_231_];
			((Class103) this).aByteArray1371 = new byte[i_231_];
			((Class103) this).f_cb = new short[i_231_];
			if ((i_232_ ^ 0xffffffff) < -1) {
				((Class103) this).anIntArray1366 = new int[i_232_];
				((Class103) this).aShortArray1362 = new short[i_232_];
				((Class103) this).anIntArray1373 = new int[i_232_];
				((Class103) this).anIntArray1335 = new int[i_232_];
				((Class103) this).aByteArray1330 = new byte[i_232_];
				((Class103) this).f_fb = new int[i_232_];
				((Class103) this).f_eb = new byte[i_232_];
				((Class103) this).anIntArray1367 = new int[i_232_];
				((Class103) this).f_ab = new byte[i_232_];
				((Class103) this).aShortArray1333 = new short[i_232_];
				((Class103) this).anIntArray1370 = new int[i_232_];
				((Class103) this).aShortArray1326 = new short[i_232_];
			}
			((Class103) this).aByteArray1332 = new byte[i_231_];
			((Class103) this).anIntArray1347 = new int[i_231_];
			((Class103) this).aShortArray1329 = new short[i_231_];
			((Class103) this).anIntArray1328 = new int[i];
			((Class103) this).anIntArray1343 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.<init>(" + i + ',' + i_231_ + ',' + i_232_ + ')'));
		}
	}

	Class103(Class103[] class103s, int i) {
		try {
			((Class103) this).anInt1331 = 0;
			((Class103) this).f_db = 0;
			((Class103) this).anInt1368 = 0;
			int i_233_ = 0;
			int i_234_ = 0;
			int i_235_ = 0;
			boolean bool = false;
			boolean bool_236_ = false;
			boolean bool_237_ = false;
			boolean bool_238_ = false;
			boolean bool_239_ = false;
			((Class103) this).aByte1341 = (byte) -1;
			boolean bool_240_ = false;
			for (int i_241_ = 0; i_241_ < i; i_241_++) {
				Class103 class103_242_ = class103s[i_241_];
				if (class103_242_ != null) {
					((Class103) this).f_db += ((Class103) class103_242_).f_db;
					((Class103) this).anInt1331 += ((Class103) class103_242_).anInt1331;
					((Class103) this).anInt1368 += ((Class103) class103_242_).anInt1368;
					if (((Class103) class103_242_).aClass131Array1348 != null)
						i_235_ += (((Class103) class103_242_).aClass131Array1348).length;
					bool = bool | (((Class103) class103_242_).aByteArray1345 != null);
					if (((Class103) class103_242_).aClass162Array1346 != null)
						i_234_ += (((Class103) class103_242_).aClass162Array1346).length;
					if (((Class103) class103_242_).aClass19Array1364 != null)
						i_233_ += (((Class103) class103_242_).aClass19Array1364).length;
					bool_239_ = bool_239_ | ((Class103) class103_242_).f_cb != null;
					bool_240_ = bool_240_ | (((Class103) class103_242_).anIntArray1347) != null;
					bool_238_ = bool_238_ | ((Class103) class103_242_).f_bb != null;
					bool_237_ = bool_237_ | (((Class103) class103_242_).aByteArray1371) != null;
					if (((Class103) class103_242_).aByteArray1332 != null)
						bool_236_ = true;
					else {
						if ((((Class103) this).aByte1341 ^ 0xffffffff) == 0)
							((Class103) this).aByte1341 = ((Class103) class103_242_).aByte1341;
						if ((((Class103) this).aByte1341 ^ 0xffffffff) != (((Class103) class103_242_).aByte1341 ^ 0xffffffff))
							bool_236_ = true;
					}
				}
			}
			if (bool_240_)
				((Class103) this).anIntArray1347 = new int[((Class103) this).anInt1368];
			if (bool_239_)
				((Class103) this).f_cb = new short[((Class103) this).anInt1368];
			((Class103) this).anIntArray1361 = new int[((Class103) this).anInt1331];
			((Class103) this).aShortArray1338 = new short[((Class103) this).anInt1368];
			if ((i_233_ ^ 0xffffffff) < -1)
				((Class103) this).aClass19Array1364 = new Class19[i_233_];
			((Class103) this).anIntArray1375 = new int[((Class103) this).anInt1331];
			if (bool_237_)
				((Class103) this).aByteArray1371 = new byte[((Class103) this).anInt1368];
			if ((i_235_ ^ 0xffffffff) < -1)
				((Class103) this).aClass131Array1348 = new Class131[i_235_];
			((Class103) this).aShortArray1329 = new short[((Class103) this).anInt1368];
			((Class103) this).anIntArray1328 = new int[((Class103) this).anInt1331];
			((Class103) this).aShortArray1334 = new short[((Class103) this).anInt1368];
			if (bool_236_)
				((Class103) this).aByteArray1332 = new byte[((Class103) this).anInt1368];
			if (bool_238_)
				((Class103) this).f_bb = new byte[((Class103) this).anInt1368];
			if ((((Class103) this).f_db ^ 0xffffffff) < -1) {
				((Class103) this).f_ab = new byte[((Class103) this).f_db];
				((Class103) this).aShortArray1362 = new short[((Class103) this).f_db];
				((Class103) this).anIntArray1370 = new int[((Class103) this).f_db];
				((Class103) this).anIntArray1366 = new int[((Class103) this).f_db];
				((Class103) this).aByteArray1330 = new byte[((Class103) this).f_db];
				((Class103) this).anIntArray1367 = new int[((Class103) this).f_db];
				((Class103) this).anIntArray1373 = new int[((Class103) this).f_db];
				((Class103) this).aShortArray1326 = new short[((Class103) this).f_db];
				((Class103) this).aShortArray1333 = new short[((Class103) this).f_db];
				((Class103) this).f_fb = new int[((Class103) this).f_db];
				((Class103) this).f_eb = new byte[((Class103) this).f_db];
				((Class103) this).anIntArray1335 = new int[((Class103) this).f_db];
			}
			((Class103) this).aShortArray1351 = new short[((Class103) this).anInt1331];
			if (i_234_ > 0)
				((Class103) this).aClass162Array1346 = new Class162[i_234_];
			if (bool)
				((Class103) this).aByteArray1345 = new byte[((Class103) this).anInt1368];
			((Class103) this).aShortArray1337 = new short[((Class103) this).anInt1368];
			((Class103) this).anIntArray1343 = new int[((Class103) this).anInt1331];
			((Class103) this).aShortArray1353 = new short[((Class103) this).anInt1368];
			i_234_ = 0;
			((Class103) this).anInt1331 = 0;
			((Class103) this).f_db = 0;
			i_233_ = 0;
			((Class103) this).anInt1368 = 0;
			i_235_ = 0;
			for (int i_243_ = 0; i > i_243_; i_243_++) {
				short i_244_ = (short) (1 << i_243_);
				Class103 class103_245_ = class103s[i_243_];
				if (class103_245_ != null) {
					if (((Class103) class103_245_).aClass131Array1348 != null) {
						for (int i_246_ = 0; i_246_ < (((Class103) class103_245_).aClass131Array1348).length; i_246_++) {
							Class131 class131 = (((Class103) class103_245_).aClass131Array1348[i_246_]);
							((Class103) this).aClass131Array1348[i_235_++] = class131.method890(true, ((((Class103) this).anInt1368) + (((Class131) class131).anInt1823)));
						}
					}
					for (int i_247_ = 0; i_247_ < ((Class103) class103_245_).anInt1368; i_247_++) {
						if (bool && (((Class103) class103_245_).aByteArray1345 != null))
							((Class103) this).aByteArray1345[(((Class103) this).anInt1368)] = (((Class103) class103_245_).aByteArray1345[i_247_]);
						if (bool_236_) {
							if (((Class103) class103_245_).aByteArray1332 != null)
								((Class103) this).aByteArray1332[((Class103) this).anInt1368] = (((Class103) class103_245_).aByteArray1332[i_247_]);
							else
								((Class103) this).aByteArray1332[((Class103) this).anInt1368] = ((Class103) class103_245_).aByte1341;
						}
						if (bool_237_ && (((Class103) class103_245_).aByteArray1371 != null))
							((Class103) this).aByteArray1371[(((Class103) this).anInt1368)] = (((Class103) class103_245_).aByteArray1371[i_247_]);
						if (bool_239_) {
							if (((Class103) class103_245_).f_cb == null)
								((Class103) this).f_cb[(((Class103) this).anInt1368)] = (short) -1;
							else
								((Class103) this).f_cb[(((Class103) this).anInt1368)] = ((Class103) class103_245_).f_cb[i_247_];
						}
						if (bool_240_) {
							if (((Class103) class103_245_).anIntArray1347 == null)
								((Class103) this).anIntArray1347[((Class103) this).anInt1368] = -1;
							else
								((Class103) this).anIntArray1347[((Class103) this).anInt1368] = (((Class103) class103_245_).anIntArray1347[i_247_]);
						}
						((Class103) this).aShortArray1337[(((Class103) this).anInt1368)] = (short) method650(class103_245_, (((Class103) class103_245_).aShortArray1337[i_247_]), 107, i_244_);
						((Class103) this).aShortArray1334[(((Class103) this).anInt1368)] = (short) method650(class103_245_, (((Class103) class103_245_).aShortArray1334[i_247_]), -78, i_244_);
						((Class103) this).aShortArray1329[(((Class103) this).anInt1368)] = (short) method650(class103_245_, (((Class103) class103_245_).aShortArray1329[i_247_]), -58, i_244_);
						((Class103) this).aShortArray1338[(((Class103) this).anInt1368)] = i_244_;
						((Class103) this).aShortArray1353[(((Class103) this).anInt1368)] = (((Class103) class103_245_).aShortArray1353[i_247_]);
						((Class103) this).anInt1368++;
					}
					if (((Class103) class103_245_).aClass19Array1364 != null) {
						for (int i_248_ = 0; ((((Class103) class103_245_).aClass19Array1364).length > i_248_); i_248_++) {
							int i_249_ = method650(class103_245_, ((Class19) (((Class103) class103_245_).aClass19Array1364[i_248_])).anInt301, -127, i_244_);
							int i_250_ = method650(class103_245_, ((Class19) (((Class103) class103_245_).aClass19Array1364[i_248_])).anInt309, -95, i_244_);
							int i_251_ = method650(class103_245_, ((Class19) (((Class103) class103_245_).aClass19Array1364[i_248_])).anInt292, 113, i_244_);
							((Class103) this).aClass19Array1364[i_233_] = ((Class103) class103_245_).aClass19Array1364[i_248_].method187(i_249_, i_250_, i_251_, -128);
							i_233_++;
						}
					}
					if (((Class103) class103_245_).aClass162Array1346 != null) {
						for (int i_252_ = 0; i_252_ < (((Class103) class103_245_).aClass162Array1346).length; i_252_++) {
							int i_253_ = method650(class103_245_, ((Class162) (((Class103) class103_245_).aClass162Array1346[i_252_])).anInt2289, 111, i_244_);
							((Class103) this).aClass162Array1346[i_234_] = ((Class103) class103_245_).aClass162Array1346[i_252_].method1076(i_253_, false);
							i_234_++;
						}
					}
				}
			}
			((Class103) this).anInt1354 = ((Class103) this).anInt1331;
			int i_254_ = 0;
			for (int i_255_ = 0; i_255_ < i; i_255_++) {
				short i_256_ = (short) (1 << i_255_);
				Class103 class103_257_ = class103s[i_255_];
				if (class103_257_ != null) {
					for (int i_258_ = 0; ((i_258_ ^ 0xffffffff) > (((Class103) class103_257_).anInt1368 ^ 0xffffffff)); i_258_++) {
						if (bool_238_)
							((Class103) this).f_bb[i_254_++] = (byte) (((((Class103) class103_257_).f_bb == null) || (((Class103) class103_257_).f_bb[i_258_]) == -1) ? -1 : ((((Class103) class103_257_).f_bb[i_258_]) + ((Class103) this).f_db));
					}
					for (int i_259_ = 0; ((Class103) class103_257_).f_db > i_259_; i_259_++) {
						byte i_260_ = (((Class103) this).f_eb[((Class103) this).f_db] = ((Class103) class103_257_).f_eb[i_259_]);
						if ((i_260_ ^ 0xffffffff) == -1) {
							((Class103) this).aShortArray1333[((Class103) this).f_db] = (short) method650(class103_257_, (((Class103) class103_257_).aShortArray1333[i_259_]), -55, i_256_);
							((Class103) this).aShortArray1326[((Class103) this).f_db] = (short) method650(class103_257_, (((Class103) class103_257_).aShortArray1326[i_259_]), -46, i_256_);
							((Class103) this).aShortArray1362[((Class103) this).f_db] = (short) method650(class103_257_, (((Class103) class103_257_).aShortArray1362[i_259_]), 103, i_256_);
						}
						if ((i_260_ ^ 0xffffffff) <= -2 && (i_260_ ^ 0xffffffff) >= -4) {
							((Class103) this).aShortArray1333[((Class103) this).f_db] = (((Class103) class103_257_).aShortArray1333[i_259_]);
							((Class103) this).aShortArray1326[((Class103) this).f_db] = (((Class103) class103_257_).aShortArray1326[i_259_]);
							((Class103) this).aShortArray1362[((Class103) this).f_db] = (((Class103) class103_257_).aShortArray1362[i_259_]);
							((Class103) this).anIntArray1370[(((Class103) this).f_db)] = (((Class103) class103_257_).anIntArray1370[i_259_]);
							((Class103) this).anIntArray1367[(((Class103) this).f_db)] = (((Class103) class103_257_).anIntArray1367[i_259_]);
							((Class103) this).anIntArray1373[(((Class103) this).f_db)] = (((Class103) class103_257_).anIntArray1373[i_259_]);
							((Class103) this).aByteArray1330[(((Class103) this).f_db)] = (((Class103) class103_257_).aByteArray1330[i_259_]);
							((Class103) this).f_ab[((Class103) this).f_db] = ((Class103) class103_257_).f_ab[i_259_];
							((Class103) this).f_fb[((Class103) this).f_db] = ((Class103) class103_257_).f_fb[i_259_];
						}
						if ((i_260_ ^ 0xffffffff) == -3) {
							((Class103) this).anIntArray1335[(((Class103) this).f_db)] = (((Class103) class103_257_).anIntArray1335[i_259_]);
							((Class103) this).anIntArray1366[(((Class103) this).f_db)] = (((Class103) class103_257_).anIntArray1366[i_259_]);
						}
						((Class103) this).f_db++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jq.<init>(" + (class103s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		new Class67("From", "Von:", "De", "De");
		anInt1365 = 0;
		anInt1374 = 0;
		f_gb = new String[200];
		aClass13_1369 = new IncomingPacket(67, 10);
	}
}
