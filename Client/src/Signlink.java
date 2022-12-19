import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;

public class Signlink implements Runnable {

	private static Hashtable aHashtable726 = new Hashtable(16);
	public Class192[] aClass192Array727;
	public EventQueue anEventQueue728;
	public static String aString729;
	private Class182 aClass182_730 = null;
	public static String aString731;
	public static String osName;
	public Applet anApplet733 = null;
	private Class182 aClass182_734 = null;
	public Class192 aClass192_735 = null;
	public static String aString736;
	public Class192 aClass192_737 = null;
	private boolean aBool738 = false;
	private Thread aThread739;
	public static int anInt740 = 1;
	private static String aString741;
	public static String osArch;
	public Class192 aClass192_743 = null;
	private static int anInt744;
	private static String aString745;
	private Class28 aClass28_746;
	public static String aString747;
	private Interface9 anInterface9_748;
	private Class26 aClass26_749;
	public static Method aMethod750;
	public static Method aMethod751;
	static volatile long aLong752 = 0L;

	static String osAndCPUArchitecture;

	private final Class182 method340(int var1, byte var2, Object var3, int var4, int var5) {
		try {
			Class182 var6 = new Class182();
			synchronized (var6) {
				var6.anInt2534 = var5;
				var6.anInt2537 = var4;
				var6.anObject2536 = var3;
				var6.anInt2540 = var1;
				synchronized (this) {
					if (null != this.aClass182_730) {
						this.aClass182_730.aClass182_2538 = var6;
						this.aClass182_730 = var6;
					} else {
						this.aClass182_730 = this.aClass182_734 = var6;
					}

					this.notify();
				}

				try {
					if (var2 != 117) {
						this.method365((byte) -79, (String) null);
					}

					var6.wait();
				} catch (InterruptedException var11) {
					;
				}
			}

			return var6;
		} catch (RuntimeException var14) {
			throw var14;
		}
	}

