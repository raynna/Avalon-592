
/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class31 {
	private float[] aFloatArray410 = new float[16];
	static int anInt411;
	static int anInt412;
	static int anInt413;
	static boolean aBool414;
	static int[] anIntArray415;
	static int anInt416;
	private Stream_Sub2 aStream_Sub2_417 = new Stream_Sub2(786336);
	static int anInt418;
	static int anInt419;
	static float aFloat420;
	static int anInt421;
	private Class160 aClass160_422;
	private int anInt423 = Class179.method1169(1600, (byte) -14);
	private Class160 aClass160_424;
	private Class160 aClass160_425;
	private Interface10 anInterface10_426;
	private Class130_Sub1_Sub1[][] aClass130_Sub1_Sub1ArrayArray427;
	private int[] anIntArray428 = new int[64];
	private int[] anIntArray429;
	private int anInt430;
	private Class130_Sub1_Sub1[][] aClass130_Sub1_Sub1ArrayArray431;
	private int[] anIntArray432;

	static final void method231(int i) {
		try {
			anInt419++;
			if (i != -18006)
				aBool414 = false;
			for (int i_0_ = 0; i_0_ < 5; i_0_++)
				Class246_Sub28_Sub29.aBoolArray6817[i_0_] = false;
			Class118.anInt1636 = 0;
			Class74.anInt967 = -1;
			Class214.anInt2988 = 0;
			Class130_Sub3.anInt4417 = 1;
			Class21_Sub2.anInt4494 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cm.F(" + i + ')');
		}
	}

	static final void method232(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt421++;
			Class246_Sub1_Sub10 class246_sub1_sub10 = Class228.method1455(i_2_, (byte) 117, 4);
			if (i_1_ <= -48) {
				class246_sub1_sub10.method2600(-25852);
				((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6211 = i;
				((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6206 = i_4_;
				((Class246_Sub1_Sub10) class246_sub1_sub10).anInt6210 = i_3_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cm.B(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	private final void method233(Class260_Sub2 class260_sub2, int i, int i_5_) {
		do {
			try {
				anInt416++;
				OpenGL.glGetFloatv(2982, aFloatArray410, 0);
				float f = aFloatArray410[0];
				float f_6_ = aFloatArray410[4];
				float f_7_ = aFloatArray410[8];
				float f_8_ = aFloatArray410[1];
				float f_9_ = aFloatArray410[5];
				float f_10_ = aFloatArray410[9];
				float f_11_ = f_8_ + f;
				float f_12_ = f_6_ + f_9_;
				float f_13_ = f_10_ + f_7_;
				float f_14_ = -f_8_ + f;
				int i_15_ = 102 % ((-57 - i_5_) / 36);
				float f_16_ = -f_9_ + f_6_;
				float f_17_ = -f_10_ + f_7_;
				float f_18_ = -f + f_8_;
				float f_19_ = -f_6_ + f_9_;
				((BufferStream) aStream_Sub2_417).position = 0;
				float f_20_ = -f_7_ + f_10_;
				if (((Class260_Sub2) class260_sub2).aBool4392) {
					for (int i_21_ = -1 + i; i_21_ >= 0; i_21_--) {
						int i_22_ = (anIntArray429[i_21_] <= 64 ? anIntArray429[i_21_] : 64);
						if ((i_22_ ^ 0xffffffff) < -1) {
							for (int i_23_ = -1 + i_22_; (i_23_ ^ 0xffffffff) <= -1; i_23_--) {
								Class130_Sub1_Sub1 class130_sub1_sub1 = (aClass130_Sub1_Sub1ArrayArray427[i_21_][i_23_]);
								int i_24_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043);
								byte i_25_ = (byte) (i_24_ >> 16);
								byte i_26_ = (byte) (i_24_ >> 8);
								byte i_27_ = (byte) i_24_;
								byte i_28_ = (byte) (i_24_ >>> 24);
								float f_29_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037 >> Class93.anInt1225);
								float f_30_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048 >> Class93.anInt1225);
								float f_31_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044 >> Class93.anInt1225);
								int i_32_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> Class93.anInt1225);
								aStream_Sub2_417.method2595(0.0F, (byte) 98);
								aStream_Sub2_417.method2595(0.0F, (byte) 98);
								aStream_Sub2_417.method2595((f_29_ + ((float) -i_32_ * f_11_)), (byte) 98);
								aStream_Sub2_417.method2595(((float) -i_32_ * f_12_) + f_30_, (byte) 98);
								aStream_Sub2_417.method2595(f_31_ + f_13_ * (float) -i_32_, (byte) 98);
								aStream_Sub2_417.writeByte(255, i_25_);
								aStream_Sub2_417.writeByte(255, i_26_);
								aStream_Sub2_417.writeByte(255, i_27_);
								aStream_Sub2_417.writeByte(255, i_28_);
								aStream_Sub2_417.method2595(1.0F, (byte) 98);
								aStream_Sub2_417.method2595(0.0F, (byte) 98);
								aStream_Sub2_417.method2595(f_29_ + f_14_ * (float) i_32_, (byte) 98);
								aStream_Sub2_417.method2595((f_30_ + ((float) i_32_ * f_16_)), (byte) 98);
								aStream_Sub2_417.method2595(((float) i_32_ * f_17_) + f_31_, (byte) 98);
								aStream_Sub2_417.writeByte(255, i_25_);
								aStream_Sub2_417.writeByte(255, i_26_);
								aStream_Sub2_417.writeByte(255, i_27_);
								aStream_Sub2_417.writeByte(255, i_28_);
								aStream_Sub2_417.method2595(1.0F, (byte) 98);
								aStream_Sub2_417.method2595(1.0F, (byte) 98);
								aStream_Sub2_417.method2595(((float) i_32_ * f_11_) + f_29_, (byte) 98);
								aStream_Sub2_417.method2595((f_30_ + ((float) i_32_ * f_12_)), (byte) 98);
								aStream_Sub2_417.method2595(((float) i_32_ * f_13_) + f_31_, (byte) 98);
								aStream_Sub2_417.writeByte(255, i_25_);
								aStream_Sub2_417.writeByte(255, i_26_);
								aStream_Sub2_417.writeByte(255, i_27_);
								aStream_Sub2_417.writeByte(255, i_28_);
								aStream_Sub2_417.method2595(0.0F, (byte) 98);
								aStream_Sub2_417.method2595(1.0F, (byte) 98);
								aStream_Sub2_417.method2595((f_29_ + ((float) i_32_ * f_18_)), (byte) 98);
								aStream_Sub2_417.method2595((f_30_ + ((float) i_32_ * f_19_)), (byte) 98);
								aStream_Sub2_417.method2595((f_31_ + ((float) i_32_ * f_20_)), (byte) 98);
								aStream_Sub2_417.writeByte(255, i_25_);
								aStream_Sub2_417.writeByte(255, i_26_);
								aStream_Sub2_417.writeByte(255, i_27_);
								aStream_Sub2_417.writeByte(255, i_28_);
							}
							if (anIntArray429[i_21_] > 64) {
								int i_33_ = -64 + anIntArray429[i_21_] - 1;
								for (int i_34_ = anIntArray428[i_33_] - 1; i_34_ >= 0; i_34_--) {
									Class130_Sub1_Sub1 class130_sub1_sub1 = (aClass130_Sub1_Sub1ArrayArray431[i_33_][i_34_]);
									int i_35_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043);
									byte i_36_ = (byte) (i_35_ >> 16);
									byte i_37_ = (byte) (i_35_ >> 8);
									byte i_38_ = (byte) i_35_;
									byte i_39_ = (byte) (i_35_ >>> 24);
									float f_40_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037) >> Class93.anInt1225);
									float f_41_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048) >> Class93.anInt1225);
									float f_42_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044) >> Class93.anInt1225);
									int i_43_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> Class93.anInt1225);
									aStream_Sub2_417.method2595(0.0F, (byte) 98);
									aStream_Sub2_417.method2595(0.0F, (byte) 98);
									aStream_Sub2_417.method2595(f_11_ * (float) -i_43_ + f_40_, (byte) 98);
									aStream_Sub2_417.method2595(f_41_ + f_12_ * (float) -i_43_, (byte) 98);
									aStream_Sub2_417.method2595((float) -i_43_ * f_13_ + f_42_, (byte) 98);
									aStream_Sub2_417.writeByte(255, i_36_);
									aStream_Sub2_417.writeByte(255, i_37_);
									aStream_Sub2_417.writeByte(255, i_38_);
									aStream_Sub2_417.writeByte(255, i_39_);
									aStream_Sub2_417.method2595(1.0F, (byte) 98);
									aStream_Sub2_417.method2595(0.0F, (byte) 98);
									aStream_Sub2_417.method2595((((float) i_43_ * f_14_) + f_40_), (byte) 98);
									aStream_Sub2_417.method2595((((float) i_43_ * f_16_) + f_41_), (byte) 98);
									aStream_Sub2_417.method2595(f_42_ + (float) i_43_ * f_17_, (byte) 98);
									aStream_Sub2_417.writeByte(255, i_36_);
									aStream_Sub2_417.writeByte(255, i_37_);
									aStream_Sub2_417.writeByte(255, i_38_);
									aStream_Sub2_417.writeByte(255, i_39_);
									aStream_Sub2_417.method2595(1.0F, (byte) 98);
									aStream_Sub2_417.method2595(1.0F, (byte) 98);
									aStream_Sub2_417.method2595(f_11_ * (float) i_43_ + f_40_, (byte) 98);
									aStream_Sub2_417.method2595((((float) i_43_ * f_12_) + f_41_), (byte) 98);
									aStream_Sub2_417.method2595(f_13_ * (float) i_43_ + f_42_, (byte) 98);
									aStream_Sub2_417.writeByte(255, i_36_);
									aStream_Sub2_417.writeByte(255, i_37_);
									aStream_Sub2_417.writeByte(255, i_38_);
									aStream_Sub2_417.writeByte(255, i_39_);
									aStream_Sub2_417.method2595(0.0F, (byte) 98);
									aStream_Sub2_417.method2595(1.0F, (byte) 98);
									aStream_Sub2_417.method2595(f_40_ + (float) i_43_ * f_18_, (byte) 98);
									aStream_Sub2_417.method2595(f_41_ + (float) i_43_ * f_19_, (byte) 98);
									aStream_Sub2_417.method2595(f_42_ + (float) i_43_ * f_20_, (byte) 98);
									aStream_Sub2_417.writeByte(255, i_36_);
									aStream_Sub2_417.writeByte(255, i_37_);
									aStream_Sub2_417.writeByte(255, i_38_);
									aStream_Sub2_417.writeByte(255, i_39_);
								}
							}
						}
					}
				} else {
					for (int i_44_ = -1 + i; i_44_ >= 0; i_44_--) {
						int i_45_ = ((anIntArray429[i_44_] ^ 0xffffffff) < -65 ? 64 : anIntArray429[i_44_]);
						if ((i_45_ ^ 0xffffffff) < -1) {
							for (int i_46_ = -1 + i_45_; i_46_ >= 0; i_46_--) {
								Class130_Sub1_Sub1 class130_sub1_sub1 = (aClass130_Sub1_Sub1ArrayArray427[i_44_][i_46_]);
								int i_47_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043);
								byte i_48_ = (byte) (i_47_ >> 16);
								byte i_49_ = (byte) (i_47_ >> 8);
								byte i_50_ = (byte) i_47_;
								byte i_51_ = (byte) (i_47_ >>> 24);
								float f_52_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037 >> Class93.anInt1225);
								float f_53_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048 >> Class93.anInt1225);
								float f_54_ = (float) (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044 >> Class93.anInt1225);
								int i_55_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> Class93.anInt1225);
								aStream_Sub2_417.method2591(0.0F, 1739667504);
								aStream_Sub2_417.method2591(0.0F, 1739667504);
								aStream_Sub2_417.method2591((f_52_ + ((float) -i_55_ * f_11_)), 1739667504);
								aStream_Sub2_417.method2591(((f_12_ * (float) -i_55_) + f_53_), 1739667504);
								aStream_Sub2_417.method2591(f_54_ + f_13_ * (float) -i_55_, 1739667504);
								aStream_Sub2_417.writeByte(255, i_48_);
								aStream_Sub2_417.writeByte(255, i_49_);
								aStream_Sub2_417.writeByte(255, i_50_);
								aStream_Sub2_417.writeByte(255, i_51_);
								aStream_Sub2_417.method2591(1.0F, 1739667504);
								aStream_Sub2_417.method2591(0.0F, 1739667504);
								aStream_Sub2_417.method2591((f_52_ + ((float) i_55_ * f_14_)), 1739667504);
								aStream_Sub2_417.method2591(((f_16_ * (float) i_55_) + f_53_), 1739667504);
								aStream_Sub2_417.method2591(((float) i_55_ * f_17_) + f_54_, 1739667504);
								aStream_Sub2_417.writeByte(255, i_48_);
								aStream_Sub2_417.writeByte(255, i_49_);
								aStream_Sub2_417.writeByte(255, i_50_);
								aStream_Sub2_417.writeByte(255, i_51_);
								aStream_Sub2_417.method2591(1.0F, 1739667504);
								aStream_Sub2_417.method2591(1.0F, 1739667504);
								aStream_Sub2_417.method2591((f_52_ + ((float) i_55_ * f_11_)), 1739667504);
								aStream_Sub2_417.method2591(((float) i_55_ * f_12_) + f_53_, 1739667504);
								aStream_Sub2_417.method2591((f_54_ + ((float) i_55_ * f_13_)), 1739667504);
								aStream_Sub2_417.writeByte(255, i_48_);
								aStream_Sub2_417.writeByte(255, i_49_);
								aStream_Sub2_417.writeByte(255, i_50_);
								aStream_Sub2_417.writeByte(255, i_51_);
								aStream_Sub2_417.method2591(0.0F, 1739667504);
								aStream_Sub2_417.method2591(1.0F, 1739667504);
								aStream_Sub2_417.method2591((f_52_ + ((float) i_55_ * f_18_)), 1739667504);
								aStream_Sub2_417.method2591(((f_19_ * (float) i_55_) + f_53_), 1739667504);
								aStream_Sub2_417.method2591(((float) i_55_ * f_20_) + f_54_, 1739667504);
								aStream_Sub2_417.writeByte(255, i_48_);
								aStream_Sub2_417.writeByte(255, i_49_);
								aStream_Sub2_417.writeByte(255, i_50_);
								aStream_Sub2_417.writeByte(255, i_51_);
							}
							if (anIntArray429[i_44_] > 64) {
								int i_56_ = anIntArray429[i_44_] - 65;
								for (int i_57_ = -1 + anIntArray428[i_56_]; i_57_ >= 0; i_57_--) {
									Class130_Sub1_Sub1 class130_sub1_sub1 = (aClass130_Sub1_Sub1ArrayArray431[i_56_][i_57_]);
									int i_58_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7043);
									byte i_59_ = (byte) (i_58_ >> 16);
									byte i_60_ = (byte) (i_58_ >> 8);
									byte i_61_ = (byte) i_58_;
									byte i_62_ = (byte) (i_58_ >>> 24);
									float f_63_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037) >> Class93.anInt1225);
									float f_64_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048) >> Class93.anInt1225);
									float f_65_ = (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044) >> Class93.anInt1225);
									int i_66_ = (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7038 >> Class93.anInt1225);
									aStream_Sub2_417.method2591(0.0F, 1739667504);
									aStream_Sub2_417.method2591(0.0F, 1739667504);
									aStream_Sub2_417.method2591(f_63_ + (float) -i_66_ * f_11_, 1739667504);
									aStream_Sub2_417.method2591(f_64_ + f_12_ * (float) -i_66_, 1739667504);
									aStream_Sub2_417.method2591((float) -i_66_ * f_13_ + f_65_, 1739667504);
									aStream_Sub2_417.writeByte(255, i_59_);
									aStream_Sub2_417.writeByte(255, i_60_);
									aStream_Sub2_417.writeByte(255, i_61_);
									aStream_Sub2_417.writeByte(255, i_62_);
									aStream_Sub2_417.method2591(1.0F, 1739667504);
									aStream_Sub2_417.method2591(0.0F, 1739667504);
									aStream_Sub2_417.method2591(f_63_ + f_14_ * (float) i_66_, 1739667504);
									aStream_Sub2_417.method2591(f_64_ + f_16_ * (float) i_66_, 1739667504);
									aStream_Sub2_417.method2591((((float) i_66_ * f_17_) + f_65_), 1739667504);
									aStream_Sub2_417.writeByte(255, i_59_);
									aStream_Sub2_417.writeByte(255, i_60_);
									aStream_Sub2_417.writeByte(255, i_61_);
									aStream_Sub2_417.writeByte(255, i_62_);
									aStream_Sub2_417.method2591(1.0F, 1739667504);
									aStream_Sub2_417.method2591(1.0F, 1739667504);
									aStream_Sub2_417.method2591(f_11_ * (float) i_66_ + f_63_, 1739667504);
									aStream_Sub2_417.method2591(f_64_ + f_12_ * (float) i_66_, 1739667504);
									aStream_Sub2_417.method2591(f_65_ + f_13_ * (float) i_66_, 1739667504);
									aStream_Sub2_417.writeByte(255, i_59_);
									aStream_Sub2_417.writeByte(255, i_60_);
									aStream_Sub2_417.writeByte(255, i_61_);
									aStream_Sub2_417.writeByte(255, i_62_);
									aStream_Sub2_417.method2591(0.0F, 1739667504);
									aStream_Sub2_417.method2591(1.0F, 1739667504);
									aStream_Sub2_417.method2591((((float) i_66_ * f_18_) + f_63_), 1739667504);
									aStream_Sub2_417.method2591((((float) i_66_ * f_19_) + f_64_), 1739667504);
									aStream_Sub2_417.method2591(f_65_ + f_20_ * (float) i_66_, 1739667504);
									aStream_Sub2_417.writeByte(255, i_59_);
									aStream_Sub2_417.writeByte(255, i_60_);
									aStream_Sub2_417.writeByte(255, i_61_);
									aStream_Sub2_417.writeByte(255, i_62_);
								}
							}
						}
					}
				}
				if (((BufferStream) aStream_Sub2_417).position == 0)
					break;
				anInterface10_426.method33((byte) -87, ((BufferStream) aStream_Sub2_417).position, 24, (((BufferStream) aStream_Sub2_417).buffer));
				class260_sub2.method1934(aClass160_422, 114, null, aClass160_425, aClass160_424);
				class260_sub2.method1925(1, 0, 7, (((BufferStream) aStream_Sub2_417).position / 24));
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("cm.E(" + (class260_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	final void method234(byte i, Class129 class129, Class260_Sub2 class260_sub2) {
		try {
			anInt411++;
			if (((Class260_Sub2) class260_sub2).f_hg != null) {
				method238(11604, class260_sub2);
				float f = (((Class_c_Sub1) ((Class260_Sub2) class260_sub2).f_hg).aFloat5386);
				float f_67_ = (((Class_c_Sub1) ((Class260_Sub2) class260_sub2).f_hg).aFloat5378);
				float f_68_ = (((Class_c_Sub1) ((Class260_Sub2) class260_sub2).f_hg).aFloat5363);
				int i_69_ = 9 % ((63 - i) / 56);
				float f_70_ = (((Class_c_Sub1) ((Class260_Sub2) class260_sub2).f_hg).aFloat5362);
				try {
					if (((Class129) class129).aBool1812) {
						int i_71_ = (-((Class129) class129).anInt1810 + ((Class129) class129).anInt1804);
						int i_72_;
						if ((2 + i_71_ ^ 0xffffffff) >= -1601) {
							i_71_ += 2;
							i_72_ = 0;
						} else {
							i_72_ = (1 - -Class179.method1169(i_71_, (byte) -14) - anInt423);
							i_71_ = 2 + (i_71_ >> i_72_);
						}
						Class130_Sub1 class130_sub1 = (((Class220) ((Class129) class129).aClass220_1802).aClass130_Sub1_3052);
						Class130_Sub1 class130_sub1_73_ = (((Class130_Sub1) class130_sub1).aClass130_Sub1_3732);
						int i_74_ = -2;
						boolean bool = true;
						boolean bool_75_ = true;
						while (class130_sub1 != class130_sub1_73_) {
							anInt430 = 0;
							for (int i_76_ = 0; i_71_ > i_76_; i_76_++)
								anIntArray429[i_76_] = 0;
							for (int i_77_ = 0; i_77_ < 64; i_77_++)
								anIntArray428[i_77_] = 0;
							for (/**/; class130_sub1 != class130_sub1_73_; class130_sub1_73_ = (((Class130_Sub1) class130_sub1_73_).aClass130_Sub1_3732)) {
								Class130_Sub1_Sub1 class130_sub1_sub1 = (Class130_Sub1_Sub1) class130_sub1_73_;
								if (bool_75_) {
									i_74_ = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049;
									bool = ((Class130_Sub1_Sub1) class130_sub1_sub1).aBool7040;
									bool_75_ = false;
								} else if ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049 != i_74_) || !bool != !(((Class130_Sub1_Sub1) class130_sub1_sub1).aBool7040)) {
									bool_75_ = true;
									break;
								}
								int i_78_ = ((int) (((float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037) >> Class93.anInt1225) * f) + ((float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048) >> Class93.anInt1225) * f_67_) + ((float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044) >> Class93.anInt1225) * f_68_) + f_70_) - (((Class129) class129).anInt1810)) >> i_72_;
								if ((i_78_ ^ 0xffffffff) > -1601) {
									if ((anIntArray429[i_78_] ^ 0xffffffff) <= -65) {
										if ((anIntArray429[i_78_] ^ 0xffffffff) == -65) {
											if ((anInt430 ^ 0xffffffff) == -65)
												continue;
											anIntArray429[i_78_] += 1 - -anInt430++;
										}
										aClass130_Sub1_Sub1ArrayArray431[-1 + (-64 + anIntArray429[i_78_])][anIntArray428[-64 + (anIntArray429[i_78_] - 1)]++] = class130_sub1_sub1;
									} else
										aClass130_Sub1_Sub1ArrayArray427[i_78_][anIntArray429[i_78_]++] = class130_sub1_sub1;
								}
							}
							if ((i_74_ ^ 0xffffffff) <= -1) {
								class260_sub2.method1905((byte) 78, ((Class260_Sub2) class260_sub2).f_ie.method319(i_74_, -128));
								class260_sub2.method1900(7681, (((Class238) ((Class260) class260_sub2).anInterface6_3714.method17(-31305, i_74_)).anInt3341));
							} else
								class260_sub2.method1905((byte) 78, null);
							if (!bool || (((Class260_Sub2) class260_sub2).f_gg == Class255_Sub1.aFloat5575)) {
								if (((Class260_Sub2) class260_sub2).f_gg != 1.0F)
									class260_sub2.B(1.0F);
							} else
								class260_sub2.B(Class255_Sub1.aFloat5575);
							method233(class260_sub2, i_71_, -103);
						}
					} else {
						int i_79_ = 0;
						int i_80_ = 2147483647;
						int i_81_ = 0;
						Class130_Sub1 class130_sub1 = (((Class220) ((Class129) class129).aClass220_1802).aClass130_Sub1_3052);
						for (Class130_Sub1 class130_sub1_82_ = (((Class130_Sub1) class130_sub1).aClass130_Sub1_3732); class130_sub1_82_ != class130_sub1; class130_sub1_82_ = (((Class130_Sub1) class130_sub1_82_).aClass130_Sub1_3732)) {
							Class130_Sub1_Sub1 class130_sub1_sub1 = (Class130_Sub1_Sub1) class130_sub1_82_;
							int i_83_ = (int) (f_70_ + ((float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7037) >> Class93.anInt1225) * f + (f_67_ * (float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7048) >> (Class93.anInt1225))) + ((float) ((((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7044) >> Class93.anInt1225) * f_68_)));
							anIntArray432[i_79_++] = i_83_;
							if (i_80_ > i_83_)
								i_80_ = i_83_;
							if (i_81_ < i_83_)
								i_81_ = i_83_;
						}
						int i_84_ = i_81_ - i_80_;
						int i_85_;
						if ((2 + i_84_ ^ 0xffffffff) >= -1601) {
							i_84_ += 2;
							i_85_ = 0;
						} else {
							i_85_ = (Class179.method1169(i_84_, (byte) -14) + 1 - anInt423);
							i_84_ = 2 + (i_84_ >> i_85_);
						}
						i_79_ = 0;
						Class130_Sub1 class130_sub1_86_ = (((Class130_Sub1) class130_sub1).aClass130_Sub1_3732);
						int i_87_ = -2;
						boolean bool = true;
						boolean bool_88_ = true;
						while (class130_sub1_86_ != class130_sub1) {
							anInt430 = 0;
							for (int i_89_ = 0; i_89_ < i_84_; i_89_++)
								anIntArray429[i_89_] = 0;
							for (int i_90_ = 0; i_90_ < 64; i_90_++)
								anIntArray428[i_90_] = 0;
							for (/**/; class130_sub1_86_ != class130_sub1; class130_sub1_86_ = (((Class130_Sub1) class130_sub1_86_).aClass130_Sub1_3732)) {
								Class130_Sub1_Sub1 class130_sub1_sub1 = (Class130_Sub1_Sub1) class130_sub1_86_;
								if (bool_88_) {
									bool = ((Class130_Sub1_Sub1) class130_sub1_sub1).aBool7040;
									bool_88_ = false;
									i_87_ = ((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049;
								}
								if (i_79_ > 0 && (((i_87_ ^ 0xffffffff) != (((Class130_Sub1_Sub1) class130_sub1_sub1).anInt7049 ^ 0xffffffff)) || bool == !(((Class130_Sub1_Sub1) class130_sub1_sub1).aBool7040))) {
									bool_88_ = true;
									break;
								}
								int i_91_ = -i_80_ + anIntArray432[i_79_++] >> i_85_;
								if ((i_91_ ^ 0xffffffff) > -1601) {
									if ((anIntArray429[i_91_] ^ 0xffffffff) > -65)
										aClass130_Sub1_Sub1ArrayArray427[i_91_][anIntArray429[i_91_]++] = class130_sub1_sub1;
									else {
										if (anIntArray429[i_91_] == 64) {
											if ((anInt430 ^ 0xffffffff) == -65)
												continue;
											anIntArray429[i_91_] += 1 - -anInt430++;
										}
										aClass130_Sub1_Sub1ArrayArray431[-65 + anIntArray429[i_91_]][anIntArray428[-1 + ((anIntArray429[i_91_]) - 64)]++] = class130_sub1_sub1;
									}
								}
							}
							if (i_87_ < 0)
								class260_sub2.method1905((byte) 78, null);
							else {
								class260_sub2.method1905((byte) 78, ((Class260_Sub2) class260_sub2).f_ie.method319(i_87_, -128));
								class260_sub2.method1900(7681, (((Class238) ((Class260) class260_sub2).anInterface6_3714.method17(-31305, i_87_)).anInt3341));
							}
							if (!bool || (Class255_Sub1.aFloat5575 == ((Class260_Sub2) class260_sub2).f_gg)) {
								if (((Class260_Sub2) class260_sub2).f_gg != 1.0F)
									class260_sub2.B(1.0F);
							} else
								class260_sub2.B(Class255_Sub1.aFloat5575);
							method233(class260_sub2, i_84_, 47);
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				method237(16385, class260_sub2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cm.C(" + i + ',' + (class129 != null ? "{...}" : "null") + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method235(byte i, Class260_Sub2 class260_sub2) {
		try {
			anInterface10_426 = class260_sub2.method1960(0, 196584, null, true, 24);
			anInt412++;
			if (i == 6) {
				aClass160_425 = new Class160(anInterface10_426, 5126, 2, 0);
				aClass160_424 = new Class160(anInterface10_426, 5126, 3, 8);
				aClass160_422 = new Class160(anInterface10_426, 5121, 4, 20);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cm.H(" + i + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class59_Sub2 method236(int i, int i_92_, int i_93_) {
		Class147 class147 = Class106.aClass147ArrayArrayArray1494[i][i_92_][i_93_];
		if (class147 == null)
			return null;
		return ((Class147) class147).aClass59_Sub2_2153;
	}

	private final void method237(int i, Class260_Sub2 class260_sub2) {
		do {
			try {
				anInt413++;
				class260_sub2.method1911(-32, true);
				OpenGL.glEnable(16384);
				OpenGL.glEnable(i);
				if (((Class260_Sub2) class260_sub2).f_gg == Class255_Sub1.aFloat5575)
					break;
				class260_sub2.B(Class255_Sub1.aFloat5575);
			} catch (RuntimeException runtimeexception) {
				throw Class193.method1272(runtimeexception, ("cm.A(" + i + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method238(int i, Class260_Sub2 class260_sub2) {
		try {
			Class255_Sub1.aFloat5575 = ((Class260_Sub2) class260_sub2).f_gg;
			if (i == 11604) {
				anInt418++;
				class260_sub2.method1904(8);
				OpenGL.glDisable(16384);
				OpenGL.glDisable(16385);
				class260_sub2.method1911(-32, false);
				class260_sub2.method1957(false, -2);
				OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("cm.D(" + i + ',' + (class260_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method239(byte i) {
		try {
			if (i < 126)
				method231(-4);
			anIntArray415 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "cm.G(" + i + ')');
		}
	}

	Class31() {
		aClass130_Sub1_Sub1ArrayArray427 = new Class130_Sub1_Sub1[1600][64];
		aClass130_Sub1_Sub1ArrayArray431 = new Class130_Sub1_Sub1[64][768];
		anIntArray432 = new int[8191];
		anIntArray429 = new int[1600];
		anInt430 = 0;
	}

	static {
		new Class67("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!");
		anIntArray415 = new int[14];
		aBool414 = false;
	}
}
