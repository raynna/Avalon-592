/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class118 {
	String aString1629;
	static int anInt1630;
	static int anInt1631;
	static int anInt1632;
	boolean aBool1633 = true;
	int anInt1634;
	static int anInt1635;
	static int anInt1636;
	static int anInt1637;
	static int anInt1638;
	static int anInt1639;
	private char aChar1640;
	static Class_v aClass_v1641;

	public static void method808(int i) {
		try {
			int i_0_ = 32 % ((-42 - i) / 45);
			aClass_v1641 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.E(" + i + ')');
		}
	}

	static final boolean method809(int i, int i_1_) {
		try {
			anInt1632++;
			if (i_1_ != -6)
				anInt1636 = -2;
			if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -8)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.D(" + i + ',' + i_1_ + ')');
		}
	}

	final boolean method810(int i) {
		try {
			anInt1637++;
			if (i != 115)
				aChar1640 = '\uff9c';
			if (aChar1640 != 's')
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.B(" + i + ')');
		}
	}

	static final void method811(int i, byte i_2_) {
		try {
			Class_q_Sub1.aClass54_6663.method380(i, -50);
			if (i_2_ != 55)
				aClass_v1641 = null;
			anInt1630++;
			Class_ls.aClass54_963.method380(i, -50);
			Class216.aClass54_3007.method380(i, -50);
			Class29.aClass54_387.method380(i, -50);
			Class84.aClass54_1097.method380(i, i_2_ - 105);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.G(" + i + ',' + i_2_ + ')');
		}
	}

	private final void method812(int i, BufferStream stream, int i_3_) {
		try {
			if (i == (i_3_ ^ 0xffffffff))
				aChar1640 = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte(false));
			else if ((i_3_ ^ 0xffffffff) == -3)
				((Class118) this).anInt1634 = stream.readInt((byte) 95);
			else if (i_3_ == 4)
				((Class118) this).aBool1633 = false;
			else if ((i_3_ ^ 0xffffffff) == -6)
				((Class118) this).aString1629 = stream.readString((byte) -40);
			anInt1635++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lg.F(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method813(boolean bool, Class246_Sub1 class246_sub1, Class246_Sub1 class246_sub1_4_) {
		do {
			try {
				anInt1638++;
				if (((Class246_Sub1) class246_sub1_4_).aClass246_Sub1_3743 != null)
					class246_sub1_4_.method1756((byte) -111);
				((Class246_Sub1) class246_sub1_4_).aClass246_Sub1_3743 = class246_sub1;
				((Class246_Sub1) class246_sub1_4_).aClass246_Sub1_3742 = ((Class246_Sub1) class246_sub1).aClass246_Sub1_3742;
				((Class246_Sub1) (((Class246_Sub1) class246_sub1_4_).aClass246_Sub1_3743)).aClass246_Sub1_3742 = class246_sub1_4_;
				((Class246_Sub1) (((Class246_Sub1) class246_sub1_4_).aClass246_Sub1_3742)).aClass246_Sub1_3743 = class246_sub1_4_;
				if (bool == true)
					break;
				method808(102);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lg.A(" + bool + ',' + (class246_sub1 != null ? "{...}" : "null") + ',' + (class246_sub1_4_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method814(BufferStream stream, byte i) {
		try {
			if (i != 71)
				((Class118) this).aString1629 = null;
			anInt1631++;
			for (;;) {
				int i_5_ = stream.readUnsignedByte(255);
				if ((i_5_ ^ 0xffffffff) == -1)
					break;
				method812(-2, stream, i_5_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lg.H(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class118() {
		/* empty */
	}

	static final void method815(byte i) {
		do {
			try {
				anInt1639++;
				Class59_Sub4.aBool5189 = true;
				if (i == -36)
					break;
				method815((byte) 60);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lg.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
