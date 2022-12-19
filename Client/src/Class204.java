
/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class204 {
	static Class67 aClass67_2879 = new Class67("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
	static int anInt2880;
	static float aFloat2881 = 0.0F;

	public static void method1338(byte i) {
		try {
			if (i != 32)
				aFloat2881 = 1.4137807F;
			aClass67_2879 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "so.A(" + i + ')');
		}
	}

	static final void method1339(int i, byte i_0_) {
		do {
			try {
				if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool606)
					i = -1;
				anInt2880++;
				if ((i ^ 0xffffffff) != (CS2Script.anInt5674 ^ 0xffffffff)) {
					if (i_0_ <= 124)
						aFloat2881 = 0.10947551F;
					do {
						if ((i ^ 0xffffffff) != 0) {
							Class60 class60 = Class_fs.aClass156_150.method1032(i, -23);
							Class10 class10 = class60.method415(0);
							if (class10 == null) {
								i = -1;
								if (!client.f_ob)
									break;
							}
							Class108.aClass52_1535.method352(new Point(((Class60) class60).anInt827, ((Class60) class60).anInt826), Class147.aCanvas2155, class10.method126(), class10.method121(), class10.method127(), -23853);
							CS2Script.anInt5674 = i;
						}
					} while (false);
					if (i != -1 || (CS2Script.anInt5674 ^ 0xffffffff) == 0)
						break;
					Class108.aClass52_1535.method352(new Point(), Class147.aCanvas2155, -1, null, -1, -23853);
					CS2Script.anInt5674 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "so.B(" + i + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}
}
