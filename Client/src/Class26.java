import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

class Class26 {

	private Component aComponent359;
	private Robot aRobot360;

	void method209(int var1, byte var2, int var3) {
		try {
			this.aRobot360.mouseMove(var1, var3);
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	void method210(boolean var1, Component var2, boolean var3) {
		try {
			if (!var1) {
				if (null == var2) {
					throw new NullPointerException();
				}
			} else {
				var2 = null;
			}

			if (!var3) {
				if (var2 != this.aComponent359) {
					if (this.aComponent359 != null) {
						this.aComponent359.setCursor((Cursor) null);
						this.aComponent359 = null;
					}

					if (var2 != null) {
						var2.setCursor(var2.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), (String) null));
						this.aComponent359 = var2;
					}

				}
			}
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	void method211(int[] var1, int var2, Component var3, int var4, byte var5, Point var6) {
		try {
			if (var1 == null) {
				var3.setCursor((Cursor) null);
			} else {
				BufferedImage var7 = new BufferedImage(var2, var4, 2);
				var7.setRGB(0, 0, var2, var4, var1, 0, var2);
				var3.setCursor(var3.getToolkit().createCustomCursor(var7, var6, (String) null));
			}

			if (var5 <= 77) {
				this.aRobot360 = (Robot) null;
			}

		} catch (RuntimeException var8) {
			throw var8;
		}
	}

	Class26() throws Exception {
		try {
			this.aRobot360 = new Robot();
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
}
