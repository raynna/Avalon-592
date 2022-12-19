import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;

public final class NativeLibraryManager {

	public static Class_fs nativeLibraryFS;

	public static Hashtable<String, File> nativeHashTable = new Hashtable<String, File>();

	public static final int writeNativeLibrary(String name) {

		if (nativeHashTable.contains(name))
			return 100;

		String extension = getLibExtension(name);

		if (extension == null) {
			return -1;
		}

		String fullPath = Signlink.osAndCPUArchitecture + extension;

		if (!nativeLibraryFS.test("", fullPath)) {
			return -1;
		}

		if (!nativeLibraryFS.method90(-1, fullPath)) {
			int loaded = nativeLibraryFS.method100(fullPath, (byte) 33);
			return loaded;
		}

		byte[] cachedLibraryData = nativeLibraryFS.method96(fullPath, false, "");

		File library = Signlink.method343(extension, false);
		if (cachedLibraryData != null && library != null) {
			boolean libraryIsValid = true;
			byte[] libraryFileData = getDataFromFile(library);
			/* Verifies the library file(if it exists) with the one in the cache */
			if (libraryFileData != null && libraryFileData.length == cachedLibraryData.length) {
				for (int index = 0; libraryFileData.length > index; index++) {
					if (cachedLibraryData[index] != libraryFileData[index]) {
						libraryIsValid = false;
						break;
					}
				}
			} else {
				libraryIsValid = false;
			}
			if (!libraryIsValid) {
				try {
					// writes the native libraries
					FileOutputStream out = new FileOutputStream(library);
					out.write(cachedLibraryData, 0, cachedLibraryData.length);
					out.close();
				} catch (Throwable e) {
					return -1;
				}
			}
			cacheNativeFile(name, library);
			return 100;
		}
		return -1;
	}

	public static final void cacheNativeFile(String string, File file) {
		nativeHashTable.put(string, file);
	}

	public static void clean() {
		nativeHashTable = null;
		nativeLibraryFS = null;

	}

	public static final void setOSAndArch() {
		String string = "";
		if (Signlink.osName.startsWith("win") || Signlink.osName.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Signlink.osName.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Signlink.osName.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Signlink.osArch.startsWith("amd64") || Signlink.osArch.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Signlink.osArch.startsWith("i386") || Signlink.osArch.startsWith("i486") || Signlink.osArch.startsWith("i586") || Signlink.osArch.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Signlink.osArch.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		Signlink.osAndCPUArchitecture = string;
	}

	private static final String getLibExtension(String string) {
		try {
			if (Signlink.osName.startsWith("win"))
				return new StringBuilder().append(string).append(".dll").toString();
			if (Signlink.osName.startsWith("linux"))
				return new StringBuilder().append("lib").append(string).append(".so").toString();
			if (Signlink.osName.startsWith("mac"))
				return new StringBuilder().append("lib").append(string).append(".jnilib").toString();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw new RuntimeException();
		}
	}

	private static final byte[] getDataFromFile(File file) {
		return getDataFromFile(file, (int) file.length());
	}

	private static final byte[] getDataFromFile(File file, int length) {
		try {
			byte[] data = new byte[length];
			readFile(data, length, file);
			return data;
		} catch (IOException ioexception) {
			return null;
		}
	}

	private static final void readFile(byte[] data, int length, File file) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(data, 0, length);
		} catch (EOFException eofexception) {
		}
		datainputstream.close();
	}
}
