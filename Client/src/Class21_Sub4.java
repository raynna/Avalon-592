
/* Class21_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class21_Sub4 extends Class21 {
	private int anInt4919;
	static int anInt4920;
	static IncomingPacket GLOBAL_CONFIG_INT = new IncomingPacket(52, 8);
	static int anInt4922;
	private int anInt4923;
	static int[] anIntArray4924;
	private int anInt4925;
	static int anInt4926;
	private int anInt4927;
	static int anInt4928;
	static int anInt4929;
	static OutgoingPacket PLAYER_OPTION_2_PACKET = new OutgoingPacket(41, 3);

	public static void method2129(boolean bool) {
		try {
			if (bool == false) {
				anIntArray4924 = null;
				GLOBAL_CONFIG_INT = null;
				PLAYER_OPTION_2_PACKET = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ob.H(" + bool + ')');
		}
	}

	static final Class260 method2130(int i, Canvas canvas, int i_0_, Signlink class52, int i_1_, Interface6 interface6) {
		try {
			anInt4928++;
			if (i_0_ != -3210)
				return null;
			return new Class260_Sub2(i, canvas, interface6, i_1_, class52);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ob.G(" + i + ',' + (canvas != null ? "{...}" : "null") + ',' + i_0_ + ',' + (class52 != null ? "{...}" : "null") + ',' + i_1_ + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method199(int i, int i_2_, int i_3_) {
		try {
			anInt4929++;
			int i_4_ = anInt4919 * i_3_ >> 12;
			int i_5_ = i_3_ * anInt4925 >> 12;
			int i_6_ = i * anInt4927 >> 12;
			int i_7_ = anInt4923 * i >> 12;
			if (i_2_ == 4)
				Class48.method321((byte) -125, i_6_, i_5_, ((Class21) this).anInt321, i_4_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ob.B(" + i + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2131(long l, byte i) {
		try {
			if (i >= 22) {
				anInt4920++;
				((BufferStream) Class130_Sub1.stream).position = 0;
				Class130_Sub1.stream.writeByte(255, ((Class48) Class246_Sub1_Sub10.aClass48_6219).anInt689);
				Class130_Sub1.stream.writeLong(l, (byte) -48);
				Class246_Sub28_Sub30.anInt6875 = 0;
				Class59_Sub1_Sub2.anInt6125 = 0;
				Class197.anInt2815 = 1;
				RuntimeException_Sub2.anInt7154 = -3;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ob.I(" + l + ',' + i + ')');
		}
	}

	final void method196(int i, int i_8_, int i_9_) {
		try {
			anInt4922++;
			int i_10_ = anInt4919 * i_9_ >> 12;
			if (i > -78)
				PLAYER_OPTION_2_PACKET = null;
			int i_11_ = anInt4925 * i_9_ >> 12;
			int i_12_ = anInt4927 * i_8_ >> 12;
			int i_13_ = anInt4923 * i_8_ >> 12;
			Class128.method874(((Class21) this).anInt317, ((Class21) this).anInt319, i_10_, ((Class21) this).anInt321, i_12_, i_11_, 19173, i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ob.D(" + i + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final void method2132(Class260 class260) {
		for (int i = Class246_Sub37_Sub4.anInt6880; i < Class154_Sub1.anInt4803; i++) {
			for (int i_14_ = 0; i_14_ < Class240.anInt3377; i_14_++) {
				for (int i_15_ = 0; i_15_ < Class_t_Sub1.f_sc; i_15_++) {
					Class147 class147 = (Class106.aClass147ArrayArrayArray1494[i][i_14_][i_15_]);
					if (class147 != null) {
						Class59_Sub4 class59_sub4 = ((Class147) class147).aClass59_Sub4_2172;
						Class59_Sub4 class59_sub4_16_ = ((Class147) class147).aClass59_Sub4_2152;
						if (class59_sub4 != null && class59_sub4.method406((byte) 108)) {
							Class246_Sub28_Sub8.method2560(class260, class59_sub4, i, i_14_, i_15_, 1, 1);
							if (class59_sub4_16_ != null && class59_sub4_16_.method406((byte) 123)) {
								Class246_Sub28_Sub8.method2560(class260, class59_sub4_16_, i, i_14_, i_15_, 1, 1);
								class59_sub4_16_.method405(0, 0, class59_sub4, (byte) -99, false, class260, 0);
								class59_sub4_16_.method401(102);
							}
							class59_sub4.method401(-101);
						}
						for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
							Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
							if (class59_sub3 != null && class59_sub3.method406((byte) 109)) {
								Class246_Sub28_Sub8.method2560(class260, class59_sub3, i, i_14_, i_15_, (((Class59_Sub3) class59_sub3).aShort5065 - (((Class59_Sub3) class59_sub3).aShort5057) + 1), (((Class59_Sub3) class59_sub3).aShort5062 - (((Class59_Sub3) class59_sub3).aShort5064) + 1));
								class59_sub3.method401(-92);
							}
						}
						Class59_Sub1 class59_sub1 = ((Class147) class147).aClass59_Sub1_2156;
						if (class59_sub1 != null && class59_sub1.method406((byte) 123)) {
							Class140.method951(class260, class59_sub1, i, i_14_, i_15_);
							class59_sub1.method401(8);
						}
					}
				}
			}
		}
	}

	Class21_Sub4(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		super(i_20_, i_21_, i_22_);
		try {
			anInt4919 = i;
			anInt4925 = i_18_;
			anInt4923 = i_19_;
			anInt4927 = i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ob.<init>(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	final void method195(int i, int i_23_, int i_24_) {
		do {
			try {
				anInt4926++;
				if (i == 24245)
					break;
				GLOBAL_CONFIG_INT = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ob.E(" + i + ',' + i_23_ + ',' + i_24_ + ')'));
			}
			break;
		} while (false);
	}
}
