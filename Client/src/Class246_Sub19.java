
/* Class246_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

abstract class Class246_Sub19 extends Node {
	int[] anIntArray4704;
	int anInt4705;
	int anInt4706;
	static int anInt4707;
	static IncomingPacket aClass13_4708;
	static int anInt4709;
	static int anInt4710;
	static int anInt4711;
	static int[] anIntArray4712 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	abstract void method2064(int i, int i_0_, int i_1_, Graphics graphics, byte i_2_, int i_3_);

	static final void method2065(int i, int i_4_) {
		try {
			anInt4711++;
			if (i != (i_4_ ^ 0xffffffff) && Class130_Sub8.aBoolArray5609[i_4_]) {
				Class40_Sub8.aClass_fs5193.method102(-1, i_4_);
				Class246_Sub32.aClass235ArrayArray5049[i_4_] = null;
				Class14.aClass235ArrayArray225[i_4_] = null;
				Class130_Sub8.aBoolArray5609[i_4_] = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kd.J(" + i + ',' + i_4_ + ')');
		}
	}

	public static void method2066(byte i) {
		do {
			try {
				anIntArray4712 = null;
				aClass13_4708 = null;
				if (i <= -40)
					break;
				method2068(false);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "kd.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2067(Color color, int i, Color color_5_, Color color_6_, int i_7_, boolean bool, String string) {
		do {
			try {
				anInt4709++;
				try {
					Graphics graphics = Class147.aCanvas2155.getGraphics();
					if (Class214.aFont2992 == null)
						Class214.aFont2992 = new Font("Helvetica", 1, 13);
					if (bool) {
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, Class246_Sub41_Sub1.anInt6171, Class162.anInt2300);
					}
					if (color_6_ == null)
						color_6_ = new Color(140, 17, 17);
					if (color_5_ == null)
						color_5_ = new Color(140, 17, 17);
					if (color == null)
						color = new Color(255, 255, 255);
					try {
						if (Class246_Sub28_Sub22.anImage6633 == null)
							Class246_Sub28_Sub22.anImage6633 = Class147.aCanvas2155.createImage(304, 34);
						Graphics graphics_8_ = Class246_Sub28_Sub22.anImage6633.getGraphics();
						graphics_8_.setColor(color_5_);
						graphics_8_.drawRect(0, 0, 303, 33);
						graphics_8_.setColor(color_6_);
						graphics_8_.fillRect(2, 2, 3 * i_7_, 30);
						graphics_8_.setColor(Color.black);
						graphics_8_.drawRect(1, 1, 301, 31);
						graphics_8_.fillRect(2 - -(i_7_ * 3), 2, 300 + -(3 * i_7_), 30);
						graphics_8_.setFont(Class214.aFont2992);
						if (i < 98)
							method2065(-100, -110);
						graphics_8_.setColor(color);
						graphics_8_.drawString(string, (304 - 6 * string.length()) / 2, 22);
						graphics.drawImage(Class246_Sub28_Sub22.anImage6633, -152 + (Class246_Sub41_Sub1.anInt6171) / 2, -18 + Class162.anInt2300 / 2, null);
					} catch (Exception exception) {
						int i_9_ = Class246_Sub41_Sub1.anInt6171 / 2 - 152;
						int i_10_ = Class162.anInt2300 / 2 - 18;
						graphics.setColor(color_5_);
						graphics.drawRect(0, 0, 303, 33);
						graphics.setColor(color_6_);
						graphics.fillRect(2 + i_9_, 2 + i_10_, 3 * i_7_, 30);
						graphics.setColor(Color.black);
						graphics.drawRect(1 + i_9_, 1 + i_10_, 301, 31);
						graphics.fillRect(i_7_ * 3 + (2 + i_9_), i_10_ + 2, -(3 * i_7_) + 300, 30);
						graphics.setFont(Class214.aFont2992);
						graphics.setColor(color);
						graphics.drawString(string, ((-(string.length() * 6) + 304) / 2 + i_9_), i_10_ + 22);
					}
					if (Class246_Sub28_Sub9.aString6139 == null)
						break;
					graphics.setFont(Class214.aFont2992);
					graphics.setColor(color);
					graphics.drawString(Class246_Sub28_Sub9.aString6139, (Class246_Sub41_Sub1.anInt6171 / 2 - Class246_Sub28_Sub9.aString6139.length() * 6 / 2), -26 + Class162.anInt2300 / 2);
				} catch (Exception exception) {
					Class147.aCanvas2155.repaint();
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("kd.K(" + (color != null ? "{...}" : "null") + ',' + i + ',' + (color_5_ != null ? "{...}" : "null") + ',' + (color_6_ != null ? "{...}" : "null") + ',' + i_7_ + ',' + bool + ',' + (string != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static final void method2068(boolean bool) {
		try {
			if (bool != true)
				method2067(null, -122, null, null, 2, true, null);
			anInt4707++;
			if (Class75.aClass182_989 != null) {
				if ((Class75.aClass182_989.anInt2539 ^ 0xffffffff) == -2)
					Class75.aClass182_989 = null;
				else if (Class75.aClass182_989.anInt2539 == 2) {
					Class246_Sub28_Sub17.method2658((InputStream_Sub1.aClass52_4825), 2, Class40_Sub7.aString5175, 117);
					Class75.aClass182_989 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kd.L(" + bool + ')');
		}
	}

	abstract void method2069(byte i, Canvas canvas);

	static final void method2070(int i) {
		try {
			anInt4710++;
			int i_11_ = (int) ((double) Class38_Sub1_Sub1.anInt6770 * 34.46);
			if (i != 17569)
				method2070(-36);
			i_11_ <<= 0;
			if (Class246_Sub15.aClass260_4445.method1727())
				i_11_ += 128;
			Class246_Sub15.aClass260_4445.ia(50, i_11_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kd.I(" + i + ')');
		}
	}

	abstract void method2071(int i, int i_12_, int i_13_, Graphics graphics);

	static {
		aClass13_4708 = new IncomingPacket(42, -1);
	}
}
