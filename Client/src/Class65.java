/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static int anInt862;
	static int anInt863;
	static Class6 aClass6_864;
	int anInt865;
	static int anInt866;
	private Class_fs aClass_fs867;
	private Class_fs aClass_fs868;
	int anInt869 = 0;
	private HashMap aClass54_870;
	private Interface7 anInterface7_871;

	final String method425(Class81 class81, byte i, int[] is, long l) {
		try {
			anInt866++;
			if (i > -95)
				method427(false, -17, -21);
			if (anInterface7_871 != null) {
				String string = anInterface7_871.method25(l, (byte) 85, is, class81);
				if (string != null)
					return string;
			}
			return Long.toString(l);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gh.B(" + (class81 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}

	public static void method426(int i) {
		do {
			try {
				aClass6_864 = null;
				if (i == -7675)
					break;
				aClass6_864 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "gh.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final byte method427(boolean bool, int i, int i_0_) {
		try {
			if (bool != true)
				method426(-19);
			anInt863++;
			if ((i_0_ ^ 0xffffffff) != -10)
				return (byte) 0;
			if ((0x1 & i ^ 0xffffffff) == -1)
				return (byte) 1;
			return (byte) 2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gh.A(" + bool + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final Class246_Sub1_Sub3 method428(int i, byte i_1_) {
		try {
			anInt862++;
			Class246_Sub1_Sub3 class246_sub1_sub3 = ((Class246_Sub1_Sub3) aClass54_870.method379((long) i, (byte) 58));
			if (class246_sub1_sub3 != null)
				return class246_sub1_sub3;
			if (i_1_ != -99)
				method426(51);
			byte[] is;
			do {
				if ((i ^ 0xffffffff) <= -32769) {
					is = aClass_fs868.method91(0x7fff & i, 1, i_1_ + 192);
					if (!client.f_ob)
						break;
				}
				is = aClass_fs867.method91(i, 1, 115);
			} while (false);
			class246_sub1_sub3 = new Class246_Sub1_Sub3();
			((Class246_Sub1_Sub3) class246_sub1_sub3).aClass65_5711 = this;
			if (is != null)
				class246_sub1_sub3.method2434(new BufferStream(is), 9536);
			if (i >= 32768)
				class246_sub1_sub3.method2430(75);
			aClass54_870.method371(i_1_ ^ ~0x63, (long) i, class246_sub1_sub3);
			return class246_sub1_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gh.C(" + i + ',' + i_1_ + ')');
		}
	}

	Class65(int i, Class_fs class_fs, Class_fs class_fs_2_, Interface7 interface7) {
		((Class65) this).anInt865 = 0;
		aClass54_870 = new HashMap(64);
		anInterface7_871 = null;
		do {
			try {
				anInterface7_871 = interface7;
				aClass_fs867 = class_fs;
				aClass_fs868 = class_fs_2_;
				if (aClass_fs867 != null)
					((Class65) this).anInt865 = aClass_fs867.method95(1, 28724);
				if (aClass_fs868 == null)
					break;
				((Class65) this).anInt869 = aClass_fs868.method95(1, 28724);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gh.<init>(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_2_ != null ? "{...}" : "null") + ',' + (interface7 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
