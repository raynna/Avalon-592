
/* Class123_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class123_Sub2 extends Class123 {
	private int anInt4433;
	private static Interface9 anInterface9_4434;

	final void method837() {
		anInterface9_4434.method29(-22464, anInt4433);
	}

	final void method832(Component component) throws Exception {
		anInterface9_4434.method26(component, Class240.aBool3387, true, Class140.anInt2024);
	}

	public static void method1995() {
		anInterface9_4434 = null;
	}

	Class123_Sub2(Signlink class52, int i) {
		anInterface9_4434 = class52.method363(18);
		anInt4433 = i;
	}

	final void method838() {
		anInterface9_4434.method31(26264, anInt4433);
	}

	final void method839() {
		anInterface9_4434.method30(anInt4433, ((Class123) this).anIntArray1706);
	}

	final int method833() {
		return anInterface9_4434.method27(anInt4433, 25371);
	}

	final void method831(int i) throws Exception {
		if (i > 32768)
			throw new IllegalArgumentException();
		anInterface9_4434.method28((byte) 89, i, anInt4433);
	}
}
