/* Class_m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_m {
	Class109_Sub3 aClass109_Sub3_1537 = null;
	boolean aBool1538;
	static IncomingPacket PLAYER_UPDATE_PACKET = new IncomingPacket(97, -2);
	Class109_Sub1[] aClass109_Sub1Array1540;
	Class109_Sub1[] aClass109_Sub1Array1541;
	Class109_Sub3 aClass109_Sub3_1542 = null;
	Class109_Sub3 aClass109_Sub3_1543;
	static int anInt1544;
	static Class_fs aClass_fs1545;
	static int anInt1546 = 0;

	static final int method749(int i, int i_0_) {
		try {
			if (i <= 28)
				method749(-39, -26);
			anInt1544++;
			return i_0_ >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "m.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method750(byte i) {
		try {
			PLAYER_UPDATE_PACKET = null;
			if (i != 100)
				aClass_fs1545 = null;
			aClass_fs1545 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "m.B(" + i + ')');
		}
	}

	Class_m(Class260_Sub2 class260_sub2) {
		((Class_m) this).aClass109_Sub1Array1541 = null;
		((Class_m) this).aClass109_Sub3_1543 = null;
		((Class_m) this).aClass109_Sub1Array1540 = null;
		do {
			try {
				((Class_m) this).aBool1538 = ((Class260_Sub2) class260_sub2).aBool4381;
				Class143.method964((byte) -16, class260_sub2);
				if (!((Class_m) this).aBool1538) {
					((Class_m) this).aClass109_Sub1Array1541 = new Class109_Sub1[16];
					for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
						byte[] is = Class246_Sub28_Sub9.method2575(32768, (byte) 94, (Class59.anObject821), 128 * i * 256);
						((Class_m) this).aClass109_Sub1Array1541[i] = new Class109_Sub1(class260_sub2, 3553, 6410, 128, 128, true, is, 6410, false);
					}
					((Class_m) this).aClass109_Sub1Array1540 = new Class109_Sub1[16];
					for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
						byte[] is = Class246_Sub28_Sub9.method2575(32768, (byte) 51, (Class60.anObject833), i * 32768);
						((Class_m) this).aClass109_Sub1Array1540[i] = new Class109_Sub1(class260_sub2, 3553, 6410, 128, 128, true, is, 6410, false);
					}
				} else {
					byte[] is = Class202.method1331(false, (byte) 64, Class59.anObject821);
					((Class_m) this).aClass109_Sub3_1543 = new Class109_Sub3(class260_sub2, 6410, 128, 128, 16, is, 6410);
					is = Class202.method1331(false, (byte) 122, Class60.anObject833);
					((Class_m) this).aClass109_Sub3_1537 = new Class109_Sub3(class260_sub2, 6410, 128, 128, 16, is, 6410);
					Class37 class37 = ((Class260_Sub2) class260_sub2).f_se;
					if (!class37.method259(-104))
						break;
					is = Class202.method1331(false, (byte) 108, (Class246_Sub28_Sub14.anObject6305));
					((Class_m) this).aClass109_Sub3_1542 = new Class109_Sub3(class260_sub2, 6408, 128, 128, 16);
					Class109_Sub3 class109_sub3 = new Class109_Sub3(class260_sub2, 6409, 128, 128, 16, is, 6409);
					if (class37.method261(2.0F, class109_sub3, 1, (((Class_m) this).aClass109_Sub3_1542)))
						((Class_m) this).aClass109_Sub3_1542.method761(-125);
					else {
						((Class_m) this).aClass109_Sub3_1542.method755(67);
						((Class_m) this).aClass109_Sub3_1542 = null;
					}
					class109_sub3.method755(-119);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "m.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
