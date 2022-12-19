
/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class80 {
	static final Object method519(byte i, Applet applet, String string, Object[] objects) throws Throwable {
		try {
			if (i < 5)
				return null;
			return JSObject.getWindow(applet).call(string, objects);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final void method520(String string, Applet applet, boolean bool) throws Throwable {
		try {
			if (bool == false)
				JSObject.getWindow(applet).eval(string);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Object method521(Applet applet, String string, int i) throws Throwable {
		try {
			if (i <= 38)
				return null;
			return JSObject.getWindow(applet).call(string, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
