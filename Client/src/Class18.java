/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class18 {
	int anInt252;
	static int anInt253;
	int anInt254;
	static int anInt255;
	static int anInt256;
	int anInt257;
	int anInt258;
	static Class12 aClass12_259 = new Class12(11, 18);
	static int anInt260;
	static int anInt261;
	static int anInt262;
	static int anInt263;
	private byte aByte264;
	int anInt265;
	static int anInt266;
	static Class67 aClass67_267;
	static int anInt268 = 1403;
	static int anInt269;

	public static void method171(int i) {
		do {
			try {
				aClass67_267 = null;
				aClass12_259 = null;
				if (i == 8)
					break;
				method175(-105, 71);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bs.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method172(byte i) {
		try {
			if (i != -111)
				method172((byte) -47);
			anInt255++;
			return 0x7 & aByte264;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.B(" + i + ')');
		}
	}

	final int method173(byte i) {
		try {
			if (i < 86)
				method177(-49, (byte) 104);
			anInt266++;
			if ((aByte264 & 0x8) == 8)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.G(" + i + ')');
		}
	}

	static final void method174(int i, boolean bool, int i_0_, boolean bool_1_, byte i_2_) {
		try {
			if (i_2_ != 90)
				method178(-12);
			Class230.method1472(0, i_0_, (byte) 42, bool_1_, Class220.aClass63_Sub1Array3056.length - 1, bool, i);
			anInt260++;
			Class109_Sub1.aClass246_Sub39_3762 = null;
			Class109_Sub4.anInt4572 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bs.A(" + i + ',' + bool + ',' + i_0_ + ',' + bool_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method175(int i, int i_3_) {
		try {
			int i_4_ = 95 / ((i_3_ + 32) / 57);
			anInt256++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 119, 1);
			class246_sub1_sub10.method2604((byte) -93);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.F(" + i + ',' + i_3_ + ')');
		}
	}

	static final Class109_Sub1_Sub1 method176(boolean bool, byte i, byte[] is, Class260_Sub2 class260_sub2, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (i > -113)
				aClass67_267 = null;
			anInt261++;
			if (!((Class260_Sub2) class260_sub2).aBool4385 && (!Class246_Sub40.method2313(200, i_5_) || !Class246_Sub40.method2313(200, i_6_))) {
				if (!((Class260_Sub2) class260_sub2).f_pg)
					return (new Class109_Sub1_Sub1(class260_sub2, i_7_, i_5_, i_6_, Class206.method1350(i_5_, 269173057), Class206.method1350(i_6_, 269173057), is, i_8_));
				return new Class109_Sub1_Sub1(class260_sub2, 34037, i_7_, i_5_, i_6_, bool, is, i_8_);
			}
			return new Class109_Sub1_Sub1(class260_sub2, 3553, i_7_, i_5_, i_6_, bool, is, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bs.E(" + bool + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + (class260_sub2 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final Class130_Sub3 method177(int i, byte i_9_) {
		try {
			anInt269++;
			synchronized (Class131.aClass68Array1822) {
				if (i_9_ != -95)
					return null;
				Class130_Sub3 class130_sub3;
				if (((Class131.aClass68Array1822.length ^ 0xffffffff) >= (i ^ 0xffffffff)) || Class131.aClass68Array1822[i].method446((byte) 102)) {
					class130_sub3 = new Class130_Sub3();
					((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415 = new Class130_Sub5[i];
					for (int i_10_ = 0; (i ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
						((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[i_10_] = new Class130_Sub5();
				} else {
					class130_sub3 = (Class130_Sub3) Class131.aClass68Array1822[i].method441((byte) 110);
					class130_sub3.method886(1024);
					Class246_Sub1_Sub7.anIntArray6027[i]--;
				}
				return class130_sub3;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.H(" + i + ',' + i_9_ + ')');
		}
	}

	static final void method178(int i) {
		try {
			anInt253++;
			int[] is = new int[((Class191) Class255.aClass191_3663).anInt2690];
			int i_11_ = 0;
			if (i <= -105) {
				for (int i_12_ = 0; i_12_ < ((Class191) Class255.aClass191_3663).anInt2690; i_12_++) {
					Class197 class197 = Class255.aClass191_3663.method1251(22883, i_12_);
					if ((((Class197) class197).anInt2807 ^ 0xffffffff) <= -1 || ((Class197) class197).anInt2806 >= 0)
						is[i_11_++] = i_12_;
				}
				Class59_Sub1_Sub2.anIntArray6131 = new int[i_11_];
				for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
					Class59_Sub1_Sub2.anIntArray6131[i_13_] = is[i_13_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.C(" + i + ')');
		}
	}

	public Class18() {
		/* empty */
	}

	Class18(BufferStream stream) {
		try {
			aByte264 = stream.readByte(false);
			((Class18) this).anInt254 = stream.readUnsignedShort((byte) -98);
			((Class18) this).anInt257 = stream.readInt((byte) 123);
			((Class18) this).anInt258 = stream.readInt((byte) 126);
			((Class18) this).anInt252 = stream.readInt((byte) 105);
			((Class18) this).anInt265 = stream.readInt((byte) 95);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bs.<init>(" + (stream != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass67_267 = new Class67("Discard", "Ablegen", "Jeter", "Descartar");
	}
}
