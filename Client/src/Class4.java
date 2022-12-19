/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4 {
	int anInt33;
	static int anInt34;
	long aLong35;
	int anInt36;
	private int anInt37;
	int anInt38 = 0;
	int anInt39;
	int anInt40;
	static int anInt41;
	int anInt42 = 0;
	private boolean aBool43 = false;
	int anInt44;
	static int anInt45;
	int anInt46;
	int anInt47;
	int anInt48;
	int anInt49;
	static int anInt50;
	static int anInt51;
	static boolean aBool52 = false;

	final void method53(byte i, BufferStream stream) {
		try {
			for (;;) {
				int i_0_ = stream.readUnsignedByte(255);
				if ((i_0_ ^ 0xffffffff) == -1)
					break;
				method57(i_0_, stream, true);
			}
			anInt51++;
			int i_1_ = -123 / ((22 - i) / 57);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ah.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method54(int i) {
		try {
			Class90.aClass83_1170 = new Class83(i);
			anInt50++;
			Class246_Sub23.anInt4820 = 0;
			for (Class130_Sub2 class130_sub2 = (Class130_Sub2) Class216.aClass68_3008.method445(62); class130_sub2 != null; class130_sub2 = (Class130_Sub2) Class216.aClass68_3008.method442((byte) -79))
				class130_sub2.method1773();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ah.D(" + i + ')');
		}
	}

	final void method55(boolean bool) {
		do {
			try {
				anInt34++;
				if (bool != true)
					anInt37 = 20;
				((Class4) this).anInt39 = Class39_Sub1.anIntArray4672[anInt37 << 3];
				((Class4) this).anInt33 = (int) Math.sqrt((double) ((((Class4) this).anInt44 * ((Class4) this).anInt44) - -(((Class4) this).anInt40 * ((Class4) this).anInt40) - -(((Class4) this).anInt48 * (((Class4) this).anInt48))));
				if ((((Class4) this).anInt47 ^ 0xffffffff) == -1)
					((Class4) this).anInt47 = 1;
				if ((((Class4) this).anInt49 ^ 0xffffffff) != -1) {
					if ((((Class4) this).anInt49 ^ 0xffffffff) != -2) {
						if ((((Class4) this).anInt49 ^ 0xffffffff) == -3)
							((Class4) this).aLong35 = (long) (((Class4) this).anInt33 * 8 / ((Class4) this).anInt47);
					} else {
						((Class4) this).aLong35 = (long) (((Class4) this).anInt33 * 8 / ((Class4) this).anInt47);
						((Class4) this).aLong35 *= ((Class4) this).aLong35;
					}
				} else
					((Class4) this).aLong35 = 2147483647L;
				if (!aBool43)
					break;
				((Class4) this).anInt33 *= -1;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ah.C(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final int method56(byte i, int i_2_) {
		try {
			anInt45++;
			if (i != -11)
				aBool52 = false;
			if (i_2_ != 6406) {
				if (i_2_ == 6409)
					return 1;
				if ((i_2_ ^ 0xffffffff) == -32842)
					return 1;
				if ((i_2_ ^ 0xffffffff) == -6411)
					return 2;
				if (i_2_ != 6407) {
					if (i_2_ == 6408)
						return 4;
				} else
					return 3;
			} else
				return 1;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ah.E(" + i + ',' + i_2_ + ')');
		}
	}

	public Class4() {
		/* empty */
	}

	private final void method57(int i, BufferStream stream, boolean bool) {
		try {
			if (bool != true)
				method57(-79, null, true);
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2)
					stream.readUnsignedByte(255);
				else if ((i ^ 0xffffffff) != -4) {
					if ((i ^ 0xffffffff) == -5) {
						((Class4) this).anInt49 = stream.readUnsignedByte(255);
						((Class4) this).anInt47 = stream.readInt((byte) 96);
					} else if (i != 6) {
						if (i == 8)
							((Class4) this).anInt42 = 1;
						else if (i != 9) {
							if (i == 10)
								aBool43 = true;
						} else
							((Class4) this).anInt38 = 1;
					} else
						((Class4) this).anInt36 = stream.readUnsignedByte(255);
				} else {
					((Class4) this).anInt44 = stream.readInt((byte) 127);
					((Class4) this).anInt40 = stream.readInt((byte) 89);
					((Class4) this).anInt48 = stream.readInt((byte) 81);
				}
			} else
				anInt37 = stream.readUnsignedShort((byte) -39);
			anInt41++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ah.B(" + i + ',' + (stream != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}
}
