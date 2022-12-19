/* Class188_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class188_Sub1 extends Class188 {
	static int anInt3910;
	static int anInt3911;
	static Class67 aClass67_3912 = new Class67("Loaded textures", "Texturen geladen.", "Textures charg\u00e9es", "Texturas carregadas");
	static OutgoingPacket ACTION_BUTTON5 = new OutgoingPacket(64, 8);
	static int anInt3914;
	long aLong3915;
	static int anInt3916;
	Class188_Sub1 aClass188_Sub1_3917;
	static int anInt3918;
	int anInt3919;
	boolean aBool3920;
	char aChar3921;
	int anInt3922;
	static IncomingPacket aClass13_3923 = new IncomingPacket(26, -1);
	static Class67 aClass67_3924 = new Class67("purple:", "lila:", "violet:", "roxo:");

	final char method1236(int i) {
		try {
			anInt3918++;
			if (i != 2)
				method1229(56);
			return ((Class188_Sub1) this).aChar3921;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bw.C(" + i + ')');
		}
	}

	final boolean method1228(boolean bool) {
		try {
			anInt3911++;
			if (bool != false)
				return false;
			return ((Class188_Sub1) this).aBool3920;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bw.E(" + bool + ')');
		}
	}

	final int method1233(byte i) {
		try {
			if (i < 72)
				return -75;
			anInt3910++;
			return ((Class188_Sub1) this).anInt3919;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bw.B(" + i + ')');
		}
	}

	final long method1229(int i) {
		try {
			anInt3916++;
			if (i != -5423)
				((Class188_Sub1) this).aBool3920 = false;
			return ((Class188_Sub1) this).aLong3915;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bw.D(" + i + ')');
		}
	}

	public static void method1816(int i) {
		do {
			try {
				ACTION_BUTTON5 = null;
				aClass67_3924 = null;
				aClass13_3923 = null;
				aClass67_3912 = null;
				if (i >= 96)
					break;
				method1816(44);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bw.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method1232(int i) {
		try {
			anInt3914++;
			int i_0_ = -27 % ((i + 2) / 47);
			return ((Class188_Sub1) this).anInt3922;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bw.F(" + i + ')');
		}
	}
}
