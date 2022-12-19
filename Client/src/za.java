
/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class za extends Node {
	long nativeid;
	private Canvas aCanvas5622;

	final native void d(int i, int i_0_, int i_1_, int i_2_);

	final void method2351() {
		ca();
		((za) this).nativeid = 0L;
		aCanvas5622 = null;
	}

	protected final void finalize() {
		if (((za) this).nativeid != 0L)
			ca();
	}

	final native void H(Canvas canvas, int i, int i_3_);

	final native void ka();

	private final native void ca();

	private final native void r(qa var_qa, Canvas canvas, int i, int i_4_);

	za(qa var_qa, Canvas canvas) {
		aCanvas5622 = canvas;
		Dimension dimension = canvas.getSize();
		r(var_qa, aCanvas5622, dimension.width, dimension.height);
	}
}
