/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class60 {
	static int anInt825;
	int anInt826;
	int anInt827;
	Class156 aClass156_828;
	static int anInt829;
	static int anInt830;
	static IncomingPacket aClass13_831;
	static short aShort832 = 1;
	static Object anObject833;
	private int anInt834;
	static int anInt835;
	static int anInt836;
	static int basePlane;

	final void method410(BufferStream stream, int i) {
		do {
			try {
				for (;;) {
					int i_0_ = stream.readUnsignedByte(255);
					if (i_0_ == 0)
						break;
					method414(i - 27222, i_0_, stream);
				}
				anInt829++;
				if (i == 27223)
					break;
				aShort832 = (short) -90;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fn.A(" + (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method411(Class138 class138, boolean bool, int i, int i_1_) {
		try {
			if (bool == false) {
				anInt830++;
				Class_a.aClass138ArrayArray1175[i][i_1_] = class138;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fn.D(" + (class138 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_1_ + ')'));
		}
	}

	static final String[] method412(byte i, String string, char c) {
		try {
			anInt836++;
			int i_2_ = Class137.method931((byte) -92, string, c);
			int i_3_ = -16 % ((-34 - i) / 38);
			String[] strings = new String[1 + i_2_];
			int i_4_ = 0;
			int i_5_ = 0;
			for (int i_6_ = 0; (i_2_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				int i_7_;
				for (i_7_ = i_5_; (string.charAt(i_7_) ^ 0xffffffff) != (c ^ 0xffffffff); i_7_++) {
					/* empty */
				}
				strings[i_4_++] = string.substring(i_5_, i_7_);
				i_5_ = 1 + i_7_;
			}
			strings[i_2_] = string.substring(i_5_);
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fn.B(" + i + ',' + (string != null ? "{...}" : "null") + ',' + c + ')'));
		}
	}

	public static void method413(int i) {
		try {
			aClass13_831 = null;
			if (i != 1)
				method413(56);
			anObject833 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fn.C(" + i + ')');
		}
	}

	private final void method414(int i, int i_8_, BufferStream stream) {
		do {
			try {
				anInt825++;
				if (i == i_8_)
					anInt834 = stream.readUnsignedShort((byte) -83);
				else {
					if (i_8_ != 2)
						break;
					((Class60) this).anInt827 = stream.readUnsignedByte(255);
					((Class60) this).anInt826 = stream.readUnsignedByte(255);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fn.E(" + i + ',' + i_8_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class60() {
		/* empty */
	}

	final synchronized Class10 method415(int i) {
		try {
			anInt835++;
			Class10 class10 = ((Class10) ((Class156) ((Class60) this).aClass156_828).aClass54_2242.method379((long) anInt834, (byte) 58));
			if (class10 != null)
				return class10;
			class10 = Class10.method120((((Class156) ((Class60) this).aClass156_828).aClass_fs2239), anInt834, i);
			if (class10 != null)
				((Class156) ((Class60) this).aClass156_828).aClass54_2242.method371(1, (long) anInt834, class10);
			return class10;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fn.F(" + i + ')');
		}
	}

	static {
		aClass13_831 = new IncomingPacket(104, 6);
	}
}
