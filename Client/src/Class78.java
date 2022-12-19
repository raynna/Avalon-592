
/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class Class78 {
	static int anInt1011;
	static Class12 SEND_WORLD_OBJECT = new Class12(12, 4);
	static int anInt1013;
	static int anInt1014;
	static Class67 aClass67_1015 = new Class67(" ", ": ", " ", " ");
	static int anInt1016;
	static IncomingPacket SEND_GRAND_EXCHANGE_OFFER_PACKET = new IncomingPacket(47, 20);
	static Stream_Sub1 packetStream = new Stream_Sub1(5000);
	static Class_fs aClass_fs1019;

	static final void method489(byte i, int i_0_) {
		try {
			if (i > -9)
				method495(null, null, false);
			anInt1011++;
			if (Class246_Sub13.method1992(-98, i_0_))
				Class246_Sub15.method1999(false, -1, (Class246_Sub32.aClass235ArrayArray5049[i_0_]));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hh.C(" + i + ',' + i_0_ + ')');
		}
	}

	abstract void method490(byte i, Component component);

	static final void method491(int i) {
		try {
			int i_1_ = -4 % ((44 - i) / 53);
			Class246_Sub38.aClass54_5448.method369(false);
			anInt1014++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hh.B(" + i + ')');
		}
	}

	public static void method492(byte i) {
		do {
			try {
				SEND_GRAND_EXCHANGE_OFFER_PACKET = null;
				SEND_WORLD_OBJECT = null;
				aClass67_1015 = null;
				aClass_fs1019 = null;
				packetStream = null;
				if (i == 51)
					break;
				method495(null, null, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hh.G(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract int method493(byte i);

	abstract void method494(Component component, int i);

	public Class78() {
		/* empty */
	}

	static final void method495(Object[] objects, int[] is, boolean bool) {
		try {
			if (bool == false) {
				anInt1016++;
				Class246_Sub25.method2114(is, -1 + is.length, 0, objects, -57);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hh.A(" + (objects != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}
}
