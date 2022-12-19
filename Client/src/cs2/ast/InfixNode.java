package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 10:00 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class InfixNode extends AstNode {
    private String operator;

    public InfixNode(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public String toString(){
        return "(" + children.get(0).toString() + operator + children.get(1).toString() + ")";
    }
}
