/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14 {
	static int anInt191;
	static int anInt192;
	static int anInt193;
	private byte aByte194;
	static int anInt195;
	private Class124 aClass124_196;
	private int anInt197;
	static int anInt198;
	private Class246_Sub1_Sub4 aClass246_Sub1_Sub4_199;
	private int anInt200;
	static boolean aBool201 = false;
	private boolean aBool202 = false;
	private boolean[] aBoolArray203;
	int anInt204;
	private int anInt205;
	private Class_t aClass_t206;
	private int anInt207;
	private int anInt208 = -1;
	static int anInt209;
	static int anInt210;
	private boolean aBool211;
	private byte aByte212;
	static int anInt213;
	Class130_Sub2 aClass130_Sub2_214;
	private int anInt215;
	private int anInt216;
	static int anInt217;
	static Class182 aClass182_218;
	static int anInt219;
	static int anInt220;
	private boolean aBool221 = false;
	int anInt222;
	private int anInt223;
	static int anInt224;
	static Class235[][] aClass235ArrayArray225;
	int anInt226;
	private int anInt227;
	static int anInt228;

	public static void method145(int i) {
		try {
			aClass182_218 = null;
			if (i >= 96)
				aClass235ArrayArray225 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.D(" + i + ')');
		}
	}

	static final Class246_Sub34 method146(int i, Class_fs class_fs, int i_0_) {
		try {
			anInt228++;
			byte[] is = class_fs.method109(i, -1);
			if (i_0_ != 0)
				return null;
			if (is == null)
				return null;
			return new Class246_Sub34(is);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bi.C(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final Class_t method147(int i, boolean bool, Class260 class260, int i_1_, int i_2_, byte i_3_, boolean bool_4_) {
		try {
			anInt198++;
			Class185 class185 = Class143.aClass251_2067.method1610(((Class14) this).anInt222, 0);
			if (((Class185) class185).f_bb != null)
				class185 = class185.method1205(Class246_Sub28_Sub23.aClass95_6658, (byte) 124);
			if (class185 == null) {
				method157(true, class260);
				anInt208 = -1;
				anInt205 = anInt207;
				return null;
			}
			if (!aBool202 && ((((Class185) class185).anInt2607 ^ 0xffffffff) != (anInt208 ^ 0xffffffff))) {
				aClass_t206 = null;
				method148(-1, (byte) 21);
			}
			method154(-90, i, i_1_);
			bool = bool & (aBool211 & Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) != 0);
			bool = bool & (anInt208 != ((Class185) class185).anInt2607 || ((anInt207 != anInt205 || (aClass124_196 != null && (((Class124) aClass124_196).aBool1725 || OutputStream_Sub1.aBool4488) && anInt207 != anInt227)) && (Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) ^ 0xffffffff) <= -3));
			if (bool_4_ && !bool) {
				anInt205 = anInt207;
				anInt208 = ((Class185) class185).anInt2607;
				return null;
			}
			if (bool)
				Class246_Sub12.method1980(aClass246_Sub1_Sub4_199, aByte212, anInt215, anInt216, aBoolArray203);
			Class210 class210 = Class59_Sub3_Sub4.aClass210Array6993[aByte212];
			Class210 class210_5_;
			if (!aBool221)
				class210_5_ = ((aByte212 ^ 0xffffffff) > -4 ? Class59_Sub3_Sub4.aClass210Array6993[1 + aByte212] : null);
			else
				class210_5_ = Class246_Sub28_Sub3.aClass210Array5899[0];
			Class_t class_t = null;
			if (aClass124_196 != null) {
				if (bool)
					i_2_ |= 0x40000;
				class_t = class185.method1215((byte) -78, (((Class14) this).anInt204 != 11 ? ((Class14) this).anInt204 : 10), class210.a(anInt215, anInt216), anInt197, anInt207, class260, aClass124_196, anInt227, anInt215, ((((Class14) this).anInt204 ^ 0xffffffff) != -12 ? ((Class14) this).anInt226 : 4 + ((Class14) this).anInt226), anInt216, i_2_, class210_5_, class210);
				if (class_t != null) {
					if (bool) {
						if (aBoolArray203 == null)
							aBoolArray203 = new boolean[4];
						aClass246_Sub1_Sub4_199 = class_t.fa(aClass246_Sub1_Sub4_199);
						Class29.method230(aClass246_Sub1_Sub4_199, aByte212, i_1_, i, aBoolArray203);
					}
					anInt200 = class_t.MA();
				} else {
					aClass246_Sub1_Sub4_199 = null;
					aBoolArray203 = null;
					anInt200 = 0;
				}
				aClass_t206 = null;
			} else if (aClass_t206 == null || i_2_ != (aClass_t206.P() & i_2_) || anInt208 != ((Class185) class185).anInt2607) {
				if (aClass_t206 != null)
					i_2_ |= aClass_t206.P();
				Class133 class133 = class185.method1210(class260, anInt215, 3, i_2_, class210.a(anInt215, anInt216), bool, (((Class14) this).anInt204 == 11 ? ((Class14) this).anInt226 + 4 : ((Class14) this).anInt226), class210_5_, anInt216, ((((Class14) this).anInt204 ^ 0xffffffff) != -12 ? ((Class14) this).anInt204 : 10), class210);
				if (class133 != null) {
					aClass_t206 = class_t = ((Class133) class133).aClass_t1837;
					if (bool) {
						aBoolArray203 = null;
						aClass246_Sub1_Sub4_199 = ((Class133) class133).aClass246_Sub1_Sub4_1835;
						Class29.method230(aClass246_Sub1_Sub4_199, aByte212, i_1_, i, null);
					}
					anInt200 = class_t.MA();
				} else {
					anInt200 = 0;
					aBoolArray203 = null;
					aClass_t206 = null;
					aClass246_Sub1_Sub4_199 = null;
				}
			} else
				class_t = aClass_t206;
			if (i_3_ <= 117)
				return null;
			anInt208 = ((Class185) class185).anInt2607;
			anInt215 = i_1_;
			anInt205 = anInt207;
			anInt216 = i;
			return class_t;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bi.M(" + i + ',' + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool_4_ + ')'));
		}
	}

	private final void method148(int i, byte i_6_) {
		try {
			anInt209++;
			int i_7_ = i;
			boolean bool = false;
			if ((i_7_ ^ 0xffffffff) == 0) {
				Class185 class185 = Class143.aClass251_2067.method1610(((Class14) this).anInt222, 0);
				Class185 class185_8_ = class185;
				if (((Class185) class185).f_bb != null)
					class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) 99);
				if (class185 == null)
					return;
				if (class185_8_ == class185)
					class185_8_ = null;
				if (((Class185) class185).anIntArray2586 != null) {
					if (aClass124_196 != null && class185.method1204(0, (((Class124) aClass124_196).anInt1742)))
						return;
					i_7_ = class185.method1209((byte) -59);
					if (anInt208 != ((Class185) class185).anInt2607)
						bool = ((Class185) class185).f_ab;
				} else if ((((Class185) class185).f_pb ^ 0xffffffff) == 0) {
					if (class185_8_ != null && ((Class185) class185_8_).anIntArray2586 != null) {
						if (aClass124_196 != null && class185_8_.method1204(i_6_ - 21, (((Class124) aClass124_196).anInt1742)))
							return;
						i_7_ = class185_8_.method1209((byte) -113);
						if ((anInt208 ^ 0xffffffff) != (((Class185) class185_8_).anInt2607 ^ 0xffffffff))
							bool = ((Class185) class185_8_).f_ab;
					} else if (class185_8_ != null && ((Class185) class185_8_).f_pb != -1 && (((Class185) class185_8_).anInt2607 ^ 0xffffffff) != (anInt208 ^ 0xffffffff)) {
						i_7_ = ((Class185) class185_8_).f_pb;
						bool = ((Class185) class185_8_).f_ab;
					}
				} else if (((Class185) class185).anInt2607 != anInt208) {
					i_7_ = ((Class185) class185).f_pb;
					bool = ((Class185) class185).f_ab;
				}
			}
			if ((i_7_ ^ 0xffffffff) == 0)
				aClass124_196 = null;
			else {
				aClass_t206 = null;
				if (aClass124_196 != null && ((((Class124) aClass124_196).anInt1742 ^ 0xffffffff) == (i_7_ ^ 0xffffffff))) {
					if (((Class124) aClass124_196).anInt1737 == 0)
						return;
				} else
					aClass124_196 = Class59_Sub3_Sub3.aClass45_6275.method304(i_6_ - 18, i_7_);
				if (((Class124) aClass124_196).anIntArray1724 == null)
					aClass124_196 = null;
				else {
					if (!bool) {
						anInt197 = 1;
						anInt207 = 0;
					} else {
						anInt207 = (int) ((double) (((Class124) aClass124_196).anIntArray1724).length * Math.random());
						anInt197 = 1 - -(int) (Math.random() * (double) (((Class124) aClass124_196).anIntArray1745[anInt207]));
					}
					anInt227 = 1 + anInt207;
					if (i_6_ != 21)
						aBool221 = true;
					if ((anInt227 ^ 0xffffffff) > -1 || (((Class124) aClass124_196).anIntArray1724.length ^ 0xffffffff) >= (anInt227 ^ 0xffffffff))
						anInt227 = -1;
					anInt223 = Class246_Sub1_Sub4.anInt5752 - anInt197;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.H(" + i + ',' + i_6_ + ')');
		}
	}

	final int method149(byte i) {
		try {
			int i_9_ = -37 % ((i + 51) / 47);
			anInt210++;
			return anInt200;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.K(" + i + ')');
		}
	}

	static final float method150(byte i, float f) {
		try {
			anInt191++;
			if (i != 126)
				return -0.04606044F;
			return (10.0F + f * (6.0F * f - 15.0F)) * (f * f * f);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.F(" + i + ',' + f + ')');
		}
	}

	final void method151(int i, Class260 class260) {
		try {
			anInt219++;
			method147(anInt216, true, class260, anInt215, i, (byte) 119, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bi.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method152(Actor class_r, int i) {
		do {
			try {
				anInt220++;
				int i_10_ = (((Actor) class_r).anInt6422 + -Class246_Sub1_Sub4.anInt5752);
				int i_11_ = (128 * ((Actor) class_r).f_nb + 64 * class_r.method2670((byte) 127));
				int i_12_ = (((Actor) class_r).f_wb * 128 - -(class_r.method2670((byte) 127) * 64));
				((Class59_Sub3) class_r).anInt5059 += (-((Class59_Sub3) class_r).anInt5059 + i_12_) / i_10_;
				((Actor) class_r).f_kc = 0;
				((Class59_Sub3) class_r).anInt5060 += (-((Class59_Sub3) class_r).anInt5060 + i_11_) / i_10_;
				if ((((Actor) class_r).f_lb ^ 0xffffffff) == -1)
					class_r.method2662(8192, false);
				if (((Actor) class_r).f_lb == 1)
					class_r.method2662(12288, false);
				if (i != 24068)
					method145(-81);
				if ((((Actor) class_r).f_lb ^ 0xffffffff) == -3)
					class_r.method2662(0, false);
				if ((((Actor) class_r).f_lb ^ 0xffffffff) != -4)
					break;
				class_r.method2662(4096, false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bi.I(" + (class_r != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method153(int i) {
		try {
			if (i != -1)
				anInt208 = 58;
			anInt193++;
			return aBool211;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.G(" + i + ')');
		}
	}

	private final void method154(int i, int i_13_, int i_14_) {
		try {
			if (i > -87)
				method149((byte) -45);
			anInt195++;
			int i_15_;
			while_214_: for (;;) {
				if (aClass124_196 == null) {
					if (aBool202)
						return;
					method148(-1, (byte) 21);
					if (aClass124_196 == null)
						return;
				}
				i_15_ = -anInt223 + Class246_Sub1_Sub4.anInt5752;
				if (i_15_ > 100 && ((Class124) aClass124_196).anInt1731 > 0) {
					int i_16_;
					for (i_16_ = ((((Class124) aClass124_196).anIntArray1724).length - ((Class124) aClass124_196).anInt1731); i_16_ > anInt207 && ((i_15_ ^ 0xffffffff) < ((((Class124) aClass124_196).anIntArray1745[anInt207]) ^ 0xffffffff)); anInt207++)
						i_15_ -= (((Class124) aClass124_196).anIntArray1745[anInt207]);
					if ((anInt207 ^ 0xffffffff) <= (i_16_ ^ 0xffffffff)) {
						int i_17_ = 0;
						for (int i_18_ = i_16_; ((((Class124) aClass124_196).anIntArray1724.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
							i_17_ += (((Class124) aClass124_196).anIntArray1745[i_18_]);
						i_15_ %= i_17_;
					}
					anInt227 = 1 + anInt207;
					if ((((Class124) aClass124_196).anIntArray1724.length ^ 0xffffffff) >= (anInt227 ^ 0xffffffff)) {
						anInt227 -= ((Class124) aClass124_196).anInt1731;
						if (anInt227 < 0 || ((((Class124) aClass124_196).anIntArray1724).length ^ 0xffffffff) >= (anInt227 ^ 0xffffffff))
							anInt227 = -1;
					}
				}
				for (;;) {
					if ((i_15_ ^ 0xffffffff) >= (((Class124) aClass124_196).anIntArray1745[anInt207] ^ 0xffffffff))
						break while_214_;
					Class246_Sub1_Sub2.method2424(i_14_, anInt207, aByte194, i_13_, true, aClass124_196, false);
					i_15_ -= ((Class124) aClass124_196).anIntArray1745[anInt207];
					anInt207++;
					if ((anInt207 ^ 0xffffffff) <= (((Class124) aClass124_196).anIntArray1724.length ^ 0xffffffff)) {
						anInt207 -= ((Class124) aClass124_196).anInt1731;
						if (anInt207 < 0 || ((anInt207 ^ 0xffffffff) <= ((((Class124) aClass124_196).anIntArray1724).length ^ 0xffffffff))) {
							aClass124_196 = null;
							break;
						}
					}
					anInt227 = 1 + anInt207;
					if (((Class124) aClass124_196).anIntArray1724.length <= anInt227) {
						anInt227 -= ((Class124) aClass124_196).anInt1731;
						if (anInt227 < 0 || (((Class124) aClass124_196).anIntArray1724).length <= anInt227)
							anInt227 = -1;
					}
				}
			}
			anInt197 = i_15_;
			anInt223 = Class246_Sub1_Sub4.anInt5752 + -i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bi.L(" + i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method155(boolean bool, int i, int i_19_, Class_t class_t, int i_20_, Class260 class260, int i_21_, int i_22_) {
		do {
			try {
				anInt224++;
				Class19[] class19s = class_t.method672();
				if (i_19_ != 28146)
					method151(-15, null);
				Class162[] class162s = class_t.method676();
				if ((((Class14) this).aClass130_Sub2_214 == null || (((Class130_Sub2) ((Class14) this).aClass130_Sub2_214).aBool3789)) && (class19s != null || class162s != null)) {
					Class185 class185 = Class143.aClass251_2067.method1610(((Class14) this).anInt222, 0);
					if (((Class185) class185).f_bb != null)
						class185 = class185.method1205((Class246_Sub28_Sub23.aClass95_6658), (byte) -29);
					if (class185 != null)
						((Class14) this).aClass130_Sub2_214 = new Class130_Sub2(Class246_Sub1_Sub4.anInt5752);
				}
				if (((Class14) this).aClass130_Sub2_214 == null)
					break;
				do {
					if (!bool) {
						((Class14) this).aClass130_Sub2_214.method1776((long) Class246_Sub1_Sub4.anInt5752);
						if (!client.f_ob)
							break;
					}
					((Class14) this).aClass130_Sub2_214.method1777(class260, (long) Class246_Sub1_Sub4.anInt5752, class19s, class162s, false);
				} while (false);
				((Class14) this).aClass130_Sub2_214.method1782(aByte194, i_22_, i_20_, i, i_21_);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bi.B(" + bool + ',' + i + ',' + i_19_ + ',' + (class_t != null ? "{...}" : "null") + ',' + i_20_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	final void method156(int i, int i_23_) {
		do {
			try {
				anInt192++;
				aBool202 = true;
				method148(i, (byte) 21);
				if (i_23_ == 8192)
					break;
				anInt215 = 53;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bi.J(" + i + ',' + i_23_ + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() {
		try {
			if (((Class14) this).aClass130_Sub2_214 != null)
				((Class14) this).aClass130_Sub2_214.method1774();
			anInt213++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bi.finalize(" + ')');
		}
	}

	Class14(Class260 class260, Class185 class185, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool, int i_29_) {
		anInt200 = -32768;
		anInt205 = -1;
		try {
			((Class14) this).anInt226 = i_24_;
			((Class14) this).anInt222 = ((Class185) class185).anInt2607;
			aBool221 = bool;
			aByte194 = (byte) i_25_;
			anInt215 = i_27_;
			anInt216 = i_28_;
			((Class14) this).anInt204 = i;
			aByte212 = (byte) i_26_;
			aBool211 = (class260.method1683() && ((Class185) class185).aBool2583 && !aBool221);
			if (i_29_ != -1)
				aBool202 = true;
			method148(i_29_, (byte) 21);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bi.<init>(" + (class260 != null ? "{...}" : "null") + ',' + (class185 != null ? "{...}" : "null") + ',' + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + bool + ',' + i_29_ + ')'));
		}
	}

	final void method157(boolean bool, Class260 class260) {
		do {
			try {
				anInt217++;
				if (aClass246_Sub1_Sub4_199 != null) {
					Class246_Sub12.method1980(aClass246_Sub1_Sub4_199, aByte212, anInt215, anInt216, aBoolArray203);
					aClass246_Sub1_Sub4_199 = null;
					aBoolArray203 = null;
				}
				if (bool == true)
					break;
				aBool202 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bi.E(" + bool + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
