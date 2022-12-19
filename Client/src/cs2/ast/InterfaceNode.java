package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 10:18 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class InterfaceNode extends AstNode {
    private String name;

    public InterfaceNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }
}
