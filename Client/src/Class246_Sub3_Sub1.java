/* Class246_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub1 extends Class246_Sub3 {
	int anInt6389;
	int anInt6390;
	byte[] aByteArray6391;
	boolean aBool6392;
	int anInt6393;

	final Class246_Sub3_Sub1 method2655(Class250 class250) {
		((Class246_Sub3_Sub1) this).aByteArray6391 = class250.method1601(((Class246_Sub3_Sub1) this).aByteArray6391, -111);
		((Class246_Sub3_Sub1) this).anInt6393 = class250.method1602(-22951, ((Class246_Sub3_Sub1) this).anInt6393);
		if (((Class246_Sub3_Sub1) this).anInt6390 == ((Class246_Sub3_Sub1) this).anInt6389)
			((Class246_Sub3_Sub1) this).anInt6390 = ((Class246_Sub3_Sub1) this).anInt6389 = class250.method1600(((Class246_Sub3_Sub1) this).anInt6390, (byte) 83);
		else {
			((Class246_Sub3_Sub1) this).anInt6390 = class250.method1600(((Class246_Sub3_Sub1) this).anInt6390, (byte) 83);
			((Class246_Sub3_Sub1) this).anInt6389 = class250.method1600(((Class246_Sub3_Sub1) this).anInt6389, (byte) 83);
			if (((Class246_Sub3_Sub1) this).anInt6390 == ((Class246_Sub3_Sub1) this).anInt6389)
				((Class246_Sub3_Sub1) this).anInt6390--;
		}
		return this;
	}

	Class246_Sub3_Sub1(int i, byte[] is, int i_0_, int i_1_) {
		((Class246_Sub3_Sub1) this).anInt6393 = i;
		((Class246_Sub3_Sub1) this).aByteArray6391 = is;
		((Class246_Sub3_Sub1) this).anInt6390 = i_0_;
		((Class246_Sub3_Sub1) this).anInt6389 = i_1_;
	}

	Class246_Sub3_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
		((Class246_Sub3_Sub1) this).anInt6393 = i;
		((Class246_Sub3_Sub1) this).aByteArray6391 = is;
		((Class246_Sub3_Sub1) this).anInt6390 = i_2_;
		((Class246_Sub3_Sub1) this).anInt6389 = i_3_;
		((Class246_Sub3_Sub1) this).aBool6392 = bool;
	}
}
