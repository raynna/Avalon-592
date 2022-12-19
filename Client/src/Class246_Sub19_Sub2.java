
/* Class246_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class246_Sub19_Sub2 extends Class246_Sub19 implements ImageProducer {
	static int anInt6794;
	static int anInt6795;
	static int anInt6796;
	static int anInt6797;
	private ImageConsumer anImageConsumer6798;
	static int anInt6799;
	static int anInt6800;
	private ColorModel aColorModel6801;
	static int anInt6802;
	static int anInt6803;
	private Canvas aCanvas6804;
	static int anInt6805;
	static int anInt6806;
	static int anInt6807;
	static int anInt6808;
	private Image anImage6809;
	static int anInt6810;
	static OutgoingPacket aClass201_6811;
	static Class99 aClass99_6812;

	static final boolean method2814(int i, boolean bool, int i_0_) {
		try {
			if (bool != false)
				return true;
			anInt6802++;
			if (!(Class100_Sub1.method2174(i_0_, i, (byte) -55) | (0x800 & i_0_ ^ 0xffffffff) != -1) && !Class6.method71(-20147, i, i_0_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.C(" + i + ',' + bool + ',' + i_0_ + ')'));
		}
	}

	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == anImageConsumer6798)
				anImageConsumer6798 = null;
			anInt6794++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.removeConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	private final synchronized void method2815(int i) {
		try {
			anInt6808++;
			if (anImageConsumer6798 != null) {
				anImageConsumer6798.setPixels(i, 0, ((Class246_Sub19) this).anInt4706, ((Class246_Sub19) this).anInt4705, aColorModel6801, ((Class246_Sub19) this).anIntArray4704, 0, ((Class246_Sub19) this).anInt4706);
				anImageConsumer6798.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "re.A(" + i + ')');
		}
	}

	private final synchronized void method2816(int i, boolean bool, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt6806++;
				if (anImageConsumer6798 != null) {
					anImageConsumer6798.setPixels(i_1_, i_2_, i_3_, i, aColorModel6801, ((Class246_Sub19) this).anIntArray4704, ((Class246_Sub19) this).anInt4706 * i_2_ - -i_1_, ((Class246_Sub19) this).anInt4706);
					anImageConsumer6798.imageComplete(2);
					if (bool == true)
						break;
					isConsumer(null);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("re.G(" + i + ',' + bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public final void startProduction(ImageConsumer imageconsumer) {
		try {
			anInt6800++;
			addConsumer(imageconsumer);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.startProduction(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2071(int i, int i_4_, int i_5_, Graphics graphics) {
		try {
			anInt6795++;
			if (i == -10312) {
				method2815(0);
				graphics.drawImage(anImage6809, i_4_, i_5_, aCanvas6804);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.E(" + i + ',' + i_4_ + ',' + i_5_ + ',' + (graphics != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		try {
			anInt6796++;
			if (anImageConsumer6798 != imageconsumer)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "re.isConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2817(int i) {
		try {
			aClass99_6812 = null;
			if (i != 2)
				aClass99_6812 = null;
			aClass201_6811 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "re.F(" + i + ')');
		}
	}

	final void method2064(int i, int i_6_, int i_7_, Graphics graphics, byte i_8_, int i_9_) {
		do {
			try {
				method2816(i_9_, true, i_7_, i, i_6_);
				anInt6799++;
				Shape shape = graphics.getClip();
				graphics.clipRect(i_7_, i, i_6_, i_9_);
				graphics.drawImage(anImage6809, 0, 0, aCanvas6804);
				graphics.setClip(shape);
				if (i_8_ < -1)
					break;
				method2814(-14, false, -78);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("re.B(" + i + ',' + i_6_ + ',' + i_7_ + ',' + (graphics != null ? "{...}" : "null") + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2069(byte i, Canvas canvas) {
		do {
			try {
				aCanvas6804 = canvas;
				anInt6797++;
				((Class246_Sub19) this).anInt4706 = aCanvas6804.getSize().width;
				((Class246_Sub19) this).anInt4705 = aCanvas6804.getSize().height;
				((Class246_Sub19) this).anIntArray4704 = new int[(((Class246_Sub19) this).anInt4706 * ((Class246_Sub19) this).anInt4705)];
				aColorModel6801 = new DirectColorModel(32, 16711680, 65280, 255);
				anImage6809 = aCanvas6804.createImage(this);
				method2815(0);
				aCanvas6804.prepareImage(anImage6809, aCanvas6804);
				method2815(0);
				aCanvas6804.prepareImage(anImage6809, aCanvas6804);
				method2815(0);
				aCanvas6804.prepareImage(anImage6809, aCanvas6804);
				if (i == 66)
					break;
				anImageConsumer6798 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("re.D(" + i + ',' + (canvas != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		try {
			anImageConsumer6798 = imageconsumer;
			anInt6803++;
			imageconsumer.setDimensions(((Class246_Sub19) this).anInt4706, ((Class246_Sub19) this).anInt4705);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(aColorModel6801);
			imageconsumer.setHints(14);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.addConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		try {
			anInt6807++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("re.requestTopDownLeftRightResend(" + (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.", "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
		aClass201_6811 = new OutgoingPacket(34, 11);
	}
}
