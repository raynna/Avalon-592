
/* Class_b - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class_b {
	CS2Script aClass246_Sub1_Sub1_1160;
	static int anInt1161 = -1;
	static int anInt1162;
	int[] anIntArray1163;
	String[] aStringArray1164;
	int anInt1165 = -1;
	static int anInt1166;

	static final Class260 method567(Canvas canvas, int i, int i_0_, Interface6 interface6) {
		try {
			anInt1166++;
			if (i != 23932)
				method567(null, -44, 2, null);
			return new Class260_Sub1(i_0_, canvas, interface6);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("b.B(" + (canvas != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method568(int i, int i_1_, byte i_2_) {
		try {
			anInt1162++;
			int i_3_ = -9 % ((i_2_ - 4) / 41);
			return (Class152.method1012(i, -24, i_1_) & Class3.method51(i, i_1_, -125));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("b.A(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}
}
