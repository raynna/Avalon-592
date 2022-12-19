/* Class246_Sub1_Sub6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub6_Sub2 extends Class246_Sub1_Sub6 {
	static int anInt7105;
	static int anInt7106;
	Class208 aClass208_7107;
	byte[] aByteArray7108;
	static HashMap aClass54_7109;
	int anInt7110;
	static String aString7111 = null;
	static int anInt7112;
	static int anInt7113;

	final byte[] method2534(boolean bool) {
		try {
			if (bool != false)
				method2907(null, 22);
			anInt7112++;
			if (((Class246_Sub1_Sub6) this).aBool5960)
				throw new RuntimeException();
			return ((Class246_Sub1_Sub6_Sub2) this).aByteArray7108;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lf.D(" + bool + ')');
		}
	}

	public static void method2906(int i) {
		do {
			try {
				aClass54_7109 = null;
				aString7111 = null;
				if (i == 0)
					break;
				method2907(null, -92);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lf.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2907(Class_fs class_fs, int i) {
		do {
			try {
				Class185.anInt2626 = class_fs.method86("titlebg", (byte) -125);
				anInt7113++;
				Class203.anInt2877 = class_fs.method86("logo", (byte) -97);
				if (i == 14564)
					break;
				method2908(-9, null, -128);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lf.A(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public Class246_Sub1_Sub6_Sub2() {
		/* empty */
	}

	final int method2533(int i) {
		try {
			anInt7106++;
			if (((Class246_Sub1_Sub6) this).aBool5960)
				return 0;
			if (i <= 23)
				return -47;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lf.B(" + i + ')');
		}
	}

	static final short[] method2908(int i, short[] is, int i_0_) {
		try {
			anInt7105++;
			short[] is_1_ = new short[i_0_];
			Class117.method803(is, 0, is_1_, i, i_0_);
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lf.E(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static {
		aClass54_7109 = new HashMap(32);
		new Class67("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.", "L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.", "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
	}
}
