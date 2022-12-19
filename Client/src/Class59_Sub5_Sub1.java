/* Class59_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59_Sub5_Sub1 extends Class59_Sub5 {
	int anInt5810 = -1;
	static int anInt5811;
	static int anInt5812;
	int anInt5813;
	static int anInt5814;
	static Class81 aClass81_5815 = new Class81(11, 0, 1, 2);
	static int anInt5816;
	int anInt5817;
	static int anInt5818;
	static int anInt5819;
	int anInt5820;
	int anInt5821;
	static int anInt5822;
	int anInt5823 = -1;
	static boolean aBool5824 = true;
	static IncomingPacket aClass13_5825;
	static int anInt5826 = 0;
	static int[] anIntArray5827 = new int[5];
	static boolean aBool5828 = false;
	static boolean aBool5829;

	final void method403(Class260 class260, int i) {
		do {
			try {
				anInt5819++;
				if (i >= 53)
					break;
				method2465(-74);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bv.B(" + (class260 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2462(Class130_Sub3 class130_sub3, int i) {
		try {
			anInt5812++;
			((Class130_Sub3) class130_sub3).aClass59_4414 = null;
			int i_0_ = (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415).length;
			if (i == -201) {
				for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
					((Class130_Sub5) (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[i_1_])).aBool4814 = false;
				synchronized (Class131.aClass68Array1822) {
					if (((i_0_ ^ 0xffffffff) > (Class131.aClass68Array1822.length ^ 0xffffffff)) && (Class246_Sub1_Sub7.anIntArray6027[i_0_] ^ 0xffffffff) > -201) {
						Class131.aClass68Array1822[i_0_].method438(i + 82, class130_sub3);
						Class246_Sub1_Sub7.anIntArray6027[i_0_]++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bv.C(" + (class130_sub3 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2463(byte i) {
		do {
			try {
				aClass13_5825 = null;
				aClass81_5815 = null;
				anIntArray5827 = null;
				if (i == 81)
					break;
				anInt5826 = -30;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bv.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void playerMasksHelper(int i, Stream_Sub1 stream_sub1, int i_2_, int i_3_, Player player) {
		do {
			try {
				anInt5816++;
				byte temporaryMovementType = -1;
				if ((0x40 & i ^ 0xffffffff) != -1) { // 1 face tile
					(player).anInt7133 = stream_sub1.readUnsignedShort((byte) 89);
					if ((((Actor) player).f_oc ^ 0xffffffff) == -1) {
						player.method2662(((player).anInt7133), false);
						(player).anInt7133 = -1;
					}
				}
				if ((i & 0x400 ^ 0xffffffff) != -1) {// 2 force chat
					((Actor) player).aString6429 = stream_sub1.readString((byte) -40);
					if (((Actor) player).aString6429.charAt(0) != '~') {
						if (Class_a.aClass_r_Sub1_1180 == player)
							Class67.method437(0, 2, ((Actor) player).aString6429, player.method2915(70, true), player.method2919(false, i_3_ - 1), true);
					} else {
						((Actor) player).aString6429 = ((Actor) player).aString6429.substring(1);
						Class67.method437(0, 2, ((Actor) player).aString6429, player.method2915(-105, true), player.method2919(false, 1), true);
					}
					((Actor) player).anInt6456 = 0;
					((Actor) player).anInt6471 = 150;
					((Actor) player).f_hc = 0;
				}
				if ((0x8000 & i) != 0) {// 3
					((Actor) player).f_nb = stream_sub1.read128Byte(i_3_ ^ 0x82);
					((Actor) player).f_wb = stream_sub1.readByte(false);
					((Actor) player).f_ob = stream_sub1.read128Byte(128);
					((Actor) player).anInt6466 = stream_sub1.readByte(false);
					((Actor) player).anInt6422 = (stream_sub1.readUnsignedShort((byte) 113) - -Class246_Sub1_Sub4.anInt5752);
					((Actor) player).anInt6428 = (stream_sub1.readUnsignedShort128(i_3_ ^ 0x38cd25a2) - -Class246_Sub1_Sub4.anInt5752);
					((Actor) player).f_lb = stream_sub1.readUnsignedByte128(i_3_ ^ 0x6bb4);
					((Actor) player).f_sc = 0;
					if (!(player).aBool7142) {
						((Actor) player).f_ob += ((Actor) player).f_mc[0];
						((Actor) player).f_nb += ((Actor) player).f_mc[0];
						((Actor) player).anInt6466 += ((Actor) player).f_nc[0];
						((Actor) player).f_oc = 1;
						((Actor) player).f_wb += ((Actor) player).f_nc[0];
					} else {
						((Actor) player).f_oc = 0;
						((Actor) player).f_nb += (player).f_ed;
						((Actor) player).f_wb += (player).anInt7122;
						((Actor) player).anInt6466 += (player).anInt7122;
						((Actor) player).f_ob += (player).f_ed;
					}
				}
				if ((i & 0x800 ^ 0xffffffff) != -1) {// 4 secondary hp bar
					int i_5_ = stream_sub1.readUnsignedShort128(i_3_ + 952968606);
					((Actor) player).f_vb = stream_sub1.readUnsignedByte(i_3_ ^ 0xfd);
					((Actor) player).anInt6444 = stream_sub1.readUnsignedByte128(27574);
					((Actor) player).aBool6414 = (i_5_ & 0x8000 ^ 0xffffffff) != -1;
					((Actor) player).f_jb = 0x7fff & i_5_;
					((Actor) player).f_bb = (Class246_Sub1_Sub4.anInt5752 - -((Actor) player).f_jb - -((Actor) player).f_vb);
				}
				if ((i & 0x10000 ^ 0xffffffff) != -1) {// 5
					int i_6_ = stream_sub1.readUnsignedByte(255);
					int[] is = new int[i_6_];
					int[] is_7_ = new int[i_6_];
					int[] is_8_ = new int[i_6_];
					for (int i_9_ = 0; i_6_ > i_9_; i_9_++) {
						int i_10_ = stream_sub1.readUnsignedShort((byte) 114);
						if (i_10_ == 65535)
							i_10_ = -1;
						is[i_9_] = i_10_;
						is_7_[i_9_] = stream_sub1.readUnsigned128Byte((byte) 22);
						is_8_[i_9_] = stream_sub1.readUnsignedShortLE(126);
					}
					Class209.method1370(is_8_, is_7_, player, i_3_ - 104, is);
				}
				if ((0x40000 & i) != 0) {// 6 graphics 2
					int i_11_ = stream_sub1.readUnsignedShortLE(123);
					if ((i_11_ ^ 0xffffffff) == -65536)
						i_11_ = -1;
					int i_12_ = stream_sub1.readIntV2(31);
					int i_13_ = stream_sub1.readUnsignedByteC(-103);
					player.sendSpotAnimation(0, i_13_, i_12_, true, i_11_);
				}
				if ((0x1 & i ^ 0xffffffff) != -1)// 7 movement types
					Class234.movementTypes[i_2_] = stream_sub1.readByteC(0);

				if ((i_3_ & i ^ 0xffffffff) != -1) {// 8 face entity 0x2
					int index = stream_sub1.readUnsignedShortLE128((byte) 55);
					if (index == 65535)
						index = -1;
					((Actor) player).faceEntity = index;
				}
				if ((i & 0x80) != 0) { // 9 chat
					int i_15_ = stream_sub1.readUnsignedShort128(952968608);
					int i_16_ = stream_sub1.readUnsignedByte128(i_3_ + 27572);
					int i_17_ = stream_sub1.readUnsignedByte128(27574);
					int i_18_ = ((BufferStream) stream_sub1).position;
					boolean bool = (i_15_ & 0x8000) != 0;
					if ((player).aString7140 != null && ((player).aClass27_7131 != null)) {
						boolean bool_19_ = false;
						if ((i_16_ ^ 0xffffffff) >= -2) {
							if (!bool && (Class59.aBool820 && !Class_u.aBool4703 || Class168.aBool2395))
								bool_19_ = true;
							else if (Class129.method881(((player).aString7140), false))
								bool_19_ = true;
						}
						if (!bool_19_ && (Class37.anInt551 ^ 0xffffffff) == -1) {
							((BufferStream) Class82.aStream1071).position = 0;
							stream_sub1.readBytes((byte) 22, i_17_, 0, (((BufferStream) Class82.aStream1071).buffer));
							((BufferStream) Class82.aStream1071).position = 0;
							int i_20_ = -1;
							String string;
							if (bool) {
								i_15_ &= 0x7fff;
								Class244 class244 = Class40_Sub9.method2304((Class82.aStream1071), (byte) -114);
								i_20_ = ((Class244) class244).anInt3449;
								string = (((Class244) class244).aClass246_Sub1_Sub3_3450.method2436(Class82.aStream1071, -127));
							} else
								string = (Class59_Sub3_Sub1.method2443(Class140.method940(false, (Class82.aStream1071)), (byte) 68));
							((Actor) player).aString6429 = string.trim();
							((Actor) player).anInt6471 = 150;
							((Actor) player).anInt6456 = i_15_ & 0xff;
							((Actor) player).f_hc = i_15_ >> 8;
							int i_21_;
							if ((i_16_ ^ 0xffffffff) == -2 || (i_16_ ^ 0xffffffff) == -3)
								i_21_ = !bool ? 1 : 17;
							else
								i_21_ = !bool ? 2 : 17;
							if (i_16_ == 2)
								Class241.method1545((byte) 109, i_20_, ("<img=1>" + player.method2919(false, i_3_ - 1)), string, null, 0, ("<img=1>" + player.method2915(i_3_ ^ ~0x6c, true)), i_21_);
							else if ((i_16_ ^ 0xffffffff) != -2)
								Class241.method1545((byte) 120, i_20_, player.method2919(false, 1), string, null, 0, player.method2915(-113, true), i_21_);
							else
								Class241.method1545((byte) 111, i_20_, "<img=0>" + player.method2919(false, 1), string, null, 0, "<img=0>" + player.method2915(5, true), i_21_);
						}
					}
					((BufferStream) stream_sub1).position = i_17_ + i_18_;
				}
				if ((i & 0x1000) != 0) { // 10 graphics 1
					int i_22_ = stream_sub1.readUnsignedShortLE(119);
					if (i_22_ == 65535)
						i_22_ = -1;
					int i_23_ = stream_sub1.readInt((byte) 86);
					int i_24_ = stream_sub1.readUnsigned128Byte((byte) 9);
					player.sendSpotAnimation(0, i_24_, i_23_, false, i_22_);
				}
				if ((0x8 & i ^ 0xffffffff) != -1) { // 11 animation
					int i_25_ = stream_sub1.readUnsignedShort((byte) -51);
					if (i_25_ == 65535)
						i_25_ = -1;
					int i_26_ = stream_sub1.readUnsignedByte(255);
					Class246_Sub2.method1789(i_26_, player, false, i_25_);
				}
				if ((0x20000 & i) != 0) { // 12
					((Actor) player).aByte6468 = stream_sub1.readByteC(0);
					((Actor) player).aByte6436 = stream_sub1.read128Byte(128);
					((Actor) player).f_mb = stream_sub1.readByte(false);
					((Actor) player).aByte6425 = (byte) stream_sub1.readUnsigned128Byte((byte) 127);
					((Actor) player).anInt6424 = (Class246_Sub1_Sub4.anInt5752 - -stream_sub1.readUnsignedShort128(952968608));
					((Actor) player).anInt6460 = (Class246_Sub1_Sub4.anInt5752 - -stream_sub1.readUnsignedShortLE(i_3_ ^ 0x7c));
				}
				if ((i & 0x200 ^ 0xffffffff) != -1) // 13 temp
					temporaryMovementType = stream_sub1.readByteC(0);

				if ((i & 0x10 ^ 0xffffffff) != -1) { // 14 hits 1
					int i_27_ = stream_sub1.readSmart((byte) 82);
					int i_28_ = stream_sub1.readUnsignedByte128(i_3_ + 27572);
					player.method2665(73, i_27_, Class246_Sub1_Sub4.anInt5752, i_28_);
					((Actor) player).anInt6464 = Class246_Sub1_Sub4.anInt5752 + 300;
					((Actor) player).anInt6432 = stream_sub1.readUnsignedByte128(27574);
				}
				if ((i & 0x4000 ^ 0xffffffff) != -1) // 15
					(player).aBool7129 = stream_sub1.readUnsignedByte128(27574) == 1;

				if ((i & 0x20 ^ 0xffffffff) != -1) { // player appearance 16
					int i_29_ = stream_sub1.readUnsignedByte(255);
					byte[] is = new byte[i_29_];
					BufferStream stream = new BufferStream(is);
					stream_sub1.readBytes((byte) 22, i_29_, 0, is);
					Class197.aStreamArray2770[i_2_] = stream;
					player.readAppearance(stream, -2147483648);
				}
				if ((i & 0x100 ^ 0xffffffff) != -1) { // 17 hits 2
					int i_30_ = Class246_Sub1_Sub4.anInt5752;
					int i_31_ = stream_sub1.readSmart((byte) 115);
					int i_32_ = stream_sub1.readUnsigned128Byte((byte) -66);
					player.method2665(66, i_31_, i_30_, i_32_);
				}
				if (!(player).aBool7142)
					break;
				if ((temporaryMovementType ^ 0xffffffff) == -128)
					player.method2913(((player).anInt7122), i_3_ ^ 0x2, ((player).f_ed));
				else {
					byte i_33_;
					if ((temporaryMovementType ^ 0xffffffff) != 0)
						i_33_ = temporaryMovementType;
					else
						i_33_ = Class234.movementTypes[i_2_];
					player.method2910(i_33_, ((player).anInt7122), (player).f_ed, 1);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bv.G(" + i + ',' + (stream_sub1 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + (player != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final boolean method409(int i, int i_34_, Class260 class260, int i_35_) {
		try {
			anInt5811++;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub5) this).anInt5405, ((Class59_Sub5) this).anInt5397, ((Class59_Sub5) this).anInt5395);
			Class_t class_t = (Class255.aClass191_3663.method1251(22883, ((Class59_Sub5_Sub1) this).anInt5820).method1281(0, ((Class59_Sub5_Sub1) this).anInt5821, null, 131072, -1, null, i_34_, -125, class260));
			if (class_t != null && class_t.method685(i_35_, i, class_c, true))
				return true;
			if ((((Class59_Sub5_Sub1) this).anInt5823 ^ 0xffffffff) != 0) {
				class_t = (Class255.aClass191_3663.method1251(22883, ((Class59_Sub5_Sub1) this).anInt5823).method1281(0, ((Class59_Sub5_Sub1) this).anInt5817, null, 131072, -1, null, 0, i_34_ - 128, class260));
				if (class_t != null && class_t.method685(i_35_, i, class_c, true))
					return true;
			}
			if (((Class59_Sub5_Sub1) this).anInt5810 != -1) {
				class_t = (Class255.aClass191_3663.method1251(i_34_ ^ 0x5963, ((Class59_Sub5_Sub1) this).anInt5810).method1281(0, ((Class59_Sub5_Sub1) this).anInt5813, null, 131072, -1, null, 0, -127, class260));
				if (class_t != null && class_t.method685(i_35_, i, class_c, true))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("bv.A(" + i + ',' + i_34_ + ',' + (class260 != null ? "{...}" : "null") + ',' + i_35_ + ')'));
		}
	}

	final Class130_Sub3 method407(Class260 class260, int i) {
		try {
			anInt5814++;
			Class_c class_c = class260.method1730();
			class_c.j(((Class59_Sub5) this).anInt5405, ((Class59_Sub5) this).anInt5397, ((Class59_Sub5) this).anInt5395);
			Class130_Sub3 class130_sub3 = Class18.method177(3, (byte) -95);
			if (i >= -87)
				((Class59_Sub5_Sub1) this).anInt5823 = -11;
			if ((((Class59_Sub5_Sub1) this).anInt5810 ^ 0xffffffff) != 0) {
				Class_t class_t = (Class255.aClass191_3663.method1251(22883, ((Class59_Sub5_Sub1) this).anInt5810).method1281(0, ((Class59_Sub5_Sub1) this).anInt5813, null, 2048, -1, null, 0, -126, class260));
				if (class_t != null)
					class_t.method680(class_c, (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[2]), 0);
			}
			if (((Class59_Sub5_Sub1) this).anInt5823 != -1) {
				Class_t class_t = (Class255.aClass191_3663.method1251(22883, ((Class59_Sub5_Sub1) this).anInt5823).method1281(0, ((Class59_Sub5_Sub1) this).anInt5817, null, 2048, -1, null, 0, -122, class260));
				if (class_t != null)
					class_t.method680(class_c, (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[1]), 0);
			}
			Class_t class_t = (Class255.aClass191_3663.method1251(22883, ((Class59_Sub5_Sub1) this).anInt5820).method1281(0, ((Class59_Sub5_Sub1) this).anInt5821, null, 2048, -1, null, 0, -121, class260));
			if (class_t != null)
				class_t.method680(class_c, (((Class130_Sub3) class130_sub3).aClass130_Sub5Array4415[0]), 0);
			return class130_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bv.H(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2465(int i) {
		do {
			try {
				Class163.aClass166_2305.method1102(-128);
				anInt5822++;
				for (Class246_Sub35 class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1104(i ^ ~0x63)); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) Class108.aClass166_1525.method1108((byte) -112))) {
					if ((((Class246_Sub35) class246_sub35).anInt5156 ^ 0xffffffff) > -1001) {
						class246_sub35.unlink((byte) 67);
						Class163.aClass166_2305.method1101(false, class246_sub35);
					}
				}
				Class163.aClass166_2305.method1113(Class108.aClass166_1525, (byte) -89);
				int i_36_ = i;
				Class246_Sub30 class246_sub30 = (Class246_Sub30) Class235.f_qb.method1104(79);
				if (class246_sub30 != null)
					i_36_ = class246_sub30.method2157((byte) 102);
				if (!Class246_Sub28_Sub21.aBool6580) {
					if (i_36_ == 0 && (((Class59_Sub3_Sub2.anInt5889 ^ 0xffffffff) == -2 && (Class230.anInt3147 ^ 0xffffffff) < -3) || Class84.method535((byte) -20)))
						i_36_ = 2;
					if ((i_36_ ^ 0xffffffff) == -3 && (Class230.anInt3147 ^ 0xffffffff) < -1 && class246_sub30 != null) {
						if (Class150.aClass235_2196 != null || Class59_Sub3_Sub2.f_db != 0)
							Class103.anInt1365 = 2;
						else
							Class59_Sub4_Sub2.method2826(i - 66, class246_sub30.method2161((byte) -72), class246_sub30.method2160(i ^ ~0x17));
					}
					if (i_36_ == 0 && (Class230.anInt3147 ^ 0xffffffff) < -1)
						Class126.method865((byte) -102);
					if (Class150.aClass235_2196 == null && (Class59_Sub3_Sub2.f_db ^ 0xffffffff) == -1) {
						Class103.anInt1365 = 0;
						Class235.f_tc = null;
					}
				} else {
					if (i_36_ == -1) {
						int i_37_ = Class238.aClass102_3360.method640((byte) 58);
						int i_38_ = Class238.aClass102_3360.method636(3045);
						if (((-10 + IntegerNode.anInt5082 ^ 0xffffffff) < (i_37_ ^ 0xffffffff)) || i_37_ > (10 + Class94.anInt1233 + IntegerNode.anInt5082) || ((-10 + Class93.anInt1226 ^ 0xffffffff) < (i_38_ ^ 0xffffffff)) || i_38_ > (Class246_Sub13.anInt4419 + (Class93.anInt1226 + 10))) {
							Class246_Sub28_Sub21.aBool6580 = false;
							Class162.method1075(IntegerNode.anInt5082, true, Class246_Sub13.anInt4419, Class94.anInt1233, Class93.anInt1226);
						}
					}
					if ((i_36_ ^ 0xffffffff) != -1)
						break;
					int i_39_ = IntegerNode.anInt5082;
					int i_40_ = Class93.anInt1226;
					int i_41_ = Class94.anInt1233;
					int i_42_ = class246_sub30.method2160(i ^ 0x5a);
					int i_43_ = class246_sub30.method2161((byte) -110);
					int i_44_ = -1;
					for (int i_45_ = 0; i_45_ < Class230.anInt3147; i_45_++) {
						if (Class160.aBool2263) {
							int i_46_ = (33 + i_40_ + (-i_45_ - 1 + Class230.anInt3147) * 16);
							if ((i_42_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff) && (i_42_ ^ 0xffffffff) > (i_39_ + i_41_ ^ 0xffffffff) && i_43_ > -13 + i_46_ && i_43_ < 4 + i_46_)
								i_44_ = i_45_;
						} else {
							int i_47_ = i_40_ + (31 - -(16 * (-1 + Class230.anInt3147 - i_45_)));
							if (i_39_ < i_42_ && i_41_ + i_39_ > i_42_ && (i_47_ - 13 ^ 0xffffffff) > (i_43_ ^ 0xffffffff) && i_47_ + 3 > i_43_)
								i_44_ = i_45_;
						}
					}
					if ((i_44_ ^ 0xffffffff) != 0) {
						int i_48_ = 0;
						Class51 class51 = new Class51(Class108.aClass166_1525);
						for (Class246_Sub35 class246_sub35 = (Class246_Sub35) class51.method333(true); class246_sub35 != null; class246_sub35 = ((Class246_Sub35) class51.method334((byte) 61))) {
							if (i_48_ == i_44_)
								Class134.method909(i_43_, class246_sub35, i_42_, true);
							i_48_++;
						}
					}
					Class246_Sub28_Sub21.aBool6580 = false;
					Class162.method1075(IntegerNode.anInt5082, true, Class246_Sub13.anInt4419, Class94.anInt1233, Class93.anInt1226);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bv.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class59_Sub5_Sub1() {
		/* empty */
	}

	static {
		aClass13_5825 = new IncomingPacket(69, -1);
		aBool5829 = true;
	}
}
