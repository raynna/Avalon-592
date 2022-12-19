
/* Class59_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Color;

abstract class Class59_Sub2 extends Class59 {
	static Color[] aColorArray4539;
	int anInt4540;
	int anInt4541;
	int anInt4542;
	static int anInt4543;
	static Class188[] aClass188Array4544 = new Class188[128];
	static int[][] anIntArrayArray4545;
	static String aString4546;
	static int anInt4547;
	static int anInt4548;
	int anInt4549;
	static int anInt4550;
	static int anInt4551;
	int anInt4552;
	static float aFloat4553 = 1024.0F;
	static int anInt4554;
	static int anInt4555;
	int anInt4556;
	static int anInt4557;
	static IncomingPacket SEND_PROJECTILE_PACKET;
	static int[] anIntArray4559;
	static int anInt4560;
	static float aFloat4561;
	static int anInt4562;
	int anInt4563;

	final boolean method406(byte i) {
		try {
			anInt4554++;
			if (i <= 104)
				((Class59_Sub2) this).anInt4552 = 125;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ii.E(" + i + ')');
		}
	}

	static final void method2019(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_) {
		do {
			try {
				if (i_3_ == i_1_ && (i_8_ ^ 0xffffffff) == (i_4_ ^ 0xffffffff) && (i_7_ ^ 0xffffffff) == (i ^ 0xffffffff) && (i_6_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
					Class246_Sub41_Sub2.method2679(i_0_, false, i_6_, i_8_, i, i_3_);
				else {
					int i_9_ = i_3_;
					int i_10_ = i_8_;
					int i_11_ = i_3_ * 3;
					int i_12_ = 3 * i_8_;
					int i_13_ = 3 * i_1_;
					int i_14_ = i_4_ * 3;
					int i_15_ = 3 * i_7_;
					int i_16_ = 3 * i_2_;
					int i_17_ = i_13_ + i - (i_15_ - -i_3_);
					int i_18_ = -i_16_ + i_6_ + (i_14_ + -i_8_);
					int i_19_ = i_11_ + -i_13_ + (i_15_ + -i_13_);
					int i_20_ = i_12_ + (-i_14_ + -i_14_) + i_16_;
					int i_21_ = -i_11_ + i_13_;
					int i_22_ = -i_12_ + i_14_;
					for (int i_23_ = 128; (i_23_ ^ 0xffffffff) >= -4097; i_23_ += 128) {
						int i_24_ = i_23_ * i_23_ >> 12;
						int i_25_ = i_24_ * i_23_ >> 12;
						int i_26_ = i_17_ * i_25_;
						int i_27_ = i_18_ * i_25_;
						int i_28_ = i_19_ * i_24_;
						int i_29_ = i_20_ * i_24_;
						int i_30_ = i_23_ * i_21_;
						int i_31_ = i_23_ * i_22_;
						int i_32_ = i_3_ + (i_28_ + i_26_ - -i_30_ >> 12);
						int i_33_ = (i_29_ + (i_27_ - -i_31_) >> 12) + i_8_;
						Class246_Sub41_Sub2.method2679(i_0_, false, i_33_, i_10_, i_32_, i_9_);
						i_9_ = i_32_;
						i_10_ = i_33_;
					}
				}
				anInt4555++;
				if (i_5_ > 40)
					break;
				method2024(null, 123);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ii.DA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2020(int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		try {
			do {
				if ((Class197.anInt2818 ^ 0xffffffff) >= (-i_36_ + i_37_ ^ 0xffffffff) && (i_36_ + i_37_ ^ 0xffffffff) >= (Class110.anInt1573 ^ 0xffffffff) && Class_t.anInt1442 <= i - i_36_ && (i + i_36_ ^ 0xffffffff) >= (Class109_Sub4.anInt4570 ^ 0xffffffff)) {
					Class92.method586(i_37_, i_36_, i, (byte) 48, i_34_);
					if (!client.f_ob)
						break;
				}
				Class252.method1620(i, i_34_, i_36_, i_37_, true);
			} while (false);
			if (i_35_ == 26941)
				anInt4551++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ii.CA(" + i + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	public static void method2021(int i) {
		try {
			aString4546 = null;
			if (i != 6)
				method2021(8);
			anIntArray4559 = null;
			aColorArray4539 = null;
			aClass188Array4544 = null;
			anIntArrayArray4545 = null;
			SEND_PROJECTILE_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ii.FA(" + i + ')');
		}
	}

	static final void method2022(int i) {
		do {
			try {
				anInt4557++;
				if (i != 128)
					SEND_PROJECTILE_PACKET = null;
				if ((Class183.anInt2549 ^ 0xffffffff) != 0) {
					int i_38_ = Class238.aClass102_3360.method640((byte) 58);
					int i_39_ = Class238.aClass102_3360.method636(i + 2917);
					Class246_Sub30 class246_sub30 = (Class246_Sub30) Class235.f_qb.method1104(109);
					if (class246_sub30 != null) {
						i_38_ = class246_sub30.method2160(-89);
						i_39_ = class246_sub30.method2161((byte) -66);
					}
					Class_cs.method2921(0, 0, Class246_Sub41_Sub1.anInt6171, Class183.anInt2549, 29474, 0, 0, Class162.anInt2300, i_39_, i_38_);
					if (Class246_Sub11.aClass235_4106 == null)
						break;
					Class168.method1118(i_38_, i_39_, (byte) -120);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ii.EA(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract int method2023(boolean bool);

	final void method405(int i, int i_40_, Class59 class59, byte i_41_, boolean bool, Class260 class260, int i_42_) {
		try {
			if (i_41_ != -99)
				((Class59_Sub2) this).anInt4563 = -97;
			anInt4560++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ii.L(" + i + ',' + i_40_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_41_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_42_ + ')'));
		}
	}

	static final Class246_Sub19 method2024(Canvas canvas, int i) {
		try {
			anInt4547++;
			try {
				Class var_class = Class.forName("Class246_Sub19_Sub1");
				Class246_Sub19 class246_sub19 = (Class246_Sub19) var_class.newInstance();
				if (i != 18248)
					SEND_PROJECTILE_PACKET = null;
				class246_sub19.method2069((byte) 66, canvas);
				return class246_sub19;
			} catch (Throwable throwable) {
				Class246_Sub19_Sub2 class246_sub19_sub2 = new Class246_Sub19_Sub2();
				class246_sub19_sub2.method2069((byte) 66, canvas);
				return class246_sub19_sub2;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ii.BA(" + (canvas != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2025(boolean bool, int i, int i_43_) {
		do {
			try {
				anInt4548++;
				Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_43_, (byte) 116, 14);
				class246_sub1_sub10.method2600(-25852);
				((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i;
				if (bool == false)
					break;
				aClass188Array4544 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ii.AA(" + bool + ',' + i + ',' + i_43_ + ')'));
			}
			break;
		} while (false);
	}

	final void method401(int i) {
		try {
			int i_44_ = 79 % ((57 - i) / 44);
			anInt4543++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ii.J(" + i + ')');
		}
	}

	Class59_Sub2(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		try {
			((Class59_Sub2) this).anInt4541 = i_49_;
			((Class59_Sub2) this).anInt4563 = i;
			((Class59_Sub2) this).anInt4556 = i_47_;
			((Class59_Sub2) this).anInt4540 = i_48_;
			((Class59_Sub2) this).anInt4542 = i_46_;
			((Class59_Sub2) this).anInt4552 = i_45_;
			((Class59_Sub2) this).anInt4549 = i_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ii.<init>(" + i + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ')'));
		}
	}

	static {
		anIntArrayArray4545 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		aColorArray4539 = new Color[] { new Color(9179409), new Color(16777215) };
		anIntArray4559 = new int[] { 28, 35, 40, 44 };
		SEND_PROJECTILE_PACKET = new IncomingPacket(57, 15);
	}
}
