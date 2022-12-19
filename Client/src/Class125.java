
/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class125 {
	private long aLong1753;
	static int anInt1754;
	static int anInt1755;
	static IncomingPacket aClass13_1756;
	static int anInt1757;
	private long aLong1758 = -1L;
	private Class192 aClass192_1759;
	static int anInt1760;
	private long aLong1761;
	private long aLong1762;
	static int anInt1763;
	static int anInt1764;
	static int anInt1765;
	private byte[] aByteArray1766;
	private long aLong1767;
	static int anInt1768 = 0;
	static int anInt1769;
	private int anInt1770 = 0;
	private long aLong1771;
	static int anInt1772;
	private int anInt1773;
	private byte[] aByteArray1774;
	static int anInt1775;
	static int anInt1776;
	static int anInt1777;

	final void method852(byte[] is, int i) throws IOException {
		try {
			method861(is.length, (byte) 110, is, 0);
			int i_0_ = 69 / ((-2 - i) / 41);
			anInt1755++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.L(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final long method853(boolean bool) {
		try {
			if (bool != true)
				method863(-42);
			anInt1772++;
			return aLong1771;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.D(" + bool + ')');
		}
	}

	final void method854(int i, byte i_1_, byte[] is, int i_2_) throws IOException {
		try {
			anInt1764++;
			try {
				if (i_1_ <= 125)
					method855(null, -58, null);
				if ((aLong1771 ^ 0xffffffffffffffffL) > ((long) i_2_ + aLong1753 ^ 0xffffffffffffffffL))
					aLong1771 = (long) i_2_ + aLong1753;
				if ((aLong1758 ^ 0xffffffffffffffffL) != 0L && (aLong1758 > aLong1753 || ((aLong1753 ^ 0xffffffffffffffffL) < (aLong1758 + (long) anInt1770 ^ 0xffffffffffffffffL))))
					method862((byte) 48);
				if ((aLong1758 ^ 0xffffffffffffffffL) != 0L && ((aLong1753 + (long) i_2_ ^ 0xffffffffffffffffL) < (aLong1758 + (long) aByteArray1766.length ^ 0xffffffffffffffffL))) {
					int i_3_ = (int) (aLong1758 + -aLong1753 + (long) aByteArray1766.length);
					Class117.method805(is, i, aByteArray1766, (int) (-aLong1758 + aLong1753), i_3_);
					i += i_3_;
					aLong1753 += (long) i_3_;
					i_2_ -= i_3_;
					anInt1770 = aByteArray1766.length;
					method862((byte) 48);
				}
				if ((i_2_ ^ 0xffffffff) < (aByteArray1766.length ^ 0xffffffff)) {
					if ((aLong1761 ^ 0xffffffffffffffffL) != (aLong1753 ^ 0xffffffffffffffffL)) {
						aClass192_1759.method1263(aLong1753, 0);
						aLong1761 = aLong1753;
					}
					aClass192_1759.method1265(i, i_2_, is, 1);
					aLong1761 += (long) i_2_;
					if ((aLong1761 ^ 0xffffffffffffffffL) < (aLong1762 ^ 0xffffffffffffffffL))
						aLong1762 = aLong1761;
					long l = -1L;
					long l_4_ = -1L;
					if (((aLong1753 ^ 0xffffffffffffffffL) > (aLong1767 ^ 0xffffffffffffffffL)) || ((aLong1767 + (long) anInt1773 ^ 0xffffffffffffffffL) >= (aLong1753 ^ 0xffffffffffffffffL))) {
						if (aLong1767 >= aLong1753 && ((aLong1767 ^ 0xffffffffffffffffL) > ((long) i_2_ + aLong1753 ^ 0xffffffffffffffffL)))
							l = aLong1767;
					} else
						l = aLong1753;
					if (((aLong1767 ^ 0xffffffffffffffffL) <= ((long) i_2_ + aLong1753 ^ 0xffffffffffffffffL)) || ((long) i_2_ + aLong1753 > (long) anInt1773 + aLong1767)) {
						if (((aLong1767 + (long) anInt1773 ^ 0xffffffffffffffffL) < (aLong1753 ^ 0xffffffffffffffffL)) && (aLong1753 - -(long) i_2_ >= aLong1767 + (long) anInt1773))
							l_4_ = (long) anInt1773 + aLong1767;
					} else
						l_4_ = (long) i_2_ + aLong1753;
					if (l > -1L && ((l ^ 0xffffffffffffffffL) > (l_4_ ^ 0xffffffffffffffffL))) {
						int i_5_ = (int) (-l + l_4_);
						Class117.method805(is, (int) (l + (long) i - aLong1753), aByteArray1774, (int) (-aLong1767 + l), i_5_);
					}
					aLong1753 += (long) i_2_;
				} else if ((i_2_ ^ 0xffffffff) < -1) {
					if (aLong1758 == -1L)
						aLong1758 = aLong1753;
					Class117.method805(is, i, aByteArray1766, (int) (aLong1753 - aLong1758), i_2_);
					aLong1753 += (long) i_2_;
					if (-aLong1758 + aLong1753 > (long) anInt1770)
						anInt1770 = (int) (-aLong1758 + aLong1753);
				}
			} catch (IOException ioexception) {
				aLong1761 = -1L;
				throw ioexception;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lq.A(" + i + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	static final void method855(Interface6 interface6, int i, Class260 class260) {
		try {
			anInt1754++;
			if (Class79.aClass246_Sub1_Sub5_1020 != null) {
				if (Class39.anInt571 < 10) {
					if (!Class79.aClass_fs1023.method90(-1, ((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).aString5846)) {
						Class39.anInt571 = (Class246_Sub16.index23.method100(((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).aString5846, (byte) 33)) / 10;
						return;
					}
					Class246_Sub40.method2312(false);
					Class39.anInt571 = 10;
				}
				if (Class39.anInt571 == 10) {
					Class79.anInt1057 = (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5833) >> 6 << 6;
					Class79.anInt1041 = (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5842) >> 6 << 6;
					Class79.anInt1054 = 64 + (-Class79.anInt1057 + (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5838 >> 6 << 6));
					Class79.anInt1058 = (64 + -Class79.anInt1041 + (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5845 >> 6 << 6));
					int[] is = new int[3];
					int i_6_ = -1;
					int i_7_ = -1;
					if (Class79.aClass246_Sub1_Sub5_1020.method2471(false, is, ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 >> 7) + Class47.anInt686, (Class39_Sub1.anInt4670 - -((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060) >> 7)))) {
						i_6_ = -Class79.anInt1057 + is[1];
						i_7_ = is[2] - Class79.anInt1041;
					}
					if (Class246_Sub8.aBool3980 || i_6_ < 0 || (Class79.anInt1054 ^ 0xffffffff) >= (i_6_ ^ 0xffffffff) || (i_7_ ^ 0xffffffff) > -1 || Class79.anInt1058 <= i_7_) {
						if ((Class100_Sub1.anInt5072 ^ 0xffffffff) == 0 || Class246_Sub37_Sub1.f_ob == -1) {
							Class79.aClass246_Sub1_Sub5_1020.method2467(70, is, (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5850 & 0x3fff), (0xfffc7a6 & (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5850)) >> 14);
							Class21.anInt322 = is[2] + -Class79.anInt1041;
							Class109_Sub1_Sub1.anInt6725 = is[1] + -Class79.anInt1057;
						} else {
							Class79.aClass246_Sub1_Sub5_1020.method2467(61, is, Class246_Sub37_Sub1.f_ob, Class100_Sub1.anInt5072);
							if (is != null) {
								Class109_Sub1_Sub1.anInt6725 = -Class79.anInt1057 + is[1];
								Class21.anInt322 = -Class79.anInt1041 + is[2];
							}
							Class246_Sub8.aBool3980 = false;
							Class100_Sub1.anInt5072 = Class246_Sub37_Sub1.f_ob = -1;
						}
					} else {
						i_6_ += -5 + (int) (Math.random() * 10.0);
						i_7_ += (int) (10.0 * Math.random()) - 5;
						Class109_Sub1_Sub1.anInt6725 = i_6_;
						Class21.anInt322 = i_7_;
					}
					if ((((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5840 ^ 0xffffffff) == -38)
						Class79.aFloat1036 = Class79.aFloat1033 = 3.0F;
					else if ((((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5840 ^ 0xffffffff) == -51)
						Class79.aFloat1036 = Class79.aFloat1033 = 4.0F;
					else if ((((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5840 ^ 0xffffffff) != -76) {
						if (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5840 == 100)
							Class79.aFloat1036 = Class79.aFloat1033 = 8.0F;
						else if ((((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).anInt5840 ^ 0xffffffff) == -201)
							Class79.aFloat1036 = Class79.aFloat1033 = 16.0F;
						else
							Class79.aFloat1036 = Class79.aFloat1033 = 8.0F;
					} else
						Class79.aFloat1036 = Class79.aFloat1033 = 6.0F;
					Class79.anInt1030 = (int) Class79.aFloat1033 >> 1;
					Class79.aByteArrayArrayArray1032 = Class257.method1668(0, Class79.anInt1030);
					Class_c_Sub1.method2278(-1);
					Class79.method506();
					Class211.aClass166_2963 = new Class166();
					Class79.anInt1029 += (int) (5.0 * Math.random()) - 2;
					if (Class79.anInt1029 < -8)
						Class79.anInt1029 = -8;
					Class79.anInt1038 += (int) (Math.random() * 5.0) - 2;
					if ((Class79.anInt1029 ^ 0xffffffff) < -9)
						Class79.anInt1029 = 8;
					if ((Class79.anInt1038 ^ 0xffffffff) > 15)
						Class79.anInt1038 = -16;
					if (Class79.anInt1038 > 16)
						Class79.anInt1038 = 16;
					Class79.method516(interface6, Class79.anInt1029 >> 2 << 10, Class79.anInt1038 >> 1);
					Class79.aClass165_1022.method1095(256, false, 1024);
					Class79.aClass254_1024.method1641(256, 256, 383137607);
					Class79.aClass251_1028.method1615(-27578, 4096);
					Class246_Sub30_Sub1.aClass17_5761.method166(256, 55);
					Class39.anInt571 = 20;
				} else if ((Class39.anInt571 ^ 0xffffffff) == -21) {
					Class160.method1059(-49, true);
					Class79.method502(class260, Class79.anInt1029, Class79.anInt1038);
					Class39.anInt571 = 60;
					Class160.method1059(-79, true);
					Class187_Sub1.method2109((byte) 111);
				} else {
					if (i > -22)
						anInt1768 = -21;
					if (Class39.anInt571 == 60) {
						if (!Class79.aClass_fs1023.method94((((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).aString5846 + "_staticelements"), -1))
							Class79.aClass178_1031 = new Class178(0);
						else {
							if (!Class79.aClass_fs1023.method90(-1, (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).aString5846) + "_staticelements"))
								return;
							Class79.aClass178_1031 = (Class259_Sub2_Sub1.method2847(Class79.aClass_fs1023, 48, (((Class246_Sub1_Sub5) Class79.aClass246_Sub1_Sub5_1020).aString5846) + "_staticelements", Class246_Sub34.aBool5140));
						}
						Class79.method507();
						Class39.anInt571 = 70;
						Class160.method1059(-71, true);
						Class187_Sub1.method2109((byte) 120);
					} else if ((Class39.anInt571 ^ 0xffffffff) == -71) {
						Class139.aClass198_1986 = new Class198(class260, 11, true, Class147.aCanvas2155);
						Class39.anInt571 = 73;
						Class160.method1059(-81, true);
						Class187_Sub1.method2109((byte) -2);
					} else if ((Class39.anInt571 ^ 0xffffffff) == -74) {
						Class208.aClass198_2934 = new Class198(class260, 12, true, Class147.aCanvas2155);
						Class39.anInt571 = 76;
						Class160.method1059(-111, true);
						Class187_Sub1.method2109((byte) 111);
					} else if (Class39.anInt571 == 76) {
						Class129.aClass198_1806 = new Class198(class260, 14, true, Class147.aCanvas2155);
						Class39.anInt571 = 79;
						Class160.method1059(-70, true);
						Class187_Sub1.method2109((byte) 108);
					} else if ((Class39.anInt571 ^ 0xffffffff) == -80) {
						Class246_Sub7_Sub1.aClass198_6080 = new Class198(class260, 17, true, Class147.aCanvas2155);
						Class39.anInt571 = 82;
						Class160.method1059(-47, true);
						Class187_Sub1.method2109((byte) -26);
					} else if (Class39.anInt571 == 82) {
						Class141.aClass198_2043 = new Class198(class260, 19, true, Class147.aCanvas2155);
						Class39.anInt571 = 85;
						Class160.method1059(-122, true);
						Class187_Sub1.method2109((byte) -61);
					} else if (Class39.anInt571 == 85) {
						Class246_Sub11.aClass198_4099 = new Class198(class260, 22, true, Class147.aCanvas2155);
						Class39.anInt571 = 88;
						Class160.method1059(-91, true);
						Class187_Sub1.method2109((byte) 16);
					} else if (Class39.anInt571 == 88) {
						Class246_Sub8.aClass198_3982 = new Class198(class260, 26, true, Class147.aCanvas2155);
						Class39.anInt571 = 91;
						Class160.method1059(-42, true);
						Class187_Sub1.method2109((byte) 1);
					} else {
						Class246_Sub14.aClass198_4437 = new Class198(class260, 30, true, Class147.aCanvas2155);
						Class39.anInt571 = 100;
						Class160.method1059(-73, true);
						Class187_Sub1.method2109((byte) 108);
						System.gc();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lq.J(" + (interface6 != null ? "{...}" : "null") + ',' + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method856(int i, long l) throws IOException {
		try {
			anInt1757++;
			if (l < (long) i)
				throw new IOException("Invalid seek to " + l + " in file " + method863(i + 11127));
			aLong1753 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.K(" + i + ',' + l + ')');
		}
	}

	private final void method857(int i) throws IOException {
		try {
			anInt1773 = 0;
			anInt1769++;
			if (aLong1753 != aLong1761) {
				aClass192_1759.method1263(aLong1753, i ^ ~0x7939);
				aLong1761 = aLong1753;
			}
			aLong1767 = aLong1753;
			if (i == -31034) {
				int i_8_;
				for (/**/; anInt1773 < aByteArray1774.length; anInt1773 += i_8_) {
					int i_9_ = -anInt1773 + aByteArray1774.length;
					if (i_9_ > 200000000)
						i_9_ = 200000000;
					i_8_ = aClass192_1759.method1261(anInt1773, i_9_, aByteArray1774, (byte) -105);
					if ((i_8_ ^ 0xffffffff) == 0)
						break;
					aLong1761 += (long) i_8_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.B(" + i + ')');
		}
	}

	static final boolean method858(int i, int i_10_, int i_11_) {
		try {
			if (i_11_ != 25926)
				return false;
			anInt1760++;
			return (((0x2000 & i_10_) != 0 | Class40_Sub3.method1863(i, 97, i_10_) | SubIncomingPacket.method2899(i, (byte) 124, i_10_)) & Class246_Sub7.method1835(i_10_, i, -122));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lq.G(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	public static void method859(int i) {
		try {
			if (i == 22)
				aClass13_1756 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.F(" + i + ')');
		}
	}

	static final void decodeReceivedMapRegions(boolean bool) {
		try {
			Class255_Sub1.anInt5573 = 0;
			anInt1776++;
			int i = Class78.packetStream.readUnsigned128Byte((byte) -30);
			int i_12_ = Class78.packetStream.readUnsignedShort128(952968608);
			int i_13_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			boolean bool_14_ = ((Class78.packetStream.readUnsignedByte128(27574) ^ 0xffffffff) == -2);
			Class246_Sub28_Sub24.method2740((byte) 71, i);
			int i_15_ = ((Class130_Sub1_Sub1.anInt7046 + -((BufferStream) Class78.packetStream).position) / 16);
			Class_t.anIntArrayArray1441 = new int[i_15_][4];
			for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
				for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -5; i_17_++)
					Class_t.anIntArrayArray1441[i_16_][i_17_] = Class78.packetStream.readInt((byte) 113);
			}
			Class134.aByteArrayArray1853 = new byte[i_15_][];
			Class189.anIntArray2674 = new int[i_15_];
			Class246_Sub1_Sub7.anIntArray6032 = new int[i_15_];
			Class247.aByteArrayArray3478 = new byte[i_15_][];
			Class168.anIntArray2398 = new int[i_15_];
			Class121.anIntArray1673 = new int[i_15_];
			Class211_Sub1.aByteArrayArray5353 = new byte[i_15_][];
			Class246_Sub5.aByteArrayArray3885 = null;
			Class101.anIntArray1317 = new int[i_15_];
			Class59_Sub1_Sub3.aByteArrayArray6347 = new byte[i_15_][];
			Class95.anIntArray1251 = null;
			i_15_ = 0;
			for (int i_18_ = (i_12_ - (Class38_Sub1_Sub1.anInt6770 >> 4)) / 8; i_18_ <= ((Class38_Sub1_Sub1.anInt6770 >> 4) + i_12_) / 8; i_18_++) {
				for (int i_19_ = (i_13_ - (Class152.anInt2205 >> 4)) / 8; i_19_ <= ((Class152.anInt2205 >> 4) + i_13_) / 8; i_19_++) {
					Class168.anIntArray2398[i_15_] = i_19_ + (i_18_ << 8);
					Class121.anIntArray1673[i_15_] = Class246_Sub7.index5.method86(("m" + i_18_ + "_" + i_19_), (byte) -111);
					Class189.anIntArray2674[i_15_] = Class246_Sub7.index5.method86("l" + i_18_ + "_" + i_19_, (byte) 83);
					Class246_Sub1_Sub7.anIntArray6032[i_15_] = Class246_Sub7.index5.method86(("um" + i_18_ + "_" + i_19_), (byte) -86);
					Class101.anIntArray1317[i_15_] = Class246_Sub7.index5.method86(("ul" + i_18_ + "_" + i_19_), (byte) -116);
					i_15_++;
				}
			}
			Class170.method1125(bool, (byte) 104, i_13_, i_12_, bool_14_);
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "lq.E(" + bool + ')');
		}
	}

	final void method861(int i, byte i_20_, byte[] is, int i_21_) throws IOException {
		try {
			anInt1775++;
			try {
				if ((i_21_ - -i ^ 0xffffffff) < (is.length ^ 0xffffffff))
					throw new ArrayIndexOutOfBoundsException(-is.length + (i_21_ - -i));
				if ((aLong1758 ^ 0xffffffffffffffffL) != 0L && ((aLong1758 ^ 0xffffffffffffffffL) >= (aLong1753 ^ 0xffffffffffffffffL)) && (long) anInt1770 + aLong1758 >= aLong1753 + (long) i) {
					Class117.method805(aByteArray1766, (int) (aLong1753 + -aLong1758), is, i_21_, i);
					aLong1753 += (long) i;
					return;
				}
				long l = aLong1753;
				int i_22_ = i_21_;
				int i_23_ = i;
				if (((aLong1767 ^ 0xffffffffffffffffL) >= (aLong1753 ^ 0xffffffffffffffffL)) && ((aLong1753 ^ 0xffffffffffffffffL) > (aLong1767 - -(long) anInt1773 ^ 0xffffffffffffffffL))) {
					int i_24_ = (int) (-aLong1753 - -aLong1767 + (long) anInt1773);
					if (i < i_24_)
						i_24_ = i;
					Class117.method805(aByteArray1774, (int) (aLong1753 + -aLong1767), is, i_21_, i_24_);
					i_21_ += i_24_;
					i -= i_24_;
					aLong1753 += (long) i_24_;
				}
				if ((aByteArray1774.length ^ 0xffffffff) <= (i ^ 0xffffffff)) {
					if ((i ^ 0xffffffff) < -1) {
						method857(-31034);
						int i_25_ = i;
						if ((anInt1773 ^ 0xffffffff) > (i_25_ ^ 0xffffffff))
							i_25_ = anInt1773;
						Class117.method805(aByteArray1774, 0, is, i_21_, i_25_);
						aLong1753 += (long) i_25_;
						i_21_ += i_25_;
						i -= i_25_;
					}
				} else {
					aClass192_1759.method1263(aLong1753, 0);
					aLong1761 = aLong1753;
					int i_26_;
					for (/**/; i > 0; i -= i_26_) {
						i_26_ = aClass192_1759.method1261(i_21_, i, is, (byte) -102);
						if (i_26_ == -1)
							break;
						aLong1761 += (long) i_26_;
						aLong1753 += (long) i_26_;
						i_21_ += i_26_;
					}
				}
				if (aLong1758 != -1L) {
					if (aLong1753 < aLong1758 && i > 0) {
						int i_27_ = (int) (aLong1758 - aLong1753) + i_21_;
						if (i_27_ > i + i_21_)
							i_27_ = i + i_21_;
						while ((i_27_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff)) {
							is[i_21_++] = (byte) 0;
							i--;
							aLong1753++;
						}
					}
					long l_28_ = -1L;
					if (aLong1758 < l || (((long) i_23_ + l ^ 0xffffffffffffffffL) >= (aLong1758 ^ 0xffffffffffffffffL))) {
						if (((aLong1758 ^ 0xffffffffffffffffL) >= (l ^ 0xffffffffffffffffL)) && ((aLong1758 - -(long) anInt1770 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)))
							l_28_ = l;
					} else
						l_28_ = aLong1758;
					long l_29_ = -1L;
					if ((long) anInt1770 + aLong1758 > l && ((aLong1758 + (long) anInt1770 ^ 0xffffffffffffffffL) >= (l - -(long) i_23_ ^ 0xffffffffffffffffL)))
						l_29_ = (long) anInt1770 + aLong1758;
					else if (aLong1758 < l + (long) i_23_ && (l - -(long) i_23_ <= (long) anInt1770 + aLong1758))
						l_29_ = (long) i_23_ + l;
					if (l_28_ > -1L && ((l_29_ ^ 0xffffffffffffffffL) < (l_28_ ^ 0xffffffffffffffffL))) {
						int i_30_ = (int) (-l_28_ + l_29_);
						Class117.method805(aByteArray1766, (int) (l_28_ + -aLong1758), is, i_22_ + (int) (l_28_ + -l), i_30_);
						if ((l_29_ ^ 0xffffffffffffffffL) < (aLong1753 ^ 0xffffffffffffffffL)) {
							i -= l_29_ - aLong1753;
							aLong1753 = l_29_;
						}
					}
				}
			} catch (IOException ioexception) {
				aLong1761 = -1L;
				throw ioexception;
			}
			if (i_20_ != 110)
				aClass13_1756 = null;
			if (i > 0)
				throw new EOFException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lq.C(" + i + ',' + i_20_ + ',' + (is != null ? "{...}" : "null") + ',' + i_21_ + ')'));
		}
	}

	private final void method862(byte i) throws IOException {
		do {
			try {
				if (i == 48) {
					anInt1763++;
					if ((aLong1758 ^ 0xffffffffffffffffL) == 0L)
						break;
					if (aLong1758 != aLong1761) {
						aClass192_1759.method1263(aLong1758, i - 48);
						aLong1761 = aLong1758;
					}
					aClass192_1759.method1265(0, anInt1770, aByteArray1766, 1);
					aLong1761 += (long) anInt1770;
					if (aLong1762 < aLong1761)
						aLong1762 = aLong1761;
					long l = -1L;
					long l_31_ = -1L;
					if (((aLong1758 ^ 0xffffffffffffffffL) <= (aLong1767 ^ 0xffffffffffffffffL)) && aLong1767 - -(long) anInt1773 > aLong1758)
						l = aLong1758;
					else if (aLong1758 <= aLong1767 && (long) anInt1770 + aLong1758 > aLong1767)
						l = aLong1767;
					if (((aLong1758 - -(long) anInt1770 ^ 0xffffffffffffffffL) < (aLong1767 ^ 0xffffffffffffffffL)) && (aLong1758 + (long) anInt1770 <= (long) anInt1773 + aLong1767))
						l_31_ = (long) anInt1770 + aLong1758;
					else if (((aLong1758 ^ 0xffffffffffffffffL) > ((long) anInt1773 + aLong1767 ^ 0xffffffffffffffffL)) && (((long) anInt1770 + aLong1758 ^ 0xffffffffffffffffL) <= ((long) anInt1773 + aLong1767 ^ 0xffffffffffffffffL)))
						l_31_ = aLong1767 + (long) anInt1773;
					if ((l ^ 0xffffffffffffffffL) < 0L && l_31_ > l) {
						int i_32_ = (int) (-l + l_31_);
						Class117.method805(aByteArray1766, (int) (l + -aLong1758), aByteArray1774, (int) (-aLong1767 + l), i_32_);
					}
					aLong1758 = -1L;
					anInt1770 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lq.I(" + i + ')');
			}
			break;
		} while (false);
	}

	private final File method863(int i) {
		try {
			anInt1765++;
			if (i != 11127)
				aLong1758 = 52L;
			return aClass192_1759.method1264(-77);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lq.H(" + i + ')');
		}
	}

	Class125(Class192 class192, int i, int i_33_) throws IOException {
		aLong1767 = -1L;
		try {
			aClass192_1759 = class192;
			aLong1771 = aLong1762 = class192.method1266(74);
			aLong1753 = 0L;
			aByteArray1766 = new byte[i_33_];
			aByteArray1774 = new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lq.<init>(" + (class192 != null ? "{...}" : "null") + ',' + i + ',' + i_33_ + ')'));
		}
	}

	static {
		aClass13_1756 = new IncomingPacket(8, -2);
		new Class67("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.", "La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.", "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
	}
}
