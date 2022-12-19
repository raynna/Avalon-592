/* Class246_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub37 extends Node {
	int anInt5321;
	Class246_Sub37 aClass246_Sub37_5322;
	volatile boolean aBool5323 = true;
	Class246_Sub3 aClass246_Sub3_5324;

	abstract void method2254(int[] is, int i, int i_0_);

	int method2255() {
		return 255;
	}

	abstract Class246_Sub37 method2256();

	final void method2257(int[] is, int i, int i_1_) {
		if (((Class246_Sub37) this).aBool5323)
			method2254(is, i, i_1_);
		else
			method2260(i_1_);
	}

	abstract int method2258();

	abstract Class246_Sub37 method2259();

	abstract void method2260(int i);

	public Class246_Sub37() {
		/* empty */
	}
}
