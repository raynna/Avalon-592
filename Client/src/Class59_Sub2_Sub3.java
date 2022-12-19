/* Class59_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub2_Sub3 extends Class59_Sub2 implements Class_f {
	static int anInt6606;
	static int anInt6607;
	private boolean aBool6608;
	static int anInt6609;
	static int anInt6610;
	static int anInt6611;
	static int anInt6612;
	static int anInt6613;
	static IncomingPacket aClass13_6614 = new IncomingPacket(72, 6);
	static int anInt6615;
	static int anInt6616;
	static int anInt6617;
	static int anInt6618;
	static int anInt6619;
	Class14 aClass14_6620;
	static int anInt6621;
	static int anInt6622;
	static int anInt6623;

	public final void method9(int i) {
		do {
			try {
				anInt6607++;
				if (i <= -18)
					break;
				((Class59_Sub2_Sub3) this).aClass14_6620 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mj.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6610++;
			Class_t class_t = (((Class59_Sub2_Sub3) this).aClass14_6620.method147(((Class59_Sub2) this).anInt4542, true, class260, ((Class59_Sub2) this).anInt4563, 2048, (byte) 119, false));
			if (class_t == null)
				return null;
			Class_c class_c = class260.method1730();
			class_c.j((((Class59_Sub2) this).anInt4563 - -((Class59_Sub2) this).anInt4540), ((Class59_Sub2) this).anInt4552, (((Class59_Sub2) this).anInt4542 - -((Class59_Sub2) this).anInt4541));
			Class130_Sub3 class130_sub3 = null;
			if (aBool6608)
				class130_sub3 = Class18.method177(1, (byte) -95);
			if (i >= -87)
				((Class59_Sub2_Sub3) this).aClass14_6620 = null;
			do {
				if ((((Class14) ((Class59_Sub2_Sub3) this).aClass14_6620).aClass130_Sub2_214) == null) {
					class_t.method680(class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
					if (!client.f_ob)
						break;
				}
				Class129 class129 = ((Class14) ((Class59_Sub2_Sub3) this).aClass14_6620).aClass130_Sub2_214.method1779();
				class260.method1703(class_t, class129, class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
			} while (false);
			int i_0_ = ((Class59_Sub2) this).anInt4563 >> 7;
			int i_1_ = ((Class59_Sub2) this).anInt4542 >> 7;
			((Class59_Sub2_Sub3) this).aClass14_6620.method155(true, i_1_, 28146, class_t, i_0_, class260, i_1_, i_0_);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final boolean method2720(int i, int i_2_, int i_3_) {
		try {
			if (i_3_ != 2)
				aClass13_6614 = null;
			anInt6618++;
			if ((0x21 & i_2_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.C(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final int method18(byte i) {
		try {
			anInt6613++;
			if (i != -70)
				aClass13_6614 = null;
			return (((Class14) ((Class59_Sub2_Sub3) this).aClass14_6620).anInt226);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.M(" + i + ')');
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		try {
			if (bool != true)
				aClass13_6614 = null;
			((Class59_Sub2_Sub3) this).aClass14_6620.method157(bool, class260);
			anInt6622++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public final boolean method22(int i) {
		try {
			anInt6617++;
			if (i != 10869)
				((Class59_Sub2_Sub3) this).aClass14_6620 = null;
			return ((Class59_Sub2_Sub3) this).aClass14_6620.method153(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.V(" + i + ')');
		}
	}

	final int method2023(boolean bool) {
		try {
			if (bool != false)
				return 55;
			anInt6606++;
			return ((Class59_Sub2_Sub3) this).aClass14_6620.method149((byte) -117);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.T(" + bool + ')');
		}
	}

	public final int method24(int i) {
		try {
			anInt6611++;
			int i_4_ = 89 % ((i - 39) / 41);
			return (((Class14) ((Class59_Sub2_Sub3) this).aClass14_6620).anInt204);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.G(" + i + ')');
		}
	}

	public static void method2721(int i) {
		do {
			try {
				aClass13_6614 = null;
				if (i == 6)
					break;
				aClass13_6614 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mj.R(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2722(int i, boolean bool, int i_5_, int i_6_, boolean bool_7_, int i_8_, int i_9_) {
		try {
			anInt6609++;
			Class100.anInt1306 = i_6_;
			if (bool_7_ != true)
				aClass13_6614 = null;
			OutgoingPacket.anInt2863 = i;
			Class155.anInt2226 = i_5_;
			Class246_Sub28_Sub3.anInt5905 = i_9_;
			Class78.anInt1013 = i_8_;
			if (bool && Class155.anInt2226 >= 100) {
				Class246_Sub16.aInt92 = Class78.anInt1013 * 128 + 64;
				Class259_Sub1.anInt4509 = 128 * Class100.anInt1306 + 64;
				Class246_Sub28_Sub8.anInt6077 = (Class6.getAverageHeight(Class246_Sub16.aInt92, 49, Class246_Sub28_Sub24.anInt6681, Class259_Sub1.anInt4509) + -OutgoingPacket.anInt2863);
			}
			Class130_Sub3.anInt4417 = 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.K(" + i + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + bool_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public final void method19(Class260 class260, int i) {
		try {
			if (i != -12694)
				aBool6608 = true;
			((Class59_Sub2_Sub3) this).aClass14_6620.method151(i ^ ~0x43195, class260);
			anInt6616++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2723(Node class246, Node class246_10_, int i) {
		try {
			int i_11_ = 83 % ((-47 - i) / 37);
			if (((Node) class246_10_).prev != null)
				class246_10_.unlink((byte) 87);
			anInt6615++;
			((Node) class246_10_).prev = ((Node) class246).prev;
			((Node) class246_10_).next = class246;
			((Node) ((Node) class246_10_).prev).next = class246_10_;
			((Node) ((Node) class246_10_).next).prev = class246_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.S(" + (class246 != null ? "{...}" : "null") + ',' + (class246_10_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_12_) {
		try {
			anInt6612++;
			int i_13_ = -112 % ((i_12_ - 54) / 56);
			return ((Class59_Sub2_Sub3) this).aClass14_6620.method147(0, false, class260, 0, i, (byte) 120, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_12_ + ')'));
		}
	}

	Class59_Sub2_Sub3(Class260 class260, Class185 class185, int i, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		super(i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, Class178.method1168(i_22_, (byte) 58, i_21_));
		try {
			((Class59_Sub2_Sub3) this).aClass14_6620 = new Class14(class260, class185, i_21_, i_22_, i, i_14_, i_15_, i_17_, bool, i_23_);
			aBool6608 = ((((Class185) class185).anInt2590 ^ 0xffffffff) != -1 && !bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + bool + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final boolean method409(int i, int i_24_, Class260 class260, int i_25_) {
		try {
			anInt6621++;
			Class_t class_t = (((Class59_Sub2_Sub3) this).aClass14_6620.method147(((Class59_Sub2) this).anInt4542, false, class260, ((Class59_Sub2) this).anInt4563, 131072, (byte) 122, false));
			if (i_24_ != 0)
				((Class59_Sub2_Sub3) this).aClass14_6620 = null;
			if (class_t == null)
				return false;
			Class_c class_c = class260.method1730();
			class_c.j((((Class59_Sub2) this).anInt4563 - -((Class59_Sub2) this).anInt4540), ((Class59_Sub2) this).anInt4552, (((Class59_Sub2) this).anInt4542 + ((Class59_Sub2) this).anInt4541));
			return class_t.method685(i_25_, i, class_c, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mj.A(" + i + ',' + i_24_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_25_ + ')'));
		}
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt6619++;
				if (i < 53)
					((Class59_Sub2_Sub3) this).aClass14_6620 = null;
				Class_t class_t = (((Class59_Sub2_Sub3) this).aClass14_6620.method147(((Class59_Sub2) this).anInt4542, true, class260, ((Class59_Sub2) this).anInt4563, 262144, (byte) 126, false));
				if (class_t == null)
					break;
				int i_26_ = ((Class59_Sub2) this).anInt4563 >> 7;
				int i_27_ = ((Class59_Sub2) this).anInt4542 >> 7;
				((Class59_Sub2_Sub3) this).aClass14_6620.method155(false, i_27_, 28146, class_t, i_26_, class260, i_27_, i_26_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("mj.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				((Class59_Sub2_Sub3) this).aClass14_6620 = null;
			anInt6623++;
			return (((Class14) ((Class59_Sub2_Sub3) this).aClass14_6620).anInt222);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mj.F(" + bool + ')');
		}
	}
}
