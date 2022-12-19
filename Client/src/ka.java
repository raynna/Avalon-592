/* ka - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ka extends Class116 implements Class_d {
	long nativeid;

	protected final void finalize() {
		Class227.method1453((byte) 50, this);
	}

	private final native void ya(char c, int i, int i_0_, int i_1_, boolean bool, Class128 class128, int i_2_, int i_3_);

	ka(qa var_qa, na var_na, Class73 class73, Class10[] class10s, Class_l[] class_ls) {
		super(var_qa, class73);
		byte[][] is = new byte[class10s.length][];
		int[] is_4_ = new int[class10s.length];
		int[] is_5_ = new int[class10s.length];
		int[] is_6_ = new int[class10s.length];
		int[] is_7_ = new int[class10s.length];
		for (int i = 0; i < class10s.length; i++) {
			is[i] = ((Class10) class10s[i]).aByteArray157;
			is_4_[i] = ((Class10) class10s[i]).anInt156;
			is_5_[i] = ((Class10) class10s[i]).anInt155;
			is_6_[i] = ((Class10) class10s[i]).anInt158;
			is_7_[i] = ((Class10) class10s[i]).anInt162;
		}
		ta(var_qa, var_na, is, ((Class10) class10s[0]).anIntArray160, is_4_, is_5_, is_6_, is_7_);
	}

	public final native void EA();

	final void method787(char c, int i, int i_8_, int i_9_, boolean bool, Class128 class128, int i_10_, int i_11_) {
		ya(c, i, i_8_, i_9_, bool, class128, i_10_, i_11_);
	}

	private final native void ta(qa var_qa, na var_na, byte[][] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_);

	final native void OA(char c, int i, int i_17_, int i_18_, boolean bool);
}
