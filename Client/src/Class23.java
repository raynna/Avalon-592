/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23 {
	public String[] aStringArray329;
	public int anInt330;
	public int anInt331;
	public String aString332;
	public String aString333;
	public int[] anIntArray334 = new int[20];
	public static boolean aBool335;

	public Class23(String string, String string_0_, String[] strings, int i, int i_1_, int[] is) {
		try {
			anIntArray334 = is;
			aString333 = string_0_;
			aStringArray329 = strings;
			aString332 = string;
			anInt330 = i_1_;
			anInt331 = i;
		} catch (RuntimeException runtimeexception) {
			throw RuntimeException_Sub1.method2886(runtimeexception, ("b.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_0_ != null ? "{...}" : "null") + ',' + (strings != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
