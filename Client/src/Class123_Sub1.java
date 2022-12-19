
/* Class123_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class123_Sub1 extends Class123 {
	private boolean aBool3994 = false;
	private SourceDataLine aSourceDataLine3995;
	private AudioFormat anAudioFormat3996;
	private byte[] aByteArray3997;
	private int anInt3998;
	static Class aClass3999;

	final void method831(int i) throws LineUnavailableException {
		try {
			try {
				DataLine.Info info = (new DataLine.Info((aClass3999 == null ? (aClass3999 = (getClassByName("javax.sound.sampled.SourceDataLine"))) : aClass3999), anAudioFormat3996, i << (Class240.aBool3387 ? 2 : 1)));
				aSourceDataLine3995 = (SourceDataLine) AudioSystem.getLine(info);
				aSourceDataLine3995.open();
				aSourceDataLine3995.start();
				anInt3998 = i;
			} catch (LineUnavailableException lineunavailableexception) {
				if (Class88.method557(i, 115) != 1)
					method831(Class206.method1350(i, 269173057));
				else {
					aSourceDataLine3995 = null;
					throw lineunavailableexception;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method839() {
		int i = 256;
		if (Class240.aBool3387)
			i <<= 1;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = ((Class123_Sub1) this).anIntArray1706[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0)
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			aByteArray3997[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray3997[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine3995.write(aByteArray3997, 0, i << 1);
	}

	final int method833() {
		int i;
		try {
			i = anInt3998 - (aSourceDataLine3995.available() >> (Class240.aBool3387 ? 2 : 1));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	final void method832(Component component) {
		try {
			Mixer.Info[] infos = AudioSystem.getMixerInfo();
			if (infos != null) {
				Mixer.Info[] infos_2_ = infos;
				for (int i = 0; (i ^ 0xffffffff) > (infos_2_.length ^ 0xffffffff); i++) {
					Mixer.Info info = infos_2_[i];
					if (null != info) {
						String string = info.getName();
						if (string != null && 0 <= string.toLowerCase().indexOf("soundmax"))
							aBool3994 = true;
					}
				}
			}
			anAudioFormat3996 = new AudioFormat((float) Class140.anInt2024, 16, !Class240.aBool3387 ? 1 : 2, true, false);
			aByteArray3997 = new byte[256 << (Class240.aBool3387 ? 2 : 1)];
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method838() throws LineUnavailableException {
		try {
			aSourceDataLine3995.flush();
			if (aBool3994) {
				aSourceDataLine3995.close();
				aSourceDataLine3995 = null;
				DataLine.Info info = (new DataLine.Info((aClass3999 == null ? (aClass3999 = (getClassByName("javax.sound.sampled.SourceDataLine"))) : aClass3999), anAudioFormat3996, anInt3998 << (!Class240.aBool3387 ? 1 : 2)));
				aSourceDataLine3995 = (SourceDataLine) AudioSystem.getLine(info);
				aSourceDataLine3995.open();
				aSourceDataLine3995.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method837() {
		try {
			if (null != aSourceDataLine3995) {
				aSourceDataLine3995.close();
				aSourceDataLine3995 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
