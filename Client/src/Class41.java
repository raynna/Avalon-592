/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class41 {
	static int anInt618 = 0;
	static int anInt619;

	static final void method285(int i, int i_0_, int i_1_, Class59_Sub2 class59_sub2, Class59_Sub2 class59_sub2_2_) {
		Class147 class147 = Class187.method1222(i, i_0_, i_1_);
		if (class147 != null) {
			((Class147) class147).aClass59_Sub2_2153 = class59_sub2;
			((Class147) class147).aClass59_Sub2_2159 = class59_sub2_2_;
		}
	}

	static final int method286(String string, int i) {
		try {
			anInt619++;
			int i_3_ = 0;
			if (i > -28)
				method285(-63, 45, -31, null, null);
			for (/**/; (i_3_ ^ 0xffffffff) > (Class139.aStringArray1988.length ^ 0xffffffff); i_3_++) {
				if (Class139.aStringArray1988[i_3_].equalsIgnoreCase(string))
					return i_3_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dn.A(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method287(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (Class128_Sub2.anIntArrayArray5565 != null)
			Class128_Sub2.anIntArrayArray5565[i][i_4_] = ~0xffffff | i_5_;
		if (Class189.aByteArrayArray2669 != null)
			Class189.aByteArrayArray2669[i][i_4_] = (byte) (i_6_ >> 3);
		if (Class187.aByteArrayArray2649 != null)
			Class187.aByteArrayArray2649[i][i_4_] = (byte) i_7_;
	}
}
