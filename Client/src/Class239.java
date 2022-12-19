/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239 {
	int anInt3362;
	byte[] aByteArray3363;
	int anInt3364;
	static IncomingPacket SEND_IGNORE_PACKET = new IncomingPacket(25, -1);
	byte[] aByteArray3366;
	int anInt3367;
	int anInt3368;
	int anInt3369;
	static int anInt3370;
	static OutgoingPacket NPC_CLICK_3_PACKET = new OutgoingPacket(31, 3);
	static Class166 aClass166_3372 = new Class166();
	int anInt3373;
	int anInt3374;
	static IncomingPacket aClass13_3375;
	static float aFloat3376 = 0.25F;

	public static void method1535(int i) {
		try {
			if (i == 8) {
				aClass13_3375 = null;
				aClass166_3372 = null;
				NPC_CLICK_3_PACKET = null;
				SEND_IGNORE_PACKET = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vg.B(" + i + ')');
		}
	}

	static final String method1536(int i, int i_0_) {
		try {
			anInt3370++;
			if (i < 79)
				aClass13_3375 = null;
			String string = Integer.toString(i_0_);
			for (int i_1_ = -3 + string.length(); (i_1_ ^ 0xffffffff) < -1; i_1_ -= 3)
				string = string.substring(0, i_1_) + "," + string.substring(i_1_);
			if (string.length() > 9)
				return (" <col=00ff80>" + string.substring(0, string.length() - 8) + Class246_Sub43.aClass67_5598.method436(true, Class_j.anInt1485) + " (" + string + ")</col>");
			if ((string.length() ^ 0xffffffff) < -7)
				return (" <col=ffffff>" + string.substring(0, string.length() - 4) + Class115.aClass67_1606.method436(true, Class_j.anInt1485) + " (" + string + ")</col>");
			return " <col=ffff00>" + string + "</col>";
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vg.A(" + i + ',' + i_0_ + ')');
		}
	}

	public Class239() {
		/* empty */
	}

	static {
		aClass13_3375 = new IncomingPacket(75, 14);
	}
}
