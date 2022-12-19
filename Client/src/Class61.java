/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
	private Class_fs aClass_fs838;
	static int[] anIntArray839 = new int[4096];
	static OutgoingPacket aClass201_840;
	static int anInt841;
	static IncomingPacket SEND_UPDATE_ITEMS_IN;
	private HashMap aClass54_843 = new HashMap(64);
	static Class67 aClass67_844;
	static int[] anIntArray845;
	static Class166 aClass166_846;

	final Class246_Sub1_Sub2 method416(int i, int i_0_) {
		try {
			anInt841++;
			Class246_Sub1_Sub2 class246_sub1_sub2;
			synchronized (aClass54_843) {
				class246_sub1_sub2 = (Class246_Sub1_Sub2) aClass54_843.method379((long) i_0_, (byte) 58);
			}
			if (class246_sub1_sub2 != null)
				return class246_sub1_sub2;
			byte[] is = aClass_fs838.method91(i_0_, i, 88);
			class246_sub1_sub2 = new Class246_Sub1_Sub2();
			if (is != null)
				class246_sub1_sub2.method2422(i + 1439100499, new BufferStream(is));
			synchronized (aClass54_843) {
				aClass54_843.method371(1, (long) i_0_, class246_sub1_sub2);
			}
			return class246_sub1_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fp.A(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method417(int i) {
		try {
			if (i != 32)
				aClass201_840 = null;
			aClass67_844 = null;
			aClass166_846 = null;
			aClass201_840 = null;
			anIntArray839 = null;
			SEND_UPDATE_ITEMS_IN = null;
			anIntArray845 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fp.B(" + i + ')');
		}
	}

	Class61(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs838 = class_fs;
			aClass_fs838.method95(5, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fp.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray839[i] = Class258.method1671(i, true);
		aClass201_840 = new OutgoingPacket(29, 7);
		SEND_UPDATE_ITEMS_IN = new IncomingPacket(32, -2);
		anIntArray845 = new int[13];
		aClass67_844 = new Class67("glow2:", "leuchten2:", "brillant2:", "brilho2:");
		aClass166_846 = new Class166();
	}
}
