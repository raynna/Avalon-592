
/* Class246_Sub1_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class246_Sub1_Sub8_Sub2 extends Class246_Sub1_Sub8 {
	private SoftReference aSoftReference7165;

	final boolean method2566(byte i) {
		boolean bool;
		try {
			if (i <= 57)
				return false;
			bool = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class246_Sub1_Sub8_Sub2(Object object, int i) {
		super(i);
		try {
			aSoftReference7165 = new SoftReference(object);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Object method2568(int i) {
		Object object;
		try {
			if (i != 250)
				return null;
			object = aSoftReference7165.get();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}
}
