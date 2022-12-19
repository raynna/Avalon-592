/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	static int[] anIntArray103 = new int[8];
	static int anInt104;
	String aString105;
	static char[] aCharArray106;
	static int[] anIntArray107 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	String aString108;
	String aString109;
	String aString110;
	byte aByte111;
	static int anInt112;
	int anInt113;
	/* synthetic */ static Class aClass114;

	static final void method81(int i, byte i_0_, int i_1_) {
		do {
			try {
				Class40.anInt617 = i - Class79.anInt1041;
				anInt112++;
				OutputStream_Sub1.anInt4489 = -Class79.anInt1057 + i_1_;
				if (i_0_ > 82)
					break;
				aCharArray106 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("at.C(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method82(int i, Class246_Sub6 class246_sub6) {
		try {
			anInt104++;
			if (Class106.aClass147ArrayArrayArray1494 != null) {
				Class_f class_f = null;
				if (((Class246_Sub6) class246_sub6).anInt3927 == 0)
					class_f = ((Class_f) (Class246_Sub22.method2082(((Class246_Sub6) class246_sub6).anInt3936, ((Class246_Sub6) class246_sub6).anInt3928, ((Class246_Sub6) class246_sub6).anInt3925)));
				if (((Class246_Sub6) class246_sub6).anInt3927 == 1)
					class_f = ((Class_f) Class31.method236((((Class246_Sub6) class246_sub6).anInt3936), (((Class246_Sub6) class246_sub6).anInt3928), (((Class246_Sub6) class246_sub6).anInt3925)));
				if ((((Class246_Sub6) class246_sub6).anInt3927 ^ 0xffffffff) == -3)
					class_f = ((Class_f) (Class17.method168(((Class246_Sub6) class246_sub6).anInt3936, ((Class246_Sub6) class246_sub6).anInt3928, ((Class246_Sub6) class246_sub6).anInt3925, (aClass114 != null ? aClass114 : (aClass114 = getClassByName("Class_f"))))));
				if (i >= 13) {
					if (((Class246_Sub6) class246_sub6).anInt3927 == 3)
						class_f = ((Class_f) (Class246_Sub14.method1997(((Class246_Sub6) class246_sub6).anInt3936, ((Class246_Sub6) class246_sub6).anInt3928, ((Class246_Sub6) class246_sub6).anInt3925)));
					if (class_f == null) {
						((Class246_Sub6) class246_sub6).anInt3932 = -1;
						((Class246_Sub6) class246_sub6).anInt3938 = 0;
						((Class246_Sub6) class246_sub6).anInt3939 = 0;
					} else {
						((Class246_Sub6) class246_sub6).anInt3932 = class_f.method21(true);
						((Class246_Sub6) class246_sub6).anInt3938 = class_f.method24(-34);
						((Class246_Sub6) class246_sub6).anInt3939 = class_f.method18((byte) -70);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("at.B(" + i + ',' + (class246_sub6 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method83(int i) {
		do {
			try {
				anIntArray107 = null;
				aCharArray106 = null;
				anIntArray103 = null;
				if (i == 3)
					break;
				anIntArray103 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "at.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class9() {
		/* empty */
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		aCharArray106 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	}
}
