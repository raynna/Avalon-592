/* Class154_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154_Sub1 extends Class154 {
	static int anInt4776;
	static int anInt4777;
	static int anInt4778;
	private int anInt4779;
	private Class208 aClass208_4780;
	private Class208 aClass208_4781;
	private int anInt4782;
	private int anInt4783;
	private Class242 aClass242_4784;
	static int anInt4785;
	private byte[] aByteArray4786;
	private Class85 aClass85_4787;
	static int anInt4788;
	static int anInt4789;
	static int[] anIntArray4790 = new int[1];
	static int anInt4791;
	private Class195 aClass195_4792;
	static int anInt4793;
	static int anInt4794;
	private int anInt4795 = 0;
	private Class246_Sub1_Sub6 aClass246_Sub1_Sub6_4796;
	static int anInt4797;
	static int anInt4798;
	static int anInt4799;
	private Class241 aClass241_4800;
	static int anInt4801;
	private boolean aBool4802;
	static int anInt4803;
	private boolean aBool4804;
	private Class166 aClass166_4805;
	private Class166 aClass166_4806;
	static int anInt4807;
	private int anInt4808;
	private boolean aBool4809;
	private long aLong4810;

	final int method2087(byte i) {
		try {
			anInt4798++;
			if (aClass195_4792 == null)
				return 0;
			int i_0_ = 77 % ((29 - i) / 35);
			return ((Class195) aClass195_4792).anInt2728;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.G(" + i + ')');
		}
	}

	private final Class246_Sub1_Sub6 method2088(int i, int i_1_, int i_2_) {
		try {
			anInt4777++;
			Class246_Sub1_Sub6 class246_sub1_sub6 = ((Class246_Sub1_Sub6) aClass85_4787.method544((long) i_2_, 124));
			if (class246_sub1_sub6 != null && (i ^ 0xffffffff) == -1 && !((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964 && ((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5960) {
				class246_sub1_sub6.unlink((byte) -46);
				class246_sub1_sub6 = null;
			}
			if (i_1_ <= 24)
				return null;
			if (class246_sub1_sub6 == null) {
				if ((i ^ 0xffffffff) == -1) {
					if (aClass208_4780 != null && aByteArray4786[i_2_] != -1)
						class246_sub1_sub6 = aClass241_4800.method1539(aClass208_4780, -20214, i_2_);
					else {
						if (aClass242_4784.method1549(0))
							return null;
						class246_sub1_sub6 = aClass242_4784.method1554(anInt4782, (byte) 2, (byte) 66, true, i_2_);
					}
				} else if (i == 1) {
					if (aClass208_4780 == null)
						throw new RuntimeException();
					class246_sub1_sub6 = aClass241_4800.method1538(-1, aClass208_4780, i_2_);
				} else {
					if ((i ^ 0xffffffff) != -3)
						throw new RuntimeException();
					if (aClass208_4780 == null)
						throw new RuntimeException();
					if ((aByteArray4786[i_2_] ^ 0xffffffff) != 0)
						throw new RuntimeException();
					if (aClass242_4784.method1561((byte) -46))
						return null;
					class246_sub1_sub6 = aClass242_4784.method1554(anInt4782, (byte) 2, (byte) -94, false, i_2_);
				}
				aClass85_4787.method547((long) i_2_, -2301, class246_sub1_sub6);
			}
			if (((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5960)
				return null;
			byte[] is = class246_sub1_sub6.method2534(false);
			if (!(class246_sub1_sub6 instanceof Class246_Sub1_Sub6_Sub2)) {
				try {
					if (is == null || is.length <= 2)
						throw new RuntimeException();
					Class177.aCRC32_2496.reset();
					Class177.aCRC32_2496.update(is, 0, is.length - 2);
					int i_3_ = (int) Class177.aCRC32_2496.getValue();
					if ((i_3_ ^ 0xffffffff) != (((Class195) aClass195_4792).anIntArray2730[i_2_] ^ 0xffffffff))
						throw new RuntimeException();
					((Class242) aClass242_4784).anInt3434 = 0;
					((Class242) aClass242_4784).anInt3436 = 0;
				} catch (RuntimeException runtimeexception) {
					aClass242_4784.method1553((byte) 87);
					class246_sub1_sub6.unlink((byte) 96);
					if (((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964 && !aClass242_4784.method1549(0)) {
						SubIncomingPacket class246_sub1_sub6_sub1 = aClass242_4784.method1554(anInt4782, (byte) 2, (byte) -57, true, i_2_);
						aClass85_4787.method547((long) i_2_, -2301, class246_sub1_sub6_sub1);
					}
					return null;
				}
				is[is.length - 2] = (byte) (((Class195) aClass195_4792).anIntArray2729[i_2_] >>> 8);
				is[-1 + is.length] = (byte) ((Class195) aClass195_4792).anIntArray2729[i_2_];
				if (aClass208_4780 != null) {
					aClass241_4800.method1542(5, i_2_, is, aClass208_4780);
					if (aByteArray4786[i_2_] != 1) {
						anInt4795++;
						aByteArray4786[i_2_] = (byte) 1;
					}
				}
				if (!((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964)
					class246_sub1_sub6.unlink((byte) -88);
				return class246_sub1_sub6;
			}
			try {
				if (is == null || (is.length ^ 0xffffffff) >= -3)
					throw new RuntimeException();
				Class177.aCRC32_2496.reset();
				Class177.aCRC32_2496.update(is, 0, is.length - 2);
				int i_4_ = (int) Class177.aCRC32_2496.getValue();
				if ((((Class195) aClass195_4792).anIntArray2730[i_2_] ^ 0xffffffff) != (i_4_ ^ 0xffffffff))
					throw new RuntimeException();
				int i_5_ = ((is[is.length - 2] << 8 & 0xff00) + (is[-1 + is.length] & 0xff));
				if (i_5_ != (0xffff & ((Class195) aClass195_4792).anIntArray2729[i_2_]))
					throw new RuntimeException();
				if ((aByteArray4786[i_2_] ^ 0xffffffff) != -2) {
					anInt4795++;
					aByteArray4786[i_2_] = (byte) 1;
				}
				if (!((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964)
					class246_sub1_sub6.unlink((byte) 118);
				return class246_sub1_sub6;
			} catch (Exception exception) {
				aByteArray4786[i_2_] = (byte) -1;
				class246_sub1_sub6.unlink((byte) -57);
				if (((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964 && !aClass242_4784.method1549(0)) {
					SubIncomingPacket class246_sub1_sub6_sub1 = aClass242_4784.method1554(anInt4782, (byte) 2, (byte) -124, true, i_2_);
					aClass85_4787.method547((long) i_2_, -2301, class246_sub1_sub6_sub1);
				}
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lv.F(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method2089(int i) {
		do {
			try {
				int i_6_ = -118 % ((i - 75) / 51);
				anInt4793++;
				if (Class109_Sub4.anInt4566 < 0)
					break;
				long l = Class151.time(-60);
				Class109_Sub4.anInt4566 -= -Class253.f_nb + l;
				do {
					if (Class109_Sub4.anInt4566 <= 0) {
						Node.aFloat3470 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1980);
						Class195.anInt2731 = (((Class138) Class40_Sub9.aClass138_5495).anInt1973);
						Class3.anInt29 = (((Class138) Class40_Sub9.aClass138_5495).anInt1978);
						Class_u.aClass211_4701 = (((Class138) Class40_Sub9.aClass138_5495).aClass211_1974);
						Class259_Sub3_Sub1.aFloat6901 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1963);
						Class193.aFloat2718 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1975);
						Class126.aFloat1782 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1966);
						Class222.anInt3069 = (((Class138) Class40_Sub9.aClass138_5495).anInt1970);
						Class109_Sub4.anInt4566 = -1;
						Class246_Sub28_Sub19.aFloat6549 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1972);
						Class31.aFloat420 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1969);
						if (!client.f_ob)
							break;
					}
					int i_7_ = (Class109_Sub4.anInt4566 << 8) / Class220.anInt3055;
					int i_8_ = 255 + -i_7_;
					float f = (float) i_7_ / 255.0F;
					Class222.anInt3069 = ((0xff0000 & (i_8_ * (0xff00 & (((Class138) Class40_Sub9.aClass138_5495).anInt1970)) + i_7_ * (OutputStream_Sub1.anInt4490 & 0xff00))) + (~0xff00ff & (((((Class138) Class40_Sub9.aClass138_5495).anInt1970) & 0xff00ff) * i_8_ + ((0xff00ff & OutputStream_Sub1.anInt4490) * i_7_)))) >>> 8;
					float f_9_ = -f + 1.0F;
					Class193.aFloat2718 = (Class246_Sub1_Sub15_Sub2.aFloat7083 + ((((Class138) Class40_Sub9.aClass138_5495).aFloat1975) - Class246_Sub1_Sub15_Sub2.aFloat7083) * f_9_);
					Class3.anInt29 = (i_7_ * Player.f_od + i_8_ * (((Class138) Class40_Sub9.aClass138_5495).anInt1978)) >> 8;
					Class126.aFloat1782 = (Canvas_Sub1.aFloat6895 + ((((Class138) Class40_Sub9.aClass138_5495).aFloat1966) - Canvas_Sub1.aFloat6895) * f_9_);
					Class195.anInt2731 = ((0xff0000 & ((Class19.anInt313 & 0xff00) * i_7_ + (0xff00 & (((Class138) Class40_Sub9.aClass138_5495).anInt1973)) * i_8_)) + (~0xff00ff & ((Class19.anInt313 & 0xff00ff) * i_7_ - -((0xff00ff & (((Class138) Class40_Sub9.aClass138_5495).anInt1973)) * i_8_)))) >>> 8;
					Class246_Sub28_Sub19.aFloat6549 = f_9_ * ((((Class138) Class40_Sub9.aClass138_5495).aFloat1972) - Class56.aFloat790) + Class56.aFloat790;
					Class259_Sub3_Sub1.aFloat6901 = (Class39_Sub1.aFloat4668 + ((((Class138) Class40_Sub9.aClass138_5495).aFloat1963) - Class39_Sub1.aFloat4668) * f_9_);
					Node.aFloat3470 = (Class122.aFloat1686 + f_9_ * ((((Class138) Class40_Sub9.aClass138_5495).aFloat1980) - Class122.aFloat1686));
					Class31.aFloat420 = (((Class138) Class40_Sub9.aClass138_5495).aFloat1969 - Class165.aFloat2339) * f_9_ + Class165.aFloat2339;
					if (Class210_Sub2.aClass211_5015 != (((Class138) Class40_Sub9.aClass138_5495).aClass211_1974))
						Class_u.aClass211_4701 = (Class33.aClass260_444.method1739(Class210_Sub2.aClass211_5015, (((Class138) Class40_Sub9.aClass138_5495).aClass211_1974), f_9_, Class_u.aClass211_4701));
				} while (false);
				Class253.f_nb = l;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lv.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final byte[] method1023(int i, int i_10_) {
		try {
			if (i <= 45)
				method2087((byte) -86);
			anInt4785++;
			Class246_Sub1_Sub6 class246_sub1_sub6 = method2088(0, 86, i_10_);
			if (class246_sub1_sub6 == null)
				return null;
			byte[] is = class246_sub1_sub6.method2534(false);
			class246_sub1_sub6.unlink((byte) -31);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.L(" + i + ',' + i_10_ + ')');
		}
	}

	final void method2090(int i) {
		do {
			try {
				anInt4789++;
				if (aClass166_4806 != null) {
					if (method1021((byte) -111) == null)
						break;
					if (!aBool4802) {
						if (aBool4804) {
							boolean bool = true;
							for (Node class246 = aClass166_4806.method1104(i - 23627); class246 != null; class246 = aClass166_4806.method1108((byte) -112)) {
								int i_11_ = (int) ((Node) class246).hash;
								if ((aByteArray4786[i_11_] ^ 0xffffffff) != -2)
									method2088(2, i - 23651, i_11_);
								if ((aByteArray4786[i_11_] ^ 0xffffffff) != -2)
									bool = false;
								else
									class246.unlink((byte) -51);
							}
							while (anInt4808 < (((Class195) aClass195_4792).anIntArray2726).length) {
								if ((((Class195) aClass195_4792).anIntArray2726[anInt4808]) == 0)
									anInt4808++;
								else {
									if (aClass242_4784.method1561((byte) -46)) {
										bool = false;
										break;
									}
									if ((aByteArray4786[anInt4808] ^ 0xffffffff) != -2)
										method2088(2, 83, anInt4808);
									if ((aByteArray4786[anInt4808] ^ 0xffffffff) != -2) {
										Node class246 = new Node();
										((Node) class246).hash = (long) anInt4808;
										bool = false;
										aClass166_4806.method1101(false, class246);
									}
									anInt4808++;
								}
							}
							if (bool) {
								anInt4808 = 0;
								aBool4804 = false;
							}
						} else
							aClass166_4806 = null;
					} else {
						boolean bool = true;
						for (Node class246 = aClass166_4806.method1104(i ^ 0x5cf7); class246 != null; class246 = aClass166_4806.method1108((byte) -112)) {
							int i_12_ = (int) ((Node) class246).hash;
							if ((aByteArray4786[i_12_] ^ 0xffffffff) == -1)
								method2088(1, 98, i_12_);
							if (aByteArray4786[i_12_] == 0)
								bool = false;
							else
								class246.unlink((byte) 121);
						}
						while ((anInt4808 ^ 0xffffffff) > ((((Class195) aClass195_4792).anIntArray2726).length ^ 0xffffffff)) {
							if ((((Class195) aClass195_4792).anIntArray2726[anInt4808]) == 0)
								anInt4808++;
							else {
								if (((Class241) aClass241_4800).anInt3406 >= 250) {
									bool = false;
									break;
								}
								if (aByteArray4786[anInt4808] == 0)
									method2088(1, 86, anInt4808);
								if (aByteArray4786[anInt4808] == 0) {
									Node class246 = new Node();
									((Node) class246).hash = (long) anInt4808;
									bool = false;
									aClass166_4806.method1101(false, class246);
								}
								anInt4808++;
							}
						}
						if (bool) {
							anInt4808 = 0;
							aBool4802 = false;
						}
					}
				}
				if (i != 23747)
					method2088(102, -17, 93);
				if (!aBool4809 || aLong4810 > Class151.time(-82))
					break;
				for (Class246_Sub1_Sub6 class246_sub1_sub6 = ((Class246_Sub1_Sub6) aClass85_4787.first((byte) -23)); class246_sub1_sub6 != null; class246_sub1_sub6 = ((Class246_Sub1_Sub6) aClass85_4787.next((byte) -20))) {
					if (!((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5960) {
						if (((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5961) {
							if (!((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5964)
								throw new RuntimeException();
							class246_sub1_sub6.unlink((byte) 122);
						} else
							((Class246_Sub1_Sub6) class246_sub1_sub6).aBool5961 = true;
					}
				}
				aLong4810 = Class151.time(-122) + 1000L;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lv.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2091(boolean bool) {
		try {
			anInt4794++;
			if (bool != false)
				return -119;
			if (aClass195_4792 == null)
				return 0;
			if (!aBool4802)
				return ((Class195) aClass195_4792).anInt2728;
			Node class246 = aClass166_4806.method1104(43);
			if (class246 == null)
				return 0;
			return (int) ((Node) class246).hash;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.I(" + bool + ')');
		}
	}

	final int method1022(int i, byte i_13_) {
		try {
			anInt4801++;
			Class246_Sub1_Sub6 class246_sub1_sub6 = (Class246_Sub1_Sub6) aClass85_4787.method544((long) i, 125);
			if (i_13_ <= 113)
				method2089(117);
			if (class246_sub1_sub6 != null)
				return class246_sub1_sub6.method2533(81);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.E(" + i + ',' + i_13_ + ')');
		}
	}

	final void method2092(byte i) {
		try {
			anInt4799++;
			if (aClass166_4806 != null && method1021((byte) -120) != null && i <= -85) {
				for (Node class246 = aClass166_4805.method1104(68); class246 != null; class246 = aClass166_4805.method1108((byte) -112)) {
					int i_14_ = (int) ((Node) class246).hash;
					if (i_14_ < 0 || i_14_ >= ((Class195) aClass195_4792).anInt2738 || (((Class195) aClass195_4792).anIntArray2726[i_14_] ^ 0xffffffff) == -1)
						class246.unlink((byte) -60);
					else {
						if (aByteArray4786[i_14_] == 0)
							method2088(1, 123, i_14_);
						if ((aByteArray4786[i_14_] ^ 0xffffffff) == 0)
							method2088(2, 34, i_14_);
						if ((aByteArray4786[i_14_] ^ 0xffffffff) == -2)
							class246.unlink((byte) -36);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.N(" + i + ')');
		}
	}

	static final void method2093(Class255_Sub1 class255_sub1, byte[][] is, int i) {
		try {
			anInt4788++;
			int[] is_15_ = { -1, 0, 0, 0, 0 };
			int i_16_ = is.length;
			for (int i_17_ = 0; (i_16_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				byte[] is_18_ = is[i_17_];
				if (is_18_ != null) {
					BufferStream stream = new BufferStream(is_18_);
					int i_19_ = Class168.anIntArray2398[i_17_] >> 8;
					int i_20_ = 0xff & Class168.anIntArray2398[i_17_];
					int i_21_ = -Class39_Sub1.anInt4670 + i_19_ * 64;
					int i_22_ = i_20_ * 64 - Class47.anInt686;
					Class85.method545((byte) -109);
					class255_sub1.method1651(-115, Class39_Sub1.anInt4670, Class47.anInt686, stream, i_21_, Class95.aClass199Array1235, i_22_);
					class255_sub1.method2336(0, is_15_, i_22_, Class246_Sub15.aClass260_4445, i_21_, stream);
					if (!((Class255) class255_sub1).aBool3658 && (i_19_ ^ 0xffffffff) == (Class92.anInt1206 / 8 ^ 0xffffffff) && (i_20_ ^ 0xffffffff) == (Class130_Sub8.anInt5618 / 8 ^ 0xffffffff) && (is_15_[0] ^ 0xffffffff) != 0) {
						Class_u_Sub1.aClass230_5685 = (Class246_Sub31.aClass203_5038.method1335(is_15_[1], is_15_[0], 120, is_15_[2], is_15_[3], Class246_Sub1_Sub14.aClass214_6597));
						Class246_Sub28_Sub8.anInt6076 = is_15_[4];
					}
				}
			}
			if (i == -32652) {
				for (int i_23_ = 0; i_16_ > i_23_; i_23_++) {
					int i_24_ = (-Class39_Sub1.anInt4670 + (Class168.anIntArray2398[i_23_] >> 8) * 64);
					int i_25_ = (-Class47.anInt686 + (Class168.anIntArray2398[i_23_] & 0xff) * 64);
					byte[] is_26_ = is[i_23_];
					if (is_26_ == null && Class130_Sub8.anInt5618 < 800) {
						Class85.method545((byte) -109);
						class255_sub1.method1647(i_24_, i ^ ~0x7f6f, i_25_, 64, 64);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("lv.O(" + (class255_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2094(int i) {
		try {
			if (i != 0)
				anInt4803 = -59;
			anIntArray4790 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.J(" + i + ')');
		}
	}

	final int method2095(int i) {
		try {
			if (i != -1398)
				anIntArray4790 = null;
			anInt4776++;
			if (method1021((byte) -114) == null) {
				if (aClass246_Sub1_Sub6_4796 == null)
					return 0;
				return aClass246_Sub1_Sub6_4796.method2533(43);
			}
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.M(" + i + ')');
		}
	}

	final void method1019(int i, int i_27_) {
		try {
			anInt4797++;
			if (aClass208_4780 != null) {
				for (Node class246 = aClass166_4805.method1104(61); class246 != null; class246 = aClass166_4805.method1108((byte) -112)) {
					if ((((Node) class246).hash ^ 0xffffffffffffffffL) == ((long) i ^ 0xffffffffffffffffL))
						return;
				}
				if (i_27_ != 0)
					aClass195_4792 = null;
				Node class246 = new Node();
				((Node) class246).hash = (long) i;
				aClass166_4805.method1101(false, class246);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.A(" + i + ',' + i_27_ + ')');
		}
	}

	final void method2096(byte i) {
		do {
			try {
				if (i > 1) {
					anInt4791++;
					if (aClass208_4780 != null) {
						aBool4804 = true;
						if (aClass166_4806 != null)
							break;
						aClass166_4806 = new Class166();
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "lv.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method2097(int i) {
		try {
			anInt4778++;
			if (i >= -94)
				method1023(124, 35);
			return anInt4795;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.C(" + i + ')');
		}
	}

	final Class195 method1021(byte i) {
		try {
			anInt4807++;
			if (aClass195_4792 != null)
				return aClass195_4792;
			if (aClass246_Sub1_Sub6_4796 == null) {
				if (aClass242_4784.method1549(0))
					return null;
				aClass246_Sub1_Sub6_4796 = aClass242_4784.method1554(255, (byte) 0, (byte) -74, true, anInt4782);
			}
			if (((Class246_Sub1_Sub6) aClass246_Sub1_Sub6_4796).aBool5960)
				return null;
			byte[] is = aClass246_Sub1_Sub6_4796.method2534(false);
			if (!(aClass246_Sub1_Sub6_4796 instanceof Class246_Sub1_Sub6_Sub2)) {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass195_4792 = new Class195(is, anInt4779);
				} catch (RuntimeException runtimeexception) {
					aClass242_4784.method1553((byte) -101);
					aClass195_4792 = null;
					if (aClass242_4784.method1549(0))
						aClass246_Sub1_Sub6_4796 = null;
					else
						aClass246_Sub1_Sub6_4796 = aClass242_4784.method1554(255, (byte) 0, (byte) -101, true, anInt4782);
					return null;
				}
				if (aClass208_4781 != null)
					aClass241_4800.method1542(5, anInt4782, is, aClass208_4781);
			} else {
				try {
					if (is == null)
						throw new RuntimeException();
					aClass195_4792 = new Class195(is, anInt4779);
					if (((Class195) aClass195_4792).anInt2739 != anInt4783)
						throw new RuntimeException();
				} catch (RuntimeException runtimeexception) {
					aClass195_4792 = null;
					if (!aClass242_4784.method1549(0))
						aClass246_Sub1_Sub6_4796 = aClass242_4784.method1554(255, (byte) 0, (byte) 68, true, anInt4782);
					else
						aClass246_Sub1_Sub6_4796 = null;
					return null;
				}
			}
			aClass246_Sub1_Sub6_4796 = null;
			if (aClass208_4780 != null) {
				aByteArray4786 = new byte[((Class195) aClass195_4792).anInt2738];
				anInt4795 = 0;
			}
			if (i >= -75)
				method2095(-116);
			return aClass195_4792;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "lv.H(" + i + ')');
		}
	}

	Class154_Sub1(int i, Class208 class208, Class208 class208_28_, Class242 class242, Class241 class241, int i_29_, int i_30_, boolean bool) {
		aClass85_4787 = new Class85(16);
		anInt4808 = 0;
		aClass166_4805 = new Class166();
		aLong4810 = 0L;
		do {
			try {
				aClass208_4780 = class208;
				anInt4782 = i;
				do {
					if (aClass208_4780 != null) {
						aBool4802 = true;
						aClass166_4806 = new Class166();
						if (!client.f_ob)
							break;
					}
					aBool4802 = false;
				} while (false);
				anInt4779 = i_29_;
				anInt4783 = i_30_;
				aBool4809 = bool;
				aClass208_4781 = class208_28_;
				aClass242_4784 = class242;
				aClass241_4800 = class241;
				if (aClass208_4781 == null)
					break;
				aClass246_Sub1_Sub6_4796 = aClass241_4800.method1539(aClass208_4781, -20214, anInt4782);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("lv.<init>(" + i + ',' + (class208 != null ? "{...}" : "null") + ',' + (class208_28_ != null ? "{...}" : "null") + ',' + (class242 != null ? "{...}" : "null") + ',' + (class241 != null ? "{...}" : "null") + ',' + i_29_ + ',' + i_30_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}
}
