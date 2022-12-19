
/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 extends OutputStream {
	static boolean aBool4488 = false;
	static int anInt4489 = -1;
	static int anInt4490;
	static int anInt4491;
	static int anInt4492;

	public final void write(int i) throws IOException {
		try {
			anInt4491++;
			throw new IOException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gj.write(" + i + ')');
		}
	}

	static final int method2011(int i, int i_0_) {
		try {
			anInt4492++;
			if (i_0_ != -1)
				return -16;
			return 0x7f & i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gj.A(" + i + ',' + i_0_ + ')');
		}
	}
}
