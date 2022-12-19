/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
	int anInt155;
	int anInt156;
	byte[] aByteArray157;
	int anInt158;
	int anInt159;
	int[] anIntArray160;
	byte[] aByteArray161;
	int anInt162;
	int anInt163;

	final void method116(int i) {
		int i_0_ = -1;
		if (((Class10) this).anIntArray160.length < 255) {
			for (int i_1_ = 0; i_1_ < ((Class10) this).anIntArray160.length; i_1_++) {
				if (((Class10) this).anIntArray160[i_1_] == i) {
					i_0_ = i_1_;
					break;
				}
			}
			if (i_0_ == -1) {
				i_0_ = ((Class10) this).anIntArray160.length;
				int[] is = new int[((Class10) this).anIntArray160.length + 1];
				Class117.method806(((Class10) this).anIntArray160, 0, is, 0, ((Class10) this).anIntArray160.length);
				((Class10) this).anIntArray160 = is;
				is[i_0_] = i;
			}
		} else {
			int i_2_ = 2147483647;
			int i_3_ = i >> 16 & 0xff;
			int i_4_ = i >> 8 & 0xff;
			int i_5_ = i & 0xff;
			for (int i_6_ = 0; i_6_ < ((Class10) this).anIntArray160.length; i_6_++) {
				int i_7_ = ((Class10) this).anIntArray160[i_6_];
				int i_8_ = i_7_ >> 16 & 0xff;
				int i_9_ = i_7_ >> 8 & 0xff;
				int i_10_ = i_7_ & 0xff;
				int i_11_ = i_3_ - i_8_;
				if (i_11_ < 0)
					i_11_ = -i_11_;
				int i_12_ = i_4_ - i_9_;
				if (i_12_ < 0)
					i_12_ = -i_12_;
				int i_13_ = i_5_ - i_10_;
				if (i_13_ < 0)
					i_13_ = -i_13_;
				int i_14_ = i_11_ + i_12_ + i_13_;
				if (i_14_ < i_2_) {
					i_2_ = i_14_;
					i_0_ = i_6_;
				}
			}
		}
		for (int i_15_ = ((Class10) this).anInt155 - 1; i_15_ > 0; i_15_--) {
			int i_16_ = i_15_ * ((Class10) this).anInt156;
			for (int i_17_ = ((Class10) this).anInt156 - 1; i_17_ > 0; i_17_--) {
				if (((((Class10) this).anIntArray160[((Class10) this).aByteArray157[i_17_ + i_16_] & 0xff]) == 0) && (((Class10) this).anIntArray160[((((Class10) this).aByteArray157[i_17_ + i_16_ - 1 - ((Class10) this).anInt156]) & 0xff)]) != 0)
					((Class10) this).aByteArray157[i_17_ + i_16_] = (byte) i_0_;
			}
		}
	}

	private static final Class10[] method117(byte[] is) {
		BufferStream stream = new BufferStream(is);
		((BufferStream) stream).position = is.length - 2;
		int i = stream.readUnsignedShort((byte) 87);
		Class10[] class10s = new Class10[i];
		for (int i_18_ = 0; i_18_ < i; i_18_++)
			class10s[i_18_] = new Class10();
		((BufferStream) stream).position = is.length - 7 - i * 8;
		int i_19_ = stream.readUnsignedShort((byte) -99);
		int i_20_ = stream.readUnsignedShort((byte) 96);
		int i_21_ = (stream.readUnsignedByte(255) & 0xff) + 1;
		for (int i_22_ = 0; i_22_ < i; i_22_++)
			((Class10) class10s[i_22_]).anInt158 = stream.readUnsignedShort((byte) 119);
		for (int i_23_ = 0; i_23_ < i; i_23_++)
			((Class10) class10s[i_23_]).anInt162 = stream.readUnsignedShort((byte) 118);
		for (int i_24_ = 0; i_24_ < i; i_24_++)
			((Class10) class10s[i_24_]).anInt156 = stream.readUnsignedShort((byte) 102);
		for (int i_25_ = 0; i_25_ < i; i_25_++)
			((Class10) class10s[i_25_]).anInt155 = stream.readUnsignedShort((byte) 90);
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			Class10 class10 = class10s[i_26_];
			((Class10) class10).anInt159 = (i_19_ - ((Class10) class10).anInt156 - ((Class10) class10).anInt158);
			((Class10) class10).anInt163 = (i_20_ - ((Class10) class10).anInt155 - ((Class10) class10).anInt162);
		}
		((BufferStream) stream).position = is.length - 7 - i * 8 - (i_21_ - 1) * 3;
		int[] is_27_ = new int[i_21_];
		for (int i_28_ = 1; i_28_ < i_21_; i_28_++) {
			is_27_[i_28_] = stream.read24BitInteger((byte) 29);
			if (is_27_[i_28_] == 0)
				is_27_[i_28_] = 1;
		}
		for (int i_29_ = 0; i_29_ < i; i_29_++)
			((Class10) class10s[i_29_]).anIntArray160 = is_27_;
		((BufferStream) stream).position = 0;
		for (int i_30_ = 0; i_30_ < i; i_30_++) {
			Class10 class10 = class10s[i_30_];
			int i_31_ = ((Class10) class10).anInt156 * ((Class10) class10).anInt155;
			((Class10) class10).aByteArray157 = new byte[i_31_];
			int i_32_ = stream.readUnsignedByte(255);
			if ((i_32_ & 0x2) == 0) {
				if ((i_32_ & 0x1) == 0) {
					for (int i_33_ = 0; i_33_ < i_31_; i_33_++)
						((Class10) class10).aByteArray157[i_33_] = stream.readByte(false);
				} else {
					for (int i_34_ = 0; i_34_ < ((Class10) class10).anInt156; i_34_++) {
						for (int i_35_ = 0; i_35_ < ((Class10) class10).anInt155; i_35_++)
							((Class10) class10).aByteArray157[i_34_ + i_35_ * ((Class10) class10).anInt156] = stream.readByte(false);
					}
				}
			} else {
				boolean bool = false;
				((Class10) class10).aByteArray161 = new byte[i_31_];
				if ((i_32_ & 0x1) == 0) {
					for (int i_36_ = 0; i_36_ < i_31_; i_36_++)
						((Class10) class10).aByteArray157[i_36_] = stream.readByte(false);
					for (int i_37_ = 0; i_37_ < i_31_; i_37_++) {
						byte i_38_ = (((Class10) class10).aByteArray161[i_37_] = stream.readByte(false));
						bool = bool | i_38_ != -1;
					}
				} else {
					for (int i_39_ = 0; i_39_ < ((Class10) class10).anInt156; i_39_++) {
						for (int i_40_ = 0; i_40_ < ((Class10) class10).anInt155; i_40_++)
							((Class10) class10).aByteArray157[i_39_ + i_40_ * ((Class10) class10).anInt156] = stream.readByte(false);
					}
					for (int i_41_ = 0; i_41_ < ((Class10) class10).anInt156; i_41_++) {
						for (int i_42_ = 0; i_42_ < ((Class10) class10).anInt155; i_42_++) {
							byte i_43_ = (((Class10) class10).aByteArray161[i_41_ + i_42_ * (((Class10) class10).anInt156)] = stream.readByte(false));
							bool = bool | i_43_ != -1;
						}
					}
				}
				if (!bool)
					((Class10) class10).aByteArray161 = null;
			}
		}
		return class10s;
	}

	final void method118() {
		byte[] is = ((Class10) this).aByteArray157;
		if (((Class10) this).aByteArray161 == null) {
			for (int i = ((Class10) this).anInt155 - 1; i >= 0; i--) {
				int i_44_ = i * ((Class10) this).anInt156;
				for (int i_45_ = (i + 1) * ((Class10) this).anInt156; i_44_ < i_45_; i_44_++) {
					i_45_--;
					byte i_46_ = is[i_44_];
					is[i_44_] = is[i_45_];
					is[i_45_] = i_46_;
				}
			}
		} else {
			byte[] is_47_ = ((Class10) this).aByteArray161;
			for (int i = ((Class10) this).anInt155 - 1; i >= 0; i--) {
				int i_48_ = i * ((Class10) this).anInt156;
				for (int i_49_ = (i + 1) * ((Class10) this).anInt156; i_48_ < i_49_; i_48_++) {
					i_49_--;
					byte i_50_ = is[i_48_];
					is[i_48_] = is[i_49_];
					is[i_49_] = i_50_;
					i_50_ = is_47_[i_48_];
					is_47_[i_48_] = is_47_[i_49_];
					is_47_[i_49_] = i_50_;
				}
			}
		}
		int i = ((Class10) this).anInt158;
		((Class10) this).anInt158 = ((Class10) this).anInt159;
		((Class10) this).anInt159 = i;
	}

	final void method119(int i) {
		int i_51_ = -1;
		if (((Class10) this).anIntArray160.length < 255) {
			for (int i_52_ = 0; i_52_ < ((Class10) this).anIntArray160.length; i_52_++) {
				if (((Class10) this).anIntArray160[i_52_] == i) {
					i_51_ = i_52_;
					break;
				}
			}
			if (i_51_ == -1) {
				i_51_ = ((Class10) this).anIntArray160.length;
				int[] is = new int[((Class10) this).anIntArray160.length + 1];
				Class117.method806(((Class10) this).anIntArray160, 0, is, 0, ((Class10) this).anIntArray160.length);
				((Class10) this).anIntArray160 = is;
				is[i_51_] = i;
			}
		} else {
			int i_53_ = 2147483647;
			int i_54_ = i >> 16 & 0xff;
			int i_55_ = i >> 8 & 0xff;
			int i_56_ = i & 0xff;
			for (int i_57_ = 0; i_57_ < ((Class10) this).anIntArray160.length; i_57_++) {
				int i_58_ = ((Class10) this).anIntArray160[i_57_];
				int i_59_ = i_58_ >> 16 & 0xff;
				int i_60_ = i_58_ >> 8 & 0xff;
				int i_61_ = i_58_ & 0xff;
				int i_62_ = i_54_ - i_59_;
				if (i_62_ < 0)
					i_62_ = -i_62_;
				int i_63_ = i_55_ - i_60_;
				if (i_63_ < 0)
					i_63_ = -i_63_;
				int i_64_ = i_56_ - i_61_;
				if (i_64_ < 0)
					i_64_ = -i_64_;
				int i_65_ = i_62_ + i_63_ + i_64_;
				if (i_65_ < i_53_) {
					i_53_ = i_65_;
					i_51_ = i_57_;
				}
			}
		}
		int i_66_ = 0;
		byte[] is = new byte[((Class10) this).anInt156 * ((Class10) this).anInt155];
		for (int i_67_ = 0; i_67_ < ((Class10) this).anInt155; i_67_++) {
			for (int i_68_ = 0; i_68_ < ((Class10) this).anInt156; i_68_++) {
				int i_69_ = ((Class10) this).aByteArray157[i_66_] & 0xff;
				if (((Class10) this).anIntArray160[i_69_] == 0) {
					if (i_68_ > 0 && (((Class10) this).anIntArray160[(((Class10) this).aByteArray157[i_66_ - 1] & 0xff)]) != 0)
						i_69_ = i_51_;
					else if (i_67_ > 0 && (((Class10) this).anIntArray160[((((Class10) this).aByteArray157[i_66_ - ((Class10) this).anInt156]) & 0xff)]) != 0)
						i_69_ = i_51_;
					else if (i_68_ < ((Class10) this).anInt156 - 1 && (((Class10) this).anIntArray160[(((Class10) this).aByteArray157[i_66_ + 1] & 0xff)]) != 0)
						i_69_ = i_51_;
					else if (i_67_ < ((Class10) this).anInt155 - 1 && (((Class10) this).anIntArray160[((((Class10) this).aByteArray157[i_66_ + ((Class10) this).anInt156]) & 0xff)]) != 0)
						i_69_ = i_51_;
				}
				is[i_66_++] = (byte) i_69_;
			}
		}
		((Class10) this).aByteArray157 = is;
	}

	static final Class10 method120(Class_fs class_fs, int i, int i_70_) {
		byte[] is = class_fs.method91(i_70_, i, 86);
		if (is == null)
			return null;
		return method117(is)[0];
	}

	final int[] method121() {
		int i = method126();
		int[] is = new int[i * method127()];
		if (((Class10) this).aByteArray161 != null) {
			for (int i_71_ = 0; i_71_ < ((Class10) this).anInt155; i_71_++) {
				int i_72_ = i_71_ * ((Class10) this).anInt156;
				int i_73_ = (((Class10) this).anInt158 + (i_71_ + ((Class10) this).anInt162) * i);
				for (int i_74_ = 0; i_74_ < ((Class10) this).anInt156; i_74_++) {
					is[i_73_++] = (((Class10) this).aByteArray161[i_72_] << 24 | (((Class10) this).anIntArray160[((Class10) this).aByteArray157[i_72_] & 0xff]));
					i_72_++;
				}
			}
		} else {
			for (int i_75_ = 0; i_75_ < ((Class10) this).anInt155; i_75_++) {
				int i_76_ = i_75_ * ((Class10) this).anInt156;
				int i_77_ = (((Class10) this).anInt158 + (i_75_ + ((Class10) this).anInt162) * i);
				for (int i_78_ = 0; i_78_ < ((Class10) this).anInt156; i_78_++) {
					int i_79_ = (((Class10) this).anIntArray160[((Class10) this).aByteArray157[i_76_++] & 0xff]);
					if (i_79_ != 0)
						is[i_77_++] = ~0xffffff | i_79_;
					else
						is[i_77_++] = 0;
				}
			}
		}
		return is;
	}

	final void method122() {
		byte[] is = new byte[((Class10) this).anInt156 * ((Class10) this).anInt155];
		int i = 0;
		if (((Class10) this).aByteArray161 == null) {
			for (int i_80_ = 0; i_80_ < ((Class10) this).anInt156; i_80_++) {
				for (int i_81_ = ((Class10) this).anInt155 - 1; i_81_ >= 0; i_81_--)
					is[i++] = (((Class10) this).aByteArray157[i_80_ + i_81_ * ((Class10) this).anInt156]);
			}
			((Class10) this).aByteArray157 = is;
		} else {
			byte[] is_82_ = (new byte[((Class10) this).anInt156 * ((Class10) this).anInt155]);
			for (int i_83_ = 0; i_83_ < ((Class10) this).anInt156; i_83_++) {
				for (int i_84_ = ((Class10) this).anInt155 - 1; i_84_ >= 0; i_84_--) {
					is[i] = (((Class10) this).aByteArray157[i_83_ + i_84_ * ((Class10) this).anInt156]);
					is_82_[i++] = (((Class10) this).aByteArray161[i_83_ + i_84_ * ((Class10) this).anInt156]);
				}
			}
			((Class10) this).aByteArray157 = is;
			((Class10) this).aByteArray161 = is_82_;
		}
		int i_85_ = ((Class10) this).anInt162;
		((Class10) this).anInt162 = ((Class10) this).anInt158;
		((Class10) this).anInt158 = ((Class10) this).anInt163;
		((Class10) this).anInt163 = ((Class10) this).anInt159;
		((Class10) this).anInt159 = ((Class10) this).anInt162;
		i_85_ = ((Class10) this).anInt155;
		((Class10) this).anInt155 = ((Class10) this).anInt156;
		((Class10) this).anInt156 = i_85_;
	}

	final void method123() {
		byte[] is = ((Class10) this).aByteArray157;
		if (((Class10) this).aByteArray161 == null) {
			for (int i = (((Class10) this).anInt155 >> 1) - 1; i >= 0; i--) {
				int i_86_ = i * ((Class10) this).anInt156;
				int i_87_ = ((((Class10) this).anInt155 - i - 1) * ((Class10) this).anInt156);
				for (int i_88_ = -((Class10) this).anInt156; i_88_ < 0; i_88_++) {
					byte i_89_ = is[i_86_];
					is[i_86_] = is[i_87_];
					is[i_87_] = i_89_;
					i_86_++;
					i_87_++;
				}
			}
		} else {
			byte[] is_90_ = ((Class10) this).aByteArray161;
			for (int i = (((Class10) this).anInt155 >> 1) - 1; i >= 0; i--) {
				int i_91_ = i * ((Class10) this).anInt156;
				int i_92_ = ((((Class10) this).anInt155 - i - 1) * ((Class10) this).anInt156);
				for (int i_93_ = -((Class10) this).anInt156; i_93_ < 0; i_93_++) {
					byte i_94_ = is[i_91_];
					is[i_91_] = is[i_92_];
					is[i_92_] = i_94_;
					i_94_ = is_90_[i_91_];
					is_90_[i_91_] = is_90_[i_92_];
					is_90_[i_92_] = i_94_;
					i_91_++;
					i_92_++;
				}
			}
		}
		int i = ((Class10) this).anInt162;
		((Class10) this).anInt162 = ((Class10) this).anInt163;
		((Class10) this).anInt163 = i;
	}

	final void method124() {
		int i = method126();
		int i_95_ = method127();
		if (((Class10) this).anInt156 != i || ((Class10) this).anInt155 != i_95_) {
			byte[] is = new byte[i * i_95_];
			if (((Class10) this).aByteArray161 != null) {
				byte[] is_96_ = new byte[i * i_95_];
				for (int i_97_ = 0; i_97_ < ((Class10) this).anInt155; i_97_++) {
					int i_98_ = i_97_ * ((Class10) this).anInt156;
					int i_99_ = ((i_97_ + ((Class10) this).anInt162) * i + ((Class10) this).anInt158);
					for (int i_100_ = 0; i_100_ < ((Class10) this).anInt156; i_100_++) {
						is[i_99_] = ((Class10) this).aByteArray157[i_98_];
						is_96_[i_99_++] = ((Class10) this).aByteArray161[i_98_++];
					}
				}
				((Class10) this).aByteArray161 = is_96_;
			} else {
				for (int i_101_ = 0; i_101_ < ((Class10) this).anInt155; i_101_++) {
					int i_102_ = i_101_ * ((Class10) this).anInt156;
					int i_103_ = ((i_101_ + ((Class10) this).anInt162) * i + ((Class10) this).anInt158);
					for (int i_104_ = 0; i_104_ < ((Class10) this).anInt156; i_104_++)
						is[i_103_++] = ((Class10) this).aByteArray157[i_102_++];
				}
			}
			((Class10) this).anInt158 = ((Class10) this).anInt159 = ((Class10) this).anInt162 = ((Class10) this).anInt163 = 0;
			((Class10) this).anInt156 = i;
			((Class10) this).anInt155 = i_95_;
			((Class10) this).aByteArray157 = is;
		}
	}

	static final Class10[] method125(Class_fs class_fs, int i) {
		byte[] is = class_fs.method109(i, -1);
		if (is == null)
			return null;
		return method117(is);
	}

	final int method126() {
		return (((Class10) this).anInt156 + ((Class10) this).anInt158 + ((Class10) this).anInt159);
	}

	final int method127() {
		return (((Class10) this).anInt155 + ((Class10) this).anInt162 + ((Class10) this).anInt163);
	}

	final void method128(int i) {
		int i_105_ = method126();
		int i_106_ = method127();
		if (((Class10) this).anInt156 != i_105_ || ((Class10) this).anInt155 != i_106_) {
			int i_107_ = i;
			if (i_107_ > ((Class10) this).anInt158)
				i_107_ = ((Class10) this).anInt158;
			int i_108_ = i;
			if (i_108_ + ((Class10) this).anInt158 + ((Class10) this).anInt156 > i_105_)
				i_108_ = (i_105_ - ((Class10) this).anInt158 - ((Class10) this).anInt156);
			int i_109_ = i;
			if (i_109_ > ((Class10) this).anInt162)
				i_109_ = ((Class10) this).anInt162;
			int i_110_ = i;
			if (i_110_ + ((Class10) this).anInt162 + ((Class10) this).anInt155 > i_106_)
				i_110_ = (i_106_ - ((Class10) this).anInt162 - ((Class10) this).anInt155);
			int i_111_ = ((Class10) this).anInt156 + i_107_ + i_108_;
			int i_112_ = ((Class10) this).anInt155 + i_109_ + i_110_;
			byte[] is = new byte[i_111_ * i_112_];
			if (((Class10) this).aByteArray161 == null) {
				for (int i_113_ = 0; i_113_ < ((Class10) this).anInt155; i_113_++) {
					int i_114_ = i_113_ * ((Class10) this).anInt156;
					int i_115_ = (i_113_ + i_109_) * i_111_ + i_107_;
					for (int i_116_ = 0; i_116_ < ((Class10) this).anInt156; i_116_++)
						is[i_115_++] = ((Class10) this).aByteArray157[i_114_++];
				}
			} else {
				byte[] is_117_ = new byte[i_111_ * i_112_];
				for (int i_118_ = 0; i_118_ < ((Class10) this).anInt155; i_118_++) {
					int i_119_ = i_118_ * ((Class10) this).anInt156;
					int i_120_ = (i_118_ + i_109_) * i_111_ + i_107_;
					for (int i_121_ = 0; i_121_ < ((Class10) this).anInt156; i_121_++) {
						is_117_[i_120_] = ((Class10) this).aByteArray161[i_119_];
						is[i_120_++] = ((Class10) this).aByteArray157[i_119_++];
					}
				}
				((Class10) this).aByteArray161 = is_117_;
			}
			((Class10) this).anInt158 -= i_107_;
			((Class10) this).anInt162 -= i_109_;
			((Class10) this).anInt159 -= i_108_;
			((Class10) this).anInt163 -= i_110_;
			((Class10) this).anInt156 = i_111_;
			((Class10) this).anInt155 = i_112_;
			((Class10) this).aByteArray157 = is;
		}
	}

	static final Class10[] method129(Class_fs class_fs, int i, int i_122_) {
		byte[] is = class_fs.method91(i_122_, i, 104);
		if (is == null)
			return null;
		return method117(is);
	}

	static final Class10 method130(Class_fs class_fs, int i) {
		byte[] is = class_fs.method109(i, -1);
		if (is == null)
			return null;
		return method117(is)[0];
	}

	public Class10() {
		/* empty */
	}
}
