/* Class246_Sub28_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub28_Sub11 extends Class246_Sub28 {
	static Class67 aClass67_6160 = new Class67(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
	static int anInt6161;
	private int anInt6162 = 4096;
	static int anInt6163;
	static Class85 aClass85_6164 = new Class85(8);
	private int anInt6165 = 0;
	static int anInt6166;
	static int anInt6167;

	public Class246_Sub28_Sub11() {
		super(1, true);
	}

	final void method2143(int i, int i_0_, BufferStream stream) {
		do {
			try {
				anInt6161++;
				int i_1_ = i_0_;
				do {
					if (i_1_ != 0) {
						if (i_1_ != 1)
							break;
					} else {
						anInt6165 = stream.readUnsignedShort((byte) -45);
						break;
					}
					anInt6162 = stream.readUnsignedShort((byte) -125);
				} while (false);
				if (i == 4)
					break;
				method2143(-128, -105, null);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("gv.G(" + i + ',' + i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2582(byte i) {
		try {
			aClass85_6164 = null;
			if (i != -72)
				aClass67_6160 = null;
			aClass67_6160 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gv.B(" + i + ')');
		}
	}

	static final void method2583(byte i, Class_fs class_fs) {
		try {
			anInt6163++;
			BufferStream.f_eb = class_fs.method86("p11_full", (byte) 86);
			Class36.f_ib = class_fs.method86("p12_full", (byte) -85);
			Class259_Sub1.anInt4510 = class_fs.method86("b12_full", (byte) 57);
			Class59_Sub4.anInt5187 = class_fs.method86("hitmarks", (byte) 113);
			Class_c_Sub1.anInt5389 = class_fs.method86("hitbar_default", (byte) 62);
			Class43.anInt636 = class_fs.method86("timerbar_default", (byte) -96);
			if (i <= 61)
				aClass85_6164 = null;
			Class130_Sub1_Sub1.anInt7045 = class_fs.method86("headicons_pk", (byte) -96);
			Class259_Sub1.anInt4506 = class_fs.method86("headicons_prayer", (byte) 72);
			Class246_Sub1_Sub8_Sub1.anInt7159 = class_fs.method86("hint_headicons", (byte) -83);
			Class194_Sub2.anInt4954 = class_fs.method86("hint_mapmarkers", (byte) -88);
			OutgoingPacket.anInt2862 = class_fs.method86("mapflag", (byte) -111);
			Player.f_nd = class_fs.method86("cross", (byte) 113);
			Class21_Sub1.anInt3900 = class_fs.method86("mapdots", (byte) -124);
			Class_t.anInt1439 = class_fs.method86("scrollbar", (byte) 97);
			Class107.anInt1507 = class_fs.method86("name_icons", (byte) -109);
			Class_ds.anInt6722 = class_fs.method86("floorshadows", (byte) -113);
			Class246_Sub19_Sub2.anInt6805 = class_fs.method86("compass", (byte) 94);
			Class233.anInt3182 = class_fs.method86("otherlevel", (byte) -101);
			Class95.anInt1246 = class_fs.method86("hint_mapedge", (byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("gv.A(" + i + ',' + (class_fs != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method2135(int i, int i_2_) {
		try {
			anInt6166++;
			int i_3_ = 35 % ((67 - i) / 50);
			int[] is = ((Class246_Sub28) this).aClass66_4938.method435((byte) -112, i_2_);
			if (((Class66) ((Class246_Sub28) this).aClass66_4938).aBool887) {
				int[] is_4_ = this.method2133(i_2_, 0, 0);
				for (int i_5_ = 0; ((Class246_Sub37_Sub1.f_gb ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
					int i_6_ = is_4_[i_5_];
					is[i_5_] = ((anInt6165 ^ 0xffffffff) >= (i_6_ ^ 0xffffffff) && anInt6162 >= i_6_) ? 4096 : 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "gv.E(" + i + ',' + i_2_ + ')');
		}
	}

	static {
		new Class67("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
	}
}
