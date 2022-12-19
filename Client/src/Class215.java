/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class215 implements Runnable {
	static int anInt2998;
	Signlink aClass52_2999;
	volatile boolean aBool3000;
	static BufferStream aStream3001 = new BufferStream(1);
	volatile Class123[] aClass123Array3002 = new Class123[2];
	volatile boolean aBool3003;
	static int[] anIntArray3004 = { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
	static int anInt3005;

	public static void method1401(int i) {
		do {
			try {
				aStream3001 = null;
				anIntArray3004 = null;
				if (i >= 56)
					break;
				method1402(null, (byte) -48);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "tj.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void run() {
		try {
			anInt3005++;
			((Class215) this).aBool3003 = true;
			try {
				while (!((Class215) this).aBool3000) {
					for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
						Class123 class123 = ((Class215) this).aClass123Array3002[i];
						if (class123 != null)
							class123.method835(0);
					}
					Class247.method1580(10L, -5184);
					Class252.method1616(((Class215) this).aClass52_2999, 69, null);
				}
			} catch (Exception exception) {
				Class194_Sub1.method1883(exception, null, 77);
			} finally {
				((Class215) this).aBool3003 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tj.run(" + ')');
		}
	}

	static final void method1402(String string, byte i) {
		try {
			if (i < -112) {
				anInt2998++;
				if (string != null) {
					if (string.startsWith("*"))
						string = string.substring(1);
					String string_0_ = Class64.method424(string, (byte) -81);
					if (string_0_ != null) {
						for (int i_1_ = 0; i_1_ < Class246_Sub7.anInt3969; i_1_++) {
							String string_2_ = Class103.f_gb[i_1_];
							if (string_2_.startsWith("*"))
								string_2_ = string_2_.substring(1);
							string_2_ = Class64.method424(string_2_, (byte) -100);
							if (string_2_ != null && string_2_.equals(string_0_)) {
								Class246_Sub7.anInt3969--;
								for (int i_3_ = i_1_; i_3_ < Class246_Sub7.anInt3969; i_3_++) {
									Class103.f_gb[i_3_] = Class103.f_gb[i_3_ + 1];
									Class33.aStringArray446[i_3_] = Class33.aStringArray446[1 + i_3_];
									Class40.anIntArray615[i_3_] = Class40.anIntArray615[1 + i_3_];
									Class245.aStringArray3461[i_3_] = Class245.aStringArray3461[i_3_ + 1];
									Class246_Sub28_Sub25.anIntArray6704[i_3_] = (Class246_Sub28_Sub25.anIntArray6704[i_3_ + 1]);
									Class246_Sub40.aBoolArray5520[i_3_] = (Class246_Sub40.aBoolArray5520[i_3_ + 1]);
								}
								Class246_Sub28_Sub15.anInt6358++;
								Class246_Sub1_Sub15.anInt6602 = Class246_Sub34.anInt5146;
								Class243.writePacket(-69, Class69.aClass201_918);
								Class130_Sub1.stream.writeByte(255, Class145.method978(string, (byte) -120));
								Class130_Sub1.stream.writeString(95, string);
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "tj.A(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class215() {
		((Class215) this).aBool3000 = false;
		((Class215) this).aBool3003 = false;
	}
}
