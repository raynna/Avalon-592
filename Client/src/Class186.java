/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 {
	static int anInt2635;
	static Class81 aClass81_2636 = new Class81(10, 2, 2, 0);
	static Class67 aClass67_2637;
	static int anInt2638;
	static int[] anIntArray2639 = new int[100];

	static final void method1219(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				do {
					if ((i ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						Class135.method918(i, -99, i_1_, i_2_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_0_]));
						if (!client.f_ob)
							break;
					}
					Class135.method918(i_2_, i_3_ - 75, i_1_, i, (Class246_Sub28_Sub6.anIntArrayArray6042[i_0_]));
				} while (false);
				anInt2638++;
				if (i_3_ == 10)
					break;
				aClass81_2636 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rf.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1220(byte i) {
		do {
			try {
				aClass67_2637 = null;
				aClass81_2636 = null;
				anIntArray2639 = null;
				if (i == -46)
					break;
				anIntArray2639 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rf.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1221(byte i, BufferStream stream) {
		try {
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class246_Sub4.anInt3863 ^ 0xffffffff); i_4_++) {
				int i_5_ = stream.readSmart((byte) 88);
				int i_6_ = stream.readUnsignedShort((byte) -30);
				if ((i_6_ ^ 0xffffffff) == -65536)
					i_6_ = -1;
				if (Class230.aClass63_Sub1Array3154[i_5_] != null)
					((Class63) Class230.aClass63_Sub1Array3154[i_5_]).anInt855 = i_6_;
			}
			if (i != -47)
				method1219(85, 119, 68, 110, 126);
			anInt2635++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rf.B(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass67_2637 = (new Class67("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados."));
	}
}
