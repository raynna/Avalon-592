package cs2.ast;

import cs2.AstNode;
import cs2.Cs2Variable;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 10:21 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class InstantiationNode extends AstNode {
    private Cs2Variable variable;

    public InstantiationNode(Cs2Variable variable) {
        this.variable = variable;
    }

    public Cs2Variable getVariable() {
        return variable;
    }

    public String toString(){
        return variable.getName() + " = new int["+children.get(0)+"]{"+children.get(1)+"}";
    }
}
