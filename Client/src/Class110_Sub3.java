
/* Class110_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class110_Sub3 extends Class110 {
	private long aLong4482 = 0L;
	private long aLong4483 = 0L;
	private long[] aLongArray4484;
	private int anInt4485 = 0;
	private int anInt4486 = 1;
	private long aLong4487;

	final long method766(byte i) {
		try {
			if (i != -53)
				aLong4483 = -12L;
			return aLong4482;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method2010(int i) {
		try {
			long l = jagmisc.nanoTime();
			long l_0_ = -aLong4487 + l;
			aLong4487 = l;
			if ((l_0_ ^ 0xffffffffffffffffL) < 4999999999L && l_0_ < 5000000000L) {
				aLongArray4484[anInt4485] = l_0_;
				anInt4485 = (anInt4485 + 1) % 10;
				if ((anInt4486 ^ 0xffffffff) > -2)
					anInt4486++;
			}
			long l_1_ = 0L;
			if (i >= -7)
				return -77L;
			for (int i_2_ = 1; anInt4486 >= i_2_; i_2_++)
				l_1_ += aLongArray4484[(-i_2_ + anInt4485 + 10) % 10];
			return l_1_ / (long) anInt4486;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method767(boolean bool, int i) {
		try {
			if (bool != true)
				return 103;
			long l = (long) i * 1000000L;
			aLong4482 += method2010(-25);
			if ((aLong4483 ^ 0xffffffffffffffffL) >= (aLong4482 ^ 0xffffffffffffffffL)) {
				int i_3_ = 0;
				do {
					i_3_++;
					aLong4483 += l;
				} while ((i_3_ ^ 0xffffffff) > -11 && ((aLong4482 ^ 0xffffffffffffffffL) < (aLong4483 ^ 0xffffffffffffffffL)));
				if ((aLong4482 ^ 0xffffffffffffffffL) < (aLong4483 ^ 0xffffffffffffffffL))
					aLong4483 = aLong4482;
				return i_3_;
			}
			Class247.method1580((-aLong4482 + aLong4483) / 1000000L, -5184);
			aLong4487 += -aLong4482 + aLong4483;
			aLong4482 += -aLong4482 + aLong4483;
			aLong4483 += l;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method762(byte i) {
		do {
			try {
				aLong4487 = 0L;
				if (aLong4482 < aLong4483)
					aLong4482 += -aLong4482 + aLong4483;
				if (i > 25)
					break;
				aLongArray4484 = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class110_Sub3() {
		aLongArray4484 = new long[10];
		aLong4487 = 0L;
		try {
			aLong4483 = aLong4482 = jagmisc.nanoTime();
			if (aLong4482 == 0L)
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
