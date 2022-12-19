/* Class246_Sub37_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub37_Sub2 extends Class246_Sub37 {
	private Class166 aClass166_6295 = new Class166();
	private Class166 aClass166_6296 = new Class166();
	private int anInt6297 = -1;
	private int anInt6298 = 0;

	final synchronized int method2625() {
		return aClass166_6295.method1112(0);
	}

	final synchronized void method2626(Class246_Sub37 class246_sub37) {
		aClass166_6295.method1097(1245184, class246_sub37);
	}

	final synchronized void method2627(Class246_Sub37 class246_sub37) {
		class246_sub37.unlink((byte) 86);
	}

	final Class246_Sub37 method2256() {
		return (Class246_Sub37) aClass166_6295.method1108((byte) -112);
	}

	private final void method2628(int[] is, int i, int i_0_) {
		for (Class246_Sub37 class246_sub37 = (Class246_Sub37) aClass166_6295.method1104(88); class246_sub37 != null; class246_sub37 = (Class246_Sub37) aClass166_6295.method1108((byte) -112))
			class246_sub37.method2257(is, i, i_0_);
	}

	final Class246_Sub37 method2259() {
		return (Class246_Sub37) aClass166_6295.method1104(114);
	}

	private final void method2629(Class246_Sub42 class246_sub42) {
		class246_sub42.unlink((byte) -123);
		class246_sub42.method2344();
		Node class246 = (((Node) ((Class166) aClass166_6296).aClass246_2343).next);
		if (class246 == ((Class166) aClass166_6296).aClass246_2343)
			anInt6297 = -1;
		else
			anInt6297 = ((Class246_Sub42) (Class246_Sub42) class246).anInt5595;
	}

	private final void method2630(Node class246, Class246_Sub42 class246_sub42) {
		for (/**/; (class246 != ((Class166) aClass166_6296).aClass246_2343 && (((Class246_Sub42) (Class246_Sub42) class246).anInt5595 <= ((Class246_Sub42) class246_sub42).anInt5595)); class246 = ((Node) class246).next) {
			/* empty */
		}
		Class59_Sub2_Sub3.method2723(class246, class246_sub42, 65);
		anInt6297 = ((Class246_Sub42) (Class246_Sub42) (((Node) ((Class166) aClass166_6296).aClass246_2343).next)).anInt5595;
	}

	private final void method2631(int i) {
		for (Class246_Sub37 class246_sub37 = (Class246_Sub37) aClass166_6295.method1104(107); class246_sub37 != null; class246_sub37 = (Class246_Sub37) aClass166_6295.method1108((byte) -112))
			class246_sub37.method2260(i);
	}

	private final void method2632() {
		if (anInt6298 > 0) {
			for (Class246_Sub42 class246_sub42 = (Class246_Sub42) aClass166_6296.method1104(88); class246_sub42 != null; class246_sub42 = (Class246_Sub42) aClass166_6296.method1108((byte) -112))
				((Class246_Sub42) class246_sub42).anInt5595 -= anInt6298;
			anInt6297 -= anInt6298;
			anInt6298 = 0;
		}
	}

	final int method2258() {
		return 0;
	}

	final synchronized void method2260(int i) {
		do {
			if (anInt6297 < 0) {
				method2631(i);
				break;
			}
			if (anInt6298 + i < anInt6297) {
				anInt6298 += i;
				method2631(i);
				break;
			}
			int i_1_ = anInt6297 - anInt6298;
			method2631(i_1_);
			i -= i_1_;
			anInt6298 += i_1_;
			method2632();
			Class246_Sub42 class246_sub42 = (Class246_Sub42) aClass166_6296.method1104(53);
			synchronized (class246_sub42) {
				int i_2_ = class246_sub42.method2345(this);
				if (i_2_ < 0) {
					((Class246_Sub42) class246_sub42).anInt5595 = 0;
					method2629(class246_sub42);
				} else {
					((Class246_Sub42) class246_sub42).anInt5595 = i_2_;
					method2630(((Node) class246_sub42).next, class246_sub42);
				}
			}
		} while (i != 0);
	}

	final synchronized void method2254(int[] is, int i, int i_3_) {
		do {
			if (anInt6297 < 0) {
				method2628(is, i, i_3_);
				break;
			}
			if (anInt6298 + i_3_ < anInt6297) {
				anInt6298 += i_3_;
				method2628(is, i, i_3_);
				break;
			}
			int i_4_ = anInt6297 - anInt6298;
			method2628(is, i, i_4_);
			i += i_4_;
			i_3_ -= i_4_;
			anInt6298 += i_4_;
			method2632();
			Class246_Sub42 class246_sub42 = (Class246_Sub42) aClass166_6296.method1104(112);
			synchronized (class246_sub42) {
				int i_5_ = class246_sub42.method2345(this);
				if (i_5_ < 0) {
					((Class246_Sub42) class246_sub42).anInt5595 = 0;
					method2629(class246_sub42);
				} else {
					((Class246_Sub42) class246_sub42).anInt5595 = i_5_;
					method2630(((Node) class246_sub42).next, class246_sub42);
				}
			}
		} while (i_3_ != 0);
	}

	public Class246_Sub37_Sub2() {
		/* empty */
	}
}
