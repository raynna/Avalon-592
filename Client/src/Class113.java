/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class113 {
	static int anInt1591;
	static int anInt1592;
	static OutgoingPacket ADD_FRIEND_PACKET = new OutgoingPacket(50, -1);
	static int anInt1594;
	static Class85 aClass85_1595 = new Class85(512);

	static final CS2Script getScript(int id, int i_0_) {
		try {
			anInt1591++;
			CS2Script script = ((CS2Script) Class109_Sub3.aClass127_3957.method872((long) id, (byte) 63));
			if (script != null)
				return script;
			if (i_0_ < 48)
				decodeDynamicRegion(-63);
			byte[] is = Class246_Sub28_Sub17.index12.method91(0, id, 113);
			if (is == null || is.length <= 1)
				return null;
			script = Class122.decode((byte) 112, is);
			Class109_Sub3.aClass127_3957.method869((long) id, script, -8869);
			return script;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kn.D(" + id + ',' + i_0_ + ')');
		}
	}

	static boolean method774(boolean bool, boolean bool_1_) {
		try {
			return bool | bool_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kn.A(" + bool + ',' + bool_1_ + ')');
		}
	}

	public static void method775(byte i) {
		do {
			try {
				aClass85_1595 = null;
				ADD_FRIEND_PACKET = null;
				if (i <= -39)
					break;
				aClass85_1595 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kn.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void decodeDynamicRegion(int i) {
		try {
			Class255_Sub1.anInt5573 = Class78.packetStream.readUnsignedByte(i - 9839);
			if (i != 10094)
				ADD_FRIEND_PACKET = null;
			anInt1592++;
			int chunkY = Class78.packetStream.readUnsignedShortLE128((byte) 55);
			boolean forceRefresh = Class78.packetStream.readUnsigned128Byte((byte) -105) == 1;
			int chunkX = Class78.packetStream.readUnsignedShort128(i + 952958514);
			int mapSize = Class78.packetStream.readUnsigned128Byte((byte) 127);
			Class246_Sub28_Sub24.method2740((byte) 52, mapSize);
			Class78.packetStream.method2477(-934);
			for (int i_5_ = 0; i_5_ < 4; i_5_++) {
				for (int i_6_ = 0; Class38_Sub1_Sub1.anInt6770 >> 3 > i_6_; i_6_++) {
					for (int i_7_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
						int i_8_ = Class78.packetStream.readBits(-126, 1);
						if (i_8_ == 1)
							Class172.anIntArrayArrayArray2431[i_5_][i_6_][i_7_] = Class78.packetStream.readBits(-120, 26);
						else
							Class172.anIntArrayArrayArray2431[i_5_][i_6_][i_7_] = -1;
					}
				}
			}
			Class78.packetStream.method2476((byte) -120);
			int i_9_ = ((Class130_Sub1_Sub1.anInt7046 - ((BufferStream) Class78.packetStream).position) / 16);
			Class_t.anIntArrayArray1441 = new int[i_9_][4];
			for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++)
					Class_t.anIntArrayArray1441[i_10_][i_11_] = Class78.packetStream.readInt((byte) 98);
			}
			Class95.anIntArray1251 = null;
			Class168.anIntArray2398 = new int[i_9_];
			Class211_Sub1.aByteArrayArray5353 = new byte[i_9_][];
			Class246_Sub5.aByteArrayArray3885 = null;
			Class121.anIntArray1673 = new int[i_9_];
			Class246_Sub1_Sub7.anIntArray6032 = new int[i_9_];
			Class134.aByteArrayArray1853 = new byte[i_9_][];
			Class101.anIntArray1317 = new int[i_9_];
			Class247.aByteArrayArray3478 = new byte[i_9_][];
			Class59_Sub1_Sub3.aByteArrayArray6347 = new byte[i_9_][];
			Class189.anIntArray2674 = new int[i_9_];
			i_9_ = 0;
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				for (int i_13_ = 0; ((Class38_Sub1_Sub1.anInt6770 >> 3 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
					for (int i_14_ = 0; ((Class152.anInt2205 >> 3 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
						int i_15_ = (Class172.anIntArrayArrayArray2431[i_12_][i_13_][i_14_]);
						if ((i_15_ ^ 0xffffffff) != 0) {
							int i_16_ = (i_15_ & 0xffe53f) >> 14;
							int i_17_ = (0x3ffd & i_15_) >> 3;
							int i_18_ = i_17_ / 8 + (i_16_ / 8 << 8);
							for (int i_19_ = 0; i_9_ > i_19_; i_19_++) {
								if (Class168.anIntArray2398[i_19_] == i_18_) {
									i_18_ = -1;
									break;
								}
							}
							if ((i_18_ ^ 0xffffffff) != 0) {
								Class168.anIntArray2398[i_9_] = i_18_;
								int i_20_ = (0xffc5 & i_18_) >> 8;
								int i_21_ = 0xff & i_18_;
								Class121.anIntArray1673[i_9_] = (Class246_Sub7.index5.method86("m" + i_20_ + "_" + i_21_, (byte) 125));
								Class189.anIntArray2674[i_9_] = (Class246_Sub7.index5.method86("l" + i_20_ + "_" + i_21_, (byte) -79));
								Class246_Sub1_Sub7.anIntArray6032[i_9_] = (Class246_Sub7.index5.method86("um" + i_20_ + "_" + i_21_, (byte) -112));
								Class101.anIntArray1317[i_9_] = (Class246_Sub7.index5.method86("ul" + i_20_ + "_" + i_21_, (byte) -112));
								i_9_++;
							}
						}
					}
				}
			}
			Class170.method1125(false, (byte) 104, chunkY, chunkX, forceRefresh);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kn.B(" + i + ')');
		}
	}
}
