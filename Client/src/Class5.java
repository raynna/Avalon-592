/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5 {
	static int anInt53;
	String aString54;
	static int anInt55 = 0;
	static byte[][][] aByteArrayArrayArray56;
	static int anInt57;
	static int anInt58;
	static int anInt59;
	static boolean aBool60 = false;
	static int anInt61;
	static IncomingPacket SEND_VAR_BIT_BYTE = new IncomingPacket(14, 3);
	static int anInt63;
	int anInt64;

	static final void method58(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_) {
		try {
			anInt58++;
			int i_5_ = 0;
			int i_6_ = i;
			int i_7_ = i_2_ * i_2_;
			int i_8_ = i * i;
			int i_9_ = i_8_ << 1;
			if (i_4_ <= -96) {
				int i_10_ = i_7_ << 1;
				int i_11_ = i << 1;
				int i_12_ = i_9_ + i_7_ * (1 - i_11_);
				int i_13_ = i_8_ - (-1 + i_11_) * i_10_;
				int i_14_ = i_7_ << 2;
				int i_15_ = i_8_ << 2;
				int i_16_ = ((i_5_ << 1) + 3) * i_9_;
				int i_17_ = i_10_ * (-3 + (i_6_ << 1));
				int i_18_ = (i_5_ + 1) * i_15_;
				int i_19_ = i_14_ * (-1 + i_6_);
				if ((Class_t.anInt1442 ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) && i_3_ <= Class109_Sub4.anInt4570) {
					int i_20_ = Class180.method1176(Class110.anInt1573, -24309, i_2_ + i_0_, Class197.anInt2818);
					int i_21_ = Class180.method1176(Class110.anInt1573, -24309, i_0_ - i_2_, Class197.anInt2818);
					Class135.method918(i_21_, -110, i_1_, i_20_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_3_]));
				}
				while ((i_6_ ^ 0xffffffff) < -1) {
					if ((i_12_ ^ 0xffffffff) > -1) {
						while (i_12_ < 0) {
							i_12_ += i_16_;
							i_13_ += i_18_;
							i_18_ += i_15_;
							i_16_ += i_15_;
							i_5_++;
						}
					}
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_12_ += i_16_;
						i_13_ += i_18_;
						i_18_ += i_15_;
						i_16_ += i_15_;
						i_5_++;
					}
					i_13_ += -i_17_;
					i_12_ += -i_19_;
					i_6_--;
					i_19_ -= i_14_;
					i_17_ -= i_14_;
					int i_22_ = -i_6_ + i_3_;
					int i_23_ = i_6_ + i_3_;
					if ((Class_t.anInt1442 ^ 0xffffffff) >= (i_23_ ^ 0xffffffff) && ((Class109_Sub4.anInt4570 ^ 0xffffffff) <= (i_22_ ^ 0xffffffff))) {
						int i_24_ = Class180.method1176(Class110.anInt1573, -24309, i_0_ + i_5_, Class197.anInt2818);
						int i_25_ = Class180.method1176(Class110.anInt1573, -24309, -i_5_ + i_0_, Class197.anInt2818);
						if (Class_t.anInt1442 <= i_22_)
							Class135.method918(i_25_, -91, i_1_, i_24_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_22_]));
						if ((i_23_ ^ 0xffffffff) >= (Class109_Sub4.anInt4570 ^ 0xffffffff))
							Class135.method918(i_25_, -115, i_1_, i_24_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_23_]));
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ak.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final Class235 method59(Class235 class235, byte i) {
		try {
			anInt53++;
			if ((((Class235) class235).anInt3293 ^ 0xffffffff) != 0)
				return Class220.method1423(0, ((Class235) class235).anInt3293);
			int i_26_ = ((Class235) class235).anInt3248 >>> 16;
			Class16 class16 = new Class16(Class246_Sub34.aClass85_5143);
			for (Class246_Sub40 class246_sub40 = (Class246_Sub40) class16.method161(4); class246_sub40 != null; class246_sub40 = (Class246_Sub40) class16.method160(true)) {
				if (((Class246_Sub40) class246_sub40).anInt5517 == i_26_)
					return Class220.method1423(0, (int) (((Node) class246_sub40).hash));
			}
			if (i < 55)
				method62(126, 51);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ak.B(" + (class235 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final Class235 method60(int i, Class235 class235) {
		try {
			anInt57++;
			Class235 class235_27_ = client.method2977(class235);
			if (class235_27_ == null)
				class235_27_ = ((Class235) class235).aClass235_3257;
			if (i != 3547)
				aByteArrayArrayArray56 = null;
			return class235_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ak.F(" + i + ',' + (class235 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method61(byte i) {
		try {
			Class33.aClass260_444.B((0.7F + (float) (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt583) * 0.1F) * Class193.aFloat2718);
			if (i != 84)
				SEND_VAR_BIT_BYTE = null;
			anInt63++;
			Class33.aClass260_444.T(Class222.anInt3069, Class246_Sub28_Sub19.aFloat6549, Node.aFloat3470, (float) (Class246_Sub7_Sub1.anInt6101 << 0), (float) (Class178.anInt2500 << 0), (float) (HashMap.anInt771 << 0));
			Class33.aClass260_444.method1729(Class_u.aClass211_4701);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ak.E(" + i + ')');
		}
	}

	static final Class81 method62(int i, int i_28_) {
		try {
			anInt61++;
			Class81[] class81s = Class36.method252(-120);
			for (int i_29_ = i_28_; class81s.length > i_29_; i_29_++) {
				if ((((Class81) class81s[i_29_]).anInt1065 ^ 0xffffffff) == (i ^ 0xffffffff))
					return class81s[i_29_];
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ak.A(" + i + ',' + i_28_ + ')');
		}
	}

	public static void method63(boolean bool) {
		do {
			try {
				SEND_VAR_BIT_BYTE = null;
				aByteArrayArrayArray56 = null;
				if (bool == false)
					break;
				aByteArrayArrayArray56 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ak.C(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method64(int i, int i_30_, int i_31_, int i_32_, int i_33_, boolean bool, int i_34_, int i_35_) {
		try {
			anInt59++;
			int i_36_ = -i_35_ + i_34_;
			if (bool != false)
				aByteArrayArrayArray56 = null;
			int i_37_ = i + i_35_;
			for (int i_38_ = i; (i_38_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff); i_38_++)
				Class135.method918(i_32_, 126, i_33_, i_30_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_38_]));
			int i_39_ = i_30_ + -i_35_;
			for (int i_40_ = i_34_; i_36_ < i_40_; i_40_--)
				Class135.method918(i_32_, -37, i_33_, i_30_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_40_]));
			int i_41_ = i_32_ + i_35_;
			for (int i_42_ = i_37_; i_42_ <= i_36_; i_42_++) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_42_];
				Class135.method918(i_32_, 118, i_33_, i_41_, is);
				Class135.method918(i_41_, 119, i_31_, i_39_, is);
				Class135.method918(i_39_, 125, i_33_, i_30_, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ak.D(" + i + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + bool + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}
}
