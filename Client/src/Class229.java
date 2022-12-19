/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class229 {
	private int anInt3140;
	private int anInt3141;
	private Class167[] aClass167Array3142;

	private final byte[] method1466() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass167Array3142[i_0_] != null && (((Class167) aClass167Array3142[i_0_]).anInt2370 + ((Class167) aClass167Array3142[i_0_]).anInt2379) > i)
				i = (((Class167) aClass167Array3142[i_0_]).anInt2370 + ((Class167) aClass167Array3142[i_0_]).anInt2379);
		}
		if (i == 0)
			return new byte[0];
		int i_1_ = 22050 * i / 1000;
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass167Array3142[i_2_] != null) {
				int i_3_ = (((Class167) aClass167Array3142[i_2_]).anInt2370 * 22050 / 1000);
				int i_4_ = (((Class167) aClass167Array3142[i_2_]).anInt2379 * 22050 / 1000);
				int[] is_5_ = (aClass167Array3142[i_2_].method1116(i_3_, ((Class167) aClass167Array3142[i_2_]).anInt2370));
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0)
						i_7_ = i_7_ >> 31 ^ 0x7f;
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	static final Class229 method1467(Class_fs class_fs, int i, int i_8_) {
		byte[] is = class_fs.method91(i_8_, i, 111);
		if (is == null)
			return null;
		return new Class229(new BufferStream(is));
	}

	final Class246_Sub3_Sub1 method1468() {
		byte[] is = method1466();
		return new Class246_Sub3_Sub1(22050, is, 22050 * anInt3140 / 1000, 22050 * anInt3141 / 1000);
	}

	final int method1469() {
		int i = 9999999;
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (aClass167Array3142[i_9_] != null && ((Class167) aClass167Array3142[i_9_]).anInt2379 / 20 < i)
				i = ((Class167) aClass167Array3142[i_9_]).anInt2379 / 20;
		}
		if (anInt3140 < anInt3141 && anInt3140 / 20 < i)
			i = anInt3140 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			if (aClass167Array3142[i_10_] != null)
				((Class167) aClass167Array3142[i_10_]).anInt2379 -= i * 20;
		}
		if (anInt3140 < anInt3141) {
			anInt3140 -= i * 20;
			anInt3141 -= i * 20;
		}
		return i;
	}

	private Class229(BufferStream stream) {
		aClass167Array3142 = new Class167[10];
		for (int i = 0; i < 10; i++) {
			int i_11_ = stream.readUnsignedByte(255);
			if (i_11_ != 0) {
				((BufferStream) stream).position--;
				aClass167Array3142[i] = new Class167();
				aClass167Array3142[i].method1114(stream);
			}
		}
		anInt3140 = stream.readUnsignedShort((byte) -29);
		anInt3141 = stream.readUnsignedShort((byte) 121);
	}

	private Class229() {
		aClass167Array3142 = new Class167[10];
	}
}
