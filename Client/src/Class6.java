
/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class6 implements Runnable {
	private OutputStream anOutputStream65;
	private byte[] aByteArray66;
	private int anInt67;
	static String aString68;
	static int anInt69;
	private Signlink aClass52_70;
	static int anInt71;
	static int anInt72;
	static int anInt73;
	static int anInt74;
	static int anInt75;
	static int anInt76;
	static int anInt77;
	private Class182 aClass182_78;
	static int anInt79;
	static int anInt80;
	static int anInt81;
	static int anInt82;
	private boolean aBool83 = false;
	private int anInt84;
	private InputStream anInputStream85;
	static int anInt86;
	private Socket aSocket87;
	private boolean aBool88 = false;
	static int anInt89;
	static int anInt90;

	protected final void finalize() {
		try {
			method72(false);
			anInt86++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.finalize(" + ')');
		}
	}

	final void method65(int i, byte i_0_, int i_1_, byte[] is) throws IOException {
		try {
			anInt89++;
			if (!aBool83) {
				if (i_0_ != 113)
					run();
				while (i_1_ > 0) {
					int i_2_ = anInputStream85.read(is, i, i_1_);
					if (i_2_ <= 0)
						throw new EOFException();
					i_1_ -= i_2_;
					i += i_2_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("al.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method66(int i) {
		try {
			anInt71++;
			if (!aBool83) {
				anInputStream85 = new InputStream_Sub1();
				if (i != 0)
					anInt77 = -117;
				anOutputStream65 = new OutputStream_Sub1();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.L(" + i + ')');
		}
	}

	final int method67(int i) throws IOException {
		try {
			anInt90++;
			if (i != 3)
				return 45;
			if (aBool83)
				return 0;
			return anInputStream85.available();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.F(" + i + ')');
		}
	}

	public static void method68(int i) {
		do {
			try {
				aString68 = null;
				if (i == -1)
					break;
				method71(85, 90, -68);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "al.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int getAverageHeight(int worldX, int worldZ, int plane, int i_5_) {
		try {
			anInt74++;
			if (Class59_Sub3_Sub4.aClass210Array6993 == null)
				return 0;
			int x = worldX >> 7;
			int z = i_5_ >> 7;
			if ((x ^ 0xffffffff) > -1 || (z ^ 0xffffffff) > -1 || Class38_Sub1_Sub1.anInt6770 - 1 < x || (Class152.anInt2205 - 1 ^ 0xffffffff) > (z ^ 0xffffffff))
				return 0;
			int y = plane;
			if (y < 3 && (0x2 & Class45.aByteArrayArrayArray648[1][x][z] ^ 0xffffffff) != -1)
				y++;
			return Class59_Sub3_Sub4.aClass210Array6993[y].a(worldX, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("al.A(" + worldX + ',' + worldZ + ',' + plane + ',' + i_5_ + ')'));
		}
	}

	static final void method70(int i, byte i_10_) {
		try {
			Class133.anInt1842 = 1000 / i;
			if (i_10_ >= -31)
				method74(false, null);
			anInt72++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.H(" + i + ',' + i_10_ + ')');
		}
	}

	static final boolean method71(int i, int i_11_, int i_12_) {
		try {
			anInt81++;
			if (!Class246_Sub6.method1818(i_11_, i_12_, -58))
				return false;
			if (i != -20147)
				aString68 = null;
			if ((i_12_ & 0xb000) != 0 | Class59_Sub2_Sub2.method2545(i_11_, i_12_, (byte) 107) | Class246_Sub1_Sub5.method2470(i_12_, i_11_, (byte) -60))
				return true;
			return ((Class40_Sub3.method1863(i_11_, i ^ 0x4ece, i_12_) | SubIncomingPacket.method2899(i_11_, (byte) 107, i_12_)) & (0x37 & i_11_ ^ 0xffffffff) == -1);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("al.B(" + i + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method72(boolean bool) {
		try {
			anInt80++;
			if (!aBool83) {
				synchronized (this) {
					if (bool != false)
						return;
					aBool83 = true;
					this.notifyAll();
				}
				if (aClass182_78 != null) {
					while (aClass182_78.anInt2539 == 0)
						Class247.method1580(1L, -5184);
					if ((aClass182_78.anInt2539 ^ 0xffffffff) == -2) {
						try {
							((Thread) aClass182_78.anObject2535).join();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				aClass182_78 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.I(" + bool + ')');
		}
	}

	final int method73(int i) throws IOException {
		try {
			anInt79++;
			if (i <= 1)
				method66(59);
			if (aBool83)
				return 0;
			return anInputStream85.read();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.K(" + i + ')');
		}
	}

	public final void run() {
		try {
			try {
				for (;;) {
					int i;
					int i_13_;
					synchronized (this) {
						if ((anInt84 ^ 0xffffffff) == (anInt67 ^ 0xffffffff)) {
							if (aBool83)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = anInt67;
						if (anInt67 <= anInt84)
							i_13_ = -anInt67 + anInt84;
						else
							i_13_ = -anInt67 + 5000;
					}
					if (i_13_ > 0) {
						try {
							anOutputStream65.write(aByteArray66, i, i_13_);
						} catch (IOException ioexception) {
							aBool88 = true;
						}
						anInt67 = (i_13_ + anInt67) % 5000;
						try {
							if (anInt84 == anInt67)
								anOutputStream65.flush();
						} catch (IOException ioexception) {
							aBool88 = true;
						}
					}
				}
				try {
					if (anInputStream85 != null)
						anInputStream85.close();
					if (anOutputStream65 != null)
						anOutputStream65.close();
					if (aSocket87 != null)
						aSocket87.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray66 = null;
			} catch (Exception exception) {
				Class194_Sub1.method1883(exception, null, -128);
			}
			anInt73++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.run(" + ')');
		}
	}

	static final void method74(boolean bool, String string) {
		try {
			if (bool == false) {
				anInt76++;
				System.out.println("Error: " + Class248.method1586("\n", -9, "%0a", string));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method75(int i) throws IOException {
		try {
			if (i != -2)
				aBool88 = false;
			anInt69++;
			if (!aBool83) {
				if (aBool88) {
					aBool88 = false;
					throw new IOException();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "al.C(" + i + ')');
		}
	}

	final void method76(int i, int i_14_, byte[] is, int i_15_) throws IOException {
		try {
			anInt75++;
			if (!aBool83) {
				if (aBool88) {
					aBool88 = false;
					throw new IOException();
				}
				if (aByteArray66 == null)
					aByteArray66 = new byte[5000];
				synchronized (this) {
					if (i_15_ <= 125)
						aByteArray66 = null;
					for (int i_16_ = 0; (i ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
						aByteArray66[anInt84] = is[i_16_ + i_14_];
						anInt84 = (1 + anInt84) % 5000;
						if (anInt84 == (anInt67 + 4900) % 5000)
							throw new IOException();
					}
					if (aClass182_78 == null)
						aClass182_78 = aClass52_70.method354(-125, 3, this);
					this.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("al.D(" + i + ',' + i_14_ + ',' + (is != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	Class6(Socket socket, Signlink class52) throws IOException {
		anInt67 = 0;
		anInt84 = 0;
		try {
			aSocket87 = socket;
			aClass52_70 = class52;
			aSocket87.setSoTimeout(30000);
			aSocket87.setTcpNoDelay(true);
			anInputStream85 = aSocket87.getInputStream();
			anOutputStream65 = aSocket87.getOutputStream();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("al.<init>(" + (socket != null ? "{...}" : "null") + ',' + (class52 != null ? "{...}" : "null") + ')'));
		}
	}
}
