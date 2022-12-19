/* Class246_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub35 extends Node {
	boolean aBool5147;
	int anInt5148;
	String aString5149;
	static HashMap aClass54_5150 = new HashMap(64);
	int anInt5151;
	String aString5152;
	boolean aBool5153;
	int anInt5154;
	int anInt5155;
	int anInt5156;
	long aLong5157;
	static OutgoingPacket aClass201_5158 = new OutgoingPacket(37, 15);
	static IncomingPacket aClass13_5159;
	static boolean aBool5160 = true;
	static short[] aShortArray5161 = new short[256];

	public static void method2203(byte i) {
		try {
			aShortArray5161 = null;
			aClass54_5150 = null;
			if (i != -3)
				aClass201_5158 = null;
			aClass201_5158 = null;
			aClass13_5159 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qm.A(" + i + ')');
		}
	}

	Class246_Sub35(String string, String string_0_, int i, int i_1_, int i_2_, long l, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		try {
			((Class246_Sub35) this).anInt5148 = i_2_;
			((Class246_Sub35) this).aLong5157 = l;
			((Class246_Sub35) this).aBool5153 = bool;
			((Class246_Sub35) this).anInt5154 = i_4_;
			((Class246_Sub35) this).anInt5155 = i;
			((Class246_Sub35) this).anInt5151 = i_3_;
			((Class246_Sub35) this).anInt5156 = i_1_;
			((Class246_Sub35) this).aBool5147 = bool_5_;
			((Class246_Sub35) this).aString5149 = string;
			((Class246_Sub35) this).aString5152 = string_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qm.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_0_ != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + l + ',' + i_3_ + ',' + i_4_ + ',' + bool + ',' + bool_5_ + ')'));
		}
	}

	static {
		aClass13_5159 = new IncomingPacket(80, 7);
	}
}
