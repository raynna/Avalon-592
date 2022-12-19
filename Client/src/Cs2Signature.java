import cs2.Cs2DecompileState;
import cs2.Cs2Type;

/**
 * Created by IntelliJ IDEA. User: Peter Date: 1/22/11 Time: 8:59 PM Computer: Peterbjornx-PC.rootdomain.asn.local
 * (192.168.178.27)
 */
public class Cs2Signature {
	private int integerParameters;
	private int stringParameters;
	private int integerResults;
	private int stringResults;

	public Cs2Signature(int integerParameters, int stringParameters, int integerResults, int stringResults) {
		this.integerParameters = integerParameters;
		this.stringParameters = stringParameters;
		this.integerResults = integerResults;
		this.stringResults = stringResults;
	}

	public int getIntegerParameters() {
		return integerParameters;
	}

	public int getStringParameters() {
		return stringParameters;
	}

	public int getIntegerResults() {
		return integerResults;
	}

	public int getStringResults() {
		return stringResults;
	}

	public String toParList(Cs2DecompileState s) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < integerParameters; i++)
			b.append("int " + s.getLocalVariable(i, Cs2Type.Int).getName() + ",");
		for (int i = 0; i < stringParameters; i++)
			b.append("string " + s.getLocalVariable(i, Cs2Type.String).getName() + ",");
		return b.toString();
	}

	public String toAsmParList() {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < integerParameters; i++)
			b.append("int local" + i + ",");
		for (int i = 0; i < stringParameters; i++)
			b.append("string local" + i + ",");
		return b.toString();
	}
}
