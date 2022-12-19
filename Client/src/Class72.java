/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72 {
	private static byte[] aByteArray928;
	private static short[] aShortArray929 = new short[500];
	short[] aShortArray930;
	private static short[] aShortArray931 = new short[500];
	Class246_Sub26 aClass246_Sub26_932;
	private static short[] aShortArray933;
	short[] aShortArray934;
	short[] aShortArray935;
	short[] aShortArray936;
	private static short[] aShortArray937 = new short[500];
	boolean aBool938 = false;
	private static short[] aShortArray939 = new short[500];
	int anInt940;
	byte[] aByteArray941;
	boolean aBool942;
	short[] aShortArray943;
	boolean aBool944;

	public static void method457() {
		aShortArray937 = null;
		aShortArray929 = null;
		aShortArray933 = null;
		aShortArray939 = null;
		aShortArray931 = null;
		aByteArray928 = null;
	}

	Class72(byte[] is, Class246_Sub26 class246_sub26) {
		((Class72) this).aClass246_Sub26_932 = null;
		((Class72) this).aBool942 = false;
		((Class72) this).aBool944 = false;
		((Class72) this).anInt940 = 0;
		((Class72) this).aClass246_Sub26_932 = class246_sub26;
		try {
			BufferStream stream = new BufferStream(is);
			BufferStream stream_0_ = new BufferStream(is);
			((BufferStream) stream).position = 2;
			int i = stream.readUnsignedByte(255);
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			((BufferStream) stream_0_).position = ((BufferStream) stream).position + i;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((Class246_Sub26) ((Class72) this).aClass246_Sub26_932).anIntArray4882[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = stream.readUnsignedByte(255);
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray937[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray929[i_1_] = (short) stream_0_.method2365(-5115);
					else
						aShortArray929[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray933[i_1_] = (short) stream_0_.method2365(-5115);
					else
						aShortArray933[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray939[i_1_] = (short) stream_0_.method2365(-5115);
					else
						aShortArray939[i_1_] = i_7_;
					aByteArray928[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray929[i_1_] = (short) (((aShortArray929[i_1_] & 0xff) << 3) + (aShortArray929[i_1_] >> 8 & 0x7));
						aShortArray933[i_1_] = (short) (((aShortArray933[i_1_] & 0xff) << 3) + (aShortArray933[i_1_] >> 8 & 0x7));
						aShortArray939[i_1_] = (short) (((aShortArray939[i_1_] & 0xff) << 3) + (aShortArray939[i_1_] >> 8 & 0x7));
						aShortArray929[i_1_] <<= 3;
						aShortArray933[i_1_] <<= 3;
						aShortArray939[i_1_] <<= 3;
					}
					aShortArray931[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray931[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						((Class72) this).aBool942 = true;
					else if (i_5_ == 7)
						((Class72) this).aBool944 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						((Class72) this).aBool938 = true;
					i_1_++;
				}
			}
			if (((BufferStream) stream_0_).position != is.length)
				throw new RuntimeException();
			((Class72) this).anInt940 = i_1_;
			((Class72) this).aShortArray936 = new short[i_1_];
			((Class72) this).aShortArray930 = new short[i_1_];
			((Class72) this).aShortArray934 = new short[i_1_];
			((Class72) this).aShortArray943 = new short[i_1_];
			((Class72) this).aShortArray935 = new short[i_1_];
			((Class72) this).aByteArray941 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				((Class72) this).aShortArray936[i_8_] = aShortArray937[i_8_];
				((Class72) this).aShortArray930[i_8_] = aShortArray929[i_8_];
				((Class72) this).aShortArray934[i_8_] = aShortArray933[i_8_];
				((Class72) this).aShortArray943[i_8_] = aShortArray939[i_8_];
				((Class72) this).aShortArray935[i_8_] = aShortArray931[i_8_];
				((Class72) this).aByteArray941[i_8_] = aByteArray928[i_8_];
			}
		} catch (Exception exception) {
			((Class72) this).anInt940 = 0;
			((Class72) this).aBool942 = false;
			((Class72) this).aBool944 = false;
		}
	}

	static {
		aByteArray928 = new byte[500];
		aShortArray933 = new short[500];
	}
}
