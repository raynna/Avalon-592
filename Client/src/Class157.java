/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class157 {
	static int anInt2245;

	static final Class97 method1038(int i, int i_0_) {
		try {
			anInt2245++;
			Class97[] class97s = Class144.method969((byte) 109);
			for (int i_1_ = i; class97s.length > i_1_; i_1_++) {
				Class97 class97 = class97s[i_1_];
				if ((((Class97) class97).anInt1261 ^ 0xffffffff) == (i_0_ ^ 0xffffffff))
					return class97;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ol.A(" + i + ',' + i_0_ + ')');
		}
	}

	static {
		new Class67("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}
}
