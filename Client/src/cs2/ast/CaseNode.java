package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 9:37 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class CaseNode extends AstNode{
    private int condition;

    public CaseNode(int condition) {
        this.condition = condition;
    }

    public int getCondition() {
        return condition;
    }

    public String toString(){
        return "case "+condition+":\n\t"+children.get(0).toString()+"\n";
    }
}
