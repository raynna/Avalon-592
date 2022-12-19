
/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class198 {
	private Class_l[] aClass_lArray2819;
	private int[] anIntArray2820 = new int[4];
	private int anInt2821;
	private static int anInt2822 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	private boolean aBool2823 = false;
	private int anInt2824;
	private int[] anIntArray2825;
	private static int[] anIntArray2826 = new int[256];

	public static void method1301() {
		anIntArray2826 = null;
	}

	private final void method1302(Class260 class260, String string, int[] is, int i, int i_0_, int i_1_, boolean bool) {
		if (i_1_ == 0)
			bool = false;
		i_1_ |= ~0xffffff;
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
			int i_3_ = anIntArray2826[string.charAt(i_2_)];
			if (bool)
				aClass_lArray2819[i_3_].r(i + 1, i_0_ + 1, 0, -16777216, 1);
			aClass_lArray2819[i_3_].r(i, i_0_, 0, i_1_, 1);
			i += anIntArray2825[i_3_];
		}
	}

	final int method1303() {
		return anInt2821 - 1;
	}

	final void method1304(Class260 class260, String string, int i, int i_4_, int i_5_, boolean bool) {
		int i_6_ = method1305(string) / 2;
		class260.da(anIntArray2820);
		if (i - i_6_ <= anIntArray2820[2] && i + i_6_ >= anIntArray2820[0] && i_4_ - anInt2824 <= anIntArray2820[3] && i_4_ + anInt2821 >= anIntArray2820[1])
			method1302(class260, string, anIntArray2820, i - i_6_, i_4_, i_5_, bool);
	}

	final int method1305(String string) {
		int i = 0;
		for (int i_7_ = 0; i_7_ < string.length(); i_7_++) {
			int i_8_ = anIntArray2826[string.charAt(i_7_)];
			i += anIntArray2825[i_8_];
		}
		return i;
	}

	final int method1306() {
		return anInt2824;
	}

	private final void method1307(Class260 class260, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_9_ = fontmetrics.charWidth(c);
		int i_10_ = i_9_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W')
					i_9_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_11_ = fontmetrics.getMaxAscent();
		int i_12_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_13_ = fontmetrics.getHeight();
		Image image = Class147.aCanvas2155.createImage(i_9_, i_12_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_9_, i_12_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, i_11_);
		if (bool)
			graphics.drawString(String.valueOf(c), 1, i_11_);
		int[] is = new int[i_9_ * i_12_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_9_, i_12_, is, 0, i_9_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_14_ = 0;
		while_246_: for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
			for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
				int i_17_ = is[i_16_ + i_15_ * i_9_];
				if ((i_17_ & 0xffffff) != 0) {
					i_14_ = i_15_;
					break while_246_;
				}
			}
		}
		for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
			if ((is[i_18_] & 0xffffff) == 0)
				is[i_18_] = 0;
		}
		anInt2824 = i_11_ - i_14_;
		anInt2821 = i_13_;
		anIntArray2825[i] = i_10_;
		aClass_lArray2819[i] = class260.method1706(is, 0, i_9_, i_9_, i_12_);
	}

	Class198(Class260 class260, int i, boolean bool, Component component) {
		aBool2823 = false;
		aClass_lArray2819 = new Class_l[256];
		anIntArray2825 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_19_ = 0; i_19_ < anInt2822; i_19_++)
			method1307(class260, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_19_), i_19_, false);
		if (bool && aBool2823) {
			aBool2823 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_20_ = 0; i_20_ < anInt2822; i_20_++)
				method1307(class260, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_20_), i_20_, false);
			if (!aBool2823) {
				aBool2823 = false;
				for (int i_21_ = 0; i_21_ < anInt2822; i_21_++)
					method1307(class260, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_21_), i_21_, true);
			}
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_22_ == -1)
				i_22_ = 74;
			anIntArray2826[i] = i_22_;
		}
	}
}
