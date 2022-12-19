import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public final class NativeLibraryLoader {

	static Class aClass544;
	static Class aClass8466;

	static Hashtable<String, Class<Class_e>> idk1 = new Hashtable<>();

	static final boolean loadNative(String string) {
		return method454((aClass544 != null ? aClass544 : (aClass544 = method555("Class_e"))), string);
	}

	static final boolean method454(Class var_class, String string) {
		Class var_class_0_ = (Class) idk1.get(string);
		if (var_class_0_ != null) {
			if (var_class_0_.getClassLoader() != var_class.getClassLoader())
				return false;
			return true;
		}

		Object object = null;
		File file = (File) NativeLibraryManager.nativeHashTable.get(string);
		if (file != null) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_1_ = Class.forName("java.lang.Runtime");
				Class var_class_2_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_2_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_3_ = (var_class_1_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_3_, new Object[] { Boolean.TRUE });
				method_3_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_3_, new Object[] { Boolean.FALSE });
				idk1.put(string, var_class);
				return true;
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				idk1.put(string, (aClass8466 != null ? aClass8466 : (aClass8466 = method555("Class_e"))));
				return true;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				/* empty */
			}
		}
		return false;

	}

	static final boolean finalizeNatives() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = idk1.keys();
		while (enumeration.hasMoreElements()) {
			Object object = enumeration.nextElement();
			hashtable.put(object, idk1.get(object));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_2_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_2_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = idk1.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) NativeLibraryManager.nativeHashTable.get(string);
						Class var_class_3_ = (Class) idk1.get(string);
						Vector vector = ((Vector) field.get(var_class_3_.getClassLoader()));
						for (int i_4_ = 0; i_4_ < vector.size(); i_4_++) {
							try {
								Object object = vector.elementAt(i_4_);
								Field field_5_ = object.getClass().getDeclaredField("name");
								method.invoke(field_5_, new Object[] { Boolean.TRUE });
								try {
									String string_6_ = (String) field_5_.get(object);
									if (string_6_ != null && (string_6_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_7_ = object.getClass().getDeclaredField("handle");
										Method method_8_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_7_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_8_, (new Object[] { Boolean.TRUE }));
										try {
											method_8_.invoke(object, new Object[0]);
											field_7_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_8_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_7_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_5_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		idk1 = hashtable;
		return idk1.isEmpty();
	}

	public static final void clean() {
		idk1 = null;
	}

	/* synthetic */
	static Class<?> method555(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
