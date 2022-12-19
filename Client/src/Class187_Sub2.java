
/* Class187_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jagex3.jagmisc.jagmisc;

final class Class187_Sub2 extends Class187 implements Interface10 {
	static int anInt5415;
	static int anInt5416;
	static int anInt5417;
	static int anInt5418;
	static int anInt5419;
	static int anInt5420;
	static int anInt5421;
	static int anInt5422;
	private int anInt5423;
	static int anInt5424;
	static int[] anIntArray5425 = new int[256];
	static OutgoingPacket aClass201_5426;
	static int anInt5427;
	static Class_l aClass_l5428;

	public static void method2284(byte i) {
		try {
			anIntArray5425 = null;
			aClass_l5428 = null;
			if (i <= 119)
				aClass201_5426 = null;
			aClass201_5426 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.B(" + i + ')');
		}
	}

	public final void method33(byte i, int i_0_, int i_1_, byte[] is) {
		try {
			anInt5415++;
			this.method1224(51, i_0_, is);
			anInt5423 = i_1_;
			int i_2_ = 53 % ((i - 12) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2285(String string, boolean bool, int i) {
		do {
			try {
				anInt5422++;
				if (Class260_Sub2.aClass205_4297 != Class208.aClass205_2930 || Class260_Sub2.anInt4289 >= 2) {
					if (string.equalsIgnoreCase("errortest"))
						throw new RuntimeException();
					if (string.equals("nativememerror"))
						throw new OutOfMemoryError("native(MPR");
					try {
						if (string.equalsIgnoreCase("fpson")) {
							Class246_Sub34.aBool5145 = true;
							Class252.printConsoleMessage(126, "fps debug enabled");
							break;
						}
						if (string.equalsIgnoreCase("fpsoff")) {
							Class246_Sub34.aBool5145 = false;
							Class252.printConsoleMessage(i + 121, "fps debug disabled");
							break;
						}
						if (string.equals("systemmem")) {
							try {
								Class252.printConsoleMessage(121, ("System memory: " + (jagmisc.getAvailablePhysicalMemory() / 1048576L) + "/" + (jagmisc.getTotalPhysicalMemory() / 1048576L) + "Mb"));
							} catch (Throwable throwable) {
								/* empty */
							}
							break;
						}
						if (string.equalsIgnoreCase("cls")) {
							Class59_Sub2_Sub2.anInt6018 = 0;
							Class91.anInt1188 = 0;
							break;
						}
						if (string.equalsIgnoreCase("cleartext")) {
							Class_o.aClass68_7208.method443(45);
							Class252.printConsoleMessage(122, "Text coords cleared");
							break;
						}
						if (string.equalsIgnoreCase("gc")) {
							Class106_Sub2.method2262(i ^ 0x4f99);
							for (int i_3_ = 0; i_3_ < 10; i_3_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_4_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(123, "mem=" + i_4_ + "k");
							break;
						}
						if (string.equalsIgnoreCase("compact")) {
							Class106_Sub2.method2262(20378);
							for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -11; i_5_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_6_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(i ^ 0x79, ("Memory before cleanup=" + i_6_ + "k"));
							Class188.method1230((byte) 113);
							Class106_Sub2.method2262(20378);
							for (int i_7_ = 0; i_7_ < 10; i_7_++)
								System.gc();
							i_6_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
							Class252.printConsoleMessage(125, ("Memory after cleanup=" + i_6_ + "k"));
							break;
						}
						if (string.equalsIgnoreCase("pcachesize")) {
							Class252.printConsoleMessage(125, ("Number of player models in cache:" + Class40_Sub6.method2183((byte) -29)));
							break;
						}
						if (string.equalsIgnoreCase("clientdrop")) {
							Class252.printConsoleMessage(124, "Dropped client connection");
							if (Class225.anInt3103 == 30)
								Class246_Sub1_Sub11.method2615((byte) 111);
							else {
								if ((Class225.anInt3103 ^ 0xffffffff) == -26)
									Class59_Sub3_Sub1.aBool5746 = true;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("clientjs5drop")) {
							Class140.aClass242_2036.method1563(228742352);
							Class252.printConsoleMessage(127, "Dropped client js5 net queue");
							break;
						}
						if (string.equalsIgnoreCase("serverjs5drop")) {
							Class140.aClass242_2036.method1556((byte) -81);
							Class252.printConsoleMessage(i + 120, "Dropped server js5 net queue");
							break;
						}
						if (string.equalsIgnoreCase("breakcon")) {
							Class108.aClass52_1535.method361((byte) 62);
							Class65.aClass6_864.method66(0);
							Class140.aClass242_2036.method1555((byte) -113);
							Class252.printConsoleMessage(122, "Breaking new connections for 5 seconds");
							break;
						}
						if (string.equalsIgnoreCase("rebuild")) {
							Actor.method2663(true);
							Class149.method1004(-114);
							Class252.printConsoleMessage(i ^ 0x79, "Rebuilding map");
							break;
						}
						if (string.equalsIgnoreCase("wm1")) {
							Class100.method629(1, -1, -1, false, false);
							if ((Class258.method1673((byte) -123) ^ 0xffffffff) != -2)
								Class252.printConsoleMessage(124, "wm1 failed");
							else {
								Class252.printConsoleMessage(123, "wm1 succeeded");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm2")) {
							Class100.method629(2, -1, -1, false, false);
							if ((Class258.method1673((byte) -123) ^ 0xffffffff) != -3)
								Class252.printConsoleMessage(121, "wm2 failed");
							else {
								Class252.printConsoleMessage(i + 122, "wm2 succeeded");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm3")) {
							Class100.method629(3, 768, 1024, false, false);
							if (Class258.method1673((byte) -123) != 3)
								Class252.printConsoleMessage(124, "wm3 failed");
							else {
								Class252.printConsoleMessage(125, "wm3 succeeded");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk0")) {
							Class129.method883(0, (byte) 88);
							if (BufferStream.anInt5656 == 0) {
								Class252.printConsoleMessage(126, "Entered tk0");
								((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt598 = 0;
								Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -114);
								RuntimeException_Sub2.aBool7148 = false;
							} else {
								Class252.printConsoleMessage(121, "Failed to enter tk0");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk1")) {
							Class129.method883(1, (byte) 91);
							if (BufferStream.anInt5656 != 1)
								Class252.printConsoleMessage(121, "Failed to enter tk1");
							else {
								Class252.printConsoleMessage(127, "Entered tk1");
								((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt598 = 1;
								Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 117);
								RuntimeException_Sub2.aBool7148 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk2")) {
							Class129.method883(2, (byte) 117);
							if (BufferStream.anInt5656 == 2) {
								Class252.printConsoleMessage(127, "Entered tk2");
								((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt598 = 2;
								Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -112);
								RuntimeException_Sub2.aBool7148 = false;
							} else {
								Class252.printConsoleMessage(i + 123, "Failed to enter tk2");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk3")) {
							Class129.method883(3, (byte) 69);
							if ((BufferStream.anInt5656 ^ 0xffffffff) == -4)
								Class252.printConsoleMessage(123, "Entered tk3");
							else {
								Class252.printConsoleMessage(122, "Failed to enter tk3");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("ot")) {
							((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool573 = !((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool573;
							Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 46);
							RuntimeException_Sub2.aBool7148 = false;
							Actor.method2663(true);
							Class252.printConsoleMessage(121, ("ot=" + (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool573)));
							break;
						}
						if (string.equalsIgnoreCase("gb")) {
							((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool567 = !((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool567;
							Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -107);
							RuntimeException_Sub2.aBool7148 = false;
							Actor.method2663(true);
							Class252.printConsoleMessage(127, ("gb=" + (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool567)));
							break;
						}
						if (string.startsWith("shadows")) {
							if ((string.length() ^ 0xffffffff) > -9)
								Class252.printConsoleMessage(127, "Invalid shadows value");
							else {
								String string_8_ = string.substring(8);
								int i_9_ = (!Class48.method323(string_8_, 59) ? -1 : Class104.method665(string_8_, 10));
								if (i_9_ < 0 || i_9_ > 2)
									Class252.printConsoleMessage(127, "Invalid shadows value");
								else {
									Class246_Sub28_Sub27.aClass39_Sub1_6759.method273(BufferStream.anInt5656, i ^ 0xffffffff, i_9_);
									Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 105);
									RuntimeException_Sub2.aBool7148 = false;
									Actor.method2663(true);
									Class252.printConsoleMessage(i ^ 0x79, "shadows=" + i_9_);
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("textures")) {
							((Class39) Class246_Sub28_Sub27.aClass39_Sub1_6759).aBool609 = !((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool609;
							Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) -97);
							RuntimeException_Sub2.aBool7148 = false;
							Class59_Sub1_Sub2.method2571(i - 10);
							Actor.method2663(true);
							Class252.printConsoleMessage(123, ("textures=" + (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).aBool609)));
							break;
						}
						if (string.startsWith("setba")) {
							if ((string.length() ^ 0xffffffff) > -7)
								Class252.printConsoleMessage(123, "Invalid buildarea value");
							else {
								int i_10_ = Class104.method665(string.substring(6), 10);
								if (i_10_ < 0 || ((i_10_ ^ 0xffffffff) < (client.method2969((Class40_Sub2.anInt4047), (byte) -91) ^ 0xffffffff)))
									Class252.printConsoleMessage(121, "Invalid buildarea value");
								else {
									((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt581 = i_10_;
									Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 63);
									RuntimeException_Sub2.aBool7148 = false;
									Class252.printConsoleMessage(125, ("maxbuildarea=" + (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt581)));
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("setparticles")) {
							if ((string.length() ^ 0xffffffff) > -14)
								Class252.printConsoleMessage(i + 118, "Invalid particles value");
							else {
								Class83.method531(Class104.method665(string.substring(13), 10), i + 9057);
								Class246_Sub28_Sub27.aClass39_Sub1_6759.method2047(Class108.aClass52_1535, (byte) 127);
								RuntimeException_Sub2.aBool7148 = false;
								Class252.printConsoleMessage(i ^ 0x7e, ("particles=" + Class246_Sub1_Sub13.method2699(8458)));
								break;
							}
							break;
						}
						if (string.startsWith("rect_debug")) {
							if (string.length() < 10)
								Class252.printConsoleMessage(121, "Invalid rect_debug value");
							else {
								Class210_Sub2.anInt5022 = Class104.method665(string.substring(10).trim(), 10);
								Class252.printConsoleMessage(123, ("rect_debug=" + (Class210_Sub2.anInt5022)));
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("qa_op_test")) {
							Class_v.aBool1452 = true;
							Class252.printConsoleMessage(123, ("qa_op_test=" + Class_v.aBool1452));
							break;
						}
						if (string.equalsIgnoreCase("clipcomponents")) {
							Class257.aBool3683 = !Class257.aBool3683;
							Class252.printConsoleMessage(i + 120, ("clipcomponents=" + Class257.aBool3683));
							break;
						}
						if (string.startsWith("bloom")) {
							boolean bool_11_ = Class246_Sub15.aClass260_4445.method1742();
							if (Class196.method1280(-14734, !bool_11_)) {
								if (!bool_11_)
									Class252.printConsoleMessage(122, "Bloom enabled");
								else
									Class252.printConsoleMessage(121, "Bloom disabled");
							} else {
								Class252.printConsoleMessage(i ^ 0x7c, "Failed to enable bloom");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tween")) {
							if (OutputStream_Sub1.aBool4488) {
								OutputStream_Sub1.aBool4488 = false;
								Class252.printConsoleMessage(122, "Forced tweening disabled.");
							} else {
								OutputStream_Sub1.aBool4488 = true;
								Class252.printConsoleMessage(127, "Forced tweening ENABLED!");
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("shiftclick")) {
							if (!Node.aBool3468) {
								Class252.printConsoleMessage(124, "Shift-click ENABLED!");
								Node.aBool3468 = true;
							} else {
								Class252.printConsoleMessage(123, "Shift-click disabled.");
								Node.aBool3468 = false;
								break;
							}
							break;
						}

						if (string.startsWith("cs2")) {
							int i_10_ = Class104.method665(string.substring(4), 10);
							Class122.decompile(i_10_);
							Class252.printConsoleMessage(i ^ 0x7c, "Disassembled clientscript: " + i_10_);
							break;
						}

						if (string.startsWith("icdump")) {
							int i_10_ = Class104.method665(string.substring(7), 10);

							DumpRelatedInterfaceConfigs.dump(i_10_);
							Class252.printConsoleMessage(i ^ 0x7c, "Dumped related interface configs for: " + i_10_);

							break;
						}

						if (string.equalsIgnoreCase("getcgcoord")) {
							Class252.printConsoleMessage(122, ("x:" + (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060 >> 7) + " z:" + (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059 >> 7)));
							break;
						}
						if (string.equalsIgnoreCase("getheight")) {
							Class252.printConsoleMessage(126, ("Height: " + (Class59_Sub3_Sub4.aClass210Array6993[(((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053)].l((((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5060) >> 7, (((Class59_Sub3) Class_a.aClass_r_Sub1_1180).anInt5059) >> 7))));
							break;
						}
						if (string.equalsIgnoreCase("resetminimap")) {
							Class210_Sub2.index8.method89((byte) 125);
							Class210_Sub2.index8.method105(0);
							Class246_Sub10.aClass254_4084.method1637(34);
							Class246_Sub28_Sub30.aClass165_6873.method1091(-128);
							Class149.method1004(-128);
							Class252.printConsoleMessage(i ^ 0x7c, "Minimap reset");
							break;
						}
						if (string.startsWith("mc")) {
							if (!Class246_Sub15.aClass260_4445.method1705())
								Class252.printConsoleMessage(122, "Current toolkit doesn't support multiple cores");
							else {
								int i_12_ = Integer.parseInt(string.substring(3));
								if ((i_12_ ^ 0xffffffff) > -2)
									i_12_ = 1;
								else if (i_12_ > 4)
									i_12_ = 4;
								Class246_Sub1_Sub13.anInt6562 = i_12_;
								Class246_Sub15.aClass260_4445.method1724(Class246_Sub1_Sub13.anInt6562);
								Class246_Sub15.aClass260_4445.method1714(0);
								Class252.printConsoleMessage(126, ("Render cores now: " + (Class246_Sub1_Sub13.anInt6562)));
								break;
							}
							break;
						}
						if (string.startsWith("cachespace")) {
							Class252.printConsoleMessage(i ^ 0x78, ("I(s): " + Class_q_Sub1.aClass54_6663.method373((byte) -61) + "/" + Class_q_Sub1.aClass54_6663.method377((byte) 58)));
							Class252.printConsoleMessage(122, ("I(m): " + Class_ls.aClass54_963.method373((byte) -125) + "/" + Class_ls.aClass54_963.method377((byte) 58)));
							Class252.printConsoleMessage(123, ("O(s): " + ((Class191) Class255.aClass191_3663).aClass206_2701.method1345(98) + "/" + ((Class191) Class255.aClass191_3663).aClass206_2701.method1355((byte) -106)));
							break;
						}
						if (string.equalsIgnoreCase("getcamerapos")) {
							Class252.printConsoleMessage(126, ("Pos: " + ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053 + "," + ((Class39_Sub1.anInt4670 + (Class246_Sub16.aInt92 >> 7)) >> 6) + "," + ((Class47.anInt686 + (Class259_Sub1.anInt4509 >> 7)) >> 6) + "," + ((Class39_Sub1.anInt4670 + (Class246_Sub16.aInt92 >> 7)) & 0x3f) + "," + (0x3f & ((Class259_Sub1.anInt4509 >> 7) - -Class47.anInt686)) + " Height: " + (Class6.getAverageHeight(Class246_Sub16.aInt92, i ^ 0x57, (((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053), Class259_Sub1.anInt4509) - Class246_Sub28_Sub8.anInt6077)));
							Class252.printConsoleMessage(122, ("Look: " + ((Class59_Sub3) Class_a.aClass_r_Sub1_1180).aByte5053 + "," + ((Class39_Sub1.anInt4670 + Class130_Sub3.anInt4406) >> 6) + "," + (Class40_Sub9.anInt5497 - -Class47.anInt686 >> 6) + "," + ((Class130_Sub3.anInt4406 + Class39_Sub1.anInt4670) & 0x3f) + "," + (Class47.anInt686 + Class40_Sub9.anInt5497 & 0x3f) + " Height: " + (Class6.getAverageHeight(Class130_Sub3.anInt4406, i ^ ~0x2f, (((Class59_Sub3) (Class_a.aClass_r_Sub1_1180)).aByte5053), Class40_Sub9.anInt5497) + -Class246_Sub1_Sub14.anInt6593)));
							break;
						}
						if (string.equals("showocc")) {
							Class238.aBool3361 = !Class238.aBool3361;
							Actor.method2663(true);
							Class252.printConsoleMessage(127, ("showocc=" + Class238.aBool3361));
							break;
						}
						if (string.equals("wallocc")) {
							Class93.aBool1224 = !Class93.aBool1224;
							Actor.method2663(true);
							Class252.printConsoleMessage(126, ("forcewallocc=" + Class93.aBool1224));
							break;
						}
						if (string.equals("renderprofile") || string.equals("rp")) {
							Class248.aBool3487 = !Class248.aBool3487;
							Class246_Sub15.aClass260_4445.method1696(Class248.aBool3487);
							Class22.method201(-81);
							Class252.printConsoleMessage(123, ("showprofiling=" + Class248.aBool3487));
							break;
						}
						if (string.equals("performancetest")) {
							Class252.printConsoleMessage(122, ("Java toolkit: " + (Class246_Sub40.method2310(Class108.aClass52_1535, 0, 48))));
							Class252.printConsoleMessage(121, ("GL toolkit:   " + (Class246_Sub40.method2310(Class108.aClass52_1535, 1, 115))));
							Class252.printConsoleMessage(127, ("SSE toolkit:  " + (Class246_Sub40.method2310(Class108.aClass52_1535, 2, i - 90))));
							break;
						}
						if (string.equals("nonpcs")) {
							Class38.aBool563 = !Class38.aBool563;
							Class252.printConsoleMessage(i + 120, "nonpcs=" + Class38.aBool563);
							break;
						}
						if (string.equals("autoworld")) {
							Class246_Sub28_Sub9.method2578((byte) -105);
							Class252.printConsoleMessage(127, "auto world selected");
							break;
						}
						if (string.startsWith("pc")) {
							Class243.writePacket(-103, Class170.aClass201_2420);
							Class130_Sub1.stream.writeByte(255, 0);
							int i_13_ = (((BufferStream) Class130_Sub1.stream).position);
							int i_14_ = string.indexOf(" ", 4);
							Class130_Sub1.stream.writeString(59, string.substring(3, i_14_));
							Class59_Sub3_Sub4.method2867(string.substring(i_14_), 0, (Class130_Sub1.stream));
							Class130_Sub1.stream.method2408(-1591647264, (-i_13_ + (((BufferStream) Class130_Sub1.stream).position)));
							break;
						}
						if (string.equals("heap")) {
							Class252.printConsoleMessage(i + 121, ("Heap: " + Class40_Sub2.anInt4047 + "MB"));
							break;
						}
						if (string.equals("savevarcs")) {
							Class173.method1136(-22125);
							Class252.printConsoleMessage(126, "perm varcs saved");
							break;
						}
						if (string.equals("scramblevarcs")) {
							for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (Class246_Sub1_Sub11.anIntArray6246.length ^ 0xffffffff)); i_15_++) {
								if (Class59_Sub3_Sub1.aBoolArray5739[i_15_]) {
									Class246_Sub1_Sub11.anIntArray6246[i_15_] = (int) (99999.0 * Math.random());
									if (Math.random() > 0.5)
										Class246_Sub1_Sub11.anIntArray6246[i_15_] *= -1;
								}
							}
							Class173.method1136(-22125);
							Class252.printConsoleMessage(i + 122, "perm varcs scrambled");
							break;
						}
						if (string.equals("showcolmap")) {
							Class134.aBool1869 = true;
							Class149.method1004(i ^ ~0x6f);
							Class252.printConsoleMessage(124, "colmap is shown");
							break;
						}
						if (string.equals("hidecolmap")) {
							Class134.aBool1869 = false;
							Class149.method1004(-108);
							Class252.printConsoleMessage(127, "colmap is hidden");
							break;
						}
						if (string.equals("resetcache")) {
							Class232.method1484((byte) 108);
							Class252.printConsoleMessage(124, "Caches reset");
							break;
						}
						if (string.equals("disablemousedrag")) {
							ClientLoader.MIDDLE_MOUSE = false;
							break;
						}
						if (string.equals("enablemousedrag")) {
							ClientLoader.MIDDLE_MOUSE = true;
							break;
						}
						if (string.equals("profilecpu")) {
							Class252.printConsoleMessage(126, (String.valueOf(Class207.method1359(115)) + "ms"));
							break;
						}
						if (string.startsWith("cpuusage")) {
							int i_16_ = Integer.parseInt(string.substring(9));
							if (i_16_ >= 0 && (i_16_ ^ 0xffffffff) >= -5)
								((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt584 = i_16_;
							Class252.printConsoleMessage(127, ("cpuusage=" + (((Class39) (Class246_Sub28_Sub27.aClass39_Sub1_6759)).anInt584)));
							break;
						}
						if (string.startsWith("getclientvarpbit")) {
							int i_17_ = Integer.parseInt(string.substring(17));
							Class252.printConsoleMessage(127, "varpbit=" + Class246_Sub28_Sub23.aClass95_6658.method34((byte) 45, i_17_));
							break;
						}
						if (string.startsWith("getclientvarp")) {
							int i_18_ = Integer.parseInt(string.substring(14));
							Class252.printConsoleMessage(124, ("varp=" + Class246_Sub28_Sub23.aClass95_6658.method35(i_18_, 0)));
							break;
						}
						if (string.startsWith("csprofileclear")) {
							Class146.method987();
							break;
						}
						if (string.startsWith("csprofileoutputc")) {
							Class146.method989(100, false);
							break;
						}
						if (string.startsWith("csprofileoutputt")) {
							Class146.method989(10, true);
							break;
						}
						if (string.startsWith("texsize")) {
							int i_19_ = Integer.parseInt(string.substring(8));
							Class246_Sub15.aClass260_4445.method1747(i_19_);
							break;
						}
						if (string.equals("soundstreamcount")) {
							Class252.printConsoleMessage(126, ("Active streams: " + Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2625()));
							break;
						}
						if ((Class225.anInt3103 ^ 0xffffffff) == -31) {
							Class15.anInt233++;
							Class243.writePacket(-101, Class57.aClass201_810);
							Class130_Sub1.stream.writeByte(255, 2 + string.length());
							Class130_Sub1.stream.writeByte(255, !bool ? 0 : 1);
							Class130_Sub1.stream.writeString(113, string);
						}
						if (string.startsWith("fps ") && (Class208.aClass205_2930 != Class260_Sub2.aClass205_4297)) {
							Class6.method70(Class104.method665(string.substring(4), 10), (byte) -112);
							break;
						}
						if (Class225.anInt3103 != 30)
							Class252.printConsoleMessage(123, ("Unrecogonised commmand when not logged in: " + string));
					} catch (Exception exception) {
						Class252.printConsoleMessage(123, "Whoops, something went wrong.");
					}
				}
				if (i == 3)
					break;
				method2285(null, true, 49);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("ue.J(" + (string != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method2286(int i) {
		try {
			anInt5421++;
			if (i < 79)
				aClass_l5428 = null;
			if (Class106_Sub2.aBool5333) {
				try {
					Class80.method521(Class108.aClass52_1535.anApplet733, "showVideoAd", 111);
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.H(" + i + ')');
		}
	}

	final void method1226(byte i) {
		try {
			anInt5418++;
			if (i <= 113)
				anInt5423 = -53;
			((Class187) this).aClass260_Sub2_2643.method1944(this, -116);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.I(" + i + ')');
		}
	}

	public final long method32(int i) {
		try {
			if (i != 12786)
				aClass201_5426 = null;
			anInt5417++;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.D(" + i + ')');
		}
	}

	static final int method2287(int i, int i_20_, int i_21_, int i_22_) {
		try {
			anInt5420++;
			i &= 0x3;
			if (i == 0)
				return i_22_;
			if ((i ^ 0xffffffff) == -2)
				return i_20_;
			if ((i ^ 0xffffffff) == -3)
				return -i_22_ + 1023;
			if (i_21_ != -32457)
				anIntArray5425 = null;
			return 1023 - i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.G(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	Class187_Sub2(Class260_Sub2 class260_sub2, int i, byte[] is, int i_23_, boolean bool) {
		super(class260_sub2, 34962, is, i_23_, bool);
		try {
			anInt5423 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_23_ + ',' + bool + ')'));
		}
	}

	static final void method2288(int i, int i_24_, int i_25_, int i_26_) {
		try {
			anInt5419++;
			if (i_26_ != -32509)
				anInt5427 = -18;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i, (byte) 119, 11);
			class246_sub1_sub10.method2600(-25852);
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_25_;
			((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.E(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	public final int method21(boolean bool) {
		try {
			anInt5416++;
			if (bool != true)
				method32(117);
			return anInt5423;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.C(" + bool + ')');
		}
	}

	public final int method1(int i) {
		try {
			int i_27_ = 79 / ((17 - i) / 39);
			anInt5424++;
			return ((Class187) this).anInt2646;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "ue.A(" + i + ')');
		}
	}

	Class187_Sub2(Class260_Sub2 class260_sub2, int i, Buffer nativebuffer, int i_28_, boolean bool) {
		super(class260_sub2, 34962, nativebuffer, i_28_, bool);
		try {
			anInt5423 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("ue.<init>(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + (nativebuffer != null ? "{...}" : "null") + ',' + i_28_ + ',' + bool + ')'));
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_29_ = i;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -9; i_30_++) {
				if ((0x1 & i_29_) != 1)
					i_29_ >>>= 1;
				else
					i_29_ = i_29_ >>> 1 ^ ~0x12477cdf;
			}
			anIntArray5425[i] = i_29_;
		}
		aClass201_5426 = new OutgoingPacket(23, 3);
		anInt5427 = 2;
	}
}
