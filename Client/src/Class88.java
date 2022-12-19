
/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

abstract class Class88 {
	static long aLong1147 = 0L;
	static int anInt1148;
	static int anInt1149;
	static int[][][] anIntArrayArrayArray1150;
	static boolean aBool1151 = false;
	static int anInt1152;

	abstract Class246_Sub1_Sub15 method556(Class246_Sub1_Sub15 class246_sub1_sub15, int i);

	static final int method557(int i, int i_0_) {
		try {
			anInt1148++;
			i = (0x55555555 & i) - -((~0x55555554 & i) >>> 1);
			i = (i & 0x33333333) + (0x73333333 & i >>> 2);
			i = 0xf0f0f0f & i + (i >>> 4);
			i += i >>> 8;
			i += i >>> 16;
			if (i_0_ <= 13)
				anInt1152 = 31;
			return 0xff & i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ie.B(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method558(int i) {
		do {
			try {
				anIntArrayArrayArray1150 = null;
				if (i == 1244216161)
					break;
				method558(50);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ie.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method559(boolean bool, int i) {
		try {
			anInt1149++;
			Class63_Sub1 class63_sub1 = Class108.method746(i, (byte) -126);
			if (class63_sub1 == null)
				return false;
			if ((Signlink.anInt740 ^ 0xffffffff) != -4) {
				Class32.anInt438 = ((Class63_Sub1) class63_sub1).anInt4713;
				Class174.aString2449 = ((Class63_Sub1) class63_sub1).aString4717;
				if (Class260_Sub2.aClass205_4297 != Class208.aClass205_2930) {
					Class246_Sub28_Sub7.anInt6047 = Class32.anInt438 + 50000;
					Class172.anInt2433 = Class32.anInt438 + 40000;
					Class230.anInt3165 = Class172.anInt2433;
				}
				return true;
			}
			String string = "";
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				string = ":" + (((Class63_Sub1) class63_sub1).anInt4713 + 7000);
			String string_1_ = "";
			if (Class246_Sub5.aString3891 != null)
				string_1_ = "/p=" + Class246_Sub5.aString3891;
			String string_2_ = ("http://" + ((Class63_Sub1) class63_sub1).aString4717 + string + "/l=" + Class_j.anInt1485 + "/a=" + Class109_Sub4.anInt4573 + string_1_ + "/j" + (Class106_Sub2.aBool5333 ? "1" : "0") + ",o" + (!aBool1151 ? "0" : "1") + ",a2");
			try {
				CS2Script.aclient5668.getAppletContext().showDocument(new URL(string_2_), "_self");
				if (bool != false)
					aBool1151 = true;
			} catch (Exception exception) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ie.D(" + bool + ',' + i + ')');
		}
	}

	static {
		new Class67("Unable to add name - system busy.", "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
		anInt1152 = 0;
	}
}
