
/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class34 {
	static int anInt447;
	static IncomingPacket aClass13_448 = new IncomingPacket(99, 7);
	static int anInt449;
	static Class67 aClass67_450;
	static int anInt451 = -1;
	private int anInt452;
	static int anInt453;
	static int anInt454;

	final void method246(char c, int i) {
		do {
			try {
				OpenGL.glCallList(c + anInt452);
				anInt453++;
				if (i == -1)
					break;
				method249(34);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ct.C(" + c + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method247(int i, boolean bool) {
		try {
			anInt447++;
			if (bool != true)
				anInt451 = -39;
			OpenGL.glNewList(anInt452 + i, 4864);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ct.D(" + i + ',' + bool + ')');
		}
	}

	final void method248(byte i) {
		try {
			OpenGL.glEndList();
			if (i == 39)
				anInt449++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ct.A(" + i + ')');
		}
	}

	public static void method249(int i) {
		try {
			if (i != 4864)
				aClass13_448 = null;
			aClass13_448 = null;
			aClass67_450 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ct.B(" + i + ')');
		}
	}

	Class34(Class260_Sub2 class260_sub2, int i) {
		try {
			anInt452 = OpenGL.glGenLists(i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ct.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass67_450 = new Class67("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
	}
}
