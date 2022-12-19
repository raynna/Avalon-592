
/* Class_u_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class Class_u_Sub1 extends Class_u {
	static int anInt5683;
	static Class_fs aClass_fs5684;
	static Class230 aClass230_5685;
	NativeHeap aNativeHeap5686;
	static boolean aBool5687 = false;

	static final boolean method2419(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i_0_ == i_1_ && i_2_ == i_3_) {
			if (!Class246_Sub13.method1988(i, i_0_, i_2_))
				return false;
			int i_5_ = i_0_ << Class126.anInt1781;
			int i_6_ = i_2_ << Class126.anInt1781;
			if (Class160.method1060(i_5_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_0_, i_2_) + i_4_, i_6_ + 1) && Class160.method1060(i_5_ + Class246_Sub1.anInt3744 - 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_0_ + 1, i_2_) + i_4_, i_6_ + 1) && Class160.method1060(i_5_ + Class246_Sub1.anInt3744 - 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_0_ + 1, i_2_ + 1) + i_4_, i_6_ + Class246_Sub1.anInt3744 - 1) && Class160.method1060(i_5_ + 1, Class59_Sub3_Sub4.aClass210Array6993[i].l(i_0_, i_2_ + 1) + i_4_, i_6_ + Class246_Sub1.anInt3744 - 1))
				return true;
			return false;
		}
		for (int i_7_ = i_0_; i_7_ <= i_1_; i_7_++) {
			for (int i_8_ = i_2_; i_8_ <= i_3_; i_8_++) {
				if (Class88.anIntArrayArrayArray1150[i][i_7_][i_8_] == -Class76.anInt997)
					return false;
			}
		}
		int i_9_ = (i_0_ << Class126.anInt1781) + 1;
		int i_10_ = (i_2_ << Class126.anInt1781) + 2;
		int i_11_ = Class59_Sub3_Sub4.aClass210Array6993[i].l(i_0_, i_2_) + i_4_;
		if (!Class160.method1060(i_9_, i_11_, i_10_))
			return false;
		int i_12_ = (i_1_ << Class126.anInt1781) - 1;
		if (!Class160.method1060(i_12_, i_11_, i_10_))
			return false;
		int i_13_ = (i_3_ << Class126.anInt1781) - 1;
		if (!Class160.method1060(i_9_, i_11_, i_13_))
			return false;
		if (!Class160.method1060(i_12_, i_11_, i_13_))
			return false;
		return true;
	}

	public static void method2420(int i) {
		try {
			int i_14_ = 56 / ((52 - i) / 42);
			aClass_fs5684 = null;
			aClass230_5685 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ai.C(" + i + ')');
		}
	}

	final void method2421(int i) {
		do {
			try {
				((Class_u_Sub1) this).aNativeHeap5686.b();
				anInt5683++;
				if (i == 1)
					break;
				method2421(114);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ai.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class_u_Sub1(int i) {
		try {
			((Class_u_Sub1) this).aNativeHeap5686 = new NativeHeap(i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ai.<init>(" + i + ')');
		}
	}
}
