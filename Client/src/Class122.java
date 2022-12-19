
/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.util.Random;

final class Class122 {
	static int anInt1679;
	static int anInt1680;
	static int anInt1681;
	short[] aShortArray1682;
	byte[] aByteArray1683;
	static int anInt1684;
	static OutgoingPacket aClass201_1685;
	static float aFloat1686;
	short[] aShortArray1687;
	static Frame aFrame1688;
	short[] aShortArray1689;

	static final void decompileAll() {

	}

	public static void decompile(int id) {
		Cs2Decompiler.decompile(Class113.getScript(id, 100));
	}

	static final CS2Script decode(byte i, byte[] is) {
		try {
			anInt1684++;
			CS2Script cs2Script = new CS2Script();
			BufferStream stream = new BufferStream(is);
			(stream).position = -2 + (stream).buffer.length;
			int pos = stream.readUnsignedShort((byte) -58);
			int i_1_ = -12 + (-pos + ((stream).buffer.length - 2));
			(stream).position = i_1_;
			int instructionCount = stream.readInt((byte) 95);
			(cs2Script).integerVariableCount = stream.readUnsignedShort((byte) 114);
			(cs2Script).stringVariableCount = stream.readUnsignedShort((byte) 127);
			(cs2Script).integerArgumentCount = stream.readUnsignedShort((byte) 124);
			(cs2Script).stringArgumentCount = stream.readUnsignedShort((byte) -70);
			int i_3_ = stream.readUnsignedByte(255);
			if ((i_3_ ^ 0xffffffff) < -1) {
				(cs2Script).switchBlocks = new Class85[i_3_];
				for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					int i_5_ = stream.readUnsignedShort((byte) -27);
					Class85 class85 = new Class85(Class206.method1350(i_5_, 269173057));
					(cs2Script).switchBlocks[i_4_] = class85;
					while (i_5_-- > 0) {
						int i_6_ = stream.readInt((byte) 107);
						int i_7_ = stream.readInt((byte) 118);
						class85.method547((long) i_6_, -2301, new IntegerNode(i_7_));
					}
				}
			}
			(stream).position = 0;
			(cs2Script).name = stream.method2379(2113195248);
			(cs2Script).opcodes = new int[instructionCount];
			(cs2Script).stringOperands = new String[instructionCount];
			(cs2Script).integerOperands = new int[instructionCount];
			int i_9_ = 0;
			while ((stream).position < i_1_) {
				int opcode = stream.readUnsignedShort((byte) -54);
				if ((opcode ^ 0xffffffff) == -4)
					(cs2Script).stringOperands[i_9_] = stream.readString((byte) -40).intern();
				else if (opcode < 100 && (opcode ^ 0xffffffff) != -22 && (opcode ^ 0xffffffff) != -39 && opcode != 39)
					(cs2Script).integerOperands[i_9_] = stream.readInt((byte) 77);
				else
					(cs2Script).integerOperands[i_9_] = stream.readUnsignedByte(255);
				(cs2Script).opcodes[i_9_++] = opcode;
			}
			return cs2Script;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.A(" + i + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method825(int i) {
		try {
			anInt1679++;
			if (!Class15.aBool231) {
				if (i > -113)
					aFrame1688 = null;
				Class15.aBool231 = true;
				do {
					if (((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool605) {
						Class59_Sub2.aFloat4553 = (float) (47 + (int) Class59_Sub2.aFloat4553 & ~0xf);
						if (!client.f_ob)
							break;
					}
					Class24.aFloat341 += (-Class24.aFloat341 + 12.0F) / 2.0F;
				} while (false);
				Class135.aBool1929 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.C(" + i + ')');
		}
	}

	static final int method826(byte i, Random random, int i_11_) {
		try {
			anInt1681++;
			if (i_11_ <= 0)
				throw new IllegalArgumentException();
			if (i != 94)
				method826((byte) -11, null, -37);
			if (Class246_Sub40.method2313(200, i_11_))
				return (int) (((0xffffffffL & (long) random.nextInt()) * (long) i_11_) >> 32);
			int i_12_ = -(int) (4294967296L % (long) i_11_) + -2147483648;
			int i_13_;
			do
				i_13_ = random.nextInt();
			while ((i_13_ ^ 0xffffffff) <= (i_12_ ^ 0xffffffff));
			return Class246_Sub11.method1868(i_11_, (byte) 81, i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ll.B(" + i + ',' + (random != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	public static void method827(int i) {
		try {
			if (i != -7782)
				method827(-27);
			aClass201_1685 = null;
			aFrame1688 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ll.D(" + i + ')');
		}
	}

	static {
		new Class67("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates pas dans un canal de clan.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal de cl\u00e3.");
		aClass201_1685 = new OutgoingPacket(49, 6);
	}
}
