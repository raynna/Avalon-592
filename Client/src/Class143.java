/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143 {
	static int[] anIntArray2065 = new int[1];
	static int anInt2066;
	static Class251 aClass251_2067;
	static int anInt2068;
	static Player[] aClass_r_Sub1Array2069 = new Player[2048];

	public static void method963(boolean bool) {
		try {
			if (bool == false) {
				anIntArray2065 = null;
				aClass_r_Sub1Array2069 = null;
				aClass251_2067 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nl.A(" + bool + ')');
		}
	}

	static final void method964(byte i, Class260_Sub2 class260_sub2) {
		do {
			try {
				if (Class59.anObject821 == null) {
					Class_q_Sub1 class_q_sub1 = new Class_q_Sub1();
					byte[] is = class_q_sub1.method2735(16, -201, 128, 128);
					Class59.anObject821 = Class177.method1159((byte) 109, false, is);
				}
				if (i != -16)
					aClass_r_Sub1Array2069 = null;
				anInt2068++;
				if (Class60.anObject833 == null) {
					Class38_Sub1_Sub1 class38_sub1_sub1 = new Class38_Sub1_Sub1();
					byte[] is = class38_sub1_sub1.method2768((byte) -49, 128, 128, 16);
					Class60.anObject833 = Class177.method1159((byte) 109, false, is);
				}
				Class37 class37 = ((Class260_Sub2) class260_sub2).f_se;
				if (!class37.method259(-76) || Class246_Sub28_Sub14.anObject6305 != null)
					break;
				byte[] is = Class246_Sub28_Sub23.method2727(0.6F, 4.0F, 16.0F, 0.5F, 8, new Class64_Sub1(419684), 16, (byte) 22, 4.0F, 128, 128);
				Class246_Sub28_Sub14.anObject6305 = Class177.method1159((byte) 109, false, is);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nl.B(" + i + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
