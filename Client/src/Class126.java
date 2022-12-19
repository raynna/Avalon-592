/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class126 {
	static int anInt1778;
	static int[] anIntArray1779 = new int[1];
	static int anInt1780;
	static int anInt1781;
	static float aFloat1782;

	static final void method864(int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		do {
			try {
				do {
					if (BufferStream.anInt5656 == 0) {
						Class246_Sub4.method1809(4095, false);
						if (!client.f_ob)
							break;
					}
					Class38_Sub1.anInt5116 = BufferStream.anInt5656;
					Class129.method883(0, (byte) 115);
				} while (false);
				anInt1778++;
				Class246_Sub37_Sub1.f_ob = i_0_;
				Class100_Sub1.anInt5072 = i;
				Class246_Sub8.aBool3980 = bool;
				Class79.method496(i_2_);
				if (i_1_ < -92)
					break;
				method864(19, 69, 54, 7, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lr.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static final void method865(byte i) {
		try {
			anInt1780++;
			if (i > -89)
				method864(-105, -90, 103, -19, false);
			Class246_Sub30 class246_sub30 = (Class246_Sub30) Class235.f_qb.method1104(95);
			boolean bool = (Class150.aClass235_2196 != null || (Class59_Sub3_Sub2.f_db ^ 0xffffffff) < -1);
			if (bool)
				Class103.anInt1365 = 1;
			if (!Node.aBool3468 || !Class216.aClass232_3009.method1488(-82, 81) || Class230.anInt3147 <= 2) {
				if (bool)
					Class235.f_tc = ((Class246_Sub35) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev);
				else
					Class134.method909(class246_sub30.method2161((byte) -87), ((Class246_Sub35) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev), class246_sub30.method2160(109), true);
			} else if (!bool)
				Class134.method909(class246_sub30.method2161((byte) -86), ((Class246_Sub35) (((Node) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev).prev)), class246_sub30.method2160(78), true);
			else
				Class235.f_tc = ((Class246_Sub35) (((Node) ((Node) (((Class166) Class108.aClass166_1525).aClass246_2343)).prev).prev));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lr.C(" + i + ')');
		}
	}

	public static void method866(int i) {
		do {
			try {
				anIntArray1779 = null;
				if (i == -1)
					break;
				anInt1781 = -18;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lr.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
