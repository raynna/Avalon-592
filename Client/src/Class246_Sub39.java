/* Class246_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub39 extends Node {
	static OutgoingPacket CHANGE_FRIEND_CHAT_PACKET = new OutgoingPacket(24, -1);
	volatile int anInt5485 = -1;
	volatile String aString5486;
	static Class141 aClass141_5487;
	static boolean[] aBoolArray5488 = new boolean[100];
	static int[] anIntArray5489 = new int[4096];

	public static void method2303(byte i) {
		try {
			if (i >= -25)
				anIntArray5489 = null;
			aBoolArray5488 = null;
			aClass141_5487 = null;
			anIntArray5489 = null;
			CHANGE_FRIEND_CHAT_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "va.A(" + i + ')');
		}
	}

	Class246_Sub39(String string) {
		try {
			((Class246_Sub39) this).aString5486 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "va.<init>(" + (string != null ? "{...}" : "null") + ')');
		}
	}
}
