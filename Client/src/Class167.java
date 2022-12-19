
/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class167 {
	private int[] anIntArray2367 = new int[5];
	private static int[] anIntArray2368 = new int[32768];
	private Class11 aClass11_2369;
	int anInt2370;
	private Class49 aClass49_2371;
	private int[] anIntArray2372;
	private int[] anIntArray2373;
	private int anInt2374 = 0;
	private Class49 aClass49_2375;
	private Class49 aClass49_2376;
	private Class49 aClass49_2377;
	private Class49 aClass49_2378;
	int anInt2379;
	private static int[] anIntArray2380;
	private int anInt2381 = 100;
	private static int[] anIntArray2382;
	private Class49 aClass49_2383;
	private Class49 aClass49_2384;
	private Class49 aClass49_2385;
	private static int[] anIntArray2386;
	private Class49 aClass49_2387;
	private static int[] anIntArray2388;
	private static int[] anIntArray2389;
	private static int[] anIntArray2390;
	private static int[] anIntArray2391;

	final void method1114(BufferStream stream) {
		aClass49_2385 = new Class49();
		aClass49_2385.method325(stream);
		aClass49_2375 = new Class49();
		aClass49_2375.method325(stream);
		int i = stream.readUnsignedByte(255);
		if (i != 0) {
			((BufferStream) stream).position--;
			aClass49_2384 = new Class49();
			aClass49_2384.method325(stream);
			aClass49_2383 = new Class49();
			aClass49_2383.method325(stream);
		}
		i = stream.readUnsignedByte(255);
		if (i != 0) {
			((BufferStream) stream).position--;
			aClass49_2371 = new Class49();
			aClass49_2371.method325(stream);
			aClass49_2377 = new Class49();
			aClass49_2377.method325(stream);
		}
		i = stream.readUnsignedByte(255);
		if (i != 0) {
			((BufferStream) stream).position--;
			aClass49_2387 = new Class49();
			aClass49_2387.method325(stream);
			aClass49_2376 = new Class49();
			aClass49_2376.method325(stream);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			int i_1_ = stream.readSmart((byte) 124);
			if (i_1_ == 0)
				break;
			anIntArray2372[i_0_] = i_1_;
			anIntArray2367[i_0_] = stream.method2365(-5115);
			anIntArray2373[i_0_] = stream.readSmart((byte) 89);
		}
		anInt2374 = stream.readSmart((byte) 72);
		anInt2381 = stream.readSmart((byte) 92);
		((Class167) this).anInt2370 = stream.readUnsignedShort((byte) -71);
		((Class167) this).anInt2379 = stream.readUnsignedShort((byte) -61);
		aClass11_2369 = new Class11();
		aClass49_2378 = new Class49();
		aClass11_2369.method132(stream, aClass49_2378);
	}

	public static void method1115() {
		anIntArray2382 = null;
		anIntArray2368 = null;
		anIntArray2380 = null;
		anIntArray2389 = null;
		anIntArray2390 = null;
		anIntArray2388 = null;
		anIntArray2391 = null;
		anIntArray2386 = null;
	}

	final int[] method1116(int i, int i_2_) {
		Class117.method801(anIntArray2382, 0, i);
		if (i_2_ < 10)
			return anIntArray2382;
		double d = (double) i / ((double) i_2_ + 0.0);
		aClass49_2385.method324();
		aClass49_2375.method324();
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (aClass49_2384 != null) {
			aClass49_2384.method324();
			aClass49_2383.method324();
			i_3_ = (int) ((double) (((Class49) aClass49_2384).anInt700 - ((Class49) aClass49_2384).anInt699) * 32.768 / d);
			i_4_ = (int) ((double) ((Class49) aClass49_2384).anInt699 * 32.768 / d);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (aClass49_2371 != null) {
			aClass49_2371.method324();
			aClass49_2377.method324();
			i_6_ = (int) ((double) (((Class49) aClass49_2371).anInt700 - ((Class49) aClass49_2371).anInt699) * 32.768 / d);
			i_7_ = (int) ((double) ((Class49) aClass49_2371).anInt699 * 32.768 / d);
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			if (anIntArray2372[i_9_] != 0) {
				anIntArray2389[i_9_] = 0;
				anIntArray2390[i_9_] = (int) ((double) anIntArray2373[i_9_] * d);
				anIntArray2388[i_9_] = (anIntArray2372[i_9_] << 14) / 100;
				anIntArray2391[i_9_] = (int) ((double) (((Class49) aClass49_2385).anInt700 - ((Class49) aClass49_2385).anInt699) * 32.768 * Math.pow(1.0057929410678534, (double) anIntArray2367[i_9_]) / d);
				anIntArray2386[i_9_] = (int) ((double) ((Class49) aClass49_2385).anInt699 * 32.768 / d);
			}
		}
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = aClass49_2385.method326(i);
			int i_12_ = aClass49_2375.method326(i);
			if (aClass49_2384 != null) {
				int i_13_ = aClass49_2384.method326(i);
				int i_14_ = aClass49_2383.method326(i);
				i_11_ += method1117(i_5_, i_14_, ((Class49) aClass49_2384).anInt698) >> 1;
				i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
			}
			if (aClass49_2371 != null) {
				int i_15_ = aClass49_2371.method326(i);
				int i_16_ = aClass49_2377.method326(i);
				i_12_ = i_12_ * ((method1117(i_8_, i_16_, ((Class49) aClass49_2371).anInt698) >> 1) + 32768) >> 15;
				i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				if (anIntArray2372[i_17_] != 0) {
					int i_18_ = i_10_ + anIntArray2390[i_17_];
					if (i_18_ < i) {
						anIntArray2382[i_18_] += method1117(anIntArray2389[i_17_], i_12_ * anIntArray2388[i_17_] >> 15, ((Class49) aClass49_2385).anInt698);
						anIntArray2389[i_17_] += ((i_11_ * anIntArray2391[i_17_] >> 16) + anIntArray2386[i_17_]);
					}
				}
			}
		}
		if (aClass49_2387 != null) {
			aClass49_2387.method324();
			aClass49_2376.method324();
			int i_19_ = 0;
			boolean bool = false;
			boolean bool_20_ = true;
			for (int i_21_ = 0; i_21_ < i; i_21_++) {
				int i_22_ = aClass49_2387.method326(i);
				int i_23_ = aClass49_2376.method326(i);
				int i_24_;
				if (bool_20_)
					i_24_ = (((Class49) aClass49_2387).anInt699 + ((((Class49) aClass49_2387).anInt700 - ((Class49) aClass49_2387).anInt699) * i_22_ >> 8));
				else
					i_24_ = (((Class49) aClass49_2387).anInt699 + ((((Class49) aClass49_2387).anInt700 - ((Class49) aClass49_2387).anInt699) * i_23_ >> 8));
				i_19_ += 256;
				if (i_19_ >= i_24_) {
					i_19_ = 0;
					bool_20_ = !bool_20_;
				}
				if (bool_20_)
					anIntArray2382[i_21_] = 0;
			}
		}
		if (anInt2374 > 0 && anInt2381 > 0) {
			int i_25_ = (int) ((double) anInt2374 * d);
			for (int i_26_ = i_25_; i_26_ < i; i_26_++)
				anIntArray2382[i_26_] += anIntArray2382[i_26_ - i_25_] * anInt2381 / 100;
		}
		if (((Class11) aClass11_2369).anIntArray169[0] > 0 || ((Class11) aClass11_2369).anIntArray169[1] > 0) {
			aClass49_2378.method324();
			int i_27_ = aClass49_2378.method326(i + 1);
			int i_28_ = aClass11_2369.method133(0, (float) i_27_ / 65536.0F);
			int i_29_ = aClass11_2369.method133(1, (float) i_27_ / 65536.0F);
			if (i >= i_28_ + i_29_) {
				int i_30_ = 0;
				int i_31_ = i_29_;
				if (i_31_ > i - i_28_)
					i_31_ = i - i_28_;
				for (/**/; i_30_ < i_31_; i_30_++) {
					int i_32_ = (int) (((long) anIntArray2382[i_30_ + i_28_] * (long) Class11.anInt170) >> 16);
					for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
						i_32_ += (int) (((long) (anIntArray2382[i_30_ + i_28_ - 1 - i_33_]) * (long) (Class11.anIntArrayArray165[0][i_33_])) >> 16);
					for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
						i_32_ -= (int) (((long) anIntArray2382[i_30_ - 1 - i_34_] * (long) (Class11.anIntArrayArray165[1][i_34_])) >> 16);
					anIntArray2382[i_30_] = i_32_;
					i_27_ = aClass49_2378.method326(i + 1);
				}
				i_31_ = 128;
				for (;;) {
					if (i_31_ > i - i_28_)
						i_31_ = i - i_28_;
					for (/**/; i_30_ < i_31_; i_30_++) {
						int i_35_ = (int) (((long) anIntArray2382[i_30_ + i_28_] * (long) Class11.anInt170) >> 16);
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++)
							i_35_ += (int) (((long) (anIntArray2382[i_30_ + i_28_ - 1 - i_36_]) * (long) (Class11.anIntArrayArray165[0][i_36_])) >> 16);
						for (int i_37_ = 0; i_37_ < i_29_; i_37_++)
							i_35_ -= (int) (((long) (anIntArray2382[i_30_ - 1 - i_37_]) * (long) (Class11.anIntArrayArray165[1][i_37_])) >> 16);
						anIntArray2382[i_30_] = i_35_;
						i_27_ = aClass49_2378.method326(i + 1);
					}
					if (i_30_ >= i - i_28_)
						break;
					i_28_ = aClass11_2369.method133(0, (float) i_27_ / 65536.0F);
					i_29_ = aClass11_2369.method133(1, (float) i_27_ / 65536.0F);
					i_31_ += 128;
				}
				for (/**/; i_30_ < i; i_30_++) {
					int i_38_ = 0;
					for (int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; i_39_++)
						i_38_ += (int) (((long) (anIntArray2382[i_30_ + i_28_ - 1 - i_39_]) * (long) (Class11.anIntArrayArray165[0][i_39_])) >> 16);
					for (int i_40_ = 0; i_40_ < i_29_; i_40_++)
						i_38_ -= (int) (((long) anIntArray2382[i_30_ - 1 - i_40_] * (long) (Class11.anIntArrayArray165[1][i_40_])) >> 16);
					anIntArray2382[i_30_] = i_38_;
					i_27_ = aClass49_2378.method326(i + 1);
				}
			}
		}
		for (int i_41_ = 0; i_41_ < i; i_41_++) {
			if (anIntArray2382[i_41_] < -32768)
				anIntArray2382[i_41_] = -32768;
			if (anIntArray2382[i_41_] > 32767)
				anIntArray2382[i_41_] = 32767;
		}
		return anIntArray2382;
	}

	private final int method1117(int i, int i_42_, int i_43_) {
		if (i_43_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_42_;
			return -i_42_;
		}
		if (i_43_ == 2)
			return anIntArray2380[i & 0x7fff] * i_42_ >> 14;
		if (i_43_ == 3)
			return ((i & 0x7fff) * i_42_ >> 14) - i_42_;
		if (i_43_ == 4)
			return anIntArray2368[i / 2607 & 0x7fff] * i_42_;
		return 0;
	}

	public Class167() {
		anIntArray2373 = new int[5];
		anIntArray2372 = new int[5];
		((Class167) this).anInt2370 = 500;
		((Class167) this).anInt2379 = 0;
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray2368[i] = (random.nextInt() & 0x2) - 1;
		anIntArray2380 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray2380[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray2382 = new int[220500];
		anIntArray2386 = new int[5];
		anIntArray2390 = new int[5];
		anIntArray2388 = new int[5];
		anIntArray2389 = new int[5];
		anIntArray2391 = new int[5];
	}
}
