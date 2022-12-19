
/* Class259_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class259_Sub2_Sub1 extends Class259_Sub2 {
	static int anInt6904;
	static int anInt6905;
	static float aFloat6906 = 0.0F;
	static IncomingPacket aClass13_6907;
	static int anInt6908;

	static final Class123 method2845(int i, int i_0_, Signlink class52, int i_1_, Component component) {
		try {
			anInt6908++;
			if ((Class140.anInt2024 ^ 0xffffffff) == -1)
				throw new IllegalStateException();
			if ((i ^ 0xffffffff) > -1 || i >= 2)
				throw new IllegalArgumentException();
			if (i_0_ != 2)
				method2846(41, (byte) 82, false, 75L, -46, null, false, null, -32, 115, -126);
			if (i_1_ < 256)
				i_1_ = 256;
			try {
				Class123 class123 = (Class123) Class.forName("Class123_Sub1").newInstance();
				((Class123) class123).anInt1717 = i_1_;
				((Class123) class123).anIntArray1706 = new int[(Class240.aBool3387 ? 2 : 1) * 256];
				class123.method832(component);
				((Class123) class123).anInt1715 = 1024 + (i_1_ & ~0x3ff);
				if (((Class123) class123).anInt1715 > 16384)
					((Class123) class123).anInt1715 = 16384;
				class123.method831(((Class123) class123).anInt1715);
				if ((Class175.anInt2475 ^ 0xffffffff) < -1 && Class36.aClass215_492 == null) {
					Class36.aClass215_492 = new Class215();
					((Class215) Class36.aClass215_492).aClass52_2999 = class52;
					class52.method354(95, Class175.anInt2475, Class36.aClass215_492);
				}
				if (Class36.aClass215_492 != null) {
					if ((((Class215) Class36.aClass215_492).aClass123Array3002[i]) != null)
						throw new IllegalArgumentException();
					((Class215) Class36.aClass215_492).aClass123Array3002[i] = class123;
				}
				return class123;
			} catch (Throwable throwable) {
				try {
					Class123_Sub2 class123_sub2 = new Class123_Sub2(class52, i);
					((Class123) class123_sub2).anIntArray1706 = new int[256 * (!Class240.aBool3387 ? 1 : 2)];
					((Class123) class123_sub2).anInt1717 = i_1_;
					class123_sub2.method832(component);
					((Class123) class123_sub2).anInt1715 = 16384;
					class123_sub2.method831(((Class123) class123_sub2).anInt1715);
					if ((Class175.anInt2475 ^ 0xffffffff) < -1 && Class36.aClass215_492 == null) {
						Class36.aClass215_492 = new Class215();
						((Class215) Class36.aClass215_492).aClass52_2999 = class52;
						class52.method354(i_0_ - 120, Class175.anInt2475, Class36.aClass215_492);
					}
					if (Class36.aClass215_492 != null) {
						if ((((Class215) Class36.aClass215_492).aClass123Array3002[i]) != null)
							throw new IllegalArgumentException();
						((Class215) Class36.aClass215_492).aClass123Array3002[i] = class123_sub2;
					}
					return class123_sub2;
				} catch (Throwable throwable_2_) {
					return new Class123();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("te.J(" + i + ',' + i_0_ + ',' + (class52 != null ? "{...}" : "null") + ',' + i_1_ + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2846(int i, byte i_3_, boolean bool, long l, int i_4_, String string, boolean bool_5_, String string_6_, int i_7_, int i_8_, int i_9_) {
		try {
			anInt6904++;
			if (!Class246_Sub28_Sub21.aBool6580 && Class230.anInt3147 < 500) {
				i_9_ = i_9_ == -1 ? Class83.anInt1089 : i_9_;
				Class246_Sub35 class246_sub35 = new Class246_Sub35(string_6_, string, i_9_, i, i_8_, l, i_4_, i_7_, bool_5_, bool);
				Class108.aClass166_1525.method1101(false, class246_sub35);
				if (i_3_ != -55)
					aFloat6906 = 0.3593247F;
				Class230.anInt3147++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("te.I(" + i + ',' + i_3_ + ',' + bool + ',' + l + ',' + i_4_ + ',' + (string != null ? "{...}" : "null") + ',' + bool_5_ + ',' + (string_6_ != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final Class178 method2847(Class_fs class_fs, int i, String string, boolean bool) {
		try {
			anInt6905++;
			int i_10_ = -107 % ((i + 30) / 50);
			int i_11_ = class_fs.method86(string, (byte) 107);
			if (i_11_ == -1)
				return new Class178(0);
			int[] is = class_fs.method111(16947, i_11_);
			Class178 class178 = new Class178(is.length);
			int i_12_ = 0;
			int i_13_ = 0;
			while (((Class178) class178).anInt2504 > i_12_) {
				BufferStream stream = new BufferStream(class_fs.method91(is[i_13_++], i_11_, 99));
				int i_14_ = stream.readInt((byte) 91);
				int i_15_ = stream.readUnsignedShort((byte) 104);
				int i_16_ = stream.readUnsignedByte(255);
				if (bool || i_16_ != 1) {
					((Class178) class178).anIntArray2505[i_12_] = i_14_;
					((Class178) class178).anIntArray2499[i_12_] = i_15_;
					i_12_++;
				} else
					((Class178) class178).anInt2504--;
			}
			return class178;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("te.E(" + (class_fs != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	public static void method2848(int i) {
		do {
			try {
				aClass13_6907 = null;
				if (i > 83)
					break;
				aClass13_6907 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "te.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
