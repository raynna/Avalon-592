/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
	private Class_fs aClass_fs1197;
	static int anInt1198;
	static int anInt1199;
	static int anInt1200;
	Class_fs aClass_fs1201;
	static int anInt1202;
	static int anInt1203;
	private HashMap aClass54_1204 = new HashMap(64);
	static IncomingPacket GLOBAL_STRING_2_PACKET = new IncomingPacket(54, -2);
	static int anInt1206;
	static boolean[][] aBoolArrayArray1207 = { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
	static Class6 aClass6_1208;

	static final void method586(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		try {
			anInt1202++;
			int i_4_ = 0;
			if (i_2_ < 46)
				method588((byte) 4);
			int i_5_ = i_0_;
			int i_6_ = -i_0_;
			Class135.method918(i + -i_0_, -65, i_3_, i - -i_0_, Class246_Sub28_Sub6.anIntArrayArray6042[i_1_]);
			int i_7_ = -1;
			while (i_5_ > i_4_) {
				i_7_ += 2;
				i_6_ += i_7_;
				i_4_++;
				if ((i_6_ ^ 0xffffffff) <= -1) {
					i_5_--;
					i_6_ -= i_5_ << 1;
					int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_5_ + i_1_];
					int[] is_8_ = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ - i_5_];
					int i_9_ = i + i_4_;
					int i_10_ = -i_4_ + i;
					Class135.method918(i_10_, 125, i_3_, i_9_, is);
					Class135.method918(i_10_, 118, i_3_, i_9_, is_8_);
				}
				int i_11_ = i - -i_5_;
				int i_12_ = -i_5_ + i;
				int[] is = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ - -i_4_];
				int[] is_13_ = Class246_Sub28_Sub6.anIntArrayArray6042[i_1_ + -i_4_];
				Class135.method918(i_12_, -39, i_3_, i_11_, is);
				Class135.method918(i_12_, -99, i_3_, i_11_, is_13_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("in.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method587(byte i) {
		do {
			try {
				anInt1198++;
				synchronized (aClass54_1204) {
					aClass54_1204.method369(false);
				}
				if (i <= -93)
					break;
				((Class92) this).aClass_fs1201 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "in.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method588(byte i) {
		try {
			int i_14_ = -113 % ((-53 - i) / 33);
			aBoolArrayArray1207 = null;
			GLOBAL_STRING_2_PACKET = null;
			aClass6_1208 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.A(" + i + ')');
		}
	}

	final Class161 method589(int i, int i_15_) {
		try {
			anInt1200++;
			Class161 class161;
			synchronized (aClass54_1204) {
				class161 = (Class161) aClass54_1204.method379((long) i, (byte) 58);
			}
			if (class161 != null)
				return class161;
			byte[] is = aClass_fs1197.method91(i, 3, 108);
			class161 = new Class161();
			((Class161) class161).aClass92_2277 = this;
			if (is != null)
				class161.method1063(-1, new BufferStream(is));
			synchronized (aClass54_1204) {
				aClass54_1204.method371(1, (long) i, class161);
				if (i_15_ != -18653)
					aClass_fs1197 = null;
			}
			return class161;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.E(" + i + ',' + i_15_ + ')');
		}
	}

	Class92(Class101 class101, int i, Class_fs class_fs, Class_fs class_fs_16_) {
		try {
			((Class92) this).aClass_fs1201 = class_fs_16_;
			aClass_fs1197 = class_fs;
			aClass_fs1197.method95(3, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("in.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ',' + (class_fs_16_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method590(boolean bool, int i) {
		try {
			anInt1203++;
			if (bool != true)
				method590(true, 102);
			synchronized (aClass54_1204) {
				aClass54_1204.method380(i, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.D(" + bool + ',' + i + ')');
		}
	}

	final void method591(boolean bool) {
		try {
			anInt1199++;
			synchronized (aClass54_1204) {
				if (bool != false) {
					/* empty */
				} else
					aClass54_1204.method383(87);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "in.B(" + bool + ')');
		}
	}
}
