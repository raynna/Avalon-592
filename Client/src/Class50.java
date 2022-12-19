/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50 {
	static float aFloat708;
	static int anInt709;
	static int anInt710;
	private Class_fs aClass_fs711;
	private Class_fs aClass_fs712;
	static int anInt713;
	private HashMap aClass54_714 = new HashMap(64);
	static int anInt715;

	static final void method328(boolean bool, Class246_Sub40 class246_sub40, boolean bool_0_, int i) {
		try {
			anInt709++;
			int i_1_ = ((Class246_Sub40) class246_sub40).anInt5517;
			int i_2_ = (int) ((Node) class246_sub40).hash;
			class246_sub40.unlink((byte) -44);
			if (bool)
				Class246_Sub19.method2065(0, i_1_);
			Class128_Sub2.method2335(i_1_, (byte) -58);
			Class235 class235 = Class220.method1423(0, i_2_);
			if (class235 != null)
				Stream_Sub1.method2483(class235, (byte) -109);
			if (i >= -16)
				method331(-27, -95, null, -41);
			Class115.method780(22);
			if (!bool_0_ && (Class183.anInt2549 ^ 0xffffffff) != 0)
				IntegerNode.method2180(Class183.anInt2549, -1, 1);
			Class16 class16 = new Class16(Class246_Sub34.aClass85_5143);
			for (Class246_Sub40 class246_sub40_3_ = (Class246_Sub40) class16.method161(4); class246_sub40_3_ != null; class246_sub40_3_ = (Class246_Sub40) class16.method160(true)) {
				if (!class246_sub40_3_.method1576(-115)) {
					class246_sub40_3_ = (Class246_Sub40) class16.method161(4);
					if (class246_sub40_3_ == null)
						break;
				}
				if (((Class246_Sub40) class246_sub40_3_).anInt5519 == 3) {
					int i_4_ = (int) ((Node) class246_sub40_3_).hash;
					if (i_4_ >>> 16 == i_1_)
						method328(true, class246_sub40_3_, bool_0_, -34);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ek.E(" + bool + ',' + (class246_sub40 != null ? "{...}" : "null") + ',' + bool_0_ + ',' + i + ')'));
		}
	}

	final Class246_Sub1_Sub16 method329(int i, byte i_5_) {
		try {
			anInt713++;
			int i_6_ = -109 % ((i_5_ - 20) / 55);
			Class246_Sub1_Sub16 class246_sub1_sub16 = ((Class246_Sub1_Sub16) aClass54_714.method379((long) i, (byte) 58));
			if (class246_sub1_sub16 != null)
				return class246_sub1_sub16;
			byte[] is;
			do {
				if (i < 32768) {
					is = aClass_fs712.method91(i, 0, 125);
					if (!client.f_ob)
						break;
				}
				is = aClass_fs711.method91(i & 0x7fff, 0, 89);
			} while (false);
			class246_sub1_sub16 = new Class246_Sub1_Sub16();
			if (is != null)
				class246_sub1_sub16.method2748(new BufferStream(is), -48);
			if (i >= 32768)
				class246_sub1_sub16.method2745((byte) 51);
			aClass54_714.method371(1, (long) i, class246_sub1_sub16);
			return class246_sub1_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ek.C(" + i + ',' + i_5_ + ')');
		}
	}

	static final void method330(int i, int i_7_) {
		try {
			anInt715++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 117, 3);
			int i_8_ = 87 / ((i_7_ + 54) / 52);
			class246_sub1_sub10.method2604((byte) -74);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ek.D(" + i + ',' + i_7_ + ')');
		}
	}

	static final Class246_Sub1_Sub5 method331(int i, int i_9_, Class_fs class_fs, int i_10_) {
		try {
			anInt710++;
			BufferStream stream = new BufferStream(class_fs.method91(i_9_, i, i_10_ ^ 0x76));
			Class246_Sub1_Sub5 class246_sub1_sub5 = new Class246_Sub1_Sub5(i_9_, stream.readString((byte) -40), stream.readString((byte) -40), stream.readInt((byte) 119), stream.readInt((byte) 110), ((stream.readUnsignedByte(255) ^ 0xffffffff) == -2), stream.readUnsignedByte(255), stream.readUnsignedByte(255));
			int i_11_ = stream.readUnsignedByte(255);
			for (int i_12_ = i_10_; i_11_ > i_12_; i_12_++)
				((Class246_Sub1_Sub5) class246_sub1_sub5).aClass166_5843.method1101(false, new Class246_Sub38(stream.readUnsignedByte(i_10_ ^ 0xff), stream.readUnsignedShort((byte) 87), stream.readUnsignedShort((byte) -75), stream.readUnsignedShort((byte) -45), stream.readUnsignedShort((byte) 100), stream.readUnsignedShort((byte) 85), stream.readUnsignedShort((byte) -27), stream.readUnsignedShort((byte) -35), stream.readUnsignedShort((byte) -99)));
			class246_sub1_sub5.method2469((byte) -83);
			return class246_sub1_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ek.A(" + i + ',' + i_9_ + ',' + (class_fs != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}

	static final void method332(Class260 class260, int i, int i_13_, Class_c class_c, int i_14_, int i_15_, int i_16_, byte[][][] is, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int i_22_, byte i_23_, int i_24_, int i_25_, boolean bool) {
		Class259_Sub3.aClass260_5357 = class260;
		Class38_Sub1_Sub1.anInt6768 = i;
		Class140.aClass_c2007 = class_c;
		Class246_Sub28_Sub25.aBool6705 = Class259_Sub3.aClass260_5357.method1701() > 0;
		Class244.anInt3454 = i_14_ >> Class126.anInt1781;
		Class59_Sub2_Sub2.anInt6025 = i_16_ >> Class126.anInt1781;
		Class246_Sub1_Sub10.anInt6199 = i_14_;
		Class111.anInt1576 = i_16_;
		Class246_Sub28_Sub20.anInt6573 = i_15_;
		Class56.anInt796 = Class244.anInt3454 - Class125.anInt1777;
		if (Class56.anInt796 < 0) {
			Class130_Sub8.anInt5615 = -Class56.anInt796;
			Class56.anInt796 = 0;
		} else
			Class130_Sub8.anInt5615 = 0;
		Class133.anInt1834 = Class59_Sub2_Sub2.anInt6025 - Class125.anInt1777;
		if (Class133.anInt1834 < 0) {
			Class_cs.anInt7143 = -Class133.anInt1834;
			Class133.anInt1834 = 0;
		} else
			Class_cs.anInt7143 = 0;
		Class188.anInt2662 = Class244.anInt3454 + Class125.anInt1777;
		if (Class188.anInt2662 > Class240.anInt3377)
			Class188.anInt2662 = Class240.anInt3377;
		Class246_Sub1_Sub10.f_db = Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777;
		if (Class246_Sub1_Sub10.f_db > Class_t_Sub1.f_sc)
			Class246_Sub1_Sub10.f_db = Class_t_Sub1.f_sc;
		for (int i_26_ = 0; i_26_ < Class125.anInt1777 + Class125.anInt1777 + 2; i_26_++) {
			for (int i_27_ = 0; i_27_ < Class125.anInt1777 + Class125.anInt1777 + 2; i_27_++) {
				int i_28_ = Class244.anInt3454 - Class125.anInt1777 + i_26_;
				int i_29_ = Class59_Sub2_Sub2.anInt6025 - Class125.anInt1777 + i_27_;
				if (i_28_ >= 0 && i_29_ >= 0 && i_28_ < Class240.anInt3377 && i_29_ < Class_t_Sub1.f_sc) {
					int i_30_ = i_28_ << Class126.anInt1781;
					int i_31_ = i_29_ << Class126.anInt1781;
					int i_32_ = (Class246_Sub28_Sub3.aClass210Array5899[(Class246_Sub28_Sub3.aClass210Array5899.length - 1)].l(i_28_, i_29_) - (1000 << Class126.anInt1781 - 7));
					int i_33_ = (Class154.aClass210Array2215 != null ? (Class154.aClass210Array2215[0].l(i_28_, i_29_) + Class246_Sub1.anInt3744) : Class246_Sub28_Sub3.aClass210Array5899[0].l(i_28_, i_29_) + Class246_Sub1.anInt3744);
					Class251.aBoolArrayArray3556[i_26_][i_27_] = Class259_Sub3.aClass260_5357.JA(i_30_, i_32_, i_31_, i_30_, i_33_, i_31_);
				} else
					Class251.aBoolArrayArray3556[i_26_][i_27_] = false;
			}
		}
		for (int i_34_ = 0; i_34_ < Class125.anInt1777 + Class125.anInt1777 + 1; i_34_++) {
			for (int i_35_ = 0; i_35_ < Class125.anInt1777 + Class125.anInt1777 + 1; i_35_++)
				Class187_Sub1.aBoolArrayArray4866[i_34_][i_35_] = (Class251.aBoolArrayArray3556[i_34_][i_35_] || Class251.aBoolArrayArray3556[i_34_ + 1][i_35_] || Class251.aBoolArrayArray3556[i_34_][i_35_ + 1] || Class251.aBoolArrayArray3556[i_34_ + 1][i_35_ + 1]);
		}
		Class59_Sub2_Sub1.anIntArray5784 = is_17_;
		InputStream_Sub1.anIntArray4828 = is_18_;
		Class246_Sub28_Sub4.anIntArray5978 = is_19_;
		Class59_Sub3_Sub2.anIntArray5885 = is_20_;
		Player.f_vd = is_21_;
		Class260.method1733();
		Class246_Sub1_Sub8_Sub1.method2924(2);
		for (Class130_Sub3 class130_sub3 = (Class130_Sub3) Class246_Sub2.aClass68_3814.method445(62); class130_sub3 != null; class130_sub3 = (Class130_Sub3) Class246_Sub2.aClass68_3814.method442((byte) -61)) {
			class130_sub3.method886(1024);
			Class59_Sub5_Sub1.method2462(class130_sub3, -201);
		}
		if (Class246_Sub28_Sub25.aBool6705) {
			for (int i_36_ = 0; i_36_ < Class_c.anInt1195; i_36_++)
				Class57.aClass174Array811[i_36_].method1143(i, bool, 104);
		}
		if (i_13_ > 1) {
			Class259_Sub3.aClass260_5357.method1744(0);
			if (Class245.aClass106_3462 == null || Class245.aClass106_3462 instanceof Class106_Sub2)
				Class245.aClass106_3462 = new Class106_Sub1();
		} else if (Class245.aClass106_3462 == null || Class245.aClass106_3462 instanceof Class106_Sub1)
			Class245.aClass106_3462 = new Class106_Sub2();
		Class245.aClass106_3462.method722(i_13_, 5000);
		Class245.aClass106_3462.method721(5000);
		if (Class1.aClass147ArrayArrayArray4 != null) {
			Class47.method317(true);
			Class245.aClass106_3462.method724((byte) -122, 22);
			Class59_Sub3.method2170(i_13_, null, 0, (byte) 0, i_24_, i_25_);
			Class245.aClass106_3462.method721(5000);
			Class245.aClass106_3462.method724((byte) -117, 23);
			Class47.method317(false);
		}
		Class59_Sub3.method2170(i_13_, is, i_22_, i_23_, i_24_, i_25_);
		Class245.aClass106_3462.method721(5000);
		Class245.aClass106_3462.method720(-125);
		Class245.aClass106_3462.method721(5000);
		if (i_13_ > 1)
			Class259_Sub3.aClass260_5357.method1714(0);
		Class259_Sub3.aClass260_5357.method1679(0, null);
	}

	Class50(int i, Class_fs class_fs, Class_fs class_fs_37_) {
		do {
			try {
				aClass_fs712 = class_fs;
				aClass_fs711 = class_fs_37_;
				if (aClass_fs712 != null)
					aClass_fs712.method95(0, 28724);
				if (aClass_fs711 == null)
					break;
				aClass_fs711.method95(0, 28724);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ek.<init>(" + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_37_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
