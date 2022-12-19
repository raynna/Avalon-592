
/* Class246_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class246_Sub29 extends Node {
	boolean aBool4964;
	String aString4965;
	static Class178 aClass178_4966;
	static int anInt4967;
	static Class166 aClass166_4968;
	Class235 aClass235_4969;
	static long aLong4970;
	int anInt4971;
	int anInt4972;
	int anInt4973;
	Class235 aClass235_4974;
	int anInt4975;
	static Class182 aClass182_4976 = null;
	Object[] anObjectArray4977;
	int anInt4978;
	int anInt4979;
	static int[] anIntArray4980;
	static int anInt4981;
	static int[] anIntArray4982;

	static final void method2150(int i, int i_0_, byte i_1_, int i_2_, boolean bool, int i_3_) {
		try {
			anInt4967++;
			if (Class38_Sub1.aFrame5114 != null && ((i ^ 0xffffffff) != -4 || ((i_2_ ^ 0xffffffff) != (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt577 ^ 0xffffffff)) || (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt604) != i_3_)) {
				Class256.method1662(Class108.aClass52_1535, (byte) -62, Class38_Sub1.aFrame5114);
				Class38_Sub1.aFrame5114 = null;
			}
			if (i == 3 && Class38_Sub1.aFrame5114 == null) {
				Class38_Sub1.aFrame5114 = Class3.method50(i_2_, -8390, Class108.aClass52_1535, i_3_, 0, 0);
				if (Class38_Sub1.aFrame5114 != null) {
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt577 = i_2_;
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt604 = i_3_;
					Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 59);
				}
			}
			if ((i ^ 0xffffffff) == -4 && Class38_Sub1.aFrame5114 == null)
				method2150((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt600), i_0_, (byte) -45, -1, true, -1);
			else {
				java.awt.Container container;
				if (Class38_Sub1.aFrame5114 == null) {
					if (Class122.aFrame1688 == null) {
						container = Class108.aClass52_1535.anApplet733;
						Class246_Sub28_Sub35.anInt7014 = container.getSize().width;
						Class8.anInt101 = container.getSize().height;
					} else {
						Insets insets = Class122.aFrame1688.getInsets();
						Class246_Sub28_Sub35.anInt7014 = (Class122.aFrame1688.getSize().width - insets.left + -insets.right);
						Class8.anInt101 = (Class122.aFrame1688.getSize().height + (-insets.bottom + -insets.top));
						container = Class122.aFrame1688;
					}
				} else {
					Class8.anInt101 = i_3_;
					container = Class38_Sub1.aFrame5114;
					Class246_Sub28_Sub35.anInt7014 = i_2_;
				}
				if ((i ^ 0xffffffff) == -2) {
					Class100_Sub1.anInt5075 = 0;
					Class162.anInt2300 = Class83.anInt1090;
					Class125.anInt1768 = (-Class196.anInt2757 + Class246_Sub28_Sub35.anInt7014) / 2;
					Class246_Sub41_Sub1.anInt6171 = Class196.anInt2757;
				} else if (Class40_Sub2.anInt4047 >= 96 || BufferStream.anInt5656 != 0) {
					Class246_Sub41_Sub1.anInt6171 = Class246_Sub28_Sub35.anInt7014;
					Class100_Sub1.anInt5075 = 0;
					Class162.anInt2300 = Class8.anInt101;
					Class125.anInt1768 = 0;
				} else {
					int i_4_ = (Class246_Sub28_Sub35.anInt7014 > 1024 ? 1024 : Class246_Sub28_Sub35.anInt7014);
					int i_5_ = Class8.anInt101 > 768 ? 768 : Class8.anInt101;
					Class125.anInt1768 = (-i_4_ + Class246_Sub28_Sub35.anInt7014) / 2;
					Class246_Sub41_Sub1.anInt6171 = i_4_;
					Class162.anInt2300 = i_5_;
					Class100_Sub1.anInt5075 = 0;
				}
				if (Class260_Sub2.aClass205_4297 != Class208.aClass205_2930) {
					if (Class246_Sub41_Sub1.anInt6171 < 1024 && Class162.anInt2300 < 768) {
						/* empty */
					}
				}
				if (bool)
					Class191.method1259(i_1_ ^ 0x46);
				else {
					Class147.aCanvas2155.setSize(Class246_Sub41_Sub1.anInt6171, Class162.anInt2300);
					Class246_Sub15.aClass260_4445.method1713(Class147.aCanvas2155);
					if (container == Class122.aFrame1688) {
						Insets insets = Class122.aFrame1688.getInsets();
						Class147.aCanvas2155.setLocation(insets.left + Class125.anInt1768, insets.top - -Class100_Sub1.anInt5075);
					} else
						Class147.aCanvas2155.setLocation(Class125.anInt1768, (Class100_Sub1.anInt5075));
				}
				if ((i ^ 0xffffffff) <= -3)
					Class59_Sub5_Sub1.aBool5829 = true;
				else
					Class59_Sub5_Sub1.aBool5829 = false;
				if (Class183.anInt2549 != -1)
					Class177.method1165((byte) -101, true);
				if (Class65.aClass6_864 != null && ((Class225.anInt3103 ^ 0xffffffff) == -31 || (Class225.anInt3103 ^ 0xffffffff) == -26))
					Class_a.method576((byte) 93);
				int i_6_ = 0;
				if (i_1_ != -45)
					aClass166_4968 = null;
				for (/**/; i_6_ < 100; i_6_++)
					Class246_Sub39.aBoolArray5488[i_6_] = true;
				Class246_Sub28_Sub8.aBool6060 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("op.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + i_3_ + ')'));
		}
	}

	public static void method2151(int i) {
		try {
			anIntArray4982 = null;
			aClass178_4966 = null;
			aClass166_4968 = null;
			if (i == -1) {
				aClass182_4976 = null;
				anIntArray4980 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "op.A(" + i + ')');
		}
	}

	public Class246_Sub29() {
		/* empty */
	}

	static {
		aLong4970 = -1L;
		aClass166_4968 = new Class166();
		anIntArray4980 = new int[] { 1, 2, 4, 8 };
		anInt4981 = 0;
		anIntArray4982 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	}
}
