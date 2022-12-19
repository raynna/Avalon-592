
/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaggl.OpenGL;

abstract class Class187 {
	static int anInt2640;
	static int anInt2641;
	private int anInt2642;
	Class260_Sub2 aClass260_Sub2_2643;
	static int anInt2644;
	private boolean aBool2645;
	int anInt2646;
	static OutgoingPacket aClass201_2647 = new OutgoingPacket(56, -1);
	private int anInt2648;
	static byte[][] aByteArrayArray2649;
	static int anInt2650;
	static Class85 aClass85_2651;
	static int anInt2652;
	static boolean aBool2653;
	static int[] anIntArray2654;

	static final Class147 method1222(int i, int i_0_, int i_1_) {
		if (Class106.aClass147ArrayArrayArray1494[i][i_0_][i_1_] == null) {
			boolean bool = (Class106.aClass147ArrayArrayArray1494[0][i_0_][i_1_] != null && ((Class147) (Class106.aClass147ArrayArrayArray1494[0][i_0_][i_1_])).aClass147_2165 != null);
			if (bool && i >= Class154_Sub1.anInt4803 - 1)
				return null;
			Class93.method596(i, i_0_, i_1_);
		}
		return Class106.aClass147ArrayArrayArray1494[i][i_0_][i_1_];
	}

	public static void method1223(int i) {
		try {
			anIntArray2654 = null;
			aClass201_2647 = null;
			if (i != -5298)
				aClass201_2647 = null;
			aClass85_2651 = null;
			aByteArrayArray2649 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rg.M(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt2644++;
			((Class187) this).aClass260_Sub2_2643.method1939(((Class187) this).anInt2646, anInt2648, -28);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rg.finalize(" + ')');
		}
	}

	final void method1224(int i, int i_2_, byte[] is) {
		try {
			method1226((byte) 117);
			anInt2640++;
			if (i >= 31) {
				if (anInt2648 < i_2_) {
					OpenGL.glBufferDataARBub(anInt2642, i_2_, is, 0, !aBool2645 ? 35044 : 35040);
					((Class260_Sub2) ((Class187) this).aClass260_Sub2_2643).anInt4314 += -anInt2648 + i_2_;
					anInt2648 = i_2_;
				} else
					// glBufferSubDataARBub
					OpenGL.glBufferSubDataARBub(anInt2642, 0, i_2_, is, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rg.K(" + i + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1225(byte i) {
		try {
			anInt2641++;
			synchronized (Class246_Sub1_Sub6_Sub2.aClass54_7109) {
				if (i != -57)
					anIntArray2654 = null;
				Class246_Sub1_Sub6_Sub2.aClass54_7109.method383(i ^ ~0x59);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rg.L(" + i + ')');
		}
	}

	Class187(Class260_Sub2 class260_sub2, int i, byte[] is, int i_3_, boolean bool) {
		try {
			aBool2645 = bool;
			anInt2642 = i;
			anInt2648 = i_3_;
			((Class187) this).aClass260_Sub2_2643 = class260_sub2;
			OpenGL.glGenBuffersARB(1, Class154_Sub1.anIntArray4790, 0);
			((Class187) this).anInt2646 = Class154_Sub1.anIntArray4790[0];
			method1226((byte) 122);
			OpenGL.glBufferDataARBub(i, anInt2648, is, 0, aBool2645 ? 35040 : 35044);
			((Class260_Sub2) ((Class187) this).aClass260_Sub2_2643).anInt4314 += anInt2648;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rg.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ',' + bool + ')'));
		}
	}

	abstract void method1226(byte i);

	Class187(Class260_Sub2 class260_sub2, int i, Buffer nativebuffer, int i_4_, boolean bool) {
		try {
			anInt2642 = i;
			anInt2648 = i_4_;
			((Class187) this).aClass260_Sub2_2643 = class260_sub2;
			aBool2645 = bool;
			OpenGL.glGenBuffersARB(1, Class154_Sub1.anIntArray4790, 0);
			((Class187) this).anInt2646 = Class154_Sub1.anIntArray4790[0];
			method1226((byte) 115);
			OpenGL.glBufferDataARBa(i, anInt2648, nativebuffer.getAddress(), aBool2645 ? 35040 : 35044);
			((Class260_Sub2) ((Class187) this).aClass260_Sub2_2643).anInt4314 += anInt2648;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rg.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (nativebuffer != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	static final int method1227(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt2650++;
			int i_9_ = i_8_ & 0xf;
			int i_10_ = (i_9_ ^ 0xffffffff) > -9 ? i_6_ : i;
			int i_11_ = (i_5_ >= (i_9_ ^ 0xffffffff) ? (i_9_ ^ 0xffffffff) != -13 && i_9_ != 14 ? i_7_ : i_6_ : i);
			return (((i_9_ & 0x1) == 0 ? i_10_ : -i_10_) - -((0x2 & i_9_ ^ 0xffffffff) == -1 ? i_11_ : -i_11_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rg.N(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static {
		new Class67("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, ins\u00e9rez le symbole / au d\u00e9but de chaque ligne.", "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
		aBool2653 = false;
		anInt2652 = 999999;
		aClass85_2651 = new Class85(16);
	}
}
