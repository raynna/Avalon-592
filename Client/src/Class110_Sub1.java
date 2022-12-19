/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110_Sub1 extends Class110 {
	private long aLong3971 = 0L;
	private long aLong3972 = 0L;
	private int anInt3973 = 1;
	private long[] aLongArray3974 = new long[10];
	private int anInt3975 = 0;
	private long aLong3976 = 0L;

	private final long method1841(int i) {
		long l;
		try {
			long l_0_ = System.nanoTime();
			long l_1_ = -aLong3976 + l_0_;
			aLong3976 = l_0_;
			if (4999999999L > (l_1_ ^ 0xffffffffffffffffL) && (l_1_ ^ 0xffffffffffffffffL) > -5000000001L) {
				aLongArray3974[anInt3975] = l_1_;
				anInt3975 = (1 + anInt3975) % 10;
				if ((anInt3973 ^ 0xffffffff) > -2)
					anInt3973++;
			}
			long l_2_ = (long) i;
			for (int i_3_ = 1; (anInt3973 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff); i_3_++)
				l_2_ += aLongArray3974[(-i_3_ + (anInt3975 + 10)) % 10];
			l = l_2_ / (long) anInt3973;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final long method766(byte i) {
		long l;
		try {
			if (i != -53)
				return -102L;
			l = aLong3971;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final int method767(boolean bool, int i) {
		int i_4_;
		try {
			if (bool != true)
				return 114;
			long l = (long) i * 1000000L;
			aLong3971 += method1841(0);
			if (aLong3972 <= aLong3971) {
				int i_5_ = 0;
				do {
					i_5_++;
					aLong3972 += l;
				} while (10 > i_5_ && ((aLong3971 ^ 0xffffffffffffffffL) < (aLong3972 ^ 0xffffffffffffffffL)));
				if (aLong3972 < aLong3971)
					aLong3972 = aLong3971;
				return i_5_;
			}
			Class247.method1580((-aLong3971 + aLong3972) / 1000000L, -5184);
			aLong3976 += aLong3972 + -aLong3971;
			aLong3971 += aLong3972 + -aLong3971;
			aLong3972 += l;
			i_4_ = 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_4_;
	}

	final void method762(byte i) {
		try {
			aLong3976 = 0L;
			if (i > 25) {
				if ((aLong3971 ^ 0xffffffffffffffffL) > (aLong3972 ^ 0xffffffffffffffffL))
					aLong3971 += aLong3972 + -aLong3971;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class110_Sub1() {
		try {
			aLong3971 = System.nanoTime();
			aLong3972 = System.nanoTime();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
