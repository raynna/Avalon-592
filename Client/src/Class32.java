/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32 {
	static Class246_Sub37_Sub1 aClass246_Sub37_Sub1_433;
	int anInt434;
	static int anInt435;
	static int anInt436;
	int anInt437;
	static int anInt438 = -1;
	static int anInt439;
	boolean aBool440 = false;
	static int anInt441;
	static int anInt442;
	Class254 aClass254_443;

	final Class_l method240(boolean bool, Class260 class260, int i, int i_0_) {
		try {
			anInt435++;
			long l = (long) (((Class260) class260).anInt3719 << 19 | ((!bool ? 0 : 262144) | (((Class32) this).anInt434 | i << 16)));
			Class_l class_l = (Class_l) ((Class254) ((Class32) this).aClass254_443).aClass54_3638.method379(l, (byte) 58);
			if (class_l != null)
				return class_l;
			if (!((Class254) ((Class32) this).aClass254_443).aClass_fs3628.method112(-1, ((Class32) this).anInt434))
				return null;
			if (i_0_ != 16306)
				method241(null, -83);
			Class10 class10 = Class10.method120((((Class254) (((Class32) this).aClass254_443)).aClass_fs3628), ((Class32) this).anInt434, 0);
			if (class10 != null) {
				((Class10) class10).anInt163 = ((Class10) class10).anInt158 = ((Class10) class10).anInt159 = ((Class10) class10).anInt162 = 0;
				if (bool)
					class10.method123();
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff); i_1_++)
					class10.method122();
			}
			class_l = class260.method1749(class10, true);
			if (class_l != null)
				((Class254) ((Class32) this).aClass254_443).aClass54_3638.method371(1, l, class_l);
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("co.C(" + bool + ',' + (class260 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final void method241(BufferStream stream, int i) {
		try {
			anInt441++;
			if (i != -8616)
				method242(61, null, -74);
			for (;;) {
				int i_2_ = stream.readUnsignedByte(255);
				if ((i_2_ ^ 0xffffffff) == -1)
					break;
				method242(i_2_, stream, -21210);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.A(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method242(int i, BufferStream stream, int i_3_) {
		try {
			anInt442++;
			if (i_3_ != -21210)
				((Class32) this).aClass254_443 = null;
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3)
					((Class32) this).anInt437 = stream.read24BitInteger((byte) 29);
				else if (i == 3)
					((Class32) this).aBool440 = true;
				else if (i == 4)
					((Class32) this).anInt434 = -1;
			} else
				((Class32) this).anInt434 = stream.readUnsignedShort((byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("co.D(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	public static void method243(int i) {
		try {
			aClass246_Sub37_Sub1_433 = null;
			int i_4_ = 116 / ((i - 71) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.E(" + i + ')');
		}
	}

	final boolean method244(byte i) {
		try {
			if (i >= -32)
				method243(-51);
			anInt436++;
			return ((Class254) ((Class32) this).aClass254_443).aClass_fs3628.method112(-1, ((Class32) this).anInt434);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "co.B(" + i + ')');
		}
	}

	public Class32() {
		/* empty */
	}
}
