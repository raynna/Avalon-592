/* RuntimeException_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub2 extends RuntimeException {
	static boolean aBool7148 = true;
	String aString7149;
	static int anInt7150;
	static int anInt7151;
	Throwable aThrowable7152;
	static int anInt7153 = 1;
	static int anInt7154 = -2;

	static final byte[] method2922(byte[] is, int i) {
		try {
			anInt7151++;
			if (i != 1727)
				method2922(null, 41);
			int i_0_ = is.length;
			byte[] is_1_ = new byte[i_0_];
			Class117.method805(is, 0, is_1_, 0, i_0_);
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mn.A(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	RuntimeException_Sub2(Throwable throwable, String string) {
		try {
			((RuntimeException_Sub2) this).aThrowable7152 = throwable;
			((RuntimeException_Sub2) this).aString7149 = string;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
