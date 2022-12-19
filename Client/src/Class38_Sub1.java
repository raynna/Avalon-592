
/* Class38_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

class Class38_Sub1 extends Class38 {
	static int anInt5104;
	static Class67 aClass67_5105 = new Class67("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
	static int anInt5106;
	private int anInt5107;
	static int anInt5108;
	static int anInt5109;
	static int anInt5110;
	private int anInt5111;
	private byte[] aByteArray5112;
	static int anInt5113;
	static Frame aFrame5114;
	static IncomingPacket HIDE_INTERFACE_COMPONENT_IN;
	static int anInt5116 = -1;
	private int[] anIntArray5117;

	final void method265(byte i) {
		try {
			anInt5108++;
			if (i > -55)
				method268(-101, 57, true);
			anInt5111 = Math.abs(anInt5111);
			if ((anInt5111 ^ 0xffffffff) <= -4097)
				anInt5111 = 4095;
			method2187((byte) -81, (byte) (anInt5111 >> 4), anInt5107++);
			anInt5111 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qb.J(" + i + ')');
		}
	}

	void method2187(byte i, byte i_0_, int i_1_) {
		try {
			anInt5104++;
			if (i != -81)
				method270(99);
			aByteArray5112[anInt5107++] = (byte) (127 + PacketsDecoder.method184(127, i_0_ >> 1));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qb.I(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method268(int i, int i_2_, boolean bool) {
		try {
			anInt5110++;
			if (bool != true)
				aByteArray5112 = null;
			anInt5111 += i_2_ * anIntArray5117[i] >> 12;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qb.L(" + i + ',' + i_2_ + ',' + bool + ')'));
		}
	}

	static final int method2188(int i) {
		try {
			anInt5109++;
			if (i != -29249)
				return -40;
			if (Class150.aClass235_2196 == null) {
				if (Class246_Sub28_Sub21.aBool6580 || Class230.anInt3147 <= 0) {
					int i_3_ = Class238.aClass102_3360.method640((byte) 58);
					int i_4_ = Class238.aClass102_3360.method636(3045);
					int i_5_ = IntegerNode.anInt5082;
					int i_6_ = Class93.anInt1226;
					int i_7_ = Class94.anInt1233;
					if ((i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff) && i_7_ + i_5_ > i_3_) {
						int i_8_ = -1;
						for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (Class230.anInt3147 ^ 0xffffffff)); i_9_++) {
							if (Class160.aBool2263) {
								int i_10_ = (33 + i_6_ - -((-i_9_ + (Class230.anInt3147 - 1)) * 16));
								if ((i_10_ - 13 ^ 0xffffffff) > (i_4_ ^ 0xffffffff) && 3 + i_10_ >= i_4_)
									i_8_ = i_9_;
							} else {
								int i_11_ = (16 * (-1 + Class230.anInt3147 - i_9_) + 31 + i_6_);
								if ((i_4_ ^ 0xffffffff) < (i_11_ - 13 ^ 0xffffffff) && (i_4_ ^ 0xffffffff) >= (i_11_ + 3 ^ 0xffffffff))
									i_8_ = i_9_;
							}
						}
						if ((i_8_ ^ 0xffffffff) != 0) {
							int i_12_ = 0;
							Class51 class51 = new Class51(Class108.aClass166_1525);
							for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) class51.method333(true)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) class51.method334((byte) 56))) {
								if (i_12_++ == i_8_)
									return (((Class246_Sub35) class246_sub35).anInt5155);
							}
						}
					}
				} else {
					if (!Node.aBool3468 || !Class216.aClass232_3009.method1488(-118, 81) || (Class230.anInt3147 ^ 0xffffffff) >= -3)
						return (((Class246_Sub35) (Class246_Sub35) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev).anInt5155);
					return ((Class246_Sub35) (Class246_Sub35) (((Node) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev).prev)).anInt5155;
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qb.G(" + i + ')');
		}
	}

	final void method270(int i) {
		try {
			anInt5111 = 0;
			if (i >= -54)
				aByteArray5112 = null;
			anInt5113++;
			anInt5107 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qb.K(" + i + ')');
		}
	}

	static final float[] method2189(int i, float[] fs, int i_13_) {
		try {
			anInt5106++;
			float[] fs_14_ = new float[i];
			Class117.method804(fs, i_13_, fs_14_, 0, i);
			return fs_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qb.H(" + i + ',' + (fs != null ? "{...}" : "null") + ',' + i_13_ + ')'));
		}
	}

	Class38_Sub1(int i, int i_15_, int i_16_, int i_17_, int i_18_, float f) {
		super(i, i_15_, i_16_, i_17_, i_18_);
		try {
			anIntArray5117 = new int[((Class38) this).anInt556];
			for (int i_19_ = 0; ((((Class38) this).anInt556 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++)
				anIntArray5117[i_19_] = (short) (int) (Math.pow((double) f, (double) i_19_) * 4096.0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qb.<init>(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + f + ')'));
		}
	}

	public static void method2190(int i) {
		try {
			aClass67_5105 = null;
			if (i == -9160) {
				HIDE_INTERFACE_COMPONENT_IN = null;
				aFrame5114 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qb.M(" + i + ')');
		}
	}

	static {
		HIDE_INTERFACE_COMPONENT_IN = new IncomingPacket(41, 7);
	}
}
