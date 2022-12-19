
/* Class246_Sub28_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class Class246_Sub28_Sub18 extends Class246_Sub28 {
	private int anInt6511 = 4096;
	static int anInt6512;
	private int anInt6513 = 4096;
	static int anInt6514;
	static int anInt6515;
	static int anInt6516;
	static int anInt6517 = 0;
	private int anInt6518 = 4096;

	static final void method2688(byte i) {
		try {
			anInt6512++;
			if ((Class_q_Sub1.anInt6670 ^ 0xffffffff) > -103)
				Class_q_Sub1.anInt6670 += 6;
			if ((Class246_Sub41.anInt5531 ^ 0xffffffff) != -1) {
				Class91.anInt1188 -= 5 * Class246_Sub41.anInt5531;
				if ((Class59_Sub2_Sub2.anInt6018 ^ 0xffffffff) >= (Class91.anInt1188 ^ 0xffffffff))
					Class91.anInt1188 = -1 + Class59_Sub2_Sub2.anInt6018;
				Class246_Sub41.anInt5531 = 0;
				if (Class91.anInt1188 < 0)
					Class91.anInt1188 = 0;
			}
			for (int i_0_ = 0; ((Class246_Sub28_Sub14.anInt6308 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
				int i_1_ = Class59_Sub2.aClass188Array4544[i_0_].method1233((byte) 126);
				char c = Class59_Sub2.aClass188Array4544[i_0_].method1236(2);
				if (i_1_ != 84) {
					if (Class216.aClass232_3009.method1488(-120, 82) && i_1_ == 66) {
						if (Class246_Sub28_Sub30.aClipboard6876 != null) {
							String string = "";
							for (int i_2_ = -1 + Class55.aStringArray786.length; i_2_ >= 0; i_2_--) {
								if (Class55.aStringArray786[i_2_] != null && (Class55.aStringArray786[i_2_].length() ^ 0xffffffff) < -1)
									string += (Class55.aStringArray786[i_2_] + '\n');
							}
							Class246_Sub28_Sub30.aClipboard6876.setContents(new StringSelection(string), null);
						}
					} else if (!Class216.aClass232_3009.method1488(-114, 82) || i_1_ != 67) {
						if (i_1_ == 85 && (Class246_Sub1_Sub14.anInt6596 ^ 0xffffffff) < -1) {
							Class246_Sub14.aString4438 = ((Class246_Sub14.aString4438.substring(0, -1 + Class246_Sub1_Sub14.anInt6596)) + (Class246_Sub14.aString4438.substring(Class246_Sub1_Sub14.anInt6596)));
							Class246_Sub1_Sub14.anInt6596--;
						} else if ((i_1_ ^ 0xffffffff) == -102 && (Class246_Sub1_Sub14.anInt6596 < Class246_Sub14.aString4438.length()))
							Class246_Sub14.aString4438 = ((Class246_Sub14.aString4438.substring(0, Class246_Sub1_Sub14.anInt6596)) + (Class246_Sub14.aString4438.substring(Class246_Sub1_Sub14.anInt6596 + 1)));
						else if (i_1_ != 96 || (Class246_Sub1_Sub14.anInt6596 ^ 0xffffffff) >= -1) {
							if (i_1_ != 97 || ((Class246_Sub1_Sub14.anInt6596 ^ 0xffffffff) <= (Class246_Sub14.aString4438.length() ^ 0xffffffff))) {
								if ((i_1_ ^ 0xffffffff) != -103) {
									if ((i_1_ ^ 0xffffffff) == -104)
										Class246_Sub1_Sub14.anInt6596 = Class246_Sub14.aString4438.length();
									else if (i_1_ != 104 || ((Class59.anInt823 ^ 0xffffffff) <= ((Class55.aStringArray786).length ^ 0xffffffff))) {
										if (i_1_ != 105 || ((Class59.anInt823 ^ 0xffffffff) >= -1)) {
											if (Class246_Sub1_Sub13.method2700(-127, c) || c == 58 || (c ^ 0xffffffff) == -45 || c == 32 || (c ^ 0xffffffff) == -96 || c == 45 || (c ^ 0xffffffff) == -44 || (c ^ 0xffffffff) == -92 || (c ^ 0xffffffff) == -94) {
												Class246_Sub14.aString4438 = ((Class246_Sub14.aString4438.substring(0, (Class246_Sub1_Sub14.anInt6596))) + Class59_Sub2.aClass188Array4544[i_0_].method1236(2) + (Class246_Sub14.aString4438.substring(Class246_Sub1_Sub14.anInt6596)));
												Class246_Sub1_Sub14.anInt6596++;
											}
										} else {
											Class59.anInt823--;
											Class260.method1711(0);
											Class246_Sub1_Sub14.anInt6596 = Class246_Sub14.aString4438.length();
										}
									} else {
										Class59.anInt823++;
										Class260.method1711(0);
										Class246_Sub1_Sub14.anInt6596 = Class246_Sub14.aString4438.length();
									}
								} else
									Class246_Sub1_Sub14.anInt6596 = 0;
							} else
								Class246_Sub1_Sub14.anInt6596++;
						} else
							Class246_Sub1_Sub14.anInt6596--;
					} else if (Class246_Sub28_Sub30.aClipboard6876 != null) {
						Transferable transferable = Class246_Sub28_Sub30.aClipboard6876.getContents(null);
						if (transferable != null) {
							try {
								String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
								if (string != null) {
									String[] strings = Class60.method412((byte) -87, string, '\n');
									if (strings.length <= 1)
										Class246_Sub14.aString4438 += (String) string;
									else {
										for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (strings.length ^ 0xffffffff)); i_3_++) {
											Class246_Sub14.aString4438 = strings[i_3_];
											Class36.method254(126);
										}
									}
								}
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				} else
					Class36.method254(122);
			}
			Class246_Sub28_Sub14.anInt6308 = 0;
			if (i >= 106)
				Class205.method1341(-11712);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kp.A(" + i + ')');
		}
	}

	public Class246_Sub28_Sub18() {
		super(1, false);
	}

	final void method2143(int i, int i_4_, BufferStream stream) {
		try {
			int i_5_ = i_4_;
			while_127_: do {
				do {
					if (i_5_ != 0) {
						if (i_5_ != 1) {
							if (i_5_ == 2)
								break;
							break while_127_;
						}
					} else {
						anInt6511 = stream.readUnsignedShort((byte) -120);
						break while_127_;
					}
					anInt6518 = stream.readUnsignedShort((byte) -36);
					break while_127_;
				} while (false);
				anInt6513 = stream.readUnsignedShort((byte) -87);
			} while (false);
			if (i != 4)
				method2143(-10, -44, null);
			anInt6514++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("kp.G(" + i + ',' + i_4_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method2139(byte i, int i_6_) {
		try {
			if (i <= 33)
				method2139((byte) 76, -49);
			anInt6516++;
			int[][] is = ((Class246_Sub28) this).aClass136_4933.method922((byte) 18, i_6_);
			if (((Class136) ((Class246_Sub28) this).aClass136_4933).aBool1946) {
				int[][] is_7_ = this.method2141(3, 0, i_6_);
				int[] is_8_ = is_7_[0];
				int[] is_9_ = is_7_[1];
				int[] is_10_ = is_7_[2];
				int[] is_11_ = is[0];
				int[] is_12_ = is[1];
				int[] is_13_ = is[2];
				for (int i_14_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
					int i_15_ = is_8_[i_14_];
					int i_16_ = is_10_[i_14_];
					int i_17_ = is_9_[i_14_];
					if (i_16_ != i_15_ || i_17_ != i_16_) {
						is_11_[i_14_] = anInt6511;
						is_12_[i_14_] = anInt6518;
						is_13_[i_14_] = anInt6513;
					} else {
						is_11_[i_14_] = i_15_ * anInt6511 >> 12;
						is_12_[i_14_] = anInt6518 * i_16_ >> 12;
						is_13_[i_14_] = i_17_ * anInt6513 >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "kp.J(" + i + ',' + i_6_ + ')');
		}
	}
}
