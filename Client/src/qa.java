
/* qa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

final class qa extends Class260 implements Class_d {
	long nativeid = 0L;
	private static int[] s = new int[Math.max(Math.max(80, 20), 24573)];
	private Class166 t = new Class166();
	private na u;
	static int[] v;
	private static int[] w;
	private static Boolean x = Boolean.FALSE;
	private static int[] y;
	private int z;
	private Class_c A;
	private static int[] B;
	private int C = 4096;
	private static byte[] D;
	static int[] E;
	private static float[] F;
	private static short[] G;
	private Canvas H;
	private za I;
	private static int[] J;
	private static float[] K;
	private Class85 L;
	private boolean N;
	private int O;
	private Class_n[] P;

	final Class128 method1726(int i, int i_0_, int[] is, int[] is_1_) {
		return new sa(this, u, i, i_0_, is, is_1_);
	}

	final void method1731(Rectangle[] rectangles, int i) {
		int i_2_ = 0;
		while (i_2_ < 9) {
			try {
				for (int i_3_ = 0; i_3_ < i; i_3_++) {
					Rectangle rectangle = rectangles[i_3_];
					if (rectangle.width > 0 && rectangle.height > 0) {
						synchronized (H.getTreeLock()) {
							I.d(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
						}
					}
				}
				return;
			} catch (Exception exception) {
				Class247.method1580(200L, -5184);
				i_2_++;
			}
		}
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			Rectangle rectangle = rectangles[i_4_];
			if (rectangle.width > 0 && rectangle.height > 0) {
				synchronized (H.getTreeLock()) {
					I.d(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
				}
			}
		}
	}

	private final void a(Class129 class129, boolean bool) {
		int i = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		for (Class130_Sub1_Sub1 class130_sub1_sub1 = ((Class130_Sub1_Sub1) ((Class129) class129).aClass220_1802.method1429(50)); class130_sub1_sub1 != null; class130_sub1_sub1 = ((Class130_Sub1_Sub1) ((Class129) class129).aClass220_1802.method1426(true))) {
			J[i++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037;
			J[i++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048;
			J[i++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044;
			B[i_5_++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043;
			G[i_7_++] = (short) ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049;
			w[i_6_++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038;
			if (bool)
				D[i_8_++] = ((Class130_Sub1_Sub1) class130_sub1_sub1).aByte7041;
		}
	}

	final native void ea(Class_c class_c);

	final native void AA(int i, int i_9_, int i_10_, int i_11_);

	final Class_l method1749(Class10 class10, boolean bool) {
		int[] is = ((Class10) class10).anIntArray160;
		byte[] is_12_ = ((Class10) class10).aByteArray157;
		int i = ((Class10) class10).anInt156;
		int i_13_ = ((Class10) class10).anInt155;
		Class_l class_l;
		if (bool && ((Class10) class10).aByteArray161 == null)
			class_l = new Class_k(this, u, is, is_12_, 0, ((Class10) class10).anInt156, ((Class10) class10).anInt156, ((Class10) class10).anInt155);
		else {
			int i_14_ = i * i_13_;
			int[] is_15_ = new int[i_14_];
			byte[] is_16_ = ((Class10) class10).aByteArray161;
			if (is_16_ != null) {
				for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
					int i_18_ = i_17_ * i;
					for (int i_19_ = 0; i_19_ < i; i_19_++)
						is_15_[i_18_ + i_19_] = (is[is_12_[i_18_ + i_19_] & 0xff] | is_16_[i_18_ + i_19_] << 24);
				}
				class_l = new ra(this, u, is_15_, 0, i, i, i_13_);
			} else {
				boolean bool_20_ = false;
				for (int i_21_ = 0; i_21_ < i_14_; i_21_++) {
					int i_22_ = (((Class10) class10).anIntArray160[is_12_[i_21_] & 0xff]);
					if (i_22_ >>> 24 != 255)
						bool_20_ = true;
					is_15_[i_21_] = i_22_;
				}
				if (bool_20_)
					class_l = new ra(this, u, is_15_, 0, ((Class10) class10).anInt156, ((Class10) class10).anInt156, ((Class10) class10).anInt155);
				else
					class_l = new ia(this, u, is_15_, 0, ((Class10) class10).anInt156, ((Class10) class10).anInt156, ((Class10) class10).anInt155);
			}
		}
		class_l.MA(((Class10) class10).anInt158, ((Class10) class10).anInt162, ((Class10) class10).anInt159, ((Class10) class10).anInt163);
		return class_l;
	}

	final Class_c method1715() {
		return new Class_i();
	}

	final void method1752() {
		/* empty */
	}

	private final native void A(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, Class128 class128, int i_28_, int i_29_);

	final native void b(int i, int i_30_, int i_31_, int i_32_, int i_33_);

	final native void NA(int i, int i_34_, int i_35_, int i_36_, int i_37_);

	final native void H(int i, int i_38_, int i_39_, int i_40_);

	final native void DA(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, byte[] is, int i_46_, int i_47_);

	final void method1698(float f, float f_48_, float f_49_) {
		/* empty */
	}

	final void method1753(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		b(i, i_50_, i_51_, i_53_, i_54_);
		b(i, i_50_ + i_52_ - 1, i_51_, i_53_, i_54_);
		TA(i, i_50_ + 1, i_52_ - 1, i_53_, i_54_);
		TA(i + i_51_ - 1, i_50_ + 1, i_52_ - 1, i_53_, i_54_);
	}

	private final native void FA();

	final native void ia(int i, int i_55_);

	final native void ca(int i, Class128 class128, int i_56_, int i_57_);

	final Class_l method1721(int i, int i_58_, int i_59_, int i_60_, boolean bool) {
		if (bool)
			return new ra(this, u, i, i_58_, i_59_, i_60_);
		return new ia(this, u, i, i_58_, i_59_, i_60_);
	}

	final boolean method1693() {
		return false;
	}

	final native float xa();

	final native void UA(int i, int i_61_, int i_62_);

	final boolean method1699() {
		return false;
	}

	final native float W();

	final void method1696(boolean bool) {
		/* empty */
	}

	final native void MA(int i);

	final Class210 method1738(int i, int i_63_, int[][] is, int[][] is_64_, int i_65_, int i_66_, int i_67_) {
		return new ha(this, u, i, i_63_, is, is_64_, i_65_, i_66_, i_67_);
	}

	final void method1690(Canvas canvas) {
		za var_za = (za) L.method544((long) canvas.hashCode(), 127);
		if (var_za == null) {
			try {
				Class var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
				method.invoke(canvas, new Object[] { Boolean.TRUE });
			} catch (Exception exception) {
				/* empty */
			}
			var_za = new za(this, canvas);
			L.method547((long) canvas.hashCode(), -2301, var_za);
		}
	}

	final int method1701() {
		return 4;
	}

	private final native void ma(int i);

	final boolean method1684() {
		return false;
	}

	final native void OA(int i, int i_68_, int i_69_, int i_70_);

	private final native void I(Class_u class_u);

	private final native void za(int i, int[] is, float[] fs);

	final boolean method1741() {
		return true;
	}

	final native void fa(int i, int i_71_, int i_72_, int i_73_);

	protected final void finalize() {
		EA();
	}

	final native void e();

	private final native void RA(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_);

	final native int IA();

	final boolean method1705() {
		return true;
	}

	private final native void PA(za var_za);

	final boolean method1720() {
		return true;
	}

	final Class_l method1706(int[] is, int i, int i_79_, int i_80_, int i_81_) {
		boolean bool = false;
		int i_82_ = i;
		while_149_: for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
			for (int i_84_ = 0; i_84_ < i_80_; i_84_++) {
				int i_85_ = is[i_82_++] >>> 24;
				if (i_85_ != 0 && i_85_ != 255) {
					bool = true;
					break while_149_;
				}
			}
		}
		if (bool)
			return new ra(this, u, is, i, i_79_, i_80_, i_81_);
		return new ia(this, u, is, i, i_79_, i_80_, i_81_);
	}

	final void method1722() {
		/* empty */
	}

	final void method1740(Class_t[] class_ts, Class129 class129, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		a(class129, true);
		if (class130_sub5s == null)
			E().Y(this, class_ts, class_c, null, i, J, B, w, G, D, ((Class129) class129).aClass220_1802.method1430(-75), E);
		else {
			Class130_Sub5 class130_sub5 = class130_sub5s[0];
			v[5] = 0;
			E().Y(this, class_ts, class_c, v, i, J, B, w, G, D, ((Class129) class129).aClass220_1802.method1430(64), E);
			((Class130_Sub5) class130_sub5).anInt4813 = v[0];
			((Class130_Sub5) class130_sub5).anInt4811 = v[1];
			((Class130_Sub5) class130_sub5).anInt4815 = v[2];
			((Class130_Sub5) class130_sub5).anInt4812 = v[3];
			((Class130_Sub5) class130_sub5).anInt4816 = v[4];
			((Class130_Sub5) class130_sub5).aBool4814 = v[5] != 0;
		}
		int i_86_ = 0;
		for (int i_87_ = 0; i_87_ < class_ts.length; i_87_++) {
			if (class_ts[i_87_] != null) {
				da var_da = (da) class_ts[i_87_];
				var_da.method1843(i_86_, class_c);
				if (((da) var_da).aClass19Array3987 != null)
					i_86_ += ((da) var_da).aClass19Array3987.length * 9;
				if (((da) var_da).aClass162Array3986 != null)
					i_86_ += ((da) var_da).aClass162Array3986.length * 3;
			}
		}
	}

	final void method1747(int i) {
		throw new IllegalStateException();
	}

	final void method1728(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, Class128 class128, int i_93_, int i_94_) {
		A(i, i_88_, i_89_, i_90_, i_91_, i_92_, class128, i_93_, i_94_);
	}

	final boolean method1683() {
		return true;
	}

	final native void TA(int i, int i_95_, int i_96_, int i_97_, int i_98_);

	final void method1717(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		throw new IllegalStateException();
	}

	final native int YA();

	final void method1687(int i) {
		Class227.method1452(true);
		ma(i);
		for (na var_na = (na) t.method1104(115); var_na != null; var_na = (na) t.method1108((byte) -112))
			var_na.a();
	}

	final int method1723(int i, int i_108_) {
		return i | i_108_;
	}

	public final native void EA();

	final void method1678(boolean bool) {
		/* empty */
	}

	final boolean method1689() {
		return false;
	}

	final native void GA(int i, int i_109_, int i_110_, int i_111_);

	final void method1694(int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_) {
		E().va(this, i, i_112_, i_113_, i_114_, i_115_, i_116_, i_117_);
	}

	final void method1719() {
		/* empty */
	}

	private final native void K(Interface6 interface6, int i, int i_118_);

	final void method1680() {
		for (na var_na = (na) t.method1104(89); var_na != null; var_na = (na) t.method1108((byte) -112))
			var_na.H();
		t.method1102(-90);
		FA();
		if (N) {
			Class246_Sub1_Sub13.method2701(false, 478210754, true);
			N = false;
		}
	}

	final Class211 method1709(int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_) {
		return null;
	}

	final native void p(int i);

	final int method1710(int i, int i_124_) {
		int i_125_ = i & 0xfffff;
		int i_126_ = i_124_ & 0xfffff;
		return i_125_ & i_126_ ^ i_126_;
	}

	final native void X(int i, int i_127_, int i_128_, int[] is);

	final boolean method1702() {
		return true;
	}

	final void method1679(int i, Class246_Sub41[] class246_sub41s) {
		int i_129_ = 0;
		for (int i_130_ = 0; i_130_ < i; i_130_++) {
			y[i_129_++] = class246_sub41s[i_130_].method2317(false);
			y[i_129_++] = class246_sub41s[i_130_].method2318((byte) 27);
			y[i_129_++] = class246_sub41s[i_130_].method2321((byte) -96);
			y[i_129_++] = class246_sub41s[i_130_].method2322(116);
			K[i_130_] = class246_sub41s[i_130_].method2316(false);
			y[i_129_++] = class246_sub41s[i_130_].method2319((byte) -117);
		}
		za(i, y, K);
	}

	final void method1748(Class_t[] class_ts, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		if (class130_sub5s == null)
			E().TA(this, class_ts, class_c, null, -1, i);
		else {
			Class130_Sub5 class130_sub5 = class130_sub5s[0];
			v[5] = 0;
			E().TA(this, class_ts, class_c, v, -1, i);
			((Class130_Sub5) class130_sub5).anInt4813 = v[0];
			((Class130_Sub5) class130_sub5).anInt4811 = v[1];
			((Class130_Sub5) class130_sub5).anInt4815 = v[2];
			((Class130_Sub5) class130_sub5).anInt4812 = v[3];
			((Class130_Sub5) class130_sub5).anInt4816 = v[4];
			((Class130_Sub5) class130_sub5).aBool4814 = v[5] != 0;
		}
	}

	final void method1713(Canvas canvas) {
		za var_za = (za) L.method544((long) canvas.hashCode(), 127);
		Dimension dimension = canvas.getSize();
		var_za.H(canvas, dimension.width, dimension.height);
		if (canvas != null && canvas == H)
			method1691(canvas);
	}

	final boolean method1742() {
		return false;
	}

	final void method1703(Class_t class_t, Class129 class129, Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		a(class129, true);
		if (class130_sub5 == null)
			E().ba(this, class_t, class_c, null, i, J, B, w, G, D, ((Class129) class129).aClass220_1802.method1430(-77), E);
		else {
			v[5] = 0;
			E().ba(this, class_t, class_c, v, i, J, B, w, G, D, ((Class129) class129).aClass220_1802.method1430(52), E);
			((Class130_Sub5) class130_sub5).anInt4813 = v[0];
			((Class130_Sub5) class130_sub5).anInt4811 = v[1];
			((Class130_Sub5) class130_sub5).anInt4815 = v[2];
			((Class130_Sub5) class130_sub5).anInt4812 = v[3];
			((Class130_Sub5) class130_sub5).anInt4816 = v[4];
			((Class130_Sub5) class130_sub5).aBool4814 = v[5] != 0;
		}
		da var_da = (da) class_t;
		var_da.method1843(0, class_c);
	}

	final void method1718(Class129 class129) {
		a(class129, false);
		E().G(this, J, B, w, G, ((Class129) class129).aClass220_1802.method1430(103));
	}

	final void method1677() {
		/* empty */
	}

	final native void g(float f, float f_131_);

	final native void B(float f);

	final native int a();

	final void method1735(int i, int i_132_, int i_133_, int i_134_) {
		/* empty */
	}

	final Class246_Sub41 method1751(int i, int i_135_, int i_136_, int i_137_, int i_138_, float f) {
		return new Class246_Sub41_Sub2(i, i_135_, i_136_, i_137_, i_138_, f);
	}

	final native int ZA();

	final void method1714(int i) {
		P[i].method744();
	}

	final void method1688() {
		int i = 0;
		while (i < 9) {
			try {
				synchronized (H.getTreeLock()) {
					I.ka();
				}
				return;
			} catch (Exception exception) {
				Class247.method1580(200L, -5184);
				i++;
			}
		}
		synchronized (H.getTreeLock()) {
			I.ka();
		}
	}

	final native void l();

	final native void T(int i, float f, float f_139_, float f_140_, float f_141_, float f_142_);

	private final native void aa(short i, byte i_143_, byte i_144_, boolean bool, boolean bool_145_, boolean bool_146_, byte i_147_, byte i_148_, byte i_149_, int i_150_, int i_151_, boolean bool_152_, boolean bool_153_);

	final native void da(int[] is);

	private final native void q(short i, byte i_154_, byte i_155_, boolean bool, boolean bool_156_, boolean bool_157_, byte i_158_, byte i_159_, byte i_160_, int i_161_, int i_162_, boolean bool_163_, boolean bool_164_, int[] is);

	final void method1729(Class211 class211) {
		/* empty */
	}

	final void method1724(int i) {
		O = i;
		P = new Class_n[O];
		for (int i_165_ = 0; i_165_ < O; i_165_++)
			P[i_165_] = new Class_n(this, z, C);
	}

	private final Object SA() {
		return new Class_p();
	}

	private final void ha() {
		System.gc();
		System.runFinalization();
		Class227.method1452(true);
	}

	final void method1707() {
		/* empty */
	}

	final void method1691(Canvas canvas) {
		if (canvas != null) {
			za var_za = (za) L.method544((long) canvas.hashCode(), 126);
			H = canvas;
			I = var_za;
			PA(var_za);
		} else {
			H = null;
			I = null;
			PA(null);
		}
	}

	final native int[] F(int i, int i_166_, int i_167_, int i_168_);

	private final boolean R(short i) {
		synchronized (this) {
			Class238 class238 = ((Class260) this).anInterface6_3714.method17(-31305, i);
			if (class238 == null)
				return false;
			aa(i, ((Class238) class238).aByte3344, ((Class238) class238).aByte3338, ((Class238) class238).aBool3340, ((Class238) class238).aBool3339, ((Class238) class238).aBool3348, ((Class238) class238).aByte3345, ((Class238) class238).aByte3350, ((Class238) class238).aByte3343, ((Class238) class238).aShort3354, ((Class238) class238).anInt3341, ((Class238) class238).aBool3352, ((Class238) class238).aBool3353);
		}
		return true;
	}

	final Class_u method1725(int i) {
		na var_na = new na(this, i);
		t.method1101(false, var_na);
		return var_na;
	}

	final boolean method1700() {
		return false;
	}

	final boolean method1732() {
		return true;
	}

	final void method1744(int i) {
		P[i].method742();
	}

	final void method1685(Class_u class_u) {
		u = (na) class_u;
		I(class_u);
	}

	final native boolean JA(int i, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_);

	final void method1743(int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_) {
		RA(i, i_174_, i_175_, i_176_, i_177_, i_178_);
	}

	final Class_t method1695(Class103 class103, int i, int i_179_, int i_180_, int i_181_) {
		return new da(this, u, class103, i, i_179_, i_180_, i_181_);
	}

	final boolean method1727() {
		return false;
	}

	final Class_c method1730() {
		return A;
	}

	final Class116 method1716(Class73 class73, Class10[] class10s, boolean bool) {
		if (bool)
			return new Class_s(this, u, class73, class10s, null);
		return new ka(this, u, class73, class10s, null);
	}

	final void method1750(boolean bool) {
		/* empty */
	}

	final boolean method1686() {
		return true;
	}

	final void method1704(Canvas canvas) {
		if (H == canvas)
			method1691(null);
		za var_za = (za) L.method544((long) canvas.hashCode(), 127);
		if (var_za != null)
			var_za.unlink((byte) -78);
		var_za.method2351();
	}

	public qa(int i, Canvas canvas, Interface6 interface6, Signlink class52) {
		super(i, interface6);
		z = 4096;
		L = new Class85(4);
		N = false;
		try {

			// if (!x.booleanValue()) {
			// if (class52 != null) {
			// class52.method346(this.getClass(), 83);
			// x = Boolean.TRUE;
			// } else {
			// System.loadLibrary("jawt");
			// System.loadLibrary("sw3d");
			// x = Boolean.TRUE;
			// }
			// }
			// if (!x.booleanValue())
			// throw new RuntimeException("");

			if (!NativeLibraryLoader.loadNative("sw3d")) {
				throw new RuntimeException("Cannot invoke sw3d");
			}

			K(((Class260) this).anInterface6_3714, 0, 0);
			Class190.method1244(false, false, true);
			N = true;
			if (canvas != null) {
				method1690(canvas);
				method1691(canvas);
			}
			A = new Class_i();
			ea(new Class_i());
			method1724(1);
			method1714(0);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw new RuntimeException();
		}
	}

	final Class_n E() {
		for (int i = 0; i < O; i++) {
			if (((Class_n) P[i]).aRunnable1517 == Thread.currentThread())
				return P[i];
		}
		return null;
	}

	final Class211 method1739(Class211 class211, Class211 class211_182_, float f, Class211 class211_183_) {
		return null;
	}

	final native void O(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_);

	final native int w();

	private final boolean sa(short i) {
		synchronized (((Class260) this).anInterface6_3714) {
			if (!((Class260) this).anInterface6_3714.method13(i, 19378))
				return false;
			Class238 class238 = ((Class260) this).anInterface6_3714.method17(-31305, i);
			if (class238 == null)
				return false;
			int[] is;
			if (((Class238) class238).aBool3339 && ((Class238) class238).aBool3340)
				is = ((Class260) this).anInterface6_3714.method14(true, 5754, i, 0.7F, 128, 128);
			else
				is = ((Class260) this).anInterface6_3714.method16(true, i, false, 0.7F, 128, 128);
			q(i, ((Class238) class238).aByte3344, ((Class238) class238).aByte3338, ((Class238) class238).aBool3340, ((Class238) class238).aBool3339, ((Class238) class238).aBool3348, ((Class238) class238).aByte3345, ((Class238) class238).aByte3350, ((Class238) class238).aByte3343, ((Class238) class238).aShort3354, ((Class238) class238).anInt3341, ((Class238) class238).aBool3352, ((Class238) class238).aBool3353, is);
		}
		return true;
	}

	final boolean method1692() {
		return true;
	}

	static {
		v = new int[6];
		y = s;
		w = new int[8191];
		E = s;
		B = new int[8191];
		D = new byte[8191];
		J = s;
		G = new short[8191];
		F = new float[20];
		K = F;
	}
}
