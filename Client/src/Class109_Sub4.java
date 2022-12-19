
/* Class109_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class109_Sub4 extends Class109 {
	static int anInt4564;
	private int anInt4565 = -1;
	static int anInt4566 = -1;
	private int anInt4567 = -1;
	static Class67 aClass67_4568;
	static int anInt4569;
	static int anInt4570;
	int anInt4571;
	static int anInt4572;
	static int anInt4573;

	Class109_Sub4(Class260_Sub2 class260_sub2, int i, int i_0_, boolean bool, byte[][] is, int i_1_) {
		super(class260_sub2, 34067, i, i_0_ * (i_0_ * 6), bool);
		try {
			((Class109_Sub4) this).anInt4571 = i_0_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -7; i_2_++)
				OpenGL.glTexImage2Dub(i_2_ + 34069, 0, ((Class109) this).anInt1556, i_0_, i_0_, 0, i_1_, 5121, is[i_2_], 0);
			this.method753(80, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("im.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	public static void method2026(int i) {
		do {
			try {
				aClass67_4568 = null;
				if (i == -1)
					break;
				method2026(-34);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "im.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2027(int i, int i_3_, int i_4_, byte i_5_, int i_6_) {
		try {
			anInt4564++;
			OpenGL.glFramebufferTexture2DEXT(i, i_6_, i_4_, ((Class109) this).anInt1563, i_3_);
			anInt4565 = i_6_;
			int i_7_ = -45 / ((i_5_ - 59) / 59);
			anInt4567 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("im.L(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class109_Sub4(Class260_Sub2 class260_sub2, int i, int i_8_, boolean bool, int[][] is) {
		super(class260_sub2, 34067, i, i_8_ * i_8_ * 6, bool);
		try {
			((Class109_Sub4) this).anInt4571 = i_8_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			if (!bool) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -7; i_9_++)
					OpenGL.glTexImage2Di(i_9_ + 34069, 0, ((Class109) this).anInt1556, i_8_, i_8_, 0, 32993, ((Class260_Sub2) (((Class109) this).aClass260_Sub2_1552)).f_sg, is[i_9_], 0);
			} else {
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -7; i_10_++)
					Class21_Sub1.method1815(32993, is[i_10_], ((Class109) this).anInt1556, i_8_, i_8_, ((Class260_Sub2) (((Class109) this).aClass260_Sub2_1552)).f_sg, i_10_ + 34069, 17054);
			}
			this.method753(94, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("im.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class109_Sub4(Class260_Sub2 class260_sub2, int i, int i_11_) {
		super(class260_sub2, 34067, i, 6 * i_11_ * i_11_, false);
		try {
			((Class109_Sub4) this).anInt4571 = i_11_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			for (int i_12_ = 0; i_12_ < 6; i_12_++)
				OpenGL.glTexImage2Dub(34069 + i_12_, 0, ((Class109) this).anInt1556, i_11_, i_11_, 0, Class163.method1086((((Class109) this).anInt1556), 13519), 5121, null, 0);
			this.method753(104, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("im.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ')'));
		}
	}

	public final void method8(int i) {
		try {
			if (i < 121)
				method8(-44);
			anInt4569++;
			OpenGL.glFramebufferTexture2DEXT(anInt4567, anInt4565, 3553, 0, 0);
			anInt4565 = -1;
			anInt4567 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "im.P(" + i + ')');
		}
	}

	static {
		new Class67("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
		anInt4570 = 100;
		aClass67_4568 = (new Class67("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de r\u00e9tablissement.", "Tentando reestabelecer conex\u00e3o. Aguarde."));
		anInt4573 = 0;
		anInt4572 = 0;
	}
}
