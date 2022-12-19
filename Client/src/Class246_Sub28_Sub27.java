
/* Class246_Sub28_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class246_Sub28_Sub27 extends Class246_Sub28 {
	private int anInt6747 = 0;
	private int anInt6748 = 16;
	private int anInt6749;
	static int anInt6750;
	private int anInt6751 = 0;
	static int anInt6752;
	static OutgoingPacket NPC_EXAMINE_PACKET;
	static int anInt6754;
	static int anInt6755 = 0;
	static int anInt6756;
	static int anInt6757;
	private int anInt6758;
	static Class39_Sub1 aClass39_Sub1_6759;

	public static void method2766(int i) {
		try {
			if (i == 255) {
				aClass39_Sub1_6759 = null;
				NPC_EXAMINE_PACKET = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qf.B(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_0_) {
		try {
			anInt6756++;
			int i_1_ = 125 % ((i - 67) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_0_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_2_ = anInt6758 >> 1;
				int[][] is_3_ = ((Class246_Sub28) this).aClass66_4938.method433(10);
				Random random = new Random((long) anInt6747);
				for (int i_4_ = 0; i_4_ < anInt6749; i_4_++) {
					int i_5_ = ((anInt6758 ^ 0xffffffff) >= -1 ? anInt6751 : (anInt6751 + -i_2_ + Class122.method826((byte) 94, random, anInt6758)));
					i_5_ = 0xff & i_5_ >> 4;
					int i_6_ = Class122.method826((byte) 94, random, Class246_Sub37_Sub1.f_gb);
					int i_7_ = Class122.method826((byte) 94, random, Class141.anInt2044);
					int i_8_ = (anInt6748 * Class246_Sub1_Sub18.anIntArray6855[i_5_] >> 12) + i_6_;
					int i_9_ = i_7_ + (Class149.anIntArray2191[i_5_] * anInt6748 >> 12);
					int i_10_ = -i_7_ + i_9_;
					int i_11_ = i_8_ + -i_6_;
					if ((i_11_ ^ 0xffffffff) != -1 || (i_10_ ^ 0xffffffff) != -1) {
						if (i_10_ < 0)
							i_10_ = -i_10_;
						if (i_11_ < 0)
							i_11_ = -i_11_;
						boolean bool = (i_11_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
						if (bool) {
							int i_12_ = i_6_;
							i_6_ = i_7_;
							int i_13_ = i_8_;
							i_7_ = i_12_;
							i_8_ = i_9_;
							i_9_ = i_13_;
						}
						if ((i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
							int i_14_ = i_6_;
							int i_15_ = i_7_;
							i_6_ = i_8_;
							i_7_ = i_9_;
							i_8_ = i_14_;
							i_9_ = i_15_;
						}
						int i_16_ = i_7_;
						int i_17_ = i_8_ + -i_6_;
						int i_18_ = i_9_ - i_7_;
						int i_19_ = -i_17_ / 2;
						int i_20_ = 2048 / i_17_;
						int i_21_ = 1024 + -(Class122.method826((byte) 94, random, 4096) >> 2);
						int i_22_ = i_9_ > i_7_ ? 1 : -1;
						if ((i_18_ ^ 0xffffffff) > -1)
							i_18_ = -i_18_;
						for (int i_23_ = i_6_; i_23_ < i_8_; i_23_++) {
							int i_24_ = i_21_ + 1024 - -((i_23_ - i_6_) * i_20_);
							int i_25_ = Class63_Sub1.anInt4719 & i_23_;
							int i_26_ = i_16_ & Class113.anInt1594;
							if (!bool)
								is_3_[i_25_][i_26_] = i_24_;
							else
								is_3_[i_26_][i_25_] = i_24_;
							i_19_ += i_18_;
							if ((i_19_ ^ 0xffffffff) < -1) {
								i_19_ = -i_17_ + i_19_;
								i_16_ = i_22_ + i_16_;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qf.E(" + i + ',' + i_0_ + ')');
		}
	}

	final void method2134(boolean bool) {
		do {
			try {
				HashMap.method376(true);
				anInt6752++;
				if (bool == false)
					break;
				aClass39_Sub1_6759 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "qf.F(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2767(int i, byte i_27_) {
		try {
			anInt6750++;
			if (i == 11 || (i ^ 0xffffffff) == -16 || i == 21 || i == 3 || (i ^ 0xffffffff) == -51)
				return true;
			int i_28_ = -26 % ((i_27_ + 47) / 58);
			if ((i ^ 0xffffffff) == -23 || i == 1003)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qf.A(" + i + ',' + i_27_ + ')');
		}
	}

	public Class246_Sub28_Sub27() {
		super(0, true);
		anInt6749 = 2000;
		anInt6758 = 4096;
	}

	static final Class getClassByName(String string, boolean bool) throws ClassNotFoundException {
		System.out.println(string);
		try {
			anInt6757++;
			if (string.equals("B"))
				return Byte.TYPE;
			if (bool != false)
				method2767(-46, (byte) -82);
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qf.C(" + (string != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final void method2143(int i, int i_29_, BufferStream stream) {
		while_113_: do {
			try {
				if (i != 4)
					anInt6751 = -83;
				anInt6754++;
				int i_30_ = i_29_;
				while_112_: do {
					while_111_: do {
						while_110_: do {
							do {
								if (i_30_ != 0) {
									if ((i_30_ ^ 0xffffffff) == -2)
										break;
									if ((i_30_ ^ 0xffffffff) == -3)
										break while_110_;
									if ((i_30_ ^ 0xffffffff) == -4)
										break while_111_;
									if (i_30_ != 4)
										break while_113_;
									if (!client.f_ob)
										break while_112_;
								}
								anInt6747 = stream.readUnsignedByte(i + 251);
								return;
							} while (false);
							anInt6749 = stream.readUnsignedShort((byte) -112);
							return;
						} while (false);
						anInt6748 = stream.readUnsignedByte(i ^ 0xfb);
						return;
					} while (false);
					anInt6751 = stream.readUnsignedShort((byte) 118);
					return;
				} while (false);
				anInt6758 = stream.readUnsignedShort((byte) -115);
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("qf.G(" + i + ',' + i_29_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static {
		NPC_EXAMINE_PACKET = new OutgoingPacket(43, 2);
	}
}
