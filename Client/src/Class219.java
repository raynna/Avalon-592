/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
	static int anInt3036;
	static int anInt3037;
	static Class67 aClass67_3038 = new Class67("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
	static Class67 aClass67_3039 = new Class67("Choose Option", "W\u00e4hl eine Option", "Choisir une option", "Selecionar op\u00e7\u00e3o");
	static int anInt3040;
	static Class_fs index19;

	static final void method1419(int i, Stream_Sub1 stream_sub1) {
		try {
			stream_sub1.method2477(-934);
			anInt3036++;
			int i_0_ = Class109.anInt1567;
			Player class_r_sub1 = (Class_a.aClass_r_Sub1_1180 = Class143.aClass_r_Sub1Array2069[i_0_] = new Player());
			((Actor) class_r_sub1).f_db = i_0_;
			int i_1_ = stream_sub1.readBits(-115, 30);
			byte i_2_ = (byte) (i_1_ >> 28);
			int i_3_ = 0x3fff & i_1_ >> 14;
			((Actor) class_r_sub1).f_mc[0] = -Class39_Sub1.anInt4670 + i_3_;
			int i_4_ = 0x3fff & i_1_;
			((Class59_Sub3) class_r_sub1).anInt5060 = ((((Actor) class_r_sub1).f_mc[0] << 7) + (class_r_sub1.method2670((byte) 127) << 6));
			((Actor) class_r_sub1).f_nc[0] = -Class47.anInt686 + i_4_;
			((Class59_Sub3) class_r_sub1).anInt5059 = ((((Actor) class_r_sub1).f_nc[0] << 7) - -(class_r_sub1.method2670((byte) 127) << 6));
			Class246_Sub28_Sub24.anInt6681 = ((Class59_Sub3) class_r_sub1).aByte5053 = i_2_;
			if (Class197.aStreamArray2770[i_0_] != null)
				class_r_sub1.readAppearance(Class197.aStreamArray2770[i_0_], -2147483648);
			Class246_Sub4.anInt3869 = 0;
			Class53.anIntArray755[Class246_Sub4.anInt3869++] = i_0_;
			Class246_Sub1_Sub8.aByteArray6107[i_0_] = (byte) 0;
			Class183.anInt2541 = 0;
			if (i <= -63) {
				for (int i_5_ = 1; i_5_ < 2048; i_5_++) {
					if (i_5_ != i_0_) {
						int i_6_ = stream_sub1.readBits(-79, 18);
						int i_7_ = i_6_ >> 16;
						int i_8_ = 0xff & i_6_ >> 8;
						int i_9_ = i_6_ & 0xff;
						Class240 class240 = (Class166.aClass240Array2365[i_5_] = new Class240());
						((Class240) class240).anInt3383 = (i_7_ << 28) + (i_8_ << 14) + i_9_;
						((Class240) class240).anInt3380 = 0;
						((Class240) class240).anInt3379 = -1;
						((Class240) class240).aBool3378 = false;
						Class172.anIntArray2430[Class183.anInt2541++] = i_5_;
						Class246_Sub1_Sub8.aByteArray6107[i_5_] = (byte) 0;
					}
				}
				stream_sub1.method2476((byte) -98);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tr.C(" + i + ',' + (stream_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1420(int i) {
		do {
			try {
				anInt3040++;
				Class37.anInt551 = 0;
				int i_10_ = ((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 >> 7) + Class39_Sub1.anInt4670);
				int i_11_ = (Class47.anInt686 + (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 >> 7));
				if ((i_10_ ^ 0xffffffff) <= -3054 && i_10_ <= 3156 && (i_11_ ^ 0xffffffff) <= -3057 && (i_11_ ^ 0xffffffff) >= -3137)
					Class37.anInt551 = 1;
				if (i_10_ >= 3072 && i_10_ <= 3118 && i_11_ >= 9492 && i_11_ <= 9535)
					Class37.anInt551 = 1;
				if (Class37.anInt551 == 1 && i_10_ >= 3139 && (i_10_ ^ 0xffffffff) >= -3200 && i_11_ >= 3008 && (i_11_ ^ 0xffffffff) >= -3063)
					Class37.anInt551 = 0;
				if (i == 8714)
					break;
				method1420(-44);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tr.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1421(boolean bool, int i, int i_12_) {
		try {
			anInt3037++;
			if (bool != true)
				aClass67_3038 = null;
			if (!Class152.method1012(i_12_, 119, i) && !Class_b.method568(i_12_, i, (byte) 59))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("tr.B(" + bool + ',' + i + ',' + i_12_ + ')'));
		}
	}

	public static void method1422(byte i) {
		try {
			if (i >= 28) {
				aClass67_3038 = null;
				aClass67_3039 = null;
				index19 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tr.A(" + i + ')');
		}
	}
}
