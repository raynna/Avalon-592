/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class231 {
	static int anInt3168;
	static Class18[] aClass18Array3169;
	static int anInt3170;
	static Class67 aClass67_3171;
	static int anInt3172;

	static final Class128_Sub1 method1479(int i, int[] is, int i_0_, Class260_Sub2 class260_sub2, int[] is_1_, byte i_2_) {
		try {
			anInt3170++;
			byte[] is_3_ = new byte[i_0_ * i];
			for (int i_4_ = 0; i > i_4_; i_4_++) {
				int i_5_ = is[i_4_] + i_4_ * i_0_;
				for (int i_6_ = 0; (is_1_[i_4_] ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
					is_3_[i_5_++] = (byte) -1;
			}
			int i_7_ = 32 / ((i_2_ - 8) / 34);
			return new Class128_Sub1(class260_sub2, i_0_, i, is_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uo.A(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + (class260_sub2 != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public static void method1480(byte i) {
		try {
			aClass18Array3169 = null;
			if (i != -10)
				aClass18Array3169 = null;
			aClass67_3171 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uo.B(" + i + ')');
		}
	}

	static final void method1481(int i, Class_fs class_fs, int i_8_, int i_9_, byte i_10_, boolean bool, int i_11_) {
		try {
			anInt3172++;
			Class109_Sub2.aBool3818 = bool;
			Class_m.aClass_fs1545 = class_fs;
			Class7.anInt96 = i_11_;
			Class108.anInt1534 = i;
			Class59_Sub5.anInt5400 = i_9_;
			if (i_10_ < -48) {
				Class22.anInt327 = i_8_;
				Class12.anInt182 = 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uo.C(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ')'));
		}
	}

	static {
		new Class67("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien re\u00e7u votre rapport d'abus.", "Obrigado. Sua den\u00fancia de abuso foi recebida.");
		aClass18Array3169 = new Class18[6];
		aClass67_3171 = new Class67("flash2:", "blinken2:", "clignotant2:", "flash2:");
	}
}
