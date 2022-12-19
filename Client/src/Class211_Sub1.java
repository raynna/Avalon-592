
/* Class211_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

abstract class Class211_Sub1 extends Class211 {
	static int anInt5343 = -1;
	static int anInt5344;
	static byte[][] aByteArrayArray5345 = new byte[1000][];
	static int anInt5346;
	static int anInt5347;
	static Signlink aClass52_5348;
	static int anInt5349;
	static Class67 aClass67_5350 = (new Class67("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Eintr\u00e4ge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).", "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 100 para os usu\u00e1rios n\u00e3o pagantes e 200 para os membros."));
	static HashMap aClass54_5351;
	static int[] anIntArray5352 = { 1, 2, 4, 8 };
	static byte[][] aByteArrayArray5353;

	abstract Class109_Sub4 method2265(int i);

	static final void method2266(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt5346++;
			((BufferStream) Class130_Sub1.stream).position = 0;
			if (i_2_ != 4)
				method2270(true);
			Class130_Sub1.stream.writeByte(i_2_ ^ 0xfb, ((Class48) Class246_Sub1_Sub10.aClass48_6218).anInt689);
			Class130_Sub1.stream.writeByte(255, i_0_);
			Class130_Sub1.stream.writeByte(i_2_ + 251, i);
			Class130_Sub1.stream.writeShort((byte) 67, i_1_);
			Class130_Sub1.stream.writeShort((byte) 67, i_3_);
			Class59_Sub1_Sub2.anInt6125 = 0;
			Class246_Sub28_Sub30.anInt6875 = 0;
			RuntimeException_Sub2.anInt7154 = -3;
			Class197.anInt2815 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tm.L(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final Class260 method2267(byte i, Canvas canvas, int i_4_, Signlink class52, Interface6 interface6) {
		try {
			int i_5_ = 44 / ((i - 36) / 37);
			anInt5344++;
			return new qa(i_4_, canvas, interface6, class52);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tm.P(" + i + ',' + (canvas != null ? "{...}" : "null") + ',' + i_4_ + ',' + (class52 != null ? "{...}" : "null") + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class21_Sub4 method2268(int i, BufferStream stream) {
		try {
			anInt5349++;
			if (i != 2)
				return null;
			return new Class21_Sub4(stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.method2375((byte) 1), stream.read24BitInteger((byte) 29), stream.read24BitInteger((byte) 29), stream.readUnsignedByte(255));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tm.M(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2269(int i, int i_6_, byte i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			anInt5347++;
			int i_13_ = -111 / ((i_7_ - 25) / 33);
			int i_14_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_9_, Class_t.anInt1442);
			int i_15_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_12_, Class_t.anInt1442);
			int i_16_ = Class180.method1176(Class110.anInt1573, -24309, i, Class197.anInt2818);
			int i_17_ = Class180.method1176(Class110.anInt1573, -24309, i_11_, Class197.anInt2818);
			int i_18_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, i_9_ - -i_8_, Class_t.anInt1442);
			int i_19_ = Class180.method1176(Class109_Sub4.anInt4570, -24309, -i_8_ + i_12_, Class_t.anInt1442);
			for (int i_20_ = i_14_; (i_20_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_20_++)
				Class135.method918(i_16_, 126, i_6_, i_17_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_20_]));
			for (int i_21_ = i_15_; i_21_ > i_19_; i_21_--)
				Class135.method918(i_16_, -106, i_6_, i_17_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_21_]));
			int i_22_ = Class180.method1176(Class110.anInt1573, -24309, i + i_8_, Class197.anInt2818);
			int i_23_ = Class180.method1176(Class110.anInt1573, -24309, i_11_ - i_8_, Class197.anInt2818);
			for (int i_24_ = i_18_; i_24_ <= i_19_; i_24_++) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_24_];
				Class135.method918(i_16_, -15, i_6_, i_22_, is);
				Class135.method918(i_22_, 123, i_10_, i_23_, is);
				Class135.method918(i_23_, -16, i_6_, i_17_, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tm.O(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public static void method2270(boolean bool) {
		try {
			if (bool == true) {
				aClass67_5350 = null;
				aByteArrayArray5353 = null;
				anIntArray5352 = null;
				aClass54_5351 = null;
				aByteArrayArray5345 = null;
				aClass52_5348 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tm.N(" + bool + ')');
		}
	}

	static {
		aClass54_5351 = new HashMap(8);
	}
}
