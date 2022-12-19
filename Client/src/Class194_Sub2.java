
/* Class194_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class194_Sub2 extends Class194 implements Interface10 {
	static int anInt4948;
	static int anInt4949;
	static int anInt4950;
	static int anInt4951;
	static Class81 aClass81_4952 = new Class81(0, 2, 2, 1);
	static int anInt4953;
	static int anInt4954;
	static int anInt4955;
	private int anInt4956;
	static int anInt4957;

	public static void method2144(int i) {
		try {
			if (i == 11134)
				aClass81_4952 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.E(" + i + ')');
		}
	}

	static final void method2145(int i, boolean bool) {
		try {
			anInt4953++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 127, 11);
			if (bool != false)
				method2146(96, (byte) -26);
			class246_sub1_sub10.method2604((byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.G(" + i + ',' + bool + ')');
		}
	}

	static final void method2146(int i, byte i_0_) {
		try {
			if (i_0_ <= 41)
				method2145(51, false);
			anInt4949++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 116, 16);
			class246_sub1_sub10.method2604((byte) -86);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.H(" + i + ',' + i_0_ + ')');
		}
	}

	public final long method32(int i) {
		try {
			if (i != 12786)
				return -2L;
			anInt4950++;
			return ((Class194) this).aNativeBuffer2725.getAddress();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.D(" + i + ')');
		}
	}

	Class194_Sub2(Class260_Sub2 class260_sub2, int i, Buffer nativebuffer) {
		super(class260_sub2, nativebuffer);
		try {
			anInt4956 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("om.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (nativebuffer != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			if (bool != true)
				method32(-15);
			anInt4955++;
			return anInt4956;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.C(" + bool + ')');
		}
	}

	public final int method1(int i) {
		try {
			anInt4951++;
			int i_1_ = 35 / ((17 - i) / 39);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "om.A(" + i + ')');
		}
	}

	Class194_Sub2(Class260_Sub2 class260_sub2, int i, byte[] is, int i_2_) {
		super(class260_sub2, is, i_2_);
		try {
			anInt4956 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("om.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public final void method33(byte i, int i_3_, int i_4_, byte[] is) {
		try {
			anInt4957++;
			this.method1274(is, i_3_);
			int i_5_ = 94 / ((12 - i) / 38);
			anInt4956 = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("om.F(" + i + ',' + i_3_ + ',' + i_4_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
