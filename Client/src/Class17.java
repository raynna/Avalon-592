
/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class17 {
	static Class182 aClass182_242;
	private HashMap aClass54_243 = new HashMap(64);
	static int anInt244;
	private Class_fs aClass_fs245;
	static Class246_Sub1_Sub17[] aClass246_Sub1_Sub17Array246 = new Class246_Sub1_Sub17[14];
	static int anInt247;
	static int anInt248;
	static int anInt249;
	static int anInt250;
	static int anInt251;

	static final byte[] method163(int i, int i_0_) {
		try {
			anInt248++;
			Class246_Sub1_Sub14 class246_sub1_sub14 = ((Class246_Sub1_Sub14) Class220.aClass127_3044.method872((long) i_0_, (byte) 106));
			int i_1_ = 88 / ((i - 15) / 39);
			if (class246_sub1_sub14 == null) {
				byte[] is = new byte[512];
				Random random = new Random((long) i_0_);
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -256; i_2_++)
					is[i_2_] = (byte) i_2_;
				for (int i_3_ = 0; i_3_ < 255; i_3_++) {
					int i_4_ = 255 + -i_3_;
					int i_5_ = Class122.method826((byte) 94, random, i_4_);
					byte i_6_ = is[i_5_];
					is[i_5_] = is[i_4_];
					is[i_4_] = is[-i_3_ + 511] = i_6_;
				}
				class246_sub1_sub14 = new Class246_Sub1_Sub14(is);
				Class220.aClass127_3044.method869((long) i_0_, class246_sub1_sub14, -8869);
			}
			return ((Class246_Sub1_Sub14) class246_sub1_sub14).aByteArray6595;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bp.G(" + i + ',' + i_0_ + ')');
		}
	}

	final void method164(int i) {
		try {
			if (i == 1068) {
				synchronized (aClass54_243) {
					aClass54_243.method369(false);
				}
				anInt250++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bp.D(" + i + ')');
		}
	}

	final void method165(byte i, int i_7_) {
		try {
			anInt249++;
			synchronized (aClass54_243) {
				aClass54_243.method380(i_7_, -50);
			}
			int i_8_ = -80 % ((i + 63) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bp.F(" + i + ',' + i_7_ + ')');
		}
	}

	final void method166(int i, int i_9_) {
		try {
			anInt244++;
			synchronized (aClass54_243) {
				aClass54_243.method369(false);
				aClass54_243 = new HashMap(i);
				int i_10_ = 14 % ((-26 - i_9_) / 49);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bp.E(" + i + ',' + i_9_ + ')');
		}
	}

	final Class108 method167(int i, int i_11_) {
		try {
			anInt247++;
			Class108 class108;
			synchronized (aClass54_243) {
				class108 = (Class108) aClass54_243.method379((long) i, (byte) 58);
			}
			if (class108 != null)
				return class108;
			byte[] is = aClass_fs245.method91(Class145.method973(i, (byte) -56), Class114.method777(i, -1886501846), i_11_ ^ ~0x81);
			class108 = new Class108();
			if (is != null)
				class108.method745(new BufferStream(is), (byte) -25);
			synchronized (aClass54_243) {
				aClass54_243.method371(1, (long) i, class108);
			}
			if (i_11_ != -256)
				method170((byte) 102);
			return class108;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "bp.B(" + i + ',' + i_11_ + ')');
		}
	}

	Class17(Class101 class101, int i, Class_fs class_fs) {
		do {
			try {
				aClass_fs245 = class_fs;
				if (aClass_fs245 == null)
					break;
				int i_12_ = aClass_fs245.method87((byte) 39) - 1;
				aClass_fs245.method95(i_12_, 28724);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("bp.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class59_Sub3 method168(int i, int i_13_, int i_14_, Class var_class) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_13_][i_14_];
		if (class147 == null)
			return null;
		for (Class3 class3 = ((Class147) class147).aClass3_2160; class3 != null; class3 = ((Class3) class3).aClass3_28) {
			Class59_Sub3 class59_sub3 = ((Class3) class3).aClass59_Sub3_24;
			if (var_class.isAssignableFrom(class59_sub3.getClass()) && ((Class59_Sub3) class59_sub3).aShort5057 == i_13_ && ((Class59_Sub3) class59_sub3).aShort5064 == i_14_)
				return class59_sub3;
		}
		return null;
	}

	final void method169(byte i) {
		do {
			try {
				anInt251++;
				synchronized (aClass54_243) {
					aClass54_243.method383(i + 108);
				}
				if (i == 7)
					break;
				method168(104, 33, 99, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bp.H(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method170(byte i) {
		do {
			try {
				aClass246_Sub1_Sub17Array246 = null;
				aClass182_242 = null;
				if (i < -84)
					break;
				method163(-59, 53);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "bp.C(" + i + ')');
			}
			break;
		} while (false);
	}
}
