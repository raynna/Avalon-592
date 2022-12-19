/* ha - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ha extends Class210 implements Class_d {
	long nativeid;
	private Class166 aClass166_4504 = new Class166();
	private qa aqa4505;

	final native void b(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_0_, int i_1_, int i_2_, boolean bool);

	public final native void EA();

	private final native void G(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int[] is);

	private final native void IA(qa var_qa, na var_na, int i, int i_8_, int[][] is, int[][] is_9_, int i_10_, int i_11_, int i_12_);

	final native void i(int i, int i_13_, int i_14_);

	final native void ca();

	final void method1383(int i, int i_15_) {
		aqa4505.E().A(this, i, i_15_);
	}

	final native void B(int i, int i_16_, int[] is, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int i_24_, int i_25_, int i_26_, boolean bool);

	final void method1378(int i, int i_27_, int[] is, int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int i_38_, int i_39_, int i_40_, boolean bool) {
		boolean bool_41_ = false;
		if (is_34_ != null) {
			int[] is_42_ = is_34_;
			for (int i_43_ = 0; i_43_ < is_42_.length; i_43_++) {
				int i_44_ = is_42_[i_43_];
				if (i_44_ != -1) {
					bool_41_ = true;
					break;
				}
			}
		}
		int i_45_ = is_34_.length;
		int[] is_46_ = new int[i_45_ * 3];
		int[] is_47_ = new int[i_45_ * 3];
		int[] is_48_ = new int[i_45_ * 3];
		int[] is_49_ = new int[i_45_ * 3];
		int[] is_50_ = new int[i_45_ * 3];
		int[] is_51_ = is_35_ != null ? new int[i_45_ * 3] : null;
		int[] is_52_ = is_28_ != null ? new int[i_45_ * 3] : null;
		int[] is_53_ = is_30_ != null ? new int[i_45_ * 3] : null;
		int i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i_45_; i_55_++) {
			int i_56_ = is_31_[i_55_];
			int i_57_ = is_32_[i_55_];
			int i_58_ = is_33_[i_55_];
			is_46_[i_54_] = is[i_56_];
			is_47_[i_54_] = is_29_[i_56_];
			is_48_[i_54_] = is_34_[i_55_];
			is_49_[i_54_] = is_36_[i_55_];
			is_50_[i_54_] = is_37_[i_55_];
			if (is_35_ != null)
				is_51_[i_54_] = is_35_[i_55_];
			if (is_28_ != null)
				is_52_[i_54_] = is_28_[i_56_];
			if (is_30_ != null)
				is_53_[i_54_] = is_30_[i_56_];
			i_54_++;
			is_46_[i_54_] = is[i_57_];
			is_47_[i_54_] = is_29_[i_57_];
			is_48_[i_54_] = is_34_[i_55_];
			is_49_[i_54_] = is_36_[i_55_];
			is_50_[i_54_] = is_37_[i_55_];
			if (is_35_ != null)
				is_51_[i_54_] = is_35_[i_55_];
			if (is_28_ != null)
				is_52_[i_54_] = is_28_[i_57_];
			if (is_30_ != null)
				is_53_[i_54_] = is_30_[i_57_];
			i_54_++;
			is_46_[i_54_] = is[i_58_];
			is_47_[i_54_] = is_29_[i_58_];
			is_48_[i_54_] = is_34_[i_55_];
			is_49_[i_54_] = is_36_[i_55_];
			is_50_[i_54_] = is_37_[i_55_];
			if (is_35_ != null)
				is_51_[i_54_] = is_35_[i_55_];
			if (is_28_ != null)
				is_52_[i_54_] = is_28_[i_58_];
			if (is_30_ != null)
				is_53_[i_54_] = is_30_[i_58_];
			i_54_++;
		}
		if (bool_41_ || is_51_ != null)
			B(i, i_27_, is_46_, is_52_, is_47_, is_53_, is_48_, is_51_, is_49_, is_50_, i_38_, i_39_, i_40_, bool);
	}

	private final native void W(float[] fs);

	ha(qa var_qa, na var_na, int i, int i_59_, int[][] is, int[][] is_60_, int i_61_, int i_62_, int i_63_) {
		super(i, i_59_, i_61_);
		aqa4505 = var_qa;
		IA(var_qa, var_na, i, i_59_, is, is_60_, i_61_, i_62_, i_63_);
	}

	final void method1379(Class246_Sub41 class246_sub41, int[] is) {
		aClass166_4504.method1101(false, class246_sub41);
		G(class246_sub41.hashCode(), class246_sub41.method2317(false), class246_sub41.method2318((byte) 27), class246_sub41.method2321((byte) -95), class246_sub41.method2322(97), class246_sub41.method2319((byte) -122), is);
	}

	final native void p(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_64_, int i_65_, int i_66_, boolean bool);

	final native int a(int i, int i_67_);

	final void method1380(int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, boolean[][] bools) {
		aqa4505.E().v(this, i, i_68_, i_69_, i_70_, i_71_, i_72_, i_73_, bools);
	}

	final boolean method1377(Class246_Sub1_Sub4 class246_sub1_sub4, int i, int i_74_, int i_75_, int i_76_, boolean bool) {
		return true;
	}

	protected final void finalize() {
		Class227.method1453((byte) 50, this);
	}

	final void method1384(int i, int i_77_, int i_78_, boolean[][] bools, boolean bool) {
		int i_79_ = 0;
		float[] fs = new float[aClass166_4504.method1112(0)];
		for (Class246_Sub41 class246_sub41 = (Class246_Sub41) aClass166_4504.method1104(77); class246_sub41 != null; class246_sub41 = (Class246_Sub41) aClass166_4504.method1108((byte) -112))
			fs[i_79_++] = class246_sub41.method2316(false);
		W(fs);
	}

	final native int l(int i, int i_80_);

	final native Class246_Sub1_Sub4 k(int i, int i_81_, Class246_Sub1_Sub4 class246_sub1_sub4);
}
