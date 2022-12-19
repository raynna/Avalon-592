
/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class45 {
	static int anInt644;
	static int anInt645;
	private HashMap aClass54_646 = new HashMap(64);
	static int anInt647;
	static byte[][][] aByteArrayArrayArray648;
	static int anInt649;
	private Class_fs aClass_fs650;
	static int anInt651;
	static int anInt652;
	static int anInt653;
	static int anInt654;
	private HashMap aClass54_655 = new HashMap(100);
	static int anInt656;

	final Class246_Sub1_Sub17 method298(int i, int i_0_) {
		try {
			anInt647++;
			Class246_Sub1_Sub17 class246_sub1_sub17;
			synchronized (aClass54_655) {
				if (i_0_ != 1)
					aClass54_655 = null;
				class246_sub1_sub17 = (Class246_Sub1_Sub17) aClass54_655.method379((long) i, (byte) 58);
				if (class246_sub1_sub17 == null) {
					class246_sub1_sub17 = new Class246_Sub1_Sub17(i);
					aClass54_655.method371(i_0_, (long) i, class246_sub1_sub17);
				}
			}
			synchronized (class246_sub1_sub17) {
				if (!class246_sub1_sub17.method2761(false))
					return null;
			}
			return class246_sub1_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.F(" + i + ',' + i_0_ + ')');
		}
	}

	final void method299(int i) {
		try {
			synchronized (aClass54_646) {
				aClass54_646.method383(84);
			}
			if (i == -16517) {
				anInt644++;
				synchronized (aClass54_655) {
					aClass54_655.method383(112);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.A(" + i + ')');
		}
	}

	public static void method300(boolean bool) {
		try {
			if (bool != false)
				aByteArrayArrayArray648 = null;
			aByteArrayArrayArray648 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.H(" + bool + ')');
		}
	}

	final void method301(int i, int i_1_) {
		try {
			if (i_1_ != 36)
				method304(-122, 42);
			synchronized (aClass54_646) {
				aClass54_646.method380(i, -50);
			}
			anInt656++;
			synchronized (aClass54_655) {
				aClass54_655.method380(i, i_1_ - 86);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method302(int i, int i_2_, int i_3_, int i_4_, byte i_5_) {
		try {
			anInt653++;
			float f = (float) Class79.anInt1058 / (float) Class79.anInt1054;
			int i_6_ = i;
			int i_7_ = i_3_;
			do {
				if (f < 1.0F) {
					i_7_ = (int) ((float) i * f);
					if (!client.f_ob)
						break;
				}
				i_6_ = (int) ((float) i_3_ / f);
			} while (false);
			i_4_ -= (-i_7_ + i_3_) / 2;
			i_2_ -= (-i_6_ + i) / 2;
			OutputStream_Sub1.anInt4489 = -1;
			Class21.anInt322 = Class79.anInt1058 + -(i_4_ * Class79.anInt1058 / i_7_);
			Class109_Sub1_Sub1.anInt6725 = i_2_ * Class79.anInt1054 / i_6_;
			if (i_5_ < 40)
				method302(7, 18, 102, 52, (byte) -98);
			Class40.anInt617 = -1;
			Class_c_Sub1.method2278(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("du.B(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method303(int i) {
		try {
			anInt645++;
			synchronized (aClass54_646) {
				aClass54_646.method369(false);
				if (i != 2)
					aByteArrayArrayArray648 = null;
			}
			synchronized (aClass54_655) {
				aClass54_655.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.E(" + i + ')');
		}
	}

	final Class124 method304(int i, int i_8_) {
		try {
			anInt654++;
			Class124 class124;
			synchronized (aClass54_646) {
				class124 = (Class124) aClass54_646.method379((long) i_8_, (byte) 58);
			}
			if (class124 != null)
				return class124;
			byte[] is = aClass_fs650.method91(OutputStream_Sub1.method2011(i_8_, -1), Class69.method451(i_8_, 1011), 113);
			if (i != 3)
				aClass_fs650 = null;
			class124 = new Class124();
			((Class124) class124).anInt1742 = i_8_;
			((Class124) class124).aClass45_1736 = this;
			if (is != null)
				class124.method845(new BufferStream(is), 24);
			class124.method850(2);
			synchronized (aClass54_646) {
				aClass54_646.method371(i ^ 0x2, (long) i_8_, class124);
			}
			return class124;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.D(" + i + ',' + i_8_ + ')');
		}
	}

	static final void method305(String string, int i, int i_9_) {
		try {
			anInt651++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 121, i_9_);
			class246_sub1_sub10.method2600(i_9_ - 25855);
			((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("du.G(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ')'));
		}
	}

	static final void method306(int i, int i_10_, int i_11_) {
		try {
			if (i != 10447)
				aByteArrayArrayArray648 = null;
			anInt649++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_11_, (byte) 116, 16);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("du.J(" + i + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method307(Class260 class260, boolean bool) {
		try {
			if (bool != false)
				method306(107, 99, -27);
			anInt652++;
			if ((Class213.aClass166_2982.method1112(0) ^ 0xffffffff) != -1) {
				if (BufferStream.anInt5656 != 0) {
					if (Class246_Sub1.aClass260_3741 == null) {
						Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						Class246_Sub1.aClass260_3741 = Class260.method1682((Class246_Sub37_Sub1.anInterface6_5910), 0, canvas, 0, (byte) -116, Class108.aClass52_1535);
						Class59_Sub3_Sub1.aClass116_5747 = (Class246_Sub1.aClass260_3741.method1716(Class129.method878(6, 0, BufferStream.f_eb, Class111.index13), Class10.method129(Class210_Sub2.index8, BufferStream.f_eb, 0), true));
					}
					for (Class246_Sub12 class246_sub12 = ((Class246_Sub12) Class213.aClass166_2982.method1104(51)); class246_sub12 != null; class246_sub12 = (Class246_Sub12) Class213.aClass166_2982.method1108((byte) -112)) {
						Class255.aClass191_3663.method1247(false, (!((Class246_Sub12) class246_sub12).aBool4402 ? null : (((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131)), Class59_Sub3_Sub1.aClass116_5747, ((Class246_Sub12) class246_sub12).anInt4400, ((Class246_Sub12) class246_sub12).anInt4395, Class246_Sub1.aClass260_3741, false, ((Class246_Sub12) class246_sub12).anInt4396, ((Class246_Sub12) class246_sub12).anInt4394, ((Class246_Sub12) class246_sub12).anInt4401, true, class260);
						class246_sub12.unlink((byte) -41);
					}
				} else {
					for (Class246_Sub12 class246_sub12 = ((Class246_Sub12) Class213.aClass166_2982.method1104(103)); class246_sub12 != null; class246_sub12 = (Class246_Sub12) Class213.aClass166_2982.method1108((byte) -112)) {
						Class255.aClass191_3663.method1247(false, (((Class246_Sub12) class246_sub12).aBool4402 ? (((Player) Class_a.aClass_r_Sub1_1180).aClass27_7131) : null), Class_c.aClass116_1196, ((Class246_Sub12) class246_sub12).anInt4400, ((Class246_Sub12) class246_sub12).anInt4395, class260, false, ((Class246_Sub12) class246_sub12).anInt4396, ((Class246_Sub12) class246_sub12).anInt4394, ((Class246_Sub12) class246_sub12).anInt4401, !bool, class260);
						class246_sub12.unlink((byte) 94);
					}
					Class205.method1341(-11712);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "du.I(" + (class260 != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	Class45(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_12_, Class_fs class_fs_13_) {
		try {
			aClass_fs650 = class_fs;
			if (aClass_fs650 != null) {
				int i_14_ = -1 + aClass_fs650.method87((byte) 39);
				aClass_fs650.method95(i_14_, 28724);
			}
			Class40_Sub6.method2185(class_fs_12_, 3168, class_fs_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("du.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_12_ != null ? "{...}" : "null") + ',' + (class_fs_13_ != null ? "{...}" : "null") + ')'));
		}
	}
}
