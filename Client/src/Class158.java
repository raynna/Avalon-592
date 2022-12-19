/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class158 {
	private static byte[] aByteArray2246 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private BufferStream aStream2247;
	private int[] anIntArray2248;
	private long aLong2249;
	private int anInt2250;
	private int[] anIntArray2251;
	int[] anIntArray2252;
	int anInt2253;
	private int[] anIntArray2254;

	final void method1039() {
		((BufferStream) aStream2247).position = -1;
	}

	private final int method1040(int i) {
		int i_0_ = (((BufferStream) aStream2247).buffer[((BufferStream) aStream2247).position]);
		if (i_0_ < 0) {
			i_0_ &= 0xff;
			anIntArray2254[i] = i_0_;
			((BufferStream) aStream2247).position++;
		} else
			i_0_ = anIntArray2254[i];
		if (i_0_ == 240 || i_0_ == 247) {
			int i_1_ = aStream2247.method2391((byte) 37);
			if (i_0_ == 247 && i_1_ > 0) {
				int i_2_ = ((((BufferStream) aStream2247).buffer[((BufferStream) aStream2247).position]) & 0xff);
				if (i_2_ >= 241 && i_2_ <= 243 || i_2_ == 246 || i_2_ == 248 || i_2_ >= 250 && i_2_ <= 252 || i_2_ == 254) {
					((BufferStream) aStream2247).position++;
					anIntArray2254[i] = i_2_;
					return method1045(i, i_2_);
				}
			}
			((BufferStream) aStream2247).position += i_1_;
			return 0;
		}
		return method1045(i, i_0_);
	}

	final void method1041(int i) {
		anIntArray2248[i] = ((BufferStream) aStream2247).position;
	}

	final long method1042(int i) {
		return aLong2249 + (long) i * (long) anInt2250;
	}

	final void method1043() {
		((BufferStream) aStream2247).buffer = null;
		anIntArray2251 = null;
		anIntArray2248 = null;
		((Class158) this).anIntArray2252 = null;
		anIntArray2254 = null;
	}

	final void method1044(int i) {
		int i_3_ = aStream2247.method2391((byte) 37);
		((Class158) this).anIntArray2252[i] += i_3_;
	}

	private final int method1045(int i, int i_4_) {
		if (i_4_ == 255) {
			int i_5_ = aStream2247.readUnsignedByte(255);
			int i_6_ = aStream2247.method2391((byte) 37);
			if (i_5_ == 47) {
				((BufferStream) aStream2247).position += i_6_;
				return 1;
			}
			if (i_5_ == 81) {
				int i_7_ = aStream2247.read24BitInteger((byte) 29);
				i_6_ -= 3;
				int i_8_ = ((Class158) this).anIntArray2252[i];
				aLong2249 += (long) i_8_ * (long) (anInt2250 - i_7_);
				anInt2250 = i_7_;
				((BufferStream) aStream2247).position += i_6_;
				return 2;
			}
			((BufferStream) aStream2247).position += i_6_;
			return 3;
		}
		byte i_9_ = aByteArray2246[i_4_ - 128];
		int i_10_ = i_4_;
		if (i_9_ >= 1)
			i_10_ |= aStream2247.readUnsignedByte(255) << 8;
		if (i_9_ >= 2)
			i_10_ |= aStream2247.readUnsignedByte(255) << 16;
		return i_10_;
	}

	final boolean method1046() {
		int i = anIntArray2248.length;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			if (anIntArray2248[i_11_] >= 0)
				return false;
		}
		return true;
	}

	final void method1047(long l) {
		aLong2249 = l;
		int i = anIntArray2248.length;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			((Class158) this).anIntArray2252[i_12_] = 0;
			anIntArray2254[i_12_] = 0;
			((BufferStream) aStream2247).position = anIntArray2251[i_12_];
			method1044(i_12_);
			anIntArray2248[i_12_] = ((BufferStream) aStream2247).position;
		}
	}

	final void method1048(byte[] is) {
		((BufferStream) aStream2247).buffer = is;
		((BufferStream) aStream2247).position = 10;
		int i = aStream2247.readUnsignedShort((byte) -95);
		((Class158) this).anInt2253 = aStream2247.readUnsignedShort((byte) 93);
		anInt2250 = 500000;
		anIntArray2251 = new int[i];
		int i_13_ = 0;
		while (i_13_ < i) {
			int i_14_ = aStream2247.readInt((byte) 115);
			int i_15_ = aStream2247.readInt((byte) 127);
			if (i_14_ == 1297379947) {
				anIntArray2251[i_13_] = ((BufferStream) aStream2247).position;
				i_13_++;
			}
			((BufferStream) aStream2247).position += i_15_;
		}
		aLong2249 = 0L;
		anIntArray2248 = new int[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			anIntArray2248[i_16_] = anIntArray2251[i_16_];
		((Class158) this).anIntArray2252 = new int[i];
		anIntArray2254 = new int[i];
	}

	final int method1049() {
		int i = anIntArray2248.length;
		int i_17_ = -1;
		int i_18_ = 2147483647;
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			if (anIntArray2248[i_19_] >= 0 && ((Class158) this).anIntArray2252[i_19_] < i_18_) {
				i_17_ = i_19_;
				i_18_ = ((Class158) this).anIntArray2252[i_19_];
			}
		}
		return i_17_;
	}

	final void method1050(int i) {
		((BufferStream) aStream2247).position = anIntArray2248[i];
	}

	final boolean method1051() {
		if (((BufferStream) aStream2247).buffer == null)
			return false;
		return true;
	}

	final int method1052(int i) {
		int i_20_ = method1040(i);
		return i_20_;
	}

	public static void method1053() {
		aByteArray2246 = null;
	}

	final int method1054() {
		return anIntArray2248.length;
	}

	public Class158() {
		aStream2247 = new BufferStream(null);
	}

	Class158(byte[] is) {
		aStream2247 = new BufferStream(null);
		method1048(is);
	}
}
