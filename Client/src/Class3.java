
/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class3 {
	static int anInt23;
	Class59_Sub3 aClass59_Sub3_24;
	static int anInt25;
	static int anInt26;
	static int[] anIntArray27 = new int[32];
	Class3 aClass3_28;
	static int anInt29;
	static int anInt30;
	int anInt31;
	static IncomingPacket aClass13_32 = new IncomingPacket(82, 12);

	final void method49(int i) {
		try {
			anInt26++;
			if ((Class246_Sub1_Sub10.f_cb ^ 0xffffffff) > -501 && i >= 24) {
				((Class3) this).aClass3_28 = Class246_Sub4.aClass3_3860;
				((Class3) this).anInt31 = 0;
				((Class3) this).aClass59_Sub3_24 = null;
				Class246_Sub1_Sub10.f_cb++;
				Class246_Sub4.aClass3_3860 = this;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ag.C(" + i + ')');
		}
	}

	static final Frame method50(int i, int i_0_, Signlink class52, int i_1_, int i_2_, int i_3_) {
		try {
			anInt30++;
			if (!class52.method345((byte) -100))
				return null;
			if ((i_2_ ^ 0xffffffff) == -1) {
				Class86[] class86s = Class21_Sub3.method2076(class52, 1034647426);
				if (class86s == null)
					return null;
				boolean bool = false;
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (class86s.length ^ 0xffffffff); i_4_++) {
					if (((((Class86) class86s[i_4_]).anInt1137 ^ 0xffffffff) == (i ^ 0xffffffff)) && ((((Class86) class86s[i_4_]).anInt1138 ^ 0xffffffff) == (i_1_ ^ 0xffffffff)) && (i_3_ == 0 || i_3_ == ((Class86) class86s[i_4_]).anInt1140) && (!bool || ((Class86) class86s[i_4_]).anInt1141 > i_2_)) {
						bool = true;
						i_2_ = ((Class86) class86s[i_4_]).anInt1141;
					}
				}
				if (!bool)
					return null;
			}
			Class182 class182 = class52.method342(i_1_, i_3_, i_2_, true, i);
			if (i_0_ != -8390)
				anInt29 = -104;
			while ((class182.anInt2539 ^ 0xffffffff) == -1)
				Class247.method1580(10L, i_0_ ^ 0x34fa);
			Frame frame = (Frame) class182.anObject2535;
			if (frame == null)
				return null;
			if ((class182.anInt2539 ^ 0xffffffff) == -3) {
				Class256.method1662(class52, (byte) -62, frame);
				return null;
			}
			return frame;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ag.A(" + i + ',' + i_0_ + ',' + (class52 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final boolean method51(int i, int i_5_, int i_6_) {
		try {
			anInt23++;
			if (i_6_ >= -122)
				return false;
			if ((0x800 & i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ag.D(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method52(int i) {
		try {
			aClass13_32 = null;
			if (i != -26007)
				method50(49, -58, null, -48, 1, 49);
			anIntArray27 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ag.B(" + i + ')');
		}
	}
}
