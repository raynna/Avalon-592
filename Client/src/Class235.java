/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class235 {
	int[] anIntArray3195;
	static int anInt3196;
	int anInt3197;
	Object[] anObjectArray3198;
	int anInt3199;
	int anInt3200;
	boolean aBool3201;
	int[] anIntArray3202;
	static int anInt3203;
	int anInt3204;
	int anInt3205;
	Object[] anObjectArray3206;
	boolean aBool3207;
	int[] anIntArray3208;
	int anInt3209;
	int anInt3210;
	Object[] anObjectArray3211;
	Object[] anObjectArray3212;
	int anInt3213;
	byte[] aByteArray3214;
	int anInt3215;
	Object[] anObjectArray3216;
	int anInt3217;
	Object[] anObjectArray3218;
	boolean aBool3219;
	int[] anIntArray3220;
	int anInt3221 = 1;
	boolean aBool3222;
	byte aByte3223;
	static int anInt3224;
	static int anInt3225;
	int anInt3226;
	Object[] anObjectArray3227;
	static int anInt3228;
	String aString3229;
	Object[] anObjectArray3230;
	Object[] anObjectArray3231;
	int anInt3232;
	int anInt3233;
	int anInt3234;
	int anInt3235;
	Object[] anObjectArray3236;
	int anInt3237;
	int anInt3238;
	int anInt3239;
	int anInt3240;
	Object[] anObjectArray3241;
	Object[] anObjectArray3242;
	Object[] anObjectArray3243;
	int anInt3244;
	static int anInt3245;
	Object[] anObjectArray3246;
	Object[] f_ab;
	int f_bb;
	byte f_cb;
	boolean f_db;
	Object[] f_eb;
	int f_fb;
	String f_gb;
	static int f_hb;
	Object[] f_ib;
	String f_jb;
	static int f_kb;
	int f_lb;
	int f_mb;
	Object[] f_nb;
	byte f_ob;
	int f_pb;
	static Class166 f_qb;
	int f_rb;
	int f_sb;
	int f_tb;
	static int f_ub;
	int f_vb;
	Object[] f_wb;
	String aString3247;
	int anInt3248;
	int anInt3249;
	Object[] anObjectArray3250;
	static int anInt3251;
	boolean aBool3252;
	int anInt3253;
	static int anInt3254;
	int anInt3255;
	int anInt3256;
	Class235 aClass235_3257;
	int anInt3258;
	int anInt3259;
	int anInt3260;
	Class246_Sub27 aClass246_Sub27_3261;
	int anInt3262;
	int anInt3263;
	int anInt3264;
	int anInt3265;
	static int anInt3266 = 0;
	int anInt3267;
	String[] aStringArray3268;
	Object[] anObjectArray3269;
	int anInt3270;
	int anInt3271;
	int anInt3272;
	Object[] anObjectArray3273;
	int anInt3274;
	int anInt3275;
	Object[] f_ac;
	static int f_bc;
	boolean f_cc;
	int f_dc;
	int f_ec;
	int f_fc;
	int anInt3276;
	int[] f_hc;
	boolean f_ic;
	int[] f_jc;
	Object[] f_kc;
	static int f_lc;
	int f_mc;
	static int f_nc;
	int f_oc;
	int[] f_pc;
	int f_qc;
	boolean f_rc;
	Object[] f_sc;
	static Class246_Sub35 f_tc;
	boolean f_uc;
	int f_vc;
	Object[] f_wc;
	boolean aBool3277;
	Object[] anObjectArray3278;
	static int anInt3279;
	int anInt3280;
	int anInt3281;
	Object[] anObjectArray3282;
	int anInt3283;
	int anInt3284;
	boolean aBool3285;
	boolean aBool3286;
	int anInt3287;
	int anInt3288;
	int anInt3289;
	boolean aBool3290;
	byte[] aByteArray3291;
	int anInt3292;
	int anInt3293;
	boolean aBool3294;
	int anInt3295;
	byte aByte3296;
	int anInt3297;
	Object[] anObjectArray3298;
	Object[] anObjectArray3299;
	int anInt3300;
	String aString3301;
	int[] anIntArray3302;
	static int anInt3303;
	private static OutgoingPacket ACTION_BUTTON8;
	static int anInt3305;
	Class235[] f_ad;
	boolean f_bd;
	int f_cd;
	int f_dd;
	int[] f_ed;
	Object[] f_fd;
	int f_gd;
	int f_hd;
	int f_id;
	private Class85 f_jd;
	static int f_kd;
	int[] f_ld;
	int f_md;
	static int f_nd;
	static int f_od;
	int f_pd;

	final void method1499(String string, int i, int i_0_) {
		try {
			if (i_0_ != 16)
				method1504(-69, null);
			anInt3203++;
			if (f_jd == null) {
				f_jd = new Class85(16);
				f_jd.method547((long) i, -2301, new Class246_Sub4(string));
			} else {
				Class246_Sub4 class246_sub4 = (Class246_Sub4) f_jd.method544((long) i, i_0_ + 109);
				if (class246_sub4 != null)
					((Class246_Sub4) class246_sub4).aString3862 = string;
				else
					f_jd.method547((long) i, -2301, new Class246_Sub4(string));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.K(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
		}
	}

	final void method1500(int i, int i_1_, int i_2_) {
		try {
			anInt3228++;
			if (i == 65535) {
				if (((Class235) this).f_pc == null || ((((Class235) this).f_pc.length ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))) {
					int[] is = new int[i_2_ + 1];
					if (((Class235) this).f_pc != null) {
						for (int i_3_ = 0; ((Class235) this).f_pc.length > i_3_; i_3_++)
							is[i_3_] = ((Class235) this).f_pc[i_3_];
						for (int i_4_ = ((Class235) this).f_pc.length; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++)
							is[i_4_] = -1;
					}
					((Class235) this).f_pc = is;
				}
				((Class235) this).f_pc[i_2_] = i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.M(" + i + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int method1501(int i, int i_5_, int i_6_) {
		try {
			f_ub++;
			if (f_jd == null)
				return i_5_;
			IntegerNode class246_sub33 = (IntegerNode) f_jd.method544((long) i_6_, 124);
			if (class246_sub33 == null)
				return i_5_;
			if (i != -1)
				return -96;
			return ((IntegerNode) class246_sub33).value;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.Q(" + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final Class_l method1502(Class260 class260, byte i) {
		try {
			int i_7_ = 10 % ((-81 - i) / 32);
			anInt3224++;
			Class_u_Sub1.aBool5687 = false;
			long l = (((long) ((Class235) this).anInt3209 << 40) + ((((Class235) this).aBool3294 ? 1L : 0L) << 39) + ((long) ((Class235) this).f_lb - -((!((Class235) this).aBool3252 ? 0L : 1L) << 35)) - (-((long) ((Class235) this).f_dc << 36) + -((!((Class235) this).aBool3201 ? 0L : 1L) << 38)));
			Class_l class_l = (Class_l) Class_q_Sub1.aClass54_6663.method379(l, (byte) 58);
			if (class_l != null)
				return class_l;
			Class10 class10 = Class10.method120(Class214.aClass_fs2990, ((Class235) this).f_lb, 0);
			if (class10 == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			if (((Class235) this).aBool3201)
				class10.method123();
			if (((Class235) this).aBool3294)
				class10.method118();
			do {
				if ((((Class235) this).f_dc ^ 0xffffffff) >= -1) {
					if (((Class235) this).anInt3209 == 0)
						break;
					class10.method128(1);
					if (!client.f_ob)
						break;
				}
				class10.method128(((Class235) this).f_dc);
			} while (false);
			if ((((Class235) this).f_dc ^ 0xffffffff) <= -2)
				class10.method119(1);
			if ((((Class235) this).f_dc ^ 0xffffffff) <= -3)
				class10.method119(16777215);
			if (((Class235) this).anInt3209 != 0)
				class10.method116(~0xffffff | ((Class235) this).anInt3209);
			class_l = class260.method1749(class10, true);
			Class_q_Sub1.aClass54_6663.method371(1, l, class_l);
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.I(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1503(int i) {
		do {
			try {
				anInt3254++;
				for (int i_8_ = 0; i_8_ < Class59.anInt819; i_8_++) {
					Class258 class258 = Class47.aClass258Array684[i_8_];
					if ((((Class258) class258).aByte3702 ^ 0xffffffff) == -3) {
						if (((Class258) class258).aClass246_Sub37_Sub3_3692 == null)
							((Class258) class258).anInt3695 = -2147483648;
						else
							Canvas_Sub1.aClass246_Sub37_Sub2_6889.method2627(((Class258) class258).aClass246_Sub37_Sub3_3692);
					}
				}
				if (i == 8)
					break;
				method1515(103);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uu.E(" + i + ')');
			}
			break;
		} while (false);
	}

	private final Object[] method1504(int i, BufferStream stream) {
		try {
			anInt3305++;
			int i_9_ = stream.readUnsignedByte(255);
			if ((i_9_ ^ 0xffffffff) == -1)
				return null;
			Object[] objects = new Object[i_9_];
			if (i != -2)
				return null;
			for (int i_10_ = 0; (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				int i_11_ = stream.readUnsignedByte(255);
				if ((i_11_ ^ 0xffffffff) != -1) {
					if ((i_11_ ^ 0xffffffff) == -2)
						objects[i_10_] = stream.readString((byte) -40);
				} else
					objects[i_10_] = new Integer(stream.readInt((byte) 98));
			}
			((Class235) this).aBool3222 = true;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.D(" + i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1505(byte i, int i_12_) {
		do {
			try {
				if (f_jd != null) {
					Node class246 = f_jd.method544((long) i_12_, 123);
					if (class246 != null)
						class246.unlink((byte) -106);
				}
				f_bc++;
				if (i >= 58)
					break;
				method1512(null, -128);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "uu.S(" + i + ',' + i_12_ + ')');
			}
			break;
		} while (false);
	}

	final void method1506(BufferStream stream, int i) {
		try {
			anInt3279++;
			int i_13_ = stream.readUnsignedByte(255);
			if ((i_13_ ^ 0xffffffff) == -256)
				i_13_ = -1;
			((Class235) this).f_vc = stream.readUnsignedByte(255);
			if ((((Class235) this).f_vc & 0x80 ^ 0xffffffff) != -1) {
				((Class235) this).f_vc &= 0x7f;
				((Class235) this).f_gb = stream.readString((byte) -40);
			}
			((Class235) this).anInt3280 = stream.readUnsignedShort((byte) -59);
			((Class235) this).f_rb = stream.method2375((byte) 1);
			((Class235) this).f_vb = stream.method2375((byte) 1);
			((Class235) this).anInt3258 = stream.readUnsignedShort((byte) -68);
			((Class235) this).f_mb = stream.readUnsignedShort((byte) 122);
			((Class235) this).f_ob = stream.readByte(false);
			((Class235) this).aByte3223 = stream.readByte(false);
			((Class235) this).f_cb = stream.readByte(false);
			((Class235) this).aByte3296 = stream.readByte(false);
			((Class235) this).anInt3293 = stream.readUnsignedShort((byte) -57);
			if (((Class235) this).anInt3293 != 65535)
				((Class235) this).anInt3293 = ((~0xffff & ((Class235) this).anInt3248) - -((Class235) this).anInt3293);
			else
				((Class235) this).anInt3293 = -1;
			int i_14_ = stream.readUnsignedByte(255);
			if (i_13_ >= 0)
				((Class235) this).aBool3290 = (0x2 & i_14_) != 0;
			((Class235) this).f_ic = (i_14_ & 0x1 ^ 0xffffffff) != -1;
			if (((Class235) this).f_vc == 0) {
				((Class235) this).anInt3264 = stream.readUnsignedShort((byte) -86);
				((Class235) this).anInt3276 = stream.readUnsignedShort((byte) 124);
				if (i_13_ < 0)
					((Class235) this).aBool3290 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
			}
			if (((Class235) this).f_vc == 5) {
				((Class235) this).f_lb = stream.readInt((byte) 103);
				((Class235) this).anInt3260 = stream.readUnsignedShort((byte) 83);
				int i_15_ = stream.readUnsignedByte(255);
				((Class235) this).aBool3286 = (0x1 & i_15_ ^ 0xffffffff) != -1;
				((Class235) this).aBool3252 = (0x2 & i_15_ ^ 0xffffffff) != -1;
				((Class235) this).anInt3295 = stream.readUnsignedByte(255);
				((Class235) this).f_dc = stream.readUnsignedByte(255);
				((Class235) this).anInt3209 = stream.readInt((byte) 101);
				((Class235) this).aBool3201 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
				((Class235) this).aBool3294 = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
				((Class235) this).anInt3197 = stream.readInt((byte) 91);
			}
			int i_16_ = 72 / ((i + 71) / 50);
			if ((((Class235) this).f_vc ^ 0xffffffff) == -7) {
				((Class235) this).anInt3244 = 1;
				((Class235) this).anInt3215 = stream.readUnsignedShort((byte) -85);
				if (((Class235) this).anInt3215 == 65535)
					((Class235) this).anInt3215 = -1;
				((Class235) this).anInt3287 = stream.method2375((byte) 1);
				((Class235) this).anInt3238 = stream.method2375((byte) 1);
				((Class235) this).anInt3283 = stream.readUnsignedShort((byte) 97);
				((Class235) this).f_gd = stream.readUnsignedShort((byte) 113);
				((Class235) this).anInt3281 = stream.readUnsignedShort((byte) -31);
				((Class235) this).f_dd = stream.readUnsignedShort((byte) 122);
				((Class235) this).anInt3232 = stream.readUnsignedShort((byte) -68);
				if (((Class235) this).anInt3232 == 65535)
					((Class235) this).anInt3232 = -1;
				((Class235) this).aBool3285 = stream.readUnsignedByte(255) == 1;
				((Class235) this).f_md = stream.method2375((byte) 1);
				((Class235) this).anInt3217 = stream.method2375((byte) 1);
				((Class235) this).aBool3277 = stream.readUnsignedByte(255) == 1;
				if ((((Class235) this).f_ob ^ 0xffffffff) != -1)
					((Class235) this).anInt3265 = stream.readUnsignedShort((byte) -39);
				if (((Class235) this).aByte3223 != 0)
					((Class235) this).anInt3237 = stream.readUnsignedShort((byte) -106);
			}
			if ((((Class235) this).f_vc ^ 0xffffffff) == -5) {
				((Class235) this).anInt3235 = stream.readUnsignedShort((byte) -56);
				if (((Class235) this).anInt3235 == 65535)
					((Class235) this).anInt3235 = -1;
				((Class235) this).aString3247 = stream.readString((byte) -40);
				((Class235) this).anInt3300 = stream.readUnsignedByte(255);
				((Class235) this).f_oc = stream.readUnsignedByte(255);
				((Class235) this).f_pb = stream.readUnsignedByte(255);
				((Class235) this).f_cc = stream.readUnsignedByte(255) == 1;
				((Class235) this).anInt3197 = stream.readInt((byte) 118);
				((Class235) this).anInt3295 = stream.readUnsignedByte(255);
				if (i_13_ >= 0)
					((Class235) this).anInt3259 = stream.readUnsignedByte(255);
			}
			if (((Class235) this).f_vc == 3) {
				((Class235) this).anInt3197 = stream.readInt((byte) 105);
				((Class235) this).f_uc = (stream.readUnsignedByte(255) ^ 0xffffffff) == -2;
				((Class235) this).anInt3295 = stream.readUnsignedByte(255);
			}
			if ((((Class235) this).f_vc ^ 0xffffffff) == -10) {
				((Class235) this).anInt3239 = stream.readUnsignedByte(255);
				((Class235) this).anInt3197 = stream.readInt((byte) 78);
				((Class235) this).aBool3207 = stream.readUnsignedByte(255) == 1;
			}
			int i_17_ = stream.read24BitInteger((byte) 29);
			int i_18_ = stream.readUnsignedByte(255);
			if (i_18_ != 0) {
				((Class235) this).f_ed = new int[11];
				((Class235) this).aByteArray3214 = new byte[11];
				((Class235) this).aByteArray3291 = new byte[11];
				for (/**/; i_18_ != 0; i_18_ = stream.readUnsignedByte(255)) {
					int i_19_ = -1 + (i_18_ >> 4);
					i_18_ = i_18_ << 8 | stream.readUnsignedByte(255);
					i_18_ &= 0xfff;
					if ((i_18_ ^ 0xffffffff) == -4096)
						i_18_ = -1;
					byte i_20_ = stream.readByte(false);
					if (i_20_ != 0)
						((Class235) this).f_bd = true;
					byte i_21_ = stream.readByte(false);
					((Class235) this).f_ed[i_19_] = i_18_;
					((Class235) this).aByteArray3214[i_19_] = i_20_;
					((Class235) this).aByteArray3291[i_19_] = i_21_;
				}
			}
			((Class235) this).f_jb = stream.readString((byte) -40);
			int i_22_ = stream.readUnsignedByte(255);
			int i_23_ = 0xf & i_22_;
			if ((i_23_ ^ 0xffffffff) < -1) {
				((Class235) this).aStringArray3268 = new String[i_23_];
				for (int i_24_ = 0; (i_23_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
					((Class235) this).aStringArray3268[i_24_] = stream.readString((byte) -40);
			}
			int i_25_ = i_22_ >> 4;
			if (i_25_ > 0) {
				int i_26_ = stream.readUnsignedByte(255);
				((Class235) this).f_pc = new int[i_26_ + 1];
				for (int i_27_ = 0; ((Class235) this).f_pc.length > i_27_; i_27_++)
					((Class235) this).f_pc[i_27_] = -1;
				((Class235) this).f_pc[i_26_] = stream.readUnsignedShort((byte) 89);
			}
			if ((i_25_ ^ 0xffffffff) < -2) {
				int i_28_ = stream.readUnsignedByte(255);
				((Class235) this).f_pc[i_28_] = stream.readUnsignedShort((byte) -61);
			}
			((Class235) this).aString3229 = stream.readString((byte) -40);
			if (((Class235) this).aString3229.equals(""))
				((Class235) this).aString3229 = null;
			((Class235) this).anInt3240 = stream.readUnsignedByte(255);
			((Class235) this).anInt3226 = stream.readUnsignedByte(255);
			((Class235) this).anInt3205 = stream.readUnsignedByte(255);
			((Class235) this).aString3301 = stream.readString((byte) -40);
			int i_29_ = -1;
			if ((Class259_Sub3_Sub1.method2841(9921, i_17_) ^ 0xffffffff) != -1) {
				i_29_ = stream.readUnsignedShort((byte) 116);
				((Class235) this).anInt3234 = stream.readUnsignedShort((byte) -68);
				if ((i_29_ ^ 0xffffffff) == -65536)
					i_29_ = -1;
				if ((((Class235) this).anInt3234 ^ 0xffffffff) == -65536)
					((Class235) this).anInt3234 = -1;
				((Class235) this).anInt3199 = stream.readUnsignedShort((byte) 106);
				if (((Class235) this).anInt3199 == 65535)
					((Class235) this).anInt3199 = -1;
			}
			if ((i_13_ ^ 0xffffffff) <= -1) {
				((Class235) this).anInt3233 = stream.readUnsignedShort((byte) 95);
				if ((((Class235) this).anInt3233 ^ 0xffffffff) == -65536)
					((Class235) this).anInt3233 = -1;
			}
			((Class235) this).aClass246_Sub27_3261 = new Class246_Sub27(i_17_, i_29_);
			if ((i_13_ ^ 0xffffffff) <= -1) {
				int i_30_ = stream.readUnsignedByte(255);
				for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
					int i_32_ = stream.read24BitInteger((byte) 29);
					int i_33_ = stream.readInt((byte) 126);
					f_jd.method547((long) i_32_, -2301, new IntegerNode(i_33_));
				}
				int i_34_ = stream.readUnsignedByte(255);
				for (int i_35_ = 0; (i_34_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
					int i_36_ = stream.read24BitInteger((byte) 29);
					String string = stream.method2360(-126);
					f_jd.method547((long) i_36_, -2301, new Class246_Sub4(string));
				}
			}
			((Class235) this).f_ac = method1504(-2, stream);
			((Class235) this).anObjectArray3278 = method1504(-2, stream);
			((Class235) this).anObjectArray3212 = method1504(-2, stream);
			((Class235) this).anObjectArray3250 = method1504(-2, stream);
			((Class235) this).f_eb = method1504(-2, stream);
			((Class235) this).anObjectArray3243 = method1504(-2, stream);
			((Class235) this).anObjectArray3246 = method1504(-2, stream);
			((Class235) this).f_fd = method1504(-2, stream);
			((Class235) this).anObjectArray3211 = method1504(-2, stream);
			((Class235) this).anObjectArray3236 = method1504(-2, stream);
			if (i_13_ >= 0)
				((Class235) this).anObjectArray3242 = method1504(-2, stream);
			((Class235) this).anObjectArray3273 = method1504(-2, stream);
			((Class235) this).anObjectArray3227 = method1504(-2, stream);
			((Class235) this).f_nb = method1504(-2, stream);
			((Class235) this).anObjectArray3282 = method1504(-2, stream);
			((Class235) this).f_ib = method1504(-2, stream);
			((Class235) this).anObjectArray3269 = method1504(-2, stream);
			((Class235) this).anObjectArray3241 = method1504(-2, stream);
			((Class235) this).f_wb = method1504(-2, stream);
			((Class235) this).f_sc = method1504(-2, stream);
			((Class235) this).anObjectArray3298 = method1504(-2, stream);
			((Class235) this).anIntArray3195 = method1508(stream, 120);
			((Class235) this).f_jc = method1508(stream, 125);
			((Class235) this).anIntArray3302 = method1508(stream, 126);
			((Class235) this).anIntArray3220 = method1508(stream, 127);
			((Class235) this).anIntArray3208 = method1508(stream, 123);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.L(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1507(String string, int i, byte i_37_) {
		try {
			f_hb++;
			if (((Class235) this).aStringArray3268 == null || ((i ^ 0xffffffff) <= (((Class235) this).aStringArray3268.length ^ 0xffffffff))) {
				String[] strings = new String[i + 1];
				if (((Class235) this).aStringArray3268 != null) {
					for (int i_38_ = 0; ((i_38_ ^ 0xffffffff) > (((Class235) this).aStringArray3268.length ^ 0xffffffff)); i_38_++)
						strings[i_38_] = ((Class235) this).aStringArray3268[i_38_];
				}
				((Class235) this).aStringArray3268 = strings;
			}
			if (i_37_ != -54)
				method1512(null, 47);
			((Class235) this).aStringArray3268[i] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.B(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_37_ + ')'));
		}
	}

	private final int[] method1508(BufferStream stream, int i) {
		try {
			f_nc++;
			if (i < 119)
				((Class235) this).aByteArray3291 = null;
			int i_39_ = stream.readUnsignedByte(255);
			if ((i_39_ ^ 0xffffffff) == -1)
				return null;
			int[] is = new int[i_39_];
			for (int i_40_ = 0; i_39_ > i_40_; i_40_++)
				is[i_40_] = stream.readInt((byte) 113);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.N(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class_t method1509(Class191 class191, Class260 class260, Class228 class228, Class27 class27, Class45 class45, int i, byte i_41_, Class124 class124, int i_42_, Class92 class92, int i_43_, Interface11 interface11, int i_44_, Class_v class_v) {
		try {
			Class_u_Sub1.aBool5687 = false;
			f_od++;
			if ((((Class235) this).anInt3244 ^ 0xffffffff) == -1)
				return null;
			if ((((Class235) this).anInt3244 ^ 0xffffffff) == -2 && ((Class235) this).anInt3215 == -1)
				return null;
			if ((((Class235) this).anInt3244 ^ 0xffffffff) == -2) {
				int i_45_ = i;
				if (class124 != null)
					i |= class124.method847(i_42_, i_41_ ^ 0x166, i_43_, true);
				Class_t class_t = ((Class_t) (Class_ls.aClass54_963.method379((long) ((((Class235) this).anInt3244 << 16) + (((Class260) class260).anInt3719 << 29) + ((Class235) this).anInt3215), (byte) 58)));
				if (class_t == null || (class260.method1710(class_t.P(), i) ^ 0xffffffff) != -1) {
					if (class_t != null)
						i = class260.method1723(i, class_t.P());
					Class103 class103 = Class206.method1349(0, Class233.aClass_fs3181, (byte) 89, ((Class235) this).anInt3215);
					if (class103 == null) {
						Class_u_Sub1.aBool5687 = true;
						return null;
					}
					if ((((Class103) class103).anInt1358 ^ 0xffffffff) > -14)
						class103.method646(0, (byte) -47);
					class_t = class260.method1695(class103, i, Class_q_Sub1.anInt6666, 64, 768);
					Class_ls.aClass54_963.method371(i_41_ ^ 0x67, (long) ((((Class235) this).anInt3244 << 16) - -((Class235) this).anInt3215), class_t);
				}
				if (class124 != null)
					class_t = class124.method846(i_44_, i, i_43_, i_42_, class_t, i_41_ - 223);
				class_t.UA(i_45_);
				return class_t;
			}
			if (((Class235) this).anInt3244 == 2) {
				Class_t class_t = (class228.method1462(((Class235) this).anInt3215, 1).method1634(i_43_, i_44_, 52, i, class124, i_42_, interface11, class260, class45));
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if ((((Class235) this).anInt3244 ^ 0xffffffff) == -4) {
				if (class27 == null)
					return null;
				Class_t class_t = class27.method212(i_42_, i_43_, false, class228, class191, interface11, i_44_, class124, class92, class260, class45, i);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if ((((Class235) this).anInt3244 ^ 0xffffffff) == -5) {
				Class197 class197 = class191.method1251(22883, ((Class235) this).anInt3215);
				Class_t class_t = class197.method1281(i_44_, 10, class124, i, i_43_, class27, i_42_, i_41_ - 223, class260);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (i_41_ != 102)
				return null;
			if (((Class235) this).anInt3244 == 6) {
				Class_t class_t = (class228.method1462(((Class235) this).anInt3215, 1).method1625(0, 100, class124, interface11, i_43_, i, i_44_, 0, class260, i_42_, 0, null, null, class45, class_v));
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			if (((Class235) this).anInt3244 == 7) {
				if (class27 == null)
					return null;
				int i_46_ = ((Class235) this).anInt3215 >>> 16;
				int i_47_ = 0xffff & ((Class235) this).anInt3215;
				int i_48_ = ((Class235) this).anInt3289;
				Class_t class_t = class27.method219(class124, i_41_ - 170, class45, i_46_, i_48_, class92, i, i_47_, i_43_, class260, i_44_, i_42_);
				if (class_t == null) {
					Class_u_Sub1.aBool5687 = true;
					return null;
				}
				return class_t;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.H(" + (class191 != null ? "{...}" : "null") + ',' + (class260 != null ? "{...}" : "null") + ',' + (class228 != null ? "{...}" : "null") + ',' + (class27 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + i + ',' + i_41_ + ',' + (class124 != null ? "{...}" : "null") + ',' + i_42_ + ',' + (class92 != null ? "{...}" : "null") + ',' + i_43_ + ',' + (interface11 != null ? "{...}" : "null") + ',' + i_44_ + ',' + (class_v != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1510(byte i, Stream_Sub1 stream_sub1) {
		try {
			f_lc++;
			int i_49_ = stream_sub1.readBits(-112, 2);
			if (i != -37)
				return -76;
			int i_50_;
			if (i_49_ != 0) {
				if ((i_49_ ^ 0xffffffff) == -2)
					i_50_ = stream_sub1.readBits(-83, 5);
				else if ((i_49_ ^ 0xffffffff) != -3)
					i_50_ = stream_sub1.readBits(-81, 11);
				else
					i_50_ = stream_sub1.readBits(-55, 8);
			} else
				i_50_ = 0;
			return i_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.J(" + i + ',' + (stream_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1511(boolean bool, int i, String string, int i_51_, int i_52_) {
		do {
			try {
				anInt3245++;
				Class235 class235 = Class211.method1390(i_51_, i_52_, (byte) -73);
				if (class235 != null) {
					if (((Class235) class235).anObjectArray3236 != null) {
						Class246_Sub29 class246_sub29 = new Class246_Sub29();
						((Class246_Sub29) class246_sub29).aClass235_4974 = class235;
						((Class246_Sub29) class246_sub29).anObjectArray4977 = ((Class235) class235).anObjectArray3236;
						((Class246_Sub29) class246_sub29).aString4965 = string;
						((Class246_Sub29) class246_sub29).anInt4972 = i;
						Class146.method988(class246_sub29);
					}
					boolean bool_53_ = bool;
					if (((Class235) class235).anInt3280 != 0)
						bool_53_ = Class246_Sub28_Sub28.method2812(3, class235);
					if (bool_53_ && client.method2971(class235).method2120(i - 1, 1)) {
						if ((i ^ 0xffffffff) == -2) {
							Class243.writePacket(-72, Class172.ACTION_BUTTON1);
							Class46.anInt667++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if ((i ^ 0xffffffff) == -3) {
							Class243.writePacket(-67, Class217.ACTION_BUTTON2);
							f_nd++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 3) {
							Class243.writePacket(-69, Class259_Sub1.ACTION_BUTTON3);
							Class223.anInt3070++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 4) {
							Class246_Sub28_Sub7.anInt6053++;
							Class243.writePacket(-49, Class_w.ACTION_BUTTON4);
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 5) {
							Class243.writePacket(-125, Class188_Sub1.ACTION_BUTTON5);
							Class137.anInt1948++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 6) {
							Class243.writePacket(-101, Class109_Sub1.ACTION_BUTTON9);
							Class59_Sub4_Sub3.anInt6953++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 7) {
							Class243.writePacket(-121, Class155.ACTION_BUTTON6);
							Class101.anInt1308++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i == 8) {
							Class243.writePacket(-73, Class121.ACTION_BUTTON7);
							Class254.anInt3632++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if ((i ^ 0xffffffff) == -10) {
							Class243.writePacket(-70, Class224.ACTION_BUTTON10);
							Class_e.anInt1210++;
							Class250.method1597(23040, i_51_, i_52_, (((Class235) class235).anInt3210));
						}
						if (i != 10)
							break;
						Class243.writePacket(-64, ACTION_BUTTON8);
						Class63_Sub1.anInt4716++;
						Class250.method1597(23040, i_51_, i_52_, ((Class235) class235).anInt3210);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uu.R(" + bool + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + i_51_ + ',' + i_52_ + ')'));
			}
			break;
		} while (false);
	}

	final Class116 method1512(Class260 class260, int i) {
		try {
			anInt3251++;
			Class_u_Sub1.aBool5687 = false;
			if (i == ((Class235) this).anInt3235)
				return null;
			Class116 class116 = ((Class116) Class216.aClass54_3007.method379((long) (((Class235) this).anInt3235), (byte) 58));
			if (class116 != null)
				return class116;
			Class10[] class10s = Class10.method125(Class214.aClass_fs2990, ((Class235) this).anInt3235);
			if (class10s == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			Class73 class73 = Class246_Sub1_Sub17.method2763(((Class235) this).anInt3235, Class29.aClass_fs383, -18318);
			if (class73 == null) {
				Class_u_Sub1.aBool5687 = true;
				return null;
			}
			class116 = class260.method1716(class73, class10s, true);
			Class216.aClass54_3007.method371(1, (long) ((Class235) this).anInt3235, class116);
			return class116;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.C(" + (class260 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class230 method1513(int i, Class214 class214, Class203 class203) {
		try {
			int i_54_ = 127 / ((-54 - i) / 56);
			anInt3196++;
			if ((((Class235) this).anInt3213 ^ 0xffffffff) == 0)
				return null;
			long l = ((0xffffL & (long) ((Class235) this).f_fb) << 16 | (65535L << 48 & (long) ((Class235) this).anInt3204 << 48 | (0xffffL & (long) ((Class235) this).anInt3249) << 32) | (long) ((Class235) this).anInt3213 & 0xffffL);
			Class230 class230 = (Class230) Class84.aClass54_1097.method379(l, (byte) 58);
			if (class230 == null) {
				class230 = class203.method1335(((Class235) this).anInt3204, ((Class235) this).anInt3213, 123, ((Class235) this).anInt3249, ((Class235) this).f_fb, class214);
				Class84.aClass54_1097.method371(1, l, class230);
			}
			return class230;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.F(" + i + ',' + (class214 != null ? "{...}" : "null") + ',' + (class203 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class128 method1514(int i, Class260 class260) {
		try {
			f_kb++;
			Class128 class128 = ((Class128) Class29.aClass54_387.method379((long) (((Class235) this).anInt3248), (byte) 58));
			if (class128 != null)
				return class128;
			Class10 class10 = Class10.method120(Class214.aClass_fs2990, ((Class235) this).f_lb, 0);
			if (class10 == null)
				return null;
			int i_55_ = (((Class10) class10).anInt159 + ((Class10) class10).anInt156 + ((Class10) class10).anInt158);
			int i_56_ = (((Class10) class10).anInt155 + ((Class10) class10).anInt162 - -((Class10) class10).anInt163);
			((Class235) this).f_ld = new int[i_56_];
			((Class235) this).f_hc = new int[i_56_];
			for (int i_57_ = i; ((Class10) class10).anInt155 > i_57_; i_57_++) {
				int i_58_ = 0;
				int i_59_ = i_55_;
				for (int i_60_ = 0; ((Class10) class10).anInt156 > i_60_; i_60_++) {
					if ((((Class10) class10).aByteArray157[i_60_ - -(((Class10) class10).anInt156 * i_57_)]) != 0) {
						i_58_ = i_60_;
						break;
					}
				}
				for (int i_61_ = i_58_; ((i_61_ ^ 0xffffffff) > (((Class10) class10).anInt156 ^ 0xffffffff)); i_61_++) {
					if ((((Class10) class10).aByteArray157[((Class10) class10).anInt156 * i_57_ + i_61_]) == 0) {
						i_59_ = i_61_;
						break;
					}
				}
				((Class235) this).f_ld[i_57_ + ((Class10) class10).anInt162] = i_58_ - -((Class10) class10).anInt158;
				((Class235) this).f_hc[((Class10) class10).anInt162 + i_57_] = i_59_ + -i_58_;
			}
			class128 = class260.method1726(i_55_, i_56_, ((Class235) this).f_ld, ((Class235) this).f_hc);
			Class29.aClass54_387.method371(1, (long) ((Class235) this).anInt3248, class128);
			return class128;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.A(" + i + ',' + (class260 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1515(int i) {
		try {
			f_tc = null;
			if (i != -7975)
				ACTION_BUTTON8 = null;
			ACTION_BUTTON8 = null;
			f_qb = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "uu.P(" + i + ')');
		}
	}

	final String method1516(String string, int i, int i_62_) {
		try {
			anInt3225++;
			if (f_jd == null)
				return string;
			if (i_62_ != -26191)
				((Class235) this).f_rb = 16;
			Class246_Sub4 class246_sub4 = (Class246_Sub4) f_jd.method544((long) i, 124);
			if (class246_sub4 == null)
				return string;
			return ((Class246_Sub4) class246_sub4).aString3862;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("uu.G(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_62_ + ')'));
		}
	}

	final void method1517(int i, int i_63_, int i_64_) {
		do {
			try {
				anInt3303++;
				if (f_jd == null) {
					f_jd = new Class85(16);
					f_jd.method547((long) i, -2301, new IntegerNode(i_63_));
				} else {
					IntegerNode class246_sub33 = (IntegerNode) f_jd.method544((long) i, 126);
					do {
						if (class246_sub33 != null) {
							((IntegerNode) class246_sub33).value = i_63_;
							if (!client.f_ob)
								break;
						}
						f_jd.method547((long) i, -2301, new IntegerNode(i_63_));
					} while (false);
					if (i_64_ < -115)
						break;
					method1500(-111, -128, -24);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("uu.O(" + i + ',' + i_63_ + ',' + i_64_ + ')'));
			}
			break;
		} while (false);
	}

	public Class235() {
		((Class235) this).anInt3210 = -1;
		((Class235) this).anInt3199 = -1;
		((Class235) this).anInt3239 = 1;
		((Class235) this).anInt3235 = -1;
		((Class235) this).anInt3200 = 1;
		((Class235) this).anInt3217 = 3000;
		((Class235) this).anInt3213 = -1;
		((Class235) this).f_lb = -1;
		((Class235) this).f_mb = 0;
		((Class235) this).anInt3232 = -1;
		((Class235) this).anInt3205 = Class246_Sub27.anInt4894;
		((Class235) this).f_bb = -1;
		((Class235) this).aClass246_Sub27_3261 = Class43.aClass246_Sub27_635;
		((Class235) this).anInt3209 = 0;
		((Class235) this).f_vb = 0;
		((Class235) this).aBool3252 = false;
		((Class235) this).aBool3207 = false;
		((Class235) this).anInt3265 = 0;
		((Class235) this).anInt3275 = 0;
		((Class235) this).f_db = false;
		((Class235) this).anInt3197 = 0;
		((Class235) this).anInt3256 = 0;
		((Class235) this).anInt3237 = 0;
		((Class235) this).f_rb = 0;
		((Class235) this).anInt3267 = -1;
		((Class235) this).f_cc = false;
		((Class235) this).anInt3258 = 0;
		((Class235) this).aBool3222 = false;
		((Class235) this).f_ec = 0;
		((Class235) this).anInt3234 = -1;
		((Class235) this).anInt3233 = -1;
		((Class235) this).anInt3263 = 0;
		((Class235) this).f_sb = 0;
		((Class235) this).anInt3226 = 0;
		((Class235) this).aClass235_3257 = null;
		((Class235) this).anInt3244 = 1;
		((Class235) this).anInt3248 = -1;
		((Class235) this).anInt3255 = 0;
		((Class235) this).f_jb = "";
		((Class235) this).anInt3260 = 0;
		((Class235) this).anInt3271 = 0;
		((Class235) this).anInt3274 = 2;
		((Class235) this).f_fc = 0;
		((Class235) this).f_rc = false;
		((Class235) this).aBool3277 = false;
		((Class235) this).f_tb = 0;
		((Class235) this).f_dc = 0;
		((Class235) this).aBool3219 = false;
		((Class235) this).anInt3281 = 0;
		((Class235) this).anInt3240 = 0;
		((Class235) this).aByte3223 = (byte) 0;
		((Class235) this).f_ob = (byte) 0;
		((Class235) this).anInt3292 = 0;
		((Class235) this).aByte3296 = (byte) 0;
		((Class235) this).anInt3297 = -1;
		((Class235) this).aBool3290 = false;
		((Class235) this).anInt3238 = 0;
		((Class235) this).anInt3289 = -1;
		((Class235) this).anInt3287 = 0;
		((Class235) this).f_cb = (byte) 0;
		((Class235) this).f_pb = 0;
		((Class235) this).aString3301 = "";
		((Class235) this).anInt3300 = 0;
		((Class235) this).f_mc = 0;
		((Class235) this).f_uc = false;
		((Class235) this).aBool3285 = false;
		((Class235) this).anInt3264 = 0;
		((Class235) this).aString3247 = "";
		((Class235) this).f_dd = 100;
		((Class235) this).f_qc = 0;
		((Class235) this).anInt3276 = 0;
		((Class235) this).anInt3288 = 0;
		((Class235) this).f_oc = 0;
		((Class235) this).anInt3295 = 0;
		((Class235) this).aBool3286 = false;
		((Class235) this).f_ic = false;
		((Class235) this).anInt3270 = 0;
		((Class235) this).f_gd = 0;
		((Class235) this).anInt3283 = 0;
		((Class235) this).anInt3293 = -1;
		((Class235) this).f_bd = false;
		((Class235) this).f_hd = 0;
		((Class235) this).anInt3259 = 0;
		((Class235) this).f_md = 0;
		((Class235) this).f_cd = 1;
		((Class235) this).anInt3272 = 0;
		((Class235) this).anInt3284 = -1;
		((Class235) this).f_pd = -1;
		((Class235) this).anInt3280 = 0;
	}

	static {
		f_qb = new Class166();
		ACTION_BUTTON8 = new OutgoingPacket(70, 8);
		f_kd = -1;
	}
}
