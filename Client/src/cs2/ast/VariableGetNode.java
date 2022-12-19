package cs2.ast;

import cs2.AstNode;
import cs2.Cs2Variable;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 9:55 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class VariableGetNode extends AstNode {
    private Cs2Variable variable;

    public VariableGetNode(Cs2Variable variable) {
        this.variable = variable;
    }

    public Cs2Variable getVariable() {
        return variable;
    }

    public String toString(){
        if (children.isEmpty())
            return variable.getName();
        else
            return variable.getName() + "["  + children.get(0).toString() + "]";
    }
}
