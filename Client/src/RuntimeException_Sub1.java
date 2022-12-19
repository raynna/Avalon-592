
/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub1 extends RuntimeException {
	public static int anInt7061;
	private String aString7062;
	private Throwable aThrowable7063;
	public static int anInt7064;

	public static void method2885(Throwable throwable, String string, Applet applet, byte i) {
		try {
			try {
				String string_0_ = "";
				if (null != throwable)
					string_0_ = method2888(throwable, true);
				if (null != string) {
					if (null != throwable)
						string_0_ += " | ";
					string_0_ += (String) string;
				}
				method2887(-105, string_0_);
				string_0_ = method2889(":", "%3a", 0, string_0_);
				string_0_ = method2889("@", "%40", 0, string_0_);
				string_0_ = method2889("&", "%26", 0, string_0_);
				int i_1_ = 122 / ((i - -36) / 61);
				string_0_ = method2889("#", "%23", 0, string_0_);
				URL url = new URL(applet.getCodeBase(), ("loadererror.ws?c=" + anInt7061 + "&v1=" + Signlink.aString747 + "&v2=" + Signlink.aString731 + "&e=" + string_0_));
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static RuntimeException_Sub1 method2886(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		try {
			RuntimeException_Sub1 runtimeexception_sub1_2_;
			if (throwable instanceof RuntimeException_Sub1) {
				runtimeexception_sub1_2_ = (RuntimeException_Sub1) throwable;
				StringBuffer stringbuffer = new StringBuffer();
				RuntimeException_Sub1 runtimeexception_sub1_3_ = runtimeexception_sub1_2_;
				runtimeexception_sub1_3_.aString7062 = stringbuffer.append(runtimeexception_sub1_3_.aString7062).append(' ').append(string).toString();
			} else
				runtimeexception_sub1_2_ = new RuntimeException_Sub1(throwable, string);
			runtimeexception_sub1 = runtimeexception_sub1_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return runtimeexception_sub1;
	}

	private static final void method2887(int i, String string) {
		try {
			System.out.println("Error: " + method2889("%0a", "\n", 0, string));
			if (i >= -72)
				method2885(null, null, null, (byte) 50);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static String method2888(Throwable throwable, boolean bool) throws IOException {
		boolean bool_4_ = Class23.aBool335;
		String string;
		try {
			String string_5_;
			do {
				if (throwable instanceof RuntimeException_Sub1) {
					RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
					string_5_ = runtimeexception_sub1.aString7062 + " | ";
					throwable = runtimeexception_sub1.aThrowable7063;
					if (!bool_4_)
						break;
					int i = anInt7064;
					anInt7064 = ++i;
				}
				string_5_ = "";
			} while (false);
			if (bool != true)
				anInt7061 = -15;
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			String string_6_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(new StringReader(string_6_));
			String string_7_ = bufferedreader.readLine();
			do {
				String string_8_ = bufferedreader.readLine();
				if (null == string_8_)
					break;
				int i = string_8_.indexOf('(');
				int i_9_ = string_8_.indexOf(')', 1 + i);
				String string_10_;
				do {
					if (-1 != i) {
						string_10_ = string_8_.substring(0, i);
						if (!bool_4_)
							break;
					}
					string_10_ = string_8_;
				} while (false);
				string_10_ = string_10_.trim();
				string_10_ = string_10_.substring(1 + string_10_.lastIndexOf(' '));
				string_10_ = string_10_.substring(1 + string_10_.lastIndexOf('\t'));
				string_5_ += string_10_;
				if ((i ^ 0xffffffff) != 0 && (i_9_ ^ 0xffffffff) != 0) {
					int i_11_ = string_8_.indexOf(".java:", i);
					if (0 <= i_11_)
						string_5_ += string_8_.substring(5 + i_11_, i_9_);
				}
				string_5_ += ' ';
			} while (!bool_4_);
			string_5_ += "| " + (String) string_7_;
			string = string_5_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return string;
	}

	private static final String method2889(String string, String string_12_, int i, String string_13_) {
		boolean bool = Class23.aBool335;
		String string_14_;
		try {
			if (i != 0)
				anInt7061 = -62;
			int i_15_ = string_13_.indexOf(string);
			while (0 != (i_15_ ^ 0xffffffff)) {
				string_13_ = (string_13_.substring(0, i_15_) + string_12_ + string_13_.substring(string.length() + i_15_));
				i_15_ = string_13_.indexOf(string, string_12_.length() + i_15_);
				if (bool)
					break;
			}
			string_14_ = string_13_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return string_14_;
	}

	private RuntimeException_Sub1(Throwable throwable, String string) {
		try {
			aString7062 = string;
			aThrowable7063 = throwable;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
