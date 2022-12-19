/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 {
	static short aShort888 = 205;
	private String[] aStringArray889;
	static int anInt890;
	static int anInt891;
	static int anInt892;

	Class67(String string, String string_0_, String string_1_, String string_2_) {
		try {
			aStringArray889 = new String[] { string, string_0_, string_1_, string_2_ };
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gk.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_0_ != null ? "{...}" : "null") + ',' + (string_1_ != null ? "{...}" : "null") + ',' + (string_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	final String method436(boolean bool, int i) {
		try {
			anInt892++;
			if (bool != true)
				aShort888 = (short) -98;
			return aStringArray889[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gk.B(" + bool + ',' + i + ')');
		}
	}

	static final void method437(int i, int i_3_, String string, String string_4_, String string_5_, boolean bool) {
		do {
			try {
				anInt891++;
				Class241.method1545((byte) 78, -1, string_5_, string, null, i, string_4_, i_3_);
				if (bool == true)
					break;
				aShort888 = (short) 55;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gk.A(" + i + ',' + i_3_ + ',' + (string != null ? "{...}" : "null") + ',' + (string_4_ != null ? "{...}" : "null") + ',' + (string_5_ != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			anInt890++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gk.toString(" + ')');
		}
	}
}
