/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class232 {
	static int anInt3173;
	static IncomingPacket aClass13_3174 = new IncomingPacket(3, -1);
	static int anInt3175;
	static int anInt3176;
	static Class67 aClass67_3177 = new Class67("Loaded defaults", "Standardeinstellungen geladen", "Param\u00e8tres par d\u00e9faut charg\u00e9s", "Padr\u00f5es carregados");
	static Class67 aClass67_3178 = new Class67("red:", "rot:", "rouge:", "vermelho:");
	static short aShort3179 = 32767;

	abstract Class188 method1482(int i);

	public Class232() {
		/* empty */
	}

	static final void method1483(Class235 class235, Class128 class128, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, long l) {
		try {
			anInt3175++;
			int i_5_ = i_4_ * i_4_ + i * i;
			if (i_2_ == 256 && (long) i_5_ <= l) {
				int i_6_ = Math.min(((Class235) class235).f_fc / 2, ((Class235) class235).f_sb / 2);
				if (i_6_ * i_6_ < i_5_) {
					i_6_ -= 10;
					int i_7_;
					do {
						if ((Class130_Sub3.anInt4417 ^ 0xffffffff) == -5) {
							i_7_ = (int) Class204.aFloat2881 & 0x3fff;
							if (!client.f_ob)
								break;
						}
						i_7_ = 0x3fff & (Class95.anInt1253 + (int) Class204.aFloat2881);
					} while (false);
					int i_8_ = Class39_Sub1.f_fb[i_7_];
					int i_9_ = Class39_Sub1.anIntArray4672[i_7_];
					if ((Class130_Sub3.anInt4417 ^ 0xffffffff) != -5) {
						i_9_ = i_9_ * 256 / (256 + Class246_Sub12.anInt4405);
						i_8_ = 256 * i_8_ / (256 + Class246_Sub12.anInt4405);
					}
					int i_10_ = i * i_9_ + i_8_ * i_4_ >> 15;
					int i_11_ = -(i * i_8_) + i_4_ * i_9_ >> 15;
					double d = Math.atan2((double) i_10_, (double) i_11_);
					int i_12_ = (int) (Math.sin(d) * (double) i_6_);
					int i_13_ = (int) (Math.cos(d) * (double) i_6_);
					Class169.aClass_lArray2410[i_1_].method736(((float) ((Class235) class235).f_fc / 2.0F + (float) i_0_ + (float) i_12_), ((float) -i_13_ + ((float) ((Class235) class235).f_sb / 2.0F + (float) i_3_)), 4096, (int) (65535.0 * (-d / 6.283185307179586)));
				} else
					Class253.method1635(i_0_, true, Class260.aClass_lArray3726[i_1_], class235, class128, i_4_, i, i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("up.K(" + (class235 != null ? "{...}" : "null") + ',' + (class128 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + l + ')'));
		}
	}

	static final void method1484(byte i) {
		try {
			anInt3176++;
			Class82.aClass105_1072.method702((byte) -128);
			Class246_Sub28_Sub21.aClass175_6587.method1153(98);
			Class238.aClass92_3358.method587((byte) -98);
			Class143.aClass251_2067.method1605((byte) -24);
			Class179.aClass228_2518.method1459(false);
			Class255.aClass191_3663.method1255((byte) -73);
			Class59_Sub3_Sub3.aClass45_6275.method303(2);
			Class195.aClass177_2745.method1166(true);
			Class246_Sub30_Sub1.aClass17_5761.method164(1068);
			SubIncomingPacket.aClass209_7085.method1372((byte) -79);
			Class118.aClass_v1641.method696(-52);
			Class246_Sub10.aClass254_4084.method1637(34);
			Class246_Sub28_Sub30.aClass165_6873.method1091(-93);
			Class241.aClass193_3398.method1269((byte) 84);
			Class246_Sub1_Sub10.f_eb.method1080((byte) 122);
			Class246_Sub31.aClass203_5038.method1333(7569);
			Class246_Sub1_Sub14.aClass214_6597.method1395((byte) 25);
			Class228.aClass189_3132.method1238(64);
			Class_fs.aClass156_150.method1033(true);
			Class246_Sub28_Sub25.aClass57_6702.method392((byte) 106);
			Class199.method1319(8);
			Class252.method1621((byte) -107);
			Class109_Sub3.method1823(1);
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297) {
				for (int i_14_ = 0; Class220.aByteArrayArray3051.length > i_14_; i_14_++)
					Class220.aByteArrayArray3051[i_14_] = null;
				Class55.anInt781 = 0;
			}
			Class78.method491(-99);
			Class134.method901(51);
			Class246_Sub28_Sub5.method2543(false);
			PacketsDecoder.method180(-1);
			Class259.method1675(false);
			Class146.aClass54_2139.method369(false);
			Class246_Sub15.aClass260_4445.method1752();
			Class109_Sub3.aClass127_3957.method873((byte) -63);
			Class106_Sub1.method1890((byte) 3);
			Class221.index0.method105(0);
			Class176.index1.method105(0);
			ISAAC.index2.method105(0);
			Class138.index3.method105(0);
			Class246_Sub28_Sub3.index4.method105(0);
			Class246_Sub7.index5.method105(0);
			Class21.index6.method105(0);
			Class199.index7.method105(0);
			Class210_Sub2.index8.method105(0);
			Class246_Sub28_Sub16.index9.method105(0);
			Class48.index10.method105(0);
			Class153.index11.method105(0);
			Class246_Sub28_Sub17.index12.method105(0);
			Class111.index13.method105(0);
			Class171.index14.method105(0);
			Class193.index15.method105(0);
			Class246_Sub40.index16.method105(0);
			Class110.index17.method105(0);
			Class214.index18.method105(0);
			Class219.index19.method105(0);
			Class218.index20.method105(0);
			Class246_Sub1_Sub5.index21.method105(0);
			Class59_Sub3_Sub2.index22.method105(0);
			Class246_Sub16.index23.method105(0);
			if (i > 36) {
				Class38.index24.method105(0);
				Class82.index25.method105(0);
				Class246_Sub1_Sub4.index26.method105(0);
				Class59_Sub3_Sub4.index27.method105(0);
				Class109_Sub2.index28.method105(0);
				NativeLibraryManager.nativeLibraryFS.method105(0);
				Class202.index29.method105(0);
				Class140.aClass54_2034.method369(false);
				Class246_Sub41_Sub2.aClass54_6474.method369(false);
				Class211_Sub1.aClass54_5351.method369(false);
				Class56.aClass54_793.method369(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "up.O(" + i + ')');
		}
	}

	abstract void method1485(int i);

	abstract void method1486(int i);

	public static void method1487(int i) {
		do {
			try {
				aClass67_3177 = null;
				aClass13_3174 = null;
				aClass67_3178 = null;
				if (i == -5631)
					break;
				method1483(null, null, -35, 96, -117, 84, 19, -50, -97L);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "up.M(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract boolean method1488(int i, int i_15_);

	static final boolean method1489(Stream_Sub1 stream_sub1, int i, int i_16_) {
		try {
			if (i < 76)
				aClass67_3177 = null;
			anInt3173++;
			int i_17_ = stream_sub1.readBits(-67, 2);
			if ((i_17_ ^ 0xffffffff) == -1) {
				if (stream_sub1.readBits(-117, 1) != 0)
					method1489(stream_sub1, 104, i_16_);
				int i_18_ = stream_sub1.readBits(-64, 6);
				int i_19_ = stream_sub1.readBits(-121, 6);
				boolean bool = (stream_sub1.readBits(-61, 1) ^ 0xffffffff) == -2;
				if (bool)
					Class218.anIntArray3025[Class252.anInt3567++] = i_16_;
				if (Class143.aClass_r_Sub1Array2069[i_16_] != null)
					throw new RuntimeException("hr:lr");
				Class240 class240 = Class166.aClass240Array2365[i_16_];
				Player class_r_sub1 = (Class143.aClass_r_Sub1Array2069[i_16_] = new Player());
				((Actor) class_r_sub1).f_db = i_16_;
				if (Class197.aStreamArray2770[i_16_] != null)
					class_r_sub1.readAppearance(Class197.aStreamArray2770[i_16_], -2147483648);
				class_r_sub1.method2664(125, ((Class240) class240).anInt3380);
				((Actor) class_r_sub1).faceEntity = ((Class240) class240).anInt3379;
				int i_20_ = ((Class240) class240).anInt3383;
				int i_21_ = i_20_ >> 28;
				int i_22_ = (0x3fd38e & i_20_) >> 14;
				((Player) class_r_sub1).aBool7129 = ((Class240) class240).aBool3378;
				int i_23_ = i_20_ & 0xff;
				((Actor) class_r_sub1).f_rc[0] = Class234.movementTypes[i_16_];
				((Class59_Sub3) class_r_sub1).aByte5053 = (byte) i_21_;
				class_r_sub1.method2913(-Class47.anInt686 + (i_19_ + (i_23_ << 6)), 0, -Class39_Sub1.anInt4670 + ((i_22_ << 6) - -i_18_));
				((Player) class_r_sub1).aBool7142 = false;
				Class166.aClass240Array2365[i_16_] = null;
				return true;
			}
			if ((i_17_ ^ 0xffffffff) == -2) {
				int i_24_ = stream_sub1.readBits(-121, 2);
				int i_25_ = (((Class240) Class166.aClass240Array2365[i_16_]).anInt3383);
				((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = (i_25_ & 0xfffffff) + ((i_25_ >> 28) + i_24_ << 28 & 0x30000000);
				return false;
			}
			if ((i_17_ ^ 0xffffffff) == -3) {
				int i_26_ = stream_sub1.readBits(-49, 5);
				int i_27_ = i_26_ >> 3;
				int i_28_ = i_26_ & 0x7;
				int i_29_ = (((Class240) Class166.aClass240Array2365[i_16_]).anInt3383);
				int i_30_ = i_27_ + (i_29_ >> 28) & 0x3;
				int i_31_ = 0xff & i_29_ >> 14;
				int i_32_ = i_29_ & 0xff;
				if ((i_28_ ^ 0xffffffff) == -1) {
					i_31_--;
					i_32_--;
				}
				if ((i_28_ ^ 0xffffffff) == -2)
					i_32_--;
				if ((i_28_ ^ 0xffffffff) == -3) {
					i_32_--;
					i_31_++;
				}
				if ((i_28_ ^ 0xffffffff) == -4)
					i_31_--;
				if (i_28_ == 4)
					i_31_++;
				if ((i_28_ ^ 0xffffffff) == -6) {
					i_32_++;
					i_31_--;
				}
				if ((i_28_ ^ 0xffffffff) == -7)
					i_32_++;
				if (i_28_ == 7) {
					i_31_++;
					i_32_++;
				}
				((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = i_32_ + ((i_30_ << 28) - -(i_31_ << 14));
				return false;
			}
			int i_33_ = stream_sub1.readBits(-121, 18);
			int i_34_ = i_33_ >> 16;
			int i_35_ = (0xff14 & i_33_) >> 8;
			int i_36_ = i_33_ & 0xff;
			int i_37_ = ((Class240) Class166.aClass240Array2365[i_16_]).anInt3383;
			int i_38_ = i_34_ + (i_37_ >> 28) & 0x3;
			int i_39_ = (i_37_ >> 14) + i_35_ & 0xff;
			int i_40_ = i_37_ + i_36_ & 0xff;
			((Class240) Class166.aClass240Array2365[i_16_]).anInt3383 = i_40_ + (i_38_ << 28) - -(i_39_ << 14);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("up.L(" + (stream_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ')'));
		}
	}

	static final void method1490(int i, int i_41_, int i_42_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_41_][i_42_];
		if (class147 != null) {
			if (((Class147) class147).aClass59_Sub1_2156 != null)
				((Class147) class147).aClass59_Sub1_2156 = null;
		}
	}
}
