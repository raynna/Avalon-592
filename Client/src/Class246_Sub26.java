/* Class246_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub26 extends Node {
	int anInt4880;
	static int anInt4881;
	int[] anIntArray4882;
	static int[] anIntArray4883 = new int[4];
	boolean[] aBoolArray4884;
	static OutgoingPacket NPC_CLICK_2_PACKET;
	int[] anIntArray4886;
	static int anInt4887;
	int[][] anIntArrayArray4888;
	int anInt4889;
	static OutgoingPacket aClass201_4890;
	static int anInt4891;

	static final int method2115(int i, int i_0_) {
		try {
			anInt4887++;
			double d = (double) (0xff & i_0_ >> 16) / 256.0;
			double d_1_ = (double) ((0xffc3 & i_0_) >> 8) / 256.0;
			double d_2_ = (double) (0xff & i_0_) / 256.0;
			double d_3_ = d;
			if (d_3_ > d_1_)
				d_3_ = d_1_;
			if (d_3_ > d_2_)
				d_3_ = d_2_;
			double d_4_ = d;
			if (d_4_ < d_1_)
				d_4_ = d_1_;
			if (d_2_ > d_4_)
				d_4_ = d_2_;
			double d_5_ = 0.0;
			double d_6_ = (double) i;
			double d_7_ = (d_3_ + d_4_) / 2.0;
			if (d_3_ != d_4_) {
				if (d_7_ < 0.5)
					d_6_ = (d_4_ - d_3_) / (d_4_ + d_3_);
				if (d == d_4_)
					d_5_ = (-d_2_ + d_1_) / (-d_3_ + d_4_);
				else if (d_1_ != d_4_) {
					if (d_2_ == d_4_)
						d_5_ = (d - d_1_) / (-d_3_ + d_4_) + 4.0;
				} else
					d_5_ = (d_2_ - d) / (-d_3_ + d_4_) + 2.0;
				if (d_7_ >= 0.5)
					d_6_ = (d_4_ - d_3_) / (-d_4_ + 2.0 - d_3_);
			}
			d_5_ /= 6.0;
			int i_8_ = (int) (256.0 * d_5_);
			int i_9_ = (int) (d_6_ * 256.0);
			if (i_9_ < 0)
				i_9_ = 0;
			else if ((i_9_ ^ 0xffffffff) < -256)
				i_9_ = 255;
			int i_10_ = (int) (d_7_ * 256.0);
			if ((i_10_ ^ 0xffffffff) <= -1) {
				if (i_10_ > 255)
					i_10_ = 255;
			} else
				i_10_ = 0;
			if ((i_10_ ^ 0xffffffff) >= -244) {
				if ((i_10_ ^ 0xffffffff) >= -218) {
					if ((i_10_ ^ 0xffffffff) < -193)
						i_9_ >>= 2;
					else if (i_10_ > 179)
						i_9_ >>= 1;
				} else
					i_9_ >>= 3;
			} else
				i_9_ >>= 4;
			return ((i_9_ >> 5 << 7) + ((0xff & i_8_) >> 2 << 10) + (i_10_ >> 1));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nk.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method2116(int i) {
		try {
			anIntArray4883 = null;
			if (i != -25049)
				method2116(82);
			aClass201_4890 = null;
			NPC_CLICK_2_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nk.C(" + i + ')');
		}
	}

	static final void method2117(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		try {
			do {
				if ((i_14_ ^ 0xffffffff) <= (Class197.anInt2818 ^ 0xffffffff) && (Class110.anInt1573 ^ 0xffffffff) <= (i_12_ ^ 0xffffffff) && (i ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff) && (i_16_ ^ 0xffffffff) >= (Class109_Sub4.anInt4570 ^ 0xffffffff)) {
					Class5.method64(i, i_12_, i_17_, i_14_, i_11_, false, i_16_, i_15_);
					if (!client.f_ob)
						break;
				}
				Class211_Sub1.method2269(i_14_, i_11_, (byte) -29, i_15_, i, i_17_, i_12_, i_16_);
			} while (false);
			int i_18_ = 66 / ((i_13_ - 39) / 55);
			anInt4891++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nk.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	Class246_Sub26(int i, byte[] is) {
		try {
			((Class246_Sub26) this).anInt4889 = i;
			BufferStream stream = new BufferStream(is);
			((Class246_Sub26) this).anInt4880 = stream.readUnsignedByte(255);
			((Class246_Sub26) this).anIntArray4882 = new int[((Class246_Sub26) this).anInt4880];
			((Class246_Sub26) this).anIntArrayArray4888 = new int[((Class246_Sub26) this).anInt4880][];
			((Class246_Sub26) this).aBoolArray4884 = new boolean[((Class246_Sub26) this).anInt4880];
			((Class246_Sub26) this).anIntArray4886 = new int[((Class246_Sub26) this).anInt4880];
			for (int i_19_ = 0; i_19_ < ((Class246_Sub26) this).anInt4880; i_19_++)
				((Class246_Sub26) this).anIntArray4882[i_19_] = stream.readUnsignedByte(255);
			for (int i_20_ = 0; ((((Class246_Sub26) this).anInt4880 ^ 0xffffffff) < (i_20_ ^ 0xffffffff)); i_20_++)
				((Class246_Sub26) this).aBoolArray4884[i_20_] = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
			for (int i_21_ = 0; ((((Class246_Sub26) this).anInt4880 ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++)
				((Class246_Sub26) this).anIntArray4886[i_21_] = stream.readUnsignedShort((byte) 90);
			for (int i_22_ = 0; i_22_ < ((Class246_Sub26) this).anInt4880; i_22_++)
				((Class246_Sub26) this).anIntArrayArray4888[i_22_] = new int[stream.readUnsignedByte(255)];
			for (int i_23_ = 0; ((Class246_Sub26) this).anInt4880 > i_23_; i_23_++) {
				for (int i_24_ = 0; (((Class246_Sub26) this).anIntArrayArray4888[i_23_].length ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
					((Class246_Sub26) this).anIntArrayArray4888[i_23_][i_24_] = stream.readUnsignedByte(255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nk.<init>(" + i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt4881 = 1406;
		NPC_CLICK_2_PACKET = new OutgoingPacket(30, 3);
		aClass201_4890 = new OutgoingPacket(42, -1);
	}
}
