
/* Class246_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class Class246_Sub11 extends Node {
	private NativeHeapBuffer aNativeBuffer4085;
	static int anInt4086;
	static int anInt4087;
	private Class210_Sub2 aClass210_Sub2_4088;
	int anInt4089;
	int anInt4090;
	static int anInt4091 = -1;
	private Stream aNativeStream4092;
	static OutgoingPacket ADD_IGNORE_PACKET = new OutgoingPacket(9, -1);
	private Class160 aClass160_4094;
	static int anInt4095;
	static int anInt4096;
	int anInt4097;
	private Class260_Sub2 aClass260_Sub2_4098;
	static Class198 aClass198_4099;
	private int[] anIntArray4100;
	static int anInt4101;
	float aFloat4102;
	int anInt4103;
	static int anInt4104;
	static int anInt4105;
	static Class235 aClass235_4106;
	static Class67 aClass67_4107 = new Class67("Attack", "Angreifen", "Attaquer", "Atacar");
	private Class194_Sub1 aClass194_Sub1_4108;

	static final int method1868(int i, byte i_0_, int i_1_) {
		try {
			anInt4104++;
			if (i_0_ != 81)
				aClass198_4099 = null;
			int i_2_ = -1 + i & i_1_ >> 31;
			return i_2_ + (i_1_ - -(i_1_ >>> 31)) % i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dw.H(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1869(int i, int i_3_) {
		try {
			anInt4095++;
			aNativeStream4092.c();
			Interface10 interface10 = aClass260_Sub2_4098.method1902(false, 125, aNativeBuffer4085, 4 * i, 4);
			aClass160_4094 = new Class160(interface10, 5121, 4, 0);
			aNativeStream4092 = null;
			int i_4_ = -34 / ((52 - i_3_) / 39);
			aNativeBuffer4085 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dw.C(" + i + ',' + i_3_ + ')');
		}
	}

	final void method1870(int[] is, int i, int i_5_) {
		do {
			try {
				anInt4086++;
				int i_6_ = 0;
				BufferStream stream = Class215.aStream3001;
				if (i_5_ > -20)
					((Class246_Sub11) this).anInt4090 = -97;
				((BufferStream) stream).position = 0;
				if (((Class260_Sub2) aClass260_Sub2_4098).aBool4392) {
					for (int i_7_ = 0; i_7_ < i; i_7_++) {
						int i_8_ = is[i_7_];
						short[] is_9_ = (((Class210_Sub2) aClass210_Sub2_4088).aShortArrayArray5021[i_8_]);
						int i_10_ = anIntArray4100[i_8_];
						if ((i_10_ ^ 0xffffffff) != -1 && is_9_ != null) {
							int i_11_ = 0;
							int i_12_ = 0;
							while (i_12_ < is_9_.length) {
								if ((i_10_ & 1 << i_11_++) != 0) {
									i_6_++;
									stream.writeShort((byte) 67, 0xffff & is_9_[i_12_++]);
									i_6_++;
									stream.writeShort((byte) 67, 0xffff & is_9_[i_12_++]);
									stream.writeShort((byte) 67, is_9_[i_12_++] & 0xffff);
									i_6_++;
								} else
									i_12_ += 3;
							}
						}
					}
				} else {
					for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i ^ 0xffffffff); i_13_++) {
						int i_14_ = is[i_13_];
						int i_15_ = anIntArray4100[i_14_];
						short[] is_16_ = (((Class210_Sub2) aClass210_Sub2_4088).aShortArrayArray5021[i_14_]);
						if ((i_15_ ^ 0xffffffff) != -1 && is_16_ != null) {
							int i_17_ = 0;
							int i_18_ = 0;
							while ((is_16_.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff)) {
								if ((1 << i_17_++ & i_15_) != 0) {
									stream.method2404((byte) -71, (0xffff & is_16_[i_18_++]));
									i_6_++;
									stream.method2404((byte) -94, (is_16_[i_18_++] & 0xffff));
									i_6_++;
									i_6_++;
									stream.method2404((byte) -104, (0xffff & is_16_[i_18_++]));
								} else
									i_18_ += 3;
							}
						}
					}
				}
				if ((i_6_ ^ 0xffffffff) >= -1)
					break;
				aClass194_Sub1_4108.method2(((BufferStream) stream).buffer, true, 5123, ((BufferStream) stream).position);
				aClass260_Sub2_4098.method1934(aClass160_4094, 121, ((Class210_Sub2) aClass210_Sub2_4088).f_gb, ((Class210_Sub2) aClass210_Sub2_4088).aClass160_5024, ((Class210_Sub2) aClass210_Sub2_4088).f_ab);
				aClass260_Sub2_4098.method1926(((0x7 & ((Class210_Sub2) aClass210_Sub2_4088).anInt5020) != 0), (byte) 12, ((Class246_Sub11) this).anInt4103, ((0x8 & ((Class210_Sub2) aClass210_Sub2_4088).anInt5020) != 0));
				if (((Class260_Sub2) aClass260_Sub2_4098).aBool4325)
					aClass260_Sub2_4098.GA(2147483647, ((Class246_Sub11) this).anInt4090, ((Class246_Sub11) this).anInt4089, ((Class246_Sub11) this).anInt4097);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPushMatrix();
				OpenGL.glScalef(1.0F / ((Class246_Sub11) this).aFloat4102, 1.0F / ((Class246_Sub11) this).aFloat4102, 1.0F);
				OpenGL.glMatrixMode(5888);
				aClass260_Sub2_4098.method1934(aClass160_4094, 123, ((Class210_Sub2) aClass210_Sub2_4088).f_gb, ((Class210_Sub2) aClass210_Sub2_4088).aClass160_5024, ((Class210_Sub2) aClass210_Sub2_4088).f_ab);
				aClass260_Sub2_4098.method1967(0, i_6_, 4, aClass194_Sub1_4108, (byte) -95);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("dw.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1871(int i) {
		try {
			aClass67_4107 = null;
			aClass235_4106 = null;
			ADD_IGNORE_PACKET = null;
			if (i != -128)
				anInt4091 = 54;
			aClass198_4099 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "dw.D(" + i + ')');
		}
	}

	final void method1872(int i, int i_19_, int i_20_, boolean bool) {
		try {
			anIntArray4100[(((Class210) aClass210_Sub2_4088).anInt2956 * i - -i_20_)] = Class236.method1523((anIntArray4100[(((Class210) aClass210_Sub2_4088).anInt2956) * i - -i_20_]), 1 << i_19_);
			if (bool != false)
				method1872(79, -68, 48, true);
			anInt4101++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dw.A(" + i + ',' + i_19_ + ',' + i_20_ + ',' + bool + ')'));
		}
	}

	final void method1873(int i, int i_21_, byte i_22_, int i_23_, float f) {
		try {
			anInt4096++;
			if ((((Class246_Sub11) this).anInt4103 ^ 0xffffffff) != 0) {
				Class238 class238 = ((Class260) aClass260_Sub2_4098).anInterface6_3714.method17(-31305, ((Class246_Sub11) this).anInt4103);
				int i_24_ = 0xff & ((Class238) class238).aByte3344;
				if (i_24_ != 0 && (((Class238) class238).aByte3343 ^ 0xffffffff) != -5) {
					int i_25_;
					if ((i ^ 0xffffffff) <= -1) {
						if ((i ^ 0xffffffff) >= -128)
							i_25_ = i * 131586;
						else
							i_25_ = 16777215;
					} else
						i_25_ = 0;
					if (i_24_ == 256)
						i_23_ = i_25_;
					else {
						int i_26_ = i_24_;
						int i_27_ = -i_24_ + 256;
						i_23_ = ((((i_27_ * (i_23_ & 0xff00ff) + (i_25_ & 0xff00ff) * i_26_) & ~0xff00ff) - -(0xff0000 & (i_27_ * (0xff00 & i_23_) + i_26_ * (0xff00 & i_25_)))) >> 8);
					}
				}
				int i_28_ = 0xff & ((Class238) class238).aByte3338;
				if (i_28_ != 0) {
					i_28_ += 256;
					int i_29_ = (0xff & i_23_ >> 16) * i_28_;
					if ((i_29_ ^ 0xffffffff) < -65536)
						i_29_ = 65535;
					int i_30_ = i_28_ * (i_23_ >> 8 & 0xff);
					if (i_30_ > 65535)
						i_30_ = 65535;
					int i_31_ = i_28_ * (0xff & i_23_);
					if ((i_31_ ^ 0xffffffff) < -65536)
						i_31_ = 65535;
					i_23_ = (i_31_ >> 8) + ((i_30_ & 0xff00) + ((0xff00 & i_29_) << 8));
				}
			}
			if (i_22_ < 49)
				aClass67_4107 = null;
			aNativeStream4092.e(i_21_ * 4);
			if (f != 1.0F) {
				int i_32_ = (i_23_ & 0xffa1fb) >> 16;
				int i_33_ = i_23_ >> 8 & 0xff;
				i_32_ *= f;
				int i_34_ = 0xff & i_23_;
				if (i_32_ < 0)
					i_32_ = 0;
				else if (i_32_ > 255)
					i_32_ = 255;
				i_33_ *= f;
				if (i_33_ < 0)
					i_33_ = 0;
				else if (i_33_ > 255)
					i_33_ = 255;
				i_34_ *= f;
				if (i_34_ >= 0) {
					if ((i_34_ ^ 0xffffffff) < -256)
						i_34_ = 255;
				} else
					i_34_ = 0;
				i_23_ = i_34_ | (i_32_ << 16 | i_33_ << 8);
			}
			aNativeStream4092.c((byte) (i_23_ >> 16));
			aNativeStream4092.c((byte) (i_23_ >> 8));
			aNativeStream4092.c((byte) i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dw.G(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + f + ')'));
		}
	}

	final void method1874(int i, int i_35_) {
		do {
			try {
				aNativeBuffer4085 = ((Class260_Sub2) aClass260_Sub2_4098).f_pe.a(4 * i_35_, true);
				anInt4087++;
				aNativeStream4092 = new Stream(aNativeBuffer4085);
				if (i < -100)
					break;
				method1875(95, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dw.E(" + i + ',' + i_35_ + ')');
			}
			break;
		} while (false);
	}

	final void method1875(int i, boolean bool) {
		do {
			try {
				aNativeStream4092.e(4 * i + 3);
				anInt4105++;
				aNativeStream4092.c(-1);
				if (bool == false)
					break;
				method1872(-35, -17, 22, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "dw.F(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	Class246_Sub11(Class210_Sub2 class210_sub2, int i, int i_36_, int i_37_, int i_38_, int i_39_) {
		try {
			aClass210_Sub2_4088 = class210_sub2;
			((Class246_Sub11) this).anInt4089 = i_38_;
			((Class246_Sub11) this).anInt4103 = i;
			((Class246_Sub11) this).aFloat4102 = (float) i_36_;
			aClass260_Sub2_4098 = ((Class210_Sub2) aClass210_Sub2_4088).aClass260_Sub2_5004;
			((Class246_Sub11) this).anInt4090 = i_37_;
			((Class246_Sub11) this).anInt4097 = i_39_;
			anIntArray4100 = new int[(((Class210) aClass210_Sub2_4088).anInt2956 * ((Class210) aClass210_Sub2_4088).anInt2952)];
			aClass194_Sub1_4108 = new Class194_Sub1(aClass260_Sub2_4098, 5123, null, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("dw.<init>(" + (class210_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ')'));
		}
	}
}
