/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class141 {
	static int anInt2041;
	static IncomingPacket aClass13_2042;
	static Class198 aClass198_2043;
	static int anInt2044;
	private Class_fs aClass_fs2045;
	static int anInt2046 = 205;
	private HashMap aClass54_2047 = new HashMap(128);

	public static void method953(int i) {
		do {
			try {
				aClass13_2042 = null;
				aClass198_2043 = null;
				if (i == 1)
					break;
				method953(-122);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ng.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class183 method954(int i, int i_0_) {
		try {
			int i_1_ = 125 % ((-38 - i_0_) / 46);
			anInt2041++;
			Class183 class183;
			synchronized (aClass54_2047) {
				class183 = (Class183) aClass54_2047.method379((long) i, (byte) 58);
			}
			if (class183 != null)
				return class183;
			byte[] is = aClass_fs2045.method91(Class91.method580(i, false), Class109_Sub1.method1761(false, i), 125);
			class183 = new Class183();
			if (is != null)
				class183.method1181(19207, new BufferStream(is));
			synchronized (aClass54_2047) {
				aClass54_2047.method371(1, (long) i, class183);
			}
			return class183;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ng.A(" + i + ',' + i_0_ + ')');
		}
	}

	Class141(Class101 class101, int i, Class_fs class_fs) {
		do {
			try {
				aClass_fs2045 = class_fs;
				if (aClass_fs2045 == null)
					break;
				int i_2_ = -1 + aClass_fs2045.method87((byte) 39);
				aClass_fs2045.method95(i_2_, 28724);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ng.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass13_2042 = new IncomingPacket(38, 1);
	}
}
