/* Class59_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub1_Sub2 extends Class59_Sub1 implements Class_f {
	static int anInt6108;
	static int anInt6109;
	static int anInt6110;
	static int anInt6111;
	static int anInt6112;
	static int anInt6113;
	static int anInt6114;
	static int anInt6115;
	static int anInt6116;
	static int anInt6117;
	static int anInt6118;
	static int anInt6119;
	static int anInt6120;
	static int anInt6121;
	static int anInt6122;
	static int[] anIntArray6123;
	Class14 aClass14_6124;
	static int anInt6125;
	static int anInt6126;
	static Class154_Sub1[] aClass154_Sub1Array6127;
	static Class67 aClass67_6128;
	private boolean aBool6129;
	static int anInt6130;
	static int[] anIntArray6131;
	static IncomingPacket aClass13_6132;
	static int anInt6133;

	public final int method18(byte i) {
		try {
			anInt6120++;
			if (i != -70)
				method403(null, -50);
			return (((Class14) ((Class59_Sub1_Sub2) this).aClass14_6124).anInt226);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.M(" + i + ')');
		}
	}

	static final CS2Script method2569(int i, int i_0_, int i_1_, Class169 class169) {
		try {
			anInt6108++;
			int i_2_ = ((Class169) class169).anInt2406 | i_1_ << 8;
			CS2Script class246_sub1_sub1 = ((CS2Script) Class109_Sub3.aClass127_3957.method872((long) i_2_ << 16, (byte) 74));
			if (class246_sub1_sub1 != null)
				return class246_sub1_sub1;
			byte[] is = (Class246_Sub28_Sub17.index12.method109(Class246_Sub28_Sub17.index12.method104(-14943, i_2_), i ^ ~0x2d77));
			if (i != 11639)
				return null;
			if (is != null) {
				if (is.length <= 1)
					return null;
				class246_sub1_sub1 = Class122.decode((byte) -51, is);
				((CS2Script) class246_sub1_sub1).aClass169_5681 = class169;
				Class109_Sub3.aClass127_3957.method869((long) i_2_ << 16, class246_sub1_sub1, -8869);
				return class246_sub1_sub1;
			}
			i_2_ = ((Class169) class169).anInt2406 | i_0_ - -65536 << 8;
			class246_sub1_sub1 = ((CS2Script) Class109_Sub3.aClass127_3957.method872((long) i_2_ << 16, (byte) 48));
			if (class246_sub1_sub1 != null)
				return class246_sub1_sub1;
			is = (Class246_Sub28_Sub17.index12.method109(Class246_Sub28_Sub17.index12.method104(i ^ ~0x1729, i_2_), -1));
			if (is != null) {
				if (is.length <= 1)
					return null;
				class246_sub1_sub1 = Class122.decode((byte) -23, is);
				((CS2Script) class246_sub1_sub1).aClass169_5681 = class169;
				Class109_Sub3.aClass127_3957.method869((long) i_2_ << 16, class246_sub1_sub1, -8869);
				return class246_sub1_sub1;
			}
			i_2_ = 0xffff00 | ((Class169) class169).anInt2406;
			class246_sub1_sub1 = ((CS2Script) Class109_Sub3.aClass127_3957.method872((long) i_2_ << 16, (byte) 104));
			if (class246_sub1_sub1 != null)
				return class246_sub1_sub1;
			is = (Class246_Sub28_Sub17.index12.method109(Class246_Sub28_Sub17.index12.method104(-14943, i_2_), -1));
			if (is != null) {
				if ((is.length ^ 0xffffffff) >= -2)
					return null;
				class246_sub1_sub1 = Class122.decode((byte) 108, is);
				((CS2Script) class246_sub1_sub1).aClass169_5681 = class169;
				Class109_Sub3.aClass127_3957.method869((long) i_2_ << 16, class246_sub1_sub1, -8869);
				return class246_sub1_sub1;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.K(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class169 != null ? "{...}" : "null") + ')'));
		}
	}

	public final Class_t method23(Class260 class260, int i, int i_3_) {
		try {
			anInt6119++;
			int i_4_ = -124 % ((i_3_ - 54) / 56);
			return ((Class59_Sub1_Sub2) this).aClass14_6124.method147(0, false, class260, 0, i, (byte) 120, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.D(" + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')'));
		}
	}

	final void method405(int i, int i_5_, Class59 class59, byte i_6_, boolean bool, Class260 class260, int i_7_) {
		try {
			anInt6111++;
			if (i_6_ == -99)
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.L(" + i + ',' + i_5_ + ',' + (class59 != null ? "{...}" : "null") + ',' + i_6_ + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_7_ + ')'));
		}
	}

	public final void method20(boolean bool, Class260 class260) {
		try {
			anInt6126++;
			((Class59_Sub1_Sub2) this).aClass14_6124.method157(bool, class260);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.W(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method24(int i) {
		try {
			int i_8_ = 16 % ((39 - i) / 41);
			anInt6130++;
			return (((Class14) ((Class59_Sub1_Sub2) this).aClass14_6124).anInt204);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.G(" + i + ')');
		}
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				return 122;
			anInt6113++;
			return (((Class14) ((Class59_Sub1_Sub2) this).aClass14_6124).anInt222);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.F(" + bool + ')');
		}
	}

	final void method401(int i) {
		try {
			anInt6109++;
			int i_9_ = 15 % ((57 - i) / 44);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.J(" + i + ')');
		}
	}

	Class59_Sub1_Sub2(Class260 class260, Class185 class185, int i, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, int i_14_, int i_15_) {
		super(i_11_, i_12_, i_13_, ((Class185) class185).aBool2584, ((Class185) class185).aBool2601);
		try {
			((Class59_Sub1_Sub2) this).aClass14_6124 = new Class14(class260, class185, 22, i_14_, i, i_10_, i_11_, i_13_, bool, i_15_);
			aBool6129 = ((((Class185) class185).anInt2590 ^ 0xffffffff) != -1 && !bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + bool + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	public final boolean method22(int i) {
		try {
			if (i != 10869)
				aBool6129 = true;
			anInt6110++;
			return ((Class59_Sub1_Sub2) this).aClass14_6124.method153(i ^ ~0x2a75);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.V(" + i + ')');
		}
	}

	public final void method19(Class260 class260, int i) {
		try {
			if (i != -12694)
				anIntArray6123 = null;
			((Class59_Sub1_Sub2) this).aClass14_6124.method151(262144, class260);
			anInt6116++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.U(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method406(byte i) {
		try {
			anInt6112++;
			if (i < 104)
				method18((byte) -37);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.E(" + i + ')');
		}
	}

	public static void method2570(int i) {
		try {
			anIntArray6123 = null;
			aClass154_Sub1Array6127 = null;
			aClass67_6128 = null;
			aClass13_6132 = null;
			if (i != 30517)
				anIntArray6131 = null;
			anIntArray6131 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.S(" + i + ')');
		}
	}

	final boolean method409(int i, int i_16_, Class260 class260, int i_17_) {
		try {
			anInt6114++;
			Class_t class_t = (((Class59_Sub1_Sub2) this).aClass14_6124.method147(((Class59_Sub1) this).anInt4517, false, class260, ((Class59_Sub1) this).anInt4515, 131072, (byte) 124, false));
			if (i_16_ != 0)
				return false;
			if (class_t == null)
				return false;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4518, ((Class59_Sub1) this).anInt4517);
			return class_t.method685(i_17_, i, class_c, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.A(" + i + ',' + i_16_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	final void method403(Class260 class260, int i) {
		do {
			try {
				if (i < 53)
					method20(true, null);
				anInt6121++;
				Class_t class_t = (((Class59_Sub1_Sub2) this).aClass14_6124.method147(((Class59_Sub1) this).anInt4517, true, class260, ((Class59_Sub1) this).anInt4515, 262144, (byte) 125, true));
				if (class_t == null)
					break;
				int i_18_ = ((Class59_Sub1) this).anInt4515 >> 7;
				int i_19_ = ((Class59_Sub1) this).anInt4517 >> 7;
				((Class59_Sub1_Sub2) this).aClass14_6124.method155(false, i_19_, 28146, class_t, i_18_, class260, i_19_, i_18_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ft.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2571(int i) {
		do {
			try {
				anInt6122++;
				int i_20_ = 0;
				if (Class246_Sub28_Sub27.aClass39_Sub1_6759.method275(29083, BufferStream.anInt5656)) {
					i_20_ |= 0x1;
					i_20_ |= 0x10;
					i_20_ |= 0x20;
					i_20_ |= 0x2;
					i_20_ |= 0x4;
				}
				if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609)
					i_20_ |= 0x40;
				CS2Script.method2418(i_20_, i + 275);
				Class143.aClass251_2067.method1608(i_20_, false);
				Class255.aClass191_3663.method1260(i_20_, 8);
				Class179.aClass228_2518.method1458(i_20_, 1);
				Class195.aClass177_2745.method1160(i_20_, false);
				Class_o.method2954(i_20_, (byte) -94);
				Class246_Sub1_Sub15_Sub2.method2897((byte) -3, i_20_);
				Class102.method639(1, i_20_);
				Class59_Sub3_Sub1.method2442(i ^ i, i_20_);
				if ((Class225.anInt3103 ^ 0xffffffff) == -11)
					Class99.method622((byte) -126, 28);
				else {
					if (Class225.anInt3103 != 30)
						break;
					Class99.method622((byte) -2, 25);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ft.R(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2572(int i, int i_21_, int i_22_, int i_23_) {
		try {
			int i_24_ = 110 % ((i + 38) / 52);
			anInt6115++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_21_, (byte) 125, 9);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_23_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ft.C(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt6117++;
			Class_t class_t = (((Class59_Sub1_Sub2) this).aClass14_6124.method147(((Class59_Sub1) this).anInt4517, true, class260, ((Class59_Sub1) this).anInt4515, 2048, (byte) 123, false));
			if (class_t == null)
				return null;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub1) this).anInt4515, ((Class59_Sub1) this).anInt4518, ((Class59_Sub1) this).anInt4517);
			Class130_Sub3 class130_sub3 = null;
			if (aBool6129)
				class130_sub3 = Class18.method177(1, (byte) -95);
			do {
				if ((((Class14) ((Class59_Sub1_Sub2) this).aClass14_6124).aClass130_Sub2_214) != null) {
					Class129 class129 = ((Class14) ((Class59_Sub1_Sub2) this).aClass14_6124).aClass130_Sub2_214.method1779();
					class260.method1703(class_t, class129, class_c, (class130_sub3 == null ? null : (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0])), 0);
					if (!client.f_ob)
						break;
				}
				class_t.method680(class_c, (class130_sub3 != null ? (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0]) : null), 0);
			} while (false);
			int i_25_ = ((Class59_Sub1) this).anInt4515 >> 7;
			if (i >= -87)
				method20(false, null);
			int i_26_ = ((Class59_Sub1) this).anInt4517 >> 7;
			((Class59_Sub1_Sub2) this).aClass14_6124.method155(true, i_26_, 28146, class_t, i_25_, class260, i_26_, i_25_);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ft.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final void method9(int i) {
		do {
			try {
				anInt6118++;
				if (i <= -18)
					break;
				method2572(-90, 25, -73, 79);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ft.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		new Class67("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...", "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
		anInt6125 = 0;
		aClass154_Sub1Array6127 = new Class154_Sub1[ClientLoader.MAX_INDEX_COUNT];
		aClass67_6128 = new Class67("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados");
		aClass13_6132 = new IncomingPacket(20, 12);
		anInt6133 = 0;
	}
}
