/* Class_s - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_s extends Class116 implements Class_d {
	long nativeid;

	final native void OA(char c, int i, int i_0_, int i_1_, boolean bool);

	Class_s(qa var_qa, na var_na, Class73 class73, Class10[] class10s, Class_l[] class_ls) {
		super(var_qa, class73);
		byte[][] is = new byte[class10s.length][];
		int[] is_2_ = new int[class10s.length];
		int[] is_3_ = new int[class10s.length];
		int[] is_4_ = new int[class10s.length];
		int[] is_5_ = new int[class10s.length];
		for (int i = 0; i < class10s.length; i++) {
			is[i] = ((Class10) class10s[i]).aByteArray157;
			is_2_[i] = ((Class10) class10s[i]).anInt156;
			is_3_[i] = ((Class10) class10s[i]).anInt155;
			is_4_[i] = ((Class10) class10s[i]).anInt158;
			is_5_[i] = ((Class10) class10s[i]).anInt162;
		}
		NA(var_qa, var_na, is, is_2_, is_3_, is_4_, is_5_);
	}

	public final native void EA();

	private final native void NA(qa var_qa, na var_na, byte[][] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_);

	final void method787(char c, int i, int i_10_, int i_11_, boolean bool, Class128 class128, int i_12_, int i_13_) {
		A(c, i, i_10_, i_11_, bool, class128, i_12_, i_13_);
	}

	private final native void A(char c, int i, int i_14_, int i_15_, boolean bool, Class128 class128, int i_16_, int i_17_);

	protected final void finalize() {
		Class227.method1453((byte) 50, this);
	}
}
