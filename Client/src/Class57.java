/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class57 {
	static int anInt799;
	static int anInt800;
	static IncomingPacket aClass13_801 = new IncomingPacket(39, 8);
	static int anInt802;
	private Class_fs aClass_fs803;
	static int anInt804;
	private HashMap aClass54_805 = new HashMap(256);
	static int anInt806;
	static int anInt807;
	static int anInt808;
	static Class12 aClass12_809 = new Class12(3, 7);
	static OutgoingPacket aClass201_810 = new OutgoingPacket(78, -1);
	static Class174[] aClass174Array811;

	static final boolean method390(int i, int i_0_) {
		try {
			anInt802++;
			if (i_0_ == 18 || (i_0_ ^ 0xffffffff) == -46 || (i_0_ ^ 0xffffffff) == -24 || (i_0_ ^ 0xffffffff) == -26 || i_0_ == 1007)
				return true;
			if (i > -96)
				return false;
			if (i_0_ == 30 || i_0_ == 1010)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.H(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method391(byte i) {
		try {
			if (i == 28) {
				anInt806++;
				Class246_Sub4.anInt3869 = 0;
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -2049; i_1_++) {
					Class197.aStreamArray2770[i_1_] = null;
					Class234.movementTypes[i_1_] = (byte) 1;
					Class166.aClass240Array2365[i_1_] = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.E(" + i + ')');
		}
	}

	final void method392(byte i) {
		try {
			anInt808++;
			synchronized (aClass54_805) {
				aClass54_805.method369(false);
				int i_2_ = 42 % ((i + 51) / 63);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.F(" + i + ')');
		}
	}

	final void method393(boolean bool, int i) {
		try {
			anInt807++;
			if (bool == true) {
				synchronized (aClass54_805) {
					aClass54_805.method380(i, -50);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.A(" + bool + ',' + i + ')');
		}
	}

	static final void method394(byte i) {
		try {
			int i_3_ = -53 / ((58 - i) / 63);
			Class32.aClass246_Sub37_Sub1_433.method2515(2);
			anInt800++;
			Class12.anInt182 = 1;
			Class_m.aClass_fs1545 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.B(" + i + ')');
		}
	}

	final void method395(int i) {
		try {
			anInt804++;
			if (i == -2049) {
				synchronized (aClass54_805) {
					aClass54_805.method383(115);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.G(" + i + ')');
		}
	}

	final Class246_Sub1_Sub18 method396(int i, int i_4_) {
		try {
			anInt799++;
			Class246_Sub1_Sub18 class246_sub1_sub18;
			synchronized (aClass54_805) {
				class246_sub1_sub18 = (Class246_Sub1_Sub18) aClass54_805.method379((long) i, (byte) 58);
			}
			if (class246_sub1_sub18 != null)
				return class246_sub1_sub18;
			byte[] is = aClass_fs803.method91(i, 26, i_4_ + 128);
			class246_sub1_sub18 = new Class246_Sub1_Sub18();
			if (is != null)
				class246_sub1_sub18.method2828(76, new BufferStream(is));
			synchronized (aClass54_805) {
				if (i_4_ != -24)
					return null;
				aClass54_805.method371(1, (long) i, class246_sub1_sub18);
			}
			return class246_sub1_sub18;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ff.C(" + i + ',' + i_4_ + ')');
		}
	}

	public static void method397(boolean bool) {
		do {
			try {
				aClass13_801 = null;
				aClass12_809 = null;
				aClass201_810 = null;
				aClass174Array811 = null;
				if (bool == false)
					break;
				aClass174Array811 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ff.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	Class57(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs803 = class_fs;
			aClass_fs803.method95(26, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ff.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}
}
