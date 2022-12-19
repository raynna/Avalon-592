
/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class224 {
	static int anInt3077;
	private int anInt3078;
	private Class260_Sub2 aClass260_Sub2_3079;
	byte[] aByteArray3080;
	static OutgoingPacket ACTION_BUTTON10 = new OutgoingPacket(20, 8);
	static int anInt3082;
	private Class107[][] aClass107ArrayArray3083;
	static int anInt3084;
	private int anInt3085;
	int anInt3086;
	static int anInt3087;
	private int anInt3088;
	private int anInt3089;
	static int anInt3090;
	private Class210_Sub2 aClass210_Sub2_3091;
	static int anInt3092 = 0;
	static int anInt3093;
	static IncomingPacket aClass13_3094;
	static boolean aBool3095 = false;
	static Class50 aClass50_3096;

	final boolean method1440(byte i, Class246_Sub1_Sub4 class246_sub1_sub4, int i_0_, int i_1_) {
		try {
			anInt3090++;
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1 = (Class246_Sub1_Sub4_Sub1) class246_sub1_sub4;
			if (i != -128)
				method1446(111);
			i_1_ += (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7073) + 1;
			i_0_ += 1 + (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7071);
			int i_2_ = ((Class224) this).anInt3086 * i_0_ + i_1_;
			int i_3_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7068);
			int i_4_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7075);
			if ((i_0_ ^ 0xffffffff) >= -1) {
				int i_5_ = -i_0_ + 1;
				i_0_ = 1;
				i_3_ -= i_5_;
				i_2_ += i_5_ * ((Class224) this).anInt3086;
			}
			int i_6_ = -i_4_ + ((Class224) this).anInt3086;
			if (i_3_ + i_0_ >= anInt3078) {
				int i_7_ = -anInt3078 + 1 + (i_3_ + i_0_);
				i_3_ -= i_7_;
			}
			if (i_1_ <= 0) {
				int i_8_ = -i_1_ + 1;
				i_6_ += i_8_;
				i_2_ += i_8_;
				i_4_ -= i_8_;
				i_1_ = 1;
			}
			if ((i_1_ - -i_4_ ^ 0xffffffff) <= (((Class224) this).anInt3086 ^ 0xffffffff)) {
				int i_9_ = 1 + i_4_ + (i_1_ - ((Class224) this).anInt3086);
				i_6_ += i_9_;
				i_4_ -= i_9_;
			}
			if ((i_4_ ^ 0xffffffff) >= -1 || i_3_ <= 0)
				return false;
			int i_10_ = 8;
			i_6_ += (-1 + i_10_) * ((Class224) this).anInt3086;
			return Class246_Sub2.method1788(i_10_, i_2_, i_4_, -120, ((Class224) this).aByteArray3080, i_6_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uf.G(" + i + ',' + (class246_sub1_sub4 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1441(boolean bool, int i, int i_11_, boolean[][] bools, int i_12_, boolean bool_13_) {
		try {
			anInt3084++;
			aClass260_Sub2_3079.method1906(false, 90);
			aClass260_Sub2_3079.method1911(-32, false);
			aClass260_Sub2_3079.method1957(bool_13_, -2);
			aClass260_Sub2_3079.method1900(7681, 1);
			aClass260_Sub2_3079.method1958(119, 1);
			float f = 1.0F / (float) (((Class260_Sub2) aClass260_Sub2_3079).f_oe * 128);
			if (bool) {
				for (int i_14_ = 0; anInt3085 > i_14_; i_14_++) {
					int i_15_ = i_14_ << anInt3088;
					int i_16_ = 1 + i_14_ << anInt3088;
					for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (anInt3089 ^ 0xffffffff); i_17_++) {
						int i_18_ = i_17_ << anInt3088;
						int i_19_ = 1 + i_17_ << anInt3088;
						while_15_: for (int i_20_ = i_18_; i_19_ > i_20_; i_20_++) {
							if ((-i_11_ + i_20_ ^ 0xffffffff) <= (-i_12_ ^ 0xffffffff) && (i_12_ ^ 0xffffffff) <= (i_20_ - i_11_ ^ 0xffffffff)) {
								for (int i_21_ = i_15_; i_21_ < i_16_; i_21_++) {
									if (-i_12_ <= -i + i_21_ && i_12_ >= i_21_ - i && (bools[i_12_ + (i_20_ - i_11_)][i_12_ + (-i + i_21_)])) {
										OpenGL.glMatrixMode(5890);
										OpenGL.glLoadIdentity();
										OpenGL.glScalef(f, f, 1.0F);
										OpenGL.glTranslatef((float) -i_17_ / f, (float) -i_14_ / f, 1.0F);
										OpenGL.glMatrixMode(5888);
										aClass107ArrayArray3083[i_17_][i_14_].method740((byte) -33);
										break while_15_;
									}
								}
							}
						}
					}
				}
			} else {
				for (int i_22_ = 0; (anInt3085 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
					int i_23_ = i_22_ << anInt3088;
					int i_24_ = i_22_ + 1 << anInt3088;
					for (int i_25_ = 0; (anInt3089 ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
						int i_26_ = 0;
						int i_27_ = i_25_ << anInt3088;
						int i_28_ = 1 + i_25_ << anInt3088;
						BufferStream stream = Class215.aStream3001;
						((BufferStream) stream).position = 0;
						for (int i_29_ = i_23_; (i_29_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_29_++) {
							if ((-i + i_29_ ^ 0xffffffff) <= (-i_12_ ^ 0xffffffff) && i_12_ >= -i + i_29_) {
								int i_30_ = i_27_ + (((Class210) aClass210_Sub2_3091).anInt2956) * i_29_;
								for (int i_31_ = i_27_; i_31_ < i_28_; i_31_++) {
									if (((-i_12_ ^ 0xffffffff) >= (-i_11_ + i_31_ ^ 0xffffffff)) && ((i_12_ ^ 0xffffffff) <= (-i_11_ + i_31_ ^ 0xffffffff)) && (bools[i_12_ + (i_31_ + -i_11_)][i_12_ + i_29_ - i])) {
										short[] is = (((Class210_Sub2) aClass210_Sub2_3091).aShortArrayArray5021[i_30_]);
										if (is != null) {
											if (!((Class260_Sub2) aClass260_Sub2_3079).aBool4392) {
												for (int i_32_ = 0; i_32_ < is.length; i_32_++) {
													i_26_++;
													stream.method2404((byte) -74, is[i_32_] & 0xffff);
												}
											} else {
												for (int i_33_ = 0; ((i_33_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_33_++) {
													i_26_++;
													stream.writeShort((byte) 67, is[i_33_] & 0xffff);
												}
											}
										}
									}
									i_30_++;
								}
							}
						}
						if ((i_26_ ^ 0xffffffff) < -1) {
							OpenGL.glMatrixMode(5890);
							OpenGL.glLoadIdentity();
							OpenGL.glScalef(f, f, 1.0F);
							OpenGL.glTranslatef((float) -i_25_ / f, (float) -i_22_ / f, 1.0F);
							OpenGL.glMatrixMode(5888);
							aClass107ArrayArray3083[i_25_][i_22_].method741((byte) 43, ((BufferStream) stream).buffer, 5123, i_26_);
						}
					}
				}
			}
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uf.A(" + bool + ',' + i + ',' + i_11_ + ',' + (bools != null ? "{...}" : "null") + ',' + i_12_ + ',' + bool_13_ + ')'));
		}
	}

	private final void method1442(int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		do {
			try {
				anInt3077++;
				if (aClass107ArrayArray3083 != null) {
					int i_38_ = -1 + i_34_ >> 7;
					int i_39_ = -1 + (i + i_34_) - 1 >> 7;
					int i_40_ = -1 + i_36_ >> 7;
					int i_41_ = i_36_ - 1 + (i_37_ - 1) >> 7;
					for (int i_42_ = i_38_; i_39_ >= i_42_; i_42_++) {
						Class107[] class107s = aClass107ArrayArray3083[i_42_];
						for (int i_43_ = i_40_; (i_41_ ^ 0xffffffff) <= (i_43_ ^ 0xffffffff); i_43_++)
							((Class107) class107s[i_43_]).aBool1505 = true;
					}
					if (i_35_ > 97)
						break;
					method1441(true, 103, -57, null, 109, true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uf.E(" + i + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1443(int i) {
		try {
			aClass107ArrayArray3083 = new Class107[anInt3089][anInt3085];
			if (i != -1)
				method1440((byte) -121, null, -60, -97);
			anInt3082++;
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (anInt3085 ^ 0xffffffff); i_44_++) {
				for (int i_45_ = 0; anInt3089 > i_45_; i_45_++)
					aClass107ArrayArray3083[i_45_][i_44_] = new Class107(aClass260_Sub2_3079, this, aClass210_Sub2_3091, i_45_, i_44_, anInt3088, 128 * i_45_ + 1, 1 + 128 * i_44_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uf.C(" + i + ')');
		}
	}

	final void method1444(int i, int i_46_, Class246_Sub1_Sub4 class246_sub1_sub4, byte i_47_) {
		try {
			anInt3093++;
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1 = (Class246_Sub1_Sub4_Sub1) class246_sub1_sub4;
			i += 1 + (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7071);
			i_46_ += 1 + (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7073);
			int i_48_ = i * ((Class224) this).anInt3086 + i_46_;
			int i_49_ = 0;
			int i_50_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7068);
			int i_51_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7075);
			int i_52_ = -i_51_ + ((Class224) this).anInt3086;
			if (i <= 0) {
				int i_53_ = 1 + -i;
				i_49_ += i_53_ * i_51_;
				i_48_ += i_53_ * ((Class224) this).anInt3086;
				i = 1;
				i_50_ -= i_53_;
			}
			int i_54_ = 0;
			if (i - -i_50_ >= anInt3078) {
				int i_55_ = -anInt3078 + (1 + (i_50_ + i));
				i_50_ -= i_55_;
			}
			if ((i_46_ ^ 0xffffffff) >= -1) {
				int i_56_ = 1 + -i_46_;
				i_54_ += i_56_;
				i_51_ -= i_56_;
				i_48_ += i_56_;
				i_52_ += i_56_;
				i_46_ = 1;
				i_49_ += i_56_;
			}
			if ((i_46_ - -i_51_ ^ 0xffffffff) <= (((Class224) this).anInt3086 ^ 0xffffffff)) {
				int i_57_ = i_46_ + (i_51_ + (1 - ((Class224) this).anInt3086));
				i_54_ += i_57_;
				i_52_ += i_57_;
				i_51_ -= i_57_;
			}
			if ((i_51_ ^ 0xffffffff) < -1 && (i_50_ ^ 0xffffffff) < -1) {
				Class211.method1391(i_48_, ((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).aByteArray7074, i_52_, ((Class224) this).aByteArray3080, i_49_, i_51_, i_54_, (byte) -112, i_50_);
				if (i_47_ != 57)
					method1441(false, 51, 76, null, -92, true);
				method1442(i_51_, i_46_, i_47_ ^ 0x45, i, i_50_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uf.D(" + i + ',' + i_46_ + ',' + (class246_sub1_sub4 != null ? "{...}" : "null") + ',' + i_47_ + ')'));
		}
	}

	final void method1445(int i, int i_58_, int i_59_, Class246_Sub1_Sub4 class246_sub1_sub4) {
		try {
			anInt3087++;
			Class246_Sub1_Sub4_Sub1 class246_sub1_sub4_sub1 = (Class246_Sub1_Sub4_Sub1) class246_sub1_sub4;
			i_59_ += (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7073) + 1;
			i_58_ += (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7071) + 1;
			int i_60_ = i_59_ - -(((Class224) this).anInt3086 * i_58_);
			int i_61_ = 0;
			int i_62_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7068);
			int i_63_ = (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).anInt7075);
			int i_64_ = -i_63_ + ((Class224) this).anInt3086;
			if (i >= -23)
				method1441(true, 80, 63, null, 97, false);
			if ((i_58_ ^ 0xffffffff) >= -1) {
				int i_65_ = -i_58_ + 1;
				i_62_ -= i_65_;
				i_58_ = 1;
				i_61_ += i_63_ * i_65_;
				i_60_ += i_65_ * ((Class224) this).anInt3086;
			}
			int i_66_ = 0;
			if ((anInt3078 ^ 0xffffffff) >= (i_58_ + i_62_ ^ 0xffffffff)) {
				int i_67_ = -anInt3078 + (i_58_ + i_62_ + 1);
				i_62_ -= i_67_;
			}
			if (i_59_ <= 0) {
				int i_68_ = -i_59_ + 1;
				i_63_ -= i_68_;
				i_59_ = 1;
				i_64_ += i_68_;
				i_66_ += i_68_;
				i_61_ += i_68_;
				i_60_ += i_68_;
			}
			if (((Class224) this).anInt3086 <= i_59_ - -i_63_) {
				int i_69_ = -((Class224) this).anInt3086 + (i_59_ + i_63_) + 1;
				i_63_ -= i_69_;
				i_64_ += i_69_;
				i_66_ += i_69_;
			}
			if ((i_63_ ^ 0xffffffff) < -1 && i_62_ > 0) {
				Class246_Sub28_Sub33.method2862(i_62_, i_60_, (((Class224) this).aByteArray3080), i_63_, i_61_, i_66_, -1, i_64_, (((Class246_Sub1_Sub4_Sub1) class246_sub1_sub4_sub1).aByteArray7074));
				method1442(i_63_, i_59_, 99, i_58_, i_62_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uf.B(" + i + ',' + i_58_ + ',' + i_59_ + ',' + (class246_sub1_sub4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1446(int i) {
		try {
			int i_70_ = 28 % ((i + 76) / 36);
			ACTION_BUTTON10 = null;
			aClass50_3096 = null;
			aClass13_3094 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uf.F(" + i + ')');
		}
	}

	Class224(Class260_Sub2 class260_sub2, Class210_Sub2 class210_sub2) {
		try {
			aClass260_Sub2_3079 = class260_sub2;
			aClass210_Sub2_3091 = class210_sub2;
			((Class224) this).anInt3086 = ((((Class210) aClass210_Sub2_3091).anInt2956 * ((Class210) aClass210_Sub2_3091).anInt2955) >> ((Class260_Sub2) aClass260_Sub2_3079).f_re) + 2;
			anInt3078 = 2 + ((((Class210) aClass210_Sub2_3091).anInt2955 * ((Class210) aClass210_Sub2_3091).anInt2952) >> ((Class260_Sub2) aClass260_Sub2_3079).f_re);
			anInt3088 = (-((Class210) aClass210_Sub2_3091).anInt2950 + 7 + ((Class260_Sub2) aClass260_Sub2_3079).f_re);
			((Class224) this).aByteArray3080 = new byte[((Class224) this).anInt3086 * anInt3078];
			anInt3089 = ((Class210) aClass210_Sub2_3091).anInt2956 >> anInt3088;
			anInt3085 = ((Class210) aClass210_Sub2_3091).anInt2952 >> anInt3088;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uf.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + (class210_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass13_3094 = new IncomingPacket(88, -1);
	}
}
