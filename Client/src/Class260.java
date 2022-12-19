
/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

abstract class Class260 {
	static int anInt3710;
	static int anInt3711;
	static int anInt3712;
	static int anInt3713;
	Interface6 anInterface6_3714;
	static int anInt3715;
	static int anInt3716;
	static int anInt3717;
	static int anInt3718;
	int anInt3719;
	static int anInt3720;
	static int anInt3721;
	static int anInt3722;
	static int anInt3723;
	static int anInt3724;
	static OutgoingPacket aClass201_3725;
	static Class_l[] aClass_lArray3726;
	static OutgoingPacket OBJECT_CLICK_3_PACKET;

	abstract void method1677();

	abstract void method1678(boolean bool);

	abstract void method1679(int i, Class246_Sub41[] class246_sub41s);

	abstract void method1680();

	abstract void B(float f);

	final void method1681(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		do {
			try {
				anInt3717++;
				TA(i_2_, i_0_, i_1_, i_3_, 1);
				if (i == 0)
					break;
				method1721(38, -80, -82, -122, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ya.FG(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void AA(int i, int i_4_, int i_5_, int i_6_);

	static final synchronized Class260 method1682(Interface6 interface6, int i, Canvas canvas, int i_7_, byte i_8_, Signlink class52) {
		try {
			anInt3721++;
			int i_9_ = -1;
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -9; i_10_++) {
				if (!Class246_Sub28_Sub8.aBoolArray6074[i_10_]) {
					i_9_ = i_10_;
					break;
				}
			}
			if ((i_9_ ^ 0xffffffff) == 0)
				throw new IllegalStateException("NFTI");
			Object object = null;
			Class260 class260;
			if ((i_7_ ^ 0xffffffff) != -1) {
				if (i_7_ == 1)
					class260 = Class21_Sub4.method2130(i_9_, canvas, -3210, class52, i, interface6);
				else if (i_7_ == 2)
					class260 = Class211_Sub1.method2267((byte) 90, canvas, i_9_, class52, interface6);
				else
					throw new IllegalArgumentException("UM");
			} else
				class260 = Class_b.method567(canvas, 23932, i_9_, interface6);
			int i_11_ = 42 % ((23 - i_8_) / 32);
			Class246_Sub28_Sub8.aBoolArray6074[i_9_] = true;
			return class260;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.NG(" + (interface6 != null ? "{...}" : "null") + ',' + i + ',' + (canvas != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ',' + (class52 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract boolean method1683();

	abstract boolean method1684();

	abstract void method1685(Class_u class_u);

	abstract boolean method1686();

	abstract void method1687(int i);

	abstract void method1688();

	abstract boolean method1689();

	abstract void method1690(Canvas canvas);

	abstract void T(int i, float f, float f_12_, float f_13_, float f_14_, float f_15_);

	abstract void fa(int i, int i_16_, int i_17_, int i_18_);

	abstract void method1691(Canvas canvas);

	abstract void ea(Class_c class_c);

	abstract int YA();

	abstract void TA(int i, int i_19_, int i_20_, int i_21_, int i_22_);

	abstract boolean method1692();

	abstract boolean method1693();

	abstract void method1694(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_);

	abstract Class_t method1695(Class103 class103, int i, int i_29_, int i_30_, int i_31_);

	abstract void method1696(boolean bool);

	final void method1697(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		try {
			if (i_32_ >= -124)
				OA(5, 84, 47, 61);
			b(i_34_, i_33_, i, i_35_, 1);
			anInt3712++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.LG(" + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	abstract void method1698(float f, float f_36_, float f_37_);

	abstract boolean method1699();

	abstract void g(float f, float f_38_);

	protected void finalize() {
		try {
			anInt3720++;
			method1708(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ya.finalize(" + ')');
		}
	}

	abstract int IA();

	abstract boolean method1700();

	abstract int method1701();

	abstract boolean method1702();

	abstract void method1703(Class_t class_t, Class129 class129, Class_c class_c, Class130_Sub5 class130_sub5, int i);

	abstract void method1704(Canvas canvas);

	abstract boolean method1705();

	abstract int w();

	abstract void l();

	abstract void NA(int i, int i_39_, int i_40_, int i_41_, int i_42_);

	abstract Class_l method1706(int[] is, int i, int i_43_, int i_44_, int i_45_);

	abstract void method1707();

	abstract void da(int[] is);

	final void method1708(boolean bool) {
		do {
			try {
				Class246_Sub28_Sub8.aBoolArray6074[((Class260) this).anInt3719] = false;
				anInt3718++;
				method1680();
				if (bool == true)
					break;
				((Class260) this).anInt3719 = 58;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "ya.KG(" + bool + ')');
			}
			break;
		} while (false);
	}

	abstract Class211 method1709(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_);

	abstract int method1710(int i, int i_51_);

	static final void method1711(int i) {
		try {
			if (i != 0)
				aClass_lArray3726 = null;
			anInt3716++;
			if ((Class59.anInt823 ^ 0xffffffff) >= -1)
				Class246_Sub14.aString4438 = "";
			else {
				int i_52_ = 0;
				for (int i_53_ = 0; ((i_53_ ^ 0xffffffff) > (Class55.aStringArray786.length ^ 0xffffffff)); i_53_++) {
					if (Class55.aStringArray786[i_53_].startsWith("--> ") && (++i_52_ ^ 0xffffffff) == (Class59.anInt823 ^ 0xffffffff)) {
						Class246_Sub14.aString4438 = Class55.aStringArray786[i_53_].substring(4);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ya.GG(" + i + ')');
		}
	}

	public static void method1712(int i) {
		try {
			OBJECT_CLICK_3_PACKET = null;
			aClass201_3725 = null;
			if (i < -126)
				aClass_lArray3726 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ya.JG(" + i + ')');
		}
	}

	abstract void method1713(Canvas canvas);

	abstract void e();

	abstract void method1714(int i);

	abstract Class_c method1715();

	abstract int ZA();

	abstract Class116 method1716(Class73 class73, Class10[] class10s, boolean bool);

	abstract void method1717(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_);

	abstract void method1718(Class129 class129);

	abstract void ia(int i, int i_63_);

	abstract void method1719();

	abstract boolean method1720();

	abstract Class_l method1721(int i, int i_64_, int i_65_, int i_66_, boolean bool);

	abstract void method1722();

	abstract int method1723(int i, int i_67_);

	abstract void GA(int i, int i_68_, int i_69_, int i_70_);

	abstract void method1724(int i);

	abstract Class_u method1725(int i);

	abstract Class128 method1726(int i, int i_71_, int[] is, int[] is_72_);

	abstract boolean method1727();

	abstract void method1728(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, Class128 class128, int i_78_, int i_79_);

	abstract void ca(int i, Class128 class128, int i_80_, int i_81_);

	abstract void method1729(Class211 class211);

	abstract void MA(int i);

	abstract float xa();

	abstract Class_c method1730();

	abstract void method1731(Rectangle[] rectangles, int i);

	abstract boolean method1732();

	abstract boolean JA(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_);

	static final void method1733() {
		Class109_Sub1.anInt3755 = 0;
		while_170_: for (int i = 0; i < Class59_Sub2_Sub2.anInt6015; i++) {
			Class121 class121 = Class246_Sub28_Sub5.aClass121Array5996[i];
			if (Class59_Sub2_Sub1.anIntArray5784 != null) {
				for (int i_87_ = 0; i_87_ < Class59_Sub2_Sub1.anIntArray5784.length; i_87_++) {
					if (Class59_Sub2_Sub1.anIntArray5784[i_87_] != -1000000 && ((((Class121) class121).anInt1671 <= Class59_Sub2_Sub1.anIntArray5784[i_87_]) || (((Class121) class121).anInt1664 <= Class59_Sub2_Sub1.anIntArray5784[i_87_])) && ((((Class121) class121).anInt1657 <= Class246_Sub28_Sub4.anIntArray5978[i_87_]) || (((Class121) class121).anInt1674 <= Class246_Sub28_Sub4.anIntArray5978[i_87_])) && ((((Class121) class121).anInt1657 >= InputStream_Sub1.anIntArray4828[i_87_]) || (((Class121) class121).anInt1674 >= InputStream_Sub1.anIntArray4828[i_87_])) && ((((Class121) class121).anInt1661 <= Class59_Sub3_Sub2.anIntArray5885[i_87_]) || (((Class121) class121).anInt1658 <= Class59_Sub3_Sub2.anIntArray5885[i_87_])) && ((((Class121) class121).anInt1661 >= Player.f_vd[i_87_]) || (((Class121) class121).anInt1658 >= Player.f_vd[i_87_])))
						continue while_170_;
				}
			}
			if (((Class121) class121).anInt1662 == 1) {
				int i_88_ = (((Class121) class121).anInt1668 - Class244.anInt3454 + Class125.anInt1777);
				if (i_88_ >= 0 && i_88_ <= Class125.anInt1777 + Class125.anInt1777) {
					int i_89_ = (((Class121) class121).anInt1656 - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777);
					if (i_89_ < 0)
						i_89_ = 0;
					else if (i_89_ > Class125.anInt1777 + Class125.anInt1777)
						continue;
					int i_90_ = (((Class121) class121).anInt1659 - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777);
					if (i_90_ > Class125.anInt1777 + Class125.anInt1777)
						i_90_ = Class125.anInt1777 + Class125.anInt1777;
					else if (i_90_ < 0)
						continue;
					boolean bool = false;
					while (i_89_ <= i_90_) {
						if (Class187_Sub1.aBoolArrayArray4866[i_88_][i_89_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_91_ = (Class246_Sub1_Sub10.anInt6199 - ((Class121) class121).anInt1657);
						if (i_91_ > Class83.anInt1082)
							((Class121) class121).anInt1669 = 1;
						else {
							if (i_91_ >= -Class83.anInt1082)
								continue;
							((Class121) class121).anInt1669 = 2;
							i_91_ = -i_91_;
						}
						((Class121) class121).anInt1654 = ((((Class121) class121).anInt1661 - Class111.anInt1576) << 8) / i_91_;
						((Class121) class121).anInt1672 = ((((Class121) class121).anInt1658 - Class111.anInt1576) << 8) / i_91_;
						((Class121) class121).anInt1670 = ((((Class121) class121).anInt1671 - Class246_Sub28_Sub20.anInt6573) << 8) / i_91_;
						((Class121) class121).anInt1665 = ((((Class121) class121).anInt1664 - Class246_Sub28_Sub20.anInt6573) << 8) / i_91_;
						Class236.aClass121Array3306[Class109_Sub1.anInt3755++] = class121;
					}
				}
			} else if (((Class121) class121).anInt1662 == 2) {
				int i_92_ = (((Class121) class121).anInt1656 - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777);
				if (i_92_ >= 0 && i_92_ <= Class125.anInt1777 + Class125.anInt1777) {
					int i_93_ = (((Class121) class121).anInt1668 - Class244.anInt3454 + Class125.anInt1777);
					if (i_93_ < 0)
						i_93_ = 0;
					else if (i_93_ > Class125.anInt1777 + Class125.anInt1777)
						continue;
					int i_94_ = (((Class121) class121).anInt1666 - Class244.anInt3454 + Class125.anInt1777);
					if (i_94_ > Class125.anInt1777 + Class125.anInt1777)
						i_94_ = Class125.anInt1777 + Class125.anInt1777;
					else if (i_94_ < 0)
						continue;
					boolean bool = false;
					while (i_93_ <= i_94_) {
						if (Class187_Sub1.aBoolArrayArray4866[i_93_++][i_92_]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						int i_95_ = (Class111.anInt1576 - ((Class121) class121).anInt1661);
						if (i_95_ > Class83.anInt1082)
							((Class121) class121).anInt1669 = 3;
						else {
							if (i_95_ >= -Class83.anInt1082)
								continue;
							((Class121) class121).anInt1669 = 4;
							i_95_ = -i_95_;
						}
						((Class121) class121).anInt1655 = ((((Class121) class121).anInt1657 - Class246_Sub1_Sub10.anInt6199) << 8) / i_95_;
						((Class121) class121).anInt1660 = ((((Class121) class121).anInt1674 - Class246_Sub1_Sub10.anInt6199) << 8) / i_95_;
						((Class121) class121).anInt1670 = ((((Class121) class121).anInt1671 - Class246_Sub28_Sub20.anInt6573) << 8) / i_95_;
						((Class121) class121).anInt1665 = ((((Class121) class121).anInt1664 - Class246_Sub28_Sub20.anInt6573) << 8) / i_95_;
						Class236.aClass121Array3306[Class109_Sub1.anInt3755++] = class121;
					}
				}
			} else if (((Class121) class121).anInt1662 == 4) {
				int i_96_ = (((Class121) class121).anInt1671 - Class246_Sub28_Sub20.anInt6573);
				if (i_96_ > Class203.anInt2875) {
					int i_97_ = (((Class121) class121).anInt1656 - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777);
					if (i_97_ < 0)
						i_97_ = 0;
					else if (i_97_ > Class125.anInt1777 + Class125.anInt1777)
						continue;
					int i_98_ = (((Class121) class121).anInt1659 - Class59_Sub2_Sub2.anInt6025 + Class125.anInt1777);
					if (i_98_ > Class125.anInt1777 + Class125.anInt1777)
						i_98_ = Class125.anInt1777 + Class125.anInt1777;
					else if (i_98_ < 0)
						continue;
					int i_99_ = (((Class121) class121).anInt1668 - Class244.anInt3454 + Class125.anInt1777);
					if (i_99_ < 0)
						i_99_ = 0;
					else if (i_99_ > Class125.anInt1777 + Class125.anInt1777)
						continue;
					int i_100_ = (((Class121) class121).anInt1666 - Class244.anInt3454 + Class125.anInt1777);
					if (i_100_ > Class125.anInt1777 + Class125.anInt1777)
						i_100_ = Class125.anInt1777 + Class125.anInt1777;
					else if (i_100_ < 0)
						continue;
					boolean bool = false;
					while_168_: for (int i_101_ = i_99_; i_101_ <= i_100_; i_101_++) {
						for (int i_102_ = i_97_; i_102_ <= i_98_; i_102_++) {
							if (Class187_Sub1.aBoolArrayArray4866[i_101_][i_102_]) {
								bool = true;
								break while_168_;
							}
						}
					}
					if (bool) {
						((Class121) class121).anInt1669 = 5;
						((Class121) class121).anInt1655 = ((((Class121) class121).anInt1657 - Class246_Sub1_Sub10.anInt6199) << 8) / i_96_;
						((Class121) class121).anInt1660 = ((((Class121) class121).anInt1674 - Class246_Sub1_Sub10.anInt6199) << 8) / i_96_;
						((Class121) class121).anInt1654 = ((((Class121) class121).anInt1661 - Class111.anInt1576) << 8) / i_96_;
						((Class121) class121).anInt1672 = ((((Class121) class121).anInt1658 - Class111.anInt1576) << 8) / i_96_;
						Class236.aClass121Array3306[Class109_Sub1.anInt3755++] = class121;
					}
				}
			}
		}
	}

	final void method1734(int i, int i_103_, int i_104_, byte i_105_, int i_106_, int i_107_) {
		try {
			O(i, i_104_, i_103_, i_107_, i_106_, 1);
			if (i_105_ != 58)
				OBJECT_CLICK_3_PACKET = null;
			anInt3711++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.HG(" + i + ',' + i_103_ + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + i_107_ + ')'));
		}
	}

	abstract void UA(int i, int i_108_, int i_109_);

	abstract void method1735(int i, int i_110_, int i_111_, int i_112_);

	final void method1736(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_) {
		try {
			method1753(i, i_117_, i_116_, i_114_, i_113_, 1);
			if (i_115_ != 8)
				anInt3724 = 22;
			anInt3723++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.EG(" + i + ',' + i_113_ + ',' + i_114_ + ',' + i_115_ + ',' + i_116_ + ',' + i_117_ + ')'));
		}
	}

	final void method1737(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_) {
		do {
			try {
				method1743(i_119_, i, i_121_, i_120_, i_118_, 1);
				anInt3715++;
				if (i_122_ == 4)
					break;
				aClass_lArray3726 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ya.MG(" + i + ',' + i_118_ + ',' + i_119_ + ',' + i_120_ + ',' + i_121_ + ',' + i_122_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void X(int i, int i_123_, int i_124_, int[] is);

	abstract void DA(int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, byte[] is, int i_130_, int i_131_);

	abstract Class210 method1738(int i, int i_132_, int[][] is, int[][] is_133_, int i_134_, int i_135_, int i_136_);

	abstract Class211 method1739(Class211 class211, Class211 class211_137_, float f, Class211 class211_138_);

	Class260(int i, Interface6 interface6) {
		try {
			((Class260) this).anInterface6_3714 = interface6;
			((Class260) this).anInt3719 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.<init>(" + i + ',' + (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method1740(Class_t[] class_ts, Class129 class129, Class_c class_c, Class130_Sub5[] class130_sub5s, int i);

	abstract boolean method1741();

	abstract boolean method1742();

	abstract void method1743(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_);

	abstract void OA(int i, int i_144_, int i_145_, int i_146_);

	abstract void p(int i);

	abstract void method1744(int i);

	abstract int a();

	final void method1745(byte i, int i_147_, int i_148_, int i_149_, int i_150_) {
		try {
			anInt3710++;
			if (i != 76)
				fa(110, -37, -74, 11);
			NA(i_149_, i_147_, i_148_, i_150_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.IG(" + i + ',' + i_147_ + ',' + i_148_ + ',' + i_149_ + ',' + i_150_ + ')'));
		}
	}

	static final boolean method1746(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, byte i_158_) {
		try {
			if (i_158_ < 118)
				return false;
			anInt3713++;
			if (i_157_ - -i_154_ <= i_156_ || (i_152_ + i_156_ ^ 0xffffffff) >= (i_157_ ^ 0xffffffff))
				return false;
			if ((i_151_ + i_153_ ^ 0xffffffff) >= (i_155_ ^ 0xffffffff) || (i_155_ + i ^ 0xffffffff) >= (i_151_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ya.OG(" + i + ',' + i_151_ + ',' + i_152_ + ',' + i_153_ + ',' + i_154_ + ',' + i_155_ + ',' + i_156_ + ',' + i_157_ + ',' + i_158_ + ')'));
		}
	}

	abstract void O(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_);

	abstract void method1747(int i);

	abstract void method1748(Class_t[] class_ts, Class_c class_c, Class130_Sub5[] class130_sub5s, int i);

	abstract Class_l method1749(Class10 class10, boolean bool);

	abstract void method1750(boolean bool);

	abstract void b(int i, int i_164_, int i_165_, int i_166_, int i_167_);

	abstract Class246_Sub41 method1751(int i, int i_168_, int i_169_, int i_170_, int i_171_, float f);

	abstract int[] F(int i, int i_172_, int i_173_, int i_174_);

	abstract void H(int i, int i_175_, int i_176_, int i_177_);

	abstract float W();

	abstract void method1752();

	abstract void method1753(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_);

	static {
		new Class67("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identit\u00e9.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		anInt3722 = -1;
		aClass201_3725 = new OutgoingPacket(7, 7);
		new Class67(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
		OBJECT_CLICK_3_PACKET = new OutgoingPacket(10, 7);
	}
}
