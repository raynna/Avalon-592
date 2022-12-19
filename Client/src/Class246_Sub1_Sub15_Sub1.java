
/* Class246_Sub1_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class246_Sub1_Sub15_Sub1 extends Class246_Sub1_Sub15 {
	private SoftReference aSoftReference7065;

	final Object method2718(byte i) {
		Object object;
		try {
			if (i < 22)
				method2718((byte) 93);
			object = aSoftReference7065.get();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	final boolean method2714(byte i) {
		boolean bool;
		try {
			if (i < 81)
				return false;
			bool = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class246_Sub1_Sub15_Sub1(Interface2 interface2, Object object, int i) {
		super(interface2, i);
		try {
			aSoftReference7065 = new SoftReference(object);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
