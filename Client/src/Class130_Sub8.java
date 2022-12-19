/* Class130_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub8 extends Class130 {
	static int anInt5607;
	String aString5608;
	static boolean[] aBoolArray5609;
	int anInt5610;
	int anInt5611;
	static int anInt5612;
	static int anInt5613;
	static int anInt5614;
	static int anInt5615;
	static long aLong5616 = 0L;
	int anInt5617;
	static int anInt5618;
	int anInt5619;
	int anInt5620;
	int anInt5621;

	static final int method2347(int i, int i_0_, int i_1_, boolean bool) {
		try {
			anInt5612++;
			Class246_Sub18 class246_sub18 = Class95.method610(88, bool, i_1_);
			if (class246_sub18 == null)
				return 0;
			if (i <= 45)
				anInt5618 = 18;
			if ((i_0_ ^ 0xffffffff) > -1 || (((Class246_Sub18) class246_sub18).anIntArray4679.length ^ 0xffffffff) >= (i_0_ ^ 0xffffffff))
				return 0;
			return ((Class246_Sub18) class246_sub18).anIntArray4679[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wu.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + bool + ')'));
		}
	}

	static final void method2348(int i, int i_2_) {
		try {
			Class21.anInt322 = i_2_;
			Class40.anInt617 = i;
			anInt5613++;
			Class40.anInt617 = -1;
			Class_c_Sub1.method2278(i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wu.A(" + i + ',' + i_2_ + ')');
		}
	}

	static final byte[] method2349(byte[] is, boolean bool) {
		try {
			anInt5607++;
			BufferStream stream = new BufferStream(is);
			int i = stream.readUnsignedByte(255);
			if (bool != false)
				aLong5616 = -108L;
			int i_3_ = stream.readInt((byte) 104);
			if (i_3_ < 0 || Class240.anInt3389 != 0 && ((Class240.anInt3389 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)))
				throw new RuntimeException();
			if (i != 0) {
				int i_4_ = stream.readInt((byte) 119);
				if (i_4_ > 10000000 || i_4_ < 0 || ((Class240.anInt3389 ^ 0xffffffff) != -1 && (Class240.anInt3389 ^ 0xffffffff) > (i_4_ ^ 0xffffffff)))
					// throw new RuntimeException();
					return new byte[100];
				byte[] is_5_ = new byte[i_4_];
				do {
					if (i == 1) {
						Class_h.method709(is_5_, i_4_, is, i_3_, 9);
						if (!client.f_ob)
							break;
					}
					Class_e.aClass170_1217.method1129((byte) -33, is_5_, stream);
				} while (false);
				return is_5_;
			}
			byte[] is_6_ = new byte[i_3_];
			stream.readBytes((byte) 22, i_3_, 0, is_6_);
			return is_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wu.C(" + (is != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	public static void method2350(int i) {
		try {
			if (i == 0)
				aBoolArray5609 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wu.D(" + i + ')');
		}
	}

	public Class130_Sub8() {
		/* empty */
	}
}
