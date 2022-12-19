
/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class BufferStream extends Node {
	static int anInt5623;
	static int anInt5624;
	static int anInt5625;
	static int anInt5626;
	static int anInt5627;
	static int anInt5628;
	static int anInt5629;
	static int[] anIntArray5630;
	static int anInt5631;
	static int anInt5632;
	static int anInt5633;
	static int anInt5634;
	static int anInt5635;
	static int anInt5636;
	byte[] buffer;
	static int anInt5638;
	static int anInt5639;
	static int anInt5640;
	static int anInt5641;
	static int anInt5642;
	static int anInt5643;
	static int anInt5644;
	static int anInt5645;
	static int anInt5646;
	static int anInt5647;
	static int anInt5648;
	static int anInt5649;
	static int anInt5650;
	static int anInt5651;
	static int anInt5652;
	static int anInt5653;
	static int anInt5654;
	static int anInt5655;
	static int anInt5656 = -1;
	static int anInt5657;
	static int anInt5658;
	static int anInt5659;
	static int anInt5660;
	static int anInt5661;
	static int anInt5662;
	static int anInt5663;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	static int f_eb;
	static int f_fb;
	static int f_gb;
	static int f_hb;
	static int f_ib;
	static int f_jb;
	static int f_kb;
	static int f_lb;
	static int f_mb;
	static int f_nb;
	static int f_ob;
	static int f_pb;
	static int f_qb;
	int position;
	static int f_sb;
	static int f_tb;
	static int f_ub;
	static int f_vb;
	static int f_wb;
	static int anInt5664;
	static int anInt5665;
	static int anInt5666;

	final int readUnsigned128Byte(byte i) {
		try {
			anInt5649++;
			return 0xff & -(this).buffer[(this).position++] + 128;
			// (0xff & (-((BufferStream) this).buffer[((BufferStream)
			// this).position++] + 128));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.L(" + i + ')');
		}
	}

	final int readUnsignedByte(int i) {
		try {
			if (i != 255)
				return 102;
			anInt5638++;
			return (((BufferStream) this).buffer[((BufferStream) this).position++] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.G(" + i + ')');
		}
	}

	final int readIntV1(int i) {
		try {
			((BufferStream) this).position += 4;
			f_lb++;
			if (i >= -90)
				readByte128(20);
			return ((0xff & (((BufferStream) this).buffer[-3 + ((BufferStream) this).position])) + ((((((BufferStream) this).buffer[-2 + ((BufferStream) this).position]) & 0xff) << 24) - (-(0xff0000 & (((BufferStream) this).buffer[-1 + ((BufferStream) this).position]) << 16) - ((((BufferStream) this).buffer[-4 + ((BufferStream) this).position]) << 8 & 0xff00))));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.KB(" + i + ')');
		}
	}

	final long method2355(int i, int i_1_) {
		try {
			i_1_--;
			anInt5665++;
			if ((i_1_ ^ 0xffffffff) > -1 || (i_1_ ^ 0xffffffff) < -8)
				throw new IllegalArgumentException();
			if (i != -24449)
				return 108L;
			int i_2_ = i_1_ * 8;
			long l = 0L;
			for (/**/; i_2_ >= 0; i_2_ -= 8)
				l |= (0xffL & (long) (((BufferStream) this).buffer[((BufferStream) this).position++])) << i_2_;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.CB(" + i + ',' + i_1_ + ')');
		}
	}

	final int read24BitInteger(byte i) {
		try {
			if (i != 29)
				return 63;
			anInt5634++;
			((BufferStream) this).position += 3;
			return (((((BufferStream) this).buffer[-2 + ((BufferStream) this).position] & 0xff) << 8) + (((0xff & (((BufferStream) this).buffer[-3 + ((BufferStream) this).position])) << 16) - -((((BufferStream) this).buffer[-1 + ((BufferStream) this).position]) & 0xff)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.AA(" + i + ')');
		}
	}

	final void writeShortLE(int i, byte i_3_) {
		try {
			if (i_3_ <= 76)
				anIntArray5630 = null;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i;
			anInt5643++;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.T(" + i + ',' + i_3_ + ')');
		}
	}

	final void method2358(byte i, int i_4_) {
		do {
			try {
				f_cb++;
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_4_ + 128);
				if (i == 23)
					break;
				((BufferStream) this).buffer = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iv.O(" + i + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	final void writeShortLE128(byte i, int i_5_) {
		try {
			anInt5650++;
			if (i > -48)
				method2388(-37, 70);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_5_ + 128);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_5_ >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.N(" + i + ',' + i_5_ + ')');
		}
	}

	final String method2360(int i) {
		try {
			int i_6_ = -17 % ((-82 - i) / 44);
			anInt5664++;
			byte i_7_ = ((BufferStream) this).buffer[((BufferStream) this).position++];
			if ((i_7_ ^ 0xffffffff) != -1)
				throw new IllegalStateException("Bad version number in gjstr2");
			int i_8_ = ((BufferStream) this).position;
			while ((((BufferStream) this).buffer[((BufferStream) this).position++] ^ 0xffffffff) != -1) {
				/* empty */
			}
			int i_9_ = -i_8_ + ((BufferStream) this).position - 1;
			if (i_9_ == 0)
				return "";
			return Class_l_Sub2.method2299(11783, ((BufferStream) this).buffer, i_9_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.BB(" + i + ')');
		}
	}

	public static void method2361(int i) {
		do {
			try {
				anIntArray5630 = null;
				if (i == -271907000)
					break;
				method2393(81, (byte) -58);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iv.VA(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2362(int i) {
		try {
			anInt5661++;
			int i_10_ = 0;
			int i_11_ = readSmart((byte) 93);
			if (i < 2)
				anIntArray5630 = null;
			while (i_11_ == 32767) {
				i_11_ = readSmart((byte) 113);
				i_10_ += 32767;
			}
			i_10_ += i_11_;
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.D(" + i + ')');
		}
	}

	final boolean method2363(boolean bool) {
		try {
			((BufferStream) this).position -= 4;
			f_pb++;
			int i = Class96.method612(0, (byte) 87, ((BufferStream) this).buffer, ((BufferStream) this).position);
			int i_12_ = readInt((byte) 123);
			if ((i_12_ ^ 0xffffffff) == (i ^ 0xffffffff))
				return true;
			if (bool != true)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.J(" + bool + ')');
		}
	}

	final long method2364(boolean bool) {
		try {
			f_ib++;
			long l = 0xffffffffL & (long) readInt((byte) 127);
			if (bool != true)
				return -7L;
			long l_13_ = (long) readInt((byte) 80) & 0xffffffffL;
			return (l << 32) + l_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.V(" + bool + ')');
		}
	}

	final int method2365(int i) {
		try {
			if (i != -5115)
				anInt5656 = -47;
			f_gb++;
			int i_14_ = ((BufferStream) this).buffer[((BufferStream) this).position] & 0xff;
			if ((i_14_ ^ 0xffffffff) > -129)
				return readUnsignedByte(255) - 64;
			return -49152 + readUnsignedShort((byte) 85);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.FA(" + i + ')');
		}
	}

	final int method2366(byte i) {
		try {
			f_sb++;
			if (i != -53)
				((BufferStream) this).buffer = null;
			((BufferStream) this).position += 2;
			int i_15_ = ((((BufferStream) this).buffer[((BufferStream) this).position - 2] & 0xff) + ((((BufferStream) this).buffer[-1 + ((BufferStream) this).position]) << 8 & 0xff00));
			if ((i_15_ ^ 0xffffffff) < -32768)
				i_15_ -= 65536;
			return i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.GA(" + i + ')');
		}
	}

	final void writeLong(long l, byte i) {
		try {
			if (i != -48)
				method2406((byte) 94, -74);
			anInt5654++;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 56);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 48);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 40);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 32);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 24);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 16);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> 8);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.WA(" + l + ',' + i + ')');
		}
	}

	final void writeShort128(byte i, int i_16_) {
		try {
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_16_ >> 8);
			if (i <= -98) {
				f_vb++;
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_16_ + 128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.U(" + i + ',' + i_16_ + ')');
		}
	}

	final int readSmart(byte i) {
		try {
			if (i <= 49)
				((BufferStream) this).buffer = null;
			f_qb++;
			int i_17_ = 0xff & ((BufferStream) this).buffer[((BufferStream) this).position];
			if ((i_17_ ^ 0xffffffff) > -129)
				return readUnsignedByte(255);
			return -32768 + readUnsignedShort((byte) 123);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.MA(" + i + ')');
		}
	}

	final byte readByteC(int i) {
		try {
			anInt5623++;
			if (i != 0)
				method2388(64, -71);
			return (byte) -(((BufferStream) this).buffer[((BufferStream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.R(" + i + ')');
		}
	}

	final void readBytes(byte i, int i_18_, int i_19_, byte[] is) {
		try {
			for (int i_20_ = i_19_; i_18_ + i_19_ > i_20_; i_20_++)
				is[i_20_] = ((BufferStream) this).buffer[((BufferStream) this).position++];
			if (i != 22)
				((BufferStream) this).position = 47;
			anInt5663++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iv.Q(" + i + ',' + i_18_ + ',' + i_19_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2372(byte i) {
		try {
			if (i >= -110)
				((BufferStream) this).buffer = null;
			anInt5645++;
			((BufferStream) this).position += 2;
			int i_21_ = ((0xff & (((BufferStream) this).buffer[((BufferStream) this).position - 1]) - 128) + (((((BufferStream) this).buffer[-2 + ((BufferStream) this).position]) & 0xff) << 8));
			if (i_21_ > 32767)
				i_21_ -= 65536;
			return i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.FB(" + i + ')');
		}
	}

	final int readIntV2(int i) {
		try {
			if (i < 13)
				readInt((byte) 125);
			anInt5652++;
			((BufferStream) this).position += 4;
			return ((0xff & (((BufferStream) this).buffer[((BufferStream) this).position - 2])) + (0xff0000 & (((BufferStream) this).buffer[((BufferStream) this).position - 4]) << 16) + ((((((BufferStream) this).buffer[((BufferStream) this).position - 3]) & 0xff) << 24) + (0xff00 & (((BufferStream) this).buffer[((BufferStream) this).position - 1]) << 8)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.LB(" + i + ')');
		}
	}

	final int readIntLE(int i) {
		try {
			((BufferStream) this).position += 4;
			if (i <= 24)
				return -84;
			f_ub++;
			return ((((BufferStream) this).buffer[((BufferStream) this).position - 4] & 0xff) + (((((BufferStream) this).buffer[((BufferStream) this).position - 3]) & 0xff) << 8) + (((((BufferStream) this).buffer[((BufferStream) this).position - 1]) << 24 & ~0xffffff) + ((((BufferStream) this).buffer[((BufferStream) this).position - 2]) << 16 & 0xff0000)));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.EA(" + i + ')');
		}
	}

	final int method2375(byte i) {
		try {
			if (i != 1)
				((BufferStream) this).buffer = null;
			anInt5644++;
			((BufferStream) this).position += 2;
			int i_22_ = (((((BufferStream) this).buffer[((BufferStream) this).position - 2] & 0xff) << 8) - -(((BufferStream) this).buffer[((BufferStream) this).position - 1] & 0xff));
			if ((i_22_ ^ 0xffffffff) < -32768)
				i_22_ -= 65536;
			return i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.RA(" + i + ')');
		}
	}

	final void readIntV2(int i, int i_23_) {
		try {
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_23_ >> 16);
			anInt5627++;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_23_ >> 24);
			if (i != -1276441384)
				anIntArray5630 = null;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_23_;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_23_ >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.LA(" + i + ',' + i_23_ + ')');
		}
	}

	final void method2377(int i, int i_24_) {
		try {
			((BufferStream) this).buffer[-4 + -i_24_ + ((BufferStream) this).position] = (byte) (i_24_ >> 24);
			anInt5641++;
			((BufferStream) this).buffer[i + ((BufferStream) this).position + -i_24_] = (byte) (i_24_ >> 16);
			((BufferStream) this).buffer[-2 + -i_24_ + ((BufferStream) this).position] = (byte) (i_24_ >> 8);
			((BufferStream) this).buffer[-1 + (((BufferStream) this).position + -i_24_)] = (byte) i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.HB(" + i + ',' + i_24_ + ')');
		}
	}

	final int readUnsignedShortLE128(byte i) {
		try {
			if (i != 55)
				anInt5656 = -67;
			f_hb++;
			((BufferStream) this).position += 2;
			return (((((BufferStream) this).buffer[-1 + ((BufferStream) this).position] << 8) & 0xff00) - -((((BufferStream) this).buffer[((BufferStream) this).position - 2]) - 128 & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.QB(" + i + ')');
		}
	}

	final String method2379(int i) {
		try {
			anInt5640++;
			if (((BufferStream) this).buffer[((BufferStream) this).position] == 0) {
				((BufferStream) this).position++;
				return null;
			}
			if (i != 2113195248)
				return null;
			return readString((byte) -40);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.TA(" + i + ')');
		}
	}

	final void method2380(int i, int i_25_) {
		try {
			f_wb++;
			if (i < -11) {
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_25_ >> 16);
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_25_ >> 8);
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_25_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.EB(" + i + ',' + i_25_ + ')');
		}
	}

	final void writeString(int i, String string) {
		try {
			anInt5662++;
			int i_26_ = string.indexOf('\0');
			if ((i_26_ ^ 0xffffffff) <= -1)
				throw new IllegalArgumentException("NUL character at " + i_26_ + " - cannot pjstr");
			((BufferStream) this).position += Class_j.method716(string, 0, string.length(), ((BufferStream) this).position, -55, ((BufferStream) this).buffer);
			if (i >= 54)
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iv.A(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void writeBytes(int i, boolean bool, byte[] is, int i_27_) {
		try {
			f_ob++;
			int i_28_ = i;
			if (bool == true) {
				for (/**/; (i_28_ ^ 0xffffffff) > (i + i_27_ ^ 0xffffffff); i_28_++)
					((BufferStream) this).buffer[((BufferStream) this).position++] = is[i_28_];
			}
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, ("iv.AB(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_27_ + ')'));
		}
	}

	final int readUnsignedByte128(int i) {
		try {
			if (i != 27574)
				write128Byte(90, 60);
			anInt5636++;
			return (0xff & (((BufferStream) this).buffer[((BufferStream) this).position++] - 128));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.K(" + i + ')');
		}
	}

	final void write128Byte(int i, int i_29_) {
		do {
			try {
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (128 + -i_29_);
				f_fb++;
				if (i == 0)
					break;
				anInt5656 = 10;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iv.F(" + i + ',' + i_29_ + ')');
			}
			break;
		} while (false);
	}

	final void method2385(BigInteger exp, byte i, BigInteger mod) {
		try {
			anInt5642++;
			int i_31_ = ((BufferStream) this).position;
			((BufferStream) this).position = 0;
			byte[] is = new byte[i_31_];
			readBytes((byte) 22, i_31_, 0, is);
			BigInteger biginteger_32_ = new BigInteger(is);
			BigInteger biginteger_33_ = biginteger_32_.modPow(exp, mod);
			byte[] is_34_ = biginteger_33_.toByteArray();
			((BufferStream) this).position = 0;
			writeByte(255, is_34_.length);
			if (i == -107)
				writeBytes(0, true, is_34_, is_34_.length);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iv.M(" + (mod != null ? "{...}" : "null") + ',' + i + ',' + (exp != null ? "{...}" : "null") + ')'));
		}
	}

	final int readUnsignedByteC(int i) {
		try {
			if (i > -77)
				anInt5656 = -57;
			f_db++;
			return (0xff & -((BufferStream) this).buffer[((BufferStream) this).position++]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.NA(" + i + ')');
		}
	}

	final void writeShort(byte i, int i_35_) {
		try {
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_35_ >> 8);
			f_nb++;
			if (i != 67)
				readIntV1(107);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.BA(" + i + ',' + i_35_ + ')');
		}
	}

	final int method2388(int i, int i_36_) {
		try {
			if (i_36_ != -19774)
				return 111;
			anInt5639++;
			int i_37_ = Class96.method612(i, (byte) -107, ((BufferStream) this).buffer, ((BufferStream) this).position);
			writeInt(i_37_, (byte) 106);
			return i_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.IB(" + i + ',' + i_36_ + ')');
		}
	}

	final void method2389(int i, long l, byte i_38_) {
		do {
			try {
				anInt5633++;
				if ((--i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -8)
					throw new IllegalArgumentException();
				for (int i_39_ = i * 8; i_39_ >= 0; i_39_ -= 8)
					((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (int) (l >> i_39_);
				if (i_38_ == 12)
					break;
				anInt5656 = 44;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("iv.CA(" + i + ',' + l + ',' + i_38_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2390(int i) {
		do {
			try {
				anInt5624++;
				for (int i_40_ = 0; Class59.anInt819 > i_40_; i_40_++) {
					Class258 class258 = Class47.aClass258Array684[i_40_];
					boolean bool = false;
					if (((Class258) class258).aClass246_Sub37_Sub3_3692 == null) {
						((Class258) class258).anInt3695--;
						if ((((Class258) class258).anInt3695 ^ 0xffffffff) > ((((Class258) class258).aByte3702 == 2 ? -1500 : -10) ^ 0xffffffff))
							bool = true;
						else {
							if (((((Class258) class258).aByte3702 ^ 0xffffffff) == -2) && (((Class258) class258).aClass229_3696 == null)) {
								((Class258) class258).aClass229_3696 = Class229.method1467((Class246_Sub28_Sub3.index4), ((Class258) class258).anInt3700, 0);
								if (((Class258) class258).aClass229_3696 == null)
									continue;
								((Class258) class258).anInt3695 += ((Class258) class258).aClass229_3696.method1469();
							} else if ((((Class258) class258).aByte3702 ^ 0xffffffff) == -3 && ((((Class258) class258).aClass246_Sub9_3693) == null || ((((Class258) class258).aClass246_Sub3_Sub1_3694) == null))) {
								if (((Class258) class258).aClass246_Sub9_3693 == null)
									((Class258) class258).aClass246_Sub9_3693 = (Class246_Sub9.method1848(Class171.index14, ((Class258) class258).anInt3700));
								if (((Class258) class258).aClass246_Sub9_3693 == null)
									continue;
								if ((((Class258) class258).aClass246_Sub3_Sub1_3694) == null) {
									((Class258) class258).aClass246_Sub3_Sub1_3694 = ((Class258) class258).aClass246_Sub9_3693.method1854(new int[] { 22050 });
									if ((((Class258) class258).aClass246_Sub3_Sub1_3694) == null)
										continue;
								}
							}
							if ((((Class258) class258).anInt3695 ^ 0xffffffff) > -1) {
								int i_41_;
								if (((Class258) class258).anInt3701 == 0)
									i_41_ = (((Class258) class258).anInt3697 * (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt602)) >> 8;
								else {
									int i_42_ = ((0x305cc38 & ((Class258) class258).anInt3701) >> 24);
									if ((i_42_ ^ 0xffffffff) != ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053) ^ 0xffffffff))
										i_41_ = 0;
									else {
										int i_43_ = 0x7f80 & (((Class258) class258).anInt3701) << 7;
										int i_44_ = ((0xff6bde & (((Class258) class258).anInt3701)) >> 16);
										int i_45_ = (64 + (i_44_ << 7) + -(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060));
										if (i_45_ < 0)
											i_45_ = -i_45_;
										int i_46_ = ((((Class258) class258).anInt3701 & 0xff1d) >> 8);
										int i_47_ = 64 + ((i_46_ << 7) + -(((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).anInt5059));
										if ((i_47_ ^ 0xffffffff) > -1)
											i_47_ = -i_47_;
										int i_48_ = -128 + (i_47_ + i_45_);
										if ((i_48_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)) {
											((Class258) class258).anInt3695 = -99999;
											continue;
										}
										if (i_48_ < 0)
											i_48_ = 0;
										i_41_ = ((i_43_ - i_48_) * ((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt603) * (((Class258) class258).anInt3697)) / i_43_) >> 8;
									}
								}
								if (i_41_ > 0) {
									Class246_Sub3_Sub1 class246_sub3_sub1 = null;
									if (((Class258) class258).aByte3702 != 1) {
										if ((((Class258) class258).aByte3702 ^ 0xffffffff) == -3)
											class246_sub3_sub1 = (((Class258) class258).aClass246_Sub3_Sub1_3694);
									} else
										class246_sub3_sub1 = (((Class258) class258).aClass229_3696.method1468().method2655(Class148.aClass250_2178));
									Class246_Sub37_Sub3 class246_sub37_sub3 = (((Class258) class258).aClass246_Sub37_Sub3_3692 = (Class246_Sub37_Sub3.method2809(class246_sub3_sub1, 100, i_41_)));
									class246_sub37_sub3.method2781(((Class258) class258).anInt3703 - 1);
									Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2626(class246_sub37_sub3);
								}
							}
						}
					} else if (!((Class258) class258).aClass246_Sub37_Sub3_3692.method1576(86))
						bool = true;
					if (bool) {
						Class59.anInt819--;
						for (int i_49_ = i_40_; ((Class59.anInt819 ^ 0xffffffff) < (i_49_ ^ 0xffffffff)); i_49_++)
							Class47.aClass258Array684[i_49_] = Class47.aClass258Array684[1 + i_49_];
						i_40_--;
					}
				}
				if (i >= -102)
					method2402((byte) 43, 124, -63);
				if (!Class_w.aBool6383 || Class59.method404((byte) -120)) {
					if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587) != 0 && Class36.anInt512 != -1 && !Class59.method404((byte) -115)) {
						Class243.writePacket(-120, Class169.aClass201_2404);
						Class246_Sub30.anInt5028++;
						Class130_Sub1.stream.writeInt(Class36.anInt512, (byte) 89);
						Class36.anInt512 = -1;
					}
					break;
				}
				if (((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt587) ^ 0xffffffff) != -1 && Class36.anInt512 != -1)
					Class15.method158((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt587), Class36.anInt512, 0, Class21.index6, -15727, false);
				Class_w.aBool6383 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iv.W(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2391(byte i) {
		try {
			anInt5647++;
			int i_50_ = ((BufferStream) this).buffer[((BufferStream) this).position++];
			if (i != 37)
				return 95;
			int i_51_ = 0;
			for (/**/; i_50_ < 0; i_50_ = ((BufferStream) this).buffer[((BufferStream) this).position++])
				i_51_ = (i_51_ | i_50_ & 0x7f) << 7;
			return i_51_ | i_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.JA(" + i + ')');
		}
	}

	final int readInt(byte i) {
		try {
			anInt5646++;
			if (i <= 72)
				return -74;
			((BufferStream) this).position += 4;
			return (((((BufferStream) this).buffer[((BufferStream) this).position - 2] << 8) & 0xff00) + ((~0xffffff & (((BufferStream) this).buffer[((BufferStream) this).position - 4]) << 24) + (((0xff & (((BufferStream) this).buffer[-3 + ((BufferStream) this).position])) << 16) + (0xff & (((BufferStream) this).buffer[-1 + ((BufferStream) this).position])))));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.JB(" + i + ')');
		}
	}

	static final int method2393(int i, byte i_52_) {
		try {
			anInt5658++;
			if (i_52_ <= 65)
				return 63;
			return 0xff & i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.C(" + i + ',' + i_52_ + ')');
		}
	}

	final void writeInt(int i, byte i_53_) {
		try {
			anInt5635++;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 24);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 16);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 8);
			int i_54_ = 110 / ((i_53_ - 43) / 39);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.B(" + i + ',' + i_53_ + ')');
		}
	}

	final void writeIntV1(int i, int i_55_) {
		try {
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 8);
			anInt5655++;
			if (i_55_ == 690087856) {
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i;
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 24);
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i >> 16);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.KA(" + i + ',' + i_55_ + ')');
		}
	}

	final void readByteC(int i, int i_56_) {
		try {
			f_tb++;
			if (i_56_ == -2)
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) -i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.GB(" + i + ',' + i_56_ + ')');
		}
	}

	final byte read128Byte(int i) {
		try {
			anInt5632++;
			if (i != 128)
				return (byte) 108;
			return (byte) (-(((BufferStream) this).buffer[((BufferStream) this).position++]) + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.DA(" + i + ')');
		}
	}

	final int method2398(int i) {
		try {
			if (i != 65536)
				return 121;
			anInt5628++;
			((BufferStream) this).position += 2;
			int i_57_ = (((((BufferStream) this).buffer[((BufferStream) this).position - 1] << 8) & 0xff00) - -((((BufferStream) this).buffer[-2 + ((BufferStream) this).position]) - 128 & 0xff));
			if (i_57_ > 32767)
				i_57_ -= 65536;
			return i_57_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.PA(" + i + ')');
		}
	}

	final int readUnsignedShort(byte i) {
		try {
			((BufferStream) this).position += 2;
			anInt5626++;

			return ((0xff & (((BufferStream) this).buffer[-1 + ((BufferStream) this).position])) + ((((BufferStream) this).buffer[((BufferStream) this).position - 2]) << 8 & 0xff00));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.UA(" + i + ')');
		}
	}

	final String readString(byte i) {
		try {
			anInt5659++;
			int i_59_ = ((BufferStream) this).position;
			while (((BufferStream) this).buffer[((BufferStream) this).position++] != 0) {
				/* empty */
			}
			if (i != -40)
				return null;
			int i_60_ = -1 + ((BufferStream) this).position + -i_59_;
			if ((i_60_ ^ 0xffffffff) == -1)
				return "";
			return Class_l_Sub2.method2299(11783, ((BufferStream) this).buffer, i_60_, i_59_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.I(" + i + ')');
		}
	}

	final int readUnsignedShortLE(int i) {
		try {
			if (i <= 115)
				return -121;
			((BufferStream) this).position += 2;
			anInt5651++;
			return ((0xff & (((BufferStream) this).buffer[-2 + ((BufferStream) this).position])) + ((((BufferStream) this).buffer[((BufferStream) this).position - 1]) << 8 & 0xff00));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.P(" + i + ')');
		}
	}

	static final int method2402(byte i, int i_61_, int i_62_) {
		try {
			f_jb++;
			if (i != 70)
				anInt5656 = 60;
			int i_63_ = i_62_ >>> 24;
			int i_64_ = 255 - i_63_;
			i_62_ = ((0xff00ff & i_62_) * i_63_ & ~0xff00ff | 0xff0000 & i_63_ * (0xff00 & i_62_)) >>> 8;
			return i_62_ + ((0xff0000 & (0xff00 & i_61_) * i_64_ | ~0xff00ff & i_64_ * (0xff00ff & i_61_)) >>> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iv.HA(" + i + ',' + i_61_ + ',' + i_62_ + ')'));
		}
	}

	final void method2403(int[] is, int i) {
		try {
			f_bb++;
			int i_65_ = ((BufferStream) this).position / 8;
			((BufferStream) this).position = 0;
			if (i == 1207900229) {
				for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
					int i_67_ = readInt((byte) 120);
					int i_68_ = readInt((byte) 90);
					int i_69_ = 0;
					int i_70_ = -1640531527;
					int i_71_ = 32;
					while (i_71_-- > 0) {
						i_67_ += (is[0x3 & i_69_] + i_69_ ^ i_68_ + (i_68_ << 4 ^ i_68_ >>> 5));
						i_69_ += i_70_;
						i_68_ += (is[~0x34fffffc & i_69_ >>> 11] + i_69_ ^ i_67_ + (i_67_ << 4 ^ i_67_ >>> 5));
					}
					((BufferStream) this).position -= 8;
					writeInt(i_67_, (byte) 118);
					writeInt(i_68_, (byte) -31);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.SA(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2404(byte i, int i_72_) {
		do {
			try {
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_72_;
				anInt5629++;
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_72_ >> 8);
				if (i <= -48)
					break;
				anInt5656 = 37;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "iv.DB(" + i + ',' + i_72_ + ')');
			}
			break;
		} while (false);
	}

	final byte readByte(boolean bool) {
		try {
			anInt5625++;
			if (bool != false)
				anInt5656 = -32;
			return ((BufferStream) this).buffer[((BufferStream) this).position++];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.PB(" + bool + ')');
		}
	}

	final void method2406(byte i, int i_73_) {
		try {
			if (i == -8) {
				anInt5660++;
				if ((i_73_ ^ 0xffffffff) <= -1 && (i_73_ ^ 0xffffffff) > -129)
					writeByte(i ^ ~0xf8, i_73_);
				else if (i_73_ >= 0 && (i_73_ ^ 0xffffffff) > -32769)
					writeShort((byte) 67, 32768 + i_73_);
				else
					throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.OA(" + i + ',' + i_73_ + ')');
		}
	}

	final void method2407(int i, int i_74_, int i_75_, int[] is) {
		try {
			f_kb++;
			int i_76_ = ((BufferStream) this).position;
			((BufferStream) this).position = i;
			int i_77_ = (i_74_ + -i) / 8;
			int i_78_ = 0;
			if (i_75_ != -65)
				((BufferStream) this).position = 8;
			for (/**/; (i_77_ ^ 0xffffffff) < (i_78_ ^ 0xffffffff); i_78_++) {
				int i_79_ = readInt((byte) 120);
				int i_80_ = readInt((byte) 115);
				int i_81_ = -957401312;
				int i_82_ = -1640531527;
				int i_83_ = 32;
				while (i_83_-- > 0) {
					i_80_ -= ((i_79_ >>> 5 ^ i_79_ << 4) + i_79_ ^ i_81_ + is[i_81_ >>> 11 & 0x4c600003]);
					i_81_ -= i_82_;
					i_79_ -= (i_80_ + (i_80_ << 4 ^ i_80_ >>> 5) ^ is[0x3 & i_81_] + i_81_);
				}
				((BufferStream) this).position -= 8;
				writeInt(i_79_, (byte) -6);
				writeInt(i_80_, (byte) 118);
			}
			((BufferStream) this).position = i_76_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("iv.MB(" + i + ',' + i_74_ + ',' + i_75_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2408(int i, int i_84_) {
		try {
			if (i == -1591647264) {
				anInt5631++;
				((BufferStream) this).buffer[-1 + (-i_84_ + ((BufferStream) this).position)] = (byte) i_84_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.OB(" + i + ',' + i_84_ + ')');
		}
	}

	final void method2409(boolean bool, int i) {
		try {
			f_mb++;
			if (bool == true) {
				if ((i & ~0x7f) != 0) {
					if ((i & ~0x3fff ^ 0xffffffff) != -1) {
						if ((~0x1fffff & i ^ 0xffffffff) != -1) {
							if ((i & ~0xfffffff ^ 0xffffffff) != -1)
								writeByte(255, 0x80 | i >>> 28);
							writeByte(255, 0x80 | i >>> 21);
						}
						writeByte(255, i >>> 14 | 0x80);
					}
					writeByte(255, i >>> 7 | 0x80);
				}
				writeByte(255, i & 0x7f);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.QA(" + bool + ',' + i + ')');
		}
	}

	final void method2410(int i, int i_85_) {
		try {
			anInt5666++;
			((BufferStream) this).buffer[-2 + (-i_85_ + ((BufferStream) this).position)] = (byte) (i_85_ >> 8);
			if (i >= -21)
				method2358((byte) 121, -87);
			((BufferStream) this).buffer[-i_85_ + (((BufferStream) this).position - 1)] = (byte) i_85_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.E(" + i + ',' + i_85_ + ')');
		}
	}

	final int readUnsignedShort128(int i) {
		try {
			anInt5648++;
			if (i != 952968608)
				anInt5656 = 104;
			((BufferStream) this).position += 2;
			return (((((BufferStream) this).buffer[-2 + ((BufferStream) this).position] << 8) & 0xff00) + (0xff & (((BufferStream) this).buffer[-1 + ((BufferStream) this).position]) - 128));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.H(" + i + ')');
		}
	}

	BufferStream(int i) {
		try {
			((BufferStream) this).buffer = Class149.method1003(14592, i);
			((BufferStream) this).position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.<init>(" + i + ')');
		}
	}

	final byte readByte128(int i) {
		try {
			anInt5657++;
			if (i >= -34)
				anInt5656 = -30;
			return (byte) (-128 + (((BufferStream) this).buffer[((BufferStream) this).position++]));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.NB(" + i + ')');
		}
	}

	final void method2413(int i, int i_86_) {
		try {
			anInt5653++;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_86_;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_86_ >> 8);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_86_ >> 16);
			if (i != -428659336)
				f_eb = 80;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_86_ >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.S(" + i + ',' + i_86_ + ')');
		}
	}

	final void writeByte(int i, int i_87_) {
		try {
			if (i != 255)
				writeShort128((byte) 55, -42);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_87_;
			f_ab++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.IA(" + i + ',' + i_87_ + ')');
		}
	}

	BufferStream(byte[] is) {
		try {
			((BufferStream) this).buffer = is;
			((BufferStream) this).position = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "iv.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		new Class67("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}
}
