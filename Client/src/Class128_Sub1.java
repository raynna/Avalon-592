/* Class128_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class128_Sub1 extends Class128 {
	static Class65 aClass65_5558;
	static int anInt5559;
	static int anInt5560;
	static float aFloat5561;
	static int anInt5562;
	Class109_Sub1_Sub1 aClass109_Sub1_Sub1_5563;
	static int anInt5564;

	static final void method2329(int i) {
		do {
			try {
				anInt5559++;
				if (i != -9410)
					anInt5560 = -125;
				Class90.aClass235Array1168 = null;
				Class40_Sub1.method1771(0, -1, 0, Class246_Sub41_Sub1.anInt6171, Class183.anInt2549, Class162.anInt2300, 0, (byte) 27, 0);
				if (Class90.aClass235Array1168 == null)
					break;
				Class246_Sub1_Sub9.method2588(0, Class246_Sub41_Sub1.anInt6171, Class139.anInt1987, ((Class235) Class33.aClass235_445).anInt3297, Class90.aClass235Array1168, 0, -1412584499, Class162.anInt2300, Class246_Sub28_Sub12.anInt6197, -1268043624);
				Class90.aClass235Array1168 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "wk.H(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2330(int i) {
		try {
			if (i == 19274)
				aClass65_5558 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wk.F(" + i + ')');
		}
	}

	static final void method2331(int i) {
		try {
			Class114.anInt1598 = 0;
			Class59_Sub3_Sub1.aBool5746 = false;
			Class160.anInt2271 = -1;
			Class95.anInt1252 = 0;
			anInt5562++;
			Class59_Sub3_Sub2.f_bb = 0;
			Class246_Sub1_Sub14.anInt6590 = i;
			Class246_Sub31.anInt5034 = -3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "wk.E(" + i + ')');
		}
	}

	Class128_Sub1(Class260_Sub2 class260_sub2, int i, int i_0_, byte[] is) {
		try {
			((Class128_Sub1) this).aClass109_Sub1_Sub1_5563 = Class18.method176(false, (byte) -122, is, class260_sub2, i, i_0_, 6406, 6406);
			((Class128_Sub1) this).aClass109_Sub1_Sub1_5563.method1767(10497, false, false);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wk.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2332(int i, String string, int i_1_, String string_2_) {
		try {
			Class1.aString3 = string;
			Class246_Sub32.aString5042 = string_2_;
			anInt5564++;
			Class87.anInt1143 = i_1_;
			if (Class1.aString3.equals("") || Class246_Sub32.aString5042.equals(""))
				Class246_Sub31.anInt5034 = 3;
			else if ((Class32.anInt438 ^ 0xffffffff) != 0)
				method2331(1);
			else {
				Class246_Sub31.anInt5034 = -3;
				Class_o.anInt7225 = 0;
				Class228.anInt3137 = 1;
				Class129.anInt1808 = 0;
				BufferStream stream = new BufferStream(128);
				stream.writeByte(255, 10);
				stream.writeInt((int) (Math.random() * 9.9999999E7), (byte) -70);
				stream.writeLong(Class246_Sub28_Sub6.method2554(1, Class1.aString3), (byte) -48);
				stream.writeInt((int) (9.9999999E7 * Math.random()), (byte) -63);
				stream.writeString(80, Class246_Sub32.aString5042);
				stream.writeInt((int) (Math.random() * 9.9999999E7), (byte) 109);
				stream.method2385(Class246_Sub28_Sub4.RSA_EXPONENT, (byte) -107, Class169.RSA_MODULUS);
				((BufferStream) Class130_Sub1.stream).position = 0;
				if (i != 6745)
					method2329(-41);
				Class130_Sub1.stream.writeByte(255, ((Class48) Class246_Sub1_Sub10.aClass48_6222).anInt689);
				Class130_Sub1.stream.writeByte(i ^ 0x1aa6, ((BufferStream) stream).position + 2);
				Class130_Sub1.stream.writeShort((byte) 67, 592);
				Class130_Sub1.stream.writeBytes(0, true, (((BufferStream) stream).buffer), (((BufferStream) stream).position));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("wk.G(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_1_ + ',' + (string_2_ != null ? "{...}" : "null") + ')'));
		}
	}
}
