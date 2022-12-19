/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class56 {
	static int anInt788;
	static int anInt789;
	static float aFloat790;
	static boolean aBool791 = false;
	static int anInt792;
	static HashMap aClass54_793;
	static int anInt794;
	static int[] anIntArray795 = new int[5];
	static int anInt796;
	static IncomingPacket PROCESS_NPC_UPDATING_IN;
	static int anInt798;

	public static void method387(boolean bool) {
		do {
			try {
				anIntArray795 = null;
				aClass54_793 = null;
				PROCESS_NPC_UPDATING_IN = null;
				if (bool == true)
					break;
				method388((byte) 108, -7, -16, -24, 108, 77, -79);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fe.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method388(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class195.method1276(false, i_2_);
			anInt792++;
			int i_6_ = 0;
			int i_7_ = -i_0_ + i_2_;
			if (i_7_ < 0)
				i_7_ = 0;
			if (i <= 126)
				aFloat790 = 0.8350775F;
			int i_8_ = i_2_;
			int i_9_ = -i_2_;
			int i_10_ = i_7_;
			int i_11_ = -i_7_;
			int i_12_ = -1;
			int i_13_ = -1;
			if ((i_5_ ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff) && (Class109_Sub4.anInt4570 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_5_];
				int i_14_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ - i_2_, Class197.anInt2818);
				int i_15_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + i_2_, Class197.anInt2818);
				int i_16_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + -i_7_, Class197.anInt2818);
				int i_17_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + i_7_, Class197.anInt2818);
				Class135.method918(i_14_, 122, i_3_, i_16_, is);
				Class135.method918(i_16_, -80, i_1_, i_17_, is);
				Class135.method918(i_17_, 122, i_3_, i_15_, is);
			}
			while ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
				i_13_ += 2;
				i_12_ += 2;
				i_9_ += i_12_;
				i_11_ += i_13_;
				if (i_11_ >= 0 && i_10_ >= 1) {
					i_10_--;
					i_11_ -= i_10_ << 1;
					Class120.anIntArray1649[i_10_] = i_6_;
				}
				i_6_++;
				if (i_9_ >= 0) {
					i_8_--;
					i_9_ -= i_8_ << 1;
					int i_18_ = i_5_ + -i_8_;
					int i_19_ = i_8_ + i_5_;
					if (Class_t.anInt1442 <= i_19_ && i_18_ <= Class109_Sub4.anInt4570) {
						if (i_7_ <= i_8_) {
							int i_20_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + i_6_, Class197.anInt2818);
							int i_21_ = Class180.method1176(Class110.anInt1573, -24309, -i_6_ + i_4_, Class197.anInt2818);
							if (i_19_ <= Class109_Sub4.anInt4570)
								Class135.method918(i_21_, 125, i_3_, i_20_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_19_]));
							if ((i_18_ ^ 0xffffffff) <= (Class_t.anInt1442 ^ 0xffffffff))
								Class135.method918(i_21_, 119, i_3_, i_20_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_18_]));
						} else {
							int i_22_ = Class120.anIntArray1649[i_8_];
							int i_23_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ - -i_6_, Class197.anInt2818);
							int i_24_ = Class180.method1176(Class110.anInt1573, -24309, -i_6_ + i_4_, Class197.anInt2818);
							int i_25_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + i_22_, Class197.anInt2818);
							int i_26_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ - i_22_, Class197.anInt2818);
							if ((i_19_ ^ 0xffffffff) >= (Class109_Sub4.anInt4570 ^ 0xffffffff)) {
								int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_19_]);
								Class135.method918(i_24_, 118, i_3_, i_26_, is);
								Class135.method918(i_26_, -103, i_1_, i_25_, is);
								Class135.method918(i_25_, -90, i_3_, i_23_, is);
							}
							if (i_18_ >= Class_t.anInt1442) {
								int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_18_]);
								Class135.method918(i_24_, 122, i_3_, i_26_, is);
								Class135.method918(i_26_, -106, i_1_, i_25_, is);
								Class135.method918(i_25_, -108, i_3_, i_23_, is);
							}
						}
					}
				}
				int i_27_ = i_5_ + -i_6_;
				int i_28_ = i_6_ + i_5_;
				if (Class_t.anInt1442 <= i_28_ && i_27_ <= Class109_Sub4.anInt4570) {
					int i_29_ = i_4_ - -i_8_;
					int i_30_ = -i_8_ + i_4_;
					if ((Class197.anInt2818 ^ 0xffffffff) >= (i_29_ ^ 0xffffffff) && (i_30_ ^ 0xffffffff) >= (Class110.anInt1573 ^ 0xffffffff)) {
						i_29_ = Class180.method1176(Class110.anInt1573, -24309, i_29_, Class197.anInt2818);
						i_30_ = Class180.method1176(Class110.anInt1573, -24309, i_30_, Class197.anInt2818);
						if (i_6_ < i_7_) {
							int i_31_ = ((i_6_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff) ? i_10_ : Class120.anIntArray1649[i_6_]);
							int i_32_ = Class180.method1176(Class110.anInt1573, -24309, i_4_ + i_31_, Class197.anInt2818);
							int i_33_ = Class180.method1176(Class110.anInt1573, -24309, -i_31_ + i_4_, Class197.anInt2818);
							if ((i_28_ ^ 0xffffffff) >= (Class109_Sub4.anInt4570 ^ 0xffffffff)) {
								int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_28_]);
								Class135.method918(i_30_, -75, i_3_, i_33_, is);
								Class135.method918(i_33_, 124, i_1_, i_32_, is);
								Class135.method918(i_32_, 125, i_3_, i_29_, is);
							}
							if ((Class_t.anInt1442 ^ 0xffffffff) >= (i_27_ ^ 0xffffffff)) {
								int[] is = (Class246_Sub28_Sub6.anIntArrayArray6042[i_27_]);
								Class135.method918(i_30_, 120, i_3_, i_33_, is);
								Class135.method918(i_33_, 126, i_1_, i_32_, is);
								Class135.method918(i_32_, 119, i_3_, i_29_, is);
							}
						} else {
							if (i_28_ <= Class109_Sub4.anInt4570)
								Class135.method918(i_30_, 127, i_3_, i_29_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_28_]));
							if (Class_t.anInt1442 <= i_27_)
								Class135.method918(i_30_, -79, i_3_, i_29_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_27_]));
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fe.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final boolean method389(byte i, int i_34_) {
		try {
			anInt789++;
			if (i != 126)
				return true;
			if ((i_34_ ^ 0xffffffff) != -1 && i_34_ != 1 && i_34_ != 2)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fe.A(" + i + ',' + i_34_ + ')');
		}
	}

	static {
		aClass54_793 = new HashMap(8);
		PROCESS_NPC_UPDATING_IN = new IncomingPacket(95, -2);
		anInt798 = 2;
	}
}
