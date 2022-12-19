
/* Class232_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class Class232_Sub1 extends Class232 implements KeyListener, FocusListener {
	static int anInt5537;
	static int anInt5538;
	static int anInt5539;
	private Class188_Sub1 aClass188_Sub1_5540;
	static int anInt5541;
	static int anInt5542;
	private Class188_Sub1 aClass188_Sub1_5543;
	static int anInt5544;
	static int anInt5545;
	static int anInt5546;
	static int anInt5547;
	private Class188_Sub1 aClass188_Sub1_5548;
	static int anInt5549;
	static int anInt5550;
	static int anInt5551;
	private boolean[] aBoolArray5552 = new boolean[112];
	static int anInt5553;
	static int anInt5554;
	static int anInt5555;
	private Component aComponent5556;
	static int anInt5557;

	private final void method2323(byte i, int i_0_, char c, int id) {
		try {
			int i_2_ = 43 % ((i - 49) / 62);
			anInt5546++;
			Class188_Sub1 class188_sub1 = new Class188_Sub1();
			((Class188_Sub1) class188_sub1).anInt3919 = id;
			((Class188_Sub1) class188_sub1).anInt3922 = i_0_;
			((Class188_Sub1) class188_sub1).aChar3921 = c;
			((Class188_Sub1) class188_sub1).aLong3915 = Class151.time(-86);
			do {
				if (aClass188_Sub1_5543 != null) {
					((Class188_Sub1) aClass188_Sub1_5543).aClass188_Sub1_3917 = class188_sub1;
					if (!client.f_ob)
						break;
				}
				aClass188_Sub1_5540 = class188_sub1;
			} while (false);
			aClass188_Sub1_5543 = class188_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.B(" + i + ',' + i_0_ + ',' + c + ',' + id + ')'));
		}
	}

	public final synchronized void focusLost(FocusEvent focusevent) {
		try {
			method2323((byte) -127, -1, '\0', 0);
			anInt5550++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	static final int method2324(int i, int i_3_, int i_4_) {
		try {
			if ((i ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
				int i_5_ = i;
				i = i_3_;
				i_3_ = i_5_;
			}
			anInt5537++;
			int i_6_;
			for (/**/; (i_3_ ^ 0xffffffff) != -1; i_3_ = i_6_) {
				i_6_ = i % i_3_;
				i = i_3_;
			}
			if (i_4_ != -1)
				return 111;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.D(" + i + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final synchronized void method1486(int i) {
		try {
			anInt5555++;
			for (Class188_Sub1 class188_sub1 = aClass188_Sub1_5540; class188_sub1 != null; class188_sub1 = ((Class188_Sub1) class188_sub1).aClass188_Sub1_3917) {
				if ((((Class188_Sub1) class188_sub1).anInt3922 ^ 0xffffffff) != -1) {
					if ((((Class188_Sub1) class188_sub1).anInt3922 ^ 0xffffffff) == -2)
						aBoolArray5552[(((Class188_Sub1) class188_sub1).anInt3919)] = false;
					else if ((((Class188_Sub1) class188_sub1).anInt3922 ^ 0xffffffff) == 0) {
						for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -113; i_7_++)
							aBoolArray5552[i_7_] = false;
					}
				} else {
					if (((Class188_Sub1) class188_sub1).anInt3919 >= 0)
						((Class188_Sub1) class188_sub1).aBool3920 = !(aBoolArray5552[((Class188_Sub1) class188_sub1).anInt3919]);
					aBoolArray5552[((Class188_Sub1) class188_sub1).anInt3919] = true;
				}
			}
			if (i < 13)
				aComponent5556 = null;
			aClass188_Sub1_5548 = aClass188_Sub1_5540;
			aClass188_Sub1_5543 = null;
			aClass188_Sub1_5540 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.I(" + i + ')');
		}
	}

	final Class188 method1482(int i) {
		try {
			anInt5557++;
			Class188_Sub1 class188_sub1 = aClass188_Sub1_5548;
			if (i != 26817)
				focusLost(null);
			for (/**/; (class188_sub1 != null && ((((Class188_Sub1) class188_sub1).anInt3922 ^ 0xffffffff) == 0)); class188_sub1 = ((Class188_Sub1) class188_sub1).aClass188_Sub1_3917) {
				/* empty */
			}
			if (class188_sub1 == null)
				aClass188_Sub1_5548 = null;
			else
				aClass188_Sub1_5548 = ((Class188_Sub1) class188_sub1).aClass188_Sub1_3917;
			return class188_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.C(" + i + ')');
		}
	}

	final boolean method1488(int i, int i_8_) {
		try {
			anInt5542++;
			if ((i_8_ ^ 0xffffffff) > -1 || (i_8_ ^ 0xffffffff) <= -113)
				return false;
			if (i >= -70)
				method2324(5, 106, -32);
			return aBoolArray5552[i_8_];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.G(" + i + ',' + i_8_ + ')');
		}
	}

	final void method1485(int i) {
		try {
			method2327((byte) -87);
			if (i > -86)
				aClass188_Sub1_5540 = null;
			anInt5551++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.H(" + i + ')');
		}
	}

	private final void method2325(KeyEvent keyevent, byte i, int i_9_) {
		try {
			anInt5538++;
			if (i > -97)
				keyPressed(null);
			int i_10_ = keyevent.getKeyCode();
			if (i_10_ == 0)
				i_10_ = 0;
			else if ((i_10_ ^ 0xffffffff) <= -1 && ((Class169.anIntArray2408.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff))) {
				i_10_ = Class169.anIntArray2408[i_10_];
				if (i_9_ != 0 || (0x80 & i_10_ ^ 0xffffffff) == -1)
					i_10_ &= ~0x80;
				else
					i_10_ = 0;
			} else
				i_10_ = 0;
			if (i_10_ != 0) {
				method2323((byte) -23, i_9_, '\0', i_10_);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.E(" + (keyevent != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ')'));
		}
	}

	private final void method2326(int i, Component component) {
		try {
			method2327((byte) -87);
			anInt5545++;
			if (i != 0)
				aClass188_Sub1_5540 = null;
			aComponent5556 = component;
			Method method = Signlink.aMethod750;
			if (method != null) {
				try {
					method.invoke(aComponent5556, new Object[] { Boolean.FALSE });
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			aComponent5556.addKeyListener(this);
			aComponent5556.addFocusListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.J(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2327(byte i) {
		try {
			anInt5553++;
			if (aComponent5556 != null) {
				aComponent5556.removeKeyListener(this);
				aComponent5556.removeFocusListener(this);
				aComponent5556 = null;
				for (int i_11_ = 0; i_11_ < 112; i_11_++)
					aBoolArray5552[i_11_] = false;
				aClass188_Sub1_5540 = null;
				aClass188_Sub1_5543 = null;
				if (i != -87)
					method1485(97);
				aClass188_Sub1_5548 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.A(" + i + ')');
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			anInt5549++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vr.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void keyReleased(KeyEvent keyevent) {
		try {
			method2325(keyevent, (byte) -105, 1);
			anInt5554++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.keyReleased(" + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void keyTyped(KeyEvent keyevent) {
		try {
			anInt5541++;
			char c = keyevent.getKeyChar();
			if (c != 0 && Class246_Sub30_Sub1.method2448(false, c)) {
				method2323((byte) 124, 2, c, -1);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.keyTyped(" + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void keyPressed(KeyEvent keyevent) {
		try {
			method2325(keyevent, (byte) -116, 0);
			anInt5539++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.keyPressed(" + (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	Class232_Sub1(Component component) {
		try {
			Class110.method764((byte) -106);
			method2326(0, component);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.<init>(" + (component != null ? "{...}" : "null") + ')'));
		}
	}

	static final float method2328(float f, float f_12_, int i, int i_13_, float f_14_) {
		try {
			anInt5544++;
			if (i != -129)
				method2324(109, -89, -119);
			float[] fs = Class211_Sub1_Sub2.aFloatArrayArray6530[i_13_];
			return f_14_ * fs[2] + (fs[1] * f_12_ + fs[0] * f);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vr.F(" + f + ',' + f_12_ + ',' + i + ',' + i_13_ + ',' + f_14_ + ')'));
		}
	}

	static {
		new Class67("If you are not, please change your password to something more obscure!", "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !", "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
	}
}
