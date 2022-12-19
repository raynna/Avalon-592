
/* Class246_Sub28_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Calendar;
import java.util.TimeZone;

final class Class246_Sub28_Sub22 extends Class246_Sub28 {
	static int anInt6624;
	private int anInt6625;
	private int anInt6626 = 1;
	static int anInt6627;
	static int anInt6628;
	static Rectangle[] aRectangleArray6629 = new Rectangle[100];
	private int anInt6630 = 204;
	static int anInt6631;
	static OutgoingPacket aClass201_6632;
	static Image anImage6633;
	static Calendar aCalendar6634;

	static final void method2724(boolean bool) {
		try {
			anImage6633 = null;
			Class214.aFont2992 = null;
			if (bool == false)
				anInt6631++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mr.A(" + bool + ')');
		}
	}

	static final void method2725(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, boolean bool_4_) {
		Class126.anInt1781 = i;
		Class246_Sub1.anInt3744 = 1 << Class126.anInt1781;
		Class40_Sub7.anInt5174 = Class246_Sub1.anInt3744 >> 1;
		Class59_Sub2_Sub2.anInt6010 = (int) Math.sqrt((double) ((Class40_Sub7.anInt5174 * Class40_Sub7.anInt5174) + (Class40_Sub7.anInt5174 * Class40_Sub7.anInt5174)));
		Class83.anInt1082 = Class246_Sub1.anInt3744 >> 2;
		Class203.anInt2875 = Class246_Sub1.anInt3744;
		Class240.anInt3377 = i_1_;
		Class_t_Sub1.f_sc = i_2_;
		Class125.anInt1777 = i_3_;
		Class115.aClass147ArrayArrayArray1605 = new Class147[i_0_][Class240.anInt3377][Class_t_Sub1.f_sc];
		Class246_Sub28_Sub3.aClass210Array5899 = new Class210[i_0_];
		if (bool) {
			Class128_Sub2.anIntArrayArray5565 = new int[Class240.anInt3377][Class_t_Sub1.f_sc];
			Class187.aByteArrayArray2649 = new byte[Class240.anInt3377][Class_t_Sub1.f_sc];
			Class189.aByteArrayArray2669 = new byte[Class240.anInt3377][Class_t_Sub1.f_sc];
			Class1.aClass147ArrayArrayArray4 = new Class147[1][Class240.anInt3377][Class_t_Sub1.f_sc];
			Class154.aClass210Array2215 = new Class210[1];
		} else {
			Class128_Sub2.anIntArrayArray5565 = null;
			Class187.aByteArrayArray2649 = null;
			Class189.aByteArrayArray2669 = null;
			Class1.aClass147ArrayArrayArray4 = null;
			Class154.aClass210Array2215 = null;
		}
		if (bool_4_) {
			Class255.aLongArrayArrayArray3648 = new long[i_0_][i_1_][i_2_];
			Class57.aClass174Array811 = new Class174[65535];
			Class102_Sub1.aBoolArray4449 = new boolean[65535];
			Class_c.anInt1195 = 0;
		} else {
			Class255.aLongArrayArrayArray3648 = null;
			Class57.aClass174Array811 = null;
			Class102_Sub1.aBoolArray4449 = null;
			Class_c.anInt1195 = 0;
		}
		Class47.method317(false);
		Class246_Sub28_Sub5.aClass121Array5996 = new Class121[1000];
		Class59_Sub2_Sub2.anInt6015 = 0;
		Class236.aClass121Array3306 = new Class121[1000];
		Class109_Sub1.anInt3755 = 0;
		Class88.anIntArrayArrayArray1150 = new int[i_0_][Class240.anInt3377 + 1][Class_t_Sub1.f_sc + 1];
		Class246_Sub28_Sub36.aClass59_Sub3Array7018 = new Class59_Sub3[5000];
		Class_a.anInt1181 = 0;
		Class187_Sub1.aBoolArrayArray4866 = (new boolean[Class125.anInt1777 + Class125.anInt1777 + 1][Class125.anInt1777 + Class125.anInt1777 + 1]);
		Class251.aBoolArrayArray3556 = (new boolean[Class125.anInt1777 + Class125.anInt1777 + 2][Class125.anInt1777 + Class125.anInt1777 + 2]);
		Class245.aClass106_3462 = null;
	}

	public Class246_Sub28_Sub22() {
		super(0, true);
		anInt6625 = 1;
	}

	public static void method2726(int i) {
		try {
			anImage6633 = null;
			aClass201_6632 = null;
			aCalendar6634 = null;
			if (i == 1)
				aRectangleArray6629 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mr.B(" + i + ')');
		}
	}

	final int[] method2135(int i, int i_5_) {
		try {
			anInt6624++;
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_5_);
			int i_6_ = -107 / ((i - 67) / 50);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int i_7_ = 0;
				for (/**/; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
					int i_8_ = Class187.anIntArray2654[i_7_];
					int i_9_ = Class246_Sub1_Sub11.anIntArray6245[i_5_];
					int i_10_ = i_8_ * anInt6626 >> 12;
					int i_11_ = anInt6625 * i_9_ >> 12;
					int i_12_ = anInt6626 * (i_8_ % (4096 / anInt6626));
					int i_13_ = i_9_ % (4096 / anInt6625) * anInt6625;
					if (anInt6630 > i_13_) {
						for (i_10_ -= i_11_; (i_10_ ^ 0xffffffff) > -1; i_10_ += 4) {
							/* empty */
						}
						for (/**/; i_10_ > 3; i_10_ -= 4) {
							/* empty */
						}
						if ((i_10_ ^ 0xffffffff) != -2) {
							is[i_7_] = 0;
							continue;
						}
						if ((anInt6630 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
							is[i_7_] = 0;
							continue;
						}
					}
					if (i_12_ < anInt6630) {
						for (i_10_ -= i_11_; i_10_ < 0; i_10_ += 4) {
							/* empty */
						}
						for (/**/; (i_10_ ^ 0xffffffff) < -4; i_10_ -= 4) {
							/* empty */
						}
						if ((i_10_ ^ 0xffffffff) < -1) {
							is[i_7_] = 0;
							continue;
						}
					}
					is[i_7_] = 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mr.E(" + i + ',' + i_5_ + ')');
		}
	}

	final void method2143(int i, int i_14_, BufferStream stream) {
		while_97_: do {
			try {
				anInt6628++;
				if (i == 4) {
					int i_15_ = i_14_;
					while_96_: do {
						do {
							if (i_15_ != 0) {
								if (i_15_ == 1)
									break;
								if ((i_15_ ^ 0xffffffff) != -3)
									break while_97_;
								if (!client.f_ob)
									break while_96_;
							}
							anInt6626 = stream.readUnsignedByte(255);
							return;
						} while (false);
						anInt6625 = stream.readUnsignedByte(255);
						return;
					} while (false);
					anInt6630 = stream.readUnsignedShort((byte) 117);
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("mr.G(" + i + ',' + i_14_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
		} while (false);
	}

	static {
		for (int i = 0; i < 100; i++)
			aRectangleArray6629[i] = new Rectangle();
		aClass201_6632 = new OutgoingPacket(51, 4);
		new Class67("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		aCalendar6634 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}
}
