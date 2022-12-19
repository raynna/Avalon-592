/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashMap {
	static int anInt758;
	static int anInt759;
	static int anInt760;
	static int anInt761;
	static Class68 aClass68_762 = new Class68();
	private int anInt763;
	static int anInt764;
	static int anInt765;
	static int anInt766;
	static int anInt767;
	private Class217 aClass217_768 = new Class217();
	private int anInt769;
	static int anInt770;
	static int anInt771 = -50;
	private Class85 aClass85_772;
	static int anInt773;
	static Class61 aClass61_774;
	static int anInt775;
	static int anInt776;
	static int anInt777;
	static int anInt778;
	static int[] anIntArray779 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	static int anInt780;

	final void method369(boolean bool) {
		do {
			try {
				anInt775++;
				aClass217_768.method1406((byte) -120);
				aClass85_772.method543(0);
				anInt769 = anInt763;
				if (bool == false)
					break;
				aClass61_774 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fa.G(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final boolean method370(int i, byte i_0_) {
		try {
			if (i_0_ != -38)
				return true;
			anInt778++;
			if (((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -4) && i != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.J(" + i + ',' + i_0_ + ')');
		}
	}

	final void method371(int i, long l, Object object) {
		try {
			method382(object, 4096, l, i);
			anInt767++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fa.D(" + i + ',' + l + ',' + (object != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method372(int i) {
		do {
			try {
				aClass68_762 = null;
				anIntArray779 = null;
				aClass61_774 = null;
				if (i == 24310)
					break;
				aClass68_762 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fa.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method373(byte i) {
		try {
			int i_1_ = 92 / ((2 - i) / 60);
			anInt761++;
			return anInt769;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.H(" + i + ')');
		}
	}

	final Object method374(int i) {
		try {
			anInt760++;
			Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass85_772.next((byte) -20);
			if (i != -17845)
				anInt769 = 102;
			while (class246_sub1_sub8 != null) {
				Object object = class246_sub1_sub8.method2568(250);
				if (object != null)
					return object;
				Class246_Sub1_Sub8 class246_sub1_sub8_2_ = class246_sub1_sub8;
				class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass85_772.next((byte) -20);
				class246_sub1_sub8_2_.unlink((byte) 114);
				class246_sub1_sub8_2_.method1756((byte) 59);
				anInt769 += ((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.E(" + i + ')');
		}
	}

	private final void method375(long l, int i) {
		try {
			anInt764++;
			Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass85_772.method544(l, 125);
			if (i == 10131)
				method384(class246_sub1_sub8, 79);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.C(" + l + ',' + i + ')');
		}
	}

	static final void method376(boolean bool) {
		try {
			if (bool != true)
				method372(64);
			if (Class149.anIntArray2191 == null || Class246_Sub1_Sub18.anIntArray6855 == null) {
				Class246_Sub1_Sub18.anIntArray6855 = new int[256];
				Class149.anIntArray2191 = new int[256];
				for (int i = 0; i < 256; i++) {
					double d = (double) i / 255.0 * 6.283185307179586;
					Class149.anIntArray2191[i] = (int) (4096.0 * Math.sin(d));
					Class246_Sub1_Sub18.anIntArray6855[i] = (int) (Math.cos(d) * 4096.0);
				}
			}
			anInt777++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.P(" + bool + ')');
		}
	}

	final int method377(byte i) {
		try {
			anInt776++;
			if (i != 58)
				return 59;
			return anInt763;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.B(" + i + ')');
		}
	}

	final int method378(byte i) {
		try {
			anInt759++;
			int i_3_ = 0;
			Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass217_768.method1408((byte) 87);
			int i_4_ = -33 % ((i + 18) / 54);
			for (/**/; class246_sub1_sub8 != null; class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass217_768.method1411(true)) {
				if (!class246_sub1_sub8.method2566((byte) 109))
					i_3_++;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.N(" + i + ')');
		}
	}

	final Object method379(long l, byte i) {
		try {
			anInt773++;
			Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass85_772.method544(l, 126);
			if (class246_sub1_sub8 == null)
				return null;
			Object object = class246_sub1_sub8.method2568(250);
			if (object == null) {
				class246_sub1_sub8.unlink((byte) -61);
				class246_sub1_sub8.method1756((byte) 28);
				anInt769 += ((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106;
				return null;
			}
			if (i != 58)
				return null;
			do {
				if (class246_sub1_sub8.method2566((byte) 116)) {
					Class246_Sub1_Sub8_Sub1 class246_sub1_sub8_sub1 = new Class246_Sub1_Sub8_Sub1(object, (((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106));
					aClass85_772.method547((((Node) class246_sub1_sub8).hash), -2301, class246_sub1_sub8_sub1);
					aClass217_768.method1407(19, class246_sub1_sub8_sub1);
					((Class246_Sub1) class246_sub1_sub8_sub1).aLong3739 = 0L;
					class246_sub1_sub8.unlink((byte) 106);
					class246_sub1_sub8.method1756((byte) -80);
					if (!client.f_ob)
						break;
				}
				aClass217_768.method1407(-125, class246_sub1_sub8);
				((Class246_Sub1) class246_sub1_sub8).aLong3739 = 0L;
			} while (false);
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.A(" + l + ',' + i + ')');
		}
	}

	final void method380(int i, int i_5_) {
		try {
			if (i_5_ == -50) {
				if (Class210_Sub2.aClass248_5018 != null) {
					for (Class246_Sub1_Sub8 class246_sub1_sub8 = ((Class246_Sub1_Sub8) aClass217_768.method1408((byte) 87)); class246_sub1_sub8 != null; class246_sub1_sub8 = ((Class246_Sub1_Sub8) aClass217_768.method1411(true))) {
						if (!class246_sub1_sub8.method2566((byte) 113)) {
							if ((++((Class246_Sub1) class246_sub1_sub8).aLong3739 ^ 0xffffffffffffffffL) < ((long) i ^ 0xffffffffffffffffL)) {
								Class246_Sub1_Sub8 class246_sub1_sub8_6_ = (Class210_Sub2.aClass248_5018.method1582(-128, class246_sub1_sub8));
								aClass85_772.method547((((Node) class246_sub1_sub8).hash), -2301, class246_sub1_sub8_6_);
								Class118.method813(true, class246_sub1_sub8, class246_sub1_sub8_6_);
								class246_sub1_sub8.unlink((byte) 79);
								class246_sub1_sub8.method1756((byte) 54);
							}
						} else if (class246_sub1_sub8.method2568(250) == null) {
							class246_sub1_sub8.unlink((byte) -87);
							class246_sub1_sub8.method1756((byte) -108);
							anInt769++;
						}
					}
				}
				anInt766++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.O(" + i + ',' + i_5_ + ')');
		}
	}

	final Object method381(byte i) {
		try {
			anInt765++;
			if (i != -119)
				aClass68_762 = null;
			Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass85_772.first((byte) -23);
			while (class246_sub1_sub8 != null) {
				Object object = class246_sub1_sub8.method2568(250);
				if (object == null) {
					Class246_Sub1_Sub8 class246_sub1_sub8_7_ = class246_sub1_sub8;
					class246_sub1_sub8 = ((Class246_Sub1_Sub8) aClass85_772.next((byte) -20));
					class246_sub1_sub8_7_.unlink((byte) -118);
					class246_sub1_sub8_7_.method1756((byte) -100);
					anInt769 += ((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106;
				} else
					return object;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.M(" + i + ')');
		}
	}

	private final void method382(Object object, int i, long l, int i_8_) {
		try {
			anInt770++;
			if (i_8_ > anInt763)
				throw new IllegalStateException("s>cs");
			method375(l, 10131);
			anInt769 -= i_8_;
			while (anInt769 < 0) {
				Class246_Sub1_Sub8 class246_sub1_sub8 = (Class246_Sub1_Sub8) aClass217_768.method1410((byte) 65);
				method384(class246_sub1_sub8, 103);
			}
			Class246_Sub1_Sub8_Sub1 class246_sub1_sub8_sub1 = new Class246_Sub1_Sub8_Sub1(object, i_8_);
			if (i != 4096)
				aClass217_768 = null;
			aClass85_772.method547(l, -2301, class246_sub1_sub8_sub1);
			aClass217_768.method1407(-122, class246_sub1_sub8_sub1);
			((Class246_Sub1) class246_sub1_sub8_sub1).aLong3739 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fa.L(" + (object != null ? "{...}" : "null") + ',' + i + ',' + l + ',' + i_8_ + ')'));
		}
	}

	final void method383(int i) {
		do {
			try {
				for (Class246_Sub1_Sub8 class246_sub1_sub8 = ((Class246_Sub1_Sub8) aClass217_768.method1408((byte) 87)); class246_sub1_sub8 != null; class246_sub1_sub8 = ((Class246_Sub1_Sub8) aClass217_768.method1411(true))) {
					if (class246_sub1_sub8.method2566((byte) 112)) {
						class246_sub1_sub8.unlink((byte) 68);
						class246_sub1_sub8.method1756((byte) 96);
						anInt769 += (((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106);
					}
				}
				anInt758++;
				if (i > 72)
					break;
				aClass68_762 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fa.I(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method384(Class246_Sub1_Sub8 class246_sub1_sub8, int i) {
		do {
			try {
				anInt780++;
				if (i > 40) {
					if (class246_sub1_sub8 == null)
						break;
					class246_sub1_sub8.unlink((byte) 124);
					class246_sub1_sub8.method1756((byte) -117);
					anInt769 += ((Class246_Sub1_Sub8) class246_sub1_sub8).anInt6106;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fa.K(" + (class246_sub1_sub8 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	HashMap(int i) {
		try {
			anInt769 = i;
			anInt763 = i;
			int i_9_;
			for (i_9_ = 1; i > i_9_ + i_9_; i_9_ += i_9_) {
				/* empty */
			}
			aClass85_772 = new Class85(i_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fa.<init>(" + i + ')');
		}
	}
}
