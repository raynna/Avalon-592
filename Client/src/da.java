/* da - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class da extends Class_t implements Class_d {
	private na ana3984;
	private qa aqa3985;
	long nativeid;
	Class162[] aClass162Array3986;
	Class19[] aClass19Array3987;

	final native int D();

	final native int m();

	final void method684(int i, int i_0_, int i_1_, int i_2_) {
		throw new IllegalStateException();
	}

	final native void M(int i, int[] is, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_, int[] is_7_);

	final native boolean w();

	final void method682(Class_t class_t, int i, int i_8_, int i_9_, boolean bool) {
		aqa3985.E().U(this, class_t, i, i_8_, i_9_, bool);
	}

	final native void c(int i);

	final native void N(int i, int i_10_, int i_11_, int i_12_);

	final native void j();

	final void method677() {
		/* empty */
	}

	private final native void o(qa var_qa);

	final boolean method685(int i, int i_13_, Class_c class_c, boolean bool) {
		return aqa3985.E().B(this, i, i_13_, class_c, bool);
	}

	final Class162[] method676() {
		return ((da) this).aClass162Array3986;
	}

	final native void I(short i, short i_14_);

	final native void JA(int i, int i_15_, int i_16_);

	final native void Z(int i);

	final native int WA();

	final native Class246_Sub1_Sub4 fa(Class246_Sub1_Sub4 class246_sub1_sub4);

	final native int NA();

	final native void Q(int i);

	final native void aa(int i);

	final native int PA();

	final Class19[] method672() {
		return ((da) this).aClass19Array3987;
	}

	final native void R(int i);

	final native int HA();

	final void method680(Class_c class_c, Class130_Sub5 class130_sub5, int i) {
		if (class130_sub5 == null)
			aqa3985.E().ea(this, class_c, null, i);
		else {
			qa.v[5] = 0;
			aqa3985.E().ea(this, class_c, qa.v, i);
			((Class130_Sub5) class130_sub5).anInt4813 = qa.v[0];
			((Class130_Sub5) class130_sub5).anInt4811 = qa.v[1];
			((Class130_Sub5) class130_sub5).anInt4815 = qa.v[2];
			((Class130_Sub5) class130_sub5).anInt4812 = qa.v[3];
			((Class130_Sub5) class130_sub5).anInt4816 = qa.v[4];
			((Class130_Sub5) class130_sub5).aBool4814 = qa.v[5] != 0;
		}
	}

	public final native void EA();

	final Class_t method678(byte i, int i_17_, boolean bool) {
		return aqa3985.E().method743(this, i, i_17_, bool);
	}

	final native int P();

	final native int l();

	final boolean method681() {
		return true;
	}

	final native void H(int i, int i_18_, int i_19_);

	final native int MA();

	final void method671(Class_c class_c, Class130_Sub5 class130_sub5, int i, int i_20_) {
		if (class130_sub5 == null)
			aqa3985.E().ta(this, class_c, null, i, i_20_);
		else {
			qa.v[5] = 0;
			aqa3985.E().ta(this, class_c, qa.v, i, i_20_);
			((Class130_Sub5) class130_sub5).anInt4813 = qa.v[0];
			((Class130_Sub5) class130_sub5).anInt4811 = qa.v[1];
			((Class130_Sub5) class130_sub5).anInt4815 = qa.v[2];
			((Class130_Sub5) class130_sub5).anInt4812 = qa.v[3];
			((Class130_Sub5) class130_sub5).anInt4816 = qa.v[4];
			((Class130_Sub5) class130_sub5).aBool4814 = qa.v[5] != 0;
		}
	}

	final native void UA(int i);

	protected final void finalize() {
		Class227.method1453((byte) 50, this);
	}

	final native void ya(da var_da_21_, da var_da_22_, int i, boolean bool, boolean bool_23_);

	final native void BA(short i, short i_24_);

	final native void E(int i);

	final native void IA();

	final native int U();

	final native void XA(int i, int[] is, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool);

	private final native void q(qa var_qa, na var_na, int i, int i_29_, int[] is, int[] is_30_, int[] is_31_, int[] is_32_, short[] is_33_, int i_34_, short[] is_35_, short[] is_36_, short[] is_37_, byte[] is_38_, byte[] is_39_, byte[] is_40_, byte[] is_41_, short[] is_42_, short[] is_43_, int[] is_44_, byte i_45_, short[] is_46_, int i_47_, byte[] is_48_, short[] is_49_, short[] is_50_, short[] is_51_, int[] is_52_, int[] is_53_, int[] is_54_, byte[] is_55_, byte[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int[] is_67_);

	da(qa var_qa, na var_na, Class103 class103, int i, int i_68_, int i_69_, int i_70_) {
		aqa3985 = var_qa;
		ana3984 = var_na;
		((da) this).aClass19Array3987 = ((Class103) class103).aClass19Array1364;
		((da) this).aClass162Array3986 = ((Class103) class103).aClass162Array1346;
		int i_71_ = (((Class103) class103).aClass19Array1364 == null ? 0 : ((Class103) class103).aClass19Array1364.length);
		int i_72_ = (((Class103) class103).aClass162Array1346 == null ? 0 : ((Class103) class103).aClass162Array1346.length);
		int i_73_ = 0;
		int[] is = new int[i_71_ * 3 + i_72_];
		for (int i_74_ = 0; i_74_ < i_71_; i_74_++) {
			is[i_73_++] = ((Class19) ((da) this).aClass19Array3987[i_74_]).anInt301;
			is[i_73_++] = ((Class19) ((da) this).aClass19Array3987[i_74_]).anInt309;
			is[i_73_++] = ((Class19) ((da) this).aClass19Array3987[i_74_]).anInt292;
		}
		for (int i_75_ = 0; i_75_ < i_72_; i_75_++)
			is[i_73_++] = ((Class162) ((da) this).aClass162Array3986[i_75_]).anInt2289;
		int i_76_ = (((Class103) class103).aClass131Array1348 == null ? 0 : ((Class103) class103).aClass131Array1348.length);
		int[] is_77_ = new int[i_76_ * 8];
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
			Class131 class131 = ((Class103) class103).aClass131Array1348[i_79_];
			Class98 class98 = Class247.method1578(true, ((Class131) class131).anInt1828);
			is_77_[i_78_++] = ((Class131) class131).anInt1823;
			is_77_[i_78_++] = ((Class98) class98).anInt1271;
			is_77_[i_78_++] = ((Class98) class98).anInt1278;
			is_77_[i_78_++] = ((Class98) class98).anInt1269;
			is_77_[i_78_++] = ((Class98) class98).anInt1268;
			is_77_[i_78_++] = ((Class98) class98).anInt1276;
			is_77_[i_78_++] = ((Class98) class98).aBool1277 ? -1 : 0;
		}
		for (int i_80_ = 0; i_80_ < i_76_; i_80_++) {
			Class131 class131 = ((Class103) class103).aClass131Array1348[i_80_];
			is_77_[i_78_++] = ((Class131) class131).anInt1829;
		}
		q(aqa3985, ana3984, ((Class103) class103).anInt1331, ((Class103) class103).anInt1354, ((Class103) class103).anIntArray1343, ((Class103) class103).anIntArray1328, ((Class103) class103).anIntArray1375, ((Class103) class103).anIntArray1361, ((Class103) class103).aShortArray1351, ((Class103) class103).anInt1368, ((Class103) class103).aShortArray1337, ((Class103) class103).aShortArray1334, ((Class103) class103).aShortArray1329, ((Class103) class103).aByteArray1345, ((Class103) class103).aByteArray1332, ((Class103) class103).aByteArray1371, ((Class103) class103).f_bb, ((Class103) class103).aShortArray1353, ((Class103) class103).f_cb, ((Class103) class103).anIntArray1347, ((Class103) class103).aByte1341, ((Class103) class103).aShortArray1338, ((Class103) class103).f_db, ((Class103) class103).f_eb, ((Class103) class103).aShortArray1333, ((Class103) class103).aShortArray1326, ((Class103) class103).aShortArray1362, ((Class103) class103).anIntArray1370, ((Class103) class103).anIntArray1367, ((Class103) class103).anIntArray1373, ((Class103) class103).aByteArray1330, ((Class103) class103).f_ab, ((Class103) class103).f_fb, ((Class103) class103).anIntArray1335, ((Class103) class103).anIntArray1366, is, i_71_, i_72_, i, i_68_, i_69_, i_70_, is_77_);
	}

	da(qa var_qa) {
		aqa3985 = var_qa;
		ana3984 = null;
		o(var_qa);
	}

	final native void h(int i, int i_81_, Class210 class210, Class210 class210_82_, int i_83_, int i_84_, int i_85_);

	final void method1843(int i, Class_c class_c) {
		int i_86_ = i;
		if (((da) this).aClass19Array3987 != null) {
			for (int i_87_ = 0; i_87_ < ((da) this).aClass19Array3987.length; i_87_++) {
				Class19 class19 = ((da) this).aClass19Array3987[i_87_];
				((Class19) class19).anInt293 = qa.E[i_86_++];
				((Class19) class19).anInt294 = qa.E[i_86_++];
				((Class19) class19).anInt306 = qa.E[i_86_++];
				((Class19) class19).anInt295 = qa.E[i_86_++];
				((Class19) class19).anInt296 = qa.E[i_86_++];
				((Class19) class19).anInt302 = qa.E[i_86_++];
				((Class19) class19).anInt303 = qa.E[i_86_++];
				((Class19) class19).anInt298 = qa.E[i_86_++];
				((Class19) class19).anInt304 = qa.E[i_86_++];
			}
		}
		if (((da) this).aClass162Array3986 != null) {
			for (int i_88_ = 0; i_88_ < ((da) this).aClass162Array3986.length; i_88_++) {
				Class162 class162 = ((da) this).aClass162Array3986[i_88_];
				Class162 class162_89_ = class162;
				if (((Class162) class162).aClass162_2296 != null)
					class162_89_ = ((Class162) class162).aClass162_2296;
				if (((Class162) class162).aClass_c2291 != null)
					((Class162) class162).aClass_c2291.za(class_c);
				else
					((Class162) class162).aClass_c2291 = class_c.method582();
				((Class162) class162_89_).anInt2294 = qa.E[i_86_++];
				((Class162) class162_89_).anInt2292 = qa.E[i_86_++];
				((Class162) class162_89_).anInt2301 = qa.E[i_86_++];
			}
		}
	}
}
