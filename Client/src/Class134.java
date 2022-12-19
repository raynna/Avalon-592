
/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class134 implements Interface4 {
	static int loadingPercentage = 10;
	private int anInt1846;
	static int anInt1847;
	static int anInt1848;
	static int anInt1849;
	static int anInt1850;
	static int anInt1851;
	static int anInt1852;
	static byte[][] aByteArrayArray1853;
	private int anInt1854 = 0;
	static int anInt1855;
	static int anInt1856;
	static int anInt1857;
	static int anInt1858;
	private int anInt1859;
	static int anInt1860;
	static int anInt1861;
	static int anInt1862;
	static int anInt1863;
	static int anInt1864;
	private int anInt1865 = -1;
	private int anInt1866;
	static int anInt1867;
	private int anInt1868;
	static boolean aBool1869;
	static int anInt1870;
	static int anInt1871;
	private Class260_Sub2 aClass260_Sub2_1872;
	static int anInt1873 = -1;
	private static OutgoingPacket aClass201_1874;
	static int anInt1875;
	static int anInt1876;
	static OutgoingPacket aClass201_1877;
	private Interface8[] anInterface8Array1878 = new Interface8[9];
	static Class_c aClass_c1879;

	public static void method900(byte i) {
		try {
			aClass201_1877 = null;
			aClass201_1874 = null;
			aClass_c1879 = null;
			aByteArrayArray1853 = null;
			int i_0_ = -128 / ((10 - i) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.S(" + i + ')');
		}
	}

	static final void method901(int i) {
		do {
			try {
				anInt1858++;
				Class59_Sub3_Sub3.aClass54_6277.method369(false);
				if (i == 51)
					break;
				aClass201_1874 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ml.L(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method902(int i, int i_1_) {
		try {
			anInt1862++;
			if (anInt1865 == -1)
				throw new RuntimeException();
			if (i != 82)
				method910(24, (byte) 78);
			OpenGL.glDrawBuffer(Class215.anIntArray3004[i_1_]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.H(" + i + ',' + i_1_ + ')');
		}
	}

	final void method903(int i, int i_2_) {
		try {
			anInt1867++;
			if (anInterface8Array1878[i] != null)
				anInterface8Array1878[i].method8(122);
			int i_3_ = 20 / ((10 - i_2_) / 52);
			anInt1868 &= 1 << i ^ 0xffffffff;
			anInterface8Array1878[i] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.J(" + i + ',' + i_2_ + ')');
		}
	}

	private final void method904(int i, int i_4_, Class109_Sub1 class109_sub1, int i_5_) {
		try {
			anInt1863++;
			if (anInt1865 == -1)
				throw new RuntimeException();
			int i_6_ = 1 << i;
			if ((anInt1868 & (i_6_ ^ 0xffffffff) ^ 0xffffffff) != -1) {
				if (anInt1846 != ((Class109_Sub1) class109_sub1).anInt3760 || anInt1866 != ((Class109_Sub1) class109_sub1).anInt3752)
					throw new RuntimeException();
			} else {
				anInt1866 = ((Class109_Sub1) class109_sub1).anInt3752;
				anInt1846 = ((Class109_Sub1) class109_sub1).anInt3760;
			}
			if (i_5_ <= 14)
				method900((byte) -25);
			class109_sub1.method1766(i_4_, Class215.anIntArray3004[i], anInt1865, -102);
			anInterface8Array1878[i] = class109_sub1;
			anInt1868 |= i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ml.G(" + i + ',' + i_4_ + ',' + (class109_sub1 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	private final void method905(int i, int i_7_, int i_8_, Class109_Sub4 class109_sub4, int i_9_) {
		try {
			anInt1864++;
			if (anInt1865 == -1)
				throw new RuntimeException();
			int i_10_ = i_8_ << i_7_;
			if ((anInt1868 & (i_10_ ^ 0xffffffff) ^ 0xffffffff) != -1) {
				if (((anInt1846 ^ 0xffffffff) != (((Class109_Sub4) class109_sub4).anInt4571 ^ 0xffffffff)) || ((anInt1866 ^ 0xffffffff) != (((Class109_Sub4) class109_sub4).anInt4571 ^ 0xffffffff)))
					throw new RuntimeException();
			} else {
				anInt1846 = ((Class109_Sub4) class109_sub4).anInt4571;
				anInt1866 = ((Class109_Sub4) class109_sub4).anInt4571;
			}
			class109_sub4.method2027(anInt1865, i, i_9_, (byte) 126, Class215.anIntArray3004[i_7_]);
			anInterface8Array1878[i_7_] = class109_sub4;
			anInt1868 |= i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ml.N(" + i + ',' + i_7_ + ',' + i_8_ + ',' + (class109_sub4 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
		}
	}

	public final void method8(int i) {
		try {
			if (i < -120) {
				anInt1856++;
				OpenGL.glBindFramebufferEXT(36160, 0);
				anInt1854 &= ~0x4;
				anInt1865 = method912(-90);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.F(" + i + ')');
		}
	}

	final void method906(Class246_Sub1_Sub12 class246_sub1_sub12, int i, byte i_11_) {
		try {
			anInt1870++;
			if (i_11_ >= -86)
				method912(39);
			if ((anInt1865 ^ 0xffffffff) == 0)
				throw new RuntimeException();
			int i_12_ = 1 << i;
			if ((anInt1868 & (i_12_ ^ 0xffffffff)) != 0) {
				if (((anInt1846 ^ 0xffffffff) != (((Class246_Sub1_Sub12) class246_sub1_sub12).anInt6254 ^ 0xffffffff)) || ((anInt1866 ^ 0xffffffff) != ((((Class246_Sub1_Sub12) class246_sub1_sub12).anInt6253) ^ 0xffffffff)))
					throw new RuntimeException();
			} else {
				anInt1846 = ((Class246_Sub1_Sub12) class246_sub1_sub12).anInt6254;
				anInt1866 = ((Class246_Sub1_Sub12) class246_sub1_sub12).anInt6253;
			}
			class246_sub1_sub12.method2617(true, Class215.anIntArray3004[i], anInt1865);
			anInterface8Array1878[i] = class246_sub1_sub12;
			anInt1868 |= i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ml.Q(" + (class246_sub1_sub12 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ')'));
		}
	}

	final int method907(byte i) {
		try {
			if (i != -20)
				anInt1854 = 36;
			anInt1847++;
			return anInt1866;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.R(" + i + ')');
		}
	}

	public final void method7(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36160, anInt1859);
			anInt1876++;
			anInt1854 |= 0x4;
			int i_13_ = -13 / ((-28 - i) / 45);
			anInt1865 = method912(123);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.B(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt1871++;
			aClass260_Sub2_1872.method1941(true, anInt1859);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.finalize(" + ')');
		}
	}

	final boolean method908(int i) {
		try {
			anInt1850++;
			int i_14_ = OpenGL.glCheckFramebufferStatusEXT(anInt1865);
			if ((i_14_ ^ 0xffffffff) != i)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.P(" + i + ')');
		}
	}

	static final void method909(int i, Class246_Sub35 class246_sub35, int i_15_, boolean bool) {
		do {
			try {
				anInt1852++;
				if (class246_sub35 != null && class246_sub35 != (((Class166) Class108.aClass166_1525).aClass246_2343)) {
					int x = ((Class246_Sub35) class246_sub35).anInt5151;
					int y = ((Class246_Sub35) class246_sub35).anInt5154;
					int i_18_ = ((Class246_Sub35) class246_sub35).anInt5156;
					int i_19_ = (int) ((Class246_Sub35) class246_sub35).aLong5157;
					if (i_18_ >= 2000)
						i_18_ -= 2000;
					long l = ((Class246_Sub35) class246_sub35).aLong5157;
					if (i_18_ == 1004 || (i_18_ ^ 0xffffffff) == -1013 || i_18_ == 1008 || i_18_ == 1001 || i_18_ == 1006)
						Class246_Sub28_Sub31.method2852(i_18_, true, x, i_19_);
					if ((i_18_ ^ 0xffffffff) == -46) {
						Class7.anInt97 = i_15_;
						Class107.anInt1508 = i;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class3.anInt25++;
						Class243.writePacket(-62, Class169.OBJECT_CLICK_2_PACKET);
						Class130_Sub1.stream.writeShort128((byte) -123, x + Class39_Sub1.anInt4670);
						Class130_Sub1.stream.writeShort128((byte) -120, Class47.anInt686 + y);
						Class130_Sub1.stream.writeShortLE128((byte) -113, 0x7fffffff & (int) (l >>> 32));
						Class130_Sub1.stream.writeByte(255, (!Class216.aClass232_3009.method1488(-109, 82) ? 0 : 1));
						Class254.method1639(22, l, x, y);
					}
					if ((i_18_ ^ 0xffffffff) == -11) {
						Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
						if (class_r_sub1 != null) {
							Class6.anInt82++;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class7.anInt97 = i_15_;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-123, (Class246_Sub28_Sub19.aClass201_6533));
							Class130_Sub1.stream.writeShortLE128((byte) -88, i_19_);
							Class130_Sub1.stream.method2358((byte) 23, (Class216.aClass232_3009.method1488(-90, 82) ? 1 : 0));
							Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 124);
						}
					}
					if (i_18_ == 15) {
						Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
						if (class_r_sub2 != null) {
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class101.anInt1311++;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class7.anInt97 = i_15_;
							Class243.writePacket(-112, Class63_Sub1.aClass201_4715);
							Class130_Sub1.stream.write128Byte(0, (!Class216.aClass232_3009.method1488(-83, 82) ? 0 : 1));
							Class130_Sub1.stream.writeShort((byte) 67, i_19_);
							Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 111);
						}
					}
					if ((i_18_ ^ 0xffffffff) == -47) {
						Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
						if (class_r_sub1 != null) {
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class7.anInt97 = i_15_;
							Class56.anInt794++;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-90, (Class246_Sub19_Sub2.aClass201_6811));
							Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
							Class130_Sub1.stream.writeShortLE128((byte) -75, i_19_);
							Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
							Class130_Sub1.stream.writeShort((byte) 67, Class_b.anInt1161);
							Class130_Sub1.stream.method2358((byte) 23, (!Class216.aClass232_3009.method1488(-93, 82) ? 0 : 1));
							Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 99);
						}
					}
					if (i_18_ == 6) {
						Class107.anInt1508 = i;
						Class32.anInt439++;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class7.anInt97 = i_15_;
						Class243.writePacket(-59, Class246_Sub35.aClass201_5158);
						Class130_Sub1.stream.writeByte(255, (!Class216.aClass232_3009.method1488(-85, 82) ? 0 : 1));
						Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
						Class130_Sub1.stream.writeShortLE128((byte) -53, Class47.anInt686 + y);
						Class130_Sub1.stream.writeShort128((byte) -107, i_19_);
						Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
						Class130_Sub1.stream.writeShortLE(x - -Class39_Sub1.anInt4670, (byte) 84);
						Class130_Sub1.stream.writeShortLE(Class_b.anInt1161, (byte) 78);
						Class246_Sub1_Sub7.method2548(x, 29310, y);
					}
					if ((i_18_ ^ 0xffffffff) == -60) {
						if (Class260_Sub2.anInt4289 <= 0 || !Class216.aClass232_3009.method1488(-125, 82) || !Class216.aClass232_3009.method1488(-87, 81)) {
							Class107.anInt1508 = i;
							Class246_Sub28_Sub4.anInt5976 = 1;
							Class15.anInt229++;
							Class7.anInt97 = i_15_;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-116, Class94.aClass201_1231);
							Class130_Sub1.stream.writeShort128((byte) -117, x + Class39_Sub1.anInt4670);
							Class130_Sub1.stream.writeShortLE128((byte) -101, y + Class47.anInt686);
						} else
							Class246_Sub41_Sub2.method2680((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053), 63, Class47.anInt686 + y, x + Class39_Sub1.anInt4670);
					}
					if ((i_18_ ^ 0xffffffff) == -59) {
						Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
						if (class_r_sub1 != null) {
							Class107.anInt1508 = i;
							Class7.anInt97 = i_15_;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class196.anInt2751++;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-80, Class130_Sub3.PLAYER_OPTION_1_PACKET);
							Class130_Sub1.stream.writeShort128((byte) -108, i_19_);
							Class130_Sub1.stream.writeByte(255, (!Class216.aClass232_3009.method1488(-103, 82) ? 0 : 1));
							Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 123);
						}
					}
					if ((i_18_ ^ 0xffffffff) == -9) {
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class56.anInt794++;
						Class7.anInt97 = i_15_;
						Class107.anInt1508 = i;
						Class243.writePacket(-71, (Class246_Sub19_Sub2.aClass201_6811));
						Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
						Class130_Sub1.stream.writeShortLE128((byte) -114, ((Actor) Class_a.aClass_r_Sub1_1180).f_db);
						Class130_Sub1.stream.writeShort((byte) 67, Class87.anInt1145);
						Class130_Sub1.stream.writeShort((byte) 67, Class_b.anInt1161);
						Class130_Sub1.stream.method2358((byte) 23, (!Class216.aClass232_3009.method1488(-128, 82) ? 0 : 1));
					}
					if ((i_18_ ^ 0xffffffff) == -22) {
						Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
						if (class_r_sub2 != null) {
							Class107.anInt1508 = i;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class7.anInt97 = i_15_;
							Class99.anInt1282++;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-86, Class246_Sub26.NPC_CLICK_2_PACKET);
							Class130_Sub1.stream.method2358((byte) 23, (!Class216.aClass232_3009.method1488(-103, 82) ? 0 : 1));
							Class130_Sub1.stream.writeShortLE(i_19_, (byte) 123);
							Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 119);
						}
					}
					if ((i_18_ ^ 0xffffffff) == -24) {
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class107.anInt1508 = i;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class7.anInt97 = i_15_;
						Class_e.anInt1212++;
						Class243.writePacket(-97, Class260.OBJECT_CLICK_3_PACKET);
						Class130_Sub1.stream.writeShortLE(Class39_Sub1.anInt4670 + x, (byte) 113);
						Class130_Sub1.stream.writeByte(255, (!Class216.aClass232_3009.method1488(-110, 82) ? 0 : 1));
						Class130_Sub1.stream.writeShort((byte) 67, Class47.anInt686 + y);
						Class130_Sub1.stream.writeShortLE128((byte) -103, 0x7fffffff & (int) (l >>> 32));
						Class254.method1639(22, l, x, y);
					}
					if ((i_18_ ^ 0xffffffff) == -26) {
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class246_Sub6.anInt3926++;
						Class107.anInt1508 = i;
						Class7.anInt97 = i_15_;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class243.writePacket(-117, Class79_Sub1.aClass201_5165);
						Class130_Sub1.stream.writeShortLE128((byte) -60, y + Class47.anInt686);
						Class130_Sub1.stream.writeShort128((byte) -115, (int) (l >>> 32) & 0x7fffffff);
						Class130_Sub1.stream.writeShortLE128((byte) -79, Class39_Sub1.anInt4670 + x);
						Class130_Sub1.stream.readByteC((!Class216.aClass232_3009.method1488(-92, 82) ? 0 : 1), -2);
						Class254.method1639(22, l, x, y);
					}
					if (i_18_ == 49) {
						Class107.anInt1508 = i;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class109_Sub1_Sub1.anInt6723++;
						Class7.anInt97 = i_15_;
						Class243.writePacket(-94, Class260.aClass201_3725);
						Class130_Sub1.stream.write128Byte(0, (!Class216.aClass232_3009.method1488(-77, 82) ? 0 : 1));
						Class130_Sub1.stream.writeShort((byte) 67, Class47.anInt686 + y);
						Class130_Sub1.stream.writeShortLE(i_19_, (byte) 85);
						Class130_Sub1.stream.writeShort((byte) 67, Class39_Sub1.anInt4670 + x);
						Class246_Sub1_Sub7.method2548(x, 29310, y);
					}
					if (i_18_ == 1007) {
						Class107.anInt1508 = i;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class7.anInt97 = i_15_;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class246_Sub28_Sub3.anInt5895++;
						Class243.writePacket(-85, Class38_Sub1_Sub1.aClass201_6766);
						Class130_Sub1.stream.writeByte(255, (!Class216.aClass232_3009.method1488(-76, 82) ? 0 : 1));
						Class130_Sub1.stream.writeShortLE(y + Class47.anInt686, (byte) 105);
						Class130_Sub1.stream.writeShort128((byte) -107, 0x7fffffff & (int) (l >>> 32));
						Class130_Sub1.stream.writeShort((byte) 67, x - -Class39_Sub1.anInt4670);
						Class254.method1639(22, l, x, y);
					}
					if ((i_18_ ^ 0xffffffff) == -17) {
						Class107.anInt1508 = i;
						Class246_Sub28_Sub19.anInt6547 = 0;
						Class7.anInt97 = i_15_;
						Class246_Sub25.anInt4877++;
						Class246_Sub28_Sub4.anInt5976 = 2;
						Class243.writePacket(-65, Class194_Sub1.TAKE_GROUND_ITEM_PACKET);
						Class130_Sub1.stream.writeShort128((byte) -107, i_19_);
						Class130_Sub1.stream.readByteC((!Class216.aClass232_3009.method1488(-116, 82) ? 0 : 1), -2);
						Class130_Sub1.stream.writeShort((byte) 67, Class39_Sub1.anInt4670 + x);
						Class130_Sub1.stream.writeShortLE128((byte) -49, y - -Class47.anInt686);
						Class246_Sub1_Sub7.method2548(x, 29310, y);
					}
					if ((i_18_ ^ 0xffffffff) == -61 && Class163.aClass235_2312 == null) {
						Class51.method339(y, 0, x);
						Class163.aClass235_2312 = Class211.method1390(y, x, (byte) 22);
						Stream_Sub1.method2483(Class163.aClass235_2312, (byte) -109);
					}
					if (i_18_ == 9) {
						Class235 class235 = Class211.method1390(y, x, (byte) 126);
						if (class235 != null) {
							Class59_Sub4.method2209((byte) -115);
							Class246_Sub27 class246_sub27 = client.method2971(class235);
							Class155.method1029(((Class246_Sub27) class246_sub27).anInt4898, class246_sub27.method2126(16693), class235, (byte) -38);
							Class218.aString3026 = Class179.method1174(class235, (byte) 120);
							if (Class218.aString3026 == null)
								Class218.aString3026 = "Null";
							Class246_Sub7.aString3964 = ((Class235) class235).f_jb + "<col=ffffff>";
						}
					} else {
						if ((i_18_ ^ 0xffffffff) == -13) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class107.anInt1508 = i;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class7.anInt97 = i_15_;
								Class256.anInt3681++;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class243.writePacket(-52, (Class246_Sub1_Sub4_Sub1.PLAYER_OPTION_4_PACKET));
								Class130_Sub1.stream.write128Byte(0, !Class216.aClass232_3009.method1488(-106, 82) ? 0 : 1);
								Class130_Sub1.stream.writeShortLE128((byte) -120, i_19_);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 105);
							}
						}
						if ((i_18_ ^ 0xffffffff) == -58) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class107.anInt1508 = i;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class7.anInt97 = i_15_;
								Class104.anInt1394++;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class243.writePacket(-73, (Class246_Sub15.aClass201_4442));
								Class130_Sub1.stream.write128Byte(0, Class216.aClass232_3009.method1488(-100, 82) ? 1 : 0);
								Class130_Sub1.stream.writeShort128((byte) -112, i_19_);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 99);
							}
						}
						if (i_18_ == 30) {
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class7.anInt97 = i_15_;
							Class245.anInt3460++;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-87, (InputStream_Sub1.INTERFACE_ON_OBJECT_PACKET));
							Class130_Sub1.stream.writeShort128((byte) -127, x + Class39_Sub1.anInt4670);
							Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
							Class130_Sub1.stream.writeShort128((byte) -117, Class_b.anInt1161);
							Class130_Sub1.stream.writeShort128((byte) -115, Class87.anInt1145);
							Class130_Sub1.stream.readByteC((Class216.aClass232_3009.method1488(-76, 82) ? 1 : 0), -2);
							Class130_Sub1.stream.writeShort((byte) 67, Class47.anInt686 + y);
							Class130_Sub1.stream.writeShortLE128((byte) -107, 0x7fffffff & (int) (l >>> 32));
							Class254.method1639(22, l, x, y);
						}
						if (i_18_ == 19) {
							Class7.anInt97 = i_15_;
							Class197.anInt2789++;
							Class107.anInt1508 = i;
							Class246_Sub28_Sub4.anInt5976 = 1;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-88, Class123.aClass201_1702);
							Class130_Sub1.stream.writeShort128((byte) -122, x + Class39_Sub1.anInt4670);
							Class130_Sub1.stream.readIntV2(-1276441384, Class231.anInt3168);
							Class130_Sub1.stream.writeShort128((byte) -106, Class87.anInt1145);
							Class130_Sub1.stream.writeShort128((byte) -105, Class_b.anInt1161);
							Class130_Sub1.stream.writeShort((byte) 67, Class47.anInt686 + y);
							Class90.method570(0, y, x, 1, true, 1, 0, -4, 105);
						}
						if (i_18_ == 47) {
							Class235 class235 = Class211.method1390(y, x, (byte) -102);
							if (class235 != null)
								Class109.method754(class235, 27254);
						}
						if (i_18_ == 50) {
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
							if (class_r_sub2 != null) {
								Class7.anInt97 = i_15_;
								Class107.anInt1508 = i;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class40_Sub3.anInt4055++;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class243.writePacket(-108, Class142.aClass201_2060);
								Class130_Sub1.stream.method2358((byte) 23, (Class216.aClass232_3009.method1488(-93, 82) ? 1 : 0));
								Class130_Sub1.stream.writeShortLE128((byte) -90, i_19_);
								Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 103);
							}
						}
						if ((i_18_ ^ 0xffffffff) == -6) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class107.anInt1508 = i;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class7.anInt97 = i_15_;
								Class232_Sub1.anInt5547++;
								Class243.writePacket(-93, Class_e.aClass201_1214);
								Class130_Sub1.stream.writeShortLE128((byte) -75, i_19_);
								Class130_Sub1.stream.write128Byte(0, Class216.aClass232_3009.method1488(-98, 82) ? 1 : 0);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 119);
							}
						}
						if (i_18_ == 22) {
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
							if (class_r_sub2 != null) {
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class_ds.anInt6720++;
								Class7.anInt97 = i_15_;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class107.anInt1508 = i;
								Class243.writePacket(-63, (Class246_Sub28_Sub23.aClass201_6657));
								Class130_Sub1.stream.writeShort128((byte) -105, i_19_);
								Class130_Sub1.stream.writeShortLE128((byte) -109, Class87.anInt1145);
								Class130_Sub1.stream.writeInt(Class231.anInt3168, (byte) 121);
								Class130_Sub1.stream.writeShortLE128((byte) -73, Class_b.anInt1161);
								Class130_Sub1.stream.writeByte(255, !Class216.aClass232_3009.method1488(-101, 82) ? 0 : 1);
								Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 123);
							}
						}
						if (i_18_ == 48 || (i_18_ ^ 0xffffffff) == -1003)
							Class235.method1511(bool, i_19_, ((Class246_Sub35) class246_sub35).aString5152, y, x);
						if ((i_18_ ^ 0xffffffff) == -3) {
							Class7.anInt97 = i_15_;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class246_Sub17.anInt4656++;
							Class243.writePacket(-123, aClass201_1874);
							Class130_Sub1.stream.writeShort128((byte) -112, i_19_);
							Class130_Sub1.stream.writeShort((byte) 67, x - -Class39_Sub1.anInt4670);
							Class130_Sub1.stream.writeShort128((byte) -121, y - -Class47.anInt686);
							Class130_Sub1.stream.method2358((byte) 23, (!Class216.aClass232_3009.method1488(-104, 82) ? 0 : 1));
							Class246_Sub1_Sub7.method2548(x, 29310, y);
						}
						if ((i_18_ ^ 0xffffffff) == -19) {
							Class107.anInt1508 = i;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class7.anInt97 = i_15_;
							Class244.anInt3451++;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class243.writePacket(-90, (Class246_Sub28_Sub8.OBJECT_CLICK_1_PACKET));
							Class130_Sub1.stream.writeShortLE128((byte) -84, x + Class39_Sub1.anInt4670);
							Class130_Sub1.stream.writeByte(255, (Class216.aClass232_3009.method1488(-100, 82) ? 1 : 0));
							Class130_Sub1.stream.writeShort((byte) 67, (int) (l >>> 32) & 0x7fffffff);
							Class130_Sub1.stream.writeShort((byte) 67, y - -Class47.anInt686);
							Class254.method1639(22, l, x, y);
						}
						if (i_18_ == 3) {
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
							if (class_r_sub2 != null) {
								Class7.anInt97 = i_15_;
								Class107.anInt1508 = i;
								Class210.anInt2953++;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class243.writePacket(-119, Class239.NPC_CLICK_3_PACKET);
								Class130_Sub1.stream.writeShortLE128((byte) -121, i_19_);
								Class130_Sub1.stream.write128Byte(0, Class216.aClass232_3009.method1488(-92, 82) ? 1 : 0);
								Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 115);
							}
						}
						if (bool != true)
							anInt1873 = 103;
						if ((i_18_ ^ 0xffffffff) == -18) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class7.anInt97 = i_15_;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class107.anInt1508 = i;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class143.anInt2066++;
								Class243.writePacket(-113, aClass201_1877);
								Class130_Sub1.stream.method2358((byte) 23, (Class216.aClass232_3009.method1488(-84, 82) ? 1 : 0));
								Class130_Sub1.stream.writeShort((byte) 67, i_19_);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 103);
							}
						}
						if (i_18_ == 1003) {
							Class7.anInt97 = i_15_;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class107.anInt1508 = i;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
							if (class_r_sub2 != null) {
								Class253 class253 = (((Npc) class_r_sub2).aClass253_7184);
								if (((Class253) class253).anIntArray3594 != null)
									class253 = (class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658)));
								if (class253 != null) {
									Class218.anInt3033++;
									Class243.writePacket(-96, (Class246_Sub28_Sub27.NPC_EXAMINE_PACKET));
									Class130_Sub1.stream.writeShort((byte) 67, ((Class253) class253).anInt3587);
								}
							}
						}
						if ((i_18_ ^ 0xffffffff) == -14) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class7.anInt97 = i_15_;
								Class68.anInt895++;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class107.anInt1508 = i;
								Class243.writePacket(-113, (Class21_Sub4.PLAYER_OPTION_2_PACKET));
								Class130_Sub1.stream.writeShort128((byte) -127, i_19_);
								Class130_Sub1.stream.writeByte(255, !Class216.aClass232_3009.method1488(-114, 82) ? 0 : 1);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 125);
							}
						}
						if (i_18_ == 44) {
							if (Class260_Sub2.anInt4289 > 0 && Class216.aClass232_3009.method1488(-104, 82) && Class216.aClass232_3009.method1488(-119, 81))
								Class246_Sub41_Sub2.method2680(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053, 63, y + Class47.anInt686, x + Class39_Sub1.anInt4670);
							else {
								Class40_Sub9.method2309(x, -120, i_19_, y);
								if (i_19_ == 1) {
									Class130_Sub1.stream.writeByte(255, -1);
									Class130_Sub1.stream.writeByte(255, -1);
									Class130_Sub1.stream.writeShort((byte) 67, (int) Class204.aFloat2881);
									Class130_Sub1.stream.writeByte(255, 57);
									Class130_Sub1.stream.writeByte(255, Class95.anInt1253);
									Class130_Sub1.stream.writeByte(255, Class246_Sub12.anInt4405);
									Class130_Sub1.stream.writeByte(255, 89);
									Class130_Sub1.stream.writeShort((byte) 67, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060));
									Class130_Sub1.stream.writeShort((byte) 67, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059));
									Class130_Sub1.stream.writeByte(255, 63);
								} else {
									Class246_Sub28_Sub4.anInt5976 = 1;
									Class246_Sub28_Sub19.anInt6547 = 0;
									Class107.anInt1508 = i;
									Class7.anInt97 = i_15_;
								}
								Class90.method570(0, y, x, 1, true, 1, 0, -4, 112);
							}
						}
						if (i_18_ == 51) {
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class7.anInt97 = i_15_;
							Class107.anInt1508 = i;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class194_Sub2.anInt4948++;
							Class243.writePacket(-70, Class61.aClass201_840);
							Class130_Sub1.stream.writeShort((byte) 67, i_19_);
							Class130_Sub1.stream.write128Byte(0, (Class216.aClass232_3009.method1488(-97, 82) ? 1 : 0));
							Class130_Sub1.stream.writeShortLE128((byte) -88, x + Class39_Sub1.anInt4670);
							Class130_Sub1.stream.writeShortLE128((byte) -56, y + Class47.anInt686);
							Class246_Sub1_Sub7.method2548(x, 29310, y);
						}
						if ((i_18_ ^ 0xffffffff) == -1011) {
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class7.anInt97 = i_15_;
							Class18.anInt262++;
							Class107.anInt1508 = i;
							Class243.writePacket(-66, Class246_Sub12.OBJECT_EXAMINE_PACKET);
							Class130_Sub1.stream.writeShort((byte) 67, i_19_);
						}
						if ((i_18_ ^ 0xffffffff) == -1010) {
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class107.anInt1508 = i;
							Class59_Sub5_Sub1.anInt5818++;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class7.anInt97 = i_15_;
							Class243.writePacket(-118, Class120.GROUND_ITEM_EXAMINE_PACKET);
							Class130_Sub1.stream.writeShort((byte) 67, i_19_);
						}
						if (i_18_ == 4) {
							Class130.anInt1819++;
							Class246_Sub28_Sub4.anInt5976 = 2;
							Class246_Sub28_Sub19.anInt6547 = 0;
							Class7.anInt97 = i_15_;
							Class107.anInt1508 = i;
							Class243.writePacket(-126, Class185.aClass201_2592);
							Class130_Sub1.stream.writeShortLE(x + Class39_Sub1.anInt4670, (byte) 121);
							Class130_Sub1.stream.writeShortLE(Class47.anInt686 + y, (byte) 97);
							Class130_Sub1.stream.writeShortLE128((byte) -106, i_19_);
							Class130_Sub1.stream.writeByte(255, (Class216.aClass232_3009.method1488(-90, 82) ? 1 : 0));
							Class246_Sub1_Sub7.method2548(x, 29310, y);
						}
						if ((i_18_ ^ 0xffffffff) == -21) {
							Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[i_19_];
							if (class_r_sub1 != null) {
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class73.anInt957++;
								Class7.anInt97 = i_15_;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class107.anInt1508 = i;
								Class243.writePacket(-87, (Class59_Sub3_Sub2.aClass201_5869));
								Class130_Sub1.stream.method2358((byte) 23, (Class216.aClass232_3009.method1488(-114, 82) ? 1 : 0));
								Class130_Sub1.stream.writeShortLE(i_19_, (byte) 113);
								Class90.method570(0, ((Actor) class_r_sub1).f_nc[0], ((Actor) class_r_sub1).f_mc[0], class_r_sub1.method2670((byte) 127), true, class_r_sub1.method2670((byte) 127), 0, -2, 100);
							}
						}
						if ((i_18_ ^ 0xffffffff) == -12) {
							Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_19_];
							if (class_r_sub2 != null) {
								Class107.anInt1508 = i;
								Class246_Sub28_Sub19.anInt6547 = 0;
								Class7.anInt97 = i_15_;
								Class139.anInt1985++;
								Class246_Sub28_Sub4.anInt5976 = 2;
								Class243.writePacket(-108, Class197.NPC_CLICK_1_PACKET_NEW);
								Class130_Sub1.stream.write128Byte(0, !Class216.aClass232_3009.method1488(-72, 82) ? 0 : 1);
								Class130_Sub1.stream.writeShort((byte) 67, i_19_);
								Class90.method570(0, ((Actor) class_r_sub2).f_nc[0], ((Actor) class_r_sub2).f_mc[0], class_r_sub2.method2670((byte) 127), true, class_r_sub2.method2670((byte) 127), 0, -2, 126);
							}
						}
						if (Class187.aBool2653)
							Class59_Sub4.method2209((byte) 127);
						if (Class211.aClass235_2962 == null || Class246_Sub28_Sub5.anInt6006 != 0)
							break;
						Stream_Sub1.method2483(Class211.aClass235_2962, (byte) -109);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ml.I(" + i + ',' + (class246_sub35 != null ? "{...}" : "null") + ',' + i_15_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public final void method12(byte i) {
		try {
			OpenGL.glBindFramebufferEXT(36008, anInt1859);
			anInt1849++;
			anInt1854 |= 0x1;
			if (i == 45)
				anInt1865 = method912(127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.A(" + i + ')');
		}
	}

	public final void method11(int i) {
		try {
			anInt1875++;
			if (i < -51) {
				OpenGL.glBindFramebufferEXT(36008, 0);
				anInt1854 &= ~0x1;
				anInt1865 = method912(53);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.D(" + i + ')');
		}
	}

	final void method910(int i, byte i_20_) {
		try {
			anInt1860++;
			if (anInt1865 == -1)
				throw new RuntimeException();
			if (i_20_ != 5)
				method907((byte) 115);
			OpenGL.glReadBuffer(Class215.anIntArray3004[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.M(" + i + ',' + i_20_ + ')');
		}
	}

	public final void method10(int i) {
		do {
			try {
				OpenGL.glBindFramebufferEXT(36009, anInt1859);
				anInt1861++;
				anInt1854 |= 0x2;
				anInt1865 = method912(14);
				if (i == -20741)
					break;
				method908(82);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ml.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method911(int i, int i_21_, Class109_Sub4 class109_sub4, int i_22_) {
		do {
			try {
				anInt1851++;
				method905(0, i, 1, class109_sub4, i_22_);
				if (i_21_ == -1)
					break;
				anInt1859 = 119;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ml.T(" + i + ',' + i_21_ + ',' + (class109_sub4 != null ? "{...}" : "null") + ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	private final int method912(int i) {
		try {
			anInt1857++;
			if ((0x4 & anInt1854) != 0)
				return 36160;
			if ((0x2 & anInt1854) != 0)
				return 36009;
			int i_23_ = 23 / ((i - 88) / 32);
			if ((0x1 & anInt1854 ^ 0xffffffff) != -1)
				return 36008;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.K(" + i + ')');
		}
	}

	public final void method9(int i) {
		try {
			anInt1848++;
			OpenGL.glBindFramebufferEXT(36009, 0);
			anInt1854 &= ~0x2;
			anInt1865 = method912(126);
			int i_24_ = 96 % ((61 - i) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.E(" + i + ')');
		}
	}

	final void method913(byte i, Class109_Sub1 class109_sub1, int i_25_) {
		try {
			if (i == 76) {
				method904(i_25_, 0, class109_sub1, 55);
				anInt1855++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ml.O(" + i + ',' + (class109_sub1 != null ? "{...}" : "null") + ',' + i_25_ + ')'));
		}
	}

	Class134(Class260_Sub2 class260_sub2) {
		try {
			if (!((Class260_Sub2) class260_sub2).aBool4322)
				throw new IllegalStateException("");
			aClass260_Sub2_1872 = class260_sub2;
			OpenGL.glGenFramebuffersEXT(1, Class246_Sub30_Sub1.anIntArray5765, 0);
			anInt1859 = Class246_Sub30_Sub1.anIntArray5765[0];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ml.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aBool1869 = false;
		aClass201_1874 = new OutgoingPacket(26, 7);
		aClass201_1877 = new OutgoingPacket(68, 3);
	}
}
