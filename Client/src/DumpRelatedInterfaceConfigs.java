import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class DumpRelatedInterfaceConfigs {

	private static File file = new File("i_configs/");

	public static final void dump(int interId) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PrintStream p = null;
		try {
			p = new PrintStream(file.getPath() + "/" + interId + ".txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (CS2Script l : getLinkedScripts(interId)) {
			Cs2Excecutable ex = new Cs2Excecutable(l, false);

			try {

				p.println(ex.disassemble(true));

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		p.flush();
		p.close();

	}

	private static List<CS2Script> getLinkedScripts(int interfaceId) {
		List<CS2Script> linkedScripts = new ArrayList<CS2Script>();
		for (int id = 0; id < 2913; id++) {
			CS2Script script = Class113.getScript(id, 100);
			if (script.getLinkedInterfaces().contains(interfaceId)) {
				linkedScripts.add(script);
			}
		}
		return linkedScripts;
	}
}
