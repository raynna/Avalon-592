package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 11:48 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class LabelNode extends AstNode {
    private String label;

    public LabelNode(String label) {
        this.label = label;
    }

    public String toString(){
        return label + ":";
    }
}
