
/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

class Class194 {
	private Class260_Sub2 aClass260_Sub2_2724;
	Buffer aNativeBuffer2725;

	final void method1274(byte[] is, int i) {
		if (((Class194) this).aNativeBuffer2725 == null || ((Class194) this).aNativeBuffer2725.getSize() < i)
			((Class194) this).aNativeBuffer2725 = ((Class260_Sub2) aClass260_Sub2_2724).f_pe.a(i, false);
		((Class194) this).aNativeBuffer2725.a(is, 0, 0, i);
	}

	Class194(Class260_Sub2 class260_sub2, byte[] is, int i) {
		aClass260_Sub2_2724 = class260_sub2;
		((Class194) this).aNativeBuffer2725 = ((Class260_Sub2) aClass260_Sub2_2724).f_pe.a(i, false);
		if (is != null)
			((Class194) this).aNativeBuffer2725.a(is, 0, 0, i);
	}

	Class194(Class260_Sub2 class260_sub2, Buffer nativebuffer) {
		aClass260_Sub2_2724 = class260_sub2;
		((Class194) this).aNativeBuffer2725 = nativebuffer;
	}
}
