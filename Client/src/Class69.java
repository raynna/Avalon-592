/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69 {
	static Class_l aClass_l907;
	static int anInt908;
	int anInt909 = 128;
	static int anInt910;
	int anInt911;
	static int anInt912;
	int anInt913;
	int anInt914;
	static int anInt915;
	int anInt916 = 128;
	int anInt917;
	static OutgoingPacket aClass201_918 = new OutgoingPacket(27, -1);
	static int anInt919;

	final void method447(int i, Class69 class69_0_) {
		try {
			((Class69) this).anInt913 = ((Class69) class69_0_).anInt913;
			((Class69) this).anInt916 = ((Class69) class69_0_).anInt916;
			anInt910++;
			if (i == 128) {
				((Class69) this).anInt911 = ((Class69) class69_0_).anInt911;
				((Class69) this).anInt917 = ((Class69) class69_0_).anInt917;
				((Class69) this).anInt914 = ((Class69) class69_0_).anInt914;
				((Class69) this).anInt909 = ((Class69) class69_0_).anInt909;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.E(" + i + ',' + (class69_0_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method448(int i) {
		try {
			Class104.aClass246_Sub35_1397 = new Class246_Sub35(Class73.aClass67_959.method436(true, Class_j.anInt1485), "", Class83.anInt1089, 1011, -1, (long) i, 0, 0, true, false);
			anInt912++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.C(" + i + ')');
		}
	}

	public static void method449(int i) {
		do {
			try {
				aClass201_918 = null;
				aClass_l907 = null;
				if (i > 89)
					break;
				method449(-123);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "go.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class69 method450(int i) {
		try {
			anInt908++;
			if (i != 23495)
				method452((byte) 96);
			return new Class69(((Class69) this).anInt911, ((Class69) this).anInt909, ((Class69) this).anInt916, ((Class69) this).anInt917, ((Class69) this).anInt914, ((Class69) this).anInt913);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.B(" + i + ')');
		}
	}

	static final int method451(int i, int i_1_) {
		try {
			anInt915++;
			if (i_1_ != 1011)
				aClass_l907 = null;
			return i >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.A(" + i + ',' + i_1_ + ')');
		}
	}

	static final Class87[] method452(byte i) {
		try {
			if (i > -17)
				method449(-88);
			anInt919++;
			return (new Class87[] { OutgoingPacket.aClass87_2859, Class43.aClass87_638, Class176.aClass87_2480 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.D(" + i + ')');
		}
	}

	Class69(int i) {
		try {
			((Class69) this).anInt911 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "go.<init>(" + i + ')');
		}
	}

	private Class69(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			((Class69) this).anInt911 = i;
			((Class69) this).anInt913 = i_6_;
			((Class69) this).anInt909 = i_2_;
			((Class69) this).anInt916 = i_3_;
			((Class69) this).anInt914 = i_5_;
			((Class69) this).anInt917 = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("go.<init>(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}
}
