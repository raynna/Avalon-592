
/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
	static float[] aFloatArray4823 = { 0.0F, -1.0F, 0.0F, 0.0F };
	static int anInt4824;
	static Signlink aClass52_4825;
	static OutgoingPacket INTERFACE_ON_OBJECT_PACKET = new OutgoingPacket(16, 15);
	static int anInt4827;
	static int[] anIntArray4828;

	public static void method2100(int i) {
		try {
			aClass52_4825 = null;
			aFloatArray4823 = null;
			if (i != 8301)
				method2101(-46);
			INTERFACE_ON_OBJECT_PACKET = null;
			anIntArray4828 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mm.B(" + i + ')');
		}
	}

	public final int read() {
		try {
			anInt4827++;
			Class247.method1580(30000L, -5184);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mm.read(" + ')');
		}
	}

	static final void method2101(int i) {
		try {
			if ((Class225.anInt3103 ^ 0xffffffff) != -11 && Class225.anInt3103 != 28) {
				int i_0_ = ((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0] >> 3;
				int i_1_ = ((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0] >> 3;
				if ((i_0_ ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 >> 3 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) && i_1_ >= 0 && (i_1_ ^ 0xffffffff) > (Class152.anInt2205 >> 3 ^ 0xffffffff))
					Stream_Sub2.method2597(i_0_, i_1_, 5000, i + 12388);
				else
					Stream_Sub2.method2597(Class38_Sub1_Sub1.anInt6770 >> 4, Class152.anInt2205 >> 4, 0, 0);
			} else
				Stream_Sub2.method2597(Class246_Sub16.aInt92 >> 10, Class259_Sub1.anInt4509 >> 10, 5000, 0);
			anInt4824++;
			Class154_Sub1.method2089(-75);
			Class5.method61((byte) 84);
			Class95.method609(1);
			if (i != -12388)
				method2100(41);
			Class40_Sub6.method2182((byte) -98);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mm.A(" + i + ')');
		}
	}
}
