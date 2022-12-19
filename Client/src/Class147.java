
/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class147 {
	static int[] anIntArray2143;
	static int anInt2144;
	static int anInt2145;
	static byte[] aByteArray2146;
	static int anInt2147 = 0;
	static int anInt2148;
	static boolean aBool2149 = false;
	static int anInt2150;
	static int anInt2151;
	Class59_Sub4 aClass59_Sub4_2152;
	Class59_Sub2 aClass59_Sub2_2153;
	byte aByte2154;
	static Canvas aCanvas2155;
	Class59_Sub1 aClass59_Sub1_2156;
	short aShort2157;
	Class59_Sub5 aClass59_Sub5_2158;
	Class59_Sub2 aClass59_Sub2_2159;
	Class3 aClass3_2160;
	short aShort2161;
	byte aByte2162;
	static int anInt2163;
	short aShort2164;
	Class147 aClass147_2165;
	boolean aBool2166;
	boolean aBool2167;
	byte aByte2168 = 0;
	byte aByte2169;
	byte aByte2170;
	boolean aBool2171;
	Class59_Sub4 aClass59_Sub4_2172;
	Class129 aClass129_2173;
	byte aByte2174;
	byte aByte2175;

	static final void method994(int i, int i_0_, boolean bool, int i_1_, int i_2_) {
		try {
			if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt602 ^ 0xffffffff) != -1 && i != 0 && Class59.anInt819 < 50 && i_1_ != -1)
				Class47.aClass258Array684[Class59.anInt819++] = new Class258((byte) 2, i_1_, i, i_0_, i_2_, 0);
			if (bool == false)
				anInt2150++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nt.E(" + i + ',' + i_0_ + ',' + bool + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final String method995(int i, byte i_3_) {
		try {
			if (i_3_ != -71)
				return null;
			anInt2151++;
			return (String.valueOf(i >> 24 & 0xff) + "." + (0xff & i >> 16) + "." + (0xff & i >> 8) + "." + (0xff & i));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nt.D(" + i + ',' + i_3_ + ')');
		}
	}

	static final boolean method996(int i, int i_4_, int i_5_) {
		try {
			anInt2144++;
			if (i_4_ != -1)
				return false;
			return ((Class59_Sub2_Sub3.method2720(i, i_5_, 2) | Class246_Sub28_Sub14.method2633(i_5_, -1376312589, i) | Class46.method310((byte) 101, i_5_, i)) & Class241.method1544(i, (byte) 126, i_5_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nt.A(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method997(byte i) {
		try {
			anInt2163++;
			Class3 class3;
			for (/**/; ((Class147) this).aClass3_2160 != null; ((Class147) this).aClass3_2160 = class3) {
				class3 = ((Class3) ((Class147) this).aClass3_2160).aClass3_28;
				((Class147) this).aClass3_2160.method49(93);
			}
			((Class147) this).aByte2168 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nt.F(" + i + ')');
		}
	}

	Class147(int i, int i_6_, int i_7_) {
		try {
			((Class147) this).aShort2157 = (short) i_7_;
			((Class147) this).aShort2161 = (short) i_6_;
			((Class147) this).aByte2174 = ((Class147) this).aByte2175 = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("nt.<init>(" + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static final void method998(Class_fs class_fs, Interface6 interface6, byte i) {
		do {
			try {
				Class246_Sub28_Sub12.aClass_fs6195 = class_fs;
				anInt2145++;
				Class246_Sub28_Sub33.anInterface6_6967 = interface6;
				if (i == -62)
					break;
				anInt2147 = -43;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("nt.B(" + (class_fs != null ? "{...}" : "null") + ',' + (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method999(int i) {
		try {
			if (i == 255) {
				aCanvas2155 = null;
				aByteArray2146 = null;
				anIntArray2143 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "nt.C(" + i + ')');
		}
	}

	static {
		anIntArray2143 = new int[8];
	}
}
