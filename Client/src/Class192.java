import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class192 {

	private long aLong2707;
	private RandomAccessFile aRandomAccessFile2708;
	private long aLong2709;
	private File aFile2710;

	public final int method1261(int var1, int var2, byte[] var3, byte var4) throws IOException {
		try {
			if (var4 > -88) {
				this.aLong2707 = -96L;
			}

			int var5 = this.aRandomAccessFile2708.read(var3, var1, var2);
			if (~var5 < -1) {
				this.aLong2707 += (long) var5;
			}

			return var5;
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	public final void method1262(int var1) throws IOException {
		try {
			if (null != this.aRandomAccessFile2708) {
				this.aRandomAccessFile2708.close();
				this.aRandomAccessFile2708 = null;
			}

			if (var1 != -1) {
				this.method1264(-5);
			}

		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final void method1263(long var1, int var3) throws IOException {
		try {
			if (var3 != 0) {
				this.aLong2709 = -60L;
			}

			this.aRandomAccessFile2708.seek(var1);
			this.aLong2707 = var1;
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	public final File method1264(int var1) {
		try {
			if (var1 >= -9) {
				this.aLong2709 = -10L;
			}

			return this.aFile2710;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final void method1265(int var1, int var2, byte[] var3, int var4) throws IOException {
		try {
			if (this.aLong2707 + (long) var2 <= this.aLong2709) {
				if (var4 == 1) {
					this.aRandomAccessFile2708.write(var3, var1, var2);
					this.aLong2707 += (long) var2;
				}
			} else {
				this.aRandomAccessFile2708.seek(this.aLong2709);
				this.aRandomAccessFile2708.write(1);
				throw new EOFException();
			}
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	protected void finalize() throws Throwable {
		try {
			if (null != this.aRandomAccessFile2708) {
				System.out.println("Warning! fileondisk " + this.aFile2710 + " not closed correctly using close(). Auto-closing instead. ");
				this.method1262(-1);
			}

		} catch (RuntimeException var2) {
			throw var2;
		}
	}

	public final long method1266(int var1) throws IOException {
		try {
			if (var1 != 74) {
				this.method1264(27);
			}

			return this.aRandomAccessFile2708.length();
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public Class192(File var1, String var2, long var3) throws IOException {
		try {
			if (~var3 == 0L) {
				var3 = Long.MAX_VALUE;
			}

			if (var3 < var1.length()) {
				var1.delete();
			}

			this.aRandomAccessFile2708 = new RandomAccessFile(var1, var2);
			this.aLong2709 = var3;
			this.aFile2710 = var1;
			this.aLong2707 = 0L;
			int var5 = this.aRandomAccessFile2708.read();
			if (-1 != var5 && !var2.equals("r")) {
				this.aRandomAccessFile2708.seek(0L);
				this.aRandomAccessFile2708.write(var5);
			}

			this.aRandomAccessFile2708.seek(0L);
		} catch (RuntimeException var6) {
			throw var6;
		}
	}
}
