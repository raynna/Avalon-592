package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 11:26 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class JumpNode extends AstNode {
    private String target;

    public JumpNode(String address) {
        target = address;
    }

    public String getTarget() {
        return target;
    }

    public String toString(){
        return "goto "+target+";";
    }
}
