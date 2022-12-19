
/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas {
	private Component aComponent6888;
	static Class246_Sub37_Sub2 aClass246_Sub37_Sub2_6889;
	static IncomingPacket aClass13_6890 = new IncomingPacket(106, 10);
	static int anInt6891;
	static int anInt6892;
	static int anInt6893;
	static float aFloat6894;
	static float aFloat6895;

	static final void method2838(int i, BufferStream stream) {
		try {
			anInt6891++;
			if (i >= ((((BufferStream) stream).buffer.length - ((BufferStream) stream).position) ^ 0xffffffff)) {
				int i_0_ = stream.readUnsignedByte(i ^ ~0xfe);
				if ((i_0_ ^ 0xffffffff) <= -1 && (i_0_ ^ 0xffffffff) >= -2 && (-((BufferStream) stream).position + ((BufferStream) stream).buffer.length) >= 2) {
					int i_1_ = stream.readUnsignedShort((byte) 111);
					if (((((BufferStream) stream).buffer.length + -((BufferStream) stream).position) ^ 0xffffffff) == (i_1_ * 6 ^ 0xffffffff)) {
						while (((BufferStream) stream).buffer.length > ((BufferStream) stream).position) {
							int i_2_ = stream.readUnsignedShort((byte) 81);
							int i_3_ = stream.readInt((byte) 77);
							if (((i_2_ ^ 0xffffffff) > (Class246_Sub1_Sub11.anIntArray6246.length ^ 0xffffffff)) && Class59_Sub3_Sub1.aBoolArray5739[i_2_] && (((((Class225) Class_c.aClass76_1194.method477(115, i_2_)).aChar3108) ^ 0xffffffff) != -50 || ((i_3_ ^ 0xffffffff) <= 0 && (i_3_ ^ 0xffffffff) >= -2)))
								Class246_Sub1_Sub11.anIntArray6246[i_2_] = i_3_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sg.B(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public final void paint(Graphics graphics) {
		try {
			aComponent6888.paint(graphics);
			anInt6892++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sg.paint(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	Canvas_Sub1(Component component) {
		try {
			aComponent6888 = component;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sg.<init>(" + (component != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2839(int i) {
		try {
			aClass246_Sub37_Sub2_6889 = null;
			if (i == -29624)
				aClass13_6890 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "sg.A(" + i + ')');
		}
	}

	public final void update(Graphics graphics) {
		try {
			anInt6893++;
			aComponent6888.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("sg.update(" + (graphics != null ? "{...}" : "null") + ')'));
		}
	}
}