	public final Class182 method341(Transferable var1, byte var2) {
		try {
			return var2 != 87 ? (Class182) null : this.method344(19, var1, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Class182 method342(int var1, int var2, int var3, boolean var4, int var5) {
		try {
			if (!var4) {
				aString747 = (String) null;
			}

			return this.method344(6, (Object) null, (byte) 99, var1 + (var5 << -149711472), var2 + (var3 << -695361872));
		} catch (RuntimeException var7) {
			throw var7;
		}
	}

	public static final File method343(String var1, boolean var2) {
		try {
			return var2 ? (File) null : method358(var1, 0, anInt744, aString745);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	private final Class182 method344(int var1, Object var2, byte var3, int var4, int var5) {
		try {
			Class182 var6 = new Class182();
			var6.anInt2540 = var5;
			var6.anInt2537 = var1;
			var6.anObject2536 = var2;
			var6.anInt2534 = var4;
			synchronized (this) {
				if (null == this.aClass182_730) {
					this.aClass182_730 = this.aClass182_734 = var6;
				} else {
					this.aClass182_730.aClass182_2538 = var6;
					this.aClass182_730 = var6;
				}

				this.notify();
			}

			if (var3 != 99) {
				this.method341((Transferable) null, (byte) 58);
			}

			return var6;
		} catch (RuntimeException var10) {
			throw var10;
		}
	}

	public final boolean method345(byte var1) {
		try {
			if (var1 >= -85) {
				this.method353((URL) null, 14);
			}

			return this.aClass28_746 != null;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final void method346(Class var1, int var2) throws Exception {
		try {
			Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
			Runtime var5 = Runtime.getRuntime();
			Method var6 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", new Class[] { Boolean.TYPE });
			Method var7;
			if (!osName.startsWith("mac")) {
				var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
				var6.invoke(var7, new Object[] { Boolean.TRUE });
				var7.invoke(var5, new Object[] { var1, "jawt" });
				var6.invoke(var7, new Object[] { Boolean.FALSE });
			}

			var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
			var6.invoke(var7, new Object[] { Boolean.TRUE });
			if (osName.startsWith("win")) {
				var7.invoke(var5, new Object[] { var1, this.method343("sw3d.dll", false).toString() });
				var6.invoke(var7, new Object[] { Boolean.FALSE });
			} else {
				throw new Exception();
			}
		} catch (RuntimeException var8) {
			var8.printStackTrace();
			// throw var8;
		}
	}

	public final void method347(byte var1) {
		try {
			synchronized (this) {
				this.aBool738 = true;
				this.notifyAll();
			}

			try {
				this.aThread739.join();
				if (var1 >= -51) {
					this.method349((Class) null, false);
				}
			} catch (InterruptedException var8) {
				;
			}

			if (null != this.aClass192_743) {
				try {
					this.aClass192_743.method1262(-1);
				} catch (IOException var7) {
					;
				}
			}

			if (this.aClass192_737 != null) {
				try {
					this.aClass192_737.method1262(-1);
				} catch (IOException var6) {
					;
				}
			}

			if (null != this.aClass192Array727) {
				for (int var2 = 0; ~var2 > ~this.aClass192Array727.length; ++var2) {
					if (this.aClass192Array727[var2] != null) {
						try {
							this.aClass192Array727[var2].method1262(-1);
						} catch (IOException var5) {
							;
						}
					}
				}
			}

			if (null != this.aClass192_735) {
				try {
					this.aClass192_735.method1262(-1);
				} catch (IOException var4) {
					;
				}
			}

		} catch (RuntimeException var10) {
			throw var10;
		}
	}

	public final Class182 method348(String var1, int var2) {
		try {
			if (var2 != 14) {
				this.aClass192_743 = (Class192) null;
			}

			return this.method344(16, var1, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Class182 method349(Class var1, boolean var2) {
		try {
			return var2 ? (Class182) null : this.method344(11, var1, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final void run() {
		try {
			while (true) {
				Class182 var2;
				synchronized (this) {
					while (true) {
						if (this.aBool738) {
							return;
						}

						if (this.aClass182_734 != null) {
							var2 = this.aClass182_734;
							this.aClass182_734 = this.aClass182_734.aClass182_2538;
							if (this.aClass182_734 == null) {
								this.aClass182_730 = null;
							}
							break;
						}

						try {
							this.wait();
						} catch (InterruptedException var11) {
							;
						}
					}
				}

				try {
					int var1 = var2.anInt2537;
					if (1 != var1) {
						if (2 != var1) {
							if (var1 != 4) {
								Object[] var3;
								if (var1 == 8) {
									var3 = (Object[]) ((Object[]) var2.anObject2536);
									if (null == ((Class) var3[0]).getClassLoader()) {
										throw new SecurityException();
									}

									var2.anObject2535 = ((Class) var3[0]).getDeclaredMethod((String) var3[1], (Class[]) ((Class[]) var3[2]));
								} else if (var1 != 9) {
									if (var1 != 18) {
										if (~var1 == -20) {
											Transferable var18 = (Transferable) var2.anObject2536;
											Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var4.setContents(var18, (ClipboardOwner) null);
										} else {
											String var29;
											if (~var1 != -4) {
												if (-22 != ~var1) {
													if (~var1 != -6) {
														if (var1 == 6) {
															Frame var19 = new Frame("Jagex Full Screen");
															var2.anObject2535 = var19;
															var19.setResizable(false);
															this.aClass28_746.method226(113, var2.anInt2534 >>> -1757097072, var19, var2.anInt2540 >> 1428037648, '\uffff' & var2.anInt2540, '\uffff' & var2.anInt2534);
														} else if (-8 != ~var1) {

															int var5;
															if (11 == var1) {
																/*
																 * Field var20 = Class .forName( "java.lang.ClassLoader") .getDeclaredField( "nativeLibraries"); var20.setAccessible(true);
																 * Vector var21 = (Vector) var20 .get(((Class) var2.anObject2536) .getClassLoader());
																 * 
																 * for (var5 = 0; ~var21 .size() < ~var5; ++var5) { Object var6 = var21 .elementAt(var5); Method var7 = var6 .getClass()
																 * .getDeclaredMethod( "finalize", new Class[0]); var7.setAccessible(true); var7.invoke( var6, new Object[0]);
																 * var7.setAccessible(false); Field var8 = var6 .getClass() .getDeclaredField( "handle"); var8.setAccessible(true); var8.set(
																 * var6, new Integer( 0)); var8.setAccessible(false); }
																 * 
																 * var20.setAccessible(false); /
																 */
																NativeLibraryLoader.finalizeNatives();
															} else if (~var1 == -13) {
																Class192 var22 = method351((String) var2.anObject2536, this.aString745, this.anInt744, 0);
																var2.anObject2535 = var22;
															} else if (var1 == 14) {
																int var23 = var2.anInt2534;
																int var24 = var2.anInt2540;
																this.aClass26_749.method209(var23, (byte) 75, var24);
															} else if (-16 == ~var1) {
																boolean var25 = var2.anInt2534 != 0;
																Component var26 = (Component) var2.anObject2536;
																this.aClass26_749.method210(var25, var26, false);
															} else if (var1 == 17) {
																var3 = (Object[]) ((Object[]) var2.anObject2536);
																this.aClass26_749.method211((int[]) ((int[]) var3[1]), var2.anInt2534, (Component) var3[0], var2.anInt2540, (byte) 109, (Point) var3[2]);
															} else if (16 == var1) {
																try {
																	if (!osName.startsWith("win")) {
																		throw new Exception();
																	}

																	var29 = (String) var2.anObject2536;
																	if (!var29.startsWith("http://") && !var29.startsWith("https://")) {
																		throw new Exception();
																	}

																	String var27 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

																	for (var5 = 0; var29.length() > var5; ++var5) {
																		if (0 == ~var27.indexOf(var29.charAt(var5))) {
																			throw new Exception();
																		}
																	}

																	Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var29 + "\"");
																	var2.anObject2535 = null;
																} catch (Exception var13) {
																	var2.anObject2535 = var13;
																	throw var13;
																}
															} else {
																if (20 != var1) {
																	throw new Exception("");
																}

																/*
																 * 
																 * try { Class[] var30 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }; Runtime var28 =
																 * Runtime .getRuntime(); Method var31 = Class .forName( "java.lang.Runtime") .getDeclaredMethod( "load0", var30);
																 * var31.setAccessible(true); if (osName .startsWith("win")) { if (!osArch .startsWith("amd64") && !osArch
																 * .startsWith("x86_64")) { var31.invoke( var28, new Object[] { var2.anObject2536, this.method343( "jagmisc.dll", false)
																 * .toString() }); } else { var31.invoke( var28, new Object[] { var2.anObject2536, this.method343( "jagmisc64.dll", false)
																 * .toString() }); } }
																 * 
																 * var31.setAccessible(false); } catch (Throwable var12) { var2.anObject2535 = var12; } /
																 */
															}
														} else {
															this.aClass28_746.method223(-127);
														}
													} else {
														var2.anObject2535 = this.aClass28_746.method224((byte) -80);
													}
												} else {
													if (Class151.time(-84) < aLong752) {
														throw new IOException();
													}

													var2.anObject2535 = InetAddress.getByName((String) var2.anObject2536).getAddress();
												}
											} else {
												if (~Class151.time(-48) > ~aLong752) {
													throw new IOException();
												}

												var29 = (var2.anInt2534 >> -1578467176 & 255) + "." + (255 & var2.anInt2534 >> -1030710640) + "." + (255 & var2.anInt2534 >> -26172504) + "." + (var2.anInt2534 & 255);
												var2.anObject2535 = InetAddress.getByName(var29).getHostName();
											}
										}
									} else {
										Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
										var2.anObject2535 = var32.getContents((Object) null);
									}
								} else {
									var3 = (Object[]) ((Object[]) var2.anObject2536);
									if (((Class) var3[0]).getClassLoader() == null) {
										throw new SecurityException();
									}

									var2.anObject2535 = ((Class) var3[0]).getDeclaredField((String) var3[1]);
								}
							} else {
								if (Class151.time(-55) < aLong752) {
									throw new IOException();
								}

								var2.anObject2535 = new DataInputStream(((URL) var2.anObject2536).openStream());
							}
						} else {
							Thread var33 = new Thread((Runnable) var2.anObject2536);
							var33.setDaemon(true);
							var33.start();
							var33.setPriority(var2.anInt2534);
							var2.anObject2535 = var33;
						}
					} else {
						if (aLong752 > Class151.time(-51)) {
							throw new IOException();
						}

						var2.anObject2535 = new Socket(InetAddress.getByName((String) var2.anObject2536), var2.anInt2534);
					}

					var2.anInt2539 = 1;
				} catch (ThreadDeath var14) {
					throw var14;
				} catch (Throwable var15) {
					var2.anInt2539 = 2;
				}

				synchronized (var2) {
					var2.notify();
				}
			}
		} catch (RuntimeException var17) {
			throw var17;
		}
	}

	public final Class182 method350(int var1, Class var2, String var3) {
		try {
			return var1 >= -77 ? (Class182) null : this.method344(9, new Object[] { var2, var3 }, (byte) 99, 0, 0);
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	private static final Class192 method351(String var0, String var1, int var2, int var3) {
		try {
			String var4;
			if (var2 == 33) {
				var4 = "jagex_" + var1 + "_preferences" + var0 + "_rc.dat";
			} else if (var2 != 34) {
				var4 = "jagex_" + var1 + "_preferences" + var0 + ".dat";
			} else {
				var4 = "jagex_" + var1 + "_preferences" + var0 + "_wip.dat";
			}

			String[] var5 = new String[] { "c:/rscache/", "/rscache/", aString741, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };

			for (int var6 = var3; var5.length > var6; ++var6) {
				String var7 = var5[var6];
				if (-1 <= ~var7.length() || (new File(var7)).exists()) {
					try {
						Class192 var8 = new Class192(new File(var7, var4), "rw", 10000L);
						return var8;
					} catch (Exception var9) {
						;
					}
				}
			}

			return null;
		} catch (RuntimeException var10) {
			throw var10;
		}
	}

	public final Class182 method352(Point var1, Component var2, int var3, int[] var4, int var5, int var6) {
		try {
			if (var6 != -23853) {
				this.aClass182_734 = (Class182) null;
			}

			return this.method344(17, new Object[] { var2, var4, var1 }, (byte) 99, var3, var5);
		} catch (RuntimeException var8) {
			throw var8;
		}
	}

	public final Class182 method353(URL var1, int var2) {
		try {
			if (var2 > -97) {
				this.aClass26_749 = (Class26) null;
			}

			return this.method344(4, var1, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Class182 method354(int var1, int var2, Runnable var3) {
		try {
			int var4 = 89 % ((var1 - 20) / 51);
			return this.method344(2, var3, (byte) 99, var2, 0);
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	public final Class182 method355(byte var1, int var2) {
		try {
			if (var1 != 122) {
				this.aBool738 = true;
			}

			return this.method344(3, (Object) null, (byte) 99, var2, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Class182 method356(byte var1, Class var2) {
		try {
			int var3 = 17 / ((var1 - -62) / 58);
			return this.method344(20, var2, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Class182 method357(byte var1, Frame var2) {
		try {
			return var1 != -64 ? (Class182) null : this.method344(7, var2, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public static final File method358(String var0, int var1, int var2, String var3) {
		try {
			File var4 = (File) aHashtable726.get(var0);
			if (null != var4) {
				return var4;
			} else {
				String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString741, "/tmp/", "" };
				String[] var6 = new String[] { ".jagex_cache_" + var2, ".file_store_" + var2 };

				for (int var7 = var1; ~var7 > -3; ++var7) {
					for (int var8 = 0; var8 < var6.length; ++var8) {
						for (int var9 = 0; ~var5.length < ~var9; ++var9) {
							String var10 = var5[var9] + var6[var8] + "/" + (null == var3 ? "" : var3 + "/") + var0;
							RandomAccessFile var11 = null;

							try {
								File var12 = new File(var10);
								if (~var7 != -1 || var12.exists()) {
									String var13 = var5[var9];
									if (~var7 != -2 || -1 <= ~var13.length() || (new File(var13)).exists()) {
										(new File(var5[var9] + var6[var8])).mkdir();
										if (null != var3) {
											(new File(var5[var9] + var6[var8] + "/" + var3)).mkdir();
										}

										var11 = new RandomAccessFile(var12, "rw");
										int var14 = var11.read();
										var11.seek(0L);
										var11.write(var14);
										var11.seek(0L);
										var11.close();
										aHashtable726.put(var0, var12);
										return var12;
									}
								}
							} catch (Exception var16) {
								try {
									if (var11 != null) {
										var11.close();
										var11 = null;
									}
								} catch (Exception var15) {
									;
								}
							}
						}
					}
				}

				throw new RuntimeException();
			}
		} catch (RuntimeException var17) {
			var17.printStackTrace();
			throw var17;
		}
	}

	public final Class182 method359(byte var1) {
		try {
			if (var1 != -80) {
				this.aClass192_735 = (Class192) null;
			}

			return this.method344(5, (Object) null, (byte) 99, 0, 0);
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final Class182 method360(Class[] var1, String var2, Class var3, int var4) {
		try {
			if (var4 != 2) {
				method351((String) null, (String) null, 62, -116);
			}

			return this.method344(8, new Object[] { var3, var2, var1 }, (byte) 99, 0, 0);
		} catch (RuntimeException var6) {
			throw var6;
		}
	}

	public final void method361(byte var1) {
		try {
			aLong752 = Class151.time(var1 + -133) + 5000L;
			if (var1 != 62) {
				aMethod751 = (Method) null;
			}

		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final byte[] method362(String var1, int var2) {
		try {
			if (var2 != 14) {
				this.anInt744 = 80;
			}

			Class182 var3 = this.method340(0, (byte) 117, var1, 21, 0);
			return (byte[]) ((byte[]) var3.anObject2535);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public final Interface9 method363(int var1) {
		try {
			if (var1 != 18) {
				method351((String) null, (String) null, -105, -1);
			}

			return this.anInterface9_748;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}

	public final Class182 method364(int var1, String var2, int var3) {
		try {
			return var1 != 0 ? (Class182) null : this.method344(1, var2, (byte) 99, var3, 0);
		} catch (RuntimeException var5) {
			throw var5;
		}
	}

	public final Class182 method365(byte var1, String var2) {
		try {
			return var1 > -43 ? (Class182) null : this.method344(12, var2, (byte) 99, 0, 0);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	public Signlink(Applet var1, int var2, String var3, int var4) throws Exception {
		try {
			aString747 = "Unknown";
			this.aString745 = var3;
			this.anInt744 = var2;
			this.anApplet733 = var1;
			aString731 = "1.1";

			try {
				aString747 = System.getProperty("java.vendor");
				aString731 = System.getProperty("java.version");
			} catch (Exception var18) {
				;
			}

			try {
				aString736 = System.getProperty("os.name");
			} catch (Exception var17) {
				aString736 = "Unknown";
			}

			osName = aString736.toLowerCase();

			try {
				osArch = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var16) {
				osArch = "";
			}

			try {
				aString729 = System.getProperty("os.version").toLowerCase();
			} catch (Exception var15) {
				aString729 = "";
			}

			try {
				aString741 = System.getProperty("user.home");
				if (null != aString741) {
					aString741 = aString741 + "/";
				}
			} catch (Exception var14) {
				;
			}

			if (aString741 == null) {
				aString741 = "~/";
			}

			try {
				this.anEventQueue728 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable var13) {
				;
			}

			try {
				if (var1 == null) {
					aMethod750 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
				} else {
					aMethod750 = var1.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
				}
			} catch (Exception var12) {
				;
			}

			try {
				if (null == var1) {
					aMethod751 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
				} else {
					aMethod751 = var1.getClass().getMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
				}
			} catch (Exception var11) {
				;
			}

			this.aClass192_735 = new Class192(method358("random.dat", 0, this.anInt744, (String) null), "rw", 25L);
			this.aClass192_743 = new Class192(this.method343("main_file_cache.dat2", false), "rw", 209715200L);
			this.aClass192_737 = new Class192(this.method343("main_file_cache.idx255", false), "rw", 1048576L);
			this.aClass192Array727 = new Class192[var4];

			for (int var5 = 0; ~var4 < ~var5; ++var5) {
				this.aClass192Array727[var5] = new Class192(this.method343("main_file_cache.idx" + var5, false), "rw", 1048576L);
			}

			try {
				this.aClass28_746 = new Class28();
			} catch (Throwable var10) {
				;
			}

			try {
				this.aClass26_749 = new Class26();
			} catch (Throwable var9) {
				;
			}

			ThreadGroup var20 = Thread.currentThread().getThreadGroup();

			for (ThreadGroup var6 = var20.getParent(); var6 != null; var6 = var6.getParent()) {
				var20 = var6;
			}

			Thread[] var7 = new Thread[1000];
			var20.enumerate(var7);

			for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
				if (var7[var8] != null && var7[var8].getName().startsWith("AWT")) {
					var7[var8].setPriority(1);
				}
			}

			this.aBool738 = false;
			this.aThread739 = new Thread(this);
			this.aThread739.setPriority(10);
			this.aThread739.setDaemon(true);
			this.aThread739.start();
		} catch (RuntimeException var19) {
			throw var19;
		}
	}

}
