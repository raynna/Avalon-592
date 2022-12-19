
/* Class260_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

final class Class260_Sub2 extends Class260 {
	static int anInt4184;
	static int anInt4185;
	static int anInt4186;
	static int anInt4187;
	static int anInt4188;
	static int anInt4189;
	static int anInt4190;
	static int anInt4191;
	static int anInt4192;
	static int anInt4193;
	static int anInt4194;
	static int anInt4195;
	static int anInt4196;
	static int anInt4197;
	static int anInt4198;
	static int anInt4199;
	static int anInt4200;
	static int anInt4201;
	private int anInt4202;
	static int anInt4203;
	static int anInt4204;
	static int anInt4205;
	static int anInt4206;
	private OpenGL anOpenGL4207;
	static int anInt4208;
	static int anInt4209;
	static int anInt4210;
	static int anInt4211;
	static int anInt4212;
	static int anInt4213;
	static int anInt4214;
	static int anInt4215;
	static int anInt4216;
	static int anInt4217;
	static int f_ab;
	static int f_bb;
	static int f_cb;
	static int f_db;
	static int f_eb;
	static int f_fb;
	static int f_gb;
	private Canvas f_hb;
	static int f_ib;
	static int f_jb;
	static int f_kb;
	static int f_lb;
	static int f_mb;
	static int f_nb;
	static int f_ob;
	static int f_pb;
	static int f_qb;
	static int f_rb;
	static int f_sb;
	int f_tb;
	static int f_ub;
	static int f_vb;
	static int f_wb;
	static int anInt4218;
	static int anInt4219;
	static int anInt4220;
	static int anInt4221;
	static int anInt4222;
	static int anInt4223;
	static int anInt4224;
	static int anInt4225;
	static int anInt4226;
	static int anInt4227;
	static int anInt4228;
	static int anInt4229;
	static int anInt4230;
	static int anInt4231;
	static int anInt4232;
	static int anInt4233;
	static int anInt4234;
	static int anInt4235;
	static int anInt4236;
	static int anInt4237;
	static int anInt4238;
	private Canvas aCanvas4239;
	static int anInt4240;
	static int anInt4241;
	static int anInt4242;
	static int anInt4243;
	static int anInt4244;
	static int anInt4245;
	static int anInt4246;
	static int f_ac;
	static int f_bc;
	static int f_cc;
	static int f_dc;
	static int f_ec;
	static int f_fc;
	static int anInt4247;
	static int f_hc;
	static int f_ic;
	static int f_jc;
	static int f_kc;
	static int f_lc;
	private long f_mc;
	static int f_nc;
	static int f_oc;
	static int f_pc;
	static int f_qc;
	static int f_rc;
	static int f_sc;
	static int f_tc;
	static int f_uc;
	static int f_vc;
	static int f_wc;
	static int anInt4248;
	static int anInt4249;
	static int anInt4250;
	static int anInt4251;
	static int anInt4252;
	static int anInt4253;
	static int anInt4254;
	static OutgoingPacket SEND_FRIEND_QUICK_CHAT_PACKET = new OutgoingPacket(2, -1);
	static int anInt4256;
	static int anInt4257;
	static int anInt4258;
	static int anInt4259;
	static int anInt4260;
	static int anInt4261;
	static int anInt4262;
	static int anInt4263;
	static int anInt4264;
	static int anInt4265;
	static int anInt4266;
	static int anInt4267;
	static int anInt4268;
	static int anInt4269;
	static int anInt4270;
	private int anInt4271;
	static int anInt4272;
	static int anInt4273;
	static int anInt4274;
	static int anInt4275;
	static int anInt4276;
	static int f_ad;
	static int f_bd;
	static int f_cd;
	static int f_dd;
	private long f_ed;
	static int f_fd;
	static int f_gd;
	static int f_hd;
	static int f_id;
	static int f_jd;
	static int f_kd;
	static int f_ld;
	static int f_md;
	static int f_nd;
	static int f_od;
	static int f_pd;
	static int f_qd;
	static int f_rd;
	static int f_sd;
	static int f_td;
	static int f_ud;
	int f_vd;
	private Hashtable f_wd = new Hashtable();
	static int[] anIntArray4277 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	static int anInt4278;
	static int anInt4279;
	static int anInt4280;
	static int anInt4281;
	static int anInt4282;
	static int anInt4283;
	static int anInt4284;
	static int anInt4285;
	static int anInt4286;
	static int anInt4287;
	static int anInt4288;
	static int anInt4289 = 0;
	static int anInt4290;
	static int anInt4291;
	static int anInt4292;
	static int anInt4293;
	static int anInt4294;
	static int anInt4295;
	static int anInt4296;
	static Class205 aClass205_4297;
	static int anInt4298;
	static int anInt4299;
	static int anInt4300;
	static int anInt4301;
	static int anInt4302;
	static int anInt4303;
	static int anInt4304;
	static int anInt4305;
	static int f_ae;
	static int[] f_be = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int f_ce = 128;
	static int f_de;
	private Class249 f_ee;
	private Class236 f_fe;
	static int f_ge;
	private Class31 f_he = new Class31();
	Class47 f_ie;
	int f_je;
	private Class246_Sub7_Sub1 f_ke;
	private Class_c_Sub1 f_le = new Class_c_Sub1();
	Class_c_Sub1 f_me = new Class_c_Sub1();
	private boolean f_ne;
	int f_oe;
	NativeHeap f_pe;
	int f_qe;
	int f_re = 3;
	Class37 f_se;
	private Class166 f_te;
	private Interface4[] f_ue;
	private Interface4 f_ve;
	private int anInt4306;
	private int anInt4307;
	private Interface4 anInterface4_4308;
	private int anInt4309;
	private Interface4[] anInterface4Array4310;
	private Interface4[] anInterface4Array4311;
	int anInt4312;
	private Class166 aClass166_4313;
	int anInt4314;
	private int anInt4315;
	private Class166 aClass166_4316;
	private Class166 aClass166_4317;
	private Class166 aClass166_4318;
	private Class166 aClass166_4319;
	private Class166 aClass166_4320;
	private Class166 aClass166_4321;
	boolean aBool4322;
	int anInt4323;
	private int anInt4324;
	boolean aBool4325;
	private float aFloat4326;
	private int anInt4327;
	Class_t_Sub1 aClass_t_Sub1_4328;
	private int anInt4329;
	private int anInt4330;
	private int anInt4331;
	float aFloat4332;
	boolean aBool4333;
	int anInt4334;
	int anInt4335;
	private boolean f_af;
	private float[] f_bf;
	int f_cf;
	private boolean f_df;
	Class_t_Sub1 f_ef;
	private boolean f_ff;
	float f_gf;
	private float f_hf;
	private int f_jf;
	private Interface1 f_kf;
	private boolean f_lf;
	float f_mf;
	private int f_nf;
	private float[] f_of;
	Class109_Sub1 f_pf;
	float f_qf;
	Class_t_Sub1 f_rf;
	int f_sf;
	int f_tf;
	boolean f_uf;
	int f_vf;
	private Class246_Sub41[] f_wf;
	Class_t_Sub1 aClass_t_Sub1_4336;
	private int anInt4337;
	Class109_Sub1 aClass109_Sub1_4338;
	int anInt4339;
	boolean aBool4340;
	private boolean aBool4341;
	Class160 aClass160_4342;
	float aFloat4343;
	float aFloat4344;
	private int anInt4345;
	private boolean aBool4346;
	private Class109_Sub1_Sub1 aClass109_Sub1_Sub1_4347;
	private Interface10 anInterface10_4348;
	Class160 aClass160_4349;
	private int anInt4350;
	private boolean aBool4351;
	float aFloat4352;
	private float aFloat4353;
	private boolean aBool4354;
	private String aString4355;
	private int anInt4356;
	private int anInt4357;
	boolean aBool4358;
	float aFloat4359;
	private boolean aBool4360;
	float aFloat4361;
	private boolean aBool4362;
	Class134 aClass134_4363;
	int anInt4364;
	private Interface10 f_ag;
	Class_c_Sub1 f_bg;
	private float f_cg;
	private int f_dg;
	private int f_eg;
	private float[] f_fg;
	float f_gg;
	Class_c_Sub1 f_hg;
	Class_t_Sub1 f_ig;
	Class_t_Sub1 f_jg;
	private int f_kg;
	Class_t_Sub1 f_lg;
	int f_mg;
	private float[] f_ng;
	private float f_og;
	boolean f_pg;
	private String f_qg;
	private boolean f_rg;
	int f_sg;
	float f_tg;
	Class_t_Sub1 f_ug;
	float f_vg;
	private int f_wg;
	private Class109[] aClass109Array4365;
	int anInt4366;
	float aFloat4367;
	private int anInt4368;
	int anInt4369;
	Class109_Sub1 aClass109_Sub1_4370;
	int anInt4371;
	Class_t_Sub1 aClass_t_Sub1_4372;
	private int anInt4373;
	float[] aFloatArray4374;
	boolean aBool4375;
	private int anInt4376;
	int anInt4377;
	Class134 aClass134_4378;
	private boolean aBool4379;
	private int anInt4380;
	boolean aBool4381;
	private boolean aBool4382;
	float aFloat4383;
	int anInt4384;
	boolean aBool4385;
	private int anInt4386;
	Class_t_Sub1 aClass_t_Sub1_4387;
	private float aFloat4388;
	float aFloat4389;
	private long aLong4390;
	boolean aBool4391;
	boolean aBool4392;
	private int anInt4393;
	private boolean f_ah;
	boolean f_bh;
	private int f_ch;
	private Class211_Sub1 f_dh;

	private final void method1896(int i) {
		try {
			f_rc++;
			int i_0_ = 0;
			if (i <= 67)
				method1684();
			while (!anOpenGL4207.a()) {
				if ((i_0_++ ^ 0xffffffff) < -6)
					throw new RuntimeException("");
				Class247.method1580(1000L, -5184);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.FE(" + i + ')');
		}
	}

	final void X(int i, int i_1_, int i_2_, int[] is) {
		try {
			anInt4284++;
			float f = (((float) i_2_ * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5363) + ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5378 * (float) i_1_) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5386) * (float) i) + ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5362);
			if ((float) ((Class260_Sub2) this).f_cf > f || f > (float) ((Class260_Sub2) this).anInt4371)
				is[0] = is[1] = is[2] = -1;
			else {
				int i_3_ = (int) ((float) ((Class260_Sub2) this).anInt4366 * ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5393) + (((float) i_2_ * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5388) + ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5372 * (float) i) + (float) i_1_ * ((Class_c_Sub1) (((Class260_Sub2) this).f_hg)).aFloat5387))) / f);
				int i_4_ = (int) (((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5385) + ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5364) * (float) i + ((float) i_1_ * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5382) + ((float) i_2_ * ((Class_c_Sub1) (((Class260_Sub2) this).f_hg)).aFloat5367))) * (float) ((Class260_Sub2) this).f_tf / f);
				if (!((float) i_3_ >= ((Class260_Sub2) this).aFloat4383) || !(((Class260_Sub2) this).aFloat4344 >= (float) i_3_) || !((float) i_4_ >= ((Class260_Sub2) this).f_qf) || !((float) i_4_ <= ((Class260_Sub2) this).aFloat4361))
					is[0] = is[1] = is[2] = -1;
				else {
					is[2] = (int) f;
					is[1] = (int) ((float) i_4_ - ((Class260_Sub2) this).f_qf);
					is[0] = (int) ((float) i_3_ - ((Class260_Sub2) this).aFloat4383);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.X(" + i + ',' + i_1_ + ',' + i_2_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1897(int i, int i_5_) {
		try {
			anInt4188++;
			if ((i ^ 0xffffffff) == -5122 || i == 5120)
				return 1;
			if (i_5_ < 125)
				f_mc = 43L;
			if ((i ^ 0xffffffff) == -5124 || (i ^ 0xffffffff) == -5123)
				return 2;
			if ((i ^ 0xffffffff) == -5126 || i == 5124 || i == 5126)
				return 4;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.UD(" + i + ',' + i_5_ + ')');
		}
	}

	final boolean method1720() {
		try {
			anInt4236++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.KA(" + ')');
		}
	}

	final boolean method1684() {
		try {
			anInt4214++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PC(" + ')');
		}
	}

	final void method1704(Canvas canvas) {
		do {
			try {
				anInt4215++;
				if (canvas == aCanvas4239)
					throw new RuntimeException();
				if (!f_wd.containsKey(canvas))
					break;
				Long var_long = (Long) f_wd.get(canvas);
				anOpenGL4207.releaseSurface(canvas, var_long.longValue());
				f_wd.remove(canvas);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.VB(" + (canvas != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void method1898(boolean bool) {
		try {
			if ((anInt4393 ^ 0xffffffff) != -1) {
				anInt4393 = 0;
				f_ch &= ~0x1f;
			}
			if (bool != true)
				((Class260_Sub2) this).aClass109_Sub1_4338 = null;
			anInt4235++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.G(" + bool + ')');
		}
	}

	final void method1678(boolean bool) {
		try {
			f_ic++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.CC(" + bool + ')');
		}
	}

	final Class128 method1726(int i, int i_6_, int[] is, int[] is_7_) {
		try {
			anInt4186++;
			return Class231.method1479(i_6_, is, i, this, is_7_, (byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.UC(" + i + ',' + i_6_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1899(int i) {
		do {
			try {
				if (i < 55)
					aClass166_4321 = null;
				f_de++;
				if (anInt4393 == 3)
					break;
				anInt4393 = 3;
				method1933(-16933);
				method1952(0);
				f_ch &= ~0x7;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.VF(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1900(int i, int i_8_) {
		try {
			if ((i_8_ ^ 0xffffffff) != -2) {
				if (i_8_ == 0)
					method1912(8448, 8448, true);
				else if (i_8_ == 2)
					method1912(34165, 7681, true);
				else if ((i_8_ ^ 0xffffffff) != -4) {
					if (i_8_ == 4)
						method1912(34023, 34023, true);
				} else
					method1912(260, 8448, true);
			} else
				method1912(7681, 7681, true);
			if (i != 7681)
				anInt4330 = 35;
			f_fc++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PE(" + i + ',' + i_8_ + ')');
		}
	}

	final void method1901(byte i, int i_9_) {
		try {
			Class246_Sub38.aFloatArray5446[0] = (float) PacketsDecoder.method184(i_9_, 16711680) / 1.671168E7F;
			Class246_Sub38.aFloatArray5446[2] = (float) PacketsDecoder.method184(i_9_, 255) / 255.0F;
			anInt4204++;
			Class246_Sub38.aFloatArray5446[3] = (float) (i_9_ >>> 24) / 255.0F;
			Class246_Sub38.aFloatArray5446[1] = (float) PacketsDecoder.method184(i_9_, 65280) / 65280.0F;
			if (i == -100)
				OpenGL.glTexEnvfv(8960, 8705, Class246_Sub38.aFloatArray5446, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.AF(" + i + ',' + i_9_ + ')');
		}
	}

	final Interface10 method1902(boolean bool, int i, Buffer nativebuffer, int i_10_, int i_11_) {
		try {
			anInt4226++;
			if (aBool4360 && (!bool || f_rg))
				return new Class187_Sub2(this, i_11_, nativebuffer, i_10_, bool);
			if (i < 116)
				return null;
			return new Class194_Sub2(this, i_11_, nativebuffer);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.LE(" + bool + ',' + i + ',' + (nativebuffer != null ? "{...}" : "null") + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	final void method1696(boolean bool) {
		try {
			anInt4211++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.D(" + bool + ')');
		}
	}

	private final void method1903(boolean bool) {
		try {
			f_rb++;
			int i = 0;
			if (bool != true)
				method1680();
			for (/**/; (f_jf ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				Class246_Sub41 class246_sub41 = f_wf[i];
				int i_12_ = 16386 + i;
				Class108.aFloatArray1536[0] = (float) class246_sub41.method2317(false);
				Class108.aFloatArray1536[1] = (float) class246_sub41.method2318((byte) 27);
				Class108.aFloatArray1536[2] = (float) class246_sub41.method2321((byte) -60);
				Class108.aFloatArray1536[3] = 1.0F;
				OpenGL.glLightfv(i_12_, 4611, Class108.aFloatArray1536, 0);
				int i_13_ = class246_sub41.method2319((byte) -112);
				float f = class246_sub41.method2316(false) / 255.0F;
				Class108.aFloatArray1536[0] = f * (float) (PacketsDecoder.method184(16753966, i_13_) >> 16);
				Class108.aFloatArray1536[1] = (float) (PacketsDecoder.method184(65287, i_13_) >> 8) * f;
				Class108.aFloatArray1536[2] = (float) PacketsDecoder.method184(255, i_13_) * f;
				OpenGL.glLightfv(i_12_, 4609, Class108.aFloatArray1536, 0);
				OpenGL.glLightf(i_12_, 4617, 1.0F / (float) (class246_sub41.method2322(81) * class246_sub41.method2322(116)));
				OpenGL.glEnable(i_12_);
			}
			for (/**/; i < anInt4327; i++)
				OpenGL.glDisable(16386 + i);
			anInt4327 = f_jf;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.GE(" + bool + ')');
		}
	}

	final void method1904(int i) {
		do {
			try {
				anInt4265++;
				if (i == f_ch)
					break;
				method1924(true);
				method1918(true, 0);
				method1951(true, (byte) 114);
				method1911(i - 40, true);
				method1958(-121, 1);
				method1900(i + 7673, 0);
				f_ch = 8;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.GD(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1905(byte i, Class109 class109) {
		try {
			anInt4263++;
			Class109 class109_14_ = aClass109Array4365[anInt4357];
			if (class109_14_ != class109) {
				if (class109 == null)
					OpenGL.glDisable(((Class109) class109_14_).anInt1553);
				else {
					if (class109_14_ != null) {
						if ((((Class109) class109).anInt1553 ^ 0xffffffff) != (((Class109) class109_14_).anInt1553 ^ 0xffffffff)) {
							OpenGL.glDisable(((Class109) class109_14_).anInt1553);
							OpenGL.glEnable(((Class109) class109).anInt1553);
						}
					} else
						OpenGL.glEnable(((Class109) class109).anInt1553);
					OpenGL.glBindTexture(((Class109) class109).anInt1553, class109.method758(true));
				}
				aClass109Array4365[anInt4357] = class109;
			}
			if (i == 78)
				f_ch &= ~0x1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.OE(" + i + ',' + (class109 != null ? "{...}" : "null") + ')'));
		}
	}

	final void fa(int i, int i_15_, int i_16_, int i_17_) {
		try {
			if (i_17_ < anInt4337)
				anInt4337 = i_17_;
			if (f_nf > i_16_)
				f_nf = i_16_;
			if (anInt4386 < i_15_)
				anInt4386 = i_15_;
			if ((anInt4373 ^ 0xffffffff) > (i ^ 0xffffffff))
				anInt4373 = i;
			f_ib++;
			OpenGL.glEnable(3089);
			method1953(true);
			method1915((byte) -119);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.fa(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	final Class_u method1725(int i) {
		try {
			f_sd++;
			Class_u_Sub1 class_u_sub1 = new Class_u_Sub1(i);
			f_te.method1101(false, class_u_sub1);
			return class_u_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.WB(" + i + ')');
		}
	}

	final int method1701() {
		try {
			anInt4250++;
			return 4;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.E(" + ')');
		}
	}

	final void method1906(boolean bool, int i) {
		try {
			f_gb++;
			if (!aBool4382 != !bool) {
				aBool4382 = bool;
				method1919(0);
				f_ch &= ~0x7;
			}
			int i_18_ = 39 / ((9 - i) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PF(" + bool + ',' + i + ')');
		}
	}

	private final void method1907(int i) {
		try {
			OpenGL.glMatrixMode(5889);
			f_ub++;
			int i_19_ = -109 % ((65 - i) / 37);
			OpenGL.glLoadMatrixf(f_bf, 0);
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.QF(" + i + ')');
		}
	}

	final synchronized void method1908(int i, byte i_20_) {
		try {
			if (i_20_ != 51)
				((Class260_Sub2) this).f_jg = null;
			f_gd++;
			Node class246 = new Node();
			((Node) class246).hash = (long) i;
			aClass166_4320.method1101(false, class246);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.OD(" + i + ',' + i_20_ + ')');
		}
	}

	private final void method1909(byte i) {
		try {
			do {
				if (f_hb == null) {
					anInt4271 = anInt4202 = 0;
					if (!client.f_ob)
						break;
				}
				Dimension dimension = f_hb.getSize();
				anInt4202 = dimension.height;
				anInt4271 = dimension.width;
			} while (false);
			anInt4264++;
			if (f_ve == null) {
				((Class260_Sub2) this).f_tb = anInt4202;
				((Class260_Sub2) this).f_vd = anInt4271;
				method1950(1);
			}
			int i_21_ = 70 / ((-64 - i) / 54);
			method1898(true);
			e();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.WD(" + i + ')');
		}
	}

	final void O(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		do {
			try {
				anInt4247++;
				float f = (float) i + 0.35F;
				float f_27_ = (float) i_22_ + 0.35F;
				float f_28_ = (float) i_23_ + f;
				method1977((byte) -56);
				float f_29_ = (float) i_24_ + f_27_;
				method1958(93, i_26_);
				OpenGL.glColor4ub((byte) (i_25_ >> 16), (byte) (i_25_ >> 8), (byte) i_25_, (byte) (i_25_ >> 24));
				if (f_af)
					OpenGL.glDisable(32925);
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f, f_27_);
				OpenGL.glVertex2f(f, f_29_);
				OpenGL.glVertex2f(f_28_, f_29_);
				OpenGL.glVertex2f(f_28_, f_27_);
				OpenGL.glEnd();
				if (!f_af)
					break;
				OpenGL.glEnable(32925);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.O(" + i + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized void method1910(int i, int i_30_, int i_31_) {
		try {
			anInt4292++;
			IntegerNode class246_sub33 = new IntegerNode(i_30_);
			if (i > -44)
				method1709(-39, 94, -5, -127, -35, -16);
			((Node) class246_sub33).hash = (long) i_31_;
			aClass166_4319.method1101(false, class246_sub33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.SE(" + i + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final boolean method1727() {
		try {
			anInt4252++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.DC(" + ')');
		}
	}

	final void method1724(int i) {
		try {
			f_ge++;
			if ((i ^ 0xffffffff) != -2)
				throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.DD(" + i + ')');
		}
	}

	final boolean method1741() {
		try {
			anInt4304++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.FD(" + ')');
		}
	}

	final void method1911(int i, boolean bool) {
		do {
			try {
				f_uc++;
				if (aBool4341 != bool) {
					aBool4341 = bool;
					method1976(i ^ ~0x1f);
					f_ch &= ~0x1f;
				}
				if (i == -32)
					break;
				anInt4324 = -115;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.IE(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	final void method1735(int i, int i_32_, int i_33_, int i_34_) {
		try {
			anInt4259++;
			f_ee.method1593(i, i_33_, -88, i_32_, i_34_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.WA(" + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ')'));
		}
	}

	final void method1912(int i, int i_35_, boolean bool) {
		do {
			try {
				do {
					if ((anInt4357 ^ 0xffffffff) != -1) {
						OpenGL.glTexEnvi(8960, 34161, i);
						OpenGL.glTexEnvi(8960, 34162, i_35_);
						if (!client.f_ob)
							break;
					}
					boolean bool_36_ = false;
					if (anInt4350 != i) {
						OpenGL.glTexEnvi(8960, 34161, i);
						anInt4350 = i;
						bool_36_ = true;
					}
					if ((i_35_ ^ 0xffffffff) != (f_kg ^ 0xffffffff)) {
						OpenGL.glTexEnvi(8960, 34162, i_35_);
						bool_36_ = true;
						f_kg = i_35_;
					}
					if (bool_36_)
						f_ch &= ~0x1d;
				} while (false);
				anInt4210++;
				if (bool == true)
					break;
				method1686();
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.KE(" + i + ',' + i_35_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	final void NA(int i, int i_37_, int i_38_, int i_39_, int i_40_) {
		try {
			anInt4201++;
			throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.NA(" + i + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	final void method1913(boolean bool, float f, float f_41_, float f_42_, float f_43_) {
		try {
			Class246_Sub38.aFloatArray5446[2] = f_42_;
			if (bool != true)
				method1946((byte) 58);
			anInt4279++;
			Class246_Sub38.aFloatArray5446[1] = f;
			Class246_Sub38.aFloatArray5446[3] = f_41_;
			Class246_Sub38.aFloatArray5446[0] = f_43_;
			OpenGL.glTexEnvfv(8960, 8705, Class246_Sub38.aFloatArray5446, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.IB(" + bool + ',' + f + ',' + f_41_ + ',' + f_42_ + ',' + f_43_ + ')'));
		}
	}

	final Class_t method1695(Class103 class103, int i, int i_44_, int i_45_, int i_46_) {
		try {
			anInt4193++;
			return new Class_t_Sub1(this, class103, i, i_45_, i_46_, i_44_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.BA(" + (class103 != null ? "{...}" : "null") + ',' + i + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
		}
	}

	final void method1914(byte i) {
		try {
			OpenGL.glLightfv(16384, 4611, ((Class260_Sub2) this).aFloatArray4374, 0);
			anInt4200++;
			if (i != 66)
				OA(-40, 53, 123, 88);
			OpenGL.glLightfv(16385, 4611, f_fg, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.AG(" + i + ')');
		}
	}

	final boolean method1702() {
		try {
			anInt4190++;
			return f_fe.method1519(3, (byte) -126);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.BB(" + ')');
		}
	}

	final void ea(Class_c class_c) {
		do {
			try {
				anInt4248++;
				((Class260_Sub2) this).f_hg = (Class_c_Sub1) class_c;
				((Class260_Sub2) this).f_bg.method2276(((Class260_Sub2) this).f_hg, false);
				if ((anInt4393 ^ 0xffffffff) == -2)
					break;
				method1952(0);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.ea(" + (class_c != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void method1752() {
		try {
			f_ab++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.KB(" + ')');
		}
	}

	final void method1713(Canvas canvas) {
		do {
			try {
				f_dd++;
				long l = 0L;
				do {
					if (canvas == null || aCanvas4239 == canvas) {
						l = f_ed;
						if (!client.f_ob)
							break;
					}
					if (f_wd.containsKey(canvas)) {
						Long var_long = (Long) f_wd.get(canvas);
						l = var_long.longValue();
					}
				} while (false);
				if (l == 0L)
					throw new RuntimeException();
				anOpenGL4207.surfaceResized(l);
				if (f_hb != canvas)
					break;
				method1909((byte) -118);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.HB(" + (canvas != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	private final void method1915(byte i) {
		do {
			try {
				do {
					if (anInt4373 > f_nf || (anInt4386 ^ 0xffffffff) < (anInt4337 ^ 0xffffffff)) {
						OpenGL.glScissor(0, 0, 0, 0);
						if (!client.f_ob)
							break;
					}
					OpenGL.glScissor(anInt4373 + f_wg, (-anInt4337 + (anInt4324 - -((Class260_Sub2) this).f_tb)), -anInt4373 + f_nf, anInt4337 + -anInt4386);
				} while (false);
				anInt4272++;
				if (i < -3)
					break;
				((Class260_Sub2) this).aBool4340 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.AE(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1691(Canvas canvas) {
		try {
			f_hb = null;
			f_mc = 0L;
			anInt4237++;
			do {
				if (canvas != null && canvas != aCanvas4239) {
					if (!f_wd.containsKey(canvas))
						break;
					Long var_long = (Long) f_wd.get(canvas);
					f_mc = var_long.longValue();
					f_hb = canvas;
					if (!client.f_ob)
						break;
				}
				f_mc = f_ed;
				f_hb = aCanvas4239;
			} while (false);
			if (f_hb == null || (f_mc ^ 0xffffffffffffffffL) == -1L)
				throw new RuntimeException();
			anOpenGL4207.setSurface(f_mc);
			method1909((byte) -119);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.UB(" + (canvas != null ? "{...}" : "null") + ')');
		}
	}

	final void method1719() {
		try {
			f_ee.method1595((byte) -14);
			anInt4223++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.FC(" + ')');
		}
	}

	final void method1916(int i) {
		do {
			try {
				OpenGL.glPopMatrix();
				anInt4185++;
				if (i == 1)
					break;
				((Class260_Sub2) this).anInt4334 = 56;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.ME(" + i + ')');
			}
			break;
		} while (false);
	}

	final float W() {
		try {
			anInt4189++;
			return ((Class260_Sub2) this).aFloat4343;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.W(" + ')');
		}
	}

	private final void method1917(int i) {
		do {
			try {
				if (aBool4362) {
					OpenGL.glMatrixMode(5890);
					OpenGL.glLoadIdentity();
					OpenGL.glMatrixMode(5888);
					aBool4362 = false;
				}
				anInt4213++;
				if (i == 0)
					break;
				f_af = true;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.EE(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1689() {
		try {
			f_kc++;
			if (f_ke != null) {
				do {
					if (!f_ke.method1836((byte) 120)) {
						if (f_ee.method1588(0, f_ke)) {
							((Class260_Sub2) this).f_ie.method320(4);
							if (!client.f_ob)
								break;
						}
						return false;
					}
				} while (false);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.EC(" + ')');
		}
	}

	final void method1918(boolean bool, int i) {
		try {
			if (!f_lf != !bool) {
				f_lf = bool;
				method1968(true);
				f_ch &= ~0x1f;
			}
			if (i != 0)
				anInt4331 = -29;
			anInt4199++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.TF(" + bool + ',' + i + ')');
		}
	}

	private final void method1919(int i) {
		try {
			do {
				if (aBool4382 && !aBool4351) {
					OpenGL.glEnable(2896);
					if (!client.f_ob)
						break;
				}
				OpenGL.glDisable(2896);
			} while (false);
			if (i != 0)
				method1903(false);
			anInt4242++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.LB(" + i + ')');
		}
	}

	final int method1920(int i, int i_47_) {
		try {
			anInt4209++;
			if (i != 6406 && (i ^ 0xffffffff) != -6410) {
				if ((i ^ 0xffffffff) == -6411 || (i ^ 0xffffffff) == -34847 || (i ^ 0xffffffff) == -34845)
					return 2;
				if ((i ^ 0xffffffff) == -6408)
					return 3;
				if (i == 6408 || (i ^ 0xffffffff) == -34848)
					return 4;
				if ((i ^ 0xffffffff) != -34844) {
					if ((i ^ 0xffffffff) != -34843) {
						if (i != 6402) {
							if ((i ^ 0xffffffff) == -6402)
								return 1;
						} else
							return 3;
					} else
						return 8;
				} else
					return 6;
			} else
				return 1;
			if (i_47_ != 2)
				f_ch = 114;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.L(" + i + ',' + i_47_ + ')');
		}
	}

	private final void method1921(boolean bool) {
		try {
			f_wc++;
			if (bool == true)
				anOpenGL4207.b();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.OB(" + bool + ')');
		}
	}

	final void method1922(Interface4 interface4, byte i) {
		try {
			anInt4205++;
			if (i != -101)
				method1954(true, -85, -74, 117);
			if (!((Class260_Sub2) this).aBool4358) {
				if (anInt4306 >= 3)
					throw new RuntimeException();
				if ((anInt4306 ^ 0xffffffff) <= -1)
					anInterface4Array4311[anInt4306].method8(-123);
				anInterface4_4308 = f_ve = anInterface4Array4311[++anInt4306] = interface4;
				anInterface4_4308.method7((byte) -123);
			} else {
				method1940((byte) 79, interface4);
				method1956(interface4, (byte) 54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.EA(" + (interface4 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method1923(byte i) {
		try {
			f_ae++;
			float[] fs = f_bf;
			float f = ((float) (-((Class260_Sub2) this).f_vf * ((Class260_Sub2) this).f_cf) / (float) ((Class260_Sub2) this).anInt4366);
			float f_48_ = ((float) ((((Class260_Sub2) this).f_vd - ((Class260_Sub2) this).f_vf) * ((Class260_Sub2) this).f_cf) / (float) ((Class260_Sub2) this).anInt4366);
			if (i >= -70)
				method1925(10, 30, 114, 87);
			float f_49_ = ((float) (((Class260_Sub2) this).anInt4339 * ((Class260_Sub2) this).f_cf) / (float) ((Class260_Sub2) this).f_tf);
			float f_50_ = ((float) (((Class260_Sub2) this).f_cf * (-((Class260_Sub2) this).f_tb + ((Class260_Sub2) this).anInt4339)) / (float) ((Class260_Sub2) this).f_tf);
			do {
				if (f != f_48_ && f_50_ != f_49_) {
					float f_51_ = 2.0F * (float) ((Class260_Sub2) this).f_cf;
					fs[6] = 0.0F;
					fs[3] = 0.0F;
					fs[13] = 0.0F;
					fs[5] = f_51_ / (-f_50_ + f_49_);
					fs[4] = 0.0F;
					fs[7] = 0.0F;
					fs[8] = (f_48_ + f) / (f_48_ - f);
					fs[12] = 0.0F;
					fs[9] = (f_49_ + f_50_) / (-f_50_ + f_49_);
					fs[14] = f_hf = (-(f_51_ * (float) ((Class260_Sub2) this).anInt4371) / (float) (-((Class260_Sub2) this).f_cf + ((Class260_Sub2) this).anInt4371));
					fs[2] = 0.0F;
					fs[15] = 0.0F;
					fs[10] = f_cg = ((float) -(((Class260_Sub2) this).anInt4371 - -((Class260_Sub2) this).f_cf) / (float) (-((Class260_Sub2) this).f_cf + ((Class260_Sub2) this).anInt4371));
					fs[1] = 0.0F;
					fs[11] = -1.0F;
					fs[0] = f_51_ / (f_48_ - f);
					if (!client.f_ob)
						break;
				}
				fs[7] = 0.0F;
				fs[13] = 0.0F;
				fs[3] = 0.0F;
				fs[5] = 1.0F;
				fs[2] = 0.0F;
				fs[9] = 0.0F;
				fs[14] = 0.0F;
				fs[4] = 0.0F;
				fs[10] = 1.0F;
				fs[15] = 1.0F;
				fs[8] = 0.0F;
				fs[1] = 0.0F;
				fs[12] = 0.0F;
				fs[0] = 1.0F;
				fs[11] = 0.0F;
				fs[6] = 0.0F;
			} while (false);
			method1975(0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.NC(" + i + ')');
		}
	}

	final Class211 method1709(int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		try {
			anInt4300++;
			if (!((Class260_Sub2) this).aBool4340)
				return null;
			return new Class211_Sub1_Sub2(this, i, i_52_, i_53_, i_54_, i_55_, i_56_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.VA(" + i + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ',' + i_56_ + ')'));
		}
	}

	private final void method1924(boolean bool) {
		do {
			try {
				if ((anInt4393 ^ 0xffffffff) != -3) {
					anInt4393 = 2;
					method1907(-82);
					method1952(0);
					f_ch &= ~0x7;
				}
				anInt4281++;
				if (bool == true)
					break;
				f_wf = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.VD(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method1731(Rectangle[] rectangles, int i) {
		try {
			method1688();
			anInt4249++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.QC(" + (rectangles != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1925(int i, int i_57_, int i_58_, int i_59_) {
		do {
			try {
				anInt4197++;
				OpenGL.glDrawArrays(i_58_, i_57_, i_59_);
				if (i == 1)
					break;
				method1931(70, -45, -16);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.GB(" + i + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ')'));
			}
			break;
		} while (false);
	}

	final Class211 method1739(Class211 class211, Class211 class211_60_, float f, Class211 class211_61_) {
		try {
			anInt4245++;
			if (class211 != null && class211_60_ != null && ((Class260_Sub2) this).aBool4340 && ((Class260_Sub2) this).aBool4322 && ((Class260_Sub2) this).aBool4358) {
				Class211_Sub1_Sub1 class211_sub1_sub1 = null;
				Class211_Sub1 class211_sub1 = (Class211_Sub1) class211;
				Class211_Sub1 class211_sub1_62_ = (Class211_Sub1) class211_60_;
				Class109_Sub4 class109_sub4 = class211_sub1.method2265(2);
				Class109_Sub4 class109_sub4_63_ = class211_sub1_62_.method2265(2);
				if (class109_sub4 != null && class109_sub4_63_ != null) {
					int i = (((((Class109_Sub4) class109_sub4_63_).anInt4571 ^ 0xffffffff) > (((Class109_Sub4) class109_sub4).anInt4571 ^ 0xffffffff)) ? ((Class109_Sub4) class109_sub4).anInt4571 : ((Class109_Sub4) class109_sub4_63_).anInt4571);
					if (class211_61_ != class211 && class211_61_ != class211_60_ && class211_61_ instanceof Class211_Sub1_Sub1) {
						Class211_Sub1_Sub1 class211_sub1_sub1_64_ = (Class211_Sub1_Sub1) class211_61_;
						if (i == class211_sub1_sub1_64_.method2612(false))
							class211_sub1_sub1 = class211_sub1_sub1_64_;
					}
					if (class211_sub1_sub1 == null)
						class211_sub1_sub1 = new Class211_Sub1_Sub1(this, i);
					if (class211_sub1_sub1.method2610(class109_sub4_63_, f, class109_sub4, 0))
						return class211_sub1_sub1;
				}
			}
			if (f < 0.5F)
				return class211;
			return class211_60_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.HC(" + (class211 != null ? "{...}" : "null") + ',' + (class211_60_ != null ? "{...}" : "null") + ',' + f + ',' + (class211_61_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1703(Class_t class_t, Class129 class129, Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		try {
			class_t.method680(class_c, class130_sub5, i);
			f_ob++;
			method1718(class129);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.HA(" + (class_t != null ? "{...}" : "null") + ',' + (class129 != null ? "{...}" : "null") + ',' + (class_c != null ? "{...}" : "null") + ',' + (class130_sub5 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1926(boolean bool, byte i, int i_65_, boolean bool_66_) {
		try {
			if (anInt4376 != i_65_) {
				if (i_65_ >= 0) {
					Class109_Sub1 class109_sub1 = ((Class260_Sub2) this).f_ie.method319(i_65_, -128);
					Class238 class238 = ((Class260) this).anInterface6_3714.method17(-31305, i_65_);
					if (((Class238) class238).aByte3345 != 0 || ((((Class238) class238).aByte3350 ^ 0xffffffff) != -1)) {
						int i_67_ = !((Class238) class238).aBool3335 ? 128 : 64;
						int i_68_ = i_67_ * 50;
						method1963((byte) -62, (float) (((Class238) class238).aByte3350 * (((Class260_Sub2) this).f_qe % i_68_)) / (float) i_68_, (float) (((Class238) class238).aByte3345 * (((Class260_Sub2) this).f_qe % i_68_)) / (float) i_68_, 0.0F);
					} else
						method1917(0);
					if (!((Class260_Sub2) this).aBool4325) {
						f_fe.method1520(-113, bool_66_, bool, ((Class238) class238).aByte3343);
						f_fe.method1521(((Class238) class238).anInt3336, ((Class238) class238).aByte3342, false);
						if (!f_fe.method1518((byte) -92, class109_sub1, (((Class238) class238).anInt3341))) {
							method1905((byte) 78, class109_sub1);
							method1900(i ^ 0x1e0d, ((Class238) class238).anInt3341);
						}
					} else {
						f_fe.method1520(-105, bool_66_, bool, 3);
						method1905((byte) 78, class109_sub1);
						method1900(7681, ((Class238) class238).anInt3341);
					}
				} else {
					method1917(i - 12);
					method1905((byte) 78, null);
					method1900(i ^ 0x1e0d, 0);
					if (!((Class260_Sub2) this).aBool4325)
						f_fe.method1520(-93, bool_66_, bool, 0);
				}
				anInt4376 = i_65_;
			}
			f_cc++;
			if (i != 12)
				method1953(true);
			f_ch &= ~0x7;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.IF(" + bool + ',' + i + ',' + i_65_ + ',' + bool_66_ + ')'));
		}
	}

	private final void method1927(byte i) {
		try {
			Class246_Sub38.aFloatArray5446[2] = (((Class260_Sub2) this).aFloat4367 * ((Class260_Sub2) this).f_vg);
			Class246_Sub38.aFloatArray5446[0] = ((Class260_Sub2) this).f_vg * ((Class260_Sub2) this).f_tg;
			anInt4238++;
			Class246_Sub38.aFloatArray5446[3] = 1.0F;
			Class246_Sub38.aFloatArray5446[1] = (((Class260_Sub2) this).aFloat4332 * ((Class260_Sub2) this).f_vg);
			OpenGL.glLightfv(16384, 4609, Class246_Sub38.aFloatArray5446, 0);
			Class246_Sub38.aFloatArray5446[1] = (((Class260_Sub2) this).aFloat4332 * -((Class260_Sub2) this).aFloat4352);
			int i_69_ = -8 % ((8 - i) / 58);
			Class246_Sub38.aFloatArray5446[2] = (-((Class260_Sub2) this).aFloat4352 * ((Class260_Sub2) this).aFloat4367);
			Class246_Sub38.aFloatArray5446[3] = 1.0F;
			Class246_Sub38.aFloatArray5446[0] = (-((Class260_Sub2) this).aFloat4352 * ((Class260_Sub2) this).f_tg);
			OpenGL.glLightfv(16385, 4609, Class246_Sub38.aFloatArray5446, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.QD(" + i + ')');
		}
	}

	final void T(int i, float f, float f_70_, float f_71_, float f_72_, float f_73_) {
		try {
			f_md++;
			boolean bool = anInt4330 != i;
			if (bool || f != ((Class260_Sub2) this).f_vg || f_70_ != ((Class260_Sub2) this).aFloat4352) {
				((Class260_Sub2) this).aFloat4352 = f_70_;
				anInt4330 = i;
				((Class260_Sub2) this).f_vg = f;
				if (bool) {
					((Class260_Sub2) this).aFloat4332 = (float) (0xff00 & anInt4330) / 65280.0F;
					((Class260_Sub2) this).f_tg = (float) (anInt4330 & 0xff0000) / 1.671168E7F;
					((Class260_Sub2) this).aFloat4367 = (float) (0xff & anInt4330) / 255.0F;
					method1961(true);
				}
				method1927((byte) -93);
			}
			if (f_ng[0] != f_71_ || f_72_ != f_ng[1] || f_ng[2] != f_73_) {
				f_ng[2] = f_73_;
				f_ng[1] = f_72_;
				f_ng[0] = f_71_;
				f_of[1] = -f_72_;
				f_of[0] = -f_71_;
				f_of[2] = -f_73_;
				float f_74_ = (float) (1.0 / Math.sqrt((double) (f_72_ * f_72_ + f_71_ * f_71_ + f_73_ * f_73_)));
				((Class260_Sub2) this).aFloatArray4374[0] = f_71_ * f_74_;
				((Class260_Sub2) this).aFloatArray4374[2] = f_73_ * f_74_;
				((Class260_Sub2) this).aFloatArray4374[1] = f_74_ * f_72_;
				f_fg[2] = -((Class260_Sub2) this).aFloatArray4374[2];
				f_fg[1] = -((Class260_Sub2) this).aFloatArray4374[1];
				f_fg[0] = -((Class260_Sub2) this).aFloatArray4374[0];
				method1914((byte) 66);
				((Class260_Sub2) this).anInt4335 = (int) (256.0F * f_71_ / f_72_);
				((Class260_Sub2) this).anInt4369 = (int) (f_73_ * 256.0F / f_72_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.T(" + i + ',' + f + ',' + f_70_ + ',' + f_71_ + ',' + f_72_ + ',' + f_73_ + ')'));
		}
	}

	final void method1928(boolean bool) {
		do {
			try {
				f_oc++;
				if ((f_ch ^ 0xffffffff) != -17) {
					method1899(74);
					method1918(true, 0);
					method1951(true, (byte) 108);
					method1911(-32, true);
					method1958(-57, 1);
					method1900(7681, 0);
					f_ch = 16;
				}
				if (bool == true)
					break;
				((Class260_Sub2) this).aFloat4359 = 1.1431563F;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.FA(" + bool + ')');
			}
			break;
		} while (false);
	}

	final int method1723(int i, int i_75_) {
		try {
			anInt4299++;
			return i_75_ | i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.RB(" + i + ',' + i_75_ + ')');
		}
	}

	final synchronized void method1687(int i) {
		try {
			anInt4191++;
			i &= 0x7fffffff;
			int i_76_ = 0;
			while (!aClass166_4316.method1111((byte) -123)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4316.method1100(4095);
				Class243.anIntArray3446[i_76_++] = (int) ((Node) class246_sub33).hash;
				((Class260_Sub2) this).anInt4314 -= ((IntegerNode) class246_sub33).value;
				if (i_76_ == 1000) {
					OpenGL.glDeleteBuffersARB(i_76_, Class243.anIntArray3446, 0);
					i_76_ = 0;
				}
			}
			if (i_76_ > 0) {
				OpenGL.glDeleteBuffersARB(i_76_, Class243.anIntArray3446, 0);
				i_76_ = 0;
			}
			while (!aClass166_4317.method1111((byte) -125)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4317.method1100(4095);
				Class243.anIntArray3446[i_76_++] = (int) ((Node) class246_sub33).hash;
				((Class260_Sub2) this).anInt4312 -= ((IntegerNode) class246_sub33).value;
				if (i_76_ == 1000) {
					OpenGL.glDeleteTextures(i_76_, Class243.anIntArray3446, 0);
					i_76_ = 0;
				}
			}
			if ((i_76_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteTextures(i_76_, Class243.anIntArray3446, 0);
				i_76_ = 0;
			}
			while (!aClass166_4318.method1111((byte) -126)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4318.method1100(4095);
				Class243.anIntArray3446[i_76_++] = ((IntegerNode) class246_sub33).value;
				if ((i_76_ ^ 0xffffffff) == -1001) {
					OpenGL.glDeleteFramebuffersEXT(i_76_, Class243.anIntArray3446, 0);
					i_76_ = 0;
				}
			}
			if ((i_76_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteFramebuffersEXT(i_76_, Class243.anIntArray3446, 0);
				i_76_ = 0;
			}
			while (!aClass166_4319.method1111((byte) -124)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4319.method1100(4095);
				Class243.anIntArray3446[i_76_++] = (int) ((Node) class246_sub33).hash;
				anInt4315 -= ((IntegerNode) class246_sub33).value;
				if ((i_76_ ^ 0xffffffff) == -1001) {
					OpenGL.glDeleteRenderbuffersEXT(i_76_, Class243.anIntArray3446, 0);
					i_76_ = 0;
				}
			}
			if (i_76_ > 0) {
				OpenGL.glDeleteRenderbuffersEXT(i_76_, Class243.anIntArray3446, 0);
				boolean bool = false;
			}
			while (!aClass166_4313.method1111((byte) -126)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4313.method1100(4095);
				OpenGL.glDeleteLists((int) (((Node) class246_sub33).hash), (((IntegerNode) class246_sub33).value));
			}
			while (!aClass166_4320.method1111((byte) -122)) {
				Node class246 = aClass166_4320.method1100(4095);
				OpenGL.glDeleteProgramARB((int) ((Node) class246).hash);
			}
			while (!aClass166_4321.method1111((byte) -126)) {
				Node class246 = aClass166_4321.method1100(4095);
				OpenGL.glDeleteObjectARB(((Node) class246).hash);
			}
			while (!aClass166_4313.method1111((byte) -124)) {
				IntegerNode class246_sub33 = (IntegerNode) aClass166_4313.method1100(4095);
				OpenGL.glDeleteLists((int) (((Node) class246_sub33).hash), (((IntegerNode) class246_sub33).value));
			}
			((Class260_Sub2) this).f_ie.method315((byte) 103);
			if (IA() > 100663296 && Class151.time(-52) > 60000L + aLong4390) {
				System.gc();
				aLong4390 = Class151.time(-104);
			}
			((Class260_Sub2) this).f_qe = i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.VC(" + i + ')');
		}
	}

	final void method1929(int i) {
		try {
			if (i != 1)
				ca(40, null, -106, -85);
			if ((f_ch ^ 0xffffffff) != -5) {
				method1932(i);
				method1918(false, 0);
				method1906(false, -119);
				method1951(false, (byte) 100);
				method1911(-32, false);
				method1957(false, -2);
				method1958(118, 1);
				method1900(7681, 0);
				f_ch = 4;
			}
			f_pd++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.TD(" + i + ')');
		}
	}

	final void method1930(boolean bool) {
		do {
			try {
				anInt4269++;
				if ((f_ch ^ 0xffffffff) != -3) {
					method1932(1);
					method1918(false, 0);
					method1906(false, -53);
					method1951(false, (byte) 61);
					method1911(-32, false);
					method1957(bool, -2);
					f_ch = 2;
				}
				if (bool == false)
					break;
				method1953(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.JF(" + bool + ')');
			}
			break;
		} while (false);
	}

	final void method1931(int i, int i_77_, int i_78_) {
		try {
			anInt4280++;
			f_wg = i_77_;
			anInt4324 = i;
			method1950(i_78_);
			method1915((byte) -22);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.C(" + i + ',' + i_77_ + ',' + i_78_ + ')'));
		}
	}

	final void method1744(int i) {
		try {
			method1921(true);
			f_id++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.ID(" + i + ')');
		}
	}

	final void e() {
		try {
			f_nf = ((Class260_Sub2) this).f_vd;
			anInt4192++;
			anInt4373 = 0;
			anInt4337 = ((Class260_Sub2) this).f_tb;
			anInt4386 = 0;
			OpenGL.glDisable(3089);
			method1953(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.e(" + ')');
		}
	}

	final Class210 method1738(int i, int i_79_, int[][] is, int[][] is_80_, int i_81_, int i_82_, int i_83_) {
		try {
			f_kb++;
			return new Class210_Sub2(this, i_82_, i_83_, i, i_79_, is, is_80_, i_81_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.TC(" + i + ',' + i_79_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_80_ != null ? "{...}" : "null") + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ')'));
		}
	}

	private final void method1932(int i) {
		try {
			if (anInt4393 != i) {
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				if (((Class260_Sub2) this).f_vd > 0 && ((Class260_Sub2) this).f_tb > 0)
					OpenGL.glOrtho(0.0, (double) ((Class260_Sub2) this).f_vd, (double) ((Class260_Sub2) this).f_tb, 0.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				anInt4393 = 1;
				f_ch &= ~0x18;
			}
			f_pc++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PA(" + i + ')');
		}
	}

	final void method1728(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, Class128 class128, int i_89_, int i_90_) {
		try {
			anInt4276++;
			Class128_Sub1 class128_sub1 = (Class128_Sub1) class128;
			Class109_Sub1_Sub1 class109_sub1_sub1 = ((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563;
			method1930(false);
			method1905((byte) 78, (((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563));
			method1958(94, i_88_);
			method1912(7681, 8448, true);
			method1945((byte) 79, 0, 768, 34167);
			float f = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6730 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6724));
			float f_91_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6729));
			OpenGL.glColor4ub((byte) (i_87_ >> 16), (byte) (i_87_ >> 8), (byte) i_87_, (byte) (i_87_ >> 24));
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(f * (float) (-i_89_ + i), (float) (i_84_ + -i_90_) * f_91_);
			OpenGL.glVertex2f((float) i + 0.35F, 0.35F + (float) i_84_);
			OpenGL.glTexCoord2f(f * (float) (-i_89_ + i_85_), f_91_ * (float) (i_86_ + -i_90_));
			OpenGL.glVertex2f(0.35F + (float) i_85_, 0.35F + (float) i_86_);
			OpenGL.glEnd();
			method1945((byte) 79, 0, 768, 5890);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.ED(" + i + ',' + i_84_ + ',' + i_85_ + ',' + i_86_ + ',' + i_87_ + ',' + i_88_ + ',' + (class128 != null ? "{...}" : "null") + ',' + i_89_ + ',' + i_90_ + ')'));
		}
	}

	final void AA(int i, int i_92_, int i_93_, int i_94_) {
		try {
			anInt4296++;
			((Class260_Sub2) this).f_sf = i_94_;
			((Class260_Sub2) this).anInt4334 = i;
			((Class260_Sub2) this).anInt4384 = i_93_;
			anInt4331 = i_92_;
			((Class260_Sub2) this).aBool4325 = true;
			f_fe.method1520(-81, false, false, 3);
			((Class236) f_fe).aClass40_Sub9_3317.method2306((byte) -41);
			method1959((byte) -110);
			method1968(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.AA(" + i + ',' + i_92_ + ',' + i_93_ + ',' + i_94_ + ')'));
		}
	}

	final boolean method1700() {
		try {
			f_tc++;
			if (!f_af || method1742() && !aBool4346)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.V(" + ')');
		}
	}

	private final void method1933(int i) {
		try {
			anInt4282++;
			float f = ((float) -((Class260_Sub2) this).f_vf * aFloat4353 / (float) ((Class260_Sub2) this).anInt4366);
			float f_95_ = (aFloat4353 * (float) -((Class260_Sub2) this).anInt4339 / (float) ((Class260_Sub2) this).f_tf);
			if (i != -16933)
				((Class260_Sub2) this).aBool4340 = true;
			float f_96_ = (aFloat4353 * (float) (-((Class260_Sub2) this).f_vf + ((Class260_Sub2) this).f_vd) / (float) ((Class260_Sub2) this).anInt4366);
			float f_97_ = ((float) (-((Class260_Sub2) this).anInt4339 + ((Class260_Sub2) this).f_tb) * aFloat4353 / (float) ((Class260_Sub2) this).f_tf);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			if (f != f_96_ && f_95_ != f_97_)
				OpenGL.glOrtho((double) f, (double) f_96_, (double) -f_97_, (double) -f_95_, (double) (-((Class260_Sub2) this).aFloat4359 + (float) (((Class260_Sub2) this).f_cf)), (double) (-((Class260_Sub2) this).aFloat4359 + (float) (((Class260_Sub2) this).anInt4371)));
			OpenGL.glMatrixMode(5888);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.WF(" + i + ')');
		}
	}

	Class260_Sub2(int i, Canvas canvas, Interface6 interface6, int i_98_, Signlink class52) {
		super(i, interface6);
		((Class260_Sub2) this).f_oe = 8;
		f_ne = false;
		f_te = new Class166();
		f_ue = new Interface4[4];
		anInt4307 = -1;
		anInt4306 = -1;
		anInterface4Array4311 = new Interface4[4];
		anInterface4Array4310 = new Interface4[4];
		anInt4309 = -1;
		new Class217();
		new Class85(16);
		aClass166_4313 = new Class166();
		aClass166_4316 = new Class166();
		aClass166_4317 = new Class166();
		aClass166_4318 = new Class166();
		aClass166_4319 = new Class166();
		aClass166_4320 = new Class166();
		aClass166_4321 = new Class166();
		((Class260_Sub2) this).aFloat4332 = 1.0F;
		((Class260_Sub2) this).anInt4323 = 0;
		f_of = new float[4];
		((Class260_Sub2) this).f_cf = 50;
		anInt4337 = 0;
		anInt4330 = -1;
		f_wf = new Class246_Sub41[Class59_Sub3_Sub3.anInt6283];
		((Class260_Sub2) this).f_sf = 0;
		anInt4331 = -1;
		f_nf = 0;
		((Class260_Sub2) this).f_tf = 512;
		((Class260_Sub2) this).anInt4339 = 0;
		f_bf = new float[16];
		aFloat4326 = 0.0F;
		f_kg = 8448;
		((Class260_Sub2) this).f_mf = 3584.0F;
		f_fg = new float[4];
		((Class260_Sub2) this).f_tg = 1.0F;
		((Class260_Sub2) this).f_vg = -1.0F;
		((Class260_Sub2) this).f_vf = 0;
		aFloat4353 = 1.0F;
		((Class260_Sub2) this).anInt4364 = -1;
		((Class260_Sub2) this).aFloat4343 = 3000.0F;
		f_wg = 0;
		((Class260_Sub2) this).aFloatArray4374 = new float[4];
		((Class260_Sub2) this).anInt4384 = -1;
		aBool4379 = true;
		((Class260_Sub2) this).anInt4377 = -1;
		f_ng = new float[4];
		f_og = 1.0F;
		((Class260_Sub2) this).anInt4371 = 3584;
		((Class260_Sub2) this).aFloat4367 = 1.0F;
		((Class260_Sub2) this).anInt4366 = 512;
		anInt4373 = 0;
		((Class260_Sub2) this).aFloat4352 = -1.0F;
		anInt4350 = 8448;
		anInt4386 = 0;
		((Class260_Sub2) this).aFloat4389 = 3584.0F;
		anInt4324 = 0;
		try {
			f_hb = aCanvas4239 = canvas;
			((Class260_Sub2) this).f_je = i_98_;

			if (!NativeLibraryLoader.loadNative("jaclib"))
				throw new RuntimeException("Cannot invoke jaclib");
			if (!NativeLibraryLoader.loadNative("jaggl"))
				throw new RuntimeException("Cannot invoke jaggl");
			try {

				anOpenGL4207 = new OpenGL();
				f_mc = f_ed = anOpenGL4207.init(canvas, 8, 8, 8, 24, 0, ((Class260_Sub2) this).f_je);
				if (f_ed == 0L)
					throw new RuntimeException("");
				method1896(122);
				int i_99_ = method1974(0);
				if (i_99_ != 0)
					throw new RuntimeException("Its not 0!");
				((Class260_Sub2) this).f_sg = ((Class260_Sub2) this).aBool4392 ? 33639 : 5121;
				if (f_qg.indexOf("radeon") != -1) {
					int i_100_ = 0;
					boolean bool = false;
					boolean bool_101_ = false;
					String[] strings = Class60.method412((byte) 56, f_qg.replace('/', ' '), ' ');
					for (int i_102_ = 0; strings.length > i_102_; i_102_++) {
						String string = strings[i_102_];
						try {
							if (string.length() > 0) {
								if ((string.charAt(0) ^ 0xffffffff) == -121 && string.length() >= 3 && Class48.method323(string.substring(1, 3), 59)) {
									string = string.substring(1);
									bool_101_ = true;
								}
								if (string.equals("hd"))
									bool = true;
								else {
									if (string.startsWith("hd")) {
										bool = true;
										string = string.substring(2);
									}
									if ((string.length() ^ 0xffffffff) <= -5 && (Class48.method323(string.substring(0, 4), 59))) {
										i_100_ = (Class104.method665(string.substring(0, 4), 10));
										break;
									}
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
					if (!bool || (i_100_ ^ 0xffffffff) > -4001)
						((Class260_Sub2) this).aBool4333 = false;
					if (!bool_101_ && !bool) {
						if (i_100_ >= 7000 && i_100_ <= 7999)
							aBool4360 = false;
						if (i_100_ >= 7000 && (i_100_ ^ 0xffffffff) >= -9251)
							((Class260_Sub2) this).aBool4381 = false;
					}
					((Class260_Sub2) this).f_pg &= (anOpenGL4207.a("GL_ARB_half_float_pixel"));
					f_rg = aBool4360;
				}
				if ((aString4355.indexOf("intel") ^ 0xffffffff) != 0)
					((Class260_Sub2) this).aBool4322 = false;
				f_ff = !aString4355.equals("s3 graphics");
				if (aBool4360) {
					try {
						int[] is = new int[1];
						OpenGL.glGenBuffersARB(1, is, 0);
					} catch (Throwable throwable) {
						throw new RuntimeException("");
					}
				}
				Class190.method1244(false, false, true);
				f_ne = true;
				((Class260_Sub2) this).f_ie = new Class47(this, ((Class260) this).anInterface6_3714);
				method1964((byte) 127);
				((Class260_Sub2) this).f_se = new Class37(this);
				f_ee = new Class249(this);
				if (f_ee.method1594(0)) {
					f_ke = new Class246_Sub7_Sub1(this);
					if (!f_ke.method2563(true)) {
						f_ke.method1839((byte) -71);
						f_ke = null;
					}
				}
				f_fe = new Class236(this);
				method1969(128);
				method1909((byte) -128);
				OpenGL.glClear(16640);
				int i_103_ = 0;
				for (;;) {
					try {
						anOpenGL4207.swapBuffers();
						break;
					} catch (Exception exception) {
						if ((i_103_++ ^ 0xffffffff) < -6)
							throw new RuntimeException("");
						Class247.method1580(100L, -5184);
					}
				}
				OpenGL.glClear(16384);
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				method1680();
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.<init>(" + i + ',' + (canvas != null ? "{...}" : "null") + ',' + (interface6 != null ? "{...}" : "null") + ',' + i_98_ + ',' + (class52 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1934(Class160 class160, int i, Class160 class160_104_, Class160 class160_105_, Class160 class160_106_) {
		try {
			if (class160_106_ != null) {
				method1944(((Class160) class160_106_).anInterface10_2264, -121);
				OpenGL.glVertexPointer(((Class160) class160_106_).aByte2268, ((Class160) class160_106_).aShort2269, f_ag.method21(true), (f_ag.method32(12786) + (long) (((Class160) class160_106_).aByte2265)));
				OpenGL.glEnableClientState(32884);
			} else
				OpenGL.glDisableClientState(32884);
			anInt4198++;
			if (class160_104_ != null) {
				method1944(((Class160) class160_104_).anInterface10_2264, -118);
				OpenGL.glNormalPointer(((Class160) class160_104_).aShort2269, f_ag.method21(true), (f_ag.method32(12786) + (long) (((Class160) class160_104_).aByte2265)));
				OpenGL.glEnableClientState(32885);
			} else
				OpenGL.glDisableClientState(32885);
			if (i > 113) {
				if (class160 != null) {
					method1944(((Class160) class160).anInterface10_2264, -106);
					OpenGL.glColorPointer(((Class160) class160).aByte2268, ((Class160) class160).aShort2269, f_ag.method21(true), (f_ag.method32(12786) + (long) (((Class160) class160).aByte2265)));
					OpenGL.glEnableClientState(32886);
				} else
					OpenGL.glDisableClientState(32886);
				if (class160_105_ == null)
					OpenGL.glDisableClientState(32888);
				else {
					method1944(((Class160) class160_105_).anInterface10_2264, -126);
					OpenGL.glTexCoordPointer(((Class160) class160_105_).aByte2268, ((Class160) class160_105_).aShort2269, f_ag.method21(true), (f_ag.method32(12786) - -(long) ((Class160) class160_105_).aByte2265));
					OpenGL.glEnableClientState(32888);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.MD(" + (class160 != null ? "{...}" : "null") + ',' + i + ',' + (class160_104_ != null ? "{...}" : "null") + ',' + (class160_105_ != null ? "{...}" : "null") + ',' + (class160_106_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1679(int i, Class246_Sub41[] class246_sub41s) {
		do {
			try {
				anInt4288++;
				for (int i_107_ = 0; (i ^ 0xffffffff) < (i_107_ ^ 0xffffffff); i_107_++)
					f_wf[i_107_] = class246_sub41s[i_107_];
				f_jf = i;
				if (anInt4393 == 1)
					break;
				method1903(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.EB(" + i + ',' + (class246_sub41s != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1935(boolean bool, Interface4 interface4) {
		try {
			f_od++;
			if (anInt4309 < 0 || anInterface4Array4310[anInt4309] != interface4)
				throw new RuntimeException();
			anInterface4Array4310[anInt4309--] = null;
			if (bool == false) {
				interface4.method11(-53);
				if (anInt4309 >= 0) {
					anInterface4_4308 = anInterface4Array4310[anInt4309];
					anInterface4_4308.method12((byte) 45);
				} else
					anInterface4_4308 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.CG(" + bool + ',' + (interface4 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1685(Class_u class_u) {
		do {
			try {
				anInt4302++;
				((Class260_Sub2) this).f_pe = ((Class_u_Sub1) (Class_u_Sub1) class_u).aNativeHeap5686;
				if (anInterface10_4348 != null)
					break;
				Stream_Sub2 stream_sub2 = new Stream_Sub2(80);
				do {
					if (((Class260_Sub2) this).aBool4392) {
						stream_sub2.method2595(-1.0F, (byte) 98);
						stream_sub2.method2595(-1.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(-1.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(-1.0F, (byte) 98);
						stream_sub2.method2595(1.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						stream_sub2.method2595(0.0F, (byte) 98);
						if (!client.f_ob)
							break;
					}
					stream_sub2.method2591(-1.0F, 1739667504);
					stream_sub2.method2591(-1.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(-1.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(-1.0F, 1739667504);
					stream_sub2.method2591(1.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
					stream_sub2.method2591(0.0F, 1739667504);
				} while (false);
				anInterface10_4348 = method1960(0, ((BufferStream) stream_sub2).position, ((BufferStream) stream_sub2).buffer, false, 20);
				((Class260_Sub2) this).aClass160_4349 = new Class160(anInterface10_4348, 5126, 3, 0);
				((Class260_Sub2) this).aClass160_4342 = new Class160(anInterface10_4348, 5126, 2, 12);
				f_he.method235((byte) 6, this);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.JB(" + (class_u != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final int a() {
		try {
			anInt4230++;
			return ((Class260_Sub2) this).f_cf;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.a(" + ')');
		}
	}

	final void method1936(int i, int i_108_) {
		try {
			if (i_108_ > -117)
				f_ff = false;
			if (i != anInt4357) {
				OpenGL.glActiveTexture(33984 + i);
				anInt4357 = i;
			}
			anInt4227++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.A(" + i + ',' + i_108_ + ')');
		}
	}

	final void l() {
		try {
			((Class260_Sub2) this).aBool4325 = false;
			f_db++;
			f_fe.method1520(-116, false, false, 0);
			method1959((byte) 93);
			method1968(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.l(" + ')');
		}
	}

	final void method1937(float f, byte i) {
		try {
			if (f != aFloat4353) {
				aFloat4353 = f;
				if (anInt4393 == 3)
					method1933(-16933);
			}
			if (i > 94)
				f_mb++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.ND(" + f + ',' + i + ')');
		}
	}

	final Class_c method1730() {
		try {
			f_rd++;
			return f_le;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.TB(" + ')');
		}
	}

	final void method1938(boolean bool, int i, boolean bool_109_) {
		try {
			anInt4233++;
			method1926(bool_109_, (byte) 12, i, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.AD(" + bool + ',' + i + ',' + bool_109_ + ')'));
		}
	}

	final synchronized void method1939(int i, int i_110_, int i_111_) {
		try {
			f_hc++;
			if (i_111_ < -17) {
				IntegerNode class246_sub33 = new IntegerNode(i_110_);
				((Node) class246_sub33).hash = (long) i;
				aClass166_4316.method1101(false, class246_sub33);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.RE(" + i + ',' + i_110_ + ',' + i_111_ + ')'));
		}
	}

	final boolean method1705() {
		try {
			anInt4222++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.MC(" + ')');
		}
	}

	final Class_c method1715() {
		try {
			anInt4301++;
			return new Class_c_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.J(" + ')');
		}
	}

	final void OA(int i, int i_112_, int i_113_, int i_114_) {
		try {
			anInt4218++;
			if (i_112_ < 0)
				i_112_ = 0;
			if (i < 0)
				i = 0;
			if ((i_114_ ^ 0xffffffff) < (((Class260_Sub2) this).f_tb ^ 0xffffffff))
				i_114_ = ((Class260_Sub2) this).f_tb;
			if ((i_113_ ^ 0xffffffff) < (((Class260_Sub2) this).f_vd ^ 0xffffffff))
				i_113_ = ((Class260_Sub2) this).f_vd;
			anInt4373 = i;
			anInt4386 = i_112_;
			f_nf = i_113_;
			anInt4337 = i_114_;
			OpenGL.glEnable(3089);
			method1953(true);
			method1915((byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.OA(" + i + ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ')'));
		}
	}

	final void method1940(byte i, Interface4 interface4) {
		try {
			anInt4187++;
			if ((anInt4309 ^ 0xffffffff) <= -4)
				throw new RuntimeException();
			if (anInt4309 >= 0)
				anInterface4Array4310[anInt4309].method11(-63);
			if (i == 79) {
				anInterface4_4308 = anInterface4Array4310[++anInt4309] = interface4;
				anInterface4_4308.method12((byte) 45);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.TE(" + i + ',' + (interface4 != null ? "{...}" : "null") + ')');
		}
	}

	final synchronized void method1941(boolean bool, int i) {
		try {
			if (bool == true) {
				f_jd++;
				IntegerNode class246_sub33 = new IntegerNode(i);
				aClass166_4318.method1101(!bool, class246_sub33);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.UE(" + bool + ',' + i + ')');
		}
	}

	final void method1942(Class_c_Sub1 class_c_sub1, int i) {
		try {
			OpenGL.glLoadMatrixf(class_c_sub1.method2279(0), 0);
			int i_115_ = -126 / ((i + 67) / 40);
			f_sc++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.OF(" + (class_c_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1943(float f, float f_116_, int i) {
		do {
			try {
				aFloat4326 = f_116_;
				f_og = f;
				anInt4266++;
				if (i == 27060) {
					if (((Class260_Sub2) this).aBool4325)
						break;
					method1959((byte) 70);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.VE(" + f + ',' + f_116_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1686() {
		try {
			anInt4224++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.QB(" + ')');
		}
	}

	final int ZA() {
		try {
			anInt4232++;
			int i = anInt4368;
			anInt4368 = 0;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.ZA(" + ')');
		}
	}

	final void da(int[] is) {
		try {
			is[3] = anInt4337;
			is[2] = f_nf;
			is[0] = anInt4373;
			is[1] = anInt4386;
			anInt4240++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.da(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method1944(Interface10 interface10, int i) {
		do {
			try {
				if (i >= -96)
					((Class260_Sub2) this).aClass_t_Sub1_4387 = null;
				anInt4229++;
				if (interface10 == f_ag)
					break;
				if (aBool4360)
					OpenGL.glBindBufferARB(34962, interface10.method1(60));
				f_ag = interface10;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.WE(" + (interface10 != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final float xa() {
		try {
			anInt4217++;
			return ((Class260_Sub2) this).aFloat4359;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.xa(" + ')');
		}
	}

	final void method1945(byte i, int i_117_, int i_118_, int i_119_) {
		do {
			try {
				f_cd++;
				OpenGL.glTexEnvi(8960, 34176 + i_117_, i_119_);
				OpenGL.glTexEnvi(8960, i_117_ + 34192, i_118_);
				if (i == 79)
					break;
				method1938(false, 66, true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.CF(" + i + ',' + i_117_ + ',' + i_118_ + ',' + i_119_ + ')'));
			}
			break;
		} while (false);
	}

	final Class109_Sub4 method1946(byte i) {
		try {
			anInt4262++;
			if (i < 8)
				aClass166_4316 = null;
			if (f_dh != null)
				return f_dh.method2265(2);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.HF(" + i + ')');
		}
	}

	public static void method1947(int i) {
		try {
			aClass205_4297 = null;
			f_be = null;
			if (i != 1)
				method1972(-83, 57, -113, -74);
			SEND_FRIEND_QUICK_CHAT_PACKET = null;
			anIntArray4277 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.RD(" + i + ')');
		}
	}

	final void method1729(Class211 class211) {
		try {
			f_lc++;
			f_dh = (Class211_Sub1) class211;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PB(" + (class211 != null ? "{...}" : "null") + ')');
		}
	}

	final Class_l method1721(int i, int i_120_, int i_121_, int i_122_, boolean bool) {
		try {
			anInt4241++;
			return new Class_l_Sub2(this, i, i_120_, i_121_, i_122_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.SB(" + i + ',' + i_120_ + ',' + i_121_ + ',' + i_122_ + ',' + bool + ')'));
		}
	}

	final void method1948(int i, Class_c_Sub1 class_c_sub1) {
		try {
			OpenGL.glPushMatrix();
			anInt4283++;
			OpenGL.glMultMatrixf(class_c_sub1.method2279(0), i);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.NF(" + i + ',' + (class_c_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1692() {
		try {
			f_hd++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.AB(" + ')');
		}
	}

	final int w() {
		try {
			anInt4258++;
			int i = f_dg;
			f_dg = 0;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.w(" + ')');
		}
	}

	final void method1949(Interface4 interface4, byte i) {
		try {
			anInt4286++;
			if ((anInt4307 ^ 0xffffffff) > -1 || interface4 != f_ue[anInt4307])
				throw new RuntimeException();
			f_ue[anInt4307--] = null;
			if (i == -45) {
				interface4.method9(14);
				if (anInt4307 < 0)
					f_ve = null;
				else {
					f_ve = f_ue[anInt4307];
					f_ve.method10(i - 20696);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.SD(" + (interface4 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method1950(int i) {
		do {
			try {
				OpenGL.glViewport(f_wg, anInt4324, ((Class260_Sub2) this).f_vd, ((Class260_Sub2) this).f_tb);
				f_ec++;
				if (i == 1)
					break;
				anInt4386 = 94;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.SA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1951(boolean bool, byte i) {
		do {
			try {
				anInt4194++;
				if (i <= 55)
					((Class260_Sub2) this).f_ig = null;
				if (aBool4354 != !bool)
					break;
				do {
					if (bool) {
						OpenGL.glEnable(2929);
						if (!client.f_ob)
							break;
					}
					OpenGL.glDisable(2929);
				} while (false);
				f_ch &= ~0x1f;
				aBool4354 = bool;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.CE(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method1680() {
		do {
			try {
				for (Node class246 = f_te.method1104(73); class246 != null; class246 = f_te.method1108((byte) -112))
					((Class_u_Sub1) class246).method2421(1);
				anInt4195++;
				if (f_ee != null)
					f_ee.method1587(26187);
				if (anOpenGL4207 != null) {
					method1921(true);
					Enumeration enumeration = f_wd.keys();
					while (enumeration.hasMoreElements()) {
						Canvas canvas = (Canvas) enumeration.nextElement();
						Long var_long = (Long) f_wd.get(canvas);
						anOpenGL4207.releaseSurface(canvas, var_long.longValue());
					}
					anOpenGL4207.release();
					anOpenGL4207 = null;
				}
				if (!f_ne)
					break;
				Class246_Sub1_Sub13.method2701(false, 478210754, true);
				f_ne = false;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.QA(" + ')');
			}
			break;
		} while (false);
	}

	final void method1694(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		try {
			anInt4216++;
			OpenGL.glLineWidth((float) i_127_);
			method1743(i, i_123_, i_124_, i_125_, i_126_, i_128_);
			OpenGL.glLineWidth(1.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.CD(" + i + ',' + i_123_ + ',' + i_124_ + ',' + i_125_ + ',' + i_126_ + ',' + i_127_ + ',' + i_128_ + ')'));
		}
	}

	final void method1740(Class_t[] class_ts, Class129 class129, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		try {
			method1748(class_ts, class_c, class130_sub5s, i);
			anInt4260++;
			method1718(class129);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.CB(" + (class_ts != null ? "{...}" : "null") + ',' + (class129 != null ? "{...}" : "null") + ',' + (class_c != null ? "{...}" : "null") + ',' + (class130_sub5s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1688() {
		try {
			anInt4219++;
			try {
				anOpenGL4207.swapBuffers();
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.FB(" + ')');
		}
	}

	final void GA(int i, int i_129_, int i_130_, int i_131_) {
		try {
			f_vc++;
			if (!((Class260_Sub2) this).aBool4325)
				throw new RuntimeException("");
			((Class260_Sub2) this).anInt4334 = i;
			((Class260_Sub2) this).anInt4384 = i_130_;
			anInt4331 = i_129_;
			((Class260_Sub2) this).f_sf = i_131_;
			((Class236) f_fe).aClass40_Sub9_3317.method2306((byte) -41);
			method1959((byte) -117);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.GA(" + i + ',' + i_129_ + ',' + i_130_ + ',' + i_131_ + ')'));
		}
	}

	final void method1714(int i) {
		try {
			anInt4295++;
			method1896(68);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.U(" + i + ')');
		}
	}

	private final void method1952(int i) {
		try {
			f_qb++;
			OpenGL.glLoadIdentity();
			OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			OpenGL.glMultMatrixf(((Class260_Sub2) this).f_hg.method2279(0), i);
			if (((Class260_Sub2) this).aBool4325)
				((Class236) f_fe).aClass40_Sub9_3317.method2306((byte) -41);
			method1914((byte) 66);
			method1903(true);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.LF(" + i + ')');
		}
	}

	private final void method1953(boolean bool) {
		try {
			((Class260_Sub2) this).aFloat4361 = (float) (anInt4337 + -((Class260_Sub2) this).anInt4339);
			anInt4220++;
			((Class260_Sub2) this).f_qf = (float) (-((Class260_Sub2) this).anInt4339 + anInt4386);
			if (bool != true)
				f_fe = null;
			((Class260_Sub2) this).aFloat4344 = (float) (f_nf + -((Class260_Sub2) this).f_vf);
			((Class260_Sub2) this).aFloat4383 = (float) (anInt4373 + -((Class260_Sub2) this).f_vf);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.I(" + bool + ')');
		}
	}

	final void method1954(boolean bool, int i, int i_132_, int i_133_) {
		try {
			if (bool == true) {
				OpenGL.glTexEnvi(8960, 34184 + i_133_, i_132_);
				f_bd++;
				OpenGL.glTexEnvi(8960, 34200 + i_133_, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.SF(" + bool + ',' + i + ',' + i_132_ + ',' + i_133_ + ')'));
		}
	}

	final int IA() {
		try {
			anInt4293++;
			return (anInt4315 + ((Class260_Sub2) this).anInt4312 + ((Class260_Sub2) this).anInt4314);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.IA(" + ')');
		}
	}

	final int method1710(int i, int i_134_) {
		try {
			f_cb++;
			return i_134_ ^ i & i_134_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.AC(" + i + ',' + i_134_ + ')');
		}
	}

	final void ia(int i, int i_135_) {
		try {
			do {
				if (i != ((Class260_Sub2) this).f_cf || ((i_135_ ^ 0xffffffff) != (((Class260_Sub2) this).anInt4371 ^ 0xffffffff))) {
					((Class260_Sub2) this).f_cf = i;
					((Class260_Sub2) this).anInt4371 = i_135_;
					method1923((byte) -119);
					method1959((byte) 59);
					if ((anInt4393 ^ 0xffffffff) == -4) {
						method1933(-16933);
						if (!client.f_ob)
							break;
					}
					if ((anInt4393 ^ 0xffffffff) == -3)
						method1907(107);
				}
			} while (false);
			f_qc++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.ia(" + i + ',' + i_135_ + ')');
		}
	}

	final Interface1 method1955(int i, int i_136_, boolean bool, byte[] is, int i_137_) {
		try {
			anInt4244++;
			if (aBool4360 && (!bool || f_rg))
				return new Class187_Sub1(this, i_137_, is, i_136_, bool);
			if (i < 96)
				GA(81, 32, -65, 64);
			return new Class194_Sub1(this, i_137_, is, i_136_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.MB(" + i + ',' + i_136_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_137_ + ')'));
		}
	}

	final void method1722() {
		try {
			f_sb++;
			if (f_ff && (((Class260_Sub2) this).f_vd ^ 0xffffffff) < -1 && ((Class260_Sub2) this).f_tb > 0) {
				int i = anInt4373;
				int i_138_ = f_nf;
				int i_139_ = anInt4386;
				int i_140_ = anInt4337;
				e();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method1898(true);
				method1918(false, 0);
				method1906(false, -108);
				method1951(false, (byte) 96);
				method1911(-32, false);
				method1905((byte) 78, null);
				method1957(false, -2);
				method1900(7681, 1);
				method1958(-86, 0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, ((Class260_Sub2) this).f_vd, ((Class260_Sub2) this).f_tb, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				OA(i, i_139_, i_138_, i_140_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.JD(" + ')');
		}
	}

	final void method1698(float f, float f_141_, float f_142_) {
		try {
			Class85.aFloat1135 = f_141_;
			Class246_Sub1_Sub2.aFloat5694 = f;
			anInt4251++;
			Class239.aFloat3376 = f_142_;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.KD(" + f + ',' + f_141_ + ',' + f_142_ + ')'));
		}
	}

	final void method1747(int i) {
		try {
			anInt4243++;
			if (i < 128 || (i ^ 0xffffffff) < -1025)
				throw new IllegalArgumentException();
			((Class260_Sub2) this).f_ce = i;
			((Class260_Sub2) this).f_ie.method320(4);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.S(" + i + ')');
		}
	}

	final boolean method1683() {
		try {
			anInt4294++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.NB(" + ')');
		}
	}

	final void method1956(Interface4 interface4, byte i) {
		try {
			anInt4290++;
			if (anInt4307 >= 3)
				throw new RuntimeException();
			if ((anInt4307 ^ 0xffffffff) <= -1)
				f_ue[anInt4307].method9(i ^ 0x35);
			f_ve = f_ue[++anInt4307] = interface4;
			if (i != 54)
				((Class260_Sub2) this).aFloat4352 = -0.41347545F;
			f_ve.method10(-20741);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.RF(" + (interface4 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int YA() {
		try {
			anInt4305++;
			return ((Class260_Sub2) this).anInt4371;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.YA(" + ')');
		}
	}

	final void method1753(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_) {
		do {
			try {
				f_nb++;
				float f = (float) i + 0.35F;
				float f_148_ = (float) i_143_ + 0.35F;
				float f_149_ = (float) i_144_ + f - 1.0F;
				float f_150_ = -1.0F + ((float) i_145_ + f_148_);
				method1977((byte) 127);
				method1958(124, i_147_);
				OpenGL.glColor4ub((byte) (i_146_ >> 16), (byte) (i_146_ >> 8), (byte) i_146_, (byte) (i_146_ >> 24));
				if (f_af)
					OpenGL.glDisable(32925);
				OpenGL.glBegin(2);
				OpenGL.glVertex2f(f, f_148_);
				OpenGL.glVertex2f(f, f_150_);
				OpenGL.glVertex2f(f_149_, f_150_);
				OpenGL.glVertex2f(f_149_, f_148_);
				OpenGL.glEnd();
				if (!f_af)
					break;
				OpenGL.glEnable(32925);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.SC(" + i + ',' + i_143_ + ',' + i_144_ + ',' + i_145_ + ',' + i_146_ + ',' + i_147_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1743(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
		try {
			method1977((byte) -82);
			f_ac++;
			method1958(103, i_155_);
			OpenGL.glColor4ub((byte) (i_154_ >> 16), (byte) (i_154_ >> 8), (byte) i_154_, (byte) (i_154_ >> 24));
			OpenGL.glBegin(1);
			OpenGL.glVertex2f((float) i + 0.35F, (float) i_151_ + 0.35F);
			OpenGL.glVertex2f(0.35F + (float) i_152_, (float) i_153_ + 0.35F);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.BC(" + i + ',' + i_151_ + ',' + i_152_ + ',' + i_153_ + ',' + i_154_ + ',' + i_155_ + ')'));
		}
	}

	final void method1957(boolean bool, int i) {
		do {
			try {
				anInt4246++;
				method1938(true, i, true);
				if (bool == false)
					break;
				method1740(null, null, null, null, 23);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.BG(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method1958(int i, int i_156_) {
		try {
			anInt4184++;
			if (f_eg != i_156_) {
				boolean bool;
				int i_157_;
				boolean bool_158_;
				if (i_156_ != 1) {
					if (i_156_ != 2) {
						if (i_156_ != 128) {
							i_157_ = 0;
							bool = false;
							bool_158_ = true;
						} else {
							i_157_ = 3;
							bool = true;
							bool_158_ = true;
						}
					} else {
						bool = false;
						i_157_ = 2;
						bool_158_ = true;
					}
				} else {
					bool = true;
					i_157_ = 1;
					bool_158_ = true;
				}
				if (bool_158_ != f_df) {
					OpenGL.glColorMask(bool_158_, bool_158_, bool_158_, true);
					f_df = bool_158_;
				}
				if (!bool == f_ah) {
					if (bool)
						OpenGL.glEnable(3008);
					else
						OpenGL.glDisable(3008);
					f_ah = bool;
				}
				if (i_157_ != anInt4380) {
					if (i_157_ == 1) {
						OpenGL.glEnable(3042);
						OpenGL.glBlendFunc(770, 771);
					} else if ((i_157_ ^ 0xffffffff) != -3) {
						if ((i_157_ ^ 0xffffffff) != -4)
							OpenGL.glDisable(3042);
						else {
							OpenGL.glEnable(3042);
							OpenGL.glBlendFunc(774, 1);
						}
					} else {
						OpenGL.glEnable(3042);
						OpenGL.glBlendFunc(1, 1);
					}
					anInt4380 = i_157_;
				}
				f_ch &= ~0x1c;
				f_eg = i_156_;
			}
			int i_159_ = 8 % ((32 - i) / 60);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.PD(" + i + ',' + i_156_ + ')');
		}
	}

	final void ca(int i, Class128 class128, int i_160_, int i_161_) {
		try {
			anInt4273++;
			Class128_Sub1 class128_sub1 = (Class128_Sub1) class128;
			Class109_Sub1_Sub1 class109_sub1_sub1 = ((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563;
			method1930(false);
			method1905((byte) 78, (((Class128_Sub1) class128_sub1).aClass109_Sub1_Sub1_5563));
			method1958(-62, 1);
			method1912(7681, 8448, true);
			method1945((byte) 79, 0, 768, 34167);
			float f = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6730 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6724));
			float f_162_ = (((Class109_Sub1_Sub1) class109_sub1_sub1).aFloat6727 / (float) (((Class109_Sub1_Sub1) class109_sub1_sub1).anInt6729));
			OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f((float) (-i_160_ + anInt4373) * f, (float) (-i_161_ + anInt4386) * f_162_);
			OpenGL.glVertex2i(anInt4373, anInt4386);
			OpenGL.glTexCoord2f(f * (float) (anInt4373 - i_160_), (float) (anInt4337 + -i_161_) * f_162_);
			OpenGL.glVertex2i(anInt4373, anInt4337);
			OpenGL.glTexCoord2f(f * (float) (f_nf + -i_160_), f_162_ * (float) (anInt4337 + -i_161_));
			OpenGL.glVertex2i(f_nf, anInt4337);
			OpenGL.glTexCoord2f((float) (-i_160_ + f_nf) * f, (float) (-i_161_ + anInt4386) * f_162_);
			OpenGL.glVertex2i(f_nf, anInt4386);
			OpenGL.glEnd();
			method1945((byte) 79, 0, 768, 5890);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.ca(" + i + ',' + (class128 != null ? "{...}" : "null") + ',' + i_160_ + ',' + i_161_ + ')'));
		}
	}

	private final void method1959(byte i) {
		do {
			try {
				f_wb++;
				int i_163_ = 7 % ((i + 57) / 50);
				int i_164_;
				do {
					if (((Class260_Sub2) this).aBool4325) {
						OpenGL.glFogf(2915, 0.0F);
						OpenGL.glFogf(2916, 1.0F);
						i_164_ = anInt4331;
						if (!client.f_ob)
							break;
					}
					aFloat4388 = (-aFloat4326 + (float) (((Class260_Sub2) this).anInt4371 + -((Class260_Sub2) this).anInt4323));
					((Class260_Sub2) this).f_gf = (-((float) ((Class260_Sub2) this).anInt4377 * f_og) + aFloat4388);
					if ((float) ((Class260_Sub2) this).f_cf > ((Class260_Sub2) this).f_gf)
						((Class260_Sub2) this).f_gf = (float) ((Class260_Sub2) this).f_cf;
					OpenGL.glFogf(2915, ((Class260_Sub2) this).f_gf);
					OpenGL.glFogf(2916, aFloat4388);
					i_164_ = ((Class260_Sub2) this).anInt4364;
				} while (false);
				Class246_Sub38.aFloatArray5446[1] = (float) PacketsDecoder.method184(i_164_, 65280) / 65280.0F;
				Class246_Sub38.aFloatArray5446[0] = ((float) PacketsDecoder.method184(i_164_, 16711680) / 1.671168E7F);
				Class246_Sub38.aFloatArray5446[2] = (float) PacketsDecoder.method184(i_164_, 255) / 255.0F;
				OpenGL.glFogfv(2918, Class246_Sub38.aFloatArray5446, 0);
				if (!((Class260_Sub2) this).aBool4325)
					break;
				((Class236) f_fe).aClass40_Sub9_3317.method2305(126);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface10 method1960(int i, int i_165_, byte[] is, boolean bool, int i_166_) {
		try {
			anInt4208++;
			if (i != 0)
				return null;
			if (aBool4360 && (!bool || f_rg))
				return new Class187_Sub2(this, i_166_, is, i_165_, bool);
			return new Class194_Sub2(this, i_166_, is, i_165_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.LA(" + i + ',' + i_165_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + i_166_ + ')'));
		}
	}

	private final void method1961(boolean bool) {
		do {
			try {
				anInt4274++;
				Class246_Sub38.aFloatArray5446[2] = (((Class260_Sub2) this).f_gg * ((Class260_Sub2) this).aFloat4367);
				Class246_Sub38.aFloatArray5446[1] = (((Class260_Sub2) this).aFloat4332 * ((Class260_Sub2) this).f_gg);
				Class246_Sub38.aFloatArray5446[3] = 1.0F;
				Class246_Sub38.aFloatArray5446[0] = (((Class260_Sub2) this).f_tg * ((Class260_Sub2) this).f_gg);
				OpenGL.glLightModelfv(2899, Class246_Sub38.aFloatArray5446, 0);
				if (bool == true)
					break;
				aClass166_4319 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.RA(" + bool + ')');
			}
			break;
		} while (false);
	}

	final int method1962(int i, int i_167_) {
		try {
			anInt4303++;
			if (i == i_167_)
				return 7681;
			if (i_167_ != 0) {
				if (i_167_ != 2) {
					if ((i_167_ ^ 0xffffffff) != -4) {
						if ((i_167_ ^ 0xffffffff) == -5)
							return 34023;
					} else
						return 260;
				} else
					return 34165;
			} else
				return 8448;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.JC(" + i + ',' + i_167_ + ')');
		}
	}

	final void method1748(Class_t[] class_ts, Class_c class_c, Class130_Sub5[] class130_sub5s, int i) {
		try {
			anInt4254++;
			for (int i_168_ = 0; (i_168_ ^ 0xffffffff) > (class_ts.length ^ 0xffffffff); i_168_++) {
				if (class_ts[i_168_] != null)
					class_ts[i_168_].method680(class_c, (class130_sub5s != null ? class130_sub5s[i_168_] : null), i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.IC(" + (class_ts != null ? "{...}" : "null") + ',' + (class_c != null ? "{...}" : "null") + ',' + (class130_sub5s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class116 method1716(Class73 class73, Class10[] class10s, boolean bool) {
		try {
			f_eb++;
			return new Class116_Sub2(this, class73, class10s, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.Q(" + (class73 != null ? "{...}" : "null") + ',' + (class10s != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method1677() {
		do {
			try {
				anInt4268++;
				if (f_ke == null || !f_ke.method1836((byte) 121))
					break;
				f_ee.method1592(-108, f_ke);
				((Class260_Sub2) this).f_ie.method320(4);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.CA(" + ')');
			}
			break;
		} while (false);
	}

	final void B(float f) {
		do {
			try {
				anInt4270++;
				if (((Class260_Sub2) this).f_gg == f)
					break;
				((Class260_Sub2) this).f_gg = f;
				method1961(true);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.B(" + f + ')');
			}
			break;
		} while (false);
	}

	final void method1690(Canvas canvas) {
		do {
			try {
				f_nc++;
				if (aCanvas4239 == canvas)
					throw new RuntimeException();
				if (f_wd.containsKey(canvas))
					break;
				if (!canvas.isShowing())
					throw new RuntimeException();
				try {
					Class var_class = Class.forName("java.awt.Canvas");
					Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
					method.invoke(canvas, new Object[] { Boolean.TRUE });
				} catch (Exception exception) {
					/* empty */
				}
				long l = anOpenGL4207.prepareSurface(canvas);
				if (l == -1L)
					throw new RuntimeException();
				f_wd.put(canvas, new Long(l));
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.WC(" + (canvas != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	private final void method1963(byte i, float f, float f_169_, float f_170_) {
		try {
			if (i != -62)
				f_nf = 61;
			f_bb++;
			OpenGL.glMatrixMode(5890);
			if (aBool4362)
				OpenGL.glLoadIdentity();
			OpenGL.glTranslatef(f_169_, f, f_170_);
			OpenGL.glMatrixMode(5888);
			aBool4362 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.DF(" + i + ',' + f + ',' + f_169_ + ',' + f_170_ + ')'));
		}
	}

	final void UA(int i, int i_171_, int i_172_) {
		try {
			if (((((Class260_Sub2) this).anInt4364 ^ 0xffffffff) != (i ^ 0xffffffff)) || i_171_ != ((Class260_Sub2) this).anInt4377 || i_172_ != ((Class260_Sub2) this).anInt4323) {
				((Class260_Sub2) this).anInt4323 = i_172_;
				((Class260_Sub2) this).anInt4364 = i;
				((Class260_Sub2) this).anInt4377 = i_171_;
				if (!((Class260_Sub2) this).aBool4325) {
					method1959((byte) 45);
					method1968(true);
				}
			}
			f_nd++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.UA(" + i + ',' + i_171_ + ',' + i_172_ + ')'));
		}
	}

	final void DA(int i, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, byte[] is, int i_178_, int i_179_) {
		try {
			f_pb++;
			float f;
			float f_180_;
			do {
				if (aClass109_Sub1_Sub1_4347 == null || (((Class109_Sub1) aClass109_Sub1_Sub1_4347).anInt3760 ^ 0xffffffff) > (i_174_ ^ 0xffffffff) || (((Class109_Sub1) aClass109_Sub1_Sub1_4347).anInt3752 < i_175_)) {
					aClass109_Sub1_Sub1_4347 = Class18.method176(false, (byte) -116, is, this, i_174_, i_175_, 6406, 6406);
					aClass109_Sub1_Sub1_4347.method1767(10497, false, false);
					f = (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4347).aFloat6727);
					f_180_ = (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4347).aFloat6730);
					if (!client.f_ob)
						break;
				}
				aClass109_Sub1_Sub1_4347.method1762(i_174_, 0, is, i_175_, 6406, 0, 0, 0, false, 66);
				f_180_ = ((float) i_174_ * (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4347).aFloat6730) / (float) (((Class109_Sub1) aClass109_Sub1_Sub1_4347).anInt3760));
				f = ((float) i_175_ * (((Class109_Sub1_Sub1) aClass109_Sub1_Sub1_4347).aFloat6727) / (float) (((Class109_Sub1) aClass109_Sub1_Sub1_4347).anInt3752));
			} while (false);
			method1930(false);
			method1905((byte) 78, aClass109_Sub1_Sub1_4347);
			method1958(117, i_179_);
			OpenGL.glColor4ub((byte) (i_176_ >> 16), (byte) (i_176_ >> 8), (byte) i_176_, (byte) (i_176_ >> 24));
			method1901((byte) -100, i_177_);
			method1912(34165, 34165, true);
			method1945((byte) 79, 0, 768, 34166);
			method1945((byte) 79, 2, 770, 5890);
			method1954(true, 770, 34166, 0);
			method1954(true, 770, 5890, 2);
			float f_181_ = (float) i;
			float f_182_ = (float) i_173_;
			float f_183_ = f_181_ + (float) i_174_;
			OpenGL.glBegin(7);
			float f_184_ = (float) i_175_ + f_182_;
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2f(f_181_, f_182_);
			OpenGL.glTexCoord2f(0.0F, f_180_);
			OpenGL.glVertex2f(f_181_, f_184_);
			OpenGL.glTexCoord2f(f, f_180_);
			OpenGL.glVertex2f(f_183_, f_184_);
			OpenGL.glTexCoord2f(f, 0.0F);
			OpenGL.glVertex2f(f_183_, f_182_);
			OpenGL.glEnd();
			method1945((byte) 79, 0, 768, 5890);
			method1945((byte) 79, 2, 770, 34166);
			method1954(true, 770, 5890, 0);
			method1954(true, 770, 34166, 2);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.DA(" + i + ',' + i_173_ + ',' + i_174_ + ',' + i_175_ + ',' + i_176_ + ',' + i_177_ + ',' + (is != null ? "{...}" : "null") + ',' + i_178_ + ',' + i_179_ + ')'));
		}
	}

	final void MA(int i) {
		try {
			((Class260_Sub2) this).f_re = 0;
			anInt4203++;
			while ((i ^ 0xffffffff) < -2) {
				i >>= 1;
				((Class260_Sub2) this).f_re++;
			}
			((Class260_Sub2) this).f_oe = 1 << ((Class260_Sub2) this).f_re;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.MA(" + i + ')');
		}
	}

	final Class246_Sub41 method1751(int i, int i_185_, int i_186_, int i_187_, int i_188_, float f) {
		try {
			anInt4261++;
			return new Class246_Sub41_Sub1(i, i_185_, i_186_, i_187_, i_188_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.M(" + i + ',' + i_185_ + ',' + i_186_ + ',' + i_187_ + ',' + i_188_ + ',' + f + ')'));
		}
	}

	final void TA(int i, int i_189_, int i_190_, int i_191_, int i_192_) {
		try {
			anInt4298++;
			method1977((byte) 125);
			method1958(-35, i_192_);
			float f = 0.35F + (float) i;
			float f_193_ = 0.35F + (float) i_189_;
			OpenGL.glColor4ub((byte) (i_191_ >> 16), (byte) (i_191_ >> 8), (byte) i_191_, (byte) (i_191_ >> 24));
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(f, f_193_);
			OpenGL.glVertex2f(f, f_193_ + (float) i_190_);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.TA(" + i + ',' + i_189_ + ',' + i_190_ + ',' + i_191_ + ',' + i_192_ + ')'));
		}
	}

	private final void method1964(byte i) {
		do {
			try {
				((Class260_Sub2) this).f_hg = new Class_c_Sub1();
				f_fd++;
				((Class260_Sub2) this).f_bg = new Class_c_Sub1();
				aClass109Array4365 = new Class109[((Class260_Sub2) this).f_mg];
				((Class260_Sub2) this).aClass109_Sub1_4370 = new Class109_Sub1(this, 3553, 6408, 1, 1);
				((Class260_Sub2) this).aClass109_Sub1_4338 = new Class109_Sub1(this, 3553, 6408, 1, 1);
				((Class260_Sub2) this).f_pf = new Class109_Sub1(this, 3553, 6408, 1, 1);
				((Class260_Sub2) this).f_lg = new Class_t_Sub1(this);
				((Class260_Sub2) this).f_rf = new Class_t_Sub1(this);
				((Class260_Sub2) this).aClass_t_Sub1_4372 = new Class_t_Sub1(this);
				((Class260_Sub2) this).f_ef = new Class_t_Sub1(this);
				((Class260_Sub2) this).f_ug = new Class_t_Sub1(this);
				((Class260_Sub2) this).aClass_t_Sub1_4328 = new Class_t_Sub1(this);
				((Class260_Sub2) this).f_ig = new Class_t_Sub1(this);
				if (i <= 94)
					f_dh = null;
				((Class260_Sub2) this).aClass_t_Sub1_4387 = new Class_t_Sub1(this);
				((Class260_Sub2) this).f_jg = new Class_t_Sub1(this);
				((Class260_Sub2) this).aClass_t_Sub1_4336 = new Class_t_Sub1(this);
				if (!((Class260_Sub2) this).aBool4322)
					break;
				((Class260_Sub2) this).aClass134_4378 = new Class134(this);
				((Class260_Sub2) this).aClass134_4363 = new Class134(this);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.BF(" + i + ')');
			}
			break;
		} while (false);
	}

	final void b(int i, int i_194_, int i_195_, int i_196_, int i_197_) {
		try {
			method1977((byte) -29);
			f_fb++;
			method1958(-44, i_197_);
			float f = (float) i + 0.35F;
			OpenGL.glColor4ub((byte) (i_196_ >> 16), (byte) (i_196_ >> 8), (byte) i_196_, (byte) (i_196_ >> 24));
			float f_198_ = (float) i_194_ + 0.35F;
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(f, f_198_);
			OpenGL.glVertex2f((float) i_195_ + f, f_198_);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.b(" + i + ',' + i_194_ + ',' + i_195_ + ',' + i_196_ + ',' + i_197_ + ')'));
		}
	}

	final void method1965(byte i) {
		try {
			if (i != 126)
				aClass109_Sub1_Sub1_4347 = null;
			anInt4257++;
			OpenGL.glPushMatrix();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.BE(" + i + ')');
		}
	}

	final void method1966(boolean bool, boolean bool_199_) {
		try {
			if (bool_199_ == false) {
				if (!aBool4351 == bool) {
					aBool4351 = bool;
					method1919(0);
				}
				f_jb++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.LD(" + bool + ',' + bool_199_ + ')');
		}
	}

	final void method1967(int i, int i_200_, int i_201_, Interface1 interface1, byte i_202_) {
		try {
			if (i_202_ != -95)
				method1718(null);
			f_td++;
			int i_203_ = interface1.method4((byte) -126);
			i *= method1897(i_203_, 127);
			method1970(-21, interface1);
			OpenGL.glDrawElements(i_201_, i_200_, i_203_, (long) i + interface1.method3((byte) -122));
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.GF(" + i + ',' + i_200_ + ',' + i_201_ + ',' + (interface1 != null ? "{...}" : "null") + ',' + i_202_ + ')'));
		}
	}

	final void method1750(boolean bool) {
		try {
			aBool4379 = bool;
			f_bc++;
			method1976(0);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.N(" + bool + ')');
		}
	}

	private final void method1968(boolean bool) {
		do {
			try {
				anInt4196++;
				do {
					if (!f_lf || !(((Class260_Sub2) this).anInt4377 >= 0 | ((Class260_Sub2) this).aBool4325)) {
						OpenGL.glDisable(2912);
						if (!client.f_ob)
							break;
					}
					OpenGL.glEnable(2912);
				} while (false);
				if (bool == true)
					break;
				f_kf = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.UF(" + bool + ')');
			}
			break;
		} while (false);
	}

	final boolean JA(int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_) {
		try {
			anInt4234++;
			float f = (((float) i_205_ * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5363) + ((float) i_204_ * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5378 + (float) i * ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5386) + ((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5362);
			if (f < 1.0F)
				f = 1.0F;
			float f_209_ = (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5362 + ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5386 * (float) i_206_) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5378) * (float) i_207_ + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5363) * (float) i_208_));
			if (f_209_ < 1.0F)
				f_209_ = 1.0F;
			if (((float) ((Class260_Sub2) this).f_cf > f && (float) ((Class260_Sub2) this).f_cf > f_209_) || (f > (float) ((Class260_Sub2) this).anInt4371 && f_209_ > (float) ((Class260_Sub2) this).anInt4371))
				return false;
			int i_210_ = (int) ((float) ((Class260_Sub2) this).anInt4366 * ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5372) * (float) i + ((float) i_204_ * (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5387)) + ((float) i_205_ * (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5388)) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5393)) / f);
			int i_211_ = (int) ((float) ((Class260_Sub2) this).anInt4366 * ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5372) * (float) i_206_ + ((float) i_207_ * (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5387)) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5388) * (float) i_208_ + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5393)) / f_209_);
			if (((float) i_210_ < ((Class260_Sub2) this).aFloat4383 && (float) i_211_ < ((Class260_Sub2) this).aFloat4383) || (((Class260_Sub2) this).aFloat4344 < (float) i_210_ && ((Class260_Sub2) this).aFloat4344 < (float) i_211_))
				return false;
			int i_212_ = (int) (((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5367) * (float) i_205_ + ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5364) * (float) i + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5382) * (float) i_204_) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5385)) * (float) ((Class260_Sub2) this).f_tf / f);
			int i_213_ = (int) ((float) ((Class260_Sub2) this).f_tf * ((((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5367) * (float) i_208_ + (((float) i_206_ * (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5364)) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5382) * (float) i_207_) + (((Class_c_Sub1) ((Class260_Sub2) this).f_hg).aFloat5385)) / f_209_);
			if (((float) i_212_ < ((Class260_Sub2) this).f_qf && ((Class260_Sub2) this).f_qf > (float) i_213_) || ((float) i_212_ > ((Class260_Sub2) this).aFloat4361 && (float) i_213_ > ((Class260_Sub2) this).aFloat4361))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.JA(" + i + ',' + i_204_ + ',' + i_205_ + ',' + i_206_ + ',' + i_207_ + ',' + i_208_ + ')'));
		}
	}

	private final void method1969(int i) {
		try {
			method1957(false, -2);
			f_jc++;
			for (int i_214_ = ((Class260_Sub2) this).f_mg - 1; i_214_ >= 0; i_214_--) {
				method1936(i_214_, -120);
				method1905((byte) 78, null);
				OpenGL.glTexEnvi(8960, 8704, 34160);
			}
			method1912(8448, 8448, true);
			method1945((byte) 79, 2, 770, 34168);
			method1917(0);
			f_eg = 1;
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
			anInt4380 = 1;
			OpenGL.glEnable(3008);
			OpenGL.glAlphaFunc(516, 0.0F);
			f_ah = true;
			OpenGL.glColorMask(true, true, true, true);
			f_df = true;
			method1918(true, 0);
			method1906(true, i ^ 0xf8);
			method1951(true, (byte) 79);
			method1911(-32, true);
			method1898(true);
			anOpenGL4207.setSwapInterval(0);
			OpenGL.glShadeModel(7425);
			OpenGL.glClearDepth(1.0F);
			OpenGL.glDepthFunc(515);
			OpenGL.glPolygonMode(1028, 6914);
			OpenGL.glEnable(2884);
			OpenGL.glCullFace(1029);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glColorMaterial(1028, 5634);
			OpenGL.glEnable(2903);
			float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
			for (int i_215_ = 0; (i_215_ ^ 0xffffffff) > -9; i_215_++) {
				int i_216_ = i_215_ + 16384;
				OpenGL.glLightfv(i_216_, 4608, fs, 0);
				OpenGL.glLightf(i_216_, 4615, 0.0F);
				OpenGL.glLightf(i_216_, 4616, 0.0F);
			}
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
			if (i != 128)
				((Class260_Sub2) this).f_lg = null;
			OpenGL.glFogf(2914, 0.95F);
			OpenGL.glFogi(2917, 9729);
			OpenGL.glHint(3156, 4353);
			anInt4330 = ((Class260_Sub2) this).anInt4364 = -1;
			e();
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.DE(" + i + ')');
		}
	}

	final void method1970(int i, Interface1 interface1) {
		do {
			try {
				if (f_kf != interface1) {
					if (aBool4360)
						OpenGL.glBindBufferARB(34963, interface1.method1(-2584));
					f_kf = interface1;
				}
				anInt4228++;
				if (i <= -13)
					break;
				method1706(null, 88, 58, 83, -10);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.JE(" + i + ',' + (interface1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1717(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_) {
		try {
			anInt4253++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.RC(" + i + ',' + i_217_ + ',' + i_218_ + ',' + i_219_ + ',' + i_220_ + ',' + i_221_ + ',' + i_222_ + ',' + i_223_ + ',' + i_224_ + ',' + i_225_ + ')'));
		}
	}

	final void method1718(Class129 class129) {
		try {
			f_he.method234((byte) -9, class129, this);
			anInt4225++;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.OC(" + (class129 != null ? "{...}" : "null") + ')');
		}
	}

	final void method1971(Interface4 interface4, int i) {
		try {
			int i_226_ = -38 / ((i + 48) / 36);
			f_qd++;
			if (!((Class260_Sub2) this).aBool4358) {
				if (anInt4306 < 0 || interface4 != anInterface4Array4311[anInt4306])
					throw new RuntimeException();
				anInterface4Array4311[anInt4306--] = null;
				interface4.method8(-123);
				if (anInt4306 >= 0) {
					anInterface4_4308 = f_ve = anInterface4Array4311[anInt4306];
					anInterface4_4308.method7((byte) 84);
				} else
					anInterface4_4308 = f_ve = null;
			} else {
				method1935(false, interface4);
				method1949(interface4, (byte) -45);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.QE(" + (interface4 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class_l method1706(int[] is, int i, int i_227_, int i_228_, int i_229_) {
		try {
			anInt4221++;
			return new Class_l_Sub2(this, i_228_, i_229_, is, i, i_227_);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.LC(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_227_ + ',' + i_228_ + ',' + i_229_ + ')'));
		}
	}

	final int[] F(int i, int i_230_, int i_231_, int i_232_) {
		try {
			anInt4206++;
			int[] is = new int[i_231_ * i_232_];
			for (int i_233_ = 0; i_232_ > i_233_; i_233_++)
				OpenGL.glReadPixelsi(i, (-i_233_ + ((Class260_Sub2) this).f_tb + -i_230_), i_231_, 1, 32993, ((Class260_Sub2) this).f_sg, is, i_233_ * i_231_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.F(" + i + ',' + i_230_ + ',' + i_231_ + ',' + i_232_ + ')'));
		}
	}

	final Class_l method1749(Class10 class10, boolean bool) {
		try {
			anInt4287++;
			int[] is = new int[(((Class10) class10).anInt155 * ((Class10) class10).anInt156)];
			int i = 0;
			int i_234_ = 0;
			if (((Class10) class10).aByteArray161 == null) {
				for (int i_235_ = 0; ((i_235_ ^ 0xffffffff) > (((Class10) class10).anInt155 ^ 0xffffffff)); i_235_++) {
					for (int i_236_ = 0; ((Class10) class10).anInt156 > i_236_; i_236_++) {
						int i_237_ = (((Class10) class10).anIntArray160[(((Class10) class10).aByteArray157[i++] & 0xff)]);
						is[i_234_++] = ((i_237_ ^ 0xffffffff) == -1 ? 0 : Class236.method1523(i_237_, -16777216));
					}
				}
			} else {
				for (int i_238_ = 0; ((((Class10) class10).anInt155 ^ 0xffffffff) < (i_238_ ^ 0xffffffff)); i_238_++) {
					for (int i_239_ = 0; ((Class10) class10).anInt156 > i_239_; i_239_++) {
						is[i_234_++] = (Class236.method1523(((Class10) class10).aByteArray161[i] << 24, (((Class10) class10).anIntArray160[PacketsDecoder.method184(255, (((Class10) class10).aByteArray157[i]))])));
						i++;
					}
				}
			}
			Class_l class_l = method1706(is, 0, ((Class10) class10).anInt156, ((Class10) class10).anInt156, ((Class10) class10).anInt155);
			class_l.MA(((Class10) class10).anInt158, ((Class10) class10).anInt162, ((Class10) class10).anInt159, ((Class10) class10).anInt163);
			return class_l;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.P(" + (class10 != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final boolean method1699() {
		try {
			anInt4285++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.KC(" + ')');
		}
	}

	static final int method1972(int i, int i_240_, int i_241_, int i_242_) {
		try {
			f_lb++;
			int i_243_ = i_242_ / i_240_;
			int i_244_ = -1 + i_240_ & i_242_;
			int i_245_ = i_241_ / i_240_;
			int i_246_ = i_241_ & i_240_ - 1;
			int i_247_ = Class53.method368(-35, i_243_, i_245_);
			int i_248_ = Class53.method368(-64, 1 + i_243_, i_245_);
			int i_249_ = Class53.method368(63, i_243_, 1 + i_245_);
			int i_250_ = Class53.method368(-125, 1 + i_243_, 1 + i_245_);
			int i_251_ = Class246_Sub22.method2083(i_244_, i_240_, i_247_, i_248_, (byte) -79);
			int i_252_ = Class246_Sub22.method2083(i_244_, i_240_, i_249_, i_250_, (byte) -79);
			if (i >= -60)
				anIntArray4277 = null;
			return Class246_Sub22.method2083(i_246_, i_240_, i_251_, i_252_, (byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.FF(" + i + ',' + i_240_ + ',' + i_241_ + ',' + i_242_ + ')'));
		}
	}

	final synchronized void method1973(int i, long l) {
		do {
			try {
				anInt4231++;
				Node class246 = new Node();
				((Node) class246).hash = l;
				aClass166_4321.method1101(false, class246);
				if (i == -34844)
					break;
				f_ke = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.KF(" + i + ',' + l + ')');
			}
			break;
		} while (false);
	}

	final void H(int i, int i_253_, int i_254_, int i_255_) {
		do {
			try {
				((Class260_Sub2) this).f_tf = i_255_;
				((Class260_Sub2) this).anInt4339 = i_253_;
				((Class260_Sub2) this).anInt4366 = i_254_;
				f_vb++;
				((Class260_Sub2) this).f_vf = i;
				method1923((byte) -91);
				method1953(true);
				if ((anInt4393 ^ 0xffffffff) == -4)
					method1933(-16933);
				else {
					if (anInt4393 != 2)
						break;
					method1907(111);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("fd.H(" + i + ',' + i_253_ + ',' + i_254_ + ',' + i_255_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method1693() {
		try {
			anInt4278++;
			if (f_ke == null || ((((Class260_Sub2) this).f_je ^ 0xffffffff) < -2 && !aBool4346))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.HD(" + ')');
		}
	}

	private final int method1974(int i) {
		try {
			anInt4275++;
			int i_256_ = i;
			aString4355 = OpenGL.glGetString(7936).toLowerCase();
			f_qg = OpenGL.glGetString(7937).toLowerCase();
			if ((aString4355.indexOf("microsoft") ^ 0xffffffff) != 0)
				i_256_ |= 0x1;
			if (aString4355.indexOf("brian paul") != -1 || (aString4355.indexOf("mesa") ^ 0xffffffff) != 0)
				i_256_ |= 0x1;
			String string = OpenGL.glGetString(7938);
			String[] strings = Class60.method412((byte) 5, string.replace('.', ' '), ' ');
			do {
				if (strings.length < 2) {
					i_256_ |= 0x4;
					if (!client.f_ob)
						break;
				}
				try {
					int i_257_ = Class104.method665(strings[0], 10);
					int i_258_ = Class104.method665(strings[1], 10);
					anInt4356 = 10 * i_257_ + i_258_;
				} catch (NumberFormatException numberformatexception) {
					i_256_ |= 0x4;
				}
			} while (false);
			if (anInt4356 < 12)
				i_256_ |= 0x2;
			if (!anOpenGL4207.a("GL_ARB_multitexture"))
				i_256_ |= 0x8;
			if (!anOpenGL4207.a("GL_ARB_texture_env_combine"))
				i_256_ |= 0x20;
			int[] is = new int[1];
			OpenGL.glGetIntegerv(34018, is, 0);
			((Class260_Sub2) this).f_mg = is[0];
			OpenGL.glGetIntegerv(34929, is, 0);
			anInt4345 = is[0];
			OpenGL.glGetIntegerv(34930, is, 0);
			anInt4329 = is[0];
			if ((((Class260_Sub2) this).f_mg ^ 0xffffffff) > -3 || (anInt4345 ^ 0xffffffff) > -3 || anInt4329 < 2)
				i_256_ |= 0x10;
			((Class260_Sub2) this).aBool4392 = Stream.a();
			anOpenGL4207.arePbuffersAvailable();
			aBool4360 = anOpenGL4207.a("GL_ARB_vertex_buffer_object");
			f_af = anOpenGL4207.a("GL_ARB_multisample");
			((Class260_Sub2) this).f_uf = anOpenGL4207.a("GL_ARB_vertex_program");
			anOpenGL4207.a("GL_ARB_fragment_program");
			((Class260_Sub2) this).f_bh = anOpenGL4207.a("GL_ARB_vertex_shader");
			((Class260_Sub2) this).aBool4391 = anOpenGL4207.a("GL_ARB_fragment_shader");
			((Class260_Sub2) this).aBool4381 = anOpenGL4207.a("GL_EXT_texture3D");
			((Class260_Sub2) this).f_pg = anOpenGL4207.a("GL_ARB_texture_rectangle");
			((Class260_Sub2) this).aBool4340 = anOpenGL4207.a("GL_ARB_texture_cube_map");
			((Class260_Sub2) this).aBool4333 = anOpenGL4207.a("GL_ARB_texture_float");
			((Class260_Sub2) this).aBool4385 = false;
			((Class260_Sub2) this).aBool4322 = anOpenGL4207.a("GL_EXT_framebuffer_object");
			((Class260_Sub2) this).aBool4358 = anOpenGL4207.a("GL_EXT_framebuffer_blit");
			((Class260_Sub2) this).aBool4375 = anOpenGL4207.a("GL_EXT_framebuffer_multisample");
			aBool4346 = (((Class260_Sub2) this).aBool4375 & ((Class260_Sub2) this).aBool4358);
			if (i_256_ == 0)
				return 0;
			return i_256_;
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class193.method1272(runtimeexception, "fd.MF(" + i + ')');
		}
	}

	final void method1707() {
		try {
			f_ad++;
			method1911(-32, true);
			OpenGL.glClear(256);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.GC(" + ')');
		}
	}

	private final void method1975(int i) {
		try {
			do {
				if (((Class260_Sub2) this).aFloat4359 == (float) i) {
					f_bf[10] = f_cg;
					f_bf[14] = f_hf;
					if (!client.f_ob)
						break;
				}
				float f = (((Class260_Sub2) this).aFloat4343 / (((Class260_Sub2) this).aFloat4343 + ((Class260_Sub2) this).aFloat4359));
				float f_259_ = f * f;
				float f_260_ = (-f_hf * (1.0F - f) * (1.0F - f) / ((Class260_Sub2) this).aFloat4359);
				f_bf[14] = f_259_ * f_hf;
				f_bf[10] = f_cg + f_260_;
			} while (false);
			anInt4291++;
			((Class260_Sub2) this).aFloat4389 = (-((Class260_Sub2) this).aFloat4359 + (float) ((Class260_Sub2) this).anInt4371);
			((Class260_Sub2) this).f_mf = ((f_bf[14] - (float) ((Class260_Sub2) this).anInt4371) / f_bf[10]);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.NE(" + i + ')');
		}
	}

	final boolean method1732() {
		try {
			f_ud++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.DB(" + ')');
		}
	}

	final boolean method1742() {
		try {
			f_dc++;
			if (f_ke == null || !f_ke.method1836((byte) 125))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.BD(" + ')');
		}
	}

	final void p(int i) {
		try {
			f_kd++;
			method1958(-47, 0);
			OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F, (float) (i & 0xff00) / 65280.0F, (float) (0xff & i) / 255.0F, (float) (i >>> 24) / 255.0F);
			OpenGL.glClear(16384);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.p(" + i + ')');
		}
	}

	private final void method1976(int i) {
		do {
			try {
				OpenGL.glDepthMask(aBool4341 && aBool4379);
				anInt4256++;
				if (i == 0)
					break;
				f_wd = null;
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.EF(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1977(byte i) {
		try {
			f_ld++;
			if ((f_ch ^ 0xffffffff) != -2) {
				method1932(1);
				method1918(false, 0);
				method1906(false, 68);
				method1951(false, (byte) 63);
				method1911(-32, false);
				method1905((byte) 78, null);
				method1957(false, -2);
				method1900(7681, 1);
				f_ch = 1;
			}
			int i_261_ = 6 / ((i - 82) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "fd.R(" + i + ')');
		}
	}

	final void g(float f, float f_262_) {
		do {
			try {
				anInt4212++;
				if (((Class260_Sub2) this).aFloat4343 != f || ((Class260_Sub2) this).aFloat4359 != f_262_) {
					((Class260_Sub2) this).aFloat4343 = f;
					((Class260_Sub2) this).aFloat4359 = f_262_;
					method1975(0);
					if ((anInt4393 ^ 0xffffffff) == -4)
						method1933(-16933);
					else {
						if ((anInt4393 ^ 0xffffffff) != -3)
							break;
						method1907(105);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, "fd.g(" + f + ',' + f_262_ + ')');
			}
			break;
		} while (false);
	}

	final synchronized void method1978(int i, byte i_263_, int i_264_) {
		try {
			anInt4267++;
			IntegerNode class246_sub33 = new IntegerNode(i_264_);
			((Node) class246_sub33).hash = (long) i;
			if (i_263_ <= 107)
				((Class260_Sub2) this).aFloat4367 = 1.509716F;
			aClass166_4317.method1101(false, class246_sub33);
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("fd.HE(" + i + ',' + i_263_ + ',' + i_264_ + ')'));
		}
	}
}
