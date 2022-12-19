
/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class138 {
	float aFloat1963;
	int anInt1964;
	static int anInt1965;
	float aFloat1966;
	static int anInt1967;
	static Class67 aClass67_1968;
	float aFloat1969 = 1.0F;
	int anInt1970;
	static long aLong1971 = -1L;
	float aFloat1972;
	int anInt1973;
	Class211 aClass211_1974;
	float aFloat1975;
	int anInt1976;
	static int anInt1977;
	int anInt1978;
	int anInt1979;
	float aFloat1980;
	static int anInt1981;
	static Class_fs index3;

	final void method933(byte i, BufferStream stream) {
		try {
			if (i == -31) {
				((Class138) this).aFloat1969 = (float) (8 * stream.readUnsignedByte(255)) / 255.0F;
				anInt1967++;
				((Class138) this).aFloat1963 = (float) (stream.readUnsignedByte(255) * 8) / 255.0F;
				((Class138) this).aFloat1966 = (float) (stream.readUnsignedByte(i + 286) * 8) / 255.0F;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mu.A(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method934(boolean bool) {
		try {
			if (bool != false)
				aLong1971 = 53L;
			aClass67_1968 = null;
			index3 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mu.D(" + bool + ')');
		}
	}

	static final Class196 method935(Class256[] class256s, Class260_Sub2 class260_sub2, int i) {
		try {
			anInt1965++;
			for (int i_0_ = 0; i_0_ < class256s.length; i_0_++) {
				if (class256s[i_0_] == null || (((Class256) class256s[i_0_]).aLong3678 ^ 0xffffffffffffffffL) >= -1L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i_1_ = 0; i_1_ < class256s.length; i_1_++)
				OpenGL.glAttachObjectARB(l, (((Class256) class256s[i_1_]).aLong3678));
			OpenGL.glLinkProgramARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35714, Class211_Sub1_Sub1.anIntArray6234, 0);
			if (i != -1)
				index3 = null;
			if (Class211_Sub1_Sub1.anIntArray6234[0] == 0) {
				if ((Class211_Sub1_Sub1.anIntArray6234[0] ^ 0xffffffff) == -1)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716, (Class211_Sub1_Sub1.anIntArray6234), 1);
				if ((Class211_Sub1_Sub1.anIntArray6234[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[Class211_Sub1_Sub1.anIntArray6234[1]];
					OpenGL.glGetInfoLogARB(l, (Class211_Sub1_Sub1.anIntArray6234[1]), Class211_Sub1_Sub1.anIntArray6234, 0, is, 0);
					System.out.println(new String(is));
				}
				if (Class211_Sub1_Sub1.anIntArray6234[0] == 0) {
					for (int i_2_ = 0; i_2_ < class256s.length; i_2_++)
						OpenGL.glDetachObjectARB(l, (((Class256) class256s[i_2_]).aLong3678));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class196(class260_sub2, l, class256s);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mu.B(" + (class256s != null ? "{...}" : "null") + ',' + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method936(byte i, Class138 class138_3_) {
		try {
			int i_4_ = 72 / ((50 - i) / 35);
			anInt1981++;
			if ((((Class138) this).anInt1970 != ((Class138) class138_3_).anInt1970) || (((Class138) this).aFloat1975 != ((Class138) class138_3_).aFloat1975) || (((Class138) class138_3_).aFloat1972 != ((Class138) this).aFloat1972) || (((Class138) this).aFloat1980 != ((Class138) class138_3_).aFloat1980) || (((Class138) this).aFloat1963 != ((Class138) class138_3_).aFloat1963) || (((Class138) class138_3_).aFloat1969 != ((Class138) this).aFloat1969) || (((Class138) class138_3_).aFloat1966 != ((Class138) this).aFloat1966) || (((Class138) this).anInt1973 != ((Class138) class138_3_).anInt1973) || ((((Class138) this).anInt1978 ^ 0xffffffff) != (((Class138) class138_3_).anInt1978 ^ 0xffffffff)) || (((Class138) class138_3_).aClass211_1974 != ((Class138) this).aClass211_1974))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mu.C(" + i + ',' + (class138_3_ != null ? "{...}" : "null") + ')');
		}
	}

	public Class138() {
		((Class138) this).aFloat1966 = 1.0F;
		((Class138) this).aFloat1963 = 0.25F;
		try {
			((Class138) this).anInt1976 = -50;
			((Class138) this).anInt1973 = Class40_Sub6.anInt5099;
			((Class138) this).anInt1970 = Class37.anInt547;
			((Class138) this).aFloat1972 = 0.69921875F;
			((Class138) this).aClass211_1974 = Class142.aClass211_2064;
			((Class138) this).anInt1978 = 0;
			((Class138) this).aFloat1975 = 1.1523438F;
			((Class138) this).anInt1979 = -60;
			((Class138) this).aFloat1980 = 1.2F;
			((Class138) this).anInt1964 = -50;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mu.<init>(" + ')');
		}
	}

	Class138(BufferStream stream) {
		((Class138) this).aFloat1966 = 1.0F;
		((Class138) this).aFloat1963 = 0.25F;
		try {
			int i = stream.readUnsignedByte(255);
			if (Class246_Sub28_Sub27.aClass39_Sub1_6759.method275(29083, BufferStream.anInt5656) && Class33.aClass260_444.method1701() > 0) {
				if ((i & 0x1 ^ 0xffffffff) != -1)
					((Class138) this).anInt1970 = stream.readInt((byte) 113);
				else
					((Class138) this).anInt1970 = Class37.anInt547;
				if ((0x2 & i) != 0)
					((Class138) this).aFloat1975 = (float) stream.readUnsignedShort((byte) 84) / 256.0F;
				else
					((Class138) this).aFloat1975 = 1.1523438F;
				if ((0x4 & i ^ 0xffffffff) != -1)
					((Class138) this).aFloat1972 = (float) stream.readUnsignedShort((byte) -41) / 256.0F;
				else
					((Class138) this).aFloat1972 = 0.69921875F;
				if ((i & 0x8) == 0)
					((Class138) this).aFloat1980 = 1.2F;
				else
					((Class138) this).aFloat1980 = (float) stream.readUnsignedShort((byte) 111) / 256.0F;
			} else {
				if ((i & 0x1 ^ 0xffffffff) != -1)
					stream.readInt((byte) 100);
				if ((i & 0x2) != 0)
					stream.readUnsignedShort((byte) -118);
				if ((i & 0x4) != 0)
					stream.readUnsignedShort((byte) 123);
				if ((i & 0x8 ^ 0xffffffff) != -1)
					stream.readUnsignedShort((byte) -84);
				((Class138) this).aFloat1972 = 0.69921875F;
				((Class138) this).aFloat1975 = 1.1523438F;
				((Class138) this).anInt1970 = Class37.anInt547;
				((Class138) this).aFloat1980 = 1.2F;
			}
			if ((i & 0x10) != 0) {
				((Class138) this).anInt1964 = stream.method2375((byte) 1);
				((Class138) this).anInt1979 = stream.method2375((byte) 1);
				((Class138) this).anInt1976 = stream.method2375((byte) 1);
			} else {
				((Class138) this).anInt1976 = -50;
				((Class138) this).anInt1964 = -50;
				((Class138) this).anInt1979 = -60;
			}
			if ((i & 0x20 ^ 0xffffffff) == -1)
				((Class138) this).anInt1973 = Class40_Sub6.anInt5099;
			else
				((Class138) this).anInt1973 = stream.readInt((byte) 96);
			if ((i & 0x40 ^ 0xffffffff) != -1)
				((Class138) this).anInt1978 = stream.readUnsignedShort((byte) -85);
			else
				((Class138) this).anInt1978 = 0;
			if ((0x80 & i) != 0) {
				int i_5_ = stream.readUnsignedShort((byte) 125);
				int i_6_ = stream.readUnsignedShort((byte) 90);
				int i_7_ = stream.readUnsignedShort((byte) -123);
				int i_8_ = stream.readUnsignedShort((byte) -118);
				int i_9_ = stream.readUnsignedShort((byte) -124);
				int i_10_ = stream.readUnsignedShort((byte) -109);
				((Class138) this).aClass211_1974 = Class21_Sub3.method2078(i_9_, i_7_, i_10_, i_5_, i_8_, i_6_, -1101853054);
			} else
				((Class138) this).aClass211_1974 = Class142.aClass211_2064;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mu.<init>(" + (stream != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass67_1968 = new Class67("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
		new Class67("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet", "Impossible de signaler un abus - Erreur syst\u00e8me", "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
	}
}
