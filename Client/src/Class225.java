
/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class225 {
	static int[] anIntArray3097;
	static float aFloat3098;
	static int anInt3099;
	static int anInt3100;
	static int[] anIntArray3101;
	static int[] anIntArray3102;
	static int anInt3103 = 0;
	static int[] anIntArray3104;
	int anInt3105 = 1;
	static String[] aStringArray3106;
	static int anInt3107;
	char aChar3108;
	static int anInt3109 = 50;
	static int[] anIntArray3110;
	static int[] anIntArray3111;
	static int anInt3112;

	final void method1447(BufferStream stream, byte i) {
		try {
			for (;;) {
				int i_0_ = stream.readUnsignedByte(255);
				if ((i_0_ ^ 0xffffffff) == -1)
					break;
				method1451((byte) 127, i_0_, stream);
			}
			int i_1_ = -26 / ((-52 - i) / 37);
			anInt3099++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uh.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1448(byte i) {
		try {
			anIntArray3110 = null;
			if (i != -102)
				method1448((byte) -58);
			anIntArray3104 = null;
			anIntArray3102 = null;
			anIntArray3101 = null;
			anIntArray3111 = null;
			anIntArray3097 = null;
			aStringArray3106 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uh.A(" + i + ')');
		}
	}

	static final void method1449(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			for (int i_6_ = i_4_; i_6_ < Class124.anInt1738; i_6_++) {
				Rectangle rectangle = Class246_Sub28_Sub22.aRectangleArray6629[i_6_];
				if (i_5_ < rectangle.width + rectangle.x && i + i_5_ > rectangle.x && ((rectangle.height + rectangle.y ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) && (i_2_ + i_3_ ^ 0xffffffff) < (rectangle.y ^ 0xffffffff))
					Class246_Sub28_Sub24.aBoolArray6673[i_6_] = true;
			}
			anInt3100++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uh.E(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final Class246_Sub2 method1450(boolean bool) {
		try {
			anInt3107++;
			if (Class79.aClass166_1034 == null || Class168.aClass51_2393 == null)
				return null;
			Class168.aClass51_2393.method337(Class79.aClass166_1034, -101);
			Class246_Sub2 class246_sub2 = (Class246_Sub2) Class168.aClass51_2393.method333(bool);
			if (class246_sub2 == null)
				return null;
			Class140 class140 = Class79.aClass165_1022.method1088(((Class246_Sub2) class246_sub2).anInt3808, (byte) -41);
			if (class140 != null && ((Class140) class140).aBool1991 && class140.method942(-11247, Class79.anInterface11_1025))
				return class246_sub2;
			return Class99.method627(-2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uh.B(" + bool + ')');
		}
	}

	public Class225() {
		/* empty */
	}

	private final void method1451(byte i, int i_7_, BufferStream stream) {
		try {
			do {
				if ((i_7_ ^ 0xffffffff) == -2) {
					((Class225) this).aChar3108 = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte(false));
					if (!client.f_ob)
						break;
				}
				if (i_7_ == 2)
					((Class225) this).anInt3105 = 0;
			} while (false);
			if (i >= 117)
				anInt3112++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uh.D(" + i + ',' + i_7_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anIntArray3097 = new int[anInt3109];
		anIntArray3101 = new int[anInt3109];
		aStringArray3106 = new String[anInt3109];
		anIntArray3111 = new int[anInt3109];
		anIntArray3102 = new int[anInt3109];
		anIntArray3110 = new int[anInt3109];
		anIntArray3104 = new int[anInt3109];
	}
}
