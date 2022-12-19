/* Class110_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110_Sub2 extends Class110 {
	private long aLong4109 = 0L;
	private int anInt4110;
	private long aLong4111 = 0L;
	private int anInt4112;
	private long[] aLongArray4113;
	private long aLong4114;

	final long method766(byte i) {
		try {
			if (i != -53)
				aLongArray4113 = null;
			return aLong4109;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method1876(byte i) {
		try {
			long l = Class151.time(-89) * 1000000L;
			long l_0_ = l + -aLong4111;
			aLong4111 = l;
			if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
				aLongArray4113[anInt4112] = l_0_;
				anInt4112 = (anInt4112 + 1) % 10;
				if (anInt4110 < 10)
					anInt4110++;
			}
			long l_1_ = 0L;
			int i_2_ = -42 / ((i - 17) / 38);
			for (int i_3_ = 1; (i_3_ ^ 0xffffffff) >= (anInt4110 ^ 0xffffffff); i_3_++)
				l_1_ += aLongArray4113[(anInt4112 + -i_3_ + 10) % 10];
			return l_1_ / (long) anInt4110;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method767(boolean bool, int i) {
		try {
			long l = (long) i * 1000000L;
			if (bool != true)
				aLong4114 = 78L;
			aLong4109 += method1876((byte) 90);
			if (aLong4109 < aLong4114) {
				Class247.method1580((-aLong4109 + aLong4114) / 1000000L, -5184);
				aLong4111 += -aLong4109 + aLong4114;
				aLong4109 += aLong4114 - aLong4109;
				aLong4114 += l;
				return 1;
			}
			int i_4_ = 0;
			do
				aLong4114 += l;
			while ((++i_4_ ^ 0xffffffff) > -11 && aLong4114 < aLong4109);
			if ((aLong4114 ^ 0xffffffffffffffffL) > (aLong4109 ^ 0xffffffffffffffffL))
				aLong4114 = aLong4109;
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method762(byte i) {
		do {
			try {
				if (aLong4114 > aLong4109)
					aLong4109 += -aLong4109 + aLong4114;
				aLong4111 = 0L;
				if (i > 25)
					break;
				aLong4114 = -3L;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class110_Sub2() {
		anInt4110 = 1;
		anInt4112 = 0;
		aLongArray4113 = new long[10];
		aLong4114 = 0L;
	}
}
