/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 implements Interface2 {
	static int anInt1947;
	static int anInt1948;
	int anInt1949;
	int anInt1950;
	static int anInt1951;
	int anInt1952;
	int anInt1953;
	static int anInt1954;
	boolean aBool1955;
	static int anInt1956;
	int anInt1957;
	static int anInt1958;
	static int anInt1959;
	static int anInt1960;
	static int[] anIntArray1961;
	int anInt1962;

	public final long method3(byte i) {
		try {
			anInt1956++;
			long[] ls = Class102.aLongArray1322;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) (0xffL & (l ^ (long) ((Class137) this).anInt1953))];
			if (i < 112)
				((Class137) this).aBool1955 = true;
			l = ls[(int) (((long) (((Class137) this).anInt1950 >> 8) ^ l) & 0xffL)] ^ l >>> 8;
			l = (ls[(int) (0xffL & ((long) ((Class137) this).anInt1950 ^ l))] ^ l >>> 8);
			l = l >>> 8 ^ ls[(int) (((long) (((Class137) this).anInt1949 >> 24) ^ l) & 0xffL)];
			l = ls[(int) (0xffL & (l ^ (long) (((Class137) this).anInt1949 >> 16)))] ^ l >>> 8;
			l = (l >>> 8 ^ ls[(int) (0xffL & ((long) (((Class137) this).anInt1949 >> 8) ^ l))]);
			l = (ls[(int) (((long) ((Class137) this).anInt1949 ^ l) & 0xffL)] ^ l >>> 8);
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((Class137) this).anInt1952) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class137) this).anInt1957 >> 24)) & 0xffL)];
			l = ls[(int) ((l ^ (long) (((Class137) this).anInt1957 >> 16)) & 0xffL)] ^ l >>> 8;
			l = ls[(int) (0xffL & (l ^ (long) (((Class137) this).anInt1957 >> 8)))] ^ l >>> 8;
			l = l >>> 8 ^ ls[(int) (0xffL & ((long) ((Class137) this).anInt1957 ^ l))];
			l = (ls[(int) (0xffL & (l ^ (long) ((Class137) this).anInt1962))] ^ l >>> 8);
			l = ls[(int) (((long) (((Class137) this).aBool1955 ? 1 : 0) ^ l) & 0xffL)] ^ l >>> 8;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mt.B(" + i + ')');
		}
	}

	static final void method927(int i, int i_0_, byte i_1_) {
		try {
			anInt1951++;
			if (i_1_ != -109)
				anIntArray1961 = null;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_0_, (byte) 116, 7);
			class246_sub1_sub10.method2600(i_1_ ^ 0x6497);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mt.D(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method928(boolean bool) {
		do {
			try {
				if (bool != false)
					method932(false, 37, (byte) -95);
				anInt1954++;
				if (!Class246_Sub28_Sub27.aClass39_Sub1_6759.method2052(BufferStream.anInt5656, 110) && (Class40_Sub6.anInt5103 != Class246_Sub28_Sub24.anInt6681))
					Class170.method1125(false, (byte) 104, Class130_Sub8.anInt5618, Class92.anInt1206, false);
				else {
					Class40.method279(true, Class246_Sub15.aClass260_4445);
					if ((Class246_Sub28_Sub24.anInt6681 ^ 0xffffffff) == (Class40_Sub7.anInt5170 ^ 0xffffffff))
						break;
					Class211_Sub1_Sub2.method2689(0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "mt.G(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method929(byte i) {
		try {
			anIntArray1961 = null;
			int i_2_ = -45 / ((i - 7) / 46);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mt.F(" + i + ')');
		}
	}

	static final void addInScreenNpcs(boolean largeScene, byte i) {
		try {
			anInt1958++;
			if (i >= -127)
				addInScreenNpcs(false, (byte) 29);
			while (Class78.packetStream.method2478(8, Class130_Sub1_Sub1.anInt7046) >= 15) {
				int npcIndex = Class78.packetStream.readBits(-82, 15);
				if (npcIndex == 32767)
					break;
				boolean bool_4_ = false;
				if (Class76.aClass_r_Sub2Array1002[npcIndex] == null) {
					Class76.aClass_r_Sub2Array1002[npcIndex] = new Npc();
					((Actor) Class76.aClass_r_Sub2Array1002[npcIndex]).f_db = npcIndex;
					bool_4_ = true;
				}
				Npc class_r_sub2 = Class76.aClass_r_Sub2Array1002[npcIndex];
				Class246_Sub28_Sub29.anIntArray6815[Class5.anInt55++] = npcIndex;
				((Actor) class_r_sub2).anInt6418 = Class246_Sub1_Sub4.anInt5752;
				if (((Npc) class_r_sub2).aClass253_7184 != null && ((Npc) class_r_sub2).aClass253_7184.method1628(-29))
					Class246_Sub28_Sub35.method2874(class_r_sub2, 16777216);
				int i_5_ = Class78.packetStream.readBits(-64, 1);
				int plane = Class78.packetStream.readBits(-100, 2);
				int needUpdate = Class78.packetStream.readBits(-56, 1);
				if ((needUpdate ^ 0xffffffff) == -2)
					Class251.anIntArray3552[Class59_Sub5_Sub1.anInt5826++] = npcIndex;
				int i_8_;
				if (largeScene) {
					i_8_ = Class78.packetStream.readBits(-98, 8);
					if ((i_8_ ^ 0xffffffff) < -128)
						i_8_ -= 256;
				} else {
					i_8_ = Class78.packetStream.readBits(-57, 5);
					if ((i_8_ ^ 0xffffffff) < -16)
						i_8_ -= 32;
				}
				int i_9_;
				if (largeScene) {
					i_9_ = Class78.packetStream.readBits(-61, 8);
					if ((i_9_ ^ 0xffffffff) < -128)
						i_9_ -= 256;
				} else {
					i_9_ = Class78.packetStream.readBits(-67, 5);
					if ((i_9_ ^ 0xffffffff) < -16)
						i_9_ -= 32;
				}
				int faceDirection = (0x391e & (Class78.packetStream.readBits(-90, 3) + 4 << 11));
				class_r_sub2.method2934((byte) -128, (Class179.aClass228_2518.method1462(Class78.packetStream.readBits(-56, 14), 1)));
				class_r_sub2.method2673(((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3574, (byte) -120);
				((Actor) class_r_sub2).f_cc = ((Class253) (((Npc) class_r_sub2).aClass253_7184)).anInt3608 << 3;
				if ((((Actor) class_r_sub2).f_cc ^ 0xffffffff) == -1)
					class_r_sub2.method2664(104, 0);
				else if (bool_4_)
					class_r_sub2.method2664(76, faceDirection);
				class_r_sub2.method2928(plane, -20437, i_9_ + ((Actor) Class_a.aClass_r_Sub1_1180).f_mc[0], class_r_sub2.method2670((byte) 127), (i_5_ ^ 0xffffffff) == -2, i_8_ + ((Actor) Class_a.aClass_r_Sub1_1180).f_nc[0]);
				if (((Npc) class_r_sub2).aClass253_7184.method1628(-60))
					Class66.method434(((Actor) class_r_sub2).f_mc[0], -1, class_r_sub2, null, ((Actor) class_r_sub2).f_nc[0], 0, ((Class59_Sub3) class_r_sub2).aByte5053, null);
			}
			Class78.packetStream.method2476((byte) 94);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mt.C(" + largeScene + ',' + i + ')');
		}
	}

	public final boolean method5(Interface2 interface2, int i) {
		try {
			anInt1959++;
			if (!(interface2 instanceof Class137))
				return false;
			Class137 class137_11_ = (Class137) interface2;
			if (((Class137) this).anInt1953 != ((Class137) class137_11_).anInt1953)
				return false;
			if (((Class137) this).anInt1950 != ((Class137) class137_11_).anInt1950)
				return false;
			if ((((Class137) this).anInt1949 ^ 0xffffffff) != (((Class137) class137_11_).anInt1949 ^ 0xffffffff))
				return false;
			if (((Class137) class137_11_).anInt1952 != ((Class137) this).anInt1952)
				return false;
			if (((Class137) this).anInt1957 != ((Class137) class137_11_).anInt1957)
				return false;
			if ((((Class137) class137_11_).anInt1962 ^ 0xffffffff) != (((Class137) this).anInt1962 ^ 0xffffffff))
				return false;
			if (!((Class137) this).aBool1955 == ((Class137) class137_11_).aBool1955)
				return false;
			if (i != 27398)
				method3((byte) -106);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "mt.H(" + (interface2 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method931(byte i, String string, char c) {
		try {
			anInt1960++;
			int i_12_ = 0;
			int i_13_ = string.length();
			int i_14_ = 0;
			if (i != -92)
				return -114;
			for (/**/; (i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
				if (string.charAt(i_14_) == c)
					i_12_++;
			}
			return i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mt.E(" + i + ',' + (string != null ? "{...}" : "null") + ',' + c + ')'));
		}
	}

	static final String method932(boolean bool, int i, byte i_15_) {
		try {
			anInt1947++;
			if (!bool || i < 0)
				return Integer.toString(i);
			if (i_15_ <= 102)
				anIntArray1961 = null;
			return OutgoingPacket.method1326(bool, (byte) -70, i, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("mt.A(" + bool + ',' + i + ',' + i_15_ + ')'));
		}
	}

	static {
		new Class67("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.", "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.", "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
	}
}
