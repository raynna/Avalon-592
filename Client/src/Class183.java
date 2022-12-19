/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class183 {
	static int anInt2541;
	static int anInt2542;
	static int anInt2543;
	char aChar2544;
	static int anInt2545;
	static int anInt2546;
	char aChar2547;
	private String aString2548 = "null";
	static int anInt2549 = -1;
	private int anInt2550;
	Class85 aClass85_2551;
	static int anInt2552;
	private Class85 aClass85_2553;
	static int anInt2554;
	static int anInt2555;
	static int anInt2556;

	private final void method1179(byte i) {
		try {
			aClass85_2553 = new Class85(((Class183) this).aClass85_2551.method550(-14891));
			anInt2556++;
			if (i != -107)
				((Class183) this).aChar2547 = '\uffb8';
			for (Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((Class183) this).aClass85_2551.first((byte) -23)); class246_sub4 != null; class246_sub4 = (Class246_Sub4) ((Class183) this).aClass85_2551.next((byte) -20)) {
				Class246_Sub31 class246_sub31 = new Class246_Sub31((((Class246_Sub4) class246_sub4).aString3862), (int) (((Node) class246_sub4).hash));
				aClass85_2553.method547(Class128.method876(0, (((Class246_Sub4) class246_sub4).aString3862)), -2301, class246_sub31);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.H(" + i + ')');
		}
	}

	final int method1180(int i, int i_0_) {
		try {
			anInt2555++;
			if (i_0_ != -6)
				method1183(false, -7);
			if (((Class183) this).aClass85_2551 == null)
				return anInt2550;
			IntegerNode class246_sub33 = ((IntegerNode) ((Class183) this).aClass85_2551.method544((long) i, 125));
			if (class246_sub33 == null)
				return anInt2550;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.B(" + i + ',' + i_0_ + ')');
		}
	}

	final void method1181(int i, BufferStream stream) {
		try {
			for (;;) {
				int i_1_ = stream.readUnsignedByte(255);
				if ((i_1_ ^ 0xffffffff) == -1)
					break;
				method1184(stream, i_1_, 22409);
			}
			if (i != 19207)
				method1186(-22);
			anInt2546++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qu.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1182(int i, String string) {
		try {
			anInt2542++;
			if (((Class183) this).aClass85_2551 == null)
				return false;
			if (i != 2)
				return true;
			if (aClass85_2553 == null)
				method1179((byte) -107);
			for (Class246_Sub31 class246_sub31 = ((Class246_Sub31) aClass85_2553.method544(Class128.method876(0, string), 127)); class246_sub31 != null; class246_sub31 = (Class246_Sub31) aClass85_2553.method541(-1)) {
				if (((Class246_Sub31) class246_sub31).aString5035.equals(string))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qu.E(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1183(boolean bool, int i) {
		try {
			anInt2543++;
			if (((Class183) this).aClass85_2551 == null)
				return false;
			if (aClass85_2553 == null)
				method1186(25131);
			IntegerNode class246_sub33 = (IntegerNode) aClass85_2553.method544((long) i, 125);
			if (bool != true)
				anInt2549 = -72;
			if (class246_sub33 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.G(" + bool + ',' + i + ')');
		}
	}

	private final void method1184(BufferStream stream, int i, int i_2_) {
		do {
			try {
				anInt2554++;
				if (i != 1) {
					if (i != 2) {
						if (i != 3) {
							if (i != 4) {
								if ((i ^ 0xffffffff) == -6 || (i ^ 0xffffffff) == -7) {
									int i_3_ = stream.readUnsignedShort((byte) 96);
									((Class183) this).aClass85_2551 = new Class85(Class206.method1350(i_3_, i_2_ + 269150648));
									for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
										int i_5_ = stream.readInt((byte) 125);
										Node class246;
										if ((i ^ 0xffffffff) != -6)
											class246 = (new IntegerNode(stream.readInt((byte) 77)));
										else
											class246 = (new Class246_Sub4(stream.readString((byte) -40)));
										((Class183) this).aClass85_2551.method547((long) i_5_, -2301, class246);
									}
								}
							} else
								anInt2550 = stream.readInt((byte) 94);
						} else
							aString2548 = stream.readString((byte) -40);
					} else
						((Class183) this).aChar2547 = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte(false));
				} else
					((Class183) this).aChar2544 = Class246_Sub1_Sub8_Sub1.method2923(32404, stream.readByte(false));
				if (i_2_ == 22409)
					break;
				method1181(70, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("qu.F(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final String method1185(int i, int i_6_) {
		try {
			anInt2552++;
			if (((Class183) this).aClass85_2551 == null)
				return aString2548;
			Class246_Sub4 class246_sub4 = ((Class246_Sub4) ((Class183) this).aClass85_2551.method544((long) i_6_, 127));
			if (i <= 100)
				return null;
			if (class246_sub4 == null)
				return aString2548;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.D(" + i + ',' + i_6_ + ')');
		}
	}

	private final void method1186(int i) {
		try {
			aClass85_2553 = new Class85(((Class183) this).aClass85_2551.method550(-14891));
			anInt2545++;
			if (i == 25131) {
				for (IntegerNode class246_sub33 = (IntegerNode) ((Class183) this).aClass85_2551.first((byte) -23); class246_sub33 != null; class246_sub33 = (IntegerNode) ((Class183) this).aClass85_2551.next((byte) -20)) {
					IntegerNode class246_sub33_7_ = new IntegerNode((int) ((Node) class246_sub33).hash);
					aClass85_2553.method547((long) ((IntegerNode) class246_sub33).value, -2301, class246_sub33_7_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qu.C(" + i + ')');
		}
	}

	public Class183() {
		/* empty */
	}

	static {
		anInt2541 = 0;
	}
}
