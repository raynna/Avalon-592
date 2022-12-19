/* Class246_Sub1_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub7 extends Class246_Sub1 {
	static int[] anIntArray6027 = new int[5];
	static int anInt6028;
	static int anInt6029;
	static int anInt6030 = 0;
	static int anInt6031;
	static int[] anIntArray6032;
	static boolean aBool6033;
	Class_g aClass_g6034;

	public static void method2547(byte i) {
		try {
			anIntArray6032 = null;
			if (i != 122)
				aBool6033 = true;
			anIntArray6027 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ep.B(" + i + ')');
		}
	}

	static final void method2548(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != 29310)
				anInt6030 = -83;
			anInt6028++;
			if (Class59_Sub4_Sub3.aClass101_6943 != Class40_Sub6.aClass101_5092) {
				if (!Class90.method570(0, i_1_, i, 1, false, 1, 0, -3, 112))
					Class90.method570(0, i_1_, i, 1, false, 1, 0, -2, 102);
			} else if (!Class90.method570(0, i_1_, i, 1, false, 1, 0, -2, i_0_ - 29204))
				Class90.method570(0, i_1_, i, 1, false, 1, 0, -3, i_0_ ^ 0x720f);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ep.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2549(BufferStream stream, int i, Signlink class52, int i_2_) {
		try {
			if (i_2_ == -12508) {
				anInt6031++;
				Class246_Sub32 class246_sub32 = new Class246_Sub32();
				((Class246_Sub32) class246_sub32).anInt5043 = stream.readUnsignedByte(255);
				((Class246_Sub32) class246_sub32).anInt5046 = stream.readInt((byte) 88);
				((Class246_Sub32) class246_sub32).aByteArrayArrayArray5040 = (new byte[((Class246_Sub32) class246_sub32).anInt5043][][]);
				((Class246_Sub32) class246_sub32).aClass182Array5047 = (new Class182[((Class246_Sub32) class246_sub32).anInt5043]);
				((Class246_Sub32) class246_sub32).anIntArray5044 = new int[((Class246_Sub32) class246_sub32).anInt5043];
				((Class246_Sub32) class246_sub32).aClass182Array5041 = (new Class182[((Class246_Sub32) class246_sub32).anInt5043]);
				((Class246_Sub32) class246_sub32).anIntArray5050 = new int[((Class246_Sub32) class246_sub32).anInt5043];
				((Class246_Sub32) class246_sub32).anIntArray5045 = new int[((Class246_Sub32) class246_sub32).anInt5043];
				for (int i_3_ = 0; ((((Class246_Sub32) class246_sub32).anInt5043 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
					try {
						int i_4_ = stream.readUnsignedByte(255);
						if ((i_4_ ^ 0xffffffff) == -1 || i_4_ == 1 || i_4_ == 2) {
							String string = stream.readString((byte) -40);
							String string_5_ = stream.readString((byte) -40);
							int i_6_ = 0;
							if (i_4_ == 1)
								i_6_ = stream.readInt((byte) 100);
							((Class246_Sub32) class246_sub32).anIntArray5044[i_3_] = i_4_;
							((Class246_Sub32) class246_sub32).anIntArray5045[i_3_] = i_6_;
							((Class246_Sub32) class246_sub32).aClass182Array5041[i_3_] = (class52.method350(-115, Class246_Sub28_Sub27.getClassByName(string, false), string_5_));
						} else if (i_4_ == 3 || i_4_ == 4) {
							String string = stream.readString((byte) -40);
							String string_7_ = stream.readString((byte) -40);
							int i_8_ = stream.readUnsignedByte(i_2_ + 12763);
							String[] strings = new String[i_8_];
							for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
								strings[i_9_] = stream.readString((byte) -40);
							byte[][] is = new byte[i_8_][];
							if (i_4_ == 3) {
								for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)); i_10_++) {
									int i_11_ = stream.readInt((byte) 82);
									is[i_10_] = new byte[i_11_];
									stream.readBytes((byte) 22, i_11_, 0, is[i_10_]);
								}
							}
							((Class246_Sub32) class246_sub32).anIntArray5044[i_3_] = i_4_;
							Class[] var_classes = new Class[i_8_];
							for (int i_12_ = 0; (i_8_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++)
								var_classes[i_12_] = (Class246_Sub28_Sub27.getClassByName(strings[i_12_], false));
							((Class246_Sub32) class246_sub32).aClass182Array5047[i_3_] = (class52.method360(var_classes, string_7_, Class246_Sub28_Sub27.getClassByName(string, false), i_2_ + 12510));
							((Class246_Sub32) class246_sub32).aByteArrayArrayArray5040[i_3_] = is;
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						((Class246_Sub32) class246_sub32).anIntArray5050[i_3_] = -1;
					} catch (SecurityException securityexception) {
						((Class246_Sub32) class246_sub32).anIntArray5050[i_3_] = -2;
					} catch (NullPointerException nullpointerexception) {
						((Class246_Sub32) class246_sub32).anIntArray5050[i_3_] = -3;
					} catch (Exception exception) {
						((Class246_Sub32) class246_sub32).anIntArray5050[i_3_] = -4;
					} catch (Throwable throwable) {
						((Class246_Sub32) class246_sub32).anIntArray5050[i_3_] = -5;
					}
				}
				Class239.aClass166_3372.method1101(false, class246_sub32);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ep.C(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + (class52 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	Class246_Sub1_Sub7(Class_g class_g) {
		try {
			((Class246_Sub1_Sub7) this).aClass_g6034 = class_g;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ep.<init>(" + (class_g != null ? "{...}" : "null") + ')');
		}
	}
}
