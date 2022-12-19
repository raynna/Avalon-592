/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68 {
	private Class130 aClass130_893 = new Class130();
	static int anInt894;
	static int anInt895;
	static int anInt896;
	static int anInt897;
	static OutgoingPacket aClass201_898 = new OutgoingPacket(81, 4);
	static int anInt899;
	static int anInt900;
	static int anInt901;
	static int anInt902;
	private Class130 aClass130_903;
	static IncomingPacket aClass13_904 = new IncomingPacket(62, 8);
	static int anInt905;
	static int anInt906;

	final void method438(int i, Class130 class130) {
		try {
			anInt906++;
			if (((Class130) class130).aClass130_1816 != null)
				class130.method886(1024);
			((Class130) class130).aClass130_1815 = aClass130_893;
			((Class130) class130).aClass130_1816 = ((Class130) aClass130_893).aClass130_1816;
			((Class130) ((Class130) class130).aClass130_1816).aClass130_1815 = class130;
			int i_0_ = 43 / ((i + 76) / 36);
			((Class130) ((Class130) class130).aClass130_1815).aClass130_1816 = class130;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gn.C(" + i + ',' + (class130 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class130 method439(byte i) {
		try {
			anInt899++;
			if (i < 92)
				return null;
			Class130 class130 = ((Class130) aClass130_893).aClass130_1815;
			if (class130 == aClass130_893)
				return null;
			class130.method886(1024);
			return class130;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.E(" + i + ')');
		}
	}

	final int method440(byte i) {
		try {
			anInt897++;
			int i_1_ = 0;
			int i_2_ = -69 / ((-88 - i) / 34);
			Class130 class130 = ((Class130) aClass130_893).aClass130_1815;
			while (class130 != aClass130_893) {
				class130 = ((Class130) class130).aClass130_1815;
				i_1_++;
			}
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.D(" + i + ')');
		}
	}

	final Class130 method441(byte i) {
		try {
			anInt896++;
			Class130 class130 = ((Class130) aClass130_893).aClass130_1816;
			if (aClass130_893 == class130) {
				aClass130_903 = null;
				return null;
			}
			if (i != 110)
				aClass130_903 = null;
			aClass130_903 = ((Class130) class130).aClass130_1816;
			return class130;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.A(" + i + ')');
		}
	}

	final Class130 method442(byte i) {
		try {
			anInt901++;
			if (i > -40)
				method440((byte) -9);
			Class130 class130 = aClass130_903;
			if (class130 == aClass130_893) {
				aClass130_903 = null;
				return null;
			}
			aClass130_903 = ((Class130) class130).aClass130_1815;
			return class130;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.I(" + i + ')');
		}
	}

	final void method443(int i) {
		try {
			if (i >= 39) {
				for (;;) {
					Class130 class130 = ((Class130) aClass130_893).aClass130_1815;
					if (class130 == aClass130_893)
						break;
					class130.method886(1024);
				}
				anInt900++;
				aClass130_903 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.G(" + i + ')');
		}
	}

	public static void method444(byte i) {
		try {
			if (i == -45) {
				aClass13_904 = null;
				aClass201_898 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.H(" + i + ')');
		}
	}

	final Class130 method445(int i) {
		try {
			anInt902++;
			if (i != 62)
				method439((byte) 67);
			Class130 class130 = ((Class130) aClass130_893).aClass130_1815;
			if (aClass130_893 == class130) {
				aClass130_903 = null;
				return null;
			}
			aClass130_903 = ((Class130) class130).aClass130_1815;
			return class130;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.F(" + i + ')');
		}
	}

	final boolean method446(byte i) {
		try {
			anInt894++;
			int i_3_ = 3 / ((i + 6) / 36);
			if (aClass130_893 != ((Class130) aClass130_893).aClass130_1815)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.B(" + i + ')');
		}
	}

	public Class68() {
		try {
			((Class130) aClass130_893).aClass130_1815 = aClass130_893;
			((Class130) aClass130_893).aClass130_1816 = aClass130_893;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gn.<init>(" + ')');
		}
	}

	static {
		new Class67("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.", "Voc\u00ea foi retirado desse canal.");
	}
}
