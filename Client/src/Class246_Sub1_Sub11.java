/* Class246_Sub1_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub1_Sub11 extends Class246_Sub1 {
	Class162 aClass162_6236;
	Class4 aClass4_6237;
	int anInt6238;
	static int anInt6239;
	int anInt6240;
	int anInt6241;
	int anInt6242;
	static int anInt6243;
	static int anInt6244;
	static int[] anIntArray6245;
	static int[] anIntArray6246;
	int anInt6247;

	public static void method2613(boolean bool) {
		do {
			try {
				anIntArray6246 = null;
				anIntArray6245 = null;
				if (bool == true)
					break;
				anIntArray6246 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ij.D(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method2614(Class_fs class_fs, int i) {
		do {
			try {
				Class166.aClass_fs2344 = class_fs;
				anInt6243++;
				if (i == 23028)
					break;
				method2614(null, -111);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ij.B(" + (class_fs != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2615(byte i) {
		try {
			if (i <= 81)
				anIntArray6245 = null;
			anInt6239++;
			if ((Class246_Sub1_Sub7.anInt6030 ^ 0xffffffff) < -1)
				Class135.method917(2700);
			else {
				Class92.aClass6_1208 = Class65.aClass6_864;
				Class65.aClass6_864 = null;
				Class99.method622((byte) 1, 40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ij.A(" + i + ')');
		}
	}

	final void method2616(int i) {
		try {
			((Class246_Sub1_Sub11) this).anInt6242 = (((Class162) ((Class246_Sub1_Sub11) this).aClass162_6236).anInt2292);
			((Class246_Sub1_Sub11) this).anInt6240 = (((Class162) ((Class246_Sub1_Sub11) this).aClass162_6236).anInt2294);
			anInt6244++;
			((Class246_Sub1_Sub11) this).anInt6247 = (((Class162) ((Class246_Sub1_Sub11) this).aClass162_6236).anInt2301);
			if ((((Class162) ((Class246_Sub1_Sub11) this).aClass162_6236).aClass_c2291) != null)
				((Class162) ((Class246_Sub1_Sub11) this).aClass162_6236).aClass_c2291.p((((Class4) ((Class246_Sub1_Sub11) this).aClass4_6237).anInt44), (((Class4) ((Class246_Sub1_Sub11) this).aClass4_6237).anInt40), (((Class4) ((Class246_Sub1_Sub11) this).aClass4_6237).anInt48), Class59_Sub4_Sub2.anIntArray6832);
			((Class246_Sub1_Sub11) this).anInt6241 = Class59_Sub4_Sub2.anIntArray6832[i];
			((Class246_Sub1_Sub11) this).anInt6238 = Class59_Sub4_Sub2.anIntArray6832[0];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ij.C(" + i + ')');
		}
	}

	Class246_Sub1_Sub11(Class162 class162, Class130_Sub2 class130_sub2) {
		try {
			((Class246_Sub1_Sub11) this).aClass162_6236 = class162;
			((Class246_Sub1_Sub11) this).aClass4_6237 = ((Class246_Sub1_Sub11) this).aClass162_6236.method1078((byte) 125);
			method2616(2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ij.<init>(" + (class162 != null ? "{...}" : "null") + ',' + (class130_sub2 != null ? "{...}" : "null") + ')'));
		}
	}
}
