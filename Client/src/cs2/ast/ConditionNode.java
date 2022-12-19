package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 11:46 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class ConditionNode extends AstNode {
    private String operator;

    public ConditionNode(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }


}
