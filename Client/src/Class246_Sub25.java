/* Class246_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub25 extends Node {
	static int anInt4877;
	static int anInt4878;
	short aShort4879;

	static final void method2114(int[] is, int i, int i_0_, Object[] objects, int i_1_) {
		do {
			try {
				if (i_1_ <= -47) {
					anInt4878++;
					if (i <= i_0_)
						break;
					int i_2_ = (i + i_0_) / 2;
					int i_3_ = i_0_;
					int i_4_ = is[i_2_];
					is[i_2_] = is[i];
					is[i] = i_4_;
					Object object = objects[i_2_];
					objects[i_2_] = objects[i];
					objects[i] = object;
					int i_5_ = (i_4_ ^ 0xffffffff) == -2147483648 ? 0 : 1;
					for (int i_6_ = i_0_; i_6_ < i; i_6_++) {
						if (((i_6_ & i_5_) + i_4_ ^ 0xffffffff) < (is[i_6_] ^ 0xffffffff)) {
							int i_7_ = is[i_6_];
							is[i_6_] = is[i_3_];
							is[i_3_] = i_7_;
							Object object_8_ = objects[i_6_];
							objects[i_6_] = objects[i_3_];
							objects[i_3_++] = object_8_;
						}
					}
					is[i] = is[i_3_];
					is[i_3_] = i_4_;
					objects[i] = objects[i_3_];
					objects[i_3_] = object;
					method2114(is, i_3_ - 1, i_0_, objects, -81);
					method2114(is, i, 1 + i_3_, objects, -58);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ni.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (objects != null ? "{...}" : "null") + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public Class246_Sub25() {
		/* empty */
	}

	Class246_Sub25(short i) {
		try {
			((Class246_Sub25) this).aShort4879 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ni.<init>(" + i + ')');
		}
	}

	static {
		new Class67("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de clan.", "Sua posi\u00e7\u00e3o n\u00e3o \u00e9 alta o suficiente para voc\u00ea entrar nesse canal de cl\u00e3.");
	}
}
