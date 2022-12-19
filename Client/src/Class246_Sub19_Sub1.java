
/* Class246_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class Class246_Sub19_Sub1 extends Class246_Sub19 {
	private Shape aShape6225;
	private Image anImage6226;
	private Rectangle aRectangle6227;
	private Canvas aCanvas6228;

	final void method2064(int i, int i_0_, int i_1_, Graphics graphics, byte i_2_, int i_3_) {
		try {
			aShape6225 = graphics.getClip();
			aRectangle6227.x = i_1_;
			aRectangle6227.y = i;
			aRectangle6227.height = i_3_;
			if (i_2_ > -1)
				aCanvas6228 = null;
			aRectangle6227.width = i_0_;
			graphics.setClip(aRectangle6227);
			graphics.drawImage(anImage6226, 0, 0, aCanvas6228);
			graphics.setClip(aShape6225);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2069(byte i, Canvas canvas) {
		try {
			aCanvas6228 = canvas;
			if (i == 66) {
				aRectangle6227 = new Rectangle();
				((Class246_Sub19_Sub1) this).anInt4706 = aCanvas6228.getSize().width;
				((Class246_Sub19_Sub1) this).anInt4705 = aCanvas6228.getSize().height;
				((Class246_Sub19_Sub1) this).anIntArray4704 = new int[(((Class246_Sub19_Sub1) this).anInt4706 * ((Class246_Sub19_Sub1) this).anInt4705)];
				DataBufferInt databufferint = new DataBufferInt((((Class246_Sub19_Sub1) this).anIntArray4704), (((Class246_Sub19_Sub1) this).anIntArray4704).length);
				DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
				WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(((Class246_Sub19_Sub1) this).anInt4706, ((Class246_Sub19_Sub1) this).anInt4705)), databufferint, null));
				anImage6226 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2071(int i, int i_4_, int i_5_, Graphics graphics) {
		try {
			graphics.drawImage(anImage6226, i_4_, i_5_, aCanvas6228);
			if (i != -10312)
				method2064(-65, -108, 61, null, (byte) 46, -11);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
