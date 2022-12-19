
/* Class211_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class211_Sub1_Sub1 extends Class211_Sub1 {
	static int anInt6229;
	private Class260_Sub2 aClass260_Sub2_6230;
	static int anInt6231;
	static int anInt6232;
	private Class109_Sub4 aClass109_Sub4_6233;
	static int[] anIntArray6234;
	static int anInt6235;

	public static void method2609(int i) {
		do {
			try {
				anIntArray6234 = null;
				if (i == 33985)
					break;
				method2611(49, -70);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ht.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class109_Sub4 method2265(int i) {
		try {
			if (i != 2)
				aClass260_Sub2_6230 = null;
			anInt6229++;
			return aClass109_Sub4_6233;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ht.D(" + i + ')');
		}
	}

	final boolean method2610(Class109_Sub4 class109_sub4, float f, Class109_Sub4 class109_sub4_0_, int i) {
		try {
			anInt6232++;
			boolean bool = true;
			Class134 class134 = ((Class260_Sub2) aClass260_Sub2_6230).aClass134_4378;
			Class134 class134_1_ = ((Class260_Sub2) aClass260_Sub2_6230).aClass134_4363;
			if ((((Class109_Sub4) class109_sub4_0_).anInt4571 != ((Class109_Sub1) (((Class260_Sub2) aClass260_Sub2_6230).aClass109_Sub1_4338)).anInt3760) || (((Class109_Sub1) (((Class260_Sub2) aClass260_Sub2_6230).aClass109_Sub1_4338)).anInt3752 != ((Class109_Sub4) class109_sub4_0_).anInt4571))
				((Class260_Sub2) aClass260_Sub2_6230).aClass109_Sub1_4338 = new Class109_Sub1(aClass260_Sub2_6230, 3553, 6408, (((Class109_Sub4) class109_sub4_0_).anInt4571), (((Class109_Sub4) class109_sub4_0_).anInt4571));
			if ((((Class109_Sub1) ((Class260_Sub2) aClass260_Sub2_6230).f_pf).anInt3760) != ((Class109_Sub4) class109_sub4).anInt4571 || (((Class109_Sub1) ((Class260_Sub2) aClass260_Sub2_6230).f_pf).anInt3752 != ((Class109_Sub4) class109_sub4).anInt4571))
				((Class260_Sub2) aClass260_Sub2_6230).f_pf = new Class109_Sub1(aClass260_Sub2_6230, 3553, 6408, (((Class109_Sub4) class109_sub4).anInt4571), (((Class109_Sub4) class109_sub4).anInt4571));
			aClass260_Sub2_6230.da(Class246_Sub26.anIntArray4883);
			aClass260_Sub2_6230.e();
			aClass260_Sub2_6230.method1898(true);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class109_Sub4) aClass109_Sub4_6233).anInt4571, ((Class109_Sub4) aClass109_Sub4_6233).anInt4571);
			aClass260_Sub2_6230.method1918(false, 0);
			aClass260_Sub2_6230.method1906(false, i - 49);
			aClass260_Sub2_6230.method1951(false, (byte) 85);
			aClass260_Sub2_6230.method1911(i - 32, false);
			aClass260_Sub2_6230.method1957(false, -2);
			aClass260_Sub2_6230.method1936(1, -122);
			aClass260_Sub2_6230.method1913(true, 0.0F, f, 0.0F, 0.0F);
			aClass260_Sub2_6230.method1912(34165, 34165, true);
			aClass260_Sub2_6230.method1905((byte) 78, null);
			aClass260_Sub2_6230.method1936(0, -128);
			aClass260_Sub2_6230.method1900(7681, 1);
			aClass260_Sub2_6230.method1905((byte) 78, null);
			for (int i_2_ = i; i_2_ < 6; i_2_++) {
				aClass260_Sub2_6230.method1940((byte) 79, class134);
				int i_3_ = i_2_ + 34069;
				class134.method911(0, -1, class109_sub4_0_, i_3_);
				aClass260_Sub2_6230.method1956(class134_1_, (byte) 54);
				class134_1_.method913((byte) 76, (((Class260_Sub2) aClass260_Sub2_6230).aClass109_Sub1_4338), 0);
				if (!class134.method908(-36054) || !class134_1_.method908(-36054)) {
					class134.method903(0, 90);
					aClass260_Sub2_6230.method1935(false, class134);
					class134_1_.method903(0, -117);
					aClass260_Sub2_6230.method1949(class134_1_, (byte) -45);
					bool = false;
					break;
				}
				OpenGL.glBlitFramebufferEXT(0, 0, ((Class109_Sub4) class109_sub4_0_).anInt4571, ((Class109_Sub4) class109_sub4_0_).anInt4571, 0, 0, ((Class109_Sub4) class109_sub4_0_).anInt4571, ((Class109_Sub4) class109_sub4_0_).anInt4571, 16384, 9728);
				class134.method911(0, -1, class109_sub4, i_3_);
				class134_1_.method913((byte) 76, (((Class260_Sub2) aClass260_Sub2_6230).f_pf), 0);
				if (!class134.method908(-36054) || !class134_1_.method908(i ^ ~0x8cd5)) {
					class134.method903(0, 88);
					aClass260_Sub2_6230.method1935(false, class134);
					class134_1_.method903(0, 126);
					bool = false;
					aClass260_Sub2_6230.method1949(class134_1_, (byte) -45);
					break;
				}
				OpenGL.glBlitFramebufferEXT(0, 0, ((Class109_Sub4) class109_sub4_0_).anInt4571, ((Class109_Sub4) class109_sub4_0_).anInt4571, 0, 0, ((Class109_Sub4) class109_sub4_0_).anInt4571, ((Class109_Sub4) class109_sub4_0_).anInt4571, 16384, 9728);
				class134.method903(0, -101);
				aClass260_Sub2_6230.method1935(false, class134);
				class134_1_.method903(0, 126);
				aClass260_Sub2_6230.method1949(class134_1_, (byte) -45);
				aClass260_Sub2_6230.method1922(class134, (byte) -101);
				class134.method911(0, -1, aClass109_Sub4_6233, i_3_);
				if (!class134.method908(-36054)) {
					class134.method903(0, i ^ 0x7f);
					bool = false;
					aClass260_Sub2_6230.method1971(class134, 49);
					break;
				}
				aClass260_Sub2_6230.method1936(1, i - 126);
				aClass260_Sub2_6230.method1905((byte) 78, ((Class260_Sub2) aClass260_Sub2_6230).f_pf);
				aClass260_Sub2_6230.method1936(0, i ^ ~0x7e);
				aClass260_Sub2_6230.method1905((byte) 78, (((Class260_Sub2) aClass260_Sub2_6230).aClass109_Sub1_4338));
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				aClass260_Sub2_6230.method1936(1, -128);
				aClass260_Sub2_6230.method1905((byte) 78, null);
				aClass260_Sub2_6230.method1936(0, i ^ ~0x7f);
				aClass260_Sub2_6230.method1905((byte) 78, null);
				class134.method903(0, i ^ 0x6d);
				aClass260_Sub2_6230.method1971(class134, 35);
			}
			aClass260_Sub2_6230.method1936(1, -123);
			aClass260_Sub2_6230.method1912(8448, 8448, true);
			aClass260_Sub2_6230.method1936(0, -120);
			OpenGL.glPopAttrib();
			aClass260_Sub2_6230.OA(Class246_Sub26.anIntArray4883[0], Class246_Sub26.anIntArray4883[1], Class246_Sub26.anIntArray4883[2], Class246_Sub26.anIntArray4883[3]);
			if (bool)
				aClass109_Sub4_6233.method761(-109);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ht.C(" + (class109_sub4 != null ? "{...}" : "null") + ',' + f + ',' + (class109_sub4_0_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2611(int i, int i_4_) {
		try {
			if (i != 0)
				method2611(29, -64);
			anInt6231++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_4_, (byte) 124, 10);
			class246_sub1_sub10.method2604((byte) -52);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ht.E(" + i + ',' + i_4_ + ')');
		}
	}

	Class211_Sub1_Sub1(Class260_Sub2 class260_sub2, int i) {
		try {
			aClass260_Sub2_6230 = class260_sub2;
			aClass109_Sub4_6233 = new Class109_Sub4(class260_sub2, 6408, i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ht.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method2612(boolean bool) {
		try {
			if (bool != false)
				return -34;
			anInt6235++;
			return ((Class109_Sub4) aClass109_Sub4_6233).anInt4571;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ht.B(" + bool + ')');
		}
	}

	static {
		new Class67("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.", "V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.");
		anIntArray6234 = new int[2];
	}
}
