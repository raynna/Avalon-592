/* Class_n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_n implements Class_d {
	private da ada1513;
	private da ada1514;
	private qa aqa1515;
	private da ada1516;
	Runnable aRunnable1517;
	private da ada1518;
	private da ada1519;
	private da ada1520;
	private da ada1521;
	private da ada1522;
	private da ada1523;
	private da ada1524;
	long nativeid;

	final native void ea(Class_t class_t, Class_c class_c, int[] is, int i);

	final native void TA(Class260 class260, Class_t[] class_ts, Class_c class_c, int[] is, int i, int i_0_);

	final native boolean B(Class_t class_t, int i, int i_1_, Class_c class_c, boolean bool);

	final native void U(Class_t class_t, Class_t class_t_2_, int i, int i_3_, int i_4_, boolean bool);

	final native void G(Class260 class260, int[] is, int[] is_5_, int[] is_6_, short[] is_7_, int i);

	private final native void IA();

	final void method742() {
		((Class_n) this).aRunnable1517 = null;
		c();
	}

	final native void ba(Class260 class260, Class_t class_t, Class_c class_c, int[] is, int i, int[] is_8_, int[] is_9_, int[] is_10_, short[] is_11_, byte[] is_12_, int i_13_, int[] is_14_);

	final native void v(Class210 class210, int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean[][] bools);

	final Class_t method743(da var_da, byte i, int i_21_, boolean bool) {
		da var_da_22_;
		da var_da_23_;
		if (i == 1) {
			var_da_22_ = ada1513;
			var_da_23_ = ada1514;
		} else if (i == 2) {
			var_da_22_ = ada1516;
			var_da_23_ = ada1520;
		} else if (i == 3) {
			var_da_22_ = ada1524;
			var_da_23_ = ada1518;
		} else if (i == 4) {
			var_da_22_ = ada1521;
			var_da_23_ = ada1523;
		} else if (i == 5) {
			var_da_22_ = ada1522;
			var_da_23_ = ada1519;
		} else
			var_da_23_ = var_da_22_ = new da(aqa1515);
		var_da.ya(var_da_23_, var_da_22_, i_21_, i != 0, bool);
		((da) var_da_23_).aClass19Array3987 = ((da) var_da).aClass19Array3987;
		((da) var_da_23_).aClass162Array3986 = ((da) var_da).aClass162Array3986;
		return var_da_23_;
	}

	protected final void finalize() {
		Class227.method1453((byte) 50, this);
	}

	final native void va(Class260 class260, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_);

	public final native void EA();

	final native void Y(Class260 class260, Class_t[] class_ts, Class_c class_c, int[] is, int i, int[] is_30_, int[] is_31_, int[] is_32_, short[] is_33_, byte[] is_34_, int i_35_, int[] is_36_);

	final void method744() {
		((Class_n) this).aRunnable1517 = Thread.currentThread();
		IA();
	}

	final native void ta(Class_t class_t, Class_c class_c, int[] is, int i, int i_37_);

	private final native void O(Class260 class260, int i, int i_38_);

	private final native void c();

	final native void A(Class210 class210, int i, int i_39_);

	Class_n(qa var_qa, int i, int i_40_) {
		aqa1515 = var_qa;
		ada1514 = new da(aqa1515);
		ada1520 = new da(aqa1515);
		ada1518 = new da(aqa1515);
		ada1523 = new da(aqa1515);
		ada1519 = new da(aqa1515);
		ada1513 = new da(aqa1515);
		ada1516 = new da(aqa1515);
		ada1524 = new da(aqa1515);
		ada1521 = new da(aqa1515);
		ada1522 = new da(aqa1515);
		O(var_qa, i, i_40_);
	}
}
