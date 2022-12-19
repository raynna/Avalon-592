/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class175 {
	private HashMap aClass54_2469 = new HashMap(128);
	private Class_fs aClass_fs2470;
	static int anInt2471;
	static int anInt2472;
	static int anInt2473;
	static int anInt2474;
	static int anInt2475;

	final void method1150(byte i, int i_0_) {
		try {
			int i_1_ = 126 / ((49 - i) / 39);
			anInt2472++;
			synchronized (aClass54_2469) {
				aClass54_2469.method380(i_0_, -50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.C(" + i + ',' + i_0_ + ')');
		}
	}

	final Class207 method1151(int i, int i_2_) {
		try {
			anInt2473++;
			Class207 class207;
			synchronized (aClass54_2469) {
				class207 = (Class207) aClass54_2469.method379((long) i_2_, (byte) 58);
			}
			if (class207 != null)
				return class207;
			byte[] is = aClass_fs2470.method91(i_2_, 1, 90);
			class207 = new Class207();
			if (i != -18411)
				method1154(41);
			if (is != null)
				class207.method1361(-1, new BufferStream(is));
			synchronized (aClass54_2469) {
				aClass54_2469.method371(1, (long) i_2_, class207);
			}
			return class207;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.B(" + i + ',' + i_2_ + ')');
		}
	}

	static final void method1152(int i, int i_3_, int i_4_, int i_5_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_3_][i_4_];
		if (class147 != null) {
			Class59_Sub2 class59_sub2 = ((Class147) class147).aClass59_Sub2_2153;
			Class59_Sub2 class59_sub2_6_ = ((Class147) class147).aClass59_Sub2_2159;
			if (class59_sub2 != null) {
				((Class59_Sub2) class59_sub2).anInt4540 = (((Class59_Sub2) class59_sub2).anInt4540 * i_5_ / (16 << Class126.anInt1781 - 7));
				((Class59_Sub2) class59_sub2).anInt4541 = (((Class59_Sub2) class59_sub2).anInt4541 * i_5_ / (16 << Class126.anInt1781 - 7));
			}
			if (class59_sub2_6_ != null) {
				((Class59_Sub2) class59_sub2_6_).anInt4540 = (((Class59_Sub2) class59_sub2_6_).anInt4540 * i_5_ / (16 << Class126.anInt1781 - 7));
				((Class59_Sub2) class59_sub2_6_).anInt4541 = (((Class59_Sub2) class59_sub2_6_).anInt4541 * i_5_ / (16 << Class126.anInt1781 - 7));
			}
		}
	}

	final void method1153(int i) {
		try {
			synchronized (aClass54_2469) {
				if (i <= 87)
					method1154(71);
				aClass54_2469.method369(false);
			}
			anInt2471++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.E(" + i + ')');
		}
	}

	Class175(Class101 class101, int i, Class_fs class_fs) {
		try {
			aClass_fs2470 = class_fs;
			aClass_fs2470.method95(1, 28724);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("qd.<init>(" + (class101 != null ? "{...}" : "null") + ',' + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1154(int i) {
		try {
			synchronized (aClass54_2469) {
				aClass54_2469.method383(80);
				if (i != 7)
					aClass54_2469 = null;
			}
			anInt2474++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "qd.A(" + i + ')');
		}
	}

	static {
		new Class67("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.", "Para evitar outros vetos, leia as regras.");
	}
}
