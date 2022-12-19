
/* Class102_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class102_Sub1 extends Class102 implements MouseListener, MouseMotionListener {
	static int anInt4447;
	static int anInt4448;
	static boolean[] aBoolArray4449;
	static int anInt4450;
	static int anInt4451;
	static int anInt4452;
	static int anInt4453;
	static int anInt4454;
	private int anInt4455;
	static int anInt4456;
	static int anInt4457;
	static int anInt4458;
	static int anInt4459;
	private Class166 aClass166_4460 = new Class166();
	static int anInt4461;
	static int anInt4462;
	static int anInt4463;
	static int anInt4464;
	private int anInt4465;
	static int anInt4466;
	static int anInt4467;
	static int anInt4468;
	static int anInt4469;
	static int anInt4470;
	static int anInt4471;
	static int anInt4472;
	static int anInt4473;
	private int anInt4474;
	static int anInt4475;
	private Class166 aClass166_4476 = new Class166();
	private int anInt4477;
	private int cameraX;
	private int cameraY;
	private boolean aBool4480;
	private Component aComponent4481;
	private int mouseWheelX;
	private int mouseWheelY;
	private int i;
	private int j;
	private boolean dragging;

	final int method640(byte i) {
		try {
			if (i != 58)
				aBoolArray4449 = null;
			anInt4469++;
			return anInt4455;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.A(" + i + ')');
		}
	}

	final boolean method641(int i) {
		try {
			if (i != 2)
				return false;
			anInt4472++;
			if ((anInt4474 & 0x1 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.E(" + i + ')');
		}
	}

	public static void method2000(int i) {
		try {
			if (i != 128)
				aBoolArray4449 = null;
			aBoolArray4449 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.H(" + i + ')');
		}
	}

	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			anInt4448++;
			cameraY = -1;
			cameraX = -1;
			dragging = false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.mouseExited(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}


	final boolean method635(int i) {
		try {
			anInt4447++;
			if (i != 1)
				return false;
			if ((anInt4474 & 0x4) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.G(" + i + ')');
		}
	}

	private final void method2001(boolean bool) {
		try {
			anInt4456++;
			if (aComponent4481 != null) {
				aComponent4481.removeMouseListener(this);
				aComponent4481.removeMouseMotionListener(this);
				if (bool != true)
					cameraX = -103;
				aComponent4481 = null;
				aClass166_4460 = null;
				cameraX = cameraY = anInt4477 = 0;
				anInt4455 = anInt4465 = anInt4474 = 0;
				aClass166_4476 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.O(" + bool + ')');
		}
	}

	private final int method2002(MouseEvent mouseevent, int i) {
		try {
			anInt4468++;
			int i_0_ = mouseevent.getModifiers();
			boolean bool = (i & i_0_ ^ 0xffffffff) != -1;
			boolean bool_1_ = (i_0_ & 0x8) != 0;
			boolean bool_2_ = (0x4 & i_0_) != 0;
			if (bool_1_ && (bool || bool_2_))
				bool_1_ = false;
			if (bool && bool_2_)
				return 4;
			if (bool)
				return 1;
			if (bool_1_)
				return 2;
			if (bool_2_)
				return 4;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.Q(" + (mouseevent != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		do {
			try {
				anInt4461++;
				dragging = false;
				int i = method2002(mouseevent, 16);
				if ((i & anInt4477 ^ 0xffffffff) == -1)
					i = anInt4477;
				if ((0x1 & i) != 0)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 3);
				if ((i & 0x4) != 0)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 5);
				if ((i & 0x2) != 0)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 4);
				anInt4477 &= i ^ 0xffffffff;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gf.mouseReleased(" + (mouseevent != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2003(byte i, boolean bool) {
		try {
			Class48.anInt695 = 0;
			Class59_Sub5_Sub1.anInt5826 = 0;
			anInt4452++;
			Class40_Sub7.method2207((byte) -53);
			Class137.addInScreenNpcs(bool, (byte) -128);
			if (i != -30)
				method2004(14, -20, 116, 21);
			Class131.decodeLocalNPCMasks((byte) 127);
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class48.anInt695 ^ 0xffffffff); i_3_++) {
				int i_4_ = Class246_Sub28_Sub1.anIntArray5791[i_3_];
				if ((Class246_Sub1_Sub4.anInt5752 ^ 0xffffffff) != ((((Actor) Class76.aClass_r_Sub2Array1002[i_4_]).anInt6418) ^ 0xffffffff)) {
					if (((Npc) Class76.aClass_r_Sub2Array1002[i_4_]).aClass253_7184.method1628(-94))
						Class246_Sub28_Sub35.method2874(Class76.aClass_r_Sub2Array1002[i_4_], 16777216);
					Class76.aClass_r_Sub2Array1002[i_4_].method2934((byte) -121, null);
					Class76.aClass_r_Sub2Array1002[i_4_] = null;
				}
			}
			if ((((BufferStream) Class78.packetStream).position ^ 0xffffffff) != (Class130_Sub1_Sub1.anInt7046 ^ 0xffffffff))
				throw new RuntimeException("gnp1 pos:" + ((BufferStream) Class78.packetStream).position + " psize:" + Class130_Sub1_Sub1.anInt7046);
			for (int i_5_ = 0; Class5.anInt55 > i_5_; i_5_++) {
				if ((Class76.aClass_r_Sub2Array1002[Class246_Sub28_Sub29.anIntArray6815[i_5_]]) == null)
					throw new RuntimeException("gnp2 pos:" + i_5_ + " size:" + Class5.anInt55);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.J(" + i + ',' + bool + ')');
		}
	}

	final synchronized void method642(int i) {
		try {
			anInt4455 = cameraX;
			anInt4465 = cameraY;
			anInt4463++;
			if (i > -21)
				method635(94);
			anInt4474 = anInt4477;
			Class166 class166 = aClass166_4460;
			aClass166_4460 = aClass166_4476;
			aClass166_4476 = class166;
			aClass166_4476.method1102(-82);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.L(" + i + ')');
		}
	}

	static final boolean method2004(int i, int i_6_, int i_7_, int i_8_) {
		if (!Class246_Sub13.method1988(i, i_6_, i_7_))
			return false;
		int i_9_ = i_6_ << Class126.anInt1781;
		int i_10_ = i_7_ << Class126.anInt1781;
		int i_11_ = Class59_Sub3_Sub4.aClass210Array6993[i].l(i_6_, i_7_) - 1;
		int i_12_ = i_11_ - (120 << Class126.anInt1781 - 7);
		int i_13_ = i_11_ - (230 << Class126.anInt1781 - 7);
		int i_14_ = i_11_ - (238 << Class126.anInt1781 - 7);
		if (i_8_ == 1) {
			if (i_9_ > Class246_Sub1_Sub10.anInt6199) {
				if (!Class160.method1060(i_9_, i_11_, i_10_))
					return false;
				if (!Class160.method1060(i_9_, i_11_, i_10_ + Class40_Sub7.anInt5174))
					return false;
				if (!Class160.method1060(i_9_, i_11_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (i > 0) {
				if (!Class160.method1060(i_9_, i_12_, i_10_))
					return false;
				if (!Class160.method1060(i_9_, i_12_, i_10_ + Class40_Sub7.anInt5174))
					return false;
				if (!Class160.method1060(i_9_, i_12_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (!Class160.method1060(i_9_, i_13_, i_10_))
				return false;
			if (!Class160.method1060(i_9_, i_13_, i_10_ + Class40_Sub7.anInt5174))
				return false;
			if (!Class160.method1060(i_9_, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			return true;
		}
		if (i_8_ == 2) {
			if (i_10_ < Class111.anInt1576) {
				if (!Class160.method1060(i_9_, i_11_, i_10_ + Class246_Sub1.anInt3744))
					return false;
				if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_11_, i_10_ + Class246_Sub1.anInt3744))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_11_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (i > 0) {
				if (!Class160.method1060(i_9_, i_12_, i_10_ + Class246_Sub1.anInt3744))
					return false;
				if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_12_, i_10_ + Class246_Sub1.anInt3744))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_12_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (!Class160.method1060(i_9_, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			return true;
		}
		if (i_8_ == 4) {
			if (i_9_ < Class246_Sub1_Sub10.anInt6199) {
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_11_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_11_, i_10_ + Class40_Sub7.anInt5174))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_11_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (i > 0) {
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_12_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_12_, i_10_ + Class40_Sub7.anInt5174))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_12_, i_10_ + Class246_Sub1.anInt3744))
					return false;
			}
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_))
				return false;
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_ + Class40_Sub7.anInt5174))
				return false;
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			return true;
		}
		if (i_8_ == 8) {
			if (i_10_ > Class111.anInt1576) {
				if (!Class160.method1060(i_9_, i_11_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_11_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_11_, i_10_))
					return false;
			}
			if (i > 0) {
				if (!Class160.method1060(i_9_, i_12_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_12_, i_10_))
					return false;
				if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_12_, i_10_))
					return false;
			}
			if (!Class160.method1060(i_9_, i_13_, i_10_))
				return false;
			if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_13_, i_10_))
				return false;
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_))
				return false;
			return true;
		}
		if (!Class160.method1060(i_9_ + Class40_Sub7.anInt5174, i_14_, i_10_ + Class40_Sub7.anInt5174))
			return false;
		if (i_8_ == 16) {
			if (!Class160.method1060(i_9_, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			return true;
		}
		if (i_8_ == 32) {
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_ + Class246_Sub1.anInt3744))
				return false;
			return true;
		}
		if (i_8_ == 64) {
			if (!Class160.method1060(i_9_ + Class246_Sub1.anInt3744, i_13_, i_10_))
				return false;
			return true;
		}
		if (i_8_ == 128) {
			if (!Class160.method1060(i_9_, i_13_, i_10_))
				return false;
			return true;
		}
		return true;
	}

	private final void method2005(int i, int i_15_, byte i_16_, int i_17_) {
		try {
			anInt4466++;
			Class246_Sub30_Sub1 class246_sub30_sub1 = new Class246_Sub30_Sub1();
			((Class246_Sub30_Sub1) class246_sub30_sub1).anInt5757 = i;
			((Class246_Sub30_Sub1) class246_sub30_sub1).anInt5766 = i_15_;
			((Class246_Sub30_Sub1) class246_sub30_sub1).anInt5759 = i_17_;
			((Class246_Sub30_Sub1) class246_sub30_sub1).aLong5754 = Class151.time(-77);
			if (i_16_ != 100)
				aBool4480 = false;
			aClass166_4476.method1101(false, class246_sub30_sub1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gf.C(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			anInt4453++;
			method2006(mouseevent, false);
			if (ClientLoader.MIDDLE_MOUSE) {
				if (dragging) {
					int x = (mouseWheelX - mouseevent.getX());
					int y = (mouseWheelY - mouseevent.getY());
					dragCameraUsingMouse(x, -y);
					mouseWheelX = mouseevent.getX();
					mouseWheelY = mouseevent.getY();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.mouseDragged(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	private final void method2006(MouseEvent mouseevent, boolean bool) {
		do {
			try {
				anInt4471++;
				cameraX = mouseevent.getX();
				cameraY = mouseevent.getY();
				if (aBool4480)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, -1);
				if (bool == false)
					break;
				method636(46);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gf.N(" + (mouseevent != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void mouseClicked(MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
			anInt4464++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.mouseClicked(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mousePressed(MouseEvent mouseevent) {
		do {
			try {
				anInt4454++;
				int id = method2002(mouseevent, 16);
				if (id == 1)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 0);
				else if (id == 4)
					method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 2);
				else if ((id ^ 0xffffffff) == -3) {
					if (ClientLoader.MIDDLE_MOUSE) {
						dragging = true;
						mouseWheelX = mouseevent.getX();
						mouseWheelY = mouseevent.getY();
						dragCameraUsingMouse(i, j);
					} else
						method2005(mouseevent.getX(), mouseevent.getY(), (byte) 100, 1);
				}
				anInt4477 |= id;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gf.mousePressed(" + (mouseevent != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private void dragCameraUsingMouse(int x, int y) {
		if (!dragging)
			return;

		Class204.aFloat2881 += x * 9;
		Class59_Sub2.aFloat4553 += (y << 2);
	}

	private final void method2007(Component component, int i) {
		try {
			method2001(true);
			anInt4470++;
			aComponent4481 = component;
			if (i != -25329)
				method633(false);
			aComponent4481.addMouseListener(this);
			aComponent4481.addMouseMotionListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.R(" + (component != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method636(int i) {
		try {
			if (i != 3045)
				cameraY = -75;
			anInt4458++;
			return anInt4465;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.B(" + i + ')');
		}
	}

	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method2006(mouseevent, false);
			anInt4457++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.mouseEntered(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	final void method633(boolean bool) {
		try {
			method2001(bool);
			anInt4473++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.K(" + bool + ')');
		}
	}

	final boolean method643(byte i) {
		try {
			int i_18_ = 41 % ((i + 45) / 60);
			anInt4462++;
			if ((0x2 & anInt4474 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.M(" + i + ')');
		}
	}

	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			method2006(mouseevent, false);
			anInt4475++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.mouseMoved(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method2008(int i, int i_19_, int i_20_) {
		try {
			anInt4451++;
			if (i != -16623)
				anInt4450 = -80;
			if (!((i_20_ & 0x40000) != 0 | Class246_Sub1_Sub5.method2470(i_20_, i_19_, (byte) -60)) && !Class6.method71(-20147, i_19_, i_20_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gf.P(" + i + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	final Class246_Sub30 method638(byte i) {
		try {
			if (i >= -20)
				aComponent4481 = null;
			anInt4459++;
			return (Class246_Sub30) aClass166_4460.method1100(4095);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gf.F(" + i + ')');
		}
	}

	static final String[] method2009(int i, String[] strings) {
		try {
			anInt4467++;
			String[] strings_21_ = new String[i];
			for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -6; i_22_++) {
				strings_21_[i_22_] = String.valueOf(i_22_) + ": ";
				if (strings != null && strings[i_22_] != null)
					strings_21_[i_22_] = strings_21_[i_22_] + strings[i_22_];
			}
			return strings_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gf.D(" + i + ',' + (strings != null ? "{...}" : "null") + ')'));
		}
	}

	Class102_Sub1(Component component, boolean bool) {
		try {
			method2007(component, -25329);
			aBool4480 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gf.<init>(" + (component != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

}
