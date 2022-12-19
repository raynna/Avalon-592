package cs2;

import java.util.HashMap;
import java.util.LinkedList;

import cs2.ast.BodyNode;
import cs2.ast.JumpNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 10:53 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2DecompileState {
    private Object executable;
    private LinkedList<Cs2Variable> localVariables = new LinkedList<Cs2Variable>();
    private AstNode astTree = new BodyNode();
    private static HashMap<Integer,AstNode> targetNodes = new HashMap<Integer, AstNode>();
    private HashMap<Integer, String> labels = new HashMap<Integer, String>();
    public int instructionCounter;

    public Cs2DecompileState(Object executable) {
        this.executable = executable;
    }

    public static HashMap<Integer, AstNode> getTargetNodes() {
        return targetNodes;
    }

    public AstNode getTargetNode(int address,int curAddress){
        if (targetNodes.containsKey(address)){
            return targetNodes.get(address);
        } else if (address >= curAddress){
            BodyNode n = new BodyNode();
            targetNodes.put(address,n);
            return n;
        } else {
            if (!labels.containsKey(address))
                labels.put(address,"label"+labels.size());
            return new JumpNode(labels.get(address));
        }
    }

    public Cs2Variable getLocalVariable(int id,Cs2Type type){
        Cs2Variable variable = new Cs2Variable(type,Cs2Scope.LOCAL,id);
        if (localVariables.contains(variable))
            return localVariables.get(localVariables.indexOf(variable));
        variable.setName("aLocal"+type+localVariables.size());
        localVariables.add(variable);
        return variable;
    }

    public AstNode getAstTree() {
        return astTree;
    }

    public LinkedList<Cs2Variable> getLocalVariables() {
        return localVariables;
    }

    public Object getExecutable() {
        return executable;
    }

    public int getInstructionCounter() {
        return instructionCounter;
    }

    public HashMap<Integer,String> getLabels() {
        return labels;
    }
}

