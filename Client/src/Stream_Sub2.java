import jaclib.memory.Stream;

/* Stream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Stream_Sub2 extends BufferStream {
	static int anInt6181;
	static int anInt6182;
	static int anInt6183;
	static int[] anIntArray6184 = { 32, 39, 44, 47 };
	static int anInt6185;
	static int anInt6186;
	static int anInt6187;
	static int anInt6188 = 0;
	static IncomingPacket INDEX_15_SOUND_IN_PACKET = new IncomingPacket(100, 6);
	static int anInt6190;

	final void method2591(float f, int i) {
		try {
			anInt6182++;
			if (i != 1739667504)
				method2594(null, 117);
			int i_0_ = Stream.floatToRawIntBits(f);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_0_;
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_0_ >> 8);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_0_ >> 16);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_0_ >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.AC(" + f + ',' + i + ')');
		}
	}

	static final IncomingPacket[] method2592(int i) {
		try {
			int i_1_ = 114 % ((-72 - i) / 46);
			anInt6185++;
			return (new IncomingPacket[] { Class40_Sub1.aClass13_3781, Class_e.INTERFACE_TEXT_IN, Class127.FRIENDS_LIST_PACKET, Class232.aClass13_3174, Class247.aClass13_3479, Class130_Sub1.aClass13_3729, Class_ss.aClass13_7056, Class176.aClass13_2476, Class125.aClass13_1756, Class_t.SEND_SKILLS_IN, Class162.aClass13_2302, Class259_Sub3.aClass13_5356, Class246_Sub28.GLOBAL_CONFIG_BYTE, Class246_Sub28_Sub15.DECODE_MAP_REGION_IN, Class5.SEND_VAR_BIT_BYTE, Class246_Sub28_Sub34.aClass13_7007, Class99.SEND_URL_PACKET, Class246_Sub28_Sub34.aClass13_7006, Class12.aClass13_177, Class246_Sub28_Sub21.INDEX_14_SOUND_IN, Class59_Sub1_Sub2.aClass13_6132, Class129.PLAY_MUSIC_EFFECTS_IN, Class162.OPEN_INTERFACE_IN, Class127.aClass13_1791, Class246_Sub28_Sub10.aClass13_6157, Class239.SEND_IGNORE_PACKET, Class188_Sub1.aClass13_3923, Player.RUNSCRIPT_IN, Class58.WORLD_TILE_PACKET, Class246_Sub43.aClass13_5601, Class109_Sub3.aClass13_3953, Class240.aClass13_3388, Class61.SEND_UPDATE_ITEMS_IN, Class246_Sub7.aClass13_3960, Class246_Sub31.SOME_PACKET_2, ISAAC.SEND_IGNORES_LIST_PACKET, Class115.aClass13_1602, Class105.aClass13_1466, Class141.aClass13_2042, Class57.aClass13_801, Class246_Sub1_Sub4.SEND_VAR_BYTE, Class38_Sub1.HIDE_INTERFACE_COMPONENT_IN, Class246_Sub19.aClass13_4708, Class112.REMOVE_GROUND_ITEMS_PACKET, Class121.aClass13_1676, Class_a.DESTROY_WORLD_OBJECT_PACKET, Class93.aClass13_1221, Class78.SEND_GRAND_EXCHANGE_OFFER_PACKET, Class_j.aClass13_1479, Class180.aClass13_2523, Class244.aClass13_3455, Class156.aClass13_2243, Class21_Sub4.GLOBAL_CONFIG_INT, Class213.GLOBAL_STRING_1_PACKET, Class92.GLOBAL_STRING_2_PACKET, IntegerNode.aClass13_5081, Class156.aClass13_2238, Class59_Sub2.SEND_PROJECTILE_PACKET, Class240.aClass13_3386, Class_c.DYNAMIC_MAP_REGION_PACKET, Class223.aClass13_3076, Class246_Sub28_Sub23.aClass13_6654, Class68.aClass13_904, Class195.PLAY_MUSIC_IN, Class_u.aClass13_4700, Node.aClass13_3472, Class205.aClass13_2884, Class103.aClass13_1369, Class179.SEND_GROUND_ITEM_PACKET, Class59_Sub5_Sub1.aClass13_5825, Class170.SPAWN_WORLD_OBJECT_PACKET, Class43.aClass13_637, Class59_Sub2_Sub3.aClass13_6614, Class246_Sub40.aClass13_5515, Class195.PLAYER_OPTION_PACKET, Class239.aClass13_3375, Class246_Sub1_Sub18.aClass13_6858, Class40_Sub3.aClass13_4058, Class82.aClass13_1070, Class101.SEND_VAR_INT, Class246_Sub35.aClass13_5159, Class246_Sub1.SEND_CLAN_CHAT_CHANNEL_PACKET, Class3.aClass13_32, Class109.aClass13_1549, Class140.aClass13_2040, Class79_Sub1.aClass13_5167, Class142.ANIMATION_ON_INTERFACE_PACKET, Class246_Sub30_Sub1.aClass13_5763, Class224.aClass13_3094, Class109_Sub1.aClass13_3765, Class246_Sub28_Sub13.aClass13_6292, Class76.aClass13_1000, Class91.aClass13_1183, Class246_Sub27.SEND_CAMERA_SHAKE_PACKET, Class246_Sub38.aClass13_5444, Class56.PROCESS_NPC_UPDATING_IN, Class246_Sub38.aClass13_5433, Class_m.PLAYER_UPDATE_PACKET, Class149.aClass13_2190, Class34.aClass13_448, INDEX_15_SOUND_IN_PACKET, Class254.aClass13_3636, Class136.aClass13_1936, Class245.aClass13_3463, Class60.aClass13_831, Class165.aClass13_2338, Canvas_Sub1.aClass13_6890, Class245.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET, Class20.aClass13_315, Class223.aClass13_3074 });
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.UB(" + i + ')');
		}
	}

	static final void method2593(Class260 class260, byte i) {
		try {
			anInt6183++;
			if (i >= -127)
				method2593(null, (byte) -37);
			if (!Class160.aBool2263)
				Class210_Sub2.method2154((byte) -76, class260);
			else
				Class165.method1093(class260, 3);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.RB(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method2594(Player class_r_sub1, int i) {
		try {
			if (i >= -93)
				method2593(null, (byte) -4);
			anInt6190++;
			Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class187.aClass85_2651.method544((long) ((Actor) class_r_sub1).f_db, 126));
			if (class246_sub5 != null)
				class246_sub5.method1811(-2212);
			else
				Class66.method434(((Actor) class_r_sub1).f_mc[0], -1, null, class_r_sub1, ((Actor) class_r_sub1).f_nc[0], 0, ((Class59_Sub3) class_r_sub1).aByte5053, null);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.WB(" + (class_r_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2595(float f, byte i) {
		try {
			anInt6181++;
			int i_2_ = Stream.floatToRawIntBits(f);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_2_ >> 24);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_2_ >> 16);
			((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) (i_2_ >> 8);
			if (i == 98)
				((BufferStream) this).buffer[((BufferStream) this).position++] = (byte) i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.TB(" + f + ',' + i + ')');
		}
	}

	public static void method2596(int i) {
		try {
			anIntArray6184 = null;
			if (i == -8625)
				INDEX_15_SOUND_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hk.VB(" + i + ')');
		}
	}

	Stream_Sub2(int i) {
		super(i);
	}

	static final void method2597(int i, int i_3_, int i_4_, int i_5_) {
		try {
			anInt6187++;
			if (i_5_ == 0) {
				Class138 class138 = Class_a.aClass138ArrayArray1175[i][i_3_];
				Player.method2918((class138 != null ? class138 : Class22.aClass138_328), i_4_, 103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hk.SB(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
