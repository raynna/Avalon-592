/* Class_c_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_c_Sub2 extends Class_c {
	int anInt5583;
	int anInt5584;
	int anInt5585;
	int anInt5586;
	int anInt5587;
	int anInt5588;
	int anInt5589;
	int anInt5590;
	int anInt5591;
	int anInt5592;
	int anInt5593;
	int anInt5594;

	final void N(int i) {
		((Class_c_Sub2) this).anInt5594 = 32768;
		((Class_c_Sub2) this).anInt5586 = ((Class_c_Sub2) this).anInt5585 = Class39_Sub1.anIntArray4672[i & 0x3fff];
		((Class_c_Sub2) this).anInt5590 = Class39_Sub1.f_fb[i & 0x3fff];
		((Class_c_Sub2) this).anInt5587 = -((Class_c_Sub2) this).anInt5590;
		((Class_c_Sub2) this).anInt5588 = ((Class_c_Sub2) this).anInt5592 = ((Class_c_Sub2) this).anInt5589 = ((Class_c_Sub2) this).anInt5591 = ((Class_c_Sub2) this).anInt5584 = ((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) this).anInt5593 = 0;
	}

	final void O(int i) {
		((Class_c_Sub2) this).anInt5585 = 32768;
		((Class_c_Sub2) this).anInt5594 = ((Class_c_Sub2) this).anInt5586 = Class39_Sub1.anIntArray4672[i & 0x3fff];
		((Class_c_Sub2) this).anInt5591 = Class39_Sub1.f_fb[i & 0x3fff];
		((Class_c_Sub2) this).anInt5588 = -((Class_c_Sub2) this).anInt5591;
		((Class_c_Sub2) this).anInt5592 = ((Class_c_Sub2) this).anInt5589 = ((Class_c_Sub2) this).anInt5587 = ((Class_c_Sub2) this).anInt5584 = ((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) this).anInt5593 = 0;
	}

	final void ka(int i) {
		int i_0_ = Class39_Sub1.anIntArray4672[i & 0x3fff];
		int i_1_ = Class39_Sub1.f_fb[i & 0x3fff];
		int i_2_ = ((Class_c_Sub2) this).anInt5591;
		int i_3_ = ((Class_c_Sub2) this).anInt5586;
		int i_4_ = ((Class_c_Sub2) this).anInt5587;
		int i_5_ = ((Class_c_Sub2) this).anInt5584;
		((Class_c_Sub2) this).anInt5591 = i_2_ * i_0_ - ((Class_c_Sub2) this).anInt5583 * i_1_ >> 15;
		((Class_c_Sub2) this).anInt5583 = i_2_ * i_1_ + ((Class_c_Sub2) this).anInt5583 * i_0_ >> 15;
		((Class_c_Sub2) this).anInt5586 = i_3_ * i_0_ - ((Class_c_Sub2) this).anInt5590 * i_1_ >> 15;
		((Class_c_Sub2) this).anInt5590 = i_3_ * i_1_ + ((Class_c_Sub2) this).anInt5590 * i_0_ >> 15;
		((Class_c_Sub2) this).anInt5587 = i_4_ * i_0_ - ((Class_c_Sub2) this).anInt5585 * i_1_ >> 15;
		((Class_c_Sub2) this).anInt5585 = i_4_ * i_1_ + ((Class_c_Sub2) this).anInt5585 * i_0_ >> 15;
		((Class_c_Sub2) this).anInt5584 = i_5_ * i_0_ - ((Class_c_Sub2) this).anInt5593 * i_1_ >> 15;
		((Class_c_Sub2) this).anInt5593 = i_5_ * i_1_ + ((Class_c_Sub2) this).anInt5593 * i_0_ >> 15;
	}

	final void xa() {
		((Class_c_Sub2) this).anInt5591 = ((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) this).anInt5588 = ((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) this).anInt5592 = ((Class_c_Sub2) this).anInt5587 = ((Class_c_Sub2) this).anInt5589 = ((Class_c_Sub2) this).anInt5584 = ((Class_c_Sub2) this).anInt5593 = 0;
		((Class_c_Sub2) this).anInt5594 = ((Class_c_Sub2) this).anInt5586 = ((Class_c_Sub2) this).anInt5585 = 32768;
	}

	final void m(int[] is) {
		int i = is[0] - ((Class_c_Sub2) this).anInt5589;
		int i_6_ = is[1] - ((Class_c_Sub2) this).anInt5584;
		int i_7_ = is[2] - ((Class_c_Sub2) this).anInt5593;
		is[0] = (((Class_c_Sub2) this).anInt5594 * i + ((Class_c_Sub2) this).anInt5591 * i_6_ + ((Class_c_Sub2) this).anInt5583 * i_7_) >> 15;
		is[1] = (((Class_c_Sub2) this).anInt5588 * i + ((Class_c_Sub2) this).anInt5586 * i_6_ + ((Class_c_Sub2) this).anInt5590 * i_7_) >> 15;
		is[2] = (((Class_c_Sub2) this).anInt5592 * i + ((Class_c_Sub2) this).anInt5587 * i_6_ + ((Class_c_Sub2) this).anInt5585 * i_7_) >> 15;
	}

	final Class_c method582() {
		Class_c_Sub2 class_c_sub2_8_ = new Class_c_Sub2();
		((Class_c_Sub2) class_c_sub2_8_).anInt5594 = ((Class_c_Sub2) this).anInt5594;
		((Class_c_Sub2) class_c_sub2_8_).anInt5588 = ((Class_c_Sub2) this).anInt5588;
		((Class_c_Sub2) class_c_sub2_8_).anInt5592 = ((Class_c_Sub2) this).anInt5592;
		((Class_c_Sub2) class_c_sub2_8_).anInt5589 = ((Class_c_Sub2) this).anInt5589;
		((Class_c_Sub2) class_c_sub2_8_).anInt5591 = ((Class_c_Sub2) this).anInt5591;
		((Class_c_Sub2) class_c_sub2_8_).anInt5586 = ((Class_c_Sub2) this).anInt5586;
		((Class_c_Sub2) class_c_sub2_8_).anInt5587 = ((Class_c_Sub2) this).anInt5587;
		((Class_c_Sub2) class_c_sub2_8_).anInt5584 = ((Class_c_Sub2) this).anInt5584;
		((Class_c_Sub2) class_c_sub2_8_).anInt5583 = ((Class_c_Sub2) this).anInt5583;
		((Class_c_Sub2) class_c_sub2_8_).anInt5590 = ((Class_c_Sub2) this).anInt5590;
		((Class_c_Sub2) class_c_sub2_8_).anInt5585 = ((Class_c_Sub2) this).anInt5585;
		((Class_c_Sub2) class_c_sub2_8_).anInt5593 = ((Class_c_Sub2) this).anInt5593;
		return class_c_sub2_8_;
	}

	final void ja(int i) {
		int i_9_ = Class39_Sub1.anIntArray4672[i & 0x3fff];
		int i_10_ = Class39_Sub1.f_fb[i & 0x3fff];
		int i_11_ = ((Class_c_Sub2) this).anInt5594;
		int i_12_ = ((Class_c_Sub2) this).anInt5588;
		int i_13_ = ((Class_c_Sub2) this).anInt5592;
		int i_14_ = ((Class_c_Sub2) this).anInt5589;
		((Class_c_Sub2) this).anInt5594 = i_11_ * i_9_ + ((Class_c_Sub2) this).anInt5583 * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) this).anInt5583 * i_9_ - i_11_ * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5588 = i_12_ * i_9_ + ((Class_c_Sub2) this).anInt5590 * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) this).anInt5590 * i_9_ - i_12_ * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5592 = i_13_ * i_9_ + ((Class_c_Sub2) this).anInt5585 * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5585 = ((Class_c_Sub2) this).anInt5585 * i_9_ - i_13_ * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5589 = i_14_ * i_9_ + ((Class_c_Sub2) this).anInt5593 * i_10_ >> 15;
		((Class_c_Sub2) this).anInt5593 = ((Class_c_Sub2) this).anInt5593 * i_9_ - i_14_ * i_10_ >> 15;
	}

	final void p(int i, int i_15_, int i_16_, int[] is) {
		is[0] = (((Class_c_Sub2) this).anInt5594 * i + ((Class_c_Sub2) this).anInt5588 * i_15_ + ((Class_c_Sub2) this).anInt5592 * i_16_) >> 15;
		is[1] = (((Class_c_Sub2) this).anInt5591 * i + ((Class_c_Sub2) this).anInt5586 * i_15_ + ((Class_c_Sub2) this).anInt5587 * i_16_) >> 15;
		is[2] = (((Class_c_Sub2) this).anInt5583 * i + ((Class_c_Sub2) this).anInt5590 * i_15_ + ((Class_c_Sub2) this).anInt5585 * i_16_) >> 15;
	}

	final void o(int i, int i_17_, int i_18_) {
		((Class_c_Sub2) this).anInt5589 += i;
		((Class_c_Sub2) this).anInt5584 += i_17_;
		((Class_c_Sub2) this).anInt5593 += i_18_;
	}

	final void j(int i, int i_19_, int i_20_) {
		((Class_c_Sub2) this).anInt5591 = ((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) this).anInt5588 = ((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) this).anInt5592 = ((Class_c_Sub2) this).anInt5587 = 0;
		((Class_c_Sub2) this).anInt5594 = ((Class_c_Sub2) this).anInt5586 = ((Class_c_Sub2) this).anInt5585 = 32768;
		((Class_c_Sub2) this).anInt5589 = i;
		((Class_c_Sub2) this).anInt5584 = i_19_;
		((Class_c_Sub2) this).anInt5593 = i_20_;
	}

	final void ra(int i) {
		((Class_c_Sub2) this).anInt5586 = 32768;
		((Class_c_Sub2) this).anInt5594 = ((Class_c_Sub2) this).anInt5585 = Class39_Sub1.anIntArray4672[i & 0x3fff];
		((Class_c_Sub2) this).anInt5592 = Class39_Sub1.f_fb[i & 0x3fff];
		((Class_c_Sub2) this).anInt5583 = -((Class_c_Sub2) this).anInt5592;
		((Class_c_Sub2) this).anInt5588 = ((Class_c_Sub2) this).anInt5589 = ((Class_c_Sub2) this).anInt5591 = ((Class_c_Sub2) this).anInt5587 = ((Class_c_Sub2) this).anInt5584 = ((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) this).anInt5593 = 0;
	}

	final void s(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		int i_26_ = Class39_Sub1.anIntArray4672[i_23_ & 0x3fff];
		int i_27_ = Class39_Sub1.f_fb[i_23_ & 0x3fff];
		int i_28_ = Class39_Sub1.anIntArray4672[i_24_ & 0x3fff];
		int i_29_ = Class39_Sub1.f_fb[i_24_ & 0x3fff];
		int i_30_ = Class39_Sub1.anIntArray4672[i_25_ & 0x3fff];
		int i_31_ = Class39_Sub1.f_fb[i_25_ & 0x3fff];
		int i_32_ = i_27_ * i_30_ >> 15;
		int i_33_ = i_27_ * i_31_ >> 15;
		((Class_c_Sub2) this).anInt5594 = i_28_ * i_30_ + i_29_ * i_33_ >> 15;
		((Class_c_Sub2) this).anInt5591 = -i_28_ * i_31_ + i_29_ * i_32_ >> 15;
		((Class_c_Sub2) this).anInt5583 = i_29_ * i_26_ >> 15;
		((Class_c_Sub2) this).anInt5588 = i_26_ * i_31_ >> 15;
		((Class_c_Sub2) this).anInt5586 = i_26_ * i_30_ >> 15;
		((Class_c_Sub2) this).anInt5590 = -i_27_;
		((Class_c_Sub2) this).anInt5592 = -i_29_ * i_30_ + i_28_ * i_33_ >> 15;
		((Class_c_Sub2) this).anInt5587 = i_29_ * i_31_ + i_28_ * i_32_ >> 15;
		((Class_c_Sub2) this).anInt5585 = i_28_ * i_26_ >> 15;
		((Class_c_Sub2) this).anInt5589 = (-i * ((Class_c_Sub2) this).anInt5594 - i_21_ * ((Class_c_Sub2) this).anInt5588 - i_22_ * ((Class_c_Sub2) this).anInt5592) >> 15;
		((Class_c_Sub2) this).anInt5584 = (-i * ((Class_c_Sub2) this).anInt5591 - i_21_ * ((Class_c_Sub2) this).anInt5586 - i_22_ * ((Class_c_Sub2) this).anInt5587) >> 15;
		((Class_c_Sub2) this).anInt5593 = (-i * ((Class_c_Sub2) this).anInt5583 - i_21_ * ((Class_c_Sub2) this).anInt5590 - i_22_ * ((Class_c_Sub2) this).anInt5585) >> 15;
	}

	public Class_c_Sub2() {
		xa();
	}

	final void method585(int i, int i_34_, int i_35_, int[] is) {
		is[0] = (((Class_c_Sub2) this).anInt5589 + ((((Class_c_Sub2) this).anInt5594 * i + ((Class_c_Sub2) this).anInt5588 * i_34_ + ((Class_c_Sub2) this).anInt5592 * i_35_) >> 15));
		is[1] = (((Class_c_Sub2) this).anInt5584 + ((((Class_c_Sub2) this).anInt5591 * i + ((Class_c_Sub2) this).anInt5586 * i_34_ + ((Class_c_Sub2) this).anInt5587 * i_35_) >> 15));
		is[2] = (((Class_c_Sub2) this).anInt5593 + ((((Class_c_Sub2) this).anInt5583 * i + ((Class_c_Sub2) this).anInt5590 * i_34_ + ((Class_c_Sub2) this).anInt5585 * i_35_) >> 15));
	}

	final void za(Class_c class_c) {
		Class_c_Sub2 class_c_sub2_36_ = (Class_c_Sub2) class_c;
		((Class_c_Sub2) this).anInt5594 = ((Class_c_Sub2) class_c_sub2_36_).anInt5594;
		((Class_c_Sub2) this).anInt5588 = ((Class_c_Sub2) class_c_sub2_36_).anInt5588;
		((Class_c_Sub2) this).anInt5592 = ((Class_c_Sub2) class_c_sub2_36_).anInt5592;
		((Class_c_Sub2) this).anInt5589 = ((Class_c_Sub2) class_c_sub2_36_).anInt5589;
		((Class_c_Sub2) this).anInt5591 = ((Class_c_Sub2) class_c_sub2_36_).anInt5591;
		((Class_c_Sub2) this).anInt5586 = ((Class_c_Sub2) class_c_sub2_36_).anInt5586;
		((Class_c_Sub2) this).anInt5587 = ((Class_c_Sub2) class_c_sub2_36_).anInt5587;
		((Class_c_Sub2) this).anInt5584 = ((Class_c_Sub2) class_c_sub2_36_).anInt5584;
		((Class_c_Sub2) this).anInt5583 = ((Class_c_Sub2) class_c_sub2_36_).anInt5583;
		((Class_c_Sub2) this).anInt5590 = ((Class_c_Sub2) class_c_sub2_36_).anInt5590;
		((Class_c_Sub2) this).anInt5585 = ((Class_c_Sub2) class_c_sub2_36_).anInt5585;
		((Class_c_Sub2) this).anInt5593 = ((Class_c_Sub2) class_c_sub2_36_).anInt5593;
	}
}
