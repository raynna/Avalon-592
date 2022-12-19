/* Class246_Sub1_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SubIncomingPacket extends Class246_Sub1_Sub6 {
	static Class209 aClass209_7085;
	static int anInt7086;
	static int anInt7087;
	static Class97 aClass97_7088 = new Class97("LIVE", 0);
	BufferStream aStream7089;
	int anInt7090;
	static int anInt7091;
	byte aByte7092;
	static Class12 SOME_PACKET = new Class12(5, 14);
	static Class12 aClass12_7094;
	static int anInt7095 = 0;

	static final boolean method2899(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ <= 77)
				aClass12_7094 = null;
			anInt7087++;
			if ((0x10000 & i_1_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("je.A(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int method2533(int i) {
		try {
			if (i <= 23)
				return 110;
			anInt7091++;
			if (((SubIncomingPacket) this).aStream7089 == null)
				return 0;
			return (100 * (((BufferStream) ((SubIncomingPacket) this).aStream7089).position) / (-((SubIncomingPacket) this).aByte7092 + ((BufferStream) (((SubIncomingPacket) this).aStream7089)).buffer.length));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "je.B(" + i + ')');
		}
	}

	public static void method2900(int i) {
		try {
			aClass97_7088 = null;
			SOME_PACKET = null;
			aClass12_7094 = null;
			aClass209_7085 = null;
			int i_2_ = 106 % ((-57 - i) / 51);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "je.C(" + i + ')');
		}
	}

	final byte[] method2534(boolean bool) {
		try {
			anInt7086++;
			if (bool != false)
				return null;
			if (((Class246_Sub1_Sub6) this).aBool5960 || ((((BufferStream) ((SubIncomingPacket) this).aStream7089).position) < ((((BufferStream) ((SubIncomingPacket) this).aStream7089).buffer).length - ((SubIncomingPacket) this).aByte7092)))
				throw new RuntimeException();
			return (((BufferStream) ((SubIncomingPacket) this).aStream7089).buffer);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "je.D(" + bool + ')');
		}
	}

	static {
		aClass12_7094 = new Class12(14, 7);
	}
}
