import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class28 {

	private DisplayMode aDisplayMode381;
	private GraphicsDevice aGraphicsDevice382;

	public void method223(int var1) {
		try {
			if (null != this.aDisplayMode381) {
				this.aGraphicsDevice382.setDisplayMode(this.aDisplayMode381);
				if (!this.aGraphicsDevice382.getDisplayMode().equals(this.aDisplayMode381)) {
					throw new RuntimeException("Did not return to correct resolution!");
				}

				this.aDisplayMode381 = null;
			}

			this.method225(1617321346, (Frame) null);
			if (var1 >= -104) {
				this.method224((byte) 21);
			}

		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public int[] method224(byte var1) {
		try {
			DisplayMode[] var2 = this.aGraphicsDevice382.getDisplayModes();
			int[] var3 = new int[var2.length << 778819202];
			if (var1 != -80) {
				this.method224((byte) -91);
			}

			for (int var4 = 0; var4 < var2.length; ++var4) {
				var3[var4 << 1617321346] = var2[var4].getWidth();
				var3[1 + (var4 << 208102274)] = var2[var4].getHeight();
				var3[(var4 << 1565940610) + 2] = var2[var4].getBitDepth();
				var3[3 + (var4 << -990362622)] = var2[var4].getRefreshRate();
			}

			return var3;
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	private void method225(int var1, Frame var2) {
		try {
			boolean var3 = false;

			Field var4;
			try {
				if (var1 != 1617321346) {
					this.method223(126);
				}

				var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
				var4.setAccessible(true);
				boolean var5 = ((Boolean) var4.get(this.aGraphicsDevice382)).booleanValue();
				if (var5) {
					var3 = true;
					var4.set(this.aGraphicsDevice382, Boolean.FALSE);
				}
			} catch (Throwable var16) {
				;
			}

			boolean var13 = false;

			try {
				var13 = true;
				this.aGraphicsDevice382.setFullScreenWindow(var2);
				var13 = false;
			} finally {
				if (var13) {
					if (var3) {
						try {
							Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
							var7.set(this.aGraphicsDevice382, Boolean.TRUE);
						} catch (Throwable var14) {
							;
						}
					}

				}
			}

			if (var3) {
				try {
					var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					var4.set(this.aGraphicsDevice382, Boolean.TRUE);
				} catch (Throwable var15) {
					;
				}
			}

		} catch (RuntimeException var18) {
			throw var18;
		}
	}

	public void method226(int var1, int var2, Frame var3, int var4, int var5, int var6) {
		try {
			int var7 = 124 % ((61 - var1) / 43);
			this.aDisplayMode381 = this.aGraphicsDevice382.getDisplayMode();
			if (this.aDisplayMode381 == null) {
				throw new NullPointerException();
			} else {
				var3.setUndecorated(true);
				var3.enableInputMethods(false);
				this.method225(1617321346, var3);
				if (-1 == ~var5) {
					int var8 = this.aDisplayMode381.getRefreshRate();
					DisplayMode[] var9 = this.aGraphicsDevice382.getDisplayModes();
					boolean var10 = false;

					for (int var11 = 0; var11 < var9.length; ++var11) {
						if (var9[var11].getWidth() == var2 && var6 == var9[var11].getHeight() && var4 == var9[var11].getBitDepth()) {
							int var12 = var9[var11].getRefreshRate();
							if (!var10 || Math.abs(var12 + -var8) < Math.abs(-var8 + var5)) {
								var10 = true;
								var5 = var12;
							}
						}
					}

					if (!var10) {
						var5 = var8;
					}
				}

				this.aGraphicsDevice382.setDisplayMode(new DisplayMode(var2, var6, var4, var5));
			}
		} catch (RuntimeException var13) {
			throw var13;
		}
	}

	public Class28() throws Exception {
		try {
			GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
			this.aGraphicsDevice382 = var1.getDefaultScreenDevice();
			if (!this.aGraphicsDevice382.isFullScreenSupported()) {
				GraphicsDevice[] var2 = var1.getScreenDevices();
				GraphicsDevice[] var3 = var2;

				for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
					GraphicsDevice var5 = var3[var4];
					if (null != var5 && var5.isFullScreenSupported()) {
						this.aGraphicsDevice382 = var5;
						return;
					}
				}

				throw new Exception();
			}
		} catch (RuntimeException var6) {
			throw var6;
		}
	}
}
