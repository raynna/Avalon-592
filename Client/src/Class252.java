
/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

final class Class252 {
	static int anInt3560;
	static int anInt3561;
	static int anInt3562;
	static int anInt3563;
	static int anInt3564;
	static int anInt3565;
	static int anInt3566;
	static int anInt3567 = 0;

	static final void method1616(Signlink class52, int i, Object object) {
		do {
			try {
				anInt3565++;
				if (i < 63)
					anInt3567 = -125;
				if (class52.anEventQueue728 != null) {
					for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > -51 && class52.anEventQueue728.peekEvent() != null); i_0_++)
						Class247.method1580(1L, -5184);
					if (object == null)
						break;
					class52.anEventQueue728.postEvent(new ActionEvent(object, 1001, "dummy"));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("wg.E(" + (class52 != null ? "{...}" : "null") + ',' + i + ',' + (object != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final int method1617(byte i, float f, float f_1_, float f_2_) {
		try {
			anInt3561++;
			float f_3_ = f < 0.0F ? -f : f;
			float f_4_ = !(f_2_ < 0.0F) ? f_2_ : -f_2_;
			if (i != -91)
				anInt3567 = 4;
			float f_5_ = !(f_1_ < 0.0F) ? f_1_ : -f_1_;
			if (f_3_ < f_4_ && f_5_ < f_4_) {
				if (f_2_ > 0.0F)
					return 0;
				return 1;
			}
			if (f_5_ > f_3_ && f_4_ < f_5_) {
				if (f_1_ > 0.0F)
					return 2;
				return 3;
			}
			if (f > 0.0F)
				return 4;
			return 5;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wg.A(" + i + ',' + f + ',' + f_1_ + ',' + f_2_ + ')'));
		}
	}

	static final void printConsoleMessage(int i, String string) {
		try {
			if (Class55.aStringArray786 == null)
				Class109_Sub2.method1790(-98);
			anInt3564++;
			String[] strings = Class60.method412((byte) 20, string, '\n');
			if (i >= 120) {
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_6_++) {
					for (int i_7_ = Class59_Sub2_Sub2.anInt6018; (i_7_ ^ 0xffffffff) < -1; i_7_--)
						Class55.aStringArray786[i_7_] = Class55.aStringArray786[i_7_ - 1];
					Class55.aStringArray786[0] = strings[i_6_];
					if (-1 + Class55.aStringArray786.length > Class59_Sub2_Sub2.anInt6018) {
						if ((Class91.anInt1188 ^ 0xffffffff) < -1)
							Class91.anInt1188++;
						Class59_Sub2_Sub2.anInt6018++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wg.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1619(int i, int i_8_) {
		try {
			anInt3566++;
			if (i == 49 || (i ^ 0xffffffff) == -52 || (i ^ 0xffffffff) == -17 || i == 4 || i == 2)
				return true;
			if (i_8_ != 0)
				anInt3567 = 73;
			if (i == 6 || i == 1009)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wg.F(" + i + ',' + i_8_ + ')');
		}
	}

	static final void method1620(int i, int i_9_, int i_10_, int i_11_, boolean bool) {
		try {
			anInt3560++;
			int i_12_ = 0;
			if (bool != true)
				anInt3567 = -103;
			int i_13_ = i_10_;
			int i_14_ = -i_10_;
			int i_15_ = -1;
			int i_16_ = Class180.method1176(Class110.anInt1573, -24309, i_10_ + i_11_, Class197.anInt2818);
			int i_17_ = Class180.method1176(Class110.anInt1573, -24309, -i_10_ + i_11_, Class197.anInt2818);
			Class135.method918(i_17_, -119, i_9_, i_16_, Class246_Sub28_Sub6.anIntArrayArray6042[i]);
			while ((i_12_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
				i_15_ += 2;
				i_14_ += i_15_;
				if ((i_14_ ^ 0xffffffff) < -1) {
					i_13_--;
					i_14_ -= i_13_ << 1;
					int i_18_ = -i_13_ + i;
					int i_19_ = i + i_13_;
					if ((i_19_ ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff) && Class109_Sub4.anInt4570 >= i_18_) {
						int i_20_ = Class180.method1176(Class110.anInt1573, -24309, i_12_ + i_11_, Class197.anInt2818);
						int i_21_ = Class180.method1176(Class110.anInt1573, -24309, -i_12_ + i_11_, Class197.anInt2818);
						if (i_19_ <= Class109_Sub4.anInt4570)
							Class135.method918(i_21_, 127, i_9_, i_20_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_19_]));
						if ((i_18_ ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff))
							Class135.method918(i_21_, -40, i_9_, i_20_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_18_]));
					}
				}
				i_12_++;
				int i_22_ = i + -i_12_;
				int i_23_ = i - -i_12_;
				if ((i_23_ ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff) && i_22_ <= Class109_Sub4.anInt4570) {
					int i_24_ = Class180.method1176(Class110.anInt1573, -24309, i_11_ + i_13_, Class197.anInt2818);
					int i_25_ = Class180.method1176(Class110.anInt1573, -24309, i_11_ + -i_13_, Class197.anInt2818);
					if (i_23_ <= Class109_Sub4.anInt4570)
						Class135.method918(i_25_, 126, i_9_, i_24_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_23_]));
					if (Class_t.anInt1442 <= i_22_)
						Class135.method918(i_25_, -119, i_9_, i_24_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_22_]));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wg.D(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + bool + ')'));
		}
	}

	static final void method1621(byte i) {
		try {
			anInt3563++;
			Class_q_Sub1.aClass54_6663.method369(false);
			Class_ls.aClass54_963.method369(false);
			Class216.aClass54_3007.method369(false);
			Class29.aClass54_387.method369(false);
			if (i < -60)
				Class84.aClass54_1097.method369(false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wg.C(" + i + ')');
		}
	}
}
