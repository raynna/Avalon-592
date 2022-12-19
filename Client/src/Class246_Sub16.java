/* Class246_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub16 extends Node {
	int anInt4519;
	int anInt4520;
	static Class_l aClass_l4521;
	int anInt4522;
	int anInt4523;
	int anInt4524;
	int anInt4525;
	int anInt4526;
	int anInt4527;
	int anInt4528;
	static int aInt92;
	int anInt4530;
	static Class_fs index23;
	int anInt4532;
	int anInt4533;
	static int anInt4534;
	int anInt4535;
	int anInt4536;
	int anInt4537;
	/* synthetic */ static Class aClass4538;

	final Class_t method2017(int i, Class260 class260, int i_0_) {
		try {
			anInt4534++;
			int i_1_ = (Class246_Sub19.anIntArray4712[((Class246_Sub16) this).anInt4527]);
			if (i_1_ != 0) {
				if (i_1_ != 1) {
					if (i_1_ == 2) {
						Class59_Sub3 class59_sub3 = (Class17.method168(((Class246_Sub16) this).anInt4528, ((Class246_Sub16) this).anInt4520, ((Class246_Sub16) this).anInt4525, (aClass4538 != null ? aClass4538 : (aClass4538 = getClassByName("Class_f")))));
						if (class59_sub3 instanceof Class59_Sub3_Sub1) {
							Class59_Sub3_Sub1 class59_sub3_sub1 = (Class59_Sub3_Sub1) class59_sub3;
							if ((((Class59_Sub3_Sub1) class59_sub3_sub1).aClass59_Sub3_5732) != null)
								return ((Class_f) ((Class59_Sub3_Sub1) class59_sub3_sub1).aClass59_Sub3_5732).method23(class260, i_0_, 115);
						}
					} else if ((i_1_ ^ 0xffffffff) == -4) {
						Class59_Sub1 class59_sub1 = (Class246_Sub14.method1997(((Class246_Sub16) this).anInt4528, ((Class246_Sub16) this).anInt4520, ((Class246_Sub16) this).anInt4525));
						if (class59_sub1 instanceof Class59_Sub1_Sub1) {
							Class59_Sub1_Sub1 class59_sub1_sub1 = (Class59_Sub1_Sub1) class59_sub1;
							if ((((Class59_Sub1_Sub1) class59_sub1_sub1).aClass59_Sub1_5982) != null)
								return ((Class_f) ((Class59_Sub1_Sub1) class59_sub1_sub1).aClass59_Sub1_5982).method23(class260, i_0_, -118);
						}
					}
				} else {
					Class59_Sub2 class59_sub2 = Class31.method236(((Class246_Sub16) this).anInt4528, ((Class246_Sub16) this).anInt4520, ((Class246_Sub16) this).anInt4525);
					if (class59_sub2 instanceof Class59_Sub2_Sub2) {
						Class59_Sub2_Sub2 class59_sub2_sub2 = (Class59_Sub2_Sub2) class59_sub2;
						if ((((Class59_Sub2_Sub2) class59_sub2_sub2).aClass59_Sub2_6009) != null)
							return ((Class_f) (((Class59_Sub2_Sub2) class59_sub2_sub2).aClass59_Sub2_6009)).method23(class260, i_0_, 123);
					}
				}
			} else {
				Class59_Sub4 class59_sub4 = (Class246_Sub22.method2082(((Class246_Sub16) this).anInt4528, ((Class246_Sub16) this).anInt4520, ((Class246_Sub16) this).anInt4525));
				if (class59_sub4 instanceof Class59_Sub4_Sub1) {
					Class59_Sub4_Sub1 class59_sub4_sub1 = (Class59_Sub4_Sub1) class59_sub4;
					if ((((Class59_Sub4_Sub1) class59_sub4_sub1).aClass59_Sub4_6317) != null)
						return ((Class_f) (((Class59_Sub4_Sub1) class59_sub4_sub1).aClass59_Sub4_6317)).method23(class260, i_0_, 113);
				}
			}
			if (i != 1)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ig.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	public static void method2018(int i) {
		try {
			aClass_l4521 = null;
			int i_2_ = 119 / ((-70 - i) / 53);
			index23 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ig.B(" + i + ')');
		}
	}

	public Class246_Sub16() {
		/* empty */
	}

	/* synthetic */ static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
