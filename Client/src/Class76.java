/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76 {
	static int anInt990;
	int anInt991;
	static Class166 aClass166_992;
	static Class_l aClass_l993;
	private Class_fs aClass_fs994;
	private HashMap aClass54_995 = new HashMap(64);
	static int[] anIntArray996 = new int[32];
	static int anInt997;
	static int anInt998;
	static Class246_Sub24 aClass246_Sub24_999;
	static IncomingPacket aClass13_1000;
	static Class255_Sub1 aClass255_Sub1_1001;
	static Npc[] aClass_r_Sub2Array1002;

	final Class225 method477(int i, int i_0_) {
		try {
			anInt990++;
			Class225 class225;
			synchronized (aClass54_995) {
				class225 = (Class225) aClass54_995.method379((long) i_0_, (byte) 58);
			}
			if (class225 != null)
				return class225;
			byte[] is = aClass_fs994.method91(i_0_, 19, 86);
			class225 = new Class225();
			if (i <= 114)
				aClass_l993 = null;
			if (is != null)
				class225.method1447(new BufferStream(is), (byte) -105);
			synchronized (aClass54_995) {
				aClass54_995.method371(1, (long) i_0_, class225);
			}
			return class225;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "he.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method478(byte i) {
		try {
			aClass166_992 = null;
			aClass13_1000 = null;
			if (i <= 115)
				method478((byte) 10);
			aClass_r_Sub2Array1002 = null;
			anIntArray996 = null;
			aClass255_Sub1_1001 = null;
			aClass246_Sub24_999 = null;
			aClass_l993 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "he.B(" + i + ')');
		}
	}

	Class76(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs994 = class_fs;
			((Class76) this).anInt991 = aClass_fs994.method95(19, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("he.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass166_992 = new Class166();
		aClass13_1000 = new IncomingPacket(91, -1);
		aClass_r_Sub2Array1002 = new Npc[32768];
	}
}
