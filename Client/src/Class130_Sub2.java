/* Class130_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130_Sub2 extends Class130 {
	private Class68 aClass68_3782;
	private long aLong3783;
	private boolean aBool3784 = false;
	int anInt3785 = 0;
	private static boolean[] aBoolArray3786 = new boolean[8];
	Class130_Sub1_Sub1_Sub1[] aClass130_Sub1_Sub1_Sub1Array3787;
	private static boolean[] aBoolArray3788 = new boolean[8];
	boolean aBool3789 = false;
	private long aLong3790;
	Class166 aClass166_3791;
	private int anInt3792;
	int anInt3793;
	private boolean aBool3794;
	int anInt3795;
	private int anInt3796;
	int anInt3797;
	int anInt3798;
	int anInt3799;
	Class129 aClass129_3800;

	final void method1772() {
		aBool3794 = true;
	}

	final void method1773() {
		((Class130_Sub2) this).aBool3789 = true;
		for (Class246_Sub1_Sub11 class246_sub1_sub11 = ((Class246_Sub1_Sub11) ((Class130_Sub2) this).aClass166_3791.method1104(125)); class246_sub1_sub11 != null; class246_sub1_sub11 = (Class246_Sub1_Sub11) ((Class130_Sub2) this).aClass166_3791.method1108((byte) -112)) {
			if (((Class4) (((Class246_Sub1_Sub11) class246_sub1_sub11).aClass4_6237)).anInt36 == 1)
				class246_sub1_sub11.method1756((byte) 115);
		}
		((Class130_Sub2) this).aClass130_Sub1_Sub1_Sub1Array3787 = new Class130_Sub1_Sub1_Sub1[8192];
		((Class130_Sub2) this).anInt3785 = 0;
		aClass68_3782 = new Class68();
		anInt3792 = 0;
		((Class130_Sub2) this).aClass166_3791 = new Class166();
		anInt3796 = 0;
		this.method886(1024);
	}

	final void method1774() {
		aBool3784 = true;
	}

	public static void method1775() {
		aBoolArray3788 = null;
		aBoolArray3786 = null;
	}

	final void method1776(long l) {
		aLong3783 = l;
	}

	final void method1777(Class260 class260, long l, Class19[] class19s, Class162[] class162s, boolean bool) {
		if (!((Class130_Sub2) this).aBool3789) {
			method1783(class260, class19s, bool);
			method1781(class162s, bool);
			aLong3783 = l;
		}
	}

	final void method1778() {
		((Class129) ((Class130_Sub2) this).aClass129_3800).aClass220_1802.method1424(125);
		for (Class130_Sub6 class130_sub6 = (Class130_Sub6) aClass68_3782.method445(62); class130_sub6 != null; class130_sub6 = (Class130_Sub6) aClass68_3782.method442((byte) -71))
			class130_sub6.method2108(true, aLong3790);
	}

	final Class129 method1779() {
		return ((Class130_Sub2) this).aClass129_3800;
	}

	final boolean method1780(Class260 class260, long l) {
		if (aLong3783 != aLong3790)
			method1774();
		else
			method1784();
		if (l - aLong3783 > 750L) {
			method1773();
			return false;
		}
		int i = (int) (l - aLong3790);
		if (aBool3794) {
			for (Class130_Sub6 class130_sub6 = (Class130_Sub6) aClass68_3782.method445(62); class130_sub6 != null; class130_sub6 = (Class130_Sub6) aClass68_3782.method442((byte) -44)) {
				for (int i_0_ = 0; i_0_ < ((Class104) (((Class130_Sub6) class130_sub6).aClass104_4856)).anInt1402; i_0_++)
					class130_sub6.method2105(1, 68, l, !aBool3784, class260);
			}
			aBool3794 = false;
		}
		for (Class130_Sub6 class130_sub6 = (Class130_Sub6) aClass68_3782.method445(62); class130_sub6 != null; class130_sub6 = (Class130_Sub6) aClass68_3782.method442((byte) -73))
			class130_sub6.method2105(i, 93, l, !aBool3784, class260);
		aLong3790 = l;
		return true;
	}

	private final void method1781(Class162[] class162s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray3786[i] = false;
		while_159_: for (Class246_Sub1_Sub11 class246_sub1_sub11 = ((Class246_Sub1_Sub11) ((Class130_Sub2) this).aClass166_3791.method1104(71)); class246_sub1_sub11 != null; class246_sub1_sub11 = (Class246_Sub1_Sub11) ((Class130_Sub2) this).aClass166_3791.method1108((byte) -112)) {
			if (class162s != null) {
				for (int i = 0; i < class162s.length; i++) {
					if ((((Class246_Sub1_Sub11) class246_sub1_sub11).aClass162_6236) == class162s[i] || ((((Class246_Sub1_Sub11) class246_sub1_sub11).aClass162_6236) == ((Class162) class162s[i]).aClass162_2296)) {
						aBoolArray3786[i] = true;
						class246_sub1_sub11.method2616(2);
						continue while_159_;
					}
				}
			}
			if (!bool) {
				class246_sub1_sub11.unlink((byte) -119);
				anInt3796--;
				if (class246_sub1_sub11.method1760(true)) {
					class246_sub1_sub11.method1756((byte) -104);
					Class246_Sub23.anInt4820--;
				}
			}
		}
		if (class162s != null) {
			for (int i = 0; i < class162s.length; i++) {
				if (anInt3796 == 8)
					break;
				if (!aBoolArray3786[i]) {
					Class246_Sub1_Sub11 class246_sub1_sub11 = null;
					if ((((Class4) class162s[i].method1078((byte) 34)).anInt36 == 1) && Class246_Sub23.anInt4820 < 32) {
						class246_sub1_sub11 = new Class246_Sub1_Sub11(class162s[i], this);
						Class90.aClass83_1170.method532((byte) 75, class246_sub1_sub11, (long) (((Class162) class162s[i]).anInt2290));
						Class246_Sub23.anInt4820++;
					}
					if (class246_sub1_sub11 == null)
						class246_sub1_sub11 = new Class246_Sub1_Sub11(class162s[i], this);
					((Class130_Sub2) this).aClass166_3791.method1101(false, class246_sub1_sub11);
					anInt3796++;
					aBoolArray3786[i] = true;
				}
			}
		}
	}

	final void method1782(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class130_Sub2) this).anInt3797 = i;
		((Class130_Sub2) this).anInt3795 = i_1_;
		((Class130_Sub2) this).anInt3798 = i_2_;
		((Class130_Sub2) this).anInt3799 = i_3_;
		((Class130_Sub2) this).anInt3793 = i_4_;
	}

	private final void method1783(Class260 class260, Class19[] class19s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray3788[i] = false;
		while_161_: for (Class130_Sub6 class130_sub6 = (Class130_Sub6) aClass68_3782.method445(62); class130_sub6 != null; class130_sub6 = (Class130_Sub6) aClass68_3782.method442((byte) -86)) {
			if (class19s != null) {
				for (int i = 0; i < class19s.length; i++) {
					if ((((Class130_Sub6) class130_sub6).aClass19_4852 == class19s[i]) || (((Class130_Sub6) class130_sub6).aClass19_4852 == ((Class19) class19s[i]).aClass19_297)) {
						aBoolArray3788[i] = true;
						class130_sub6.method2103(1);
						((Class130_Sub6) class130_sub6).aBool4862 = false;
						continue while_161_;
					}
				}
			}
			if (!bool) {
				if (((Class130_Sub6) class130_sub6).anInt4855 == 0) {
					class130_sub6.method886(1024);
					anInt3792--;
				} else
					((Class130_Sub6) class130_sub6).aBool4862 = true;
			}
		}
		if (class19s != null) {
			for (int i = 0; i < class19s.length; i++) {
				if (anInt3792 == 8)
					break;
				if (!aBoolArray3788[i]) {
					Class130_Sub6 class130_sub6 = new Class130_Sub6(class260, class19s[i], this, aLong3783);
					aClass68_3782.method438(11, class130_sub6);
					anInt3792++;
					aBoolArray3788[i] = true;
				}
			}
		}
	}

	private final void method1784() {
		aBool3784 = false;
	}

	Class130_Sub2(int i) {
		aClass68_3782 = new Class68();
		anInt3792 = 0;
		((Class130_Sub2) this).aClass166_3791 = new Class166();
		aBool3794 = false;
		anInt3796 = 0;
		((Class130_Sub2) this).aClass129_3800 = new Class129();
		((Class130_Sub2) this).aClass130_Sub1_Sub1_Sub1Array3787 = new Class130_Sub1_Sub1_Sub1[8192];
		Class216.aClass68_3008.method438(-120, this);
		aLong3783 = (long) i;
		aLong3790 = (long) i;
		aBool3794 = true;
	}
}
