/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class96 {
	static int anInt1254;
	static int anInt1255;
	static Class12 aClass12_1256 = new Class12(4, -1);
	static int anInt1257;
	static int anInt1259;

	static final int method612(int i, byte i_0_, byte[] is, int i_1_) {
		try {
			anInt1254++;
			int i_2_ = -1;
			int i_3_ = i;
			int i_4_ = 95 / ((14 - i_0_) / 58);
			for (/**/; (i_3_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_3_++)
				i_2_ = (Class187_Sub2.anIntArray5425[(i_2_ ^ is[i_3_]) & 0xff] ^ i_2_ >>> 8);
			i_2_ ^= 0xffffffff;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ja.A(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	public static void method613(int i) {
		try {
			if (i != 0)
				method615(null, 9);
			aClass12_1256 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ja.D(" + i + ')');
		}
	}

	static final void method614(int i, int i_5_, boolean bool, String string, boolean bool_6_, boolean bool_7_, int i_8_, int i_9_, long l, String string_10_, int i_11_) {
		try {
			anInt1255++;
			int[] is = new int[4];
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -4; i_12_++)
				is[i_12_] = (int) (9.9999999E7 * Math.random());
			BufferStream stream = new BufferStream(128);
			stream.writeByte(255, 10);
			stream.writeShort((byte) 67, (!bool_6_ ? 0 : 4) | ((bool ? 2 : 0) | (bool_7_ ? 1 : 0)));
			stream.writeLong(l, (byte) -48);
			stream.writeInt(is[0], (byte) 84);
			stream.writeString(111, string);
			stream.writeInt(is[1], (byte) 116);
			stream.writeShort((byte) 67, Class109_Sub4.anInt4573);
			stream.writeByte(i ^ 0xfd, i_11_);
			stream.writeByte(i ^ 0xfd, i_5_);
			stream.writeInt(is[i], (byte) 82);
			stream.writeShort((byte) 67, i_8_);
			stream.writeShort((byte) 67, i_9_);
			stream.writeInt(is[3], (byte) 84);
			stream.method2385(Class246_Sub28_Sub4.RSA_EXPONENT, (byte) -107, Class169.RSA_MODULUS);
			BufferStream stream_13_ = new BufferStream(350);
			stream_13_.writeString(i + 99, string_10_);
			int i_14_ = 8 - Class145.method978(string_10_, (byte) -101) % 8;
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
				stream_13_.writeByte(255, (int) (255.0 * Math.random()));
			stream_13_.method2403(is, 1207900229);
			((BufferStream) Class130_Sub1.stream).position = 0;
			Class130_Sub1.stream.writeByte(i + 253, ((Class48) Class246_Sub1_Sub10.aClass48_6220).anInt689);
			Class130_Sub1.stream.writeShort((byte) 67, ((BufferStream) stream).position + (2 + ((BufferStream) stream_13_).position));
			Class130_Sub1.stream.writeShort((byte) 67, 592);
			Class130_Sub1.stream.writeBytes(0, true, (((BufferStream) stream).buffer), ((BufferStream) stream).position);
			Class130_Sub1.stream.writeBytes(0, true, (((BufferStream) stream_13_).buffer), (((BufferStream) stream_13_).position));
			Class246_Sub28_Sub30.anInt6875 = 0;
			Class197.anInt2815 = 1;
			Class59_Sub1_Sub2.anInt6125 = 0;
			RuntimeException_Sub2.anInt7154 = -3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ja.B(" + i + ',' + i_5_ + ',' + bool + ',' + (string != null ? "{...}" : "null") + ',' + bool_6_ + ',' + bool_7_ + ',' + i_8_ + ',' + i_9_ + ',' + l + ',' + (string_10_ != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	static final void method615(Actor class_r, int i) {
		do {
			try {
				anInt1257++;
				boolean bool = false;
				do {
					if ((((Actor) class_r).anInt6428 == Class246_Sub1_Sub4.anInt5752) || ((Actor) class_r).anInt6426 == -1 || ((Actor) class_r).f_qb != 0) {
						bool = true;
						if (!client.f_ob)
							break;
					}
					Class124 class124 = Class59_Sub3_Sub3.aClass45_6275.method304(3, ((Actor) class_r).anInt6426);
					if (((Class124) class124).aBool1732 || (((((Class124) class124).anIntArray1745[((Actor) class_r).anInt6452]) ^ 0xffffffff) > (1 + ((Actor) class_r).anInt6465 ^ 0xffffffff)))
						bool = true;
				} while (false);
				if (bool) {
					int i_16_ = (((Actor) class_r).anInt6428 + -((Actor) class_r).anInt6422);
					int i_17_ = (Class246_Sub1_Sub4.anInt5752 + -((Actor) class_r).anInt6422);
					int i_18_ = (((Actor) class_r).f_nb * 128 + class_r.method2670((byte) 127) * 64);
					int i_19_ = (128 * ((Actor) class_r).f_wb - -(64 * class_r.method2670((byte) 127)));
					int i_20_ = (((Actor) class_r).f_ob * 128 - -(64 * class_r.method2670((byte) 127)));
					int i_21_ = (128 * ((Actor) class_r).anInt6466 - -(64 * class_r.method2670((byte) 127)));
					((Class59_Sub3) class_r).anInt5060 = (i_17_ * i_20_ + (i_16_ + -i_17_) * i_18_) / i_16_;
					((Class59_Sub3) class_r).anInt5059 = (((-i_17_ + i_16_) * i_19_ - -(i_21_ * i_17_)) / i_16_);
				}
				((Actor) class_r).f_kc = 0;
				if ((((Actor) class_r).f_lb ^ 0xffffffff) == -1)
					class_r.method2664(112, 8192);
				if (((Actor) class_r).f_lb == 1)
					class_r.method2664(121, 12288);
				if (((Actor) class_r).f_lb == 2)
					class_r.method2664(107, 0);
				if (((Actor) class_r).f_lb == 3)
					class_r.method2664(111, 4096);
				if (i == 128)
					break;
				method613(99);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ja.C(" + (class_r != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
