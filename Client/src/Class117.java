/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class117 {
	static final void method801(int[] is, int i, int i_0_) {
		i_0_ = i + i_0_ - 7;
		while (i < i_0_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_0_ += 7;
		while (i < i_0_)
			is[i++] = 0;
	}

	static final void method802(int[] is, int i, int i_1_, int i_2_) {
		i_1_ = i + i_1_ - 7;
		while (i < i_1_) {
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
			is[i++] = i_2_;
		}
		i_1_ += 7;
		while (i < i_1_)
			is[i++] = i_2_;
	}

	static final void method803(short[] is, int i, short[] is_3_, int i_4_, int i_5_) {
		if (is == is_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
					is_3_[i_4_--] = is[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					is_3_[i_4_--] = is[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
			is_3_[i_4_++] = is[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			is_3_[i_4_++] = is[i++];
	}

	static final void method804(float[] fs, int i, float[] fs_6_, int i_7_, int i_8_) {
		if (fs == fs_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
					fs_6_[i_7_--] = fs[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					fs_6_[i_7_--] = fs[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
			fs_6_[i_7_++] = fs[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			fs_6_[i_7_++] = fs[i++];
	}

	static final void method805(byte[] is, int i, byte[] is_9_, int i_10_, int i_11_) {
		if (is == is_9_) {
			if (i == i_10_)
				return;
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					is_9_[i_10_--] = is[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			is_9_[i_10_++] = is[i++];
	}

	static final void method806(int[] is, int i, int[] is_12_, int i_13_, int i_14_) {
		if (is == is_12_) {
			if (i == i_13_)
				return;
			if (i_13_ > i && i_13_ < i + i_14_) {
				i_14_--;
				i += i_14_;
				i_13_ += i_14_;
				i_14_ = i - i_14_;
				i_14_ += 7;
				while (i >= i_14_) {
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
					is_12_[i_13_--] = is[i--];
				}
				i_14_ -= 7;
				while (i >= i_14_)
					is_12_[i_13_--] = is[i--];
				return;
			}
		}
		i_14_ += i;
		i_14_ -= 7;
		while (i < i_14_) {
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
			is_12_[i_13_++] = is[i++];
		}
		i_14_ += 7;
		while (i < i_14_)
			is_12_[i_13_++] = is[i++];
	}

	static final void method807(Object[] objects, int i, Object[] objects_15_, int i_16_, int i_17_) {
		if (objects == objects_15_) {
			if (i == i_16_)
				return;
			if (i_16_ > i && i_16_ < i + i_17_) {
				i_17_--;
				i += i_17_;
				i_16_ += i_17_;
				i_17_ = i - i_17_;
				i_17_ += 7;
				while (i >= i_17_) {
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
					objects_15_[i_16_--] = objects[i--];
				}
				i_17_ -= 7;
				while (i >= i_17_)
					objects_15_[i_16_--] = objects[i--];
				return;
			}
		}
		i_17_ += i;
		i_17_ -= 7;
		while (i < i_17_) {
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
			objects_15_[i_16_++] = objects[i++];
		}
		i_17_ += 7;
		while (i < i_17_)
			objects_15_[i_16_++] = objects[i++];
	}
}
