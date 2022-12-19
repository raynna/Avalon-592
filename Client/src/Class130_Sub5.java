/* Class130_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub5 extends Class130 {
	int anInt4811;
	int anInt4812;
	int anInt4813;
	boolean aBool4814 = false;
	int anInt4815;
	int anInt4816;

	public Class130_Sub5() {
		/* empty */
	}

	final boolean method2098(int i, int i_0_) {
		if (!((Class130_Sub5) this).aBool4814)
			return false;
		int i_1_ = (((Class130_Sub5) this).anInt4815 - ((Class130_Sub5) this).anInt4813);
		int i_2_ = (((Class130_Sub5) this).anInt4812 - ((Class130_Sub5) this).anInt4811);
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = (i * i_1_ + i_0_ * i_2_ - (((Class130_Sub5) this).anInt4813 * i_1_ + ((Class130_Sub5) this).anInt4811 * i_2_));
		if (i_4_ <= 0) {
			int i_5_ = ((Class130_Sub5) this).anInt4813 - i;
			int i_6_ = ((Class130_Sub5) this).anInt4811 - i_0_;
			if (i_5_ * i_5_ + i_6_ * i_6_ >= (((Class130_Sub5) this).anInt4816 * ((Class130_Sub5) this).anInt4816))
				return false;
			return true;
		}
		if (i_4_ > i_3_) {
			int i_7_ = ((Class130_Sub5) this).anInt4815 - i;
			int i_8_ = ((Class130_Sub5) this).anInt4812 - i_0_;
			if (i_7_ * i_7_ + i_8_ * i_8_ >= (((Class130_Sub5) this).anInt4816 * ((Class130_Sub5) this).anInt4816))
				return false;
			return true;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = ((Class130_Sub5) this).anInt4813 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = ((Class130_Sub5) this).anInt4811 + (i_2_ * i_4_ >> 10) - i_0_;
		if (i_9_ * i_9_ + i_10_ * i_10_ >= (((Class130_Sub5) this).anInt4816 * ((Class130_Sub5) this).anInt4816))
			return false;
		return true;
	}
}
