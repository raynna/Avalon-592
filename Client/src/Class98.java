/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98 {
	static int anInt1265;
	boolean aBool1266;
	static int anInt1267;
	int anInt1268 = 1;
	int anInt1269;
	static int anInt1270;
	int anInt1271;
	static Class_fs aClass_fs1272;
	static int anInt1273;
	static int anInt1274;
	static int anInt1275;
	int anInt1276 = 2;
	boolean aBool1277;
	int anInt1278;
	static Class_l[] aClass_lArray1279;

	final void method618(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt1270++;
				for (;;) {
					int i_1_ = stream.readUnsignedByte(255);
					if ((i_1_ ^ 0xffffffff) == -1)
						break;
					method619(stream, i_1_, i - 8555, i_0_);
				}
				if (i == 8554)
					break;
				aClass_lArray1279 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jg.A(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method619(BufferStream stream, int i, int i_2_, int i_3_) {
		do {
			try {
				if ((i ^ 0xffffffff) != -2) {
					if ((i ^ 0xffffffff) != -3) {
						if ((i ^ 0xffffffff) != -4) {
							if (i == 4)
								((Class98) this).anInt1276 = stream.readUnsignedByte(255);
							else if (i != 5) {
								if ((i ^ 0xffffffff) != -7) {
									if (i == 7)
										((Class98) this).aBool1277 = true;
								} else
									((Class98) this).aBool1266 = true;
							} else
								((Class98) this).anInt1268 = stream.readUnsignedByte(255);
						} else
							stream.readByte(false);
					} else {
						((Class98) this).anInt1271 = stream.readUnsignedShort((byte) 104) + 1;
						((Class98) this).anInt1278 = 1 + stream.readUnsignedShort((byte) -64);
					}
				} else {
					((Class98) this).anInt1269 = stream.readUnsignedShort((byte) 88);
					if ((((Class98) this).anInt1269 ^ 0xffffffff) == -65536)
						((Class98) this).anInt1269 = -1;
				}
				anInt1273++;
				if (i_2_ == -1)
					break;
				((Class98) this).anInt1276 = -64;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("jg.D(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method620(int i, boolean bool) {
		try {
			Class173.anIntArray2442 = new int[i];
			Class166.anIntArray2354 = new int[i];
			anInt1265++;
			Class29.anIntArray395 = new int[i];
			if (bool != true)
				method620(-65, false);
			Class246_Sub1_Sub3.anIntArray5715 = new int[i];
			Class254.anIntArray3625 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jg.C(" + i + ',' + bool + ')');
		}
	}

	public static void method621(int i) {
		try {
			aClass_lArray1279 = null;
			if (i == -2)
				aClass_fs1272 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "jg.B(" + i + ')');
		}
	}

	public Class98() {
		((Class98) this).anInt1269 = -1;
		((Class98) this).anInt1278 = 64;
		((Class98) this).aBool1277 = false;
		((Class98) this).anInt1271 = 64;
		((Class98) this).aBool1266 = false;
	}
}
