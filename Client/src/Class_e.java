
/* Class_e - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class_e {
	static int anInt1209;
	static int anInt1210;
	static int anInt1211;
	static int anInt1212;
	static int anInt1213;
	static OutgoingPacket aClass201_1214 = new OutgoingPacket(36, 3);
	static int[] anIntArray1215;
	static IncomingPacket INTERFACE_TEXT_IN;
	static Class170 aClass170_1217;
	static int anInt1218;
	static int anInt1219;

	static final void method592(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = 122 % ((10 - i_2_) / 34);
			anInt1209++;
			if ((i_7_ ^ 0xffffffff) != (i_6_ ^ 0xffffffff) || (i_3_ ^ 0xffffffff) != (i ^ 0xffffffff) || (i_8_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff) || i_1_ != i_4_) {
				int i_10_ = i_7_;
				int i_11_ = i;
				int i_12_ = 3 * i_7_;
				int i_13_ = 3 * i;
				int i_14_ = i_6_ * 3;
				int i_15_ = i_3_ * 3;
				int i_16_ = 3 * i_8_;
				int i_17_ = i_4_ * 3;
				int i_18_ = -i_16_ + i_5_ + i_14_ - i_7_;
				int i_19_ = -i + i_15_ + (i_1_ + -i_17_);
				int i_20_ = i_12_ + -i_14_ + i_16_ + -i_14_;
				int i_21_ = -i_15_ + (-i_15_ + i_17_) - -i_13_;
				int i_22_ = -i_12_ + i_14_;
				int i_23_ = -i_13_ + i_15_;
				for (int i_24_ = 128; i_24_ <= 4096; i_24_ += 128) {
					int i_25_ = i_24_ * i_24_ >> 12;
					int i_26_ = i_25_ * i_24_ >> 12;
					int i_27_ = i_18_ * i_26_;
					int i_28_ = i_19_ * i_26_;
					int i_29_ = i_25_ * i_20_;
					int i_30_ = i_21_ * i_25_;
					int i_31_ = i_24_ * i_22_;
					int i_32_ = i_24_ * i_23_;
					int i_33_ = i_7_ - -(i_31_ + i_29_ + i_27_ >> 12);
					int i_34_ = i + (i_30_ + (i_28_ - -i_32_) >> 12);
					Class91.method579(i_11_, i_10_, i_0_, i_34_, i_33_, 37);
					i_11_ = i_34_;
					i_10_ = i_33_;
				}
			} else
				Class91.method579(i, i_7_, i_0_, i_1_, i_5_, -124);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("e.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method593(int i) {
		try {
			aClass201_1214 = null;
			if (i != 63)
				method595((byte) 77, null);
			anIntArray1215 = null;
			aClass170_1217 = null;
			INTERFACE_TEXT_IN = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "e.B(" + i + ')');
		}
	}

	static final short method594(int i, int i_35_) {
		try {
			anInt1211++;
			int i_36_ = -96 % ((i - 61) / 63);
			int i_37_ = 0x3f & i_35_ >> 10;
			int i_38_ = 0x70 & i_35_ >> 3;
			int i_39_ = i_35_ & 0x7f;
			i_38_ = (i_39_ <= 64 ? i_39_ * i_38_ >> 7 : (127 - i_39_) * i_38_ >> 7);
			int i_40_ = i_38_ + i_39_;
			int i_41_;
			do {
				if ((i_40_ ^ 0xffffffff) != -1) {
					i_41_ = (i_38_ << 8) / i_40_;
					if (!client.f_ob)
						break;
				}
				i_41_ = i_38_ << 1;
			} while (false);
			int i_42_ = i_40_;
			return (short) (i_37_ << 10 | i_41_ >> 4 << 7 | i_42_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "e.A(" + i + ',' + i_35_ + ')');
		}
	}

	static final void method595(byte i, BufferStream stream) {
		try {
			if (i > -117)
				anInt1219 = -3;
			anInt1213++;
			byte[] is = new byte[24];
			if (Class_c_Sub1.aClass125_5392 != null) {
				try {
					Class_c_Sub1.aClass125_5392.method856(0, 0L);
					Class_c_Sub1.aClass125_5392.method852(is, 115);
					int i_43_;
					for (i_43_ = 0; i_43_ < 24; i_43_++) {
						if ((is[i_43_] ^ 0xffffffff) != -1)
							break;
					}
					if (i_43_ >= 24)
						throw new IOException();
				} catch (Exception exception) {
					for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -25; i_44_++)
						is[i_44_] = (byte) -1;
				}
			}
			stream.writeBytes(0, true, is, 24);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("e.D(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67(null, "Dieses System darf nicht missbraucht werden!", null, null);
		anIntArray1215 = new int[14];
		INTERFACE_TEXT_IN = new IncomingPacket(1, -2);
		aClass170_1217 = new Class170();
		new Class67("You can report that person under a different rule.", "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
		anInt1219 = 1;
	}
}
