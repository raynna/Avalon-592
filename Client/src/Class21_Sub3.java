/* Class21_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21_Sub3 extends Class21 {
	static int anInt4724;
	private int anInt4725;
	static int anInt4726;
	static int anInt4727;
	static float aFloat4728;
	static int anInt4729;
	private int anInt4730;
	private int anInt4731;
	static int anInt4732;
	private int anInt4733;
	static int anInt4734;
	static int anInt4735;

	static final Class86[] method2076(Signlink class52, int i) {
		try {
			anInt4724++;
			if (!class52.method345((byte) -113))
				return new Class86[0];
			Class182 class182 = class52.method359((byte) -80);
			while ((class182.anInt2539 ^ 0xffffffff) == -1)
				Class247.method1580(10L, i + -1034652610);
			if (class182.anInt2539 == 2)
				return new Class86[0];
			int[] is = (int[]) class182.anObject2535;
			Class86[] class86s = new Class86[is.length >> 2];
			for (int i_0_ = 0; class86s.length > i_0_; i_0_++) {
				Class86 class86 = new Class86();
				class86s[i_0_] = class86;
				((Class86) class86).anInt1137 = is[i_0_ << 2];
				((Class86) class86).anInt1138 = is[(i_0_ << 2) + 1];
				((Class86) class86).anInt1141 = is[(i_0_ << 2) + 2];
				((Class86) class86).anInt1140 = is[(i_0_ << 2) + 3];
			}
			if (i != 1034647426)
				anInt4727 = 108;
			return class86s;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kg.F(" + (class52 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method195(int i, int i_1_, int i_2_) {
		try {
			anInt4734++;
			int i_3_ = anInt4731 * i_2_ >> 12;
			if (i != 24245)
				aFloat4728 = -0.5029784F;
			int i_4_ = anInt4725 * i_2_ >> 12;
			int i_5_ = i_1_ * anInt4733 >> 12;
			int i_6_ = anInt4730 * i_1_ >> 12;
			Class90.method571(i_4_, ((Class21) this).anInt317, ((Class21) this).anInt319, i_6_, (byte) -126, i_3_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kg.E(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final int method2077(boolean bool, boolean bool_7_, int i, int i_8_, byte i_9_) {
		try {
			anInt4729++;
			Class246_Sub18 class246_sub18 = Class95.method610(99, bool, i);
			if (class246_sub18 == null)
				return 0;
			int i_10_ = 0;
			if (i_9_ < 54)
				return 112;
			for (int i_11_ = 0; ((((Class246_Sub18) class246_sub18).anIntArray4682.length ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
				if ((((Class246_Sub18) class246_sub18).anIntArray4682[i_11_] >= 0) && (((((Class246_Sub18) class246_sub18).anIntArray4682[i_11_]) ^ 0xffffffff) > (((Class191) Class255.aClass191_3663).anInt2690 ^ 0xffffffff))) {
					Class197 class197 = Class255.aClass191_3663.method1251(22883, (((Class246_Sub18) class246_sub18).anIntArray4682[i_11_]));
					int i_12_ = (class197.method1289(i_8_, -114, (((Class118) Class246_Sub1_Sub10.f_eb.method1085((byte) 124, i_8_)).anInt1634)));
					if (!bool_7_)
						i_10_ += i_12_;
					else
						i_10_ += (((Class246_Sub18) class246_sub18).anIntArray4679[i_11_]) * i_12_;
				}
			}
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kg.H(" + bool + ',' + bool_7_ + ',' + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	final void method199(int i, int i_13_, int i_14_) {
		try {
			anInt4735++;
			int i_15_ = anInt4731 * i_14_ >> 12;
			int i_16_ = i_14_ * anInt4725 >> 12;
			if (i_13_ != 4)
				method2077(false, false, -86, -81, (byte) 85);
			int i_17_ = i * anInt4733 >> 12;
			int i_18_ = i * anInt4730 >> 12;
			Class191.method1257(i_18_, i_15_, ((Class21) this).anInt321, i_16_, i_17_, (byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kg.B(" + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	Class21_Sub3(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		super(i_22_, i_23_, i_24_);
		try {
			anInt4725 = i_20_;
			anInt4733 = i_19_;
			anInt4731 = i;
			anInt4730 = i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kg.<init>(" + i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}

	final void method196(int i, int i_25_, int i_26_) {
		do {
			try {
				anInt4726++;
				int i_27_ = i_26_ * anInt4731 >> 12;
				int i_28_ = i_26_ * anInt4725 >> 12;
				int i_29_ = anInt4733 * i_25_ >> 12;
				int i_30_ = i_25_ * anInt4730 >> 12;
				Class246_Sub26.method2117(i_29_, ((Class21) this).anInt317, i_28_, -32, i_27_, ((Class21) this).anInt319, i_30_, ((Class21) this).anInt321);
				if (i <= -78)
					break;
				anInt4731 = -11;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("kg.D(" + i + ',' + i_25_ + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class211 method2078(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		try {
			anInt4732++;
			if (i_36_ != -1101853054)
				return null;
			long l = ((long) i_32_ * 76724863L ^ ((long) i * 32147369L ^ ((long) i_34_ * 986053L ^ (67481L * (long) i_33_ ^ (long) i_35_ * 97549L ^ 475427L * (long) i_31_))));
			Class211 class211 = ((Class211) Class246_Sub38.aClass54_5448.method379(l, (byte) 58));
			if (class211 != null)
				return class211;
			class211 = Class33.aClass260_444.method1709(i_33_, i_35_, i_31_, i_34_, i, i_32_);
			Class246_Sub38.aClass54_5448.method371(1, l, class211);
			return class211;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kg.G(" + i + ',' + i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ')'));
		}
	}
}
