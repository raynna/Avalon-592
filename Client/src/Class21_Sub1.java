
/* Class21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class21_Sub1 extends Class21 {
	private int anInt3894;
	private int anInt3895;
	private int anInt3896;
	private int anInt3897;
	static int anInt3898;
	static int anInt3899;
	static int anInt3900;
	private int anInt3901;
	private int anInt3902;
	static int anInt3903;
	private int anInt3904;
	static int anInt3905;
	static int anInt3906;
	static int anInt3907;
	private int anInt3908;
	static String[] aStringArray3909;

	public static void method1813(int i) {
		do {
			try {
				aStringArray3909 = null;
				if (i == 255)
					break;
				method1814(null, 78);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "br.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method196(int i, int i_0_, int i_1_) {
		do {
			try {
				anInt3899++;
				if (i < -78)
					break;
				anInt3900 = 67;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("br.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1814(Class_fs class_fs, int i) {
		try {
			Class98.aClass_fs1272 = class_fs;
			if (i != 3325)
				method1815(-2, null, -54, -20, 100, 110, 69, 36);
			anInt3906++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "br.F(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class21_Sub1(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		super(-1, i_9_, i_10_);
		try {
			anInt3897 = i_8_;
			anInt3908 = i_7_;
			anInt3902 = i_6_;
			anInt3894 = i_4_;
			anInt3901 = i_5_;
			anInt3895 = i_2_;
			anInt3896 = i_3_;
			anInt3904 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("br.<init>(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method1815(int i, int[] is, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			anInt3907++;
			if (i_16_ != 17054)
				method1813(-23);
			if ((i_13_ ^ 0xffffffff) < -1 && !Class246_Sub40.method2313(200, i_13_))
				throw new IllegalArgumentException("");
			if (i_12_ > 0 && !Class246_Sub40.method2313(200, i_12_))
				throw new IllegalArgumentException("");
			if (i != 32993)
				throw new IllegalArgumentException("");
			int i_17_ = 0;
			int i_18_ = (i_12_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff) ? i_12_ : i_13_;
			int i_19_ = i_13_ >> 1;
			int i_20_ = i_12_ >> 1;
			int[] is_21_ = is;
			int[] is_22_ = new int[i_19_ * i_20_];
			for (;;) {
				OpenGL.glTexImage2Di(i_15_, i_17_, i_11_, i_13_, i_12_, 0, i, i_14_, is_21_, 0);
				if ((i_18_ ^ 0xffffffff) >= -2)
					break;
				int i_23_ = 0;
				int i_24_ = 0;
				int i_25_ = i_24_ + i_13_;
				int[] is_26_ = is_22_;
				for (int i_27_ = 0; (i_20_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
					for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
						int i_29_ = is_21_[i_24_++];
						int i_30_ = is_21_[i_25_++];
						int i_31_ = is_21_[i_24_++];
						int i_32_ = 0xff & i_29_ >> 16;
						int i_33_ = i_29_ & 0xff;
						int i_34_ = 0xff & i_29_ >> 24;
						int i_35_ = is_21_[i_25_++];
						int i_36_ = i_29_ >> 8 & 0xff;
						i_36_ += i_31_ >> 8 & 0xff;
						i_32_ += 0xff & i_31_ >> 16;
						i_34_ += i_31_ >> 24 & 0xff;
						i_33_ += i_31_ & 0xff;
						i_33_ += 0xff & i_30_;
						i_32_ += i_30_ >> 16 & 0xff;
						i_36_ += (0xff70 & i_30_) >> 8;
						i_34_ += i_30_ >> 24 & 0xff;
						i_32_ += 0xff & i_35_ >> 16;
						i_33_ += 0xff & i_35_;
						i_34_ += 0xff & i_35_ >> 24;
						i_36_ += 0xff & i_35_ >> 8;
						is_22_[i_23_++] = (Class236.method1523(PacketsDecoder.method184(1020, i_33_) >> 2, (Class236.method1523(PacketsDecoder.method184(1020, i_36_) << 6, (Class236.method1523(PacketsDecoder.method184(1020, i_32_) << 14, (PacketsDecoder.method184(i_34_, 1020) << 22)))))));
					}
					i_24_ += i_13_;
					i_25_ += i_13_;
				}
				is_22_ = is_21_;
				is_21_ = is_26_;
				i_13_ = i_19_;
				i_12_ = i_20_;
				i_19_ >>= 1;
				i_18_ >>= 1;
				i_17_++;
				i_20_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("br.H(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	final void method195(int i, int i_37_, int i_38_) {
		try {
			if (i != 24245)
				anInt3908 = -75;
			anInt3905++;
			int i_39_ = anInt3904 * i_38_ >> 12;
			int i_40_ = i_37_ * anInt3895 >> 12;
			int i_41_ = i_38_ * anInt3896 >> 12;
			int i_42_ = anInt3894 * i_37_ >> 12;
			int i_43_ = anInt3901 * i_38_ >> 12;
			int i_44_ = anInt3902 * i_37_ >> 12;
			int i_45_ = anInt3908 * i_38_ >> 12;
			int i_46_ = anInt3897 * i_37_ >> 12;
			Class_t.method686(i_45_, i_43_, i_42_, i_46_, i_41_, i_44_, i_39_, ((Class21) this).anInt317, i_40_, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("br.E(" + i + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	final void method199(int i, int i_47_, int i_48_) {
		try {
			if (i_47_ == 4)
				anInt3898++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("br.B(" + i + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	static {
		new Class67("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.", "Para interagir, acesse um servidor para membros.");
		aStringArray3909 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	}
}
