
/* Class109_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class109_Sub2 extends Class109 {
	static int anInt3815;
	static Class_fs index28;
	static int anInt3817;
	static boolean aBool3818;
	static int anInt3819;
	private int anInt3820;
	static int anInt3821;
	static int anInt3822;

	static final void method1790(int i) {
		try {
			Class97.anInt1264 = (((Class73) Class246_Sub5.aClass73_3892).anInt951 + ((Class73) Class246_Sub5.aClass73_3892).anInt946 + 2);
			anInt3822++;
			Class200.anInt2852 = 2 + (((Class73) Class_fs.aClass73_148).anInt946 + ((Class73) Class_fs.aClass73_148).anInt951);
			Class55.aStringArray786 = new String[500];
			for (int i_0_ = 0; i_0_ < Class55.aStringArray786.length; i_0_++)
				Class55.aStringArray786[i_0_] = "";
			int i_1_ = -108 / ((-22 - i) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ar.L(" + i + ')');
		}
	}

	final void method1791(byte i, boolean bool) {
		try {
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			if (i != 35)
				method1791((byte) -40, false);
			anInt3821++;
			OpenGL.glTexParameteri(((Class109) this).anInt1553, 10242, bool ? 10497 : 33071);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ar.N(" + i + ',' + bool + ')');
		}
	}

	public static void method1792(int i) {
		try {
			if (i <= -15)
				index28 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ar.M(" + i + ')');
		}
	}

	Class109_Sub2(Class260_Sub2 class260_sub2, int i, int i_2_, byte[] is, int i_3_) {
		super(class260_sub2, 3552, i, i_2_, false);
		try {
			anInt3820 = i_2_;
			((Class109) this).aClass260_Sub2_1552.method1905((byte) 78, this);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glTexImage1Dub(((Class109) this).anInt1553, 0, ((Class109) this).anInt1556, anInt3820, 0, i_3_, 5121, is, 0);
			OpenGL.glPixelStorei(3317, 4);
			this.method753(117, true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ar.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	public final void method8(int i) {
		do {
			try {
				anInt3817++;
				if (i >= 121)
					break;
				aBool3818 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ar.P(" + i + ')');
			}
			break;
		} while (false);
	}
}
