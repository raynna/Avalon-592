/* Class_q - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class_q extends Class38 {
	static int anInt4684;
	static int anInt4685;
	static Class67 aClass67_4686 = new Class67("yellow:", "gelb:", "jaune:", "amarelo:");
	private int anInt4687;
	private int anInt4688;
	private int anInt4689;
	static int anInt4690;
	private int anInt4691;
	private int anInt4692;
	static int anInt4693;
	private int anInt4694;
	private int anInt4695;
	static int anInt4696;
	static int anInt4697;
	private byte[] aByteArray4698;
	private int anInt4699;

	final void method268(int i, int i_0_, boolean bool) {
		try {
			if (bool != true)
				anInt4699 = -22;
			if (i != 0) {
				anInt4691 = anInt4699 * anInt4687 >> 12;
				anInt4699 = anInt4688 + -(i_0_ < 0 ? -i_0_ : i_0_);
				if (anInt4691 < 0)
					anInt4691 = 0;
				else if (anInt4691 > 4096)
					anInt4691 = 4096;
				anInt4699 = anInt4699 * anInt4699 >> 12;
				anInt4699 = anInt4691 * anInt4699 >> 12;
				anInt4689 += anInt4699 * anInt4694 >> 12;
				anInt4694 = anInt4694 * anInt4692 >> 12;
			} else {
				anInt4699 = anInt4688 - (i_0_ >= 0 ? i_0_ : -i_0_);
				anInt4691 = 4096;
				anInt4699 = anInt4699 * anInt4699 >> 12;
				anInt4689 = anInt4699;
			}
			anInt4690++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("q.L(" + i + ',' + i_0_ + ',' + bool + ')'));
		}
	}

	static final float method2059(float f, int i, float f_1_, float f_2_) {
		try {
			anInt4696++;
			if (i != 4449)
				return -0.6757636F;
			return (-f_1_ + f_2_) * f + f_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("q.H(" + f + ',' + i + ',' + f_1_ + ',' + f_2_ + ')'));
		}
	}

	Class_q(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f, float f_7_, float f_8_) {
		super(i, i_3_, i_4_, i_5_, i_6_);
		try {
			anInt4688 = (int) (4096.0F * f_7_);
			anInt4687 = (int) (4096.0F * f_8_);
			anInt4694 = anInt4692 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("q.<init>(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f + ',' + f_7_ + ',' + f_8_ + ')'));
		}
	}

	void method2060(byte i, int i_9_, int i_10_) {
		try {
			anInt4693++;
			aByteArray4698[i_9_] = i;
			int i_11_ = 117 % ((-21 - i_10_) / 51);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("q.E(" + i + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method270(int i) {
		try {
			if (i >= -54)
				aByteArray4698 = null;
			anInt4689 = 0;
			anInt4685++;
			anInt4695 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "q.K(" + i + ')');
		}
	}

	static final char method2061(int i, char c, int i_12_) {
		try {
			anInt4684++;
			if (i >= -68)
				return '\uffbd';
			if (c >= 192 && c <= 255) {
				if (c >= 192 && (c ^ 0xffffffff) >= -199)
					return 'A';
				if ((c ^ 0xffffffff) == -200)
					return 'C';
				if ((c ^ 0xffffffff) <= -201 && c <= 203)
					return 'E';
				if ((c ^ 0xffffffff) <= -205 && c <= 207)
					return 'I';
				if ((c ^ 0xffffffff) == -210 && i_12_ != 0)
					return 'N';
				if ((c ^ 0xffffffff) <= -211 && (c ^ 0xffffffff) >= -215)
					return 'O';
				if ((c ^ 0xffffffff) <= -218 && c <= 220)
					return 'U';
				if ((c ^ 0xffffffff) == -222)
					return 'Y';
				if ((c ^ 0xffffffff) == -224)
					return 's';
				if ((c ^ 0xffffffff) <= -225 && (c ^ 0xffffffff) >= -231)
					return 'a';
				if ((c ^ 0xffffffff) == -232)
					return 'c';
				if ((c ^ 0xffffffff) <= -233 && (c ^ 0xffffffff) >= -236)
					return 'e';
				if ((c ^ 0xffffffff) <= -237 && (c ^ 0xffffffff) >= -240)
					return 'i';
				if (c == 241 && i_12_ != 0)
					return 'n';
				if (c >= 242 && (c ^ 0xffffffff) >= -247)
					return 'o';
				if (c >= 249 && (c ^ 0xffffffff) >= -253)
					return 'u';
				if (c == 253 || (c ^ 0xffffffff) == -256)
					return 'y';
			}
			if (c == 338)
				return 'O';
			if (c == 339)
				return 'o';
			if (c == 376)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("q.I(" + i + ',' + c + ',' + i_12_ + ')'));
		}
	}

	final void method265(byte i) {
		try {
			anInt4689 >>= 4;
			anInt4694 = anInt4692;
			anInt4697++;
			do {
				if (anInt4689 >= 0) {
					if ((anInt4689 ^ 0xffffffff) >= -256)
						break;
					anInt4689 = 255;
					if (!client.f_ob)
						break;
				}
				anInt4689 = 0;
			} while (false);
			method2060((byte) anInt4689, anInt4695++, 52);
			if (i <= -55)
				anInt4689 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "q.J(" + i + ')');
		}
	}

	public static void method2062(byte i) {
		try {
			if (i == -23)
				aClass67_4686 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "q.G(" + i + ')');
		}
	}
}
