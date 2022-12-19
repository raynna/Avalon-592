
/* Class246_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.Random;

final class Class246_Sub34 extends Node {
	static int anInt5125;
	byte[] aByteArray5126;
	static int anInt5127;
	private int[] anIntArray5128;
	static int anInt5129;
	byte[] aByteArray5130;
	byte[] aByteArray5131;
	static int anInt5132;
	Class246_Sub3_Sub1[] aClass246_Sub3_Sub1Array5133;
	static int anInt5134;
	static int anInt5135;
	int anInt5136;
	short[] aShortArray5137;
	Class239[] aClass239Array5138;
	static int anInt5139;
	static boolean aBool5140 = false;
	static Class68 aClass68_5141 = new Class68();
	static int anInt5142;
	static Class85 aClass85_5143 = new Class85(8);
	static Random aRandom5144 = new Random();
	static boolean aBool5145;
	static int anInt5146 = 1;

	public static void method2195(int i) {
		try {
			aClass68_5141 = null;
			if (i != 32410)
				method2196((byte) 51, null);
			aRandom5144 = null;
			aClass85_5143 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qh.G(" + i + ')');
		}
	}

	static final int method2196(byte i, Npc class_r_sub2) {
		try {
			anInt5139++;
			Class253 class253 = ((Npc) class_r_sub2).aClass253_7184;
			if (((Class253) class253).anIntArray3594 != null) {
				class253 = class253.method1624(false, Class246_Sub28_Sub23.aClass95_6658);
				if (class253 == null)
					return -1;
			}
			if (i != -26)
				return -112;
			int i_0_ = ((Class253) class253).anInt3575;
			Class135 class135 = class_r_sub2.method2676(i + 25);
			if (((Actor) class_r_sub2).aBool6450)
				i_0_ = ((Class253) class253).anInt3586;
			else if ((((Actor) class_r_sub2).anInt6470 != ((Class135) class135).anInt1894) && (((Class135) class135).anInt1880 != ((Actor) class_r_sub2).anInt6470) && (((Class135) class135).anInt1890 != ((Actor) class_r_sub2).anInt6470) && (((Actor) class_r_sub2).anInt6470 != ((Class135) class135).anInt1914)) {
				if ((((Actor) class_r_sub2).anInt6470 == ((Class135) class135).anInt1892) || (((Class135) class135).anInt1908 == ((Actor) class_r_sub2).anInt6470) || ((((Actor) class_r_sub2).anInt6470 ^ 0xffffffff) == (((Class135) class135).anInt1917 ^ 0xffffffff)) || (((Class135) class135).anInt1900 == ((Actor) class_r_sub2).anInt6470))
					i_0_ = ((Class253) class253).anInt3583;
			} else
				i_0_ = ((Class253) class253).anInt3589;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qh.F(" + i + ',' + (class_r_sub2 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2197(int i) {
		try {
			anIntArray5128 = null;
			if (i == 0)
				anInt5129++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qh.H(" + i + ')');
		}
	}

	static final int method2198(int i, int i_1_, int i_2_) {
		try {
			anInt5127++;
			if (i != 26723)
				method2195(81);
			if (i_2_ == 4 || (i_2_ ^ 0xffffffff) == -6)
				return Class246_Sub29.anIntArray4980[0x3 & i_1_];
			return 256;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qh.A(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method2199(byte i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt5142++;
			Class29[] class29s = Class166.aClass29Array2347;
			for (int i_9_ = 0; i_9_ < class29s.length; i_9_++) {
				Class29 class29 = class29s[i_9_];
				if (class29 != null && ((Class29) class29).anInt391 == 2) {
					Class246_Sub1_Sub16.method2746(i_3_, ((Class29) class29).anInt392, ((Class29) class29).anInt394, ((Class29) class29).anInt386, 2 * ((Class29) class29).anInt396, i_6_ >> 1, (byte) 41, i_5_ >> 1, i_7_);
					if (Class257.anIntArray3689[0] > -1 && ((Class246_Sub1_Sub4.anInt5752 % 20 ^ 0xffffffff) > -11))
						Class_cs.aClass_lArray7146[((Class29) class29).anInt385].method729(i_8_ - -Class257.anIntArray3689[0] - 12, i_4_ + (Class257.anIntArray3689[1] - 28));
				}
			}
			int i_10_ = -29 % ((i + 67) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qh.D(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method2200(boolean bool, Npc class_r_sub2, boolean bool_11_) {
		do {
			try {
				anInt5134++;
				if (Class230.anInt3147 < 400 && bool_11_ == false) {
					Class253 class253 = ((Npc) class_r_sub2).aClass253_7184;
					if (((Class253) class253).anIntArray3594 != null) {
						class253 = class253.method1624(false, (Class246_Sub28_Sub23.aClass95_6658));
						if (class253 == null)
							break;
					}
					if (((Class253) class253).aBool3596) {
						String string = ((Class253) class253).f_db;
						if (((Class253) class253).f_lb != 0) {
							String string_12_ = ((Class59_Sub4_Sub3.aClass101_6943 == Class40_Sub6.aClass101_5092) ? Class246_Sub1.aClass67_3748.method436(true, Class_j.anInt1485) : Class38_Sub1.aClass67_5105.method436(true, Class_j.anInt1485));
							string = (string + (Class246_Sub27.method2122(((Player) Class_a.aClass_r_Sub1_1180).f_qd, !bool_11_, ((Class253) class253).f_lb)) + " (" + string_12_ + ((Class253) class253).f_lb + ")");
						}
						if (!Class187.aBool2653) {
							if (!bool) {
								String[] strings = ((Class253) class253).aStringArray3604;
								if (Class238.aBool3359)
									strings = Class102_Sub1.method2009(5, strings);
								if (strings != null) {
									for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
										if (strings[i] != null && (((Class59_Sub4_Sub3.aClass101_6943) != (Class246_Sub28_Sub16.aClass101_6394)) || !(strings[i].equalsIgnoreCase(Class246_Sub11.aClass67_4107.method436(true, Class_j.anInt1485))))) {
											int i_13_ = 0;
											int i_14_ = Class109.anInt1568;
											if (i == 0)
												i_13_ = 11;
											if (i == 1)
												i_13_ = 15;
											if (i == 2)
												i_13_ = 21;
											if ((i ^ 0xffffffff) == -4)
												i_13_ = 3;
											if ((i ^ 0xffffffff) == -5)
												i_13_ = 50;
											if (((Class253) class253).anInt3580 == i)
												i_14_ = (((Class253) class253).f_pb);
											if (i == (((Class253) class253).anInt3606))
												i_14_ = (((Class253) class253).f_bb);
											Class259_Sub2_Sub1.method2846(i_13_, (byte) -55, false, (long) ((Actor) class_r_sub2).f_db, 0, "<col=ffff00>" + string, true, strings[i], 0, -1, i_14_);
											Class40_Sub6.anInt5094++;
										}
									}
								}
								if ((Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394) && strings != null) {
									for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
										if (strings[i] != null && (strings[i].equalsIgnoreCase(Class246_Sub11.aClass67_4107.method436(true, Class_j.anInt1485)))) {
											short i_15_ = 0;
											if ((((Class253) class253).f_lb ^ 0xffffffff) < (((Player) (Class_a.aClass_r_Sub1_1180)).f_qd ^ 0xffffffff))
												i_15_ = (short) 2000;
											short i_16_ = 0;
											if (i == 0)
												i_16_ = (short) 11;
											if ((i ^ 0xffffffff) == -2)
												i_16_ = (short) 15;
											if (i == 2)
												i_16_ = (short) 21;
											if ((i ^ 0xffffffff) == -4)
												i_16_ = (short) 3;
											if (i == 4)
												i_16_ = (short) 50;
											if (i_16_ != 0)
												i_16_ += i_15_;
											Class246_Sub23.anInt4818++;
											Class259_Sub2_Sub1.method2846(i_16_, (byte) -55, false, (long) ((Actor) class_r_sub2).f_db, 0, "<col=ffff00>" + string, true, strings[i], 0, -1, (((Class253) class253).anInt3592));
										}
									}
								}
							}
							Class259_Sub2_Sub1.method2846(1003, (byte) -55, bool, (long) ((Actor) class_r_sub2).f_db, 0, "<col=ffff00>" + string, true, Class246_Sub1_Sub3.aClass67_5721.method436(!bool_11_, Class_j.anInt1485), 0, -1, Class106_Sub1.anInt4174);
							Class106_Sub1.anInt4171++;
						} else {
							if (bool)
								break;
							Class118 class118 = (Class109_Sub1.anInt3754 != -1 ? (Class246_Sub1_Sub10.f_eb.method1085((byte) 122, Class109_Sub1.anInt3754)) : null);
							if ((0x2 & Node.anInt3469 ^ 0xffffffff) == -1)
								break;
							if (class118 == null || (class253.method1632((((Class118) class118).anInt1634), (Class109_Sub1.anInt3754), 0) != ((Class118) class118).anInt1634)) {
								Stream_Sub2.anInt6186++;
								Class259_Sub2_Sub1.method2846(22, (byte) -55, false, (long) ((Actor) class_r_sub2).f_db, 0, (Class246_Sub7.aString3964 + " -> <col=ffff00>" + string), true, Class218.aString3026, 0, -1, Class147.anInt2148);
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("qh.C(" + bool + ',' + (class_r_sub2 != null ? "{...}" : "null") + ',' + bool_11_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class256 method2201(byte i, Class260_Sub2 class260_sub2, int i_17_, String string) {
		try {
			anInt5132++;
			long l = OpenGL.glCreateShaderObjectARB(i_17_);
			OpenGL.glShaderSourceARB(l, string);
			OpenGL.glCompileShaderARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35713, Class196.anIntArray2749, 0);
			if (i != 121)
				return null;
			if ((Class196.anIntArray2749[0] ^ 0xffffffff) == -1) {
				if ((Class196.anIntArray2749[0] ^ 0xffffffff) == -1)
					System.out.println("Shader compile failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716, Class196.anIntArray2749, 1);
				if (Class196.anIntArray2749[1] > 1) {
					byte[] is = new byte[Class196.anIntArray2749[1]];
					OpenGL.glGetInfoLogARB(l, Class196.anIntArray2749[1], Class196.anIntArray2749, 0, is, 0);
					System.out.println(new String(is));
				}
				if ((Class196.anIntArray2749[0] ^ 0xffffffff) == -1) {
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class256(class260_sub2, l, i_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qh.B(" + i + ',' + (class260_sub2 != null ? "{...}" : "null") + ',' + i_17_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2202(Class155 class155, int i, byte[] is, int[] is_18_) {
		try {
			if (i != 18621)
				method2201((byte) -56, null, 69, null);
			anInt5125++;
			boolean bool = true;
			int i_19_ = 0;
			Class246_Sub3_Sub1 class246_sub3_sub1 = null;
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -129; i_20_++) {
				if (is == null || (is[i_20_] ^ 0xffffffff) != -1) {
					int i_21_ = anIntArray5128[i_20_];
					if ((i_21_ ^ 0xffffffff) != -1) {
						if (i_21_ != i_19_) {
							i_19_ = i_21_;
							i_21_--;
							if ((0x1 & i_21_ ^ 0xffffffff) == -1)
								class246_sub3_sub1 = class155.method1030(is_18_, -1903291760, i_21_ >> 2);
							else
								class246_sub3_sub1 = class155.method1027(is_18_, i_21_ >> 2, 2509);
							if (class246_sub3_sub1 == null)
								bool = false;
						}
						if (class246_sub3_sub1 != null) {
							((Class246_Sub34) this).aClass246_Sub3_Sub1Array5133[i_20_] = class246_sub3_sub1;
							anIntArray5128[i_20_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qh.E(" + (class155 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_18_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub34() {
		/* empty */
	}

	Class246_Sub34(byte[] is) {
		try {
			((Class246_Sub34) this).aShortArray5137 = new short[128];
			((Class246_Sub34) this).aByteArray5130 = new byte[128];
			((Class246_Sub34) this).aClass246_Sub3_Sub1Array5133 = new Class246_Sub3_Sub1[128];
			((Class246_Sub34) this).aByteArray5126 = new byte[128];
			((Class246_Sub34) this).aClass239Array5138 = new Class239[128];
			anIntArray5128 = new int[128];
			((Class246_Sub34) this).aByteArray5131 = new byte[128];
			BufferStream stream = new BufferStream(is);
			int i;
			for (i = 0; (((BufferStream) stream).buffer[((BufferStream) stream).position - -i] ^ 0xffffffff) != -1; i++) {
				/* empty */
			}
			byte[] is_22_ = new byte[i];
			for (int i_23_ = 0; i_23_ < i; i_23_++)
				is_22_[i_23_] = stream.readByte(false);
			i++;
			((BufferStream) stream).position++;
			int i_24_ = ((BufferStream) stream).position;
			((BufferStream) stream).position += i;
			int i_25_;
			for (i_25_ = 0; (((((BufferStream) stream).buffer[i_25_ + ((BufferStream) stream).position]) ^ 0xffffffff) != -1); i_25_++) {
				/* empty */
			}
			byte[] is_26_ = new byte[i_25_];
			for (int i_27_ = 0; (i_25_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
				is_26_[i_27_] = stream.readByte(false);
			((BufferStream) stream).position++;
			i_25_++;
			int i_28_ = ((BufferStream) stream).position;
			((BufferStream) stream).position += i_25_;
			int i_29_;
			for (i_29_ = 0; (((((BufferStream) stream).buffer[((BufferStream) stream).position - -i_29_]) ^ 0xffffffff) != -1); i_29_++) {
				/* empty */
			}
			byte[] is_30_ = new byte[i_29_];
			for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_31_++)
				is_30_[i_31_] = stream.readByte(false);
			((BufferStream) stream).position++;
			byte[] is_32_ = new byte[++i_29_];
			int i_33_;
			if ((i_29_ ^ 0xffffffff) < -2) {
				is_32_[1] = (byte) 1;
				int i_34_ = 1;
				i_33_ = 2;
				for (int i_35_ = 2; (i_35_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_35_++) {
					int i_36_ = stream.readUnsignedByte(255);
					if (i_36_ == 0)
						i_34_ = i_33_++;
					else {
						if (i_36_ <= i_34_)
							i_36_--;
						i_34_ = i_36_;
					}
					is_32_[i_35_] = (byte) i_34_;
				}
			} else
				i_33_ = i_29_;
			Class239[] class239s = new Class239[i_33_];
			for (int i_37_ = 0; i_37_ < class239s.length; i_37_++) {
				Class239 class239 = class239s[i_37_] = new Class239();
				int i_38_ = stream.readUnsignedByte(255);
				if (i_38_ > 0)
					((Class239) class239).aByteArray3363 = new byte[i_38_ * 2];
				i_38_ = stream.readUnsignedByte(255);
				if ((i_38_ ^ 0xffffffff) < -1) {
					((Class239) class239).aByteArray3366 = new byte[2 + i_38_ * 2];
					((Class239) class239).aByteArray3366[1] = (byte) 64;
				}
			}
			int i_39_ = stream.readUnsignedByte(255);
			byte[] is_40_ = (i_39_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_39_];
			i_39_ = stream.readUnsignedByte(255);
			byte[] is_41_ = i_39_ <= 0 ? null : new byte[i_39_ * 2];
			int i_42_;
			for (i_42_ = 0; (((((BufferStream) stream).buffer[i_42_ + ((BufferStream) stream).position]) ^ 0xffffffff) != -1); i_42_++) {
				/* empty */
			}
			byte[] is_43_ = new byte[i_42_];
			for (int i_44_ = 0; (i_42_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++)
				is_43_[i_44_] = stream.readByte(false);
			i_42_++;
			((BufferStream) stream).position++;
			int i_45_ = 0;
			for (int i_46_ = 0; i_46_ < 128; i_46_++) {
				i_45_ += stream.readUnsignedByte(255);
				((Class246_Sub34) this).aShortArray5137[i_46_] = (short) i_45_;
			}
			i_45_ = 0;
			for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > -129; i_47_++) {
				i_45_ += stream.readUnsignedByte(255);
				((Class246_Sub34) this).aShortArray5137[i_47_] += i_45_ << 8;
			}
			int i_48_ = 0;
			int i_49_ = 0;
			int i_50_ = 0;
			for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > -129; i_51_++) {
				if (i_48_ == 0) {
					if ((i_49_ ^ 0xffffffff) <= (is_43_.length ^ 0xffffffff))
						i_48_ = -1;
					else
						i_48_ = is_43_[i_49_++];
					i_50_ = stream.method2391((byte) 37);
				}
				((Class246_Sub34) this).aShortArray5137[i_51_] += PacketsDecoder.method184(-1 + i_50_, 2) << 14;
				anIntArray5128[i_51_] = i_50_;
				i_48_--;
			}
			i_49_ = 0;
			i_48_ = 0;
			int i_52_ = 0;
			for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > -129; i_53_++) {
				if ((anIntArray5128[i_53_] ^ 0xffffffff) != -1) {
					if (i_48_ == 0) {
						i_52_ = ((BufferStream) stream).buffer[i_24_++] - 1;
						if (i_49_ >= is_22_.length)
							i_48_ = -1;
						else
							i_48_ = is_22_[i_49_++];
					}
					((Class246_Sub34) this).aByteArray5131[i_53_] = (byte) i_52_;
					i_48_--;
				}
			}
			i_49_ = 0;
			i_48_ = 0;
			int i_54_ = 0;
			for (int i_55_ = 0; i_55_ < 128; i_55_++) {
				if ((anIntArray5128[i_55_] ^ 0xffffffff) != -1) {
					if ((i_48_ ^ 0xffffffff) == -1) {
						i_54_ = (16 + ((BufferStream) stream).buffer[i_28_++] << 2);
						if ((i_49_ ^ 0xffffffff) <= (is_26_.length ^ 0xffffffff))
							i_48_ = -1;
						else
							i_48_ = is_26_[i_49_++];
					}
					i_48_--;
					((Class246_Sub34) this).aByteArray5130[i_55_] = (byte) i_54_;
				}
			}
			i_48_ = 0;
			i_49_ = 0;
			Class239 class239 = null;
			for (int i_56_ = 0; i_56_ < 128; i_56_++) {
				if (anIntArray5128[i_56_] != 0) {
					if ((i_48_ ^ 0xffffffff) == -1) {
						class239 = class239s[is_32_[i_49_]];
						if (is_30_.length <= i_49_)
							i_48_ = -1;
						else
							i_48_ = is_30_[i_49_++];
					}
					i_48_--;
					((Class246_Sub34) this).aClass239Array5138[i_56_] = class239;
				}
			}
			i_48_ = 0;
			i_49_ = 0;
			int i_57_ = 0;
			for (int i_58_ = 0; i_58_ < 128; i_58_++) {
				if ((i_48_ ^ 0xffffffff) == -1) {
					if ((i_49_ ^ 0xffffffff) <= (is_43_.length ^ 0xffffffff))
						i_48_ = -1;
					else
						i_48_ = is_43_[i_49_++];
					if (anIntArray5128[i_58_] > 0)
						i_57_ = stream.readUnsignedByte(255) + 1;
				}
				((Class246_Sub34) this).aByteArray5126[i_58_] = (byte) i_57_;
				i_48_--;
			}
			((Class246_Sub34) this).anInt5136 = stream.readUnsignedByte(255) + 1;
			for (int i_59_ = 0; i_33_ > i_59_; i_59_++) {
				Class239 class239_60_ = class239s[i_59_];
				if (((Class239) class239_60_).aByteArray3363 != null) {
					for (int i_61_ = 1; (((Class239) class239_60_).aByteArray3363.length > i_61_); i_61_ += 2)
						((Class239) class239_60_).aByteArray3363[i_61_] = stream.readByte(false);
				}
				if (((Class239) class239_60_).aByteArray3366 != null) {
					for (int i_62_ = 3; (-2 + ((Class239) class239_60_).aByteArray3366.length > i_62_); i_62_ += 2)
						((Class239) class239_60_).aByteArray3366[i_62_] = stream.readByte(false);
				}
			}
			if (is_40_ != null) {
				for (int i_63_ = 1; is_40_.length > i_63_; i_63_ += 2)
					is_40_[i_63_] = stream.readByte(false);
			}
			if (is_41_ != null) {
				for (int i_64_ = 1; (i_64_ ^ 0xffffffff) > (is_41_.length ^ 0xffffffff); i_64_ += 2)
					is_41_[i_64_] = stream.readByte(false);
			}
			for (int i_65_ = 0; i_33_ > i_65_; i_65_++) {
				Class239 class239_66_ = class239s[i_65_];
				if (((Class239) class239_66_).aByteArray3366 != null) {
					i_45_ = 0;
					for (int i_67_ = 2; ((((Class239) class239_66_).aByteArray3366.length ^ 0xffffffff) < (i_67_ ^ 0xffffffff)); i_67_ += 2) {
						i_45_ = i_45_ + 1 + stream.readUnsignedByte(255);
						((Class239) class239_66_).aByteArray3366[i_67_] = (byte) i_45_;
					}
				}
			}
			for (int i_68_ = 0; (i_33_ ^ 0xffffffff) < (i_68_ ^ 0xffffffff); i_68_++) {
				Class239 class239_69_ = class239s[i_68_];
				if (((Class239) class239_69_).aByteArray3363 != null) {
					i_45_ = 0;
					for (int i_70_ = 2; (i_70_ < ((Class239) class239_69_).aByteArray3363.length); i_70_ += 2) {
						i_45_ = stream.readUnsignedByte(255) + 1 + i_45_;
						((Class239) class239_69_).aByteArray3363[i_70_] = (byte) i_45_;
					}
				}
			}
			if (is_40_ != null) {
				i_45_ = stream.readUnsignedByte(255);
				is_40_[0] = (byte) i_45_;
				for (int i_71_ = 2; (i_71_ ^ 0xffffffff) > (is_40_.length ^ 0xffffffff); i_71_ += 2) {
					i_45_ = 1 + (i_45_ + stream.readUnsignedByte(255));
					is_40_[i_71_] = (byte) i_45_;
				}
				int i_72_ = is_40_[0];
				int i_73_ = is_40_[1];
				for (int i_74_ = 0; (i_72_ ^ 0xffffffff) < (i_74_ ^ 0xffffffff); i_74_++)
					((Class246_Sub34) this).aByteArray5126[i_74_] = (byte) (32 + i_73_ * (((Class246_Sub34) this).aByteArray5126[i_74_]) >> 6);
				int i_75_ = 2;
				while (is_40_.length > i_75_) {
					int i_76_ = is_40_[i_75_];
					int i_77_ = is_40_[i_75_ + 1];
					int i_78_ = (i_76_ - i_72_) * i_73_ + (i_76_ - i_72_) / 2;
					for (int i_79_ = i_72_; (i_76_ ^ 0xffffffff) < (i_79_ ^ 0xffffffff); i_79_++) {
						int i_80_ = Class246_Sub28_Sub14.method2634(18059, i_78_, -i_72_ + i_76_);
						((Class246_Sub34) this).aByteArray5126[i_79_] = (byte) (32 + (((Class246_Sub34) this).aByteArray5126[i_79_]) * i_80_ >> 6);
						i_78_ += i_77_ + -i_73_;
					}
					i_75_ += 2;
					i_73_ = i_77_;
					i_72_ = i_76_;
				}
				Object object = null;
				for (int i_81_ = i_72_; (i_81_ ^ 0xffffffff) > -129; i_81_++)
					((Class246_Sub34) this).aByteArray5126[i_81_] = (byte) ((((Class246_Sub34) this).aByteArray5126[i_81_]) * i_73_ + 32 >> 6);
			}
			if (is_41_ != null) {
				i_45_ = stream.readUnsignedByte(255);
				is_41_[0] = (byte) i_45_;
				for (int i_82_ = 2; (is_41_.length ^ 0xffffffff) < (i_82_ ^ 0xffffffff); i_82_ += 2) {
					i_45_ = i_45_ + 1 + stream.readUnsignedByte(255);
					is_41_[i_82_] = (byte) i_45_;
				}
				int i_83_ = is_41_[0];
				int i_84_ = is_41_[1] << 1;
				for (int i_85_ = 0; i_85_ < i_83_; i_85_++) {
					int i_86_ = (i_84_ + (((Class246_Sub34) this).aByteArray5130[i_85_] & 0xff));
					if (i_86_ < 0)
						i_86_ = 0;
					if (i_86_ > 128)
						i_86_ = 128;
					((Class246_Sub34) this).aByteArray5130[i_85_] = (byte) i_86_;
				}
				int i_87_ = 2;
				while ((is_41_.length ^ 0xffffffff) < (i_87_ ^ 0xffffffff)) {
					int i_88_ = is_41_[i_87_];
					int i_89_ = is_41_[i_87_ + 1] << 1;
					int i_90_ = (-i_83_ + i_88_) / 2 + (-i_83_ + i_88_) * i_84_;
					for (int i_91_ = i_83_; i_88_ > i_91_; i_91_++) {
						int i_92_ = Class246_Sub28_Sub14.method2634(18059, i_90_, i_88_ - i_83_);
						int i_93_ = i_92_ + (0xff & (((Class246_Sub34) this).aByteArray5130[i_91_]));
						if ((i_93_ ^ 0xffffffff) > -1)
							i_93_ = 0;
						if (i_93_ > 128)
							i_93_ = 128;
						i_90_ += i_89_ - i_84_;
						((Class246_Sub34) this).aByteArray5130[i_91_] = (byte) i_93_;
					}
					i_83_ = i_88_;
					i_87_ += 2;
					i_84_ = i_89_;
				}
				for (int i_94_ = i_83_; (i_94_ ^ 0xffffffff) > -129; i_94_++) {
					int i_95_ = ((0xff & ((Class246_Sub34) this).aByteArray5130[i_94_]) - -i_84_);
					if (i_95_ < 0)
						i_95_ = 0;
					if ((i_95_ ^ 0xffffffff) < -129)
						i_95_ = 128;
					((Class246_Sub34) this).aByteArray5130[i_94_] = (byte) i_95_;
				}
				Object object = null;
			}
			for (int i_96_ = 0; (i_33_ ^ 0xffffffff) < (i_96_ ^ 0xffffffff); i_96_++)
				((Class239) class239s[i_96_]).anInt3362 = stream.readUnsignedByte(255);
			for (int i_97_ = 0; i_97_ < i_33_; i_97_++) {
				Class239 class239_98_ = class239s[i_97_];
				if (((Class239) class239_98_).aByteArray3363 != null)
					((Class239) class239_98_).anInt3373 = stream.readUnsignedByte(255);
				if (((Class239) class239_98_).aByteArray3366 != null)
					((Class239) class239_98_).anInt3369 = stream.readUnsignedByte(255);
				if (((Class239) class239_98_).anInt3362 > 0)
					((Class239) class239_98_).anInt3364 = stream.readUnsignedByte(255);
			}
			for (int i_99_ = 0; i_33_ > i_99_; i_99_++)
				((Class239) class239s[i_99_]).anInt3367 = stream.readUnsignedByte(255);
			for (int i_100_ = 0; i_33_ > i_100_; i_100_++) {
				Class239 class239_101_ = class239s[i_100_];
				if (((Class239) class239_101_).anInt3367 > 0)
					((Class239) class239_101_).anInt3368 = stream.readUnsignedByte(255);
			}
			for (int i_102_ = 0; (i_102_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff); i_102_++) {
				Class239 class239_103_ = class239s[i_102_];
				if (((Class239) class239_103_).anInt3368 > 0)
					((Class239) class239_103_).anInt3374 = stream.readUnsignedByte(255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qh.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aBool5145 = false;
	}
}
