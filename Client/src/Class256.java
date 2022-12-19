
/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class256 {
	static int[] anIntArray3673 = new int[1000];
	static int anInt3674;
	static Class81 aClass81_3675 = new Class81(1, 2, 2, 0);
	static int anInt3676;
	private Class260_Sub2 aClass260_Sub2_3677;
	long aLong3678;
	static int anInt3679;
	static byte aByte3680;
	static int anInt3681;
	static int anInt3682;

	public static void method1661(int i) {
		do {
			try {
				anIntArray3673 = null;
				aClass81_3675 = null;
				if (i == 0)
					break;
				method1662(null, (byte) 100, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wl.B(" + i + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			anInt3679++;
			aClass260_Sub2_3677.method1973(-34844, ((Class256) this).aLong3678);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wl.finalize(" + ')');
		}
	}

	static final void method1662(Signlink class52, byte i, Frame frame) {
		try {
			for (;;) {
				Class182 class182 = class52.method357((byte) -64, frame);
				while ((class182.anInt2539 ^ 0xffffffff) == -1)
					Class247.method1580(10L, -5184);
				if ((class182.anInt2539 ^ 0xffffffff) == -2)
					break;
				Class247.method1580(100L, -5184);
			}
			anInt3674++;
			frame.setVisible(false);
			if (i != -62)
				aClass81_3675 = null;
			frame.dispose();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wl.A(" + (class52 != null ? "{...}" : "null") + ',' + i + ',' + (frame != null ? "{...}" : "null") + ')'));
		}
	}

	Class256(Class260_Sub2 class260_sub2, long l, int i) {
		try {
			aClass260_Sub2_3677 = class260_sub2;
			((Class256) this).aLong3678 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wl.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
		}
	}

	static final void method1663(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class246_Sub1_Sub7.anInt6029 = i_2_;
			Class12.anInt181 = i;
			Class98.anInt1267 = i_3_;
			Class_q_Sub1.anInt6668 = i_0_;
			Class_c.anInt1192 = i_1_;
			if (i_5_ < 70)
				method1663(114, 61, 22, 8, -106, -13, -93);
			Class112.anInt1588 = i_4_;
			anInt3682++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wl.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final Class199 method1664(byte i, int i_6_, int i_7_) {
		try {
			anInt3676++;
			Class199 class199 = new Class199();
			((Class199) class199).anInt2836 = -1;
			((Class199) class199).anInt2830 = 1 + i_6_ + 5;
			((Class199) class199).anInt2837 = 1 + i_7_ + 5;
			if (i > -117)
				return null;
			((Class199) class199).anInt2841 = -1;
			((Class199) class199).anIntArrayArray2829 = (new int[((Class199) class199).anInt2837][((Class199) class199).anInt2830]);
			class199.method1324(-51);
			return class199;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wl.D(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}
}
