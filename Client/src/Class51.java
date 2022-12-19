/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class51 {
	static int anInt716;
	static int anInt717;
	static Class169 aClass169_718 = new Class169("", 17);
	static int anInt719;
	private Node aClass246_720;
	private Class166 aClass166_721;
	static int anInt722;
	static int anInt723 = 0;
	static int anInt724;
	static int anInt725;

	final Node method333(boolean bool) {
		try {
			anInt719++;
			if (bool != true)
				return null;
			Node class246 = (((Node) ((Class166) aClass166_721).aClass246_2343).next);
			if (class246 == ((Class166) aClass166_721).aClass246_2343) {
				aClass246_720 = null;
				return null;
			}
			aClass246_720 = ((Node) class246).next;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "em.C(" + bool + ')');
		}
	}

	final Node method334(byte i) {
		try {
			if (i <= 39)
				method336(-123);
			anInt725++;
			Node class246 = aClass246_720;
			if (((Class166) aClass166_721).aClass246_2343 == class246) {
				aClass246_720 = null;
				return null;
			}
			aClass246_720 = ((Node) class246).next;
			return class246;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "em.F(" + i + ')');
		}
	}

	static final boolean method335(int i, byte i_0_, int i_1_) {
		try {
			int i_2_ = -30 / ((i_0_ - 46) / 60);
			anInt717++;
			if ((0x10 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("em.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final Class246_Sub1_Sub10 method336(int i) {
		try {
			if (i != 0)
				method338(-51);
			anInt724++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = ((Class246_Sub1_Sub10) Class53.aClass217_757.method1408((byte) 87));
			if (class246_sub1_sub10 != null) {
				class246_sub1_sub10.unlink((byte) -78);
				class246_sub1_sub10.method1756((byte) 121);
				return class246_sub1_sub10;
			}
			do {
				class246_sub1_sub10 = ((Class246_Sub1_Sub10) Class130_Sub6.aClass217_4844.method1408((byte) 87));
				if (class246_sub1_sub10 == null)
					return null;
				if (class246_sub1_sub10.method2607(i - 1162) > Class151.time(-128))
					return null;
				class246_sub1_sub10.unlink((byte) -48);
				class246_sub1_sub10.method1756((byte) -114);
			} while ((((Class246_Sub1) class246_sub1_sub10).aLong3739 & ~0x7fffffffffffffffL) == 0L);
			return class246_sub1_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "em.A(" + i + ')');
		}
	}

	final void method337(Class166 class166, int i) {
		try {
			if (i < -88) {
				anInt722++;
				aClass166_721 = class166;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "em.G(" + (class166 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method338(int i) {
		try {
			if (i != 17)
				method335(86, (byte) -27, 100);
			aClass169_718 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "em.E(" + i + ')');
		}
	}

	static final void method339(int i, int i_3_, int i_4_) {
		try {
			if (i_3_ != 0)
				anInt723 = 37;
			anInt716++;
			Class202.anInt2865++;
			Class243.writePacket(-97, Class246_Sub15.aClass201_4444);
			Class130_Sub1.stream.writeShort128((byte) -99, i_4_);
			Class130_Sub1.stream.writeInt(i, (byte) 94);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("em.B(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public Class51() {
		/* empty */
	}

	Class51(Class166 class166) {
		try {
			aClass166_721 = class166;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("em.<init>(" + (class166 != null ? "{...}" : "null") + ')'));
		}
	}
}
