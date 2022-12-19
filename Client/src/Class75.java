
/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class75 {
	int anInt981;
	int anInt982;
	static int anInt983;
	int anInt984;
	static int anInt985;
	static int anInt986;
	static long[] aLongArray987;
	static int anInt988;
	static Class182 aClass182_989;

	static final void method472(BufferStream stream, byte i) {
		try {
			anInt985++;
			int i_0_ = stream.readSmart((byte) 56);
			Class73.aClass5Array962 = new Class5[i_0_];
			for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				Class73.aClass5Array962[i_1_] = new Class5();
				((Class5) Class73.aClass5Array962[i_1_]).anInt64 = stream.readSmart((byte) 103);
				((Class5) Class73.aClass5Array962[i_1_]).aString54 = stream.method2360(i ^ ~0x70);
			}
			Class_u.anInt4702 = stream.readSmart((byte) 97);
			Class246_Sub19_Sub2.anInt6810 = stream.readSmart((byte) 126);
			Class246_Sub4.anInt3863 = stream.readSmart((byte) 109);
			Class230.aClass63_Sub1Array3154 = (new Class63_Sub1[1 + Class246_Sub19_Sub2.anInt6810 - Class_u.anInt4702]);
			for (int i_2_ = 0; i_2_ < Class246_Sub4.anInt3863; i_2_++) {
				int i_3_ = stream.readSmart((byte) 116);
				Class63_Sub1 class63_sub1 = (Class230.aClass63_Sub1Array3154[i_3_] = new Class63_Sub1());
				((Class63) class63_sub1).anInt854 = stream.readUnsignedByte(255);
				((Class63) class63_sub1).anInt851 = stream.readInt((byte) 97);
				((Class63_Sub1) class63_sub1).anInt4713 = Class_u.anInt4702 + i_3_;
				((Class63_Sub1) class63_sub1).aString4714 = stream.method2360(i ^ 0x18);
				((Class63_Sub1) class63_sub1).aString4717 = stream.method2360(37);
			}
			Class40_Sub2.anInt4048 = stream.readInt((byte) 87);
			if (i == 13)
				Class194_Sub1.aBool4139 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hd.E(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method473(byte i) {
		do {
			try {
				anInt988++;
				Class216.aClass232_3009.method1485(i - 143);
				Class238.aClass102_3360.method633(true);
				if (Player.f_rd != null)
					Player.f_rd.method494(Class147.aCanvas2155, 0);
				CS2Script.aclient5668.method2940((byte) -83);
				Class147.aCanvas2155.setBackground(Color.black);
				CS2Script.anInt5674 = -1;
				Class216.aClass232_3009 = Class74.method471((byte) 47, Class147.aCanvas2155);
				Class238.aClass102_3360 = Class_t.method673(-53, true, Class147.aCanvas2155);
				if (Player.f_rd != null)
					Player.f_rd.method490((byte) 98, Class147.aCanvas2155);
				if (i == 56)
					break;
				method473((byte) -121);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method474(byte i) {
		do {
			try {
				aLongArray987 = null;
				aClass182_989 = null;
				if (i <= -84)
					break;
				aClass182_989 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "hd.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method475(byte i, int i_4_, char c) {
		try {
			anInt983++;
			int i_5_ = c << 4;
			if (i != -78)
				method472(null, (byte) -95);
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				c = Character.toLowerCase(c);
				i_5_ = (c << 4) + 1;
			}
			if ((c ^ 0xffffffff) == -242 && i_4_ == 0)
				i_5_ = 1762;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hd.B(" + i + ',' + i_4_ + ',' + c + ')'));
		}
	}

	public Class75() {
		/* empty */
	}

	static final void method476(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			for (Class130_Sub8 class130_sub8 = (Class130_Sub8) Class_o.aClass68_7208.method445(62); class130_sub8 != null; class130_sub8 = (Class130_Sub8) Class_o.aClass68_7208.method442((byte) -119)) {
				if ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) <= (((Class130_Sub8) class130_sub8).anInt5611 ^ 0xffffffff))
					class130_sub8.method886(1024);
				else {
					Class246_Sub1_Sub16.method2746(i_6_, 64 + (((Class130_Sub8) class130_sub8).anInt5610 << 7), (((Class130_Sub8) class130_sub8).anInt5619 << 7) + 64, ((Class130_Sub8) class130_sub8).anInt5617, 2 * ((Class130_Sub8) class130_sub8).anInt5620, i >> 1, (byte) 41, i_10_ >> 1, i_8_);
					Class79_Sub1.aClass116_5162.method792(i_11_ - -Class257.anIntArray3689[0], ~0xffffff | ((Class130_Sub8) class130_sub8).anInt5621, 0, i_9_ - -Class257.anIntArray3689[1], 0, ((Class130_Sub8) class130_sub8).aString5608);
				}
			}
			if (i_7_ < 15)
				method473((byte) -97);
			anInt986++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hd.D(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static {
		new Class67("This mute will remain for a further ", "Diese Stummschaltung gilt f\u00fcr weitere ", "Votre acc\u00e8s restera bloqu\u00e9 encore ", "Este veto permanecer\u00e1 por mais ");
		aLongArray987 = new long[32];
	}
}
