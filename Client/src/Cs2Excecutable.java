import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import cs2.Cs2ByteCode;
import cs2.Cs2Instruction;

/**
 * Created by IntelliJ IDEA. User: Peter Date: 1/22/11 Time: 8:50 PM Computer: Peterbjornx-PC.rootdomain.asn.local
 * (192.168.178.27)
 */
public class Cs2Excecutable {
	private String name;
	private long id;
	private HashMap<Long, Integer>[] cases;
	private Cs2Signature signature;
	private int integerVariableCount;
	private int stringVariableCount;
	private Cs2Instruction instructions[];

	private File asmFolder = new File("./cs2asm/");

	public Cs2Excecutable(CS2Script script, boolean disassembleDump) {
		name = script.name;
		id = script.hash;
		signature = new Cs2Signature(script.integerArgumentCount, script.stringArgumentCount, 0, 0);
		integerVariableCount = script.integerVariableCount;
		stringVariableCount = script.stringVariableCount;
		if (script.switchBlocks != null) {
			cases = new HashMap[script.switchBlocks.length];
			Class85[] switchBlocks = script.switchBlocks;
			for (int i = 0, switchBlocksLength = switchBlocks.length; i < switchBlocksLength; i++) {
				Class85 switchBlock = switchBlocks[i];
				cases[i] = new HashMap<Long, Integer>();
				for (IntegerNode req = (IntegerNode) switchBlock.first((byte) -23); req != null; req = ((IntegerNode) switchBlock.next((byte) -20)))
					cases[i].put(req.hash, req.value);
			}
		}
		instructions = new Cs2Instruction[script.opcodes.length];
		for (int i1 = 0, opcodesLength = script.opcodes.length; i1 < opcodesLength; i1++)
			instructions[i1] = new Cs2Instruction(script.opcodes[i1], script.integerOperands == null ? -1 : script.integerOperands[i1],

					script.stringOperands == null ? null : script.stringOperands[i1]);

		if (disassembleDump) {
			if (!asmFolder.exists()) {
				try {
					asmFolder.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				PrintStream p = new PrintStream("./cs2asm/" + toString() + ".txt");
				p.println(disassemble(false));
				p.flush();
				p.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public String disassemble(boolean dumpConfigs) {
		StringBuilder b = new StringBuilder();
		b.append(toString()).append("(").append(signature.toAsmParList()).append(")\n");
		HashMap<Integer, String> labels = new HashMap<Integer, String>();
		for (int i = 0, instructionsLength = instructions.length; i < instructionsLength; i++) {
			Cs2Instruction instr = instructions[i];
			int opcode = instr.getOpcode();
			if ((opcode >= 6 && opcode <= 10) || (opcode >= 68 && opcode <= 73) || opcode == 86 || opcode == 87 || opcode == 31 || opcode == 32) {
				if (!labels.containsKey(i + 1 + instr.getIntOperand()))
					labels.put(i + 1 + instr.getIntOperand(), "label" + labels.size());
			} else if (opcode == 51) {
				HashMap<Long, Integer> switchs = cases[instr.getIntOperand()];
				for (long l : switchs.keySet()) {
					labels.put(i + 1 + switchs.get(l), "switch" + instr.getIntOperand() + "case" + l);
				}
			}
		}
		if (dumpConfigs) {
			for (int i = 0, instructionsLength = instructions.length; i < instructionsLength; i++) {
				Cs2Instruction instr = instructions[i];

				int opcode = instr.getOpcode();

				if (opcode == 42 || opcode == 43 || opcode == 1 || opcode == 2 || opcode == 25 || opcode == 26 || opcode == 47 || opcode == 48) {
					b.append("\t");
					b.append(instr.toString());
					b.append("\n");
				}
			}
		} else {

			for (int i = 0, instructionsLength = instructions.length; i < instructionsLength; i++) {
				Cs2Instruction instr = instructions[i];
				if (labels.containsKey(i))
					b.append(labels.get(i)).append(":\n");
				int opcode = instr.getOpcode();
				b.append("\t");
				if ((opcode >= 6 && opcode <= 10) || (opcode >= 68 && opcode <= 73) || opcode == 86 || opcode == 87 || opcode == 31 || opcode == 32)
					b.append(Cs2ByteCode.name(opcode)).append(" ").append(labels.get(i + 1 + instr.getIntOperand()));
				else
					b.append(instr.toString());
				b.append("\n");
			}
		}
		return b.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public HashMap<Long, Integer>[] getCases() {
		return cases;
	}

	public void setCases(HashMap<Long, Integer>[] cases) {
		this.cases = cases;
	}

	public Cs2Signature getSignature() {
		return signature;
	}

	public void setSignature(Cs2Signature signature) {
		this.signature = signature;
	}

	public int getIntegerVariableCount() {
		return integerVariableCount;
	}

	public void setIntegerVariableCount(int integerVariableCount) {
		this.integerVariableCount = integerVariableCount;
	}

	public int getStringVariableCount() {
		return stringVariableCount;
	}

	public void setStringVariableCount(int stringVariableCount) {
		this.stringVariableCount = stringVariableCount;
	}

	public Cs2Instruction[] getInstructions() {
		return instructions;
	}

	public String toString() {
		return name == null ? ("function" + id) : name;
	}
}
