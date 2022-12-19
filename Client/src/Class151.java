/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class151 {
	private static long aLong2199;
	private static long aLong2200;

	public static final synchronized long time(int i) {
		long l;
		try {
			long l_0_ = System.currentTimeMillis();
			if ((l_0_ ^ 0xffffffffffffffffL) > (aLong2199 ^ 0xffffffffffffffffL))
				aLong2200 += aLong2199 - l_0_;
			if (i > -47)
				time(87);
			aLong2199 = l_0_;
			l = aLong2200 + l_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	private Class151() {
		/* empty */
	}
}
