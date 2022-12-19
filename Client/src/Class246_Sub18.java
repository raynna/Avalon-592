/* Class246_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub18 extends Node {
	static int anInt4676;
	static Class87 aClass87_4677;
	static Class180 aClass180_4678;
	int[] anIntArray4679;
	static int anInt4680;
	static int anInt4681;
	int[] anIntArray4682 = { -1 };
	static int anInt4683;

	final Class_t method2056(int i, boolean bool, byte i_0_, int i_1_, Class124 class124, int i_2_, int i_3_, Class27 class27, int i_4_, Class260 class260) {
		try {
			anInt4683++;
			Class_t class_t = null;
			int i_5_ = i;
			Class135 class135 = null;
			if ((i_3_ ^ 0xffffffff) != 0)
				class135 = Class118.aClass_v1641.method694(false, i_3_);
			int[] is = ((Class246_Sub18) this).anIntArray4682;
			if (class135 != null && ((Class135) class135).anIntArray1919 != null) {
				is = new int[((Class135) class135).anIntArray1919.length];
				for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class135) class135).anIntArray1919.length ^ 0xffffffff)); i_6_++) {
					int i_7_ = ((Class135) class135).anIntArray1919[i_6_];
					if (i_7_ < 0 || i_7_ >= (((Class246_Sub18) this).anIntArray4682).length)
						is[i_6_] = -1;
					else
						is[i_6_] = ((Class246_Sub18) this).anIntArray4682[i_7_];
				}
			}
			boolean bool_8_ = false;
			boolean bool_9_ = false;
			boolean bool_10_ = false;
			if (i_0_ != 117)
				return null;
			boolean bool_11_ = false;
			int i_12_ = -1;
			int i_13_ = -1;
			int i_14_ = 0;
			Class246_Sub1_Sub17 class246_sub1_sub17 = null;
			Class246_Sub1_Sub17 class246_sub1_sub17_15_ = null;
			if (class124 != null) {
				i_5_ |= 0x20;
				i_12_ = ((Class124) class124).anIntArray1724[i_4_];
				int i_16_ = i_12_ >>> 16;
				i_12_ &= 0xffff;
				class246_sub1_sub17 = Class59_Sub3_Sub3.aClass45_6275.method298(i_16_, 1);
				if (class246_sub1_sub17 != null) {
					bool_9_ |= class246_sub1_sub17.method2757((byte) -50, i_12_);
					bool_8_ |= class246_sub1_sub17.method2764(i_0_ ^ ~0x1834, i_12_);
					bool_11_ |= class246_sub1_sub17.method2765(i_12_, (byte) 110);
					bool_10_ |= ((Class124) class124).aBool1743;
				}
				if ((((Class124) class124).aBool1732 || OutputStream_Sub1.aBool4488) && i_1_ != -1 && ((Class124) class124).anIntArray1724.length > i_1_) {
					i_13_ = ((Class124) class124).anIntArray1724[i_1_];
					i_14_ = ((Class124) class124).anIntArray1745[i_4_];
					int i_17_ = i_13_ >>> 16;
					i_13_ &= 0xffff;
					if ((i_17_ ^ 0xffffffff) == (i_16_ ^ 0xffffffff))
						class246_sub1_sub17_15_ = class246_sub1_sub17;
					else
						class246_sub1_sub17_15_ = Class59_Sub3_Sub3.aClass45_6275.method298(i_13_ >>> 16, 1);
					if (class246_sub1_sub17_15_ != null) {
						bool_9_ |= class246_sub1_sub17_15_.method2757((byte) -107, i_13_);
						bool_8_ |= class246_sub1_sub17_15_.method2764(i_0_ ^ ~0x1834, i_13_);
						bool_11_ |= class246_sub1_sub17_15_.method2765(i_13_, (byte) 114);
					}
				}
				if (bool_9_)
					i_5_ |= 0x80;
				if (bool_8_)
					i_5_ |= 0x100;
				if (bool_10_)
					i_5_ |= 0x200;
				if (bool_11_)
					i_5_ |= 0x400;
			}
			long l = method2058(is, i_3_, bool, -1511670520, (class27 != null ? ((Class27) class27).anIntArray373 : null));
			if (Class93.aClass54_1229 != null)
				class_t = (Class_t) Class93.aClass54_1229.method379(l, (byte) 58);
			if (class_t == null || (class260.method1710(class_t.P(), i_5_) ^ 0xffffffff) != -1) {
				if (class_t != null)
					i_5_ = class260.method1723(i_5_, class_t.P());
				int i_18_ = i_5_;
				boolean bool_19_ = false;
				for (int i_20_ = 0; is.length > i_20_; i_20_++) {
					if ((is[i_20_] ^ 0xffffffff) != 0 && !Class255.aClass191_3663.method1251(i_0_ + 22766, is[i_20_]).method1292(i_0_ ^ ~0x75, bool))
						bool_19_ = true;
				}
				if (bool_19_)
					return null;
				Class103[] class103s = new Class103[is.length];
				for (int i_21_ = 0; (is.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
					if ((is[i_21_] ^ 0xffffffff) != 0)
						class103s[i_21_] = Class255.aClass191_3663.method1251(Class93.method599(i_0_, 22806), is[i_21_]).method1291(bool, 0);
				}
				if (class135 != null && ((Class135) class135).anIntArrayArray1905 != null) {
					for (int i_22_ = 0; (i_22_ < ((Class135) class135).anIntArrayArray1905.length); i_22_++) {
						if ((((Class135) class135).anIntArrayArray1905[i_22_] != null) && class103s[i_22_] != null) {
							int i_23_ = (((Class135) class135).anIntArrayArray1905[i_22_][0]);
							int i_24_ = (((Class135) class135).anIntArrayArray1905[i_22_][1]);
							int i_25_ = (((Class135) class135).anIntArrayArray1905[i_22_][2]);
							int i_26_ = (((Class135) class135).anIntArrayArray1905[i_22_][3]);
							int i_27_ = (((Class135) class135).anIntArrayArray1905[i_22_][4]);
							int i_28_ = (((Class135) class135).anIntArrayArray1905[i_22_][5]);
							if (i_26_ != 0 || (i_27_ ^ 0xffffffff) != -1 || i_28_ != 0)
								class103s[i_22_].method660(i_26_, i_27_, i_28_, (byte) 123);
							if ((i_23_ ^ 0xffffffff) != -1 || (i_24_ ^ 0xffffffff) != -1 || (i_25_ ^ 0xffffffff) != -1)
								class103s[i_22_].method648(i_24_, i_23_, i_25_, -38);
						}
					}
				}
				Class103 class103 = new Class103(class103s, class103s.length);
				if (class27 != null)
					i_18_ |= 0x4000;
				class_t = class260.method1695(class103, i_18_, Class191.anInt2689, 64, 850);
				if (class27 != null) {
					for (int i_29_ = 0; i_29_ < 5; i_29_++) {
						if ((Class246_Sub30_Sub1.aShortArrayArray5767[i_29_]).length > ((Class27) class27).anIntArray373[i_29_])
							class_t.BA(Class160.aShortArray2270[i_29_], (Class246_Sub30_Sub1.aShortArrayArray5767[i_29_][(((Class27) class27).anIntArray373[i_29_])]));
						if (((Class246_Sub1_Sub2.aShortArrayArray5693[i_29_]).length ^ 0xffffffff) < (((Class27) class27).anIntArray373[i_29_] ^ 0xffffffff))
							class_t.BA(Node.aShortArray3466[i_29_], (Class246_Sub1_Sub2.aShortArrayArray5693[i_29_][(((Class27) class27).anIntArray373[i_29_])]));
					}
				}
				if (Class93.aClass54_1229 != null) {
					class_t.UA(i_5_);
					Class93.aClass54_1229.method371(1, l, class_t);
				}
			}
			if (class124 == null || class246_sub1_sub17 == null)
				return class_t;
			Class_t class_t_30_ = class_t.method678((byte) 1, i_5_, true);
			class_t_30_.method674(0, i_14_, ((Class124) class124).aBool1743, i_12_, i_13_, class246_sub1_sub17, class246_sub1_sub17_15_, -1 + i_2_, i_0_ - 117);
			return class_t_30_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jh.A(" + i + ',' + bool + ',' + i_0_ + ',' + i_1_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + (class27 != null ? "{...}" : "null") + ',' + i_4_ + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2057(boolean bool) {
		do {
			try {
				aClass180_4678 = null;
				aClass87_4677 = null;
				if (bool == false)
					break;
				anInt4676 = -95;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "jh.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	private final long method2058(int[] is, int i, boolean bool, int i_31_, int[] is_32_) {
		try {
			anInt4680++;
			long[] ls = Class102.aLongArray1322;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) (0xffL & ((long) (i >> 8) ^ l))];
			l = ls[(int) ((l ^ (long) i) & 0xffL)] ^ l >>> 8;
			for (int i_33_ = 0; i_33_ < is.length; i_33_++) {
				l = l >>> 8 ^ ls[(int) (((long) (is[i_33_] >> 24) ^ l) & 0xffL)];
				l = (ls[(int) (((long) (is[i_33_] >> 16) ^ l) & 0xffL)] ^ l >>> 8);
				l = (ls[(int) (0xffL & (l ^ (long) (is[i_33_] >> 8)))] ^ l >>> 8);
				l = ls[(int) (((long) is[i_33_] ^ l) & 0xffL)] ^ l >>> 8;
			}
			if (is_32_ != null) {
				for (int i_34_ = 0; i_34_ < 5; i_34_++)
					l = (ls[(int) ((l ^ (long) is_32_[i_34_]) & 0xffL)] ^ l >>> 8);
			}
			l = l >>> 8 ^ ls[(int) (((long) (!bool ? 0 : 1) ^ l) & 0xffL)];
			if (i_31_ != -1511670520)
				return 125L;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("jh.C(" + (is != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_31_ + ',' + (is_32_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub18() {
		((Class246_Sub18) this).anIntArray4679 = new int[1];
	}

	static {
		new Class67("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.");
		anInt4676 = 1401;
		anInt4681 = 0;
	}
}
