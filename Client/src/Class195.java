/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class195 {
	int[] anIntArray2726;
	static int anInt2727 = 0;
	int anInt2728;
	int[] anIntArray2729;
	int[] anIntArray2730;
	static int anInt2731;
	static IncomingPacket PLAYER_OPTION_PACKET = new IncomingPacket(74, -1);
	int[][] anIntArrayArray2733;
	int[][] anIntArrayArray2734;
	int[] anIntArray2735;
	int anInt2736;
	Class223 aClass223_2737;
	int anInt2738;
	int anInt2739;
	static int anInt2740;
	Class223[] aClass223Array2741;
	int[] anIntArray2742;
	static int anInt2743;
	static int anInt2744;
	static Class177 aClass177_2745;
	static OutgoingPacket aClass201_2746 = new OutgoingPacket(71, 2);
	static IncomingPacket PLAY_MUSIC_IN = new IncomingPacket(63, 4);
	int[] anIntArray2748;

	private final void method1275(byte[] is, int i) {
		do {
			try {
				anInt2744++;
				BufferStream stream = new BufferStream(Class130_Sub8.method2349(is, false));
				int i_0_ = stream.readUnsignedByte(255);
				if ((i_0_ ^ 0xffffffff) != -6 && i_0_ != 6)
					throw new RuntimeException();
				if (i_0_ >= 6)
					((Class195) this).anInt2739 = stream.readInt((byte) 125);
				else
					((Class195) this).anInt2739 = 0;
				int i_1_ = stream.readUnsignedByte(255);
				((Class195) this).anInt2728 = stream.readUnsignedShort((byte) -58);
				int i_2_ = 0;
				((Class195) this).anIntArray2735 = new int[((Class195) this).anInt2728];
				int i_3_ = -1;
				for (int i_4_ = 0; ((((Class195) this).anInt2728 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
					((Class195) this).anIntArray2735[i_4_] = i_2_ += stream.readUnsignedShort((byte) -62);
					if (i_3_ < ((Class195) this).anIntArray2735[i_4_])
						i_3_ = ((Class195) this).anIntArray2735[i_4_];
				}
				((Class195) this).anInt2738 = i + i_3_;
				((Class195) this).anIntArray2729 = new int[((Class195) this).anInt2738];
				((Class195) this).anIntArray2748 = new int[((Class195) this).anInt2738];
				((Class195) this).anIntArray2730 = new int[((Class195) this).anInt2738];
				((Class195) this).anIntArray2726 = new int[((Class195) this).anInt2738];
				((Class195) this).anIntArrayArray2733 = new int[((Class195) this).anInt2738][];
				if (i_1_ != 0) {
					((Class195) this).anIntArray2742 = new int[((Class195) this).anInt2738];
					for (int i_5_ = 0; ((((Class195) this).anInt2738 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++)
						((Class195) this).anIntArray2742[i_5_] = -1;
					for (int i_6_ = 0; ((Class195) this).anInt2728 > i_6_; i_6_++)
						((Class195) this).anIntArray2742[((Class195) this).anIntArray2735[i_6_]] = stream.readInt((byte) 88);
					((Class195) this).aClass223_2737 = new Class223(((Class195) this).anIntArray2742);
				}
				for (int i_7_ = 0; ((((Class195) this).anInt2728 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++)
					((Class195) this).anIntArray2730[(((Class195) this).anIntArray2735[i_7_])] = stream.readInt((byte) 112);
				for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (((Class195) this).anInt2728 ^ 0xffffffff)); i_8_++)
					((Class195) this).anIntArray2729[(((Class195) this).anIntArray2735[i_8_])] = stream.readInt((byte) 108);
				for (int i_9_ = 0; i_9_ < ((Class195) this).anInt2728; i_9_++)
					((Class195) this).anIntArray2726[(((Class195) this).anIntArray2735[i_9_])] = stream.readUnsignedShort((byte) 105);
				for (int i_10_ = 0; i_10_ < ((Class195) this).anInt2728; i_10_++) {
					int i_11_ = ((Class195) this).anIntArray2735[i_10_];
					i_2_ = 0;
					int i_12_ = ((Class195) this).anIntArray2726[i_11_];
					int i_13_ = -1;
					((Class195) this).anIntArrayArray2733[i_11_] = new int[i_12_];
					for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_14_++) {
						int i_15_ = (((Class195) this).anIntArrayArray2733[i_11_][i_14_] = i_2_ += stream.readUnsignedShort((byte) 85));
						if (i_13_ < i_15_)
							i_13_ = i_15_;
					}
					((Class195) this).anIntArray2748[i_11_] = 1 + i_13_;
					if ((i_12_ ^ 0xffffffff) == (i_13_ + 1 ^ 0xffffffff))
						((Class195) this).anIntArrayArray2733[i_11_] = null;
				}
				if ((i_1_ ^ 0xffffffff) == -1)
					break;
				((Class195) this).aClass223Array2741 = new Class223[i_3_ + 1];
				((Class195) this).anIntArrayArray2734 = new int[i_3_ + 1][];
				for (int i_16_ = 0; i_16_ < ((Class195) this).anInt2728; i_16_++) {
					int i_17_ = ((Class195) this).anIntArray2735[i_16_];
					int i_18_ = ((Class195) this).anIntArray2726[i_17_];
					((Class195) this).anIntArrayArray2734[i_17_] = new int[((Class195) this).anIntArray2748[i_17_]];
					for (int i_19_ = 0; i_19_ < ((Class195) this).anIntArray2748[i_17_]; i_19_++)
						((Class195) this).anIntArrayArray2734[i_17_][i_19_] = -1;
					for (int i_20_ = 0; i_18_ > i_20_; i_20_++) {
						int i_21_;
						if (((Class195) this).anIntArrayArray2733[i_17_] == null)
							i_21_ = i_20_;
						else
							i_21_ = (((Class195) this).anIntArrayArray2733[i_17_][i_20_]);
						((Class195) this).anIntArrayArray2734[i_17_][i_21_] = stream.readInt((byte) 91);
					}
					((Class195) this).aClass223Array2741[i_17_] = new Class223(((Class195) this).anIntArrayArray2734[i_17_]);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rt.C(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method1276(boolean bool, int i) {
		do {
			try {
				if (Class120.anIntArray1649 == null || (i ^ 0xffffffff) < (Class120.anIntArray1649.length ^ 0xffffffff))
					Class120.anIntArray1649 = new int[i];
				anInt2743++;
				if (bool == false)
					break;
				aClass201_2746 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rt.B(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1277(int i) {
		do {
			try {
				aClass177_2745 = null;
				PLAY_MUSIC_IN = null;
				PLAYER_OPTION_PACKET = null;
				aClass201_2746 = null;
				if (i == -14932)
					break;
				aClass177_2745 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rt.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class195(byte[] is, int i) {
		try {
			((Class195) this).anInt2736 = Class_o.method2945((byte) 54, is.length, is);
			if (((Class195) this).anInt2736 != i)
				throw new RuntimeException();
			method1275(is, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rt.<init>(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
