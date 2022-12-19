/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class49 {
	private int[] anIntArray697;
	int anInt698;
	int anInt699;
	int anInt700;
	private int anInt701 = 2;
	private int[] anIntArray702;
	private int anInt703;
	private int anInt704;
	private int anInt705;
	private int anInt706;
	private int anInt707;

	final void method324() {
		anInt704 = 0;
		anInt703 = 0;
		anInt706 = 0;
		anInt705 = 0;
		anInt707 = 0;
	}

	final void method325(BufferStream stream) {
		((Class49) this).anInt698 = stream.readUnsignedByte(255);
		((Class49) this).anInt699 = stream.readInt((byte) 97);
		((Class49) this).anInt700 = stream.readInt((byte) 107);
		method327(stream);
	}

	final int method326(int i) {
		if (anInt707 >= anInt704) {
			anInt705 = anIntArray702[anInt703++] << 15;
			if (anInt703 >= anInt701)
				anInt703 = anInt701 - 1;
			anInt704 = (int) ((double) anIntArray697[anInt703] / 65536.0 * (double) i);
			if (anInt704 > anInt707)
				anInt706 = (((anIntArray702[anInt703] << 15) - anInt705) / (anInt704 - anInt707));
		}
		anInt705 += anInt706;
		anInt707++;
		return anInt705 - anInt706 >> 15;
	}

	public Class49() {
		anIntArray697 = new int[2];
		anIntArray702 = new int[2];
		anIntArray697[0] = 0;
		anIntArray697[1] = 65535;
		anIntArray702[0] = 0;
		anIntArray702[1] = 65535;
	}

	final void method327(BufferStream stream) {
		anInt701 = stream.readUnsignedByte(255);
		anIntArray697 = new int[anInt701];
		anIntArray702 = new int[anInt701];
		for (int i = 0; i < anInt701; i++) {
			anIntArray697[i] = stream.readUnsignedShort((byte) -73);
			anIntArray702[i] = stream.readUnsignedShort((byte) -116);
		}
	}
}
