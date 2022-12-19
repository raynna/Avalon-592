
/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.net.Socket;
import java.util.GregorianCalendar;

public final class client extends Class_o {
    public static int zoomDelta = -1;
	public static int zoomValue = 256;
    static int anInt7243;
	static int anInt7244;
	static int anInt7245;
	static int anInt7246;
	static int anInt7247;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	static int f_eb;
	static Class205 f_fb = new Class205("WTRC", 1);
	static int f_gb;
	static int f_hb;
	static int f_ib;
	static int f_jb;
	static int f_kb;
	static int f_lb;
	static Class169 f_mb = new Class169("", 11);
	static int f_nb;

	static int gameZoom = 600;
	static int gamePos = 3;
	public static boolean f_ob;

	public static void handleGameZoomScroll(int moved) {
		if (moved > 0) {
			if (gameZoom == 1500) {
				return;
			}
			gameZoom = gameZoom + 50;
		} else {
			if (gameZoom == 100) {
				return;
			}
			gameZoom = gameZoom - 50;
		}
	}

	private final void method2964(int i) {
		do {
			try {
				f_bb++;
				if (i == 3000) {
					if (((Class242) Class140.aClass242_2036).anInt3434 > Class173.anInt2444) {
						Class220.anInt3058 = (50 * (((Class242) Class140.aClass242_2036).anInt3434) - 50) * 5;
						if ((Class230.anInt3165 ^ 0xffffffff) != (Class172.anInt2433 ^ 0xffffffff))
							Class230.anInt3165 = Class172.anInt2433;
						else
							Class230.anInt3165 = Class246_Sub28_Sub7.anInt6047;
						if (Class220.anInt3058 > 3000)
							Class220.anInt3058 = 3000;
						if (((Class242) Class140.aClass242_2036).anInt3434 >= 2 && (((Class242) Class140.aClass242_2036).anInt3436 ^ 0xffffffff) == -7) {
							this.method2937(126, "js5connect_outofdate");
							Class225.anInt3103 = 1000;
							break;
						}
						if ((((Class242) Class140.aClass242_2036).anInt3434 ^ 0xffffffff) <= -5 && (((Class242) Class140.aClass242_2036).anInt3436 ^ 0xffffffff) == 0) {
							this.method2937(127, "js5crc");
							Class225.anInt3103 = 1000;
							break;
						}
						if ((((Class242) Class140.aClass242_2036).anInt3434 ^ 0xffffffff) <= -5 && (Class225.anInt3103 == 0 || (Class225.anInt3103 ^ 0xffffffff) == -6)) {
							if ((((Class242) Class140.aClass242_2036).anInt3436 == 7) || ((((Class242) Class140.aClass242_2036).anInt3436) ^ 0xffffffff) == -10)
								this.method2937(i - 2874, "js5connect_full");
							else if (((((Class242) Class140.aClass242_2036).anInt3436) ^ 0xffffffff) >= -1)
								this.method2937(126, "js5io");
							else
								this.method2937(i - 2873, "js5connect");
							Class225.anInt3103 = 1000;
							break;
						}
					}
					Class173.anInt2444 = ((Class242) Class140.aClass242_2036).anInt3434;
					if ((Class220.anInt3058 ^ 0xffffffff) < -1)
						Class220.anInt3058--;
					else {
						try {
							if (Class44.anInt642 == 0) {
								Class14.aClass182_218 = (Class108.aClass52_1535.method364(0, Class174.aString2449, Class230.anInt3165));
								Class44.anInt642++;
							}
							if ((Class44.anInt642 ^ 0xffffffff) == -2) {
								if ((Class14.aClass182_218.anInt2539 ^ 0xffffffff) == -3) {
									method2974(-70, 1000);
									break;
								}
								if (Class14.aClass182_218.anInt2539 == 1)
									Class44.anInt642++;
							}
							if ((Class44.anInt642 ^ 0xffffffff) == -3) {
								Class130.aClass6_1817 = new Class6((Socket) (Class14.aClass182_218.anObject2535), Class108.aClass52_1535);
								BufferStream stream = new BufferStream(5);
								stream.writeByte(i ^ 0xb47, ((Class48) (Class246_Sub1_Sub10.aClass48_6213)).anInt689);
								stream.writeInt(592, (byte) 84);
								Class130.aClass6_1817.method76(5, 0, ((BufferStream) stream).buffer, i - 2873);
								Class44.anInt642++;
								Class177.aLong2495 = Class151.time(-109);
							}
							if (Class44.anInt642 == 3) {
								if ((Class225.anInt3103 ^ 0xffffffff) != -1 && (Class225.anInt3103 ^ 0xffffffff) != -6 && Class130.aClass6_1817.method67(i - 2997) <= 0) {
									if ((-Class177.aLong2495 + Class151.time(-119)) > 30000L) {
										method2974(-59, 1001);
										break;
									}
								} else {
									int i_0_ = Class130.aClass6_1817.method73(i - 2894);
									if ((i_0_ ^ 0xffffffff) != -1) {
										method2974(-121, i_0_);
										break;
									}
									Class44.anInt642++;
								}
							}
							if (Class44.anInt642 != 4)
								break;
							boolean bool = ((Class225.anInt3103 ^ 0xffffffff) == -6 || (Class225.anInt3103 ^ 0xffffffff) == -11 || Class225.anInt3103 == 28);
							Class140.aClass242_2036.method1550(i ^ 0xbb8, (Class130.aClass6_1817), !bool);
							Class14.aClass182_218 = null;
							Class44.anInt642 = 0;
							Class130.aClass6_1817 = null;
						} catch (java.io.IOException ioexception) {
							method2974(-106, 1002);
						}
						break;
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.CA(" + i + ')');
			}
		} while (false);
	}

	final void method2952(int i) {
		do {
			try {
				f_gb++;
				if (Class246_Sub28_Sub10.aBool6159)
					Class173.method1136(-22125);
				if (Class246_Sub15.aClass260_4445 != null)
					Class246_Sub15.aClass260_4445.method1708(true);
				if (i >= 81) {
					if (Class38_Sub1.aFrame5114 != null) {
						Class256.method1662(Class108.aClass52_1535, (byte) -62, Class38_Sub1.aFrame5114);
						Class38_Sub1.aFrame5114 = null;
					}
					if (Class65.aClass6_864 != null) {
						Class65.aClass6_864.method72(false);
						Class65.aClass6_864 = null;
					}
					if (Player.f_rd != null)
						Player.f_rd.method494(Class147.aCanvas2155, 0);
					Player.f_rd = null;
					Class59_Sub3_Sub2.method2486(527);
					Class140.aClass242_2036.method1563(228742352);
					Class106_Sub2.aClass241_5339.method1540(-1);
					if (Class246_Sub28_Sub33.aClass243_6959 == null)
						break;
					Class246_Sub28_Sub33.aClass243_6959.method1564(-21509);
					Class246_Sub28_Sub33.aClass243_6959 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.M(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2965(int i) {
		do {
			try {
				anInt7244++;
				if ((Class225.anInt3103 ^ 0xffffffff) != -1001) {
					long l = (Class246_Sub1_Sub10.method2603(-124) / 1000000L + -Class246_Sub1_Sub10.f_bb);
					Class246_Sub1_Sub10.f_bb = Class246_Sub1_Sub10.method2603(-118) / 1000000L;
					boolean bool = Class100_Sub1.method2175((byte) 124);
					int i_1_ = -60 / ((-53 - i) / 63);
					if (bool && Class_w.aBool6383 && Class246_Sub40.aClass123_5522 != null)
						Class246_Sub40.aClass123_5522.method830(2000);
					if ((Class225.anInt3103 ^ 0xffffffff) == -31 || Class225.anInt3103 == 10) {
						if (Class130_Sub8.aLong5616 == 0L || ((Class151.time(-68) ^ 0xffffffffffffffffL) >= (Class130_Sub8.aLong5616 ^ 0xffffffffffffffffL))) {
							if (!Class246_Sub15.aClass260_4445.method1699() && Class246_Sub1_Sub6.aBool5963)
								Class191.method1259(-71);
						} else
							Class100.method629(Class258.method1673((byte) -123), ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt604, ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt577, false, false);
					}
					if (Class38_Sub1.aFrame5114 == null) {
						java.awt.Container container;
						if (Class122.aFrame1688 != null)
							container = Class122.aFrame1688;
						else
							container = Class108.aClass52_1535.anApplet733;
						int i_2_ = container.getSize().width;
						int i_3_ = container.getSize().height;
						if (container == Class122.aFrame1688) {
							Insets insets = Class122.aFrame1688.getInsets();
							i_3_ -= insets.bottom + insets.top;
							i_2_ -= insets.left - -insets.right;
						}
						if (i_2_ != Class246_Sub28_Sub35.anInt7014 || ((Class8.anInt101 ^ 0xffffffff) != (i_3_ ^ 0xffffffff))) {
							if (Class246_Sub15.aClass260_4445 != null && !Class246_Sub15.aClass260_4445.method1686()) {
								Class8.anInt101 = i_3_;
								Class246_Sub28_Sub35.anInt7014 = i_2_;
							} else
								Class21.method198(false);
							Class130_Sub8.aLong5616 = 500L + Class151.time(-102);
						}
					}
					if (Class38_Sub1.aFrame5114 != null && !Class142.aBool2049 && ((Class225.anInt3103 ^ 0xffffffff) == -31 || (Class225.anInt3103 ^ 0xffffffff) == -11))
						Class100.method629((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt600), -1, -1, false, false);
					boolean bool_4_ = false;
					if (Class246_Sub28_Sub8.aBool6060) {
						Class246_Sub28_Sub8.aBool6060 = false;
						bool_4_ = true;
					}
					if (bool_4_)
						Class246_Sub28_Sub30.method2834((byte) -125);
					if ((Class246_Sub15.aClass260_4445 != null && Class246_Sub15.aClass260_4445.method1699()) || Class258.method1673((byte) -123) != 1)
						Class205.method1341(-11712);
					if (Class225.anInt3103 != 0) {
						if (Class225.anInt3103 != 5) {
							if ((Class225.anInt3103 ^ 0xffffffff) != -11) {
								if ((Class225.anInt3103 ^ 0xffffffff) == -26 || Class225.anInt3103 == 28) {
									if (Class27.anInt379 == 1) {
										if (Class246_Sub28_Sub8.anInt6072 > Class246_Sub30_Sub1.anInt5756)
											Class246_Sub30_Sub1.anInt5756 = (Class246_Sub28_Sub8.anInt6072);
										int i_5_ = ((-Class246_Sub28_Sub8.anInt6072 + (Class246_Sub30_Sub1.anInt5756)) * 50 / (Class246_Sub30_Sub1.anInt5756));
										Class_w.method2650(true, ((Class250.aClass67_3531.method436(true, Class_j.anInt1485)) + "<br>(" + i_5_ + "%)"), Class109.aClass116_1554, 13);
									} else if (Class27.anInt379 == 2) {
										if ((Class255.anInt3665 ^ 0xffffffff) > (Class148.anInt2184 ^ 0xffffffff))
											Class255.anInt3665 = Class148.anInt2184;
										int i_6_ = ((50 * (Class255.anInt3665 - Class148.anInt2184) / Class255.anInt3665) + 50);
										Class_w.method2650(true, ((Class250.aClass67_3531.method436(true, Class_j.anInt1485)) + "<br>(" + i_6_ + "%)"), Class109.aClass116_1554, 13);
									} else
										Class_w.method2650(true, (Class250.aClass67_3531.method436(true, Class_j.anInt1485)), Class109.aClass116_1554, 13);
								} else if (Class225.anInt3103 == 30)
									Class20.method192(l, -38);
								else if ((Class225.anInt3103 ^ 0xffffffff) == -41)
									Class_w.method2650(true, ((Class255.aClass67_3647.method436(true, Class_j.anInt1485)) + "<br>" + (Class109_Sub4.aClass67_4568.method436(true, Class_j.anInt1485))), Class109.aClass116_1554, 13);
							} else
								Class159.method1057(false);
						} else
							Class246_Sub1_Sub8_Sub1.method2925(Class59_Sub2.aColorArray4539[Class246_Sub1_Sub18.anInt6859].getRGB(), (byte) 91, bool_4_ | Class246_Sub15.aClass260_4445.method1699(), Class59_Sub3_Sub2.f_cb[Class246_Sub1_Sub18.anInt6859].getRGB(), Class_t_Sub1.aColorArray4641[Class246_Sub1_Sub18.anInt6859].getRGB(), Class79_Sub1.aClass116_5162, Class246_Sub15.aClass260_4445);
					} else
						Class246_Sub19.method2067((Class_t_Sub1.aColorArray4641[Class246_Sub1_Sub18.anInt6859]), 115, (Class59_Sub2.aColorArray4539[Class246_Sub1_Sub18.anInt6859]), (Class59_Sub3_Sub2.f_cb[Class246_Sub1_Sub18.anInt6859]), Class134.loadingPercentage, bool_4_, Class246_Sub1_Sub4.aString5748);
					if ((Class210_Sub2.anInt5022 ^ 0xffffffff) == -4) {
						for (int i_7_ = 0; i_7_ < Class124.anInt1738; i_7_++) {
							Rectangle rectangle = (Class246_Sub28_Sub22.aRectangleArray6629[i_7_]);
							if (!Class37.aBoolArray546[i_7_]) {
								if (Class246_Sub28_Sub24.aBoolArray6673[i_7_])
									Class246_Sub15.aClass260_4445.method1734(rectangle.x, rectangle.width, rectangle.y, (byte) 58, -1996554240, rectangle.height);
							} else
								Class246_Sub15.aClass260_4445.method1734(rectangle.x, rectangle.width, rectangle.y, (byte) 58, -1996553985, rectangle.height);
						}
					}
					if (Class241.method1547(-64))
						Class245.method1572(Class246_Sub15.aClass260_4445, 8);
					if ((Class225.anInt3103 != 30 && (Class225.anInt3103 ^ 0xffffffff) != -11) || (Class210_Sub2.anInt5022 ^ 0xffffffff) != -1 || Class258.method1673((byte) -123) != 1 || bool_4_ || !Signlink.aString731.equals("1.1")) {
						if ((Class225.anInt3103 ^ 0xffffffff) != -1) {
							Class246_Sub15.aClass260_4445.method1688();
							for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class124.anInt1738 ^ 0xffffffff)); i_8_++)
								Class246_Sub28_Sub24.aBoolArray6673[i_8_] = false;
						}
					} else {
						int i_9_ = 0;
						for (int i_10_ = 0; i_10_ < Class124.anInt1738; i_10_++) {
							if (Class246_Sub28_Sub24.aBoolArray6673[i_10_]) {
								Class246_Sub28_Sub24.aBoolArray6673[i_10_] = false;
								Class203.aRectangleArray2878[i_9_++] = (Class246_Sub28_Sub22.aRectangleArray6629[i_10_]);
							}
						}
						Class246_Sub15.aClass260_4445.method1731(Class203.aRectangleArray2878, i_9_);
					}
					if (((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt584) ^ 0xffffffff) != -1) {
						if ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt584 ^ 0xffffffff) != -2) {
							if (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt584 == 2)
								Class247.method1580(5L, -5184);
							else if (((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt584) ^ 0xffffffff) == -4)
								Class247.method1580(2L, -5184);
						} else
							Class247.method1580(10L, -5184);
					} else
						Class247.method1580(15L, -5184);
					if (Class4.aBool52)
						Class104.method669(-2);
					if (!(((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591) || Class225.anInt3103 != 10 || Class183.anInt2549 == -1)
						break;
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591 = false;
					Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -117);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.MA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2966(Class235 class235) {
		if (Class_v.aBool1452) {
			if (((Class246_Sub27) method2971(class235)).anInt4893 != 0)
				return false;
			if (((Class235) class235).f_vc == 0)
				return false;
		}
		return ((Class235) class235).f_ic;
	}

	final void method2938(byte i) {
		try {
			anInt7247++;
			try {
				if (i == 57)
					method2970(i - 57);
			} catch (OutOfMemoryError outofmemoryerror) {
				if (outofmemoryerror.getMessage() != null && outofmemoryerror.getMessage().startsWith("native")) {
					Class129.method883(0, (byte) 51);
					Class194_Sub1.method1883(outofmemoryerror, (outofmemoryerror.getMessage() + " (Recovered) " + method2953((byte) -76)), -80);
				} else
					throw outofmemoryerror;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.P(" + i + ')');
		}
	}

	static final void method2967(int i) {
		int i_11_ = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		int i_12_ = Class38.aBool563 ? i_11_ : i_11_ + Class5.anInt55;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			Actor class_r;
			if (i_13_ < i_11_)
				class_r = Class143.aClass_r_Sub1Array2069[is[i_13_]];
			else
				class_r = (Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_13_ - i_11_]]);
			if (((Class59_Sub3) class_r).aByte5053 == i) {
				((Actor) class_r).anInt6463 = 0;
				if (((Actor) class_r).anInt6431 < 0)
					((Actor) class_r).aBool6441 = false;
				else {
					int i_14_ = class_r.method2670((byte) 127);
					if ((i_14_ & 0x1) == 0) {
						if ((((Class59_Sub3) class_r).anInt5060 & 0x7f) != 0 || ((((Class59_Sub3) class_r).anInt5059 & 0x7f) != 0)) {
							((Actor) class_r).aBool6441 = false;
							continue;
						}
					} else if (((((Class59_Sub3) class_r).anInt5060 & 0x7f) != 64) || ((((Class59_Sub3) class_r).anInt5059 & 0x7f) != 64)) {
						((Actor) class_r).aBool6441 = false;
						continue;
					}
					if (i_14_ == 1) {
						int i_15_ = ((Class59_Sub3) class_r).anInt5060 >> 7;
						int i_16_ = ((Class59_Sub3) class_r).anInt5059 >> 7;
						if (((Actor) class_r).anInt6431 != Class24.anIntArrayArray348[i_15_][i_16_]) {
							((Actor) class_r).aBool6441 = true;
							continue;
						}
						if (Class246_Sub6.anIntArrayArray3944[i_15_][i_16_] > 1) {
							Class246_Sub6.anIntArrayArray3944[i_15_][i_16_]--;
							((Actor) class_r).aBool6441 = true;
							continue;
						}
					} else {
						int i_17_ = (i_14_ - 1) * 64 + 60;
						int i_18_ = ((Class59_Sub3) class_r).anInt5060 - i_17_ >> 7;
						int i_19_ = ((Class59_Sub3) class_r).anInt5059 - i_17_ >> 7;
						int i_20_ = ((Class59_Sub3) class_r).anInt5060 + i_17_ >> 7;
						int i_21_ = ((Class59_Sub3) class_r).anInt5059 + i_17_ >> 7;
						if (!Class159.method1055(i_21_, i_19_, i_20_, ((Actor) class_r).anInt6431, -2, i_18_)) {
							for (int i_22_ = i_18_; i_22_ <= i_20_; i_22_++) {
								for (int i_23_ = i_19_; i_23_ <= i_21_; i_23_++) {
									if (((Actor) class_r).anInt6431 == (Class24.anIntArrayArray348[i_22_][i_23_]))
										Class246_Sub6.anIntArrayArray3944[i_22_][i_23_]--;
								}
							}
							((Actor) class_r).aBool6441 = true;
							continue;
						}
					}
					if (class_r instanceof Player && ((Actor) class_r).f_pc != null && (Class246_Sub1_Sub4.anInt5752 >= (((Class246_Sub16) ((Actor) class_r).f_pc).anInt4523)) && (Class246_Sub1_Sub4.anInt5752 < (((Class246_Sub16) ((Actor) class_r).f_pc).anInt4535)))
						((Player) (Player) class_r).f_ld = false;
					((Actor) class_r).aBool6441 = false;
					((Class59_Sub3) class_r).anInt5052 = Class6.getAverageHeight(((Class59_Sub3) class_r).anInt5060, 107, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059);
					Class176.method1156(class_r, true);
				}
			}
		}
	}

	final String method2953(byte i) {
		try {
			f_ib++;
			String string = null;
			try {
				string = ("[1)" + Class39_Sub1.anInt4670 + "," + Class47.anInt686 + "," + Class38_Sub1_Sub1.anInt6770 + "," + Class152.anInt2205 + "|");
				if (Class_a.aClass_r_Sub1_1180 != null)
					string += ("2)" + Class246_Sub28_Sub24.anInt6681 + "," + (Class39_Sub1.anInt4670 + (((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0])) + "," + (((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0] + Class47.anInt686) + "|");
				string += ("3)" + BufferStream.anInt5656 + "|4)" + (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt588) + "|5)" + Class258.method1673((byte) -123) + "|6)" + Class246_Sub41_Sub1.anInt6171 + "," + Class162.anInt2300 + "|");
				string += "7)" + Class246_Sub28_Sub27.aClass39_Sub1_6759.method275(29083, BufferStream.anInt5656) + "|";
				string += ("8)" + Class246_Sub28_Sub27.aClass39_Sub1_6759.method271(BufferStream.anInt5656, (byte) -28) + "|");
				string += "9)" + ((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool574 + "|";
				string += "10)" + (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609) + "|";
				string += "11)" + (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool596) + "|";
				string += "12)" + Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 108) + "|";
				string += "13)" + Class40_Sub2.anInt4047 + "|";
				if (i != -76)
					f_fb = null;
				try {
					string += "|15)" + jagmisc.getTotalPhysicalMemory();
				} catch (Throwable throwable) {
					/* empty */
				}
				string += "]";
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.U(" + i + ')');
		}
	}

	private final void method2968(int i) {
		do {
			try {
				f_lb++;
				Class246_Sub17.anInt4663++;
				Class64_Sub1.method2219(-1, (byte) -82, null, -1);
				Class19.method190(i ^ 0x1248, null, -1, -1);
				Class59_Sub2.method2022(i ^ ~0x12a4);
				Class246_Sub34.anInt5146++;
				for (int i_24_ = 0; i_24_ < 32768; i_24_++) {
					Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[i_24_];
					if (class_r_sub2 != null) {
						byte i_25_ = ((Class253) (((Npc) class_r_sub2).aClass253_7184)).aByte3609;
						if ((0x1 & i_25_) != 0) {
							int i_26_ = class_r_sub2.method2670((byte) 127);
							if ((i_25_ & 0x2 ^ 0xffffffff) != -1 && (((Actor) class_r_sub2).f_oc ^ 0xffffffff) == -1 && Math.random() * 1000.0 < 10.0) {
								int i_27_ = (int) Math.round(Math.random() * 10.0 - 5.0);
								int i_28_ = (int) Math.round(Math.random() * 10.0 - 5.0);
								if (i_27_ != 0 || (i_28_ ^ 0xffffffff) != -1) {
									int i_29_ = (((Actor) class_r_sub2).f_mc[0] - -i_27_);
									if ((i_29_ ^ 0xffffffff) <= -1) {
										if ((-1 + (-i_26_ + (Class38_Sub1_Sub1.anInt6770)) ^ 0xffffffff) > (i_29_ ^ 0xffffffff))
											i_29_ = -i_26_ + (Class38_Sub1_Sub1.anInt6770) - 1;
									} else
										i_29_ = 0;
									int i_30_ = (((Actor) class_r_sub2).f_nc[0] + i_28_);
									if (i_30_ >= 0) {
										if (i_30_ > -1 + -i_26_ + Class152.anInt2205)
											i_30_ = -1 + (-i_26_ + Class152.anInt2205);
									} else
										i_30_ = 0;
									int i_31_ = (CS2Script.method2416((byte) -69, (Class95.aClass199Array1235[(((Class59_Sub3) class_r_sub2).aByte5053)]), ((Actor) class_r_sub2).f_mc[0], i_29_, i_26_, i_30_, i_26_, 0, Class246_Sub4.anIntArray3865, 0, true, Class220.anIntArray3049, ((Actor) class_r_sub2).f_nc[0], i_26_, -1));
									if ((i_31_ ^ 0xffffffff) < -1) {
										if (i_31_ > 9)
											i_31_ = 9;
										for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
											((Actor) class_r_sub2).f_mc[i_32_] = (Class220.anIntArray3049[-1 + (i_31_ - i_32_)]);
											((Actor) class_r_sub2).f_nc[i_32_] = (Class246_Sub4.anIntArray3865[i_31_ - (i_32_ + 1)]);
											((Actor) class_r_sub2).f_rc[i_32_] = (byte) 1;
										}
										((Actor) class_r_sub2).f_oc = i_31_;
									}
								}
							}
							Class221.method1432(-47, true, class_r_sub2);
							int i_33_ = Class246_Sub41_Sub1.method2585((byte) -17, class_r_sub2);
							Class128_Sub2.method2334(class_r_sub2, (RuntimeException_Sub2.anInt7150), Class_e.anInt1218, i_33_, i + 4536);
							Class207.method1360(class_r_sub2, i + 4532);
						}
					}
				}
				if (i != -4645)
					method2980();
				if (Class246_Sub1_Sub14.anInt6590 == 0 && (Class197.anInt2815 ^ 0xffffffff) == -1) {
					if (Class130_Sub3.anInt4417 != 2)
						Class246_Sub30.method2156(true);
					else
						Class179.method1173(488012003);
					if (Class246_Sub16.aInt92 >> 7 < 14 || (Class38_Sub1_Sub1.anInt6770 - 14 <= Class246_Sub16.aInt92 >> 7) || (Class259_Sub1.anInt4509 >> 7 ^ 0xffffffff) > -15 || (Class259_Sub1.anInt4509 >> 7 >= -14 + Class152.anInt2205))
						Stream_Sub1.method2475(-12319);
				}
				for (;;) {
					Class246_Sub29 class246_sub29 = ((Class246_Sub29) Class128.aClass166_1796.method1100(i ^ ~0x1ddb));
					if (class246_sub29 == null)
						break;
					Class235 class235 = ((Class246_Sub29) class246_sub29).aClass235_4974;
					if ((((Class235) class235).f_pd ^ 0xffffffff) <= -1) {
						Class235 class235_34_ = Class220.method1423(0, (((Class235) class235).anInt3293));
						if (class235_34_ == null || ((Class235) class235_34_).f_ad == null || (((Class235) class235_34_).f_ad.length <= ((Class235) class235).f_pd) || (((Class235) class235_34_).f_ad[((Class235) class235).f_pd]) != class235)
							continue;
					}
					Class146.method988(class246_sub29);
				}
				for (;;) {
					Class246_Sub29 class246_sub29 = (Class246_Sub29) Class246_Sub28_Sub2.aClass166_5809.method1100(4095);
					if (class246_sub29 == null)
						break;
					Class235 class235 = ((Class246_Sub29) class246_sub29).aClass235_4974;
					if (((Class235) class235).f_pd >= 0) {
						Class235 class235_35_ = Class220.method1423(0, (((Class235) class235).anInt3293));
						if (class235_35_ == null || ((Class235) class235_35_).f_ad == null || ((((Class235) class235_35_).f_ad.length ^ 0xffffffff) >= (((Class235) class235).f_pd ^ 0xffffffff)) || class235 != (((Class235) class235_35_).f_ad[((Class235) class235).f_pd]))
							continue;
					}
					Class146.method988(class246_sub29);
				}
				for (;;) {
					Class246_Sub29 class246_sub29 = (Class246_Sub29) Class246_Sub28_Sub26.aClass166_6708.method1100(4095);
					if (class246_sub29 == null)
						break;
					Class235 class235 = ((Class246_Sub29) class246_sub29).aClass235_4974;
					if ((((Class235) class235).f_pd ^ 0xffffffff) <= -1) {
						Class235 class235_36_ = Class220.method1423(0, (((Class235) class235).anInt3293));
						if (class235_36_ == null || ((Class235) class235_36_).f_ad == null || ((((Class235) class235).f_pd ^ 0xffffffff) <= (((Class235) class235_36_).f_ad.length ^ 0xffffffff)) || class235 != (((Class235) class235_36_).f_ad[((Class235) class235).f_pd]))
							continue;
					}
					Class146.method988(class246_sub29);
				}
				if (Class150.aClass235_2196 != null)
					Class_a.method574(i + 4536);
				if (Class246_Sub1_Sub4.anInt5752 % 1500 == 0)
					Class188.method1231((byte) 105);
				Class209.method1369(0);
				if (!Class246_Sub28_Sub10.aBool6159 || ((-60000L + Class151.time(-77) ^ 0xffffffffffffffffL) >= (PacketsDecoder.aLong273 ^ 0xffffffffffffffffL)))
					break;
				Class173.method1136(-22125);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.GA(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method2969(int i, byte i_37_) {
		try {
			f_jb++;
			if ((i ^ 0xffffffff) > -97)
				return 0;
			if (i < 128)
				return 2;
			int i_38_ = -100 / ((i_37_ - 26) / 63);
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.IA(" + i + ',' + i_37_ + ')');
		}
	}

	private final void method2970(int i) {
		try {
			f_eb++;
			if (Class225.anInt3103 != 1000) {
				Class246_Sub1_Sub4.anInt5752++;
				if ((Class246_Sub1_Sub4.anInt5752 % 1000 ^ 0xffffffff) == -2) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class129.anInt1809 = (gregoriancalendar.get(11) * 600 - (-(gregoriancalendar.get(12) * 10) + -(gregoriancalendar.get(13) / 6)));
					Class246_Sub34.aRandom5144.setSeed((long) Class129.anInt1809);
				}
				if ((Class246_Sub1_Sub4.anInt5752 % 50 ^ 0xffffffff) == -1) {
					Class257.anInt3686 = Class34.anInt454;
					Class246_Sub1_Sub5.anInt5847 = Class246_Sub28_Sub11.anInt6167;
					Class34.anInt454 = 0;
					Class246_Sub28_Sub11.anInt6167 = 0;
				}
				method2983((byte) -64);
				if (Class194_Sub1.aClass142_4140 != null)
					Class194_Sub1.aClass142_4140.method960(93);
				Class121.method821((byte) 76);
				Class216.aClass232_3009.method1486(28);
				Class238.aClass102_3360.method642(-126);
				if (Player.f_rd != null) {
					int i_39_ = Player.f_rd.method493((byte) 124);
					Class246_Sub41.anInt5531 = i_39_;
				}
				if (Class246_Sub15.aClass260_4445 != null)
					Class246_Sub15.aClass260_4445.method1687((int) Class151.time(i ^ ~0x6e));
				Class246_Sub19.method2068(true);
				Class246_Sub28_Sub14.anInt6308 = i;
				for (Class188 class188 = Class216.aClass232_3009.method1482(i ^ 0x68c1); (class188 != null && (Class246_Sub28_Sub14.anInt6308 ^ 0xffffffff) > -129); class188 = Class216.aClass232_3009.method1482(26817)) {
					if (class188.method1232(i + 69) != 1) {
						int i_40_ = class188.method1236(2);
						if (!Class246_Sub28_Sub34.method2872(true) || i_40_ != 96 && (i_40_ ^ 0xffffffff) != -168) {
							Class59_Sub2.aClass188Array4544[Class246_Sub28_Sub14.anInt6308] = class188;
							Class246_Sub28_Sub14.anInt6308++;
						} else if (Class241.method1547(-79))
							Class245.method1574(i ^ 0x23);
						else
							Class246_Sub28_Sub24.method2737(i - 86);
					}
				}
				for (Class246_Sub30 class246_sub30 = Class238.aClass102_3360.method638((byte) -80); class246_sub30 != null; class246_sub30 = Class238.aClass102_3360.method638((byte) -87)) {
					int i_41_ = class246_sub30.method2157((byte) 102);
					if (i_41_ != -1) {
						if (Class56.method389((byte) 126, i_41_))
							Class235.f_qb.method1101(false, class246_sub30);
					} else
						Class246_Sub28_Sub30.aClass166_6865.method1101(false, class246_sub30);
					if ((Class235.f_qb.method1112(0) ^ 0xffffffff) < -11)
						Class235.f_qb.method1100(4095);
				}
				if (Class241.method1547(-103))
					Class246_Sub28_Sub18.method2688((byte) 122);
				if ((Class225.anInt3103 ^ 0xffffffff) != -1) {
					if ((Class225.anInt3103 ^ 0xffffffff) == -6) {
						method2981(23396);
						Class187_Sub1.method2109((byte) 107);
					} else if ((Class225.anInt3103 ^ 0xffffffff) == -26 || (Class225.anInt3103 ^ 0xffffffff) == -29)
						Class246_Sub1_Sub13.method2695((byte) 125);
				} else {
					method2981(23396);
					Class187_Sub1.method2109((byte) 127);
				}
				if ((Class225.anInt3103 ^ 0xffffffff) != -11) {
					if (Class225.anInt3103 != 30) {
						if (Class225.anInt3103 == 40) {
							Class246_Sub28_Sub35.login(i + 117);
							if ((Class246_Sub31.anInt5034 ^ 0xffffffff) != 2 && ((Class246_Sub31.anInt5034 ^ 0xffffffff) != -3) && Class246_Sub31.anInt5034 != 15)
								Class135.method917(2700);
						}
					} else
						Class248.method1584(12362);
				} else {
					method2968(i ^ ~0x1224);
					Class217.method1409(true);
					Class154.method1017(i - 5);
					Class246_Sub28_Sub35.login(-50);
				}
				Class45.method307(Class246_Sub15.aClass260_4445, false);
				Class235.f_qb.method1100(4095);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.TA(" + i + ')');
		}
	}

	static final Class246_Sub27 method2971(Class235 class235) {
		Class246_Sub27 class246_sub27 = ((Class246_Sub27) Class113.aClass85_1595.method544((((long) (((Class235) class235).anInt3248) << 32) + (long) ((Class235) class235).f_pd), 124));
		if (class246_sub27 != null)
			return class246_sub27;
		return ((Class235) class235).aClass246_Sub27_3261;
	}

	public final void init() {
		try {
			f_cb++;
			if (this.method2935(69)) {
				Class58.anInt816 = Integer.parseInt(this.getParameter("worldid"));
				Class260_Sub2.aClass205_4297 = (Class173.method1142(Integer.parseInt(this.getParameter("modewhere")), true));
				if (!Class59_Sub1_Sub3.method2642(Class260_Sub2.aClass205_4297, (byte) -112) && Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
					Class260_Sub2.aClass205_4297 = Class208.aClass205_2930;
				Class259.aClass97_3707 = (Class157.method1038(0, Integer.parseInt(this.getParameter("modewhat"))));
				if (Class259.aClass97_3707 != Class37.aClass97_544 && Class259.aClass97_3707 != Class189.aClass97_2666 && (Class259.aClass97_3707 != SubIncomingPacket.aClass97_7088))
					Class259.aClass97_3707 = SubIncomingPacket.aClass97_7088;
				try {
					Class_j.anInt1485 = Integer.parseInt(this.getParameter("lang"));
				} catch (Exception exception) {
					Class_j.anInt1485 = 0;
				}
				String string = this.getParameter("objecttag");
				if (string == null || !string.equals("1"))
					Class88.aBool1151 = false;
				else
					Class88.aBool1151 = true;
				String string_42_ = this.getParameter("js");
				if (string_42_ != null && string_42_.equals("1"))
					Class106_Sub2.aBool5333 = true;
				else
					Class106_Sub2.aBool5333 = false;
				String string_43_ = this.getParameter("advert");
				if (string_43_ != null && string_43_.equals("1"))
					Class166.aBool2357 = true;
				else
					Class166.aBool2357 = false;
				String string_44_ = this.getParameter("game");
				if (string_44_ == null || !string_44_.equals("1"))
					Class59_Sub4_Sub3.aClass101_6943 = Class246_Sub28_Sub16.aClass101_6394;
				else
					Class59_Sub4_Sub3.aClass101_6943 = Class40_Sub6.aClass101_5092;
				try {
					Class109_Sub4.anInt4573 = Integer.parseInt(this.getParameter("affid"));
				} catch (Exception exception) {
					Class109_Sub4.anInt4573 = 0;
				}
				Class59_Sub2.aString4546 = this.getParameter("quiturl");
				Class246_Sub5.aString3891 = this.getParameter("settings");
				if (Class246_Sub5.aString3891 == null)
					Class246_Sub5.aString3891 = "";
				String string_45_ = this.getParameter("country");
				if (string_45_ != null) {
					try {
						Class122.anInt1680 = Integer.parseInt(string_45_);
					} catch (Exception exception) {
						Class122.anInt1680 = 0;
					}
				}
				Class246_Sub1_Sub18.anInt6859 = Integer.parseInt(this.getParameter("colourid"));
				if (Class246_Sub1_Sub18.anInt6859 < 0 || ((Class59_Sub3_Sub2.f_cb.length ^ 0xffffffff) >= (Class246_Sub1_Sub18.anInt6859 ^ 0xffffffff)))
					Class246_Sub1_Sub18.anInt6859 = 0;
				if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1)
					Class246_Sub23.aBool4817 = Class_t.aBool1431 = true;
				CS2Script.aclient5668 = this;
				if (Class246_Sub28_Sub16.aClass101_6394 == Class59_Sub4_Sub3.aClass101_6943) {
					Class196.anInt2757 = 765;
					Class83.anInt1090 = 503;
				} else if (Class40_Sub6.aClass101_5092 == Class59_Sub4_Sub3.aClass101_6943) {
					Class83.anInt1090 = 480;
					Class196.anInt2757 = 640;
				}
				this.method2947(592, Class259.aClass97_3707.method616(false) + 32, Class83.anInt1090, Class196.anInt2757, (byte) -107);
			}
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "client.init(" + ')');
		}
	}

	static final void method2972(Class235[] class235s, int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_) {
		for (int i_54_ = 0; i_54_ < class235s.length; i_54_++) {
			Class235 class235 = class235s[i_54_];
			if (class235 != null && ((Class235) class235).anInt3293 == i) {
				int i_55_ = ((Class235) class235).f_mc + i_50_;
				int i_56_ = ((Class235) class235).f_hd + i_51_;
				int i_57_;
				int i_58_;
				int i_59_;
				int i_60_;
				if (((Class235) class235).f_vc == 2) {
					i_57_ = i_46_;
					i_58_ = i_47_;
					i_59_ = i_48_;
					i_60_ = i_49_;
				} else {
					int i_61_ = i_55_ + ((Class235) class235).f_fc;
					int i_62_ = i_56_ + ((Class235) class235).f_sb;
					if (((Class235) class235).f_vc == 9) {
						i_61_++;
						i_62_++;
					}
					i_57_ = i_55_ > i_46_ ? i_55_ : i_46_;
					i_58_ = i_56_ > i_47_ ? i_56_ : i_47_;
					i_59_ = i_61_ < i_48_ ? i_61_ : i_48_;
					i_60_ = i_62_ < i_49_ ? i_62_ : i_49_;
				}
				if (((Class235) class235).f_vc != 0 && !((Class235) class235).aBool3222 && ((Class246_Sub27) method2971(class235)).anInt4893 == 0 && class235 != Class33.aClass235_445 && (((Class235) class235).anInt3280 != Class59_Sub1.anInt4514)) {
					if (i_57_ < i_59_ && i_58_ < i_60_)
						Class39.method272(class235, 2);
				} else if (!method2966(class235)) {
					if (class235 == Class150.aClass235_2196) {
						Class64_Sub1.aBool5240 = true;
						Class134.anInt1873 = i_55_;
						Class259_Sub3_Sub1.anInt6903 = i_56_;
					}
					if (((Class235) class235).f_bd || i_57_ < i_59_ && i_58_ < i_60_) {
						if (((Class235) class235).aBool3290 && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_ && i_53_ < i_60_) {
							for (Class246_Sub29 class246_sub29 = (Class246_Sub29) Class246_Sub28_Sub26.aClass166_6708.method1104(124); class246_sub29 != null; class246_sub29 = ((Class246_Sub29) Class246_Sub28_Sub26.aClass166_6708.method1108((byte) -112))) {
								if (((Class246_Sub29) class246_sub29).aBool4964) {
									class246_sub29.unlink((byte) -85);
									((Class235) (((Class246_Sub29) class246_sub29).aClass235_4974)).aBool3219 = false;
								}
							}
							if (Class246_Sub1_Sub17.anInt6734 == 0) {
								Class150.aClass235_2196 = null;
								Class33.aClass235_445 = null;
							}
							Class59_Sub3_Sub2.f_db = 0;
							Class246_Sub28_Sub34.aBool7008 = false;
							Class116.aBool1620 = false;
							if (!Class246_Sub28_Sub21.aBool6580)
								Class109_Sub1_Sub1.method2756(-19);
						}
						boolean bool;
						if ((Class238.aClass102_3360.method640((byte) 58) >= i_57_) && Class238.aClass102_3360.method636(3045) >= i_58_ && (Class238.aClass102_3360.method640((byte) 58) < i_59_) && Class238.aClass102_3360.method636(3045) < i_60_)
							bool = true;
						else
							bool = false;
						if (!Class187.aBool2653 && bool) {
							if (((Class235) class235).anInt3233 >= 0)
								Class83.anInt1089 = ((Class235) class235).anInt3233;
							else if (((Class235) class235).aBool3290)
								Class83.anInt1089 = -1;
						}
						if (!Class246_Sub28_Sub21.aBool6580 && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_ && i_53_ < i_60_)
							Class259_Sub2.method2147((byte) 118, class235, i_52_ - i_55_, i_53_ - i_56_);
						boolean bool_63_ = false;
						if (Class238.aClass102_3360.method641(2) && bool)
							bool_63_ = true;
						boolean bool_64_ = false;
						Class246_Sub30 class246_sub30 = (Class246_Sub30) Class235.f_qb.method1104(37);
						if (class246_sub30 != null && class246_sub30.method2157((byte) 102) == 0 && class246_sub30.method2160(65) >= i_57_ && class246_sub30.method2161((byte) -92) >= i_58_ && class246_sub30.method2160(44) < i_59_ && class246_sub30.method2161((byte) -81) < i_60_)
							bool_64_ = true;
						if (((Class235) class235).aByteArray3214 != null) {
							for (int i_65_ = 0; i_65_ < (((Class235) class235).aByteArray3214).length; i_65_++) {
								if (!Class216.aClass232_3009.method1488(-86, (((Class235) class235).aByteArray3214[i_65_]))) {
									if (((Class235) class235).anIntArray3202 != null)
										((Class235) class235).anIntArray3202[i_65_] = 0;
								} else if ((((Class235) class235).anIntArray3202) == null || (Class246_Sub1_Sub4.anInt5752 >= (((Class235) class235).anIntArray3202[i_65_]))) {
									byte i_66_ = (((Class235) class235).aByteArray3291[i_65_]);
									if (i_66_ == 0 || (((i_66_ & 0x8) == 0 || (!Class216.aClass232_3009.method1488(-94, 86) && !Class216.aClass232_3009.method1488(-128, 82) && !Class216.aClass232_3009.method1488(-90, 81))) && ((i_66_ & 0x2) == 0 || Class216.aClass232_3009.method1488(-73, 86)) && ((i_66_ & 0x1) == 0 || Class216.aClass232_3009.method1488(-85, 82)) && ((i_66_ & 0x4) == 0 || (Class216.aClass232_3009.method1488(-110, 81))))) {
										if (i_65_ < 10)
											Class235.method1511(true, i_65_ + 1, "", (((Class235) class235).anInt3248), -1);
										else if (i_65_ == 10) {
											Class59_Sub4.method2209((byte) -97);
											Class246_Sub27 class246_sub27 = method2971(class235);
											Class155.method1029(((Class246_Sub27) class246_sub27).anInt4898, class246_sub27.method2126(16693), class235, (byte) -38);
											Class218.aString3026 = (Class179.method1174(class235, (byte) 120));
											if (Class218.aString3026 == null)
												Class218.aString3026 = "Null";
											Class246_Sub7.aString3964 = (((Class235) class235).f_jb + "<col=ffffff>");
										}
										int i_67_ = (((Class235) class235).f_ed[i_65_]);
										if ((((Class235) class235).anIntArray3202) == null)
											((Class235) class235).anIntArray3202 = (new int[(((Class235) class235).aByteArray3214).length]);
										if (i_67_ != 0)
											((Class235) class235).anIntArray3202[i_65_] = (Class246_Sub1_Sub4.anInt5752 + i_67_);
										else
											((Class235) class235).anIntArray3202[i_65_] = 2147483647;
									}
								}
							}
						}
						if (bool_64_)
							Class246_Sub28_Sub6.method2550(0, class246_sub30.method2161((byte) -81) - i_56_, class235, class246_sub30.method2160(92) - i_55_);
						if (Class150.aClass235_2196 != null && Class150.aClass235_2196 != class235 && bool && method2971(class235).method2119(109))
							Class_ls.aClass235_964 = class235;
						if (class235 == Class33.aClass235_445) {
							Class259_Sub3.aBool5355 = true;
							Class260.anInt3722 = i_55_;
							Class208.anInt2937 = i_56_;
						}
						if (((Class235) class235).aBool3222 || ((Class235) class235).anInt3280 != 0) {
							if (bool && Class246_Sub41.anInt5531 != 0 && ((Class235) class235).f_wb != null) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aBool4964 = true;
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anInt4975 = Class246_Sub41.anInt5531;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_wb;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if (Class150.aClass235_2196 != null || Class246_Sub28_Sub21.aBool6580 || ((((Class235) class235).anInt3280 != Class179.anInt2516) && Class59_Sub3_Sub2.f_db > 0)) {
								bool_64_ = false;
								bool_63_ = false;
								bool = false;
							}
							if (((Class235) class235).anInt3280 != 0) {
								if ((((Class235) class235).anInt3280 == Class246_Sub1_Sub3.anInt5719) || (((Class235) class235).anInt3280 == Class18.anInt268)) {
									Class104.f_vb = class235;
									if (Class_u_Sub1.aClass230_5685 != null)
										Class_u_Sub1.aClass230_5685.method1471((byte) -10, ((Class235) class235).f_sb, Class246_Sub15.aClass260_4445);
									if (((Class235) class235).anInt3280 == Class246_Sub1_Sub3.anInt5719) {
										if (!Class246_Sub28_Sub21.aBool6580 && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_ && i_53_ < i_60_) {
											Class246_Sub28_Sub13.method2623(-1, Class246_Sub15.aClass260_4445, i_52_, i_53_);
											for (Class130_Sub4 class130_sub4 = ((Class130_Sub4) HashMap.aClass68_762.method445(62)); class130_sub4 != null; class130_sub4 = ((Class130_Sub4) (HashMap.aClass68_762.method442((byte) -115)))) {
												if (i_52_ >= (((Class130_Sub4) class130_sub4).anInt4737) && (i_52_ < (((Class130_Sub4) class130_sub4).anInt4741)) && (i_53_ >= (((Class130_Sub4) class130_sub4).anInt4743)) && (i_53_ < (((Class130_Sub4) class130_sub4).anInt4739))) {
													Class109_Sub1_Sub1.method2756(-22);
													Class246_Sub13.method1990((((Class130_Sub4) class130_sub4).aClass_r4744), true);
												}
											}
										}
										Class64_Sub1.method2219(i_56_, (byte) -82, class235, i_55_);
										continue;
									}
								}
								if (((Class235) class235).anInt3280 == Class59_Sub1.anInt4514) {
									if ((class235.method1514(0, (Class246_Sub15.aClass260_4445)) != null) && (Class246_Sub28_Sub13.anInt6293 == 0 || (Class246_Sub28_Sub13.anInt6293 == 3)) && !Class246_Sub28_Sub21.aBool6580 && i_52_ >= i_57_ && i_53_ >= i_58_ && i_52_ < i_59_ && i_53_ < i_60_) {
										int i_68_ = i_52_ - i_55_;
										int i_69_ = i_53_ - i_56_;
										int i_70_ = (((Class235) class235).f_ld[i_69_]);
										if (i_68_ >= i_70_ && i_68_ <= i_70_ + (((Class235) class235).f_hc[i_69_])) {
											i_68_ -= (((Class235) class235).f_fc / 2);
											i_69_ -= (((Class235) class235).f_sb / 2);
											int i_71_;
											if (Class130_Sub3.anInt4417 == 4)
												i_71_ = ((int) (Class204.aFloat2881) & 0x3fff);
											else
												i_71_ = (((int) (Class204.aFloat2881) + Class95.anInt1253) & 0x3fff);
											int i_72_ = Class39_Sub1.f_fb[i_71_];
											int i_73_ = (Class39_Sub1.anIntArray4672[i_71_]);
											if (Class130_Sub3.anInt4417 != 4) {
												i_72_ = i_72_ * ((Class246_Sub12.anInt4405) + 256) >> 8;
												i_73_ = i_73_ * ((Class246_Sub12.anInt4405) + 256) >> 8;
											}
											int i_74_ = ((i_69_ * i_72_ + i_68_ * i_73_) >> 15);
											int i_75_ = ((i_69_ * i_73_ - i_68_ * i_72_) >> 15);
											int i_76_;
											int i_77_;
											if (Class130_Sub3.anInt4417 == 4) {
												i_76_ = (Class242.anInt3424 >> 7) + (i_74_ >> 2);
												i_77_ = (Class246_Sub43.anInt5606 >> 7) - (i_75_ >> 2);
											} else {
												int i_78_ = ((Class_a.aClass_r_Sub1_1180.method2670((byte) 127)) - 1) * 64;
												i_76_ = ((((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).anInt5060) - i_78_ >> 7) + (i_74_ >> 2);
												i_77_ = ((((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).anInt5059) - i_78_ >> 7) - (i_75_ >> 2);
											}
											if (Class187.aBool2653 && ((Node.anInt3469 & 0x40) != 0)) {
												Class235 class235_79_ = (Class211.method1390(Class231.anInt3168, Class_b.anInt1161, (byte) 9));
												if (class235_79_ != null)
													Class259_Sub2_Sub1.method2846(19, (byte) -55, false, 1L, i_76_, " ->", true, Class218.aString3026, i_77_, (((Class235) class235).anInt3210), Class147.anInt2148);
												else
													Class59_Sub4.method2209((byte) -85);
											} else {
												if ((Class59_Sub4_Sub3.aClass101_6943) == (Class40_Sub6.aClass101_5092))
													Class259_Sub2_Sub1.method2846(59, (byte) -55, false, 1L, i_76_, "", true, (Class246_Sub1_Sub13.aClass67_6567.method436(true, Class_j.anInt1485)), i_77_, -1, -1);
												Class259_Sub2_Sub1.method2846(44, (byte) -55, false, 1L, i_76_, "", true, Class91.aString1187, i_77_, -1, (Class246_Sub28_Sub20.anInt6572));
											}
										}
									}
									continue;
								}
								if (((Class235) class235).anInt3280 == Class179.anInt2516) {
									Class246_Sub11.aClass235_4106 = class235;
									if (bool)
										Class246_Sub28_Sub34.aBool7008 = true;
									if (bool_64_) {
										int i_80_ = (int) ((double) ((class246_sub30.method2160(93)) - i_55_ - (((Class235) class235).f_fc) / 2) * 2.0 / (double) (Class79.aFloat1033));
										int i_81_ = (int) -((double) ((class246_sub30.method2161((byte) -84)) - i_56_ - (((Class235) class235).f_sb) / 2) * 2.0 / (double) (Class79.aFloat1033));
										int i_82_ = (Class109_Sub1_Sub1.anInt6725 + i_80_ + Class79.anInt1057);
										int i_83_ = (Class21.anInt322 + i_81_ + Class79.anInt1041);
										Class246_Sub1_Sub5 class246_sub1_sub5 = Class58.method398((byte) -83);
										if (class246_sub1_sub5 != null) {
											int[] is = new int[3];
											class246_sub1_sub5.method2466(i_82_, is, (byte) 111, i_83_);
											if (is != null) {
												if (Class216.aClass232_3009.method1488(-111, 82) && (Class260_Sub2.anInt4289 > 0)) {
													Class246_Sub41_Sub2.method2680(is[0], 63, is[2], is[1]);
													continue;
												}
												Class116.aBool1620 = true;
												Class59_Sub1.anInt4513 = is[0];
												Class246_Sub28_Sub24.anInt6675 = is[1];
												Class128_Sub1.anInt5560 = is[2];
											}
											Class59_Sub3_Sub2.f_db = 1;
											Class56.aBool791 = false;
											Class99.anInt1292 = Class238.aClass102_3360.method640((byte) 58);
											Class246_Sub43.anInt5605 = Class238.aClass102_3360.method636(3045);
										}
									} else if (bool_63_ && Class59_Sub3_Sub2.f_db > 0) {
										if (Class59_Sub3_Sub2.f_db == 1 && ((Class99.anInt1292 != Class238.aClass102_3360.method640((byte) 58)) || (Class246_Sub43.anInt5605 != (Class238.aClass102_3360.method636(3045))))) {
											Class258.anInt3699 = Class109_Sub1_Sub1.anInt6725;
											Class246_Sub28_Sub6.anInt6046 = Class21.anInt322;
											Class59_Sub3_Sub2.f_db = 2;
										}
										if (Class59_Sub3_Sub2.f_db == 2) {
											Class56.aBool791 = true;
											Class246_Sub1.method1757((Class258.anInt3699 + (int) ((double) ((Class99.anInt1292) - (Class238.aClass102_3360.method640((byte) 58))) * 2.0 / (double) (Class79.aFloat1036))), 107);
											Class130_Sub8.method2348(-1, (Class246_Sub28_Sub6.anInt6046 - (int) ((double) ((Class246_Sub43.anInt5605) - (Class238.aClass102_3360.method636(3045))) * 2.0 / (double) (Class79.aFloat1036))));
										}
									} else {
										if (Class59_Sub3_Sub2.f_db > 0 && !Class56.aBool791) {
											if (((Class59_Sub3_Sub2.anInt5889 == 1) || Class84.method535((byte) -20)) && Class230.anInt3147 > 2)
												Class55.method386(84, Class99.anInt1292, Class246_Sub43.anInt5605);
											else if (Class7.method77(128))
												Class55.method386(108, Class99.anInt1292, Class246_Sub43.anInt5605);
										}
										Class59_Sub3_Sub2.f_db = 0;
									}
									continue;
								}
								if (((Class235) class235).anInt3280 == Class246_Sub18.anInt4676) {
									if (bool_63_)
										Class45.method302(((Class235) class235).f_fc, Class238.aClass102_3360.method640((byte) 58) - i_55_, ((Class235) class235).f_sb, Class238.aClass102_3360.method636(3045) - i_56_, (byte) 76);
									continue;
								}
								if (((Class235) class235).anInt3280 == Class246_Sub26.anInt4881) {
									Class19.method190(-122, class235, i_56_, i_55_);
									continue;
								}
							}
							if (!((Class235) class235).f_rc && bool_64_) {
								((Class235) class235).f_rc = true;
								if (((Class235) class235).anObjectArray3227 != null) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aBool4964 = true;
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anInt4979 = (class246_sub30.method2160(110) - i_55_);
									((Class246_Sub29) class246_sub29).anInt4975 = class246_sub30.method2161((byte) -114) - i_56_;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3227);
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								}
							}
							if (((Class235) class235).f_rc && bool_63_ && ((Class235) class235).f_nb != null) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aBool4964 = true;
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
								((Class246_Sub29) class246_sub29).anInt4975 = (Class238.aClass102_3360.method636(3045) - i_56_);
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_nb;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if (((Class235) class235).f_rc && !bool_63_) {
								((Class235) class235).f_rc = false;
								if (((Class235) class235).anObjectArray3282 != null) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aBool4964 = true;
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
									((Class246_Sub29) class246_sub29).anInt4975 = Class238.aClass102_3360.method636(3045) - i_56_;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3282);
									Class246_Sub28_Sub2.aClass166_5809.method1101(false, class246_sub29);
								}
							}
							if (bool_63_ && ((Class235) class235).f_ib != null) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aBool4964 = true;
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
								((Class246_Sub29) class246_sub29).anInt4975 = (Class238.aClass102_3360.method636(3045) - i_56_);
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_ib;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if (!((Class235) class235).aBool3219 && bool) {
								((Class235) class235).aBool3219 = true;
								if (((Class235) class235).anObjectArray3278 != null) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aBool4964 = true;
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
									((Class246_Sub29) class246_sub29).anInt4975 = Class238.aClass102_3360.method636(3045) - i_56_;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3278);
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								}
							}
							if (((Class235) class235).aBool3219 && bool && (((Class235) class235).anObjectArray3273 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aBool4964 = true;
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
								((Class246_Sub29) class246_sub29).anInt4975 = (Class238.aClass102_3360.method636(3045) - i_56_);
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3273;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if (((Class235) class235).aBool3219 && !bool) {
								((Class235) class235).aBool3219 = false;
								if (((Class235) class235).anObjectArray3212 != null) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aBool4964 = true;
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anInt4979 = Class238.aClass102_3360.method640((byte) 58) - i_55_;
									((Class246_Sub29) class246_sub29).anInt4975 = Class238.aClass102_3360.method636(3045) - i_56_;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3212);
									Class246_Sub28_Sub2.aClass166_5809.method1101(false, class246_sub29);
								}
							}
							if (((Class235) class235).anObjectArray3211 != null) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3211;
								Class128.aClass166_1796.method1101(false, class246_sub29);
							}
							if (((Class235) class235).f_sc != null && (Class109_Sub1_Sub1.anInt6728 > ((Class235) class235).anInt3272)) {
								if ((((Class235) class235).anIntArray3220 == null) || ((Class109_Sub1_Sub1.anInt6728 - ((Class235) class235).anInt3272) > 32)) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_sc;
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								} else {
									while_25_: for (int i_84_ = ((Class235) class235).anInt3272; i_84_ < Class109_Sub1_Sub1.anInt6728; i_84_++) {
										int i_85_ = (Class76.anIntArray996[i_84_ & 0x1f]);
										for (int i_86_ = 0; i_86_ < (((Class235) class235).anIntArray3220).length; i_86_++) {
											if ((((Class235) class235).anIntArray3220[i_86_]) == i_85_) {
												Class246_Sub29 class246_sub29 = new Class246_Sub29();
												((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
												((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).f_sc);
												Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
												break while_25_;
											}
										}
									}
								}
								((Class235) class235).anInt3272 = Class109_Sub1_Sub1.anInt6728;
							}
							if (((Class235) class235).anObjectArray3298 != null && (Class246_Sub1_Sub13.anInt6561 > ((Class235) class235).f_tb)) {
								if ((((Class235) class235).anIntArray3208 == null) || (Class246_Sub1_Sub13.anInt6561 - ((Class235) class235).f_tb) > 32) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3298);
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								} else {
									while_26_: for (int i_87_ = ((Class235) class235).f_tb; i_87_ < Class246_Sub1_Sub13.anInt6561; i_87_++) {
										int i_88_ = (Class149.anIntArray2194[i_87_ & 0x1f]);
										for (int i_89_ = 0; i_89_ < (((Class235) class235).anIntArray3208).length; i_89_++) {
											if ((((Class235) class235).anIntArray3208[i_89_]) == i_88_) {
												Class246_Sub29 class246_sub29 = new Class246_Sub29();
												((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
												((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3298);
												Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
												break while_26_;
											}
										}
									}
								}
								((Class235) class235).f_tb = Class246_Sub1_Sub13.anInt6561;
							}
							if (((Class235) class235).anObjectArray3243 != null && (Class246_Sub29.anInt4981 > ((Class235) class235).anInt3288)) {
								if ((((Class235) class235).anIntArray3195 == null) || ((Class246_Sub29.anInt4981 - ((Class235) class235).anInt3288) > 32)) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3243);
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								} else {
									while_27_: for (int i_90_ = ((Class235) class235).anInt3288; i_90_ < Class246_Sub29.anInt4981; i_90_++) {
										int i_91_ = (Class3.anIntArray27[i_90_ & 0x1f]);
										for (int i_92_ = 0; i_92_ < (((Class235) class235).anIntArray3195).length; i_92_++) {
											if ((((Class235) class235).anIntArray3195[i_92_]) == i_91_) {
												Class246_Sub29 class246_sub29 = new Class246_Sub29();
												((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
												((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3243);
												Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
												break while_27_;
											}
										}
									}
								}
								((Class235) class235).anInt3288 = Class246_Sub29.anInt4981;
							}
							if (((Class235) class235).anObjectArray3246 != null && (Class74.anInt973 > ((Class235) class235).f_qc)) {
								if (((Class235) class235).f_jc == null || (Class74.anInt973 - ((Class235) class235).f_qc) > 32) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3246);
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								} else {
									while_28_: for (int i_93_ = ((Class235) class235).f_qc; i_93_ < Class74.anInt973; i_93_++) {
										int i_94_ = (Class59_Sub4_Sub3.anIntArray6948[i_93_ & 0x1f]);
										for (int i_95_ = 0; i_95_ < (((Class235) class235).f_jc).length; i_95_++) {
											if ((((Class235) class235).f_jc[i_95_]) == i_94_) {
												Class246_Sub29 class246_sub29 = new Class246_Sub29();
												((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
												((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).anObjectArray3246);
												Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
												break while_28_;
											}
										}
									}
								}
								((Class235) class235).f_qc = Class74.anInt973;
							}
							if (((Class235) class235).f_fd != null && (Class189.anInt2671 > ((Class235) class235).anInt3263)) {
								if ((((Class235) class235).anIntArray3302 == null) || ((Class189.anInt2671 - ((Class235) class235).anInt3263) > 32)) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_fd;
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								} else {
									while_29_: for (int i_96_ = ((Class235) class235).anInt3263; i_96_ < Class189.anInt2671; i_96_++) {
										int i_97_ = (Class246_Sub28_Sub2.anIntArray5807[i_96_ & 0x1f]);
										for (int i_98_ = 0; i_98_ < (((Class235) class235).anIntArray3302).length; i_98_++) {
											if ((((Class235) class235).anIntArray3302[i_98_]) == i_97_) {
												Class246_Sub29 class246_sub29 = new Class246_Sub29();
												((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
												((Class246_Sub29) class246_sub29).anObjectArray4977 = (((Class235) class235).f_fd);
												Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
												break while_29_;
											}
										}
									}
								}
								((Class235) class235).anInt3263 = Class189.anInt2671;
							}
							if ((Class246_Sub31.anInt5037 > ((Class235) class235).anInt3267) && (((Class235) class235).anObjectArray3218 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3218;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if ((Class246_Sub1_Sub15.anInt6602 > ((Class235) class235).anInt3267) && (((Class235) class235).anObjectArray3299 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3299;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if ((Class214.anInt2991 > ((Class235) class235).anInt3267) && ((Class235) class235).f_wc != null) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_wc;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if ((Class246_Sub23.anInt4821 > ((Class235) class235).anInt3267) && (((Class235) class235).anObjectArray3230 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3230;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							if ((Class168.anInt2399 > ((Class235) class235).anInt3267) && (((Class235) class235).anObjectArray3231 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3231;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
							((Class235) class235).anInt3267 = Class246_Sub34.anInt5146;
							if (((Class235) class235).f_ab != null) {
								for (int i_99_ = 0; i_99_ < Class246_Sub28_Sub14.anInt6308; i_99_++) {
									Class246_Sub29 class246_sub29 = new Class246_Sub29();
									((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
									((Class246_Sub29) class246_sub29).anInt4978 = Class59_Sub2.aClass188Array4544[i_99_].method1233((byte) 108);
									((Class246_Sub29) class246_sub29).anInt4973 = Class59_Sub2.aClass188Array4544[i_99_].method1236(2);
									((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).f_ab;
									Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
								}
							}
							if (Class59_Sub4_Sub2.aBool6844 && (((Class235) class235).anObjectArray3198 != null)) {
								Class246_Sub29 class246_sub29 = new Class246_Sub29();
								((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
								((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3198;
								Class246_Sub28_Sub26.aClass166_6708.method1101(false, class246_sub29);
							}
						}
						if (((Class235) class235).f_vc == 5 && ((Class235) class235).anInt3213 != -1)
							class235.method1513(-118, Class246_Sub1_Sub14.aClass214_6597, Class246_Sub31.aClass203_5038).method1471((byte) -122, ((Class235) class235).f_sb, Class246_Sub15.aClass260_4445);
						Class39.method272(class235, 2);
						if (((Class235) class235).f_vc == 0) {
							method2972(class235s, ((Class235) class235).anInt3248, i_57_, i_58_, i_59_, i_60_, i_55_ - ((Class235) class235).anInt3270, i_56_ - ((Class235) class235).anInt3292, i_52_, i_53_);
							if (((Class235) class235).f_ad != null)
								method2972(((Class235) class235).f_ad, ((Class235) class235).anInt3248, i_57_, i_58_, i_59_, i_60_, (i_55_ - ((Class235) class235).anInt3270), (i_56_ - ((Class235) class235).anInt3292), i_52_, i_53_);
							Class246_Sub40 class246_sub40 = ((Class246_Sub40) (Class246_Sub34.aClass85_5143.method544((long) ((Class235) class235).anInt3248, 124)));
							if (class246_sub40 != null) {
								if ((Class59_Sub4_Sub3.aClass101_6943 == Class246_Sub28_Sub16.aClass101_6394) && (((Class246_Sub40) class246_sub40).anInt5519) == 0 && !Class246_Sub28_Sub21.aBool6580 && bool && !Class_v.aBool1452)
									Class109_Sub1_Sub1.method2756(105);
								Class_cs.method2921(i_57_, i_56_, i_59_, ((Class246_Sub40) class246_sub40).anInt5517, 29474, i_58_, i_55_, i_60_, i_53_, i_52_);
							}
						}
					}
				}
			}
		}
	}

	final void method2956(int i) {
		do {
			try {
				anInt7243++;
				try {
					method2965(-122);
					if (i == 6231)
						break;
					f_mb = null;
				} catch (OutOfMemoryError outofmemoryerror) {
					if (outofmemoryerror.getMessage() != null && outofmemoryerror.getMessage().startsWith("native")) {
						Class129.method883(0, (byte) 70);
						Class194_Sub1.method1883(outofmemoryerror, (outofmemoryerror.getMessage() + " (Recovered) " + method2953((byte) -76)), -115);
					} else
						throw outofmemoryerror;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.E(" + i + ')');
			}
		} while (false);
	}

	final void method2946(boolean bool) {
		try {
			method2976(9);
			f_ab++;
			NativeLibraryManager.clean();
			NativeLibraryLoader.clean();
			Class231.method1480((byte) -10);
			Class246_Sub1_Sub10.method2608((byte) 2);
			Class98.method621(-2);
			Class232.method1487(-5631);
			Class102.method637(-20);
			Class255.method1660((byte) 119);
			Class246_Sub1.method1759(99);
			Node.method1575((byte) 70);
			Class217.method1404(-91);
			Class85.method551(31);
			Class_o.method2955(19197);
			Class110.method765(false);
			Class97.method617(-15098);
			Class205.method1342(127);
			Class101.method631(-7325);
			Class_c.method584(!bool);
			Class260.method1712(-127);
			Class39_Sub1.method2055(1);
			Class29.method229(14958);
			Class95.method603(!bool);
			Class166.method1107((byte) -84);
			Class78.method492((byte) 51);
			Class6.method68(-1);
			Class242.method1560(-15604);
			Class241.method1543(-128);
			Class142.method956(3);
			Class154_Sub1.method2094(0);
			Class_fs.method97(87);
			Class125.method859(22);
			Class208.method1364(3);
			HashMap.method372(24310);
			Class_v.method695(-25819);
			Class156.method1037(56);
			Class141.method953(1);
			Class105.method706(4);
			Class92.method588((byte) 21);
			Class61.method417(32);
			Class189.method1240((byte) -25);
			Class251.method1609(false);
			Class165.method1090((byte) -16);
			Class254.method1640(false);
			Class228.method1460(-128);
			Class191.method1256(1);
			Class163.method1081(1);
			Class193.method1267(89);
			Class45.method300(!bool);
			Class203.method1337((byte) 64);
			Class214.method1396(-119);
			Class177.method1163((byte) 109);
			Class57.method397(false);
			Class180.method1175(-94);
			Class76.method478((byte) 124);
			Class17.method170((byte) -123);
			Class209.method1376(-84);
			Class65.method426(-7675);
			Npc.method2929(0);
			Stream_Sub1.method2479(false);
			Class243.method1569((byte) 117);
			Class246_Sub39.method2303((byte) -91);
			Class199.method1316(3);
			Class246_Sub1_Sub5.method2472((byte) 110);
			Class230.method1474(4096);
			Class68.method444((byte) -45);
			Class235.method1515(-7975);
			Class86.method553((byte) 83);
			Player.method2911(false);
			Class87.method555((byte) -115);
			Class9.method83(3);
			Class18.method171(8);
			BufferStream.method2361(-271907000);
			Actor.method2677(-114);
			Class116.method785(1);
			Class147.method999(255);
			Class12.method140(-22964);
			Class246_Sub6.method1820((byte) 58);
			Class246_Sub43.method2346(1);
			Class246_Sub40.method2311(200);
			Class246_Sub27.method2124(0);
			OutgoingPacket.method1329((byte) -63);
			Class246_Sub1_Sub8.method2567(2048);
			Class71.method453((byte) 116);
			ISAAC.method288(1049069386);
			Class221.method1435((byte) 121);
			Class130.method884(true);
			Class111.method768(true);
			Class233.method1491((byte) 21);
			Class94.method602(22);
			Class246_Sub1_Sub6_Sub2.method2906(0);
			SubIncomingPacket.method2900(-119);
			Class246_Sub1_Sub17.method2759((byte) 24);
			Class124.method851((byte) 93);
			Class148.method1000(7559);
			Class_t.method689((byte) 55);
			Class222.method1436((byte) -125);
			Class138.method934(false);
			Class211.method1388(false);
			Class172.method1135((byte) 121);
			Class185.method1207((byte) 17);
			Class103.method656(0);
			Class133.method896((byte) 93);
			Class253.method1627(0);
			Class197.method1294(0);
			Class128.method875(-82);
			Class_u.method2063(bool);
			Class73.method467(-36);
			Class129.method882(1);
			Class246_Sub41.method2314(false);
			Class7.method78(0);
			Class246_Sub37_Sub1.method2517(-34);
			Class123.method829((byte) -57);
			Class250.method1596(false);
			Class115.method781((byte) -48);
			Class43.method295(0);
			Class152.method1011(1);
			Class155.method1025((byte) 116);
			Class215.method1401(127);
			Class168.method1120(false);
			Class247.method1579((byte) 98);
			Class150.method1008(-127);
			Class59.method400((byte) 54);
			Class130_Sub3.method1986(126);
			Class24.method202(2);
			Class130_Sub2.method1775();
			Class246_Sub16.method2018(28);
			Class135.method919((byte) 4);
			Class56.method387(bool);
			Class195.method1277(-14932);
			Class170.method1126(false);
			Class154.method1018(89);
			Class79_Sub1.method2206(false);
			Class146.method986();
			Class79.method500();
			Class44.method297(0);
			Class246_Sub2.method1787(-128);
			Class198.method1301();
			Class51.method338(17);
			Class140.method950((byte) 66);
			Class48.method322(10);
			Class246_Sub1_Sub6.method2535(10);
			Class127.method871(-75);
			Class238.method1532(0);
			Class246_Sub1_Sub13.method2704(26270);
			Class55.method385((byte) -122);
			Class118.method808(11);
			Class60.method413(1);
			Class207.method1358(113);
			Class161.method1069(4);
			Class246_Sub1_Sub2.method2423(-14495);
			Class173.method1139((byte) 107);
			Class32.method243(-61);
			Class206.method1348(8192);
			Class84.method533((byte) -82);
			Class153.method1016(13732);
			Class46.method311((byte) 34);
			Class144.method967((byte) -120);
			Class246_Sub1_Sub18.method2829(7);
			Class225.method1448((byte) -102);
			Class108.method747(1);
			Class93.method600(13815);
			Class246_Sub1_Sub16.method2749(true);
			Class81.method522(30068);
			Class246_Sub1_Sub3.method2432(124);
			Class1.method37(0);
			Class83.method530(-1);
			Class2.method44();
			Class200.method1325(125);
			Class99.method626(0);
			Class33.method245(2);
			Class_e.method593(63);
			Class113.method775((byte) -54);
			Class63_Sub1.method2075(23573);
			Class219.method1422((byte) 74);
			Class5.method63(false);
			Class244.method1570(3);
			Class246_Sub29.method2151(-1);
			Class169.method1122((byte) -43);
			CS2Script.method2417((byte) 125);
			Class106.method719((byte) 123);
			Class121.method822(500);
			Class174.method1148((byte) -29);
			Class59_Sub5.method2282((byte) 94);
			Class59_Sub4.method2210(true);
			Class59_Sub2.method2021(6);
			Class3.method52(-26007);
			Class100.method630((byte) 123);
			Class246_Sub1_Sub4.method2445(-107);
			Class90.method569(-16641);
			Class257.method1669(7582);
			Class246_Sub18.method2057(false);
			Class202.method1330((byte) 92);
			Class20.method193(-114);
			Class240.method1537(94);
			Class159.method1056((byte) 104);
			Class246_Sub5.method1812(false);
			Class104.method668(22404);
			Class22.method200(false);
			Class176.method1157(-69);
			Class_ls.method469(-58);
			Class126.method866(-1);
			Class216.method1403(true);
			Class130_Sub4.method2079(-115);
			Class59_Sub3_Sub2.method2487(-12582);
			Class130_Sub8.method2350(0);
			Class143.method963(!bool);
			Class58.method399(12);
			Class59_Sub5_Sub1.method2463((byte) 81);
			Class59_Sub4_Sub3.method2859((byte) 75);
			Class14.method145(117);
			Class59_Sub2_Sub3.method2721(6);
			Class59_Sub3_Sub3.method2621(16299);
			Class59_Sub1_Sub2.method2570(30517);
			Class190.method1245((byte) -116);
			Class139.method937((byte) -66);
			Class246_Sub26.method2116(-25049);
			Class72.method457();
			Class19.method186((byte) 7);
			Class162.method1072((byte) -124);
			Class16.method162(-87);
			Class102_Sub1.method2000(128);
			Canvas_Sub1.method2839(-29624);
			Class234.method1495(12);
			Class186.method1220((byte) -46);
			Class91.method578(20517);
			Class53.method367((byte) 1);
			Class131.method889(1);
			Class223.method1438(20253);
			Class82.method526(13);
			Class_h.method707();
			Class35.method250((byte) 109);
			Class246_Sub1_Sub8_Sub1.method2926(bool);
			Class248.method1585((byte) -57);
			Class_a.method575(-14407);
			Class246_Sub28_Sub9.method2577((byte) 26);
			Class59_Sub1_Sub3.method2644((byte) -114);
			Class59_Sub1_Sub1.method2540(95);
			Class59_Sub3_Sub4.method2868(-86);
			Class59_Sub3_Sub1.method2441(0);
			Class59_Sub4_Sub2.method2822(65535);
			Class59_Sub4_Sub1.method2639((byte) 85);
			Class59_Sub2_Sub1.method2452(0);
			Class59_Sub2_Sub2.method2546(65);
			Class246_Sub38.method2294(76);
			IntegerNode.method2181(0);
			Class246_Sub4.method1806(0);
			Class149.method1005(false);
			Class220.method1425(false);
			Class130_Sub1.method1755((byte) -32);
			Class246_Sub22.method2085((byte) -125);
			Class158.method1053();
			Class246_Sub34.method2195(32410);
			Class246_Sub9.method1856();
			Class167.method1115();
			Class237.method1525();
			Class246_Sub14.method1996(-7799);
			Class239.method1535(8);
			Class123_Sub2.method1995();
			Class246_Sub1_Sub11.method2613(true);
			Class130_Sub6.method2106(-1);
			Class130_Sub1_Sub1.method2881(-17);
			Class245.method1573(-16777216);
			Class77.method482();
			Class246_Sub28.method2140(-256);
			Class171.method1132((byte) 116);
			Class246_Sub28_Sub20.method2705((byte) -9);
			Class136.method924((byte) -58);
			Class66.method431(false);
			Class246_Sub28_Sub5.method2542(-5669);
			Class246_Sub28_Sub16.method2656(-106);
			Class246_Sub31.method2163(127);
			Class88.method558(1244216161);
			Class106_Sub2.method2261((byte) -91);
			Class38.method269(385672172);
			Class246_Sub32.method2167((byte) 86);
			Class246_Sub19.method2066((byte) -58);
			Class36.method256(true);
			Class260_Sub2.method1947(1);
			Class47.method314(true);
			Class236.method1522(9);
			Class249.method1590(118);
			Class246_Sub7_Sub1.method2565((byte) 22);
			Class31.method239((byte) 127);
			Class_c_Sub1.method2274(-70);
			Class37.method258(60);
			Class_l_Sub2.method2296(-114);
			Class134.method900((byte) -102);
			Class109.method759(10241);
			Class109_Sub1.method1763(-90);
			Class211_Sub1.method2270(true);
			Class_t_Sub1.method2029(124);
			Class160.method1061((byte) -14);
			Class109_Sub4.method2026(-1);
			Class11.method136();
			Class246_Sub28_Sub1.method2454((byte) -50);
			Class246_Sub28_Sub25.method2751(119);
			Class246_Sub28_Sub6.method2552((byte) 108);
			Class246_Sub28_Sub23.method2729(-1);
			Class246_Sub28_Sub12.method2598(2);
			Class246_Sub28_Sub17.method2657(31444);
			Class246_Sub28_Sub2.method2458(0);
			Class246_Sub28_Sub13.method2624(true);
			Class246_Sub28_Sub4.method2539(10);
			Class246_Sub28_Sub31.method2853((byte) 93);
			Class246_Sub28_Sub14.method2635((byte) 90);
			Class246_Sub28_Sub3.method2492(0);
			Class246_Sub28_Sub32.method2857((byte) -104);
			Class246_Sub28_Sub22.method2726(1);
			Class246_Sub28_Sub36.method2879((byte) -108);
			Class_cs.method2920(true);
			Class246_Sub28_Sub21.method2707(1675886592);
			Class_ss.method2884((byte) 57);
			Class246_Sub28_Sub29.method2819(-116);
			Class246_Sub28_Sub24.method2736((byte) -32);
			Class246_Sub28_Sub10.method2580(28);
			Class_ds.method2753((byte) 95);
			Class246_Sub28_Sub33.method2860(3);
			Class246_Sub28_Sub11.method2582((byte) -72);
			Class_w.method2654((byte) -48);
			Class246_Sub28_Sub8.method2561(-1);
			Class246_Sub28_Sub30.method2835(-1);
			Class246_Sub28_Sub26.method2752(-89);
			Class246_Sub28_Sub15.method2645(false);
			Class246_Sub28_Sub35.method2873((byte) -117);
			Class246_Sub28_Sub34.method2870(-969029332);
			Class246_Sub28_Sub19.method2692((byte) 18);
			Class246_Sub28_Sub27.method2766(255);
			Class246_Sub36.method2223();
			Class_t_Sub2.method2234();
			Class128_Sub2.method2333((byte) -126);
			Class112.method772(-10933);
			Class246_Sub19_Sub2.method2817(2);
			Stream_Sub2.method2596(-8625);
			Class96.method613(0);
			Class196.method1278(-115);
			Class109_Sub3.method1826((byte) 76);
			Class246_Sub7.method1828(0);
			Class40.method281((byte) -15);
			Class_m.method750((byte) 100);
			Class40_Sub9.method2307(-261);
			Class_j.method717((byte) -27);
			Class69.method449(123);
			Class246_Sub1_Sub4_Sub1.method2891((byte) -77);
			Class_u_Sub1.method2420(-42);
			Class128_Sub1.method2330(19274);
			Class34.method249(4864);
			Class210_Sub2.method2152(false);
			Class246_Sub11.method1871(-128);
			Class224.method1446(31);
			Class213.method1392((byte) -10);
			Class246_Sub41_Sub1.method2584((byte) 55);
			Class211_Sub1_Sub2.method2690(-4);
			Class211_Sub1_Sub1.method2609(33985);
			Class187_Sub1.method2110(-11836);
			Class187.method1223(-5298);
			Class194_Sub1.method1880(true);
			Class187_Sub2.method2284((byte) 127);
			Class194_Sub2.method2144(11134);
			Class40_Sub6.method2186(true);
			Class40_Sub3.method1862(125);
			Class109_Sub2.method1792(-114);
			Class40_Sub8.method2212(-108);
			Class40_Sub7.method2208(0);
			Class40_Sub1.method1769((byte) 121);
			Class40_Sub2.method1859((byte) 95);
			Class256.method1661(0);
			Class132.method892(53);
			Class204.method1338((byte) 32);
			Class246_Sub41_Sub2.method2682(-7247);
			Class259_Sub3.method2271((byte) -59);
			Class259.method1674(true);
			Class259_Sub3_Sub1.method2843((byte) 114);
			Class259_Sub1.method2015((byte) -44);
			Class259_Sub2_Sub1.method2848(110);
			Class259_Sub2.method2149(99);
			Class_q.method2062((byte) -23);
			Class38_Sub1.method2190(-9160);
			Class120.method820((byte) -63);
			Class64_Sub1.method2218(!bool);
			Class64.method423(false);
			Class246_Sub1_Sub7.method2547((byte) 122);
			Class246_Sub1_Sub9.method2589(19293);
			Class246_Sub30.method2159(3);
			InputStream_Sub1.method2100(8301);
			Class137.method929((byte) 101);
			Class246_Sub12.method1979(-105);
			Class246_Sub10.method1867(-120);
			Class246_Sub35.method2203((byte) -3);
			Class188_Sub1.method1816(101);
			Class246_Sub30_Sub1.method2447((byte) -112);
			Class246_Sub1_Sub14.method2710(92);
			Class246_Sub15.method1998(-1);
			Class246_Sub8.method1842(31469);
			Class75.method474((byte) -92);
			Class179.method1171(true);
			Class218.method1418(1);
			Class122.method827(-7782);
			Class21.method197((byte) -74);
			Class21_Sub2.method2013((byte) -79);
			Class21_Sub1.method1813(255);
			Class21_Sub4.method2129(false);
			Class_q_Sub1.method2732(-11878);
			Class38_Sub1_Sub1.method2770(-20);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.Q(" + bool + ')');
		}
		if (Class_o.anInt7227 != 0)
			f_ob = true;
	}

	static final void method2973(int i) {
		int i_100_ = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		for (int i_101_ = 0; i_101_ < i_100_ + Class5.anInt55; i_101_++) {
			Actor class_r;
			if (i_101_ < i_100_)
				class_r = Class143.aClass_r_Sub1Array2069[is[i_101_]];
			else
				class_r = (Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_101_ - i_100_]]);
			if (((Class59_Sub3) class_r).aByte5053 == i && ((Actor) class_r).anInt6431 >= 0) {
				int i_102_ = class_r.method2670((byte) 127);
				if ((i_102_ & 0x1) == 0) {
					if ((((Class59_Sub3) class_r).anInt5060 & 0x7f) != 0 || (((Class59_Sub3) class_r).anInt5059 & 0x7f) != 0)
						continue;
				} else if ((((Class59_Sub3) class_r).anInt5060 & 0x7f) != 64 || ((((Class59_Sub3) class_r).anInt5059 & 0x7f) != 64))
					continue;
				if (i_102_ == 1) {
					int i_103_ = ((Class59_Sub3) class_r).anInt5060 >> 7;
					int i_104_ = ((Class59_Sub3) class_r).anInt5059 >> 7;
					if (((Actor) class_r).anInt6431 > Class24.anIntArrayArray348[i_103_][i_104_]) {
						Class24.anIntArrayArray348[i_103_][i_104_] = ((Actor) class_r).anInt6431;
						Class246_Sub6.anIntArrayArray3944[i_103_][i_104_] = 1;
					} else if (((Actor) class_r).anInt6431 == Class24.anIntArrayArray348[i_103_][i_104_])
						Class246_Sub6.anIntArrayArray3944[i_103_][i_104_]++;
				} else {
					int i_105_ = (i_102_ - 1) * 64 + 60;
					int i_106_ = ((Class59_Sub3) class_r).anInt5060 - i_105_ >> 7;
					int i_107_ = ((Class59_Sub3) class_r).anInt5059 - i_105_ >> 7;
					int i_108_ = ((Class59_Sub3) class_r).anInt5060 + i_105_ >> 7;
					int i_109_ = ((Class59_Sub3) class_r).anInt5059 + i_105_ >> 7;
					for (int i_110_ = i_106_; i_110_ <= i_108_; i_110_++) {
						for (int i_111_ = i_107_; i_111_ <= i_109_; i_111_++) {
							if (((Actor) class_r).anInt6431 > Class24.anIntArrayArray348[i_110_][i_111_]) {
								Class24.anIntArrayArray348[i_110_][i_111_] = ((Actor) class_r).anInt6431;
								Class246_Sub6.anIntArrayArray3944[i_110_][i_111_] = 1;
							} else if (((Actor) class_r).anInt6431 == (Class24.anIntArrayArray348[i_110_][i_111_]))
								Class246_Sub6.anIntArrayArray3944[i_110_][i_111_]++;
						}
					}
				}
			}
		}
	}

	public static final void main(String[] strings) {
		try {
			f_nb++;
			try {
				if ((strings.length ^ 0xffffffff) != -5)
					Class169.method1123("argument count", (byte) 117);
				Class58.anInt816 = Integer.parseInt(strings[0]);
				Class260_Sub2.aClass205_4297 = Class155.aClass205_2228;
				if (!strings[1].equals("live")) {
					if (strings[1].equals("rc"))
						Class259.aClass97_3707 = Class189.aClass97_2666;
					else if (!strings[1].equals("wip"))
						Class169.method1123("modewhat", (byte) 123);
					else
						Class259.aClass97_3707 = Class37.aClass97_544;
				} else
					Class259.aClass97_3707 = SubIncomingPacket.aClass97_7088;
				Class_j.anInt1485 = Class41.method286(strings[2], -35);
				if (Class_j.anInt1485 == -1) {
					if (!strings[2].equals("english")) {
						if (strings[2].equals("german"))
							Class_j.anInt1485 = 1;
						else
							Class169.method1123("language", (byte) 117);
					} else
						Class_j.anInt1485 = 0;
				}
				Class106_Sub2.aBool5333 = false;
				Class88.aBool1151 = false;
				if (!strings[3].equals("game0")) {
					if (!strings[3].equals("game1"))
						Class169.method1123("game", (byte) 127);
					else
						Class59_Sub4_Sub3.aClass101_6943 = Class40_Sub6.aClass101_5092;
				} else
					Class59_Sub4_Sub3.aClass101_6943 = Class246_Sub28_Sub16.aClass101_6394;
				Class246_Sub23.aBool4817 = Class_t.aBool1431 = true;
				Class246_Sub5.aString3891 = "";
				Class122.anInt1680 = 0;
				Class109_Sub4.anInt4573 = 0;
				Class246_Sub1_Sub18.anInt6859 = ((Class101) Class59_Sub4_Sub3.aClass101_6943).anInt1310;
				client var_client = new client();
				CS2Script.aclient5668 = var_client;
				var_client.method2951(592, false, 768, ClientLoader.MAX_INDEX_COUNT, // max_index_count
																						// is 31 because
																						// we have 0-30
						// indexes now
						0, ((Class101) Class59_Sub4_Sub3.aClass101_6943).aString1315, 1024, Class259.aClass97_3707.method616(false) + 32);
				Class122.aFrame1688.setLocation(40, 40);
			} catch (Exception exception) {
				Class194_Sub1.method1883(exception, null, 116);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("client.main(" + (strings != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2974(int i, int i_112_) {
		try {
			Class130.aClass6_1817 = null;
			f_db++;
			Class14.aClass182_218 = null;
			if (i >= -33)
				method2970(-36);
			((Class242) Class140.aClass242_2036).anInt3434++;
			((Class242) Class140.aClass242_2036).anInt3436 = i_112_;
			Class44.anInt642 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.HA(" + i + ',' + i_112_ + ')');
		}
	}

	static final void method2975() {
		int i = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		int i_113_ = Class38.aBool563 ? i : i + Class5.anInt55;
		for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
			Actor class_r;
			if (i_114_ < i)
				class_r = Class143.aClass_r_Sub1Array2069[is[i_114_]];
			else
				class_r = (Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_114_ - i]]);
			if (((Actor) class_r).anInt6431 >= 0) {
				int i_115_ = class_r.method2670((byte) 127);
				if ((i_115_ & 0x1) == 0) {
					if ((((Class59_Sub3) class_r).anInt5060 & 0x7f) == 0 && (((Class59_Sub3) class_r).anInt5059 & 0x7f) == 0)
						continue;
				} else if ((((Class59_Sub3) class_r).anInt5060 & 0x7f) == 64 && ((((Class59_Sub3) class_r).anInt5059 & 0x7f) == 64))
					continue;
				if (class_r instanceof Player && ((Actor) class_r).f_pc != null && (Class246_Sub1_Sub4.anInt5752 >= (((Class246_Sub16) ((Actor) class_r).f_pc).anInt4523)) && (Class246_Sub1_Sub4.anInt5752 < (((Class246_Sub16) ((Actor) class_r).f_pc).anInt4535)))
					((Player) (Player) class_r).f_ld = false;
				((Class59_Sub3) class_r).anInt5052 = Class6.getAverageHeight(((Class59_Sub3) class_r).anInt5060, 51, ((Class59_Sub3) class_r).aByte5053, ((Class59_Sub3) class_r).anInt5059);
				Class176.method1156(class_r, true);
			}
		}
	}

	final void method2949(int i) {
		try {
			f_kb++;
			Frame frame = new Frame("Jagex");
			frame.pack();
			frame.dispose();
			Class21.method198(false);
			Class106_Sub2.aClass241_5339 = new Class241(Class108.aClass52_1535);
			Class140.aClass242_2036 = new Class242();
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				Class220.aByteArrayArray3051 = new byte[50][];
			Class246_Sub28_Sub27.aClass39_Sub1_6759 = new Class39_Sub1(Class108.aClass52_1535);
			if (Class260_Sub2.aClass205_4297 == Class208.aClass205_2930) {
				Class6.aString68 = this.getCodeBase().getHost();
				Class71.anInt925 = 43594;
				Class40_Sub1.anInt3767 = 43594; // 443
			} else if (!Class59_Sub1_Sub3.method2642((Class260_Sub2.aClass205_4297), (byte) -52)) {
				if (Class260_Sub2.aClass205_4297 == Class155.aClass205_2228) {
					Class71.anInt925 = 40000 - -Class58.anInt816;
					Class6.aString68 = "127.0.0.1";
					Class40_Sub1.anInt3767 = 50000 - -Class58.anInt816;
				}
			} else {
				Class6.aString68 = this.getCodeBase().getHost();
				Class71.anInt925 = 40000 - -Class58.anInt816;
				Class40_Sub1.anInt3767 = Class58.anInt816 + 50000;
			}

			Class172.anInt2432 = Class71.anInt925;
			Class174.aString2449 = Class6.aString68;
			Class246_Sub28_Sub7.anInt6047 = Class40_Sub1.anInt3767;
			Class172.anInt2433 = Class71.anInt925;

			// if (Signlink.anInt740 == 3)
			// Selected world = 1
			Class32.anInt438 = Class58.anInt816;

			Class187_Sub1.aShortArray4872 = Class246_Sub35.aShortArray5161 = Class44.aShortArray641 = Class90.aShortArray1172 = new short[256];
			if (Class40_Sub6.aClass101_5092 == Class59_Sub4_Sub3.aClass101_6943) {
				Class246_Sub1_Sub2.aShortArrayArray5693 = Class44.aShortArrayArray640;
				Class160.aShortArray2270 = Class130.aShortArray1813;
				Class37.anInt547 = 16777215;
				Class40_Sub6.anInt5099 = 0;
				Node.aBool3468 = true;
				Node.aShortArray3466 = Class40_Sub2.aShortArray4037;
				Class246_Sub30_Sub1.aShortArrayArray5767 = Class246_Sub1_Sub6.aShortArrayArray5965;
			} else {
				Class246_Sub30_Sub1.aShortArrayArray5767 = Class40_Sub2.aShortArrayArray4050;
				Class246_Sub1_Sub2.aShortArrayArray5693 = Class246_Sub7_Sub1.aShortArrayArray6094;
				Node.aShortArray3466 = Class210_Sub2.aShortArray4984;
				Class160.aShortArray2270 = Class197.aShortArray2759;
			}
			Class230.anInt3165 = Class172.anInt2432;
			Class216.aClass232_3009 = Class74.method471((byte) 16, Class147.aCanvas2155);
			Class238.aClass102_3360 = Class_t.method673(-54, true, Class147.aCanvas2155);
			Player.f_rd = Class178.method1167(true);
			if (Player.f_rd != null)
				Player.f_rd.method490((byte) 93, Class147.aCanvas2155);
			Class246_Sub28_Sub6.anInt6045 = Signlink.anInt740;
			try {
				if (Class108.aClass52_1535.aClass192_743 != null) {
					Class48.aClass125_696 = new Class125(Class108.aClass52_1535.aClass192_743, 5200, 0);
					for (int i_116_ = 0; i_116_ < ClientLoader.MAX_INDEX_COUNT; i_116_++)
						Class47.aClass125Array687[i_116_] = new Class125(Class108.aClass52_1535.aClass192Array727[i_116_], 6000, 0);
					Class246_Sub28_Sub35.aClass125_7011 = new Class125(Class108.aClass52_1535.aClass192_737, 6000, 0);
					Class121.aClass208_1678 = new Class208(255, Class48.aClass125_696, Class246_Sub28_Sub35.aClass125_7011, 500000);
					Class_c_Sub1.aClass125_5392 = new Class125(Class108.aClass52_1535.aClass192_735, 24, 0);
					Class108.aClass52_1535.aClass192_737 = null;
					Class108.aClass52_1535.aClass192_735 = null;
					Class108.aClass52_1535.aClass192_743 = null;
					Class108.aClass52_1535.aClass192Array727 = null;
				}
			} catch (java.io.IOException ioexception) {
				Class_c_Sub1.aClass125_5392 = null;
				Class48.aClass125_696 = null;
				Class121.aClass208_1678 = null;
				Class246_Sub28_Sub35.aClass125_7011 = null;
			}
			if (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)
				Class246_Sub34.aBool5145 = true;
			if (i != -22158)
				method2979(null, (byte) 80);
			Class246_Sub28_Sub9.aString6139 = ((Class246_Sub28_Sub16.aClass101_6394 == Class59_Sub4_Sub3.aClass101_6943) ? Class144.aClass67_2088 : Class259_Sub3_Sub1.aClass67_6902).method436(true, Class_j.anInt1485);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.S(" + i + ')');
		}
	}

	public static void method2976(int i) {
		try {
			f_fb = null;
			if (i == 9)
				f_mb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "client.NA(" + i + ')');
		}
	}

	static final Class235 method2977(Class235 class235) {
		int i = method2971(class235).method2125(1861624);
		if (i == 0)
			return null;
		for (int i_117_ = 0; i_117_ < i; i_117_++) {
			class235 = Class220.method1423(0, ((Class235) class235).anInt3293);
			if (class235 == null)
				return null;
		}
		return class235;
	}

	static final void method2978() {
		Class163.anInt2308 = 0;
		for (int i = 0; i < Class5.anInt55; i++) {
			Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i]]);
			if (((Actor) class_r_sub2).aBool6441 && class_r_sub2.method2675((byte) 18) != -1) {
				int i_118_ = (class_r_sub2.method2670((byte) 127) - 1) * 64 + 60;
				int i_119_ = ((Class59_Sub3) class_r_sub2).anInt5060 - i_118_ >> 7;
				int i_120_ = ((Class59_Sub3) class_r_sub2).anInt5059 - i_118_ >> 7;
				Actor class_r = Class154.method1020(i_120_, i_119_, (byte) 119, (((Class59_Sub3) class_r_sub2).aByte5053));
				if (class_r != null) {
					int i_121_ = ((Actor) class_r).f_db;
					if (class_r instanceof Npc)
						i_121_ += 2048;
					if (((Actor) class_r).anInt6463 == 0 && class_r.method2675((byte) 18) != -1) {
						Class121.anIntArray1663[Class163.anInt2308] = i_121_;
						Class236.anIntArray3315[Class163.anInt2308] = i_121_;
						Class163.anInt2308++;
						((Actor) class_r).anInt6463++;
					}
					Class121.anIntArray1663[Class163.anInt2308] = i_121_;
					Class236.anIntArray3315[Class163.anInt2308] = ((Actor) class_r_sub2).f_db + 2048;
					Class163.anInt2308++;
					((Actor) class_r).anInt6463++;
				}
			}
		}
		Class_ds.method2754(Class236.anIntArray3315, 0, Class121.anIntArray1663, Class163.anInt2308 - 1, 0);
	}

	private final void method2979(byte[] is, byte i) {
		try {
			anInt7245++;
			BufferStream stream = new BufferStream(is);
			if (i == 40) {
				for (;;) {
					int i_122_ = stream.readUnsignedByte(255);
					if (i_122_ == 0)
						break;
					if ((i_122_ ^ 0xffffffff) != -2) {
						if (i_122_ != 4) {
							if ((i_122_ ^ 0xffffffff) == -6) {
								int i_123_ = stream.readUnsignedByte(255);
								Class_t_Sub1.f_vc = new int[i_123_];
								for (int i_124_ = 0; ((i_123_ ^ 0xffffffff) < (i_124_ ^ 0xffffffff)); i_124_++) {
									Class_t_Sub1.f_vc[i_124_] = stream.readUnsignedShort((byte) -44);
									if (Class_t_Sub1.f_vc[i_124_] == 65535)
										Class_t_Sub1.f_vc[i_124_] = -1;
								}
							}
						} else {
							int i_125_ = stream.readUnsignedByte(255);
							Class259_Sub2.anIntArray4959 = new int[i_125_];
							for (int i_126_ = 0; i_126_ < i_125_; i_126_++) {
								Class259_Sub2.anIntArray4959[i_126_] = stream.readUnsignedShort((byte) -43);
								if (Class259_Sub2.anIntArray4959[i_126_] == 65535)
									Class259_Sub2.anIntArray4959[i_126_] = -1;
							}
						}
					} else {
						int[] is_127_ = Class246_Sub28_Sub31.anIntArray6913 = new int[6];
						is_127_[0] = stream.readUnsignedShort((byte) -89);
						is_127_[1] = stream.readUnsignedShort((byte) -117);
						is_127_[2] = stream.readUnsignedShort((byte) 116);
						is_127_[3] = stream.readUnsignedShort((byte) -84);
						is_127_[4] = stream.readUnsignedShort((byte) 90);
						is_127_[5] = stream.readUnsignedShort((byte) 106);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("client.KA(" + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2980() {
		for (int i = 0; i < Class38_Sub1_Sub1.anInt6770; i++) {
			int[] is = Class24.anIntArrayArray348[i];
			for (int i_128_ = 0; i_128_ < Class152.anInt2205; i_128_++)
				is[i_128_] = 0;
		}
	}

	private final void method2981(int i) {
		try {
			f_hb++;
			if (!((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591) {
				for (int i_129_ = 0; ((i_129_ ^ 0xffffffff) > (Class246_Sub28_Sub14.anInt6308 ^ 0xffffffff)); i_129_++) {
					if (Class59_Sub2.aClass188Array4544[i_129_].method1236(i ^ 0x5b66) == 's' || (Class59_Sub2.aClass188Array4544[i_129_].method1236(2) ^ 0xffffffff) == -84) {
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591 = true;
						break;
					}
				}
			}
			if (Class_a.loadingStage == 0) {
				Runtime runtime = Runtime.getRuntime();
				int i_130_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
				long l = Class151.time(-101);
				if ((Class59_Sub3_Sub1.aLong5743 ^ 0xffffffffffffffffL) == -1L)
					Class59_Sub3_Sub1.aLong5743 = l;
				if (i_130_ > 16384 && (l - Class59_Sub3_Sub1.aLong5743 ^ 0xffffffffffffffffL) > -5001L) {
					if (l + -Class178.aLong2501 > 1000L) {
						System.gc();
						Class178.aLong2501 = l;
					}
					Class246_Sub1_Sub4.aString5748 = Class58.aClass67_815.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 5;
				} else {
					Class246_Sub1_Sub4.aString5748 = Class246_Sub1_Sub4.aClass67_5753.method436(true, Class_j.anInt1485);
					Class_a.loadingStage = 10;
					Class134.loadingPercentage = 5;
				}
			} else if (Class_a.loadingStage == 10) {
				for (int i_131_ = 0; (i_131_ ^ 0xffffffff) > -5; i_131_++)
					Class95.aClass199Array1235[i_131_] = Class256.method1664((byte) -118, Class152.anInt2205, Class38_Sub1_Sub1.anInt6770);
				Class246_Sub1_Sub4.aString5748 = Class246_Sub1_Sub10.f_ab.method436(true, Class_j.anInt1485);
				Class134.loadingPercentage = 10;
				Class_a.loadingStage = 20;
			} else if (Class_a.loadingStage == 20) {
				if (Class194_Sub1.aClass142_4140 == null)
					Class194_Sub1.aClass142_4140 = new Class142(Class140.aClass242_2036, Class106_Sub2.aClass241_5339);
				if (!Class194_Sub1.aClass142_4140.method955(true)) {
					Class246_Sub1_Sub4.aString5748 = Class246_Sub4.aClass67_3864.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 12;
				} else {
					Class221.index0 = Class142.getFileStore(false, 0, true, 44, 1);
					Class176.index1 = Class142.getFileStore(false, 1, true, i - 23292, 1);
					ISAAC.index2 = Class142.getFileStore(false, 2, true, 93, 1);
					Class138.index3 = Class142.getFileStore(false, 3, true, 58, 1);
					Class246_Sub28_Sub3.index4 = Class142.getFileStore(false, 4, true, 60, 1);
					Class246_Sub7.index5 = Class142.getFileStore(true, 5, true, i ^ 0x5b0d, 1);
					Class21.index6 = Class142.getFileStore(true, 6, false, i ^ 0x5b2f, 1);
					Class199.index7 = Class142.getFileStore(false, 7, true, 62, 1);
					Class210_Sub2.index8 = Class142.getFileStore(false, 8, true, i - 23296, 1);
					Class246_Sub28_Sub16.index9 = Class142.getFileStore(false, 9, true, 89, 1);
					Class48.index10 = Class142.getFileStore(false, 10, true, i - 23321, 1);
					Class153.index11 = Class142.getFileStore(false, 11, true, 56, 1);
					Class246_Sub28_Sub17.index12 = Class142.getFileStore(false, 12, true, 71, 1);
					Class111.index13 = Class142.getFileStore(false, 13, true, 97, 1);
					Class171.index14 = Class142.getFileStore(false, 14, false, i - 23274, 1);
					Class193.index15 = Class142.getFileStore(false, 15, true, 59, 1);
					Class246_Sub40.index16 = Class142.getFileStore(false, 16, true, 102, 1);
					Class110.index17 = Class142.getFileStore(false, 17, true, i - 23322, 1);
					Class214.index18 = Class142.getFileStore(false, 18, true, 91, 1);
					Class219.index19 = Class142.getFileStore(false, 19, true, 121, 1);
					Class218.index20 = Class142.getFileStore(false, 20, true, 99, 1);
					Class246_Sub1_Sub5.index21 = Class142.getFileStore(false, 21, true, i ^ 0x5b37, 1);
					Class59_Sub3_Sub2.index22 = Class142.getFileStore(false, 22, true, 70, 1);
					Class246_Sub16.index23 = Class142.getFileStore(true, 23, true, i - 23309, 1);
					Class38.index24 = Class142.getFileStore(false, 24, true, i - 23269, 1);
					Class82.index25 = Class142.getFileStore(false, 25, true, i ^ 0x5b4f, 1);
					Class246_Sub1_Sub4.index26 = Class142.getFileStore(true, 26, true, 90, 1);
					Class59_Sub3_Sub4.index27 = Class142.getFileStore(false, 27, true, i ^ 0x5b4f, 1);
					Class109_Sub2.index28 = Class142.getFileStore(true, 28, true, 86, 1);
					Class202.index29 = Class142.getFileStore(false, 29, true, 92, 1);
					NativeLibraryManager.nativeLibraryFS = Class142.getFileStore(true, 30, true, 92, 1);
					Class246_Sub1_Sub4.aString5748 = Class174.aClass67_2454.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 15;
					Class_a.loadingStage = 30;
				}
			} else if (Class_a.loadingStage == 30) {
				int i_132_ = 0;
				for (int i_133_ = 0; i_133_ < ClientLoader.MAX_INDEX_COUNT; i_133_++)
					i_132_ += (Class59_Sub1_Sub2.aClass154_Sub1Array6127[i_133_].method2095(-1398) * Class135.f_ab[i_133_] / 100);
				if ((i_132_ ^ 0xffffffff) != -101) {
					if ((i_132_ ^ 0xffffffff) != -1)
						Class246_Sub1_Sub4.aString5748 = (Class246_Sub28_Sub6.aClass67_6041.method436(true, Class_j.anInt1485) + i_132_ + "%");
					Class134.loadingPercentage = 20;
				} else {
					Class246_Sub1_Sub4.aString5748 = Class59_Sub4.aClass67_5182.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 20;
					Class246_Sub28_Sub11.method2583((byte) 80, Class210_Sub2.index8);
					Class246_Sub1_Sub6_Sub2.method2907(Class210_Sub2.index8, 14564);
					Class_a.loadingStage = 40;
				}
			} else if ((Class_a.loadingStage ^ 0xffffffff) == -41) {
				if (!Class109_Sub2.index28.method103(0)) {
					Class246_Sub1_Sub4.aString5748 = (Class24.aClass67_342.method436(true, Class_j.anInt1485) + Class109_Sub2.index28.method99(false) + "%");
					Class134.loadingPercentage = 25;
				} else {
					method2979(Class109_Sub2.index28.method109(1, -1), (byte) 40);
					Class246_Sub1_Sub4.aString5748 = Class232.aClass67_3177.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 25;
					Class_a.loadingStage = 50;
				}
			} else if ((Class_a.loadingStage ^ 0xffffffff) == -51) {
				Class40_Sub3.method1864((byte) 6);
				Class246_Sub1_Sub4.aString5748 = Class169.aClass67_2409.method436(true, Class_j.anInt1485);
				Class134.loadingPercentage = 30;
				Class_a.loadingStage = 60;
			} else if (Class_a.loadingStage == 60) {
				int i_134_ = Class255.method1649((byte) -88, Class111.index13, Class210_Sub2.index8);
				int i_135_ = Class130_Sub1_Sub1.method2882(51);
				if (i_134_ < i_135_) {
					Class246_Sub1_Sub4.aString5748 = (Class85.aClass67_1123.method436(true, Class_j.anInt1485) + 100 * i_134_ / i_135_ + "%");
					Class134.loadingPercentage = 35;
				} else {
					Class246_Sub1_Sub4.aString5748 = Class_c.aClass67_1190.method436(true, Class_j.anInt1485);
					Class_a.loadingStage = 70;
					Class134.loadingPercentage = 35;
				}
			} else if ((Class_a.loadingStage ^ 0xffffffff) == -71) {
				int i_136_ = Class246_Sub28_Sub7.method2557(Class210_Sub2.index8, -125);
				int i_137_ = Class221.method1434(i ^ ~0x5b02);
				if (i_137_ > i_136_) {
					Class246_Sub1_Sub4.aString5748 = (Class200.aClass67_2854.method436(true, Class_j.anInt1485) + i_136_ * 100 / i_137_ + "%");
					Class134.loadingPercentage = 40;
				} else {
					Class246_Sub1_Sub4.aString5748 = Class200.aClass67_2851.method436(true, Class_j.anInt1485);
					Class_a.loadingStage = 80;
					Class134.loadingPercentage = 40;
				}
			} else if (Class_a.loadingStage == 80) {
				if (!Class246_Sub1_Sub4.index26.method103(i ^ 0x5b64)) {
					Class246_Sub1_Sub4.aString5748 = (Class_t_Sub1.f_lc.method436(true, Class_j.anInt1485) + Class246_Sub1_Sub4.index26.method99(false) + "%");
					Class134.loadingPercentage = 45;
				} else {
					Class246_Sub37_Sub1.anInterface6_5910 = new Class74(Class246_Sub1_Sub4.index26, Class246_Sub28_Sub16.index9, Class210_Sub2.index8);
					Class246_Sub1_Sub4.aString5748 = Class188_Sub1.aClass67_3912.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 45;
					Class_a.loadingStage = 1000; // was 90
				}

			} else if (i == 23396) {
				/* Native Library Loading from Index 30 */
				if (Class_a.loadingStage == 1000) {
					NativeLibraryManager.setOSAndArch();
					Class246_Sub1_Sub4.aString5748 = "Loaded native registry.";
					Class134.loadingPercentage = 45;
					Class_a.loadingStage = 1001;
				} else if (Class_a.loadingStage == 1001) {
					int percent = NativeLibraryManager.writeNativeLibrary("jaggl");
					if (percent >= 0 && percent < 100) {
						Class246_Sub1_Sub4.aString5748 = "Loading library JAGGL";
					} else {
						Class246_Sub1_Sub4.aString5748 = "Loaded JAGGL.";
						Class_a.loadingStage = 1002;
					}

				} else if (Class_a.loadingStage == 1002) {
					int percent = NativeLibraryManager.writeNativeLibrary("sw3d");
					if (percent >= 0 && percent < 100) {
						Class246_Sub1_Sub4.aString5748 = "Loading library SW3D";
					} else {
						Class246_Sub1_Sub4.aString5748 = "Loaded SW3D.";
						Class_a.loadingStage = 1003;
					}

				} else if (Class_a.loadingStage == 1003) {
					int percent = NativeLibraryManager.writeNativeLibrary("jaclib");
					if (percent >= 0 && percent < 100) {
						Class246_Sub1_Sub4.aString5748 = "Loading library JACLIB";
					} else {
						Class246_Sub1_Sub4.aString5748 = "Loaded JACLIB.";
						Class_a.loadingStage = 1004;
					}
					if (percent == 100)
						NativeLibraryLoader.loadNative("jaclib");

				} else if (Class_a.loadingStage == 1004) {
					int percent = NativeLibraryManager.writeNativeLibrary("jagmisc");
					if (percent >= 0 && percent < 100) {
						Class246_Sub1_Sub4.aString5748 = "Loading library JAGMISC";
					} else {
						Class246_Sub1_Sub4.aString5748 = "Loaded JAGMISC.";
						Class_a.loadingStage = 90;
					}
					if (percent == 100)
						NativeLibraryLoader.loadNative("jagmisc");

					/* END */
				} else if (Class_a.loadingStage == 90) {
					Class246_Sub1_Sub4.aString5748 = Class133.aClass67_1841.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 50;
					Class_a.loadingStage = 95;
				} else if (Class_a.loadingStage == 95) {
					if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591) {
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt590 = 0;
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt600 = 1;
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt588 = 0;
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt598 = 0;
						((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt581 = 0;
					}
					((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool591 = true;
					Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -128);
					Class251.method1611(-27345, false, (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt598));
					Class246_Sub1_Sub4.aString5748 = Class_ss.aClass67_7057.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 55;
					Class_a.loadingStage = 100;
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -101) {
					Class19.method189(Class246_Sub15.aClass260_4445, Class210_Sub2.index8, 73, Class111.index13);
					Class246_Sub1_Sub4.aString5748 = Class246_Sub31.aClass67_5032.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 60;
					Class99.method622((byte) 32, 5);
					Class_a.loadingStage = 110;
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -111) {
					ISAAC.index2.method103(i - 23396);
					int i_138_ = 0;
					i_138_ += ISAAC.index2.method99(false);
					Class246_Sub40.index16.method103(i - 23396);
					i_138_ += Class246_Sub40.index16.method99(false);
					Class110.index17.method103(0);
					i_138_ += Class110.index17.method99(false);
					Class214.index18.method103(0);
					i_138_ += Class214.index18.method99(false);
					Class219.index19.method103(0);
					i_138_ += Class219.index19.method99(false);
					Class218.index20.method103(0);
					i_138_ += Class218.index20.method99(false);
					Class246_Sub1_Sub5.index21.method103(0);
					i_138_ += Class246_Sub1_Sub5.index21.method99(false);
					Class59_Sub3_Sub2.index22.method103(0);
					i_138_ += Class59_Sub3_Sub2.index22.method99(false);
					Class38.index24.method103(0);
					i_138_ += Class38.index24.method99(false);
					Class82.index25.method103(i - 23396);
					i_138_ += Class82.index25.method99(false);
					Class59_Sub3_Sub4.index27.method103(0);
					i_138_ += Class59_Sub3_Sub4.index27.method99(false);
					Class202.index29.method103(0);
					i_138_ += Class202.index29.method99(false);
					if ((i_138_ ^ 0xffffffff) > -1201) {
						Class246_Sub1_Sub4.aString5748 = (Class59_Sub3_Sub1.aClass67_5728.method436(true, Class_j.anInt1485) + i_138_ / 12 + "%");
						Class134.loadingPercentage = 65;
					} else {
						Class246_Sub1_Sub10.f_eb = new Class163(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class118.aClass_v1641 = new Class_v(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class_fs.aClass156_150 = new Class156(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2, Class210_Sub2.index8);
						Class246_Sub39.aClass141_5487 = new Class141(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, Class110.index17);
						Class82.aClass105_1072 = new Class105(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class246_Sub28_Sub21.aClass175_6587 = new Class175(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class238.aClass92_3358 = new Class92(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2, Class199.index7);
						HashMap.aClass61_774 = new Class61(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class228.aClass189_3132 = new Class189(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class143.aClass251_2067 = new Class251(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, true, Class246_Sub40.index16, Class199.index7);
						Class246_Sub28_Sub30.aClass165_6873 = new Class165(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2, Class210_Sub2.index8);
						Class246_Sub10.aClass254_4084 = new Class254(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2, Class210_Sub2.index8);
						Class179.aClass228_2518 = new Class228(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, true, Class214.index18, Class199.index7);
						Class255.aClass191_3663 = new Class191(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, true, Class246_Sub1_Sub10.f_eb, Class219.index19, Class199.index7);
						Class241.aClass193_3398 = new Class193(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class59_Sub3_Sub3.aClass45_6275 = new Class45(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, Class218.index20, Class221.index0, Class176.index1);
						Class246_Sub31.aClass203_5038 = new Class203(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class246_Sub1_Sub14.aClass214_6597 = new Class214(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class195.aClass177_2745 = new Class177(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, Class246_Sub1_Sub5.index21, Class199.index7);
						Class246_Sub28_Sub25.aClass57_6702 = new Class57(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class246_Sub18.aClass180_4678 = new Class180(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class_c.aClass76_1194 = new Class76(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class246_Sub30_Sub1.aClass17_5761 = new Class17(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, Class59_Sub3_Sub2.index22);
						SubIncomingPacket.aClass209_7085 = new Class209(Class59_Sub4_Sub3.aClass101_6943, Class_j.anInt1485, ISAAC.index2);
						Class253.method1636(-1, Class138.index3, Class111.index13, Class199.index7, Class210_Sub2.index8);
						Class246_Sub1_Sub11.method2614(Class202.index29, 23028);
						Class224.aClass50_3096 = new Class50(Class_j.anInt1485, Class38.index24, Class82.index25);
						Class128_Sub1.aClass65_5558 = new Class65(Class_j.anInt1485, Class38.index24, Class82.index25, new Class114());
						Class246_Sub1_Sub4.aString5748 = Class246_Sub1_Sub4_Sub1.aClass67_7066.method436(true, Class_j.anInt1485);
						Class134.loadingPercentage = 65;
						Class18.method178(i ^ ~0x5b19);
						Class143.aClass251_2067.method1612((byte) 114, !Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 107));
						Class246_Sub28_Sub23.aClass95_6658 = new Class95();
						Class59_Sub1_Sub2.method2571(-7);
						Class211.method1387(-117, Class59_Sub3_Sub4.index27);
						Class147.method998(Class199.index7, (Class246_Sub37_Sub1.anInterface6_5910), (byte) -62);
						Class_a.loadingStage = 120;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -121) {
					int i_139_ = Class259_Sub2.method2148(i ^ 0x5b1d, (Class210_Sub2.index8));
					int i_140_ = Class63_Sub1.method2073(-41);
					if ((i_139_ ^ 0xffffffff) > (i_140_ ^ 0xffffffff)) {
						Class246_Sub1_Sub4.aString5748 = (Class130.aClass67_1814.method436(true, Class_j.anInt1485) + i_139_ * 100 / i_140_ + "%");
						Class134.loadingPercentage = 70;
					} else {
						Class246_Sub28_Sub7.method2556((Class210_Sub2.index8), false, (Class246_Sub15.aClass260_4445));
						Class176.method1158(Class243.aClass_lArray3448, 10);
						Class246_Sub1_Sub4.aString5748 = Class219.aClass67_3038.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 130;
						Class134.loadingPercentage = 70;
					}
				} else if (Class_a.loadingStage == 130) {
					if (!Class48.index10.methodIdk2(0, "", "huffman")) {
						Class246_Sub1_Sub4.aString5748 = Class34.aClass67_450.method436(true, Class_j.anInt1485) + "0%";
						Class134.loadingPercentage = 75;
					} else {
						Class99 class99 = new Class99(Class48.index10.method96("huffman", false, ""));
						Class246_Sub28_Sub15.method2648((byte) -47, class99);
						Class246_Sub1_Sub4.aString5748 = Class130_Sub1.aClass67_3733.method436(true, Class_j.anInt1485);
						Class134.loadingPercentage = 75;
						Class_a.loadingStage = 140;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -141) {
					if (!Class138.index3.method103(0)) {
						Class246_Sub1_Sub4.aString5748 = (Class208.aClass67_2936.method436(true, Class_j.anInt1485) + Class138.index3.method99(false) + "%");
						Class134.loadingPercentage = 80;
					} else {
						Class246_Sub1_Sub4.aString5748 = Class213.aClass67_2979.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 150;
						Class134.loadingPercentage = 80;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -151) {
					if (!Class246_Sub28_Sub17.index12.method103(0)) {
						Class246_Sub1_Sub4.aString5748 = (Class194_Sub1.aClass67_4136.method436(true, Class_j.anInt1485) + Class246_Sub28_Sub17.index12.method99(false) + "%");
						Class134.loadingPercentage = 82;
					} else {
						Class246_Sub1_Sub4.aString5748 = Class223.aClass67_3075.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 160;
						Class134.loadingPercentage = 82;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -161) {
					if (!Class111.index13.method103(i ^ 0x5b64)) {
						Class246_Sub1_Sub4.aString5748 = (Class220.aClass67_3059.method436(true, Class_j.anInt1485) + Class111.index13.method99(false) + "%");
						Class134.loadingPercentage = 85;
					} else {
						Class246_Sub1_Sub4.aString5748 = Class220.aClass67_3059.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 170;
						Class134.loadingPercentage = 85;
					}
				} else if (Class_a.loadingStage == 170) {
					if (!Class246_Sub16.index23.method90(-1, "details")) {
						Class246_Sub1_Sub4.aString5748 = (Class246_Sub1_Sub16.aClass67_6692.method436(true, Class_j.anInt1485) + Class246_Sub16.index23.method100("details", (byte) 33) + "%");
						Class134.loadingPercentage = 87;
					} else {
						Class79.method518(Class246_Sub16.index23, Class82.aClass105_1072, Class246_Sub28_Sub21.aClass175_6587, Class143.aClass251_2067, Class246_Sub28_Sub30.aClass165_6873, Class246_Sub10.aClass254_4084, Class246_Sub28_Sub23.aClass95_6658);
						Class246_Sub1_Sub4.aString5748 = Class140.aClass67_2010.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 180;
						Class134.loadingPercentage = 89;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -181) {
					int i_141_ = Class246_Sub13.method1993(3);
					if (i_141_ == -1) {
						Class246_Sub1_Sub4.aString5748 = Class246_Sub28_Sub25.aClass67_6703.method436(true, Class_j.anInt1485);
						Class134.loadingPercentage = 90;
					} else if ((i_141_ ^ 0xffffffff) == -8 || (i_141_ ^ 0xffffffff) == -10) {
						this.method2937(127, "worldlistfull");
						Class99.method622((byte) 67, 1000);
					} else if (!Class194_Sub1.aBool4139) {
						this.method2937(127, "worldlistio_" + i_141_);
						Class99.method622((byte) -117, 1000);
					} else {
						Class246_Sub1_Sub4.aString5748 = Class59_Sub1_Sub2.aClass67_6128.method436(true, Class_j.anInt1485);
						Class_a.loadingStage = 190;
						Class134.loadingPercentage = 90;
					}
				} else if ((Class_a.loadingStage ^ 0xffffffff) == -191) {
					Class142.aStringArray2062 = new String[((Class180) (Class246_Sub18.aClass180_4678)).anInt2526];
					Class59_Sub3_Sub1.aBoolArray5739 = (new boolean[((Class76) Class_c.aClass76_1194).anInt991]);
					Class246_Sub1_Sub11.anIntArray6246 = new int[((Class76) Class_c.aClass76_1194).anInt991];
					for (int i_142_ = 0; ((i_142_ ^ 0xffffffff) > (((Class76) Class_c.aClass76_1194).anInt991 ^ 0xffffffff)); i_142_++) {
						if ((((Class225) Class_c.aClass76_1194.method477(125, i_142_)).anInt3105 ^ 0xffffffff) == -1) {
							Class59_Sub3_Sub1.aBoolArray5739[i_142_] = true;
							Class144.anInt2085++;
						}
						Class246_Sub1_Sub11.anIntArray6246[i_142_] = -1;
					}
					Class123.method834((byte) 14);
					Class136.anInt1945 = Class138.index3.method86("loginscreen", (byte) -112);
					Class246_Sub7.index5.method115(false, 4, true);
					Class21.index6.method115(true, 4, true);
					Class210_Sub2.index8.method115(true, 4, true);
					Class111.index13.method115(true, 4, true);
					Class48.index10.method115(true, 4, true);
					Class138.index3.method115(true, 4, true);
					((Class_fs) ISAAC.index2).anInt126 = 2;
					Class4.aBool52 = true;
					((Class_fs) Class110.index17).anInt126 = 2;
					((Class_fs) Class246_Sub40.index16).anInt126 = 2;
					((Class_fs) Class214.index18).anInt126 = 2;
					((Class_fs) Class219.index19).anInt126 = 2;
					((Class_fs) Class218.index20).anInt126 = 2;
					((Class_fs) Class246_Sub1_Sub5.index21).anInt126 = 2;
					Class100.method629((((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt600), -1, -1, false, false);
					Class246_Sub1_Sub4.aString5748 = Class35.aClass67_468.method436(true, Class_j.anInt1485);
					Class134.loadingPercentage = 95;
					Class_a.loadingStage = 200;
				} else if (Class_a.loadingStage == 200)
					Class259_Sub3_Sub1.method2840(true, 68);
			}
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "client.PA(" + i + ')');
		}
	}

	static final void method2982() {
		int i = Class246_Sub4.anInt3869;
		int[] is = Class53.anIntArray755;
		boolean bool = ((((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580 == 1) && i > 200 || (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).anInt580 == 0) && i > 50);
		for (int i_143_ = 0; i_143_ < i; i_143_++) {
			Player class_r_sub1 = Class143.aClass_r_Sub1Array2069[is[i_143_]];
			if (!class_r_sub1.method2912(109))
				((Actor) class_r_sub1).anInt6431 = -1;
			else {
				class_r_sub1.method2172(11264);
				if (((Class59_Sub3) class_r_sub1).aShort5057 < 0 || ((Class59_Sub3) class_r_sub1).aShort5064 < 0 || (((Class59_Sub3) class_r_sub1).aShort5065 >= Class38_Sub1_Sub1.anInt6770) || (((Class59_Sub3) class_r_sub1).aShort5062 >= Class152.anInt2205))
					((Actor) class_r_sub1).anInt6431 = -1;
				else {
					((Player) class_r_sub1).f_ld = ((Actor) class_r_sub1).aBool6450 ? bool : false;
					if (class_r_sub1 == Class_a.aClass_r_Sub1_1180)
						((Actor) class_r_sub1).anInt6431 = 2147483647;
					else {
						int i_144_ = 0;
						if (!((Actor) class_r_sub1).aBool6441)
							i_144_++;
						if (((Actor) class_r_sub1).anInt6464 > Class246_Sub1_Sub4.anInt5752)
							i_144_ += 2;
						i_144_ += 5 - class_r_sub1.method2670((byte) 127) << 2;
						if (((Player) class_r_sub1).aBool7129)
							i_144_ += 512;
						else {
							if (Class144.anInt2074 == 0)
								i_144_ += 32;
							else
								i_144_ += 128;
							i_144_ += 256;
						}
						((Actor) class_r_sub1).anInt6431 = i_144_ + 1;
					}
				}
			}
		}
		for (int i_145_ = 0; i_145_ < Class5.anInt55; i_145_++) {
			Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_145_]]);
			if (!class_r_sub2.method2930(113) || !(((Npc) class_r_sub2).aClass253_7184.method1622(Class246_Sub28_Sub23.aClass95_6658, -14095)))
				((Actor) class_r_sub2).anInt6431 = -1;
			else {
				class_r_sub2.method2172(11264);
				if (((Class59_Sub3) class_r_sub2).aShort5057 < 0 || ((Class59_Sub3) class_r_sub2).aShort5064 < 0 || (((Class59_Sub3) class_r_sub2).aShort5065 >= Class38_Sub1_Sub1.anInt6770) || (((Class59_Sub3) class_r_sub2).aShort5062 >= Class152.anInt2205))
					((Actor) class_r_sub2).anInt6431 = -1;
				else {
					int i_146_ = 0;
					if (!((Actor) class_r_sub2).aBool6441)
						i_146_++;
					if (((Actor) class_r_sub2).anInt6464 > Class246_Sub1_Sub4.anInt5752)
						i_146_ += 2;
					i_146_ += 5 - class_r_sub2.method2670((byte) 127) << 2;
					if (Class144.anInt2074 == 0) {
						if (((Class253) ((Npc) class_r_sub2).aClass253_7184).f_vb)
							i_146_ += 64;
						else
							i_146_ += 128;
					} else if (Class144.anInt2074 == 1) {
						if (((Class253) ((Npc) class_r_sub2).aClass253_7184).f_vb)
							i_146_ += 32;
						else
							i_146_ += 64;
					}
					if (((Class253) ((Npc) class_r_sub2).aClass253_7184).aBool3581)
						i_146_ += 1024;
					else if (!((Class253) (((Npc) class_r_sub2).aClass253_7184)).aBool3571)
						i_146_ += 256;
					((Actor) class_r_sub2).anInt6431 = i_146_ + 1;
				}
			}
		}
		for (int i_147_ = 0; i_147_ < Class166.aClass29Array2347.length; i_147_++) {
			Class29 class29 = Class166.aClass29Array2347[i_147_];
			if (class29 != null) {
				if (((Class29) class29).anInt391 == 1) {
					Npc class_r_sub2 = (Class76.aClass_r_Sub2Array1002[((Class29) class29).anInt384]);
					if (class_r_sub2 != null && ((Actor) class_r_sub2).anInt6431 >= 0)
						((Actor) class_r_sub2).anInt6431 += 2048;
				} else if (((Class29) class29).anInt391 == 10) {
					Player class_r_sub1 = (Class143.aClass_r_Sub1Array2069[((Class29) class29).anInt384]);
					if (class_r_sub1 != null && class_r_sub1 != Class_a.aClass_r_Sub1_1180 && ((Actor) class_r_sub1).anInt6431 >= 0)
						((Actor) class_r_sub1).anInt6431 += 2048;
				}
			}
		}
	}

	private final void method2983(byte i) {
		do {
			try {
				anInt7246++;
				boolean bool = Class140.aClass242_2036.method1557(-118);
				if (i < -30) {
					if (bool)
						break;
					method2964(3000);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "client.DA(" + i + ')');
			}
			break;
		} while (false);
	}
}
