/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62 {
	int[] anIntArray847;
	int anInt848;
	int[] anIntArray849;
	int anInt850;

	Class62() {
		Class246_Sub9.method1846(16);
		((Class62) this).anInt850 = (Class246_Sub9.method1849() != 0 ? Class246_Sub9.method1846(4) + 1 : 1);
		if (Class246_Sub9.method1849() != 0)
			Class246_Sub9.method1846(8);
		Class246_Sub9.method1846(2);
		if (((Class62) this).anInt850 > 1)
			((Class62) this).anInt848 = Class246_Sub9.method1846(4);
		((Class62) this).anIntArray847 = new int[((Class62) this).anInt850];
		((Class62) this).anIntArray849 = new int[((Class62) this).anInt850];
		for (int i = 0; i < ((Class62) this).anInt850; i++) {
			Class246_Sub9.method1846(8);
			((Class62) this).anIntArray847[i] = Class246_Sub9.method1846(8);
			((Class62) this).anIntArray849[i] = Class246_Sub9.method1846(8);
		}
	}
}
