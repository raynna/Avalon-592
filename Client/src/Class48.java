/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48 {
	int anInt689;
	static int anInt690;
	static OutgoingPacket MINIMAP_WALKING_OUT = new OutgoingPacket(59, 18);
	static int anInt692;
	static Class_fs index10;
	static int anInt694;
	static int anInt695 = 0;
	static Class125 aClass125_696;

	public final String toString() {
		try {
			anInt690++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eh.toString(" + ')');
		}
	}

	static final void method321(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt692++;
			if (i < -95) {
				if ((i_4_ ^ 0xffffffff) == (i_1_ ^ 0xffffffff))
					Class59_Sub2.method2020(i_0_, i_2_, 26941, i_1_, i_3_);
				else if (Class197.anInt2818 > i_3_ - i_1_ || Class110.anInt1573 < i_1_ + i_3_ || Class_t.anInt1442 > -i_4_ + i_0_ || ((Class109_Sub4.anInt4570 ^ 0xffffffff) > (i_4_ + i_0_ ^ 0xffffffff)))
					Class5.method58(i_4_, i_3_, i_2_, i_1_, i_0_, (byte) -108);
				else
					Class40_Sub3.method1865(i_0_, i_1_, -484166047, i_2_, i_4_, i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eh.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method322(int i) {
		try {
			aClass125_696 = null;
			MINIMAP_WALKING_OUT = null;
			if (i != 10)
				method322(-105);
			index10 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eh.A(" + i + ')');
		}
	}

	static final boolean method323(String string, int i) {
		try {
			if (i != 59)
				index10 = null;
			anInt694++;
			return Class27.method221(string, 124, 10, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eh.C(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class48(int i, int i_5_) {
		try {
			((Class48) this).anInt689 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eh.<init>(" + i + ',' + i_5_ + ')');
		}
	}
}
