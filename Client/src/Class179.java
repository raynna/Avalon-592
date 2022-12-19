
/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class Class179 {
	int anInt2506;
	static IncomingPacket SEND_GROUND_ITEM_PACKET;
	static int anInt2508;
	static int anInt2509;
	int anInt2510;
	static int anInt2511;
	static int anInt2512 = 0;
	static int anInt2513;
	int anInt2514;
	static int anInt2515;
	static int anInt2516;
	int anInt2517;
	static Class228 aClass228_2518;
	static int[] anIntArray2519;

	static final int method1169(int i, byte i_0_) {
		try {
			anInt2509++;
			int i_1_ = 0;
			if (i_0_ != -14)
				method1169(9, (byte) 22);
			if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= -65537) {
				i >>>= 16;
				i_1_ += 16;
			}
			if ((i ^ 0xffffffff) <= -257) {
				i_1_ += 8;
				i >>>= 8;
			}
			if ((i ^ 0xffffffff) <= -17) {
				i_1_ += 4;
				i >>>= 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_1_ += 2;
			}
			if ((i ^ 0xffffffff) <= -2) {
				i >>>= 1;
				i_1_++;
			}
			return i_1_ + i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ql.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method1170(byte i) {
		do {
			try {
				if (i <= 63)
					method1170((byte) 83);
				anInt2515++;
				if (Class246_Sub40.aClass123_5522 != null)
					Class246_Sub40.aClass123_5522.method843((byte) -118);
				if (Class246_Sub28_Sub26.aClass123_6716 == null)
					break;
				Class246_Sub28_Sub26.aClass123_6716.method843((byte) 2);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ql.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1171(boolean bool) {
		do {
			try {
				SEND_GROUND_ITEM_PACKET = null;
				anIntArray2519 = null;
				aClass228_2518 = null;
				if (bool == true)
					break;
				anInt2512 = -108;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ql.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final String method1172(Throwable throwable, int i) throws IOException {
		try {
			anInt2508++;
			if (i != -24565)
				SEND_GROUND_ITEM_PACKET = null;
			String string;
			if (throwable instanceof RuntimeException_Sub2) {
				RuntimeException_Sub2 runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
				throwable = (((RuntimeException_Sub2) runtimeexception_sub2).aThrowable7152);
				string = (((RuntimeException_Sub2) runtimeexception_sub2).aString7149) + " | ";
			} else
				string = "";
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			String string_2_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(new StringReader(string_2_));
			String string_3_ = bufferedreader.readLine();
			for (;;) {
				String string_4_ = bufferedreader.readLine();
				if (string_4_ == null)
					break;
				int i_5_ = string_4_.indexOf('(');
				int i_6_ = string_4_.indexOf(')', i_5_ + 1);
				String string_7_;
				if (i_5_ != -1)
					string_7_ = string_4_.substring(0, i_5_);
				else
					string_7_ = string_4_;
				string_7_ = string_7_.trim();
				string_7_ = string_7_.substring(string_7_.lastIndexOf(' ') + 1);
				string_7_ = string_7_.substring(1 + string_7_.lastIndexOf('\t'));
				string += string_7_;
				if ((i_5_ ^ 0xffffffff) != 0 && i_6_ != -1) {
					int i_8_ = string_4_.indexOf(".java:", i_5_);
					if ((i_8_ ^ 0xffffffff) <= -1)
						string += string_4_.substring(5 + i_8_, i_6_);
				}
				string += ' ';
			}
			string += "| " + (String) string_3_;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final void method1173(int i) {
		do {
			try {
				anInt2513++;
				int i_9_ = Class78.anInt1013 * 128 + 64;
				int i_10_ = 64 + Class100.anInt1306 * 128;
				int i_11_ = (Class6.getAverageHeight(i_9_, 99, Class246_Sub28_Sub24.anInt6681, i_10_) + -OutgoingPacket.anInt2863);
				do {

					if (Class155.anInt2226 < 100) {
						if (Class246_Sub16.aInt92 < i_9_) {
							Class246_Sub16.aInt92 += (Class246_Sub28_Sub3.anInt5905 - -((-Class246_Sub16.aInt92 + i_9_) * Class155.anInt2226 / 1000));
							if (Class246_Sub16.aInt92 > i_9_)
								Class246_Sub16.aInt92 = i_9_;
						}
						if ((Class246_Sub28_Sub8.anInt6077 ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
							Class246_Sub28_Sub8.anInt6077 += (Class246_Sub28_Sub3.anInt5905 + (Class155.anInt2226 * (-Class246_Sub28_Sub8.anInt6077 + i_11_) / 1000));
							if (i_11_ < Class246_Sub28_Sub8.anInt6077)
								Class246_Sub28_Sub8.anInt6077 = i_11_;
						}
						if ((i_9_ ^ 0xffffffff) > (Class246_Sub16.aInt92 ^ 0xffffffff)) {
							Class246_Sub16.aInt92 -= (((Class246_Sub16.aInt92 - i_9_) * Class155.anInt2226 / 1000) + Class246_Sub28_Sub3.anInt5905);
							if (i_9_ > Class246_Sub16.aInt92)
								Class246_Sub16.aInt92 = i_9_;
						}
						if (i_10_ > Class259_Sub1.anInt4509) {
							Class259_Sub1.anInt4509 += (Class246_Sub28_Sub3.anInt5905 + ((i_10_ + -Class259_Sub1.anInt4509) * Class155.anInt2226 / 1000));
							if ((i_10_ ^ 0xffffffff) > (Class259_Sub1.anInt4509 ^ 0xffffffff))
								Class259_Sub1.anInt4509 = i_10_;
						}
						if (Class246_Sub28_Sub8.anInt6077 > i_11_) {
							Class246_Sub28_Sub8.anInt6077 -= (Class246_Sub28_Sub3.anInt5905 + ((Class246_Sub28_Sub8.anInt6077 + -i_11_) * Class155.anInt2226 / 1000));
							if ((Class246_Sub28_Sub8.anInt6077 ^ 0xffffffff) > (i_11_ ^ 0xffffffff))
								Class246_Sub28_Sub8.anInt6077 = i_11_;
						}
						if (i_10_ >= Class259_Sub1.anInt4509)
							break;
						Class259_Sub1.anInt4509 -= (Class246_Sub28_Sub3.anInt5905 - -((Class259_Sub1.anInt4509 + -i_10_) * Class155.anInt2226 / 1000));
						if (Class259_Sub1.anInt4509 >= i_10_)
							break;
						Class259_Sub1.anInt4509 = i_10_;
						if (!client.f_ob)
							break;
					}
					Class246_Sub16.aInt92 = Class78.anInt1013 * 128 + 64;
					Class259_Sub1.anInt4509 = 128 * Class100.anInt1306 + 64;
					Class246_Sub28_Sub8.anInt6077 = (Class6.getAverageHeight(Class246_Sub16.aInt92, 44, Class246_Sub28_Sub24.anInt6681, Class259_Sub1.anInt4509) + -OutgoingPacket.anInt2863);
				} while (false);
				i_10_ = 128 * Class40_Sub9.anInt5497 + 64;
				i_9_ = 64 + Class130_Sub3.anInt4406 * 128;
				i_11_ = (Class6.getAverageHeight(i_9_, -86, Class246_Sub28_Sub24.anInt6681, i_10_) - Class246_Sub1_Sub14.anInt6593);
				int i_12_ = -Class246_Sub16.aInt92 + i_9_;
				int i_13_ = -Class246_Sub28_Sub8.anInt6077 + i_11_;
				int i_14_ = -Class259_Sub1.anInt4509 + i_10_;
				int i_15_ = (int) Math.sqrt((double) (i_12_ * i_12_ - -(i_14_ * i_14_)));
				int i_16_ = ((int) (2607.5945876176133 * Math.atan2((double) i_13_, (double) i_15_)) & 0x3fff);
				if ((i_16_ ^ 0xffffffff) > -1025)
					i_16_ = 1024;
				int i_17_ = 0x3fff & (int) (Math.atan2((double) i_12_, (double) i_14_) * -2607.5945876176133);
				if (i_16_ > 3072)
					i_16_ = 3072;
				if ((i_16_ ^ 0xffffffff) < (Class244.anInt3456 ^ 0xffffffff)) {
					Class244.anInt3456 += (Class214.anInt2988 * (-Class244.anInt3456 + i_16_ >> 3) / 1000) + Class118.anInt1636 << 3;
					if ((i_16_ ^ 0xffffffff) > (Class244.anInt3456 ^ 0xffffffff))
						Class244.anInt3456 = i_16_;
				}
				if ((Class244.anInt3456 ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
					Class244.anInt3456 -= (Class214.anInt2988 * (Class244.anInt3456 + -i_16_ >> 3) / 1000) + Class118.anInt1636 << 3;
					if (Class244.anInt3456 < i_16_)
						Class244.anInt3456 = i_16_;
				}
				int i_18_ = i_17_ + -Class73.anInt961;
				if (i_18_ > 8192)
					i_18_ -= 16384;
				if ((i_18_ ^ 0xffffffff) > 8191)
					i_18_ += 16384;
				i_18_ >>= 3;
				if ((i_18_ ^ 0xffffffff) < -1) {
					Class73.anInt961 += (Class118.anInt1636 + i_18_ * Class214.anInt2988 / 1000) << 3;
					Class73.anInt961 &= 0x3fff;
				}
				if ((i_18_ ^ 0xffffffff) > -1) {
					Class73.anInt961 -= (Class118.anInt1636 + Class214.anInt2988 * -i_18_ / 1000) << 3;
					Class73.anInt961 &= 0x3fff;
				}
				if (i == 488012003) {
					int i_19_ = i_17_ + -Class73.anInt961;
					if (i_19_ > 8192)
						i_19_ -= 16384;
					if (i_19_ < -8192)
						i_19_ += 16384;
					Class106_Sub1.anInt4179 = 0;
					if (((i_19_ ^ 0xffffffff) <= -1 || i_18_ <= 0) && ((i_19_ ^ 0xffffffff) >= -1 || i_18_ >= 0))
						break;
					Class73.anInt961 = i_17_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ql.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final String method1174(Class235 class235, byte i) {
		try {
			anInt2511++;
			if (client.method2971(class235).method2126(16693) == 0)
				return null;
			if (i != 120)
				method1169(-5, (byte) -2);
			if (((Class235) class235).aString3301 == null || (((Class235) class235).aString3301.trim().length() ^ 0xffffffff) == -1) {
				if (Class_v.aBool1452)
					return "Hidden-use";
				return null;
			}
			return ((Class235) class235).aString3301;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ql.B(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class179() {
		/* empty */
	}

	static {
		SEND_GROUND_ITEM_PACKET = new IncomingPacket(68, 5);
		anInt2516 = 1400;
		anIntArray2519 = new int[] { 1, 2, 4, 8 };
	}
}
