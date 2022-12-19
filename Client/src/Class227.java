/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class227 {
	private static Class166 aClass166_3120 = new Class166();

	static final void method1452(boolean bool) {
		try {
			if (bool == true) {
				for (;;) {
					Class246_Sub20 class246_sub20 = (Class246_Sub20) aClass166_3120.method1100(4095);
					if (class246_sub20 == null)
						break;
					((Class246_Sub20) class246_sub20).aClass_d4736.EA();
					class246_sub20.unlink((byte) 77);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method1453(byte i, Class_d class_d) {
		try {
			Class246_Sub20 class246_sub20 = new Class246_Sub20();
			if (i == 50) {
				((Class246_Sub20) class246_sub20).aClass_d4736 = class_d;
				aClass166_3120.method1101(false, class246_sub20);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
