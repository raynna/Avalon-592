/* Class246_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class246_Sub1 extends Node {
	static int anInt3736;
	static int anInt3737;
	static int[] anIntArray3738 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	long aLong3739;
	static int anInt3740;
	static Class260 aClass260_3741;
	Class246_Sub1 aClass246_Sub1_3742;
	Class246_Sub1 aClass246_Sub1_3743;
	static int anInt3744;
	static int anInt3745;
	static int anInt3746;
	static IncomingPacket SEND_CLAN_CHAT_CHANNEL_PACKET = new IncomingPacket(81, -2);
	static Class67 aClass67_3748 = new Class67("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");

	final void method1756(byte i) {
		try {
			anInt3740++;
			if (((Class246_Sub1) this).aClass246_Sub1_3743 != null) {
				int i_0_ = 89 / ((i + 28) / 45);
				((Class246_Sub1) ((Class246_Sub1) this).aClass246_Sub1_3743).aClass246_Sub1_3742 = ((Class246_Sub1) this).aClass246_Sub1_3742;
				((Class246_Sub1) ((Class246_Sub1) this).aClass246_Sub1_3742).aClass246_Sub1_3743 = ((Class246_Sub1) this).aClass246_Sub1_3743;
				((Class246_Sub1) this).aClass246_Sub1_3742 = null;
				((Class246_Sub1) this).aClass246_Sub1_3743 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ac.K(" + i + ')');
		}
	}

	static final void method1757(int i, int i_1_) {
		try {
			Class40.anInt617 = -1;
			OutputStream_Sub1.anInt4489 = -1;
			anInt3736++;
			if (i_1_ > 43) {
				Class109_Sub1_Sub1.anInt6725 = i;
				Class_c_Sub1.method2278(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ac.L(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method1758(byte i) {
		try {
			anInt3746++;
			synchronized (Class253.aClass54_3600) {
				Class253.aClass54_3600.method383(i ^ ~0x4d);
				if (i != -60)
					anInt3744 = 1;
			}
			synchronized (Class246_Sub28_Sub14.aClass54_6304) {
				Class246_Sub28_Sub14.aClass54_6304.method383(85);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ac.N(" + i + ')');
		}
	}

	public static void method1759(int i) {
		try {
			if (i < 77)
				anInt3744 = 94;
			anIntArray3738 = null;
			aClass260_3741 = null;
			SEND_CLAN_CHAT_CHANNEL_PACKET = null;
			aClass67_3748 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ac.O(" + i + ')');
		}
	}

	final boolean method1760(boolean bool) {
		try {
			anInt3745++;
			if (bool != true)
				method1757(-9, 99);
			if (((Class246_Sub1) this).aClass246_Sub1_3743 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ac.M(" + bool + ')');
		}
	}

	public Class246_Sub1() {
		/* empty */
	}
}
