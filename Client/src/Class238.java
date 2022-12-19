/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class238 {
	boolean aBool3335;
	int anInt3336;
	boolean aBool3337;
	byte aByte3338;
	boolean aBool3339;
	boolean aBool3340;
	int anInt3341;
	byte aByte3342;
	byte aByte3343;
	byte aByte3344;
	byte aByte3345;
	static Class12 REMOVE_GROUND_ITEM;
	boolean aBool3347;
	boolean aBool3348;
	byte aByte3349;
	byte aByte3350;
	static Class205 aClass205_3351;
	boolean aBool3352;
	boolean aBool3353;
	short aShort3354;
	static int anInt3355;
	boolean aBool3356;
	static int anInt3357;
	static Class92 aClass92_3358;
	static boolean aBool3359;
	static Class102 aClass102_3360;
	static boolean aBool3361;

	public static void method1532(int i) {
		try {
			aClass205_3351 = null;
			aClass92_3358 = null;
			if (i != 0)
				aClass92_3358 = null;
			aClass102_3360 = null;
			REMOVE_GROUND_ITEM = null;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, "vf.A(" + i + ')');
		}
	}

	static final void method1533(int i, boolean bool, boolean bool_0_, int i_1_) {
		try {
			anInt3357++;
			if (i < 8000 || (i ^ 0xffffffff) < -48001)
				throw new IllegalArgumentException();
			Class175.anInt2475 = i_1_;
			if (bool_0_ != false)
				aClass102_3360 = null;
			Class140.anInt2024 = i;
			Class240.aBool3387 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vf.C(" + i + ',' + bool + ',' + bool_0_ + ',' + i_1_ + ')'));
		}
	}

	public Class238() {
		/* empty */
	}

	static final String method1534(int i, boolean bool, Class235 class235) {
		try {
			anInt3355++;
			if (!client.method2971(class235).method2120(i, 1) && ((Class235) class235).anObjectArray3236 == null)
				return null;
			if (((Class235) class235).aStringArray3268 == null || (((Class235) class235).aStringArray3268.length ^ 0xffffffff) >= (i ^ 0xffffffff) || ((Class235) class235).aStringArray3268[i] == null || (((Class235) class235).aStringArray3268[i].trim().length() == 0)) {
				if (Class_v.aBool1452)
					return "Hidden-" + i;
				return null;
			}
			if (bool != false)
				aBool3361 = true;
			return ((Class235) class235).aStringArray3268[i];
		} catch (RuntimeException runtimeexception) {
			throw Class193.method1272(runtimeexception, ("vf.B(" + i + ',' + bool + ',' + (class235 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		new Class67("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'int\u00e9ressant.", "Nada de interessante acontece.");
		REMOVE_GROUND_ITEM = new Class12(8, 3);
		aClass205_3351 = new Class205("WTWIP", 3);
		new Class67("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
		aBool3359 = false;
		aBool3361 = false;
		new Class67("Use", "Benutzen", "Utiliser", "Usar");
	}
}
