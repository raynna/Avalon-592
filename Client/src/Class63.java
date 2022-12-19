/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class63 {
	int anInt851;
	static int anInt852;
	static int anInt853;
	int anInt854;
	int anInt855;
	static int anInt856;
	static int anInt857;

	final boolean method418(boolean bool) {
		try {
			if (bool != false)
				method418(false);
			anInt852++;
			if ((0x8 & ((Class63) this).anInt851) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gb.E(" + bool + ')');
		}
	}

	final boolean method419(int i) {
		try {
			if (i != 16563)
				method421(-55);
			anInt853++;
			if ((0x2 & ((Class63) this).anInt851 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gb.H(" + i + ')');
		}
	}

	final boolean method420(byte i) {
		try {
			anInt856++;
			if (i != -92)
				method419(73);
			if ((0x1 & ((Class63) this).anInt851) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gb.F(" + i + ')');
		}
	}

	final boolean method421(int i) {
		try {
			if (i != 512)
				((Class63) this).anInt855 = -58;
			anInt857++;
			if ((((Class63) this).anInt851 & 0x4 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gb.G(" + i + ')');
		}
	}

	public Class63() {
		/* empty */
	}
}
