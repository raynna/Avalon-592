
/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class220 {
	static int anInt3042;
	static int anInt3043;
	static Class127 aClass127_3044 = new Class127(16);
	static int anInt3045;
	static int anInt3046;
	static int anInt3047;
	static int anInt3048;
	static int[] anIntArray3049 = new int[50];
	static int anInt3050;
	static byte[][] aByteArrayArray3051;
	Class130_Sub1 aClass130_Sub1_3052 = new Class130_Sub1();
	private Class130_Sub1 aClass130_Sub1_3053;
	static OutgoingPacket GRAND_EXCHANGE_ITEM_SELECT_PACKET;
	static int anInt3055;
	static Class63_Sub1[] aClass63_Sub1Array3056;
	static Class4[] aClass4Array3057;
	static int anInt3058;
	static Class67 aClass67_3059;

	static final Class235 method1423(int i, int i_0_) {
		try {
			anInt3042++;
			if (i != 0)
				method1427(127, (byte) 47, null, null);
			int i_1_ = i_0_ >> 16;
			int i_2_ = 0xffff & i_0_;
			if (Class246_Sub32.aClass235ArrayArray5049[i_1_] == null || (Class246_Sub32.aClass235ArrayArray5049[i_1_][i_2_] == null)) {
				boolean bool = Class246_Sub13.method1992(i ^ ~0x7e, i_1_);
				if (!bool)
					return null;
			}
			return Class246_Sub32.aClass235ArrayArray5049[i_1_][i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.C(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1424(int i) {
		do {
			try {
				for (;;) {
					Class130_Sub1 class130_sub1 = (((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3732);
					if (class130_sub1 == ((Class220) this).aClass130_Sub1_3052)
						break;
					class130_sub1.method1754(10009);
				}
				anInt3048++;
				aClass130_Sub1_3053 = null;
				if (i >= 118)
					break;
				anInt3058 = 83;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ts.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1425(boolean bool) {
		try {
			if (bool != false)
				anInt3055 = 30;
			aByteArrayArray3051 = null;
			aClass127_3044 = null;
			aClass63_Sub1Array3056 = null;
			aClass4Array3057 = null;
			GRAND_EXCHANGE_ITEM_SELECT_PACKET = null;
			aClass67_3059 = null;
			anIntArray3049 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.E(" + bool + ')');
		}
	}

	final Class130_Sub1 method1426(boolean bool) {
		try {
			anInt3045++;
			if (bool != true)
				aClass63_Sub1Array3056 = null;
			Class130_Sub1 class130_sub1 = aClass130_Sub1_3053;
			if (class130_sub1 == ((Class220) this).aClass130_Sub1_3052) {
				aClass130_Sub1_3053 = null;
				return null;
			}
			aClass130_Sub1_3053 = ((Class130_Sub1) class130_sub1).aClass130_Sub1_3732;
			return class130_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.F(" + bool + ')');
		}
	}

	static final Class213 method1427(int i, byte i_3_, Class260_Sub2 class260_sub2, String string) {
		try {
			anInt3046++;
			int i_4_ = OpenGL.glGenProgramARB();
			OpenGL.glBindProgramARB(i, i_4_);
			if (i_3_ != 62)
				aClass127_3044 = null;
			OpenGL.glProgramStringARB(i, 34933, string);
			OpenGL.glGetIntegerv(34379, Class22.anIntArray325, 0);
			if ((Class22.anIntArray325[0] ^ 0xffffffff) != 0) {
				OpenGL.glBindProgramARB(i, 0);
				return null;
			}
			OpenGL.glBindProgramARB(i, 0);
			return new Class213(class260_sub2, i, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ts.D(" + i + ',' + i_3_ + ',' + (class260_sub2 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1428(boolean bool, Class130_Sub1 class130_sub1) {
		try {
			if (((Class130_Sub1) class130_sub1).aClass130_Sub1_3731 != null)
				class130_sub1.method1754(10009);
			anInt3043++;
			((Class130_Sub1) class130_sub1).aClass130_Sub1_3732 = ((Class220) this).aClass130_Sub1_3052;
			if (bool == true) {
				((Class130_Sub1) class130_sub1).aClass130_Sub1_3731 = (((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3731);
				((Class130_Sub1) (((Class130_Sub1) class130_sub1).aClass130_Sub1_3731)).aClass130_Sub1_3732 = class130_sub1;
				((Class130_Sub1) (((Class130_Sub1) class130_sub1).aClass130_Sub1_3732)).aClass130_Sub1_3731 = class130_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ts.H(" + bool + ',' + (class130_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class130_Sub1 method1429(int i) {
		try {
			if (i != 50)
				method1426(true);
			anInt3047++;
			Class130_Sub1 class130_sub1 = (((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3732);
			if (((Class220) this).aClass130_Sub1_3052 == class130_sub1) {
				aClass130_Sub1_3053 = null;
				return null;
			}
			aClass130_Sub1_3053 = ((Class130_Sub1) class130_sub1).aClass130_Sub1_3732;
			return class130_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.A(" + i + ')');
		}
	}

	final int method1430(int i) {
		try {
			anInt3050++;
			int i_5_ = 0;
			Class130_Sub1 class130_sub1 = (((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3732);
			while (class130_sub1 != ((Class220) this).aClass130_Sub1_3052) {
				class130_sub1 = ((Class130_Sub1) class130_sub1).aClass130_Sub1_3732;
				i_5_++;
			}
			int i_6_ = -60 / ((-23 - i) / 38);
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.B(" + i + ')');
		}
	}

	public Class220() {
		try {
			((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3731 = ((Class220) this).aClass130_Sub1_3052;
			((Class130_Sub1) ((Class220) this).aClass130_Sub1_3052).aClass130_Sub1_3732 = ((Class220) this).aClass130_Sub1_3052;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ts.<init>(" + ')');
		}
	}

	static {
		new Class67("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-m\u00eame !", "Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!");
		anInt3055 = 0;
		aClass63_Sub1Array3056 = new Class63_Sub1[0];
		GRAND_EXCHANGE_ITEM_SELECT_PACKET = new OutgoingPacket(61, 2);
		aClass4Array3057 = new Class4[16];
		anInt3058 = 0;
		aClass67_3059 = new Class67("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
	}
}
