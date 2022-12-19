/* Class246_Sub1_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub1_Sub15 extends Class246_Sub1 {
	static int anInt6598;
	int anInt6599;
	static int anInt6600;
	static float aFloat6601;
	static int anInt6602 = 0;
	static int anInt6603;
	Interface2 anInterface2_6604;
	static int anInt6605;

	abstract boolean method2714(byte i);

	static final void method2715(boolean bool) {
		try {
			anInt6598++;
			Class59_Sub1_Sub2.anIntArray6123 = Class59_Sub3_Sub4.method2864(8, bool, 35, -69, 8, 0.4F, 2048, 4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mh.G(" + bool + ')');
		}
	}

	static final void method2716(int i, String string, int i_0_) {
		try {
			anInt6605++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_0_, (byte) 127, 2);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).aString6209 = string;
			int i_1_ = 89 % ((-7 - i) / 42);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mh.I(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static final int method2717(int i, int i_2_, int i_3_) {
		try {
			anInt6603++;
			if ((i ^ 0xffffffff) == -2 || i == 3)
				return Class246_Sub1_Sub2.anIntArray5691[0x3 & i_2_];
			if (i_3_ != 31654)
				return 30;
			return Class211_Sub1.anIntArray5352[i_2_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mh.H(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	abstract Object method2718(byte i);

	Class246_Sub1_Sub15(Interface2 interface2, int i) {
		try {
			((Class246_Sub1_Sub15) this).anInterface2_6604 = interface2;
			((Class246_Sub1_Sub15) this).anInt6599 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mh.<init>(" + (interface2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2719(int i, Class12 class12) {
		try {
			anInt6600++;
			if (Class247.aClass12_3482 == class12) {
				int i_4_ = Class78.packetStream.readUnsignedShort((byte) 97);
				int i_5_ = Class78.packetStream.readUnsignedByte(255);
				Class143.aClass251_2067.method1610(i_4_, 0).method1211((byte) -126, i_5_);
			} else if (Class71.SEND_GROUND_ITEM == class12) {
				int i_6_ = Class78.packetStream.readUnsignedShortLE(116);
				int i_7_ = Class78.packetStream.readUnsignedShort128(952968608);
				int i_8_ = Class78.packetStream.readUnsignedByte(255);
				int i_9_ = Class82.baseTileX - -((i_8_ & 0x70) >> 4);
				int i_10_ = Class106_Sub2.baseTileY + (i_8_ & 0x7);
				if (i_9_ >= 0 && (i_10_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) && Class152.anInt2205 > i_10_) {
					IncomingPacket.method143(new Class246_Sub43(i_7_, i_6_), i_9_, i_10_, (byte) 116, Class60.basePlane);
					Class254.method1645(Class60.basePlane, 1546660647, i_9_, i_10_);
				}
			} else if (class12 == Class96.aClass12_1256) {
				Class78.packetStream.readUnsignedByte(255);
				int i_11_ = Class78.packetStream.readUnsignedByte(255);
				int i_12_ = Class82.baseTileX - -((i_11_ & 0x72) >> 4);
				int i_13_ = (i_11_ & 0x7) + Class106_Sub2.baseTileY;
				int i_14_ = Class78.packetStream.readUnsignedShort((byte) 109);
				int i_15_ = Class78.packetStream.readUnsignedByte(255);
				int i_16_ = Class78.packetStream.read24BitInteger((byte) 29);
				String string = Class78.packetStream.readString((byte) -40);
				Class114.method778(i_16_, i_14_, Class60.basePlane, i_12_, false, i_13_, i_15_, string);
			} else if (Class246_Sub30.SEND_PROJECTILE == class12) {
				int hash = Class78.packetStream.readUnsignedByte(255);
				boolean bool = (0x80 & hash) != 0;
				int baseX = ((hash & 0x3e) >> 3) + Class82.baseTileX;
				int baseY = (0x7 & hash) + Class106_Sub2.baseTileY;
				int distanceX = Class78.packetStream.readByte(false) + baseX;
				int distanceY = baseY - -Class78.packetStream.readByte(false);
				int lockOn = Class78.packetStream.method2375((byte) 1);
				int gfxId = Class78.packetStream.readUnsignedShort((byte) 120);
				int startHeight = Class78.packetStream.readUnsignedByte(255) * 4;
				int endHeight = 4 * Class78.packetStream.readUnsignedByte(255);
				int delay = Class78.packetStream.readUnsignedShort((byte) 111);
				int delayAndSpeed = Class78.packetStream.readUnsignedShort((byte) 91);
				int angle1 = Class78.packetStream.readUnsignedByte(255);
				if (angle1 == 255)
					angle1 = -1;
				int angle2 = Class78.packetStream.readUnsignedByte(255);
				if ((baseX ^ 0xffffffff) <= -1 && (baseY ^ 0xffffffff) <= -1 && Class38_Sub1_Sub1.anInt6770 > baseX && Class152.anInt2205 > baseY && distanceX >= 0 && (distanceY ^ 0xffffffff) <= -1 && Class38_Sub1_Sub1.anInt6770 > distanceX && distanceY < Class152.anInt2205 && (gfxId ^ 0xffffffff) != -65536) {
					baseX = 128 * baseX + 64;
					distanceY = 64 + distanceY * 128;
					startHeight <<= 0;
					baseY = 64 + 128 * baseY;
					distanceX = 128 * distanceX + 64;
					endHeight <<= 0;
					Class_g class_g = new Class_g(gfxId, Class60.basePlane, baseX, baseY, startHeight, delay + Class246_Sub1_Sub4.anInt5752, delayAndSpeed + Class246_Sub1_Sub4.anInt5752, angle1, angle2, lockOn, endHeight, bool);
					class_g.method2686(Class246_Sub1_Sub4.anInt5752 + delay, distanceX, Class6.getAverageHeight(distanceX, 62, Class60.basePlane, distanceY) + -endHeight, distanceY, 98);
					Class12.aClass166_180.method1101(false, new Class246_Sub1_Sub7(class_g));
				}
			} else if (Class238.REMOVE_GROUND_ITEM == class12) {
				int i_30_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
				int i_31_ = Class78.packetStream.readUnsignedByteC(-101);
				int i_32_ = (0x7 & i_31_ >> 4) + Class82.baseTileX;
				int i_33_ = Class106_Sub2.baseTileY - -(i_31_ & 0x7);
				if ((i_32_ ^ 0xffffffff) <= -1 && i_33_ >= 0 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_32_ ^ 0xffffffff)) && (i_33_ ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff)) {
					Class246_Sub13 class246_sub13 = (Class246_Sub13) (Class251.aClass85_3551.method544((long) (Class60.basePlane << 28 | i_33_ << 14 | i_32_), 125));
					if (class246_sub13 != null) {
						for (Class246_Sub43 class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1104(37)); class246_sub43 != null; class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1108((byte) -112))) {
							if ((((Class246_Sub43) class246_sub43).anInt5596 ^ 0xffffffff) == (i_30_ & 0x7fff ^ 0xffffffff)) {
								class246_sub43.unlink((byte) -121);
								break;
							}
						}
						if (((Class246_Sub13) class246_sub13).aClass166_4423.method1111((byte) -124))
							class246_sub13.unlink((byte) 89);
						Class254.method1645(Class60.basePlane, 1546660647, i_32_, i_33_);
					}
				}
			} else if (class12 == SubIncomingPacket.SOME_PACKET) {
				int i_34_ = Class78.packetStream.readUnsignedShort128(952968608);
				byte i_35_ = Class78.packetStream.readByteC(0);
				int i_36_ = Class78.packetStream.readUnsignedByteC(-99);
				int i_37_ = i_36_ >> 2;
				int i_38_ = i_36_ & 0x3;
				int i_39_ = Class78.packetStream.readUnsignedByte128(27574);
				int i_40_ = Class82.baseTileX - -((0x77 & i_39_) >> 4);
				int i_41_ = (i_39_ & 0x7) + Class106_Sub2.baseTileY;
				byte i_42_ = Class78.packetStream.readByte128(-113);
				int i_43_ = Class78.packetStream.method2366((byte) -53);
				byte i_44_ = Class78.packetStream.readByteC(0);
				int i_45_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
				int i_46_ = Class78.packetStream.readUnsignedShortLE128((byte) 55);
				byte i_47_ = Class78.packetStream.readByteC(0);
				if (!Class246_Sub15.aClass260_4445.method1684())
					Class110.method763(i_40_, i_34_, i_38_, -81, i_44_, i_35_, i_43_, i_47_, Class60.basePlane, i_42_, i_41_, i_46_, i_45_, i_37_);
			} else if (class12 == Class228.DESTROY_WORLD_OBJECT) {
				int i_48_ = Class78.packetStream.readUnsignedByte128(27574);
				int i_49_ = i_48_ >> 2;
				int i_50_ = i_48_ & 0x3;
				int i_51_ = Class246_Sub19.anIntArray4712[i_49_];
				int i_52_ = Class78.packetStream.readUnsigned128Byte((byte) 126);
				int i_53_ = Class82.baseTileX - -(i_52_ >> 4 & 0x7);
				int i_54_ = (0x7 & i_52_) + Class106_Sub2.baseTileY;
				if (Class_j.method718(Class255_Sub1.anInt5573, -105) || (i_53_ >= 0 && (i_54_ ^ 0xffffffff) <= -1 && Class38_Sub1_Sub1.anInt6770 > i_53_ && (i_54_ ^ 0xffffffff) > (Class152.anInt2205 ^ 0xffffffff)))
					Class259_Sub1.method2016(i_53_, -1, i_49_, -1, i_51_, i_54_, -110, Class60.basePlane, i_50_, 0);
			} else if (class12 == Class18.aClass12_259) {
				int i_55_ = Class78.packetStream.readUnsignedByte(255);
				int i_56_ = Class82.baseTileX * 2 - -(0xf & i_55_ >> 4);
				int i_57_ = 2 * Class106_Sub2.baseTileY + (0xf & i_55_);
				boolean bool = ((Class78.packetStream.readUnsignedByte(255) ^ 0xffffffff) != -1);
				int i_58_ = Class78.packetStream.readByte(false) + i_56_;
				int i_59_ = i_57_ - -Class78.packetStream.readByte(false);
				int i_60_ = Class78.packetStream.method2375((byte) 1);
				int i_61_ = Class78.packetStream.method2375((byte) 1);
				int i_62_ = Class78.packetStream.readUnsignedShort((byte) -52);
				int i_63_ = Class78.packetStream.readByte(false);
				int i_64_ = 4 * Class78.packetStream.readUnsignedByte(255);
				int i_65_ = Class78.packetStream.readUnsignedShort((byte) 89);
				int i_66_ = Class78.packetStream.readUnsignedShort((byte) -128);
				int i_67_ = Class78.packetStream.readUnsignedByte(255);
				if ((i_67_ ^ 0xffffffff) == -256)
					i_67_ = -1;
				int i_68_ = Class78.packetStream.readUnsignedByte(255);
				if (i_56_ >= 0 && (i_57_ ^ 0xffffffff) <= -1 && (i_56_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 * 2 ^ 0xffffffff) && Class38_Sub1_Sub1.anInt6770 * 2 > i_57_ && (i_58_ ^ 0xffffffff) <= -1 && (i_59_ ^ 0xffffffff) <= -1 && i_58_ < Class152.anInt2205 * 2 && 2 * Class152.anInt2205 > i_59_ && (i_62_ ^ 0xffffffff) != -65536) {
					i_58_ = 64 * i_58_;
					i_57_ = 64 * i_57_;
					i_59_ = 64 * i_59_;
					i_63_ <<= 0;
					i_64_ <<= 0;
					i_56_ *= 64;
					if (i_60_ != 0) {
						int i_69_;
						Actor class_r;
						if (i_60_ < 0) {
							int i_70_ = -1 + -i_60_;
							int i_71_ = 0x7ff & i_70_;
							i_69_ = i_70_ >> 11 & 0xf;
							if ((Class109.anInt1567 ^ 0xffffffff) != (i_71_ ^ 0xffffffff))
								class_r = Class143.aClass_r_Sub1Array2069[i_71_];
							else
								class_r = Class_a.aClass_r_Sub1_1180;
						} else {
							int i_72_ = i_60_ - 1;
							i_69_ = 0xf & i_72_ >> 11;
							int i_73_ = i_72_ & 0x7ff;
							class_r = Class76.aClass_r_Sub2Array1002[i_73_];
						}
						if (class_r != null) {
							Class135 class135 = class_r.method2676(-1);
							if ((((Class135) class135).anIntArrayArray1905 != null) && (((Class135) class135).anIntArrayArray1905[i_69_]) != null) {
								int i_74_ = (((Class135) class135).anIntArrayArray1905[i_69_][0]);
								int i_75_ = (((Class135) class135).anIntArrayArray1905[i_69_][2]);
								int i_76_ = ((Actor) class_r).f_fb.method203(-105);
								int i_77_ = Class39_Sub1.f_fb[i_76_];
								int i_78_ = Class39_Sub1.anIntArray4672[i_76_];
								int i_79_ = i_75_ * i_77_ + i_74_ * i_78_ >> 15;
								i_75_ = i_75_ * i_78_ - i_77_ * i_74_ >> 15;
								i_74_ = i_79_;
								i_56_ += i_74_;
								i_63_ -= (((Class135) class135).anIntArrayArray1905[i_69_][1]);
								i_57_ += i_75_;
							}
						}
					}
					Class_g class_g = new Class_g(i_62_, Class60.basePlane, i_56_, i_57_, i_63_, Class246_Sub1_Sub4.anInt5752 + i_65_, i_66_ - -Class246_Sub1_Sub4.anInt5752, i_67_, i_68_, i_61_, i_64_, bool);
					class_g.method2686(i_65_ - -Class246_Sub1_Sub4.anInt5752, i_58_, (-i_64_ + Class6.getAverageHeight(i_58_, 57, Class60.basePlane, i_59_)), i_59_, 70);
					Class12.aClass166_180.method1101(false, new Class246_Sub1_Sub7(class_g));
				}
			} else if (class12 == Class81.aClass12_1066) {
				int i_80_ = Class78.packetStream.readUnsignedByte(255);
				int i_81_ = ((i_80_ & 0x73) >> 4) + Class82.baseTileX;
				int i_82_ = Class106_Sub2.baseTileY + (0x7 & i_80_);
				int i_83_ = Class78.packetStream.readUnsignedShort((byte) -42);
				if ((i_83_ ^ 0xffffffff) == -65536)
					i_83_ = -1;
				int i_84_ = Class78.packetStream.readUnsignedByte(255);
				int i_85_ = 0xf & i_84_ >> 4;
				int i_86_ = i_84_ & 0x7;
				int i_87_ = Class78.packetStream.readUnsignedByte(255);
				int i_88_ = Class78.packetStream.readUnsignedByte(255);
				if (i_81_ >= 0 && i_82_ >= 0 && (i_81_ ^ 0xffffffff) > (Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) && Class152.anInt2205 > i_82_) {
					int i_89_ = i_85_ + 1;
					if ((((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0] ^ 0xffffffff) <= (i_81_ - i_89_ ^ 0xffffffff) && (i_89_ + i_81_ >= ((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0]) && ((i_82_ + -i_89_ ^ 0xffffffff) >= (((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0] ^ 0xffffffff)) && ((i_82_ + i_89_ ^ 0xffffffff) <= (((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0] ^ 0xffffffff)))
						Class_l_Sub2.method2298(i_88_, i_83_, i_87_, -27348, i_86_, (i_85_ + (i_81_ << 16) + ((Class60.basePlane << 24) - -(i_82_ << 8))));
				}
			} else if (class12 == SubIncomingPacket.aClass12_7094) {
				int i_90_ = Class78.packetStream.readUnsignedByte(255);
				int i_91_ = (i_90_ >> 4 & 0x7) + Class82.baseTileX;
				int i_92_ = (0x7 & i_90_) + Class106_Sub2.baseTileY;
				int i_93_ = Class78.packetStream.readUnsignedShort((byte) -34);
				int i_94_ = Class78.packetStream.readUnsignedByte(255);
				int i_95_ = Class78.packetStream.readUnsignedShort((byte) 91);
				int i_96_ = Class78.packetStream.readUnsignedByte(255);
				if ((i_91_ ^ 0xffffffff) <= -1 && (i_92_ ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_91_ ^ 0xffffffff)) && Class152.anInt2205 > i_92_) {
					int i_97_ = 128 * i_91_ + 64;
					int i_98_ = 64 + 128 * i_92_;
					int i_99_ = Class60.basePlane;
					if ((i_99_ ^ 0xffffffff) > -4 && Class211.method1389(i_91_, -29792, i_92_))
						i_99_++;
					Class59_Sub3_Sub2 class59_sub3_sub2 = new Class59_Sub3_Sub2(i_93_, i_95_, Class246_Sub1_Sub4.anInt5752, Class60.basePlane, i_99_, i_97_, Class6.getAverageHeight(i_97_, 64, (Class60.basePlane), i_98_) - i_94_, i_98_, i_91_, i_91_, i_92_, i_92_, i_96_);
					Class246_Sub29.aClass166_4968.method1101(false, new Class246_Sub1_Sub9(class59_sub3_sub2));
				}
			} else if (Class57.aClass12_809 == class12) {
				int i_100_ = Class78.packetStream.readUnsignedByte(255);
				int i_101_ = ((0x74 & i_100_) >> 4) + Class82.baseTileX;
				int i_102_ = Class106_Sub2.baseTileY - -(i_100_ & 0x7);
				int i_103_ = Class78.packetStream.readUnsignedShort((byte) -29);
				int i_104_ = Class78.packetStream.readUnsignedShort((byte) 113);
				int i_105_ = Class78.packetStream.readUnsignedShort((byte) 110);
				if (Class251.aClass85_3551 != null && (i_101_ ^ 0xffffffff) <= -1 && (i_102_ ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_101_ ^ 0xffffffff)) && i_102_ < Class152.anInt2205) {
					Class246_Sub13 class246_sub13 = ((Class246_Sub13) (Class251.aClass85_3551.method544((long) (i_101_ | (i_102_ << 14 | Class60.basePlane << 28)), 125)));
					if (class246_sub13 != null) {
						for (Class246_Sub43 class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1104(88)); class246_sub43 != null; class246_sub43 = ((Class246_Sub43) ((Class246_Sub13) class246_sub13).aClass166_4423.method1108((byte) -112))) {
							if ((((Class246_Sub43) class246_sub43).anInt5596 == (0x7fff & i_103_)) && i_104_ == (((Class246_Sub43) class246_sub43).anInt5597)) {
								class246_sub43.unlink((byte) 72);
								((Class246_Sub43) class246_sub43).anInt5597 = i_105_;
								IncomingPacket.method143(class246_sub43, i_101_, i_102_, (byte) 116, Class60.basePlane);
								break;
							}
						}
						Class254.method1645(Class60.basePlane, 1546660647, i_101_, i_102_);
					}
				}
			} else if (Class78.SEND_WORLD_OBJECT == class12) {
				int i_106_ = Class78.packetStream.readUnsigned128Byte((byte) 19);
				int i_107_ = i_106_ >> 2;
				int i_108_ = 0x3 & i_106_;
				int i_109_ = Class246_Sub19.anIntArray4712[i_107_];
				int i_110_ = Class78.packetStream.readUnsignedShort128(952968608);
				int i_111_ = Class78.packetStream.readUnsignedByte128(27574);
				int i_112_ = (0x7 & i_111_ >> 4) + Class82.baseTileX;
				int i_113_ = Class106_Sub2.baseTileY + (0x7 & i_111_);
				if (Class_j.method718(Class255_Sub1.anInt5573, -103) || ((i_112_ ^ 0xffffffff) <= -1 && (i_113_ ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_112_ ^ 0xffffffff)) && i_113_ < Class152.anInt2205))
					Class259_Sub1.method2016(i_112_, -1, i_107_, i_110_, i_109_, i_113_, -119, Class60.basePlane, i_108_, 0);
			} else if (class12 == Class16.aClass12_238) {
				int i_114_ = Class78.packetStream.readUnsignedShort((byte) -74);
				if ((i_114_ ^ 0xffffffff) == -65536)
					i_114_ = -1;
				int i_115_ = Class78.packetStream.readUnsignedByteC(-125);
				int i_116_ = (i_115_ >> 4 & 0x7) + Class82.baseTileX;
				int i_117_ = Class106_Sub2.baseTileY + (i_115_ & 0x7);
				int i_118_ = Class78.packetStream.readUnsignedByteC(-127);
				int i_119_ = i_118_ >> 2;
				int i_120_ = i_118_ & 0x3;
				int i_121_ = Class246_Sub19.anIntArray4712[i_119_];
				Class246_Sub32.method2166(Class60.basePlane, i_120_, (byte) -89, i_114_, i_121_, i_119_, i_116_, i_117_);
			} else if (Class233.aClass12_3185 == class12) {
				int i_122_ = Class78.packetStream.readUnsignedShort((byte) -27);
				int i_123_ = Class78.packetStream.readUnsignedShort((byte) -113);
				int i_124_ = Class78.packetStream.readUnsigned128Byte((byte) 124);
				int i_125_ = Class82.baseTileX + (0x7 & i_124_ >> 4);
				int i_126_ = (0x7 & i_124_) + Class106_Sub2.baseTileY;
				int i_127_ = Class78.packetStream.readUnsignedShortLE(123);
				if ((i_125_ ^ 0xffffffff) <= -1 && (i_126_ ^ 0xffffffff) <= -1 && ((Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff) < (i_125_ ^ 0xffffffff)) && Class152.anInt2205 > i_126_ && (i_123_ ^ 0xffffffff) != (Class109.anInt1567 ^ 0xffffffff)) {
					IncomingPacket.method143(new Class246_Sub43(i_122_, i_127_), i_125_, i_126_, (byte) 125, Class60.basePlane);
					Class254.method1645(Class60.basePlane, 1546660647, i_125_, i_126_);
				}
			} else {
				if (i < 35)
					method2715(false);
				if (Class169.SOME_PACKET_3 == class12) {
					int hash = Class78.packetStream.readUnsignedByte(255);
					int baseX = (hash >> 4 & 0xf) + 2 * Class82.baseTileX;
					int baseY = (0xf & hash) + 2 * Class106_Sub2.baseTileY;
					boolean bool = Class78.packetStream.readUnsignedByte(255) != 0;
					int distanceX = Class78.packetStream.readByte(false) + baseX;
					int distanceY = Class78.packetStream.readByte(false) + baseY;
					int lockOn = Class78.packetStream.method2375((byte) 1);
					int gfxId = Class78.packetStream.readUnsignedShort((byte) 118);
					int startHeight = 4 * Class78.packetStream.readUnsignedByte(255);
					int endHeight = 4 * Class78.packetStream.readUnsignedByte(255);
					int delay = Class78.packetStream.readUnsignedShort((byte) 106);
					int delayAndSpeed = Class78.packetStream.readUnsignedShort((byte) 101);
					int angle1 = Class78.packetStream.readUnsignedByte(255);
					if (angle1 == 255)
						angle1 = -1;
					int angle2 = Class78.packetStream.readUnsignedByte(255);
					if (baseX >= 0 && (baseY ^ 0xffffffff) <= -1 && baseX < Class38_Sub1_Sub1.anInt6770 * 2 && ((baseY ^ 0xffffffff) > (2 * Class38_Sub1_Sub1.anInt6770 ^ 0xffffffff)) && (distanceX ^ 0xffffffff) <= -1 && distanceY >= 0 && (distanceX ^ 0xffffffff) > (2 * Class152.anInt2205 ^ 0xffffffff) && distanceY < Class152.anInt2205 * 2 && gfxId != 65535) {
						distanceY *= 64;
						endHeight <<= 0;
						baseY = 64 * baseY;
						baseX *= 64;
						distanceX *= 64;
						startHeight <<= 0;
						Class_g class_g = (new Class_g(gfxId, Class60.basePlane, baseX, baseY, startHeight, Class246_Sub1_Sub4.anInt5752 + delay, delayAndSpeed - -Class246_Sub1_Sub4.anInt5752, angle1, angle2, lockOn, endHeight, bool));
						class_g.method2686((delay + Class246_Sub1_Sub4.anInt5752), distanceX, (-endHeight + Class6.getAverageHeight(distanceX, -96, Class60.basePlane, distanceY)), distanceY, 52);
						Class12.aClass166_180.method1101(false, new Class246_Sub1_Sub7(class_g));
					}
				} else {
					Class194_Sub1.method1883(null, "T3 - " + class12, 74);
					Class135.method917(2700);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mh.F(" + i + ',' + (class12 != null ? "{...}" : "null") + ')'));
		}
	}
}
