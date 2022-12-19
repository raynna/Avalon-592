import cs2.*;
import cs2.ast.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA. User: Peter Date: 1/22/11 Time: 8:42 PM Computer: Peterbjornx-PC.rootdomain.asn.local
 * (192.168.178.27)
 */
public class Cs2Decompiler {
	private static Stack<AstNode> integerStack = new Stack<AstNode>();
	private static Stack<AstNode> stringStack = new Stack<AstNode>();
	private static Stack<Cs2DecompileState> callStack = new Stack<Cs2DecompileState>();
	private static LinkedList<Cs2Variable> globalVariables = new LinkedList<Cs2Variable>();
	private static LinkedList<Cs2Variable> configVariables = new LinkedList<Cs2Variable>();
	private static LinkedList<Cs2DecompileState> functions = new LinkedList<Cs2DecompileState>();

	public static void decompile(CS2Script script) {
		executeScript(new Cs2Excecutable(script, true));

		// for (Cs2DecompileState s : functions) {
		// try {
		// PrintStream p = new PrintStream("./scripts/"
		// + s.getExecutable().toString() + ".cs2");
		// for (Cs2Variable v : s.getLocalVariables())
		// p.println(v.getType().toString().toLowerCase() + " "
		// + v.getName() + "@" + v.getId());
		// for (Cs2Variable v : globalVariables)
		// p.println("global " + v.getType().toString().toLowerCase()
		// + " " + v.getName() + "@" + v.getId());
		// for (Cs2Variable v : configVariables)
		// p.println("config " + v.getType().toString().toLowerCase()
		// + " " + v.getName() + "@" + v.getId());
		// p.println("\nvoid "
		// + ((Cs2Excecutable) s.getExecutable()).toString()
		// + "("
		// + ((Cs2Excecutable) s.getExecutable()).getSignature()
		// .toParList(s) + "){");
		// p.println(s.getAstTree());
		// p.println("}");
		// p.flush();
		// p.close();
		// } catch (Exception e) {
		// e.printStackTrace(); // To change body of catch statement use
		// // File | Settings | File Templates.
		// }
		// }
		functions.clear();
		globalVariables.clear();
		configVariables.clear();
		integerStack.clear();
		stringStack.clear();
		callStack.clear();
	}

