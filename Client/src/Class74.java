
/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class74 implements Interface6 {
	static int anInt966;
	static int anInt967 = -1;
	static int anInt968;
	static int anInt969;
	private Class_fs aClass_fs970;
	static int anInt971;
	static int anInt972;
	static int anInt973 = 0;
	static int anInt974;
	private Class127 aClass127_975 = new Class127(256);
	static int anInt976;
	private Class_fs aClass_fs977;
	static int anInt978;
	private Class238[] aClass238Array979;
	static int anInt980 = -1;

	public final Class238 method17(int i, int i_0_) {
		try {
			anInt968++;
			if (i != -31305)
				aClass_fs977 = null;
			return aClass238Array979[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hb.D(" + i + ',' + i_0_ + ')');
		}
	}

	public final int[] method16(boolean bool, int i, boolean bool_1_, float f, int i_2_, int i_3_) {
		try {
			anInt971++;
			if (bool_1_ != false)
				method15(-0.10881342F, -4, 5, false, -14, 121);
			return (method470(i, -22934).method2702(i_3_, (byte) 110, aClass_fs970, this, i_2_, (double) f, ((Class238) aClass238Array979[i]).aBool3356));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hb.C(" + bool + ',' + i + ',' + bool_1_ + ',' + f + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final int[] method14(boolean bool, int i, int i_4_, float f, int i_5_, int i_6_) {
		try {
			if (i != 5754)
				anInt966 = 95;
			anInt978++;
			return (method470(i_4_, -22934).method2697(this, -40, bool, ((Class238) aClass238Array979[i_4_]).aBool3356, aClass_fs970, (double) f, i_6_, i_5_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hb.E(" + bool + ',' + i + ',' + i_4_ + ',' + f + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public final float[] method15(float f, int i, int i_7_, boolean bool, int i_8_, int i_9_) {
		try {
			if (i_9_ != 15752)
				anInt973 = -59;
			anInt969++;
			return (method470(i, -22934).method2703(false, this, aClass_fs970, i_8_, ((Class238) aClass238Array979[i]).aBool3356, i_7_));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hb.B(" + f + ',' + i + ',' + i_7_ + ',' + bool + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	private final Class246_Sub1_Sub13 method470(int i, int i_10_) {
		try {
			anInt976++;
			Class246_Sub1 class246_sub1 = aClass127_975.method872((long) i, (byte) 76);
			if (class246_sub1 != null)
				return (Class246_Sub1_Sub13) class246_sub1;
			if (i_10_ != -22934)
				anInt973 = -92;
			byte[] is = aClass_fs977.method109(i, -1);
			if (is == null)
				return null;
			Class246_Sub1_Sub13 class246_sub1_sub13 = new Class246_Sub1_Sub13(new BufferStream(is));
			aClass127_975.method869((long) i, class246_sub1_sub13, -8869);
			return class246_sub1_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hb.A(" + i + ',' + i_10_ + ')');
		}
	}

	public final boolean method13(int i, int i_11_) {
		try {
			anInt972++;
			if (i_11_ != 19378)
				return false;
			Class246_Sub1_Sub13 class246_sub1_sub13 = method470(i, i_11_ + -42312);
			if (class246_sub1_sub13 == null || !class246_sub1_sub13.method2696((byte) -127, aClass_fs970, this))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "hb.G(" + i + ',' + i_11_ + ')');
		}
	}

	Class74(Class_fs class_fs, Class_fs class_fs_12_, Class_fs class_fs_13_) {
		try {
			aClass_fs970 = class_fs_13_;
			aClass_fs977 = class_fs_12_;
			BufferStream stream = new BufferStream(class_fs.method91(0, 0, 84));
			int i = stream.readUnsignedShort((byte) -127);
			aClass238Array979 = new Class238[i];
			for (int i_14_ = 0; i_14_ < i; i_14_++) {
				if (stream.readUnsignedByte(255) == 1)
					aClass238Array979[i_14_] = new Class238();
			}
			for (int i_15_ = 0; i_15_ < i; i_15_++) {
				if (aClass238Array979[i_15_] != null)
					((Class238) aClass238Array979[i_15_]).aBool3339 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -1;
			}
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i ^ 0xffffffff); i_16_++) {
				if (aClass238Array979[i_16_] != null)
					((Class238) aClass238Array979[i_16_]).aBool3340 = stream.readUnsignedByte(255) == 1;
			}
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i ^ 0xffffffff); i_17_++) {
				if (aClass238Array979[i_17_] != null)
					((Class238) aClass238Array979[i_17_]).aBool3335 = stream.readUnsignedByte(255) == 1;
			}
			for (int i_18_ = 0; i > i_18_; i_18_++) {
				if (aClass238Array979[i_18_] != null)
					((Class238) aClass238Array979[i_18_]).aBool3348 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
			}
			for (int i_19_ = 0; i > i_19_; i_19_++) {
				if (aClass238Array979[i_19_] != null)
					((Class238) aClass238Array979[i_19_]).aByte3338 = stream.readByte(false);
			}
			for (int i_20_ = 0; (i ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
				if (aClass238Array979[i_20_] != null)
					((Class238) aClass238Array979[i_20_]).aByte3344 = stream.readByte(false);
			}
			for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i ^ 0xffffffff); i_21_++) {
				if (aClass238Array979[i_21_] != null)
					((Class238) aClass238Array979[i_21_]).aByte3343 = stream.readByte(false);
			}
			for (int i_22_ = 0; (i ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
				if (aClass238Array979[i_22_] != null)
					((Class238) aClass238Array979[i_22_]).aByte3342 = stream.readByte(false);
			}
			for (int i_23_ = 0; (i ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
				if (aClass238Array979[i_23_] != null)
					((Class238) aClass238Array979[i_23_]).aShort3354 = (short) stream.readUnsignedShort((byte) -37);
			}
			for (int i_24_ = 0; i > i_24_; i_24_++) {
				if (aClass238Array979[i_24_] != null)
					((Class238) aClass238Array979[i_24_]).aByte3345 = stream.readByte(false);
			}
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i ^ 0xffffffff); i_25_++) {
				if (aClass238Array979[i_25_] != null)
					((Class238) aClass238Array979[i_25_]).aByte3350 = stream.readByte(false);
			}
			for (int i_26_ = 0; i > i_26_; i_26_++) {
				if (aClass238Array979[i_26_] != null)
					((Class238) aClass238Array979[i_26_]).aBool3347 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
			}
			for (int i_27_ = 0; i > i_27_; i_27_++) {
				if (aClass238Array979[i_27_] != null)
					((Class238) aClass238Array979[i_27_]).aBool3356 = stream.readUnsignedByte(255) == 1;
			}
			for (int i_28_ = 0; (i ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
				if (aClass238Array979[i_28_] != null)
					((Class238) aClass238Array979[i_28_]).aByte3349 = stream.readByte(false);
			}
			for (int i_29_ = 0; i > i_29_; i_29_++) {
				if (aClass238Array979[i_29_] != null)
					((Class238) aClass238Array979[i_29_]).aBool3352 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
			}
			for (int i_30_ = 0; i_30_ < i; i_30_++) {
				if (aClass238Array979[i_30_] != null)
					((Class238) aClass238Array979[i_30_]).aBool3353 = stream.readUnsignedByte(255) == 1;
			}
			for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i ^ 0xffffffff); i_31_++) {
				if (aClass238Array979[i_31_] != null)
					((Class238) aClass238Array979[i_31_]).aBool3337 = stream.readUnsignedByte(255) == 1;
			}
			for (int i_32_ = 0; i > i_32_; i_32_++) {
				if (aClass238Array979[i_32_] != null)
					((Class238) aClass238Array979[i_32_]).anInt3341 = stream.readUnsignedByte(255);
			}
			for (int i_33_ = 0; i > i_33_; i_33_++) {
				if (aClass238Array979[i_33_] != null)
					((Class238) aClass238Array979[i_33_]).anInt3336 = stream.readInt((byte) 112);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hb.<init>(" + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_12_ != null ? "{...}" : "null") + ',' + (class_fs_13_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class232 method471(byte i, Component component) {
		try {
			anInt974++;
			if (i <= 14)
				anInt967 = -72;
			return new Class232_Sub1(component);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("hb.F(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}
}
