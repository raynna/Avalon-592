
/* Class246_Sub28_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;

final class Class246_Sub28_Sub30 extends Class246_Sub28 {
	static int anInt6863;
	static int anInt6864;
	static Class166 aClass166_6865 = new Class166();
	static int anInt6866;
	static int anInt6867;
	static int anInt6868;
	private int anInt6869 = 1024;
	static int anInt6870;
	static int anInt6871;
	private int anInt6872 = 3072;
	static Class165 aClass165_6873;
	private int anInt6874 = 2048;
	static int anInt6875 = 0;
	static Clipboard aClipboard6876;

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6870++;
				int i_1_ = i_0_;
				while_54_: do {
					do {
						if ((i_1_ ^ 0xffffffff) != -1) {
							if ((i_1_ ^ 0xffffffff) != -2) {
								if ((i_1_ ^ 0xffffffff) == -3)
									break;
								break while_54_;
							}
						} else {
							anInt6869 = stream.readUnsignedShort((byte) -92);
							break while_54_;
						}
						anInt6872 = stream.readUnsignedShort((byte) 123);
						break while_54_;
					} while (false);
					((Class246_Sub28) this).aBool4947 = stream.readUnsignedByte(255) == 1;
				} while (false);
				if (i == 4)
					break;
				method2134(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rn.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method2139(byte i, int i_2_) {
		try {
			anInt6867++;
			if (i < 33)
				method2135(47, -106);
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) -128, i_2_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_3_ = this.method2141(3, 0, i_2_);
				int[] is_4_ = is_3_[0];
				int[] is_5_ = is_3_[1];
				int[] is_6_ = is_3_[2];
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				for (int i_10_ = 0; Class246_Sub37_Sub1.f_gb > i_10_; i_10_++) {
					is_7_[i_10_] = anInt6869 - -(is_4_[i_10_] * anInt6874 >> 12);
					is_8_[i_10_] = (anInt6874 * is_5_[i_10_] >> 12) + anInt6869;
					is_9_[i_10_] = anInt6869 - -(anInt6874 * is_6_[i_10_] >> 12);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rn.J(" + i + ',' + i_2_ + ')');
		}
	}

	public Class246_Sub28_Sub30() {
		super(1, false);
	}

	final int[] method2135(int i, int i_11_) {
		try {
			anInt6868++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_11_);
			int i_12_ = 53 % ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_13_ = this.method2133(i_11_, 0, 0);
				for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (Class246_Sub37_Sub1.f_gb ^ 0xffffffff)); i_14_++)
					is[i_14_] = (anInt6874 * is_13_[i_14_] >> 12) + anInt6869;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rn.E(" + i + ',' + i_11_ + ')');
		}
	}

	static final int method2832(int i, int i_15_, byte i_16_) {
		try {
			anInt6863++;
			if (i_16_ < 103)
				anInt6875 = -83;
			if (i == 4 || (i ^ 0xffffffff) == -6)
				return Class24.anIntArray343[i_15_ & 0x3];
			return 256;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("rn.A(" + i + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final void method2833(byte i, Class260 class260) {
		do {
			try {
				do {
					if (!Class246_Sub28_Sub21.aBool6580) {
						Class8.method80((byte) -120, class260);
						if (!client.f_ob)
							break;
					}
					Stream_Sub2.method2593(class260, (byte) -128);
				} while (false);
				anInt6866++;
				if (i == -7)
					break;
				method2832(-67, -112, (byte) -111);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("rn.C(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2834(byte i) {
		do {
			try {
				anInt6871++;
				if (Class38_Sub1.aFrame5114 != null)
					break;
				int i_17_ = 39 % ((i + 60) / 51);
				int i_18_ = Class125.anInt1768;
				int i_19_ = Class100_Sub1.anInt5075;
				int i_20_ = (Class246_Sub28_Sub35.anInt7014 + (-Class246_Sub41_Sub1.anInt6171 - i_18_));
				int i_21_ = -i_19_ + -Class162.anInt2300 + Class8.anInt101;
				if (i_18_ > 0 || i_20_ > 0 || i_19_ > 0 || (i_21_ ^ 0xffffffff) < -1) {
					try {
						java.awt.Container container;
						do {
							if (Class122.aFrame1688 == null) {
								container = Class108.aClass52_1535.anApplet733;
								if (!client.f_ob)
									break;
							}
							container = Class122.aFrame1688;
						} while (false);
						int i_22_ = 0;
						int i_23_ = 0;
						if (Class122.aFrame1688 == container) {
							Insets insets = Class122.aFrame1688.getInsets();
							i_22_ = insets.left;
							i_23_ = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if ((i_18_ ^ 0xffffffff) < -1)
							graphics.fillRect(i_22_, i_23_, i_18_, Class8.anInt101);
						if ((i_19_ ^ 0xffffffff) < -1)
							graphics.fillRect(i_22_, i_23_, Class246_Sub28_Sub35.anInt7014, i_19_);
						if (i_20_ > 0)
							graphics.fillRect((Class246_Sub28_Sub35.anInt7014 + (i_22_ - i_20_)), i_23_, i_20_, Class8.anInt101);
						if (i_21_ <= 0)
							break;
						graphics.fillRect(i_22_, -i_21_ + (i_23_ - -Class8.anInt101), Class246_Sub28_Sub35.anInt7014, i_21_);
					} catch (Exception exception) {
						/* empty */
					}
					break;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "rn.B(" + i + ')');
			}
		} while (false);
	}

	final void method2134(boolean bool) {
		try {
			anInt6874 = -anInt6869 + anInt6872;
			if (bool == false)
				anInt6864++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rn.F(" + bool + ')');
		}
	}

	public static void method2835(int i) {
		try {
			aClass166_6865 = null;
			aClipboard6876 = null;
			if (i == -1)
				aClass165_6873 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "rn.D(" + i + ')');
		}
	}

	static {
		new Class67("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do cl\u00e3 agora ");
	}
}