	private static void executeScript(Cs2Excecutable excecutingScript) {
		int instructionCounter = -1;
		int opcode = -1;
		Cs2Instruction instruction;
		Cs2Instruction instructions[] = excecutingScript.getInstructions();
		Cs2DecompileState currentDecompileState = new Cs2DecompileState(excecutingScript);
		try {
			for (;;) {
				instruction = instructions[++instructionCounter];
				opcode = instruction.getOpcode();
				if (currentDecompileState.getLabels().containsKey(instructionCounter))
					currentDecompileState.getAstTree().addChild(new LabelNode(currentDecompileState.getLabels().get(instructionCounter)));

				if (opcode < 150) {
					switch (opcode) {

					case 0:
						integerStack.push(new ConstantNode(instruction.getIntOperand()));
						break;
					case 1:
						integerStack.push(new VariableGetNode(getConfigVariable(instruction.getIntOperand(), Cs2Type.Int)));
						break;
					case 2:
						VariableSetNode vsn = new VariableSetNode(getConfigVariable(instruction.getIntOperand(), Cs2Type.Int));
						vsn.addChild(integerStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 3:
						stringStack.push(new ConstantNode(instruction.getStringOperand()));
						break;
					case 6:
						currentDecompileState.getAstTree().addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));

						break;
					case 7:
						InfixNode con = new InfixNode("!=");
						AstNode conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						ConditionalNode blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 8:
						con = new InfixNode("==");
						conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 9:
						con = new InfixNode("<");
						conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
					case 10:
						con = new InfixNode(">");
						conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 21: {
						currentDecompileState.getAstTree().addChild(new ReturnNode());
						functions.add(currentDecompileState);
						if (callStack.empty())
							return;
						currentDecompileState = callStack.pop();
						excecutingScript = (Cs2Excecutable) currentDecompileState.getExecutable();
						instructions = excecutingScript.getInstructions();
						instructionCounter = currentDecompileState.getInstructionCounter();
						break;
					}
					case 25:
						integerStack.push(new VariableGetNode(getConfigVariable(instruction.getIntOperand(), Cs2Type.Varbit)));
						break;
					case 27:
						vsn = new VariableSetNode(getConfigVariable(instruction.getIntOperand(), Cs2Type.Varbit));
						vsn.addChild(integerStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 31:
						con = new InfixNode("<=");
						conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 32:
						con = new InfixNode(">=");
						conOp2 = integerStack.pop();
						con.addChild(integerStack.pop());
						con.addChild(conOp2);
						blk = new ConditionalNode();
						blk.addChild(con);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 33:
						integerStack.push(new VariableGetNode(currentDecompileState.getLocalVariable(instruction.getIntOperand(), Cs2Type.Int)));
						break;
					case 34:
						vsn = new VariableSetNode(currentDecompileState.getLocalVariable(instruction.getIntOperand(), Cs2Type.Int));
						vsn.addChild(integerStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 35:
						stringStack.push(new VariableGetNode(currentDecompileState.getLocalVariable(instruction.getIntOperand(), Cs2Type.String)));
						break;
					case 36:
						vsn = new VariableSetNode(currentDecompileState.getLocalVariable(instruction.getIntOperand(), Cs2Type.String));
						vsn.addChild(stringStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 37: {
						int count = instruction.getIntOperand();
						BuiltinNode b = new BuiltinNode("cat");
						Stack<AstNode> tempStack = new Stack<AstNode>();
						for (int pV = 0; pV < count; pV++)
							tempStack.push(stringStack.pop());
						for (int pV = 0; pV < count; pV++)
							b.addChild(tempStack.pop());
						stringStack.push(b);
						break;
					}
					case 38:
						integerStack.pop();
						break;
					case 39:
						stringStack.pop();
						break;
					case 40: {
						int calleeId = instruction.getIntOperand();
						CS2Script callee = Class113.getScript(calleeId, 50);
						if (callee == null)
							throw new RuntimeException();
						currentDecompileState.instructionCounter = instructionCounter;
						callStack.push(currentDecompileState);
						excecutingScript = new Cs2Excecutable(callee, true);
						currentDecompileState = new Cs2DecompileState(excecutingScript);
						instructions = excecutingScript.getInstructions();
						instructionCounter = -1;
						CallNode cn = new CallNode(excecutingScript.toString());
						Stack<AstNode> tempStack = new Stack<AstNode>();
						for (int pV = 0; pV < excecutingScript.getSignature().getIntegerParameters(); pV++)
							tempStack.push(integerStack.pop());
						for (int pV = 0; pV < excecutingScript.getSignature().getIntegerParameters(); pV++)
							cn.addChild(tempStack.pop());
						for (int pV = 0; pV < excecutingScript.getSignature().getStringParameters(); pV++)
							tempStack.push(stringStack.pop());
						for (int pV = 0; pV < excecutingScript.getSignature().getStringParameters(); pV++)
							cn.addChild(tempStack.pop());
						currentDecompileState.getAstTree().addChild(cn);
						break;
					}
					case 42:
						integerStack.push(new VariableGetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.Int)));
						break;
					case 43:
						vsn = new VariableSetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.Int));
						vsn.addChild(integerStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 44:
						int operandHigh = instruction.getIntOperand() >> 16;
						int operandLow = instruction.getIntOperand() & 0xffff;
						InstantiationNode in = new InstantiationNode(getGlobalVariable(operandHigh, Cs2Type.Array));
						in.addChild(integerStack.pop());
						if (operandLow == 105)
							in.addChild(new ConstantNode(0));
						else
							in.addChild(new ConstantNode(-1));
						currentDecompileState.getAstTree().addChild(in);
						break;
					case 45: {
						VariableGetNode vgn = new VariableGetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.Array));
						vgn.addChild(integerStack.pop());
						integerStack.push(vgn);
						break;
					}
					case 46: {
						vsn = new VariableSetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.Array));
						vsn.addChild(integerStack.pop());
						vsn.addChild(integerStack.pop());
						integerStack.push(vsn);
						break;
					}
					case 47: {
						stringStack.push(new VariableGetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.String)));
						break;
					}
					case 48:
						vsn = new VariableSetNode(getGlobalVariable(instruction.getIntOperand(), Cs2Type.String));
						vsn.addChild(stringStack.pop());
						currentDecompileState.getAstTree().addChild(vsn);
						break;
					case 51:
						SwitchNode sn = new SwitchNode();
						sn.addChild(integerStack.pop());
						HashMap<Long, Integer> caseStatements = excecutingScript.getCases()[instruction.getIntOperand()];
						for (long label : caseStatements.keySet()) {
							CaseNode cn = new CaseNode((int) label);
							cn.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + caseStatements.get(label), 999999));
							sn.addChild(cn);
						}
						currentDecompileState.getAstTree().addChild(sn);
						break;

					case 86:
						PostfixNode conz = new PostfixNode("== 1");
						conz.addChild(integerStack.pop());
						blk = new ConditionalNode();
						blk.addChild(conz);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;
					case 87:
						conz = new PostfixNode("== 0");
						conz.addChild(integerStack.pop());
						blk = new ConditionalNode();
						blk.addChild(conz);
						blk.addChild(currentDecompileState.getTargetNode(instructionCounter + 1 + instruction.getIntOperand(), 999999));
						currentDecompileState.getAstTree().addChild(blk);
						break;

					}
				} else {
					boolean anLocalBoolean;
					if (instruction.getIntOperand() == 1)
						anLocalBoolean = true;
					else
						anLocalBoolean = false;
					if (opcode >= 150 && opcode < 5000) {
						if (opcode < 300) {
							InterfaceNode ino = new InterfaceNode(anLocalBoolean ? "interfaceA" : "interfaceB");
							if (opcode == 150) {// cc_create
								AstNode index = integerStack.pop();
								AstNode type = integerStack.pop();
								AstNode idHash = integerStack.pop();
								BuiltinNode node = new BuiltinNode("createChildInterface");
								InterfaceStoreNode isn = new InterfaceStoreNode(true);
								isn.addChild(idHash);
								node.addChild(type);
								node.addChild(index);
								InfixNode inf = new InfixNode(".");
								inf.addChild(isn);
								inf.addChild(node);
								InfixNode inf2 = new InfixNode("=");
								inf2.addChild(ino);
								inf2.addChild(inf);
								currentDecompileState.getAstTree().addChild(inf2);
							} else if (opcode == 151) {// cc_delete
								InfixNode inf = new InfixNode(".");
								BuiltinNode node = new BuiltinNode("delete");
								inf.addChild(ino);
								inf.addChild(node);
								currentDecompileState.getAstTree().addChild(inf);
							} else if (opcode == 152) { // cc_delete_all
								InterfaceStoreNode isn = new InterfaceStoreNode(true);
								isn.addChild(integerStack.pop());
								InfixNode inf = new InfixNode(".");
								inf.addChild(isn);
								inf.addChild(new BuiltinNode("deleteAllDynamicChildren"));
								currentDecompileState.getAstTree().addChild(inf);
							} else if (opcode == 200) { // cc_load
								AstNode index = integerStack.pop(); // interfaceA
																	// =
																	// interfaceStore[id].getDynamicChild(cid)
								AstNode idHash = integerStack.pop();
								BuiltinNode node = new BuiltinNode("getChild");
								node.addChild(index);
								InterfaceStoreNode isn = new InterfaceStoreNode(true);
								isn.addChild(idHash);
								InfixNode inf = new InfixNode(".");
								inf.addChild(isn);
								inf.addChild(node);
								InfixNode inf2 = new InfixNode("=");
								inf2.addChild(ino);
								inf2.addChild(inf);
								PostfixNode pf = new PostfixNode("!= null");
								pf.addChild(inf2);
								integerStack.push(pf);
							} else if (opcode == 201) { // if_load
								AstNode idHash = integerStack.pop();
								InterfaceStoreNode isn = new InterfaceStoreNode(true);
								isn.addChild(idHash);
								InfixNode inf2 = new InfixNode("=");
								inf2.addChild(ino);
								inf2.addChild(isn);
								PostfixNode pf = new PostfixNode("!= null");
								pf.addChild(inf2);
								integerStack.push(pf);
							} else if (opcode == 202) {
								integerStack.pop();
								// int anLocalInt =
								// integerStack[--integerStackCounter];
								// createCustomInterfacePTB(anLocalInt);
							} else if (opcode == 203) {
								integerStack.pop();
								// int anLocalInt =
								// integerStack[--integerStackCounter];
								// createCustomInterfacePTF(anLocalInt);
							}
							/*
							 * } else if (Cs2ByteCode.isSetter(opcode)){ //if_load InterfaceNode ino = new InterfaceNode(anLocalBoolean ? "interfaceA" :
							 * "interfaceB"); AstNode idHash = integerStack.pop(); InfixNode inf = new InfixNode("."); BuiltinNode node = new
							 * BuiltinNode("delete"); inf.addChild(ino); inf.addChild(node); currentDecompileState.getAstTree().addChild(inf);
							 */
						} else {
							functions.add(currentDecompileState);
							functions.addAll(callStack);
							return;
						}
					} else {
						if (opcode < 5000 || opcode >= 10000)
							break;
						functions.add(currentDecompileState);
						functions.addAll(callStack);
						return;
					}
				}
			}
			throw new IllegalStateException("Command: " + opcode);
		} catch (Exception exception) {
			if (excecutingScript.getName() != null) {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript decompiler error in: ").append(excecutingScript.getName()).append("\n");
				for (int callStackPointer = callStack.size(); callStackPointer >= 0; callStackPointer--)
					stringbuffer.append("via: ").append(callStack.pop()).append("\n");
				stringbuffer.append("Op: ").append(opcode).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0)
					stringbuffer.append("Message: ").append(string).append("\n");
				System.out.println("ERROR: " + stringbuffer.toString());
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2D: ").append(excecutingScript.getId()).append(" ");
				for (int callStackPointer = callStack.size() - 1; callStackPointer >= 0; callStackPointer--)
					stringbuffer.append("v: ").append(callStack.pop()).append(" ");
				stringbuffer.append("op: ").append(opcode);
				System.out.println("ERROR: " + stringbuffer.toString());
			}
		}
	}

	public static Cs2Variable getGlobalVariable(int id, Cs2Type type) {
		Cs2Variable variable = new Cs2Variable(type, Cs2Scope.LOCAL, id);
		if (globalVariables.contains(variable))
			return globalVariables.get(globalVariables.indexOf(variable));
		variable.setName("an" + type + globalVariables.size());
		globalVariables.add(variable);
		return variable;
	}

	public static Cs2Variable getConfigVariable(int id, Cs2Type type) {
		Cs2Variable variable = new Cs2Variable(type, Cs2Scope.LOCAL, id);
		if (configVariables.contains(variable))
			return configVariables.get(configVariables.indexOf(variable));
		variable.setName("aConfig" + type + configVariables.size());
		configVariables.add(variable);
		return variable;
	}

}
