/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 {
	int anInt3449;
	Class246_Sub1_Sub3 aClass246_Sub1_Sub3_3450;
	static int anInt3451;
	int[] anIntArray3452;
	static int anInt3453;
	static int anInt3454;
	static IncomingPacket aClass13_3455 = new IncomingPacket(50, 3);
	static int anInt3456;

	public static void method1570(int i) {
		do {
			try {
				aClass13_3455 = null;
				if (i == 3)
					break;
				method1571(-83, null, (byte) -17, -86);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "vq.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final String method1571(int i, String[] strings, byte i_0_, int i_1_) {
		try {
			anInt3453++;
			if ((i_1_ ^ 0xffffffff) == -1)
				return "";
			if (i_1_ == 1) {
				String string = strings[i];
				if (string == null)
					return "null";
				return string.toString();
			}
			int i_2_ = i + i_1_;
			int i_3_ = 0;
			for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
				String string = strings[i_4_];
				if (string == null)
					i_3_ += 4;
				else
					i_3_ += string.length();
			}
			StringBuffer stringbuffer = new StringBuffer(i_3_);
			for (int i_5_ = i; i_2_ > i_5_; i_5_++) {
				String string = strings[i_5_];
				if (string != null)
					stringbuffer.append(string);
				else
					stringbuffer.append("null");
			}
			int i_6_ = 117 / ((45 - i_0_) / 53);
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vq.B(" + i + ',' + (strings != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public Class244() {
		/* empty */
	}
}
