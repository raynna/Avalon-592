
/* Class194_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class Class194_Sub1 extends Class194 implements Interface1 {
	private int anInt4129;
	static int anInt4130;
	static int anInt4131;
	static int anInt4132;
	static int anInt4133;
	static int anInt4134;
	static int anInt4135;
	static Class67 aClass67_4136 = new Class67("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static int anInt4137;
	static OutgoingPacket TAKE_GROUND_ITEM_PACKET = new OutgoingPacket(80, 7);
	static boolean aBool4139 = false;
	static Class142 aClass142_4140;

	public static void method1880(boolean bool) {
		try {
			aClass142_4140 = null;
			if (bool != true)
				aClass67_4136 = null;
			TAKE_GROUND_ITEM_PACKET = null;
			aClass67_4136 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eo.I(" + bool + ')');
		}
	}

	static final void method1881(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt4132++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 117, 8);
			if (i_0_ > -35)
				method1882(108, 4, -122, -10, 78, 90, -96);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_1_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_2_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eo.H(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final int method1(int i) {
		try {
			if (i != -2584)
				return -54;
			anInt4130++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eo.F(" + i + ')');
		}
	}

	static final void method1882(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			anInt4131++;
			int i_10_ = -i_8_ + i;
			int i_11_ = i_8_ + i_9_;
			int i_12_ = -106 / ((29 - i_5_) / 44);
			for (int i_13_ = i_9_; i_13_ < i_11_; i_13_++)
				Class135.method918(i_4_, 124, i_6_, i_7_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_13_]));
			for (int i_14_ = i; (i_10_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_14_--)
				Class135.method918(i_4_, 118, i_6_, i_7_, (Class246_Sub28_Sub6.anIntArrayArray6042[i_14_]));
			int i_15_ = -i_8_ + i_7_;
			int i_16_ = i_4_ + i_8_;
			for (int i_17_ = i_11_; (i_17_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff); i_17_++) {
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_17_];
				Class135.method918(i_4_, 125, i_6_, i_16_, is);
				Class135.method918(i_15_, 123, i_6_, i_7_, is);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eo.A(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public final int method4(byte i) {
		try {
			anInt4137++;
			if (i >= -20)
				aClass142_4140 = null;
			return anInt4129;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eo.C(" + i + ')');
		}
	}

	public final void method2(byte[] is, boolean bool, int i, int i_18_) {
		do {
			try {
				this.method1274(is, i_18_);
				anInt4134++;
				anInt4129 = i;
				if (bool == true)
					break;
				anInt4129 = 113;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("eo.D(" + (is != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_18_ + ')'));
			}
			break;
		} while (false);
	}

	Class194_Sub1(Class260_Sub2 class260_sub2, int i, byte[] is, int i_19_) {
		super(class260_sub2, is, i_19_);
		try {
			anInt4129 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("eo.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_19_ + ')'));
		}
	}

	static final void method1883(Throwable throwable, String string, int i) {
		do {
			try {
				anInt4135++;
				try {
					String string_20_ = "";
					if (throwable != null)
						string_20_ = Class179.method1172(throwable, -24565);
					if (string != null) {
						if (throwable != null)
							string_20_ += " | ";
						string_20_ += (String) string;
					}
					Class6.method74(false, string_20_);
					string_20_ = Class248.method1586("%3a", -9, ":", string_20_);
					string_20_ = Class248.method1586("%40", -9, "@", string_20_);
					string_20_ = Class248.method1586("%26", -9, "&", string_20_);
					string_20_ = Class248.method1586("%23", -9, "#", string_20_);
					if (Class211_Sub1.aClass52_5348.anApplet733 != null) {
						Class182 class182 = (Class211_Sub1.aClass52_5348.method353(new URL(Class211_Sub1.aClass52_5348.anApplet733.getCodeBase(), ("clienterror.ws?c=" + Class6.anInt77 + "&u=" + Class155.aLong2221 + "&v1=" + Signlink.aString747 + "&v2=" + Signlink.aString731 + "&e=" + string_20_)), -106));
						while (class182.anInt2539 == 0)
							Class247.method1580(1L, -5184);
						int i_21_ = 109 / ((-5 - i) / 57);
						if ((class182.anInt2539 ^ 0xffffffff) != -2)
							break;
						DataInputStream datainputstream = (DataInputStream) class182.anObject2535;
						datainputstream.read();
						datainputstream.close();
					}
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
	}

	public final long method3(byte i) {
		try {
			if (i > -59)
				return -118L;
			anInt4133++;
			return ((Class194) this).aNativeBuffer2725.getAddress();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "eo.G(" + i + ')');
		}
	}
}
